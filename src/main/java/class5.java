import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class5 {

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "J")
    private long field36;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "J")
    private long field38;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "Ljava/io/File;")
    private File field39;

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field37;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)J")
    public final long method46(int arg0) throws IOException {
        return arg0 == 1 ? this.field37.length() : 46L;
    }

    @OriginalMember(owner = "client!ti", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field37 != null) {
            System.out.println("Warning! fileondisk " + this.field39 + " not closed correctly using close(). Auto-closing instead. ");
            this.method47(false);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    public final void method47(boolean arg0) throws IOException {
        if (this.field37 != null) {
            this.field37.close();
            this.field37 = null;
        }
        if (arg0) {
            this.field37 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)Ljava/io/File;")
    public final File method48(boolean arg0) {
        return arg0 ? this.field39 : null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BIII)I")
    public final int method49(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field37.read(arg0, arg3, arg2);
        if (var5 > arg1) {
            this.field36 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(JI)V")
    public final void method50(long arg0, int arg1) throws IOException {
        this.field37.seek(arg0);
        int var4 = 36 % ((47 - arg1) / 58);
        this.field36 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "([BIII)V")
    public final void method51(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if ((long) arg2 + this.field36 > this.field38) {
            this.field37.seek(this.field38 + 1L);
            this.field37.write(1);
            throw new EOFException();
        }
        this.field37.write(arg0, arg3, arg2);
        this.field36 += (long) arg2;
        if (arg1 != 1) {
            this.field39 = null;
        }
    }
}
