import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class235 extends class89 {

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "[I")
    public static int[] field4197 = new int[2];

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "I")
    public static int field4196 = 0;

    @OriginalMember(owner = "client!wf", name = "p", descriptor = "[Lab;")
    public static class178[] field4202 = new class178[50];

    @OriginalMember(owner = "client!wf", name = "s", descriptor = "Lhh;")
    public static class163 field4205 = class137.method1065("Nehmen", 17);

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!wf", name = "o", descriptor = "I")
    public static int field4201;

    @OriginalMember(owner = "client!wf", name = "r", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!wf", name = "t", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!wf", name = "q", descriptor = "Lgj;")
    public static class126 field4203;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "Lo;")
    public static class186 field4200;

    @OriginalMember(owner = "client!wf", name = "u", descriptor = "Lmf;")
    public static class83 field4207;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lkg;")
    public static final class162 method1634(Throwable arg0, String arg1) {
        field4206++;
        class162 var2;
        if ((arg0 instanceof class162)) {
            var2 = (class162) arg0;
            var2.field2963 = var2.field2963 + ' ' + arg1;
        } else {
            var2 = new class162(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)V")
    public static final void method1635(int arg0, int arg1) {
        if (arg1 != 32) {
            field4203 = null;
        }
        class258.field4510 = new int[arg0];
        field4197 = new int[arg0];
        class106.field2013 = new int[arg0];
        field4198++;
        class215.field3921 = new int[arg0];
        class134.field2598 = new int[arg0];
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static void method1636(int arg0) {
        if (arg0 != -5987) {
            method1636(-102);
        }
        field4197 = null;
        field4202 = null;
        field4200 = null;
        field4203 = null;
        field4207 = null;
        field4205 = null;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IZIII)V")
    public static final void method1637(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field4199++;
        if (class114.method906(0, arg0)) {
            class69.method485(-1, arg4, class109.field2060[arg0], arg1, -1, arg2);
            if (arg3 != 50) {
                method1636(-82);
            }
        }
    }
}
