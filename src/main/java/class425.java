import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class425 extends class153 implements class196 {

    @OriginalMember(owner = "client!iv", name = "t", descriptor = "Lpd;")
    public class433 field6322;

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "Z")
    private boolean field6331;

    @OriginalMember(owner = "client!iv", name = "G", descriptor = "I")
    public static int field6335 = 0;

    @OriginalMember(owner = "client!iv", name = "P", descriptor = "[I")
    public static int[] field6344;

    @OriginalMember(owner = "client!iv", name = "u", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!iv", name = "v", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!iv", name = "w", descriptor = "I")
    public static int field6325;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    public static int field6326;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public static int field6327;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "I")
    public static int field6332;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "I")
    public static int field6333;

    @OriginalMember(owner = "client!iv", name = "F", descriptor = "I")
    public static int field6334;

    @OriginalMember(owner = "client!iv", name = "H", descriptor = "I")
    public static int field6336;

    @OriginalMember(owner = "client!iv", name = "I", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!iv", name = "J", descriptor = "I")
    public static int field6338;

    @OriginalMember(owner = "client!iv", name = "K", descriptor = "I")
    public static int field6339;

    @OriginalMember(owner = "client!iv", name = "L", descriptor = "I")
    public static int field6340;

    @OriginalMember(owner = "client!iv", name = "M", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!iv", name = "N", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!iv", name = "O", descriptor = "I")
    public static int field6343;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)V")
    public final void method59(byte arg0) {
        ++field6342;
        int var2 = 28 / ((27 - arg0) / 63);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILqa;B)Lc;")
    public final class201 method53(int arg0, class496 arg1, byte arg2) {
        ++field6329;
        int var4 = 97 / ((-62 - arg2) / 39);
        return this.field6322.method2590(false, 10, arg1, false, 0, arg0, 0);
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)I")
    public final int method66(int arg0) {
        if (arg0 != -7234) {
            field6344 = null;
        }
        ++field6328;
        return this.field6322.field6421;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)I")
    public final int method50(int arg0) {
        if (arg0 != 25707) {
            return -93;
        } else {
            ++field6332;
            return this.field6322.field6429;
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(BLqa;)V")
    public final void method62(byte arg0, class496 arg1) {
        ++field6338;
        class201 var3 = this.field6322.method2590(true, 10, arg1, true, super.field2215, 262144, super.field2217);
        if (var3 != null) {
            this.field6322.method2589(super.field2216, super.field2214, false, super.field2208, super.field2213, arg1, true, var3);
        }
        if (arg0 != -126) {
            field6335 = -16;
        }
    }

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)V")
    public final void method57(int arg0) {
        if (arg0 == -5077) {
            ++field6337;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILqa;)V")
    public final void method67(int arg0, class496 arg1) {
        int var3 = -98 % ((59 - arg0) / 60);
        this.field6322.method2599((byte) 86, arg1);
        ++field6340;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lqa;I)Lpj;")
    public final class507 method51(class496 arg0, int arg1) {
        ++field6334;
        class201 var3 = this.field6322.method2590(true, 10, arg0, false, super.field2215, 2048, super.field2217);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != -150) {
                field6327 = -102;
            }
            class23 var4 = arg0.method1088();
            var4.method185(super.field2217, super.field2222, super.field2215);
            class507 var5 = null;
            if (this.field6331) {
                var5 = class82.method527(1, 1761171873);
            }
            if (this.field6322.field6448 != null) {
                class258 var6 = this.field6322.field6448.method870();
                arg0.method1047(var3, var6, var4, var5 == null ? null : var5.field7549[0], 0);
            } else {
                var3.method318(var4, var5 != null ? var5.field7549[0] : null, 0);
            }
            this.field6322.method2589(super.field2216, super.field2214, true, super.field2208, super.field2213, arg0, true, var3);
            return var5;
        }
    }

    @OriginalMember(owner = "client!iv", name = "h", descriptor = "(I)V")
    public static void method2557(int arg0) {
        if (arg0 == 128) {
            field6344 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILbv;)V")
    public static final void method2558(int arg0, class282 arg1) {
        ++field6333;
        if (class31.field467 == null) {
            class289 var2 = new class289();
            byte[] var3 = var2.method1870(128, -115, 128, 16);
            class31.field467 = class348.method2217(false, var3, 1);
        }
        if (class253.field3508 == null) {
            class72 var4 = new class72();
            byte[] var5 = var4.method484(16, 9891, 128, 128);
            class253.field3508 = class348.method2217(false, var5, arg0 + -127);
        }
        class268 var6 = arg1.field4081;
        if (var6.method1714((byte) -95) && class224.field3157 == null) {
            byte[] var7 = class415.method2515(86, 4.0F, 16, 16.0F, 8, 128, new class173(419684), 4.0F, 0.5F, 0.6F, 128);
            class224.field3157 = class348.method2217(false, var7, 1);
        }
        if (arg0 != 128) {
            method2560(68, -123, 32, 67, -7, -30);
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lqa;Leu;IIIIIZIIIIIII)V")
    public class425(class496 arg0, class130 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field1851 == 1, class74.method490(arg12, arg13, (byte) -3));
        this.field6322 = new class433(arg0, arg1, arg12, arg13, super.field2210, arg3, arg4, arg6, arg7, arg14);
        this.field6331 = ~arg1.field1886 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLqa;)V")
    public final void method55(byte arg0, class496 arg1) {
        ++field6324;
        if (arg0 >= -31) {
            field6335 = 42;
        }
        this.field6322.method2598(102, arg1);
    }

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "(I)V")
    public static final void method2559(int arg0) {
        if (class165.field2410 != null) {
            class165.field2410.method2954((byte) -117);
            class165.field2410 = null;
            class515.field7641 = null;
        }
        ++field6336;
        if (arg0 != 128) {
            field6344 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)I")
    public final int method779(byte arg0) {
        ++field6326;
        return arg0 != 9 ? 119 : this.field6322.method2601(-38);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)I")
    public final int method63(byte arg0) {
        ++field6341;
        return arg0 != 63 ? 124 : this.field6322.field6432;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)Z")
    public final boolean method60(byte arg0) {
        if (arg0 > -108) {
            return true;
        } else {
            ++field6339;
            return this.field6322.method2593(10);
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)Z")
    public final boolean method49(int arg0) {
        ++field6323;
        if (arg0 != 7) {
            this.method56(3, -87, -44, (class496) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Lqv;BLqa;IZII)V")
    public final void method61(class49 arg0, byte arg1, class496 arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field6330;
        if (arg1 != 118) {
            method2559(-58);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIIIII)V")
    public static final void method2560(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field6343;
        if (~arg0 == ~arg5) {
            class488.method2908(arg2, arg5, arg3, (byte) 28, arg4);
        } else {
            if (arg1 > -6) {
                method2560(75, -116, 108, 44, -44, -116);
            }
            if (~(-arg5 + arg2) <= ~class396.field6021 && ~(arg2 - -arg5) >= ~class443.field6591 && class410.field6176 <= -arg0 + arg3 && arg0 + arg3 <= class158.field2302) {
                class198.method1389(arg5, arg2, arg0, arg4, true, arg3);
            } else {
                class461.method2765(1, arg2, arg4, arg5, arg0, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method56(int arg0, int arg1, int arg2, class496 arg3) {
        ++field6325;
        class201 var5 = this.field6322.method2590(false, arg1 + 7, arg3, false, super.field2215, 131072, super.field2217);
        if (var5 == null) {
            return false;
        } else {
            if (arg1 != 3) {
                this.method55((byte) 41, (class496) null);
            }
            class23 var6 = arg3.method1088();
            var6.method185(super.field2217, super.field2222, super.field2215);
            return var5.method310(arg0, arg2, var6, false);
        }
    }

    static {
        new class375("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        field6344 = new int[13];
        new class375("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
    }
}
