import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class172 {

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "[F")
    private float[] field2452 = new float[16];

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "Lom;")
    private class251 field2461 = new class251(786336);

    @OriginalMember(owner = "client!rh", name = "p", descriptor = "I")
    private int field2467 = class108.method697(1600, true);

    @OriginalMember(owner = "client!rh", name = "q", descriptor = "[[Lui;")
    private class151[][] field2468 = new class151[1600][64];

    @OriginalMember(owner = "client!rh", name = "s", descriptor = "[I")
    private int[] field2470 = new int[64];

    @OriginalMember(owner = "client!rh", name = "t", descriptor = "I")
    private int field2471 = 0;

    @OriginalMember(owner = "client!rh", name = "r", descriptor = "[[Lui;")
    private class151[][] field2469 = new class151[64][768];

    @OriginalMember(owner = "client!rh", name = "v", descriptor = "[I")
    private int[] field2473 = new int[8191];

    @OriginalMember(owner = "client!rh", name = "u", descriptor = "[I")
    private int[] field2472 = new int[1600];

    @OriginalMember(owner = "client!rh", name = "f", descriptor = "[I")
    public static int[] field2457 = new int[3];

    @OriginalMember(owner = "client!rh", name = "g", descriptor = "Luf;")
    public static class310 field2458 = new class310(31, -1);

    @OriginalMember(owner = "client!rh", name = "n", descriptor = "Luf;")
    public static class310 field2465 = new class310(30, 0);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!rh", name = "c", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "I")
    public static int field2455;

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "I")
    public static int field2456;

    @OriginalMember(owner = "client!rh", name = "h", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "I")
    public static int field2460;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "Lds;")
    private class12 field2462;

    @OriginalMember(owner = "client!rh", name = "l", descriptor = "Lds;")
    private class12 field2463;

    @OriginalMember(owner = "client!rh", name = "m", descriptor = "Lds;")
    private class12 field2464;

    @OriginalMember(owner = "client!rh", name = "o", descriptor = "Lbm;")
    private class74 field2466;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILqb;Lht;)V")
    public final void method1063(int arg0, class148 arg1, class410 arg2) {
        field2460++;
        if (arg0 != -65 || arg2.field5917 == null) {
            return;
        }
        this.method1068(arg2, 16385);
        float var4 = arg2.field5917.field727;
        float var5 = arg2.field5917.field721;
        float var6 = arg2.field5917.field730;
        float var7 = arg2.field5917.field723;
        try {
            if (arg1.field2093) {
                int var26 = arg1.field2091 - arg1.field2094;
                int var27;
                if ((var26 + 2) <= 1600) {
                    var26 += 2;
                    var27 = 0;
                } else {
                    var27 = class108.method697(var26, true) + 1 - this.field2467;
                    var26 = (var26 >> var27) + 2;
                }
                class82 var28 = arg1.field2090.field2362;
                class82 var29 = var28.field1151;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field2471 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field2472[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field2470[var34] = 0;
                    }
                    while (var28 != var29) {
                        class151 var35 = (class151) var29;
                        if (var32) {
                            var31 = var35.field2123;
                            var32 = false;
                            var30 = var35.field2122;
                        } else if (var35.field2122 != var30 || var31 != var35.field2123) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field2125 >> class45.field631) * var6 + (float) (var35.field2120 >> class45.field631) * var5 + (float) (var35.field2117 >> class45.field631) * var4 + var7) - arg1.field2094 >> var27;
                        if (var36 < 1600) {
                            if (this.field2472[var36] < 64) {
                                this.field2468[var36][this.field2472[var36]++] = var35;
                            } else {
                                label148: {
                                    if (this.field2472[var36] == 64) {
                                        if (this.field2471 == 64) {
                                            break label148;
                                        }
                                        this.field2472[var36] += this.field2471++ + 1;
                                    }
                                    this.field2469[this.field2472[var36] - 1 - 64][this.field2470[this.field2472[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field1151;
                    }
                    if (var30 >= 0) {
                        arg2.method2412((byte) 4, arg2.field5856.method1422(6797, var30));
                        arg2.method2365(true, arg2.field2312.method830(var30, (byte) 71).field7369);
                    } else {
                        arg2.method2412((byte) 4, null);
                    }
                    if (var31 && class389.field5459 != arg2.field5960) {
                        arg2.method525(class389.field5459);
                    } else if (arg2.field5960 != 1.0F) {
                        arg2.method525(1.0F);
                    }
                    this.method1066(var26, arg2, arg0 ^ 0xFFFFFF89);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class82 var11 = arg1.field2090.field2362;
                for (class82 var12 = var11.field1151; var12 != var11; var12 = var12.field1151) {
                    class151 var13 = (class151) var12;
                    int var14 = (int) ((float) (var13.field2125 >> class45.field631) * var6 + (float) (var13.field2120 >> class45.field631) * var5 + (float) (var13.field2117 >> class45.field631) * var4 + var7);
                    if (var9 > var14) {
                        var9 = var14;
                    }
                    if (var14 > var10) {
                        var10 = var14;
                    }
                    this.field2473[var8++] = var14;
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) > 1600) {
                    var16 = (class108.method697(var15, true) - this.field2467) + 1;
                    var15 = (var15 >> var16) + 2;
                } else {
                    var15 += 2;
                    var16 = 0;
                }
                int var17 = 0;
                class82 var18 = var11.field1151;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var18) {
                    this.field2471 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field2472[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field2470[var23] = 0;
                    }
                    while (var11 != var18) {
                        class151 var24 = (class151) var18;
                        if (var21) {
                            var19 = var24.field2122;
                            var21 = false;
                            var20 = var24.field2123;
                        }
                        if (var17 > 0 && (var24.field2122 != var19 || var20 != var24.field2123)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field2473[var17++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field2472[var25] >= 64) {
                                label193: {
                                    if (this.field2472[var25] == 64) {
                                        if (this.field2471 == 64) {
                                            break label193;
                                        }
                                        this.field2472[var25] += this.field2471++ + 1;
                                    }
                                    class151[] var38 = this.field2469[this.field2472[var25] - 65];
                                    int var10002 = this.field2472[var25] - 65;
                                    int var10004 = this.field2470[this.field2472[var25] - 65];
                                    this.field2470[var10002] = this.field2470[this.field2472[var25] - 65] + 1;
                                    var38[var10004] = var24;
                                }
                            } else {
                                this.field2468[var25][this.field2472[var25]++] = var24;
                            }
                        }
                        var18 = var18.field1151;
                    }
                    if (var19 >= 0) {
                        arg2.method2412((byte) 4, arg2.field5856.method1422(arg0 ^ 0xFFFFE532, var19));
                        arg2.method2365(true, arg2.field2312.method830(var19, (byte) 71).field7369);
                    } else {
                        arg2.method2412((byte) 4, null);
                    }
                    if (var20 && class389.field5459 != arg2.field5960) {
                        arg2.method525(class389.field5459);
                    } else if (arg2.field5960 != 1.0F) {
                        arg2.method525(1.0F);
                    }
                    this.method1066(var15, arg2, 102);
                }
            }
        } catch (Exception var37) {
        }
        this.method1067(16384, arg2);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
    public static void method1064(boolean arg0) {
        field2465 = null;
        field2458 = null;
        if (arg0) {
            field2458 = null;
        }
        field2457 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)Lrs;")
    public static final class462 method1065(int arg0, int arg1) {
        field2459++;
        if (arg0 > -20) {
            method1065(21, 42);
        }
        if (arg1 == 0) {
            if ((double) class481.field7044 == 3.0D) {
                return class33.field473;
            }
            if ((double) class481.field7044 == 4.0D) {
                return class352.field4804;
            }
            if ((double) class481.field7044 == 6.0D) {
                return class451.field6507;
            }
            if ((double) class481.field7044 >= 8.0D) {
                return class35.field500;
            }
        } else if (arg1 == 1) {
            if ((double) class481.field7044 == 3.0D) {
                return class451.field6507;
            }
            if ((double) class481.field7044 == 4.0D) {
                return class35.field500;
            }
            if ((double) class481.field7044 == 6.0D) {
                return class152.field2135;
            }
            if ((double) class481.field7044 >= 8.0D) {
                return class101.field1373;
            }
        } else if (arg1 == 2) {
            if ((double) class481.field7044 == 3.0D) {
                return class152.field2135;
            }
            if ((double) class481.field7044 == 4.0D) {
                return class101.field1373;
            }
            if ((double) class481.field7044 == 6.0D) {
                return class380.field5363;
            }
            if ((double) class481.field7044 >= 8.0D) {
                return class54.field752;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILht;I)V")
    private final void method1066(int arg0, class410 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field2452, 0);
        field2455++;
        float var4 = this.field2452[0];
        float var5 = this.field2452[4];
        float var6 = this.field2452[8];
        float var7 = this.field2452[1];
        float var8 = this.field2452[5];
        float var9 = this.field2452[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        if (arg2 <= 38) {
            this.field2473 = null;
        }
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field2461.field5069 = 0;
        if (arg1.field5931) {
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                int var20 = this.field2472[var19] <= 64 ? this.field2472[var19] : 64;
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class151 var34 = this.field2468[var19][var21];
                        int var35 = var34.field2121;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field2117 >> class45.field631);
                        float var41 = (float) (var34.field2120 >> class45.field631);
                        float var42 = (float) (var34.field2125 >> class45.field631);
                        int var43 = var34.field2128 >> class45.field631;
                        this.field2461.method1477(0.0F, (byte) -19);
                        this.field2461.method1477(0.0F, (byte) -50);
                        this.field2461.method1477((float) (-var43) * var10 + var40, (byte) 123);
                        this.field2461.method1477((float) (-var43) * var11 + var41, (byte) 118);
                        this.field2461.method1477((float) (-var43) * var12 + var42, (byte) -85);
                        this.field2461.method2084(var36, false);
                        this.field2461.method2084(var37, false);
                        this.field2461.method2084(var38, false);
                        this.field2461.method2084(var39, false);
                        this.field2461.method1477(1.0F, (byte) 117);
                        this.field2461.method1477(0.0F, (byte) 120);
                        this.field2461.method1477((float) var43 * var13 + var40, (byte) 119);
                        this.field2461.method1477((float) var43 * var14 + var41, (byte) -68);
                        this.field2461.method1477((float) var43 * var15 + var42, (byte) -104);
                        this.field2461.method2084(var36, false);
                        this.field2461.method2084(var37, false);
                        this.field2461.method2084(var38, false);
                        this.field2461.method2084(var39, false);
                        this.field2461.method1477(1.0F, (byte) 119);
                        this.field2461.method1477(1.0F, (byte) -35);
                        this.field2461.method1477((float) var43 * var10 + var40, (byte) -127);
                        this.field2461.method1477((float) var43 * var11 + var41, (byte) 127);
                        this.field2461.method1477((float) var43 * var12 + var42, (byte) 120);
                        this.field2461.method2084(var36, false);
                        this.field2461.method2084(var37, false);
                        this.field2461.method2084(var38, false);
                        this.field2461.method2084(var39, false);
                        this.field2461.method1477(0.0F, (byte) 126);
                        this.field2461.method1477(1.0F, (byte) 117);
                        this.field2461.method1477((float) var43 * var16 + var40, (byte) 120);
                        this.field2461.method1477((float) var43 * var17 + var41, (byte) 127);
                        this.field2461.method1477((float) var43 * var18 + var42, (byte) -38);
                        this.field2461.method2084(var36, false);
                        this.field2461.method2084(var37, false);
                        this.field2461.method2084(var38, false);
                        this.field2461.method2084(var39, false);
                    }
                    if (this.field2472[var19] > 64) {
                        int var22 = this.field2472[var19] - 64 - 1;
                        for (int var23 = this.field2470[var22] - 1; var23 >= 0; var23--) {
                            class151 var24 = this.field2469[var22][var23];
                            int var25 = var24.field2121;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field2117 >> class45.field631);
                            float var31 = (float) (var24.field2120 >> class45.field631);
                            float var32 = (float) (var24.field2125 >> class45.field631);
                            int var33 = var24.field2128 >> class45.field631;
                            this.field2461.method1477(0.0F, (byte) -23);
                            this.field2461.method1477(0.0F, (byte) 126);
                            this.field2461.method1477((float) (-var33) * var10 + var30, (byte) -58);
                            this.field2461.method1477((float) (-var33) * var11 + var31, (byte) 118);
                            this.field2461.method1477((float) (-var33) * var12 + var32, (byte) 120);
                            this.field2461.method2084(var26, false);
                            this.field2461.method2084(var27, false);
                            this.field2461.method2084(var28, false);
                            this.field2461.method2084(var29, false);
                            this.field2461.method1477(1.0F, (byte) 118);
                            this.field2461.method1477(0.0F, (byte) -121);
                            this.field2461.method1477((float) var33 * var13 + var30, (byte) 8);
                            this.field2461.method1477((float) var33 * var14 + var31, (byte) -1);
                            this.field2461.method1477((float) var33 * var15 + var32, (byte) -112);
                            this.field2461.method2084(var26, false);
                            this.field2461.method2084(var27, false);
                            this.field2461.method2084(var28, false);
                            this.field2461.method2084(var29, false);
                            this.field2461.method1477(1.0F, (byte) 127);
                            this.field2461.method1477(1.0F, (byte) 124);
                            this.field2461.method1477((float) var33 * var10 + var30, (byte) -56);
                            this.field2461.method1477((float) var33 * var11 + var31, (byte) 125);
                            this.field2461.method1477((float) var33 * var12 + var32, (byte) 118);
                            this.field2461.method2084(var26, false);
                            this.field2461.method2084(var27, false);
                            this.field2461.method2084(var28, false);
                            this.field2461.method2084(var29, false);
                            this.field2461.method1477(0.0F, (byte) -4);
                            this.field2461.method1477(1.0F, (byte) 22);
                            this.field2461.method1477((float) var33 * var16 + var30, (byte) 20);
                            this.field2461.method1477((float) var33 * var17 + var31, (byte) 125);
                            this.field2461.method1477((float) var33 * var18 + var32, (byte) 127);
                            this.field2461.method2084(var26, false);
                            this.field2461.method2084(var27, false);
                            this.field2461.method2084(var28, false);
                            this.field2461.method2084(var29, false);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg0 - 1; var44 >= 0; var44--) {
                int var45 = this.field2472[var44] <= 64 ? this.field2472[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class151 var59 = this.field2468[var44][var46];
                        int var60 = var59.field2121;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field2117 >> class45.field631);
                        float var66 = (float) (var59.field2120 >> class45.field631);
                        float var67 = (float) (var59.field2125 >> class45.field631);
                        int var68 = var59.field2128 >> class45.field631;
                        this.field2461.method1476(45, 0.0F);
                        this.field2461.method1476(-118, 0.0F);
                        this.field2461.method1476(91, (float) (-var68) * var10 + var65);
                        this.field2461.method1476(51, (float) (-var68) * var11 + var66);
                        this.field2461.method1476(19, (float) (-var68) * var12 + var67);
                        this.field2461.method2084(var61, false);
                        this.field2461.method2084(var62, false);
                        this.field2461.method2084(var63, false);
                        this.field2461.method2084(var64, false);
                        this.field2461.method1476(48, 1.0F);
                        this.field2461.method1476(-116, 0.0F);
                        this.field2461.method1476(46, (float) var68 * var13 + var65);
                        this.field2461.method1476(-124, (float) var68 * var14 + var66);
                        this.field2461.method1476(-108, (float) var68 * var15 + var67);
                        this.field2461.method2084(var61, false);
                        this.field2461.method2084(var62, false);
                        this.field2461.method2084(var63, false);
                        this.field2461.method2084(var64, false);
                        this.field2461.method1476(64, 1.0F);
                        this.field2461.method1476(-103, 1.0F);
                        this.field2461.method1476(-122, (float) var68 * var10 + var65);
                        this.field2461.method1476(-114, (float) var68 * var11 + var66);
                        this.field2461.method1476(-111, (float) var68 * var12 + var67);
                        this.field2461.method2084(var61, false);
                        this.field2461.method2084(var62, false);
                        this.field2461.method2084(var63, false);
                        this.field2461.method2084(var64, false);
                        this.field2461.method1476(88, 0.0F);
                        this.field2461.method1476(-102, 1.0F);
                        this.field2461.method1476(-128, (float) var68 * var16 + var65);
                        this.field2461.method1476(-120, (float) var68 * var17 + var66);
                        this.field2461.method1476(-126, (float) var68 * var18 + var67);
                        this.field2461.method2084(var61, false);
                        this.field2461.method2084(var62, false);
                        this.field2461.method2084(var63, false);
                        this.field2461.method2084(var64, false);
                    }
                    if (this.field2472[var44] > 64) {
                        int var47 = this.field2472[var44] - 1 - 64;
                        for (int var48 = this.field2470[var47] - 1; var48 >= 0; var48--) {
                            class151 var49 = this.field2469[var47][var48];
                            int var50 = var49.field2121;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field2117 >> class45.field631);
                            float var56 = (float) (var49.field2120 >> class45.field631);
                            float var57 = (float) (var49.field2125 >> class45.field631);
                            int var58 = var49.field2128 >> class45.field631;
                            this.field2461.method1476(61, 0.0F);
                            this.field2461.method1476(102, 0.0F);
                            this.field2461.method1476(9, (float) (-var58) * var10 + var55);
                            this.field2461.method1476(56, (float) (-var58) * var11 + var56);
                            this.field2461.method1476(40, (float) (-var58) * var12 + var57);
                            this.field2461.method2084(var51, false);
                            this.field2461.method2084(var52, false);
                            this.field2461.method2084(var53, false);
                            this.field2461.method2084(var54, false);
                            this.field2461.method1476(14, 1.0F);
                            this.field2461.method1476(26, 0.0F);
                            this.field2461.method1476(-122, (float) var58 * var13 + var55);
                            this.field2461.method1476(38, (float) var58 * var14 + var56);
                            this.field2461.method1476(-110, (float) var58 * var15 + var57);
                            this.field2461.method2084(var51, false);
                            this.field2461.method2084(var52, false);
                            this.field2461.method2084(var53, false);
                            this.field2461.method2084(var54, false);
                            this.field2461.method1476(125, 1.0F);
                            this.field2461.method1476(-104, 1.0F);
                            this.field2461.method1476(52, (float) var58 * var10 + var55);
                            this.field2461.method1476(41, (float) var58 * var11 + var56);
                            this.field2461.method1476(44, (float) var58 * var12 + var57);
                            this.field2461.method2084(var51, false);
                            this.field2461.method2084(var52, false);
                            this.field2461.method2084(var53, false);
                            this.field2461.method2084(var54, false);
                            this.field2461.method1476(-105, 0.0F);
                            this.field2461.method1476(52, 1.0F);
                            this.field2461.method1476(-116, (float) var58 * var16 + var55);
                            this.field2461.method1476(113, (float) var58 * var17 + var56);
                            this.field2461.method1476(-118, (float) var58 * var18 + var57);
                            this.field2461.method2084(var51, false);
                            this.field2461.method2084(var52, false);
                            this.field2461.method2084(var53, false);
                            this.field2461.method2084(var54, false);
                        }
                    }
                }
            }
        }
        if (this.field2461.field5069 != 0) {
            this.field2466.method554((byte) -34, this.field2461.field5073, 24, this.field2461.field5069);
            arg1.method2439(this.field2463, (byte) -55, this.field2464, this.field2462, null);
            arg1.method2401(7, 0, this.field2461.field5069 / 24, (byte) -109);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILht;)V")
    private final void method1067(int arg0, class410 arg1) {
        arg1.method2431(true, arg0 - 48072);
        field2453++;
        OpenGL.glEnable(arg0);
        OpenGL.glEnable(16385);
        if (class389.field5459 != arg1.field5960) {
            arg1.method525(class389.field5459);
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lht;I)V")
    private final void method1068(class410 arg0, int arg1) {
        class389.field5459 = arg0.field5960;
        field2456++;
        arg0.method2388(-7174);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(arg1);
        arg0.method2431(false, -31688);
        arg0.method2366(-2, 1874);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Lht;I)V")
    public final void method1069(class410 arg0, int arg1) {
        this.field2466 = arg0.method2389(true, 24, null, 1145, 196584);
        field2454++;
        this.field2463 = new class12(arg0, this.field2466, 5126, 2, 0);
        if (arg1 != -1) {
            this.method1069(null, 20);
        }
        this.field2464 = new class12(arg0, this.field2466, 5126, 3, 8);
        this.field2462 = new class12(arg0, this.field2466, 5121, 4, 20);
    }
}
