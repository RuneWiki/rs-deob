import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class700 {

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field9736;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "Ljava/io/File;")
    private File field9732;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "J")
    private long field9735;

    @OriginalMember(owner = "client!dq", name = "j", descriptor = "J")
    private long field9741;

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
    public static int field9738 = 0;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field9733;

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
    public static int field9734;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!dq", name = "i", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!dq", name = "k", descriptor = "I")
    public static int field9742;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public static int field9743;

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field9744;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public static int field9745;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "([IIILbi;ZIZI)Lbaa;", line = 4)
    public static final class525 method3934(int[] arg0, int arg1, int arg2, class483 arg3, boolean arg4, int arg5, boolean arg6, int arg7) {
        field9742++;
        if (!arg4) {
            return null;
        } else if (!arg3.field6875 && (!class54.method400(5533, arg7) || !class54.method400(5533, arg5))) {
            return arg3.field6880 ? new class525(arg3, 34037, arg7, arg5, arg6, arg0, arg2, arg1) : new class525(arg3, arg7, arg5, class565.method3253(-115, arg7), class565.method3253(45, arg5), arg0);
        } else {
            return new class525(arg3, 3553, arg7, arg5, arg6, arg0, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)Ljava/io/File;", line = 23)
    public final File method3935(int arg0) {
        field9733++;
        int var2 = -13 % ((arg0 + 47) / 43);
        return this.field9732;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Lds;", line = 36)
    public static final class14 method3936(int arg0, int arg1, int arg2) {
        if (class197.field2689[arg0][arg1][arg2] == null) {
            boolean var3 = class197.field2689[0][arg1][arg2] != null && class197.field2689[0][arg1][arg2].field282 != null;
            if (var3 && arg0 >= class29.field515 - 1) {
                return null;
            }
            class438.method2492(arg0, arg1, arg2);
        }
        return class197.field2689[arg0][arg1][arg2];
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III[B)V", line = 50)
    public final void method3937(int arg0, int arg1, int arg2, byte[] arg3) throws IOException {
        field9737++;
        if (((long) arg2 + this.field9741) > this.field9735) {
            this.field9736.seek(this.field9735);
            this.field9736.write(1);
            throw new EOFException();
        }
        this.field9736.write(arg3, arg1, arg2);
        if (arg0 != -14430) {
            method3936(57, -61, -67);
        }
        this.field9741 += arg2;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z[BII)I", line = 75)
    public final int method3938(boolean arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field9744++;
        if (arg0) {
            return -33;
        }
        int var5 = this.field9736.read(arg1, arg2, arg3);
        if (var5 > 0) {
            this.field9741 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)J", line = 93)
    public final long method3939(byte arg0) throws IOException {
        if (arg0 < 41) {
            this.field9735 = 18L;
        }
        field9743++;
        return this.field9736.length();
    }

    @OriginalMember(owner = "client!dq", name = "finalize", descriptor = "()V", line = 106)
    protected final void finalize() throws Throwable {
        if (this.field9736 != null) {
            System.out.println("Warning! fileondisk " + this.field9732 + " not closed correctly using close(). Auto-closing instead. ");
            this.method3941(true);
        }
        field9745++;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 119)
    public class700(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field9736 = new RandomAccessFile(arg0, arg1);
        this.field9732 = arg0;
        this.field9735 = arg2;
        this.field9741 = 0L;
        int var5 = this.field9736.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field9736.seek(0L);
            this.field9736.write(var5);
        }
        this.field9736.seek(0L);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(JZ)V", line = 150)
    public final void method3940(long arg0, boolean arg1) throws IOException {
        this.field9736.seek(arg0);
        field9740++;
        if (arg1) {
            this.field9736 = null;
        }
        this.field9741 = arg0;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Z)V", line = 169)
    public final void method3941(boolean arg0) throws IOException {
        field9739++;
        if (this.field9736 != null) {
            this.field9736.close();
            this.field9736 = null;
        }
        if (!arg0) {
            method3934(null, 123, -13, null, true, 91, true, -13);
        }
    }
}
