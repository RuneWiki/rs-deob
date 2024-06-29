import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class594 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "[[I")
    public static int[][] field8606 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field8605;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "I")
    public static int field8607;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field8608;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZI)I")
    public static final int method3380(boolean arg0, int arg1) {
        field8608++;
        if (class148.field2097 == null) {
            return 0;
        } else if (!arg0 && class153.field2157 != null) {
            return class148.field2097.length * 2;
        } else if (arg1 > -19) {
            return 46;
        } else {
            int var2 = 0;
            for (int var3 = 0; var3 < class148.field2097.length; var3++) {
                int var4 = class148.field2097[var3];
                if (class109.field1625.method1818(var4, 4)) {
                    var2++;
                }
                if (class235.field3097.method1818(var4, 4)) {
                    var2++;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(II)Z")
    public static final boolean method3381(int arg0, int arg1) {
        field8607++;
        if (arg0 <= 32) {
            method3380(false, 85);
        }
        return arg1 >= 0 && arg1 <= 3 || arg1 == 9;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B[I[III)V")
    public static final void method3382(byte arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg0 < 57) {
            method3382((byte) -52, null, null, -7, -80);
        }
        if (arg3 < arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            int var7 = arg2[var5];
            arg2[var5] = arg2[arg4];
            arg2[arg4] = var7;
            int var8 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg3; var10 < arg4; var10++) {
                if ((var7 + (var10 & var9)) > arg2[var10]) {
                    int var11 = arg2[var10];
                    arg2[var10] = arg2[var6];
                    arg2[var6] = var11;
                    int var12 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6++] = var12;
                }
            }
            arg2[arg4] = arg2[var6];
            arg2[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var8;
            method3382((byte) 75, arg1, arg2, arg3, var6 - 1);
            method3382((byte) 77, arg1, arg2, var6 + 1, arg4);
        }
        field8605++;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method3383(byte arg0) {
        field8606 = null;
        if (arg0 <= 47) {
            method3383((byte) 120);
        }
    }
}
