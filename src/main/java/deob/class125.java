package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dp")
public final class class125 {

    @ObfuscatedName("dp.i")
    public RandomAccessFile field1780;

    @ObfuscatedName("dp.w")
    public long field1775;

    @ObfuscatedName("dp.a")
    public long field1776;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1780 = new RandomAccessFile(arg0, arg1);
        this.field1775 = arg2;
        this.field1776 = 0L;
        int var5 = this.field1780.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1780.seek(0L);
            this.field1780.write(var5);
        }
        this.field1780.seek(0L);
    }

    @ObfuscatedName("dp.i(J)V")
    public final void method2150(long arg0) throws IOException {
        this.field1780.seek(arg0);
        this.field1776 = arg0;
    }

    @ObfuscatedName("dp.w([BIII)V")
    public final void method2139(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1776 + (long) arg2 > this.field1775) {
            this.field1780.seek(this.field1775 + 1L);
            this.field1780.write(1);
            throw new EOFException();
        } else {
            this.field1780.write(arg0, arg1, arg2);
            this.field1776 += (long) arg2;
        }
    }

    @ObfuscatedName("dp.a(I)V")
    public final void method2157() throws IOException {
        if (this.field1780 != null) {
            this.field1780.close();
            this.field1780 = null;
        }
    }

    @ObfuscatedName("dp.t(I)J")
    public final long method2155() throws IOException {
        return this.field1780.length();
    }

    @ObfuscatedName("dp.s([BIII)I")
    public final int method2143(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1780.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1776 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1780 != null) {
            System.out.println("");
            this.method2157();
        }
    }
}
