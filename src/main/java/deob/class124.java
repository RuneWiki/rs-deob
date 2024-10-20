package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dc")
public final class class124 {

    @ObfuscatedName("dc.i")
    public RandomAccessFile field1778;

    @ObfuscatedName("dc.j")
    public long field1779;

    @ObfuscatedName("dc.a")
    public long field1780;

    public class124(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1778 = new RandomAccessFile(arg0, arg1);
        this.field1779 = arg2;
        this.field1780 = 0L;
        int var5 = this.field1778.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1778.seek(0L);
            this.field1778.write(var5);
        }
        this.field1778.seek(0L);
    }

    @ObfuscatedName("dc.i(J)V")
    public final void method2161(long arg0) throws IOException {
        this.field1778.seek(arg0);
        this.field1780 = arg0;
    }

    @ObfuscatedName("dc.j([BIIB)V")
    public final void method2162(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1780 + (long) arg2 > this.field1779) {
            this.field1778.seek(this.field1779 + 1L);
            this.field1778.write(1);
            throw new EOFException();
        } else {
            this.field1778.write(arg0, arg1, arg2);
            this.field1780 += (long) arg2;
        }
    }

    @ObfuscatedName("dc.a(I)V")
    public final void method2163() throws IOException {
        this.method2169(false);
    }

    @ObfuscatedName("dc.r(ZI)V")
    public final void method2169(boolean arg0) throws IOException {
        if (this.field1778 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1778.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1778.close();
        this.field1778 = null;
    }

    @ObfuscatedName("dc.o(I)J")
    public final long method2165() throws IOException {
        return this.field1778.length();
    }

    @ObfuscatedName("dc.n([BIII)I")
    public final int method2166(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1778.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1780 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1778 != null) {
            System.out.println("");
            this.method2163();
        }
    }
}
