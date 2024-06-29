import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class482 extends class314 implements class41 {

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "Z")
    private boolean field7046;

    @OriginalMember(owner = "client!ar", name = "P", descriptor = "S")
    private short field7055;

    @OriginalMember(owner = "client!ar", name = "M", descriptor = "Z")
    private boolean field7052;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "B")
    private byte field7032;

    @OriginalMember(owner = "client!ar", name = "S", descriptor = "Z")
    private boolean field7058;

    @OriginalMember(owner = "client!ar", name = "Q", descriptor = "B")
    private byte field7056;

    @OriginalMember(owner = "client!ar", name = "z", descriptor = "B")
    private byte field7039;

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "Z")
    private boolean field7044;

    @OriginalMember(owner = "client!ar", name = "x", descriptor = "Lba;")
    private class264 field7037;

    @OriginalMember(owner = "client!ar", name = "y", descriptor = "Lt;")
    public class474 field7038;

    @OriginalMember(owner = "client!ar", name = "R", descriptor = "[I")
    public static int[] field7057 = new int[3];

    @OriginalMember(owner = "client!ar", name = "u", descriptor = "Lkg;")
    public static class179 field7034 = new class179(38, 6);

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field7030;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field7031;

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public static int field7033;

    @OriginalMember(owner = "client!ar", name = "v", descriptor = "I")
    public static int field7035;

    @OriginalMember(owner = "client!ar", name = "w", descriptor = "I")
    public static int field7036;

    @OriginalMember(owner = "client!ar", name = "A", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field7043;

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "I")
    public static int field7045;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field7047;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    public static int field7048;

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "I")
    public static int field7049;

    @OriginalMember(owner = "client!ar", name = "K", descriptor = "I")
    public static int field7050;

    @OriginalMember(owner = "client!ar", name = "L", descriptor = "I")
    public static int field7051;

    @OriginalMember(owner = "client!ar", name = "N", descriptor = "I")
    public static int field7053;

    @OriginalMember(owner = "client!ar", name = "O", descriptor = "I")
    public static int field7054;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)I")
    public final int method189(int arg0) {
        if (arg0 != 32725) {
            field7034 = null;
        }
        ++field7031;
        return this.field7056;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method186(int arg0, class38 arg1, int arg2, int arg3) {
        ++field7042;
        if (arg0 <= 66) {
            return false;
        } else {
            class474 var5 = this.method2936(arg1, (byte) -113, 131072);
            if (var5 != null) {
                class123 var6 = arg1.method369();
                var6.method229(super.field4007, super.field4009, super.field4014);
                return var5.method412(arg2, arg3, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lgg;IZIIILya;)V")
    public final void method193(class117 arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, class38 arg6) {
        int var8 = -58 / ((arg5 - 27) / 40);
        ++field7045;
        if (!(arg0 instanceof class482)) {
            if (arg0 instanceof class227) {
                class227 var9 = (class227) arg0;
                if (this.field7038 != null && var9.field2883 != null) {
                    this.field7038.method435(var9.field2883, arg1, arg4, arg3, arg2);
                    return;
                }
            }
        } else {
            class482 var10 = (class482) arg0;
            if (this.field7038 == null || var10.field7038 == null) {
                return;
            }
            this.field7038.method435(var10.field7038, arg1, arg4, arg3, arg2);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)I")
    public final int method178(boolean arg0) {
        if (!arg0) {
            return 5;
        } else {
            ++field7047;
            return this.field7032;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IILya;)Lt;")
    public final class474 method179(int arg0, int arg1, class38 arg2) {
        ++field7030;
        if (arg1 < 72) {
            this.method2935((class38) null, 34, false, 94);
        }
        return this.method2936(arg2, (byte) -106, arg0);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZLya;)Llo;")
    public final class531 method181(boolean arg0, class38 arg1) {
        ++field7053;
        if (this.field7038 == null) {
            return null;
        } else {
            class123 var3 = arg1.method369();
            var3.method229(super.field4007, super.field4009, super.field4014);
            class531 var4 = null;
            if (this.field7052) {
                var4 = class119.method850(1, 41);
            }
            if (!arg0) {
                this.field7056 = 84;
            }
            this.field7038.method415(var3, var4 != null ? var4.field7810[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lya;IZI)Ldp;")
    private final class3 method2935(class38 arg0, int arg1, boolean arg2, int arg3) {
        ++field7040;
        class102 var5 = class315.field4017.method1958(arg1 + -272235, 65535 & this.field7055);
        if (arg1 != 262144) {
            this.method191(122);
        }
        class143 var6;
        class143 var7;
        if (this.field7058) {
            var6 = class531.field7811[0];
            var7 = class140.field1808[this.field7039];
        } else {
            var7 = class531.field7811[this.field7039];
            if (this.field7039 < 3) {
                var6 = class531.field7811[this.field7039 - -1];
            } else {
                var6 = null;
            }
        }
        return var5.method770(super.field4007, super.field4009, arg2, var6, this.field7056, arg0, arg3, arg1 + -262186, var7, super.field4014, this.field7032);
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)I")
    public final int method187(int arg0) {
        if (arg0 != 21067) {
            this.field7032 = -5;
        }
        ++field7043;
        return this.field7055 & 65535;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lya;BI)Lt;")
    private final class474 method2936(class38 arg0, byte arg1, int arg2) {
        ++field7054;
        int var4 = -88 / ((arg1 - -28) / 58);
        if (this.field7038 != null && arg0.method307(this.field7038.method422(), arg2) == 0) {
            return this.field7038;
        } else {
            class3 var5 = this.method2935(arg0, 262144, false, arg2);
            return var5 != null ? var5.field26 : null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Z")
    public final boolean method194(byte arg0) {
        ++field7036;
        if (arg0 >= -72) {
            this.field7037 = null;
        }
        return this.field7046;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(ILya;)V")
    public final void method185(int arg0, class38 arg1) {
        ++field7049;
        if (arg0 != 15397) {
            method2938(14);
        }
        Object var3 = null;
        class264 var5;
        if (this.field7037 == null && this.field7044) {
            class3 var4 = this.method2935(arg1, 262144, true, 262144);
            var5 = var4 != null ? var4.field28 : null;
        } else {
            var5 = this.field7037;
            this.field7037 = null;
        }
        if (var5 != null) {
            class481.method2933(var5, this.field7039, super.field4007, super.field4014, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lya;I)V")
    public final void method192(class38 arg0, int arg1) {
        ++field7048;
        if (arg1 != 1) {
            this.field7032 = -39;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)Z")
    public final boolean method182(int arg0) {
        ++field7051;
        return arg0 != -2286 ? false : this.field7044;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZI)I")
    public static final int method2937(int arg0, boolean arg1, int arg2) {
        ++field7033;
        if (arg2 > arg0) {
            int var3 = arg0;
            arg0 = arg2;
            arg2 = var3;
        }
        while (~arg2 != -1) {
            int var4 = arg0 % arg2;
            arg0 = arg2;
            arg2 = var4;
        }
        if (arg1) {
            method2938(49);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
    public final void method180(byte arg0) {
        this.field7046 = false;
        ++field7041;
        if (arg0 == -2) {
            if (this.field7038 != null) {
                this.field7038.method442(this.field7038.method422() & -65537);
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (this.field7038 != null) {
            this.field7038.method439();
        }
        ++field7035;
        if (arg0 != 27223) {
            method2937(-117, false, -57);
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lya;Lho;IIIIZIIZ)V")
    public class482(class38 arg0, class102 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, boolean arg9) {
        super(arg3, arg4, arg5, class375.method2126(arg8, true, arg7));
        this.field7046 = arg9;
        super.field4014 = arg5;
        this.field7055 = (short) arg1.field1316;
        this.field7052 = ~arg1.field1305 != -1 && !arg6;
        this.field7032 = (byte) arg8;
        this.field7058 = arg6;
        super.field4007 = arg3;
        this.field7056 = (byte) arg7;
        this.field7039 = (byte) arg2;
        this.field7044 = arg0.method281() && arg1.field1312 && !this.field7058 && class407.field5817.method1681(class377.field4959, -28198) != 0;
        int var11 = 2048;
        if (this.field7046) {
            var11 |= 65536;
        }
        class3 var12 = this.method2935(arg0, 262144, this.field7044, var11);
        if (var12 != null) {
            this.field7037 = var12.field28;
            this.field7038 = var12.field26;
            if (this.field7046) {
                this.field7038 = this.field7038.method416((byte) 0, var11, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "(I)V")
    public static void method2938(int arg0) {
        int var1 = 24 % ((arg0 - -27) / 56);
        field7057 = null;
        field7034 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ILya;)V")
    public final void method184(int arg0, class38 arg1) {
        ++field7050;
        Object var3 = null;
        class264 var5;
        if (this.field7037 == null && this.field7044) {
            class3 var4 = this.method2935(arg1, arg0 + 267678, true, 262144);
            var5 = var4 != null ? var4.field28 : null;
        } else {
            var5 = this.field7037;
            this.field7037 = null;
        }
        if (var5 != null) {
            class125.method880(var5, this.field7039, super.field4007, super.field4014, (boolean[]) null);
        }
        if (arg0 != -5534) {
            this.method184(-47, (class38) null);
        }
    }
}
