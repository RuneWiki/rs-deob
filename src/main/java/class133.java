import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eo")
public class class133 {

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "J")
    private long field2032;

    @OriginalMember(owner = "client!eo", name = "b", descriptor = "J")
    private long field2033;

    @OriginalMember(owner = "client!eo", name = "d", descriptor = "Ljava/io/File;")
    private File field2035;

    @OriginalMember(owner = "client!eo", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2034;

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I)Ljava/io/File;", line = 4)
    public final File method863(int arg0) {
        if (arg0 > -11) {
            this.method863(-19);
        }
        return this.field2035;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "([BBII)I", line = 15)
    public final int method864(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2034.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field2033 += (long) var5;
        }
        if (arg1 != 27) {
            this.field2034 = (RandomAccessFile) null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(B)V", line = 30)
    public final void method865(byte arg0) throws IOException {
        if (arg0 != -113) {
            this.method863(-92);
        }
        if (this.field2034 != null) {
            this.field2034.close();
            this.field2034 = null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(I[BII)V", line = 49)
    public final void method866(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = -6 / ((-arg2 - 38) / 44);
        if (this.field2032 >= ((long) arg0 + this.field2033)) {
            this.field2034.write(arg1, arg3, arg0);
            this.field2033 += (long) arg0;
        } else {
            this.field2034.seek(this.field2032);
            this.field2034.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(Z)J", line = 66)
    public final long method867(boolean arg0) throws IOException {
        return arg0 ? 114L : this.field2034.length();
    }

    @OriginalMember(owner = "client!eo", name = "a", descriptor = "(IJ)V", line = 76)
    public final void method868(int arg0, long arg1) throws IOException {
        this.field2034.seek(arg1);
        this.field2033 = arg1;
        if (arg0 != 0) {
            this.field2034 = (RandomAccessFile) null;
        }
    }

    @OriginalMember(owner = "client!eo", name = "finalize", descriptor = "()V", line = 90)
    protected final void finalize() throws Throwable {
        if (this.field2034 != null) {
            System.out.println("Warning! fileondisk " + this.field2035 + " not closed correctly using close(). Auto-closing instead. ");
            this.method865((byte) -113);
        }
    }
}
