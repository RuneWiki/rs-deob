import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class27 extends class315 {

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field280 = -2;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public int field285;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "Lfo;")
    public class418 field289;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "[Lrn;")
    public static class417[] field281;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Z)Lnf;")
    public static final class79 method182(boolean arg0) {
        field284++;
        try {
            if (arg0) {
                method184(true, 35, -37, -85);
            }
            return (class79) Class.forName("vr").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method183(byte arg0) {
        if (arg0 == 24) {
            field281 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZIII)V")
    public static final void method184(boolean arg0, int arg1, int arg2, int arg3) {
        int var4 = class409.field5605 * arg2 >> 8;
        if (arg0) {
            return;
        }
        field287++;
        if (var4 != 0 && arg3 != -1) {
            class329.method2057(false, arg3, -94, var4, 0, class233.field3399);
            class468.field6598 = true;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BLkk;)Lta;")
    public static final class409 method185(byte arg0, class161 arg1) {
        if (arg0 < 18) {
            method182(true);
        }
        field288++;
        return new class409(arg1.method1163(9988), arg1.method1163(9988), arg1.method1163(9988), arg1.method1163(9988), arg1.method1163(9988), arg1.method1163(9988), arg1.method1163(9988), arg1.method1163(9988), arg1.method1178((byte) 63), arg1.method1172((byte) -113));
    }
}
