import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class13 extends class601 {

    @OriginalMember(owner = "client!af", name = "u", descriptor = "Luv;")
    public static class755 field127 = null;

    @OriginalMember(owner = "client!af", name = "t", descriptor = "Ljava/lang/String;")
    public static String field126 = null;

    @OriginalMember(owner = "client!af", name = "o", descriptor = "Lwn;")
    public static class585 field121 = new class585("", 17);

    @OriginalMember(owner = "client!af", name = "l", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!af", name = "m", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!af", name = "p", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!af", name = "q", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!af", name = "r", descriptor = "I")
    public static int field124;

    @OriginalMember(owner = "client!af", name = "s", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!af", name = "v", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!af", name = "n", descriptor = "[[Z")
    public static boolean[][] field120;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        int var3 = -122 / ((arg0 - 22) / 34);
        ++field122;
        super.field8131 = arg1;
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public static void method59(byte arg0) {
        if (arg0 != 65) {
            method59((byte) 61);
        }
        field120 = null;
        field127 = null;
        field121 = null;
        field126 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(I)Z")
    public final boolean method60(int arg0) {
        ++field124;
        if (super.field8137.method2161(arg0 + -2048)) {
            return false;
        } else {
            if (arg0 != 2048) {
                this.method36(-51, (byte) 109);
            }
            return super.field8137.method2153(-9) == class540.field7508;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        ++field123;
        if (super.field8137.method2161(0)) {
            return 3;
        } else if (super.field8137.method2153(-9) == class540.field7508) {
            if (~arg0 == -1) {
                if (super.field8137.field4765.method3375(0) == 1) {
                    return 2;
                }
                if (~super.field8137.field4792.method3641(0) == -2) {
                    return 2;
                }
                if (super.field8137.field4791.method40(arg1 + -22) > 0) {
                    return 2;
                }
            }
            return 1;
        } else {
            if (arg1 != 22) {
                field120 = null;
            }
            return 3;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            field120 = null;
        }
        ++field118;
        return 1;
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(ILqea;)V")
    public class13(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        int var2 = 54 % ((59 - arg0) / 33);
        ++field119;
        if (super.field8137.method2153(-9) != class540.field7508) {
            super.field8131 = 1;
        } else if (super.field8137.method2161(0)) {
            super.field8131 = 0;
        }
        if (super.field8131 != 0 && ~super.field8131 != -2) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!af", name = "<init>", descriptor = "(Lqea;)V")
    public class13(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(I)V")
    public static final void method61(int arg0) {
        ++field125;
        if (class320.field4445 != null) {
            try {
                String var1 = class320.field4445.getParameter("cookiehost");
                int var2 = (int) (class97.method664((byte) -50) / 86400000L) - 11745;
                String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
                class69.method539("document.cookie=\"" + var3 + "\"", class320.field4445, -23636);
                if (arg0 != -4006) {
                    method59((byte) -81);
                }
            } catch (Throwable var4) {
            }
        }
    }

    @OriginalMember(owner = "client!af", name = "d", descriptor = "(I)I")
    public final int method62(int arg0) {
        if (arg0 != 0) {
            return 65;
        } else {
            ++field128;
            return super.field8131;
        }
    }
}
