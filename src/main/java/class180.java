import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class180 {

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static volatile int field3240 = 0;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "[Lbk;")
    public static class20[] field3247 = new class20[4];

    @OriginalMember(owner = "client!da", name = "d", descriptor = "[I")
    public static int[] field3243 = new int[50];

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Ljd;")
    public static class86 field3245 = class122.method868(":assistreq:", true);

    @OriginalMember(owner = "client!da", name = "g", descriptor = "Ljd;")
    public static class86 field3246 = class122.method868(": ", true);

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Z")
    public static boolean field3242 = false;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Ljd;")
    public static class86 field3241 = class122.method868("Stufe:", true);

    @OriginalMember(owner = "client!da", name = "l", descriptor = "Z")
    public static boolean field3251 = false;

    @OriginalMember(owner = "client!da", name = "n", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!da", name = "j", descriptor = "Loj;")
    public static class155 field3249;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[[[I")
    public static int[][][] field3250;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(BIIIILfk;)V")
    public static final void method1260(byte arg0, int arg1, int arg2, int arg3, int arg4, class14 arg5) {
        field3252++;
        if (arg5.field422 == -1 && arg5.field431 == null) {
            return;
        }
        int var6 = 0;
        if (arg5.field415 < arg2) {
            var6 += arg2 - arg5.field415;
        } else if (arg2 < arg5.field432) {
            var6 += arg5.field432 - arg2;
        }
        if (arg3 > arg5.field423) {
            var6 += arg3 - arg5.field423;
        } else if (arg3 < arg5.field409) {
            var6 += arg5.field409 - arg3;
        }
        if (arg5.field426 == 0 || (var6 - 64) > arg5.field426 || class152.field2879 == 0 || arg5.field429 != arg4) {
            if (arg5.field420 != null) {
                class2.field18.method366(arg5.field420);
                arg5.field420 = null;
            }
            if (arg5.field424 != null) {
                class2.field18.method366(arg5.field424);
                arg5.field424 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg5.field426 - var6) * class152.field2879 / arg5.field426;
        if (arg5.field420 != null) {
            arg5.field420.method1829(var7);
        } else if (arg5.field422 >= 0) {
            class199 var8 = class199.method1373(class220.field3964, arg5.field422, 0);
            if (var8 != null) {
                class19 var9 = var8.method1372().method151(class50.field1059);
                class266 var10 = class266.method1827(var9, 100, var7);
                var10.method1830(-1);
                class2.field18.method371(var10);
                arg5.field420 = var10;
            }
        }
        if (arg5.field424 != null) {
            arg5.field424.method1829(var7);
            if (!arg5.field424.method1476(200)) {
                arg5.field424 = null;
            }
        } else if (arg5.field431 != null && (arg5.field414 -= arg1) <= 0) {
            int var11 = (int) (Math.random() * (double) arg5.field431.length);
            class199 var12 = class199.method1373(class220.field3964, arg5.field431[var11], 0);
            if (var12 != null) {
                class19 var13 = var12.method1372().method151(class50.field1059);
                class266 var14 = class266.method1827(var13, 100, var7);
                var14.method1830(0);
                class2.field18.method371(var14);
                arg5.field414 = (int) (Math.random() * (double) (arg5.field418 - arg5.field430)) + arg5.field430;
                arg5.field424 = var14;
            }
        }
        if (arg0 != 76) {
            field3249 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static void method1261(byte arg0) {
        field3243 = null;
        field3249 = null;
        field3245 = null;
        field3246 = null;
        field3250 = null;
        if (arg0 <= 61) {
            field3248 = 29;
        }
        field3241 = null;
        field3247 = null;
    }
}
