import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class59 extends class325 {

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "Ldb;")
    public class141 field784;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Ljava/lang/String;")
    public static String field780 = "Close";

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field786 = 7759444;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    public static int field787 = 0;

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "I")
    public static int field783 = 255;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "I")
    public static int field788 = 0;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "[[B")
    public static byte[][] field785;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIIILr;)Lr;", line = 8)
    public static final class74 method415(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class74 arg6) {
        field781++;
        long var7 = (long) arg0;
        class74 var9 = (class74) class230.field3500.method747(var7, (byte) 94);
        if (var9 == null) {
            class128 var10 = class128.method956(class122.field1867, arg0, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method967(64, 768, -50, -10, -50);
            class230.field3500.method744(var9, -15692, var7);
        }
        int var11 = arg6.method582();
        int var12 = arg6.method575();
        int var13 = arg6.method587();
        int var14 = arg6.method583();
        class74 var15 = var9.method591(true, true, true);
        if (arg2 != arg3) {
            var15.method579(arg2);
        }
        if (class73.field1058) {
            class140 var16 = (class140) var15;
            if (arg5 != class328.method2291(class265.field4112, arg1 + var13, arg4 + var11, arg3 + 115) || class328.method2291(class265.field4112, arg1 + var14, arg4 - -var12, 113) != arg5) {
                for (int var17 = 0; var17 < var16.field2132; var17++) {
                    var16.field2102[var17] += class328.method2291(class265.field4112, var16.field2128[var17] + arg1, var16.field2131[var17] + arg4, arg3 + 96) - arg5;
                }
                var16.field2101.field488 = false;
                var16.field2104.field3547 = false;
            }
        } else {
            class113 var18 = (class113) var15;
            if (class328.method2291(class265.field4112, arg1 + var13, arg4 - -var11, 116) != arg5 || class328.method2291(class265.field4112, arg1 + var14, arg4 + var12, arg3 + 84) != arg5) {
                for (int var19 = 0; var19 < var18.field1700; var19++) {
                    var18.field1718[var19] += class328.method2291(class265.field4112, var18.field1720[var19] + arg1, var18.field1735[var19] + arg4, 127) - arg5;
                }
                var18.field1711 = false;
            }
        }
        return var15;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Ldb;)V", line = 85)
    public class59(class141 arg0) {
        this.field784 = arg0;
    }

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "(B)V", line = 95)
    public static void method416(byte arg0) {
        int var1 = -79 / ((arg0 + 1) / 47);
        field785 = (byte[][]) null;
        field780 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BI)Z", line = 118)
    public static final boolean method417(byte arg0, int arg1) {
        field782++;
        byte var2 = 0;
        byte var3 = 0;
        if (class7.field115 == null) {
            if (class73.field1058 || class161.field2525 == null) {
                class7.field115 = new class195(512, 512);
            } else {
                class7.field115 = (class195) class161.field2525;
            }
            int[] var4 = class7.field115.field3017;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; var6++) {
                var4[var6] = 1;
            }
            for (int var7 = var2 + 1; var7 < 103 - var2; var7++) {
                int var8 = (var2 + 103 - var7) * 512 * 4 + 24628;
                for (int var9 = var3 + 1; var9 < 103 - var3; var9++) {
                    if ((class324.field5005[arg1][var9][var7] & 0x18) == 0) {
                        class99.method754(var4, var8, 512, arg1, var9, var7);
                    }
                    if (arg1 < 3 && (class324.field5005[arg1 + 1][var9][var7] & 0x8) != 0) {
                        class99.method754(var4, var8, 512, arg1 + 1, var9, var7);
                    }
                    var8 += 4;
                }
            }
            class207.field3173 = 0;
            for (int var10 = 0; var10 < 104; var10++) {
                for (int var11 = 0; var11 < 104; var11++) {
                    long var12 = class8.method77(class265.field4112, var3 + var10, var2 + var11);
                    if (var12 != 0L) {
                        class32 var14 = class226.method1607(-126, Integer.MAX_VALUE & (int) (var12 >>> 32));
                        int var15 = var14.field400;
                        if (var14.field450 != null) {
                            for (int var16 = 0; var16 < var14.field450.length; var16++) {
                                if (var14.field450[var16] != -1) {
                                    class32 var17 = class226.method1607(103, var14.field450[var16]);
                                    if (var17.field400 >= 0) {
                                        var15 = var17.field400;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var15 >= 0) {
                            int var18 = var3 + var10;
                            int var19 = var2 + var11;
                            if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                                int[][] var20 = class91.field1323[class265.field4112].field5357;
                                for (int var21 = 0; var21 < 10; var21++) {
                                    int var22 = (int) (Math.random() * 4.0D);
                                    if (var22 == 0 && var18 > 0 && var18 > var10 - 3 && (var20[var18 - 1][var19] & 0x2C0108) == 0) {
                                        var18--;
                                    }
                                    if (var22 == 1 && var18 < 103 && var18 < (var10 + 3) && (var20[var18 + 1][var19] & 0x2C0180) == 0) {
                                        var18++;
                                    }
                                    if (var22 == 2 && var19 > 0 && var19 > var11 - 3 && (var20[var18][var19 - 1] & 0x2C0102) == 0) {
                                        var19--;
                                    }
                                    if (var22 == 3 && var19 < 103 && var19 < var11 + 3 && (var20[var18][var19 + 1] & 0x2C0120) == 0) {
                                        var19++;
                                    }
                                }
                            }
                            class248.field3739[class207.field3173] = var14.field404;
                            class272.field4254[class207.field3173] = var18 - var3;
                            class188.field2962[class207.field3173] = var19 - var2;
                            class207.field3173++;
                        }
                    }
                }
            }
        }
        class7.field115.method1430();
        int var23 = -75 % ((arg0 + 27) / 47);
        int var24 = ((int) (Math.random() * 20.0D)) - (-238 - ((int) (Math.random() * 20.0D) + 228 << 16) - ((int) (Math.random() * 20.0D) + 238 + -10 << 8)) - 10;
        int var25 = ((int) (Math.random() * 20.0D)) + 238 - 10 << 16;
        for (int var26 = 1; var26 < 103; var26++) {
            for (int var27 = 1; var27 < 103; var27++) {
                if ((class324.field5005[arg1][var3 + var27][var2 + var26] & 0x18) == 0 && !class328.method2289(var25, -1, arg1, var26, var3, var27, var2, var24)) {
                    if (class73.field1058) {
                        class287.field4453 = null;
                    } else {
                        class13.field186.method1554(9969);
                    }
                    return false;
                }
                if (arg1 < 3 && (class324.field5005[arg1 + 1][var3 + var27][var2 + var26] & 0x8) != 0 && !class328.method2289(var25, -1, arg1 + 1, var26, var3, var27, var2, var24)) {
                    if (class73.field1058) {
                        class287.field4453 = null;
                    } else {
                        class13.field186.method1554(9969);
                    }
                    return false;
                }
            }
        }
        if (class73.field1058) {
            int[] var28 = class7.field115.field3017;
            int var29 = var28.length;
            for (int var30 = 0; var30 < var29; var30++) {
                if (var28[var30] == 0) {
                    var28[var30] = 1;
                }
            }
            class161.field2525 = new class44(class7.field115);
        } else {
            class161.field2525 = class7.field115;
        }
        if (class73.field1058) {
            class287.field4453 = null;
        } else {
            class13.field186.method1554(9969);
        }
        class7.field115 = null;
        return true;
    }
}
