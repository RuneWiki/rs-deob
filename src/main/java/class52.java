import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class52 {

    @OriginalMember(owner = "client!i", name = "c", descriptor = "Lkc;")
    public static class67 field1266 = class19.method144("Bitte starten Sie eine Mitgliedschaft", 73);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lkc;")
    private static class67 field1273 = class19.method144("Unable to find ", 95);

    @OriginalMember(owner = "client!i", name = "m", descriptor = "I")
    public static int field1276 = 0;

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Z")
    public static boolean field1274 = false;

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lkc;")
    private static class67 field1277 = class19.method144("Connecting to server)3)3)3", 113);

    @OriginalMember(owner = "client!i", name = "h", descriptor = "I")
    public static int field1271 = -1;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lkc;")
    public static class67 field1264 = field1277;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lkc;")
    public static class67 field1269 = field1273;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "Lkc;")
    private static class67 field1268 = class19.method144("Loading friend list", 79);

    @OriginalMember(owner = "client!i", name = "o", descriptor = "I")
    public static int field1278 = 1;

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lkc;")
    public static class67 field1275 = field1268;

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "I")
    public static int field1270;

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!i", name = "d", descriptor = "J")
    public static long field1267;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "Luc;")
    public static class127 field1280;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lac;")
    public static class4 field1272;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(Z)V", line = 6)
    public static void method427(boolean arg0) {
        field1275 = null;
        if (!arg0) {
            field1273 = null;
        }
        field1266 = null;
        field1277 = null;
        field1280 = null;
        field1268 = null;
        field1273 = null;
        field1269 = null;
        field1264 = null;
        field1272 = null;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(II)V", line = 41)
    public static final void method428(int arg0, int arg1) {
        field1270++;
        if (!class42.method365(113, arg1)) {
            return;
        }
        class33[] var2 = class54.field1305[arg1];
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class33 var4 = var2[var3];
            if (var4 != null) {
                var4.field747 = 0;
                var4.field711 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)I", line = 100)
    public static final int method429(int arg0, boolean arg1) {
        field1265++;
        if (!arg1) {
            method429(110, false);
        }
        return arg0 >> 17 & 0x7;
    }
}
