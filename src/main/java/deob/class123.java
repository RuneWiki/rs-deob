package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dw")
public final class class123 {

    @ObfuscatedName("dw.w")
    public RandomAccessFile field1756;

    @ObfuscatedName("dw.s")
    public long field1755;

    @ObfuscatedName("dw.q")
    public long field1754;

    public class123(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1756 = new RandomAccessFile(arg0, arg1);
        this.field1755 = arg2;
        this.field1754 = 0L;
        int var5 = this.field1756.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1756.seek(0L);
            this.field1756.write(var5);
        }
        this.field1756.seek(0L);
    }

    @ObfuscatedName("dw.w(J)V")
    public final void method2213(long arg0) throws IOException {
        this.field1756.seek(arg0);
        this.field1754 = arg0;
    }

    @ObfuscatedName("dw.s([BIIB)V")
    public final void method2204(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1754 + (long) arg2 > this.field1755) {
            this.field1756.seek(this.field1755 + 1L);
            this.field1756.write(1);
            throw new EOFException();
        } else {
            this.field1756.write(arg0, arg1, arg2);
            this.field1754 += (long) arg2;
        }
    }

    @ObfuscatedName("dw.q(B)V")
    public final void method2222() throws IOException {
        this.method2206(false);
    }

    @ObfuscatedName("dw.o(ZI)V")
    public final void method2206(boolean arg0) throws IOException {
        if (this.field1756 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1756.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1756.close();
        this.field1756 = null;
    }

    @ObfuscatedName("dw.g(I)J")
    public final long method2207() throws IOException {
        return this.field1756.length();
    }

    @ObfuscatedName("dw.v([BIII)I")
    public final int method2208(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1756.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1754 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1756 != null) {
            System.out.println("");
            this.method2222();
        }
    }
}
