import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class177 {

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lna;")
    private static class26 field2783 = class69.method505("Continue", (byte) -120);

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "Lna;")
    public static class26 field2787 = field2783;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Lna;")
    public static class26 field2785 = class69.method505("Ladevorgang )2 bitte warten Sie)3", (byte) -119);

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(B)V", line = 6)
    public static void method1222(byte arg0) {
        int var1 = 50 % ((-arg0 - 41) / 57);
        field2783 = null;
        field2785 = null;
        field2787 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 22)
    public static final void method1223(int arg0) {
        field2788++;
        for (int var1 = 0; var1 < class81.field1270; var1++) {
            int var2 = class316.field5412[var1];
            class324 var3 = class185.field2877[var2];
            if (var3 != null) {
                class262.method1848(var3.field5565.field2894, 2279, var3);
            }
        }
        if (arg0 > -4) {
            method1224((byte) 25, 108);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)V", line = 60)
    public static final void method1224(byte arg0, int arg1) {
        field2781++;
        if (arg1 == -1 || !class259.field4226[arg1]) {
            return;
        }
        class240.field3884.method1884(7561, arg1);
        if (class86.field1416[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class86.field1416[arg1].length; var3++) {
            if (class86.field1416[arg1][var3] != null) {
                if (class86.field1416[arg1][var3].field4988 == 2) {
                    var2 = false;
                } else {
                    class86.field1416[arg1][var3] = null;
                }
            }
        }
        int var4 = 43 / ((-arg0 - 70) / 47);
        if (var2) {
            class86.field1416[arg1] = null;
        }
        class259.field4226[arg1] = false;
    }
}
