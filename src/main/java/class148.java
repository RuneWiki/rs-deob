import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class148 extends class260 {

    @OriginalMember(owner = "client!qa", name = "V", descriptor = "I")
    private int field2697 = 4096;

    @OriginalMember(owner = "client!qa", name = "Y", descriptor = "I")
    private int field2700 = 0;

    @OriginalMember(owner = "client!qa", name = "O", descriptor = "Loh;")
    public static class263 field2690 = class253.method1681(-118, "<col=c0ff00>");

    @OriginalMember(owner = "client!qa", name = "Z", descriptor = "Loh;")
    public static class263 field2701 = class253.method1681(-121, "null");

    @OriginalMember(owner = "client!qa", name = "L", descriptor = "I")
    public static int field2687;

    @OriginalMember(owner = "client!qa", name = "M", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!qa", name = "N", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!qa", name = "P", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!qa", name = "Q", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!qa", name = "R", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!qa", name = "T", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!qa", name = "W", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!qa", name = "X", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!qa", name = "U", descriptor = "Loh;")
    public static class263 field2696;

    @OriginalMember(owner = "client!qa", name = "S", descriptor = "[I")
    public static int[] field2694;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(II)V")
    public static final void method966(int arg0, int arg1) {
        ++field2692;
        int var2 = 48 / ((arg0 - -60) / 62);
        class103 var3 = (class103) class184.field3327.method31(-32665, (long) arg1);
        if (var3 != null) {
            var3.method1614(-1204826926);
        }
    }

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(I)V")
    public static void method967(int arg0) {
        field2696 = null;
        if (arg0 != -24304) {
            method971(-9, 45);
        }
        field2694 = null;
        field2701 = null;
        field2690 = null;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)I")
    public static final int method968(int arg0) {
        ++field2693;
        if (arg0 <= 126) {
            method973(-123);
        }
        return class276.field4837;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        ++field2698;
        if (arg1 != 255) {
            this.field2697 = -66;
        }
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int[] var4 = this.method1711(arg0, 0, false);
            for (int var5 = 0; ~class49.field1052 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field2700 <= var6 && ~this.field2697 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        if (~arg0 != -1) {
            if (~arg0 == -2) {
                this.field2697 = arg2.method1294((byte) 3);
            }
        } else {
            this.field2700 = arg2.method1294((byte) 3);
        }
        ++field2695;
        if (arg1 != 5701) {
            method966(125, 3);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lsi;B)V")
    public static final void method969(class194 arg0, byte arg1) {
        int var2 = class195.field3540 >> 2 << 10;
        int var3 = class60.field1233 >> 1;
        ++field2688;
        byte[][] var4 = new byte[class8.field149][class112.field2110];
        while (~arg0.field3497 > ~arg0.field3469.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (~arg0.method1301(-8317) == -2) {
                var34 = arg0.method1301(-8317);
                var35 = arg0.method1301(-8317);
                var33 = true;
            }
            int var36 = arg0.method1301(-8317);
            int var37 = arg0.method1301(-8317);
            int var38 = -(var37 * 64) - (-class116.field2163 - (class112.field2110 + -1));
            int var39 = var36 * 64 + -class54.field1146;
            if (var39 >= 0 && var38 + -63 >= 0 && class8.field149 > var39 - -63 && ~var38 > ~class112.field2110) {
                for (int var40 = 0; ~var40 > -65; ++var40) {
                    byte[] var41 = var4[var39 + var40];
                    for (int var42 = 0; ~var42 > -65; ++var42) {
                        if (!var33 || var40 >= var34 * 8 && ~(var34 * 8 + 8) < ~var40 && var35 * 8 <= var42 && var35 * 8 - -8 > var42) {
                            var41[-var42 + var38] = arg0.method1281((byte) -96);
                        }
                    }
                }
            } else if (var33) {
                arg0.field3497 += 64;
            } else {
                arg0.field3497 += 4096;
            }
        }
        int var5 = class8.field149;
        if (arg1 < 6) {
            method969((class194) null, (byte) 79);
        }
        int var6 = class112.field2110;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; ~var5 < ~var12; ++var12) {
            for (int var13 = 0; var6 > var13; ++var13) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = 255 & var4[var27][var13];
                    if (~var28 < -1) {
                        class19 var29 = class47.method297(var28 + -1, 21758);
                        var9[var13] += var29.field435;
                        var8[var13] += var29.field434;
                        var7[var13] += var29.field425;
                        var11[var13] += var29.field427;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (~var30 <= -1) {
                    int var31 = 255 & var4[var30][var13];
                    if (~var31 < -1) {
                        class19 var32 = class47.method297(var31 + -1, 21758);
                        var9[var13] -= var32.field435;
                        var8[var13] -= var32.field434;
                        var7[var13] -= var32.field425;
                        var11[var13] -= var32.field427;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (~var12 <= -1) {
                int[][] var14 = class136.field2490[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; ~var6 < ~var20; ++var20) {
                    int var21 = var20 + -5;
                    int var22 = var20 + 5;
                    if (var22 < var6) {
                        var15 += var9[var22];
                        var16 += var7[var22];
                        var18 += var8[var22];
                        var19 += var10[var22];
                        var17 += var11[var22];
                    }
                    if (var21 >= 0) {
                        var17 -= var11[var21];
                        var16 -= var7[var21];
                        var18 -= var8[var21];
                        var19 -= var10[var21];
                        var15 -= var9[var21];
                    }
                    if (var20 >= 0 && ~var19 < -1) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var17 != 0 ? class151.method994(var16 / var19, false, var18 / var19, var15 * 256 / var17) : 0;
                        if (~var4[var12][var20] != -1) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (127 & var24) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 64512) - -(896 & var24) + var25;
                            var23[(class263.method1777(var20, 63) << 6) - -class263.method1777(var12, 63)] = class270.field4767[class4.method24(var26, (byte) 111, 96)];
                        } else if (var23 != null) {
                            var23[(class263.method1777(var20, 63) << 6) - -class263.method1777(63, var12)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(III)J")
    public static final long method970(int arg0, int arg1, int arg2) {
        class2 var3 = class18.field417[arg0][arg1][arg2];
        return var3 != null && var3.field43 != null ? var3.field43.field646 : 0L;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(II)I")
    public static final int method971(int arg0, int arg1) {
        if (arg0 != -16793) {
            return 106;
        } else {
            ++field2699;
            return arg1 >>> 8;
        }
    }

    @OriginalMember(owner = "client!qa", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILue;I)Loe;")
    public static final class140 method972(int arg0, class86 arg1, int arg2) {
        ++field2689;
        if (arg0 != -29769) {
            return null;
        } else {
            return !class180.method1205(arg2, 0, arg1) ? null : class19.method136((byte) -23);
        }
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(I)V")
    public static final void method973(int arg0) {
        class154.field2792.method1516(87, 21);
        class154.field2792.method1288((byte) -102, class220.method1506((byte) -88));
        ++field2687;
        if (arg0 > -35) {
            field2701 = null;
        }
        ++class41.field910;
        class154.field2792.method1276(class138.field2558, -80);
        class154.field2792.method1276(class143.field2616, -55);
        class154.field2792.method1288((byte) -44, class60.field1239);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lbi;I)V")
    public static final void method974(class90 arg0, int arg1) {
        ++field2691;
        for (class255 var2 = (class255) class234.field4083.method1878(true); var2 != null; var2 = (class255) class234.field4083.method1881(-14)) {
            if (var2.field4443 == arg0) {
                if (var2.field4434 != null) {
                    class43.field933.method1136(var2.field4434);
                    var2.field4434 = null;
                }
                var2.method1614(-1204826926);
                return;
            }
        }
        if (arg1 <= 55) {
            field2701 = null;
        }
    }
}
