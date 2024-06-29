import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class393 {

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[F")
    public static float[] field5754 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "Lkj;")
    public static class527 field5753 = new class527(7, 7);

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field5752;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(BZ)V")
    public static final void method2428(byte arg0, boolean arg1) {
        class509 var2 = (class509) class203.field3124.method1224(arg0 ^ 0xFFFFFFD1);
        if (arg0 != 47) {
            return;
        }
        while (var2 != null) {
            if (var2.field7212 != null) {
                class50.field1184.method2073(var2.field7212);
                var2.field7212 = null;
            }
            if (var2.field7221 != null) {
                class50.field1184.method2073(var2.field7221);
                var2.field7221 = null;
            }
            var2.method2588(300);
            var2 = (class509) class203.field3124.method1232(-2);
        }
        field5755++;
        if (!arg1) {
            return;
        }
        for (class509 var3 = (class509) class614.field8925.method1224(arg0 - 49); var3 != null; var3 = (class509) class614.field8925.method1232(-2)) {
            if (var3.field7212 != null) {
                class50.field1184.method2073(var3.field7212);
                var3.field7212 = null;
            }
            var3.method2588(arg0 + 253);
        }
        for (class509 var4 = (class509) class518.field7304.method2597((byte) -94); var4 != null; var4 = (class509) class518.field7304.method2594((byte) -122)) {
            if (var4.field7212 != null) {
                class50.field1184.method2073(var4.field7212);
                var4.field7212 = null;
            }
            var4.method2588(300);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method2429(int arg0) {
        field5753 = null;
        field5754 = null;
        if (arg0 != 0) {
            method2428((byte) -58, false);
        }
    }
}
