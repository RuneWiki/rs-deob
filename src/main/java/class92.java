import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class92 extends class23 {

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    private int field1584 = 1;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "I")
    private int field1580 = 1;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "I")
    public static int field1576 = 1;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "Ldc;")
    public static class37 field1577 = class185.method1233((byte) 86, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "[I")
    public static int[] field1579 = new int[32768];

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field1582 = 0;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field1583 = 0;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Ldc;")
    public static class37 field1586 = class185.method1233((byte) 86, "Ung-Ultige Verbindung mit einem Anmelde)2Server)3");

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "[I")
    public static int[] field1573 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "[I")
    public static int[] field1581 = new int[1000];

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public static int field1588 = 0;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Ldc;")
    public static class37 field1589 = class185.method1233((byte) 86, "::fpson");

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1575;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Lnb;")
    public static class143 field1585;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IIIIIIIILia;IZJ)Z")
    public static final boolean method603(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class88 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; ++var13) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                if (var13 < 0 || var20 < 0 || var13 >= class238.field4372 || var20 >= client.field682) {
                    return false;
                }
                class18 var21 = class180.field3354[arg0][var13][var20];
                if (var21 != null && var21.field290 >= 5) {
                    return false;
                }
            }
        }
        class94 var14 = new class94();
        var14.field1641 = arg11;
        var14.field1636 = arg0;
        var14.field1640 = arg5;
        var14.field1648 = arg6;
        var14.field1646 = arg7;
        var14.field1653 = arg8;
        var14.field1650 = arg9;
        var14.field1639 = arg1;
        var14.field1645 = arg2;
        var14.field1651 = arg1 + arg3 - 1;
        var14.field1637 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var16 = arg2; var16 < arg2 + arg4; ++var16) {
                int var17 = 0;
                if (var15 > arg1) {
                    ++var17;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; --var18) {
                    if (class180.field3354[var18][var15][var16] == null) {
                        class180.field3354[var18][var15][var16] = new class18(var18, var15, var16);
                    }
                }
                class18 var19 = class180.field3354[arg0][var15][var16];
                var19.field289[var19.field290] = var14;
                var19.field285[var19.field290] = var17;
                var19.field301 |= var17;
                ++var19.field290;
            }
        }
        if (arg10) {
            class243.field4455[class23.field393++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IB)[[I")
    public final int[][] method36(int arg0, byte arg1) {
        ++field1578;
        if (arg1 != 9) {
            field1586 = null;
        }
        int[][] var3 = super.field398.method1522(arg1 ^ -29652, arg0);
        if (super.field398.field4303) {
            int var4 = this.field1584 - (-this.field1584 + -1);
            int var5 = 65536 / var4;
            int var6 = this.field1580 + 1 + this.field1580;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field1584 + arg0; arg0 - -this.field1584 >= var9; ++var9) {
                int[][] var19 = this.method159(0, (byte) -126, var9 & class5.field44);
                int var20 = 0;
                int[][] var21 = new int[3][class199.field3705];
                int[] var22 = var19[0];
                int[] var23 = var19[2];
                int var24 = 0;
                int[] var25 = var19[1];
                int var26 = 0;
                for (int var27 = -this.field1580; var27 <= this.field1580; ++var27) {
                    int var37 = var27 & class215.field4008;
                    var24 += var22[var37];
                    var20 += var25[var37];
                    var26 += var23[var37];
                }
                int[] var28 = var21[0];
                int[] var29 = var21[1];
                int[] var30 = var21[2];
                int var31 = 0;
                while (~class199.field3705 < ~var31) {
                    var28[var31] = var7 * var24 >> 16;
                    var29[var31] = var7 * var20 >> 16;
                    var30[var31] = var7 * var26 >> 16;
                    int var32 = class215.field4008 & -this.field1580 + var31;
                    int var33 = var26 - var23[var32];
                    int var34 = var24 - var22[var32];
                    ++var31;
                    int var35 = var20 - var25[var32];
                    int var36 = var31 - -this.field1580 & class215.field4008;
                    var20 = var25[var36] + var35;
                    var24 = var22[var36] + var34;
                    var26 = var23[var36] + var33;
                }
                var8[this.field1584 + var9 - arg0] = var21;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class199.field3705 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; ~var17 > ~var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                    var16 += var18[2][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(Z)V")
    public static void method604(boolean arg0) {
        field1573 = null;
        field1581 = null;
        if (!arg0) {
            method603(-86, -91, -42, 11, 118, 120, -60, 1, (class88) null, 30, false, 47L);
        }
        field1577 = null;
        field1585 = null;
        field1586 = null;
        field1589 = null;
        field1579 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field1574;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field407 = arg0.method215(arg2 + -1797814752) == 1;
                }
            } else {
                this.field1584 = arg0.method215(-1797813752);
            }
        } else {
            this.field1580 = arg0.method215(-1797813752);
        }
        if (arg2 != 1000) {
            method604(true);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            field1588 = -103;
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -125);
        if (super.field405.field4114) {
            int var4 = this.field1584 - -1 + this.field1584;
            int var5 = 65536 / var4;
            int[][] var6 = new int[var4][];
            int var7 = this.field1580 - (-this.field1580 - 1);
            int var8 = 65536 / var7;
            for (int var9 = arg1 - this.field1584; var9 <= arg1 - -this.field1584; ++var9) {
                int[] var13 = this.method162(class5.field44 & var9, 0, (byte) 18);
                int[] var14 = new int[class199.field3705];
                int var15 = 0;
                for (int var16 = -this.field1580; ~var16 >= ~this.field1580; ++var16) {
                    var15 += var13[var16 & class215.field4008];
                }
                int var17 = 0;
                while (class199.field3705 > var17) {
                    var14[var17] = var8 * var15 >> 16;
                    int var18 = var15 - var13[class215.field4008 & -this.field1580 + var17];
                    ++var17;
                    var15 = var13[class215.field4008 & this.field1580 + var17] + var18;
                }
                var6[-arg1 + this.field1584 + var9] = var14;
            }
            for (int var10 = 0; ~var10 > ~class199.field3705; ++var10) {
                int var11 = 0;
                for (int var12 = 0; ~var12 > ~var4; ++var12) {
                    var11 += var6[var12][var10];
                }
                var3[var10] = var5 * var11 >> 16;
            }
        }
        ++field1575;
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class92() {
        super(1, false);
    }
}
