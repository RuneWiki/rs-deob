import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class160 extends class23 {

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "Lqd;")
    public static class40 field2675 = class147.method1106("Update)2Liste geladen)3", (byte) -77);

    @OriginalMember(owner = "client!eh", name = "gb", descriptor = "Lqd;")
    public static class40 field2678 = class147.method1106("www", (byte) -124);

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "Lqd;")
    public static class40 field2673 = class147.method1106("Lade Sprites )2 ", (byte) -78);

    @OriginalMember(owner = "client!eh", name = "eb", descriptor = "I")
    public static int field2676 = 0;

    @OriginalMember(owner = "client!eh", name = "fb", descriptor = "I")
    public static int field2677 = -1;

    @OriginalMember(owner = "client!eh", name = "mb", descriptor = "I")
    public static int field2684 = 0;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    public static int field2671;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!eh", name = "hb", descriptor = "I")
    public static int field2679;

    @OriginalMember(owner = "client!eh", name = "ib", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!eh", name = "jb", descriptor = "I")
    public static int field2681;

    @OriginalMember(owner = "client!eh", name = "kb", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!eh", name = "lb", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!eh", name = "nb", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!eh", name = "ob", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "Loj;")
    public static class313 field2670;

    @OriginalMember(owner = "client!eh", name = "pb", descriptor = "[[[I")
    public static int[][][] field2687;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[I", line = 12)
    public final int[] method32(byte arg0, int arg1) {
        if (arg0 != -94) {
            method1230(81, -93, 19, (class258) null);
        }
        int[] var3 = this.field403.method724((byte) 91, arg1);
        if (this.field403.field1760) {
            int var4 = class150.field2509[arg1];
            for (int var5 = 0; var5 < class52.field1007; var5++) {
                var3[var5] = this.method1228(true, var4, class315.field5345[var5]) % 4096;
            }
        }
        field2683++;
        return var3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(JZ)V", line = 42)
    public static final void method1227(long arg0, boolean arg1) {
        field2674++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1) {
            method1229(98, -117, -88, 84);
        }
        if ((arg0 % 10L) == 0L) {
            class96.method721(arg0 - 1L, 71);
            class96.method721(1L, 22);
        } else {
            class96.method721(arg0, 127);
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZII)I", line = 63)
    private final int method1228(boolean arg0, int arg1, int arg2) {
        field2682++;
        int var4 = arg1 * 57 + arg2;
        if (arg0) {
            int var5 = var4 ^ var4 << 1;
            return 4096 - ((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144;
        } else {
            return -101;
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V", line = 79)
    public class160() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)V", line = 85)
    public static final void method1229(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 18896) {
            field2684 = -97;
        }
        class177 var4 = class177.method1310(arg2 ^ 0x49F4, 4, arg3);
        field2680++;
        var4.method1302(-20040);
        var4.field2908 = arg0;
        var4.field2902 = arg1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIILve;)V", line = 99)
    public static final void method1230(int arg0, int arg1, int arg2, class258 arg3) {
        if ((arg2 & 0x100) != 0) {
            arg3.field1502 = class95.field1715.method208(-10556);
            int var4 = class95.field1715.method215(-62);
            arg3.field1508 = class256.field4266 + (var4 & 0xFFFF);
            if (arg3.field1502 == 65535) {
                arg3.field1502 = -1;
            }
            arg3.field1526 = 0;
            if (arg3.field1508 > class256.field4266) {
                arg3.field1526 = -1;
            }
            arg3.field1491 = 0;
            arg3.field1479 = var4 >> 16;
            if (arg3.field1502 != -1 && class256.field4266 == arg3.field1508) {
                int var5 = class185.method1339(-454810365, arg3.field1502).field4600;
                if (var5 != -1) {
                    class300 var6 = class20.method128(123, var5);
                    if (var6 != null && var6.field5018 != null) {
                        class185.method1338(var6, arg3.field1531, -31987, class255.field4233 == arg3, arg3.field1497, 0);
                    }
                }
            }
        }
        field2672++;
        if (arg0 != -6867) {
            field2687 = (int[][][]) ((int[][][]) null);
        }
        if ((arg2 & 0x8) != 0) {
            int var7 = class95.field1715.method216((byte) -126);
            if (var7 == 65535) {
                var7 = -1;
            }
            int var8 = class95.field1715.method204(arg0 ^ 0x862C748D);
            class164.method1242(arg3, var7, 1103216, var8);
        }
        if ((arg2 & 0x1) != 0) {
            int var9 = class95.field1715.method243(255);
            byte[] var10 = new byte[var9];
            class26 var11 = new class26(var10);
            class95.field1715.method237(var10, var9, 0, 32767);
            class151.field2526[arg1] = var11;
            arg3.method1812(var11, -94);
        }
        if ((arg2 & 0x40) != 0) {
            int var12 = class95.field1715.method195((byte) 120);
            int var13 = class95.field1715.method243(255);
            arg3.method662(class256.field4266, var12, -2, var13);
            arg3.field1517 = class256.field4266 + 300;
            arg3.field1504 = class95.field1715.method204(arg0 ^ 0x862C748D);
        }
        if ((arg2 & 0x20) != 0) {
            int var14 = class95.field1715.method197(-1);
            int var15 = class95.field1715.method243(arg0 + 7122);
            int var16 = class95.field1715.method190((byte) 126);
            int var17 = class95.field1715.field478;
            boolean var18 = (var14 & 0x8000) != 0;
            if (arg3.field4319 != null && arg3.field4294 != null) {
                boolean var19 = false;
                long var20 = arg3.field4319.method362(-25194);
                if (var15 <= 1) {
                    if (!var18 && (class208.field3333 && !class11.field180 || class300.field5038)) {
                        var19 = true;
                    } else {
                        for (int var22 = 0; var22 < class239.field3968; var22++) {
                            if (class282.field4751[var22] == var20) {
                                var19 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var19 && class194.field3121 == 0) {
                    class169.field2774.field478 = 0;
                    class95.field1715.method193(0, -1, class169.field2774.field472, var16);
                    class169.field2774.field478 = 0;
                    int var23 = -1;
                    class40 var24;
                    if (var18) {
                        var14 &= 0x7FFF;
                        class94 var25 = class118.method890(class169.field2774, 96);
                        var23 = var25.field1697;
                        var24 = var25.field1694.method1897(class169.field2774, (byte) 94);
                    } else {
                        var24 = class259.method1824(class298.method2038(class169.field2774, 219).method332(-23269));
                    }
                    arg3.field1501 = var24.method364(-91);
                    arg3.field1496 = 150;
                    arg3.field1477 = var14 >> 8;
                    arg3.field1480 = var14 & 0xFF;
                    if (var15 == 2) {
                        class171.method1265(var23, (byte) -81, class153.method1192(new class40[] { class220.field3663, arg3.method1814(0) }, (byte) 125), var24, var18 ? 17 : 1, (class40) null);
                    } else if (var15 == 1) {
                        class171.method1265(var23, (byte) -81, class153.method1192(new class40[] { class120.field2023, arg3.method1814(0) }, (byte) 126), var24, var18 ? 17 : 1, (class40) null);
                    } else {
                        class171.method1265(var23, (byte) -81, arg3.method1814(arg0 ^ 0xFFFFE52D), var24, var18 ? 17 : 2, (class40) null);
                    }
                }
            }
            class95.field1715.field478 = var16 + var17;
        }
        if ((arg2 & 0x4) != 0) {
            arg3.field1501 = class95.field1715.method251((byte) 77);
            if (arg3.field1501.method366(-1, 0) == 126) {
                arg3.field1501 = arg3.field1501.method371(1, false);
                class303.method2071(arg3.method1814(arg0 ^ 0xFFFFE52D), arg0 ^ 0xFFFFE53F, 2, arg3.field1501);
            } else if (class255.field4233 == arg3) {
                class303.method2071(arg3.method1814(0), 23, 2, arg3.field1501);
            }
            arg3.field1477 = 0;
            arg3.field1496 = 150;
            arg3.field1480 = 0;
        }
        if ((arg2 & 0x400) != 0) {
            int var26 = class95.field1715.method195((byte) 120);
            int var27 = class95.field1715.method226(255);
            arg3.method662(class256.field4266, var26, -2, var27);
        }
        if ((arg2 & 0x10) != 0) {
            arg3.field1515 = class95.field1715.method208(-10556);
            arg3.field1528 = class95.field1715.method197(-1);
        }
        if ((arg2 & 0x200) != 0) {
            arg3.field1518 = class95.field1715.method243(255);
            arg3.field1536 = class95.field1715.method226(255);
            arg3.field1494 = class95.field1715.method243(255);
            arg3.field1484 = class95.field1715.method190((byte) 106);
            arg3.field1505 = class95.field1715.method230((byte) -58) + class256.field4266;
            arg3.field1488 = class95.field1715.method208(-10556) + class256.field4266;
            arg3.field1493 = class95.field1715.method226(255);
            arg3.field1490 = 0;
            arg3.field1516 = 1;
        }
        if ((arg2 & 0x2) != 0) {
            arg3.field1537 = class95.field1715.method208(arg0 - 3689);
            if (arg3.field1537 == 65535) {
                arg3.field1537 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)V", line = 350)
    public static final void method1231(boolean arg0, int arg1) {
        field2685++;
        if (!arg0) {
            return;
        }
        field2677 = -1;
        field2677 = -1;
        if (arg1 == 37) {
            class186.field3008 = 3.0F;
        } else if (arg1 == 50) {
            class186.field3008 = 4.0F;
        } else if (arg1 == 75) {
            class186.field3008 = 6.0F;
        } else {
            class186.field3008 = 8.0F;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(B)V", line = 383)
    public static void method1232(byte arg0) {
        field2675 = null;
        field2673 = null;
        int var1 = -11 / ((56 - arg0) / 38);
        field2678 = null;
        field2670 = null;
        field2687 = (int[][][]) null;
    }
}
