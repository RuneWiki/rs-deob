import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class644 extends class212 {

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "Lhr;")
    public class483 field9144;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "Luc;")
    public static class27 field9147 = new class27(31, -1);

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Z")
    public static boolean field9150 = false;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "Z")
    public static boolean field9151 = false;

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "Lof;")
    public static class568 field9149 = new class568(8, 3);

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "I")
    public static int field9143;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "I")
    public static int field9145;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "I")
    public static int field9146;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "I")
    public static int field9148;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V")
    public static void method3584(int arg0) {
        field9149 = null;
        field9147 = null;
        if (arg0 >= -36) {
            field9150 = true;
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(ILjr;)Laq;")
    public static final class146 method3585(int arg0, class96 arg1) {
        field9148++;
        int var2 = arg1.method718(104);
        class52 var3 = class495.method2768((byte) -30)[arg1.method718(arg0 ^ 0x6D)];
        class377 var4 = class428.method2425((byte) -26)[arg1.method718(102)];
        int var5 = arg1.method722(4);
        int var6 = arg1.method722(4);
        int var7 = arg1.method743((byte) -87);
        int var8 = arg1.method743((byte) -95);
        int var9 = arg1.method714(false);
        int var10 = arg1.method714(false);
        int var11 = arg1.method714(false);
        boolean var12 = arg1.method718(arg0 ^ 0x55) == arg0;
        return new class146(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lgj;II[B)V")
    public class644(class580 arg0, int arg1, int arg2, byte[] arg3) {
        this.field9144 = arg0.method3231(arg3, 30569, arg1, false, class381.field5355, arg2);
        this.field9144.method786(false, 27469, false);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(CI)Z")
    public static final boolean method3586(char arg0, int arg1) {
        field9146++;
        if (arg1 != 3) {
            field9149 = null;
        }
        return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(Lgj;II[I)V")
    public class644(class580 arg0, int arg1, int arg2, int[] arg3) {
        this.field9144 = arg0.method3214(arg1, arg2, -17318, arg3, false);
        this.field9144.method786(false, 27469, false);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Le;Ljava/awt/Canvas;I)Loa;")
    public static final class638 method3587(class489 arg0, Canvas arg1, int arg2) {
        if (arg2 < 43) {
            return null;
        } else {
            field9145++;
            return new class55(arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IIIIIIIIZI)V")
    public static final void method3588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        if (arg1 == arg6 && arg0 == arg9 && arg2 == arg7 && arg3 == arg4) {
            class313.method1923(0, arg4, arg7, arg1, arg0, arg5);
        } else {
            int var10 = arg1;
            int var11 = arg0;
            int var12 = arg1 * 3;
            int var13 = arg0 * 3;
            int var14 = arg6 * 3;
            int var15 = arg9 * 3;
            int var16 = arg2 * 3;
            int var17 = arg3 * 3;
            int var18 = arg7 + var14 - arg1 - var16;
            int var19 = var15 + arg4 - var17 - arg0;
            int var20 = var16 + var12 - var14 - var14;
            int var21 = var17 + var13 - var15 - var15;
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
                int var33 = arg1 + (var29 + var31 + var27 >> 12);
                int var34 = (var28 + var30 + var32 >> 12) + arg0;
                class313.method1923(0, var34, var33, var10, var11, arg5);
                var10 = var33;
                var11 = var34;
            }
        }
        if (arg8) {
            field9143++;
        }
    }
}
