import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class159 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "J")
    private long field2822;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "J")
    private long field2823;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Ljava/io/File;")
    private File field2820;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2821;

    @OriginalMember(owner = "client!tk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2821 != null) {
            System.out.println("Warning! fileondisk " + this.field2820 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1163(false);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public final void method1163(boolean arg0) throws IOException {
        if (!arg0 && this.field2821 != null) {
            this.field2821.close();
            this.field2821 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III[B)V")
    public final void method1164(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg0 + this.field2822 > this.field2823) {
            this.field2821.seek(this.field2823 + 1L);
            this.field2821.write(1);
            throw new EOFException();
        } else if (arg2 == -28438) {
            this.field2821.write(arg3, arg1, arg0);
            this.field2822 += (long) arg0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IJ)V")
    public final void method1165(int arg0, long arg1) throws IOException {
        if (arg0 != -14858) {
            this.field2823 = -13L;
        }
        this.field2821.seek(arg1);
        this.field2822 = arg1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)J")
    public final long method1166(int arg0) throws IOException {
        return arg0 <= 26 ? -11L : this.field2821.length();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[BII)I")
    public final int method1167(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2821.read(arg1, arg2, arg3);
        if (var5 > 0) {
            this.field2822 += (long) var5;
        }
        if (arg0 != -30019) {
            this.field2822 = -9L;
        }
        return var5;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method1168(int arg0) {
        if (arg0 != -8616) {
            this.field2823 = -63L;
        }
        return this.field2820;
    }
}
