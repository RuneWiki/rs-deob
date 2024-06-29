import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class388 {

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "Z")
    public static boolean field5620 = true;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "Lmw;")
    public static class517 field5621 = new class517(13, 8);

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "F")
    public static float field5622;

    @OriginalMember(owner = "client!bfa", name = "d", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!bfa", name = "e", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!bfa", name = "f", descriptor = "Lcj;")
    public static class720 field5625;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2403(int arg0) {
        field5623++;
        if (arg0 != 22447) {
            method2403(-13);
        }
        for (int var1 = 0; var1 < class10.field118; var1++) {
            class183 var2 = class642.field8649[var1];
            if (var2.field2412 == 3) {
                if (var2.field2396 == null) {
                    var2.field2402 = Integer.MIN_VALUE;
                } else {
                    class701.field9285.method22(var2.field2396);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(B)V", line = 50)
    public static void method2404(byte arg0) {
        if (arg0 <= 120) {
            field5625 = null;
        }
        field5625 = null;
        field5621 = null;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Z[[I)V", line = 65)
    public static final void method2405(boolean arg0, int[][] arg1) {
        field5624++;
        class228.field2951 = arg1;
        if (!arg0) {
            field5625 = null;
        }
    }
}
