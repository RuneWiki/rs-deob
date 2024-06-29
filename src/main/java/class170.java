import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public class class170 {

    @OriginalMember(owner = "client!ju", name = "f", descriptor = "[I")
    public static int[] field2499 = new int[2];

    @OriginalMember(owner = "client!ju", name = "d", descriptor = "Lfr;")
    public static class497 field2497 = new class497();

    @OriginalMember(owner = "client!ju", name = "k", descriptor = "B")
    public byte field2504;

    @OriginalMember(owner = "client!ju", name = "b", descriptor = "F")
    public static float field2495;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ju", name = "e", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ju", name = "l", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!ju", name = "m", descriptor = "I")
    public int field2506;

    @OriginalMember(owner = "client!ju", name = "n", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ju", name = "o", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ju", name = "g", descriptor = "Lqs;")
    public static class50 field2500;

    @OriginalMember(owner = "client!ju", name = "c", descriptor = "Ljava/lang/String;")
    public String field2496;

    @OriginalMember(owner = "client!ju", name = "h", descriptor = "Ljava/lang/String;")
    public String field2501;

    @OriginalMember(owner = "client!ju", name = "i", descriptor = "Ljava/lang/String;")
    public String field2502;

    @OriginalMember(owner = "client!ju", name = "j", descriptor = "Ljava/lang/String;")
    public String field2503;

    @OriginalMember(owner = "client!ju", name = "p", descriptor = "[I")
    public static int[] field2509;

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)V")
    public static void method1175(int arg0) {
        field2499 = null;
        field2497 = null;
        field2509 = null;
        field2500 = null;
        if (arg0 != 2) {
            method1175(-102);
        }
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(BJ)V")
    public static final void method1176(byte arg0, long arg1) {
        try {
            if (arg0 <= 10) {
                method1176((byte) 71, -73L);
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field2494++;
    }

    @OriginalMember(owner = "client!ju", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2498++;
        class74.method547(arg2, (byte) 125);
        int var7 = 0;
        int var8 = arg2 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg2;
        int var10 = -arg2;
        int var11 = var8;
        if (arg5 != 2) {
            method1177(-22, 87, 35, -56, 23, 99, -41);
        }
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class306.field4574[arg4];
        int var16 = arg1 - var8;
        int var17 = arg1 + var8;
        class94.method740(var15, arg1 - arg2, var16, arg3, false);
        class94.method740(var15, var16, var17, arg6, false);
        class94.method740(var15, var17, arg1 + arg2, arg3, false);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var14;
            if (var12 >= 0 && var11 >= 1) {
                class54.field714[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 <= var9) {
                    int[] var18 = class306.field4574[arg4 + var9];
                    int[] var19 = class306.field4574[arg4 - var9];
                    int var20 = arg1 + var7;
                    int var21 = arg1 - var7;
                    class94.method740(var18, var21, var20, arg3, false);
                    class94.method740(var19, var21, var20, arg3, false);
                } else {
                    int[] var22 = class306.field4574[arg4 + var9];
                    int[] var23 = class306.field4574[arg4 - var9];
                    int var24 = class54.field714[var9];
                    int var25 = arg1 + var7;
                    int var26 = arg1 - var7;
                    int var27 = arg1 + var24;
                    int var28 = arg1 - var24;
                    class94.method740(var22, var26, var28, arg3, false);
                    class94.method740(var22, var28, var27, arg6, false);
                    class94.method740(var22, var27, var25, arg3, false);
                    class94.method740(var23, var26, var28, arg3, false);
                    class94.method740(var23, var28, var27, arg6, false);
                    class94.method740(var23, var27, var25, arg3, false);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class306.field4574[arg4 + var7];
            int[] var30 = class306.field4574[arg4 - var7];
            int var31 = arg1 + var9;
            int var32 = arg1 - var9;
            if (var7 < var8) {
                int var33 = var11 < var7 ? class54.field714[var7] : var11;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class94.method740(var29, var32, var35, arg3, false);
                class94.method740(var29, var35, var34, arg6, false);
                class94.method740(var29, var34, var31, arg3, false);
                class94.method740(var30, var32, var35, arg3, false);
                class94.method740(var30, var35, var34, arg6, false);
                class94.method740(var30, var34, var31, arg3, false);
            } else {
                class94.method740(var29, var32, var31, arg3, false);
                class94.method740(var30, var32, var31, arg3, false);
            }
        }
    }
}
