import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class245 {

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "J")
    private long field3907;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "J")
    private long field3908;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Ljava/io/File;")
    private File field3906;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3909;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)J")
    public final long method1660(byte arg0) throws IOException {
        return arg0 >= -74 ? 3L : this.field3909.length();
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method1661(byte arg0) {
        if (arg0 != 54) {
            this.method1661((byte) 85);
        }
        return this.field3906;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBI[B)V")
    public final void method1662(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg0 + this.field3908 > this.field3907) {
            this.field3909.seek(this.field3907);
            this.field3909.write(1);
            throw new EOFException();
        }
        this.field3909.write(arg3, arg2, arg0);
        this.field3908 += (long) arg0;
        if (arg1 < 10) {
            this.method1661((byte) 10);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V")
    public final void method1663(int arg0) throws IOException {
        if (this.field3909 != null) {
            this.field3909.close();
            this.field3909 = null;
        }
        if (arg0 != 1) {
            this.method1661((byte) -50);
        }
    }

    @OriginalMember(owner = "client!wc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3909 != null) {
            System.out.println("Warning! fileondisk " + this.field3906 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1663(1);
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(JI)V")
    public final void method1664(long arg0, int arg1) throws IOException {
        this.field3909.seek(arg0);
        if (arg1 <= -54) {
            this.field3908 = arg0;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I[BII)I")
    public final int method1665(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field3909.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field3908 += (long) var5;
        }
        if (arg0 <= 54) {
            this.field3906 = null;
        }
        return var5;
    }
}
