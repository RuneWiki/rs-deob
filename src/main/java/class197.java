import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class197 extends class25 {

    @OriginalMember(owner = "client!o", name = "r", descriptor = "Lcd;")
    public static class64 field3354 = class44.method335((byte) 71, "Starte 3D)2Softwarebibliothek)3");

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Lcd;")
    public static class64 field3374 = class44.method335((byte) 71, "::");

    @OriginalMember(owner = "client!o", name = "N", descriptor = "Lja;")
    public static class60 field3375 = null;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "Lcd;")
    public static class64 field3377 = class44.method335((byte) 71, "showVideoAd");

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field3349;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public int field3351;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "I")
    public int field3353;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "I")
    public int field3358;

    @OriginalMember(owner = "client!o", name = "w", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!o", name = "x", descriptor = "I")
    public int field3360;

    @OriginalMember(owner = "client!o", name = "y", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!o", name = "z", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!o", name = "A", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    public int field3365;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    public int field3368;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public int field3370;

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public int field3372;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public int field3373;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public int field3378;

    @OriginalMember(owner = "client!o", name = "u", descriptor = "Lt;")
    public class242 field3357;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Lbe;")
    public class286 field3366;

    @OriginalMember(owner = "client!o", name = "t", descriptor = "Lug;")
    public class294 field3356;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "Lua;")
    public class83 field3364;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V", line = 5)
    public static final void method1380(int arg0) {
        class34.method283(107, 5);
        class101.method748(7736, 5);
        field3350++;
        class31.method272((byte) 124, 5);
        class58.method448(120, 5);
        class147.method1044(5, 5);
        class289.method1996(5, 100);
        class24.method224(5, (byte) 100);
        class160.method1158((byte) -108, 5);
        if (arg0 >= -109) {
            return;
        }
        class184.method1295(-464486940, 5);
        class229.method1655(5, false);
        class120.method848((byte) -102, 5);
        class122.method857((byte) -73, 50);
        class140.method996(true, 5);
        class142.method1009((byte) -15, 5);
        class258.field4460.method1197((byte) 68, 5);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(B)V", line = 32)
    public static void method1381(byte arg0) {
        if (arg0 == 49) {
            field3354 = null;
            field3374 = null;
            field3377 = null;
            field3375 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "e", descriptor = "(I)V", line = 48)
    public final void method1382(int arg0) {
        this.field3364 = null;
        field3361++;
        this.field3356 = null;
        this.field3366 = null;
        int var2 = -31 % ((-arg0 - 3) / 33);
        this.field3357 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)I", line = 80)
    public static final int method1383(int arg0, int arg1, int arg2) {
        field3355++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg2 < 2) {
                arg2 = 2;
            } else if (arg2 > 126) {
                arg2 = 126;
            }
            return arg2;
        } else {
            int var3 = (arg1 & 0x7F) * arg2 >> 7;
            if (var3 < arg0) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIILa;La;IIIIJ)V", line = 118)
    public static final void method1384(int arg0, int arg1, int arg2, int arg3, class262 arg4, class262 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class184 var12 = new class184();
        var12.field3141 = arg10;
        var12.field3152 = arg1 * 128 + 64;
        var12.field3145 = arg2 * 128 + 64;
        var12.field3154 = arg3;
        var12.field3151 = arg4;
        var12.field3143 = arg5;
        var12.field3156 = arg6;
        var12.field3149 = arg7;
        var12.field3147 = arg8;
        var12.field3142 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class304.field5203[var13][arg1][arg2] == null) {
                class304.field5203[var13][arg1][arg2] = new class295(var13, arg1, arg2);
            }
        }
        class304.field5203[arg0][arg1][arg2].field5079 = var12;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)V", line = 180)
    public static final void method1385(int arg0, int arg1) {
        int var2 = -30 / ((64 - arg1) / 55);
        field3349++;
        class255.field4436 = -1;
        class189.field3257 = -1;
        class69.field1335 = arg0;
        class155.method1117((byte) -53);
    }
}
