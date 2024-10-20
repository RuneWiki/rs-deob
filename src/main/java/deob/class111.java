package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dv")
public final class class111 {

    @ObfuscatedName("dv.z")
    public RandomAccessFile field1436;

    @ObfuscatedName("dv.w")
    public long field1434;

    @ObfuscatedName("dv.s")
    public long field1433;

    public class111(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1436 = new RandomAccessFile(arg0, arg1);
        this.field1434 = arg2;
        this.field1433 = 0L;
        int var5 = this.field1436.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1436.seek(0L);
            this.field1436.write(var5);
        }
        this.field1436.seek(0L);
    }

    @ObfuscatedName("dv.z(J)V")
    public final void method2310(long arg0) throws IOException {
        this.field1436.seek(arg0);
        this.field1433 = arg0;
    }

    @ObfuscatedName("dv.w([BIII)V")
    public final void method2302(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1433 + (long) arg2 > this.field1434) {
            this.field1436.seek(this.field1434 + 1L);
            this.field1436.write(1);
            throw new EOFException();
        } else {
            this.field1436.write(arg0, arg1, arg2);
            this.field1433 += (long) arg2;
        }
    }

    @ObfuscatedName("dv.s(I)V")
    public final void method2303() throws IOException {
        this.method2304(false);
    }

    @ObfuscatedName("dv.l(ZB)V")
    public final void method2304(boolean arg0) throws IOException {
        if (this.field1436 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1436.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1436.close();
        this.field1436 = null;
    }

    @ObfuscatedName("dv.u(I)J")
    public final long method2305() throws IOException {
        return this.field1436.length();
    }

    @ObfuscatedName("dv.q([BIII)I")
    public final int method2306(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1436.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1433 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1436 != null) {
            System.out.println("");
            this.method2303();
        }
    }
}
