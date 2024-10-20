package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("di")
public final class class123 {

    @ObfuscatedName("di.o")
    public RandomAccessFile field1705;

    @ObfuscatedName("di.k")
    public long field1704;

    @ObfuscatedName("di.t")
    public long field1706;

    public class123(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1705 = new RandomAccessFile(arg0, arg1);
        this.field1704 = arg2;
        this.field1706 = 0L;
        int var5 = this.field1705.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1705.seek(0L);
            this.field1705.write(var5);
        }
        this.field1705.seek(0L);
    }

    @ObfuscatedName("di.o(J)V")
    public final void method2335(long arg0) throws IOException {
        this.field1705.seek(arg0);
        this.field1706 = arg0;
    }

    @ObfuscatedName("di.k([BIII)V")
    public final void method2319(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1706 + (long) arg2 > this.field1704) {
            this.field1705.seek(this.field1704 + 1L);
            this.field1705.write(1);
            throw new EOFException();
        } else {
            this.field1705.write(arg0, arg1, arg2);
            this.field1706 += (long) arg2;
        }
    }

    @ObfuscatedName("di.t(I)V")
    public final void method2326() throws IOException {
        this.method2322(false);
    }

    @ObfuscatedName("di.d(ZI)V")
    public final void method2322(boolean arg0) throws IOException {
        if (this.field1705 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1705.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1705.close();
        this.field1705 = null;
    }

    @ObfuscatedName("di.h(I)J")
    public final long method2324() throws IOException {
        return this.field1705.length();
    }

    @ObfuscatedName("di.m([BIII)I")
    public final int method2325(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1705.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1706 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1705 != null) {
            System.out.println("");
            this.method2326();
        }
    }
}
