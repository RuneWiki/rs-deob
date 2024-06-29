import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public abstract class class606 {

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "[I")
    public static int[] field8182 = new int[250];

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "Lkr;")
    public static class602 field8179 = new class602(70, -1);

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "I")
    public static int field8180;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "I")
    public static int field8181;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field8184;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IJIILuv;IBLaa;I)V")
    public static final void method3448(int arg0, long arg1, int arg2, int arg3, class755 arg4, int arg5, byte arg6, class573 arg7, int arg8) {
        field8183++;
        int var10 = arg0 * arg0 + arg3 * arg3;
        if (arg1 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg4.field10393 / 2, arg4.field10501 / 2);
        if (var11 * var11 < var10) {
            var11 -= 10;
            int var12;
            if (class720.field10023 == 4) {
                var12 = (int) class596.field8093 & 0x3FFF;
            } else {
                var12 = (int) class596.field8093 + class439.field6126 & 0x3FFF;
            }
            int var13 = class24.field312[var12];
            int var14 = class24.field308[var12];
            if (class720.field10023 != 4) {
                var14 = var14 * 256 / (class31.field372 + 256);
                var13 = var13 * 256 / (class31.field372 + 256);
            }
            int var15 = arg3 * var13 + (arg0 * var14) >> 14;
            int var16 = arg3 * var14 - (arg0 * var13) >> 14;
            double var17 = Math.atan2((double) var15, (double) var16);
            int var19 = (int) ((double) var11 * Math.sin(var17));
            int var20 = (int) ((double) var11 * Math.cos(var17));
            class456.field6317[arg5].method1960((float) arg4.field10393 / 2.0F + (float) arg8 + (float) var19, (float) arg4.field10501 / 2.0F + (float) arg2 - (float) var20, 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
        } else {
            class381.method2388(arg4, arg8, arg7, arg3, arg0, (byte) 105, arg2, class55.field785[arg5]);
        }
        if (arg6 < 118) {
            field8184 = -47;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(ILpc;)Lpc;")
    public abstract class521 method937(int arg0, class521 arg1);

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IBIIIII)V")
    public static final void method3449(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8180++;
        int var7 = arg2 - arg4;
        int var8 = arg0 + arg4;
        int var9 = -16 / ((-arg1 - 69) / 41);
        for (int var10 = arg0; var10 < var8; var10++) {
            class102.method675(arg3, 108, arg6, arg5, class538.field7454[var10]);
        }
        for (int var11 = arg2; var11 > var7; var11--) {
            class102.method675(arg3, -79, arg6, arg5, class538.field7454[var11]);
        }
        int var12 = arg5 - arg4;
        int var13 = arg6 + arg4;
        for (int var14 = var8; var14 <= var7; var14++) {
            int[] var15 = class538.field7454[var14];
            class102.method675(arg3, -76, arg6, var13, var15);
            class102.method675(arg3, -86, var12, arg5, var15);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IB)I")
    public static final int method3450(int arg0, byte arg1) {
        field8181++;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 == -25) {
            int var5 = var4 | var4 >>> 8;
            int var6 = var5 | var5 >>> 16;
            return var6 + 1;
        } else {
            return -12;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(B)V")
    public static void method3451(byte arg0) {
        field8182 = null;
        if (arg0 >= -32) {
            method3450(64, (byte) -86);
        }
        field8179 = null;
    }
}
