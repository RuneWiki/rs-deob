import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class95 extends class89 {

    @OriginalMember(owner = "client!bf", name = "X", descriptor = "I")
    private int field1771 = 0;

    @OriginalMember(owner = "client!bf", name = "db", descriptor = "[S")
    private short[] field1777 = new short[257];

    @OriginalMember(owner = "client!bf", name = "cb", descriptor = "Lha;")
    public static class46 field1776 = class271.method1828("<col=ff9040>", -46);

    @OriginalMember(owner = "client!bf", name = "gb", descriptor = "I")
    public static int field1780 = -1;

    @OriginalMember(owner = "client!bf", name = "R", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!bf", name = "T", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!bf", name = "U", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!bf", name = "W", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!bf", name = "Z", descriptor = "I")
    public static int field1773;

    @OriginalMember(owner = "client!bf", name = "bb", descriptor = "I")
    public static int field1775;

    @OriginalMember(owner = "client!bf", name = "eb", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!bf", name = "fb", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!bf", name = "hb", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!bf", name = "ib", descriptor = "I")
    public static int field1782;

    @OriginalMember(owner = "client!bf", name = "jb", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!bf", name = "kb", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!bf", name = "S", descriptor = "Lpi;")
    public static class181 field1766;

    @OriginalMember(owner = "client!bf", name = "V", descriptor = "[I")
    private int[] field1769;

    @OriginalMember(owner = "client!bf", name = "ab", descriptor = "[I")
    private int[] field1774;

    @OriginalMember(owner = "client!bf", name = "Y", descriptor = "[[I")
    private int[][] field1772;

    @OriginalMember(owner = "client!bf", name = "d", descriptor = "(I)V")
    private final void method740(int arg0) {
        if (arg0 != 1) {
            field1780 = -57;
        }
        ++field1767;
        int var2 = this.field1771;
        if (~var2 != -3) {
            if (var2 == 1) {
                for (int var3 = 0; var3 < 257; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field1772.length + -1 > var5 && this.field1772[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field1772[var5];
                    int[] var7 = this.field1772[var5 + -1];
                    int var8 = (-var7[0] + var4 << 12) / (var6[0] - var7[0]);
                    int var9 = -class142.field2594[(var8 & 8187) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var9 + var7[1] * var10 >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1777[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; var12 < 257; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~var14 > ~(this.field1772.length + -1) && ~this.field1772[var14][0] >= ~var13; ++var14) {
                    }
                    int[] var15 = this.field1772[var14];
                    int[] var16 = this.field1772[var14 + -1];
                    int var17 = (-var16[0] + var13 << 12) / (var15[0] + -var16[0]);
                    int var18 = 4096 - var17;
                    int var19 = var15[1] * var17 + var16[1] * var18 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field1777[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field1772.length + -1 > var22 && ~this.field1772[var22][0] >= ~var21; ++var22) {
                }
                int[] var23 = this.field1772[var22];
                int[] var24 = this.field1772[var22 + -1];
                int var25 = this.method741(var22 + -2, 32394)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = -var25 + var27;
                int var29 = this.method741(var22 + 1, arg0 + 32393)[1];
                int var30 = (-var24[0] + var21 << 12) / (var23[0] + -var24[0]);
                int var31 = var30 * var30 >> 12;
                int var32 = -var27 + var29 + var26 + -var25;
                int var34 = (var30 * var32 >> 12) * var31 >> 12;
                int var35 = -var26 + var25 + -var32;
                int var36 = var31 * var35 >> 12;
                int var37 = var28 * var30 >> 12;
                int var38 = var34 - -var26 + var36 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field1777[var20] = (short) var38;
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(II)[I")
    private final int[] method741(int arg0, int arg1) {
        ++field1773;
        if (arg0 < 0) {
            return this.field1769;
        } else if (~arg0 <= ~this.field1772.length) {
            return this.field1774;
        } else {
            if (arg1 != 32394) {
                method743(-46, 37);
            }
            return this.field1772[arg0];
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        int var3 = -39 / ((51 - arg1) / 44);
        ++field1781;
        int[] var4 = super.field1688.method936(1, arg0);
        if (super.field1688.field2200) {
            int[] var5 = this.method685(102, arg0, 0);
            for (int var6 = 0; ~var6 > ~class241.field4284; ++var6) {
                int var7 = var5[var6] >> 4;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (~var7 < -257) {
                    var7 = 256;
                }
                var4[var6] = this.field1777[var7];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(Z)V")
    public static void method742(boolean arg0) {
        field1766 = null;
        if (!arg0) {
            field1776 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public final void method8(boolean arg0) {
        ++field1782;
        if (this.field1772 == null) {
            this.field1772 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (this.field1772.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1771 == 2) {
                this.method747(257);
            }
            class49.method365((byte) 124);
            if (arg0) {
                this.method740(1);
            }
        }
    }

    @OriginalMember(owner = "client!bf", name = "b", descriptor = "(II)Z")
    public static final boolean method743(int arg0, int arg1) {
        ++field1765;
        if (arg0 != 0) {
            return false;
        } else if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            return ~arg1 > -130 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class95() {
        super(1, true);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field1771 = arg0.method558(arg1 + 641641493);
            this.field1772 = new int[arg0.method558(1)][2];
            for (int var4 = 0; var4 < this.field1772.length; ++var4) {
                this.field1772[var4][0] = arg0.method545((byte) 87);
                this.field1772[var4][1] = arg0.method545((byte) 46);
            }
        }
        if (arg1 == -641641492) {
            ++field1779;
        }
    }

    @OriginalMember(owner = "client!bf", name = "c", descriptor = "(II)I")
    public static final int method744(int arg0, int arg1) {
        int var2 = -113 / ((arg1 - 78) / 33);
        ++field1770;
        return ~arg0 == -16711936 ? -1 : class190.method1375(arg0, true);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIBII)V")
    public static final void method745(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 > -121) {
            field1780 = -89;
        }
        class146.field2644 = -1;
        class57.field950 = class137.field2474 * arg0 / arg1;
        ++field1783;
        class194.field3490 = class49.field836 * arg4 / arg3;
        class26.field521 = -1;
        class212.method1498(-71);
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(BIIII)V")
    public static final void method746(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1768;
        class80 var5 = (class80) class126.field2308.method1601(-107, (long) arg2);
        if (var5 == null) {
            var5 = new class80();
            class126.field2308.method1597((long) arg2, (byte) -126, var5);
        }
        if (~var5.field1522.length >= ~arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 - -1];
            for (int var8 = 0; ~var8 > ~var5.field1522.length; ++var8) {
                var6[var8] = var5.field1522[var8];
                var7[var8] = var5.field1526[var8];
            }
            for (int var9 = var5.field1522.length; var9 < arg3; ++var9) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1522 = var6;
            var5.field1526 = var7;
        }
        if (arg0 != 28) {
            method744(38, 9);
        }
        var5.field1522[arg3] = arg1;
        var5.field1526[arg3] = arg4;
    }

    @OriginalMember(owner = "client!bf", name = "e", descriptor = "(I)V")
    private final void method747(int arg0) {
        ++field1784;
        if (arg0 == 257) {
            int[] var2 = this.field1772[0];
            int[] var3 = this.field1772[1];
            int[] var4 = this.field1772[this.field1772.length + -2];
            int[] var5 = this.field1772[this.field1772.length + -1];
            this.field1774 = new int[] { var4[0] + -var5[0] + var4[0], var4[1] + -var5[1] + var4[1] };
            this.field1769 = new int[] { var2[0] - var3[0] - -var2[0], var2[1] + var2[1] - var3[1] };
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(IIIBIII)V")
    public static final void method748(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class222[] var7 = class84.field1611;
        int var8 = 71 / ((arg3 - -74) / 37);
        for (int var9 = 0; var9 < var7.length; ++var9) {
            class222 var10 = var7[var9];
            if (var10 != null && var10.field3899 == 2) {
                class137.method1050(arg4 >> 1, arg1, arg6, (var10.field3913 - class29.field567 << 7) + var10.field3900, arg5 >> 1, var10.field3906 * 2, (-class77.field1432 + var10.field3898 << 7) + var10.field3905, 109);
                if (class259.field4520 > -1 && class157.field2803 % 20 < 10) {
                    class168.field2956[var10.field3897].method119(class259.field4520 + arg2 - 12, class271.field4728 + -28 + arg0);
                }
            }
        }
        ++field1778;
    }
}
