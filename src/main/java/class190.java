import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class190 {

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public int field2730 = -1;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public int field2740 = -1;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "[I")
    public static int[] field2731 = new int[3];

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "Lrk;")
    public static class427 field2738;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "[I")
    public int[] field2727;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2728;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "[S")
    public static short[] field2737;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Lgb;", line = 5)
    public static final class241 method1364(int arg0, int arg1, int arg2) {
        class224 var3 = class118.field1653[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class241 var4 = var3.field3110;
            var3.field3110 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILsa;IBLpe;Lsa;Z[[I[[B[[B[[B[[B)V", line = 16)
    public static final void method1365(int arg0, int arg1, class411 arg2, int arg3, byte arg4, class391 arg5, class411 arg6, boolean arg7, int[][] arg8, byte[][] arg9, byte[][] arg10, byte[][] arg11, byte[][] arg12) {
        if (arg4 != 0) {
            method1368(true);
        }
        if (class243.field3355 == 0 && !class26.field467) {
            class412.method2550(arg3, arg7, arg0, arg12, arg4 - 104, arg2, arg8, arg6, arg1, arg10, arg5, arg9, arg11);
        } else {
            class172.method1283(arg6, arg5, arg8, arg3, arg9, (byte) 96, arg12, arg1, arg7, arg10, arg11, arg2, arg0);
        }
        field2732++;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V", line = 35)
    public static final void method1366(byte arg0) {
        field2741++;
        for (class417 var1 = (class417) class329.field4465.method1240((byte) -90); var1 != null; var1 = (class417) class329.field4465.method1245(1)) {
            if (var1.field5842) {
                var1.method2584((byte) 24);
            }
        }
        if (arg0 <= 12) {
            method1365(-62, -35, (class411) null, -21, (byte) -59, (class391) null, (class411) null, true, (int[][]) null, (byte[][]) null, (byte[][]) null, (byte[][]) null, (byte[][]) null);
        }
        for (class417 var2 = (class417) client.field3444.method1240((byte) -80); var2 != null; var2 = (class417) client.field3444.method1245(1)) {
            if (var2.field5842) {
                var2.method2584((byte) 96);
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILap;B)V", line = 70)
    public final void method1367(int arg0, class289 arg1, byte arg2) {
        if (arg2 != -62) {
            this.method1370(93, -43, (class289) null, -24);
        }
        field2734++;
        while (true) {
            int var4 = arg1.method1861((byte) -72);
            if (var4 == 0) {
                return;
            }
            this.method1370(12489, arg0, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)Lu;", line = 95)
    public static final class187 method1368(boolean arg0) {
        field2729++;
        class384.field5390 = 0;
        if (arg0) {
            method1368(false);
        }
        return class42.method400(50);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(B)V", line = 110)
    public static void method1369(byte arg0) {
        if (arg0 != -23) {
            method1368(false);
        }
        field2731 = null;
        field2728 = null;
        field2738 = null;
        field2737 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IILap;I)V", line = 126)
    private final void method1370(int arg0, int arg1, class289 arg2, int arg3) {
        field2739++;
        if (arg3 == 1) {
            this.field2730 = arg2.method1853(arg0 ^ 0xFFFFCF69);
        } else if (arg3 == 2) {
            this.field2727 = new int[arg2.method1861((byte) -72)];
            for (int var5 = 0; var5 < this.field2727.length; var5++) {
                this.field2727[var5] = arg2.method1853(-93);
            }
        } else if (arg3 == 3) {
            this.field2740 = arg2.method1861((byte) -72);
        }
        if (arg0 != 12489) {
            method1369((byte) 59);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I[BZZII[Loa;IILpe;II)[I", line = 162)
    public static final int[] method1371(int arg0, byte[] arg1, boolean arg2, boolean arg3, int arg4, int arg5, class151[] arg6, int arg7, int arg8, class391 arg9, int arg10, int arg11) {
        field2736++;
        int var12 = (arg7 & 0x7) * 8;
        if (!arg2) {
            method1369((byte) -8);
        }
        int var13 = (arg4 & 0x7) * 8;
        if (!arg3) {
            class151 var14 = arg6[arg0];
            for (int var15 = 0; var15 < 8; var15++) {
                for (int var16 = 0; var16 < 8; var16++) {
                    int var17 = class382.method2373(var15 & 0x7, var16 & 0x7, -5410, arg5) + arg11;
                    int var18 = class264.method1704(7, arg5, var15 & 0x7, var16 & 0x7) + arg8;
                    if (var17 > 0 && class116.field1621 - 1 > var17 && var18 > 0 && var18 < (class385.field5425 - 1)) {
                        var14.method1158(var18, arg2, var17);
                    }
                }
            }
        }
        byte var19;
        if (arg3) {
            var19 = 1;
        } else {
            var19 = 4;
        }
        class289 var20 = new class289(arg1);
        int var21 = (arg7 & 0xFFFFFFF8) << 3;
        int var22 = (arg4 & 0xFFFFFFF8) << 3;
        byte var23 = 0;
        byte var24 = 0;
        if (arg5 == 1) {
            var24 = 1;
        } else if (arg5 == 2) {
            var24 = 1;
            var23 = 1;
        } else if (arg5 == 3) {
            var23 = 1;
        }
        for (int var25 = 0; var25 < var19; var25++) {
            for (int var58 = 0; var58 < 64; var58++) {
                for (int var59 = 0; var59 < 64; var59++) {
                    if (arg10 != var25 || var58 < var12 || var58 > (var12 + 8) || var59 < var13 || var59 > var13 + 8) {
                        class180.method1327(-1, 0, -1, 0, 0, var20, 0, arg3, false, 0, false, 0);
                    } else if (var12 + 8 == var58 || var13 + 8 == var59) {
                        int var66;
                        int var67;
                        if (arg5 == 0) {
                            var66 = arg8 - (var13 - var59);
                            var67 = var58 - (var12 - arg11);
                        } else if (arg5 == 1) {
                            var67 = var59 - (var13 - arg11);
                            var66 = arg8 + 8 - (-var12 + var58);
                        } else if (arg5 == 2) {
                            var66 = arg8 + 8 - (-var13 + var59);
                            var67 = -var58 - (-var12 - (arg11 + 8));
                        } else {
                            var66 = arg8 - (var12 - var58);
                            var67 = arg11 + var13 + 8 - var59;
                        }
                        class180.method1327(var67, 0, var66, 0, var22 + var59, var20, 0, arg3, false, var21 + var58, true, arg0);
                    } else {
                        int var60 = arg11 + class382.method2373(var58 & 0x7, var59 & 0x7, -5410, arg5);
                        int var61 = arg8 + class264.method1704(7, arg5, var58 & 0x7, var59 & 0x7);
                        class180.method1327(var60, var23, var61, var24, var22 + var59, var20, arg5, arg3, false, var21 + var58, false, arg0);
                        if (var58 == 63 || var59 == 63) {
                            int var62 = var58 == 63 ? 64 : var58;
                            int var63 = var59 == 63 ? 64 : var59;
                            int var64;
                            int var65;
                            if (arg5 == 0) {
                                var64 = var62 + arg11 - var12;
                                var65 = var63 + arg8 - var13;
                            } else if (arg5 == 1) {
                                var64 = -var13 - (-var63 - arg11);
                                var65 = arg8 + var12 + 8 - var62;
                            } else if (arg5 == 2) {
                                var64 = arg11 - (-var12 - 8) - var62;
                                var65 = arg8 + var13 + 8 - var63;
                            } else {
                                var64 = var13 + (arg11 - -8) - var63;
                                var65 = var62 + arg8 - var12;
                            }
                            if (var64 >= 0 && var64 < class116.field1621 && var65 >= 0 && var65 < class385.field5425) {
                                class44.field703[arg0][var64][var65] = class44.field703[arg0][var60 + var23][var24 + var61];
                            }
                        }
                    }
                }
            }
        }
        boolean var26 = false;
        while (var20.field3938 < var20.field3882.length) {
            int var27 = var20.method1861((byte) -72);
            if (var27 == 128) {
                class334.field4534[0] = var20.method1853(-58);
                class334.field4534[1] = var20.method1833(46);
                class334.field4534[2] = var20.method1833(42);
                class334.field4534[3] = var20.method1833(99);
                class334.field4534[4] = var20.method1853(119);
                var26 = true;
            } else {
                if (var27 != 129) {
                    var20.field3938--;
                    break;
                }
                if (class438.field6281 == null) {
                    class438.field6281 = new byte[4][][];
                }
                for (int var28 = 0; var28 < 4; var28++) {
                    byte var29 = var20.method1868((byte) -121);
                    if (var29 == 0 && class438.field6281[arg0] != null) {
                        if (var28 <= arg10) {
                            int var30 = arg11;
                            int var31 = arg11 + 7;
                            int var32 = arg8;
                            if (arg8 < 0) {
                                var32 = 0;
                            } else if (arg8 >= class385.field5425) {
                                var32 = class385.field5425;
                            }
                            if (arg11 < 0) {
                                var30 = 0;
                            } else if (arg11 >= class116.field1621) {
                                var30 = class116.field1621;
                            }
                            int var33 = arg8 + 7;
                            if (var31 < 0) {
                                var31 = 0;
                            } else if (class116.field1621 <= var31) {
                                var31 = class116.field1621;
                            }
                            if (var33 < 0) {
                                var33 = 0;
                            } else if (var33 >= class385.field5425) {
                                var33 = class385.field5425;
                            }
                            while (var30 < var31) {
                                while (var33 > var32) {
                                    class438.field6281[arg0][var30][var32] = 0;
                                    var32++;
                                }
                                var30++;
                            }
                        }
                    } else if (var29 == 1) {
                        if (class438.field6281[arg0] == null) {
                            class438.field6281[arg0] = new byte[class116.field1621 + 1][class385.field5425 + 1];
                        }
                        for (int var34 = 0; var34 < 64; var34 += 4) {
                            for (int var35 = 0; var35 < 64; var35 += 4) {
                                byte var36 = var20.method1868((byte) -122);
                                if (arg10 >= var28) {
                                    for (int var37 = var34; var37 < var34 + 4; var37++) {
                                        for (int var38 = var35; var38 < (var35 + 4); var38++) {
                                            if (var12 <= var37 && var37 < var12 + 8 && var38 >= var13 && (var13 + 8) > var13) {
                                                int var39 = class382.method2373(var37 & 0x7, var38 & 0x7, -5410, arg5) + arg11;
                                                int var40 = class264.method1704(7, arg5, var37 & 0x7, var38 & 0x7) + arg8;
                                                if (var39 >= 0 && var39 < class116.field1621 && var40 >= 0 && class385.field5425 > var40) {
                                                    class438.field6281[arg0][var39][var40] = var36;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var41 = false;
        if (!arg3) {
            class116 var42 = null;
            label296: while (true) {
                int var44;
                label289: do {
                    while (true) {
                        while (var20.field3938 < var20.field3882.length) {
                            int var43 = var20.method1861((byte) -72);
                            if (var43 == 0) {
                                var42 = new class116(var20);
                            } else {
                                if (var43 == 1) {
                                    var44 = var20.method1861((byte) -72);
                                    continue label289;
                                }
                                if (var43 != 2) {
                                    throw new IllegalStateException();
                                }
                                if (var42 == null) {
                                    var42 = new class116();
                                }
                                var42.method932(var20, !arg2);
                            }
                        }
                        if (var42 != null) {
                            class344.method2181(var42, arg8 >> 3, (byte) 103, arg11 >> 3);
                        }
                        break label296;
                    }
                } while (var44 <= 0);
                for (int var45 = 0; var45 < var44; var45++) {
                    class21 var46 = new class21(var20);
                    if (var46.field391 == 31) {
                        class414 var47 = class73.method636(var20.method1853(-26), (byte) -31);
                        var46.method275(var47.field5794, var47.field5785, var47.field5797, var47.field5784, -28022);
                    }
                    int var48 = var46.field3618 >> 7;
                    int var49 = var46.field3620 >> 7;
                    if (var46.field389 == arg10 && var12 <= var48 && var12 + 8 > var48 && var13 <= var49 && (var13 + 8) > var49) {
                        int var50 = (arg11 << 7) + class244.method1605(arg5, 1023, var46.field3620 & 0x3FF, var46.field3618 & 0x3FF);
                        int var51 = class361.method2266(var46.field3618 & 0x3FF, var46.field3620 & 0x3FF, arg5, -20991) + (arg8 << 7);
                        var46.field3618 = var50;
                        var46.field3620 = var51;
                        int var52 = var46.field3618 >> 7;
                        int var53 = var46.field3620 >> 7;
                        if (var52 >= 0 && var53 >= 0 && var52 < class116.field1621 && var53 < class385.field5425) {
                            var46.field3622 = class44.field703[arg10][var52][var53] - var46.field3622;
                            if (arg9.method199() > 0) {
                                class118.method941(var46);
                            }
                        }
                    }
                }
            }
        }
        if (!var41 && class438.field6281 != null && class438.field6281[arg0] != null) {
            int var54 = arg11 + 7;
            int var55 = arg8 + 7;
            for (int var56 = arg11; var56 < var54; var56++) {
                for (int var57 = arg8; var57 < var55; var57++) {
                    class438.field6281[arg0][var56][var57] = 0;
                }
            }
        }
        if (var26) {
            return class334.field4534;
        } else {
            return null;
        }
    }
}
