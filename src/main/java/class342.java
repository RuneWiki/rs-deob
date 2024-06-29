import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class342 {

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field5503;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field5504;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "Lsi;")
    public static class264 field5505;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lnm;ILnm;II)Luj;", line = 10)
    public static final class175 method2414(class221 arg0, int arg1, class221 arg2, int arg3, int arg4) {
        field5504++;
        int var5 = 24 % ((arg3 + 85) / 34);
        return class334.method2361(arg4, arg0, 16836, arg1) ? class11.method71(arg2.method1504(arg1, true, arg4), -125) : null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V", line = 24)
    public static void method2415(boolean arg0) {
        if (!arg0) {
            method2416(-106);
        }
        field5505 = null;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)V", line = 40)
    public static final void method2416(int arg0) {
        if (class53.field803 != -1) {
            class358.method2489(-1, false, arg0 ^ 0xFFFF977A, -1, class53.field803);
            class53.field803 = -1;
        }
        field5503++;
        if (arg0 != -26766) {
            method2414((class221) null, -108, (class221) null, 29, -119);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I[[[Ljj;ZIII)Z", line = 59)
    public static final boolean method2417(int arg0, class50[][][] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        byte var6 = arg2 ? 1 : (byte) (class253.field4021 & 0xFF);
        field5506++;
        if (class138.field2175[class120.field1779][arg3][arg0] == var6) {
            return false;
        } else if ((class148.field2392[class120.field1779][arg3][arg0] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class210.field3204[var7] = arg3;
            int var8 = -14 / ((arg5 - 24) / 61);
            int var32 = var7 + 1;
            class264.field4238[var7] = arg0;
            int var9 = 0;
            class138.field2175[class120.field1779][arg3][arg0] = var6;
            while (var32 != var9) {
                int var10 = class210.field3204[var9] & 0xFFFF;
                int var11 = class210.field3204[var9] >> 24 & 0xFF;
                int var12 = class264.field4238[var9] & 0xFFFF;
                int var13 = (class210.field3204[var9] & 0xFF31A7) >> 16;
                int var14 = (class264.field4238[var9] & 0xFF2CDD) >> 16;
                var9 = var9 + 1 & 0xFFF;
                boolean var15 = false;
                boolean var16 = false;
                if ((class148.field2392[class120.field1779][var10][var12] & 0x4) == 0) {
                    var16 = true;
                }
                label243: for (int var17 = class120.field1779 + 1; var17 <= 3; var17++) {
                    if ((class148.field2392[var17][var10][var12] & 0x8) == 0) {
                        if (var16 && arg1[var17][var10][var12] != null) {
                            if (arg1[var17][var10][var12].field732 != null) {
                                int var18 = class153.method1106(var13, -3);
                                if (arg1[var17][var10][var12].field732.field4067 == var18 || arg1[var17][var10][var12].field732.field4058 == var18) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var19 = class153.method1106(var11, -3);
                                    if (arg1[var17][var10][var12].field732.field4067 == var19 || arg1[var17][var10][var12].field732.field4058 == var19) {
                                        continue;
                                    }
                                }
                                if (var14 != 0) {
                                    int var20 = class153.method1106(var14, -3);
                                    if (arg1[var17][var10][var12].field732.field4067 == var20 || arg1[var17][var10][var12].field732.field4058 == var20) {
                                        continue;
                                    }
                                }
                            }
                            if (arg1[var17][var10][var12].field752 != null) {
                                for (int var21 = 0; var21 < arg1[var17][var10][var12].field735; var21++) {
                                    int var22 = (int) (arg1[var17][var10][var12].field752[var21].field4076 >> 14 & 0x3FL);
                                    if (var22 == 21) {
                                        var22 = 19;
                                    }
                                    int var23 = (int) (arg1[var17][var10][var12].field752[var21].field4076 >> 20 & 0x3L);
                                    int var24 = var23 << 6 | var22;
                                    if (var13 == var24 || var11 != 0 && var11 == var24 || var14 != 0 && var14 == var24) {
                                        continue label243;
                                    }
                                }
                            }
                        }
                        var15 = true;
                        class50 var25 = arg1[var17][var10][var12];
                        if (var25 != null && var25.field735 > 0) {
                            for (int var26 = 0; var26 < var25.field735; var26++) {
                                class258 var27 = var25.field752[var26];
                                if (var27.field4084 != var27.field4082 || var27.field4081 != var27.field4077) {
                                    for (int var28 = var27.field4082; var28 <= var27.field4084; var28++) {
                                        for (int var29 = var27.field4081; var29 <= var27.field4077; var29++) {
                                            class138.field2175[var17][var28][var29] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class138.field2175[var17][var10][var12] = var6;
                    }
                }
                if (var15) {
                    int var30 = var12 << 7;
                    int var31 = var10 << 7;
                    if (class74.field1121[arg4] < class101.field1457[class120.field1779 + 1][var10][var12]) {
                        class74.field1121[arg4] = class101.field1457[class120.field1779 + 1][var10][var12];
                    }
                    if (class90.field1306[arg4] > var31) {
                        class90.field1306[arg4] = var31;
                    } else if (class18.field226[arg4] < var31) {
                        class18.field226[arg4] = var31;
                    }
                    if (class172.field2697[arg4] > var30) {
                        class172.field2697[arg4] = var30;
                    } else if (class178.field2780[arg4] < var30) {
                        class178.field2780[arg4] = var30;
                    }
                }
                if (!var16) {
                    if (var10 >= 1 && class138.field2175[class120.field1779][var10 - 1][var12] != var6) {
                        class210.field3204[var32] = class167.method1160(class167.method1160(1179648, var10 - 1), -754974720);
                        class264.field4238[var32] = class167.method1160(var12, 1245184);
                        var32 = var32 + 1 & 0xFFF;
                        class138.field2175[class120.field1779][var10 - 1][var12] = var6;
                    }
                    var12++;
                    if (var12 < 104) {
                        if ((var10 - 1) >= 0 && class138.field2175[class120.field1779][var10 - 1][var12] != var6 && (class148.field2392[class120.field1779][var10][var12] & 0x4) == 0 && (class148.field2392[class120.field1779][var10 - 1][var12 - 1] & 0x4) == 0) {
                            class210.field3204[var32] = class167.method1160(class167.method1160(var10 - 1, 1179648), 1375731712);
                            class264.field4238[var32] = class167.method1160(var12, 1245184);
                            var32 = var32 + 1 & 0xFFF;
                            class138.field2175[class120.field1779][var10 - 1][var12] = var6;
                        }
                        if (class138.field2175[class120.field1779][var10][var12] != var6) {
                            class210.field3204[var32] = class167.method1160(class167.method1160(var10, 5373952), 318767104);
                            class264.field4238[var32] = class167.method1160(var12, 5439488);
                            class138.field2175[class120.field1779][var10][var12] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                        if ((var10 + 1) < 104 && class138.field2175[class120.field1779][var10 + 1][var12] != var6 && (class148.field2392[class120.field1779][var10][var12] & 0x4) == 0 && (class148.field2392[class120.field1779][var10 + 1][var12 - 1] & 0x4) == 0) {
                            class210.field3204[var32] = class167.method1160(-1845493760, class167.method1160(5373952, var10 + 1));
                            class264.field4238[var32] = class167.method1160(var12, 5439488);
                            var32 = var32 + 1 & 0xFFF;
                            class138.field2175[class120.field1779][var10 + 1][var12] = var6;
                        }
                    }
                    var12--;
                    if (var10 + 1 < 104 && class138.field2175[class120.field1779][var10 + 1][var12] != var6) {
                        class210.field3204[var32] = class167.method1160(1392508928, class167.method1160(9568256, var10 + 1));
                        class264.field4238[var32] = class167.method1160(9633792, var12);
                        class138.field2175[class120.field1779][var10 + 1][var12] = var6;
                        var32 = var32 + 1 & 0xFFF;
                    }
                    var12--;
                    if (var12 >= 0) {
                        if (var10 - 1 >= 0 && class138.field2175[class120.field1779][var10 - 1][var12] != var6 && (class148.field2392[class120.field1779][var10][var12] & 0x4) == 0 && (class148.field2392[class120.field1779][var10 - 1][var12 + 1] & 0x4) == 0) {
                            class210.field3204[var32] = class167.method1160(301989888, class167.method1160(var10 - 1, 13762560));
                            class264.field4238[var32] = class167.method1160(var12, 13828096);
                            var32 = var32 + 1 & 0xFFF;
                            class138.field2175[class120.field1779][var10 - 1][var12] = var6;
                        }
                        if (class138.field2175[class120.field1779][var10][var12] != var6) {
                            class210.field3204[var32] = class167.method1160(-1828716544, class167.method1160(13762560, var10));
                            class264.field4238[var32] = class167.method1160(13828096, var12);
                            var32 = var32 + 1 & 0xFFF;
                            class138.field2175[class120.field1779][var10][var12] = var6;
                        }
                        if ((var10 + 1) < 104 && class138.field2175[class120.field1779][var10 + 1][var12] != var6 && (class148.field2392[class120.field1779][var10][var12] & 0x4) == 0 && (class148.field2392[class120.field1779][var10 + 1][var12 + 1] & 0x4) == 0) {
                            class210.field3204[var32] = class167.method1160(class167.method1160(var10 + 1, 9568256), -771751936);
                            class264.field4238[var32] = class167.method1160(var12, 9633792);
                            class138.field2175[class120.field1779][var10 + 1][var12] = var6;
                            var32 = var32 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class74.field1121[arg4] != -1000000) {
                class74.field1121[arg4] += 10;
                class90.field1306[arg4] -= 50;
                class18.field226[arg4] += 50;
                class178.field2780[arg4] += 50;
                class172.field2697[arg4] -= 50;
            }
            return true;
        }
    }
}
