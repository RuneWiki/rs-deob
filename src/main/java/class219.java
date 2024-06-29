import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class219 {

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "J")
    private long field3076;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "J")
    private long field3077;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Ljava/io/File;")
    private File field3075;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3078;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)Ljava/io/File;", line = 3)
    public final File method1293(int arg0) {
        if (arg0 != -1) {
            this.method1293(-107);
        }
        return this.field3075;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(JI)V", line = 13)
    public final void method1294(long arg0, int arg1) throws IOException {
        if (arg1 < 114) {
            this.method1293(46);
        }
        this.field3078.seek(arg0);
        this.field3077 = arg0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIB[B)V", line = 27)
    public final void method1295(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (this.field3076 < (long) arg1 + this.field3077) {
            this.field3078.seek(this.field3076);
            this.field3078.write(1);
            throw new EOFException();
        }
        this.field3078.write(arg3, arg0, arg1);
        if (arg2 != 26) {
            this.field3077 = -81L;
        }
        this.field3077 += arg1;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)J", line = 45)
    public final long method1296(int arg0) throws IOException {
        return arg0 == 1 ? this.field3078.length() : -70L;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V", line = 56)
    public final void method1297(byte arg0) throws IOException {
        int var2 = -6 % ((-arg0 - 11) / 50);
        if (this.field3078 != null) {
            this.field3078.close();
            this.field3078 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "finalize", descriptor = "()V", line = 71)
    protected final void finalize() throws Throwable {
        if (this.field3078 != null) {
            System.out.println("Warning! fileondisk " + this.field3075 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1297((byte) 81);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z[BII)I", line = 83)
    public final int method1298(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field3078.read(arg1, arg3, arg2);
        if (arg0) {
            this.method1293(112);
        }
        if (var5 > 0) {
            this.field3077 += var5;
        }
        return var5;
    }
}
