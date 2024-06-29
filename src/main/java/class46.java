import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class46 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Z")
    public static boolean field914 = false;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lqk;")
    public static class207 field922 = class24.method212(255, "mapfunction");

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "Lqk;")
    public static class207 field918 = class24.method212(255, "Texturen geladen)3");

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "Lqk;")
    public static class207 field915 = class24.method212(255, " s(West connect-B)3");

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static volatile int field919 = -1;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field913;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field920;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lmd;III)V")
    public static final void method353(class220 arg0, int arg1, int arg2, int arg3) {
        field913++;
        if (arg3 > -53) {
            field915 = null;
        }
        if (arg0.field3983 == 1) {
            class143.field2478++;
            class156.method1143((short) 58, arg0.field3933, 0L, -1, 0, -28775, arg0.field4027, class100.field1800);
        }
        if (arg0.field3983 == 2 && !class4.field71) {
            class207 var4 = class234.method1670((byte) -90, arg0);
            if (var4 != null) {
                class156.method1143((short) 9, arg0.field3933, 0L, -1, -1, -28775, var4, class105.method757(false, new class207[] { class133.field2298, arg0.field3918 }));
                class133.field2296++;
            }
        }
        if (arg0.field3983 == 3) {
            class156.method1143((short) 26, arg0.field3933, 0L, -1, 0, -28775, class72.field1337, class100.field1800);
            class89.field1608++;
        }
        if (arg0.field3983 == 4) {
            class86.field1570++;
            class156.method1143((short) 45, arg0.field3933, 0L, -1, 0, -28775, arg0.field4027, class100.field1800);
        }
        if (arg0.field3983 == 5) {
            class156.method1143((short) 42, arg0.field3933, 0L, -1, 0, -28775, arg0.field4027, class100.field1800);
            class271.field4788++;
        }
        if (arg0.field3983 == 6 && class89.field1605 == null) {
            class10.field146++;
            class156.method1143((short) 30, arg0.field3933, 0L, -1, -1, -28775, arg0.field4027, class100.field1800);
        }
        if (arg0.field3988 == 2) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field4009; var6++) {
                for (int var7 = 0; var7 < arg0.field3995; var7++) {
                    int var8 = (arg0.field3905 + 32) * var6;
                    int var9 = (arg0.field3886 + 32) * var7;
                    if (var5 < 20) {
                        var9 += arg0.field3913[var5];
                        var8 += arg0.field4038[var5];
                    }
                    if (arg1 >= var9 && arg2 >= var8 && arg1 < (var9 + 32) && var8 + 32 > arg2) {
                        class167.field2937 = var5;
                        class185.field3282 = arg0;
                        if (arg0.field3963[var5] > 0) {
                            class117 var10 = client.method1112(arg0);
                            class173 var11 = class117.method829(arg0.field3963[var5] - 1, (byte) 96);
                            if (class34.field680 == 1 && var10.method838(0)) {
                                if (class70.field1243 != arg0.field3933 || class147.field2538 != var5) {
                                    class110.field1927++;
                                    class156.method1143((short) 35, arg0.field3933, (long) var11.field3106, -1, var5, -28775, class156.field2744, class105.method757(false, new class207[] { class235.field4336, class123.field2129, var11.field3057 }));
                                }
                            } else if (class4.field71 && var10.method838(0)) {
                                class119 var12 = class269.field4757 == -1 ? null : class276.method1880(class269.field4757, (byte) -47);
                                if ((class60.field1096 & 0x10) != 0 && (var12 == null || var11.method1240(class269.field4757, var12.field2061, -8078) != var12.field2061)) {
                                    class156.method1143((short) 7, arg0.field3933, (long) var11.field3106, class127.field2218, var5, -28775, class49.field969, class105.method757(false, new class207[] { class243.field4422, class123.field2129, var11.field3057 }));
                                    class85.field1540++;
                                }
                            } else {
                                class207[] var13 = var11.field3077;
                                if (class32.field654) {
                                    var13 = class221.method1576(-99, var13);
                                }
                                class232.field4244++;
                                if (var10.method838(0)) {
                                    for (int var14 = 4; var14 >= 3; var14--) {
                                        if (var13 != null && var13[var14] != null) {
                                            byte var15;
                                            if (var14 == 3) {
                                                var15 = 4;
                                            } else {
                                                var15 = 10;
                                            }
                                            class156.method1143(var15, arg0.field3933, (long) var11.field3106, -1, var5, -28775, var13[var14], class105.method757(false, new class207[] { class190.field3351, var11.field3057 }));
                                            class178.field3204++;
                                        }
                                    }
                                }
                                if (var10.method830((byte) 22)) {
                                    class156.method1143((short) 25, arg0.field3933, (long) var11.field3106, class60.field1093, var5, -28775, class156.field2744, class105.method757(false, new class207[] { class190.field3351, var11.field3057 }));
                                    class156.field2747++;
                                }
                                if (var10.method838(0) && var13 != null) {
                                    for (int var16 = 2; var16 >= 0; var16--) {
                                        if (var13[var16] != null) {
                                            class271.field4792++;
                                            byte var17 = 0;
                                            if (var16 == 0) {
                                                var17 = 16;
                                            }
                                            if (var16 == 1) {
                                                var17 = 50;
                                            }
                                            if (var16 == 2) {
                                                var17 = 14;
                                            }
                                            class156.method1143(var17, arg0.field3933, (long) var11.field3106, -1, var5, -28775, var13[var16], class105.method757(false, new class207[] { class190.field3351, var11.field3057 }));
                                        }
                                    }
                                }
                                class207[] var18 = arg0.field3986;
                                if (class32.field654) {
                                    var18 = class221.method1576(-116, var18);
                                }
                                if (var18 != null) {
                                    for (int var19 = 4; var19 >= 0; var19--) {
                                        if (var18[var19] != null) {
                                            class90.field1619++;
                                            byte var20 = 0;
                                            if (var19 == 0) {
                                                var20 = 46;
                                            }
                                            if (var19 == 1) {
                                                var20 = 15;
                                            }
                                            if (var19 == 2) {
                                                var20 = 19;
                                            }
                                            if (var19 == 3) {
                                                var20 = 51;
                                            }
                                            if (var19 == 4) {
                                                var20 = 1;
                                            }
                                            class156.method1143(var20, arg0.field3933, (long) var11.field3106, -1, var5, -28775, var18[var19], class105.method757(false, new class207[] { class190.field3351, var11.field3057 }));
                                        }
                                    }
                                }
                                class156.method1143((short) 1005, arg0.field3933, (long) var11.field3106, class186.field3290, var5, -28775, class209.field3701, class105.method757(false, new class207[] { class190.field3351, var11.field3057 }));
                            }
                        }
                    }
                    var5++;
                }
            }
        }
        if (!arg0.field4010) {
            return;
        }
        if (!class4.field71) {
            for (int var21 = 9; var21 >= 5; var21--) {
                class207 var25 = class208.method1473(arg0, var21, -25);
                if (var25 != null) {
                    class156.method1143((short) 1002, arg0.field3933, (long) (var21 + 1), class44.method335(var21, 109, arg0), arg0.field3893, -28775, var25, arg0.field3980);
                    class276.field4850++;
                }
            }
            class207 var22 = class234.method1670((byte) -82, arg0);
            if (var22 != null) {
                class133.field2296++;
                class156.method1143((short) 9, arg0.field3933, 0L, -1, arg0.field3893, -28775, var22, arg0.field3980);
            }
            for (int var23 = 4; var23 >= 0; var23--) {
                class207 var24 = class208.method1473(arg0, var23, -27);
                if (var24 != null) {
                    class276.field4850++;
                    class156.method1143((short) 5, arg0.field3933, (long) (var23 + 1), class44.method335(var23, 119, arg0), arg0.field3893, -28775, var24, arg0.field3980);
                }
            }
            if (client.method1112(arg0).method828(1)) {
                class10.field146++;
                class156.method1143((short) 30, arg0.field3933, 0L, -1, arg0.field3893, -28775, class79.field1453, class100.field1800);
                return;
            }
            return;
        }
        if (client.method1112(arg0).method826((byte) 40) && (class60.field1096 & 0x20) != 0) {
            class156.method1143((short) 12, arg0.field3933, 0L, class127.field2218, arg0.field3893, -28775, class49.field969, class105.method757(false, new class207[] { class243.field4422, class80.field1463, arg0.field3980 }));
            class138.field2395++;
            return;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static final void method354(byte arg0) {
        class2.field38.method1390((byte) 118);
        field923++;
        if (arg0 != -65) {
            method356(67);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static final void method355(boolean arg0) {
        if (arg0) {
            field915 = null;
        }
        class252.field4534.method1390((byte) 111);
        field921++;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static final void method356(int arg0) {
        if (class149.field2610 != null) {
            class86 var1 = class149.field2610;
            synchronized (class149.field2610) {
                class149.field2610 = null;
            }
        }
        if (arg0 == -28798) {
            field920++;
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V")
    public static void method357(int arg0) {
        if (arg0 != 27586) {
            field915 = null;
        }
        field922 = null;
        field918 = null;
        field915 = null;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(ILmd;II)V")
    public static final void method358(int arg0, class220 arg1, int arg2, int arg3) {
        field917++;
        if (arg1.field3950 == 0) {
            arg1.field3909 = arg1.field4005;
        } else if (arg1.field3950 == 1) {
            arg1.field3909 = (arg0 - arg1.field4037) / 2 + arg1.field4005;
        } else if (arg1.field3950 == 2) {
            arg1.field3909 = arg0 - arg1.field4037 - arg1.field4005;
        } else if (arg1.field3950 == 3) {
            arg1.field3909 = arg1.field4005 * arg0 >> 14;
        } else if (arg1.field3950 == 4) {
            arg1.field3909 = (arg1.field4005 * arg0 >> 14) + (arg0 - arg1.field4037) / 2;
        } else {
            arg1.field3909 = arg0 - (arg1.field4005 * arg0 >> 14) - arg1.field4037;
        }
        if (arg1.field3889 == 0) {
            arg1.field3912 = arg1.field3878;
        } else if (arg1.field3889 == 1) {
            arg1.field3912 = (arg2 - arg1.field3948) / 2 + arg1.field3878;
        } else if (arg1.field3889 == 2) {
            arg1.field3912 = arg2 - arg1.field3948 - arg1.field3878;
        } else if (arg1.field3889 == 3) {
            arg1.field3912 = arg1.field3878 * arg2 >> 14;
        } else if (arg1.field3889 == 4) {
            arg1.field3912 = (arg1.field3878 * arg2 >> 14) + (arg2 - arg1.field3948) / 2;
        } else {
            arg1.field3912 = arg2 - arg1.field3948 - (arg1.field3878 * arg2 >> 14);
        }
        if (arg3 != 30) {
            field914 = true;
        }
        if (!class138.field2385) {
            return;
        }
        if (client.method1112(arg1).field2021 == 0 && arg1.field3988 != 0) {
            return;
        }
        if (arg1.field3912 < 0) {
            arg1.field3912 = 0;
        } else if (arg2 < arg1.field3948 + arg1.field3912) {
            arg1.field3912 = arg2 - arg1.field3948;
        }
        if (arg1.field3909 < 0) {
            arg1.field3909 = 0;
            return;
        }
        if (arg0 < (arg1.field4037 + arg1.field3909)) {
            arg1.field3909 = arg0 - arg1.field4037;
            return;
        }
    }
}
