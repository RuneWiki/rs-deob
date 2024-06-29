import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class438 extends class212 {

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "Lan;")
    public class22 field6173;

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Lfc;")
    public static class235 field6176 = new class235(41, 0);

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "I")
    public static int field6177 = 1407;

    @OriginalMember(owner = "client!ap", name = "m", descriptor = "J")
    public static long field6179 = 0L;

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field6178 = 0;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field6172;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public static int field6174;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILjr;)Ldaa;")
    public static final class11 method2512(int arg0, class96 arg1) {
        field6175++;
        class80 var2 = class496.method2772((byte) -99, arg1);
        int var3 = arg1.method714(false);
        int var4 = arg1.method714(false);
        int var5 = arg1.method743((byte) -89);
        return arg0 == -1 ? new class11(var2.field1108, var2.field1117, var2.field1116, var2.field1118, var2.field1113, var2.field1109, var2.field1110, var3, var4, var5) : null;
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(B)V")
    public static void method2513(byte arg0) {
        int var1 = -53 / ((-arg0 - 50) / 63);
        field6176 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(Lpj;IIZIBI)V")
    public static final void method2514(class132 arg0, int arg1, int arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        class630.field8791 = arg4;
        class222.field3213 = arg3;
        class7.field68 = arg0;
        if (arg5 <= 14) {
            method2514(null, 9, -114, true, -107, (byte) 123, -62);
        }
        field6172++;
        class268.field3802 = 1;
        class674.field9486 = arg6;
        class457.field6471 = arg2;
        class599.field8326 = class230.field3284.method2475(126) / arg1;
        if (class599.field8326 < 1) {
            class599.field8326 = 1;
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2515(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6174++;
        class647.method3605(false, arg4);
        int var7 = 0;
        int var8 = arg4 - arg5;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg2 != -1) {
            method2513((byte) -83);
        }
        int var14 = -1;
        int[] var15 = class476.field6655[arg1];
        int var16 = arg3 - var8;
        int var17 = arg3 + var8;
        class548.method3012(var16, (byte) 23, arg0, arg3 - arg4, var15);
        class548.method3012(var17, (byte) 23, arg6, var16, var15);
        class548.method3012(arg3 + arg4, (byte) 23, arg0, var17, var15);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class525.field7175[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class476.field6655[arg1 + var9];
                    int[] var19 = class476.field6655[arg1 - var9];
                    int var20 = arg3 + var7;
                    int var21 = arg3 - var7;
                    class548.method3012(var20, (byte) 23, arg0, var21, var18);
                    class548.method3012(var20, (byte) 23, arg0, var21, var19);
                } else {
                    int[] var22 = class476.field6655[arg1 + var9];
                    int[] var23 = class476.field6655[arg1 - var9];
                    int var24 = class525.field7175[var9];
                    int var25 = arg3 + var7;
                    int var26 = arg3 - var7;
                    int var27 = arg3 + var24;
                    int var28 = arg3 - var24;
                    class548.method3012(var28, (byte) 23, arg0, var26, var22);
                    class548.method3012(var27, (byte) 23, arg6, var28, var22);
                    class548.method3012(var25, (byte) 23, arg0, var27, var22);
                    class548.method3012(var28, (byte) 23, arg0, var26, var23);
                    class548.method3012(var27, (byte) 23, arg6, var28, var23);
                    class548.method3012(var25, (byte) 23, arg0, var27, var23);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class476.field6655[arg1 + var7];
            int[] var30 = class476.field6655[arg1 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var8 <= var7) {
                class548.method3012(var31, (byte) 23, arg0, var32, var29);
                class548.method3012(var31, (byte) 23, arg0, var32, var30);
            } else {
                int var33 = var11 >= var7 ? var11 : class525.field7175[var7];
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class548.method3012(var35, (byte) 23, arg0, var32, var29);
                class548.method3012(var34, (byte) 23, arg6, var35, var29);
                class548.method3012(var31, (byte) 23, arg0, var34, var29);
                class548.method3012(var35, (byte) 23, arg0, var32, var30);
                class548.method3012(var34, (byte) 23, arg6, var35, var30);
                class548.method3012(var31, (byte) 23, arg0, var34, var30);
            }
        }
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "(Len;II[B)V")
    public class438(class289 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6173 = class403.method2307(6406, arg1, arg3, 6406, false, (byte) -97, arg2, arg0);
        this.field6173.method3601(false, false, -122);
    }
}
