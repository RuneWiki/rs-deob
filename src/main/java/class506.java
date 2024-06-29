import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class506 {

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "I")
    private int field6749 = 0;

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "[[Ldi;")
    private class115[][] field6755 = new class115[1600][64];

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "[I")
    private int[] field6762 = new int[1600];

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "[I")
    private int[] field6767 = new int[8191];

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[[Ldi;")
    private class115[][] field6756 = new class115[64][768];

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "[I")
    private int[] field6752 = new int[64];

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Lts;")
    private class501 field6763;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Leu;")
    private class448 field6768;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Leu;")
    private class448 field6750;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "Lft;")
    private class4 field6753;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
    public static int field6761;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "I")
    public static int field6765;

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "I")
    public static int field6766;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(BI)Z")
    public static final boolean method2803(byte arg0, int arg1) {
        if (arg0 < 41) {
            method2803((byte) -63, -72);
        }
        field6754++;
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLej;)V")
    private final void method2804(boolean arg0, class111 arg1) {
        class307.field4240 = arg1.field1833;
        field6761++;
        arg1.method898(1);
        arg1.method872((byte) 88, false);
        arg1.method826(arg0, 119);
        arg1.method895(0);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lej;II)V")
    private final void method2805(class111 arg0, int arg1, int arg2) {
        field6765++;
        int var4 = 0;
        class74 var5 = arg0.method871(arg1 ^ 0xFFFFD116);
        float var6 = var5.field1152;
        float var7 = var5.field1168;
        float var8 = var5.field1159;
        float var9 = var5.field1183;
        float var10 = var5.field1167;
        float var11 = var5.field1136;
        float var12 = var6 + var9;
        float var13 = var7 + var10;
        if (arg1 != 14253) {
            method2811(true);
        }
        float var14 = var8 + var11;
        float var15 = var6 - var9;
        float var16 = var7 - var10;
        float var17 = var8 - var11;
        float var18 = var9 - var6;
        float var19 = var10 - var7;
        float var20 = var11 - var8;
        Buffer var21 = this.field6768.method27((byte) -64, true);
        if (var21 == null) {
            return;
        }
        Stream var22 = arg0.method896(var21, (byte) -89);
        if (Stream.method3473()) {
            for (int var23 = arg2 - 1; var23 >= 0; var23--) {
                int var24 = this.field6762[var23] > 64 ? 64 : this.field6762[var23];
                if (var24 > 0) {
                    for (int var25 = var24 - 1; var25 >= 0; var25--) {
                        class115 var38 = this.field6755[var23][var25];
                        int var39 = var38.field1979;
                        byte var40 = (byte) (var39 >> 16);
                        byte var41 = (byte) (var39 >> 8);
                        byte var42 = (byte) var39;
                        byte var43 = (byte) (var39 >>> 24);
                        float var44 = (float) (var38.field1973 >> 12);
                        float var45 = (float) (var38.field1976 >> 12);
                        float var46 = (float) (var38.field1972 >> 12);
                        int var47 = var38.field1983 >> 12;
                        var22.method3480((float) (-var47) * var12 + var44);
                        var22.method3480((float) (-var47) * var13 + var45);
                        var22.method3480((float) (-var47) * var14 + var46);
                        if (arg0.field1835 == 0) {
                            var22.method3476(var40, var41, var42, var43);
                        } else {
                            var22.method3481(var40, var41, var42, var43);
                        }
                        var22.method3480(0.0F);
                        var22.method3480(0.0F);
                        var22.method3480((float) var47 * var15 + var44);
                        var22.method3480((float) var47 * var16 + var45);
                        var22.method3480((float) var47 * var17 + var46);
                        if (arg0.field1835 == 0) {
                            var22.method3476(var40, var41, var42, var43);
                        } else {
                            var22.method3481(var40, var41, var42, var43);
                        }
                        var22.method3480(1.0F);
                        var22.method3480(0.0F);
                        var22.method3480((float) var47 * var12 + var44);
                        var22.method3480((float) var47 * var13 + var45);
                        var22.method3480((float) var47 * var14 + var46);
                        if (arg0.field1835 == 0) {
                            var22.method3476(var40, var41, var42, var43);
                        } else {
                            var22.method3481(var40, var41, var42, var43);
                        }
                        var22.method3480(1.0F);
                        var22.method3480(1.0F);
                        var22.method3480((float) var47 * var18 + var44);
                        var22.method3480((float) var47 * var19 + var45);
                        var22.method3480((float) var47 * var20 + var46);
                        if (arg0.field1835 == 0) {
                            var22.method3476(var40, var41, var42, var43);
                        } else {
                            var22.method3481(var40, var41, var42, var43);
                        }
                        var22.method3480(0.0F);
                        var4++;
                        var22.method3480(1.0F);
                    }
                    if (this.field6762[var23] > 64) {
                        int var26 = this.field6762[var23] - 64 - 1;
                        for (int var27 = this.field6752[var26] - 1; var27 >= 0; var27--) {
                            class115 var28 = this.field6756[var26][var27];
                            int var29 = var28.field1979;
                            byte var30 = (byte) (var29 >> 16);
                            byte var31 = (byte) (var29 >> 8);
                            byte var32 = (byte) var29;
                            byte var33 = (byte) (var29 >>> 24);
                            float var34 = (float) (var28.field1973 >> 12);
                            float var35 = (float) (var28.field1976 >> 12);
                            float var36 = (float) (var28.field1972 >> 12);
                            int var37 = var28.field1983 >> 12;
                            var22.method3480((float) (-var37) * var12 + var34);
                            var22.method3480((float) (-var37) * var13 + var35);
                            var22.method3480((float) (-var37) * var14 + var36);
                            if (arg0.field1835 == 0) {
                                var22.method3476(var30, var31, var32, var33);
                            } else {
                                var22.method3481(var30, var31, var32, var33);
                            }
                            var22.method3480(0.0F);
                            var22.method3480(0.0F);
                            var22.method3480((float) var37 * var15 + var34);
                            var22.method3480((float) var37 * var16 + var35);
                            var22.method3480((float) var37 * var17 + var36);
                            if (arg0.field1835 == 0) {
                                var22.method3476(var30, var31, var32, var33);
                            } else {
                                var22.method3481(var30, var31, var32, var33);
                            }
                            var22.method3480(1.0F);
                            var22.method3480(0.0F);
                            var22.method3480((float) var37 * var12 + var34);
                            var22.method3480((float) var37 * var13 + var35);
                            var22.method3480((float) var37 * var14 + var36);
                            if (arg0.field1835 == 0) {
                                var22.method3476(var30, var31, var32, var33);
                            } else {
                                var22.method3481(var30, var31, var32, var33);
                            }
                            var22.method3480(1.0F);
                            var22.method3480(1.0F);
                            var22.method3480((float) var37 * var18 + var34);
                            var22.method3480((float) var37 * var19 + var35);
                            var22.method3480((float) var37 * var20 + var36);
                            if (arg0.field1835 == 0) {
                                var22.method3476(var30, var31, var32, var33);
                            } else {
                                var22.method3481(var30, var31, var32, var33);
                            }
                            var22.method3480(0.0F);
                            var4++;
                            var22.method3480(1.0F);
                        }
                    }
                }
            }
        } else {
            for (int var48 = arg2 - 1; var48 >= 0; var48--) {
                int var49 = this.field6762[var48] <= 64 ? this.field6762[var48] : 64;
                if (var49 > 0) {
                    for (int var50 = var49 - 1; var50 >= 0; var50--) {
                        class115 var63 = this.field6755[var48][var50];
                        int var64 = var63.field1979;
                        byte var65 = (byte) (var64 >> 16);
                        byte var66 = (byte) (var64 >> 8);
                        byte var67 = (byte) var64;
                        byte var68 = (byte) (var64 >>> 24);
                        float var69 = (float) (var63.field1973 >> 12);
                        float var70 = (float) (var63.field1976 >> 12);
                        float var71 = (float) (var63.field1972 >> 12);
                        int var72 = var63.field1983 >> 12;
                        var22.method3477((float) (-var72) * var12 + var69);
                        var22.method3477((float) (-var72) * var13 + var70);
                        var22.method3477((float) (-var72) * var14 + var71);
                        if (arg0.field1835 == 0) {
                            var22.method3476(var65, var66, var67, var68);
                        } else {
                            var22.method3481(var65, var66, var67, var68);
                        }
                        var22.method3477(0.0F);
                        var22.method3477(0.0F);
                        var22.method3477((float) var72 * var15 + var69);
                        var22.method3477((float) var72 * var16 + var70);
                        var22.method3477((float) var72 * var17 + var71);
                        if (arg0.field1835 == 0) {
                            var22.method3476(var65, var66, var67, var68);
                        } else {
                            var22.method3481(var65, var66, var67, var68);
                        }
                        var22.method3477(1.0F);
                        var22.method3477(0.0F);
                        var22.method3477((float) var72 * var12 + var69);
                        var22.method3477((float) var72 * var13 + var70);
                        var22.method3477((float) var72 * var14 + var71);
                        if (arg0.field1835 == 0) {
                            var22.method3476(var65, var66, var67, var68);
                        } else {
                            var22.method3481(var65, var66, var67, var68);
                        }
                        var22.method3477(1.0F);
                        var22.method3477(1.0F);
                        var22.method3477((float) var72 * var18 + var69);
                        var22.method3477((float) var72 * var19 + var70);
                        var22.method3477((float) var72 * var20 + var71);
                        if (arg0.field1835 == 0) {
                            var22.method3476(var65, var66, var67, var68);
                        } else {
                            var22.method3481(var65, var66, var67, var68);
                        }
                        var22.method3477(0.0F);
                        var22.method3477(1.0F);
                        var4++;
                    }
                    if (this.field6762[var48] > 64) {
                        int var51 = this.field6762[var48] - 65;
                        for (int var52 = this.field6752[var51] - 1; var52 >= 0; var52--) {
                            class115 var53 = this.field6756[var51][var52];
                            int var54 = var53.field1979;
                            byte var55 = (byte) (var54 >> 16);
                            byte var56 = (byte) (var54 >> 8);
                            byte var57 = (byte) var54;
                            byte var58 = (byte) (var54 >>> 24);
                            float var59 = (float) (var53.field1973 >> 12);
                            float var60 = (float) (var53.field1976 >> 12);
                            float var61 = (float) (var53.field1972 >> 12);
                            int var62 = var53.field1983 >> 12;
                            var22.method3477((float) (-var62) * var12 + var59);
                            var22.method3477((float) (-var62) * var13 + var60);
                            var22.method3477((float) (-var62) * var14 + var61);
                            if (arg0.field1835 == 0) {
                                var22.method3476(var55, var56, var57, var58);
                            } else {
                                var22.method3481(var55, var56, var57, var58);
                            }
                            var22.method3477(0.0F);
                            var22.method3477(0.0F);
                            var22.method3477((float) var62 * var15 + var59);
                            var22.method3477((float) var62 * var16 + var60);
                            var22.method3477((float) var62 * var17 + var61);
                            if (arg0.field1835 == 0) {
                                var22.method3476(var55, var56, var57, var58);
                            } else {
                                var22.method3481(var55, var56, var57, var58);
                            }
                            var22.method3477(1.0F);
                            var22.method3477(0.0F);
                            var22.method3477((float) var62 * var12 + var59);
                            var22.method3477((float) var62 * var13 + var60);
                            var22.method3477((float) var62 * var14 + var61);
                            if (arg0.field1835 == 0) {
                                var22.method3476(var55, var56, var57, var58);
                            } else {
                                var22.method3481(var55, var56, var57, var58);
                            }
                            var22.method3477(1.0F);
                            var22.method3477(1.0F);
                            var22.method3477((float) var62 * var18 + var59);
                            var22.method3477((float) var62 * var19 + var60);
                            var22.method3477((float) var62 * var20 + var61);
                            if (arg0.field1835 == 0) {
                                var22.method3476(var55, var56, var57, var58);
                            } else {
                                var22.method3481(var55, var56, var57, var58);
                            }
                            var22.method3477(0.0F);
                            var22.method3477(1.0F);
                            var4++;
                        }
                    }
                }
            }
        }
        var22.method3479();
        if (this.field6768.method28(arg1 ^ 0x1BD3)) {
            arg0.method48((byte) -32, this.field6768, 0);
            arg0.method48((byte) -32, this.field6750, 1);
            arg0.method62(false, this.field6763);
            arg0.method53(0, 0, class620.field8229, this.field6753, 0, var4 * 4, var4 * 2);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lc;Lej;I)V")
    public final void method2806(class174 arg0, class111 arg1, int arg2) {
        field6760++;
        if (arg1.field1813 == null || arg2 != 0) {
            return;
        }
        this.method2804(false, arg1);
        float var4 = arg1.field1813.field1163;
        float var5 = arg1.field1813.field1158;
        float var6 = arg1.field1813.field1176;
        float var7 = arg1.field1813.field1160;
        try {
            if (arg0.field2683) {
                int var8 = arg0.field2684 - arg0.field2682;
                int var9;
                if (var8 + 2 <= 1600) {
                    var8 += 2;
                    var9 = 0;
                } else {
                    var9 = class364.method2153((byte) -38, var8) + 1 - class436.field5953;
                    var8 = (var8 >> var9) + 2;
                }
                class444 var10 = arg0.field2679.field4804;
                class444 var11 = var10.field6079;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field6749 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field6762[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field6752[var16] = 0;
                    }
                    while (var10 != var11) {
                        class115 var17 = (class115) var11;
                        if (var14) {
                            var13 = var17.field1978;
                            var14 = false;
                            var12 = var17.field1982;
                        } else if (var17.field1982 != var12 || var17.field1978 != var13) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field1972 >> 12) * var6 + (float) (var17.field1976 >> 12) * var5 + (float) (var17.field1973 >> 12) * var4 + var7) - arg0.field2682 >> var9;
                        if (var18 < 1600) {
                            if (this.field6762[var18] < 64) {
                                this.field6755[var18][this.field6762[var18]++] = var17;
                            } else {
                                label199: {
                                    if (this.field6762[var18] == 64) {
                                        if (this.field6749 == 64) {
                                            break label199;
                                        }
                                        this.field6762[var18] += this.field6749++ + 1;
                                    }
                                    this.field6756[this.field6762[var18] - 64 - 1][this.field6752[this.field6762[var18] - 64 - 1]++] = var17;
                                }
                            }
                        }
                        var11 = var11.field6079;
                    }
                    arg1.method846(false, var12 > 0 ? var12 : -1, false, (byte) 54);
                    if (var13 && class307.field4240 != arg1.field1833) {
                        arg1.method442(class307.field4240);
                    } else if (arg1.field1833 != 1.0F) {
                        arg1.method442(1.0F);
                    }
                    this.method2805(arg1, arg2 ^ 0x37AD, var8);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class444 var22 = arg0.field2679.field4804;
                for (class444 var23 = var22.field6079; var23 != var22; var23 = var23.field6079) {
                    class115 var24 = (class115) var23;
                    int var25 = (int) ((float) (var24.field1972 >> 12) * var6 + (float) (var24.field1976 >> 12) * var5 + (float) (var24.field1973 >> 12) * var4 + var7);
                    if (var25 > var21) {
                        var21 = var25;
                    }
                    if (var20 > var25) {
                        var20 = var25;
                    }
                    this.field6767[var19++] = var25;
                }
                int var26 = var21 - var20;
                int var27;
                if ((var26 + 2) > 1600) {
                    var27 = 1 - (class436.field5953 - class364.method2153((byte) -23, var26));
                    var26 = (var26 >> var27) + 2;
                } else {
                    var26 += 2;
                    var27 = 0;
                }
                class444 var28 = var22.field6079;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field6749 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field6762[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field6752[var34] = 0;
                    }
                    while (var22 != var28) {
                        class115 var35 = (class115) var28;
                        if (var32) {
                            var31 = var35.field1978;
                            var30 = var35.field1982;
                            var32 = false;
                        }
                        if (var29 > 0 && (var35.field1982 != var30 || var35.field1978 != var31)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field6767[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field6762[var36] < 64) {
                                this.field6755[var36][this.field6762[var36]++] = var35;
                            } else {
                                label149: {
                                    if (this.field6762[var36] == 64) {
                                        if (this.field6749 == 64) {
                                            break label149;
                                        }
                                        this.field6762[var36] += (this.field6749++) + 1;
                                    }
                                    this.field6756[this.field6762[var36] - 1 - 64][this.field6752[this.field6762[var36] - 64 - 1]++] = var35;
                                }
                            }
                        }
                        var28 = var28.field6079;
                    }
                    arg1.method846(false, var30 >= 0 ? var30 : -1, false, (byte) 54);
                    if (var31 && class307.field4240 != arg1.field1833) {
                        arg1.method442(class307.field4240);
                    } else if (arg1.field1833 != 1.0F) {
                        arg1.method442(1.0F);
                    }
                    this.method2805(arg1, 14253, var26);
                }
            }
        } catch (Exception var37) {
        }
        this.method2808(67, arg1);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZ)V")
    public static final void method2807(int arg0, boolean arg1) {
        if (class2.field11 == null) {
            class647.method3546(arg0 ^ 0x6CB8);
        }
        field6758++;
        if (arg1) {
            class2.field11.method1433(0);
        }
        if (arg0 != 27847) {
            field6748 = 9;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILej;)V")
    private final void method2808(int arg0, class111 arg1) {
        arg1.method826(true, 70);
        field6766++;
        arg1.method872((byte) 65, true);
        if (class307.field4240 != arg1.field1833) {
            arg1.method442(class307.field4240);
        }
        if (arg0 <= 53) {
            this.field6752 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public final void method2809(int arg0) {
        this.field6768.method24((byte) -93);
        field6759++;
        if (arg0 != 0) {
            this.method2808(54, null);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII)V")
    public static final void method2810(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 != -51) {
            field6748 = -83;
        }
        field6764++;
        if (class344.field4718.field5450 != 0 && arg0 != 0 && class273.field3798 < 50 && arg4 != -1) {
            class653.field8828[class273.field3798++] = new class70((byte) 1, arg4, arg0, arg3, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Z)Lub;")
    public static final class20 method2811(boolean arg0) {
        field6751++;
        if (arg0) {
            field6748 = -111;
        }
        if (class567.field7508 == null || class235.field3311 == null) {
            return null;
        }
        class235.field3311.method2387(class567.field7508, true);
        class20 var1 = (class20) class235.field3311.method2386(32);
        if (var1 == null) {
            return null;
        } else {
            class634 var2 = class567.field7498.method1487(var1.field317, (byte) 115);
            return var2 != null && var2.field8542 && var2.method3507(class567.field7495, true) ? var1 : class97.method751(-5571);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(ILej;)V")
    public final void method2812(int arg0, class111 arg1) {
        this.field6768.method2520(-5368, 24, 786336);
        field6757++;
        if (arg0 >= -72) {
            this.field6756 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lej;)V")
    public class506(class111 arg0) {
        this.field6763 = arg0.method45(1, new class282[] { new class282(new class512[] { class512.field6843, class512.field6846, class512.field6848 }), new class282(class512.field6845) });
        this.field6768 = arg0.method108(true, 15918);
        this.field6750 = arg0.method108(false, 15918);
        this.field6750.method2520(-5368, 12, 393168);
        this.field6753 = arg0.method105(false, 10);
        this.field6753.method26(-24955, 49146);
        Buffer var2 = this.field6753.method27((byte) -64, true);
        if (var2 != null) {
            Stream var3 = arg0.method896(var2, (byte) -89);
            if (Stream.method3473()) {
                for (int var6 = 0; var6 < 8191; var6++) {
                    int var7 = var6 * 4;
                    var3.method3474(var7);
                    var3.method3474(var7 + 1);
                    var3.method3474(var7 + 2);
                    var3.method3474(var7 + 2);
                    var3.method3474(var7 + 3);
                    var3.method3474(var7);
                }
            } else {
                for (int var4 = 0; var4 < 8191; var4++) {
                    int var5 = var4 * 4;
                    var3.method3478(var5);
                    var3.method3478(var5 + 1);
                    var3.method3478(var5 + 2);
                    var3.method3478(var5 + 2);
                    var3.method3478(var5 + 3);
                    var3.method3478(var5);
                }
            }
            var3.method3479();
            this.field6753.method28(11390);
        }
        Buffer var8 = this.field6750.method27((byte) -64, true);
        if (var8 != null) {
            Stream var9 = arg0.method896(var8, (byte) -82);
            if (Stream.method3473()) {
                for (int var10 = 0; var10 < 8191; var10++) {
                    var9.method3480(0.0F);
                    var9.method3480(-1.0F);
                    var9.method3480(0.0F);
                    var9.method3480(0.0F);
                    var9.method3480(-1.0F);
                    var9.method3480(0.0F);
                    var9.method3480(0.0F);
                    var9.method3480(-1.0F);
                    var9.method3480(0.0F);
                    var9.method3480(0.0F);
                    var9.method3480(-1.0F);
                    var9.method3480(0.0F);
                }
            } else {
                for (int var11 = 0; var11 < 8191; var11++) {
                    var9.method3477(0.0F);
                    var9.method3477(-1.0F);
                    var9.method3477(0.0F);
                    var9.method3477(0.0F);
                    var9.method3477(-1.0F);
                    var9.method3477(0.0F);
                    var9.method3477(0.0F);
                    var9.method3477(-1.0F);
                    var9.method3477(0.0F);
                    var9.method3477(0.0F);
                    var9.method3477(-1.0F);
                    var9.method3477(0.0F);
                }
            }
            var9.method3479();
            this.field6750.method28(11390);
        }
    }
}
