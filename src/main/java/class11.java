import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!f")
public class class11 extends class14 {

    @OriginalMember(owner = "mapview!f", name = "n", descriptor = "[I")
    public static int[] field201 = new int[128];

    @OriginalMember(owner = "mapview!f", name = "k", descriptor = "Ln;")
    public static class26 field198 = class9.method82(255, "Crafting Shop");

    @OriginalMember(owner = "mapview!f", name = "l", descriptor = "Ln;")
    public static class26 field199 = class9.method82(255, "Dairy Churn");

    @OriginalMember(owner = "mapview!f", name = "q", descriptor = "I")
    public static int field204 = 0;

    @OriginalMember(owner = "mapview!f", name = "u", descriptor = "J")
    public static long field208 = 0L;

    @OriginalMember(owner = "mapview!f", name = "m", descriptor = "Ln;")
    public static class26 field200 = class9.method82(255, "details)3dat");

    @OriginalMember(owner = "mapview!f", name = "v", descriptor = "Z")
    public static boolean field209 = false;

    @OriginalMember(owner = "mapview!f", name = "r", descriptor = "Ln;")
    public static class26 field205 = class9.method82(255, "Archery Shop");

    @OriginalMember(owner = "mapview!f", name = "j", descriptor = "I")
    public static int field197 = 500;

    @OriginalMember(owner = "mapview!f", name = "p", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "mapview!f", name = "t", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "mapview!f", name = "s", descriptor = "Ln;")
    public class26 field206;

    @OriginalMember(owner = "mapview!f", name = "w", descriptor = "Lba;")
    public static class4 field210;

    @OriginalMember(owner = "mapview!f", name = "o", descriptor = "[B")
    public static byte[] field202;

    @OriginalMember(owner = "mapview!f", name = "c", descriptor = "(B)[Lq;", line = 53)
    public static final class32[] method90(byte arg0) {
        class32[] var1 = new class32[class1.field70];
        for (int var2 = 0; var2 < class1.field70; var2++) {
            class32 var3 = var1[var2] = new class32();
            var3.field400 = class34.field417;
            var3.field398 = class21.field303;
            var3.field395 = class4.field121[var2];
            var3.field397 = class34.field418[var2];
            var3.field396 = class1.field73[var2];
            var3.field401 = class14.field223[var2];
            var3.field394 = class28.field367;
            var3.field399 = class7.field156[var2];
        }
        mapview.method14((byte) -23);
        if (arg0 != 4) {
            method90((byte) -8);
        }
        return var1;
    }

    @OriginalMember(owner = "mapview!f", name = "a", descriptor = "(Z)V", line = 117)
    public static void method91(boolean arg0) {
        if (!arg0) {
            return;
        }
        field202 = null;
        field201 = null;
        field199 = null;
        field205 = null;
        field210 = null;
        field198 = null;
        field200 = null;
    }
}
