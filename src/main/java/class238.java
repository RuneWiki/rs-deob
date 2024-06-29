import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class238 {

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "J")
    private long field3768;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "J")
    private long field3770;

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "Ljava/io/File;")
    private File field3771;

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3769;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZJ)V")
    public final void method1657(boolean arg0, long arg1) throws IOException {
        this.field3769.seek(arg1);
        this.field3768 = arg1;
        if (arg0) {
            this.field3771 = null;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)J")
    public final long method1658(int arg0) throws IOException {
        int var2 = -43 % ((61 - arg0) / 56);
        return this.field3769.length();
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(III[B)I")
    public final int method1659(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        int var5 = this.field3769.read(arg3, arg1, arg0);
        if (arg2 > -71) {
            this.method1661((byte) -76);
        }
        if (var5 > 0) {
            this.field3768 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)V")
    public final void method1660(byte arg0) throws IOException {
        if (this.field3769 != null) {
            this.field3769.close();
            this.field3769 = null;
        }
        if (arg0 > -14) {
            this.method1661((byte) -116);
        }
    }

    @OriginalMember(owner = "client!ck", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3769 != null) {
            System.out.println("Warning! fileondisk " + this.field3771 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1660((byte) -37);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method1661(byte arg0) {
        if (arg0 != -73) {
            this.field3771 = null;
        }
        return this.field3771;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(III[B)V")
    public final void method1662(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (((long) arg0 + this.field3768) > this.field3770) {
            this.field3769.seek(this.field3770);
            this.field3769.write(1);
            throw new EOFException();
        } else if (arg2 == -7751) {
            this.field3769.write(arg3, arg1, arg0);
            this.field3768 += (long) arg0;
        }
    }
}
