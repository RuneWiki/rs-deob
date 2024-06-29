import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class203 extends class213 {

    @OriginalMember(owner = "client!te", name = "W", descriptor = "Z")
    public boolean field3717 = false;

    @OriginalMember(owner = "client!te", name = "ab", descriptor = "Lhe;")
    private class81 field3721;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "Z")
    public boolean field3727;

    @OriginalMember(owner = "client!te", name = "P", descriptor = "Z")
    public boolean field3710;

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "I")
    public int field3729;

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "Z")
    private boolean field3734;

    @OriginalMember(owner = "client!te", name = "M", descriptor = "Z")
    private boolean field3707;

    @OriginalMember(owner = "client!te", name = "X", descriptor = "I")
    public int field3718;

    @OriginalMember(owner = "client!te", name = "R", descriptor = "I")
    private int field3712;

    @OriginalMember(owner = "client!te", name = "Z", descriptor = "I")
    private int field3720;

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "I")
    private int field3723;

    @OriginalMember(owner = "client!te", name = "O", descriptor = "Lvd;")
    public static class222 field3709 = class212.method1357("Versteckt", 10731);

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "Lvd;")
    private static class222 field3728 = class212.method1357("purple:", 10731);

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "Lvd;")
    public static class222 field3730 = field3728;

    @OriginalMember(owner = "client!te", name = "bb", descriptor = "Lvd;")
    public static class222 field3722 = class212.method1357("nicht hergestellt werden)3", 10731);

    @OriginalMember(owner = "client!te", name = "V", descriptor = "Lvd;")
    public static class222 field3716 = field3728;

    @OriginalMember(owner = "client!te", name = "L", descriptor = "F")
    private float field3706;

    @OriginalMember(owner = "client!te", name = "Q", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!te", name = "S", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!te", name = "T", descriptor = "I")
    public static int field3714;

    @OriginalMember(owner = "client!te", name = "U", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!te", name = "Y", descriptor = "I")
    public static int field3719;

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field3724;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "I")
    public static int field3726;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
    public static int field3731;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "I")
    public static int field3733;

    @OriginalMember(owner = "client!te", name = "N", descriptor = "[I")
    private int[] field3708;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lsg;Lab;Z)Z")
    public final boolean method1293(class195 arg0, class3 arg1, boolean arg2) {
        if (!arg2) {
            field3722 = null;
        }
        field3711++;
        return this.field3721.method529(arg0, 255, arg1);
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Llc;Z)V")
    public static final void method1294(class121 arg0, boolean arg1) {
        class35.field765.method235(arg0, true);
        while (true) {
            class121 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class121[][] var7;
            class121 var65;
            do {
                class121 var64;
                do {
                    class121 var63;
                    do {
                        class121 var62;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class121) class35.field765.method244(-4835);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field2308);
                                            var3 = var2.field2289;
                                            var4 = var2.field2284;
                                            var5 = var2.field2293;
                                            var6 = var2.field2296;
                                            var7 = class204.field3800[var5];
                                            if (!var2.field2295) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class121 var8 = class204.field3800[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field2308) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class8.field139 && var3 > class18.field438) {
                                                    class121 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field2308 && (var9.field2295 || (var2.field2312 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class8.field139 && var3 < class190.field3507 - 1) {
                                                    class121 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field2308 && (var10.field2295 || (var2.field2312 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class92.field1722 && var4 > class187.field3475) {
                                                    class121 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field2308 && (var11.field2295 || (var2.field2312 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class92.field1722 && var4 < class222.field4124 - 1) {
                                                    class121 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field2308 && (var12.field2295 || (var2.field2312 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field2295 = false;
                                            if (var2.field2303 != null) {
                                                class121 var13 = var2.field2303;
                                                if (var13.field2313 == null) {
                                                    if (var13.field2288 != null && !class222.method1423(0, var3, var4)) {
                                                        class84.method549(var13.field2288, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var3, var4);
                                                    }
                                                } else if (!class222.method1423(0, var3, var4)) {
                                                    class134.method842(var13.field2313, 0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var3, var4);
                                                }
                                                class94 var14 = var13.field2306;
                                                if (var14 != null) {
                                                    var14.field1764.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var14.field1761 - class66.field1239, var14.field1758 - class23.field537, var14.field1763 - class231.field4336, var14.field1767);
                                                }
                                                for (int var15 = 0; var15 < var13.field2299; var15++) {
                                                    class23 var16 = var13.field2297[var15];
                                                    if (var16 != null) {
                                                        var16.field543.method89(var16.field544, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var16.field545 - class66.field1239, var16.field546 - class23.field537, var16.field541 - class231.field4336, var16.field536);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field2313 == null) {
                                                if (var2.field2288 != null && !class222.method1423(var6, var3, var4)) {
                                                    var17 = true;
                                                    class84.method549(var2.field2288, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var3, var4);
                                                }
                                            } else if (!class222.method1423(var6, var3, var4)) {
                                                var17 = true;
                                                if (var2.field2313.field2705 != 12345678 || class130.field2529 && var5 <= class80.field1539) {
                                                    class134.method842(var2.field2313, var6, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var3, var4);
                                                }
                                            }
                                            int var18 = 0;
                                            int var19 = 0;
                                            class94 var20 = var2.field2306;
                                            class201 var21 = var2.field2302;
                                            if (var20 != null || var21 != null) {
                                                if (class8.field139 == var3) {
                                                    var18++;
                                                } else if (class8.field139 < var3) {
                                                    var18 += 2;
                                                }
                                                if (class92.field1722 == var4) {
                                                    var18 += 3;
                                                } else if (class92.field1722 > var4) {
                                                    var18 += 6;
                                                }
                                                var19 = client.field693[var18];
                                                var2.field2307 = class124.field2374[var18];
                                            }
                                            if (var20 != null) {
                                                if ((var20.field1762 & class234.field4370[var18]) == 0) {
                                                    var2.field2286 = 0;
                                                } else if (var20.field1762 == 16) {
                                                    var2.field2286 = 3;
                                                    var2.field2298 = class16.field417[var18];
                                                    var2.field2291 = 3 - var2.field2298;
                                                } else if (var20.field1762 == 32) {
                                                    var2.field2286 = 6;
                                                    var2.field2298 = class143.field2769[var18];
                                                    var2.field2291 = 6 - var2.field2298;
                                                } else if (var20.field1762 == 64) {
                                                    var2.field2286 = 12;
                                                    var2.field2298 = class235.field4395[var18];
                                                    var2.field2291 = 12 - var2.field2298;
                                                } else {
                                                    var2.field2286 = 9;
                                                    var2.field2298 = class166.field3169[var18];
                                                    var2.field2291 = 9 - var2.field2298;
                                                }
                                                if ((var20.field1762 & var19) != 0 && !class18.method150(var6, var3, var4, var20.field1762)) {
                                                    var20.field1764.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var20.field1761 - class66.field1239, var20.field1758 - class23.field537, var20.field1763 - class231.field4336, var20.field1767);
                                                }
                                                if ((var20.field1760 & var19) != 0 && !class18.method150(var6, var3, var4, var20.field1760)) {
                                                    var20.field1771.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var20.field1761 - class66.field1239, var20.field1758 - class23.field537, var20.field1763 - class231.field4336, var20.field1767);
                                                }
                                            }
                                            if (var21 != null && !class179.method1125(var6, var3, var4, var21.field3682.method87())) {
                                                if ((var21.field3681 & var19) != 0) {
                                                    var21.field3682.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var21.field3686 + var21.field3673 - class66.field1239, var21.field3675 - class23.field537, var21.field3667 + var21.field3666 - class231.field4336, var21.field3670);
                                                } else if (var21.field3681 == 256) {
                                                    int var22 = var21.field3686 - class66.field1239;
                                                    int var23 = var21.field3675 - class23.field537;
                                                    int var24 = var21.field3667 - class231.field4336;
                                                    int var25 = var21.field3684;
                                                    int var26;
                                                    if (var25 == 1 || var25 == 2) {
                                                        var26 = -var22;
                                                    } else {
                                                        var26 = var22;
                                                    }
                                                    int var27;
                                                    if (var25 == 2 || var25 == 3) {
                                                        var27 = -var24;
                                                    } else {
                                                        var27 = var24;
                                                    }
                                                    if (var27 < var26) {
                                                        var21.field3682.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var21.field3673 + var22, var23, var21.field3666 + var24, var21.field3670);
                                                    } else if (var21.field3674 != null) {
                                                        var21.field3674.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var22, var23, var24, var21.field3670);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class5 var28 = var2.field2300;
                                                if (var28 != null) {
                                                    var28.field90.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var28.field89 - class66.field1239, var28.field83 - class23.field537, var28.field86 - class231.field4336, var28.field84);
                                                }
                                                class206 var29 = var2.field2310;
                                                if (var29 != null && var29.field3844 == 0) {
                                                    if (var29.field3846 != null) {
                                                        var29.field3846.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var29.field3838 - class66.field1239, var29.field3841 - class23.field537, var29.field3837 - class231.field4336, var29.field3847);
                                                    }
                                                    if (var29.field3845 != null) {
                                                        var29.field3845.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var29.field3838 - class66.field1239, var29.field3841 - class23.field537, var29.field3837 - class231.field4336, var29.field3847);
                                                    }
                                                    if (var29.field3839 != null) {
                                                        var29.field3839.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var29.field3838 - class66.field1239, var29.field3841 - class23.field537, var29.field3837 - class231.field4336, var29.field3847);
                                                    }
                                                }
                                            }
                                            int var30 = var2.field2312;
                                            if (var30 != 0) {
                                                if (var3 < class8.field139 && (var30 & 0x4) != 0) {
                                                    class121 var31 = var7[var3 + 1][var4];
                                                    if (var31 != null && var31.field2308) {
                                                        class35.field765.method235(var31, true);
                                                    }
                                                }
                                                if (var4 < class92.field1722 && (var30 & 0x2) != 0) {
                                                    class121 var32 = var7[var3][var4 + 1];
                                                    if (var32 != null && var32.field2308) {
                                                        class35.field765.method235(var32, true);
                                                    }
                                                }
                                                if (var3 > class8.field139 && (var30 & 0x1) != 0) {
                                                    class121 var33 = var7[var3 - 1][var4];
                                                    if (var33 != null && var33.field2308) {
                                                        class35.field765.method235(var33, true);
                                                    }
                                                }
                                                if (var4 > class92.field1722 && (var30 & 0x8) != 0) {
                                                    class121 var34 = var7[var3][var4 - 1];
                                                    if (var34 != null && var34.field2308) {
                                                        class35.field765.method235(var34, true);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field2286 != 0) {
                                            boolean var35 = true;
                                            for (int var36 = 0; var36 < var2.field2299; var36++) {
                                                if (class78.field1510 != var2.field2297[var36].field533 && (var2.field2311[var36] & var2.field2286) == var2.field2298) {
                                                    var35 = false;
                                                    break;
                                                }
                                            }
                                            if (var35) {
                                                class94 var37 = var2.field2306;
                                                if (!class18.method150(var6, var3, var4, var37.field1762)) {
                                                    var37.field1764.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var37.field1761 - class66.field1239, var37.field1758 - class23.field537, var37.field1763 - class231.field4336, var37.field1767);
                                                }
                                                var2.field2286 = 0;
                                            }
                                        }
                                        if (!var2.field2290) {
                                            break;
                                        }
                                        try {
                                            int var38 = var2.field2299;
                                            var2.field2290 = false;
                                            int var39 = 0;
                                            label558: for (int var40 = 0; var40 < var38; var40++) {
                                                class23 var41 = var2.field2297[var40];
                                                if (class78.field1510 != var41.field533) {
                                                    for (int var42 = var41.field534; var42 <= var41.field549; var42++) {
                                                        for (int var43 = var41.field539; var43 <= var41.field535; var43++) {
                                                            class121 var44 = var7[var42][var43];
                                                            if (var44.field2295) {
                                                                var2.field2290 = true;
                                                                continue label558;
                                                            }
                                                            if (var44.field2286 != 0) {
                                                                int var45 = 0;
                                                                if (var42 > var41.field534) {
                                                                    var45++;
                                                                }
                                                                if (var42 < var41.field549) {
                                                                    var45 += 4;
                                                                }
                                                                if (var43 > var41.field539) {
                                                                    var45 += 8;
                                                                }
                                                                if (var43 < var41.field535) {
                                                                    var45 += 2;
                                                                }
                                                                if ((var45 & var44.field2286) == var2.field2291) {
                                                                    var2.field2290 = true;
                                                                    continue label558;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class46.field950[var39++] = var41;
                                                    int var46 = class8.field139 - var41.field534;
                                                    int var47 = var41.field549 - class8.field139;
                                                    if (var47 > var46) {
                                                        var46 = var47;
                                                    }
                                                    int var48 = class92.field1722 - var41.field539;
                                                    int var49 = var41.field535 - class92.field1722;
                                                    if (var49 > var48) {
                                                        var41.field538 = var46 + var49;
                                                    } else {
                                                        var41.field538 = var46 + var48;
                                                    }
                                                }
                                            }
                                            while (var39 > 0) {
                                                int var50 = -50;
                                                int var51 = -1;
                                                for (int var52 = 0; var52 < var39; var52++) {
                                                    class23 var53 = class46.field950[var52];
                                                    if (class78.field1510 != var53.field533) {
                                                        if (var53.field538 > var50) {
                                                            var50 = var53.field538;
                                                            var51 = var52;
                                                        } else if (var53.field538 == var50) {
                                                            int var54 = var53.field545 - class66.field1239;
                                                            int var55 = var53.field541 - class231.field4336;
                                                            int var56 = class46.field950[var51].field545 - class66.field1239;
                                                            int var57 = class46.field950[var51].field541 - class231.field4336;
                                                            if (var54 * var54 + var55 * var55 > var56 * var56 + var57 * var57) {
                                                                var51 = var52;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var51 == -1) {
                                                    break;
                                                }
                                                class23 var58 = class46.field950[var51];
                                                var58.field533 = class78.field1510;
                                                if (!class24.method217(var6, var58.field534, var58.field549, var58.field539, var58.field535, var58.field543.method87())) {
                                                    var58.field543.method89(var58.field544, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var58.field545 - class66.field1239, var58.field546 - class23.field537, var58.field541 - class231.field4336, var58.field536);
                                                }
                                                for (int var59 = var58.field534; var59 <= var58.field549; var59++) {
                                                    for (int var60 = var58.field539; var60 <= var58.field535; var60++) {
                                                        class121 var61 = var7[var59][var60];
                                                        if (var61.field2286 != 0) {
                                                            class35.field765.method235(var61, true);
                                                        } else if ((var3 != var59 || var4 != var60) && var61.field2308) {
                                                            class35.field765.method235(var61, true);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field2290) {
                                                break;
                                            }
                                        } catch (Exception var80) {
                                            var2.field2290 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field2308);
                            } while (var2.field2286 != 0);
                            if (var3 > class8.field139 || var3 <= class18.field438) {
                                break;
                            }
                            var62 = var7[var3 - 1][var4];
                        } while (var62 != null && var62.field2308);
                        if (var3 < class8.field139 || var3 >= class190.field3507 - 1) {
                            break;
                        }
                        var63 = var7[var3 + 1][var4];
                    } while (var63 != null && var63.field2308);
                    if (var4 > class92.field1722 || var4 <= class187.field3475) {
                        break;
                    }
                    var64 = var7[var3][var4 - 1];
                } while (var64 != null && var64.field2308);
                if (var4 < class92.field1722 || var4 >= class222.field4124 - 1) {
                    break;
                }
                var65 = var7[var3][var4 + 1];
            } while (var65 != null && var65.field2308);
            var2.field2308 = false;
            class192.field3540--;
            class206 var66 = var2.field2310;
            if (var66 != null && var66.field3844 != 0) {
                if (var66.field3846 != null) {
                    var66.field3846.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var66.field3838 - class66.field1239, var66.field3841 - class23.field537 - var66.field3844, var66.field3837 - class231.field4336, var66.field3847);
                }
                if (var66.field3845 != null) {
                    var66.field3845.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var66.field3838 - class66.field1239, var66.field3841 - class23.field537 - var66.field3844, var66.field3837 - class231.field4336, var66.field3847);
                }
                if (var66.field3839 != null) {
                    var66.field3839.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var66.field3838 - class66.field1239, var66.field3841 - class23.field537 - var66.field3844, var66.field3837 - class231.field4336, var66.field3847);
                }
            }
            if (var2.field2307 != 0) {
                class201 var67 = var2.field2302;
                if (var67 != null && !class179.method1125(var6, var3, var4, var67.field3682.method87())) {
                    if ((var67.field3681 & var2.field2307) != 0) {
                        var67.field3682.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var67.field3686 + var67.field3673 - class66.field1239, var67.field3675 - class23.field537, var67.field3667 + var67.field3666 - class231.field4336, var67.field3670);
                    } else if (var67.field3681 == 256) {
                        int var68 = var67.field3686 - class66.field1239;
                        int var69 = var67.field3675 - class23.field537;
                        int var70 = var67.field3667 - class231.field4336;
                        int var71 = var67.field3684;
                        int var72;
                        if (var71 == 1 || var71 == 2) {
                            var72 = -var68;
                        } else {
                            var72 = var68;
                        }
                        int var73;
                        if (var71 == 2 || var71 == 3) {
                            var73 = -var70;
                        } else {
                            var73 = var70;
                        }
                        if (var73 >= var72) {
                            var67.field3682.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var67.field3673 + var68, var69, var67.field3666 + var70, var67.field3670);
                        } else if (var67.field3674 != null) {
                            var67.field3674.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var68, var69, var70, var67.field3670);
                        }
                    }
                }
                class94 var74 = var2.field2306;
                if (var74 != null) {
                    if ((var74.field1760 & var2.field2307) != 0 && !class18.method150(var6, var3, var4, var74.field1760)) {
                        var74.field1771.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var74.field1761 - class66.field1239, var74.field1758 - class23.field537, var74.field1763 - class231.field4336, var74.field1767);
                    }
                    if ((var74.field1762 & var2.field2307) != 0 && !class18.method150(var6, var3, var4, var74.field1762)) {
                        var74.field1764.method89(0, class60.field1118, class69.field1302, class186.field3431, class120.field2275, var74.field1761 - class66.field1239, var74.field1758 - class23.field537, var74.field1763 - class231.field4336, var74.field1767);
                    }
                }
            }
            if (var5 < class184.field3411 - 1) {
                class121 var75 = class204.field3800[var5 + 1][var3][var4];
                if (var75 != null && var75.field2308) {
                    class35.field765.method235(var75, true);
                }
            }
            if (var3 < class8.field139) {
                class121 var76 = var7[var3 + 1][var4];
                if (var76 != null && var76.field2308) {
                    class35.field765.method235(var76, true);
                }
            }
            if (var4 < class92.field1722) {
                class121 var77 = var7[var3][var4 + 1];
                if (var77 != null && var77.field2308) {
                    class35.field765.method235(var77, true);
                }
            }
            if (var3 > class8.field139) {
                class121 var78 = var7[var3 - 1][var4];
                if (var78 != null && var78.field2308) {
                    class35.field765.method235(var78, true);
                }
            }
            if (var4 > class92.field1722) {
                class121 var79 = var7[var3][var4 - 1];
                if (var79 != null && var79.field2308) {
                    class35.field765.method235(var79, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IFBLsg;Lab;)[I")
    public final int[] method1295(int arg0, float arg1, byte arg2, class195 arg3, class3 arg4) {
        field3724++;
        if (this.field3708 == null || this.field3706 != arg1) {
            if (!this.field3721.method529(arg3, 255, arg4)) {
                return null;
            }
            int var6 = arg0 >= this.field3729 ? this.field3729 : arg0;
            this.field3708 = this.field3721.method531(this.field3707, true, var6, var6, arg4, (byte) -74, arg3, (double) arg1);
            this.field3706 = arg1;
            if (this.field3734) {
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6 * var6];
                int[] var10 = new int[var6];
                int var11 = var6;
                int var12 = var6;
                int var13 = var6;
                int var15 = var6 - 1;
                int var16 = var6 - 1;
                int var17 = var6 * var6;
                for (int var18 = 2; var18 >= 0; var18--) {
                    for (int var34 = var15; var34 >= 0; var34--) {
                        var12--;
                        int var35 = this.field3708[var12];
                        var7[var34] += class139.method876(var35, 16727895) >> 16;
                        var8[var34] += class139.method876(65509, var35) >> 8;
                        var10[var34] += class139.method876(255, var35);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                }
                int var19 = var17;
                for (int var20 = var16; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 0;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 1;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var21--;
                        var23 += var10[var21];
                        var22 += var8[var21];
                        var24 += var7[var21];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                    }
                    for (int var27 = var15; var27 >= 0; var27--) {
                        int var31 = var22 / 9;
                        var25--;
                        var21--;
                        int var32 = var23 / 9;
                        int var33 = var24 / 9;
                        var19--;
                        var9[var19] = class213.method1361(var32, class213.method1361(var31 << 8, var33 << 16));
                        var23 += var10[var21] - var10[var25];
                        var22 += var8[var21] - var8[var25];
                        var24 += var7[var21] - var7[var25];
                        if (var21 == 0) {
                            var21 = var11;
                        }
                        if (var25 == 0) {
                            var25 = var11;
                        }
                    }
                    for (int var28 = var15; var28 >= 0; var28--) {
                        var12--;
                        int var29 = this.field3708[var12];
                        var13--;
                        int var30 = this.field3708[var13];
                        var7[var28] += -(class139.method876(var30, 16776818) >> 16) + (class139.method876(16729089, var29) >> 16);
                        var8[var28] += -class139.method876(255, var30 >> 8) + class139.method876(255, var29 >> 8);
                        var10[var28] += -class139.method876(255, var30) + class139.method876(var29, 255);
                    }
                    if (var12 == 0) {
                        var12 = var17;
                    }
                    if (var13 == 0) {
                        var13 = var17;
                    }
                }
                this.field3708 = var9;
            }
        }
        int var36 = 25 / ((13 - arg2) / 44);
        return this.field3708;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ZI)V")
    public final void method1296(boolean arg0, int arg1) {
        field3719++;
        if (arg0) {
            method1303(-68, (byte) 59, -11, -10);
        }
        if (this.field3708 == null || this.field3723 == 0 && this.field3720 == 0) {
            return;
        }
        if (class237.field4411 == null || class237.field4411.length < this.field3708.length) {
            class237.field4411 = new int[this.field3708.length];
        }
        int var3 = this.field3708.length == 4096 ? 64 : 128;
        int var4 = this.field3708.length;
        int var5 = this.field3720 * arg1;
        int var6 = var4 - 1;
        int var7 = arg1 * var3 * this.field3723;
        int var8 = var3 - 1;
        for (int var9 = 0; var9 < var4; var9 += var3) {
            int var11 = var6 & var7 + var9;
            for (int var12 = 0; var12 < var3; var12++) {
                int var13 = var9 + var12;
                int var14 = (var8 & var12 + var5) + var11;
                class237.field4411[var13] = this.field3708[var14];
            }
        }
        int[] var10 = this.field3708;
        this.field3708 = class237.field4411;
        class237.field4411 = var10;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lij;")
    public static final class96 method1297(Throwable arg0, String arg1) {
        field3733++;
        class96 var2;
        if (arg0 instanceof class96) {
            var2 = (class96) arg0;
            var2.field1791 = var2.field1791 + ' ' + arg1;
        } else {
            var2 = new class96(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        super.finalize();
        field3714++;
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V")
    public static final void method1298(byte arg0) {
        int var1 = -79 % ((arg0 - 45) / 39);
        class56 var2 = (class56) class80.field1533.method236(0);
        field3713++;
        while (var2 != null) {
            if (var2.field1047 == -1) {
                var2.field1061 = 0;
                class176.method1107((byte) 66, var2);
            } else {
                var2.method826(-22101);
            }
            var2 = (class56) class80.field1533.method237(true);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(ILab;ILsg;)[I")
    public final int[] method1299(int arg0, class3 arg1, int arg2, class195 arg3) {
        if (arg2 != 0) {
            field3726 = 18;
        }
        field3731++;
        if (this.field3721.method529(arg3, 255, arg1)) {
            int var5 = this.field3729 > arg0 ? arg0 : this.field3729;
            return this.field3721.method531(this.field3707, false, var5, var5, arg1, (byte) -104, arg3, 1.0D);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
    public static void method1300(int arg0) {
        if (arg0 != -3988) {
            method1298((byte) 58);
        }
        field3716 = null;
        field3709 = null;
        field3728 = null;
        field3722 = null;
        field3730 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(BII)Lvd;")
    public static final class222 method1301(byte arg0, int arg1, int arg2) {
        int var3 = arg1 - arg2;
        field3725++;
        if (var3 < -9) {
            return class186.field3432;
        } else if (var3 < -6) {
            return class204.field3801;
        } else if (var3 < -3) {
            return class186.field3436;
        } else if (var3 < 0) {
            return class69.field1297;
        } else if (var3 > 9) {
            return class35.field766;
        } else if (arg0 != 86) {
            return null;
        } else if (var3 > 6) {
            return class131.field2547;
        } else if (var3 > 3) {
            return class201.field3672;
        } else if (var3 > 0) {
            return class69.field1298;
        } else {
            return class108.field1997;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IZLle;)V")
    public static final void method1302(int arg0, boolean arg1, class123 arg2) {
        if (class54.field1023 != null) {
            try {
                class54.field1023.method784(5000);
            } catch (Exception var8) {
            }
            class54.field1023 = null;
        }
        class54.field1023 = arg2;
        field3732++;
        class151.method976(arg1, (byte) 110);
        class75.field1469.field2053 = 0;
        class106.field1967 = 0;
        class152.field2934 = null;
        class105.field1938 = null;
        while (true) {
            class212 var3 = (class212) class218.field4045.method1517(0);
            if (var3 == null) {
                while (true) {
                    class212 var4 = (class212) class218.field4048.method1517(0);
                    if (var4 == null) {
                        if (class60.field1121 != arg0) {
                            try {
                                class109 var5 = new class109(4);
                                var5.method676(4, (byte) -3);
                                var5.method676(class60.field1121, (byte) -3);
                                var5.method672(-279704376, 0);
                                class54.field1023.method785(0, arg0, var5.field2006, 4);
                            } catch (IOException var7) {
                                try {
                                    class54.field1023.method784(5000);
                                } catch (Exception var6) {
                                }
                                class54.field1023 = null;
                                class177.field3310++;
                            }
                        }
                        class124.field2375 = 0;
                        class62.field1146 = class135.method849(true);
                        return;
                    }
                    class157.field3012.method1290(1, var4);
                    class173.field3241.method1519(true, var4, var4.field2555);
                    class200.field3643--;
                    class114.field2162++;
                }
            }
            class116.field2224.method1519(true, var3, var3.field2555);
            class116.field2216++;
            class192.field3534--;
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IBII)I")
    public static final int method1303(int arg0, byte arg1, int arg2, int arg3) {
        field3715++;
        if ((class161.field3074[arg3][arg0][arg2] & 0x8) != 0) {
            return 0;
        } else if (arg3 <= 0 || (class161.field3074[1][arg0][arg2] & 0x2) == 0) {
            int var4 = 88 % ((-arg1 - 89) / 32);
            return arg3;
        } else {
            return arg3 - 1;
        }
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lka;)V")
    public class203(class109 arg0) {
        this.field3721 = new class81(arg0);
        int var2 = arg0.method662((byte) -126);
        int var3 = var2 >> 3 & 0x3;
        this.field3727 = (var2 & 0x1) != 0;
        this.field3710 = (var2 & 0x2) != 0;
        int var4 = arg0.method662((byte) -84);
        this.field3729 = 0x1 << (var4 & 0x7) + 1;
        this.field3734 = (var4 & 0x8) != 0;
        this.field3707 = (var4 & 0x80) != 0;
        this.field3718 = arg0.method675(2);
        this.field3712 = arg0.method662((byte) -89);
        if (this.field3712 == 255) {
            this.field3712 = 256;
        }
        this.field3720 = arg0.method661(255);
        this.field3723 = arg0.method661(255);
        arg0.method662((byte) -95);
        arg0.method662((byte) -99);
        arg0.method662((byte) -83);
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "()V")
    public class203() {
        this.field3721 = new class81();
        this.field3729 = 64;
        this.field3727 = true;
    }
}
