import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fka")
public class class743 {

    @OriginalMember(owner = "client!fka", name = "g", descriptor = "[F")
    private float[] field10253 = new float[16];

    @OriginalMember(owner = "client!fka", name = "j", descriptor = "Luj;")
    private class406 field10256 = new class406(786336);

    @OriginalMember(owner = "client!fka", name = "n", descriptor = "I")
    private int field10260 = class485.method2812(9761, 1600);

    @OriginalMember(owner = "client!fka", name = "t", descriptor = "[I")
    private int[] field10266 = new int[1600];

    @OriginalMember(owner = "client!fka", name = "u", descriptor = "[I")
    private int[] field10267 = new int[64];

    @OriginalMember(owner = "client!fka", name = "r", descriptor = "[[Lvj;")
    private class468[][] field10264 = new class468[1600][64];

    @OriginalMember(owner = "client!fka", name = "s", descriptor = "I")
    private int field10265 = 0;

    @OriginalMember(owner = "client!fka", name = "v", descriptor = "[[Lvj;")
    private class468[][] field10268 = new class468[64][768];

    @OriginalMember(owner = "client!fka", name = "y", descriptor = "[I")
    private int[] field10271 = new int[8191];

    @OriginalMember(owner = "client!fka", name = "f", descriptor = "I")
    public static int field10252 = 0;

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "I")
    public static int field10247;

    @OriginalMember(owner = "client!fka", name = "c", descriptor = "I")
    public static int field10249;

    @OriginalMember(owner = "client!fka", name = "d", descriptor = "I")
    public static int field10250;

    @OriginalMember(owner = "client!fka", name = "e", descriptor = "I")
    public static int field10251;

    @OriginalMember(owner = "client!fka", name = "h", descriptor = "I")
    public static int field10254;

    @OriginalMember(owner = "client!fka", name = "i", descriptor = "I")
    public static int field10255;

    @OriginalMember(owner = "client!fka", name = "o", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!fka", name = "p", descriptor = "I")
    public static int field10262;

    @OriginalMember(owner = "client!fka", name = "w", descriptor = "I")
    public static int field10269;

    @OriginalMember(owner = "client!fka", name = "x", descriptor = "I")
    public static int field10270;

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "J")
    public static long field10248;

    @OriginalMember(owner = "client!fka", name = "l", descriptor = "Lfha;")
    private class401 field10258;

    @OriginalMember(owner = "client!fka", name = "k", descriptor = "Lwe;")
    private class430 field10257;

    @OriginalMember(owner = "client!fka", name = "m", descriptor = "Lwe;")
    private class430 field10259;

    @OriginalMember(owner = "client!fka", name = "q", descriptor = "Lwe;")
    private class430 field10263;

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(ILdia;I)V", line = 3)
    private final void method4111(int arg0, class246 arg1, int arg2) {
        field10270++;
        class244.field3297 = arg1.field3657;
        arg1.method1613(20980, (float) arg2);
        arg1.method1650((byte) 54);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        if (arg0 != -28486) {
            field10252 = 24;
        }
        arg1.method1583((byte) -68, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(Ldia;B)V", line = 24)
    private final void method4112(class246 arg0, byte arg1) {
        field10249++;
        arg0.method1583((byte) -68, true);
        int var3 = 120 / ((arg1 + 25) / 52);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class244.field3297 != arg0.field3657) {
            arg0.method452(class244.field3297);
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V", line = 40)
    public static final void method4113(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class791.field10882 = true;
        class546.field7395 = class192.field2582.method451() > 0;
        class269.field3967 = arg15;
        class331.field4776 = arg1 >> class26.field388;
        class76.field1102 = arg3 >> class26.field388;
        class787.field10837 = arg1;
        class328.field4759 = arg3;
        class632.field8828 = arg2;
        class402.field5850 = class331.field4776 - class174.field2337;
        if (class402.field5850 < 0) {
            class366.field5328 = -class402.field5850;
            class402.field5850 = 0;
        } else {
            class366.field5328 = 0;
        }
        class391.field5697 = class76.field1102 - class174.field2337;
        if (class391.field5697 < 0) {
            class453.field6297 = -class391.field5697;
            class391.field5697 = 0;
        } else {
            class453.field6297 = 0;
        }
        class212.field2810 = class331.field4776 + class174.field2337;
        if (class212.field2810 > class405.field5875) {
            class212.field2810 = class405.field5875;
        }
        class647.field8988 = class76.field1102 + class174.field2337;
        if (class647.field8988 > class710.field9947) {
            class647.field8988 = class710.field9947;
        }
        boolean[][] var19 = class79.field1122;
        boolean[][] var20 = class245.field3316;
        if (class269.field3967) {
            for (int var21 = 0; var21 < class174.field2337 + class174.field2337 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class174.field2337 + class174.field2337 + 2; var24++) {
                    if (var24 > 1) {
                        class214.field2822[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class331.field4776 + var21 - class174.field2337;
                    int var26 = class76.field1102 + var24 - class174.field2337;
                    if (var25 >= 0 && var26 >= 0 && var25 < class405.field5875 && var26 < class710.field9947) {
                        int var27 = var25 << class26.field388;
                        int var28 = var26 << class26.field388;
                        int var29 = class412.field5933[class412.field5933.length - 1].method1880(var25, false, var26) - (0x3E8 << class26.field388 - 7);
                        int var30 = class538.field7317 == null ? class412.field5933[0].method1880(var25, false, var26) + class48.field722 : class538.field7317[0].method1880(var25, false, var26) + class48.field722;
                        var23 = arg16 >= 0 ? class192.field2582.method454(var27, var29, var28, var27, var30, var28, arg16) : class192.field2582.method505(var27, var29, var28, var27, var30, var28);
                        class245.field3316[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class245.field3316[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class214.field2822[var24 - 1] & class214.field2822[var24] & var22 & var23;
                        class79.field1122[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class214.field2822[class174.field2337 + class174.field2337] = var22;
                class214.field2822[class174.field2337 + class174.field2337 + 1] = var23;
            }
            if (arg16 >= 0) {
                class791.field10882 = false;
            } else {
                class27.field408 = arg5;
                class234.field3168 = arg6;
                class463.field6409 = arg7;
                class191.field2552 = arg8;
                class561.field7539 = arg9;
                class81.method681(class192.field2582, 28548, arg10);
            }
        } else {
            if (class539.field7335 == null) {
                class539.field7335 = new boolean[class405.field5875 + class405.field5875 + 1][class710.field9947 + class405.field5875 + 1];
            }
            for (int var32 = 0; var32 < class539.field7335.length; var32++) {
                for (int var42 = 0; var42 < class539.field7335[0].length; var42++) {
                    class539.field7335[var32][var42] = true;
                }
            }
            class245.field3316 = class539.field7335;
            class79.field1122 = class539.field7335;
            class402.field5850 = 0;
            class391.field5697 = 0;
            class212.field2810 = class405.field5875;
            class647.field8988 = class710.field9947;
            class791.field10882 = false;
        }
        class731.method4057((byte) 77, class192.field2582);
        if (!class201.field2670.field176) {
            class15 var33 = class201.field2670.field171;
            for (class176 var34 = (class176) var33.method109(0); var34 != null; var34 = (class176) var33.method115((byte) -108)) {
                var34.method2922((byte) -112);
                class670.method3726(var34, (byte) 95);
            }
        }
        if (class546.field7395) {
            for (int var35 = 0; var35 < class490.field6806; var35++) {
                class369.field5356[var35].method3902(-99, arg0, arg14);
            }
        }
        if (class238.field3214) {
            class319.field4598 = class192.field2582.method496();
            class192.field2582.method494(class8.field94);
            int var36 = (class8.field94[2] - class8.field94[0]) / class458.field6353;
            for (int var37 = 0; var37 < class458.field6353 - 1; var37++) {
                class418.field5999[var37] = (var37 + 1) * var36 + class370.field5371[var37];
            }
            for (int var38 = 0; var38 < class665.field9187.length; var38++) {
                class665.field9187[var38].method1400();
            }
        }
        if (class747.field10304 != null) {
            if (class238.field3214) {
                class386.method2448(0);
            }
            class302.method1911(true);
            class192.field2582.method552(-1, 1583160, 40, 127);
            class181.method1257(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class238.field3214) {
                class586.method3251();
            }
            class192.field2582.method555();
            class302.method1911(false);
        }
        class181.method1257(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class238.field3214) {
            for (int var39 = 0; var39 < class315.field4541; var39++) {
                class34.field560[var39] = class603.field8203[var39];
            }
            class386.method2448(0);
            for (int var40 = 0; var40 < class665.field9187.length; var40++) {
                class665.field9187[var40].method1400();
            }
        }
        if (class238.field3214) {
            class586.method3251();
            for (int var41 = 0; var41 < class315.field4541; var41++) {
                class603.field8203[var41] = class34.field560[var41];
            }
            if (class695.field9751 == 2) {
                int var10002;
                if (class303.field4365[0] < class303.field4365[1]) {
                    if (class418.field5999[0] + class370.field5371[0] > class8.field94[0]) {
                        var10002 = class370.field5371[0]++;
                    }
                } else if (class303.field4365[0] > class303.field4365[1] && class418.field5999[0] + class370.field5371[0] < class8.field94[2]) {
                    var10002 = class370.field5371[0]--;
                }
            }
        }
        if (!class269.field3967) {
            class79.field1122 = var19;
            class245.field3316 = var20;
        }
        class218.method1436();
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(ZLdia;I)V", line = 323)
    private final void method4114(boolean arg0, class246 arg1, int arg2) {
        field10251++;
        OpenGL.glGetFloatv(2982, this.field10253, 0);
        float var4 = this.field10253[0];
        float var5 = this.field10253[4];
        float var6 = this.field10253[8];
        float var7 = this.field10253[1];
        float var8 = this.field10253[5];
        float var9 = this.field10253[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        if (!arg0) {
            return;
        }
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field10256.field5459 = 0;
        float var18 = var9 - var6;
        if (arg1.field3588) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field10266[var44] <= 64 ? this.field10266[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class468 var59 = this.field10264[var44][var46];
                        int var60 = var59.field6497;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6493 >> 12);
                        float var66 = (float) (var59.field6486 >> 12);
                        float var67 = (float) (var59.field6488 >> 12);
                        int var68 = var59.field6487 >> 12;
                        this.field10256.method2523(-4231, 0.0F);
                        this.field10256.method2523(-4231, 0.0F);
                        this.field10256.method2523(-4231, (float) (-var68) * var10 + var65);
                        this.field10256.method2523(-4231, (float) (-var68) * var11 + var66);
                        this.field10256.method2523(-4231, (float) (-var68) * var12 + var67);
                        this.field10256.method2380(65280, var61);
                        this.field10256.method2380(65280, var62);
                        this.field10256.method2380(65280, var63);
                        this.field10256.method2380(65280, var64);
                        this.field10256.method2523(-4231, 1.0F);
                        this.field10256.method2523(-4231, 0.0F);
                        this.field10256.method2523(-4231, (float) var68 * var13 + var65);
                        this.field10256.method2523(-4231, (float) var68 * var14 + var66);
                        this.field10256.method2523(-4231, (float) var68 * var15 + var67);
                        this.field10256.method2380(65280, var61);
                        this.field10256.method2380(65280, var62);
                        this.field10256.method2380(65280, var63);
                        this.field10256.method2380(65280, var64);
                        this.field10256.method2523(-4231, 1.0F);
                        this.field10256.method2523(-4231, 1.0F);
                        this.field10256.method2523(-4231, (float) var68 * var10 + var65);
                        this.field10256.method2523(-4231, (float) var68 * var11 + var66);
                        this.field10256.method2523(-4231, (float) var68 * var12 + var67);
                        this.field10256.method2380(65280, var61);
                        this.field10256.method2380(65280, var62);
                        this.field10256.method2380(65280, var63);
                        this.field10256.method2380(65280, var64);
                        this.field10256.method2523(-4231, 0.0F);
                        this.field10256.method2523(-4231, 1.0F);
                        this.field10256.method2523(-4231, (float) var68 * var16 + var65);
                        this.field10256.method2523(-4231, (float) var68 * var17 + var66);
                        this.field10256.method2523(-4231, (float) var68 * var18 + var67);
                        this.field10256.method2380(65280, var61);
                        this.field10256.method2380(65280, var62);
                        this.field10256.method2380(65280, var63);
                        this.field10256.method2380(65280, var64);
                    }
                    if (this.field10266[var44] > 64) {
                        int var47 = this.field10266[var44] - 1 - 64;
                        for (int var48 = this.field10267[var47] - 1; var48 >= 0; var48--) {
                            class468 var49 = this.field10268[var47][var48];
                            int var50 = var49.field6497;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6493 >> 12);
                            float var56 = (float) (var49.field6486 >> 12);
                            float var57 = (float) (var49.field6488 >> 12);
                            int var58 = var49.field6487 >> 12;
                            this.field10256.method2523(-4231, 0.0F);
                            this.field10256.method2523(-4231, 0.0F);
                            this.field10256.method2523(-4231, (float) (-var58) * var10 + var55);
                            this.field10256.method2523(-4231, (float) (-var58) * var11 + var56);
                            this.field10256.method2523(-4231, (float) (-var58) * var12 + var57);
                            this.field10256.method2380(65280, var51);
                            this.field10256.method2380(65280, var52);
                            this.field10256.method2380(65280, var53);
                            this.field10256.method2380(65280, var54);
                            this.field10256.method2523(-4231, 1.0F);
                            this.field10256.method2523(-4231, 0.0F);
                            this.field10256.method2523(-4231, (float) var58 * var13 + var55);
                            this.field10256.method2523(-4231, (float) var58 * var14 + var56);
                            this.field10256.method2523(-4231, (float) var58 * var15 + var57);
                            this.field10256.method2380(65280, var51);
                            this.field10256.method2380(65280, var52);
                            this.field10256.method2380(65280, var53);
                            this.field10256.method2380(65280, var54);
                            this.field10256.method2523(-4231, 1.0F);
                            this.field10256.method2523(-4231, 1.0F);
                            this.field10256.method2523(-4231, (float) var58 * var10 + var55);
                            this.field10256.method2523(-4231, (float) var58 * var11 + var56);
                            this.field10256.method2523(-4231, (float) var58 * var12 + var57);
                            this.field10256.method2380(65280, var51);
                            this.field10256.method2380(65280, var52);
                            this.field10256.method2380(65280, var53);
                            this.field10256.method2380(65280, var54);
                            this.field10256.method2523(-4231, 0.0F);
                            this.field10256.method2523(-4231, 1.0F);
                            this.field10256.method2523(-4231, (float) var58 * var16 + var55);
                            this.field10256.method2523(-4231, (float) var58 * var17 + var56);
                            this.field10256.method2523(-4231, (float) var58 * var18 + var57);
                            this.field10256.method2380(65280, var51);
                            this.field10256.method2380(65280, var52);
                            this.field10256.method2380(65280, var53);
                            this.field10256.method2380(65280, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field10266[var19] > 64 ? 64 : this.field10266[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class468 var34 = this.field10264[var19][var21];
                        int var35 = var34.field6497;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6493 >> 12);
                        float var41 = (float) (var34.field6486 >> 12);
                        float var42 = (float) (var34.field6488 >> 12);
                        int var43 = var34.field6487 >> 12;
                        this.field10256.method2524(124, 0.0F);
                        this.field10256.method2524(-62, 0.0F);
                        this.field10256.method2524(89, (float) (-var43) * var10 + var40);
                        this.field10256.method2524(-84, (float) (-var43) * var11 + var41);
                        this.field10256.method2524(-42, (float) (-var43) * var12 + var42);
                        this.field10256.method2380(65280, var36);
                        this.field10256.method2380(65280, var37);
                        this.field10256.method2380(65280, var38);
                        this.field10256.method2380(65280, var39);
                        this.field10256.method2524(112, 1.0F);
                        this.field10256.method2524(-106, 0.0F);
                        this.field10256.method2524(-77, (float) var43 * var13 + var40);
                        this.field10256.method2524(73, (float) var43 * var14 + var41);
                        this.field10256.method2524(-122, (float) var43 * var15 + var42);
                        this.field10256.method2380(65280, var36);
                        this.field10256.method2380(65280, var37);
                        this.field10256.method2380(65280, var38);
                        this.field10256.method2380(65280, var39);
                        this.field10256.method2524(-102, 1.0F);
                        this.field10256.method2524(91, 1.0F);
                        this.field10256.method2524(-60, (float) var43 * var10 + var40);
                        this.field10256.method2524(-69, (float) var43 * var11 + var41);
                        this.field10256.method2524(-46, (float) var43 * var12 + var42);
                        this.field10256.method2380(65280, var36);
                        this.field10256.method2380(65280, var37);
                        this.field10256.method2380(65280, var38);
                        this.field10256.method2380(65280, var39);
                        this.field10256.method2524(-110, 0.0F);
                        this.field10256.method2524(-51, 1.0F);
                        this.field10256.method2524(-90, (float) var43 * var16 + var40);
                        this.field10256.method2524(-81, (float) var43 * var17 + var41);
                        this.field10256.method2524(71, (float) var43 * var18 + var42);
                        this.field10256.method2380(65280, var36);
                        this.field10256.method2380(65280, var37);
                        this.field10256.method2380(65280, var38);
                        this.field10256.method2380(65280, var39);
                    }
                    if (this.field10266[var19] > 64) {
                        int var22 = this.field10266[var19] - 64 - 1;
                        for (int var23 = this.field10267[var22] - 1; var23 >= 0; var23--) {
                            class468 var24 = this.field10268[var22][var23];
                            int var25 = var24.field6497;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6493 >> 12);
                            float var31 = (float) (var24.field6486 >> 12);
                            float var32 = (float) (var24.field6488 >> 12);
                            int var33 = var24.field6487 >> 12;
                            this.field10256.method2524(-124, 0.0F);
                            this.field10256.method2524(92, 0.0F);
                            this.field10256.method2524(82, (float) (-var33) * var10 + var30);
                            this.field10256.method2524(72, (float) (-var33) * var11 + var31);
                            this.field10256.method2524(-89, (float) (-var33) * var12 + var32);
                            this.field10256.method2380(65280, var26);
                            this.field10256.method2380(65280, var27);
                            this.field10256.method2380(65280, var28);
                            this.field10256.method2380(65280, var29);
                            this.field10256.method2524(85, 1.0F);
                            this.field10256.method2524(-101, 0.0F);
                            this.field10256.method2524(-103, (float) var33 * var13 + var30);
                            this.field10256.method2524(-110, (float) var33 * var14 + var31);
                            this.field10256.method2524(104, (float) var33 * var15 + var32);
                            this.field10256.method2380(65280, var26);
                            this.field10256.method2380(65280, var27);
                            this.field10256.method2380(65280, var28);
                            this.field10256.method2380(65280, var29);
                            this.field10256.method2524(91, 1.0F);
                            this.field10256.method2524(64, 1.0F);
                            this.field10256.method2524(78, (float) var33 * var10 + var30);
                            this.field10256.method2524(124, (float) var33 * var11 + var31);
                            this.field10256.method2524(-73, (float) var33 * var12 + var32);
                            this.field10256.method2380(65280, var26);
                            this.field10256.method2380(65280, var27);
                            this.field10256.method2380(65280, var28);
                            this.field10256.method2380(65280, var29);
                            this.field10256.method2524(-125, 0.0F);
                            this.field10256.method2524(122, 1.0F);
                            this.field10256.method2524(-49, (float) var33 * var16 + var30);
                            this.field10256.method2524(122, (float) var33 * var17 + var31);
                            this.field10256.method2524(112, (float) var33 * var18 + var32);
                            this.field10256.method2380(65280, var26);
                            this.field10256.method2380(65280, var27);
                            this.field10256.method2380(65280, var28);
                            this.field10256.method2380(65280, var29);
                        }
                    }
                }
            }
        }
        if (this.field10256.field5459 != 0) {
            this.field10258.method2501(this.field10256.field5518, 24, 30463, this.field10256.field5459);
            arg1.method1600(null, this.field10259, this.field10257, (byte) 37, this.field10263);
            arg1.method1627(7, this.field10256.field5459 / 24, 0, 126);
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(Ldia;I)V", line = 679)
    public final void method4115(class246 arg0, int arg1) {
        this.field10258 = arg0.method1596(0, 196584, null, true, 24);
        field10255++;
        this.field10263 = new class430(this.field10258, 5126, 2, 0);
        this.field10257 = new class430(this.field10258, 5126, 3, 8);
        this.field10259 = new class430(this.field10258, 5121, 4, 20);
        if (arg1 <= 96) {
            method4117(-119, -43, -35);
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(IZII)I", line = 695)
    public static final int method4116(int arg0, boolean arg1, int arg2, int arg3) {
        field10250++;
        int var4 = arg2 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg3;
        } else {
            if (arg1) {
                method4116(102, false, -126, 114);
            }
            return var4 == 2 ? 4095 - arg0 : 4095 - arg3;
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(III)Z", line = 719)
    public static final boolean method4117(int arg0, int arg1, int arg2) {
        if (arg2 == 2048) {
            field10261++;
            return (arg0 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fka", name = "a", descriptor = "(ILef;ILdia;)V", line = 741)
    public final void method4118(int arg0, class515 arg1, int arg2, class246 arg3) {
        field10247++;
        if (arg3.field3563 == null) {
            return;
        }
        if (arg2 >= 0) {
            this.method4111(-28486, arg3, arg2);
        } else {
            this.method4119(arg3, (byte) -107);
        }
        float var5 = arg3.field3563.field1690;
        float var6 = arg3.field3563.field1715;
        float var7 = arg3.field3563.field1708;
        float var8 = arg3.field3563.field1709;
        try {
            if (arg0 != 64) {
                return;
            }
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class424 var12 = arg1.field7049.field1011;
            for (class424 var13 = var12.field6051; var13 != var12; var13 = var13.field6051) {
                class468 var14 = (class468) var13;
                int var15 = (int) ((float) (var14.field6488 >> 12) * var7 + (float) (var14.field6493 >> 12) * var5 + (float) (var14.field6486 >> 12) * var6 + var8);
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field10271[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = class485.method2812(9761, var16) + 1 - this.field10260;
                var16 = (var16 >> var17) + 2;
            }
            class424 var18 = var12.field6051;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field10265 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field10266[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field10267[var24] = 0;
                }
                while (var12 != var18) {
                    class468 var25 = (class468) var18;
                    if (var22) {
                        var22 = false;
                        var21 = var25.field6498;
                        var20 = var25.field6496;
                    }
                    if (var19 > 0 && (var25.field6496 != var20 || var25.field6498 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field10271[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field10266[var26] < 64) {
                            this.field10264[var26][this.field10266[var26]++] = var25;
                        } else {
                            label101: {
                                if (this.field10266[var26] == 64) {
                                    if (this.field10265 == 64) {
                                        break label101;
                                    }
                                    this.field10266[var26] += (this.field10265++) + 1;
                                }
                                this.field10268[this.field10266[var26] - 64 - 1][this.field10267[this.field10266[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var18 = var18.field6051;
                }
                if (var20 < 0) {
                    arg3.method1640(-1, 18);
                } else {
                    arg3.method1640(var20, 64);
                }
                if (var21 && class244.field3297 != arg3.field3657) {
                    arg3.method452(class244.field3297);
                } else if (arg3.field3657 != 1.0F) {
                    arg3.method452(1.0F);
                }
                this.method4114(true, arg3, var16);
            }
        } catch (Exception var27) {
        }
        this.method4112(arg3, (byte) 45);
    }

    @OriginalMember(owner = "client!fka", name = "b", descriptor = "(Ldia;B)V", line = 909)
    private final void method4119(class246 arg0, byte arg1) {
        class244.field3297 = arg0.field3657;
        int var3 = 79 / ((arg1 + 6) / 52);
        field10269++;
        arg0.method1588((byte) 119);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method1583((byte) -68, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
