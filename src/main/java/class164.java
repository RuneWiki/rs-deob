import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class164 extends class264 {

    @OriginalMember(owner = "client!ek", name = "S", descriptor = "I")
    private int field2892 = 16;

    @OriginalMember(owner = "client!ek", name = "T", descriptor = "I")
    private int field2893 = 0;

    @OriginalMember(owner = "client!ek", name = "Q", descriptor = "I")
    private int field2890 = 2000;

    @OriginalMember(owner = "client!ek", name = "ab", descriptor = "I")
    private int field2900 = 4096;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    private int field2885 = 0;

    @OriginalMember(owner = "client!ek", name = "P", descriptor = "[Lcf;")
    public static class93[] field2889 = new class93[100];

    @OriginalMember(owner = "client!ek", name = "O", descriptor = "I")
    public static volatile int field2888 = 0;

    @OriginalMember(owner = "client!ek", name = "U", descriptor = "I")
    public static int field2894 = -1;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ek", name = "R", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!ek", name = "V", descriptor = "I")
    public static int field2895;

    @OriginalMember(owner = "client!ek", name = "W", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!ek", name = "Y", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!ek", name = "Z", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!ek", name = "bb", descriptor = "I")
    public static int field2901;

    @OriginalMember(owner = "client!ek", name = "cb", descriptor = "I")
    public static int field2902;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "Lgk;")
    public static class157 field2886;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "[[[B")
    public static byte[][][] field2887;

    @OriginalMember(owner = "client!ek", name = "X", descriptor = "[[[Lr;")
    public static class41[][][] field2897;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(B)V")
    public static final void method1181(byte arg0) {
        class167.field2939.method300(0);
        int var1 = -89 / ((arg0 - 64) / 56);
        class238.field4255.method300(0);
        ++field2902;
        class260.field4672.method300(0);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field2896;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (arg1 == 4) {
                            this.field2900 = arg2.method1891(-125);
                        }
                    } else {
                        this.field2893 = arg2.method1891(-113);
                    }
                } else {
                    this.field2892 = arg2.method1907(16832);
                }
            } else {
                this.field2890 = arg2.method1891(-122);
            }
        } else {
            this.field2885 = arg2.method1907(16832);
        }
        if (arg0 <= 11) {
            this.field2890 = -20;
        }
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V")
    public static void method1182(int arg0) {
        field2886 = null;
        field2887 = null;
        field2889 = null;
        if (arg0 != -20236) {
            field2897 = null;
        }
        field2897 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1183(int arg0, int arg1, int arg2, int arg3) {
        if (!class160.method1162(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class233.field4151[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class166.field2931) {
                        if (!class268.method1792(var4, var6, var5)) {
                            return false;
                        }
                        if (!class268.method1792(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class268.method1792(var4, var7, var5)) {
                            return false;
                        }
                        if (!class268.method1792(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class268.method1792(var4, var8, var5)) {
                        return false;
                    }
                    if (!class268.method1792(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class272.field4825) {
                        if (!class268.method1792(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class268.method1792(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class268.method1792(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class268.method1792(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class268.method1792(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class268.method1792(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class166.field2931) {
                        if (!class268.method1792(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class268.method1792(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class268.method1792(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class268.method1792(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class268.method1792(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class268.method1792(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class272.field4825) {
                        if (!class268.method1792(var4, var6, var5)) {
                            return false;
                        }
                        if (!class268.method1792(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class268.method1792(var4, var7, var5)) {
                            return false;
                        }
                        if (!class268.method1792(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class268.method1792(var4, var8, var5)) {
                        return false;
                    }
                    if (!class268.method1792(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class268.method1792(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class268.method1792(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class268.method1792(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class268.method1792(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class268.method1792(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V")
    public final void method64(int arg0) {
        class55.method310(4096);
        if (arg0 == -3) {
            ++field2891;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1184(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field2899;
        int var8 = class141.method1027(class26.field342, arg4, false, class271.field4820);
        int var9 = -90 % ((arg0 - 6) / 46);
        int var10 = class141.method1027(class26.field342, arg5, false, class271.field4820);
        int var11 = class141.method1027(class277.field4967, arg2, false, class147.field2593);
        int var12 = class141.method1027(class277.field4967, arg1, false, class147.field2593);
        int var13 = class141.method1027(class26.field342, arg4 + arg7, false, class271.field4820);
        int var14 = class141.method1027(class26.field342, -arg7 + arg5, false, class271.field4820);
        for (int var15 = var8; ~var13 < ~var15; ++var15) {
            class58.method337(var11, class76.field1406[var15], arg6, var12, false);
        }
        for (int var16 = var10; ~var14 > ~var16; --var16) {
            class58.method337(var11, class76.field1406[var16], arg6, var12, false);
        }
        int var17 = class141.method1027(class277.field4967, arg2 + arg7, false, class147.field2593);
        int var18 = class141.method1027(class277.field4967, arg1 - arg7, false, class147.field2593);
        for (int var19 = var13; ~var19 >= ~var14; ++var19) {
            int[] var20 = class76.field1406[var19];
            class58.method337(var11, var20, arg6, var17, false);
            class58.method337(var17, var20, arg3, var18, false);
            class58.method337(var18, var20, arg6, var12, false);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        if (arg1 > -83) {
            return null;
        } else {
            ++field2901;
            int[] var3 = super.field4716.method532((byte) 78, arg0);
            if (super.field4716.field1424) {
                int var4 = this.field2900 >> 1;
                int[][] var5 = super.field4716.method534(1);
                Random var6 = new Random((long) this.field2885);
                for (int var7 = 0; ~var7 > ~this.field2890; ++var7) {
                    int var8 = ~this.field2900 < -1 ? -var4 + this.field2893 + class42.method238(var6, false, this.field2900) : this.field2893;
                    int var9 = (4084 & var8) >> 4;
                    int var10 = class42.method238(var6, false, class176.field3060);
                    int var11 = class42.method238(var6, false, class67.field1231);
                    int var12 = (class124.field2200[var9] * this.field2892 >> 12) + var10;
                    int var13 = (class232.field4148[var9] * this.field2892 >> 12) + var11;
                    int var14 = -var10 + var12;
                    int var15 = -var11 + var13;
                    if (var14 != 0 || ~var15 != -1) {
                        if (var14 < 0) {
                            var14 = -var14;
                        }
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        boolean var16 = ~var14 > ~var15;
                        if (var16) {
                            int var17 = var12;
                            int var18 = var10;
                            var12 = var13;
                            var13 = var17;
                            var10 = var11;
                            var11 = var18;
                        }
                        if (~var10 < ~var12) {
                            int var19 = var10;
                            var10 = var12;
                            var12 = var19;
                            int var20 = var11;
                            var11 = var13;
                            var13 = var20;
                        }
                        int var21 = var11;
                        int var22 = var12 - var10;
                        int var23 = -var11 + var13;
                        if (var23 < 0) {
                            var23 = -var23;
                        }
                        int var24 = 1024 + -(class42.method238(var6, false, 4096) >> 2);
                        int var25 = 2048 / var22;
                        int var26 = -var22 / 2;
                        int var27 = var11 < var13 ? 1 : -1;
                        for (int var28 = var10; var28 < var12; ++var28) {
                            var26 += var23;
                            int var29 = (-var10 + var28) * var25 + 1024 + var24;
                            int var30 = var28 & class55.field910;
                            int var31 = var21 & class53.field881;
                            if (var16) {
                                var5[var31][var30] = var29;
                            } else {
                                var5[var30][var31] = var29;
                            }
                            if (~var26 < -1) {
                                var21 += var27;
                                var26 += -var22;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZLcf;)I")
    public static final int method1185(boolean arg0, class93 arg1) {
        ++field2898;
        if (!arg0) {
            return -60;
        } else if (arg1 == null) {
            return -1;
        } else {
            for (int var2 = 0; ~var2 > ~class145.field2567; ++var2) {
                if (arg1.method649(class171.field3004[var2], -4446)) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lcf;B)V")
    public static final void method1186(class93 arg0, byte arg1) {
        ++field2895;
        if (arg1 != 21) {
            field2888 = 45;
        }
        if (class285.field5109 >= 2) {
            if (arg0.method649(class284.field5097, -4446)) {
                class35.method206(true);
                for (int var2 = 0; ~var2 > -11; ++var2) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() + -var3.freeMemory()) / 1024L);
                class263.method1764(0, (byte) -116, (class93) null, class130.method949((byte) -77, new class93[] { class163.field2875, class148.method1067(arg1 + -7036, var4), class230.field4123 }));
            }
            if (arg0.method649(class204.field3686, -4446)) {
                class35.method206(true);
                for (int var5 = 0; ~var5 > -11; ++var5) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() + -var6.freeMemory()) / 1024L);
                class263.method1764(0, (byte) -116, (class93) null, class130.method949((byte) -77, new class93[] { class3.field33, class148.method1067(-7015, var7), class230.field4123 }));
                class94.method697((byte) 18);
                class35.method206(true);
                for (int var8 = 0; ~var8 > -11; ++var8) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class263.method1764(0, (byte) -116, (class93) null, class130.method949((byte) -77, new class93[] { class95.field1716, class148.method1067(-7015, var9), class230.field4123 }));
            }
            if (arg0.method649(class170.field2992, arg1 ^ -4425)) {
                class263.method1764(0, (byte) -116, (class93) null, class130.method949((byte) -77, new class93[] { class267.field4758, class148.method1067(-7015, class266.method1780((byte) -90)) }));
            }
            if (arg0.method649(class133.field2336, -4446)) {
                class256.method1738(false);
            }
            if (arg0.method649(class118.field2112, arg1 ^ -4425)) {
                class26.field345.method1401(11427);
            }
            if (arg0.method649(class231.field4131, -4446)) {
                class26.field345.method1392(-121);
            }
            if (arg0.method649(class272.field4847, -4446)) {
                class169.field2967.method1965(93);
                class92.field1625.method952(5000);
                class26.field345.method1405((byte) 118);
            }
            if (arg0.method649(class125.field2224, -4446)) {
                class157.field2791 = true;
            }
            if (arg0.method649(class4.field46, -4446)) {
                class19.method88(25, false);
            }
            if (arg0.method649(class52.field858, -4446)) {
                class43.field673 = true;
            }
            if (arg0.method649(class63.field1146, -4446)) {
                class43.field673 = false;
            }
            if (arg0.method649(class157.field2792, -4446)) {
                for (int var10 = 0; var10 < 4; ++var10) {
                    for (int var11 = 1; var11 < 103; ++var11) {
                        for (int var12 = 1; ~var12 > -104; ++var12) {
                            class148.field2605[var10].field1769[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.method664(class37.field557, 0)) {
                class91.method629(arg0.method637(arg1 ^ 33, 15).method650(-1));
                class271.method1800(class169.field2967, -2);
                class193.field3525 = false;
            }
            if (arg0.method664(class180.field3167, 0) && class106.field1843 != 0) {
                class71.method477(arg0.method637(126, 6).method650(-1), (byte) 60);
            }
            if (arg0.method649(class155.field2708, -4446)) {
                throw new RuntimeException();
            }
            if (arg0.method664(class86.field1554, 0)) {
                class26.field348 = arg0.method637(46, 12).method671(false).method650(-1);
                class263.method1764(0, (byte) -116, (class93) null, class130.method949((byte) -77, new class93[] { class185.field3412, class148.method1067(-7015, class26.field348) }));
            }
            if (arg0.method649(class199.field3613, arg1 + -4467)) {
                class252.field4546 = true;
            }
            if (arg0.method649(class252.field4537, arg1 ^ -4425)) {
                if (class148.field2612) {
                    class148.field2612 = false;
                    class263.method1764(0, (byte) -116, (class93) null, class74.field1380);
                } else {
                    class148.field2612 = true;
                    class263.method1764(0, (byte) -116, (class93) null, class131.field2324);
                }
            }
            if (arg0.method649(class168.field2961, -4446)) {
                if (class108.field1851) {
                    class8.field106.method683(-110);
                    class108.field1851 = false;
                } else {
                    class85.field1551.method683(arg1 ^ -122);
                    class108.field1851 = true;
                }
            }
        }
        class285.field5105.method1568(112, (byte) 64);
        ++class94.field1702;
        class285.field5105.method1916(-1 + arg0.method666(false), arg1 ^ 76);
        class285.field5105.method1898((byte) 121, arg0.method637(58, 2));
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IILui;B)V")
    public static final void method1187(int arg0, int arg1, class227 arg2, byte arg3) {
        if (arg2.field3840 == arg0 && ~arg0 != 0) {
            class31 var4 = class131.method964(arg0, true);
            int var5 = var4.field471;
            if (~var5 == -2) {
                arg2.field3869 = arg1;
                arg2.field3852 = 0;
                arg2.field3811 = 0;
                arg2.field3856 = 0;
                arg2.field3817 = 1;
                class55.method309(arg2.field3784, arg2.field3852, var4, arg2.field3868, -17474, false);
            }
            if (~var5 == -3) {
                arg2.field3856 = 0;
            }
        } else if (arg0 == -1 || arg2.field3840 == -1 || ~class131.method964(arg0, true).field475 <= ~class131.method964(arg2.field3840, true).field475) {
            arg2.field3785 = arg2.field3870;
            arg2.field3840 = arg0;
            arg2.field3817 = 1;
            arg2.field3856 = 0;
            arg2.field3811 = 0;
            arg2.field3869 = arg1;
            arg2.field3852 = 0;
            if (arg2.field3840 != -1) {
                class55.method309(arg2.field3784, arg2.field3852, class131.method964(arg2.field3840, true), arg2.field3868, -17474, false);
            }
        }
        ++field2884;
        if (arg3 < 105) {
            method1181((byte) 57);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V")
    public class164() {
        super(0, true);
    }
}
