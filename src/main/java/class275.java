import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class275 {

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Z")
    public static boolean field3877 = true;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "[I")
    public static int[] field3880 = new int[256];

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Ljava/lang/String;")
    public static String field3882;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "Lgr;")
    public static class530 field3883;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field3879;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lla;")
    public static class423 field3876;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3880[var0] = var1;
        }
        field3882 = null;
        field3883 = new class530(59, 3);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 7)
    public static final void method1777(String arg0, byte arg1) {
        field3875++;
        if (!class549.field7997 || (class538.field7820 & 0x18) == 0) {
            return;
        }
        boolean var2 = false;
        int var3 = class468.field6665;
        int[] var4 = class38.field500;
        for (int var5 = 0; var5 < var3; var5++) {
            class639 var6 = class536.field7796[var4[var5]];
            if (var6.field9056 != null && var6.field9056.equalsIgnoreCase(arg0) && (class108.field1536 == var6 && (class538.field7820 & 0x10) != 0 || var6 != null && (class538.field7820 & 0x8) != 0)) {
                class743.field10361++;
                class88 var7 = class448.method2741((byte) 94, class687.field9755, class583.field8319);
                var7.field1260.method2887(var4[var5], (byte) -119);
                var7.field1260.method2914(class191.field2688, (byte) 72);
                var7.field1260.method2927((byte) -54, class231.field3475);
                var7.field1260.method2877(0, 128);
                var7.field1260.method2914(class250.field3640, (byte) 55);
                class523.method3183(var7, (byte) 31);
                var2 = true;
                class541.method3255(var6.method2053(true), 0, -2, var6.method2053(true), var6.field4645[0], var6.field4646[0], 0, (byte) -49, true);
                break;
            }
        }
        if (!var2) {
            class758.method4212(4, 2, class608.field8641.method3543(arg1 ^ 0xFFFFA0E2, class45.field748) + arg0);
        }
        if (arg1 == 0 && class549.field7997) {
            class61.method571(false);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 59)
    public static void method1778(byte arg0) {
        field3883 = null;
        field3882 = null;
        field3876 = null;
        if (arg0 >= 87) {
            field3880 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ZIILla;)Lgw;", line = 74)
    public static final class685 method1779(boolean arg0, int arg1, int arg2, class423 arg3) {
        field3874++;
        class479 var4 = new class479(arg3.method2600(0, arg1, arg2));
        class685 var5 = new class685(arg2, var4.method2894(-13192), var4.method2894(-13192), var4.method2868(-87), var4.method2868(-75), var4.method2886(arg0) == 1, var4.method2886(true), var4.method2886(arg0));
        int var6 = var4.method2886(arg0);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field9727.method3559(new class646(var4.method2886(true), var4.method2882(-1), var4.method2882(-1), var4.method2882(-1), var4.method2882(-1), var4.method2882(-1), var4.method2882(-1), var4.method2882(-1), var4.method2882(-1)), (byte) 12);
        }
        var5.method3894(925);
        return var5;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Z", line = 98)
    public static final boolean method1780(int arg0, int arg1, int arg2) {
        field3878++;
        if (arg2 <= 75) {
            field3883 = null;
        }
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }
}
