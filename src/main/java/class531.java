import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class531 {

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "Ljava/lang/String;")
    public static String field7338 = null;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "Lmw;")
    public static class517 field7337 = new class517(56, 18);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILwc;I)V")
    public static final void method3069(int arg0, int arg1, class74 arg2, int arg3) {
        if (arg0 == 600) {
            class171.field2240[arg1][arg3] = arg2;
            field7335++;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
    public static void method3070(byte arg0) {
        field7337 = null;
        if (arg0 == 26) {
            field7338 = null;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public static final void method3071(int arg0) {
        field7336++;
        int var1 = arg0;
        if (class125.field1721 != null) {
            var1 = class125.field1721.field5182.method1840(43);
        }
        if (var1 == 2) {
            int var2 = class358.field5218 > 800 ? 800 : class358.field5218;
            int var3 = class482.field6754 > 600 ? 600 : class482.field6754;
            class460.field6558 = var2;
            class523.field7268 = (class358.field5218 - var2) / 2;
            class589.field8043 = 0;
            class693.field9222 = var3;
        } else if (var1 == 1) {
            int var4 = class358.field5218 <= 1024 ? class358.field5218 : 1024;
            class460.field6558 = var4;
            class523.field7268 = (class358.field5218 - var4) / 2;
            int var5 = class482.field6754 > 768 ? 768 : class482.field6754;
            class693.field9222 = var5;
            class589.field8043 = 0;
        } else {
            class693.field9222 = class482.field6754;
            class523.field7268 = 0;
            class589.field8043 = 0;
            class460.field6558 = class358.field5218;
        }
    }
}
