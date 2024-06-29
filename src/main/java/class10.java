import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class10 {

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "J")
    private long field162;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "J")
    private long field164;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Ljava/io/File;")
    private File field163;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field161;

    @OriginalMember(owner = "client!oe", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        if (this.field161 != null) {
            System.out.println("Warning! fileondisk " + this.field163 + " not closed correctly using close(). Auto-closing instead. ");
            this.method59(1);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)J", line = 18)
    public final long method57(byte arg0) throws IOException {
        if (arg0 != 61) {
            this.field161 = (RandomAccessFile) null;
        }
        return this.field161.length();
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Ljava/io/File;", line = 29)
    public final File method58(byte arg0) {
        int var2 = -5 % ((51 - arg0) / 54);
        return this.field163;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V", line = 37)
    public final void method59(int arg0) throws IOException {
        if (arg0 != 1) {
            this.method58((byte) 43);
        }
        if (this.field161 != null) {
            this.field161.close();
            this.field161 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([BIII)V", line = 53)
    public final void method60(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (((long) arg1 + this.field164) > this.field162) {
            this.field161.seek(this.field162);
            this.field161.write(1);
            throw new EOFException();
        }
        this.field161.write(arg0, arg2, arg1);
        if (arg3 <= 0) {
            this.method58((byte) 28);
        }
        this.field164 += (long) arg1;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BJ)V", line = 73)
    public final void method61(byte arg0, long arg1) throws IOException {
        this.field161.seek(arg1);
        if (arg0 == -87) {
            this.field164 = arg1;
        }
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "([BIII)I", line = 87)
    public final int method62(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field161.read(arg0, arg2, arg3);
        if (~var5 < arg1) {
            this.field164 += (long) var5;
        }
        return var5;
    }
}
