import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class260 {

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "[F")
    private float[] field3812 = new float[16];

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Lke;")
    private class444 field3814 = new class444(786336);

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    private int field3821 = class552.method3233(-3, 1600);

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "[[Lgda;")
    private class49[][] field3824 = new class49[1600][64];

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    private int field3823 = 0;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "[I")
    private int[] field3825 = new int[64];

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "[[Lgda;")
    private class49[][] field3826 = new class49[64][768];

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "[I")
    private int[] field3827 = new int[8191];

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "[I")
    private int[] field3828 = new int[1600];

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "Lqp;")
    public static class586 field3808 = new class586(6, 6);

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "Lqp;")
    public static class586 field3820 = null;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Lnj;")
    public static class487 field3818 = new class487("Loading additional fonts - ", "Lade Zusatzschriftarten - ", "Chargement de polices secondaires - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "I")
    public static int field3805;

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "I")
    public static int field3806;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field3807;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field3810;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field3811;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "Laf;")
    private class156 field3816;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "Laf;")
    private class156 field3819;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "Laf;")
    private class156 field3822;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "Llq;")
    private class9 field3817;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)V")
    public static void method1638(int arg0) {
        field3818 = null;
        if (arg0 == 0) {
            field3808 = null;
            field3820 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Los;Z)V")
    private final void method1639(class468 arg0, boolean arg1) {
        arg0.method2800(arg1, -32);
        field3806++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class578.field8524 != arg0.field7000) {
            arg0.method987(class578.field8524);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ZILos;)V")
    private final void method1640(boolean arg0, int arg1, class468 arg2) {
        OpenGL.glGetFloatv(2982, this.field3812, 0);
        field3807++;
        float var4 = this.field3812[0];
        float var5 = this.field3812[4];
        float var6 = this.field3812[8];
        float var7 = this.field3812[1];
        float var8 = this.field3812[5];
        if (!arg0) {
            this.field3812 = null;
        }
        float var9 = this.field3812[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field3814.field6221 = 0;
        if (arg2.field7004) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field3828[var44] <= 64 ? this.field3828[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class49 var59 = this.field3824[var44][var46];
                        int var60 = var59.field568;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field564 >> 12);
                        float var66 = (float) (var59.field574 >> 12);
                        float var67 = (float) (var59.field567 >> 12);
                        int var68 = var59.field562 >> 12;
                        this.field3814.method2697(-11, 0.0F);
                        this.field3814.method2697(-11, 0.0F);
                        this.field3814.method2697(-11, (float) (-var68) * var10 + var65);
                        this.field3814.method2697(-11, (float) (-var68) * var11 + var66);
                        this.field3814.method2697(-11, (float) (-var68) * var12 + var67);
                        this.field3814.method2563(-13021, var61);
                        this.field3814.method2563(-13021, var62);
                        this.field3814.method2563(-13021, var63);
                        this.field3814.method2563(-13021, var64);
                        this.field3814.method2697(-11, 1.0F);
                        this.field3814.method2697(-11, 0.0F);
                        this.field3814.method2697(-11, (float) var68 * var13 + var65);
                        this.field3814.method2697(-11, (float) var68 * var14 + var66);
                        this.field3814.method2697(-11, (float) var68 * var15 + var67);
                        this.field3814.method2563(-13021, var61);
                        this.field3814.method2563(-13021, var62);
                        this.field3814.method2563(-13021, var63);
                        this.field3814.method2563(-13021, var64);
                        this.field3814.method2697(-11, 1.0F);
                        this.field3814.method2697(-11, 1.0F);
                        this.field3814.method2697(-11, (float) var68 * var10 + var65);
                        this.field3814.method2697(-11, (float) var68 * var11 + var66);
                        this.field3814.method2697(-11, (float) var68 * var12 + var67);
                        this.field3814.method2563(-13021, var61);
                        this.field3814.method2563(-13021, var62);
                        this.field3814.method2563(-13021, var63);
                        this.field3814.method2563(-13021, var64);
                        this.field3814.method2697(-11, 0.0F);
                        this.field3814.method2697(-11, 1.0F);
                        this.field3814.method2697(-11, (float) var68 * var16 + var65);
                        this.field3814.method2697(-11, (float) var68 * var17 + var66);
                        this.field3814.method2697(-11, (float) var68 * var18 + var67);
                        this.field3814.method2563(-13021, var61);
                        this.field3814.method2563(-13021, var62);
                        this.field3814.method2563(-13021, var63);
                        this.field3814.method2563(-13021, var64);
                    }
                    if (this.field3828[var44] > 64) {
                        int var47 = this.field3828[var44] - 64 - 1;
                        for (int var48 = this.field3825[var47] - 1; var48 >= 0; var48--) {
                            class49 var49 = this.field3826[var47][var48];
                            int var50 = var49.field568;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field564 >> 12);
                            float var56 = (float) (var49.field574 >> 12);
                            float var57 = (float) (var49.field567 >> 12);
                            int var58 = var49.field562 >> 12;
                            this.field3814.method2697(-11, 0.0F);
                            this.field3814.method2697(-11, 0.0F);
                            this.field3814.method2697(-11, (float) (-var58) * var10 + var55);
                            this.field3814.method2697(-11, (float) (-var58) * var11 + var56);
                            this.field3814.method2697(-11, (float) (-var58) * var12 + var57);
                            this.field3814.method2563(-13021, var51);
                            this.field3814.method2563(-13021, var52);
                            this.field3814.method2563(-13021, var53);
                            this.field3814.method2563(-13021, var54);
                            this.field3814.method2697(-11, 1.0F);
                            this.field3814.method2697(-11, 0.0F);
                            this.field3814.method2697(-11, (float) var58 * var13 + var55);
                            this.field3814.method2697(-11, (float) var58 * var14 + var56);
                            this.field3814.method2697(-11, (float) var58 * var15 + var57);
                            this.field3814.method2563(-13021, var51);
                            this.field3814.method2563(-13021, var52);
                            this.field3814.method2563(-13021, var53);
                            this.field3814.method2563(-13021, var54);
                            this.field3814.method2697(-11, 1.0F);
                            this.field3814.method2697(-11, 1.0F);
                            this.field3814.method2697(-11, (float) var58 * var10 + var55);
                            this.field3814.method2697(-11, (float) var58 * var11 + var56);
                            this.field3814.method2697(-11, (float) var58 * var12 + var57);
                            this.field3814.method2563(-13021, var51);
                            this.field3814.method2563(-13021, var52);
                            this.field3814.method2563(-13021, var53);
                            this.field3814.method2563(-13021, var54);
                            this.field3814.method2697(-11, 0.0F);
                            this.field3814.method2697(-11, 1.0F);
                            this.field3814.method2697(-11, (float) var58 * var16 + var55);
                            this.field3814.method2697(-11, (float) var58 * var17 + var56);
                            this.field3814.method2697(-11, (float) var58 * var18 + var57);
                            this.field3814.method2563(-13021, var51);
                            this.field3814.method2563(-13021, var52);
                            this.field3814.method2563(-13021, var53);
                            this.field3814.method2563(-13021, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field3828[var19] <= 64 ? this.field3828[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class49 var34 = this.field3824[var19][var21];
                        int var35 = var34.field568;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field564 >> 12);
                        float var41 = (float) (var34.field574 >> 12);
                        float var42 = (float) (var34.field567 >> 12);
                        int var43 = var34.field562 >> 12;
                        this.field3814.method2700(0.0F, -353481768);
                        this.field3814.method2700(0.0F, -353481768);
                        this.field3814.method2700((float) (-var43) * var10 + var40, -353481768);
                        this.field3814.method2700((float) (-var43) * var11 + var41, -353481768);
                        this.field3814.method2700((float) (-var43) * var12 + var42, -353481768);
                        this.field3814.method2563(-13021, var36);
                        this.field3814.method2563(-13021, var37);
                        this.field3814.method2563(-13021, var38);
                        this.field3814.method2563(-13021, var39);
                        this.field3814.method2700(1.0F, -353481768);
                        this.field3814.method2700(0.0F, -353481768);
                        this.field3814.method2700((float) var43 * var13 + var40, -353481768);
                        this.field3814.method2700((float) var43 * var14 + var41, -353481768);
                        this.field3814.method2700((float) var43 * var15 + var42, -353481768);
                        this.field3814.method2563(-13021, var36);
                        this.field3814.method2563(-13021, var37);
                        this.field3814.method2563(-13021, var38);
                        this.field3814.method2563(-13021, var39);
                        this.field3814.method2700(1.0F, -353481768);
                        this.field3814.method2700(1.0F, -353481768);
                        this.field3814.method2700((float) var43 * var10 + var40, -353481768);
                        this.field3814.method2700((float) var43 * var11 + var41, -353481768);
                        this.field3814.method2700((float) var43 * var12 + var42, -353481768);
                        this.field3814.method2563(-13021, var36);
                        this.field3814.method2563(-13021, var37);
                        this.field3814.method2563(-13021, var38);
                        this.field3814.method2563(-13021, var39);
                        this.field3814.method2700(0.0F, -353481768);
                        this.field3814.method2700(1.0F, -353481768);
                        this.field3814.method2700((float) var43 * var16 + var40, -353481768);
                        this.field3814.method2700((float) var43 * var17 + var41, -353481768);
                        this.field3814.method2700((float) var43 * var18 + var42, -353481768);
                        this.field3814.method2563(-13021, var36);
                        this.field3814.method2563(-13021, var37);
                        this.field3814.method2563(-13021, var38);
                        this.field3814.method2563(-13021, var39);
                    }
                    if (this.field3828[var19] > 64) {
                        int var22 = this.field3828[var19] - 64 - 1;
                        for (int var23 = this.field3825[var22] - 1; var23 >= 0; var23--) {
                            class49 var24 = this.field3826[var22][var23];
                            int var25 = var24.field568;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field564 >> 12);
                            float var31 = (float) (var24.field574 >> 12);
                            float var32 = (float) (var24.field567 >> 12);
                            int var33 = var24.field562 >> 12;
                            this.field3814.method2700(0.0F, -353481768);
                            this.field3814.method2700(0.0F, -353481768);
                            this.field3814.method2700((float) (-var33) * var10 + var30, -353481768);
                            this.field3814.method2700((float) (-var33) * var11 + var31, -353481768);
                            this.field3814.method2700((float) (-var33) * var12 + var32, -353481768);
                            this.field3814.method2563(-13021, var26);
                            this.field3814.method2563(-13021, var27);
                            this.field3814.method2563(-13021, var28);
                            this.field3814.method2563(-13021, var29);
                            this.field3814.method2700(1.0F, -353481768);
                            this.field3814.method2700(0.0F, -353481768);
                            this.field3814.method2700((float) var33 * var13 + var30, -353481768);
                            this.field3814.method2700((float) var33 * var14 + var31, -353481768);
                            this.field3814.method2700((float) var33 * var15 + var32, -353481768);
                            this.field3814.method2563(-13021, var26);
                            this.field3814.method2563(-13021, var27);
                            this.field3814.method2563(-13021, var28);
                            this.field3814.method2563(-13021, var29);
                            this.field3814.method2700(1.0F, -353481768);
                            this.field3814.method2700(1.0F, -353481768);
                            this.field3814.method2700((float) var33 * var10 + var30, -353481768);
                            this.field3814.method2700((float) var33 * var11 + var31, -353481768);
                            this.field3814.method2700((float) var33 * var12 + var32, -353481768);
                            this.field3814.method2563(-13021, var26);
                            this.field3814.method2563(-13021, var27);
                            this.field3814.method2563(-13021, var28);
                            this.field3814.method2563(-13021, var29);
                            this.field3814.method2700(0.0F, -353481768);
                            this.field3814.method2700(1.0F, -353481768);
                            this.field3814.method2700((float) var33 * var16 + var30, -353481768);
                            this.field3814.method2700((float) var33 * var17 + var31, -353481768);
                            this.field3814.method2700((float) var33 * var18 + var32, -353481768);
                            this.field3814.method2563(-13021, var26);
                            this.field3814.method2563(-13021, var27);
                            this.field3814.method2563(-13021, var28);
                            this.field3814.method2563(-13021, var29);
                        }
                    }
                }
            }
        }
        if (this.field3814.field6221 != 0) {
            this.field3817.method44((byte) 91, this.field3814.field6221, this.field3814.field6162, 24);
            arg2.method2846(this.field3822, this.field3816, this.field3819, 32888, null);
            arg2.method2834(7, this.field3814.field6221 / 24, 0, -92);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)V")
    public static final void method1641(int arg0, int arg1) {
        class188.field2871 = arg0;
        field3813++;
        class100.field1273.method2037(true);
        if (arg1 >= -31) {
            method1641(-87, -57);
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIII[FIFII)V")
    public static final void method1642(int arg0, int arg1, int arg2, int arg3, int arg4, float[] arg5, int arg6, float arg7, int arg8, int arg9) {
        int var10 = arg4 - arg3;
        field3809++;
        if (arg1 != 30380) {
            return;
        }
        int var11 = arg9 - arg0;
        int var12 = arg8 - arg6;
        float var13 = arg5[2] * (float) var11 + arg5[1] * (float) var10 + arg5[0] * (float) var12;
        float var14 = arg5[5] * (float) var11 + arg5[4] * (float) var10 + arg5[3] * (float) var12;
        float var15 = arg5[8] * (float) var11 + arg5[6] * (float) var12 + arg5[7] * (float) var10;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = arg7 + (float) Math.asin((double) (var14 / var16)) / 3.1415927F + 0.5F;
        if (arg2 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg2 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg2 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class281.field4178 = var17;
        class125.field1645 = var18;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(Los;Z)V")
    private final void method1643(class468 arg0, boolean arg1) {
        field3815++;
        class578.field8524 = arg0.field7000;
        arg0.method2804((byte) 115);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2800(false, -32);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (!arg1) {
            this.field3817 = null;
        }
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(II)I")
    public static final int method1644(int arg0, int arg1) {
        if (arg0 != 194279658) {
            method1642(-12, 76, -50, 124, -2, null, -104, -0.14788945F, 8, 74);
        }
        field3805++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lhaa;IIII)V")
    public static final void method1645(class77 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class259.method1632(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class331.field4909) {
            class259.method1632(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class259.method1632(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class366.field5271) {
            class259.method1632(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class366.field5271) {
            class259.method1632(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class331.field4909 && arg4 <= class366.field5271) {
            class259.method1632(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class259.method1632(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class331.field4909 && arg4 > 0) {
            class259.method1632(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Loaa;BLos;)V")
    public final void method1646(class510 arg0, byte arg1, class468 arg2) {
        field3811++;
        if (arg2.field7073 == null) {
            return;
        }
        this.method1643(arg2, true);
        float var4 = arg2.field7073.field3671;
        float var5 = arg2.field7073.field3685;
        if (arg1 >= -10) {
            this.field3823 = -30;
        }
        float var6 = arg2.field7073.field3672;
        float var7 = arg2.field7073.field3678;
        try {
            if (arg0.field7580) {
                int var8 = arg0.field7579 - arg0.field7581;
                int var9;
                if (var8 + 2 <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = class552.method3233(-122, var8) + 1 - this.field3821;
                    var8 = (var8 >> var9) + 2;
                }
                class130 var10 = arg0.field7577.field7506;
                class130 var11 = var10.field1710;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field3823 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field3828[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field3825[var16] = 0;
                    }
                    while (var10 != var11) {
                        class49 var17 = (class49) var11;
                        if (var14) {
                            var14 = false;
                            var13 = var17.field566;
                            var12 = var17.field571;
                        } else if (var17.field571 != var12 || var17.field566 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field567 >> 12) * var6 + (float) (var17.field574 >> 12) * var5 + (float) (var17.field564 >> 12) * var4 + var7) - arg0.field7581 >> var9;
                        if (var18 < 1600) {
                            if (this.field3828[var18] < 64) {
                                this.field3824[var18][this.field3828[var18]++] = var17;
                            } else {
                                label195: {
                                    if (this.field3828[var18] == 64) {
                                        if (this.field3823 == 64) {
                                            break label195;
                                        }
                                        this.field3828[var18] += (this.field3823++) + 1;
                                    }
                                    this.field3826[this.field3828[var18] - 1 - 64][this.field3825[this.field3828[var18] - 64 - 1]++] = var17;
                                }
                            }
                        }
                        var11 = var11.field1710;
                    }
                    if (var12 < 0) {
                        arg2.method2778(-1, 0);
                    } else {
                        arg2.method2778(var12, 0);
                    }
                    if (var13 && class578.field8524 != arg2.field7000) {
                        arg2.method987(class578.field8524);
                    } else if (arg2.field7000 != 1.0F) {
                        arg2.method987(1.0F);
                    }
                    this.method1640(true, var8, arg2);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class130 var22 = arg0.field7577.field7506;
                for (class130 var23 = var22.field1710; var23 != var22; var23 = var23.field1710) {
                    class49 var24 = (class49) var23;
                    int var25 = (int) ((float) (var24.field567 >> 12) * var6 + (float) (var24.field574 >> 12) * var5 + (float) (var24.field564 >> 12) * var4 + var7);
                    if (var25 < var20) {
                        var20 = var25;
                    }
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    this.field3827[var19++] = var25;
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 <= 1600) {
                    var27 = 0;
                    var26 += 2;
                } else {
                    var27 = 1 - (this.field3821 - class552.method3233(86, var26));
                    var26 = (var26 >> var27) + 2;
                }
                class130 var28 = var22.field1710;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field3823 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field3828[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field3825[var34] = 0;
                    }
                    while (var22 != var28) {
                        class49 var35 = (class49) var28;
                        if (var32) {
                            var31 = var35.field566;
                            var30 = var35.field571;
                            var32 = false;
                        }
                        if (var29 > 0 && (var35.field571 != var30 || var31 != var35.field566)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field3827[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field3828[var36] < 64) {
                                this.field3824[var36][this.field3828[var36]++] = var35;
                            } else {
                                label145: {
                                    if (this.field3828[var36] == 64) {
                                        if (this.field3823 == 64) {
                                            break label145;
                                        }
                                        this.field3828[var36] += (this.field3823++) + 1;
                                    }
                                    this.field3826[this.field3828[var36] - 64 - 1][this.field3825[this.field3828[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var28 = var28.field1710;
                    }
                    if (var30 >= 0) {
                        arg2.method2778(var30, 0);
                    } else {
                        arg2.method2778(-1, 0);
                    }
                    if (var31 && class578.field8524 != arg2.field7000) {
                        arg2.method987(class578.field8524);
                    } else if (arg2.field7000 != 1.0F) {
                        arg2.method987(1.0F);
                    }
                    this.method1640(true, var26, arg2);
                }
            }
        } catch (Exception var37) {
        }
        this.method1639(arg2, true);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILos;)V")
    public final void method1647(int arg0, class468 arg1) {
        field3810++;
        this.field3817 = arg1.method2781(196584, null, 24, true, arg0 ^ 0x4A);
        this.field3819 = new class156(this.field3817, 5126, 2, 0);
        this.field3822 = new class156(this.field3817, 5126, arg0, 8);
        this.field3816 = new class156(this.field3817, 5121, 4, 20);
    }
}
