import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class169 {

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
    private long field2496;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "J")
    private long field2497;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "Ljava/io/File;")
    private File field2499;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2498;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IJ)V")
    public final void method1043(int arg0, long arg1) throws IOException {
        this.field2498.seek(arg1);
        this.field2496 = arg1;
        if (arg0 != 0) {
            this.method1047((byte) -126);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V")
    public final void method1044(boolean arg0) throws IOException {
        if (this.field2498 != null) {
            this.field2498.close();
            this.field2498 = null;
        }
        if (!arg0) {
            this.method1047((byte) -119);
        }
    }

    @OriginalMember(owner = "client!sb", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2498 != null) {
            System.out.println("Warning! fileondisk " + this.field2499 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1044(true);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)J")
    public final long method1045(int arg0) throws IOException {
        return arg0 > -123 ? -41L : this.field2498.length();
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IIZ[B)I")
    public final int method1046(int arg0, int arg1, boolean arg2, byte[] arg3) throws IOException {
        int var5 = this.field2498.read(arg3, arg1, arg0);
        if (arg2) {
            if (var5 > 0) {
                this.field2496 += (long) var5;
            }
            return var5;
        } else {
            return 61;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1047(byte arg0) {
        return arg0 <= 16 ? null : this.field2499;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[BIZ)V")
    public final void method1048(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        if (this.field2497 < ((long) arg2 + this.field2496)) {
            this.field2498.seek(this.field2497);
            this.field2498.write(1);
            throw new EOFException();
        }
        this.field2498.write(arg1, arg0, arg2);
        if (arg3) {
            this.method1047((byte) -7);
        }
        this.field2496 += (long) arg2;
    }
}
