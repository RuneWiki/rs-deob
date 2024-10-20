package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dk")
public final class class126 {

    @ObfuscatedName("dk.e")
    public RandomAccessFile field1754;

    @ObfuscatedName("dk.n")
    public long field1757;

    @ObfuscatedName("dk.g")
    public long field1756;

    public class126(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1754 = new RandomAccessFile(arg0, arg1);
        this.field1757 = arg2;
        this.field1756 = 0L;
        int var5 = this.field1754.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1754.seek(0L);
            this.field1754.write(var5);
        }
        this.field1754.seek(0L);
    }

    @ObfuscatedName("dk.e(J)V")
    public final void method2186(long arg0) throws IOException {
        this.field1754.seek(arg0);
        this.field1756 = arg0;
    }

    @ObfuscatedName("dk.n([BIIB)V")
    public final void method2175(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1756 + (long) arg2 > this.field1757) {
            this.field1754.seek(this.field1757 + 1L);
            this.field1754.write(1);
            throw new EOFException();
        } else {
            this.field1754.write(arg0, arg1, arg2);
            this.field1756 += (long) arg2;
        }
    }

    @ObfuscatedName("dk.g(S)V")
    public final void method2187() throws IOException {
        if (this.field1754 != null) {
            this.field1754.close();
            this.field1754 = null;
        }
    }

    @ObfuscatedName("dk.y(B)J")
    public final long method2178() throws IOException {
        return this.field1754.length();
    }

    @ObfuscatedName("dk.w([BIIB)I")
    public final int method2177(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1754.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1756 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1754 != null) {
            System.out.println("");
            this.method2187();
        }
    }
}
