import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class307 {

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lna;")
    private static class26 field5284 = class69.method505("Please wait )2 attempting to reestablish)3", (byte) -125);

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "Lna;")
    public static class26 field5285 = field5284;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "Ln;")
    public static class282 field5281 = new class282(64);

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "Lna;")
    private static class26 field5290 = class69.method505("glow2:", (byte) -127);

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "[I")
    public static int[] field5287 = new int[14];

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lna;")
    public static class26 field5289 = field5290;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "Lna;")
    public static class26 field5288 = field5290;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "Ln;")
    public static class282 field5291 = new class282(5);

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field5293 = -1;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "Ln;")
    public static class282 field5292 = new class282(50);

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "Lve;")
    public static class266 field5294;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V", line = 10)
    public static void method2147(byte arg0) {
        field5281 = null;
        field5289 = null;
        field5285 = null;
        if (arg0 >= -41) {
            method2149(-28, 103, -37);
        }
        field5284 = null;
        field5290 = null;
        field5287 = null;
        field5294 = null;
        field5292 = null;
        field5288 = null;
        field5291 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IIIILth;Lth;IIJ)V", line = 31)
    public static final void method2148(int arg0, int arg1, int arg2, int arg3, class86 arg4, class86 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class267 var10 = new class267();
        var10.field4408 = arg8;
        var10.field4415 = arg1 * 128 + 64;
        var10.field4405 = arg2 * 128 + 64;
        var10.field4419 = arg3;
        var10.field4409 = arg4;
        var10.field4412 = arg5;
        var10.field4416 = arg6;
        var10.field4421 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class36.field585[var11][arg1][arg2] == null) {
                class36.field585[var11][arg1][arg2] = new class55(var11, arg1, arg2);
            }
        }
        class36.field585[arg0][arg1][arg2].field890 = var10;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)Ljh;", line = 107)
    public static final class267 method2149(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        return var3 == null ? null : var3.field890;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)Lna;", line = 131)
    public static final class26 method2150(int arg0, byte arg1) {
        field5286++;
        if (arg0 >= 999999999) {
            if (arg1 != -78) {
                method2147((byte) -8);
            }
            return class244.field4014;
        } else {
            return class149.method1019((byte) 9, arg0);
        }
    }
}
