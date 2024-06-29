import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class747 {

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "I")
    public static int field10416;

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "I")
    public static int field10417;

    @OriginalMember(owner = "client!eia", name = "a", descriptor = "(I)V")
    public static final void method4161(int arg0) {
        field10417++;
        if (arg0 == 0 && !class509.field7380) {
            class275.field3877 = true;
            class509.field7380 = true;
            class112.field1579 += (24.0F - class112.field1579) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)V")
    public static final void method4162(int arg0) {
        class641.field9120 = 0;
        class647.field9322 = 0;
        field10416++;
        for (int var1 = arg0; var1 < class595.field8451; var1++) {
            int var2 = class565.field8192 * var1;
            for (int var3 = 0; var3 < class565.field8192; var3++) {
                int var4 = var2 + var3;
                class577.field8283[var4].method687(class381.field5523 * var3, class519.field7488 * var1, class381.field5523, class519.field7488, 0, 0, true, true);
            }
        }
    }
}
