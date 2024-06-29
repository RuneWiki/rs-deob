import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class583 {

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
    public static int field7741 = 328;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "I")
    public static int field7739 = -1;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "[Z")
    public static boolean[] field7742;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public static void method3204(int arg0) {
        field7742 = null;
        if (arg0 > -68) {
            field7739 = 32;
        }
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
    public static final void method3205(byte arg0) {
        field7740++;
        if (class216.field3087 != null) {
            return;
        }
        Container var1;
        if (class490.field6611 != null) {
            var1 = class490.field6611;
        } else if (class486.field6574 == null) {
            var1 = class619.field8207;
        } else {
            var1 = class486.field6574;
        }
        class559.field7427 = var1.getSize().width;
        class164.field2569 = var1.getSize().height;
        if (class490.field6611 == var1) {
            Insets var2 = class490.field6611.getInsets();
            class164.field2569 -= var2.top + var2.bottom;
            class559.field7427 -= var2.right + var2.left;
        }
        if (class662.method3719(-1) == 1) {
            class367.field4976 = (class559.field7427 - class641.field8619) / 2;
            class251.field3464 = 0;
            class149.field2387 = class305.field4229;
            class627.field8461 = class641.field8619;
        } else {
            class702.method3885((byte) -98);
        }
        if (class616.field8169 != class137.field2222) {
            boolean var10000;
            if (class627.field8461 < 1024 && class149.field2387 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class443.field6072.setSize(class627.field8461, class149.field2387);
        if (class10.field197 != null) {
            class10.field197.method447(class443.field6072);
        }
        if (arg0 <= 6) {
            field7739 = 79;
        }
        if (class490.field6611 == var1) {
            Insets var3 = class490.field6611.getInsets();
            class443.field6072.setLocation(class367.field4976 + var3.left, var3.top - -class251.field3464);
        } else {
            class443.field6072.setLocation(class367.field4976, class251.field3464);
        }
        if (class251.field3463 != -1) {
            class476.method2670((byte) -118, true);
        }
        class428.method2445(105);
    }
}
