import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public abstract class class686 extends class424 {

    @OriginalMember(owner = "client!i", name = "n", descriptor = "J")
    public static long field9406 = 0L;

    @OriginalMember(owner = "client!i", name = "q", descriptor = "I")
    public static int field9409 = -1;

    @OriginalMember(owner = "client!i", name = "o", descriptor = "Lhca;")
    public static class365 field9407 = new class365();

    @OriginalMember(owner = "client!i", name = "p", descriptor = "I")
    public static int field9408;

    @OriginalMember(owner = "client!i", name = "r", descriptor = "[[I")
    public static int[][] field9410;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static final void method3749(int arg0) {
        field9408++;
        int var1 = class260.field3508;
        int[] var2 = class135.field1779;
        for (int var3 = 0; var3 < var1; var3++) {
            class193 var10 = class592.field8019[var2[var3]];
            if (var10 != null && var10.field2999 > 0) {
                var10.field2999--;
                if (var10.field2999 == 0) {
                    var10.field3017 = null;
                }
            }
        }
        int var4 = 39 % ((arg0 + 3) / 49);
        for (int var5 = 0; var5 < class248.field3351; var5++) {
            long var6 = (long) class40.field558[var5];
            class234 var8 = (class234) class505.field6640.method39(var6, 31750);
            if (var8 != null) {
                class532 var9 = var8.field3131;
                if (var9.field2999 > 0) {
                    var9.field2999--;
                    if (var9.field2999 == 0) {
                        var9.field3017 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!i", name = "b", descriptor = "(I)V")
    public static void method3750(int arg0) {
        field9410 = null;
        field9407 = null;
        if (arg0 != -23978) {
            field9410 = null;
        }
    }
}
