import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public class class468 {

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "[I")
    public static int[] field6495 = new int[50];

    @OriginalMember(owner = "client!rt", name = "b", descriptor = "Z")
    public static boolean field6496 = false;

    @OriginalMember(owner = "client!rt", name = "c", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!rt", name = "d", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(I[I)Ljava/lang/String;", line = 12)
    public static final String method2797(int arg0, int[] arg1) {
        int var2 = 32 % ((62 - arg0) / 42);
        field6498++;
        StringBuffer var3 = new StringBuffer();
        int var4 = class692.field9667;
        for (int var5 = 0; var5 < arg1.length; var5++) {
            class427 var6 = class545.field7585.method2793(35, arg1[var5]);
            if (var6.field5968 != -1) {
                class318 var7 = (class318) class463.field6468.method312(0, (long) var6.field5968);
                if (var7 == null) {
                    class279 var8 = class279.method1821(class149.field1968, var6.field5968, 0);
                    if (var8 != null) {
                        var7 = class111.field1332.method192(var8, true);
                        class463.field6468.method305(var7, (long) var6.field5968, 18320);
                    }
                }
                if (var7 != null) {
                    class492.field6782[var4] = var7;
                    var3.append(" <img=").append(var4).append(">");
                    var4++;
                }
            }
        }
        return var3.toString();
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(ILha;)V", line = 65)
    public static final void method2798(int arg0, class473 arg1) {
        if (arg0 > -127) {
            field6496 = true;
        }
        field6497++;
        if (class474.field6578) {
            class701.method3968((byte) -83, arg1);
        } else {
            class567.method3339(arg1, true);
        }
    }

    @OriginalMember(owner = "client!rt", name = "a", descriptor = "(Z)V", line = 80)
    public static void method2799(boolean arg0) {
        if (arg0) {
            field6495 = null;
        }
        field6495 = null;
    }
}
