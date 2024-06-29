import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class167 {

    @OriginalMember(owner = "client!le", name = "b", descriptor = "J")
    private long field2345;

    @OriginalMember(owner = "client!le", name = "d", descriptor = "J")
    private long field2347;

    @OriginalMember(owner = "client!le", name = "c", descriptor = "Ljava/io/File;")
    private File field2346;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2344;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(III[B)V")
    public final void method1103(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg1 + this.field2347 > this.field2345) {
            this.field2344.seek(this.field2345);
            this.field2344.write(1);
            throw new EOFException();
        }
        this.field2344.write(arg3, arg2, arg1);
        this.field2347 += (long) arg1;
        if (arg0 != -1) {
            this.field2344 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(JI)V")
    public final void method1104(long arg0, int arg1) throws IOException {
        this.field2344.seek(arg0);
        this.field2347 = arg0;
        if (arg1 != -1) {
            this.field2346 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2344 != null) {
            System.out.println("Warning! fileondisk " + this.field2346 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1107((byte) -111);
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method1105(boolean arg0) {
        if (!arg0) {
            this.method1105(false);
        }
        return this.field2346;
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(I)J")
    public final long method1106(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method1105(false);
        }
        return this.field2344.length();
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(B)V")
    public final void method1107(byte arg0) throws IOException {
        if (arg0 <= -100 && this.field2344 != null) {
            this.field2344.close();
            this.field2344 = null;
        }
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "([BBII)I")
    public final int method1108(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2344.read(arg0, arg2, arg3);
        if (arg1 != -51) {
            this.method1105(true);
        }
        if (var5 > 0) {
            this.field2347 += (long) var5;
        }
        return var5;
    }
}
