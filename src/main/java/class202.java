import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bv")
public class class202 extends class435 {

    @OriginalMember(owner = "client!bv", name = "q", descriptor = "I")
    public int field2687;

    @OriginalMember(owner = "client!bv", name = "n", descriptor = "I")
    public int field2684;

    @OriginalMember(owner = "client!bv", name = "m", descriptor = "Lbu;")
    public static class17 field2683 = new class17("WTWIP", 3);

    @OriginalMember(owner = "client!bv", name = "l", descriptor = "I")
    public static int field2682;

    @OriginalMember(owner = "client!bv", name = "o", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!bv", name = "p", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class523[] var7 = class497.field7241;
        int var8 = 0;
        if (arg6 != -28) {
            return;
        }
        while (var8 < var7.length) {
            class523 var9 = var7[var8];
            if (var9 != null && var9.field7698 == 2) {
                class214.method1366(var9.field7687, arg0 >> 1, arg3, 18, var9.field7692, arg2, var9.field7695 * 2, arg1 >> 1, var9.field7696);
                if (class382.field5525[0] > -1 && (class532.field7836 % 20) < 10) {
                    class152.field1984[var9.field7689].method144(class382.field5525[0] + arg5 - 12, class382.field5525[1] + -28 + arg4);
                }
            }
            var8++;
        }
        field2685++;
    }

    @OriginalMember(owner = "client!bv", name = "b", descriptor = "(Z)V")
    public static void method1297(boolean arg0) {
        field2683 = null;
        if (!arg0) {
            method1297(true);
        }
    }

    @OriginalMember(owner = "client!bv", name = "<init>", descriptor = "(II)V")
    public class202(int arg0, int arg1) {
        this.field2687 = arg1;
        this.field2684 = arg0;
    }

    @OriginalMember(owner = "client!bv", name = "a", descriptor = "(B)V")
    public static final void method1298(byte arg0) {
        class248.method1534();
        field2686++;
        if (arg0 != -79) {
            field2683 = null;
        }
    }

    @OriginalMember(owner = "client!bv", name = "c", descriptor = "(I)V")
    public static final void method1299(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field2682++;
        if (class421.field6113 == null) {
            return;
        }
        if (class421.field6113.field3149 == 1) {
            class421.field6113 = null;
            return;
        }
        if (class421.field6113.field3149 == 2) {
            class253.method1567(class87.field1034, true, class518.field7631, 2);
            class421.field6113 = null;
            return;
        }
    }
}
