import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class390 {

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "Ljava/io/RandomAccessFile;")
    private RandomAccessFile field5877;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "J")
    private long field5879;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "J")
    private long field5875;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "Ljava/io/File;")
    private File field5880;

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "[I")
    public static int[] field5878 = new int[1];

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "Lqe;")
    public static class469 field5882 = new class469(19, -2);

    @OriginalMember(owner = "client!kda", name = "o", descriptor = "Lfw;")
    public static class57 field5884 = new class57();

    @OriginalMember(owner = "client!kda", name = "p", descriptor = "I")
    public static int field5885 = -1;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field5871;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "I")
    public static int field5873;

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public static int field5874;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public static int field5876;

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "I")
    public static int field5881;

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([BIBI)I")
    public final int method2500(byte[] arg0, int arg1, byte arg2, int arg3) throws IOException {
        field5881++;
        if (arg2 != 103) {
            return 57;
        }
        int var5 = this.field5877.read(arg0, arg1, arg3);
        if (var5 > 0) {
            this.field5875 += var5;
        }
        return var5;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(IJ)V")
    public final void method2501(int arg0, long arg1) throws IOException {
        this.field5877.seek(arg1);
        field5876++;
        this.field5875 = arg1;
        int var4 = -7 / ((arg0 - 45) / 44);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lbs;B)I")
    public static final int method2502(class689 arg0, byte arg1) {
        field5873++;
        int var2 = arg0.field9511;
        class264 var3 = arg0.method2577(-1);
        if (arg0.field6123 == -1 || arg0.field6032) {
            var2 = arg0.field9533;
        } else if (arg0.field6123 == var3.field3740 || arg0.field6123 == var3.field3764 || arg0.field6123 == var3.field3759 || arg0.field6123 == var3.field3747) {
            var2 = arg0.field9501;
        } else if (arg0.field6123 == var3.field3763 || arg0.field6123 == var3.field3779 || arg0.field6123 == var3.field3738 || arg0.field6123 == var3.field3762) {
            var2 = arg0.field9523;
        }
        int var4 = -73 / ((35 - arg1) / 46);
        return var2;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V")
    public static void method2503(int arg0) {
        int var1 = -2 / ((arg0 - 68) / 34);
        field5884 = null;
        field5882 = null;
        field5878 = null;
    }

    @OriginalMember(owner = "client!kda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        if (this.field5877 != null) {
            System.out.println("Warning! fileondisk " + this.field5880 + " not closed correctly using close(). Auto-closing instead. ");
            this.method2504(-91);
        }
        field5870++;
    }

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "(I)V")
    public final void method2504(int arg0) throws IOException {
        if (this.field5877 != null) {
            this.field5877.close();
            this.field5877 = null;
        }
        field5872++;
        int var2 = -33 / (-arg0 / 54);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(B)J")
    public final long method2505(byte arg0) throws IOException {
        if (arg0 <= 24) {
            return -102L;
        } else {
            field5883++;
            return this.field5877.length();
        }
    }

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "(I)Ljava/io/File;")
    public final File method2506(int arg0) {
        if (arg0 != -31270) {
            method2502(null, (byte) -122);
        }
        field5874++;
        return this.field5880;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(Ljava/io/File;Ljava/lang/String;J)V")
    public class390(File arg0, String arg1, long arg2) throws IOException {
        if (arg2 == -1L) {
            arg2 = Long.MAX_VALUE;
        }
        if (arg2 < arg0.length()) {
            arg0.delete();
        }
        this.field5877 = new RandomAccessFile(arg0, arg1);
        this.field5879 = arg2;
        this.field5875 = 0L;
        this.field5880 = arg0;
        int var5 = this.field5877.read();
        if (var5 != -1 && !arg1.equals("r")) {
            this.field5877.seek(0L);
            this.field5877.write(var5);
        }
        this.field5877.seek(0L);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "([BBII)V")
    public final void method2507(byte[] arg0, byte arg1, int arg2, int arg3) throws IOException {
        if (arg1 < 100) {
            this.field5879 = 72L;
        }
        field5871++;
        if (this.field5879 < (long) arg3 + this.field5875) {
            this.field5877.seek(this.field5879);
            this.field5877.write(1);
            throw new EOFException();
        } else {
            this.field5877.write(arg0, arg2, arg3);
            this.field5875 += arg3;
        }
    }
}
