import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nca")
public class class689 extends class32 {

    @OriginalMember(owner = "client!nca", name = "z", descriptor = "I")
    public int field9689 = -1;

    @OriginalMember(owner = "client!nca", name = "E", descriptor = "I")
    public int field9694 = -1;

    @OriginalMember(owner = "client!nca", name = "y", descriptor = "Luc;")
    public static class27 field9688 = new class27(41, 4);

    @OriginalMember(owner = "client!nca", name = "G", descriptor = "I")
    public static int field9696 = 0;

    @OriginalMember(owner = "client!nca", name = "q", descriptor = "I")
    public int field9680;

    @OriginalMember(owner = "client!nca", name = "r", descriptor = "I")
    public static int field9681;

    @OriginalMember(owner = "client!nca", name = "s", descriptor = "I")
    public int field9682;

    @OriginalMember(owner = "client!nca", name = "t", descriptor = "I")
    public static int field9683;

    @OriginalMember(owner = "client!nca", name = "u", descriptor = "I")
    public static int field9684;

    @OriginalMember(owner = "client!nca", name = "v", descriptor = "I")
    public int field9685;

    @OriginalMember(owner = "client!nca", name = "w", descriptor = "I")
    public static int field9686;

    @OriginalMember(owner = "client!nca", name = "x", descriptor = "I")
    public int field9687;

    @OriginalMember(owner = "client!nca", name = "A", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!nca", name = "B", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!nca", name = "C", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!nca", name = "D", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!nca", name = "F", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IIII)Lva;")
    public static final class457 method3791(int arg0, int arg1, int arg2, int arg3) {
        ++field9690;
        class486 var4 = class658.field9266[arg2][arg3][arg1];
        if (var4 == null) {
            return null;
        } else {
            class457 var5 = null;
            int var6 = -1;
            class20 var7 = var4.field6751;
            if (arg0 != 4) {
                return null;
            } else {
                while (var7 != null) {
                    class39 var8 = var7.field281;
                    if (var8 instanceof class457) {
                        class457 var9 = (class457) var8;
                        int var10 = 256 * (-1 + var9.method1722((byte) -127)) + 252;
                        int var11 = -var10 + var9.field509 >> 9;
                        int var12 = var9.field514 - var10 >> 9;
                        int var13 = var9.field509 - -var10 >> 9;
                        int var14 = var9.field514 + var10 >> 9;
                        if (var11 <= arg3 && var12 <= arg1 && arg3 <= var13 && ~arg1 >= ~var14) {
                            int var15 = (1 - arg3 + var13) * (var14 + 1 + -arg1);
                            if (var15 > var6) {
                                var5 = var9;
                                var6 = var15;
                            }
                        }
                    }
                    var7 = var7.field284;
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(II[BIIIII[B)V")
    public static final void method3792(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        ++field9683;
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 3);
        if (arg0 < -68) {
            for (int var11 = -arg4; ~var11 > -1; ++var11) {
                int var10001;
                for (int var12 = var9; ~var12 > -1; ++var12) {
                    var10001 = arg1++;
                    arg2[var10001] = (byte) (arg2[var10001] + -arg8[arg3++]);
                    int var14 = arg1++;
                    arg2[var14] = (byte) (arg2[var14] + -arg8[arg3++]);
                    int var15 = arg1++;
                    arg2[var15] = (byte) (arg2[var15] + -arg8[arg3++]);
                    int var16 = arg1++;
                    arg2[var16] = (byte) (arg2[var16] + -arg8[arg3++]);
                }
                for (int var13 = var10; ~var13 > -1; ++var13) {
                    var10001 = arg1++;
                    arg2[var10001] = (byte) (arg2[var10001] + -arg8[arg3++]);
                }
                arg1 += arg6;
                arg3 += arg5;
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(B)V")
    public static final void method3793(byte arg0) {
        ++field9695;
        class432.method2481(class612.field8489, arg0 + -121);
        ++class364.field5202;
        if (class605.field8434 && class363.field5178) {
            int var1 = class46.field686.method70((byte) 125);
            if (arg0 == 37) {
                int var2 = class46.field686.method66(74);
                int var3 = var1 - class534.field7276;
                int var4 = var2 - class156.field2359;
                if (~class591.field8229 < ~var3) {
                    var3 = class591.field8229;
                }
                if (~(class612.field8489.field2121 + var3) < ~(class591.field8229 + class152.field2271.field2121)) {
                    var3 = -class612.field8489.field2121 + class591.field8229 - -class152.field2271.field2121;
                }
                if (var4 < class136.field1920) {
                    var4 = class136.field1920;
                }
                if (~(class612.field8489.field2082 + var4) < ~(class136.field1920 - -class152.field2271.field2082)) {
                    var4 = class136.field1920 + class152.field2271.field2082 + -class612.field8489.field2082;
                }
                int var5 = class152.field2271.field2122 + var3 + -class591.field8229;
                int var6 = var4 - class136.field1920 + class152.field2271.field2073;
                if (class46.field686.method68(true)) {
                    if (class364.field5202 > class612.field8489.field2089) {
                        int var7 = var3 - class640.field9075;
                        int var8 = -class226.field3257 + var4;
                        if (var7 > class612.field8489.field2076 || ~(-class612.field8489.field2076) < ~var7 || ~var8 < ~class612.field8489.field2076 || ~(-class612.field8489.field2076) < ~var8) {
                            class507.field6935 = true;
                        }
                    }
                    if (class612.field8489.field2114 != null && class507.field6935) {
                        class388 var9 = new class388();
                        var9.field5449 = var5;
                        var9.field5443 = class612.field8489;
                        var9.field5451 = class612.field8489.field2114;
                        var9.field5444 = var6;
                        class523.method2890(var9);
                        return;
                    }
                } else {
                    if (class507.field6935) {
                        class651.method3622(-1);
                        if (class612.field8489.field2013 != null) {
                            class388 var10 = new class388();
                            var10.field5449 = var5;
                            var10.field5453 = class159.field2384;
                            var10.field5444 = var6;
                            var10.field5443 = class612.field8489;
                            var10.field5451 = class612.field8489.field2013;
                            class523.method2890(var10);
                        }
                        if (class159.field2384 != null && client.method1647(class612.field8489) != null) {
                            class407.method2325(false, class612.field8489, class159.field2384);
                        }
                    } else if ((~class662.field9339 == -2 || class474.method2696((byte) 79)) && ~class315.field4697 < -3) {
                        class660.method3652(class226.field3257 + class156.field2359, class640.field9075 + class534.field7276, -86);
                    } else if (class39.method180(-80)) {
                        class660.method3652(class226.field3257 + class156.field2359, class640.field9075 + class534.field7276, -49);
                    }
                    class612.field8489 = null;
                }
            }
        } else {
            if (~class364.field5202 < -2) {
                class612.field8489 = null;
            }
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(I)V")
    public static void method3794(int arg0) {
        field9688 = null;
        if (arg0 != -1) {
            field9696 = -3;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        ++field9686;
        class391 var5 = arg2.method401();
        var5.method1288(super.field380, super.field376, super.field382);
        class352 var6 = class648.field9184.method3064(this.field9687, -111).method1588(0, this.field9680, -1, arg2, (class17) null, 131072, (class131) null, -120, 0);
        if (var6 != null && var6.method237(arg0, arg3, var5, true)) {
            return true;
        } else {
            if (~this.field9694 != 0) {
                class352 var7 = class648.field9184.method3064(this.field9694, -77).method1588(0, this.field9685, -1, arg2, (class17) null, 131072, (class131) null, -124, 0);
                if (var7 != null && var7.method237(arg0, arg3, var5, true)) {
                    return true;
                }
            }
            if (arg1 != -8003) {
                this.field9680 = -18;
            }
            if (this.field9689 != -1) {
                class352 var8 = class648.field9184.method3064(this.field9689, arg1 + 7986).method1588(0, this.field9682, -1, arg2, (class17) null, 131072, (class131) null, arg1 + 7875, 0);
                if (var8 != null && var8.method237(arg0, arg3, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nca", name = "b", descriptor = "(III)Z")
    public static final boolean method3795(int arg0, int arg1, int arg2) {
        ++field9691;
        if (arg2 >= -36) {
            return false;
        } else {
            return ~(2048 & arg1) != -1;
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(Loa;B)Lac;")
    public final class496 method551(class638 arg0, byte arg1) {
        ++field9684;
        if (arg1 > -62) {
            method3791(-24, -99, 32, -55);
        }
        return null;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "([[BILop;)V")
    public static final void method3796(byte[][] arg0, int arg1, class172 arg2) {
        ++field9681;
        int var3 = class590.field8213.length;
        for (int var4 = 0; var3 > var4; ++var4) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class234.field3367[var4] >> 8) * 64 + -class511.field6989;
                int var7 = (class234.field3367[var4] & 255) * 64 + -class124.field1726;
                class74.method592(0);
                arg2.method1181(29924, var6, class630.field8790, class480.field6696, var7, var5);
            }
        }
        if (arg1 <= 112) {
            method3791(8, -33, 97, -51);
        }
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ILoa;)Lwc;")
    public final class60 method555(int arg0, class638 arg1) {
        ++field9693;
        class391 var3 = arg1.method401();
        var3.method1288(super.field380, super.field376 + -10, super.field382);
        class60 var4 = class450.method2583(3, false);
        if (this.field9689 != -1) {
            class352 var5 = class648.field9184.method3064(this.field9689, -84).method1588(0, this.field9682, -1, arg1, (class17) null, 2048, (class131) null, arg0 ^ -117, 0);
            if (var5 != null) {
                var5.method205(var3, var4.field818[2], 0);
            }
        }
        if (this.field9694 != -1) {
            class352 var6 = class648.field9184.method3064(this.field9694, -21).method1588(0, this.field9685, -1, arg1, (class17) null, 2048, (class131) null, -112, 0);
            if (var6 != null) {
                var6.method205(var3, var4.field818[1], 0);
            }
        }
        class352 var7 = class648.field9184.method3064(this.field9687, arg0 + -28).method1588(0, this.field9680, -1, arg1, (class17) null, 2048, (class131) null, arg0 ^ -111, arg0);
        if (var7 != null) {
            var7.method205(var3, var4.field818[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nca", name = "a", descriptor = "(ZLoa;)V")
    public final void method552(boolean arg0, class638 arg1) {
        ++field9692;
        if (!arg0) {
            this.field9680 = -110;
        }
    }
}
