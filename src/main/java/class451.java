import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class451 extends class187 {

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "[I")
    public static int[] field6554 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "Ljava/lang/String;")
    public static String field6567 = "Unable to find ";

    @OriginalMember(owner = "client!ml", name = "y", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!ml", name = "z", descriptor = "I")
    public int field6557;

    @OriginalMember(owner = "client!ml", name = "A", descriptor = "I")
    public int field6558;

    @OriginalMember(owner = "client!ml", name = "B", descriptor = "I")
    public int field6559;

    @OriginalMember(owner = "client!ml", name = "D", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public int field6562;

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public int field6564;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!ml", name = "N", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Ljava/lang/String;")
    public String field6563;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "[I")
    public int[] field6555;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "[I")
    public int[] field6565;

    @OriginalMember(owner = "client!ml", name = "C", descriptor = "[Luc;")
    public class58[] field6560;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "[Ljava/lang/String;")
    public String[] field6566;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)Lom;")
    public static final class127 method2800(int arg0, int arg1) {
        field6569++;
        if (arg1 != 0) {
            method2804(88, (byte) 125);
        }
        class114 var2 = class104.field1286;
        class127 var3;
        synchronized (class104.field1286) {
            var3 = (class127) class104.field1286.method616(123, (long) arg0);
            if (var3 == null) {
                var3 = new class127(arg0);
                class104.field1286.method615((byte) -127, (long) arg0, var3);
            }
        }
        synchronized (var3) {
            return var3.method687(true) ? var3 : null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILfd;I)V")
    public static final void method2801(int arg0, int arg1, class194 arg2, int arg3) {
        field6568++;
        if (arg2.field2498 == 0) {
            arg2.field2562 = arg2.field2447;
        } else if (arg2.field2498 == 1) {
            arg2.field2562 = (arg1 - arg2.field2501) / 2 + arg2.field2447;
        } else if (arg2.field2498 == 2) {
            arg2.field2562 = arg1 - arg2.field2447 - arg2.field2501;
        } else if (arg2.field2498 == 3) {
            arg2.field2562 = arg2.field2447 * arg1 >> 14;
        } else if (arg2.field2498 == 4) {
            arg2.field2562 = (arg2.field2447 * arg1 >> 14) + (arg1 - arg2.field2501) / 2;
        } else {
            arg2.field2562 = arg1 - arg2.field2501 - (arg2.field2447 * arg1 >> 14);
        }
        int var4 = -87 / ((arg3 - 7) / 40);
        if (arg2.field2570 == 0) {
            arg2.field2553 = arg2.field2457;
        } else if (arg2.field2570 == 1) {
            arg2.field2553 = (arg0 - arg2.field2460) / 2 + arg2.field2457;
        } else if (arg2.field2570 == 2) {
            arg2.field2553 = arg0 - arg2.field2457 - arg2.field2460;
        } else if (arg2.field2570 == 3) {
            arg2.field2553 = arg2.field2457 * arg0 >> 14;
        } else if (arg2.field2570 == 4) {
            arg2.field2553 = (arg2.field2457 * arg0 >> 14) + (arg0 - arg2.field2460) / 2;
        } else {
            arg2.field2553 = arg0 - arg2.field2460 - (arg2.field2457 * arg0 >> 14);
        }
        if (!class318.field4237) {
            return;
        }
        if (client.method1410(arg2).field2940 == 0 && arg2.field2492 != 0) {
            return;
        }
        if (arg2.field2553 < 0) {
            arg2.field2553 = 0;
        } else if (arg2.field2553 + arg2.field2460 > arg0) {
            arg2.field2553 = arg0 - arg2.field2460;
        }
        if (arg2.field2562 < 0) {
            arg2.field2562 = 0;
            return;
        }
        if (arg2.field2562 + arg2.field2501 > arg1) {
            arg2.field2562 = arg1 - arg2.field2501;
            return;
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(B)V")
    public static final void method2802(byte arg0) {
        int var1 = -83 / ((arg0 + 29) / 35);
        field6561++;
        for (int var2 = 0; var2 < class338.field4509; var2++) {
            int var3 = class192.field2423[var2];
            class91 var4 = class38.field397[var3];
            int var5 = class448.field6514.method1350(31351);
            if ((var5 & 0x40) != 0) {
                var5 += class448.field6514.method1350(31351) << 8;
            }
            if ((var5 & 0x2) != 0) {
                int var6 = class448.field6514.method1383(255);
                int var7 = class448.field6514.method1331(true);
                var4.method2603(var7, class234.field3224, true, var6);
            }
            if ((var5 & 0x10) != 0) {
                var4.field6060 = class448.field6514.method1349(-1754884856);
                var4.field6044 = 100;
            }
            if ((var5 & 0x8) != 0) {
                int var8 = class448.field6514.method1334(-17290);
                if (var8 == 65535) {
                    var8 = -1;
                }
                int var9 = class448.field6514.method1331(true);
                class9.method42(var8, var4, (byte) 127, var9);
            }
            if ((var5 & 0x20) != 0) {
                int var10 = class448.field6514.method1383(255);
                int var11 = class448.field6514.method1344(-97);
                var4.method2603(var11, class234.field3224, true, var10);
                var4.field6034 = class234.field3224 + 300;
                var4.field6043 = class448.field6514.method1387(-2);
            }
            if ((var5 & 0x200) != 0) {
                var4.field6099 = class448.field6514.method1374(-2);
                var4.field6023 = class448.field6514.method1356((byte) 102);
            }
            if ((var5 & 0x4) != 0) {
                int var12 = class448.field6514.method1374(-2);
                int var13 = class448.field6514.method1359(255);
                if (var12 == 65535) {
                    var12 = -1;
                }
                boolean var14 = true;
                if (var12 != -1 && var4.field6027 != -1) {
                    if (var4.field6027 == var12) {
                        class393 var15 = class220.method1186((byte) -110, var12);
                        if (var15.field5666 && var15.field5648 != -1) {
                            class208 var16 = class193.method1037(18, var15.field5648);
                            int var17 = var16.field2806;
                            if (var17 == 0) {
                                var14 = false;
                            } else if (var17 == 1) {
                                var14 = true;
                            } else if (var17 == 2) {
                                var14 = false;
                                var4.field6059 = 0;
                            }
                        }
                    } else {
                        class393 var18 = class220.method1186((byte) -110, var12);
                        class393 var19 = class220.method1186((byte) -110, var4.field6027);
                        if (var18.field5648 != -1 && var19.field5648 != -1) {
                            class208 var20 = class193.method1037(26, var18.field5648);
                            class208 var21 = class193.method1037(36, var19.field5648);
                            if (var20.field2819 < var21.field2819) {
                                var14 = false;
                            }
                        }
                    }
                }
                if (var14) {
                    var4.field6078 = (var13 & 0xFFFF) + class234.field3224;
                    var4.field6091 = var13 >> 16;
                    var4.field6039 = 0;
                    var4.field6027 = var12;
                    var4.field6083 = 0;
                    var4.field6068 = 1;
                    if (class234.field3224 < var4.field6078) {
                        var4.field6039 = -1;
                    }
                    if (var4.field6027 != -1 && class234.field3224 == var4.field6078) {
                        int var22 = class220.method1186((byte) -110, var4.field6027).field5648;
                        if (var22 != -1) {
                            class208 var23 = class193.method1037(5, var22);
                            if (var23 != null && var23.field2823 != null) {
                                class320.method1848(false, 60, var23, 0, var4.field152, var4.field154);
                            }
                        }
                    }
                }
            }
            if ((var5 & 0x400) != 0) {
                int var24 = class448.field6514.method1356((byte) 94);
                var4.field6067 = class448.field6514.method1387(-2);
                var4.field6042 = class448.field6514.method1350(31351);
                var4.field6048 = (var24 & 0x8000) != 0;
                var4.field6055 = var24 & 0x7FFF;
                var4.field6062 = class234.field3224 + var4.field6055 + var4.field6067;
            }
            if ((var5 & 0x1) != 0) {
                var4.field6024 = class448.field6514.method1356((byte) -55);
                if (var4.field6024 == 65535) {
                    var4.field6024 = -1;
                }
            }
            if ((var5 & 0x80) != 0) {
                if (var4.field1035.method2012(-1)) {
                    class295.method1734(var4, true);
                }
                var4.method503(class6.method30((byte) -69, class448.field6514.method1364(90)), -31893);
                var4.method2610((byte) 86, var4.field1035.field4624);
                var4.field6070 = var4.field1035.field4642 << 3;
                if (var4.field1035.method2012(-1)) {
                    class222.method1203(-1, 0, var4.field6109[0], var4.field6119[0], var4, (class158) null, class263.field3592, (class225) null);
                }
            }
            if ((var5 & 0x100) != 0) {
                int var25 = class448.field6514.method1350(31351);
                int[] var26 = new int[var25];
                int[] var27 = new int[var25];
                int[] var28 = new int[var25];
                for (int var29 = 0; var29 < var25; var29++) {
                    int var30 = class448.field6514.method1374(-2);
                    if (var30 == 65535) {
                        var30 = -1;
                    }
                    var26[var29] = var30;
                    var27[var29] = class448.field6514.method1387(-2);
                    var28[var29] = class448.field6514.method1364(90);
                }
                class19.method87(var28, var4, (byte) 123, var26, var27);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "(B)V")
    public static void method2803(byte arg0) {
        field6554 = null;
        if (arg0 > -125) {
            field6554 = null;
        }
        field6567 = null;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IB)V")
    public static final void method2804(int arg0, byte arg1) {
        class114 var2 = class130.field1669;
        synchronized (class130.field1669) {
            if (arg1 != -66) {
                method2804(-44, (byte) -114);
            }
            class130.field1669.method614(-127, arg0);
        }
        field6570++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILtq;)Ljava/lang/String;")
    public static final String method2805(int arg0, class250 arg1) {
        if (arg0 > -91) {
            return null;
        } else {
            field6556++;
            return class353.method2165(arg1, 2, 32767);
        }
    }
}
