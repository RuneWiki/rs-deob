import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public abstract class class708 extends class506 {

    @OriginalMember(owner = "client!tia", name = "e", descriptor = "Z")
    public static boolean field9958 = true;

    @OriginalMember(owner = "client!tia", name = "d", descriptor = "I")
    public static int field9957;

    @OriginalMember(owner = "client!tia", name = "f", descriptor = "I")
    public static int field9959;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)Z", line = 5)
    public static final boolean method3963(int arg0) {
        field9957++;
        if (arg0 != 0) {
            field9958 = false;
        }
        try {
            return class6.method24(arg0 + 57);
        } catch (IOException var4) {
            class125.method878(true);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + (class53.field834 == null ? -1 : class53.field834.method2672(true)) + "," + (class94.field1353 == null ? -1 : class94.field1353.method2672(true)) + "," + (class93.field1338 == null ? -1 : class93.field1338.method2672(true)) + " - " + class322.field4395 + "," + (class108.field1536.field4646[0] + class41.field693) + "," + (class71.field1085 + class108.field1536.field4645[0]) + " - ";
            for (int var3 = 0; var3 < class322.field4395 && var3 < 50; var3++) {
                var2 = var2 + class352.field5213.field6800[var3] + ",";
            }
            class705.method3952(var2, var5, arg0 - 29913);
            class89.method694(false, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(BLjc;)I", line = 42)
    public static final int method3964(byte arg0, class168 arg1) {
        field9959++;
        int var2 = arg1.method1206(2, (byte) -90);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg1.method1206(5, (byte) -90);
        } else if (var2 == 2) {
            var3 = arg1.method1206(8, (byte) -90);
        } else {
            var3 = arg1.method1206(11, (byte) -90);
        }
        return arg0 <= 77 ? -81 : var3;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(B)Ldm;")
    public abstract class96 method469(byte arg0);
}
