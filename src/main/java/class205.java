import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class205 extends Canvas {

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field3704;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "[I")
    public static int[] field3709 = new int[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lhh;")
    public static class163 field3707 = class137.method1065("cross", 17);

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "Lhh;")
    public static class163 field3710 = class137.method1065("leuchten2:", 17);

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field3708;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "Ln;")
    public static class139 field3700;

    @OriginalMember(owner = "client!eb", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field3705++;
        this.field3704.paint(arg0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
    public static final int method1455(int arg0) {
        field3702++;
        if (class122.field2321) {
            return 0;
        }
        if (arg0 != 0) {
            method1456(-6, -3);
        }
        if (class177.method1310(4643)) {
            return class73.field1368 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(II)I")
    public static final int method1456(int arg0, int arg1) {
        field3708++;
        int var2 = 29 / ((26 - arg0) / 54);
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static final void method1457(int arg0) {
        if (arg0 != 0) {
            method1457(66);
        }
        field3703++;
        class193.field3522.method120((byte) -114);
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class205(Component arg0) {
        this.field3704 = arg0;
    }

    @OriginalMember(owner = "client!eb", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field3701++;
        this.field3704.update(arg0);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Z)V")
    public static void method1458(boolean arg0) {
        field3700 = null;
        if (!arg0) {
            field3700 = null;
        }
        field3710 = null;
        field3707 = null;
        field3709 = null;
    }
}
