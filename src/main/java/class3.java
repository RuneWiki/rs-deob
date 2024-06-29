import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class3 {

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "[F")
    private float[] field21 = new float[16];

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "Lki;")
    private class498 field20 = new class498(786336);

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    private int field25 = class285.method1698(-94, 1600);

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    private int field28 = 0;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "[I")
    private int[] field30 = new int[8191];

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "[[Lb;")
    private class219[][] field31 = new class219[1600][64];

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "[I")
    private int[] field29 = new int[64];

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "[[Lb;")
    private class219[][] field32 = new class219[64][768];

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "[I")
    private int[] field27 = new int[1600];

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    public static int field14 = 0;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "Lap;")
    private class334 field22;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "Lwc;")
    private class48 field23;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "Lwc;")
    private class48 field24;

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "Lwc;")
    private class48 field26;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lef;B)V", line = 5)
    public final void method8(class338 arg0, byte arg1) {
        this.field22 = arg0.method1943(196584, 24, null, (byte) 49, true);
        field12++;
        this.field24 = new class48(this.field22, 5126, 2, 0);
        this.field26 = new class48(this.field22, 5126, 3, 8);
        this.field23 = new class48(this.field22, 5121, 4, 20);
        if (arg1 >= -106) {
            this.method8(null, (byte) -24);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILem;)Lem;", line = 19)
    public static final class150 method9(int arg0, class150 arg1) {
        field17++;
        if (arg1.field2259 != -1) {
            return class60.method497(arg1.field2259, (byte) -127);
        } else if (arg0 <= 97) {
            return null;
        } else {
            int var2 = arg1.field2277 >>> 16;
            class105 var3 = new class105(class212.field2960);
            for (class295 var4 = (class295) var3.method775(false); var4 != null; var4 = (class295) var3.method778(72)) {
                if (var4.field4055 == var2) {
                    return class60.method497((int) var4.field3615, (byte) -125);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IILef;)V", line = 52)
    private final void method10(int arg0, int arg1, class338 arg2) {
        OpenGL.glGetFloatv(2982, this.field21, 0);
        field18++;
        float var4 = this.field21[0];
        float var5 = this.field21[4];
        float var6 = this.field21[8];
        float var7 = this.field21[1];
        float var8 = this.field21[5];
        float var9 = this.field21[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        if (arg0 >= -53) {
            this.field30 = null;
        }
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field20.field5719 = 0;
        float var18 = var9 - var6;
        if (arg2.field4772) {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field27[var19] <= 64 ? this.field27[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class219 var34 = this.field31[var19][var21];
                        int var35 = var34.field3058;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field3050 >> class255.field3542);
                        float var41 = (float) (var34.field3053 >> class255.field3542);
                        float var42 = (float) (var34.field3055 >> class255.field3542);
                        int var43 = var34.field3049 >> class255.field3542;
                        this.field20.method2906((byte) 80, 0.0F);
                        this.field20.method2906((byte) 80, 0.0F);
                        this.field20.method2906((byte) 80, (float) (-var43) * var10 + var40);
                        this.field20.method2906((byte) 80, (float) (-var43) * var11 + var41);
                        this.field20.method2906((byte) 80, (float) (-var43) * var12 + var42);
                        this.field20.method2302(-4, var36);
                        this.field20.method2302(-4, var37);
                        this.field20.method2302(-4, var38);
                        this.field20.method2302(-4, var39);
                        this.field20.method2906((byte) 80, 1.0F);
                        this.field20.method2906((byte) 80, 0.0F);
                        this.field20.method2906((byte) 80, (float) var43 * var13 + var40);
                        this.field20.method2906((byte) 80, (float) var43 * var14 + var41);
                        this.field20.method2906((byte) 80, (float) var43 * var15 + var42);
                        this.field20.method2302(-4, var36);
                        this.field20.method2302(-4, var37);
                        this.field20.method2302(-4, var38);
                        this.field20.method2302(-4, var39);
                        this.field20.method2906((byte) 80, 1.0F);
                        this.field20.method2906((byte) 80, 1.0F);
                        this.field20.method2906((byte) 80, (float) var43 * var10 + var40);
                        this.field20.method2906((byte) 80, (float) var43 * var11 + var41);
                        this.field20.method2906((byte) 80, (float) var43 * var12 + var42);
                        this.field20.method2302(-4, var36);
                        this.field20.method2302(-4, var37);
                        this.field20.method2302(-4, var38);
                        this.field20.method2302(-4, var39);
                        this.field20.method2906((byte) 80, 0.0F);
                        this.field20.method2906((byte) 80, 1.0F);
                        this.field20.method2906((byte) 80, (float) var43 * var16 + var40);
                        this.field20.method2906((byte) 80, (float) var43 * var17 + var41);
                        this.field20.method2906((byte) 80, (float) var43 * var18 + var42);
                        this.field20.method2302(-4, var36);
                        this.field20.method2302(-4, var37);
                        this.field20.method2302(-4, var38);
                        this.field20.method2302(-4, var39);
                    }
                    if (this.field27[var19] > 64) {
                        int var22 = this.field27[var19] - 65;
                        for (int var23 = this.field29[var22] - 1; var23 >= 0; var23--) {
                            class219 var24 = this.field32[var22][var23];
                            int var25 = var24.field3058;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field3050 >> class255.field3542);
                            float var31 = (float) (var24.field3053 >> class255.field3542);
                            float var32 = (float) (var24.field3055 >> class255.field3542);
                            int var33 = var24.field3049 >> class255.field3542;
                            this.field20.method2906((byte) 80, 0.0F);
                            this.field20.method2906((byte) 80, 0.0F);
                            this.field20.method2906((byte) 80, (float) (-var33) * var10 + var30);
                            this.field20.method2906((byte) 80, (float) (-var33) * var11 + var31);
                            this.field20.method2906((byte) 80, (float) (-var33) * var12 + var32);
                            this.field20.method2302(-4, var26);
                            this.field20.method2302(-4, var27);
                            this.field20.method2302(-4, var28);
                            this.field20.method2302(-4, var29);
                            this.field20.method2906((byte) 80, 1.0F);
                            this.field20.method2906((byte) 80, 0.0F);
                            this.field20.method2906((byte) 80, (float) var33 * var13 + var30);
                            this.field20.method2906((byte) 80, (float) var33 * var14 + var31);
                            this.field20.method2906((byte) 80, (float) var33 * var15 + var32);
                            this.field20.method2302(-4, var26);
                            this.field20.method2302(-4, var27);
                            this.field20.method2302(-4, var28);
                            this.field20.method2302(-4, var29);
                            this.field20.method2906((byte) 80, 1.0F);
                            this.field20.method2906((byte) 80, 1.0F);
                            this.field20.method2906((byte) 80, (float) var33 * var10 + var30);
                            this.field20.method2906((byte) 80, (float) var33 * var11 + var31);
                            this.field20.method2906((byte) 80, (float) var33 * var12 + var32);
                            this.field20.method2302(-4, var26);
                            this.field20.method2302(-4, var27);
                            this.field20.method2302(-4, var28);
                            this.field20.method2302(-4, var29);
                            this.field20.method2906((byte) 80, 0.0F);
                            this.field20.method2906((byte) 80, 1.0F);
                            this.field20.method2906((byte) 80, (float) var33 * var16 + var30);
                            this.field20.method2906((byte) 80, (float) var33 * var17 + var31);
                            this.field20.method2906((byte) 80, (float) var33 * var18 + var32);
                            this.field20.method2302(-4, var26);
                            this.field20.method2302(-4, var27);
                            this.field20.method2302(-4, var28);
                            this.field20.method2302(-4, var29);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field27[var44] > 64 ? 64 : this.field27[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class219 var59 = this.field31[var44][var46];
                        int var60 = var59.field3058;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field3050 >> class255.field3542);
                        float var66 = (float) (var59.field3053 >> class255.field3542);
                        float var67 = (float) (var59.field3055 >> class255.field3542);
                        int var68 = var59.field3049 >> class255.field3542;
                        this.field20.method2909(1107866360, 0.0F);
                        this.field20.method2909(1107866360, 0.0F);
                        this.field20.method2909(1107866360, (float) (-var68) * var10 + var65);
                        this.field20.method2909(1107866360, (float) (-var68) * var11 + var66);
                        this.field20.method2909(1107866360, (float) (-var68) * var12 + var67);
                        this.field20.method2302(-4, var61);
                        this.field20.method2302(-4, var62);
                        this.field20.method2302(-4, var63);
                        this.field20.method2302(-4, var64);
                        this.field20.method2909(1107866360, 1.0F);
                        this.field20.method2909(1107866360, 0.0F);
                        this.field20.method2909(1107866360, (float) var68 * var13 + var65);
                        this.field20.method2909(1107866360, (float) var68 * var14 + var66);
                        this.field20.method2909(1107866360, (float) var68 * var15 + var67);
                        this.field20.method2302(-4, var61);
                        this.field20.method2302(-4, var62);
                        this.field20.method2302(-4, var63);
                        this.field20.method2302(-4, var64);
                        this.field20.method2909(1107866360, 1.0F);
                        this.field20.method2909(1107866360, 1.0F);
                        this.field20.method2909(1107866360, (float) var68 * var10 + var65);
                        this.field20.method2909(1107866360, (float) var68 * var11 + var66);
                        this.field20.method2909(1107866360, (float) var68 * var12 + var67);
                        this.field20.method2302(-4, var61);
                        this.field20.method2302(-4, var62);
                        this.field20.method2302(-4, var63);
                        this.field20.method2302(-4, var64);
                        this.field20.method2909(1107866360, 0.0F);
                        this.field20.method2909(1107866360, 1.0F);
                        this.field20.method2909(1107866360, (float) var68 * var16 + var65);
                        this.field20.method2909(1107866360, (float) var68 * var17 + var66);
                        this.field20.method2909(1107866360, (float) var68 * var18 + var67);
                        this.field20.method2302(-4, var61);
                        this.field20.method2302(-4, var62);
                        this.field20.method2302(-4, var63);
                        this.field20.method2302(-4, var64);
                    }
                    if (this.field27[var44] > 64) {
                        int var47 = this.field27[var44] - 1 - 64;
                        for (int var48 = this.field29[var47] - 1; var48 >= 0; var48--) {
                            class219 var49 = this.field32[var47][var48];
                            int var50 = var49.field3058;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field3050 >> class255.field3542);
                            float var56 = (float) (var49.field3053 >> class255.field3542);
                            float var57 = (float) (var49.field3055 >> class255.field3542);
                            int var58 = var49.field3049 >> class255.field3542;
                            this.field20.method2909(1107866360, 0.0F);
                            this.field20.method2909(1107866360, 0.0F);
                            this.field20.method2909(1107866360, (float) (-var58) * var10 + var55);
                            this.field20.method2909(1107866360, (float) (-var58) * var11 + var56);
                            this.field20.method2909(1107866360, (float) (-var58) * var12 + var57);
                            this.field20.method2302(-4, var51);
                            this.field20.method2302(-4, var52);
                            this.field20.method2302(-4, var53);
                            this.field20.method2302(-4, var54);
                            this.field20.method2909(1107866360, 1.0F);
                            this.field20.method2909(1107866360, 0.0F);
                            this.field20.method2909(1107866360, (float) var58 * var13 + var55);
                            this.field20.method2909(1107866360, (float) var58 * var14 + var56);
                            this.field20.method2909(1107866360, (float) var58 * var15 + var57);
                            this.field20.method2302(-4, var51);
                            this.field20.method2302(-4, var52);
                            this.field20.method2302(-4, var53);
                            this.field20.method2302(-4, var54);
                            this.field20.method2909(1107866360, 1.0F);
                            this.field20.method2909(1107866360, 1.0F);
                            this.field20.method2909(1107866360, (float) var58 * var10 + var55);
                            this.field20.method2909(1107866360, (float) var58 * var11 + var56);
                            this.field20.method2909(1107866360, (float) var58 * var12 + var57);
                            this.field20.method2302(-4, var51);
                            this.field20.method2302(-4, var52);
                            this.field20.method2302(-4, var53);
                            this.field20.method2302(-4, var54);
                            this.field20.method2909(1107866360, 0.0F);
                            this.field20.method2909(1107866360, 1.0F);
                            this.field20.method2909(1107866360, (float) var58 * var16 + var55);
                            this.field20.method2909(1107866360, (float) var58 * var17 + var56);
                            this.field20.method2909(1107866360, (float) var58 * var18 + var57);
                            this.field20.method2302(-4, var51);
                            this.field20.method2302(-4, var52);
                            this.field20.method2302(-4, var53);
                            this.field20.method2302(-4, var54);
                        }
                    }
                }
            }
        }
        if (this.field20.field5719 != 0) {
            this.field22.method103(-13851, this.field20.field5678, 24, this.field20.field5719);
            arg2.method1968(this.field26, this.field23, 115, null, this.field24);
            arg2.method1960(7, 5889, this.field20.field5719 / 24, 0);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ZLef;)V", line = 410)
    private final void method11(boolean arg0, class338 arg1) {
        field15++;
        if (!arg0) {
            this.field21 = null;
        }
        class10.field152 = arg1.field4825;
        arg1.method1988(-1);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method1985(false, (byte) -125);
        arg1.method1944(-2, 12429);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(ILef;)V", line = 431)
    private final void method12(int arg0, class338 arg1) {
        arg1.method1985(true, (byte) -117);
        field16++;
        if (arg0 < 27) {
            this.method10(85, -33, null);
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class10.field152 != arg1.field4825) {
            arg1.method252(class10.field152);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lef;ILpn;)V", line = 457)
    public final void method13(class338 arg0, int arg1, class523 arg2) {
        field13++;
        if (arg0.field4818 == null) {
            return;
        }
        this.method11(true, arg0);
        float var4 = arg0.field4818.field3314;
        float var5 = arg0.field4818.field3329;
        if (arg1 != -1601) {
            method9(-4, null);
        }
        float var6 = arg0.field4818.field3317;
        float var7 = arg0.field4818.field3312;
        try {
            if (arg2.field7743) {
                int var26 = arg2.field7742 - arg2.field7744;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = 1 - (this.field25 - class285.method1698(-85, var26));
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                class340 var28 = arg2.field7740.field1935;
                class340 var29 = var28.field4899;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field28 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field27[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field29[var34] = 0;
                    }
                    while (var28 != var29) {
                        class219 var35 = (class219) var29;
                        if (var32) {
                            var32 = false;
                            var30 = var35.field3056;
                            var31 = var35.field3052;
                        } else if (var35.field3056 != var30 || var35.field3052 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field3055 >> class255.field3542) * var6 + (float) (var35.field3053 >> class255.field3542) * var5 + (float) (var35.field3050 >> class255.field3542) * var4 + var7) - arg2.field7744 >> var27;
                        if (var36 < 1600) {
                            if (this.field27[var36] >= 64) {
                                label139: {
                                    if (this.field27[var36] == 64) {
                                        if (this.field28 == 64) {
                                            break label139;
                                        }
                                        this.field27[var36] += this.field28++ + 1;
                                    }
                                    class219[] var10000 = this.field32[this.field27[var36] - 64 - 1];
                                    int var10002 = this.field27[var36] - 65;
                                    int var10004 = this.field29[this.field27[var36] - 65];
                                    this.field29[var10002] = this.field29[this.field27[var36] - 65] + 1;
                                    var10000[var10004] = var35;
                                }
                            } else {
                                this.field31[var36][this.field27[var36]++] = var35;
                            }
                        }
                        var29 = var29.field4899;
                    }
                    if (var30 < 0) {
                        arg0.method1996(2, null);
                    } else {
                        arg0.method1996(arg1 ^ 0xFFFFF9BD, arg0.field4729.method2112(-3594, var30));
                        arg0.method1974(arg0.field471.method1654(arg1 + 1696, var30).field2500, arg1 + 6210);
                    }
                    if (var31 && class10.field152 != arg0.field4825) {
                        arg0.method252(class10.field152);
                    } else if (arg0.field4825 != 1.0F) {
                        arg0.method252(1.0F);
                    }
                    this.method10(-99, var26, arg0);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class340 var11 = arg2.field7740.field1935;
                for (class340 var12 = var11.field4899; var12 != var11; var12 = var12.field4899) {
                    class219 var13 = (class219) var12;
                    int var14 = (int) ((float) (var13.field3055 >> class255.field3542) * var6 + (float) (var13.field3053 >> class255.field3542) * var5 + (float) (var13.field3050 >> class255.field3542) * var4 + var7);
                    if (var10 < var14) {
                        var10 = var14;
                    }
                    this.field30[var8++] = var14;
                    if (var14 < var9) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if (var15 + 2 <= 1600) {
                    var15 += 2;
                    var16 = 0;
                } else {
                    var16 = 1 - (this.field25 - class285.method1698(arg1 ^ 0x63F, var15));
                    var15 = (var15 >> var16) + 2;
                }
                int var17 = 0;
                class340 var18 = var11.field4899;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var18) {
                    this.field28 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field27[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field29[var23] = 0;
                    }
                    while (var11 != var18) {
                        class219 var24 = (class219) var18;
                        if (var21) {
                            var19 = var24.field3056;
                            var21 = false;
                            var20 = var24.field3052;
                        }
                        if (var17 > 0 && (var24.field3056 != var19 || var24.field3052 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field30[var17++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field27[var25] >= 64) {
                                label184: {
                                    if (this.field27[var25] == 64) {
                                        if (this.field28 == 64) {
                                            break label184;
                                        }
                                        this.field27[var25] += (this.field28++) + 1;
                                    }
                                    this.field32[this.field27[var25] - 64 - 1][this.field29[this.field27[var25] - 64 - 1]++] = var24;
                                }
                            } else {
                                this.field31[var25][this.field27[var25]++] = var24;
                            }
                        }
                        var18 = var18.field4899;
                    }
                    if (var19 < 0) {
                        arg0.method1996(2, null);
                    } else {
                        arg0.method1996(2, arg0.field4729.method2112(-3594, var19));
                        arg0.method1974(arg0.field471.method1654(arg1 ^ 0xFFFFF9F0, var19).field2500, 4609);
                    }
                    if (var20 && class10.field152 != arg0.field4825) {
                        arg0.method252(class10.field152);
                    } else if (arg0.field4825 != 1.0F) {
                        arg0.method252(1.0F);
                    }
                    this.method10(-109, var15, arg0);
                }
            }
        } catch (Exception var37) {
        }
        this.method12(69, arg0);
    }
}
