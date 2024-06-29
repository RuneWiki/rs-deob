import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class223 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "[I")
    public static int[] field3976 = new int[2];

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "Le;")
    public static class191 field3980 = class54.method368("<col=ffffff>", 2047);

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "Le;")
    public static class191 field3975 = class54.method368(":allyreq:", 2047);

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field3978 = -1;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "Le;")
    public static class191 field3983 = class54.method368("::fpsoff", 2047);

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Le;JIISILe;)V")
    public static final void method1549(class191 arg0, long arg1, int arg2, int arg3, short arg4, int arg5, class191 arg6) {
        field3977++;
        if (class258.field4575 || arg2 <= class167.field2824) {
            return;
        }
        class170.field2881[class167.field2824] = arg0;
        class33.field475[class167.field2824] = arg6;
        class188.field3306[class167.field2824] = arg4;
        class209.field3727[class167.field2824] = arg1;
        class270.field4761[class167.field2824] = arg3;
        class166.field2800[class167.field2824] = arg5;
        class167.field2824++;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)V")
    public static final void method1550(int arg0, boolean arg1) {
        field3982++;
        class155 var2;
        if (class216.field3815 == null) {
            var2 = new class155(512, 512);
        } else {
            var2 = (class155) class216.field3815;
        }
        int[] var3 = var2.field2656;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = (52736 - (var6 * 512)) * 4 + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class270.field4755[arg0][var25][var6] & 0x18) == 0) {
                    class40.method267(var3, var24, 512, arg0, var25, var6);
                }
                if (arg0 < 3 && (class270.field4755[arg0 + 1][var25][var6] & 0x8) != 0) {
                    class40.method267(var3, var24, 512, arg0 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        var2.method1052();
        int var7 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) + ((int) (Math.random() * 20.0D) + 228 << 8) + (int) (Math.random() * 20.0D) + 238 - 10;
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        int var9 = 1;
        if (arg1) {
            field3978 = -23;
        }
        while (var9 < 103) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class270.field4755[arg0][var23][var9] & 0x18) == 0) {
                    class119.method787(arg0, var23, var9, var8, var7, arg1);
                }
                if (arg0 < 3 && (class270.field4755[arg0 + 1][var23][var9] & 0x8) != 0) {
                    class119.method787(arg0 + 1, var23, var9, var8, var7, false);
                }
            }
            var9++;
        }
        class199.field3554 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class192.method1365(class261.field4598, var10, var11);
                if (var12 != 0L) {
                    class102 var14 = class31.method216((int) (var12 >>> 32) & Integer.MAX_VALUE, (byte) 119);
                    int var15 = var14.field1681;
                    if (var14.field1649 != null) {
                        for (int var16 = 0; var16 < var14.field1649.length; var16++) {
                            if (var14.field1649[var16] != -1) {
                                class102 var17 = class31.method216(var14.field1649[var16], (byte) 123);
                                if (var17.field1681 >= 0) {
                                    var15 = var17.field1681;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var10;
                        int var19 = var11;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class82.field1383[class261.field4598].field3873;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var18 > 0 && (var10 - 3) < var18 && (var20[var18 - 1][var19] & 0x12C0108) == 0) {
                                    var18--;
                                }
                                if (var22 == 1 && var18 < 103 && (var10 + 3) > var18 && (var20[var18 + 1][var19] & 0x12C0180) == 0) {
                                    var18++;
                                }
                                if (var22 == 2 && var19 > 0 && (var11 - 3) < var19 && (var20[var18][var19 - 1] & 0x12C0102) == 0) {
                                    var19--;
                                }
                                if (var22 == 3 && var19 < 103 && var19 < var11 + 3 && (var20[var18][var19 + 1] & 0x12C0120) == 0) {
                                    var19++;
                                }
                            }
                        }
                        class49.field875[class199.field3554] = var14.field1690;
                        class145.field2445[class199.field3554] = var18;
                        class141.field2353[class199.field3554] = var19;
                        class199.field3554++;
                    }
                }
            }
        }
        class216.field3815 = var2;
        class42.field740.method261(111);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1551(int arg0, int arg1, int arg2, int arg3) {
        if (!class161.method1092(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = class12.field143[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class267.field4716) {
                    if (!class130.method883(var4, var6, var5)) {
                        return false;
                    }
                    if (!class130.method883(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class130.method883(var4, var7, var5)) {
                        return false;
                    }
                    if (!class130.method883(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class130.method883(var4, var8, var5)) {
                    return false;
                }
                if (!class130.method883(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class73.field1268) {
                    if (!class130.method883(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class130.method883(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class130.method883(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class130.method883(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class130.method883(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class130.method883(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class267.field4716) {
                    if (!class130.method883(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class130.method883(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class130.method883(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class130.method883(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class130.method883(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class130.method883(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class73.field1268) {
                    if (!class130.method883(var4, var6, var5)) {
                        return false;
                    }
                    if (!class130.method883(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class130.method883(var4, var7, var5)) {
                        return false;
                    }
                    if (!class130.method883(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class130.method883(var4, var8, var5)) {
                    return false;
                }
                if (!class130.method883(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class130.method883(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class130.method883(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class130.method883(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class130.method883(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class130.method883(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIBI)V")
    public static final void method1552(int arg0, int arg1, byte arg2, int arg3) {
        field3981++;
        class241 var4 = class14.method97(9, arg0, -92);
        var4.method1694((byte) -90);
        var4.field4301 = arg1;
        var4.field4279 = arg3;
        if (arg2 < 77) {
            field3975 = null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    public static final void method1553(int arg0, int arg1) {
        class199 var2 = class201.field3608[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class199 var4 = class201.field3608[var3][arg0][arg1] = class201.field3608[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3543--;
                for (int var5 = 0; var5 < var4.field3550; var5++) {
                    class12 var6 = var4.field3549[var5];
                    if ((var6.field136 >> 29 & 0x3L) == 2L && var6.field152 == arg0 && var6.field144 == arg1) {
                        var6.field142--;
                    }
                }
            }
        }
        if (class201.field3608[0][arg0][arg1] == null) {
            class201.field3608[0][arg0][arg1] = new class199(0, arg0, arg1);
        }
        class201.field3608[0][arg0][arg1].field3565 = var2;
        class201.field3608[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method1554(byte arg0) {
        field3980 = null;
        field3976 = null;
        field3983 = null;
        if (arg0 < -44) {
            field3975 = null;
        }
    }
}
