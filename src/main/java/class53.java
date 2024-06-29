import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "I")
    private int field510 = -1;

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Z")
    private boolean field522 = false;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Z")
    private boolean field524 = false;

    @OriginalMember(owner = "client!ie", name = "r", descriptor = "I")
    private int field526 = -1;

    @OriginalMember(owner = "client!ie", name = "w", descriptor = "I")
    private int field531 = -32768;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public int field516;

    @OriginalMember(owner = "client!ie", name = "E", descriptor = "I")
    public int field539;

    @OriginalMember(owner = "client!ie", name = "C", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!ie", name = "x", descriptor = "I")
    public int field532;

    @OriginalMember(owner = "client!ie", name = "B", descriptor = "B")
    private byte field536;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "B")
    private byte field543;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Z")
    private boolean field545;

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static int field523 = 1;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "I")
    public static int field521 = 0;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "I")
    public static int field509;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field511;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public static int field512;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client!ie", name = "q", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ie", name = "t", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ie", name = "v", descriptor = "I")
    private int field530;

    @OriginalMember(owner = "client!ie", name = "y", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ie", name = "z", descriptor = "I")
    public static int field534;

    @OriginalMember(owner = "client!ie", name = "A", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!ie", name = "D", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!ie", name = "F", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!ie", name = "G", descriptor = "Lld;")
    public static class116 field541;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "Ldp;")
    public class174 field546;

    @OriginalMember(owner = "client!ie", name = "s", descriptor = "Llb;")
    private class208 field527;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "Lve;")
    private class307 field514;

    @OriginalMember(owner = "client!ie", name = "u", descriptor = "Ljn;")
    private class396 field529;

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "Lok;")
    public static class60 field547;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "[Z")
    private boolean[] field520;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BI)V")
    private final void method251(byte arg0, int arg1) {
        field511++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class225 var5 = class281.method1655((byte) -28, this.field539);
            class225 var6 = var5;
            if (var5.field3061 != null) {
                var5 = var5.method1219(-106);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3001 != null) {
                if (this.field527 != null && var5.method1217(this.field527.field2837, (byte) -60)) {
                    return;
                }
                var3 = var5.method1216(0);
                if (this.field526 != var5.field3051) {
                    var4 = var5.field3035;
                }
            } else if (var5.field3054 == -1) {
                if (var6 != null && var6.field3001 != null) {
                    if (this.field527 != null && var6.method1217(this.field527.field2837, (byte) -60)) {
                        return;
                    }
                    var3 = var6.method1216(0);
                    if (this.field526 != var6.field3051) {
                        var4 = var6.field3035;
                    }
                } else if (var6 != null && var6.field3054 != -1 && this.field526 != var6.field3051) {
                    var4 = var6.field3035;
                    var3 = var6.field3054;
                }
            } else if (this.field526 != var5.field3051) {
                var4 = var5.field3035;
                var3 = var5.field3054;
            }
        }
        if (var3 == -1) {
            this.field527 = null;
            return;
        }
        this.field529 = null;
        if (this.field527 == null || this.field527.field2837 != var3) {
            this.field527 = class193.method1037(124, var3);
        } else if (this.field527.field2806 == 0) {
            return;
        }
        if (arg0 != 16) {
            this.field532 = 121;
        }
        if (this.field527.field2823 == null) {
            this.field527 = null;
            return;
        }
        if (var4) {
            this.field519 = (int) (Math.random() * (double) this.field527.field2823.length);
            this.field535 = (int) ((double) this.field527.field2818[this.field519] * Math.random()) + 1;
        } else {
            this.field535 = 1;
            this.field519 = 0;
        }
        this.field538 = this.field519 + 1;
        if (this.field538 < 0 || this.field527.field2823.length <= this.field538) {
            this.field538 = -1;
        }
        this.field530 = class234.field3224 - this.field535;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(III)V")
    private final void method252(int arg0, int arg1, int arg2) {
        field515++;
        if (arg2 != -24682) {
            this.method263(100);
        }
        label90: while (true) {
            if (this.field527 == null) {
                if (this.field522) {
                    return;
                }
                this.method251((byte) 16, -1);
                if (this.field527 == null) {
                    return;
                }
            }
            int var4 = class234.field3224 - this.field530;
            if (var4 > 100 && this.field527.field2828 > 0) {
                int var5 = this.field527.field2823.length - this.field527.field2828;
                while (var5 > this.field519 && var4 > this.field527.field2818[this.field519]) {
                    var4 -= this.field527.field2818[this.field519];
                    this.field519++;
                }
                if (var5 <= this.field519) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field527.field2823.length; var7++) {
                        var6 += this.field527.field2818[var7];
                    }
                    var4 %= var6;
                }
                this.field538 = this.field519 + 1;
                if (this.field538 >= this.field527.field2823.length) {
                    this.field538 -= this.field527.field2828;
                    if (this.field538 < 0 || this.field527.field2823.length <= this.field538) {
                        this.field538 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (var4 <= this.field527.field2818[this.field519]) {
                            this.field530 = class234.field3224 - var4;
                            this.field535 = var4;
                            return;
                        }
                        class320.method1848(false, 122, this.field527, this.field519, arg0, arg1);
                        var4 -= this.field527.field2818[this.field519];
                        this.field519++;
                        if (this.field519 >= this.field527.field2823.length) {
                            this.field519 -= this.field527.field2828;
                            if (this.field519 < 0 || this.field519 >= this.field527.field2823.length) {
                                this.field527 = null;
                                continue label90;
                            }
                        }
                        this.field538 = this.field519 + 1;
                    } while (this.field538 < this.field527.field2823.length);
                    this.field538 -= this.field527.field2828;
                } while (this.field538 >= 0 && this.field527.field2823.length > this.field538);
                this.field538 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(BI)V")
    public final void method253(byte arg0, int arg1) {
        this.field522 = true;
        field534++;
        if (arg0 > -37) {
            this.field522 = false;
        }
        this.method251((byte) 16, arg1);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(CI)C")
    public static final char method254(char arg0, int arg1) {
        field513++;
        if (arg0 == 'µ' || arg0 == 'ƒ') {
            return arg0;
        } else if (arg1 == 402) {
            return Character.toTitleCase(arg0);
        } else {
            return 'A';
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(IC)Z")
    public static final boolean method255(int arg0, char arg1) {
        field509++;
        int var2 = -13 / ((10 - arg0) / 46);
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)Z")
    public final boolean method256(int arg0) {
        field533++;
        if (arg0 != 15842) {
            this.field532 = 24;
        }
        return this.field545;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I[[BI[[BZ[[ILvm;Lbl;I[[BILbl;[[B)V")
    public static final void method257(int arg0, byte[][] arg1, int arg2, byte[][] arg3, boolean arg4, int[][] arg5, class322 arg6, class54 arg7, int arg8, byte[][] arg9, int arg10, class54 arg11, byte[][] arg12) {
        field525++;
        for (int var13 = 0; var13 < arg8; var13++) {
            int var15 = arg8 - 1 <= var13 ? var13 : var13 + 1;
            for (int var16 = 0; var16 < arg0; var16++) {
                int var17 = var16 < arg0 - 1 ? var16 + 1 : var16;
                if (class138.method758(-10762) || class230.method1249(var16, arg2, class351.field4891, var13, -90)) {
                    boolean var18 = false;
                    boolean var19 = false;
                    boolean[] var20 = new boolean[4];
                    int var21 = arg12[var13][var16];
                    int var22 = arg3[var13][var16];
                    int var23 = arg1[var13][var16] & 0xFF;
                    int var24 = arg9[var13][var16] & 0xFF;
                    int var25 = arg9[var13][var17] & 0xFF;
                    int var26 = arg9[var15][var17] & 0xFF;
                    int var27 = arg9[var15][var16] & 0xFF;
                    if (var23 != 0 || var24 != 0) {
                        class191 var28 = var23 == 0 ? null : class247.method1317((byte) 97, var23 - 1);
                        if (var21 == 0 && var28 == null) {
                            var21 = 12;
                        }
                        class262 var29 = var24 == 0 ? null : class405.method2536((byte) 90, var24 - 1);
                        class191 var30 = var28;
                        if (var28 != null) {
                            if (var28.field2417 == -1 && var28.field2413 == -1) {
                                var30 = var28;
                                var28 = null;
                            } else if (var29 != null && var21 != 0) {
                                var19 = var28.field2405;
                            }
                        }
                        if ((var21 == 0 || var21 == 12) && var13 > 0 && var16 > 0 && arg8 > var13 && arg0 > var16) {
                            byte var31 = 0;
                            byte var32 = 0;
                            byte var33 = 0;
                            byte var34 = 0;
                            int var35 = var31 + (arg9[var13 - 1][var16 - 1] == var24 ? 1 : -1);
                            int var36 = var32 + (arg9[var15][var16 - 1] == var24 ? 1 : -1);
                            int var37 = var33 + (arg9[var15][var17] == var24 ? 1 : -1);
                            int var38 = var34 + (arg9[var13 - 1][var17] == var24 ? 1 : -1);
                            if (arg9[var13][var16 - 1] == var24) {
                                var36++;
                                var35++;
                            } else {
                                var36--;
                                var35--;
                            }
                            if (arg9[var15][var16] == var24) {
                                var37++;
                                var36++;
                            } else {
                                var37--;
                                var36--;
                            }
                            if (arg9[var13][var17] == var24) {
                                var37++;
                                var38++;
                            } else {
                                var37--;
                                var38--;
                            }
                            if (arg9[var13 - 1][var16] == var24) {
                                var35++;
                                var38++;
                            } else {
                                var38--;
                                var35--;
                            }
                            int var39 = var35 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            int var40 = var36 - var38;
                            if (var40 < 0) {
                                var40 = -var40;
                            }
                            if (var39 == var40) {
                                var39 = arg7.method271(var13, var16) - arg7.method271(var15, var17);
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                                var40 = arg7.method271(var15, var16) - arg7.method271(var13, var17);
                                if (var40 < 0) {
                                    var40 = -var40;
                                }
                            }
                            var22 = var39 < var40 ? 1 : 0;
                        }
                        for (int var41 = 0; var41 < 13; var41++) {
                            class321.field4296[var41] = -1;
                            class18.field175[var41] = 1;
                        }
                        boolean[] var42 = var28 != null && var28.field2405 ? class427.field6276[var21] : class386.field5506[var21];
                        class365.method2217(arg1, arg12, var20, arg6, arg0, var21, (byte) 79, arg3, var28, var29, var13, var16, arg8, var22);
                        boolean var43 = var28 != null && var28.field2417 != var28.field2413;
                        if (!var43) {
                            for (int var44 = 0; var44 < 8; var44++) {
                                if (class321.field4296[var44] >= 0 && class231.field3181[var44] != class136.field1738[var44]) {
                                    var43 = true;
                                    break;
                                }
                            }
                        }
                        if (!var42[var22 + 1 & 0x3]) {
                            var20[1] = class198.method1062(var20[1], class262.method1461(class18.field175[2], class18.field175[4]) == 0);
                        }
                        if (!var42[var22 + 3 & 0x3]) {
                            var20[3] = class198.method1062(var20[3], class262.method1461(class18.field175[0], class18.field175[6]) == 0);
                        }
                        if (!var42[var22 & 0x3]) {
                            var20[0] = class198.method1062(var20[0], class262.method1461(class18.field175[2], class18.field175[0]) == 0);
                        }
                        if (!var42[var22 + 2 & 0x3]) {
                            var20[2] = class198.method1062(var20[2], class262.method1461(class18.field175[4], class18.field175[6]) == 0);
                        }
                        if (!var19 && (var21 == 0 || var21 == 12)) {
                            if (var20[0] && !var20[1] && !var20[2] && var20[3]) {
                                var20[0] = var20[3] = false;
                                var21 = var21 == 0 ? 13 : 14;
                                var22 = 0;
                            } else if (var20[0] && var20[1] && !var20[2] && !var20[3]) {
                                var22 = 3;
                                var20[0] = var20[1] = false;
                                var21 = var21 == 0 ? 13 : 14;
                            } else if (!var20[0] && var20[1] && var20[2] && !var20[3]) {
                                var22 = 2;
                                var21 = var21 == 0 ? 13 : 14;
                                var20[1] = var20[2] = false;
                            } else if (!var20[0] && !var20[1] && var20[2] && var20[3]) {
                                var22 = 1;
                                var20[2] = var20[3] = false;
                                var21 = var21 == 0 ? 13 : 14;
                            }
                        }
                        boolean var45 = !var19 && !var20[0] && !var20[2] && !var20[1] && !var20[3];
                        int[] var46 = null;
                        int[] var47;
                        int[] var48;
                        int var49;
                        int var50;
                        int[] var51;
                        if (var45) {
                            var47 = class27.field256[var21];
                            var48 = class430.field6310[var21];
                            var49 = var29 == null ? 0 : class164.field2090[var21];
                            var50 = var28 == null ? 0 : class441.field6441[var21];
                            var51 = class418.field6017[var21];
                        } else if (var19) {
                            var50 = var28 == null ? 0 : class32.field309[var21];
                            var49 = var29 == null ? 0 : class334.field4441[var21];
                            var51 = class72.field795[var21];
                            var47 = class436.field6382[var21];
                            var48 = class347.field4840[var21];
                            var46 = class14.field135[var21];
                        } else {
                            var51 = class395.field5687[var21];
                            var46 = class279.field3797[var21];
                            var49 = var29 == null ? 0 : class405.field5885[var21];
                            var48 = class200.field2687[var21];
                            var50 = var28 == null ? 0 : class3.field27[var21];
                            var47 = class438.field6420[var21];
                        }
                        int var52 = var49 + var50;
                        if (var52 <= 0) {
                            class307.method1807(arg2, var13, var16);
                        } else {
                            if (var20[0]) {
                                var52++;
                            }
                            if (var20[2]) {
                                var52++;
                            }
                            if (var20[1]) {
                                var52++;
                            }
                            if (var20[3]) {
                                var52++;
                            }
                            int var53 = 0;
                            int var54 = 0;
                            int var55 = var52 * 3;
                            int[] var56 = arg4 ? new int[var55] : null;
                            int[] var57 = var43 ? new int[var55] : null;
                            int[] var58 = new int[var55];
                            int[] var59 = new int[var55];
                            int[] var60 = new int[var55];
                            int[] var61 = new int[var55];
                            int[] var62 = new int[var55];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var28 != null) {
                                var63 = var28.field2417;
                                var64 = arg6.method1562() ? var28.field2412 : var28.field2404;
                                var65 = var28.field2419;
                                int var66 = class156.method839(var28, 1604449159, arg6);
                                for (int var67 = 0; var67 < var50; var67++) {
                                    boolean var93 = false;
                                    byte var94;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = 1;
                                        class87.field981[2] = var48[var53];
                                        class87.field981[3] = 1;
                                        class87.field981[4] = var47[var53];
                                        class87.field981[5] = var48[var53];
                                        var94 = 6;
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = 5;
                                        class87.field981[2] = var48[var53];
                                        class87.field981[3] = 5;
                                        class87.field981[4] = var47[var53];
                                        var94 = 6;
                                        class87.field981[5] = var48[var53];
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = 3;
                                        class87.field981[2] = var48[var53];
                                        class87.field981[3] = 3;
                                        class87.field981[4] = var47[var53];
                                        var94 = 6;
                                        class87.field981[5] = var48[var53];
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = 7;
                                        class87.field981[2] = var48[var53];
                                        class87.field981[3] = 7;
                                        class87.field981[4] = var47[var53];
                                        class87.field981[5] = var48[var53];
                                        var94 = 6;
                                    } else {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = var47[var53];
                                        var94 = 3;
                                        class87.field981[2] = var48[var53];
                                    }
                                    var53++;
                                    for (int var95 = 0; var95 < var94; var95++) {
                                        int var96 = class87.field981[var95];
                                        int var97 = var96 - (var22 * 2) & 0x7;
                                        int var98 = class317.field4230[var96];
                                        int var99 = class296.field4038[var96];
                                        if (var22 == 1) {
                                            var58[var54] = var99;
                                            var59[var54] = 128 - var98;
                                        } else if (var22 == 2) {
                                            var58[var54] = 128 - var98;
                                            var59[var54] = 128 - var99;
                                        } else if (var22 == 3) {
                                            var58[var54] = 128 - var99;
                                            var59[var54] = var98;
                                        } else {
                                            var58[var54] = var98;
                                            var59[var54] = var99;
                                        }
                                        if (arg4 && class248.field3350[var21][var96]) {
                                            int var100 = (var13 << 7) + var58[var54];
                                            int var101 = (var16 << 7) + var59[var54];
                                            var56[var54] = arg11.method265(var100, var101) - arg7.method265(var100, var101);
                                        }
                                        if (var96 < 8 && class321.field4296[var97] > var28.field2409) {
                                            if (var57 != null) {
                                                var57[var54] = class136.field1738[var97];
                                            }
                                            var62[var54] = class371.field5198[var97];
                                            var61[var54] = class191.field2418[var97];
                                            var60[var54] = class231.field3181[var97];
                                        } else {
                                            if (var57 != null) {
                                                var57[var54] = var66;
                                            }
                                            var61[var54] = arg6.method1562() ? var28.field2412 : var28.field2404;
                                            var62[var54] = var28.field2419;
                                            var60[var54] = var63;
                                        }
                                        var54++;
                                    }
                                }
                                if (!arg4 && arg2 == 0) {
                                    class38.method183(var13, var16, var28.field2408, var28.field2414 * 8);
                                }
                                if (var21 != 12 && var28.field2417 != -1 && var28.field2411) {
                                    var18 = true;
                                }
                            } else if (var45) {
                                var53 += class441.field6441[var21];
                            } else if (var19) {
                                var53 += class32.field309[var21];
                            } else {
                                var53 += class3.field27[var21];
                            }
                            if (var29 != null) {
                                if (var25 == 0) {
                                    var25 = var24;
                                }
                                if (var26 == 0) {
                                    var26 = var24;
                                }
                                if (var27 == 0) {
                                    var27 = var24;
                                }
                                class262 var68 = class405.method2536((byte) 90, var24 - 1);
                                class262 var69 = class405.method2536((byte) 90, var25 - 1);
                                class262 var70 = class405.method2536((byte) 90, var26 - 1);
                                class262 var71 = class405.method2536((byte) 90, var27 - 1);
                                for (int var72 = 0; var72 < var49; var72++) {
                                    boolean var73 = false;
                                    byte var74;
                                    if (var20[-var22 & 0x3] && var46[0] == var53) {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = 1;
                                        class87.field981[2] = var48[var53];
                                        class87.field981[3] = 1;
                                        class87.field981[4] = var47[var53];
                                        var74 = 6;
                                        class87.field981[5] = var48[var53];
                                    } else if (var20[2 - var22 & 0x3] && var46[2] == var53) {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = 5;
                                        class87.field981[2] = var48[var53];
                                        class87.field981[3] = 5;
                                        class87.field981[4] = var47[var53];
                                        var74 = 6;
                                        class87.field981[5] = var48[var53];
                                    } else if (var20[1 - var22 & 0x3] && var46[1] == var53) {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = 3;
                                        class87.field981[2] = var48[var53];
                                        class87.field981[3] = 3;
                                        class87.field981[4] = var47[var53];
                                        class87.field981[5] = var48[var53];
                                        var74 = 6;
                                    } else if (var20[3 - var22 & 0x3] && var46[3] == var53) {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = 7;
                                        class87.field981[2] = var48[var53];
                                        class87.field981[3] = 7;
                                        class87.field981[4] = var47[var53];
                                        var74 = 6;
                                        class87.field981[5] = var48[var53];
                                    } else {
                                        class87.field981[0] = var51[var53];
                                        class87.field981[1] = var47[var53];
                                        var74 = 3;
                                        class87.field981[2] = var48[var53];
                                    }
                                    for (int var75 = 0; var75 < var74; var75++) {
                                        int var76 = class87.field981[var75];
                                        int var77 = var76 - var22 * 2 & 0x7;
                                        int var78 = class317.field4230[var76];
                                        int var79 = class296.field4038[var76];
                                        int var80;
                                        int var81;
                                        if (var22 == 1) {
                                            var80 = var79;
                                            var81 = 128 - var78;
                                        } else if (var22 == 2) {
                                            var80 = 128 - var78;
                                            var81 = 128 - var79;
                                        } else if (var22 == 3) {
                                            var81 = var78;
                                            var80 = 128 - var79;
                                        } else {
                                            var80 = var78;
                                            var81 = var79;
                                        }
                                        var58[var54] = var80;
                                        var59[var54] = var81;
                                        if (arg4 && class248.field3350[var21][var76]) {
                                            int var82 = (var13 << 7) + var80;
                                            int var83 = (var16 << 7) + var81;
                                            var56[var54] = arg11.method265(var82, var83) - arg7.method265(var82, var83);
                                        }
                                        if (var76 < 8 && class321.field4296[var77] >= 0) {
                                            if (var57 != null) {
                                                var57[var54] = class136.field1738[var77];
                                            }
                                            var62[var54] = class371.field5198[var77];
                                            var61[var54] = class191.field2418[var77];
                                            var60[var54] = class231.field3181[var77];
                                        } else {
                                            if (var19 && class248.field3350[var21][var76]) {
                                                var61[var54] = var64;
                                                var62[var54] = var65;
                                                var60[var54] = var63;
                                            } else if (var80 == 0 && var81 == 0) {
                                                var60[var54] = arg5[var13][var16];
                                                var61[var54] = var68.field3570;
                                                var62[var54] = var68.field3579;
                                            } else if (var80 == 0 && var81 == 128) {
                                                var60[var54] = arg5[var13][var17];
                                                var61[var54] = var69.field3570;
                                                var62[var54] = var69.field3579;
                                            } else if (var80 == 128 && var81 == 128) {
                                                var60[var54] = arg5[var15][var17];
                                                var61[var54] = var70.field3570;
                                                var62[var54] = var70.field3579;
                                            } else if (var80 == 128 && var81 == 0) {
                                                var60[var54] = arg5[var15][var16];
                                                var61[var54] = var71.field3570;
                                                var62[var54] = var71.field3579;
                                            } else {
                                                if (var80 >= 64) {
                                                    if (var81 >= 64) {
                                                        var61[var54] = var70.field3570;
                                                        var62[var54] = var70.field3579;
                                                    } else {
                                                        var61[var54] = var71.field3570;
                                                        var62[var54] = var71.field3579;
                                                    }
                                                } else if (var81 < 64) {
                                                    var61[var54] = var68.field3570;
                                                    var62[var54] = var68.field3579;
                                                } else {
                                                    var61[var54] = var69.field3570;
                                                    var62[var54] = var69.field3579;
                                                }
                                                int var84 = class34.method161(false, var80 << 7 >> 7, arg5[var15][var16], arg5[var13][var16]);
                                                int var85 = class34.method161(false, var80 << 7 >> 7, arg5[var15][var17], arg5[var13][var17]);
                                                var60[var54] = class34.method161(false, var81 << 7 >> 7, var85, var84);
                                            }
                                            if (var57 != null) {
                                                var57[var54] = var60[var54];
                                            }
                                        }
                                        var54++;
                                    }
                                    var53++;
                                }
                                if (var21 != 0 && var29.field3578) {
                                    var18 = true;
                                }
                            }
                            int var86 = arg7.method271(var13, var16);
                            int var87 = arg7.method271(var15, var16);
                            int var88 = arg7.method271(var15, var17);
                            int var89 = arg7.method271(var13, var17);
                            if (arg2 > 0) {
                                boolean var90 = true;
                                if (var24 == 0 && var21 != 0) {
                                    var90 = false;
                                }
                                if (var23 > 0 && var30 != null && !var30.field2415) {
                                    var90 = false;
                                }
                                if (var90 && var86 == var87 && var86 == var88 && var86 == var89) {
                                    class398.field5751[arg2][var13][var16] = (byte) class392.method2441(class398.field5751[arg2][var13][var16], 4);
                                }
                            }
                            int var91 = 0;
                            int var92 = 0;
                            if (arg4) {
                                var91 = class7.method36(var13, var16);
                                var92 = class114.method608(var13, var16);
                            }
                            arg7.method275(var13, var16, var58, var56, var59, var60, var57, var61, var62, var91, var92, var18);
                            class307.method1807(arg2, var13, var16);
                        }
                    }
                }
            }
        }
        int var14 = -34 % ((arg10 - 5) / 47);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lvm;IIIIZZ)Ljn;")
    public final class396 method258(class322 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        field540++;
        class225 var8 = class281.method1655((byte) -28, this.field539);
        if (var8.field3061 != null) {
            var8 = var8.method1219(4);
        }
        if (var8 == null) {
            this.method261(-87, arg0);
            this.field526 = -1;
            this.field510 = this.field519;
            return null;
        }
        if (!this.field522 && this.field526 != var8.field3051) {
            this.field529 = null;
            this.method251((byte) 16, -1);
        }
        this.method252(arg3, arg1, -24682);
        boolean var9 = arg5 & ~class169.field2133 != arg4 & this.field545;
        boolean var10 = var9 & (this.field526 != var8.field3051 || (this.field519 != this.field510 || this.field527 != null && (this.field527.field2820 || class83.field926) && this.field538 != this.field519) && class169.field2133 >= 2);
        if (arg6 && !var10) {
            this.field510 = this.field519;
            this.field526 = var8.field3051;
            return null;
        }
        if (var10) {
            class434.method2681(this.field514, this.field536, this.field518, this.field537, this.field520);
        }
        class54 var11 = class98.field1161[this.field536];
        class54 var12;
        if (this.field524) {
            var12 = class272.field3682[0];
        } else {
            var12 = this.field536 < 3 ? class98.field1161[this.field536 + 1] : null;
        }
        class396 var13 = null;
        if (this.field527 != null) {
            if (var10) {
                arg2 |= 0x20000;
            }
            var13 = var8.method1209(arg2, this.field516 == 11 ? 10 : this.field516, this.field538, arg0, (byte) 4, var11, var12, this.field516 == 11 ? this.field532 + 4 : this.field532, this.field535, this.field537, this.field527, this.field518, var11.method265(this.field518, this.field537), this.field519);
            if (var13 == null) {
                this.field520 = null;
                this.field514 = null;
                this.field531 = 0;
            } else {
                if (var10) {
                    if (this.field520 == null) {
                        this.field520 = new boolean[4];
                    }
                    this.field514 = var13.method2265(this.field514);
                    class307.method1803(this.field514, this.field536, arg3, arg1, this.field520);
                }
                this.field531 = var13.method2299();
            }
            this.field529 = null;
        } else if (this.field529 != null && (arg2 & this.field529.method2312()) == arg2 && this.field526 == var8.field3051) {
            var13 = this.field529;
        } else {
            if (this.field529 != null) {
                arg2 |= this.field529.method2312();
            }
            class56 var14 = var8.method1214(var10, var11, var11.method265(this.field518, this.field537), var12, arg2, this.field518, true, this.field516 == 11 ? 10 : this.field516, arg0, this.field516 == 11 ? this.field532 + 4 : this.field532, this.field537);
            if (var14 == null) {
                this.field529 = null;
                this.field531 = 0;
                this.field514 = null;
                this.field520 = null;
            } else {
                var13 = var14.field567;
                this.field529 = var14.field567;
                if (var10) {
                    this.field514 = var14.field569;
                    this.field520 = null;
                    class307.method1803(this.field514, this.field536, arg3, arg1, (boolean[]) null);
                }
                this.field531 = var13.method2299();
            }
        }
        this.field526 = var8.field3051;
        this.field537 = arg1;
        this.field510 = this.field519;
        this.field518 = arg3;
        return var13;
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static void method259(byte arg0) {
        if (arg0 == -61) {
            field541 = null;
            field547 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZLvm;)V")
    public final void method260(boolean arg0, class322 arg1) {
        field548++;
        this.method258(arg1, this.field537, 131072, this.field518, -1, true, true);
        if (arg0) {
            this.method251((byte) 114, -72);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILvm;)V")
    public final void method261(int arg0, class322 arg1) {
        if (this.field514 != null) {
            class434.method2681(this.field514, this.field536, this.field518, this.field537, this.field520);
            this.field520 = null;
            this.field514 = null;
        }
        field517++;
        if (arg0 >= -31) {
            this.method260(true, (class322) null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILvm;IIZZLjn;I)V")
    public final void method262(int arg0, class322 arg1, int arg2, int arg3, boolean arg4, boolean arg5, class396 arg6, int arg7) {
        field542++;
        class357[] var9 = arg6.method2311();
        if (arg4) {
            this.method261(-13, (class322) null);
        }
        class149[] var10 = arg6.method2296();
        if ((this.field546 == null || this.field546.field2184) && (var9 != null || var10 != null)) {
            class225 var11 = class281.method1655((byte) -28, this.field539);
            if (var11.field3061 != null) {
                var11 = var11.method1219(-115);
            }
            if (var11 != null) {
                this.field546 = new class174(class234.field3224);
            }
        }
        if (this.field546 == null) {
            return;
        }
        if (arg5) {
            this.field546.method914(arg1, (long) class234.field3224, var9, var10, false);
        } else {
            this.field546.method910((long) class234.field3224);
        }
        this.field546.method918(this.field543, arg2, arg7, arg3, arg0);
    }

    @OriginalMember(owner = "client!ie", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field512++;
        if (this.field546 != null) {
            this.field546.method920();
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)I")
    public final int method263(int arg0) {
        if (arg0 == 2) {
            field528++;
            return this.field531;
        } else {
            return -99;
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V")
    public static final void method264(byte arg0) {
        field544++;
        int var1 = class140.field1796.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class140.field1796[var2] != null) {
                int var4 = -1;
                for (int var5 = 0; var5 < class188.field2366; var5++) {
                    if (class278.field3764[var5] == class138.field1777[var2]) {
                        var4 = var5;
                        break;
                    }
                }
                if (var4 == -1) {
                    class278.field3764[class188.field2366] = class138.field1777[var2];
                    var4 = class188.field2366++;
                }
                class250 var6 = new class250(class140.field1796[var2]);
                int var7 = 0;
                while (var6.field3389 < class140.field1796[var2].length && var7 < 511 && class244.field3320 < 1023) {
                    int var8 = var4 | var7++ << 6;
                    int var9 = var6.method1374(-2);
                    int var10 = var9 >> 14;
                    int var11 = (var9 & 0x1FFB) >> 7;
                    int var12 = var9 & 0x3F;
                    int var13 = (class138.field1777[var2] >> 8) * 64 + var11 - class70.field767;
                    int var14 = (class138.field1777[var2] & 0xFF) * 64 + var12 - class291.field3961;
                    class345 var15 = class6.method30((byte) -63, var6.method1374(-2));
                    if (class38.field397[var8] == null && (var15.field4689 & 0x1) > 0 && class351.field4891 == var10 && var13 >= 0 && class315.field4214 > var13 + var15.field4624 && var14 >= 0 && class340.field4549 > var15.field4624 + var14) {
                        class38.field397[var8] = new class91();
                        class38.field397[var8].field6095 = var8;
                        class91 var16 = class38.field397[var8];
                        class308.field4175[class244.field3320++] = var8;
                        var16.field6071 = class234.field3224;
                        var16.method503(var15, -31893);
                        var16.method2610((byte) 86, var16.field1035.field4624);
                        var16.field6070 = var16.field1035.field4642 << 3;
                        if (var16.field6070 == 0) {
                            var16.method2600(0, 0);
                        } else {
                            var16.method2600(0, class327.field4341[var16.field1035.field4676 - 1]);
                        }
                        var16.method2601(var13, var10, 0, true, var16.method857((byte) -106), var14);
                    }
                }
            }
        }
        int var3 = -112 % ((-arg0 - 47) / 36);
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "(Lvm;Lds;IIIIIIZI)V")
    public class53(class322 arg0, class225 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field516 = arg2;
        this.field539 = arg1.field3051;
        this.field537 = arg7;
        this.field532 = arg3;
        this.field524 = arg8;
        this.field536 = (byte) arg5;
        this.field518 = arg6;
        this.field543 = (byte) arg4;
        this.field545 = arg0.method1585() && arg1.field3056 && !this.field524;
        if (arg9 != -1) {
            this.field522 = true;
        }
        this.method251((byte) 16, arg9);
    }
}
