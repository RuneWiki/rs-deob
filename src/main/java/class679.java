import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class679 extends Canvas {

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field9495;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "[I")
    public static int[] field9491 = new int[2];

    @OriginalMember(owner = "client!fo", name = "i", descriptor = "Lqk;")
    public static class1 field9498 = new class1(89, 8);

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field9492;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field9493;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field9494;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field9496;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "I")
    public static int field9497;

    @OriginalMember(owner = "client!fo", name = "j", descriptor = "Lae;")
    public static class283 field9499;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Liv;")
    public static class634 field9490;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lvq;I)I")
    public static final int method3861(class500 arg0, int arg1) {
        field9497++;
        if (class157.field2039 == arg0) {
            return 5890;
        } else if (class656.field9260 == arg0) {
            return 34167;
        } else if (class224.field3416 == arg0) {
            return 34168;
        } else if (class41.field423 == arg0) {
            return 34166;
        } else {
            if (arg1 < 69) {
                method3861(null, -52);
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V")
    public static void method3862(int arg0) {
        field9498 = null;
        field9490 = null;
        field9499 = null;
        if (arg0 == 34166) {
            field9491 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field9495.paint(arg0);
        field9496++;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)Z")
    public static final boolean method3863(int arg0, int arg1) {
        field9493++;
        for (class171 var2 = (class171) class646.field9038.method1041(1048832); var2 != null; var2 = (class171) class646.field9038.method1033(-1)) {
            if (class651.method3728((byte) -76, var2.field2174) && ((long) arg1) == var2.field2179) {
                return true;
            }
        }
        if (arg0 >= -90) {
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fo", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field9495.update(arg0);
        field9492++;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class679(Component arg0) {
        this.field9495 = arg0;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V")
    public static final void method3864(boolean arg0) {
        if (!arg0) {
            method3861(null, 106);
        }
        field9494++;
        if (class783.field10746 > 1) {
            class688.field9602.method3503(class688.field9602.field8502, -124, 4);
        } else {
            class688.field9602.method3503(class688.field9602.field8502, -122, 2);
        }
    }
}
