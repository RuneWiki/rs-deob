import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class402 extends class152 implements class620 {

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "Lmda;")
    public class587 field5132;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "Z")
    private boolean field5139;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "I")
    public static int field5137 = class127.method924(12, 1600);

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field5145 = 0;

    @OriginalMember(owner = "client!bh", name = "L", descriptor = "I")
    public static int field5147 = 0;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field5126;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field5127;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "I")
    public static int field5128;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Lcd;")
    private class564 field5144;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILoa;I)Z")
    public final boolean method74(int arg0, int arg1, class43 arg2, int arg3) {
        ++field5142;
        class107 var5 = this.field5132.method3207(arg2, super.field1934, false, 131072, false, 28869, super.field1943);
        if (var5 == null) {
            return false;
        } else {
            if (arg3 > -98) {
                this.method75(15);
            }
            class151 var6 = arg2.method402();
            var6.method146(super.field1943, super.field1942, super.field1934);
            return var5.method832(arg1, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(B)I")
    public final int method66(byte arg0) {
        ++field5127;
        return arg0 != -42 ? -4 : this.field5132.field7976;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILoa;ILcq;ZI)V")
    public final void method73(int arg0, int arg1, class43 arg2, int arg3, class274 arg4, boolean arg5, int arg6) {
        if (arg6 > -2) {
            field5137 = 76;
        }
        ++field5136;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(I)Z")
    public final boolean method78(int arg0) {
        if (arg0 != 0) {
            this.method77((byte) 73);
        }
        ++field5133;
        return false;
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)I")
    public final int method76(byte arg0) {
        if (arg0 > -92) {
            field5147 = -121;
        }
        ++field5129;
        return this.field5132.field7955;
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Loa;Lsa;IIIIIZII)V")
    public class402(class43 arg0, class698 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field9675, arg1.field9629, arg1.field9624);
        this.field5132 = new class587(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field5139 = arg1.field9660 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Loa;II)Lba;")
    public final class107 method63(class43 arg0, int arg1, int arg2) {
        ++field5126;
        return arg2 != 25871 ? null : this.field5132.method3207(arg0, 0, false, arg1, false, 28869, 0);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Loa;I)V")
    public final void method62(class43 arg0, int arg1) {
        if (arg1 != 6526) {
            this.method62((class43) null, 79);
        }
        ++field5135;
        this.field5132.method3205(8231, arg0);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(B)V")
    public final void method77(byte arg0) {
        ++field5140;
        if (arg0 != 7) {
            this.field5144 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)Z")
    public final boolean method75(int arg0) {
        ++field5143;
        int var2 = 8 / ((arg0 - 26) / 38);
        return this.field5132.method3200(-65);
    }

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "(Loa;I)Lcd;")
    public final class564 method72(class43 arg0, int arg1) {
        ++field5128;
        if (arg1 != 21098) {
            field5137 = 109;
        }
        return this.field5144;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Z)I")
    public final int method70(boolean arg0) {
        if (!arg0) {
            return -123;
        } else {
            ++field5141;
            return this.field5132.field7959;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(Loa;B)Lpl;")
    public final class215 method71(class43 arg0, byte arg1) {
        ++field5138;
        class107 var3 = this.field5132.method3207(arg0, super.field1934, true, 2048, false, 28869, super.field1943);
        if (var3 == null) {
            return null;
        } else {
            int var4 = -90 / ((arg1 - 12) / 41);
            class151 var5 = arg0.method402();
            var5.method146(super.field1943, super.field1942, super.field1934);
            class215 var6 = null;
            if (this.field5139) {
                var6 = class207.method1331(true, 1);
            }
            int var7 = super.field1943 >> 9;
            int var8 = super.field1934 >> 9;
            this.field5132.method3201(var8, arg0, var7, var5, -82, var8, true, var3, var7);
            if (this.field5132.field7979 == null) {
                var3.method827(var5, var6 != null ? var6.field2770[0] : null, 0);
            } else {
                class282 var9 = this.field5132.field7979.method1468();
                arg0.method365(var3, var9, var5, var6 != null ? var6.field2770[0] : null, 0);
            }
            if (this.field5144 == null) {
                this.field5144 = class240.method1519(super.field1942, var3, super.field1943, 1, super.field1934);
            } else {
                class434.method2480(7065, super.field1934, this.field5144, super.field1943, var3, super.field1942);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(Loa;I)V")
    public final void method67(class43 arg0, int arg1) {
        ++field5146;
        if (arg1 == 2) {
            class107 var3 = this.field5132.method3207(arg0, super.field1934, true, 262144, true, 28869, super.field1943);
            if (var3 != null) {
                int var4 = super.field1943 >> 9;
                int var5 = super.field1934 >> 9;
                class151 var6 = arg0.method402();
                var6.method146(super.field1943, super.field1942, super.field1934);
                this.field5132.method3201(var5, arg0, var4, var6, arg1 ^ -109, var5, false, var3, var4);
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)Z")
    public static final boolean method2293(byte arg0, int arg1) {
        ++field5130;
        class57 var2 = (class57) class658.field9176.method2090(true);
        int var3 = -66 / ((arg0 - -71) / 51);
        while (var2 != null) {
            if (class478.method2652(116, var2.field776) && ~((long) arg1) == ~var2.field774) {
                return true;
            }
            var2 = (class57) class658.field9176.method2088(-152);
        }
        return false;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public final void method64(byte arg0) {
        ++field5131;
        int var2 = -31 % ((-71 - arg0) / 39);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(Loa;I)V")
    public final void method65(class43 arg0, int arg1) {
        this.field5132.method3210(true, arg0);
        ++field5134;
        if (arg1 > -121) {
            this.field5144 = null;
        }
    }
}
