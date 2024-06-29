import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class437 extends class192 {

    @OriginalMember(owner = "client!pg", name = "r", descriptor = "I")
    public int field6145 = -1;

    @OriginalMember(owner = "client!pg", name = "u", descriptor = "Z")
    public static boolean field6148 = false;

    @OriginalMember(owner = "client!pg", name = "q", descriptor = "I")
    public static int field6144;

    @OriginalMember(owner = "client!pg", name = "v", descriptor = "I")
    public int field6149;

    @OriginalMember(owner = "client!pg", name = "z", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!pg", name = "s", descriptor = "Lnq;")
    public static class268 field6146;

    @OriginalMember(owner = "client!pg", name = "y", descriptor = "Lms;")
    public static class453 field6152;

    @OriginalMember(owner = "client!pg", name = "t", descriptor = "Ljava/lang/String;")
    public String field6147;

    @OriginalMember(owner = "client!pg", name = "w", descriptor = "Ljava/lang/String;")
    public String field6150;

    @OriginalMember(owner = "client!pg", name = "x", descriptor = "[Lpo;")
    public static class333[] field6151;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)Lpo;")
    public final class333 method2745(boolean arg0) {
        ++field6153;
        if (!arg0) {
            field6146 = null;
        }
        return field6151[super.field2637];
    }

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "(I)V")
    public static void method2746(int arg0) {
        field6152 = null;
        field6146 = null;
        field6151 = null;
        if (arg0 < 51) {
            method2746(36);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lms;B)V")
    public static final void method2747(class453 arg0, byte arg1) {
        ++field6144;
        class453 var2 = class304.method1961(arg0, arg1 ^ 2115346157);
        if (arg1 != -35) {
            method2747((class453) null, (byte) 10);
        }
        int var3;
        int var4;
        if (var2 != null) {
            var3 = var2.field6447;
            var4 = var2.field6342;
        } else {
            var3 = class214.field2993;
            var4 = class47.field661;
        }
        class319.method2066(false, var3, var4, arg0, (byte) 81);
        class1.method5(var3, arg0, var4, -25599);
    }
}
