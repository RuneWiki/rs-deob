import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class24 {

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "J")
    private long field367;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "J")
    private long field368;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Ljava/io/File;")
    private File field366;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field365;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)J")
    public final long method194(int arg0) throws IOException {
        if (arg0 > -100) {
            this.field368 = -107L;
        }
        return this.field365.length();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(JI)V")
    public final void method195(long arg0, int arg1) throws IOException {
        if (arg1 == 325) {
            this.field365.seek(arg0);
            this.field368 = arg0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field365 != null) {
            System.out.println("Warning! fileondisk " + this.field366 + " not closed correctly using close(). Auto-closing instead. ");
            this.method199(116);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BBII)V")
    public final void method196(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (this.field367 < ((long) arg2 + this.field368)) {
            this.field365.seek(this.field367);
            this.field365.write(1);
            throw new EOFException();
        } else {
            int var5 = -89 % ((5 - arg1) / 62);
            this.field365.write(arg0, arg3, arg2);
            this.field368 += (long) arg2;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I[BII)I")
    public final int method197(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field365.read(arg1, arg0, arg3);
        if (~var5 < arg2) {
            this.field368 += (long) var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)Ljava/io/File;")
    public final File method198(int arg0) {
        if (arg0 < 45) {
            this.method198(55);
        }
        return this.field366;
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(I)V")
    public final void method199(int arg0) throws IOException {
        if (this.field365 != null) {
            this.field365.close();
            this.field365 = null;
        }
        if (arg0 < 85) {
            this.field365 = null;
        }
    }
}
