import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class250 {

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "J")
    public long field4206 = 0L;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "I")
    public static int field4218 = 0;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Z")
    public static boolean field4221 = false;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    public static int field4222 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public int field4203;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public int field4204;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public static int field4205;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public int field4207;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public int field4208;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public int field4209;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public int field4210;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public int field4211;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "I")
    public int field4212;

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public int field4214;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public int field4216;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public int field4217;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "Lva;")
    public static class137 field4219;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Lme;")
    public class177 field4215;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "[[I")
    public static int[][] field4213;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)V", line = 37)
    public static void method1719(byte arg0) {
        if (arg0 < 13) {
            method1719((byte) -67);
        }
        field4213 = (int[][]) null;
        field4219 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIII)V", line = 49)
    public static final void method1720(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4220++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = arg6;
        int var11 = arg6 - arg0;
        int var12 = arg6 * arg6;
        int var13 = arg4 - arg0;
        int var14 = arg4 * arg4;
        int var15 = var13 * var13;
        int var16 = var11 * var11;
        int var17 = var12 << 1;
        int var18 = var14 << 1;
        int var19 = arg6 << 1;
        int var20 = var15 << 1;
        int var21 = var16 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var19) * var14 + var17;
        int var24 = (1 - var22) * var15 + var21;
        int var25 = var12 - ((var19 - 1) * var18);
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var14 << 2;
        int var28 = var12 << 2;
        int var29 = var16 << 2;
        int var30 = var15 << 2;
        int var31 = var17 * 3;
        int var32 = (var19 - 3) * var18;
        int var33 = var21 * 3;
        int var34 = (arg6 - 1) * var27;
        int var35 = (var11 - 1) * var30;
        int var36 = var29;
        int[] var37 = field4213[arg1];
        int var38 = (var22 - 3) * var20;
        int var39 = var28;
        class30.method170(arg3 - var13, var37, arg3 - arg4, arg7, arg2 ^ 0xFFFF899A);
        class30.method170(arg3 + var13, var37, arg3 - var13, arg5, -30310);
        class30.method170(arg3 + arg4, var37, arg3 + var13, arg7, -30310);
        while (var10 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var8++;
                    var23 += var31;
                    var31 += var28;
                    var25 += var39;
                    var39 += var28;
                }
            }
            if (var25 < 0) {
                var23 += var31;
                var25 += var39;
                var39 += var28;
                var31 += var28;
                var8++;
            }
            var25 += -var32;
            var32 -= var27;
            var23 += -var34;
            var34 -= var27;
            boolean var40 = var10 <= var11;
            var10--;
            int var41 = arg1 - var10;
            if (var40) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var9++;
                        var24 += var33;
                        var26 += var36;
                        var33 += var29;
                        var36 += var29;
                    }
                }
                if (var26 < 0) {
                    var26 += var36;
                    var24 += var33;
                    var33 += var29;
                    var9++;
                    var36 += var29;
                }
                var24 += -var35;
                var35 -= var30;
                var26 += -var38;
                var38 -= var30;
            }
            int var42 = arg1 + var10;
            int var43 = arg3 + var8;
            int var44 = arg3 - var8;
            if (var40) {
                int var45 = arg3 - var9;
                class30.method170(var45, field4213[var41], var44, arg7, -30310);
                int var46 = arg3 + var9;
                class30.method170(var46, field4213[var41], var45, arg5, -30310);
                class30.method170(var43, field4213[var41], var46, arg7, -30310);
                class30.method170(var45, field4213[var42], var44, arg7, -30310);
                class30.method170(var46, field4213[var42], var45, arg5, -30310);
                class30.method170(var43, field4213[var42], var46, arg7, -30310);
            } else {
                class30.method170(var43, field4213[var41], var44, arg7, arg2 - 30310);
                class30.method170(var43, field4213[var42], var44, arg7, arg2 ^ 0xFFFF899A);
            }
        }
    }
}
