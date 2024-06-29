import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class405 extends class441 implements class143 {

    @OriginalMember(owner = "client!gi", name = "N", descriptor = "Lwg;")
    public class245 field5677;

    @OriginalMember(owner = "client!gi", name = "T", descriptor = "Z")
    private boolean field5682;

    @OriginalMember(owner = "client!gi", name = "P", descriptor = "Ld;")
    public static class83 field5679 = new class83(0, -1);

    @OriginalMember(owner = "client!gi", name = "S", descriptor = "Lub;")
    public static class15 field5681 = new class15(64);

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field5668;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field5669;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!gi", name = "J", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!gi", name = "K", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!gi", name = "L", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!gi", name = "M", descriptor = "I")
    public static int field5676;

    @OriginalMember(owner = "client!gi", name = "O", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!gi", name = "Q", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!gi", name = "U", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!gi", name = "V", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ILvq;)V")
    public final void method605(int arg0, class269 arg1) {
        this.field5677.method1703((byte) -38, arg1);
        ++field5684;
        if (arg0 != 29929) {
            this.method604((class269) null, -3);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IZ)V")
    public static final void method2536(int arg0, boolean arg1) {
        class15 var2 = class44.field592;
        synchronized (class44.field592) {
            class44.field592.method91(4, arg0);
            if (!arg1) {
                method2538((byte) 126);
            }
        }
        ++field5672;
    }

    @OriginalMember(owner = "client!gi", name = "e", descriptor = "(B)V")
    public static final void method2537(byte arg0) {
        ++field5678;
        if (arg0 == 43) {
            for (int var1 = 0; ~var1 > ~class349.field5084; ++var1) {
                int var2 = class314.field4623[var1];
                class446 var3 = class442.field6317[var2];
                int var4 = class352.field5114.method837(true);
                if ((var4 & 32) != 0) {
                    var4 += class352.field5114.method837(true) << 8;
                }
                if ((var4 & 256) != 0) {
                    int var5 = class352.field5114.method857(255);
                    var3.field4571 = class352.field5114.method850(false);
                    var3.field4583 = class352.field5114.method850(false);
                    var3.field4539 = var5 & 32767;
                    var3.field4511 = (32768 & var5) != 0;
                    var3.field4576 = class34.field434 + var3.field4571 + var3.field4539;
                }
                if ((var4 & 4) != 0) {
                    if (var3.field6375.method2274(8380)) {
                        class114.method689(var3, arg0 ^ 2004);
                    }
                    var3.method2781(class171.method1222(class352.field5114.method812(3), 127), (byte) 115);
                    var3.method2095((byte) 70, var3.field6375.field5008);
                    var3.field4568 = var3.field6375.field5038 << 3;
                    if (var3.field6375.method2274(8380)) {
                        class376.method2402(var3.field4601[0], var3, class158.field2302, (class282) null, true, (class128) null, 0, var3.field4595[0]);
                    }
                }
                if ((var4 & 512) != 0) {
                    int var6 = class352.field5114.method810((byte) -6);
                    int[] var7 = new int[var6];
                    int[] var8 = new int[var6];
                    int[] var9 = new int[var6];
                    for (int var10 = 0; var6 > var10; ++var10) {
                        int var11 = class352.field5114.method857(255);
                        if (~var11 == -65536) {
                            var11 = -1;
                        }
                        var7[var10] = var11;
                        var8[var10] = class352.field5114.method848(255);
                        var9[var10] = class352.field5114.method798(false);
                    }
                    class96.method570(var7, var8, var3, var9, (byte) -76);
                }
                if ((8 & var4) != 0) {
                    int var12 = class352.field5114.method809(false);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    int var13 = class352.field5114.method810((byte) -6);
                    class377.method2405(var12, -127, var13, var3);
                }
                if ((var4 & 128) != 0) {
                    var3.field4507 = class352.field5114.method843(arg0 + -144);
                    var3.field4531 = 100;
                }
                if (~(var4 & 64) != -1) {
                    int var14 = class352.field5114.method798(false);
                    int var15 = class352.field5114.method814((byte) 83);
                    if (var14 == 65535) {
                        var14 = -1;
                    }
                    boolean var16 = true;
                    if (var14 != -1 && ~var3.field4578 != 0) {
                        if (var3.field4578 == var14) {
                            class135 var17 = class209.method1486(var14, 11);
                            if (var17.field2068 && var17.field2078 != -1) {
                                class183 var18 = class110.method671(-21965, var17.field2078);
                                int var19 = var18.field2592;
                                if (~var19 != -1) {
                                    if (~var19 != -2) {
                                        if (var19 == 2) {
                                            var3.field4564 = 0;
                                            var16 = false;
                                        }
                                    } else {
                                        var16 = true;
                                    }
                                } else {
                                    var16 = false;
                                }
                            }
                        } else {
                            class135 var20 = class209.method1486(var14, 11);
                            class135 var21 = class209.method1486(var3.field4578, 11);
                            if (var20.field2078 != -1 && ~var21.field2078 != 0) {
                                class183 var22 = class110.method671(-21965, var20.field2078);
                                class183 var23 = class110.method671(-21965, var21.field2078);
                                if (~var23.field2583 < ~var22.field2583) {
                                    var16 = false;
                                }
                            }
                        }
                    }
                    if (var16) {
                        var3.field4552 = 0;
                        var3.field4545 = var15 >> 16;
                        var3.field4586 = 1;
                        var3.field4577 = 0;
                        var3.field4578 = var14;
                        var3.field4518 = (65535 & var15) + class34.field434;
                        if (~class34.field434 > ~var3.field4518) {
                            var3.field4577 = -1;
                        }
                        if (~var3.field4578 != 0 && ~class34.field434 == ~var3.field4518) {
                            int var24 = class209.method1486(var3.field4578, 11).field2078;
                            if (var24 != -1) {
                                class183 var25 = class110.method671(-21965, var24);
                                if (var25 != null && var25.field2609 != null) {
                                    class47.method311(var3.field4463, var3.field4466, 0, true, false, var25);
                                }
                            }
                        }
                    }
                }
                if ((1 & var4) != 0) {
                    int var26 = class352.field5114.method854(3944);
                    int var27 = class352.field5114.method848(arg0 + 212);
                    var3.method2088(0, var27, class34.field434, var26);
                }
                if ((var4 & 16) != 0) {
                    var3.field4569 = class352.field5114.method809(false);
                    if (var3.field4569 == 65535) {
                        var3.field4569 = -1;
                    }
                }
                if ((2 & var4) != 0) {
                    int var28 = class352.field5114.method854(arg0 ^ 3907);
                    int var29 = class352.field5114.method837(true);
                    var3.method2088(arg0 ^ 43, var29, class34.field434, var28);
                    var3.field4579 = class34.field434 + 300;
                    var3.field4565 = class352.field5114.method848(255);
                }
                if ((1024 & var4) != 0) {
                    var3.field4544 = class352.field5114.method809(false);
                    var3.field4512 = class352.field5114.method809(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Z)Z")
    public final boolean method608(boolean arg0) {
        ++field5669;
        return arg0 ? true : this.field5677.method1706(102);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILvq;)Lni;")
    public final class305 method614(int arg0, int arg1, class269 arg2) {
        if (arg0 >= -19) {
            field5683 = -53;
        }
        ++field5680;
        return this.field5677.method1714(0, false, 0, arg2, 79, false, arg1);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lvq;IIB)Z")
    public final boolean method16(class269 arg0, int arg1, int arg2, byte arg3) {
        ++field5665;
        class305 var5 = this.field5677.method1714(super.field6303, false, super.field6309, arg0, 103, false, 65536);
        if (var5 == null) {
            return false;
        } else {
            int var6 = -13 / ((arg3 - 19) / 45);
            class154 var7 = arg0.method884();
            var7.method1133(super.field6309 + super.field6304, super.field6308, super.field6305 + super.field6303);
            return var5.method209(arg1, arg2, var7, false);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lvq;I)V")
    public final void method604(class269 arg0, int arg1) {
        int var3 = 118 % ((arg1 - 87) / 34);
        ++field5675;
        this.field5677.method1708(arg0, true);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lvq;Lbi;IIIIIIIZIIII)V")
    public class405(class269 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg6, arg7, arg8, arg10, arg11, arg12, class353.method2312(arg2, arg3, 0));
        this.field5677 = new class245(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg13);
        this.field5682 = arg1.field4036 != 0 && !arg9;
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)I")
    public final int method603(byte arg0) {
        ++field5671;
        if (arg0 != -62) {
            this.method602((byte) -29);
        }
        return this.field5677.field3640;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(B)I")
    public final int method602(byte arg0) {
        if (arg0 > -33) {
            this.method22((class269) null, (byte) -123);
        }
        ++field5668;
        return this.field5677.field3653;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V")
    public final void method600(int arg0) {
        if (arg0 <= -62) {
            ++field5670;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lvq;B)V")
    public final void method22(class269 arg0, byte arg1) {
        if (arg1 < 11) {
            this.method15((byte) 116, (class269) null);
        }
        ++field5673;
        class305 var3 = this.field5677.method1714(super.field6303, false, super.field6309, arg0, 48, true, 131072);
        if (var3 != null) {
            this.field5677.method1705(false, super.field6303 >> 7, super.field6309 >> 7, super.field6303 >> 7, arg0, super.field6309 >> 7, var3, 7215);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(I)I")
    public final int method599(int arg0) {
        if (arg0 != -10450) {
            field5683 = -127;
        }
        ++field5674;
        return this.field5677.field3651;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLvq;)Lbf;")
    public final class316 method15(byte arg0, class269 arg1) {
        ++field5666;
        class305 var3 = this.field5677.method1714(super.field6303, false, super.field6309, arg1, 90, true, 1024);
        if (var3 == null) {
            return null;
        } else {
            class154 var4 = arg1.method884();
            var4.method1133(super.field6309 + super.field6304, super.field6308, super.field6303 - -super.field6305);
            class316 var5 = null;
            if (this.field5682) {
                var5 = class105.method616(-15465, 1);
            }
            if (this.field5677.field3652 == null) {
                var3.method230(var4, var5 == null ? null : var5.field4631[0], 0);
            } else {
                class235 var6 = this.field5677.field3652.method2152();
                arg1.method1013(var3, var6, var4, var5 != null ? var5.field4631[0] : null, 0);
            }
            int var7 = -75 % ((arg0 - -8) / 51);
            this.field5677.method1705(true, super.field6303 >> 7, super.field6309 >> 7, super.field6303 >> 7, arg1, super.field6309 >> 7, var3, 7215);
            return var5;
        }
    }

    @OriginalMember(owner = "client!gi", name = "f", descriptor = "(B)V")
    public static void method2538(byte arg0) {
        field5681 = null;
        field5679 = null;
        if (arg0 != 29) {
            field5679 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLsp;)V")
    public static final void method2539(byte arg0, class382 arg1) {
        if (arg0 > 43) {
            ++field5667;
            if (!class359.field5185) {
                arg1.method2660((byte) 124);
                --class381.field5412;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "d", descriptor = "(B)I")
    public final int method1766(byte arg0) {
        ++field5676;
        if (arg0 != 50) {
            this.method600(14);
        }
        return this.field5677.method1707((byte) 61);
    }
}
