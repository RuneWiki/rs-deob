import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class230 extends class81 implements class161 {

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "B")
    private byte field3074;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "Z")
    private boolean field3079;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Z")
    private boolean field3075;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "S")
    private short field3083;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "B")
    private byte field3077;

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "B")
    private byte field3070;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "Z")
    private boolean field3067;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "Lhc;")
    private class75 field3076;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "Lek;")
    private class294 field3069;

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "Z")
    public static boolean field3086 = false;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "[[Z")
    public static boolean[][] field3087 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field3089 = -1;

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "I")
    public static int field3071 = 0;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field3088;

    @OriginalMember(owner = "client!ga", name = "U", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!ga", name = "V", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!ga", name = "W", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!ga", name = "X", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!ga", name = "Y", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Laa;I)Lcn;", line = 7)
    public final class300 method131(class281 arg0, int arg1) {
        ++field3072;
        if (this.field3076 == null) {
            return null;
        } else {
            if (arg1 <= 72) {
                this.field3076 = null;
            }
            class261 var3 = arg0.method1769();
            var3.method882(super.field1251 - -super.field1254, super.field1259, super.field1256 + super.field1253);
            class300 var4 = null;
            if (this.field3075) {
                var4 = class8.method54((byte) -114, 1);
            }
            this.field3076.method514(var3, var4 == null ? null : var4.field4152[0], 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)I", line = 42)
    public final int method123(byte arg0) {
        ++field3088;
        if (arg0 <= 108) {
            this.method126(51);
        }
        return this.field3077;
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V", line = 57)
    public static final void method1441(int arg0) {
        ++field3081;
        class190 var1 = class374.field5343;
        synchronized (class374.field5343) {
            class374.field5343.method1249(arg0 + 2652);
        }
        class190 var2 = class439.field6338;
        synchronized (class439.field6338) {
            class439.field6338.method1249(1);
            if (arg0 != -2651) {
                method1441(-110);
            }
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IIILaa;)Z", line = 74)
    public final boolean method136(int arg0, int arg1, int arg2, class281 arg3) {
        ++field3091;
        class75 var5 = this.method1442(arg0, arg3, 65536);
        if (var5 != null) {
            class261 var6 = arg3.method1769();
            var6.method882(super.field1251, super.field1259, super.field1256);
            return var5.method516(arg1, arg2, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Laa;B)V", line = 99)
    public final void method133(class281 arg0, byte arg1) {
        ++field3094;
        Object var3 = null;
        class294 var5;
        if (this.field3069 == null && this.field3067) {
            class169 var4 = this.method1444(true, 131072, arg0, false);
            var5 = var4 != null ? var4.field2405 : null;
        } else {
            var5 = this.field3069;
            this.field3069 = null;
        }
        if (arg1 != -102) {
            field3089 = -17;
        }
        if (var5 != null) {
            class209.method1358(var5, this.field3070, super.field1251, super.field1256, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)I", line = 128)
    public final int method126(int arg0) {
        ++field3093;
        return arg0 != -13482 ? 38 : 65535 & this.field3083;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILaa;I)Lhc;", line = 139)
    private final class75 method1442(int arg0, class281 arg1, int arg2) {
        ++field3092;
        if (arg0 != 0) {
            field3071 = -89;
        }
        if (this.field3076 != null && arg1.method1732(this.field3076.method533(), arg2) == 0) {
            return this.field3076;
        } else {
            class169 var4 = this.method1444(false, arg2, arg1, false);
            return var4 == null ? null : var4.field2401;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Laa;Z)V", line = 159)
    public final void method128(class281 arg0, boolean arg1) {
        ++field3073;
        if (!arg1) {
            this.field3067 = true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(B)I", line = 169)
    public final int method579(byte arg0) {
        if (arg0 < 72) {
            this.method136(-76, 14, -55, (class281) null);
        }
        ++field3078;
        return this.field3076 != null ? this.field3076.method523() : 0;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Laa;IB)Lhc;", line = 183)
    public final class75 method134(class281 arg0, int arg1, byte arg2) {
        if (arg2 > -25) {
            return null;
        } else {
            ++field3084;
            return this.method1442(0, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)I", line = 197)
    public final int method124(int arg0) {
        if (arg0 != -11197) {
            return 115;
        } else {
            ++field3085;
            return this.field3074;
        }
    }

    @OriginalMember(owner = "client!ga", name = "g", descriptor = "(B)V", line = 212)
    public static void method1443(byte arg0) {
        field3087 = null;
        if (arg0 != 18) {
            field3089 = 93;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ZILaa;Z)Lvn;", line = 222)
    private final class169 method1444(boolean arg0, int arg1, class281 arg2, boolean arg3) {
        ++field3068;
        class369 var5 = class310.method1961(65535 & this.field3083, (byte) 35);
        if (arg3) {
            return null;
        } else {
            class156 var6;
            class156 var7;
            if (this.field3079) {
                var6 = class156.field2213[0];
                var7 = class435.field6248[this.field3070];
            } else {
                var7 = class156.field2213[this.field3070];
                if (this.field3070 >= 3) {
                    var6 = null;
                } else {
                    var6 = class156.field2213[this.field3070 + 1];
                }
            }
            return var5.method2362(super.field1259, var7, this.field3077, arg2, 89, this.field3074, var6, super.field1251, super.field1256, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V", line = 255)
    public final void method138(int arg0) {
        if (arg0 != -4728) {
            method1443((byte) 86);
        }
        if (this.field3076 != null) {
            this.field3076.method494();
        }
        ++field3082;
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Laa;Lsk;IIIIZIIIII)V", line = 269)
    public class230(class281 arg0, class369 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class140.method959(arg10, arg11, -128));
        this.field3074 = (byte) arg11;
        super.field1251 = (short) arg3;
        this.field3079 = arg6;
        this.field3075 = ~arg1.field5221 != -1 && !arg6;
        super.field1256 = (short) arg5;
        this.field3083 = (short) arg1.field5204;
        this.field3077 = (byte) arg10;
        this.field3070 = (byte) arg2;
        this.field3067 = arg0.method1753() && arg1.field5176 && !this.field3079 && ~class410.field5956 != -1;
        class169 var13 = this.method1444(this.field3067, 1024, arg0, false);
        if (var13 != null) {
            this.field3076 = var13.field2401;
            this.field3069 = var13.field2405;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)Z", line = 300)
    public final boolean method127(byte arg0) {
        int var2 = 117 / ((-52 - arg0) / 33);
        ++field3090;
        return this.field3067;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Laa;B)V", line = 311)
    public final void method122(class281 arg0, byte arg1) {
        ++field3080;
        if (arg1 <= 16) {
            this.field3067 = false;
        }
        Object var3 = null;
        class294 var5;
        if (this.field3069 == null && this.field3067) {
            class169 var4 = this.method1444(true, 131072, arg0, false);
            var5 = var4 != null ? var4.field2405 : null;
        } else {
            var5 = this.field3069;
            this.field3069 = null;
        }
        if (var5 != null) {
            class409.method2624(var5, this.field3070, super.field1251, super.field1256, (boolean[]) null);
        }
    }
}
