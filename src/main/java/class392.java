import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class392 extends class338 {

    @OriginalMember(owner = "client!o", name = "m", descriptor = "J")
    public long field5638;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "[[I")
    public static int[][] field5642 = new int[128][128];

    @OriginalMember(owner = "client!o", name = "r", descriptor = "[Ljava/awt/Color;")
    public static Color[] field5643 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!o", name = "t", descriptor = "[I")
    public static int[] field5645 = new int[200];

    @OriginalMember(owner = "client!o", name = "u", descriptor = "I")
    public static int field5646 = 0;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field5639;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field5640;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!o", name = "s", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!o", name = "v", descriptor = "[S")
    public static short[] field5647;

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V")
    public class392() {
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BLfd;)Z")
    public static final boolean method2438(byte arg0, class194 arg1) {
        field5644++;
        if (arg1.field2556 == null) {
            return false;
        }
        for (int var2 = 0; var2 < arg1.field2556.length; var2++) {
            int var3 = class71.method407(arg0 ^ 0xFFFF8ED4, var2, arg1);
            int var4 = arg1.field2610[var2];
            if (arg1.field2556[var2] == 2) {
                if (var3 >= var4) {
                    return false;
                }
            } else if (arg1.field2556[var2] == 3) {
                if (var4 >= var3) {
                    return false;
                }
            } else if (arg1.field2556[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        if (arg0 != -90) {
            method2442(-99);
        }
        return true;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method2439(byte arg0) {
        field5642 = null;
        field5643 = null;
        field5647 = null;
        if (arg0 < 80) {
            method2439((byte) 18);
        }
        field5645 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IIIIIBIIII)V")
    public static final void method2440(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg5 < 119) {
            return;
        }
        field5639++;
        if (arg0 == arg2 && arg3 == arg8 && arg1 == arg9 && arg6 == arg7) {
            class204.method1105(arg8, arg2, arg9, arg7, arg4, (byte) -25);
            return;
        }
        int var10 = arg2;
        int var11 = arg8;
        int var12 = arg2 * 3;
        int var13 = arg8 * 3;
        int var14 = arg0 * 3;
        int var15 = arg3 * 3;
        int var16 = arg1 * 3;
        int var17 = arg6 * 3;
        int var18 = arg9 + var14 - arg2 - var16;
        int var19 = arg7 - var17 - (-var15 - -arg8);
        int var20 = var16 + var12 - var14 - var14;
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
            int var33 = (var27 + var29 + var31 >> 12) + arg2;
            int var34 = (var28 + var30 + var32 >> 12) + arg8;
            class204.method1105(var11, var10, var33, var34, arg4, (byte) -53);
            var11 = var34;
            var10 = var33;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)I")
    public static int method2441(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!o", name = "d", descriptor = "(I)V")
    public static final void method2442(int arg0) {
        field5641++;
        if (arg0 <= -42) {
            class151.field1919.method606((byte) 89);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(J)V")
    public class392(long arg0) {
        this.field5638 = arg0;
    }
}
