import jaggl.OpenGL;
import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class200 {

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Lsm;")
    private class257 field2407;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "Lkga;")
    private class506 field2418;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public int field2413;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "I")
    private int field2416;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "[B")
    public byte[] field2415;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    private int field2406;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    private int field2409;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    private int field2419;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "Z")
    public static boolean field2420 = false;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "[[Lki;")
    private class657[][] field2417;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z[[[BIB)V")
    public static final void method1213(boolean arg0, byte[][][] arg1, int arg2, byte arg3) {
        int var4 = arg0 ? 1 : 0;
        class632.field9091 = 0;
        class543.field7873 = 0;
        class128.field1633++;
        for (int var5 = 0; var5 < class196.field2370[var4]; var5++) {
            if (!class279.method1680(class549.field7969[var4][var5], arg0, arg1, arg2, arg3)) {
                class10.method57(class549.field7969[var4][var5]);
                if (class549.field7969[var4][var5].field536 != -1) {
                    class177.field2179[class632.field9091++] = class549.field7969[var4][var5];
                }
            }
        }
        for (int var6 = 0; var6 < class596.field8613[var4]; var6++) {
            if (!class279.method1680(class516.field7547[var4][var6], arg0, arg1, arg2, arg3)) {
                class10.method57(class516.field7547[var4][var6]);
                if (class516.field7547[var4][var6].field536 != -1) {
                    class227.field2939[class543.field7873++] = class516.field7547[var4][var6];
                }
            }
        }
        for (int var7 = 0; var7 < class571.field8344[var4]; var7++) {
            if (!class279.method1680(class67.field1036[var4][var7], arg0, arg1, arg2, arg3)) {
                if (class67.field1036[var4][var7].method165((byte) -52)) {
                    class10.method57(class67.field1036[var4][var7]);
                    if (class67.field1036[var4][var7].field536 != -1) {
                        class227.field2939[class543.field7873++] = class67.field1036[var4][var7];
                    }
                } else {
                    class10.method57(class67.field1036[var4][var7]);
                    if (class67.field1036[var4][var7].field536 != -1) {
                        class177.field2179[class632.field9091++] = class67.field1036[var4][var7];
                    }
                }
            }
        }
        if (!arg0) {
            for (int var8 = 0; var8 < class300.field4041; var8++) {
                if (!class279.method1680(class172.field2097[var8], arg0, arg1, arg2, arg3)) {
                    class10.method57(class172.field2097[var8]);
                    if (class172.field2097[var8].field536 != -1) {
                        if (class172.field2097[var8].method165((byte) -99)) {
                            class227.field2939[class543.field7873++] = class172.field2097[var8];
                        } else {
                            class177.field2179[class632.field9091++] = class172.field2097[var8];
                        }
                    }
                }
            }
        }
        if (class632.field9091 > 0) {
            class23.method357(class177.field2179, 0, class632.field9091 - 1);
            for (int var9 = 0; var9 < class632.field9091; var9++) {
                class626.method3598(class177.field2179[var9], true);
            }
        }
        if (class532.field7782) {
            class298.field4017.method284(0, null);
        }
        for (int var10 = class342.field4521; var10 < class663.field9391; var10++) {
            if (var10 < arg2 || arg1 == null) {
                int var21 = class616.field8849.length;
                if (class616.field8849.length + class382.field5106 > class455.field6393) {
                    var21 -= class616.field8849.length + class382.field5106 - class455.field6393;
                }
                int var22 = class616.field8849[0].length;
                if (class616.field8849[0].length + class123.field1588 > class302.field4057) {
                    var22 -= class616.field8849[0].length + class123.field1588 - class302.field4057;
                }
                boolean[][] var23 = class341.field4502;
                if (class266.field3658) {
                    if (class72.field1090) {
                        var23 = class504.field7036[var10];
                    }
                    for (int var24 = class361.field4806; var24 < var21; var24++) {
                        int var25 = class382.field5106 + var24 - class361.field4806;
                        for (int var26 = class564.field8153; var26 < var22; var26++) {
                            if (class616.field8849[var24][var26] && !class124.method860(class123.field1588 + var26 - class564.field8153, false, var10, var25)) {
                                var23[var24][var26] = true;
                            } else {
                                var23[var24][var26] = false;
                            }
                        }
                    }
                }
                if (class72.field1090) {
                    class155.field1899[var10].method436(0, 0, 0, null, false);
                    for (int var27 = 0; var27 < class298.field4019; var27++) {
                        class27.field609[var27].method532(new class503(var10 + 1), 16686);
                    }
                } else if (class643.field9182) {
                    class155.field1899[var10].method435(class591.field8564, class33.field663, class119.field1526, class341.field4502, true, class186.field2278);
                } else {
                    class155.field1899[var10].method436(class591.field8564, class33.field663, class119.field1526, class341.field4502, true);
                }
            } else {
                int var12 = class616.field8849.length;
                if (class616.field8849.length + class382.field5106 > class455.field6393) {
                    var12 -= class616.field8849.length + class382.field5106 - class455.field6393;
                }
                int var13 = class616.field8849[0].length;
                if (class616.field8849[0].length + class123.field1588 > class302.field4057) {
                    var13 -= class616.field8849[0].length + class123.field1588 - class302.field4057;
                }
                boolean[][] var14 = class341.field4502;
                if (class266.field3658) {
                    if (class72.field1090) {
                        var14 = class504.field7036[var10];
                    }
                    for (int var15 = class361.field4806; var15 < var12; var15++) {
                        int var16 = class382.field5106 + var15 - class361.field4806;
                        for (int var17 = class564.field8153; var17 < var13; var17++) {
                            var14[var15][var17] = false;
                            if (class616.field8849[var15][var17]) {
                                int var18 = class123.field1588 + var17 - class564.field8153;
                                for (int var19 = var10; var19 >= 0; var19--) {
                                    if (class281.field3808[var19][var16][var18] != null && class281.field3808[var19][var16][var18].field6205 == var10) {
                                        if ((var19 < arg2 || arg1[var19][var16][var18] != arg3) && !class124.method860(var18, false, var10, var16)) {
                                            var14[var15][var17] = true;
                                            break;
                                        }
                                        var14[var15][var17] = false;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (class72.field1090) {
                    class155.field1899[var10].method436(0, 0, 0, null, false);
                    for (int var20 = 0; var20 < class298.field4019; var20++) {
                        class27.field609[var20].method532(new class503(var10 + 1), 16686);
                    }
                } else if (class643.field9182) {
                    class155.field1899[var10].method435(class591.field8564, class33.field663, class119.field1526, class341.field4502, false, class186.field2278);
                } else {
                    class155.field1899[var10].method436(class591.field8564, class33.field663, class119.field1526, class341.field4502, false);
                }
            }
        }
        if (class543.field7873 > 0) {
            class696.method3911(class227.field2939, 0, class543.field7873 - 1);
            for (int var11 = 0; var11 < class543.field7873; var11++) {
                class626.method3598(class227.field2939[var11], true);
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public final void method1214(int arg0) {
        this.field2417 = new class657[this.field2409][this.field2419];
        field2414++;
        int var2 = 0;
        if (arg0 != 1) {
            return;
        }
        while (var2 < this.field2419) {
            for (int var3 = 0; var3 < this.field2409; var3++) {
                this.field2417[var3][var2] = new class657(this.field2418, this, this.field2407, var3, var2, this.field2406, var3 * 128 + 1, var2 * 128 - -1);
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILha;II)V")
    public final void method1215(int arg0, class54 arg1, int arg2, int arg3) {
        field2410++;
        if (arg3 != 6214) {
            field2421 = 29;
        }
        class357 var5 = (class357) arg1;
        int var6 = var5.field4760 + arg0 + 1;
        int var7 = var5.field4766 + arg2 + 1;
        int var8 = this.field2413 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4768;
        int var11 = var5.field4769;
        int var12 = this.field2413 - var11;
        int var13 = 0;
        if (var7 <= 0) {
            int var14 = 1 - var7;
            var9 += var11 * var14;
            var7 = 1;
            var10 -= var14;
            var8 += this.field2413 * var14;
        }
        if ((var7 + var10) >= this.field2416) {
            int var15 = var10 + var7 + 1 - this.field2416;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var12 += var16;
            var6 = 1;
            var13 += var16;
            var9 += var16;
            var11 -= var16;
            var8 += var16;
        }
        if (var6 + var11 >= this.field2413) {
            int var17 = var6 + var11 + 1 - this.field2413;
            var12 += var17;
            var13 += var17;
            var11 -= var17;
        }
        if (var11 > 0 && var10 > 0) {
            class340.method1960(var12, (byte) 121, var11, var13, var5.field4762, var8, var9, this.field2415, var10);
            this.method1216(arg3 ^ 0xFFFFE7D7, var11, var7, var6, var10);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIIII)V")
    private final void method1216(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2405++;
        if (this.field2417 == null) {
            return;
        }
        int var6 = arg3 - 1 >> 7;
        if (arg0 >= -99) {
            method1217(-65);
        }
        int var7 = arg1 + arg3 - 1 - 1 >> 7;
        int var8 = arg2 - 1 >> 7;
        int var9 = arg2 + arg4 - 1 - 1 >> 7;
        for (int var10 = var6; var10 <= var7; var10++) {
            class657[] var11 = this.field2417[var10];
            for (int var12 = var8; var12 <= var9; var12++) {
                var11[var12].field9333 = true;
            }
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
    public static final int method1217(int arg0) {
        field2404++;
        class165 var1 = class68.field1045;
        boolean var2 = false;
        if (class375.field5039 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class165.method1040(0, null, -4, var3, 0, null);
            var2 = true;
        }
        long var4 = class301.method1787((byte) -51);
        int var6 = 67 / ((85 - arg0) / 34);
        for (int var7 = 0; var7 < 10000; var7++) {
            var1.method285(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var8 = (int) (class301.method1787((byte) -113) - var4);
        var1.method1042(0, 100, 1, 0, -16777216, 100);
        if (var2) {
            var1.method1047(1);
        }
        return var8;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZIILha;)Z")
    public final boolean method1218(boolean arg0, int arg1, int arg2, class54 arg3) {
        field2411++;
        class357 var5 = (class357) arg3;
        int var6 = var5.field4760 + arg2 + 1;
        int var7 = var5.field4766 + arg1 + 1;
        int var8 = var6 + (this.field2413 * var7);
        int var9 = var5.field4768;
        if (!arg0) {
            return false;
        }
        int var10 = var5.field4769;
        if (var7 <= 0) {
            int var11 = 1 - var7;
            var7 = 1;
            var8 += this.field2413 * var11;
            var9 -= var11;
        }
        int var12 = this.field2413 - var10;
        if (var7 + var9 >= this.field2416) {
            int var13 = var7 + var9 + 1 - this.field2416;
            var9 -= var13;
        }
        if (var6 <= 0) {
            int var14 = 1 - var6;
            var6 = 1;
            var8 += var14;
            var12 += var14;
            var10 -= var14;
        }
        if (this.field2413 <= (var6 + var10)) {
            int var15 = var6 + var10 - (-1 - -this.field2413);
            var12 += var15;
            var10 -= var15;
        }
        if (var10 > 0 && var9 > 0) {
            byte var16 = 8;
            int var17 = (var16 - 1) * this.field2413 + var12;
            return class589.method3414(var10, var16, (byte) -118, var17, var8, this.field2415, var9);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(ILha;II)V")
    public final void method1219(int arg0, class54 arg1, int arg2, int arg3) {
        field2408++;
        class357 var5 = (class357) arg1;
        int var6 = var5.field4760 + arg2 + 1;
        int var7 = var5.field4766 + arg3 + 1;
        int var8 = this.field2413 * var7 + var6;
        int var9 = 0;
        int var10 = var5.field4768;
        int var11 = var5.field4769;
        int var12 = this.field2413 - var11;
        if (var7 <= 0) {
            int var13 = 1 - var7;
            var8 += this.field2413 * var13;
            var10 -= var13;
            var7 = 1;
            var9 += var11 * var13;
        }
        int var14 = 0;
        if (arg0 != 15573) {
            return;
        }
        if ((var7 + var10) >= this.field2416) {
            int var15 = var7 + var10 + 1 - this.field2416;
            var10 -= var15;
        }
        if (var6 <= 0) {
            int var16 = 1 - var6;
            var14 += var16;
            var6 = 1;
            var8 += var16;
            var12 += var16;
            var11 -= var16;
            var9 += var16;
        }
        if (this.field2413 <= (var6 + var11)) {
            int var17 = var6 + var11 + 1 - this.field2413;
            var11 -= var17;
            var12 += var17;
            var14 += var17;
        }
        if (var11 > 0 && var10 > 0) {
            class36.method419(this.field2415, var8, var10, var12, var11, var14, true, var9, var5.field4762);
            this.method1216(arg0 ^ 0xFFFFC347, var11, var7, var6, var10);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZ[[ZZII)V")
    public final void method1220(int arg0, boolean arg1, boolean[][] arg2, boolean arg3, int arg4, int arg5) {
        field2412++;
        this.field2418.method2969(false, (byte) -104);
        this.field2418.method2931((byte) -128, false);
        this.field2418.method2988(true, -2);
        this.field2418.method2985(1, -26973);
        this.field2418.method2996(1, arg3);
        float var7 = 1.0F / (float) (this.field2418.field7266 * 128);
        if (arg1) {
            for (int var8 = 0; var8 < this.field2419; var8++) {
                int var9 = var8 << this.field2406;
                int var10 = var8 + 1 << this.field2406;
                label132: for (int var11 = 0; var11 < this.field2409; var11++) {
                    int var12 = var11 << this.field2406;
                    int var13 = var11 + 1 << this.field2406;
                    for (int var14 = var12; var14 < var13; var14++) {
                        if (var14 - arg4 >= -arg5 && arg5 >= var14 - arg4) {
                            for (int var15 = var9; var15 < var10; var15++) {
                                if ((var15 - arg0) >= (-arg5) && arg5 >= var15 - arg0 && arg2[var14 + arg5 - arg4][arg5 + var15 - arg0]) {
                                    OpenGL.glMatrixMode(5890);
                                    OpenGL.glLoadIdentity();
                                    OpenGL.glScalef(var7, var7, 1.0F);
                                    OpenGL.glTranslatef((float) (-var11) / var7, (float) (-var8) / var7, 1.0F);
                                    OpenGL.glMatrixMode(5888);
                                    this.field2417[var11][var8].method3716((byte) -96);
                                    continue label132;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < this.field2419; var16++) {
                int var17 = var16 << this.field2406;
                int var18 = var16 + 1 << this.field2406;
                for (int var19 = 0; var19 < this.field2409; var19++) {
                    int var20 = 0;
                    int var21 = var19 << this.field2406;
                    int var22 = var19 + 1 << this.field2406;
                    class226 var23 = this.field2418.field7352;
                    var23.field5195 = 0;
                    for (int var24 = var17; var24 < var18; var24++) {
                        if ((-arg5) <= (var24 - arg0) && arg5 >= var24 - arg0) {
                            int var25 = this.field2407.field702 * var24 + var21;
                            for (int var26 = var21; var26 < var22; var26++) {
                                if (var26 - arg4 >= -arg5 && (var26 - arg4) <= arg5 && arg2[arg5 + var26 - arg4][var24 + arg5 - arg0]) {
                                    short[] var27 = this.field2407.field3486[var25];
                                    if (var27 != null) {
                                        if (this.field2418.field7353) {
                                            for (int var28 = 0; var28 < var27.length; var28++) {
                                                var23.method2261((byte) 99, var27[var28] & 0xFFFF);
                                                var20++;
                                            }
                                        } else {
                                            for (int var29 = 0; var29 < var27.length; var29++) {
                                                var20++;
                                                var23.method2236(var27[var29] & 0xFFFF, 78);
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
                        this.field2417[var19][var16].method3719(var23.field5205, 5123, var20, (byte) -116);
                    }
                }
            }
        }
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(Lkga;Lsm;)V")
    public class200(class506 arg0, class257 arg1) {
        this.field2407 = arg1;
        this.field2418 = arg0;
        this.field2413 = (this.field2407.field702 * this.field2407.field695 >> this.field2418.field7261) + 2;
        this.field2416 = (this.field2407.field706 * this.field2407.field695 >> this.field2418.field7261) + 2;
        this.field2415 = new byte[this.field2416 * this.field2413];
        this.field2406 = this.field2418.field7261 + 7 - this.field2407.field696;
        this.field2409 = this.field2407.field702 >> this.field2406;
        this.field2419 = this.field2407.field706 >> this.field2406;
    }
}
