import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class497 {

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "B")
    private byte field7082;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "I")
    public int field7086;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public int field7081;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public int field7080;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
    public int field7087;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "I")
    public int field7077;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "Lja;")
    public static class254 field7078 = new class254(8, 0, 4, 1);

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    public static int field7079;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "I")
    public static int field7083;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
    public static int field7084;

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "I")
    public static int field7085;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "[I")
    public static int[] field7076;

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)I")
    public final int method2967(int arg0) {
        if (arg0 != -8032) {
            method2969(27, null, -66, 77);
        }
        field7079++;
        return (this.field7082 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Z)I")
    public final int method2968(boolean arg0) {
        field7083++;
        if (arg0) {
            method2971(-63, (byte) 81, -14, -123, null, -83, -55, 82, -26, 85, 115, 6);
        }
        return this.field7082 & 0x7;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(ILr;II)V")
    public static final void method2969(int arg0, class167 arg1, int arg2, int arg3) {
        field7084++;
        if (arg0 < 0 || arg2 < 0 || class147.field2551 == 0 || class163.field2734 == 0) {
            return;
        }
        arg1.method62(class606.field8822, class638.field9190, class147.field2551, class163.field2734);
        arg1.method142(class569.field8294, class348.field5183, class147.field2551, class163.field2734);
        class396 var4 = arg1.method168();
        var4.method907(class277.field4149, class613.field8923, class571.field8304, class70.field1486, class307.field4544, class542.field7567);
        int var5 = -60 / ((arg3 + 23) / 59);
        arg1.method145(var4);
        if (class185.field2987 != null) {
            int var6 = -1;
            int var7 = -1;
            int var8 = arg1.method66();
            int var9 = (arg0 - class606.field8822) * var8 / class147.field2551;
            int var10 = (arg2 - class638.field9190) * var8 / class163.field2734;
            int var11 = arg1.method86();
            int var12 = (arg0 - class606.field8822) * var11 / class147.field2551;
            int var13 = (arg2 - class638.field9190) * var11 / class163.field2734;
            int[] var14 = new int[] { var9, var10, var8 };
            var4.method898(var14);
            int[] var15 = new int[] { var12, var13, var11 };
            var4.method898(var15);
            float var16 = 0.0F;
            int var17 = var15[0] - var14[0];
            int var18 = var15[1] - var14[1];
            int var19 = var15[2] - var14[2];
            while (var16 < 1.0F) {
                int var20 = (int) ((float) var17 * var16 + (float) var14[0]);
                int var21 = var20 >> 9;
                int var22 = (int) ((float) var19 * var16 + (float) var14[2]);
                int var23 = var22 >> 9;
                if (var21 > 0 && var23 > 0 && class675.field9604 > var21 && class218.field3316 > var23) {
                    int var24 = class532.field7456.field9814;
                    if (var24 < 3 && (class517.field7301[1][var21][var23] & 0x2) != 0) {
                        var24++;
                    }
                    if ((float) class185.field2987[var24].method552(1, var20, var22) < (float) var18 * var16 + (float) var14[1]) {
                        var6 = var20 + (class532.field7456.method3446(0) - 1 << 8) >> 9;
                        var7 = var22 + (class532.field7456.method3446(0) - 1 << 8) >> 9;
                        break;
                    }
                }
                var16 = (float) ((double) var16 + 0.01D);
            }
            if (var6 != -1 && var7 != -1) {
                if (class65.field1435 && (class489.field7001 & 0x40) != 0) {
                    class545 var25 = class183.method1339(class437.field6303, (byte) 95, class273.field4094);
                    if (var25 == null) {
                        class612.method3511(true);
                    } else {
                        class631.method3604(51, var7, -1, 0L, class578.field8409, var6, (byte) -119, true, " ->", class97.field1726, false);
                    }
                } else {
                    if (class78.field1573 == class49.field1167) {
                        class631.method3604(58, var7, -1, 0L, class265.field3902.method1733(255, class140.field2466), var6, (byte) -87, true, "", -1, false);
                    }
                    class478.field6867++;
                    class631.method3604(11, var7, -1, 0L, class676.field9609, var6, (byte) -128, true, "", class338.field5049, false);
                }
            }
        }
        class578 var26 = class207.field3172;
        for (class531 var27 = (class531) var26.method3317(-121); var27 != null; var27 = (class531) var26.method3321(-121)) {
            if ((class397.field5791 || class532.field7456.field9814 == var27.field7450.field9814) && var27.method3087(arg1, arg2, arg0, -1)) {
                boolean var28 = false;
                boolean var29 = false;
                int var30;
                int var31;
                if ((var27.field7450 instanceof class122)) {
                    var31 = ((class122) var27.field7450).field2220;
                    var30 = ((class122) var27.field7450).field2230;
                } else {
                    var30 = var27.field7450.field9815 >> 9;
                    var31 = var27.field7450.field9806 >> 9;
                }
                if (var27.field7450 instanceof class602) {
                    class602 var32 = (class602) var27.field7450;
                    int var33 = var32.method3446(0);
                    if ((var33 & 0x1) == 0 && (var32.field9806 & 0x1FF) == 0 && (var32.field9815 & 0x1FF) == 0 || (var33 & 0x1) == 1 && (var32.field9806 & 0x1FF) == 256 && (var32.field9815 & 0x1FF) == 256) {
                        int var34 = var32.field9806 - (var32.method3446(0) - 1 << 8);
                        int var35 = var32.field9815 - (var32.method3446(0) - 1 << 8);
                        for (int var36 = 0; var36 < class363.field5389; var36++) {
                            class436 var43 = (class436) class208.field3179.method2596((long) class367.field5444[var36], 121);
                            if (var43 != null) {
                                class22 var44 = var43.field6298;
                                if (class336.field5031 != var44.field8686 && var44.field8718) {
                                    int var45 = var44.field9806 - (var44.field880.field4978 - 1 << 8);
                                    int var46 = var44.field9815 - (var44.field880.field4978 - 1 << 8);
                                    if (var34 <= var45 && var44.field880.field4978 <= var32.method3446(0) - (var45 - var34 >> 9) && var35 <= var46 && var44.field880.field4978 <= (var32.method3446(0) - (var46 - var35 >> 9))) {
                                        class434.method2638(-1, class532.field7456.field9814 != var27.field7450.field9814, var44);
                                        var44.field8686 = class336.field5031;
                                    }
                                }
                            }
                        }
                        int var37 = class237.field3520;
                        int[] var38 = class47.field1140;
                        for (int var39 = 0; var39 < var37; var39++) {
                            class602 var40 = class59.field1341[var38[var39]];
                            if (var40 != null && class336.field5031 != var40.field8686 && var32 != var40 && var40.field8718) {
                                int var41 = var40.field9806 - (var40.method3446(0) - 1 << 8);
                                int var42 = var40.field9815 - (var40.method3446(0) - 1 << 8);
                                if (var34 <= var41 && var40.method3446(0) <= var32.method3446(0) - (var41 - var34 >> 9) && var42 >= var35 && var40.method3446(0) <= var32.method3446(0) - (var42 - var35 >> 9)) {
                                    class165.method1254(var40, class532.field7456.field9814 != var27.field7450.field9814, false);
                                    var40.field8686 = class336.field5031;
                                }
                            }
                        }
                    }
                    if (class336.field5031 == var32.field8686) {
                        continue;
                    }
                    class165.method1254(var32, class532.field7456.field9814 != var27.field7450.field9814, false);
                    var32.field8686 = class336.field5031;
                }
                if (var27.field7450 instanceof class22) {
                    class22 var47 = (class22) var27.field7450;
                    if (var47.field880 != null) {
                        if ((var47.field880.field4978 & 0x1) == 0 && (var47.field9806 & 0x1FF) == 0 && (var47.field9815 & 0x1FF) == 0 || (var47.field880.field4978 & 0x1) == 1 && (var47.field9806 & 0x1FF) == 256 && (var47.field9815 & 0x1FF) == 256) {
                            int var48 = var47.field9806 - (var47.field880.field4978 - 1 << 8);
                            int var49 = var47.field9815 - (var47.field880.field4978 - 1 << 8);
                            for (int var50 = 0; var50 < class363.field5389; var50++) {
                                class436 var57 = (class436) class208.field3179.method2596((long) class367.field5444[var50], 118);
                                if (var57 != null) {
                                    class22 var58 = var57.field6298;
                                    if (class336.field5031 != var58.field8686 && var47 != var58 && var58.field8718) {
                                        int var59 = var58.field9806 - (var58.field880.field4978 - 1 << 8);
                                        int var60 = var58.field9815 - (var58.field880.field4978 - 1 << 8);
                                        if (var59 >= var48 && var47.field880.field4978 - (var59 - var48 >> 9) >= var58.field880.field4978 && var60 >= var49 && var47.field880.field4978 - (var60 - var49 >> 9) >= var58.field880.field4978) {
                                            class434.method2638(-1, class532.field7456.field9814 != var27.field7450.field9814, var58);
                                            var58.field8686 = class336.field5031;
                                        }
                                    }
                                }
                            }
                            int var51 = class237.field3520;
                            int[] var52 = class47.field1140;
                            for (int var53 = 0; var53 < var51; var53++) {
                                class602 var54 = class59.field1341[var52[var53]];
                                if (var54 != null && class336.field5031 != var54.field8686 && var54.field8718) {
                                    int var55 = var54.field9806 - (var54.method3446(0) - 1 << 8);
                                    int var56 = var54.field9815 - (var54.method3446(0) - 1 << 8);
                                    if (var48 <= var55 && var54.method3446(0) <= var47.field880.field4978 - (var55 - var48 >> 9) && var49 <= var56 && var54.method3446(0) <= var47.field880.field4978 - (var56 - var49 >> 9)) {
                                        class165.method1254(var54, class532.field7456.field9814 != var27.field7450.field9814, false);
                                        var54.field8686 = class336.field5031;
                                    }
                                }
                            }
                        }
                        if (class336.field5031 == var47.field8686) {
                            continue;
                        }
                        class434.method2638(-1, class532.field7456.field9814 != var27.field7450.field9814, var47);
                        var47.field8686 = class336.field5031;
                    }
                }
                if (var27.field7450 instanceof class502) {
                    int var61 = var31 + class33.field967;
                    int var62 = var30 + class323.field4749;
                    class38 var63 = (class38) class409.field5924.method2596((long) (var61 | var62 << 14 | var27.field7450.field9814 << 28), 100);
                    if (var63 != null) {
                        for (class315 var64 = (class315) var63.field1053.method1221((byte) -22); var64 != null; var64 = (class315) var63.field1053.method1231(103)) {
                            class110 var65 = class268.field3985.method258(var64.field4652, (byte) -67);
                            if (class65.field1435 && class532.field7456.field9814 == var27.field7450.field9814) {
                                class445 var66 = class200.field3105 == -1 ? null : client.field4124.method980(43, class200.field3105);
                                if ((class489.field7001 & 0x1) != 0 && (var66 == null || var65.method986(false, var66.field6413, class200.field3105) != var66.field6413)) {
                                    class631.method3604(44, var30, -1, (long) var64.field4652, class578.field8409, var31, (byte) -107, true, class177.field2892 + " -> <col=ff9040>" + var65.field1954, class97.field1726, false);
                                    class217.field3304++;
                                }
                            }
                            if (class532.field7456.field9814 == var27.field7450.field9814) {
                                String[] var67 = var65.field1959;
                                for (int var68 = 4; var68 >= 0; var68--) {
                                    if (var67 != null && var67[var68] != null) {
                                        byte var69 = 0;
                                        if (var68 == 0) {
                                            var69 = 13;
                                        }
                                        int var70 = class419.field6041;
                                        if (var68 == 1) {
                                            var69 = 15;
                                        }
                                        if (var68 == 2) {
                                            var69 = 19;
                                        }
                                        if (var68 == 3) {
                                            var69 = 18;
                                        }
                                        if (var65.field1998 == var68) {
                                            var70 = var65.field1987;
                                        }
                                        if (var68 == 4) {
                                            var69 = 47;
                                        }
                                        if (var65.field1928 == var68) {
                                            var70 = var65.field1939;
                                        }
                                        class591.field8502++;
                                        class631.method3604(var69, var30, -1, (long) var64.field4652, var67[var68], var31, (byte) -47, true, "<col=ff9040>" + var65.field1954, var70, false);
                                    }
                                }
                            }
                            class631.method3604(1012, var30, -1, (long) var64.field4652, class265.field3897.method1733(255, class140.field2466), var31, (byte) -44, true, "<col=ff9040>" + var65.field1954, class699.field9841, class532.field7456.field9814 != var27.field7450.field9814);
                            class281.field4179++;
                        }
                    }
                }
                if (var27.field7450 instanceof class83) {
                    class83 var71 = (class83) var27.field7450;
                    class56 var72 = class237.field3521.method3515(var71.method841((byte) 52), 50);
                    if (var72.field1248 != null) {
                        var72 = var72.method662(3433, class113.field2038);
                    }
                    if (var72 != null) {
                        if (class65.field1435 && class532.field7456.field9814 == var27.field7450.field9814) {
                            class445 var73 = class200.field3105 == -1 ? null : client.field4124.method980(-120, class200.field3105);
                            if ((class489.field7001 & 0x4) != 0 && (var73 == null || var72.method663(-90, class200.field3105, var73.field6413) != var73.field6413)) {
                                class352.field5311++;
                                class631.method3604(6, var30, -1, class569.method3283(true, var30, var71, var31), class578.field8409, var31, (byte) -99, true, class177.field2892 + " -> <col=00ffff>" + var72.field1221, class97.field1726, false);
                            }
                        }
                        if (class532.field7456.field9814 == var27.field7450.field9814) {
                            String[] var74 = var72.field1237;
                            if (var74 != null) {
                                for (int var75 = 4; var75 >= 0; var75--) {
                                    if (var74[var75] != null) {
                                        short var76 = 0;
                                        int var77 = class419.field6041;
                                        if (var75 == 0) {
                                            var76 = 17;
                                        }
                                        if (var75 == 1) {
                                            var76 = 49;
                                        }
                                        if (var75 == 2) {
                                            var76 = 3;
                                        }
                                        if (var75 == 3) {
                                            var76 = 16;
                                        }
                                        if (var72.field1253 == var75) {
                                            var77 = var72.field1284;
                                        }
                                        if (var75 == 4) {
                                            var76 = 1007;
                                        }
                                        if (var72.field1252 == var75) {
                                            var77 = var72.field1289;
                                        }
                                        class631.method3604(var76, var30, -1, class569.method3283(true, var30, var71, var31), var74[var75], var31, (byte) -106, true, "<col=00ffff>" + var72.field1221, var77, false);
                                        class460.field6563++;
                                    }
                                }
                            }
                        }
                        class631.method3604(1001, var30, -1, (long) var72.field1272, class265.field3897.method1733(255, class140.field2466), var31, (byte) -40, true, "<col=00ffff>" + var72.field1221, class699.field9841, class532.field7456.field9814 != var27.field7450.field9814);
                        class682.field9654++;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(Z)V")
    public static void method2970(boolean arg0) {
        if (!arg0) {
            field7076 = null;
            field7078 = null;
        }
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(IBIILfh;IIIIIII)Z")
    public static final boolean method2971(int arg0, byte arg1, int arg2, int arg3, class605 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field7085++;
        int var12 = arg2;
        int var13 = arg10;
        if (arg1 < 26) {
            method2970(true);
        }
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg2 - var14;
        class78.field1571[var14][var15] = 99;
        int var17 = arg10 - var15;
        class284.field4218[var14][var15] = 0;
        byte var18 = 0;
        class89.field1641[var18] = arg2;
        int var19 = 0;
        int var35 = var18 + 1;
        class257.field3795[var18] = arg10;
        int[][] var20 = arg4.field8803;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class213.field3254 = var13;
                                    class399.field5808 = var12;
                                    return false;
                                }
                                var13 = class257.field3795[var19];
                                var12 = class89.field1641[var19];
                                var21 = var13 - var17;
                                var22 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var23 = var12 - arg4.field8796;
                                var24 = var13 - arg4.field8807;
                                if (arg3 == -4) {
                                    if (arg0 == var12 && arg9 == var13) {
                                        class213.field3254 = var13;
                                        class399.field5808 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -3) {
                                    if (class2.method187(arg11, arg9, var12, 2, arg7, arg5, arg7, var13, arg0)) {
                                        class399.field5808 = var12;
                                        class213.field3254 = var13;
                                        return true;
                                    }
                                } else if (arg3 == -2) {
                                    if (arg4.method3468(arg7, arg11, arg9, var13, arg5, -1, arg6, var12, arg7, arg0)) {
                                        class213.field3254 = var13;
                                        class399.field5808 = var12;
                                        return true;
                                    }
                                } else if (arg3 == -1) {
                                    if (arg4.method3475(arg0, arg6, arg9, true, arg11, var13, arg7, arg5, var12)) {
                                        class399.field5808 = var12;
                                        class213.field3254 = var13;
                                        return true;
                                    }
                                } else if (arg3 == 0 || arg3 == 1 || arg3 == 2 || arg3 == 3 || arg3 == 9) {
                                    if (arg4.method3478(arg0, arg3, arg7, arg9, 51, arg8, var13, var12)) {
                                        class213.field3254 = var13;
                                        class399.field5808 = var12;
                                        return true;
                                    }
                                } else if (arg4.method3476(arg7, arg0, var13, arg3, arg9, arg8, var12, -99)) {
                                    class399.field5808 = var12;
                                    class213.field3254 = var13;
                                    return true;
                                }
                                var26 = class284.field4218[var22][var21] + 1;
                                if (var22 > 0 && class78.field1571[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][arg7 + var24 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if ((arg7 - 1) <= var27) {
                                            class89.field1641[var35] = var12 - 1;
                                            class257.field3795[var35] = var13;
                                            class78.field1571[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class284.field4218[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if ((128 - arg7) > var22 && class78.field1571[var22 + 1][var21] == 0 && (var20[var23 + arg7][var24] & 0x60E40000) == 0 && (var20[var23 + arg7][arg7 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (var28 >= arg7 - 1) {
                                            class89.field1641[var35] = var12 + 1;
                                            class257.field3795[var35] = var13;
                                            var35 = var35 + 1 & 0xFFF;
                                            class78.field1571[var22 + 1][var21] = 8;
                                            class284.field4218[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg7 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class78.field1571[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg7 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if ((arg7 - 1) <= var29) {
                                            class89.field1641[var35] = var12;
                                            class257.field3795[var35] = var13 - 1;
                                            class78.field1571[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class284.field4218[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg7) > var21 && class78.field1571[var22][var21 + 1] == 0 && (var20[var23][arg7 + var24] & 0x4E240000) == 0 && (var20[arg7 + var23 - 1][arg7 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (var30 >= arg7 - 1) {
                                            class89.field1641[var35] = var12;
                                            class257.field3795[var35] = var13 + 1;
                                            class78.field1571[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class284.field4218[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][arg7 + var24] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class78.field1571[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg7) {
                                            class89.field1641[var35] = var12 - 1;
                                            class257.field3795[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class78.field1571[var22 - 1][var21 - 1] = 3;
                                            class284.field4218[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (128 - arg7 > var22 && var21 > 0 && class78.field1571[var22 + 1][var21 - 1] == 0 && (var20[var23 + arg7][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg7) {
                                            class89.field1641[var35] = var12 + 1;
                                            class257.field3795[var35] = var13 - 1;
                                            class78.field1571[var22 + 1][var21 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class284.field4218[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg7 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && 128 - arg7 > var21 && class78.field1571[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][arg7 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg7; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg7 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class89.field1641[var35] = var12 - 1;
                                    class257.field3795[var35] = var13 + 1;
                                    class78.field1571[var22 - 1][var21 + 1] = 6;
                                    var35 = var35 + 1 & 0xFFF;
                                    class284.field4218[var22 - 1][var21 + 1] = var26;
                                }
                            } while (var22 >= (128 - arg7));
                        } while (var21 >= 128 - arg7);
                    } while (class78.field1571[var22 + 1][var21 + 1] != 0);
                } while ((var20[arg7 + var23][arg7 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg7; var34++) {
                    if ((var20[var23 + var34][var24 + arg7] & 0x7E240000) != 0 || (var20[arg7 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class89.field1641[var35] = var12 + 1;
                class257.field3795[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class78.field1571[var22 + 1][var21 + 1] = 12;
                class284.field4218[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "()V")
    public class497() {
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lqh;)V")
    public class497(class61 arg0) {
        this.field7082 = arg0.method710((byte) 43);
        this.field7086 = arg0.method723((byte) -25);
        this.field7081 = arg0.method730(90);
        this.field7080 = arg0.method730(-117);
        this.field7087 = arg0.method730(-92);
        this.field7077 = arg0.method730(-126);
    }
}
