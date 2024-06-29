import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class184 {

    @OriginalMember(owner = "client!um", name = "b", descriptor = "J")
    private long field2717;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "J")
    private long field2719;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Ljava/io/File;")
    private File field2718;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2716;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 3)
    public final void method1431(int arg0) throws IOException {
        if (arg0 != -1) {
            this.method1432((byte) 12);
        }
        if (this.field2716 != null) {
            this.field2716.close();
            this.field2716 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Ljava/io/File;", line = 23)
    public final File method1432(byte arg0) {
        return arg0 == 94 ? this.field2718 : null;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(JB)V", line = 33)
    public final void method1433(long arg0, byte arg1) throws IOException {
        if (arg1 >= -127) {
            this.method1432((byte) -47);
        }
        this.field2716.seek(arg0);
        this.field2719 = arg0;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(II[BI)I", line = 45)
    public final int method1434(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 < 85) {
            this.field2716 = null;
        }
        int var5 = this.field2716.read(arg2, arg3, arg0);
        if (var5 > 0) {
            this.field2719 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!um", name = "finalize", descriptor = "()V", line = 60)
    protected final void finalize() throws Throwable {
        if (this.field2716 != null) {
            System.out.println("Warning! fileondisk " + this.field2718 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1431(-1);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)J", line = 72)
    public final long method1435(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field2719 = 63L;
        }
        return this.field2716.length();
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(II[BI)V", line = 82)
    public final void method1436(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field2717 < ((long) arg0 + this.field2719)) {
            this.field2716.seek(this.field2717);
            this.field2716.write(1);
            throw new EOFException();
        }
        this.field2716.write(arg2, arg1, arg0);
        this.field2719 += (long) arg0;
        if (arg3 != 1) {
            this.field2718 = null;
        }
    }
}
