import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class629 {

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "I")
    public static int field8863;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "Lpa;")
    public static class648 field8862;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(I)V", line = 7)
    public static final void method3533(int arg0) {
        field8863++;
        int var1 = class306.field3786;
        int[] var2 = class396.field5353;
        int var3 = 0;
        if (arg0 <= 54) {
            method3533(77);
        }
        while (var3 < var1) {
            class236 var9 = class139.field1540[var2[var3]];
            if (var9 != null && var9.field9461 > 0) {
                var9.field9461--;
                if (var9.field9461 == 0) {
                    var9.field9454 = null;
                }
            }
            var3++;
        }
        for (int var4 = 0; var4 < class651.field9144; var4++) {
            long var5 = (long) class398.field5375[var4];
            class214 var7 = (class214) class274.field3433.method3669(var5, -1);
            if (var7 != null) {
                class600 var8 = var7.field2601;
                if (var8.field9461 > 0) {
                    var8.field9461--;
                    if (var8.field9461 == 0) {
                        var8.field9454 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V", line = 68)
    public static void method3534(byte arg0) {
        field8862 = null;
        if (arg0 != 78) {
            method3533(-119);
        }
    }
}
