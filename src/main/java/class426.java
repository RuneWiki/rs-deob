import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class426 {

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Lui;")
    public static class375 field6346 = new class375("M", "M", "M", "M");

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
    public static int[] field6348 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field6347;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method2561(int arg0) {
        field6348 = null;
        if (arg0 != 50) {
            method2561(111);
        }
        field6346 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method2562(int arg0, int arg1) {
        field6347++;
        if (arg1 == 100 && class170.field2473 > 0) {
            byte[] var2 = class516.field7660[--class170.field2473];
            class516.field7660[class170.field2473] = null;
            return var2;
        } else if (arg1 == 5000 && class215.field2991 > 0) {
            byte[] var3 = class438.field6533[--class215.field2991];
            class438.field6533[class215.field2991] = null;
            return var3;
        } else if (arg0 == arg1 && class74.field996 > 0) {
            byte[] var4 = class338.field5352[--class74.field996];
            class338.field5352[class74.field996] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }
}
