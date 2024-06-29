import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class218 extends class196 {

    @OriginalMember(owner = "client!dc", name = "lb", descriptor = "I")
    private int field3798 = 0;

    @OriginalMember(owner = "client!dc", name = "xb", descriptor = "I")
    private int field3810 = 0;

    @OriginalMember(owner = "client!dc", name = "tb", descriptor = "I")
    private int field3806 = 0;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "I")
    public static int field3788 = 0;

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "Ldf;")
    public static class51 field3787 = class46.method233("<col=ff3000>", 100);

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "Ldf;")
    public static class51 field3783 = class46.method233("Konfig geladen)3", 100);

    @OriginalMember(owner = "client!dc", name = "fb", descriptor = "I")
    public static int field3792 = 0;

    @OriginalMember(owner = "client!dc", name = "gb", descriptor = "Ldf;")
    public static class51 field3793 = class46.method233("(U5", 100);

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "Ldf;")
    public static class51 field3786 = class46.method233("settings", 100);

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Ldf;")
    private static class51 field3779 = class46.method233("K", 100);

    @OriginalMember(owner = "client!dc", name = "ob", descriptor = "I")
    public static int field3801 = 127;

    @OriginalMember(owner = "client!dc", name = "qb", descriptor = "Ldf;")
    private static class51 field3803 = class46.method233("Loading title screen )2 ", 100);

    @OriginalMember(owner = "client!dc", name = "db", descriptor = "Ldf;")
    public static class51 field3790 = field3803;

    @OriginalMember(owner = "client!dc", name = "ib", descriptor = "Ldf;")
    public static class51 field3795 = field3779;

    @OriginalMember(owner = "client!dc", name = "sb", descriptor = "Ldf;")
    public static class51 field3805 = class46.method233("<col=ff0000>", 100);

    @OriginalMember(owner = "client!dc", name = "vb", descriptor = "I")
    public static int field3808 = 0;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "Ldf;")
    public static class51 field3782 = field3779;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field3778;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    private int field3781;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    private int field3784;

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!dc", name = "hb", descriptor = "I")
    public static int field3794;

    @OriginalMember(owner = "client!dc", name = "jb", descriptor = "I")
    private int field3796;

    @OriginalMember(owner = "client!dc", name = "kb", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!dc", name = "mb", descriptor = "I")
    private int field3799;

    @OriginalMember(owner = "client!dc", name = "nb", descriptor = "I")
    private int field3800;

    @OriginalMember(owner = "client!dc", name = "pb", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!dc", name = "rb", descriptor = "I")
    private int field3804;

    @OriginalMember(owner = "client!dc", name = "ub", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!dc", name = "wb", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!dc", name = "eb", descriptor = "[Ldf;")
    public static class51[] field3791;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        if (arg0 != 11) {
            return null;
        } else {
            int[][] var3 = super.field3285.method1548(arg1, (byte) -90);
            ++field3777;
            if (super.field3285.field3963) {
                int[][] var4 = this.method1387(101, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[2];
                int[] var7 = var4[1];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var3[0];
                for (int var11 = 0; var11 < class49.field767; ++var11) {
                    this.method1499(123, var7[var11], var6[var11], var5[var11]);
                    this.field3800 += this.field3806;
                    this.field3804 += this.field3798;
                    this.field3784 += this.field3810;
                    while (this.field3804 < 0) {
                        this.field3804 += 4096;
                    }
                    if (this.field3784 < 0) {
                        this.field3784 = 0;
                    }
                    if (~this.field3784 < -4097) {
                        this.field3784 = 4096;
                    }
                    if (this.field3800 < 0) {
                        this.field3800 = 0;
                    }
                    if (this.field3800 > 4096) {
                        this.field3800 = 4096;
                    }
                    while (~this.field3804 < -4097) {
                        this.field3804 -= 4096;
                    }
                    this.method1503(this.field3784, this.field3804, this.field3800, -123);
                    var10[var11] = this.field3796;
                    var8[var11] = this.field3799;
                    var9[var11] = this.field3781;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method1497(int arg0, byte[] arg1) {
        int var2 = -75 % ((arg0 - -61) / 43);
        class121 var3 = new class121(arg1);
        ++field3778;
        int var4 = var3.method897(-94);
        int var5 = var3.method865((byte) 8);
        if (~var5 <= -1 && (~class25.field375 == -1 || ~var5 >= ~class25.field375)) {
            if (var4 == 0) {
                byte[] var8 = new byte[var5];
                var3.method916(true, 0, var8, var5);
                return var8;
            } else {
                int var6 = var3.method865((byte) 8);
                if (var6 < 0 || ~class25.field375 != -1 && ~class25.field375 > ~var6) {
                    throw new RuntimeException();
                } else {
                    byte[] var7 = new byte[var6];
                    if (~var4 != -2) {
                        class1.field4.method1664(var7, var3, 0);
                    } else {
                        class226.method1555(var7, var6, arg1, var5, 9);
                    }
                    return var7;
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)V")
    public static final void method1498(byte arg0) {
        ++field3797;
        while (~class97.field1622.method433(class70.field1128, (byte) 114) <= -28) {
            int var1 = class97.field1622.method428(15, (byte) -115);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class34.field512[var1] == null) {
                var2 = true;
                class34.field512[var1] = new class83();
            }
            class83 var3 = class34.field512[var1];
            class193.field3242[field3788++] = var1;
            var3.field4309 = class179.field2960;
            int var4 = class97.field1622.method428(5, (byte) -116);
            int var5 = class97.field1622.method428(1, (byte) -118);
            if (~var5 == -2) {
                class215.field3732[class185.field3060++] = var1;
            }
            if (var4 > 15) {
                var4 -= 32;
            }
            int var6 = class37.field567[class97.field1622.method428(3, (byte) -128)];
            if (var2) {
                var3.field4294 = var3.field4326 = var6;
            }
            int var7 = class97.field1622.method428(1, (byte) -121);
            int var8 = class97.field1622.method428(5, (byte) -116);
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field1392 = class247.method1678((byte) -74, class97.field1622.method428(14, (byte) -115));
            var3.field4297 = var3.field1392.field113;
            var3.field4275 = var3.field1392.field173;
            var3.field4307 = var3.field1392.field119;
            var3.field4287 = var3.field1392.field135;
            var3.field4298 = var3.field1392.field136;
            var3.field4341 = var3.field1392.field159;
            var3.field4304 = var3.field1392.field130;
            var3.field4312 = var3.field1392.field171;
            var3.field4345 = var3.field1392.field118;
            if (var3.field4307 == 0) {
                var3.field4326 = 0;
            }
            var3.method1683(class44.field706.field4336[0] + var8, 2, class44.field706.field4343[0] + var4, ~var7 == -2);
            if (var3.field1392.method64(-8093)) {
                class230.method1589(var3, 0, var3.field4343[0], (class103) null, (byte) -119, class257.field4496, (class108) null, var3.field4336[0]);
            }
        }
        class97.field1622.method431(98048);
        if (arg0 != -128) {
            field3783 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class218() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIII)V")
    private final void method1499(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 < arg3 ? arg3 : arg1;
        int var6 = arg1 <= arg3 ? arg1 : arg3;
        int var7 = ~var6 >= ~arg2 ? var6 : arg2;
        int var8 = ~arg2 >= ~var5 ? var5 : arg2;
        int var9 = var8 - var7;
        if (arg0 <= 73) {
            field3805 = null;
        }
        this.field3800 = (var7 + var8) / 2;
        if (~var9 >= -1) {
            this.field3804 = 0;
        } else {
            int var10 = (-arg3 + var8 << 12) / var9;
            int var11 = (-arg2 + var8 << 12) / var9;
            int var12 = (var8 - arg1 << 12) / var9;
            if (arg3 != var8) {
                if (~arg1 != ~var8) {
                    this.field3804 = arg3 != var7 ? -var10 + 20480 : 12288 - -var12;
                } else {
                    this.field3804 = ~arg2 == ~var7 ? var10 + 4096 : 12288 - var11;
                }
            } else {
                this.field3804 = arg1 != var7 ? -var12 + 4096 : var11 + 20480;
            }
            this.field3804 /= 6;
        }
        ++field3809;
        if (~this.field3800 < -1 && this.field3800 < 4096) {
            this.field3784 = (var9 << 12) / (~this.field3800 < -2049 ? -(this.field3800 * 2) + 8192 : this.field3800 * 2);
        } else {
            this.field3784 = 0;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(III)Z")
    public static final boolean method1500(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class42.field685; ++var3) {
            class245 var4 = class142.field2370[var3];
            if (var4.field4238 == 1) {
                int var5 = var4.field4240 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4231 * var5 >> 8) + var4.field4239;
                    int var7 = (var4.field4244 * var5 >> 8) + var4.field4245;
                    int var8 = (var4.field4233 * var5 >> 8) + var4.field4247;
                    int var9 = (var4.field4254 * var5 >> 8) + var4.field4235;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4238 == 2) {
                int var10 = arg0 - var4.field4240;
                if (var10 > 0) {
                    int var11 = (var4.field4231 * var10 >> 8) + var4.field4239;
                    int var12 = (var4.field4244 * var10 >> 8) + var4.field4245;
                    int var13 = (var4.field4233 * var10 >> 8) + var4.field4247;
                    int var14 = (var4.field4254 * var10 >> 8) + var4.field4235;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4238 == 3) {
                int var15 = var4.field4239 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4251 * var15 >> 8) + var4.field4240;
                    int var17 = (var4.field4246 * var15 >> 8) + var4.field4243;
                    int var18 = (var4.field4233 * var15 >> 8) + var4.field4247;
                    int var19 = (var4.field4254 * var15 >> 8) + var4.field4235;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4238 == 4) {
                int var20 = arg2 - var4.field4239;
                if (var20 > 0) {
                    int var21 = (var4.field4251 * var20 >> 8) + var4.field4240;
                    int var22 = (var4.field4246 * var20 >> 8) + var4.field4243;
                    int var23 = (var4.field4233 * var20 >> 8) + var4.field4247;
                    int var24 = (var4.field4254 * var20 >> 8) + var4.field4235;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4238 == 5) {
                int var25 = arg1 - var4.field4247;
                if (var25 > 0) {
                    int var26 = (var4.field4251 * var25 >> 8) + var4.field4240;
                    int var27 = (var4.field4246 * var25 >> 8) + var4.field4243;
                    int var28 = (var4.field4231 * var25 >> 8) + var4.field4239;
                    int var29 = (var4.field4244 * var25 >> 8) + var4.field4245;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Lid;")
    public static final class140 method1501(int arg0, byte arg1) {
        ++field3802;
        class140 var2 = (class140) class166.field2697.method1357((byte) 113, (long) arg0);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class263.field4598.method828(1, (byte) 120, arg0);
            class140 var4 = new class140();
            if (var3 != null) {
                var4.method1014(arg0, -9389, new class121(var3));
            }
            if (arg1 > -14) {
                field3803 = null;
            }
            class166.field2697.method1351(var4, 2, (long) arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "(I)V")
    public static void method1502(int arg0) {
        if (arg0 == 100) {
            field3790 = null;
            field3779 = null;
            field3805 = null;
            field3795 = null;
            field3793 = null;
            field3783 = null;
            field3803 = null;
            field3782 = null;
            field3786 = null;
            field3787 = null;
            field3791 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IIII)V")
    private final void method1503(int arg0, int arg1, int arg2, int arg3) {
        ++field3785;
        int var5 = ~arg2 >= -2049 ? (arg0 + 4096) * arg2 >> 12 : arg0 + arg2 + -(arg0 * arg2 >> 12);
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = arg2 + arg2 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (~var9 == -6) {
                                    this.field3796 = var5;
                                    this.field3799 = var7;
                                    this.field3781 = var15;
                                }
                            } else {
                                this.field3781 = var5;
                                this.field3796 = var14;
                                this.field3799 = var7;
                            }
                        } else {
                            this.field3781 = var5;
                            this.field3799 = var15;
                            this.field3796 = var7;
                        }
                    } else {
                        this.field3799 = var5;
                        this.field3796 = var7;
                        this.field3781 = var14;
                    }
                } else {
                    this.field3781 = var7;
                    this.field3799 = var5;
                    this.field3796 = var15;
                }
            } else {
                this.field3796 = var5;
                this.field3781 = var7;
                this.field3799 = var14;
            }
        } else {
            this.field3796 = this.field3799 = this.field3781 = arg2;
        }
        int var17 = 74 % ((arg3 - -22) / 38);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IBIIIZ)V")
    public static final void method1504(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        class225.field3964 = (short) arg3;
        ++field3794;
        int var6 = -114 % ((arg1 - 62) / 53);
        class172.field2822 = (short) arg4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([Ldf;[SI)V")
    public static final void method1505(class51[] arg0, short[] arg1, int arg2) {
        ++field3780;
        if (arg2 < 49) {
            field3787 = null;
        }
        class95.method705(arg0.length + -1, -29224, arg1, 0, arg0);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg2 == 82) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field3806 = (arg1.method912((byte) -90) << 12) / 100;
                    }
                } else {
                    this.field3810 = (arg1.method912((byte) -90) << 12) / 100;
                }
            } else {
                this.field3798 = arg1.method884(14513);
            }
            ++field3789;
        }
    }
}
