import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class259 extends class188 {

    @OriginalMember(owner = "client!qm", name = "u", descriptor = "Ljava/lang/String;")
    public static String field4096 = "Allocated memory";

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public static int field4090;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field4092;

    @OriginalMember(owner = "client!qm", name = "s", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!qm", name = "t", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!qm", name = "v", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "J")
    public long field4086;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "Lnk;")
    public static class16 field4088;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "Lqm;")
    public class259 field4089;

    @OriginalMember(owner = "client!qm", name = "w", descriptor = "Lqm;")
    public class259 field4098;

    @OriginalMember(owner = "client!qm", name = "y", descriptor = "Lhi;")
    public static class323 field4100;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "[I")
    public static int[] field4093;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)Ljc;", line = 6)
    public static final class328 method1822(int arg0, int arg1) {
        field4091++;
        class328 var2 = (class328) class19.field229.method1998(-1114531641, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class344.field5465.method100(1, arg1, (byte) -107);
        } else {
            var3 = class303.field4728.method100(1, arg1 & 0x7FFF, (byte) -107);
        }
        if (arg0 != 128) {
            return (class328) null;
        }
        class328 var4 = new class328();
        if (var3 != null) {
            var4.method2281(new class143(var3), 80);
        }
        if (arg1 >= 32768) {
            var4.method2288(1);
        }
        class19.field229.method2000(var4, (byte) 100, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(I)Z", line = 39)
    public final boolean method1823(int arg0) {
        field4092++;
        if (this.field4089 == null) {
            return false;
        } else {
            if (arg0 != 32767) {
                field4100 = (class323) null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "(I)V", line = 53)
    public static final void method1824(int arg0) {
        class107.method693(class147.field2341, arg0 ^ 0x6BF2);
        field4087++;
        class253.field4003++;
        if (class334.field5337 && class205.field3110) {
            int var1 = class197.field3009;
            int var2 = var1 - class247.field3928;
            if (var2 < class360.field5703) {
                var2 = class360.field5703;
            }
            if (class360.field5703 + class67.field838.field5169 < var2 - -class147.field2341.field5169) {
                var2 = class360.field5703 + class67.field838.field5169 - class147.field2341.field5169;
            }
            int var3 = var2 - class162.field2488;
            if (arg0 != 27636) {
                field4100 = (class323) null;
            }
            int var4 = class128.field1873;
            int var5 = class67.field838.field5142 + var2 - class360.field5703;
            int var6 = class147.field2341.field5127;
            int var7 = var4 - class85.field1120;
            if (var7 < class35.field402) {
                var7 = class35.field402;
            }
            if ((class35.field402 + class67.field838.field5174) < (class147.field2341.field5174 + var7)) {
                var7 = class35.field402 + class67.field838.field5174 - class147.field2341.field5174;
            }
            int var8 = var7 + class67.field838.field5188 - class35.field402;
            int var9 = var7 - class78.field1015;
            if (class253.field4003 > class147.field2341.field5155 && (var6 < var3 || (-var6) > var3 || var6 < var9 || -var6 > var9)) {
                class214.field3245 = true;
            }
            if (class147.field2341.field5120 != null && class214.field3245) {
                class185 var10 = new class185();
                var10.field2785 = var5;
                var10.field2780 = var8;
                var10.field2793 = class147.field2341;
                var10.field2789 = class147.field2341.field5120;
                class208.method1456(-7155, var10);
            }
            if (class312.field4891 == 0) {
                if (class214.field3245) {
                    if (class147.field2341.field5024 != null) {
                        class185 var11 = new class185();
                        var11.field2791 = class148.field2353;
                        var11.field2793 = class147.field2341;
                        var11.field2789 = class147.field2341.field5024;
                        var11.field2785 = var5;
                        var11.field2780 = var8;
                        class208.method1456(arg0 ^ 0xFFFF8FF9, var11);
                    }
                    if (class148.field2353 != null && client.method2016(class147.field2341) != null) {
                        class238.field3662++;
                        class328.field5282.method304(217, 19830);
                        class328.field5282.method1016(101, class148.field2353.field5073);
                        class328.field5282.method1003(class148.field2353.field5112, -2);
                        class328.field5282.method1007(384539480, class147.field2341.field5073);
                        class328.field5282.method1006(arg0 ^ 0xFFFF946C, class147.field2341.field5112);
                    }
                } else if ((class52.field602 == 1 || class89.method562(14, class74.field924 - 1)) && class74.field924 > 2) {
                    class92.method573(-1);
                } else if (class74.field924 > 0) {
                    class65.method393(-29);
                }
                class147.field2341 = null;
            }
        } else if (class253.field4003 > 1) {
            class147.field2341 = null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(B)V", line = 177)
    public static void method1825(byte arg0) {
        field4093 = null;
        field4096 = null;
        field4100 = null;
        if (arg0 != -55) {
            method1828(118, 61, (byte) 76, -127, -6);
        }
        field4088 = null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIZI)V", line = 190)
    public static final void method1826(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        int var9 = arg2 + 1;
        class278.method1986(arg3, class347.field5501[arg2], arg5, arg1, (byte) 76);
        field4090++;
        int var8 = arg0 - 1;
        class278.method1986(arg3, class347.field5501[arg0], arg5, arg1, (byte) 41);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class347.field5501[var6];
            var7[arg3] = var7[arg1] = arg5;
        }
        if (!arg4) {
            field4096 = (String) null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZIIIIII)V", line = 221)
    public static final void method1827(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != 7209) {
            return;
        }
        class163.field2516 = arg6;
        field4099++;
        class11.field118 = arg2;
        class55.field658 = arg1;
        class93.field1222 = arg3;
        class222.field3359 = arg5;
        if (arg0 && class55.field658 >= 100) {
            class280.field4415 = class93.field1222 * 128 + 64;
            class10.field96 = class11.field118 * 128 + 64;
            class119.field1657 = class14.method80(class280.field4415, class219.field3290, class10.field96, (byte) -126) - class163.field2516;
        }
        class120.field1667 = 2;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIBII)V", line = 253)
    public static final void method1828(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4094++;
        if (arg3 >= class244.field3844 && arg3 <= class2.field22) {
            int var5 = class112.method728(arg1, class337.field5389, class344.field5460, -115);
            int var6 = class112.method728(arg0, class337.field5389, class344.field5460, arg2 ^ 0xFFFFFF93);
            class42.method259(var6, arg4, 929588991, var5, arg3);
        }
        if (arg2 != 18) {
            field4100 = (class323) null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "(B)V", line = 270)
    public final void method1829(byte arg0) {
        field4097++;
        if (this.field4089 == null) {
            return;
        }
        this.field4089.field4098 = this.field4098;
        this.field4098.field4089 = this.field4089;
        if (arg0 != -74) {
            method1830(109, -2);
        }
        this.field4089 = null;
        this.field4098 = null;
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(II)V", line = 292)
    public static final void method1830(int arg0, int arg1) {
        if (arg0 < -31) {
            field4095++;
            class279 var2 = class147.method1085(arg1, -19443, 6);
            var2.method1996(true);
        }
    }
}
