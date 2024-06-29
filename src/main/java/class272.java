import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class272 {

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "I")
    public static int field4019 = 0;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "Lbt;")
    public static class363 field4022 = new class363(5);

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field4021;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "Ljr;")
    public static class239 field4020;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public static void method1858(int arg0) {
        if (arg0 < 72) {
            method1859(-126, false);
        }
        field4020 = null;
        field4022 = null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(IZ)V")
    public static final void method1859(int arg0, boolean arg1) {
        field4021++;
        class60.method457(14597);
        if (class120.field1610 != 30 && class120.field1610 != 25) {
            return;
        }
        class466.field6857++;
        if (class466.field6857 < 50 && !arg1) {
            return;
        }
        class466.field6857 = arg0;
        if (!class417.field6025 && class72.field933 != null) {
            class18.field289++;
            class257.method1773((byte) -10, class373.field5454);
            try {
                class72.field933.method2694(class159.field2132.field3762, 1, class159.field2132.field3764, 0);
                class159.field2132.field3762 = 0;
            } catch (IOException var2) {
                class417.field6025 = true;
            }
        }
        class60.method457(14597);
    }
}
