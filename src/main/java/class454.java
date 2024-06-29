import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lv")
public class class454 extends class440 {

    @OriginalMember(owner = "client!lv", name = "K", descriptor = "I")
    private int field6637;

    @OriginalMember(owner = "client!lv", name = "J", descriptor = "Lvd;")
    private static class662 field6636;

    @OriginalMember(owner = "client!lv", name = "d", descriptor = "()V", line = 3)
    public final void method1465() {
        field6636.method1756(-122, this.field6637);
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "()I", line = 6)
    public final int method1463() {
        return field6636.method1755(this.field6637, 2);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "()V", line = 9)
    public final void method1462() {
        field6636.method1758(this.field6637, super.field6476);
    }

    @OriginalMember(owner = "client!lv", name = "b", descriptor = "()V", line = 13)
    public final void method1464() {
        field6636.method1754((byte) 117, this.field6637);
    }

    @OriginalMember(owner = "client!lv", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 16)
    public final void method1466(Component arg0) throws Exception {
        field6636.method1757(true, class375.field5471, arg0, class215.field3148);
    }

    @OriginalMember(owner = "client!lv", name = "<init>", descriptor = "(Lft;I)V", line = 19)
    public class454(class188 arg0, int arg1) {
        field6636 = (class662) arg0.method1569(6364);
        this.field6637 = arg1;
    }

    @OriginalMember(owner = "client!lv", name = "c", descriptor = "(I)V", line = 24)
    public final void method1461(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        } else {
            field6636.method1753(this.field6637, arg0, 104);
        }
    }

    @OriginalMember(owner = "client!lv", name = "e", descriptor = "()V", line = 30)
    public static void method3512() {
        field6636 = null;
    }
}
