import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aea")
public class class258 extends class30 {

    @OriginalMember(owner = "client!aea", name = "d", descriptor = "Ltg;")
    public static class605 field4042 = new class605();

    @OriginalMember(owner = "client!aea", name = "h", descriptor = "Lfa;")
    public static class564 field4046 = new class564();

    @OriginalMember(owner = "client!aea", name = "j", descriptor = "I")
    public static int field4048 = 0;

    @OriginalMember(owner = "client!aea", name = "i", descriptor = "Ltm;")
    public static class334 field4047 = new class334(17, -1);

    @OriginalMember(owner = "client!aea", name = "e", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!aea", name = "f", descriptor = "I")
    public static int field4044;

    @OriginalMember(owner = "client!aea", name = "g", descriptor = "[Lbg;")
    public static class328[] field4045;

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(ILla;)V")
    public static final void method1734(int arg0, class422 arg1) {
        class424.field6234 = arg1.method2629("p11_full", 10912);
        field4043++;
        if (arg0 != 0) {
            field4047 = null;
        }
        class715.field10041 = arg1.method2629("p12_full", 10912);
        class719.field10082 = arg1.method2629("b12_full", 10912);
    }

    @OriginalMember(owner = "client!aea", name = "a", descriptor = "(I)V")
    public static void method1735(int arg0) {
        field4047 = null;
        field4042 = null;
        if (arg0 < 59) {
            field4048 = -81;
        }
        field4046 = null;
        field4045 = null;
    }
}
