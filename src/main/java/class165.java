import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class165 {

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "J")
    public long field2551 = 0L;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "I")
    public static int field2550 = 0;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public int field2545;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public int field2546;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public int field2547;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public int field2548;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public int field2549;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public int field2553;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public int field2554;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lsc;")
    public class248 field2552;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "Lsc;")
    public class248 field2555;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II[I[II)V")
    public static final void method1134(int arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field2557++;
        if (arg4 != 1) {
            method1134(95, 116, (int[]) null, (int[]) null, 76);
        }
        if (arg1 <= arg0) {
            return;
        }
        int var5 = (arg0 + arg1) / 2;
        int var6 = arg0;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var7;
        int var8 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var8;
        for (int var9 = arg0; var9 < arg1; var9++) {
            if ((var9 & 0x1) + var7 < arg2[var9]) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                int var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg2[arg1] = arg2[var6];
        arg2[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var8;
        method1134(arg0, var6 - 1, arg2, arg3, arg4);
        method1134(var6 + 1, arg1, arg2, arg3, 1);
    }
}
