import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class3 extends class101 {

    @OriginalMember(owner = "client!il", name = "m", descriptor = "[I")
    public static int[] field5 = new int[128];

    @OriginalMember(owner = "client!il", name = "x", descriptor = "[I")
    public static int[] field16 = new int[14];

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field13 = 0;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "J")
    public static long field15 = 0L;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "[I")
    public static int[] field22 = new int[1000];

    @OriginalMember(owner = "client!il", name = "s", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public int field12;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "[I")
    public int[] field10;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "[I")
    public int[] field20;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "[I")
    public int[] field7;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "[Lbf;")
    public class227[] field19;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "[Lbf;")
    public class227[] field6;

    @OriginalMember(owner = "client!il", name = "C", descriptor = "[[[B")
    public byte[][][] field21;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "[[[B")
    public static byte[][][] field8;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "[[[I")
    public static int[][][] field18;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V", line = 4)
    public static final void method5(byte arg0) {
        field9++;
        int var1 = 13 / ((arg0 - 27) / 49);
        class56.field704.method2182(false);
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(I)V", line = 23)
    public static void method6(int arg0) {
        field18 = (int[][][]) null;
        field16 = null;
        field22 = null;
        field5 = null;
        field8 = (byte[][][]) null;
        if (arg0 > -122) {
            method7(72, -43, -21);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)Z", line = 45)
    public static final boolean method7(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class194.field2896; var3++) {
            class44 var4 = class68.field893[var3];
            if (var4.field557 == 1) {
                int var5 = var4.field559 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field535 * var5 >> 8) + var4.field552;
                    int var7 = (var4.field554 * var5 >> 8) + var4.field538;
                    int var8 = (var4.field542 * var5 >> 8) + var4.field562;
                    int var9 = (var4.field558 * var5 >> 8) + var4.field533;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field557 == 2) {
                int var10 = arg0 - var4.field559;
                if (var10 > 0) {
                    int var11 = (var4.field535 * var10 >> 8) + var4.field552;
                    int var12 = (var4.field554 * var10 >> 8) + var4.field538;
                    int var13 = (var4.field542 * var10 >> 8) + var4.field562;
                    int var14 = (var4.field558 * var10 >> 8) + var4.field533;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field557 == 3) {
                int var15 = var4.field552 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field550 * var15 >> 8) + var4.field559;
                    int var17 = (var4.field545 * var15 >> 8) + var4.field537;
                    int var18 = (var4.field542 * var15 >> 8) + var4.field562;
                    int var19 = (var4.field558 * var15 >> 8) + var4.field533;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field557 == 4) {
                int var20 = arg2 - var4.field552;
                if (var20 > 0) {
                    int var21 = (var4.field550 * var20 >> 8) + var4.field559;
                    int var22 = (var4.field545 * var20 >> 8) + var4.field537;
                    int var23 = (var4.field542 * var20 >> 8) + var4.field562;
                    int var24 = (var4.field558 * var20 >> 8) + var4.field533;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field557 == 5) {
                int var25 = arg1 - var4.field562;
                if (var25 > 0) {
                    int var26 = (var4.field550 * var25 >> 8) + var4.field559;
                    int var27 = (var4.field545 * var25 >> 8) + var4.field537;
                    int var28 = (var4.field535 * var25 >> 8) + var4.field552;
                    int var29 = (var4.field554 * var25 >> 8) + var4.field538;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIIIIII)Z", line = 168)
    public static final boolean method8(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }
}
