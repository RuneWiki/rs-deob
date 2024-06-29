import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class243 extends class363 {

    @OriginalMember(owner = "client!fc", name = "s", descriptor = "[I")
    public static int[] field3128 = new int[16384];

    @OriginalMember(owner = "client!fc", name = "t", descriptor = "[I")
    public static int[] field3129 = new int[16384];

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "Ldr;")
    public static class675 field3143;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "Lcga;")
    public static class449 field3146;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "Z")
    public static boolean field3147;

    @OriginalMember(owner = "client!fc", name = "u", descriptor = "I")
    public int field3130;

    @OriginalMember(owner = "client!fc", name = "v", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!fc", name = "w", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!fc", name = "x", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!fc", name = "y", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!fc", name = "z", descriptor = "I")
    public int field3135;

    @OriginalMember(owner = "client!fc", name = "A", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!fc", name = "B", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!fc", name = "C", descriptor = "I")
    public static int field3138;

    @OriginalMember(owner = "client!fc", name = "F", descriptor = "I")
    public static int field3141;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "Ljava/lang/String;")
    public String field3139;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; ~var2 > -16385; ++var2) {
            field3129[var2] = (int) (16384.0D * Math.sin((double) var2 * var0));
            field3128[var2] = (int) (16384.0D * Math.cos((double) var2 * var0));
        }
        field3140 = 0;
        field3143 = new class675(47, -2);
        field3144 = 0;
        field3146 = new class449(73, 3);
        field3147 = false;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(Z)V", line = 5)
    public final void method1455(boolean arg0) {
        if (!arg0) {
            field3143 = null;
        }
        super.field4648 = Long.MIN_VALUE & super.field4648 | class321.method1854(-98) - -500L;
        ++field3145;
        class124.field1520.method2504((byte) -121, this);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)J", line = 43)
    public final long method1456(byte arg0) {
        if (arg0 > -105) {
            this.method1461((byte) 3);
        }
        ++field3137;
        return Long.MAX_VALUE & super.field4648;
    }

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "(I)V", line = 54)
    public final void method1457(int arg0) {
        if (arg0 >= 0) {
            super.field4648 |= Long.MIN_VALUE;
            ++field3133;
            if (~this.method1456((byte) -108) == -1L) {
                class214.field2512.method2504((byte) -115, this);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(I)V", line = 69)
    public static void method1458(int arg0) {
        field3143 = null;
        field3128 = null;
        if (arg0 != 73) {
            method1462((class284) null, -54, -104, -59);
        }
        field3129 = null;
        field3146 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lmi;Z)V", line = 83)
    public static final void method1459(class463 arg0, boolean arg1) {
        ++field3141;
        arg0.field5756 = arg1;
        if (arg0.field5758 != null) {
            arg0.field5758.field3836 = 0;
        }
        for (class463 var2 = arg0.method1496(); var2 != null; var2 = arg0.method1487()) {
            method1459(var2, false);
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(III)Ljava/lang/String;", line = 101)
    public static final String method1460(int arg0, int arg1, int arg2) {
        ++field3138;
        int var3 = -arg1 + arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (~var3 > 2) {
            return "<col=ff7000>";
        } else if (~var3 > -1) {
            return "<col=ffb000>";
        } else {
            if (arg0 != 2551) {
                method1459((class463) null, false);
            }
            if (~var3 < -10) {
                return "<col=00ff00>";
            } else if (~var3 < -7) {
                return "<col=40ff00>";
            } else if (~var3 < -4) {
                return "<col=80ff00>";
            } else {
                return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "(B)I", line = 143)
    public final int method1461(byte arg0) {
        ++field3136;
        int var2 = -98 / ((arg0 - 8) / 58);
        return (int) super.field3321;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lvw;III)V", line = 153)
    public static final void method1462(class284 arg0, int arg1, int arg2, int arg3) {
        class367.field4732[arg1][arg2] = arg0;
        ++field3131;
        int var4 = 113 % ((arg3 - 4) / 62);
    }

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "(B)I", line = 166)
    public final int method1463(byte arg0) {
        ++field3142;
        int var2 = 63 % ((-37 - arg0) / 56);
        return (int) (255L & super.field3321 >>> 32);
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(II)V", line = 189)
    public class243(int arg0, int arg1) {
        super.field3321 = (long) arg1 | (long) arg0 << 32;
    }
}
