package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("di")
public final class class123 {

    @ObfuscatedName("di.d")
    public RandomAccessFile field1688;

    @ObfuscatedName("di.z")
    public long field1687;

    @ObfuscatedName("di.n")
    public long field1686;

    public class123(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1688 = new RandomAccessFile(arg0, arg1);
        this.field1687 = arg2;
        this.field1686 = 0L;
        int var5 = this.field1688.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1688.seek(0L);
            this.field1688.write(var5);
        }
        this.field1688.seek(0L);
    }

    @ObfuscatedName("di.d(J)V")
    public final void method2365(long arg0) throws IOException {
        this.field1688.seek(arg0);
        this.field1686 = arg0;
    }

    @ObfuscatedName("di.z([BIII)V")
    public final void method2384(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1686 + (long) arg2 > this.field1687) {
            this.field1688.seek(this.field1687 + 1L);
            this.field1688.write(1);
            throw new EOFException();
        } else {
            this.field1688.write(arg0, arg1, arg2);
            this.field1686 += (long) arg2;
        }
    }

    @ObfuscatedName("di.n(I)V")
    public final void method2367() throws IOException {
        this.method2368(false);
    }

    @ObfuscatedName("di.r(ZI)V")
    public final void method2368(boolean arg0) throws IOException {
        if (this.field1688 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1688.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1688.close();
        this.field1688 = null;
    }

    @ObfuscatedName("di.e(I)J")
    public final long method2364() throws IOException {
        return this.field1688.length();
    }

    @ObfuscatedName("di.y([BIII)I")
    public final int method2374(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1688.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1686 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1688 != null) {
            System.out.println("");
            this.method2367();
        }
    }
}
