package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("df")
public final class class113 {

    @ObfuscatedName("df.f")
    public RandomAccessFile field1479;

    @ObfuscatedName("df.h")
    public long field1478;

    @ObfuscatedName("df.e")
    public long field1480;

    public class113(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1479 = new RandomAccessFile(arg0, arg1);
        this.field1478 = arg2;
        this.field1480 = 0L;
        int var5 = this.field1479.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1479.seek(0L);
            this.field1479.write(var5);
        }
        this.field1479.seek(0L);
    }

    @ObfuscatedName("df.f(J)V")
    public final void method2326(long arg0) throws IOException {
        this.field1479.seek(arg0);
        this.field1480 = arg0;
    }

    @ObfuscatedName("df.h([BIII)V")
    public final void method2347(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1480 + (long) arg2 > this.field1478) {
            this.field1479.seek(this.field1478 + 1L);
            this.field1479.write(1);
            throw new EOFException();
        } else {
            this.field1479.write(arg0, arg1, arg2);
            this.field1480 += (long) arg2;
        }
    }

    @ObfuscatedName("df.e(I)V")
    public final void method2343() throws IOException {
        this.method2329(false);
    }

    @ObfuscatedName("df.b(ZI)V")
    public final void method2329(boolean arg0) throws IOException {
        if (this.field1479 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1479.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1479.close();
        this.field1479 = null;
    }

    @ObfuscatedName("df.l(B)J")
    public final long method2330() throws IOException {
        return this.field1479.length();
    }

    @ObfuscatedName("df.w([BIII)I")
    public final int method2331(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1479.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1480 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1479 != null) {
            System.out.println("");
            this.method2343();
        }
    }
}
