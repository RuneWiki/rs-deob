import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class569 extends Canvas {

    @OriginalMember(owner = "client!h", name = "g", descriptor = "Ljava/awt/Component;")
    private Component field8367;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "[F")
    public static float[] field8361 = new float[4];

    @OriginalMember(owner = "client!h", name = "b", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!h", name = "c", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!h", name = "e", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!h", name = "f", descriptor = "I")
    public static int field8366;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(B)V")
    public static void method3319(byte arg0) {
        field8361 = null;
        int var1 = -9 / ((arg0 - 58) / 56);
    }

    @OriginalMember(owner = "client!h", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field8367.paint(arg0);
        field8364++;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZB)V")
    public static final void method3320(boolean arg0, byte arg1) {
        field8363++;
        if (arg1 <= 101) {
            return;
        }
        if (arg0) {
            if (class599.field8668 != -1) {
                class547.method3211(-1, class599.field8668);
            }
            for (class565 var2 = (class565) class309.field3937.method2638(false); var2 != null; var2 = (class565) class309.field3937.method2641(12089)) {
                if (!var2.method3189(-9613)) {
                    var2 = (class565) class309.field3937.method2638(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class615.method3541(var2, (byte) 101, false, true);
            }
            class599.field8668 = -1;
            class309.field3937 = new class451(8);
            class441.method2584(-9);
            class599.field8668 = class443.field6122;
            class194.method1059(false, true);
            class562.method3279((byte) -123);
            class630.method3607(class599.field8668);
        }
        class216.field2637 = true;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(BI)Z")
    public static final boolean method3321(byte arg0, int arg1) {
        field8366++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else if (arg1 == -29624) {
            return var2 < 128 || var2 >= 160 || class88.field1082[var2 - 128] != '\u0000';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class569(Component arg0) {
        this.field8367 = arg0;
    }

    @OriginalMember(owner = "client!h", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field8362++;
        this.field8367.update(arg0);
    }
}
