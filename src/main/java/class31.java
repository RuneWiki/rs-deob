import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class31 {

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "J")
    private long field506;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "J")
    private long field507;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "Ljava/io/File;")
    private File field509;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field508;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 4)
    public final void method177(byte arg0) throws IOException {
        if (this.field508 != null) {
            this.field508.close();
            this.field508 = null;
        }
        if (arg0 >= -53) {
            this.method180(-123);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BBI)V", line = 19)
    public final void method178(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (this.field506 < ((long) arg3 + this.field507)) {
            this.field508.seek(this.field506 + 1L);
            this.field508.write(1);
            throw new EOFException();
        }
        this.field508.write(arg1, arg0, arg3);
        if (arg2 != -13) {
            this.field508 = (RandomAccessFile) null;
        }
        this.field507 += (long) arg3;
    }

    @OriginalMember(owner = "client!kb", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() throws Throwable {
        if (this.field508 != null) {
            System.out.println("Warning! fileondisk " + this.field509 + " not closed correctly using close(). Auto-closing instead. ");
            this.method177((byte) -55);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)J", line = 53)
    public final long method179(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field509 = (File) null;
        }
        return this.field508.length();
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)Ljava/io/File;", line = 64)
    public final File method180(int arg0) {
        if (arg0 != 1) {
            this.method180(-92);
        }
        return this.field509;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)V", line = 74)
    public final void method181(long arg0, int arg1) throws IOException {
        this.field508.seek(arg0);
        this.field507 = arg0;
        if (arg1 != 9276) {
            this.method180(-47);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BIZ)I", line = 86)
    public final int method182(int arg0, byte[] arg1, int arg2, boolean arg3) throws IOException {
        int var5 = this.field508.read(arg1, arg2, arg0);
        if (arg3) {
            this.method180(100);
        }
        if (var5 > 0) {
            this.field507 += (long) var5;
        }
        return var5;
    }
}
