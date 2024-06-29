import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class261 {

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "J")
    private long field4584;

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "J")
    private long field4585;

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Ljava/io/File;")
    private File field4583;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field4582;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)J")
    public final long method1803(int arg0) throws IOException {
        return arg0 > 0 ? -106L : this.field4582.length();
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)V")
    public final void method1804(int arg0) throws IOException {
        if (arg0 != 0) {
            this.method1805(127);
        }
        if (this.field4582 != null) {
            this.field4582.close();
            this.field4582 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method1805(int arg0) {
        return arg0 >= -74 ? null : this.field4583;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(JI)V")
    public final void method1806(long arg0, int arg1) throws IOException {
        this.field4582.seek(arg0);
        this.field4585 = arg0;
        if (arg1 > -45) {
            this.field4585 = -3L;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "([BIII)I")
    public final int method1807(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field4582.read(arg0, arg2, arg1);
        if (arg3 <= 43) {
            return 60;
        } else {
            if (var5 > 0) {
                this.field4585 += (long) var5;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!cj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field4582 != null) {
            System.out.println("Warning! fileondisk " + this.field4583 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1804(0);
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "([BIII)V")
    public final void method1808(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (this.field4584 < ((long) arg1 + this.field4585)) {
            this.field4582.seek(this.field4584 + 1L);
            this.field4582.write(1);
            throw new EOFException();
        }
        this.field4582.write(arg0, arg2, arg1);
        if (arg3 <= 33) {
            this.field4585 = -80L;
        }
        this.field4585 += (long) arg1;
    }
}
