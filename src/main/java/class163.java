import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class163 extends class51 {

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Z")
    private boolean field3377 = true;

    @OriginalMember(owner = "client!sb", name = "sb", descriptor = "Z")
    private boolean field3396 = true;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "I")
    public static int field3380 = 10;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "[[[I")
    public static int[][][] field3387 = new int[4][13][13];

    @OriginalMember(owner = "client!sb", name = "rb", descriptor = "Lea;")
    public static class38 field3395 = class9.method46((byte) 115, "sl_back");

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "[[I")
    public static int[][] field3386 = new int[104][104];

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "I")
    public static int field3390 = 0;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "Lea;")
    private static class38 field3382 = class9.method46((byte) 127, "This computers address has been blocked");

    @OriginalMember(owner = "client!sb", name = "qb", descriptor = "Lea;")
    private static class38 field3394 = class9.method46((byte) 120, "Use");

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "Lea;")
    public static class38 field3384 = field3394;

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "Lea;")
    public static class38 field3391 = field3382;

    @OriginalMember(owner = "client!sb", name = "ub", descriptor = "I")
    public static int field3398 = 0;

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!sb", name = "ob", descriptor = "I")
    public static int field3392;

    @OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!sb", name = "vb", descriptor = "I")
    public static int field3399;

    @OriginalMember(owner = "client!sb", name = "tb", descriptor = "Lp;")
    public static class134 field3397;

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lhc;")
    public static class66 field3379;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "[I")
    public static int[] field3381;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field3393;
        if (arg0 <= 111) {
            this.method51((class66) null, -15, false);
        }
        int[][] var3 = super.field1292.method720(false, arg1);
        if (super.field1292.field2032) {
            int[][] var4 = this.method377(0, this.field3396 ? class144.field3018 - arg1 : arg1, (byte) -92);
            int[] var5 = var4[2];
            int[] var6 = var3[0];
            int[] var7 = var4[0];
            int[] var8 = var4[1];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (!this.field3377) {
                for (int var11 = 0; var11 < class86.field2008; ++var11) {
                    var6[var11] = var7[var11];
                    var9[var11] = var8[var11];
                    var10[var11] = var5[var11];
                }
            } else {
                for (int var12 = 0; class86.field2008 > var12; ++var12) {
                    var6[var12] = var7[-var12 + class39.field850];
                    var9[var12] = var8[-var12 + class39.field850];
                    var10[var12] = var5[-var12 + class39.field850];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static void method1165(byte arg0) {
        field3395 = null;
        if (arg0 != 94) {
            method1165((byte) 52);
        }
        field3394 = null;
        field3397 = null;
        field3391 = null;
        field3384 = null;
        field3387 = null;
        field3382 = null;
        field3381 = null;
        field3386 = null;
        field3379 = null;
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V")
    public static final void method1166(int arg0) {
        ++field3389;
        class33 var1 = (class33) class44.field1080.method1020(0);
        if (arg0 == -1) {
            while (var1 != null) {
                if (~class10.field224 == ~var1.field685 && class45.field1098 <= var1.field692) {
                    if (~var1.field675 >= ~class45.field1098) {
                        if (var1.field672 > 0) {
                            class102 var2 = class105.field2343[var1.field672 + -1];
                            if (var2 != null && var2.field406 >= 0 && ~var2.field406 > -13313 && ~var2.field382 <= -1 && var2.field382 < 13312) {
                                var1.method222(var2.field406, class45.field1098, true, var2.field382, class38.method257(var1.field685, -169496123, var2.field382, var2.field406) + -var1.field687);
                            }
                        }
                        if (~var1.field672 > -1) {
                            int var3 = -var1.field672 + -1;
                            class144 var4;
                            if (~class44.field1084 == ~var3) {
                                var4 = class195.field3842;
                            } else {
                                var4 = class175.field3550[var3];
                            }
                            if (var4 != null && ~var4.field406 <= -1 && ~var4.field406 > -13313 && var4.field382 >= 0 && var4.field382 < 13312) {
                                var1.method222(var4.field406, class45.field1098, true, var4.field382, class38.method257(var1.field685, -169496123, var4.field382, var4.field406) - var1.field687);
                            }
                        }
                        var1.method218(class205.field4027, -3317);
                        class101.field2268.method1135(class10.field224, (int) var1.field696, (int) var1.field695, (int) var1.field670, 60, var1, var1.field694, -1, false);
                    }
                } else {
                    var1.method805(false);
                }
                var1 = (class33) class44.field1080.method1027((byte) 55);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "(I)V")
    public static final void method1167(int arg0) {
        ++field3378;
        if (class31.field610 && class115.field2537 != class10.field224) {
            class139.method995((byte) -128, class52.field1342, class53.field1348, class195.field3842.field409[0], class10.field224, class195.field3842.field391[0]);
        } else {
            if (arg0 != 0) {
                method1165((byte) -58);
            }
            if (class193.field3807 != class10.field224) {
                class193.field3807 = class10.field224;
                class84.method711(class10.field224, (byte) 123);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I[Lea;)Lea;")
    public static final class38 method1168(int arg0, class38[] arg1) {
        int var2 = 125 % ((arg0 - 66) / 39);
        ++field3392;
        if (~arg1.length > -3) {
            throw new IllegalArgumentException();
        } else {
            return class113.method892(arg1.length, 0, -95, arg1);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field1289 = arg0.method509(119) == 1;
                }
            } else {
                this.field3396 = ~arg0.method509(119) == -2;
            }
        } else {
            this.field3377 = ~arg0.method509(117) == -2;
        }
        ++field3399;
        if (!arg2) {
            method1165((byte) 68);
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class163() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field3388;
        if (arg0 >= -125) {
            this.field3377 = false;
        }
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int[] var4 = this.method376(!this.field3396 ? arg1 : -arg1 + class144.field3018, 0, -101);
            if (!this.field3377) {
                class131.method966(var4, 0, var3, 0, class86.field2008);
            } else {
                for (int var5 = 0; ~class86.field2008 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class39.field850];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IZI)Lea;")
    public static final class38 method1169(int arg0, boolean arg1, int arg2) {
        ++field3383;
        if (arg2 != 10) {
            field3391 = null;
        }
        return class86.method718(arg2 ^ 114, 10, arg0, arg1);
    }
}
