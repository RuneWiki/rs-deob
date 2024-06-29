import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class506 extends class76 implements class161 {

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "S")
    private short field7360;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "Z")
    private boolean field7356;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "Z")
    private boolean field7368;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "Z")
    private boolean field7357;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "B")
    private byte field7346;

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "B")
    private byte field7362;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "B")
    private byte field7367;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "Z")
    private boolean field7366;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "Le;")
    public class289 field7351;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "Li;")
    private class200 field7369;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "[I")
    public static int[] field7363 = new int[2048];

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field7345;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field7348;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "I")
    public static int field7350;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    public static int field7358;

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    public static int field7359;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field7361;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    public static int field7370;

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "I")
    public static int field7371;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "(B)V", line = 5)
    public static void method3014(byte arg0) {
        if (arg0 <= 38) {
            field7363 = null;
        }
        field7363 = null;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(III)I", line = 16)
    public static final int method3015(int arg0, int arg1, int arg2) {
        ++field7370;
        int var3 = 1;
        while (arg0 > 1) {
            if (~(arg0 & 1) != -1) {
                var3 = arg2 * var3;
            }
            arg2 *= arg2;
            arg0 >>= 1;
        }
        if (~arg0 == -2) {
            return arg2 * var3;
        } else {
            int var4 = 118 % ((42 - arg1) / 62);
            return var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lza;IZ)Le;", line = 41)
    public final class289 method111(class299 arg0, int arg1, boolean arg2) {
        ++field7352;
        return !arg2 ? null : this.method3019(arg0, arg1, -6616);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)Z", line = 60)
    public final boolean method107(byte arg0) {
        if (arg0 != -88) {
            return false;
        } else {
            ++field7364;
            return this.field7368;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I", line = 71)
    public final int method97(int arg0) {
        ++field7374;
        return arg0 < 82 ? -87 : this.field7346;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lza;Lii;IIIIIZIIIIIIZ)V", line = 84)
    public class506(class299 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, boolean arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field5811 == 1, class81.method715(1, arg12, arg13));
        this.field7360 = (short) arg1.field5831;
        this.field7356 = arg7;
        this.field7368 = arg14;
        this.field7357 = arg1.field5840 != 0 && !arg7;
        this.field7346 = (byte) arg13;
        this.field7362 = (byte) arg3;
        this.field7367 = (byte) arg12;
        this.field7366 = arg0.method573() && arg1.field5801 && !this.field7356 && class40.field667.method1836(127, class108.field1631) != 0;
        int var16 = 2048;
        if (this.field7368) {
            var16 |= 65536;
        }
        class396 var17 = this.method3017(var16, arg0, true, this.field7366);
        if (var17 != null) {
            this.field7351 = var17.field5853;
            this.field7369 = var17.field5850;
            if (this.field7368) {
                this.field7351 = this.field7351.method669((byte) 0, var16, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILza;)V", line = 116)
    public final void method98(int arg0, class299 arg1) {
        if (arg0 != 31203) {
            method3016((class66) null, -13, 42, -74, (Component) null);
        }
        ++field7359;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Z", line = 126)
    public final boolean method104(byte arg0) {
        ++field7373;
        int var2 = -71 % ((-41 - arg0) / 38);
        return this.field7366;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lgt;IIILjava/awt/Component;)Lsl;", line = 136)
    public static final class460 method3016(class66 arg0, int arg1, int arg2, int arg3, Component arg4) {
        ++field7372;
        if (class193.field2961 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class460 var5 = (class460) Class.forName("sv").newInstance();
                var5.field6832 = arg1;
                var5.field6823 = new int[256 * (class162.field2453 ? 2 : 1)];
                var5.method911(arg4);
                if (arg3 != 4189) {
                    return null;
                } else {
                    var5.field6836 = (-1024 & arg1) + 1024;
                    if (~var5.field6836 < -16385) {
                        var5.field6836 = 16384;
                    }
                    var5.method916(var5.field6836);
                    if (~class285.field4446 < -1 && class423.field6214 == null) {
                        class423.field6214 = new class173();
                        class423.field6214.field2674 = arg0;
                        arg0.method448(class285.field4446, class423.field6214, (byte) 102);
                    }
                    if (class423.field6214 != null) {
                        if (class423.field6214.field2679[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class423.field6214.field2679[arg2] = var5;
                    }
                    return var5;
                }
            } catch (Throwable var8) {
                try {
                    class123 var6 = new class123(arg0, arg2);
                    var6.field6823 = new int[256 * (class162.field2453 ? 2 : 1)];
                    var6.field6832 = arg1;
                    var6.method911(arg4);
                    var6.field6836 = 16384;
                    var6.method916(var6.field6836);
                    if (class285.field4446 > 0 && class423.field6214 == null) {
                        class423.field6214 = new class173();
                        class423.field6214.field2674 = arg0;
                        arg0.method448(class285.field4446, class423.field6214, (byte) 119);
                    }
                    if (class423.field6214 != null) {
                        if (class423.field6214.field2679[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class423.field6214.field2679[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class460();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILza;ZZ)Lhw;", line = 219)
    private final class396 method3017(int arg0, class299 arg1, boolean arg2, boolean arg3) {
        ++field7375;
        if (!arg2) {
            return null;
        } else {
            class395 var5 = class247.field3693.method2281(65535 & this.field7360, -9380);
            class11 var6;
            class11 var7;
            if (this.field7356) {
                var6 = class288.field4475[this.field7362];
                var7 = class274.field4306[0];
            } else {
                var6 = class274.field4306[this.field7362];
                if (~this.field7362 <= -4) {
                    var7 = null;
                } else {
                    var7 = class274.field4306[this.field7362 + 1];
                }
            }
            return var5.method2499(var6, arg0, this.field7367 == 11 ? 10 : this.field7367, super.field1278, super.field1279, arg1, this.field7367 != 11 ? this.field7346 : this.field7346 + 4, arg3, super.field1275, (byte) -107, var7);
        }
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 251)
    public final void method106(int arg0) {
        if (arg0 == -19159) {
            ++field7353;
            if (this.field7351 != null) {
                this.field7351.method657();
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lza;IIILps;IZ)V", line = 267)
    public final void method102(class299 arg0, int arg1, int arg2, int arg3, class352 arg4, int arg5, boolean arg6) {
        if (arg3 != -750) {
            this.field7357 = true;
        }
        ++field7348;
        if (!(arg4 instanceof class401)) {
            if (arg4 instanceof class506) {
                class506 var8 = (class506) arg4;
                if (this.field7351 != null && var8.field7351 != null) {
                    this.field7351.method625(var8.field7351, arg2, arg1, arg5, arg6);
                    return;
                }
            }
        } else {
            class401 var9 = (class401) arg4;
            if (this.field7351 == null || var9.field5912 == null) {
                return;
            }
            this.field7351.method625(var9.field5912, arg2, arg1, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(ILza;)Lhp;", line = 302)
    public final class293 method110(int arg0, class299 arg1) {
        ++field7350;
        if (this.field7351 == null) {
            return null;
        } else {
            class517 var3 = arg1.method538();
            var3.method951(super.field1275, super.field1278, super.field1279);
            class293 var4 = null;
            if (this.field7357) {
                var4 = class467.method2844(-22755, 1);
            }
            this.field7351.method673(var3, var4 != null ? var4.field4524[0] : null, arg0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)I", line = 324)
    public final int method3018(boolean arg0) {
        if (arg0) {
            this.method104((byte) 20);
        }
        ++field7371;
        return this.field7351 != null ? this.field7351.method655() / 4 : 15;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 338)
    public final void method108(int arg0) {
        int var2 = -75 % ((48 - arg0) / 37);
        this.field7368 = false;
        ++field7355;
        if (this.field7351 != null) {
            this.field7351.method662(-65537 & this.field7351.method679());
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I", line = 352)
    public final int method103(int arg0) {
        ++field7347;
        return arg0 > -10 ? -25 : this.field7367;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I", line = 364)
    public final int method99(byte arg0) {
        if (arg0 != -107) {
            this.method108(-88);
        }
        ++field7354;
        return 65535 & this.field7360;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lza;II)Le;", line = 380)
    private final class289 method3019(class299 arg0, int arg1, int arg2) {
        if (arg2 != -6616) {
            this.method3019((class299) null, -43, 122);
        }
        ++field7361;
        if (this.field7351 != null && arg0.method589(this.field7351.method679(), arg1) == 0) {
            return this.field7351;
        } else {
            class396 var4 = this.method3017(arg1, arg0, true, false);
            return var4 == null ? null : var4.field5853;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lza;III)Z", line = 401)
    public final boolean method109(class299 arg0, int arg1, int arg2, int arg3) {
        ++field7345;
        if (arg2 <= 23) {
            return true;
        } else {
            class289 var5 = this.method3019(arg0, 131072, -6616);
            if (var5 != null) {
                class517 var6 = arg0.method538();
                var6.method951(super.field1275, super.field1278, super.field1279);
                return var5.method638(arg1, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lza;B)V", line = 423)
    public final void method96(class299 arg0, byte arg1) {
        ++field7358;
        Object var3 = null;
        if (arg1 >= 78) {
            class200 var5;
            if (this.field7369 == null && this.field7366) {
                class396 var4 = this.method3017(262144, arg0, true, true);
                var5 = var4 == null ? null : var4.field5850;
            } else {
                var5 = this.field7369;
                this.field7369 = null;
            }
            if (var5 != null) {
                class205.method1434(var5, this.field7362, super.field1275, super.field1279, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BLza;)V", line = 452)
    public final void method100(byte arg0, class299 arg1) {
        if (arg0 != 51) {
            this.field7360 = -24;
        }
        ++field7365;
        Object var3 = null;
        class200 var5;
        if (this.field7369 == null && this.field7366) {
            class396 var4 = this.method3017(262144, arg1, true, true);
            var5 = var4 != null ? var4.field5850 : null;
        } else {
            var5 = this.field7369;
            this.field7369 = null;
        }
        if (var5 != null) {
            class470.method2852(var5, this.field7362, super.field1275, super.field1279, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)I", line = 483)
    public final int method101(boolean arg0) {
        ++field7349;
        if (arg0) {
            this.method3018(true);
        }
        return this.field7351 == null ? 0 : this.field7351.method654();
    }
}
