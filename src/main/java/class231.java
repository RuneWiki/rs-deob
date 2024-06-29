import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class231 extends Canvas {

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field3210;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "Lqk;")
    public static class148 field3206 = new class148(67, -2);

    @OriginalMember(owner = "client!pfa", name = "j", descriptor = "I")
    public static int field3215 = 1;

    @OriginalMember(owner = "client!pfa", name = "g", descriptor = "Lqk;")
    public static class148 field3212 = new class148(66, 6);

    @OriginalMember(owner = "client!pfa", name = "l", descriptor = "[I")
    public static int[] field3217 = new int[16384];

    @OriginalMember(owner = "client!pfa", name = "m", descriptor = "[I")
    public static int[] field3218 = new int[16384];

    @OriginalMember(owner = "client!pfa", name = "k", descriptor = "F")
    public static float field3216;

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!pfa", name = "c", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!pfa", name = "d", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!pfa", name = "f", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!pfa", name = "i", descriptor = "I")
    public static int field3214;

    @OriginalMember(owner = "client!pfa", name = "n", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!pfa", name = "h", descriptor = "[Lnk;")
    public static class427[] field3213;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field3217[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field3218[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 10)
    public final void update(Graphics arg0) {
        this.field3210.update(arg0);
        field3214++;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1488(int arg0) {
        class617.field8782.method3210(false);
        field3208++;
        if (arg0 != -2) {
            method1489(-115);
        }
    }

    @OriginalMember(owner = "client!pfa", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 30)
    public final void paint(Graphics arg0) {
        this.field3210.paint(arg0);
        field3209++;
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 45)
    public class231(Component arg0) {
        this.field3210 = arg0;
    }

    @OriginalMember(owner = "client!pfa", name = "b", descriptor = "(I)V", line = 54)
    public static void method1489(int arg0) {
        field3212 = null;
        if (arg0 != -5459) {
            method1488(65);
        }
        field3206 = null;
        field3218 = null;
        field3217 = null;
        field3213 = null;
    }
}
