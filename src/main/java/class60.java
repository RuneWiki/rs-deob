import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class60 {

    @OriginalMember(owner = "client!k", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field1545;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "Ljava/io/File;")
    private File field1543;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "J")
    private long field1544;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "J")
    private long field1542;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(I)V", line = 3)
    public final void method482(int arg0) throws IOException {
        if (arg0 == -29352) {
            this.field1545.close();
            this.field1545 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)J", line = 14)
    public final long method483(int arg0) throws IOException {
        if (arg0 != -6351) {
            this.field1545 = null;
        }
        return this.field1545.length();
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(I)Ljava/io/File;", line = 25)
    public final File method484(int arg0) {
        if (arg0 > -5) {
            this.field1543 = null;
        }
        return this.field1543;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IJ)V", line = 37)
    public final void method485(int arg0, long arg1) throws IOException {
        this.field1545.seek(arg1);
        if (arg0 <= 101) {
            this.field1542 = -100L;
        }
        this.field1542 = arg1;
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 49)
    public class60(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field1545 = new RandomAccessFile(arg0, arg1);
        this.field1543 = arg0;
        this.field1544 = arg2;
        this.field1542 = 0L;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II[BI)I", line = 72)
    public final int method486(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = this.field1545.read(arg2, arg1, arg0);
        int var6 = -102 % ((66 - arg3) / 52);
        if (var5 > 0) {
            this.field1542 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B[BII)V", line = 88)
    public final void method487(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if ((long) arg2 + this.field1542 > this.field1544) {
            this.field1545.seek(this.field1544 + 1L);
            this.field1545.write(1);
            throw new EOFException();
        } else {
            this.field1545.write(arg1, arg3, arg2);
            int var5 = -107 / ((30 - arg0) / 42);
            this.field1542 += arg2;
        }
    }
}
