import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class62 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "J")
    private long field936;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "J")
    private long field937;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "Ljava/io/File;")
    private File field935;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field934;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III[B)V", line = 4)
    public final void method408(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field936 < (long) arg1 + this.field937) {
            this.field934.seek(this.field936);
            this.field934.write(1);
            throw new EOFException();
        }
        this.field934.write(arg3, arg2, arg1);
        if (arg0 != 0) {
            this.field934 = null;
        }
        this.field937 += arg1;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IJ)V", line = 23)
    public final void method409(int arg0, long arg1) throws IOException {
        this.field934.seek(arg1);
        this.field937 = arg1;
        if (arg0 >= -44) {
            this.field934 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V", line = 37)
    public final void method410(byte arg0) throws IOException {
        if (this.field934 != null) {
            this.field934.close();
            this.field934 = null;
        }
        if (arg0 <= 1) {
            this.field936 = -102L;
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)J", line = 53)
    public final long method411(byte arg0) throws IOException {
        int var2 = -18 / ((-arg0 - 47) / 53);
        return this.field934.length();
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[BZ)I", line = 65)
    public final int method412(int arg0, int arg1, byte[] arg2, boolean arg3) throws IOException {
        if (!arg3) {
            return -49;
        }
        int var5 = this.field934.read(arg2, arg1, arg0);
        if (var5 > 0) {
            this.field937 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)Ljava/io/File;", line = 82)
    public final File method413(int arg0) {
        return arg0 == -1 ? this.field935 : null;
    }

    @OriginalMember(owner = "client!je", name = "finalize", descriptor = "()V", line = 92)
    protected final void finalize() throws Throwable {
        if (this.field934 != null) {
            System.out.println("Warning! fileondisk " + this.field935 + " not closed correctly using close(). Auto-closing instead. ");
            this.method410((byte) 95);
        }
    }
}
