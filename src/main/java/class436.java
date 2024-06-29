import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class436 {

    @OriginalMember(owner = "client!en", name = "g", descriptor = "[[Lis;")
    private class2[][] field5929 = new class2[1600][64];

    @OriginalMember(owner = "client!en", name = "p", descriptor = "I")
    private int field5938 = 0;

    @OriginalMember(owner = "client!en", name = "j", descriptor = "[I")
    private int[] field5932 = new int[8191];

    @OriginalMember(owner = "client!en", name = "r", descriptor = "[I")
    private int[] field5940 = new int[64];

    @OriginalMember(owner = "client!en", name = "u", descriptor = "[I")
    private int[] field5943 = new int[1600];

    @OriginalMember(owner = "client!en", name = "b", descriptor = "[[Lis;")
    private class2[][] field5924 = new class2[64][768];

    @OriginalMember(owner = "client!en", name = "m", descriptor = "Lkq;")
    private class102 field5935;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "Llca;")
    private class133 field5927;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "Llca;")
    private class133 field5936;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "Lbd;")
    private class180 field5931;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field5930 = 0;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "I")
    public static int field5923;

    @OriginalMember(owner = "client!en", name = "c", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field5928;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "I")
    public static int field5934;

    @OriginalMember(owner = "client!en", name = "o", descriptor = "I")
    public static int field5937;

    @OriginalMember(owner = "client!en", name = "q", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!en", name = "s", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!en", name = "t", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "Lth;")
    public static class266 field5933;

    // $FF: synthetic field
    @OriginalMember(owner = "client!en", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field5944;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILfu;I)Lde;")
    public static final class15 method2533(int arg0, class450 arg1, int arg2) {
        if (arg2 != -19523) {
            method2533(-101, null, -90);
        }
        field5942++;
        class15 var3;
        if (class625.field9045 == null) {
            var3 = new class15();
        } else {
            var3 = class625.field9045;
            class625.field9045 = class625.field9045.field158;
            var3.field158 = null;
            class44.field630--;
        }
        var3.field160 = arg0;
        var3.field161 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILre;)V")
    private final void method2534(int arg0, class582 arg1) {
        class18.field202 = arg1.field8355;
        field5925++;
        if (arg0 == 1014938136) {
            arg1.method3337((byte) 110);
            arg1.method3357((byte) 96, false);
            arg1.method3284(false, arg0 - 1014938260);
            arg1.method3331((byte) -116);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)V")
    public static final void method2535(int arg0) {
        for (class196 var1 = (class196) class558.field7812.method3188((byte) -100); var1 != null; var1 = (class196) class558.field7812.method3182((byte) -80)) {
            if (class199.field2605 == null) {
                var1.method589(-8880);
            } else if (class7.field61 >= var1.field2550) {
                int var14 = class94.field1244[var1.field2554];
                if (var14 == 0) {
                    class8 var15 = class146.method798(var1.field2560, var1.field2552, var1.field2556);
                    if (var15 instanceof class265) {
                        class139.method736(var1.field2560, var1.field2552, var1.field2556);
                        class265 var16 = (class265) var15;
                        if (var16.field3382 != null) {
                            class181.method1116(var1.field2560, var1.field2552, var1.field2556, var16.field3382, null);
                        }
                    }
                } else if (var14 == 1) {
                    class486 var17 = class234.method1474(var1.field2560, var1.field2552, var1.field2556);
                    if (var17 instanceof class579) {
                        class327.method2019(var1.field2560, var1.field2552, var1.field2556);
                        class579 var18 = (class579) var17;
                        if (var18.field8050 != null) {
                            class464.method2676(var1.field2560, var1.field2552, var1.field2556, var18.field8050, null);
                        }
                    }
                } else if (var14 == 2) {
                    class450 var21 = class49.method273(var1.field2560, var1.field2552, var1.field2556, field5944 == null ? (field5944 = method2543("vaa")) : field5944);
                    if (var21 instanceof class515) {
                        class32.method185(var1.field2560, var1.field2552, var1.field2556, field5944 == null ? (field5944 = method2543("vaa")) : field5944);
                        class515 var22 = (class515) var21;
                        if (var22.field7158 != null) {
                            class523.method2925(var22.field7158, false);
                        }
                    }
                } else if (var14 == 3) {
                    class249 var19 = class380.method2313(var1.field2560, var1.field2552, var1.field2556);
                    if (var19 instanceof class12) {
                        class388.method2344(var1.field2560, var1.field2552, var1.field2556);
                        class12 var20 = (class12) var19;
                        if (var20.field115 != null) {
                            class193.method1239(var1.field2560, var1.field2552, var1.field2556, var20.field115);
                        }
                    }
                }
                var1.method589(arg0 - 8880);
            } else if (class7.field61 == var1.field2544) {
                int var2 = class94.field1244[var1.field2554];
                if (var2 == 0) {
                    class8 var12 = class146.method798(var1.field2560, var1.field2552, var1.field2556);
                    if (var12 instanceof class265) {
                        var1.method589(-8880);
                    } else if (class287.method1777(var1.field2560, var1.field2552, var1.field2556) == null) {
                        class265 var13 = new class265(var1.field2554, var1.field2558, var1.field2541, var1.field2551, var1.field2553, var12);
                        class181.method1116(var1.field2560, var1.field2552, var1.field2556, var13, null);
                    } else {
                        var1.method589(-8880);
                    }
                } else if (var2 == 1) {
                    class486 var10 = class234.method1474(var1.field2560, var1.field2552, var1.field2556);
                    if (var10 instanceof class579) {
                        var1.method589(-8880);
                    } else if (class338.method2138(var1.field2560, var1.field2552, var1.field2556) == null) {
                        class579 var11 = new class579(var1.field2554, var1.field2558, var1.field2541, var1.field2551, var1.field2553, var10);
                        class464.method2676(var1.field2560, var1.field2552, var1.field2556, var11, null);
                    } else {
                        var1.method589(-8880);
                    }
                } else if (var2 == 2) {
                    class450 var5 = class49.method273(var1.field2560, var1.field2552, var1.field2556, field5944 == null ? (field5944 = method2543("vaa")) : field5944);
                    if (var5 instanceof class515) {
                        var1.method589(-8880);
                    } else {
                        class32.method185(var1.field2560, var1.field2552, var1.field2556, field5944 == null ? (field5944 = method2543("vaa")) : field5944);
                        class137 var6 = class626.field9084.method1093(0, var1.field2546);
                        int var7;
                        int var8;
                        if (var1.field2558 == 1 || var1.field2558 == 3) {
                            var8 = var6.field1670;
                            var7 = var6.field1717;
                        } else {
                            var7 = var6.field1670;
                            var8 = var6.field1717;
                        }
                        class515 var9 = new class515(var1.field2554, var1.field2558, var1.field2560, var1.field2541, var1.field2551, var1.field2553, var1.field2552, var1.field2552 + var8 - 1, var1.field2556, var1.field2556 + var7 - 1, var5);
                        class523.method2925(var9, false);
                    }
                } else if (var2 == 3) {
                    class249 var3 = class380.method2313(var1.field2560, var1.field2552, var1.field2556);
                    if (var3 instanceof class12) {
                        var1.method589(-8880);
                    } else {
                        class12 var4 = new class12(var1.field2541, var1.field2551, var1.field2553, var3);
                        class193.method1239(var1.field2560, var1.field2552, var1.field2556, var4);
                    }
                }
            }
        }
        if (arg0 != 0) {
            method2535(-96);
        }
        field5937++;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(I)V")
    public final void method2536(int arg0) {
        this.field5927.method296((byte) 36);
        if (arg0 == 32655) {
            field5923++;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)V")
    public static void method2537(byte arg0) {
        field5933 = null;
        if (arg0 > -109) {
            method2542(null, 70, null, -104, -97, null);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lre;ZI)V")
    private final void method2538(class582 arg0, boolean arg1, int arg2) {
        field5928++;
        int var4 = 0;
        class186 var5 = arg0.method3313((byte) -8);
        float var6 = var5.field2390;
        float var7 = var5.field2394;
        float var8 = var5.field2404;
        float var9 = var5.field2401;
        float var10 = var5.field2383;
        float var11 = var5.field2372;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        if (arg1) {
            this.field5940 = null;
        }
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field5927.method297((byte) 52, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method3287(-1, var21);
        if (Stream.method3209()) {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field5943[var23] <= 64 ? this.field5943[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class2 var38 = this.field5929[var23][var25];
                        int var39 = var38.field7;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field16 >> 12);
                        float var45 = (float) (var38.field17 >> 12);
                        float var46 = (float) (var38.field14 >> 12);
                        int var47 = var38.field9 >> 12;
                        var22.method3197((float) (-var47) * var12 + var44);
                        var22.method3197((float) (-var47) * var13 + var45);
                        var22.method3197((float) (-var47) * var14 + var46);
                        var22.method3205(var42);
                        var22.method3205(var41);
                        var22.method3205(var40);
                        var22.method3205(var43);
                        var22.method3197(0.0F);
                        var22.method3197(0.0F);
                        var22.method3197((float) var47 * var15 + var44);
                        var22.method3197((float) var47 * var16 + var45);
                        var22.method3197((float) var47 * var17 + var46);
                        var22.method3205(var42);
                        var22.method3205(var41);
                        var22.method3205(var40);
                        var22.method3205(var43);
                        var22.method3197(1.0F);
                        var22.method3197(0.0F);
                        var22.method3197((float) var47 * var12 + var44);
                        var22.method3197((float) var47 * var13 + var45);
                        var22.method3197((float) var47 * var14 + var46);
                        var22.method3205(var42);
                        var22.method3205(var41);
                        var22.method3205(var40);
                        var22.method3205(var43);
                        var22.method3197(1.0F);
                        var22.method3197(1.0F);
                        var22.method3197((float) var47 * var18 + var44);
                        var22.method3197((float) var47 * var19 + var45);
                        var22.method3197((float) var47 * var20 + var46);
                        var22.method3205(var42);
                        var22.method3205(var41);
                        var22.method3205(var40);
                        var22.method3205(var43);
                        var22.method3197(0.0F);
                        var4++;
                        var22.method3197(1.0F);
                    }
                    if (this.field5943[var23] > 64) {
                        int var26 = this.field5943[var23] - 64 - 1;
                        for (int var27 = this.field5940[var26] - 1; var27 >= 0; var27--) {
                            class2 var28 = this.field5924[var26][var27];
                            int var29 = var28.field7;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field16 >> 12);
                            float var35 = (float) (var28.field17 >> 12);
                            float var36 = (float) (var28.field14 >> 12);
                            int var37 = var28.field9 >> 12;
                            var22.method3197((float) (-var37) * var12 + var34);
                            var22.method3197((float) (-var37) * var13 + var35);
                            var22.method3197((float) (-var37) * var14 + var36);
                            var22.method3205(var32);
                            var22.method3205(var31);
                            var22.method3205(var30);
                            var22.method3205(var33);
                            var22.method3197(0.0F);
                            var22.method3197(0.0F);
                            var22.method3197((float) var37 * var15 + var34);
                            var22.method3197((float) var37 * var16 + var35);
                            var22.method3197((float) var37 * var17 + var36);
                            var22.method3205(var32);
                            var22.method3205(var31);
                            var22.method3205(var30);
                            var22.method3205(var33);
                            var22.method3197(1.0F);
                            var22.method3197(0.0F);
                            var22.method3197((float) var37 * var12 + var34);
                            var22.method3197((float) var37 * var13 + var35);
                            var22.method3197((float) var37 * var14 + var36);
                            var22.method3205(var32);
                            var22.method3205(var31);
                            var22.method3205(var30);
                            var22.method3205(var33);
                            var22.method3197(1.0F);
                            var22.method3197(1.0F);
                            var22.method3197((float) var37 * var18 + var34);
                            var22.method3197((float) var37 * var19 + var35);
                            var22.method3197((float) var37 * var20 + var36);
                            var22.method3205(var32);
                            var22.method3205(var31);
                            var22.method3205(var30);
                            var22.method3205(var33);
                            var22.method3197(0.0F);
                            var4++;
                            var22.method3197(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field5943[var48] > 64 ? 64 : this.field5943[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class2 var63 = this.field5929[var48][var50];
                        int var64 = var63.field7;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field16 >> 12);
                        float var70 = (float) (var63.field17 >> 12);
                        float var71 = (float) (var63.field14 >> 12);
                        int var72 = var63.field9 >> 12;
                        var22.method3206((float) (-var72) * var12 + var69);
                        var22.method3206((float) (-var72) * var13 + var70);
                        var22.method3206((float) (-var72) * var14 + var71);
                        var22.method3205(var67);
                        var22.method3205(var66);
                        var22.method3205(var65);
                        var22.method3205(var68);
                        var22.method3206(0.0F);
                        var22.method3206(0.0F);
                        var22.method3206((float) var72 * var15 + var69);
                        var22.method3206((float) var72 * var16 + var70);
                        var22.method3206((float) var72 * var17 + var71);
                        var22.method3205(var67);
                        var22.method3205(var66);
                        var22.method3205(var65);
                        var22.method3205(var68);
                        var22.method3206(1.0F);
                        var22.method3206(0.0F);
                        var22.method3206((float) var72 * var12 + var69);
                        var22.method3206((float) var72 * var13 + var70);
                        var22.method3206((float) var72 * var14 + var71);
                        var22.method3205(var67);
                        var22.method3205(var66);
                        var22.method3205(var65);
                        var22.method3205(var68);
                        var22.method3206(1.0F);
                        var22.method3206(1.0F);
                        var22.method3206((float) var72 * var18 + var69);
                        var22.method3206((float) var72 * var19 + var70);
                        var22.method3206((float) var72 * var20 + var71);
                        var22.method3205(var67);
                        var22.method3205(var66);
                        var22.method3205(var65);
                        var22.method3205(var68);
                        var22.method3206(0.0F);
                        var22.method3206(1.0F);
                        var4++;
                    }
                    if (this.field5943[var48] > 64) {
                        int var51 = this.field5943[var48] - 64 - 1;
                        for (int var52 = this.field5940[var51] - 1; var52 >= 0; var52--) {
                            class2 var53 = this.field5924[var51][var52];
                            int var54 = var53.field7;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field16 >> 12);
                            float var60 = (float) (var53.field17 >> 12);
                            float var61 = (float) (var53.field14 >> 12);
                            int var62 = var53.field9 >> 12;
                            var22.method3206((float) (-var62) * var12 + var59);
                            var22.method3206((float) (-var62) * var13 + var60);
                            var22.method3206((float) (-var62) * var14 + var61);
                            var22.method3205(var57);
                            var22.method3205(var56);
                            var22.method3205(var55);
                            var22.method3205(var58);
                            var22.method3206(0.0F);
                            var22.method3206(0.0F);
                            var22.method3206((float) var62 * var15 + var59);
                            var22.method3206((float) var62 * var16 + var60);
                            var22.method3206((float) var62 * var17 + var61);
                            var22.method3205(var57);
                            var22.method3205(var56);
                            var22.method3205(var55);
                            var22.method3205(var58);
                            var22.method3206(1.0F);
                            var22.method3206(0.0F);
                            var22.method3206((float) var62 * var12 + var59);
                            var22.method3206((float) var62 * var13 + var60);
                            var22.method3206((float) var62 * var14 + var61);
                            var22.method3205(var57);
                            var22.method3205(var56);
                            var22.method3205(var55);
                            var22.method3205(var58);
                            var22.method3206(1.0F);
                            var22.method3206(1.0F);
                            var22.method3206((float) var62 * var18 + var59);
                            var22.method3206((float) var62 * var19 + var60);
                            var22.method3206((float) var62 * var20 + var61);
                            var22.method3205(var57);
                            var22.method3205(var56);
                            var22.method3205(var55);
                            var22.method3205(var58);
                            var22.method3206(0.0F);
                            var22.method3206(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3207();
        if (this.field5927.method290(22526)) {
            arg0.method1171(this.field5927, 0, (byte) -98);
            arg0.method1171(this.field5936, 1, (byte) -98);
            arg0.method1207(this.field5935, 1);
            arg0.method1212(class546.field7613, this.field5931, var4 * 4, -58, 0, var4 * 2, 0);
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(ILre;)V")
    private final void method2539(int arg0, class582 arg1) {
        arg1.method3284(true, -123);
        if (arg0 <= 41) {
            return;
        }
        field5926++;
        arg1.method3357((byte) -41, true);
        if (class18.field202 != arg1.field8355) {
            arg1.method993(class18.field202);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lre;I)V")
    public final void method2540(class582 arg0, int arg1) {
        field5939++;
        this.field5927.method703(arg1, 11360, 24);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Lre;Lkw;Z)V")
    public final void method2541(class582 arg0, class174 arg1, boolean arg2) {
        field5934++;
        if (arg0.field8296 == null) {
            return;
        }
        this.method2534(1014938136, arg0);
        float var4 = arg0.field8296.field2393;
        float var5 = arg0.field8296.field2367;
        if (arg2) {
            this.method2539(101, null);
        }
        float var6 = arg0.field8296.field2378;
        float var7 = arg0.field8296.field2370;
        try {
            if (arg1.field2256) {
                int var8 = arg1.field2255 - arg1.field2257;
                int var9;
                if (var8 + 2 <= 1600) {
                    var9 = 0;
                    var8 += 2;
                } else {
                    var9 = class330.method2080((byte) -119, var8) + 1 - class546.field7603;
                    var8 = (var8 >> var9) + 2;
                }
                class608 var10 = arg1.field2253.field2529;
                class608 var11 = var10.field8742;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field5938 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field5943[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field5940[var16] = 0;
                    }
                    while (var10 != var11) {
                        class2 var17 = (class2) var11;
                        if (var14) {
                            var14 = false;
                            var13 = var17.field10;
                            var12 = var17.field15;
                        } else if (var17.field15 != var12 || var13 != var17.field10) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field14 >> 12) * var6 + (float) (var17.field17 >> 12) * var5 + (float) (var17.field16 >> 12) * var4 + var7) - arg1.field2257 >> var9;
                        if (var18 < 1600) {
                            if (this.field5943[var18] >= 64) {
                                label195: {
                                    if (this.field5943[var18] == 64) {
                                        if (this.field5938 == 64) {
                                            break label195;
                                        }
                                        this.field5943[var18] += this.field5938++ + 1;
                                    }
                                    class2[] var10000 = this.field5924[this.field5943[var18] - 64 - 1];
                                    int var10002 = this.field5943[var18] - 65;
                                    int var10004 = this.field5940[this.field5943[var18] - 65];
                                    this.field5940[var10002] = this.field5940[this.field5943[var18] - 65] + 1;
                                    var10000[var10004] = var17;
                                }
                            } else {
                                this.field5929[var18][this.field5943[var18]++] = var17;
                            }
                        }
                        var11 = var11.field8742;
                    }
                    arg0.method3329(-10053, false, false, var12 <= 0 ? -1 : var12);
                    if (var13 && class18.field202 != arg0.field8355) {
                        arg0.method993(class18.field202);
                    } else if (arg0.field8355 != 1.0F) {
                        arg0.method993(1.0F);
                    }
                    this.method2538(arg0, false, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class608 var22 = arg1.field2253.field2529;
                for (class608 var23 = var22.field8742; var23 != var22; var23 = var23.field8742) {
                    class2 var24 = (class2) var23;
                    int var25 = (int) ((float) (var24.field14 >> 12) * var6 + (float) (var24.field17 >> 12) * var5 + (float) (var24.field16 >> 12) * var4 + var7);
                    if (var25 < var20) {
                        var20 = var25;
                    }
                    if (var21 < var25) {
                        var21 = var25;
                    }
                    this.field5932[var19++] = var25;
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = (class330.method2080((byte) -127, var26) - class546.field7603) + 1;
                    var26 = (var26 >> var27) + 2;
                }
                class608 var28 = var22.field8742;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field5938 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field5943[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field5940[var34] = 0;
                    }
                    while (var22 != var28) {
                        class2 var35 = (class2) var28;
                        if (var32) {
                            var32 = false;
                            var31 = var35.field10;
                            var30 = var35.field15;
                        }
                        if (var29 > 0 && (var35.field15 != var30 || var31 != var35.field10)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field5932[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field5943[var36] < 64) {
                                this.field5929[var36][this.field5943[var36]++] = var35;
                            } else {
                                label145: {
                                    if (this.field5943[var36] == 64) {
                                        if (this.field5938 == 64) {
                                            break label145;
                                        }
                                        this.field5943[var36] += this.field5938++ + 1;
                                    }
                                    this.field5924[this.field5943[var36] - 1 - 64][this.field5940[this.field5943[var36] - 1 - 64]++] = var35;
                                }
                            }
                        }
                        var28 = var28.field8742;
                    }
                    arg0.method3329(-10053, false, false, var30 >= 0 ? var30 : -1);
                    if (var31 && class18.field202 != arg0.field8355) {
                        arg0.method993(class18.field202);
                    } else if (arg0.field8355 != 1.0F) {
                        arg0.method993(1.0F);
                    }
                    this.method2538(arg0, arg2, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method2539(61, arg0);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "([IILre;II[I)Lcb;")
    public static final class78 method2542(int[] arg0, int arg1, class582 arg2, int arg3, int arg4, int[] arg5) {
        field5941++;
        if (arg1 != 27737) {
            method2533(35, null, 125);
        }
        if (!arg2.method1214(class280.field3663, class33.field495, 125)) {
            int[] var10 = new int[arg3 * arg4];
            for (int var11 = 0; var11 < arg4; var11++) {
                int var12 = arg3 * var11 + arg5[var11];
                for (int var13 = 0; var13 < arg0[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class78(arg2, arg3, arg4, var10);
        }
        byte[] var6 = new byte[arg3 * arg4];
        for (int var7 = 0; var7 < arg4; var7++) {
            int var8 = arg3 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg0[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class78(arg2, arg3, arg4, var6);
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lre;)V")
    public class436(class582 arg0) {
        this.field5935 = arg0.method1178(new class410[] { new class410(new class76[] { class76.field1031, class76.field1036, class76.field1038 }), new class410(class76.field1035) }, (byte) -13);
        this.field5927 = arg0.method1197(10, true);
        this.field5936 = arg0.method1197(10, false);
        this.field5936.method703(393168, 11360, 12);
        this.field5931 = arg0.method1188((byte) 119, false);
        this.field5931.method292(false, 49146);
        Buffer var2 = this.field5931.method297((byte) 52, true);
        if (var2 != null) {
            Stream var3 = arg0.method3287(-1, var2);
            if (Stream.method3209()) {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3198(var5);
                    var3.method3198(var5 + 1);
                    var3.method3198(var5 + 2);
                    var3.method3198(var5 + 2);
                    var3.method3198(var5 + 3);
                    var3.method3198(var5);
                }
            } else {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3203(var7);
                    var3.method3203(var7 + 1);
                    var3.method3203(var7 + 2);
                    var3.method3203(var7 + 2);
                    var3.method3203(var7 + 3);
                    var3.method3203(var7);
                }
            }
            var3.method3207();
            this.field5931.method290(22526);
        }
        Buffer var8 = this.field5936.method297((byte) 52, true);
        if (var8 != null) {
            Stream var9 = arg0.method3287(-1, var8);
            if (Stream.method3209()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3197(0.0F);
                    var9.method3197(-1.0F);
                    var9.method3197(0.0F);
                    var9.method3197(0.0F);
                    var9.method3197(-1.0F);
                    var9.method3197(0.0F);
                    var9.method3197(0.0F);
                    var9.method3197(-1.0F);
                    var9.method3197(0.0F);
                    var9.method3197(0.0F);
                    var9.method3197(-1.0F);
                    var9.method3197(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3206(0.0F);
                    var9.method3206(-1.0F);
                    var9.method3206(0.0F);
                    var9.method3206(0.0F);
                    var9.method3206(-1.0F);
                    var9.method3206(0.0F);
                    var9.method3206(0.0F);
                    var9.method3206(-1.0F);
                    var9.method3206(0.0F);
                    var9.method3206(0.0F);
                    var9.method3206(-1.0F);
                    var9.method3206(0.0F);
                }
            }
            var9.method3207();
            this.field5936.method290(22526);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2543(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
