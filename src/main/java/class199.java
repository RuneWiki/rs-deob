import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class199 {

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "J")
    private long field2760;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "J")
    private long field2762;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Ljava/io/File;")
    private File field2761;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2759;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Ljava/io/File;", line = 6)
    public final File method1299(int arg0) {
        return arg0 == -1 ? this.field2761 : null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(JB)V", line = 17)
    public final void method1300(long arg0, byte arg1) throws IOException {
        this.field2759.seek(arg0);
        int var4 = -24 / ((arg1 + 70) / 53);
        this.field2760 = arg0;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I[BII)V", line = 27)
    public final void method1301(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field2762 < ((long) arg3 + this.field2760)) {
            this.field2759.seek(this.field2762);
            this.field2759.write(1);
            throw new EOFException();
        }
        if (arg2 <= 1) {
            this.method1299(-55);
        }
        this.field2759.write(arg1, arg0, arg3);
        this.field2760 += (long) arg3;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I[BII)I", line = 46)
    public final int method1302(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2759.read(arg1, arg0, arg2);
        if (var5 > arg3) {
            this.field2760 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)J", line = 60)
    public final long method1303(int arg0) throws IOException {
        if (arg0 > -10) {
            this.field2760 = 93L;
        }
        return this.field2759.length();
    }

    @OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V", line = 70)
    protected final void finalize() throws Throwable {
        if (this.field2759 != null) {
            System.out.println("Warning! fileondisk " + this.field2761 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1304(0);
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)V", line = 83)
    public final void method1304(int arg0) throws IOException {
        if (arg0 == 0 && this.field2759 != null) {
            this.field2759.close();
            this.field2759 = null;
        }
    }
}
