import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class384 {

    @OriginalMember(owner = "client!cga", name = "k", descriptor = "[F")
    private float[] field5627 = new float[16];

    @OriginalMember(owner = "client!cga", name = "i", descriptor = "Lij;")
    private class351 field5625 = new class351(786336);

    @OriginalMember(owner = "client!cga", name = "p", descriptor = "I")
    private int field5632 = class122.method983(1600, -257);

    @OriginalMember(owner = "client!cga", name = "s", descriptor = "I")
    private int field5635 = 0;

    @OriginalMember(owner = "client!cga", name = "q", descriptor = "[I")
    private int[] field5633 = new int[8191];

    @OriginalMember(owner = "client!cga", name = "r", descriptor = "[I")
    private int[] field5634 = new int[64];

    @OriginalMember(owner = "client!cga", name = "t", descriptor = "[[Ldg;")
    private class193[][] field5636 = new class193[64][768];

    @OriginalMember(owner = "client!cga", name = "u", descriptor = "[[Ldg;")
    private class193[][] field5637 = new class193[1600][64];

    @OriginalMember(owner = "client!cga", name = "v", descriptor = "[I")
    private int[] field5638 = new int[1600];

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field5617;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field5618;

    @OriginalMember(owner = "client!cga", name = "c", descriptor = "I")
    public static int field5619;

    @OriginalMember(owner = "client!cga", name = "e", descriptor = "I")
    public static int field5621;

    @OriginalMember(owner = "client!cga", name = "f", descriptor = "I")
    public static int field5622;

    @OriginalMember(owner = "client!cga", name = "g", descriptor = "I")
    public static int field5623;

    @OriginalMember(owner = "client!cga", name = "h", descriptor = "I")
    public static int field5624;

    @OriginalMember(owner = "client!cga", name = "j", descriptor = "I")
    public static int field5626;

    @OriginalMember(owner = "client!cga", name = "o", descriptor = "Lnu;")
    private class411 field5631;

    @OriginalMember(owner = "client!cga", name = "l", descriptor = "Lmba;")
    private class70 field5628;

    @OriginalMember(owner = "client!cga", name = "m", descriptor = "Lmba;")
    private class70 field5629;

    @OriginalMember(owner = "client!cga", name = "n", descriptor = "Lmba;")
    private class70 field5630;

    @OriginalMember(owner = "client!cga", name = "d", descriptor = "[I")
    public static int[] field5620;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IILkfa;Lqg;)V", line = 4)
    public final void method2344(int arg0, int arg1, class382 arg2, class272 arg3) {
        field5623++;
        if (arg1 != -662352532) {
            field5620 = null;
        }
        if (arg2.field5491 == null) {
            return;
        }
        if (arg0 >= 0) {
            this.method2352(arg2, arg0, (byte) 80);
        } else {
            this.method2350((byte) -119, arg2);
        }
        float var5 = arg2.field5491.field3996;
        float var6 = arg2.field5491.field4000;
        float var7 = arg2.field5491.field4003;
        float var8 = arg2.field5491.field4029;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class264 var12 = arg3.field3898.field392;
            for (class264 var13 = var12.field3793; var13 != var12; var13 = var13.field3793) {
                class193 var14 = (class193) var13;
                int var15 = (int) ((float) (var14.field2992 >> 12) * var7 + (float) (var14.field2998 >> 12) * var5 + (float) (var14.field2994 >> 12) * var6 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field5633[var9++] = var15;
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class122.method983(var16, -257) + 1 - this.field5632;
                var16 = (var16 >> var17) + 2;
            }
            int var18 = 0;
            class264 var19 = var12.field3793;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field5635 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field5638[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field5634[var24] = 0;
                }
                while (var12 != var19) {
                    class193 var25 = (class193) var19;
                    if (var22) {
                        var21 = var25.field2997;
                        var22 = false;
                        var20 = var25.field2995;
                    }
                    if (var18 > 0 && (var25.field2995 != var20 || var25.field2997 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field5633[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field5638[var26] < 64) {
                            this.field5637[var26][this.field5638[var26]++] = var25;
                        } else {
                            label104: {
                                if (this.field5638[var26] == 64) {
                                    if (this.field5635 == 64) {
                                        break label104;
                                    }
                                    this.field5638[var26] += (this.field5635++) + 1;
                                }
                                this.field5636[this.field5638[var26] - 64 - 1][this.field5634[this.field5638[var26] - 64 - 1]++] = var25;
                            }
                        }
                    }
                    var19 = var19.field3793;
                }
                if (var20 >= 0) {
                    arg2.method2321(arg1 + 662351421, var20);
                } else {
                    arg2.method2321(-1111, -1);
                }
                if (var21 && class455.field6543 != arg2.field5499) {
                    arg2.method794(class455.field6543);
                } else if (arg2.field5499 != 1.0F) {
                    arg2.method794(1.0F);
                }
                this.method2346(arg1 + 662374462, var16, arg2);
            }
        } catch (Exception var27) {
        }
        this.method2349(121, arg2);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lhw;I)V", line = 174)
    public static final void method2345(class270 arg0, int arg1) {
        if (arg1 != 27081) {
            return;
        }
        field5618++;
        class693 var2 = (class693) class260.field3749.method2818(-22803, (long) arg0.field2427);
        if (var2 == null) {
            return;
        }
        if (var2.field9843 != null) {
            class387.field5675.method3092(var2.field9843);
            var2.field9843 = null;
        }
        var2.method2549((byte) 61);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IILkfa;)V", line = 200)
    private final void method2346(int arg0, int arg1, class382 arg2) {
        OpenGL.glGetFloatv(2982, this.field5627, 0);
        field5626++;
        float var4 = this.field5627[0];
        float var5 = this.field5627[4];
        float var6 = this.field5627[8];
        if (arg0 != 21930) {
            this.field5636 = null;
        }
        float var7 = this.field5627[1];
        float var8 = this.field5627[5];
        float var9 = this.field5627[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        this.field5625.field6710 = 0;
        float var18 = var9 - var6;
        if (arg2.field5558) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field5638[var44] > 64 ? 64 : this.field5638[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class193 var59 = this.field5637[var44][var46];
                        int var60 = var59.field2996;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field2998 >> 12);
                        float var66 = (float) (var59.field2994 >> 12);
                        float var67 = (float) (var59.field2992 >> 12);
                        int var68 = var59.field2987 >> 12;
                        this.field5625.method2130(0.0F, false);
                        this.field5625.method2130(0.0F, false);
                        this.field5625.method2130((float) (-var68) * var10 + var65, false);
                        this.field5625.method2130((float) (-var68) * var11 + var66, false);
                        this.field5625.method2130((float) (-var68) * var12 + var67, false);
                        this.field5625.method2753((byte) 72, var61);
                        this.field5625.method2753((byte) 93, var62);
                        this.field5625.method2753((byte) 95, var63);
                        this.field5625.method2753((byte) 85, var64);
                        this.field5625.method2130(1.0F, false);
                        this.field5625.method2130(0.0F, false);
                        this.field5625.method2130((float) var68 * var13 + var65, false);
                        this.field5625.method2130((float) var68 * var14 + var66, false);
                        this.field5625.method2130((float) var68 * var15 + var67, false);
                        this.field5625.method2753((byte) 67, var61);
                        this.field5625.method2753((byte) 65, var62);
                        this.field5625.method2753((byte) 124, var63);
                        this.field5625.method2753((byte) 123, var64);
                        this.field5625.method2130(1.0F, false);
                        this.field5625.method2130(1.0F, false);
                        this.field5625.method2130((float) var68 * var10 + var65, false);
                        this.field5625.method2130((float) var68 * var11 + var66, false);
                        this.field5625.method2130((float) var68 * var12 + var67, false);
                        this.field5625.method2753((byte) 93, var61);
                        this.field5625.method2753((byte) 119, var62);
                        this.field5625.method2753((byte) 92, var63);
                        this.field5625.method2753((byte) 94, var64);
                        this.field5625.method2130(0.0F, false);
                        this.field5625.method2130(1.0F, false);
                        this.field5625.method2130((float) var68 * var16 + var65, false);
                        this.field5625.method2130((float) var68 * var17 + var66, false);
                        this.field5625.method2130((float) var68 * var18 + var67, false);
                        this.field5625.method2753((byte) 111, var61);
                        this.field5625.method2753((byte) 127, var62);
                        this.field5625.method2753((byte) 52, var63);
                        this.field5625.method2753((byte) 54, var64);
                    }
                    if (this.field5638[var44] > 64) {
                        int var47 = this.field5638[var44] - 65;
                        for (int var48 = this.field5634[var47] - 1; var48 >= 0; var48--) {
                            class193 var49 = this.field5636[var47][var48];
                            int var50 = var49.field2996;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field2998 >> 12);
                            float var56 = (float) (var49.field2994 >> 12);
                            float var57 = (float) (var49.field2992 >> 12);
                            int var58 = var49.field2987 >> 12;
                            this.field5625.method2130(0.0F, false);
                            this.field5625.method2130(0.0F, false);
                            this.field5625.method2130((float) (-var58) * var10 + var55, false);
                            this.field5625.method2130((float) (-var58) * var11 + var56, false);
                            this.field5625.method2130((float) (-var58) * var12 + var57, false);
                            this.field5625.method2753((byte) 78, var51);
                            this.field5625.method2753((byte) 56, var52);
                            this.field5625.method2753((byte) 108, var53);
                            this.field5625.method2753((byte) 123, var54);
                            this.field5625.method2130(1.0F, false);
                            this.field5625.method2130(0.0F, false);
                            this.field5625.method2130((float) var58 * var13 + var55, false);
                            this.field5625.method2130((float) var58 * var14 + var56, false);
                            this.field5625.method2130((float) var58 * var15 + var57, false);
                            this.field5625.method2753((byte) 112, var51);
                            this.field5625.method2753((byte) 115, var52);
                            this.field5625.method2753((byte) 86, var53);
                            this.field5625.method2753((byte) 92, var54);
                            this.field5625.method2130(1.0F, false);
                            this.field5625.method2130(1.0F, false);
                            this.field5625.method2130((float) var58 * var10 + var55, false);
                            this.field5625.method2130((float) var58 * var11 + var56, false);
                            this.field5625.method2130((float) var58 * var12 + var57, false);
                            this.field5625.method2753((byte) 62, var51);
                            this.field5625.method2753((byte) 115, var52);
                            this.field5625.method2753((byte) 94, var53);
                            this.field5625.method2753((byte) 62, var54);
                            this.field5625.method2130(0.0F, false);
                            this.field5625.method2130(1.0F, false);
                            this.field5625.method2130((float) var58 * var16 + var55, false);
                            this.field5625.method2130((float) var58 * var17 + var56, false);
                            this.field5625.method2130((float) var58 * var18 + var57, false);
                            this.field5625.method2753((byte) 78, var51);
                            this.field5625.method2753((byte) 67, var52);
                            this.field5625.method2753((byte) 61, var53);
                            this.field5625.method2753((byte) 87, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field5638[var19] > 64 ? 64 : this.field5638[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class193 var34 = this.field5637[var19][var21];
                        int var35 = var34.field2996;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field2998 >> 12);
                        float var41 = (float) (var34.field2994 >> 12);
                        float var42 = (float) (var34.field2992 >> 12);
                        int var43 = var34.field2987 >> 12;
                        this.field5625.method2129(false, 0.0F);
                        this.field5625.method2129(false, 0.0F);
                        this.field5625.method2129(false, (float) (-var43) * var10 + var40);
                        this.field5625.method2129(false, (float) (-var43) * var11 + var41);
                        this.field5625.method2129(false, (float) (-var43) * var12 + var42);
                        this.field5625.method2753((byte) 53, var36);
                        this.field5625.method2753((byte) 86, var37);
                        this.field5625.method2753((byte) 80, var38);
                        this.field5625.method2753((byte) 63, var39);
                        this.field5625.method2129(false, 1.0F);
                        this.field5625.method2129(false, 0.0F);
                        this.field5625.method2129(false, (float) var43 * var13 + var40);
                        this.field5625.method2129(false, (float) var43 * var14 + var41);
                        this.field5625.method2129(false, (float) var43 * var15 + var42);
                        this.field5625.method2753((byte) 67, var36);
                        this.field5625.method2753((byte) 79, var37);
                        this.field5625.method2753((byte) 116, var38);
                        this.field5625.method2753((byte) 86, var39);
                        this.field5625.method2129(false, 1.0F);
                        this.field5625.method2129(false, 1.0F);
                        this.field5625.method2129(false, (float) var43 * var10 + var40);
                        this.field5625.method2129(false, (float) var43 * var11 + var41);
                        this.field5625.method2129(false, (float) var43 * var12 + var42);
                        this.field5625.method2753((byte) 107, var36);
                        this.field5625.method2753((byte) 98, var37);
                        this.field5625.method2753((byte) 63, var38);
                        this.field5625.method2753((byte) 83, var39);
                        this.field5625.method2129(false, 0.0F);
                        this.field5625.method2129(false, 1.0F);
                        this.field5625.method2129(false, (float) var43 * var16 + var40);
                        this.field5625.method2129(false, (float) var43 * var17 + var41);
                        this.field5625.method2129(false, (float) var43 * var18 + var42);
                        this.field5625.method2753((byte) 124, var36);
                        this.field5625.method2753((byte) 50, var37);
                        this.field5625.method2753((byte) 65, var38);
                        this.field5625.method2753((byte) 110, var39);
                    }
                    if (this.field5638[var19] > 64) {
                        int var22 = this.field5638[var19] - 65;
                        for (int var23 = this.field5634[var22] - 1; var23 >= 0; var23--) {
                            class193 var24 = this.field5636[var22][var23];
                            int var25 = var24.field2996;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field2998 >> 12);
                            float var31 = (float) (var24.field2994 >> 12);
                            float var32 = (float) (var24.field2992 >> 12);
                            int var33 = var24.field2987 >> 12;
                            this.field5625.method2129(false, 0.0F);
                            this.field5625.method2129(false, 0.0F);
                            this.field5625.method2129(false, (float) (-var33) * var10 + var30);
                            this.field5625.method2129(false, (float) (-var33) * var11 + var31);
                            this.field5625.method2129(false, (float) (-var33) * var12 + var32);
                            this.field5625.method2753((byte) 74, var26);
                            this.field5625.method2753((byte) 106, var27);
                            this.field5625.method2753((byte) 84, var28);
                            this.field5625.method2753((byte) 100, var29);
                            this.field5625.method2129(false, 1.0F);
                            this.field5625.method2129(false, 0.0F);
                            this.field5625.method2129(false, (float) var33 * var13 + var30);
                            this.field5625.method2129(false, (float) var33 * var14 + var31);
                            this.field5625.method2129(false, (float) var33 * var15 + var32);
                            this.field5625.method2753((byte) 97, var26);
                            this.field5625.method2753((byte) 102, var27);
                            this.field5625.method2753((byte) 61, var28);
                            this.field5625.method2753((byte) 81, var29);
                            this.field5625.method2129(false, 1.0F);
                            this.field5625.method2129(false, 1.0F);
                            this.field5625.method2129(false, (float) var33 * var10 + var30);
                            this.field5625.method2129(false, (float) var33 * var11 + var31);
                            this.field5625.method2129(false, (float) var33 * var12 + var32);
                            this.field5625.method2753((byte) 88, var26);
                            this.field5625.method2753((byte) 92, var27);
                            this.field5625.method2753((byte) 126, var28);
                            this.field5625.method2753((byte) 118, var29);
                            this.field5625.method2129(false, 0.0F);
                            this.field5625.method2129(false, 1.0F);
                            this.field5625.method2129(false, (float) var33 * var16 + var30);
                            this.field5625.method2129(false, (float) var33 * var17 + var31);
                            this.field5625.method2129(false, (float) var33 * var18 + var32);
                            this.field5625.method2753((byte) 126, var26);
                            this.field5625.method2753((byte) 100, var27);
                            this.field5625.method2753((byte) 114, var28);
                            this.field5625.method2753((byte) 109, var29);
                        }
                    }
                }
            }
        }
        if (this.field5625.field6710 != 0) {
            this.field5631.method2453(this.field5625.field6719, 24, 12500, this.field5625.field6710);
            arg2.method2336((byte) -98, null, this.field5628, this.field5630, this.field5629);
            arg2.method2286(51, 7, this.field5625.field6710 / 24, 0);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(B)V", line = 555)
    public static void method2347(byte arg0) {
        if (arg0 < -114) {
            field5620 = null;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IB)Z", line = 565)
    public static final boolean method2348(int arg0, byte arg1) {
        field5622++;
        if (arg1 >= -67) {
            return false;
        } else {
            return arg0 == 3 || arg0 == 4;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ILkfa;)V", line = 576)
    private final void method2349(int arg0, class382 arg1) {
        field5621++;
        int var3 = -101 % ((80 - arg0) / 36);
        arg1.method2275(true, 77);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class455.field6543 != arg1.field5499) {
            arg1.method794(class455.field6543);
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(BLkfa;)V", line = 599)
    private final void method2350(byte arg0, class382 arg1) {
        class455.field6543 = arg1.field5499;
        field5624++;
        int var3 = -70 / ((arg0 + 52) / 56);
        arg1.method2311(true);
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method2275(false, 112);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "(BLkfa;)V", line = 615)
    public final void method2351(byte arg0, class382 arg1) {
        this.field5631 = arg1.method2283((byte) 73, null, 24, true, 196584);
        if (arg0 != 54) {
            method2345(null, -10);
        }
        field5619++;
        this.field5629 = new class70(this.field5631, 5126, 2, 0);
        this.field5628 = new class70(this.field5631, 5126, 3, 8);
        this.field5630 = new class70(this.field5631, 5121, 4, 20);
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(Lkfa;IB)V", line = 637)
    private final void method2352(class382 arg0, int arg1, byte arg2) {
        class455.field6543 = arg0.field5499;
        field5617++;
        arg0.method2259(9801, (float) arg1);
        arg0.method2269(16);
        OpenGL.glDisable(16384);
        if (arg2 <= 1) {
            this.field5638 = null;
        }
        OpenGL.glDisable(16385);
        arg0.method2275(false, 125);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }
}
