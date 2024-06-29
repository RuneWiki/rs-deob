import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class110 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "J")
    private long field1958;

    @OriginalMember(owner = "client!ue", name = "d", descriptor = "J")
    private long field1961;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "Ljava/io/File;")
    private File field1960;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1959;

    @OriginalMember(owner = "client!ue", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        if (this.field1959 != null) {
            System.out.println("Warning! fileondisk " + this.field1960 + " not closed correctly using close(). Auto-closing instead. ");
            this.method711(0);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V", line = 17)
    public final void method711(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field1960 = (File) null;
        }
        if (this.field1959 != null) {
            this.field1959.close();
            this.field1959 = null;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(JI)V", line = 32)
    public final void method712(long arg0, int arg1) throws IOException {
        this.field1959.seek(arg0);
        if (arg1 != -31804) {
            this.method713(48);
        }
        this.field1961 = arg0;
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(I)Ljava/io/File;", line = 48)
    public final File method713(int arg0) {
        if (arg0 < 37) {
            this.method713(125);
        }
        return this.field1960;
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "([BIIZ)V", line = 58)
    public final void method714(byte[] arg0, int arg1, int arg2, boolean arg3) throws IOException {
        if (((long) arg1 + this.field1961) > this.field1958) {
            this.field1959.seek(this.field1958);
            this.field1959.write(1);
            throw new EOFException();
        }
        this.field1959.write(arg0, arg2, arg1);
        this.field1961 += (long) arg1;
        if (arg3) {
            this.method713(-84);
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IB[BI)I", line = 77)
    public final int method715(int arg0, byte arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1 != 78) {
            this.field1958 = -76L;
        }
        int var5 = this.field1959.read(arg2, arg0, arg3);
        if (var5 > 0) {
            this.field1961 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)J", line = 91)
    public final long method716(int arg0) throws IOException {
        return arg0 == 0 ? this.field1959.length() : -80L;
    }
}
