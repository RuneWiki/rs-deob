import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class50 {

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field686;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "[Lbe;")
    public static class283[] field685;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V", line = 20)
    public static final void method290(int arg0, int arg1) {
        class160 var2 = class86.field1459[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class160 var4 = class86.field1459[var3][arg0][arg1] = class86.field1459[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2630--;
                for (int var5 = 0; var5 < var4.field2627; var5++) {
                    class26 var6 = var4.field2623[var5];
                    if ((var6.field379 >> 29 & 0x3L) == 2L && var6.field398 == arg0 && var6.field394 == arg1) {
                        var6.field386--;
                    }
                }
            }
        }
        if (class86.field1459[0][arg0][arg1] == null) {
            class86.field1459[0][arg0][arg1] = new class160(0, arg0, arg1);
        }
        class86.field1459[0][arg0][arg1].field2621 = var2;
        class86.field1459[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)Z", line = 62)
    public static final boolean method291(int arg0) {
        if (arg0 == 2) {
            field686++;
            return class237.field3965 == 0 ? class254.field4298.method159((byte) 110) : true;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V", line = 77)
    public static void method292(int arg0) {
        if (arg0 != 1) {
            field685 = (class283[]) null;
        }
        field685 = null;
    }
}
