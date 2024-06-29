import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class469 {

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "I")
    public static int field6954 = 0;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "Lhga;")
    public static class158 field6953 = new class158(36, -2);

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "Z")
    public static boolean field6957 = true;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "J")
    public static long field6956;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Lri;")
    public static class97 field6958;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2911(boolean arg0) {
        field6953 = null;
        if (arg0) {
            field6954 = 113;
        }
        field6958 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V", line = 16)
    public static final void method2912(int arg0, int arg1, int arg2) {
        boolean var3 = class454.field6818[0][arg1][arg2] != null && class454.field6818[0][arg1][arg2].field4030 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class454.field6818[var4][arg1][arg2] == null) {
                class252 var5 = class454.field6818[var4][arg1][arg2] = new class252(var4);
                if (var3) {
                    var5.field4035++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIIIBII)V", line = 36)
    public static final void method2913(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        field6955++;
        if (arg5 >= -56) {
            field6953 = null;
        }
        if (arg0 == arg7) {
            class479.method2966(-1, arg7, arg6, arg2, arg4, arg3, arg1);
        } else if (class576.field8218 <= (arg3 - arg7) && (arg3 + arg7) <= class340.field5510 && arg1 - arg0 >= class545.field7931 && arg0 + arg1 <= class585.field8331) {
            class226.method1660(arg4, arg2, arg3, arg0, arg6, -15, arg1, arg7);
        } else {
            class61.method679(arg3, arg1, 25798, arg6, arg7, arg2, arg0, arg4);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([JII[IB)V", line = 66)
    public static final void method2914(long[] arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        field6952++;
        if (arg1 > arg2) {
            int var5 = (arg1 + arg2) / 2;
            int var6 = arg2;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
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
            method2914(arg0, var6 - 1, arg2, arg3, (byte) 81);
            method2914(arg0, arg1, var6 + 1, arg3, (byte) 81);
        }
        if (arg4 != 81) {
            field6953 = null;
        }
    }
}
