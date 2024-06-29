import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class253 {

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "J")
    private long field3476;

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "J")
    private long field3478;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "Ljava/io/File;")
    private File field3477;

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3479;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method1558(boolean arg0) {
        if (arg0) {
            this.field3477 = null;
        }
        return this.field3477;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)J")
    public final long method1559(int arg0) throws IOException {
        if (arg0 != -6067) {
            this.method1558(true);
        }
        return this.field3479.length();
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(II[BB)V")
    public final void method1560(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException {
        if (this.field3476 < ((long) arg1 + this.field3478)) {
            this.field3479.seek(this.field3476);
            this.field3479.write(1);
            throw new EOFException();
        } else {
            int var5 = -51 / ((arg3 + 17) / 58);
            this.field3479.write(arg2, arg0, arg1);
            this.field3478 += (long) arg1;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "([BIII)I")
    public final int method1561(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field3479.read(arg0, arg1, arg3);
        if (arg2 < 35) {
            this.field3479 = null;
        }
        if (var5 > 0) {
            this.field3478 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!jc", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3479 != null) {
            System.out.println("Warning! fileondisk " + this.field3477 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1562(-8060);
        }
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)V")
    public final void method1562(int arg0) throws IOException {
        if (arg0 != -8060) {
            this.method1558(true);
        }
        if (this.field3479 != null) {
            this.field3479.close();
            this.field3479 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IJ)V")
    public final void method1563(int arg0, long arg1) throws IOException {
        this.field3479.seek(arg1);
        if (arg0 != 0) {
            this.field3478 = 5L;
        }
        this.field3478 = arg1;
    }
}
