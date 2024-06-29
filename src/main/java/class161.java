import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class161 extends class256 {

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "Ljd;")
    private static class86 field3025 = class122.method868("Starting 3d Library", true);

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "Ljd;")
    public static class86 field3021 = field3025;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "I")
    public static int field3024 = 0;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "Z")
    public static boolean field3029 = true;

    @OriginalMember(owner = "client!cg", name = "x", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!cg", name = "y", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!cg", name = "z", descriptor = "I")
    public int field3016;

    @OriginalMember(owner = "client!cg", name = "B", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!cg", name = "C", descriptor = "I")
    public static int field3019;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public static int field3022;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public int field3027;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public static int field3028;

    @OriginalMember(owner = "client!cg", name = "w", descriptor = "Lbj;")
    public static class151 field3013;

    @OriginalMember(owner = "client!cg", name = "A", descriptor = "Lbj;")
    public static class151 field3017;

    @OriginalMember(owner = "client!cg", name = "D", descriptor = "Ljd;")
    public class86 field3020;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)I")
    public final int method1169(int arg0) {
        ++field3028;
        return arg0 != 255 ? -74 : (int) super.field3759;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)J")
    public final long method1170(boolean arg0) {
        if (arg0) {
            method1172(69, 52);
        }
        ++field3018;
        return Long.MAX_VALUE & super.field4542;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I[B)V")
    public static final void method1171(int arg0, byte[] arg1) {
        ++field3019;
        class200 var2 = new class200(arg1);
        var2.field3565 += 2;
        int var3 = var2.method1408((byte) -77);
        if (arg0 != 0) {
            field3024 = 46;
        }
        if (var3 == 1) {
            boolean var4 = var2.method1408((byte) -128) == 1;
            if (var4) {
                class4.method27(arg0 + -1, var2);
            }
            class9.method77(-1, var2);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V")
    public static final void method1172(int arg0, int arg1) {
        ++field3023;
        if (~arg1 != 0) {
            if (class49.field1039[arg1]) {
                class22.field566.method1102(arg1, -2);
                if (class108.field2070[arg1] != null) {
                    boolean var2 = true;
                    for (int var3 = arg0; ~var3 > ~class108.field2070[arg1].length; ++var3) {
                        if (class108.field2070[arg1][var3] != null) {
                            if (class108.field2070[arg1][var3].field184 == 2) {
                                var2 = false;
                            } else {
                                class108.field2070[arg1][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class108.field2070[arg1] = null;
                    }
                    class49.field1039[arg1] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)V")
    public final void method1173(boolean arg0) {
        ++field3026;
        super.field4542 = class253.method1711((byte) -63) + 500L | Long.MIN_VALUE & super.field4542;
        class210.field3792.method991(this, arg0);
        if (!arg0) {
            this.method1174(73);
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)V")
    public final void method1174(int arg0) {
        super.field4542 |= Long.MIN_VALUE;
        ++field3014;
        if ((long) arg0 == this.method1170(false)) {
            class140.field2662.method991(this, true);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method1175(byte arg0) {
        field3021 = null;
        field3025 = null;
        field3013 = null;
        field3017 = null;
        if (arg0 != -103) {
            method1171(17, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)I")
    public final int method1176(byte arg0) {
        if (arg0 > -114) {
            return 62;
        } else {
            ++field3022;
            return (int) (255L & super.field3759 >>> 32);
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(II)V")
    public class161(int arg0, int arg1) {
        super.field3759 = (long) arg1 | (long) arg0 << 32;
    }
}
