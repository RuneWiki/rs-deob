import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class33 extends Canvas {

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field446;

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "Ll;")
    public static class22 field442 = method229("Archery Shop", -51);

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "Ll;")
    public static class22 field444 = method229("underlay)3dat", -47);

    @OriginalMember(owner = "mapview!ra", name = "h", descriptor = "Ll;")
    public static class22 field448 = method229("Dairy Churn", -97);

    @OriginalMember(owner = "mapview!ra", name = "i", descriptor = "Ll;")
    public static class22 field449 = method229("Fur Trader", -83);

    @OriginalMember(owner = "mapview!ra", name = "k", descriptor = "Ll;")
    public static class22 field451 = method229("Loom", -45);

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "Ll;")
    public static class22 field445 = method229("Agility Training", -114);

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "Ll;")
    public static class22 field441 = method229("???", -109);

    @OriginalMember(owner = "mapview!ra", name = "j", descriptor = "Ll;")
    public static class22 field450 = method229("b12_full", -63);

    @OriginalMember(owner = "mapview!ra", name = "l", descriptor = "[Z")
    public static boolean[] field452 = new boolean[112];

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "I")
    public static int field443;

    @OriginalMember(owner = "mapview!ra", name = "m", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "mapview!ra", name = "g", descriptor = "[Ll;")
    public static class22[] field447;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(Ljava/lang/String;I)Ll;", line = 12)
    public static final class22 method229(String arg0, int arg1) {
        if (arg1 >= -38) {
            field447 = null;
        }
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class22 var4 = new class22();
        var4.field215 = new byte[var3];
        int var5 = 0;
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field215[var4.field213++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else if (var6 != 0) {
                var4.field215[var4.field213++] = (byte) var6;
            }
        }
        var4.method151((byte) -91);
        return var4.method147((byte) -27);
    }

    @OriginalMember(owner = "mapview!ra", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 79)
    public final void paint(Graphics arg0) {
        this.field446.paint(arg0);
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 84)
    public class33(Component arg0) {
        this.field446 = arg0;
    }

    @OriginalMember(owner = "mapview!ra", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 102)
    public final void update(Graphics arg0) {
        this.field446.update(arg0);
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I)V", line = 110)
    public static void method230(int arg0) {
        field451 = null;
        field448 = null;
        field447 = null;
        if (arg0 != 40) {
            field450 = null;
        }
        field450 = null;
        field452 = null;
        field449 = null;
        field445 = null;
        field444 = null;
        field441 = null;
        field442 = null;
    }
}
