package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dg")
public final class class125 {

    @ObfuscatedName("dg.n")
    public RandomAccessFile field1776;

    @ObfuscatedName("dg.p")
    public long field1774;

    @ObfuscatedName("dg.i")
    public long field1773;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1776 = new RandomAccessFile(arg0, arg1);
        this.field1774 = arg2;
        this.field1773 = 0L;
        int var5 = this.field1776.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1776.seek(0L);
            this.field1776.write(var5);
        }
        this.field1776.seek(0L);
    }

    @ObfuscatedName("dg.n(J)V")
    public final void method2174(long arg0) throws IOException {
        this.field1776.seek(arg0);
        this.field1773 = arg0;
    }

    @ObfuscatedName("dg.p([BIIB)V")
    public final void method2175(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1773 + (long) arg2 > this.field1774) {
            this.field1776.seek(this.field1774 + 1L);
            this.field1776.write(1);
            throw new EOFException();
        } else {
            this.field1776.write(arg0, arg1, arg2);
            this.field1773 += (long) arg2;
        }
    }

    @ObfuscatedName("dg.i(I)V")
    public final void method2177() throws IOException {
        if (this.field1776 != null) {
            this.field1776.close();
            this.field1776 = null;
        }
    }

    @ObfuscatedName("dg.j(B)J")
    public final long method2179() throws IOException {
        return this.field1776.length();
    }

    @ObfuscatedName("dg.f([BIIB)I")
    public final int method2178(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1776.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1773 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1776 != null) {
            System.out.println("");
            this.method2177();
        }
    }
}
