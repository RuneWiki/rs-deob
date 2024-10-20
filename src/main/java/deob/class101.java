package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("cs")
public final class class101 {

    @ObfuscatedName("cs.s")
    public RandomAccessFile field1473;

    @ObfuscatedName("cs.g")
    public long field1475;

    @ObfuscatedName("cs.m")
    public long field1474;

    public class101(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1473 = new RandomAccessFile(arg0, arg1);
        this.field1475 = arg2;
        this.field1474 = 0L;
        int var5 = this.field1473.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1473.seek(0L);
            this.field1473.write(var5);
        }
        this.field1473.seek(0L);
    }

    @ObfuscatedName("cs.s(J)V")
    public final void method1956(long arg0) throws IOException {
        this.field1473.seek(arg0);
        this.field1474 = arg0;
    }

    @ObfuscatedName("cs.g([BIIB)V")
    public final void method1957(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1474 + (long) arg2 > this.field1475) {
            this.field1473.seek(this.field1475 + 1L);
            this.field1473.write(1);
            throw new EOFException();
        } else {
            this.field1473.write(arg0, arg1, arg2);
            this.field1474 += (long) arg2;
        }
    }

    @ObfuscatedName("cs.m(I)V")
    public final void method1958() throws IOException {
        this.method1967(false);
    }

    @ObfuscatedName("cs.h(ZB)V")
    public final void method1967(boolean arg0) throws IOException {
        if (this.field1473 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1473.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1473.close();
        this.field1473 = null;
    }

    @ObfuscatedName("cs.i(I)J")
    public final long method1959() throws IOException {
        return this.field1473.length();
    }

    @ObfuscatedName("cs.w([BIIB)I")
    public final int method1966(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1473.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1474 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1473 != null) {
            System.out.println("");
            this.method1958();
        }
    }
}
