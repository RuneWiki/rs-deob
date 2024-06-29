import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public abstract class class63 {

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public static int field968 = -1;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "Lfc;")
    public static class343 field969;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Lkm;)V")
    public static final void method460(class487 arg0) {
        for (int var1 = class425.field5846; var1 < class109.field1542; var1++) {
            for (int var2 = 0; var2 < class456.field6299; var2++) {
                for (int var3 = 0; var3 < class205.field2946; var3++) {
                    class406 var4 = class455.field6293[var1][var2][var3];
                    if (var4 != null) {
                        class467 var5 = var4.field5617;
                        class467 var6 = var4.field5624;
                        if (var5 != null && var5.method195(94)) {
                            class338.method2009(arg0, var5, var1, var2, var3, 1, 1);
                            if (var6 != null && var6.method195(124)) {
                                class338.method2009(arg0, var6, var1, var2, var3, 1, 1);
                                var6.method198(0, arg0, 0, false, 0, var5, (byte) 59);
                                var6.method202((byte) 43);
                            }
                            var5.method202((byte) 57);
                        }
                        for (class146 var7 = var4.field5613; var7 != null; var7 = var7.field2066) {
                            class478 var9 = var7.field2062;
                            if (var9 != null && var9.method195(100)) {
                                class338.method2009(arg0, var9, var1, var2, var3, var9.field6751 + 1 - var9.field6753, var9.field6749 - var9.field6747 + 1);
                                var9.method202((byte) 121);
                            }
                        }
                        class367 var8 = var4.field5621;
                        if (var8 != null && var8.method195(115)) {
                            class419.method2444(arg0, var8, var1, var2, var3);
                            var8.method202((byte) 73);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(B)V")
    public static void method461(byte arg0) {
        field969 = null;
        if (arg0 >= -91) {
            method461((byte) -47);
        }
    }
}
