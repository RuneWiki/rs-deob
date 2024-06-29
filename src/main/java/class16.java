import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lrd;")
    private static class114 field318 = class84.method656("Attack", (byte) 114);

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lrd;")
    public static class114 field319 = null;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field322 = 0;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Z")
    public static boolean field321 = false;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lrd;")
    private static class114 field320 = class84.method656("Prepared visibility map", (byte) 126);

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "[I")
    public static int[] field317 = new int[32768];

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lrd;")
    public static class114 field325 = field320;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lrd;")
    public static class114 field326 = field318;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field327 = -1;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lrd;")
    public static class114 field331 = class84.method656("weiss:", (byte) 119);

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "[I")
    public static int[] field330 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lpb;Ljava/awt/Component;Lpb;I)V")
    public static final void method120(class100 arg0, Component arg1, class100 arg2, int arg3) {
        field316++;
        if (class73.field1637) {
            return;
        }
        class73.field1640 = class67.method538(-72, 128, 265, arg1);
        class59.method425();
        class127.field3051 = class67.method538(-85, 128, 265, arg1);
        class59.method425();
        class74.field1683 = class67.method538(-88, 509, 171, arg1);
        class59.method425();
        class63.field1356 = class67.method538(-65, 360, 132, arg1);
        class59.method425();
        class96.field2200 = class67.method538(-68, 360, 200, arg1);
        class59.method425();
        class70.field1539 = class67.method538(-91, 202, 238, arg1);
        class59.method425();
        class25.field498 = class67.method538(-119, 203, 238, arg1);
        class59.method425();
        class120.field2799 = class67.method538(-91, 74, 94, arg1);
        class59.method425();
        class116.field2697 = class67.method538(-98, 75, 94, arg1);
        class59.method425();
        byte[] var4 = arg0.method765((byte) 82, class56.field1172, class42.field864);
        class54 var5 = new class54(var4, arg1);
        class73.field1640.method528(-1926);
        var5.method404(0, 0);
        class127.field3051.method528(-1926);
        var5.method404(-637, 0);
        class74.field1683.method528(-1926);
        var5.method404(-128, 0);
        class63.field1356.method528(-1926);
        var5.method404(-202, -371);
        class96.field2200.method528(-1926);
        var5.method404(-202, -171);
        class70.field1539.method528(-1926);
        var5.method404(0, -265);
        class25.field498.method528(-1926);
        var5.method404(-562, -265);
        class120.field2799.method528(-1926);
        var5.method404(-128, -171);
        class116.field2697.method528(-1926);
        var5.method404(-562, -171);
        int[] var6 = new int[var5.field1128];
        for (int var7 = 0; var7 < var5.field1133; var7++) {
            for (int var23 = 0; var23 < var5.field1128; var23++) {
                var6[var23] = var5.field1129[var5.field1128 + var5.field1128 * var7 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field1128; var24++) {
                var5.field1129[var24 + var5.field1128 * var7] = var6[var24];
            }
        }
        class73.field1640.method528(-1926);
        var5.method404(382, 0);
        class127.field3051.method528(-1926);
        var5.method404(-255, 0);
        class74.field1683.method528(-1926);
        var5.method404(254, 0);
        class63.field1356.method528(-1926);
        var5.method404(180, -371);
        class96.field2200.method528(-1926);
        var5.method404(180, -171);
        class70.field1539.method528(-1926);
        var5.method404(382, -265);
        class25.field498.method528(-1926);
        var5.method404(-180, -265);
        class120.field2799.method528(-1926);
        var5.method404(254, -171);
        class116.field2697.method528(-1926);
        var5.method404(-180, -171);
        class54 var8 = class127.method985(arg2, class69.field1487, class42.field864, true);
        class74.field1683.method528(-1926);
        var8.method400(254 - var8.field1128 / 2, 18);
        class112.field2629 = class47.method343(class58.field1206, arg2, false, class42.field864);
        class25.field491 = class47.method343(class12.field279, arg2, false, class42.field864);
        class20.field358 = class106.method811(class42.field864, class112.field2627, arg2, -120);
        class77.field1749 = new class54(128, 265);
        class20.field347 = new class54(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class77.field1749.field1129[var9] = class73.field1640.field1418[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class20.field347.field1129[var10] = class127.field3051.field1418[var10];
        }
        class42.field852 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class42.field852[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class42.field852[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class42.field852[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class42.field852[var14 + 192] = 16777215;
        }
        class124.field2959 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class124.field2959[var15] = var15 * 1024;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class124.field2959[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class124.field2959[var17 + 128] = var17 * 262144 + 65535;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class124.field2959[var18 + 192] = 16777215;
        }
        class61.field1304 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class61.field1304[var19] = var19 * 4;
        }
        if (arg3 >= -110) {
            field331 = null;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class61.field1304[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class61.field1304[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class61.field1304[var22 + 192] = 16777215;
        }
        class63.field1354 = new int[32768];
        class64.field1360 = new int[256];
        class8.field123 = new int[32768];
        class47.method346(null, (byte) 36);
        class49.field1012 = 0;
        class77.field1754 = new int[32768];
        class42.field867 = class42.field864;
        class64.field1381 = new int[32768];
        class42.field850 = class42.field864;
        if (class39.field825 == 0 || class64.field1370) {
            class78.method622(10, (byte) 13);
        } else {
            class78.method619(0, class137.field3318, class39.field825, false, 10, 255, class131.field3155, class42.field864);
        }
        class84.method643((byte) 94, false);
        class34.field678 = true;
        class73.field1637 = true;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZB)V")
    public static final void method121(boolean arg0, byte arg1) {
        int var2 = class8.field116;
        if (class7.field103.field712 >> 7 == class64.field1371 && class7.field103.field756 >> 7 == class85.field1897) {
            class64.field1371 = 0;
        }
        if (arg0) {
            var2 = 1;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class126 var5;
            int var6;
            if (arg0) {
                var5 = class7.field103;
                var6 = 33538048;
            } else {
                var5 = class36.field762[class110.field2573[var3]];
                var6 = class110.field2573[var3] << 14;
            }
            if (var5 != null && var5.method66((byte) -124)) {
                var5.field2990 = false;
                int var7 = var5.field712 >> 7;
                if ((class64.field1370 && class8.field116 > 50 || class8.field116 > 200) && !arg0 && var5.field736 == var5.field697) {
                    var5.field2990 = true;
                }
                int var8 = var5.field756 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field3019 == null || var5.field3011 > class20.field370 || var5.field3014 <= class20.field370) {
                        if ((var5.field712 & 0x7F) == 64 && (var5.field756 & 0x7F) == 64) {
                            if (class50.field1049[var7][var8] == class109.field2524) {
                                continue;
                            }
                            class50.field1049[var7][var8] = class109.field2524;
                        }
                        var5.field2999 = class137.method1110(class20.field346, var5.field712, var5.field756, (byte) 37);
                        class101.field2325.method1014(class20.field346, var5.field712, var5.field756, var5.field2999, 60, var5, var5.field700, var6, var5.field698);
                    } else {
                        var5.field2990 = false;
                        var5.field2999 = class137.method1110(class20.field346, var5.field712, var5.field756, (byte) 37);
                        class101.field2325.method997(class20.field346, var5.field712, var5.field756, var5.field2999, 60, var5, var5.field700, var6, var5.field2989, var5.field2985, var5.field2984, var5.field2998);
                    }
                }
            }
        }
        int var4 = 5 % ((arg1 + 9) / 35);
        field328++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Lgb;")
    public static final class45 method122(int arg0) {
        field324++;
        int var1 = -22 % ((-arg0 - 73) / 49);
        class45 var2 = new class45(class120.field2814, class111.field2594, class140.field3328, class31.field630, class140.field3346);
        class34.method246(-1958111762);
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIILua;Lnc;IIIB)V")
    public static final void method123(int arg0, int arg1, int arg2, class129 arg3, class89 arg4, int arg5, int arg6, int arg7, byte arg8) {
        field332++;
        if (class64.field1370 && (class22.field430[0][arg7][arg0] & 0x2) == 0) {
            if ((class22.field430[arg2][arg7][arg0] & 0x10) != 0) {
                return;
            }
            if (class106.method808((byte) -123, arg7, arg2, arg0) != class7.field100) {
                return;
            }
        }
        if (arg8 != -55) {
            return;
        }
        if (arg2 < client.field409) {
            client.field409 = arg2;
        }
        int var9 = class124.field2958[arg2][arg7 + 1][arg0 + 1];
        int var10 = class124.field2958[arg2][arg7][arg0];
        int var11 = class124.field2958[arg2][arg7 + 1][arg0];
        int var12 = class124.field2958[arg2][arg7][arg0 + 1];
        int var13 = var10 + var11 + var9 + var12 >> 2;
        class12 var14 = class130.method1048(arg8 - 27, arg6);
        int var15 = (arg6 << 14) + arg7 + (arg0 << 7) + 1073741824;
        if (var14.field244 == 0) {
            var15 += Integer.MIN_VALUE;
        }
        int var16 = (arg5 << 6) + arg1;
        if (var14.field234 == 1) {
            var16 += 256;
        }
        if (var14.method96(-1684)) {
            class28.method205(arg0, arg5, arg2, arg7, (byte) -36, var14);
        }
        if (arg1 == 22) {
            if (!class64.field1370 || var14.field244 != 0 || var14.field238) {
                class50 var17;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var17 = var14.method95(arg5, var11, var9, 65408, var12, var10, 22);
                } else {
                    var17 = new class123(arg6, 22, arg5, var10, var11, var9, var12, var14.field216, true, null);
                }
                arg3.method1021(arg2, arg7, arg0, var13, var17, var15, var16);
                if (var14.field214 && var14.field244 == 1 && arg4 != null) {
                    arg4.method674(arg7, arg0, (byte) -75);
                }
            }
        } else if (arg1 == 10 || arg1 == 11) {
            class50 var37;
            if (var14.field216 == -1 && var14.field241 == null) {
                var37 = var14.method95(arg5, var11, var9, 65408, var12, var10, 10);
            } else {
                var37 = new class123(arg6, 10, arg5, var10, var11, var9, var12, var14.field216, true, null);
            }
            if (var37 != null) {
                int var38;
                int var39;
                if (arg5 == 1 || arg5 == 3) {
                    var39 = var14.field261;
                    var38 = var14.field277;
                } else {
                    var38 = var14.field261;
                    var39 = var14.field277;
                }
                int var40 = 0;
                if (arg1 == 11) {
                    var40 += 256;
                }
                if (arg3.method1003(arg2, arg7, arg0, var13, var39, var38, var37, var40, var15, var16) && var14.field207) {
                    int var41 = 15;
                    if (var37 instanceof class133) {
                        var41 = ((class133) var37).method1082() / 4;
                        if (var41 > 30) {
                            var41 = 30;
                        }
                    }
                    for (int var42 = 0; var42 <= var39; var42++) {
                        for (int var43 = 0; var43 <= var38; var43++) {
                            if (var41 > class132.field3194[arg2][arg7 + var42][arg0 + var43]) {
                                class132.field3194[arg2][arg7 + var42][arg0 + var43] = (byte) var41;
                            }
                        }
                    }
                }
            }
            if (var14.field214 && arg4 != null) {
                arg4.method678(var14.field261, 20850, var14.field277, arg7, var14.field252, arg5, arg0);
            }
        } else if (arg1 >= 12) {
            class50 var18;
            if (var14.field216 == -1 && var14.field241 == null) {
                var18 = var14.method95(arg5, var11, var9, 65408, var12, var10, arg1);
            } else {
                var18 = new class123(arg6, arg1, arg5, var10, var11, var9, var12, var14.field216, true, null);
            }
            arg3.method1003(arg2, arg7, arg0, var13, 1, 1, var18, 0, var15, var16);
            if (arg1 >= 12 && arg1 <= 17 && arg1 != 13 && arg2 > 0) {
                class7.field90[arg2][arg7][arg0] = class38.method271(class7.field90[arg2][arg7][arg0], 2340);
            }
            if (var14.field214 && arg4 != null) {
                arg4.method678(var14.field261, arg8 ^ 0xFFFFAEBB, var14.field277, arg7, var14.field252, arg5, arg0);
            }
        } else if (arg1 == 0) {
            class50 var19;
            if (var14.field216 == -1 && var14.field241 == null) {
                var19 = var14.method95(arg5, var11, var9, 65408, var12, var10, 0);
            } else {
                var19 = new class123(arg6, 0, arg5, var10, var11, var9, var12, var14.field216, true, null);
            }
            arg3.method1029(arg2, arg7, arg0, var13, var19, null, class46.field948[arg5], 0, var15, var16);
            if (arg5 == 0) {
                if (var14.field207) {
                    class132.field3194[arg2][arg7][arg0] = 50;
                    class132.field3194[arg2][arg7][arg0 + 1] = 50;
                }
                if (var14.field249) {
                    class7.field90[arg2][arg7][arg0] = class38.method271(class7.field90[arg2][arg7][arg0], 585);
                }
            } else if (arg5 == 1) {
                if (var14.field207) {
                    class132.field3194[arg2][arg7][arg0 + 1] = 50;
                    class132.field3194[arg2][arg7 + 1][arg0 + 1] = 50;
                }
                if (var14.field249) {
                    class7.field90[arg2][arg7][arg0 + 1] = class38.method271(class7.field90[arg2][arg7][arg0 + 1], 1170);
                }
            } else if (arg5 == 2) {
                if (var14.field207) {
                    class132.field3194[arg2][arg7 + 1][arg0] = 50;
                    class132.field3194[arg2][arg7 + 1][arg0 + 1] = 50;
                }
                if (var14.field249) {
                    class7.field90[arg2][arg7 + 1][arg0] = class38.method271(class7.field90[arg2][arg7 + 1][arg0], 585);
                }
            } else if (arg5 == 3) {
                if (var14.field207) {
                    class132.field3194[arg2][arg7][arg0] = 50;
                    class132.field3194[arg2][arg7 + 1][arg0] = 50;
                }
                if (var14.field249) {
                    class7.field90[arg2][arg7][arg0] = class38.method271(class7.field90[arg2][arg7][arg0], 1170);
                }
            }
            if (var14.field214 && arg4 != null) {
                arg4.method670(arg0, arg7, var14.field252, (byte) -102, arg1, arg5);
            }
            if (var14.field251 != 16) {
                arg3.method1042(arg2, arg7, arg0, var14.field251);
            }
        } else if (arg1 == 1) {
            class50 var20;
            if (var14.field216 == -1 && var14.field241 == null) {
                var20 = var14.method95(arg5, var11, var9, arg8 ^ 0xFFFF0049, var12, var10, 1);
            } else {
                var20 = new class123(arg6, 1, arg5, var10, var11, var9, var12, var14.field216, true, null);
            }
            arg3.method1029(arg2, arg7, arg0, var13, var20, null, class124.field2957[arg5], 0, var15, var16);
            if (var14.field207) {
                if (arg5 == 0) {
                    class132.field3194[arg2][arg7][arg0 + 1] = 50;
                } else if (arg5 == 1) {
                    class132.field3194[arg2][arg7 + 1][arg0 + 1] = 50;
                } else if (arg5 == 2) {
                    class132.field3194[arg2][arg7 + 1][arg0] = 50;
                } else if (arg5 == 3) {
                    class132.field3194[arg2][arg7][arg0] = 50;
                }
            }
            if (var14.field214 && arg4 != null) {
                arg4.method670(arg0, arg7, var14.field252, (byte) -102, arg1, arg5);
            }
        } else if (arg1 == 2) {
            int var21 = arg5 + 1 & 0x3;
            class50 var22;
            class50 var23;
            if (var14.field216 == -1 && var14.field241 == null) {
                var22 = var14.method95(arg5 + 4, var11, var9, 65408, var12, var10, 2);
                var23 = var14.method95(var21, var11, var9, 65408, var12, var10, 2);
            } else {
                var22 = new class123(arg6, 2, arg5 + 4, var10, var11, var9, var12, var14.field216, true, null);
                var23 = new class123(arg6, 2, var21, var10, var11, var9, var12, var14.field216, true, null);
            }
            arg3.method1029(arg2, arg7, arg0, var13, var22, var23, class46.field948[arg5], class46.field948[var21], var15, var16);
            if (var14.field249) {
                if (arg5 == 0) {
                    class7.field90[arg2][arg7][arg0] = class38.method271(class7.field90[arg2][arg7][arg0], 585);
                    class7.field90[arg2][arg7][arg0 + 1] = class38.method271(class7.field90[arg2][arg7][arg0 + 1], 1170);
                } else if (arg5 == 1) {
                    class7.field90[arg2][arg7][arg0 + 1] = class38.method271(class7.field90[arg2][arg7][arg0 + 1], 1170);
                    class7.field90[arg2][arg7 + 1][arg0] = class38.method271(class7.field90[arg2][arg7 + 1][arg0], 585);
                } else if (arg5 == 2) {
                    class7.field90[arg2][arg7 + 1][arg0] = class38.method271(class7.field90[arg2][arg7 + 1][arg0], 585);
                    class7.field90[arg2][arg7][arg0] = class38.method271(class7.field90[arg2][arg7][arg0], 1170);
                } else if (arg5 == 3) {
                    class7.field90[arg2][arg7][arg0] = class38.method271(class7.field90[arg2][arg7][arg0], 1170);
                    class7.field90[arg2][arg7][arg0] = class38.method271(class7.field90[arg2][arg7][arg0], 585);
                }
            }
            if (var14.field214 && arg4 != null) {
                arg4.method670(arg0, arg7, var14.field252, (byte) -102, arg1, arg5);
            }
            if (var14.field251 != 16) {
                arg3.method1042(arg2, arg7, arg0, var14.field251);
            }
        } else if (arg1 == 3) {
            class50 var24;
            if (var14.field216 == -1 && var14.field241 == null) {
                var24 = var14.method95(arg5, var11, var9, 65408, var12, var10, 3);
            } else {
                var24 = new class123(arg6, 3, arg5, var10, var11, var9, var12, var14.field216, true, null);
            }
            arg3.method1029(arg2, arg7, arg0, var13, var24, null, class124.field2957[arg5], 0, var15, var16);
            if (var14.field207) {
                if (arg5 == 0) {
                    class132.field3194[arg2][arg7][arg0 + 1] = 50;
                } else if (arg5 == 1) {
                    class132.field3194[arg2][arg7 + 1][arg0 + 1] = 50;
                } else if (arg5 == 2) {
                    class132.field3194[arg2][arg7 + 1][arg0] = 50;
                } else if (arg5 == 3) {
                    class132.field3194[arg2][arg7][arg0] = 50;
                }
            }
            if (var14.field214 && arg4 != null) {
                arg4.method670(arg0, arg7, var14.field252, (byte) -102, arg1, arg5);
            }
        } else if (arg1 == 9) {
            class50 var25;
            if (var14.field216 == -1 && var14.field241 == null) {
                var25 = var14.method95(arg5, var11, var9, 65408, var12, var10, arg1);
            } else {
                var25 = new class123(arg6, arg1, arg5, var10, var11, var9, var12, var14.field216, true, null);
            }
            arg3.method1003(arg2, arg7, arg0, var13, 1, 1, var25, 0, var15, var16);
            if (var14.field214 && arg4 != null) {
                arg4.method678(var14.field261, 20850, var14.field277, arg7, var14.field252, arg5, arg0);
            }
        } else {
            if (var14.field237) {
                if (arg5 == 1) {
                    int var29 = var12;
                    var12 = var9;
                    var9 = var11;
                    var11 = var10;
                    var10 = var29;
                } else if (arg5 == 2) {
                    int var27 = var12;
                    var12 = var11;
                    var11 = var27;
                    int var28 = var9;
                    var9 = var10;
                    var10 = var28;
                } else if (arg5 == 3) {
                    int var26 = var12;
                    var12 = var10;
                    var10 = var11;
                    var11 = var9;
                    var9 = var26;
                }
            }
            if (arg1 == 4) {
                class50 var30;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var30 = var14.method95(0, var11, var9, 65408, var12, var10, 4);
                } else {
                    var30 = new class123(arg6, 4, 0, var10, var11, var9, var12, var14.field216, true, null);
                }
                arg3.method993(arg2, arg7, arg0, var13, var30, class46.field948[arg5], arg5 * 512, 0, 0, var15, var16);
            } else if (arg1 == 5) {
                int var31 = arg3.method1034(arg2, arg7, arg0);
                int var32 = 16;
                if (var31 != 0) {
                    var32 = class130.method1048(-95, var31 >> 14 & 0x7FFF).field251;
                }
                class50 var33;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var33 = var14.method95(0, var11, var9, 65408, var12, var10, 4);
                } else {
                    var33 = new class123(arg6, 4, 0, var10, var11, var9, var12, var14.field216, true, null);
                }
                arg3.method993(arg2, arg7, arg0, var13, var33, class46.field948[arg5], arg5 * 512, class7.field94[arg5] * var32, class32.field662[arg5] * var32, var15, var16);
            } else if (arg1 == 6) {
                class50 var34;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var34 = var14.method95(0, var11, var9, 65408, var12, var10, 4);
                } else {
                    var34 = new class123(arg6, 4, 0, var10, var11, var9, var12, var14.field216, true, null);
                }
                arg3.method993(arg2, arg7, arg0, var13, var34, 256, arg5, 0, 0, var15, var16);
            } else if (arg1 == 7) {
                class50 var35;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var35 = var14.method95(0, var11, var9, arg8 + 65463, var12, var10, 4);
                } else {
                    var35 = new class123(arg6, 4, 0, var10, var11, var9, var12, var14.field216, true, null);
                }
                arg3.method993(arg2, arg7, arg0, var13, var35, 512, arg5, 0, 0, var15, var16);
            } else if (arg1 == 8) {
                class50 var36;
                if (var14.field216 == -1 && var14.field241 == null) {
                    var36 = var14.method95(0, var11, var9, 65408, var12, var10, 4);
                } else {
                    var36 = new class123(arg6, 4, 0, var10, var11, var9, var12, var14.field216, true, null);
                }
                arg3.method993(arg2, arg7, arg0, var13, var36, 768, arg5, 0, 0, var15, var16);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static void method124(int arg0) {
        field326 = null;
        field325 = null;
        field330 = null;
        field317 = null;
        field320 = null;
        if (arg0 != 0) {
            method122(14);
        }
        field318 = null;
        field319 = null;
        field331 = null;
    }
}
