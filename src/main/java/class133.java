import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class133 extends Canvas {

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Ljava/awt/Component;")
    private Component field2506;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "Lai;")
    public static class10 field2497 = class44.method278(" loggt sich ein)3", -41);

    @OriginalMember(owner = "client!of", name = "e", descriptor = "Lai;")
    public static class10 field2498 = class44.method278("Lade Sprites )2 ", -38);

    @OriginalMember(owner = "client!of", name = "i", descriptor = "[S")
    public static short[] field2502 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!of", name = "j", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "Lte;")
    public static class177 field2496;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lbf;")
    public static class17 field2501;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "[I")
    public static int[] field2505;

    @OriginalMember(owner = "client!of", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2506.update(arg0);
        field2500++;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
    public static void method916(int arg0) {
        field2505 = null;
        field2501 = null;
        field2496 = null;
        if (arg0 == -1) {
            field2498 = null;
            field2502 = null;
            field2497 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field2495++;
        this.field2506.paint(arg0);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
    public static final void method917(byte arg0) {
        field2504++;
        if (arg0 != 115) {
            return;
        }
        class74.field1273.method634(true);
        int var1 = class74.field1273.method638(1, (byte) -123);
        if (var1 == 0) {
            return;
        }
        int var2 = class74.field1273.method638(2, (byte) -123);
        if (var2 == 0) {
            class160.field3076[class34.field532++] = 2047;
        } else if (var2 == 1) {
            int var3 = class74.field1273.method638(3, (byte) -127);
            class145.field2767.method424(var3, (byte) 86, false);
            int var4 = class74.field1273.method638(1, (byte) -122);
            if (var4 == 1) {
                class160.field3076[class34.field532++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class74.field1273.method638(3, (byte) -117);
            class145.field2767.method424(var5, (byte) 88, true);
            int var6 = class74.field1273.method638(3, (byte) -123);
            class145.field2767.method424(var6, (byte) -55, true);
            int var7 = class74.field1273.method638(1, (byte) -121);
            if (var7 == 1) {
                class160.field3076[class34.field532++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class74.field1273.method638(7, (byte) -122);
            class42.field687 = class74.field1273.method638(2, (byte) -123);
            int var9 = class74.field1273.method638(7, (byte) -119);
            int var10 = class74.field1273.method638(1, (byte) -120);
            int var11 = class74.field1273.method638(1, (byte) -125);
            if (var11 == 1) {
                class160.field3076[class34.field532++] = 2047;
            }
            class145.field2767.method429(var9, var10 == 1, var8, (byte) -72);
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class133(Component arg0) {
        this.field2506 = arg0;
    }
}
