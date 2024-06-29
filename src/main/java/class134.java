import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class134 {

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2482;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "J")
    private long field2484;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Ljava/io/File;")
    private File field2481;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "J")
    private long field2483;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method927(int arg0) throws IOException {
        if (arg0 == 1 && this.field2482 != null) {
            this.field2482.close();
            this.field2482 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z[BII)I")
    public final int method928(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (!arg0) {
            this.field2484 = 90L;
        }
        int var5 = this.field2482.read(arg1, arg3, arg2);
        if (var5 > 0) {
            this.field2484 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)J")
    public final long method929(byte arg0) throws IOException {
        return arg0 >= -81 ? -125L : this.field2482.length();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method930(boolean arg0) {
        if (!arg0) {
            this.field2481 = null;
        }
        return this.field2481;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "([BIII)V")
    public final void method931(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field2483 < (long) arg2 + this.field2484) {
            this.field2482.seek(this.field2483 + 1L);
            this.field2482.write(1);
            throw new EOFException();
        }
        this.field2482.write(arg0, arg1, arg2);
        this.field2484 += arg2;
        if (arg3 != 1) {
            this.field2481 = null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BJ)V")
    public final void method932(byte arg0, long arg1) throws IOException {
        this.field2482.seek(arg1);
        if (arg0 == -29) {
            this.field2484 = arg1;
        }
    }

    @OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2482 != null) {
            System.out.println("Warning! fileondisk " + this.field2481 + " not closed correctly using close(). Auto-closing instead. ");
            this.method927(1);
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class134(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg0.length() >= arg2) {
            arg0.delete();
        }
        this.field2482 = new RandomAccessFile(arg0, arg1);
        this.field2484 = 0L;
        this.field2481 = arg0;
        this.field2483 = arg2;
        int var5 = this.field2482.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2482.seek(0L);
            this.field2482.write(var5);
        }
        this.field2482.seek(0L);
    }
}
