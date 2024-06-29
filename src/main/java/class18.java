import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class18 {

    @OriginalMember(owner = "client!af", name = "b", descriptor = "J")
    private long field206;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "J")
    private long field208;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "Ljava/io/File;")
    private File field207;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field205;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)Ljava/io/File;", line = 5)
    public final File method99(byte arg0) {
        return arg0 == -105 ? this.field207 : (File) null;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Z)J", line = 16)
    public final long method100(boolean arg0) throws IOException {
        if (arg0) {
            this.field205 = (RandomAccessFile) null;
        }
        return this.field205.length();
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(Z)V", line = 28)
    public final void method101(boolean arg0) throws IOException {
        if (this.field205 != null) {
            this.field205.close();
            this.field205 = null;
        }
        if (arg0) {
            this.method99((byte) 22);
        }
    }

    @OriginalMember(owner = "client!af", name = "finalize", descriptor = "()V", line = 44)
    protected final void finalize() throws Throwable {
        if (this.field205 != null) {
            System.out.println("Warning! fileondisk " + this.field207 + " not closed correctly using close(). Auto-closing instead. ");
            this.method101(false);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IJ)V", line = 59)
    public final void method102(int arg0, long arg1) throws IOException {
        this.field205.seek(arg1);
        this.field206 = arg1;
        if (arg0 != 0) {
            this.field206 = -28L;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I[BII)I", line = 71)
    public final int method103(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field205.read(arg1, arg2, arg3);
        if (arg0 > ~var5) {
            this.field206 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(BI[BI)V", line = 83)
    public final void method104(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field208 < ((long) arg1 + this.field206)) {
            this.field205.seek(this.field208);
            this.field205.write(1);
            throw new EOFException();
        }
        this.field205.write(arg2, arg3, arg1);
        if (arg0 != 41) {
            this.field208 = -82L;
        }
        this.field206 += (long) arg1;
    }
}
