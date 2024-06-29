import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class165 {

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "J")
    private long field2929;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "J")
    private long field2930;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "Ljava/io/File;")
    private File field2931;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2928;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(B)V")
    public final void method1153(byte arg0) throws IOException {
        if (this.field2928 != null) {
            this.field2928.close();
            this.field2928 = null;
        }
        if (arg0 != -11) {
            this.method1157((byte) -12);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IJ)V")
    public final void method1154(int arg0, long arg1) throws IOException {
        this.field2928.seek(arg1);
        if (arg0 != 10649) {
            this.method1157((byte) -105);
        }
        this.field2930 = arg1;
    }

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2928 != null) {
            System.out.println("Warning! fileondisk " + this.field2931 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1153((byte) -11);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III[B)V")
    public final void method1155(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg0 != -14594) {
            this.field2930 = 97L;
        }
        if ((long) arg1 + this.field2930 > this.field2929) {
            this.field2928.seek(this.field2929 + 1L);
            this.field2928.write(1);
            throw new EOFException();
        } else {
            this.field2928.write(arg3, arg2, arg1);
            this.field2930 += (long) arg1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([BIII)I")
    public final int method1156(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field2928.read(arg0, arg2, arg1);
        int var6 = -83 % ((3 - arg3) / 42);
        if (var5 > 0) {
            this.field2930 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(B)Ljava/io/File;")
    public final File method1157(byte arg0) {
        if (arg0 != 108) {
            this.field2929 = -76L;
        }
        return this.field2931;
    }

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "(B)J")
    public final long method1158(byte arg0) throws IOException {
        if (arg0 != 73) {
            this.field2929 = -118L;
        }
        return this.field2928.length();
    }
}
