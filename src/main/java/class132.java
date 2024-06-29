import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class132 {

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "J")
    private long field1879;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "J")
    private long field1880;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "Ljava/io/File;")
    private File field1877;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1878;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method837(int arg0) {
        if (arg0 != 0) {
            this.field1877 = null;
        }
        return this.field1877;
    }

    @OriginalMember(owner = "client!ch", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1878 != null) {
            System.out.println("Warning! fileondisk " + this.field1877 + " not closed correctly using close(). Auto-closing instead. ");
            this.method841(-976);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "([BIII)V")
    public final void method838(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field1880 < (long) arg2 + this.field1879) {
            this.field1878.seek(this.field1880);
            this.field1878.write(1);
            throw new EOFException();
        } else if (arg3 == 1) {
            this.field1878.write(arg0, arg1, arg2);
            this.field1879 += (long) arg2;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)J")
    public final long method839(byte arg0) throws IOException {
        if (arg0 < 58) {
            this.method837(106);
        }
        return this.field1878.length();
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II[BI)I")
    public final int method840(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field1878.read(arg2, arg3, arg0);
        if (~var5 < arg1) {
            this.field1879 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "(I)V")
    public final void method841(int arg0) throws IOException {
        if (this.field1878 != null) {
            this.field1878.close();
            this.field1878 = null;
        }
        if (arg0 != -976) {
            this.method837(83);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(JB)V")
    public final void method842(long arg0, byte arg1) throws IOException {
        int var4 = -19 / ((arg1 + 45) / 63);
        this.field1878.seek(arg0);
        this.field1879 = arg0;
    }
}
