import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class222 {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "J")
    private long field3752;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "J")
    private long field3753;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Ljava/io/File;")
    private File field3751;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3754;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)Ljava/io/File;", line = 5)
    public final File method1523(int arg0) {
        if (arg0 != 0) {
            this.field3754 = (RandomAccessFile) null;
        }
        return this.field3751;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(JB)V", line = 15)
    public final void method1524(long arg0, byte arg1) throws IOException {
        this.field3754.seek(arg0);
        int var4 = -12 % ((arg1 - 27) / 35);
        this.field3753 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V", line = 25)
    public final void method1525(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field3752 = 54L;
        }
        if (this.field3754 != null) {
            this.field3754.close();
            this.field3754 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[BIZ)I", line = 43)
    public final int method1526(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if (!arg3) {
            return -70;
        }
        int var5 = this.field3754.read(arg1, arg0, arg2);
        if (var5 > 0) {
            this.field3753 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III[B)V", line = 59)
    public final void method1527(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (((long) arg2 + this.field3753) > this.field3752) {
            this.field3754.seek(this.field3752 + 1L);
            this.field3754.write(1);
            throw new EOFException();
        }
        this.field3754.write(arg3, arg1, arg2);
        if (arg0 > -45) {
            this.field3754 = (RandomAccessFile) null;
        }
        this.field3753 += (long) arg2;
    }

    @OriginalMember(owner = "client!e", name = "finalize", descriptor = "()V", line = 78)
    protected final void finalize() throws Throwable {
        if (this.field3754 != null) {
            System.out.println("Warning! fileondisk " + this.field3751 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1525(0);
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)J", line = 91)
    public final long method1528(int arg0) throws IOException {
        return arg0 == 30736 ? this.field3754.length() : -37L;
    }
}
