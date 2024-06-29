import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class222 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "J")
    private long field3825;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "J")
    private long field3828;

    @OriginalMember(owner = "client!td", name = "b", descriptor = "Ljava/io/File;")
    private File field3826;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3827;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "([BIZI)I", line = 6)
    public final int method1500(byte[] arg0, int arg1, boolean arg2, int arg3) throws IOException {
        if (arg2) {
            this.field3825 = 121L;
        }
        int var5 = this.field3827.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field3828 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V", line = 22)
    public final void method1501(boolean arg0) throws IOException {
        if (arg0 && this.field3827 != null) {
            this.field3827.close();
            this.field3827 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        if (this.field3827 != null) {
            System.out.println("Warning! fileondisk " + this.field3826 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1501(true);
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(IIB[B)V", line = 51)
    public final void method1502(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (this.field3825 >= (long) arg0 + this.field3828) {
            this.field3827.write(arg3, arg1, arg0);
            int var5 = 33 / ((7 - arg2) / 55);
            this.field3828 += (long) arg0;
        } else {
            this.field3827.seek(this.field3825 + 1L);
            this.field3827.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)Ljava/io/File;", line = 70)
    public final File method1503(byte arg0) {
        int var2 = -80 / ((arg0 - 31) / 37);
        return this.field3826;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BJ)V", line = 78)
    public final void method1504(byte arg0, long arg1) throws IOException {
        if (arg0 < 51) {
            this.field3827 = (RandomAccessFile) null;
        }
        this.field3827.seek(arg1);
        this.field3828 = arg1;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)J", line = 90)
    public final long method1505(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field3827 = (RandomAccessFile) null;
        }
        return this.field3827.length();
    }
}
