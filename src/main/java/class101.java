import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class101 {

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "J")
    private long field1298;

    @OriginalMember(owner = "client!ri", name = "d", descriptor = "J")
    private long field1301;

    @OriginalMember(owner = "client!ri", name = "c", descriptor = "Ljava/io/File;")
    private File field1300;

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1299;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B)J")
    public final long method679(byte arg0) throws IOException {
        return arg0 < 52 ? -113L : this.field1299.length();
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method680(int arg0) {
        if (arg0 != 1) {
            this.method680(96);
        }
        return this.field1300;
    }

    @OriginalMember(owner = "client!ri", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1299 != null) {
            System.out.println("Warning! fileondisk " + this.field1300 + " not closed correctly using close(). Auto-closing instead. ");
            this.method681((byte) 65);
        }
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(B)V")
    public final void method681(byte arg0) throws IOException {
        if (this.field1299 != null) {
            this.field1299.close();
            this.field1299 = null;
        }
        if (arg0 != 65) {
            this.field1299 = null;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IJ)V")
    public final void method682(int arg0, long arg1) throws IOException {
        this.field1299.seek(arg1);
        int var4 = 56 % ((56 - arg0) / 38);
        this.field1301 = arg1;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II[BI)I")
    public final int method683(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field1299.read(arg2, arg0, arg3);
        if (var5 > arg1) {
            this.field1301 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(III[B)V")
    public final void method684(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if ((long) arg1 + this.field1301 > this.field1298) {
            this.field1299.seek(this.field1298);
            this.field1299.write(1);
            throw new EOFException();
        }
        this.field1299.write(arg3, arg0, arg1);
        if (arg2 < 0) {
            this.method680(-5);
        }
        this.field1301 += (long) arg1;
    }
}
