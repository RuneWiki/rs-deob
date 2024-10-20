package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("da")
public final class class113 {

    @ObfuscatedName("da.f")
    public RandomAccessFile field1496;

    @ObfuscatedName("da.l")
    public long field1492;

    @ObfuscatedName("da.w")
    public long field1493;

    public class113(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1496 = new RandomAccessFile(arg0, arg1);
        this.field1492 = arg2;
        this.field1493 = 0L;
        int var5 = this.field1496.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1496.seek(0L);
            this.field1496.write(var5);
        }
        this.field1496.seek(0L);
    }

    @ObfuscatedName("da.f(J)V")
    public final void method2380(long arg0) throws IOException {
        this.field1496.seek(arg0);
        this.field1493 = arg0;
    }

    @ObfuscatedName("da.l([BIII)V")
    public final void method2381(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1493 + (long) arg2 > this.field1492) {
            this.field1496.seek(this.field1492 + 1L);
            this.field1496.write(1);
            throw new EOFException();
        } else {
            this.field1496.write(arg0, arg1, arg2);
            this.field1493 += (long) arg2;
        }
    }

    @ObfuscatedName("da.w(I)V")
    public final void method2393() throws IOException {
        this.method2383(false);
    }

    @ObfuscatedName("da.s(ZI)V")
    public final void method2383(boolean arg0) throws IOException {
        if (this.field1496 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1496.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1496.close();
        this.field1496 = null;
    }

    @ObfuscatedName("da.e(B)J")
    public final long method2384() throws IOException {
        return this.field1496.length();
    }

    @ObfuscatedName("da.c([BIIS)I")
    public final int method2385(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1496.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1493 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1496 != null) {
            System.out.println("");
            this.method2393();
        }
    }
}
