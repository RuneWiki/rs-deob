import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class95 {

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "J")
    private long field1799;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "J")
    private long field1801;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Ljava/io/File;")
    private File field1798;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1800;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method612(int arg0) {
        int var2 = 75 % ((arg0 + 18) / 38);
        return this.field1798;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(BJ)V")
    public final void method613(byte arg0, long arg1) throws IOException {
        this.field1800.seek(arg1);
        if (arg0 != -75) {
            this.field1800 = null;
        }
        this.field1799 = arg1;
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)J")
    public final long method614(int arg0) throws IOException {
        if (arg0 >= -2) {
            this.method612(101);
        }
        return this.field1800.length();
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IB[BI)I")
    public final int method615(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != -92) {
            return -20;
        }
        int var5 = this.field1800.read(arg2, arg3, arg0);
        if (var5 > 0) {
            this.field1799 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ag", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1800 != null) {
            System.out.println("Warning! fileondisk " + this.field1798 + " not closed correctly using close(). Auto-closing instead. ");
            this.method617((byte) -110);
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z[BII)V")
    public final void method616(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field1801 < (long) arg2 + this.field1799) {
            this.field1800.seek(this.field1801 + 1L);
            this.field1800.write(1);
            throw new EOFException();
        }
        this.field1800.write(arg1, arg3, arg2);
        if (arg0) {
            this.field1799 = -68L;
        }
        this.field1799 += (long) arg2;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public final void method617(byte arg0) throws IOException {
        if (arg0 != -110) {
            this.method612(-71);
        }
        if (this.field1800 != null) {
            this.field1800.close();
            this.field1800 = null;
        }
    }
}
