import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class129 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public int field3042 = 0;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public int field3049 = 0;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "Lqf;")
    public static class117 field3043 = class72.method514(109, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!sd", name = "k", descriptor = "Lqf;")
    private static class117 field3052 = class72.method514(98, "We suspect someone knows your password)3");

    @OriginalMember(owner = "client!sd", name = "n", descriptor = "Lqf;")
    public static class117 field3055 = class72.method514(108, "leuchten1:");

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field3062 = 0;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "Lqf;")
    public static class117 field3061 = class72.method514(122, "::noclip");

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "Lqf;")
    public static class117 field3060 = class72.method514(109, ")2");

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "[I")
    public static int[] field3063 = new int[4000];

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Lqf;")
    public static class117 field3064 = class72.method514(125, "da dieser Computer gegen unsere ");

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "Lqf;")
    public static class117 field3067 = class72.method514(121, "Classic");

    @OriginalMember(owner = "client!sd", name = "A", descriptor = "Lqf;")
    public static class117 field3068 = class72.method514(119, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "Lqf;")
    private static class117 field3069 = class72.method514(114, "Press (Wchange your password(W on front page)3");

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "Lqf;")
    public static class117 field3048 = field3069;

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lqf;")
    public static class117 field3071 = field3052;

    @OriginalMember(owner = "client!sd", name = "o", descriptor = "Lad;")
    public static class5 field3056 = new class5();

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "I")
    public static int field3072 = 0;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public int field3044;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field3045;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public int field3051;

    @OriginalMember(owner = "client!sd", name = "l", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!sd", name = "m", descriptor = "I")
    public int field3054;

    @OriginalMember(owner = "client!sd", name = "q", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "I")
    public int field3059;

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public int field3066;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Lee;")
    public class34 field3047;

    @OriginalMember(owner = "client!sd", name = "p", descriptor = "Lee;")
    public class34 field3057;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Ljb;BI)Lr;")
    public static final class118 method1005(class64 arg0, byte arg1, int arg2) {
        field3058++;
        if (class29.method219(arg0, (byte) -109, arg2)) {
            if (arg1 >= -34) {
                method1007(null, 111);
            }
            return class47.method337(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)Z")
    public static final boolean method1006(int arg0, int arg1) {
        field3045++;
        if (!class26.method201(arg0, 314356016)) {
            return false;
        }
        class89[] var2 = class141.field3426[arg0];
        if (arg1 != 2047) {
            field3055 = null;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.length; var4++) {
            class89 var5 = var2[var4];
            if (var5 != null && var5.field2142 == 6) {
                if (var5.field2064 != -1 || var5.field2057 != -1) {
                    boolean var6 = class31.method256(var5, 0);
                    int var7;
                    if (var6) {
                        var7 = var5.field2057;
                    } else {
                        var7 = var5.field2064;
                    }
                    if (var7 != -1) {
                        class96 var8 = class130.method1013(var7, arg1 ^ 0xFFFFF853);
                        var5.field2083 += class83.field1911;
                        while (var8.field2334[var5.field2111] < var5.field2083) {
                            var5.field2083 -= var8.field2334[var5.field2111];
                            var5.field2111++;
                            if (var8.field2312.length <= var5.field2111) {
                                var5.field2111 -= var8.field2331;
                                if (var5.field2111 < 0 || var8.field2312.length <= var5.field2111) {
                                    var5.field2111 = 0;
                                }
                            }
                            var3 = true;
                        }
                    }
                }
                if (var5.field2162 != 0 && !var5.field2102) {
                    var3 = true;
                    int var9 = var5.field2162 >> 16;
                    int var10 = class83.field1911 * var9;
                    int var11 = var5.field2162 << 16 >> 16;
                    var5.field2078 = var5.field2078 + var10 & 0x7FF;
                    int var12 = class83.field1911 * var11;
                    var5.field2150 = var5.field2150 + var12 & 0x7FF;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lqf;I)I")
    public static final int method1007(class117 arg0, int arg1) {
        field3065++;
        if (class144.field3539 == 1) {
            return 7;
        }
        int var2 = -29 % (arg1 / 52);
        if (arg0.method932(class115.field2737, -115)) {
            return 1;
        } else if (arg0.method932(class81.field1854, -87)) {
            return 1;
        } else if (arg0.method932(class115.field2717, -63)) {
            return 2;
        } else if (arg0.method932(class64.field1285, -84)) {
            return 2;
        } else if (arg0.method932(class28.field554, -74)) {
            return 3;
        } else if (arg0.method932(class21.field371, -124)) {
            return 4;
        } else if (arg0.method932(class78.field1766, -70)) {
            return 4;
        } else if (arg0.method932(class95.field2296, -91)) {
            return 5;
        } else if (arg0.method932(class35.field736, -104)) {
            return 6;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V")
    public static final void method1008(int arg0, boolean arg1) {
        field3050++;
        int[] var2 = class18.field285.field1915;
        int var3 = var2.length;
        if (arg1) {
            method1007(null, -123);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            var2[var4] = 0;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (103 - var5) * 512 * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class73.field1606[arg0][var21][var5] & 0x18) == 0) {
                    class19.field311.method878(var2, var20, 512, arg0, var21, var5);
                }
                if (arg0 < 3 && (class73.field1606[arg0 + 1][var21][var5] & 0x8) != 0) {
                    class19.field311.method878(var2, var20, 512, arg0 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        int var6 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        class18.field285.method672();
        int var7 = (int) (Math.random() * 20.0D) + 228 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class73.field1606[arg0][var19][var8] & 0x18) == 0) {
                    method1010(var19, var8, -1026, var6, var7, arg0);
                }
                if (arg0 < 3 && (class73.field1606[arg0 + 1][var19][var8] & 0x8) != 0) {
                    method1010(var19, var8, -1026, var6, var7, arg0 + 1);
                }
            }
        }
        class110.field2606 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class19.field311.method839(class140.field3344, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class23.method181((byte) -103, var12).field3632;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class107.field2550[class140.field3344].field3230;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var14 > var9 - 3 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var10 - 3 < var15 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class110.field2609[class110.field2606] = class135.field3226[var13];
                        class97.field2365[class110.field2606] = var14;
                        class87.field2011[class110.field2606] = var15;
                        class110.field2606++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1009(int arg0) {
        field3067 = null;
        field3043 = null;
        if (arg0 != 5625) {
            field3043 = null;
        }
        field3068 = null;
        field3064 = null;
        field3063 = null;
        field3060 = null;
        field3061 = null;
        field3071 = null;
        field3056 = null;
        field3069 = null;
        field3048 = null;
        field3052 = null;
        field3055 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIIIII)V")
    private static final void method1010(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3070++;
        int var6 = class19.field311.method846(arg5, arg0, arg1);
        if (var6 != 0) {
            int var7 = class19.field311.method848(arg5, arg0, arg1, var6);
            int var8 = var7 >> 6 & 0x3;
            int var9 = arg3;
            int var10 = var7 & 0x1F;
            int[] var11 = class18.field285.field1915;
            int var12 = (52736 - arg1 * 512) * 4 + arg0 * 4 + 24624;
            if (var6 > 0) {
                var9 = arg4;
            }
            int var13 = var6 >> 14 & 0x7FFF;
            class148 var14 = class23.method181((byte) -98, var13);
            if (var14.field3661 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var8 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var8 == 1) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var8 == 2) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 515] = var9;
                        var11[var12 + 3 + 1024] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1 + 1536] = var9;
                        var11[var12 + 2 + 1536] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    }
                }
                if (var10 == 3) {
                    if (var8 == 0) {
                        var11[var12] = var9;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var9;
                    } else if (var8 == 2) {
                        var11[var12 + 1536 + 3] = var9;
                    } else if (var8 == 3) {
                        var11[var12 + 1536] = var9;
                    }
                }
                if (var10 == 2) {
                    if (var8 == 3) {
                        var11[var12] = var9;
                        var11[var12 + 512] = var9;
                        var11[var12 + 1024] = var9;
                        var11[var12 + 1536] = var9;
                    } else if (var8 == 0) {
                        var11[var12] = var9;
                        var11[var12 + 1] = var9;
                        var11[var12 + 2] = var9;
                        var11[var12 + 3] = var9;
                    } else if (var8 == 1) {
                        var11[var12 + 3] = var9;
                        var11[var12 + 3 + 512] = var9;
                        var11[var12 + 3 + 1024] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    } else if (var8 == 2) {
                        var11[var12 + 1536] = var9;
                        var11[var12 + 1536 + 1] = var9;
                        var11[var12 + 2 + 1536] = var9;
                        var11[var12 + 3 + 1536] = var9;
                    }
                }
            } else {
                class118 var15 = class133.field3146[var14.field3661];
                if (var15 != null) {
                    int var16 = (var14.field3649 * 4 - var15.field2832) / 2;
                    int var17 = (var14.field3665 * 4 - var15.field2835) / 2;
                    var15.method951(arg0 * 4 + var17 + 48, (104 - var14.field3649 + -arg1) * 4 + 48 + var16);
                }
            }
        }
        int var18 = class19.field311.method875(arg5, arg0, arg1);
        if (var18 != 0) {
            int var19 = class19.field311.method848(arg5, arg0, arg1, var18);
            int var20 = var19 & 0x1F;
            int var21 = var19 >> 6 & 0x3;
            int var22 = var18 >> 14 & 0x7FFF;
            class148 var23 = class23.method181((byte) -96, var22);
            if (var23.field3661 != -1) {
                class118 var27 = class133.field3146[var23.field3661];
                if (var27 != null) {
                    int var28 = (var23.field3665 * 4 - var27.field2835) / 2;
                    int var29 = (var23.field3649 * 4 - var27.field2832) / 2;
                    var27.method951(arg0 * 4 + var28 + 48, var29 + 48 - -((-var23.field3649 + -arg1 + 104) * 4));
                }
            } else if (var20 == 9) {
                int var24 = 15658734;
                int var25 = arg0 * 4 + (103 - arg1) * 2048 + 24624;
                if (var18 > 0) {
                    var24 = 15597568;
                }
                int[] var26 = class18.field285.field1915;
                if (var21 == 0 || var21 == 2) {
                    var26[var25 + 1536] = var24;
                    var26[var25 + 1 + 1024] = var24;
                    var26[var25 + 512 + 2] = var24;
                    var26[var25 + 3] = var24;
                } else {
                    var26[var25] = var24;
                    var26[var25 + 1 + 512] = var24;
                    var26[var25 + 1026] = var24;
                    var26[var25 + 3 + 1536] = var24;
                }
            }
        }
        if (arg2 != -1026) {
            method1008(64, false);
        }
        int var30 = class19.field311.method839(arg5, arg0, arg1);
        if (var30 == 0) {
            return;
        }
        int var31 = var30 >> 14 & 0x7FFF;
        class148 var32 = class23.method181((byte) -101, var31);
        if (var32.field3661 == -1) {
            return;
        }
        class118 var33 = class133.field3146[var32.field3661];
        if (var33 != null) {
            int var34 = (var32.field3649 * 4 - var33.field2832) / 2;
            int var35 = (var32.field3665 * 4 - var33.field2835) / 2;
            var33.method951(arg0 * 4 + var35 + 48, 48 - -((104 - (arg1 - -var32.field3649)) * 4) + var34);
            return;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(B)V")
    public static final void method1011(byte arg0) {
        field3046++;
        try {
            if (arg0 >= 123) {
                Graphics var1 = class3.field64.getGraphics();
                class103.field2499.method210(550, 4, (byte) 78, var1);
            }
        } catch (Exception var2) {
            class3.field64.repaint();
        }
    }
}
