import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public abstract class class133 {

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Lbe;")
    public static class283 field2237 = class153.method941(127, "Art");

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "Lbe;")
    public static class283 field2241 = class153.method941(-70, "http:)4)4");

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    public static int field2238;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    public static int field2240;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "[I")
    public static int[] field2236;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lek;I)V", line = 19)
    public static final void method826(class172 arg0, int arg1) {
        field2240++;
        class57.field787 = arg0;
        if (arg1 != -30723) {
            method829();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 33)
    public static void method827(int arg0) {
        field2241 = null;
        if (arg0 == 0) {
            field2236 = null;
            field2237 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "(I)V", line = 56)
    public static final void method828(int arg0) {
        field2238++;
        int var1 = class2.field14;
        int var2 = class87.field1472;
        int var3 = class47.field653;
        int var4 = 6116423;
        int var5 = class31.field473;
        class311.method2116(var1, var2, var3, var5, var4);
        class311.method2116(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class311.method2113(var1 + 1, var2 - -18, var3 - 2, var5 + -19, 0);
        if (arg0 != -25878) {
            field2241 = (class283) null;
        }
        class240.field4056.method1643(class301.field5076, var1 + 3, var2 + 14, var4, -1);
        int var6 = class163.field2700;
        int var7 = class109.field1849;
        for (int var8 = 0; var8 < class42.field589; var8++) {
            int var9 = (class42.field589 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var7 && (var1 + var3) > var7 && (var9 - 13) < var6 && var6 < (var9 + 3)) {
                var10 = 16776960;
            }
            class240.field4056.method1643(class183.method1207(var8, (byte) -125), var1 + 3, var9, var10, 0);
        }
        class241.method1626(class31.field473, class2.field14, class47.field653, class87.field1472, -14702);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "()V", line = 112)
    public static final void method829() {
        for (int var0 = 0; var0 < class116.field1969; var0++) {
            class26 var1 = class257.field4338[var0];
            class180.method1191(var1);
            class257.field4338[var0] = null;
        }
        class116.field1969 = 0;
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(II)[B")
    public abstract byte[] method351(int arg0, int arg1);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IB)I")
    public abstract int method347(int arg0, byte arg1);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)Lsb;")
    public abstract class103 method343(int arg0);

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(II)V")
    public abstract void method341(int arg0, int arg1);
}
