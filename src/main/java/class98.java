import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class98 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "D")
    public static double field1278 = -1.0D;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field1277 = 5063219;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field1285 = 50;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[I")
    public static int[] field1282 = new int[5];

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1286 = "Members object";

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "F")
    public static float field1280;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)I", line = 5)
    public static final int method591(int arg0, int arg1) {
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        field1276++;
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= -83) {
            method591(-35, -16);
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B)Lkg;", line = 57)
    public static final class82 method592(int arg0, byte[] arg1) {
        field1283++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 < 51) {
            field1278 = -1.0903133984083655D;
        }
        class82 var2 = new class82(arg1, class120.field1681, class223.field3150, class54.field664, class264.field4159, class153.field2105);
        class321.method2238(112);
        return var2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V", line = 105)
    public static void method593(byte arg0) {
        if (arg0 != -108) {
            field1277 = 66;
        }
        field1286 = null;
        field1282 = null;
    }
}
