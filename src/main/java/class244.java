import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class244 extends class131 {

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "I")
    private int field3897;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    private int field3899;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    private int field3895;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    private int field3893;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "Ljava/lang/String;")
    public static String field3896 = "wave2:";

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "Lgd;")
    public static class170 field3901 = new class170(16);

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "Z")
    public static boolean field3904 = false;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field3905 = 0;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "Ljava/lang/String;")
    public static String field3908 = "purple:";

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "Ljava/lang/String;")
    public static String field3909 = "Please remove ";

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "[Lwj;")
    public static class270[] field3907;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z", line = 4)
    public static final boolean method1690(byte arg0) {
        field3902++;
        if (class296.field4571) {
            try {
                class3.method16("showVideoAd", class32.field471.field2721, -119);
                return true;
            } catch (Throwable var2) {
            }
        }
        if (arg0 != 5) {
            method1692(false);
        }
        return false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V", line = 32)
    public final void method6(int arg0, int arg1, int arg2) {
        int var4 = this.field3893 * arg1 >> 12;
        field3891++;
        int var5 = this.field3895 * arg2 >> 12;
        if (arg0 != 1877660193) {
            method1690((byte) -52);
        }
        int var6 = this.field3897 * arg2 >> 12;
        int var7 = this.field3899 * arg1 >> 12;
        class106.method771(var5, 0, var7, this.field2056, var6, var4);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(III)V", line = 54)
    public final void method4(int arg0, int arg1, int arg2) {
        if (arg1 != 3) {
            return;
        }
        field3903++;
        int var4 = this.field3899 * arg2 >> 12;
        int var5 = this.field3893 * arg2 >> 12;
        int var6 = this.field3895 * arg0 >> 12;
        int var7 = this.field3897 * arg0 >> 12;
        class118.method868(19240, var4, var5, var6, var7, this.field2056, this.field2046, this.field2059);
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(IIIIIII)V", line = 72)
    public class244(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3897 = arg3;
        this.field3899 = arg0;
        this.field3895 = arg1;
        this.field3893 = arg2;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(JI)V", line = 90)
    public static final void method1691(long arg0, int arg1) {
        field3892++;
        int var3 = -11 / ((arg1 + 60) / 32);
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var5) {
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBI)V", line = 103)
    public final void method3(int arg0, byte arg1, int arg2) {
        field3900++;
        int var4 = this.field3899 * arg0 >> 12;
        if (arg1 <= 102) {
            this.method4(12, 54, 20);
        }
        int var5 = this.field3893 * arg0 >> 12;
        int var6 = this.field3897 * arg2 >> 12;
        int var7 = this.field3895 * arg2 >> 12;
        class220.method1565((byte) -128, var5, var7, this.field2059, var4, this.field2046, var6);
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(Z)V", line = 124)
    public static void method1692(boolean arg0) {
        if (arg0) {
            field3908 = (String) null;
        }
        field3901 = null;
        field3896 = null;
        field3908 = null;
        field3907 = null;
        field3909 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILl;I)[Lin;", line = 140)
    public static final class168[] method1693(int arg0, class133 arg1, int arg2) {
        if (arg2 != -1511306100) {
            method1692(true);
        }
        field3894++;
        return class125.method907(arg1, -4956, arg0) ? class192.method1371(true) : null;
    }
}
