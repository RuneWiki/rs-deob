import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public class class705 {

    @OriginalMember(owner = "client!lt", name = "c", descriptor = "Lbq;")
    public class307 field9917 = null;

    @OriginalMember(owner = "client!lt", name = "h", descriptor = "Lda;")
    public class67 field9922 = null;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "Z")
    public static boolean field9915 = false;

    @OriginalMember(owner = "client!lt", name = "b", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!lt", name = "d", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!lt", name = "e", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!lt", name = "f", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!lt", name = "g", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V")
    public static final void method4008(Throwable arg0, String arg1, int arg2) {
        field9918++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class764.method4238((byte) -69, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class103.method852(60, var3);
            String var4 = class12.method185(":", "%3a", (byte) -127, var3);
            String var5 = class12.method185("@", "%40", (byte) -122, var4);
            String var6 = class12.method185("&", "%26", (byte) -121, var5);
            String var7 = class12.method185("#", "%23", (byte) -120, var6);
            if (class239.field2816 != null) {
                class561 var8 = class752.field10434.method3786((byte) -67, new URL(class239.field2816.getCodeBase(), "clienterror.ws?c=" + class494.field6874 + "&u=" + (class588.field8007 == null ? String.valueOf(class268.field3171) : class588.field8007) + "&v1=" + class675.field9270 + "&v2=" + class675.field9267 + "&e=" + var7));
                while (var8.field7769 == 0) {
                    class594.method3405(1L, 16711680);
                }
                if (arg2 > -122) {
                    method4009(null, true, -104, -76, null, null, 86, null, -110, -71, -19, -93, (byte) -26, null, null, -94, true, -125);
                }
                if (var8.field7769 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field7768;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!lt", name = "a", descriptor = "([IZII[I[II[[[BIIIIB[I[IIZI)V")
    public static final void method4009(int[] arg0, boolean arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, byte[][][] arg7, int arg8, int arg9, int arg10, int arg11, byte arg12, int[] arg13, int[] arg14, int arg15, boolean arg16, int arg17) {
        field9920++;
        if (class727.field10184 == -1) {
            return;
        }
        int[] var18 = class434.field5738.method569();
        int var19 = var18[0];
        int var20 = var18[1];
        int var21 = var18[2];
        int var22 = var18[3];
        int var23 = -111 % ((arg15 - 13) / 42);
        int var24 = var21;
        int var25 = var22;
        if (class727.field10184 == 1) {
            var24 = (int) ((double) class176.field2182 * (double) var21 / (double) class734.field10263);
            var25 = (int) ((double) class176.field2182 * (double) var22 / (double) class734.field10263);
        }
        if (!class257.field3034) {
            if (class727.field10184 == 1) {
                class580.method3341(1);
            }
            int var26 = arg17 - class289.field3492;
            int var27 = arg2 - class570.field7824;
            int var28 = arg8 - class231.field2761;
            int var29 = (int) (((double) var28 * class6.field72 + (double) var26 * class588.field8008 + (double) var27 * class613.field8245) * (double) var24 / (double) arg10);
            int var30 = (int) (((double) var28 * class571.field7828 + (double) var26 * class690.field9393 + (double) var27 * class17.field323) * (double) var25 / (double) arg10);
            double var31 = (double) var28 * class408.field5353 + (double) var26 * class459.field6469 + (double) var27 * class171.field2047;
            int var33 = var29 + class136.field1707 - class347.field4343;
            int var34 = class369.field4587 + var30 - class718.field10091;
            int var35 = class632.field8632 + var33;
            int var36 = class176.field2182 + var34;
            if (!(var33 < 0 || var34 < 0 || class608.field8178 < var35 || var36 > class734.field10263) || class727.field10184 == 2) {
                if (class727.field10184 == 2) {
                    class520.field7345 = -var31;
                }
                class168.field2025 = var33;
                class533.field7512 = var34;
            } else if (var35 > 0 && var36 > 0 && class608.field8178 > var33 && class734.field10263 > var34) {
                int var37 = var33 - class136.field1707;
                int var38 = var34 - class369.field4587;
                int var39 = 0;
                int var40 = 0;
                int var41 = 0;
                int var42 = 0;
                double var43 = 0.0D;
                if (class727.field10184 == 0) {
                    var40 = var38;
                    var43 = class520.field7345 + var31;
                    var39 = var37;
                } else if (class727.field10184 == 1) {
                    var42 = var38 / class372.field4683;
                    var41 = var37 / class603.field8149;
                    var39 = class603.field8149 * var41;
                    var40 = class372.field4683 * var42;
                    var43 = (class520.field7345 + var31) * (double) (var37 * var39 + var38 * var40) / (double) (var37 * var37 + var38 * var38);
                }
                double var45 = -var43;
                int var47 = 0;
                int var48 = 0;
                int var49 = 0;
                int var50 = 0;
                int var51 = 0;
                int var52 = 0;
                int var53;
                int var54;
                int var55;
                int var56;
                if (var39 >= 0) {
                    var53 = class608.field8178 - var39;
                    var54 = 0;
                    if (class727.field10184 == 1) {
                        var49 = class331.field4092 - var41;
                        var51 = var41;
                    }
                    var55 = var39;
                    var56 = var53;
                } else {
                    var53 = class608.field8178 + var39;
                    var54 = -var39;
                    var56 = 0;
                    var55 = var54;
                    if (class727.field10184 == 1) {
                        var51 = -var41;
                        var49 = 0;
                    }
                }
                int var57;
                int var58;
                int var59;
                int var60;
                int var61;
                int var62;
                if (var40 >= 0) {
                    var57 = class734.field10263 - var40;
                    var58 = 0;
                    var59 = var40;
                    var60 = 0;
                    if (class727.field10184 == 1) {
                        var50 = 0;
                        var47 = class223.field2612 - var42;
                        var48 = var42;
                        var52 = var47;
                    }
                    var61 = var57;
                    var62 = var57;
                } else {
                    var58 = -var40;
                    var61 = 0;
                    var57 = class734.field10263 + var40;
                    var59 = var58;
                    var60 = var58;
                    var62 = var57;
                    if (class727.field10184 == 1) {
                        var47 = 0;
                        var48 = -var42;
                        var52 = class223.field2612 + var42;
                        var50 = var48;
                    }
                }
                class408 var63 = class571.field7835.field6949;
                for (class35 var64 = (class35) var63.method2447(-111); var64 != null; var64 = (class35) var63.method2439(-118)) {
                    class265[] var70 = var64.field537;
                    boolean var71 = true;
                    for (int var72 = 0; var72 < var70.length; var72++) {
                        class265 var73 = var70[var72];
                        int var74 = var73.field3136;
                        int var75 = var73.field3133;
                        int var76 = var73.field3135;
                        int var77 = var73.field3138;
                        int var78;
                        var73.field3136 = var78 = var74 - var39;
                        int var79;
                        var73.field3135 = var79 = var76 - var39;
                        int var80 = var73.field3134;
                        int var81;
                        var73.field3138 = var81 = var77 - var40;
                        int var82;
                        var73.field3133 = var82 = var75 - var40;
                        if (var71) {
                            int var83 = (var79 <= var78 ? var79 : var78) - var80;
                            if (var83 <= class608.field8178) {
                                int var84 = (var82 < var81 ? var82 : var81) - var80;
                                if (class734.field10263 >= var84) {
                                    int var85 = (var79 <= var78 ? var78 : var79) + var80;
                                    if (var85 >= 0) {
                                        int var86 = var80 + (var81 > var82 ? var81 : var82);
                                        if (var86 >= 0) {
                                            var71 = false;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (var71) {
                        var64.method892(50560);
                        class548.method3224(var64, false);
                    }
                }
                if (class727.field10184 == 0) {
                    class434.field5738.method67(class619.field8330);
                }
                class434.field5738.method69(-var39, -var40);
                class434.field5738.method50(var54, var58, var53, var57, var45);
                class429.method2547(124, class520.field7345 + var45);
                class729.field10224 = class520.field7345 + var45;
                if (class727.field10184 == 1) {
                    class466.field6520 = var20 - var40 - class718.field10091;
                    class194.field2306 = var24;
                    field9919 = var25;
                    class322.field4005 = var19 - class347.field4343 - var39;
                    class434.field5738.method565(class322.field4005, class466.field6520, class194.field2306, field9919);
                } else {
                    field9919 = var25;
                    class466.field6520 = var20 + class369.field4587 - class718.field10091 - var40;
                    class322.field4005 = var19 + class136.field1707 - var39 - class347.field4343;
                    class194.field2306 = var24;
                    class434.field5738.method565(class322.field4005, class466.field6520, class194.field2306, field9919);
                }
                class737.method4149(class571.field7835);
                if (var59 > 0) {
                    class434.field5738.method556(0, var61, class608.field8178, var59 + var61);
                    class434.field5738.method6();
                    class434.field5738.method13(class241.field2843);
                    class523.method3140(arg6, arg17, arg2, arg8, arg7, arg4, arg5, arg14, arg0, arg13, arg9, arg12, arg11, arg3, arg1, arg16, arg10, 1, false);
                }
                if (var55 > 0) {
                    class434.field5738.method556(var56, var60, var55 + var56, var60 - -var62);
                    class434.field5738.method6();
                    class434.field5738.method13(class241.field2843);
                    class523.method3140(arg6, arg17, arg2, arg8, arg7, arg4, arg5, arg14, arg0, arg13, arg9, arg12, arg11, arg3, arg1, arg16, arg10, 1, false);
                }
                class434.field5738.method634();
                class390.method2285();
                if (class727.field10184 == 0) {
                    class434.field5738.method20();
                }
                class347.field4343 += var39;
                class718.field10091 += var40;
                class520.field7345 += var45;
                class533.field7512 = class369.field4587 + var30 - class718.field10091;
                class168.field2025 = class136.field1707 + var29 - class347.field4343;
                if (class727.field10184 == 1) {
                    class105.field1339 += var41;
                    class645.field8791 += var42;
                    for (int var65 = 0; var65 < class223.field2612; var65++) {
                        int var66 = class764.method4235(class645.field8791 + var65, -27, class223.field2612) * class331.field4092;
                        for (int var67 = 0; var67 < class331.field4092; var67++) {
                            int var68 = class764.method4235(class105.field1339 + var67, -83, class331.field4092) + var66;
                            boolean var69 = var47 <= var65 && var65 < (var47 + var48) || var65 >= var50 && var65 < (var50 + var52) && var67 >= var49 && var67 < var49 + var51;
                            class340.field4250[var68].method2949(class603.field8149 * var67, class372.field4683 * var65, class603.field8149, class372.field4683, 0, 0, var69, true);
                        }
                    }
                }
            } else {
                class257.field3034 = true;
            }
        }
        if (class257.field3034) {
            class718.field10091 = 0;
            class533.field7512 = class369.field4587;
            class289.field3492 = arg17;
            class347.field4343 = 0;
            class570.field7824 = arg2;
            class168.field2025 = class136.field1707;
            class231.field2761 = arg8;
            class520.field7345 = 0.0D;
            if (class727.field10184 == 0) {
                class434.field5738.method67(class619.field8330);
            }
            class434.field5738.method634();
            class434.field5738.method6();
            class434.field5738.method13(class241.field2843);
            class415.field5434.method133(class289.field3492, class570.field7824, class231.field2761, class328.field4056, class769.field10561, class60.field800);
            class434.field5738.method628(class415.field5434);
            if (class727.field10184 == 1) {
                class322.field4005 = var19;
                class466.field6520 = var20;
                class194.field2306 = var24;
                field9919 = var25;
                class434.field5738.method565(class322.field4005, class466.field6520, class194.field2306, field9919);
            } else {
                class194.field2306 = var24;
                field9919 = var25;
                class466.field6520 = class369.field4587 + var20;
                class322.field4005 = class136.field1707 + var19;
                class434.field5738.method565(class322.field4005, class466.field6520, class194.field2306, field9919);
            }
            class729.field10224 = 0.0D;
            class571.field7835.method2935(-113);
            class737.method4149(class571.field7835);
            class523.method3140(arg6, arg17, arg2, arg8, arg7, arg4, arg5, arg14, arg0, arg13, arg9, arg12, arg11, arg3, arg1, arg16, arg10, 1, false);
            class390.method2285();
            class257.field3034 = false;
            if (class727.field10184 == 0) {
                class434.field5738.method20();
            }
            if (class727.field10184 == 1) {
                class216.method1348(17706);
            }
        }
        if (class727.field10184 == 0) {
            class619.field8330.method2948(class168.field2025, class533.field7512, class632.field8632, class176.field2182, 0, 0, true, true);
        }
        class222.field2581++;
        class429.method2547(123, class520.field7345);
        class635.field8664 = class520.field7345;
        if (class727.field10184 == 0 || class727.field10184 == 2) {
            if (class727.field10184 == 2) {
                class434.field5738.method13(class241.field2843);
                class434.field5738.method6();
            }
            class674.field9243 = var20 + class369.field4587 - class718.field10091 - class533.field7512;
            class550.field7651 = var19 + class136.field1707 - (class347.field4343 + class168.field2025);
            class303.field3616 = var25;
            class349.field4357 = var24;
            class434.field5738.method565(class550.field7651, class674.field9243, class349.field4357, class303.field3616);
        } else if (class727.field10184 == 1) {
            class349.field4357 = var24;
            class303.field3616 = var25;
            class674.field9243 = var20 - class718.field10091;
            class550.field7651 = var19 - class347.field4343;
            class434.field5738.method565(class550.field7651, class674.field9243, class349.field4357, class303.field3616);
            class434.field5738.method556(class168.field2025, class533.field7512, class632.field8632 + class168.field2025, class533.field7512 + class176.field2182);
        }
        class523.method3140(arg6, arg17, arg2, arg8, arg7, arg4, arg5, arg14, arg0, arg13, arg9, arg12, arg11, arg3, arg1, arg16, arg10, class727.field10184 == 2 ? 0 : 2, class727.field10184 == 1);
        class434.field5738.method634();
        class434.field5738.method565(var19, var20, var21, var22);
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lda;)V")
    public class705(class67 arg0) {
        this.field9922 = arg0;
    }

    @OriginalMember(owner = "client!lt", name = "<init>", descriptor = "(Lda;Lbq;)V")
    public class705(class67 arg0, class307 arg1) {
        this.field9917 = arg1;
        this.field9922 = arg0;
    }
}
