import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class217 {

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public static int field3013 = 0;

    @OriginalMember(owner = "client!ft", name = "j", descriptor = "[I")
    public static int[] field3017 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
    public static int field3012 = 0;

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "Lud;")
    public static class63 field3010 = new class63("WTWIP", 3);

    @OriginalMember(owner = "client!ft", name = "k", descriptor = "Lvr;")
    public static class306 field3018 = new class306();

    @OriginalMember(owner = "client!ft", name = "l", descriptor = "[I")
    public static int[] field3019 = new int[100];

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field3011;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "Ljb;")
    public static class499 field3009;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(II)I", line = 3)
    public static final int method1471(int arg0, int arg1) {
        field3016++;
        if (arg0 != 127) {
            method1476((byte) -16, 36, false);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BZII[[[Ldr;I)Z", line = 15)
    public static final boolean method1472(byte arg0, boolean arg1, int arg2, int arg3, class420[][][] arg4, int arg5) {
        field3011++;
        byte var6 = arg1 ? 1 : (byte) (class527.field7787 & 0xFF);
        if (class307.field4504[class195.field2770][arg3][arg5] == var6) {
            return false;
        } else if ((class129.field1816[class195.field2770][arg3][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class344.field5393[var7] = arg3;
            if (arg0 > -106) {
                return true;
            }
            int var8 = 0;
            int var35 = var7 + 1;
            class313.field4792[var7] = arg5;
            class307.field4504[class195.field2770][arg3][arg5] = var6;
            while (var35 != var8) {
                int var9 = class344.field5393[var8] & 0xFFFF;
                int var10 = (class344.field5393[var8] & 0xFF3704) >> 16;
                int var11 = class344.field5393[var8] >> 24 & 0xFF;
                int var12 = class313.field4792[var8] & 0xFFFF;
                int var13 = (class313.field4792[var8] & 0xFF3C66) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                if ((class129.field1816[class195.field2770][var9][var12] & 0x4) == 0) {
                    var14 = true;
                }
                boolean var15 = false;
                label237: for (int var16 = class195.field2770 + 1; var16 <= 3; var16++) {
                    if ((class129.field1816[var16][var9][var12] & 0x8) == 0) {
                        if (var14 && arg4[var16][var9][var12] != null) {
                            if (arg4[var16][var9][var12].field6261 != null) {
                                int var20 = class413.method2507(97, var10);
                                if (arg4[var16][var9][var12].field6261.field967 == var20 || arg4[var16][var9][var12].field6271 != null && arg4[var16][var9][var12].field6271.field967 == var20) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var21 = class413.method2507(118, var11);
                                    if (arg4[var16][var9][var12].field6261.field967 == var21 || arg4[var16][var9][var12].field6271 != null && arg4[var16][var9][var12].field6271.field967 == var21) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var22 = class413.method2507(75, var13);
                                    if (arg4[var16][var9][var12].field6261.field967 == var22 || arg4[var16][var9][var12].field6271 != null && arg4[var16][var9][var12].field6271.field967 == var22) {
                                        continue;
                                    }
                                }
                            }
                            class420 var23 = arg4[var16][var9][var12];
                            if (var23.field6273 != null) {
                                for (class115 var24 = var23.field6273; var24 != null; var24 = var24.field1600) {
                                    class153 var25 = var24.field1594;
                                    if (var25 instanceof class196) {
                                        class196 var26 = (class196) var25;
                                        int var27 = var26.method63((byte) 63);
                                        int var28 = var26.method66(-7234);
                                        if (var27 == 21) {
                                            var27 = 19;
                                        }
                                        int var29 = var28 << 6 | var27;
                                        if (var10 == var29 || var11 != 0 && var11 == var29 || var13 != 0 && var13 == var29) {
                                            continue label237;
                                        }
                                    }
                                }
                            }
                        }
                        class420 var30 = arg4[var16][var9][var12];
                        if (var30 != null && var30.field6273 != null) {
                            for (class115 var31 = var30.field6273; var31 != null; var31 = var31.field1600) {
                                class153 var32 = var31.field1594;
                                if (var32.field2214 != var32.field2208 || var32.field2216 != var32.field2213) {
                                    for (int var33 = var32.field2208; var33 <= var32.field2214; var33++) {
                                        for (int var34 = var32.field2216; var34 <= var32.field2213; var34++) {
                                            class307.field4504[var16][var33][var34] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class307.field4504[var16][var9][var12] = var6;
                    }
                }
                if (var15) {
                    int var17 = class455.field6683[class195.field2770 + 1].method849(var9, var12);
                    if (var17 > class66.field915[arg2]) {
                        class66.field915[arg2] = var17;
                    }
                    int var18 = var9 << 7;
                    if (var18 < class415.field6220[arg2]) {
                        class415.field6220[arg2] = var18;
                    } else if (class205.field2898[arg2] < var18) {
                        class205.field2898[arg2] = var18;
                    }
                    int var19 = var12 << 7;
                    if (var19 < class34.field538[arg2]) {
                        class34.field538[arg2] = var19;
                    } else if (var19 > class344.field5392[arg2]) {
                        class344.field5392[arg2] = var19;
                    }
                }
                if (!var14) {
                    if (var9 >= 1 && class307.field4504[class195.field2770][var9 - 1][var12] != var6) {
                        class344.field5393[var35] = class286.method1860(-754974720, class286.method1860(var9 - 1, 1179648));
                        class313.field4792[var35] = class286.method1860(var12, 1245184);
                        var35 = var35 + 1 & 0xFFF;
                        class307.field4504[class195.field2770][var9 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < class485.field7122) {
                        if (var9 - 1 >= 0 && class307.field4504[class195.field2770][var9 - 1][var12] != var6 && (class129.field1816[class195.field2770][var9][var12] & 0x4) == 0 && (class129.field1816[class195.field2770][var9 - 1][var12 - 1] & 0x4) == 0) {
                            class344.field5393[var35] = class286.method1860(1375731712, class286.method1860(var9 - 1, 1179648));
                            class313.field4792[var35] = class286.method1860(var12, 1245184);
                            var35 = var35 + 1 & 0xFFF;
                            class307.field4504[class195.field2770][var9 - 1][var12] = var6;
                        }
                        if (class307.field4504[class195.field2770][var9][var12] != var6) {
                            class344.field5393[var35] = class286.method1860(class286.method1860(5373952, var9), 318767104);
                            class313.field4792[var35] = class286.method1860(var12, 5439488);
                            class307.field4504[class195.field2770][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if (class96.field1403 > var9 + 1 && class307.field4504[class195.field2770][var9 + 1][var12] != var6 && (class129.field1816[class195.field2770][var9][var12] & 0x4) == 0 && (class129.field1816[class195.field2770][var9 + 1][var12 - 1] & 0x4) == 0) {
                            class344.field5393[var35] = class286.method1860(class286.method1860(5373952, var9 + 1), -1845493760);
                            class313.field4792[var35] = class286.method1860(5439488, var12);
                            class307.field4504[class195.field2770][var9 + 1][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                    }
                    var12--;
                    if (class96.field1403 > var9 + 1 && class307.field4504[class195.field2770][var9 + 1][var12] != var6) {
                        class344.field5393[var35] = class286.method1860(class286.method1860(var9 + 1, 9568256), 1392508928);
                        class313.field4792[var35] = class286.method1860(var12, 9633792);
                        var35 = var35 + 1 & 0xFFF;
                        class307.field4504[class195.field2770][var9 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var9 - 1) >= 0 && class307.field4504[class195.field2770][var9 - 1][var12] != var6 && (class129.field1816[class195.field2770][var9][var12] & 0x4) == 0 && (class129.field1816[class195.field2770][var9 - 1][var12 + 1] & 0x4) == 0) {
                            class344.field5393[var35] = class286.method1860(301989888, class286.method1860(13762560, var9 - 1));
                            class313.field4792[var35] = class286.method1860(13828096, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class307.field4504[class195.field2770][var9 - 1][var12] = var6;
                        }
                        if (class307.field4504[class195.field2770][var9][var12] != var6) {
                            class344.field5393[var35] = class286.method1860(class286.method1860(var9, 13762560), -1828716544);
                            class313.field4792[var35] = class286.method1860(var12, 13828096);
                            class307.field4504[class195.field2770][var9][var12] = var6;
                            var35 = var35 + 1 & 0xFFF;
                        }
                        if ((var9 + 1) < class96.field1403 && class307.field4504[class195.field2770][var9 + 1][var12] != var6 && (class129.field1816[class195.field2770][var9][var12] & 0x4) == 0 && (class129.field1816[class195.field2770][var9 + 1][var12 + 1] & 0x4) == 0) {
                            class344.field5393[var35] = class286.method1860(-771751936, class286.method1860(9568256, var9 + 1));
                            class313.field4792[var35] = class286.method1860(9633792, var12);
                            var35 = var35 + 1 & 0xFFF;
                            class307.field4504[class195.field2770][var9 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class66.field915[arg2] != -1000000) {
                class66.field915[arg2] += 10;
                class415.field6220[arg2] -= 50;
                class205.field2898[arg2] += 50;
                class344.field5392[arg2] += 50;
                class34.field538[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)V", line = 336)
    public static void method1473(byte arg0) {
        field3017 = null;
        int var1 = 43 % ((6 - arg0) / 56);
        field3010 = null;
        field3018 = null;
        field3019 = null;
        field3009 = null;
    }

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "(B)V", line = 349)
    public static final void method1474(byte arg0) {
        field3014++;
        if (class37.field598) {
            return;
        }
        class41.method324(class492.field7181, arg0 ^ 0xFFFFFFC7);
        if (class483.field7028 != null) {
            class41.method324(class483.field7028, -109);
        }
        if (arg0 == 69) {
            class37.field598 = true;
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "([JZ[Ljava/lang/Object;)V", line = 386)
    public static final void method1475(long[] arg0, boolean arg1, Object[] arg2) {
        if (arg1) {
            field3008++;
            class265.method1703(arg0, arg0.length - 1, 5121, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(BIZ)V", line = 398)
    public static final void method1476(byte arg0, int arg1, boolean arg2) {
        field3015++;
        class410 var3 = class261.method1684(arg1, 25, arg2);
        if (arg0 <= -7 && var3 != null) {
            for (int var4 = 0; var4 < var3.field6169.length; var4++) {
                var3.field6169[var4] = -1;
                var3.field6166[var4] = 0;
            }
        }
    }
}
