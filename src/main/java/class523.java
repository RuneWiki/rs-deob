import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class523 extends class612 {

    @OriginalMember(owner = "client!wa", name = "m", descriptor = "I")
    public static int field7335 = 0;

    @OriginalMember(owner = "client!wa", name = "l", descriptor = "Z")
    public static boolean field7334 = false;

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!wa", name = "n", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!wa", name = "o", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "[[I")
    public static int[][] field7333;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Lra;Lfc;IIIZLet;Lpa;Ljava/lang/String;III)V")
    public static final void method2974(class90 arg0, class216 arg1, int arg2, int arg3, int arg4, boolean arg5, class509 arg6, class309 arg7, String arg8, int arg9, int arg10, int arg11) {
        if (arg5) {
            method2975(-15);
        }
        field7337++;
        int var12;
        if (class617.field8931 == 4) {
            var12 = (int) class558.field8223 & 0x3FFF;
        } else {
            var12 = (int) class558.field8223 + class335.field4369 & 0x3FFF;
        }
        int var13 = Math.max(arg6.field7094 / 2, arg6.field7059 / 2) + 10;
        int var14 = arg4 * arg4 + arg10 * arg10;
        if (var14 > (var13 * var13)) {
            return;
        }
        int var15 = class442.field6100[var12];
        int var16 = class442.field6101[var12];
        if (class617.field8931 != 4) {
            var16 = var16 * 256 / (class194.field2354 + 256);
            var15 = var15 * 256 / (class194.field2354 + 256);
        }
        int var17 = arg4 * var15 + arg10 * var16 >> 15;
        int var18 = arg4 * var16 - arg10 * var15 >> 15;
        int var19 = arg1.method1238(100, null, 19635, arg8);
        int var20 = var17 - var19 / 2;
        int var21 = arg1.method1239(null, 0, (byte) 114, arg8, 100);
        if (var20 >= (-arg6.field7094) && arg6.field7094 >= var20 && (-arg6.field7059) <= var18 && var18 <= arg6.field7059) {
            arg0.method550(null, arg6.field7059 / 2 + arg11 - arg9 - var18 - var21, null, 1, arg7, arg8, 50, arg11, arg2, true, 0, var19, arg6.field7094 / 2 + (var20 + arg2), arg3, 0, 0);
        }
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(I)V")
    public static void method2975(int arg0) {
        field7333 = null;
        int var1 = -54 % ((22 - arg0) / 39);
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(BZ)V")
    public static final void method2976(byte arg0, boolean arg1) {
        field7332++;
        if (class279.field3671.length() == 0) {
            return;
        }
        class543.method3175("--> " + class279.field3671, true);
        class474.method2757(1, arg1, class279.field3671, false);
        if (arg0 != 5) {
            field7333 = null;
        }
        class348.field4479 = 0;
        class279.field3671 = "";
        class40.field313 = 0;
    }
}
