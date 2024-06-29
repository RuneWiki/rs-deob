import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class232 extends class112 {

    @OriginalMember(owner = "client!qm", name = "P", descriptor = "I")
    private int field3788 = 1024;

    @OriginalMember(owner = "client!qm", name = "S", descriptor = "I")
    private int field3791 = 0;

    @OriginalMember(owner = "client!qm", name = "X", descriptor = "I")
    private int field3796 = 8;

    @OriginalMember(owner = "client!qm", name = "V", descriptor = "I")
    private int field3794 = 81;

    @OriginalMember(owner = "client!qm", name = "W", descriptor = "I")
    private int field3795 = 1024;

    @OriginalMember(owner = "client!qm", name = "bb", descriptor = "I")
    private int field3800 = 409;

    @OriginalMember(owner = "client!qm", name = "eb", descriptor = "I")
    private int field3803 = 204;

    @OriginalMember(owner = "client!qm", name = "hb", descriptor = "I")
    private int field3806 = 4;

    @OriginalMember(owner = "client!qm", name = "N", descriptor = "I")
    public static int field3786 = 0;

    @OriginalMember(owner = "client!qm", name = "O", descriptor = "Lwm;")
    public static class152 field3787 = class157.method1048("Votre liste d(Wamis est pleine (X100 noms maximum pour la version gratuite et 200 pour les abonn-Bs(Y)3", 127);

    @OriginalMember(owner = "client!qm", name = "jb", descriptor = "Lwm;")
    public static class152 field3808 = class157.method1048(")4", 94);

    @OriginalMember(owner = "client!qm", name = "cb", descriptor = "Llf;")
    public static class124 field3801 = new class124(0, 0);

    @OriginalMember(owner = "client!qm", name = "mb", descriptor = "[Lwm;")
    public static class152[] field3811 = null;

    @OriginalMember(owner = "client!qm", name = "nb", descriptor = "Lwm;")
    private static class152 field3812 = class157.method1048("scroll:", 121);

    @OriginalMember(owner = "client!qm", name = "lb", descriptor = "Lwm;")
    public static class152 field3810 = field3812;

    @OriginalMember(owner = "client!qm", name = "ob", descriptor = "Lwm;")
    public static class152 field3813 = field3812;

    @OriginalMember(owner = "client!qm", name = "pb", descriptor = "I")
    public static int field3814 = 0;

    @OriginalMember(owner = "client!qm", name = "K", descriptor = "I")
    public static int field3783;

    @OriginalMember(owner = "client!qm", name = "M", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!qm", name = "Q", descriptor = "I")
    private int field3789;

    @OriginalMember(owner = "client!qm", name = "R", descriptor = "I")
    public static int field3790;

    @OriginalMember(owner = "client!qm", name = "Z", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!qm", name = "ab", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!qm", name = "db", descriptor = "I")
    private int field3802;

    @OriginalMember(owner = "client!qm", name = "fb", descriptor = "I")
    private int field3804;

    @OriginalMember(owner = "client!qm", name = "gb", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!qm", name = "ib", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!qm", name = "kb", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!qm", name = "L", descriptor = "[I")
    private int[] field3784;

    @OriginalMember(owner = "client!qm", name = "U", descriptor = "[[I")
    private int[][] field3793;

    @OriginalMember(owner = "client!qm", name = "Y", descriptor = "[[I")
    private int[][] field3797;

    @OriginalMember(owner = "client!qm", name = "T", descriptor = "[[[B")
    public static byte[][][] field3792;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILhi;)V", line = 35)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field3806 = arg2.method2011(-95);
        } else if (arg1 == 1) {
            this.field3796 = arg2.method2011(arg0 ^ 0xFFFF8637);
        } else if (arg1 == 2) {
            this.field3800 = arg2.method2021((byte) 74);
        } else if (arg1 == 3) {
            this.field3803 = arg2.method2021((byte) 74);
        } else if (arg1 == 4) {
            this.field3795 = arg2.method2021((byte) 74);
        } else if (arg1 == 5) {
            this.field3791 = arg2.method2021((byte) 74);
        } else if (arg1 == 6) {
            this.field3794 = arg2.method2021((byte) 74);
        } else if (arg1 == 7) {
            this.field3788 = arg2.method2021((byte) 74);
        }
        if (arg0 == 31164) {
            field3809++;
        }
    }

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)V", line = 105)
    public static void method1594(int arg0) {
        field3812 = null;
        field3808 = null;
        field3811 = null;
        field3787 = null;
        field3801 = null;
        field3792 = (byte[][][]) null;
        field3813 = null;
        field3810 = null;
        if (arg0 != 1) {
            field3813 = (class152) null;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIIIBII)V", line = 128)
    public static final void method1595(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != 74) {
            method1598(71, (byte) 107, (int[][]) ((int[][]) null), (byte) -128, (float[][]) ((float[][]) null), -21, (float[][]) ((float[][]) null), (byte) -28, 116, 5, (class1) null, -92, (float[][]) ((float[][]) null), 106, -44, false);
        }
        field3798++;
        if (arg4 < 128 || arg1 < 128 || arg4 > 13056 || arg1 > 13056) {
            class201.field3245 = -1;
            class287.field4861 = -1;
            return;
        }
        int var8 = class154.method1031(46, arg4, class23.field400, arg1) - arg3;
        int var9 = var8 - class27.field470;
        int var10 = arg4 - class224.field3639;
        int var11 = arg1 - class80.field1129;
        int var12 = class181.field2884[class223.field3634];
        int var13 = class181.field2886[class94.field1346];
        int var14 = class181.field2886[class223.field3634];
        int var15 = class181.field2884[class94.field1346];
        int var16 = var10 * var13 + var11 * var15 >> 16;
        int var17 = var11 * var13 - var10 * var15 >> 16;
        int var19 = var9 * var14 - (var12 * var17) >> 16;
        int var20 = var9 * var12 + var14 * var17 >> 16;
        if (var20 < 50) {
            class201.field3245 = -1;
            class287.field4861 = -1;
        } else if (class217.field3516) {
            int var22 = arg0 * 512 >> 8;
            int var23 = arg6 * 512 >> 8;
            class287.field4861 = var19 * var22 / var20 + arg2;
            class201.field3245 = var16 * var23 / var20 + arg7;
        } else {
            class287.field4861 = (var19 << 9) / var20 + arg2;
            class201.field3245 = arg7 + ((var16 << 9) / var20);
        }
    }

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "(I)V", line = 194)
    private final void method1596(int arg0) {
        field3807++;
        Random var2 = new Random((long) this.field3796);
        this.field3784 = new int[this.field3796 + 1];
        this.field3789 = 4096 / this.field3806;
        this.field3804 = this.field3794 / 2;
        this.field3802 = 4096 / this.field3796;
        if (arg0 != 1) {
            method1598(-24, (byte) -93, (int[][]) ((int[][]) null), (byte) 12, (float[][]) ((float[][]) null), -116, (float[][]) ((float[][]) null), (byte) 60, 110, -8, (class1) null, 7, (float[][]) ((float[][]) null), 58, 8, true);
        }
        int var3 = this.field3802 / 2;
        this.field3793 = new int[this.field3796][this.field3806 + 1];
        this.field3784[0] = 0;
        this.field3797 = new int[this.field3796][this.field3806];
        int var4 = this.field3789 / 2;
        for (int var5 = 0; var5 < this.field3796; var5++) {
            if (var5 > 0) {
                int var6 = this.field3802;
                int var7 = (class137.method870(var2, 4096, (byte) -112) - 2048) * this.field3803 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field3784[var5] = this.field3784[var5 - 1] + var8;
            }
            this.field3793[var5][0] = 0;
            for (int var9 = 0; var9 < this.field3806; var9++) {
                if (var9 > 0) {
                    int var10 = this.field3789;
                    int var11 = (class137.method870(var2, 4096, (byte) -112) - 2048) * this.field3800 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field3793[var5][var9] = this.field3793[var5][var9 - 1] + var12;
                }
                this.field3797[var5][var9] = this.field3788 <= 0 ? 4096 : 4096 - class137.method870(var2, this.field3788, (byte) -112);
            }
            this.field3793[var5][this.field3806] = 4096;
        }
        this.field3784[this.field3796] = 4096;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "()V", line = 255)
    public class232() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "(BI)V", line = 295)
    public static final void method1597(byte arg0, int arg1) {
        field3799++;
        if (field3814 == arg1) {
            return;
        }
        if (field3814 == 0) {
            class298.method2089((byte) -73);
        }
        if (arg0 != 127) {
            method1598(-70, (byte) -89, (int[][]) ((int[][]) null), (byte) 27, (float[][]) ((float[][]) null), -31, (float[][]) ((float[][]) null), (byte) 2, 74, 27, (class1) null, -118, (float[][]) ((float[][]) null), 44, -55, true);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 40) {
            class239.method1637(11765);
        }
        if (arg1 != 40 && class84.field1167 != null) {
            class84.field1167.method1239((byte) -52);
            class84.field1167 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class64.field969 = 1;
            class180.field2868 = 0;
            class205.field3354 = 0;
            class254.field4399 = 0;
            class243.field4032 = 1;
            class92.method607(true, true);
        }
        if (arg1 == 25 || arg1 == 10) {
            class311.method2162(false);
        }
        if (arg1 == 5) {
            class48.method330((byte) 115, class224.field3650);
        } else {
            class44.method304(-28);
        }
        boolean var3 = field3814 == 5 || field3814 == 10 || field3814 == 28;
        if (var2 != var3) {
            if (var2) {
                class40.field653 = class147.field2256;
                if (class6.field93 == 0) {
                    class160.method1081(2, (byte) 79);
                } else {
                    class173.method1159(1, 2, false, class280.field4783, 255, 0, class147.field2256);
                }
                class130.field1979.method1272((byte) -33, false);
            } else {
                class160.method1081(2, (byte) 107);
                class130.field1979.method1272((byte) -33, true);
            }
        }
        if (class217.field3516 && (arg1 == 25 || arg1 == 28 || arg1 == 40)) {
            class217.method1482();
        }
        field3814 = arg1;
    }

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "(I)V", line = 382)
    public final void method673(int arg0) {
        field3783++;
        this.method1596(1);
        if (arg0 != 8) {
            this.method1596(61);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BI)[I", line = 398)
    public final int[] method53(byte arg0, int arg1) {
        field3790++;
        if (arg0 != -3) {
            this.field3795 = 107;
        }
        int[] var3 = this.field1585.method1952(arg1, (byte) 68);
        if (this.field1585.field4935) {
            int var4 = 0;
            int var5;
            for (var5 = class114.field1620[arg1] + this.field3791; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field3796 > var4 && var5 >= this.field3784[var4]) {
                var4++;
            }
            boolean var6 = (var4 & 0x1) == 0;
            int var7 = var4 - 1;
            int var8 = this.field3784[var4];
            int var9 = this.field3784[var4 - 1];
            if ((this.field3804 + var9) < var5 && var5 < var8 - this.field3804) {
                for (int var10 = 0; var10 < class58.field889; var10++) {
                    int var11 = 0;
                    int var12 = var6 ? this.field3795 : -this.field3795;
                    int var13;
                    for (var13 = (this.field3789 * var12 >> 12) + class131.field1992[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field3806 > var11 && var13 >= this.field3793[var7][var11]) {
                        var11++;
                    }
                    int var14 = this.field3793[var7][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field3793[var7][var15];
                    if ((var16 + this.field3804) < var13 && var13 < (var14 - this.field3804)) {
                        var3[var10] = this.field3797[var7][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class187.method1245(var3, 0, class58.field889, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB[[IB[[FI[[FBIILaj;I[[FIIZ)V", line = 500)
    public static final void method1598(int arg0, byte arg1, int[][] arg2, byte arg3, float[][] arg4, int arg5, float[][] arg6, byte arg7, int arg8, int arg9, class1 arg10, int arg11, float[][] arg12, int arg13, int arg14, boolean arg15) {
        field3785++;
        int var16 = (arg13 << 8) + 255;
        int var17 = (arg11 << 8) + 255;
        int var18 = (arg5 << 8) + 255;
        int var19 = (arg9 << 8) + 255;
        int[] var20 = null;
        int[] var21 = class94.field1348[arg1];
        if (arg3 != -81) {
            return;
        }
        int[] var22 = new int[var21.length >> 1];
        for (int var23 = 0; var23 < var22.length; var23++) {
            var22[var23] = class167.method1104(var18, arg2, arg7, false, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, var21[var23 + var23 + 1], var21[var23 + var23], 0.0F);
        }
        if (arg15) {
            if (arg1 == 1) {
                var20 = new int[6];
                int var42 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 128, 64, 0.0F);
                int var43 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 64, 128, 0.0F);
                var20[1] = var42;
                var20[0] = var43;
                var20[4] = var22[0];
                var20[3] = var42;
                var20[2] = var22[2];
                var20[5] = var22[2];
            } else if (arg1 == 2) {
                var20 = new int[6];
                int var25 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 128, 128, 0.0F);
                int var26 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 0, 64, 0.0F);
                var20[1] = var26;
                var20[3] = var25;
                var20[2] = var25;
                var20[4] = var22[1];
                var20[0] = var22[0];
                var20[5] = var22[0];
            } else if (arg1 == 3) {
                var20 = new int[6];
                int var27 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 128, 0, 0.0F);
                int var28 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 0, 64, 0.0F);
                var20[1] = var22[1];
                var20[4] = var28;
                var20[0] = var22[2];
                var20[2] = var27;
                var20[5] = var22[2];
                var20[3] = var27;
            } else if (arg1 == 4) {
                int var41 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 128, 0, 0.0F);
                var20 = new int[] { var22[3], var41, var22[0] };
            } else if (arg1 == 5) {
                var20 = new int[3];
                int var29 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 128, 128, 0.0F);
                var20[1] = var29;
                var20[0] = var22[2];
                var20[2] = var22[3];
            } else if (arg1 == 6) {
                var20 = new int[6];
                int var30 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 0, 128, 0.0F);
                int var31 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 128, 128, 0.0F);
                var20[2] = var31;
                var20[1] = var30;
                var20[0] = var22[3];
                var20[3] = var31;
                var20[5] = var22[3];
                var20[4] = var22[0];
            } else if (arg1 == 7) {
                int var39 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 128, 0, 0.0F);
                var20 = new int[6];
                int var40 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 0, 128, 0.0F);
                var20[0] = var22[1];
                var20[1] = var40;
                var20[3] = var39;
                var20[5] = var22[1];
                var20[2] = var39;
                var20[4] = var22[2];
            } else if (arg1 == 8) {
                var20 = new int[3];
                int var32 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 0, 0, 0.0F);
                var20[1] = var32;
                var20[2] = var22[4];
                var20[0] = var22[3];
            } else if (arg1 == 9) {
                var20 = new int[15];
                int var33 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 64, 128, 0.0F);
                int var34 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 32, 96, 0.0F);
                int var35 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 0, 64, 0.0F);
                var20[12] = var34;
                var20[6] = var34;
                var20[0] = var34;
                var20[14] = var35;
                var20[3] = var34;
                var20[9] = var34;
                var20[5] = var22[3];
                var20[7] = var22[3];
                var20[2] = var22[4];
                var20[10] = var22[2];
                var20[1] = var33;
                var20[11] = var22[1];
                var20[13] = var22[1];
                var20[4] = var22[4];
                var20[8] = var22[2];
            } else if (arg1 == 10) {
                var20 = new int[9];
                int var38 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 128, 0, 0.0F);
                var20[4] = var38;
                var20[7] = var38;
                var20[6] = var22[4];
                var20[5] = var22[4];
                var20[1] = var38;
                var20[0] = var22[2];
                var20[2] = var22[3];
                var20[8] = var22[0];
                var20[3] = var22[3];
            } else if (arg1 == 11) {
                int var36 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 64, 0, 0.0F);
                int var37 = class167.method1104(var18, arg2, arg7, true, (int[][]) null, arg10, arg8, (byte) 4, var19, arg4, arg12, arg0, var17, arg6, var16, 64, 128, 0.0F);
                var20 = new int[] { var22[3], var36, var22[0], var22[3], var22[2], var36, var22[2], var37, var36, var22[2], var22[1], var37 };
            }
        }
        arg10.method7(arg14, arg8, arg0, var22, var20, false);
    }
}
