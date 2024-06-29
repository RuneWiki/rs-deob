import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class56 {

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "[I")
    public static int[] field783 = new int[1000];

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "Ljv;")
    public static class606 field787 = new class606(2, 1);

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "Lxa;")
    public static class424 field785;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V", line = 3)
    public static void method351(int arg0) {
        field783 = null;
        if (arg0 != 20547) {
            method353(123, 20, 23, -112);
        }
        field787 = null;
        field785 = null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IZ)Lnd;", line = 26)
    public static final class409 method352(int arg0, boolean arg1) {
        field786++;
        if (arg1) {
            field787 = null;
        }
        class409[] var2 = class127.method767(22141);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class409 var4 = var2[var3];
            if (var4.field5751 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIII)I", line = 60)
    public static final int method353(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= -11) {
            return -111;
        }
        field784++;
        if ((class645.field9140[arg1][arg2][arg3] & 0x8) == 0) {
            return arg1 <= 0 || (class645.field9140[1][arg2][arg3] & 0x2) == 0 ? arg1 : arg1 - 1;
        } else {
            return 0;
        }
    }
}
