import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class174 extends class93 {

    @OriginalMember(owner = "client!sd", name = "ab", descriptor = "I")
    public static int field3367 = 0;

    @OriginalMember(owner = "client!sd", name = "X", descriptor = "[Z")
    public static boolean[] field3364 = new boolean[100];

    @OriginalMember(owner = "client!sd", name = "bb", descriptor = "Ljd;")
    public static class92 field3368 = class202.method1325((byte) 90, " )2>");

    @OriginalMember(owner = "client!sd", name = "Z", descriptor = "[Ljd;")
    public static class92[] field3366 = new class92[100];

    @OriginalMember(owner = "client!sd", name = "U", descriptor = "Ljd;")
    public static class92 field3361 = class202.method1325((byte) 90, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!sd", name = "S", descriptor = "Ljd;")
    private static class92 field3359 = class202.method1325((byte) 90, "Loading fonts )2 ");

    @OriginalMember(owner = "client!sd", name = "W", descriptor = "Ljd;")
    public static class92 field3363 = class202.method1325((byte) 90, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!sd", name = "Y", descriptor = "Ljd;")
    public static class92 field3365 = field3359;

    @OriginalMember(owner = "client!sd", name = "T", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!sd", name = "cb", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!sd", name = "db", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!sd", name = "eb", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!sd", name = "fb", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!sd", name = "V", descriptor = "Lnh;")
    public static class133 field3362;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        ++field3360;
        int[] var3 = super.field1887.method916(arg0, -71);
        int var4 = 91 / ((67 - arg1) / 42);
        if (super.field1887.field2757) {
            int[] var5 = this.method648((byte) 76, arg0, 0);
            for (int var6 = 0; ~class150.field2985 < ~var6; ++var6) {
                var3[var6] = -var5[var6] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        if (arg1 != 4096) {
            return null;
        } else {
            int[][] var3 = super.field1873.method553(arg0, 0);
            if (super.field1873.field1656) {
                int[][] var4 = this.method649(0, true, arg0);
                int[] var5 = var4[1];
                int[] var6 = var4[2];
                int[] var7 = var4[0];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class150.field2985 < ~var11; ++var11) {
                    var8[var11] = -var7[var11] + 4096;
                    var9[var11] = -var5[var11] + 4096;
                    var10[var11] = -var6[var11] + 4096;
                }
            }
            ++field3372;
            return var3;
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILh;I)V")
    public final void method63(int arg0, class70 arg1, int arg2) {
        if (arg2 == 0) {
            ++field3370;
            if (~arg0 == -1) {
                super.field1885 = arg1.method443(255) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIBI)I")
    public static final int method1148(int arg0, int arg1, byte arg2, int arg3) {
        ++field3371;
        int var4 = arg3 / arg1;
        int var5 = arg3 & arg1 + -1;
        int var6 = arg0 / arg1;
        int var7 = arg0 & arg1 + -1;
        int var8 = class76.method524(var6, var4, false);
        int var9 = -19 / ((arg2 - 2) / 54);
        int var10 = class76.method524(var6, var4 + 1, false);
        int var11 = class76.method524(var6 + 1, var4, false);
        int var12 = class76.method524(var6 + 1, var4 + 1, false);
        int var13 = class127.method850(true, var5, arg1, var10, var8);
        int var14 = class127.method850(true, var5, arg1, var12, var11);
        return class127.method850(true, var7, arg1, var14, var13);
    }

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "(I)V")
    public static void method1149(int arg0) {
        if (arg0 == 0) {
            field3362 = null;
            field3359 = null;
            field3368 = null;
            field3366 = null;
            field3365 = null;
            field3361 = null;
            field3363 = null;
            field3364 = null;
        }
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "()V")
    public class174() {
        super(1, false);
    }
}
