import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class109 extends class208 {

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Z")
    public static boolean field1834 = false;

    @OriginalMember(owner = "client!ic", name = "H", descriptor = "[I")
    public static int[] field1852 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field1851 = 0;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "I")
    public int field1835;

    @OriginalMember(owner = "client!ic", name = "r", descriptor = "I")
    public int field1836;

    @OriginalMember(owner = "client!ic", name = "t", descriptor = "I")
    public int field1838;

    @OriginalMember(owner = "client!ic", name = "u", descriptor = "I")
    public int field1839;

    @OriginalMember(owner = "client!ic", name = "v", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!ic", name = "w", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!ic", name = "x", descriptor = "I")
    public int field1842;

    @OriginalMember(owner = "client!ic", name = "A", descriptor = "I")
    public int field1845;

    @OriginalMember(owner = "client!ic", name = "B", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ic", name = "C", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!ic", name = "I", descriptor = "I")
    public int field1853;

    @OriginalMember(owner = "client!ic", name = "J", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!ic", name = "K", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!ic", name = "L", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public int field1857;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!ic", name = "z", descriptor = "Lag;")
    public class106 field1844;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "Lig;")
    public class167 field1859;

    @OriginalMember(owner = "client!ic", name = "y", descriptor = "Lmi;")
    public class257 field1843;

    @OriginalMember(owner = "client!ic", name = "s", descriptor = "Lqb;")
    public class94 field1837;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V", line = 30)
    public static final void method838(int arg0) {
        field1833++;
        class256.method1795(0, 0, -536);
        int var1 = -57 % ((22 - arg0) / 62);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V", line = 43)
    public final void method839(byte arg0) {
        this.field1844 = null;
        if (arg0 <= 53) {
            method842(114);
        }
        this.field1859 = null;
        this.field1843 = null;
        field1847++;
        this.field1837 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBILtl;I)V", line = 60)
    public static final void method840(int arg0, byte arg1, int arg2, class197 arg3, int arg4) {
        class118.method885(true);
        field1848++;
        if (arg1 != -116) {
            field1850 = 58;
        }
        if (class281.field4827) {
            class126.method938(arg4, arg2, arg4 + arg3.field3294, arg3.field3253 + arg2);
        } else {
            class175.method1258(arg4, arg2, arg3.field3294 + arg4, arg3.field3253 + arg2);
        }
        if (class282.field4861 != 2 && class282.field4861 != 5 && class304.field5201 != null) {
            int var5 = class276.field4742.field5130 / 32 + 48;
            int var6 = 464 - (class276.field4742.field5173 / 32);
            int var7 = class76.field1253 + class206.field3541 & 0x7FF;
            if (class281.field4827) {
                ((class98) class304.field5201).method769(arg4, arg2, arg3.field3294, arg3.field3253, var5, var6, var7, class304.field5198 + 256, (class98) arg3.method1409((byte) -117, false));
            } else {
                ((class83) class304.field5201).method396(arg4, arg2, arg3.field3294, arg3.field3253, var5, var6, var7, class304.field5198 + 256, arg3.field3297, arg3.field3263);
            }
            if (class160.field2696 != null) {
                for (int var8 = 0; var8 < class160.field2696.field846; var8++) {
                    if (class160.field2696.method338(var8, (byte) -20)) {
                        int var9 = (class160.field2696.field837[var8] - class197.field3355) * 4 + 2 - class276.field4742.field5130 / 32;
                        int var10 = (class160.field2696.field855[var8] - class268.field4615) * 4 + 2 - (class276.field4742.field5173 / 32);
                        int var11 = class283.field4877[var7];
                        int var12 = class283.field4870[var7];
                        int var13 = var12 * 256 / (class304.field5198 + 256);
                        int var14 = var11 * 256 / (class304.field5198 + 256);
                        int var15 = var9 * var13 + var10 * var14 >> 16;
                        int var16 = var10 * var13 - (var9 * var14) >> 16;
                        class71 var17 = class6.field82;
                        if (class160.field2696.method335(arg1 + 119, var8) == 1) {
                            var17 = class102.field1719;
                        }
                        if (class160.field2696.method335(3, var8) == 2) {
                            var17 = class277.field4761;
                        }
                        int var18 = var17.method495(class160.field2696.field854[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (var19 >= -arg3.field3294 && var19 <= arg3.field3294 && -arg3.field3253 <= var16 && arg3.field3253 >= var16) {
                            int var20 = 16777215;
                            if (class160.field2696.field843[var8] != -1) {
                                var20 = class160.field2696.field843[var8];
                            }
                            if (class281.field4827) {
                                class126.method928((class98) arg3.method1409((byte) -117, false));
                            } else {
                                class175.method1238(arg3.field3297, arg3.field3263);
                            }
                            var17.method507(class160.field2696.field854[var8], arg3.field3294 / 2 + arg4 + var19, arg3.field3253 / 2 + arg2 + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class281.field4827) {
                                class126.method935();
                            } else {
                                class175.method1256();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class191.field3051; var21++) {
                int var22 = class177.field2898[var21] * 4 + 2 - (class276.field4742.field5130 / 32);
                int var23 = class111.field1870[var21] * 4 + 2 - (class276.field4742.field5173 / 32);
                class145 var24 = class289.method2046(arg1 - 12337, class201.field3488[var21]);
                if (var24.field2454 != null) {
                    var24 = var24.method1089(-82);
                    if (var24 == null || var24.field2464 == -1) {
                        continue;
                    }
                }
                class79.method547(arg3, var22, var23, arg2, -1, arg4, class60.field928[var24.field2464]);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class203 var27 = class16.field230[client.field4039][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class276.field4742.field5130 / 32);
                        int var29 = var26 * 4 + 2 - (class276.field4742.field5173 / 32);
                        class79.method547(arg3, var28, var29, arg2, -1, arg4, class43.field671[0]);
                    }
                }
            }
            for (int var30 = 0; var30 < class282.field4858; var30++) {
                class186 var31 = class82.field1334[class84.field1356[var30]];
                if (var31 != null && var31.method1302(arg1 ^ 0xFFFFFF8D)) {
                    class236 var32 = var31.field2996;
                    if (var32 != null && var32.field3893 != null) {
                        var32 = var32.method1628(119);
                    }
                    if (var32 != null && var32.field3889 && var32.field3888) {
                        int var33 = var31.field5130 / 32 - class276.field4742.field5130 / 32;
                        int var34 = var31.field5173 / 32 - (class276.field4742.field5173 / 32);
                        class79.method547(arg3, var33, var34, arg2, -1, arg4, class43.field671[1]);
                    }
                }
            }
            for (int var35 = 0; var35 < class309.field5269; var35++) {
                class242 var36 = class151.field2555[class259.field4398[var35]];
                if (var36 != null && var36.method1302(1)) {
                    int var37 = var36.field5130 / 32 - (class276.field4742.field5130 / 32);
                    int var38 = var36.field5173 / 32 - (class276.field4742.field5173 / 32);
                    boolean var39 = false;
                    long var40 = var36.field4068.method1764((byte) 43);
                    for (int var42 = 0; var42 < class33.field529; var42++) {
                        if (class209.field3570[var42] == var40 && class93.field1595[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class255.field4358; var44++) {
                        if (class153.field2594[var44].field3568 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class276.field4742.field4079 != 0 && var36.field4079 != 0 && class276.field4742.field4079 == var36.field4079) {
                        var45 = true;
                    }
                    if (var39) {
                        class79.method547(arg3, var37, var38, arg2, -1, arg4, class43.field671[3]);
                    } else if (var43) {
                        class79.method547(arg3, var37, var38, arg2, arg1 ^ 0x73, arg4, class43.field671[5]);
                    } else if (var45) {
                        class79.method547(arg3, var37, var38, arg2, arg1 + 115, arg4, class43.field671[4]);
                    } else {
                        class79.method547(arg3, var37, var38, arg2, -1, arg4, class43.field671[2]);
                    }
                }
            }
            class190[] var46 = class108.field1824;
            for (int var47 = 0; var47 < var46.length; var47++) {
                class190 var48 = var46[var47];
                if (var48 != null && var48.field3034 != 0 && (class277.field4768 % 20) < 10) {
                    if (var48.field3034 == 1 && var48.field3040 >= 0 && class82.field1334.length > var48.field3040) {
                        class186 var49 = class82.field1334[var48.field3040];
                        if (var49 != null) {
                            int var50 = var49.field5130 / 32 - (class276.field4742.field5130 / 32);
                            int var51 = var49.field5173 / 32 - (class276.field4742.field5173 / 32);
                            class44.method269(arg1 ^ 0xFFFFFFED, var50, arg4, var48.field3039, arg3, var51, arg2);
                        }
                    }
                    if (var48.field3034 == 2) {
                        int var52 = (var48.field3046 - class197.field3355) * 4 + 2 - (class276.field4742.field5130 / 32);
                        int var53 = (var48.field3045 - class268.field4615) * 4 + 2 - class276.field4742.field5173 / 32;
                        class44.method269(66, var52, arg4, var48.field3039, arg3, var53, arg2);
                    }
                    if (var48.field3034 == 10 && var48.field3040 >= 0 && class151.field2555.length > var48.field3040) {
                        class242 var54 = class151.field2555[var48.field3040];
                        if (var54 != null) {
                            int var55 = var54.field5130 / 32 - (class276.field4742.field5130 / 32);
                            int var56 = var54.field5173 / 32 - class276.field4742.field5173 / 32;
                            class44.method269(37, var55, arg4, var48.field3039, arg3, var56, arg2);
                        }
                    }
                }
            }
            if (class113.field1918 != 0) {
                int var57 = class113.field1918 * 4 + 2 - (class276.field4742.field5130 / 32);
                int var58 = class15.field225 * 4 - ((class276.field4742.field5173 / 32) - 2);
                class79.method547(arg3, var57, var58, arg2, arg1 ^ 0x73, arg4, class314.field5317);
            }
            if (class281.field4827) {
                class126.method936(arg3.field3294 / 2 + arg4 - 1, arg2 - -(arg3.field3253 / 2) + -1, 3, 3, 16777215);
            } else {
                class175.method1249(arg3.field3294 / 2 + arg4 - 1, arg3.field3253 / 2 + -1 + arg2, 3, 3, 16777215);
            }
        } else if (class281.field4827) {
            class269 var59 = arg3.method1409((byte) -117, false);
            if (var59 != null) {
                var59.method291(arg4, arg2);
            }
        } else {
            class175.method1248(arg4, arg2, 0, arg3.field3297, arg3.field3263);
        }
        class236.field3931[arg0] = true;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZII)Z", line = 408)
    public static final boolean method841(boolean arg0, int arg1, int arg2) {
        field1830++;
        if (!arg0) {
            method840(-59, (byte) 83, 65, (class197) null, 107);
        }
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(I)V", line = 420)
    public static void method842(int arg0) {
        field1852 = null;
        if (arg0 != 4) {
            field1851 = 94;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILrg;)V", line = 439)
    public static final void method843(int arg0, class88 arg1) {
        class132.field2181 = arg1;
        field1832++;
        if (arg0 != 2) {
            method842(-15);
        }
    }
}
