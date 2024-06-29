import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public abstract class class191 extends class202 {

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "Z")
    public volatile boolean field3427 = true;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "Z")
    public static boolean field3433 = false;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "Loh;")
    public static class263 field3423 = class253.method1681(-123, "Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "Loh;")
    private static class263 field3438 = class253.method1681(-126, "glow1:");

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "Loh;")
    public static class263 field3437 = field3438;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "Loh;")
    public static class263 field3431 = field3438;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "Loh;")
    public static class263 field3432 = class253.method1681(-120, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "[I")
    public static int[] field3439 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ij", name = "D", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!ij", name = "E", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "I")
    public static int field3434;

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    public static int field3435;

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "Z")
    public boolean field3428;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "Z")
    public boolean field3436;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "[[B")
    public static byte[][] field3425;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(B)V")
    public static void method1250(byte arg0) {
        field3432 = null;
        field3423 = null;
        field3439 = null;
        field3437 = null;
        field3425 = null;
        field3431 = null;
        if (arg0 < 119) {
            field3433 = true;
        }
        field3438 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lue;IIB)[Lbb;")
    public static final class88[] method1251(class86 arg0, int arg1, int arg2, byte arg3) {
        field3422++;
        if (arg3 == -64) {
            return class254.method1687(arg2, (byte) -99, arg0, arg1) ? class53.method341((byte) -42) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(II)Z")
    public static final boolean method1252(int arg0, int arg1) {
        field3426++;
        if (arg0 >= 97 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && arg0 <= 90) {
            return true;
        } else {
            return arg1 >= ~arg0 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "(B)V")
    public static final void method1253(byte arg0) {
        field3435++;
        if (class180.field3280 == 5) {
            if (arg0 <= 57) {
                field3438 = null;
            }
            class180.field3280 = 6;
        }
    }

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(I)[B")
    public abstract byte[] method179(int arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(BLhg;)V")
    public static final void method1254(byte arg0, class173 arg1) {
        long var2 = 0L;
        int var4 = -1;
        if (arg1.field3153 == 0) {
            var2 = class148.method970(arg1.field3151, arg1.field3149, arg1.field3140);
        }
        field3434++;
        if (arg1.field3153 == 1) {
            var2 = class86.method590(arg1.field3151, arg1.field3149, arg1.field3140);
        }
        int var5 = 0;
        if (arg1.field3153 == 2) {
            var2 = class228.method1549(arg1.field3151, arg1.field3149, arg1.field3140);
        }
        if (arg1.field3153 == 3) {
            var2 = class13.method103(arg1.field3151, arg1.field3149, arg1.field3140);
        }
        int var6 = 0;
        if (arg0 > -14) {
            field3423 = null;
        }
        if (var2 != 0L) {
            var5 = ((int) var2 & 0x7DB3F) >> 14;
            var6 = (int) var2 >> 20 & 0x3;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
        }
        arg1.field3155 = var6;
        arg1.field3138 = var5;
        arg1.field3154 = var4;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIII[I)V")
    public static final void method1255(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        arg0--;
        field3440++;
        int var11 = arg2 - 1;
        int var5 = var11 - 7;
        if (arg3 <= 58) {
            return;
        }
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg4[var6] = arg1;
            int var7 = var6 + 1;
            arg4[var7] = arg1;
            int var8 = var7 + 1;
            arg4[var8] = arg1;
            int var9 = var8 + 1;
            arg4[var9] = arg1;
            int var10 = var9 + 1;
            arg4[var10] = arg1;
            int var12 = var10 + 1;
            arg4[var12] = arg1;
            int var13 = var12 + 1;
            arg4[var13] = arg1;
            arg0 = var13 + 1;
            arg4[arg0] = arg1;
        }
        while (arg0 < var11) {
            arg0++;
            arg4[arg0] = arg1;
        }
    }

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "(B)I")
    public abstract int method180(byte arg0);

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IJ)V")
    public static final void method1256(int arg0, long arg1) {
        field3424++;
        if (arg1 == 0L) {
            return;
        }
        if (class31.field785 >= 100) {
            class120.method774(0, class136.field2489, -11292, class20.field459);
            return;
        }
        class263 var3 = class233.method1565(37, arg1).method1761(122);
        for (int var4 = 0; var4 < class31.field785; var4++) {
            if (class41.field909[var4] == arg1) {
                class120.method774(0, class124.method797(-52, new class263[] { var3, class277.field4851 }), -11292, class20.field459);
                return;
            }
        }
        for (int var5 = 0; var5 < class100.field1908; var5++) {
            if (class38.field871[var5] == arg1) {
                class120.method774(0, class124.method797(-56, new class263[] { class106.field2013, var3, class137.field2529 }), -11292, class20.field459);
                return;
            }
        }
        if (var3.method1788(-26006, class229.field4018.field2508)) {
            class120.method774(0, class159.field2881, -11292, class20.field459);
            return;
        }
        class36.field845++;
        class41.field909[class31.field785] = arg1;
        class98.field1879[class31.field785++] = class233.method1565(37, arg1);
        class75.field1558 = class112.field2108;
        class154.field2792.method1516(-36, 241);
        class154.field2792.method1272((byte) 64, arg1);
        if (arg0 >= -101) {
            method1250((byte) -26);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
    public static final void method1257(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15, int arg16, int arg17, int arg18, int arg19) {
        if (arg3 == 0) {
            class200 var20 = new class200(arg10, arg11, arg12, arg13, -1, arg18, false);
            for (int var21 = arg0; var21 >= 0; var21--) {
                if (class18.field417[var21][arg1][arg2] == null) {
                    class18.field417[var21][arg1][arg2] = new class2(var21, arg1, arg2);
                }
            }
            class18.field417[arg0][arg1][arg2].field32 = var20;
        } else if (arg3 == 1) {
            class200 var22 = new class200(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
            for (int var23 = arg0; var23 >= 0; var23--) {
                if (class18.field417[var23][arg1][arg2] == null) {
                    class18.field417[var23][arg1][arg2] = new class2(var23, arg1, arg2);
                }
            }
            class18.field417[arg0][arg1][arg2].field32 = var22;
        } else {
            class110 var24 = new class110(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
            for (int var25 = arg0; var25 >= 0; var25--) {
                if (class18.field417[var25][arg1][arg2] == null) {
                    class18.field417[var25][arg1][arg2] = new class2(var25, arg1, arg2);
                }
            }
            class18.field417[arg0][arg1][arg2].field40 = var24;
        }
    }
}
