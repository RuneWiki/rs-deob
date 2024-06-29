import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public abstract class class180 extends class692 {

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "S")
    public short field3024;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "S")
    public short field3027;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "Lws;")
    public static class328 field3030 = new class328(5, 3);

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3033 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field3034 = 1;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field3020;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field3021;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public static int field3029;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public static int field3031;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field3035;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIZLcca;Lcca;)I", line = 5)
    public static final int method1468(int arg0, int arg1, boolean arg2, class226 arg3, class226 arg4) {
        ++field3025;
        if (~arg0 == -2) {
            int var5 = arg3.field9196;
            int var6 = arg4.field9196;
            if (!arg2) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return -var6 + var5;
        } else if (~arg0 == -3) {
            return class3.method14(arg3.method1658(1612957729).field2451, 125, class135.field2206, arg4.method1658(1612957729).field2451);
        } else if (arg0 == 3) {
            if (arg3.field3640.equals("-")) {
                if (arg4.field3640.equals("-")) {
                    return 0;
                } else {
                    return !arg2 ? 1 : -1;
                }
            } else if (arg4.field3640.equals("-")) {
                return arg2 ? 1 : -1;
            } else {
                return class3.method14(arg3.field3640, 125, class135.field2206, arg4.field3640);
            }
        } else {
            int var7 = -50 % ((arg1 - 75) / 48);
            if (arg0 == 4) {
                if (!arg3.method3787((byte) 87)) {
                    return !arg4.method3787((byte) 112) ? 0 : -1;
                } else {
                    return arg4.method3787((byte) 82) ? 0 : 1;
                }
            } else if (~arg0 == -6) {
                if (!arg3.method3789(0)) {
                    return arg4.method3789(0) ? -1 : 0;
                } else {
                    return arg4.method3789(0) ? 0 : 1;
                }
            } else if (arg0 == 6) {
                if (!arg3.method3791(4)) {
                    return arg4.method3791(4) ? -1 : 0;
                } else {
                    return arg4.method3791(4) ? 0 : 1;
                }
            } else if (arg0 == 7) {
                if (!arg3.method3788((byte) -18)) {
                    return arg4.method3788((byte) 100) ? -1 : 0;
                } else {
                    return arg4.method3788((byte) -35) ? 0 : 1;
                }
            } else if (~arg0 == -9) {
                int var8 = arg3.field3642;
                int var9 = arg4.field3642;
                if (!arg2) {
                    if (~var9 == 0) {
                        var9 = 1000;
                    }
                    if (var8 == -1) {
                        var8 = 1000;
                    }
                } else {
                    if (~var9 == -1001) {
                        var9 = -1;
                    }
                    if (var8 == 1000) {
                        var8 = -1;
                    }
                }
                return var8 - var9;
            } else {
                return -arg4.field3637 + arg3.field3637;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "(I)V", line = 108)
    public static void method1469(int arg0) {
        field3030 = null;
        field3033 = null;
        if (arg0 != 18714) {
            field3034 = 117;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([SII)[S", line = 119)
    public static final short[] method1470(short[] arg0, int arg1, int arg2) {
        if (arg1 != -6) {
            return null;
        } else {
            ++field3026;
            short[] var3 = new short[arg2];
            class398.method2567(arg0, 0, var3, 0, arg2);
            return var3;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)I", line = 134)
    public static final int method1471(int arg0, int arg1) {
        if (arg0 != -23587) {
            return 4;
        } else {
            ++field3031;
            return arg1 >>> 10;
        }
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)Z", line = 146)
    public final boolean method1472(int arg0) {
        if (arg0 > -97) {
            return false;
        } else {
            ++field3029;
            return class607.method3536(super.field9705 >> class439.field6699, this.method393(0), super.field9696 >> class439.field6699, 0, super.field9703);
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)Z", line = 158)
    public final boolean method398(byte arg0) {
        if (arg0 >= -92) {
            this.method1473((byte) 21, (class674[]) null);
        }
        ++field3022;
        return false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B[Lcp;)I", line = 171)
    public final int method1473(byte arg0, class674[] arg1) {
        if (arg0 > -43) {
            field3035 = -26;
        }
        ++field3023;
        return this.method3918(arg1, (byte) 101, super.field9705 >> class439.field6699, super.field9696 >> class439.field6699);
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(IIIIIII)V", line = 183)
    public class180(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field9696 = arg0;
        super.field9703 = (byte) arg4;
        super.field9701 = arg1;
        super.field9705 = arg2;
        this.field3024 = (short) arg6;
        this.field3027 = (short) arg5;
        super.field9695 = (byte) arg3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIILr;ZILpn;)V", line = 197)
    public final void method415(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, int arg5, class692 arg6) {
        ++field3028;
        if (arg2 != 1) {
            this.method1472(-3);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(B)V", line = 210)
    public final void method404(byte arg0) {
        ++field3021;
        if (arg0 > -40) {
            this.method1474(90);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)Z", line = 221)
    public final boolean method1474(int arg0) {
        if (arg0 != -1) {
            return false;
        } else {
            ++field3020;
            return class37.field509[(super.field9696 >> class439.field6699) + -class325.field5056 + class443.field6744][(super.field9705 >> class439.field6699) - class542.field7902 + class443.field6744];
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Loo;BI)Z", line = 236)
    public static final boolean method1475(class580 arg0, byte arg1, int arg2) {
        ++field3032;
        int var3 = arg0.method3404(2, 8);
        if (~var3 == -1) {
            if (~arg0.method3404(1, 8) != -1) {
                method1475(arg0, (byte) -113, arg2);
            }
            int var4 = arg0.method3404(6, 8);
            int var5 = arg0.method3404(6, 8);
            boolean var6 = arg0.method3404(1, 8) == 1;
            if (var6) {
                class318.field4992[class422.field6437++] = arg2;
            }
            if (class597.field8465[arg2] != null) {
                throw new RuntimeException("hr:lr");
            } else {
                class30 var7 = class515.field7491[arg2];
                class304 var8 = class597.field8465[arg2] = new class304();
                var8.field4197 = arg2;
                if (class588.field8351[arg2] != null) {
                    var8.method2112(class588.field8351[arg2], -56);
                }
                var8.method1845(true, 0, var7.field445);
                var8.field4206 = var7.field444;
                int var9 = var7.field443;
                int var10 = var9 >> 28;
                int var11 = (4183627 & var9) >> 14;
                int var12 = var9 & 255;
                int var13 = (var11 << 6) + var4 + -class612.field8702;
                int var14 = (var12 << 6) - class626.field8855 + var5;
                var8.field4758 = var7.field441;
                var8.field4263[0] = class545.field7924[arg2];
                var8.field9695 = var8.field9703 = (byte) var10;
                if (class437.method2774(true, var13, var14)) {
                    ++var8.field9703;
                }
                var8.method2110(var14, 512, var13);
                var8.field4751 = false;
                class515.field7491[arg2] = null;
                return true;
            }
        } else if (~var3 == -2) {
            int var15 = arg0.method3404(2, 8);
            int var16 = class515.field7491[arg2].field443;
            class515.field7491[arg2].field443 = ((3 & (var16 >> 28) - -var15) << 28) + (268435455 & var16);
            return false;
        } else if (~var3 == -3) {
            int var17 = arg0.method3404(5, 8);
            int var18 = var17 >> 3;
            int var19 = var17 & 7;
            int var20 = class515.field7491[arg2].field443;
            int var21 = 3 & (var20 >> 28) - -var18;
            int var22 = var20 >> 14 & 255;
            int var23 = var20 & 255;
            if (~var19 == -1) {
                --var22;
                --var23;
            }
            if (var19 == 1) {
                --var23;
            }
            if (var19 == 2) {
                --var23;
                ++var22;
            }
            if (~var19 == -4) {
                --var22;
            }
            if (~var19 == -5) {
                ++var22;
            }
            if (~var19 == -6) {
                ++var23;
                --var22;
            }
            if (~var19 == -7) {
                ++var23;
            }
            if (var19 == 7) {
                ++var23;
                ++var22;
            }
            class515.field7491[arg2].field443 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method3404(18, 8);
            int var25 = var24 >> 16;
            int var26 = (65476 & var24) >> 8;
            int var27 = var24 & 255;
            int var28 = class515.field7491[arg2].field443;
            int var29 = 3 & (var28 >> 28) + var25;
            int var30 = 3 % ((-1 - arg1) / 42);
            int var31 = (var28 >> 14) + var26 & 255;
            int var32 = 255 & var27 + var28;
            class515.field7491[arg2].field443 = (var31 << 14) + (var29 << 28) + var32;
            return false;
        }
    }
}
