import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class503 {

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lnea;")
    public static class664 field7113 = new class664(105, -1);

    @OriginalMember(owner = "client!md", name = "b", descriptor = "F")
    public static float field7114;

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field7115;

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public static int field7116;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(III)Z")
    public static final boolean method2896(int arg0, int arg1, int arg2) {
        if (arg2 > -57) {
            field7114 = -0.19440079F;
        }
        field7115++;
        return class158.method1102(arg1, (byte) -110, arg0) || class575.method3258(-5, arg1, arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public static void method2897(int arg0) {
        int var1 = -91 % ((33 - arg0) / 38);
        field7113 = null;
    }
}
