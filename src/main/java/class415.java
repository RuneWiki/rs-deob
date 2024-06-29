import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class415 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "J")
    private long field6254;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "J")
    private long field6256;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Ljava/io/File;")
    private File field6253;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field6255;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)J", line = 5)
    public final long method2484(int arg0) throws IOException {
        if (arg0 < 52) {
            this.field6255 = null;
        }
        return this.field6255.length();
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 15)
    public final void method2485(int arg0) throws IOException {
        if (this.field6255 != null) {
            this.field6255.close();
            this.field6255 = null;
        }
        if (arg0 <= 64) {
            this.field6256 = 104L;
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)Ljava/io/File;", line = 31)
    public final File method2486(int arg0) {
        if (arg0 != 0) {
            this.method2486(68);
        }
        return this.field6253;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IJ)V", line = 42)
    public final void method2487(int arg0, long arg1) throws IOException {
        this.field6255.seek(arg1);
        if (arg0 != 0) {
            this.method2486(125);
        }
        this.field6254 = arg1;
    }

    @OriginalMember(owner = "client!wi", name = "finalize", descriptor = "()V", line = 53)
    protected final void finalize() throws Throwable {
        if (this.field6255 != null) {
            System.out.println("Warning! fileondisk " + this.field6253 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2485(98);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[BII)I", line = 66)
    public final int method2488(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field6255.read(arg1, arg0, arg3);
        if (arg2 < var5) {
            this.field6254 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III[B)V", line = 84)
    public final void method2489(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field6256 < ((long) arg2 + this.field6254)) {
            this.field6255.seek(this.field6256);
            this.field6255.write(1);
            throw new EOFException();
        }
        this.field6255.write(arg3, arg0, arg2);
        this.field6254 += arg2;
        if (arg1 != 0) {
            this.field6255 = null;
        }
    }
}
