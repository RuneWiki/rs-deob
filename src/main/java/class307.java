import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class307 {

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "I")
    public static int field4634 = 0;

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!ai", name = "d", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "Loj;")
    public static class363 field4636;

    @OriginalMember(owner = "client!ai", name = "e", descriptor = "[Ls;")
    public static class143[] field4638;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(I)V")
    public static final void method1884(int arg0) {
        field4639++;
        if (arg0 != -1) {
            field4634 = 82;
        }
        int var1 = field4634;
        int[] var2 = class201.field3038;
        for (int var3 = 0; var3 < var1; var3++) {
            class169 var7 = class140.field1883[var2[var3]];
            if (var7 != null && var7.field1982 > 0) {
                var7.field1982--;
                if (var7.field1982 == 0) {
                    var7.field1979 = null;
                }
            }
        }
        for (int var4 = 0; var4 < class38.field458; var4++) {
            int var5 = class87.field1235[var4];
            class155 var6 = class170.field2626[var5];
            if (var6 != null && var6.field1982 > 0) {
                var6.field1982--;
                if (var6.field1982 == 0) {
                    var6.field1979 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(I)V")
    public static void method1885(int arg0) {
        field4638 = null;
        if (arg0 != -1) {
            method1884(-72);
        }
        field4636 = null;
    }
}
