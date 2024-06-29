import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class126 extends class215 {

    @OriginalMember(owner = "client!jm", name = "Pb", descriptor = "I")
    public static int field1771 = 0;

    @OriginalMember(owner = "client!jm", name = "Db", descriptor = "Llm;")
    public static class150 field1759 = new class150(2);

    @OriginalMember(owner = "client!jm", name = "Rb", descriptor = "Llh;")
    public static class58 field1773 = new class58();

    @OriginalMember(owner = "client!jm", name = "Ub", descriptor = "Ljava/lang/String;")
    public static String field1776 = "flash2:";

    @OriginalMember(owner = "client!jm", name = "Tb", descriptor = "I")
    public static int field1775 = -1;

    @OriginalMember(owner = "client!jm", name = "Vb", descriptor = "[I")
    public static int[] field1777 = new int[128];

    @OriginalMember(owner = "client!jm", name = "Wb", descriptor = "[Ljava/lang/String;")
    public static String[] field1778 = new String[100];

    @OriginalMember(owner = "client!jm", name = "Xb", descriptor = "Ljava/lang/String;")
    public static String field1779 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!jm", name = "Cb", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!jm", name = "Eb", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!jm", name = "Fb", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!jm", name = "Gb", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!jm", name = "Hb", descriptor = "I")
    private int field1763;

    @OriginalMember(owner = "client!jm", name = "Jb", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!jm", name = "Kb", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!jm", name = "Lb", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!jm", name = "Nb", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!jm", name = "Ob", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!jm", name = "Qb", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!jm", name = "Sb", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!jm", name = "Mb", descriptor = "Lak;")
    private class20 field1768;

    @OriginalMember(owner = "client!jm", name = "Ib", descriptor = "[Lvd;")
    public static class160[] field1764;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "(Z)V")
    public final void method804(boolean arg0) {
        if (arg0) {
            this.method813(-41, -40);
        }
        ++field1765;
        this.field1763 = super.field3280 * 8;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IB)I")
    public final int method805(int arg0, byte arg1) {
        int var3 = -(7 & this.field1763) + 8;
        int var4 = 0;
        ++field1760;
        int var5 = this.field1763 >> 3;
        int var6 = -49 / ((-56 - arg1) / 35);
        this.field1763 += arg0;
        while (~arg0 < ~var3) {
            var4 += (class147.field2016[var3] & super.field3287[var5++]) << arg0 - var3;
            arg0 -= var3;
            var3 = 8;
        }
        int var7;
        if (arg0 == var3) {
            var7 = (super.field3287[var5] & class147.field2016[var3]) + var4;
        } else {
            var7 = (super.field3287[var5] >> -arg0 + var3 & class147.field2016[arg0]) + var4;
        }
        return var7;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "(I)V")
    public class126(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!jm", name = "s", descriptor = "(I)I")
    public final int method806(int arg0) {
        ++field1761;
        return arg0 != 27672 ? 79 : super.field3287[super.field3280++] + -this.field1768.method134(true) & 255;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[BIZ)V")
    public final void method807(int arg0, byte[] arg1, int arg2, boolean arg3) {
        ++field1758;
        for (int var5 = 0; var5 < arg0; ++var5) {
            arg1[arg2 + var5] = (byte) (super.field3287[super.field3280++] + -this.field1768.method134(arg3));
        }
        if (!arg3) {
            field1778 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "t", descriptor = "(I)V")
    public static void method808(int arg0) {
        field1779 = null;
        field1759 = null;
        field1777 = null;
        field1778 = null;
        if (arg0 != 0) {
            method814(125, (byte) 32);
        }
        field1776 = null;
        field1764 = null;
        field1773 = null;
    }

    @OriginalMember(owner = "client!jm", name = "q", descriptor = "(II)V")
    public final void method809(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method805(-83, (byte) 23);
        }
        super.field3287[super.field3280++] = (byte) (arg0 + this.field1768.method134(true));
        ++field1767;
    }

    @OriginalMember(owner = "client!jm", name = "u", descriptor = "(I)V")
    public final void method810(int arg0) {
        super.field3280 = (this.field1763 + 7) / 8;
        ++field1762;
        if (arg0 >= -41) {
            field1778 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "([II)V")
    public final void method811(int[] arg0, int arg1) {
        if (arg1 == 128) {
            ++field1766;
            this.field1768 = new class20(arg0);
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIBIZIZ)V")
    public static final void method812(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6, boolean arg7) {
        ++field1769;
        if (arg7 || ~class200.field3045 != ~arg6 || class281.field4460 != arg4 || class249.field3890 != arg0 && !class294.method1973(2)) {
            class249.field3890 = arg0;
            class200.field3045 = arg6;
            class281.field4460 = arg4;
            if (class294.method1973(2)) {
                class249.field3890 = 0;
            }
            if (!arg5) {
                class82.method519(-123, 25);
            } else {
                class82.method519(-124, 28);
            }
            class188.method1188(true, (byte) -14, class294.field4694);
            int var8 = class228.field3570;
            class228.field3570 = (arg6 + -6) * 8;
            int var9 = class170.field2421;
            class170.field2421 = (arg4 + -6) * 8;
            class26.field411 = class97.method619(class200.field3045 * 8, class281.field4460 * 8);
            int var10 = -var8 + class228.field3570;
            int var11 = class228.field3570;
            if (arg3 >= -96) {
                field1775 = -102;
            }
            class139.field1925 = null;
            int var12 = -var9 + class170.field2421;
            int var13 = class170.field2421;
            if (!arg5) {
                for (int var14 = 0; ~var14 > -32769; ++var14) {
                    class310 var15 = class88.field1274[var14];
                    if (var15 != null) {
                        for (int var16 = 0; var16 < 10; ++var16) {
                            var15.field4143[var16] -= var10;
                            var15.field4053[var16] -= var12;
                        }
                        var15.field4081 -= var10 * 128;
                        var15.field4140 -= var12 * 128;
                    }
                }
            } else {
                class306.field4921 = 0;
                for (int var17 = 0; ~var17 > -32769; ++var17) {
                    class310 var33 = class88.field1274[var17];
                    if (var33 != null) {
                        var33.field4081 -= var10 * 128;
                        var33.field4140 -= var12 * 128;
                        if (~var33.field4081 <= -1 && var33.field4081 <= 13184 && ~var33.field4140 <= -1 && ~var33.field4140 >= -13185) {
                            for (int var34 = 0; var34 < 10; ++var34) {
                                var33.field4143[var34] -= var10;
                                var33.field4053[var34] -= var12;
                            }
                            class131.field1834[class306.field4921++] = var17;
                        } else {
                            class88.field1274[var17].method2103((class211) null, (byte) -119);
                            class88.field1274[var17] = null;
                        }
                    }
                }
            }
            for (int var18 = 0; ~var18 > -2049; ++var18) {
                class314 var31 = class48.field689[var18];
                if (var31 != null) {
                    for (int var32 = 0; ~var32 > -11; ++var32) {
                        var31.field4143[var32] -= var10;
                        var31.field4053[var32] -= var12;
                    }
                    var31.field4140 -= var12 * 128;
                    var31.field4081 -= var10 * 128;
                }
            }
            class166.field2364 = arg0;
            byte var19 = 0;
            class250.field3905.method2122(arg2, false, 0, arg1);
            byte var20 = 104;
            byte var21 = 1;
            if (~var10 > -1) {
                var20 = -1;
                var21 = -1;
                var19 = 103;
            }
            byte var22 = 0;
            byte var23 = 1;
            byte var24 = 104;
            if (~var12 > -1) {
                var23 = -1;
                var22 = 103;
                var24 = -1;
            }
            for (int var25 = var19; ~var20 != ~var25; var25 += var21) {
                for (int var27 = var22; var24 != var27; var27 += var23) {
                    int var28 = var10 + var25;
                    int var29 = var12 + var27;
                    for (int var30 = 0; var30 < 4; ++var30) {
                        if (~var28 <= -1 && ~var29 <= -1 && var28 < 104 && var29 < 104) {
                            class78.field1088[var30][var25][var27] = class78.field1088[var30][var28][var29];
                        } else {
                            class78.field1088[var30][var25][var27] = null;
                        }
                    }
                }
            }
            for (class197 var26 = (class197) class69.field966.method369((byte) -122); var26 != null; var26 = (class197) class69.field966.method362(false)) {
                var26.field3009 -= var10;
                var26.field3006 -= var12;
                if (~var26.field3009 > -1 || var26.field3006 < 0 || ~var26.field3009 <= -105 || var26.field3006 >= 104) {
                    var26.method962(128);
                }
            }
            class114.field1647 = 0;
            if (arg5) {
                class178.field2603 -= var10 * 128;
                class23.field370 -= var12;
                class188.field2848 -= var12 * 128;
                class297.field4726 -= var12;
                class312.field5014 -= var10;
                class142.field1944 -= var10;
            } else if (class12.field203 != 4) {
                class12.field203 = 1;
            } else {
                class249.field3894 -= var10 * 128;
                class21.field341 -= var10 * 128;
                class50.field711 -= var12 * 128;
                class250.field3906 -= var12 * 128;
            }
            if (class141.field1939 != 0) {
                class274.field4354 -= var12;
                class141.field1939 -= var10;
            }
            class70.method468(0);
            class8.field89.method365((byte) 75);
            class234.field3658.method365((byte) -61);
            class220.method1434();
        }
    }

    @OriginalMember(owner = "client!jm", name = "r", descriptor = "(II)I")
    public final int method813(int arg0, int arg1) {
        ++field1770;
        if (arg0 != 8) {
            this.method804(false);
        }
        return arg1 * 8 - this.field1763;
    }

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "(IB)C")
    public static final char method814(int arg0, byte arg1) {
        ++field1772;
        int var2 = 255 & arg1;
        if (var2 == 0) {
            throw new IllegalArgumentException("Non cp1252 character 0x" + Integer.toString(var2, 16) + " provided");
        } else {
            if (var2 >= 128 && ~var2 > -161) {
                char var3 = class85.field1212[var2 + -128];
                if (~var3 == -1) {
                    var3 = '?';
                }
                var2 = var3;
            }
            if (arg0 != -404579261) {
                field1764 = null;
            }
            return (char) var2;
        }
    }
}
