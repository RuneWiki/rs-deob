import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class41 extends class51 {

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "I")
    private int field788 = 5;

    @OriginalMember(owner = "client!eb", name = "pb", descriptor = "I")
    private int field801 = 1;

    @OriginalMember(owner = "client!eb", name = "vb", descriptor = "I")
    private int field807 = 5;

    @OriginalMember(owner = "client!eb", name = "qb", descriptor = "I")
    private int field802 = 2048;

    @OriginalMember(owner = "client!eb", name = "ob", descriptor = "I")
    private int field800 = 25;

    @OriginalMember(owner = "client!eb", name = "wb", descriptor = "I")
    private int field808 = 0;

    @OriginalMember(owner = "client!eb", name = "sb", descriptor = "I")
    private int field804 = 2;

    @OriginalMember(owner = "client!eb", name = "ib", descriptor = "Led;")
    public static class43 field794 = class191.method1219("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", false);

    @OriginalMember(owner = "client!eb", name = "nb", descriptor = "I")
    public static int field799 = 0;

    @OriginalMember(owner = "client!eb", name = "mb", descriptor = "Led;")
    public static class43 field798 = class191.method1219(" zuerst von Ihrer Ignorieren)2Liste(Q", false);

    @OriginalMember(owner = "client!eb", name = "hb", descriptor = "Led;")
    private static class43 field793 = class191.method1219("scroll:", false);

    @OriginalMember(owner = "client!eb", name = "lb", descriptor = "I")
    public static int field797 = -1;

    @OriginalMember(owner = "client!eb", name = "kb", descriptor = "I")
    public static int field796 = 255;

    @OriginalMember(owner = "client!eb", name = "yb", descriptor = "Led;")
    private static class43 field810 = class191.method1219("Loaded update list", false);

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "Led;")
    public static class43 field789 = field810;

    @OriginalMember(owner = "client!eb", name = "Ab", descriptor = "Led;")
    public static class43 field812 = field793;

    @OriginalMember(owner = "client!eb", name = "ub", descriptor = "Led;")
    public static class43 field806 = field793;

    @OriginalMember(owner = "client!eb", name = "Cb", descriptor = "I")
    public static int field814 = 0;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    private int field785;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    private int field786;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
    public static int field787;

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
    public static int field791;

    @OriginalMember(owner = "client!eb", name = "gb", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!eb", name = "rb", descriptor = "I")
    public static int field803;

    @OriginalMember(owner = "client!eb", name = "tb", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!eb", name = "xb", descriptor = "I")
    private int field809;

    @OriginalMember(owner = "client!eb", name = "zb", descriptor = "I")
    public static int field811;

    @OriginalMember(owner = "client!eb", name = "Bb", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!eb", name = "jb", descriptor = "[[I")
    private int[][] field795;

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class41() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)Led;")
    public static final class43 method227(byte arg0, int arg1) {
        ++field811;
        class43 var2 = new class43();
        var2.field818 = 0;
        if (arg0 <= 52) {
            return null;
        } else {
            var2.field844 = new byte[arg1];
            return var2;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(B)V")
    public static final void method228(byte arg0) {
        if (arg0 > -81) {
            field814 = -68;
        }
        if (class167.field3295 != null) {
            class167.field3295.method449(2000);
        }
        ++field803;
        if (class82.field1621 != null) {
            class82.field1621.method449(2000);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljg;II)V")
    public final void method24(class89 arg0, int arg1, int arg2) {
        ++field787;
        if (arg1 == 0) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (~arg2 != -4) {
                            if (arg2 != 4) {
                                if (~arg2 != -6) {
                                    if (~arg2 == -7) {
                                        this.field788 = arg0.method538((byte) 106);
                                    }
                                } else {
                                    this.field807 = arg0.method538((byte) -81);
                                }
                            } else {
                                this.field801 = arg0.method538((byte) 83);
                            }
                        } else {
                            this.field804 = arg0.method538((byte) 109);
                        }
                    } else {
                        this.field802 = arg0.method555(-1113627096);
                    }
                } else {
                    this.field808 = arg0.method538((byte) 120);
                }
            } else {
                this.field807 = this.field788 = arg0.method538((byte) 114);
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        ++field791;
        if (arg0 != 16) {
            this.field800 = 18;
        }
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (super.field1025.field154) {
            int var4 = class40.field771[arg1];
            int var5 = this.field804;
            if (var5 != 2) {
                if (var5 == 1) {
                    for (int var6 = 0; class122.field2442 > var6; ++var6) {
                        int var7 = class95.field1855[var6];
                        var3[var6] = this.method231(false, 2, var7, var4)[1];
                    }
                } else {
                    for (int var8 = 0; var8 < class122.field2442; ++var8) {
                        int var9 = class95.field1855[var8];
                        var3[var8] = this.method231(false, 1, var9, var4)[0];
                    }
                }
            } else {
                for (int var10 = 0; class122.field2442 > var10; ++var10) {
                    int var11 = class95.field1855[var10];
                    int[] var12 = this.method231(false, 2, var11, var4);
                    var3[var10] = var12[1] + -var12[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)V")
    public final void method64(int arg0) {
        this.method230(8192);
        ++field790;
        if (arg0 > -83) {
            method227((byte) -10, 111);
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public static void method229(int arg0) {
        field789 = null;
        field798 = null;
        if (arg0 != -12754) {
            field812 = null;
        }
        field794 = null;
        field806 = null;
        field810 = null;
        field812 = null;
        field793 = null;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    private final void method230(int arg0) {
        Random var2 = new Random((long) this.field808);
        ++field813;
        int var3 = 4096 / this.field807;
        this.field785 = var3 >> 1;
        int var4 = 4096 / this.field788;
        this.field800 = this.field807 * this.field788;
        this.field795 = new int[this.field800][2];
        this.field786 = var4 >> 1;
        int var5 = this.field802 * this.field786 >> 12;
        int var6 = this.field802 * this.field785 >> 12;
        for (int var7 = 0; var7 < this.field788; ++var7) {
            int var8 = var4 * var7;
            for (int var9 = 0; ~var9 > ~this.field807; ++var9) {
                int var10 = this.field807 * var7 + var9;
                int var11 = var6 * (class153.method970((byte) 107, var2, 8192) + -4096) >> 12;
                int var12 = var5 * (-4096 + class153.method970((byte) 73, var2, 8192)) >> 12;
                this.field795[var10][0] = var11 - -(var3 * var9);
                this.field795[var10][1] = var8 + var12;
            }
        }
        if (arg0 != 8192) {
            method227((byte) -112, -66);
        }
        this.field809 = ~this.field788 <= ~this.field807 ? this.field788 : this.field807;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ZIII)[I")
    private final int[] method231(boolean arg0, int arg1, int arg2, int arg3) {
        ++field792;
        int[] var5 = new int[arg1];
        for (int var6 = 0; arg1 > var6; ++var6) {
            var5[var6] = Integer.MAX_VALUE;
        }
        int var7 = this.field786 + arg3;
        int var8 = this.field785 + arg2;
        int var9 = -1;
        int var10 = -1;
        int var11 = Integer.MAX_VALUE;
        if (~var7 < -4097) {
            var7 -= 4096;
        }
        if (var8 > 4096) {
            var8 -= 4096;
        }
        int var12 = this.field788 * var7 >> 12;
        int var13 = this.field807 * var8 >> 12;
        int var14 = Integer.MAX_VALUE;
        int var15 = this.field807 <= 2 ? this.field807 - 1 : 2;
        int var16 = ~this.field788 >= -3 ? this.field788 + -1 : 2;
        for (int var17 = -var15; var15 >= var17; ++var17) {
            for (int var25 = -var16; ~var16 <= ~var25; ++var25) {
                int var26 = var12 - -var25;
                if (~var26 > -1) {
                    var26 += this.field788;
                }
                if (~this.field788 >= ~var26) {
                    var26 -= this.field788;
                }
                int var27 = var13 + var17;
                if (var27 < 0) {
                    var27 += this.field807;
                }
                if (this.field807 <= var27) {
                    var27 -= this.field807;
                }
                int var28 = this.field807 * var26 + var27;
                int var29 = this.field795[var28][0];
                int var30 = this.field795[var28][1];
                int var31 = -var29 + var8;
                if (~var31 > -1) {
                    var31 = -var31;
                }
                int var32 = -var30 + var7;
                if (~var32 > -1) {
                    var32 = -var32;
                }
                if (var32 > 2048) {
                    var32 = -var32 + 4096;
                }
                if (var31 > 2048) {
                    var31 = -var31 + 4096;
                }
                int var33 = var31 * var31 + var32 * var32 >> 12;
                if (~var33 > ~var11) {
                    if (~var9 == 0) {
                        var14 = var33;
                        var9 = var28;
                    } else {
                        var14 = var11;
                        var9 = var10;
                    }
                    var10 = var28;
                    var11 = var33;
                } else if (~var9 == ~var10 && var9 != var28 || var14 > var33 && var10 != var28) {
                    var9 = var28;
                    var14 = var33;
                }
            }
        }
        if (arg0) {
            return null;
        } else {
            int var18 = -this.field795[var10][0] + var8;
            int var19 = var8 - this.field795[var9][0];
            if (var18 < 0) {
                var18 = -var18;
            }
            int var20 = -this.field795[var10][1] + var7;
            if (var19 < 0) {
                var19 = -var19;
            }
            int var21 = -this.field795[var9][1] + var7;
            if (var21 < 0) {
                var21 = -var21;
            }
            if (~var20 > -1) {
                var20 = -var20;
            }
            if (var21 > 2048) {
                var21 = -var21 + 4096;
            }
            if (~var18 < -2049) {
                var18 = -var18 + 4096;
            }
            if (~var19 < -2049) {
                var19 = -var19 + 4096;
            }
            if (~var20 < -2049) {
                var20 = -var20 + 4096;
            }
            int var22 = this.field801;
            int var23;
            int var24;
            if (~var22 != -2) {
                if (var22 == 2) {
                    var23 = Math.max(var18, var20);
                    var24 = Math.max(var19, var21);
                } else {
                    var24 = var19 * var19 + var21 * var21;
                    var23 = var18 * var18 + var20 * var20;
                }
            } else {
                var23 = (int) Math.sqrt((double) (var18 * var18 + var20 * var20));
                var24 = (int) Math.sqrt((double) (var19 * var19 + var21 * var21));
            }
            if (arg1 > 1) {
                var5[1] = this.field809 * var24;
            }
            var5[0] = this.field809 * var23;
            return var5;
        }
    }
}
