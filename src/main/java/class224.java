import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class224 {

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "Lhj;")
    public static class69 field4076 = class181.method1318("cookieprefix", (byte) -120);

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lci;")
    public static class230 field4075 = new class230();

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[S")
    public static short[] field4082 = new short[] { -4160, -4163, -8256, -8259, 22461 };

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lhj;")
    public static class69 field4084 = class181.method1318("blinken2:", (byte) -106);

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "I")
    public static int field4080;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Z")
    public static boolean field4081;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[I")
    public static int[] field4077;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[S")
    public static short[] field4073;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBIII)V")
    public static final void method1588(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4080++;
        if (arg1 != 59) {
            method1590((class50) null, (byte) -128, 61);
        }
        for (int var5 = 0; var5 < class151.field2797; var5++) {
            if (arg3 < class129.field2410[var5] + class101.field1891[var5] && class101.field1891[var5] < arg3 + arg4 && arg2 < class181.field3300[var5] + class202.field3646[var5] && (arg0 + arg2) > class181.field3300[var5]) {
                class40.field576[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)Lhj;")
    public static final class69 method1589(boolean arg0, int arg1) {
        field4074++;
        if (arg0) {
            method1589(false, -85);
        }
        return class216.field3917[arg1].method441((byte) 73) <= 0 ? class26.field374[arg1] : class9.method42(69, new class69[] { class26.field374[arg1], class104.field1939, class216.field3917[arg1] });
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Ltk;BI)I")
    public static final int method1590(class50 arg0, byte arg1, int arg2) {
        field4078++;
        if (arg0.field731 == null || arg0.field731.length <= arg2) {
            return -2;
        }
        try {
            int[] var3 = arg0.field731[arg2];
            if (arg1 > -11) {
                field4077 = null;
            }
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = 0;
                byte var8 = 0;
                int var9 = var3[var5++];
                if (var9 == 0) {
                    return var4;
                }
                if (var9 == 15) {
                    var8 = 1;
                }
                if (var9 == 1) {
                    var7 = class179.field3253[var3[var5++]];
                }
                if (var9 == 2) {
                    var7 = class208.field3791[var3[var5++]];
                }
                if (var9 == 3) {
                    var7 = class139.field2607[var3[var5++]];
                }
                if (var9 == 16) {
                    var8 = 2;
                }
                if (var9 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class50 var12 = client.method1144((byte) -9, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class83.method585(var13, -1).field3687 || class63.field1223)) {
                        for (int var14 = 0; var14 < var12.field851.length; var14++) {
                            if (var13 + 1 == var12.field851[var14]) {
                                var7 += var12.field790[var14];
                            }
                        }
                    }
                }
                if (var9 == 17) {
                    var8 = 3;
                }
                if (var9 == 5) {
                    var7 = class50.field812[var3[var5++]];
                }
                if (var9 == 6) {
                    var7 = class265.field4719[class208.field3791[var3[var5++]] - 1];
                }
                if (var9 == 7) {
                    var7 = class50.field812[var3[var5++]] * 100 / 46875;
                }
                if (var9 == 8) {
                    var7 = class156.field2904.field2076;
                }
                if (var9 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class261.field4654[var15]) {
                            var7 += class208.field3791[var15];
                        }
                    }
                }
                if (var9 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class50 var18 = client.method1144((byte) -9, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class83.method585(var19, -1).field3687 || class63.field1223)) {
                        for (int var20 = 0; var20 < var18.field851.length; var20++) {
                            if (var19 + 1 == var18.field851[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var9 == 11) {
                    var7 = class208.field3783;
                }
                if (var9 == 12) {
                    var7 = class28.field408;
                }
                if (var9 == 13) {
                    int var21 = class50.field812[var3[var5++]];
                    int var22 = var3[var5++];
                    var7 = (var21 & 0x1 << var22) == 0 ? 0 : 1;
                }
                if (var9 == 14) {
                    int var23 = var3[var5++];
                    var7 = class84.method623(var23, -3);
                }
                if (var9 == 18) {
                    var7 = (class156.field2904.field3985 >> 7) + class242.field4441;
                }
                if (var9 == 19) {
                    var7 = (class156.field2904.field4005 >> 7) + class220.field3962;
                }
                if (var9 == 20) {
                    var7 = var3[var5++];
                }
                if (var8 == 0) {
                    if (var6 == 0) {
                        var4 += var7;
                    }
                    if (var6 == 1) {
                        var4 -= var7;
                    }
                    if (var6 == 2 && var7 != 0) {
                        var4 /= var7;
                    }
                    if (var6 == 3) {
                        var4 *= var7;
                    }
                    var6 = 0;
                } else {
                    var6 = var8;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)I")
    public static final int method1591(int arg0) {
        if (arg0 != 50) {
            return -70;
        }
        field4083++;
        if ((double) class246.field4502 == 3.0D) {
            return 37;
        } else if ((double) class246.field4502 == 4.0D) {
            return 50;
        } else if ((double) class246.field4502 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method1592(byte arg0) {
        field4076 = null;
        field4073 = null;
        if (arg0 != 35) {
            method1590((class50) null, (byte) -79, -52);
        }
        field4077 = null;
        field4082 = null;
        field4075 = null;
        field4084 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)I")
    public static final int method1593(int arg0, int arg1) {
        if (arg1 != -15) {
            method1590((class50) null, (byte) -11, 99);
        }
        field4079++;
        return arg0 >>> 7;
    }
}
