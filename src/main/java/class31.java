import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!q")
public abstract class class31 {

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "Lna;")
    public static class26 field407 = class30.method205((byte) 35, "50(U");

    @OriginalMember(owner = "mapview!q", name = "c", descriptor = "Lna;")
    public static class26 field409 = class30.method205((byte) 51, "mapscene");

    @OriginalMember(owner = "mapview!q", name = "f", descriptor = "I")
    public static int field412 = 0;

    @OriginalMember(owner = "mapview!q", name = "e", descriptor = "Z")
    public static boolean field411 = false;

    @OriginalMember(owner = "mapview!q", name = "h", descriptor = "I")
    public static volatile int field414 = 0;

    @OriginalMember(owner = "mapview!q", name = "i", descriptor = "I")
    public static volatile int field415 = -1;

    @OriginalMember(owner = "mapview!q", name = "k", descriptor = "Lna;")
    public static class26 field417 = class30.method205((byte) 70, "Mining Site");

    @OriginalMember(owner = "mapview!q", name = "g", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "mapview!q", name = "d", descriptor = "Ljava/awt/Font;")
    public static Font field410;

    @OriginalMember(owner = "mapview!q", name = "b", descriptor = "[I")
    public static int[] field408;

    @OriginalMember(owner = "mapview!q", name = "j", descriptor = "[Lg;")
    public static class12[] field416;

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(Lna;BLna;Lb;)[Lm;", line = 13)
    public static final class23[] method210(class26 arg0, byte arg1, class26 arg2, class3 arg3) {
        if (arg1 != 64) {
            field417 = null;
        }
        int var4 = arg3.method32(-1, arg0);
        int var5 = arg3.method31(var4, arg2, (byte) -58);
        return class16.method105(var5, -91, var4, arg3);
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(B)V", line = 50)
    public static void method211(byte arg0) {
        if (arg0 <= 100) {
            return;
        }
        field410 = null;
        field416 = null;
        field408 = null;
        field409 = null;
        field417 = null;
        field407 = null;
    }

    @OriginalMember(owner = "mapview!q", name = "a", descriptor = "(III)I")
    public abstract int method209(int arg0, int arg1, int arg2);
}
