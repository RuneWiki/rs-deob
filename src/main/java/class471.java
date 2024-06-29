import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class471 {

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "Lpp;")
    private class267 field6938;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "Lqg;")
    private class321 field6933;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public int field6919;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "I")
    private int field6931;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    private int field6928;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "[B")
    public byte[] field6930;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    private int field6922;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    private int field6923;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "[I")
    public static int[] field6929 = new int[99];

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lgf;")
    public static class180 field6939;

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public static int field6920;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field6921;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "I")
    public static int field6935;

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "[[Lku;")
    private class254[][] field6925;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field6929[var1] = var0 / 4;
        }
        field6939 = new class180("Walk here", "Hierhin gehen", "Atteindre", "Caminhar para cá");
        field6940 = 0;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIIII)I", line = 5)
    public static final int method2808(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg2 & 0x3;
        if ((arg3 & arg5) == 1) {
            int var8 = arg4;
            arg4 = arg0;
            arg0 = var8;
        }
        field6936++;
        if (var7 == 0) {
            return arg1;
        } else if (var7 == 1) {
            return 1 + 7 - arg4 - arg6;
        } else if (var7 == 2) {
            return 7 - arg1 - (arg0 - 1);
        } else {
            return arg6;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(BI)V", line = 36)
    public static final void method2809(byte arg0, int arg1) {
        field6924++;
        if (class91.method738(false, arg1) && arg0 < -36) {
            class115.method852(class416.field6157[arg1], (byte) 108, -1);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 53)
    public final void method2810(int arg0) {
        this.field6925 = new class254[this.field6922][this.field6923];
        field6934++;
        for (int var2 = 0; var2 < this.field6923; var2++) {
            for (int var3 = 0; var3 < this.field6922; var3++) {
                this.field6925[var3][var2] = new class254(this.field6933, this, this.field6938, var3, var2, this.field6928, var3 * 128 + 1, var2 * 128 + 1);
            }
        }
        if (arg0 != 1) {
            field6940 = 116;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V", line = 81)
    public static final void method2811(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 1) {
            return;
        }
        for (class81 var5 = (class81) class278.field4007.method2257((byte) 91); var5 != null; var5 = (class81) class278.field4007.method2256(47)) {
            class258.method1632(arg2, arg0, var5, arg4, (byte) 110, arg3);
        }
        field6932++;
        for (class81 var6 = (class81) class11.field192.method2257((byte) 92); var6 != null; var6 = (class81) class11.field192.method2256(arg1 ^ 0x26)) {
            byte var11 = 1;
            class441 var12 = var6.field1334.method192(true);
            if (var6.field1334.field393) {
                var11 = 0;
            } else if (var6.field1334.field373 == var12.field6434 || var6.field1334.field373 == var12.field6431 || var6.field1334.field373 == var12.field6461 || var6.field1334.field373 == var12.field6444) {
                var11 = 2;
            } else if (var6.field1334.field373 == var12.field6469 || var6.field1334.field373 == var12.field6432 || var6.field1334.field373 == var12.field6435 || var6.field1334.field373 == var12.field6468) {
                var11 = 3;
            }
            if (var6.field1343 != var11) {
                int var13 = class286.method1791(var6.field1334, (byte) 78);
                if (var6.field1341 != var13) {
                    if (var6.field1337 != null) {
                        class124.field1920.method232(var6.field1337);
                        var6.field1337 = null;
                    }
                    var6.field1341 = var13;
                }
                var6.field1343 = var11;
            }
            var6.field1332 = var6.field1334.field5529;
            var6.field1336 = var6.field1334.field5529 + (var6.field1334.method184(1) << 6);
            var6.field1342 = var6.field1334.field5539;
            var6.field1346 = var6.field1334.field5539 + (var6.field1334.method184(1) << 6);
            class258.method1632(arg2, arg0, var6, arg4, (byte) 110, arg3);
        }
        for (class81 var7 = (class81) class351.field5333.method2483(125); var7 != null; var7 = (class81) class351.field5333.method2481((byte) -27)) {
            byte var8 = 1;
            class441 var9 = var7.field1350.method192(true);
            if (var7.field1350.field393) {
                var8 = 0;
            } else if (var7.field1350.field373 == var9.field6434 || var7.field1350.field373 == var9.field6431 || var7.field1350.field373 == var9.field6461 || var7.field1350.field373 == var9.field6444) {
                var8 = 2;
            } else if (var7.field1350.field373 == var9.field6469 || var7.field1350.field373 == var9.field6432 || var7.field1350.field373 == var9.field6435 || var7.field1350.field373 == var9.field6468) {
                var8 = 3;
            }
            if (var7.field1343 != var8) {
                int var10 = class360.method2318(var7.field1350, -1);
                if (var7.field1341 != var10) {
                    if (var7.field1337 != null) {
                        class124.field1920.method232(var7.field1337);
                        var7.field1337 = null;
                    }
                    var7.field1341 = var10;
                }
                var7.field1343 = var8;
            }
            var7.field1332 = var7.field1350.field5529;
            var7.field1336 = var7.field1350.field5529 + (var7.field1350.method184(1) << 6);
            var7.field1342 = var7.field1350.field5539;
            var7.field1346 = var7.field1350.field5539 + (var7.field1350.method184(1) << 6);
            class258.method1632(arg2, arg0, var7, arg4, (byte) 110, arg3);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V", line = 198)
    public static void method2812(boolean arg0) {
        field6939 = null;
        if (arg0) {
            method2808(-20, 23, 106, -77, 117, -66, 74);
        }
        field6929 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IILj;I)V", line = 209)
    public final void method2813(int arg0, int arg1, class377 arg2, int arg3) {
        field6937++;
        class205 var5 = (class205) arg2;
        int var6 = var5.field2954 + arg3 + 1;
        int var7 = var5.field2958 + arg1 + 1;
        int var8 = this.field6919 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field2955;
        if (arg0 <= 67) {
            field6939 = null;
        }
        int var11 = var5.field2956;
        int var12 = this.field6919 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var10 -= var14;
            var9 += var11 * var14;
            var8 += this.field6919 * var14;
            var7 = 1;
        }
        if (this.field6931 <= var7 + var10) {
            int var15 = var10 + var7 + 1 - this.field6931;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var6 = 1;
            var12 += var16;
            var13 += var16;
            var8 += var16;
            var9 += var16;
        }
        if (this.field6919 <= var6 + var11) {
            int var17 = var11 + var6 + 1 - this.field6919;
            var11 -= var17;
            var12 += var17;
            var13 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class385.method2424(var12, var8, var11, var13, this.field6930, -67, var10, var5.field2949, var9);
            this.method2817(var11, var6, -113, var10, var7);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IB[[ZIZI)V", line = 291)
    public final void method2814(int arg0, byte arg1, boolean[][] arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 != -36) {
            method2809((byte) 108, -40);
        }
        field6921++;
        this.field6933.method2024(true, false);
        this.field6933.method2052((byte) 114, false);
        this.field6933.method2008(-2, 848);
        this.field6933.method2068(1, arg1 ^ 0xFFFFCC92);
        this.field6933.method2061(1, (byte) -61);
        float var7 = 1.0F / (float) (this.field6933.field4787 * 128);
        if (arg4) {
            for (int var22 = 0; var22 < this.field6923; var22++) {
                int var23 = var22 << this.field6928;
                int var24 = var22 + 1 << this.field6928;
                label88: for (int var25 = 0; var25 < this.field6922; var25++) {
                    int var26 = var25 << this.field6928;
                    int var27 = var25 + 1 << this.field6928;
                    for (int var28 = var26; var28 < var27; var28++) {
                        if (-arg3 <= var28 - arg0 && arg3 >= var28 - arg0) {
                            for (int var29 = var23; var29 < var24; var29++) {
                                if (var29 - arg5 >= -arg3 && arg3 >= var29 - arg5 && arg2[arg3 + var28 - arg0][arg3 + var29 - arg5]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var25) / var7, (float) (-var22) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field6925[var25][var22].method1615(5123);
                                    continue label88;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var8 = 0; var8 < this.field6923; var8++) {
                int var9 = var8 << this.field6928;
                int var10 = var8 + 1 << this.field6928;
                for (int var11 = 0; var11 < this.field6922; var11++) {
                    int var12 = 0;
                    int var13 = var11 << this.field6928;
                    int var14 = var11 + 1 << this.field6928;
                    class303 var15 = class356.field5381;
                    var15.field4333 = 0;
                    for (int var16 = var9; var16 < var10; var16++) {
                        if (-arg3 <= var16 - arg5 && arg3 >= var16 - arg5) {
                            int var17 = this.field6938.field532 * var16 + var13;
                            for (int var18 = var13; var18 < var14; var18++) {
                                if (-arg3 <= var18 - arg0 && var18 - arg0 <= arg3 && arg2[var18 + arg3 - arg0][var16 - (arg5 - arg3)]) {
                                    short[] var19 = this.field6938.field3879[var17];
                                    if (var19 != null) {
                                        if (this.field6933.field4850) {
                                            for (int var20 = 0; var20 < var19.length; var20++) {
                                                var12++;
                                                var15.method1874(var19[var20] & 0xFFFF, (byte) -110);
                                            }
                                        } else {
                                            for (int var21 = 0; var21 < var19.length; var21++) {
                                                var15.method1863((byte) -120, var19[var21] & 0xFFFF);
                                                var12++;
                                            }
                                        }
                                    }
                                }
                                var17++;
                            }
                        }
                    }
                    if (var12 > 0) {
                        OpenGL.glMatrixMode(5890);
                        OpenGL.glLoadIdentity();
                        OpenGL.glScalef(var7, var7, 1.0F);
                        OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                        OpenGL.glMatrixMode(5888);
                        this.field6925[var11][var8].method1616(var12, 5123, var15.field4326, (byte) 106);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIILj;)V", line = 501)
    public final void method2815(int arg0, int arg1, int arg2, class377 arg3) {
        field6935++;
        class205 var5 = (class205) arg3;
        int var6 = var5.field2954 + arg2 + 1;
        int var7 = var5.field2958 + arg1 + 1;
        if (arg0 != 5340) {
            this.field6919 = 53;
        }
        int var8 = var6 + (this.field6919 * var7);
        int var9 = 0;
        int var10 = var5.field2955;
        int var11 = var5.field2956;
        int var12 = this.field6919 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var9 += var11 * var13;
            var8 += this.field6919 * var13;
            var10 -= var13;
            var7 = 1;
        }
        int var14 = 0;
        if (var7 + var10 >= this.field6931) {
            int var15 = var10 + var7 + 1 - this.field6931;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var11 -= var16;
            var6 = 1;
            var8 += var16;
            var14 += var16;
            var12 += var16;
            var9 += var16;
        }
        if (var6 + var11 >= this.field6919) {
            int var17 = var6 - (-var11 - (1 - this.field6919));
            var12 += var17;
            var14 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class18.method163(var14, var8, this.field6930, var12, 20223, var11, var9, var5.field2949, var10);
            this.method2817(var11, var6, 31, var10, var7);
        }
    }

    @OriginalMember(owner = "client!ab", name = "<init>", descriptor = "(Lqg;Lpp;)V", line = 573)
    public class471(class321 arg0, class267 arg1) {
        this.field6938 = arg1;
        this.field6933 = arg0;
        this.field6919 = (this.field6938.field534 * this.field6938.field532 >> this.field6933.field4785) + 2;
        this.field6931 = (this.field6938.field534 * this.field6938.field531 >> this.field6933.field4785) + 2;
        this.field6928 = this.field6933.field4785 + 7 - this.field6938.field535;
        this.field6930 = new byte[this.field6931 * this.field6919];
        this.field6922 = this.field6938.field532 >> this.field6928;
        this.field6923 = this.field6938.field531 >> this.field6928;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lj;IZI)Z", line = 589)
    public final boolean method2816(class377 arg0, int arg1, boolean arg2, int arg3) {
        field6926++;
        if (!arg2) {
            return false;
        }
        class205 var5 = (class205) arg0;
        int var6 = var5.field2954 + arg3 + 1;
        int var7 = var5.field2958 + arg1 + 1;
        int var8 = this.field6919 * var7 + var6;
        int var9 = var5.field2955;
        int var10 = var5.field2956;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var9 -= var11;
            var7 = 1;
            var8 += this.field6919 * var11;
        }
        int var12 = this.field6919 - var10;
        if (this.field6931 <= var7 + var9) {
            int var13 = var7 + var9 + 1 - this.field6931;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var8 += var14;
            var6 = 1;
            var10 -= var14;
            var12 += var14;
        }
        if ((var6 + var10) >= this.field6919) {
            int var15 = var6 + var10 + 1 - this.field6919;
            var10 -= var15;
            var12 += var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field6919 + var12;
            return class36.method289(var8, var17, arg2, var16, var10, var9, this.field6930);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IIIII)V", line = 660)
    private final void method2817(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6920++;
        if (this.field6925 == null) {
            return;
        }
        int var6 = arg1 - 1 >> 7;
        int var7 = arg0 + arg1 - 1 - 1 >> 7;
        int var8 = 31 / ((arg2 + 32) / 33);
        int var9 = arg4 - 1 >> 7;
        int var10 = arg4 - (1 + 1 - arg3) >> 7;
        for (int var11 = var6; var11 <= var7; var11++) {
            class254[] var12 = this.field6925[var11];
            for (int var13 = var9; var13 <= var10; var13++) {
                var12[var13].field3673 = true;
            }
        }
    }
}
