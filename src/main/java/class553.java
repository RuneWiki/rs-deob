import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class553 {

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "[F")
    private float[] field7661 = new float[16];

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Lbca;")
    private class501 field7664 = new class501(786336);

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "I")
    private int field7673 = class269.method1718(1600, 0);

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "I")
    private int field7674 = 0;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "[[Lbd;")
    private class484[][] field7676 = new class484[1600][64];

    @OriginalMember(owner = "client!nh", name = "u", descriptor = "[I")
    private int[] field7679 = new int[8191];

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "[I")
    private int[] field7677 = new int[64];

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "[[Lbd;")
    private class484[][] field7678 = new class484[64][768];

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "[I")
    private int[] field7675 = new int[1600];

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[Lsk;")
    public static class495[] field7662 = new class495[14];

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "Z")
    public static boolean field7666 = false;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "I")
    public static int field7659;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field7660;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "I")
    public static int field7663;

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "I")
    public static int field7665;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field7667;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field7668;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "Lpc;")
    private class282 field7669;

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "Lpc;")
    private class282 field7670;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "Lpc;")
    private class282 field7672;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "Lcq;")
    private class305 field7671;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lgka;Llea;IB)V", line = 4)
    public final void method3188(class667 arg0, class573 arg1, int arg2, byte arg3) {
        field7660++;
        if (arg1.field8164 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method3191(arg1, 124);
        } else {
            this.method3190(arg1, 24, arg2);
        }
        float var5 = arg1.field8164.field3363;
        float var6 = arg1.field8164.field3333;
        float var7 = arg1.field8164.field3360;
        float var8 = arg1.field8164.field3325;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            if (arg3 != -116) {
                return;
            }
            int var11 = 0;
            class155 var12 = arg0.field9377.field4973;
            for (class155 var13 = var12.field2450; var13 != var12; var13 = var13.field2450) {
                class484 var14 = (class484) var13;
                int var15 = (int) ((float) (var14.field6685 >> 12) * var7 + (float) (var14.field6684 >> 12) * var6 + (float) (var14.field6681 >> 12) * var5 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                this.field7679[var9++] = var15;
                if (var15 > var11) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class269.method1718(var16, 0) + 1 - this.field7673;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class155 var19 = var12.field2450;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field7674 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field7675[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field7677[var24] = 0;
                }
                while (var12 != var19) {
                    class484 var25 = (class484) var19;
                    if (var22) {
                        var21 = var25.field6690;
                        var22 = false;
                        var20 = var25.field6687;
                    }
                    if (var18 > 0 && (var25.field6687 != var20 || var25.field6690 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field7679[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field7675[var26] < 64) {
                            this.field7676[var26][this.field7675[var26]++] = var25;
                        } else {
                            label100: {
                                if (this.field7675[var26] == 64) {
                                    if (this.field7674 == 64) {
                                        break label100;
                                    }
                                    this.field7675[var26] += this.field7674++ + 1;
                                }
                                class484[] var28 = this.field7678[this.field7675[var26] - 64 - 1];
                                int var10002 = this.field7675[var26] - 65;
                                int var10004 = this.field7677[this.field7675[var26] - 65];
                                this.field7677[var10002] = this.field7677[this.field7675[var26] - 65] + 1;
                                var28[var10004] = var25;
                            }
                        }
                    }
                    var19 = var19.field2450;
                }
                if (var20 < 0) {
                    arg1.method3364(0, -1);
                } else {
                    arg1.method3364(0, var20);
                }
                if (var21 && class552.field7655 != arg1.field8243) {
                    arg1.method516(class552.field7655);
                } else if (arg1.field8243 != 1.0F) {
                    arg1.method516(1.0F);
                }
                this.method3192((byte) 125, arg1, var16);
            }
        } catch (Exception var27) {
        }
        this.method3189(2, arg1);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILlea;)V", line = 168)
    private final void method3189(int arg0, class573 arg1) {
        field7659++;
        arg1.method3377(-32, true);
        if (arg0 != 2) {
            this.field7674 = 103;
        }
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class552.field7655 != arg1.field8243) {
            arg1.method516(class552.field7655);
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Llea;II)V", line = 188)
    private final void method3190(class573 arg0, int arg1, int arg2) {
        if (arg1 != 24) {
            field7666 = true;
        }
        class552.field7655 = arg0.field8243;
        field7663++;
        arg0.method3319((float) arg2, true);
        arg0.method3360(arg1 ^ 0x566B);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method3377(-32, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Llea;I)V", line = 210)
    private final void method3191(class573 arg0, int arg1) {
        field7665++;
        class552.field7655 = arg0.field8243;
        int var3 = -98 % ((arg1 - 25) / 43);
        arg0.method3314(false);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg0.method3377(-32, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(BLlea;I)V", line = 230)
    private final void method3192(byte arg0, class573 arg1, int arg2) {
        field7668++;
        OpenGL.glGetFloatv(2982, this.field7661, 0);
        float var4 = this.field7661[0];
        float var5 = this.field7661[4];
        float var6 = this.field7661[8];
        float var7 = this.field7661[1];
        if (arg0 < 65) {
            return;
        }
        float var8 = this.field7661[5];
        float var9 = this.field7661[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field7664.field5983 = 0;
        float var18 = var9 - var6;
        if (arg1.field8231) {
            for (int var44 = arg2 - 1; var44 >= 0; var44--) {
                int var45 = this.field7675[var44] <= 64 ? this.field7675[var44] : 64;
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class484 var59 = this.field7676[var44][var46];
                        int var60 = var59.field6683;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field6681 >> 12);
                        float var66 = (float) (var59.field6684 >> 12);
                        float var67 = (float) (var59.field6685 >> 12);
                        int var68 = var59.field6689 >> 12;
                        this.field7664.method2926((byte) 67, 0.0F);
                        this.field7664.method2926((byte) 89, 0.0F);
                        this.field7664.method2926((byte) 108, (float) (-var68) * var10 + var65);
                        this.field7664.method2926((byte) 121, (float) (-var68) * var11 + var66);
                        this.field7664.method2926((byte) 92, (float) (-var68) * var12 + var67);
                        this.field7664.method2524(false, var61);
                        this.field7664.method2524(false, var62);
                        this.field7664.method2524(false, var63);
                        this.field7664.method2524(false, var64);
                        this.field7664.method2926((byte) 92, 1.0F);
                        this.field7664.method2926((byte) 66, 0.0F);
                        this.field7664.method2926((byte) 87, (float) var68 * var13 + var65);
                        this.field7664.method2926((byte) 122, (float) var68 * var14 + var66);
                        this.field7664.method2926((byte) 62, (float) var68 * var15 + var67);
                        this.field7664.method2524(false, var61);
                        this.field7664.method2524(false, var62);
                        this.field7664.method2524(false, var63);
                        this.field7664.method2524(false, var64);
                        this.field7664.method2926((byte) 88, 1.0F);
                        this.field7664.method2926((byte) 60, 1.0F);
                        this.field7664.method2926((byte) 68, (float) var68 * var10 + var65);
                        this.field7664.method2926((byte) 113, (float) var68 * var11 + var66);
                        this.field7664.method2926((byte) 101, (float) var68 * var12 + var67);
                        this.field7664.method2524(false, var61);
                        this.field7664.method2524(false, var62);
                        this.field7664.method2524(false, var63);
                        this.field7664.method2524(false, var64);
                        this.field7664.method2926((byte) 117, 0.0F);
                        this.field7664.method2926((byte) 119, 1.0F);
                        this.field7664.method2926((byte) 126, (float) var68 * var16 + var65);
                        this.field7664.method2926((byte) 116, (float) var68 * var17 + var66);
                        this.field7664.method2926((byte) 72, (float) var68 * var18 + var67);
                        this.field7664.method2524(false, var61);
                        this.field7664.method2524(false, var62);
                        this.field7664.method2524(false, var63);
                        this.field7664.method2524(false, var64);
                    }
                    if (this.field7675[var44] > 64) {
                        int var47 = this.field7675[var44] - 64 - 1;
                        for (int var48 = this.field7677[var47] - 1; var48 >= 0; var48--) {
                            class484 var49 = this.field7678[var47][var48];
                            int var50 = var49.field6683;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field6681 >> 12);
                            float var56 = (float) (var49.field6684 >> 12);
                            float var57 = (float) (var49.field6685 >> 12);
                            int var58 = var49.field6689 >> 12;
                            this.field7664.method2926((byte) 125, 0.0F);
                            this.field7664.method2926((byte) 120, 0.0F);
                            this.field7664.method2926((byte) 90, (float) (-var58) * var10 + var55);
                            this.field7664.method2926((byte) 102, (float) (-var58) * var11 + var56);
                            this.field7664.method2926((byte) 86, (float) (-var58) * var12 + var57);
                            this.field7664.method2524(false, var51);
                            this.field7664.method2524(false, var52);
                            this.field7664.method2524(false, var53);
                            this.field7664.method2524(false, var54);
                            this.field7664.method2926((byte) 57, 1.0F);
                            this.field7664.method2926((byte) 80, 0.0F);
                            this.field7664.method2926((byte) 105, (float) var58 * var13 + var55);
                            this.field7664.method2926((byte) 94, (float) var58 * var14 + var56);
                            this.field7664.method2926((byte) 60, (float) var58 * var15 + var57);
                            this.field7664.method2524(false, var51);
                            this.field7664.method2524(false, var52);
                            this.field7664.method2524(false, var53);
                            this.field7664.method2524(false, var54);
                            this.field7664.method2926((byte) 72, 1.0F);
                            this.field7664.method2926((byte) 112, 1.0F);
                            this.field7664.method2926((byte) 96, (float) var58 * var10 + var55);
                            this.field7664.method2926((byte) 84, (float) var58 * var11 + var56);
                            this.field7664.method2926((byte) 91, (float) var58 * var12 + var57);
                            this.field7664.method2524(false, var51);
                            this.field7664.method2524(false, var52);
                            this.field7664.method2524(false, var53);
                            this.field7664.method2524(false, var54);
                            this.field7664.method2926((byte) 81, 0.0F);
                            this.field7664.method2926((byte) 73, 1.0F);
                            this.field7664.method2926((byte) 75, (float) var58 * var16 + var55);
                            this.field7664.method2926((byte) 122, (float) var58 * var17 + var56);
                            this.field7664.method2926((byte) 63, (float) var58 * var18 + var57);
                            this.field7664.method2524(false, var51);
                            this.field7664.method2524(false, var52);
                            this.field7664.method2524(false, var53);
                            this.field7664.method2524(false, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg2 - 1; var19 >= 0; var19--) {
                int var20 = this.field7675[var19] > 64 ? 64 : this.field7675[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class484 var34 = this.field7676[var19][var21];
                        int var35 = var34.field6683;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field6681 >> 12);
                        float var41 = (float) (var34.field6684 >> 12);
                        float var42 = (float) (var34.field6685 >> 12);
                        int var43 = var34.field6689 >> 12;
                        this.field7664.method2925(0.0F, true);
                        this.field7664.method2925(0.0F, true);
                        this.field7664.method2925((float) (-var43) * var10 + var40, true);
                        this.field7664.method2925((float) (-var43) * var11 + var41, true);
                        this.field7664.method2925((float) (-var43) * var12 + var42, true);
                        this.field7664.method2524(false, var36);
                        this.field7664.method2524(false, var37);
                        this.field7664.method2524(false, var38);
                        this.field7664.method2524(false, var39);
                        this.field7664.method2925(1.0F, true);
                        this.field7664.method2925(0.0F, true);
                        this.field7664.method2925((float) var43 * var13 + var40, true);
                        this.field7664.method2925((float) var43 * var14 + var41, true);
                        this.field7664.method2925((float) var43 * var15 + var42, true);
                        this.field7664.method2524(false, var36);
                        this.field7664.method2524(false, var37);
                        this.field7664.method2524(false, var38);
                        this.field7664.method2524(false, var39);
                        this.field7664.method2925(1.0F, true);
                        this.field7664.method2925(1.0F, true);
                        this.field7664.method2925((float) var43 * var10 + var40, true);
                        this.field7664.method2925((float) var43 * var11 + var41, true);
                        this.field7664.method2925((float) var43 * var12 + var42, true);
                        this.field7664.method2524(false, var36);
                        this.field7664.method2524(false, var37);
                        this.field7664.method2524(false, var38);
                        this.field7664.method2524(false, var39);
                        this.field7664.method2925(0.0F, true);
                        this.field7664.method2925(1.0F, true);
                        this.field7664.method2925((float) var43 * var16 + var40, true);
                        this.field7664.method2925((float) var43 * var17 + var41, true);
                        this.field7664.method2925((float) var43 * var18 + var42, true);
                        this.field7664.method2524(false, var36);
                        this.field7664.method2524(false, var37);
                        this.field7664.method2524(false, var38);
                        this.field7664.method2524(false, var39);
                    }
                    if (this.field7675[var19] > 64) {
                        int var22 = this.field7675[var19] - 64 - 1;
                        for (int var23 = this.field7677[var22] - 1; var23 >= 0; var23--) {
                            class484 var24 = this.field7678[var22][var23];
                            int var25 = var24.field6683;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field6681 >> 12);
                            float var31 = (float) (var24.field6684 >> 12);
                            float var32 = (float) (var24.field6685 >> 12);
                            int var33 = var24.field6689 >> 12;
                            this.field7664.method2925(0.0F, true);
                            this.field7664.method2925(0.0F, true);
                            this.field7664.method2925((float) (-var33) * var10 + var30, true);
                            this.field7664.method2925((float) (-var33) * var11 + var31, true);
                            this.field7664.method2925((float) (-var33) * var12 + var32, true);
                            this.field7664.method2524(false, var26);
                            this.field7664.method2524(false, var27);
                            this.field7664.method2524(false, var28);
                            this.field7664.method2524(false, var29);
                            this.field7664.method2925(1.0F, true);
                            this.field7664.method2925(0.0F, true);
                            this.field7664.method2925((float) var33 * var13 + var30, true);
                            this.field7664.method2925((float) var33 * var14 + var31, true);
                            this.field7664.method2925((float) var33 * var15 + var32, true);
                            this.field7664.method2524(false, var26);
                            this.field7664.method2524(false, var27);
                            this.field7664.method2524(false, var28);
                            this.field7664.method2524(false, var29);
                            this.field7664.method2925(1.0F, true);
                            this.field7664.method2925(1.0F, true);
                            this.field7664.method2925((float) var33 * var10 + var30, true);
                            this.field7664.method2925((float) var33 * var11 + var31, true);
                            this.field7664.method2925((float) var33 * var12 + var32, true);
                            this.field7664.method2524(false, var26);
                            this.field7664.method2524(false, var27);
                            this.field7664.method2524(false, var28);
                            this.field7664.method2524(false, var29);
                            this.field7664.method2925(0.0F, true);
                            this.field7664.method2925(1.0F, true);
                            this.field7664.method2925((float) var33 * var16 + var30, true);
                            this.field7664.method2925((float) var33 * var17 + var31, true);
                            this.field7664.method2925((float) var33 * var18 + var32, true);
                            this.field7664.method2524(false, var26);
                            this.field7664.method2524(false, var27);
                            this.field7664.method2524(false, var28);
                            this.field7664.method2524(false, var29);
                        }
                    }
                }
            }
        }
        if (this.field7664.field5983 != 0) {
            this.field7671.method1332(this.field7664.field6002, this.field7664.field5983, 24, 30192);
            arg1.method3344(null, this.field7672, this.field7669, this.field7670, (byte) 121);
            arg1.method3342(7, 122, 0, this.field7664.field5983 / 24);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(Llea;I)V", line = 595)
    public final void method3193(class573 arg0, int arg1) {
        field7667++;
        this.field7671 = arg0.method3336(null, 24, 196584, (byte) 69, true);
        this.field7670 = new class282(this.field7671, arg1, 2, 0);
        this.field7672 = new class282(this.field7671, 5126, 3, 8);
        this.field7669 = new class282(this.field7671, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 613)
    public static void method3194(int arg0) {
        field7662 = null;
        if (arg0 > -52) {
            method3194(76);
        }
    }
}
