import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class113 {

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "[S")
    public static short[] field1534 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "Lnt;")
    public static class151 field1533;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "Lul;")
    public static class411 field1536;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([IIIB[J)V", line = 4)
    public static final void method761(int[] arg0, int arg1, int arg2, byte arg3, long[] arg4) {
        if (arg3 != 20) {
            return;
        }
        field1537++;
        if (arg1 >= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        long var7 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var7;
        int var9 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var9;
        int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
        for (int var11 = arg1; var11 < arg2; var11++) {
            if ((long) (var10 & var11) + var7 > arg4[var11]) {
                long var12 = arg4[var11];
                arg4[var11] = arg4[var6];
                arg4[var6] = var12;
                int var14 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6++] = var14;
            }
        }
        arg4[arg2] = arg4[var6];
        arg4[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var9;
        method761(arg0, arg1, var6 - 1, (byte) 20, arg4);
        method761(arg0, var6 + 1, arg2, (byte) 20, arg4);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(I)V", line = 68)
    public static void method762(int arg0) {
        field1534 = null;
        field1533 = null;
        field1536 = null;
        if (arg0 != 4550) {
            method761(null, -22, -62, (byte) -36, null);
        }
    }
}
