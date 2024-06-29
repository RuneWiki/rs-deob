import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class93 extends class157 {

    @OriginalMember(owner = "client!sf", name = "R", descriptor = "I")
    private int field1837 = 0;

    @OriginalMember(owner = "client!sf", name = "U", descriptor = "I")
    private int field1840 = 1365;

    @OriginalMember(owner = "client!sf", name = "Y", descriptor = "I")
    private int field1844 = 0;

    @OriginalMember(owner = "client!sf", name = "ab", descriptor = "I")
    private int field1846 = 20;

    @OriginalMember(owner = "client!sf", name = "Q", descriptor = "I")
    public static int field1836 = 0;

    @OriginalMember(owner = "client!sf", name = "Z", descriptor = "I")
    public static int field1845 = 0;

    @OriginalMember(owner = "client!sf", name = "V", descriptor = "Lcc;")
    public static class209 field1841 = null;

    @OriginalMember(owner = "client!sf", name = "X", descriptor = "Lcc;")
    private static class209 field1843 = class95.method669(121, "Continue");

    @OriginalMember(owner = "client!sf", name = "O", descriptor = "Lcc;")
    public static class209 field1834 = field1843;

    @OriginalMember(owner = "client!sf", name = "eb", descriptor = "[I")
    public static int[] field1850 = new int[] { 4, 4, 1, 2, 6, 4, 2, 49, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!sf", name = "cb", descriptor = "Lla;")
    public static class95 field1848 = new class95(5);

    @OriginalMember(owner = "client!sf", name = "fb", descriptor = "Lcc;")
    private static class209 field1851 = class95.method669(104, "Ok");

    @OriginalMember(owner = "client!sf", name = "gb", descriptor = "Lcc;")
    public static class209 field1852 = field1851;

    @OriginalMember(owner = "client!sf", name = "N", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!sf", name = "P", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!sf", name = "S", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!sf", name = "T", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!sf", name = "W", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!sf", name = "db", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!sf", name = "bb", descriptor = "Lsj;")
    public static class49 field1847;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBLtf;)V")
    public final void method1(int arg0, byte arg1, class106 arg2) {
        if (arg1 < -29) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (arg0 == 3) {
                            this.field1844 = arg2.method736(123);
                        }
                    } else {
                        this.field1837 = arg2.method736(124);
                    }
                } else {
                    this.field1846 = arg2.method736(122);
                }
            } else {
                this.field1840 = arg2.method736(123);
            }
            ++field1849;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method649(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg4 < 89) {
            field1850 = null;
        }
        ++field1838;
        if (~arg2 <= ~class262.field4723 && class230.field4184 >= arg2 && arg7 >= class262.field4723 && arg7 <= class230.field4184 && ~arg9 <= ~class262.field4723 && ~class230.field4184 <= ~arg9 && class262.field4723 <= arg1 && ~class230.field4184 <= ~arg1 && class102.field1957 <= arg6 && arg6 <= class155.field2847 && class102.field1957 <= arg0 && arg0 <= class155.field2847 && ~arg8 <= ~class102.field1957 && class155.field2847 >= arg8 && ~arg5 <= ~class102.field1957 && ~class155.field2847 <= ~arg5) {
            class256.method1769(arg7, arg3, arg5, arg2, arg0, arg8, arg9, (byte) 124, arg6, arg1);
        } else {
            class85.method608(arg9, arg1, arg6, arg5, -100, arg8, arg3, arg2, arg0, arg7);
        }
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)V")
    public static final void method650(byte arg0) {
        ++field1833;
        class244.field4423 = 0;
        class74.field1396 = 0;
        class198.method1354((byte) 99);
        class95.method663((byte) -91);
        if (arg0 > -20) {
            field1850 = null;
        }
        class37.method280(17356);
        for (int var1 = 0; ~class74.field1396 < ~var1; ++var1) {
            int var3 = class110.field2229[var1];
            if (~class163.field2968 != ~class60.field1207[var3].field1512) {
                if (class60.field1207[var3].field2969.method1644((byte) 111)) {
                    class7.method74(-119, class60.field1207[var3]);
                }
                class60.field1207[var3].method1127(-71, (class237) null);
                class60.field1207[var3] = null;
            }
        }
        if (~class112.field2253 != ~client.field2818.field2085) {
            throw new RuntimeException("gnp1 pos:" + client.field2818.field2085 + " psize:" + class112.field2253);
        } else {
            for (int var2 = 0; ~var2 > ~class219.field3996; ++var2) {
                if (class60.field1207[class249.field4492[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class219.field3996);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
    public class93() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Ltf;Z)V")
    public static final void method651(class106 arg0, boolean arg1) {
        ++field1839;
        if (!arg1) {
            method649(0, 120, -25, -80, (byte) -81, 120, -82, -43, 74, -31);
        }
        while (true) {
            while (~arg0.field2085 > ~arg0.field2108.length) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg0.method774((byte) 104) == 1) {
                    var2 = arg0.method774((byte) 97);
                    var4 = true;
                    var3 = arg0.method774((byte) 100);
                }
                int var5 = arg0.method774((byte) 116);
                int var6 = arg0.method774((byte) 118);
                int var7 = class98.field1921 - var6 * 64 + -1 + class224.field4082;
                int var8 = var5 * 64 + -class38.field654;
                if (~var8 <= -1 && ~(var7 + -63) <= -1 && ~class59.field1194 < ~(var8 + 63) && class98.field1921 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var4 || ~var11 <= ~(var2 * 8) && ~(var2 * 8 + 8) < ~var11 && ~(var3 * 8) >= ~var12 && ~(var3 * 8 + 8) < ~var12) {
                                byte var13 = arg0.method777(104);
                                if (var13 != 0) {
                                    if (class234.field4213[var9][var10] == null) {
                                        class234.field4213[var9][var10] = new byte[4096];
                                    }
                                    class234.field4213[var9][var10][(-var12 + 63 << 6) - -var11] = var13;
                                    byte var14 = arg0.method777(93);
                                    if (class181.field3264[var9][var10] == null) {
                                        class181.field3264[var9][var10] = new byte[4096];
                                    }
                                    class181.field3264[var9][var10][(-var12 + 63 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; ~var15 > ~(var4 ? 64 : 4096); ++var15) {
                        byte var16 = arg0.method777(91);
                        if (var16 != 0) {
                            ++arg0.field2085;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BI)[I")
    public final int[] method4(byte arg0, int arg1) {
        if (arg0 != -98) {
            field1841 = null;
        }
        ++field1835;
        int[] var3 = super.field2879.method1269(arg1, 17885);
        if (super.field2879.field3363) {
            for (int var4 = 0; ~class226.field4124 < ~var4; ++var4) {
                int var5 = (class50.field987[var4] << 12) / this.field1840 + this.field1837;
                int var6 = var5;
                int var7 = (class129.field2479[arg1] << 12) / this.field1840 + this.field1844;
                int var8 = var7;
                int var9 = var7;
                int var10 = var5 * var5 >> 12;
                int var11 = var5;
                int var12 = var7 * var7 >> 12;
                int var13 = 0;
                while (var10 + var12 < 16384 && ~this.field1846 < ~var13) {
                    var9 = (var9 * var11 >> 12) * 2 + var8;
                    ++var13;
                    var11 = var6 + var10 + -var12;
                    var12 = var9 * var9 >> 12;
                    var10 = var11 * var11 >> 12;
                }
                var3[var4] = ~(this.field1846 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field1846;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "(I)V")
    public static final void method652(int arg0) {
        ++field1842;
        if (!class186.method1273(71) && class99.field1937 != class167.field3005) {
            class44.method331(class223.field4069.field1567[0], class223.field4069.field1548[0], class220.field4005, class31.field568, (byte) -123, class99.field1937, false);
        } else {
            if (~class99.field1937 != ~class25.field471) {
                class25.field471 = class99.field1937;
                class2.method8(0, class99.field1937);
                class230.method1609(arg0 ^ -6099);
            }
            if (arg0 != 0) {
                method651((class106) null, true);
            }
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)V")
    public static void method653(boolean arg0) {
        field1852 = null;
        field1848 = null;
        field1843 = null;
        if (!arg0) {
            method652(-75);
        }
        field1841 = null;
        field1850 = null;
        field1834 = null;
        field1847 = null;
        field1851 = null;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)V")
    public static final void method654(boolean arg0) {
        if (arg0) {
            class106.field2089 = class22.field412;
            class271.field4803 = class284.field4996;
        } else {
            class106.field2089 = class48.field926;
            class271.field4803 = class38.field656;
        }
        class50.field983 = class106.field2089.length;
    }
}
