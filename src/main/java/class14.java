import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class14 {

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "J")
    private long field172;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "J")
    private long field173;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "Ljava/io/File;")
    private File field171;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field170;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method106(boolean arg0) {
        return arg0 ? null : this.field171;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BJ)V")
    public final void method107(byte arg0, long arg1) throws IOException {
        if (arg0 >= -2) {
            this.field170 = null;
        }
        this.field170.seek(arg1);
        this.field173 = arg1;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I[BII)I")
    public final int method108(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field170.read(arg1, arg2, arg0);
        if (var5 > 0) {
            this.field173 += (long) var5;
        }
        return arg3 > -110 ? -68 : var5;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public final void method109(int arg0) throws IOException {
        if (this.field170 != null) {
            this.field170.close();
            this.field170 = null;
        }
        if (arg0 > -23) {
            this.field171 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field170 != null) {
            System.out.println("Warning! fileondisk " + this.field171 + " not closed correctly using close(). Auto-closing instead. ");
            this.method109(-93);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)J")
    public final long method110(byte arg0) throws IOException {
        if (arg0 > -113) {
            this.field173 = -115L;
        }
        return this.field170.length();
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I[BII)V")
    public final void method111(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        if (this.field172 < (long) arg0 + this.field173) {
            this.field170.seek(this.field172);
            this.field170.write(1);
            throw new EOFException();
        }
        this.field170.write(arg1, arg3, arg0);
        if (arg2 != 1) {
            this.field172 = -91L;
        }
        this.field173 += (long) arg0;
    }
}
