import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class77 {

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "J")
    private long field1164;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "J")
    private long field1166;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "Ljava/io/File;")
    private File field1165;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1167;

    @OriginalMember(owner = "client!vm", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        if (this.field1167 != null) {
            System.out.println("Warning! fileondisk " + this.field1165 + " not closed correctly using close(). Auto-closing instead. ");
            this.method503((byte) -122);
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(B)V", line = 17)
    public final void method503(byte arg0) throws IOException {
        if (arg0 > -68) {
            this.field1165 = (File) null;
        }
        if (this.field1167 != null) {
            this.field1167.close();
            this.field1167 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(JZ)V", line = 35)
    public final void method504(long arg0, boolean arg1) throws IOException {
        if (arg1) {
            this.method506(true);
        }
        this.field1167.seek(arg0);
        this.field1166 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)J", line = 47)
    public final long method505(int arg0) throws IOException {
        if (arg0 != 24044) {
            this.method506(true);
        }
        return this.field1167.length();
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Z)Ljava/io/File;", line = 58)
    public final File method506(boolean arg0) {
        if (arg0) {
            this.method506(true);
        }
        return this.field1165;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II[BI)I", line = 69)
    public final int method507(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field1167.read(arg2, arg0, arg3);
        if (~var5 < arg1) {
            this.field1166 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I[BII)V", line = 82)
    public final void method508(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (((long) arg0 + this.field1166) > this.field1164) {
            this.field1167.seek(this.field1164 + 1L);
            this.field1167.write(1);
            throw new EOFException();
        }
        this.field1167.write(arg1, arg3, arg0);
        this.field1166 += (long) arg0;
        if (arg2 != 19665) {
            this.field1167 = (RandomAccessFile) null;
        }
    }
}
