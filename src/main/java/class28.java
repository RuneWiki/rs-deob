import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class28 extends class386 implements class529 {

    @OriginalMember(owner = "client!bh", name = "O", descriptor = "B")
    private byte field331;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "S")
    private short field346;

    @OriginalMember(owner = "client!bh", name = "W", descriptor = "Z")
    private boolean field339;

    @OriginalMember(owner = "client!bh", name = "P", descriptor = "B")
    private byte field332;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "Z")
    private boolean field329;

    @OriginalMember(owner = "client!bh", name = "U", descriptor = "B")
    private byte field337;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Z")
    private boolean field326;

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "Lt;")
    private class471 field347;

    @OriginalMember(owner = "client!bh", name = "M", descriptor = "Lba;")
    private class263 field330;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field327;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field328;

    @OriginalMember(owner = "client!bh", name = "Q", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!bh", name = "R", descriptor = "I")
    public static int field334;

    @OriginalMember(owner = "client!bh", name = "S", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!bh", name = "T", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!bh", name = "V", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bh", name = "X", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "[I")
    public static int[] field341;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZLya;)V", line = 6)
    public final void method26(boolean arg0, class38 arg1) {
        ++field335;
        Object var3 = null;
        class263 var5;
        if (this.field330 == null && this.field326) {
            class101 var4 = this.method226(262144, true, 1590, arg1);
            var5 = var4 != null ? var4.field1416 : null;
        } else {
            var5 = this.field330;
            this.field330 = null;
        }
        if (arg0) {
            if (var5 != null) {
                class465.method2785(var5, this.field337, super.field5697, super.field5676, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IZILya;)Lmg;", line = 42)
    private final class101 method226(int arg0, boolean arg1, int arg2, class38 arg3) {
        ++field333;
        if (arg2 != 1590) {
            return null;
        } else {
            class222 var5 = class384.field5645.method786(this.field346 & 65535, 0);
            class142 var6;
            class142 var7;
            if (this.field339) {
                var6 = class52.field578[this.field337];
                var7 = class283.field4115[0];
            } else {
                if (this.field337 >= 3) {
                    var7 = null;
                } else {
                    var7 = class283.field4115[this.field337 + 1];
                }
                var6 = class283.field4115[this.field337];
            }
            return var5.method1514(arg3, super.field5697, 3, arg0, super.field5686, arg1, this.field331, var7, super.field5676, this.field332, var6);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Lya;I)V", line = 72)
    public final void method35(class38 arg0, int arg1) {
        if (arg1 > 53) {
            ++field336;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lya;II)Lt;", line = 83)
    public final class471 method24(class38 arg0, int arg1, int arg2) {
        int var4 = -108 / ((arg2 - 54) / 56);
        ++field345;
        return this.method229(arg1, arg0, (byte) -128);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(I)V", line = 97)
    public final void method39(int arg0) {
        if (this.field347 != null) {
            this.field347.method441();
        }
        ++field334;
        if (arg0 > -18) {
            this.method31((class38) null, -83);
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)I", line = 110)
    public final int method27(int arg0) {
        int var2 = 112 % ((arg0 - 39) / 41);
        ++field348;
        return this.field332;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILjava/lang/String;)I", line = 123)
    public static final int method227(int arg0, String arg1) {
        ++field325;
        if (arg0 != -30749) {
            field341 = null;
        }
        if (arg1 == null) {
            return -1;
        } else {
            for (int var2 = 0; ~class91.field1257 < ~var2; ++var2) {
                if (arg1.equalsIgnoreCase(class353.field4943[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Lya;I)V", line = 150)
    public final void method31(class38 arg0, int arg1) {
        ++field343;
        if (arg1 != -12694) {
            this.field329 = true;
        }
        Object var3 = null;
        class263 var5;
        if (this.field330 == null && this.field326) {
            class101 var4 = this.method226(262144, true, 1590, arg0);
            var5 = var4 == null ? null : var4.field1416;
        } else {
            var5 = this.field330;
            this.field330 = null;
        }
        if (var5 != null) {
            class452.method2728(var5, this.field337, super.field5697, super.field5676, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I", line = 178)
    public final int method22(byte arg0) {
        ++field327;
        if (arg0 != -70) {
            this.method28(false);
        }
        return this.field331;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lya;Lrd;IIIIZIIIII)V", line = 190)
    public class28(class38 arg0, class222 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class175.method1226(arg10, arg11, (byte) 111));
        this.field331 = (byte) arg11;
        this.field346 = (short) arg1.field3217;
        super.field5676 = arg5;
        this.field339 = arg6;
        super.field5697 = arg3;
        this.field332 = (byte) arg10;
        this.field329 = arg1.field3200 != 0 && !arg6;
        this.field337 = (byte) arg2;
        this.field326 = arg0.method297() && arg1.field3193 && !this.field339 && ~class478.field7044.method1536(class65.field802, (byte) -28) != -1;
        class101 var13 = this.method226(2048, this.field326, 1590, arg0);
        if (var13 != null) {
            this.field347 = var13.field1418;
            this.field330 = var13.field1416;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILya;I)Z", line = 214)
    public final boolean method34(int arg0, int arg1, class38 arg2, int arg3) {
        ++field342;
        if (arg1 != 0) {
            return true;
        } else {
            class471 var5 = this.method229(131072, arg2, (byte) -125);
            if (var5 != null) {
                class122 var6 = arg2.method362();
                var6.method249(super.field5697, super.field5686, super.field5676);
                return var5.method443(arg3, arg0, var6, false);
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I", line = 237)
    public final int method28(boolean arg0) {
        ++field328;
        if (!arg0) {
            this.field330 = null;
        }
        return this.field346 & 65535;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Z)I", line = 248)
    public final int method228(boolean arg0) {
        ++field340;
        if (arg0) {
            this.method229(-108, (class38) null, (byte) 83);
        }
        return this.field347 != null ? this.field347.method463() : 0;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z", line = 260)
    public final boolean method30(int arg0) {
        ++field344;
        if (arg0 != 10869) {
            this.field346 = 12;
        }
        return this.field326;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ILya;B)Lt;", line = 272)
    private final class471 method229(int arg0, class38 arg1, byte arg2) {
        ++field338;
        if (this.field347 != null && ~arg1.method335(this.field347.method459(), arg0) == -1) {
            return this.field347;
        } else {
            if (arg2 >= -29) {
                this.method28(true);
            }
            class101 var4 = this.method226(arg0, false, 1590, arg1);
            return var4 != null ? var4.field1418 : null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V", line = 293)
    public static void method230(int arg0) {
        field341 = null;
        if (arg0 != 0) {
            field341 = null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(Lya;I)Lfk;", line = 305)
    public final class462 method38(class38 arg0, int arg1) {
        ++field349;
        if (this.field347 == null) {
            return null;
        } else if (arg1 > -87) {
            return null;
        } else {
            class122 var3 = arg0.method362();
            var3.method249(super.field5697 + super.field5674, super.field5686, super.field5676 + super.field5675);
            class462 var4 = null;
            if (this.field329) {
                var4 = class482.method2908(1, (byte) -95);
            }
            this.field347.method457(var3, var4 != null ? var4.field6800[0] : null, 0);
            return var4;
        }
    }
}
