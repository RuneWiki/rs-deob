package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

@ObfuscatedName("dw")
public final class class113 {

    @ObfuscatedName("dw.c")
    public RandomAccessFile field1498;

    @ObfuscatedName("dw.q")
    public long field1505;

    @ObfuscatedName("dw.m")
    public long field1497;

    public class113(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1498 = new RandomAccessFile(arg0, arg1);
        this.field1505 = arg2;
        this.field1497 = 0L;
        int var5 = this.field1498.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1498.seek(0L);
            this.field1498.write(var5);
        }
        this.field1498.seek(0L);
    }

    @ObfuscatedName("dw.c(J)V")
    public final void method2281(long arg0) throws IOException {
        this.field1498.seek(arg0);
        this.field1497 = arg0;
    }

    @ObfuscatedName("dw.q([BIIB)V")
    public final void method2265(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1497 + (long) arg2 > this.field1505) {
            this.field1498.seek(this.field1505 + 1L);
            this.field1498.write(1);
            throw new EOFException();
        } else {
            this.field1498.write(arg0, arg1, arg2);
            this.field1497 += (long) arg2;
        }
    }

    @ObfuscatedName("dw.m(B)V")
    public final void method2266() throws IOException {
        this.method2267(false);
    }

    @ObfuscatedName("dw.j(ZI)V")
    public final void method2267(boolean arg0) throws IOException {
        if (this.field1498 == null) {
            return;
        }
        if (arg0) {
            try {
                this.field1498.getFD().sync();
            } catch (SyncFailedException var3) {
            }
        }
        this.field1498.close();
        this.field1498 = null;
    }

    @ObfuscatedName("dw.g(I)J")
    public final long method2268() throws IOException {
        return this.field1498.length();
    }

    @ObfuscatedName("dw.i([BIIS)I")
    public final int method2269(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1498.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1497 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1498 != null) {
            System.out.println("");
            this.method2266();
        }
    }
}
