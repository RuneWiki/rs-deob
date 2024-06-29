import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class197 extends class189 {

    @OriginalMember(owner = "client!vh", name = "Ic", descriptor = "[Lsg;")
    public static class169[] field3874 = new class169[100];

    @OriginalMember(owner = "client!vh", name = "Nc", descriptor = "Luh;")
    public static class188 field3879 = new class188();

    @OriginalMember(owner = "client!vh", name = "Oc", descriptor = "I")
    public static int field3880 = 500;

    @OriginalMember(owner = "client!vh", name = "Pc", descriptor = "Lsg;")
    public static class169 field3881 = class165.method1060("Texturen geladen)3", 1536);

    @OriginalMember(owner = "client!vh", name = "Qc", descriptor = "Lsg;")
    public static class169 field3882 = class165.method1060("zur-Uck auf die RuneScape)2Webseite gehen", 1536);

    @OriginalMember(owner = "client!vh", name = "Jc", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!vh", name = "Kc", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!vh", name = "Lc", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!vh", name = "Mc", descriptor = "I")
    public static int field3878;

    @OriginalMember(owner = "client!vh", name = "Gc", descriptor = "Ltd;")
    public class175 field3872;

    @OriginalMember(owner = "client!vh", name = "Hc", descriptor = "[I")
    public static int[] field3873;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)Z")
    public static final boolean method1293(boolean arg0) {
        ++field3876;
        class21 var1 = class142.field2654;
        synchronized (class142.field2654) {
            if (arg0) {
                field3873 = null;
            }
            if (class182.field3555 == class107.field1950) {
                return false;
            } else {
                class60.field1119 = class64.field1184[class107.field1950];
                class35.field702 = class70.field1312[class107.field1950];
                class107.field1950 = class107.field1950 + 1 & 127;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "(I)Z")
    public final boolean method1249(int arg0) {
        if (arg0 != -5701) {
            method1294(-10, -105, -37);
        }
        ++field3875;
        return this.field3872 != null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public static final void method1294(int arg0, int arg1, int arg2) {
        ++field3877;
        class75 var3 = class154.method1008((byte) -101, arg0);
        int var4 = var3.field1414;
        int var5 = var3.field1419;
        int var6 = var3.field1422;
        int var7 = class140.field2605[-var5 + var6];
        if (arg2 < 0 || ~var7 > ~arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class6.field119[var4] = class10.method56(class150.method984(var8, arg2 << var5), class150.method984(class6.field119[var4], ~var8));
        if (arg1 > -73) {
            field3880 = -61;
        }
    }

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "(I)V")
    public static void method1295(int arg0) {
        field3881 = null;
        field3879 = null;
        field3874 = null;
        if (arg0 == 4418) {
            field3882 = null;
            field3873 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIIIII)V")
    public final void method29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3878;
        if (this.field3872 != null) {
            class174 var10 = ~super.field3697 != 0 && super.field3668 == 0 ? class159.method1021((byte) 125, super.field3697) : null;
            class174 var11 = ~super.field3683 == 0 || ~super.field3716 == ~super.field3683 && var10 != null ? null : class159.method1021((byte) 84, super.field3683);
            class24 var12 = this.field3872.method1172(var10, super.field3706, super.field3664, -71, var11);
            if (var12 != null) {
                class24 var13 = null;
                if (~super.field3703 != 0 && ~super.field3684 != 0) {
                    var13 = class45.method286((byte) 127, super.field3703).method467(super.field3684, 17423);
                    if (var13 != null) {
                        var13.method164(0, -super.field3671, 0);
                    }
                }
                if (var13 != null) {
                    var12 = ((class30) var12).method207(var13);
                }
                if (~this.field3872.field3392 == -2) {
                    var12.field515 = true;
                }
                var12.method29(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                super.field84 = var12.field84;
            }
        }
    }
}
