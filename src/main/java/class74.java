import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class74 {

    @OriginalMember(owner = "client!he", name = "a", descriptor = "Lrf;")
    private static class163 field1544 = class53.method392(-52, "yellow:");

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Lrf;")
    public static class163 field1552 = field1544;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "Lrf;")
    public static class163 field1553 = field1544;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Lrf;")
    public static class163 field1550 = class53.method392(94, "Benutzen");

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lrf;")
    public static class163 field1549 = class53.method392(-83, "l");

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[I")
    public static int[] field1551 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1548 = 0;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1554 = 0;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)I")
    public static final int method522(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return -88;
        }
        class95 var3 = (class95) class65.field1373.method465((long) arg2, (byte) -45);
        field1545++;
        if (var3 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field2038.length; var5++) {
                if (var3.field2037[var5] == arg0) {
                    var4 += var3.field2038[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lbe;Lue;BI)V")
    public static final void method523(class16 arg0, class189 arg1, byte arg2, int arg3) {
        class82 var4 = new class82();
        var4.field1950 = arg3;
        field1547++;
        var4.field1663 = arg0;
        if (arg2 <= 95) {
            field1550 = null;
        }
        var4.field1654 = arg1;
        var4.field1666 = 1;
        class5 var5 = class96.field2046;
        synchronized (class96.field2046) {
            class96.field2046.method51(0, var4);
        }
        class22.method133(-25294);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(III)J")
    public static final long method524(int arg0, int arg1, int arg2) {
        class111 var3 = class97.field2054[arg0][arg1][arg2];
        return var3 == null || var3.field2346 == null ? 0L : var3.field2346.field2573;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method525(int arg0) {
        field1549 = null;
        field1544 = null;
        field1551 = null;
        field1550 = null;
        if (arg0 != -1) {
            field1549 = null;
        }
        field1552 = null;
        field1553 = null;
    }
}
