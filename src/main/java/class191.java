import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class191 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "J")
    private long field3084;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "J")
    private long field3085;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Ljava/io/File;")
    private File field3083;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3086;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III[B)I", line = 6)
    public final int method1371(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field3086.read(arg3, arg0, arg2);
        if (arg1 != 1) {
            this.field3084 = -23L;
        }
        if (var5 > 0) {
            this.field3085 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)J", line = 21)
    public final long method1372(boolean arg0) throws IOException {
        if (!arg0) {
            this.method1374(-86);
        }
        return this.field3086.length();
    }

    @OriginalMember(owner = "client!fh", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        if (this.field3086 != null) {
            System.out.println("Warning! fileondisk " + this.field3083 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1376(-1);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IB[BI)V", line = 44)
    public final void method1373(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if ((long) arg0 + this.field3085 > this.field3084) {
            this.field3086.seek(this.field3084 + 1L);
            this.field3086.write(1);
            throw new EOFException();
        }
        this.field3086.write(arg2, arg3, arg0);
        if (arg1 != 79) {
            this.method1374(33);
        }
        this.field3085 += (long) arg0;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)Ljava/io/File;", line = 65)
    public final File method1374(int arg0) {
        return arg0 == 0 ? this.field3083 : (File) null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IJ)V", line = 77)
    public final void method1375(int arg0, long arg1) throws IOException {
        this.field3086.seek(arg1);
        this.field3085 = arg1;
        if (arg0 != 0) {
            this.method1374(-26);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(I)V", line = 89)
    public final void method1376(int arg0) throws IOException {
        if (this.field3086 != null) {
            this.field3086.close();
            this.field3086 = null;
        }
        if (arg0 != -1) {
            this.method1374(-38);
        }
    }
}
