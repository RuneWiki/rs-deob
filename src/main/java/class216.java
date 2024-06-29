import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class216 {

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field2816;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "Ljava/io/File;")
    private File field2818;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "J")
    private long field2823;

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "J")
    private long field2814;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "Lkr;")
    public static class602 field2813 = new class602(112, -1);

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
    public static int field2812;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "Luu;")
    public static class237 field2822;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "Laha;")
    public static class89 field2820;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([BIII)I", line = 3)
    public final int method1268(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        if (arg3 != 31833) {
            method1270(null, true);
        }
        field2824++;
        int var5 = this.field2816.read(arg0, arg2, arg1);
        if (var5 > 0) {
            this.field2814 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)Ljava/io/File;", line = 22)
    public final File method1269(int arg0) {
        int var2 = -98 / ((arg0 + 52) / 47);
        field2819++;
        return this.field2818;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([Ljava/lang/String;Z)[Ljava/lang/String;", line = 37)
    public static final String[] method1270(String[] arg0, boolean arg1) {
        field2815++;
        String[] var2 = new String[5];
        for (int var3 = 0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg0 != null && arg0[var3] != null) {
                var2[var3] = var2[var3] + arg0[var3];
            }
        }
        if (arg1) {
            field2813 = null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BJ)V", line = 62)
    public final void method1271(byte arg0, long arg1) throws IOException {
        this.field2816.seek(arg1);
        if (arg0 == 85) {
            field2811++;
            this.field2814 = arg1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V", line = 74)
    public static void method1272(byte arg0) {
        field2820 = null;
        field2813 = null;
        if (arg0 != -79) {
            field2820 = null;
        }
        field2822 = null;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V", line = 87)
    public final void method1273(int arg0) throws IOException {
        if (this.field2816 != null) {
            this.field2816.close();
            this.field2816 = null;
        }
        field2825++;
        int var2 = 78 % ((arg0 - 23) / 35);
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)J", line = 104)
    public final long method1274(int arg0) throws IOException {
        if (arg0 == 112) {
            field2812++;
            return this.field2816.length();
        } else {
            return -127L;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "([BIII)V", line = 115)
    public final void method1275(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2821++;
        if (((long) arg3 + this.field2814) > this.field2823) {
            this.field2816.seek(this.field2823);
            this.field2816.write(1);
            throw new EOFException();
        } else if (arg1 == -13054) {
            this.field2816.write(arg0, arg2, arg3);
            this.field2814 += arg3;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V", line = 146)
    public class216(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field2816 = new RandomAccessFile(arg0, arg1);
        this.field2818 = arg0;
        this.field2823 = arg2;
        this.field2814 = 0L;
        int var5 = this.field2816.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field2816.seek(0L);
            this.field2816.write(var5);
        }
        this.field2816.seek(0L);
    }

    @OriginalMember(owner = "client!ac", name = "finalize", descriptor = "()V", line = 178)
    protected final void finalize() throws Throwable {
        if (this.field2816 != null) {
            System.out.println("Warning! fileondisk " + this.field2818 + " not closed correctly using close(). Auto-closing instead. ");
            this.method1273(59);
        }
        field2817++;
    }
}
