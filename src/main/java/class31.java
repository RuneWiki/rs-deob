import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class31 extends class155 {

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "[Lea;")
    public class252[] field507;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Ljava/lang/String;")
    public static String field506 = "red:";

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "Ljava/lang/String;")
    public static String field516 = "Please wait...";

    @OriginalMember(owner = "client!bf", name = "N", descriptor = "Lpf;")
    public static class17 field518 = new class17(50);

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!bf", name = "D", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!bf", name = "M", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!bf", name = "O", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBLhg;)V")
    public static final void method193(int arg0, int arg1, byte arg2, class207 arg3) {
        field514++;
        if (class162.field2635 != null || class259.field4360 || arg3 == null || class20.method134((byte) 70, arg3) == null) {
            return;
        }
        class162.field2635 = arg3;
        class78.field1324 = class20.method134((byte) 62, arg3);
        class205.field3285 = arg0;
        class17.field337 = 0;
        class232.field3936 = false;
        class73.field1280 = arg1;
        int var4 = -74 % ((arg2 - 39) / 55);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BI)Z")
    public final boolean method194(byte arg0, int arg1) {
        if (arg0 >= -115) {
            return true;
        } else {
            field510++;
            return this.field507[arg1].field4262;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(B)V")
    public static void method195(byte arg0) {
        if (arg0 <= -76) {
            field516 = null;
            field518 = null;
            field506 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)[B")
    public static final byte[] method196(int arg0, int arg1) {
        field509++;
        class255 var2 = (class255) class168.field2724.method252((long) arg1, false);
        if (var2 == null) {
            Random var3 = new Random((long) arg1);
            byte[] var4 = new byte[512];
            for (int var5 = 0; var5 < 255; var5++) {
                var4[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class32.method205(var7, (byte) 90, var3);
                byte var9 = var4[var8];
                var4[var8] = var4[var7];
                var4[var7] = var4[511 - var6] = var9;
            }
            var2 = new class255(var4);
            class168.field2724.method247(var2, (long) arg1, -112);
        }
        if (arg0 <= 98) {
            field516 = null;
        }
        return var2.field4318;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIII)Luk;")
    public static final class87 method197(byte arg0, int arg1, int arg2, int arg3) {
        field517++;
        int var4 = arg1 | arg2 << 8;
        if (arg0 != -79) {
            field516 = null;
        }
        class87 var5 = (class87) class90.field1496.method252((long) var4 << 16, false);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class32.field528.method1119(-2, class32.field528.method1138(arg0 ^ 0x4E, var4));
        if (var6 == null) {
            int var8 = arg3 + 65536 << 8 | arg1;
            class87 var9 = (class87) class90.field1496.method252((long) var8 << 16, false);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class32.field528.method1119(-2, class32.field528.method1138(-1, var8));
            if (var10 == null) {
                int var12 = arg1 | 0xFFFF00;
                class87 var13 = (class87) class90.field1496.method252((long) var12 << 16, false);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class32.field528.method1119(-2, class32.field528.method1138(-1, var12));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class87 var15 = class127.method940((byte) -115, var14);
                    var15.field1443 = arg1;
                    class90.field1496.method247(var15, (long) var12 << 16, arg0 - 28);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class87 var11 = class127.method940((byte) -115, var10);
                var11.field1443 = arg1;
                class90.field1496.method247(var11, (long) var8 << 16, arg0 + 164);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class87 var7 = class127.method940((byte) -115, var6);
            var7.field1443 = arg1;
            class90.field1496.method247(var7, (long) var4 << 16, 112);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static final void method198(boolean arg0) {
        field512++;
        if (class260.field4362) {
            return;
        }
        if (class46.field814) {
            class265.field4432 = (float) ((int) class265.field4432 - 65 & 0xFFFFFF80);
        } else {
            class250.field4237 += (-24.0F - class250.field4237) / 2.0F;
        }
        class260.field4362 = true;
        class271.field4520 = arg0;
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(Laj;Laj;IZ)V")
    public class31(class151 arg0, class151 arg1, int arg2, boolean arg3) {
        class49 var5 = new class49();
        int var6 = arg0.method1132(16777215, arg2);
        this.field507 = new class252[var6];
        int[] var7 = arg0.method1143(-18696, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            class267 var9 = null;
            byte[] var10 = arg0.method1149(arg2, (byte) 109, var7[var8]);
            int var11 = (var10[0] & 0xFF) << 8 | var10[1] & 0xFF;
            for (class267 var12 = (class267) var5.method309(0); var12 != null; var12 = (class267) var5.method312((byte) 82)) {
                if (var12.field4447 == var11) {
                    var9 = var12;
                    break;
                }
            }
            if (var9 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1148(false, 0, var11);
                } else {
                    var13 = arg1.method1148(false, var11, 0);
                }
                var9 = new class267(var11, var13);
                var5.method311(99, var9);
            }
            this.field507[var7[var8]] = new class252(var10, var9);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method199(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class272.field4554 == 0) {
            int var7 = class293.field4825;
            int var8 = class311.field5014;
            int var9 = class116.field1977;
            int var10 = class40.field605;
            int var11 = (var9 - var7) * (arg0 - arg3) / arg2 + var7;
            int var12 = (arg4 - arg1) * (var10 - var8) / arg6 + var8;
            if (class302.field4918 && (class30.field497 & 0x40) != 0) {
                class207 var13 = class107.method798(class173.field2785, class42.field646, (byte) -71);
                if (var13 == null) {
                    class118.method895(108);
                } else {
                    class289.method2009(var11, " ->", true, 0L, var12, class169.field2741, class238.field4011, (short) 14);
                }
            } else {
                class1.field70++;
                if (class43.field659 == 1) {
                    class289.method2009(var11, "", true, 0L, var12, -1, class132.field2178, (short) 18);
                }
                class289.method2009(var11, "", true, 0L, var12, -1, class13.field271, (short) 48);
            }
        }
        if (arg5 <= 9) {
            method195((byte) -19);
        }
        field515++;
        long var14 = -1L;
        for (int var16 = 0; var16 < class218.field3681; var16++) {
            long var17 = class105.field1733[var16];
            int var19 = (int) var17 >> 7 & 0x7F;
            int var20 = (int) var17 & 0x7F;
            int var21 = Integer.MAX_VALUE & (int) (var17 >>> 32);
            int var22 = ((int) var17 & 0x707EF83E) >> 29;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class3.method29(class182.field2898, var20, var19, var17)) {
                    class1 var23 = class110.method827(var21, (byte) -93);
                    if (var23.field34 != null) {
                        var23 = var23.method22((byte) 117);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class272.field4554 == 1) {
                        class182.field2908++;
                        class289.method2009(var20, class46.field813 + " -> <col=00ffff>" + var23.field81, true, var17, var19, class135.field2222, class245.field4116, (short) 45);
                    } else if (class302.field4918) {
                        class86 var24 = class91.field1515 == -1 ? null : class69.method471(class91.field1515, (byte) 28);
                        if ((class30.field497 & 0x4) != 0 && (var24 == null || var23.method23(class91.field1515, -129, var24.field1423) != var24.field1423)) {
                            class283.field4692++;
                            class289.method2009(var20, class93.field1517 + " -> <col=00ffff>" + var23.field81, true, var17, var19, class169.field2741, class238.field4011, (short) 9);
                        }
                    } else {
                        class238.field3998++;
                        String[] var25 = var23.field67;
                        if (class73.field1282) {
                            var25 = class248.method1760((byte) 119, var25);
                        }
                        if (var25 != null) {
                            for (int var26 = 4; var26 >= 0; var26--) {
                                if (var25[var26] != null) {
                                    int var27 = -1;
                                    short var28 = 0;
                                    class80.field1347++;
                                    if (var26 == 0) {
                                        var28 = 12;
                                    }
                                    if (var26 == 1) {
                                        var28 = 38;
                                    }
                                    if (var23.field38 == var26) {
                                        var27 = var23.field29;
                                    }
                                    if (var23.field73 == var26) {
                                        var27 = var23.field44;
                                    }
                                    if (var26 == 2) {
                                        var28 = 10;
                                    }
                                    if (var26 == 3) {
                                        var28 = 34;
                                    }
                                    if (var26 == 4) {
                                        var28 = 1009;
                                    }
                                    class289.method2009(var20, "<col=00ffff>" + var23.field81, true, var17, var19, var27, var25[var26], var28);
                                }
                            }
                        }
                        class289.method2009(var20, "<col=00ffff>" + var23.field81, true, (long) var23.field50, var19, class256.field4327, class113.field1925, (short) 1006);
                    }
                }
                if (var22 == 1) {
                    class307 var29 = class57.field1002[var21];
                    if ((var29.field4960.field915 & 0x1) == 0 && (var29.field715 & 0x7F) == 0 && (var29.field771 & 0x7F) == 0 || (var29.field4960.field915 & 0x1) == 1 && (var29.field715 & 0x7F) == 64 && (var29.field771 & 0x7F) == 64) {
                        int var30 = var29.field771 - (var29.field4960.field915 << 6);
                        int var31 = var29.field4960.field915 << 7;
                        int var32 = var29.field715 - (var29.field4960.field915 << 6);
                        if (class314.field5063) {
                            for (int var33 = 0; var33 < class303.field4932; var33++) {
                                class307 var39 = class57.field1002[class186.field2972[var33]];
                                if (var39 != null && !var39.field728 && var29 != var39 && var39.field795) {
                                    int var40 = var39.field715 - (var39.field4960.field915 << 6);
                                    int var41 = var39.field4960.field915 << 7;
                                    int var42 = var39.field771 - (var39.field4960.field915 << 6);
                                    if (class253.method1835(var30, var40, var31, var41, var31, var42, var41, (byte) -61, var32)) {
                                        class219.method1557(class186.field2972[var33], var19, var20, var39.field4960, (byte) -75);
                                        var39.field728 = true;
                                    }
                                }
                            }
                            for (int var34 = 0; var34 < class154.field2553; var34++) {
                                class123 var35 = class15.field300[class162.field2627[var34]];
                                if (var35 != null && !var35.field728 && var35.field795) {
                                    int var36 = var35.field715 - (var35.method294((byte) -103) << 6);
                                    int var37 = var35.field771 - (var35.method294((byte) -111) << 6);
                                    int var38 = var35.method294((byte) -128) << 7;
                                    if (class253.method1835(var30, var36, var31, var38, var31, var37, var38, (byte) -101, var32)) {
                                        class313.method2119(var35, var19, var20, class162.field2627[var34], (byte) -117);
                                        var35.field728 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var29.field728) {
                        continue;
                    }
                    class219.method1557(var21, var19, var20, var29.field4960, (byte) 114);
                    var29.field728 = true;
                }
                if (var22 == 0) {
                    class123 var43 = class15.field300[var21];
                    if ((var43.field715 & 0x7F) == 64 && (var43.field771 & 0x7F) == 64) {
                        int var44 = var43.field715 - (var43.method294((byte) -119) << 6);
                        int var45 = var43.field771 - (var43.method294((byte) -118) << 6);
                        int var46 = var43.method294((byte) -127) << 7;
                        if (class314.field5063) {
                            for (int var47 = 0; var47 < class303.field4932; var47++) {
                                class307 var53 = class57.field1002[class186.field2972[var47]];
                                if (var53 != null && !var53.field728 && var53.field795) {
                                    int var54 = var53.field715 - (var53.field4960.field915 << 6);
                                    int var55 = var53.field771 - (var53.field4960.field915 << 6);
                                    int var56 = var53.field4960.field915 << 7;
                                    if (class253.method1835(var45, var54, var46, var56, var46, var55, var56, (byte) 97, var44)) {
                                        class219.method1557(class186.field2972[var47], var19, var20, var53.field4960, (byte) 111);
                                        var53.field728 = true;
                                    }
                                }
                            }
                            for (int var48 = 0; var48 < class154.field2553; var48++) {
                                class123 var49 = class15.field300[class162.field2627[var48]];
                                if (var49 != null && !var49.field728 && var43 != var49 && var49.field795) {
                                    int var50 = var49.field715 - (var49.method294((byte) -111) << 6);
                                    int var51 = var49.field771 - (var49.method294((byte) -110) << 6);
                                    int var52 = var49.method294((byte) -121) << 7;
                                    if (class253.method1835(var45, var50, var46, var52, var46, var51, var52, (byte) 103, var44)) {
                                        class313.method2119(var49, var19, var20, class162.field2627[var48], (byte) -117);
                                        var49.field728 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (var43.field728) {
                        continue;
                    }
                    class313.method2119(var43, var19, var20, var21, (byte) -117);
                    var43.field728 = true;
                }
                if (var22 == 3) {
                    class49 var57 = class125.field2101[class182.field2898][var20][var19];
                    if (var57 != null) {
                        for (class61 var58 = (class61) var57.method319(75); var58 != null; var58 = (class61) var57.method318(124)) {
                            int var59 = var58.field1050.field2193;
                            class71 var60 = class13.method75(false, var59);
                            if (class272.field4554 == 1) {
                                class289.method2009(var20, class46.field813 + " -> <col=ff9040>" + var60.field1209, true, (long) var59, var19, class135.field2222, class245.field4116, (short) 59);
                                class76.field1297++;
                            } else if (class302.field4918) {
                                class86 var65 = class91.field1515 == -1 ? null : class69.method471(class91.field1515, (byte) 28);
                                if ((class30.field497 & 0x1) != 0 && (var65 == null || var60.method506(var65.field1423, class91.field1515, 11773) != var65.field1423)) {
                                    class232.field3937++;
                                    class289.method2009(var20, class93.field1517 + " -> <col=ff9040>" + var60.field1209, true, (long) var59, var19, class169.field2741, class238.field4011, (short) 16);
                                }
                            } else {
                                class50.field846++;
                                String[] var61 = var60.field1240;
                                if (class73.field1282) {
                                    var61 = class248.method1760((byte) 124, var61);
                                }
                                for (int var62 = 4; var62 >= 0; var62--) {
                                    if (var61 != null && var61[var62] != null) {
                                        class243.field4079++;
                                        int var63 = -1;
                                        byte var64 = 0;
                                        if (var60.field1219 == var62) {
                                            var63 = var60.field1201;
                                        }
                                        if (var60.field1184 == var62) {
                                            var63 = var60.field1180;
                                        }
                                        if (var62 == 0) {
                                            var64 = 21;
                                        }
                                        if (var62 == 1) {
                                            var64 = 8;
                                        }
                                        if (var62 == 2) {
                                            var64 = 36;
                                        }
                                        if (var62 == 3) {
                                            var64 = 57;
                                        }
                                        if (var62 == 4) {
                                            var64 = 47;
                                        }
                                        class289.method2009(var20, "<col=ff9040>" + var60.field1209, true, (long) var59, var19, var63, var61[var62], var64);
                                    }
                                }
                                class289.method2009(var20, "<col=ff9040>" + var60.field1209, true, (long) var59, var19, class256.field4327, class113.field1925, (short) 1005);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IB)Z")
    public final boolean method200(int arg0, byte arg1) {
        if (arg1 > -42) {
            field519 = 62;
        }
        field513++;
        return this.field507[arg0].field4269;
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BLaj;)V")
    public static final void method201(byte arg0, class151 arg1) {
        int var2 = 30 / ((-arg0 - 58) / 63);
        class23.field419 = arg1;
        field511++;
    }
}
