import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class264 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "J")
    private long field3822;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "J")
    private long field3824;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "Ljava/io/File;")
    private File field3823;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3821;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)Ljava/io/File;")
    public final File method1686(byte arg0) {
        return arg0 > -60 ? null : this.field3823;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZII[B)V")
    public final void method1687(boolean arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (((long) arg1 + this.field3824) > this.field3822) {
            this.field3821.seek(this.field3822);
            this.field3821.write(1);
            throw new EOFException();
        } else {
            this.field3821.write(arg3, arg2, arg1);
            if (!arg0) {
                this.field3824 += (long) arg1;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V")
    public final void method1688(int arg0) throws IOException {
        if (this.field3821 != null) {
            this.field3821.close();
            this.field3821 = null;
        }
        if (arg0 != -3327) {
            this.field3824 = 39L;
        }
    }

    @OriginalMember(owner = "client!uj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3821 != null) {
            System.out.println("Warning! fileondisk " + this.field3823 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1688(-3327);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I[BII)I")
    public final int method1689(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field3821.read(arg1, arg0, arg2);
        if (arg3 > ~var5) {
            this.field3824 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)V")
    public final void method1690(int arg0, long arg1) throws IOException {
        if (arg0 >= -16) {
            this.field3824 = -74L;
        }
        this.field3821.seek(arg1);
        this.field3824 = arg1;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(B)J")
    public final long method1691(byte arg0) throws IOException {
        if (arg0 != 124) {
            this.method1686((byte) 14);
        }
        return this.field3821.length();
    }
}
