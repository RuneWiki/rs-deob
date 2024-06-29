import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class63 {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "[Z")
    public static boolean[] field1107 = new boolean[5];

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lng;")
    public static class138 field1110;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZZ)V", line = 21)
    public static final void method490(boolean arg0, boolean arg1) {
        field1109++;
        byte var2;
        byte[][] var3;
        if (class253.field4323 && arg1) {
            var2 = 1;
            var3 = class17.field231;
        } else {
            var3 = class51.field939;
            var2 = 4;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class44.field829[var5] & 0xFF) * 64 - class10.field147;
            byte[] var7 = var3[var5];
            int var8 = (class44.field829[var5] >> 8) * 64 - class134.field2336;
            if (var7 != null) {
                class65.method506(!arg0);
                class240.method1610(class124.field2201, var8, var6, (class51.field937 - 6) * 8, arg1, var7, class295.field5125 * 8 - 48, 32001);
            }
        }
        if (arg0) {
            field1108 = 117;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class44.field829[var9] >> 8) * 64 - class134.field2336;
            int var11 = (class44.field829[var9] & 0xFF) * 64 - class10.field147;
            byte[] var12 = var3[var9];
            if (var12 == null && class295.field5125 < 800) {
                class65.method506(!arg0);
                for (int var13 = 0; var13 < var2; var13++) {
                    class145.method1061(0, var13, 64, 64, var10, var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IB)I", line = 95)
    public static final int method491(int arg0, byte arg1) {
        if (arg1 <= 13) {
            method492(124);
        }
        field1105++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 112)
    public static void method492(int arg0) {
        field1110 = null;
        if (arg0 != 64) {
            field1110 = (class138) null;
        }
        field1107 = null;
    }
}
