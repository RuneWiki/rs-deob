package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dp")
public final class class125 {

    @ObfuscatedName("dp.i")
    public RandomAccessFile field1753;

    @ObfuscatedName("dp.h")
    public long field1751;

    @ObfuscatedName("dp.u")
    public long field1754;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1753 = new RandomAccessFile(arg0, arg1);
        this.field1751 = arg2;
        this.field1754 = 0L;
        int var5 = this.field1753.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1753.seek(0L);
            this.field1753.write(var5);
        }
        this.field1753.seek(0L);
    }

    @ObfuscatedName("dp.i(J)V")
    public final void method2167(long arg0) throws IOException {
        this.field1753.seek(arg0);
        this.field1754 = arg0;
    }

    @ObfuscatedName("dp.h([BIII)V")
    public final void method2168(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1754 + (long) arg2 > this.field1751) {
            this.field1753.seek(this.field1751 + 1L);
            this.field1753.write(1);
            throw new EOFException();
        } else {
            this.field1753.write(arg0, arg1, arg2);
            this.field1754 += (long) arg2;
        }
    }

    @ObfuscatedName("dp.u(S)V")
    public final void method2169() throws IOException {
        if (this.field1753 != null) {
            this.field1753.close();
            this.field1753 = null;
        }
    }

    @ObfuscatedName("dp.q(B)J")
    public final long method2170() throws IOException {
        return this.field1753.length();
    }

    @ObfuscatedName("dp.g([BIII)I")
    public final int method2171(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1753.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1754 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1753 != null) {
            System.out.println("");
            this.method2169();
        }
    }
}
