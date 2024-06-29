import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class8 {

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "J")
    private long field95;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "J")
    private long field96;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Ljava/io/File;")
    private File field93;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field94;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method47(byte arg0) {
        if (arg0 < 49) {
            this.field96 = -101L;
        }
        return this.field93;
    }

    @OriginalMember(owner = "client!jf", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field94 != null) {
            System.out.println("Warning! fileondisk " + this.field93 + " not closed correctly using close(). Auto-closing instead. ");
            this.method51(-125);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B[BII)I")
    public final int method48(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field94.read(arg1, arg3, arg2);
        int var6 = -84 / ((-arg0 - 49) / 62);
        if (var5 > 0) {
            this.field95 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I[BII)V")
    public final void method49(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field96 < ((long) arg0 + this.field95)) {
            this.field94.seek(this.field96);
            this.field94.write(1);
            throw new EOFException();
        }
        this.field94.write(arg1, arg3, arg0);
        this.field95 += (long) arg0;
        if (arg2 != -1) {
            this.field94 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)J")
    public final long method50(int arg0) throws IOException {
        if (arg0 <= 24) {
            this.method47((byte) -37);
        }
        return this.field94.length();
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public final void method51(int arg0) throws IOException {
        if (arg0 >= -107) {
            this.field95 = -21L;
        }
        if (this.field94 != null) {
            this.field94.close();
            this.field94 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IJ)V")
    public final void method52(int arg0, long arg1) throws IOException {
        this.field94.seek(arg1);
        this.field95 = arg1;
        if (arg0 < 115) {
            this.method47((byte) -115);
        }
    }
}
