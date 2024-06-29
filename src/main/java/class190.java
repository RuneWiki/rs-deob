import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rea")
public class class190 {

    @OriginalMember(owner = "client!rea", name = "h", descriptor = "[I")
    private int[] field2731 = new int[64];

    @OriginalMember(owner = "client!rea", name = "k", descriptor = "[I")
    private int[] field2734 = new int[8191];

    @OriginalMember(owner = "client!rea", name = "g", descriptor = "[I")
    private int[] field2730 = new int[1600];

    @OriginalMember(owner = "client!rea", name = "l", descriptor = "[[Lag;")
    private class635[][] field2735 = new class635[64][768];

    @OriginalMember(owner = "client!rea", name = "o", descriptor = "I")
    private int field2738 = 0;

    @OriginalMember(owner = "client!rea", name = "x", descriptor = "[[Lag;")
    private class635[][] field2747 = new class635[1600][64];

    @OriginalMember(owner = "client!rea", name = "s", descriptor = "Lrd;")
    private class305 field2742;

    @OriginalMember(owner = "client!rea", name = "t", descriptor = "Lbca;")
    private class613 field2743;

    @OriginalMember(owner = "client!rea", name = "r", descriptor = "Lbca;")
    private class613 field2741;

    @OriginalMember(owner = "client!rea", name = "f", descriptor = "Lrn;")
    private class241 field2729;

    @OriginalMember(owner = "client!rea", name = "v", descriptor = "I")
    public static int field2745 = 0;

    @OriginalMember(owner = "client!rea", name = "n", descriptor = "J")
    public static long field2737 = 0L;

    @OriginalMember(owner = "client!rea", name = "q", descriptor = "Leca;")
    public static class704 field2740 = new class704();

    @OriginalMember(owner = "client!rea", name = "z", descriptor = "I")
    public static int field2749 = 0;

    @OriginalMember(owner = "client!rea", name = "A", descriptor = "I")
    public static int field2750 = -1;

    @OriginalMember(owner = "client!rea", name = "y", descriptor = "Ldg;")
    public static class376 field2748 = new class376(18, -1);

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "I")
    public static int field2724;

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!rea", name = "c", descriptor = "I")
    public static int field2726;

    @OriginalMember(owner = "client!rea", name = "d", descriptor = "I")
    public static int field2727;

    @OriginalMember(owner = "client!rea", name = "e", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!rea", name = "i", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!rea", name = "j", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!rea", name = "m", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!rea", name = "p", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!rea", name = "u", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!rea", name = "w", descriptor = "I")
    public static int field2746;

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BLvg;I)Ljava/lang/String;")
    public static final String method1274(byte arg0, class49 arg1, int arg2) {
        field2727++;
        if (!client.method1767(arg1).method972(arg2, -22640) && arg1.field953 == null) {
            return null;
        }
        if (arg0 > -54) {
            method1278(-75);
        }
        if (arg1.field966 == null || arg1.field966.length <= arg2 || arg1.field966[arg2] == null || arg1.field966[arg2].trim().length() == 0) {
            return class681.field9611 ? "Hidden-" + arg2 : null;
        } else {
            return arg1.field966[arg2];
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILhea;I)V")
    private final void method1275(int arg0, class387 arg1, int arg2) {
        field2739++;
        int var4 = 0;
        class21 var5 = arg1.method2349(-8);
        float var6 = var5.field259;
        float var7 = var5.field247;
        float var8 = var5.field256;
        float var9 = var5.field271;
        if (arg0 != 22466) {
            this.method1282((byte) 55, null);
        }
        float var10 = var5.field291;
        float var11 = var5.field289;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field2743.method995(true, 1614);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg1.method2381(0, var21);
        if (Stream.method3483()) {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field2730[var23] <= 64 ? this.field2730[var23] : 64;
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class635 var38 = this.field2747[var23][var25];
                        int var39 = var38.field8986;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field8982 >> 12);
                        float var45 = (float) (var38.field8988 >> 12);
                        float var46 = (float) (var38.field8987 >> 12);
                        int var47 = var38.field8989 >> 12;
                        var22.method3474((float) (-var47) * var12 + var44);
                        var22.method3474((float) (-var47) * var13 + var45);
                        var22.method3474((float) (-var47) * var14 + var46);
                        if (arg1.field5672 == 0) {
                            var22.method3479(var40, var41, var42, var43);
                        } else {
                            var22.method3478(var40, var41, var42, var43);
                        }
                        var22.method3474(0.0F);
                        var22.method3474(0.0F);
                        var22.method3474((float) var47 * var15 + var44);
                        var22.method3474((float) var47 * var16 + var45);
                        var22.method3474((float) var47 * var17 + var46);
                        if (arg1.field5672 == 0) {
                            var22.method3479(var40, var41, var42, var43);
                        } else {
                            var22.method3478(var40, var41, var42, var43);
                        }
                        var22.method3474(1.0F);
                        var22.method3474(0.0F);
                        var22.method3474((float) var47 * var12 + var44);
                        var22.method3474((float) var47 * var13 + var45);
                        var22.method3474((float) var47 * var14 + var46);
                        if (arg1.field5672 == 0) {
                            var22.method3479(var40, var41, var42, var43);
                        } else {
                            var22.method3478(var40, var41, var42, var43);
                        }
                        var22.method3474(1.0F);
                        var22.method3474(1.0F);
                        var22.method3474((float) var47 * var18 + var44);
                        var22.method3474((float) var47 * var19 + var45);
                        var22.method3474((float) var47 * var20 + var46);
                        if (arg1.field5672 == 0) {
                            var22.method3479(var40, var41, var42, var43);
                        } else {
                            var22.method3478(var40, var41, var42, var43);
                        }
                        var22.method3474(0.0F);
                        var4++;
                        var22.method3474(1.0F);
                    }
                    if (this.field2730[var23] > 64) {
                        int var26 = this.field2730[var23] - 1 - 64;
                        for (int var27 = this.field2731[var26] - 1; var27 >= 0; var27--) {
                            class635 var28 = this.field2735[var26][var27];
                            int var29 = var28.field8986;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field8982 >> 12);
                            float var35 = (float) (var28.field8988 >> 12);
                            float var36 = (float) (var28.field8987 >> 12);
                            int var37 = var28.field8989 >> 12;
                            var22.method3474((float) (-var37) * var12 + var34);
                            var22.method3474((float) (-var37) * var13 + var35);
                            var22.method3474((float) (-var37) * var14 + var36);
                            if (arg1.field5672 == 0) {
                                var22.method3479(var30, var31, var32, var33);
                            } else {
                                var22.method3478(var30, var31, var32, var33);
                            }
                            var22.method3474(0.0F);
                            var22.method3474(0.0F);
                            var22.method3474((float) var37 * var15 + var34);
                            var22.method3474((float) var37 * var16 + var35);
                            var22.method3474((float) var37 * var17 + var36);
                            if (arg1.field5672 == 0) {
                                var22.method3479(var30, var31, var32, var33);
                            } else {
                                var22.method3478(var30, var31, var32, var33);
                            }
                            var22.method3474(1.0F);
                            var22.method3474(0.0F);
                            var22.method3474((float) var37 * var12 + var34);
                            var22.method3474((float) var37 * var13 + var35);
                            var22.method3474((float) var37 * var14 + var36);
                            if (arg1.field5672 == 0) {
                                var22.method3479(var30, var31, var32, var33);
                            } else {
                                var22.method3478(var30, var31, var32, var33);
                            }
                            var22.method3474(1.0F);
                            var22.method3474(1.0F);
                            var22.method3474((float) var37 * var18 + var34);
                            var22.method3474((float) var37 * var19 + var35);
                            var22.method3474((float) var37 * var20 + var36);
                            if (arg1.field5672 == 0) {
                                var22.method3479(var30, var31, var32, var33);
                            } else {
                                var22.method3478(var30, var31, var32, var33);
                            }
                            var22.method3474(0.0F);
                            var4++;
                            var22.method3474(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field2730[var48] > 64 ? 64 : this.field2730[var48];
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class635 var63 = this.field2747[var48][var50];
                        int var64 = var63.field8986;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field8982 >> 12);
                        float var70 = (float) (var63.field8988 >> 12);
                        float var71 = (float) (var63.field8987 >> 12);
                        int var72 = var63.field8989 >> 12;
                        var22.method3476((float) (-var72) * var12 + var69);
                        var22.method3476((float) (-var72) * var13 + var70);
                        var22.method3476((float) (-var72) * var14 + var71);
                        if (arg1.field5672 == 0) {
                            var22.method3479(var65, var66, var67, var68);
                        } else {
                            var22.method3478(var65, var66, var67, var68);
                        }
                        var22.method3476(0.0F);
                        var22.method3476(0.0F);
                        var22.method3476((float) var72 * var15 + var69);
                        var22.method3476((float) var72 * var16 + var70);
                        var22.method3476((float) var72 * var17 + var71);
                        if (arg1.field5672 == 0) {
                            var22.method3479(var65, var66, var67, var68);
                        } else {
                            var22.method3478(var65, var66, var67, var68);
                        }
                        var22.method3476(1.0F);
                        var22.method3476(0.0F);
                        var22.method3476((float) var72 * var12 + var69);
                        var22.method3476((float) var72 * var13 + var70);
                        var22.method3476((float) var72 * var14 + var71);
                        if (arg1.field5672 == 0) {
                            var22.method3479(var65, var66, var67, var68);
                        } else {
                            var22.method3478(var65, var66, var67, var68);
                        }
                        var22.method3476(1.0F);
                        var22.method3476(1.0F);
                        var22.method3476((float) var72 * var18 + var69);
                        var22.method3476((float) var72 * var19 + var70);
                        var22.method3476((float) var72 * var20 + var71);
                        if (arg1.field5672 == 0) {
                            var22.method3479(var65, var66, var67, var68);
                        } else {
                            var22.method3478(var65, var66, var67, var68);
                        }
                        var22.method3476(0.0F);
                        var4++;
                        var22.method3476(1.0F);
                    }
                    if (this.field2730[var48] > 64) {
                        int var51 = this.field2730[var48] - 64 - 1;
                        for (int var52 = this.field2731[var51] - 1; var52 >= 0; var52--) {
                            class635 var53 = this.field2735[var51][var52];
                            int var54 = var53.field8986;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field8982 >> 12);
                            float var60 = (float) (var53.field8988 >> 12);
                            float var61 = (float) (var53.field8987 >> 12);
                            int var62 = var53.field8989 >> 12;
                            var22.method3476((float) (-var62) * var12 + var59);
                            var22.method3476((float) (-var62) * var13 + var60);
                            var22.method3476((float) (-var62) * var14 + var61);
                            if (arg1.field5672 == 0) {
                                var22.method3479(var55, var56, var57, var58);
                            } else {
                                var22.method3478(var55, var56, var57, var58);
                            }
                            var22.method3476(0.0F);
                            var22.method3476(0.0F);
                            var22.method3476((float) var62 * var15 + var59);
                            var22.method3476((float) var62 * var16 + var60);
                            var22.method3476((float) var62 * var17 + var61);
                            if (arg1.field5672 == 0) {
                                var22.method3479(var55, var56, var57, var58);
                            } else {
                                var22.method3478(var55, var56, var57, var58);
                            }
                            var22.method3476(1.0F);
                            var22.method3476(0.0F);
                            var22.method3476((float) var62 * var12 + var59);
                            var22.method3476((float) var62 * var13 + var60);
                            var22.method3476((float) var62 * var14 + var61);
                            if (arg1.field5672 == 0) {
                                var22.method3479(var55, var56, var57, var58);
                            } else {
                                var22.method3478(var55, var56, var57, var58);
                            }
                            var22.method3476(1.0F);
                            var22.method3476(1.0F);
                            var22.method3476((float) var62 * var18 + var59);
                            var22.method3476((float) var62 * var19 + var60);
                            var22.method3476((float) var62 * var20 + var61);
                            if (arg1.field5672 == 0) {
                                var22.method3479(var55, var56, var57, var58);
                            } else {
                                var22.method3478(var55, var56, var57, var58);
                            }
                            var22.method3476(0.0F);
                            var4++;
                            var22.method3476(1.0F);
                        }
                    }
                }
            }
        }
        var22.method3471();
        if (this.field2743.method992((byte) -78)) {
            arg1.method1865(0, -26558, this.field2743);
            arg1.method1865(1, arg0 ^ 0xFFFFCF80, this.field2741);
            arg1.method1883(-87, this.field2742);
            arg1.method1874(class80.field1355, var4 * 2, 0, true, this.field2729, var4 * 4, 0);
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1276(int arg0, byte arg1, int arg2) {
        if (arg1 < 7) {
            method1276(24, (byte) -11, 113);
        }
        field2724++;
        return (arg2 & 0x580) != 0;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ZLhea;)V")
    private final void method1277(boolean arg0, class387 arg1) {
        arg1.method2369((byte) 71, true);
        field2728++;
        arg1.method2313(true, (byte) -20);
        if (class408.field5961 != arg1.field5719) {
            arg1.method132(class408.field5961);
        }
        if (arg0) {
            this.field2730 = null;
        }
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(I)V")
    public static void method1278(int arg0) {
        field2748 = null;
        if (arg0 != 1) {
            method1276(-121, (byte) 30, 22);
        }
        field2740 = null;
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(ILhea;)V")
    private final void method1279(int arg0, class387 arg1) {
        field2726++;
        class408.field5961 = arg1.field5719;
        arg1.method2341(-29576);
        arg1.method2313(false, (byte) -20);
        arg1.method2369((byte) 71, false);
        int var3 = -105 % (-arg0 / 57);
        arg1.method2379(-12351);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IBLvi;Lhea;)V")
    public final void method1280(int arg0, byte arg1, class499 arg2, class387 arg3) {
        field2733++;
        if (arg3.field5630 == null) {
            return;
        }
        if (arg0 < 0) {
            this.method1279(-93, arg3);
        } else {
            this.method1281(arg0, 101, arg3);
        }
        float var5 = arg3.field5630.field246;
        float var6 = arg3.field5630.field243;
        float var7 = arg3.field5630.field272;
        float var8 = arg3.field5630.field257;
        try {
            int var9 = 0;
            if (arg1 >= -18) {
                method1274((byte) 4, null, -121);
            }
            int var10 = Integer.MAX_VALUE;
            int var11 = 0;
            class389 var12 = arg2.field7068.field8273;
            for (class389 var13 = var12.field5773; var13 != var12; var13 = var13.field5773) {
                class635 var14 = (class635) var13;
                int var15 = (int) ((float) (var14.field8987 >> 12) * var7 + (float) (var14.field8988 >> 12) * var6 + (float) (var14.field8982 >> 12) * var5 + var8);
                if (var15 > var11) {
                    var11 = var15;
                }
                this.field2734[var9++] = var15;
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
                var17 = class608.method3411((byte) -123, var16) + 1 - class565.field7968;
                var16 = (var16 >> var17) + 2;
            }
            class389 var18 = var12.field5773;
            int var19 = 0;
            int var20 = -2;
            boolean var21 = true;
            boolean var22 = true;
            while (var12 != var18) {
                this.field2738 = 0;
                for (int var23 = 0; var23 < var16; var23++) {
                    this.field2730[var23] = 0;
                }
                for (int var24 = 0; var24 < 64; var24++) {
                    this.field2731[var24] = 0;
                }
                while (var12 != var18) {
                    class635 var25 = (class635) var18;
                    if (var22) {
                        var20 = var25.field8990;
                        var21 = var25.field8983;
                        var22 = false;
                    }
                    if (var19 > 0 && (var25.field8990 != var20 || var25.field8983 != var21)) {
                        var22 = true;
                        break;
                    }
                    int var26 = this.field2734[var19++] - var10 >> var17;
                    if (var26 < 1600) {
                        if (this.field2730[var26] >= 64) {
                            label105: {
                                if (this.field2730[var26] == 64) {
                                    if (this.field2738 == 64) {
                                        break label105;
                                    }
                                    this.field2730[var26] += this.field2738++ + 1;
                                }
                                this.field2735[this.field2730[var26] - 65][this.field2731[this.field2730[var26] - 64 - 1]++] = var25;
                            }
                        } else {
                            this.field2747[var26][this.field2730[var26]++] = var25;
                        }
                    }
                    var18 = var18.field5773;
                }
                arg3.method2389(false, false, var20 < 0 ? -1 : var20, false);
                if (var21 && class408.field5961 != arg3.field5719) {
                    arg3.method132(class408.field5961);
                } else if (arg3.field5719 != 1.0F) {
                    arg3.method132(1.0F);
                }
                this.method1275(22466, arg3, var16);
            }
        } catch (Exception var27) {
        }
        this.method1277(false, arg3);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(IILhea;)V")
    private final void method1281(int arg0, int arg1, class387 arg2) {
        class408.field5961 = arg2.field5719;
        field2736++;
        arg2.method2334((float) arg0, 111);
        int var4 = 91 % ((13 - arg1) / 50);
        arg2.method2310((byte) -122);
        arg2.method2313(false, (byte) -20);
        arg2.method2369((byte) 71, false);
        arg2.method2379(-12351);
    }

    @OriginalMember(owner = "client!rea", name = "a", descriptor = "(BLhea;)V")
    public final void method1282(byte arg0, class387 arg1) {
        field2746++;
        this.field2743.method993(786336, -6696, 24);
        if (arg0 > -104) {
            this.method1283(-77);
        }
    }

    @OriginalMember(owner = "client!rea", name = "b", descriptor = "(I)V")
    public final void method1283(int arg0) {
        field2725++;
        if (arg0 != 27187) {
            this.field2734 = null;
        }
        this.field2743.method7(arg0 - 27294);
    }

    @OriginalMember(owner = "client!rea", name = "<init>", descriptor = "(Lhea;)V")
    public class190(class387 arg0) {
        this.field2742 = arg0.method1866(-80, new class399[] { new class399(new class342[] { class342.field5015, class342.field5017, class342.field5019 }), new class399(class342.field5016) });
        this.field2743 = arg0.method1901(-21710, true);
        this.field2741 = arg0.method1901(-21710, false);
        this.field2741.method993(393168, -6696, 12);
        this.field2729 = arg0.method1863((byte) 107, false);
        this.field2729.method1(-40, 49146);
        Buffer var2 = this.field2729.method5(true, 91);
        if (var2 != null) {
            Stream var3 = arg0.method2381(0, var2);
            if (Stream.method3483()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3475(var7);
                    var3.method3475(var7 + 1);
                    var3.method3475(var7 + 2);
                    var3.method3475(var7 + 2);
                    var3.method3475(var7 + 3);
                    var3.method3475(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3472(var5);
                    var3.method3472(var5 + 1);
                    var3.method3472(var5 + 2);
                    var3.method3472(var5 + 2);
                    var3.method3472(var5 + 3);
                    var3.method3472(var5);
                }
            }
            var3.method3471();
            this.field2729.method2(-72);
        }
        Buffer var8 = this.field2741.method995(true, 1614);
        if (var8 != null) {
            Stream var9 = arg0.method2381(0, var8);
            if (Stream.method3483()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3474(0.0F);
                    var9.method3474(-1.0F);
                    var9.method3474(0.0F);
                    var9.method3474(0.0F);
                    var9.method3474(-1.0F);
                    var9.method3474(0.0F);
                    var9.method3474(0.0F);
                    var9.method3474(-1.0F);
                    var9.method3474(0.0F);
                    var9.method3474(0.0F);
                    var9.method3474(-1.0F);
                    var9.method3474(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3476(0.0F);
                    var9.method3476(-1.0F);
                    var9.method3476(0.0F);
                    var9.method3476(0.0F);
                    var9.method3476(-1.0F);
                    var9.method3476(0.0F);
                    var9.method3476(0.0F);
                    var9.method3476(-1.0F);
                    var9.method3476(0.0F);
                    var9.method3476(0.0F);
                    var9.method3476(-1.0F);
                    var9.method3476(0.0F);
                }
            }
            var9.method3471();
            this.field2741.method992((byte) -88);
        }
    }
}
