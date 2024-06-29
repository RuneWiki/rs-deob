import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class137 {

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "J")
    private long field2076;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "J")
    private long field2079;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Ljava/io/File;")
    private File field2078;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2077;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([BIII)V")
    public final void method1009(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field2079 < ((long) arg2 + this.field2076)) {
            this.field2077.seek(this.field2079);
            this.field2077.write(1);
            throw new EOFException();
        } else {
            this.field2077.write(arg0, arg3, arg2);
            if (arg1 == 24238) {
                this.field2076 += arg2;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2077 != null) {
            System.out.println("Warning! fileondisk " + this.field2078 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1011(7734);
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(JI)V")
    public final void method1010(long arg0, int arg1) throws IOException {
        if (arg1 != 0) {
            this.method1012(-53);
        }
        this.field2077.seek(arg0);
        this.field2076 = arg0;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public final void method1011(int arg0) throws IOException {
        if (this.field2077 != null) {
            this.field2077.close();
            this.field2077 = null;
        }
        if (arg0 != 7734) {
            this.field2077 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method1012(int arg0) {
        int var2 = -86 % ((arg0 - 16) / 61);
        return this.field2078;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([BIBI)I")
    public final int method1013(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        int var5 = this.field2077.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field2076 += var5;
        }
        return arg2 <= 97 ? -65 : var5;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Z)J")
    public final long method1014(boolean arg0) throws IOException {
        return arg0 ? -84L : this.field2077.length();
    }
}
