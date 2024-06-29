import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class163 {

    @OriginalMember(owner = "client!ae", name = "n", descriptor = "Lwf;")
    private class88 field2393 = new class88();

    @OriginalMember(owner = "client!ae", name = "l", descriptor = "I")
    private int field2391;

    @OriginalMember(owner = "client!ae", name = "o", descriptor = "I")
    private int field2394;

    @OriginalMember(owner = "client!ae", name = "p", descriptor = "Lwa;")
    private class433 field2395;

    @OriginalMember(owner = "client!ae", name = "q", descriptor = "Lvp;")
    public static class123 field2396 = new class123();

    @OriginalMember(owner = "client!ae", name = "t", descriptor = "Lvg;")
    public static class38 field2399 = null;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
    public static int field2382;

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "I")
    public static int field2383;

    @OriginalMember(owner = "client!ae", name = "e", descriptor = "I")
    public static int field2384;

    @OriginalMember(owner = "client!ae", name = "f", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!ae", name = "g", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!ae", name = "h", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!ae", name = "i", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
    public static int field2389;

    @OriginalMember(owner = "client!ae", name = "k", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!ae", name = "r", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!ae", name = "s", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!ae", name = "u", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ae", name = "v", descriptor = "Lje;")
    public static class275 field2401;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/Object;ILvs;I)V", line = 5)
    private final void method1127(Object arg0, int arg1, class416 arg2, int arg3) {
        field2388++;
        if (this.field2391 < arg1) {
            throw new IllegalStateException("s>cs");
        }
        this.method1140(arg3 + 348731742, arg2);
        this.field2394 -= arg1;
        while (this.field2394 < 0) {
            class465 var6 = (class465) this.field2393.method511(arg3 + 348732627);
            this.method1132(83, var6);
        }
        if (arg3 != -348732512) {
            field2399 = null;
        }
        class291 var5 = new class291(arg2, arg0, arg1);
        this.field2395.method2606(var5, arg2.method2286(false), 0);
        this.field2393.method518(0, var5);
        var5.field3936 = 0L;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)I", line = 35)
    public final int method1128(int arg0) {
        if (arg0 != 3777) {
            this.method1137(74, (byte) 72);
        }
        field2389++;
        return this.field2391;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V", line = 48)
    public static void method1129(byte arg0) {
        if (arg0 != 92) {
            method1129((byte) 69);
        }
        field2401 = null;
        field2399 = null;
        field2396 = null;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BLdh;)Leg;", line = 60)
    public static final class69 method1130(byte arg0, class209 arg1) {
        int var2 = 108 / ((-arg0 - 42) / 53);
        field2384++;
        return new class69(arg1.method1447(29480), arg1.method1447(29480), arg1.method1447(29480), arg1.method1447(29480), arg1.method1458((byte) -10), arg1.method1428(32122));
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIZ)Z", line = 73)
    public static final boolean method1131(int arg0, int arg1, boolean arg2) {
        field2390++;
        return arg2 ? false : false;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILfj;)V", line = 84)
    private final void method1132(int arg0, class465 arg1) {
        if (arg1 != null) {
            arg1.method2049(-66);
            arg1.method1783((byte) -81);
            this.field2394 += arg1.field6879;
        }
        if (arg0 <= 70) {
            this.method1128(-3);
        }
        field2397++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lqa;I)V", line = 105)
    public static final void method1133(class162 arg0, int arg1) {
        if (arg1 != 0) {
            method1130((byte) 17, null);
        }
        field2392++;
        if (!(class450.field6706 >= 2 || class61.field932) || class283.field4065 != null) {
            return;
        }
        String var2;
        if (class61.field932 && class450.field6706 < 2) {
            var2 = class509.field7432 + class423.field6350.method2838(false, class143.field2137) + class187.field2779 + " ->";
        } else if (class389.field5870 && class162.field2368.method1352(81, arg1 + 119) && class450.field6706 > 2) {
            var2 = class195.method1313((byte) 126, (class118) class312.field4467.field1879.field4735.field4735);
        } else {
            class118 var3 = (class118) class312.field4467.field1879.field4735;
            var2 = class195.method1313((byte) 127, var3);
            int[] var4 = null;
            if (class208.method1398(var3.field1781, true)) {
                var4 = class294.field4196.method453(0, (int) var3.field1775).field4805;
            } else if (var3.field1779 != -1) {
                var4 = class294.field4196.method453(arg1, var3.field1779).field4805;
            } else if (class169.method1170(var3.field1781, -115)) {
                class167 var5 = class193.field2821[(int) var3.field1775];
                if (var5 != null) {
                    class342 var6 = var5.field2472;
                    if (var6.field4938 != null) {
                        var6 = var6.method2094(16, class49.field796);
                    }
                    if (var6 != null) {
                        var4 = var6.field4872;
                    }
                }
            } else if (class253.method1701(var3.field1781, (byte) -107)) {
                Object var7 = null;
                class519 var8;
                if (var3.field1781 == 1006) {
                    var8 = class252.field3743.method2686((int) var3.field1775, (byte) 103);
                } else {
                    var8 = class252.field3743.method2686((int) (var3.field1775 >>> 32 & 0x7FFFFFFFL), (byte) 107);
                }
                if (var8.field7596 != null) {
                    var8 = var8.method3067(class49.field796, -13012);
                }
                if (var8 != null) {
                    var4 = var8.field7650;
                }
            }
            if (var4 != null) {
                var2 = var2 + class474.method2833(-1, var4);
            }
        }
        if (class450.field6706 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class450.field6706 - 2) + class477.field7011.method2838(false, class143.field2137);
        }
        if (class192.field2814 != null) {
            class489 var9 = class192.field2814.method233((byte) -101, arg0);
            if (var9 == null) {
                var9 = class294.field4202;
            }
            var9.method2911(class2.field30, class304.field4293, class107.field1548, class192.field2814.field427, class192.field2814.field487, class187.field2784, class337.field4733, class192.field2814.field553, class192.field2814.field472, class142.field2124, (byte) 59, class192.field2814.field454, var2, class402.field6052, class192.field2814.field533);
            class83.method493((byte) 76, class2.field30[0], class2.field30[3], class2.field30[1], class2.field30[2]);
        } else if (class454.field6738 != null && class26.field273 == class183.field2707) {
            int var10 = class294.field4202.method2903(0, class187.field2784, 16777215, class107.field1548, class155.field2284 + 16, var2, 20579, class29.field300 + 4, class402.field6052, class337.field4733);
            class83.method493((byte) 110, class29.field300 + 4, 16, class155.field2284, var10 + field2401.method1797(false, var2));
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IBI)Z", line = 208)
    public static final boolean method1134(int arg0, byte arg1, int arg2) {
        field2381++;
        if (arg1 >= -79) {
            method1133(null, -60);
        }
        return (class102.method622(arg2, (byte) 50, arg0) | class26.method163(arg2, (byte) -95, arg0) | class146.method965(arg2, arg0, true)) & class115.method766((byte) -66, arg0, arg2);
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V", line = 220)
    public final void method1135(byte arg0) {
        if (arg0 <= -1) {
            field2385++;
            this.field2393.method512(2);
            this.field2395.method2601(-21859);
            this.field2394 = this.field2391;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIILwt;)Lmo;", line = 236)
    public static final class526 method1136(int arg0, int arg1, int arg2, class202 arg3) {
        field2400++;
        int var4 = arg3.field2921 | arg0 << 8;
        class526 var5 = (class526) class285.field4093.method145((long) var4 << 16, (byte) -11);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class297.field4228.method2944(class297.field4228.method2950(-95, var4), 112);
        if (arg1 != -3) {
            field2396 = null;
        }
        if (var6 == null) {
            int var8 = arg2 + 65536 << 8 | arg3.field2921;
            class526 var9 = (class526) class285.field4093.method145((long) var8 << 16, (byte) -11);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class297.field4228.method2944(class297.field4228.method2950(-65, var8), 95);
            if (var10 == null) {
                int var12 = arg3.field2921 | 0xFFFF00;
                class526 var13 = (class526) class285.field4093.method145((long) var12 << 16, (byte) -11);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class297.field4228.method2944(class297.field4228.method2950(-55, var12), 72);
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class526 var15 = class449.method2712(arg1 ^ 0x4BA1, var14);
                    var15.field7778 = arg3;
                    class285.field4093.method151(0, var15, (long) var12 << 16);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class526 var11 = class449.method2712(-19364, var10);
                var11.field7778 = arg3;
                class285.field4093.method151(0, var11, (long) var8 << 16);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class526 var7 = class449.method2712(-19364, var6);
            var7.field7778 = arg3;
            class285.field4093.method151(arg1 + 3, var7, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IB)V", line = 306)
    public final void method1137(int arg0, byte arg1) {
        if (class517.field7535 != null) {
            for (class465 var3 = (class465) this.field2393.method514((byte) 126); var3 != null; var3 = (class465) this.field2393.method517((byte) -119)) {
                if (var3.method554((byte) 68)) {
                    if (var3.method555(123) == null) {
                        var3.method2049(-91);
                        var3.method1783((byte) -70);
                        this.field2394 += var3.field6879;
                    }
                } else if (((long) arg0) < (++var3.field3936)) {
                    class465 var4 = class517.field7535.method1526(var3, 106);
                    this.field2395.method2606(var4, var3.field4736, 0);
                    class166.method1154(var4, var3, (byte) 87);
                    var3.method2049(-110);
                    var3.method1783((byte) -112);
                }
            }
        }
        field2382++;
        if (arg1 <= 103) {
            this.method1138(null, 54);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lvs;I)Ljava/lang/Object;", line = 353)
    public final Object method1138(class416 arg0, int arg1) {
        field2386++;
        if (arg1 < 24) {
            field2396 = null;
        }
        long var3 = arg0.method2286(false);
        for (class465 var5 = (class465) this.field2395.method2605(false, var3); var5 != null; var5 = (class465) this.field2395.method2609(-112)) {
            if (var5.field6878.method2287(arg0, 19162)) {
                Object var6 = var5.method555(127);
                if (var6 != null) {
                    if (var5.method554((byte) 68)) {
                        class291 var7 = new class291(arg0, var6, var5.field6879);
                        this.field2395.method2606(var7, var5.field4736, 0);
                        this.field2393.method518(0, var7);
                        var7.field3936 = 0L;
                        var5.method2049(-96);
                        var5.method1783((byte) -98);
                    } else {
                        this.field2393.method518(0, var5);
                        var5.field3936 = 0L;
                    }
                    return var6;
                }
                var5.method2049(-113);
                var5.method1783((byte) -80);
                this.field2394 += var5.field6879;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(I)V", line = 406)
    public final void method1139(int arg0) {
        field2380++;
        class465 var2 = (class465) this.field2393.method514((byte) 117);
        if (arg0 != 16) {
            this.field2395 = null;
        }
        while (var2 != null) {
            if (var2.method554((byte) 68)) {
                var2.method2049(arg0 - 86);
                var2.method1783((byte) -103);
                this.field2394 += var2.field6879;
            }
            var2 = (class465) this.field2393.method517((byte) -119);
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILvs;)V", line = 434)
    private final void method1140(int arg0, class416 arg1) {
        if (arg0 != -770) {
            method1134(-104, (byte) -62, 9);
        }
        field2387++;
        long var3 = arg1.method2286(false);
        for (class465 var5 = (class465) this.field2395.method2605(false, var3); var5 != null; var5 = (class465) this.field2395.method2609(arg0 + 659)) {
            if (var5.field6878.method2287(arg1, 19162)) {
                this.method1132(91, var5);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(I)I", line = 461)
    public final int method1141(int arg0) {
        field2398++;
        if (arg0 != -3) {
            this.method1141(66);
        }
        return this.field2394;
    }

    @OriginalMember(owner = "client!ae", name = "<init>", descriptor = "(I)V", line = 483)
    public class163(int arg0) {
        this.field2391 = arg0;
        this.field2394 = arg0;
        int var2;
        for (var2 = 1; (var2 + var2) < arg0; var2 += var2) {
        }
        this.field2395 = new class433(var2);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lvs;Ljava/lang/Object;I)V", line = 499)
    public final void method1142(class416 arg0, Object arg1, int arg2) {
        this.method1127(arg1, arg2, arg0, -348732512);
        field2383++;
    }
}
