import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class151 {

    @OriginalMember(owner = "client!qb", name = "b", descriptor = "[S")
    public static short[] field1974 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!qb", name = "e", descriptor = "I")
    public static int field1977;

    @OriginalMember(owner = "client!qb", name = "f", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!qb", name = "g", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!qb", name = "c", descriptor = "[I")
    public static int[] field1975;

    static {
        new class446("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(I)V", line = 3)
    public static void method986(int arg0) {
        field1974 = null;
        field1975 = null;
        if (arg0 != 1011) {
            field1973 = -118;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZI)S", line = 21)
    public static final short method987(boolean arg0, int arg1) {
        field1978++;
        if (arg0) {
            field1974 = null;
        }
        int var2 = (arg1 & 0xFF62) >> 10;
        int var3 = arg1 >> 3 & 0x70;
        int var4 = arg1 & 0x7F;
        int var5 = var4 > 64 ? (127 - var4) * var3 >> 7 : var3 * var4 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(BII)V", line = 56)
    public static final void method988(byte arg0, int arg1, int arg2) {
        if ((class12.field224 > class12.field223)) {
            class12.field223 = (float) ((double) class12.field223 / 30.0D + (double) class12.field223);
            if (class12.field223 > class12.field224) {
                class12.field223 = class12.field224;
            }
            class194.method1311(0);
            class12.field222 = (int) class12.field223 >> 1;
            class12.field217 = class384.method2405(class12.field222, (byte) -6);
        } else if (class12.field224 < class12.field223) {
            class12.field223 = (float) ((double) class12.field223 - (double) class12.field223 / 30.0D);
            if (class12.field223 < class12.field224) {
                class12.field223 = class12.field224;
            }
            class194.method1311(0);
            class12.field222 = (int) class12.field223 >> 1;
            class12.field217 = class384.method2405(class12.field222, (byte) -6);
        }
        int var3 = -109 / ((-arg0 - 74) / 48);
        field1977++;
        if (class376.field5712 != -1 && class291.field4259 != -1) {
            int var4 = class376.field5712 - class267.field3712;
            if (var4 < 2 || var4 > 2) {
                var4 /= 8;
            }
            int var5 = class291.field4259 - class253.field3514;
            if (var5 < 2 || var5 > 2) {
                var5 /= 8;
            }
            class267.field3712 -= -var4;
            class253.field3514 += var5;
            if (var4 == 0 && var5 == 0) {
                class376.field5712 = -1;
                class291.field4259 = -1;
            }
            class194.method1311(0);
        }
        if (class84.field1223 <= 0) {
            class439.field6616 = -1;
            class390.field5956 = -1;
        } else {
            class150.field1970--;
            if (class150.field1970 == 0) {
                class150.field1970 = 100;
                class84.field1223--;
            }
        }
        if (!class222.field3108 || class372.field5663 == null) {
            return;
        }
        for (class408 var6 = (class408) class372.field5663.method445(33); var6 != null; var6 = (class408) class372.field5663.method451(false)) {
            class38 var7 = class12.field210.method1851(36, var6.field6198.field7129);
            if (var6.method2519(arg1, 0, arg2)) {
                if (var7.field559 != null) {
                    if (var7.field559[4] != null) {
                        class24.method227(false, 1011, 0, (byte) 123, true, var7.field570, -1, -1, var7.field559[4], (long) var6.field6198.field7129, var7.field571);
                    }
                    if (var7.field559[3] != null) {
                        class24.method227(false, 1008, 0, (byte) -75, true, var7.field570, -1, -1, var7.field559[3], (long) var6.field6198.field7129, var7.field571);
                    }
                    if (var7.field559[2] != null) {
                        class24.method227(false, 1001, 0, (byte) 104, true, var7.field570, -1, -1, var7.field559[2], (long) var6.field6198.field7129, var7.field571);
                    }
                    if (var7.field559[1] != null) {
                        class24.method227(false, 1004, 0, (byte) -52, true, var7.field570, -1, -1, var7.field559[1], (long) var6.field6198.field7129, var7.field571);
                    }
                    if (var7.field559[0] != null) {
                        class24.method227(false, 1010, 0, (byte) 77, true, var7.field570, -1, -1, var7.field559[0], (long) var6.field6198.field7129, var7.field571);
                    }
                }
                if (!var6.field6198.field7131) {
                    var6.field6198.field7131 = true;
                    class343.method2220(class340.field5268, var6.field6198.field7129, var7.field571);
                }
                if (var6.field6198.field7131) {
                    class343.method2220(class452.field6817, var6.field6198.field7129, var7.field571);
                }
            } else if (var6.field6198.field7131) {
                var6.field6198.field7131 = false;
                class343.method2220(class511.field7500, var6.field6198.field7129, var7.field571);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLqa;)V", line = 204)
    public static final void method989(boolean arg0, class165 arg1) {
        field1979++;
        int var2 = class194.field2594;
        int var3 = class54.field756;
        int var4 = class428.field6504;
        int var5 = class392.field5988 - 3;
        byte var6 = 20;
        if (class181.field2446 == null || class373.field5674 == null) {
            if (class266.field3709.method1288(class348.field5379, 18555) && class266.field3709.method1288(class392.field5999, 18555)) {
                class181.field2446 = arg1.method774(class252.method1630(class266.field3709, class348.field5379, 0), true);
                class252 var7 = class252.method1630(class266.field3709, class392.field5999, 0);
                class373.field5674 = arg1.method774(var7, true);
                var7.method1634();
                class315.field4591 = arg1.method774(var7, true);
            } else {
                arg1.method747(var2, var3, var4, var6, 255 - class322.field4658 << 24 | class519.field7625, 1);
            }
        }
        if (class181.field2446 != null && class373.field5674 != null) {
            int var8 = (var4 - class373.field5674.method296() * 2) / class181.field2446.method296();
            for (int var9 = 0; var9 < var8; var9++) {
                class181.field2446.method2201(var2 + class373.field5674.method296() + class181.field2446.method296() * var9, var3);
            }
            class373.field5674.method2201(var2, var3);
            class315.field4591.method2201(var2 + var4 - class315.field4591.method296(), var3);
        }
        class199.field2653.method1712((byte) 66, class251.field3498.method2705((byte) 69, class257.field3556), class121.field1652 | 0xFF000000, -1, var2 + 3, var3 - -14);
        arg1.method747(var2, var3 + var6, var4, var5 - var6, -class322.field4658 + 255 << 24 | class519.field7625, 1);
        int var10 = class502.field7404.method2323((byte) -118);
        int var11 = class502.field7404.method2325(-89);
        int var12 = 0;
        for (class54 var13 = (class54) class131.field1769.method445(33); var13 != null; var13 = (class54) class131.field1769.method451(false)) {
            int var31 = (class367.field5621 - (var12 + 1)) * 16 + var3 + var6 + 13;
            if (var2 < var10 && var2 + var4 > var10 && var11 > var31 - 13 && var31 + 4 > var11 && var13.field759) {
                arg1.method747(var2, var31 - 12, var4, 16, 255 - class378.field5772 << 24 | class466.field6942, 1);
            }
            var12++;
        }
        if ((class398.field6074 == null || class200.field2697 == null || class355.field5488 == null) && class266.field3709.method1288(class354.field5483, 18555) && class266.field3709.method1288(class155.field2023, 18555) && class266.field3709.method1288(class433.field6581, 18555)) {
            class252 var14 = class252.method1630(class266.field3709, class155.field2023, 0);
            class200.field2697 = arg1.method774(var14, true);
            var14.method1634();
            class153.field2004 = arg1.method774(var14, true);
            class398.field6074 = arg1.method774(class252.method1630(class266.field3709, class354.field5483, 0), true);
            class252 var15 = class252.method1630(class266.field3709, class433.field6581, 0);
            class355.field5488 = arg1.method774(var15, true);
            var15.method1634();
            class407.field6168 = arg1.method774(var15, true);
        }
        if (class398.field6074 != null && class200.field2697 != null && class355.field5488 != null) {
            int var16 = (var4 - (class355.field5488.method296() * 2)) / class398.field6074.method296();
            for (int var17 = 0; var17 < var16; var17++) {
                class398.field6074.method2201(var2 + class355.field5488.method296() + (var17 * class398.field6074.method296()), -class398.field6074.method305() + var5 + var3);
            }
            int var18 = (var5 - var6 - class355.field5488.method305()) / class200.field2697.method305();
            for (int var19 = 0; var19 < var18; var19++) {
                class200.field2697.method2201(var2, class200.field2697.method305() * var19 + var3 + var6);
                class153.field2004.method2201(var4 + var2 - class153.field2004.method296(), var3 - -var6 - -(class200.field2697.method305() * var19));
            }
            class355.field5488.method2201(var2, var5 + var3 - class355.field5488.method305());
            class407.field6168.method2201(var4 + (var2 - class355.field5488.method296()), var3 - -var5 - class355.field5488.method305());
        }
        int var20 = 0;
        if (!arg0) {
            return;
        }
        for (class54 var21 = (class54) class131.field1769.method445(33); var21 != null; var21 = (class54) class131.field1769.method451(false)) {
            int var22 = (class367.field5621 - var20 - 1) * 16 + var6 + var3 + 13;
            int var23 = class121.field1652 | 0xFF000000;
            if (var2 < var10 && var2 + var4 > var10 && (var22 - 13) < var11 && var11 < (var22 + 4) && var21.field759) {
                var23 = class323.field4679 | 0xFF000000;
            }
            int[] var24 = null;
            if (class362.method2307(var21.field764, 22116)) {
                var24 = class103.field1489.method1603((byte) -99, (int) var21.field758).field1036;
            } else if (var21.field753 != -1) {
                var24 = class103.field1489.method1603((byte) -99, var21.field753).field1036;
            } else if (class296.method1894(var21.field764, 115)) {
                class24 var25 = (class24) class406.field6158.method1747((long) ((int) var21.field758), false);
                if (var25 != null) {
                    class17 var26 = var25.field348;
                    class258 var27 = var26.field274;
                    if (var27.field3627 != null) {
                        var27 = var27.method1660(class288.field4208, (byte) 74);
                    }
                    if (var27 != null) {
                        var24 = var27.field3632;
                    }
                }
            } else if (class270.method1737((byte) -36, var21.field764)) {
                Object var28 = null;
                class209 var29;
                if (var21.field764 == 1007) {
                    var29 = class432.field6575.method1872((int) var21.field758, !arg0);
                } else {
                    var29 = class432.field6575.method1872((int) (var21.field758 >>> 32 & 0x7FFFFFFFL), !arg0);
                }
                if (var29.field2934 != null) {
                    var29 = var29.method1435(-1, class288.field4208);
                }
                if (var29 != null) {
                    var24 = var29.field2931;
                }
            }
            String var30 = class400.method2476(var21, 32);
            if (var24 != null) {
                var30 = var30 + class200.method1359(var24, (byte) 116);
            }
            class199.field2653.method1707(var22, var23, var2 + 3, -124, class311.field4548, 0, var30, class203.field2718);
            var20++;
            if (var21.field755) {
                class507.field7463.method2201(class175.field2338.method564(105, var30) + var2 + 5, var22 - 12);
            }
        }
        class284.method1825((byte) 126, class54.field756, class428.field6504, class194.field2594, class392.field5988);
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lnj;BI)V", line = 406)
    public static final void method990(class164 arg0, byte arg1, int arg2) {
        field1976++;
        if (class88.field1269 != null) {
            try {
                class88.field1269.method1159(-99, 0L);
                class88.field1269.method1153(arg0.field2219, 104, 24, arg2);
            } catch (Exception var3) {
            }
        }
        if (arg1 != -95) {
            method989(false, null);
        }
    }
}
