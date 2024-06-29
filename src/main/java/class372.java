import jaggl.OpenGL;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class372 {

    @OriginalMember(owner = "client!km", name = "j", descriptor = "[F")
    private float[] field5676 = new float[16];

    @OriginalMember(owner = "client!km", name = "b", descriptor = "Ljo;")
    private class353 field5674 = new class353(786336);

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    private int field5687 = class54.method410((byte) -62, 1600);

    @OriginalMember(owner = "client!km", name = "v", descriptor = "[[Lnh;")
    private class777[][] field5689 = new class777[64][768];

    @OriginalMember(owner = "client!km", name = "f", descriptor = "I")
    private int field5692 = 0;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "[I")
    private int[] field5690 = new int[1600];

    @OriginalMember(owner = "client!km", name = "m", descriptor = "[I")
    private int[] field5693 = new int[64];

    @OriginalMember(owner = "client!km", name = "o", descriptor = "[[Lnh;")
    private class777[][] field5691 = new class777[1600][64];

    @OriginalMember(owner = "client!km", name = "e", descriptor = "[I")
    private int[] field5694 = new int[8191];

    @OriginalMember(owner = "client!km", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5695 = new String[] { method3007(method3006("'M\u001b\r\u001e")), method3007(method3006("l\r\u0015")), method3007(method3006("\u0018\u0012\u0015a\u0016")), method3007(method3006("\"UY ")), method3007(method3006("'M\u001b\t\u001e")), method3007(method3006("7\u000e\u001bbK")), method3007(method3006("'M\u001b\u000e\u001e")), method3007(method3006("'M\u001b\u000b\u001e")), method3007(method3006("'M\u001b\u0004\u001e")), method3007(method3006("'M\u001b\u000f\u001e")), method3007(method3006("'M\u001b\n\u001e")), method3007(method3006("'M\u001b\b\u001e")) };

    @OriginalMember(owner = "client!km", name = "g", descriptor = "[J")
    public static long[] field5679 = new long[11];

    @OriginalMember(owner = "client!km", name = "c", descriptor = "[[J")
    public static long[][] field5683 = new long[8][256];

    @OriginalMember(owner = "client!km", name = "h", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "I")
    public static int field5675;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "I")
    public static int field5678;

    @OriginalMember(owner = "client!km", name = "i", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "Lml;")
    private class407 field5684;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "Luo;")
    private class602 field5685;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "Luo;")
    private class602 field5686;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "Luo;")
    private class602 field5688;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLffa;ILjw;)V")
    public final void method2998(byte arg0, class197 arg1, int arg2, class580 arg3) {
        try {
            field5681++;
            if (arg1.field2882 != null) {
                if (arg2 >= 0) {
                    this.method3001(arg2, -8, arg1);
                } else {
                    this.method3002((byte) -87, arg1);
                }
                float var5 = arg1.field2882.field11105;
                float var6 = arg1.field2882.field11125;
                float var7 = arg1.field2882.field11095;
                float var8 = arg1.field2882.field11128;
                if (arg0 < -28) {
                    try {
                        int var9 = 0;
                        int var10 = Integer.MAX_VALUE;
                        int var11 = 0;
                        class215 var12 = arg3.field8599.field7437;
                        for (class215 var13 = var12.field3274; var13 != var12; var13 = var13.field3274) {
                            class777 var14 = (class777) var13;
                            int var15 = (int) ((float) (var14.field11290 >> 12) * var7 + (float) (var14.field11291 >> 12) * var6 + (float) (var14.field11286 >> 12) * var5 + var8);
                            if (var10 > var15) {
                                var10 = var15;
                            }
                            if (var11 < var15) {
                                var11 = var15;
                            }
                            this.field5694[var9++] = var15;
                        }
                        int var16 = var11 - var10;
                        int var17;
                        if ((var16 + 2) <= 1600) {
                            var16 += 2;
                            var17 = 0;
                        } else {
                            var17 = class54.method410((byte) -102, var16) + 1 - this.field5687;
                            var16 = (var16 >> var17) + 2;
                        }
                        class215 var18 = var12.field3274;
                        int var19 = 0;
                        int var20 = -2;
                        boolean var21 = true;
                        boolean var22 = true;
                        while (var12 != var18) {
                            this.field5692 = 0;
                            for (int var23 = 0; var23 < var16; var23++) {
                                this.field5690[var23] = 0;
                            }
                            for (int var24 = 0; var24 < 64; var24++) {
                                this.field5693[var24] = 0;
                            }
                            while (var12 != var18) {
                                class777 var25 = (class777) var18;
                                if (var22) {
                                    var20 = var25.field11282;
                                    var22 = false;
                                    var21 = var25.field11283;
                                }
                                if (var19 > 0 && (var25.field11282 != var20 || var21 != var25.field11283)) {
                                    var22 = true;
                                    break;
                                }
                                int var26 = this.field5694[var19++] - var10 >> var17;
                                if (var26 < 1600) {
                                    if (this.field5690[var26] < 64) {
                                        this.field5691[var26][this.field5690[var26]++] = var25;
                                    } else {
                                        label137: {
                                            if (this.field5690[var26] == 64) {
                                                if (this.field5692 == 64) {
                                                    break label137;
                                                }
                                                this.field5690[var26] += this.field5692++ + 1;
                                            }
                                            this.field5689[this.field5690[var26] - 1 - 64][this.field5693[this.field5690[var26] - 1 - 64]++] = var25;
                                        }
                                    }
                                }
                                var18 = var18.field3274;
                            }
                            if (var20 >= 0) {
                                arg1.method1729((byte) -101, var20);
                            } else {
                                arg1.method1729((byte) -101, -1);
                            }
                            if (var21 && class493.field7085 != arg1.field2965) {
                                arg1.method526(class493.field7085);
                            } else if (arg1.field2965 != 1.0F) {
                                arg1.method526(1.0F);
                            }
                            this.method3004(var16, arg1, -10);
                        }
                    } catch (Exception var28) {
                    }
                    this.method3000(-2, arg1);
                }
            }
        } catch (RuntimeException var29) {
            throw class759.method5498(var29, field5695[11] + arg0 + ',' + (arg1 == null ? field5695[3] : field5695[5]) + ',' + arg2 + ',' + (arg3 == null ? field5695[3] : field5695[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)Z")
    public static final boolean method2999(byte arg0) {
        try {
            field5678++;
            try {
                if (arg0 >= -23) {
                    method2999((byte) 55);
                }
                return class461.method3510(true);
            } catch (IOException var5) {
                class95.method805(7);
                return true;
            } catch (Exception var6) {
                String var2 = field5695[2] + (class662.field9567 == null ? -1 : class662.field9567.method4278(-127)) + "," + (class6.field68 == null ? -1 : class6.field68.method4278(-127)) + "," + (class70.field750 == null ? -1 : class70.field750.method4278(-110)) + field5695[1] + class476.field6930 + "," + (class494.field7101 + class225.field3446.field3859[0]) + "," + (class225.field3446.field3863[0] + class281.field4219) + field5695[1];
                for (int var3 = 0; var3 < class476.field6930 && var3 < 50; var3++) {
                    var2 = var2 + class430.field6332.field2209[var3] + ",";
                }
                class618.method4603((byte) -124, var2, var6);
                class220.method1920(0, false);
                return true;
            }
        } catch (RuntimeException var7) {
            throw class759.method5498(var7, field5695[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILffa;)V")
    private final void method3000(int arg0, class197 arg1) {
        try {
            arg1.method1680(true, arg0 - 30);
            field5682++;
            OpenGL.glEnable(16384);
            OpenGL.glEnable(16385);
            if (arg0 != -2) {
                this.method3005((byte) -63, null);
            }
            if (class493.field7085 != arg1.field2965) {
                arg1.method526(class493.field7085);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5695[7] + arg0 + ',' + (arg1 == null ? field5695[3] : field5695[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(IILffa;)V")
    private final void method3001(int arg0, int arg1, class197 arg2) {
        try {
            class493.field7085 = arg2.field2965;
            int var4 = -24 % ((arg1 + 82) / 37);
            field5677++;
            arg2.method1754((byte) -67, (float) arg0);
            arg2.method1697(false);
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
            arg2.method1680(false, -32);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field5695[9] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5695[3] : field5695[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(BLffa;)V")
    private final void method3002(byte arg0, class197 arg1) {
        try {
            class493.field7085 = arg1.field2965;
            if (arg0 > -28) {
                this.method3005((byte) -38, null);
            }
            field5673++;
            arg1.method1704((byte) -103);
            OpenGL.glDisable(16384);
            OpenGL.glDisable(16385);
            arg1.method1680(false, -32);
            OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field5695[10] + arg0 + ',' + (arg1 == null ? field5695[3] : field5695[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(B)V")
    public static void method3003(byte arg0) {
        try {
            if (arg0 == 65) {
                field5679 = null;
                field5683 = null;
            }
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field5695[6] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ILffa;I)V")
    private final void method3004(int arg0, class197 arg1, int arg2) {
        try {
            OpenGL.glGetFloatv(2982, this.field5676, 0);
            int var4 = 26 / ((81 - arg2) / 37);
            field5680++;
            float var5 = this.field5676[0];
            float var6 = this.field5676[4];
            float var7 = this.field5676[8];
            float var8 = this.field5676[1];
            float var9 = this.field5676[5];
            float var10 = this.field5676[9];
            float var11 = var5 + var8;
            float var12 = var6 + var9;
            float var13 = var7 + var10;
            float var14 = var5 - var8;
            float var15 = var6 - var9;
            float var16 = var7 - var10;
            float var17 = var8 - var5;
            float var18 = var9 - var6;
            this.field5674.field2201 = 0;
            float var19 = var10 - var7;
            if (arg1.field2922) {
                for (int var45 = arg0 - 1; var45 >= 0; var45--) {
                    int var46 = this.field5690[var45] <= 64 ? this.field5690[var45] : 64;
                    if (var46 > 0) {
                        for (int var47 = var46 - 1; var47 >= 0; var47--) {
                            class777 var48 = this.field5691[var45][var47];
                            int var49 = var48.field11285;
                            byte var50 = (byte) (var49 >> 16);
                            byte var51 = (byte) (var49 >> 8);
                            byte var52 = (byte) var49;
                            byte var53 = (byte) (var49 >>> 24);
                            float var54 = (float) (var48.field11286 >> 12);
                            float var55 = (float) (var48.field11291 >> 12);
                            float var56 = (float) (var48.field11290 >> 12);
                            int var57 = var48.field11289 >> 12;
                            this.field5674.method2890(0.0F, (byte) -21);
                            this.field5674.method2890(0.0F, (byte) -22);
                            this.field5674.method2890((float) (-var57) * var11 + var54, (byte) 44);
                            this.field5674.method2890((float) (-var57) * var12 + var55, (byte) 18);
                            this.field5674.method2890((float) (-var57) * var13 + var56, (byte) -8);
                            this.field5674.method1428((byte) -24, var50);
                            this.field5674.method1428((byte) -24, var51);
                            this.field5674.method1428((byte) -24, var52);
                            this.field5674.method1428((byte) -24, var53);
                            this.field5674.method2890(1.0F, (byte) -121);
                            this.field5674.method2890(0.0F, (byte) 94);
                            this.field5674.method2890((float) var57 * var14 + var54, (byte) -14);
                            this.field5674.method2890((float) var57 * var15 + var55, (byte) 6);
                            this.field5674.method2890((float) var57 * var16 + var56, (byte) 21);
                            this.field5674.method1428((byte) -24, var50);
                            this.field5674.method1428((byte) -24, var51);
                            this.field5674.method1428((byte) -24, var52);
                            this.field5674.method1428((byte) -24, var53);
                            this.field5674.method2890(1.0F, (byte) -104);
                            this.field5674.method2890(1.0F, (byte) 103);
                            this.field5674.method2890((float) var57 * var11 + var54, (byte) -105);
                            this.field5674.method2890((float) var57 * var12 + var55, (byte) -113);
                            this.field5674.method2890((float) var57 * var13 + var56, (byte) -14);
                            this.field5674.method1428((byte) -24, var50);
                            this.field5674.method1428((byte) -24, var51);
                            this.field5674.method1428((byte) -24, var52);
                            this.field5674.method1428((byte) -24, var53);
                            this.field5674.method2890(0.0F, (byte) -108);
                            this.field5674.method2890(1.0F, (byte) -123);
                            this.field5674.method2890((float) var57 * var17 + var54, (byte) -109);
                            this.field5674.method2890((float) var57 * var18 + var55, (byte) 83);
                            this.field5674.method2890((float) var57 * var19 + var56, (byte) -18);
                            this.field5674.method1428((byte) -24, var50);
                            this.field5674.method1428((byte) -24, var51);
                            this.field5674.method1428((byte) -24, var52);
                            this.field5674.method1428((byte) -24, var53);
                        }
                        if (this.field5690[var45] > 64) {
                            int var58 = this.field5690[var45] - 1 - 64;
                            for (int var59 = this.field5693[var58] - 1; var59 >= 0; var59--) {
                                class777 var60 = this.field5689[var58][var59];
                                int var61 = var60.field11285;
                                byte var62 = (byte) (var61 >> 16);
                                byte var63 = (byte) (var61 >> 8);
                                byte var64 = (byte) var61;
                                byte var65 = (byte) (var61 >>> 24);
                                float var66 = (float) (var60.field11286 >> 12);
                                float var67 = (float) (var60.field11291 >> 12);
                                float var68 = (float) (var60.field11290 >> 12);
                                int var69 = var60.field11289 >> 12;
                                this.field5674.method2890(0.0F, (byte) 20);
                                this.field5674.method2890(0.0F, (byte) 31);
                                this.field5674.method2890((float) (-var69) * var11 + var66, (byte) 41);
                                this.field5674.method2890((float) (-var69) * var12 + var67, (byte) -127);
                                this.field5674.method2890((float) (-var69) * var13 + var68, (byte) -111);
                                this.field5674.method1428((byte) -24, var62);
                                this.field5674.method1428((byte) -24, var63);
                                this.field5674.method1428((byte) -24, var64);
                                this.field5674.method1428((byte) -24, var65);
                                this.field5674.method2890(1.0F, (byte) 1);
                                this.field5674.method2890(0.0F, (byte) -120);
                                this.field5674.method2890((float) var69 * var14 + var66, (byte) -115);
                                this.field5674.method2890((float) var69 * var15 + var67, (byte) -98);
                                this.field5674.method2890((float) var69 * var16 + var68, (byte) -97);
                                this.field5674.method1428((byte) -24, var62);
                                this.field5674.method1428((byte) -24, var63);
                                this.field5674.method1428((byte) -24, var64);
                                this.field5674.method1428((byte) -24, var65);
                                this.field5674.method2890(1.0F, (byte) -98);
                                this.field5674.method2890(1.0F, (byte) 121);
                                this.field5674.method2890((float) var69 * var11 + var66, (byte) 72);
                                this.field5674.method2890((float) var69 * var12 + var67, (byte) -123);
                                this.field5674.method2890((float) var69 * var13 + var68, (byte) -99);
                                this.field5674.method1428((byte) -24, var62);
                                this.field5674.method1428((byte) -24, var63);
                                this.field5674.method1428((byte) -24, var64);
                                this.field5674.method1428((byte) -24, var65);
                                this.field5674.method2890(0.0F, (byte) -13);
                                this.field5674.method2890(1.0F, (byte) -121);
                                this.field5674.method2890((float) var69 * var17 + var66, (byte) -122);
                                this.field5674.method2890((float) var69 * var18 + var67, (byte) -99);
                                this.field5674.method2890((float) var69 * var19 + var68, (byte) 103);
                                this.field5674.method1428((byte) -24, var62);
                                this.field5674.method1428((byte) -24, var63);
                                this.field5674.method1428((byte) -24, var64);
                                this.field5674.method1428((byte) -24, var65);
                            }
                        }
                    }
                }
            } else {
                for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                    int var21 = this.field5690[var20] <= 64 ? this.field5690[var20] : 64;
                    if (var21 > 0) {
                        for (int var22 = var21 - 1; var22 >= 0; var22--) {
                            class777 var23 = this.field5691[var20][var22];
                            int var24 = var23.field11285;
                            byte var25 = (byte) (var24 >> 16);
                            byte var26 = (byte) (var24 >> 8);
                            byte var27 = (byte) var24;
                            byte var28 = (byte) (var24 >>> 24);
                            float var29 = (float) (var23.field11286 >> 12);
                            float var30 = (float) (var23.field11291 >> 12);
                            float var31 = (float) (var23.field11290 >> 12);
                            int var32 = var23.field11289 >> 12;
                            this.field5674.method2892(-1335387932, 0.0F);
                            this.field5674.method2892(-1335387932, 0.0F);
                            this.field5674.method2892(-1335387932, (float) (-var32) * var11 + var29);
                            this.field5674.method2892(-1335387932, (float) (-var32) * var12 + var30);
                            this.field5674.method2892(-1335387932, (float) (-var32) * var13 + var31);
                            this.field5674.method1428((byte) -24, var25);
                            this.field5674.method1428((byte) -24, var26);
                            this.field5674.method1428((byte) -24, var27);
                            this.field5674.method1428((byte) -24, var28);
                            this.field5674.method2892(-1335387932, 1.0F);
                            this.field5674.method2892(-1335387932, 0.0F);
                            this.field5674.method2892(-1335387932, (float) var32 * var14 + var29);
                            this.field5674.method2892(-1335387932, (float) var32 * var15 + var30);
                            this.field5674.method2892(-1335387932, (float) var32 * var16 + var31);
                            this.field5674.method1428((byte) -24, var25);
                            this.field5674.method1428((byte) -24, var26);
                            this.field5674.method1428((byte) -24, var27);
                            this.field5674.method1428((byte) -24, var28);
                            this.field5674.method2892(-1335387932, 1.0F);
                            this.field5674.method2892(-1335387932, 1.0F);
                            this.field5674.method2892(-1335387932, (float) var32 * var11 + var29);
                            this.field5674.method2892(-1335387932, (float) var32 * var12 + var30);
                            this.field5674.method2892(-1335387932, (float) var32 * var13 + var31);
                            this.field5674.method1428((byte) -24, var25);
                            this.field5674.method1428((byte) -24, var26);
                            this.field5674.method1428((byte) -24, var27);
                            this.field5674.method1428((byte) -24, var28);
                            this.field5674.method2892(-1335387932, 0.0F);
                            this.field5674.method2892(-1335387932, 1.0F);
                            this.field5674.method2892(-1335387932, (float) var32 * var17 + var29);
                            this.field5674.method2892(-1335387932, (float) var32 * var18 + var30);
                            this.field5674.method2892(-1335387932, (float) var32 * var19 + var31);
                            this.field5674.method1428((byte) -24, var25);
                            this.field5674.method1428((byte) -24, var26);
                            this.field5674.method1428((byte) -24, var27);
                            this.field5674.method1428((byte) -24, var28);
                        }
                        if (this.field5690[var20] > 64) {
                            int var33 = this.field5690[var20] - 65;
                            for (int var34 = this.field5693[var33] - 1; var34 >= 0; var34--) {
                                class777 var35 = this.field5689[var33][var34];
                                int var36 = var35.field11285;
                                byte var37 = (byte) (var36 >> 16);
                                byte var38 = (byte) (var36 >> 8);
                                byte var39 = (byte) var36;
                                byte var40 = (byte) (var36 >>> 24);
                                float var41 = (float) (var35.field11286 >> 12);
                                float var42 = (float) (var35.field11291 >> 12);
                                float var43 = (float) (var35.field11290 >> 12);
                                int var44 = var35.field11289 >> 12;
                                this.field5674.method2892(-1335387932, 0.0F);
                                this.field5674.method2892(-1335387932, 0.0F);
                                this.field5674.method2892(-1335387932, (float) (-var44) * var11 + var41);
                                this.field5674.method2892(-1335387932, (float) (-var44) * var12 + var42);
                                this.field5674.method2892(-1335387932, (float) (-var44) * var13 + var43);
                                this.field5674.method1428((byte) -24, var37);
                                this.field5674.method1428((byte) -24, var38);
                                this.field5674.method1428((byte) -24, var39);
                                this.field5674.method1428((byte) -24, var40);
                                this.field5674.method2892(-1335387932, 1.0F);
                                this.field5674.method2892(-1335387932, 0.0F);
                                this.field5674.method2892(-1335387932, (float) var44 * var14 + var41);
                                this.field5674.method2892(-1335387932, (float) var44 * var15 + var42);
                                this.field5674.method2892(-1335387932, (float) var44 * var16 + var43);
                                this.field5674.method1428((byte) -24, var37);
                                this.field5674.method1428((byte) -24, var38);
                                this.field5674.method1428((byte) -24, var39);
                                this.field5674.method1428((byte) -24, var40);
                                this.field5674.method2892(-1335387932, 1.0F);
                                this.field5674.method2892(-1335387932, 1.0F);
                                this.field5674.method2892(-1335387932, (float) var44 * var11 + var41);
                                this.field5674.method2892(-1335387932, (float) var44 * var12 + var42);
                                this.field5674.method2892(-1335387932, (float) var44 * var13 + var43);
                                this.field5674.method1428((byte) -24, var37);
                                this.field5674.method1428((byte) -24, var38);
                                this.field5674.method1428((byte) -24, var39);
                                this.field5674.method1428((byte) -24, var40);
                                this.field5674.method2892(-1335387932, 0.0F);
                                this.field5674.method2892(-1335387932, 1.0F);
                                this.field5674.method2892(-1335387932, (float) var44 * var17 + var41);
                                this.field5674.method2892(-1335387932, (float) var44 * var18 + var42);
                                this.field5674.method2892(-1335387932, (float) var44 * var19 + var43);
                                this.field5674.method1428((byte) -24, var37);
                                this.field5674.method1428((byte) -24, var38);
                                this.field5674.method1428((byte) -24, var39);
                                this.field5674.method1428((byte) -24, var40);
                            }
                        }
                    }
                }
            }
            if (this.field5674.field2201 != 0) {
                this.field5684.method3186((byte) -82, 24, this.field5674.field2209, this.field5674.field2201);
                arg1.method1724(null, this.field5686, 2916, this.field5685, this.field5688);
                arg1.method1678(0, this.field5674.field2201 / 24, (byte) 98, 7);
            }
        } catch (RuntimeException var71) {
            throw class759.method5498(var71, field5695[4] + arg0 + ',' + (arg1 == null ? field5695[3] : field5695[5]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BLffa;)V")
    public final void method3005(byte arg0, class197 arg1) {
        try {
            field5675++;
            this.field5684 = arg1.method1682((byte) -38, 196584, true, 24, null);
            this.field5688 = new class602(this.field5684, 5126, 2, 0);
            this.field5686 = new class602(this.field5684, 5126, 3, 8);
            this.field5685 = new class602(this.field5684, 5121, 4, 20);
            int var3 = 77 / ((15 - arg0) / 54);
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5695[8] + arg0 + ',' + (arg1 == null ? field5695[3] : field5695[5]) + ')');
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = method3007(method3006("ᡯ웈融ă㚐특祏酧惰鮸ꍀ笕ᷕ힎\u2e7d\ufe1bᕗ㟐龼䫬墅⤪놕毉뵫Ⴘ쬞Ւ\ue46b䆽ꜱ闸ﯛ簪\udd21䟒쨍뼲괖茅捎꩑젬䦕\uf2d5寄騆㊅\ue943햶뺁㑨ｏ逓⁞\u1ae2둴錗撽猤䁄쏌\udb94赱霶콧皢혮뗣橦䖿ハ㽠ꊦ斌⾌\ude3cﵸ鈹ڼ늪฿拡\ua8da麟┕葒㥹帴㢺퇩\ue241댔鱒䏱ﱈ冹洸望縒㯧츱轻랧㲷钻뤳⳦\ue722쐵嘈羉⪎섟\udc3d鴠ㅔ\uf673곅ᓗᙶ椩炃킡챴飨⡼\uf8b3")).charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field5683[0][var0] = class526.method3981(class526.method3981(var6 << 8, class526.method3981(class526.method3981(var12 << 24, class526.method3981(var4 << 32, class526.method3981(var8 << 40, class526.method3981(var4 << 48, var4 << 56)))), var10 << 16)), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field5683[var16][var0] = class526.method3981(field5683[var16 - 1][var0] >>> 8, field5683[var16 - 1][var0] << 56);
            }
        }
        field5679[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field5679[var1] = class416.method3233(class416.method3233(class416.method3233(class416.method3233(class9.method63(4278190080L, field5683[4][var2 + 4]), class416.method3233(class9.method63(1095216660480L, field5683[3][var2 + 3]), class416.method3233(class416.method3233(class9.method63(field5683[1][var2 + 1], 71776119061217280L), class9.method63(field5683[0][var2], -72057594037927936L)), class9.method63(280375465082880L, field5683[2][var2 + 2])))), class9.method63(16711680L, field5683[5][var2 + 5])), class9.method63(field5683[6][var2 + 6], 65280L)), class9.method63(255L, field5683[7][var2 + 7]));
        }
    }

    @OriginalMember(owner = "client!km", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3006(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x36);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!km", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3007(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 76;
                    break;
                case 1:
                    var10005 = 32;
                    break;
                case 2:
                    var10005 = 53;
                    break;
                case 3:
                    var10005 = 76;
                    break;
                default:
                    var10005 = 54;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
