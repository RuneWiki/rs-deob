import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class132 {

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "J")
    private long field1933;

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "J")
    private long field1934;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Ljava/io/File;")
    private File field1932;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1935;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(B)V")
    public final void method898(byte arg0) throws IOException {
        if (this.field1935 != null) {
            this.field1935.close();
            this.field1935 = null;
        }
        if (arg0 != 5) {
            this.method900((byte) -39);
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BJ)V")
    public final void method899(byte arg0, long arg1) throws IOException {
        this.field1935.seek(arg1);
        this.field1934 = arg1;
        if (arg0 != 125) {
            this.method900((byte) -70);
        }
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method900(byte arg0) {
        if (arg0 != -113) {
            this.field1933 = -119L;
        }
        return this.field1932;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)J")
    public final long method901(boolean arg0) throws IOException {
        return arg0 ? this.field1935.length() : -74L;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II[BI)V")
    public final void method902(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1933 < ((long) arg1 + this.field1934)) {
            this.field1935.seek(this.field1933);
            this.field1935.write(1);
            throw new EOFException();
        }
        if (arg0 != 0) {
            this.method900((byte) 76);
        }
        this.field1935.write(arg2, arg3, arg1);
        this.field1934 += (long) arg1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(III[B)I")
    public final int method903(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field1935.read(arg3, arg0, arg1);
        int var6 = 52 / ((arg2 - 40) / 53);
        if (var5 > 0) {
            this.field1934 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1935 != null) {
            System.out.println("Warning! fileondisk " + this.field1932 + " not closed correctly using close(). Auto-closing instead. ");
            this.method898((byte) 5);
        }
    }
}
