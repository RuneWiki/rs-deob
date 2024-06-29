import jaggl.OpenGL;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iaa")
public class class496 {

    @OriginalMember(owner = "client!iaa", name = "g", descriptor = "[F")
    private float[] field7043 = new float[16];

    @OriginalMember(owner = "client!iaa", name = "i", descriptor = "Lsea;")
    private class699 field7045 = new class699(786336);

    @OriginalMember(owner = "client!iaa", name = "m", descriptor = "I")
    private int field7049 = class181.method1280(1600, 86);

    @OriginalMember(owner = "client!iaa", name = "o", descriptor = "[I")
    private int[] field7051 = new int[1600];

    @OriginalMember(owner = "client!iaa", name = "p", descriptor = "[I")
    private int[] field7052 = new int[64];

    @OriginalMember(owner = "client!iaa", name = "r", descriptor = "[I")
    private int[] field7054 = new int[8191];

    @OriginalMember(owner = "client!iaa", name = "s", descriptor = "I")
    private int field7055 = 0;

    @OriginalMember(owner = "client!iaa", name = "q", descriptor = "[[Lkga;")
    private class547[][] field7053 = new class547[1600][64];

    @OriginalMember(owner = "client!iaa", name = "t", descriptor = "[[Lkga;")
    private class547[][] field7056 = new class547[64][768];

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!iaa", name = "b", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!iaa", name = "c", descriptor = "I")
    public static int field7039;

    @OriginalMember(owner = "client!iaa", name = "d", descriptor = "I")
    public static int field7040;

    @OriginalMember(owner = "client!iaa", name = "e", descriptor = "I")
    public static int field7041;

    @OriginalMember(owner = "client!iaa", name = "f", descriptor = "I")
    public static int field7042;

    @OriginalMember(owner = "client!iaa", name = "h", descriptor = "I")
    public static int field7044;

    @OriginalMember(owner = "client!iaa", name = "j", descriptor = "Lcl;")
    private class268 field7046;

    @OriginalMember(owner = "client!iaa", name = "k", descriptor = "Lcl;")
    private class268 field7047;

    @OriginalMember(owner = "client!iaa", name = "n", descriptor = "Lcl;")
    private class268 field7050;

    @OriginalMember(owner = "client!iaa", name = "l", descriptor = "Lwia;")
    private class761 field7048;

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lwh;I)V", line = 5)
    public final void method2948(class148 arg0, int arg1) {
        if (arg1 != -6924) {
            this.method2952(null, -26, 120, null);
        }
        this.field7048 = arg0.method1046(true, 770, null, 196584, 24);
        field7039++;
        this.field7046 = new class268(this.field7048, 5126, 2, 0);
        this.field7050 = new class268(this.field7048, 5126, 3, 8);
        this.field7047 = new class268(this.field7048, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lwh;B)V", line = 21)
    private final void method2949(class148 arg0, byte arg1) {
        field7044++;
        arg0.method1027(true, true);
        if (arg1 > -89) {
            return;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class51.field740 != arg0.field2259) {
            arg0.method484(class51.field740);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(IBLwh;)V", line = 40)
    private final void method2950(int arg0, byte arg1, class148 arg2) {
        class51.field740 = arg2.field2259;
        field7040++;
        arg2.method1040(3, (float) arg0);
        arg2.method1083(11939);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg2.method1027(false, true);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
        if (arg1 > -88) {
            this.method2950(-104, (byte) -98, null);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(BLwh;)V", line = 57)
    private final void method2951(byte arg0, class148 arg1) {
        if (arg0 != 15) {
            return;
        }
        class51.field740 = arg1.field2259;
        field7037++;
        arg1.method1049(false);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method1027(false, true);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(Lof;IILwh;)V", line = 76)
    public final void method2952(class624 arg0, int arg1, int arg2, class148 arg3) {
        field7038++;
        if (arg3.field2200 == null) {
            return;
        }
        if (arg1 >= 0) {
            this.method2950(arg1, (byte) -121, arg3);
        } else {
            this.method2951((byte) 15, arg3);
        }
        float var5 = arg3.field2200.field8583;
        float var6 = arg3.field2200.field8567;
        float var7 = arg3.field2200.field8581;
        float var8 = arg3.field2200.field8563;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = arg2;
            class361 var12 = arg0.field8738.field5965;
            for (class361 var13 = var12.field5222; var13 != var12; var13 = var13.field5222) {
                class547 var14 = (class547) var13;
                int var15 = (int) ((float) (var14.field7806 >> 12) * var7 + (float) (var14.field7808 >> 12) * var6 + (float) (var14.field7801 >> 12) * var5 + var8);
                if (var11 < var15) {
                    var11 = var15;
                }
                if (var15 < var10) {
                    var10 = var15;
                }
                this.field7054[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 > 1600) {
                var17 = class181.method1280(var16, arg2 + 122) + 1 - this.field7049;
                var16 = (var16 >> var17) + 2;
            } else {
                var16 += 2;
                var17 = 0;
            }
            class361 var18 = var12.field5222;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field7055 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field7051[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field7052[var24] = 0;
                }
                while (var12 != var18) {
                    class547 var25 = (class547) var18;
                    if (var22) {
                        var22 = false;
                        var20 = var25.field7810;
                        var21 = var25.field7809;
                    }
                    if (var19 > 0 && (var25.field7810 != var20 || var21 != var25.field7809)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field7054[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field7051[var26] >= 64) {
                            label107: {
                                if (this.field7051[var26] == 64) {
                                    if (this.field7055 == 64) {
                                        break label107;
                                    }
                                    this.field7051[var26] += this.field7055++ + 1;
                                }
                                this.field7056[this.field7051[var26] - 64 - 1][this.field7052[this.field7051[var26] - 1 - 64]++] = var25;
                            }
                        } else {
                            this.field7053[var26][this.field7051[var26]++] = var25;
                        }
                    }
                    var18 = var18.field5222;
                }
                if (var20 >= 0) {
                    arg3.method1058(var20, -106);
                } else {
                    arg3.method1058(-1, 92);
                }
                if (var21 && class51.field740 != arg3.field2259) {
                    arg3.method484(class51.field740);
                } else if (arg3.field2259 != 1.0F) {
                    arg3.method484(1.0F);
                }
                this.method2953(122, arg3, var16);
            }
        } catch (Exception var27) {
        }
        this.method2949(arg3, (byte) -91);
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILwh;I)V", line = 240)
    private final void method2953(int arg0, class148 arg1, int arg2) {
        field7042++;
        OpenGL.glGetFloatv(2982, this.field7043, 0);
        float var4 = this.field7043[0];
        float var5 = this.field7043[4];
        float var6 = this.field7043[8];
        float var7 = this.field7043[1];
        float var8 = this.field7043[5];
        float var9 = this.field7043[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        if (arg0 < 12) {
            this.field7046 = null;
        }
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field7045.field9084 = 0;
        float var18 = var9 - var6;
        if (arg1.field2211) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field7051[var44] <= 64 ? this.field7051[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class547 var59 = this.field7053[var44][var46];
                        int var60 = var59.field7804;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field7801 >> 12);
                        float var66 = (float) (var59.field7808 >> 12);
                        float var67 = (float) (var59.field7806 >> 12);
                        int var68 = var59.field7800 >> 12;
                        this.field7045.method3968(724, 0.0F);
                        this.field7045.method3968(724, 0.0F);
                        this.field7045.method3968(724, (float) (-var68) * var10 + var65);
                        this.field7045.method3968(724, (float) (-var68) * var11 + var66);
                        this.field7045.method3968(724, (float) (-var68) * var12 + var67);
                        this.field7045.method3730(119, var61);
                        this.field7045.method3730(103, var62);
                        this.field7045.method3730(104, var63);
                        this.field7045.method3730(119, var64);
                        this.field7045.method3968(724, 1.0F);
                        this.field7045.method3968(724, 0.0F);
                        this.field7045.method3968(724, (float) var68 * var13 + var65);
                        this.field7045.method3968(724, (float) var68 * var14 + var66);
                        this.field7045.method3968(724, (float) var68 * var15 + var67);
                        this.field7045.method3730(108, var61);
                        this.field7045.method3730(105, var62);
                        this.field7045.method3730(107, var63);
                        this.field7045.method3730(121, var64);
                        this.field7045.method3968(724, 1.0F);
                        this.field7045.method3968(724, 1.0F);
                        this.field7045.method3968(724, (float) var68 * var10 + var65);
                        this.field7045.method3968(724, (float) var68 * var11 + var66);
                        this.field7045.method3968(724, (float) var68 * var12 + var67);
                        this.field7045.method3730(117, var61);
                        this.field7045.method3730(112, var62);
                        this.field7045.method3730(112, var63);
                        this.field7045.method3730(116, var64);
                        this.field7045.method3968(724, 0.0F);
                        this.field7045.method3968(724, 1.0F);
                        this.field7045.method3968(724, (float) var68 * var16 + var65);
                        this.field7045.method3968(724, (float) var68 * var17 + var66);
                        this.field7045.method3968(724, (float) var68 * var18 + var67);
                        this.field7045.method3730(127, var61);
                        this.field7045.method3730(103, var62);
                        this.field7045.method3730(120, var63);
                        this.field7045.method3730(112, var64);
                    }
                    if (this.field7051[var44] > 64) {
                        int var47 = this.field7051[var44] - 64 - 1;
                        for (int var48 = this.field7052[var47] - 1; var48 >= 0; var48--) {
                            class547 var49 = this.field7056[var47][var48];
                            int var50 = var49.field7804;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field7801 >> 12);
                            float var56 = (float) (var49.field7808 >> 12);
                            float var57 = (float) (var49.field7806 >> 12);
                            int var58 = var49.field7800 >> 12;
                            this.field7045.method3968(724, 0.0F);
                            this.field7045.method3968(724, 0.0F);
                            this.field7045.method3968(724, (float) (-var58) * var10 + var55);
                            this.field7045.method3968(724, (float) (-var58) * var11 + var56);
                            this.field7045.method3968(724, (float) (-var58) * var12 + var57);
                            this.field7045.method3730(101, var51);
                            this.field7045.method3730(123, var52);
                            this.field7045.method3730(120, var53);
                            this.field7045.method3730(111, var54);
                            this.field7045.method3968(724, 1.0F);
                            this.field7045.method3968(724, 0.0F);
                            this.field7045.method3968(724, (float) var58 * var13 + var55);
                            this.field7045.method3968(724, (float) var58 * var14 + var56);
                            this.field7045.method3968(724, (float) var58 * var15 + var57);
                            this.field7045.method3730(106, var51);
                            this.field7045.method3730(127, var52);
                            this.field7045.method3730(125, var53);
                            this.field7045.method3730(101, var54);
                            this.field7045.method3968(724, 1.0F);
                            this.field7045.method3968(724, 1.0F);
                            this.field7045.method3968(724, (float) var58 * var10 + var55);
                            this.field7045.method3968(724, (float) var58 * var11 + var56);
                            this.field7045.method3968(724, (float) var58 * var12 + var57);
                            this.field7045.method3730(124, var51);
                            this.field7045.method3730(104, var52);
                            this.field7045.method3730(124, var53);
                            this.field7045.method3730(115, var54);
                            this.field7045.method3968(724, 0.0F);
                            this.field7045.method3968(724, 1.0F);
                            this.field7045.method3968(724, (float) var58 * var16 + var55);
                            this.field7045.method3968(724, (float) var58 * var17 + var56);
                            this.field7045.method3968(724, (float) var58 * var18 + var57);
                            this.field7045.method3730(106, var51);
                            this.field7045.method3730(126, var52);
                            this.field7045.method3730(105, var53);
                            this.field7045.method3730(110, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field7051[var19] > 64 ? 64 : this.field7051[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class547 var34 = this.field7053[var19][var21];
                        int var35 = var34.field7804;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field7801 >> 12);
                        float var41 = (float) (var34.field7808 >> 12);
                        float var42 = (float) (var34.field7806 >> 12);
                        int var43 = var34.field7800 >> 12;
                        this.field7045.method3967((byte) 38, 0.0F);
                        this.field7045.method3967((byte) 38, 0.0F);
                        this.field7045.method3967((byte) 38, (float) (-var43) * var10 + var40);
                        this.field7045.method3967((byte) 38, (float) (-var43) * var11 + var41);
                        this.field7045.method3967((byte) 38, (float) (-var43) * var12 + var42);
                        this.field7045.method3730(111, var36);
                        this.field7045.method3730(111, var37);
                        this.field7045.method3730(118, var38);
                        this.field7045.method3730(125, var39);
                        this.field7045.method3967((byte) 38, 1.0F);
                        this.field7045.method3967((byte) 38, 0.0F);
                        this.field7045.method3967((byte) 38, (float) var43 * var13 + var40);
                        this.field7045.method3967((byte) 38, (float) var43 * var14 + var41);
                        this.field7045.method3967((byte) 38, (float) var43 * var15 + var42);
                        this.field7045.method3730(119, var36);
                        this.field7045.method3730(123, var37);
                        this.field7045.method3730(122, var38);
                        this.field7045.method3730(108, var39);
                        this.field7045.method3967((byte) 38, 1.0F);
                        this.field7045.method3967((byte) 38, 1.0F);
                        this.field7045.method3967((byte) 38, (float) var43 * var10 + var40);
                        this.field7045.method3967((byte) 38, (float) var43 * var11 + var41);
                        this.field7045.method3967((byte) 38, (float) var43 * var12 + var42);
                        this.field7045.method3730(120, var36);
                        this.field7045.method3730(115, var37);
                        this.field7045.method3730(121, var38);
                        this.field7045.method3730(102, var39);
                        this.field7045.method3967((byte) 38, 0.0F);
                        this.field7045.method3967((byte) 38, 1.0F);
                        this.field7045.method3967((byte) 38, (float) var43 * var16 + var40);
                        this.field7045.method3967((byte) 38, (float) var43 * var17 + var41);
                        this.field7045.method3967((byte) 38, (float) var43 * var18 + var42);
                        this.field7045.method3730(103, var36);
                        this.field7045.method3730(112, var37);
                        this.field7045.method3730(125, var38);
                        this.field7045.method3730(118, var39);
                    }
                    if (this.field7051[var19] > 64) {
                        int var22 = this.field7051[var19] - 65;
                        for (int var23 = this.field7052[var22] - 1; var23 >= 0; var23--) {
                            class547 var24 = this.field7056[var22][var23];
                            int var25 = var24.field7804;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field7801 >> 12);
                            float var31 = (float) (var24.field7808 >> 12);
                            float var32 = (float) (var24.field7806 >> 12);
                            int var33 = var24.field7800 >> 12;
                            this.field7045.method3967((byte) 38, 0.0F);
                            this.field7045.method3967((byte) 38, 0.0F);
                            this.field7045.method3967((byte) 38, (float) (-var33) * var10 + var30);
                            this.field7045.method3967((byte) 38, (float) (-var33) * var11 + var31);
                            this.field7045.method3967((byte) 38, (float) (-var33) * var12 + var32);
                            this.field7045.method3730(122, var26);
                            this.field7045.method3730(110, var27);
                            this.field7045.method3730(122, var28);
                            this.field7045.method3730(118, var29);
                            this.field7045.method3967((byte) 38, 1.0F);
                            this.field7045.method3967((byte) 38, 0.0F);
                            this.field7045.method3967((byte) 38, (float) var33 * var13 + var30);
                            this.field7045.method3967((byte) 38, (float) var33 * var14 + var31);
                            this.field7045.method3967((byte) 38, (float) var33 * var15 + var32);
                            this.field7045.method3730(116, var26);
                            this.field7045.method3730(110, var27);
                            this.field7045.method3730(121, var28);
                            this.field7045.method3730(125, var29);
                            this.field7045.method3967((byte) 38, 1.0F);
                            this.field7045.method3967((byte) 38, 1.0F);
                            this.field7045.method3967((byte) 38, (float) var33 * var10 + var30);
                            this.field7045.method3967((byte) 38, (float) var33 * var11 + var31);
                            this.field7045.method3967((byte) 38, (float) var33 * var12 + var32);
                            this.field7045.method3730(105, var26);
                            this.field7045.method3730(125, var27);
                            this.field7045.method3730(121, var28);
                            this.field7045.method3730(113, var29);
                            this.field7045.method3967((byte) 38, 0.0F);
                            this.field7045.method3967((byte) 38, 1.0F);
                            this.field7045.method3967((byte) 38, (float) var33 * var16 + var30);
                            this.field7045.method3967((byte) 38, (float) var33 * var17 + var31);
                            this.field7045.method3967((byte) 38, (float) var33 * var18 + var32);
                            this.field7045.method3730(105, var26);
                            this.field7045.method3730(123, var27);
                            this.field7045.method3730(105, var28);
                            this.field7045.method3730(104, var29);
                        }
                    }
                }
            }
        }
        if (this.field7045.field9084 != 0) {
            this.field7048.method947(24, this.field7045.field9084, this.field7045.field9068, 5089);
            arg1.method1048(this.field7050, 16384, this.field7047, this.field7046, null);
            arg1.method1075(this.field7045.field9084 / 24, 7, 0, 119);
        }
    }

    @OriginalMember(owner = "client!iaa", name = "a", descriptor = "(ILjava/net/Socket;I)Lbba;", line = 597)
    public static final class115 method2954(int arg0, Socket arg1, int arg2) throws IOException {
        field7041++;
        return arg0 == 5126 ? new class452(arg1, arg2) : null;
    }
}
