import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class370 extends class427 {

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "I")
    public static int field5035 = 0;

    @OriginalMember(owner = "client!tl", name = "p", descriptor = "[Lqg;")
    public static class140[] field5037 = new class140[14];

    @OriginalMember(owner = "client!tl", name = "s", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5040 = new Rectangle[100];

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "I")
    public static int field5033;

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "I")
    public static int field5034;

    @OriginalMember(owner = "client!tl", name = "o", descriptor = "I")
    public static int field5036;

    @OriginalMember(owner = "client!tl", name = "q", descriptor = "I")
    public static int field5038;

    @OriginalMember(owner = "client!tl", name = "r", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(B)V")
    public static final void method2328(byte arg0) {
        field5034++;
        class220.field2728 = true;
        if (arg0 < 39) {
            method2331(33, (String) null, 57, (byte[]) null, 44, 31);
        }
    }

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "(B)V")
    public static void method2329(byte arg0) {
        field5037 = null;
        int var1 = 43 % ((arg0 - 18) / 44);
        field5040 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IBIII)V")
    public static final void method2330(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field5039++;
        for (class237 var5 = (class237) class314.field4232.method1690((byte) -126); var5 != null; var5 = (class237) class314.field4232.method1699((byte) 83)) {
            class389.method2415(arg3, arg2, arg4, arg0, var5, (byte) 44);
        }
        if (arg1 >= -92) {
            method2330(90, (byte) -5, -35, 118, -39);
        }
        for (class237 var6 = (class237) class59.field748.method1690((byte) -113); var6 != null; var6 = (class237) class59.field748.method1699((byte) 90)) {
            byte var11 = 1;
            class437 var12 = var6.field3115.method1250(-89);
            if (var6.field3115.field2423) {
                var11 = 0;
            } else if (var6.field3115.field2394 == var12.field6005 || var6.field3115.field2394 == var12.field5987 || var6.field3115.field2394 == var12.field5983 || var6.field3115.field2394 == var12.field6002) {
                var11 = 2;
            } else if (var6.field3115.field2394 == var12.field5997 || var6.field3115.field2394 == var12.field5971 || var6.field3115.field2394 == var12.field5966 || var6.field3115.field2394 == var12.field5986) {
                var11 = 3;
            }
            if (var6.field3118 != var11) {
                int var13 = class406.method2527(76, var6.field3115);
                if (var6.field3125 != var13) {
                    if (var6.field3116 != null) {
                        class352.field4781.method1866(var6.field3116);
                        var6.field3116 = null;
                    }
                    var6.field3125 = var13;
                }
                var6.field3118 = var11;
            }
            var6.field3114 = var6.field3115.field1516;
            var6.field3122 = var6.field3115.field1516 + (var6.field3115.method841(true) * 64);
            var6.field3112 = var6.field3115.field1514;
            var6.field3124 = var6.field3115.field1514 + (var6.field3115.method841(true) * 64);
            class389.method2415(arg3, arg2, arg4, arg0, var6, (byte) 105);
        }
        for (class237 var7 = (class237) class321.field4310.method2222(0); var7 != null; var7 = (class237) class321.field4310.method2215(false)) {
            byte var8 = 1;
            class437 var9 = var7.field3126.method1250(4);
            if (var7.field3126.field2423) {
                var8 = 0;
            } else if (var7.field3126.field2394 == var9.field6005 || var7.field3126.field2394 == var9.field5987 || var7.field3126.field2394 == var9.field5983 || var7.field3126.field2394 == var9.field6002) {
                var8 = 2;
            } else if (var7.field3126.field2394 == var9.field5997 || var7.field3126.field2394 == var9.field5971 || var7.field3126.field2394 == var9.field5966 || var7.field3126.field2394 == var9.field5986) {
                var8 = 3;
            }
            if (var7.field3118 != var8) {
                int var10 = class414.method2557(var7.field3126, (byte) 94);
                if (var7.field3125 != var10) {
                    if (var7.field3116 != null) {
                        class352.field4781.method1866(var7.field3116);
                        var7.field3116 = null;
                    }
                    var7.field3125 = var10;
                }
                var7.field3118 = var8;
            }
            var7.field3114 = var7.field3126.field1516;
            var7.field3122 = var7.field3126.field1516 + var7.field3126.method841(true) * 64;
            var7.field3112 = var7.field3126.field1514;
            var7.field3124 = var7.field3126.field1514 + (var7.field3126.method841(true) * 64);
            class389.method2415(arg3, arg2, arg4, arg0, var7, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(ILjava/lang/String;I[BII)I")
    public static final int method2331(int arg0, String arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field5033++;
        int var6 = arg4 - arg5;
        int var7 = 0;
        if (arg0 != 15719) {
            return -115;
        }
        while (var6 > var7) {
            char var8 = arg1.charAt(arg5 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg3[arg2 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg3[arg2 + var7] = -128;
            } else if (var8 == '‚') {
                arg3[arg2 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg3[arg2 + var7] = -125;
            } else if (var8 == '„') {
                arg3[arg2 + var7] = -124;
            } else if (var8 == '…') {
                arg3[arg2 + var7] = -123;
            } else if (var8 == '†') {
                arg3[arg2 + var7] = -122;
            } else if (var8 == '‡') {
                arg3[arg2 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg3[arg2 + var7] = -120;
            } else if (var8 == '‰') {
                arg3[arg2 + var7] = -119;
            } else if (var8 == 'Š') {
                arg3[arg2 + var7] = -118;
            } else if (var8 == '‹') {
                arg3[arg2 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg3[arg2 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg3[arg2 + var7] = -114;
            } else if (var8 == '‘') {
                arg3[arg2 + var7] = -111;
            } else if (var8 == '’') {
                arg3[arg2 + var7] = -110;
            } else if (var8 == '“') {
                arg3[arg2 + var7] = -109;
            } else if (var8 == '”') {
                arg3[arg2 + var7] = -108;
            } else if (var8 == '•') {
                arg3[arg2 + var7] = -107;
            } else if (var8 == '–') {
                arg3[arg2 + var7] = -106;
            } else if (var8 == '—') {
                arg3[arg2 + var7] = -105;
            } else if (var8 == '˜') {
                arg3[arg2 + var7] = -104;
            } else if (var8 == '™') {
                arg3[arg2 + var7] = -103;
            } else if (var8 == 'š') {
                arg3[arg2 + var7] = -102;
            } else if (var8 == '›') {
                arg3[arg2 + var7] = -101;
            } else if (var8 == 'œ') {
                arg3[arg2 + var7] = -100;
            } else if (var8 == 'ž') {
                arg3[arg2 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg3[arg2 + var7] = -97;
            } else {
                arg3[arg2 + var7] = 63;
            }
            var7++;
        }
        return var6;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Luo;ZIIILak;IZLuo;ILeq;I)Lc;")
    public static final class436 method2332(class118 arg0, boolean arg1, int arg2, int arg3, int arg4, class31 arg5, int arg6, boolean arg7, class118 arg8, int arg9, class434 arg10, int arg11) {
        field5036++;
        class436 var12 = class126.method816(arg4, 8, arg6, arg8, arg9, arg10, arg3, arg11);
        if (var12 != null) {
            return var12;
        }
        class59 var13 = class131.method843((byte) 5, arg4);
        if (arg11 > 1 && var13.field733 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (var13.field735[var15] <= arg11 && var13.field735[var15] != 0) {
                    var14 = var13.field733[var15];
                }
            }
            if (var14 != -1) {
                var13 = class131.method843((byte) 5, var14);
            }
        }
        class402 var16 = class147.method952((byte) -81, var13.field673, class270.field3503, 0);
        if (var16 == null) {
            return null;
        }
        if (var13.field683 != null) {
            for (int var17 = 0; var17 < var13.field683.length; var17++) {
                if (var13.field710 == null || var13.field710.length <= var17) {
                    var16.method2500(var13.field683[var17], var13.field739[var17], 29);
                } else {
                    var16.method2500(var13.field683[var17], class401.field5536[var13.field710[var17] & 0xFF], arg2 + 102);
                }
            }
        }
        if (var13.field717 != null) {
            for (int var18 = 0; var18 < var13.field717.length; var18++) {
                var16.method2508(var13.field717[var18], (byte) 117, var13.field684[var18]);
            }
        }
        if (arg10 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (class50.field579[var19].length > arg10.field5924[var19]) {
                    var16.method2500(class184.field2127[var19], class50.field579[var19][arg10.field5924[var19]], -128);
                }
                if (arg10.field5924[var19] < class345.field4684[var19].length) {
                    var16.method2500(class423.field5793[var19], class345.field4684[var19][arg10.field5924[var19]], arg2 - 75);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field722 != 128 || var13.field672 != 128 || var13.field682 != 128) {
            var21 = true;
            var20 |= 0x7;
        }
        class386 var22 = arg0.method701(var16, var20, 0, var13.field681 + 64, var13.field705 + 768);
        if (!var22.method1439()) {
            return null;
        }
        if (var21) {
            var22.method1467(var13.field722, var13.field672, var13.field682);
        }
        class436 var23 = null;
        if (var13.field719 != -1) {
            var23 = method2332(arg0, true, arg2, 0, var13.field734, arg5, 0, true, arg8, 1, arg10, 10);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field723 != -1) {
            var23 = method2332(arg0, false, arg2, arg3, var13.field707, arg5, 0, true, arg8, arg9, arg10, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field714;
        arg0.method790(16, 16, 512, 512);
        if (arg1) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg9 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        class450 var25 = arg0.method769();
        var25.method931();
        arg0.method749(var25);
        arg0.method688(1.0F);
        arg0.method737(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class450 var26 = arg0.method742();
        var26.method937(-var13.field674 << 3);
        var26.method934(var13.field726 << 3);
        var26.method933(var13.field701, (class363.field4927[var13.field742 << 3] * var24 >> 15) - (var22.method1458() / 2 - var13.field729), (class363.field4917[var13.field742 << 3] * var24 >> 15) + var13.field729);
        var26.method938(var13.field742 << 3);
        int var27 = arg0.method771();
        int var28 = arg0.method751();
        arg0.method750(50, Integer.MAX_VALUE);
        arg0.method725();
        arg0.method732();
        arg0.method789(0, 0, 36, 32, 0, 0);
        var22.method1441(var26, (class34) null, 1);
        arg0.method750(var27, var28);
        int[] var29 = arg0.method756(0, 0, 36, 32);
        if (arg9 >= 1) {
            var29 = class169.method1079(-16777215, (byte) -123, var29);
            if (arg9 >= 2) {
                var29 = class169.method1079(-1, (byte) -97, var29);
            }
        }
        if (arg3 != 0) {
            class118.method716(arg3, var29, (byte) 74);
        }
        arg0.method703(var29, arg2, 36, 36, 32).method2659(0, 0);
        if (var13.field719 != -1) {
            var23.method2659(0, 0);
        } else if (var13.field723 != -1) {
            var23.method2659(0, 0);
        }
        if (arg6 == 1 || arg6 == 2 && (var13.field678 == 1 || arg11 != 1) && arg11 != -1) {
            arg5.method206(-256, 0, 9, -16777215, true, class449.method2779(arg11, -4260));
        }
        int[] var30 = arg0.method756(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class213.method1307(var30[var31], -16777216);
            }
        }
        class436 var32;
        if (arg7) {
            var32 = arg0.method703(var30, 0, 36, 36, 32);
        } else {
            var32 = arg8.method703(var30, 0, 36, 36, 32);
        }
        if (!arg7) {
            class162 var33 = new class162();
            var33.field1892 = arg10 != null;
            var33.field1883 = arg3;
            var33.field1880 = arg6;
            var33.field1884 = arg4;
            var33.field1889 = arg8.field1360;
            var33.field1887 = arg9;
            var33.field1882 = arg11;
            class450.field6285.method1009(var32, var33, (byte) -89);
        }
        return var32;
    }
}
