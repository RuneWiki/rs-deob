import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class178 {

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "J")
    public static long field2486 = 0L;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Lvg;")
    public static class622 field2478 = new class622(63, 28);

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public int field2484;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "[Li;")
    public static class682[] field2480;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ZI)V")
    public static final void method1209(boolean arg0, int arg1) {
        class433.field6282 = new int[arg1];
        if (arg0) {
            return;
        }
        class426.field6229 = new int[arg1];
        field2487++;
        class232.field3068 = new int[arg1];
        class444.field6452 = new int[arg1];
        class657.field9381 = new int[arg1];
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IZI)I")
    public static final int method1210(int arg0, boolean arg1, int arg2) {
        field2485++;
        if (arg1) {
            field2478 = null;
        }
        int var3 = arg0 >> 31 & arg2 - 1;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIBI)V")
    public static final void method1211(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = -56 % ((arg5 + 44) / 60);
        field2481++;
        int var8 = class79.method461((byte) 100, class148.field2106, arg2, class323.field4704);
        int var9 = class79.method461((byte) 104, class148.field2106, arg6, class323.field4704);
        int var10 = class79.method461((byte) 91, class375.field5631, arg3, class175.field2455);
        int var11 = class79.method461((byte) 100, class375.field5631, arg1, class175.field2455);
        int var12 = class79.method461((byte) 86, class148.field2106, arg2 + arg4, class323.field4704);
        int var13 = class79.method461((byte) 119, class148.field2106, arg6 - arg4, class323.field4704);
        for (int var14 = var8; var14 < var12; var14++) {
            class41.method235(var10, class565.field8253[var14], 0, var11, arg0);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class41.method235(var10, class565.field8253[var15], 0, var11, arg0);
        }
        int var16 = class79.method461((byte) 121, class375.field5631, arg3 + arg4, class175.field2455);
        int var17 = class79.method461((byte) 73, class375.field5631, arg1 - arg4, class175.field2455);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class565.field8253[var18];
            class41.method235(var10, var19, 0, var16, arg0);
            class41.method235(var17, var19, 0, var11, arg0);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
    public static void method1212(byte arg0) {
        field2480 = null;
        if (arg0 == -3) {
            field2478 = null;
        }
    }
}
