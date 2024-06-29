import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class211 {

    @OriginalMember(owner = "client!in", name = "b", descriptor = "J")
    private long field3114;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "J")
    private long field3115;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "Ljava/io/File;")
    private File field3116;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3113;

    @OriginalMember(owner = "client!in", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3113 != null) {
            System.out.println("Warning! fileondisk " + this.field3116 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1367(0);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public final void method1367(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method1371((byte) 83);
        }
        if (this.field3113 != null) {
            this.field3113.close();
            this.field3113 = null;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(BII[B)V")
    public final void method1368(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != 37) {
            this.method1371((byte) -107);
        }
        if (this.field3114 < ((long) arg2 + this.field3115)) {
            this.field3113.seek(this.field3114);
            this.field3113.write(1);
            throw new EOFException();
        } else {
            this.field3113.write(arg3, arg1, arg2);
            this.field3115 += arg2;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(JZ)V")
    public final void method1369(long arg0, boolean arg1) throws IOException {
        this.field3113.seek(arg0);
        if (arg1) {
            this.method1371((byte) 36);
        }
        this.field3115 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[BBI)I")
    public final int method1370(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        int var5 = 122 / ((49 - arg2) / 32);
        int var6 = this.field3113.read(arg1, arg3, arg0);
        if (var6 > 0) {
            this.field3115 += var6;
        }
        return var6;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1371(byte arg0) {
        int var2 = -63 % ((arg0 - 38) / 63);
        return this.field3116;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(B)J")
    public final long method1372(byte arg0) throws IOException {
        if (arg0 < 67) {
            this.method1371((byte) -121);
        }
        return this.field3113.length();
    }
}
