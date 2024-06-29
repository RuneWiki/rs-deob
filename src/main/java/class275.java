import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class275 {

    @OriginalMember(owner = "client!a", name = "b", descriptor = "J")
    private long field4221;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "J")
    private long field4223;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Ljava/io/File;")
    private File field4220;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4222;

    @OriginalMember(owner = "client!a", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        if (this.field4222 != null) {
            System.out.println("Warning! fileondisk " + this.field4220 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1921(0);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([BIII)I", line = 18)
    public final int method1919(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field4222.read(arg0, arg3, arg2);
        if (var5 > arg1) {
            this.field4223 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(III[B)V", line = 30)
    public final void method1920(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg1 + this.field4223 > this.field4221) {
            this.field4222.seek(this.field4221);
            this.field4222.write(1);
            throw new EOFException();
        }
        this.field4222.write(arg3, arg2, arg1);
        this.field4223 += (long) arg1;
        if (arg0 != 1709) {
            this.method1924((byte) -34);
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V", line = 51)
    public final void method1921(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method1924((byte) 98);
        }
        if (this.field4222 != null) {
            this.field4222.close();
            this.field4222 = null;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(JB)V", line = 67)
    public final void method1922(long arg0, byte arg1) throws IOException {
        this.field4222.seek(arg0);
        this.field4223 = arg0;
        if (arg1 < 100) {
            this.method1924((byte) -55);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)J", line = 79)
    public final long method1923(int arg0) throws IOException {
        if (arg0 <= 10) {
            this.field4222 = (RandomAccessFile) null;
        }
        return this.field4222.length();
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Ljava/io/File;", line = 89)
    public final File method1924(byte arg0) {
        if (arg0 < 27) {
            this.method1924((byte) 42);
        }
        return this.field4220;
    }
}
