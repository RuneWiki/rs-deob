import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class102 {

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Z")
    public boolean field1794 = false;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "Z")
    public static boolean field1793 = true;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "Lqd;")
    public static class40 field1789 = class147.method1106("Wordpack geladen)3", (byte) -119);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "[I")
    public static int[] field1791 = new int[2];

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "[I")
    public static int[] field1803 = new int[256];

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public int field1788;

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public int field1795;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "J")
    public long field1804;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "Lbg;")
    public class196 field1790;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "[I")
    public static int[] field1802;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "[Lcm;")
    public static class185[] field1797;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)[Lda;", line = 9)
    public static final class114[] method768(int arg0) {
        field1800++;
        class114[] var1 = new class114[class121.field2108];
        if (arg0 != 15739) {
            return (class114[]) null;
        }
        for (int var2 = 0; var2 < class121.field2108; var2++) {
            var1[var2] = new class114(field1799, class169.field2787, class12.field208[var2], class256.field4265[var2], field1802[var2], class210.field3356[var2], class22.field387[var2], class171.field2797);
        }
        class181.method1324(-106);
        return var1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIII)V", line = 40)
    public static final void method769(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1798++;
        int var8 = class110.method827((byte) 88, arg6, class72.field1275, class220.field3664);
        int var9 = class110.method827((byte) 53, arg7, class72.field1275, class220.field3664);
        int var10 = class110.method827((byte) 114, arg0, class48.field941, class125.field2164);
        int var11 = class110.method827((byte) -97, arg4, class48.field941, class125.field2164);
        int var12 = class110.method827((byte) -76, arg6 + arg3, class72.field1275, class220.field3664);
        int var13 = class110.method827((byte) 79, arg7 - arg3, class72.field1275, class220.field3664);
        for (int var14 = var8; var14 < var12; var14++) {
            class150.method1124(var11, var10, arg2, true, class37.field694[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class150.method1124(var11, var10, arg2, true, class37.field694[var15]);
        }
        int var16 = class110.method827((byte) -86, arg0 + arg3, class48.field941, class125.field2164);
        int var17 = class110.method827((byte) 72, arg4 - arg3, class48.field941, class125.field2164);
        if (arg5 != 32768) {
            method768(-105);
        }
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class37.field694[var18];
            class150.method1124(var16, var10, arg2, true, var19);
            class150.method1124(var17, var16, arg1, true, var19);
            class150.method1124(var11, var17, arg2, true, var19);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 101)
    public static void method770(byte arg0) {
        field1789 = null;
        field1797 = null;
        field1802 = null;
        field1803 = null;
        field1791 = null;
        if (arg0 <= 18) {
            field1802 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILqd;Z)V", line = 117)
    public static final void method771(int arg0, class40 arg1, boolean arg2) {
        field1796++;
        class40 var3 = arg1.method337(40);
        int var4 = 0;
        if (arg0 != 16205) {
            method771(92, (class40) null, false);
        }
        short[] var5 = new short[16];
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class306.field5126 : class240.field3982);
        for (int var8 = var6; var8 < var7; var8++) {
            class274 var9 = class68.method531(var8, 32767);
            if (var9.field4542 && var9.method1903((byte) -22).method337(40).method358(-127, var3) != -1) {
                if (var4 >= 50) {
                    class101.field1781 = -1;
                    class244.field4019 = null;
                    return;
                }
                if (var5.length <= var4) {
                    short[] var10 = new short[var5.length * 2];
                    for (int var11 = 0; var11 < var4; var11++) {
                        var10[var11] = var5[var11];
                    }
                    var5 = var10;
                }
                var5[var4++] = (short) var8;
            }
        }
        class68.field1252 = 0;
        class101.field1781 = var4;
        class244.field4019 = var5;
        class40[] var12 = new class40[class101.field1781];
        for (int var13 = 0; var13 < class101.field1781; var13++) {
            var12[var13] = class68.method531(var5[var13], 32767).method1903((byte) -57);
        }
        class93.method706(var12, class244.field4019, -121);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLwe;I[[FBII[[FI[[FIIZBI[[I)V", line = 198)
    public static final void method772(byte arg0, class47 arg1, int arg2, float[][] arg3, byte arg4, int arg5, int arg6, float[][] arg7, int arg8, float[][] arg9, int arg10, int arg11, boolean arg12, byte arg13, int arg14, int[][] arg15) {
        field1801++;
        int var16 = (arg8 << 8) + 255;
        int var17 = (arg10 << 8) + 255;
        int var18 = (arg14 << 8) + 255;
        int var19 = (arg6 << 8) + 255;
        int[] var20 = class244.field4037[arg4];
        int[] var21 = null;
        int[] var22 = new int[var20.length >> 1];
        if (arg13 != -56) {
            return;
        }
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class9.method53(var16, arg0, false, arg5, (int[][]) null, false, arg1, var19, var20[var23 + var23 + 1], arg9, var18, arg15, var20[var23 + var23], arg2, var17, arg3, arg7, 0.0F);
        }
        if (arg12) {
            if (arg4 == 1) {
                var21 = new int[6];
                int var42 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 128, arg9, var18, arg15, 64, arg2, var17, arg3, arg7, 0.0F);
                int var43 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 64, arg9, var18, arg15, 128, arg2, var17, arg3, arg7, 0.0F);
                var21[1] = var42;
                var21[3] = var42;
                var21[2] = var22[2];
                var21[0] = var43;
                var21[5] = var22[2];
                var21[4] = var22[0];
            } else if (arg4 == 2) {
                var21 = new int[6];
                int var25 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 128, arg9, var18, arg15, 128, arg2, var17, arg3, arg7, 0.0F);
                int var26 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 0, arg9, var18, arg15, 64, arg2, var17, arg3, arg7, 0.0F);
                var21[2] = var25;
                var21[1] = var26;
                var21[0] = var22[0];
                var21[3] = var25;
                var21[5] = var22[0];
                var21[4] = var22[1];
            } else if (arg4 == 3) {
                var21 = new int[6];
                int var40 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 128, arg9, var18, arg15, 0, arg2, var17, arg3, arg7, 0.0F);
                int var41 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 0, arg9, var18, arg15, 64, arg2, var17, arg3, arg7, 0.0F);
                var21[4] = var41;
                var21[3] = var40;
                var21[1] = var22[1];
                var21[0] = var22[2];
                var21[2] = var40;
                var21[5] = var22[2];
            } else if (arg4 == 4) {
                int var39 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 128, arg9, var18, arg15, 0, arg2, var17, arg3, arg7, 0.0F);
                var21 = new int[] { var22[3], var39, var22[0] };
            } else if (arg4 == 5) {
                var21 = new int[3];
                int var27 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 128, arg9, var18, arg15, 128, arg2, var17, arg3, arg7, 0.0F);
                var21[1] = var27;
                var21[0] = var22[2];
                var21[2] = var22[3];
            } else if (arg4 == 6) {
                var21 = new int[6];
                int var28 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 0, arg9, var18, arg15, 128, arg2, var17, arg3, arg7, 0.0F);
                int var29 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 128, arg9, var18, arg15, 128, arg2, var17, arg3, arg7, 0.0F);
                var21[1] = var28;
                var21[0] = var22[3];
                var21[3] = var29;
                var21[4] = var22[0];
                var21[2] = var29;
                var21[5] = var22[3];
            } else if (arg4 == 7) {
                var21 = new int[6];
                int var30 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 128, arg9, var18, arg15, 0, arg2, var17, arg3, arg7, 0.0F);
                int var31 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 0, arg9, var18, arg15, 128, arg2, var17, arg3, arg7, 0.0F);
                var21[3] = var30;
                var21[2] = var30;
                var21[0] = var22[1];
                var21[1] = var31;
                var21[4] = var22[2];
                var21[5] = var22[1];
            } else if (arg4 == 8) {
                var21 = new int[3];
                int var38 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 0, arg9, var18, arg15, 0, arg2, var17, arg3, arg7, 0.0F);
                var21[2] = var22[4];
                var21[0] = var22[3];
                var21[1] = var38;
            } else if (arg4 == 9) {
                var21 = new int[15];
                int var32 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 64, arg9, var18, arg15, 128, arg2, var17, arg3, arg7, 0.0F);
                int var33 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 32, arg9, var18, arg15, 96, arg2, var17, arg3, arg7, 0.0F);
                int var34 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 0, arg9, var18, arg15, 64, arg2, var17, arg3, arg7, 0.0F);
                var21[2] = var22[4];
                var21[9] = var33;
                var21[12] = var33;
                var21[10] = var22[2];
                var21[6] = var33;
                var21[3] = var33;
                var21[14] = var34;
                var21[4] = var22[4];
                var21[7] = var22[3];
                var21[5] = var22[3];
                var21[1] = var32;
                var21[11] = var22[1];
                var21[13] = var22[1];
                var21[8] = var22[2];
                var21[0] = var33;
            } else if (arg4 == 10) {
                var21 = new int[9];
                int var35 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 128, arg9, var18, arg15, 0, arg2, var17, arg3, arg7, 0.0F);
                var21[7] = var35;
                var21[4] = var35;
                var21[0] = var22[2];
                var21[1] = var35;
                var21[8] = var22[0];
                var21[2] = var22[3];
                var21[6] = var22[4];
                var21[3] = var22[3];
                var21[5] = var22[4];
            } else if (arg4 == 11) {
                var21 = new int[12];
                int var36 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 64, arg9, var18, arg15, 0, arg2, var17, arg3, arg7, 0.0F);
                int var37 = class9.method53(var16, arg0, false, arg5, (int[][]) null, true, arg1, var19, 64, arg9, var18, arg15, 128, arg2, var17, arg3, arg7, 0.0F);
                var21[1] = var36;
                var21[5] = var36;
                var21[8] = var36;
                var21[10] = var22[1];
                var21[0] = var22[3];
                var21[3] = var22[3];
                var21[11] = var37;
                var21[7] = var37;
                var21[2] = var22[0];
                var21[6] = var22[2];
                var21[4] = var22[2];
                var21[9] = var22[2];
            }
        }
        arg1.method423(arg11, arg5, arg2, var22, var21, false);
    }
}
