import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class178 {

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field2883 = 0;

    @OriginalMember(owner = "client!e", name = "f", descriptor = "I")
    public static int field2888 = 0;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "F")
    public static float field2886;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 6)
    public static final void method1268(int arg0) {
        field2884++;
        if (class284.field4622 != null || class317.field5361 != null) {
            return;
        }
        int var1 = class95.field1416;
        if (arg0 != 23188) {
            method1268(57);
        }
        if (class251.field3993) {
            if (var1 != 1) {
                int var2 = class129.field1929;
                int var3 = class53.field789;
                if (var2 < class239.field3833 - 10 || var2 > (class239.field3833 + class117.field1717 + 10) || var3 < class109.field1528 - 10 || class109.field1528 - (-class228.field3637 - 10) < var3) {
                    class251.field3993 = false;
                    class67.method492(false, class109.field1528, class239.field3833, class117.field1717, class228.field3637);
                }
            }
            if (var1 == 1) {
                int var4 = class239.field3833;
                int var5 = class109.field1528;
                int var6 = class151.field2358;
                int var7 = class117.field1717;
                int var8 = -1;
                int var9 = class245.field3941;
                for (int var10 = 0; var10 < class98.field1432; var10++) {
                    int var11 = (class98.field1432 - var10 - 1) * 15 + var5 + 31;
                    if (var6 > var4 && var6 < (var4 + var7) && var11 - 13 < var9 && (var11 + 3) > var9) {
                        var8 = var10;
                    }
                }
                if (var8 != -1) {
                    class202.method1436(var8, -108);
                }
                class251.field3993 = false;
                class67.method492(false, class109.field1528, class239.field3833, class117.field1717, class228.field3637);
            }
            return;
        }
        if (var1 == 1 && class98.field1432 > 0) {
            short var12 = class296.field4780[class98.field1432 - 1];
            if (var12 == 18 || var12 == 15 || var12 == 21 || var12 == 35 || var12 == 13 || var12 == 1 || var12 == 51 || var12 == 5 || var12 == 24 || var12 == 26 || var12 == 17 || var12 == 1003) {
                int var13 = class123.field1818[class98.field1432 - 1];
                int var14 = class118.field1727[class98.field1432 - 1];
                class302 var15 = class165.method1157(false, var14);
                if (class285.method1999(client.method2119(var15), -120) || class265.method1878(client.method2119(var15), arg0 - 23125)) {
                    class265.field4199 = 0;
                    class161.field2567 = false;
                    if (class284.field4622 != null) {
                        class18.method91(28515, class284.field4622);
                    }
                    class284.field4622 = class165.method1157(false, var14);
                    class203.field3260 = class245.field3941;
                    class153.field2442 = var13;
                    class312.field5266 = class151.field2358;
                    class18.method91(28515, class284.field4622);
                    return;
                }
            }
        }
        if (var1 == 1 && (class192.field3107 == 1 && class98.field1432 > 2 || class89.method637(class98.field1432 - 1, 0))) {
            var1 = 2;
        }
        if (var1 == 2 && class98.field1432 > 0 || class9.field114 == 1) {
            class46.method331((byte) 114);
        }
        if (var1 == 1 && class98.field1432 > 0 || class9.field114 == 2) {
            class228.method1633(true);
        }
    }
}
