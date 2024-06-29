import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class468 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "J")
    private long field6468;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "J")
    private long field6470;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Ljava/io/File;")
    private File field6469;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6467;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V", line = 3)
    public final void method2748(byte arg0) throws IOException {
        int var2 = -120 / ((61 - arg0) / 43);
        if (this.field6467 != null) {
            this.field6467.close();
            this.field6467 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[BZ)I", line = 19)
    public final int method2749(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        if (!arg3) {
            return -12;
        }
        int var5 = this.field6467.read(arg2, arg1, arg0);
        if (var5 > 0) {
            this.field6470 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V", line = 36)
    protected final void finalize() throws Throwable {
        if (this.field6467 != null) {
            System.out.println("Warning! fileondisk " + this.field6469 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2748((byte) -85);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I[BII)V", line = 49)
    public final void method2750(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field6468 < ((long) arg2 + this.field6470)) {
            this.field6467.seek(this.field6468);
            this.field6467.write(1);
            throw new EOFException();
        }
        if (arg0 != 0) {
            this.method2753(-124);
        }
        this.field6467.write(arg1, arg3, arg2);
        this.field6470 += (long) arg2;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)J", line = 68)
    public final long method2751(byte arg0) throws IOException {
        return arg0 == -127 ? this.field6467.length() : -47L;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IJ)V", line = 78)
    public final void method2752(int arg0, long arg1) throws IOException {
        this.field6467.seek(arg1);
        if (arg0 == 27836) {
            this.field6470 = arg1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)Ljava/io/File;", line = 89)
    public final File method2753(int arg0) {
        return arg0 == 428 ? this.field6469 : null;
    }
}
