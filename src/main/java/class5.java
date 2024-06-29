import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class5 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "J")
    private long field58;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "J")
    private long field60;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Ljava/io/File;")
    private File field61;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field59;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(B)J", line = 7)
    public final long method36(byte arg0) throws IOException {
        if (arg0 > -87) {
            this.method41(-21);
        }
        return this.field59.length();
    }

    @OriginalMember(owner = "client!he", name = "finalize", descriptor = "()V", line = 18)
    protected final void finalize() throws Throwable {
        if (this.field59 != null) {
            System.out.println("Warning! fileondisk " + this.field61 + " not closed correctly using close(). Auto-closing instead. ");
            this.method37(0);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V", line = 31)
    public final void method37(int arg0) throws IOException {
        if (this.field59 != null) {
            this.field59.close();
            this.field59 = null;
        }
        if (arg0 != 0) {
            this.field60 = -115L;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([BIBI)V", line = 46)
    public final void method38(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != -61) {
            return;
        }
        if (this.field60 >= (long) arg1 + this.field58) {
            this.field59.write(arg0, arg3, arg1);
            this.field58 += (long) arg1;
        } else {
            this.field59.seek(this.field60);
            this.field59.write(1);
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BII[B)I", line = 66)
    public final int method39(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 109) {
            this.method41(-7);
        }
        int var5 = this.field59.read(arg3, arg2, arg1);
        if (var5 > 0) {
            this.field58 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(JI)V", line = 81)
    public final void method40(long arg0, int arg1) throws IOException {
        if (arg1 != -1) {
            this.field60 = -20L;
        }
        this.field59.seek(arg0);
        this.field58 = arg0;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Ljava/io/File;", line = 93)
    public final File method41(int arg0) {
        if (arg0 >= -113) {
            this.field58 = -3L;
        }
        return this.field61;
    }
}
