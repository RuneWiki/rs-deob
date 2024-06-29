import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class218 extends class243 {

    @OriginalMember(owner = "client!hh", name = "qb", descriptor = "I")
    private int field3669 = 2048;

    @OriginalMember(owner = "client!hh", name = "eb", descriptor = "I")
    private int field3657 = 0;

    @OriginalMember(owner = "client!hh", name = "fb", descriptor = "I")
    private int field3658 = 10;

    @OriginalMember(owner = "client!hh", name = "cb", descriptor = "Lub;")
    public static class227 field3655 = class257.method1749("Hierhin gehen", 17263);

    @OriginalMember(owner = "client!hh", name = "rb", descriptor = "Lub;")
    public static class227 field3670 = class257.method1749("(Y<)4col>", 17263);

    @OriginalMember(owner = "client!hh", name = "sb", descriptor = "I")
    public static int field3671 = -1;

    @OriginalMember(owner = "client!hh", name = "hb", descriptor = "Lub;")
    public static class227 field3660 = class257.method1749(")1j", 17263);

    @OriginalMember(owner = "client!hh", name = "pb", descriptor = "I")
    public static int field3668 = -1;

    @OriginalMember(owner = "client!hh", name = "ub", descriptor = "Luh;")
    public static class198 field3673 = new class198();

    @OriginalMember(owner = "client!hh", name = "yb", descriptor = "Lub;")
    public static class227 field3677 = class257.method1749("sl_back", 17263);

    @OriginalMember(owner = "client!hh", name = "Ab", descriptor = "S")
    public static short field3679 = 320;

    @OriginalMember(owner = "client!hh", name = "zb", descriptor = "Lub;")
    public static class227 field3678 = class257.method1749(")4", 17263);

    @OriginalMember(owner = "client!hh", name = "xb", descriptor = "Lub;")
    public static class227 field3676 = class257.method1749("event_opbase", 17263);

    @OriginalMember(owner = "client!hh", name = "Y", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!hh", name = "Z", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!hh", name = "bb", descriptor = "I")
    public static int field3654;

    @OriginalMember(owner = "client!hh", name = "db", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!hh", name = "gb", descriptor = "I")
    public static int field3659;

    @OriginalMember(owner = "client!hh", name = "ib", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!hh", name = "jb", descriptor = "I")
    public static int field3662;

    @OriginalMember(owner = "client!hh", name = "kb", descriptor = "I")
    public static int field3663;

    @OriginalMember(owner = "client!hh", name = "lb", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!hh", name = "mb", descriptor = "I")
    public static int field3665;

    @OriginalMember(owner = "client!hh", name = "nb", descriptor = "I")
    public static int field3666;

    @OriginalMember(owner = "client!hh", name = "ob", descriptor = "I")
    public static int field3667;

    @OriginalMember(owner = "client!hh", name = "vb", descriptor = "I")
    public static int field3674;

    @OriginalMember(owner = "client!hh", name = "wb", descriptor = "Lub;")
    public static class227 field3675;

    @OriginalMember(owner = "client!hh", name = "ab", descriptor = "[I")
    private int[] field3653;

    @OriginalMember(owner = "client!hh", name = "tb", descriptor = "[I")
    private int[] field3672;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)I")
    public static final int method1373(int arg0) {
        if (arg0 != 0) {
            return -84;
        } else {
            ++field3654;
            return class12.field230;
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "()V")
    public class218() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        if (arg0) {
            field3668 = 15;
        }
        ++field3667;
        this.method1379((byte) 94);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Ln;BLn;)V")
    public static final void method1374(class138 arg0, byte arg1, class138 arg2) {
        ++field3656;
        client.field1449 = arg0;
        if (arg1 <= 8) {
            field3676 = null;
        }
        class178.field3021 = arg2;
    }

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "(I)V")
    public static final void method1375(int arg0) {
        if (arg0 == -3) {
            if (class4.field58 < class51.field904) {
                class4.field58 += class4.field58 / 30.0D;
                if (class51.field904 < class4.field58) {
                    class4.field58 = class51.field904;
                }
                class103.method629((byte) -72);
            } else if (class51.field904 < class4.field58) {
                class4.field58 -= class4.field58 / 30.0D;
                if (class51.field904 > class4.field58) {
                    class4.field58 = class51.field904;
                }
                class103.method629((byte) -72);
            }
            ++field3662;
            if (class174.field2910 != -1 && ~class109.field2045 != 0) {
                int var1 = class174.field2910 - class242.field4205;
                int var2 = -class184.field3136 + class109.field2045;
                if (~var1 > -3 || ~var1 < -3) {
                    var1 >>= 4;
                }
                class242.field4205 += var1;
                if (var2 < 2 || ~var2 < -3) {
                    var2 >>= 4;
                }
                if (~var1 == -1 && var2 == 0) {
                    class174.field2910 = -1;
                    class109.field2045 = -1;
                }
                class184.field3136 -= -var2;
                class103.method629((byte) -72);
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "(I)V")
    public static void method1376(int arg0) {
        field3660 = null;
        field3675 = null;
        field3673 = null;
        field3670 = null;
        field3677 = null;
        field3655 = null;
        field3678 = null;
        field3676 = null;
        if (arg0 >= -116) {
            field3651 = -105;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        ++field3652;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field3657 = arg0.method1471(255);
                }
            } else {
                this.field3669 = arg0.method1447(0);
            }
        } else {
            this.field3658 = arg0.method1471(255);
        }
        if (arg1) {
            field3675 = null;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        ++field3661;
        int[] var3 = super.field4215.method984(arg1, 0);
        int var4 = -67 / ((-15 - arg0) / 51);
        if (super.field4215.field2707) {
            int var5 = class148.field2582[arg1];
            if (~this.field3657 != -1) {
                for (int var6 = 0; class212.field3586 > var6; ++var6) {
                    int var7 = 0;
                    short var8 = 0;
                    int var9 = class212.field3585[var6];
                    int var10 = this.field3657;
                    if (~var10 != -2) {
                        if (var10 != 2) {
                            if (~var10 == -4) {
                                var7 = (var9 - var5 >> 1) + 2048;
                            }
                        } else {
                            var7 = 2048 - -(var9 + -4096 + var5 >> 1);
                        }
                    } else {
                        var7 = var9;
                    }
                    for (int var11 = 0; this.field3658 > var11; ++var11) {
                        if (~this.field3653[var11] >= ~var7 && ~var7 > ~this.field3653[var11 - -1]) {
                            if (var7 < this.field3672[var11]) {
                                var8 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var6] = var8;
                }
            } else {
                short var12 = 0;
                for (int var13 = 0; ~var13 > ~this.field3658; ++var13) {
                    if (var5 >= this.field3653[var13] && ~this.field3653[var13 - -1] < ~var5) {
                        if (~this.field3672[var13] < ~var5) {
                            var12 = 4096;
                        }
                        break;
                    }
                }
                class68.method425(var3, 0, class212.field3586, var12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lva;Z)V")
    public static final void method1377(class34 arg0, boolean arg1) {
        ++field3664;
        if (arg1) {
            method1377((class34) null, false);
        }
        class166.method1024(arg0, 200000, 2147483642);
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(II)I")
    public static final int method1378(int arg0, int arg1) {
        ++field3666;
        double var2 = (double) (arg0 >> 16 & 255) / 256.0D;
        double var4 = (double) (arg0 >> 8 & 255) / 256.0D;
        double var6 = (double) (255 & arg0) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = 0.0D;
        double var12 = 0.0D;
        double var14 = var2;
        if (var4 > var2) {
            var14 = var4;
        }
        if (var6 > var14) {
            var14 = var6;
        }
        double var16 = (var8 + var14) / 2.0D;
        if (arg1 <= 110) {
            method1376(-67);
        }
        int var18 = (int) (var16 * 256.0D);
        if (var8 != var14) {
            if (var16 < 0.5D) {
                var12 = (-var8 + var14) / (var8 + var14);
            }
            if (var16 >= 0.5D) {
                var12 = (-var8 + var14) / (-var14 + 2.0D - var8);
            }
            if (var2 != var14) {
                if (var4 == var14) {
                    var10 = (var6 - var2) / (var14 - var8) + 2.0D;
                } else if (var6 == var14) {
                    var10 = (-var4 + var2) / (var14 - var8) + 4.0D;
                }
            } else {
                var10 = (-var6 + var4) / (var14 - var8);
            }
        }
        if (var18 >= 0) {
            if (~var18 < -256) {
                var18 = 255;
            }
        } else {
            var18 = 0;
        }
        double var19 = var10 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var12 * 256.0D);
        if (var22 >= 0) {
            if (~var22 < -256) {
                var22 = 255;
            }
        } else {
            var22 = 0;
        }
        if (~var18 < -244) {
            var22 >>= 4;
        } else if (~var18 >= -218) {
            if (var18 <= 192) {
                if (~var18 < -180) {
                    var22 >>= 1;
                }
            } else {
                var22 >>= 2;
            }
        } else {
            var22 >>= 3;
        }
        return (var21 >> 2 << 10) + (var22 >> 5 << 7) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(B)V")
    private final void method1379(byte arg0) {
        this.field3653 = new int[this.field3658 + 1];
        this.field3672 = new int[this.field3658 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field3658;
        int var4 = -65 % ((arg0 - -39) / 58);
        ++field3659;
        int var5 = this.field3669 * var3 >> 12;
        for (int var6 = 0; ~var6 > ~this.field3658; ++var6) {
            this.field3653[var6] = var2;
            this.field3672[var6] = var2 + var5;
            var2 += var3;
        }
        this.field3653[this.field3658] = 4096;
        this.field3672[this.field3658] = this.field3672[0] + 4096;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lch;B)V")
    public static final void method1380(class199 arg0, byte arg1) {
        int var2 = -69 / ((-64 - arg1) / 56);
        ++field3665;
        class173.field2889 = arg0;
    }

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "(I)[Lnf;")
    public static final class213[] method1381(int arg0) {
        ++field3674;
        class213[] var1 = new class213[class168.field2810];
        for (int var2 = arg0; ~var2 > ~class168.field2810; ++var2) {
            int var3 = class214.field3613[var2] * class177.field2982[var2];
            byte[] var4 = class26.field427[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; ~var3 < ~var6; ++var6) {
                var5[var6] = class63.field1153[class76.method446(255, var4[var6])];
            }
            var1[var2] = new class163(class161.field2727, class241.field4197, class58.field1068[var2], class176.field2934[var2], class177.field2982[var2], class214.field3613[var2], var5);
        }
        class57.method350((byte) -94);
        return var1;
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(II)V")
    public static final void method1382(int arg0, int arg1) {
        int var2 = 30 / ((arg0 - -72) / 51);
        ++field3663;
        if (class106.field1990 == null || ~class106.field1990.length > ~arg1) {
            class106.field1990 = new int[arg1];
        }
    }
}
