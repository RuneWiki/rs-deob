import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class52 {

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1084;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "J")
    private long field1083;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "J")
    private long field1086;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Ljava/io/File;")
    private File field1085;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(JB)V", line = 7)
    public final void method402(long arg0, byte arg1) throws IOException {
        this.field1084.seek(arg0);
        this.field1083 = arg0;
        if (arg1 <= 121) {
            this.field1084 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)J", line = 18)
    public final long method403(int arg0) throws IOException {
        return arg0 == 1 ? this.field1084.length() : 74L;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I[BBI)I", line = 28)
    public final int method404(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        int var5 = this.field1084.read(arg1, arg3, arg0);
        if (arg2 != 116) {
            this.method405((byte) 57);
        }
        if (var5 > 0) {
            this.field1083 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)Ljava/io/File;", line = 43)
    public final File method405(byte arg0) {
        return arg0 == 21 ? this.field1085 : null;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V", line = 53)
    public final void method406(byte arg0) throws IOException {
        this.field1084.close();
        if (arg0 != 26) {
            this.field1084 = null;
        }
        this.field1084 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([BIII)V", line = 64)
    public final void method407(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg2 > -66) {
            this.field1085 = null;
        }
        if (this.field1086 < (long) arg3 + this.field1083) {
            this.field1084.seek(this.field1086 + 1L);
            this.field1084.write(1);
            throw new EOFException();
        } else {
            this.field1084.write(arg0, arg1, arg3);
            this.field1083 += arg3;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 84)
    public class52(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field1084 = new RandomAccessFile(arg0, arg1);
        this.field1083 = 0L;
        this.field1086 = arg2;
        this.field1085 = arg0;
    }
}
