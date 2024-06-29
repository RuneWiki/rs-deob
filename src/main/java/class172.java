import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class172 {

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "Ltl;")
    public static class59 field2827 = class85.method639(" loggt sich ein)3", 9588);

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2828 = 1;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field2831 = 0;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "[I")
    public static int[] field2832 = new int[256];

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Lj;")
    public static class138 field2834 = new class138(64);

    @OriginalMember(owner = "client!ol", name = "j", descriptor = "Ltl;")
    public static class59 field2836 = class85.method639("hint_headicons", 9588);

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!ol", name = "i", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "[[I")
    public static int[][] field2833;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "([BIIZIBI[Ldl;III)V", line = 6)
    public static final void method1269(byte[] arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6, class30[] arg7, int arg8, int arg9, int arg10) {
        field2830++;
        int var11 = 22 / ((17 - arg5) / 59);
        class170 var12 = new class170(arg0);
        int var13 = -1;
        while (true) {
            int var14 = var12.method1240(true);
            if (var14 == 0) {
                return;
            }
            var13 += var14;
            int var15 = 0;
            while (true) {
                int var16 = var12.method1249(false);
                if (var16 == 0) {
                    break;
                }
                var15 += var16 - 1;
                int var17 = (var15 & 0xFC6) >> 6;
                int var18 = var15 >> 12;
                int var19 = var15 & 0x3F;
                int var20 = var12.method1221(85);
                int var21 = var20 >> 2;
                int var22 = var20 & 0x3;
                if (arg6 == var18 && var17 >= arg1 && arg1 + 8 > var17 && arg4 <= var19 && (arg4 + 8) > var19) {
                    class180 var23 = class188.method1390(var13, false);
                    int var24 = class50.method360((byte) 113, var23.field3006, var22, var19 & 0x7, var23.field2976, arg9, var17 & 0x7) + arg8;
                    int var25 = class308.method2138(var17 & 0x7, var23.field3006, var19 & 0x7, var22, 1, arg9, var23.field2976) + arg10;
                    if (var24 > 0 && var25 > 0 && var24 < 103 && var25 < 103) {
                        class30 var26 = null;
                        if (!arg3) {
                            int var27 = arg2;
                            if ((class308.field5219[1][var24][var25] & 0x2) == 2) {
                                var27 = arg2 - 1;
                            }
                            if (var27 >= 0) {
                                var26 = arg7[var27];
                            }
                        }
                        class85.method635(var26, arg9 + var22 & 0x3, var21, var25, var24, (byte) 58, var13, arg2, !arg3, arg3, arg2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IZLtl;)V", line = 87)
    public static final void method1270(int arg0, boolean arg1, class59 arg2) {
        field2829++;
        class186 var3 = class67.method561(32, arg0, 3);
        var3.method1380(3293);
        var3.field3113 = arg2;
        if (!arg1) {
            field2831 = -16;
        }
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 112)
    public static void method1271(byte arg0) {
        field2834 = null;
        if (arg0 != -109) {
            method1269((byte[]) null, -38, 123, true, -65, (byte) 79, 22, (class30[]) null, 11, 41, 106);
        }
        field2836 = null;
        field2827 = null;
        field2832 = null;
        field2833 = (int[][]) null;
    }
}
