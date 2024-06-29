import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class40 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lmb;")
    public static class96 field689 = class243.method1708("null", (byte) 110);

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field690 = 0;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field692 = 0;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "[Lmj;")
    public static class246[] field691;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZIII)V")
    public static final void method315(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= -41) {
            return;
        }
        class46.field789 = 0L;
        field688++;
        int var5 = class159.method1157(-1);
        if (arg3 == 3 || var5 == 3) {
            arg1 = true;
        }
        if (class123.field2273.startsWith("mac") && arg3 > 0) {
            arg1 = true;
        }
        boolean var6 = false;
        if (var5 > 0 == arg3 <= 0) {
            var6 = true;
        }
        if (arg1 && arg3 > 0) {
            var6 = true;
        }
        class78.method558(var5, var6, arg2, arg3, -1, arg1, arg0);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method316(byte arg0) {
        field691 = null;
        if (arg0 != 15) {
            method315(-28, true, -71, -103, 97);
        }
        field689 = null;
    }
}
