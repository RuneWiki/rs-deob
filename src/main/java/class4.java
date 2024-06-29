import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 {

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "J")
    private long field28;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "J")
    private long field29;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Ljava/io/File;")
    private File field27;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field30;

    @OriginalMember(owner = "client!qc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field30 != null) {
            System.out.println("Warning! fileondisk " + this.field27 + " not closed correctly using close(). Auto-closing instead. ");
            this.method50(1);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)J")
    public final long method49(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method54((byte) -82);
        }
        return this.field30.length();
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
    public final void method50(int arg0) throws IOException {
        if (arg0 == 1 && this.field30 != null) {
            this.field30.close();
            this.field30 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[BB)I")
    public final int method51(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        int var5 = this.field30.read(arg2, arg0, arg1);
        if (arg3 != 90) {
            this.method54((byte) 27);
        }
        if (var5 > 0) {
            this.field28 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II[BI)V")
    public final void method52(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 != 1) {
            this.method54((byte) -98);
        }
        if ((long) arg3 + this.field28 > this.field29) {
            this.field30.seek(this.field29);
            this.field30.write(1);
            throw new EOFException();
        } else {
            this.field30.write(arg2, arg1, arg3);
            this.field28 += (long) arg3;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IJ)V")
    public final void method53(int arg0, long arg1) throws IOException {
        if (arg0 == -26525) {
            this.field30.seek(arg1);
            this.field28 = arg1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method54(byte arg0) {
        if (arg0 != -65) {
            this.method54((byte) -62);
        }
        return this.field27;
    }
}
