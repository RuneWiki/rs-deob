import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class121 {

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2170;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "J")
    private long field2171;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Ljava/io/File;")
    private File field2169;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "J")
    private long field2168;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I[BBI)I")
    public final int method728(int arg0, byte[] arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != 6) {
            this.field2170 = null;
        }
        int var5 = this.field2170.read(arg1, arg0, arg3);
        if (var5 > 0) {
            this.field2168 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)J")
    public final long method729(boolean arg0) throws IOException {
        if (arg0) {
            this.method731(-22);
        }
        return this.field2170.length();
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BIIB)V")
    public final void method730(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        if ((long) arg2 + this.field2168 > this.field2171) {
            this.field2170.seek(this.field2171 + 1L);
            this.field2170.write(1);
            throw new EOFException();
        }
        this.field2170.write(arg0, arg1, arg2);
        if (arg3 != -61) {
            this.field2170 = null;
        }
        this.field2168 += arg2;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)Ljava/io/File;")
    public final File method731(int arg0) {
        if (arg0 != 1) {
            this.field2169 = null;
        }
        return this.field2169;
    }

    @OriginalMember(owner = "client!mg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field2170 != null) {
            System.out.println("Warning! fileondisk " + this.field2169 + " not closed correctly using close(). Auto-closing instead. ");
            this.method733(0);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JI)V")
    public final void method732(long arg0, int arg1) throws IOException {
        this.field2170.seek(arg0);
        this.field2168 = arg0;
        if (arg1 >= -46) {
            this.field2168 = 23L;
        }
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class121(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field2170 = new RandomAccessFile(arg0, arg1);
        this.field2171 = arg2;
        this.field2169 = arg0;
        this.field2168 = 0L;
        int var5 = this.field2170.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2170.seek(0L);
            this.field2170.write(var5);
        }
        this.field2170.seek(0L);
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)V")
    public final void method733(int arg0) throws IOException {
        if (this.field2170 != null) {
            this.field2170.close();
            this.field2170 = null;
        }
        if (arg0 != 0) {
            this.field2168 = -25L;
        }
    }
}
