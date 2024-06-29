import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class105 extends class264 {

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "Lcf;")
    public static class93 field1816 = class147.method1066("Librairie 3D d-Bmarr-Be", -48);

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "Lcf;")
    public static class93 field1818 = class147.method1066("RuneScape wird geladen )2 bitte warten)3)3)3", -48);

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "Lcf;")
    public static class93 field1819 = class147.method1066("<col=ff0000>", -48);

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    public static int field1822 = 0;

    @OriginalMember(owner = "client!jj", name = "L", descriptor = "I")
    public static int field1813 = 0;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "Lcf;")
    public static class93 field1825 = class147.method1066("Connexion au serveur de mise -9 jour en cours", -48);

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "F")
    public static float field1823;

    @OriginalMember(owner = "client!jj", name = "J", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "Lhg;")
    public static class177 field1817;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "Lhg;")
    public static class177 field1821;

    @OriginalMember(owner = "client!jj", name = "Y", descriptor = "Lwd;")
    public static class22 field1826;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(B)V")
    public static final void method759(byte arg0) {
        class218.field3972.method300(0);
        int var1 = 97 % ((arg0 - -74) / 50);
        ++field1824;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field1811;
        if (arg1 > -83) {
            field1825 = null;
        }
        int[] var3 = super.field4716.method532((byte) 76, arg0);
        if (super.field4716.field1424) {
            int[][] var4 = this.method1773(-121, 0, arg0);
            int[] var5 = var4[1];
            int[] var6 = var4[2];
            int[] var7 = var4[0];
            for (int var8 = 0; ~var8 > ~class176.field3060; ++var8) {
                var3[var8] = (var6[var8] + var7[var8] - -var5[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V")
    public class105() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(III)Lgk;")
    public static final class157 method760(int arg0, int arg1, int arg2) {
        ++field1812;
        if (arg2 != 2048) {
            method762(75, (class210) null);
        }
        for (class157 var3 = (class157) class85.field1538.method1151(113); var3 != null; var3 = (class157) class85.field1538.method1159(103)) {
            if (var3.field2794 && var3.method1124(arg1, 0, arg0)) {
                return var3;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(B)V")
    public static void method761(byte arg0) {
        field1819 = null;
        field1818 = null;
        field1817 = null;
        int var1 = 44 % ((arg0 - -15) / 47);
        field1821 = null;
        field1826 = null;
        field1825 = null;
        field1816 = null;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ILcc;)V")
    public static final void method762(int arg0, class210 arg1) {
        ++field1814;
        if (arg1.field3791 != 0) {
            class50 var2 = arg1.method1483(0);
            if (arg1.field3841 != -1 && arg1.field3841 < 32768) {
                class227 var3 = class155.field2709[arg1.field3841];
                if (var3 != null) {
                    int var4 = -var3.field3784 + arg1.field3784;
                    int var5 = arg1.field3868 - var3.field3868;
                    if (~var5 != -1 || var4 != 0) {
                        arg1.field3770 = (int) (Math.atan2((double) var5, (double) var4) * 325.949D) & 2047;
                    }
                }
            }
            if (~arg1.field3841 <= -32769) {
                int var6 = arg1.field3841 + -32768;
                if (~class141.field2446 == ~var6) {
                    var6 = 2047;
                }
                class237 var7 = class224.field4031[var6];
                if (var7 != null) {
                    int var8 = -var7.field3868 + arg1.field3868;
                    int var9 = -var7.field3784 + arg1.field3784;
                    if (~var8 != -1 || ~var9 != -1) {
                        arg1.field3770 = 2047 & (int) (Math.atan2((double) var8, (double) var9) * 325.949D);
                    }
                }
            }
            if ((arg1.field3865 != 0 || arg1.field3826 != 0) && (arg1.field3870 == 0 || ~arg1.field3823 < -1)) {
                int var10 = -((-class4.field52 + arg1.field3826 + -class4.field52) * 64) + arg1.field3784;
                int var11 = arg1.field3868 - (-class229.field4111 + arg1.field3865 + -class229.field4111) * 64;
                if (~var11 != -1 || ~var10 != -1) {
                    arg1.field3770 = (int) (Math.atan2((double) var11, (double) var10) * 325.949D) & 2047;
                }
                arg1.field3865 = 0;
                arg1.field3826 = 0;
            }
            int var12 = 2047 & arg1.field3770 - arg1.field3807;
            if (~var12 == -1) {
                arg1.field3808 = 0;
                arg1.field3828 = 0;
            } else if (~var2.field814 == -1) {
                ++arg1.field3828;
                if (var12 <= 1024) {
                    arg1.field3807 += arg1.field3791;
                    boolean var13 = true;
                    if (arg1.field3791 > var12 || ~(-arg1.field3791 + 2048) > ~var12) {
                        var13 = false;
                        arg1.field3807 = arg1.field3770;
                    }
                    if (arg1.field3797 == var2.field800 && (~arg1.field3828 < -26 || var13)) {
                        if (~var2.field808 == 0) {
                            arg1.field3797 = var2.field823;
                        } else {
                            arg1.field3797 = var2.field808;
                        }
                    }
                } else {
                    arg1.field3807 -= arg1.field3791;
                    boolean var14 = true;
                    if (~var12 > ~arg1.field3791 || ~var12 < ~(-arg1.field3791 + 2048)) {
                        arg1.field3807 = arg1.field3770;
                        var14 = false;
                    }
                    if (~arg1.field3797 == ~var2.field800 && (arg1.field3828 > 25 || var14)) {
                        if (var2.field817 != -1) {
                            arg1.field3797 = var2.field817;
                        } else {
                            arg1.field3797 = var2.field823;
                        }
                    }
                }
                arg1.field3807 &= 2047;
            } else {
                if (arg1.field3797 == var2.field800 && arg1.field3828 > 25) {
                    if (var2.field808 == -1) {
                        arg1.field3797 = var2.field823;
                    } else {
                        arg1.field3797 = var2.field808;
                    }
                }
                int var15 = arg1.field3770 << 5;
                if (~arg1.field3858 != ~var15) {
                    arg1.field3858 = var15;
                    int var16 = var15 - arg1.field3771 & 65535;
                    arg1.field3819 = 0;
                    int var17 = arg1.field3808 * arg1.field3808 / (var2.field814 * 2);
                    if (arg1.field3808 > 0 && ~var16 <= ~var17 && ~(var16 - var17) > -32769) {
                        arg1.field3848 = var16 / 2;
                        arg1.field3786 = true;
                        int var18 = var2.field821 * var2.field821 / (var2.field814 * 2);
                        if (~var18 < -32768) {
                            var18 = 32767;
                        }
                        if (~arg1.field3848 < ~var18) {
                            arg1.field3848 = var16 - var18;
                        }
                    } else if (arg1.field3808 < 0 && var17 <= -var16 + 65536 && 65536 - var17 + -var16 < 32768) {
                        arg1.field3848 = (-var16 + 65536) / 2;
                        int var19 = var2.field821 * var2.field821 / (var2.field814 * 2);
                        arg1.field3786 = true;
                        if (~var19 < -32768) {
                            var19 = 32767;
                        }
                        if (~var19 > ~arg1.field3848) {
                            arg1.field3848 = -var16 + -var19 + 65536;
                        }
                    } else {
                        arg1.field3786 = false;
                    }
                }
                if (~arg1.field3808 == -1) {
                    int var20 = -arg1.field3771 + arg1.field3858 & 65535;
                    if (~var2.field814 >= ~var20) {
                        arg1.field3786 = true;
                        arg1.field3819 = 0;
                        int var21 = var2.field821 * var2.field821 / (var2.field814 * 2);
                        if (~var21 < -32768) {
                            var21 = 32767;
                        }
                        if (~var20 <= -32769) {
                            arg1.field3848 = (65536 - var20) / 2;
                            if (~arg1.field3848 < ~var21) {
                                arg1.field3848 = -var21 + 65536 + -var20;
                            }
                            arg1.field3808 = -var2.field814;
                        } else {
                            arg1.field3848 = var20 / 2;
                            if (~var21 > ~arg1.field3848) {
                                arg1.field3848 = var20 - var21;
                            }
                            arg1.field3808 = var2.field814;
                        }
                    } else {
                        arg1.field3771 = arg1.field3858;
                    }
                } else if (arg1.field3808 > 0) {
                    if (~arg1.field3848 >= ~arg1.field3819) {
                        arg1.field3786 = false;
                    }
                    if (arg1.field3786) {
                        if (~arg1.field3808 > ~var2.field821) {
                            arg1.field3808 += var2.field814;
                        }
                    } else {
                        arg1.field3808 -= var2.field814;
                        if (~arg1.field3808 > -1) {
                            arg1.field3808 = 0;
                        }
                    }
                } else {
                    if (arg1.field3819 >= arg1.field3848) {
                        arg1.field3786 = false;
                    }
                    if (!arg1.field3786) {
                        arg1.field3808 += var2.field814;
                        if (arg1.field3808 > 0) {
                            arg1.field3808 = 0;
                        }
                    } else if (~(-var2.field821) > ~arg1.field3808) {
                        arg1.field3808 -= var2.field814;
                    }
                }
                if (arg1.field3808 > 0) {
                    arg1.field3819 += arg1.field3808;
                } else {
                    arg1.field3819 -= arg1.field3808;
                }
                arg1.field3771 += arg1.field3808;
                arg1.field3771 &= 65535;
                arg1.field3807 = arg1.field3771 >> 5;
            }
            if (arg0 <= 92) {
                method761((byte) -33);
            }
        }
    }
}
