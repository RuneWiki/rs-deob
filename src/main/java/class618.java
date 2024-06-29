import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class618 extends class562 {

    @OriginalMember(owner = "client!lw", name = "hb", descriptor = "Z")
    public boolean field8897 = false;

    @OriginalMember(owner = "client!lw", name = "fb", descriptor = "Z")
    public boolean field8895 = false;

    @OriginalMember(owner = "client!lw", name = "kb", descriptor = "Z")
    public boolean field8900 = false;

    @OriginalMember(owner = "client!lw", name = "sb", descriptor = "Z")
    public boolean field8908 = false;

    @OriginalMember(owner = "client!lw", name = "qb", descriptor = "Z")
    public boolean field8906 = false;

    @OriginalMember(owner = "client!lw", name = "zb", descriptor = "Lvk;")
    public static class414 field8915 = new class414("LIVE", 0);

    @OriginalMember(owner = "client!lw", name = "Cb", descriptor = "I")
    public static int field8918 = 0;

    @OriginalMember(owner = "client!lw", name = "Db", descriptor = "Z")
    public static boolean field8919 = false;

    @OriginalMember(owner = "client!lw", name = "tb", descriptor = "F")
    public static float field8909;

    @OriginalMember(owner = "client!lw", name = "db", descriptor = "I")
    public static int field8893;

    @OriginalMember(owner = "client!lw", name = "eb", descriptor = "I")
    public static int field8894;

    @OriginalMember(owner = "client!lw", name = "gb", descriptor = "I")
    public static int field8896;

    @OriginalMember(owner = "client!lw", name = "ib", descriptor = "I")
    public static int field8898;

    @OriginalMember(owner = "client!lw", name = "jb", descriptor = "I")
    public static int field8899;

    @OriginalMember(owner = "client!lw", name = "lb", descriptor = "I")
    public static int field8901;

    @OriginalMember(owner = "client!lw", name = "mb", descriptor = "I")
    public static int field8902;

    @OriginalMember(owner = "client!lw", name = "nb", descriptor = "I")
    public static int field8903;

    @OriginalMember(owner = "client!lw", name = "ob", descriptor = "I")
    public static int field8904;

    @OriginalMember(owner = "client!lw", name = "pb", descriptor = "I")
    public static int field8905;

    @OriginalMember(owner = "client!lw", name = "rb", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!lw", name = "ub", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!lw", name = "vb", descriptor = "I")
    public static int field8911;

    @OriginalMember(owner = "client!lw", name = "wb", descriptor = "I")
    public int field8912;

    @OriginalMember(owner = "client!lw", name = "xb", descriptor = "I")
    public static int field8913;

    @OriginalMember(owner = "client!lw", name = "yb", descriptor = "I")
    public static int field8914;

    @OriginalMember(owner = "client!lw", name = "Ab", descriptor = "I")
    public static int field8916;

    @OriginalMember(owner = "client!lw", name = "Bb", descriptor = "I")
    public static int field8917;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Z)V")
    public final void method3533(boolean arg0) {
        ++field8916;
        this.method3548(false, (byte) 68);
        super.field7873 = false;
        super.field7875 = false;
        super.field7855 = super.field7858 = 0;
        super.field7862 = 0;
        super.field7854 = super.field7844 = 0;
        super.field7843 = false;
        super.field7872 = false;
        super.field7857 = false;
        super.field7836 = false;
        super.field7876 = false;
        super.field7863 = false;
        if (!arg0) {
            this.field8908 = true;
        }
        super.field7880 = false;
        super.field7868 = false;
        super.field7879 = false;
        class298.method1833((byte) -74, 0);
        super.field7864 = false;
        super.field7865 = 0;
        super.field7847 = false;
        this.method3542(!arg0);
        super.field7852 = 1;
        class113.method609(0);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(ILge;)V")
    private final void method3534(int arg0, class551 arg1) {
        ++field8911;
        if (~(arg1.field7693.length + -arg1.field7707) <= -2) {
            int var3 = arg1.method3045(-127);
            if (var3 >= 0 && ~var3 >= -19) {
                byte var4;
                if (~var3 != -19) {
                    if (var3 == 17) {
                        var4 = 40;
                    } else if (var3 != 16) {
                        if (~var3 == -16) {
                            var4 = 37;
                        } else if (var3 == 14) {
                            var4 = 36;
                        } else if (var3 != 13) {
                            if (~var3 == -13) {
                                var4 = 34;
                            } else if (var3 != 11) {
                                if (~var3 == -11) {
                                    var4 = 32;
                                } else if (var3 == 9) {
                                    var4 = 31;
                                } else if (~var3 != -9) {
                                    if (var3 != 7) {
                                        if (~var3 != -7) {
                                            if (var3 != 5) {
                                                if (var3 != 4) {
                                                    if (~var3 == -4) {
                                                        var4 = 23;
                                                    } else if (var3 == 2) {
                                                        var4 = 22;
                                                    } else if (var3 == 1) {
                                                        var4 = 23;
                                                    } else {
                                                        var4 = 19;
                                                    }
                                                } else {
                                                    var4 = 24;
                                                }
                                            } else {
                                                var4 = 28;
                                            }
                                        } else {
                                            var4 = 28;
                                        }
                                    } else {
                                        var4 = 29;
                                    }
                                } else {
                                    var4 = 30;
                                }
                            } else {
                                var4 = 33;
                            }
                        } else {
                            var4 = 35;
                        }
                    } else {
                        var4 = 38;
                    }
                } else {
                    var4 = 41;
                }
                if (arg0 > -81) {
                    field8909 = -1.370312F;
                }
                if (~var4 >= ~(arg1.field7693.length + -arg1.field7707)) {
                    super.field7860 = arg1.method3045(-128);
                    if (super.field7860 >= 1) {
                        if (~super.field7860 < -5) {
                            super.field7860 = 4;
                        }
                    } else {
                        super.field7860 = 1;
                    }
                    this.method3548(arg1.method3045(-128) == 1, (byte) 68);
                    super.field7875 = arg1.method3045(-125) == 1;
                    super.field7843 = ~arg1.method3045(-125) == -2;
                    super.field7879 = arg1.method3045(-127) == 1;
                    super.field7862 = ~arg1.method3045(-128) != -2 ? 0 : 1;
                    super.field7836 = ~arg1.method3045(-127) == -2;
                    super.field7868 = ~arg1.method3045(-126) == -2;
                    super.field7876 = ~arg1.method3045(-126) == -2;
                    super.field7854 = arg1.method3045(-125);
                    if (~super.field7854 < -3) {
                        super.field7854 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field7844 = arg1.method3045(-127);
                    }
                    if (var3 >= 2) {
                        super.field7857 = ~arg1.method3045(-126) == -2;
                        if (~var3 <= -18) {
                            super.field7863 = ~arg1.method3045(-126) == -2;
                        }
                    } else {
                        super.field7857 = arg1.method3045(-127) == 1;
                        arg1.method3045(-127);
                    }
                    super.field7873 = arg1.method3045(-128) == 1;
                    super.field7872 = ~arg1.method3045(-127) == -2;
                    super.field7855 = arg1.method3045(-128);
                    if (~super.field7855 < -3) {
                        super.field7855 = 2;
                    }
                    super.field7858 = super.field7855;
                    super.field7845 = arg1.method3045(-127) == 1;
                    super.field7856 = arg1.method3045(-128);
                    if (~super.field7856 < -128) {
                        super.field7856 = 127;
                    }
                    super.field7851 = arg1.method3045(-127);
                    super.field7838 = arg1.method3045(-126);
                    if (~super.field7838 < -128) {
                        super.field7838 = 127;
                    }
                    if (~var3 <= -2) {
                        super.field7877 = arg1.method3090(-117);
                        super.field7878 = arg1.method3090(-102);
                    }
                    if (var3 >= 3 && var3 < 6) {
                        arg1.method3045(-128);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg1.method3045(-125);
                        if (~var5 > -1 || var5 > 2) {
                            var5 = 0;
                        }
                        if (class282.field3697 < 96) {
                            var5 = 0;
                        }
                        class298.method1833((byte) -116, var5);
                    }
                    if (~var3 <= -6) {
                        super.field7870 = arg1.method3048(-4);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field7835 = var6 = arg1.method3045(-128);
                    }
                    if (~super.field7835 != -2 && ~super.field7835 != -3) {
                        super.field7835 = 2;
                    }
                    if (var3 >= 7) {
                        super.field7846 = ~arg1.method3045(-125) == -2;
                    }
                    if (var3 >= 8) {
                        super.field7869 = ~arg1.method3045(-127) == -2;
                    }
                    if (var3 >= 9) {
                        super.field7865 = arg1.method3045(-125);
                    }
                    if (super.field7865 < 0 || super.field7865 > class88.method490((byte) 39, class282.field3697)) {
                        super.field7865 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field7864 = ~arg1.method3045(-126) != -1;
                    }
                    if (var3 >= 11) {
                        super.field7871 = ~arg1.method3045(-125) != -1;
                    }
                    if (var3 >= 12) {
                        super.field7862 = arg1.method3045(-127);
                    }
                    if (super.field7862 < 0 || super.field7862 > 2) {
                        super.field7862 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field7847 = ~arg1.method3045(-127) == -2;
                    }
                    if (var3 >= 14) {
                        super.field7849 = arg1.method3045(-126);
                    } else if (var6 != 0) {
                        super.field7849 = 1;
                    } else {
                        super.field7849 = 2;
                    }
                    if (~super.field7849 > -1 || super.field7849 > 5) {
                        super.field7849 = 2;
                    }
                    if (~var3 <= -16) {
                        super.field7842 = arg1.method3045(-128);
                        if (~super.field7842 > -1 || ~super.field7842 < -5) {
                            super.field7842 = class435.field5919 != 1 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field7880 = ~arg1.method3045(-126) == -2;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field7880 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && ~super.field7849 == -1) {
                        super.field7849 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field7852 = arg1.method3045(-127);
                        if (~super.field7852 > -1 || super.field7852 > 4) {
                            super.field7852 = 0;
                        }
                        if (super.field7852 == 2) {
                            super.field7843 = true;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(B)I")
    public final int method3535(byte arg0) {
        ++field8898;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class279.field3639 != 3 && ~class279.field3639 != -3) {
            if (class279.field3649.startsWith("win")) {
                var4 = true;
                var3 = true;
                if (!class279.field3643.startsWith("amd64") && !class279.field3643.startsWith("x86_64")) {
                    var2 = true;
                }
            } else {
                var3 = true;
            }
        }
        if (this.field8906) {
            var2 = false;
        }
        if (this.field8897) {
            var4 = false;
        }
        if (this.field8895) {
            var3 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method3549(113);
        } else {
            if (arg0 != -112) {
                this.method3541(5);
            }
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class228.method1446(1000, false, 2);
                } catch (Exception var14) {
                }
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class228.method1446(1000, false, 3);
                    if (class428.field5845 == 3) {
                        class183 var8 = class301.field3918.method988();
                        long var9 = 281474976710655L & var8.field2348;
                        int var11 = var8.field2346;
                        if (var11 != 4318) {
                            if (~var11 == -4099) {
                                var3 &= var9 >= 60129613779L;
                            }
                        } else {
                            var3 &= var9 >= 64425238954L;
                        }
                    }
                } catch (Exception var13) {
                }
            }
            if (var3) {
                try {
                    var6 = class228.method1446(1000, false, 1);
                } catch (Exception var12) {
                }
            }
            if (~var5 == 0 && ~var6 == 0 && var7 == -1) {
                return this.method3549(118);
            } else if (var7 < var5 && var5 > var6) {
                return this.method3544(-127, var5);
            } else {
                return ~var6 > ~var7 ? this.method3546((byte) -116, var7, 3) : this.method3546((byte) -121, var6, 1);
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V")
    public static void method3536(int arg0) {
        if (arg0 != 12557) {
            field8919 = false;
        }
        field8915 = null;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILgaa;)V")
    public final void method3537(int arg0, class279 arg1) {
        ++field8913;
        class578 var3 = null;
        try {
            if (arg0 < 41) {
                this.method3534(50, (class551) null);
            }
            class441 var4 = arg1.method1727(true, (byte) 122, "");
            while (var4.field6001 == 0) {
                class353.method2204(1L, 7806);
            }
            if (~var4.field6001 == -2) {
                var3 = (class578) var4.field6000;
                class551 var5 = new class551(class4.method10((byte) 65));
                this.method3157(103, var5);
                var3.method3249((byte) 98, var5.field7707, var5.field7693, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method3252(0);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(II)I")
    public final int method3538(int arg0, int arg1) {
        ++field8905;
        if (arg0 != 1) {
            return 82;
        } else if (this.field8900) {
            return 0;
        } else if (!this.method3539(arg1, 2)) {
            return 1;
        } else {
            return !super.field7875 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(II)Z")
    public final boolean method3539(int arg0, int arg1) {
        ++field8907;
        if (arg1 != 2) {
            method3543(77, -30, -16, 66, -122);
        }
        return arg0 == 0 && !this.field8908 ? super.field7848 : true;
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(I)V")
    public final void method3540(int arg0) {
        this.method3548(true, (byte) 68);
        ++field8901;
        super.field7854 = super.field7844 = 1;
        super.field7876 = true;
        super.field7863 = false;
        super.field7836 = true;
        super.field7880 = true;
        super.field7875 = true;
        super.field7872 = true;
        super.field7879 = true;
        super.field7862 = 1;
        super.field7868 = true;
        super.field7873 = false;
        super.field7843 = true;
        super.field7855 = super.field7858 = 0;
        int var2 = -127 / ((arg0 - -68) / 46);
        super.field7857 = true;
        if (class282.field3697 <= 95) {
            class298.method1833((byte) -92, 0);
        } else {
            class298.method1833((byte) -61, 1);
        }
        super.field7864 = false;
        super.field7865 = 0;
        super.field7847 = true;
        this.method3542(false);
        super.field7852 = 3;
        class113.method609(0);
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(I)V")
    public final void method3541(int arg0) {
        this.method3548(true, (byte) 68);
        ++field8899;
        super.field7857 = false;
        super.field7873 = false;
        super.field7855 = super.field7858 = 0;
        super.field7843 = true;
        super.field7879 = false;
        super.field7880 = false;
        super.field7836 = false;
        super.field7862 = 0;
        super.field7876 = false;
        super.field7875 = false;
        super.field7863 = false;
        super.field7854 = super.field7844 = arg0;
        super.field7868 = false;
        super.field7872 = false;
        class298.method1833((byte) -60, 0);
        super.field7864 = false;
        super.field7865 = 0;
        super.field7847 = true;
        this.method3542(false);
        super.field7852 = 2;
        class113.method609(0);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(Z)V")
    private final void method3542(boolean arg0) {
        if (class435.field5919 <= 1) {
            super.field7842 = 2;
        } else {
            super.field7842 = 4;
        }
        if (arg0) {
            this.field8906 = false;
        }
        ++field8902;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)V")
    public static final void method3543(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class535.field7467 = arg2;
        class355.field4972 = arg3;
        if (arg4 == 0) {
            ++field8904;
            class594.field8575 = arg0;
            class113.field1453 = arg1;
        }
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(II)I")
    private final int method3544(int arg0, int arg1) {
        ++field8917;
        int var3 = 97 / ((-51 - arg0) / 42);
        byte var4;
        if (arg1 > 12000) {
            var4 = 4;
            this.method3545((byte) 96);
        } else if (~arg1 < -5001) {
            this.method3540(-1);
            var4 = 3;
        } else if (arg1 > 2000) {
            var4 = 2;
            this.method3541(0);
        } else {
            this.method3533(true);
            var4 = 1;
        }
        if (~class428.field5845 != -3) {
            super.field7849 = 2;
            class293.method1796(2, (byte) -124);
        }
        this.method3537(111, class31.field488);
        return var4;
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)V")
    public final void method3545(byte arg0) {
        ++field8896;
        this.method3548(true, (byte) 68);
        super.field7862 = 1;
        super.field7857 = true;
        super.field7836 = true;
        super.field7854 = super.field7844 = 2;
        super.field7843 = true;
        super.field7879 = true;
        super.field7868 = true;
        super.field7875 = true;
        super.field7873 = true;
        super.field7863 = true;
        int var2 = 82 / ((5 - arg0) / 59);
        super.field7872 = true;
        super.field7876 = true;
        super.field7880 = true;
        super.field7855 = super.field7858 = 0;
        if (class282.field3697 > 95) {
            class298.method1833((byte) -74, 2);
        } else {
            class298.method1833((byte) -56, 0);
        }
        super.field7864 = false;
        super.field7847 = true;
        super.field7865 = 0;
        this.method3542(false);
        super.field7852 = 4;
        class113.method609(0);
    }

    @OriginalMember(owner = "client!lw", name = "b", descriptor = "(BII)I")
    private final int method3546(byte arg0, int arg1, int arg2) {
        ++field8903;
        if (arg0 > -106) {
            return 53;
        } else {
            byte var4;
            if (~arg1 < -20001) {
                var4 = 4;
                this.method3545((byte) 81);
            } else if (arg1 <= 10000) {
                if (~arg1 < -5001) {
                    var4 = 2;
                    this.method3541(0);
                } else {
                    var4 = 1;
                    this.method3533(true);
                }
            } else {
                this.method3540(-4);
                var4 = 3;
            }
            if (~class428.field5845 != ~arg2) {
                super.field7849 = arg2;
                class293.method1796(arg2, (byte) -91);
            }
            this.method3537(124, class31.field488);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lge;Lgaa;II)V")
    public static final void method3547(class551 arg0, class279 arg1, int arg2, int arg3) {
        ++field8914;
        class595 var4 = new class595();
        var4.field8579 = arg0.method3045(arg2 ^ -127);
        if (arg2 == 2) {
            var4.field8581 = arg0.method3048(-4);
            var4.field8582 = new class441[var4.field8579];
            var4.field8585 = new byte[var4.field8579][][];
            var4.field8583 = new int[var4.field8579];
            var4.field8577 = new class441[var4.field8579];
            var4.field8586 = new int[var4.field8579];
            var4.field8580 = new int[var4.field8579];
            for (int var5 = 0; ~var4.field8579 < ~var5; ++var5) {
                try {
                    int var6 = arg0.method3045(-126);
                    if (~var6 != -1 && var6 != 1 && var6 != 2) {
                        if (~var6 == -4 || ~var6 == -5) {
                            String var7 = arg0.method3077(-20739);
                            String var8 = arg0.method3077(-20739);
                            int var9 = arg0.method3045(-128);
                            String[] var10 = new String[var9];
                            for (int var11 = 0; ~var11 > ~var9; ++var11) {
                                var10[var11] = arg0.method3077(class426.method2502(arg2, -20737));
                            }
                            byte[][] var12 = new byte[var9][];
                            if (~var6 == -4) {
                                for (int var13 = 0; var9 > var13; ++var13) {
                                    int var14 = arg0.method3048(-4);
                                    var12[var13] = new byte[var14];
                                    arg0.method3086(0, var12[var13], true, var14);
                                }
                            }
                            var4.field8583[var5] = var6;
                            Class[] var15 = new Class[var9];
                            for (int var16 = 0; ~var9 < ~var16; ++var16) {
                                var15[var16] = class552.method3103(0, var10[var16]);
                            }
                            var4.field8577[var5] = arg1.method1736((byte) 10, var8, class552.method3103(0, var7), var15);
                            var4.field8585[var5] = var12;
                        }
                    } else {
                        String var17 = arg0.method3077(-20739);
                        String var18 = arg0.method3077(-20739);
                        int var19 = 0;
                        if (~var6 == -2) {
                            var19 = arg0.method3048(-4);
                        }
                        var4.field8583[var5] = var6;
                        var4.field8580[var5] = var19;
                        var4.field8582[var5] = arg1.method1719(var18, 9, class552.method3103(0, var17));
                    }
                } catch (ClassNotFoundException var20) {
                    var4.field8586[var5] = -1;
                } catch (SecurityException var21) {
                    var4.field8586[var5] = -2;
                } catch (NullPointerException var22) {
                    var4.field8586[var5] = -3;
                } catch (Exception var23) {
                    var4.field8586[var5] = -4;
                } catch (Throwable var24) {
                    var4.field8586[var5] = -5;
                }
            }
            class588.field8516.method3181(var4, true);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ZB)V")
    public final void method3548(boolean arg0, byte arg1) {
        if (arg1 == 68) {
            ++field8894;
            super.field7848 = arg0;
            if (class626.field9084 != null) {
                class626.field9084.method1090(!this.method3539(class428.field5845, 2), arg1 + -38);
            }
        }
    }

    @OriginalMember(owner = "client!lw", name = "g", descriptor = "(I)I")
    private final int method3549(int arg0) {
        ++field8893;
        byte var3;
        if (class282.field3697 >= 96) {
            int var2 = class491.method2757(108);
            if (var2 <= 100) {
                var3 = 4;
                this.method3545((byte) -86);
            } else if (~var2 >= -501) {
                var3 = 3;
                this.method3540(113);
            } else if (var2 > 1000) {
                var3 = 1;
                this.method3533(true);
            } else {
                this.method3541(0);
                var3 = 2;
            }
        } else {
            var3 = 1;
            this.method3533(true);
        }
        if (class428.field5845 != 0) {
            super.field7849 = 0;
            class293.method1796(0, (byte) -93);
        }
        if (arg0 <= 111) {
            this.field8906 = false;
        }
        this.method3537(48, class31.field488);
        return var3;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IB)Z")
    public final boolean method3550(int arg0, byte arg1) {
        ++field8910;
        if (arg1 != -35) {
            this.method3542(true);
        }
        return arg0 == 0 ? super.field7848 : true;
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lgaa;)V")
    public class618(class279 arg0) {
        super.field7860 = 3;
        super.field7852 = 3;
        this.method3548(true, (byte) 68);
        super.field7857 = true;
        super.field7872 = true;
        super.field7844 = 0;
        super.field7878 = 0;
        super.field7838 = 127;
        super.field7851 = 127;
        super.field7879 = true;
        super.field7845 = true;
        super.field7863 = false;
        super.field7855 = 0;
        super.field7836 = true;
        super.field7877 = 0;
        super.field7862 = 1;
        super.field7858 = 0;
        super.field7843 = true;
        super.field7876 = true;
        super.field7873 = true;
        super.field7868 = true;
        super.field7875 = true;
        super.field7856 = 127;
        super.field7854 = 2;
        if (~class282.field3697 <= -97) {
            class298.method1833((byte) -64, 2);
        } else {
            class298.method1833((byte) -87, 0);
        }
        super.field7847 = true;
        super.field7871 = true;
        super.field7870 = 0;
        super.field7865 = 0;
        super.field7846 = false;
        super.field7864 = false;
        super.field7849 = 2;
        super.field7869 = false;
        super.field7835 = 2;
        super.field7842 = class435.field5919 != 1 ? 4 : 2;
        class578 var2 = null;
        try {
            class441 var3 = arg0.method1727(true, (byte) -79, "");
            while (var3.field6001 == 0) {
                class353.method2204(1L, 7806);
            }
            if (var3.field6001 == 1) {
                var2 = (class578) var3.field6000;
                byte[] var4 = new byte[(int) var2.method3251(-25730)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method3247(var4.length + -var5, var4, var5, -85);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method3534(-92, new class551(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method3252(0);
            }
        } catch (Exception var7) {
        }
    }
}
