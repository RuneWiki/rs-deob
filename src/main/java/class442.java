import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class442 {

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "[F")
    private float[] field6447 = new float[16];

    @OriginalMember(owner = "client!bl", name = "g", descriptor = "Lwl;")
    private class269 field6448 = new class269(786336);

    @OriginalMember(owner = "client!bl", name = "r", descriptor = "I")
    private int field6459 = class20.method146(true, 1600);

    @OriginalMember(owner = "client!bl", name = "s", descriptor = "[I")
    private int[] field6460 = new int[8191];

    @OriginalMember(owner = "client!bl", name = "w", descriptor = "[[Lmq;")
    private class335[][] field6464 = new class335[1600][64];

    @OriginalMember(owner = "client!bl", name = "v", descriptor = "[I")
    private int[] field6463 = new int[64];

    @OriginalMember(owner = "client!bl", name = "t", descriptor = "[I")
    private int[] field6461 = new int[1600];

    @OriginalMember(owner = "client!bl", name = "x", descriptor = "I")
    private int field6465 = 0;

    @OriginalMember(owner = "client!bl", name = "u", descriptor = "[[Lmq;")
    private class335[][] field6462 = new class335[64][768];

    @OriginalMember(owner = "client!bl", name = "m", descriptor = "[I")
    public static int[] field6454 = new int[32];

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Liu;")
    public static class390 field6446 = new class390(3, 10);

    @OriginalMember(owner = "client!bl", name = "y", descriptor = "Z")
    public static volatile boolean field6466 = true;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!bl", name = "i", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!bl", name = "j", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!bl", name = "k", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!bl", name = "l", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!bl", name = "o", descriptor = "Lbh;")
    private class27 field6456;

    @OriginalMember(owner = "client!bl", name = "p", descriptor = "Lbh;")
    private class27 field6457;

    @OriginalMember(owner = "client!bl", name = "q", descriptor = "Lbh;")
    private class27 field6458;

    @OriginalMember(owner = "client!bl", name = "h", descriptor = "Loi;")
    public static class49 field6449;

    @OriginalMember(owner = "client!bl", name = "n", descriptor = "Lms;")
    private class511 field6455;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLrl;I)V")
    private final void method2580(byte arg0, class487 arg1, int arg2) {
        field6453++;
        OpenGL.glGetFloatv(2982, this.field6447, 0);
        float var4 = this.field6447[0];
        float var5 = this.field6447[4];
        float var6 = this.field6447[8];
        float var7 = this.field6447[1];
        float var8 = this.field6447[5];
        float var9 = this.field6447[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        if (arg0 != 6) {
            method2584(null, true);
        }
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field6448.field2018 = 0;
        if (arg1.field7350) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field6461[var44] <= 64 ? this.field6461[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class335 var59 = this.field6464[var44][var46];
                        int var60 = var59.field4852;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field4863 >> class176.field2425);
                        float var66 = (float) (var59.field4853 >> class176.field2425);
                        float var67 = (float) (var59.field4857 >> class176.field2425);
                        int var68 = var59.field4856 >> class176.field2425;
                        this.field6448.method1646(0.0F, -136782152);
                        this.field6448.method1646(0.0F, -136782152);
                        this.field6448.method1646((float) (-var68) * var10 + var65, -136782152);
                        this.field6448.method1646((float) (-var68) * var11 + var66, -136782152);
                        this.field6448.method1646((float) (-var68) * var12 + var67, arg0 ^ 0xF7D8DEBE);
                        this.field6448.method947(-122, var61);
                        this.field6448.method947(-59, var62);
                        this.field6448.method947(-33, var63);
                        this.field6448.method947(-55, var64);
                        this.field6448.method1646(1.0F, arg0 - 136782158);
                        this.field6448.method1646(0.0F, -136782152);
                        this.field6448.method1646((float) var68 * var13 + var65, -136782152);
                        this.field6448.method1646((float) var68 * var14 + var66, -136782152);
                        this.field6448.method1646((float) var68 * var15 + var67, -136782152);
                        this.field6448.method947(-63, var61);
                        this.field6448.method947(-63, var62);
                        this.field6448.method947(arg0 ^ 0xFFFFFF89, var63);
                        this.field6448.method947(-71, var64);
                        this.field6448.method1646(1.0F, -136782152);
                        this.field6448.method1646(1.0F, -136782152);
                        this.field6448.method1646((float) var68 * var10 + var65, -136782152);
                        this.field6448.method1646((float) var68 * var11 + var66, -136782152);
                        this.field6448.method1646((float) var68 * var12 + var67, -136782152);
                        this.field6448.method947(-41, var61);
                        this.field6448.method947(arg0 ^ 0xFFFFFFA4, var62);
                        this.field6448.method947(-67, var63);
                        this.field6448.method947(-37, var64);
                        this.field6448.method1646(0.0F, arg0 ^ 0xF7D8DEBE);
                        this.field6448.method1646(1.0F, arg0 - 136782158);
                        this.field6448.method1646((float) var68 * var16 + var65, -136782152);
                        this.field6448.method1646((float) var68 * var17 + var66, -136782152);
                        this.field6448.method1646((float) var68 * var18 + var67, -136782152);
                        this.field6448.method947(-97, var61);
                        this.field6448.method947(-122, var62);
                        this.field6448.method947(-58, var63);
                        this.field6448.method947(-106, var64);
                    }
                    if (this.field6461[var44] > 64) {
                        int var47 = this.field6461[var44] - 64 - 1;
                        for (int var48 = this.field6463[var47] - 1; var48 >= 0; var48--) {
                            class335 var49 = this.field6462[var47][var48];
                            int var50 = var49.field4852;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field4863 >> class176.field2425);
                            float var56 = (float) (var49.field4853 >> class176.field2425);
                            float var57 = (float) (var49.field4857 >> class176.field2425);
                            int var58 = var49.field4856 >> class176.field2425;
                            this.field6448.method1646(0.0F, -136782152);
                            this.field6448.method1646(0.0F, -136782152);
                            this.field6448.method1646((float) (-var58) * var10 + var55, -136782152);
                            this.field6448.method1646((float) (-var58) * var11 + var56, -136782152);
                            this.field6448.method1646((float) (-var58) * var12 + var57, arg0 + -136782158);
                            this.field6448.method947(-124, var51);
                            this.field6448.method947(-91, var52);
                            this.field6448.method947(arg0 - 66, var53);
                            this.field6448.method947(-92, var54);
                            this.field6448.method1646(1.0F, arg0 ^ 0xF7D8DEBE);
                            this.field6448.method1646(0.0F, -136782152);
                            this.field6448.method1646((float) var58 * var13 + var55, -136782152);
                            this.field6448.method1646((float) var58 * var14 + var56, -136782152);
                            this.field6448.method1646((float) var58 * var15 + var57, -136782152);
                            this.field6448.method947(-72, var51);
                            this.field6448.method947(-36, var52);
                            this.field6448.method947(-32, var53);
                            this.field6448.method947(-27, var54);
                            this.field6448.method1646(1.0F, -136782152);
                            this.field6448.method1646(1.0F, -136782152);
                            this.field6448.method1646((float) var58 * var10 + var55, -136782152);
                            this.field6448.method1646((float) var58 * var11 + var56, arg0 + -136782158);
                            this.field6448.method1646((float) var58 * var12 + var57, -136782152);
                            this.field6448.method947(arg0 - 55, var51);
                            this.field6448.method947(-63, var52);
                            this.field6448.method947(arg0 ^ 0xFFFFFFD2, var53);
                            this.field6448.method947(-72, var54);
                            this.field6448.method1646(0.0F, -136782152);
                            this.field6448.method1646(1.0F, -136782152);
                            this.field6448.method1646((float) var58 * var16 + var55, -136782152);
                            this.field6448.method1646((float) var58 * var17 + var56, -136782152);
                            this.field6448.method1646((float) var58 * var18 + var57, -136782152);
                            this.field6448.method947(arg0 ^ 0xFFFFFFA6, var51);
                            this.field6448.method947(-43, var52);
                            this.field6448.method947(-61, var53);
                            this.field6448.method947(-121, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field6461[var19] <= 64 ? this.field6461[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class335 var34 = this.field6464[var19][var21];
                        int var35 = var34.field4852;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field4863 >> class176.field2425);
                        float var41 = (float) (var34.field4853 >> class176.field2425);
                        float var42 = (float) (var34.field4857 >> class176.field2425);
                        int var43 = var34.field4856 >> class176.field2425;
                        this.field6448.method1647(0.0F, true);
                        this.field6448.method1647(0.0F, true);
                        this.field6448.method1647((float) (-var43) * var10 + var40, true);
                        this.field6448.method1647((float) (-var43) * var11 + var41, true);
                        this.field6448.method1647((float) (-var43) * var12 + var42, true);
                        this.field6448.method947(-128, var36);
                        this.field6448.method947(arg0 - 119, var37);
                        this.field6448.method947(-85, var38);
                        this.field6448.method947(arg0 ^ 0xFFFFFFD9, var39);
                        this.field6448.method1647(1.0F, true);
                        this.field6448.method1647(0.0F, true);
                        this.field6448.method1647((float) var43 * var13 + var40, true);
                        this.field6448.method1647((float) var43 * var14 + var41, true);
                        this.field6448.method1647((float) var43 * var15 + var42, true);
                        this.field6448.method947(-82, var36);
                        this.field6448.method947(arg0 - 123, var37);
                        this.field6448.method947(-51, var38);
                        this.field6448.method947(-96, var39);
                        this.field6448.method1647(1.0F, true);
                        this.field6448.method1647(1.0F, true);
                        this.field6448.method1647((float) var43 * var10 + var40, true);
                        this.field6448.method1647((float) var43 * var11 + var41, true);
                        this.field6448.method1647((float) var43 * var12 + var42, true);
                        this.field6448.method947(arg0 - 40, var36);
                        this.field6448.method947(-70, var37);
                        this.field6448.method947(-108, var38);
                        this.field6448.method947(-33, var39);
                        this.field6448.method1647(0.0F, true);
                        this.field6448.method1647(1.0F, true);
                        this.field6448.method1647((float) var43 * var16 + var40, true);
                        this.field6448.method1647((float) var43 * var17 + var41, true);
                        this.field6448.method1647((float) var43 * var18 + var42, true);
                        this.field6448.method947(arg0 ^ 0xFFFFFFE6, var36);
                        this.field6448.method947(-54, var37);
                        this.field6448.method947(-46, var38);
                        this.field6448.method947(-50, var39);
                    }
                    if (this.field6461[var19] > 64) {
                        int var22 = this.field6461[var19] - 64 - 1;
                        for (int var23 = this.field6463[var22] - 1; var23 >= 0; var23--) {
                            class335 var24 = this.field6462[var22][var23];
                            int var25 = var24.field4852;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field4863 >> class176.field2425);
                            float var31 = (float) (var24.field4853 >> class176.field2425);
                            float var32 = (float) (var24.field4857 >> class176.field2425);
                            int var33 = var24.field4856 >> class176.field2425;
                            this.field6448.method1647(0.0F, true);
                            this.field6448.method1647(0.0F, true);
                            this.field6448.method1647((float) (-var33) * var10 + var30, true);
                            this.field6448.method1647((float) (-var33) * var11 + var31, true);
                            this.field6448.method1647((float) (-var33) * var12 + var32, true);
                            this.field6448.method947(-39, var26);
                            this.field6448.method947(arg0 ^ 0xFFFFFFC3, var27);
                            this.field6448.method947(-103, var28);
                            this.field6448.method947(arg0 ^ 0xFFFFFFB5, var29);
                            this.field6448.method1647(1.0F, true);
                            this.field6448.method1647(0.0F, true);
                            this.field6448.method1647((float) var33 * var13 + var30, true);
                            this.field6448.method1647((float) var33 * var14 + var31, true);
                            this.field6448.method1647((float) var33 * var15 + var32, true);
                            this.field6448.method947(-67, var26);
                            this.field6448.method947(-69, var27);
                            this.field6448.method947(-63, var28);
                            this.field6448.method947(-104, var29);
                            this.field6448.method1647(1.0F, true);
                            this.field6448.method1647(1.0F, true);
                            this.field6448.method1647((float) var33 * var10 + var30, true);
                            this.field6448.method1647((float) var33 * var11 + var31, true);
                            this.field6448.method1647((float) var33 * var12 + var32, true);
                            this.field6448.method947(arg0 ^ 0xFFFFFFCC, var26);
                            this.field6448.method947(-97, var27);
                            this.field6448.method947(arg0 - 40, var28);
                            this.field6448.method947(-120, var29);
                            this.field6448.method1647(0.0F, true);
                            this.field6448.method1647(1.0F, true);
                            this.field6448.method1647((float) var33 * var16 + var30, true);
                            this.field6448.method1647((float) var33 * var17 + var31, true);
                            this.field6448.method1647((float) var33 * var18 + var32, true);
                            this.field6448.method947(arg0 ^ 0xFFFFFFC3, var26);
                            this.field6448.method947(-33, var27);
                            this.field6448.method947(-28, var28);
                            this.field6448.method947(-68, var29);
                        }
                    }
                }
            }
        }
        if (this.field6448.field2018 != 0) {
            this.field6455.method2187(this.field6448.field2018, 24, this.field6448.field2041, false);
            arg1.method2861(this.field6457, 9149, this.field6456, null, this.field6458);
            arg1.method2898(0, (byte) -52, 7, this.field6448.field2018 / 24);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lrl;B)V")
    private final void method2581(class487 arg0, byte arg1) {
        class232.field3235 = arg0.field7414;
        if (arg1 <= 114) {
            method2584(null, false);
        }
        field6452++;
        arg0.method2891(8);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2908(false, (byte) 58);
        arg0.method2867(0, -2);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(B)Z")
    public static final boolean method2582(byte arg0) {
        if (arg0 != -76) {
            return false;
        }
        field6445++;
        if (class242.field3446) {
            try {
                if ((Boolean) class123.method697((byte) 98, "showingVideoAd", class86.field1182.field668)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V")
    public static void method2583(int arg0) {
        field6449 = null;
        field6454 = null;
        field6446 = null;
        if (arg0 != 1600) {
            field6446 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Leq;Z)V")
    public static final void method2584(class134 arg0, boolean arg1) {
        if (class500.field7650) {
            class372.method2263(arg0, (byte) 125);
        } else {
            class174.method1094(111, arg0);
        }
        field6443++;
        if (arg1) {
            method2584(null, true);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(ILrl;)V")
    private final void method2585(int arg0, class487 arg1) {
        field6451++;
        arg1.method2908(true, (byte) 63);
        if (arg0 <= 45) {
            this.field6456 = null;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class232.field3235 != arg1.field7414) {
            arg1.method791(class232.field3235);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Lrl;ILbv;)V")
    public final void method2586(class487 arg0, int arg1, class191 arg2) {
        field6442++;
        if (arg0.field7391 == null) {
            return;
        }
        this.method2581(arg0, (byte) 125);
        float var4 = arg0.field7391.field3650;
        float var5 = arg0.field7391.field3625;
        float var6 = arg0.field7391.field3644;
        float var7 = arg0.field7391.field3618;
        if (arg1 != 0) {
            method2584(null, true);
        }
        try {
            if (arg2.field2709) {
                int var8 = arg2.field2710 - arg2.field2711;
                int var9;
                if (var8 + 2 <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = class20.method146(true, var8) + (1 - this.field6459);
                    var8 = (var8 >> var9) + 2;
                }
                class354 var10 = arg2.field2704.field7580;
                class354 var11 = var10.field5112;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field6465 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field6461[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field6463[var16] = 0;
                    }
                    while (var10 != var11) {
                        class335 var17 = (class335) var11;
                        if (var14) {
                            var12 = var17.field4862;
                            var14 = false;
                            var13 = var17.field4860;
                        } else if (var17.field4862 != var12 || var17.field4860 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field4857 >> class176.field2425) * var6 + (float) (var17.field4863 >> class176.field2425) * var4 + (float) (var17.field4853 >> class176.field2425) * var5 + var7) - arg2.field2711 >> var9;
                        if (var18 < 1600) {
                            if (this.field6461[var18] >= 64) {
                                label193: {
                                    if (this.field6461[var18] == 64) {
                                        if (this.field6465 == 64) {
                                            break label193;
                                        }
                                        this.field6461[var18] += (this.field6465++) + 1;
                                    }
                                    this.field6462[this.field6461[var18] - 65][this.field6463[this.field6461[var18] - 64 - 1]++] = var17;
                                }
                            } else {
                                this.field6464[var18][this.field6461[var18]++] = var17;
                            }
                        }
                        var11 = var11.field5112;
                    }
                    if (var12 < 0) {
                        arg0.method2883(null, arg1 ^ 0xFFFFFF92);
                    } else {
                        arg0.method2883(arg0.field7311.method1922(var12, true), arg1 ^ 0x70);
                        arg0.method2914(arg1 ^ 0x7F, arg0.field1695.method432(var12, true).field1525);
                    }
                    if (var13 && class232.field3235 != arg0.field7414) {
                        arg0.method791(class232.field3235);
                    } else if (arg0.field7414 != 1.0F) {
                        arg0.method791(1.0F);
                    }
                    this.method2580((byte) 6, arg0, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class354 var22 = arg2.field2704.field7580;
                for (class354 var23 = var22.field5112; var23 != var22; var23 = var23.field5112) {
                    class335 var24 = (class335) var23;
                    int var25 = (int) ((float) (var24.field4857 >> class176.field2425) * var6 + (float) (var24.field4863 >> class176.field2425) * var4 + (float) (var24.field4853 >> class176.field2425) * var5 + var7);
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    this.field6460[var19++] = var25;
                    if (var20 > var25) {
                        var20 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) <= 1600) {
                    var27 = 0;
                    var26 += 2;
                } else {
                    var27 = (class20.method146(true, var26) - this.field6459) + 1;
                    var26 = (var26 >> var27) + 2;
                }
                int var28 = 0;
                class354 var29 = var22.field5112;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var29) {
                    this.field6465 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field6461[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field6463[var34] = 0;
                    }
                    while (var22 != var29) {
                        class335 var35 = (class335) var29;
                        if (var32) {
                            var32 = false;
                            var31 = var35.field4860;
                            var30 = var35.field4862;
                        }
                        if (var28 > 0 && (var35.field4862 != var30 || var31 != var35.field4860)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field6460[var28++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field6461[var36] < 64) {
                                this.field6464[var36][this.field6461[var36]++] = var35;
                            } else {
                                label144: {
                                    if (this.field6461[var36] == 64) {
                                        if (this.field6465 == 64) {
                                            break label144;
                                        }
                                        this.field6461[var36] += this.field6465++ + 1;
                                    }
                                    this.field6462[this.field6461[var36] - 1 - 64][this.field6463[this.field6461[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field5112;
                    }
                    if (var30 < 0) {
                        arg0.method2883(null, 82);
                    } else {
                        arg0.method2883(arg0.field7311.method1922(var30, true), 31);
                        arg0.method2914(126, arg0.field1695.method432(var30, true).field1525);
                    }
                    if (var31 && class232.field3235 != arg0.field7414) {
                        arg0.method791(class232.field3235);
                    } else if (arg0.field7414 != 1.0F) {
                        arg0.method791(1.0F);
                    }
                    this.method2580((byte) 6, arg0, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method2585(91, arg0);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BLrl;)V")
    public final void method2587(byte arg0, class487 arg1) {
        field6450++;
        this.field6455 = arg1.method2900(24, (byte) 71, true, 196584, null);
        this.field6458 = new class27(arg1, this.field6455, 5126, 2, 0);
        if (arg0 < -34) {
            this.field6456 = new class27(arg1, this.field6455, 5126, 3, 8);
            this.field6457 = new class27(arg1, this.field6455, 5121, 4, 20);
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(BIILhe;)Lmo;")
    public static final class507 method2588(byte arg0, int arg1, int arg2, class239 arg3) {
        int var4 = -8 / ((-arg0 - 35) / 50);
        field6444++;
        byte[] var5 = arg3.method1470(4, arg1, arg2);
        return var5 == null ? null : new class507(var5);
    }
}
