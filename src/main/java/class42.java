import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class42 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field690;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Ljava/io/File;")
    private File field687;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "J")
    private long field689;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "J")
    private long field688;

    @OriginalMember(owner = "client!ec", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field690 != null) {
            System.out.println("Warning! fileondisk " + this.field687 + " not closed correctly using close(). Auto-closing instead. ");
            this.method228((byte) 45);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(JI)V")
    public final void method224(long arg0, int arg1) throws IOException {
        this.field690.seek(arg0);
        if (arg1 == -1) {
            this.field689 = arg0;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method225(int arg0) {
        if (arg0 != 1369) {
            this.field687 = null;
        }
        return this.field687;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "([BIII)I")
    public final int method226(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field690.read(arg0, arg3, arg1);
        if (arg2 == 16278) {
            if (var5 > 0) {
                this.field689 += var5;
            }
            return var5;
        } else {
            return 115;
        }
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(I)J")
    public final long method227(int arg0) throws IOException {
        if (arg0 != 0) {
            this.field690 = null;
        }
        return this.field690.length();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public final void method228(byte arg0) throws IOException {
        if (this.field690 != null) {
            this.field690.close();
            this.field690 = null;
        }
        if (arg0 != 45) {
            this.field687 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BII[B)V")
    public final void method229(byte arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        if (this.field688 < (long) arg2 + this.field689) {
            this.field690.seek(this.field688 + 1L);
            this.field690.write(1);
            throw new EOFException();
        } else {
            this.field690.write(arg3, arg1, arg2);
            this.field689 += arg2;
            int var5 = -70 / ((-arg0 - 54) / 34);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class42(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field690 = new RandomAccessFile(arg0, arg1);
        this.field687 = arg0;
        this.field689 = 0L;
        this.field688 = arg2;
        int var5 = this.field690.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field690.seek(0L);
            this.field690.write(var5);
        }
        this.field690.seek(0L);
    }
}
