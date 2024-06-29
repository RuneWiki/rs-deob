import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class252 {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "B")
    private byte field3687;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    public int field3694;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field3690;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public int field3693;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public int field3689;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public int field3688;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "Lst;")
    public static class335 field3696 = new class335(46, 3);

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Lst;")
    public static class335 field3697 = new class335(48, 7);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "I")
    public static int field3692;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
    public final int method1722(byte arg0) {
        if (arg0 == -107) {
            field3692++;
            return this.field3687 & 0x7;
        } else {
            return -20;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
    public static void method1723(byte arg0) {
        field3697 = null;
        if (arg0 <= 71) {
            method1725(null, 42);
        }
        field3696 = null;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)I")
    public final int method1724(byte arg0) {
        field3691++;
        if (arg0 >= -90) {
            this.field3693 = -10;
        }
        return (this.field3687 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V")
    public class252() {
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Ldc;)V")
    public class252(class63 arg0) {
        this.field3687 = arg0.method491(false);
        this.field3694 = arg0.method482(-772591672);
        this.field3690 = arg0.method457(-14532);
        this.field3693 = arg0.method457(-14532);
        this.field3689 = arg0.method457(-14532);
        this.field3688 = arg0.method457(-14532);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public static final void method1725(Canvas arg0, int arg1) {
        field3686++;
        if (arg1 != 2228) {
            field3696 = null;
        }
        Dimension var2 = arg0.getSize();
        class139.method920(var2.height, var2.width, 1);
        if (class521.field7260 == 1) {
            class496.field6948.method1533(arg0, class559.field7774, class239.field3574);
        } else {
            class496.field6948.method1533(arg0, class462.field6420, class196.field2637);
        }
    }
}
