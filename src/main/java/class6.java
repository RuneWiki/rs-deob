import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class6 {

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "Lqe;")
    public static class465 field105 = new class465(108, 6);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "D")
    public static double field103;

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "Lff;")
    public class9 field106;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIIII)V", line = 4)
    public static final void method33(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field107++;
        if (class435.field6079 != 1) {
            return;
        }
        int var5 = arg3 / class208.field2997;
        int var6 = arg4 / class208.field2997;
        int var7 = arg2 / class653.field9197;
        int var8 = arg1 / class653.field9197;
        if (class63.field1151 <= var5 || var6 < 0 || class688.field9694 <= var7 || var8 < 0) {
            return;
        }
        if (class63.field1151 <= var6) {
            var6 = class63.field1151 - 1;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class688.field9694 <= var8) {
            var8 = class688.field9694 - 1;
        }
        if (!arg0) {
            return;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class742.method4127((byte) -77, class213.field3061 + var9, class688.field9694) * class63.field1151;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = class742.method4127((byte) 97, class179.field2578 + var11, class63.field1151) + var10;
                class168.field2469[var12] = class575.field8150;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V", line = 64)
    public static void method34(int arg0) {
        if (arg0 != -1) {
            field105 = null;
        }
        field105 = null;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V", line = 75)
    public static final void method35(boolean arg0, int arg1) {
        field104++;
        if (class4.method19(-107, arg1) && !arg0) {
            class408.method2498((byte) 111, class117.field1849[arg1], -1);
        }
    }
}
