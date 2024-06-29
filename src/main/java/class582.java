import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class582 extends class108 {

    @OriginalMember(owner = "client!ri", name = "k", descriptor = "[B")
    public byte[] field8304;

    @OriginalMember(owner = "client!ri", name = "n", descriptor = "F")
    public static float field8307;

    @OriginalMember(owner = "client!ri", name = "l", descriptor = "I")
    public static int field8305;

    @OriginalMember(owner = "client!ri", name = "m", descriptor = "I")
    public static int field8306;

    @OriginalMember(owner = "client!ri", name = "o", descriptor = "I")
    public static int field8308;

    @OriginalMember(owner = "client!ri", name = "p", descriptor = "I")
    public static int field8309;

    @OriginalMember(owner = "client!ri", name = "q", descriptor = "I")
    public static int field8310;

    @OriginalMember(owner = "client!ri", name = "r", descriptor = "I")
    public static int field8311;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(B[B)Z")
    public static final boolean method3333(byte arg0, byte[] arg1) {
        field8310++;
        if (arg0 > -29) {
            return true;
        }
        class268 var2 = new class268(arg1);
        int var3 = var2.method1738(255);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method1738(255) == 1;
        if (var4) {
            class633.method3661(-128, var2);
        }
        class612.method3471(var2, 118);
        return true;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 == arg2 && arg3 == arg6 && arg5 == arg8 && arg4 == arg7) {
            class604.method3442(arg0, arg7, arg6, arg9, arg5, -21);
        } else {
            int var10 = arg0;
            int var11 = arg6;
            int var12 = arg0 * 3;
            int var13 = arg6 * 3;
            int var14 = arg2 * 3;
            int var15 = arg3 * 3;
            int var16 = arg8 * 3;
            int var17 = arg4 * 3;
            int var18 = arg5 + var14 - var16 - arg0;
            int var19 = var15 + arg7 - var17 - arg6;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var13 + var17 - var15 - var15;
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg0;
                int var34 = arg6 + (var28 + var30 + var32 >> 12);
                class604.method3442(var10, var34, var11, arg9, var33, -127);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg1 != 16079) {
            field8307 = -0.918023F;
        }
        field8308++;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "([B)V")
    public class582(byte[] arg0) {
        this.field8304 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(II)I")
    public static final int method3335(int arg0, int arg1) {
        if (arg1 == -1200298902) {
            field8306++;
            return arg0 >>> 10;
        } else {
            return 87;
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)Z")
    public static final boolean method3336(int arg0, byte arg1) {
        if (arg1 != -35) {
            method3337((byte) 71, null, null);
        }
        field8305++;
        return arg0 >= 4 && arg0 <= 8;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BLjava/awt/Canvas;Ln;)Lqa;")
    public static final class167 method3337(byte arg0, Canvas arg1, class472 arg2) {
        int var3 = -6 / ((arg0 - 4) / 53);
        field8309++;
        return new class326(arg1, arg2);
    }
}
