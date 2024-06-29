import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class324 {

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "Z")
    public static boolean field4018 = false;

    @OriginalMember(owner = "client!bv", name = "e", descriptor = "Lsv;")
    public static class688 field4022 = new class688();

    @OriginalMember(owner = "client!bv", name = "f", descriptor = "I")
    public static int field4023 = -2;

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!bv", name = "d", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "[I")
    public static int[] field4019;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static void method1929(byte arg0) {
        int var1 = 69 % ((arg0 + 69) / 55);
        field4019 = null;
        field4022 = null;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(II)Ltu;")
    public static final class369 method1930(int arg0, int arg1) {
        field4021++;
        class369[] var2 = class586.method3366(true);
        if (arg1 != -1537) {
            field4020 = 67;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class369 var4 = var2[var3];
            if (var4.field4593 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
