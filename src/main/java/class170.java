import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class170 extends class129 {

    @OriginalMember(owner = "client!la", name = "K", descriptor = "I")
    public static int field2807 = 0;

    @OriginalMember(owner = "client!la", name = "L", descriptor = "I")
    public static int field2808 = 0;

    @OriginalMember(owner = "client!la", name = "A", descriptor = "I")
    public int field2798;

    @OriginalMember(owner = "client!la", name = "B", descriptor = "I")
    public int field2799;

    @OriginalMember(owner = "client!la", name = "D", descriptor = "I")
    public int field2801;

    @OriginalMember(owner = "client!la", name = "H", descriptor = "I")
    public static int field2805;

    @OriginalMember(owner = "client!la", name = "M", descriptor = "I")
    public int field2809;

    @OriginalMember(owner = "client!la", name = "E", descriptor = "Ljava/lang/String;")
    public String field2802;

    @OriginalMember(owner = "client!la", name = "C", descriptor = "[I")
    public int[] field2800;

    @OriginalMember(owner = "client!la", name = "J", descriptor = "[I")
    public int[] field2806;

    @OriginalMember(owner = "client!la", name = "G", descriptor = "[Li;")
    public class112[] field2804;

    @OriginalMember(owner = "client!la", name = "F", descriptor = "[Ljava/lang/String;")
    public String[] field2803;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1147(String arg0, byte arg1) {
        if (arg1 < 9) {
            method1148(37);
        }
        field2805++;
        String var2 = class21.method145(class103.method702(true, arg0), 32481);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!la", name = "d", descriptor = "(I)V")
    public static final void method1148(int arg0) {
        class73.field1201 = arg0;
        for (int var1 = 0; var1 < class191.field3084; var1++) {
            for (int var2 = 0; var2 < class277.field4439; var2++) {
                if (class79.field1367[arg0][var1][var2] == null) {
                    class79.field1367[arg0][var1][var2] = new class109(arg0, var1, var2);
                }
            }
        }
    }
}
