import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class132 extends class447 implements class193 {

    @OriginalMember(owner = "client!ig", name = "N", descriptor = "Lbi;")
    public class282 field1874;

    @OriginalMember(owner = "client!ig", name = "G", descriptor = "Z")
    private boolean field1867;

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    public static int field1887 = 0;

    @OriginalMember(owner = "client!ig", name = "F", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!ig", name = "H", descriptor = "I")
    public static int field1868;

    @OriginalMember(owner = "client!ig", name = "I", descriptor = "I")
    public static int field1869;

    @OriginalMember(owner = "client!ig", name = "J", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!ig", name = "K", descriptor = "I")
    public static int field1871;

    @OriginalMember(owner = "client!ig", name = "L", descriptor = "I")
    public static int field1872;

    @OriginalMember(owner = "client!ig", name = "M", descriptor = "I")
    public static int field1873;

    @OriginalMember(owner = "client!ig", name = "O", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!ig", name = "P", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!ig", name = "Q", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!ig", name = "R", descriptor = "I")
    public static int field1878;

    @OriginalMember(owner = "client!ig", name = "S", descriptor = "I")
    public static int field1879;

    @OriginalMember(owner = "client!ig", name = "T", descriptor = "I")
    public static int field1880;

    @OriginalMember(owner = "client!ig", name = "U", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!ig", name = "V", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "[[[B")
    public static byte[][][] field1889;

    static {
        new class442("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBIILrr;Luo;Z)V", line = 8)
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        if (arg1 == -126) {
            ++field1872;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "(Luo;Lgm;IIIIIIIZIIIII)V", line = 19)
    public class132(class345 arg0, class64 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg4, arg6, arg7, arg8, arg10, arg11, arg12, arg13, ~arg1.field944 == -2, class1.method2(arg3, -127, arg2));
        this.field1874 = new class282(arg0, arg1, arg2, arg3, super.field6267, arg5, arg6, arg8, arg9, arg14);
        this.field1867 = ~arg1.field922 != -1 && !arg9;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILuo;)V", line = 28)
    public final void method676(int arg0, class345 arg1) {
        if (arg0 >= -58) {
            this.method691((byte) 47);
        }
        ++field1873;
        this.field1874.method1843(-90, arg1);
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZI)V", line = 41)
    public static final void method910(boolean arg0, int arg1) {
        class410.field5802 = 1000 / arg1;
        ++field1890;
        if (arg0) {
            field1871 = -119;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IB)Ljava/lang/String;", line = 58)
    public static final String method911(int arg0, byte arg1) {
        ++field1880;
        String var2 = Integer.toString(arg0);
        for (int var3 = -3 + var2.length(); ~var3 < -1; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (arg1 != -44) {
            field1871 = -125;
        }
        if (~var2.length() < -10) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class274.field3821.method2763(-113, class210.field2935) + " (" + var2 + ")</col>";
        } else {
            return ~var2.length() < -7 ? " <col=ffffff>" + var2.substring(0, -4 + var2.length()) + class357.field4887.method2763(-87, class210.field2935) + " (" + var2 + ")</col>" : " <col=ffff00>" + var2 + "</col>";
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IBI)V", line = 87)
    public static final void method912(int arg0, byte arg1, int arg2) {
        if (arg1 > -87) {
            field1871 = -107;
        }
        ++field1875;
        class239 var3 = class436.method2740(15, 0, -323285792);
        var3.method1622(48);
        var3.field3397 = arg0;
        var3.field3399 = arg2;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IILuo;I)Z", line = 102)
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field1886;
        class394 var5 = this.field1874.method1848(super.field6262, false, 65536, arg2, false, false, super.field6266);
        if (arg1 != -20759) {
            method912(3, (byte) 127, 15);
        }
        if (var5 == null) {
            return false;
        } else {
            class417 var6 = arg2.method84();
            var6.method702(super.field6262, super.field6270, super.field6266);
            return var5.method1465(arg3, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZII)V", line = 121)
    public static final void method913(boolean arg0, int arg1, int arg2) {
        ++field1878;
        class304 var3 = class356.method2281(arg1, arg0, arg2);
        if (var3 != null) {
            for (int var4 = 0; ~var3.field4198.length < ~var4; ++var4) {
                var3.field4198[var4] = -1;
                var3.field4194[var4] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)I", line = 145)
    public final int method684(int arg0) {
        if (arg0 != -13726) {
            return -58;
        } else {
            ++field1870;
            return this.field1874.field3987;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lqa;I)V", line = 158)
    public static final void method914(class134 arg0, int arg1) {
        ++field1879;
        if (class90.field1260 < 400) {
            if (class412.field5841 != arg0) {
                String var2;
                if (arg0.field1929 != 0) {
                    var2 = arg0.method931((byte) -128, true) + " (" + class405.field5757.method2763(-79, class210.field2935) + arg0.field1929 + ")";
                } else {
                    boolean var3 = true;
                    if (~class412.field5841.field1955 != 0 && arg0.field1955 != -1) {
                        int var4 = ~arg0.field1946 > ~class412.field5841.field1946 ? class412.field5841.field1946 : arg0.field1946;
                        int var5 = ~class412.field5841.field1955 <= ~arg0.field1955 ? arg0.field1955 : class412.field5841.field1955;
                        int var6 = 5 - -(var4 * 10 / 100) + var5;
                        int var7 = class412.field5841.field1946 - arg0.field1946;
                        if (~var7 > -1) {
                            var7 = -var7;
                        }
                        if (var6 < var7) {
                            var3 = false;
                        }
                    }
                    String var8 = class129.field1827 == 1 ? class329.field4564.method2763(99, class210.field2935) : class239.field3394.method2763(114, class210.field2935);
                    if (arg0.field1928 <= arg0.field1946) {
                        var2 = arg0.method931((byte) -127, true) + (var3 ? class188.method1221(-114, arg0.field1946, class412.field5841.field1946) : "<col=ffffff>") + " (" + var8 + arg0.field1946 + ")";
                    } else {
                        var2 = arg0.method931((byte) -126, true) + (!var3 ? "<col=ffffff>" : class188.method1221(-104, arg0.field1946, class412.field5841.field1946)) + " (" + var8 + arg0.field1946 + "+" + (-arg0.field1946 + arg0.field1928) + ")";
                    }
                }
                if (class327.field4511) {
                    if ((8 & class319.field4354) != 0) {
                        class66.method514(0, 0, 19, class416.field5913 + " -> <col=ffffff>" + var2, (byte) -16, class92.field1289, (long) arg0.field5294, class249.field3519);
                        ++class57.field782;
                    }
                } else {
                    for (int var9 = 7; var9 >= 0; --var9) {
                        if (class223.field3127[var9] != null) {
                            short var11 = 0;
                            if (~class129.field1827 == -1 && class223.field3127[var9].equalsIgnoreCase(class212.field2956.method2763(arg1 + -19087, class210.field2935))) {
                                if (~class412.field5841.field1946 > ~arg0.field1946) {
                                    var11 = 2000;
                                }
                                if (class412.field5841.field1957 != 0 && arg0.field1957 != 0) {
                                    if (~class412.field5841.field1957 != ~arg0.field1957) {
                                        var11 = 0;
                                    } else {
                                        var11 = 2000;
                                    }
                                }
                            } else if (class106.field1460[var9]) {
                                var11 = 2000;
                            }
                            short var12 = (short) (class378.field5400[var9] + var11);
                            int var13 = ~class312.field4274[var9] != 0 ? class312.field4274[var9] : class341.field4666;
                            class66.method514(0, 0, var12, "<col=ffffff>" + var2, (byte) -16, var13, (long) arg0.field5294, class223.field3127[var9]);
                            ++class66.field991;
                        }
                    }
                }
                for (class87 var10 = (class87) class121.field1699.method646(48); var10 != null; var10 = (class87) class121.field1699.method641(false)) {
                    if (~var10.field1217 == -24) {
                        var10.field1220 = "<col=ffffff>" + var2;
                        break;
                    }
                }
                if (arg1 != 18989) {
                    method914((class134) null, 66);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILuo;I)Lmj;", line = 281)
    public final class394 method685(int arg0, class345 arg1, int arg2) {
        if (arg2 != -9380) {
            return null;
        } else {
            ++field1888;
            return this.field1874.method1848(0, false, arg0, arg1, false, false, 0);
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V", line = 294)
    public final void method680(int arg0) {
        if (arg0 != -24686) {
            this.field1874 = null;
        }
        ++field1869;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(B)Z", line = 304)
    public final boolean method683(byte arg0) {
        ++field1883;
        int var2 = -112 / ((arg0 - 47) / 47);
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "(B)I", line = 314)
    public final int method915(byte arg0) {
        ++field1868;
        int var2 = 111 / ((34 - arg0) / 56);
        return this.field1874.method1847(-12458);
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(B)V", line = 324)
    public final void method674(byte arg0) {
        if (arg0 == -1) {
            ++field1884;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)I", line = 336)
    public final int method689(byte arg0) {
        if (arg0 != -83) {
            this.method685(-89, (class345) null, 73);
        }
        ++field1885;
        return this.field1874.field3962;
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(B)Z", line = 347)
    public final boolean method691(byte arg0) {
        if (arg0 != -72) {
            return true;
        } else {
            ++field1866;
            return this.field1874.method1840(true);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ZLuo;)Laj;", line = 358)
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field1876;
        class394 var3 = this.field1874.method1848(super.field6262, true, 1024, arg1, !arg0, false, super.field6266);
        if (var3 == null) {
            return null;
        } else {
            class417 var4 = arg1.method84();
            var4.method702(super.field6262, super.field6270, super.field6266);
            class170 var5 = null;
            if (this.field1867) {
                var5 = class175.method1152((byte) 72, 1);
            }
            if (this.field1874.field3956 != null) {
                class77 var6 = this.field1874.field3956.method2017();
                arg1.method72(var3, var6, var4, var5 != null ? var5.field2333[0] : null, 0);
            } else {
                var3.method1416(var4, var5 != null ? var5.field2333[0] : null, 0);
            }
            this.field1874.method1850(arg0, -126, super.field6261, super.field6264, arg1, super.field6272, super.field6258, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "(B)V", line = 392)
    public static void method916(byte arg0) {
        if (arg0 == 1) {
            field1889 = null;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Luo;I)V", line = 404)
    public final void method677(class345 arg0, int arg1) {
        if (arg1 <= 33) {
            this.method674((byte) 46);
        }
        ++field1882;
        this.field1874.method1849(true, arg0);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(Luo;I)V", line = 415)
    public final void method678(class345 arg0, int arg1) {
        ++field1877;
        class394 var3 = this.field1874.method1848(super.field6262, true, 131072, arg0, false, true, super.field6266);
        if (arg1 != -22948) {
            this.method678((class345) null, -64);
        }
        if (var3 != null) {
            this.field1874.method1850(false, -126, super.field6261, super.field6264, arg0, super.field6272, super.field6258, var3);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)I", line = 433)
    public final int method672(int arg0) {
        ++field1881;
        if (arg0 != 17011) {
            this.method675(63, 83, (class345) null, -88);
        }
        return this.field1874.field3993;
    }
}
