import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class468 extends class646 {

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "I")
    public int field6536;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Liv;")
    public static class82 field6538 = new class82(1, 4);

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Ljava/lang/String;")
    public static String field6540 = "";

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "[B")
    public static byte[] field6541 = new byte[2048];

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "I")
    public static int field6542;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "Ljg;")
    public static class310 field6543;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(B)V")
    public static void method2747(byte arg0) {
        field6538 = null;
        field6543 = null;
        field6540 = null;
        field6541 = null;
        int var1 = 123 / ((arg0 - 45) / 33);
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(ILpe;Lop;III)V")
    public class468(int arg0, class564 arg1, class172 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field6536 = arg5;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(B)Lsq;")
    public final class161 method448(byte arg0) {
        field6537++;
        if (arg0 != 25) {
            field6540 = null;
        }
        return class518.field7575;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IBIIIII)V")
    public static final void method2748(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class101.method754(1, arg3);
        field6539++;
        if (arg1 < 93) {
            field6542 = -70;
        }
        int var7 = 0;
        int var8 = arg3 - arg2;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class678.field9722[arg5];
        int var16 = arg0 - var8;
        class359.method2018(var15, var16, 124, arg4, arg0 - arg3);
        int var17 = arg0 + var8;
        class359.method2018(var15, var17, 106, arg6, var16);
        class359.method2018(var15, arg0 + arg3, 104, arg4, var17);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class331.field4408[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var18 = class678.field9722[arg5 + var9];
                    int[] var19 = class678.field9722[arg5 - var9];
                    int var20 = class331.field4408[var9];
                    int var21 = arg0 + var7;
                    int var22 = arg0 - var7;
                    int var23 = arg0 + var20;
                    int var24 = arg0 - var20;
                    class359.method2018(var18, var24, 72, arg4, var22);
                    class359.method2018(var18, var23, -31, arg6, var24);
                    class359.method2018(var18, var21, 67, arg4, var23);
                    class359.method2018(var19, var24, 64, arg4, var22);
                    class359.method2018(var19, var23, 108, arg6, var24);
                    class359.method2018(var19, var21, -93, arg4, var23);
                } else {
                    int[] var25 = class678.field9722[arg5 + var9];
                    int[] var26 = class678.field9722[arg5 - var9];
                    int var27 = arg0 + var7;
                    int var28 = arg0 - var7;
                    class359.method2018(var25, var27, -31, arg4, var28);
                    class359.method2018(var26, var27, -49, arg4, var28);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class678.field9722[arg5 + var7];
            int[] var30 = class678.field9722[arg5 - var7];
            int var31 = arg0 + var9;
            int var32 = arg0 - var9;
            if (var7 >= var8) {
                class359.method2018(var29, var31, -71, arg4, var32);
                class359.method2018(var30, var31, -44, arg4, var32);
            } else {
                int var33 = var11 >= var7 ? var11 : class331.field4408[var7];
                int var34 = arg0 + var33;
                int var35 = arg0 - var33;
                class359.method2018(var29, var35, 93, arg4, var32);
                class359.method2018(var29, var34, 121, arg6, var35);
                class359.method2018(var29, var31, 85, arg4, var34);
                class359.method2018(var30, var35, 107, arg4, var32);
                class359.method2018(var30, var34, 77, arg6, var35);
                class359.method2018(var30, var31, 78, arg4, var34);
            }
        }
    }
}
