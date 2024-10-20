package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dx")
public final class class122 {

    @ObfuscatedName("dx.b")
    public RandomAccessFile field1651;

    @ObfuscatedName("dx.q")
    public long field1654;

    @ObfuscatedName("dx.o")
    public long field1652;

    public class122(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1651 = new RandomAccessFile(arg0, arg1);
        this.field1654 = arg2;
        this.field1652 = 0L;
        int var5 = this.field1651.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1651.seek(0L);
            this.field1651.write(var5);
        }
        this.field1651.seek(0L);
    }

    @ObfuscatedName("dx.b(J)V")
    public final void method2342(long arg0) throws IOException {
        this.field1651.seek(arg0);
        this.field1652 = arg0;
    }

    @ObfuscatedName("dx.q([BIII)V")
    public final void method2336(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1652 + (long) arg2 > this.field1654) {
            this.field1651.seek(this.field1654 + 1L);
            this.field1651.write(1);
            throw new EOFException();
        } else {
            this.field1651.write(arg0, arg1, arg2);
            this.field1652 += (long) arg2;
        }
    }

    @ObfuscatedName("dx.o(I)V")
    public final void method2335() throws IOException {
        this.method2338(false);
    }

    @ObfuscatedName("dx.p(ZB)V")
    public final void method2338(boolean arg0) throws IOException {
        if (this.field1651 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1651.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1651.close();
        this.field1651 = null;
    }

    @ObfuscatedName("dx.a(I)J")
    public final long method2359() throws IOException {
        return this.field1651.length();
    }

    @ObfuscatedName("dx.h([BIII)I")
    public final int method2340(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1651.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1652 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1651 != null) {
            System.out.println("");
            this.method2335();
        }
    }
}
