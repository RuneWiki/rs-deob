import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class130 extends class6 {

    @OriginalMember(owner = "client!se", name = "sd", descriptor = "I")
    public static int field2964 = 0;

    @OriginalMember(owner = "client!se", name = "vd", descriptor = "Lja;")
    public static class62 field2967 = class30.method243(43, "Benutzen Sie bitte eine andere Welt)3");

    @OriginalMember(owner = "client!se", name = "wd", descriptor = "Lc;")
    public static class18 field2968 = new class18(64);

    @OriginalMember(owner = "client!se", name = "yd", descriptor = "Lja;")
    public static class62 field2970 = class30.method243(43, "Regeln versto-8en hat)3");

    @OriginalMember(owner = "client!se", name = "xd", descriptor = "Lc;")
    public static class18 field2969 = new class18(50);

    @OriginalMember(owner = "client!se", name = "zd", descriptor = "Lja;")
    private static class62 field2971 = class30.method243(43, "Create a free account");

    @OriginalMember(owner = "client!se", name = "Bd", descriptor = "I")
    public static int field2973 = 1;

    @OriginalMember(owner = "client!se", name = "Dd", descriptor = "Lja;")
    private static class62 field2975 = class30.method243(43, " has logged out)3");

    @OriginalMember(owner = "client!se", name = "Ad", descriptor = "Lja;")
    public static class62 field2972 = field2975;

    @OriginalMember(owner = "client!se", name = "Fd", descriptor = "Lja;")
    public static class62 field2977 = field2971;

    @OriginalMember(owner = "client!se", name = "Ed", descriptor = "I")
    public static int field2976 = 0;

    @OriginalMember(owner = "client!se", name = "Hd", descriptor = "[I")
    public static int[] field2979 = new int[100];

    @OriginalMember(owner = "client!se", name = "qd", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!se", name = "rd", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!se", name = "td", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!se", name = "Cd", descriptor = "Lq;")
    public static class114 field2974;

    @OriginalMember(owner = "client!se", name = "ud", descriptor = "Lua;")
    public class138 field2966;

    @OriginalMember(owner = "client!se", name = "Gd", descriptor = "[Lq;")
    public static class114[] field2978;

    @OriginalMember(owner = "client!se", name = "Id", descriptor = "[Lic;")
    public static class58[] field2980;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(B)Z")
    public final boolean method66(byte arg0) {
        ++field2962;
        if (arg0 != -24) {
            field2976 = -84;
        }
        return this.field2966 != null;
    }

    @OriginalMember(owner = "client!se", name = "f", descriptor = "(B)Lvb;")
    public final class145 method321(byte arg0) {
        ++field2963;
        if (this.field2966 == null) {
            return null;
        } else {
            if (arg0 != 3) {
                field2974 = null;
            }
            class12 var2 = ~super.field177 != 0 && ~super.field155 == -1 ? class141.method1121(super.field177, arg0 + -24735) : null;
            class12 var3 = super.field191 == -1 || ~super.field191 == ~super.field178 && var2 != null ? null : class141.method1121(super.field191, -24732);
            class145 var4 = this.field2966.method1111(var2, super.field169, (byte) -62, super.field161, var3);
            if (var4 == null) {
                return null;
            } else {
                var4.method1163();
                super.field165 = var4.field3265;
                if (super.field195 != -1 && ~super.field184 != 0) {
                    class145 var5 = class38.method289(super.field195, arg0 + 2113).method961(super.field184, -127);
                    if (var5 != null) {
                        var5.method1159(0, -super.field196, 0);
                        class145[] var6 = new class145[] { var4, var5 };
                        var4 = new class145(var6, 2);
                    }
                }
                if (~this.field2966.field3178 == -2) {
                    var4.field3373 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "g", descriptor = "(I)V")
    public static void method1053(int arg0) {
        field2975 = null;
        field2978 = null;
        field2968 = null;
        field2980 = null;
        int var1 = -67 % ((-76 - arg0) / 33);
        field2979 = null;
        field2972 = null;
        field2969 = null;
        field2971 = null;
        field2967 = null;
        field2974 = null;
        field2977 = null;
        field2970 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lhe;II)Lja;")
    public static final class62 method1054(class54 arg0, int arg1, int arg2) {
        ++field2965;
        if (!class146.method1167(arg1, class22.method171(arg0, (byte) -124), true) && arg0.field1342 == null) {
            return null;
        } else if (arg2 != 15547) {
            return null;
        } else if (arg0.field1229 != null && arg0.field1229.length > arg1 && arg0.field1229[arg1] != null && ~arg0.field1229[arg1].method464((byte) 124).method460((byte) 38) != -1) {
            return arg0.field1229[arg1];
        } else {
            return class77.field1900 ? class70.method594(new class62[] { class77.field1905, class31.method249(true, arg1) }, 1229) : null;
        }
    }
}
