import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class16 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "[I")
    public static int[] field183 = new int[32];

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field182;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lbk;ILbk;)V")
    public static final void method85(class136 arg0, int arg1, class136 arg2) {
        class34.field414 = arg2;
        if (arg1 >= -61) {
            field183 = null;
        }
        class104.field1503 = arg0;
        field178++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Lwi;")
    public static final class233 method86(int arg0) {
        field176++;
        int var1 = class77.field1126[arg0] * class31.field392[0];
        byte[] var2 = class203.field3645[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class84.field1237[class65.method409(255, var2[var4])];
        }
        class233 var5 = new class233(class149.field2391, class92.field1347, class234.field4169[0], class240.field4261[0], class77.field1126[0], class31.field392[0], var3);
        class168.method1099(false);
        return var5;
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)V")
    public static void method87(int arg0) {
        if (arg0 == 255) {
            field183 = null;
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(II[BI)Lqj;")
    public static final class196 method88(int arg0, int arg1, byte[] arg2, int arg3) {
        class196 var4 = new class196();
        var4.field3459 = arg1;
        field181++;
        var4.field3448 = new byte[arg0];
        for (int var5 = arg3; var5 < arg0 + arg3; var5++) {
            if (arg2[var5] != 0) {
                var4.field3448[var4.field3459++] = arg2[var5];
            }
        }
        return var4;
    }
}
