import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class578 {

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "J")
    private long field8038;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "J")
    private long field8039;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "Ljava/io/File;")
    private File field8041;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field8040;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I[BII)I")
    public final int method3247(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field8040.read(arg1, arg2, arg0);
        if (var5 > 0) {
            this.field8038 += var5;
        }
        if (arg3 >= -51) {
            this.field8040 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method3248(int arg0) {
        if (arg0 != 14357) {
            this.field8038 = 69L;
        }
        return this.field8041;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BI[BI)V")
    public final void method3249(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (this.field8039 < ((long) arg1 + this.field8038)) {
            this.field8040.seek(this.field8039);
            this.field8040.write(1);
            throw new EOFException();
        }
        this.field8040.write(arg2, arg3, arg1);
        if (arg0 <= 92) {
            this.field8040 = null;
        }
        this.field8038 += arg1;
    }

    @OriginalMember(owner = "client!laa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field8040 != null) {
            System.out.println("Warning! fileondisk " + this.field8041 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3252(0);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(JZ)V")
    public final void method3250(long arg0, boolean arg1) throws IOException {
        if (arg1) {
            this.field8039 = -91L;
        }
        this.field8040.seek(arg0);
        this.field8038 = arg0;
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)J")
    public final long method3251(int arg0) throws IOException {
        return arg0 == -25730 ? this.field8040.length() : 24L;
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
    public final void method3252(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method3248(-114);
        }
        if (this.field8040 != null) {
            this.field8040.close();
            this.field8040 = null;
        }
    }
}
