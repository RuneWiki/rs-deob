import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class24 extends class1 {

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Lok;")
    public static class41 field367 = class137.method956(" )2> <col=ffffff>", 45);

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "I")
    public static int field369 = 0;

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field370;

    @OriginalMember(owner = "client!wg", name = "s", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!wg", name = "t", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "[S")
    public static short[] field365;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V", line = 18)
    public static void method163(int arg0) {
        field367 = null;
        field365 = null;
        if (arg0 != 0) {
            field367 = (class41) null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I[IJI)Lok;", line = 40)
    public static final class41 method164(int arg0, int[] arg1, long arg2, int arg3) {
        field366++;
        if (class79.field1163 != null) {
            class41 var5 = class79.field1163.method166(arg2, (byte) -106, arg0, arg1);
            if (var5 != null) {
                return var5;
            }
        }
        if (arg3 == 0) {
            return arg0 == 5 ? class235.method1690(arg2, (byte) -127).method288((byte) -118) : class136.method951(arg2, (byte) -124);
        } else {
            return (class41) null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "(I)V", line = 85)
    public static final void method165(int arg0) {
        int[] var1 = new int[class213.field3435];
        field372++;
        int var2 = 0;
        if (arg0 != -6418) {
            return;
        }
        for (int var3 = 0; var3 < class213.field3435; var3++) {
            class138 var4 = class130.method918(var3, -41);
            if (var4.field2076 >= 0 || var4.field2114 >= 0) {
                var1[var2++] = var3;
            }
        }
        class43.field685 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            class43.field685[var5] = var1[var5];
        }
    }
}
