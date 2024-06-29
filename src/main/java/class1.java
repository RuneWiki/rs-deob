import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class17 {

    @OriginalMember(owner = "client!us", name = "d", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "[[[B")
    public static byte[][][] field5;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(III)I", line = 10)
    public static final int method1(int arg0, int arg1, int arg2) {
        int var3 = -42 % ((34 - arg0) / 32);
        field2++;
        return arg2 == 4 || arg2 == 5 ? class245.field3614[arg1 & 0x3] : 256;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB[Ljava/lang/Object;[I)V", line = 24)
    public static final void method2(int arg0, int arg1, byte arg2, Object[] arg3, int[] arg4) {
        field1++;
        if (arg2 > -2) {
            method1(-76, -91, 53);
        }
        if (arg0 <= arg1) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg1;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg0];
        arg4[arg0] = var7;
        Object var8 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg0; var10++) {
            if (arg4[var10] < ((var9 & var10) + var7)) {
                int var11 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6] = var11;
                Object var12 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6++] = var12;
            }
        }
        arg4[arg0] = arg4[var6];
        arg4[var6] = var7;
        arg3[arg0] = arg3[var6];
        arg3[var6] = var8;
        method2(var6 - 1, arg1, (byte) -124, arg3, arg4);
        method2(arg0, var6 + 1, (byte) -53, arg3, arg4);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)V", line = 83)
    public static void method3(boolean arg0) {
        field5 = null;
        if (!arg0) {
            field4 = -107;
        }
    }
}
