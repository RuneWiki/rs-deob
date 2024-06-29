import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class130 {

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "Lhb;")
    public static class44 field3117 = class102.method810("zur-Uck auf die RuneScape)2Webseite gehen", -28606);

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public static int field3116 = -1;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Lhb;")
    private static class44 field3113 = class102.method810("Attack", -28606);

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Lhb;")
    public static class44 field3115 = class102.method810("Ladevorgang )2 bitte warten Sie)3", -28606);

    @OriginalMember(owner = "client!wc", name = "l", descriptor = "[I")
    public static int[] field3120 = new int[2000];

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public static int field3123 = 0;

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Lhb;")
    public static class44 field3111 = field3113;

    @OriginalMember(owner = "client!wc", name = "m", descriptor = "Lhb;")
    public static class44 field3121 = class102.method810(" x ", -28606);

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public static int field3112;

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!wc", name = "k", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!wc", name = "n", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "Lqd;")
    public static class100 field3114;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Ltd;")
    public static class116 field3109;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "[Lhc;")
    public static class45[] field3124;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Ljc;", line = 16)
    public static final class57 method965(int arg0, int arg1) {
        field3110++;
        class57 var2 = (class57) class66.field1650.method330((long) arg0, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class75.field1900.method892(6, arg0, false);
        class57 var4 = new class57();
        int var5 = 49 / ((-arg1 - 3) / 40);
        var4.field1491 = arg0;
        if (var3 != null) {
            var4.method540((byte) 94, new class131(var3));
        }
        var4.method528((byte) -40);
        if (var4.field1493) {
            var4.field1489 = false;
            var4.field1499 = false;
        }
        class66.field1650.method332(var4, 0, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(B)V", line = 50)
    public static void method966(byte arg0) {
        field3114 = null;
        field3113 = null;
        field3115 = null;
        field3121 = null;
        if (arg0 > 0) {
            return;
        }
        field3111 = null;
        field3124 = null;
        field3120 = null;
        field3109 = null;
        field3117 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIIII)V", line = 72)
    public static final void method967(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -55 % ((arg3 + 55) / 61);
        int var7 = class89.field2283.method248(arg4, arg0, arg5);
        field3112++;
        if (var7 != 0) {
            int var8 = class89.field2283.method278(arg4, arg0, arg5, var7);
            int var9 = var8 >> 6 & 0x3;
            int var10 = var8 & 0x1F;
            int var11 = arg1;
            int[] var12 = class4.field107.field1131;
            if (var7 > 0) {
                var11 = arg2;
            }
            int var13 = arg0 * 4 + (103 - arg5) * 4 * 512 + 24624;
            int var14 = var7 >> 14 & 0x7FFF;
            class57 var15 = method965(var14, -88);
            if (var15.field1464 == -1) {
                if (var10 == 0 || var10 == 2) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 1) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 515] = var11;
                        var12[var13 + 1024 + 3] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1536 + 1] = var11;
                        var12[var13 + 2 + 1536] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
                if (var10 == 3) {
                    if (var9 == 0) {
                        var12[var13] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 3 + 1536] = var11;
                    } else if (var9 == 3) {
                        var12[var13 + 1536] = var11;
                    }
                }
                if (var10 == 2) {
                    if (var9 == 3) {
                        var12[var13] = var11;
                        var12[var13 + 512] = var11;
                        var12[var13 + 1024] = var11;
                        var12[var13 + 1536] = var11;
                    } else if (var9 == 0) {
                        var12[var13] = var11;
                        var12[var13 + 1] = var11;
                        var12[var13 + 2] = var11;
                        var12[var13 + 3] = var11;
                    } else if (var9 == 1) {
                        var12[var13 + 3] = var11;
                        var12[var13 + 3 + 512] = var11;
                        var12[var13 + 3 + 1024] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    } else if (var9 == 2) {
                        var12[var13 + 1536] = var11;
                        var12[var13 + 1537] = var11;
                        var12[var13 + 1536 + 2] = var11;
                        var12[var13 + 1536 + 3] = var11;
                    }
                }
            } else {
                class83 var16 = class69.field1715[var15.field1464];
                if (var16 != null) {
                    int var17 = (var15.field1498 * 4 - var16.field2127) / 2;
                    int var18 = (var15.field1458 * 4 - var16.field2125) / 2;
                    var16.method680(arg0 * 4 + var17 + 48, (-arg5 + 104 - var15.field1458) * 4 + var18 + 48);
                }
            }
        }
        int var19 = class89.field2283.method261(arg4, arg0, arg5);
        if (var19 != 0) {
            int var20 = class89.field2283.method278(arg4, arg0, arg5, var19);
            int var21 = var20 >> 6 & 0x3;
            int var22 = var20 & 0x1F;
            int var23 = var19 >> 14 & 0x7FFF;
            class57 var24 = method965(var23, 78);
            if (var24.field1464 != -1) {
                class83 var25 = class69.field1715[var24.field1464];
                if (var25 != null) {
                    int var26 = (var24.field1458 * 4 - var25.field2125) / 2;
                    int var27 = (var24.field1498 * 4 - var25.field2127) / 2;
                    var25.method680(arg0 * 4 + var27 + 48, (104 - arg5 + -var24.field1458) * 4 + 48 + var26);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = class4.field107.field1131;
                int var30 = (103 - arg5) * 512 * 4 + arg0 * 4 + 24624;
                if (var21 == 0 || var21 == 2) {
                    var29[var30 + 1536] = var28;
                    var29[var30 + 1024 + 1] = var28;
                    var29[var30 + 2 + 512] = var28;
                    var29[var30 + 3] = var28;
                } else {
                    var29[var30] = var28;
                    var29[var30 + 1 + 512] = var28;
                    var29[var30 + 1026] = var28;
                    var29[var30 + 1539] = var28;
                }
            }
        }
        int var31 = class89.field2283.method274(arg4, arg0, arg5);
        if (var31 == 0) {
            return;
        }
        int var32 = var31 >> 14 & 0x7FFF;
        class57 var33 = method965(var32, -92);
        if (var33.field1464 == -1) {
            return;
        }
        class83 var34 = class69.field1715[var33.field1464];
        if (var34 != null) {
            int var35 = (var33.field1498 * 4 - var34.field2127) / 2;
            int var36 = (var33.field1458 * 4 - var34.field2125) / 2;
            var34.method680(arg0 * 4 + var35 + 48, (-var33.field1458 + -arg5 + 104) * 4 + var36 + 48);
            return;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lne;", line = 366)
    public static final class83 method968(int arg0) {
        field3119++;
        class83 var1 = new class83();
        var1.field2124 = class77.field1935;
        var1.field2126 = class31.field768;
        var1.field2128 = class63.field1602[0];
        var1.field2123 = class84.field2133[0];
        var1.field2127 = class41.field941[0];
        if (arg0 != 9178) {
            method965(120, -93);
        }
        var1.field2125 = class63.field1607[0];
        var1.field2129 = class117.field2861;
        var1.field2122 = class84.field2147[0];
        class113.method865(false);
        return var1;
    }
}
