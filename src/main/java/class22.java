import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public abstract class class22 {

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field234 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field232 = 104;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Z")
    public static boolean field235 = false;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field237;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)V")
    public static final void method128(int arg0, long arg1) {
        if (arg0 <= 70) {
            return;
        }
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        field233++;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)Z")
    public abstract boolean method129(int arg0);

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(Luo;B)Lkj;")
    public abstract class175 method130(class118 arg0, byte arg1);

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "(I)V")
    public static void method131(int arg0) {
        if (arg0 != -26117) {
            field237 = -20;
        }
        field234 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method132(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field229++;
        if (arg4 > -101) {
            method128(-75, 12L);
        }
        for (int var6 = arg2; var6 <= arg1; var6++) {
            for (int var7 = arg0; var7 <= arg3; var7++) {
                if (class15.field180[var6][var7] == arg5 && class330.field4498[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljava/awt/Canvas;IBLgd;)Luo;")
    public static final class118 method133(Canvas arg0, int arg1, byte arg2, class172 arg3) {
        if (arg2 == -87) {
            field231++;
            return new class188(arg0, arg3, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Luo;IIZ)Z")
    public abstract boolean method134(class118 arg0, int arg1, int arg2, boolean arg3);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method135(boolean arg0, int arg1) {
        if (arg0) {
            field230++;
            return (arg1 >> 24 & 0xFF) + "." + (arg1 >> 16 & 0xFF) + "." + ((arg1 & 0xFF18) >> 8) + "." + (arg1 & 0xFF);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IIIIZII)V")
    public static final void method136(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class402.method2514(arg4, arg1);
        field228++;
        int var7 = 0;
        int var8 = arg1 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg1;
        int var10 = -arg1;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class228.field2877[arg2];
        int var16 = arg3 - var8;
        class384.method2394(arg5, 102, var15, var16, arg3 - arg1);
        int var17 = arg3 + var8;
        class384.method2394(arg6, 102, var15, var17, var16);
        class384.method2394(arg5, 119, var15, arg1 + arg3, var17);
        while (var9 > var7) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class212.field2593[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var8) {
                    int[] var18 = class228.field2877[arg2 + var9];
                    int[] var19 = class228.field2877[arg2 - var9];
                    int var20 = class212.field2593[var9];
                    int var21 = arg3 + var7;
                    int var22 = arg3 - var7;
                    int var23 = arg3 + var20;
                    int var24 = arg3 - var20;
                    class384.method2394(arg5, 125, var18, var24, var22);
                    class384.method2394(arg6, 98, var18, var23, var24);
                    class384.method2394(arg5, 124, var18, var21, var23);
                    class384.method2394(arg5, 122, var19, var24, var22);
                    class384.method2394(arg6, 115, var19, var23, var24);
                    class384.method2394(arg5, 117, var19, var21, var23);
                } else {
                    int[] var25 = class228.field2877[arg2 + var9];
                    int[] var26 = class228.field2877[arg2 - var9];
                    int var27 = arg3 + var7;
                    int var28 = arg3 - var7;
                    class384.method2394(arg5, 95, var25, var27, var28);
                    class384.method2394(arg5, 123, var26, var27, var28);
                }
            }
            int[] var29 = class228.field2877[arg2 + var7];
            int[] var30 = class228.field2877[arg2 - var7];
            int var31 = arg3 + var9;
            int var32 = arg3 - var9;
            if (var7 < var8) {
                int var33 = var11 < var7 ? class212.field2593[var7] : var11;
                int var34 = arg3 + var33;
                int var35 = arg3 - var33;
                class384.method2394(arg5, 95, var29, var35, var32);
                class384.method2394(arg6, 124, var29, var34, var35);
                class384.method2394(arg5, 104, var29, var31, var34);
                class384.method2394(arg5, 116, var30, var35, var32);
                class384.method2394(arg6, 107, var30, var34, var35);
                class384.method2394(arg5, 96, var30, var31, var34);
            } else {
                class384.method2394(arg5, 116, var29, var31, var32);
                class384.method2394(arg5, 104, var30, var31, var32);
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Luo;IIIZBLpc;)V")
    public abstract void method137(class118 arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, class22 arg6);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLuo;)V")
    public abstract void method138(byte arg0, class118 arg1);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[[I)V")
    public static final void method139(int arg0, int[][] arg1) {
        class228.field2877 = arg1;
        field236++;
        int var2 = -89 % ((43 - arg0) / 36);
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    public abstract void method140(int arg0);
}
