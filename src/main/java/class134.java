import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class134 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "Z")
    public static boolean field2036 = true;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field2039 = 500;

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2041 = null;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "[[Lfn;")
    public static class58[][] field2034;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IB[[[Lvb;ZII)Z", line = 10)
    public static final boolean method1032(int arg0, byte arg1, class79[][][] arg2, boolean arg3, int arg4, int arg5) {
        field2042++;
        if (arg1 != -89) {
            field2034 = (class58[][]) ((class58[][]) null);
        }
        byte var6 = arg3 ? 1 : (byte) (class211.field3240 & 0xFF);
        if (class2.field25[class265.field4112][arg4][arg5] == var6) {
            return false;
        } else if ((class324.field5005[class265.field4112][arg4][arg5] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            int var8 = 0;
            class254.field3868[var7] = arg4;
            int var31 = var7 + 1;
            class15.field202[var7] = arg5;
            class2.field25[class265.field4112][arg4][arg5] = var6;
            while (var31 != var8) {
                int var9 = (class254.field3868[var8] & 0xFF81B0) >> 16;
                int var10 = class254.field3868[var8] >> 24 & 0xFF;
                int var11 = class254.field3868[var8] & 0xFFFF;
                int var12 = class15.field202[var8] & 0xFFFF;
                boolean var13 = false;
                int var14 = class15.field202[var8] >> 16 & 0xFF;
                boolean var15 = false;
                if ((class324.field5005[class265.field4112][var11][var12] & 0x4) == 0) {
                    var15 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                label237: for (int var16 = class265.field4112 + 1; var16 <= 3; var16++) {
                    if ((class324.field5005[var16][var11][var12] & 0x8) == 0) {
                        if (var15 && arg2[var16][var11][var12] != null) {
                            if (arg2[var16][var11][var12].field1161 != null) {
                                int var17 = class174.method1306(-2, var9);
                                if (arg2[var16][var11][var12].field1161.field503 == var17 || arg2[var16][var11][var12].field1161.field513 == var17) {
                                    continue;
                                }
                                if (var10 != 0) {
                                    int var18 = class174.method1306(-2, var10);
                                    if (arg2[var16][var11][var12].field1161.field503 == var18 || arg2[var16][var11][var12].field1161.field513 == var18) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var19 = class174.method1306(-2, var14);
                                    if (arg2[var16][var11][var12].field1161.field503 == var19 || arg2[var16][var11][var12].field1161.field513 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg2[var16][var11][var12].field1157 != null) {
                                for (int var20 = 0; var20 < arg2[var16][var11][var12].field1169; var20++) {
                                    int var21 = (int) (arg2[var16][var11][var12].field1157[var20].field3482 >> 14 & 0x3FL);
                                    int var22 = (int) (arg2[var16][var11][var12].field1157[var20].field3482 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var21 | var22 << 6;
                                    if (var9 == var23 || var10 != 0 && var10 == var23 || var14 != 0 && var14 == var23) {
                                        continue label237;
                                    }
                                }
                            }
                        }
                        var13 = true;
                        class79 var24 = arg2[var16][var11][var12];
                        if (var24 != null && var24.field1169 > 0) {
                            for (int var25 = 0; var25 < var24.field1169; var25++) {
                                class228 var26 = var24.field1157[var25];
                                if (var26.field3474 != var26.field3472 || var26.field3484 != var26.field3475) {
                                    for (int var27 = var26.field3472; var27 <= var26.field3474; var27++) {
                                        for (int var28 = var26.field3475; var28 <= var26.field3484; var28++) {
                                            class2.field25[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class2.field25[var16][var11][var12] = var6;
                    }
                }
                if (var13) {
                    if (class300.field4618[arg0] < class203.field3111[class265.field4112 + 1][var11][var12]) {
                        class300.field4618[arg0] = class203.field3111[class265.field4112 + 1][var11][var12];
                    }
                    int var29 = var11 << 7;
                    if (var29 < class27.field294[arg0]) {
                        class27.field294[arg0] = var29;
                    } else if (class201.field3097[arg0] < var29) {
                        class201.field3097[arg0] = var29;
                    }
                    int var30 = var12 << 7;
                    if (class242.field3684[arg0] > var30) {
                        class242.field3684[arg0] = var30;
                    } else if (class13.field174[arg0] < var30) {
                        class13.field174[arg0] = var30;
                    }
                }
                if (!var15) {
                    if (var11 >= 1 && class2.field25[class265.field4112][var11 - 1][var12] != var6) {
                        class254.field3868[var31] = class261.method1835(-754974720, class261.method1835(1179648, var11 - 1));
                        class15.field202[var31] = class261.method1835(var12, 1245184);
                        var31 = var31 + 1 & 0xFFF;
                        class2.field25[class265.field4112][var11 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if (var11 - 1 >= 0 && class2.field25[class265.field4112][var11 - 1][var12] != var6 && (class324.field5005[class265.field4112][var11][var12] & 0x4) == 0 && (class324.field5005[class265.field4112][var11 - 1][var12 - 1] & 0x4) == 0) {
                            class254.field3868[var31] = class261.method1835(class261.method1835(var11 - 1, 1179648), 1375731712);
                            class15.field202[var31] = class261.method1835(var12, 1245184);
                            var31 = var31 + 1 & 0xFFF;
                            class2.field25[class265.field4112][var11 - 1][var12] = var6;
                        }
                        if (class2.field25[class265.field4112][var11][var12] != var6) {
                            class254.field3868[var31] = class261.method1835(318767104, class261.method1835(var11, 5373952));
                            class15.field202[var31] = class261.method1835(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class2.field25[class265.field4112][var11][var12] = var6;
                        }
                        if (var11 + 1 < 104 && class2.field25[class265.field4112][var11 + 1][var12] != var6 && (class324.field5005[class265.field4112][var11][var12] & 0x4) == 0 && (class324.field5005[class265.field4112][var11 + 1][var12 - 1] & 0x4) == 0) {
                            class254.field3868[var31] = class261.method1835(-1845493760, class261.method1835(var11 + 1, 5373952));
                            class15.field202[var31] = class261.method1835(var12, 5439488);
                            var31 = var31 + 1 & 0xFFF;
                            class2.field25[class265.field4112][var11 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if ((var11 + 1) < 104 && class2.field25[class265.field4112][var11 + 1][var12] != var6) {
                        class254.field3868[var31] = class261.method1835(1392508928, class261.method1835(9568256, var11 + 1));
                        class15.field202[var31] = class261.method1835(9633792, var12);
                        class2.field25[class265.field4112][var11 + 1][var12] = var6;
                        var31 = var31 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var11 - 1 >= 0 && class2.field25[class265.field4112][var11 - 1][var12] != var6 && (class324.field5005[class265.field4112][var11][var12] & 0x4) == 0 && (class324.field5005[class265.field4112][var11 - 1][var12 + 1] & 0x4) == 0) {
                            class254.field3868[var31] = class261.method1835(301989888, class261.method1835(var11 - 1, 13762560));
                            class15.field202[var31] = class261.method1835(13828096, var12);
                            class2.field25[class265.field4112][var11 - 1][var12] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class2.field25[class265.field4112][var11][var12] != var6) {
                            class254.field3868[var31] = class261.method1835(class261.method1835(var11, 13762560), -1828716544);
                            class15.field202[var31] = class261.method1835(13828096, var12);
                            var31 = var31 + 1 & 0xFFF;
                            class2.field25[class265.field4112][var11][var12] = var6;
                        }
                        if ((var11 + 1) < 104 && class2.field25[class265.field4112][var11 + 1][var12] != var6 && (class324.field5005[class265.field4112][var11][var12] & 0x4) == 0 && (class324.field5005[class265.field4112][var11 + 1][var12 + 1] & 0x4) == 0) {
                            class254.field3868[var31] = class261.method1835(class261.method1835(9568256, var11 + 1), -771751936);
                            class15.field202[var31] = class261.method1835(var12, 9633792);
                            var31 = var31 + 1 & 0xFFF;
                            class2.field25[class265.field4112][var11 + 1][var12] = var6;
                        }
                    }
                }
            }
            if (class300.field4618[arg0] != -1000000) {
                class300.field4618[arg0] += 10;
                class27.field294[arg0] -= 50;
                class201.field3097[arg0] += 50;
                class13.field174[arg0] += 50;
                class242.field3684[arg0] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(B)V", line = 321)
    public static void method1033(byte arg0) {
        if (arg0 != -74) {
            field2039 = -101;
        }
        field2041 = null;
        field2034 = (class58[][]) null;
    }
}
