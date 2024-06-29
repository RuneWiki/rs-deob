import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class95 extends class399 {

    @OriginalMember(owner = "client!lt", name = "j", descriptor = "Lej;")
    public static class229 field1171 = new class229("", 13);

    @OriginalMember(owner = "client!lt", name = "q", descriptor = "[I")
    public static int[] field1178 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!lt", name = "i", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!lt", name = "k", descriptor = "I")
    public int field1172;

    @OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
    public int field1173;

    @OriginalMember(owner = "client!lt", name = "m", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!lt", name = "p", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!lt", name = "o", descriptor = "Lbo;")
    public class631 field1176;

    @OriginalMember(owner = "client!lt", name = "n", descriptor = "[Lqn;")
    public class455[] field1175;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)V")
    public static void method524(int arg0) {
        if (arg0 > -86) {
            field1171 = null;
        }
        field1171 = null;
        field1178 = null;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(ZZ)Z")
    public static boolean method525(boolean arg0, boolean arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Loa;III)Z")
    public final boolean method526(class689 arg0, int arg1, int arg2, int arg3) {
        int var5 = -68 % ((arg3 + 80) / 43);
        field1177++;
        if (this.field1175 != null) {
            for (int var6 = 0; var6 < this.field1175.length; var6++) {
                if (this.field1175[var6].method2579(arg2, arg1) && this.field1176.method137(arg2, arg1, 119, arg0)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(I[J[III)V")
    public static final void method527(int arg0, long[] arg1, int[] arg2, int arg3, int arg4) {
        if (arg3 > arg4) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg4;
            long var7 = arg1[var5];
            arg1[var5] = arg1[arg3];
            arg1[arg3] = var7;
            int var9 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg4; var11 < arg3; var11++) {
                if ((long) (var10 & var11) + var7 > arg1[var11]) {
                    long var12 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6] = var12;
                    int var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg1[arg3] = arg1[var6];
            arg1[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var9;
            method527(13, arg1, arg2, var6 - 1, arg4);
            method527(13, arg1, arg2, arg3, var6 + 1);
        }
        if (arg0 != 13) {
            method527(61, null, null, 108, 57);
        }
        field1174++;
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
    public static final void method528(int arg0, int arg1) {
        if (arg0 > 26) {
            field1169++;
            class19 var2 = class364.method2236(1248116640, arg1, 2);
            var2.method104(10);
        }
    }
}
