import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class235 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "J")
    private long field4081;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "J")
    private long field4083;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Ljava/io/File;")
    private File field4082;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4084;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public final void method1654(int arg0) throws IOException {
        if (arg0 <= 41) {
            this.method1659(-14);
        }
        if (this.field4084 != null) {
            this.field4084.close();
            this.field4084 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)J")
    public final long method1655(int arg0) throws IOException {
        if (arg0 != 26852) {
            this.method1659(34);
        }
        return this.field4084.length();
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III[B)I")
    public final int method1656(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 != -31517) {
            return 114;
        }
        int var5 = this.field4084.read(arg3, arg2, arg0);
        if (var5 > 0) {
            this.field4083 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III[B)V")
    public final void method1657(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (((long) arg1 + this.field4083) > this.field4081) {
            this.field4084.seek(this.field4081 + 1L);
            this.field4084.write(1);
            throw new EOFException();
        }
        this.field4084.write(arg3, arg2, arg1);
        this.field4083 += (long) arg1;
        if (arg0 != 28825) {
            this.method1659(85);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IJ)V")
    public final void method1658(int arg0, long arg1) throws IOException {
        this.field4084.seek(arg1);
        if (arg0 != -10803) {
            this.field4084 = null;
        }
        this.field4083 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4084 != null) {
            System.out.println("Warning! fileondisk " + this.field4082 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1654(125);
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method1659(int arg0) {
        if (arg0 != -17195) {
            this.field4084 = null;
        }
        return this.field4082;
    }
}
