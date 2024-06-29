import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class258 extends class320 {

    @OriginalMember(owner = "client!mm", name = "m", descriptor = "I")
    private int field3974 = -1;

    @OriginalMember(owner = "client!mm", name = "o", descriptor = "Z")
    private boolean field3976 = false;

    @OriginalMember(owner = "client!mm", name = "x", descriptor = "I")
    private int field3985 = -1;

    @OriginalMember(owner = "client!mm", name = "n", descriptor = "Lnb;")
    private class315 field3975 = null;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "I")
    private int field3994 = 0;

    @OriginalMember(owner = "client!mm", name = "A", descriptor = "Z")
    private boolean field3988 = true;

    @OriginalMember(owner = "client!mm", name = "S", descriptor = "I")
    private int field4006 = 0;

    @OriginalMember(owner = "client!mm", name = "V", descriptor = "I")
    private int field4009 = -32768;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    private int field4002 = 0;

    @OriginalMember(owner = "client!mm", name = "p", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!mm", name = "B", descriptor = "I")
    private int field3989;

    @OriginalMember(owner = "client!mm", name = "w", descriptor = "I")
    private int field3984;

    @OriginalMember(owner = "client!mm", name = "X", descriptor = "I")
    private int field4011;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    private int field4004;

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    private int field3991;

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "Ljh;")
    private class269 field3999;

    @OriginalMember(owner = "client!mm", name = "W", descriptor = "I")
    private int field4010;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "I")
    private int field4001;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    private int field3993;

    @OriginalMember(owner = "client!mm", name = "u", descriptor = "I")
    private int field3982;

    @OriginalMember(owner = "client!mm", name = "t", descriptor = "[I")
    public static int[] field3981 = new int[100];

    @OriginalMember(owner = "client!mm", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3979 = null;

    @OriginalMember(owner = "client!mm", name = "H", descriptor = "[I")
    public static int[] field3995 = new int[1000];

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "Lik;")
    public static class259 field3996 = new class259(64);

    @OriginalMember(owner = "client!mm", name = "q", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!mm", name = "s", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!mm", name = "y", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!mm", name = "z", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    public static int field3992;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!mm", name = "T", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!mm", name = "U", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!mm", name = "v", descriptor = "Lai;")
    public static class126 field3983;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "Lmf;")
    private class47 field3990;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(I[[F[[B[[B[[B[[F[[II[[F[Lc;[[BI)V", line = 11)
    public static final void method1820(int arg0, float[][] arg1, byte[][] arg2, byte[][] arg3, byte[][] arg4, float[][] arg5, int[][] arg6, int arg7, float[][] arg8, class306[] arg9, byte[][] arg10, int arg11) {
        int var12 = -30 / ((arg11 - 14) / 43);
        for (int var13 = 0; var13 < arg0; var13++) {
            class306 var14 = arg9[var13];
            if (var14.field4819 == arg7) {
                class201 var15 = new class201();
                int var16 = (var14.field4792 >> 7) - var14.field4802;
                int var17 = 0;
                if (var16 < 0) {
                    var17 -= var16;
                    var16 = 0;
                }
                int var18 = (var14.field4816 >> 7) - var14.field4802;
                int var19 = (var14.field4792 >> 7) + var14.field4802;
                if (var19 > 103) {
                    var19 = 103;
                }
                for (int var20 = var16; var20 <= var19; var20++) {
                    short var21 = var14.field4805[var17];
                    int var22 = (var21 >> 8) + var18;
                    int var23 = (var21 & 0xFF) + var22 - 1;
                    if (var22 < 0) {
                        var22 = 0;
                    }
                    if (var23 > 103) {
                        var23 = 103;
                    }
                    for (int var24 = var22; var24 <= var23; var24++) {
                        int var25 = arg4[var24][var20] & 0xFF;
                        boolean var26 = false;
                        int var27 = arg10[var24][var20] & 0xFF;
                        if (var25 == 0) {
                            if (var27 == 0) {
                                continue;
                            }
                            class323 var28 = class107.method819(var27 - 1, 16173);
                            if (var28.field5008 == -1) {
                                continue;
                            }
                            if (arg3[var24][var20] != 0) {
                                int[] var29 = class307.field4823[arg3[var24][var20]];
                                var15.field3159 += ((var29.length >> 1) - 2) * 3;
                                var15.field3171 += var29.length >> 1;
                                continue;
                            }
                        } else if (var27 != 0) {
                            class323 var30 = class107.method819(var27 - 1, 16173);
                            if (var30.field5008 == -1) {
                                byte var31 = arg3[var24][var20];
                                if (var31 != 0) {
                                    int[] var32 = class94.field1529[var31];
                                    var15.field3159 += (var32.length >> 1) * 3 - 6;
                                    var15.field3171 += var32.length >> 1;
                                }
                                continue;
                            }
                            byte var33 = arg3[var24][var20];
                            if (var33 != 0) {
                                var26 = true;
                            }
                        }
                        class45 var34 = class207.method1509(arg7, var24, var20);
                        if (var34 != null) {
                            int var35 = (int) (var34.field776 >> 14) & 0x3F;
                            if (var35 == 9) {
                                int[] var36 = null;
                                int var37 = (int) (var34.field776 >> 20) & 0x3;
                                if ((var37 & 0x1) == 0) {
                                    boolean var38 = var22 <= (var24 - 1);
                                    boolean var39 = (var24 + 1) <= var23;
                                    if (!var38 && var20 + 1 <= var19) {
                                        short var40 = var14.field4805[var17 + 1];
                                        int var41 = (var40 >> 8) + var18;
                                        int var42 = (var40 & 0xFF) + var41;
                                        var38 = var24 > var41 && var42 > var24;
                                    }
                                    if (!var39 && var20 - 1 >= var16) {
                                        short var43 = var14.field4805[var17 - 1];
                                        int var44 = (var43 >> 8) + var18;
                                        int var45 = (var43 & 0xFF) + var44;
                                        var39 = var24 > var44 && var24 < var45;
                                    }
                                    if (var38 && var39) {
                                        var36 = class307.field4823[0];
                                    } else if (var38) {
                                        var36 = class307.field4823[1];
                                    } else if (var39) {
                                        var36 = class307.field4823[1];
                                    }
                                } else {
                                    boolean var46 = var22 <= var24 - 1;
                                    if (!var46 && (var20 - 1) >= var16) {
                                        short var47 = var14.field4805[var17 - 1];
                                        int var48 = (var47 >> 8) + var18;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var24 > var48 && var49 > var24;
                                    }
                                    boolean var50 = var23 >= var24 + 1;
                                    if (!var50 && var19 >= var20 + 1) {
                                        short var51 = var14.field4805[var17 + 1];
                                        int var52 = (var51 >> 8) + var18;
                                        int var53 = var52 + (var51 & 0xFF);
                                        var50 = var52 < var24 && var53 > var24;
                                    }
                                    if (var46 && var50) {
                                        var36 = class307.field4823[0];
                                    } else if (var46) {
                                        var36 = class307.field4823[1];
                                    } else if (var50) {
                                        var36 = class307.field4823[1];
                                    }
                                }
                                if (var36 != null) {
                                    var15.field3159 += ((var36.length >> 1) - 2) * 3;
                                    var15.field3171 += var36.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var55 = class307.field4823[arg3[var24][var20]];
                            int[] var56 = class94.field1529[arg3[var24][var20]];
                            var15.field3159 += ((var55.length >> 1) - 2) * 3;
                            var15.field3159 += (var56.length >> 1) * 3 - 6;
                            var15.field3171 += var55.length >> 1;
                            var15.field3171 += var56.length >> 1;
                        } else {
                            int[] var54 = class307.field4823[0];
                            var15.field3159 += ((var54.length >> 1) - 2) * 3;
                            var15.field3171 += var54.length >> 1;
                        }
                    }
                    var17++;
                }
                var15.method1458();
                int var57 = 0;
                if ((var14.field4792 >> 7) - var14.field4802 < 0) {
                    var57 -= (var14.field4792 >> 7) - var14.field4802;
                }
                for (int var58 = var16; var58 <= var19; var58++) {
                    short var59 = var14.field4805[var57];
                    int var60 = (var59 >> 8) + var18;
                    int var61 = (var59 & 0xFF) + var60 - 1;
                    if (var60 < 0) {
                        var60 = 0;
                    }
                    if (var61 > 103) {
                        var61 = 103;
                    }
                    for (int var62 = var60; var62 <= var61; var62++) {
                        byte var63 = arg2[var62][var58];
                        int var64 = arg10[var62][var58] & 0xFF;
                        boolean var65 = false;
                        int var66 = arg4[var62][var58] & 0xFF;
                        if (var66 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class323 var67 = class107.method819(var64 - 1, 16173);
                            if (var67.field5008 == -1) {
                                continue;
                            }
                            if (arg3[var62][var58] != 0) {
                                class34.method245(arg5, 1, var15, class307.field4823[arg3[var62][var58]], arg2[var62][var58], var14, var58, arg6, arg1, var62, arg8);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class323 var68 = class107.method819(var64 - 1, 16173);
                            if (var68.field5008 == -1) {
                                class34.method245(arg5, 1, var15, class94.field1529[arg3[var62][var58]], arg2[var62][var58], var14, var58, arg6, arg1, var62, arg8);
                                continue;
                            }
                            byte var69 = arg3[var62][var58];
                            if (var69 != 0) {
                                var65 = true;
                            }
                        }
                        class45 var70 = class207.method1509(arg7, var62, var58);
                        if (var70 != null) {
                            int var71 = (int) (var70.field776 >> 14) & 0x3F;
                            if (var71 == 9) {
                                int[] var72 = null;
                                int var73 = (int) (var70.field776 >> 20) & 0x3;
                                if ((var73 & 0x1) == 0) {
                                    boolean var82 = (var62 - 1) >= var60;
                                    boolean var83 = (var62 + 1) <= var61;
                                    if (!var82 && var58 + 1 <= var19) {
                                        short var84 = var14.field4805[var57 + 1];
                                        int var85 = (var84 >> 8) + var18;
                                        int var86 = var85 + (var84 & 0xFF);
                                        var82 = var85 < var62 && var86 > var62;
                                    }
                                    if (!var83 && var16 <= (var58 - 1)) {
                                        short var87 = var14.field4805[var57 - 1];
                                        int var88 = (var87 >> 8) + var18;
                                        int var89 = (var87 & 0xFF) + var88;
                                        var83 = var88 < var62 && var89 > var62;
                                    }
                                    if (var82 && var83) {
                                        var72 = class307.field4823[0];
                                    } else if (var82) {
                                        var63 = 1;
                                        var72 = class307.field4823[1];
                                    } else if (var83) {
                                        var63 = 3;
                                        var72 = class307.field4823[1];
                                    }
                                } else {
                                    boolean var74 = var60 <= var62 - 1;
                                    boolean var75 = var61 >= var62 + 1;
                                    if (!var74 && var58 - 1 >= var16) {
                                        short var76 = var14.field4805[var57 - 1];
                                        int var77 = (var76 >> 8) + var18;
                                        int var78 = (var76 & 0xFF) + var77;
                                        var74 = var62 > var77 && var62 < var78;
                                    }
                                    if (!var75 && var19 >= (var58 + 1)) {
                                        short var79 = var14.field4805[var57 + 1];
                                        int var80 = (var79 >> 8) + var18;
                                        int var81 = var80 + (var79 & 0xFF);
                                        var75 = var62 > var80 && var81 > var62;
                                    }
                                    if (var74 && var75) {
                                        var72 = class307.field4823[0];
                                    } else if (var74) {
                                        var63 = 0;
                                        var72 = class307.field4823[1];
                                    } else if (var75) {
                                        var63 = 2;
                                        var72 = class307.field4823[1];
                                    }
                                }
                                if (var72 != null) {
                                    class34.method245(arg5, 1, var15, var72, var63, var14, var58, arg6, arg1, var62, arg8);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class34.method245(arg5, 1, var15, class94.field1529[arg3[var62][var58]], arg2[var62][var58], var14, var58, arg6, arg1, var62, arg8);
                            class34.method245(arg5, 1, var15, class307.field4823[arg3[var62][var58]], arg2[var62][var58], var14, var58, arg6, arg1, var62, arg8);
                        } else {
                            class34.method245(arg5, 1, var15, class307.field4823[0], var63, var14, var58, arg6, arg1, var62, arg8);
                        }
                    }
                    var57++;
                }
                if (var15.field3160 > 0 && var15.field3168 > 0) {
                    var15.method1459();
                    var14.field4818 = var15;
                }
            }
        }
        field3998++;
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(IIIIIIIZLdg;)V", line = 1141)
    public class258(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class320 arg8) {
        this.field3977 = arg5;
        this.field3989 = arg1;
        this.field3984 = arg3;
        this.field4011 = arg2;
        this.field4004 = arg0;
        this.field3991 = arg4;
        if (class265.field4126 && arg8 != null) {
            if ((arg8 instanceof class258)) {
                ((class258) arg8).method1821(2028636436);
            } else {
                class6 var10 = class28.method190(127, this.field4004);
                if (var10.field56 != null) {
                    var10 = var10.method19(false);
                }
                if (var10 != null) {
                    class213.method1546(this.field3984, var10, this.field3989, this.field4011, this.field3991, 0, 0, true, this.field3977);
                }
            }
        }
        if (arg6 != -1) {
            this.field3999 = class6.method28(arg6, 2);
            this.field4010 = 0;
            if (this.field3999.field4183.length > 1) {
                this.field4001 = 1;
            } else {
                this.field4001 = 0;
            }
            this.field3993 = class205.field3252 - 1;
            this.field3982 = 1;
            if (this.field3999.field4168 == 0 && arg8 != null && arg8 instanceof class258) {
                class258 var11 = (class258) arg8;
                if (this.field3999 == var11.field3999) {
                    this.field3993 = var11.field3993;
                    this.field4001 = var11.field4001;
                    this.field3982 = var11.field3982;
                    this.field4010 = var11.field4010;
                    return;
                }
            }
            if (arg7 && this.field3999.field4174 != -1) {
                this.field4010 = (int) ((double) this.field3999.field4183.length * Math.random());
                this.field4001 = this.field4010 + 1;
                if (this.field4001 >= this.field3999.field4183.length) {
                    this.field4001 -= this.field3999.field4174;
                    if (this.field4001 < 0 || this.field4001 >= this.field3999.field4183.length) {
                        this.field4001 = -1;
                    }
                }
                this.field3982 = (int) (Math.random() * (double) this.field3999.field4165[this.field4010]) + 1;
                this.field3993 = class205.field3252 - this.field3982;
            }
        }
        if (class265.field4126 && arg8 != null) {
            this.method1824((byte) -110, true);
        }
        if (arg8 == null) {
            class6 var12 = class28.method190(-109, this.field4004);
            if (var12.field56 != null) {
                this.field3976 = true;
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIIIJILmf;)V", line = 549)
    public final void method203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class47 arg10) {
        field3978++;
        class320 var13 = this.method1827((byte) -48);
        if (var13 != null) {
            var13.method203(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, this.field3990);
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(I)V", line = 570)
    public final void method1821(int arg0) {
        field4000++;
        if (this.field3975 != null) {
            class69.method519(this.field3975, this.field4002, this.field4006, this.field3994);
        }
        if (arg0 != 2028636436) {
            this.field3982 = 61;
        }
        this.field3985 = -1;
        this.field3974 = -1;
        this.field3975 = null;
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(I)V", line = 594)
    public static void method1822(int arg0) {
        field3995 = null;
        int var1 = 84 / ((34 - arg0) / 46);
        field3983 = null;
        field3979 = null;
        field3996 = null;
        field3981 = null;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(I)V", line = 608)
    public static final void method1823(int arg0) {
        if (arg0 > 6) {
            class303.field4758.method1832((byte) 74);
            field4005++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIII)V", line = 630)
    public final void method205(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4007++;
        if (class265.field4126) {
            this.method1824((byte) -108, true);
        } else {
            this.method1825((byte) 81, arg3, arg4);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BZ)Ldg;", line = 656)
    private final class320 method1824(byte arg0, boolean arg1) {
        field3987++;
        boolean var3 = class298.field4701 != class29.field475;
        class6 var4 = class28.method190(-109, this.field4004);
        int var5 = var4.field52;
        if (var4.field56 != null) {
            var4 = var4.method19(false);
        }
        if (var4 == null) {
            if (class265.field4126 && !var3) {
                this.method1821(2028636436);
            }
            return null;
        }
        if (class141.field2241 != 0 && this.field3976 && (this.field3999 == null || this.field3999 != null && this.field3999.field4184 != var4.field52)) {
            int var6 = var4.field52;
            if (var4.field52 == -1) {
                var6 = var5;
            }
            if (var6 == -1) {
                this.field3999 = null;
            } else {
                this.field3999 = class6.method28(var6, 2);
            }
            if (this.field3999 != null) {
                if (var4.field54 && this.field3999.field4174 != -1) {
                    this.field4010 = (int) (Math.random() * (double) this.field3999.field4183.length);
                    this.field3993 -= (int) (Math.random() * (double) this.field3999.field4165[this.field4010]);
                } else {
                    this.field4010 = 0;
                    this.field3993 = class205.field3252 - 1;
                }
            }
        }
        int var7 = this.field4011 & 0x3;
        int var8;
        int var9;
        if (var7 == 1 || var7 == 3) {
            var9 = var4.field63;
            var8 = var4.field90;
        } else {
            var8 = var4.field63;
            var9 = var4.field90;
        }
        int var10 = this.field3991 + (var8 >> 1);
        int var11 = this.field3991 + (var8 + 1 >> 1);
        int var12 = (var9 >> 1) + this.field3977;
        int var13 = (var9 + 1 >> 1) + this.field3977;
        this.method1825((byte) 62, var10 * 128, var12 * 128);
        boolean var14 = !var3 && var4.field51 && (this.field3974 != var4.field106 || (this.field4010 != this.field3985 || this.field3999 != null && (this.field3999.field4182 || class68.field1094) && this.field4010 != this.field4001) && class245.field3780 >= 2);
        if (arg1 && !var14) {
            return null;
        }
        int[][] var15 = class29.field475[this.field3984];
        if (arg0 > -101) {
            this.method1821(22);
        }
        int var16 = var15[var10][var12] + var15[var11][var13] + var15[var10][var13] + var15[var11][var12] >> 2;
        int var17 = (this.field3977 << 7) + (var9 << 6);
        int var18 = (this.field3991 << 7) + (var8 << 6);
        int[][] var19 = (int[][]) null;
        if (var3) {
            var19 = class298.field4701[0];
        } else if (this.field3984 < 3) {
            var19 = class29.field475[this.field3984 + 1];
        }
        if (class265.field4126 && var14) {
            class69.method519(this.field3975, this.field4002, this.field4006, this.field3994);
        }
        boolean var20 = this.field3975 == null;
        class293 var21;
        if (this.field3999 == null) {
            var21 = var4.method27(var16, false, var14, 20558, var20 ? class88.field1343 : this.field3975, this.field4011, var19, var18, var17, this.field3989, var15);
        } else {
            var21 = var4.method21(this.field4010, (byte) -116, this.field3982, var14, this.field3989, this.field4001, var19, this.field3999, var18, this.field4011, var15, var16, var17, var20 ? class88.field1343 : this.field3975);
        }
        if (var21 == null) {
            return null;
        }
        if (class265.field4126 && var14) {
            int var22 = 0;
            if (var20) {
                class88.field1343 = var21.field4615;
            }
            if (this.field3984 != 0) {
                int[][] var23 = class29.field475[0];
                var22 = var16 - (var23[var10][var12] - (-var23[var11][var12] - var23[var10][var13] - var23[var11][var13]) >> 2);
            }
            class315 var24 = var21.field4615;
            if (this.field3988 && class69.method532(var24, var18, var22, var17)) {
                this.field3988 = false;
            }
            if (!this.field3988) {
                class69.method523(var24, var18, var22, var17);
                this.field3975 = var24;
                this.field3994 = var17;
                this.field4006 = var22;
                this.field4002 = var18;
                if (var20) {
                    class88.field1343 = null;
                }
            }
            this.field3985 = this.field4010;
            this.field3974 = var4.field106;
        }
        return var21.field4619;
    }

    @OriginalMember(owner = "client!mm", name = "finalize", descriptor = "()V", line = 825)
    protected final void finalize() {
        field3997++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(BII)V", line = 833)
    private final void method1825(byte arg0, int arg1, int arg2) {
        if (this.field3999 != null) {
            int var4 = class205.field3252 - this.field3993;
            if (var4 > 100 && this.field3999.field4174 > 0) {
                int var5 = this.field3999.field4183.length - this.field3999.field4174;
                while (this.field4010 < var5 && var4 > this.field3999.field4165[this.field4010]) {
                    var4 -= this.field3999.field4165[this.field4010];
                    this.field4010++;
                }
                if (this.field4010 >= var5) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3999.field4183.length; var7++) {
                        var6 += this.field3999.field4165[var7];
                    }
                    var4 %= var6;
                }
                this.field4001 = this.field4010 + 1;
                if (this.field3999.field4183.length <= this.field4001) {
                    this.field4001 -= this.field3999.field4174;
                    if (this.field4001 < 0 || this.field3999.field4183.length <= this.field4001) {
                        this.field4001 = -1;
                    }
                }
            }
            while (var4 > this.field3999.field4165[this.field4010]) {
                class89.method632(this.field3999, arg1, (byte) 107, arg2, false, this.field4010);
                var4 -= this.field3999.field4165[this.field4010];
                this.field4010++;
                if (this.field4010 >= this.field3999.field4183.length) {
                    this.field4010 -= this.field3999.field4174;
                    if (this.field4010 < 0 || this.field3999.field4183.length <= this.field4010) {
                        this.field3999 = null;
                        break;
                    }
                }
                this.field4001 = this.field4010 + 1;
                if (this.field4001 >= this.field3999.field4183.length) {
                    this.field4001 -= this.field3999.field4174;
                    if (this.field4001 < 0 || this.field4001 >= this.field3999.field4183.length) {
                        this.field4001 = -1;
                    }
                }
            }
            this.field3993 = class205.field3252 - var4;
            this.field3982 = var4;
        }
        if (arg0 < 59) {
            method1822(-90);
        }
        field4003++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "()I", line = 918)
    public final int method207() {
        field3986++;
        return this.field4009;
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(II)V", line = 940)
    public static final void method1826(int arg0, int arg1) {
        field3992++;
        short var2 = 256;
        if (var2 < arg1) {
            arg1 = var2;
        }
        if (arg1 > 10) {
            arg1 = 10;
        }
        class94.field1538 += arg1 * 128;
        if (class94.field1538 > class309.field4867.length) {
            class94.field1538 -= class309.field4867.length;
            int var3 = (int) (Math.random() * 12.0D);
            class198.method1439(class101.field1709[var3], 0);
        }
        int var4 = 0;
        int var5 = arg1 * 128;
        int var6 = (var2 - arg1) * 128;
        for (int var7 = 0; var7 < var6; var7++) {
            int var8 = class207.field3270[var4 + var5] - (class309.field4867[class94.field1538 + var4 & class309.field4867.length - 1] * arg1 / 6);
            if (var8 < 0) {
                var8 = 0;
            }
            class207.field3270[var4++] = var8;
        }
        for (int var9 = var2 - arg1; var9 < var2; var9++) {
            int var10 = var9 * 128;
            for (int var11 = 0; var11 < 128; var11++) {
                int var12 = (int) (Math.random() * 100.0D);
                if (var12 < 50 && var11 > 10 && var11 < 118) {
                    class207.field3270[var10 + var11] = 255;
                } else {
                    class207.field3270[var10 + var11] = 0;
                }
            }
        }
        int var13 = 126 % ((arg0 + 68) / 44);
        for (int var14 = 0; var14 < var2 - arg1; var14++) {
            class213.field3401[var14] = class213.field3401[arg1 + var14];
        }
        for (int var15 = var2 - arg1; var15 < var2; var15++) {
            class213.field3401[var15] = (int) (Math.sin((double) class215.field3434 / 14.0D) * 16.0D + Math.sin((double) class215.field3434 / 15.0D) * 14.0D + Math.sin((double) class215.field3434 / 16.0D) * 12.0D);
            class215.field3434++;
        }
        class16.field317 += arg1;
        int var16 = (arg1 + (class205.field3252 & 0x1)) / 2;
        if (var16 <= 0) {
            return;
        }
        for (int var17 = 0; var17 < class16.field317; var17++) {
            int var18 = (int) (Math.random() * 124.0D) + 2;
            int var19 = (int) (Math.random() * 128.0D) + 128;
            class207.field3270[(var19 << 7) + var18] = 192;
        }
        class16.field317 = 0;
        for (int var20 = 0; var20 < var2; var20++) {
            int var21 = var20 * 128;
            int var22 = 0;
            for (int var23 = -var16; var23 < 128; var23++) {
                if ((var16 + var23) < 128) {
                    var22 += class207.field3270[var21 + var23 + var16];
                }
                if ((var23 - var16 - 1) >= 0) {
                    var22 -= class207.field3270[var21 + var23 - var16 - 1];
                }
                if (var23 >= 0) {
                    class211.field3375[var21 + var23] = var22 / (var16 * 2 + 1);
                }
            }
        }
        for (int var24 = 0; var24 < 128; var24++) {
            int var25 = 0;
            for (int var26 = -var16; var26 < var2; var26++) {
                int var27 = var26 * 128;
                if (var2 > var16 + var26) {
                    var25 += class211.field3375[var16 * 128 + var24 + var27];
                }
                if (var26 - var16 - 1 >= 0) {
                    var25 -= class211.field3375[var24 + var27 - (var16 * 128) - 128];
                }
                if (var26 >= 0) {
                    class207.field3270[var24 + var27] = var25 / (var16 * 2 + 1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)Ldg;", line = 1119)
    public final class320 method1827(byte arg0) {
        field3980++;
        return arg0 == -48 ? this.method1824((byte) -106, false) : (class320) null;
    }
}
