package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dw")
public final class class123 {

    @ObfuscatedName("dw.d")
    public RandomAccessFile field1753;

    @ObfuscatedName("dw.k")
    public long field1752;

    @ObfuscatedName("dw.e")
    public long field1754;

    public class123(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1753 = new RandomAccessFile(arg0, arg1);
        this.field1752 = arg2;
        this.field1754 = 0L;
        int var5 = this.field1753.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1753.seek(0L);
            this.field1753.write(var5);
        }
        this.field1753.seek(0L);
    }

    @ObfuscatedName("dw.d(J)V")
    public final void method2217(long arg0) throws IOException {
        this.field1753.seek(arg0);
        this.field1754 = arg0;
    }

    @ObfuscatedName("dw.k([BIII)V")
    public final void method2213(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1754 + (long) arg2 > this.field1752) {
            this.field1753.seek(this.field1752 + 1L);
            this.field1753.write(1);
            throw new EOFException();
        } else {
            this.field1753.write(arg0, arg1, arg2);
            this.field1754 += (long) arg2;
        }
    }

    @ObfuscatedName("dw.e(I)V")
    public final void method2234() throws IOException {
        this.method2215(false);
    }

    @ObfuscatedName("dw.p(ZI)V")
    public final void method2215(boolean arg0) throws IOException {
        if (this.field1753 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1753.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1753.close();
        this.field1753 = null;
    }

    @ObfuscatedName("dw.q(I)J")
    public final long method2216() throws IOException {
        return this.field1753.length();
    }

    @ObfuscatedName("dw.s([BIII)I")
    public final int method2224(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1753.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1754 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1753 != null) {
            System.out.println("");
            this.method2234();
        }
    }
}
