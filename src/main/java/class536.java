import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class536 {

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "J")
    private long field7892;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "J")
    private long field7894;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "Ljava/io/File;")
    private File field7893;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field7891;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)J", line = 4)
    public final long method3160(byte arg0) throws IOException {
        if (arg0 != 74) {
            this.field7893 = null;
        }
        return this.field7891.length();
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "([BIII)I", line = 16)
    public final int method3161(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field7891.read(arg0, arg3, arg1);
        if (var5 > 0) {
            this.field7892 += var5;
        }
        if (arg2 <= 114) {
            this.field7891 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ZJ)V", line = 32)
    public final void method3162(boolean arg0, long arg1) throws IOException {
        this.field7891.seek(arg1);
        if (!arg0) {
            this.method3164(false);
        }
        this.field7892 = arg1;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "([BIII)V", line = 43)
    public final void method3163(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field7894 < (long) arg1 + this.field7892) {
            this.field7891.seek(this.field7894);
            this.field7891.write(1);
            throw new EOFException();
        }
        this.field7891.write(arg0, arg2, arg1);
        if (arg3 != 0) {
            this.field7892 = 56L;
        }
        this.field7892 += arg1;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(Z)Ljava/io/File;", line = 62)
    public final File method3164(boolean arg0) {
        if (arg0) {
            this.method3164(true);
        }
        return this.field7893;
    }

    @OriginalMember(owner = "client!kr", name = "finalize", descriptor = "()V", line = 72)
    protected final void finalize() throws Throwable {
        if (this.field7891 != null) {
            System.out.println("Warning! fileondisk " + this.field7893 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3165(-7527);
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)V", line = 85)
    public final void method3165(int arg0) throws IOException {
        if (this.field7891 != null) {
            this.field7891.close();
            this.field7891 = null;
        }
        if (arg0 != -7527) {
            this.field7893 = null;
        }
    }
}
