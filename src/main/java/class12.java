import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class12 {

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "J")
    private long field160;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "J")
    private long field161;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "Ljava/io/File;")
    private File field158;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field159;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZ[BI)I")
    public final int method49(int arg0, boolean arg1, byte[] arg2, int arg3) throws IOException {
        if (arg1) {
            return 72;
        }
        int var5 = this.field159.read(arg2, arg0, arg3);
        if (var5 > 0) {
            this.field161 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)J")
    public final long method50(boolean arg0) throws IOException {
        return arg0 ? this.field159.length() : -72L;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method51(byte arg0) {
        if (arg0 < 25) {
            this.method51((byte) 86);
        }
        return this.field158;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public final void method52(int arg0) throws IOException {
        if (arg0 != -7802) {
            this.field161 = 8L;
        }
        if (this.field159 != null) {
            this.field159.close();
            this.field159 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field159 != null) {
            System.out.println("Warning! fileondisk " + this.field158 + " not closed correctly using close(). Auto-closing instead. ");
            this.method52(-7802);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZI[B)V")
    public final void method53(int arg0, boolean arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field160 < (long) arg0 + this.field161) {
            this.field159.seek(this.field160 + 1L);
            this.field159.write(1);
            throw new EOFException();
        }
        this.field159.write(arg3, arg2, arg0);
        this.field161 += (long) arg0;
        if (!arg1) {
            this.field158 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(ZJ)V")
    public final void method54(boolean arg0, long arg1) throws IOException {
        if (!arg0) {
            this.method51((byte) -61);
        }
        this.field159.seek(arg1);
        this.field161 = arg1;
    }
}
