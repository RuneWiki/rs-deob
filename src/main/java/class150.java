import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class150 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2789;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "Ljava/io/File;")
    private File field2787;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "J")
    private long field2788;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "J")
    private long field2786;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II[BI)V")
    public final void method1124(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field2786 < ((long) arg3 + this.field2788)) {
            this.field2789.seek(this.field2786 + 1L);
            this.field2789.write(1);
            throw new EOFException();
        } else {
            int var5 = -19 / ((arg1 - 26) / 39);
            this.field2789.write(arg2, arg0, arg3);
            this.field2788 += (long) arg3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1125(byte arg0) {
        return arg0 == -32 ? this.field2787 : null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)J")
    public final long method1126(int arg0) throws IOException {
        if (arg0 < 8) {
            this.field2787 = null;
        }
        return this.field2789.length();
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(JI)V")
    public final void method1127(long arg0, int arg1) throws IOException {
        if (arg1 != 13455) {
            this.field2789 = null;
        }
        this.field2789.seek(arg0);
        this.field2788 = arg0;
    }

    @OriginalMember(owner = "client!ib", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2789 != null) {
            System.out.println("Warning! fileondisk " + this.field2787 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1129(1);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I[BII)I")
    public final int method1128(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2789.read(arg1, arg0, arg3);
        if (arg2 > ~var5) {
            this.field2788 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class150(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2789 = new RandomAccessFile(arg0, arg1);
        this.field2787 = arg0;
        this.field2788 = 0L;
        this.field2786 = arg2;
        int var5 = this.field2789.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2789.seek(0L);
            this.field2789.write(var5);
        }
        this.field2789.seek(0L);
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V")
    public final void method1129(int arg0) throws IOException {
        if (arg0 == 1 && this.field2789 != null) {
            this.field2789.close();
            this.field2789 = null;
        }
    }
}
