import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class265 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "J")
    private long field3918;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "J")
    private long field3919;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "Ljava/io/File;")
    private File field3917;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3916;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)J", line = 5)
    public final long method1828(int arg0) throws IOException {
        return arg0 == -1 ? this.field3916.length() : -123L;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V", line = 15)
    public final void method1829(int arg0) throws IOException {
        if (arg0 <= -101 && this.field3916 != null) {
            this.field3916.close();
            this.field3916 = null;
        }
    }

    @OriginalMember(owner = "client!dd", name = "finalize", descriptor = "()V", line = 32)
    protected final void finalize() throws Throwable {
        if (this.field3916 != null) {
            System.out.println("Warning! fileondisk " + this.field3917 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1829(-109);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)Ljava/io/File;", line = 45)
    public final File method1830(int arg0) {
        if (arg0 != 0) {
            this.method1830(-9);
        }
        return this.field3917;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IJ)V", line = 59)
    public final void method1831(int arg0, long arg1) throws IOException {
        this.field3916.seek(arg1);
        this.field3919 = arg1;
        if (arg0 != 0) {
            this.method1830(49);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(III[B)V", line = 70)
    public final void method1832(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (((long) arg1 + this.field3919) > this.field3918) {
            this.field3916.seek(this.field3918);
            this.field3916.write(1);
            throw new EOFException();
        }
        if (arg2 != 1) {
            this.method1830(-83);
        }
        this.field3916.write(arg3, arg0, arg1);
        this.field3919 += (long) arg1;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I[BIZ)I", line = 90)
    public final int method1833(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if (arg3) {
            return -3;
        }
        int var5 = this.field3916.read(arg1, arg2, arg0);
        if (var5 > 0) {
            this.field3919 += (long) var5;
        }
        return var5;
    }
}
