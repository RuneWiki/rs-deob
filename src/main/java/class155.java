import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class155 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2674;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "J")
    private long field2671;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "J")
    private long field2673;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Ljava/io/File;")
    private File field2672;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)J")
    public final long method1015(int arg0) throws IOException {
        return arg0 == 26277 ? this.field2674.length() : -64L;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I[BII)V")
    public final void method1016(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 != 1) {
            this.method1019(false);
        }
        if (this.field2671 < ((long) arg3 + this.field2673)) {
            this.field2674.seek(this.field2671 + 1L);
            this.field2674.write(1);
            throw new EOFException();
        } else {
            this.field2674.write(arg1, arg0, arg3);
            this.field2673 += (long) arg3;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZJ)V")
    public final void method1017(boolean arg0, long arg1) throws IOException {
        this.field2674.seek(arg1);
        if (arg0) {
            this.field2674 = null;
        }
        this.field2673 = arg1;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Z)V")
    public final void method1018(boolean arg0) throws IOException {
        if (!arg0) {
            this.field2673 = 39L;
        }
        if (this.field2674 != null) {
            this.field2674.close();
            this.field2674 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(Z)Ljava/io/File;")
    public final File method1019(boolean arg0) {
        if (arg0) {
            this.method1019(false);
        }
        return this.field2672;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III[B)I")
    public final int method1020(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field2674.read(arg3, arg2, arg0);
        if (var5 > arg1) {
            this.field2673 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class155(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2674 = new RandomAccessFile(arg0, arg1);
        this.field2671 = arg2;
        this.field2673 = 0L;
        this.field2672 = arg0;
        int var5 = this.field2674.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2674.seek(0L);
            this.field2674.write(var5);
        }
        this.field2674.seek(0L);
    }

    @OriginalMember(owner = "client!oj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2674 != null) {
            System.out.println("Warning! fileondisk " + this.field2672 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1018(true);
        }
    }
}
