import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class298 extends class204 {

    @OriginalMember(owner = "client!pi", name = "Jc", descriptor = "I")
    public static int field3965 = 10;

    @OriginalMember(owner = "client!pi", name = "Rc", descriptor = "Lhq;")
    public static class365 field3973 = new class365(64);

    @OriginalMember(owner = "client!pi", name = "ad", descriptor = "[I")
    public static int[] field3982 = new int[64];

    @OriginalMember(owner = "client!pi", name = "Ec", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!pi", name = "Fc", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!pi", name = "Gc", descriptor = "I")
    public static int field3962;

    @OriginalMember(owner = "client!pi", name = "Hc", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!pi", name = "Ic", descriptor = "I")
    public static int field3964;

    @OriginalMember(owner = "client!pi", name = "Kc", descriptor = "I")
    public static int field3966;

    @OriginalMember(owner = "client!pi", name = "Lc", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!pi", name = "Mc", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!pi", name = "Nc", descriptor = "I")
    public static int field3969;

    @OriginalMember(owner = "client!pi", name = "Oc", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!pi", name = "Qc", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!pi", name = "Sc", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!pi", name = "Tc", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!pi", name = "Uc", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!pi", name = "Wc", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!pi", name = "Xc", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!pi", name = "Yc", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!pi", name = "Zc", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!pi", name = "bd", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!pi", name = "Pc", descriptor = "Lvq;")
    public class307 field3971;

    @OriginalMember(owner = "client!pi", name = "Vc", descriptor = "[I")
    public static int[] field3977;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IILuo;)Z", line = 10)
    private final boolean method1886(int arg0, int arg1, class118 arg2) {
        ++field3975;
        int var4 = arg1;
        class437 var5 = this.method1250(-89);
        class156 var6 = ~super.field2400 != 0 && super.field2432 == 0 ? class430.method2621((byte) -73, super.field2400) : null;
        class156 var7 = super.field2394 == -1 || super.field2423 && var6 != null ? null : class430.method2621((byte) -33, super.field2394);
        int var8 = var5.field6001;
        int var9 = var5.field5956;
        if (arg0 != -7247) {
            this.method845(108);
        }
        if (~var8 != -1 || var9 != 0 || var5.field5972 != 0 || var5.field6000 != 0) {
            arg1 |= 7;
        }
        class386 var10 = super.field2483[0] = this.field3971.method1950(super.field2420, var7, super.field2441, super.field2411, var6, arg1, super.field2455, class262.method1658(arg0, 7205), arg2, super.field2457, super.field2429, super.field2435);
        if (var10 == null) {
            return false;
        } else {
            super.field2405 = var10.method1458();
            this.method1246((byte) 64, var10);
            int var11 = super.field2431.method1333(arg0 + 7150);
            super.field2450 = 0;
            super.field2392 = 0;
            super.field2456 = 0;
            if (var8 == 0 && ~var9 == -1) {
                this.method1247(this.method841(true) << 7, this.method841(true) << 7, var11, arg0 + 7249);
            } else {
                this.method1247(var9, var8, var11, 2);
                if (~super.field2456 != -1) {
                    super.field2483[0].method1485(super.field2456);
                }
                if (~super.field2392 != -1) {
                    super.field2483[0].method1445(super.field2392);
                }
                if (~super.field2450 != -1) {
                    super.field2483[0].method1492(0, super.field2450, 0);
                }
            }
            super.field2483[1] = null;
            if (super.field2467 != -1 && ~super.field2464 != 0) {
                class167 var12 = class179.method1124((byte) -42, super.field2467);
                class386 var13 = var12.method1062(super.field2430, 128, (!var12.field1940 ? 2 : 7) | var4, super.field2404, super.field2464, arg2);
                if (var13 != null) {
                    var13.method1492(0, -super.field2416, 0);
                    if (var12.field1940 && (var8 != 0 || var9 != 0)) {
                        if (super.field2456 != 0) {
                            var13.method1485(super.field2456);
                        }
                        if (super.field2392 != 0) {
                            var13.method1445(super.field2392);
                        }
                        if (super.field2450 != 0) {
                            var13.method1492(0, super.field2450, 0);
                        }
                    }
                    super.field2483[1] = var13;
                }
            }
            super.field2483[2] = null;
            if (super.field2487 != null) {
                if (class106.field1273 >= super.field2492) {
                    super.field2487 = null;
                }
                if (~class106.field1273 <= ~super.field2488 && class106.field1273 < super.field2492) {
                    class386 var14 = super.field2487.method419(arg2, -20264, 7 | var4);
                    if (var14 != null) {
                        var14.method1492(-super.field1516 + super.field2473, -super.field1521 + super.field2479, -super.field1514 + super.field2490);
                        if (var11 != 0) {
                            var14.method1487(var11);
                        }
                        super.field2483[2] = var14;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(III)V", line = 122)
    public final void method1887(int arg0, int arg1, int arg2) {
        ++field3960;
        int var4 = super.field2480[0];
        int var5 = super.field2482[0];
        if (arg0 == 0) {
            ++var5;
        }
        if (arg0 == 1) {
            ++var4;
            ++var5;
        }
        if (~arg0 == arg2) {
            ++var4;
        }
        if (~arg0 == -4) {
            --var5;
            ++var4;
        }
        if (~arg0 == -5) {
            --var5;
        }
        if (arg0 == 5) {
            --var4;
            --var5;
        }
        if (arg0 == 6) {
            --var4;
        }
        if (~arg0 == -8) {
            ++var5;
            --var4;
        }
        if (~super.field2400 != 0 && ~class430.method2621((byte) -82, super.field2400).field1802 == -2) {
            super.field2400 = -1;
        }
        if (super.field2467 != -1) {
            class167 var6 = class179.method1124((byte) -42, super.field2467);
            if (var6.field1937 && ~var6.field1935 != 0 && class430.method2621((byte) -128, var6.field1935).field1802 == 1) {
                super.field2467 = -1;
            }
        }
        if (~super.field2486 > -10) {
            ++super.field2486;
        }
        for (int var7 = super.field2486; var7 > 0; --var7) {
            super.field2480[var7] = super.field2480[var7 - 1];
            super.field2482[var7] = super.field2482[var7 + -1];
            super.field2478[var7] = super.field2478[var7 + -1];
        }
        super.field2480[0] = var4;
        super.field2478[0] = (byte) arg1;
        super.field2482[0] = var5;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lvq;I)V", line = 206)
    public final void method1888(class307 arg0, int arg1) {
        ++field3969;
        this.field3971 = arg0;
        if (super.field2477 != null) {
            super.field2477.method398();
        }
        if (arg1 != 8) {
            this.method836(110);
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)I", line = 221)
    public final int method836(int arg0) {
        ++field3970;
        if (this.field3971.field4113 != null) {
            class307 var2 = this.field3971.method1946((byte) 125);
            if (var2 != null && var2.field4153 != -1) {
                return var2.field4153;
            }
        }
        return arg0 != 1940 ? 57 : this.field3971.field4153;
    }

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "(B)Z", line = 242)
    public final boolean method1889(byte arg0) {
        if (arg0 < 20) {
            return true;
        } else {
            ++field3962;
            return this.field3971 != null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)I", line = 258)
    public static final int method1890(int arg0, byte arg1) {
        if (class181.field2107 != null) {
            class181.field2107.method2465((byte) -85);
            class181.field2107 = null;
        }
        ++field3961;
        ++class272.field3516;
        if (class272.field3516 > 4) {
            class272.field3516 = 0;
            class72.field893 = 0;
            return arg0;
        } else {
            if (arg1 != -4) {
                method1890(-113, (byte) -3);
            }
            if (~class354.field4816 == ~class116.field1342) {
                class354.field4816 = class22.field237;
            } else {
                class354.field4816 = class116.field1342;
            }
            class72.field893 = 0;
            return -1;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(Luo;B)Lkj;", line = 293)
    public final class175 method130(class118 arg0, byte arg1) {
        ++field3968;
        if (this.field3971 != null && this.method1886(-7247, 1024, arg0)) {
            class450 var3 = arg0.method742();
            int var4 = -64 % ((arg1 - 11) / 37);
            int var5 = super.field2431.method1333(-102);
            var3.method930(var5);
            var3.method933(super.field1516, super.field1521, super.field1514);
            class437 var6 = this.method1250(125);
            class307 var7 = this.field3971.field4113 == null ? this.field3971 : this.field3971.method1946((byte) 127);
            if (class194.field2296 && var7.field4171 && var6.field5965) {
                class156 var8 = super.field2400 != -1 && ~super.field2432 == -1 ? class430.method2621((byte) -116, super.field2400) : null;
                class156 var9 = super.field2394 == -1 || super.field2423 && var8 != null ? null : class430.method2621((byte) -116, super.field2394);
                class386 var10 = class352.method2238(var9 != null ? var9 : var8, this.field3971.field4106, this.field3971.field4158 & 65535, this.field3971.field4157 & 255, super.field2392, 896, super.field2449, arg0, var5, 65535 & this.field3971.field4123, var9 != null ? super.field2420 : super.field2441, super.field2450, super.field2456, super.field2483[0], this.field3971.field4114 & 255);
                if (var10 != null) {
                    float var11 = arg0.method760();
                    float var12 = arg0.method764();
                    arg0.method690(false);
                    arg0.method773(var11, var12 - 150.0F);
                    var10.method1441(var3, (class34) null, 0);
                    arg0.method773(var11, var12);
                    arg0.method690(true);
                }
            }
            class175 var13 = null;
            if (this.method1896(101)) {
                var13 = class68.method392((byte) 123, super.field2483.length);
            }
            if (super.field2477 == null) {
                arg0.method746(super.field2483, var3, var13 != null ? var13.field2030 : null, 0);
            } else {
                class291 var14 = super.field2477.method404();
                arg0.method720(super.field2483, var14, var3, var13 == null ? null : var13.field2030, 0);
            }
            this.method1259(false, true, super.field2483, arg0);
            if (super.field2483[2] != null) {
                if (~var5 != -1) {
                    super.field2483[2].method1487(var5);
                }
                super.field2483[2].method1492(-super.field2473 + super.field1516, -super.field2479 + super.field1521, -super.field2490 + super.field1514);
            }
            return var13;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "()V", line = 367)
    public static final void method1891() {
        class325.field4336 = 0;
        label191: for (int var0 = 0; var0 < class264.field3402; ++var0) {
            class264 var1 = class127.field1426[var0];
            if (class108.field1297 != null) {
                for (int var2 = 0; var2 < class108.field1297.length; ++var2) {
                    if (class108.field1297[var2] != -1000000 && (var1.field3387 <= class108.field1297[var2] || var1.field3388 <= class108.field1297[var2]) && (var1.field3405 <= class434.field5934[var2] || var1.field3393 <= class434.field5934[var2]) && (var1.field3405 >= class307.field4134[var2] || var1.field3393 >= class307.field4134[var2]) && (var1.field3391 <= class163.field1901[var2] || var1.field3392 <= class163.field1901[var2]) && (var1.field3391 >= class411.field5661[var2] || var1.field3392 >= class411.field5661[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3399 == 1) {
                int var3 = var1.field3397 - class325.field4341 + class347.field4720;
                if (var3 >= 0 && var3 <= class347.field4720 + class347.field4720) {
                    int var4 = var1.field3394 - class121.field1381 + class347.field4720;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3396 - class121.field1381 + class347.field4720;
                    if (var5 > class347.field4720 + class347.field4720) {
                        var5 = class347.field4720 + class347.field4720;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class140.field1628[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class437.field5999 - var1.field3405;
                        if (var7 > 32) {
                            var1.field3389 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3389 = 2;
                            var7 = -var7;
                        }
                        var1.field3395 = (var1.field3391 - class278.field3599 << 8) / var7;
                        var1.field3381 = (var1.field3392 - class278.field3599 << 8) / var7;
                        var1.field3398 = (var1.field3387 - class162.field1888 << 8) / var7;
                        var1.field3400 = (var1.field3388 - class162.field1888 << 8) / var7;
                        class104.field1223[class325.field4336++] = var1;
                    }
                }
            } else if (var1.field3399 == 2) {
                int var8 = var1.field3394 - class121.field1381 + class347.field4720;
                if (var8 >= 0 && var8 <= class347.field4720 + class347.field4720) {
                    int var9 = var1.field3397 - class325.field4341 + class347.field4720;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3382 - class325.field4341 + class347.field4720;
                    if (var10 > class347.field4720 + class347.field4720) {
                        var10 = class347.field4720 + class347.field4720;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class140.field1628[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class278.field3599 - var1.field3391;
                        if (var12 > 32) {
                            var1.field3389 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3389 = 4;
                            var12 = -var12;
                        }
                        var1.field3390 = (var1.field3405 - class437.field5999 << 8) / var12;
                        var1.field3383 = (var1.field3393 - class437.field5999 << 8) / var12;
                        var1.field3398 = (var1.field3387 - class162.field1888 << 8) / var12;
                        var1.field3400 = (var1.field3388 - class162.field1888 << 8) / var12;
                        class104.field1223[class325.field4336++] = var1;
                    }
                }
            } else if (var1.field3399 == 4) {
                int var13 = var1.field3387 - class162.field1888;
                if (var13 > 128) {
                    int var14 = var1.field3394 - class121.field1381 + class347.field4720;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3396 - class121.field1381 + class347.field4720;
                    if (var15 > class347.field4720 + class347.field4720) {
                        var15 = class347.field4720 + class347.field4720;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3397 - class325.field4341 + class347.field4720;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3382 - class325.field4341 + class347.field4720;
                        if (var17 > class347.field4720 + class347.field4720) {
                            var17 = class347.field4720 + class347.field4720;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; ++var19) {
                            for (int var20 = var14; var20 <= var15; ++var20) {
                                if (class140.field1628[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3389 = 5;
                            var1.field3390 = (var1.field3405 - class437.field5999 << 8) / var13;
                            var1.field3383 = (var1.field3393 - class437.field5999 << 8) / var13;
                            var1.field3395 = (var1.field3391 - class278.field3599 << 8) / var13;
                            var1.field3381 = (var1.field3392 - class278.field3599 << 8) / var13;
                            class104.field1223[class325.field4336++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Luo;IIIZBLpc;)V", line = 591)
    public final void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6) {
        ++field3967;
        if (arg5 <= -115) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)V", line = 602)
    public static final void method1892(int arg0) {
        ++field3980;
        if (!class380.field5165) {
            if (arg0 != 8) {
                method1893((byte) -11);
            }
            if (!class244.field3246) {
                class288.field3792 += (-class288.field3792 + 24.0F) / 2.0F;
            } else {
                class434.field5929 = (float) (-128 & (int) class434.field5929 - -191);
            }
            class380.field5165 = true;
            class392.field5340 = true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(I)Z", line = 630)
    public final boolean method129(int arg0) {
        if (arg0 != 3652) {
            return false;
        } else {
            ++field3966;
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "(B)V", line = 642)
    public static void method1893(byte arg0) {
        int var1 = 42 / ((-49 - arg0) / 51);
        field3973 = null;
        field3982 = null;
        field3977 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I)I", line = 654)
    public final int method1248(int arg0) {
        ++field3983;
        if (arg0 <= 98) {
            return -25;
        } else {
            if (this.field3971.field4113 != null) {
                class307 var2 = this.field3971.method1946((byte) 125);
                if (var2 != null && var2.field4137 != -1) {
                    return var2.field4137;
                }
            }
            return ~this.field3971.field4137 != 0 ? this.field3971.field4137 : super.method1248(106);
        }
    }

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)I", line = 679)
    public final int method845(int arg0) {
        ++field3976;
        if (arg0 >= -68) {
            this.field3971 = null;
        }
        if (this.field3971.field4113 != null) {
            class307 var2 = this.field3971.method1946((byte) -94);
            if (var2 != null && var2.field4162 != -1) {
                return var2.field4162;
            }
        }
        return this.field3971.field4162;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Luo;IIZ)Z", line = 700)
    public final boolean method134(class118 arg0, int arg1, int arg2, boolean arg3) {
        ++field3978;
        if (this.field3971 != null && this.method1886(-7247, 65536, arg0)) {
            class450 var5 = arg0.method742();
            int var6 = super.field2431.method1333(-127);
            var5.method930(var6);
            var5.method933(super.field1516, super.field1521, super.field1514);
            for (int var7 = 0; super.field2483.length > var7; ++var7) {
                if (super.field2483[var7] != null && super.field2483[var7].method1474(arg1, arg2, var5, this.field3971.field4106 == 1)) {
                    return true;
                }
            }
            if (!arg3) {
                field3977 = null;
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BLuo;)V", line = 732)
    public final void method138(byte arg0, class118 arg1) {
        if (arg0 < 78) {
            field3965 = -33;
        }
        ++field3974;
        if (this.field3971 != null) {
            if (super.field2476 || this.method1886(-7247, 0, arg1)) {
                this.method1259(super.field2476, true, super.field2483, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V", line = 754)
    public static final void method1894(int arg0, boolean arg1) {
        ++field3981;
        if (arg0 == 6865) {
            for (class237 var2 = (class237) class314.field4232.method1690((byte) -108); var2 != null; var2 = (class237) class314.field4232.method1699((byte) 103)) {
                if (var2.field3116 != null) {
                    class352.field4781.method1866(var2.field3116);
                    var2.field3116 = null;
                }
                if (var2.field3108 != null) {
                    class352.field4781.method1866(var2.field3108);
                    var2.field3108 = null;
                }
                var2.method263(false);
            }
            if (arg1) {
                for (class237 var3 = (class237) class59.field748.method1690((byte) -122); var3 != null; var3 = (class237) class59.field748.method1699((byte) 49)) {
                    if (var3.field3116 != null) {
                        class352.field4781.method1866(var3.field3116);
                        var3.field3116 = null;
                    }
                    var3.method263(false);
                }
                for (class237 var4 = (class237) class321.field4310.method2222(arg0 ^ 6865); var4 != null; var4 = (class237) class321.field4310.method2215(false)) {
                    if (var4.field3116 != null) {
                        class352.field4781.method1866(var4.field3116);
                        var4.field3116 = null;
                    }
                    var4.method263(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Lwo;I)V", line = 826)
    public static final void method1895(class285 arg0, int arg1) {
        class363.field4935 = arg0;
        ++field3979;
        if (arg1 != 25008) {
            field3965 = 60;
        }
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(I)V", line = 837)
    public final void method140(int arg0) {
        ++field3963;
        if (arg0 <= -24) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "(I)Z", line = 849)
    private final boolean method1896(int arg0) {
        if (arg0 <= 66) {
            return false;
        } else {
            ++field3972;
            return this.field3971.field4129;
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)I", line = 869)
    public final int method246(byte arg0) {
        ++field3964;
        return arg0 != 110 ? -8 : super.field2405;
    }
}
