import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class100 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "I")
    public static int field1884 = 0;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "Lhj;")
    public static class69 field1882 = class181.method1318("Freie Welt", (byte) -122);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field1881;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V")
    public static void method742(int arg0) {
        field1882 = null;
        if (arg0 >= -29) {
            method743(-76, -116);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(II)V")
    public static final void method743(int arg0, int arg1) {
        class217 var2 = class158.field2935[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class217 var4 = class158.field2935[var3][arg0][arg1] = class158.field2935[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field3929--;
                for (int var5 = 0; var5 < var4.field3940; var5++) {
                    class85 var6 = var4.field3933[var5];
                    if ((var6.field1656 >> 29 & 0x3L) == 2L && var6.field1662 == arg0 && var6.field1653 == arg1) {
                        var6.field1652--;
                    }
                }
            }
        }
        if (class158.field2935[0][arg0][arg1] == null) {
            class158.field2935[0][arg0][arg1] = new class217(0, arg0, arg1);
        }
        class158.field2935[0][arg0][arg1].field3944 = var2;
        class158.field2935[3][arg0][arg1] = null;
    }
}
