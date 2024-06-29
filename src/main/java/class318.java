import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class318 extends class297 {

    @OriginalMember(owner = "client!qi", name = "R", descriptor = "I")
    private int field4998;

    @OriginalMember(owner = "client!qi", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field4997 = " has logged in.";

    @OriginalMember(owner = "client!qi", name = "O", descriptor = "Ljava/lang/String;")
    public static String field4995 = "slide:";

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "Z")
    public static boolean field4993 = false;

    @OriginalMember(owner = "client!qi", name = "S", descriptor = "F")
    public static float field4999;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field4991;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field4992;

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!qi", name = "P", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)V", line = 6)
    public static final void method2250(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4996++;
        if (arg1 > -83) {
            method2250(-43, -103, -95, 8, -121);
        }
        for (int var5 = 0; var5 < class288.field4545; var5++) {
            if (arg3 < class301.field4798[var5] + class277.field4356[var5] && arg0 + arg3 > class277.field4356[var5] && class211.field3315[var5] + class11.field250[var5] > arg4 && arg4 + arg2 > class11.field250[var5]) {
                class280.field4378[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)[I", line = 29)
    public final int[] method173(int arg0, boolean arg1) {
        field4991++;
        if (!arg1) {
            return (int[]) null;
        }
        int[] var3 = this.field4760.method215(arg0, 19142);
        if (this.field4760.field388) {
            class330.method2313(var3, 0, class31.field491, this.field4998);
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 54)
    public class318() {
        this(4096);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IILaj;)V", line = 62)
    public final void method169(int arg0, int arg1, class1 arg2) {
        field4992++;
        if (arg1 != 255) {
            this.method169(19, 106, (class1) null);
        }
        if (arg0 == 0) {
            this.field4998 = (arg2.method15((byte) -120) << 12) / 255;
        }
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(I)V", line = 91)
    public class318(int arg0) {
        super(0, true);
        this.field4998 = 4096;
        this.field4998 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIIIIII)V", line = 101)
    public static final void method2251(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class197.method1394(arg1, 0);
        field4994++;
        int var7 = 0;
        int var8 = arg1 - arg3;
        int var9 = arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = -var8;
        int var11 = -1;
        int var12 = -1;
        int var13 = -arg1;
        if (arg0) {
            field4999 = 0.51859653F;
        }
        int[] var14 = class221.field3443[arg2];
        int var15 = var8;
        int var16 = arg5 - var8;
        class323.method2273(arg5 - arg1, arg4, var14, var16, 80);
        int var17 = arg5 + var8;
        class323.method2273(var16, arg6, var14, var17, 43);
        class323.method2273(var17, arg4, var14, arg5 + arg1, 69);
        while (var9 > var7) {
            var12 += 2;
            var10 += var12;
            var11 += 2;
            var13 += var11;
            if (var10 >= 0 && var15 >= 1) {
                class79.field1238[var15] = var7;
                var15--;
                var10 -= var15 << 1;
            }
            var7++;
            if (var13 >= 0) {
                var9--;
                var13 -= var9 << 1;
                if (var8 > var9) {
                    int[] var18 = class221.field3443[arg2 + var9];
                    int[] var19 = class221.field3443[arg2 - var9];
                    int var20 = class79.field1238[var9];
                    int var21 = arg5 - var7;
                    int var22 = arg5 + var7;
                    int var23 = arg5 + var20;
                    int var24 = arg5 - var20;
                    class323.method2273(var21, arg4, var18, var24, 125);
                    class323.method2273(var24, arg6, var18, var23, 65);
                    class323.method2273(var23, arg4, var18, var22, 85);
                    class323.method2273(var21, arg4, var19, var24, 120);
                    class323.method2273(var24, arg6, var19, var23, 89);
                    class323.method2273(var23, arg4, var19, var22, 108);
                } else {
                    int[] var25 = class221.field3443[arg2 + var9];
                    int[] var26 = class221.field3443[arg2 - var9];
                    int var27 = arg5 + var7;
                    int var28 = arg5 - var7;
                    class323.method2273(var28, arg4, var25, var27, 116);
                    class323.method2273(var28, arg4, var26, var27, 42);
                }
            }
            int var29 = arg5 + var9;
            int[] var30 = class221.field3443[arg2 - var7];
            int[] var31 = class221.field3443[arg2 + var7];
            int var32 = arg5 - var9;
            if (var8 > var7) {
                int var33 = var7 <= var15 ? var15 : class79.field1238[var7];
                int var34 = arg5 + var33;
                int var35 = arg5 - var33;
                class323.method2273(var32, arg4, var31, var35, 105);
                class323.method2273(var35, arg6, var31, var34, 121);
                class323.method2273(var34, arg4, var31, var29, 111);
                class323.method2273(var32, arg4, var30, var35, 102);
                class323.method2273(var35, arg6, var30, var34, 106);
                class323.method2273(var34, arg4, var30, var29, 79);
            } else {
                class323.method2273(var32, arg4, var31, var29, 87);
                class323.method2273(var32, arg4, var30, var29, 33);
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)V", line = 237)
    public static void method2252(byte arg0) {
        if (arg0 > 3) {
            field4995 = null;
            field4997 = null;
        }
    }
}
