import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class131 {

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
    private int field77 = -1;

    @OriginalMember(owner = "client!ae", name = "Cb", descriptor = "Z")
    private volatile boolean field95 = false;

    @OriginalMember(owner = "client!ae", name = "Db", descriptor = "Z")
    private boolean field96 = false;

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lfa;")
    private class37 field69;

    @OriginalMember(owner = "client!ae", name = "Eb", descriptor = "I")
    private int field97;

    @OriginalMember(owner = "client!ae", name = "zb", descriptor = "Lfa;")
    private class37 field92;

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "[I")
    public static int[] field75 = new int[25];

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "Lsc;")
    public static class128 field79 = class129.method1017(false, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!ae", name = "qb", descriptor = "Z")
    public static boolean field83 = false;

    @OriginalMember(owner = "client!ae", name = "tb", descriptor = "Lma;")
    public static class84 field86 = null;

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "I")
    public static int field80 = 0;

    @OriginalMember(owner = "client!ae", name = "wb", descriptor = "Lsc;")
    public static class128 field89 = class129.method1017(false, "sch-Utteln:");

    @OriginalMember(owner = "client!ae", name = "Ab", descriptor = "Lsc;")
    public static class128 field93 = class129.method1017(false, "rect_debug=");

    @OriginalMember(owner = "client!ae", name = "Fb", descriptor = "Lsc;")
    public static class128 field98 = class129.method1017(false, "::fpsoff");

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "I")
    public static int field67;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "I")
    public static int field68;

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "I")
    private int field72;

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "I")
    public static int field73;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
    private int field81;

    @OriginalMember(owner = "client!ae", name = "pb", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!ae", name = "sb", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!ae", name = "vb", descriptor = "I")
    public static int field88;

    @OriginalMember(owner = "client!ae", name = "xb", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!ae", name = "yb", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!ae", name = "Gb", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!ae", name = "rb", descriptor = "Lsf;")
    public static class131 field84;

    @OriginalMember(owner = "client!ae", name = "Bb", descriptor = "[Li;")
    public static class56[] field94;

    @OriginalMember(owner = "client!ae", name = "ub", descriptor = "[Z")
    private volatile boolean[] field87;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZII)V")
    public static final void method17(int arg0, boolean arg1, int arg2, int arg3) {
        ++field91;
        if (arg0 >= 8000 && ~arg0 >= -48001) {
            class49.field920 = arg0;
            int var4 = -111 / ((44 - arg2) / 51);
            class71.field1602 = arg3;
            class73.field1624 = arg1;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(III)V")
    public final void method18(int arg0, int arg1, int arg2) {
        this.field81 = arg0;
        this.field72 = arg1;
        if (arg2 != 25751) {
            this.field81 = 75;
        }
        if (this.field69 != null) {
            class120.method916(this, true, this.field69, this.field97);
        } else {
            class129.method1020((byte) 0, 255, this.field81, this, true, this.field97, (byte) 124);
        }
        ++field73;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)I")
    public final int method19(byte arg0) {
        ++field90;
        int var2 = 0;
        int var3 = 0;
        if (arg0 < 97) {
            method23(-124, 60, 19, true);
        }
        for (int var4 = 0; var4 < super.field3009.length; ++var4) {
            if (super.field3013[var4] > 0) {
                var3 += this.method30((byte) 42, var4);
                var2 += 100;
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "([BLfa;ZBI)V")
    public final void method20(byte[] arg0, class37 arg1, boolean arg2, byte arg3, int arg4) {
        ++field67;
        if (this.field69 != arg1) {
            if (!arg2 && ~this.field77 == ~arg4) {
                this.field95 = true;
            }
            if (arg0 == null || ~arg0.length >= -3) {
                this.field87[arg4] = false;
                if (this.field96 || arg2) {
                    class129.method1020((byte) 2, this.field97, super.field2994[arg4], this, arg2, arg4, (byte) 78);
                }
                return;
            }
            class90.field2060.reset();
            class90.field2060.update(arg0, 0, arg0.length + -2);
            int var6 = (int) class90.field2060.getValue();
            int var7 = (arg0[arg0.length + -2] << 8 & 65280) + (255 & arg0[arg0.length - 1]);
            if (~super.field2994[arg4] != ~var6 || super.field2997[arg4] != var7) {
                this.field87[arg4] = false;
                if (this.field96 || arg2) {
                    class129.method1020((byte) 2, this.field97, super.field2994[arg4], this, arg2, arg4, (byte) -76);
                }
                return;
            }
            this.field87[arg4] = true;
            if (arg2) {
                super.field3009[arg4] = class69.method520(2, false, arg0);
            }
        } else {
            if (this.field95) {
                throw new RuntimeException();
            }
            if (arg0 == null) {
                class129.method1020((byte) 0, 255, this.field81, this, true, this.field97, (byte) -102);
                return;
            }
            class90.field2060.reset();
            class90.field2060.update(arg0, 0, arg0.length);
            int var8 = (int) class90.field2060.getValue();
            class86 var9 = new class86(class99.method759(true, arg0));
            int var10 = var9.method646(-15447);
            if (var10 != 5 && ~var10 != -7) {
                throw new RuntimeException("Incorrect JS5 protocol number: " + var10);
            }
            int var11 = 0;
            if (~var10 <= -7) {
                var11 = var9.method666(arg3 + 1183700361);
            }
            if (this.field81 != var8 || this.field72 != var11) {
                class129.method1020((byte) 0, 255, this.field81, this, true, this.field97, (byte) -39);
                return;
            }
            this.method1040(5, arg0);
            this.method29(-36);
        }
        if (arg3 != 63) {
            this.method29(102);
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(II)V")
    public final void method21(int arg0, int arg1) {
        class95.method749(arg1, (byte) 100, this.field97);
        if (arg0 != 20218) {
            this.field87 = null;
        }
        ++field76;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZZ[BB)V")
    public final void method22(int arg0, boolean arg1, boolean arg2, byte[] arg3, byte arg4) {
        int var6 = -40 / ((arg4 - -1) / 38);
        ++field74;
        if (!arg1) {
            arg3[arg3.length + -2] = (byte) (super.field2997[arg0] >> 8);
            arg3[arg3.length + -1] = (byte) super.field2997[arg0];
            if (this.field92 != null) {
                class92.method713(arg3, this.field92, (byte) -64, arg0);
                this.field87[arg0] = true;
            }
            if (arg2) {
                super.field3009[arg0] = class69.method520(2, false, arg3);
                return;
            }
        } else {
            if (this.field95) {
                throw new RuntimeException();
            }
            if (this.field69 != null) {
                class92.method713(arg3, this.field69, (byte) -64, this.field97);
            }
            this.method1040(5, arg3);
            this.method29(-36);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIZ)Lud;")
    public static final class143 method23(int arg0, int arg1, int arg2, boolean arg3) {
        ++field88;
        class143 var4 = new class143();
        var4.field3351 = arg2;
        var4.field3349 = arg1;
        class66.field1492.method964(arg3, var4, (long) arg0);
        class152.method1209(arg1, arg3);
        class102.method772((byte) -60, arg1);
        class54 var5 = class46.method338(arg0, 60);
        if (var5 != null) {
            class89.method696(var5, 1);
        }
        if (class110.field2473 != null) {
            class89.method696(class110.field2473, 1);
            class110.field2473 = null;
        }
        class7.field103 = 0;
        class135.field3180 = false;
        class19.method169((byte) -58, class99.field2298, class149.field3441, class92.field2082, class100.field2306);
        if (class29.field556 != -1) {
            class122.method937((byte) -68, 1, class29.field556);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lhe;III)V")
    public static final void method24(class54 arg0, int arg1, int arg2, int arg3) {
        ++field71;
        if (arg0.field1204 == 1) {
            ++class67.field1497;
            class121.method921(arg0.field1123, 3, arg0.field1117, (byte) -70, 0, 0, class18.field323);
        }
        if (~arg0.field1204 == -3 && !class65.field1459) {
            class128 var4 = class33.method245(0, arg0);
            if (var4 != null) {
                ++class23.field461;
                class121.method921(var4, 1, arg0.field1117, (byte) -70, -1, 0, class51.method395(new class128[] { class104.field2360, arg0.field1099 }, false));
            }
        }
        if (~arg0.field1204 == -4) {
            class121.method921(class5.field48, 39, arg0.field1117, (byte) -70, 0, 0, class18.field323);
            ++class129.field2965;
        }
        if (~arg0.field1204 == -5) {
            ++class132.field3077;
            class121.method921(arg0.field1123, 4, arg0.field1117, (byte) -70, 0, 0, class18.field323);
        }
        if (~arg0.field1204 == -6) {
            class121.method921(arg0.field1123, 6, arg0.field1117, (byte) -70, 0, 0, class18.field323);
            ++class87.field1992;
        }
        if (arg0.field1204 == 6 && class110.field2473 == null) {
            ++class12.field204;
            class121.method921(arg0.field1123, 48, arg0.field1117, (byte) -70, -1, 0, class18.field323);
        }
        if (~arg0.field1137 == -3) {
            int var5 = 0;
            for (int var6 = 0; var6 < arg0.field1111; ++var6) {
                for (int var7 = 0; ~var7 > ~arg0.field1154; ++var7) {
                    int var8 = (arg0.field1084 + 32) * var7;
                    int var9 = (arg0.field1147 + 32) * var6;
                    if (~var5 > -21) {
                        var9 += arg0.field1115[var5];
                        var8 += arg0.field1166[var5];
                    }
                    if (~var8 >= ~arg1 && arg3 >= var9 && var8 - -32 > arg1 && ~(var9 - -32) < ~arg3) {
                        class159.field3656 = var5;
                        class116.field2611 = arg0;
                        if (~arg0.field1144[var5] < -1) {
                            class64 var10 = class27.method230((byte) -44, arg0.field1144[var5] + -1);
                            if (class105.field2392 == 1 && class63.method467(0, class77.method561(arg2 ^ 22384, arg0))) {
                                if (class60.field1292 != arg0.field1117 || class5.field62 != var5) {
                                    class121.method921(class14.field273, 33, arg0.field1117, (byte) -70, var5, var10.field1425, class51.method395(new class128[] { class53.field1067, class148.field3421, var10.field1378 }, false));
                                    ++class29.field545;
                                }
                            } else if (class65.field1459 && class63.method467(arg2 ^ 22299, class77.method561(arg2 + -22184, arg0))) {
                                if ((16 & class153.field3526) == 16) {
                                    ++class148.field3419;
                                    class121.method921(class110.field2486, 41, arg0.field1117, (byte) -70, var5, var10.field1425, class51.method395(new class128[] { class35.field656, class148.field3421, var10.field1378 }, false));
                                }
                            } else {
                                class128[] var11 = var10.field1407;
                                if (class112.field2526) {
                                    var11 = class121.method924((byte) -126, var11);
                                }
                                if (class63.method467(0, class77.method561(125, arg0))) {
                                    for (int var12 = 4; var12 >= 3; --var12) {
                                        if (var11 != null && var11[var12] != null) {
                                            ++class36.field700;
                                            byte var13;
                                            if (var12 != 3) {
                                                var13 = 28;
                                            } else {
                                                var13 = 11;
                                            }
                                            class121.method921(var11[var12], var13, arg0.field1117, (byte) -70, var5, var10.field1425, class51.method395(new class128[] { class87.field1986, var10.field1378 }, false));
                                        } else if (~var12 == -5) {
                                            class121.method921(class33.field634, 28, arg0.field1117, (byte) -70, var5, var10.field1425, class51.method395(new class128[] { class87.field1986, var10.field1378 }, false));
                                            ++class73.field1639;
                                        }
                                    }
                                }
                                if (class64.method474(class77.method561(37, arg0), false)) {
                                    class121.method921(class14.field273, 9, arg0.field1117, (byte) -70, var5, var10.field1425, class51.method395(new class128[] { class87.field1986, var10.field1378 }, false));
                                    ++class116.field2610;
                                }
                                ++class104.field2371;
                                if (class63.method467(0, class77.method561(arg2 ^ 22387, arg0)) && var11 != null) {
                                    for (int var14 = 2; ~var14 <= -1; --var14) {
                                        if (var11[var14] != null) {
                                            ++class16.field302;
                                            byte var15 = 0;
                                            if (var14 == 0) {
                                                var15 = 22;
                                            }
                                            if (~var14 == -2) {
                                                var15 = 57;
                                            }
                                            if (~var14 == -3) {
                                                var15 = 44;
                                            }
                                            class121.method921(var11[var14], var15, arg0.field1117, (byte) -70, var5, var10.field1425, class51.method395(new class128[] { class87.field1986, var10.field1378 }, false));
                                        }
                                    }
                                }
                                class128[] var16 = arg0.field1077;
                                if (class112.field2526) {
                                    var16 = class121.method924((byte) -126, var16);
                                }
                                if (var16 != null) {
                                    for (int var17 = 4; ~var17 <= -1; --var17) {
                                        if (var16[var17] != null) {
                                            ++class151.field3469;
                                            byte var18 = 0;
                                            if (~var17 == -1) {
                                                var18 = 31;
                                            }
                                            if (var17 == 1) {
                                                var18 = 17;
                                            }
                                            if (var17 == 2) {
                                                var18 = 29;
                                            }
                                            if (var17 == 3) {
                                                var18 = 30;
                                            }
                                            if (var17 == 4) {
                                                var18 = 16;
                                            }
                                            class121.method921(var16[var17], var18, arg0.field1117, (byte) -70, var5, var10.field1425, class51.method395(new class128[] { class87.field1986, var10.field1378 }, false));
                                        }
                                    }
                                }
                                class121.method921(class19.field357, 1002, arg0.field1117, (byte) -70, var5, var10.field1425, class51.method395(new class128[] { class87.field1986, var10.field1378 }, false));
                            }
                        }
                    }
                    ++var5;
                }
            }
        }
        if (arg2 != 22299) {
            method28((Component) null, (byte) -70);
        }
        if (arg0.field1146) {
            if (!class65.field1459) {
                for (int var19 = 9; var19 >= 5; --var19) {
                    class128 var23 = class77.method569((byte) -98, arg0, var19);
                    if (var23 != null) {
                        class121.method921(var23, 1004, arg0.field1117, (byte) -70, arg0.field1162, var19 - -1, arg0.field1145);
                        ++class33.field626;
                    }
                }
                class128 var20 = class33.method245(arg2 ^ 22299, arg0);
                if (var20 != null) {
                    ++class23.field461;
                    class121.method921(var20, 1, arg0.field1117, (byte) -70, arg0.field1162, 0, arg0.field1145);
                }
                for (int var21 = 4; ~var21 <= -1; --var21) {
                    class128 var22 = class77.method569((byte) -126, arg0, var21);
                    if (var22 != null) {
                        class121.method921(var22, 13, arg0.field1117, (byte) -70, arg0.field1162, var21 + 1, arg0.field1145);
                        ++class33.field626;
                    }
                }
                if (class68.method517(-105, class77.method561(80, arg0))) {
                    ++class12.field204;
                    class121.method921(class84.field1877, 48, arg0.field1117, (byte) -70, arg0.field1162, 0, class18.field323);
                    return;
                }
                return;
            }
            if (class115.method892(true, class77.method561(93, arg0)) && (32 & class153.field3526) == 32) {
                class121.method921(class110.field2486, 42, arg0.field1117, (byte) -70, arg0.field1162, 0, class51.method395(new class128[] { class35.field656, class141.field3316, arg0.field1145 }, false));
                ++class43.field808;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public static void method25(byte arg0) {
        field93 = null;
        if (arg0 == -79) {
            field89 = null;
            field98 = null;
            field79 = null;
            field94 = null;
            field75 = null;
            field84 = null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "(I)I")
    public final int method26(int arg0) {
        ++field70;
        if (this.field95) {
            return 100;
        } else if (super.field3009 != null) {
            return 99;
        } else {
            int var2 = class131.method1027(1, 255, this.field97);
            if (var2 >= arg0) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(II)V")
    public final void method27(int arg0, int arg1) {
        ++field82;
        if (arg1 < -20) {
            if (this.field92 != null && this.field87 != null && this.field87[arg0]) {
                class120.method916(this, true, this.field92, arg0);
            } else {
                class129.method1020((byte) 2, this.field97, super.field2994[arg0], this, true, arg0, (byte) 74);
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method28(Component arg0, byte arg1) {
        arg0.addMouseListener(class148.field3417);
        if (arg1 != 83) {
            method17(73, true, -75, -105);
        }
        arg0.addMouseMotionListener(class148.field3417);
        arg0.addFocusListener(class148.field3417);
        ++field78;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(Lfa;Lfa;IZZZ)V")
    public class6(class37 arg0, class37 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field69 = arg1;
        this.field96 = arg5;
        this.field97 = arg2;
        this.field92 = arg0;
        class53.method404(this.field97, this, false);
    }

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "(I)V")
    private final void method29(int arg0) {
        ++field68;
        this.field87 = new boolean[super.field3009.length];
        for (int var2 = 0; ~var2 > ~this.field87.length; ++var2) {
            this.field87[var2] = false;
        }
        if (arg0 > 0) {
            this.field87 = null;
        }
        if (this.field92 == null) {
            this.field95 = true;
        } else {
            this.field77 = -1;
            for (int var3 = 0; var3 < this.field87.length; ++var3) {
                if (super.field3013[var3] > 0) {
                    class128.method1012(this.field92, var3, this, (byte) 37);
                    this.field77 = var3;
                }
            }
            if (~this.field77 == 0) {
                this.field95 = true;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(BI)I")
    private final int method30(byte arg0, int arg1) {
        if (arg0 != 42) {
            return 41;
        } else {
            ++field85;
            if (super.field3009[arg1] != null) {
                return 100;
            } else {
                return this.field87[arg1] ? 100 : class131.method1027(1, this.field97, arg1);
            }
        }
    }
}
