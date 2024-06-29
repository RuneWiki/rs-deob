import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hha")
public class class521 {

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "I")
    private static int field6944 = 0;

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "Z")
    private static boolean field6943 = false;

    @OriginalMember(owner = "client!hha", name = "c", descriptor = "Lro;")
    private static class2 field6945 = new class2();

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(ZI)V")
    public static final synchronized void method2892(boolean arg0, int arg1) {
        if (arg1 <= 47) {
            method2894(11);
        }
        field6943 = arg0;
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Z)V")
    public static final synchronized void method2893(boolean arg0) {
        if (arg0) {
            field6945 = null;
        }
        while (true) {
            class151 var1 = (class151) field6945.method10(false);
            if (var1 == null) {
                return;
            }
            var1.field2342.method116(true);
            var1.method3564(true);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(I)V")
    public static final synchronized void method2894(int arg0) {
        field6944++;
        if (arg0 != -1) {
            field6943 = true;
        }
    }

    @OriginalMember(owner = "client!hha", name = "b", descriptor = "(I)V")
    public static final synchronized void method2895(int arg0) {
        if (arg0 != -26583) {
            field6944 = 61;
        }
        field6944--;
        if (field6944 == 0) {
            method2893(false);
        }
    }

    @OriginalMember(owner = "client!hha", name = "a", descriptor = "(Le;B)V")
    public static final synchronized void method2896(class533 arg0, byte arg1) {
        if (field6943) {
            return;
        }
        if (field6944 > 0) {
            class151 var2 = new class151();
            var2.field2342 = arg0;
            field6945.method11(var2, -95);
        } else {
            arg0.method116(false);
        }
        int var3 = -16 / ((-arg1 - 16) / 41);
    }
}
