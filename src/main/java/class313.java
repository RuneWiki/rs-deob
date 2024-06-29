import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class313 {

    @OriginalMember(owner = "client!n", name = "b", descriptor = "J")
    private long field4861;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "J")
    private long field4863;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "Ljava/io/File;")
    private File field4860;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4862;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)J", line = 8)
    public final long method2199(int arg0) throws IOException {
        int var2 = 69 / ((23 - arg0) / 51);
        return this.field4862.length();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)Ljava/io/File;", line = 17)
    public final File method2200(boolean arg0) {
        return arg0 ? this.field4860 : (File) null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZJ)V", line = 27)
    public final void method2201(boolean arg0, long arg1) throws IOException {
        this.field4862.seek(arg1);
        if (arg0) {
            this.field4863 = arg1;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II[BI)I", line = 39)
    public final int method2202(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0 > -40) {
            this.field4862 = (RandomAccessFile) null;
        }
        int var5 = this.field4862.read(arg2, arg1, arg3);
        if (var5 > 0) {
            this.field4863 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V", line = 53)
    public final void method2203(int arg0) throws IOException {
        if (arg0 == -1 && this.field4862 != null) {
            this.field4862.close();
            this.field4862 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BIIB)V", line = 68)
    public final void method2204(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if (((long) arg1 + this.field4863) > this.field4861) {
            this.field4862.seek(this.field4861);
            this.field4862.write(1);
            throw new EOFException();
        }
        this.field4862.write(arg0, arg2, arg1);
        this.field4863 += (long) arg1;
        if (arg3 != 4) {
            this.method2200(true);
        }
    }

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 87)
    protected final void finalize() throws Throwable {
        if (this.field4862 != null) {
            System.out.println("Warning! fileondisk " + this.field4860 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2203(-1);
        }
    }
}
