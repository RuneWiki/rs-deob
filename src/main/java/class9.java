import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class9 {

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "[F")
    private float[] field81 = new float[16];

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "Lkv;")
    private class210 field85 = new class210(786336);

    @OriginalMember(owner = "client!lq", name = "m", descriptor = "I")
    private int field88 = class252.method1532(-113, 1600);

    @OriginalMember(owner = "client!lq", name = "r", descriptor = "[I")
    private int[] field93 = new int[8191];

    @OriginalMember(owner = "client!lq", name = "v", descriptor = "[I")
    private int[] field97 = new int[1600];

    @OriginalMember(owner = "client!lq", name = "u", descriptor = "[I")
    private int[] field96 = new int[64];

    @OriginalMember(owner = "client!lq", name = "w", descriptor = "[[Lbh;")
    private class545[][] field98 = new class545[1600][64];

    @OriginalMember(owner = "client!lq", name = "t", descriptor = "[[Lbh;")
    private class545[][] field95 = new class545[64][768];

    @OriginalMember(owner = "client!lq", name = "s", descriptor = "I")
    private int field94 = 0;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "Z")
    public static boolean field76 = false;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field77;

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "I")
    public static int field79;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!lq", name = "l", descriptor = "I")
    public static int field87;

    @OriginalMember(owner = "client!lq", name = "o", descriptor = "Lfe;")
    private class199 field90;

    @OriginalMember(owner = "client!lq", name = "p", descriptor = "Lfe;")
    private class199 field91;

    @OriginalMember(owner = "client!lq", name = "q", descriptor = "Lfe;")
    private class199 field92;

    @OriginalMember(owner = "client!lq", name = "n", descriptor = "Lcw;")
    private class511 field89;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ILag;)V", line = 7)
    private final void method46(int arg0, class469 arg1) {
        class454.field5982 = arg1.field6497;
        field83++;
        arg1.method2665(113);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2653(-112, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (arg0 != 64) {
            this.field94 = -46;
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILag;)V", line = 27)
    private final void method47(int arg0, class469 arg1) {
        if (arg0 <= 32) {
            return;
        }
        field86++;
        arg1.method2653(-86, true);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class454.field5982 != arg1.field6497) {
            arg1.method1041(class454.field5982);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lag;Lec;II)V", line = 50)
    public final void method48(class469 arg0, class144 arg1, int arg2, int arg3) {
        field79++;
        if (arg0.field6428 == null) {
            return;
        }
        if (arg3 >= 0) {
            this.method49((byte) -66, arg0, arg3);
        } else {
            this.method46(arg2 + 7288, arg0);
        }
        float var5 = arg0.field6428.field790;
        float var6 = arg0.field6428.field775;
        float var7 = arg0.field6428.field795;
        float var8 = arg0.field6428.field791;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            if (arg2 != -7224) {
                this.field92 = null;
            }
            class701 var12 = arg1.field1942.field4349;
            for (class701 var13 = var12.field9865; var13 != var12; var13 = var13.field9865) {
                class545 var14 = (class545) var13;
                int var15 = (int) ((float) (var14.field7456 >> 12) * var7 + (float) (var14.field7451 >> 12) * var5 + (float) (var14.field7448 >> 12) * var6 + var8);
                this.field93[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
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
                var17 = class252.method1532(-119, var16) + 1 - this.field88;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class701 var19 = var12.field9865;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field94 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field97[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field96[var24] = 0;
                }
                while (var12 != var19) {
                    class545 var25 = (class545) var19;
                    if (var22) {
                        var21 = var25.field7445;
                        var22 = false;
                        var20 = var25.field7444;
                    }
                    if (var18 > 0 && (var25.field7444 != var20 || var21 != var25.field7445)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field93[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field97[var26] < 64) {
                            this.field98[var26][this.field97[var26]++] = var25;
                        } else {
                            label105: {
                                if (this.field97[var26] == 64) {
                                    if (this.field94 == 64) {
                                        break label105;
                                    }
                                    this.field97[var26] += this.field94++ + 1;
                                }
                                this.field95[this.field97[var26] - 1 - 64][this.field96[this.field97[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field9865;
                }
                if (var20 < 0) {
                    arg0.method2693(-1, 15210);
                } else {
                    arg0.method2693(var20, arg2 ^ 0xFFFFD8A2);
                }
                if (var21 && class454.field5982 != arg0.field6497) {
                    arg0.method1041(class454.field5982);
                } else if (arg0.field6497 != 1.0F) {
                    arg0.method1041(1.0F);
                }
                this.method50(arg0, 123, var16);
            }
        } catch (Exception var27) {
        }
        this.method47(42, arg0);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLag;I)V", line = 216)
    private final void method49(byte arg0, class469 arg1, int arg2) {
        class454.field5982 = arg1.field6497;
        field82++;
        arg1.method2628((float) arg2, 4);
        arg1.method2660(16);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2653(-112, false);
        if (arg0 != -66) {
            this.method48(null, null, -19, -60);
        }
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lag;II)V", line = 234)
    private final void method50(class469 arg0, int arg1, int arg2) {
        field77++;
        OpenGL.glGetFloatv(2982, this.field81, 0);
        float var4 = this.field81[0];
        float var5 = this.field81[4];
        float var6 = this.field81[8];
        float var7 = this.field81[1];
        float var8 = this.field81[5];
        float var9 = this.field81[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        if (arg1 <= 74) {
            this.field93 = null;
        }
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field85.field2219 = 0;
        float var18 = var9 - var6;
        if (arg0.field6466) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field97[var44] <= 64 ? this.field97[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class545 var59 = this.field98[var44][var46];
                        int var60 = var59.field7454;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field7451 >> 12);
                        float var66 = (float) (var59.field7448 >> 12);
                        float var67 = (float) (var59.field7456 >> 12);
                        int var68 = var59.field7447 >> 12;
                        this.field85.method1334(917876560, 0.0F);
                        this.field85.method1334(917876560, 0.0F);
                        this.field85.method1334(917876560, (float) (-var68) * var10 + var65);
                        this.field85.method1334(917876560, (float) (-var68) * var11 + var66);
                        this.field85.method1334(917876560, (float) (-var68) * var12 + var67);
                        this.field85.method915(-31914, var61);
                        this.field85.method915(-31914, var62);
                        this.field85.method915(-31914, var63);
                        this.field85.method915(-31914, var64);
                        this.field85.method1334(917876560, 1.0F);
                        this.field85.method1334(917876560, 0.0F);
                        this.field85.method1334(917876560, (float) var68 * var13 + var65);
                        this.field85.method1334(917876560, (float) var68 * var14 + var66);
                        this.field85.method1334(917876560, (float) var68 * var15 + var67);
                        this.field85.method915(-31914, var61);
                        this.field85.method915(-31914, var62);
                        this.field85.method915(-31914, var63);
                        this.field85.method915(-31914, var64);
                        this.field85.method1334(917876560, 1.0F);
                        this.field85.method1334(917876560, 1.0F);
                        this.field85.method1334(917876560, (float) var68 * var10 + var65);
                        this.field85.method1334(917876560, (float) var68 * var11 + var66);
                        this.field85.method1334(917876560, (float) var68 * var12 + var67);
                        this.field85.method915(-31914, var61);
                        this.field85.method915(-31914, var62);
                        this.field85.method915(-31914, var63);
                        this.field85.method915(-31914, var64);
                        this.field85.method1334(917876560, 0.0F);
                        this.field85.method1334(917876560, 1.0F);
                        this.field85.method1334(917876560, (float) var68 * var16 + var65);
                        this.field85.method1334(917876560, (float) var68 * var17 + var66);
                        this.field85.method1334(917876560, (float) var68 * var18 + var67);
                        this.field85.method915(-31914, var61);
                        this.field85.method915(-31914, var62);
                        this.field85.method915(-31914, var63);
                        this.field85.method915(-31914, var64);
                    }
                    if (this.field97[var44] > 64) {
                        int var47 = this.field97[var44] - 65;
                        for (int var48 = this.field96[var47] - 1; var48 >= 0; var48--) {
                            class545 var49 = this.field95[var47][var48];
                            int var50 = var49.field7454;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field7451 >> 12);
                            float var56 = (float) (var49.field7448 >> 12);
                            float var57 = (float) (var49.field7456 >> 12);
                            int var58 = var49.field7447 >> 12;
                            this.field85.method1334(917876560, 0.0F);
                            this.field85.method1334(917876560, 0.0F);
                            this.field85.method1334(917876560, (float) (-var58) * var10 + var55);
                            this.field85.method1334(917876560, (float) (-var58) * var11 + var56);
                            this.field85.method1334(917876560, (float) (-var58) * var12 + var57);
                            this.field85.method915(-31914, var51);
                            this.field85.method915(-31914, var52);
                            this.field85.method915(-31914, var53);
                            this.field85.method915(-31914, var54);
                            this.field85.method1334(917876560, 1.0F);
                            this.field85.method1334(917876560, 0.0F);
                            this.field85.method1334(917876560, (float) var58 * var13 + var55);
                            this.field85.method1334(917876560, (float) var58 * var14 + var56);
                            this.field85.method1334(917876560, (float) var58 * var15 + var57);
                            this.field85.method915(-31914, var51);
                            this.field85.method915(-31914, var52);
                            this.field85.method915(-31914, var53);
                            this.field85.method915(-31914, var54);
                            this.field85.method1334(917876560, 1.0F);
                            this.field85.method1334(917876560, 1.0F);
                            this.field85.method1334(917876560, (float) var58 * var10 + var55);
                            this.field85.method1334(917876560, (float) var58 * var11 + var56);
                            this.field85.method1334(917876560, (float) var58 * var12 + var57);
                            this.field85.method915(-31914, var51);
                            this.field85.method915(-31914, var52);
                            this.field85.method915(-31914, var53);
                            this.field85.method915(-31914, var54);
                            this.field85.method1334(917876560, 0.0F);
                            this.field85.method1334(917876560, 1.0F);
                            this.field85.method1334(917876560, (float) var58 * var16 + var55);
                            this.field85.method1334(917876560, (float) var58 * var17 + var56);
                            this.field85.method1334(917876560, (float) var58 * var18 + var57);
                            this.field85.method915(-31914, var51);
                            this.field85.method915(-31914, var52);
                            this.field85.method915(-31914, var53);
                            this.field85.method915(-31914, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field97[var19] > 64 ? 64 : this.field97[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class545 var34 = this.field98[var19][var21];
                        int var35 = var34.field7454;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field7451 >> 12);
                        float var41 = (float) (var34.field7448 >> 12);
                        float var42 = (float) (var34.field7456 >> 12);
                        int var43 = var34.field7447 >> 12;
                        this.field85.method1332((byte) -13, 0.0F);
                        this.field85.method1332((byte) -13, 0.0F);
                        this.field85.method1332((byte) -13, (float) (-var43) * var10 + var40);
                        this.field85.method1332((byte) -13, (float) (-var43) * var11 + var41);
                        this.field85.method1332((byte) -13, (float) (-var43) * var12 + var42);
                        this.field85.method915(-31914, var36);
                        this.field85.method915(-31914, var37);
                        this.field85.method915(-31914, var38);
                        this.field85.method915(-31914, var39);
                        this.field85.method1332((byte) -13, 1.0F);
                        this.field85.method1332((byte) -13, 0.0F);
                        this.field85.method1332((byte) -13, (float) var43 * var13 + var40);
                        this.field85.method1332((byte) -13, (float) var43 * var14 + var41);
                        this.field85.method1332((byte) -13, (float) var43 * var15 + var42);
                        this.field85.method915(-31914, var36);
                        this.field85.method915(-31914, var37);
                        this.field85.method915(-31914, var38);
                        this.field85.method915(-31914, var39);
                        this.field85.method1332((byte) -13, 1.0F);
                        this.field85.method1332((byte) -13, 1.0F);
                        this.field85.method1332((byte) -13, (float) var43 * var10 + var40);
                        this.field85.method1332((byte) -13, (float) var43 * var11 + var41);
                        this.field85.method1332((byte) -13, (float) var43 * var12 + var42);
                        this.field85.method915(-31914, var36);
                        this.field85.method915(-31914, var37);
                        this.field85.method915(-31914, var38);
                        this.field85.method915(-31914, var39);
                        this.field85.method1332((byte) -13, 0.0F);
                        this.field85.method1332((byte) -13, 1.0F);
                        this.field85.method1332((byte) -13, (float) var43 * var16 + var40);
                        this.field85.method1332((byte) -13, (float) var43 * var17 + var41);
                        this.field85.method1332((byte) -13, (float) var43 * var18 + var42);
                        this.field85.method915(-31914, var36);
                        this.field85.method915(-31914, var37);
                        this.field85.method915(-31914, var38);
                        this.field85.method915(-31914, var39);
                    }
                    if (this.field97[var19] > 64) {
                        int var22 = this.field97[var19] - 64 - 1;
                        for (int var23 = this.field96[var22] - 1; var23 >= 0; var23--) {
                            class545 var24 = this.field95[var22][var23];
                            int var25 = var24.field7454;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field7451 >> 12);
                            float var31 = (float) (var24.field7448 >> 12);
                            float var32 = (float) (var24.field7456 >> 12);
                            int var33 = var24.field7447 >> 12;
                            this.field85.method1332((byte) -13, 0.0F);
                            this.field85.method1332((byte) -13, 0.0F);
                            this.field85.method1332((byte) -13, (float) (-var33) * var10 + var30);
                            this.field85.method1332((byte) -13, (float) (-var33) * var11 + var31);
                            this.field85.method1332((byte) -13, (float) (-var33) * var12 + var32);
                            this.field85.method915(-31914, var26);
                            this.field85.method915(-31914, var27);
                            this.field85.method915(-31914, var28);
                            this.field85.method915(-31914, var29);
                            this.field85.method1332((byte) -13, 1.0F);
                            this.field85.method1332((byte) -13, 0.0F);
                            this.field85.method1332((byte) -13, (float) var33 * var13 + var30);
                            this.field85.method1332((byte) -13, (float) var33 * var14 + var31);
                            this.field85.method1332((byte) -13, (float) var33 * var15 + var32);
                            this.field85.method915(-31914, var26);
                            this.field85.method915(-31914, var27);
                            this.field85.method915(-31914, var28);
                            this.field85.method915(-31914, var29);
                            this.field85.method1332((byte) -13, 1.0F);
                            this.field85.method1332((byte) -13, 1.0F);
                            this.field85.method1332((byte) -13, (float) var33 * var10 + var30);
                            this.field85.method1332((byte) -13, (float) var33 * var11 + var31);
                            this.field85.method1332((byte) -13, (float) var33 * var12 + var32);
                            this.field85.method915(-31914, var26);
                            this.field85.method915(-31914, var27);
                            this.field85.method915(-31914, var28);
                            this.field85.method915(-31914, var29);
                            this.field85.method1332((byte) -13, 0.0F);
                            this.field85.method1332((byte) -13, 1.0F);
                            this.field85.method1332((byte) -13, (float) var33 * var16 + var30);
                            this.field85.method1332((byte) -13, (float) var33 * var17 + var31);
                            this.field85.method1332((byte) -13, (float) var33 * var18 + var32);
                            this.field85.method915(-31914, var26);
                            this.field85.method915(-31914, var27);
                            this.field85.method915(-31914, var28);
                            this.field85.method915(-31914, var29);
                        }
                    }
                }
            }
        }
        if (this.field85.field2219 != 0) {
            this.field89.method1557((byte) 46, this.field85.field2219, this.field85.field2199, 24);
            arg0.method2677(this.field90, null, 17560, this.field92, this.field91);
            arg0.method2691(34842, this.field85.field2219 / 24, 7, 0);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lwv;I)V", line = 595)
    public static final void method51(class423 arg0, int arg1) {
        field78++;
        if (!class38.field507) {
            return;
        }
        class704.field9905++;
        if (arg0.field5634 != null) {
            class423 var2 = class546.method3064(-8, class351.field4679, class369.field4847);
            if (var2 != null) {
                class274 var3 = new class274();
                var3.field3644 = arg0;
                var3.field3639 = arg0.field5634;
                var3.field3650 = var2;
                class656.method3743(var3);
            }
        }
        class229 var4 = class97.method550(class71.field841, false, class60.field751);
        var4.field2971.method958(0, arg0.field5685);
        var4.field2971.method939(arg0.field5552, (byte) 47);
        var4.field2971.method958(0, class351.field4679);
        var4.field2971.method939(class390.field5225, (byte) 105);
        var4.field2971.method939(class369.field4847, (byte) 126);
        if (arg1 > -108) {
            field87 = -95;
        }
        var4.field2971.method946((byte) -77, arg0.field5610);
        class307.method1805(var4, -14704);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lag;B)V", line = 636)
    public final void method52(class469 arg0, byte arg1) {
        field84++;
        if (arg1 == 81) {
            this.field89 = arg0.method2658(null, (byte) -127, 196584, true, 24);
            this.field91 = new class199(this.field89, 5126, 2, 0);
            this.field90 = new class199(this.field89, 5126, 3, 8);
            this.field92 = new class199(this.field89, 5121, 4, 20);
        }
    }
}
