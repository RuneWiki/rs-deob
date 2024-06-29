import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class223 {

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "J")
    private long field3252;

    @OriginalMember(owner = "client!vl", name = "d", descriptor = "J")
    private long field3254;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "Ljava/io/File;")
    private File field3251;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3253;

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1453(byte arg0) {
        return arg0 == 16 ? this.field3251 : null;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(B[BII)V")
    public final void method1454(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 <= 29) {
            return;
        }
        if (((long) arg2 + this.field3252) > this.field3254) {
            this.field3253.seek(this.field3254);
            this.field3253.write(1);
            throw new EOFException();
        } else {
            this.field3253.write(arg1, arg3, arg2);
            this.field3252 += (long) arg2;
        }
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(I[BII)I")
    public final int method1455(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 >= -114) {
            this.field3251 = null;
        }
        int var5 = this.field3253.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field3252 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vl", name = "a", descriptor = "(ZJ)V")
    public final void method1456(boolean arg0, long arg1) throws IOException {
        this.field3253.seek(arg1);
        if (arg0) {
            this.field3252 = arg1;
        }
    }

    @OriginalMember(owner = "client!vl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3253 != null) {
            System.out.println("Warning! fileondisk " + this.field3251 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1458((byte) -12);
        }
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(B)J")
    public final long method1457(byte arg0) throws IOException {
        int var2 = 103 % ((16 - arg0) / 63);
        return this.field3253.length();
    }

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(B)V")
    public final void method1458(byte arg0) throws IOException {
        int var2 = 18 % ((24 - arg0) / 35);
        if (this.field3253 != null) {
            this.field3253.close();
            this.field3253 = null;
        }
    }
}
