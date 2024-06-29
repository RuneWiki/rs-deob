import jaggl.OpenGL;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class161 {

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "[F")
    private float[] field2558 = new float[16];

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "Lnga;")
    private class538 field2553 = new class538(786336);

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    private int field2563 = class89.method668(1600, (byte) 45);

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "[[Lon;")
    private class354[][] field2569 = new class354[64][768];

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "[I")
    private int[] field2573 = new int[64];

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "[[Lon;")
    private class354[][] field2570 = new class354[1600][64];

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "[I")
    private int[] field2572 = new int[1600];

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    private int field2568 = 0;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "[I")
    private int[] field2571 = new int[8191];

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lne;")
    public static class336 field2549 = new class336("INTBETA", "office", "_intbeta", 6);

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "[Leo;")
    public static class312[] field2562 = new class312[300];

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "Lei;")
    private class189 field2564;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Lei;")
    private class189 field2565;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "Lei;")
    private class189 field2567;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Ljc;")
    public static class462 field2559;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Lgda;")
    private class61 field2566;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "Lraa;")
    public static class632 field2550;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "Ljava/awt/Frame;")
    public static Frame field2561;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lqfa;B)V")
    private final void method1213(class106 arg0, byte arg1) {
        arg0.method791(true, true);
        field2555++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class254.field3740 != arg0.field1543) {
            arg0.method515(class254.field3740);
        }
        if (arg1 > -47) {
            this.method1220((byte) 50, null);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method1214(int arg0) {
        field2559 = null;
        field2550 = null;
        field2549 = null;
        field2561 = null;
        field2562 = null;
        if (arg0 != 840653224) {
            field2562 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILqfa;Z)V")
    private final void method1215(int arg0, class106 arg1, boolean arg2) {
        field2557++;
        OpenGL.glGetFloatv(2982, this.field2558, 0);
        float var4 = this.field2558[0];
        float var5 = this.field2558[4];
        float var6 = this.field2558[8];
        float var7 = this.field2558[1];
        float var8 = this.field2558[5];
        float var9 = this.field2558[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        if (!arg2) {
            this.field2558 = null;
        }
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field2553.field7042 = 0;
        float var18 = var9 - var6;
        if (arg1.field1514) {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field2572[var44] <= 64 ? this.field2572[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class354 var59 = this.field2570[var44][var46];
                        int var60 = var59.field4988;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field4979 >> 12);
                        float var66 = (float) (var59.field4976 >> 12);
                        float var67 = (float) (var59.field4986 >> 12);
                        int var68 = var59.field4985 >> 12;
                        this.field2553.method3229(0.0F, (byte) 113);
                        this.field2553.method3229(0.0F, (byte) 117);
                        this.field2553.method3229((float) (-var68) * var10 + var65, (byte) 76);
                        this.field2553.method3229((float) (-var68) * var11 + var66, (byte) 94);
                        this.field2553.method3229((float) (-var68) * var12 + var67, (byte) 72);
                        this.field2553.method2952(0, var61);
                        this.field2553.method2952(0, var62);
                        this.field2553.method2952(0, var63);
                        this.field2553.method2952(0, var64);
                        this.field2553.method3229(1.0F, (byte) 64);
                        this.field2553.method3229(0.0F, (byte) 103);
                        this.field2553.method3229((float) var68 * var13 + var65, (byte) 71);
                        this.field2553.method3229((float) var68 * var14 + var66, (byte) 107);
                        this.field2553.method3229((float) var68 * var15 + var67, (byte) 88);
                        this.field2553.method2952(0, var61);
                        this.field2553.method2952(0, var62);
                        this.field2553.method2952(0, var63);
                        this.field2553.method2952(0, var64);
                        this.field2553.method3229(1.0F, (byte) 68);
                        this.field2553.method3229(1.0F, (byte) 53);
                        this.field2553.method3229((float) var68 * var10 + var65, (byte) 97);
                        this.field2553.method3229((float) var68 * var11 + var66, (byte) 123);
                        this.field2553.method3229((float) var68 * var12 + var67, (byte) 82);
                        this.field2553.method2952(0, var61);
                        this.field2553.method2952(0, var62);
                        this.field2553.method2952(0, var63);
                        this.field2553.method2952(0, var64);
                        this.field2553.method3229(0.0F, (byte) 122);
                        this.field2553.method3229(1.0F, (byte) 100);
                        this.field2553.method3229((float) var68 * var16 + var65, (byte) 93);
                        this.field2553.method3229((float) var68 * var17 + var66, (byte) 106);
                        this.field2553.method3229((float) var68 * var18 + var67, (byte) 49);
                        this.field2553.method2952(0, var61);
                        this.field2553.method2952(0, var62);
                        this.field2553.method2952(0, var63);
                        this.field2553.method2952(0, var64);
                    }
                    if (this.field2572[var44] > 64) {
                        int var47 = this.field2572[var44] - 65;
                        for (int var48 = this.field2573[var47] - 1; var48 >= 0; var48--) {
                            class354 var49 = this.field2569[var47][var48];
                            int var50 = var49.field4988;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field4979 >> 12);
                            float var56 = (float) (var49.field4976 >> 12);
                            float var57 = (float) (var49.field4986 >> 12);
                            int var58 = var49.field4985 >> 12;
                            this.field2553.method3229(0.0F, (byte) 71);
                            this.field2553.method3229(0.0F, (byte) 69);
                            this.field2553.method3229((float) (-var58) * var10 + var55, (byte) 124);
                            this.field2553.method3229((float) (-var58) * var11 + var56, (byte) 119);
                            this.field2553.method3229((float) (-var58) * var12 + var57, (byte) 99);
                            this.field2553.method2952(0, var51);
                            this.field2553.method2952(0, var52);
                            this.field2553.method2952(0, var53);
                            this.field2553.method2952(0, var54);
                            this.field2553.method3229(1.0F, (byte) 96);
                            this.field2553.method3229(0.0F, (byte) 109);
                            this.field2553.method3229((float) var58 * var13 + var55, (byte) 74);
                            this.field2553.method3229((float) var58 * var14 + var56, (byte) 119);
                            this.field2553.method3229((float) var58 * var15 + var57, (byte) 62);
                            this.field2553.method2952(0, var51);
                            this.field2553.method2952(0, var52);
                            this.field2553.method2952(0, var53);
                            this.field2553.method2952(0, var54);
                            this.field2553.method3229(1.0F, (byte) 61);
                            this.field2553.method3229(1.0F, (byte) 64);
                            this.field2553.method3229((float) var58 * var10 + var55, (byte) 113);
                            this.field2553.method3229((float) var58 * var11 + var56, (byte) 116);
                            this.field2553.method3229((float) var58 * var12 + var57, (byte) 49);
                            this.field2553.method2952(0, var51);
                            this.field2553.method2952(0, var52);
                            this.field2553.method2952(0, var53);
                            this.field2553.method2952(0, var54);
                            this.field2553.method3229(0.0F, (byte) 72);
                            this.field2553.method3229(1.0F, (byte) 80);
                            this.field2553.method3229((float) var58 * var16 + var55, (byte) 123);
                            this.field2553.method3229((float) var58 * var17 + var56, (byte) 84);
                            this.field2553.method3229((float) var58 * var18 + var57, (byte) 97);
                            this.field2553.method2952(0, var51);
                            this.field2553.method2952(0, var52);
                            this.field2553.method2952(0, var53);
                            this.field2553.method2952(0, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field2572[var19] > 64 ? 64 : this.field2572[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class354 var34 = this.field2570[var19][var21];
                        int var35 = var34.field4988;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field4979 >> 12);
                        float var41 = (float) (var34.field4976 >> 12);
                        float var42 = (float) (var34.field4986 >> 12);
                        int var43 = var34.field4985 >> 12;
                        this.field2553.method3232(0.0F, arg2);
                        this.field2553.method3232(0.0F, true);
                        this.field2553.method3232((float) (-var43) * var10 + var40, true);
                        this.field2553.method3232((float) (-var43) * var11 + var41, true);
                        this.field2553.method3232((float) (-var43) * var12 + var42, true);
                        this.field2553.method2952(0, var36);
                        this.field2553.method2952(0, var37);
                        this.field2553.method2952(0, var38);
                        this.field2553.method2952(0, var39);
                        this.field2553.method3232(1.0F, true);
                        this.field2553.method3232(0.0F, true);
                        this.field2553.method3232((float) var43 * var13 + var40, true);
                        this.field2553.method3232((float) var43 * var14 + var41, true);
                        this.field2553.method3232((float) var43 * var15 + var42, true);
                        this.field2553.method2952(0, var36);
                        this.field2553.method2952(0, var37);
                        this.field2553.method2952(0, var38);
                        this.field2553.method2952(0, var39);
                        this.field2553.method3232(1.0F, true);
                        this.field2553.method3232(1.0F, true);
                        this.field2553.method3232((float) var43 * var10 + var40, true);
                        this.field2553.method3232((float) var43 * var11 + var41, true);
                        this.field2553.method3232((float) var43 * var12 + var42, true);
                        this.field2553.method2952(0, var36);
                        this.field2553.method2952(0, var37);
                        this.field2553.method2952(0, var38);
                        this.field2553.method2952(0, var39);
                        this.field2553.method3232(0.0F, true);
                        this.field2553.method3232(1.0F, true);
                        this.field2553.method3232((float) var43 * var16 + var40, true);
                        this.field2553.method3232((float) var43 * var17 + var41, true);
                        this.field2553.method3232((float) var43 * var18 + var42, true);
                        this.field2553.method2952(0, var36);
                        this.field2553.method2952(0, var37);
                        this.field2553.method2952(0, var38);
                        this.field2553.method2952(0, var39);
                    }
                    if (this.field2572[var19] > 64) {
                        int var22 = this.field2572[var19] - 65;
                        for (int var23 = this.field2573[var22] - 1; var23 >= 0; var23--) {
                            class354 var24 = this.field2569[var22][var23];
                            int var25 = var24.field4988;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field4979 >> 12);
                            float var31 = (float) (var24.field4976 >> 12);
                            float var32 = (float) (var24.field4986 >> 12);
                            int var33 = var24.field4985 >> 12;
                            this.field2553.method3232(0.0F, arg2);
                            this.field2553.method3232(0.0F, true);
                            this.field2553.method3232((float) (-var33) * var10 + var30, arg2);
                            this.field2553.method3232((float) (-var33) * var11 + var31, true);
                            this.field2553.method3232((float) (-var33) * var12 + var32, true);
                            this.field2553.method2952(0, var26);
                            this.field2553.method2952(0, var27);
                            this.field2553.method2952(0, var28);
                            this.field2553.method2952(0, var29);
                            this.field2553.method3232(1.0F, arg2);
                            this.field2553.method3232(0.0F, arg2);
                            this.field2553.method3232((float) var33 * var13 + var30, true);
                            this.field2553.method3232((float) var33 * var14 + var31, arg2);
                            this.field2553.method3232((float) var33 * var15 + var32, true);
                            this.field2553.method2952(0, var26);
                            this.field2553.method2952(0, var27);
                            this.field2553.method2952(0, var28);
                            this.field2553.method2952(0, var29);
                            this.field2553.method3232(1.0F, true);
                            this.field2553.method3232(1.0F, true);
                            this.field2553.method3232((float) var33 * var10 + var30, true);
                            this.field2553.method3232((float) var33 * var11 + var31, true);
                            this.field2553.method3232((float) var33 * var12 + var32, true);
                            this.field2553.method2952(0, var26);
                            this.field2553.method2952(0, var27);
                            this.field2553.method2952(0, var28);
                            this.field2553.method2952(0, var29);
                            this.field2553.method3232(0.0F, true);
                            this.field2553.method3232(1.0F, arg2);
                            this.field2553.method3232((float) var33 * var16 + var30, arg2);
                            this.field2553.method3232((float) var33 * var17 + var31, true);
                            this.field2553.method3232((float) var33 * var18 + var32, true);
                            this.field2553.method2952(0, var26);
                            this.field2553.method2952(0, var27);
                            this.field2553.method2952(0, var28);
                            this.field2553.method2952(0, var29);
                        }
                    }
                }
            }
        }
        if (this.field2553.field7042 != 0) {
            this.field2566.method410(this.field2553.field7042, -9859, 24, this.field2553.field7050);
            arg1.method754(this.field2564, this.field2567, 109, this.field2565, null);
            arg1.method775((byte) -69, 0, 7, this.field2553.field7042 / 24);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(ZILqfa;Lkd;)V")
    public final void method1216(boolean arg0, int arg1, class106 arg2, class296 arg3) {
        field2556++;
        if (arg2.field1468 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method1218(arg1, (byte) 47, arg2);
        } else {
            this.method1220((byte) -26, arg2);
        }
        float var5 = arg2.field1468.field8853;
        float var6 = arg2.field1468.field8833;
        float var7 = arg2.field1468.field8850;
        float var8 = arg2.field1468.field8824;
        if (arg0) {
            method1217(-95, (byte) -90, 48);
        }
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class745 var12 = arg3.field4304.field10683;
            for (class745 var13 = var12.field10320; var13 != var12; var13 = var13.field10320) {
                class354 var14 = (class354) var13;
                int var15 = (int) ((float) (var14.field4986 >> 12) * var7 + (float) (var14.field4979 >> 12) * var5 + (float) (var14.field4976 >> 12) * var6 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                this.field2571[var9++] = var15;
                if (var15 < var10) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var16 += 2;
                var17 = 0;
            } else {
                var17 = 1 - (this.field2563 - class89.method668(var16, (byte) 45));
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class745 var19 = var12.field10320;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field2568 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field2572[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field2573[var24] = 0;
                }
                while (var12 != var19) {
                    class354 var25 = (class354) var19;
                    if (var22) {
                        var22 = false;
                        var20 = var25.field4987;
                        var21 = var25.field4982;
                    }
                    if (var18 > 0 && (var25.field4987 != var20 || var21 != var25.field4982)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field2571[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field2572[var26] >= 64) {
                            label107: {
                                if (this.field2572[var26] == 64) {
                                    if (this.field2568 == 64) {
                                        break label107;
                                    }
                                    this.field2572[var26] += (this.field2568++) + 1;
                                }
                                class354[] var28 = this.field2569[this.field2572[var26] - 64 - 1];
                                int var10002 = this.field2572[var26] - 65;
                                int var10004 = this.field2573[this.field2572[var26] - 65];
                                this.field2573[var10002] = this.field2573[this.field2572[var26] - 65] + 1;
                                var28[var10004] = var25;
                            }
                        } else {
                            this.field2570[var26][this.field2572[var26]++] = var25;
                        }
                    }
                    var19 = var19.field10320;
                }
                if (var20 >= 0) {
                    arg2.method747(var20, -2142656808);
                } else {
                    arg2.method747(-1, -2142656808);
                }
                if (var21 && class254.field3740 != arg2.field1543) {
                    arg2.method515(class254.field3740);
                } else if (arg2.field1543 != 1.0F) {
                    arg2.method515(1.0F);
                }
                this.method1215(var16, arg2, !arg0);
            }
        } catch (Exception var27) {
        }
        this.method1213(arg2, (byte) -96);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1217(int arg0, byte arg1, int arg2) {
        if (arg1 != -53) {
            field2550 = null;
        }
        field2552++;
        return (arg0 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IBLqfa;)V")
    private final void method1218(int arg0, byte arg1, class106 arg2) {
        field2554++;
        class254.field3740 = arg2.field1543;
        arg2.method819(arg1 ^ 0x2C, (float) arg0);
        arg2.method777(-30909);
        OpenGL.glDisable(16384);
        if (arg1 == 47) {
            OpenGL.glDisable(16385);
            arg2.method791(false, true);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lqfa;Z)V")
    public final void method1219(class106 arg0, boolean arg1) {
        field2548++;
        this.field2566 = arg0.method794(24, true, 0, null, 196584);
        if (arg1) {
            this.field2566 = null;
        }
        this.field2567 = new class189(this.field2566, 5126, 2, 0);
        this.field2565 = new class189(this.field2566, 5126, 3, 8);
        this.field2564 = new class189(this.field2566, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLqfa;)V")
    private final void method1220(byte arg0, class106 arg1) {
        if (arg0 != -26) {
            field2549 = null;
        }
        class254.field3740 = arg1.field1543;
        field2547++;
        arg1.method767(-223);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method791(false, true);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
