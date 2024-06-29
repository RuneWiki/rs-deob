import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class627 {

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "J")
    private long field9019;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "J")
    private long field9020;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "Ljava/io/File;")
    private File field9018;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field9021;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method3592(boolean arg0) {
        if (!arg0) {
            this.method3592(true);
        }
        return this.field9018;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I[BIB)V")
    public final void method3593(int arg0, byte[] arg1, int arg2, byte arg3) throws IOException {
        if ((long) arg2 + this.field9019 > this.field9020) {
            this.field9021.seek(this.field9020);
            this.field9021.write(1);
            throw new EOFException();
        }
        this.field9021.write(arg1, arg0, arg2);
        this.field9019 += arg2;
        if (arg3 < 66) {
            this.method3592(true);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)J")
    public final long method3594(int arg0) throws IOException {
        if (arg0 != -1) {
            this.method3592(true);
        }
        return this.field9021.length();
    }

    @OriginalMember(owner = "client!ob", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field9021 != null) {
            System.out.println("Warning! fileondisk " + this.field9018 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3596((byte) -95);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IJ)V")
    public final void method3595(int arg0, long arg1) throws IOException {
        int var4 = -20 % ((arg0 - 25) / 52);
        this.field9021.seek(arg1);
        this.field9019 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V")
    public final void method3596(byte arg0) throws IOException {
        if (this.field9021 != null) {
            this.field9021.close();
            this.field9021 = null;
        }
        if (arg0 != -95) {
            this.method3592(true);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z[BII)I")
    public final int method3597(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field9021.read(arg1, arg2, arg3);
        if (var5 > 0) {
            this.field9019 += var5;
        }
        if (arg0) {
            this.field9018 = null;
        }
        return var5;
    }
}
