import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class62 {

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field759 = -1;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lc;")
    public static class436 field768;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lgj;")
    public class62 field761;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "Lgj;")
    public class62 field762;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "[I")
    public static int[] field760;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "[Laq;")
    public static class453[] field764;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BII)I", line = 7)
    public static final int method355(byte arg0, int arg1, int arg2) {
        field767++;
        if (arg2 == -2) {
            return 12345678;
        }
        if (arg0 >= -10) {
            method359(51);
        }
        if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lpn;Lpn;Z)V", line = 43)
    public static final void method356(class43 arg0, class43 arg1, boolean arg2) {
        if (arg1.field507 != null) {
            arg1.method263(false);
        }
        field766++;
        arg1.field507 = arg0.field507;
        arg1.field508 = arg0;
        arg1.field507.field508 = arg1;
        if (!arg2) {
            method356((class43) null, (class43) null, false);
        }
        arg1.field508.field507 = arg1;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIZI)Lup;", line = 61)
    public static final class244 method357(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field765++;
        class244 var5 = new class244();
        var5.field3245 = arg1;
        var5.field3240 = arg4;
        class282.field3678.method2227(var5, -8218, (long) arg2);
        class173.method1088(arg0, arg1);
        class453 var6 = class195.method1212(arg2, (byte) 49);
        if (var6 != null) {
            class303.method1923(var6, 10240);
        }
        if (class40.field485 != null) {
            class303.method1923(class40.field485, arg0 ^ 0x2800);
            class40.field485 = null;
        }
        class210.method1286(arg0 - 90);
        if (var6 != null) {
            class306.method1942(!arg3, -1, var6);
        }
        if (!arg3) {
            class93.method582(arg1);
        }
        if (!arg3 && class366.field4983 != -1) {
            class430.method2623(class366.field4983, true, 1);
        }
        return var5;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 99)
    public final void method358(int arg0) {
        field763++;
        if (this.field762 == null) {
            return;
        }
        this.field762.field761 = this.field761;
        this.field761.field762 = this.field762;
        this.field761 = null;
        if (arg0 != 42) {
            this.field761 = null;
        }
        this.field762 = null;
    }

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(I)V", line = 117)
    public static final void method359(int arg0) {
        if (class441.field6076.toLowerCase().indexOf("microsoft") == -1) {
            class209.field2542[45] = 26;
            class209.field2542[46] = 72;
            class209.field2542[59] = 57;
            class209.field2542[44] = 71;
            class209.field2542[93] = 43;
            class209.field2542[61] = 27;
            if (class441.field6096 == null) {
                class209.field2542[222] = 59;
                class209.field2542[192] = 58;
            } else {
                class209.field2542[192] = 28;
                class209.field2542[520] = 59;
                class209.field2542[222] = 58;
            }
            class209.field2542[47] = 73;
            class209.field2542[91] = 42;
            class209.field2542[92] = 74;
        } else {
            class209.field2542[188] = 71;
            class209.field2542[219] = 42;
            class209.field2542[220] = 74;
            class209.field2542[187] = 27;
            class209.field2542[222] = 59;
            class209.field2542[189] = 26;
            class209.field2542[192] = 58;
            class209.field2542[191] = 73;
            class209.field2542[190] = 72;
            class209.field2542[223] = 28;
            class209.field2542[221] = 43;
            class209.field2542[186] = 57;
        }
        field769++;
        if (arg0 != -25820) {
            field768 = null;
        }
    }

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "(I)V", line = 176)
    public static void method360(int arg0) {
        field764 = null;
        field760 = null;
        if (arg0 != 58) {
            method359(-88);
        }
        field768 = null;
    }
}
