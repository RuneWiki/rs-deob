import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class345 extends class408 {

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "Ltt;")
    public class93 field4995;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "[I")
    public static int[] field4993 = new int[2048];

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Z")
    public static boolean field4990 = false;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)V")
    public static void method2183(byte arg0) {
        if (arg0 > -34) {
            field4991 = -106;
        }
        field4993 = null;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(B)V")
    public static final void method2184(byte arg0) {
        field4994++;
        if (arg0 != -120) {
            field4990 = true;
        }
        class107.field1497 = 0;
        class282.field4007 = new class247[50];
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZZ)V")
    public static final void method2185(boolean arg0, boolean arg1) {
        if (arg1) {
            if (class87.field1249 != -1) {
                class594.method3466(class87.field1249, (byte) 116);
            }
            for (class421 var2 = (class421) class291.field4168.method2283(!arg0); var2 != null; var2 = (class421) class291.field4168.method2282((byte) 65)) {
                if (!var2.method1303((byte) 26)) {
                    var2 = (class421) class291.field4168.method2283(false);
                    if (var2 == null) {
                        break;
                    }
                }
                class327.method2074(false, !arg0, var2, true);
            }
            class87.field1249 = -1;
            class291.field4168 = new class372(8);
            class271.method1724((byte) -122);
            class87.field1249 = class382.field5763;
            class483.method2891(false, false);
            class459.method2805(19);
            class709.method4037(class87.field1249);
        }
        field4989++;
        class523.field7476 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Ltt;)V")
    public class345(class93 arg0) {
        this.field4995 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BZI)V")
    public static final void method2186(byte arg0, boolean arg1, int arg2) {
        field4992++;
        class384 var3 = class529.method3090(arg1, (byte) 65, arg2);
        if (var3 == null) {
            return;
        }
        int var4 = 0;
        if (arg0 >= -61) {
            field4990 = false;
        }
        while (var4 < var3.field5804.length) {
            var3.field5804[var4] = -1;
            var3.field5809[var4] = 0;
            var4++;
        }
    }
}
