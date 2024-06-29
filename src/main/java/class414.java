import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class414 {

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "[I")
    public static int[] field6096 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "I")
    public static int field6095;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "I")
    public static int field6097;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "Lum;")
    public static class83 field6094;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)V")
    public static void method2594(int arg0) {
        field6096 = null;
        if (arg0 != -32498) {
            field6096 = null;
        }
        field6094 = null;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)V")
    public static final void method2595(byte arg0) {
        field6097++;
        class317.field4831.method1637((byte) 13);
        if (arg0 < 87) {
            field6096 = null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "()V")
    public static final void method2596() {
        for (int var0 = 0; var0 < class327.field4957; var0++) {
            class76 var1 = class195.field3065[var0];
            class241.method1620(var1);
            class195.field3065[var0] = null;
        }
        class327.field4957 = 0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II)V")
    public static final void method2597(int arg0, int arg1) {
        class281 var2 = class348.field5192[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class281 var4 = class348.field5192[var3][arg0][arg1] = class348.field5192[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field4384--;
                for (class21 var5 = var4.field4381; var5 != null; var5 = var5.field235) {
                    class76 var6 = var5.field240;
                    if (var6.field1283 == arg0 && var6.field1277 == arg1) {
                        var6.field1274--;
                    }
                }
            }
        }
        if (class348.field5192[0][arg0][arg1] == null) {
            class348.field5192[0][arg0][arg1] = new class281(0, arg0, arg1);
            class348.field5192[0][arg0][arg1].field4373 = 1;
        }
        class348.field5192[0][arg0][arg1].field4372 = var2;
        class348.field5192[3][arg0][arg1] = null;
    }
}
