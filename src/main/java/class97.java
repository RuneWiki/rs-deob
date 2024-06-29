import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class97 {

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "[[Llg;")
    private class216[][] field1132 = new class216[64][768];

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "[I")
    private int[] field1140 = new int[1600];

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "[I")
    private int[] field1141 = new int[8191];

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "[[Llg;")
    private class216[][] field1143 = new class216[1600][64];

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "[I")
    private int[] field1145 = new int[64];

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "Lbfa;")
    private class262 field1135;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Lfw;")
    private class716 field1146;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "Lfw;")
    private class716 field1148;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "Lpm;")
    private class614 field1131;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "Ljn;")
    public static class134 field1137 = new class134(56, 3);

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "I")
    public static int field1136;

    @OriginalMember(owner = "client!sl", name = "h", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "I")
    public static int field1142;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILhda;ILlba;)V", line = 4)
    public final void method695(int arg0, class714 arg1, int arg2, class223 arg3) {
        field1147++;
        if (arg3.field3278 == null) {
            return;
        }
        if (arg2 < 0) {
            this.method700(arg3, 0);
        } else {
            this.method702(arg3, arg2, (byte) -55);
        }
        int var5 = 31 % ((-arg0 - 9) / 57);
        float var6 = arg3.field3278.field7132;
        float var7 = arg3.field3278.field7134;
        float var8 = arg3.field3278.field7090;
        float var9 = arg3.field3278.field7112;
        try {
            int var10 = 0;
            int var11 = Integer.MAX_VALUE;
            int var12 = 0;
            class309 var13 = arg1.field9929.field3960;
            for (class309 var14 = var13.field4457; var14 != var13; var14 = var14.field4457) {
                class216 var15 = (class216) var14;
                int var16 = (int) ((float) (var15.field2978 >> 12) * var8 + (float) (var15.field2982 >> 12) * var7 + (float) (var15.field2979 >> 12) * var6 + var9);
                if (var16 < var11) {
                    var11 = var16;
                }
                this.field1141[var10++] = var16;
                if (var16 > var12) {
                    var12 = var16;
                }
            }
            int var17 = var12 - var11;
            int var18;
            if (var17 + 2 > 1600) {
                var18 = class550.method3249(var17, 6520) + 1 - class222.field3036;
                var17 = (var17 >> var18) + 2;
            } else {
                var18 = 0;
                var17 += 2;
            }
            class309 var19 = var13.field4457;
            int var20 = 0;
            int var21 = -2;
            boolean var22 = true;
            boolean var23 = true;
            while (var13 != var19) {
                this.field1139 = 0;
                for (int var24 = 0; var24 < var17; var24++) {
                    this.field1140[var24] = 0;
                }
                for (int var25 = 0; var25 < 64; var25++) {
                    this.field1145[var25] = 0;
                }
                while (var13 != var19) {
                    class216 var26 = (class216) var19;
                    if (var23) {
                        var23 = false;
                        var22 = var26.field2972;
                        var21 = var26.field2976;
                    }
                    if (var20 > 0 && (var26.field2976 != var21 || var26.field2972 != var22)) {
                        var23 = true;
                        break;
                    }
                    int var27 = this.field1141[var20++] - var11 >> var18;
                    if (var27 < 1600) {
                        if (this.field1140[var27] < 64) {
                            this.field1143[var27][this.field1140[var27]++] = var26;
                        } else {
                            label97: {
                                if (this.field1140[var27] == 64) {
                                    if (this.field1139 == 64) {
                                        break label97;
                                    }
                                    this.field1140[var27] += this.field1139++ + 1;
                                }
                                this.field1132[this.field1140[var27] - 1 - 64][this.field1145[this.field1140[var27] - 64 - 1]++] = var26;
                            }
                        }
                    }
                    var19 = var19.field4457;
                }
                arg3.method1467(false, false, var21 < 0 ? -1 : var21, (byte) -56);
                if (var22 && class72.field791 != arg3.field3359) {
                    arg3.method202(class72.field791);
                } else if (arg3.field3359 != 1.0F) {
                    arg3.method202(1.0F);
                }
                this.method696(arg3, var17, 118);
            }
        } catch (Exception var28) {
        }
        this.method703(15505, arg3);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Llba;II)V", line = 170)
    private final void method696(class223 arg0, int arg1, int arg2) {
        field1150++;
        int var4 = 0;
        class517 var5 = arg0.method1423(1);
        float var6 = var5.field7140;
        float var7 = var5.field7092;
        float var8 = var5.field7094;
        float var9 = var5.field7122;
        float var10 = var5.field7108;
        float var11 = var5.field7093;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        if (arg2 < 14) {
            this.method699(97);
        }
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field1146.method2276(true, false);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method1449(14, var21);
        if (Stream.method2346()) {
            for (int var48 = arg1 - 1; var48 >= 0; var48--) {
                int var49 = this.field1140[var48] <= 64 ? this.field1140[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class216 var63 = this.field1143[var48][var50];
                        int var64 = var63.field2983;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field2979 >> 12);
                        float var70 = (float) (var63.field2982 >> 12);
                        float var71 = (float) (var63.field2978 >> 12);
                        int var72 = var63.field2975 >> 12;
                        var22.method2340((float) (-var72) * var12 + var69);
                        var22.method2340((float) (-var72) * var13 + var70);
                        var22.method2340((float) (-var72) * var14 + var71);
                        if (arg0.field3326 == 0) {
                            var22.method2344(var65, var66, var67, var68);
                        } else {
                            var22.method2337(var65, var66, var67, var68);
                        }
                        var22.method2340(0.0F);
                        var22.method2340(0.0F);
                        var22.method2340((float) var72 * var15 + var69);
                        var22.method2340((float) var72 * var16 + var70);
                        var22.method2340((float) var72 * var17 + var71);
                        if (arg0.field3326 == 0) {
                            var22.method2344(var65, var66, var67, var68);
                        } else {
                            var22.method2337(var65, var66, var67, var68);
                        }
                        var22.method2340(1.0F);
                        var22.method2340(0.0F);
                        var22.method2340((float) var72 * var12 + var69);
                        var22.method2340((float) var72 * var13 + var70);
                        var22.method2340((float) var72 * var14 + var71);
                        if (arg0.field3326 == 0) {
                            var22.method2344(var65, var66, var67, var68);
                        } else {
                            var22.method2337(var65, var66, var67, var68);
                        }
                        var22.method2340(1.0F);
                        var22.method2340(1.0F);
                        var22.method2340((float) var72 * var18 + var69);
                        var22.method2340((float) var72 * var19 + var70);
                        var22.method2340((float) var72 * var20 + var71);
                        if (arg0.field3326 == 0) {
                            var22.method2344(var65, var66, var67, var68);
                        } else {
                            var22.method2337(var65, var66, var67, var68);
                        }
                        var22.method2340(0.0F);
                        var4++;
                        var22.method2340(1.0F);
                    }
                    if (this.field1140[var48] > 64) {
                        int var51 = this.field1140[var48] - 64 - 1;
                        for (int var52 = this.field1145[var51] - 1; var52 >= 0; var52--) {
                            class216 var53 = this.field1132[var51][var52];
                            int var54 = var53.field2983;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field2979 >> 12);
                            float var60 = (float) (var53.field2982 >> 12);
                            float var61 = (float) (var53.field2978 >> 12);
                            int var62 = var53.field2975 >> 12;
                            var22.method2340((float) (-var62) * var12 + var59);
                            var22.method2340((float) (-var62) * var13 + var60);
                            var22.method2340((float) (-var62) * var14 + var61);
                            if (arg0.field3326 == 0) {
                                var22.method2344(var55, var56, var57, var58);
                            } else {
                                var22.method2337(var55, var56, var57, var58);
                            }
                            var22.method2340(0.0F);
                            var22.method2340(0.0F);
                            var22.method2340((float) var62 * var15 + var59);
                            var22.method2340((float) var62 * var16 + var60);
                            var22.method2340((float) var62 * var17 + var61);
                            if (arg0.field3326 == 0) {
                                var22.method2344(var55, var56, var57, var58);
                            } else {
                                var22.method2337(var55, var56, var57, var58);
                            }
                            var22.method2340(1.0F);
                            var22.method2340(0.0F);
                            var22.method2340((float) var62 * var12 + var59);
                            var22.method2340((float) var62 * var13 + var60);
                            var22.method2340((float) var62 * var14 + var61);
                            if (arg0.field3326 == 0) {
                                var22.method2344(var55, var56, var57, var58);
                            } else {
                                var22.method2337(var55, var56, var57, var58);
                            }
                            var22.method2340(1.0F);
                            var22.method2340(1.0F);
                            var22.method2340((float) var62 * var18 + var59);
                            var22.method2340((float) var62 * var19 + var60);
                            var22.method2340((float) var62 * var20 + var61);
                            if (arg0.field3326 == 0) {
                                var22.method2344(var55, var56, var57, var58);
                            } else {
                                var22.method2337(var55, var56, var57, var58);
                            }
                            var22.method2340(0.0F);
                            var22.method2340(1.0F);
                            var4++;
                        }
                    }
                }
            }
        } else {
            for (int var23 = arg1 - 1; var23 >= 0; var23--) {
                int var24 = this.field1140[var23] > 64 ? 64 : this.field1140[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class216 var38 = this.field1143[var23][var25];
                        int var39 = var38.field2983;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field2979 >> 12);
                        float var45 = (float) (var38.field2982 >> 12);
                        float var46 = (float) (var38.field2978 >> 12);
                        int var47 = var38.field2975 >> 12;
                        var22.method2350((float) (-var47) * var12 + var44);
                        var22.method2350((float) (-var47) * var13 + var45);
                        var22.method2350((float) (-var47) * var14 + var46);
                        if (arg0.field3326 == 0) {
                            var22.method2344(var40, var41, var42, var43);
                        } else {
                            var22.method2337(var40, var41, var42, var43);
                        }
                        var22.method2350(0.0F);
                        var22.method2350(0.0F);
                        var22.method2350((float) var47 * var15 + var44);
                        var22.method2350((float) var47 * var16 + var45);
                        var22.method2350((float) var47 * var17 + var46);
                        if (arg0.field3326 == 0) {
                            var22.method2344(var40, var41, var42, var43);
                        } else {
                            var22.method2337(var40, var41, var42, var43);
                        }
                        var22.method2350(1.0F);
                        var22.method2350(0.0F);
                        var22.method2350((float) var47 * var12 + var44);
                        var22.method2350((float) var47 * var13 + var45);
                        var22.method2350((float) var47 * var14 + var46);
                        if (arg0.field3326 == 0) {
                            var22.method2344(var40, var41, var42, var43);
                        } else {
                            var22.method2337(var40, var41, var42, var43);
                        }
                        var22.method2350(1.0F);
                        var22.method2350(1.0F);
                        var22.method2350((float) var47 * var18 + var44);
                        var22.method2350((float) var47 * var19 + var45);
                        var22.method2350((float) var47 * var20 + var46);
                        if (arg0.field3326 == 0) {
                            var22.method2344(var40, var41, var42, var43);
                        } else {
                            var22.method2337(var40, var41, var42, var43);
                        }
                        var22.method2350(0.0F);
                        var4++;
                        var22.method2350(1.0F);
                    }
                    if (this.field1140[var23] > 64) {
                        int var26 = this.field1140[var23] - 1 - 64;
                        for (int var27 = this.field1145[var26] - 1; var27 >= 0; var27--) {
                            class216 var28 = this.field1132[var26][var27];
                            int var29 = var28.field2983;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field2979 >> 12);
                            float var35 = (float) (var28.field2982 >> 12);
                            float var36 = (float) (var28.field2978 >> 12);
                            int var37 = var28.field2975 >> 12;
                            var22.method2350((float) (-var37) * var12 + var34);
                            var22.method2350((float) (-var37) * var13 + var35);
                            var22.method2350((float) (-var37) * var14 + var36);
                            if (arg0.field3326 == 0) {
                                var22.method2344(var30, var31, var32, var33);
                            } else {
                                var22.method2337(var30, var31, var32, var33);
                            }
                            var22.method2350(0.0F);
                            var22.method2350(0.0F);
                            var22.method2350((float) var37 * var15 + var34);
                            var22.method2350((float) var37 * var16 + var35);
                            var22.method2350((float) var37 * var17 + var36);
                            if (arg0.field3326 == 0) {
                                var22.method2344(var30, var31, var32, var33);
                            } else {
                                var22.method2337(var30, var31, var32, var33);
                            }
                            var22.method2350(1.0F);
                            var22.method2350(0.0F);
                            var22.method2350((float) var37 * var12 + var34);
                            var22.method2350((float) var37 * var13 + var35);
                            var22.method2350((float) var37 * var14 + var36);
                            if (arg0.field3326 == 0) {
                                var22.method2344(var30, var31, var32, var33);
                            } else {
                                var22.method2337(var30, var31, var32, var33);
                            }
                            var22.method2350(1.0F);
                            var22.method2350(1.0F);
                            var22.method2350((float) var37 * var18 + var34);
                            var22.method2350((float) var37 * var19 + var35);
                            var22.method2350((float) var37 * var20 + var36);
                            if (arg0.field3326 == 0) {
                                var22.method2344(var30, var31, var32, var33);
                            } else {
                                var22.method2337(var30, var31, var32, var33);
                            }
                            var22.method2350(0.0F);
                            var22.method2350(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method2351();
        if (this.field1146.method2281(-14567)) {
            arg0.method1386((byte) -123, this.field1146, 0);
            arg0.method1386((byte) -109, this.field1148, 1);
            arg0.method1485(this.field1135, 32);
            arg0.method1430((byte) -98, 0, class625.field8750, this.field1131, var4 * 2, 0, var4 * 4);
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Llba;)V", line = 701)
    public class97(class223 arg0) {
        this.field1135 = arg0.method1406((byte) 6, new class435[] { new class435(new class382[] { class382.field5466, class382.field5475, class382.field5477 }), new class435(class382.field5473) });
        this.field1146 = arg0.method1421(true, true);
        this.field1148 = arg0.method1421(false, true);
        this.field1148.method2277(393168, 12, false);
        this.field1131 = arg0.method1389(9, false);
        this.field1131.method1119(49146, -27671);
        Buffer var2 = this.field1131.method1126(true, (byte) 124);
        if (var2 != null) {
            Stream var3 = arg0.method1449(14, var2);
            if (Stream.method2346()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method2339(var7);
                    var3.method2339(var7 + 1);
                    var3.method2339(var7 + 2);
                    var3.method2339(var7 + 2);
                    var3.method2339(var7 + 3);
                    var3.method2339(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method2343(var5);
                    var3.method2343(var5 + 1);
                    var3.method2343(var5 + 2);
                    var3.method2343(var5 + 2);
                    var3.method2343(var5 + 3);
                    var3.method2343(var5);
                }
            }
            var3.method2351();
            this.field1131.method1121(3104);
        }
        Buffer var8 = this.field1148.method2276(true, false);
        if (var8 != null) {
            Stream var9 = arg0.method1449(14, var8);
            if (Stream.method2346()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method2340(0.0F);
                    var9.method2340(-1.0F);
                    var9.method2340(0.0F);
                    var9.method2340(0.0F);
                    var9.method2340(-1.0F);
                    var9.method2340(0.0F);
                    var9.method2340(0.0F);
                    var9.method2340(-1.0F);
                    var9.method2340(0.0F);
                    var9.method2340(0.0F);
                    var9.method2340(-1.0F);
                    var9.method2340(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method2350(0.0F);
                    var9.method2350(-1.0F);
                    var9.method2350(0.0F);
                    var9.method2350(0.0F);
                    var9.method2350(-1.0F);
                    var9.method2350(0.0F);
                    var9.method2350(0.0F);
                    var9.method2350(-1.0F);
                    var9.method2350(0.0F);
                    var9.method2350(0.0F);
                    var9.method2350(-1.0F);
                    var9.method2350(0.0F);
                }
            }
            var9.method2351();
            this.field1148.method2281(-14567);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 565)
    public static void method697(int arg0) {
        if (arg0 == -31257) {
            field1137 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I", line = 576)
    public static final int method698(int arg0, int arg1) {
        field1138++;
        if (arg1 == 6406) {
            return 1;
        } else if (arg1 == 6409) {
            return 1;
        } else if (arg1 == 32841) {
            return 1;
        } else if (arg1 == 6410) {
            return 2;
        } else if (arg1 == 6407) {
            return 3;
        } else if (arg1 == 6408) {
            return 4;
        } else if (arg0 == -29695) {
            throw new IllegalArgumentException("");
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 613)
    public final void method699(int arg0) {
        field1142++;
        this.field1146.method1125(63);
        if (arg0 != 700) {
            this.field1132 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Llba;I)V", line = 625)
    private final void method700(class223 arg0, int arg1) {
        field1149++;
        class72.field791 = arg0.field3359;
        arg0.method1388(arg1 ^ 0xFFFFFFBE);
        arg0.method1408(-128, false);
        if (arg1 != 0) {
            this.method700(null, 22);
        }
        arg0.method1479(false, 7);
        arg0.method1498(true);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILlba;)V", line = 646)
    public final void method701(int arg0, class223 arg1) {
        if (arg0 == -1) {
            field1133++;
            this.field1146.method2277(786336, 24, false);
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Llba;IB)V", line = 661)
    private final void method702(class223 arg0, int arg1, byte arg2) {
        class72.field791 = arg0.field3359;
        field1136++;
        arg0.method1414(false, (float) arg1);
        if (arg2 != -55) {
            this.field1131 = null;
        }
        arg0.method1458(127);
        arg0.method1408(arg2 ^ 0x49, false);
        arg0.method1479(false, 7);
        arg0.method1498(true);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(ILlba;)V", line = 686)
    private final void method703(int arg0, class223 arg1) {
        arg1.method1479(true, 7);
        field1144++;
        arg1.method1408(-128, true);
        if (class72.field791 != arg1.field3359) {
            arg1.method202(class72.field791);
        }
        if (arg0 != 15505) {
            this.field1143 = null;
        }
    }
}
