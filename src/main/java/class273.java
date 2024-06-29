import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class273 extends Canvas {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field4029;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lbg;")
    public static class324 field4031 = new class324(106, 10);

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "F")
    public static float field4035;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "F")
    public static float field4036;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Ljl;")
    public static class177 field4030;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILiv;)V", line = 3)
    public static final void method1760(int arg0, class65 arg1) {
        field4032++;
        if (arg0 < ~(arg1.field783.length - arg1.field827)) {
            return;
        }
        int var2 = arg1.method577(arg0 ^ 0xFFFFFF01);
        if (var2 < 0 || var2 > 1 || arg1.field783.length - arg1.field827 < 2) {
            return;
        }
        int var3 = arg1.method623((byte) 111);
        if ((var3 * 6) != (arg1.field783.length - arg1.field827)) {
            return;
        }
        while (true) {
            int var4;
            int var5;
            do {
                do {
                    do {
                        if (arg1.field783.length <= arg1.field827) {
                            return;
                        }
                        var4 = arg1.method623((byte) 81);
                        var5 = arg1.method616((byte) 77);
                    } while (var4 >= class290.field4169.length);
                } while (!class450.field6635[var4]);
            } while (class122.field1790.method1629(115, var4).field1594 == '1' && (var5 < -1 || var5 > 1));
            class290.field4169[var4] = var5;
        }
    }

    @OriginalMember(owner = "client!sg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 49)
    public final void paint(Graphics arg0) {
        this.field4029.paint(arg0);
        field4033++;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 56)
    public class273(Component arg0) {
        this.field4029 = arg0;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 67)
    public static void method1761(int arg0) {
        field4030 = null;
        if (arg0 == -29624) {
            field4031 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 78)
    public final void update(Graphics arg0) {
        field4034++;
        this.field4029.update(arg0);
    }
}
