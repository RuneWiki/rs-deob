package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dx")
public final class class124 {

    @ObfuscatedName("dx.b")
    public RandomAccessFile field1678;

    @ObfuscatedName("dx.s")
    public long field1680;

    @ObfuscatedName("dx.r")
    public long field1679;

    public class124(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1678 = new RandomAccessFile(arg0, arg1);
        this.field1680 = arg2;
        this.field1679 = 0L;
        int var5 = this.field1678.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1678.seek(0L);
            this.field1678.write(var5);
        }
        this.field1678.seek(0L);
    }

    @ObfuscatedName("dx.b(J)V")
    public final void method2166(long arg0) throws IOException {
        this.field1678.seek(arg0);
        this.field1679 = arg0;
    }

    @ObfuscatedName("dx.s([BIII)V")
    public final void method2167(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1679 + (long) arg2 > this.field1680) {
            this.field1678.seek(this.field1680 + 1L);
            this.field1678.write(1);
            throw new EOFException();
        } else {
            this.field1678.write(arg0, arg1, arg2);
            this.field1679 += (long) arg2;
        }
    }

    @ObfuscatedName("dx.r(S)V")
    public final void method2180() throws IOException {
        this.method2169(false);
    }

    @ObfuscatedName("dx.g(ZI)V")
    public final void method2169(boolean arg0) throws IOException {
        if (this.field1678 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1678.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1678.close();
        this.field1678 = null;
    }

    @ObfuscatedName("dx.x(I)J")
    public final long method2174() throws IOException {
        return this.field1678.length();
    }

    @ObfuscatedName("dx.f([BIII)I")
    public final int method2171(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1678.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1679 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1678 != null) {
            System.out.println("");
            this.method2180();
        }
    }
}
