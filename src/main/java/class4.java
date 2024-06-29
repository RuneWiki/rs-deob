import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class4 extends class34 {

    @OriginalMember(owner = "mapview!ba", name = "q", descriptor = "Ll;")
    public static class21 field29 = class28.method185(-20839, "Stonemason");

    @OriginalMember(owner = "mapview!ba", name = "o", descriptor = "[I")
    public static int[] field27 = new int[128];

    @OriginalMember(owner = "mapview!ba", name = "u", descriptor = "Ll;")
    public static class21 field33 = class28.method185(-20839, "???");

    @OriginalMember(owner = "mapview!ba", name = "t", descriptor = "Ll;")
    public static class21 field32 = class28.method185(-20839, "[red]Number of functions exceeded)3 Increase MAX_FUNCTIONS)3");

    @OriginalMember(owner = "mapview!ba", name = "r", descriptor = "I")
    public static int field30 = 0;

    @OriginalMember(owner = "mapview!ba", name = "p", descriptor = "Ll;")
    public static class21 field28 = class28.method185(-20839, "Overview");

    @OriginalMember(owner = "mapview!ba", name = "w", descriptor = "Ll;")
    public static class21 field35 = class28.method185(-20839, "Apothecary");

    @OriginalMember(owner = "mapview!ba", name = "x", descriptor = "Ll;")
    public static class21 field36 = class28.method185(-20839, "switch to ");

    @OriginalMember(owner = "mapview!ba", name = "v", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "mapview!ba", name = "m", descriptor = "I")
    public static int sizeX;

    @OriginalMember(owner = "mapview!ba", name = "s", descriptor = "Ll;")
    public class21 field31;

    @OriginalMember(owner = "mapview!ba", name = "y", descriptor = "Lr;")
    public static class29 field37;

    @OriginalMember(owner = "mapview!ba", name = "n", descriptor = "Ljava/awt/Frame;")
    public static Frame field26;

    @OriginalMember(owner = "mapview!ba", name = "c", descriptor = "(I)Z", line = 8)
    public static final boolean method10(int arg0) {
        class6 var1 = class5.field38;
        synchronized (class5.field38) {
            if (mapview.field291 == class28.field329) {
                return false;
            }
            class3.field18 = class16.field149[class28.field329];
            if (arg0 != -26469) {
                method11((byte) 110);
            }
            class28.field329 = class28.field329 + 1 & 0x7F;
            return true;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(B)V", line = 55)
    public static void method11(byte arg0) {
        field32 = null;
        field36 = null;
        field35 = null;
        field27 = null;
        field37 = null;
        field33 = null;
        field29 = null;
        field26 = null;
        field28 = null;
        if (arg0 != 72) {
            field36 = null;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(I[Ll;II)V", line = 109)
    public static final void method12(int arg0, class21[] arg1, int arg2, int arg3) {
        if (arg3 != -3518) {
            sizeX = 32;
        }
        if (arg2 == 1) {
            arg1[0].method100(97);
        } else {
            class17.method76(arg1, 0, arg2, arg0).method100(arg3 ^ 0xFFFFF223);
        }
    }
}
