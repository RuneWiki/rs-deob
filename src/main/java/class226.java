import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class226 extends class305 {

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "Ljava/lang/String;")
    public static String field3578 = " has logged out.";

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "Ljava/lang/String;")
    public static String field3580 = "Examine";

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field3572;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field3573;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field3575;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    public static int field3579;

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static int field3581;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    public static int field3583;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field3584;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "Lsl;")
    private class39 field3582;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lag;IB)V", line = 9)
    private final void method1500(class202 arg0, int arg1, byte arg2) {
        field3577++;
        if (arg1 == 249) {
            int var4 = arg0.method1317((byte) -81);
            if (this.field3582 == null) {
                int var5 = method1510(27147, var4);
                this.field3582 = new class39(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1317((byte) -119) == 1;
                int var8 = arg0.method1352((byte) -9);
                class35 var9;
                if (var7) {
                    var9 = new class179(arg0.method1307((byte) 102));
                } else {
                    var9 = new class166(arg0.method1346(90));
                }
                this.field3582.method310((long) var8, var9, arg2 + 25337);
            }
        }
        if (arg2 != 20) {
            method1506((byte) 104, true, 89, -11, (class47[][][]) ((class47[][][]) null), -126);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BLag;)V", line = 60)
    public final void method1501(byte arg0, class202 arg1) {
        while (true) {
            int var3 = arg1.method1317((byte) -113);
            if (var3 == 0) {
                field3581++;
                if (arg0 != -1) {
                    field3580 = (String) null;
                }
                return;
            }
            this.method1500(arg1, var3, (byte) 20);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILjava/lang/String;)Ljava/lang/String;", line = 78)
    public final String method1502(int arg0, int arg1, String arg2) {
        if (arg1 >= -108) {
            return (String) null;
        }
        field3575++;
        if (this.field3582 == null) {
            return arg2;
        } else {
            class179 var4 = (class179) this.field3582.method303((long) arg0, (byte) 106);
            return var4 == null ? arg2 : var4.field2880;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(IB)V", line = 98)
    public static final void method1503(int arg0, byte arg1) {
        class99.field1736.method1883(2047773287, arg0);
        field3572++;
        class180.field2889.method1883(2047773287, arg0);
        if (arg1 > 98) {
            class179.field2881.method1883(2047773287, arg0);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIB)I", line = 111)
    public final int method1504(int arg0, int arg1, byte arg2) {
        field3574++;
        if (arg2 != -11) {
            return -80;
        } else if (this.field3582 == null) {
            return arg1;
        } else {
            class166 var4 = (class166) this.field3582.method303((long) arg0, (byte) 105);
            return var4 == null ? arg1 : var4.field2682;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([BI)Lfb;", line = 132)
    public static final class237 method1505(byte[] arg0, int arg1) {
        field3584++;
        int var2 = -27 / ((10 - arg1) / 61);
        if (arg0 == null) {
            return null;
        } else {
            class237 var3 = new class237(arg0, class80.field1572, class27.field530, class28.field537, class176.field2833, class254.field3968);
            class97.method644((byte) 123);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BZII[[[Lmj;I)Z", line = 154)
    public static final boolean method1506(byte arg0, boolean arg1, int arg2, int arg3, class47[][][] arg4, int arg5) {
        if (arg0 != -32) {
            field3578 = (String) null;
        }
        field3583++;
        byte var6 = arg1 ? 1 : (byte) (class158.field2589 & 0xFF);
        if (class6.field137[class289.field4438][arg5][arg3] == var6) {
            return false;
        } else if ((class99.field1749[class289.field4438][arg5][arg3] & 0x4) == 0) {
            return false;
        } else {
            byte var7 = 0;
            class339.field5261[var7] = arg5;
            int var31 = var7 + 1;
            class87.field1652[var7] = arg3;
            class6.field137[class289.field4438][arg5][arg3] = var6;
            int var8 = 0;
            while (var31 != var8) {
                int var9 = class339.field5261[var8] & 0xFFFF;
                int var10 = (class339.field5261[var8] & 0xFF5913) >> 16;
                int var11 = class339.field5261[var8] >> 24 & 0xFF;
                boolean var12 = false;
                int var13 = class87.field1652[var8] & 0xFFFF;
                boolean var14 = false;
                int var15 = (class87.field1652[var8] & 0xFFA18B) >> 16;
                if ((class99.field1749[class289.field4438][var9][var13] & 0x4) == 0) {
                    var12 = true;
                }
                var8 = var8 + 1 & 0xFFF;
                label245: for (int var16 = class289.field4438 + 1; var16 <= 3; var16++) {
                    if ((class99.field1749[var16][var9][var13] & 0x8) == 0) {
                        if (var12 && arg4[var16][var9][var13] != null) {
                            if (arg4[var16][var9][var13].field965 != null) {
                                int var17 = class95.method632((byte) 102, var10);
                                if (arg4[var16][var9][var13].field965.field790 == var17 || arg4[var16][var9][var13].field965.field793 == var17) {
                                    continue;
                                }
                                if (var11 != 0) {
                                    int var18 = class95.method632((byte) 87, var11);
                                    if (arg4[var16][var9][var13].field965.field790 == var18 || arg4[var16][var9][var13].field965.field793 == var18) {
                                        continue;
                                    }
                                }
                                if (var15 != 0) {
                                    int var19 = class95.method632((byte) 59, var15);
                                    if (arg4[var16][var9][var13].field965.field790 == var19 || arg4[var16][var9][var13].field965.field793 == var19) {
                                        continue;
                                    }
                                }
                            }
                            if (arg4[var16][var9][var13].field974 != null) {
                                for (int var20 = 0; var20 < arg4[var16][var9][var13].field969; var20++) {
                                    int var21 = (int) (arg4[var16][var9][var13].field974[var20].field4191 >> 14 & 0x3FL);
                                    int var22 = (int) (arg4[var16][var9][var13].field974[var20].field4191 >> 20 & 0x3L);
                                    if (var21 == 21) {
                                        var21 = 19;
                                    }
                                    int var23 = var22 << 6 | var21;
                                    if (var10 == var23 || var11 != 0 && var11 == var23 || var15 != 0 && var15 == var23) {
                                        continue label245;
                                    }
                                }
                            }
                        }
                        var14 = true;
                        class47 var24 = arg4[var16][var9][var13];
                        if (var24 != null && var24.field969 > 0) {
                            for (int var25 = 0; var25 < var24.field969; var25++) {
                                class271 var26 = var24.field974[var25];
                                if (var26.field4180 != var26.field4176 || var26.field4187 != var26.field4181) {
                                    for (int var27 = var26.field4180; var27 <= var26.field4176; var27++) {
                                        for (int var28 = var26.field4187; var28 <= var26.field4181; var28++) {
                                            class6.field137[var16][var27][var28] = var6;
                                        }
                                    }
                                }
                            }
                        }
                        class6.field137[var16][var9][var13] = var6;
                    }
                }
                if (var14) {
                    if (class15.field281[arg2] < class45.field923[class289.field4438 + 1][var9][var13]) {
                        class15.field281[arg2] = class45.field923[class289.field4438 + 1][var9][var13];
                    }
                    int var29 = var13 << 7;
                    int var30 = var9 << 7;
                    if (class81.field1580[arg2] > var30) {
                        class81.field1580[arg2] = var30;
                    } else if (class119.field2075[arg2] < var30) {
                        class119.field2075[arg2] = var30;
                    }
                    if (class271.field4189[arg2] > var29) {
                        class271.field4189[arg2] = var29;
                    } else if (var29 > class259.field4031[arg2]) {
                        class259.field4031[arg2] = var29;
                    }
                }
                if (!var12) {
                    if (var9 >= 1 && class6.field137[class289.field4438][var9 - 1][var13] != var6) {
                        class339.field5261[var31] = class212.method1434(class212.method1434(1179648, var9 - 1), -754974720);
                        class87.field1652[var31] = class212.method1434(1245184, var13);
                        var31 = var31 + 1 & 0xFFF;
                        class6.field137[class289.field4438][var9 - 1][var13] = var6;
                    }
                    var13++;
                    if (var13 < 104) {
                        if (var9 - 1 >= 0 && class6.field137[class289.field4438][var9 - 1][var13] != var6 && (class99.field1749[class289.field4438][var9][var13] & 0x4) == 0 && (class99.field1749[class289.field4438][var9 - 1][var13 - 1] & 0x4) == 0) {
                            class339.field5261[var31] = class212.method1434(class212.method1434(1179648, var9 - 1), 1375731712);
                            class87.field1652[var31] = class212.method1434(var13, 1245184);
                            class6.field137[class289.field4438][var9 - 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class6.field137[class289.field4438][var9][var13] != var6) {
                            class339.field5261[var31] = class212.method1434(318767104, class212.method1434(var9, 5373952));
                            class87.field1652[var31] = class212.method1434(5439488, var13);
                            var31 = var31 + 1 & 0xFFF;
                            class6.field137[class289.field4438][var9][var13] = var6;
                        }
                        if ((var9 + 1) < 104 && class6.field137[class289.field4438][var9 + 1][var13] != var6 && (class99.field1749[class289.field4438][var9][var13] & 0x4) == 0 && (class99.field1749[class289.field4438][var9 + 1][var13 - 1] & 0x4) == 0) {
                            class339.field5261[var31] = class212.method1434(class212.method1434(var9 + 1, 5373952), -1845493760);
                            class87.field1652[var31] = class212.method1434(5439488, var13);
                            class6.field137[class289.field4438][var9 + 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                    var13--;
                    if ((var9 + 1) < 104 && class6.field137[class289.field4438][var9 + 1][var13] != var6) {
                        class339.field5261[var31] = class212.method1434(class212.method1434(9568256, var9 + 1), 1392508928);
                        class87.field1652[var31] = class212.method1434(var13, 9633792);
                        var31 = var31 + 1 & 0xFFF;
                        class6.field137[class289.field4438][var9 + 1][var13] = var6;
                    }
                    var13--;
                    if (var13 >= 0) {
                        if ((var9 - 1) >= 0 && class6.field137[class289.field4438][var9 - 1][var13] != var6 && (class99.field1749[class289.field4438][var9][var13] & 0x4) == 0 && (class99.field1749[class289.field4438][var9 - 1][var13 + 1] & 0x4) == 0) {
                            class339.field5261[var31] = class212.method1434(301989888, class212.method1434(13762560, var9 - 1));
                            class87.field1652[var31] = class212.method1434(var13, 13828096);
                            class6.field137[class289.field4438][var9 - 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (class6.field137[class289.field4438][var9][var13] != var6) {
                            class339.field5261[var31] = class212.method1434(class212.method1434(13762560, var9), -1828716544);
                            class87.field1652[var31] = class212.method1434(var13, 13828096);
                            class6.field137[class289.field4438][var9][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                        if (var9 + 1 < 104 && class6.field137[class289.field4438][var9 + 1][var13] != var6 && (class99.field1749[class289.field4438][var9][var13] & 0x4) == 0 && (class99.field1749[class289.field4438][var9 + 1][var13 + 1] & 0x4) == 0) {
                            class339.field5261[var31] = class212.method1434(class212.method1434(var9 + 1, 9568256), -771751936);
                            class87.field1652[var31] = class212.method1434(var13, 9633792);
                            class6.field137[class289.field4438][var9 + 1][var13] = var6;
                            var31 = var31 + 1 & 0xFFF;
                        }
                    }
                }
            }
            if (class15.field281[arg2] != -1000000) {
                class15.field281[arg2] += 10;
                class81.field1580[arg2] -= 50;
                class119.field2075[arg2] += 50;
                class259.field4031[arg2] += 50;
                class271.field4189[arg2] -= 50;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lag;II)Ljava/lang/String;", line = 463)
    public static final String method1507(class202 arg0, int arg1, int arg2) {
        field3579++;
        try {
            int var3 = arg0.method1296((byte) 91);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg0.field3249 += class281.field4322.method1937(var4, arg0.field3249, arg1, arg1 - 126, arg0.field3273, var3);
            return class8.method74(0, var3, -1, var4);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V", line = 495)
    public static void method1508(byte arg0) {
        int var1 = 68 / ((3 - arg0) / 42);
        field3578 = null;
        field3580 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII)V", line = 504)
    public static final void method1509(byte arg0, int arg1, int arg2) {
        class35.field704 = class210.field3387[arg1][arg2].field5151;
        field3576++;
        class2.field46 = class210.field3387[arg1][arg2].field5150;
        class175.field2815 = class210.field3387[arg1][arg2].field5165;
        class65.method494((float) class35.field704, (float) class2.field46, (float) class175.field2815);
        int var3 = 28 % ((-arg0 - 38) / 38);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)I", line = 520)
    public static final int method1510(int arg0, int arg1) {
        field3573++;
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        if (arg0 != 27147) {
            return 39;
        }
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
