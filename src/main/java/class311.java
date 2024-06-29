import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class311 extends class80 {

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "I")
    public int field5224;

    @OriginalMember(owner = "client!fj", name = "r", descriptor = "I")
    public int field5221;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "S")
    public static short field5219 = 1;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "[I")
    public static int[] field5222 = new int[100];

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    public static int field5220 = -1;

    @OriginalMember(owner = "client!fj", name = "l", descriptor = "[I")
    public static int[] field5215 = new int[4096];

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "I")
    public static int field5223 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "Lph;")
    public static class229 field5225 = class266.method1858("Moteur son pr-Bpar-B", 0);

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "Lph;")
    private static class229 field5218 = class266.method1858("scroll:", 0);

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "Lph;")
    public static class229 field5216 = field5218;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "Lph;")
    public static class229 field5217 = field5218;

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V", line = 9)
    public static void method2103(int arg0) {
        field5217 = null;
        field5215 = null;
        field5225 = null;
        if (arg0 > -83) {
            field5225 = (class229) null;
        }
        field5216 = null;
        field5222 = null;
        field5218 = null;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lki;)V", line = 36)
    public static final void method2104(class152 arg0) {
        for (int var1 = arg0.field2464; var1 <= arg0.field2478; var1++) {
            for (int var2 = arg0.field2468; var2 <= arg0.field2463; var2++) {
                class72 var3 = class225.field3705[arg0.field2469][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field1211; var4++) {
                        if (var3.field1216[var4] == arg0) {
                            var3.field1211--;
                            for (int var5 = var4; var5 < var3.field1211; var5++) {
                                var3.field1216[var5] = var3.field1216[var5 + 1];
                                var3.field1221[var5] = var3.field1221[var5 + 1];
                            }
                            var3.field1216[var3.field1211] = null;
                            break;
                        }
                    }
                    var3.field1226 = 0;
                    for (int var6 = 0; var6 < var3.field1211; var6++) {
                        var3.field1226 |= var3.field1221[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(II)V", line = 101)
    public class311(int arg0, int arg1) {
        this.field5224 = arg0;
        this.field5221 = arg1;
    }
}
