import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class28 {

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field366 = 0;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[Lpi;")
    public static class239[] field368 = new class239[0];

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lpn;")
    public static class72 field373 = new class72(69, 3);

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field374;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lkd;")
    public static class355 field370;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lg;")
    public static class470 field367;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lg;")
    public static class470 field372;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "[Lbl;")
    public static class59[] field369;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IBI)I")
    public static final int method149(int arg0, byte arg1, int arg2) {
        if (arg1 != 71) {
            method150(68);
        }
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        field371++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method150(int arg0) {
        field369 = null;
        field373 = null;
        field370 = null;
        field367 = null;
        field368 = null;
        if (arg0 == 3) {
            field372 = null;
        }
    }
}
