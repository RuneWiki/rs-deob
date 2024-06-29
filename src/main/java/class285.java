import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public abstract class class285 {

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "I")
    public static int field4130 = 1;

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "I")
    public static int field4133 = 0;

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "Lgf;")
    public static class180 field4132 = new class180(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V")
    public static void method1788(int arg0) {
        if (arg0 == 1) {
            field4132 = null;
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(II)I")
    public static final int method1789(int arg0, int arg1) {
        if (arg1 >= -85) {
            method1789(-50, 59);
        }
        field4134++;
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Lcg;I)Lcg;")
    public abstract class90 method1790(class90 arg0, int arg1);
}
