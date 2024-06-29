import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class231 {

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "J")
    private long field3666;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "J")
    private long field3667;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Ljava/io/File;")
    private File field3665;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3664;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(III[B)I", line = 5)
    public final int method1553(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field3664.read(arg3, arg0, arg2);
        if (var5 > 0) {
            this.field3667 += (long) var5;
        }
        if (arg1 != 0) {
            this.method1554(-4);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)Ljava/io/File;", line = 19)
    public final File method1554(int arg0) {
        return arg0 > -8 ? (File) null : this.field3665;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(I)V", line = 34)
    public final void method1555(int arg0) throws IOException {
        if (this.field3664 != null) {
            this.field3664.close();
            this.field3664 = null;
        }
        if (arg0 != 1) {
            this.field3667 = -32L;
        }
    }

    @OriginalMember(owner = "client!qm", name = "finalize", descriptor = "()V", line = 50)
    protected final void finalize() throws Throwable {
        if (this.field3664 != null) {
            System.out.println("Warning! fileondisk " + this.field3665 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1555(1);
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)J", line = 62)
    public final long method1556(int arg0) throws IOException {
        if (arg0 != -1) {
            this.field3666 = -118L;
        }
        return this.field3664.length();
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BJ)V", line = 73)
    public final void method1557(byte arg0, long arg1) throws IOException {
        this.field3664.seek(arg1);
        this.field3667 = arg1;
        if (arg0 != -10) {
            this.field3667 = 83L;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I[BII)V", line = 85)
    public final void method1558(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg0 < 105) {
            this.method1554(63);
        }
        if (this.field3666 >= ((long) arg2 + this.field3667)) {
            this.field3664.write(arg1, arg3, arg2);
            this.field3667 += (long) arg2;
        } else {
            this.field3664.seek(this.field3666 + 1L);
            this.field3664.write(1);
            throw new EOFException();
        }
    }
}
