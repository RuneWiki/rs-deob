package deob;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfuscatedName("dk")
public final class class125 {

    @ObfuscatedName("dk.a")
    public RandomAccessFile field1758;

    @ObfuscatedName("dk.j")
    public long field1756;

    @ObfuscatedName("dk.n")
    public long field1757;

    public class125(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field1758 = new RandomAccessFile(arg0, arg1);
        this.field1756 = arg2;
        this.field1757 = 0L;
        int var5 = this.field1758.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field1758.seek(0L);
            this.field1758.write(var5);
        }
        this.field1758.seek(0L);
    }

    @ObfuscatedName("dk.a(J)V")
    public final void method2130(long arg0) throws IOException {
        this.field1758.seek(arg0);
        this.field1757 = arg0;
    }

    @ObfuscatedName("dk.j([BIII)V")
    public final void method2131(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field1757 + (long) arg2 > this.field1756) {
            this.field1758.seek(this.field1756 + 1L);
            this.field1758.write(1);
            throw new EOFException();
        } else {
            this.field1758.write(arg0, arg1, arg2);
            this.field1757 += (long) arg2;
        }
    }

    @ObfuscatedName("dk.n(I)V")
    public final void method2129() throws IOException {
        if (this.field1758 != null) {
            this.field1758.close();
            this.field1758 = null;
        }
    }

    @ObfuscatedName("dk.r(I)J")
    public final long method2133() throws IOException {
        return this.field1758.length();
    }

    @ObfuscatedName("dk.v([BIIB)I")
    public final int method2134(byte[] arg0, int arg1, int arg2) throws IOException {
        int var4 = this.field1758.read(arg0, arg1, arg2);
        if (var4 > 0) {
            this.field1757 += (long) var4;
        }
        return var4;
    }

    public void finalize() throws Throwable {
        if (this.field1758 != null) {
            System.out.println("");
            this.method2129();
        }
    }
}
