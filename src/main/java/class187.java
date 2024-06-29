import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class187 extends class189 {

    @OriginalMember(owner = "client!ug", name = "hb", descriptor = "I")
    private int field3768 = 6;

    @OriginalMember(owner = "client!ug", name = "lb", descriptor = "I")
    public static int field3772 = 0;

    @OriginalMember(owner = "client!ug", name = "tb", descriptor = "[[B")
    public static byte[][] field3780 = new byte[50][];

    @OriginalMember(owner = "client!ug", name = "vb", descriptor = "Lgg;")
    public static class63 field3782 = class116.method911(43, "Konfig geladen)3");

    @OriginalMember(owner = "client!ug", name = "xb", descriptor = "Lgg;")
    private static class63 field3784 = class116.method911(43, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ug", name = "wb", descriptor = "Lgg;")
    public static class63 field3783 = field3784;

    @OriginalMember(owner = "client!ug", name = "gb", descriptor = "I")
    public static int field3767;

    @OriginalMember(owner = "client!ug", name = "ib", descriptor = "I")
    public static int field3769;

    @OriginalMember(owner = "client!ug", name = "kb", descriptor = "I")
    public static int field3771;

    @OriginalMember(owner = "client!ug", name = "nb", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!ug", name = "ob", descriptor = "I")
    public static int field3775;

    @OriginalMember(owner = "client!ug", name = "qb", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!ug", name = "rb", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!ug", name = "sb", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!ug", name = "pb", descriptor = "Lff;")
    public static class54 field3776;

    @OriginalMember(owner = "client!ug", name = "jb", descriptor = "[I")
    public static int[] field3770;

    @OriginalMember(owner = "client!ug", name = "mb", descriptor = "[I")
    public static int[] field3773;

    @OriginalMember(owner = "client!ug", name = "ub", descriptor = "[I")
    public static int[] field3781;

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(II)[[I")
    public final int[][] method83(int arg0, int arg1) {
        ++field3779;
        if (arg1 <= 34) {
            return null;
        } else {
            int[][] var3 = super.field3808.method237(-1, arg0);
            if (super.field3808.field561) {
                int[][] var4 = this.method1244((byte) 20, arg0, 0);
                int[][] var5 = this.method1244((byte) 20, arg0, 1);
                int[] var6 = var3[1];
                int[] var7 = var3[0];
                int[] var8 = var3[2];
                int[] var9 = var4[1];
                int[] var10 = var4[0];
                int[] var11 = var5[0];
                int[] var12 = var5[1];
                int[] var13 = var4[2];
                int[] var14 = var5[2];
                for (int var15 = 0; class54.field1430 > var15; ++var15) {
                    var7[var15] = this.method1228(var11[var15], (byte) -90, var10[var15]);
                    var6[var15] = this.method1228(var12[var15], (byte) -112, var9[var15]);
                    var8[var15] = this.method1228(var14[var15], (byte) -114, var13[var15]);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "([BIII)I")
    public static final int method1227(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field3778;
        int var4 = -1;
        for (int var5 = arg1; var5 < arg3; ++var5) {
            var4 = class89.field2085[(arg0[var5] ^ var4) & 255] ^ var4 >>> 8;
        }
        return var4 ^ arg2;
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V")
    public class187() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBI)I")
    private final int method1228(int arg0, byte arg1, int arg2) {
        ++field3775;
        int var4 = this.field3768;
        if (~var4 != -2) {
            if (~var4 != -3) {
                if (var4 != 3) {
                    if (var4 != 4) {
                        if (~var4 != -6) {
                            if (~var4 != -7) {
                                if (var4 != 7) {
                                    if (var4 != 8) {
                                        if (var4 != 9) {
                                            if (var4 != 10) {
                                                if (var4 != 11) {
                                                    if (var4 == 12) {
                                                        return arg2 - (arg0 * arg2 >> 11) + arg0;
                                                    } else {
                                                        if (arg1 > -82) {
                                                            this.method1228(-31, (byte) -43, -58);
                                                        }
                                                        return arg2;
                                                    }
                                                } else {
                                                    return arg2 <= arg0 ? -arg2 + arg0 : -arg0 + arg2;
                                                }
                                            } else {
                                                return ~arg2 >= ~arg0 ? arg0 : arg2;
                                            }
                                        } else {
                                            return ~arg0 >= ~arg2 ? arg0 : arg2;
                                        }
                                    } else {
                                        return arg2 == 0 ? 0 : -((-arg0 + 4096 << 12) / arg2) + 4096;
                                    }
                                } else {
                                    return arg2 != 4096 ? (arg0 << 12) / (-arg2 + 4096) : 4096;
                                }
                            } else {
                                return arg0 >= 2048 ? 4096 - ((4096 - arg0) * (-arg2 + 4096) >> 11) : arg0 * arg2 >> 11;
                            }
                        } else {
                            return -((-arg0 + 4096) * (-arg2 + 4096) >> 12) + 4096;
                        }
                    } else {
                        return arg0 == 0 ? 4096 : (arg2 << 12) / arg0;
                    }
                } else {
                    return arg0 * arg2 >> 12;
                }
            } else {
                return -arg0 + arg2;
            }
        } else {
            return arg0 + arg2;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BLnf;)V")
    public static final void method1229(byte arg0, class123 arg1) {
        long var2 = 0L;
        int var4 = -1;
        int var5 = 0;
        if (arg1.field2725 == 0) {
            var2 = class40.method366(arg1.field2726, arg1.field2709, arg1.field2728);
        }
        int var6 = 52 % ((76 - arg0) / 34);
        int var7 = 0;
        if (~arg1.field2725 == -2) {
            var2 = class157.method1090(arg1.field2726, arg1.field2709, arg1.field2728);
        }
        ++field3767;
        if (arg1.field2725 == 2) {
            var2 = class116.method910(arg1.field2726, arg1.field2709, arg1.field2728);
        }
        if (arg1.field2725 == 3) {
            var2 = class21.method221(arg1.field2726, arg1.field2709, arg1.field2728);
        }
        if (~var2 != -1L) {
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
            var7 = (3591475 & (int) var2) >> 20;
            var5 = 31 & (int) var2 >> 14;
        }
        arg1.field2724 = var7;
        arg1.field2711 = var4;
        arg1.field2718 = var5;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIII)I")
    public static final int method1230(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field3769;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return -arg0 + 7;
        } else {
            return arg2 != 7 ? 76 : arg3;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        if (arg0 != 0) {
            if (arg0 == 1) {
                super.field3811 = ~arg2.method64(31790) == -2;
            }
        } else {
            this.field3768 = arg2.method64(31790);
        }
        if (arg1 < 32) {
            this.method1228(87, (byte) 73, 27);
        }
        ++field3777;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field3774;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field3825.method681(arg1, (byte) -37);
            if (super.field3825.field1840) {
                int[] var4 = this.method1245(0, arg1, 11433);
                int[] var5 = this.method1245(1, arg1, 11433);
                for (int var6 = 0; var6 < class54.field1430; ++var6) {
                    var3[var6] = this.method1228(var5[var6], (byte) -88, var4[var6]);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field3770 = null;
        field3773 = null;
        field3784 = null;
        field3782 = null;
        field3776 = null;
        field3780 = null;
        if (arg0 == 1915930860) {
            field3783 = null;
            field3781 = null;
        }
    }
}
