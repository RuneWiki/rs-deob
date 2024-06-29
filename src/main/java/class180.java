import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public abstract class class180 {

    @OriginalMember(owner = "client!ve", name = "c", descriptor = "Le;")
    public static class191 field3092 = class54.method368("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 2047);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "Le;")
    public static class191 field3093 = class54.method368("Wordpack geladen)3", 2047);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method1208(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)V")
    public static void method1209(boolean arg0) {
        if (!arg0) {
            field3092 = null;
            field3093 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method1210(int arg0, Component arg1);

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(Z)I")
    public abstract int method1211(boolean arg0);

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method1212(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg2 != 0) {
            method1209(false);
        }
        class8.field84 = (short) arg3;
        field3094++;
        class169.field2861 = (short) arg1;
    }
}
