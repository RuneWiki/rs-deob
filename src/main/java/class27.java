import java.awt.Font;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!p")
public class class27 {

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "Lt;")
    public static class31 field305 = class14.method84(113, "Fishing Spot");

    @OriginalMember(owner = "mapview!p", name = "d", descriptor = "Lt;")
    public static class31 field308 = class14.method84(109, "Spinning Wheel");

    @OriginalMember(owner = "mapview!p", name = "b", descriptor = "Lt;")
    public static class31 field306 = class14.method84(125, "Mini)2Game");

    @OriginalMember(owner = "mapview!p", name = "e", descriptor = "I")
    public static volatile int field309 = 0;

    @OriginalMember(owner = "mapview!p", name = "c", descriptor = "Lt;")
    public static class31 field307 = class14.method84(112, "37(U");

    @OriginalMember(owner = "mapview!p", name = "g", descriptor = "Lt;")
    public static class31 field311 = class14.method84(110, "Vegetable Store");

    @OriginalMember(owner = "mapview!p", name = "h", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "mapview!p", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field310;

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;I)I", line = 41)
    public static final int method170(KeyEvent arg0, int arg1) {
        if (arg1 != 9) {
            method171(-26, 104, -3, true);
        }
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(IIIZ)Lt;", line = 60)
    public static final class31 method171(int arg0, int arg1, int arg2, boolean arg3) {
        int var4 = 1;
        if (arg2 < 1 || arg2 > 36) {
            arg2 = 10;
        }
        int var5 = arg1 / arg2;
        if (arg0 <= 81) {
            return (class31) null;
        }
        while (var5 != 0) {
            var5 /= arg2;
            var4++;
        }
        int var6 = var4;
        if (arg1 < 0 || arg3) {
            var6 = var4 + 1;
        }
        byte[] var7 = new byte[var6];
        if (arg1 < 0) {
            var7[0] = 45;
        } else if (arg3) {
            var7[0] = 43;
        }
        for (int var8 = 0; var8 < var4; var8++) {
            int var9 = arg1 % arg2;
            arg1 /= arg2;
            if (var9 < 0) {
                var9 = -var9;
            }
            if (var9 > 9) {
                var9 += 39;
            }
            var7[var6 - var8 - 1] = (byte) (var9 + 48);
        }
        class31 var10 = new class31();
        var10.field336 = var7;
        var10.field339 = var6;
        return var10;
    }

    @OriginalMember(owner = "mapview!p", name = "a", descriptor = "(Z)V", line = 142)
    public static void method172(boolean arg0) {
        if (arg0) {
            method172(true);
        }
        field307 = null;
        field306 = null;
        field305 = null;
        field311 = null;
        field310 = null;
        field308 = null;
    }
}
