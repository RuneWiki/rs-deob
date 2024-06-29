import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class594 extends InputStream {

    @OriginalMember(owner = "client!jt", name = "c", descriptor = "Z")
    public static boolean field8025 = false;

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "[I")
    public static int[] field8030 = new int[14];

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "Lra;")
    public static class361 field8023 = new class361(25, -2);

    @OriginalMember(owner = "client!jt", name = "b", descriptor = "I")
    public static int field8024;

    @OriginalMember(owner = "client!jt", name = "d", descriptor = "I")
    public static int field8026;

    @OriginalMember(owner = "client!jt", name = "e", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!jt", name = "f", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "[[B")
    public static byte[][] field8029;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method3225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8026++;
        int var8 = 0;
        int var9 = arg4;
        int var10 = 0;
        int var11 = arg5 - arg7;
        int var12 = arg4 - arg7;
        int var13 = arg5 * arg5;
        int var14 = arg4 * arg4;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg4 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg4 - 1) * var27;
        int var37 = var30;
        if (arg1 != -17784) {
            return;
        }
        int var38 = (var12 - 1) * var29;
        int[] var39 = class213.field2746[arg2];
        class349.method2008(arg0 - var11, (byte) 60, var39, arg0 - arg5, arg6);
        class349.method2008(arg0 + var11, (byte) 34, var39, arg0 - var11, arg3);
        class349.method2008(arg0 + arg5, (byte) 82, var39, arg0 + var11, arg6);
        while (var9 > 0) {
            boolean var40 = var9 <= var12;
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var10++;
                        var37 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var31;
                    var24 += var35;
                    var31 += var28;
                    var35 += var28;
                    var8++;
                }
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var35 += var28;
                var31 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var9--;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg2 - var9;
            int var42 = arg2 + var9;
            int var43 = arg0 + var8;
            int var44 = arg0 - var8;
            if (var40) {
                int var45 = arg0 + var10;
                int var46 = arg0 - var10;
                class349.method2008(var46, (byte) 106, class213.field2746[var41], var44, arg6);
                class349.method2008(var45, (byte) 62, class213.field2746[var41], var46, arg3);
                class349.method2008(var43, (byte) 11, class213.field2746[var41], var45, arg6);
                class349.method2008(var46, (byte) 53, class213.field2746[var42], var44, arg6);
                class349.method2008(var45, (byte) 42, class213.field2746[var42], var46, arg3);
                class349.method2008(var43, (byte) 9, class213.field2746[var42], var45, arg6);
            } else {
                class349.method2008(var43, (byte) 54, class213.field2746[var41], var44, arg6);
                class349.method2008(var43, (byte) 85, class213.field2746[var42], var44, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 174)
    public static final boolean method3226(int arg0, String arg1) {
        field8028++;
        return arg0 > -56 ? false : class197.method1304(true, arg1, 10, -44);
    }

    @OriginalMember(owner = "client!jt", name = "read", descriptor = "()I", line = 189)
    public final int read() {
        field8027++;
        class122.method905(30000L, -6145);
        return -1;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(I)V", line = 202)
    public static void method3227(int arg0) {
        field8029 = null;
        if (arg0 == 0) {
            field8023 = null;
            field8030 = null;
        }
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(BLfd;)Lpv;", line = 218)
    public static final class167 method3228(byte arg0, class418 arg1) {
        field8024++;
        int var2 = -123 % ((arg0 + 30) / 40);
        class485 var3 = class291.method1728(arg1, true);
        int var4 = arg1.method2383(65280);
        return new class167(var3.field579, var3.field574, var3.field581, var3.field582, var3.field584, var3.field585, var3.field575, var3.field587, var3.field586, var3.field6461, var3.field6460, var3.field6459, var3.field6458, var3.field6462, var3.field6465, var4);
    }
}
