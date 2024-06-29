import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class83 extends class356 implements class57 {

    @OriginalMember(owner = "client!iv", name = "H", descriptor = "Z")
    private boolean field938;

    @OriginalMember(owner = "client!iv", name = "B", descriptor = "Z")
    private boolean field932;

    @OriginalMember(owner = "client!iv", name = "J", descriptor = "B")
    private byte field940;

    @OriginalMember(owner = "client!iv", name = "C", descriptor = "S")
    private short field933;

    @OriginalMember(owner = "client!iv", name = "I", descriptor = "B")
    private byte field939;

    @OriginalMember(owner = "client!iv", name = "A", descriptor = "B")
    private byte field931;

    @OriginalMember(owner = "client!iv", name = "M", descriptor = "Z")
    private boolean field943;

    @OriginalMember(owner = "client!iv", name = "Q", descriptor = "Lw;")
    private class252 field947;

    @OriginalMember(owner = "client!iv", name = "P", descriptor = "Lba;")
    private class327 field946;

    @OriginalMember(owner = "client!iv", name = "E", descriptor = "Lkm;")
    public static class299 field935 = new class299();

    @OriginalMember(owner = "client!iv", name = "O", descriptor = "I")
    public static int field945 = -1;

    @OriginalMember(owner = "client!iv", name = "R", descriptor = "Z")
    public static boolean field948 = false;

    @OriginalMember(owner = "client!iv", name = "x", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!iv", name = "y", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!iv", name = "z", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!iv", name = "D", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!iv", name = "F", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!iv", name = "G", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!iv", name = "K", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!iv", name = "L", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!iv", name = "N", descriptor = "I")
    public static int field944;

    @OriginalMember(owner = "client!iv", name = "S", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!iv", name = "T", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!iv", name = "U", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!iv", name = "V", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!iv", name = "W", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!iv", name = "X", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!iv", name = "Y", descriptor = "Lew;")
    private class425 field955;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(BLoa;)V")
    public final void method102(byte arg0, class605 arg1) {
        ++field950;
        if (arg0 <= -54) {
            Object var3 = null;
            class252 var5;
            if (this.field947 == null && this.field943) {
                class651 var4 = this.method549(arg1, true, 51, 262144);
                var5 = var4 != null ? var4.field9386 : null;
            } else {
                var5 = this.field947;
                this.field947 = null;
            }
            if (var5 != null) {
                class240.method1600(var5, this.field931, super.field5065, super.field5071, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)I")
    public final int method89(int arg0) {
        ++field952;
        int var2 = 49 / ((arg0 - 11) / 51);
        return this.field933 & 65535;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILoa;I)Lba;")
    private final class327 method546(int arg0, class605 arg1, int arg2) {
        ++field944;
        if (this.field946 != null && arg1.method293(this.field946.method1375(), arg2) == 0) {
            return this.field946;
        } else {
            if (arg0 != 0) {
                this.method87(6);
            }
            class651 var4 = this.method549(arg1, false, 60, arg2);
            return var4 == null ? null : var4.field9389;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Loa;B)Laca;")
    public final class630 method88(class605 arg0, byte arg1) {
        ++field928;
        if (this.field946 == null) {
            return null;
        } else {
            if (arg1 > -127) {
                this.field932 = true;
            }
            class364 var3 = arg0.method342();
            var3.method2014(super.field5069 + super.field5065, super.field5066, super.field5071 + super.field5064);
            class630 var4 = null;
            if (this.field932) {
                var4 = class471.method2882(-125, 1);
            }
            this.field946.method1380(var3, var4 == null ? null : var4.field9084[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(I)V")
    public final void method87(int arg0) {
        if (arg0 != 7511) {
            this.method92(-18);
        }
        if (this.field946 != null) {
            this.field946.method1372();
        }
        ++field941;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZLoa;)Lba;")
    public final class327 method94(int arg0, boolean arg1, class605 arg2) {
        if (arg1) {
            return null;
        } else {
            ++field954;
            return this.method546(0, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Loa;I)V")
    public final void method90(class605 arg0, int arg1) {
        if (arg1 != -5) {
            field948 = true;
        }
        ++field934;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Loa;Lqd;IIIIZIIIII)V")
    public class83(class605 arg0, class385 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class140.method842(125, arg10, arg11));
        super.field5065 = arg3;
        this.field938 = arg6;
        this.field932 = ~arg1.field5806 != -1 && !arg6;
        this.field940 = (byte) arg11;
        super.field5071 = arg5;
        this.field933 = (short) arg1.field5810;
        this.field939 = (byte) arg10;
        this.field931 = (byte) arg2;
        this.field943 = arg0.method325() && arg1.field5855 && !this.field938 && ~class595.field8694.method2735((byte) -128, class81.field908) != -1;
        class651 var13 = this.method549(arg0, this.field943, 89, 2048);
        if (var13 != null) {
            this.field947 = var13.field9386;
            this.field946 = var13.field9389;
        }
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(I)I")
    public final int method95(int arg0) {
        ++field951;
        int var2 = -123 / ((14 - arg0) / 33);
        return this.field939;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(Loa;I)Lew;")
    public final class425 method100(class605 arg0, int arg1) {
        if (this.field955 == null) {
            this.field955 = class645.method3676(super.field5071, super.field5066, (byte) -7, super.field5065, this.method546(0, arg0, 0));
        }
        ++field929;
        return arg1 != 28286 ? null : this.field955;
    }

    @OriginalMember(owner = "client!iv", name = "i", descriptor = "(I)V")
    public static void method547(int arg0) {
        field935 = null;
        if (arg0 != 2048) {
            method547(-37);
        }
    }

    @OriginalMember(owner = "client!iv", name = "g", descriptor = "(I)I")
    public final int method548(int arg0) {
        ++field953;
        if (arg0 != 262144) {
            this.method89(-17);
        }
        return this.field946 == null ? 0 : this.field946.method1379();
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(ILoa;)V")
    public final void method98(int arg0, class605 arg1) {
        if (arg0 != 16343) {
            method547(89);
        }
        ++field930;
        Object var3 = null;
        class252 var5;
        if (this.field947 == null && this.field943) {
            class651 var4 = this.method549(arg1, true, 81, 262144);
            var5 = var4 == null ? null : var4.field9386;
        } else {
            var5 = this.field947;
            this.field947 = null;
        }
        if (var5 != null) {
            class172.method990(var5, this.field931, super.field5065, super.field5071, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Loa;ZII)Llo;")
    private final class651 method549(class605 arg0, boolean arg1, int arg2, int arg3) {
        ++field936;
        if (arg2 < 28) {
            this.field939 = -90;
        }
        class385 var5 = class575.field8301.method1499(-7532, 65535 & this.field933);
        class132 var6;
        class132 var7;
        if (this.field938) {
            var6 = class544.field7780[0];
            var7 = class492.field7164[this.field931];
        } else {
            var7 = class544.field7780[this.field931];
            if (~this.field931 <= -4) {
                var6 = null;
            } else {
                var6 = class544.field7780[this.field931 + 1];
            }
        }
        return var5.method2459(super.field5065, arg3, this.field940, arg0, super.field5066, arg1, this.field939, var6, -77, super.field5071, var7);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)Z")
    public final boolean method93(int arg0) {
        if (arg0 != -23445) {
            this.method98(-24, (class605) null);
        }
        ++field937;
        return this.field943;
    }

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "(I)I")
    public final int method92(int arg0) {
        ++field942;
        if (arg0 != 9812) {
            this.method546(42, (class605) null, -40);
        }
        return this.field940;
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        ++field949;
        if (arg0 != -10503) {
            this.field940 = 54;
        }
        class327 var5 = this.method546(0, arg2, 131072);
        if (var5 != null) {
            class364 var6 = arg2.method342();
            var6.method2014(super.field5065, super.field5066, super.field5071);
            return var5.method1381(arg1, arg3, var6, false);
        } else {
            return false;
        }
    }
}
