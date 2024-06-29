import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class462 extends Canvas {

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field6674;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "Lvv;")
    public static class640 field6679 = new class640("RC", 1);

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "I")
    public static int field6680 = 1403;

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field6675;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field6676;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "I")
    public static int field6677;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public static int field6678;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "Ldk;")
    public static class506 field6681;

    @OriginalMember(owner = "client!jo", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 6)
    public final void update(Graphics arg0) {
        field6678++;
        this.field6674.update(arg0);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 14)
    public static final void method2743(int arg0) {
        class165.method1046(-3466, class40.field444);
        field6677++;
        if (arg0 != -715827883) {
            field6680 = 104;
        }
        class622.field9110++;
        class221.field3268.method2563(arg0 ^ 0x2AAA9876, 0);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)I", line = 27)
    public static final int method2744(int arg0, int arg1) {
        if (arg0 < 11) {
            field6681 = null;
        }
        int var2 = (arg1 >>> 1 & 0xD5555555) + (arg1 & 0x55555555);
        field6676++;
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCF) >>> 2);
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)V", line = 43)
    public static void method2745(boolean arg0) {
        field6679 = null;
        field6681 = null;
        if (!arg0) {
            field6681 = null;
        }
    }

    @OriginalMember(owner = "client!jo", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 55)
    public final void paint(Graphics arg0) {
        this.field6674.paint(arg0);
        field6675++;
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 63)
    public class462(Component arg0) {
        this.field6674 = arg0;
    }
}
