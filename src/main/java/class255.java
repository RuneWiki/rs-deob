import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class255 {

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "[F")
    private float[] field3259 = new float[16];

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "Ljh;")
    private class146 field3265 = new class146(786336);

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    private int field3271 = class465.method2644(1600, 4);

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "[I")
    private int[] field3272 = new int[8191];

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[I")
    private int[] field3273 = new int[1600];

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "[[Laca;")
    private class663[][] field3275 = new class663[1600][64];

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "I")
    private int field3274 = 0;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "[[Laca;")
    private class663[][] field3277 = new class663[64][768];

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "[I")
    private int[] field3276 = new int[64];

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field3253 = 0;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "[C")
    public static char[] field3268 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field3261;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Ljl;")
    private class245 field3266;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "Ljl;")
    private class245 field3269;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "Ljl;")
    private class245 field3270;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lrd;")
    public static class305 field3257;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Lrl;")
    private class659 field3267;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(ILap;I)V", line = 3)
    private final void method1456(int arg0, class435 arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field3259, 0);
        field3254++;
        float var4 = this.field3259[0];
        float var5 = this.field3259[4];
        float var6 = this.field3259[8];
        float var7 = this.field3259[1];
        float var8 = this.field3259[5];
        if (arg0 != 16385) {
            field3268 = null;
        }
        float var9 = this.field3259[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field3265.field6215 = 0;
        float var18 = var9 - var6;
        if (arg1.field6030) {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field3273[var19] > 64 ? 64 : this.field3273[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class663 var34 = this.field3275[var19][var21];
                        int var35 = var34.field9427;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field9426 >> 12);
                        float var41 = (float) (var34.field9421 >> 12);
                        float var42 = (float) (var34.field9423 >> 12);
                        int var43 = var34.field9418 >> 12;
                        this.field3265.method797(0.0F, (byte) -25);
                        this.field3265.method797(0.0F, (byte) 96);
                        this.field3265.method797((float) (-var43) * var10 + var40, (byte) 108);
                        this.field3265.method797((float) (-var43) * var11 + var41, (byte) 104);
                        this.field3265.method797((float) (-var43) * var12 + var42, (byte) 100);
                        this.field3265.method2525(var36, -81849);
                        this.field3265.method2525(var37, -81849);
                        this.field3265.method2525(var38, -81849);
                        this.field3265.method2525(var39, -81849);
                        this.field3265.method797(1.0F, (byte) -33);
                        this.field3265.method797(0.0F, (byte) -114);
                        this.field3265.method797((float) var43 * var13 + var40, (byte) -55);
                        this.field3265.method797((float) var43 * var14 + var41, (byte) 93);
                        this.field3265.method797((float) var43 * var15 + var42, (byte) -92);
                        this.field3265.method2525(var36, arg0 - 98234);
                        this.field3265.method2525(var37, -81849);
                        this.field3265.method2525(var38, -81849);
                        this.field3265.method2525(var39, -81849);
                        this.field3265.method797(1.0F, (byte) 113);
                        this.field3265.method797(1.0F, (byte) 110);
                        this.field3265.method797((float) var43 * var10 + var40, (byte) -120);
                        this.field3265.method797((float) var43 * var11 + var41, (byte) -16);
                        this.field3265.method797((float) var43 * var12 + var42, (byte) -43);
                        this.field3265.method2525(var36, arg0 - 98234);
                        this.field3265.method2525(var37, -81849);
                        this.field3265.method2525(var38, arg0 ^ 0xFFFE8046);
                        this.field3265.method2525(var39, -81849);
                        this.field3265.method797(0.0F, (byte) 126);
                        this.field3265.method797(1.0F, (byte) -92);
                        this.field3265.method797((float) var43 * var16 + var40, (byte) 121);
                        this.field3265.method797((float) var43 * var17 + var41, (byte) -12);
                        this.field3265.method797((float) var43 * var18 + var42, (byte) 109);
                        this.field3265.method2525(var36, arg0 ^ 0xFFFE8046);
                        this.field3265.method2525(var37, -81849);
                        this.field3265.method2525(var38, arg0 - 98234);
                        this.field3265.method2525(var39, -81849);
                    }
                    if (this.field3273[var19] > 64) {
                        int var22 = this.field3273[var19] - 1 - 64;
                        for (int var23 = this.field3276[var22] - 1; var23 >= 0; var23--) {
                            class663 var24 = this.field3277[var22][var23];
                            int var25 = var24.field9427;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field9426 >> 12);
                            float var31 = (float) (var24.field9421 >> 12);
                            float var32 = (float) (var24.field9423 >> 12);
                            int var33 = var24.field9418 >> 12;
                            this.field3265.method797(0.0F, (byte) -98);
                            this.field3265.method797(0.0F, (byte) -28);
                            this.field3265.method797((float) (-var33) * var10 + var30, (byte) -80);
                            this.field3265.method797((float) (-var33) * var11 + var31, (byte) 105);
                            this.field3265.method797((float) (-var33) * var12 + var32, (byte) 119);
                            this.field3265.method2525(var26, arg0 ^ 0xFFFE8046);
                            this.field3265.method2525(var27, -81849);
                            this.field3265.method2525(var28, -81849);
                            this.field3265.method2525(var29, -81849);
                            this.field3265.method797(1.0F, (byte) -47);
                            this.field3265.method797(0.0F, (byte) 104);
                            this.field3265.method797((float) var33 * var13 + var30, (byte) 112);
                            this.field3265.method797((float) var33 * var14 + var31, (byte) -107);
                            this.field3265.method797((float) var33 * var15 + var32, (byte) -91);
                            this.field3265.method2525(var26, -81849);
                            this.field3265.method2525(var27, -81849);
                            this.field3265.method2525(var28, -81849);
                            this.field3265.method2525(var29, -81849);
                            this.field3265.method797(1.0F, (byte) 118);
                            this.field3265.method797(1.0F, (byte) 104);
                            this.field3265.method797((float) var33 * var10 + var30, (byte) -66);
                            this.field3265.method797((float) var33 * var11 + var31, (byte) -127);
                            this.field3265.method797((float) var33 * var12 + var32, (byte) 101);
                            this.field3265.method2525(var26, -81849);
                            this.field3265.method2525(var27, -81849);
                            this.field3265.method2525(var28, -81849);
                            this.field3265.method2525(var29, arg0 ^ 0xFFFE8046);
                            this.field3265.method797(0.0F, (byte) 98);
                            this.field3265.method797(1.0F, (byte) 89);
                            this.field3265.method797((float) var33 * var16 + var30, (byte) 95);
                            this.field3265.method797((float) var33 * var17 + var31, (byte) 127);
                            this.field3265.method797((float) var33 * var18 + var32, (byte) 107);
                            this.field3265.method2525(var26, -81849);
                            this.field3265.method2525(var27, arg0 ^ 0xFFFE8046);
                            this.field3265.method2525(var28, -81849);
                            this.field3265.method2525(var29, -81849);
                        }
                    }
                }
            }
        } else {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field3273[var44] > 64 ? 64 : this.field3273[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class663 var59 = this.field3275[var44][var46];
                        int var60 = var59.field9427;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field9426 >> 12);
                        float var66 = (float) (var59.field9421 >> 12);
                        float var67 = (float) (var59.field9423 >> 12);
                        int var68 = var59.field9418 >> 12;
                        this.field3265.method796(6144, 0.0F);
                        this.field3265.method796(6144, 0.0F);
                        this.field3265.method796(6144, (float) (-var68) * var10 + var65);
                        this.field3265.method796(arg0 ^ 0x5801, (float) (-var68) * var11 + var66);
                        this.field3265.method796(6144, (float) (-var68) * var12 + var67);
                        this.field3265.method2525(var61, arg0 ^ 0xFFFE8046);
                        this.field3265.method2525(var62, -81849);
                        this.field3265.method2525(var63, -81849);
                        this.field3265.method2525(var64, -81849);
                        this.field3265.method796(6144, 1.0F);
                        this.field3265.method796(arg0 ^ 0x5801, 0.0F);
                        this.field3265.method796(arg0 - 10241, (float) var68 * var13 + var65);
                        this.field3265.method796(6144, (float) var68 * var14 + var66);
                        this.field3265.method796(6144, (float) var68 * var15 + var67);
                        this.field3265.method2525(var61, arg0 ^ 0xFFFE8046);
                        this.field3265.method2525(var62, -81849);
                        this.field3265.method2525(var63, -81849);
                        this.field3265.method2525(var64, -81849);
                        this.field3265.method796(6144, 1.0F);
                        this.field3265.method796(6144, 1.0F);
                        this.field3265.method796(6144, (float) var68 * var10 + var65);
                        this.field3265.method796(6144, (float) var68 * var11 + var66);
                        this.field3265.method796(arg0 ^ 0x5801, (float) var68 * var12 + var67);
                        this.field3265.method2525(var61, -81849);
                        this.field3265.method2525(var62, -81849);
                        this.field3265.method2525(var63, -81849);
                        this.field3265.method2525(var64, -81849);
                        this.field3265.method796(6144, 0.0F);
                        this.field3265.method796(arg0 ^ 0x5801, 1.0F);
                        this.field3265.method796(6144, (float) var68 * var16 + var65);
                        this.field3265.method796(arg0 - 10241, (float) var68 * var17 + var66);
                        this.field3265.method796(6144, (float) var68 * var18 + var67);
                        this.field3265.method2525(var61, -81849);
                        this.field3265.method2525(var62, -81849);
                        this.field3265.method2525(var63, -81849);
                        this.field3265.method2525(var64, arg0 - 98234);
                    }
                    if (this.field3273[var44] > 64) {
                        int var47 = this.field3273[var44] - 1 - 64;
                        for (int var48 = this.field3276[var47] - 1; var48 >= 0; var48--) {
                            class663 var49 = this.field3277[var47][var48];
                            int var50 = var49.field9427;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field9426 >> 12);
                            float var56 = (float) (var49.field9421 >> 12);
                            float var57 = (float) (var49.field9423 >> 12);
                            int var58 = var49.field9418 >> 12;
                            this.field3265.method796(6144, 0.0F);
                            this.field3265.method796(6144, 0.0F);
                            this.field3265.method796(arg0 ^ 0x5801, (float) (-var58) * var10 + var55);
                            this.field3265.method796(6144, (float) (-var58) * var11 + var56);
                            this.field3265.method796(arg0 - 10241, (float) (-var58) * var12 + var57);
                            this.field3265.method2525(var51, -81849);
                            this.field3265.method2525(var52, -81849);
                            this.field3265.method2525(var53, -81849);
                            this.field3265.method2525(var54, arg0 - 98234);
                            this.field3265.method796(6144, 1.0F);
                            this.field3265.method796(6144, 0.0F);
                            this.field3265.method796(6144, (float) var58 * var13 + var55);
                            this.field3265.method796(6144, (float) var58 * var14 + var56);
                            this.field3265.method796(6144, (float) var58 * var15 + var57);
                            this.field3265.method2525(var51, arg0 ^ 0xFFFE8046);
                            this.field3265.method2525(var52, -81849);
                            this.field3265.method2525(var53, -81849);
                            this.field3265.method2525(var54, -81849);
                            this.field3265.method796(arg0 ^ 0x5801, 1.0F);
                            this.field3265.method796(6144, 1.0F);
                            this.field3265.method796(6144, (float) var58 * var10 + var55);
                            this.field3265.method796(6144, (float) var58 * var11 + var56);
                            this.field3265.method796(6144, (float) var58 * var12 + var57);
                            this.field3265.method2525(var51, -81849);
                            this.field3265.method2525(var52, arg0 ^ 0xFFFE8046);
                            this.field3265.method2525(var53, -81849);
                            this.field3265.method2525(var54, -81849);
                            this.field3265.method796(6144, 0.0F);
                            this.field3265.method796(6144, 1.0F);
                            this.field3265.method796(6144, (float) var58 * var16 + var55);
                            this.field3265.method796(6144, (float) var58 * var17 + var56);
                            this.field3265.method796(arg0 ^ 0x5801, (float) var58 * var18 + var57);
                            this.field3265.method2525(var51, -81849);
                            this.field3265.method2525(var52, -81849);
                            this.field3265.method2525(var53, -81849);
                            this.field3265.method2525(var54, arg0 - 98234);
                        }
                    }
                }
            }
        }
        if (this.field3265.field6215 != 0) {
            this.field3267.method782((byte) 106, this.field3265.field6215, this.field3265.field6209, 24);
            arg1.method2379(this.field3270, 15132, this.field3266, this.field3269, null);
            arg1.method2358((byte) -69, 0, this.field3265.field6215 / 24, 7);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BII)Z", line = 358)
    public static final boolean method1457(byte arg0, int arg1, int arg2) {
        field3264++;
        if (arg0 == 85) {
            return (arg1 & 0x400) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLap;Ltg;)V", line = 376)
    public final void method1458(byte arg0, class435 arg1, class211 arg2) {
        field3260++;
        if (arg1.field5963 == null) {
            return;
        }
        if (arg0 < 29) {
            this.method1458((byte) 91, null, null);
        }
        this.method1463(arg1, 115);
        float var4 = arg1.field5963.field8484;
        float var5 = arg1.field5963.field8502;
        float var6 = arg1.field5963.field8503;
        float var7 = arg1.field5963.field8481;
        try {
            if (arg2.field2562) {
                int var26 = arg2.field2560 - arg2.field2563;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = class465.method2644(var26, 4) + 1 - this.field3271;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                class342 var28 = arg2.field2558.field7894;
                class342 var29 = var28.field4441;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var28 != var29) {
                    this.field3274 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field3273[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field3276[var34] = 0;
                    }
                    while (var28 != var29) {
                        class663 var35 = (class663) var29;
                        if (var32) {
                            var31 = var35.field9419;
                            var30 = var35.field9425;
                            var32 = false;
                        } else if (var35.field9425 != var30 || var35.field9419 != var31) {
                            var32 = true;
                            break;
                        }
                        int var36 = (int) ((float) (var35.field9423 >> 12) * var6 + (float) (var35.field9426 >> 12) * var4 + (float) (var35.field9421 >> 12) * var5 + var7) - arg2.field2563 >> var27;
                        if (var36 < 1600) {
                            if (this.field3273[var36] < 64) {
                                this.field3275[var36][this.field3273[var36]++] = var35;
                            } else {
                                label143: {
                                    if (this.field3273[var36] == 64) {
                                        if (this.field3274 == 64) {
                                            break label143;
                                        }
                                        this.field3273[var36] += this.field3274++ + 1;
                                    }
                                    this.field3277[this.field3273[var36] - 64 - 1][this.field3276[this.field3273[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var29 = var29.field4441;
                    }
                    if (var30 < 0) {
                        arg1.method2321(-1, (byte) 95);
                    } else {
                        arg1.method2321(var30, (byte) 95);
                    }
                    if (var31 && class272.field3439 != arg1.field6055) {
                        arg1.method368(class272.field3439);
                    } else if (arg1.field6055 != 1.0F) {
                        arg1.method368(1.0F);
                    }
                    this.method1456(16385, arg1, var26);
                }
            } else {
                int var8 = 0;
                int var9 = Integer.MAX_VALUE;
                int var10 = 0;
                class342 var11 = arg2.field2558.field7894;
                for (class342 var12 = var11.field4441; var12 != var11; var12 = var12.field4441) {
                    class663 var13 = (class663) var12;
                    int var14 = (int) ((float) (var13.field9423 >> 12) * var6 + (float) (var13.field9426 >> 12) * var4 + (float) (var13.field9421 >> 12) * var5 + var7);
                    if (var10 < var14) {
                        var10 = var14;
                    }
                    this.field3272[var8++] = var14;
                    if (var9 > var14) {
                        var9 = var14;
                    }
                }
                int var15 = var10 - var9;
                int var16;
                if ((var15 + 2) > 1600) {
                    var16 = class465.method2644(var15, 4) + 1 - this.field3271;
                    var15 = (var15 >> var16) + 2;
                } else {
                    var15 += 2;
                    var16 = 0;
                }
                int var17 = 0;
                class342 var18 = var11.field4441;
                int var19 = -2;
                boolean var20 = true;
                boolean var21 = true;
                while (var11 != var18) {
                    this.field3274 = 0;
                    for (int var22 = 0; var22 < var15; var22++) {
                        this.field3273[var22] = 0;
                    }
                    for (int var23 = 0; var23 < 64; var23++) {
                        this.field3276[var23] = 0;
                    }
                    while (var11 != var18) {
                        class663 var24 = (class663) var18;
                        if (var21) {
                            var21 = false;
                            var20 = var24.field9419;
                            var19 = var24.field9425;
                        }
                        if (var17 > 0 && (var24.field9425 != var19 || var24.field9419 != var20)) {
                            var21 = true;
                            break;
                        }
                        int var25 = this.field3272[var17++] - var9 >> var16;
                        if (var25 < 1600) {
                            if (this.field3273[var25] < 64) {
                                this.field3275[var25][this.field3273[var25]++] = var24;
                            } else {
                                label188: {
                                    if (this.field3273[var25] == 64) {
                                        if (this.field3274 == 64) {
                                            break label188;
                                        }
                                        this.field3273[var25] += this.field3274++ + 1;
                                    }
                                    this.field3277[this.field3273[var25] - 65][this.field3276[this.field3273[var25] - 64 - 1]++] = var24;
                                }
                            }
                        }
                        var18 = var18.field4441;
                    }
                    if (var19 < 0) {
                        arg1.method2321(-1, (byte) 95);
                    } else {
                        arg1.method2321(var19, (byte) 95);
                    }
                    if (var20 && class272.field3439 != arg1.field6055) {
                        arg1.method368(class272.field3439);
                    } else if (arg1.field6055 != 1.0F) {
                        arg1.method368(1.0F);
                    }
                    this.method1456(16385, arg1, var15);
                }
            }
        } catch (Exception var37) {
        }
        this.method1460(arg1, 16385);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 660)
    public static final void method1459(int arg0) {
        field3261++;
        int[] var1 = new int[class472.field6588.field4463];
        int var2 = 0;
        for (int var3 = 0; var3 < class472.field6588.field4463; var3++) {
            class537 var6 = class472.field6588.method1903(var3, (byte) -128);
            if (var6.field7663 >= 0 || var6.field7680 >= 0) {
                var1[var2++] = var3;
            }
        }
        class663.field9433 = new int[var2];
        int var4 = 0;
        int var5 = -122 / ((-arg0 - 3) / 55);
        while (var4 < var2) {
            class663.field9433[var4] = var1[var4];
            var4++;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lap;I)V", line = 697)
    private final void method1460(class435 arg0, int arg1) {
        arg0.method2382(true, -32);
        field3256++;
        OpenGL.glEnable(16384);
        OpenGL.glEnable(arg1);
        if (class272.field3439 != arg0.field6055) {
            arg0.method368(class272.field3439);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V", line = 713)
    public static void method1461(int arg0) {
        field3268 = null;
        field3257 = null;
        if (arg0 != -65) {
            field3268 = null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIII)V", line = 728)
    public static final void method1462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = -96 / ((arg5 - 21) / 49);
        field3263++;
        if (class326.field4246 <= arg2 && arg4 <= class163.field1942 && arg3 >= class58.field602 && class501.field7217 >= arg0) {
            class464.method2642(-1775995604, arg2, arg0, arg1, arg3, arg4);
        } else {
            class112.method698(arg0, arg3, arg1, -69, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(Lap;I)V", line = 756)
    private final void method1463(class435 arg0, int arg1) {
        if (arg1 != 115) {
            return;
        }
        field3252++;
        class272.field3439 = arg0.field6055;
        arg0.method2365(91);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method2382(false, arg1 - 147);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLap;)V", line = 793)
    public final void method1464(byte arg0, class435 arg1) {
        field3258++;
        this.field3267 = arg1.method2397(null, true, 24, 196584, (byte) -105);
        this.field3266 = new class245(this.field3267, 5126, 2, 0);
        this.field3270 = new class245(this.field3267, 5126, 3, 8);
        int var3 = 113 / ((arg0 + 4) / 56);
        this.field3269 = new class245(this.field3267, 5121, 4, 20);
    }
}
