import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("sa")
public class class167 {

    @OriginalMember(owner = "sa", name = "c", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field3110;

    @OriginalMember(owner = "sa", name = "a", descriptor = "J")
    private long field3108;

    @OriginalMember(owner = "sa", name = "b", descriptor = "Ljava/io/File;")
    private File field3109;

    @OriginalMember(owner = "sa", name = "d", descriptor = "J")
    private long field3111;

    @OriginalMember(owner = "sa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field3110 != null) {
            System.out.println("Warning! fileondisk " + this.field3109 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1120((byte) -119);
        }
    }

    @OriginalMember(owner = "sa", name = "a", descriptor = "(B)V")
    public final void method1120(byte arg0) throws IOException {
        int var2 = 74 % ((arg0 + 44) / 54);
        if (this.field3110 != null) {
            this.field3110.close();
            this.field3110 = null;
        }
    }

    @OriginalMember(owner = "sa", name = "a", descriptor = "([BIBI)V")
    public final void method1121(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        if (arg2 != -7) {
            this.field3109 = null;
        }
        if (this.field3111 < (long) arg3 + this.field3108) {
            this.field3110.seek(this.field3111 + 1L);
            this.field3110.write(1);
            throw new EOFException();
        } else {
            this.field3110.write(arg0, arg1, arg3);
            this.field3108 += arg3;
        }
    }

    @OriginalMember(owner = "sa", name = "a", descriptor = "(I[BII)I")
    public final int method1122(int arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int var5 = this.field3110.read(arg1, arg2, arg0);
        if (var5 > 0) {
            this.field3108 += var5;
        }
        if (arg3 != 1) {
            this.field3110 = null;
        }
        return var5;
    }

    @OriginalMember(owner = "sa", name = "a", descriptor = "(IJ)V")
    public final void method1123(int arg0, long arg1) throws IOException {
        this.field3110.seek(arg1);
        this.field3108 = arg1;
        if (arg0 >= -18) {
            this.field3110 = null;
        }
    }

    @OriginalMember(owner = "sa", name = "a", descriptor = "(Z)Ljava/io/File;")
    public final File method1124(boolean arg0) {
        return arg0 ? null : this.field3109;
    }

    @OriginalMember(owner = "sa", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class167(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 <= arg0.length()) {
            arg0.delete();
        }
        this.field3110 = new RandomAccessFile(arg0, arg1);
        this.field3108 = 0L;
        this.field3109 = arg0;
        this.field3111 = arg2;
        int var5 = this.field3110.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field3110.seek(0L);
            this.field3110.write(var5);
        }
        this.field3110.seek(0L);
    }

    @OriginalMember(owner = "sa", name = "a", descriptor = "(I)J")
    public final long method1125(int arg0) throws IOException {
        int var2 = -18 % ((1 - arg0) / 62);
        return this.field3110.length();
    }
}
