import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class93 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "[Ltl;")
    public static class59[] field1440 = new class59[500];

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "Ltl;")
    public static class59 field1442 = class85.method639("Lade)3)3)3", 9588);

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public static int field1447 = 0;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static volatile int field1449 = 0;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field1444 = -1;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "F")
    public static float field1438;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "I")
    public static int field1441;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "[Loj;")
    public static class260[] field1448;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILic;)V", line = 8)
    public static final void method677(int arg0, class20 arg1) {
        if (arg0 != -16777) {
            method678(-76, -83, -74, false, (class105) null, 51, -3);
        }
        field1441++;
        class303.field5159 = arg1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIZLwk;II)V", line = 27)
    public static final void method678(int arg0, int arg1, int arg2, boolean arg3, class105 arg4, int arg5, int arg6) {
        if (!arg3) {
            method677(89, (class20) null);
        }
        field1446++;
        class169.method1193(arg5, arg2, arg1, (byte) -110, arg4.field1769, arg4.field1774, arg0, arg6);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 52)
    public static final void method679(int arg0) {
        if (arg0 != -1) {
            method681(57);
        }
        class50.field763.method1484(false);
        field1445++;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)I", line = 68)
    public static int method680(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 79)
    public static void method681(int arg0) {
        field1448 = null;
        field1440 = null;
        field1442 = null;
        int var1 = -31 / ((arg0 + 19) / 53);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[[[Lcd;BIZ)Z", line = 95)
    public static final boolean method682(int arg0, int arg1, class245[][][] arg2, byte arg3, int arg4, boolean arg5) {
        byte var6 = arg5 ? 1 : (byte) (class178.field2914 & 0xFF);
        field1439++;
        if (class213.field3500[class247.field4119][arg0][arg1] == var6) {
            return false;
        } else if ((class308.field5219[class247.field4119][arg0][arg1] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class248.field4126[var7] = arg0;
            int var31 = var7 + 1;
            class274.field4721[var7] = arg1;
            int var8 = 0;
            class213.field3500[class247.field4119][arg0][arg1] = var6;
            while (var31 != var8) {
                int var9 = class248.field4126[var8] >> 16 & 0xFF;
                int var10 = class248.field4126[var8] >> 24 & 0xFF;
                int var11 = class248.field4126[var8] & 0xFFFF;
                int var12 = class274.field4721[var8] & 0xFFFF;
                int var13 = (class274.field4721[var8] & 0xFF4E62) >> 16;
                var8 = var8 + 1 & 0xFFF;
                boolean var14 = false;
                boolean var15 = false;
                if ((class308.field5219[class247.field4119][var11][var12] & 0x4) == 0) {
                    var14 = true;
                }
                label245: for (int var16 = class247.field4119 + 1; var16 <= 3; var16++) {
                    if ((class308.field5219[var16][var11][var12] & 0x8) == 0) {
                        if (var14 && arg2[var16][var11][var12] != null) {
                            if (arg2[var16][var11][var12].field4098 != null) {
                                int var17 = class253.method1760(false, var9);
                                if (arg2[var16][var11][var12].field4098.field3331 == var17 || arg2[var16][var11][var12].field4098.field3333 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class253.method1760(false, var10);
                                    if (arg2[var16][var11][var12].field4098.field3331 == var18 || arg2[var16][var11][var12].field4098.field3333 == var18) {
                                        continue;
                                    }
                                }
                                if (var13 != 0) {
                                    int var19 = class253.method1760(false, var13);
                                    if (arg2[var16][var11][var12].field4098.field3331 == var19 || arg2[var16][var11][var12].field4098.field3333 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var11][var12].field4107 != null) {
                                for (int var20 = 0; var20 < arg2[var16][var11][var12].field4092; var20++) {
                                    int var21 = (int) (arg2[var16][var11][var12].field4107[var20].field2673 >> 20 & 0x3L);
                                    int var22 = (int) (arg2[var16][var11][var12].field4107[var20].field2673 >> 14 & 0x3FL);
                                    if (var22 == 21) {
                                        var22 = 19;
                                    }
                                    int var23 = var21 << 6 | var22;
                                    if (var9 == var23 || var10 != 0 && var10 == var23 || var13 != 0 && var13 == var23) {
                                        continue label245;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class245 var24 = arg2[var16][var11][var12];
                        if (var24 != null && var24.field4092 > 0) {
                            for (int var25 = 0; var25 < var24.field4092; var25++) {
                                class165 var26 = var24.field4107[var25];
                                if (var26.field2682 != var26.field2681 || var26.field2676 != var26.field2670) {
                                    for (int var27 = var26.field2682; var27 <= var26.field2681; var27++) {
                                        for (int var28 = var26.field2670; var28 <= var26.field2676; var28++) {
                                            class213.field3500[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class213.field3500[var16][var11][var12] = var6;
                    }
                }
                if (var15) {
                    int var29 = var12 << 7;
                    if (class97.field1558[class247.field4119 + 1][var11][var12] > class60.field938[arg4]) {
                        class60.field938[arg4] = class97.field1558[class247.field4119 + 1][var11][var12];
                    }
                    int var30 = var11 << 7;
                    if (var30 < class180.field2959[arg4]) {
                        class180.field2959[arg4] = var30;
                    } else if (class311.field5276[arg4] < var30) {
                        class311.field5276[arg4] = var30;
                    }
                    if (class232.field3824[arg4] > var29) {
                        class232.field3824[arg4] = var29;
                    } else if (var29 > class103.field1705[arg4]) {
                        class103.field1705[arg4] = var29;
                    }
                }
                if (!var14) {
                    if (var11 >= 1 && class213.field3500[class247.field4119][var11 - 1][var12] != var6) {
                        class248.field4126[var31] = class239.method1677(class239.method1677(var11 - 1, 1179648), -754974720);
                        class274.field4721[var31] = class239.method1677(1245184, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class213.field3500[class247.field4119][var11 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var11 - 1) >= 0 && class213.field3500[class247.field4119][var11 - 1][var12] != var6 && (class308.field5219[class247.field4119][var11][var12] & 0x4) == 0 && (class308.field5219[class247.field4119][var11 - 1][var12 - 1] & 0x4) == 0) {
                            class248.field4126[var31] = class239.method1677(1375731712, class239.method1677(var11 - 1, 1179648));
                            class274.field4721[var31] = class239.method1677(var12, 1245184);
                            class213.field3500[class247.field4119][var11 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class213.field3500[class247.field4119][var11][var12] != var6) {
                            class248.field4126[var31] = class239.method1677(318767104, class239.method1677(var11, 5373952));
                            class274.field4721[var31] = class239.method1677(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class213.field3500[class247.field4119][var11][var12] = var6;
                        }
                        if (var11 + 1 < 104 && class213.field3500[class247.field4119][var11 + 1][var12] != var6 && (class308.field5219[class247.field4119][var11][var12] & 0x4) == 0 && (class308.field5219[class247.field4119][var11 + 1][var12 - 1] & 0x4) == 0) {
                            class248.field4126[var31] = class239.method1677(class239.method1677(5373952, var11 + 1), -1845493760);
                            class274.field4721[var31] = class239.method1677(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class213.field3500[class247.field4119][var11 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var11 + 1) < 104 && class213.field3500[class247.field4119][var11 + 1][var12] != var6) {
                        class248.field4126[var31] = class239.method1677(1392508928, class239.method1677(9568256, var11 + 1));
                        class274.field4721[var31] = class239.method1677(9633792, var12);
                        var31 = var31 + 1 & 0xFFF;
                        class213.field3500[class247.field4119][var11 + 1][var12] = var6;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if ((var11 - 1) >= 0 && class213.field3500[class247.field4119][var11 - 1][var12] != var6 && (class308.field5219[class247.field4119][var11][var12] & 0x4) == 0 && (class308.field5219[class247.field4119][var11 - 1][var12 + 1] & 0x4) == 0) {
                            class248.field4126[var31] = class239.method1677(class239.method1677(var11 - 1, 13762560), 301989888);
                            class274.field4721[var31] = class239.method1677(var12, 13828096);
                            class213.field3500[class247.field4119][var11 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class213.field3500[class247.field4119][var11][var12] != var6) {
                            class248.field4126[var31] = class239.method1677(class239.method1677(13762560, var11), -1828716544);
                            class274.field4721[var31] = class239.method1677(var12, 13828096);
                            class213.field3500[class247.field4119][var11][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if ((var11 + 1) < 104 && class213.field3500[class247.field4119][var11 + 1][var12] != var6 && (class308.field5219[class247.field4119][var11][var12] & 0x4) == 0 && (class308.field5219[class247.field4119][var11 + 1][var12 + 1] & 0x4) == 0) {
                            class248.field4126[var31] = class239.method1677(class239.method1677(9568256, var11 + 1), -771751936);
                            class274.field4721[var31] = class239.method1677(var12, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class213.field3500[class247.field4119][var11 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class60.field938[arg4] != -1000000) {
                class60.field938[arg4] += 10;
                class180.field2959[arg4] -= 50;
                class311.field5276[arg4] += 50;
                class103.field1705[arg4] += 50;
                class232.field3824[arg4] -= 50;
            }
            if (arg3 <= 68) {
                field1447 = 30;
            }
            return true;
        }
    }
}
