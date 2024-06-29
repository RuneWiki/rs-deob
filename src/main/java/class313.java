import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class313 extends class245 {

    @OriginalMember(owner = "client!ng", name = "H", descriptor = "I")
    private int field4121;

    @OriginalMember(owner = "client!ng", name = "I", descriptor = "Lwg;")
    private static class392 field4122;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()V", line = 3)
    public final void method681() {
        field4122.method2295(this.field4121, super.field3363);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 6)
    public final void method680(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field4122.method2298(arg0, -109, this.field4121);
        }
    }

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "()V", line = 12)
    public static void method1834() {
        field4122 = null;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "()V", line = 16)
    public final void method679() {
        field4122.method2296(this.field4121, -22376);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 20)
    public final void method678(Component arg0) throws Exception {
        field4122.method2299(class73.field1105, class658.field9343, -105, arg0);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "()I", line = 23)
    public final int method677() {
        return field4122.method2294(16486, this.field4121);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V", line = 26)
    public final void method682() {
        field4122.method2297(this.field4121, false);
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "(Lwd;I)V", line = 28)
    public class313(class248 arg0, int arg1) {
        field4122 = (class392) arg0.method1512((byte) 65);
        this.field4121 = arg1;
    }
}
