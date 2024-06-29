import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class163 {

    @OriginalMember(owner = "client!sa", name = "x", descriptor = "I")
    private int field3140 = 0;

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "I")
    private int field3125;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "[Lub;")
    private class182[] field3119;

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lcb;")
    public static class22 field3121 = new class22();

    @OriginalMember(owner = "client!sa", name = "k", descriptor = "Lsg;")
    public static class169 field3127 = class165.method1060("Nehmen", 1536);

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Lsg;")
    public static class169 field3130 = class165.method1060(")4lang)4de", 1536);

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "[I")
    public static int[] field3131 = new int[5];

    @OriginalMember(owner = "client!sa", name = "v", descriptor = "I")
    public static int field3138 = 2301979;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lsg;")
    private static class169 field3135 = class165.method1060("Your account has been disabled)3", 1536);

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lsg;")
    public static class169 field3126 = field3135;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lua;")
    public static class181 field3132 = new class181(260);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field3117;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field3118;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field3120;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field3122;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!sa", name = "l", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field3129;

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!sa", name = "u", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!sa", name = "y", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!sa", name = "t", descriptor = "J")
    private long field3136;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lma;")
    public static class109 field3134;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "Lub;")
    private class182 field3123;

    @OriginalMember(owner = "client!sa", name = "w", descriptor = "Lub;")
    private class182 field3139;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)Lub;")
    public final class182 method1042(byte arg0) {
        this.field3140 = 0;
        if (arg0 != 104) {
            field3127 = null;
        }
        field3128++;
        return this.method1047((byte) 64);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([Lub;I)I")
    public final int method1043(class182[] arg0, int arg1) {
        field3137++;
        if (arg1 < 23) {
            method1048(2);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field3125; var4++) {
            class182 var5 = this.field3119[var4];
            for (class182 var6 = var5.field3553; var6 != var5; var6 = var6.field3553) {
                arg0[var3++] = var6;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(JZLub;)V")
    public final void method1044(long arg0, boolean arg1, class182 arg2) {
        if (arg2.field3552 != null) {
            arg2.method1213(9104);
        }
        field3141++;
        if (!arg1) {
            this.method1043(null, 107);
        }
        class182 var5 = this.field3119[(int) ((long) (this.field3125 - 1) & arg0)];
        arg2.field3543 = arg0;
        arg2.field3552 = var5.field3552;
        arg2.field3553 = var5;
        arg2.field3552.field3553 = arg2;
        arg2.field3553.field3552 = arg2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(JB)Lub;")
    public final class182 method1045(long arg0, byte arg1) {
        if (arg1 != -77) {
            return null;
        }
        field3133++;
        this.field3136 = arg0;
        class182 var4 = this.field3119[(int) ((long) (this.field3125 - 1) & arg0)];
        for (this.field3123 = var4.field3553; this.field3123 != var4; this.field3123 = this.field3123.field3553) {
            if (this.field3123.field3543 == arg0) {
                class182 var5 = this.field3123;
                this.field3123 = this.field3123.field3553;
                return var5;
            }
        }
        this.field3123 = null;
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)Lj;")
    public static final class81 method1046(int arg0, int arg1) {
        field3129++;
        class81 var2 = (class81) class127.field2327.method1206((long) arg1, arg0 ^ 0xFFFF9F5A);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class46.field849.method552(arg1, 5, arg0);
        class81 var4 = new class81();
        if (var3 != null) {
            var4.method490(new class127(var3), (byte) -69);
        }
        class127.field2327.method1208((long) arg1, -45, var4);
        return var4;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(B)Lub;")
    public final class182 method1047(byte arg0) {
        field3120++;
        if (this.field3140 > 0 && this.field3119[this.field3140 - 1] != this.field3139) {
            class182 var2 = this.field3139;
            this.field3139 = var2.field3553;
            return var2;
        } else if (arg0 == 64) {
            while (this.field3125 > this.field3140) {
                class182 var3 = this.field3119[this.field3140++].field3553;
                if (this.field3119[this.field3140 - 1] != var3) {
                    this.field3139 = var3.field3553;
                    return var3;
                }
            }
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1048(int arg0) {
        if (arg0 != 2301979) {
            method1046(37, -125);
        }
        field3134 = null;
        field3131 = null;
        field3130 = null;
        field3127 = null;
        field3132 = null;
        field3135 = null;
        field3121 = null;
        field3126 = null;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(B)Lub;")
    public final class182 method1049(byte arg0) {
        field3124++;
        if (arg0 != 12) {
            this.field3123 = null;
        }
        if (this.field3123 == null) {
            return null;
        }
        class182 var2 = this.field3119[(int) ((long) (this.field3125 - 1) & this.field3136)];
        while (this.field3123 != var2) {
            if (this.field3123.field3543 == this.field3136) {
                class182 var3 = this.field3123;
                this.field3123 = this.field3123.field3553;
                return var3;
            }
            this.field3123 = this.field3123.field3553;
        }
        this.field3123 = null;
        return null;
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(I)V")
    public class163(int arg0) {
        this.field3125 = arg0;
        this.field3119 = new class182[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class182 var3 = this.field3119[var2] = new class182();
            var3.field3553 = var3;
            var3.field3552 = var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(B)I")
    public final int method1050(byte arg0) {
        field3118++;
        int var2 = 0;
        int var3 = 0;
        int var4 = -50 % ((-arg0 - 27) / 39);
        while (var3 < this.field3125) {
            class182 var5 = this.field3119[var3];
            class182 var6 = var5.field3553;
            while (var5 != var6) {
                var6 = var6.field3553;
                var2++;
            }
            var3++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IILke;)Lbg;")
    public static final class18 method1051(int arg0, int arg1, class95 arg2) {
        if (arg1 == 0) {
            field3117++;
            return class94.method546(arg2, (byte) -55, arg0) ? class149.method979(-15580) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lbf;IIIIB)V")
    public static final void method1052(class17 arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field3122++;
        class205 var6 = new class205();
        var6.field4021 = arg3 * 128;
        var6.field4022 = arg0.field397;
        var6.field4011 = arg4;
        var6.field4017 = arg2 * 128;
        var6.field4007 = arg0.field394;
        var6.field4026 = arg0.field374;
        var6.field4024 = arg0.field401;
        int var7 = arg0.field400;
        int var8 = arg0.field369;
        var6.field4016 = arg0.field372 * 128;
        if (arg1 == 1 || arg1 == 3) {
            var8 = arg0.field400;
            var7 = arg0.field369;
        }
        var6.field4020 = (arg3 + var7) * 128;
        var6.field4005 = (arg2 + var8) * 128;
        if (arg5 > -57) {
            method1046(77, 12);
        }
        if (arg0.field355 != null) {
            var6.field4015 = arg0;
            var6.method1330(-73);
        }
        class70.field1311.method149(0, var6);
        if (var6.field4022 != null) {
            var6.field4008 = (int) (Math.random() * (double) (var6.field4024 - var6.field4026)) + var6.field4026;
        }
    }
}
