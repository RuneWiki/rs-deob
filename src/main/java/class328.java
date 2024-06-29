import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class328 {

    @OriginalMember(owner = "client!so", name = "a", descriptor = "Lgk;")
    public static class331 field4586 = new class331("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!so", name = "c", descriptor = "F")
    public static float field4588 = 0.0F;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)V", line = 18)
    public static void method2019(byte arg0) {
        if (arg0 != 32) {
            field4588 = 1.4137807F;
        }
        field4586 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IB)V", line = 29)
    public static final void method2020(int arg0, byte arg1) {
        if (!class478.field7044.field3353) {
            arg0 = -1;
        }
        field4587++;
        if (class164.field2325 == arg0) {
            return;
        }
        if (arg1 <= 124) {
            field4588 = 0.10947551F;
        }
        if (arg0 != -1) {
            class92 var2 = class387.field5733.method1176(arg0, -23);
            class218 var3 = var2.method820(0);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class498.field7404.method2566(new Point(var2.field1261, var2.field1260), class148.field2081, var3.method1494(), var3.method1489(), var3.method1495(), -23853);
                class164.field2325 = arg0;
            }
        }
        if (arg0 == -1 && class164.field2325 != -1) {
            class498.field7404.method2566(new Point(), class148.field2081, -1, null, -1, -23853);
            class164.field2325 = -1;
        }
    }
}
