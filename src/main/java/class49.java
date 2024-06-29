import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class49 extends Canvas {

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field592;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "[B")
    public static byte[] field594 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field593 = 2;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field588;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lbk;Lbk;B)V")
    public static final void method259(class136 arg0, class136 arg1, byte arg2) {
        if (arg2 < 106) {
            method260(-30);
        }
        class127.field1796 = arg1;
        field586++;
        class126.field1793 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    public static void method260(int arg0) {
        field594 = null;
        if (arg0 >= -84) {
            field593 = -104;
        }
    }

    @OriginalMember(owner = "client!nd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field592.update(arg0);
        field590++;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class49(Component arg0) {
        this.field592 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field588++;
        this.field592.paint(arg0);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILbk;)I")
    public static final int method261(int arg0, class136 arg1) {
        field587++;
        int var2 = 0;
        if (arg1.method838((byte) 23, class94.field1369)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class102.field1481)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class246.field4386)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class102.field1478)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class118.field1690)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class230.field4086)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class7.field60)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class158.field2544)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class81.field1179)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class147.field2325)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class70.field996)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class16.field182)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class143.field2202)) {
            var2++;
        }
        if (arg0 != 2) {
            return -101;
        }
        var2++;
        if (arg1.method838((byte) 23, class245.field4368)) {
            var2++;
        }
        if (arg1.method838((byte) 23, class181.field3195)) {
            var2++;
        }
        return var2;
    }
}
