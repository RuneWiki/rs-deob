import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class343 {

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "Lui;")
    private class251 field4988 = new class251(64);

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Llga;")
    public class47 field4992;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Llga;")
    private class47 field4997;

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field4998 = new String[] { method2759(method2758("#@7\u0016\u001c")), method2759(method2758("#@7\u0015\u001c")), method2759(method2758("#@7\u0011\u001c")), method2759(method2758("#@7\u0013\u001c")), method2759(method2758("#@7\u0014\u001c")), method2759(method2758("*\u00027yI")), method2759(method2758("?Yu;")), method2759(method2758("#@7\u0012\u001c")), method2759(method2758("#@7k]?Emi\u001c")) };

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "[I")
    public static int[] field4987 = new int[1024];

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field4993;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field4994;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Lwfa;")
    public static class286 field4995;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Llga;")
    public static class47 field4991;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZII[II[IB[IIII[[[BIIZ[I[I)V", line = 7)
    public static final void method2752(int arg0, boolean arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, byte arg7, int[] arg8, int arg9, int arg10, int arg11, byte[][][] arg12, int arg13, int arg14, boolean arg15, int[] arg16, int[] arg17) {
        try {
            field4990++;
            if (class101.field1360 != -1) {
                int[] var18 = class349.field5060.method157();
                int var19 = var18[0];
                int var20 = var18[1];
                int var21 = var18[2];
                int var22 = var18[arg9];
                int var23 = var21;
                int var24 = var22;
                if (class101.field1360 == 1) {
                    var23 = (int) ((double) class63.field971 * (double) var21 / (double) class5.field63);
                    var24 = (int) ((double) class63.field971 * (double) var22 / (double) class5.field63);
                }
                if (!class710.field9925) {
                    if (class101.field1360 == 1) {
                        class644.method4701(arg9 - 84);
                    }
                    int var25 = arg0 - class287.field4069;
                    int var26 = arg5 - class482.field7097;
                    int var27 = arg11 - class581.field8394;
                    int var28 = (int) (((double) var27 * class285.field4013 + (double) var25 * class167.field2138 + (double) var26 * class378.field5528) * (double) var23 / (double) arg2);
                    int var29 = (int) (((double) var27 * class398.field5792 + (double) var25 * class191.field2534 + (double) var26 * class596.field8567) * (double) var24 / (double) arg2);
                    double var30 = (double) var27 * class497.field7289 + (double) var25 * class232.field3351 + (double) var26 * class531.field7697;
                    int var32 = class712.field10013 + var28 - class2.field39;
                    int var33 = class452.field6624 + var29 - class493.field7243;
                    int var34 = class608.field8720 + var32;
                    int var35 = var33 + class63.field971;
                    if (!(var32 < 0 || var33 < 0 || var34 > class576.field8332 || class5.field63 < var35) || class101.field1360 == 2) {
                        class224.field3263 = var32;
                        if (class101.field1360 == 2) {
                            class718.field10246 = -var30;
                        }
                        class615.field8779 = var33;
                    } else if (var34 > 0 && var35 > 0 && var32 < class576.field8332 && var33 < class5.field63) {
                        int var36 = var32 - class712.field10013;
                        int var37 = var33 - class452.field6624;
                        int var38 = 0;
                        int var39 = 0;
                        int var40 = 0;
                        int var41 = 0;
                        double var42 = 0.0D;
                        if (class101.field1360 == 0) {
                            var42 = class718.field10246 + var30;
                            var39 = var37;
                            var38 = var36;
                        } else if (class101.field1360 == 1) {
                            var41 = var37 / class389.field5670;
                            var40 = var36 / class567.field8258;
                            var39 = class389.field5670 * var41;
                            var38 = class567.field8258 * var40;
                            var42 = (class718.field10246 + var30) * (double) (var36 * var38 + var37 * var39) / (double) (var36 * var36 + var37 * var37);
                        }
                        double var44 = -var42;
                        int var46 = 0;
                        int var47 = 0;
                        int var48 = 0;
                        int var49 = 0;
                        int var50 = 0;
                        int var51;
                        int var52;
                        int var53;
                        int var54;
                        if (var38 < 0) {
                            var51 = 0;
                            var52 = class576.field8332 + var38;
                            var53 = -var38;
                            if (class101.field1360 == 1) {
                                var50 = -var40;
                                var48 = 0;
                            }
                            var54 = var53;
                        } else {
                            var52 = class576.field8332 - var38;
                            var53 = 0;
                            var51 = var52;
                            if (class101.field1360 == 1) {
                                var48 = class419.field6030 - var40;
                                var50 = var40;
                            }
                            var54 = var38;
                        }
                        int var55 = 0;
                        int var56;
                        int var57;
                        int var58;
                        int var59;
                        int var60;
                        int var61;
                        if (var39 < 0) {
                            var56 = class5.field63 + var39;
                            var57 = 0;
                            var58 = -var39;
                            var59 = var58;
                            if (class101.field1360 == 1) {
                                var46 = 0;
                                var47 = -var41;
                                var49 = var47;
                                var55 = class559.field8137 + var41;
                            }
                            var60 = var58;
                            var61 = var56;
                        } else {
                            var58 = 0;
                            var56 = class5.field63 - var39;
                            var59 = var39;
                            if (class101.field1360 == 1) {
                                var46 = class559.field8137 - var41;
                                var49 = 0;
                                var47 = var41;
                                var55 = var46;
                            }
                            var57 = var56;
                            var61 = var56;
                            var60 = 0;
                        }
                        class470 var62 = class626.field8937.field3178;
                        for (class297 var63 = (class297) var62.method3617(false); var63 != null; var63 = (class297) var62.method3612(3)) {
                            class535[] var64 = var63.field4153;
                            boolean var65 = true;
                            for (int var66 = 0; var66 < var64.length; var66++) {
                                class535 var67 = var64[var66];
                                int var68 = var67.field7766;
                                int var69 = var67.field7764;
                                int var70 = var67.field7767;
                                int var71 = var67.field7768;
                                int var72;
                                var67.field7768 = var72 = var71 - var39;
                                int var73;
                                var67.field7766 = var73 = var68 - var38;
                                int var74;
                                var67.field7767 = var74 = var70 - var38;
                                int var75;
                                var67.field7764 = var75 = var69 - var39;
                                int var76 = var67.field7765;
                                if (var65) {
                                    int var77 = (var73 >= var74 ? var74 : var73) - var76;
                                    if (var77 <= class576.field8332) {
                                        int var78 = (var75 < var72 ? var75 : var72) - var76;
                                        if (class5.field63 >= var78) {
                                            int var79 = var76 + (var74 <= var73 ? var73 : var74);
                                            if (var79 >= 0) {
                                                int var80 = (var72 > var75 ? var72 : var75) + var76;
                                                if (var80 >= 0) {
                                                    var65 = false;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (var65) {
                                var63.method4736(arg9 - 3);
                                class228.method1899(-201, var63);
                            }
                        }
                        if (class101.field1360 == 0) {
                            class349.field5060.method165(class785.field11337);
                        }
                        class349.field5060.method149(-var38, -var39);
                        class349.field5060.method174(var53, var58, var52, var56, var44);
                        class271.method2219(class718.field10246 + var44, arg9 + -8549);
                        class463.field6760 = class718.field10246 + var44;
                        if (class101.field1360 == 1) {
                            class581.field8397 = var20 - class493.field7243 - var39;
                            class283.field3983 = var19 - class2.field39 - var38;
                            class151.field1935 = var24;
                            class319.field4358 = var23;
                            class349.field5060.method233(class283.field3983, class581.field8397, class319.field4358, class151.field1935);
                        } else {
                            class581.field8397 = var20 + class452.field6624 - class493.field7243 - var39;
                            class151.field1935 = var24;
                            class319.field4358 = var23;
                            class283.field3983 = var19 - (class2.field39 - class712.field10013) - var38;
                            class349.field5060.method233(class283.field3983, class581.field8397, class319.field4358, class151.field1935);
                        }
                        class125.method1115(class626.field8937);
                        if (var59 > 0) {
                            class349.field5060.method208(0, var57, class576.field8332, var57 + var59);
                            class349.field5060.method225();
                            class349.field5060.method243(class762.field10877);
                            class311.method2482(arg3, arg0, arg5, arg11, arg12, arg6, arg16, arg8, arg4, arg17, arg14, arg7, arg13, arg10, arg1, arg15, arg2, 1, false);
                        }
                        if (var54 > 0) {
                            class349.field5060.method208(var51, var60, var51 + var54, var60 + var61);
                            class349.field5060.method225();
                            class349.field5060.method243(class762.field10877);
                            class311.method2482(arg3, arg0, arg5, arg11, arg12, arg6, arg16, arg8, arg4, arg17, arg14, arg7, arg13, arg10, arg1, arg15, arg2, 1, false);
                        }
                        class349.field5060.method240();
                        class443.method3446();
                        if (class101.field1360 == 0) {
                            class349.field5060.method234();
                        }
                        class493.field7243 += var39;
                        class2.field39 += var38;
                        class718.field10246 += var44;
                        class615.field8779 = class452.field6624 + var29 - class493.field7243;
                        class224.field3263 = var28 + class712.field10013 - class2.field39;
                        if (class101.field1360 == 1) {
                            class109.field1427 += var40;
                            class322.field4397 += var41;
                            for (int var81 = 0; var81 < class559.field8137; var81++) {
                                int var82 = class80.method793(true, class559.field8137, class322.field4397 + var81) * class419.field6030;
                                for (int var83 = 0; var83 < class419.field6030; var83++) {
                                    int var84 = var82 + class80.method793(true, class419.field6030, class109.field1427 + var83);
                                    boolean var85 = var46 <= var81 && var81 < (var46 + var47) || var81 >= var49 && (var49 + var55) > var81 && var83 >= var48 && var83 < var48 + var50;
                                    class637.field9013[var84].method689(class567.field8258 * var83, class389.field5670 * var81, class567.field8258, class389.field5670, 0, 0, var85, true);
                                }
                            }
                        }
                    } else {
                        class710.field9925 = true;
                    }
                }
                if (class710.field9925) {
                    class615.field8779 = class452.field6624;
                    class493.field7243 = 0;
                    class224.field3263 = class712.field10013;
                    class581.field8394 = arg11;
                    class2.field39 = 0;
                    class482.field7097 = arg5;
                    class718.field10246 = 0.0D;
                    class287.field4069 = arg0;
                    if (class101.field1360 == 0) {
                        class349.field5060.method165(class785.field11337);
                    }
                    class349.field5060.method240();
                    class349.field5060.method225();
                    class349.field5060.method243(class762.field10877);
                    class570.field8270.method722(class287.field4069, class482.field7097, class581.field8394, class591.field8499, class641.field9143, class263.field3715);
                    class349.field5060.method204(class570.field8270);
                    if (class101.field1360 == 1) {
                        class581.field8397 = var20;
                        class283.field3983 = var19;
                        class151.field1935 = var24;
                        class319.field4358 = var23;
                        class349.field5060.method233(class283.field3983, class581.field8397, class319.field4358, class151.field1935);
                    } else {
                        class283.field3983 = class712.field10013 + var19;
                        class319.field4358 = var23;
                        class151.field1935 = var24;
                        class581.field8397 = class452.field6624 + var20;
                        class349.field5060.method233(class283.field3983, class581.field8397, class319.field4358, class151.field1935);
                    }
                    class463.field6760 = 0.0D;
                    class626.field8937.method1840((byte) 77);
                    class125.method1115(class626.field8937);
                    class311.method2482(arg3, arg0, arg5, arg11, arg12, arg6, arg16, arg8, arg4, arg17, arg14, arg7, arg13, arg10, arg1, arg15, arg2, 1, false);
                    class443.method3446();
                    class710.field9925 = false;
                    if (class101.field1360 == 0) {
                        class349.field5060.method234();
                    }
                    if (class101.field1360 == 1) {
                        class374.method2960(false);
                    }
                }
                if (class101.field1360 == 0) {
                    class785.field11337.method687(class224.field3263, class615.field8779, class608.field8720, class63.field971, 0, 0, true, true);
                }
                class613.field8768++;
                class271.method2219(class718.field10246, -8546);
                class124.field1568 = class718.field10246;
                if (class101.field1360 == 0 || class101.field1360 == 2) {
                    if (class101.field1360 == 2) {
                        class349.field5060.method243(class762.field10877);
                        class349.field5060.method225();
                    }
                    class783.field11303 = class712.field10013 + var19 - class2.field39 - class224.field3263;
                    class800.field11633 = var24;
                    class340.field4951 = var23;
                    class703.field9831 = class452.field6624 + var20 - (class615.field8779 + class493.field7243);
                    class349.field5060.method233(class783.field11303, class703.field9831, class340.field4951, class800.field11633);
                } else if (class101.field1360 == 1) {
                    class340.field4951 = var23;
                    class800.field11633 = var24;
                    class703.field9831 = var20 - class493.field7243;
                    class783.field11303 = var19 - class2.field39;
                    class349.field5060.method233(class783.field11303, class703.field9831, class340.field4951, class800.field11633);
                    class349.field5060.method208(class224.field3263, class615.field8779, class608.field8720 + class224.field3263, class63.field971 + class615.field8779);
                }
                class311.method2482(arg3, arg0, arg5, arg11, arg12, arg6, arg16, arg8, arg4, arg17, arg14, arg7, arg13, arg10, arg1, arg15, arg2, class101.field1360 == 2 ? 0 : 2, class101.field1360 == 1);
                class349.field5060.method240();
                class349.field5060.method233(var19, var20, var21, var22);
            }
        } catch (RuntimeException var87) {
            throw class665.method4799(var87, field4998[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 == null ? field4998[6] : field4998[5]) + ',' + arg5 + ',' + (arg6 == null ? field4998[6] : field4998[5]) + ',' + arg7 + ',' + (arg8 == null ? field4998[6] : field4998[5]) + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + (arg12 == null ? field4998[6] : field4998[5]) + ',' + arg13 + ',' + arg14 + ',' + arg15 + ',' + (arg16 == null ? field4998[6] : field4998[5]) + ',' + (arg17 == null ? field4998[6] : field4998[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)V", line = 453)
    public final void method2753(boolean arg0) {
        try {
            class251 var2 = this.field4988;
            synchronized (this.field4988) {
                this.field4988.method2043(false);
            }
            if (!arg0) {
                this.field4997 = null;
            }
            field4996++;
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4998[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)V", line = 466)
    public static void method2754(boolean arg0) {
        try {
            field4987 = null;
            if (arg0) {
                field4991 = null;
                field4995 = null;
            }
        } catch (RuntimeException var2) {
            throw class665.method4799(var2, field4998[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V", line = 478)
    public final void method2755(byte arg0, int arg1) {
        try {
            class251 var3 = this.field4988;
            synchronized (this.field4988) {
                this.field4988.method2038(0, arg1);
            }
            if (arg0 == -65) {
                field4989++;
            }
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4998[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 498)
    public final void method2756(int arg0) {
        try {
            field4994++;
            if (arg0 <= 74) {
                method2754(true);
            }
            class251 var2 = this.field4988;
            synchronized (this.field4988) {
                this.field4988.method2047(11914);
            }
        } catch (RuntimeException var5) {
            throw class665.method4799(var5, field4998[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II)Lnia;", line = 511)
    public final class106 method2757(int arg0, int arg1) {
        try {
            field4993++;
            class251 var3 = this.field4988;
            class106 var4;
            synchronized (this.field4988) {
                var4 = (class106) this.field4988.method2053(0, (long) arg1);
            }
            if (var4 != null) {
                return var4;
            }
            class47 var5 = this.field4997;
            byte[] var6;
            synchronized (this.field4997) {
                var6 = this.field4997.method512(arg1, arg0, (byte) -119);
            }
            class106 var7 = new class106();
            var7.field1389 = this;
            if (var6 != null) {
                var7.method1007(new class711(var6), -23200);
            }
            class251 var8 = this.field4988;
            synchronized (this.field4988) {
                this.field4988.method2051((long) arg1, var7, arg0 + 90);
                return var7;
            }
        } catch (RuntimeException var13) {
            throw class665.method4799(var13, field4998[2] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lfs;ILlga;Llga;)V", line = 547)
    public class343(class796 arg0, int arg1, class47 arg2, class47 arg3) {
        try {
            this.field4992 = arg3;
            this.field4997 = arg2;
            this.field4997.method509(true, 3);
        } catch (RuntimeException var6) {
            throw class665.method4799(var6, field4998[8] + (arg0 == null ? field4998[6] : field4998[5]) + ',' + arg1 + ',' + (arg2 == null ? field4998[6] : field4998[5]) + ',' + (arg3 == null ? field4998[6] : field4998[5]) + ')');
        }
    }

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2758(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x34);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!rl", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2759(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 81;
                    break;
                case 1:
                    var10005 = 44;
                    break;
                case 2:
                    var10005 = 25;
                    break;
                case 3:
                    var10005 = 87;
                    break;
                default:
                    var10005 = 52;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
