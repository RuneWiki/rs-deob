import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class8 {

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "J")
    private long field64;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "J")
    private long field67;

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "Ljava/io/File;")
    private File field65;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field66;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([BIII)I", line = 5)
    public final int method47(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field66.read(arg0, arg3, arg2);
        if (var5 > 0) {
            this.field64 += (long) var5;
        }
        if (arg1 != 247) {
            this.method49(91);
        }
        return var5;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 19)
    public final void method48(int arg0) throws IOException {
        if (arg0 < 23) {
            this.method49(-66);
        }
        if (this.field66 != null) {
            this.field66.close();
            this.field66 = null;
        }
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)Ljava/io/File;", line = 36)
    public final File method49(int arg0) {
        return arg0 == 15469 ? this.field65 : (File) null;
    }

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)J", line = 46)
    public final long method50(int arg0) throws IOException {
        if (arg0 != 1) {
            this.field64 = -74L;
        }
        return this.field66.length();
    }

    @OriginalMember(owner = "client!qk", name = "finalize", descriptor = "()V", line = 57)
    protected final void finalize() throws Throwable {
        if (this.field66 != null) {
            System.out.println("Warning! fileondisk " + this.field65 + " not closed correctly using close(). Auto-closing instead. ");
            this.method48(39);
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IJ)V", line = 70)
    public final void method51(int arg0, long arg1) throws IOException {
        if (arg0 >= -38) {
            this.method49(11);
        }
        this.field66.seek(arg1);
        this.field64 = arg1;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(III[B)V", line = 83)
    public final void method52(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (((long) arg2 + this.field64) > this.field67) {
            this.field66.seek(this.field67 + 1L);
            this.field66.write(1);
            throw new EOFException();
        }
        this.field66.write(arg3, arg0, arg2);
        this.field64 += (long) arg2;
        if (arg1 != 0) {
            this.field65 = (File) null;
        }
    }
}
