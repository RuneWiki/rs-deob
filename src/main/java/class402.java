import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public class class402 extends class80 {

    @OriginalMember(owner = "client!ks", name = "v", descriptor = "I")
    public int field5594;

    @OriginalMember(owner = "client!ks", name = "x", descriptor = "I")
    public int field5596;

    @OriginalMember(owner = "client!ks", name = "w", descriptor = "I")
    public int field5595;

    @OriginalMember(owner = "client!ks", name = "q", descriptor = "I")
    public int field5589;

    @OriginalMember(owner = "client!ks", name = "s", descriptor = "I")
    public int field5591;

    @OriginalMember(owner = "client!ks", name = "p", descriptor = "I")
    public int field5588;

    @OriginalMember(owner = "client!ks", name = "r", descriptor = "I")
    public static int field5590;

    @OriginalMember(owner = "client!ks", name = "t", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!ks", name = "u", descriptor = "I")
    public static int field5593;

    @OriginalMember(owner = "client!ks", name = "y", descriptor = "I")
    public static int field5597;

    @OriginalMember(owner = "client!ks", name = "z", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(Z)I")
    public static final int method2292(boolean arg0) {
        field5590++;
        if (!arg0) {
            method2292(false);
        }
        if (class164.field2504 == null) {
            return class199.field2943 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Lfw;Ldg;IIIIIIIIIII)V")
    public class402(class52 arg0, class377 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
        this.field5594 = arg10;
        this.field5596 = arg9;
        this.field5595 = arg8;
        this.field5589 = arg11;
        this.field5591 = arg7;
        this.field5588 = arg12;
    }

    @OriginalMember(owner = "client!ks", name = "b", descriptor = "(I)V")
    public static final void method2293(int arg0) {
        class104.field1406 = class662.method3669(true, 8, 0.4F, (byte) 120, 4, 35, 2048, 8);
        field5597++;
        if (arg0 >= -113) {
            method2292(true);
        }
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(I)Lhs;")
    public final class295 method52(int arg0) {
        field5592++;
        if (arg0 != -14151) {
            this.field5595 = 86;
        }
        return class125.field1743;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(CII)I")
    public static final int method2294(char arg0, int arg1, int arg2) {
        field5593++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            arg0 = Character.toLowerCase(arg0);
            var3 = (arg0 << 4) + 1;
        }
        if (arg0 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return arg2 > -103 ? -110 : var3;
    }

    @OriginalMember(owner = "client!ks", name = "a", descriptor = "(ILjava/lang/String;ZLjava/lang/String;)V")
    public static final void method2295(int arg0, String arg1, boolean arg2, String arg3) {
        class10.field203 = arg2;
        class374.field5302 = arg1;
        class592.field8248 = arg3;
        field5598++;
        if (!class10.field203 && class86.field1181 != 3 && (class592.field8248.equals("") || class374.field5302.equals(""))) {
            class35.method161(3, (byte) -82);
            return;
        }
        class421.field5950 = false;
        if (arg0 != 31644) {
            method2294('P', 69, -11);
        }
        if (class86.field1181 != 1) {
            class632.field8849 = 0;
            class31.field368 = -1;
        }
        class35.method161(-3, (byte) -82);
        class631.field8808 = 0;
        class136.field1917 = 0;
        class471.field6576 = 1;
    }
}
