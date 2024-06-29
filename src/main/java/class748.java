import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class748 {

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "I")
    public static int field10458 = 100;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field10457;

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "I")
    public static int field10460;

    @OriginalMember(owner = "client!gfa", name = "f", descriptor = "I")
    public static int field10462;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "[Lkr;")
    public static class743[] field10461;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field10459;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I[IZI[ILgt;)Lmfa;", line = 7)
    public static final class613 method4161(int arg0, int[] arg1, boolean arg2, int arg3, int[] arg4, class453 arg5) {
        if (!arg2) {
            return null;
        }
        field10460++;
        if (!arg5.method1035(-106, class438.field6117, class643.field9137)) {
            int[] var6 = new int[arg0 * arg3];
            for (int var7 = 0; var7 < arg0; var7++) {
                int var8 = arg3 * var7 + arg4[var7];
                for (int var9 = 0; var9 < arg1[var7]; var9++) {
                    var6[var8++] = -16777216;
                }
            }
            return new class613(arg5, arg3, arg0, var6);
        }
        byte[] var10 = new byte[arg0 * arg3];
        for (int var11 = 0; var11 < arg0; var11++) {
            int var12 = arg3 * var11 + arg4[var11];
            for (int var13 = 0; var13 < arg1[var11]; var13++) {
                var10[var12++] = -1;
            }
        }
        return new class613(arg5, arg3, arg0, var10);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(I)V", line = 76)
    public static void method4162(int arg0) {
        if (arg0 < -70) {
            field10461 = null;
            field10459 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(Z[Ljava/lang/Object;[I)V", line = 95)
    public static final void method4163(boolean arg0, Object[] arg1, int[] arg2) {
        if (arg0) {
            field10461 = null;
        }
        class64.method684((byte) 96, arg2, arg2.length - 1, arg1, 0);
        field10457++;
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)V", line = 106)
    public static final void method4164(int arg0, int arg1) {
        if (arg0 != -4943) {
            method4161(24, null, false, -104, null, null);
        }
        field10462++;
        class354 var2 = class501.method3012(arg1, 2, 2145997216);
        var2.method2216(0);
    }
}
