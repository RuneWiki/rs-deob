import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class32 extends class2 {

    @OriginalMember(owner = "client!da", name = "X", descriptor = "Z")
    private boolean field641 = false;

    @OriginalMember(owner = "client!da", name = "nb", descriptor = "I")
    private int field657 = 0;

    @OriginalMember(owner = "client!da", name = "kb", descriptor = "I")
    private int field654 = 0;

    @OriginalMember(owner = "client!da", name = "ib", descriptor = "I")
    private int field652 = -32768;

    @OriginalMember(owner = "client!da", name = "Z", descriptor = "I")
    private int field643;

    @OriginalMember(owner = "client!da", name = "Ab", descriptor = "I")
    private int field670;

    @OriginalMember(owner = "client!da", name = "pb", descriptor = "I")
    private int field659;

    @OriginalMember(owner = "client!da", name = "ab", descriptor = "I")
    private int field644;

    @OriginalMember(owner = "client!da", name = "fb", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!da", name = "S", descriptor = "I")
    public int field636;

    @OriginalMember(owner = "client!da", name = "Q", descriptor = "I")
    public int field634;

    @OriginalMember(owner = "client!da", name = "wb", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!da", name = "rb", descriptor = "I")
    private int field661;

    @OriginalMember(owner = "client!da", name = "W", descriptor = "I")
    private int field640;

    @OriginalMember(owner = "client!da", name = "mb", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!da", name = "jb", descriptor = "Lce;")
    private class26 field653;

    @OriginalMember(owner = "client!da", name = "T", descriptor = "Lob;")
    public static class141 field637 = class175.method1195(40, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!da", name = "qb", descriptor = "Lob;")
    public static class141 field660 = class175.method1195(40, "mem=");

    @OriginalMember(owner = "client!da", name = "eb", descriptor = "I")
    public static int field648 = 0;

    @OriginalMember(owner = "client!da", name = "yb", descriptor = "Lob;")
    public static class141 field668 = class175.method1195(40, ")4l");

    @OriginalMember(owner = "client!da", name = "zb", descriptor = "Lob;")
    public static class141 field669 = class175.method1195(40, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!da", name = "Bb", descriptor = "I")
    public static int field671 = 0;

    @OriginalMember(owner = "client!da", name = "O", descriptor = "D")
    private double field632;

    @OriginalMember(owner = "client!da", name = "R", descriptor = "D")
    public double field635;

    @OriginalMember(owner = "client!da", name = "V", descriptor = "D")
    public double field639;

    @OriginalMember(owner = "client!da", name = "Y", descriptor = "D")
    public double field642;

    @OriginalMember(owner = "client!da", name = "db", descriptor = "D")
    private double field647;

    @OriginalMember(owner = "client!da", name = "gb", descriptor = "D")
    private double field650;

    @OriginalMember(owner = "client!da", name = "hb", descriptor = "D")
    private double field651;

    @OriginalMember(owner = "client!da", name = "tb", descriptor = "D")
    private double field663;

    @OriginalMember(owner = "client!da", name = "P", descriptor = "I")
    public static int field633;

    @OriginalMember(owner = "client!da", name = "U", descriptor = "I")
    public static int field638;

    @OriginalMember(owner = "client!da", name = "bb", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!da", name = "cb", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!da", name = "lb", descriptor = "I")
    private int field655;

    @OriginalMember(owner = "client!da", name = "ob", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!da", name = "sb", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!da", name = "ub", descriptor = "I")
    public static int field664;

    @OriginalMember(owner = "client!da", name = "vb", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!da", name = "xb", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIII)V")
    public final void method232(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!this.field641) {
            double var6 = (double) (arg4 - this.field640);
            double var8 = (double) (arg1 - this.field644);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field639 = (double) this.field670 * var6 / var10 + (double) this.field640;
            this.field642 = (double) this.field670 * var8 / var10 + (double) this.field644;
            this.field635 = this.field659;
        }
        int var12 = 69 / ((-arg3 - 38) / 32);
        double var13 = (double) (this.field656 + 1 - arg0);
        this.field663 = ((double) arg4 - this.field639) / var13;
        this.field650 = ((double) arg1 - this.field642) / var13;
        this.field632 = Math.sqrt(this.field663 * this.field663 + this.field650 * this.field650);
        field638++;
        if (!this.field641) {
            this.field647 = -this.field632 * Math.tan((double) this.field661 * 0.02454369D);
        }
        this.field651 = ((double) arg2 - this.field635 - this.field647 * var13) * 2.0D / (var13 * var13);
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIBIIII[Lra;I)V")
    public static final void method233(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, class170[] arg7, int arg8) {
        if (arg2 >= -9) {
            field660 = null;
        }
        field664++;
        for (int var9 = 0; var9 < arg7.length; var9++) {
            class170 var10 = arg7[var9];
            if (var10 != null && (!var10.field3305 || var10.field3392 == 0 || var10.field3361 || class26.method180(var10, 18125) != 0 || class204.field3915 == var10 || var10.field3314 == 1338) && var10.field3400 == arg4 && (!var10.field3305 || !class20.method122((byte) -45, var10))) {
                int var11 = var10.field3353 + arg3;
                int var12 = var10.field3372 + arg5;
                if (class66.field1275 == var10) {
                    class110.field2124 = var11;
                    class135.field2562 = true;
                    class156.field3017 = var12;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field3392 == 2) {
                    var13 = arg0;
                    var14 = arg6;
                    var15 = arg1;
                    var16 = arg8;
                } else if (var10.field3392 == 9) {
                    int var19 = var12 + var10.field3284;
                    int var20 = var12;
                    int var21 = var11 + var10.field3299;
                    int var22 = var11;
                    if (var11 > var21) {
                        var22 = var21;
                        var21 = var11;
                    }
                    if (var12 > var19) {
                        var20 = var19;
                        var19 = var12;
                    }
                    var19++;
                    var14 = arg6 >= var20 ? arg6 : var20;
                    var13 = var19 >= arg0 ? arg0 : var19;
                    var21++;
                    var15 = arg1 >= var22 ? arg1 : var22;
                    var16 = var21 >= arg8 ? arg8 : var21;
                } else {
                    var14 = var12 <= arg6 ? arg6 : var12;
                    var15 = arg1 < var11 ? var11 : arg1;
                    int var17 = var10.field3299 + var11;
                    var16 = var17 >= arg8 ? arg8 : var17;
                    int var18 = var10.field3284 + var12;
                    var13 = arg0 <= var18 ? arg0 : var18;
                }
                if (!var10.field3305 || var16 > var15 && var13 > var14) {
                    if (var10.field3314 == 1337) {
                        class38.method252(var10, -101);
                    } else {
                        if (var10.field3392 == 0) {
                            if (!var10.field3305 && class20.method122((byte) -122, var10) && class167.field3222 != var10) {
                                continue;
                            }
                            method233(var13, var15, (byte) -108, var11 - var10.field3346, var10.field3396, var12 - var10.field3383, var14, arg7, var16);
                            if (var10.field3337 != null) {
                                method233(var13, var15, (byte) -125, var11 - var10.field3346, var10.field3396, var12 - var10.field3383, var14, var10.field3337, var16);
                            }
                            class174 var25 = (class174) class173.field3437.method792((long) var10.field3396, 22346);
                            if (var25 != null) {
                                class96.method649((byte) -19, var12, var11, var15, var16, var14, var13, var25.field3454);
                            }
                        }
                        if (var10.field3305) {
                            boolean var26;
                            if (class146.field2794 >= var15 && var14 <= class174.field3452 && class146.field2794 < var16 && class174.field3452 < var13) {
                                var26 = true;
                            } else {
                                var26 = false;
                            }
                            boolean var27 = false;
                            boolean var28 = false;
                            if (class125.field2395 == 1 && var26) {
                                var27 = true;
                            }
                            if (class164.field3170 == 1 && class81.field1630 >= var15 && var14 <= class195.field3737 && class81.field1630 < var16 && class195.field3737 < var13) {
                                var28 = true;
                            }
                            if (var10.field3314 == 1338) {
                                if (var28) {
                                    class154.method1081(class195.field3737 - var12, var10, (byte) -120, class81.field1630 - var11);
                                }
                                continue;
                            }
                            if (var28) {
                                class216.method1408(var10, class81.field1630 - var11, -var12 + class195.field3737, -84);
                            }
                            if (class66.field1275 != null && class66.field1275 != var10 && var26 && class136.method855(-118, class26.method180(var10, 18125))) {
                                class187.field3621 = var10;
                            }
                            if (class204.field3915 == var10) {
                                class206.field3923 = var11;
                                class110.field2122 = true;
                                class162.field3135 = var12;
                            }
                            if (var10.field3361) {
                                if (var26 && class26.field507 != 0 && var10.field3360 != null) {
                                    class220 var29 = new class220();
                                    var29.field4177 = var10.field3360;
                                    var29.field4162 = class26.field507;
                                    var29.field4168 = var10;
                                    class223.field4207.method1098(0, var29);
                                }
                                if (class66.field1275 != null || class146.field2852 != null || class114.field2180) {
                                    var28 = false;
                                    var27 = false;
                                    var26 = false;
                                }
                                if (!var10.field3309 && var28) {
                                    var10.field3309 = true;
                                    if (var10.field3322 != null) {
                                        class220 var30 = new class220();
                                        var30.field4162 = class195.field3737 - var12;
                                        var30.field4161 = class81.field1630 - var11;
                                        var30.field4168 = var10;
                                        var30.field4177 = var10.field3322;
                                        class223.field4207.method1098(0, var30);
                                    }
                                }
                                if (var10.field3309 && var27 && var10.field3280 != null) {
                                    class220 var31 = new class220();
                                    var31.field4162 = class174.field3452 - var12;
                                    var31.field4161 = class146.field2794 - var11;
                                    var31.field4168 = var10;
                                    var31.field4177 = var10.field3280;
                                    class223.field4207.method1098(0, var31);
                                }
                                if (var10.field3309 && !var27) {
                                    var10.field3309 = false;
                                    if (var10.field3398 != null) {
                                        class220 var32 = new class220();
                                        var32.field4177 = var10.field3398;
                                        var32.field4162 = class174.field3452 - var12;
                                        var32.field4161 = class146.field2794 - var11;
                                        var32.field4168 = var10;
                                        class202.field3804.method1098(0, var32);
                                    }
                                }
                                if (var27 && var10.field3294 != null) {
                                    class220 var33 = new class220();
                                    var33.field4168 = var10;
                                    var33.field4161 = class146.field2794 - var11;
                                    var33.field4177 = var10.field3294;
                                    var33.field4162 = class174.field3452 - var12;
                                    class223.field4207.method1098(0, var33);
                                }
                                if (!var10.field3295 && var26) {
                                    var10.field3295 = true;
                                    if (var10.field3286 != null) {
                                        class220 var34 = new class220();
                                        var34.field4162 = class174.field3452 - var12;
                                        var34.field4168 = var10;
                                        var34.field4161 = class146.field2794 - var11;
                                        var34.field4177 = var10.field3286;
                                        class223.field4207.method1098(0, var34);
                                    }
                                }
                                if (var10.field3295 && var26 && var10.field3389 != null) {
                                    class220 var35 = new class220();
                                    var35.field4177 = var10.field3389;
                                    var35.field4161 = class146.field2794 - var11;
                                    var35.field4168 = var10;
                                    var35.field4162 = class174.field3452 - var12;
                                    class223.field4207.method1098(0, var35);
                                }
                                if (var10.field3295 && !var26) {
                                    var10.field3295 = false;
                                    if (var10.field3293 != null) {
                                        class220 var36 = new class220();
                                        var36.field4162 = class174.field3452 - var12;
                                        var36.field4161 = class146.field2794 - var11;
                                        var36.field4168 = var10;
                                        var36.field4177 = var10.field3293;
                                        class202.field3804.method1098(0, var36);
                                    }
                                }
                                if (var10.field3311 != null) {
                                    class220 var37 = new class220();
                                    var37.field4177 = var10.field3311;
                                    var37.field4168 = var10;
                                    class40.field803.method1098(0, var37);
                                }
                                if (var10.field3335 != null && field648 > var10.field3320) {
                                    if (var10.field3273 == null || field648 - var10.field3320 > 32) {
                                        class220 var42 = new class220();
                                        var42.field4168 = var10;
                                        var42.field4177 = var10.field3335;
                                        class223.field4207.method1098(0, var42);
                                    } else {
                                        label396: for (int var38 = var10.field3320; var38 < field648; var38++) {
                                            int var39 = class172.field3427[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field3273.length; var40++) {
                                                if (var10.field3273[var40] == var39) {
                                                    class220 var41 = new class220();
                                                    var41.field4177 = var10.field3335;
                                                    var41.field4168 = var10;
                                                    class223.field4207.method1098(0, var41);
                                                    break label396;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3320 = field648;
                                }
                                if (var10.field3365 != null && var10.field3289 < class185.field3608) {
                                    if (var10.field3304 == null || class185.field3608 - var10.field3289 > 32) {
                                        class220 var47 = new class220();
                                        var47.field4177 = var10.field3365;
                                        var47.field4168 = var10;
                                        class223.field4207.method1098(0, var47);
                                    } else {
                                        label372: for (int var43 = var10.field3289; var43 < class185.field3608; var43++) {
                                            int var44 = class57.field1109[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field3304.length; var45++) {
                                                if (var10.field3304[var45] == var44) {
                                                    class220 var46 = new class220();
                                                    var46.field4177 = var10.field3365;
                                                    var46.field4168 = var10;
                                                    class223.field4207.method1098(0, var46);
                                                    break label372;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3289 = class185.field3608;
                                }
                                if (var10.field3329 != null && class59.field1143 > var10.field3356) {
                                    if (var10.field3326 == null || class59.field1143 - var10.field3356 > 32) {
                                        class220 var52 = new class220();
                                        var52.field4177 = var10.field3329;
                                        var52.field4168 = var10;
                                        class223.field4207.method1098(0, var52);
                                    } else {
                                        label348: for (int var48 = var10.field3356; var48 < class59.field1143; var48++) {
                                            int var49 = class110.field2125[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field3326.length; var50++) {
                                                if (var10.field3326[var50] == var49) {
                                                    class220 var51 = new class220();
                                                    var51.field4177 = var10.field3329;
                                                    var51.field4168 = var10;
                                                    class223.field4207.method1098(0, var51);
                                                    break label348;
                                                }
                                            }
                                        }
                                    }
                                    var10.field3356 = class59.field1143;
                                }
                                if (var10.field3397 < class152.field2913 && var10.field3334 != null) {
                                    class220 var53 = new class220();
                                    var53.field4168 = var10;
                                    var53.field4177 = var10.field3334;
                                    class223.field4207.method1098(0, var53);
                                }
                                if (class1.field11 > var10.field3397 && var10.field3368 != null) {
                                    class220 var54 = new class220();
                                    var54.field4177 = var10.field3368;
                                    var54.field4168 = var10;
                                    class223.field4207.method1098(0, var54);
                                }
                                if (class106.field2037 > var10.field3397 && var10.field3308 != null) {
                                    class220 var55 = new class220();
                                    var55.field4168 = var10;
                                    var55.field4177 = var10.field3308;
                                    class223.field4207.method1098(0, var55);
                                }
                                if (var10.field3397 < class70.field1410 && var10.field3399 != null) {
                                    class220 var56 = new class220();
                                    var56.field4177 = var10.field3399;
                                    var56.field4168 = var10;
                                    class223.field4207.method1098(0, var56);
                                }
                                if (class90.field1804 > var10.field3397 && var10.field3369 != null) {
                                    class220 var57 = new class220();
                                    var57.field4168 = var10;
                                    var57.field4177 = var10.field3369;
                                    class223.field4207.method1098(0, var57);
                                }
                                var10.field3397 = class174.field3461;
                                if (var10.field3291 != null) {
                                    for (int var58 = 0; var58 < class164.field3179; var58++) {
                                        class220 var59 = new class220();
                                        var59.field4168 = var10;
                                        var59.field4155 = class4.field44[var58];
                                        var59.field4156 = class213.field4071[var58];
                                        var59.field4177 = var10.field3291;
                                        class223.field4207.method1098(0, var59);
                                    }
                                }
                            }
                        }
                        if (!var10.field3305) {
                            if (class66.field1275 != null || class146.field2852 != null || class114.field2180) {
                                return;
                            }
                            if ((var10.field3333 >= 0 || var10.field3350 != 0) && class146.field2794 >= var15 && var14 <= class174.field3452 && class146.field2794 < var16 && var13 > class174.field3452) {
                                if (var10.field3333 < 0) {
                                    class167.field3222 = var10;
                                } else {
                                    class167.field3222 = arg7[var10.field3333];
                                }
                            }
                            if (var10.field3392 == 8 && var15 <= class146.field2794 && class174.field3452 >= var14 && class146.field2794 < var16 && class174.field3452 < var13) {
                                class16.field293 = var10;
                            }
                            if (var10.field3284 < var10.field3316) {
                                class216.method1406(var10.field3316, class174.field3452, class146.field2794, -16, var10.field3299 + var11, var10.field3284, var10, var12);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method234(String arg0, int arg1) throws ClassNotFoundException {
        field646++;
        if (arg1 != 0) {
            return null;
        } else if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method10(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        class56 var11 = this.method236(-1);
        field645++;
        if (var11 != null) {
            var11.method10(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field652 = var11.method16();
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(II)V")
    public final void method235(int arg0, int arg1) {
        this.field639 += (double) arg1 * this.field663;
        this.field641 = true;
        this.field642 += (double) arg1 * this.field650;
        this.field635 += this.field651 * 0.5D * (double) arg1 * (double) arg1 + (double) arg1 * this.field647;
        field662++;
        this.field647 += (double) arg1 * this.field651;
        this.field665 = (int) (Math.atan2(this.field663, this.field650) * 325.949D) + 1024 & 0x7FF;
        this.field655 = (int) (Math.atan2(this.field647, this.field632) * 325.949D) & arg0;
        if (this.field653 == null) {
            return;
        }
        this.field654 += arg1;
        while (true) {
            do {
                do {
                    if (this.field653.field496[this.field657] >= this.field654) {
                        return;
                    }
                    this.field654 -= this.field653.field496[this.field657];
                    this.field657++;
                } while (this.field653.field499.length > this.field657);
                this.field657 -= this.field653.field494;
            } while (this.field657 >= 0 && this.field653.field499.length > this.field657);
            this.field657 = 0;
        }
    }

    @OriginalMember(owner = "client!da", name = "g", descriptor = "(I)Lfe;")
    private final class56 method236(int arg0) {
        class107 var2 = class111.method730(this.field643, arg0 ^ 0x74);
        field667++;
        class56 var3 = var2.method708(13557, this.field657);
        if (var3 == null) {
            return null;
        }
        if (arg0 != -1) {
            this.field632 = -1.1853726692542113D;
        }
        var3.method378(this.field655);
        return var3;
    }

    @OriginalMember(owner = "client!da", name = "h", descriptor = "(I)V")
    public static void method237(int arg0) {
        field637 = null;
        field668 = null;
        field669 = null;
        field660 = null;
        if (arg0 != 1) {
            method238((byte) 115);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "()I")
    public final int method16() {
        field658++;
        return this.field652;
    }

    @OriginalMember(owner = "client!da", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class32(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field643 = arg0;
        this.field641 = false;
        this.field670 = arg8;
        this.field659 = arg4;
        this.field644 = arg3;
        this.field649 = arg5;
        this.field636 = arg9;
        this.field634 = arg1;
        this.field666 = arg10;
        this.field661 = arg7;
        this.field640 = arg2;
        this.field656 = arg6;
        int var12 = class111.method730(this.field643, -97).field2049;
        if (var12 == -1) {
            this.field653 = null;
        } else {
            this.field653 = class114.method736(15619, var12);
        }
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(B)V")
    public static final void method238(byte arg0) {
        field633++;
        if (class29.field562 != null) {
            class29.field562.method1089(-2);
            class29.field562 = null;
        }
        class15.method95(121);
        class166.method1145();
        for (int var1 = 0; var1 < 4; var1++) {
            class47.field888[var1].method544((byte) 122);
        }
        System.gc();
        class153.method1053((byte) 120, 2);
        int var2 = 25 % ((62 - arg0) / 48);
        class182.field3579 = -1;
        class118.field2305 = false;
        class24.method169(2);
        class156.method1086(10, (byte) 123);
    }
}
