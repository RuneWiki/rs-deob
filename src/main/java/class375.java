import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class375 extends class524 implements class232 {

    @OriginalMember(owner = "client!vi", name = "I", descriptor = "Lws;")
    public class238 field5615;

    @OriginalMember(owner = "client!vi", name = "D", descriptor = "Z")
    private boolean field5610;

    @OriginalMember(owner = "client!vi", name = "w", descriptor = "[Luf;")
    public static class310[] field5603 = new class310[50];

    @OriginalMember(owner = "client!vi", name = "u", descriptor = "I")
    public static int field5601;

    @OriginalMember(owner = "client!vi", name = "v", descriptor = "I")
    public static int field5602;

    @OriginalMember(owner = "client!vi", name = "x", descriptor = "I")
    public static int field5604;

    @OriginalMember(owner = "client!vi", name = "y", descriptor = "I")
    public static int field5605;

    @OriginalMember(owner = "client!vi", name = "z", descriptor = "I")
    public static int field5606;

    @OriginalMember(owner = "client!vi", name = "A", descriptor = "I")
    public static int field5607;

    @OriginalMember(owner = "client!vi", name = "B", descriptor = "I")
    public static int field5608;

    @OriginalMember(owner = "client!vi", name = "C", descriptor = "I")
    public static int field5609;

    @OriginalMember(owner = "client!vi", name = "E", descriptor = "I")
    public static int field5611;

    @OriginalMember(owner = "client!vi", name = "F", descriptor = "I")
    public static int field5612;

    @OriginalMember(owner = "client!vi", name = "G", descriptor = "I")
    public static int field5613;

    @OriginalMember(owner = "client!vi", name = "H", descriptor = "I")
    public static int field5614;

    @OriginalMember(owner = "client!vi", name = "J", descriptor = "I")
    public static int field5616;

    @OriginalMember(owner = "client!vi", name = "K", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!vi", name = "L", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!vi", name = "M", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(I)V")
    public final void method376(int arg0) {
        ++field5607;
        if (arg0 != 16931) {
            field5603 = null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIBIIIII)V")
    public static final void method2392(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field5606;
        int var8 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg3);
        int var9 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg6);
        int var10 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg7);
        int var11 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg0);
        int var12 = class39.method299(class229.field3347, (byte) -56, class156.field2366, arg1 + arg3);
        int var13 = class39.method299(class229.field3347, (byte) -56, class156.field2366, -arg1 + arg6);
        for (int var14 = var8; var14 < var12; ++var14) {
            class217.method1448(class436.field6332[var14], var10, arg4, arg2 ^ 79, var11);
        }
        for (int var15 = var9; var15 > var13; --var15) {
            class217.method1448(class436.field6332[var15], var10, arg4, 4, var11);
        }
        int var16 = class39.method299(class322.field4945, (byte) -56, class145.field2134, arg1 + arg7);
        int var17 = class39.method299(class322.field4945, (byte) -56, class145.field2134, -arg1 + arg0);
        int var18 = var12;
        if (arg2 != 75) {
            method2394((byte) -117);
        }
        while (~var13 <= ~var18) {
            int[] var19 = class436.field6332[var18];
            class217.method1448(var19, var10, arg4, 4, var16);
            class217.method1448(var19, var16, arg5, 4, var17);
            class217.method1448(var19, var17, arg4, 4, var11);
            ++var18;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Z)I")
    public final int method380(boolean arg0) {
        ++field5611;
        if (!arg0) {
            field5603 = null;
        }
        return this.field5615.field3443;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field5605;
        class121 var5 = this.field5615.method1549(super.field7708, 116, super.field7706, false, arg3, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class413 var6 = arg3.method439();
            if (arg1 != -1) {
                return false;
            } else {
                var6.method1008(super.field7706, super.field7709, super.field7708);
                return var5.method909(arg2, arg0, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(B)I")
    public final int method379(byte arg0) {
        ++field5601;
        if (arg0 != -96) {
            this.field5615 = null;
        }
        return this.field5615.field3469;
    }

    @OriginalMember(owner = "client!vi", name = "i", descriptor = "(I)V")
    public static void method2393(int arg0) {
        if (arg0 >= -59) {
            field5603 = null;
        }
        field5603 = null;
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(Lqa;I)V")
    public final void method126(class162 arg0, int arg1) {
        ++field5608;
        class121 var3 = this.field5615.method1549(super.field7708, 109, super.field7706, true, arg0, 262144, true);
        if (var3 != null) {
            int var4 = super.field7706 >> 7;
            int var5 = super.field7708 >> 7;
            this.field5615.method1551(var4, var5, var5, var3, false, var4, arg0, (byte) -105);
        }
        if (arg1 > -43) {
            this.field5610 = true;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(ILqa;)Lbw;")
    public final class482 method114(int arg0, class162 arg1) {
        ++field5609;
        class121 var3 = this.field5615.method1549(super.field7708, arg0 ^ -6901, super.field7706, false, arg1, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != -6796) {
                this.method375(-64);
            }
            class413 var4 = arg1.method439();
            var4.method1008(super.field7706, super.field7709, super.field7708);
            class482 var5 = null;
            if (this.field5610) {
                var5 = class410.method2537((byte) -97, 1);
            }
            if (this.field5615.field3455 == null) {
                var3.method910(var4, var5 != null ? var5.field7079[0] : null, 0);
            } else {
                class492 var6 = this.field5615.field3455.method1519();
                arg1.method531(var3, var6, var4, var5 == null ? null : var5.field7079[0], 0);
            }
            int var7 = super.field7706 >> 7;
            int var8 = super.field7708 >> 7;
            this.field5615.method1551(var7, var8, var8, var3, true, var7, arg1, (byte) -105);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILqa;)Lc;")
    public final class121 method381(int arg0, int arg1, class162 arg2) {
        if (arg0 != 1584) {
            this.method122(51, -93, 7, (class162) null);
        }
        ++field5604;
        return this.field5615.method1549(0, 120, 0, false, arg2, arg1, false);
    }

    @OriginalMember(owner = "client!vi", name = "e", descriptor = "(I)Z")
    public final boolean method121(int arg0) {
        ++field5614;
        if (arg0 != 26923) {
            field5603 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(IILqa;IZLha;I)V")
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        ++field5617;
        if (arg3 <= 5) {
            this.field5610 = false;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(Lqa;I)V")
    public final void method373(class162 arg0, int arg1) {
        if (arg1 != -2304) {
            field5603 = null;
        }
        ++field5613;
        this.field5615.method1542(arg0, true);
    }

    @OriginalMember(owner = "client!vi", name = "d", descriptor = "(I)V")
    public final void method117(int arg0) {
        if (arg0 < -127) {
            ++field5616;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "(B)V")
    public static final void method2394(byte arg0) {
        if (arg0 <= 45) {
            method2393(-72);
        }
        ++field5602;
        if (class196.field2896 != null) {
            if (class196.field2896.field1604 == 1) {
                class196.field2896 = null;
                return;
            }
            if (class196.field2896.field1604 == 2) {
                class29.method237(2, class458.field6761, 9767, class318.field4555);
                class196.field2896 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!vi", name = "<init>", descriptor = "(Lqa;Lbo;IIIIIZIII)V")
    public class375(class162 arg0, class510 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class472.method2823(3, arg9, arg8));
        this.field5615 = new class238(arg0, arg1, arg8, arg9, arg2, arg3, super.field7706, super.field7708, arg7, arg10);
        this.field5610 = ~arg1.field7491 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(I)Z")
    public final boolean method377(int arg0) {
        if (arg0 >= -27) {
            this.method117(-83);
        }
        ++field5612;
        return this.field5615.method1545(-21741);
    }

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "(I)I")
    public final int method375(int arg0) {
        if (arg0 != -13015) {
            field5603 = null;
        }
        ++field5619;
        return this.field5615.field3467;
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(Lqa;I)V")
    public final void method374(class162 arg0, int arg1) {
        if (arg1 == 28339) {
            this.field5615.method1544(0, arg0);
            ++field5618;
        }
    }

    static {
        new class180("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
    }
}
