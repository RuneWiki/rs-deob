package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dd")
public final class class125 {

    @ObfuscatedName("dd.p")
    public RandomAccessFile field1767;

    @ObfuscatedName("dd.m")
    public long field1763;

    @ObfuscatedName("dd.e")
    public long field1765;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1767 = new RandomAccessFile(arg0, arg1);
        this.field1763 = arg2;
        this.field1765 = 0L;
        int var5 = this.field1767.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1767.seek(0L);
            this.field1767.write(var5);
        }
        this.field1767.seek(0L);
    }

    @ObfuscatedName("dd.p(J)V")
    public final void method2090(long arg0) throws IOException {
        this.field1767.seek(arg0);
        this.field1765 = arg0;
    }

    @ObfuscatedName("dd.m([BIII)V")
    public final void method2091(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1765 + (long) arg2 > this.field1763) {
            this.field1767.seek(this.field1763 + 1L);
            this.field1767.write(1);
            throw new EOFException();
        } else {
            this.field1767.write(arg0, arg1, arg2);
            this.field1765 += (long) arg2;
        }
    }

    @ObfuscatedName("dd.e(I)V")
    public final void method2101() throws IOException {
        if (this.field1767 != null) {
            this.field1767.close();
            this.field1767 = null;
        }
    }

    @ObfuscatedName("dd.t(I)J")
    public final long method2093() throws IOException {
        return this.field1767.length();
    }

    @ObfuscatedName("dd.w([BIII)I")
    public final int method2094(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1767.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1765 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1767 != null) {
            System.out.println("");
            this.method2101();
        }
    }
}
