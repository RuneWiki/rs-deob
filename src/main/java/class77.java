import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class77 extends class120 {

    @OriginalMember(owner = "client!te", name = "l", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!te", name = "o", descriptor = "I")
    public int field1084;

    @OriginalMember(owner = "client!te", name = "q", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!te", name = "t", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!te", name = "v", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!te", name = "w", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!te", name = "x", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!te", name = "p", descriptor = "Ldl;")
    public static class123 field1085;

    @OriginalMember(owner = "client!te", name = "m", descriptor = "[I")
    public int[] field1082;

    @OriginalMember(owner = "client!te", name = "r", descriptor = "[I")
    public int[] field1087;

    @OriginalMember(owner = "client!te", name = "u", descriptor = "[I")
    public int[] field1090;

    @OriginalMember(owner = "client!te", name = "n", descriptor = "[Lol;")
    public class208[] field1083;

    @OriginalMember(owner = "client!te", name = "y", descriptor = "[Lol;")
    public class208[] field1094;

    @OriginalMember(owner = "client!te", name = "s", descriptor = "[[[B")
    public byte[][][] field1088;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ldl;Ldl;B)V")
    public static final void method518(class123 arg0, class123 arg1, byte arg2) {
        field1091++;
        class198.field3096 = arg1;
        int var3 = (int) (Math.random() * 21.0D) - 10;
        class49.field625 = arg0;
        if (arg2 < 112) {
            method521(117, (byte) 75);
        }
        class198.field3096.method820(34, 112);
        int var4 = (int) (Math.random() * 21.0D) - 10;
        int var5 = (int) (Math.random() * 41.0D) - 20;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        class70.field984 = var5 + var6;
        class13.field178 = var3 + var5;
        class194.field3059 = var4 + var5;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIIIIII)V")
    public static final void method519(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 >= -98) {
            method521(-34, (byte) -102);
        }
        class194[] var7 = class144.field2129;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class194 var9 = var7[var8];
            if (var9 != null && var9.field3050 == 2) {
                class215.method1457(var9.field3063 * 2, arg6, arg0 >> 1, arg1, 13, (var9.field3054 - class126.field1869 << 7) + var9.field3062, (-class246.field3943 + var9.field3047 << 7) + var9.field3055, arg3 >> 1);
                if (class199.field3121 > -1 && class111.field1684 % 20 < 10) {
                    class146.field2152[var9.field3053].method71(class199.field3121 + arg4 - 12, class179.field2789 + arg2 + -28);
                }
            }
        }
        field1089++;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIBLef;)V")
    public static final void method520(int arg0, int arg1, byte arg2, class214 arg3) {
        if (arg3.field3388 == 0) {
            arg3.field3373 = arg3.field3469;
        } else if (arg3.field3388 == 1) {
            arg3.field3373 = (arg0 - arg3.field3473) / 2 + arg3.field3469;
        } else if (arg3.field3388 == 2) {
            arg3.field3373 = arg0 - arg3.field3469 - arg3.field3473;
        } else if (arg3.field3388 == 3) {
            arg3.field3373 = arg3.field3469 * arg0 >> 14;
        } else if (arg3.field3388 == 4) {
            arg3.field3373 = (arg3.field3469 * arg0 >> 14) + (arg0 - arg3.field3473) / 2;
        } else {
            arg3.field3373 = arg0 - arg3.field3473 - (arg3.field3469 * arg0 >> 14);
        }
        field1093++;
        if (arg3.field3479 == 0) {
            arg3.field3418 = arg3.field3452;
        } else if (arg3.field3479 == 1) {
            arg3.field3418 = (arg1 - arg3.field3369) / 2 + arg3.field3452;
        } else if (arg3.field3479 == 2) {
            arg3.field3418 = arg1 - arg3.field3369 - arg3.field3452;
        } else if (arg3.field3479 == 3) {
            arg3.field3418 = arg3.field3452 * arg1 >> 14;
        } else if (arg3.field3479 == 4) {
            arg3.field3418 = (arg3.field3452 * arg1 >> 14) + (arg1 - arg3.field3369) / 2;
        } else {
            arg3.field3418 = arg1 - arg3.field3369 - (arg3.field3452 * arg1 >> 14);
        }
        if (class22.field270 && (client.method1038(arg3).field1029 != 0 || arg3.field3447 == 0)) {
            if (arg3.field3373 < 0) {
                arg3.field3373 = 0;
            } else if (arg0 < arg3.field3473 + arg3.field3373) {
                arg3.field3373 = arg0 - arg3.field3473;
            }
            if (arg3.field3418 < 0) {
                arg3.field3418 = 0;
            } else if (arg1 < (arg3.field3418 + arg3.field3369)) {
                arg3.field3418 = arg1 - arg3.field3369;
            }
        }
        if (arg2 != -120) {
            field1085 = null;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IB)Lge;")
    public static final class70 method521(int arg0, byte arg1) {
        if (arg1 != -42) {
            field1092 = -65;
        }
        field1086++;
        class70 var2 = (class70) class118.field1728.method1428((long) arg0, (byte) -63);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class82.field1277.method807((byte) 83, class3.method12(arg0, 29092), class105.method690(arg0, -823281080));
        class70 var4 = new class70();
        var4.field995 = arg0;
        if (var3 != null) {
            var4.method477(new class25(var3), 31);
        }
        class118.field1728.method1424((long) arg0, var4, arg1 ^ 0x776D3F37);
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V")
    public static void method522(byte arg0) {
        if (arg0 != 39) {
            method518((class123) null, (class123) null, (byte) -102);
        }
        field1085 = null;
    }
}
