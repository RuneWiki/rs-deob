import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class41 {

    @OriginalMember(owner = "client!r", name = "b", descriptor = "J")
    private long field688;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "J")
    private long field689;

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Ljava/io/File;")
    private File field690;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field687;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(II[BI)I")
    public final int method304(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field687.read(arg2, arg0, arg3);
        if (~var5 < arg1) {
            this.field688 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BII[B)V")
    public final void method305(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != -36) {
            this.method309(96);
        }
        if ((long) arg1 + this.field688 > this.field689) {
            this.field687.seek(this.field689 + 1L);
            this.field687.write(1);
            throw new EOFException();
        } else {
            this.field687.write(arg3, arg2, arg1);
            this.field688 += (long) arg1;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(B)J")
    public final long method306(byte arg0) throws IOException {
        if (arg0 != 40) {
            this.method309(-47);
        }
        return this.field687.length();
    }

    @OriginalMember(owner = "client!r", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field687 != null) {
            System.out.println("Warning! fileondisk " + this.field690 + " not closed correctly using close(). Auto-closing instead. ");
            this.method307(-31335);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public final void method307(int arg0) throws IOException {
        if (this.field687 != null) {
            this.field687.close();
            this.field687 = null;
        }
        if (arg0 != -31335) {
            this.field689 = -82L;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(IJ)V")
    public final void method308(int arg0, long arg1) throws IOException {
        this.field687.seek(arg1);
        if (arg0 != 24028) {
            this.field688 = -67L;
        }
        this.field688 = arg1;
    }

    @OriginalMember(owner = "client!r", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method309(int arg0) {
        if (arg0 != 31929) {
            this.field688 = -64L;
        }
        return this.field690;
    }
}
