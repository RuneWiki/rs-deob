import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class223 extends class194 {

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "I")
    private int field2791 = 1;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "I")
    private int field2792 = 1;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field2796 = 0;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "Lcq;")
    public static class72 field2797 = new class72("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "[S")
    public static short[] field2801;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!dh", name = "J", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    public static int field2799;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "Lwo;")
    public static class285 field2800;

    static {
        new class72("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field2801 = new short[256];
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(II)[[I", line = 6)
    public final int[][] method59(int arg0, int arg1) {
        ++field2798;
        int[][] var3 = super.field2283.method1667(arg1, -64);
        if (arg0 != -730) {
            this.method54(110, -82, (class242) null);
        }
        if (super.field2283.field3451) {
            int var4 = this.field2792 - -1 + this.field2792;
            int var5 = 65536 / var4;
            int var6 = this.field2791 + 1 + this.field2791;
            int var7 = 65536 / var6;
            int[][][] var8 = new int[var4][][];
            for (int var9 = -this.field2792 + arg1; var9 <= this.field2792 + arg1; ++var9) {
                int[][] var19 = this.method1200(arg0 + 790, class210.field2551 & var9, 0);
                int[][] var20 = new int[3][class138.field1579];
                int var21 = 0;
                int var22 = 0;
                int var23 = 0;
                int[] var24 = var19[0];
                int[] var25 = var19[1];
                int[] var26 = var19[2];
                for (int var27 = -this.field2791; ~this.field2791 <= ~var27; ++var27) {
                    int var37 = class442.field6113 & var27;
                    var22 += var25[var37];
                    var23 += var26[var37];
                    var21 += var24[var37];
                }
                int[] var28 = var20[0];
                int[] var29 = var20[1];
                int[] var30 = var20[2];
                int var31 = 0;
                while (var31 < class138.field1579) {
                    var28[var31] = var7 * var21 >> 16;
                    var29[var31] = var7 * var22 >> 16;
                    var30[var31] = var7 * var23 >> 16;
                    int var32 = class442.field6113 & -this.field2791 + var31;
                    int var33 = var21 - var24[var32];
                    int var34 = var22 - var25[var32];
                    ++var31;
                    int var35 = var23 - var26[var32];
                    int var36 = class442.field6113 & this.field2791 + var31;
                    var22 = var25[var36] + var34;
                    var21 = var24[var36] + var33;
                    var23 = var26[var36] + var35;
                }
                var8[var9 - -this.field2792 - arg1] = var20;
            }
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            for (int var13 = 0; class138.field1579 > var13; ++var13) {
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                for (int var17 = 0; var17 < var4; ++var17) {
                    int[][] var18 = var8[var17];
                    var16 += var18[2][var13];
                    var15 += var18[1][var13];
                    var14 += var18[0][var13];
                }
                var10[var13] = var5 * var14 >> 16;
                var11[var13] = var5 * var15 >> 16;
                var12[var13] = var5 * var16 >> 16;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(B)V", line = 139)
    public static void method1355(byte arg0) {
        field2800 = null;
        if (arg0 >= -59) {
            method1360(';', false);
        }
        field2801 = null;
        field2797 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Laq;Laq;I)V", line = 151)
    public static final void method1356(class453 arg0, class453 arg1, int arg2) {
        ++class384.field5255;
        class427.field5837.method2162(false, 219);
        if (arg2 < 122) {
            method1357(-50, -106, 51, -18, (class118) null, -49, 87, (byte[][][]) null, -78, 113, -110, 100, 95);
        }
        ++field2794;
        class427.field5837.method1560(-26356, arg1.field6475);
        class427.field5837.method1560(-26356, arg0.field6475);
        class427.field5837.method1588(arg0.field6358, -93);
        class427.field5837.method1546(arg0.field6364, -1990920344);
        class427.field5837.method1573(-6266, arg1.field6364);
        class427.field5837.method1573(-6266, arg1.field6358);
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 450)
    public class223() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIIILuo;II[[[BIIIII)V", line = 176)
    public static final void method1357(int arg0, int arg1, int arg2, int arg3, class118 arg4, int arg5, int arg6, byte[][][] arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        ++field2799;
        if (arg3 != 0 && ~arg6 != -1) {
            if (arg3 == 9) {
                arg2 = arg2 + 1 & 3;
                arg3 = 1;
            }
            if (arg12 >= 114) {
                if (~arg3 == -11) {
                    arg2 = 3 & arg2 + 3;
                    arg3 = 1;
                }
                if (arg3 == 11) {
                    arg3 = 8;
                    arg2 = arg2 + 3 & 3;
                }
                arg4.method772(arg11, arg8, arg5, arg10, arg9, arg1, arg7[arg3 + -1][arg2], arg6, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 210)
    public static final int method1358(String arg0, byte arg1) {
        ++field2795;
        int var2 = arg0.length();
        if (arg1 >= -124) {
            return 86;
        } else {
            int var3 = 0;
            for (int var4 = 0; var4 < var2; ++var4) {
                var3 = -var3 + ((var3 << 5) - -arg0.charAt(var4));
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IILbg;)V", line = 233)
    public final void method54(int arg0, int arg1, class242 arg2) {
        int var4 = -128 % ((52 - arg1) / 61);
        ++field2793;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    super.field2278 = ~arg2.method1563(-128) == -2;
                }
            } else {
                this.field2792 = arg2.method1563(-128);
            }
        } else {
            this.field2791 = arg2.method1563(-128);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ZI)Lsf;", line = 277)
    public static final class389 method1359(boolean arg0, int arg1) {
        ++field2787;
        class389 var2 = (class389) class276.field3570.method2295((long) arg1, (byte) 74);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class402.field5560.method1794(5860, 29, arg1);
            if (!arg0) {
                return null;
            } else {
                class389 var4 = new class389();
                if (var3 != null) {
                    var4.method2413((byte) 118, new class242(var3), arg1);
                }
                class276.field3570.method2294(var4, (byte) 112, (long) arg1);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(CZ)C", line = 302)
    public static final char method1360(char arg0, boolean arg1) {
        ++field2788;
        if (arg0 != 181 && ~arg0 != -403) {
            if (arg1) {
                method1357(-112, 121, 77, -14, (class118) null, -79, 31, (byte[][][]) null, 40, 42, -49, 28, 96);
            }
            return Character.toTitleCase(arg0);
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(ILuo;Lna;Ljk;IBLpd;I)V", line = 319)
    public static final void method1361(int arg0, class118 arg1, class222 arg2, class117 arg3, int arg4, byte arg5, class278 arg6, int arg7) {
        ++field2790;
        int var8 = arg6.field3603 + -5 - arg7 / 2;
        int var9 = arg0 + 2;
        if (~arg2.field2778 != -1) {
            arg1.method739((byte) 33, arg2.field2778, var8, arg7 - -10, var9, arg0 + 1 + (arg4 * arg3.method679() - var9));
        }
        if (arg2.field2780 != 0) {
            arg1.method731(var8, var9, arg7 + 10, arg2.field2780, (byte) 68, -var9 + arg0 + 1 + arg4 * arg3.method679());
        }
        int var10 = arg2.field2777;
        if (arg6.field3598 && ~arg2.field2754 != 0) {
            var10 = arg2.field2754;
        }
        if (arg5 == 103) {
            for (int var11 = 0; arg4 > var11; ++var11) {
                String var12 = class386.field5280[var11];
                if (~(arg4 + -1) < ~var11) {
                    var12 = var12.substring(0, var12.length() + -4);
                }
                arg3.method681(arg1, var12, arg6.field3603, arg0, var10, true);
                arg0 += arg3.method679();
            }
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)[I", line = 362)
    public final int[] method55(int arg0, int arg1) {
        ++field2789;
        int[] var3 = super.field2292.method1781(arg0, false);
        int var4 = 65 / ((arg1 - 57) / 46);
        if (super.field2292.field3708) {
            int var5 = this.field2792 - (-this.field2792 + -1);
            int var6 = 65536 / var5;
            int var7 = this.field2791 + this.field2791 + 1;
            int var8 = 65536 / var7;
            int[][] var9 = new int[var5][];
            for (int var10 = arg0 - this.field2792; this.field2792 + arg0 >= var10; ++var10) {
                int[] var14 = this.method1203(0, 109, class210.field2551 & var10);
                int[] var15 = new int[class138.field1579];
                int var16 = 0;
                for (int var17 = -this.field2791; var17 <= this.field2791; ++var17) {
                    var16 += var14[class442.field6113 & var17];
                }
                int var18 = 0;
                while (var18 < class138.field1579) {
                    var15[var18] = var8 * var16 >> 16;
                    int var19 = var16 - var14[class442.field6113 & -this.field2791 + var18];
                    ++var18;
                    var16 = var14[class442.field6113 & var18 - -this.field2791] + var19;
                }
                var9[-arg0 + var10 + this.field2792] = var15;
            }
            for (int var11 = 0; class138.field1579 > var11; ++var11) {
                int var12 = 0;
                for (int var13 = 0; ~var5 < ~var13; ++var13) {
                    var12 += var9[var13][var11];
                }
                var3[var11] = var6 * var12 >> 16;
            }
        }
        return var3;
    }
}
