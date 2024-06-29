import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class205 extends class107 {

    @OriginalMember(owner = "client!re", name = "z", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field3429 = 0;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "I")
    public static int field3424 = -1;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Ldf;")
    public static class51 field3437 = null;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    public int field3425;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "I")
    public int field3430;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public int field3434;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    public int field3438;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "Lwc;")
    public class213 field3431;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "Lwc;")
    public class213 field3433;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "Ldf;")
    public class51 field3427;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "Z")
    public boolean field3435;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "[I")
    public static int[] field3432;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "[Ljava/lang/Object;")
    public Object[] field3423;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "[S")
    public static short[] field3428;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)V")
    public static void method1414(int arg0) {
        field3437 = null;
        field3432 = null;
        field3428 = null;
        if (arg0 < 99) {
            field3437 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)V")
    public static final void method1415(byte arg0) {
        field3436++;
        if (class265.field4644 == null) {
            return;
        }
        try {
            if (arg0 <= 5) {
                method1415((byte) 60);
            }
            byte[] var1 = class265.field4644.method1281(108);
            if (var1 != null) {
                class121 var2 = new class121(var1);
                class234.field4095 = var2.method876(false);
                class74.field1175 = new class149[class234.field4095];
                for (int var3 = 0; var3 < class234.field4095; var3++) {
                    class149 var4 = class74.field1175[var3] = new class149();
                    int var5 = var2.method876(false);
                    var4.field2496 = (var5 & 0x8000) != 0;
                    var4.field2495 = var5 & 0x7FFF;
                    var4.field2497 = var2.method903((byte) 108);
                    var4.field2499 = var2.method884(14513);
                    var4.field2491 = var3;
                    int var6 = var2.method876(false);
                    var4.field2490 = class175.method1231(var6, 21010);
                }
                class243.method1662(class74.field1175.length - 1, 0, 1, class74.field1175);
                class265.field4644 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class265.field4644 = null;
        }
    }
}
