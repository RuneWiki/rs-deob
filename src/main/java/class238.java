import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class238 {

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
    public static int[] field3094 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!d", name = "d", descriptor = "Lhb;")
    public static class250 field3093 = new class250(1, -1);

    @OriginalMember(owner = "client!d", name = "b", descriptor = "F")
    public static float field3091;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "[Lbq;")
    public static class337[] field3092;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[BI[BIIII)V", line = 17)
    public static final void method1510(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        field3095++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        int var11 = -arg5;
        if (arg8 != 9643) {
            return;
        }
        while (var11 < 0) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg0++;
                arg2[var10001] += arg4[arg3++];
                int var14 = arg0++;
                arg2[var14] += arg4[arg3++];
                int var15 = arg0++;
                arg2[var15] += arg4[arg3++];
                int var16 = arg0++;
                arg2[var16] += arg4[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg0++;
                arg2[var10001] += arg4[arg3++];
            }
            arg3 += arg7;
            arg0 += arg6;
            var11++;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)I", line = 61)
    public static final int method1511(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field3090++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg2;
        } else if (arg0 == var4) {
            return 1023 - arg3;
        } else {
            return 1023 - arg2;
        }
    }

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V", line = 88)
    public static void method1513(int arg0) {
        field3093 = null;
        field3094 = null;
        field3092 = null;
        if (arg0 < 90) {
            method1511(88, 8, -65, 50);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BB)V")
    public abstract void method1508(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1509(int arg0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IBI)[B")
    public abstract byte[] method1512(int arg0, byte arg1, int arg2);
}
