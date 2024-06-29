import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class2 extends class64 {

    @OriginalMember(owner = "client!aa", name = "mb", descriptor = "I")
    private int field39 = 5;

    @OriginalMember(owner = "client!aa", name = "sb", descriptor = "I")
    private int field45 = 5;

    @OriginalMember(owner = "client!aa", name = "tb", descriptor = "I")
    private int field46 = 2048;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
    private int field31 = 0;

    @OriginalMember(owner = "client!aa", name = "vb", descriptor = "I")
    private int field48 = 1;

    @OriginalMember(owner = "client!aa", name = "zb", descriptor = "I")
    private int field52 = 2;

    @OriginalMember(owner = "client!aa", name = "Ab", descriptor = "I")
    private int field53 = 25;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "Lsg;")
    public static class169 field32 = class165.method1060("Ihr Spielkonto wird bereits benutzt)3", 1536);

    @OriginalMember(owner = "client!aa", name = "ob", descriptor = "[I")
    public static int[] field41 = new int[32];

    @OriginalMember(owner = "client!aa", name = "ub", descriptor = "I")
    public static int field47 = 0;

    @OriginalMember(owner = "client!aa", name = "rb", descriptor = "Z")
    public static boolean field44 = false;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lcb;")
    public static class22 field28 = new class22();

    @OriginalMember(owner = "client!aa", name = "xb", descriptor = "[B")
    public static byte[] field50 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "I")
    private int field29;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!aa", name = "hb", descriptor = "I")
    private int field34;

    @OriginalMember(owner = "client!aa", name = "ib", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!aa", name = "jb", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!aa", name = "lb", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!aa", name = "nb", descriptor = "I")
    private int field40;

    @OriginalMember(owner = "client!aa", name = "pb", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!aa", name = "wb", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!aa", name = "yb", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!aa", name = "kb", descriptor = "Lga;")
    public static class57 field37;

    @OriginalMember(owner = "client!aa", name = "qb", descriptor = "[I")
    public static int[] field43;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "[[I")
    private int[][] field30;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "(I)V")
    public static void method12(int arg0) {
        field50 = null;
        field32 = null;
        if (arg0 != 8192) {
            field32 = null;
        }
        field37 = null;
        field41 = null;
        field28 = null;
        field43 = null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIII)[I")
    private final int[] method13(int arg0, int arg1, int arg2, int arg3) {
        ++field51;
        int[] var5 = new int[arg1];
        for (int var6 = 0; ~arg1 < ~var6; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field34 + arg2;
        int var8 = this.field40 + arg3;
        if (var7 > 4096) {
            var7 -= 4096;
        }
        if (~var8 < -4097) {
            var8 -= 4096;
        }
        int var9 = this.field39 * var7 >> 12;
        int var10 = this.field45 * var8 >> 12;
        int var11 = -1;
        int var12 = Integer.MAX_VALUE;
        int var13 = -1;
        int var14 = Integer.MAX_VALUE;
        int var15 = ~this.field45 >= arg0 ? this.field45 - 1 : 2;
        int var16 = ~this.field39 < -3 ? 2 : this.field39 + -1;
        for (int var17 = -var15; ~var17 >= ~var15; ++var17) {
            for (int var25 = -var16; ~var25 >= ~var16; ++var25) {
                int var26 = var10 - -var17;
                if (~var26 > -1) {
                    var26 += this.field45;
                }
                if (this.field45 <= var26) {
                    var26 -= this.field45;
                }
                int var27 = var9 + var25;
                if (var27 < 0) {
                    var27 += this.field39;
                }
                if (~this.field39 >= ~var27) {
                    var27 -= this.field39;
                }
                int var28 = this.field45 * var27 + var26;
                int var29 = this.field30[var28][0];
                int var30 = this.field30[var28][1];
                int var31 = -var30 + var7;
                if (~var31 > -1) {
                    var31 = -var31;
                }
                if (~var31 < -2049) {
                    var31 = -var31 + 4096;
                }
                int var32 = -var29 + var8;
                if (~var32 > -1) {
                    var32 = -var32;
                }
                if (var32 > 2048) {
                    var32 = -var32 + 4096;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (~var33 > ~var14) {
                    if (~var13 != 0) {
                        var13 = var11;
                        var12 = var14;
                    } else {
                        var13 = var28;
                        var12 = var33;
                    }
                    var14 = var33;
                    var11 = var28;
                } else if (~var11 == ~var13 && ~var13 != ~var28 || var12 > var33 && var11 != var28) {
                    var12 = var33;
                    var13 = var28;
                }
            }
        }
        int var18 = -this.field30[var11][0] + var8;
        if (var18 < 0) {
            var18 = -var18;
        }
        if (var18 > 2048) {
            var18 = -var18 + 4096;
        }
        int var19 = -this.field30[var11][1] + var7;
        if (~var19 > -1) {
            var19 = -var19;
        }
        if (~var19 < -2049) {
            var19 = -var19 + 4096;
        }
        int var20 = -this.field30[var13][0] + var8;
        if (var20 < 0) {
            var20 = -var20;
        }
        if (var20 > 2048) {
            var20 = -var20 + 4096;
        }
        int var21 = -this.field30[var13][1] + var7;
        if (var21 < 0) {
            var21 = -var21;
        }
        if (var21 > 2048) {
            var21 = 4096 - var21;
        }
        int var22 = this.field48;
        int var23;
        int var24;
        if (var22 != 1) {
            if (~var22 == -3) {
                var23 = Math.max(var18, var19);
                var24 = Math.max(var20, var21);
            } else {
                var23 = var18 * var18 - -(var19 * var19);
                var24 = var20 * var20 + var21 * var21;
            }
        } else {
            var23 = (int) Math.sqrt((double) (var18 * var18 + var19 * var19));
            var24 = (int) Math.sqrt((double) (var20 * var20 + var21 * var21));
        }
        var5[0] = this.field29 * var23;
        if (~arg1 < -2) {
            var5[1] = this.field29 * var24;
        }
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V")
    public class2() {
        super(0, true);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field39 = arg1.method819((byte) 22);
                                }
                            } else {
                                this.field45 = arg1.method819((byte) 22);
                            }
                        } else {
                            this.field48 = arg1.method819((byte) 22);
                        }
                    } else {
                        this.field52 = arg1.method819((byte) 22);
                    }
                } else {
                    this.field46 = arg1.method785(true);
                }
            } else {
                this.field31 = arg1.method819((byte) 22);
            }
        } else {
            this.field45 = this.field39 = arg1.method819((byte) 22);
        }
        int var5 = -34 / ((arg0 - -60) / 36);
        ++field33;
    }

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "(I)V")
    private final void method15(int arg0) {
        ++field49;
        Random var2 = new Random((long) this.field31);
        this.field53 = this.field45 * this.field39;
        int var3 = arg0 / this.field45;
        this.field30 = new int[this.field53][2];
        int var4 = 4096 / this.field39;
        this.field34 = var4 >> 1;
        this.field40 = var3 >> 1;
        int var5 = this.field46 * this.field40 >> 12;
        int var6 = this.field46 * this.field34 >> 12;
        for (int var7 = 0; var7 < this.field39; ++var7) {
            int var8 = var4 * var7;
            for (int var9 = 0; this.field45 > var9; ++var9) {
                int var10 = this.field45 * var7 + var9;
                int var11 = (-4096 + class45.method283(-1838102752, var2, 8192)) * var5 >> 12;
                int var12 = (class45.method283(-1838102752, var2, 8192) - 4096) * var6 >> 12;
                this.field30[var10][0] = var3 * var9 + var11;
                this.field30[var10][1] = var8 + var12;
            }
        }
        this.field29 = ~this.field39 <= ~this.field45 ? this.field39 : this.field45;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        if (arg1 != 19) {
            field43 = null;
        }
        ++field42;
        int[] var3 = super.field1192.method19((byte) 126, arg0);
        if (super.field1192.field75) {
            int var4 = class189.field3699[arg0];
            int var5 = this.field52;
            if (~var5 != -3) {
                if (~var5 == -2) {
                    for (int var6 = 0; var6 < class147.field2715; ++var6) {
                        int var7 = class185.field3607[var6];
                        var3[var6] = this.method13(-3, 2, var4, var7)[1];
                    }
                } else {
                    for (int var8 = 0; class147.field2715 > var8; ++var8) {
                        int var9 = class185.field3607[var8];
                        var3[var8] = this.method13(arg1 + -22, 1, var4, var9)[0];
                    }
                }
            } else {
                for (int var10 = 0; ~class147.field2715 < ~var10; ++var10) {
                    int var11 = class185.field3607[var10];
                    int[] var12 = this.method13(-3, 2, var4, var11);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        if (arg0) {
            this.method17(false);
        }
        this.method15(4096);
        ++field35;
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(BI)Lsg;")
    public static final class169 method18(byte arg0, int arg1) {
        ++field36;
        return arg0 != -62 ? null : class112.method692(true, false, arg1, 10);
    }
}
