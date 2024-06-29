import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class197 {

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "J")
    private long field3355;

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "J")
    private long field3356;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Ljava/io/File;")
    private File field3357;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3354;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "([BIIB)I", line = 4)
    public final int method1473(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if (arg3 >= -107) {
            return 38;
        }
        int var5 = this.field3354.read(arg0, arg1, arg2);
        if (var5 > 0) {
            this.field3355 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(III[B)V", line = 20)
    public final void method1474(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (arg1 > -30) {
            this.method1477(false);
        }
        if (this.field3356 < ((long) arg2 + this.field3355)) {
            this.field3354.seek(this.field3356 + 1L);
            this.field3354.write(1);
            throw new EOFException();
        } else {
            this.field3354.write(arg3, arg0, arg2);
            this.field3355 += (long) arg2;
        }
    }

    @OriginalMember(owner = "client!ve", name = "finalize", descriptor = "()V", line = 38)
    protected final void finalize() throws Throwable {
        if (this.field3354 != null) {
            System.out.println("Warning! fileondisk " + this.field3357 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1476((byte) 124);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)J", line = 54)
    public final long method1475(int arg0) throws IOException {
        if (arg0 > -107) {
            this.method1477(false);
        }
        return this.field3354.length();
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 64)
    public final void method1476(byte arg0) throws IOException {
        if (this.field3354 != null) {
            this.field3354.close();
            this.field3354 = null;
        }
        if (arg0 != 124) {
            this.field3354 = (RandomAccessFile) null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)Ljava/io/File;", line = 79)
    public final File method1477(boolean arg0) {
        return arg0 ? this.field3357 : (File) null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(JI)V", line = 92)
    public final void method1478(long arg0, int arg1) throws IOException {
        if (arg1 == 0) {
            this.field3354.seek(arg0);
            this.field3355 = arg0;
        }
    }
}
