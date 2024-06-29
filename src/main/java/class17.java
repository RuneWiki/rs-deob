import java.awt.Image;
import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!i")
public class class17 {

    @OriginalMember(owner = "mapview!i", name = "c", descriptor = "Ld;")
    public static class7 field186 = class38.method251((byte) -123, "Suchen");

    @OriginalMember(owner = "mapview!i", name = "d", descriptor = "Ld;")
    public static class7 field187 = class38.method251((byte) 123, "Legende");

    @OriginalMember(owner = "mapview!i", name = "f", descriptor = "I")
    public static volatile int field189 = -1;

    @OriginalMember(owner = "mapview!i", name = "b", descriptor = "Ld;")
    public static class7 field185 = class38.method251((byte) 79, "Spinning Wheel");

    @OriginalMember(owner = "mapview!i", name = "e", descriptor = "Ld;")
    public static class7 field188 = class38.method251((byte) 122, "Hunter Training");

    @OriginalMember(owner = "mapview!i", name = "i", descriptor = "Ld;")
    public static class7 field192 = class38.method251((byte) -69, "???");

    @OriginalMember(owner = "mapview!i", name = "h", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "Lla;")
    public static class23 field184;

    @OriginalMember(owner = "mapview!i", name = "g", descriptor = "Ljava/awt/Image;")
    public static Image field190;

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ILk;Ld;Ld;)Lea;", line = 38)
    public static final class10 method123(int arg0, class20 arg1, class7 arg2, class7 arg3) {
        int var4 = arg1.method145((byte) 48, arg3);
        int var5 = arg1.method141(true, var4, arg2);
        if (arg0 != -1) {
            field184 = null;
        }
        return class5.method29(1459544641, var5, var4, arg1);
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 95)
    public static final int method124(int arg0, KeyEvent arg1) {
        int var2 = arg1.getKeyChar();
        if (arg0 != 0) {
            method123(64, null, null, null);
        }
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "([BIBI)I", line = 114)
    public static final int method125(byte[] arg0, int arg1, byte arg2, int arg3) {
        int var4 = -1;
        int var5 = 88 % ((arg2 + 22) / 33);
        for (int var6 = arg1; var6 < arg3; var6++) {
            var4 = var4 >>> 8 ^ class16.field173[(arg0[var6] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!i", name = "a", descriptor = "(B)V", line = 145)
    public static void method126(byte arg0) {
        field190 = null;
        field187 = null;
        field192 = null;
        if (arg0 >= -15) {
            field189 = -116;
        }
        field186 = null;
        field184 = null;
        field188 = null;
        field185 = null;
    }
}
