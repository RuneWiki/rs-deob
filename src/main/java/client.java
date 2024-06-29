import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class118 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lqj;")
    public static class196 field1458 = class80.method502(":tradereq:", -48);

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "Lqj;")
    public static class196 field1468 = class80.method502("p11_full", -48);

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field1462 = 0;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "Lqj;")
    public static class196 field1459 = class80.method502(")3", -48);

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field1454;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field1464;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Lec;IIIIIII)V")
    public static final void method613(class178[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class178 var9 = arg0[var8];
            if (var9 != null && var9.field2990 == arg1 && (!var9.field3030 || var9.field3123 == 0 || var9.field3076 || method614(var9) != 0 || class98.field1421 == var9 || var9.field3121 == 1338) && (!var9.field3030 || !method618(var9))) {
                int var10 = var9.field3042 + arg6;
                int var11 = var9.field3105 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field3123 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field3085 + var10;
                    int var17 = var9.field2997 + var11;
                    if (var9.field3123 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class118.field1698 == var9) {
                    class214.field3833 = true;
                    class58.field783 = var10;
                    class161.field2585 = var11;
                }
                if (!var9.field3030 || var12 < var14 && var13 < var15) {
                    if (var9.field3123 == 0) {
                        if (!var9.field3030 && method618(var9) && class84.field1234 != var9) {
                            continue;
                        }
                        if (var9.field3129 && class52.field646 >= var12 && class63.field869 >= var13 && class52.field646 < var14 && class63.field869 < var15) {
                            for (class157 var18 = (class157) class22.field277.method1651((byte) -79); var18 != null; var18 = (class157) class22.field277.method1656(-73)) {
                                if (var18.field2539) {
                                    var18.method797((byte) 127);
                                }
                            }
                            if (class41.field475 == 0) {
                                class118.field1698 = null;
                                class98.field1421 = null;
                            }
                            class35.field417 = false;
                        }
                    }
                    if (var9.field3030) {
                        boolean var19;
                        if (class52.field646 >= var12 && class63.field869 >= var13 && class52.field646 < var14 && class63.field869 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class227.field4052 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class178.field3052 == 1 && class61.field812 >= var12 && class28.field350 >= var13 && class61.field812 < var14 && class28.field350 < var15) {
                            var21 = true;
                        }
                        if (class14.field157 > 0 && var9.field3140 != null) {
                            for (int var22 = 0; var22 < var9.field3140.length; var22++) {
                                for (int var23 = 0; var23 < class14.field157; var23++) {
                                    int var24 = var9.field3140[var22] & 0xFF;
                                    if (class159.field2569[var23] == var24) {
                                        class56.method332(var22 + 1, 104, class152.field2450, -1, var9.field3117);
                                    }
                                }
                            }
                        }
                        if (var21) {
                            class72.method461(var9, 0, class61.field812 - var10, class28.field350 - var11);
                        }
                        if (class118.field1698 != null && class118.field1698 != var9 && var19 && class185.method1206((byte) -22, method614(var9))) {
                            class246.field4388 = var9;
                        }
                        if (class98.field1421 == var9) {
                            class238.field4226 = true;
                            class186.field3276 = var10;
                            class202.field3599 = var11;
                        }
                        if (var9.field3076 || var9.field3121 != 0) {
                            if (var19 && class240.field4266 != 0 && var9.field3063 != null) {
                                class157 var25 = new class157();
                                var25.field2539 = true;
                                var25.field2526 = var9;
                                var25.field2530 = class240.field4266;
                                var25.field2534 = var9.field3063;
                                class22.field277.method1652(26532, var25);
                            }
                            if (class118.field1698 != null || class76.field1101 != null || class160.field2574 || var9.field3121 != 1400 && class35.field417) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field3121 != 0) {
                                if (var9.field3121 == 1337) {
                                    class130.field1845 = var9;
                                    class214.method1472(-120, var9);
                                    continue;
                                }
                                if (var9.field3121 == 1338) {
                                    if (var21) {
                                        class60.method382(class28.field350 - var11, class61.field812 - var10, var9, -41);
                                    }
                                    continue;
                                }
                                if (var9.field3121 == 1400) {
                                    class12.field135 = var9;
                                    if (var21) {
                                        if (class174.field2936[82] && class25.field320 > 0) {
                                            int var26 = (int) ((double) (class61.field812 - var10 - var9.field3085 / 2) * 2.0D / class199.field3530) + class212.field3809 + class157.field2537;
                                            int var27 = class83.field1203 + class83.field1213 - (int) ((double) (class28.field350 - var11 - var9.field2997 / 2) * 2.0D / class199.field3530) - class126.field1784;
                                            class196 var28 = class93.method572(-83, new class196[] { class223.field4005, class163.method1029(var26 >> 6, false), class109.field1553, class163.method1029(var27 >> 6, false), class109.field1553, class163.method1029(var26 & 0x3F, false), class109.field1553, class163.method1029(var27 & 0x3F, false) });
                                            var28.method1301((byte) -37);
                                            class113.method687(-1, var28);
                                            class92.method566(false);
                                            continue;
                                        }
                                        class35.field417 = true;
                                        class67.field956 = class52.field646;
                                        class157.field2540 = class63.field869;
                                        class187.field3289 = class157.field2537;
                                        class110.field1563 = class126.field1784;
                                        continue;
                                    }
                                    if (var20 && class35.field417) {
                                        class249.method1690(-51, (int) ((double) (class67.field956 - class52.field646) * 2.0D / class25.field315) + class187.field3289);
                                        class99.method604((byte) -59, (int) ((double) (class157.field2540 - class63.field869) * 2.0D / class25.field315) + class110.field1563);
                                        continue;
                                    }
                                    class35.field417 = false;
                                    continue;
                                }
                                if (var9.field3121 == 1401) {
                                    if (var20) {
                                        class84.method530(class52.field646 - var10, var9.field3085, class63.field869 - var11, var9.field2997, 31463);
                                    }
                                    continue;
                                }
                                if (var9.field3121 == 1402) {
                                    class214.method1472(-77, var9);
                                    continue;
                                }
                                if (var9.field3121 == 1404) {
                                    class214.method1472(72, var9);
                                    continue;
                                }
                            }
                            if (!var9.field3061 && var21) {
                                var9.field3061 = true;
                                if (var9.field3142 != null) {
                                    class157 var29 = new class157();
                                    var29.field2539 = true;
                                    var29.field2526 = var9;
                                    var29.field2527 = class61.field812 - var10;
                                    var29.field2530 = class28.field350 - var11;
                                    var29.field2534 = var9.field3142;
                                    class22.field277.method1652(26532, var29);
                                }
                            }
                            if (var9.field3061 && var20 && var9.field3066 != null) {
                                class157 var30 = new class157();
                                var30.field2539 = true;
                                var30.field2526 = var9;
                                var30.field2527 = class52.field646 - var10;
                                var30.field2530 = class63.field869 - var11;
                                var30.field2534 = var9.field3066;
                                class22.field277.method1652(26532, var30);
                            }
                            if (var9.field3061 && !var20) {
                                var9.field3061 = false;
                                if (var9.field3039 != null) {
                                    class157 var31 = new class157();
                                    var31.field2539 = true;
                                    var31.field2526 = var9;
                                    var31.field2527 = class52.field646 - var10;
                                    var31.field2530 = class63.field869 - var11;
                                    var31.field2534 = var9.field3039;
                                    class27.field334.method1652(26532, var31);
                                }
                            }
                            if (var20 && var9.field3071 != null) {
                                class157 var32 = new class157();
                                var32.field2539 = true;
                                var32.field2526 = var9;
                                var32.field2527 = class52.field646 - var10;
                                var32.field2530 = class63.field869 - var11;
                                var32.field2534 = var9.field3071;
                                class22.field277.method1652(26532, var32);
                            }
                            if (!var9.field3072 && var19) {
                                var9.field3072 = true;
                                if (var9.field3080 != null) {
                                    class157 var33 = new class157();
                                    var33.field2539 = true;
                                    var33.field2526 = var9;
                                    var33.field2527 = class52.field646 - var10;
                                    var33.field2530 = class63.field869 - var11;
                                    var33.field2534 = var9.field3080;
                                    class22.field277.method1652(26532, var33);
                                }
                            }
                            if (var9.field3072 && var19 && var9.field3053 != null) {
                                class157 var34 = new class157();
                                var34.field2539 = true;
                                var34.field2526 = var9;
                                var34.field2527 = class52.field646 - var10;
                                var34.field2530 = class63.field869 - var11;
                                var34.field2534 = var9.field3053;
                                class22.field277.method1652(26532, var34);
                            }
                            if (var9.field3072 && !var19) {
                                var9.field3072 = false;
                                if (var9.field3102 != null) {
                                    class157 var35 = new class157();
                                    var35.field2539 = true;
                                    var35.field2526 = var9;
                                    var35.field2527 = class52.field646 - var10;
                                    var35.field2530 = class63.field869 - var11;
                                    var35.field2534 = var9.field3102;
                                    class27.field334.method1652(26532, var35);
                                }
                            }
                            if (var9.field3015 != null) {
                                class157 var36 = new class157();
                                var36.field2526 = var9;
                                var36.field2534 = var9.field3015;
                                class58.field792.method1652(26532, var36);
                            }
                            if (var9.field2992 != null && class135.field1961 > var9.field3035) {
                                if (var9.field3012 == null || class135.field1961 - var9.field3035 > 32) {
                                    class157 var41 = new class157();
                                    var41.field2526 = var9;
                                    var41.field2534 = var9.field2992;
                                    class22.field277.method1652(26532, var41);
                                } else {
                                    label543: for (int var37 = var9.field3035; var37 < class135.field1961; var37++) {
                                        int var38 = class252.field4460[var37 & 0x1F];
                                        for (int var39 = 0; var39 < var9.field3012.length; var39++) {
                                            if (var9.field3012[var39] == var38) {
                                                class157 var40 = new class157();
                                                var40.field2526 = var9;
                                                var40.field2534 = var9.field2992;
                                                class22.field277.method1652(26532, var40);
                                                break label543;
                                            }
                                        }
                                    }
                                }
                                var9.field3035 = class135.field1961;
                            }
                            if (var9.field3057 != null && class158.field2552 > var9.field2996) {
                                if (var9.field3055 == null || class158.field2552 - var9.field2996 > 32) {
                                    class157 var46 = new class157();
                                    var46.field2526 = var9;
                                    var46.field2534 = var9.field3057;
                                    class22.field277.method1652(26532, var46);
                                } else {
                                    label519: for (int var42 = var9.field2996; var42 < class158.field2552; var42++) {
                                        int var43 = class16.field183[var42 & 0x1F];
                                        for (int var44 = 0; var44 < var9.field3055.length; var44++) {
                                            if (var9.field3055[var44] == var43) {
                                                class157 var45 = new class157();
                                                var45.field2526 = var9;
                                                var45.field2534 = var9.field3057;
                                                class22.field277.method1652(26532, var45);
                                                break label519;
                                            }
                                        }
                                    }
                                }
                                var9.field2996 = class158.field2552;
                            }
                            if (var9.field3090 != null && class206.field3703 > var9.field3093) {
                                if (var9.field3141 == null || class206.field3703 - var9.field3093 > 32) {
                                    class157 var51 = new class157();
                                    var51.field2526 = var9;
                                    var51.field2534 = var9.field3090;
                                    class22.field277.method1652(26532, var51);
                                } else {
                                    label495: for (int var47 = var9.field3093; var47 < class206.field3703; var47++) {
                                        int var48 = class64.field885[var47 & 0x1F];
                                        for (int var49 = 0; var49 < var9.field3141.length; var49++) {
                                            if (var9.field3141[var49] == var48) {
                                                class157 var50 = new class157();
                                                var50.field2526 = var9;
                                                var50.field2534 = var9.field3090;
                                                class22.field277.method1652(26532, var50);
                                                break label495;
                                            }
                                        }
                                    }
                                }
                                var9.field3093 = class206.field3703;
                            }
                            if (var9.field3147 != null && class154.field2502 > var9.field3034) {
                                if (var9.field3144 == null || class154.field2502 - var9.field3034 > 32) {
                                    class157 var56 = new class157();
                                    var56.field2526 = var9;
                                    var56.field2534 = var9.field3147;
                                    class22.field277.method1652(26532, var56);
                                } else {
                                    label471: for (int var52 = var9.field3034; var52 < class154.field2502; var52++) {
                                        int var53 = class96.field1415[var52 & 0x1F];
                                        for (int var54 = 0; var54 < var9.field3144.length; var54++) {
                                            if (var9.field3144[var54] == var53) {
                                                class157 var55 = new class157();
                                                var55.field2526 = var9;
                                                var55.field2534 = var9.field3147;
                                                class22.field277.method1652(26532, var55);
                                                break label471;
                                            }
                                        }
                                    }
                                }
                                var9.field3034 = class154.field2502;
                            }
                            if (var9.field3003 != null && class166.field2744 > var9.field3028) {
                                if (var9.field3033 == null || class166.field2744 - var9.field3028 > 32) {
                                    class157 var61 = new class157();
                                    var61.field2526 = var9;
                                    var61.field2534 = var9.field3003;
                                    class22.field277.method1652(26532, var61);
                                } else {
                                    label447: for (int var57 = var9.field3028; var57 < class166.field2744; var57++) {
                                        int var58 = class122.field1747[var57 & 0x1F];
                                        for (int var59 = 0; var59 < var9.field3033.length; var59++) {
                                            if (var9.field3033[var59] == var58) {
                                                class157 var60 = new class157();
                                                var60.field2526 = var9;
                                                var60.field2534 = var9.field3003;
                                                class22.field277.method1652(26532, var60);
                                                break label447;
                                            }
                                        }
                                    }
                                }
                                var9.field3028 = class166.field2744;
                            }
                            if (class220.field3944 > var9.field3043 && var9.field3077 != null) {
                                class157 var62 = new class157();
                                var62.field2526 = var9;
                                var62.field2534 = var9.field3077;
                                class22.field277.method1652(26532, var62);
                            }
                            if (class242.field4302 > var9.field3043 && var9.field3131 != null) {
                                class157 var63 = new class157();
                                var63.field2526 = var9;
                                var63.field2534 = var9.field3131;
                                class22.field277.method1652(26532, var63);
                            }
                            if (class229.field4080 > var9.field3043 && var9.field3146 != null) {
                                class157 var64 = new class157();
                                var64.field2526 = var9;
                                var64.field2534 = var9.field3146;
                                class22.field277.method1652(26532, var64);
                            }
                            if (class209.field3758 > var9.field3043 && var9.field2999 != null) {
                                class157 var65 = new class157();
                                var65.field2526 = var9;
                                var65.field2534 = var9.field2999;
                                class22.field277.method1652(26532, var65);
                            }
                            if (class151.field2423 > var9.field3043 && var9.field3023 != null) {
                                class157 var66 = new class157();
                                var66.field2526 = var9;
                                var66.field2534 = var9.field3023;
                                class22.field277.method1652(26532, var66);
                            }
                            var9.field3043 = class92.field1341;
                            if (var9.field3069 != null) {
                                for (int var67 = 0; var67 < class14.field157; var67++) {
                                    class157 var68 = new class157();
                                    var68.field2526 = var9;
                                    var68.field2531 = class159.field2569[var67];
                                    var68.field2529 = class91.field1337[var67];
                                    var68.field2534 = var9.field3069;
                                    class22.field277.method1652(26532, var68);
                                }
                            }
                            if (class213.field3820 && var9.field3016 != null) {
                                class157 var69 = new class157();
                                var69.field2526 = var9;
                                var69.field2534 = var9.field3016;
                                class22.field277.method1652(26532, var69);
                            }
                        }
                    }
                    if (!var9.field3030 && class118.field1698 == null && class76.field1101 == null && !class160.field2574) {
                        if ((var9.field2993 >= 0 || var9.field3004 != 0) && class52.field646 >= var12 && class63.field869 >= var13 && class52.field646 < var14 && class63.field869 < var15) {
                            if (var9.field2993 >= 0) {
                                class84.field1234 = arg0[var9.field2993];
                            } else {
                                class84.field1234 = var9;
                            }
                        }
                        if (var9.field3123 == 8 && class52.field646 >= var12 && class63.field869 >= var13 && class52.field646 < var14 && class63.field869 < var15) {
                            class219.field3923 = var9;
                        }
                        if (var9.field3056 > var9.field2997) {
                            class251.method1694(34, var9, var9.field2997, class52.field646, class63.field869, var11, var9.field3056, var9.field3085 + var10);
                        }
                    }
                    if (var9.field3123 == 0) {
                        method613(arg0, var9.field3117, var12, var13, var14, var15, var10 - var9.field3088, var11 - var9.field2998);
                        if (var9.field3087 != null) {
                            method613(var9.field3087, var9.field3117, var12, var13, var14, var15, var10 - var9.field3088, var11 - var9.field2998);
                        }
                        class63 var70 = (class63) class101.field1445.method1551(32768, (long) var9.field3117);
                        if (var70 != null) {
                            class220.method1504(var13, var11, var15, var12, false, var14, var10, var70.field864);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        field1460++;
        try {
            if (arg0.length < 7 || arg0.length > 8) {
                class9.method32(1);
            }
            class158.field2549 = Integer.parseInt(arg0[0]);
            if (arg0[1].equals("live")) {
                class211.field3797 = 0;
            } else if (arg0[1].equals("office")) {
                class211.field3797 = 1;
            } else if (arg0[1].equals("local")) {
                class211.field3797 = 2;
            } else {
                class9.method32(1);
            }
            if (arg0[2].equals("live")) {
                class171.field2886 = 0;
            } else if (arg0[2].equals("rc")) {
                class171.field2886 = 1;
            } else if (arg0[2].equals("wip")) {
                class171.field2886 = 2;
            } else {
                class9.method32(1);
            }
            if (arg0[4].equals("free")) {
                class105.field1519 = false;
            } else if (arg0[4].equals("members")) {
                class105.field1519 = true;
            } else {
                class9.method32(1);
            }
            if (arg0[5].equals("english")) {
                class71.field1002 = 0;
            } else if (arg0[5].equals("german")) {
                class242.method1646(7);
                class71.field1002 = 1;
            } else {
                class9.method32(1);
            }
            if (arg0[6].equals("game0")) {
                class158.field2546 = 0;
            } else if (arg0[6].equals("game1")) {
                class158.field2546 = 1;
            } else {
                class9.method32(1);
            }
            if (arg0.length != 8) {
                class201.field3562 = false;
            } else if (arg0[7].equals("safemode")) {
                class201.field3562 = true;
            } else {
                class9.method32(1);
            }
            class6.field47 = "127.0.0.1";
            class171.field2885 = class152.field2450;
            class22.field279 = 0;
            client var1 = new client();
            var1.method712(class171.field2886 + 32, 503, 765, -16319, "runescape", 502, 27);
            class229.field4079.setLocation(40, 40);
        } catch (Exception var3) {
            class165.method1054(35, null, var3);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Lec;)I")
    public static final int method614(class178 arg0) {
        class206 var1 = (class206) class189.field3299.method1551(32768, ((long) arg0.field3117 << 32) + (long) arg0.field3062);
        return var1 == null ? arg0.field3106 : var1.field3702;
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public static void method615(int arg0) {
        field1468 = null;
        if (arg0 >= -75) {
            field1468 = null;
        }
        field1459 = null;
        field1458 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILqj;Ljava/awt/Color;Z)V")
    private static final void method616(int arg0, int arg1, class196 arg2, Color arg3, boolean arg4) {
        field1455++;
        try {
            Graphics var5 = class52.field643.getGraphics();
            if (class64.field887 == null) {
                class64.field887 = new Font("Helvetica", 1, 13);
                class243.field4335 = class52.field643.getFontMetrics(class64.field887);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class249.field4407, class61.field815);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class44.field511 == null) {
                    class44.field511 = class52.field643.createImage(304, 34);
                }
                Graphics var6 = class44.field511.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(class64.field887);
                var6.setColor(Color.white);
                arg2.method1328((304 - arg2.method1318((byte) 5, class243.field4335)) / 2, 22, var6, (byte) -37);
                var5.drawImage(class44.field511, class249.field4407 / 2 - 152, class61.field815 / 2 - 18, null);
                if (arg1 != 20) {
                    field1458 = null;
                }
            } catch (Exception var9) {
                int var7 = class249.field4407 / 2 - 152;
                int var8 = class61.field815 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 - -1, 301, 31);
                var5.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var5.setFont(class64.field887);
                var5.setColor(Color.white);
                arg2.method1328((304 - arg2.method1318((byte) 5, class243.field4335)) / 2 + var7, var8 + 22, var5, (byte) -44);
            }
            if (class3.field20 != null) {
                var5.setFont(class64.field887);
                var5.setColor(Color.white);
                class3.field20.method1328(class249.field4407 / 2 - class3.field20.method1318((byte) 5, class243.field4335) / 2, class61.field815 / 2 + -26, var5, (byte) -123);
            }
        } catch (Exception var10) {
            class52.field643.repaint();
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field1470++;
        if (!this.method720(-124)) {
            return;
        }
        class158.field2549 = Integer.parseInt(this.getParameter("worldid"));
        class171.field2886 = Integer.parseInt(this.getParameter("modewhat"));
        class211.field3797 = Integer.parseInt(this.getParameter("modewhere"));
        String var1 = this.getParameter("safemode");
        if (var1 != null && var1.equals("1")) {
            class201.field3562 = true;
        } else {
            class201.field3562 = false;
        }
        String var2 = this.getParameter("members");
        if (var2 != null && var2.equals("1")) {
            class105.field1519 = true;
        } else {
            class105.field1519 = false;
        }
        String var3 = this.getParameter("lang");
        if (var3 != null && var3.equals("1")) {
            class242.method1646(7);
            class71.field1002 = 1;
        }
        String var4 = this.getParameter("game");
        if (var4 != null && var4.equals("1")) {
            class158.field2546 = 1;
        } else {
            class158.field2546 = 0;
        }
        try {
            class47.field569 = Integer.parseInt(this.getParameter("js"));
            class48.field579 = Integer.parseInt(this.getParameter("plug"));
            class22.field279 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var9) {
        }
        class171.field2885 = class135.field1971.method1309(0, this);
        if (class171.field2885 == null) {
            class171.field2885 = class152.field2450;
        }
        String var5 = this.getParameter("advert");
        if (var5 != null) {
            byte[] var6 = var5.getBytes();
            class196 var7 = class16.method88(var6.length, 0, var6, 0);
            boolean var8 = class56.method349(var7, 8003);
        }
        class6.field47 = this.getCodeBase().getHost();
        this.method715((byte) -46, 765, 503, 502, class171.field2886 + 32);
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method617(int arg0) {
        if (arg0 != 0) {
            this.method620((byte) -78);
        }
        field1467++;
        if (class134.field1928 != null) {
            class134.field1928.detach();
        }
        if (class168.field2844 != null) {
            class168.field2844.method1394((byte) 64, this.getClass());
        }
        if (class150.field2398 != null) {
            class150.field2398.field27 = false;
        }
        class150.field2398 = null;
        if (class194.field3408 != null) {
            class194.field3408.method481(true);
            class194.field3408 = null;
        }
        class66.method425(class52.field643, -3408);
        class225.method1521((byte) -96, class52.field643);
        if (class104.field1506 != null) {
            class104.field1506.method14(true, class52.field643);
        }
        class86.method541((byte) -114);
        class143.method884(1);
        class104.field1506 = null;
        if (class5.field35 != null) {
            class5.field35.method1097(-15693);
        }
        if (class142.field2180 != null) {
            class142.field2180.method1097(arg0 ^ 0xFFFFC2B3);
        }
        class154.method982(true);
        class12.method56(false);
        try {
            if (class150.field2402 != null) {
                class150.field2402.method1707(arg0);
            }
            if (class30.field381 != null) {
                for (int var2 = 0; var2 < class30.field381.length; var2++) {
                    if (class30.field381[var2] != null) {
                        class30.field381[var2].method1707(0);
                    }
                }
            }
            if (class149.field2393 != null) {
                class149.field2393.method1707(0);
            }
            if (class12.field134 != null) {
                class12.field134.method1707(0);
            }
        } catch (IOException var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Lec;)Z")
    public static final boolean method618(class178 arg0) {
        if (class236.field4195) {
            if (method614(arg0) != 0) {
                return false;
            }
            if (arg0.field3123 == 0) {
                return false;
            }
        }
        return arg0.field3116;
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    private final void method619(int arg0) {
        field1465++;
        if (class72.field1030 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class183.method1195((byte) 125);
            if (class146.field2311 == 0L) {
                class146.field2311 = var4;
            }
            if (var3 > 16384 && var4 - class146.field2311 < 5000L) {
                if (var4 - class244.field4351 > 1000L) {
                    System.gc();
                    class244.field4351 = var4;
                }
                class235.field4170 = class136.field1973;
                class221.field3989 = 5;
            } else {
                class235.field4170 = class111.field1603;
                class72.field1030 = 10;
                class221.field3989 = 5;
            }
        } else if (class72.field1030 == 10) {
            class21.method115(4, 104, 104, 25);
            for (int var6 = 0; var6 < 4; var6++) {
                class188.field3298[var6] = new class153(104, 104);
            }
            class235.field4170 = class213.field3821;
            class72.field1030 = 30;
            class221.field3989 = 10;
        } else if (class72.field1030 == 30) {
            class194.field3414 = class50.method262(arg0 - 104, true, 0, false, true);
            class76.field1088 = class50.method262(arg0 + 103, true, 1, false, true);
            class171.field2875 = class50.method262(85, false, 2, true, true);
            class186.field3271 = class50.method262(arg0 ^ 0x41, true, 3, false, true);
            class230.field4091 = class50.method262(-59, true, 4, false, true);
            class144.field2219 = class50.method262(arg0 ^ 0xFFFFFFD0, true, 5, true, true);
            class62.field847 = class50.method262(arg0 ^ 0x43, true, 6, true, false);
            class40.field445 = class50.method262(85, true, 7, false, true);
            class196.field3439 = class50.method262(-31, true, 8, false, true);
            class258.field4518 = class50.method262(arg0 - 125, true, 9, false, true);
            class54.field673 = class50.method262(-55, true, 10, false, true);
            class243.field4334 = class50.method262(-66, true, 11, false, true);
            class149.field2385 = class50.method262(arg0 + 89, true, 12, false, true);
            class160.field2573 = class50.method262(-47, true, 13, false, true);
            class29.field360 = class50.method262(-34, true, 14, false, false);
            class52.field647 = class50.method262(80, true, 15, false, true);
            class18.field213 = class50.method262(95, true, 16, false, true);
            class192.field3377 = class50.method262(arg0 - 111, true, 17, false, true);
            class183.field3221 = class50.method262(-82, true, 18, false, true);
            class224.field4013 = class50.method262(82, true, 19, false, true);
            class152.field2447 = class50.method262(93, true, 20, false, true);
            class198.field3512 = class50.method262(84, true, 21, false, true);
            class174.field2934 = class50.method262(96, true, 22, false, true);
            class206.field3705 = class50.method262(-66, true, 23, true, true);
            class152.field2448 = class50.method262(98, true, 24, false, true);
            class39.field441 = class50.method262(118, true, 25, false, true);
            class78.field1130 = class50.method262(-70, true, 26, true, true);
            class221.field3989 = 15;
            class235.field4170 = class135.field1950;
            class72.field1030 = 40;
        } else if (class72.field1030 == 40) {
            byte var7 = 0;
            int var8 = var7 + class194.field3414.method588(false) * 4 / 100;
            int var9 = var8 + class76.field1088.method588(false) * 4 / 100;
            int var10 = var9 + class171.field2875.method588(false) / 100;
            int var11 = var10 + class186.field3271.method588(false) * 2 / 100;
            int var12 = var11 + class230.field4091.method588(false) * 6 / 100;
            int var13 = var12 + class144.field2219.method588(false) * 4 / 100;
            int var14 = var13 + class62.field847.method588(false) * 2 / 100;
            int var15 = var14 + class40.field445.method588(false) * 50 / 100;
            int var16 = var15 + class196.field3439.method588(false) * 2 / 100;
            int var17 = var16 + class258.field4518.method588(false) * 2 / 100;
            int var18 = var17 + class54.field673.method588(false) * 2 / 100;
            int var19 = var18 + class243.field4334.method588(false) * 2 / 100;
            int var20 = var19 + class149.field2385.method588(false) * 2 / 100;
            int var21 = var20 + class160.field2573.method588(false) * 2 / 100;
            int var22 = var21 + class29.field360.method588(false) * 2 / 100;
            int var23 = var22 + class52.field647.method588(false) * 2 / 100;
            int var24 = var23 + class18.field213.method588(false) / 100;
            int var25 = var24 + class192.field3377.method588(false) / 100;
            int var26 = var25 + class183.field3221.method588(false) / 100;
            int var27 = var26 + class224.field4013.method588(false) / 100;
            int var28 = var27 + class152.field2447.method588(false) / 100;
            int var29 = var28 + class198.field3512.method588(false) / 100;
            int var30 = var29 + class174.field2934.method588(false) / 100;
            int var31 = var30 + class206.field3705.method588(false) / 100;
            int var32 = var31 + class152.field2448.method588(false) / 100;
            int var33 = var32 + class39.field441.method588(false) / 100;
            int var34 = var33 + class78.field1130.method588(false) / 100;
            if (var34 == 100) {
                class221.field3989 = 20;
                class235.field4170 = class144.field2215;
                class24.method140(-101, class196.field3439);
                class91.method562((byte) -54, class196.field3439);
                class175.method1143(class196.field3439, 0);
                class76.method478(class196.field3439, -30);
                class72.field1030 = 45;
            } else {
                if (var34 != 0) {
                    class235.field4170 = class93.method572(-88, new class196[] { class220.field3971, class163.method1029(var34, false), class27.field337 });
                }
                class221.field3989 = 20;
            }
        } else if (class72.field1030 == 45) {
            class28.method155((byte) 54, 22050, class45.field543, 2);
            class144.field2226 = new class165();
            class144.field2226.method1041((byte) -64, 128, 9);
            class5.field35 = class108.method647(0, class52.field643, (byte) -51, class168.field2844, 22050);
            class5.field35.method1092(class144.field2226, -3763);
            class220.method1502(class29.field360, class52.field647, class144.field2226, class230.field4091, false);
            class142.field2180 = class108.method647(1, class52.field643, (byte) -51, class168.field2844, 2048);
            class161.field2589 = new class114();
            class142.field2180.method1092(class161.field2589, -3763);
            class96.field1411 = new class6(22050, class216.field3884);
            class108.field1541 = class62.field847.method833((byte) -120, class157.field2538);
            class72.field1030 = 50;
            class235.field4170 = class252.field4471;
            class221.field3989 = 30;
        } else if (class72.field1030 == 50) {
            int var35 = class120.method746((byte) -54, class160.field2573, class196.field3439);
            int var36 = class57.method368(-54);
            if (var35 < var36) {
                class235.field4170 = class93.method572(-80, new class196[] { class251.field4440, class163.method1029(var35 * 100 / var36, false), class27.field337 });
                class221.field3989 = 35;
            } else {
                class235.field4170 = class230.field4096;
                class72.field1030 = 60;
                class221.field3989 = 35;
            }
        } else if (class72.field1030 == 60) {
            int var37 = class193.method1275(arg0 ^ 0x4041, class196.field3439);
            int var38 = class180.method1183((byte) 123);
            if (var38 > var37) {
                class235.field4170 = class93.method572(-80, new class196[] { class104.field1510, class163.method1029(var37 * 100 / var38, false), class27.field337 });
                class221.field3989 = 40;
            } else {
                class235.field4170 = class258.field4523;
                class221.field3989 = 40;
                class72.field1030 = 65;
            }
        } else if (class72.field1030 == 65) {
            class67.method434((byte) -103, class160.field2573, class196.field3439);
            class221.field3989 = 45;
            class235.field4170 = class103.field1494;
            class180.method1182((byte) -101, 5);
            class72.field1030 = 70;
        } else if (arg0 == 8) {
            if (class72.field1030 == 70) {
                class171.field2875.method824((byte) 68);
                byte var39 = 0;
                int var40 = var39 + class171.field2875.method825(arg0 ^ 0xFFFFFFF7);
                class18.field213.method824((byte) 68);
                int var41 = var40 + class18.field213.method825(-1);
                class192.field3377.method824((byte) 68);
                int var42 = var41 + class192.field3377.method825(arg0 ^ 0xFFFFFFF7);
                class183.field3221.method824((byte) 68);
                int var43 = var42 + class183.field3221.method825(arg0 - 9);
                class224.field4013.method824((byte) 68);
                int var44 = var43 + class224.field4013.method825(-1);
                class152.field2447.method824((byte) 68);
                int var45 = var44 + class152.field2447.method825(arg0 ^ 0xFFFFFFF7);
                class198.field3512.method824((byte) 68);
                int var46 = var45 + class198.field3512.method825(-1);
                class174.field2934.method824((byte) 68);
                int var47 = var46 + class174.field2934.method825(-1);
                class152.field2448.method824((byte) 68);
                int var48 = var47 + class152.field2448.method825(-1);
                class39.field441.method824((byte) 68);
                int var49 = var48 + class39.field441.method825(-1);
                if (var49 < 1000) {
                    class235.field4170 = class93.method572(arg0 - 121, new class196[] { class258.field4511, class163.method1029(var49 / 10, false), class27.field337 });
                    class221.field3989 = 50;
                } else {
                    class60.method385(class171.field2875, -9595);
                    class104.method637(-22, class171.field2875);
                    class35.method183(1, class171.field2875);
                    class220.method1501(class171.field2875, class40.field445, true);
                    class27.method153(class105.field1519, class40.field445, true, class18.field213);
                    class16.method85(class183.field3221, -117, class40.field445);
                    class64.method403(false, class80.field1152, class224.field4013, class105.field1519, class40.field445);
                    class11.method50(class171.field2875, (byte) -60);
                    class221.method1505(class194.field3414, class76.field1088, (byte) 115, class152.field2447);
                    class49.method259(class40.field445, class198.field3512, (byte) 114);
                    class60.method384(arg0 ^ 0xFFFFFF98, class174.field2934);
                    class177.method1150(true, class171.field2875);
                    class197.method1340(class196.field3439, class186.field3271, class160.field2573, class40.field445, arg0 + 460521274);
                    class148.method922(class171.field2875, (byte) 56);
                    class21.method117(arg0 - 111, class192.field3377);
                    class223.method1512(new class160(), class39.field441, class152.field2448, -29668);
                    class87.method544(class152.field2448, -110, class39.field441);
                    class235.field4170 = class168.field2804;
                    class221.field3989 = 50;
                    class111.method671((byte) 76);
                    class72.field1030 = 80;
                }
            } else if (class72.field1030 == 80) {
                int var50 = class49.method261(arg0 - 6, class196.field3439);
                int var51 = class95.method591(false);
                if (var51 > var50) {
                    class235.field4170 = class93.method572(-94, new class196[] { class27.field338, class163.method1029(var50 * 100 / var51, false), class27.field337 });
                    class221.field3989 = 60;
                } else {
                    class47.method254(arg0 - 16288, class196.field3439);
                    class221.field3989 = 60;
                    class235.field4170 = class25.field316;
                    class72.field1030 = 90;
                }
            } else if (class72.field1030 == 90) {
                if (class78.field1130.method824((byte) 68)) {
                    class185 var52 = new class185(class258.field4518, class78.field1130, class196.field3439, 20, !class71.field1004);
                    class15.method77(var52);
                    if (class50.field602 == 1) {
                        class15.method71(0.9F);
                    }
                    if (class50.field602 == 2) {
                        class15.method71(0.8F);
                    }
                    if (class50.field602 == 3) {
                        class15.method71(0.7F);
                    }
                    if (class50.field602 == 4) {
                        class15.method71(0.6F);
                    }
                    class235.field4170 = class76.field1091;
                    class72.field1030 = 100;
                    class221.field3989 = 70;
                } else {
                    class235.field4170 = class93.method572(-85, new class196[] { class238.field4244, class163.method1029(class78.field1130.method825(-1), false), class27.field337 });
                    class221.field3989 = 70;
                }
            } else if (class72.field1030 == 100) {
                if (class156.method985((byte) -118, class196.field3439)) {
                    class72.field1030 = 110;
                }
            } else if (class72.field1030 == 110) {
                class150.field2398 = new class3();
                class168.field2844.method1398(10, arg0 ^ 0x8, class150.field2398);
                class72.field1030 = 120;
                class221.field3989 = 75;
                class235.field4170 = class169.field2855;
            } else if (class72.field1030 == 120) {
                if (class54.field673.method851(class165.field2688, (byte) -79, class152.field2450)) {
                    class1 var53 = new class1(class54.field673.method847(class165.field2688, true, class152.field2450));
                    class81.method509(-1, var53);
                    class72.field1030 = 130;
                    class221.field3989 = 80;
                    class235.field4170 = class7.field72;
                } else {
                    class235.field4170 = class93.method572(arg0 ^ 0xFFFFFF81, new class196[] { class146.field2305, class156.field2518 });
                    class221.field3989 = 80;
                }
            } else if (class72.field1030 == 130) {
                if (!class186.field3271.method824((byte) 68)) {
                    class235.field4170 = class93.method572(-83, new class196[] { class229.field4083, class163.method1029(class186.field3271.method825(-1) * 4 / 5, false), class27.field337 });
                    class221.field3989 = 85;
                } else if (!class149.field2385.method824((byte) 68)) {
                    class235.field4170 = class93.method572(-63, new class196[] { class229.field4083, class163.method1029(class149.field2385.method825(-1) / 6 + 80, false), class27.field337 });
                    class221.field3989 = 85;
                } else if (class160.field2573.method824((byte) 68)) {
                    class235.field4170 = class243.field4314;
                    class72.field1030 = 140;
                    class221.field3989 = 100;
                } else {
                    class235.field4170 = class93.method572(arg0 ^ 0xFFFFFF9F, new class196[] { class229.field4083, class163.method1029(class160.field2573.method825(arg0 ^ 0xFFFFFFF7) / 20 + 96, false), class27.field337 });
                    class221.field3989 = 85;
                }
            } else if (class72.field1030 == 140) {
                class120.field1731 = class186.field3271.method833((byte) -87, class136.field1989);
                class144.field2219.method848(true, (byte) -113, false);
                class62.field847.method848(true, (byte) -123, true);
                class196.field3439.method848(true, (byte) -111, true);
                class160.field2573.method848(true, (byte) -122, true);
                class54.field673.method848(true, (byte) -116, true);
                class186.field3271.method848(true, (byte) -116, true);
                if (class205.field3686 < 96000000L) {
                    class192.field3378 = true;
                }
                class180.method1182((byte) -101, 8);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method620(byte arg0) {
        field1456++;
        if (class56.field741 == 1000) {
            return;
        }
        class171.field2879++;
        if (class171.field2879 % 1000 == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class49.field591 = var2.get(11) * 600 + var2.get(12) * 10 + var2.get(13) / 6;
            class221.field3987.setSeed((long) class49.field591);
        }
        this.method628(2);
        class219.method1492(false);
        class242.method1645((byte) 112);
        class181.method1187((byte) 113);
        if (arg0 != -38) {
            this.method628(8);
        }
        class113.method684(arg0 ^ 0xFFFFFFBD);
        class82.method514(-122);
        if (class104.field1506 != null) {
            int var3 = class104.field1506.method16((byte) -111);
            class240.field4266 = var3;
        }
        if (class56.field741 == 0) {
            this.method619(8);
            class175.method1144((byte) 113);
        } else if (class56.field741 == 5) {
            this.method619(8);
            class175.method1144((byte) 27);
        } else if (class56.field741 == 10) {
            this.method629(false);
            class168.method1090((byte) 102);
            return;
        } else if (class56.field741 == 20) {
            this.method629(false);
            class99.method603(false);
        } else if (class56.field741 == 25) {
            class241.method1640(0);
        } else if (class56.field741 == 28) {
            class241.method1640(arg0 ^ 0xFFFFFFDA);
            class168.method1090((byte) 102);
        }
        if (class56.field741 == 30) {
            class185.method1211(97);
        } else if (class56.field741 == 10) {
            this.method629(false);
        } else if (class56.field741 == 40) {
            class99.method603(false);
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method621(int arg0) {
        field1461++;
        if (arg0 != -29883) {
            method613(null, -11, -113, 14, -1, -115, 123, 36);
        }
        if (class56.field741 == 1000) {
            return;
        }
        boolean var2 = class111.method660((byte) -128);
        if (var2 && class102.field1476 && class5.field35 != null) {
            class5.field35.method1094((byte) 102);
        }
        if (class180.field3179 && (class56.field741 == 30 || class56.field741 == 10)) {
            class180.method1180(2);
        }
        boolean var3 = false;
        if (class30.field372) {
            class30.field372 = false;
            var3 = true;
        }
        if (class56.field741 == 0) {
            method616(class221.field3989, 20, class235.field4170, null, var3);
        } else if (class56.field741 == 5) {
            class130.method796(class23.field292, false);
        } else if (class56.field741 == 10 || class56.field741 == 20) {
            class108.method650(23789);
        } else if (class56.field741 == 25 || class56.field741 == 28) {
            if (class77.field1113 == 1) {
                if (class217.field3896 > class71.field1008) {
                    class71.field1008 = class217.field3896;
                }
                int var4 = (class71.field1008 - class217.field3896) * 50 / class71.field1008;
                class104.method636((byte) 34, false, class93.method572(arg0 ^ 0x74CC, new class196[] { class242.field4300, class142.field2177, class163.method1029(var4, false), class110.field1569 }));
            } else if (class77.field1113 == 2) {
                if (class64.field879 > class187.field3287) {
                    class187.field3287 = class64.field879;
                }
                int var5 = (class187.field3287 - class64.field879) * 50 / class187.field3287 + 50;
                class104.method636((byte) 34, false, class93.method572(-72, new class196[] { class242.field4300, class142.field2177, class163.method1029(var5, false), class110.field1569 }));
            } else {
                class104.method636((byte) 34, false, class242.field4300);
            }
        } else if (class56.field741 == 30) {
            class144.method893(1002);
        } else if (class56.field741 == 40) {
            class104.method636((byte) 34, false, class93.method572(-75, new class196[] { class125.field1782, class67.field954, class80.field1153 }));
        }
        if ((class56.field741 == 30 || class56.field741 == 10) && class138.field2132 == 0 && !var3) {
            try {
                Graphics var6 = class52.field643.getGraphics();
                for (int var7 = 0; var7 < class46.field555; var7++) {
                    if (class86.field1271[var7]) {
                        class43.field490.method206(var6, class64.field886[var7], class29.field368[var7], 63, class138.field2122[var7], class168.field2828[var7]);
                        class86.field1271[var7] = false;
                    }
                }
            } catch (Exception var11) {
                class52.field643.repaint();
            }
        } else if (class56.field741 > 0) {
            try {
                Graphics var8 = class52.field643.getGraphics();
                class43.field490.method202(false, var8, 0, 0);
                for (int var9 = 0; var9 < class46.field555; var9++) {
                    class86.field1271[var9] = false;
                }
            } catch (Exception var10) {
                class52.field643.repaint();
            }
        }
        if (class192.field3378) {
            class181.method1185(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    private final void method622(int arg0, byte arg1) {
        if (arg1 > -6) {
            return;
        }
        field1452++;
        class244.field4353 = 0;
        class203.field3666 = null;
        class258.field4519 = null;
        if (class56.field698 == class218.field3909) {
            class56.field698 = class258.field4522;
        } else {
            class56.field698 = class218.field3909;
        }
        class243.field4311++;
        if (class243.field4311 >= 2 && (arg0 == 7 || arg0 == 9)) {
            if (class56.field741 <= 5) {
                this.method709(48, "js5connect_full");
                class56.field741 = 1000;
            } else {
                class35.field424 = 3000;
            }
        } else if (class243.field4311 >= 2 && arg0 == 6) {
            this.method709(48, "js5connect_outofdate");
            class56.field741 = 1000;
        } else if (class243.field4311 >= 4) {
            if (class56.field741 <= 5) {
                this.method709(48, "js5connect");
                class56.field741 = 1000;
            } else {
                class35.field424 = 3000;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method623(int arg0) {
        field1464++;
        method615(-119);
        class196.method1288(-1);
        class118.method708((byte) -37);
        class187.method1224((byte) -123);
        class144.method894((byte) 65);
        class3.method8(76);
        class70.method452(-3628);
        class56.method334(-70);
        class77.method485(5688);
        class95.method586(Integer.MAX_VALUE);
        class252.method1698(true);
        class69.method443(-121);
        class164.method1031(121);
        class179.method1177((byte) 114);
        class243.method1650(-86);
        class153.method959((byte) 38);
        class178.method1153(127);
        class134.method807((byte) 38);
        class231.method1550(90);
        class213.method1470((byte) 127);
        class8.method30(0);
        class58.method374(-117);
        class43.method222(91);
        class165.method1068(20688);
        class168.method1101(0);
        class6.method25((byte) -74);
        class66.method418(74);
        class149.method931(29461);
        class61.method387(4);
        class234.method1575(false);
        class111.method658(0);
        class63.method396(-24206);
        class130.method795(302);
        class195.method1284(-26788);
        class224.method1518(-97);
        class22.method131(0);
        class166.method1072(115);
        class201.method1355(65535);
        class158.method996(false);
        class217.method1485(-14068);
        class194.method1278(22055);
        class105.method640(-1);
        class145.method898(-16012);
        class80.method499((byte) -107);
        class197.method1341((byte) 116);
        class147.method919(0);
        class136.method836((byte) 124);
        class227.method1536((byte) 121);
        class208.method1426();
        class33.method171(false);
        class202.method1361((byte) -92);
        class167.method1078();
        class154.method980(0);
        class82.method513((byte) 95);
        class183.method1194((byte) 48);
        class27.method152(-13005);
        class102.method630(-2608);
        class229.method1540(957);
        class173.method1134((byte) 35);
        class24.method138(-110);
        class14.method63(false);
        class212.method1468(false);
        class190.method1246();
        int var2 = 122 % ((arg0 - 62) / 59);
        class5.method18((byte) -116);
        class200.method1351((byte) 33);
        class175.method1141(2047);
        class258.method1734(false);
        class221.method1506(true);
        class7.method29((byte) -105);
        class116.method705(-62);
        class159.method1001((byte) -123);
        class129.method789(5);
        class140.method866();
        class93.method573(true);
        class9.method38(0);
        class185.method1208(9174);
        class15.method83();
        class55.method301();
        class186.method1222(11309);
        class218.method1491((byte) -86);
        class226.method1526(0);
        class64.method401(0);
        class181.method1189((byte) -102);
        class146.method913((byte) -34);
        class188.method1228((byte) 66);
        class38.method197();
        class60.method381(1);
        class253.method1712(-26490);
        class122.method749(-6601);
        class182.method1192(-1);
        class220.method1498(-1);
        class124.method756();
        class237.method1589((byte) 122);
        class225.method1525(128);
        class192.method1269((byte) 116);
        class28.method154((byte) -38);
        class246.method1676(-32587);
        class17.method95(true);
        class12.method57(false);
        class25.method143(-119);
        class203.method1377(77);
        class108.method652((byte) -26);
        class87.method545((byte) -32);
        class13.method59((byte) 106);
        class209.method1449(-22159);
        class126.method781((byte) -126);
        class161.method1009(100);
        class235.method1582((byte) -107);
        class199.method1343(0);
        class21.method121(true);
        class160.method1004(-117);
        class44.method232((byte) -115);
        class1.method2(-2);
        class47.method250(-71);
        class67.method428(-11777);
        class174.method1136(122);
        class35.method181(26716);
        class157.method991((byte) 16);
        class156.method987(125);
        class103.method634(-116);
        class52.method276(2);
        class39.method199(-51);
        class172.method1122(122);
        class249.method1691(20259);
        class72.method459(-1);
        class98.method600(256);
        class100.method608((byte) -126);
        class120.method747(false);
        class128.method787();
        class16.method87(255);
        class155.method983(-105);
        class29.method159(-86);
        class51.method272(8578);
        class232.method1556(18780);
        class206.method1404(-26358);
        class88.method549((byte) -75);
        class151.method950(1370225222);
        class109.method654(true);
        class11.method51(false);
        class123.method752((byte) 99);
        class49.method260(-109);
        class110.method656((byte) -19);
        class40.method203(93);
        class211.method1459(true);
        class150.method945(-22061);
        class34.method178(false);
        class210.method1455(128);
        class138.method865(-126);
        class121.method748();
        class204.method1384();
        class250.method1692();
        class141.method871();
        class215.method1478(16);
        class54.method280(1);
        class42.method217(-6913);
        class57.method372(-103);
        class162.method1019();
        class170.method1113();
        class256.method1721(0);
        class135.method816((byte) 102);
        class86.method542(-32508);
        class94.method578(10620);
        class19.method105((byte) 100);
        class20.method107(0);
        class46.method246(-120);
        class41.method212(-99);
        class23.method136(0);
        class83.method519(15515);
        class163.method1027(-19202);
        class84.method523((byte) 41);
        class101.method609(115);
        class31.method166(126);
        class193.method1276((byte) -87);
        class236.method1585((byte) -24);
        class131.method800((byte) -113);
        class76.method476(-13);
        class189.method1235(0);
        class30.method163((byte) -107);
        class78.method488((byte) -57);
        class73.method466((byte) 103);
        class238.method1594(-711649727);
        class176.method1146(32768);
        class240.method1638((byte) -79);
        class198.method1342((byte) -91);
        class148.method928(-777239092);
        class230.method1543(false);
        class171.method1117(6016);
        class90.method558((byte) -35);
        class133.method804((byte) 15);
        class48.method256(-31931);
        class216.method1482(true);
        class96.method599(-102);
        class71.method455((byte) 7);
        class242.method1648((byte) 52);
        class18.method100(0);
        class142.method880(true);
        class74.method472((byte) -23);
        class53.method279((byte) 109);
        class219.method1493(false);
        class125.method775(0);
        class104.method635(16777215);
        class65.method410(-65);
        class245.method1669((byte) -47);
        class99.method602((byte) 26);
        class45.method240(-21595);
        class92.method568(16659);
        class91.method559(true);
        class152.method956(100);
        class132.method801(-11553);
        class143.method888(-118);
        class177.method1151((byte) 126);
        class169.method1104(-1);
        class223.method1514(-92);
        class50.method263(124);
        class10.method47(false);
        class106.method642((byte) -103);
        class127.method782(122);
        class247.method1683((byte) -46);
        class214.method1473((byte) 19);
        class251.method1693(1040762640);
        class244.method1667((byte) -83);
        class62.method391((byte) -70);
        class85.method534(16);
        if (class118.field1727) {
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    private final void method624(int arg0) {
        field1466++;
        if (class53.field666 >= 4) {
            this.method709(48, "js5crc");
            class56.field741 = 1000;
            return;
        }
        if (class165.field2686 >= 4) {
            if (class56.field741 <= 5) {
                this.method709(48, "js5io");
                class56.field741 = 1000;
                return;
            }
            class35.field424 = 3000;
            class165.field2686 = 3;
        }
        if (class35.field424-- > 0) {
            return;
        }
        try {
            if (arg0 != 70) {
                method626(null);
            }
            if (class244.field4353 == 0) {
                class203.field3666 = class168.field2844.method1397(class56.field698, (byte) -40, class6.field47);
                class244.field4353++;
            }
            if (class244.field4353 == 1) {
                if (class203.field3666.field2140 == 2) {
                    this.method622(-1, (byte) -108);
                    return;
                }
                if (class203.field3666.field2140 == 1) {
                    class244.field4353++;
                }
            }
            if (class244.field4353 == 2) {
                class258.field4519 = new class77((Socket) class203.field3666.field2135, class168.field2844);
                class56 var2 = new class56(5);
                var2.method329((byte) 84, 15);
                var2.method355((byte) 66, 502);
                class258.field4519.method484(var2.field693, 5, 0, 3);
                class244.field4353++;
                class130.field1854 = class183.method1195((byte) 126);
            }
            if (class244.field4353 == 3) {
                if (class56.field741 <= 5 || class258.field4519.method479(arg0 + 29930) > 0) {
                    int var3 = class258.field4519.method480(75);
                    if (var3 != 0) {
                        this.method622(var3, (byte) -90);
                        return;
                    }
                    class244.field4353++;
                } else if (class183.method1195((byte) 118) - class130.field1854 > 30000L) {
                    this.method622(-2, (byte) -74);
                    return;
                }
            }
            if (class244.field4353 == 4) {
                class147.method918(-125, class258.field4519, class56.field741 > 20);
                class243.field4311 = 0;
                class244.field4353 = 0;
                class203.field3666 = null;
                class258.field4519 = null;
            }
        } catch (IOException var4) {
            this.method622(-3, (byte) -94);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z)V")
    public final void method625(boolean arg0) {
        field1463++;
        class28.method156(class201.field3562, 4334, class168.field2844);
        if (class158.field2546 == 1) {
            class199.field3533 = class52.field649;
            class146.field2294 = class146.field2295;
            class242.field4308 = class153.field2477;
            class34.field413 = class229.field4084;
        } else {
            class242.field4308 = class171.field2873;
            class199.field3533 = class116.field1678;
            class34.field413 = class109.field1552;
            class146.field2294 = class198.field3520;
        }
        class209.field3770 = class235.field4173 = class76.field1086 = class144.field2225 = new short[256];
        class218.field3909 = class211.field3797 == 0 ? 43594 : class158.field2549 + 40000;
        class56.field698 = class218.field3909;
        class258.field4522 = class211.field3797 == 0 ? 443 : class158.field2549 + 50000;
        if (!arg0) {
            field1468 = null;
        }
        class160.method1007(71);
        class45.method237(class52.field643, !arg0);
        class44.method233((byte) 125, class52.field643);
        class104.field1506 = class235.method1579(false);
        if (class104.field1506 != null) {
            class104.field1506.method15(class52.field643, 0);
        }
        class180.field3186 = class205.field3681;
        try {
            if (class168.field2844.field3689 != null) {
                class150.field2402 = new class252(class168.field2844.field3689, 5200, 0);
                for (int var2 = 0; var2 < 27; var2++) {
                    class30.field381[var2] = new class252(class168.field2844.field3694[var2], 6000, 0);
                }
                class149.field2393 = new class252(class168.field2844.field3690, 6000, 0);
                class147.field2317 = new class69(255, class150.field2402, class149.field2393, 500000);
                class12.field134 = new class252(class168.field2844.field3693, 24, 0);
                class168.field2844.field3690 = null;
                class168.field2844.field3693 = null;
                class168.field2844.field3689 = null;
                class168.field2844.field3694 = null;
            }
        } catch (IOException var3) {
            class12.field134 = null;
            class149.field2393 = null;
            class150.field2402 = null;
            class147.field2317 = null;
        }
        class3.field20 = class60.field800;
        if (class211.field3797 != 0) {
            class135.field1969 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Lec;)Lec;")
    public static final class178 method626(class178 arg0) {
        int var1 = class72.method463(method614(arg0), (byte) 122);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class201.method1356(arg0.field2990, (byte) -123);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)Lqj;")
    public static final class196 method627(long arg0, byte arg1) {
        field1454++;
        if (arg0 <= 0L || arg0 >= 6582952005840035281L) {
            return null;
        } else if (arg1 >= -123) {
            return null;
        } else if (arg0 % 37L == 0L) {
            return null;
        } else {
            long var3 = arg0;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg0 != 0L) {
                long var8 = arg0;
                arg0 /= 37L;
                var5--;
                var6[var5] = class49.field594[(int) (var8 - arg0 * 37L)];
            }
            class196 var7 = new class196();
            var7.field3448 = var6;
            var7.field3459 = var6.length;
            return var7;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    private final void method628(int arg0) {
        if (arg0 != 2) {
            field1459 = null;
        }
        field1457++;
        boolean var2 = class69.method445(arg0 - 126);
        if (!var2) {
            this.method624(70);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    private final void method629(boolean arg0) {
        class171.method1119((byte) -73, this);
        field1469++;
        for (class14.field157 = 0; class215.method1477(127) && class14.field157 < 128; class14.field157++) {
            class159.field2569[class14.field157] = class18.field219;
            class91.field1337[class14.field157] = class168.field2840;
        }
        class113.field1658++;
        if (class9.field103 != -1) {
            class220.method1504(0, 0, class61.field815, 0, false, class249.field4407, 0, class9.field103);
        }
        class92.field1341++;
        class67.method430((byte) 75);
        while (true) {
            class157 var2;
            class178 var3;
            class178 var4;
            do {
                var2 = (class157) class58.field792.method1665(3072);
                if (var2 == null) {
                    while (true) {
                        class157 var5;
                        class178 var6;
                        class178 var7;
                        do {
                            var5 = (class157) class27.field334.method1665(3072);
                            if (var5 == null) {
                                while (true) {
                                    class157 var8;
                                    class178 var9;
                                    class178 var10;
                                    do {
                                        var8 = (class157) class22.field277.method1665(3072);
                                        if (var8 == null) {
                                            if (class118.field1698 != null) {
                                                class21.method113(!arg0);
                                            }
                                            if (arg0) {
                                                main(null);
                                                return;
                                            }
                                            return;
                                        }
                                        var9 = var8.field2526;
                                        if (var9.field3062 < 0) {
                                            break;
                                        }
                                        var10 = class201.method1356(var9.field2990, (byte) 92);
                                    } while (var10 == null || var10.field3087 == null || var10.field3087.length <= var9.field3062 || var10.field3087[var9.field3062] != var9);
                                    class88.method550(var8, -70);
                                }
                            }
                            var6 = var5.field2526;
                            if (var6.field3062 < 0) {
                                break;
                            }
                            var7 = class201.method1356(var6.field2990, (byte) 89);
                        } while (var7 == null || var7.field3087 == null || var7.field3087.length <= var6.field3062 || var7.field3087[var6.field3062] != var6);
                        class88.method550(var5, -46);
                    }
                }
                var3 = var2.field2526;
                if (var3.field3062 < 0) {
                    break;
                }
                var4 = class201.method1356(var3.field2990, (byte) 98);
            } while (var4 == null || var4.field3087 == null || var4.field3087.length <= var3.field3062 || var4.field3087[var3.field3062] != var3);
            class88.method550(var2, -106);
        }
    }
}
