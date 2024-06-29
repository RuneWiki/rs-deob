import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 {

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lwd;")
    public static class150 field1037 = class2.method9(true, " @whi@(X");

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[Lwd;")
    public static class150[] field1042 = new class150[100];

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lwd;")
    public static class150 field1039 = class2.method9(true, "Von:");

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lwd;")
    public static class150 field1044 = class2.method9(true, "Handel)4Duell");

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field1045 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Li;")
    public static class56 field1035 = new class56(100);

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "I")
    public static volatile int field1047 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lec;")
    public static class32 field1038;

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lff;")
    public static class42 field1046;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Z")
    public static boolean field1048;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lhb;")
    public static class51[] field1034;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method281(int arg0) {
        if (arg0 >= -123) {
            field1039 = null;
        }
        field1037 = null;
        field1039 = null;
        field1044 = null;
        field1042 = null;
        field1038 = null;
        field1035 = null;
        field1034 = null;
        field1046 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILff;II)Lqd;")
    public static final class114 method282(int arg0, class42 arg1, int arg2, int arg3) {
        if (arg2 >= -101) {
            field1035 = null;
        }
        field1036++;
        return class146.method1095(arg1, arg0, (byte) 21, arg3) ? class46.method347(-2658) : null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIILv;B)V")
    public static final void method283(int arg0, int arg1, int arg2, class140 arg3, byte arg4) {
        field1040++;
        class54.field1413.method546(-102);
        class92.field2158.method803(0, 0);
        arg3.method1055(class73.field1835, 55, 28, 16777215, true);
        if (arg1 == 0) {
            arg3.method1055(class83.field2014, 55, 41, 65280, true);
        }
        if (arg1 == 1) {
            arg3.method1055(class55.field1442, 55, 41, 16776960, true);
        }
        if (arg1 == 2) {
            arg3.method1055(class18.field488, 55, 41, 16711680, true);
        }
        if (arg1 == 3) {
            arg3.method1055(class11.field261, 55, 41, 65535, true);
        }
        arg3.method1055(class94.field2195, 184, 28, 16777215, true);
        if (arg2 == 0) {
            arg3.method1055(class83.field2014, 184, 41, 65280, true);
        }
        if (arg2 == 1) {
            arg3.method1055(class55.field1442, 184, 41, 16776960, true);
        }
        if (arg2 == 2) {
            arg3.method1055(class18.field488, 184, 41, 16711680, true);
        }
        if (arg4 >= -85) {
            field1035 = null;
        }
        arg3.method1055(class46.field1241, 324, 28, 16777215, true);
        if (arg0 == 0) {
            arg3.method1055(class83.field2014, 324, 41, 65280, true);
        }
        if (arg0 == 1) {
            arg3.method1055(class55.field1442, 324, 41, 16776960, true);
        }
        if (arg0 == 2) {
            arg3.method1055(class18.field488, 324, 41, 16711680, true);
        }
        arg3.method1040(class135.field3174, 417, 17, 85, 25, 16777215, true, 1, 1, 0);
        try {
            Graphics var5 = class142.field3439.getGraphics();
            class54.field1413.method287(var5, true, 453, 0);
        } catch (Exception var6) {
            class142.field3439.repaint();
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lme;BILsa;IIIIII)V")
    public static final void method284(class88 arg0, byte arg1, int arg2, class123 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1041++;
        int var10 = class121.field2789[arg4][arg2][arg7];
        int var11 = class121.field2789[arg4][arg2 + 1][arg7];
        int var12 = class121.field2789[arg4][arg2 + 1][arg7 + 1];
        int var13 = class121.field2789[arg4][arg2][arg7 + 1];
        if (arg1 < 119) {
            method284(null, (byte) -47, 10, null, -101, 83, -32, 103, 97, -26);
        }
        int var14 = var12 + var13 + var11 + var10 >> 2;
        class61 var15 = class20.method145(arg9, (byte) -41);
        int var16 = (arg5 << 6) + arg8;
        int var17 = (arg7 << 7) + (arg9 << 14) + arg2 + 1073741824;
        if (var15.field1602 == 0) {
            var17 += Integer.MIN_VALUE;
        }
        if (var15.field1547 == 1) {
            var16 += 256;
        }
        if (arg8 == 22) {
            class29 var18;
            if (var15.field1596 == -1 && var15.field1560 == null) {
                var18 = var15.method473(arg5, -10, var10, var13, 22, var11, var12);
            } else {
                var18 = new class65(arg9, 22, arg5, var10, var11, var12, var13, var15.field1596, true, null);
            }
            arg3.method936(arg6, arg2, arg7, var14, var18, var17, var16);
            if (var15.field1581 == 1) {
                arg0.method630(false, arg7, arg2);
            }
        } else if (arg8 == 10 || arg8 == 11) {
            class29 var38;
            if (var15.field1596 == -1 && var15.field1560 == null) {
                var38 = var15.method473(arg5, -10, var10, var13, 10, var11, var12);
            } else {
                var38 = new class65(arg9, 10, arg5, var10, var11, var12, var13, var15.field1596, true, null);
            }
            if (var38 != null) {
                int var39;
                int var40;
                if (arg5 == 1 || arg5 == 3) {
                    var39 = var15.field1563;
                    var40 = var15.field1571;
                } else {
                    var39 = var15.field1571;
                    var40 = var15.field1563;
                }
                int var41 = 0;
                if (arg8 == 11) {
                    var41 += 256;
                }
                arg3.method898(arg6, arg2, arg7, var14, var39, var40, var38, var41, var17, var16);
            }
            if (var15.field1581 != 0) {
                arg0.method626(var15.field1567, (byte) 117, arg5, var15.field1563, var15.field1571, arg7, arg2);
            }
        } else if (arg8 >= 12) {
            class29 var19;
            if (var15.field1596 == -1 && var15.field1560 == null) {
                var19 = var15.method473(arg5, -10, var10, var13, arg8, var11, var12);
            } else {
                var19 = new class65(arg9, arg8, arg5, var10, var11, var12, var13, var15.field1596, true, null);
            }
            arg3.method898(arg6, arg2, arg7, var14, 1, 1, var19, 0, var17, var16);
            if (var15.field1581 != 0) {
                arg0.method626(var15.field1567, (byte) 117, arg5, var15.field1563, var15.field1571, arg7, arg2);
            }
        } else if (arg8 == 0) {
            class29 var20;
            if (var15.field1596 == -1 && var15.field1560 == null) {
                var20 = var15.method473(arg5, -10, var10, var13, 0, var11, var12);
            } else {
                var20 = new class65(arg9, 0, arg5, var10, var11, var12, var13, var15.field1596, true, null);
            }
            arg3.method921(arg6, arg2, arg7, var14, var20, null, class101.field2297[arg5], 0, var17, var16);
            if (var15.field1581 != 0) {
                arg0.method632((byte) 111, arg8, arg2, arg7, arg5, var15.field1567);
            }
        } else if (arg8 == 1) {
            class29 var21;
            if (var15.field1596 == -1 && var15.field1560 == null) {
                var21 = var15.method473(arg5, -10, var10, var13, 1, var11, var12);
            } else {
                var21 = new class65(arg9, 1, arg5, var10, var11, var12, var13, var15.field1596, true, null);
            }
            arg3.method921(arg6, arg2, arg7, var14, var21, null, class10.field251[arg5], 0, var17, var16);
            if (var15.field1581 != 0) {
                arg0.method632((byte) 79, arg8, arg2, arg7, arg5, var15.field1567);
            }
        } else if (arg8 == 2) {
            int var22 = arg5 + 1 & 0x3;
            class29 var23;
            class29 var24;
            if (var15.field1596 == -1 && var15.field1560 == null) {
                var23 = var15.method473(arg5 + 4, -10, var10, var13, 2, var11, var12);
                var24 = var15.method473(var22, -10, var10, var13, 2, var11, var12);
            } else {
                var23 = new class65(arg9, 2, arg5 + 4, var10, var11, var12, var13, var15.field1596, true, null);
                var24 = new class65(arg9, 2, var22, var10, var11, var12, var13, var15.field1596, true, null);
            }
            arg3.method921(arg6, arg2, arg7, var14, var23, var24, class101.field2297[arg5], class101.field2297[var22], var17, var16);
            if (var15.field1581 != 0) {
                arg0.method632((byte) 119, arg8, arg2, arg7, arg5, var15.field1567);
            }
        } else if (arg8 == 3) {
            class29 var25;
            if (var15.field1596 == -1 && var15.field1560 == null) {
                var25 = var15.method473(arg5, -10, var10, var13, 3, var11, var12);
            } else {
                var25 = new class65(arg9, 3, arg5, var10, var11, var12, var13, var15.field1596, true, null);
            }
            arg3.method921(arg6, arg2, arg7, var14, var25, null, class10.field251[arg5], 0, var17, var16);
            if (var15.field1581 != 0) {
                arg0.method632((byte) 84, arg8, arg2, arg7, arg5, var15.field1567);
            }
        } else if (arg8 == 9) {
            class29 var26;
            if (var15.field1596 == -1 && var15.field1560 == null) {
                var26 = var15.method473(arg5, -10, var10, var13, arg8, var11, var12);
            } else {
                var26 = new class65(arg9, arg8, arg5, var10, var11, var12, var13, var15.field1596, true, null);
            }
            arg3.method898(arg6, arg2, arg7, var14, 1, 1, var26, 0, var17, var16);
            if (var15.field1581 != 0) {
                arg0.method626(var15.field1567, (byte) 117, arg5, var15.field1563, var15.field1571, arg7, arg2);
            }
        } else {
            if (var15.field1577) {
                if (arg5 == 1) {
                    int var30 = var13;
                    var13 = var12;
                    var12 = var11;
                    var11 = var10;
                    var10 = var30;
                } else if (arg5 == 2) {
                    int var28 = var13;
                    var13 = var11;
                    var11 = var28;
                    int var29 = var12;
                    var12 = var10;
                    var10 = var29;
                } else if (arg5 == 3) {
                    int var27 = var13;
                    var13 = var10;
                    var10 = var11;
                    var11 = var12;
                    var12 = var27;
                }
            }
            if (arg8 == 4) {
                class29 var31;
                if (var15.field1596 == -1 && var15.field1560 == null) {
                    var31 = var15.method473(0, -10, var10, var13, 4, var11, var12);
                } else {
                    var31 = new class65(arg9, 4, 0, var10, var11, var12, var13, var15.field1596, true, null);
                }
                arg3.method919(arg6, arg2, arg7, var14, var31, class101.field2297[arg5], arg5 * 512, 0, 0, var17, var16);
            } else if (arg8 == 5) {
                int var32 = arg3.method938(arg6, arg2, arg7);
                int var33 = 16;
                if (var32 != 0) {
                    var33 = class20.method145(var32 >> 14 & 0x7FFF, (byte) -95).field1589;
                }
                class29 var34;
                if (var15.field1596 == -1 && var15.field1560 == null) {
                    var34 = var15.method473(0, -10, var10, var13, 4, var11, var12);
                } else {
                    var34 = new class65(arg9, 4, 0, var10, var11, var12, var13, var15.field1596, true, null);
                }
                arg3.method919(arg6, arg2, arg7, var14, var34, class101.field2297[arg5], arg5 * 512, class131.field3092[arg5] * var33, class22.field655[arg5] * var33, var17, var16);
            } else if (arg8 == 6) {
                class29 var35;
                if (var15.field1596 == -1 && var15.field1560 == null) {
                    var35 = var15.method473(0, -10, var10, var13, 4, var11, var12);
                } else {
                    var35 = new class65(arg9, 4, 0, var10, var11, var12, var13, var15.field1596, true, null);
                }
                arg3.method919(arg6, arg2, arg7, var14, var35, 256, arg5, 0, 0, var17, var16);
            } else if (arg8 == 7) {
                class29 var36;
                if (var15.field1596 == -1 && var15.field1560 == null) {
                    var36 = var15.method473(0, -10, var10, var13, 4, var11, var12);
                } else {
                    var36 = new class65(arg9, 4, 0, var10, var11, var12, var13, var15.field1596, true, null);
                }
                arg3.method919(arg6, arg2, arg7, var14, var36, 512, arg5, 0, 0, var17, var16);
            } else if (arg8 == 8) {
                class29 var37;
                if (var15.field1596 == -1 && var15.field1560 == null) {
                    var37 = var15.method473(0, -10, var10, var13, 4, var11, var12);
                } else {
                    var37 = new class65(arg9, 4, 0, var10, var11, var12, var13, var15.field1596, true, null);
                }
                arg3.method919(arg6, arg2, arg7, var14, var37, 768, arg5, 0, 0, var17, var16);
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V")
    public static final void method285(int arg0) {
        for (int var1 = 0; var1 < class17.field464; var1++) {
            int var10002 = class55.field1437[var1]--;
            if (class55.field1437[var1] >= -10) {
                class44 var3 = class97.field2232[var1];
                if (var3 == null) {
                    var3 = class44.method339(class107.field2437, class133.field3133[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class55.field1437[var1] += var3.method338();
                    class97.field2232[var1] = var3;
                }
                if (class55.field1437[var1] < 0) {
                    int var10;
                    if (class24.field686[var1] == 0) {
                        var10 = class119.field2757;
                    } else {
                        int var4 = (class24.field686[var1] & 0xFF) * 128;
                        int var5 = class24.field686[var1] >> 16 & 0xFF;
                        int var6 = class24.field686[var1] >> 8 & 0xFF;
                        int var7 = var5 * 128 + 64 - class46.field1244.field3000;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = var6 * 128 + 64 - class46.field1244.field2939;
                        if (var8 < 0) {
                            var8 = -var8;
                        }
                        int var9 = var7 + var8 - 128;
                        if (var9 > var4) {
                            class55.field1437[var1] = -100;
                            continue;
                        }
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        var10 = (var4 - var9) * class23.field663 / var4;
                    }
                    if (var10 > 0) {
                        class115 var11 = var3.method341().method808(field1038);
                        class117 var12 = class117.method845(var11, 100, var10);
                        var12.method838(class5.field102[var1] - 1);
                        class146.field3541.method662(var12);
                    }
                    class55.field1437[var1] = -100;
                }
            } else {
                class17.field464--;
                for (int var2 = var1; var2 < class17.field464; var2++) {
                    class133.field3133[var2] = class133.field3133[var2 + 1];
                    class97.field2232[var2] = class97.field2232[var2 + 1];
                    class5.field102[var2] = class5.field102[var2 + 1];
                    class55.field1437[var2] = class55.field1437[var2 + 1];
                    class24.field686[var2] = class24.field686[var2 + 1];
                }
                var1--;
            }
        }
        field1043++;
        if (class82.field1974 && !class42.method327((byte) -101)) {
            if (class104.field2346 != 0 && class108.field2442 != -1) {
                class63.method501((byte) 66, class104.field2346, 0, class30.field912, class108.field2442, false);
            }
            class82.field1974 = false;
        }
        if (arg0 < 125) {
            field1046 = null;
        }
    }
}
