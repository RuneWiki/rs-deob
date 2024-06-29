import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class497 {

    @OriginalMember(owner = "client!me", name = "a", descriptor = "J")
    private long field7260;

    @OriginalMember(owner = "client!me", name = "c", descriptor = "J")
    private long field7262;

    @OriginalMember(owner = "client!me", name = "d", descriptor = "Ljava/io/File;")
    private File field7263;

    @OriginalMember(owner = "client!me", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field7261;

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(I)J")
    public final long method2957(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method2960((byte) 39);
        }
        return this.field7261.length();
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(JI)V")
    public final void method2958(long arg0, int arg1) throws IOException {
        this.field7261.seek(arg0);
        if (arg1 != 0) {
            this.field7261 = null;
        }
        this.field7260 = arg0;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(IIB[B)I")
    public final int method2959(int arg0, int arg1, byte arg2, byte[] arg3) throws IOException {
        if (arg2 != 25) {
            return 112;
        }
        int var5 = this.field7261.read(arg3, arg0, arg1);
        if (var5 > 0) {
            this.field7260 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method2960(byte arg0) {
        if (arg0 <= 28) {
            this.field7261 = null;
        }
        return this.field7263;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V")
    public final void method2961(byte arg0) throws IOException {
        if (this.field7261 != null) {
            this.field7261.close();
            this.field7261 = null;
        }
        if (arg0 != -27) {
            this.field7263 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZI[BI)V")
    public final void method2962(boolean arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        if (arg0) {
            return;
        }
        if ((long) arg1 + this.field7260 > this.field7262) {
            this.field7261.seek(this.field7262);
            this.field7261.write(1);
            throw new EOFException();
        } else {
            this.field7261.write(arg2, arg3, arg1);
            this.field7260 += arg1;
        }
    }

    @OriginalMember(owner = "client!me", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field7261 != null) {
            System.out.println("Warning! fileondisk " + this.field7263 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2961((byte) -27);
        }
    }
}
