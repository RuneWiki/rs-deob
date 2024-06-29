import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class465 extends class33 {

    @OriginalMember(owner = "client!pb", name = "R", descriptor = "I")
    private int field6771 = 0;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "I")
    private int field6766 = -32768;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    private int field6780 = -1;

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "Z")
    private boolean field6787 = false;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "I")
    private int field6793 = 0;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "I")
    public int field6763;

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    private int field6761;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "I")
    public int field6773;

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "I")
    private int field6778;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    private int field6779;

    @OriginalMember(owner = "client!pb", name = "y", descriptor = "I")
    public int field6752;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "I")
    public int field6781;

    @OriginalMember(owner = "client!pb", name = "P", descriptor = "Z")
    private boolean field6769;

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
    private int field6782;

    @OriginalMember(owner = "client!pb", name = "G", descriptor = "Lqp;")
    private class467 field6760;

    @OriginalMember(owner = "client!pb", name = "N", descriptor = "I")
    public static int field6767 = 2;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "Luf;")
    public static class310 field6788 = new class310(5, 12);

    @OriginalMember(owner = "client!pb", name = "F", descriptor = "D")
    private double field6759;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "D")
    private double field6765;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "D")
    private double field6784;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "D")
    private double field6785;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "D")
    private double field6789;

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "D")
    private double field6790;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "D")
    private double field6792;

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "D")
    private double field6794;

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!pb", name = "z", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!pb", name = "A", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!pb", name = "B", descriptor = "I")
    private int field6755;

    @OriginalMember(owner = "client!pb", name = "D", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!pb", name = "E", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!pb", name = "O", descriptor = "I")
    public static int field6768;

    @OriginalMember(owner = "client!pb", name = "Q", descriptor = "I")
    private int field6770;

    @OriginalMember(owner = "client!pb", name = "S", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field6774;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    public static int field6775;

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field6776;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "I")
    public static int field6783;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    public static int field6786;

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    public static int field6791;

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "I")
    public static int field6795;

    @OriginalMember(owner = "client!pb", name = "C", descriptor = "Lvc;")
    private class206 field6756;

    // $FF: synthetic field
    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "Ljava/lang/Class;")
    public static Class field6796;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "(I)V")
    public final void method157(int arg0) {
        super.field463 = super.field456 = (short) ((int) (this.field6784 / 128.0D));
        super.field468 = super.field471 = (short) ((int) (this.field6790 / 128.0D));
        if (arg0 < 7) {
            this.field6773 = 76;
        }
        ++field6758;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IZ)Ltg;")
    public static final class153 method2729(int arg0, boolean arg1) {
        ++field6772;
        class153 var2 = (class153) class374.field5239.method56((long) arg0, 74);
        if (var2 != null) {
            return var2;
        } else if (arg1) {
            return null;
        } else {
            byte[] var3 = class289.field3888.method1411(!arg1, arg0, 0);
            class153 var4 = new class153();
            if (var3 != null) {
                var4.method962(new class365(var3), !arg1);
            }
            var4.method963(123);
            class374.field5239.method73((long) arg0, var4, 26425);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIIIIIIZ)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, boolean arg11) {
        super(arg1, arg2, -arg4 + class186.method1118(arg2, arg3, 12840, arg1), arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field6763 = arg9;
        this.field6761 = arg4;
        this.field6773 = arg6;
        this.field6778 = arg8;
        this.field6779 = arg0;
        this.field6752 = arg10;
        this.field6781 = arg5;
        this.field6769 = arg11;
        this.field6787 = false;
        this.field6782 = arg7;
        int var13 = class492.field7279.method2231(this.field6779, 64).field1616;
        if (var13 != -1) {
            this.field6760 = class275.field3740.method1484(0, var13);
        } else {
            this.field6760 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(ILqa;)V")
    public final void method400(int arg0, class162 arg1) {
        ++field6791;
        class121 var3 = this.method2731(0, arg1, (byte) -53);
        if (var3 != null) {
            class415 var4 = arg1.method539();
            var4.method325(this.field6755);
            var4.method336(this.field6770);
            var4.method335((int) this.field6784, (int) this.field6794, (int) this.field6790);
            this.field6766 = var3.method771();
            this.method2734(arg1, var3, 4435);
            int var5 = -16 / ((-29 - arg0) / 33);
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)I")
    public final int method215(int arg0) {
        if (arg0 != 0) {
            this.method400(56, (class162) null);
        }
        ++field6768;
        return this.field6766;
    }

    @OriginalMember(owner = "client!pb", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field6754;
        if (this.field6756 != null) {
            this.field6756.method1248();
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZBI)V")
    public static final void method2730(boolean arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg0) {
                class418.field6109 = class162.method1004(0, class282.field3804, 0, class474.field6924, 0, class456.field6677);
                class418.field6109.method532(0);
                class56 var3 = class456.method2689(0, (byte) -99, class483.field7100, class103.field1412);
                class490 var4 = class418.field6109.method519(var3, class531.method3129(class192.field2735, class483.field7100, 0), true);
                class186.method1119(var4, class272.field3708.method590(class105.field1434, -22602), 0, true);
                class418.field6109.method435();
                class275.method1564(false);
                class418.field6109.method1001((byte) -128);
            }
            try {
                class418.field6109 = class162.method1004(0, class282.field3804, class437.field6374.field4280 * 2, class474.field6924, arg2, class456.field6677);
                if (class418.field6109.method529()) {
                    class16 var5 = class418.field6109.method501(78643200);
                    class418.field6109.method478(var5);
                }
            } catch (Throwable var6) {
                class418.field6109 = class162.method1004(0, class282.field3804, 0, class474.field6924, 0, class456.field6677);
                arg2 = 0;
            }
        } else {
            class418.field6109 = class162.method1004(0, class282.field3804, class437.field6374.field4280 * 2, class474.field6924, arg2, class456.field6677);
        }
        if (arg1 > 5) {
            ++field6775;
            class278.field3761 = arg2;
            class411.method2445(-1);
            if (!class418.field6109.method441()) {
                class196.field2807 = 1;
            }
            class418.field6109.method442(class196.field2807);
            class418.field6109.method534(0);
            class418.field6109.method522(8);
            class500.field7351 = class418.field6109.method491();
            class493.field7284 = class418.field6109.method491();
            class437.method2607(false);
            class418.field6109.method500(!class437.field6374.field4281);
            if (class418.field6109.method471()) {
                class96.method651((byte) 116, class437.field6374.field4278);
            }
            class448.method2644(class418.field6109, class232.field3217 >> 3, true, class442.field6435 >> 3);
            class348.method1929((byte) -14);
            class164.field2341 = false;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ILqa;B)Lc;")
    private final class121 method2731(int arg0, class162 arg1, byte arg2) {
        if (arg2 >= -48) {
            this.method2732(22, -35);
        }
        ++field6786;
        class119 var4 = class492.field7279.method2231(this.field6779, 64);
        return var4.method753(this.field6793, 121, this.field6780, class275.field3740, this.field6771, arg0, arg1);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)Z")
    public final boolean method399(boolean arg0) {
        if (arg0) {
            this.method157(-38);
        }
        ++field6795;
        return false;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)V")
    public final void method2732(int arg0, int arg1) {
        this.field6790 += (double) arg1 * this.field6759;
        ++field6783;
        this.field6784 += (double) arg1 * this.field6792;
        this.field6787 = true;
        if (this.field6769) {
            this.field6794 = (double) (class186.method1118((int) this.field6784, (int) this.field6790, 12840, super.field464) - this.field6761);
        } else if (this.field6782 == -1) {
            this.field6794 += (double) arg1 * this.field6789;
        } else {
            this.field6794 += this.field6785 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field6789;
            this.field6789 += (double) arg1 * this.field6785;
        }
        this.field6770 = (int) (Math.atan2(this.field6792, this.field6759) * 2607.5945876176133D) - -8192 & 16383;
        this.field6755 = (int) (2607.5945876176133D * Math.atan2(this.field6789, this.field6765)) & arg0;
        if (this.field6760 != null) {
            this.field6793 += arg1;
            while (true) {
                do {
                    do {
                        if (this.field6760.field6829[this.field6771] >= this.field6793) {
                            return;
                        }
                        this.field6793 -= this.field6760.field6829[this.field6771];
                        ++this.field6771;
                        if (this.field6760.field6806.length <= this.field6771) {
                            this.field6771 -= this.field6760.field6821;
                            if (~this.field6771 > -1 || this.field6760.field6806.length <= this.field6771) {
                                this.field6771 = 0;
                            }
                        }
                        this.field6780 = this.field6771 + 1;
                    } while (this.field6760.field6806.length > this.field6780);
                    this.field6780 -= this.field6760.field6821;
                } while (~this.field6780 <= -1 && ~this.field6780 > ~this.field6760.field6806.length);
                this.field6780 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(IIBII)V")
    public final void method2733(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (!this.field6787) {
            double var6 = (double) (-super.field466 + arg3);
            double var8 = (double) (-super.field461 + arg0);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field6784 = (double) this.field6778 * var6 / var10 + (double) super.field466;
            this.field6790 = (double) this.field6778 * var8 / var10 + (double) super.field461;
            if (!this.field6769) {
                this.field6794 = (double) super.field457;
            } else {
                this.field6794 = (double) (class186.method1118((int) this.field6784, (int) this.field6790, 12840, super.field464) + -this.field6761);
            }
        }
        if (arg2 < -31) {
            ++field6774;
            double var12 = (double) (-arg4 + this.field6773 + 1);
            this.field6759 = ((double) arg0 + -this.field6790) / var12;
            this.field6792 = ((double) arg3 - this.field6784) / var12;
            this.field6765 = Math.sqrt(this.field6792 * this.field6792 + this.field6759 * this.field6759);
            if (this.field6782 != -1) {
                if (!this.field6787) {
                    this.field6789 = -this.field6765 * Math.tan((double) this.field6782 * 0.02454369D);
                }
                this.field6785 = ((double) arg1 + -this.field6794 + -(this.field6789 * var12)) * 2.0D / (var12 * var12);
            } else {
                this.field6789 = ((double) arg1 - this.field6794) / var12;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
    public final void method398(int arg0) {
        if (arg0 < 74) {
            this.method2736((byte) 82);
        }
        ++field6764;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lqa;Lc;I)V")
    private final void method2734(class162 arg0, class121 arg1, int arg2) {
        ++field6751;
        class304[] var4 = arg1.method770();
        class456[] var5 = arg1.method789();
        if (arg2 != 4435) {
            this.field6794 = 0.024870837583018886D;
        }
        if ((this.field6756 == null || this.field6756.field2913) && (var4 != null || var5 != null)) {
            this.field6756 = new class206(class393.field5484);
        }
        if (this.field6756 != null) {
            this.field6756.method1249(arg0, (long) class393.field5484, var4, var5, false);
            this.field6756.method1255(super.field464, super.field463, super.field456, super.field468, super.field471);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lqa;II)Z")
    public static final boolean method2735(class162 arg0, int arg1, int arg2) {
        ++field6757;
        int var3 = (class442.field6435 + -104) / 2;
        int var4 = (class232.field3217 + -104) / 2;
        boolean var5 = true;
        for (int var6 = var3; ~var6 > ~(var3 + 104); ++var6) {
            for (int var51 = var4; var51 < var4 + 104; ++var51) {
                for (int var52 = arg1; var52 <= 3; ++var52) {
                    if (class361.method2003((byte) -43, var6, var51, arg1, var52)) {
                        int var53 = var52;
                        if (class426.method2553(var51, var6, 1)) {
                            var53 = var52 - 1;
                        }
                        if (var53 >= 0) {
                            var5 &= class347.method1925(var6, true, var51, var53);
                        }
                    }
                }
            }
        }
        if (!var5) {
            return false;
        } else {
            int[] var7 = new int[262144];
            for (int var8 = 0; var8 < var7.length; ++var8) {
                var7[var8] = -16777216;
            }
            class135.field1949 = arg0.method476(var7, 0, 512, 512, 512);
            class6.method34(-60);
            int var9 = -10 - -((int) (20.0D * Math.random())) - (-238 - ((238 + ((int) (20.0D * Math.random()) - 10) << 16) + (-10 + 238 + (int) (20.0D * Math.random()) << 8))) | -16777216;
            if (arg2 < 36) {
                return false;
            } else {
                int var10 = -10 + (int) (Math.random() * 20.0D) + 238 << 16 | -16777216;
                int var11 = (int) (Math.random() * 8.0D) | (int) (Math.random() * 8.0D) << 16 | (int) (Math.random() * 8.0D) << 8;
                boolean[][] var12 = new boolean[class242.field3368][class242.field3368];
                for (int var13 = var3; var3 + 104 > var13; var13 += class242.field3368) {
                    for (int var36 = var4; var36 < var4 + 104; var36 += class242.field3368) {
                        arg0.method462(0, 0, class242.field3368 * 4, class242.field3368 * 4);
                        arg0.method532(-16777216);
                        for (int var37 = arg1; ~var37 >= -4; ++var37) {
                            for (int var44 = 0; class242.field3368 > var44; ++var44) {
                                for (int var50 = 0; ~class242.field3368 < ~var50; ++var50) {
                                    var12[var44][var50] = class361.method2003((byte) -73, var13 + var44, var36 + var50, arg1, var37);
                                }
                            }
                            class19.field195[var37].method228(0, 0, 1024, var13, var36, class242.field3368 + var13, var36 - -class242.field3368, var12);
                            if (!class43.field601) {
                                for (int var45 = -4; ~var45 > ~class242.field3368; ++var45) {
                                    for (int var46 = -4; class242.field3368 > var46; ++var46) {
                                        int var47 = var13 - -var45;
                                        int var48 = var36 + var46;
                                        if (~var3 >= ~var47 && var48 >= var4 && class361.method2003((byte) -53, var47, var48, arg1, var37)) {
                                            int var49 = var37;
                                            if (class426.method2553(var48, var47, 1)) {
                                                var49 = var37 - 1;
                                            }
                                            if (~var49 <= -1) {
                                                class490.method2879(arg0, var9, var47, var49, var10, var45 * 4, var48, (byte) 54, (-var46 + class242.field3368) * 4 - 4);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        if (class43.field601) {
                            class413 var38 = class6.field64[arg1];
                            for (int var39 = 0; ~class242.field3368 < ~var39; ++var39) {
                                for (int var40 = 0; var40 < class242.field3368; ++var40) {
                                    int var41 = var13 + var39;
                                    int var42 = var36 - -var40;
                                    int var43 = var38.field6067[-var38.field6053 + var41][-var38.field6063 + var42];
                                    if (~(1076101120 & var43) == -1) {
                                        if ((var43 & 8388608) == 0) {
                                            if ((var43 & 33554432) == 0) {
                                                if (~(var43 & 134217728) == -1) {
                                                    if ((536870912 & var43) != 0) {
                                                        arg0.method1002((-var40 + class242.field3368) * 4 + -4, 4, -1713569622, var39 * 4, 61);
                                                    }
                                                } else {
                                                    arg0.method999((-var40 + class242.field3368) * 4 + -4 + 3, -1713569622, var39 * 4, 20754, 4);
                                                }
                                            } else {
                                                arg0.method1002((-var40 + class242.field3368) * 4 + -4, 4, -1713569622, var39 * 4 + 3, -122);
                                            }
                                        } else {
                                            arg0.method999((class242.field3368 - var40) * 4 + -4, -1713569622, var39 * 4, 20754, 4);
                                        }
                                    } else {
                                        arg0.method1006(var39 * 4, -1713569622, (class242.field3368 - var40) * 4 + -4, 4, 1, 4);
                                    }
                                }
                            }
                        }
                        arg0.method459(0, 0, class242.field3368 * 4, class242.field3368 * 4, var11, 2);
                        class135.field1949.method116(48 - -((-var3 + var13) * 4), -((-var4 + var36) * 4) + 464 + -(class242.field3368 * 4), class242.field3368 * 4, class242.field3368 * 4, 0, 0);
                    }
                }
                arg0.method526();
                arg0.method532(-16777215);
                class242.method1428((byte) 55);
                class220.field3079 = 0;
                class336.field4578.method3076((byte) -89);
                if (!class43.field601) {
                    for (int var14 = var3; ~var14 > ~(var3 - -104); ++var14) {
                        for (int var20 = var4; ~(var4 + 104) < ~var20; ++var20) {
                            for (int var21 = arg1; ~(arg1 - -1) <= ~var21 && var21 <= 3; ++var21) {
                                if (class361.method2003((byte) -114, var14, var20, arg1, var21)) {
                                    class55 var22 = (class55) class391.method2240(var21, var14, var20);
                                    if (var22 == null) {
                                        var22 = (class55) class490.method2876(var21, var14, var20, field6796 != null ? field6796 : (field6796 = method2738("jv")));
                                    }
                                    if (var22 == null) {
                                        var22 = (class55) class195.method1184(var21, var14, var20);
                                    }
                                    if (var22 == null) {
                                        var22 = (class55) class503.method2956(var21, var14, var20);
                                    }
                                    if (var22 != null) {
                                        class132 var23 = class82.field1154.method2121(var22.method354((byte) -24), true);
                                        if (!var23.field1873 || class123.field1689) {
                                            int var24 = var23.field1829;
                                            if (var23.field1814 != null) {
                                                for (int var25 = 0; var25 < var23.field1814.length; ++var25) {
                                                    if (var23.field1814[var25] != -1) {
                                                        class132 var26 = class82.field1154.method2121(var23.field1814[var25], true);
                                                        if (var26.field1829 >= 0) {
                                                            var24 = var26.field1829;
                                                        }
                                                    }
                                                }
                                            }
                                            if (var24 >= 0) {
                                                boolean var27 = false;
                                                if (var24 >= 0) {
                                                    class191 var28 = class436.field6349.method850((byte) 78, var24);
                                                    if (var28 != null && var28.field2672) {
                                                        var27 = true;
                                                    }
                                                }
                                                int var29 = var14;
                                                int var30 = var20;
                                                if (var27) {
                                                    int[][] var31 = class6.field64[var21].field6067;
                                                    int var32 = class6.field64[var21].field6053;
                                                    int var33 = class6.field64[var21].field6063;
                                                    for (int var34 = 0; ~var34 > -11; ++var34) {
                                                        int var35 = (int) (4.0D * Math.random());
                                                        if (var35 == 0 && var3 < var29 && ~(var14 + -3) > ~var29 && (var31[var29 + -1 + -var32][-var33 + var30] & 2883848) == 0) {
                                                            --var29;
                                                        }
                                                        if (~var35 == -2 && var29 < var3 + 104 + -1 && ~var29 > ~(var14 + 3) && (var31[var29 + 1 - var32][var30 - var33] & 2883968) == 0) {
                                                            ++var29;
                                                        }
                                                        if (~var35 == -3 && ~var30 < ~var4 && var30 > var20 - 3 && (2883842 & var31[-var32 + var29][var30 - 1 + -var33]) == 0) {
                                                            --var30;
                                                        }
                                                        if (var35 == 3 && var30 < var4 - 1 + 104 && ~(var20 + 3) < ~var30 && ~(2883872 & var31[-var32 + var29][-var33 + var30 + 1]) == -1) {
                                                            ++var30;
                                                        }
                                                    }
                                                }
                                                class433.field6310[class220.field3079] = var23.field1866;
                                                class278.field3762[class220.field3079] = var29;
                                                class208.field2942[class220.field3079] = var30;
                                                ++class220.field3079;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (class13.field161 != null) {
                        class249.field3463.field3322 = 1;
                        class436.field6349.method852(64, 1024, 79);
                        for (int var15 = 0; ~class13.field161.field6339 < ~var15; ++var15) {
                            int var16 = class13.field161.field6344[var15];
                            if (var16 >> 28 == class75.field1089.field464) {
                                int var17 = ((268428050 & var16) >> 14) + -class215.field3059;
                                int var18 = (16383 & var16) + -class79.field1134;
                                if (~var17 <= -1 && ~var17 > ~class442.field6435 && ~var18 <= -1 && ~class232.field3217 < ~var18) {
                                    class336.field4578.method3070(new class330(var15), (byte) -124);
                                } else {
                                    class191 var19 = class436.field6349.method850((byte) 78, class13.field161.field6340[var15]);
                                    if (var19.field2683 != null && ~(var19.field2668 + var17) <= -1 && ~(var19.field2659 + var17) > ~class442.field6435 && ~(var18 - -var19.field2686) <= -1 && var19.field2663 + var18 < class232.field3217) {
                                        class336.field4578.method3070(new class330(var15), (byte) -127);
                                    }
                                }
                            }
                        }
                        class436.field6349.method852(64, 128, -48);
                        class249.field3463.field3322 = 2;
                        class249.field3463.method1420(2);
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V")
    public final void method2736(byte arg0) {
        if (this.field6756 != null) {
            this.field6756.method1248();
        }
        if (arg0 != 101) {
            this.method400(68, (class162) null);
        }
        ++field6753;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IILco;ILqa;ZZ)V")
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        ++field6762;
        if (!arg6) {
            this.field6770 = -86;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lqa;I)Lip;")
    public final class498 method402(class162 arg0, int arg1) {
        ++field6776;
        class121 var3 = this.method2731(2048, arg0, (byte) -124);
        if (var3 == null) {
            return null;
        } else {
            class415 var4 = arg0.method539();
            var4.method325(this.field6755);
            var4.method336(this.field6770);
            var4.method335((int) this.field6784, (int) this.field6794, (int) this.field6790);
            if (this.field6756 == null) {
                var3.method781(var4, (class525) null, 0);
            } else {
                class148 var5 = this.field6756.method1260();
                arg0.method512(var3, var5, var4, (class525) null, 0);
            }
            if (arg1 != 16562) {
                this.method2736((byte) -58);
            }
            this.field6766 = var3.method771();
            this.method2734(arg0, var3, 4435);
            return null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method2737(int arg0) {
        field6788 = null;
        if (arg0 != -1) {
            method2729(-3, true);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lqa;III)Z")
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 24130) {
            this.method157(-118);
        }
        ++field6777;
        return false;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2738(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
