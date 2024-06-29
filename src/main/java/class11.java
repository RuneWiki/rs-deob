import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class11 extends class130 {

    @OriginalMember(owner = "client!md", name = "r", descriptor = "Lqj;")
    public class196 field126;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "Lqj;")
    public static class196 field125 = class80.method502(")4g", -48);

    @OriginalMember(owner = "client!md", name = "v", descriptor = "[Lrf;")
    public static class115[] field130 = new class115[50];

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field127;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lbk;B)V")
    public static final void method50(class136 arg0, byte arg1) {
        if (arg1 == -60) {
            class87.field1281 = arg0;
            field128++;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)V")
    public static void method51(boolean arg0) {
        field130 = null;
        if (arg0) {
            method52(-40, null);
        }
        field125 = null;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V")
    public class11() {
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Lqj;)V")
    public class11(class196 arg0) {
        this.field126 = arg0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILp;)Lbg;")
    public static final class244 method52(int arg0, class56 arg1) {
        if (arg0 != -21508) {
            field130 = null;
        }
        field129++;
        return new class244(arg1.method338((byte) -111), arg1.method338((byte) -88), arg1.method338((byte) 105), arg1.method338((byte) 127), arg1.method338((byte) 112), arg1.method338((byte) 105), arg1.method338((byte) 105), arg1.method338((byte) -118), arg1.method328(-1974), arg1.method367(1));
    }
}
