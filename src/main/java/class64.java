import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class64 extends class550 {

    @OriginalMember(owner = "client!qn", name = "F", descriptor = "I")
    private int field1243;

    @OriginalMember(owner = "client!qn", name = "G", descriptor = "Lee;")
    private static class676 field1244;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "()V", line = 3)
    public final void method662() {
        field1244.method3110((byte) 98, this.field1243);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "()I", line = 6)
    public final int method663() {
        return field1244.method3113((byte) -93, this.field1243);
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "()V", line = 11)
    public static void method664() {
        field1244 = null;
    }

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "()V", line = 14)
    public final void method665() {
        field1244.method3111(this.field1243, (byte) 122);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 17)
    public final void method666(Component arg0) throws Exception {
        field1244.method3114(class103.field1834, class86.field1544, arg0, 27929);
    }

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "()V", line = 20)
    public final void method667() {
        field1244.method3112(this.field1243, super.field7569);
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Lwea;I)V", line = 22)
    public class64(class158 arg0, int arg1) {
        field1244 = (class676) arg0.method1218(21);
        this.field1243 = arg1;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 27)
    public final void method668(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field1244.method3115(arg0, this.field1243, (byte) 112);
        }
    }
}
