import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fu")
public class class267 {

    @OriginalMember(owner = "client!fu", name = "d", descriptor = "Lug;")
    private class395 field3375;

    @OriginalMember(owner = "client!fu", name = "g", descriptor = "Lul;")
    private class405 field3378;

    @OriginalMember(owner = "client!fu", name = "s", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!fu", name = "m", descriptor = "I")
    private int field3384;

    @OriginalMember(owner = "client!fu", name = "o", descriptor = "[B")
    public byte[] field3386;

    @OriginalMember(owner = "client!fu", name = "n", descriptor = "I")
    private int field3385;

    @OriginalMember(owner = "client!fu", name = "q", descriptor = "I")
    private int field3388;

    @OriginalMember(owner = "client!fu", name = "e", descriptor = "I")
    private int field3376;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!fu", name = "c", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!fu", name = "f", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!fu", name = "h", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!fu", name = "j", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!fu", name = "l", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!fu", name = "r", descriptor = "I")
    public static int field3389;

    @OriginalMember(owner = "client!fu", name = "p", descriptor = "Lrk;")
    public static class25 field3387;

    @OriginalMember(owner = "client!fu", name = "i", descriptor = "Lqn;")
    public static class47 field3380;

    @OriginalMember(owner = "client!fu", name = "k", descriptor = "[[Ldr;")
    private class507[][] field3382;

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIIII)V", line = 3)
    private final void method1585(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3383++;
        if (this.field3382 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg1 + arg4 - 1 - 1 >> 7;
        int var8 = arg3 - 1 >> 7;
        if (arg0 != 18794) {
            this.method1589(98);
        }
        int var9 = arg2 + arg3 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class507[] var11 = this.field3382[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field7300 = true;
            }
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ZIIII[[Z)V", line = 42)
    public final void method1586(boolean arg0, int arg1, int arg2, int arg3, int arg4, boolean[][] arg5) {
        field3372++;
        this.field3375.method2325((byte) 103, false);
        this.field3375.method2337(false, -124);
        this.field3375.method2349((byte) -108, -2);
        this.field3375.method2305(arg3 ^ 0x1E03, 1);
        this.field3375.method2290(true, 1);
        float var7 = 1.0F / (float) (this.field3375.field5498 * 128);
        if (arg0) {
            for (int var8 = 0; var8 < this.field3376; var8++) {
                int var9 = var8 << this.field3385;
                int var10 = var8 + 1 << this.field3385;
                label136: for (int var11 = 0; var11 < this.field3388; var11++) {
                    int var12 = var11 << this.field3385;
                    int var13 = var11 + 1 << this.field3385;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (-arg1 <= var14 - arg2 && var14 - arg2 <= arg1) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if (var15 - arg4 >= -arg1 && var15 - arg4 <= arg1 && arg5[var14 + arg1 - arg2][arg1 + var15 - arg4]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field3382[var11][var8].method3042(arg3 ^ 0xFFFFD7C7);
                                    continue label136;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field3376; var16++) {
                int var17 = var16 << this.field3385;
                int var18 = var16 + 1 << this.field3385;
                for (int var19 = 0; var19 < this.field3388; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field3385;
                    int var22 = var19 + 1 << this.field3385;
                    class498 var23 = this.field3375.field5536;
                    var23.field6631 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if (var24 - arg4 >= -arg1 && arg1 >= var24 - arg4) {
                            int var25 = this.field3378.field1842 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (-arg1 <= var26 - arg2 && arg1 >= var26 - arg2 && arg5[arg1 + var26 - arg2][arg1 + var24 - arg4]) {
                                    short[] var27 = this.field3378.field5783[var25];
                                    if (var27 != null) {
                                        if (this.field3375.field5593) {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method2759((byte) -9, var27[var29] & 0xFFFF);
                                            }
                                        } else {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method2790(arg3 - 951330586, var27[var28] & 0xFFFF);
                                                var20++;
                                            }
                                        }
                                    }
                                }
                                var25++;
                            }
                        }
                    }
                    if (var20 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var19) / var7, (float) (-var16) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field3382[var19][var16].method3041(var23.field6618, 88, 5123, var20);
                    }
                }
            }
        }
        if (arg3 != 2) {
            this.method1587(14, null, (byte) -51, -76);
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILba;BI)V", line = 231)
    public final void method1587(int arg0, class264 arg1, byte arg2, int arg3) {
        field3389++;
        class473 var5 = (class473) arg1;
        int var6 = var5.field6860 + arg3 + 1;
        int var7 = var5.field6851 + arg0 + 1;
        if (arg2 != -93) {
            method1591(true);
        }
        int var8 = this.field3390 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field6853;
        int var11 = var5.field6855;
        int var12 = this.field3390 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var8 += this.field3390 * var14;
            var7 = 1;
            var10 -= var14;
        }
        if (var7 + var10 >= this.field3384) {
            int var15 = var10 + var7 + 1 - this.field3384;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var13 += var16;
            var9 += var16;
            var11 -= var16;
            var12 += var16;
            var8 += var16;
            var6 = 1;
        }
        if ((var6 + var11) >= this.field3390) {
            int var17 = var6 + var11 + 1 - this.field3390;
            var12 += var17;
            var11 -= var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class155.method1013(var12, false, var13, var9, var8, var10, var5.field6859, var11, this.field3386);
            this.method1585(arg2 ^ 0xFFFFB6C9, var6, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(I)V", line = 301)
    public static void method1588(int arg0) {
        field3387 = null;
        field3380 = null;
        if (arg0 != -12880) {
            field3380 = null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "b", descriptor = "(I)V", line = 316)
    public final void method1589(int arg0) {
        field3374++;
        this.field3382 = new class507[this.field3388][this.field3376];
        for (int var2 = 0; var2 < this.field3376; var2++) {
            for (int var3 = 0; var3 < this.field3388; var3++) {
                this.field3382[var3][var2] = new class507(this.field3375, this, this.field3378, var3, var2, this.field3385, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 != -1106) {
            this.method1592(null, -115, -18, -101);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(ILdt;BLya;ILgp;)Z", line = 346)
    public static final boolean method1590(int arg0, class160 arg1, byte arg2, class38 arg3, int arg4, class36 arg5) {
        field3381++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg5.field446 != null) {
            var7 = (arg5.field470 + arg1.field2043 - class241.field3114) * (class241.field3118 - class241.field3125) / (class241.field3113 - class241.field3114) + class241.field3125;
            var8 = class241.field3110 - (arg1.field2036 + arg5.field465 - class241.field3124) * (class241.field3110 - class241.field3121) / (class241.field3127 - class241.field3124);
            var6 = class241.field3125 + ((class241.field3118 - class241.field3125) * (arg5.field445 + arg1.field2043 - class241.field3114) / (class241.field3113 - class241.field3114));
            var9 = class241.field3110 - (class241.field3110 - class241.field3121) * (arg5.field453 + arg1.field2036 - class241.field3124) / (class241.field3127 - class241.field3124);
        }
        class16 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg5.field477 != -1) {
            if (arg1.field2040 && arg5.field456 != -1) {
                var10 = arg5.method256(117, true, arg3);
            } else {
                var10 = arg5.method256(124, false, arg3);
            }
            if (var10 != null) {
                var11 = arg1.field2031 - (var10.method148() + 1 >> 1);
                if (var11 < var6) {
                    var6 = var11;
                }
                var12 = arg1.field2031 + (var10.method148() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                var13 = arg1.field2039 - (var10.method131() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                var14 = arg1.field2039 + (var10.method131() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class302 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg5.field451 != null) {
            var15 = class135.method929(30, arg5.field481);
            if (var15 != null) {
                var16 = class209.field2708.method1748(arg5.field451, null, 115, null, class315.field4015);
                int var23 = arg1.field2039;
                if (var10 == null) {
                    var17 = var23 - var16 * var15.method1782() / 2;
                } else {
                    var17 = var23 - ((var10.method131() >> 1) + var15.method1785() * var16);
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class315.field4015[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method1780(var25);
                    if (var18 < var26) {
                        var18 = var26;
                    }
                }
                var19 = arg1.field2031 + arg4 - (var18 / 2);
                var20 = var18 / 2 + arg4 + arg1.field2031;
                if (var19 < var6) {
                    var6 = var19;
                }
                var21 = arg0 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                if (var21 < var8) {
                    var8 = var21;
                }
                var22 = var16 * var15.method1785() + (var17 + arg0);
                if (var9 < var22) {
                    var9 = var22;
                }
            }
        }
        if (class241.field3125 > var7 || var6 > class241.field3118 || class241.field3121 > var9 || var8 > class241.field3110) {
            return true;
        }
        if (arg5.field446 != null) {
            int[] var27 = new int[arg5.field446.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg5.field446[var28 * 2] + arg1.field2043;
                int var31 = arg5.field446[var28 * 2 + 1] + arg1.field2036;
                var27[var28 * 2] = (class241.field3118 - class241.field3125) * (var30 - class241.field3114) / (class241.field3113 - class241.field3114) + class241.field3125;
                var27[var28 * 2 + 1] = class241.field3110 - ((var31 - class241.field3124) * (class241.field3110 - class241.field3121) / (class241.field3127 - class241.field3124));
            }
            class486.method2957(arg3, var27, arg5.field441);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg3.method358(arg5.field475, var27[(var29 + 1) * 2 + 1], var27[var29 * 2], var27[var29 * 2 + 1], true, var27[(var29 + 1) * 2]);
            }
            arg3.method358(arg5.field475, var27[1], var27[var27.length - 2], var27[var27.length - 1], true, var27[0]);
        }
        if (var10 != null) {
            if (class118.field1593 > 0 && (class50.field664 != -1 && class50.field664 == arg1.field2035 || class24.field352 != -1 && class24.field352 == arg5.field483)) {
                int var32;
                if (class298.field3833 > 50) {
                    var32 = (100 - class298.field3833) * 2;
                } else {
                    var32 = class298.field3833 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg3.method350(arg1.field2039, arg1.field2031, var10.method134() / 2 + 7, var33, -127);
                arg3.method350(arg1.field2039, arg1.field2031, var10.method134() / 2 + 5, var33, -102);
                arg3.method350(arg1.field2039, arg1.field2031, var10.method134() / 2 + 3, var33, -116);
                arg3.method350(arg1.field2039, arg1.field2031, var10.method134() / 2 + 1, var33, -117);
                arg3.method350(arg1.field2039, arg1.field2031, var10.method134() / 2, var33, -121);
            }
            var10.method130(arg1.field2031 - (var10.method148() >> 1), arg1.field2039 - (var10.method131() >> 1));
        }
        int var34 = 102 / ((-arg2 - 49) / 55);
        if (arg5.field451 != null && var15 != null) {
            class195.method1209(arg3, var18, arg1, (byte) -125, var16, var17, var15, arg5);
        }
        if (arg5.field477 != -1 || arg5.field451 != null) {
            class52 var35 = new class52(arg1);
            var35.field690 = var12;
            var35.field683 = var19;
            var35.field685 = var11;
            var35.field695 = var22;
            var35.field693 = var20;
            var35.field686 = var21;
            var35.field691 = var13;
            var35.field684 = var14;
            class490.field7145.method163(var35, 0);
        }
        return false;
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Z)[Lpp;", line = 570)
    public static final class269[] method1591(boolean arg0) {
        if (arg0) {
            field3373++;
            return new class269[] { class378.field4979, class191.field2484, class438.field6289 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(Lba;III)V", line = 581)
    public final void method1592(class264 arg0, int arg1, int arg2, int arg3) {
        field3377++;
        class473 var5 = (class473) arg0;
        int var6 = var5.field6860 + arg1 + 1;
        int var7 = var5.field6851 + arg3 + 1;
        int var8 = var6 + (this.field3390 * var7);
        int var9 = 0;
        int var10 = var5.field6853;
        int var11 = var5.field6855;
        int var12 = this.field3390 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var10 -= var13;
            var8 += this.field3390 * var13;
            var7 = 1;
        }
        int var14 = 0;
        if ((var7 + var10) >= this.field3384) {
            int var15 = var7 + var10 + 1 - this.field3384;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var6 = 1;
            var11 -= var16;
            var9 += var16;
            var14 += var16;
            var8 += var16;
        }
        if (arg2 != -27038) {
            return;
        }
        if (var6 + var11 >= this.field3390) {
            int var17 = var6 + var11 + 1 - this.field3390;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class292.method1714(var10, (byte) -60, this.field3386, var8, var9, var14, var12, var11, var5.field6859);
            this.method1585(18794, var6, var10, var7, var11);
        }
    }

    @OriginalMember(owner = "client!fu", name = "a", descriptor = "(IIILba;)Z", line = 652)
    public final boolean method1593(int arg0, int arg1, int arg2, class264 arg3) {
        field3379++;
        class473 var5 = (class473) arg3;
        int var6 = var5.field6860 + arg0 + 1;
        int var7 = var5.field6851 + arg1 + 1;
        int var8 = var6 + (this.field3390 * var7);
        int var9 = var5.field6853;
        int var10 = var5.field6855;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var7 = 1;
            var8 += this.field3390 * var11;
        }
        int var12 = this.field3390 - var10;
        int var13 = 34 % ((-arg2 - 59) / 60);
        if (this.field3384 <= (var7 + var9)) {
            int var14 = var7 + var9 + 1 - this.field3384;
            var9 -= var14;
        }
        if (var6 <= 0) {
            int var15 = 1 - var6;
            var8 += var15;
            var6 = 1;
            var12 += var15;
            var10 -= var15;
        }
        if (this.field3390 <= var6 + var10) {
            int var16 = var6 + var10 + 1 - this.field3390;
            var10 -= var16;
            var12 += var16;
        }
        if (var10 > 0 && var9 > 0) {
            byte var17 = 8;
            int var18 = (var17 - 1) * this.field3390 + var12;
            return class83.method677(this.field3386, var8, var10, var17, var18, (byte) 43, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fu", name = "<init>", descriptor = "(Lug;Lul;)V", line = 725)
    public class267(class395 arg0, class405 arg1) {
        this.field3375 = arg0;
        this.field3378 = arg1;
        this.field3390 = (this.field3378.field1842 * this.field3378.field1836 >> this.field3375.field5504) + 2;
        this.field3384 = (this.field3378.field1844 * this.field3378.field1836 >> this.field3375.field5504) + 2;
        this.field3386 = new byte[this.field3390 * this.field3384];
        this.field3385 = this.field3375.field5504 + 7 - this.field3378.field1840;
        this.field3388 = this.field3378.field1842 >> this.field3385;
        this.field3376 = this.field3378.field1844 >> this.field3385;
    }
}
