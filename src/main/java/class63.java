import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class63 extends class171 {

    @OriginalMember(owner = "client!ki", name = "v", descriptor = "I")
    public int field868;

    @OriginalMember(owner = "client!ki", name = "w", descriptor = "I")
    public int field869;

    @OriginalMember(owner = "client!ki", name = "x", descriptor = "[I")
    public static int[] field870 = new int[2048];

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "I")
    public static int field863;

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field864;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
    public static int field865;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "I")
    public static int field866;

    @OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
    public static int field867;

    @OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
    public static int field871;

    @OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
    public static int field872;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Z)V")
    public static final void method384(boolean arg0) {
        field867++;
        int var1 = class180.field2516;
        int var2 = class40.field593;
        int var3 = class175.field2458;
        int var4 = class224.field3406 - 3;
        byte var5 = 20;
        if (class39.field587 == null || class75.field1044 == null) {
            if (class21.field299.method1570((byte) -39, class218.field3289) && class21.field299.method1570((byte) -39, class234.field3526)) {
                class39.field587 = class280.method1873(class218.field3289, false, 0, class21.field299);
                class75.field1044 = class280.method1873(class234.field3526, false, 0, class21.field299);
            } else {
                class64.method395(var2, var1, var3, var5, class120.field1685, 256 - class207.field2892);
            }
        }
        if (class39.field587 != null && class75.field1044 != null) {
            int var6 = (var3 - (class75.field1044.field1539 * 2)) / class39.field587.field1539;
            for (int var7 = 0; var7 < var6; var7++) {
                class39.field587.method710(class75.field1044.field1539 + var2 + (class39.field587.field1539 * var7), var1);
            }
            class75.field1044.method710(var2, var1);
            class75.field1044.method702(var2 + var3 - class75.field1044.field1539, var1);
        }
        if (arg0) {
            field870 = null;
        }
        class54.field787.method842(class92.field1277, var2 + 3, var1 + 14, class164.field2275, -1);
        class64.method395(var2, var1 + var5, var3, var4 - var5, class120.field1685, 256 - class207.field2892);
        int var8 = class287.field4543;
        int var9 = class12.field124;
        for (int var10 = 0; var10 < class68.field925; var10++) {
            int var18 = (class68.field925 - var10 - 1) * 15 + var1 + var5 + 13;
            if (var9 > var2 && var9 < var2 + var3 && var8 > var18 - 13 && (var18 + 3) > var8) {
                class64.method395(var2, var18 - 12, var3, 15, class65.field888, 256 - class15.field145);
            }
        }
        if ((class79.field1099 == null || class269.field4119 == null || class225.field3418 == null) && class21.field299.method1570((byte) -39, class43.field649) && class21.field299.method1570((byte) -39, class125.field1754) && class21.field299.method1570((byte) -39, class235.field3584)) {
            class79.field1099 = class280.method1873(class43.field649, arg0, 0, class21.field299);
            class269.field4119 = class280.method1873(class125.field1754, false, 0, class21.field299);
            class225.field3418 = class280.method1873(class235.field3584, false, 0, class21.field299);
        }
        if (class79.field1099 != null && class269.field4119 != null && class225.field3418 != null) {
            int var11 = (var3 - (class225.field3418.field1539 * 2)) / class79.field1099.field1539;
            for (int var12 = 0; var12 < var11; var12++) {
                class79.field1099.method710(class79.field1099.field1539 * var12 + var2 + class225.field3418.field1539, var1 + var4 - class79.field1099.field1538);
            }
            int var13 = (var4 - class225.field3418.field1538 - var5) / class269.field4119.field1538;
            for (int var14 = 0; var14 < var13; var14++) {
                class269.field4119.method710(var2, var1 + var5 + (class269.field4119.field1538 * var14));
                class269.field4119.method702(var3 + var2 - class269.field4119.field1539, var1 - -(class269.field4119.field1538 * var14) + var5);
            }
            class225.field3418.method710(var2, var1 + var4 - class225.field3418.field1538);
            class225.field3418.method702(var2 + var3 - class225.field3418.field1539, -class225.field3418.field1538 + var4 + var1);
        }
        for (int var15 = 0; var15 < class68.field925; var15++) {
            int var16 = var1 + var5 + ((-var15 + class68.field925 + -1) * 15) + 13;
            int var17 = class164.field2275;
            if (var9 > var2 && var9 < (var2 + var3) && (var16 - 13) < var8 && var8 < var16 + 3) {
                var17 = class156.field2169;
            }
            class54.field787.method842(class41.method273(0, var15), var2 + 3, var16, var17, 0);
        }
        class107.method692(class224.field3406, class175.field2458, (byte) -105, class180.field2516, class40.field593);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIBI)I")
    public static final int method385(int arg0, int arg1, byte arg2, int arg3) {
        int var4 = arg3 / arg0;
        int var5 = arg3 & arg0 - 1;
        int var6 = arg1 / arg0;
        field863++;
        int var7 = arg0 - 1 & arg1;
        int var8 = class241.method1617(var6, -30206, var4);
        int var9 = class241.method1617(var6, -30206, var4 + 1);
        int var10 = class241.method1617(var6 + 1, -30206, var4);
        int var11 = class241.method1617(var6 + 1, -30206, var4 + 1);
        int var12 = class159.method1057(var8, 31363, arg0, var9, var5);
        if (arg2 != 46) {
            field864 = 86;
        }
        int var13 = class159.method1057(var10, 31363, arg0, var11, var5);
        return class159.method1057(var12, 31363, arg0, var13, var7);
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(II)V")
    public class63(int arg0, int arg1) {
        this.field868 = arg0;
        this.field869 = arg1;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(B)V")
    public static void method386(byte arg0) {
        field870 = null;
        if (arg0 > -95) {
            field870 = null;
        }
    }
}
