import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class120 extends class38 {

    @OriginalMember(owner = "client!rb", name = "Vc", descriptor = "Lhe;")
    public static class54 field2791 = class6.method58("ams", false);

    @OriginalMember(owner = "client!rb", name = "Tc", descriptor = "Lse;")
    public static class130 field2789 = new class130();

    @OriginalMember(owner = "client!rb", name = "Zc", descriptor = "[I")
    public static int[] field2795 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!rb", name = "ad", descriptor = "Lhe;")
    private static class54 field2796 = class6.method58("Players", false);

    @OriginalMember(owner = "client!rb", name = "bd", descriptor = "Lhe;")
    public static class54 field2797 = field2796;

    @OriginalMember(owner = "client!rb", name = "Xc", descriptor = "Lhe;")
    private static class54 field2793 = class6.method58("Please check your message)2centre for details)3", false);

    @OriginalMember(owner = "client!rb", name = "Yc", descriptor = "Lhe;")
    public static class54 field2794 = field2793;

    @OriginalMember(owner = "client!rb", name = "dd", descriptor = "Lhe;")
    public static class54 field2799 = class6.method58("W-=hlen Sie eine Welt", false);

    @OriginalMember(owner = "client!rb", name = "cd", descriptor = "Lhe;")
    public static class54 field2798 = class6.method58("(U", false);

    @OriginalMember(owner = "client!rb", name = "ed", descriptor = "Lhe;")
    private static class54 field2800 = class6.method58("Connecting to update server", false);

    @OriginalMember(owner = "client!rb", name = "fd", descriptor = "Lhe;")
    public static class54 field2801 = field2800;

    @OriginalMember(owner = "client!rb", name = "Pc", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!rb", name = "Qc", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!rb", name = "Rc", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!rb", name = "Uc", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!rb", name = "Wc", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!rb", name = "Sc", descriptor = "Lba;")
    public class9 field2788;

    @OriginalMember(owner = "client!rb", name = "h", descriptor = "(I)V")
    public static void method930(int arg0) {
        if (arg0 != 2) {
            field2793 = null;
        }
        field2797 = null;
        field2800 = null;
        field2791 = null;
        field2795 = null;
        field2794 = null;
        field2789 = null;
        field2798 = null;
        field2793 = null;
        field2796 = null;
        field2801 = null;
        field2799 = null;
    }

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "(Z)Loa;")
    public final class98 method184(boolean arg0) {
        ++field2787;
        if (arg0) {
            method930(88);
        }
        if (this.field2788 == null) {
            return null;
        } else {
            class142 var2 = super.field981 != -1 && super.field926 == 0 ? class135.method1010(super.field981, (byte) -111) : null;
            class142 var3 = super.field961 == -1 || super.field969 == super.field961 && var2 != null ? null : class135.method1010(super.field961, (byte) -127);
            class98 var4 = this.field2788.method71(0, var2, var3, super.field962, super.field943);
            if (var4 == null) {
                return null;
            } else {
                var4.method777();
                super.field986 = var4.field1279;
                if (~super.field930 != 0 && super.field946 != -1) {
                    class98 var5 = class107.method813(-23222, super.field930).method371(-89, super.field946);
                    if (var5 != null) {
                        var5.method776(0, -super.field933, 0);
                        class98[] var6 = new class98[] { var4, var5 };
                        var4 = new class98(var6, 2);
                    }
                }
                if (this.field2788.field252 == 1) {
                    var4.field2454 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IBI)I")
    public static final int method931(int arg0, byte arg1, int arg2) {
        ++field2786;
        if (~arg2 <= -3) {
            int var3 = method931(arg0 * arg0, (byte) -31, arg2 >> 1);
            if ((arg2 & 1) != 0) {
                var3 = arg0 * var3;
            }
            return var3;
        } else {
            if (arg1 != -31) {
                field2793 = null;
            }
            return arg2 == 1 ? arg0 : 1;
        }
    }

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "(I)Z")
    public final boolean method183(int arg0) {
        ++field2790;
        if (arg0 != -19456) {
            field2789 = null;
        }
        return this.field2788 != null;
    }
}
