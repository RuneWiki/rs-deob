import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class552 {

    @OriginalMember(owner = "client!um", name = "f", descriptor = "[I")
    private int[] field7805 = new int[64];

    @OriginalMember(owner = "client!um", name = "l", descriptor = "[[Lln;")
    private class400[][] field7811 = new class400[1600][64];

    @OriginalMember(owner = "client!um", name = "o", descriptor = "[I")
    private int[] field7814 = new int[1600];

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    private int field7817 = 0;

    @OriginalMember(owner = "client!um", name = "d", descriptor = "[I")
    private int[] field7803 = new int[8191];

    @OriginalMember(owner = "client!um", name = "e", descriptor = "[[Lln;")
    private class400[][] field7804 = new class400[64][768];

    @OriginalMember(owner = "client!um", name = "s", descriptor = "Lwp;")
    private class193 field7818;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "Lmha;")
    private class438 field7813;

    @OriginalMember(owner = "client!um", name = "j", descriptor = "Lmha;")
    private class438 field7809;

    @OriginalMember(owner = "client!um", name = "c", descriptor = "Lta;")
    private class226 field7802;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "Ljg;")
    public static class359 field7812 = new class359();

    @OriginalMember(owner = "client!um", name = "p", descriptor = "I")
    public static int field7815 = 0;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "I")
    public static int field7800;

    @OriginalMember(owner = "client!um", name = "b", descriptor = "I")
    public static int field7801;

    @OriginalMember(owner = "client!um", name = "g", descriptor = "I")
    public static int field7806;

    @OriginalMember(owner = "client!um", name = "h", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    public static int field7810;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    public static int field7816;

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field7819;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lsf;B)V", line = 6)
    public final void method3171(class551 arg0, byte arg1) {
        field7801++;
        if (arg1 < -24) {
            this.field7813.method1736((byte) 79, 786336, 24);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILsf;ILmf;)V", line = 20)
    public final void method3172(int arg0, class551 arg1, int arg2, class442 arg3) {
        field7800++;
        if (arg1.field7670 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method3178(arg0 ^ 0xFFFFFF9D, arg1);
        } else {
            this.method3173((byte) -17, arg2, arg1);
        }
        float var5 = arg1.field7670.field5780;
        float var6 = arg1.field7670.field5748;
        float var7 = arg1.field7670.field5742;
        float var8 = arg1.field7670.field5737;
        try {
            int var9 = 0;
            int var10 = Integer.MAX_VALUE;
            if (arg0 != 64) {
                this.method3173((byte) 106, 81, null);
            }
            int var11 = 0;
            class525 var12 = arg3.field5985.field9507;
            for (class525 var13 = var12.field7133; var13 != var12; var13 = var13.field7133) {
                class400 var14 = (class400) var13;
                int var15 = (int) ((float) (var14.field5509 >> 12) * var7 + (float) (var14.field5516 >> 12) * var5 + (float) (var14.field5514 >> 12) * var6 + var8);
                if (var15 < var10) {
                    var10 = var15;
                }
                this.field7803[var9++] = var15;
                if (var11 < var15) {
                    var11 = var15;
                }
            }
            int var16 = var11 - var10;
            int var17;
            if (var16 + 2 <= 1600) {
                var17 = 0;
                var16 += 2;
            } else {
                var17 = class750.method4165(255, var16) + (1 - class500.field6842);
                var16 = (var16 >> var17) + 2;
            }
            class525 var18 = var12.field7133;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field7817 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field7814[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field7805[var24] = 0;
                }
                while (var12 != var18) {
                    class400 var25 = (class400) var18;
                    if (var22) {
                        var22 = false;
                        var20 = var25.field5511;
                        var21 = var25.field5519;
                    }
                    if (var19 > 0 && (var25.field5511 != var20 || var21 != var25.field5519)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field7803[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field7814[var26] >= 64) {
                            label110: {
                                if (this.field7814[var26] == 64) {
                                    if (this.field7817 == 64) {
                                        break label110;
                                    }
                                    this.field7814[var26] += this.field7817++ + 1;
                                }
                                this.field7804[this.field7814[var26] - 65][this.field7805[this.field7814[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field7811[var26][this.field7814[var26]++] = var25;
                        }
                    }
                    var18 = var18.field7133;
                }
                arg1.method3131(var20 >= 0 ? var20 : -1, 0, false, false);
                if (var21 && class718.field9878 != arg1.field7685) {
                    arg1.method480(class718.field9878);
                } else if (arg1.field7685 != 1.0F) {
                    arg1.method480(1.0F);
                }
                this.method3177(var16, arg1, 22900);
            }
        } catch (Exception var27) {
        }
        this.method3179(-1, arg1);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BILsf;)V", line = 180)
    private final void method3173(byte arg0, int arg1, class551 arg2) {
        class718.field9878 = arg2.field7685;
        field7807++;
        if (arg0 != -17) {
            return;
        }
        arg2.method3144((float) arg1, -4902);
        arg2.method3147(arg0 ^ 0x743D);
        arg2.method3127(false, -122);
        arg2.method3112(false, (byte) 91);
        arg2.method3140(25723);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)V", line = 196)
    public static void method3174(int arg0) {
        field7812 = null;
        if (arg0 != 0) {
            field7812 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V", line = 214)
    public static final void method3175(byte arg0) {
        class160.field2572 = class333.field4511.field2444 + class333.field4511.field2434 + 2;
        field7819++;
        class407.field5592 = class16.field239.field2434 + class16.field239.field2444 + 2;
        class238.field3400 = new String[500];
        for (int var1 = 0; var1 < class238.field3400.length; var1++) {
            class238.field3400[var1] = "";
        }
        int var2 = -6 / ((arg0 + 59) / 40);
        class652.method3663(-126, class641.field8817.method3566((byte) 109, class464.field6309));
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lsf;)V", line = 677)
    public class552(class551 arg0) {
        this.field7818 = arg0.method844(115, new class588[] { new class588(new class601[] { class601.field8400, class601.field8403, class601.field8405 }), new class588(class601.field8402) });
        this.field7813 = arg0.method818(0, true);
        this.field7809 = arg0.method818(0, false);
        this.field7809.method1736((byte) 107, 393168, 12);
        this.field7802 = arg0.method812(false, 28);
        this.field7802.method1546(49146, -13659);
        Buffer var2 = this.field7802.method1545(true, -4450);
        if (var2 != null) {
            Stream var3 = arg0.method3170((byte) 5, var2);
            if (Stream.method3910()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3912(var7);
                    var3.method3912(var7 + 1);
                    var3.method3912(var7 + 2);
                    var3.method3912(var7 + 2);
                    var3.method3912(var7 + 3);
                    var3.method3912(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3903(var5);
                    var3.method3903(var5 + 1);
                    var3.method3903(var5 + 2);
                    var3.method3903(var5 + 2);
                    var3.method3903(var5 + 3);
                    var3.method3903(var5);
                }
            }
            var3.method3901();
            this.field7802.method1544(87);
        }
        Buffer var8 = this.field7809.method1739(true, 91);
        if (var8 != null) {
            Stream var9 = arg0.method3170((byte) 5, var8);
            if (Stream.method3910()) {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3914(0.0F);
                    var9.method3914(-1.0F);
                    var9.method3914(0.0F);
                    var9.method3914(0.0F);
                    var9.method3914(-1.0F);
                    var9.method3914(0.0F);
                    var9.method3914(0.0F);
                    var9.method3914(-1.0F);
                    var9.method3914(0.0F);
                    var9.method3914(0.0F);
                    var9.method3914(-1.0F);
                    var9.method3914(0.0F);
                }
            } else {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3909(0.0F);
                    var9.method3909(-1.0F);
                    var9.method3909(0.0F);
                    var9.method3909(0.0F);
                    var9.method3909(-1.0F);
                    var9.method3909(0.0F);
                    var9.method3909(0.0F);
                    var9.method3909(-1.0F);
                    var9.method3909(0.0F);
                    var9.method3909(0.0F);
                    var9.method3909(-1.0F);
                    var9.method3909(0.0F);
                }
            }
            var9.method3901();
            this.field7809.method1737((byte) -92);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V", line = 252)
    public final void method3176(int arg0) {
        this.field7813.method1543(-21647);
        if (arg0 != 1326432616) {
            field7812 = null;
        }
        field7816++;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILsf;I)V", line = 263)
    private final void method3177(int arg0, class551 arg1, int arg2) {
        field7808++;
        int var4 = 0;
        class421 var5 = arg1.method3091(true);
        float var6 = var5.field5734;
        float var7 = var5.field5730;
        float var8 = var5.field5750;
        float var9 = var5.field5754;
        float var10 = var5.field5775;
        float var11 = var5.field5740;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        if (arg2 != 22900) {
            field7812 = null;
        }
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field7813.method1739(true, 81);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method3170((byte) 5, var21);
        if (Stream.method3910()) {
            for (int var48 = arg0 - 1; var48 >= 0; var48--) {
                int var49 = this.field7814[var48] <= 64 ? this.field7814[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class400 var63 = this.field7811[var48][var50];
                        int var64 = var63.field5517;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field5516 >> 12);
                        float var70 = (float) (var63.field5514 >> 12);
                        float var71 = (float) (var63.field5509 >> 12);
                        int var72 = var63.field5518 >> 12;
                        var22.method3914((float) (-var72) * var12 + var69);
                        var22.method3914((float) (-var72) * var13 + var70);
                        var22.method3914((float) (-var72) * var14 + var71);
                        if (arg1.field7694 == 0) {
                            var22.method3906(var65, var66, var67, var68);
                        } else {
                            var22.method3907(var65, var66, var67, var68);
                        }
                        var22.method3914(0.0F);
                        var22.method3914(0.0F);
                        var22.method3914((float) var72 * var15 + var69);
                        var22.method3914((float) var72 * var16 + var70);
                        var22.method3914((float) var72 * var17 + var71);
                        if (arg1.field7694 == 0) {
                            var22.method3906(var65, var66, var67, var68);
                        } else {
                            var22.method3907(var65, var66, var67, var68);
                        }
                        var22.method3914(1.0F);
                        var22.method3914(0.0F);
                        var22.method3914((float) var72 * var12 + var69);
                        var22.method3914((float) var72 * var13 + var70);
                        var22.method3914((float) var72 * var14 + var71);
                        if (arg1.field7694 == 0) {
                            var22.method3906(var65, var66, var67, var68);
                        } else {
                            var22.method3907(var65, var66, var67, var68);
                        }
                        var22.method3914(1.0F);
                        var22.method3914(1.0F);
                        var22.method3914((float) var72 * var18 + var69);
                        var22.method3914((float) var72 * var19 + var70);
                        var22.method3914((float) var72 * var20 + var71);
                        if (arg1.field7694 == 0) {
                            var22.method3906(var65, var66, var67, var68);
                        } else {
                            var22.method3907(var65, var66, var67, var68);
                        }
                        var22.method3914(0.0F);
                        var4++;
                        var22.method3914(1.0F);
                    }
                    if (this.field7814[var48] > 64) {
                        int var51 = this.field7814[var48] - 64 - 1;
                        for (int var52 = this.field7805[var51] - 1; var52 >= 0; var52--) {
                            class400 var53 = this.field7804[var51][var52];
                            int var54 = var53.field5517;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field5516 >> 12);
                            float var60 = (float) (var53.field5514 >> 12);
                            float var61 = (float) (var53.field5509 >> 12);
                            int var62 = var53.field5518 >> 12;
                            var22.method3914((float) (-var62) * var12 + var59);
                            var22.method3914((float) (-var62) * var13 + var60);
                            var22.method3914((float) (-var62) * var14 + var61);
                            if (arg1.field7694 == 0) {
                                var22.method3906(var55, var56, var57, var58);
                            } else {
                                var22.method3907(var55, var56, var57, var58);
                            }
                            var22.method3914(0.0F);
                            var22.method3914(0.0F);
                            var22.method3914((float) var62 * var15 + var59);
                            var22.method3914((float) var62 * var16 + var60);
                            var22.method3914((float) var62 * var17 + var61);
                            if (arg1.field7694 == 0) {
                                var22.method3906(var55, var56, var57, var58);
                            } else {
                                var22.method3907(var55, var56, var57, var58);
                            }
                            var22.method3914(1.0F);
                            var22.method3914(0.0F);
                            var22.method3914((float) var62 * var12 + var59);
                            var22.method3914((float) var62 * var13 + var60);
                            var22.method3914((float) var62 * var14 + var61);
                            if (arg1.field7694 == 0) {
                                var22.method3906(var55, var56, var57, var58);
                            } else {
                                var22.method3907(var55, var56, var57, var58);
                            }
                            var22.method3914(1.0F);
                            var22.method3914(1.0F);
                            var22.method3914((float) var62 * var18 + var59);
                            var22.method3914((float) var62 * var19 + var60);
                            var22.method3914((float) var62 * var20 + var61);
                            if (arg1.field7694 == 0) {
                                var22.method3906(var55, var56, var57, var58);
                            } else {
                                var22.method3907(var55, var56, var57, var58);
                            }
                            var22.method3914(0.0F);
                            var22.method3914(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg0 - 1; var23 >= 0; var23--) {
                int var24 = this.field7814[var23] <= 64 ? this.field7814[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class400 var38 = this.field7811[var23][var25];
                        int var39 = var38.field5517;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field5516 >> 12);
                        float var45 = (float) (var38.field5514 >> 12);
                        float var46 = (float) (var38.field5509 >> 12);
                        int var47 = var38.field5518 >> 12;
                        var22.method3909((float) (-var47) * var12 + var44);
                        var22.method3909((float) (-var47) * var13 + var45);
                        var22.method3909((float) (-var47) * var14 + var46);
                        if (arg1.field7694 == 0) {
                            var22.method3906(var40, var41, var42, var43);
                        } else {
                            var22.method3907(var40, var41, var42, var43);
                        }
                        var22.method3909(0.0F);
                        var22.method3909(0.0F);
                        var22.method3909((float) var47 * var15 + var44);
                        var22.method3909((float) var47 * var16 + var45);
                        var22.method3909((float) var47 * var17 + var46);
                        if (arg1.field7694 == 0) {
                            var22.method3906(var40, var41, var42, var43);
                        } else {
                            var22.method3907(var40, var41, var42, var43);
                        }
                        var22.method3909(1.0F);
                        var22.method3909(0.0F);
                        var22.method3909((float) var47 * var12 + var44);
                        var22.method3909((float) var47 * var13 + var45);
                        var22.method3909((float) var47 * var14 + var46);
                        if (arg1.field7694 == 0) {
                            var22.method3906(var40, var41, var42, var43);
                        } else {
                            var22.method3907(var40, var41, var42, var43);
                        }
                        var22.method3909(1.0F);
                        var22.method3909(1.0F);
                        var22.method3909((float) var47 * var18 + var44);
                        var22.method3909((float) var47 * var19 + var45);
                        var22.method3909((float) var47 * var20 + var46);
                        if (arg1.field7694 == 0) {
                            var22.method3906(var40, var41, var42, var43);
                        } else {
                            var22.method3907(var40, var41, var42, var43);
                        }
                        var22.method3909(0.0F);
                        var4++;
                        var22.method3909(1.0F);
                    }
                    if (this.field7814[var23] > 64) {
                        int var26 = this.field7814[var23] - 64 - 1;
                        for (int var27 = this.field7805[var26] - 1; var27 >= 0; var27--) {
                            class400 var28 = this.field7804[var26][var27];
                            int var29 = var28.field5517;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field5516 >> 12);
                            float var35 = (float) (var28.field5514 >> 12);
                            float var36 = (float) (var28.field5509 >> 12);
                            int var37 = var28.field5518 >> 12;
                            var22.method3909((float) (-var37) * var12 + var34);
                            var22.method3909((float) (-var37) * var13 + var35);
                            var22.method3909((float) (-var37) * var14 + var36);
                            if (arg1.field7694 == 0) {
                                var22.method3906(var30, var31, var32, var33);
                            } else {
                                var22.method3907(var30, var31, var32, var33);
                            }
                            var22.method3909(0.0F);
                            var22.method3909(0.0F);
                            var22.method3909((float) var37 * var15 + var34);
                            var22.method3909((float) var37 * var16 + var35);
                            var22.method3909((float) var37 * var17 + var36);
                            if (arg1.field7694 == 0) {
                                var22.method3906(var30, var31, var32, var33);
                            } else {
                                var22.method3907(var30, var31, var32, var33);
                            }
                            var22.method3909(1.0F);
                            var22.method3909(0.0F);
                            var22.method3909((float) var37 * var12 + var34);
                            var22.method3909((float) var37 * var13 + var35);
                            var22.method3909((float) var37 * var14 + var36);
                            if (arg1.field7694 == 0) {
                                var22.method3906(var30, var31, var32, var33);
                            } else {
                                var22.method3907(var30, var31, var32, var33);
                            }
                            var22.method3909(1.0F);
                            var22.method3909(1.0F);
                            var22.method3909((float) var37 * var18 + var34);
                            var22.method3909((float) var37 * var19 + var35);
                            var22.method3909((float) var37 * var20 + var36);
                            if (arg1.field7694 == 0) {
                                var22.method3906(var30, var31, var32, var33);
                            } else {
                                var22.method3907(var30, var31, var32, var33);
                            }
                            var22.method3909(0.0F);
                            var22.method3909(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3901();
        if (this.field7813.method1737((byte) -69)) {
            arg1.method863(0, (byte) 93, this.field7813);
            arg1.method863(1, (byte) 78, this.field7809);
            arg1.method846((byte) -115, this.field7818);
            arg1.method830(var4 * 4, this.field7802, class501.field6860, (byte) -127, var4 * 2, 0, 0);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILsf;)V", line = 652)
    private final void method3178(int arg0, class551 arg1) {
        class718.field9878 = arg1.field7685;
        if (arg0 > -5) {
            this.field7809 = null;
        }
        field7806++;
        arg1.method3134((byte) 120);
        arg1.method3127(false, -116);
        arg1.method3112(false, (byte) 91);
        arg1.method3140(25723);
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(ILsf;)V", line = 796)
    private final void method3179(int arg0, class551 arg1) {
        field7810++;
        arg1.method3112(true, (byte) 91);
        arg1.method3127(true, -118);
        if (arg0 == -1 && class718.field9878 != arg1.field7685) {
            arg1.method480(class718.field9878);
        }
    }
}
