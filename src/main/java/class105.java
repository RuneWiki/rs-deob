import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class105 {

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public static int field1732 = 0;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "[J")
    public static long[] field1733 = new long[1000];

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1734 = " is already on your ignore list.";

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "Ljg;")
    public static class42 field1731 = new class42(64);

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public static int field1736 = 0;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "[I")
    public static int[] field1735;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method788(int arg0, boolean arg1, Object arg2) {
        if (arg0 != 19201) {
            method789(114, 39);
        }
        field1730++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class173.method1281(-118, var3) : var3;
        } else if (arg2 instanceof class157) {
            class157 var4 = (class157) arg2;
            return var4.method568(arg0 ^ 0x4B01);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V")
    public static final void method789(int arg0, int arg1) {
        class174 var2 = class90.field1498[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class174 var4 = class90.field1498[var3][arg0][arg1] = class90.field1498[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2807--;
                for (int var5 = 0; var5 < var4.field2814; var5++) {
                    class73 var6 = var4.field2812[var5];
                    if ((var6.field1278 >> 29 & 0x3L) == 2L && var6.field1270 == arg0 && var6.field1266 == arg1) {
                        var6.field1265--;
                    }
                }
            }
        }
        if (class90.field1498[0][arg0][arg1] == null) {
            class90.field1498[0][arg0][arg1] = new class174(0, arg0, arg1);
        }
        class90.field1498[0][arg0][arg1].field2810 = var2;
        class90.field1498[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)V")
    public static void method790(int arg0) {
        field1731 = null;
        field1733 = null;
        field1734 = null;
        if (arg0 <= -37) {
            field1735 = null;
        }
    }
}
