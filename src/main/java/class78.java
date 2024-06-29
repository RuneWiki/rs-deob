import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class78 {

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lpe;")
    public static class100 field1444 = new class100(50);

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lij;")
    public static class50 field1445 = method578(124, "M");

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Le;")
    public static class86 field1447 = new class86();

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lij;")
    public static class50 field1448 = method578(127, " <col=ffffff>");

    @OriginalMember(owner = "client!li", name = "g", descriptor = "[Lgh;")
    public static class106[] field1449 = new class106[100];

    @OriginalMember(owner = "client!li", name = "h", descriptor = "I")
    public static int field1450 = 0;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILjava/lang/String;)Lij;")
    public static final class50 method578(int arg0, String arg1) {
        if (arg0 < 120) {
            method579(-78, -110);
        }
        byte[] var2 = arg1.getBytes();
        int var3 = var2.length;
        int var4 = 0;
        class50 var5 = new class50();
        field1443++;
        var5.field909 = new byte[var3];
        while (var4 < var3) {
            int var6 = var2[var4++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 >= var3) {
                    break;
                }
                int var7 = var2[var4++] & 0xFF;
                var5.field909[var5.field898++] = (byte) (var6 * 43 + var7 - 1768);
            } else if (var6 != 0) {
                var5.field909[var5.field898++] = (byte) var6;
            }
        }
        var5.method409(-1);
        return var5.method373(126);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Lij;")
    public static final class50 method579(int arg0, int arg1) {
        field1446++;
        return arg1 == -26225 ? class102.method777(arg0, 10, 114, false) : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(Z)V")
    public static void method580(boolean arg0) {
        field1447 = null;
        field1448 = null;
        if (!arg0) {
            method580(false);
        }
        field1445 = null;
        field1449 = null;
        field1444 = null;
    }
}
