import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class119 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Lga;")
    public static class243 field1822;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "Llg;")
    public static class25 field1824;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "Lri;")
    public static class482 field1821;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)Z")
    public static final boolean method899(int arg0, int arg1) {
        field1825++;
        if (arg1 == -3) {
            return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    public static void method900(byte arg0) {
        field1821 = null;
        if (arg0 > -114) {
            method900((byte) -112);
        }
        field1822 = null;
        field1824 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "([JII[IB)V")
    public static final void method901(long[] arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        if (arg4 != -96) {
            return;
        }
        field1820++;
        if (arg1 <= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg2;
        long var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        int var9 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var9;
        int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
        for (int var11 = arg2; var11 < arg1; var11++) {
            if (arg0[var11] < ((long) (var11 & var10) + var7)) {
                long var12 = arg0[var11];
                arg0[var11] = arg0[var6];
                arg0[var6] = var12;
                int var14 = arg3[var11];
                arg3[var11] = arg3[var6];
                arg3[var6++] = var14;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var9;
        method901(arg0, var6 - 1, arg2, arg3, (byte) -96);
        method901(arg0, arg1, var6 + 1, arg3, (byte) -96);
    }
}
