import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bf")
public class class17 extends class90 {

    @OriginalMember(owner = "client!bf", name = "J", descriptor = "I")
    public int field300;

    @OriginalMember(owner = "client!bf", name = "w", descriptor = "[B")
    public static byte[] field288 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!bf", name = "B", descriptor = "I")
    public static int field293 = 0;

    @OriginalMember(owner = "client!bf", name = "A", descriptor = "Lrf;")
    private static class163 field292 = class53.method392(-81, "You can(Wt add yourself to your own friend list)3");

    @OriginalMember(owner = "client!bf", name = "x", descriptor = "J")
    public static long field289 = 0L;

    @OriginalMember(owner = "client!bf", name = "G", descriptor = "Lrf;")
    public static class163 field297 = field292;

    @OriginalMember(owner = "client!bf", name = "E", descriptor = "Lfc;")
    public static class54 field295 = new class54(260);

    @OriginalMember(owner = "client!bf", name = "L", descriptor = "Lrf;")
    public static class163 field302 = class53.method392(68, "blinken2:");

    @OriginalMember(owner = "client!bf", name = "K", descriptor = "I")
    public static int field301 = 0;

    @OriginalMember(owner = "client!bf", name = "H", descriptor = "Lrf;")
    public static class163 field298 = class53.method392(81, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!bf", name = "v", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bf", name = "y", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!bf", name = "z", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!bf", name = "C", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!bf", name = "F", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!bf", name = "I", descriptor = "Lue;")
    public static class189 field299;

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Lrf;I)V")
    public static final void method110(class163 arg0, int arg1) {
        field291++;
        if (class176.field3540 == null) {
            return;
        }
        int var2 = 0;
        long var3 = arg0.method1058(arg1 ^ 0x1F);
        if ((long) arg1 == var3) {
            return;
        }
        while (class176.field3540.length > var2 && class176.field3540[var2].field1950 != var3) {
            var2++;
        }
        if (class176.field3540.length > var2 && class176.field3540[var2] != null) {
            class37.field745++;
            class141.field2896.method326(104, 155);
            class141.field2896.method373((byte) -52, class176.field3540[var2].field1950);
        }
    }

    @OriginalMember(owner = "client!bf", name = "a", descriptor = "(Z)V")
    public static void method111(boolean arg0) {
        field295 = null;
        field288 = null;
        field298 = null;
        if (!arg0) {
            field299 = null;
            field302 = null;
            field297 = null;
            field292 = null;
        }
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "()V")
    public class17() {
    }

    @OriginalMember(owner = "client!bf", name = "<init>", descriptor = "(I)V")
    public class17(int arg0) {
        this.field300 = arg0;
    }
}
