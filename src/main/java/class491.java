import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class491 {

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "Lvt;")
    public static class344 field6862 = new class344(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field6868 = 0;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field6867 = -1;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field6861;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field6863;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public static int field6864;

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public static int field6865;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
    public static int field6866;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(I)I")
    public static final int method2757(int arg0) {
        field6863++;
        class167 var1 = class301.field3918;
        boolean var2 = false;
        if (class428.field5845 != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class167.method904(0, 0, var3, true, null, null);
        }
        int var4 = -128 % ((-arg0 - 11) / 45);
        long var5 = class348.method2175(-120);
        for (int var7 = 0; var7 < 10000; var7++) {
            var1.method196(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var8 = (int) (class348.method2175(-123) - var5);
        var1.method974(-16777216, 1, 100, 0, 100, 0);
        if (var2) {
            var1.method920(-128);
        }
        return var8;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(Ldh;BII)Lws;")
    public static final class532 method2758(class321 arg0, byte arg1, int arg2, int arg3) {
        field6861++;
        int var4 = arg0.field4439 | arg3 << 8;
        class532 var5 = (class532) class356.field4983.method2995(791, (long) var4 << 16);
        if (arg1 < 72) {
            return null;
        } else if (var5 == null) {
            byte[] var6 = class29.field466.method2076(1, class29.field466.method2057(var4, 0));
            if (var6 == null) {
                int var8 = arg2 + 65536 << 8 | arg0.field4439;
                class532 var9 = (class532) class356.field4983.method2995(791, (long) var8 << 16);
                if (var9 != null) {
                    return var9;
                }
                byte[] var10 = class29.field466.method2076(1, class29.field466.method2057(var8, 0));
                if (var10 == null) {
                    int var12 = arg0.field4439 | 0xFFFF00;
                    class532 var13 = (class532) class356.field4983.method2995(791, (long) var12 << 16);
                    if (var13 != null) {
                        return var13;
                    }
                    byte[] var14 = class29.field466.method2076(1, class29.field466.method2057(var12, 0));
                    if (var14 == null) {
                        return null;
                    } else if (var14.length <= 1) {
                        return null;
                    } else {
                        class532 var15 = class604.method3465(var14, -35);
                        var15.field7429 = arg0;
                        class356.field4983.method2993(0, var15, (long) var12 << 16);
                        return var15;
                    }
                } else if (var10.length <= 1) {
                    return null;
                } else {
                    class532 var11 = class604.method3465(var10, 115);
                    var11.field7429 = arg0;
                    class356.field4983.method2993(0, var11, (long) var8 << 16);
                    return var11;
                }
            } else if (var6.length <= 1) {
                return null;
            } else {
                class532 var7 = class604.method3465(var6, -122);
                var7.field7429 = arg0;
                class356.field4983.method2993(0, var7, (long) var4 << 16);
                return var7;
            }
        } else {
            return var5;
        }
    }

    @OriginalMember(owner = "client!jn", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6864++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIIIBII)V")
    public static final void method2759(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        field6865++;
        int var7 = class512.field7133;
        class93.field1239 = 0;
        int[] var8 = class514.field7144;
        for (int var9 = 0; var9 < class551.field7652 + var7; var9++) {
            class626 var32 = null;
            class23 var33;
            if (var9 < var7) {
                var33 = class364.field5092[var8[var9]];
            } else {
                var33 = ((class480) class131.field1619.method3476((long) class286.field3739[var9 - var7], (byte) 28)).field6729;
                var32 = ((class585) var33).field8478;
                if (var32.field9085 != null) {
                    var32 = var32.method3607(false, class257.field3191);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field344 >= 0 && (class227.field2903 == var33.field386 || class147.field1899.field6358 == var33.field6358)) {
                class613.method3500(arg2, var33, arg1 >> 1, (byte) -121, arg3 >> 1, var33.method141(true), arg0);
                if (class155.field2011[0] >= 0) {
                    if (var33.field385 != null && (var9 >= var7 || class20.field296 == 0 || class20.field296 == 3 || class20.field296 == 1 && class552.method3096(((class20) var33).field257, (byte) 123)) && class93.field1239 < class149.field1934) {
                        class149.field1938[class93.field1239] = class627.field9137.method856(0, var33.field385) / 2;
                        class149.field1930[class93.field1239] = class155.field2011[0];
                        class149.field1936[class93.field1239] = class155.field2011[1];
                        class149.field1933[class93.field1239] = var33.field412;
                        class149.field1932[class93.field1239] = var33.field333;
                        class149.field1937[class93.field1239] = var33.field409;
                        class149.field1939[class93.field1239] = var33.field385;
                        class93.field1239++;
                    }
                    int var34 = class155.field2011[1] + arg6;
                    int var45;
                    if (var33.field348 || class7.field61 >= var33.field346) {
                        var45 = var34 - Math.max(class627.field9137.field2028, class372.field5172[0].method630());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var9 < var7) {
                            class20 var37 = class364.field5092[var8[var9]];
                            var38 = var33.method144((byte) 110).field5075;
                            if (var37.field271) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field9100;
                            if (var38 == -1) {
                                var38 = var33.method144((byte) 51).field5075;
                            }
                        }
                        class116[] var39 = class372.field5172;
                        if (var38 != -1) {
                            class116[] var40 = (class116[]) class624.field9027.method323((long) var38, -19814);
                            if (var40 == null) {
                                class295[] var41 = class295.method1803(class24.field433, var38, 0);
                                if (var41 != null) {
                                    var40 = new class116[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class301.field3918.method916(var41[var42], true);
                                    }
                                    class624.field9027.method316((long) var38, (byte) -112, var40);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var39.length <= var36) {
                            var36 = 1;
                        }
                        class116 var43 = var39[0];
                        class116 var44 = var39[var36];
                        var45 = var34 - Math.max(class627.field9137.field2028, var43.method630());
                        int var46 = class155.field2011[0] + arg5 - (var43.method637() >> 1);
                        int var47 = var43.method637() * var33.field384 / 255;
                        if (var33.field384 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method632(var46, var45);
                        class301.field3918.method939(var46, var45, var46 + var47, var45 - -var43.method630());
                        var44.method632(var46, var45);
                        class301.field3918.method977(arg5, arg6, arg5 + arg3, arg1 + arg6);
                    }
                    var45 -= 2;
                    if (!var33.field348) {
                        if (var33.field347 > class7.field61) {
                            class116 var48 = class80.field1078[var33.field375 ? 2 : 0];
                            class116 var49 = class80.field1078[var33.field375 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if ((var33 instanceof class585)) {
                                var51 = var32.field9090;
                                if (var51 == -1) {
                                    var51 = var33.method144((byte) 85).field5074;
                                }
                            } else {
                                var51 = var33.method144((byte) 29).field5074;
                            }
                            if (var51 != -1) {
                                class116[] var52 = (class116[]) class600.field8677.method323((long) var51, -19814);
                                if (var52 == null) {
                                    class295[] var53 = class295.method1803(class24.field433, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class116[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class301.field3918.method916(var53[var54], true);
                                        }
                                        class600.field8677.method316((long) var51, (byte) -115, var52);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var49 = var52[var33.field375 ? 3 : 1];
                                    var48 = var52[var33.field375 ? 2 : 0];
                                }
                            }
                            int var55 = var33.field347 - class7.field61;
                            int var56;
                            if (var55 <= var33.field343) {
                                var56 = var48.method637();
                            } else {
                                int var57 = var55 - var33.field343;
                                int var58 = var33.field370 == 0 ? 0 : (var33.field396 - var57) / var33.field370 * var33.field370;
                                var56 = var48.method637() * var58 / var33.field396;
                            }
                            int var59 = var48.method630();
                            var45 -= var59;
                            int var60 = class155.field2011[0] + arg5 - (var48.method637() >> 1);
                            var48.method632(var60, var45);
                            class301.field3918.method939(var60, var45, var60 + var56, var45 + var59);
                            var49.method632(var60, var45);
                            var45 -= 2;
                            class301.field3918.method977(arg5, arg6, arg3 + arg5, arg1 + arg6);
                        }
                        if (var7 > var9) {
                            class20 var62 = (class20) var33;
                            if (var62.field260 != -1) {
                                var45 -= 25;
                                class52.field695[var62.field260].method632(class155.field2011[0] + arg5 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field289 != -1) {
                                var45 -= 25;
                                class445.field6165[var62.field289].method632(class155.field2011[0] + arg5 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field9087 >= 0 && var32.field9087 < class445.field6165.length) {
                            class116 var61 = class445.field6165[var32.field9087];
                            var45 -= 25;
                            var61.method632(class155.field2011[0] + arg5 - (var61.method637() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class20) {
                        int var69 = 0;
                        class617[] var70 = class610.field8771;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class617 var76 = var70[var71];
                            if (var76 != null && var76.field8891 == 1 && class286.field3739[var9 - var7] == var76.field8889) {
                                class116 var77 = class428.field5842[var76.field8888];
                                if (var69 < var77.method630()) {
                                    var69 = var77.method630();
                                }
                                if ((class7.field61 % 20) < 10) {
                                    var77.method632(arg5 + class155.field2011[0] - 12, -var77.method630() + var45);
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class617[] var64 = class610.field8771;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class617 var67 = var64[var65];
                            if (var67 != null && var67.field8891 == 10 && var8[var9] == var67.field8889) {
                                class116 var68 = class428.field5842[var67.field8888];
                                if (var68.method630() > var63) {
                                    var63 = var68.method630();
                                }
                                var68.method632(arg5 + class155.field2011[0] - 12, var45 - var68.method630());
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class7.field61 < var33.field389[var73]) {
                            int var74 = var33.method141(true) / 2;
                            class613.method3500(arg2, var33, arg1 >> 1, (byte) -95, arg3 >> 1, var74, arg0);
                            if (class155.field2011[0] > -1) {
                                int var75 = class170.field2165[var33.field337[var73]].method637();
                                if (var73 == 1) {
                                    class155.field2011[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class155.field2011[1] -= 10;
                                    class155.field2011[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class155.field2011[0] += var75 - 9;
                                    class155.field2011[1] -= 10;
                                }
                                class170.field2165[var33.field337[var73]].method632(arg5 + class155.field2011[0] - (var75 >> 1), arg6 - 12 + class155.field2011[1]);
                                class332.field4584.method1618(-1, 0, arg6 + class155.field2011[1] + 3, (byte) -118, arg5 + class155.field2011[0] - 1, Integer.toString(var33.field319[var73]));
                            }
                        }
                    }
                }
            }
        }
        if (arg4 < 84) {
            return;
        }
        for (int var10 = 0; var10 < class372.field5182; var10++) {
            int var28 = class186.field2384[var10];
            class23 var29;
            if (var28 >= 2048) {
                var29 = ((class480) class131.field1619.method3476((long) (var28 - 2048), (byte) 28)).field6729;
            } else {
                var29 = class364.field5092[var28];
            }
            int var30 = class460.field6565[var10];
            class23 var31;
            if (var30 < 2048) {
                var31 = class364.field5092[var30];
            } else {
                var31 = ((class480) class131.field1619.method3476((long) (var30 - 2048), (byte) 28)).field6729;
            }
            class600.method3455(arg2, (byte) -30, --var29.field405, arg0, arg6, arg3, arg1, var31, var29, arg5);
        }
        int var11 = class627.field9137.field2037 + class627.field9137.field2028 + 2;
        for (int var12 = 0; var12 < class93.field1239; var12++) {
            int var13 = class149.field1930[var12];
            int var14 = class149.field1936[var12];
            int var15 = class149.field1938[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((class149.field1936[var27] - var11) < (var14 + 2) && var14 - var11 < class149.field1936[var27] + 2 && var13 - var15 < class149.field1930[var27] - -class149.field1938[var27] && (var13 + var15) > (class149.field1930[var27] - class149.field1938[var27]) && class149.field1936[var27] - var11 < var14) {
                        var16 = true;
                        var14 = class149.field1936[var27] - var11;
                    }
                }
            }
            class149.field1936[var12] = var14;
            String var17 = class149.field1939[var12];
            if (class425.field5751 == 0) {
                int var18 = 16776960;
                if (class149.field1933[var12] < 6) {
                    var18 = class386.field5381[class149.field1933[var12]];
                }
                if (class149.field1933[var12] == 6) {
                    var18 = class227.field2903 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class149.field1933[var12] == 7) {
                    var18 = (class227.field2903 % 20) >= 10 ? 65535 : 255;
                }
                if (class149.field1933[var12] == 8) {
                    var18 = class227.field2903 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class149.field1933[var12] == 9) {
                    int var19 = 150 - class149.field1937[var12];
                    if (var19 < 50) {
                        var18 = (var19 * 1280) + 16711680;
                    } else if (var19 < 100) {
                        var18 = 16384000 + 16776960 - var19 * 327680;
                    } else if (var19 < 150) {
                        var18 = var19 * 5 + 65280 - 500;
                    }
                }
                if (class149.field1933[var12] == 10) {
                    int var20 = 150 - class149.field1937[var12];
                    if (var20 < 50) {
                        var18 = (var20 * 5) + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 + 16384000 - (var20 * 327680);
                    } else if (var20 < 150) {
                        var18 = var20 * 327680 + 255 + 500 - (var20 * 5) - 32768000;
                    }
                }
                if (class149.field1933[var12] == 11) {
                    int var21 = 150 - class149.field1937[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 16777215 - (var21 - 100) * 327680;
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class149.field1932[var12] == 0) {
                    class95.field1282.method1618(var22, -16777216, arg6 + var14, (byte) -114, arg5 + var13, var17);
                }
                if (class149.field1932[var12] == 1) {
                    class95.field1282.method1614(var17, arg5 + var13, -47, var22, class227.field2903, -16777216, arg6 + var14);
                }
                if (class149.field1932[var12] == 2) {
                    class95.field1282.method1611(arg6 + var14, arg5 + var13, -61, var17, var22, -16777216, class227.field2903);
                }
                if (class149.field1932[var12] == 3) {
                    class95.field1282.method1608(var17, 150 - class149.field1937[var12], arg5 + var13, -16777216, 2, arg6 + var14, var22, class227.field2903);
                }
                if (class149.field1932[var12] == 4) {
                    int var23 = (150 - class149.field1937[var12]) * (class627.field9137.method856(0, var17) + 100) / 150;
                    class301.field3918.method939(arg5 + var13 - 50, arg6, var13 + arg5 + 50, arg6 - -arg1);
                    class95.field1282.method1626(-16777216, var17, var22, arg6 + var14, (byte) -16, arg5 + var13 + 50 - var23);
                    class301.field3918.method977(arg5, arg6, arg5 + arg3, arg1 + arg6);
                }
                if (class149.field1932[var12] == 5) {
                    int var24 = 150 - class149.field1937[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class627.field9137.field2037 + class627.field9137.field2028;
                    class301.field3918.method939(arg5, arg6 + var14 - var26 - 1, arg5 - -arg3, arg6 + var14 + 5);
                    class95.field1282.method1618(var22, -16777216, arg6 + var25 + var14, (byte) -112, arg5 + var13, var17);
                    class301.field3918.method977(arg5, arg6, arg3 + arg5, arg1 + arg6);
                }
            } else {
                class95.field1282.method1618(-256, -16777216, arg6 + var14, (byte) -111, arg5 + var13, var17);
            }
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(JJ)J")
    public static long method2760(long arg0, long arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static void method2761(byte arg0) {
        field6862 = null;
        if (arg0 >= -56) {
            method2759(-102, 105, 23, -11, (byte) -9, -111, -11);
        }
    }
}
