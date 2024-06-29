import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class142 extends class12 {

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public int field2627 = 0;

    @OriginalMember(owner = "client!dh", name = "B", descriptor = "I")
    public int field2640 = -1;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Lvf;")
    private static class265 field2635 = class87.method582(-46, "Connected to update server");

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "Lvf;")
    public static class265 field2629 = class87.method582(-46, "<col=c0ff00>");

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "Lvf;")
    public static class265 field2628 = class87.method582(-46, "Konfig geladen)3");

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "Lvf;")
    public static class265 field2630 = field2635;

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "I")
    public static int field2632 = 0;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public int field2633;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "I")
    public int field2634;

    @OriginalMember(owner = "client!dh", name = "x", descriptor = "I")
    public int field2636;

    @OriginalMember(owner = "client!dh", name = "y", descriptor = "I")
    public int field2637;

    @OriginalMember(owner = "client!dh", name = "z", descriptor = "I")
    public int field2638;

    @OriginalMember(owner = "client!dh", name = "A", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!dh", name = "C", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!dh", name = "D", descriptor = "I")
    public int field2642;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public int field2643;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public int field2645;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "Lfl;")
    public static class192 field2644;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V")
    public static void method977(byte arg0) {
        field2630 = null;
        field2635 = null;
        field2629 = null;
        field2628 = null;
        field2644 = null;
        if (arg0 >= -97) {
            method977((byte) 56);
        }
    }

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "(B)V")
    public static final void method978(byte arg0) {
        class207.field3730.method1866(8);
        int var1 = class207.field3730.method1867(8, 8);
        if (var1 < class48.field1027) {
            for (int var2 = var1; var2 < class48.field1027; var2++) {
                class279.field4944[class267.field4700++] = class93.field1646[var2];
            }
        }
        field2631++;
        if (var1 > class48.field1027) {
            throw new RuntimeException("gnpov1");
        }
        class48.field1027 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class93.field1646[var3];
            class23 var5 = class4.field67[var4];
            int var6 = class207.field3730.method1867(1, 8);
            if (var6 == 0) {
                class93.field1646[class48.field1027++] = var4;
                var5.field2542 = class93.field1655;
            } else {
                int var7 = class207.field3730.method1867(2, 8);
                if (var7 == 0) {
                    class93.field1646[class48.field1027++] = var4;
                    var5.field2542 = class93.field1655;
                    class279.field4928[class131.field2376++] = var4;
                } else if (var7 == 1) {
                    class93.field1646[class48.field1027++] = var4;
                    var5.field2542 = class93.field1655;
                    int var8 = class207.field3730.method1867(3, 8);
                    var5.method966((byte) -28, var8, false);
                    int var9 = class207.field3730.method1867(1, 8);
                    if (var9 == 1) {
                        class279.field4928[class131.field2376++] = var4;
                    }
                } else if (var7 == 2) {
                    class93.field1646[class48.field1027++] = var4;
                    var5.field2542 = class93.field1655;
                    int var10 = class207.field3730.method1867(3, 8);
                    var5.method966((byte) -28, var10, true);
                    int var11 = class207.field3730.method1867(3, 8);
                    var5.method966((byte) -28, var11, true);
                    int var12 = class207.field3730.method1867(1, 8);
                    if (var12 == 1) {
                        class279.field4928[class131.field2376++] = var4;
                    }
                } else if (var7 == 3) {
                    class279.field4944[class267.field4700++] = var4;
                }
            }
        }
        if (arg0 <= 103) {
            method977((byte) -12);
        }
    }
}
