import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class36 extends Canvas {

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field593;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static volatile int field591 = 0;

    @OriginalMember(owner = "client!fc", name = "i", descriptor = "Z")
    public static boolean field594 = false;

    @OriginalMember(owner = "client!fc", name = "n", descriptor = "I")
    public static int field599 = -1;

    @OriginalMember(owner = "client!fc", name = "p", descriptor = "Lda;")
    public static class275 field601 = class255.method1672(93, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!fc", name = "m", descriptor = "Lda;")
    public static class275 field598 = class255.method1672(114, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Lda;")
    private static class275 field588 = class255.method1672(109, "Cancel");

    @OriginalMember(owner = "client!fc", name = "r", descriptor = "Lda;")
    public static class275 field603 = class255.method1672(96, "gleiten:");

    @OriginalMember(owner = "client!fc", name = "k", descriptor = "Lda;")
    public static class275 field596 = field588;

    @OriginalMember(owner = "client!fc", name = "q", descriptor = "I")
    public static int field602 = 0;

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "Lne;")
    public static class137 field587 = new class137(5);

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!fc", name = "j", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!fc", name = "l", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!fc", name = "o", descriptor = "Z")
    public static boolean field600;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "[Lda;")
    public static class275[] field590;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Z)V")
    public static final void method213(boolean arg0) {
        class26.field424 = 0;
        field592++;
        class184.field3154 = 0;
        class106.method788(-8906);
        class247.method1625(arg0);
        class57.method356((byte) -64);
        class175.method1186(122);
        for (int var1 = 0; var1 < class26.field424; var1++) {
            int var3 = class38.field633[var1];
            if (class35.field576 != class16.field238[var3].field1739) {
                if (class16.field238[var3].field1896 > 0) {
                    class249.method1634(-1, class16.field238[var3]);
                }
                class16.field238[var3] = null;
            }
        }
        if (class59.field1000 != class196.field3351.field1392) {
            throw new RuntimeException("gpp1 pos:" + class196.field3351.field1392 + " psize:" + class59.field1000);
        }
        for (int var2 = 0; var2 < class32.field486; var2++) {
            if (class16.field238[class149.field2595[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class32.field486);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lhb;Z)V")
    public static final void method214(class3 arg0, boolean arg1) {
        class192.field3303.method547(104, arg0);
        while (true) {
            class3 var2;
            int var3;
            int var4;
            int var5;
            int var6;
            class3[][] var7;
            class3 var66;
            do {
                class3 var65;
                do {
                    class3 var64;
                    do {
                        class3 var63;
                        do {
                            do {
                                do {
                                    while (true) {
                                        while (true) {
                                            do {
                                                var2 = (class3) class192.field3303.method548(-78);
                                                if (var2 == null) {
                                                    return;
                                                }
                                            } while (!var2.field47);
                                            var3 = var2.field46;
                                            var4 = var2.field36;
                                            var5 = var2.field34;
                                            var6 = var2.field43;
                                            var7 = class235.field4101[var5];
                                            if (!var2.field35) {
                                                break;
                                            }
                                            if (arg1) {
                                                if (var5 > 0) {
                                                    class3 var8 = class235.field4101[var5 - 1][var3][var4];
                                                    if (var8 != null && var8.field47) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 <= class87.field1474 && var3 > class227.field3848) {
                                                    class3 var9 = var7[var3 - 1][var4];
                                                    if (var9 != null && var9.field47 && (var9.field35 || (var2.field40 & 0x1) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var3 >= class87.field1474 && var3 < class199.field3406 - 1) {
                                                    class3 var10 = var7[var3 + 1][var4];
                                                    if (var10 != null && var10.field47 && (var10.field35 || (var2.field40 & 0x4) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 <= class131.field2347 && var4 > class143.field2506) {
                                                    class3 var11 = var7[var3][var4 - 1];
                                                    if (var11 != null && var11.field47 && (var11.field35 || (var2.field40 & 0x8) == 0)) {
                                                        continue;
                                                    }
                                                }
                                                if (var4 >= class131.field2347 && var4 < class204.field3461 - 1) {
                                                    class3 var12 = var7[var3][var4 + 1];
                                                    if (var12 != null && var12.field47 && (var12.field35 || (var2.field40 & 0x2) == 0)) {
                                                        continue;
                                                    }
                                                }
                                            } else {
                                                arg1 = true;
                                            }
                                            var2.field35 = false;
                                            if (var2.field32 != null) {
                                                class3 var13 = var2.field32;
                                                if (var13.field45 == null) {
                                                    if (var13.field44 != null) {
                                                        if (class231.method1498(0, var3, var4)) {
                                                            class250.method1641(var13.field44, class157.field2758, class219.field3710, class40.field673, class173.field3000, var3, var4, true);
                                                        } else {
                                                            class250.method1641(var13.field44, class157.field2758, class219.field3710, class40.field673, class173.field3000, var3, var4, false);
                                                        }
                                                    }
                                                } else if (class231.method1498(0, var3, var4)) {
                                                    class192.method1262(var13.field45, 0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var3, var4, true);
                                                } else {
                                                    class192.method1262(var13.field45, 0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var3, var4, false);
                                                }
                                                class139 var14 = var13.field50;
                                                if (var14 != null) {
                                                    var14.field2444.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var14.field2436 - class123.field2205, var14.field2445 - class80.field1317, var14.field2434 - class265.field4617, var14.field2426);
                                                }
                                                for (int var15 = 0; var15 < var13.field29; var15++) {
                                                    class37 var16 = var13.field48[var15];
                                                    if (var16 != null) {
                                                        var16.field612.method659(var16.field622, class157.field2758, class219.field3710, class40.field673, class173.field3000, var16.field619 - class123.field2205, var16.field618 - class80.field1317, var16.field606 - class265.field4617, var16.field608);
                                                    }
                                                }
                                            }
                                            boolean var17 = false;
                                            if (var2.field45 == null) {
                                                if (var2.field44 != null) {
                                                    if (class231.method1498(var6, var3, var4)) {
                                                        class250.method1641(var2.field44, class157.field2758, class219.field3710, class40.field673, class173.field3000, var3, var4, true);
                                                    } else {
                                                        var17 = true;
                                                        class250.method1641(var2.field44, class157.field2758, class219.field3710, class40.field673, class173.field3000, var3, var4, false);
                                                    }
                                                }
                                            } else if (class231.method1498(var6, var3, var4)) {
                                                class192.method1262(var2.field45, var6, class157.field2758, class219.field3710, class40.field673, class173.field3000, var3, var4, true);
                                            } else {
                                                var17 = true;
                                                if (var2.field45.field2562 != 12345678 || class69.field1111 && var5 <= class170.field2964) {
                                                    class192.method1262(var2.field45, var6, class157.field2758, class219.field3710, class40.field673, class173.field3000, var3, var4, false);
                                                }
                                            }
                                            if (var17) {
                                                class214 var18 = var2.field39;
                                                if (var18 != null && (var18.field3645 & 0x80000000L) != 0L) {
                                                    var18.field3648.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var18.field3646 - class123.field2205, var18.field3644 - class80.field1317, var18.field3649 - class265.field4617, var18.field3645);
                                                }
                                            }
                                            int var19 = 0;
                                            int var20 = 0;
                                            class139 var21 = var2.field50;
                                            class119 var22 = var2.field41;
                                            if (var21 != null || var22 != null) {
                                                if (class87.field1474 == var3) {
                                                    var19++;
                                                } else if (class87.field1474 < var3) {
                                                    var19 += 2;
                                                }
                                                if (class131.field2347 == var4) {
                                                    var19 += 3;
                                                } else if (class131.field2347 > var4) {
                                                    var19 += 6;
                                                }
                                                var20 = class255.field4502[var19];
                                                var2.field42 = class48.field801[var19];
                                            }
                                            if (var21 != null) {
                                                if ((var21.field2439 & class104.field1784[var19]) == 0) {
                                                    var2.field49 = 0;
                                                } else if (var21.field2439 == 16) {
                                                    var2.field49 = 3;
                                                    var2.field51 = class127.field2254[var19];
                                                    var2.field33 = 3 - var2.field51;
                                                } else if (var21.field2439 == 32) {
                                                    var2.field49 = 6;
                                                    var2.field51 = class113.field2008[var19];
                                                    var2.field33 = 6 - var2.field51;
                                                } else if (var21.field2439 == 64) {
                                                    var2.field49 = 12;
                                                    var2.field51 = class277.field4833[var19];
                                                    var2.field33 = 12 - var2.field51;
                                                } else {
                                                    var2.field49 = 9;
                                                    var2.field51 = class246.field4337[var19];
                                                    var2.field33 = 9 - var2.field51;
                                                }
                                                if ((var21.field2439 & var20) != 0 && !class145.method1036(var6, var3, var4, var21.field2439)) {
                                                    var21.field2444.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var21.field2436 - class123.field2205, var21.field2445 - class80.field1317, var21.field2434 - class265.field4617, var21.field2426);
                                                }
                                                if ((var21.field2441 & var20) != 0 && !class145.method1036(var6, var3, var4, var21.field2441)) {
                                                    var21.field2446.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var21.field2436 - class123.field2205, var21.field2445 - class80.field1317, var21.field2434 - class265.field4617, var21.field2426);
                                                }
                                            }
                                            if (var22 != null && !class170.method1167(var6, var3, var4, var22.field2136.method664())) {
                                                if ((var22.field2132 & var20) != 0) {
                                                    var22.field2136.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var22.field2137 + var22.field2128 - class123.field2205, var22.field2141 - class80.field1317, var22.field2127 + var22.field2131 - class265.field4617, var22.field2142);
                                                } else if (var22.field2132 == 256) {
                                                    int var23 = var22.field2137 - class123.field2205;
                                                    int var24 = var22.field2141 - class80.field1317;
                                                    int var25 = var22.field2127 - class265.field4617;
                                                    int var26 = var22.field2134;
                                                    int var27;
                                                    if (var26 == 1 || var26 == 2) {
                                                        var27 = -var23;
                                                    } else {
                                                        var27 = var23;
                                                    }
                                                    int var28;
                                                    if (var26 == 2 || var26 == 3) {
                                                        var28 = -var25;
                                                    } else {
                                                        var28 = var25;
                                                    }
                                                    if (var28 < var27) {
                                                        var22.field2136.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var22.field2128 + var23, var24, var22.field2131 + var25, var22.field2142);
                                                    } else if (var22.field2135 != null) {
                                                        var22.field2135.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var23, var24, var25, var22.field2142);
                                                    }
                                                }
                                            }
                                            if (var17) {
                                                class214 var29 = var2.field39;
                                                if (var29 != null && (var29.field3645 & 0x80000000L) == 0L) {
                                                    var29.field3648.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var29.field3646 - class123.field2205, var29.field3644 - class80.field1317, var29.field3649 - class265.field4617, var29.field3645);
                                                }
                                                class71 var30 = var2.field37;
                                                if (var30 != null && var30.field1156 == 0) {
                                                    if (var30.field1154 != null) {
                                                        var30.field1154.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var30.field1162 - class123.field2205, var30.field1157 - class80.field1317, var30.field1163 - class265.field4617, var30.field1158);
                                                    }
                                                    if (var30.field1159 != null) {
                                                        var30.field1159.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var30.field1162 - class123.field2205, var30.field1157 - class80.field1317, var30.field1163 - class265.field4617, var30.field1158);
                                                    }
                                                    if (var30.field1161 != null) {
                                                        var30.field1161.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var30.field1162 - class123.field2205, var30.field1157 - class80.field1317, var30.field1163 - class265.field4617, var30.field1158);
                                                    }
                                                }
                                            }
                                            int var31 = var2.field40;
                                            if (var31 != 0) {
                                                if (var3 < class87.field1474 && (var31 & 0x4) != 0) {
                                                    class3 var32 = var7[var3 + 1][var4];
                                                    if (var32 != null && var32.field47) {
                                                        class192.field3303.method547(104, var32);
                                                    }
                                                }
                                                if (var4 < class131.field2347 && (var31 & 0x2) != 0) {
                                                    class3 var33 = var7[var3][var4 + 1];
                                                    if (var33 != null && var33.field47) {
                                                        class192.field3303.method547(104, var33);
                                                    }
                                                }
                                                if (var3 > class87.field1474 && (var31 & 0x1) != 0) {
                                                    class3 var34 = var7[var3 - 1][var4];
                                                    if (var34 != null && var34.field47) {
                                                        class192.field3303.method547(104, var34);
                                                    }
                                                }
                                                if (var4 > class131.field2347 && (var31 & 0x8) != 0) {
                                                    class3 var35 = var7[var3][var4 - 1];
                                                    if (var35 != null && var35.field47) {
                                                        class192.field3303.method547(104, var35);
                                                    }
                                                }
                                            }
                                            break;
                                        }
                                        if (var2.field49 != 0) {
                                            boolean var36 = true;
                                            for (int var37 = 0; var37 < var2.field29; var37++) {
                                                if (class162.field2832 != var2.field48[var37].field611 && (var2.field30[var37] & var2.field49) == var2.field51) {
                                                    var36 = false;
                                                    break;
                                                }
                                            }
                                            if (var36) {
                                                class139 var38 = var2.field50;
                                                if (!class145.method1036(var6, var3, var4, var38.field2439)) {
                                                    var38.field2444.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var38.field2436 - class123.field2205, var38.field2445 - class80.field1317, var38.field2434 - class265.field4617, var38.field2426);
                                                }
                                                var2.field49 = 0;
                                            }
                                        }
                                        if (!var2.field38) {
                                            break;
                                        }
                                        try {
                                            int var39 = var2.field29;
                                            var2.field38 = false;
                                            int var40 = 0;
                                            label572: for (int var41 = 0; var41 < var39; var41++) {
                                                class37 var42 = var2.field48[var41];
                                                if (class162.field2832 != var42.field611) {
                                                    for (int var43 = var42.field616; var43 <= var42.field610; var43++) {
                                                        for (int var44 = var42.field617; var44 <= var42.field604; var44++) {
                                                            class3 var45 = var7[var43][var44];
                                                            if (var45.field35) {
                                                                var2.field38 = true;
                                                                continue label572;
                                                            }
                                                            if (var45.field49 != 0) {
                                                                int var46 = 0;
                                                                if (var43 > var42.field616) {
                                                                    var46++;
                                                                }
                                                                if (var43 < var42.field610) {
                                                                    var46 += 4;
                                                                }
                                                                if (var44 > var42.field617) {
                                                                    var46 += 8;
                                                                }
                                                                if (var44 < var42.field604) {
                                                                    var46 += 2;
                                                                }
                                                                if ((var46 & var45.field49) == var2.field33) {
                                                                    var2.field38 = true;
                                                                    continue label572;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    class5.field70[var40++] = var42;
                                                    int var47 = class87.field1474 - var42.field616;
                                                    int var48 = var42.field610 - class87.field1474;
                                                    if (var48 > var47) {
                                                        var47 = var48;
                                                    }
                                                    int var49 = class131.field2347 - var42.field617;
                                                    int var50 = var42.field604 - class131.field2347;
                                                    if (var50 > var49) {
                                                        var42.field624 = var47 + var50;
                                                    } else {
                                                        var42.field624 = var47 + var49;
                                                    }
                                                }
                                            }
                                            while (var40 > 0) {
                                                int var51 = -50;
                                                int var52 = -1;
                                                for (int var53 = 0; var53 < var40; var53++) {
                                                    class37 var54 = class5.field70[var53];
                                                    if (class162.field2832 != var54.field611) {
                                                        if (var54.field624 > var51) {
                                                            var51 = var54.field624;
                                                            var52 = var53;
                                                        } else if (var54.field624 == var51) {
                                                            int var55 = var54.field619 - class123.field2205;
                                                            int var56 = var54.field606 - class265.field4617;
                                                            int var57 = class5.field70[var52].field619 - class123.field2205;
                                                            int var58 = class5.field70[var52].field606 - class265.field4617;
                                                            if (var55 * var55 + var56 * var56 > var57 * var57 + var58 * var58) {
                                                                var52 = var53;
                                                            }
                                                        }
                                                    }
                                                }
                                                if (var52 == -1) {
                                                    break;
                                                }
                                                class37 var59 = class5.field70[var52];
                                                var59.field611 = class162.field2832;
                                                if (!class149.method1056(var6, var59.field616, var59.field610, var59.field617, var59.field604, var59.field612.method664())) {
                                                    var59.field612.method659(var59.field622, class157.field2758, class219.field3710, class40.field673, class173.field3000, var59.field619 - class123.field2205, var59.field618 - class80.field1317, var59.field606 - class265.field4617, var59.field608);
                                                }
                                                for (int var60 = var59.field616; var60 <= var59.field610; var60++) {
                                                    for (int var61 = var59.field617; var61 <= var59.field604; var61++) {
                                                        class3 var62 = var7[var60][var61];
                                                        if (var62.field49 != 0) {
                                                            class192.field3303.method547(104, var62);
                                                        } else if ((var3 != var60 || var4 != var61) && var62.field47) {
                                                            class192.field3303.method547(104, var62);
                                                        }
                                                    }
                                                }
                                            }
                                            if (!var2.field38) {
                                                break;
                                            }
                                        } catch (Exception var81) {
                                            var2.field38 = false;
                                            break;
                                        }
                                    }
                                } while (!var2.field47);
                            } while (var2.field49 != 0);
                            if (var3 > class87.field1474 || var3 <= class227.field3848) {
                                break;
                            }
                            var63 = var7[var3 - 1][var4];
                        } while (var63 != null && var63.field47);
                        if (var3 < class87.field1474 || var3 >= class199.field3406 - 1) {
                            break;
                        }
                        var64 = var7[var3 + 1][var4];
                    } while (var64 != null && var64.field47);
                    if (var4 > class131.field2347 || var4 <= class143.field2506) {
                        break;
                    }
                    var65 = var7[var3][var4 - 1];
                } while (var65 != null && var65.field47);
                if (var4 < class131.field2347 || var4 >= class204.field3461 - 1) {
                    break;
                }
                var66 = var7[var3][var4 + 1];
            } while (var66 != null && var66.field47);
            var2.field47 = false;
            class30.field460--;
            class71 var67 = var2.field37;
            if (var67 != null && var67.field1156 != 0) {
                if (var67.field1154 != null) {
                    var67.field1154.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var67.field1162 - class123.field2205, var67.field1157 - class80.field1317 - var67.field1156, var67.field1163 - class265.field4617, var67.field1158);
                }
                if (var67.field1159 != null) {
                    var67.field1159.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var67.field1162 - class123.field2205, var67.field1157 - class80.field1317 - var67.field1156, var67.field1163 - class265.field4617, var67.field1158);
                }
                if (var67.field1161 != null) {
                    var67.field1161.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var67.field1162 - class123.field2205, var67.field1157 - class80.field1317 - var67.field1156, var67.field1163 - class265.field4617, var67.field1158);
                }
            }
            if (var2.field42 != 0) {
                class119 var68 = var2.field41;
                if (var68 != null && !class170.method1167(var6, var3, var4, var68.field2136.method664())) {
                    if ((var68.field2132 & var2.field42) != 0) {
                        var68.field2136.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var68.field2137 + var68.field2128 - class123.field2205, var68.field2141 - class80.field1317, var68.field2127 + var68.field2131 - class265.field4617, var68.field2142);
                    } else if (var68.field2132 == 256) {
                        int var69 = var68.field2137 - class123.field2205;
                        int var70 = var68.field2141 - class80.field1317;
                        int var71 = var68.field2127 - class265.field4617;
                        int var72 = var68.field2134;
                        int var73;
                        if (var72 == 1 || var72 == 2) {
                            var73 = -var69;
                        } else {
                            var73 = var69;
                        }
                        int var74;
                        if (var72 == 2 || var72 == 3) {
                            var74 = -var71;
                        } else {
                            var74 = var71;
                        }
                        if (var74 >= var73) {
                            var68.field2136.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var68.field2128 + var69, var70, var68.field2131 + var71, var68.field2142);
                        } else if (var68.field2135 != null) {
                            var68.field2135.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var69, var70, var71, var68.field2142);
                        }
                    }
                }
                class139 var75 = var2.field50;
                if (var75 != null) {
                    if ((var75.field2441 & var2.field42) != 0 && !class145.method1036(var6, var3, var4, var75.field2441)) {
                        var75.field2446.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var75.field2436 - class123.field2205, var75.field2445 - class80.field1317, var75.field2434 - class265.field4617, var75.field2426);
                    }
                    if ((var75.field2439 & var2.field42) != 0 && !class145.method1036(var6, var3, var4, var75.field2439)) {
                        var75.field2444.method659(0, class157.field2758, class219.field3710, class40.field673, class173.field3000, var75.field2436 - class123.field2205, var75.field2445 - class80.field1317, var75.field2434 - class265.field4617, var75.field2426);
                    }
                }
            }
            if (var5 < class221.field3751 - 1) {
                class3 var76 = class235.field4101[var5 + 1][var3][var4];
                if (var76 != null && var76.field47) {
                    class192.field3303.method547(104, var76);
                }
            }
            if (var3 < class87.field1474) {
                class3 var77 = var7[var3 + 1][var4];
                if (var77 != null && var77.field47) {
                    class192.field3303.method547(104, var77);
                }
            }
            if (var4 < class131.field2347) {
                class3 var78 = var7[var3][var4 + 1];
                if (var78 != null && var78.field47) {
                    class192.field3303.method547(104, var78);
                }
            }
            if (var3 > class87.field1474) {
                class3 var79 = var7[var3 - 1][var4];
                if (var79 != null && var79.field47) {
                    class192.field3303.method547(104, var79);
                }
            }
            if (var4 > class131.field2347) {
                class3 var80 = var7[var3][var4 - 1];
                if (var80 != null && var80.field47) {
                    class192.field3303.method547(104, var80);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
    public static void method215(int arg0) {
        if (arg0 != 2) {
            field598 = null;
        }
        field590 = null;
        field587 = null;
        field598 = null;
        field596 = null;
        field588 = null;
        field601 = null;
        field603 = null;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([IIIII)V")
    public static final void method216(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        arg1--;
        field597++;
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        while (var5 > arg1) {
            int var6 = arg1 + 1;
            arg0[var6] = arg2;
            int var7 = var6 + 1;
            arg0[var7] = arg2;
            int var8 = var7 + 1;
            arg0[var8] = arg2;
            int var9 = var8 + 1;
            arg0[var9] = arg2;
            int var10 = var9 + 1;
            arg0[var10] = arg2;
            int var11 = var10 + 1;
            arg0[var11] = arg2;
            int var12 = var11 + 1;
            arg0[var12] = arg2;
            arg1 = var12 + 1;
            arg0[arg1] = arg2;
        }
        while (arg1 < var13) {
            arg1++;
            arg0[arg1] = arg2;
        }
        if (arg3 >= -112) {
            field601 = null;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method217(String arg0, int arg1) throws ClassNotFoundException {
        if (arg1 != -31992) {
            field602 = -19;
        }
        field586++;
        if (arg0.equals("B")) {
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

    @OriginalMember(owner = "client!fc", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field593.update(arg0);
        field589++;
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class36(Component arg0) {
        this.field593 = arg0;
    }

    @OriginalMember(owner = "client!fc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field593.paint(arg0);
        field595++;
    }
}
