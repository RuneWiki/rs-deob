import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class182 {

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "Lsg;")
    private static class169 field3540 = class165.method1060("You can(Wt add yourself to your own friend list)3", 1536);

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "[S")
    public static short[] field3545 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "Lsg;")
    public static class169 field3541 = class165.method1060("p11_full", 1536);

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field3546 = 0;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "[I")
    public static int[] field3547 = new int[32768];

    @OriginalMember(owner = "client!ub", name = "q", descriptor = "Lsg;")
    public static class169 field3556 = field3540;

    @OriginalMember(owner = "client!ub", name = "p", descriptor = "I")
    public static int field3555 = 0;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "I")
    public static int field3550 = -1;

    @OriginalMember(owner = "client!ub", name = "j", descriptor = "Lcb;")
    public static class22 field3549 = new class22();

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!ub", name = "r", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!ub", name = "t", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "J")
    public long field3543;

    @OriginalMember(owner = "client!ub", name = "o", descriptor = "Loa;")
    public static class127 field3554;

    @OriginalMember(owner = "client!ub", name = "s", descriptor = "Lbb;")
    public static class13 field3558;

    @OriginalMember(owner = "client!ub", name = "m", descriptor = "Lub;")
    public class182 field3552;

    @OriginalMember(owner = "client!ub", name = "n", descriptor = "Lub;")
    public class182 field3553;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "[I")
    public static int[] field3544;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V")
    public static void method1210(int arg0) {
        field3554 = null;
        field3558 = null;
        field3547 = null;
        field3541 = null;
        field3549 = null;
        field3544 = null;
        if (arg0 > -93) {
            field3541 = null;
        }
        field3556 = null;
        field3540 = null;
        field3545 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIIIIIZIII)V")
    public static final void method1211(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9) {
        field3551++;
        class105 var10 = null;
        for (class105 var11 = (class105) class57.field1056.method145(0); var11 != null; var11 = (class105) class57.field1056.method152((byte) -127)) {
            if (var11.field1940 == arg1 && var11.field1921 == arg5 && var11.field1932 == arg0 && var11.field1931 == arg9) {
                var10 = var11;
                break;
            }
        }
        if (arg6) {
            field3546 = -33;
        }
        if (var10 == null) {
            var10 = new class105();
            var10.field1932 = arg0;
            var10.field1931 = arg9;
            var10.field1940 = arg1;
            var10.field1921 = arg5;
            class21.method141((byte) -96, var10);
            class57.field1056.method149(0, var10);
        }
        var10.field1928 = arg7;
        var10.field1927 = arg3;
        var10.field1926 = arg8;
        var10.field1930 = arg2;
        var10.field1938 = arg4;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z")
    public final boolean method1212(int arg0) {
        int var2 = -37 % ((44 - arg0) / 57);
        field3542++;
        return this.field3552 != null;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(I)V")
    public final void method1213(int arg0) {
        field3557++;
        if (this.field3552 == null) {
            return;
        }
        this.field3552.field3553 = this.field3553;
        this.field3553.field3552 = this.field3552;
        this.field3552 = null;
        if (arg0 != 9104) {
            method1210(-75);
        }
        this.field3553 = null;
    }
}
