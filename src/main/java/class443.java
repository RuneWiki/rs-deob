import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class443 {

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "I")
    public static int field6514 = 0;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[I")
    public static int[] field6511 = new int[4096];

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "Z")
    public static boolean field6518;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "Lhn;")
    public static class509 field6517;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "I")
    public int field6509;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public int field6512;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public int field6513;

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "Z")
    public boolean field6515;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field6511[var0] = class518.method3070(-19764, var0);
        }
        field6518 = false;
        field6517 = new class509(49, 3);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)V", line = 5)
    public static void method2729(int arg0) {
        field6511 = null;
        int var1 = -99 / ((arg0 + 31) / 36);
        field6517 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([III[II)V", line = 16)
    public static final void method2730(int[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg4 > arg1) {
            int var5 = (arg1 + arg4) / 2;
            int var6 = arg1;
            int var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            int var8 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg1; var10 < arg4; var10++) {
                if (arg0[var10] < ((var9 & var10) + var7)) {
                    int var11 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6] = var11;
                    int var12 = arg3[var10];
                    arg3[var10] = arg3[var6];
                    arg3[var6++] = var12;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg3[arg4] = arg3[var6];
            arg3[var6] = var8;
            method2730(arg0, arg1, -115, arg3, var6 - 1);
            method2730(arg0, var6 + 1, 8, arg3, arg4);
        }
        int var13 = 79 / ((-arg2 - 70) / 44);
        field6516++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILul;Lul;Lul;Lul;)V", line = 79)
    public static final void method2731(int arg0, class406 arg1, class406 arg2, class406 arg3, class406 arg4) {
        class73.field1043 = arg1;
        field6510++;
        class80.field1142 = arg4;
        class66.field857 = arg3;
        if (arg0 <= 2) {
            field6511 = null;
        }
        class95.field1369 = arg2;
        class200.field3326 = new class114[class73.field1043.method2561(-102)][];
        class341.field5065 = new boolean[class73.field1043.method2561(-81)];
    }
}
