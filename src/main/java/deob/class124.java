package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("da")
public final class class124 {

    @ObfuscatedName("da.a")
    public RandomAccessFile field1663;

    @ObfuscatedName("da.w")
    public long field1661;

    @ObfuscatedName("da.e")
    public long field1662;

    public class124(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1663 = new RandomAccessFile(arg0, arg1);
        this.field1661 = arg2;
        this.field1662 = 0L;
        int var5 = this.field1663.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1663.seek(0L);
            this.field1663.write(var5);
        }
        this.field1663.seek(0L);
    }

    @ObfuscatedName("da.a(J)V")
    public final void method2165(long arg0) throws IOException {
        this.field1663.seek(arg0);
        this.field1662 = arg0;
    }

    @ObfuscatedName("da.w([BIII)V")
    public final void method2146(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1662 + (long) arg2 > this.field1661) {
            this.field1663.seek(this.field1661 + 1L);
            this.field1663.write(1);
            throw new EOFException();
        } else {
            this.field1663.write(arg0, arg1, arg2);
            this.field1662 += (long) arg2;
        }
    }

    @ObfuscatedName("da.e(I)V")
    public final void method2147() throws IOException {
        this.method2148(false);
    }

    @ObfuscatedName("da.k(ZI)V")
    public final void method2148(boolean arg0) throws IOException {
        if (this.field1663 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1663.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1663.close();
        this.field1663 = null;
    }

    @ObfuscatedName("da.u(B)J")
    public final long method2149() throws IOException {
        return this.field1663.length();
    }

    @ObfuscatedName("da.z([BIII)I")
    public final int method2169(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1663.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1662 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1663 != null) {
            System.out.println("");
            this.method2147();
        }
    }
}
