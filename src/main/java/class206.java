import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class206 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "J")
    private long field3738;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "J")
    private long field3741;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "Ljava/io/File;")
    private File field3740;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3739;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I[BII)V")
    public final void method1422(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg0 + this.field3738 > this.field3741) {
            this.field3739.seek(this.field3741 + 1L);
            this.field3739.write(1);
            throw new EOFException();
        }
        this.field3739.write(arg1, arg3, arg0);
        this.field3738 += (long) arg0;
        if (arg2 != -12996) {
            this.method1425((byte) 19);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III[B)I")
    public final int method1423(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field3739.read(arg3, arg0, arg1);
        if (arg2 != 1) {
            this.field3740 = null;
        }
        if (var5 > 0) {
            this.field3738 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!pa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3739 != null) {
            System.out.println("Warning! fileondisk " + this.field3740 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1426(-10272);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)J")
    public final long method1424(int arg0) throws IOException {
        int var2 = -37 % ((2 - arg0) / 45);
        return this.field3739.length();
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1425(byte arg0) {
        if (arg0 <= 39) {
            this.method1425((byte) -94);
        }
        return this.field3740;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public final void method1426(int arg0) throws IOException {
        if (arg0 != -10272) {
            this.field3741 = -91L;
        }
        if (this.field3739 != null) {
            this.field3739.close();
            this.field3739 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(JB)V")
    public final void method1427(long arg0, byte arg1) throws IOException {
        this.field3739.seek(arg0);
        this.field3738 = arg0;
        if (arg1 > -98) {
            this.field3738 = 16L;
        }
    }
}
