import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class80 {

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "Leh;")
    public static class47 field1724 = class195.method1282((byte) -4, "mapdots");

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "I")
    public static int field1723 = 0;

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "Z")
    public static boolean field1726 = false;

    @OriginalMember(owner = "client!ih", name = "e", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "Lea;")
    public static class40 field1725 = new class40();

    @OriginalMember(owner = "client!ih", name = "h", descriptor = "I")
    public static int field1730 = 0;

    @OriginalMember(owner = "client!ih", name = "i", descriptor = "[Leh;")
    public static class47[] field1731 = new class47[500];

    @OriginalMember(owner = "client!ih", name = "j", descriptor = "[Ldd;")
    public static class34[] field1732 = new class34[16];

    @OriginalMember(owner = "client!ih", name = "f", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!ih", name = "g", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(BI)V")
    public static final void method683(byte arg0, int arg1) {
        field1728++;
        if (arg1 == -1 || !class37.field733[arg1]) {
            return;
        }
        class106.field2218.method80(-121, arg1);
        if (class51.field986[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class51.field986[arg1].length; var3++) {
            if (class51.field986[arg1][var3] != null) {
                if (class51.field986[arg1][var3].field1311 == 2) {
                    var2 = false;
                } else {
                    class51.field986[arg1][var3] = null;
                }
            }
        }
        if (arg0 < 63) {
            field1726 = false;
        }
        if (var2) {
            class51.field986[arg1] = null;
        }
        class37.field733[arg1] = false;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(I)V")
    public static void method684(int arg0) {
        field1724 = null;
        if (arg0 != 0) {
            method683((byte) 79, 41);
        }
        field1725 = null;
        field1732 = null;
        field1731 = null;
    }
}
