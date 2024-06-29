import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class11 extends class116 {

    @OriginalMember(owner = "client!db", name = "V", descriptor = "I")
    public int field169 = 0;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "Lda;")
    public static class275 field161 = class255.method1672(107, " (X");

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "Lda;")
    public static class275 field164 = class255.method1672(97, "b12_full");

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field168 = 0;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "I")
    public static int field167 = -1;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!db", name = "K", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!db", name = "L", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field160;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!db", name = "P", descriptor = "Lma;")
    public static class105 field163;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "Llb;")
    public static class274 field165;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IZLij;)V")
    private final void method43(int arg0, boolean arg1, class85 arg2) {
        field156++;
        if (!arg1 && arg0 == 2) {
            this.field169 = arg2.method608(18);
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)V")
    public static final void method44(int arg0) {
        if (class58.field983.toLowerCase().indexOf("microsoft") == -1) {
            class225.field3803[45] = 26;
            class225.field3803[44] = 71;
            class225.field3803[92] = 74;
            class225.field3803[46] = 72;
            class225.field3803[47] = 73;
            class225.field3803[59] = 57;
            class225.field3803[61] = 27;
            if (class58.field986 == null) {
                class225.field3803[192] = 58;
                class225.field3803[222] = 59;
            } else {
                class225.field3803[222] = 58;
                class225.field3803[192] = 28;
                class225.field3803[520] = 59;
            }
            class225.field3803[93] = 43;
            class225.field3803[91] = 42;
        } else {
            class225.field3803[187] = 27;
            class225.field3803[190] = 72;
            class225.field3803[223] = 28;
            class225.field3803[186] = 57;
            class225.field3803[191] = 73;
            class225.field3803[221] = 43;
            class225.field3803[220] = 74;
            class225.field3803[192] = 58;
            class225.field3803[222] = 59;
            class225.field3803[219] = 42;
            class225.field3803[188] = 71;
            class225.field3803[189] = 26;
        }
        field160++;
        if (arg0 != 6617) {
            field165 = null;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILij;)V")
    public final void method45(int arg0, class85 arg1) {
        if (arg0 != 0) {
            this.method43(58, true, (class85) null);
        }
        while (true) {
            int var3 = arg1.method564((byte) 109);
            if (var3 == 0) {
                field158++;
                return;
            }
            this.method43(var3, false, arg1);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IBII)I")
    public static final int method46(int arg0, byte arg1, int arg2, int arg3) {
        field157++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            if (arg1 <= 31) {
                field166 = -66;
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLfd;)Z")
    public static final boolean method47(byte arg0, class229 arg1) {
        field162++;
        int var2 = -112 % ((-arg0 - 64) / 58);
        if (arg1.field3923 == null) {
            return false;
        }
        for (int var3 = 0; var3 < arg1.field3923.length; var3++) {
            int var4 = class245.method1611(false, arg1, var3);
            int var5 = arg1.field3911[var3];
            if (arg1.field3923[var3] == 2) {
                if (var5 <= var4) {
                    return false;
                }
            } else if (arg1.field3923[var3] == 3) {
                if (var4 <= var5) {
                    return false;
                }
            } else if (arg1.field3923[var3] == 4) {
                if (var4 == var5) {
                    return false;
                }
            } else if (var4 != var5) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)V")
    public static void method48(int arg0) {
        if (arg0 > -87) {
            field159 = -104;
        }
        field164 = null;
        field161 = null;
        field165 = null;
        field163 = null;
    }
}
