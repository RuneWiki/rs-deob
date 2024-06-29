import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class40 extends class27 {

    @OriginalMember(owner = "client!ea", name = "cb", descriptor = "I")
    private int field672 = 0;

    @OriginalMember(owner = "client!ea", name = "ab", descriptor = "Lkb;")
    private static class93 field670 = class76.method390("button near the top of that page)3", 0);

    @OriginalMember(owner = "client!ea", name = "Z", descriptor = "Lkb;")
    public static class93 field669 = class76.method390("Spieler)3 Bitte w-=hlen Sie eine andere Welt)3", 0);

    @OriginalMember(owner = "client!ea", name = "bb", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!ea", name = "Y", descriptor = "Lkb;")
    public static class93 field668 = field670;

    @OriginalMember(owner = "client!ea", name = "db", descriptor = "[I")
    public static int[] field673 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ea", name = "fb", descriptor = "Lkb;")
    public static class93 field675 = class76.method390("Hidden)2use", 0);

    @OriginalMember(owner = "client!ea", name = "hb", descriptor = "Lkb;")
    private static class93 field677 = class76.method390("Click to switch", 0);

    @OriginalMember(owner = "client!ea", name = "O", descriptor = "Lkb;")
    public static class93 field660 = field677;

    @OriginalMember(owner = "client!ea", name = "M", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ea", name = "N", descriptor = "I")
    public static int field659;

    @OriginalMember(owner = "client!ea", name = "P", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!ea", name = "S", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!ea", name = "W", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!ea", name = "X", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!ea", name = "eb", descriptor = "I")
    public static int field674;

    @OriginalMember(owner = "client!ea", name = "gb", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!ea", name = "ib", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!ea", name = "Q", descriptor = "[I")
    private int[] field662;

    @OriginalMember(owner = "client!ea", name = "V", descriptor = "[I")
    private int[] field665;

    @OriginalMember(owner = "client!ea", name = "T", descriptor = "[[I")
    private int[][] field664;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILh;)Z")
    public static final boolean method215(int arg0, class65 arg1) {
        int var2 = arg1.field1056;
        ++field663;
        if (var2 == 205) {
            class153.field2971 = 250;
            return true;
        } else {
            if (var2 >= 300 && var2 <= 313) {
                int var3 = 1 & var2;
                int var4 = (var2 - 300) / 2;
                class81.field1471.method885(-1, var4, var3 == 1);
            }
            if (var2 >= 314 && ~var2 >= -324) {
                int var5 = (var2 + -314) / 2;
                int var6 = 1 & var2;
                class81.field1471.method880(~var6 == -2, var5, 0);
            }
            if (var2 == 324) {
                class81.field1471.method879(-1, false);
            }
            if (~var2 == -326) {
                class81.field1471.method879(-1, true);
            }
            if (arg0 != 1) {
                return false;
            } else if (~var2 == -327) {
                ++class131.field2479;
                class151.field2908.method47(68, 8);
                class81.field1471.method887(true, class151.field2908);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "(B)V")
    public final void method154(byte arg0) {
        if (this.field664 == null) {
            this.field664 = new int[][] { new int[2], { 4096, 4096 } };
        }
        ++field666;
        if (arg0 <= 77) {
            method220((byte) -41, (class65[]) null, 31);
        }
        if (this.field664.length < 2) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field672 == 2) {
                this.method221(1);
            }
            class6.method35(true);
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BI)Z")
    public static final boolean method216(byte arg0, int arg1) {
        if (arg0 != 115) {
            return true;
        } else {
            ++field659;
            return arg1 >= 48 && arg1 <= 57;
        }
    }

    @OriginalMember(owner = "client!ea", name = "<init>", descriptor = "()V")
    public class40() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(B)V")
    public static final void method217(byte arg0) {
        ++field678;
        for (class179 var1 = (class179) class1.field3.method692(false); var1 != null; var1 = (class179) class1.field3.method695(512)) {
            if (~var1.field3567 < -1) {
                --var1.field3567;
            }
            if (~var1.field3567 == -1) {
                if (var1.field3561 < 0 || class61.method316(var1.field3561, (byte) -110, var1.field3560)) {
                    class16.method91(var1.field3556, (byte) -55, var1.field3559, var1.field3551, var1.field3554, var1.field3560, var1.field3566, var1.field3561);
                    var1.method235(false);
                }
            } else {
                if (var1.field3564 > 0) {
                    --var1.field3564;
                }
                if (~var1.field3564 == -1 && var1.field3554 >= 1 && ~var1.field3556 <= -2 && var1.field3554 <= 102 && ~var1.field3556 >= -103 && (~var1.field3553 > -1 || class61.method316(var1.field3553, (byte) -58, var1.field3562))) {
                    class16.method91(var1.field3556, (byte) -116, var1.field3559, var1.field3557, var1.field3554, var1.field3562, var1.field3566, var1.field3553);
                    var1.field3564 = -1;
                    if (~var1.field3561 == ~var1.field3553 && ~var1.field3561 == 0) {
                        var1.method235(false);
                    } else if (~var1.field3561 == ~var1.field3553 && ~var1.field3557 == ~var1.field3551 && ~var1.field3562 == ~var1.field3560) {
                        var1.method235(false);
                    }
                }
            }
        }
        if (arg0 >= 0) {
            field677 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IZ)[I")
    public final int[] method55(int arg0, boolean arg1) {
        ++field661;
        int[] var3 = super.field447.method1238(arg1, arg0);
        if (super.field447.field3737) {
            int[] var4 = this.method145(0, (byte) 127, arg0);
            int var5 = this.field672;
            if (~var5 != -3) {
                if (var5 == 1) {
                    for (int var6 = 0; ~class159.field3209 < ~var6; ++var6) {
                        int var7 = var4[var6];
                        int var8;
                        for (var8 = 1; ~var8 > ~(this.field664.length + -1) && this.field664[var8][0] <= var7; ++var8) {
                        }
                        int[] var9 = this.field664[var8];
                        int[] var10 = this.field664[var8 - 1];
                        int var11 = (var7 - var10[0] << 12) / (var9[0] - var10[0]);
                        int var12 = -class27.field440[var11 >> 5 & 255] + 4096 >> 1;
                        int var13 = -var12 + 4096;
                        var3[var6] = var9[1] * var12 + var10[1] * var13 >> 12;
                    }
                } else {
                    for (int var14 = 0; class159.field3209 > var14; ++var14) {
                        int var15 = var4[var14];
                        int var16;
                        for (var16 = 1; ~(this.field664.length - 1) < ~var16 && ~this.field664[var16][0] >= ~var15; ++var16) {
                        }
                        int[] var17 = this.field664[var16 + -1];
                        int[] var18 = this.field664[var16];
                        int var19 = (-var17[0] + var15 << 12) / (var18[0] - var17[0]);
                        int var20 = -var19 + 4096;
                        var3[var14] = var17[1] * var20 + var18[1] * var19 >> 12;
                    }
                }
            } else {
                for (int var21 = 0; class159.field3209 > var21; ++var21) {
                    int var22 = var4[var21];
                    int var23;
                    for (var23 = 1; ~(this.field664.length + -1) < ~var23 && this.field664[var23][0] <= var22; ++var23) {
                    }
                    int[] var24 = this.field664[var23 + -1];
                    int[] var25 = this.field664[var23];
                    int var26 = this.method218(var23 - 2, 1)[1];
                    int var27 = var24[1];
                    int var28 = var25[1];
                    int var29 = this.method218(var23 - -1, 1)[1];
                    int var30 = var29 - -var27 + -var26 + -var28;
                    int var31 = (-var24[0] + var22 << 12) / (var25[0] + -var24[0]);
                    int var32 = var31 * var31 >> 12;
                    int var33 = -var27 + var26 + -var30;
                    int var34 = -var26 + var28;
                    int var36 = (var30 * var31 >> 12) * var32 >> 12;
                    int var37 = var32 * var33 >> 12;
                    int var38 = var31 * var34 >> 12;
                    var3[var21] = var36 + var37 - (-var38 - var27);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(II)[I")
    private final int[] method218(int arg0, int arg1) {
        ++field667;
        if (arg1 != 1) {
            method220((byte) 70, (class65[]) null, -35);
        }
        if (~arg0 > -1) {
            return this.field665;
        } else {
            return ~this.field664.length >= ~arg0 ? this.field662 : this.field664[arg0];
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (arg1 == 0) {
            this.field672 = arg2.method1054(128);
            this.field664 = new int[arg2.method1054(128)][2];
            for (int var4 = 0; var4 < this.field664.length; ++var4) {
                this.field664[var4][0] = arg2.method1071(28101);
                this.field664[var4][1] = arg2.method1071(28101);
            }
        }
        if (arg0 < 106) {
            this.method15((byte) -48, 40, (class158) null);
        }
        ++field674;
    }

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "(B)V")
    public static void method219(byte arg0) {
        field675 = null;
        field660 = null;
        field670 = null;
        field669 = null;
        if (arg0 == -55) {
            field677 = null;
            field668 = null;
            field673 = null;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B[Lh;I)V")
    public static final void method220(byte arg0, class65[] arg1, int arg2) {
        if (arg0 != 81) {
            field673 = null;
        }
        ++field676;
        for (int var3 = 0; ~arg1.length < ~var3; ++var3) {
            class65 var4 = arg1[var3];
            if (var4 != null) {
                if (~var4.field1076 == -1) {
                    if (var4.field1121 != null) {
                        method220((byte) 81, var4.field1121, arg2);
                    }
                    class78 var5 = (class78) class147.field2834.method616((long) var4.field1058, -1);
                    if (var5 != null) {
                        class190.method1229(var5.field1406, arg2, 0);
                    }
                }
                if (~arg2 == -1 && var4.field1123 != null) {
                    class104 var6 = new class104();
                    var6.field1924 = var4.field1123;
                    var6.field1919 = var4;
                    class82.method421(var6, false);
                }
                if (~arg2 == -2 && var4.field1069 != null) {
                    if (~var4.field1127 <= -1) {
                        class65 var7 = class204.method1325(65535, var4.field1058);
                        if (var7 == null || var7.field1121 == null || var4.field1127 >= var7.field1121.length || var7.field1121[var4.field1127] != var4) {
                            continue;
                        }
                    }
                    class104 var8 = new class104();
                    var8.field1919 = var4;
                    var8.field1924 = var4.field1069;
                    class82.method421(var8, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "(I)V")
    private final void method221(int arg0) {
        int[] var2 = this.field664[0];
        ++field658;
        int[] var3 = this.field664[1];
        int[] var4 = this.field664[this.field664.length + -2];
        int[] var5 = this.field664[this.field664.length - 1];
        this.field662 = new int[] { var4[0] - (var5[0] + -var4[0]), var4[1] + var4[1] - var5[1] };
        this.field665 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - (var3[1] + -var2[arg0]) };
    }
}
