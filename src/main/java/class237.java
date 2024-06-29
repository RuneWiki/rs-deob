import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class237 extends class363 implements class529 {

    @OriginalMember(owner = "client!jp", name = "x", descriptor = "Z")
    private boolean field3473;

    @OriginalMember(owner = "client!jp", name = "J", descriptor = "S")
    private short field3485;

    @OriginalMember(owner = "client!jp", name = "F", descriptor = "B")
    private byte field3481;

    @OriginalMember(owner = "client!jp", name = "A", descriptor = "Z")
    private boolean field3476;

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "B")
    private byte field3472;

    @OriginalMember(owner = "client!jp", name = "L", descriptor = "Z")
    private boolean field3487;

    @OriginalMember(owner = "client!jp", name = "H", descriptor = "Z")
    private boolean field3483;

    @OriginalMember(owner = "client!jp", name = "Q", descriptor = "Lt;")
    private class471 field3492;

    @OriginalMember(owner = "client!jp", name = "C", descriptor = "Lba;")
    private class263 field3478;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!jp", name = "y", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!jp", name = "z", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!jp", name = "B", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!jp", name = "D", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!jp", name = "E", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!jp", name = "G", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!jp", name = "K", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!jp", name = "M", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!jp", name = "N", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!jp", name = "O", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!jp", name = "P", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!jp", name = "I", descriptor = "[[B")
    public static byte[][] field3484;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method1574(int arg0, int arg1, boolean arg2) {
        ++field3490;
        if (!arg2) {
            method1578((byte) -99);
        }
        return ~(1408 & arg1) != -1;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lya;ZI)Lt;")
    private final class471 method1575(class38 arg0, boolean arg1, int arg2) {
        ++field3470;
        if (this.field3492 != null && arg0.method335(this.field3492.method459(), arg2) == 0) {
            return this.field3492;
        } else if (!arg1) {
            return null;
        } else {
            class101 var4 = this.method1577(arg2, false, -1, arg0);
            return var4 != null ? var4.field1418 : null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lsp;B)Z")
    public static final boolean method1576(class448 arg0, byte arg1) {
        ++field3475;
        if (arg1 >= -26) {
            return true;
        } else {
            return client.field2879 == arg0 || class255.field3743 == arg0 || class104.field1451 == arg0 || class267.field3930 == arg0;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)I")
    public final int method22(byte arg0) {
        ++field3477;
        if (arg0 != -70) {
            this.field3478 = null;
        }
        return this.field3481;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZILya;)Lmg;")
    private final class101 method1577(int arg0, boolean arg1, int arg2, class38 arg3) {
        ++field3479;
        if (arg2 != -1) {
            this.field3473 = true;
        }
        class222 var5 = class384.field5645.method786(65535 & this.field3485, 0);
        class142 var6;
        class142 var7;
        if (!this.field3487) {
            if (this.field3472 < 3) {
                var6 = class283.field4115[this.field3472 - -1];
            } else {
                var6 = null;
            }
            var7 = class283.field4115[this.field3472];
        } else {
            var6 = class283.field4115[0];
            var7 = class52.field578[this.field3472];
        }
        return var5.method1514(arg3, super.field5042, 3, arg0, super.field5045, arg1, this.field3481, var6, super.field5044, 22, var7);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILfi;BZLya;I)V")
    public final void method25(int arg0, int arg1, class388 arg2, byte arg3, boolean arg4, class38 arg5, int arg6) {
        ++field3467;
        if (arg3 != -99) {
            method1576((class448) null, (byte) -50);
        }
        if (arg2 instanceof class237) {
            class237 var8 = (class237) arg2;
            if (this.field3492 != null && var8.field3492 != null) {
                this.field3492.method437(var8.field3492, arg1, arg6, arg0, arg4);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(Lya;I)V")
    public final void method35(class38 arg0, int arg1) {
        ++field3471;
        if (arg1 < 53) {
            this.field3481 = 21;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lya;II)Lt;")
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        ++field3486;
        int var4 = 38 / ((arg2 - 54) / 56);
        return this.method1575(arg0, true, arg1);
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(I)V")
    public final void method39(int arg0) {
        ++field3466;
        if (arg0 > -18) {
            this.method28(true);
        }
        if (this.field3492 != null) {
            this.field3492.method441();
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lya;I)V")
    public final void method31(class38 arg0, int arg1) {
        ++field3491;
        Object var3 = null;
        if (arg1 != -12694) {
            this.field3476 = true;
        }
        class263 var5;
        if (this.field3478 == null && this.field3483) {
            class101 var4 = this.method1577(262144, true, arg1 + 12693, arg0);
            var5 = var4 == null ? null : var4.field1416;
        } else {
            var5 = this.field3478;
            this.field3478 = null;
        }
        if (var5 != null) {
            class452.method2728(var5, this.field3472, super.field5042, super.field5044, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)Z")
    public final boolean method30(int arg0) {
        if (arg0 != 10869) {
            this.method1575((class38) null, true, 43);
        }
        ++field3469;
        return this.field3483;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)I")
    public final int method28(boolean arg0) {
        ++field3465;
        if (!arg0) {
            this.field3473 = true;
        }
        return 65535 & this.field3485;
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lya;Lrd;IIIIZIZ)V")
    public class237(class38 arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field3194, arg1.field3211);
        this.field3473 = arg8;
        this.field3485 = (short) arg1.field3217;
        this.field3481 = (byte) arg7;
        this.field3476 = arg1.field3200 != 0 && !arg6;
        this.field3472 = (byte) arg2;
        this.field3487 = arg6;
        super.field5042 = arg3;
        super.field5044 = arg5;
        this.field3483 = arg0.method297() && arg1.field3193 && !this.field3487 && ~class478.field7044.method1536(class65.field802, (byte) -28) != -1;
        int var10 = 2048;
        if (this.field3473) {
            var10 |= 65536;
        }
        class101 var11 = this.method1577(var10, this.field3483, -1, arg0);
        if (var11 != null) {
            this.field3492 = var11.field1418;
            this.field3478 = var11.field1416;
            if (this.field3473) {
                this.field3492 = this.field3492.method458((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V")
    public final void method29(int arg0) {
        ++field3489;
        this.field3473 = false;
        int var2 = -99 % ((arg0 - 57) / 44);
        if (this.field3492 != null) {
            this.field3492.method465(this.field3492.method459() & -65537);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILya;I)Z")
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field3468;
        if (arg1 != 0) {
            this.method30(-27);
        }
        class471 var5 = this.method1575(arg2, true, 131072);
        if (var5 != null) {
            class122 var6 = arg2.method362();
            var6.method249(super.field5042, super.field5045, super.field5044);
            return var5.method443(arg3, arg0, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(I)I")
    public final int method27(int arg0) {
        ++field3474;
        int var2 = -110 / ((arg0 - 39) / 41);
        return 22;
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(B)V")
    public static void method1578(byte arg0) {
        field3484 = null;
        if (arg0 >= -78) {
            field3484 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(Lya;I)Lfk;")
    public final class462 method38(class38 arg0, int arg1) {
        ++field3482;
        if (this.field3492 == null) {
            return null;
        } else {
            if (arg1 > -87) {
                this.method30(-9);
            }
            class122 var3 = arg0.method362();
            var3.method249(super.field5042, super.field5045, super.field5044);
            class462 var4 = null;
            if (this.field3476) {
                var4 = class482.method2908(1, (byte) -95);
            }
            this.field3492.method457(var3, var4 == null ? null : var4.field6800[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(B)Z")
    public final boolean method32(byte arg0) {
        ++field3488;
        return arg0 < 104 ? true : this.field3473;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZLya;)V")
    public final void method26(boolean arg0, class38 arg1) {
        ++field3480;
        Object var3 = null;
        class263 var5;
        if (this.field3478 == null && this.field3483) {
            class101 var4 = this.method1577(262144, true, -1, arg1);
            var5 = var4 == null ? null : var4.field1416;
        } else {
            var5 = this.field3478;
            this.field3478 = null;
        }
        if (var5 != null) {
            class465.method2785(var5, this.field3472, super.field5042, super.field5044, (boolean[]) null);
        }
        if (!arg0) {
            this.field3487 = true;
        }
    }

    static {
        new class331((String) null, "geschickt werden.", (String) null, (String) null);
    }
}
