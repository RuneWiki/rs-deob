import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class50 extends class273 {

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "Lwm;")
    public class152 field779;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Z")
    public static boolean field776 = false;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "Lwm;")
    public static class152 field781 = class157.method1048("showingVideoAd", 117);

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)V", line = 26)
    public static void method345(int arg0) {
        if (arg0 <= 126) {
            method348(114, -123);
        }
        field781 = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V", line = 36)
    public static final void method346(int arg0, int arg1) {
        field777++;
        if (class85.field1176.field4162 - (class85.field1176.method67(-4391) - 1) * 64 >> 7 == class84.field1166 && (class85.field1176.field4231 + 64 - (class85.field1176.method67(-4391) * 64) >> 7) == class278.field4762) {
            class84.field1166 = 0;
        }
        int var2 = class194.field3114;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class12 var4;
            if (arg1 == 0) {
                var4 = class85.field1176;
            } else {
                var4 = class22.field380[class325.field5670[var3]];
            }
            if (var4 != null && var4.method18(-92)) {
                int var5 = var4.method67(-4391);
                if (arg1 == 0 || arg1 == var5) {
                    if (var5 == 1) {
                        if ((var4.field4162 & 0x7F) == 64 && (var4.field4231 & 0x7F) == 64) {
                            int var6 = var4.field4162 >> 7;
                            int var7 = var4.field4231 >> 7;
                            if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                                var10002 = class226.field3674[var6][var7]++;
                            }
                        }
                    } else if (((var5 & 0x1) != 0 || (var4.field4162 & 0x7F) == 0 && (var4.field4231 & 0x7F) == 0) && ((var5 & 0x1) != 1 || (var4.field4162 & 0x7F) == 64 && (var4.field4231 & 0x7F) == 64)) {
                        int var8 = var4.field4162 - var5 * 64 >> 7;
                        int var9 = var4.field4231 - (var5 * 64) >> 7;
                        int var10 = var4.method67(-4391) + var8;
                        if (var8 < 0) {
                            var8 = 0;
                        }
                        int var11 = var4.method67(arg0 - 20182) + var9;
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var11 > 104) {
                            var11 = 104;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        for (int var12 = var8; var12 < var10; var12++) {
                            for (int var13 = var9; var13 < var11; var13++) {
                                var10002 = class226.field3674[var12][var13]++;
                            }
                        }
                    }
                }
            }
        }
        label226: for (int var14 = 0; var14 < var2; var14++) {
            class12 var15;
            long var16;
            if (arg1 == 0) {
                var15 = class85.field1176;
                var16 = 8791798054912L;
            } else {
                var16 = (long) class325.field5670[var14] << 32;
                var15 = class22.field380[class325.field5670[var14]];
            }
            if (var15 != null && var15.method18(56)) {
                int var18 = var15.method67(-4391);
                if (arg1 == 0 || arg1 == var18) {
                    var15.field153 = false;
                    var15.field4255 = true;
                    if ((class211.field3427 && class194.field3114 > 200 || class194.field3114 > 50) && arg1 != 0 && var15.field4224 == var15.method1706((byte) 83).field4310) {
                        var15.field153 = true;
                    }
                    if (var18 == 1) {
                        if ((var15.field4162 & 0x7F) == 64 && (var15.field4231 & 0x7F) == 64) {
                            int var28 = var15.field4231 >> 7;
                            int var29 = var15.field4162 >> 7;
                            if (var29 < 0 || var29 >= 104 || var28 < 0 || var28 >= 104) {
                                continue;
                            }
                            if (class226.field3674[var29][var28] > 1) {
                                var10002 = class226.field3674[var29][var28]--;
                                continue;
                            }
                        }
                    } else if ((var18 & 0x1) == 0 && (var15.field4162 & 0x7F) == 0 && (var15.field4231 & 0x7F) == 0 || (var18 & 0x1) == 1 && (var15.field4162 & 0x7F) == 64 && (var15.field4231 & 0x7F) == 0) {
                        int var19 = var15.field4162 - var18 * 64 >> 7;
                        int var20 = var19 + var18;
                        if (var19 < 0) {
                            var19 = 0;
                        }
                        int var21 = var15.field4231 - var18 * 64 >> 7;
                        if (var20 > 104) {
                            var20 = 104;
                        }
                        boolean var22 = true;
                        int var23 = var21 + var18;
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var23 > 104) {
                            var23 = 104;
                        }
                        for (int var24 = var19; var24 < var20; var24++) {
                            for (int var25 = var21; var25 < var23; var25++) {
                                if (class226.field3674[var24][var25] <= 1) {
                                    var22 = false;
                                    break;
                                }
                            }
                        }
                        if (var22) {
                            int var26 = var19;
                            while (true) {
                                if (var20 <= var26) {
                                    continue label226;
                                }
                                for (int var27 = var21; var27 < var23; var27++) {
                                    var10002 = class226.field3674[var26][var27]--;
                                }
                                var26++;
                            }
                        }
                    }
                    if (var15.field4222 == null || class142.field2187 < var15.field4264 || var15.field4247 <= class142.field2187) {
                        var15.field4255 = false;
                        var15.field4185 = class154.method1031(100, var15.field4162, class23.field400, var15.field4231);
                        class241.method1644(class23.field400, var15.field4162, var15.field4231, var15.field4185, (var18 - 1) * 64 + 60, var15, var15.field4161, var16, var15.field4236);
                    } else {
                        var15.field153 = false;
                        var15.field4255 = false;
                        var15.field4185 = class154.method1031(82, var15.field4162, class23.field400, var15.field4231);
                        class212.method1422(class23.field400, var15.field4162, var15.field4231, var15.field4185, var15, var15.field4161, var16, var15.field4256, var15.field4193, var15.field4252, var15.field4241);
                    }
                }
            }
        }
        if (arg0 != 15791) {
            method346(-10, 38);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([Loe;IZIII)V", line = 305)
    public static final void method347(class127[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 < arg0.length; var6++) {
            class127 var7 = arg0[var6];
            if (var7 != null && var7.field1836 == arg4) {
                class52.method354(82, var7, arg1, arg2, arg5);
                class104.method700(arg1, arg5, var7, -16133);
                if ((var7.field1875 - var7.field1876) < var7.field1891) {
                    var7.field1891 = var7.field1875 - var7.field1876;
                }
                if (var7.field1891 < 0) {
                    var7.field1891 = 0;
                }
                if (var7.field1915 - var7.field1921 < var7.field1852) {
                    var7.field1852 = var7.field1915 - var7.field1921;
                }
                if (var7.field1852 < 0) {
                    var7.field1852 = 0;
                }
                if (var7.field1902 == 0) {
                    class193.method1288(126, arg2, var7);
                }
            }
        }
        field774++;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)I", line = 343)
    public static final int method348(int arg0, int arg1) {
        if (arg1 == 255) {
            field773++;
            return arg0 & 0xFF;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)I", line = 355)
    public static final int method349(int arg0, int arg1) {
        field775++;
        int var2 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var3 = arg1 * 6 + arg0;
        int var4 = (arg1 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 370)
    public class50() {
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lwm;I)V", line = 374)
    public class50(class152 arg0, int arg1) {
        this.field779 = arg0;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BB)V", line = 392)
    public static final void method350(byte[] arg0, byte arg1) {
        field778++;
        class291 var2 = new class291(arg0);
        var2.field4946 = arg0.length - 2;
        class52.field807 = var2.method2021((byte) 74);
        class8.field106 = new int[class52.field807];
        class180.field2865 = new int[class52.field807];
        class23.field403 = new byte[class52.field807][];
        class283.field4822 = new boolean[class52.field807];
        class253.field4383 = new int[class52.field807];
        class179.field2856 = new int[class52.field807];
        class61.field924 = new byte[class52.field807][];
        var2.field4946 = arg0.length - (class52.field807 * 8) - 7;
        class186.field2975 = var2.method2021((byte) 74);
        class193.field3068 = var2.method2021((byte) 74);
        int var3 = (var2.method2011(-22) & 0xFF) + 1;
        for (int var4 = 0; var4 < class52.field807; var4++) {
            class180.field2865[var4] = var2.method2021((byte) 74);
        }
        for (int var5 = 0; var5 < class52.field807; var5++) {
            class179.field2856[var5] = var2.method2021((byte) 74);
        }
        for (int var6 = 0; var6 < class52.field807; var6++) {
            class253.field4383[var6] = var2.method2021((byte) 74);
        }
        for (int var7 = 0; var7 < class52.field807; var7++) {
            class8.field106[var7] = var2.method2021((byte) 74);
        }
        var2.field4946 = (arg0.length - (class52.field807 * 8 + 7)) + 3 - var3 * 3;
        class134.field2070 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class134.field2070[var8] = var2.method2009((byte) 64);
            if (class134.field2070[var8] == 0) {
                class134.field2070[var8] = 1;
            }
        }
        var2.field4946 = 0;
        for (int var9 = 0; var9 < class52.field807; var9++) {
            int var10 = class253.field4383[var9];
            int var11 = class8.field106[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            byte[] var14 = new byte[var12];
            class23.field403[var9] = var14;
            class61.field924[var9] = var13;
            boolean var15 = false;
            int var16 = var2.method2011(-120);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var14[var17] = var2.method1962(false);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var13[var18] = var2.method1962(false);
                        var15 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label100: while (true) {
                    if (var20 >= var10) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var22 = 0;
                        while (true) {
                            if (var22 >= var10) {
                                break label100;
                            }
                            for (int var23 = 0; var23 < var11; var23++) {
                                byte var24 = var13[var10 * var23 + var22] = var2.method1962(false);
                                var15 |= var24 != -1;
                            }
                            var22++;
                        }
                    }
                    for (int var21 = 0; var21 < var11; var21++) {
                        var14[var10 * var21 + var20] = var2.method1962(false);
                    }
                    var20++;
                }
            }
            class283.field4822[var9] = var15;
        }
        if (arg1 < 113) {
            method348(98, -95);
        }
    }
}
