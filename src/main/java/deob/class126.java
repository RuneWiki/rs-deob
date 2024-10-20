package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dr")
public final class class126 {

    @ObfuscatedName("dr.j")
    public RandomAccessFile field1777;

    @ObfuscatedName("dr.h")
    public long field1778;

    @ObfuscatedName("dr.f")
    public long field1779;

    public class126(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1777 = new RandomAccessFile(arg0, arg1);
        this.field1778 = arg2;
        this.field1779 = 0L;
        int var5 = this.field1777.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1777.seek(0L);
            this.field1777.write(var5);
        }
        this.field1777.seek(0L);
    }

    @ObfuscatedName("dr.j(J)V")
    public final void method2158(long arg0) throws IOException {
        this.field1777.seek(arg0);
        this.field1779 = arg0;
    }

    @ObfuscatedName("dr.h([BIII)V")
    public final void method2159(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1779 + (long) arg2 > this.field1778) {
            this.field1777.seek(this.field1778 + 1L);
            this.field1777.write(1);
            throw new EOFException();
        } else {
            this.field1777.write(arg0, arg1, arg2);
            this.field1779 += (long) arg2;
        }
    }

    @ObfuscatedName("dr.f(I)V")
    public final void method2161() throws IOException {
        if (this.field1777 != null) {
            this.field1777.close();
            this.field1777 = null;
        }
    }

    @ObfuscatedName("dr.p(I)J")
    public final long method2177() throws IOException {
        return this.field1777.length();
    }

    @ObfuscatedName("dr.x([BIIS)I")
    public final int method2162(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1777.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1779 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1777 != null) {
            System.out.println("");
            this.method2161();
        }
    }
}
