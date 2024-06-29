import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class218 {

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    private static int field2782 = 0;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "[I")
    private static int[] field2788 = new int[5];

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[[I")
    private static int[][] field2779 = new int[5][5000];

    @OriginalMember(owner = "client!he", name = "s", descriptor = "[Ljava/lang/String;")
    private static String[] field2792 = new String[1000];

    @OriginalMember(owner = "client!he", name = "r", descriptor = "[I")
    private static int[] field2791 = new int[1000];

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    private static int field2786 = 0;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[Lil;")
    private static class67[] field2781 = new class67[50];

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    private static int field2793 = 0;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Ljava/util/Calendar;")
    private static Calendar field2787 = Calendar.getInstance();

    @OriginalMember(owner = "client!he", name = "B", descriptor = "[I")
    private static int[] field2801 = new int[3];

    @OriginalMember(owner = "client!he", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field2800 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!he", name = "z", descriptor = "Lwg;")
    public static class58 field2799 = new class58(4);

    @OriginalMember(owner = "client!he", name = "C", descriptor = "I")
    private static int field2802 = 0;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static int field2785;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Ljq;")
    private static class447 field2776;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "Ljq;")
    private static class447 field2777;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "Lvg;")
    private static class75 field2797;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "[I")
    private static int[] field2774;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "[Ljava/lang/String;")
    private static String[] field2775;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    private static final void method1398(int arg0) {
        class447 var1 = class609.method3486(arg0, 983030160);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class447[] var3 = class567.field7930[var2];
        if (var3 == null) {
            class447[] var4 = class508.field7087[var2];
            int var5 = var4.length;
            var3 = class567.field7930[var2] = new class447[var5];
            class205.method1313(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class205.method1313(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ldh;II)V")
    public static final void method1399(class321 arg0, int arg1, int arg2) {
        class532 var3 = class491.method2758(arg0, (byte) 124, arg2, arg1);
        if (var3 == null) {
            return;
        }
        field2774 = new int[var3.field7422];
        field2775 = new String[var3.field7426];
        if (class377.field5284 == var3.field7429 || class433.field5895 == var3.field7429 || class330.field4573 == var3.field7429) {
            int var4 = 0;
            int var5 = 0;
            if (class516.field7207 != null) {
                var4 = class516.field7207.field6335;
                var5 = class516.field7207.field6270;
            }
            field2774[0] = class343.field4760.method100((byte) -81) - var4;
            field2774[1] = class343.field4760.method92(8) - var5;
        }
        method1403(var3, 200000);
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZ)V")
    private static final void method1400(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field2782 -= 3;
                int var2 = field2791[field2782];
                int var3 = field2791[field2782 + 1];
                int var4 = field2791[field2782 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class447 var5 = class609.method3486(var2, 983030160);
                if (var5.field6194 == null) {
                    var5.field6194 = new class447[var4 + 1];
                }
                if (var5.field6194.length <= var4) {
                    class447[] var6 = new class447[var4 + 1];
                    for (int var7 = 0; var7 < var5.field6194.length; var7++) {
                        var6[var7] = var5.field6194[var7];
                    }
                    var5.field6194 = var6;
                }
                if (var4 > 0 && var5.field6194[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class447 var8 = new class447();
                var8.field6336 = var3;
                var8.field6244 = var8.field6229 = var5.field6229;
                var8.field6317 = var4;
                var5.field6194[var4] = var8;
                if (arg1) {
                    field2776 = var8;
                } else {
                    field2777 = var8;
                }
                class90.method501(var5, -1);
                return;
            }
            if (arg0 == 101) {
                class447 var9 = arg1 ? field2776 : field2777;
                if (var9.field6317 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class447 var10 = class609.method3486(var9.field6229, 983030160);
                var10.field6194[var9.field6317] = null;
                class90.method501(var10, -1);
                return;
            }
            if (arg0 == 102) {
                class447 var11 = class609.method3486(field2791[--field2782], 983030160);
                var11.field6194 = null;
                class90.method501(var11, -1);
                return;
            }
            if (arg0 == 200) {
                field2782 -= 2;
                int var12 = field2791[field2782];
                int var13 = field2791[field2782 + 1];
                class447 var14 = class433.method2525(var13, var12, (byte) -111);
                if (var14 != null && var13 != -1) {
                    field2791[field2782++] = 1;
                    if (arg1) {
                        field2776 = var14;
                        return;
                    }
                    field2777 = var14;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field2791[--field2782];
                class447 var16 = class609.method3486(var15, 983030160);
                if (var16 != null) {
                    field2791[field2782++] = 1;
                    if (arg1) {
                        field2776 = var16;
                        return;
                    }
                    field2777 = var16;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field2791[--field2782];
                method1398(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field2791[--field2782];
                method1407(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2782 -= 2;
                int var19 = field2791[field2782];
                int var20 = field2791[field2782 + 1];
                for (int var21 = 0; var21 < class602.field8702.length; var21++) {
                    if (class602.field8702[var21] == var19) {
                        class147.field1899.field274.method2969(0, var21, class10.field104, var20);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class380.field5315.length; var22++) {
                    if (class380.field5315[var22] == var19) {
                        class147.field1899.field274.method2969(0, var22, class10.field104, var20);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2782 -= 2;
                int var23 = field2791[field2782];
                int var24 = field2791[field2782 + 1];
                class147.field1899.field274.method2968(2018913102, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field2791[--field2782] != 0;
                class147.field1899.field274.method2971(var25, -125);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class447 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class609.method3486(field2791[--field2782], 983030160);
            } else {
                var26 = arg1 ? field2776 : field2777;
            }
            if (arg0 == 1000) {
                field2782 -= 4;
                var26.field6236 = field2791[field2782];
                var26.field6276 = field2791[field2782 + 1];
                int var27 = field2791[field2782 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field2791[field2782 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field6243 = (byte) var27;
                var26.field6307 = (byte) var28;
                class90.method501(var26, -1);
                class411.method2456(var26, (byte) -122);
                if (var26.field6317 == -1) {
                    class521.method2909(var26.field6229, 92);
                }
                return;
            }
            if (arg0 == 1001) {
                field2782 -= 4;
                var26.field6215 = field2791[field2782];
                var26.field6339 = field2791[field2782 + 1];
                var26.field6295 = 0;
                var26.field6201 = 0;
                int var29 = field2791[field2782 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field2791[field2782 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field6299 = (byte) var29;
                var26.field6222 = (byte) var30;
                class90.method501(var26, -1);
                class411.method2456(var26, (byte) -124);
                if (var26.field6336 == 0) {
                    class558.method3136((byte) 91, var26, false);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field2791[--field2782] == 1;
                if (var26.field6250 != var31) {
                    var26.field6250 = var31;
                    class90.method501(var26, -1);
                }
                if (var26.field6317 == -1) {
                    class234.method1482(var26.field6229, true);
                }
                return;
            }
            if (arg0 == 1004) {
                field2782 -= 2;
                var26.field6316 = field2791[field2782];
                var26.field6261 = field2791[field2782 + 1];
                class90.method501(var26, -1);
                class411.method2456(var26, (byte) -114);
                if (var26.field6336 == 0) {
                    class558.method3136((byte) 108, var26, false);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field6180 = field2791[--field2782] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class447 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class609.method3486(field2791[--field2782], 983030160);
            } else {
                var32 = arg1 ? field2776 : field2777;
            }
            if (arg0 == 1100) {
                field2782 -= 2;
                var32.field6291 = field2791[field2782];
                if (var32.field6291 > var32.field6294 - var32.field6330) {
                    var32.field6291 = var32.field6294 - var32.field6330;
                }
                if (var32.field6291 < 0) {
                    var32.field6291 = 0;
                }
                var32.field6280 = field2791[field2782 + 1];
                if (var32.field6280 > var32.field6309 - var32.field6218) {
                    var32.field6280 = var32.field6309 - var32.field6218;
                }
                if (var32.field6280 < 0) {
                    var32.field6280 = 0;
                }
                class90.method501(var32, -1);
                if (var32.field6317 == -1) {
                    class522.method2920(true, var32.field6229);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field6200 = field2791[--field2782];
                class90.method501(var32, -1);
                if (var32.field6317 == -1) {
                    class368.method2258(true, var32.field6229);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field6334 = field2791[--field2782] == 1;
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1103) {
                var32.field6340 = field2791[--field2782];
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1104) {
                var32.field6246 = field2791[--field2782];
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field2791[--field2782];
                if (var32.field6266 != var33) {
                    var32.field6266 = var33;
                    class90.method501(var32, -1);
                }
                if (var32.field6317 == -1) {
                    class474.method2696((byte) -48, var32.field6229);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field6272 = field2791[--field2782];
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1107) {
                var32.field6214 = field2791[--field2782] == 1;
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1108) {
                var32.field6308 = 1;
                var32.field6193 = field2791[--field2782];
                class90.method501(var32, -1);
                if (var32.field6317 == -1) {
                    class260.method1552(var32.field6229, (byte) -72);
                }
                return;
            }
            if (arg0 == 1109) {
                field2782 -= 6;
                var32.field6195 = field2791[field2782];
                var32.field6337 = field2791[field2782 + 1];
                var32.field6333 = field2791[field2782 + 2];
                var32.field6305 = field2791[field2782 + 3];
                var32.field6321 = field2791[field2782 + 4];
                var32.field6174 = field2791[field2782 + 5];
                class90.method501(var32, -1);
                if (var32.field6317 == -1) {
                    class590.method3408(-113, var32.field6229);
                    class165.method895(-18150, var32.field6229);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field2791[--field2782];
                if (var32.field6259 != var34) {
                    var32.field6259 = var34;
                    var32.field6184 = 0;
                    var32.field6234 = 1;
                    var32.field6212 = 0;
                    class90.method501(var32, -1);
                }
                if (var32.field6317 == -1) {
                    class626.method3613(var32.field6229, 87);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field6228 = field2791[--field2782] == 1;
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field2792[--field2793];
                if (!var35.equals(var32.field6191)) {
                    var32.field6191 = var35;
                    class90.method501(var32, -1);
                }
                if (var32.field6317 == -1) {
                    class384.method2328((byte) -84, var32.field6229);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field6182 = field2791[--field2782];
                class90.method501(var32, -1);
                if (var32.field6317 == -1) {
                    class391.method2354(16, var32.field6229);
                }
                return;
            }
            if (arg0 == 1114) {
                field2782 -= 3;
                var32.field6327 = field2791[field2782];
                var32.field6198 = field2791[field2782 + 1];
                var32.field6314 = field2791[field2782 + 2];
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1115) {
                var32.field6176 = field2791[--field2782] == 1;
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1116) {
                var32.field6217 = field2791[--field2782];
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1117) {
                var32.field6183 = field2791[--field2782];
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1118) {
                var32.field6318 = field2791[--field2782] == 1;
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1119) {
                var32.field6235 = field2791[--field2782] == 1;
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1120) {
                field2782 -= 2;
                var32.field6294 = field2791[field2782];
                var32.field6309 = field2791[field2782 + 1];
                class90.method501(var32, -1);
                if (var32.field6336 == 0) {
                    class558.method3136((byte) 74, var32, false);
                }
                return;
            }
            if (arg0 == 1121) {
                field2782 -= 2;
                var32.field6203 = (short) field2791[field2782];
                var32.field6230 = (short) field2791[field2782 + 1];
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1122) {
                var32.field6245 = field2791[--field2782] == 1;
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1123) {
                var32.field6174 = field2791[--field2782];
                class90.method501(var32, -1);
                if (var32.field6317 == -1) {
                    class590.method3408(-91, var32.field6229);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field2791[--field2782];
                var32.field6338 = var36 == 1;
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1125) {
                field2782 -= 2;
                var32.field6190 = field2791[field2782];
                var32.field6224 = field2791[field2782 + 1];
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1126) {
                var32.field6258 = field2791[--field2782];
                class90.method501(var32, -1);
                return;
            }
            if (arg0 == 1127) {
                field2782 -= 2;
                int var37 = field2791[field2782];
                int var38 = field2791[field2782 + 1];
                class360 var39 = class132.field1621.method151(var37, 101);
                if (var39.field5020 != var38) {
                    var32.method2606(var38, var37, 46);
                    return;
                }
                var32.method2610(var37, false);
                return;
            }
            if (arg0 == 1128) {
                int var40 = field2791[--field2782];
                String var41 = field2792[--field2793];
                class360 var42 = class132.field1621.method151(var40, -116);
                if (!var42.field5024.equals(var41)) {
                    var32.method2614((byte) 31, var41, var40);
                    return;
                }
                var32.method2610(var40, false);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class447 var43;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var43 = class609.method3486(field2791[--field2782], 983030160);
            } else {
                var43 = arg1 ? field2776 : field2777;
            }
            class90.method501(var43, -1);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2782 -= 2;
                int var44 = field2791[field2782];
                int var45 = field2791[field2782 + 1];
                if (var43.field6317 == -1) {
                    class343.method2154(256, var43.field6229);
                    class590.method3408(-24, var43.field6229);
                    class165.method895(-18150, var43.field6229);
                }
                if (var44 == -1) {
                    var43.field6308 = 1;
                    var43.field6193 = -1;
                    var43.field6263 = -1;
                    return;
                }
                var43.field6263 = var44;
                var43.field6324 = var45;
                if (arg0 == 1208 || arg0 == 1209) {
                    var43.field6254 = true;
                } else {
                    var43.field6254 = false;
                }
                class456 var46 = class98.field1307.method3391(0, var44);
                var43.field6333 = var46.field6466;
                var43.field6305 = var46.field6517;
                var43.field6321 = var46.field6470;
                var43.field6195 = var46.field6474;
                var43.field6337 = var46.field6510;
                var43.field6174 = var46.field6453;
                if (arg0 == 1205 || arg0 == 1209) {
                    var43.field6262 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var43.field6262 = 1;
                } else {
                    var43.field6262 = 2;
                }
                if (var43.field6295 > 0) {
                    var43.field6174 = var43.field6174 * 32 / var43.field6295;
                    return;
                }
                if (var43.field6215 > 0) {
                    var43.field6174 = var43.field6174 * 32 / var43.field6215;
                }
                return;
            }
            if (arg0 == 1201) {
                var43.field6308 = 2;
                var43.field6193 = field2791[--field2782];
                if (var43.field6317 == -1) {
                    class260.method1552(var43.field6229, (byte) -73);
                }
                return;
            }
            if (arg0 == 1202) {
                var43.field6308 = 3;
                var43.field6193 = -1;
                if (var43.field6317 == -1) {
                    class260.method1552(var43.field6229, (byte) -104);
                }
                return;
            }
            if (arg0 == 1203) {
                var43.field6308 = 6;
                var43.field6193 = field2791[--field2782];
                if (var43.field6317 == -1) {
                    class260.method1552(var43.field6229, (byte) -72);
                }
                return;
            }
            if (arg0 == 1204) {
                var43.field6308 = 5;
                var43.field6193 = field2791[--field2782];
                if (var43.field6317 == -1) {
                    class260.method1552(var43.field6229, (byte) -77);
                }
                return;
            }
            if (arg0 == 1206) {
                field2782 -= 4;
                var43.field6192 = field2791[field2782];
                var43.field6226 = field2791[field2782 + 1];
                var43.field6341 = field2791[field2782 + 2];
                var43.field6202 = field2791[field2782 + 3];
                class90.method501(var43, -1);
                return;
            }
            if (arg0 == 1207) {
                field2782 -= 2;
                var43.field6187 = field2791[field2782];
                var43.field6175 = field2791[field2782 + 1];
                class90.method501(var43, -1);
                return;
            }
            if (arg0 == 1210) {
                field2782 -= 4;
                var43.field6193 = field2791[field2782];
                var43.field6197 = field2791[field2782 + 1];
                if (field2791[field2782 + 2] == 1) {
                    var43.field6308 = 9;
                } else {
                    var43.field6308 = 8;
                }
                if (field2791[field2782 + 3] == 1) {
                    var43.field6254 = true;
                } else {
                    var43.field6254 = false;
                }
                if (var43.field6317 == -1) {
                    class260.method1552(var43.field6229, (byte) -70);
                }
                return;
            }
            if (arg0 == 1211) {
                var43.field6308 = 5;
                var43.field6193 = class182.field2335;
                var43.field6197 = 0;
                if (var43.field6317 == -1) {
                    class260.method1552(var43.field6229, (byte) -102);
                }
                return;
            }
        } else if (arg0 >= 1300 && arg0 < 1400 || arg0 >= 2300 && arg0 < 2400) {
            class447 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class609.method3486(field2791[--field2782], 983030160);
            } else {
                var47 = arg1 ? field2776 : field2777;
            }
            if (arg0 == 1300) {
                int var48 = field2791[--field2782] - 1;
                if (var48 >= 0 && var48 <= 9) {
                    var47.method2609(var48, field2792[--field2793], (byte) 97);
                    return;
                }
                field2793--;
                return;
            }
            if (arg0 == 1301) {
                field2782 -= 2;
                int var49 = field2791[field2782];
                int var50 = field2791[field2782 + 1];
                if (var49 == -1 && var50 == -1) {
                    var47.field6297 = null;
                    return;
                }
                var47.field6297 = class433.method2525(var50, var49, (byte) -103);
                return;
            }
            if (arg0 == 1302) {
                int var51 = field2791[--field2782];
                if (class261.field3275 != var51 && class600.field8679 != var51 && class115.field1468 != var51) {
                    return;
                }
                var47.field6208 = var51;
                return;
            }
            if (arg0 == 1303) {
                var47.field6239 = field2791[--field2782];
                return;
            }
            if (arg0 == 1304) {
                var47.field6225 = field2791[--field2782];
                return;
            }
            if (arg0 == 1305) {
                var47.field6213 = field2792[--field2793];
                return;
            }
            if (arg0 == 1306) {
                var47.field6204 = field2792[--field2793];
                return;
            }
            if (arg0 == 1307) {
                var47.field6290 = null;
                return;
            }
            if (arg0 == 1308) {
                var47.field6188 = field2791[--field2782];
                var47.field6287 = field2791[--field2782];
                return;
            }
            if (arg0 == 1309) {
                int var52 = field2791[--field2782];
                int var53 = field2791[--field2782];
                if (var53 >= 1 && var53 <= 10) {
                    var47.method2600(var52, 0, var53 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var47.field6227 = field2792[--field2793];
                return;
            }
            if (arg0 == 1311) {
                var47.field6275 = field2791[--field2782];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var54;
                int var55;
                int var56;
                if (arg0 == 1312) {
                    field2782 -= 3;
                    var54 = field2791[field2782] - 1;
                    var55 = field2791[field2782 + 1];
                    var56 = field2791[field2782 + 2];
                    if (var54 < 0 || var54 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2782 -= 2;
                    var54 = 10;
                    var55 = field2791[field2782];
                    var56 = field2791[field2782 + 1];
                }
                if (var47.field6273 == null) {
                    if (var55 == 0) {
                        return;
                    }
                    var47.field6273 = new byte[11];
                    var47.field6248 = new byte[11];
                    var47.field6186 = new int[11];
                }
                var47.field6273[var54] = (byte) var55;
                if (var55 == 0) {
                    var47.field6300 = false;
                    for (int var57 = 0; var57 < var47.field6273.length; var57++) {
                        if (var47.field6273[var57] != 0) {
                            var47.field6300 = true;
                            break;
                        }
                    }
                } else {
                    var47.field6300 = true;
                }
                var47.field6248[var54] = (byte) var56;
                return;
            }
            if (arg0 == 1314) {
                var47.field6172 = field2791[--field2782];
                return;
            }
        } else if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
            class447 var58;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var58 = class609.method3486(field2791[--field2782], 983030160);
            } else {
                var58 = arg1 ? field2776 : field2777;
            }
            if (arg0 == 1499) {
                var58.method2611((byte) 126);
                return;
            }
            String var59 = field2792[--field2793];
            int[] var60 = null;
            if (var59.length() > 0 && var59.charAt(var59.length() - 1) == 'Y') {
                int var61 = field2791[--field2782];
                if (var61 > 0) {
                    var60 = new int[var61];
                    while (var61-- > 0) {
                        var60[var61] = field2791[--field2782];
                    }
                }
                var59 = var59.substring(0, var59.length() - 1);
            }
            Object[] var62 = new Object[var59.length() + 1];
            for (int var63 = var62.length - 1; var63 >= 1; var63--) {
                if (var59.charAt(var63 - 1) == 's') {
                    var62[var63] = field2792[--field2793];
                } else {
                    var62[var63] = Integer.valueOf(field2791[--field2782]);
                }
            }
            int var64 = field2791[--field2782];
            if (var64 == -1) {
                var62 = null;
            } else {
                var62[0] = Integer.valueOf(var64);
            }
            if (arg0 == 1400) {
                var58.field6285 = var62;
            } else if (arg0 == 1401) {
                var58.field6283 = var62;
            } else if (arg0 == 1402) {
                var58.field6179 = var62;
            } else if (arg0 == 1403) {
                var58.field6278 = var62;
            } else if (arg0 == 1404) {
                var58.field6282 = var62;
            } else if (arg0 == 1405) {
                var58.field6232 = var62;
            } else if (arg0 == 1406) {
                var58.field6181 = var62;
            } else if (arg0 == 1407) {
                var58.field6311 = var62;
                var58.field6185 = var60;
            } else if (arg0 == 1408) {
                var58.field6237 = var62;
            } else if (arg0 == 1409) {
                var58.field6292 = var62;
            } else if (arg0 == 1410) {
                var58.field6279 = var62;
            } else if (arg0 == 1411) {
                var58.field6209 = var62;
            } else if (arg0 == 1412) {
                var58.field6231 = var62;
            } else if (arg0 == 1414) {
                var58.field6277 = var62;
                var58.field6249 = var60;
            } else if (arg0 == 1415) {
                var58.field6286 = var62;
                var58.field6302 = var60;
            } else if (arg0 == 1416) {
                var58.field6331 = var62;
            } else if (arg0 == 1417) {
                var58.field6310 = var62;
            } else if (arg0 == 1418) {
                var58.field6253 = var62;
            } else if (arg0 == 1419) {
                var58.field6199 = var62;
            } else if (arg0 == 1420) {
                var58.field6312 = var62;
            } else if (arg0 == 1421) {
                var58.field6301 = var62;
            } else if (arg0 == 1422) {
                var58.field6274 = var62;
            } else if (arg0 == 1423) {
                var58.field6293 = var62;
            } else if (arg0 == 1424) {
                var58.field6303 = var62;
            } else if (arg0 == 1425) {
                var58.field6221 = var62;
            } else if (arg0 == 1426) {
                var58.field6267 = var62;
            } else if (arg0 == 1427) {
                var58.field6189 = var62;
            } else if (arg0 == 1428) {
                var58.field6264 = var62;
                var58.field6298 = var60;
            } else if (arg0 == 1429) {
                var58.field6256 = var62;
                var58.field6241 = var60;
            } else if (arg0 == 1430) {
                var58.field6315 = var62;
            }
            var58.field6289 = true;
            return;
        } else if (arg0 < 1600) {
            class447 var65 = arg1 ? field2776 : field2777;
            if (arg0 == 1500) {
                field2791[field2782++] = var65.field6335;
                return;
            }
            if (arg0 == 1501) {
                field2791[field2782++] = var65.field6270;
                return;
            }
            if (arg0 == 1502) {
                field2791[field2782++] = var65.field6330;
                return;
            }
            if (arg0 == 1503) {
                field2791[field2782++] = var65.field6218;
                return;
            }
            if (arg0 == 1504) {
                field2791[field2782++] = var65.field6250 ? 1 : 0;
                return;
            }
            if (arg0 == 1505) {
                field2791[field2782++] = var65.field6244;
                return;
            }
            if (arg0 == 1506) {
                class447 var66 = class356.method2218(var65, (byte) 85);
                field2791[field2782++] = var66 == null ? -1 : var66.field6229;
                return;
            }
        } else if (arg0 < 1700) {
            class447 var67 = arg1 ? field2776 : field2777;
            if (arg0 == 1600) {
                field2791[field2782++] = var67.field6291;
                return;
            }
            if (arg0 == 1601) {
                field2791[field2782++] = var67.field6280;
                return;
            }
            if (arg0 == 1602) {
                field2792[field2793++] = var67.field6191;
                return;
            }
            if (arg0 == 1603) {
                field2791[field2782++] = var67.field6294;
                return;
            }
            if (arg0 == 1604) {
                field2791[field2782++] = var67.field6309;
                return;
            }
            if (arg0 == 1605) {
                field2791[field2782++] = var67.field6174;
                return;
            }
            if (arg0 == 1606) {
                field2791[field2782++] = var67.field6333;
                return;
            }
            if (arg0 == 1607) {
                field2791[field2782++] = var67.field6321;
                return;
            }
            if (arg0 == 1608) {
                field2791[field2782++] = var67.field6305;
                return;
            }
            if (arg0 == 1609) {
                field2791[field2782++] = var67.field6340;
                return;
            }
            if (arg0 == 1610) {
                field2791[field2782++] = var67.field6195;
                return;
            }
            if (arg0 == 1611) {
                field2791[field2782++] = var67.field6337;
                return;
            }
            if (arg0 == 1612) {
                field2791[field2782++] = var67.field6266;
                return;
            }
            if (arg0 == 1613) {
                int var68 = field2791[--field2782];
                class360 var69 = class132.field1621.method151(var68, -127);
                if (var69.method2232(-116)) {
                    field2792[field2793++] = var67.method2601(-8110, var69.field5024, var68);
                    return;
                }
                field2791[field2782++] = var67.method2599(var68, var69.field5020, 0);
                return;
            }
        } else if (arg0 < 1800) {
            class447 var70 = arg1 ? field2776 : field2777;
            if (arg0 == 1700) {
                field2791[field2782++] = var70.field6263;
                return;
            }
            if (arg0 == 1701) {
                if (var70.field6263 != -1) {
                    field2791[field2782++] = var70.field6324;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 1702) {
                field2791[field2782++] = var70.field6317;
                return;
            }
        } else if (arg0 < 1900) {
            class447 var71 = arg1 ? field2776 : field2777;
            if (arg0 == 1800) {
                field2791[field2782++] = client.method3572(var71).method2768(19270);
                return;
            }
            if (arg0 == 1801) {
                int var72 = field2791[--field2782];
                int var334 = var72 - 1;
                if (var71.field6290 != null && var334 < var71.field6290.length && var71.field6290[var334] != null) {
                    field2792[field2793++] = var71.field6290[var334];
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 1802) {
                if (var71.field6213 == null) {
                    field2792[field2793++] = "";
                    return;
                }
                field2792[field2793++] = var71.field6213;
                return;
            }
        } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
            class447 var332;
            if (arg0 >= 2000) {
                var332 = class609.method3486(field2791[--field2782], 983030160);
                arg0 -= 1000;
            } else {
                var332 = arg1 ? field2776 : field2777;
            }
            if (field2802 >= 10) {
                throw new RuntimeException("C29xx-1");
            }
            if (arg0 == 1927) {
                if (var332.field6189 == null) {
                    return;
                }
                class9 var333 = new class9();
                var333.field77 = var332;
                var333.field81 = var332.field6189;
                var333.field72 = field2802 + 1;
                class225.field2879.method3181(var333, true);
                return;
            }
        } else if (arg0 < 2600) {
            class447 var73 = class609.method3486(field2791[--field2782], 983030160);
            if (arg0 == 2500) {
                field2791[field2782++] = var73.field6335;
                return;
            }
            if (arg0 == 2501) {
                field2791[field2782++] = var73.field6270;
                return;
            }
            if (arg0 == 2502) {
                field2791[field2782++] = var73.field6330;
                return;
            }
            if (arg0 == 2503) {
                field2791[field2782++] = var73.field6218;
                return;
            }
            if (arg0 == 2504) {
                field2791[field2782++] = var73.field6250 ? 1 : 0;
                return;
            }
            if (arg0 == 2505) {
                field2791[field2782++] = var73.field6244;
                return;
            }
            if (arg0 == 1506) {
                class447 var74 = class356.method2218(var73, (byte) 85);
                field2791[field2782++] = var74 == null ? -1 : var74.field6229;
                return;
            }
        } else if (arg0 < 2700) {
            class447 var75 = class609.method3486(field2791[--field2782], 983030160);
            if (arg0 == 2600) {
                field2791[field2782++] = var75.field6291;
                return;
            }
            if (arg0 == 2601) {
                field2791[field2782++] = var75.field6280;
                return;
            }
            if (arg0 == 2602) {
                field2792[field2793++] = var75.field6191;
                return;
            }
            if (arg0 == 2603) {
                field2791[field2782++] = var75.field6294;
                return;
            }
            if (arg0 == 2604) {
                field2791[field2782++] = var75.field6309;
                return;
            }
            if (arg0 == 2605) {
                field2791[field2782++] = var75.field6174;
                return;
            }
            if (arg0 == 2606) {
                field2791[field2782++] = var75.field6333;
                return;
            }
            if (arg0 == 2607) {
                field2791[field2782++] = var75.field6321;
                return;
            }
            if (arg0 == 2608) {
                field2791[field2782++] = var75.field6305;
                return;
            }
            if (arg0 == 2609) {
                field2791[field2782++] = var75.field6340;
                return;
            }
            if (arg0 == 2610) {
                field2791[field2782++] = var75.field6195;
                return;
            }
            if (arg0 == 2611) {
                field2791[field2782++] = var75.field6337;
                return;
            }
            if (arg0 == 2612) {
                field2791[field2782++] = var75.field6266;
                return;
            }
        } else if (arg0 < 2800) {
            if (arg0 == 2700) {
                class447 var76 = class609.method3486(field2791[--field2782], 983030160);
                field2791[field2782++] = var76.field6263;
                return;
            }
            if (arg0 == 2701) {
                class447 var77 = class609.method3486(field2791[--field2782], 983030160);
                if (var77.field6263 != -1) {
                    field2791[field2782++] = var77.field6324;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 2702) {
                int var78 = field2791[--field2782];
                class496 var79 = (class496) class523.field7289.method3476((long) var78, (byte) 28);
                if (var79 != null) {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 2703) {
                class447 var80 = class609.method3486(field2791[--field2782], 983030160);
                if (var80.field6194 == null) {
                    field2791[field2782++] = 0;
                    return;
                }
                int var81 = var80.field6194.length;
                for (int var82 = 0; var82 < var80.field6194.length; var82++) {
                    if (var80.field6194[var82] == null) {
                        var81 = var82;
                        break;
                    }
                }
                field2791[field2782++] = var81;
                return;
            }
            if (arg0 == 2704 || arg0 == 2705) {
                field2782 -= 2;
                int var83 = field2791[field2782];
                int var84 = field2791[field2782 + 1];
                class496 var85 = (class496) class523.field7289.method3476((long) var83, (byte) 28);
                if (var85 != null && var85.field6914 == var84) {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
        } else if (arg0 < 2900) {
            class447 var86 = class609.method3486(field2791[--field2782], 983030160);
            if (arg0 == 2800) {
                field2791[field2782++] = client.method3572(var86).method2768(19270);
                return;
            }
            if (arg0 == 2801) {
                int var87 = field2791[--field2782];
                int var335 = var87 - 1;
                if (var86.field6290 != null && var335 < var86.field6290.length && var86.field6290[var335] != null) {
                    field2792[field2793++] = var86.field6290[var335];
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 2802) {
                if (var86.field6213 == null) {
                    field2792[field2793++] = "";
                    return;
                }
                field2792[field2793++] = var86.field6213;
                return;
            }
        } else if (arg0 < 3200) {
            if (arg0 == 3100) {
                String var88 = field2792[--field2793];
                class534.method2970(var88, (byte) -46);
                return;
            }
            if (arg0 == 3101) {
                field2782 -= 2;
                class69.method397(-123, class147.field1899, field2791[field2782], field2791[field2782 + 1]);
                return;
            }
            if (arg0 == 3103) {
                class244.method1511(0, true);
                return;
            }
            if (arg0 == 3104) {
                String var89 = field2792[--field2793];
                int var90 = 0;
                if (class111.method601(false, var89)) {
                    var90 = class254.method1532(var89, 2);
                }
                field2780++;
                class118.method650(true, class228.field2915);
                class272.field3457.method3071(-124, var90);
                return;
            }
            if (arg0 == 3105) {
                String var91 = field2792[--field2793];
                field2783++;
                class118.method650(true, class640.field9295);
                class272.field3457.method3060(var91.length() + 1, -25098);
                class272.field3457.method3040(false, var91);
                return;
            }
            if (arg0 == 3106) {
                String var92 = field2792[--field2793];
                field2785++;
                class118.method650(true, class528.field7390);
                class272.field3457.method3060(var92.length() + 1, -25098);
                class272.field3457.method3040(false, var92);
                return;
            }
            if (arg0 == 3107) {
                int var93 = field2791[--field2782];
                String var94 = field2792[--field2793];
                class187.method1150(var93, 61, var94);
                return;
            }
            if (arg0 == 3108) {
                field2782 -= 3;
                int var95 = field2791[field2782];
                int var96 = field2791[field2782 + 1];
                int var97 = field2791[field2782 + 2];
                class447 var98 = class609.method3486(var97, 983030160);
                class632.method3653(var96, var95, var98, -1551917856);
                return;
            }
            if (arg0 == 3109) {
                field2782 -= 2;
                int var99 = field2791[field2782];
                int var100 = field2791[field2782 + 1];
                class447 var101 = arg1 ? field2776 : field2777;
                class632.method3653(var100, var99, var101, -1551917856);
                return;
            }
            if (arg0 == 3110) {
                int var102 = field2791[--field2782];
                field2794++;
                class118.method650(true, class532.field7435);
                class272.field3457.method3042(var102, -74);
                return;
            }
            if (arg0 == 3111) {
                field2782 -= 2;
                int var103 = field2791[field2782];
                int var104 = field2791[field2782 + 1];
                class496 var105 = (class496) class523.field7289.method3476((long) var103, (byte) 28);
                if (var105 != null) {
                    class489.method2752(true, var105, var105.field6914 != var104, false);
                }
                class149.method816(3, var104, true, 1, var103);
                return;
            }
            if (arg0 == 3112) {
                field2782--;
                int var106 = field2791[field2782];
                class496 var107 = (class496) class523.field7289.method3476((long) var106, (byte) 28);
                if (var107 != null && var107.field6912 == 3) {
                    class489.method2752(true, var107, true, false);
                }
                return;
            }
            if (arg0 == 3113) {
                class201.method1286(true, field2792[--field2793]);
                return;
            }
            if (arg0 == 3114) {
                field2782 -= 2;
                int var108 = field2791[field2782];
                int var109 = field2791[field2782 + 1];
                String var110 = field2792[--field2793];
                class392.method2365(var110, (byte) 123, var109, "", var108, "");
                return;
            }
        } else if (arg0 < 3300) {
            if (arg0 == 3200) {
                field2782 -= 3;
                class590.method3406(field2791[field2782 + 1], 255, field2791[field2782 + 2], field2791[field2782], (byte) 45);
                return;
            }
            if (arg0 == 3201) {
                class135.method711(255, 50, (byte) 78, field2791[--field2782]);
                return;
            }
            if (arg0 == 3202) {
                field2782 -= 2;
                class208.method1327(255, 31944, field2791[field2782], field2791[field2782 + 1]);
                return;
            }
            if (arg0 == 3203) {
                field2782 -= 4;
                class590.method3406(field2791[field2782 + 1], field2791[field2782 + 3], field2791[field2782 + 2], field2791[field2782], (byte) 63);
                return;
            }
            if (arg0 == 3204) {
                field2782 -= 3;
                class135.method711(field2791[field2782 + 1], field2791[field2782 + 2], (byte) 78, field2791[field2782]);
                return;
            }
            if (arg0 == 3205) {
                field2782 -= 3;
                class208.method1327(field2791[field2782 + 2], 31944, field2791[field2782], field2791[field2782 + 1]);
                return;
            }
            if (arg0 == 3206) {
                field2782 -= 4;
                class85.method481((byte) -123, field2791[field2782], field2791[field2782 + 3], field2791[field2782 + 2], field2791[field2782 + 1]);
                return;
            }
        } else if (arg0 < 3400) {
            if (arg0 == 3300) {
                field2791[field2782++] = class7.field61;
                return;
            }
            if (arg0 == 3301) {
                field2782 -= 2;
                int var111 = field2791[field2782];
                int var112 = field2791[field2782 + 1];
                field2791[field2782++] = class350.method2178(var111, false, var112, -128);
                return;
            }
            if (arg0 == 3302) {
                field2782 -= 2;
                int var113 = field2791[field2782];
                int var114 = field2791[field2782 + 1];
                field2791[field2782++] = class581.method3279(var114, true, var113, false);
                return;
            }
            if (arg0 == 3303) {
                field2782 -= 2;
                int var115 = field2791[field2782];
                int var116 = field2791[field2782 + 1];
                field2791[field2782++] = class623.method3590(false, false, var116, var115);
                return;
            }
            if (arg0 == 3304) {
                int var117 = field2791[--field2782];
                field2791[field2782++] = class459.field6559.method3463((byte) -76, var117).field2334;
                return;
            }
            if (arg0 == 3305) {
                int var118 = field2791[--field2782];
                field2791[field2782++] = class235.field3012[var118];
                return;
            }
            if (arg0 == 3306) {
                int var119 = field2791[--field2782];
                field2791[field2782++] = class99.field1329[var119];
                return;
            }
            if (arg0 == 3307) {
                int var120 = field2791[--field2782];
                field2791[field2782++] = class181.field2323[var120];
                return;
            }
            if (arg0 == 3308) {
                byte var121 = class147.field1899.field6358;
                int var122 = (class147.field1899.field6362 >> 9) + class525.field7310;
                int var123 = (class147.field1899.field6368 >> 9) + class58.field786;
                field2791[field2782++] = (var121 << 28) + (var122 << 14) + var123;
                return;
            }
            if (arg0 == 3309) {
                int var124 = field2791[--field2782];
                field2791[field2782++] = var124 >> 14 & 0x3FFF;
                return;
            }
            if (arg0 == 3310) {
                int var125 = field2791[--field2782];
                field2791[field2782++] = var125 >> 28;
                return;
            }
            if (arg0 == 3311) {
                int var126 = field2791[--field2782];
                field2791[field2782++] = var126 & 0x3FFF;
                return;
            }
            if (arg0 == 3312) {
                field2791[field2782++] = class502.field6984 ? 1 : 0;
                return;
            }
            if (arg0 == 3313) {
                field2782 -= 2;
                int var127 = field2791[field2782];
                int var128 = field2791[field2782 + 1];
                field2791[field2782++] = class350.method2178(var127, true, var128, -127);
                return;
            }
            if (arg0 == 3314) {
                field2782 -= 2;
                int var129 = field2791[field2782];
                int var130 = field2791[field2782 + 1];
                field2791[field2782++] = class581.method3279(var130, true, var129, true);
                return;
            }
            if (arg0 == 3315) {
                field2782 -= 2;
                int var131 = field2791[field2782];
                int var132 = field2791[field2782 + 1];
                field2791[field2782++] = class623.method3590(false, true, var132, var131);
                return;
            }
            if (arg0 == 3316) {
                if (class615.field8876 >= 2) {
                    field2791[field2782++] = class615.field8876;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3317) {
                field2791[field2782++] = class327.field4494;
                return;
            }
            if (arg0 == 3318) {
                field2791[field2782++] = class78.field1058.field3702;
                return;
            }
            if (arg0 == 3321) {
                field2791[field2782++] = class288.field3764;
                return;
            }
            if (arg0 == 3322) {
                field2791[field2782++] = class211.field2718;
                return;
            }
            if (arg0 == 3323) {
                if (class154.field2005 >= 5 && class154.field2005 <= 9) {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3324) {
                if (class154.field2005 >= 5 && class154.field2005 <= 9) {
                    field2791[field2782++] = class154.field2005;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3325) {
                field2791[field2782++] = class505.field7032 ? 1 : 0;
                return;
            }
            if (arg0 == 3326) {
                field2791[field2782++] = class147.field1899.field254;
                return;
            }
            if (arg0 == 3327) {
                field2791[field2782++] = class147.field1899.field274.field7451 ? 1 : 0;
                return;
            }
            if (arg0 == 3329) {
                field2791[field2782++] = class591.field8543 ? 1 : 0;
                return;
            }
            if (arg0 == 3330) {
                int var133 = field2791[--field2782];
                field2791[field2782++] = class550.method3030(false, var133, 10304);
                return;
            }
            if (arg0 == 3331) {
                field2782 -= 2;
                int var134 = field2791[field2782];
                int var135 = field2791[field2782 + 1];
                field2791[field2782++] = class132.method702(false, 110, false, var134, var135);
                return;
            }
            if (arg0 == 3332) {
                field2782 -= 2;
                int var136 = field2791[field2782];
                int var137 = field2791[field2782 + 1];
                field2791[field2782++] = class132.method702(false, 116, true, var136, var137);
                return;
            }
            if (arg0 == 3333) {
                field2791[field2782++] = class419.field5730;
                return;
            }
            if (arg0 == 3335) {
                field2791[field2782++] = class245.field3103;
                return;
            }
            if (arg0 == 3336) {
                field2782 -= 4;
                int var138 = field2791[field2782];
                int var139 = field2791[field2782 + 1];
                int var140 = field2791[field2782 + 2];
                int var141 = field2791[field2782 + 3];
                int var142 = (var139 << 14) + var138;
                int var143 = (var140 << 28) + var142;
                int var144 = var141 + var143;
                field2791[field2782++] = var144;
                return;
            }
            if (arg0 == 3337) {
                field2791[field2782++] = class24.field428;
                return;
            }
            if (arg0 == 3338) {
                field2791[field2782++] = class491.method2757(43);
                return;
            }
            if (arg0 == 3339) {
                field2791[field2782++] = class312.field3992 ? 1 : 0;
                return;
            }
            if (arg0 == 3340) {
                field2791[field2782++] = class70.field921 ? 1 : 0;
                return;
            }
            if (arg0 == 3341) {
                field2791[field2782++] = class391.field5418 ? 1 : 0;
                return;
            }
            if (arg0 == 3342) {
                field2791[field2782++] = class343.field4760.method100((byte) -76);
                return;
            }
            if (arg0 == 3343) {
                field2791[field2782++] = class343.field4760.method92(8);
                return;
            }
            if (arg0 == 3344) {
                field2792[field2793++] = class443.method2571(-1);
                return;
            }
            if (arg0 == 3345) {
                field2792[field2793++] = class216.method1396(-55);
                return;
            }
            if (arg0 == 3346) {
                field2791[field2782++] = class385.method2333((byte) -42);
                return;
            }
            if (arg0 == 3347) {
                field2791[field2782++] = class334.field4666;
                return;
            }
        } else if (arg0 < 3500) {
            if (arg0 == 3400) {
                field2782 -= 2;
                int var145 = field2791[field2782];
                int var146 = field2791[field2782 + 1];
                class503 var147 = class292.field3790.method3682(var145, (byte) -87);
                field2792[field2793++] = var147.method2813(true, var146);
                return;
            }
            if (arg0 == 3408) {
                field2782 -= 4;
                int var148 = field2791[field2782];
                int var149 = field2791[field2782 + 1];
                int var150 = field2791[field2782 + 2];
                int var151 = field2791[field2782 + 3];
                class503 var152 = class292.field3790.method3682(var150, (byte) -86);
                if (var152.field7005 == var148 && var152.field7004 == var149) {
                    if (var149 == 115) {
                        field2792[field2793++] = var152.method2813(true, var151);
                        return;
                    }
                    field2791[field2782++] = var152.method2805(true, var151);
                    return;
                }
                throw new RuntimeException("C3408-1");
            }
            if (arg0 == 3409) {
                field2782 -= 3;
                int var153 = field2791[field2782];
                int var154 = field2791[field2782 + 1];
                int var155 = field2791[field2782 + 2];
                if (var154 == -1) {
                    throw new RuntimeException("C3409-2");
                }
                class503 var156 = class292.field3790.method3682(var154, (byte) -84);
                if (var156.field7004 != var153) {
                    throw new RuntimeException("C3409-1");
                }
                field2791[field2782++] = var156.method2808((byte) 98, var155) ? 1 : 0;
                return;
            }
            if (arg0 == 3410) {
                int var157 = field2791[--field2782];
                String var158 = field2792[--field2793];
                if (var157 == -1) {
                    throw new RuntimeException("C3410-2");
                }
                class503 var159 = class292.field3790.method3682(var157, (byte) -74);
                if (var159.field7004 != 's') {
                    throw new RuntimeException("C3410-1");
                }
                field2791[field2782++] = var159.method2812(var158, -6438) ? 1 : 0;
                return;
            }
            if (arg0 == 3411) {
                int var160 = field2791[--field2782];
                class503 var161 = class292.field3790.method3682(var160, (byte) 102);
                field2791[field2782++] = var161.field6993.method3480(-24064);
                return;
            }
        } else if (arg0 < 3700) {
            if (arg0 == 3600) {
                if (class410.field5632 == 0) {
                    field2791[field2782++] = -2;
                    return;
                }
                if (class410.field5632 == 1) {
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = class447.field6284;
                return;
            }
            if (arg0 == 3601) {
                int var162 = field2791[--field2782];
                if (class410.field5632 == 2 && var162 < class447.field6284) {
                    field2792[field2793++] = class395.field5457[var162];
                    if (class71.field964[var162] != null) {
                        field2792[field2793++] = class71.field964[var162];
                        return;
                    }
                    field2792[field2793++] = "";
                    return;
                }
                field2792[field2793++] = "";
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 3602) {
                int var163 = field2791[--field2782];
                if (class410.field5632 == 2 && var163 < class447.field6284) {
                    field2791[field2782++] = class337.field4722[var163];
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3603) {
                int var164 = field2791[--field2782];
                if (class410.field5632 == 2 && var164 < class447.field6284) {
                    field2791[field2782++] = class489.field6800[var164];
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3604) {
                String var165 = field2792[--field2793];
                int var166 = field2791[--field2782];
                class538.method2992(var166, var165, 2);
                return;
            }
            if (arg0 == 3605) {
                String var167 = field2792[--field2793];
                class284.method1764(var167, 84);
                return;
            }
            if (arg0 == 3606) {
                String var168 = field2792[--field2793];
                class506.method2831(28688, var168);
                return;
            }
            if (arg0 == 3607) {
                String var169 = field2792[--field2793];
                class600.method3454(false, var169, (byte) 72);
                return;
            }
            if (arg0 == 3608) {
                String var170 = field2792[--field2793];
                class579.method3257(-85, var170);
                return;
            }
            if (arg0 == 3609) {
                String var171 = field2792[--field2793];
                if (var171.startsWith("<img=0>") || var171.startsWith("<img=1>")) {
                    var171 = var171.substring(7);
                }
                field2791[field2782++] = class552.method3096(var171, (byte) 100) ? 1 : 0;
                return;
            }
            if (arg0 == 3610) {
                int var172 = field2791[--field2782];
                if (class410.field5632 == 2 && var172 < class447.field6284) {
                    field2792[field2793++] = class610.field8767[var172];
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 3611) {
                if (class99.field1331 != null) {
                    field2792[field2793++] = class641.method3700(false, class99.field1331);
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 3612) {
                if (class99.field1331 != null) {
                    field2791[field2782++] = class323.field4445;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3613) {
                int var173 = field2791[--field2782];
                if (class99.field1331 != null && var173 < class323.field4445) {
                    field2792[field2793++] = class633.field9207[var173].field7333;
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 3614) {
                int var174 = field2791[--field2782];
                if (class99.field1331 != null && var174 < class323.field4445) {
                    field2791[field2782++] = class633.field9207[var174].field7330;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3615) {
                int var175 = field2791[--field2782];
                if (class99.field1331 != null && var175 < class323.field4445) {
                    field2791[field2782++] = class633.field9207[var175].field7332;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3616) {
                field2791[field2782++] = class123.field1538;
                return;
            }
            if (arg0 == 3617) {
                String var176 = field2792[--field2793];
                class298.method1832(120, var176);
                return;
            }
            if (arg0 == 3618) {
                field2791[field2782++] = class492.field6877;
                return;
            }
            if (arg0 == 3619) {
                String var177 = field2792[--field2793];
                class198.method1266(var177, 71);
                return;
            }
            if (arg0 == 3620) {
                class358.method2223(true);
                return;
            }
            if (arg0 == 3621) {
                if (class410.field5632 == 0) {
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = class466.field6613;
                return;
            }
            if (arg0 == 3622) {
                int var178 = field2791[--field2782];
                if (class410.field5632 != 0 && var178 < class466.field6613) {
                    field2792[field2793++] = class546.field7616[var178];
                    if (class282.field3694[var178] != null) {
                        field2792[field2793++] = class282.field3694[var178];
                        return;
                    }
                    field2792[field2793++] = "";
                    return;
                }
                field2792[field2793++] = "";
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 3623) {
                String var179 = field2792[--field2793];
                if (var179.startsWith("<img=0>") || var179.startsWith("<img=1>")) {
                    var179 = var179.substring(7);
                }
                field2791[field2782++] = class442.method2564(var179, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 3624) {
                int var180 = field2791[--field2782];
                if (class633.field9207 != null && var180 < class323.field4445 && class633.field9207[var180].field7328.equalsIgnoreCase(class147.field1899.field257)) {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3625) {
                if (class502.field6983 != null) {
                    field2792[field2793++] = class502.field6983;
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 3626) {
                int var181 = field2791[--field2782];
                if (class99.field1331 != null && var181 < class323.field4445) {
                    field2792[field2793++] = class633.field9207[var181].field7329;
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 3627) {
                int var182 = field2791[--field2782];
                if (class410.field5632 == 2 && var182 >= 0 && var182 < class447.field6284) {
                    field2791[field2782++] = class215.field2761[var182] ? 1 : 0;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 3628) {
                String var183 = field2792[--field2793];
                if (var183.startsWith("<img=0>") || var183.startsWith("<img=1>")) {
                    var183 = var183.substring(7);
                }
                field2791[field2782++] = class377.method2303(0, var183);
                return;
            }
            if (arg0 == 3629) {
                field2791[field2782++] = class553.field7740;
                return;
            }
            if (arg0 == 3630) {
                String var184 = field2792[--field2793];
                class600.method3454(true, var184, (byte) 72);
                return;
            }
            if (arg0 == 3631) {
                int var185 = field2791[--field2782];
                field2791[field2782++] = class404.field5535[var185] ? 1 : 0;
                return;
            }
            if (arg0 == 3632) {
                int var186 = field2791[--field2782];
                if (class99.field1331 != null && var186 < class323.field4445) {
                    field2792[field2793++] = class633.field9207[var186].field7328;
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 3633) {
                int var187 = field2791[--field2782];
                if (class410.field5632 != 0 && var187 < class466.field6613) {
                    field2792[field2793++] = class126.field1572[var187];
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
        } else if (arg0 < 4000) {
            if (arg0 == 3903) {
                int var188 = field2791[--field2782];
                field2791[field2782++] = class615.field8867[var188].method1217(-28074);
                return;
            }
            if (arg0 == 3904) {
                int var189 = field2791[--field2782];
                field2791[field2782++] = class615.field8867[var189].field2460;
                return;
            }
            if (arg0 == 3905) {
                int var190 = field2791[--field2782];
                field2791[field2782++] = class615.field8867[var190].field2464;
                return;
            }
            if (arg0 == 3906) {
                int var191 = field2791[--field2782];
                field2791[field2782++] = class615.field8867[var191].field2450;
                return;
            }
            if (arg0 == 3907) {
                int var192 = field2791[--field2782];
                field2791[field2782++] = class615.field8867[var192].field2462;
                return;
            }
            if (arg0 == 3908) {
                int var193 = field2791[--field2782];
                field2791[field2782++] = class615.field8867[var193].field2455;
                return;
            }
            if (arg0 == 3910) {
                int var194 = field2791[--field2782];
                int var195 = class615.field8867[var194].method1219(7);
                field2791[field2782++] = var195 == 0 ? 1 : 0;
                return;
            }
            if (arg0 == 3911) {
                int var196 = field2791[--field2782];
                int var197 = class615.field8867[var196].method1219(7);
                field2791[field2782++] = var197 == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 3912) {
                int var198 = field2791[--field2782];
                int var199 = class615.field8867[var198].method1219(7);
                field2791[field2782++] = var199 == 5 ? 1 : 0;
                return;
            }
            if (arg0 == 3913) {
                int var200 = field2791[--field2782];
                int var201 = class615.field8867[var200].method1219(7);
                field2791[field2782++] = var201 == 1 ? 1 : 0;
                return;
            }
        } else if (arg0 < 4100) {
            if (arg0 == 4000) {
                field2782 -= 2;
                int var202 = field2791[field2782];
                int var203 = field2791[field2782 + 1];
                field2791[field2782++] = var202 + var203;
                return;
            }
            if (arg0 == 4001) {
                field2782 -= 2;
                int var204 = field2791[field2782];
                int var205 = field2791[field2782 + 1];
                field2791[field2782++] = var204 - var205;
                return;
            }
            if (arg0 == 4002) {
                field2782 -= 2;
                int var206 = field2791[field2782];
                int var207 = field2791[field2782 + 1];
                field2791[field2782++] = var206 * var207;
                return;
            }
            if (arg0 == 4003) {
                field2782 -= 2;
                int var208 = field2791[field2782];
                int var209 = field2791[field2782 + 1];
                field2791[field2782++] = var208 / var209;
                return;
            }
            if (arg0 == 4004) {
                int var210 = field2791[--field2782];
                field2791[field2782++] = (int) (Math.random() * (double) var210);
                return;
            }
            if (arg0 == 4005) {
                int var211 = field2791[--field2782];
                field2791[field2782++] = (int) (Math.random() * (double) (var211 + 1));
                return;
            }
            if (arg0 == 4006) {
                field2782 -= 5;
                int var212 = field2791[field2782];
                int var213 = field2791[field2782 + 1];
                int var214 = field2791[field2782 + 2];
                int var215 = field2791[field2782 + 3];
                int var216 = field2791[field2782 + 4];
                field2791[field2782++] = (var213 - var212) * (var216 - var214) / (var215 - var214) + var212;
                return;
            }
            if (arg0 == 4007) {
                field2782 -= 2;
                long var217 = (long) field2791[field2782];
                long var219 = (long) field2791[field2782 + 1];
                field2791[field2782++] = (int) (var217 * var219 / 100L + var217);
                return;
            }
            if (arg0 == 4008) {
                field2782 -= 2;
                int var221 = field2791[field2782];
                int var222 = field2791[field2782 + 1];
                field2791[field2782++] = var221 | 0x1 << var222;
                return;
            }
            if (arg0 == 4009) {
                field2782 -= 2;
                int var223 = field2791[field2782];
                int var224 = field2791[field2782 + 1];
                field2791[field2782++] = var223 & -(0x1 << var224) - 1;
                return;
            }
            if (arg0 == 4010) {
                field2782 -= 2;
                int var225 = field2791[field2782];
                int var226 = field2791[field2782 + 1];
                field2791[field2782++] = (var225 & 0x1 << var226) == 0 ? 0 : 1;
                return;
            }
            if (arg0 == 4011) {
                field2782 -= 2;
                int var227 = field2791[field2782];
                int var228 = field2791[field2782 + 1];
                field2791[field2782++] = var227 % var228;
                return;
            }
            if (arg0 == 4012) {
                field2782 -= 2;
                int var229 = field2791[field2782];
                int var230 = field2791[field2782 + 1];
                if (var229 == 0) {
                    field2791[field2782++] = 0;
                    return;
                }
                field2791[field2782++] = (int) Math.pow((double) var229, (double) var230);
                return;
            }
            if (arg0 == 4013) {
                field2782 -= 2;
                int var231 = field2791[field2782];
                int var232 = field2791[field2782 + 1];
                if (var231 == 0) {
                    field2791[field2782++] = 0;
                    return;
                }
                if (var232 == 0) {
                    field2791[field2782++] = Integer.MAX_VALUE;
                    return;
                }
                field2791[field2782++] = (int) Math.pow((double) var231, 1.0D / (double) var232);
                return;
            }
            if (arg0 == 4014) {
                field2782 -= 2;
                int var233 = field2791[field2782];
                int var234 = field2791[field2782 + 1];
                field2791[field2782++] = var233 & var234;
                return;
            }
            if (arg0 == 4015) {
                field2782 -= 2;
                int var235 = field2791[field2782];
                int var236 = field2791[field2782 + 1];
                field2791[field2782++] = var235 | var236;
                return;
            }
            if (arg0 == 4016) {
                field2782 -= 2;
                int var237 = field2791[field2782];
                int var238 = field2791[field2782 + 1];
                field2791[field2782++] = var237 < var238 ? var237 : var238;
                return;
            }
            if (arg0 == 4017) {
                field2782 -= 2;
                int var239 = field2791[field2782];
                int var240 = field2791[field2782 + 1];
                field2791[field2782++] = var239 > var240 ? var239 : var240;
                return;
            }
            if (arg0 == 4018) {
                field2782 -= 3;
                long var241 = (long) field2791[field2782];
                long var243 = (long) field2791[field2782 + 1];
                long var245 = (long) field2791[field2782 + 2];
                field2791[field2782++] = (int) (var241 * var245 / var243);
                return;
            }
        } else if (arg0 < 4200) {
            if (arg0 == 4100) {
                String var247 = field2792[--field2793];
                int var248 = field2791[--field2782];
                field2792[field2793++] = var247 + var248;
                return;
            }
            if (arg0 == 4101) {
                field2793 -= 2;
                String var249 = field2792[field2793];
                String var250 = field2792[field2793 + 1];
                field2792[field2793++] = var249 + var250;
                return;
            }
            if (arg0 == 4102) {
                String var251 = field2792[--field2793];
                int var252 = field2791[--field2782];
                field2792[field2793++] = var251 + class107.method586(-1, true, var252);
                return;
            }
            if (arg0 == 4103) {
                String var253 = field2792[--field2793];
                field2792[field2793++] = var253.toLowerCase();
                return;
            }
            if (arg0 == 4104) {
                field2792[field2793++] = method1405(field2791[--field2782]);
                return;
            }
            if (arg0 == 4105) {
                field2793 -= 2;
                String var254 = field2792[field2793];
                String var255 = field2792[field2793 + 1];
                if (class147.field1899.field274 != null && class147.field1899.field274.field7451) {
                    field2792[field2793++] = var255;
                    return;
                }
                field2792[field2793++] = var254;
                return;
            }
            if (arg0 == 4106) {
                int var256 = field2791[--field2782];
                field2792[field2793++] = Integer.toString(var256);
                return;
            }
            if (arg0 == 4107) {
                field2793 -= 2;
                field2791[field2782++] = class550.method3031(field2792[field2793 + 1], class245.field3103, (byte) -52, field2792[field2793]);
                return;
            }
            if (arg0 == 4108) {
                String var257 = field2792[--field2793];
                field2782 -= 2;
                int var258 = field2791[field2782];
                int var259 = field2791[field2782 + 1];
                class157 var260 = class477.method2705(var259, 0, (byte) -26, class532.field7434);
                field2791[field2782++] = var260.method858(-28763, class44.field632, var257, var258);
                return;
            }
            if (arg0 == 4109) {
                String var261 = field2792[--field2793];
                field2782 -= 2;
                int var262 = field2791[field2782];
                int var263 = field2791[field2782 + 1];
                class157 var264 = class477.method2705(var263, 0, (byte) -26, class532.field7434);
                field2791[field2782++] = var264.method862(class44.field632, var262, -27128, var261);
                return;
            }
            if (arg0 == 4110) {
                field2793 -= 2;
                String var265 = field2792[field2793];
                String var266 = field2792[field2793 + 1];
                if (field2791[--field2782] == 1) {
                    field2792[field2793++] = var265;
                    return;
                }
                field2792[field2793++] = var266;
                return;
            }
            if (arg0 == 4111) {
                String var267 = field2792[--field2793];
                field2792[field2793++] = class545.method3016(var267, (byte) -125);
                return;
            }
            if (arg0 == 4112) {
                String var268 = field2792[--field2793];
                int var269 = field2791[--field2782];
                if (var269 == -1) {
                    throw new RuntimeException("null char");
                }
                field2792[field2793++] = var268 + (char) var269;
                return;
            }
            if (arg0 == 4113) {
                int var270 = field2791[--field2782];
                field2791[field2782++] = class227.method1435(-2618, (char) var270) ? 1 : 0;
                return;
            }
            if (arg0 == 4114) {
                int var271 = field2791[--field2782];
                field2791[field2782++] = class506.method2834((char) var271, 106) ? 1 : 0;
                return;
            }
            if (arg0 == 4115) {
                int var272 = field2791[--field2782];
                field2791[field2782++] = class456.method2644((char) var272, 0) ? 1 : 0;
                return;
            }
            if (arg0 == 4116) {
                int var273 = field2791[--field2782];
                field2791[field2782++] = class2.method3(true, (char) var273) ? 1 : 0;
                return;
            }
            if (arg0 == 4117) {
                String var274 = field2792[--field2793];
                if (var274 != null) {
                    field2791[field2782++] = var274.length();
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 4118) {
                String var275 = field2792[--field2793];
                field2782 -= 2;
                int var276 = field2791[field2782];
                int var277 = field2791[field2782 + 1];
                field2792[field2793++] = var275.substring(var276, var277);
                return;
            }
            if (arg0 == 4119) {
                String var278 = field2792[--field2793];
                StringBuffer var279 = new StringBuffer(var278.length());
                boolean var280 = false;
                for (int var281 = 0; var281 < var278.length(); var281++) {
                    char var282 = var278.charAt(var281);
                    if (var282 == '<') {
                        var280 = true;
                    } else if (var282 == '>') {
                        var280 = false;
                    } else if (!var280) {
                        var279.append(var282);
                    }
                }
                field2792[field2793++] = var279.toString();
                return;
            }
            if (arg0 == 4120) {
                String var283 = field2792[--field2793];
                field2782 -= 2;
                int var284 = field2791[field2782];
                int var285 = field2791[field2782 + 1];
                field2791[field2782++] = var283.indexOf(var284, var285);
                return;
            }
            if (arg0 == 4121) {
                field2793 -= 2;
                String var286 = field2792[field2793];
                String var287 = field2792[field2793 + 1];
                int var288 = field2791[--field2782];
                field2791[field2782++] = var286.indexOf(var287, var288);
                return;
            }
            if (arg0 == 4122) {
                int var289 = field2791[--field2782];
                field2791[field2782++] = Character.toLowerCase((char) var289);
                return;
            }
            if (arg0 == 4123) {
                int var290 = field2791[--field2782];
                field2791[field2782++] = Character.toUpperCase((char) var290);
                return;
            }
            if (arg0 == 4124) {
                boolean var291 = field2791[--field2782] != 0;
                int var292 = field2791[--field2782];
                field2792[field2793++] = class249.method1526(var291, (long) var292, 0, class245.field3103, 0);
                return;
            }
            if (arg0 == 4125) {
                String var293 = field2792[--field2793];
                int var294 = field2791[--field2782];
                class157 var295 = class477.method2705(var294, 0, (byte) -26, class532.field7434);
                field2791[field2782++] = var295.method853(var293, class44.field632, 1);
                return;
            }
        } else if (arg0 < 4300) {
            if (arg0 == 4200) {
                int var296 = field2791[--field2782];
                field2792[field2793++] = class98.field1307.method3391(0, var296).field6471;
                return;
            }
            if (arg0 == 4201) {
                field2782 -= 2;
                int var297 = field2791[field2782];
                int var298 = field2791[field2782 + 1];
                class456 var299 = class98.field1307.method3391(0, var297);
                if (var298 >= 1 && var298 <= 5 && var299.field6522[var298 - 1] != null) {
                    field2792[field2793++] = var299.field6522[var298 - 1];
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 4202) {
                field2782 -= 2;
                int var300 = field2791[field2782];
                int var301 = field2791[field2782 + 1];
                class456 var302 = class98.field1307.method3391(0, var300);
                if (var301 >= 1 && var301 <= 5 && var302.field6461[var301 - 1] != null) {
                    field2792[field2793++] = var302.field6461[var301 - 1];
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 4203) {
                int var303 = field2791[--field2782];
                field2791[field2782++] = class98.field1307.method3391(0, var303).field6498;
                return;
            }
            if (arg0 == 4204) {
                int var304 = field2791[--field2782];
                field2791[field2782++] = class98.field1307.method3391(0, var304).field6477 == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 4205) {
                int var305 = field2791[--field2782];
                class456 var306 = class98.field1307.method3391(0, var305);
                if (var306.field6484 == -1 && var306.field6481 >= 0) {
                    field2791[field2782++] = var306.field6481;
                    return;
                }
                field2791[field2782++] = var305;
                return;
            }
            if (arg0 == 4206) {
                int var307 = field2791[--field2782];
                class456 var308 = class98.field1307.method3391(0, var307);
                if (var308.field6484 >= 0 && var308.field6481 >= 0) {
                    field2791[field2782++] = var308.field6481;
                    return;
                }
                field2791[field2782++] = var307;
                return;
            }
            if (arg0 == 4207) {
                int var309 = field2791[--field2782];
                field2791[field2782++] = class98.field1307.method3391(0, var309).field6447 ? 1 : 0;
                return;
            }
            if (arg0 == 4208) {
                field2782 -= 2;
                int var310 = field2791[field2782];
                int var311 = field2791[field2782 + 1];
                class360 var312 = class132.field1621.method151(var311, -105);
                if (var312.method2232(-116)) {
                    field2792[field2793++] = class98.field1307.method3391(0, var310).method2645(var312.field5024, -5181, var311);
                    return;
                }
                field2791[field2782++] = class98.field1307.method3391(0, var310).method2654(var312.field5020, 0, var311);
                return;
            }
            if (arg0 == 4209) {
                field2782 -= 2;
                int var313 = field2791[field2782];
                int var314 = field2791[field2782 + 1] - 1;
                class456 var315 = class98.field1307.method3391(0, var313);
                if (var315.field6482 == var314) {
                    field2791[field2782++] = var315.field6475;
                    return;
                }
                if (var315.field6487 == var314) {
                    field2791[field2782++] = var315.field6525;
                    return;
                }
                field2791[field2782++] = -1;
                return;
            }
            if (arg0 == 4210) {
                String var316 = field2792[--field2793];
                int var317 = field2791[--field2782];
                class596.method3433(var317 == 1, -22907, var316);
                field2791[field2782++] = class590.field8520;
                return;
            }
            if (arg0 == 4211) {
                if (class369.field5144 != null && class577.field8037 < class590.field8520) {
                    field2791[field2782++] = class369.field5144[class577.field8037++] & 0xFFFF;
                    return;
                }
                field2791[field2782++] = -1;
                return;
            }
            if (arg0 == 4212) {
                class577.field8037 = 0;
                return;
            }
        } else if (arg0 < 4400) {
            if (arg0 == 4300) {
                field2782 -= 2;
                int var318 = field2791[field2782];
                int var319 = field2791[field2782 + 1];
                class360 var320 = class132.field1621.method151(var319, 71);
                if (var320.method2232(-116)) {
                    field2792[field2793++] = class579.field8053.method3623(var318, (byte) 31).method3609(var319, var320.field5024, -10770);
                    return;
                }
                field2791[field2782++] = class579.field8053.method3623(var318, (byte) 42).method3617(15983, var319, var320.field5020);
                return;
            }
        } else if (arg0 < 4500) {
            if (arg0 == 4400) {
                field2782 -= 2;
                int var321 = field2791[field2782];
                int var322 = field2791[field2782 + 1];
                class360 var323 = class132.field1621.method151(var322, -102);
                if (var323.method2232(-116)) {
                    field2792[field2793++] = class626.field9084.method1093(0, var321).method724(var322, (byte) -58, var323.field5024);
                    return;
                }
                field2791[field2782++] = class626.field9084.method1093(0, var321).method716(var322, 41, var323.field5020);
                return;
            }
        } else if (arg0 < 4600) {
            if (arg0 == 4500) {
                field2782 -= 2;
                int var324 = field2791[field2782];
                int var325 = field2791[field2782 + 1];
                class360 var326 = class132.field1621.method151(var325, 31);
                if (var326.method2232(-116)) {
                    field2792[field2793++] = class452.field6400.method685(31253, var324).method2985(-21928, var326.field5024, var325);
                    return;
                }
                field2791[field2782++] = class452.field6400.method685(31253, var324).method2983(var325, true, var326.field5020);
                return;
            }
        } else if (arg0 < 4700 && arg0 == 4600) {
            int var327 = field2791[--field2782];
            class362 var328 = class217.field2772.method1473(var327, -51);
            if (var328.field5080 != null && var328.field5080.length > 0) {
                int var329 = 0;
                int var330 = var328.field5078[0];
                for (int var331 = 1; var331 < var328.field5080.length; var331++) {
                    if (var328.field5078[var331] > var330) {
                        var329 = var331;
                        var330 = var328.field5078[var331];
                    }
                }
                field2791[field2782++] = var328.field5080[var329];
                return;
            }
            field2791[field2782++] = var328.field5033;
            return;
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method1401(String arg0, int arg1) {
        if (class615.field8876 == 0 && !(!class162.field2065 || class586.field8498) || class591.field8543) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class641.field9301.method2157(0, 4074))) {
            var3 = 0;
            arg0 = arg0.substring(class641.field9301.method2157(0, 4074).length());
        } else if (var2.startsWith(class136.field1659.method2157(0, 4074))) {
            var3 = 1;
            arg0 = arg0.substring(class136.field1659.method2157(0, 4074).length());
        } else if (var2.startsWith(class317.field4369.method2157(0, 4074))) {
            var3 = 2;
            arg0 = arg0.substring(class317.field4369.method2157(0, 4074).length());
        } else if (var2.startsWith(class565.field7918.method2157(0, 4074))) {
            var3 = 3;
            arg0 = arg0.substring(class565.field7918.method2157(0, 4074).length());
        } else if (var2.startsWith(class607.field8733.method2157(0, 4074))) {
            var3 = 4;
            arg0 = arg0.substring(class607.field8733.method2157(0, 4074).length());
        } else if (var2.startsWith(class103.field1358.method2157(0, 4074))) {
            var3 = 5;
            arg0 = arg0.substring(class103.field1358.method2157(0, 4074).length());
        } else if (var2.startsWith(class477.field6712.method2157(0, 4074))) {
            var3 = 6;
            arg0 = arg0.substring(class477.field6712.method2157(0, 4074).length());
        } else if (var2.startsWith(class457.field6529.method2157(0, 4074))) {
            var3 = 7;
            arg0 = arg0.substring(class457.field6529.method2157(0, 4074).length());
        } else if (var2.startsWith(class31.field485.method2157(0, 4074))) {
            var3 = 8;
            arg0 = arg0.substring(class31.field485.method2157(0, 4074).length());
        } else if (var2.startsWith(class521.field7255.method2157(0, 4074))) {
            var3 = 9;
            arg0 = arg0.substring(class521.field7255.method2157(0, 4074).length());
        } else if (var2.startsWith(class611.field8778.method2157(0, 4074))) {
            var3 = 10;
            arg0 = arg0.substring(class611.field8778.method2157(0, 4074).length());
        } else if (var2.startsWith(class516.field7206.method2157(0, 4074))) {
            var3 = 11;
            arg0 = arg0.substring(class516.field7206.method2157(0, 4074).length());
        } else if (class245.field3103 != 0) {
            if (var2.startsWith(class641.field9301.method2157(class245.field3103, 4074))) {
                var3 = 0;
                arg0 = arg0.substring(class641.field9301.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class136.field1659.method2157(class245.field3103, 4074))) {
                var3 = 1;
                arg0 = arg0.substring(class136.field1659.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class317.field4369.method2157(class245.field3103, 4074))) {
                var3 = 2;
                arg0 = arg0.substring(class317.field4369.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class565.field7918.method2157(class245.field3103, 4074))) {
                var3 = 3;
                arg0 = arg0.substring(class565.field7918.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class607.field8733.method2157(class245.field3103, 4074))) {
                var3 = 4;
                arg0 = arg0.substring(class607.field8733.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class103.field1358.method2157(class245.field3103, 4074))) {
                var3 = 5;
                arg0 = arg0.substring(class103.field1358.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class477.field6712.method2157(class245.field3103, 4074))) {
                var3 = 6;
                arg0 = arg0.substring(class477.field6712.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class457.field6529.method2157(class245.field3103, 4074))) {
                var3 = 7;
                arg0 = arg0.substring(class457.field6529.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class31.field485.method2157(class245.field3103, 4074))) {
                var3 = 8;
                arg0 = arg0.substring(class31.field485.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class521.field7255.method2157(class245.field3103, 4074))) {
                var3 = 9;
                arg0 = arg0.substring(class521.field7255.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class611.field8778.method2157(class245.field3103, 4074))) {
                var3 = 10;
                arg0 = arg0.substring(class611.field8778.method2157(class245.field3103, 4074).length());
            } else if (var2.startsWith(class516.field7206.method2157(class245.field3103, 4074))) {
                var3 = 11;
                arg0 = arg0.substring(class516.field7206.method2157(class245.field3103, 4074).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class418.field5716.method2157(0, 4074))) {
            var5 = 1;
            arg0 = arg0.substring(class418.field5716.method2157(0, 4074).length());
        } else if (var4.startsWith(class201.field2631.method2157(0, 4074))) {
            var5 = 2;
            arg0 = arg0.substring(class201.field2631.method2157(0, 4074).length());
        } else if (var4.startsWith(class95.field1275.method2157(0, 4074))) {
            var5 = 3;
            arg0 = arg0.substring(class95.field1275.method2157(0, 4074).length());
        } else if (var4.startsWith(class392.field5438.method2157(0, 4074))) {
            var5 = 4;
            arg0 = arg0.substring(class392.field5438.method2157(0, 4074).length());
        } else if (var4.startsWith(class155.field2016.method2157(0, 4074))) {
            var5 = 5;
            arg0 = arg0.substring(class155.field2016.method2157(0, 4074).length());
        } else if (class245.field3103 != 0) {
            if (var4.startsWith(class418.field5716.method2157(class245.field3103, 4074))) {
                var5 = 1;
                arg0 = arg0.substring(class418.field5716.method2157(class245.field3103, 4074).length());
            } else if (var4.startsWith(class201.field2631.method2157(class245.field3103, 4074))) {
                var5 = 2;
                arg0 = arg0.substring(class201.field2631.method2157(class245.field3103, 4074).length());
            } else if (var4.startsWith(class95.field1275.method2157(class245.field3103, 4074))) {
                var5 = 3;
                arg0 = arg0.substring(class95.field1275.method2157(class245.field3103, 4074).length());
            } else if (var4.startsWith(class392.field5438.method2157(class245.field3103, 4074))) {
                var5 = 4;
                arg0 = arg0.substring(class392.field5438.method2157(class245.field3103, 4074).length());
            } else if (var4.startsWith(class155.field2016.method2157(class245.field3103, 4074))) {
                var5 = 5;
                arg0 = arg0.substring(class155.field2016.method2157(class245.field3103, 4074).length());
            }
        }
        field2795++;
        class118.method650(true, class18.field205);
        class272.field3457.method3060(0, -25098);
        int var6 = class272.field3457.field7707;
        class272.field3457.method3060(var3, -25098);
        class272.field3457.method3060(var5, -25098);
        class345.method2159(class272.field3457, 2016149504, arg0);
        class272.field3457.method3084((byte) -126, class272.field3457.field7707 - var6);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(IZ)V")
    private static final void method1402(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field2791[field2782++] = class20.field296;
                return;
            }
            if (arg0 == 5001) {
                field2782 -= 3;
                class20.field296 = field2791[field2782];
                class72.field995 = class99.method554(field2791[field2782 + 1], -14821);
                if (class72.field995 == null) {
                    class72.field995 = class93.field1237;
                }
                class594.field8570 = field2791[field2782 + 2];
                field2790++;
                class118.method650(true, class8.field65);
                class272.field3457.method3060(class20.field296, -25098);
                class272.field3457.method3060(class72.field995.field627, -25098);
                class272.field3457.method3060(class594.field8570, -25098);
                return;
            }
            if (arg0 == 5002) {
                field2793 -= 2;
                String var2 = field2792[field2793];
                String var3 = field2792[field2793 + 1];
                field2782 -= 2;
                int var4 = field2791[field2782];
                int var5 = field2791[field2782 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field2798++;
                class118.method650(true, class157.field2048);
                class272.field3457.method3060(class194.method1241(var2, -123) + class194.method1241(var3, -121) + 2, -25098);
                class272.field3457.method3040(false, var2);
                class272.field3457.method3060(var4 - 1, -25098);
                class272.field3457.method3060(var5, -25098);
                class272.field3457.method3040(false, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field2791[--field2782];
                class530 var7 = class405.method2418(var6, true);
                String var8 = "";
                if (var7 != null && var7.field7405 != null) {
                    var8 = var7.field7405;
                }
                field2792[field2793++] = var8;
                return;
            }
            if (arg0 == 5004) {
                int var9 = field2791[--field2782];
                class530 var10 = class405.method2418(var9, true);
                int var11 = -1;
                if (var10 != null) {
                    var11 = var10.field7410;
                }
                field2791[field2782++] = var11;
                return;
            }
            if (arg0 == 5005) {
                if (class72.field995 == null) {
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = class72.field995.field627;
                return;
            }
            if (arg0 == 5006) {
                int var12 = field2791[--field2782];
                class118.method650(true, class556.field7771);
                class272.field3457.method3060(var12, -25098);
                return;
            }
            if (arg0 == 5008) {
                String var13 = field2792[--field2793];
                method1401(var13, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2793 -= 2;
                String var14 = field2792[field2793];
                String var15 = field2792[field2793 + 1];
                if (class615.field8876 != 0 || (!class162.field2065 || class586.field8498) && !class591.field8543) {
                    field2784++;
                    class118.method650(true, class102.field1344);
                    class272.field3457.method3060(0, -25098);
                    int var16 = class272.field3457.field7707;
                    class272.field3457.method3040(false, var14);
                    class345.method2159(class272.field3457, 2016149504, var15);
                    class272.field3457.method3084((byte) -115, class272.field3457.field7707 - var16);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var17 = field2791[--field2782];
                class530 var18 = class405.method2418(var17, true);
                String var19 = "";
                if (var18 != null && var18.field7409 != null) {
                    var19 = var18.field7409;
                }
                field2792[field2793++] = var19;
                return;
            }
            if (arg0 == 5011) {
                int var20 = field2791[--field2782];
                class530 var21 = class405.method2418(var20, true);
                String var22 = "";
                if (var21 != null && var21.field7399 != null) {
                    var22 = var21.field7399;
                }
                field2792[field2793++] = var22;
                return;
            }
            if (arg0 == 5012) {
                int var23 = field2791[--field2782];
                class530 var24 = class405.method2418(var23, true);
                int var25 = -1;
                if (var24 != null) {
                    var25 = var24.field7401;
                }
                field2791[field2782++] = var25;
                return;
            }
            if (arg0 == 5015) {
                String var26;
                if (class147.field1899 == null || class147.field1899.field267 == null) {
                    var26 = class111.field1441;
                } else {
                    var26 = class147.field1899.method110(-1, true);
                }
                field2792[field2793++] = var26;
                return;
            }
            if (arg0 == 5016) {
                field2791[field2782++] = class594.field8570;
                return;
            }
            if (arg0 == 5017) {
                field2791[field2782++] = class292.method1788((byte) 100);
                return;
            }
            if (arg0 == 5018) {
                int var27 = field2791[--field2782];
                class530 var28 = class405.method2418(var27, true);
                int var29 = 0;
                if (var28 != null) {
                    var29 = var28.field7403;
                }
                field2791[field2782++] = var29;
                return;
            }
            if (arg0 == 5019) {
                int var30 = field2791[--field2782];
                class530 var31 = class405.method2418(var30, true);
                String var32 = "";
                if (var31 != null && var31.field7407 != null) {
                    var32 = var31.field7407;
                }
                field2792[field2793++] = var32;
                return;
            }
            if (arg0 == 5020) {
                String var33;
                if (class147.field1899 == null || class147.field1899.field267 == null) {
                    var33 = class111.field1441;
                } else {
                    var33 = class147.field1899.method106(-1, false);
                }
                field2792[field2793++] = var33;
                return;
            }
            if (arg0 == 5023) {
                int var34 = field2791[--field2782];
                class530 var35 = class405.method2418(var34, true);
                int var36 = -1;
                if (var35 != null) {
                    var36 = var35.field7402;
                }
                field2791[field2782++] = var36;
                return;
            }
            if (arg0 == 5024) {
                int var37 = field2791[--field2782];
                class530 var38 = class405.method2418(var37, true);
                int var39 = -1;
                if (var38 != null) {
                    var39 = var38.field7412;
                }
                field2791[field2782++] = var39;
                return;
            }
            if (arg0 == 5050) {
                int var40 = field2791[--field2782];
                field2792[field2793++] = class181.field2328.method2349(32768, var40).field8634;
                return;
            }
            if (arg0 == 5051) {
                int var41 = field2791[--field2782];
                class598 var42 = class181.field2328.method2349(32768, var41);
                if (var42.field8630 == null) {
                    field2791[field2782++] = 0;
                    return;
                }
                field2791[field2782++] = var42.field8630.length;
                return;
            }
            if (arg0 == 5052) {
                field2782 -= 2;
                int var43 = field2791[field2782];
                int var44 = field2791[field2782 + 1];
                class598 var45 = class181.field2328.method2349(32768, var43);
                int var46 = var45.field8630[var44];
                field2791[field2782++] = var46;
                return;
            }
            if (arg0 == 5053) {
                int var47 = field2791[--field2782];
                class598 var48 = class181.field2328.method2349(32768, var47);
                if (var48.field8635 == null) {
                    field2791[field2782++] = 0;
                    return;
                }
                field2791[field2782++] = var48.field8635.length;
                return;
            }
            if (arg0 == 5054) {
                field2782 -= 2;
                int var49 = field2791[field2782];
                int var50 = field2791[field2782 + 1];
                field2791[field2782++] = class181.field2328.method2349(32768, var49).field8635[var50];
                return;
            }
            if (arg0 == 5055) {
                int var51 = field2791[--field2782];
                field2792[field2793++] = class548.field7632.method1438(var51, 2).method1228(34);
                return;
            }
            if (arg0 == 5056) {
                int var52 = field2791[--field2782];
                class192 var53 = class548.field7632.method1438(var52, 2);
                if (var53.field2505 == null) {
                    field2791[field2782++] = 0;
                    return;
                }
                field2791[field2782++] = var53.field2505.length;
                return;
            }
            if (arg0 == 5057) {
                field2782 -= 2;
                int var54 = field2791[field2782];
                int var55 = field2791[field2782 + 1];
                field2791[field2782++] = class548.field7632.method1438(var54, 2).field2505[var55];
                return;
            }
            if (arg0 == 5058) {
                field2797 = new class75();
                field2797.field1021 = field2791[--field2782];
                field2797.field1024 = class548.field7632.method1438(field2797.field1021, 2);
                field2797.field1022 = new int[field2797.field1024.method1231(-2231)];
                return;
            }
            if (arg0 == 5059) {
                field2796++;
                class118.method650(true, class496.field6913);
                class272.field3457.method3060(0, -25098);
                int var56 = class272.field3457.field7707;
                class272.field3457.method3060(0, -25098);
                class272.field3457.method3042(field2797.field1021, -116);
                field2797.field1024.method1235(class272.field3457, field2797.field1022, -8439);
                class272.field3457.method3084((byte) -126, class272.field3457.field7707 - var56);
                return;
            }
            if (arg0 == 5060) {
                String var57 = field2792[--field2793];
                field2778++;
                class118.method650(true, class247.field3107);
                class272.field3457.method3060(0, -25098);
                int var58 = class272.field3457.field7707;
                class272.field3457.method3040(false, var57);
                class272.field3457.method3042(field2797.field1021, -60);
                field2797.field1024.method1235(class272.field3457, field2797.field1022, -8439);
                class272.field3457.method3084((byte) -111, class272.field3457.field7707 - var58);
                return;
            }
            if (arg0 == 5061) {
                field2796++;
                class118.method650(true, class496.field6913);
                class272.field3457.method3060(0, -25098);
                int var59 = class272.field3457.field7707;
                class272.field3457.method3060(1, -25098);
                class272.field3457.method3042(field2797.field1021, 115);
                field2797.field1024.method1235(class272.field3457, field2797.field1022, -8439);
                class272.field3457.method3084((byte) -121, class272.field3457.field7707 - var59);
                return;
            }
            if (arg0 == 5062) {
                field2782 -= 2;
                int var60 = field2791[field2782];
                int var61 = field2791[field2782 + 1];
                field2791[field2782++] = class181.field2328.method2349(32768, var60).field8629[var61];
                return;
            }
            if (arg0 == 5063) {
                field2782 -= 2;
                int var62 = field2791[field2782];
                int var63 = field2791[field2782 + 1];
                field2791[field2782++] = class181.field2328.method2349(32768, var62).field8633[var63];
                return;
            }
            if (arg0 == 5064) {
                field2782 -= 2;
                int var64 = field2791[field2782];
                int var65 = field2791[field2782 + 1];
                if (var65 == -1) {
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = class181.field2328.method2349(32768, var64).method3445((char) var65, (byte) 77);
                return;
            }
            if (arg0 == 5065) {
                field2782 -= 2;
                int var66 = field2791[field2782];
                int var67 = field2791[field2782 + 1];
                if (var67 == -1) {
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = class181.field2328.method2349(32768, var66).method3444(-1, (char) var67);
                return;
            }
            if (arg0 == 5066) {
                int var68 = field2791[--field2782];
                field2791[field2782++] = class548.field7632.method1438(var68, 2).method1231(-2231);
                return;
            }
            if (arg0 == 5067) {
                field2782 -= 2;
                int var69 = field2791[field2782];
                int var70 = field2791[field2782 + 1];
                int var71 = class548.field7632.method1438(var69, 2).method1232(0, var70).field5170;
                field2791[field2782++] = var71;
                return;
            }
            if (arg0 == 5068) {
                field2782 -= 2;
                int var72 = field2791[field2782];
                int var73 = field2791[field2782 + 1];
                field2797.field1022[var72] = var73;
                return;
            }
            if (arg0 == 5069) {
                field2782 -= 2;
                int var74 = field2791[field2782];
                int var75 = field2791[field2782 + 1];
                field2797.field1022[var74] = var75;
                return;
            }
            if (arg0 == 5070) {
                field2782 -= 3;
                int var76 = field2791[field2782];
                int var77 = field2791[field2782 + 1];
                int var78 = field2791[field2782 + 2];
                class192 var79 = class548.field7632.method1438(var76, 2);
                if (var79.method1232(0, var77).field5170 != 0) {
                    throw new RuntimeException("bad command");
                }
                field2791[field2782++] = var79.method1227(var77, 21206, var78);
                return;
            }
            if (arg0 == 5071) {
                String var80 = field2792[--field2793];
                boolean var81 = field2791[--field2782] == 1;
                class599.method3448(var81, (byte) -110, var80);
                field2791[field2782++] = class590.field8520;
                return;
            }
            if (arg0 == 5072) {
                if (class369.field5144 != null && class577.field8037 < class590.field8520) {
                    field2791[field2782++] = class369.field5144[class577.field8037++] & 0xFFFF;
                    return;
                }
                field2791[field2782++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class577.field8037 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class634.field9227.method2004((byte) 98, 86)) {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class634.field9227.method2004((byte) 88, 82)) {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class634.field9227.method2004((byte) -46, 81)) {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class110.method595(12353, field2791[--field2782]);
                return;
            }
            if (arg0 == 5201) {
                field2791[field2782++] = class72.method426(true);
                return;
            }
            if (arg0 == 5205) {
                class494.method2774(-108, false, -1, -1, field2791[--field2782]);
                return;
            }
            if (arg0 == 5206) {
                int var82 = field2791[--field2782];
                class270 var83 = class614.method3506(var82 >> 14 & 0x3FFF, var82 & 0x3FFF);
                if (var83 == null) {
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = var83.field3429;
                return;
            }
            if (arg0 == 5207) {
                class270 var84 = class614.method3517(field2791[--field2782]);
                if (var84 != null && var84.field3436 != null) {
                    field2792[field2793++] = var84.field3436;
                    return;
                }
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 5208) {
                field2791[field2782++] = class248.field3120;
                field2791[field2782++] = class280.field3671;
                return;
            }
            if (arg0 == 5209) {
                field2791[field2782++] = class80.field1091 + class614.field8850;
                field2791[field2782++] = class614.field8848 + class2.field20;
                return;
            }
            if (arg0 == 5210) {
                int var85 = field2791[--field2782];
                class270 var86 = class614.method3517(var85);
                if (var86 == null) {
                    field2791[field2782++] = 0;
                    field2791[field2782++] = 0;
                    return;
                }
                field2791[field2782++] = var86.field3438 >> 14 & 0x3FFF;
                field2791[field2782++] = var86.field3438 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var87 = field2791[--field2782];
                class270 var88 = class614.method3517(var87);
                if (var88 == null) {
                    field2791[field2782++] = 0;
                    field2791[field2782++] = 0;
                    return;
                }
                field2791[field2782++] = var88.field3425 - var88.field3434;
                field2791[field2782++] = var88.field3441 - var88.field3430;
                return;
            }
            if (arg0 == 5212) {
                class625 var89 = class58.method325(2048);
                if (var89 == null) {
                    field2791[field2782++] = -1;
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = var89.field9044;
                int var90 = var89.field9047 << 28 | class614.field8850 + var89.field9038 << 14 | class614.field8848 + var89.field9039;
                field2791[field2782++] = var90;
                return;
            }
            if (arg0 == 5213) {
                class625 var91 = class199.method1272((byte) -118);
                if (var91 == null) {
                    field2791[field2782++] = -1;
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = var91.field9044;
                int var92 = var91.field9047 << 28 | class614.field8850 + var91.field9038 << 14 | class614.field8848 + var91.field9039;
                field2791[field2782++] = var92;
                return;
            }
            if (arg0 == 5214) {
                int var93 = field2791[--field2782];
                class270 var94 = class198.method1269((byte) 124);
                if (var94 != null) {
                    boolean var95 = var94.method1654(var93 & 0x3FFF, field2801, -77, var93 >> 14 & 0x3FFF, var93 >> 28 & 0x3);
                    if (var95) {
                        class474.method2693(field2801[1], field2801[2], 0);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2782 -= 2;
                int var96 = field2791[field2782];
                int var97 = field2791[field2782 + 1];
                class358 var98 = class614.method3523(var96 >> 14 & 0x3FFF, var96 & 0x3FFF);
                boolean var99 = false;
                for (class270 var100 = (class270) var98.method2222((byte) -81); var100 != null; var100 = (class270) var98.method2225(43)) {
                    if (var100.field3429 == var97) {
                        var99 = true;
                        break;
                    }
                }
                if (var99) {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var101 = field2791[--field2782];
                class270 var102 = class614.method3517(var101);
                if (var102 == null) {
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = var102.field3427;
                return;
            }
            if (arg0 == 5220) {
                field2791[field2782++] = class345.field4777 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var103 = field2791[--field2782];
                class474.method2693(var103 >> 14 & 0x3FFF, var103 & 0x3FFF, 0);
                return;
            }
            if (arg0 == 5222) {
                class270 var104 = class198.method1269((byte) 116);
                if (var104 != null) {
                    boolean var105 = var104.method1648(class80.field1091 + class614.field8850, class614.field8848 + class2.field20, 0, field2801);
                    if (var105) {
                        field2791[field2782++] = field2801[1];
                        field2791[field2782++] = field2801[2];
                        return;
                    }
                    field2791[field2782++] = -1;
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = -1;
                field2791[field2782++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2782 -= 2;
                int var106 = field2791[field2782];
                int var107 = field2791[field2782 + 1];
                class494.method2774(124, false, var107 & 0x3FFF, var107 >> 14 & 0x3FFF, var106);
                return;
            }
            if (arg0 == 5224) {
                int var108 = field2791[--field2782];
                class270 var109 = class198.method1269((byte) 120);
                if (var109 != null) {
                    boolean var110 = var109.method1654(var108 & 0x3FFF, field2801, -111, var108 >> 14 & 0x3FFF, var108 >> 28 & 0x3);
                    if (var110) {
                        field2791[field2782++] = field2801[1];
                        field2791[field2782++] = field2801[2];
                        return;
                    }
                    field2791[field2782++] = -1;
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = -1;
                field2791[field2782++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var111 = field2791[--field2782];
                class270 var112 = class198.method1269((byte) 93);
                if (var112 != null) {
                    boolean var113 = var112.method1648(var111 >> 14 & 0x3FFF, var111 & 0x3FFF, 0, field2801);
                    if (var113) {
                        field2791[field2782++] = field2801[1];
                        field2791[field2782++] = field2801[2];
                        return;
                    }
                    field2791[field2782++] = -1;
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = -1;
                field2791[field2782++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class404.method2413(field2791[--field2782], 0);
                return;
            }
            if (arg0 == 5227) {
                field2782 -= 2;
                int var114 = field2791[field2782];
                int var115 = field2791[field2782 + 1];
                class494.method2774(-27, true, var115 & 0x3FFF, var115 >> 14 & 0x3FFF, var114);
                return;
            }
            if (arg0 == 5228) {
                class394.field5453 = field2791[--field2782] == 1;
                return;
            }
            if (arg0 == 5229) {
                field2791[field2782++] = class394.field5453 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var116 = field2791[--field2782];
                class592.method3418(4447, var116);
                return;
            }
            if (arg0 == 5231) {
                field2782 -= 2;
                int var117 = field2791[field2782];
                boolean var118 = field2791[field2782 + 1] == 1;
                if (class464.field6599 != null) {
                    class108 var119 = class464.field6599.method3476((long) var117, (byte) 28);
                    if (var119 != null && !var118) {
                        var119.method589(-8880);
                        return;
                    }
                    if (var119 == null && var118) {
                        class108 var120 = new class108();
                        class464.field6599.method3475(-102, var120, (long) var117);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var121 = field2791[--field2782];
                if (class464.field6599 != null) {
                    class108 var122 = class464.field6599.method3476((long) var121, (byte) 28);
                    field2791[field2782++] = var122 == null ? 0 : 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2782 -= 2;
                int var123 = field2791[field2782];
                boolean var124 = field2791[field2782 + 1] == 1;
                if (class163.field2072 != null) {
                    class108 var125 = class163.field2072.method3476((long) var123, (byte) 28);
                    if (var125 != null && !var124) {
                        var125.method589(-8880);
                        return;
                    }
                    if (var125 == null && var124) {
                        class108 var126 = new class108();
                        class163.field2072.method3475(-110, var126, (long) var123);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var127 = field2791[--field2782];
                if (class163.field2072 != null) {
                    class108 var128 = class163.field2072.method3476((long) var127, (byte) 28);
                    field2791[field2782++] = var128 == null ? 0 : 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field2791[field2782++] = class614.field8826 == null ? -1 : class614.field8826.field3429;
                return;
            }
            if (arg0 == 5236) {
                field2782 -= 2;
                int var129 = field2791[field2782];
                int var130 = field2791[field2782 + 1];
                int var131 = var130 >> 14 & 0x3FFF;
                int var132 = var130 & 0x3FFF;
                int var133 = class483.method2730(var131, var129, (byte) 110, var132);
                if (var133 < 0) {
                    field2791[field2782++] = -1;
                    return;
                }
                field2791[field2782++] = var133;
                return;
            }
            if (arg0 == 5237) {
                class497.method2788(-450);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2782 -= 2;
                int var134 = field2791[field2782];
                int var135 = field2791[field2782 + 1];
                class459.method2662(3, false, 88, var134, var135);
                field2791[field2782++] = class558.field7815 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class558.field7815 != null) {
                    class459.method2662(class501.field6954.field7835, false, 32, -1, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class492[] var136 = class552.method3104(0);
                field2791[field2782++] = var136.length;
                return;
            }
            if (arg0 == 5303) {
                int var137 = field2791[--field2782];
                class492[] var138 = class552.method3104(0);
                field2791[field2782++] = var138[var137].field6871;
                field2791[field2782++] = var138[var137].field6870;
                return;
            }
            if (arg0 == 5305) {
                int var139 = class501.field6954.field7877;
                int var140 = class501.field6954.field7878;
                int var141 = -1;
                class492[] var142 = class552.method3104(0);
                for (int var143 = 0; var143 < var142.length; var143++) {
                    class492 var144 = var142[var143];
                    if (var144.field6871 == var139 && var144.field6870 == var140) {
                        var141 = var143;
                        break;
                    }
                }
                field2791[field2782++] = var141;
                return;
            }
            if (arg0 == 5306) {
                field2791[field2782++] = class207.method1324((byte) 101);
                return;
            }
            if (arg0 == 5307) {
                int var145 = field2791[--field2782];
                if (var145 >= 1 && var145 <= 2) {
                    class459.method2662(var145, false, 109, -1, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field2791[field2782++] = class501.field6954.field7835;
                return;
            }
            if (arg0 == 5309) {
                int var146 = field2791[--field2782];
                if (var146 >= 1 && var146 <= 2) {
                    class501.field6954.field7835 = var146;
                    class501.field6954.method3537(93, class31.field488);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2793 -= 2;
                String var147 = field2792[field2793];
                String var148 = field2792[field2793 + 1];
                int var149 = field2791[--field2782];
                field2789++;
                class118.method650(true, class285.field3718);
                class272.field3457.method3060(class194.method1241(var147, -111) + class194.method1241(var148, -127) + 1, -25098);
                class272.field3457.method3040(false, var147);
                class272.field3457.method3040(false, var148);
                class272.field3457.method3060(var149, -25098);
                return;
            }
            if (arg0 == 5401) {
                field2782 -= 2;
                class9.field86[field2791[field2782]] = (short) class136.method713(field2791[field2782 + 1], true);
                class98.field1307.method3386(0);
                class98.field1307.method3388(false);
                class579.field8053.method3628(false);
                class145.method794((byte) 126);
                return;
            }
            if (arg0 == 5405) {
                field2782 -= 2;
                int var150 = field2791[field2782];
                int var151 = field2791[field2782 + 1];
                if (var150 >= 0 && var150 < 2) {
                    class254.field3155[var150] = new int[var151 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2782 -= 7;
                int var152 = field2791[field2782];
                int var153 = field2791[field2782 + 1] << 1;
                int var154 = field2791[field2782 + 2];
                int var155 = field2791[field2782 + 3];
                int var156 = field2791[field2782 + 4];
                int var157 = field2791[field2782 + 5];
                int var158 = field2791[field2782 + 6];
                if (var152 >= 0 && var152 < 2 && class254.field3155[var152] != null && var153 >= 0 && var153 < class254.field3155[var152].length) {
                    class254.field3155[var152][var153] = new int[] { (var154 >> 14 & 0x3FFF) << 9, var155 << 2, (var154 & 0x3FFF) << 9, var158 };
                    class254.field3155[var152][var153 + 1] = new int[] { (var156 >> 14 & 0x3FFF) << 9, var157 << 2, (var156 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var159 = class254.field3155[field2791[--field2782]].length >> 1;
                field2791[field2782++] = var159;
                return;
            }
            if (arg0 == 5411) {
                if (class558.field7815 != null) {
                    class459.method2662(class501.field6954.field7835, false, 80, -1, -1);
                }
                if (class247.field3111 != null) {
                    class23.method138(1);
                    System.exit(0);
                    return;
                }
                String var160 = class110.field1419 == null ? class634.method3667(31) : class110.field1419;
                class534.method2967(var160, class428.field5845 == 1, false, false, class31.field488);
                return;
            }
            if (arg0 == 5419) {
                String var161 = "";
                if (class395.field5460 != null) {
                    if (class395.field5460.field6000 == null) {
                        var161 = class22.method124(class395.field5460.field5998, 8448);
                    } else {
                        var161 = (String) class395.field5460.field6000;
                    }
                }
                field2792[field2793++] = var161;
                return;
            }
            if (arg0 == 5420) {
                field2791[field2782++] = class279.field3639 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class558.field7815 != null) {
                    class459.method2662(class501.field6954.field7835, false, 55, -1, -1);
                }
                String var162 = field2792[--field2793];
                boolean var163 = field2791[--field2782] == 1;
                String var164 = class634.method3667(29) + var162;
                class534.method2967(var164, class428.field5845 == 1, var163, false, class31.field488);
                return;
            }
            if (arg0 == 5422) {
                field2793 -= 2;
                String var165 = field2792[field2793];
                String var166 = field2792[field2793 + 1];
                int var167 = field2791[--field2782];
                if (var165.length() > 0) {
                    if (class18.field209 == null) {
                        class18.field209 = new String[class286.field3728[class26.field453.field7138]];
                    }
                    class18.field209[var167] = var165;
                }
                if (var166.length() > 0) {
                    if (class93.field1238 == null) {
                        class93.field1238 = new String[class286.field3728[class26.field453.field7138]];
                    }
                    class93.field1238[var167] = var166;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2792[--field2793]);
                return;
            }
            if (arg0 == 5424) {
                field2782 -= 11;
                class34.field514 = field2791[field2782];
                class67.field891 = field2791[field2782 + 1];
                class12.field109 = field2791[field2782 + 2];
                class110.field1420 = field2791[field2782 + 3];
                class198.field2591 = field2791[field2782 + 4];
                class203.field2676 = field2791[field2782 + 5];
                class581.field8091 = field2791[field2782 + 6];
                class135.field1654 = field2791[field2782 + 7];
                class342.field4753 = field2791[field2782 + 8];
                class558.field7817 = field2791[field2782 + 9];
                class633.field9211 = field2791[field2782 + 10];
                class24.field433.method2042((byte) -80, class198.field2591);
                class24.field433.method2042((byte) -80, class203.field2676);
                class24.field433.method2042((byte) -80, class581.field8091);
                class24.field433.method2042((byte) -80, class135.field1654);
                class24.field433.method2042((byte) -80, class342.field4753);
                class173.field2243 = null;
                class387.field5384 = null;
                class480.field6728 = null;
                class604.field8712 = null;
                class646.field9353 = null;
                class600.field8678 = null;
                class233.field2980 = null;
                class239.field3057 = null;
                class641.field9319 = true;
                return;
            }
            if (arg0 == 5425) {
                class530.method2956((byte) -86);
                class641.field9319 = false;
                return;
            }
            if (arg0 == 5426) {
                field2782 -= 2;
                class646.field9349 = field2791[field2782];
                class261.field3264 = field2791[field2782 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2782 -= 2;
                class45.field645 = field2791[field2782 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2782 -= 2;
                int var168 = field2791[field2782];
                int var169 = field2791[field2782 + 1];
                field2791[field2782++] = class349.method2176(var168, var169, 116) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class288.method1781((byte) 124, field2792[--field2793], false, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class499.method2793("accountcreated", (byte) -40, class31.field488.field3644);
                    return;
                } catch (Throwable var292) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class499.method2793("accountcreatestarted", (byte) -121, class31.field488.field3644);
                    return;
                } catch (Throwable var293) {
                    return;
                }
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2782 -= 4;
                int var170 = field2791[field2782];
                int var171 = field2791[field2782 + 1];
                int var172 = field2791[field2782 + 2];
                int var173 = field2791[field2782 + 3];
                class374.method2280(var173, (var170 & 0x3FFF) - class58.field786, false, var171 << 2, (byte) -24, (var170 >> 14 & 0x3FFF) - class525.field7310, var172);
                return;
            }
            if (arg0 == 5501) {
                field2782 -= 4;
                int var174 = field2791[field2782];
                int var175 = field2791[field2782 + 1];
                int var176 = field2791[field2782 + 2];
                int var177 = field2791[field2782 + 3];
                class503.method2806(var176, var177, 256, (var174 & 0x3FFF) - class58.field786, (var174 >> 14 & 0x3FFF) - class525.field7310, var175 << 2);
                return;
            }
            if (arg0 == 5502) {
                field2782 -= 6;
                int var178 = field2791[field2782];
                if (var178 >= 2) {
                    throw new RuntimeException();
                }
                class30.field482 = var178;
                int var179 = field2791[field2782 + 1];
                if (var179 + 1 >= class254.field3155[class30.field482].length >> 1) {
                    throw new RuntimeException();
                }
                class551.field7715 = var179;
                class495.field6907 = 0;
                class71.field942 = field2791[field2782 + 2];
                class569.field7954 = field2791[field2782 + 3];
                int var180 = field2791[field2782 + 4];
                if (var180 >= 2) {
                    throw new RuntimeException();
                }
                class427.field5826 = var180;
                int var181 = field2791[field2782 + 5];
                if (var181 + 1 >= class254.field3155[class427.field5826].length >> 1) {
                    throw new RuntimeException();
                }
                class198.field2595 = var181;
                class621.field8952 = 3;
                return;
            }
            if (arg0 == 5503) {
                class529.method2951(0);
                return;
            }
            if (arg0 == 5504) {
                field2782 -= 2;
                class406.method2424(false, field2791[field2782], field2791[field2782 + 1], 0);
                return;
            }
            if (arg0 == 5505) {
                field2791[field2782++] = (int) class568.field7951 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field2791[field2782++] = (int) class521.field7250 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class629.method3640(true);
                return;
            }
            if (arg0 == 5508) {
                class581.method3277(-16);
                return;
            }
            if (arg0 == 5509) {
                class584.method3370(true);
                return;
            }
            if (arg0 == 5510) {
                class513.method2859(false);
                return;
            }
            if (arg0 == 5511) {
                int var182 = field2791[--field2782];
                int var183 = var182 >> 14 & 0x3FFF;
                int var184 = var182 & 0x3FFF;
                int var185 = var183 - class525.field7310;
                if (var185 < 0) {
                    var185 = 0;
                } else if (var185 >= class139.field1760) {
                    var185 = class139.field1760;
                }
                int var186 = var184 - class58.field786;
                if (var186 < 0) {
                    var186 = 0;
                } else if (var186 >= class369.field5135) {
                    var186 = class369.field5135;
                }
                class626.field9074 = (var185 << 9) + 256;
                class20.field292 = (var186 << 9) + 256;
                class621.field8952 = 4;
                return;
            }
            if (arg0 == 5512) {
                class591.method3410(-30);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2793 -= 2;
                String var187 = field2792[field2793];
                String var188 = field2792[field2793 + 1];
                int var189 = field2791[--field2782];
                if (class630.field9188 != 2) {
                    return;
                }
                if (class294.field3824 == 0 && class245.field3098 == 0) {
                    class111.field1441 = var187;
                    class626.field9101 = var188;
                    class419.field5730 = var189;
                    class597.method3438((byte) 124, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class195.method1251(7);
                return;
            }
            if (arg0 == 5602) {
                if (class294.field3824 == 0) {
                    class599.field8655 = -2;
                    class18.field206 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field2782 -= 4;
                if (class630.field9188 != 2) {
                    return;
                }
                if (class294.field3824 == 0 && class245.field3098 == 0) {
                    class212.method1347(field2791[field2782], field2791[field2782 + 2], (byte) 119, field2791[field2782 + 1], field2791[field2782 + 3]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field2793--;
                if (class630.field9188 != 2) {
                    return;
                }
                if (class294.field3824 == 0 && class245.field3098 == 0) {
                    class282.method1759(class30.method181(-111, field2792[field2793]), (byte) -103);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2793 -= 2;
                if (class630.field9188 != 2) {
                    return;
                }
                if (class294.field3824 == 0 && class245.field3098 == 0) {
                    class611.method3491(113, field2792[field2793 + 1], class30.method181(-106, field2792[field2793]), false);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class245.field3098 == 0) {
                    class192.field2503 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field2791[field2782++] = class18.field206;
                return;
            }
            if (arg0 == 5608) {
                field2791[field2782++] = class224.field2862;
                return;
            }
            if (arg0 == 5609) {
                field2791[field2782++] = class192.field2503;
                return;
            }
            if (arg0 == 5610) {
                for (int var190 = 0; var190 < 5; var190++) {
                    field2792[field2793++] = class515.field7170.length > var190 ? class641.method3700(false, class515.field7170[var190]) : "";
                }
                class515.field7170 = null;
                return;
            }
            if (arg0 == 5611) {
                field2791[field2782++] = class286.field3724;
                return;
            }
            if (arg0 == 5612) {
                int var191 = field2791[--field2782];
                if (class630.field9188 != 6) {
                    return;
                }
                if (class294.field3824 == 0 && class245.field3098 == 0) {
                    if (class96.field1294 != null) {
                        class96.field1294.method3271((byte) 110);
                        class96.field1294 = null;
                    }
                    class419.field5730 = var191;
                    class597.method3438((byte) 124, 8);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field2791[field2782++] = class18.field206;
                return;
            }
            if (arg0 == 5615) {
                field2793 -= 2;
                String var192 = field2792[field2793];
                String var193 = field2792[field2793 + 1];
                if (class630.field9188 != 2) {
                    return;
                }
                if (class294.field3824 == 0 && class245.field3098 == 0) {
                    if (class96.field1294 != null) {
                        class96.field1294.method3271((byte) 110);
                        class96.field1294 = null;
                    }
                    class111.field1441 = var192;
                    class626.field9101 = var193;
                    class597.method3438((byte) 124, 4);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class493.method2772(false, 18747);
                return;
            }
            if (arg0 == 5617) {
                field2791[field2782++] = class599.field8655;
                return;
            }
            if (arg0 == 5618) {
                int var194 = field2791[--field2782];
                class103.method568(false, var194, (byte) 113);
                return;
            }
            if (arg0 == 5619) {
                int var195 = field2791[--field2782];
                class103.method568(true, var195, (byte) 108);
                return;
            }
            if (arg0 == 5620) {
                class154.method834(-126);
                if (class284.field3703 != "" && class284.field3703 != "") {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field2793 -= 2;
                if (class630.field9188 != 2) {
                    return;
                }
                if (class294.field3824 == 0 && class245.field3098 == 0) {
                    class611.method3491(124, field2792[field2793 + 1], class30.method181(-45, field2792[field2793]), true);
                    return;
                }
                return;
            }
            if (arg0 == 5622) {
                class441 var196 = class31.field488.method1727(false, (byte) -32, "3");
                while (var196.field6001 == 0) {
                    class353.method2204(1L, 7806);
                }
                if (var196.field6001 == 2) {
                    throw new RuntimeException("Error opening file");
                }
                class578 var197 = (class578) var196.field6000;
                if (var197.method3248(14357).exists()) {
                    class551 var198 = new class551(50);
                    try {
                        var197.method3249((byte) 96, 50, var198.field7693, 0);
                    } catch (IOException var295) {
                    }
                }
                try {
                    var197.method3252(0);
                    return;
                } catch (Exception var294) {
                    return;
                }
            }
            if (arg0 == 5623) {
                if (class207.field2685 != null) {
                    field2791[field2782++] = 1;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var199 = field2791[--field2782];
                if (var199 < 1) {
                    var199 = 1;
                }
                if (var199 > 4) {
                    var199 = 4;
                }
                class501.field6954.field7860 = var199;
                class633.method3662(1);
                class501.field6954.method3537(66, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6002) {
                class501.field6954.method3548(field2791[--field2782] == 1, (byte) 68);
                class633.method3662(1);
                class509.method2848(-4);
                class501.field6954.method3537(122, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6003) {
                class501.field6954.field7875 = field2791[--field2782] == 1;
                class509.method2848(-4);
                class501.field6954.method3537(116, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6005) {
                class501.field6954.field7843 = field2791[--field2782] == 1;
                class633.method3662(1);
                class501.field6954.method3537(66, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6006) {
                class501.field6954.field7879 = field2791[--field2782] == 1;
                class301.field3918.method984(!class501.field6954.field7879);
                class501.field6954.method3537(63, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6007) {
                class501.field6954.field7862 = field2791[--field2782];
                class501.field6954.method3537(122, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6008) {
                class501.field6954.field7836 = field2791[--field2782] == 1;
                class501.field6954.method3537(48, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6009) {
                class501.field6954.field7868 = field2791[--field2782] == 1;
                class633.method3662(1);
                class501.field6954.method3537(116, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6010) {
                class501.field6954.field7876 = field2791[--field2782] == 1;
                class501.field6954.method3537(70, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6011) {
                int var200 = field2791[--field2782];
                if (var200 < 0 || var200 > 2) {
                    var200 = 0;
                }
                class501.field6954.method3151(var200, 1, class428.field5845);
                class633.method3662(1);
                class501.field6954.method3537(56, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6012) {
                class501.field6954.method3155(class428.field5845, 126, field2791[--field2782] == 1);
                class113.method609(0);
                class9.method37(2);
                class501.field6954.method3537(86, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6014) {
                class501.field6954.field7873 = field2791[--field2782] == 1;
                class633.method3662(1);
                class501.field6954.method3537(83, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6015) {
                class501.field6954.field7872 = field2791[--field2782] == 1;
                class633.method3662(1);
                class501.field6954.method3537(112, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6016) {
                int var201 = field2791[--field2782];
                if (var201 < 0 || var201 > 2) {
                    var201 = 0;
                }
                class501.field6954.field7858 = var201;
                class293.method1796(class428.field5845, (byte) -98);
                class501.field6954.method3537(80, class31.field488);
                return;
            }
            if (arg0 == 6017) {
                class501.field6954.field7845 = field2791[--field2782] == 1;
                class72.method422(true);
                class501.field6954.method3537(125, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6018) {
                int var202 = field2791[--field2782];
                if (var202 < 0) {
                    var202 = 0;
                }
                if (var202 > 127) {
                    var202 = 127;
                }
                class501.field6954.field7856 = var202;
                class501.field6954.method3537(107, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6019) {
                int var203 = field2791[--field2782];
                if (var203 < 0) {
                    var203 = 0;
                }
                if (var203 > 255) {
                    var203 = 255;
                }
                if (class501.field6954.field7851 != var203) {
                    if (class501.field6954.field7851 == 0 && class325.field4460 != -1) {
                        class628.method3636(0, class251.field3143, 16778, var203, class325.field4460, false);
                        class54.field726 = false;
                    } else if (var203 == 0) {
                        class552.method3095(1);
                        class54.field726 = false;
                    } else {
                        class128.method684(1, var203);
                    }
                    class501.field6954.field7851 = var203;
                }
                class501.field6954.method3537(125, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6020) {
                int var204 = field2791[--field2782];
                if (var204 < 0) {
                    var204 = 0;
                }
                if (var204 > 127) {
                    var204 = 127;
                }
                class501.field6954.field7838 = var204;
                class501.field6954.method3537(90, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6021) {
                class501.field6954.field8900 = field2791[--field2782] == 1;
                class509.method2848(-4);
                return;
            }
            if (arg0 == 6023) {
                int var205 = field2791[--field2782];
                boolean var206 = false;
                if (var205 < 0) {
                    var205 = 0;
                }
                if (var205 > 2) {
                    var205 = 2;
                }
                if (class282.field3697 < 96) {
                    var205 = 0;
                    var206 = true;
                }
                class298.method1833((byte) -115, var205);
                class501.field6954.method3537(98, class31.field488);
                class372.field5181 = false;
                field2791[field2782++] = var206 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var207 = field2791[--field2782];
                if (var207 < 0 || var207 > 2) {
                    var207 = 0;
                }
                class501.field6954.field7855 = var207;
                class501.field6954.method3537(70, class31.field488);
                return;
            }
            if (arg0 == 6025) {
                int var208 = field2791[--field2782];
                if (var208 < 0 || var208 > class88.method490((byte) 39, class282.field3697)) {
                    var208 = 0;
                }
                class501.field6954.field7865 = var208;
                class501.field6954.method3537(116, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6027) {
                int var209 = field2791[--field2782];
                if (var209 < 0 || var209 > 1) {
                    var209 = 0;
                }
                class503.method2814(var209 == 1, -12070);
                return;
            }
            if (arg0 == 6028) {
                class501.field6954.field7871 = field2791[--field2782] != 0;
                class501.field6954.method3537(104, class31.field488);
                return;
            }
            if (arg0 == 6029) {
                class501.field6954.field7862 = field2791[--field2782];
                class501.field6954.method3537(69, class31.field488);
                return;
            }
            if (arg0 == 6030) {
                class501.field6954.field7847 = field2791[--field2782] != 0;
                class501.field6954.method3537(85, class31.field488);
                class633.method3662(1);
                return;
            }
            if (arg0 == 6031) {
                int var210 = field2791[--field2782];
                if (var210 < 0 || var210 > 5) {
                    var210 = 2;
                }
                class293.method1796(var210, (byte) 117);
                return;
            }
            if (arg0 == 6032) {
                int var211 = field2791[--field2782];
                if (var211 < 0 || var211 > 5) {
                    var211 = 2;
                }
                class501.field6954.field7849 = var211;
                class501.field6954.method3537(69, class31.field488);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6033) {
                int var212 = field2791[--field2782];
                if (var212 < 0 || var212 > 4) {
                    var212 = 2;
                }
                class501.field6954.field7842 = var212;
                class501.field6954.method3537(54, class31.field488);
                return;
            }
            if (arg0 == 6034) {
                class501.field6954.field7880 = field2791[--field2782] == 1;
                class501.field6954.method3537(57, class31.field488);
                class113.method609(0);
                class372.field5181 = false;
                return;
            }
            if (arg0 == 6035) {
                class501.field6954.field8908 = field2791[--field2782] == 1;
                class633.method3662(1);
                class509.method2848(-4);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field2791[field2782++] = class501.field6954.field7860;
                return;
            }
            if (arg0 == 6102) {
                field2791[field2782++] = class501.field6954.method3550(class428.field5845, (byte) -35) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field2791[field2782++] = class501.field6954.field7875 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field2791[field2782++] = class501.field6954.field7843 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field2791[field2782++] = class501.field6954.field7879 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field2791[field2782++] = class501.field6954.field7862;
                return;
            }
            if (arg0 == 6108) {
                field2791[field2782++] = class501.field6954.field7836 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field2791[field2782++] = class501.field6954.field7868 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field2791[field2782++] = class501.field6954.field7876 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field2791[field2782++] = class501.field6954.method3159(class428.field5845, true);
                return;
            }
            if (arg0 == 6112) {
                field2791[field2782++] = class501.field6954.method3152(-128, class428.field5845) ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field2791[field2782++] = class501.field6954.field7873 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field2791[field2782++] = class501.field6954.field7872 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field2791[field2782++] = class501.field6954.field7858;
                return;
            }
            if (arg0 == 6117) {
                field2791[field2782++] = class501.field6954.field7845 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field2791[field2782++] = class501.field6954.field7856;
                return;
            }
            if (arg0 == 6119) {
                field2791[field2782++] = class501.field6954.field7851;
                return;
            }
            if (arg0 == 6120) {
                field2791[field2782++] = class501.field6954.field7838;
                return;
            }
            if (arg0 == 6121) {
                field2791[field2782++] = class301.field3918.method990() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field2791[field2782++] = class83.method474((byte) -27);
                return;
            }
            if (arg0 == 6124) {
                field2791[field2782++] = class501.field6954.field7855;
                return;
            }
            if (arg0 == 6125) {
                field2791[field2782++] = class501.field6954.field7865;
                return;
            }
            if (arg0 == 6126) {
                field2791[field2782++] = class301.field3918.method944() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field2791[field2782++] = class501.field6954.field7864 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field2791[field2782++] = class501.field6954.field7871 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field2791[field2782++] = class501.field6954.field7862;
                return;
            }
            if (arg0 == 6130) {
                field2791[field2782++] = class501.field6954.field7847 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field2791[field2782++] = class428.field5845;
                return;
            }
            if (arg0 == 6132) {
                field2791[field2782++] = class501.field6954.field7849;
                return;
            }
            if (arg0 == 6133) {
                field2791[field2782++] = class279.field3639 == 1 || class279.field3639 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field2791[field2782++] = class88.method490((byte) 39, class282.field3697);
                return;
            }
            if (arg0 == 6135) {
                field2791[field2782++] = class501.field6954.field7842;
                return;
            }
            if (arg0 == 6136) {
                field2791[field2782++] = class501.field6954.field7880 ? 1 : 0;
                return;
            }
            if (arg0 == 6137) {
                boolean var213 = true;
                try {
                    var213 = jagmisc.getTotalPhysicalMemory() > 268435456L;
                } catch (Throwable var296) {
                }
                field2791[field2782++] = var213 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2782 -= 2;
                class343.field4766 = (short) field2791[field2782];
                if (class343.field4766 <= 0) {
                    class343.field4766 = 256;
                }
                class145.field1892 = (short) field2791[field2782 + 1];
                if (class145.field1892 <= 0) {
                    class145.field1892 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2782 -= 2;
                class181.field2321 = (short) field2791[field2782];
                if (class181.field2321 <= 0) {
                    class181.field2321 = 256;
                }
                class630.field9187 = (short) field2791[field2782 + 1];
                if (class630.field9187 <= 0) {
                    class630.field9187 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2782 -= 4;
                class354.field4956 = (short) field2791[field2782];
                if (class354.field4956 <= 0) {
                    class354.field4956 = 1;
                }
                class228.field2926 = (short) field2791[field2782 + 1];
                if (class228.field2926 <= 0) {
                    class228.field2926 = 32767;
                } else if (class228.field2926 < class354.field4956) {
                    class228.field2926 = class354.field4956;
                }
                class154.field2003 = (short) field2791[field2782 + 2];
                if (class154.field2003 <= 0) {
                    class154.field2003 = 1;
                }
                class450.field6370 = (short) field2791[field2782 + 3];
                if (class450.field6370 <= 0) {
                    class450.field6370 = 32767;
                    return;
                }
                if (class450.field6370 < class154.field2003) {
                    class450.field6370 = class154.field2003;
                }
                return;
            }
            if (arg0 == 6203) {
                class408.method2435(0, false, (byte) 94, class381.field5334.field6218, class381.field5334.field6330, 0);
                field2791[field2782++] = class221.field2838;
                field2791[field2782++] = class151.field1992;
                return;
            }
            if (arg0 == 6204) {
                field2791[field2782++] = class181.field2321;
                field2791[field2782++] = class630.field9187;
                return;
            }
            if (arg0 == 6205) {
                field2791[field2782++] = class343.field4766;
                field2791[field2782++] = class145.field1892;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field2791[field2782++] = (int) (class348.method2175(-122) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field2791[field2782++] = (int) (class348.method2175(-118) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2782 -= 3;
                int var214 = field2791[field2782];
                int var215 = field2791[field2782 + 1];
                int var216 = field2791[field2782 + 2];
                field2787.clear();
                field2787.set(11, 12);
                field2787.set(var216, var215, var214);
                int var217 = (int) (field2787.getTime().getTime() / 86400000L) - 11745;
                if (var216 < 1970) {
                    var217--;
                }
                field2791[field2782++] = var217;
                return;
            }
            if (arg0 == 6303) {
                field2787.clear();
                field2787.setTime(new Date(class348.method2175(-118)));
                field2791[field2782++] = field2787.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var218 = field2791[--field2782];
                boolean var219 = true;
                if (var218 < 0) {
                    var219 = (var218 + 1) % 4 == 0;
                } else if (var218 < 1582) {
                    var219 = var218 % 4 == 0;
                } else if (var218 % 4 != 0) {
                    var219 = false;
                } else if (var218 % 100 != 0) {
                    var219 = true;
                } else if (var218 % 400 != 0) {
                    var219 = false;
                }
                field2791[field2782++] = var219 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field2791[field2782++] = class639.method3677(true) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field2791[field2782++] = class563.method3161((byte) -42) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class630.field9188 == 6 && class294.field3824 == 0 && class245.field3098 == 0) {
                    if (class212.field2729) {
                        field2791[field2782++] = 0;
                        return;
                    }
                    if (class431.field5870 > class348.method2175(-119) - 1000L) {
                        field2791[field2782++] = 1;
                        return;
                    }
                    class212.field2729 = true;
                    class118.method650(true, class136.field1662);
                    class272.field3457.method3071(-106, class120.field1515);
                    field2791[field2782++] = 0;
                    return;
                }
                field2791[field2782++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class272 var220 = class150.method827(1011);
                if (var220 != null) {
                    field2791[field2782++] = var220.field3452;
                    field2791[field2782++] = var220.field2513;
                    field2792[field2793++] = var220.field3454;
                    class494 var221 = var220.method1666(-1);
                    field2791[field2782++] = var221.field6890;
                    field2792[field2793++] = var221.field6891;
                    field2791[field2782++] = var220.field2516;
                    field2791[field2782++] = var220.field3456;
                    field2792[field2793++] = var220.field3455;
                    return;
                }
                field2791[field2782++] = -1;
                field2791[field2782++] = 0;
                field2792[field2793++] = "";
                field2791[field2782++] = 0;
                field2792[field2793++] = "";
                field2791[field2782++] = 0;
                field2791[field2782++] = 0;
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 6502) {
                class272 var222 = class383.method2327(22300);
                if (var222 != null) {
                    field2791[field2782++] = var222.field3452;
                    field2791[field2782++] = var222.field2513;
                    field2792[field2793++] = var222.field3454;
                    class494 var223 = var222.method1666(-1);
                    field2791[field2782++] = var223.field6890;
                    field2792[field2793++] = var223.field6891;
                    field2791[field2782++] = var222.field2516;
                    field2791[field2782++] = var222.field3456;
                    field2792[field2793++] = var222.field3455;
                    return;
                }
                field2791[field2782++] = -1;
                field2791[field2782++] = 0;
                field2792[field2793++] = "";
                field2791[field2782++] = 0;
                field2792[field2793++] = "";
                field2791[field2782++] = 0;
                field2791[field2782++] = 0;
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var224 = field2791[--field2782];
                String var225 = field2792[--field2793];
                if (class630.field9188 == 6 && class294.field3824 == 0 && class245.field3098 == 0) {
                    field2791[field2782++] = class489.method2749(var224, var225, 3) ? 1 : 0;
                    return;
                }
                field2791[field2782++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class501.field6954.field7870 = field2791[--field2782];
                class501.field6954.method3537(96, class31.field488);
                return;
            }
            if (arg0 == 6505) {
                field2791[field2782++] = class501.field6954.field7870;
                return;
            }
            if (arg0 == 6506) {
                int var226 = field2791[--field2782];
                class272 var227 = class613.method3502(1, var226);
                if (var227 != null) {
                    field2791[field2782++] = var227.field2513;
                    field2792[field2793++] = var227.field3454;
                    class494 var228 = var227.method1666(-1);
                    field2791[field2782++] = var228.field6890;
                    field2792[field2793++] = var228.field6891;
                    field2791[field2782++] = var227.field2516;
                    field2791[field2782++] = var227.field3456;
                    field2792[field2793++] = var227.field3455;
                    return;
                }
                field2791[field2782++] = -1;
                field2792[field2793++] = "";
                field2791[field2782++] = 0;
                field2792[field2793++] = "";
                field2791[field2782++] = 0;
                field2791[field2782++] = 0;
                field2792[field2793++] = "";
                return;
            }
            if (arg0 == 6507) {
                field2782 -= 4;
                int var229 = field2791[field2782];
                boolean var230 = field2791[field2782 + 1] == 1;
                int var231 = field2791[field2782 + 2];
                boolean var232 = field2791[field2782 + 3] == 1;
                class140.method752(var229, var230, var232, 0, var231);
                return;
            }
            if (arg0 == 6508) {
                class15.method73(-114);
                return;
            }
            if (arg0 == 6509) {
                if (class630.field9188 != 6) {
                    return;
                }
                class99.field1324 = field2791[--field2782] == 1;
                return;
            }
            if (arg0 == 6510) {
                field2791[field2782++] = class540.field7554;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class501.field6954.field7869 = field2791[--field2782] == 1;
                class501.field6954.method3537(64, class31.field488);
                return;
            }
            if (arg0 == 6601) {
                field2791[field2782++] = class501.field6954.field7869 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class45.field647 == class381.field5335) {
            if (arg0 == 6700) {
                int var233 = class523.field7289.method3480(-24064);
                if (class126.field1565 != -1) {
                    var233++;
                }
                field2791[field2782++] = var233;
                return;
            }
            if (arg0 == 6701) {
                int var234 = field2791[--field2782];
                if (class126.field1565 != -1) {
                    if (var234 == 0) {
                        field2791[field2782++] = class126.field1565;
                        return;
                    }
                    var234--;
                }
                class496 var235 = (class496) class523.field7289.method3473(-27089);
                while (var234-- > 0) {
                    var235 = (class496) class523.field7289.method3478((byte) 5);
                }
                field2791[field2782++] = var235.field6914;
                return;
            }
            if (arg0 == 6702) {
                int var236 = field2791[--field2782];
                if (class508.field7087[var236] == null) {
                    field2792[field2793++] = "";
                    return;
                }
                String var237 = class508.field7087[var236][0].field6173;
                if (var237 == null) {
                    field2792[field2793++] = "";
                    return;
                }
                field2792[field2793++] = var237.substring(0, var237.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var238 = field2791[--field2782];
                if (class508.field7087[var238] == null) {
                    field2791[field2782++] = 0;
                    return;
                }
                field2791[field2782++] = class508.field7087[var238].length;
                return;
            }
            if (arg0 == 6704) {
                field2782 -= 2;
                int var239 = field2791[field2782];
                int var240 = field2791[field2782 + 1];
                if (class508.field7087[var239] == null) {
                    field2792[field2793++] = "";
                    return;
                }
                String var241 = class508.field7087[var239][var240].field6173;
                if (var241 == null) {
                    field2792[field2793++] = "";
                    return;
                }
                field2792[field2793++] = var241;
                return;
            }
            if (arg0 == 6705) {
                field2782 -= 2;
                int var242 = field2791[field2782];
                int var243 = field2791[field2782 + 1];
                if (class508.field7087[var242] == null) {
                    field2791[field2782++] = 0;
                    return;
                }
                field2791[field2782++] = class508.field7087[var242][var243].field6268;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field2782 -= 3;
                int var244 = field2791[field2782];
                int var245 = field2791[field2782 + 1];
                int var246 = field2791[field2782 + 2];
                class362.method2244(1, var246, var244 << 16 | var245, -37, "");
                return;
            }
            if (arg0 == 6708) {
                field2782 -= 3;
                int var247 = field2791[field2782];
                int var248 = field2791[field2782 + 1];
                int var249 = field2791[field2782 + 2];
                class362.method2244(2, var249, var247 << 16 | var248, -85, "");
                return;
            }
            if (arg0 == 6709) {
                field2782 -= 3;
                int var250 = field2791[field2782];
                int var251 = field2791[field2782 + 1];
                int var252 = field2791[field2782 + 2];
                class362.method2244(3, var252, var250 << 16 | var251, -107, "");
                return;
            }
            if (arg0 == 6710) {
                field2782 -= 3;
                int var253 = field2791[field2782];
                int var254 = field2791[field2782 + 1];
                int var255 = field2791[field2782 + 2];
                class362.method2244(4, var255, var253 << 16 | var254, -31, "");
                return;
            }
            if (arg0 == 6711) {
                field2782 -= 3;
                int var256 = field2791[field2782];
                int var257 = field2791[field2782 + 1];
                int var258 = field2791[field2782 + 2];
                class362.method2244(5, var258, var256 << 16 | var257, -85, "");
                return;
            }
            if (arg0 == 6712) {
                field2782 -= 3;
                int var259 = field2791[field2782];
                int var260 = field2791[field2782 + 1];
                int var261 = field2791[field2782 + 2];
                class362.method2244(6, var261, var259 << 16 | var260, -43, "");
                return;
            }
            if (arg0 == 6713) {
                field2782 -= 3;
                int var262 = field2791[field2782];
                int var263 = field2791[field2782 + 1];
                int var264 = field2791[field2782 + 2];
                class362.method2244(7, var264, var262 << 16 | var263, -3, "");
                return;
            }
            if (arg0 == 6714) {
                field2782 -= 3;
                int var265 = field2791[field2782];
                int var266 = field2791[field2782 + 1];
                int var267 = field2791[field2782 + 2];
                class362.method2244(8, var267, var265 << 16 | var266, -7, "");
                return;
            }
            if (arg0 == 6715) {
                field2782 -= 3;
                int var268 = field2791[field2782];
                int var269 = field2791[field2782 + 1];
                int var270 = field2791[field2782 + 2];
                class362.method2244(9, var270, var268 << 16 | var269, -96, "");
                return;
            }
            if (arg0 == 6716) {
                field2782 -= 3;
                int var271 = field2791[field2782];
                int var272 = field2791[field2782 + 1];
                int var273 = field2791[field2782 + 2];
                class362.method2244(10, var273, var271 << 16 | var272, -57, "");
                return;
            }
            if (arg0 == 6717) {
                field2782 -= 3;
                int var274 = field2791[field2782];
                int var275 = field2791[field2782 + 1];
                int var276 = field2791[field2782 + 2];
                class447 var277 = class433.method2525(var276, var274 << 16 | var275, (byte) -124);
                class606.method3471(107);
                class493 var278 = client.method3572(var277);
                class234.method1478(var278.field6884, var278.method2768(19270), var277, (byte) 118);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var279 = field2791[--field2782];
                class297 var280 = class494.field6893.method1544(36, var279);
                if (var280.field3872 == null) {
                    field2792[field2793++] = "";
                    return;
                }
                field2792[field2793++] = var280.field3872;
                return;
            }
            if (arg0 == 6801) {
                int var281 = field2791[--field2782];
                class297 var282 = class494.field6893.method1544(36, var281);
                field2791[field2782++] = var282.field3862;
                return;
            }
            if (arg0 == 6802) {
                int var283 = field2791[--field2782];
                class297 var284 = class494.field6893.method1544(36, var283);
                field2791[field2782++] = var284.field3857;
                return;
            }
            if (arg0 == 6803) {
                int var285 = field2791[--field2782];
                class297 var286 = class494.field6893.method1544(36, var285);
                field2791[field2782++] = var286.field3859;
                return;
            }
            if (arg0 == 6804) {
                field2782 -= 2;
                int var287 = field2791[field2782];
                int var288 = field2791[field2782 + 1];
                class360 var289 = class132.field1621.method151(var288, -123);
                if (var289.method2232(-116)) {
                    field2792[field2793++] = class494.field6893.method1544(36, var287).method1824(var288, var289.field5024, 15825);
                    return;
                }
                field2791[field2782++] = class494.field6893.method1544(36, var287).method1825(var288, (byte) 38, var289.field5020);
                return;
            }
        } else if (arg0 < 7000) {
            if (arg0 == 6900) {
                field2791[field2782++] = class162.field2065 && !class586.field8498 ? 1 : 0;
                return;
            }
            if (arg0 == 6901) {
                field2791[field2782++] = class615.field8873;
                return;
            }
            if (arg0 == 6902) {
                field2791[field2782++] = class107.field1389;
                return;
            }
            if (arg0 == 6903) {
                field2791[field2782++] = class144.field1878;
                return;
            }
            if (arg0 == 6904) {
                field2791[field2782++] = class58.field781;
                return;
            }
            if (arg0 == 6905) {
                String var290 = "";
                if (class395.field5460 != null) {
                    if (class395.field5460.field6000 == null) {
                        var290 = class22.method124(class395.field5460.field5998, 8448);
                    } else {
                        var290 = (String) class395.field5460.field6000;
                    }
                }
                field2792[field2793++] = var290;
                return;
            }
            if (arg0 == 6906) {
                field2791[field2782++] = class540.field7553;
                return;
            }
            if (arg0 == 6907) {
                field2791[field2782++] = class77.field1057;
                return;
            }
            if (arg0 == 6908) {
                field2791[field2782++] = class558.field7810;
                return;
            }
            if (arg0 == 6909) {
                field2791[field2782++] = class367.field5111 ? 1 : 0;
                return;
            }
            if (arg0 == 6910) {
                field2791[field2782++] = class551.field7718;
                return;
            }
        } else if (arg0 < 7100) {
            if (arg0 == 7000) {
                int var291 = class501.field6954.method3535((byte) -112);
                field2791[field2782++] = class501.field6954.field8912 = class428.field5845;
                field2791[field2782++] = var291;
                class633.method3662(1);
                return;
            }
            if (arg0 == 7001) {
                class501.field6954.method3545((byte) 64);
                class633.method3662(1);
                return;
            }
            if (arg0 == 7002) {
                class501.field6954.method3540(118);
                class633.method3662(1);
                return;
            }
            if (arg0 == 7003) {
                class501.field6954.method3541(0);
                class633.method3662(1);
                return;
            }
            if (arg0 == 7004) {
                class501.field6954.method3533(true);
                class633.method3662(1);
                return;
            }
            if (arg0 == 7005) {
                class501.field6954.field7852 = 0;
                return;
            }
            if (arg0 == 7006) {
                if (class501.field6954.field8912 == 2) {
                    class501.field6954.field8906 = true;
                    return;
                }
                if (class501.field6954.field8912 == 1) {
                    class501.field6954.field8895 = true;
                    return;
                }
                if (class501.field6954.field8912 == 3) {
                    class501.field6954.field8897 = true;
                }
                return;
            }
            if (arg0 == 7007) {
                field2791[field2782++] = class501.field6954.field7852;
                return;
            }
            if (arg0 == 7008) {
                if (class428.field5845 == 0 && class282.field3697 < 96) {
                    field2791[field2782++] = 2;
                    return;
                }
                field2791[field2782++] = 4;
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lws;I)V")
    private static final void method1403(class532 arg0, int arg1) {
        field2782 = 0;
        field2793 = 0;
        int var2 = -1;
        int[] var3 = arg0.field7424;
        int[] var4 = arg0.field7420;
        byte var5 = -1;
        field2786 = 0;
        try {
            int var6 = 0;
            label260: while (true) {
                var6++;
                if (var6 > arg1) {
                    throw new RuntimeException("slow");
                }
                var2++;
                int var43 = var3[var2];
                if (var43 >= 100) {
                    boolean var35;
                    if (var4[var2] == 1) {
                        var35 = true;
                    } else {
                        var35 = false;
                    }
                    if (var43 >= 100 && var43 < 5000) {
                        method1400(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1402(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field2791[field2782++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field2791[field2782++] = class257.field3191.field5423[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class257.field3191.method2362((byte) 70, field2791[--field2782], var8);
                } else if (var43 == 3) {
                    field2792[field2793++] = arg0.field7425[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field2782 -= 2;
                    if (field2791[field2782 + 1] != field2791[field2782]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field2782 -= 2;
                    if (field2791[field2782 + 1] == field2791[field2782]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field2782 -= 2;
                    if (field2791[field2782] < field2791[field2782 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field2782 -= 2;
                    if (field2791[field2782] > field2791[field2782 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field2786 == 0) {
                        return;
                    }
                    class67 var9 = field2781[--field2786];
                    arg0 = var9.field889;
                    var3 = arg0.field7424;
                    var4 = arg0.field7420;
                    var2 = var9.field892;
                    field2774 = var9.field888;
                    field2775 = var9.field890;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field2791[field2782++] = class257.field3191.method2236(2, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class257.field3191.method2363(field2791[--field2782], var11, -4365);
                } else if (var43 == 31) {
                    field2782 -= 2;
                    if (field2791[field2782] <= field2791[field2782 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field2782 -= 2;
                    if (field2791[field2782] >= field2791[field2782 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field2791[field2782++] = field2774[var4[var2]];
                } else if (var43 == 34) {
                    field2774[var4[var2]] = field2791[--field2782];
                } else if (var43 == 35) {
                    field2792[field2793++] = field2775[var4[var2]];
                } else if (var43 == 36) {
                    field2775[var4[var2]] = field2792[--field2793];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field2793 -= var12;
                    String var13 = class120.method656(field2793, (byte) 89, var12, field2792);
                    field2792[field2793++] = var13;
                } else if (var43 == 38) {
                    field2782--;
                } else if (var43 == 39) {
                    field2793--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class532 var15 = class611.method3496(var14, (byte) -108);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field7422];
                    String[] var17 = new String[var15.field7426];
                    for (int var18 = 0; var18 < var15.field7423; var18++) {
                        var16[var18] = field2791[field2782 + var18 - var15.field7423];
                    }
                    for (int var19 = 0; var19 < var15.field7421; var19++) {
                        var17[var19] = field2792[field2793 + var19 - var15.field7421];
                    }
                    field2782 -= var15.field7423;
                    field2793 -= var15.field7421;
                    class67 var20 = new class67();
                    var20.field889 = arg0;
                    var20.field892 = var2;
                    var20.field888 = field2774;
                    var20.field890 = field2775;
                    if (field2786 >= field2781.length) {
                        throw new RuntimeException();
                    }
                    field2781[field2786++] = var20;
                    arg0 = var15;
                    var3 = var15.field7424;
                    var4 = var15.field7420;
                    var2 = -1;
                    field2774 = var16;
                    field2775 = var17;
                } else if (var43 == 42) {
                    field2791[field2782++] = class121.field1528[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class121.field1528[var21] = field2791[--field2782];
                    class504.method2820(var21, (byte) 102);
                    class184.field2351 |= class36.field553[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field2791[--field2782];
                    if (var24 >= 0 && var24 <= 5000) {
                        field2788[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field2779[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field2791[--field2782];
                    if (var28 < 0 || var28 >= field2788[var27]) {
                        throw new RuntimeException();
                    }
                    field2791[field2782++] = field2779[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field2782 -= 2;
                    int var30 = field2791[field2782];
                    if (var30 < 0 || var30 >= field2788[var29]) {
                        throw new RuntimeException();
                    }
                    field2779[var29][var30] = field2791[field2782 + 1];
                } else if (var43 == 47) {
                    String var31 = class45.field644[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field2792[field2793++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class45.field644[var32] = field2792[--field2793];
                    class622.method3566((byte) -114, var32);
                } else if (var43 == 51) {
                    class607 var33 = arg0.field7431[var4[var2]];
                    class147 var34 = (class147) var33.method3476((long) field2791[--field2782], (byte) 28);
                    if (var34 != null) {
                        var2 += var34.field1902;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field7427 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field1401).append(" ");
                for (int var41 = field2786 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field2781[var41].field889.field1401).append(" ");
                }
                var40.append("op: ").append(var5);
                class447.method2602(var42, 127, var40.toString());
            } else {
                class534.method2970("Clientscript error in: " + arg0.field7427, (byte) -97);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field7427).append("\n");
                for (int var38 = field2786 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field2781[var38].field889.field7427).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class447.method2602(var42, 63, var37.toString());
                class311.method1872(-4408, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Llq;I)V")
    private static final void method1404(class9 arg0, int arg1) {
        Object[] var2 = arg0.field81;
        int var3 = (Integer) var2[0];
        class532 var4 = class611.method3496(var3, (byte) -78);
        if (var4 == null) {
            return;
        }
        field2774 = new int[var4.field7422];
        int var5 = 0;
        field2775 = new String[var4.field7426];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field85;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field83;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field77 == null ? -1 : arg0.field77.field6229;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field71;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field77 == null ? -1 : arg0.field77.field6317;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field79 == null ? -1 : arg0.field79.field6229;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field79 == null ? -1 : arg0.field79.field6317;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field70;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field76;
                }
                field2774[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field82;
                }
                field2775[var6++] = var9;
            }
        }
        field2802 = arg0.field72;
        method1403(var4, arg1);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)Ljava/lang/String;")
    private static final String method1405(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field2787.setTime(new Date(var1));
        int var3 = field2787.get(5);
        int var4 = field2787.get(2);
        int var5 = field2787.get(1);
        return var3 + "-" + field2800[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(IZ)V")
    public static final void method1406(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)V")
    private static final void method1407(int arg0) {
        class447 var1 = class609.method3486(arg0, 983030160);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class447[] var3 = class567.field7930[var2];
        if (var3 == null) {
            class447[] var4 = class508.field7087[var2];
            int var5 = var4.length;
            var3 = class567.field7930[var2] = new class447[var5];
            class205.method1313(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class205.method1313(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Llq;)V")
    public static final void method1408(class9 arg0) {
        method1404(arg0, 200000);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static final void method1409(int arg0) {
        if (arg0 == -1 || !class134.method708(-63, arg0)) {
            return;
        }
        class447[] var1 = class508.field7087[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class447 var3 = var1[var2];
            if (var3.field6223 != null) {
                class9 var4 = new class9();
                var4.field77 = var3;
                var4.field81 = var3.field6223;
                method1404(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "()V")
    public static final void method1410() {
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "()V")
    public static void method1411() {
        field2774 = null;
        field2775 = null;
        field2788 = null;
        field2779 = null;
        field2791 = null;
        field2792 = null;
        field2781 = null;
        field2777 = null;
        field2776 = null;
        field2797 = null;
        field2787 = null;
        field2800 = null;
        field2801 = null;
        field2799 = null;
    }
}
