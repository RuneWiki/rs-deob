import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class180 extends class39 {

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "I")
    private int field2866;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "Lfd;")
    private static class219 field2865;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "()V", line = 3)
    public final void method311() {
        field2865.method1390(this.field2866, this.field568);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "()I", line = 7)
    public final int method302() {
        return field2865.method1393(true, this.field2866);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "()V", line = 10)
    public final void method299() {
        field2865.method1394(-14094, this.field2866);
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "()V", line = 13)
    public final void method301() {
        field2865.method1391(10991, this.field2866);
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 16)
    public final void method298(Component arg0) throws Exception {
        field2865.method1389(-19045, class230.field3728, arg0, class55.field887);
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(I)V", line = 19)
    public final void method312(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2865.method1392(this.field2866, arg0, (byte) -114);
    }

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "()V", line = 25)
    public static void method1153() {
        field2865 = null;
    }

    @OriginalMember(owner = "client!aj", name = "<init>", descriptor = "(Llh;I)V", line = 28)
    public class180(class282 arg0, int arg1) {
        field2865 = arg0.method1872((byte) 125);
        this.field2866 = arg1;
    }
}
