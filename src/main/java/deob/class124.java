package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dg")
public final class class124 {

    @ObfuscatedName("dg.n")
    public RandomAccessFile field1680;

    @ObfuscatedName("dg.v")
    public long field1677;

    @ObfuscatedName("dg.y")
    public long field1678;

    public class124(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1680 = new RandomAccessFile(arg0, arg1);
        this.field1677 = arg2;
        this.field1678 = 0L;
        int var5 = this.field1680.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1680.seek(0L);
            this.field1680.write(var5);
        }
        this.field1680.seek(0L);
    }

    @ObfuscatedName("dg.n(J)V")
    public final void method2193(long arg0) throws IOException {
        this.field1680.seek(arg0);
        this.field1678 = arg0;
    }

    @ObfuscatedName("dg.v([BIIB)V")
    public final void method2194(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1678 + (long) arg2 > this.field1677) {
            this.field1680.seek(this.field1677 + 1L);
            this.field1680.write(1);
            throw new EOFException();
        } else {
            this.field1680.write(arg0, arg1, arg2);
            this.field1678 += (long) arg2;
        }
    }

    @ObfuscatedName("dg.y(I)V")
    public final void method2195() throws IOException {
        this.method2196(false);
    }

    @ObfuscatedName("dg.r(ZI)V")
    public final void method2196(boolean arg0) throws IOException {
        if (this.field1680 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1680.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1680.close();
        this.field1680 = null;
    }

    @ObfuscatedName("dg.h(I)J")
    public final long method2208() throws IOException {
        return this.field1680.length();
    }

    @ObfuscatedName("dg.d([BIII)I")
    public final int method2203(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1680.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1678 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1680 != null) {
            System.out.println("");
            this.method2195();
        }
    }
}
