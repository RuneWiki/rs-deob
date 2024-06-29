import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class103 extends class23 {

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "I")
    private int field1767 = 1024;

    @OriginalMember(owner = "client!jf", name = "V", descriptor = "I")
    private int field1775 = 409;

    @OriginalMember(owner = "client!jf", name = "T", descriptor = "I")
    private int field1773 = 81;

    @OriginalMember(owner = "client!jf", name = "ib", descriptor = "I")
    private int field1788 = 204;

    @OriginalMember(owner = "client!jf", name = "db", descriptor = "I")
    private int field1783 = 0;

    @OriginalMember(owner = "client!jf", name = "Y", descriptor = "I")
    private int field1778 = 4;

    @OriginalMember(owner = "client!jf", name = "bb", descriptor = "I")
    private int field1781 = 8;

    @OriginalMember(owner = "client!jf", name = "lb", descriptor = "I")
    private int field1791 = 1024;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "Ldc;")
    private static class37 field1765 = class185.method1233((byte) 86, "Connection lost)3");

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "Ldc;")
    public static class37 field1766 = field1765;

    @OriginalMember(owner = "client!jf", name = "fb", descriptor = "Ldc;")
    public static class37 field1785 = class185.method1233((byte) 86, "und die Schaltfl-=che (WSpielkonto erstellen(W am");

    @OriginalMember(owner = "client!jf", name = "eb", descriptor = "Ldc;")
    public static class37 field1784 = class185.method1233((byte) 86, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!jf", name = "P", descriptor = "I")
    public static int field1769;

    @OriginalMember(owner = "client!jf", name = "Q", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!jf", name = "R", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!jf", name = "U", descriptor = "I")
    private int field1774;

    @OriginalMember(owner = "client!jf", name = "W", descriptor = "I")
    public static int field1776;

    @OriginalMember(owner = "client!jf", name = "X", descriptor = "I")
    public static int field1777;

    @OriginalMember(owner = "client!jf", name = "Z", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!jf", name = "ab", descriptor = "I")
    private int field1780;

    @OriginalMember(owner = "client!jf", name = "gb", descriptor = "I")
    private int field1786;

    @OriginalMember(owner = "client!jf", name = "kb", descriptor = "I")
    public static int field1790;

    @OriginalMember(owner = "client!jf", name = "mb", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!jf", name = "S", descriptor = "[I")
    private int[] field1772;

    @OriginalMember(owner = "client!jf", name = "jb", descriptor = "[I")
    public static int[] field1789;

    @OriginalMember(owner = "client!jf", name = "cb", descriptor = "[[I")
    private int[][] field1782;

    @OriginalMember(owner = "client!jf", name = "hb", descriptor = "[[I")
    private int[][] field1787;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field1767 = -28;
        }
        int[] var3 = super.field405.method1461(arg1, (byte) -114);
        ++field1792;
        if (super.field405.field4114) {
            int var4 = 0;
            int var5;
            for (var5 = class167.field3196[arg1] + this.field1783; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~this.field1781 < ~var4 && this.field1772[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            int var7 = this.field1772[var4];
            boolean var8 = (var4 & 1) == 0;
            int var9 = this.field1772[var4 + -1];
            if (~var5 < ~(this.field1786 + var9) && var5 < -this.field1786 + var7) {
                for (int var10 = 0; ~var10 > ~class199.field3705; ++var10) {
                    int var11 = 0;
                    int var12 = var8 ? this.field1791 : -this.field1791;
                    int var13;
                    for (var13 = class133.field2477[var10] - -(this.field1780 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field1778 && ~var13 <= ~this.field1787[var6][var11]) {
                        ++var11;
                    }
                    int var14 = this.field1787[var6][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field1787[var6][var15];
                    if (~var13 < ~(this.field1786 + var16) && ~(-this.field1786 + var14) < ~var13) {
                        var3[var10] = this.field1782[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class4.method32(var3, 0, class199.field3705, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIZILwa;I)V")
    public static final void method668(int arg0, int arg1, int arg2, boolean arg3, int arg4, class238 arg5, int arg6) {
        class127.field2360 = arg2;
        if (arg1 == 13910) {
            class51.field1025 = arg6;
            class17.field261 = arg4;
            class209.field3919 = arg0;
            class105.field1820 = 1;
            class197.field3690 = arg5;
            class41.field852 = arg3;
            ++field1777;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIIII)V")
    public static final void method669(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field1768;
        if (~class151.field2859 != ~arg5 || class136.field2648 != arg4 || class41.field859 != arg0 && class16.field259) {
            class136.field2648 = arg4;
            class151.field2859 = arg5;
            class41.field859 = arg0;
            if (arg2 != 31362) {
                field1784 = null;
            }
            if (!class16.field259) {
                class41.field859 = 0;
            }
            class236.method1525(25, 27172);
            class192.method1279(class136.field2649, true, false);
            int var6 = class99.field1735;
            int var7 = class124.field2212;
            class124.field2212 = arg4 * 8 - 48;
            int var8 = -var7 + class124.field2212;
            int var9 = class124.field2212;
            class99.field1735 = arg5 * 8 + -48;
            int var10 = -var6 + class99.field1735;
            int var11 = class99.field1735;
            for (int var12 = 0; ~var12 > -32769; ++var12) {
                class66 var28 = class70.field1262[var12];
                if (var28 != null) {
                    for (int var29 = 0; var29 < 10; ++var29) {
                        var28.field3494[var29] -= var10;
                        var28.field3525[var29] -= var8;
                    }
                    var28.field3490 -= var8 * 128;
                    var28.field3505 -= var10 * 128;
                }
            }
            for (int var13 = 0; ~var13 > -2049; ++var13) {
                class123 var26 = class8.field107[var13];
                if (var26 != null) {
                    for (int var27 = 0; ~var27 > -11; ++var27) {
                        var26.field3494[var27] -= var10;
                        var26.field3525[var27] -= var8;
                    }
                    var26.field3505 -= var10 * 128;
                    var26.field3490 -= var8 * 128;
                }
            }
            class125.field2246 = arg0;
            byte var14 = 0;
            byte var15 = 104;
            class238.field4382.method1264(arg1, (byte) -122, false, arg3);
            byte var16 = 1;
            if (var10 < 0) {
                var15 = -1;
                var14 = 103;
                var16 = -1;
            }
            byte var17 = 104;
            byte var18 = 1;
            byte var19 = 0;
            if (~var8 > -1) {
                var18 = -1;
                var19 = 103;
                var17 = -1;
            }
            for (int var20 = var14; var15 != var20; var20 += var16) {
                for (int var22 = var19; var17 != var22; var22 += var18) {
                    int var23 = var10 + var20;
                    int var24 = var8 + var22;
                    for (int var25 = 0; ~var25 > -5; ++var25) {
                        if (var23 >= 0 && var24 >= 0 && ~var23 > -105 && var24 < 104) {
                            class183.field3389[var25][var20][var22] = class183.field3389[var25][var23][var24];
                        } else {
                            class183.field3389[var25][var20][var22] = null;
                        }
                    }
                }
            }
            for (class166 var21 = (class166) class20.field337.method1338(36); var21 != null; var21 = (class166) class20.field337.method1332((byte) -89)) {
                var21.field3178 -= var8;
                var21.field3175 -= var10;
                if (~var21.field3175 > -1 || var21.field3178 < 0 || var21.field3175 >= 104 || ~var21.field3178 <= -105) {
                    var21.method433(0);
                }
            }
            class28.field499 = false;
            class225.field4159 = 0;
            if (class191.field3577 != 0) {
                class194.field3610 -= var8;
                class191.field3577 -= var10;
            }
            class135.field2504 = -1;
            class191.field3566.method1336(arg2 ^ 31436);
            class85.field1496.method1336(36);
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (arg0 != -21746) {
            this.method57(40, 69);
        }
        this.method671((byte) -102);
        ++field1790;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        ++field1776;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (~arg1 == -8) {
                                        this.field1767 = arg0.method230((byte) -113);
                                    }
                                } else {
                                    this.field1773 = arg0.method230((byte) -104);
                                }
                            } else {
                                this.field1783 = arg0.method230((byte) -106);
                            }
                        } else {
                            this.field1791 = arg0.method230((byte) -115);
                        }
                    } else {
                        this.field1788 = arg0.method230((byte) -123);
                    }
                } else {
                    this.field1775 = arg0.method230((byte) -100);
                }
            } else {
                this.field1781 = arg0.method215(arg2 ^ -1797813792);
            }
        } else {
            this.field1778 = arg0.method215(-1797813752);
        }
        if (arg2 != 1000) {
            this.method671((byte) -42);
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(B)Z")
    public static final boolean method670(byte arg0) {
        if (arg0 != -37) {
            return true;
        } else {
            ++field1771;
            return class105.field1820 != 0 ? true : class176.field3337.method779(-119);
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "()V")
    public class103() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(B)V")
    private final void method671(byte arg0) {
        Random var2 = new Random((long) this.field1781);
        this.field1786 = this.field1773 / 2;
        this.field1780 = 4096 / this.field1778;
        this.field1772 = new int[this.field1781 - -1];
        this.field1772[0] = 0;
        ++field1769;
        this.field1787 = new int[this.field1781][this.field1778 + 1];
        this.field1774 = 4096 / this.field1781;
        int var3 = this.field1774 / 2;
        int var4 = this.field1780 / 2;
        if (arg0 == -102) {
            this.field1782 = new int[this.field1781][this.field1778];
            for (int var5 = 0; ~this.field1781 < ~var5; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field1774;
                    int var7 = (class97.method646(12402, var2, 4096) - 2048) * this.field1788 >> 12;
                    int var8 = (var3 * var7 >> 12) + var6;
                    this.field1772[var5] = this.field1772[var5 - 1] + var8;
                }
                this.field1787[var5][0] = 0;
                for (int var9 = 0; this.field1778 > var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field1780;
                        int var11 = (class97.method646(arg0 + 12504, var2, 4096) - 2048) * this.field1775 >> 12;
                        int var12 = (var4 * var11 >> 12) + var10;
                        this.field1787[var5][var9] = this.field1787[var5][var9 + -1] + var12;
                    }
                    this.field1782[var5][var9] = this.field1767 <= 0 ? 4096 : -class97.method646(12402, var2, this.field1767) + 4096;
                }
                this.field1787[var5][this.field1778] = 4096;
            }
            this.field1772[this.field1781] = 4096;
        }
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)V")
    public static void method672(int arg0) {
        field1765 = null;
        field1789 = null;
        if (arg0 >= -73) {
            method668(-20, -85, -61, true, -92, (class238) null, -92);
        }
        field1784 = null;
        field1785 = null;
        field1766 = null;
    }
}
