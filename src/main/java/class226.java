import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class226 {

    @OriginalMember(owner = "client!og", name = "m", descriptor = "Lgk;")
    public static class159 field3394 = new class159();

    @OriginalMember(owner = "client!og", name = "a", descriptor = "I")
    public int field3382;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!og", name = "c", descriptor = "I")
    public int field3384;

    @OriginalMember(owner = "client!og", name = "d", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!og", name = "e", descriptor = "I")
    public int field3386;

    @OriginalMember(owner = "client!og", name = "f", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!og", name = "g", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!og", name = "i", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!og", name = "j", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!og", name = "l", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!og", name = "k", descriptor = "Lpf;")
    public static class294 field3392;

    @OriginalMember(owner = "client!og", name = "n", descriptor = "Lpf;")
    public static class294 field3395;

    @OriginalMember(owner = "client!og", name = "h", descriptor = "Z")
    public static boolean field3389;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method1440(int arg0) {
        field3392 = null;
        if (arg0 >= -82) {
            method1443(63, -52, 37, -26, 33, (byte) -80, 95, -15, 103, -92, -45, 8, 9);
        }
        field3394 = null;
        field3395 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V")
    public static final void method1441(int arg0) {
        field3393++;
        if (class259.field3951 || arg0 < 14) {
            return;
        }
        class259.field3951 = true;
        class177.field2722 = true;
        if (class195.field2970) {
            class84.field1336 = (float) ((int) class84.field1336 + 191 & 0xFFFFFF80);
        } else {
            class252.field3828 += (24.0F - class252.field3828) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)V")
    public static final void method1442(byte arg0, int arg1) {
        class146.field2137 = -1;
        if (arg0 != -73) {
            method1445(8);
        }
        class146.field2137 = -1;
        field3391++;
        class268.field4042 = arg1;
        class282.method1860(1);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIBIIIIIII)V")
    public static final void method1443(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field3383++;
        class69 var13 = new class69();
        var13.field1096 = arg4;
        var13.field1082 = arg2;
        var13.field1085 = arg12;
        var13.field1088 = arg0;
        var13.field1093 = arg8;
        var13.field1086 = arg9;
        var13.field1079 = arg10;
        if (arg5 != 36) {
            method1442((byte) 12, -127);
        }
        var13.field1089 = arg6;
        var13.field1083 = arg7;
        var13.field1080 = arg11;
        var13.field1087 = arg1;
        var13.field1084 = arg3;
        class97.field1530.method987(var13, (byte) -121);
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public static final void method1444(int arg0) {
        field3385++;
        if (!class153.field2305) {
            return;
        }
        class289 var1 = class66.method450(class116.field1763, 0, class162.field2482);
        if (arg0 != -128) {
            return;
        }
        if (var1 != null && var1.field4471 != null) {
            class234 var2 = new class234();
            var2.field3533 = var1.field4471;
            var2.field3528 = var1;
            class228.method1456((byte) 125, var2);
        }
        class225.field3379 = -1;
        class153.field2305 = false;
        class295.method1980(var1, 0);
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V")
    public static final void method1445(int arg0) {
        field3387++;
        if (arg0 != -25784) {
            field3392 = null;
        }
        for (class192 var1 = (class192) class228.field3432.method983(7); var1 != null; var1 = (class192) class228.field3432.method985((byte) -122)) {
            if (var1.field2946 == -1) {
                var1.field2943 = 0;
                class252.method1655(var1, arg0 ^ 0xFFFF9B1A);
            } else {
                var1.method538(arg0 + 25863);
            }
        }
    }
}
