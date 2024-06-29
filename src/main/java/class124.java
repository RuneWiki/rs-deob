import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class124 {

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "J")
    private long field1964;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "J")
    private long field1965;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Ljava/io/File;")
    private File field1967;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1966;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method860(int arg0) {
        if (arg0 != 1) {
            this.field1966 = null;
        }
        return this.field1967;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I[BII)I")
    public final int method861(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (arg2 >= -71) {
            return 121;
        }
        int var5 = this.field1966.read(arg1, arg3, arg0);
        if (var5 > 0) {
            this.field1964 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)J")
    public final long method862(int arg0) throws IOException {
        return arg0 == 14718 ? this.field1966.length() : 6L;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public final void method863(byte arg0) throws IOException {
        if (arg0 <= 62) {
            this.field1967 = null;
        }
        if (this.field1966 != null) {
            this.field1966.close();
            this.field1966 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field1966 != null) {
            System.out.println("Warning! fileondisk " + this.field1967 + " not closed correctly using close(). Auto-closing instead. ");
            this.method863((byte) 102);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI[BI)V")
    public final void method864(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0) {
            return;
        }
        if (this.field1965 < (long) arg1 + this.field1964) {
            this.field1966.seek(this.field1965);
            this.field1966.write(1);
            throw new EOFException();
        } else {
            this.field1966.write(arg2, arg3, arg1);
            this.field1964 += (long) arg1;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(JI)V")
    public final void method865(long arg0, int arg1) throws IOException {
        if (arg1 == -1) {
            this.field1966.seek(arg0);
            this.field1964 = arg0;
        }
    }
}
