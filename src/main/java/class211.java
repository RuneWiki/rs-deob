import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class211 extends class59 {

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "Lok;")
    public class142 field3294;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "[I")
    public static int[] field3287 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "I")
    public static int field3289 = 99;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "[I")
    public static int[] field3288 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "Ljava/lang/String;")
    public static String field3285 = "green:";

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Z")
    public static boolean field3283 = false;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)V")
    public static void method1459(int arg0) {
        field3287 = null;
        if (arg0 != 1) {
            method1461(59, (class122) null, -87);
        }
        field3288 = null;
        field3285 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(III)J")
    public static final long method1460(int arg0, int arg1, int arg2) {
        class113 var3 = class184.field2892[arg0][arg1][arg2];
        return var3 == null || var3.field1649 == null ? 0L : var3.field1649.field2551;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILqa;I)V")
    public static final void method1461(int arg0, class122 arg1, int arg2) {
        field3293++;
        Object[] var3 = arg1.field1755;
        int var4 = (Integer) var3[0];
        class173 var5 = class79.method537(var4, (byte) -66);
        if (var5 == null) {
            return;
        }
        class6.field84 = new String[var5.field2726];
        class230.field3552 = new int[var5.field2720];
        int var6 = arg2;
        int var7 = 0;
        for (int var8 = 1; var8 < var3.length; var8++) {
            if (var3[var8] instanceof Integer) {
                int var9 = (Integer) var3[var8];
                if (var9 == -2147483647) {
                    var9 = arg1.field1753;
                }
                if (var9 == -2147483646) {
                    var9 = arg1.field1750;
                }
                if (var9 == -2147483645) {
                    var9 = arg1.field1752 == null ? -1 : arg1.field1752.field3595;
                }
                if (var9 == -2147483644) {
                    var9 = arg1.field1743;
                }
                if (var9 == -2147483643) {
                    var9 = arg1.field1752 == null ? -1 : arg1.field1752.field3739;
                }
                if (var9 == -2147483642) {
                    var9 = arg1.field1759 == null ? -1 : arg1.field1759.field3595;
                }
                if (var9 == -2147483641) {
                    var9 = arg1.field1759 == null ? -1 : arg1.field1759.field3739;
                }
                if (var9 == -2147483640) {
                    var9 = arg1.field1744;
                }
                if (var9 == -2147483639) {
                    var9 = arg1.field1749;
                }
                class230.field3552[var6++] = var9;
            } else if (var3[var8] instanceof String) {
                String var10 = (String) var3[var8];
                if (var10.equals("event_opbase")) {
                    var10 = arg1.field1761;
                }
                class6.field84[var7++] = var10;
            }
        }
        class49.method307(var5, arg0, (byte) -12);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)V")
    public static final void method1462(int arg0, int arg1) {
        int var2 = 4 % ((arg0 + 33) / 48);
        class220.field3443.method1514(arg1, (byte) -55);
        field3284++;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)Ljava/lang/String;")
    public static final String method1463(int arg0, int arg1) {
        field3295++;
        if (arg0 > -75) {
            field3288 = null;
        }
        return class43.field521[arg1].length() > 0 ? class186.field2925[arg1] + class206.field3231 + class43.field521[arg1] : class186.field2925[arg1];
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lok;)V")
    public class211(class142 arg0) {
        this.field3294 = arg0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIILfe;)V")
    public static final void method1464(int arg0, int arg1, int arg2, int arg3, class231 arg4) {
        if (arg1 <= 39) {
            field3285 = null;
        }
        field3290++;
        class31.method163(-11565);
        class151.method1042(arg3, arg0, arg3 + arg4.field3730, arg4.field3686 + arg0);
        if (class3.field43 == 2 || class3.field43 == 5 || class162.field2487 == null) {
            class151.method1031(arg3, arg0, 0, arg4.field3637, arg4.field3687);
        } else {
            int var5 = (int) class144.field2145 + class146.field2173 & 0x7FF;
            int var6 = 464 - (class214.field3347.field3920 / 32);
            int var7 = class214.field3347.field3915 / 32 + 48;
            ((class48) class162.field2487).method284(arg3, arg0, arg4.field3730, arg4.field3686, var7, var6, var5, class60.field876 + 256, arg4.field3637, arg4.field3687);
            if (class79.field1202 != null) {
                for (int var8 = 0; var8 < class79.field1202.field1698; var8++) {
                    if (class79.field1202.field1711[var8] != null && class79.field1202.field1700[var8] >> 28 == class148.field2204) {
                        int var9 = (class79.field1202.field1700[var8] >> 14 & 0x3FFF) - class113.field1653;
                        int var10 = (class79.field1202.field1700[var8] & 0x3FFF) - class5.field77;
                        if (var9 >= 0 && var9 < 104 && var10 >= 0 && var10 < 104) {
                            int var11 = var10 * 4 + 2 - (class214.field3347.field3920 / 32);
                            int var12 = var9 * 4 + 2 - class214.field3347.field3915 / 32;
                            class3.method21(var12, var11, arg4, arg3, arg0, 0, class79.field1202.field1711[var8].field1987);
                        }
                    }
                }
            }
            for (int var13 = 0; var13 < class231.field3702; var13++) {
                int var50 = class293.field4703[var13] * 4 + 2 - (class214.field3347.field3915 / 32);
                int var51 = class299.field4765[var13] * 4 + 2 - (class214.field3347.field3920 / 32);
                class191 var52 = class128.method822(class105.field1532[var13], (byte) -71);
                if (var52.field2963 != null) {
                    var52 = var52.method1340(0);
                    if (var52 == null || var52.field2970 == -1) {
                        continue;
                    }
                }
                class3.method21(var50, var51, arg4, arg3, arg0, 0, var52.field2970);
            }
            for (int var14 = 0; var14 < 104; var14++) {
                for (int var46 = 0; var46 < 104; var46++) {
                    class220 var47 = class74.field1128[class148.field2204][var14][var46];
                    if (var47 != null) {
                        int var48 = var46 * 4 + 2 - (class214.field3347.field3920 / 32);
                        int var49 = var14 * 4 + 2 - (class214.field3347.field3915 / 32);
                        class137.method867(arg0, 62, class287.field4636[0], var48, arg4, arg3, var49);
                    }
                }
            }
            for (int var15 = 0; var15 < class80.field1211; var15++) {
                class86 var42 = class191.field3045[class187.field2939[var15]];
                if (var42 != null && var42.method1(5)) {
                    class134 var43 = var42.field1321;
                    if (var43 != null && var43.field1894 != null) {
                        var43 = var43.method855((byte) -114);
                    }
                    if (var43 != null && var43.field1933 && var43.field1906) {
                        int var44 = var42.field3920 / 32 - (class214.field3347.field3920 / 32);
                        int var45 = var42.field3915 / 32 - (class214.field3347.field3915 / 32);
                        if (var43.field1888 == -1) {
                            class137.method867(arg0, 94, class287.field4636[1], var44, arg4, arg3, var45);
                        } else {
                            class3.method21(var45, var44, arg4, arg3, arg0, 0, var43.field1888);
                        }
                    }
                }
            }
            for (int var16 = 0; var16 < class272.field4432; var16++) {
                class1 var32 = class35.field409[class52.field745[var16]];
                if (var32 != null && var32.method1(5)) {
                    int var33 = var32.field3915 / 32 - (class214.field3347.field3915 / 32);
                    int var34 = var32.field3920 / 32 - (class214.field3347.field3920 / 32);
                    long var35 = class176.method1256((byte) 127, var32.field31);
                    boolean var37 = false;
                    for (int var38 = 0; var38 < class76.field1142; var38++) {
                        if (class218.field3419[var38] == var35 && class127.field1821[var38] != 0) {
                            var37 = true;
                            break;
                        }
                    }
                    boolean var39 = false;
                    for (int var40 = 0; var40 < class220.field3456; var40++) {
                        if (class215.field3360[var40].field4018 == var35) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var41 = false;
                    if (class214.field3347.field38 != 0 && var32.field38 != 0 && class214.field3347.field38 == var32.field38) {
                        var41 = true;
                    }
                    if (var37) {
                        class137.method867(arg0, 124, class287.field4636[3], var34, arg4, arg3, var33);
                    } else if (var39) {
                        class137.method867(arg0, 93, class287.field4636[5], var34, arg4, arg3, var33);
                    } else if (var41) {
                        class137.method867(arg0, 84, class287.field4636[4], var34, arg4, arg3, var33);
                    } else {
                        class137.method867(arg0, 74, class287.field4636[2], var34, arg4, arg3, var33);
                    }
                }
            }
            class306[] var17 = class130.field1865;
            for (int var18 = 0; var18 < var17.length; var18++) {
                class306 var21 = var17[var18];
                if (var21 != null && var21.field4882 != 0 && (class311.field4996 % 20) < 10) {
                    if (var21.field4882 == 1 && var21.field4875 >= 0 && class191.field3045.length > var21.field4875) {
                        class86 var22 = class191.field3045[var21.field4875];
                        if (var22 != null) {
                            int var23 = var22.field3915 / 32 - class214.field3347.field3915 / 32;
                            int var24 = var22.field3920 / 32 - (class214.field3347.field3920 / 32);
                            class35.method180(var21.field4890, -24193, arg3, 360000, arg4, var24, var23, arg0);
                        }
                    }
                    if (var21.field4882 == 2) {
                        int var25 = (var21.field4891 - class113.field1653) * 4 + 2 - class214.field3347.field3915 / 32;
                        int var26 = (var21.field4888 - class5.field77) * 4 + 2 - (class214.field3347.field3920 / 32);
                        int var27 = var21.field4887 * 4;
                        int var28 = var27 * var27;
                        class35.method180(var21.field4890, -24193, arg3, var28, arg4, var26, var25, arg0);
                    }
                    if (var21.field4882 == 10 && var21.field4875 >= 0 && class35.field409.length > var21.field4875) {
                        class1 var29 = class35.field409[var21.field4875];
                        if (var29 != null) {
                            int var30 = var29.field3920 / 32 - (class214.field3347.field3920 / 32);
                            int var31 = var29.field3915 / 32 - class214.field3347.field3915 / 32;
                            class35.method180(var21.field4890, -24193, arg3, 360000, arg4, var30, var31, arg0);
                        }
                    }
                }
            }
            if (class31.field380 != 0) {
                int var19 = class31.field380 * 4 + ((class214.field3347.method8((byte) -100) - 1) * 2) + 2 - (class214.field3347.field3915 / 32);
                int var20 = class121.field1741 * 4 + (class214.field3347.method8((byte) -92) * 2) - (class214.field3347.field3920 / 32);
                class137.method867(arg0, 104, class307.field4955, var20, arg4, arg3, var19);
            }
            class151.method1026(arg4.field3730 / 2 + arg3 - 1, arg0 - (-(arg4.field3686 / 2) - -1), 3, 3, 16777215);
        }
        class195.field3092[arg2] = true;
    }
}
