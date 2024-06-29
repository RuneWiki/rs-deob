import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class190 extends class50 implements class425 {

    @OriginalMember(owner = "client!uu", name = "B", descriptor = "B")
    private byte field3049;

    @OriginalMember(owner = "client!uu", name = "R", descriptor = "Z")
    private boolean field3063;

    @OriginalMember(owner = "client!uu", name = "U", descriptor = "Z")
    private boolean field3066;

    @OriginalMember(owner = "client!uu", name = "x", descriptor = "B")
    private byte field3045;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "B")
    private byte field3055;

    @OriginalMember(owner = "client!uu", name = "y", descriptor = "S")
    private short field3046;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "Z")
    private boolean field3056;

    @OriginalMember(owner = "client!uu", name = "t", descriptor = "Z")
    private boolean field3041;

    @OriginalMember(owner = "client!uu", name = "z", descriptor = "Le;")
    public class374 field3047;

    @OriginalMember(owner = "client!uu", name = "T", descriptor = "Li;")
    private class31 field3065;

    @OriginalMember(owner = "client!uu", name = "Y", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!uu", name = "u", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!uu", name = "v", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!uu", name = "w", descriptor = "I")
    public static int field3044;

    @OriginalMember(owner = "client!uu", name = "A", descriptor = "I")
    public static int field3048;

    @OriginalMember(owner = "client!uu", name = "C", descriptor = "I")
    public static int field3050;

    @OriginalMember(owner = "client!uu", name = "D", descriptor = "I")
    public static int field3051;

    @OriginalMember(owner = "client!uu", name = "E", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!uu", name = "G", descriptor = "I")
    public static int field3053;

    @OriginalMember(owner = "client!uu", name = "H", descriptor = "I")
    public static int field3054;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    public static int field3057;

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    public static int field3058;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!uu", name = "S", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!uu", name = "V", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!uu", name = "W", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!uu", name = "X", descriptor = "I")
    public static int field3069;

    static {
        new class309("Unable to send message - player not on your friends list.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        new class309("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
        field3070 = 0;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(I)V", line = 3)
    public final void method229(int arg0) {
        ++field3044;
        if (this.field3047 != null) {
            this.field3047.method718();
        }
        if (arg0 != -4715) {
            this.field3056 = true;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lza;Z)V", line = 25)
    public final void method232(class288 arg0, boolean arg1) {
        ++field3060;
        if (!arg1) {
            this.field3066 = true;
        }
        Object var3 = null;
        class31 var5;
        if (this.field3065 == null && this.field3041) {
            class177 var4 = this.method1291(true, 262144, 0, arg0);
            var5 = var4 != null ? var4.field2871 : null;
        } else {
            var5 = this.field3065;
            this.field3065 = null;
        }
        if (var5 != null) {
            class1.method10(var5, this.field3049, super.field1002, super.field1005, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(B)Z", line = 54)
    public final boolean method19(byte arg0) {
        if (arg0 <= 121) {
            this.method1292(-2, (byte) 62, (class288) null);
        }
        ++field3050;
        return this.field3056;
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(Lza;I)Lnd;", line = 69)
    public final class385 method15(class288 arg0, int arg1) {
        if (arg1 != 2) {
            this.field3045 = 56;
        }
        ++field3054;
        if (this.field3047 == null) {
            return null;
        } else {
            class124 var3 = arg0.method364();
            var3.method835(super.field1002, super.field1004, super.field1005);
            class385 var4 = null;
            if (this.field3063) {
                var4 = class497.method3001(1, false);
            }
            this.field3047.method723(var3, var4 == null ? null : var4.field5620[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lza;I)V", line = 94)
    public final void method233(class288 arg0, int arg1) {
        ++field3064;
        Object var3 = null;
        class31 var5;
        if (this.field3065 == null && this.field3041) {
            class177 var4 = this.method1291(true, 262144, 0, arg0);
            var5 = var4 != null ? var4.field2871 : null;
        } else {
            var5 = this.field3065;
            this.field3065 = null;
        }
        if (arg1 != 13367) {
            this.field3049 = -104;
        }
        if (var5 != null) {
            class523.method3094(var5, this.field3049, super.field1002, super.field1005, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!uu", name = "c", descriptor = "(I)I", line = 123)
    public final int method231(int arg0) {
        if (arg0 <= 7) {
            this.method225(true);
        }
        ++field3053;
        return this.field3045;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Z)I", line = 136)
    public final int method225(boolean arg0) {
        ++field3057;
        if (arg0) {
            this.method228(122);
        }
        return this.field3055;
    }

    @OriginalMember(owner = "client!uu", name = "d", descriptor = "(I)I", line = 148)
    public final int method224(int arg0) {
        if (arg0 != -10848) {
            field3070 = 25;
        }
        ++field3059;
        return this.field3046 & 65535;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZIILza;)Lrn;", line = 164)
    private final class177 method1291(boolean arg0, int arg1, int arg2, class288 arg3) {
        ++field3069;
        class306 var5 = class123.field2142.method1530((byte) -73, 65535 & this.field3046);
        if (arg2 != 0) {
            this.field3065 = null;
        }
        class38 var6;
        class38 var7;
        if (this.field3066) {
            var6 = class531.field7727[0];
            var7 = class293.field4481[this.field3049];
        } else {
            var7 = class531.field7727[this.field3049];
            if (~this.field3049 > -4) {
                var6 = class531.field7727[this.field3049 - -1];
            } else {
                var6 = null;
            }
        }
        return var5.method1956(arg0, this.field3045, super.field1002, super.field1005, super.field1004, arg1, var7, (byte) -10, arg3, this.field3055, var6);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBILvs;Lza;ZI)V", line = 196)
    public final void method18(int arg0, byte arg1, int arg2, class421 arg3, class288 arg4, boolean arg5, int arg6) {
        if (!(arg3 instanceof class190)) {
            if (arg3 instanceof class54) {
                class54 var8 = (class54) arg3;
                if (this.field3047 != null && var8.field1159 != null) {
                    this.field3047.method741(var8.field1159, arg2, arg0, arg6, arg5);
                }
            }
        } else {
            class190 var9 = (class190) arg3;
            if (this.field3047 != null && var9.field3047 != null) {
                this.field3047.method741(var9.field3047, arg2, arg0, arg6, arg5);
            }
        }
        ++field3061;
        if (arg1 != 93) {
            this.method9((byte) 47, (class288) null);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ILza;I)Le;", line = 228)
    public final class374 method234(int arg0, class288 arg1, int arg2) {
        if (arg0 <= 99) {
            return null;
        } else {
            ++field3043;
            return this.method1292(arg2, (byte) -81, arg1);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(ZLza;II)Z", line = 239)
    public final boolean method14(boolean arg0, class288 arg1, int arg2, int arg3) {
        ++field3068;
        if (arg0) {
            this.method1291(false, -8, 43, (class288) null);
        }
        class374 var5 = this.method1292(131072, (byte) -107, arg1);
        if (var5 != null) {
            class124 var6 = arg1.method364();
            var6.method835(super.field1002, super.field1004, super.field1005);
            return var5.method763(arg3, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBLza;)Le;", line = 260)
    private final class374 method1292(int arg0, byte arg1, class288 arg2) {
        ++field3052;
        if (this.field3047 != null && ~arg2.method394(this.field3047.method768(), arg0) == -1) {
            return this.field3047;
        } else {
            class177 var4 = this.method1291(false, arg0, 0, arg2);
            if (arg1 > -77) {
                return null;
            } else {
                return var4 != null ? var4.field2866 : null;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "f", descriptor = "(I)V", line = 280)
    public final void method12(int arg0) {
        int var2 = -36 % ((arg0 - -35) / 44);
        this.field3056 = false;
        ++field3042;
        if (this.field3047 != null) {
            this.field3047.method732(this.field3047.method768() & -65537);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BLza;)V", line = 293)
    public final void method9(byte arg0, class288 arg1) {
        if (arg0 >= -98) {
            this.field3047 = null;
        }
        ++field3058;
    }

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "(Lza;Ljc;IIIIZIIZ)V", line = 308)
    public class190(class288 arg0, class306 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class376.method2308(true, arg8, arg7));
        this.field3049 = (byte) arg2;
        this.field3063 = ~arg1.field4587 != -1 && !arg6;
        this.field3066 = arg6;
        this.field3045 = (byte) arg8;
        this.field3055 = (byte) arg7;
        super.field1005 = arg5;
        this.field3046 = (short) arg1.field4626;
        super.field1002 = arg3;
        this.field3056 = arg9;
        this.field3041 = arg0.method309() && arg1.field4637 && !this.field3066 && ~class186.field2990.method1130(class133.field2236, 120) != -1;
        int var11 = 2048;
        if (this.field3056) {
            var11 |= 65536;
        }
        class177 var12 = this.method1291(this.field3041, var11, 0, arg0);
        if (var12 != null) {
            this.field3047 = var12.field2866;
            this.field3065 = var12.field2871;
            if (this.field3056) {
                this.field3047 = this.field3047.method746((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(I)Z", line = 343)
    public final boolean method228(int arg0) {
        if (arg0 != 1396) {
            this.method229(41);
        }
        ++field3067;
        return this.field3041;
    }
}
