import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class57 extends class104 {

    @OriginalMember(owner = "client!gg", name = "A", descriptor = "I")
    public int field1043 = 0;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field1054 = 0;

    @OriginalMember(owner = "client!gg", name = "W", descriptor = "[J")
    public static long[] field1064 = new long[32];

    @OriginalMember(owner = "client!gg", name = "x", descriptor = "I")
    public static int field1040;

    @OriginalMember(owner = "client!gg", name = "B", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!gg", name = "C", descriptor = "I")
    public int field1045;

    @OriginalMember(owner = "client!gg", name = "D", descriptor = "I")
    public int field1046;

    @OriginalMember(owner = "client!gg", name = "F", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public int field1050;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public int field1060;

    @OriginalMember(owner = "client!gg", name = "T", descriptor = "I")
    public static int field1061;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public int field1063;

    @OriginalMember(owner = "client!gg", name = "X", descriptor = "I")
    public int field1065;

    @OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
    public int field1066;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "Lsb;")
    public class102 field1049;

    @OriginalMember(owner = "client!gg", name = "E", descriptor = "Lbb;")
    public class116 field1047;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "Lbb;")
    public class116 field1058;

    @OriginalMember(owner = "client!gg", name = "y", descriptor = "Laf;")
    public class156 field1041;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "Leg;")
    public static class33 field1059;

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "Lqb;")
    public class76 field1062;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "Z")
    public boolean field1053;

    @OriginalMember(owner = "client!gg", name = "z", descriptor = "[I")
    public int[] field1042;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method379(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (class192.field3446 == 0) {
            int var7 = class90.field1456;
            class142.field2366++;
            int var8 = class165.field2797;
            int var9 = class29.field416;
            int var10 = class189.field3328;
            int var11 = (var9 - var7) * (arg3 - arg2) / arg6 + var7;
            int var12 = (arg4 - arg1) * (var10 - var8) / arg0 + var8;
            if (class197.field3523 && (class147.field2482 & 0x40) == 64) {
                class33 var13 = class10.method74(class3.field21, class36.field659, (byte) 123);
                if (var13 == null) {
                    class266.method1825((byte) -110);
                } else {
                    class223.method1549(class14.field171, 0L, 500, var11, (short) 47, var12, class273.field4828);
                }
            } else {
                class223.method1549(class199.field3532, 0L, 500, var11, (short) 9, var12, class26.field385);
            }
        }
        field1057++;
        long var14 = -1L;
        for (int var16 = 0; var16 < class242.field4308; var16++) {
            long var17 = class21.field294[var16];
            int var19 = (int) var17 & 0x7F;
            int var20 = ((int) var17 & 0x3FA4) >> 7;
            int var21 = (int) (var17 >>> 32) & Integer.MAX_VALUE;
            int var22 = ((int) var17 & 0x74A1276A) >> 29;
            if (var14 != var17) {
                var14 = var17;
                if (var22 == 2 && class261.method1792(class261.field4598, var19, var20, var17)) {
                    class102 var23 = class31.method216(var21, (byte) 117);
                    if (var23.field1649 != null) {
                        var23 = var23.method643(10853);
                    }
                    if (var23 == null) {
                        continue;
                    }
                    if (class192.field3446 == 1) {
                        class253.field4479++;
                        class223.method1549(class266.field4708, var17, 500, var19, (short) 15, var20, class228.method1629(new class191[] { class69.field1216, class54.field970, var23.field1643 }, (byte) -84));
                    } else if (!class197.field3523) {
                        class191[] var24 = var23.field1651;
                        class145.field2444++;
                        if (class271.field4784) {
                            var24 = class236.method1669(var24, false);
                        }
                        if (var24 != null) {
                            for (int var25 = 4; var25 >= 0; var25--) {
                                if (var24[var25] != null) {
                                    client.field1743++;
                                    short var26 = 0;
                                    if (var25 == 0) {
                                        var26 = 45;
                                    }
                                    if (var25 == 1) {
                                        var26 = 7;
                                    }
                                    if (var25 == 2) {
                                        var26 = 1;
                                    }
                                    if (var25 == 3) {
                                        var26 = 37;
                                    }
                                    if (var25 == 4) {
                                        var26 = 1002;
                                    }
                                    class223.method1549(var24[var25], var17, 500, var19, var26, var20, class228.method1629(new class191[] { class176.field3022, var23.field1643 }, (byte) -89));
                                }
                            }
                        }
                        class223.method1549(class149.field2563, (long) var23.field1690, 500, var19, (short) 1005, var20, class228.method1629(new class191[] { class176.field3022, var23.field1643 }, (byte) -33));
                    } else if ((class147.field2482 & 0x4) == 4) {
                        class223.method1549(class14.field171, var17, 500, var19, (short) 3, var20, class228.method1629(new class191[] { class45.field806, class54.field970, var23.field1643 }, (byte) -79));
                        class68.field1194++;
                    }
                }
                if (var22 == 1) {
                    class156 var27 = class115.field1901[var21];
                    if (var27.field2663.field3208 == 1 && (var27.field3003 & 0x7F) == 64 && (var27.field2972 & 0x7F) == 64) {
                        for (int var28 = 0; var28 < class197.field3514; var28++) {
                            class156 var31 = class115.field1901[class256.field4542[var28]];
                            if (var31 != null && var27 != var31 && var31.field2663.field3208 == 1 && var27.field3003 == var31.field3003 && var27.field2972 == var31.field2972) {
                                class230.method1636((byte) 116, class256.field4542[var28], var20, var19, var31.field2663);
                            }
                        }
                        for (int var29 = 0; var29 < class260.field4586; var29++) {
                            class76 var30 = class245.field4357[class73.field1271[var29]];
                            if (var30 != null && var27.field3003 == var30.field3003 && var27.field2972 == var30.field2972) {
                                class217.method1478(var30, var20, 104, var19, class73.field1271[var29]);
                            }
                        }
                    }
                    class230.method1636((byte) 126, var21, var20, var19, var27.field2663);
                }
                if (var22 == 0) {
                    class76 var32 = class245.field4357[var21];
                    if ((var32.field3003 & 0x7F) == 64 && (var32.field2972 & 0x7F) == 64) {
                        for (int var33 = 0; var33 < class197.field3514; var33++) {
                            class156 var36 = class115.field1901[class256.field4542[var33]];
                            if (var36 != null && var36.field2663.field3208 == 1 && var32.field3003 == var36.field3003 && var32.field2972 == var36.field2972) {
                                class230.method1636((byte) 124, class256.field4542[var33], var20, var19, var36.field2663);
                            }
                        }
                        for (int var34 = 0; var34 < class260.field4586; var34++) {
                            class76 var35 = class245.field4357[class73.field1271[var34]];
                            if (var35 != null && var32 != var35 && var32.field3003 == var35.field3003 && var32.field2972 == var35.field2972) {
                                class217.method1478(var35, var20, 104, var19, class73.field1271[var34]);
                            }
                        }
                    }
                    class217.method1478(var32, var20, 104, var19, var21);
                }
                if (var22 == 3) {
                    class175 var37 = class75.field1281[class261.field4598][var19][var20];
                    if (var37 != null) {
                        for (class222 var38 = (class222) var37.method1177(true); var38 != null; var38 = (class222) var37.method1174((byte) -47)) {
                            int var39 = var38.field3966.field2587;
                            class148 var40 = class100.method623(-1, var39);
                            if (class192.field3446 == 1) {
                                class223.method1549(class266.field4708, (long) var39, 500, var19, (short) 51, var20, class228.method1629(new class191[] { class69.field1216, class65.field1137, var40.field2529 }, (byte) -36));
                                class184.field3210++;
                            } else if (!class197.field3523) {
                                class270.field4763++;
                                class191[] var41 = var40.field2508;
                                if (class271.field4784) {
                                    var41 = class236.method1669(var41, false);
                                }
                                for (int var42 = 4; var42 >= 0; var42--) {
                                    if (var41 != null && var41[var42] != null) {
                                        class85.field1401++;
                                        byte var43 = 0;
                                        if (var42 == 0) {
                                            var43 = 59;
                                        }
                                        if (var42 == 1) {
                                            var43 = 2;
                                        }
                                        if (var42 == 2) {
                                            var43 = 26;
                                        }
                                        if (var42 == 3) {
                                            var43 = 20;
                                        }
                                        if (var42 == 4) {
                                            var43 = 14;
                                        }
                                        class223.method1549(var41[var42], (long) var39, 500, var19, var43, var20, class228.method1629(new class191[] { class85.field1400, var40.field2529 }, (byte) -35));
                                    } else if (var42 == 2) {
                                        class175.field2937++;
                                        class223.method1549(class5.field41, (long) var39, 500, var19, (short) 26, var20, class228.method1629(new class191[] { class85.field1400, var40.field2529 }, (byte) -11));
                                    }
                                }
                                class223.method1549(class149.field2563, (long) var39, 500, var19, (short) 1004, var20, class228.method1629(new class191[] { class85.field1400, var40.field2529 }, (byte) -119));
                            } else if ((class147.field2482 & 0x1) == 1) {
                                class173.field2924++;
                                class223.method1549(class14.field171, (long) var39, 500, var19, (short) 41, var20, class228.method1629(new class191[] { class45.field806, class65.field1137, var40.field2529 }, (byte) -108));
                            }
                        }
                    }
                }
            }
        }
        if (arg5 > -80) {
            field1059 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)V")
    public static final void method380(int arg0, int arg1) {
        int var2 = 106 / ((arg0 - 14) / 39);
        field1061++;
        class241 var3 = class14.method97(1, arg1, -61);
        var3.method1691(0);
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)V")
    public static final void method381(byte arg0, int arg1) {
        field1056++;
        class151.field2589 = 1000 / arg1;
        if (arg0 < 124) {
            field1059 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    public static final void method382(boolean arg0, int arg1) {
        if (arg1 != 64) {
            method382(false, -104);
        }
        byte[][] var2 = class69.field1214;
        field1040++;
        int var3 = class248.field4409.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class154.field2642[var4] >> 8) * 64 - class225.field4061;
                int var7 = (class154.field2642[var4] & 0xFF) * 64 - class193.field3474;
                class228.method1632((byte) 119);
                class59.method393(-125, arg0, var7, class82.field1383, var6, var5);
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)Lmg;")
    public static final class49 method383(int arg0, int arg1, int arg2) {
        field1051++;
        class49 var3 = (class49) class149.field2577.method1173(arg2 - 28815);
        if (arg2 != 28908) {
            method381((byte) -84, -48);
        }
        while (var3 != null) {
            if (var3.field892 && var3.method329(arg0, arg1, false)) {
                return var3;
            }
            var3 = (class49) class149.field2577.method1175(-1);
        }
        return null;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
    public final void method384(int arg0) {
        if (arg0 != 0) {
            this.field1043 = 89;
        }
        int var2 = this.field1063;
        if (this.field1049 != null) {
            class102 var5 = this.field1049.method643(10853);
            if (var5 == null) {
                this.field1045 = 0;
                this.field1044 = 0;
                this.field1063 = -1;
                this.field1042 = null;
                this.field1046 = 0;
            } else {
                this.field1045 = var5.field1688;
                this.field1046 = var5.field1680 * 128;
                this.field1044 = var5.field1640;
                this.field1042 = var5.field1692;
                this.field1063 = var5.field1674;
            }
        } else if (this.field1041 != null) {
            int var3 = class242.method1699(this.field1041, -1);
            if (var2 != var3) {
                class184 var4 = this.field1041.field2663;
                this.field1063 = var3;
                if (var4.field3225 != null) {
                    var4 = var4.method1245((byte) -63);
                }
                if (var4 == null) {
                    this.field1046 = 0;
                } else {
                    this.field1046 = var4.field3173 * 128;
                }
            }
        } else if (this.field1062 != null) {
            this.field1063 = class1.method4((byte) -126, this.field1062);
            this.field1046 = this.field1062.field1299 * 128;
        }
        field1052++;
        if (this.field1063 != var2 && this.field1058 != null) {
            class270.field4764.method504(this.field1058);
            this.field1058 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(I)V")
    public static void method385(int arg0) {
        field1059 = null;
        if (arg0 > 39) {
            field1064 = null;
        }
    }
}
