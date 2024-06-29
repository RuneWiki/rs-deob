import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class414 extends class177 implements class232 {

    @OriginalMember(owner = "client!ot", name = "Z", descriptor = "Z")
    private boolean field6104;

    @OriginalMember(owner = "client!ot", name = "J", descriptor = "B")
    private byte field6088;

    @OriginalMember(owner = "client!ot", name = "Y", descriptor = "S")
    private short field6103;

    @OriginalMember(owner = "client!ot", name = "N", descriptor = "B")
    private byte field6092;

    @OriginalMember(owner = "client!ot", name = "M", descriptor = "B")
    private byte field6091;

    @OriginalMember(owner = "client!ot", name = "I", descriptor = "Z")
    private boolean field6087;

    @OriginalMember(owner = "client!ot", name = "O", descriptor = "Z")
    private boolean field6093;

    @OriginalMember(owner = "client!ot", name = "z", descriptor = "Lj;")
    private class377 field6078;

    @OriginalMember(owner = "client!ot", name = "db", descriptor = "Lc;")
    private class121 field6108;

    @OriginalMember(owner = "client!ot", name = "E", descriptor = "I")
    public static int field6083 = -1;

    @OriginalMember(owner = "client!ot", name = "G", descriptor = "I")
    public static int field6085 = -1;

    @OriginalMember(owner = "client!ot", name = "T", descriptor = "I")
    public static int field6098 = 0;

    @OriginalMember(owner = "client!ot", name = "F", descriptor = "Lao;")
    public static class188 field6084 = new class188(88, 28);

    @OriginalMember(owner = "client!ot", name = "A", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!ot", name = "B", descriptor = "I")
    public static int field6080;

    @OriginalMember(owner = "client!ot", name = "C", descriptor = "I")
    public static int field6081;

    @OriginalMember(owner = "client!ot", name = "D", descriptor = "I")
    public static int field6082;

    @OriginalMember(owner = "client!ot", name = "H", descriptor = "I")
    public static int field6086;

    @OriginalMember(owner = "client!ot", name = "K", descriptor = "I")
    public static int field6089;

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "I")
    public static int field6090;

    @OriginalMember(owner = "client!ot", name = "P", descriptor = "I")
    public static int field6094;

    @OriginalMember(owner = "client!ot", name = "Q", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!ot", name = "R", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!ot", name = "S", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "I")
    public static int field6099;

    @OriginalMember(owner = "client!ot", name = "V", descriptor = "I")
    public static int field6100;

    @OriginalMember(owner = "client!ot", name = "W", descriptor = "I")
    public static int field6101;

    @OriginalMember(owner = "client!ot", name = "X", descriptor = "I")
    public static int field6102;

    @OriginalMember(owner = "client!ot", name = "ab", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!ot", name = "bb", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!ot", name = "cb", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IZII)Ljava/lang/String;")
    public static final String method2552(int arg0, boolean arg1, int arg2, int arg3) {
        ++field6079;
        if (~arg3 <= -3 && ~arg3 >= -37) {
            int var4 = 84 / ((-30 - arg2) / 51);
            if (arg1 && arg0 >= 0) {
                int var5 = 2;
                int var6 = arg0 / arg3;
                while (var6 != 0) {
                    var6 /= arg3;
                    ++var5;
                }
                char[] var7 = new char[var5];
                var7[0] = '+';
                for (int var8 = var5 - 1; var8 > 0; --var8) {
                    int var9 = arg0;
                    arg0 /= arg3;
                    int var10 = -(arg0 * arg3) + var9;
                    if (var10 < 10) {
                        var7[var8] = (char) (var10 + 48);
                    } else {
                        var7[var8] = (char) (var10 + 87);
                    }
                }
                return new String(var7);
            } else {
                return Integer.toString(arg0, arg3);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg3);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Z)I")
    public final int method380(boolean arg0) {
        ++field6102;
        if (!arg0) {
            this.method377(-95);
        }
        return this.field6091;
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(Lqa;I)V")
    public final void method126(class162 arg0, int arg1) {
        if (arg1 < -43) {
            ++field6096;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field6080;
        if (arg1 != -1) {
            this.field6078 = null;
        }
        class121 var5 = this.method2553(arg3, 131072, (byte) 126);
        if (var5 != null) {
            class413 var6 = arg3.method439();
            var6.method1008(super.field2688, super.field2691, super.field2683);
            return var5.method909(arg2, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(I)I")
    public final int method375(int arg0) {
        if (arg0 != -13015) {
            this.field6092 = -122;
        }
        ++field6086;
        return this.field6088;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(I)Z")
    public final boolean method377(int arg0) {
        ++field6099;
        if (arg0 >= -27) {
            this.field6092 = 72;
        }
        return this.field6093;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lqa;IB)Lc;")
    private final class121 method2553(class162 arg0, int arg1, byte arg2) {
        if (arg2 < 110) {
            method2556(false);
        }
        ++field6106;
        if (this.field6108 != null && ~arg0.method518(this.field6108.method915(), arg1) == -1) {
            return this.field6108;
        } else {
            class505 var4 = this.method2555(false, arg1, arg0, 63);
            return var4 != null ? var4.field7408 : null;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        if (arg0 != 1584) {
            this.method122(4, 84, -32, (class162) null);
        }
        ++field6101;
        return this.method2553(arg2, arg1, (byte) 112);
    }

    @OriginalMember(owner = "client!ot", name = "<init>", descriptor = "(Lqa;Lbo;IIIIZIIIII)V")
    public class414(class162 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class207.method1387(17420, arg11, arg10));
        this.field6104 = arg1.field7491 != 0 && !arg6;
        super.field2683 = arg5;
        this.field6088 = (byte) arg11;
        this.field6103 = (short) arg1.field7483;
        this.field6092 = (byte) arg2;
        this.field6091 = (byte) arg10;
        this.field6087 = arg6;
        super.field2688 = arg3;
        this.field6093 = arg0.method481() && arg1.field7489 && !this.field6087 && ~class397.field5830.method56((byte) -106, class399.field5865) != -1;
        class505 var13 = this.method2555(this.field6093, 2048, arg0, 127);
        if (var13 != null) {
            this.field6078 = var13.field7405;
            this.field6108 = var13.field7408;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(B)I")
    public final int method379(byte arg0) {
        if (arg0 != -96) {
            field6084 = null;
        }
        ++field6082;
        return 65535 & this.field6103;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(Z)I")
    public final int method1264(boolean arg0) {
        ++field6105;
        if (arg0) {
            field6084 = null;
        }
        return this.field6108 == null ? 0 : this.field6108.method918();
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(IIIIII)V")
    public static final void method2554(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6090;
        int var6 = 0;
        if (arg1 != 16301) {
            method2554(-64, -30, 23, -30, 5, 99);
        }
        int var7 = arg4;
        int var8 = arg2 * arg2;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (-var12 + 1) * var8 + var10;
        int var14 = -((var12 + -1) * var11) + var9;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) + -3) * var11;
        int var19 = (var6 - -1) * var16;
        int var20 = (arg4 + -1) * var15;
        if (arg3 >= class229.field3347 && class156.field2366 >= arg3) {
            int var21 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg0 + arg2);
            int var22 = class39.method299(class322.field4945, (byte) -56, class145.field2134, -arg2 + arg0);
            class217.method1448(class436.field6332[arg3], var22, arg5, 4, var21);
        }
        while (~var7 < -1) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var19 += var16;
                    var17 += var16;
                }
            }
            if (~var14 > -1) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                ++var6;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            --var7;
            var20 -= var15;
            var18 -= var15;
            int var23 = -var7 + arg3;
            int var24 = arg3 + var7;
            if (var24 >= class229.field3347 && var23 <= class156.field2366) {
                int var25 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg0 + var6);
                int var26 = class39.method299(class322.field4945, (byte) -56, class145.field2134, -var6 + arg0);
                if (~class229.field3347 >= ~var23) {
                    class217.method1448(class436.field6332[var23], var26, arg5, 4, var25);
                }
                if (class156.field2366 >= var24) {
                    class217.method1448(class436.field6332[var24], var26, arg5, 4, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lqa;I)V")
    public final void method374(class162 arg0, int arg1) {
        ++field6089;
        if (arg1 != 28339) {
            this.field6104 = false;
        }
        Object var3 = null;
        class377 var5;
        if (this.field6078 == null && this.field6093) {
            class505 var4 = this.method2555(true, 262144, arg0, arg1 ^ 28386);
            var5 = var4 == null ? null : var4.field7405;
        } else {
            var5 = this.field6078;
            this.field6078 = null;
        }
        if (var5 != null) {
            class393.method2457(var5, this.field6092, super.field2688, super.field2683, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILqa;)Lbw;")
    public final class482 method114(int arg0, class162 arg1) {
        ++field6094;
        if (this.field6108 == null) {
            return null;
        } else if (arg0 != -6796) {
            return null;
        } else {
            class413 var3 = arg1.method439();
            var3.method1008(super.field2688 - -super.field2686, super.field2691, super.field2683 + super.field2679);
            class482 var4 = null;
            if (this.field6104) {
                var4 = class410.method2537((byte) -45, 1);
            }
            this.field6108.method910(var3, var4 != null ? var4.field7079[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ZILqa;I)Lrl;")
    private final class505 method2555(boolean arg0, int arg1, class162 arg2, int arg3) {
        ++field6095;
        if (arg3 < 31) {
            this.field6091 = 15;
        }
        class510 var5 = class246.field3567.method609(114, this.field6103 & 65535);
        class35 var6;
        class35 var7;
        if (!this.field6087) {
            if (~this.field6092 > -4) {
                var6 = class145.field2135[this.field6092 + 1];
            } else {
                var6 = null;
            }
            var7 = class145.field2135[this.field6092];
        } else {
            var6 = class145.field2135[0];
            var7 = class62.field1063[this.field6092];
        }
        return var5.method3016(arg2, var6, super.field2691, this.field6091, super.field2688, this.field6088, arg0, (byte) -127, super.field2683, arg1, var7);
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(Lqa;I)V")
    public final void method373(class162 arg0, int arg1) {
        ++field6100;
        Object var3 = null;
        class377 var5;
        if (this.field6078 == null && this.field6093) {
            class505 var4 = this.method2555(true, 262144, arg0, 122);
            var5 = var4 != null ? var4.field7405 : null;
        } else {
            var5 = this.field6078;
            this.field6078 = null;
        }
        if (arg1 == -2304) {
            if (var5 != null) {
                class434.method2623(var5, this.field6092, super.field2688, super.field2683, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(Z)V")
    public static void method2556(boolean arg0) {
        if (!arg0) {
            method2556(false);
        }
        field6084 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(ILtn;ZI)V")
    public static final void method2557(int arg0, class58 arg1, boolean arg2, int arg3) {
        field6083 = arg3;
        ++field6107;
        class314.field4491 = arg0;
        class288.field4146 = arg1;
        if (!arg2) {
            field6083 = 24;
        }
    }

    @OriginalMember(owner = "client!ot", name = "c", descriptor = "(I)V")
    public final void method376(int arg0) {
        if (this.field6108 != null) {
            this.field6108.method891();
        }
        ++field6081;
        if (arg0 != 16931) {
            this.field6103 = -39;
        }
    }
}
