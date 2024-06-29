import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class59 {

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "Lid;")
    public static class78 field1510 = new class78(4096);

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "Lgg;")
    public static class63 field1514 = class116.method911(43, "<)4col> x");

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public static int field1518 = 0;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "Lgg;")
    public static class63 field1516 = class116.method911(43, "Angreifen");

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "Z")
    public static boolean field1519 = false;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "[Lkh;")
    public static class98[] field1515 = new class98[5000];

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field1517 = 127;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field1511;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "I")
    public static int field1513;

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "[Lhh;")
    public static class73[] field1512;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I)V")
    public static void method553(int arg0) {
        if (arg0 != 0) {
            field1515 = null;
        }
        field1512 = null;
        field1515 = null;
        field1516 = null;
        field1514 = null;
        field1510 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)Lkb;")
    public static final class93 method554(int arg0, int arg1) {
        class93 var2 = (class93) class77.field1874.method289((long) arg0, -130079263);
        field1509++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class171.field3547.method745(10, arg0, 0);
        if (arg1 != 13319) {
            method555(72, -84);
        }
        class93 var4 = new class93();
        var4.field2192 = arg0;
        if (var3 != null) {
            var4.method813((byte) -118, new class3(var3));
        }
        var4.method818(true);
        if (var4.field2196 != -1) {
            var4.method814(true, method554(var4.field2196, 13319), method554(var4.field2197, arg1));
        }
        if (!class117.field2622 && var4.field2234) {
            var4.field2202 = class131.field2851;
            var4.field2213 = null;
            var4.field2232 = 0;
            var4.field2222 = null;
            var4.field2207 = false;
        }
        class77.field1874.method293(false, (long) arg0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(II)Lff;")
    public static final class54 method555(int arg0, int arg1) {
        field1511++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class23.field539[var2] == null || class23.field539[var2][var3] == null) {
            boolean var4 = class144.method1026((byte) -126, var2);
            if (!var4) {
                return null;
            }
        }
        return arg1 == 32173 ? class23.field539[var2][var3] : null;
    }
}
