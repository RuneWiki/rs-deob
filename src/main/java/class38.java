import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public class class38 {

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "J")
    private long field575;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "J")
    private long field576;

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Ljava/io/File;")
    private File field578;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field577;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(I)J", line = 4)
    public final long method241(int arg0) throws IOException {
        int var2 = -36 / ((arg0 + 57) / 59);
        return this.field577.length();
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(JI)V", line = 14)
    public final void method242(long arg0, int arg1) throws IOException {
        if (arg1 != 0) {
            this.field577 = null;
        }
        this.field577.seek(arg0);
        this.field575 = arg0;
    }

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "(I)V", line = 27)
    public final void method243(int arg0) throws IOException {
        if (this.field577 != null) {
            this.field577.close();
            this.field577 = null;
        }
        if (arg0 != 0) {
            this.method245(false);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(II[BI)I", line = 46)
    public final int method244(int arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        int var5 = -34 / ((26 - arg3) / 56);
        int var6 = this.field577.read(arg2, arg0, arg1);
        if (var6 > 0) {
            this.field575 += var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rq", name = "finalize", descriptor = "()V", line = 60)
    protected final void finalize() throws Throwable {
        if (this.field577 != null) {
            System.out.println("Warning! fileondisk " + this.field578 + " not closed correctly using close(). Auto-closing instead. ");
            this.method243(0);
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Z)Ljava/io/File;", line = 74)
    public final File method245(boolean arg0) {
        if (!arg0) {
            this.method245(true);
        }
        return this.field578;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(III[B)V", line = 84)
    public final void method246(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field576 < ((long) arg0 + this.field575)) {
            this.field577.seek(this.field576);
            this.field577.write(1);
            throw new EOFException();
        }
        this.field577.write(arg3, arg1, arg0);
        if (arg2 != 1) {
            this.method245(true);
        }
        this.field575 += arg0;
    }
}
