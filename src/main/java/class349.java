import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class349 extends class309 {

    @OriginalMember(owner = "client!h", name = "xc", descriptor = "I")
    public int field5320 = -1;

    @OriginalMember(owner = "client!h", name = "Dc", descriptor = "I")
    public int field5326 = -1;

    @OriginalMember(owner = "client!h", name = "qc", descriptor = "Lje;")
    public static class178 field5313 = null;

    @OriginalMember(owner = "client!h", name = "nc", descriptor = "I")
    public static int field5310;

    @OriginalMember(owner = "client!h", name = "oc", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!h", name = "pc", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!h", name = "rc", descriptor = "I")
    public static int field5314;

    @OriginalMember(owner = "client!h", name = "sc", descriptor = "I")
    public static int field5315;

    @OriginalMember(owner = "client!h", name = "tc", descriptor = "I")
    public static int field5316;

    @OriginalMember(owner = "client!h", name = "uc", descriptor = "I")
    public static int field5317;

    @OriginalMember(owner = "client!h", name = "vc", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!h", name = "wc", descriptor = "I")
    public static int field5319;

    @OriginalMember(owner = "client!h", name = "yc", descriptor = "I")
    public static int field5321;

    @OriginalMember(owner = "client!h", name = "zc", descriptor = "I")
    public static int field5322;

    @OriginalMember(owner = "client!h", name = "Ac", descriptor = "I")
    public static int field5323;

    @OriginalMember(owner = "client!h", name = "Cc", descriptor = "I")
    public static int field5325;

    @OriginalMember(owner = "client!h", name = "Ec", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!h", name = "Fc", descriptor = "I")
    public static int field5328;

    @OriginalMember(owner = "client!h", name = "Hc", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!h", name = "Ic", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!h", name = "Jc", descriptor = "I")
    public static int field5332;

    @OriginalMember(owner = "client!h", name = "mc", descriptor = "Ldr;")
    public class273 field5309;

    @OriginalMember(owner = "client!h", name = "Bc", descriptor = "Ldp;")
    public static class319 field5324;

    @OriginalMember(owner = "client!h", name = "Gc", descriptor = "[I")
    public static int[] field5329;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILtq;)V", line = 3)
    public final void method260(int arg0, class63 arg1) {
        ++field5332;
        if (arg0 != 0) {
            field5313 = null;
        }
        if (this.field5309 != null) {
            if (super.field4669 || this.method2150(arg0 + -1, arg1, 0)) {
                this.method1920(super.field4669, arg1, 85, super.field4668);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "(I)Z", line = 25)
    public final boolean method2147(int arg0) {
        if (arg0 != 0) {
            this.method1692(30);
        }
        ++field5318;
        return this.field5309 != null;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)I", line = 39)
    public final int method899(int arg0) {
        ++field5330;
        return arg0 != 0 ? 99 : super.field4591;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ltq;III)Z", line = 51)
    public final boolean method259(class63 arg0, int arg1, int arg2, int arg3) {
        ++field5314;
        if (this.field5309 != null && this.method2150(-1, arg0, 65536)) {
            class315 var5 = arg0.method565();
            int var6 = super.field4611.method2743(true);
            var5.method486(var6);
            int var7 = -99 % ((arg2 - -59) / 58);
            var5.method478(super.field4543, super.field4554, super.field4538);
            for (int var8 = 0; ~var8 > ~super.field4668.length; ++var8) {
                if (super.field4668[var8] != null && super.field4668[var8].method423(arg1, arg3, var5, this.field5309.field4147 == 1)) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(I)V", line = 81)
    public final void method249(int arg0) {
        ++field5315;
        if (arg0 > 56) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(I)I", line = 93)
    public final int method1692(int arg0) {
        if (arg0 < 96) {
            this.method2148((byte) 51);
        }
        ++field5321;
        if (this.field5309.field4107 != null) {
            class273 var2 = this.field5309.method1781(class315.field4736, true);
            if (var2 != null && ~var2.field4163 != 0) {
                return var2.field4163;
            }
        }
        return this.field5309.field4163;
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(B)Z", line = 115)
    private final boolean method2148(byte arg0) {
        if (arg0 >= -10) {
            this.field5309 = null;
        }
        ++field5312;
        return this.field5309.field4118;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(B)[Lsh;", line = 128)
    public static final class472[] method2149(byte arg0) {
        ++field5327;
        return arg0 != -100 ? null : new class472[] { class147.field2098, class198.field2982, class178.field2666, class103.field1438, class400.field5835, class51.field740, class2.field23, class298.field4461, class169.field2405, class147.field2088, class401.field5862, class163.field2263, class333.field4976, class204.field3104, class321.field4795, class287.field4391, class346.field5277, class403.field5879, class352.field5359, class230.field3386, class436.field6175, class244.field3497, class355.field5380, class97.field1398, class304.field4529, class303.field4511, class48.field695, class65.field901, class13.field189, class307.field4589, class3.field73, class65.field900, class109.field1548, class1.field9, class480.field6766, class29.field393, class286.field4364, class212.field3202, class441.field6236, class486.field6834, class96.field1386, class270.field3990, class382.field5656, class464.field6542, class40.field563, class350.field5333, class40.field564, class419.field6023, class439.field6201, class297.field4449, class370.field5571, class199.field3002, class395.field5813, class85.field1220, class92.field1280, class115.field1603, class298.field4455, class119.field1654, class140.field2007, class322.field4842, class36.field469, class426.field6084, class340.field5099, class220.field3248, class237.field3460, class65.field899, class49.field722, class252.field3626, class198.field2993, class182.field2700, class13.field193, class275.field4179, class408.field5920, class469.field6590, class472.field6613, class346.field5289, class3.field74, class48.field692, class208.field3143, class43.field596, class409.field5925, class422.field6042, class365.field5518, class29.field378, class280.field4234, class110.field1560, class394.field5800, class187.field2844, class380.field5647, class70.field947, class53.field755, class227.field3328, class161.field2224, class191.field2925, class182.field2696, class294.field4425, class200.field3026, class233.field3408, class340.field5101, class351.field5347, class157.field2188, class416.field5995, class464.field6544, class431.field6130, class116.field1622, class244.field3495 };
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILtq;I)Z", line = 139)
    private final boolean method2150(int arg0, class63 arg1, int arg2) {
        ++field5322;
        int var4 = arg2;
        class322 var5 = this.method1917(0);
        class356 var6 = super.field4612 != -1 && ~super.field4601 == -1 ? class170.field2423.method1586(super.field4612, (byte) 36) : null;
        class356 var7 = super.field4620 == -1 || super.field4663 && var6 != null ? null : class170.field2423.method1586(super.field4620, (byte) 36);
        int var8 = var5.field4835;
        int var9 = var5.field4803;
        if (~var8 != arg0 || var9 != 0 || ~var5.field4804 != -1 || var5.field4808 != 0) {
            arg2 |= 7;
        }
        class57 var10 = super.field4668[0] = this.field5309.method1778(arg1, class170.field2423, super.field4604, super.field4636, super.field4600, class315.field4736, super.field4662, super.field4649, var6, super.field4610, 16384, var7, super.field4603, arg2, class297.field4454);
        if (var10 == null) {
            return false;
        } else {
            super.field4591 = var10.method400();
            this.method1922(var10, (byte) 108);
            int var11 = super.field4611.method2743(true);
            super.field4661 = 0;
            super.field4651 = 0;
            super.field4632 = 0;
            if (var8 == 0 && var9 == 0) {
                this.method1921(var11, this.method1705((byte) 65) << 7, (byte) 123, this.method1705((byte) 65) << 7);
            } else {
                this.method1921(var11, var8, (byte) 123, var9);
                if (~super.field4651 != -1) {
                    super.field4668[0].method421(super.field4651);
                }
                if (~super.field4661 != -1) {
                    super.field4668[0].method419(super.field4661);
                }
                if (super.field4632 != 0) {
                    super.field4668[0].method407(0, super.field4632, 0);
                }
            }
            super.field4668[1] = null;
            if (~super.field4618 != 0 && ~super.field4659 != 0) {
                class188 var12 = class322.field4848.method951(super.field4618, (byte) 74);
                class57 var13 = var12.method1296((!var12.field2874 ? 2 : 7) | var4, arg1, super.field4659, super.field4608, super.field4658, -104, class170.field2423);
                if (var13 != null) {
                    var13.method407(0, -super.field4633, 0);
                    if (var12.field2874 && (var8 != 0 || var9 != 0)) {
                        if (~super.field4651 != -1) {
                            var13.method421(super.field4651);
                        }
                        if (~super.field4661 != -1) {
                            var13.method419(super.field4661);
                        }
                        if (super.field4632 != 0) {
                            var13.method407(0, super.field4632, 0);
                        }
                    }
                    super.field4668[1] = var13;
                }
            }
            super.field4668[2] = null;
            if (super.field4671 != null) {
                if (~class452.field6418 > ~super.field4671.field881) {
                    if (~class452.field6418 <= ~super.field4671.field883) {
                        class57 var14 = super.field4671.method593(arg1, var4 | 7, true);
                        if (var14 != null) {
                            var14.method407(-super.field4543 + super.field4671.field880, -super.field4554 + super.field4671.field874, -super.field4538 + super.field4671.field872);
                            if (var11 != 0) {
                                var14.method444(var11);
                            }
                            super.field4668[2] = var14;
                        }
                    }
                } else {
                    super.field4671 = null;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!h", name = "l", descriptor = "(I)V", line = 252)
    public static void method2151(int arg0) {
        if (arg0 != 0) {
            method2149((byte) -107);
        }
        field5313 = null;
        field5324 = null;
        field5329 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)V", line = 265)
    public static final void method2152(byte arg0, int arg1) {
        int var2 = -26 % ((arg0 - -54) / 47);
        ++field5323;
        class186 var3 = class275.method1789(arg1, (byte) 123, 14);
        var3.method1279((byte) -65);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BZLtq;Lhm;III)V", line = 278)
    public final void method245(byte arg0, boolean arg1, class63 arg2, class352 arg3, int arg4, int arg5, int arg6) {
        if (arg0 <= -41) {
            ++field5311;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(Ltq;I)Lcj;", line = 296)
    public final class123 method252(class63 arg0, int arg1) {
        ++field5317;
        if (this.field5309 != null && this.method2150(-1, arg0, 1024)) {
            class315 var3 = arg0.method565();
            int var4 = super.field4611.method2743(true);
            var3.method486(var4);
            var3.method478(super.field4543, super.field4554, super.field4538);
            class322 var5 = this.method1917(0);
            class273 var6 = this.field5309.field4107 != null ? this.field5309.method1781(class315.field4736, true) : this.field5309;
            if (class337.field5038.field3938 && var6.field4154 && var5.field4827) {
                class356 var7 = ~super.field4612 != 0 && super.field4601 == 0 ? class170.field2423.method1586(super.field4612, (byte) 36) : null;
                class356 var8 = ~super.field4620 == 0 || super.field4663 && var7 != null ? null : class170.field2423.method1586(super.field4620, (byte) 36);
                class57 var9 = class400.method2391(var4, super.field4668[0], arg0, super.field4651, (byte) -109, 65535 & this.field5309.field4156, this.field5309.field4141 & 255, var8 != null ? super.field4610 : super.field4600, super.field4629, super.field4632, var8 == null ? var7 : var8, super.field4661, this.field5309.field4133 & 65535, this.field5309.field4147, this.field5309.field4098 & 255);
                if (var9 != null) {
                    float var10 = arg0.method525();
                    float var11 = arg0.method520();
                    arg0.method494(false);
                    arg0.method501(var10, var11 - 150.0F);
                    var9.method404(var3, (class117) null, 0);
                    arg0.method501(var10, var11);
                    arg0.method494(true);
                }
            }
            class123 var12 = null;
            if (this.method2148((byte) -36)) {
                var12 = class225.method1462(super.field4668.length, -34);
            }
            if (super.field4676 == null) {
                arg0.method557(super.field4668, var3, var12 == null ? null : var12.field1695, 0);
            } else {
                class268 var13 = super.field4676.method459();
                arg0.method503(super.field4668, var13, var3, var12 != null ? var12.field1695 : null, 0);
            }
            this.method1920(false, arg0, 87, super.field4668);
            if (super.field4668[arg1] != null) {
                if (~var4 != -1) {
                    super.field4668[2].method444(var4);
                }
                super.field4668[2].method407(super.field4543 - super.field4671.field880, -super.field4671.field874 + super.field4554, -super.field4671.field872 + super.field4538);
            }
            super.field4653 = class281.field4249;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(III)V", line = 373)
    public final void method2153(int arg0, int arg1, int arg2) {
        ++field5325;
        int var4 = super.field4675[0];
        int var5 = super.field4674[0];
        if (~arg2 == -1) {
            ++var5;
        }
        if (arg2 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg2 == -3) {
            ++var4;
        }
        if (arg2 == 3) {
            ++var4;
            --var5;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (~arg2 == -6) {
            --var5;
            --var4;
        }
        if (~arg2 == -7) {
            --var4;
        }
        if (~arg2 == -8) {
            ++var5;
            --var4;
        }
        if (super.field4612 != -1 && ~class170.field2423.method1586(super.field4612, (byte) 36).field5418 == -2) {
            super.field4612 = -1;
        }
        if (arg0 == -2) {
            if (super.field4618 != -1) {
                class188 var6 = class322.field4848.method951(super.field4618, (byte) 64);
                if (var6.field2861 && var6.field2862 != -1 && ~class170.field2423.method1586(var6.field2862, (byte) 36).field5418 == -2) {
                    super.field4618 = -1;
                }
            }
            if (~super.field4678 > -10) {
                ++super.field4678;
            }
            for (int var7 = super.field4678; ~var7 < -1; --var7) {
                super.field4675[var7] = super.field4675[var7 + -1];
                super.field4674[var7] = super.field4674[var7 + -1];
                super.field4672[var7] = super.field4672[var7 + -1];
            }
            super.field4675[0] = var4;
            super.field4674[0] = var5;
            super.field4672[0] = (byte) arg1;
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Ldr;B)V", line = 456)
    public final void method2154(class273 arg0, byte arg1) {
        if (arg1 != 48) {
            field5324 = null;
        }
        ++field5310;
        this.field5309 = arg0;
        if (super.field4676 != null) {
            super.field4676.method458();
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(I)Z", line = 471)
    public final boolean method253(int arg0) {
        if (arg0 > -9) {
            this.method2155(21, -101, 7, -58, true, 75);
        }
        ++field5331;
        return false;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIZI)V", line = 482)
    public final void method2155(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        ++field5316;
        super.field4545 = (byte) arg0;
        if (super.field4612 != -1 && class170.field2423.method1586(super.field4612, (byte) 36).field5418 == 1) {
            super.field4612 = -1;
        }
        if (~super.field4618 != 0) {
            class188 var7 = class322.field4848.method951(super.field4618, (byte) 75);
            if (var7.field2861 && var7.field2862 != -1 && class170.field2423.method1586(var7.field2862, (byte) 36).field5418 == 1) {
                super.field4618 = -1;
            }
        }
        if (arg2 != 8877) {
            this.method1696(true);
        }
        if (!arg4) {
            int var8 = -super.field4675[0] + arg5;
            int var9 = -super.field4674[0] + arg1;
            if (var8 >= -8 && ~var8 >= -9 && var9 >= -8 && ~var9 >= -9) {
                if (~super.field4678 > -10) {
                    ++super.field4678;
                }
                for (int var10 = super.field4678; var10 > 0; --var10) {
                    super.field4675[var10] = super.field4675[var10 - 1];
                    super.field4674[var10] = super.field4674[var10 - 1];
                    super.field4672[var10] = super.field4672[var10 - 1];
                }
                super.field4675[0] = arg5;
                super.field4674[0] = arg1;
                super.field4672[0] = 1;
                return;
            }
        }
        super.field4673 = 0;
        super.field4675[0] = arg5;
        super.field4677 = 0;
        super.field4678 = 0;
        super.field4674[0] = arg1;
        super.field4543 = super.field4675[0] * 128 + arg3 * 64;
        super.field4538 = super.field4674[0] * 128 + arg3 * 64;
        if (super.field4676 != null) {
            super.field4676.method458();
        }
    }

    @OriginalMember(owner = "client!h", name = "c", descriptor = "(B)I", line = 561)
    public final int method1916(byte arg0) {
        ++field5319;
        if (arg0 > -27) {
            this.method245((byte) 101, true, (class63) null, (class352) null, 90, 113, 17);
        }
        if (this.field5309.field4107 != null) {
            class273 var2 = this.field5309.method1781(class315.field4736, true);
            if (var2 != null && ~var2.field4096 != 0) {
                return var2.field4096;
            }
        }
        return ~this.field5309.field4096 != 0 ? this.field5309.field4096 : super.method1916((byte) -115);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)I", line = 587)
    public final int method1696(boolean arg0) {
        ++field5328;
        if (arg0) {
            this.method1916((byte) -123);
        }
        if (this.field5309.field4107 != null) {
            class273 var2 = this.field5309.method1781(class315.field4736, !arg0);
            if (var2 != null && var2.field4135 != -1) {
                return var2.field4135;
            }
        }
        return this.field5309.field4135;
    }
}
