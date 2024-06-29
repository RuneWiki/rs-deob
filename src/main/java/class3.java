import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!b")
public class class3 {

    @OriginalMember(owner = "mapview!b", name = "d", descriptor = "I")
    public static int field76 = -1;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "I")
    public static int field73 = 0;

    @OriginalMember(owner = "mapview!b", name = "b", descriptor = "Lba;")
    public static class4 field74 = class14.method105((byte) -77, "details)3dat");

    @OriginalMember(owner = "mapview!b", name = "c", descriptor = "[I")
    public static int[] field75 = new int[256];

    @OriginalMember(owner = "mapview!b", name = "e", descriptor = "I")
    public static int field77 = 0;

    @OriginalMember(owner = "mapview!b", name = "f", descriptor = "Lba;")
    public static class4 field78;

    @OriginalMember(owner = "mapview!b", name = "g", descriptor = "Lba;")
    public static class4 field79;

    @OriginalMember(owner = "mapview!b", name = "h", descriptor = "Lba;")
    public static class4 field80;

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(B)V", line = 13)
    public static void method24(byte arg0) {
        int var1 = 59 / ((arg0 - 33) / 32);
        field75 = null;
        field74 = null;
        field79 = null;
        field80 = null;
        field78 = null;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(II)I", line = 30)
    public static int method25(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!b", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ls;", line = 40)
    public static final class34 method26(Throwable arg0, String arg1) {
        class34 var2;
        if (arg0 instanceof class34) {
            var2 = (class34) arg0;
            var2.field434 = var2.field434 + ' ' + arg1;
        } else {
            var2 = new class34(arg0, arg1);
        }
        return var2;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field75[var0] = var1;
        }
        field78 = class14.method105((byte) -93, " )2 ");
        field79 = class14.method105((byte) -73, "mapscene");
        field80 = class14.method105((byte) -112, "Cooking Range");
    }
}
