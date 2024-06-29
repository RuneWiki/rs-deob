import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class195 {

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "[I")
    public static int[] field3274 = new int[100];

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "[Z")
    public static boolean[] field3271 = new boolean[5];

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lek;")
    public static class206 field3272;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V", line = 10)
    public static void method1344(byte arg0) {
        field3272 = null;
        if (arg0 >= -16) {
            method1345(73, (String[]) null);
        }
        field3274 = null;
        field3271 = null;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;", line = 27)
    public static final String[] method1345(int arg0, String[] arg1) {
        field3270++;
        String[] var2 = new String[5];
        for (int var3 = arg0; var3 < 5; var3++) {
            var2[var3] = var3 + ": ";
            if (arg1 != null && arg1[var3] != null) {
                var2[var3] = var2[var3] + arg1[var3];
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I)V", line = 58)
    public static final void method1346(int arg0) {
        class119.field2124.method889((byte) 47);
        if (arg0 <= -21) {
            class147.field2513.method889((byte) 113);
            class192.field3251.method889((byte) -125);
            field3273++;
        }
    }
}
