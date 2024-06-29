import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class141 {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "J")
    private long field2359;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "J")
    private long field2361;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "Ljava/io/File;")
    private File field2360;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2358;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 6)
    public final void method1038(int arg0) throws IOException {
        if (arg0 != -1) {
            this.method1039(-123);
        }
        if (this.field2358 != null) {
            this.field2358.close();
            this.field2358 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)Ljava/io/File;", line = 21)
    public final File method1039(int arg0) {
        if (arg0 != 0) {
            this.method1039(17);
        }
        return this.field2360;
    }

    @OriginalMember(owner = "client!nc", name = "finalize", descriptor = "()V", line = 31)
    protected final void finalize() throws Throwable {
        if (this.field2358 != null) {
            System.out.println("Warning! fileondisk " + this.field2360 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1038(-1);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([BIIB)I", line = 44)
    public final int method1040(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if (arg3 != 127) {
            return -65;
        }
        int var5 = this.field2358.read(arg0, arg1, arg2);
        if (var5 > 0) {
            this.field2359 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)J", line = 61)
    public final long method1041(byte arg0) throws IOException {
        if (arg0 <= 10) {
            this.field2358 = (RandomAccessFile) null;
        }
        return this.field2358.length();
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(JB)V", line = 73)
    public final void method1042(long arg0, byte arg1) throws IOException {
        int var4 = -36 / ((-arg1 - 60) / 38);
        this.field2358.seek(arg0);
        this.field2359 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[BBI)V", line = 82)
    public final void method1043(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (arg2 >= 0) {
            return;
        }
        if (this.field2361 < ((long) arg0 + this.field2359)) {
            this.field2358.seek(this.field2361 + 1L);
            this.field2358.write(1);
            throw new EOFException();
        } else {
            this.field2358.write(arg1, arg3, arg0);
            this.field2359 += (long) arg0;
        }
    }
}
