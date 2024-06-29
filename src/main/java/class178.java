import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class178 extends class161 {

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field3091 = -1;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    public static int field3094 = -1;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Lp;")
    private static class280 field3101 = class18.method140((byte) -123, "glow2:");

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Lp;")
    public static class280 field3102 = field3101;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "Lp;")
    public static class280 field3088 = field3101;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "Lp;")
    public static class280 field3100 = null;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "Lp;")
    public static class280 field3104 = class18.method140((byte) -118, " ");

    @OriginalMember(owner = "client!k", name = "K", descriptor = "Lp;")
    public static class280 field3108 = class18.method140((byte) -127, "um");

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "I")
    public int field3090;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "I")
    public int field3097;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "I")
    public int field3098;

    @OriginalMember(owner = "client!k", name = "B", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public int field3103;

    @OriginalMember(owner = "client!k", name = "H", descriptor = "I")
    public static int field3105;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "I")
    public int field3109;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "Lua;")
    public class113 field3095;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "Lua;")
    public class113 field3106;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "Lp;")
    public class280 field3110;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "Z")
    public boolean field3092;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "[Ljava/lang/Object;")
    public Object[] field3107;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIIIZII)V")
    public static final void method1222(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        field3096++;
        if (class264.field4655 == arg0 && class126.field2215 == arg1 && class23.field427 == arg2 || class215.method1436(104)) {
            return;
        }
        class126.field2215 = arg1;
        class23.field427 = arg2;
        class264.field4655 = arg0;
        if (class215.method1436(104)) {
            class23.field427 = 0;
        }
        if (arg4) {
            class90.method641((byte) 66, 28);
        } else {
            class90.method641((byte) 66, 25);
        }
        class200.method1373(true, 6, class196.field3435);
        int var7 = class49.field806;
        class49.field806 = (arg0 - 6) * 8;
        int var8 = class91.field1480;
        class91.field1480 = arg1 * 8 - 48;
        class6.field126 = class19.method153(class126.field2215 * 8, class264.field4655 * 8, (byte) -97);
        class176.field3070 = null;
        int var9 = class91.field1480 - var8;
        int var10 = class49.field806 - var7;
        int var11 = class91.field1480;
        int var12 = class49.field806;
        if (arg4) {
            class112.field1845 = 0;
            for (int var16 = 0; var16 < 32768; var16++) {
                class61 var32 = class46.field756[var16];
                if (var32 != null) {
                    var32.field4793 -= var9 * 128;
                    var32.field4791 -= var10 * 128;
                    if (var32.field4791 >= 0 && var32.field4791 <= 13184 && var32.field4793 >= 0 && var32.field4793 <= 13184) {
                        for (int var33 = 0; var33 < 10; var33++) {
                            var32.field4837[var33] -= var10;
                            var32.field4792[var33] -= var9;
                        }
                        class46.field767[class112.field1845++] = var16;
                    } else {
                        class46.field756[var16].field987 = null;
                        class46.field756[var16] = null;
                    }
                }
            }
        } else {
            for (int var13 = 0; var13 < 32768; var13++) {
                class61 var14 = class46.field756[var13];
                if (var14 != null) {
                    for (int var15 = 0; var15 < 10; var15++) {
                        var14.field4837[var15] -= var10;
                        var14.field4792[var15] -= var9;
                    }
                    var14.field4793 -= var9 * 128;
                    var14.field4791 -= var10 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class142 var30 = class280.field4940[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field4837[var31] -= var10;
                    var30.field4792[var31] -= var9;
                }
                var30.field4793 -= var9 * 128;
                var30.field4791 -= var10 * 128;
            }
        }
        class231.field4013 = arg2;
        class262.field4631.method983(arg6, -124, false, arg5);
        if (arg3 >= -46) {
            return;
        }
        byte var18 = 0;
        byte var19 = 104;
        byte var20 = 1;
        byte var21 = 0;
        if (var10 < 0) {
            var19 = -1;
            var20 = -1;
            var18 = 103;
        }
        byte var22 = 104;
        byte var23 = 1;
        if (var9 < 0) {
            var23 = -1;
            var21 = 103;
            var22 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var26 = var21; var26 != var22; var26 += var23) {
                int var27 = var24 + var10;
                int var28 = var9 + var26;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class165.field2896[var29][var24][var26] = class165.field2896[var29][var27][var28];
                    } else {
                        class165.field2896[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class155 var25 = (class155) class224.field3880.method651(12916); var25 != null; var25 = (class155) class224.field3880.method643(11066)) {
            var25.field2702 -= var10;
            var25.field2706 -= var9;
            if (var25.field2702 < 0 || var25.field2706 < 0 || var25.field2702 >= 104 || var25.field2706 >= 104) {
                var25.method1146(26159);
            }
        }
        if (arg4) {
            client.field2695 -= var10 * 128;
            class275.field4779 -= var9;
            class152.field2625 -= var9;
            class144.field2520 -= var10;
            class212.field3648 -= var10;
            class78.field1273 -= var9 * 128;
        } else {
            class4.field113 = 1;
        }
        class130.field2295 = -1;
        if (class209.field3599 != 0) {
            class73.field1204 -= var9;
            class209.field3599 -= var10;
        }
        class79.field1304 = 0;
        class211.field3636.method639(90);
        class230.field4009.method639(94);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Ltg;B)V")
    public static final void method1223(class180 arg0, byte arg1) {
        field3105++;
        class142.field2459 = arg0;
        if (arg1 > -55) {
            method1226((byte) -93);
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)V")
    public static void method1224(int arg0) {
        field3101 = null;
        field3102 = null;
        field3088 = null;
        field3104 = null;
        if (arg0 != 103) {
            method1226((byte) 12);
        }
        field3108 = null;
        field3100 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IB)Lp;")
    public static final class280 method1225(int arg0, byte arg1) {
        field3089++;
        if (arg1 == 115) {
            return arg0 < 999999999 ? class249.method1685((byte) -113, arg0) : class86.field1408;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(B)V")
    public static final void method1226(byte arg0) {
        if (arg0 != 83) {
            method1223((class180) null, (byte) 122);
        }
        class251.field4394 = new class113[class45.field747.method1228(true)][];
        class262.field4636 = new boolean[class45.field747.method1228(true)];
        field3099++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "([IIIIII)V")
    public static final void method1227(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class162 var6 = class220.field3787[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class169 var7 = var6.field2847;
        if (var7 != null) {
            int var8 = var7.field2944;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class63 var10 = var6.field2837;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field1039;
        int var12 = var10.field1038;
        int var13 = var10.field1026;
        int var14 = var10.field1043;
        int[] var15 = class210.field3610[var11];
        int[] var16 = class147.field2558[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }
}
