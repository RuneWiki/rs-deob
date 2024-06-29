import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class178 {

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public static int field2606 = -1;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "[I")
    public static int[] field2611 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[I")
    public static int[] field2612 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2605;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "([II[I[ILdg;)V")
    public static final void method1173(int[] arg0, int arg1, int[] arg2, int[] arg3, class87 arg4) {
        if (arg1 != 16018) {
            return;
        }
        for (int var5 = 0; var5 < arg2.length; var5++) {
            int var6 = arg2[var5];
            int var7 = arg3[var5];
            int var8 = arg0[var5];
            int var9 = 0;
            while (var8 != 0 && arg4.field485.length > var9) {
                if ((var8 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg4.field485[var9] = null;
                    } else {
                        class220 var10 = class108.method781(var6, -1);
                        int var11 = var10.field3406;
                        class85 var12 = arg4.field485[var9];
                        if (var12 != null) {
                            if (var12.field1309 == var6) {
                                if (var11 == 0) {
                                    var12 = arg4.field485[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1307 = 1;
                                    var12.field1304 = var7;
                                    var12.field1298 = 0;
                                    var12.field1310 = 0;
                                    var12.field1308 = 0;
                                    class244.method1664(arg4.field455, false, 0, arg4.field425, 8890, var10);
                                } else if (var11 == 2) {
                                    var12.field1310 = 0;
                                }
                            } else if (var10.field3427 >= class108.method781(var12.field1309, arg1 - 16019).field3427) {
                                var12 = arg4.field485[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class85 var13 = arg4.field485[var9] = new class85();
                            var13.field1304 = var7;
                            var13.field1298 = 0;
                            var13.field1309 = var6;
                            var13.field1308 = 0;
                            var13.field1310 = 0;
                            var13.field1307 = 1;
                            class244.method1664(arg4.field455, false, 0, arg4.field425, 8890, var10);
                        }
                    }
                }
                var9++;
                var8 >>>= 0x1;
            }
        }
        field2609++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lwf;IIIIIIIZ)V")
    public static final void method1174(class205 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class251.field3892;
        int var11;
        int var12 = var11 = (arg7 << 7) - class135.field1979;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class166.field2451[arg1][arg6][arg7] - class127.field1863;
        int var18 = class166.field2451[arg1][arg6 + 1][arg7] - class127.field1863;
        int var19 = class166.field2451[arg1][arg6 + 1][arg7 + 1] - class127.field1863;
        int var20 = class166.field2451[arg1][arg6][arg7 + 1] - class127.field1863;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 < 50) {
            return;
        }
        int var27 = arg4 * var11 + arg5 * var14 >> 16;
        int var28 = arg5 * var11 - arg4 * var14 >> 16;
        int var30 = arg3 * var18 - arg2 * var28 >> 16;
        int var31 = arg2 * var18 + arg3 * var28 >> 16;
        if (var31 < 50) {
            return;
        }
        int var33 = arg4 * var16 + arg5 * var13 >> 16;
        int var34 = arg5 * var16 - arg4 * var13 >> 16;
        int var36 = arg3 * var19 - arg2 * var34 >> 16;
        int var37 = arg2 * var19 + arg3 * var34 >> 16;
        if (var37 < 50) {
            return;
        }
        int var39 = arg4 * var15 + arg5 * var9 >> 16;
        int var40 = arg5 * var15 - arg4 * var9 >> 16;
        int var42 = arg3 * var20 - arg2 * var40 >> 16;
        int var43 = arg2 * var20 + arg3 * var40 >> 16;
        if (var43 < 50) {
            return;
        }
        int var45 = (var21 << 9) / var25 + class119.field1787;
        int var46 = (var24 << 9) / var25 + class119.field1785;
        int var47 = (var27 << 9) / var31 + class119.field1787;
        int var48 = (var30 << 9) / var31 + class119.field1785;
        int var49 = (var33 << 9) / var37 + class119.field1787;
        int var50 = (var36 << 9) / var37 + class119.field1785;
        int var51 = (var39 << 9) / var43 + class119.field1787;
        int var52 = (var42 << 9) / var43 + class119.field1785;
        class119.field1789 = 0;
        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
            if (class248.field3852 && class175.method1162(class122.field1809 + class119.field1787, class149.field2156 + class119.field1785, var50, var52, var48, var49, var51, var47)) {
                class44.field775 = arg6;
                class173.field2540 = arg7;
            }
            if (!arg8) {
                class119.field1775 = false;
                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class119.field1784 || var51 > class119.field1784 || var47 > class119.field1784) {
                    class119.field1775 = true;
                }
                if (arg0.field3080 == -1) {
                    if (arg0.field3070 != 12345678) {
                        class119.method851(var50, var52, var48, var49, var51, var47, arg0.field3070, arg0.field3079, arg0.field3072);
                    }
                } else if (!class17.field312) {
                    int var53 = class119.field1790.method1829(false, arg0.field3080);
                    class119.method851(var50, var52, var48, var49, var51, var47, class33.method226(var53, arg0.field3070), class33.method226(var53, arg0.field3079), class33.method226(var53, arg0.field3072));
                } else if (arg0.field3076) {
                    class119.method834(var50, var52, var48, var49, var51, var47, arg0.field3070, arg0.field3079, arg0.field3072, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3080);
                } else {
                    class119.method834(var50, var52, var48, var49, var51, var47, arg0.field3070, arg0.field3079, arg0.field3072, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field3080);
                }
            }
        }
        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) <= 0) {
            return;
        }
        if (class248.field3852 && class175.method1162(class122.field1809 + class119.field1787, class149.field2156 + class119.field1785, var46, var48, var52, var45, var47, var51)) {
            class44.field775 = arg6;
            class173.field2540 = arg7;
        }
        if (arg8) {
            return;
        }
        class119.field1775 = false;
        if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class119.field1784 || var47 > class119.field1784 || var51 > class119.field1784) {
            class119.field1775 = true;
        }
        if (arg0.field3080 != -1) {
            if (class17.field312) {
                class119.method834(var46, var48, var52, var45, var47, var51, arg0.field3075, arg0.field3072, arg0.field3079, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field3080);
                return;
            }
            int var54 = class119.field1790.method1829(false, arg0.field3080);
            class119.method851(var46, var48, var52, var45, var47, var51, class33.method226(var54, arg0.field3075), class33.method226(var54, arg0.field3072), class33.method226(var54, arg0.field3079));
        } else if (arg0.field3075 != 12345678) {
            class119.method851(var46, var48, var52, var45, var47, var51, arg0.field3075, arg0.field3072, arg0.field3079);
            return;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V")
    public static final void method1175(int arg0) {
        class123 var1 = (class123) class124.field1833.method315((byte) -107);
        if (arg0 != 0) {
            field2611 = null;
        }
        while (var1 != null) {
            int var2 = var1.field1823;
            if (class176.method1165(var2, -31001)) {
                boolean var3 = true;
                class297[] var4 = class275.field4236[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4647;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field2628;
                    class297 var7 = class151.method1023(arg0 - 30464, var6);
                    if (var7 != null) {
                        class297.method1979((byte) -66, var7);
                    }
                }
            }
            var1 = (class123) class124.field1833.method310(arg0 ^ 0xFFFFFFA9);
        }
        field2604++;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1176(byte arg0) {
        field2612 = null;
        field2611 = null;
        if (arg0 > -18) {
            field2606 = -47;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(ZZ)V")
    public static final void method1177(boolean arg0, boolean arg1) {
        field2610++;
        class68.method540(class85.field1311, arg1, -1, class184.field2677, class126.field1854);
        if (arg0) {
            method1175(-28);
        }
    }
}
