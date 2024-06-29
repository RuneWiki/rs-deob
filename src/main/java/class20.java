import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class20 extends class42 {

    @OriginalMember(owner = "client!ce", name = "Ab", descriptor = "Z")
    private volatile boolean field514 = false;

    @OriginalMember(owner = "client!ce", name = "sb", descriptor = "I")
    private int field506 = -1;

    @OriginalMember(owner = "client!ce", name = "Hb", descriptor = "Z")
    private boolean field521 = false;

    @OriginalMember(owner = "client!ce", name = "Jb", descriptor = "Lpb;")
    private class106 field523;

    @OriginalMember(owner = "client!ce", name = "nb", descriptor = "Lpb;")
    private class106 field501;

    @OriginalMember(owner = "client!ce", name = "rb", descriptor = "I")
    private int field505;

    @OriginalMember(owner = "client!ce", name = "vb", descriptor = "Lwd;")
    public static class150 field509 = class2.method9(true, ")4slr)3ws?order=LPWM");

    @OriginalMember(owner = "client!ce", name = "wb", descriptor = "[Lce;")
    public static class20[] field510 = new class20[256];

    @OriginalMember(owner = "client!ce", name = "qb", descriptor = "Z")
    public static boolean field504 = false;

    @OriginalMember(owner = "client!ce", name = "Db", descriptor = "Z")
    public static boolean field517 = false;

    @OriginalMember(owner = "client!ce", name = "xb", descriptor = "Lwd;")
    public static class150 field511 = class2.method9(true, "Fallen lassen");

    @OriginalMember(owner = "client!ce", name = "Lb", descriptor = "Lwd;")
    public static class150 field525 = class2.method9(true, "sl_button");

    @OriginalMember(owner = "client!ce", name = "Cb", descriptor = "Lwd;")
    public static class150 field516 = class2.method9(true, " ");

    @OriginalMember(owner = "client!ce", name = "Ob", descriptor = "Lwd;")
    private static class150 field528 = class2.method9(true, "Connecting to friendserver");

    @OriginalMember(owner = "client!ce", name = "Qb", descriptor = "Lwd;")
    public static class150 field530 = class2.method9(true, " )2> @whi@");

    @OriginalMember(owner = "client!ce", name = "Gb", descriptor = "Lwd;")
    public static class150 field520 = field528;

    @OriginalMember(owner = "client!ce", name = "kb", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ce", name = "mb", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!ce", name = "ob", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ce", name = "pb", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!ce", name = "ub", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!ce", name = "yb", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ce", name = "zb", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ce", name = "Bb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ce", name = "Eb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!ce", name = "Fb", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!ce", name = "Kb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!ce", name = "Mb", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ce", name = "Nb", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ce", name = "Pb", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ce", name = "Rb", descriptor = "I")
    public static int field531;

    @OriginalMember(owner = "client!ce", name = "Ib", descriptor = "Lqd;")
    public static class114 field522;

    @OriginalMember(owner = "client!ce", name = "tb", descriptor = "Lue;")
    public static class139 field507;

    @OriginalMember(owner = "client!ce", name = "lb", descriptor = "Lkc;")
    public static class72 field499;

    @OriginalMember(owner = "client!ce", name = "Sb", descriptor = "[Z")
    private volatile boolean[] field532;

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lpb;Lpb;IZZZ)V")
    public class20(class106 arg0, class106 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field521 = arg5;
        this.field523 = arg1;
        this.field501 = arg0;
        this.field505 = arg2;
        class144.method1084((byte) -109, this, this.field505);
    }

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "(I)I")
    public final int method138(int arg0) {
        ++field531;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; ~super.field1136.length < ~var4; ++var4) {
            if (~super.field1144[var4] < -1) {
                var2 += 100;
                var3 += this.method147(var4, (byte) 28);
            }
        }
        int var5 = 84 % ((-47 - arg0) / 38);
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "(I)V")
    public static final void method139(int arg0) {
        class150 var1 = null;
        for (int var2 = 0; class125.field2900 > var2; ++var2) {
            if (class2.field50[var2].method1200(class56.field1463, 29903) != -1) {
                var1 = class2.field50[var2].method1196(class2.field50[var2].method1200(class56.field1463, 29903), -31851);
                break;
            }
        }
        ++field519;
        if (var1 == null) {
            class135.method1004(-95);
        } else {
            int var3 = class58.field1502;
            int var4 = class130.field3075;
            int var5 = class97.field2229;
            if (~var4 > -1) {
                var4 = 0;
            }
            int var6 = class12.field292;
            if (~var6 < -191) {
                var6 = 190;
            }
            if (arg0 > 84) {
                int var7 = 6116423;
                class120.method872(var4, var3, var6, var5, var7);
                class120.method872(var4 + 1, var3 + 1, var6 + -2, 16, 0);
                class120.method866(var4 + 1, var3 + 18, var6 + -2, var5 + -19, 0);
                class134.field3150.method1047(var1, var4 + 3, var3 + 14, var7, false);
                int var8 = class113.field2602;
                int var9 = class111.field2557;
                if (class12.field305 == 0) {
                    var9 -= 4;
                    var8 -= 4;
                }
                if (~class12.field305 == -2) {
                    var8 -= 205;
                    var9 -= 553;
                }
                if (~class12.field305 == -3) {
                    var9 -= 17;
                    var8 -= 357;
                }
                for (int var10 = 0; var10 < class125.field2900; ++var10) {
                    int var11 = (class125.field2900 - 1 + -var10) * 15 + var3 + 31;
                    class150 var12 = class2.field50[var10];
                    int var13 = 16777215;
                    if (var12.method1189(-66, var1)) {
                        var12 = var12.method1202(0, var12.method1174((byte) -123) - var1.method1174((byte) -126), 0);
                        if (var12.method1189(-107, class50.field1369)) {
                            var12 = var12.method1202(0, var12.method1174((byte) -114) - class50.field1369.method1174((byte) -119), 0);
                        }
                    }
                    if (~var4 > ~var9 && ~(var4 + var6) < ~var9 && ~(var11 + -13) > ~var8 && var8 < var11 - -3) {
                        var13 = 16776960;
                    }
                    class134.field3150.method1047(var12, var4 + 3, var11, var13, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)V")
    public final void method140(byte arg0, int arg1) {
        ++field512;
        if (arg0 != -1) {
            this.field505 = -48;
        }
        class113.method799((byte) -128, arg1, this.field505);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Lpb;ZIB[B)V")
    public final void method141(class106 arg0, boolean arg1, int arg2, byte arg3, byte[] arg4) {
        ++field502;
        if (arg3 >= 82) {
            if (this.field523 != arg0) {
                if (!arg1 && this.field506 == arg2) {
                    this.field514 = true;
                }
                if (arg4 == null || arg4.length <= 2) {
                    this.field532[arg2] = false;
                    if (this.field521 || arg1) {
                        class32.method253((byte) 2, arg2, this.field505, 25341, this, super.field1138[arg2], arg1);
                    }
                    return;
                }
                class17.field449.reset();
                class17.field449.update(arg4, 0, arg4.length + -2);
                int var6 = (int) class17.field449.getValue();
                int var7 = ((arg4[arg4.length + -2] & 255) << 8) - -(255 & arg4[arg4.length + -1]);
                if (~super.field1138[arg2] != ~var6 || super.field1124[arg2] != var7) {
                    this.field532[arg2] = false;
                    if (this.field521 || arg1) {
                        class32.method253((byte) 2, arg2, this.field505, 25341, this, super.field1138[arg2], arg1);
                    }
                    return;
                }
                this.field532[arg2] = true;
                if (arg1) {
                    super.field1136[arg2] = class124.method941(false, 0, arg4);
                    return;
                }
            } else {
                if (this.field514) {
                    throw new RuntimeException();
                }
                if (arg4 == null) {
                    class32.method253((byte) 0, this.field505, 255, 25341, this, this.field500, true);
                    return;
                }
                class17.field449.reset();
                class17.field449.update(arg4, 0, arg4.length);
                int var8 = (int) class17.field449.getValue();
                if (this.field500 != var8) {
                    class32.method253((byte) 0, this.field505, 255, 25341, this, this.field500, true);
                    return;
                }
                this.method306(-105, arg4);
                this.method150(85);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(ZI)V")
    public final void method142(boolean arg0, int arg1) {
        if (this.field501 != null && this.field532 != null && this.field532[arg1]) {
            class111.method789(-104, this, arg1, this.field501);
        } else {
            class32.method253((byte) 2, arg1, this.field505, 25341, this, super.field1138[arg1], true);
        }
        if (!arg0) {
            this.field501 = null;
        }
        ++field513;
    }

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "(I)V")
    public static void method143(int arg0) {
        field516 = null;
        field520 = null;
        field510 = null;
        field522 = null;
        field511 = null;
        field530 = null;
        field509 = null;
        field507 = null;
        field525 = null;
        field528 = null;
        if (arg0 == -1) {
            field499 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZZI[BI)V")
    public final void method144(boolean arg0, boolean arg1, int arg2, byte[] arg3, int arg4) {
        ++field503;
        if (arg4 != 17) {
            this.method142(false, -117);
        }
        if (arg1) {
            if (this.field514) {
                throw new RuntimeException();
            } else {
                if (this.field523 != null) {
                    class74.method556(arg3, this.field523, this.field505, 0);
                }
                this.method306(-90, arg3);
                this.method150(100);
            }
        } else {
            arg3[arg3.length + -2] = (byte) (super.field1124[arg2] >> 8);
            arg3[arg3.length + -1] = (byte) super.field1124[arg2];
            if (this.field501 != null) {
                class74.method556(arg3, this.field501, arg2, 0);
                this.field532[arg2] = true;
            }
            if (arg0) {
                super.field1136[arg2] = class124.method941(false, 0, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IB)Lie;")
    public static final class61 method145(int arg0, byte arg1) {
        if (arg1 > -9) {
            return null;
        } else {
            class61 var2 = (class61) class138.field3223.method440((long) arg0, 26976);
            ++field524;
            if (var2 != null) {
                return var2;
            } else {
                byte[] var3 = class145.field3520.method315(arg0, true, 6);
                class61 var4 = new class61();
                var4.field1578 = arg0;
                if (var3 != null) {
                    var4.method471(new class148(var3), -1);
                }
                var4.method475(-28916);
                if (var4.field1550) {
                    var4.field1581 = 0;
                    var4.field1567 = false;
                }
                class138.field3223.method433(var4, (long) arg0, (byte) -122);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "(ZI)V")
    public final void method146(boolean arg0, int arg1) {
        ++field529;
        this.field500 = arg1;
        if (!arg0) {
            field516 = null;
        }
        if (this.field523 == null) {
            class32.method253((byte) 0, this.field505, 255, 25341, this, this.field500, true);
        } else {
            class111.method789(-100, this, this.field505, this.field523);
        }
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(IB)I")
    private final int method147(int arg0, byte arg1) {
        ++field527;
        if (super.field1136[arg0] != null) {
            return 100;
        } else if (this.field532[arg0]) {
            return 100;
        } else {
            return arg1 != 28 ? 27 : class142.method1076(127, this.field505, arg0);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII[Lva;IIIIII)V")
    public static final void method148(int arg0, int arg1, int arg2, int arg3, int arg4, class141[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        ++field515;
        if (arg6 <= arg9 && arg0 >= arg3 && arg9 < arg11 && ~arg0 > ~arg7) {
            for (int var12 = 0; var12 < arg5.length; ++var12) {
                class141 var13 = arg5[var12];
                if (var13 != null && ~var13.field3298 == ~arg4 && (!var13.field3370 || !class80.method579(101, var13))) {
                    int var14 = var13.field3353 + arg3 + -arg2;
                    int var15 = var13.field3304 + arg6 + -arg1;
                    if ((var13.field3416 >= 0 || ~var13.field3294 != -1) && ~var15 >= ~arg9 && ~var14 >= ~arg0 && ~(var13.field3321 + var15) < ~arg9 && var13.field3326 + var14 > arg0) {
                        if (~var13.field3416 > -1) {
                            class32.field934 = var12;
                        } else {
                            class32.field934 = var13.field3416;
                        }
                    }
                    if (~var13.field3354 == -9 && ~arg9 <= ~var15 && arg0 >= var14 && ~(var13.field3321 + var15) < ~arg9 && arg0 < var13.field3326 + var14) {
                        class134.field3160 = var12;
                    }
                    if (~var13.field3354 == -1) {
                        if (!var13.field3370 && class80.method579(108, var13) && !class35.method267(var12, arg10, 0)) {
                            continue;
                        }
                        method148(arg0, var13.field3390, var13.field3309, var14, var13.field3323, arg5, var15, var13.field3326 + var14, -30396, arg9, arg10, var13.field3321 + var15);
                        if (var13.field3367 != null) {
                            method148(arg0, var13.field3390, var13.field3309, var14, var13.field3323, var13.field3367, var15, var13.field3326 + var14, -30396, arg9, arg10, var13.field3321 + var15);
                        }
                        if (var13.field3382 > var13.field3326 && !var13.field3370) {
                            class88.method620(var14, arg10, arg9, var13.field3326, arg0, var13, var13.field3321 + var15, var13.field3382, (byte) -104);
                        }
                        if (!var13.field3370) {
                            continue;
                        }
                    }
                    if (~var13.field3400 == -2 && var15 <= arg9 && ~arg0 <= ~var14 && ~(var15 - -var13.field3321) < ~arg9 && arg0 < var13.field3326 + var14) {
                        boolean var16 = false;
                        if (~var13.field3338 != -1) {
                            var16 = class142.method1070((byte) 113, var13);
                        }
                        if (!var16) {
                            ++class126.field2919;
                            class68.method521(0, 46, var13.field3332, false, 0, class43.field1167, var13.field3323);
                        }
                    }
                    if (var13.field3400 == 2 && !class90.field2095 && ~arg9 <= ~var15 && ~var14 >= ~arg0 && arg9 < var15 - -var13.field3321 && arg0 < var13.field3326 + var14) {
                        class150 var17 = class104.method713(74, var13);
                        if (var17 != null) {
                            class68.method521(0, 38, var17, false, -1, class111.method786((byte) 32, new class150[] { class99.field2280, var13.field3402 }), var13.field3323);
                            ++class136.field3199;
                        }
                    }
                    if (~var13.field3400 == -4 && arg9 >= var15 && ~var14 >= ~arg0 && var13.field3321 + var15 > arg9 && arg0 < var13.field3326 + var14) {
                        ++class11.field272;
                        byte var18;
                        if (~arg10 != -4) {
                            var18 = 42;
                        } else {
                            var18 = 4;
                        }
                        class68.method521(0, var18, class23.field660, false, 0, class43.field1167, var13.field3323);
                    }
                    if (~var13.field3400 == -5 && ~var15 >= ~arg9 && ~arg0 <= ~var14 && var15 - -var13.field3321 > arg9 && var14 - -var13.field3326 > arg0) {
                        ++class91.field2126;
                        class68.method521(0, 20, var13.field3332, false, 0, class43.field1167, var13.field3323);
                    }
                    if (~var13.field3400 == -6 && var15 <= arg9 && ~arg0 <= ~var14 && arg9 < var13.field3321 + var15 && var14 - -var13.field3326 > arg0) {
                        class68.method521(0, 16, var13.field3332, false, 0, class43.field1167, var13.field3323);
                        ++class131.field3077;
                    }
                    if (var13.field3400 == 6 && class147.field3559 == -1 && ~var15 >= ~arg9 && var14 <= arg0 && arg9 < var15 - -var13.field3321 && var13.field3326 + var14 > arg0) {
                        class68.method521(0, 52, var13.field3332, false, -1, class43.field1167, var13.field3323);
                        ++class21.field560;
                    }
                    if (~var13.field3354 == -3) {
                        int var19 = 0;
                        for (int var20 = 0; var13.field3326 > var20; ++var20) {
                            for (int var21 = 0; ~var13.field3321 < ~var21; ++var21) {
                                int var22 = (var13.field3407 + 32) * var21 + var15;
                                int var23 = (32 - -var13.field3374) * var20 + var14;
                                if (var19 < 20) {
                                    var22 += var13.field3381[var19];
                                    var23 += var13.field3372[var19];
                                }
                                if (~var22 >= ~arg9 && var23 <= arg0 && arg9 < var22 - -32 && ~arg0 > ~(var23 + 32)) {
                                    class63.field1616 = var19;
                                    class107.field2434 = var13.field3323;
                                    if (var13.field3341[var19] > 0) {
                                        class21 var24 = class4.method26((byte) 87, var13.field3341[var19] - 1);
                                        if (class130.field3060 == 1 && class96.method673(false, class124.method942(var13, true))) {
                                            if (~class42.field1114 != ~var13.field3323 || ~class49.field1299 != ~var19) {
                                                ++class128.field3052;
                                                class68.method521(var24.field598, 57, class9.field214, false, var19, class111.method786((byte) -115, new class150[] { class78.field1923, class61.field1541, var24.field558 }), var13.field3323);
                                            }
                                        } else if (class90.field2095 && class96.method673(false, class124.method942(var13, true))) {
                                            if (~(class56.field1466 & 16) == -17) {
                                                class68.method521(var24.field598, 22, class80.field1937, false, var19, class111.method786((byte) -127, new class150[] { class68.field1727, class61.field1541, var24.field558 }), var13.field3323);
                                                ++class126.field2921;
                                            }
                                        } else {
                                            ++class34.field953;
                                            class150[] var25 = var24.field599;
                                            if (class25.field742) {
                                                var25 = class35.method266(arg8 + 30401, var25);
                                            }
                                            if (class96.method673(false, class124.method942(var13, true))) {
                                                for (int var26 = 4; ~var26 <= -4; --var26) {
                                                    if (var25 != null && var25[var26] != null) {
                                                        ++class40.field1051;
                                                        byte var27;
                                                        if (~var26 == -4) {
                                                            var27 = 29;
                                                        } else {
                                                            var27 = 54;
                                                        }
                                                        class68.method521(var24.field598, var27, var25[var26], false, var19, class111.method786((byte) 86, new class150[] { class56.field1463, var24.field558 }), var13.field3323);
                                                    } else if (var26 == 4) {
                                                        class68.method521(var24.field598, 54, class25.field734, false, var19, class111.method786((byte) 32, new class150[] { class56.field1463, var24.field558 }), var13.field3323);
                                                        ++class8.field187;
                                                    }
                                                }
                                            }
                                            if (class143.method1081(class124.method942(var13, true), 355945055)) {
                                                ++class69.field1735;
                                                class68.method521(var24.field598, 48, class9.field214, false, var19, class111.method786((byte) -107, new class150[] { class56.field1463, var24.field558 }), var13.field3323);
                                            }
                                            if (class96.method673(false, class124.method942(var13, true)) && var25 != null) {
                                                for (int var28 = 2; var28 >= 0; --var28) {
                                                    if (var25[var28] != null) {
                                                        ++class92.field2142;
                                                        byte var29 = 0;
                                                        if (~var28 == -1) {
                                                            var29 = 7;
                                                        }
                                                        if (var28 == 1) {
                                                            var29 = 15;
                                                        }
                                                        if (~var28 == -3) {
                                                            var29 = 51;
                                                        }
                                                        class68.method521(var24.field598, var29, var25[var28], false, var19, class111.method786((byte) -121, new class150[] { class56.field1463, var24.field558 }), var13.field3323);
                                                    }
                                                }
                                            }
                                            class150[] var30 = var13.field3418;
                                            if (class25.field742) {
                                                var30 = class35.method266(5, var30);
                                            }
                                            if (var30 != null) {
                                                for (int var31 = 4; var31 >= 0; --var31) {
                                                    if (var30[var31] != null) {
                                                        byte var32 = 0;
                                                        ++class124.field2875;
                                                        if (var31 == 0) {
                                                            var32 = 31;
                                                        }
                                                        if (var31 == 1) {
                                                            var32 = 56;
                                                        }
                                                        if (var31 == 2) {
                                                            var32 = 10;
                                                        }
                                                        if (var31 == 3) {
                                                            var32 = 17;
                                                        }
                                                        if (var31 == 4) {
                                                            var32 = 6;
                                                        }
                                                        class68.method521(var24.field598, var32, var30[var31], false, var19, class111.method786((byte) -115, new class150[] { class56.field1463, var24.field558 }), var13.field3323);
                                                    }
                                                }
                                            }
                                            class68.method521(var24.field598, 1002, class58.field1505, false, var19, class111.method786((byte) -128, new class150[] { class56.field1463, var24.field558 }), var13.field3323);
                                        }
                                    }
                                }
                                ++var19;
                            }
                        }
                    }
                    if (var13.field3370) {
                        if (class90.field2095) {
                            if (class101.method691((byte) -127, class124.method942(var13, true)) && (class56.field1466 & 32) == 32 && arg9 >= var15 && ~var14 >= ~arg0 && ~(var15 - -var13.field3321) < ~arg9 && var13.field3326 + var14 > arg0) {
                                ++class29.field875;
                                class68.method521(0, 47, class80.field1937, false, var13.field3322, class111.method786((byte) 21, new class150[] { class68.field1727, class133.field3120, var13.field3411 }), var13.field3323);
                            }
                        } else if (~arg9 <= ~var15 && ~var14 >= ~arg0 && arg9 < var13.field3321 + var15 && ~arg0 > ~(var13.field3326 + var14)) {
                            for (int var33 = 9; ~var33 <= -6; --var33) {
                                class150 var37 = class46.method344((byte) 27, var13, var33);
                                if (var37 != null) {
                                    class68.method521(var33 + 1, 39, var37, false, var13.field3322, var13.field3411, var13.field3323);
                                    ++class41.field1087;
                                }
                            }
                            class150 var34 = class104.method713(arg8 ^ -30436, var13);
                            if (var34 != null) {
                                ++class136.field3199;
                                class68.method521(0, 38, var34, false, var13.field3322, var13.field3411, var13.field3323);
                            }
                            for (int var35 = 4; var35 >= 0; --var35) {
                                class150 var36 = class46.method344((byte) 27, var13, var35);
                                if (var36 != null) {
                                    ++class41.field1087;
                                    class68.method521(var35 + 1, 39, var36, false, var13.field3322, var13.field3411, var13.field3323);
                                }
                            }
                            if (class77.method573(class124.method942(var13, true), 126)) {
                                class68.method521(0, 52, var13.field3332, false, var13.field3322, class43.field1167, var13.field3323);
                                ++class21.field560;
                            }
                        }
                    }
                }
            }
            if (arg8 != -30396) {
                method148(-78, -66, 68, -125, -34, (class141[]) null, -68, 21, 74, -118, -8, -26);
            }
        }
    }

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "(I)I")
    public final int method149(int arg0) {
        ++field508;
        if (arg0 != 12161) {
            return 18;
        } else if (this.field514) {
            return 100;
        } else if (super.field1136 != null) {
            return 99;
        } else {
            int var2 = class142.method1076(125, 255, this.field505);
            if (var2 >= 100) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "(I)V")
    private final void method150(int arg0) {
        if (arg0 <= 83) {
            this.field500 = -57;
        }
        ++field498;
        this.field532 = new boolean[super.field1136.length];
        for (int var2 = 0; this.field532.length > var2; ++var2) {
            this.field532[var2] = false;
        }
        if (this.field501 == null) {
            this.field514 = true;
        } else {
            this.field506 = -1;
            for (int var3 = 0; ~var3 > ~this.field532.length; ++var3) {
                if (~super.field1144[var3] < -1) {
                    class138.method1019(this.field501, 15, var3, this);
                    this.field506 = var3;
                }
            }
            if (~this.field506 == 0) {
                this.field514 = true;
            }
        }
    }
}
