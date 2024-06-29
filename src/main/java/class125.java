import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class125 {

    @OriginalMember(owner = "client!th", name = "b", descriptor = "J")
    private long field1755;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "J")
    private long field1757;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Ljava/io/File;")
    private File field1754;

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1756;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "([BBII)V")
    public final void method798(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 != -39) {
            this.field1755 = 115L;
        }
        if (((long) arg2 + this.field1755) > this.field1757) {
            this.field1756.seek(this.field1757);
            this.field1756.write(1);
            throw new EOFException();
        } else {
            this.field1756.write(arg0, arg3, arg2);
            this.field1755 += (long) arg2;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)J")
    public final long method799(int arg0) throws IOException {
        if (arg0 != -20975) {
            this.field1754 = null;
        }
        return this.field1756.length();
    }

    @OriginalMember(owner = "client!th", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1756 != null) {
            System.out.println("Warning! fileondisk " + this.field1754 + " not closed correctly using close(). Auto-closing instead. ");
            this.method802(0);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method800(int arg0) {
        return arg0 >= -8 ? null : this.field1754;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I[BBI)I")
    public final int method801(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        int var5 = this.field1756.read(arg1, arg0, arg3);
        if (var5 > 0) {
            this.field1755 += (long) var5;
        }
        return arg2 <= 78 ? -32 : var5;
    }

    @OriginalMember(owner = "client!th", name = "c", descriptor = "(I)V")
    public final void method802(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field1754 = null;
        }
        if (this.field1756 != null) {
            this.field1756.close();
            this.field1756 = null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IJ)V")
    public final void method803(int arg0, long arg1) throws IOException {
        this.field1756.seek(arg1);
        if (arg0 == 1) {
            this.field1755 = arg1;
        }
    }
}
