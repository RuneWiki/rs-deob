import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class397 extends class214 {

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    private int field5950;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "Lmf;")
    private static class14 field5949;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(I)V")
    public final void method376(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field5949.method93(arg0, this.field5950, true);
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method380(Component arg0) throws Exception {
        field5949.method94(class215.field3079, 91, arg0, class29.field505);
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "()V")
    public static void method2592() {
        field5949 = null;
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "()V")
    public final void method379() {
        field5949.method92(this.field5950, 26853);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "()I")
    public final int method377() {
        return field5949.method95(this.field5950, (byte) 60);
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "()V")
    public final void method381() {
        field5949.method91(this.field5950, super.field3062);
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "()V")
    public final void method378() {
        field5949.method96(93, this.field5950);
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lud;I)V")
    public class397(class2 arg0, int arg1) {
        field5949 = arg0.method12(-2);
        this.field5950 = arg1;
    }
}
