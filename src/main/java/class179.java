import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class179 extends class15 {

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    private int field3349;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "Lqd;")
    private static class178 field3350;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "()I")
    public final int method105() {
        return field3350.method1191(this.field3349, -119);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "()V")
    public final void method108() {
        field3350.method1189(this.field3349, false);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lbi;I)V")
    public class179(class21 arg0, int arg1) {
        field3350 = arg0.method145(true);
        this.field3349 = arg1;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "()V")
    public final void method107() {
        field3350.method1192(this.field3349, 70);
    }

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "()V")
    public static void method1193() {
        field3350 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "()V")
    public final void method104() {
        field3350.method1190(this.field3349, super.field221);
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V")
    public final void method111(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field3350.method1187(arg0, this.field3349, 37);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public final void method106(Component arg0) throws Exception {
        field3350.method1188(class32.field650, arg0, class72.field1278, (byte) -113);
    }
}
