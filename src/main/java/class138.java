import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class138 extends class83 {

    @OriginalMember(owner = "client!tr", name = "R", descriptor = "I")
    private int field1766 = 0;

    @OriginalMember(owner = "client!tr", name = "V", descriptor = "[S")
    private short[] field1769 = new short[257];

    @OriginalMember(owner = "client!tr", name = "cb", descriptor = "J")
    public static long field1776 = 0L;

    @OriginalMember(owner = "client!tr", name = "K", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!tr", name = "L", descriptor = "I")
    public static int field1761;

    @OriginalMember(owner = "client!tr", name = "M", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!tr", name = "O", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!tr", name = "P", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!tr", name = "T", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!tr", name = "U", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!tr", name = "X", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!tr", name = "Y", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!tr", name = "Z", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!tr", name = "ab", descriptor = "I")
    public static int field1774;

    @OriginalMember(owner = "client!tr", name = "eb", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!tr", name = "fb", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!tr", name = "Q", descriptor = "[I")
    private int[] field1765;

    @OriginalMember(owner = "client!tr", name = "bb", descriptor = "[I")
    private int[] field1775;

    @OriginalMember(owner = "client!tr", name = "db", descriptor = "[I")
    public static int[] field1777;

    @OriginalMember(owner = "client!tr", name = "W", descriptor = "[[I")
    private int[][] field1770;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IB)[I", line = 3)
    private final int[] method752(int arg0, byte arg1) {
        ++field1762;
        if (~arg0 > -1) {
            return this.field1765;
        } else if (~arg0 <= ~this.field1770.length) {
            return this.field1775;
        } else {
            if (arg1 != -22) {
                field1777 = null;
            }
            return this.field1770[arg0];
        }
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(B)V", line = 22)
    public static final void method753(byte arg0) {
        if (arg0 != 124) {
            field1776 = -48L;
        }
        ++field1774;
        class380.method2330();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class36.field352[var1].method2704(0);
        }
        class116.method630((byte) -60);
        class80.method443(23574);
        System.gc();
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(I)V", line = 43)
    public static final void method754(int arg0) {
        class160.field2061.method613(true);
        if (arg0 == 16704) {
            ++field1772;
            class158.field2047.method613(true);
        }
    }

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "(B)V", line = 57)
    private final void method755(byte arg0) {
        ++field1767;
        int[] var2 = this.field1770[0];
        int[] var3 = this.field1770[1];
        int[] var4 = this.field1770[this.field1770.length + -2];
        if (arg0 != -119) {
            field1776 = 82L;
        }
        int[] var5 = this.field1770[this.field1770.length - 1];
        this.field1775 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
        this.field1765 = new int[] { var2[0] - (-var2[0] - -var3[0]), var2[1] + -var3[1] + var2[1] };
    }

    @OriginalMember(owner = "client!tr", name = "<init>", descriptor = "()V", line = 78)
    public class138() {
        super(1, true);
    }

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "(I)V", line = 82)
    public static final void method756(int arg0) {
        class38.field394.method613(true);
        ++field1779;
        int var1 = 104 / ((12 - arg0) / 47);
    }

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "(I)V", line = 100)
    private final void method757(int arg0) {
        int var2 = this.field1766;
        if (var2 != 2) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; ~var5 > ~(this.field1770.length + -1) && var4 >= this.field1770[var5][0]; ++var5) {
                    }
                    int[] var6 = this.field1770[var5 - 1];
                    int[] var7 = this.field1770[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] + -var6[0]);
                    int var9 = 4096 - class204.field2764[255 & var8 >> 5] >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 + var7[1] * var9 >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1769[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field1770.length + -1) && this.field1770[var14][0] <= var13; ++var14) {
                    }
                    int[] var15 = this.field1770[var14 - 1];
                    int[] var16 = this.field1770[var14];
                    int var17 = (-var15[0] + var13 << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field1769[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field1770.length + -1) < ~var22 && this.field1770[var22][0] <= var21; ++var22) {
                }
                int[] var23 = this.field1770[var22 + -1];
                int[] var24 = this.field1770[var22];
                int var25 = this.method752(var22 - 2, (byte) -22)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method752(var22 + 1, (byte) -22)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var26 + var28 - var27 - var25;
                int var32 = -var26 + var25 + -var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var26 + var35 + var36 + var37;
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1769[var20] = (short) var38;
            }
        }
        if (arg0 < -19) {
            ++field1768;
        }
    }

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "(Z)V", line = 283)
    public final void method120(boolean arg0) {
        ++field1764;
        if (this.field1770 == null) {
            this.field1770 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (!arg0) {
            if (~this.field1770.length > -3) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (this.field1766 == 2) {
                    this.method755((byte) -119);
                }
                class58.method316((byte) -16);
                this.method757(-58);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "(I)Z", line = 308)
    public static final boolean method758(int arg0) {
        if (arg0 != -10762) {
            field1776 = -7L;
        }
        ++field1761;
        return ~class101.field1182 != -1 ? true : class101.field1195;
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IBLtq;)V", line = 326)
    public final void method35(int arg0, byte arg1, class250 arg2) {
        int var4 = -87 % ((arg1 - -27) / 50);
        ++field1760;
        if (arg0 == 0) {
            this.field1766 = arg2.method1350(31351);
            this.field1770 = new int[arg2.method1350(31351)][2];
            for (int var5 = 0; this.field1770.length > var5; ++var5) {
                this.field1770[var5][0] = arg2.method1374(-2);
                this.field1770[var5][1] = arg2.method1374(-2);
            }
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(II)[I", line = 357)
    public final int[] method37(int arg0, int arg1) {
        ++field1763;
        if (arg0 != 2) {
            this.method120(true);
        }
        int[] var3 = super.field916.method1813(arg1, (byte) -32);
        if (super.field916.field4174) {
            int[] var4 = this.method451(0, 82, arg1);
            for (int var5 = 0; ~var5 > ~class420.field6139; ++var5) {
                int var6 = var4[var5] >> 4;
                if (var6 < 0) {
                    var6 = 0;
                }
                if (~var6 < -257) {
                    var6 = 256;
                }
                var3[var5] = this.field1769[var6];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "(I)V", line = 409)
    public static void method759(int arg0) {
        field1777 = null;
        if (arg0 > -17) {
            field1776 = -5L;
        }
    }

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "(III)V", line = 420)
    public static final void method760(int arg0, int arg1, int arg2) {
        if (arg1 != 1) {
            field1776 = -35L;
        }
        ++field1778;
        class40 var3 = class162.method872(0, (byte) 92, 15);
        var3.method190(0);
        var3.field413 = arg2;
        var3.field418 = arg0;
    }
}
