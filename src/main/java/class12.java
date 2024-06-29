import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!fa")
public class class12 extends class16 {

    @OriginalMember(owner = "mapview!fa", name = "k", descriptor = "Lba;")
    public static class4 field168 = class14.method105((byte) -126, "sprites");

    @OriginalMember(owner = "mapview!fa", name = "n", descriptor = "Lba;")
    public static class4 field171 = class14.method105((byte) -83, "Anvil");

    @OriginalMember(owner = "mapview!fa", name = "i", descriptor = "Lh;")
    public static class15 field166 = null;

    @OriginalMember(owner = "mapview!fa", name = "m", descriptor = "Lba;")
    public static class4 field170 = class14.method105((byte) -84, "u_pass");

    @OriginalMember(owner = "mapview!fa", name = "q", descriptor = "Lba;")
    public static class4 field174 = class14.method105((byte) -72, "Loom");

    @OriginalMember(owner = "mapview!fa", name = "r", descriptor = "Lba;")
    public static class4 field175 = class14.method105((byte) -118, "Cookery Shop");

    @OriginalMember(owner = "mapview!fa", name = "o", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "mapview!fa", name = "p", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "mapview!fa", name = "l", descriptor = "Lba;")
    public class4 field169;

    @OriginalMember(owner = "mapview!fa", name = "j", descriptor = "[B")
    public static byte[] field167;

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Lc;IIZ)Lka;", line = 4)
    public static final class21 method96(class5 arg0, int arg1, int arg2, boolean arg3) {
        if (class14.method106((byte) 33, arg1, arg0, arg2)) {
            if (!arg3) {
                method97(null, 101, 16, 16);
            }
            return class32.method195(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(Ljava/awt/Component;III)Lga;", line = 53)
    public static final class14 method97(Component arg0, int arg1, int arg2, int arg3) {
        try {
            Class var4 = Class.forName("ca");
            class14 var5 = (class14) var4.getDeclaredConstructor().newInstance();
            if (arg1 >= -105) {
                field166 = null;
            }
            var5.method102(arg3, 771, arg2, arg0);
            return var5;
        } catch (Throwable var8) {
            class23 var7 = new class23();
            var7.method102(arg3, 771, arg2, arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "mapview!fa", name = "a", descriptor = "(I)V", line = 73)
    public static void method98(int arg0) {
        field174 = null;
        field167 = null;
        field175 = null;
        field168 = null;
        if (arg0 == 32658) {
            field171 = null;
            field170 = null;
        }
    }
}
