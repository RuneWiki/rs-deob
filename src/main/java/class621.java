import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class621 {

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "[I")
    public static int[] field8310 = new int[1000];

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "S")
    public static short field8313 = 320;

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "I")
    public int field8311;

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "I")
    public static int field8312;

    @OriginalMember(owner = "client!ur", name = "e", descriptor = "I")
    public int field8314;

    @OriginalMember(owner = "client!ur", name = "g", descriptor = "I")
    public int field8316;

    @OriginalMember(owner = "client!ur", name = "h", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!ur", name = "i", descriptor = "I")
    public static int field8318;

    @OriginalMember(owner = "client!ur", name = "f", descriptor = "[I")
    public static int[] field8315;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIIIBI)V", line = 4)
    public static final void method3505(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        class274.method1837(arg3, -2);
        field8317++;
        int var7 = 0;
        int var8 = arg3 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        if (arg5 > -27) {
            field8315 = null;
        }
        int[] var15 = class538.field7454[arg1];
        int var16 = arg2 - var8;
        class102.method675(arg4, -33, arg2 - arg3, var16, var15);
        int var17 = arg2 + var8;
        class102.method675(arg0, -55, var16, var17, var15);
        class102.method675(arg4, 108, var17, arg2 + arg3, var15);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class618.field8298[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 >= var8) {
                    int[] var18 = class538.field7454[arg1 + var9];
                    int[] var19 = class538.field7454[arg1 - var9];
                    int var20 = arg2 + var7;
                    int var21 = arg2 - var7;
                    class102.method675(arg4, -85, var21, var20, var18);
                    class102.method675(arg4, 41, var21, var20, var19);
                } else {
                    int[] var22 = class538.field7454[arg1 + var9];
                    int[] var23 = class538.field7454[arg1 - var9];
                    int var24 = class618.field8298[var9];
                    int var25 = arg2 + var7;
                    int var26 = arg2 - var7;
                    int var27 = arg2 + var24;
                    int var28 = arg2 - var24;
                    class102.method675(arg4, -92, var26, var28, var22);
                    class102.method675(arg0, -116, var28, var27, var22);
                    class102.method675(arg4, 62, var27, var25, var22);
                    class102.method675(arg4, 75, var26, var28, var23);
                    class102.method675(arg0, 47, var28, var27, var23);
                    class102.method675(arg4, 66, var27, var25, var23);
                }
            }
            int[] var29 = class538.field7454[arg1 + var7];
            int[] var30 = class538.field7454[arg1 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var7 >= var8) {
                class102.method675(arg4, 113, var32, var31, var29);
                class102.method675(arg4, 94, var32, var31, var30);
            } else {
                int var33 = var7 > var11 ? class618.field8298[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class102.method675(arg4, 49, var32, var35, var29);
                class102.method675(arg0, 81, var35, var34, var29);
                class102.method675(arg4, -87, var34, var31, var29);
                class102.method675(arg4, 110, var32, var35, var30);
                class102.method675(arg0, 66, var35, var34, var30);
                class102.method675(arg4, 44, var34, var31, var30);
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 136)
    public static final void method3506(String arg0, boolean arg1) {
        field8312++;
        if (!arg1) {
            field8313 = 9;
        }
        if (arg0.equals("")) {
            return;
        }
        class284.field4091++;
        class583 var2 = class54.method400(class213.field2800, (byte) 118, class169.field2353);
        var2.field7963.method444(class712.method4007(arg0, 4927), 128);
        var2.field7963.method510(arg0, (byte) 61);
        class463.method2838(var2, (byte) 124);
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Z)V", line = 161)
    public static void method3507(boolean arg0) {
        field8310 = null;
        if (arg0) {
            field8315 = null;
        }
    }
}
