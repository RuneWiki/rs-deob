import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class84 {

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "J")
    private long field1512;

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "J")
    private long field1513;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljava/io/File;")
    private File field1510;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1511;

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II[BI)V")
    public final void method479(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (((long) arg0 + this.field1513) > this.field1512) {
            this.field1511.seek(this.field1512 + 1L);
            this.field1511.write(1);
            throw new EOFException();
        }
        this.field1511.write(arg2, arg3, arg0);
        if (arg1 != 4867) {
            this.field1510 = null;
        }
        this.field1513 += (long) arg0;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[BII)I")
    public final int method480(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field1511.read(arg1, arg0, arg3);
        if (arg2 == 0) {
            if (var5 > 0) {
                this.field1513 += (long) var5;
            }
            return var5;
        } else {
            return -86;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method481(int arg0) {
        return arg0 < 66 ? null : this.field1510;
    }

    @OriginalMember(owner = "client!pe", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1511 != null) {
            System.out.println("Warning! fileondisk " + this.field1510 + " not closed correctly using close(). Auto-closing instead. ");
            this.method482(-1);
        }
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public final void method482(int arg0) throws IOException {
        if (this.field1511 != null) {
            this.field1511.close();
            this.field1511 = null;
        }
        if (arg0 != -1) {
            this.method481(76);
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)J")
    public final long method483(int arg0) throws IOException {
        if (arg0 != -1) {
            this.method481(118);
        }
        return this.field1511.length();
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(JI)V")
    public final void method484(long arg0, int arg1) throws IOException {
        this.field1511.seek(arg0);
        this.field1513 = arg0;
        if (arg1 >= -57) {
            this.field1513 = 98L;
        }
    }
}
