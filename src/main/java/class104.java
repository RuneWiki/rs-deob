import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class104 {

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "J")
    private long field1851;

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "J")
    private long field1853;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Ljava/io/File;")
    private File field1854;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1852;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BJ)V")
    public final void method748(byte arg0, long arg1) throws IOException {
        int var4 = 59 % ((-arg0 - 36) / 45);
        this.field1852.seek(arg1);
        this.field1851 = arg1;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method749(int arg0) {
        if (arg0 != 0) {
            this.method749(54);
        }
        return this.field1854;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IBI[B)I")
    public final int method750(int arg0, byte arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field1852.read(arg3, arg2, arg0);
        if (var5 > 0) {
            this.field1851 += (long) var5;
        }
        return arg1 == 36 ? var5 : 91;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(B)V")
    public final void method751(byte arg0) throws IOException {
        if (arg0 != 36) {
            this.field1852 = null;
        }
        if (this.field1852 != null) {
            this.field1852.close();
            this.field1852 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(B)J")
    public final long method752(byte arg0) throws IOException {
        return arg0 == 107 ? this.field1852.length() : 48L;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI[BI)V")
    public final void method753(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field1853 < (long) arg3 + this.field1851) {
            this.field1852.seek(this.field1853 + 1L);
            this.field1852.write(1);
            throw new EOFException();
        }
        this.field1852.write(arg2, arg1, arg3);
        this.field1851 += (long) arg3;
        if (arg0 != 98) {
            this.method749(119);
        }
    }

    @OriginalMember(owner = "client!jj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1852 != null) {
            System.out.println("Warning! fileondisk " + this.field1854 + " not closed correctly using close(). Auto-closing instead. ");
            this.method751((byte) 36);
        }
    }
}
