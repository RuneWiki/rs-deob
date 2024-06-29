import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class301 {

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "[I")
    private int[] field4482 = new int[8191];

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "[[Lvh;")
    private class332[][] field4484 = new class332[64][768];

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "I")
    private int field4486 = 0;

    @OriginalMember(owner = "client!hp", name = "p", descriptor = "[I")
    private int[] field4488 = new int[1600];

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "[[Lvh;")
    private class332[][] field4481 = new class332[1600][64];

    @OriginalMember(owner = "client!hp", name = "r", descriptor = "[I")
    private int[] field4490 = new int[64];

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Lkr;")
    private class693 field4478;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "Lwl;")
    private class378 field4473;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "Lwl;")
    private class378 field4476;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "Lor;")
    private class595 field4494;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Z")
    public static boolean field4474 = false;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "Lqfa;")
    public static class85 field4479 = new class85(73, -2);

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "Ljava/util/Random;")
    public static Random field4493 = new Random();

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "[B")
    public static byte[] field4499 = new byte[2048];

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "Z")
    public static boolean field4500 = true;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!hp", name = "o", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!hp", name = "q", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lom;")
    public static class344 field4477;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "Lcj;")
    public static class646 field4497;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLcf;)V")
    public final void method1980(byte arg0, class562 arg1) {
        field4496++;
        this.field4473.method2164(24, 3573, 786336);
        if (arg0 >= -122) {
            field4474 = false;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lcf;I)V")
    private final void method1981(class562 arg0, int arg1) {
        class304.field4512 = arg0.field8157;
        if (arg1 != 1208036920) {
            return;
        }
        field4485++;
        arg0.method3204(-9);
        arg0.method3225(false, -101);
        arg0.method3253(-25293, false);
        arg0.method3239(0);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lcf;IB)V")
    private final void method1982(class562 arg0, int arg1, byte arg2) {
        field4489++;
        class304.field4512 = arg0.field8157;
        arg0.method3213((float) arg1, arg2 - 3);
        arg0.method3229((byte) 20);
        arg0.method3225(false, arg2 ^ 0xFFFFFFCE);
        arg0.method3253(-25293, false);
        arg0.method3239(0);
        if (arg2 != 90) {
            this.method1984((byte) 91, 28, null);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IILcf;Lfi;)V")
    public final void method1983(int arg0, int arg1, class562 arg2, class518 arg3) {
        field4480++;
        if (arg2.field8100 == null) {
            return;
        }
        if (~arg0 <= arg1) {
            this.method1982(arg2, arg0, (byte) 90);
        } else {
            this.method1981(arg2, 1208036920);
        }
        float var5 = arg2.field8100.field5723;
        float var6 = arg2.field8100.field5735;
        float var7 = arg2.field8100.field5737;
        float var8 = arg2.field8100.field5706;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class347 var12 = arg3.field7307.field3152;
            for (class347 var13 = var12.field5168; var13 != var12; var13 = var13.field5168) {
                class332 var14 = (class332) var13;
                int var15 = (int) ((float) (var14.field4837 >> 12) * var7 + (float) (var14.field4833 >> 12) * var6 + (float) (var14.field4831 >> 12) * var5 + var8);
                this.field4482[var9++] = var15;
                if (var15 > var11) {
                    var11 = var15;
                }
                if (var10 > var15) {
                    var10 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if ((var16 + 2) > 1600) {
                var17 = 1 - (class65.field1436 - class608.method3498(var16, (byte) -89));
                var16 = (var16 >> var17) + 2;
            } else {
                var17 = 0;
                var16 += 2;
            }
            int var18 = 0;
            class347 var19 = var12.field5168;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var19) {
                this.field4486 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field4488[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field4490[var24] = 0;
                }
                while (var12 != var19) {
                    class332 var25 = (class332) var19;
                    if (var22) {
                        var20 = var25.field4840;
                        var22 = false;
                        var21 = var25.field4830;
                    }
                    if (var18 > 0 && (var25.field4840 != var20 || var25.field4830 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field4482[var18++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field4488[var26] >= 64) {
                            label102: {
                                if (this.field4488[var26] == 64) {
                                    if (this.field4486 == 64) {
                                        break label102;
                                    }
                                    this.field4488[var26] += (this.field4486++) + 1;
                                }
                                this.field4484[this.field4488[var26] - 1 - 64][this.field4490[this.field4488[var26] - 1 - 64]++] = var25;
                            }
                        } else {
                            this.field4481[var26][this.field4488[var26]++] = var25;
                        }
                    }
                    var19 = var19.field5168;
                }
                arg2.method3222(var20 < 0 ? -1 : var20, (byte) -118, false, false);
                if (var21 && class304.field4512 != arg2.field8157) {
                    arg2.method143(class304.field4512);
                } else if (arg2.field8157 != 1.0F) {
                    arg2.method143(1.0F);
                }
                this.method1984((byte) 126, var16, arg2);
            }
        } catch (Exception var27) {
        }
        this.method1986(arg2, arg1 ^ 0x7D);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BILcf;)V")
    private final void method1984(byte arg0, int arg1, class562 arg2) {
        field4483++;
        int var4 = 0;
        if (arg0 <= 66) {
            this.method1984((byte) -38, -128, null);
        }
        class391 var5 = arg2.method3191((byte) -122);
        float var6 = var5.field5721;
        float var7 = var5.field5703;
        float var8 = var5.field5733;
        float var9 = var5.field5711;
        float var10 = var5.field5701;
        float var11 = var5.field5707;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field4473.method2167(-1926, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg2.method3219(var21, 1009);
        if (Stream.method3580()) {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field4488[var48] <= 64 ? this.field4488[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class332 var63 = this.field4481[var48][var50];
                        int var64 = var63.field4835;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field4831 >> 12);
                        float var70 = (float) (var63.field4833 >> 12);
                        float var71 = (float) (var63.field4837 >> 12);
                        int var72 = var63.field4838 >> 12;
                        var22.method3582((float) (-var72) * var12 + var69);
                        var22.method3582((float) (-var72) * var13 + var70);
                        var22.method3582((float) (-var72) * var14 + var71);
                        if (arg2.field8161 == 0) {
                            var22.method3578(var65, var66, var67, var68);
                        } else {
                            var22.method3572(var65, var66, var67, var68);
                        }
                        var22.method3582(0.0F);
                        var22.method3582(0.0F);
                        var22.method3582((float) var72 * var15 + var69);
                        var22.method3582((float) var72 * var16 + var70);
                        var22.method3582((float) var72 * var17 + var71);
                        if (arg2.field8161 == 0) {
                            var22.method3578(var65, var66, var67, var68);
                        } else {
                            var22.method3572(var65, var66, var67, var68);
                        }
                        var22.method3582(1.0F);
                        var22.method3582(0.0F);
                        var22.method3582((float) var72 * var12 + var69);
                        var22.method3582((float) var72 * var13 + var70);
                        var22.method3582((float) var72 * var14 + var71);
                        if (arg2.field8161 == 0) {
                            var22.method3578(var65, var66, var67, var68);
                        } else {
                            var22.method3572(var65, var66, var67, var68);
                        }
                        var22.method3582(1.0F);
                        var22.method3582(1.0F);
                        var22.method3582((float) var72 * var18 + var69);
                        var22.method3582((float) var72 * var19 + var70);
                        var22.method3582((float) var72 * var20 + var71);
                        if (arg2.field8161 == 0) {
                            var22.method3578(var65, var66, var67, var68);
                        } else {
                            var22.method3572(var65, var66, var67, var68);
                        }
                        var22.method3582(0.0F);
                        var22.method3582(1.0F);
                        var4++;
                    }
                    if (this.field4488[var48] > 64) {
                        int var51 = this.field4488[var48] - 1 - 64;
                        for (int var52 = this.field4490[var51] - 1; var52 >= 0; var52--) {
                            class332 var53 = this.field4484[var51][var52];
                            int var54 = var53.field4835;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field4831 >> 12);
                            float var60 = (float) (var53.field4833 >> 12);
                            float var61 = (float) (var53.field4837 >> 12);
                            int var62 = var53.field4838 >> 12;
                            var22.method3582((float) (-var62) * var12 + var59);
                            var22.method3582((float) (-var62) * var13 + var60);
                            var22.method3582((float) (-var62) * var14 + var61);
                            if (arg2.field8161 == 0) {
                                var22.method3578(var55, var56, var57, var58);
                            } else {
                                var22.method3572(var55, var56, var57, var58);
                            }
                            var22.method3582(0.0F);
                            var22.method3582(0.0F);
                            var22.method3582((float) var62 * var15 + var59);
                            var22.method3582((float) var62 * var16 + var60);
                            var22.method3582((float) var62 * var17 + var61);
                            if (arg2.field8161 == 0) {
                                var22.method3578(var55, var56, var57, var58);
                            } else {
                                var22.method3572(var55, var56, var57, var58);
                            }
                            var22.method3582(1.0F);
                            var22.method3582(0.0F);
                            var22.method3582((float) var62 * var12 + var59);
                            var22.method3582((float) var62 * var13 + var60);
                            var22.method3582((float) var62 * var14 + var61);
                            if (arg2.field8161 == 0) {
                                var22.method3578(var55, var56, var57, var58);
                            } else {
                                var22.method3572(var55, var56, var57, var58);
                            }
                            var22.method3582(1.0F);
                            var22.method3582(1.0F);
                            var22.method3582((float) var62 * var18 + var59);
                            var22.method3582((float) var62 * var19 + var60);
                            var22.method3582((float) var62 * var20 + var61);
                            if (arg2.field8161 == 0) {
                                var22.method3578(var55, var56, var57, var58);
                            } else {
                                var22.method3572(var55, var56, var57, var58);
                            }
                            var22.method3582(0.0F);
                            var4++;
                            var22.method3582(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field4488[var23] > 64 ? 64 : this.field4488[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class332 var38 = this.field4481[var23][var25];
                        int var39 = var38.field4835;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field4831 >> 12);
                        float var45 = (float) (var38.field4833 >> 12);
                        float var46 = (float) (var38.field4837 >> 12);
                        int var47 = var38.field4838 >> 12;
                        var22.method3584((float) (-var47) * var12 + var44);
                        var22.method3584((float) (-var47) * var13 + var45);
                        var22.method3584((float) (-var47) * var14 + var46);
                        if (arg2.field8161 == 0) {
                            var22.method3578(var40, var41, var42, var43);
                        } else {
                            var22.method3572(var40, var41, var42, var43);
                        }
                        var22.method3584(0.0F);
                        var22.method3584(0.0F);
                        var22.method3584((float) var47 * var15 + var44);
                        var22.method3584((float) var47 * var16 + var45);
                        var22.method3584((float) var47 * var17 + var46);
                        if (arg2.field8161 == 0) {
                            var22.method3578(var40, var41, var42, var43);
                        } else {
                            var22.method3572(var40, var41, var42, var43);
                        }
                        var22.method3584(1.0F);
                        var22.method3584(0.0F);
                        var22.method3584((float) var47 * var12 + var44);
                        var22.method3584((float) var47 * var13 + var45);
                        var22.method3584((float) var47 * var14 + var46);
                        if (arg2.field8161 == 0) {
                            var22.method3578(var40, var41, var42, var43);
                        } else {
                            var22.method3572(var40, var41, var42, var43);
                        }
                        var22.method3584(1.0F);
                        var22.method3584(1.0F);
                        var22.method3584((float) var47 * var18 + var44);
                        var22.method3584((float) var47 * var19 + var45);
                        var22.method3584((float) var47 * var20 + var46);
                        if (arg2.field8161 == 0) {
                            var22.method3578(var40, var41, var42, var43);
                        } else {
                            var22.method3572(var40, var41, var42, var43);
                        }
                        var22.method3584(0.0F);
                        var4++;
                        var22.method3584(1.0F);
                    }
                    if (this.field4488[var23] > 64) {
                        int var26 = this.field4488[var23] - 64 - 1;
                        for (int var27 = this.field4490[var26] - 1; var27 >= 0; var27--) {
                            class332 var28 = this.field4484[var26][var27];
                            int var29 = var28.field4835;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field4831 >> 12);
                            float var35 = (float) (var28.field4833 >> 12);
                            float var36 = (float) (var28.field4837 >> 12);
                            int var37 = var28.field4838 >> 12;
                            var22.method3584((float) (-var37) * var12 + var34);
                            var22.method3584((float) (-var37) * var13 + var35);
                            var22.method3584((float) (-var37) * var14 + var36);
                            if (arg2.field8161 == 0) {
                                var22.method3578(var30, var31, var32, var33);
                            } else {
                                var22.method3572(var30, var31, var32, var33);
                            }
                            var22.method3584(0.0F);
                            var22.method3584(0.0F);
                            var22.method3584((float) var37 * var15 + var34);
                            var22.method3584((float) var37 * var16 + var35);
                            var22.method3584((float) var37 * var17 + var36);
                            if (arg2.field8161 == 0) {
                                var22.method3578(var30, var31, var32, var33);
                            } else {
                                var22.method3572(var30, var31, var32, var33);
                            }
                            var22.method3584(1.0F);
                            var22.method3584(0.0F);
                            var22.method3584((float) var37 * var12 + var34);
                            var22.method3584((float) var37 * var13 + var35);
                            var22.method3584((float) var37 * var14 + var36);
                            if (arg2.field8161 == 0) {
                                var22.method3578(var30, var31, var32, var33);
                            } else {
                                var22.method3572(var30, var31, var32, var33);
                            }
                            var22.method3584(1.0F);
                            var22.method3584(1.0F);
                            var22.method3584((float) var37 * var18 + var34);
                            var22.method3584((float) var37 * var19 + var35);
                            var22.method3584((float) var37 * var20 + var36);
                            if (arg2.field8161 == 0) {
                                var22.method3578(var30, var31, var32, var33);
                            } else {
                                var22.method3572(var30, var31, var32, var33);
                            }
                            var22.method3584(0.0F);
                            var4++;
                            var22.method3584(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3576();
        if (this.field4473.method2169((byte) -117)) {
            arg2.method2873(1, 0, this.field4473);
            arg2.method2873(1, 1, this.field4476);
            arg2.method2862(13427, this.field4478);
            arg2.method2872(class634.field9107, 0, -116, var4 * 4, 0, var4 * 2, this.field4494);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)V")
    public static final void method1985(int arg0, int arg1) {
        field4498++;
        class19 var2 = class373.method2355(71, arg1, 5);
        if (arg0 != 0) {
            method1990(16);
        }
        var2.method438(arg0 + 806);
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(Lcf;I)V")
    private final void method1986(class562 arg0, int arg1) {
        field4492++;
        arg0.method3253(-25293, true);
        arg0.method3225(true, -80);
        if (class304.field4512 != arg0.field8157) {
            arg0.method143(class304.field4512);
        }
        if (arg1 > -125) {
            this.method1982(null, -49, (byte) 5);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IIIIII)V")
    public static final void method1987(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4475++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = -34 % ((50 - arg4) / 55);
        int var9 = arg2 * arg2;
        int var10 = arg5 * arg5;
        int var11 = var10 << 1;
        int var12 = var9 << 1;
        int var13 = arg5 << 1;
        int var14 = (1 - var13) * var9 + var11;
        int var15 = var10 - (var13 - 1) * var12;
        int var16 = var9 << 2;
        int var17 = var10 << 2;
        int var18 = ((var6 << 1) + 3) * var11;
        int var19 = ((arg5 << 1) - 3) * var12;
        int var20 = (var6 + 1) * var17;
        int var21 = (arg5 - 1) * var16;
        class705.method3938(arg2 + arg3, arg0, 30336, arg3 - arg2, class582.field8429[arg1]);
        while (var7 > 0) {
            if (var14 < 0) {
                while (var14 < 0) {
                    var14 += var18;
                    var15 += var20;
                    var18 += var17;
                    var6++;
                    var20 += var17;
                }
            }
            if (var15 < 0) {
                var14 += var18;
                var15 += var20;
                var6++;
                var20 += var17;
                var18 += var17;
            }
            var14 += -var21;
            var15 += -var19;
            var21 -= var16;
            var7--;
            var19 -= var16;
            int var22 = arg1 - var7;
            int var23 = arg1 + var7;
            int var24 = arg3 + var6;
            int var25 = arg3 - var6;
            class705.method3938(var24, arg0, 30336, var25, class582.field8429[var22]);
            class705.method3938(var24, arg0, 30336, var25, class582.field8429[var23]);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V")
    public final void method1988(byte arg0) {
        int var2 = -18 / ((62 - arg0) / 42);
        field4495++;
        this.field4473.method382((byte) 109);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static void method1989(int arg0) {
        if (arg0 > -44) {
            field4500 = false;
        }
        field4499 = null;
        field4477 = null;
        field4479 = null;
        field4493 = null;
        field4497 = null;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(I)[Lja;")
    public static final class254[] method1990(int arg0) {
        field4491++;
        if (arg0 != 279527169) {
            field4487 = 17;
        }
        return new class254[] { class536.field7508, class543.field7581, class463.field6596, class473.field6705, class195.field3067, class438.field6318, class497.field7078, class706.field9937, class81.field1586, class544.field7586, class114.field2050, class547.field7771, class501.field7126, class499.field7107 };
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lcf;)V")
    public class301(class562 arg0) {
        this.field4478 = arg0.method2878(-28, new class30[] { new class30(new class14[] { class14.field731, class14.field733, class14.field735 }), new class30(class14.field732) });
        this.field4473 = arg0.method2851(true, true);
        this.field4476 = arg0.method2851(true, false);
        this.field4476.method2164(12, 3573, 393168);
        this.field4494 = arg0.method2876(false, 3);
        this.field4494.method380(49146, (byte) -17);
        Buffer var2 = this.field4494.method1188(false, true);
        if (var2 != null) {
            Stream var3 = arg0.method3219(var2, 1009);
            if (Stream.method3580()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3575(var7);
                    var3.method3575(var7 + 1);
                    var3.method3575(var7 + 2);
                    var3.method3575(var7 + 2);
                    var3.method3575(var7 + 3);
                    var3.method3575(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3583(var5);
                    var3.method3583(var5 + 1);
                    var3.method3583(var5 + 2);
                    var3.method3583(var5 + 2);
                    var3.method3583(var5 + 3);
                    var3.method3583(var5);
                }
            }
            var3.method3576();
            this.field4494.method1185(true);
        }
        Buffer var8 = this.field4476.method2167(-1926, true);
        if (var8 != null) {
            Stream var9 = arg0.method3219(var8, 1009);
            if (Stream.method3580()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3582(0.0F);
                    var9.method3582(-1.0F);
                    var9.method3582(0.0F);
                    var9.method3582(0.0F);
                    var9.method3582(-1.0F);
                    var9.method3582(0.0F);
                    var9.method3582(0.0F);
                    var9.method3582(-1.0F);
                    var9.method3582(0.0F);
                    var9.method3582(0.0F);
                    var9.method3582(-1.0F);
                    var9.method3582(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3584(0.0F);
                    var9.method3584(-1.0F);
                    var9.method3584(0.0F);
                    var9.method3584(0.0F);
                    var9.method3584(-1.0F);
                    var9.method3584(0.0F);
                    var9.method3584(0.0F);
                    var9.method3584(-1.0F);
                    var9.method3584(0.0F);
                    var9.method3584(0.0F);
                    var9.method3584(-1.0F);
                    var9.method3584(0.0F);
                }
            }
            var9.method3576();
            this.field4476.method2169((byte) 106);
        }
    }
}
