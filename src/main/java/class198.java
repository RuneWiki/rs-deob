import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vc")
public class class198 {

    @OriginalMember(owner = "client!vc", name = "c", descriptor = "I")
    public static int field2771 = 0;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!vc", name = "b", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!vc", name = "d", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(Z)V", line = 8)
    public static final void method1233(boolean arg0) {
        field2769++;
        if (class94.field1266) {
            return;
        }
        class477.field6873 = true;
        class94.field1266 = true;
        if (arg0) {
            return;
        }
        if (class118.field1533.field6908) {
            class473.field6841 = ((int) class473.field6841 + 47 & 0xFFFFFFF0);
        } else {
            class107.field1432 += (12.0F - class107.field1432) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(IIII)V", line = 36)
    public static final void method1234(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class118.field1533.field6899 * arg0 >> 8;
        if (arg2 != 0) {
            return;
        }
        field2772++;
        if (arg3 == -1 && !class286.field4089) {
            class213.method1318(arg2);
        } else if (arg3 != -1 && (class153.field1966 != arg3 || !class417.method2479(arg2 ^ 0x5285)) && var4 != 0 && !class286.field4089) {
            class218.method1343(arg3, arg1, false, 55, var4, class389.field5781, 0);
        }
        class153.field1966 = arg3;
    }

    @OriginalMember(owner = "client!vc", name = "a", descriptor = "(II[I[Ljava/lang/Object;I)V", line = 61)
    public static final void method1235(int arg0, int arg1, int[] arg2, Object[] arg3, int arg4) {
        int var5 = -13 / ((48 - arg0) / 62);
        if (arg4 > arg1) {
            int var6 = (arg1 + arg4) / 2;
            int var7 = arg1;
            int var8 = arg2[var6];
            arg2[var6] = arg2[arg4];
            arg2[arg4] = var8;
            Object var9 = arg3[var6];
            arg3[var6] = arg3[arg4];
            arg3[arg4] = var9;
            int var10 = ~var8 == Integer.MIN_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg4; var11++) {
                if ((var11 & var10) + var8 > arg2[var11]) {
                    int var12 = arg2[var11];
                    arg2[var11] = arg2[var7];
                    arg2[var7] = var12;
                    Object var13 = arg3[var11];
                    arg3[var11] = arg3[var7];
                    arg3[var7++] = var13;
                }
            }
            arg2[arg4] = arg2[var7];
            arg2[var7] = var8;
            arg3[arg4] = arg3[var7];
            arg3[var7] = var9;
            method1235(124, arg1, arg2, arg3, var7 - 1);
            method1235(-101, var7 + 1, arg2, arg3, arg4);
        }
        field2770++;
    }
}
