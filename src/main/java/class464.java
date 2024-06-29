import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class464 {

    @OriginalMember(owner = "client!ng", name = "m", descriptor = "I")
    private static int field6762 = 0;

    @OriginalMember(owner = "client!ng", name = "q", descriptor = "I")
    private static int field6766 = 0;

    @OriginalMember(owner = "client!ng", name = "r", descriptor = "I")
    private static int field6767 = 0;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[I")
    private static int[] field6756 = new int[5];

    @OriginalMember(owner = "client!ng", name = "s", descriptor = "[[I")
    private static int[][] field6768 = new int[5][5000];

    @OriginalMember(owner = "client!ng", name = "p", descriptor = "[Ljava/lang/String;")
    private static String[] field6765 = new String[1000];

    @OriginalMember(owner = "client!ng", name = "u", descriptor = "[I")
    private static int[] field6770 = new int[1000];

    @OriginalMember(owner = "client!ng", name = "y", descriptor = "[Ltaa;")
    private static class465[] field6774 = new class465[50];

    @OriginalMember(owner = "client!ng", name = "l", descriptor = "Ljava/util/Calendar;")
    private static Calendar field6761 = Calendar.getInstance();

    @OriginalMember(owner = "client!ng", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field6776 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ng", name = "B", descriptor = "[I")
    private static int[] field6777 = new int[3];

    @OriginalMember(owner = "client!ng", name = "z", descriptor = "Leda;")
    public static class14 field6775 = new class14(4);

    @OriginalMember(owner = "client!ng", name = "C", descriptor = "I")
    private static int field6778 = 0;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "I")
    public static int field6752;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "I")
    public static int field6755;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!ng", name = "j", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!ng", name = "n", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!ng", name = "o", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!ng", name = "v", descriptor = "I")
    public static int field6771;

    @OriginalMember(owner = "client!ng", name = "w", descriptor = "I")
    public static int field6772;

    @OriginalMember(owner = "client!ng", name = "x", descriptor = "I")
    public static int field6773;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "Lraa;")
    private static class353 field6754;

    @OriginalMember(owner = "client!ng", name = "i", descriptor = "Lraa;")
    private static class353 field6758;

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "Leba;")
    private static class662 field6751;

    @OriginalMember(owner = "client!ng", name = "t", descriptor = "[I")
    private static int[] field6769;

    @OriginalMember(owner = "client!ng", name = "k", descriptor = "[Ljava/lang/String;")
    private static String[] field6760;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Luca;)V", line = 8)
    public static final void method2838(class700 arg0) {
        method2852(arg0, 200000);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IZ)V", line = 15)
    private static final void method2839(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field6767 -= 3;
                int var2 = field6770[field6767];
                int var3 = field6770[field6767 + 1];
                int var4 = field6770[field6767 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class353 var5 = class65.method638(var2, 1668949296);
                if (var5.field5335 == null) {
                    var5.field5335 = new class353[var4 + 1];
                }
                if (var5.field5335.length <= var4) {
                    class353[] var6 = new class353[var4 + 1];
                    for (int var7 = 0; var7 < var5.field5335.length; var7++) {
                        var6[var7] = var5.field5335[var7];
                    }
                    var5.field5335 = var6;
                }
                if (var4 > 0 && var5.field5335[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class353 var8 = new class353();
                var8.field5306 = var3;
                var8.field5202 = var8.field5349 = var5.field5349;
                var8.field5352 = var4;
                var5.field5335[var4] = var8;
                if (arg1) {
                    field6758 = var8;
                } else {
                    field6754 = var8;
                }
                class717.method3960(var5, (byte) 56);
                return;
            }
            if (arg0 == 101) {
                class353 var9 = arg1 ? field6758 : field6754;
                if (var9.field5352 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class353 var10 = class65.method638(var9.field5349, 1668949296);
                var10.field5335[var9.field5352] = null;
                class717.method3960(var10, (byte) 117);
                return;
            }
            if (arg0 == 102) {
                class353 var11 = class65.method638(field6770[--field6767], 1668949296);
                var11.field5335 = null;
                class717.method3960(var11, (byte) 119);
                return;
            }
            if (arg0 == 200) {
                field6767 -= 2;
                int var12 = field6770[field6767];
                int var13 = field6770[field6767 + 1];
                class353 var14 = class745.method4165(120, var12, var13);
                if (var14 != null && var13 != -1) {
                    field6770[field6767++] = 1;
                    if (arg1) {
                        field6758 = var14;
                        return;
                    }
                    field6754 = var14;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field6770[--field6767];
                class353 var16 = class65.method638(var15, 1668949296);
                if (var16 != null) {
                    field6770[field6767++] = 1;
                    if (arg1) {
                        field6758 = var16;
                        return;
                    }
                    field6754 = var16;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field6770[--field6767];
                method2846(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field6770[--field6767];
                method2841(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field6767 -= 2;
                int var19 = field6770[field6767];
                int var20 = field6770[field6767 + 1];
                if (class145.field2251.field8138 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class167.field2917.length; var21++) {
                    if (class167.field2917[var21] == var19) {
                        class145.field2251.field8138.method2657(class174.field2980, var20, var21, true);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class41.field717.length; var22++) {
                    if (class41.field717[var22] == var19) {
                        class145.field2251.field8138.method2657(class174.field2980, var20, var22, true);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field6767 -= 2;
                int var23 = field6770[field6767];
                int var24 = field6770[field6767 + 1];
                if (class145.field2251.field8138 == null) {
                    return;
                }
                class145.field2251.field8138.method2655(var24, var23, 12);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field6770[--field6767] != 0;
                if (class145.field2251.field8138 == null) {
                    return;
                }
                class145.field2251.field8138.method2653((byte) 49, var25);
                return;
            }
            if (arg0 == 411) {
                field6767 -= 2;
                int var26 = field6770[field6767];
                int var27 = field6770[field6767 + 1];
                if (class145.field2251.field8138 == null) {
                    return;
                }
                class145.field2251.field8138.method2656(var26, var27, class556.field7917, 1073741824);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class353 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class65.method638(field6770[--field6767], 1668949296);
            } else {
                var28 = arg1 ? field6758 : field6754;
            }
            if (arg0 == 1000) {
                field6767 -= 4;
                var28.field5240 = field6770[field6767];
                var28.field5203 = field6770[field6767 + 1];
                int var29 = field6770[field6767 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field6770[field6767 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field5357 = (byte) var29;
                var28.field5248 = (byte) var30;
                class717.method3960(var28, (byte) 98);
                class208.method1517(var28, -1);
                if (var28.field5352 == -1) {
                    class492.method2992(-91, var28.field5349);
                }
                return;
            }
            if (arg0 == 1001) {
                field6767 -= 4;
                var28.field5258 = field6770[field6767];
                var28.field5300 = field6770[field6767 + 1];
                var28.field5325 = 0;
                var28.field5356 = 0;
                int var31 = field6770[field6767 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field6770[field6767 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field5250 = (byte) var31;
                var28.field5324 = (byte) var32;
                class717.method3960(var28, (byte) 90);
                class208.method1517(var28, -1);
                if (var28.field5306 == 0) {
                    class134.method1083(false, (byte) 69, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field6770[--field6767] == 1;
                if (var28.field5210 != var33) {
                    var28.field5210 = var33;
                    class717.method3960(var28, (byte) 74);
                }
                if (var28.field5352 == -1) {
                    class675.method3768(7, var28.field5349);
                }
                return;
            }
            if (arg0 == 1004) {
                field6767 -= 2;
                var28.field5229 = field6770[field6767];
                var28.field5206 = field6770[field6767 + 1];
                class717.method3960(var28, (byte) 54);
                class208.method1517(var28, -1);
                if (var28.field5306 == 0) {
                    class134.method1083(false, (byte) 69, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field5215 = field6770[--field6767] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class353 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class65.method638(field6770[--field6767], 1668949296);
            } else {
                var34 = arg1 ? field6758 : field6754;
            }
            if (arg0 == 1100) {
                field6767 -= 2;
                var34.field5284 = field6770[field6767];
                if (var34.field5284 > var34.field5351 - var34.field5230) {
                    var34.field5284 = var34.field5351 - var34.field5230;
                }
                if (var34.field5284 < 0) {
                    var34.field5284 = 0;
                }
                var34.field5299 = field6770[field6767 + 1];
                if (var34.field5299 > var34.field5358 - var34.field5280) {
                    var34.field5299 = var34.field5358 - var34.field5280;
                }
                if (var34.field5299 < 0) {
                    var34.field5299 = 0;
                }
                class717.method3960(var34, (byte) 113);
                if (var34.field5352 == -1) {
                    class330.method2128(true, var34.field5349);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field5278 = field6770[--field6767];
                class717.method3960(var34, (byte) 55);
                if (var34.field5352 == -1) {
                    class689.method3849(var34.field5349, -374);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field5331 = field6770[--field6767] == 1;
                class717.method3960(var34, (byte) 99);
                return;
            }
            if (arg0 == 1103) {
                var34.field5294 = field6770[--field6767];
                class717.method3960(var34, (byte) 47);
                return;
            }
            if (arg0 == 1104) {
                var34.field5293 = field6770[--field6767];
                class717.method3960(var34, (byte) 95);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field6770[--field6767];
                if (var34.field5279 != var35) {
                    var34.field5279 = var35;
                    class717.method3960(var34, (byte) 64);
                }
                if (var34.field5352 == -1) {
                    class660.method3712(14, var34.field5349);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field5219 = field6770[--field6767];
                class717.method3960(var34, (byte) 73);
                return;
            }
            if (arg0 == 1107) {
                var34.field5265 = field6770[--field6767] == 1;
                class717.method3960(var34, (byte) 103);
                return;
            }
            if (arg0 == 1108) {
                var34.field5249 = 1;
                var34.field5276 = field6770[--field6767];
                class717.method3960(var34, (byte) 45);
                if (var34.field5352 == -1) {
                    class233.method1616(var34.field5349, 4);
                }
                return;
            }
            if (arg0 == 1109) {
                field6767 -= 6;
                var34.field5244 = field6770[field6767];
                var34.field5227 = field6770[field6767 + 1];
                var34.field5301 = field6770[field6767 + 2];
                var34.field5368 = field6770[field6767 + 3];
                var34.field5267 = field6770[field6767 + 4];
                var34.field5253 = field6770[field6767 + 5];
                class717.method3960(var34, (byte) 65);
                if (var34.field5352 == -1) {
                    class594.method3401(7, var34.field5349);
                    class758.method4218(var34.field5349, -119);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field6770[--field6767];
                if (var34.field5290 != var36) {
                    var34.field5290 = var36;
                    var34.field5242 = 0;
                    var34.field5245 = 1;
                    var34.field5266 = 0;
                    class82 var37 = var34.field5290 == -1 ? null : class83.field1219.method2358((byte) 106, var34.field5290);
                    if (var37 != null) {
                        class144.method1111(var34.field5242, var37, (byte) 117);
                    }
                    class717.method3960(var34, (byte) 60);
                }
                if (var34.field5352 == -1) {
                    class550.method3212(var34.field5349, (byte) -28);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field5236 = field6770[--field6767] == 1;
                class717.method3960(var34, (byte) 105);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field6765[--field6766];
                if (!var38.equals(var34.field5231)) {
                    var34.field5231 = var38;
                    class717.method3960(var34, (byte) 86);
                }
                if (var34.field5352 == -1) {
                    class603.method3458(var34.field5349, (byte) -58);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field5252 = field6770[--field6767];
                class717.method3960(var34, (byte) 54);
                if (var34.field5352 == -1) {
                    class552.method3221(var34.field5349, 16);
                }
                return;
            }
            if (arg0 == 1114) {
                field6767 -= 3;
                var34.field5212 = field6770[field6767];
                var34.field5341 = field6770[field6767 + 1];
                var34.field5285 = field6770[field6767 + 2];
                class717.method3960(var34, (byte) 97);
                return;
            }
            if (arg0 == 1115) {
                var34.field5295 = field6770[--field6767] == 1;
                class717.method3960(var34, (byte) 81);
                return;
            }
            if (arg0 == 1116) {
                var34.field5362 = field6770[--field6767];
                class717.method3960(var34, (byte) 77);
                return;
            }
            if (arg0 == 1117) {
                var34.field5316 = field6770[--field6767];
                class717.method3960(var34, (byte) 65);
                return;
            }
            if (arg0 == 1118) {
                var34.field5221 = field6770[--field6767] == 1;
                class717.method3960(var34, (byte) 47);
                return;
            }
            if (arg0 == 1119) {
                var34.field5207 = field6770[--field6767] == 1;
                class717.method3960(var34, (byte) 39);
                return;
            }
            if (arg0 == 1120) {
                field6767 -= 2;
                var34.field5351 = field6770[field6767];
                var34.field5358 = field6770[field6767 + 1];
                class717.method3960(var34, (byte) 80);
                if (var34.field5306 == 0) {
                    class134.method1083(false, (byte) 57, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field5226 = field6770[--field6767] == 1;
                class717.method3960(var34, (byte) 49);
                return;
            }
            if (arg0 == 1123) {
                var34.field5253 = field6770[--field6767];
                class717.method3960(var34, (byte) 109);
                if (var34.field5352 == -1) {
                    class594.method3401(7, var34.field5349);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field6770[--field6767];
                var34.field5297 = var39 == 1;
                class717.method3960(var34, (byte) 39);
                return;
            }
            if (arg0 == 1125) {
                field6767 -= 2;
                var34.field5332 = field6770[field6767];
                var34.field5291 = field6770[field6767 + 1];
                class717.method3960(var34, (byte) 72);
                return;
            }
            if (arg0 == 1126) {
                var34.field5274 = field6770[--field6767];
                class717.method3960(var34, (byte) 102);
                return;
            }
            if (arg0 == 1127) {
                field6767 -= 2;
                int var40 = field6770[field6767];
                int var41 = field6770[field6767 + 1];
                class193 var42 = class382.field5728.method1997((byte) 114, var40);
                if (var42.field3339 != var41) {
                    var34.method2248(0, var40, var41);
                    return;
                }
                var34.method2253(var40, 4);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field6770[--field6767];
                String var44 = field6765[--field6766];
                class193 var45 = class382.field5728.method1997((byte) 105, var43);
                if (!var45.field3338.equals(var44)) {
                    var34.method2255(var44, 26700, var43);
                    return;
                }
                var34.method2253(var43, 4);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field6770[--field6767];
                if (var34.field5306 != 5 && arg0 == 1129 || var34.field5306 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field5327 != var46) {
                    var34.field5327 = var46;
                    class717.method3960(var34, (byte) 72);
                }
                if (var34.field5352 == -1) {
                    class458.method2807(32768, var34.field5349);
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class353 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class65.method638(field6770[--field6767], 1668949296);
            } else {
                var47 = arg1 ? field6758 : field6754;
            }
            class717.method3960(var47, (byte) 111);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field6767 -= 2;
                int var48 = field6770[field6767];
                int var49 = field6770[field6767 + 1];
                if (var47.field5352 == -1) {
                    class213.method1537(var47.field5349, 7);
                    class594.method3401(7, var47.field5349);
                    class758.method4218(var47.field5349, -123);
                }
                if (var48 == -1) {
                    var47.field5249 = 1;
                    var47.field5276 = -1;
                    var47.field5328 = -1;
                    return;
                }
                var47.field5328 = var48;
                var47.field5367 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field5337 = true;
                } else {
                    var47.field5337 = false;
                }
                class688 var50 = class556.field7917.method741(118, var48);
                var47.field5301 = var50.field9733;
                var47.field5368 = var50.field9699;
                var47.field5267 = var50.field9744;
                var47.field5244 = var50.field9723;
                var47.field5227 = var50.field9758;
                var47.field5253 = var50.field9708;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field5233 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field5233 = 1;
                } else {
                    var47.field5233 = 2;
                }
                if (var47.field5325 > 0) {
                    var47.field5253 = var47.field5253 * 32 / var47.field5325;
                    return;
                }
                if (var47.field5258 > 0) {
                    var47.field5253 = var47.field5253 * 32 / var47.field5258;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field5249 = 2;
                var47.field5276 = field6770[--field6767];
                if (var47.field5352 == -1) {
                    class233.method1616(var47.field5349, 4);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field5249 = 3;
                var47.field5276 = -1;
                if (var47.field5352 == -1) {
                    class233.method1616(var47.field5349, 4);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field5249 = 6;
                var47.field5276 = field6770[--field6767];
                if (var47.field5352 == -1) {
                    class233.method1616(var47.field5349, 4);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field5249 = 5;
                var47.field5276 = field6770[--field6767];
                if (var47.field5352 == -1) {
                    class233.method1616(var47.field5349, 4);
                }
                return;
            }
            if (arg0 == 1206) {
                field6767 -= 4;
                var47.field5339 = field6770[field6767];
                var47.field5225 = field6770[field6767 + 1];
                var47.field5350 = field6770[field6767 + 2];
                var47.field5263 = field6770[field6767 + 3];
                class717.method3960(var47, (byte) 127);
                return;
            }
            if (arg0 == 1207) {
                field6767 -= 2;
                var47.field5198 = field6770[field6767];
                var47.field5246 = field6770[field6767 + 1];
                class717.method3960(var47, (byte) 113);
                return;
            }
            if (arg0 == 1210) {
                field6767 -= 4;
                var47.field5276 = field6770[field6767];
                var47.field5364 = field6770[field6767 + 1];
                if (field6770[field6767 + 2] == 1) {
                    var47.field5249 = 9;
                } else {
                    var47.field5249 = 8;
                }
                if (field6770[field6767 + 3] == 1) {
                    var47.field5337 = true;
                } else {
                    var47.field5337 = false;
                }
                if (var47.field5352 == -1) {
                    class233.method1616(var47.field5349, 4);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field5249 = 5;
                var47.field5276 = class673.field9516;
                var47.field5364 = 0;
                if (var47.field5352 == -1) {
                    class233.method1616(var47.field5349, 4);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class353 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class65.method638(field6770[--field6767], 1668949296);
                } else {
                    var62 = arg1 ? field6758 : field6754;
                }
                if (arg0 == 1499) {
                    var62.method2256((byte) -107);
                    return;
                }
                String var63 = field6765[--field6766];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field6770[--field6767];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field6770[--field6767];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field6765[--field6766];
                    } else {
                        var66[var67] = Integer.valueOf(field6770[--field6767]);
                    }
                }
                int var68 = field6770[--field6767];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field5289 = var66;
                } else if (arg0 == 1401) {
                    var62.field5320 = var66;
                } else if (arg0 == 1402) {
                    var62.field5222 = var66;
                } else if (arg0 == 1403) {
                    var62.field5313 = var66;
                } else if (arg0 == 1404) {
                    var62.field5342 = var66;
                } else if (arg0 == 1405) {
                    var62.field5268 = var66;
                } else if (arg0 == 1406) {
                    var62.field5318 = var66;
                } else if (arg0 == 1407) {
                    var62.field5275 = var66;
                    var62.field5259 = var64;
                } else if (arg0 == 1408) {
                    var62.field5361 = var66;
                } else if (arg0 == 1409) {
                    var62.field5305 = var66;
                } else if (arg0 == 1410) {
                    var62.field5302 = var66;
                } else if (arg0 == 1411) {
                    var62.field5317 = var66;
                } else if (arg0 == 1412) {
                    var62.field5303 = var66;
                } else if (arg0 == 1414) {
                    var62.field5255 = var66;
                    var62.field5323 = var64;
                } else if (arg0 == 1415) {
                    var62.field5257 = var66;
                    var62.field5232 = var64;
                } else if (arg0 == 1416) {
                    var62.field5209 = var66;
                } else if (arg0 == 1417) {
                    var62.field5292 = var66;
                } else if (arg0 == 1418) {
                    var62.field5330 = var66;
                } else if (arg0 == 1419) {
                    var62.field5321 = var66;
                } else if (arg0 == 1420) {
                    var62.field5205 = var66;
                } else if (arg0 == 1421) {
                    var62.field5238 = var66;
                } else if (arg0 == 1422) {
                    var62.field5315 = var66;
                } else if (arg0 == 1423) {
                    var62.field5223 = var66;
                } else if (arg0 == 1424) {
                    var62.field5208 = var66;
                } else if (arg0 == 1425) {
                    var62.field5283 = var66;
                } else if (arg0 == 1426) {
                    var62.field5211 = var66;
                } else if (arg0 == 1427) {
                    var62.field5322 = var66;
                } else if (arg0 == 1428) {
                    var62.field5197 = var66;
                    var62.field5217 = var64;
                } else if (arg0 == 1429) {
                    var62.field5333 = var66;
                    var62.field5298 = var64;
                } else if (arg0 == 1430) {
                    var62.field5228 = var66;
                }
                var62.field5254 = true;
                return;
            }
            if (arg0 < 1600) {
                class353 var69 = arg1 ? field6758 : field6754;
                if (arg0 == 1500) {
                    field6770[field6767++] = var69.field5359;
                    return;
                }
                if (arg0 == 1501) {
                    field6770[field6767++] = var69.field5296;
                    return;
                }
                if (arg0 == 1502) {
                    field6770[field6767++] = var69.field5230;
                    return;
                }
                if (arg0 == 1503) {
                    field6770[field6767++] = var69.field5280;
                    return;
                }
                if (arg0 == 1504) {
                    field6770[field6767++] = var69.field5210 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field6770[field6767++] = var69.field5202;
                    return;
                }
                if (arg0 == 1506) {
                    class353 var70 = class69.method652(var69, 0);
                    field6770[field6767++] = var70 == null ? -1 : var70.field5349;
                    return;
                }
            } else if (arg0 < 1700) {
                class353 var71 = arg1 ? field6758 : field6754;
                if (arg0 == 1600) {
                    field6770[field6767++] = var71.field5284;
                    return;
                }
                if (arg0 == 1601) {
                    field6770[field6767++] = var71.field5299;
                    return;
                }
                if (arg0 == 1602) {
                    field6765[field6766++] = var71.field5231;
                    return;
                }
                if (arg0 == 1603) {
                    field6770[field6767++] = var71.field5351;
                    return;
                }
                if (arg0 == 1604) {
                    field6770[field6767++] = var71.field5358;
                    return;
                }
                if (arg0 == 1605) {
                    field6770[field6767++] = var71.field5253;
                    return;
                }
                if (arg0 == 1606) {
                    field6770[field6767++] = var71.field5301;
                    return;
                }
                if (arg0 == 1607) {
                    field6770[field6767++] = var71.field5267;
                    return;
                }
                if (arg0 == 1608) {
                    field6770[field6767++] = var71.field5368;
                    return;
                }
                if (arg0 == 1609) {
                    field6770[field6767++] = var71.field5294;
                    return;
                }
                if (arg0 == 1610) {
                    field6770[field6767++] = var71.field5244;
                    return;
                }
                if (arg0 == 1611) {
                    field6770[field6767++] = var71.field5227;
                    return;
                }
                if (arg0 == 1612) {
                    field6770[field6767++] = var71.field5279;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field6770[--field6767];
                    class193 var73 = class382.field5728.method1997((byte) 116, var72);
                    if (var73.method1463(-6764)) {
                        field6765[field6766++] = var71.method2250(var73.field3338, 1, var72);
                        return;
                    }
                    field6770[field6767++] = var71.method2246(var73.field3339, (byte) -74, var72);
                    return;
                }
                if (arg0 == 1614) {
                    field6770[field6767++] = var71.field5219;
                    return;
                }
                if (arg0 == 2614) {
                    field6770[field6767++] = var71.field5249 == 1 ? var71.field5276 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class353 var74 = arg1 ? field6758 : field6754;
                if (arg0 == 1700) {
                    field6770[field6767++] = var74.field5328;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field5328 != -1) {
                        field6770[field6767++] = var74.field5367;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field6770[field6767++] = var74.field5352;
                    return;
                }
            } else if (arg0 < 1900) {
                class353 var75 = arg1 ? field6758 : field6754;
                if (arg0 == 1800) {
                    field6770[field6767++] = client.method2735(var75).method1866(1092);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field6770[--field6767];
                    int var357 = var76 - 1;
                    if (var75.field5353 != null && var357 < var75.field5353.length && var75.field5353[var357] != null) {
                        field6765[field6766++] = var75.field5353[var357];
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field5336 == null) {
                        field6765[field6766++] = "";
                        return;
                    }
                    field6765[field6766++] = var75.field5336;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class353 var355;
                if (arg0 >= 2000) {
                    var355 = class65.method638(field6770[--field6767], 1668949296);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field6758 : field6754;
                }
                if (field6778 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field5322 == null) {
                        return;
                    }
                    class700 var356 = new class700();
                    var356.field9902 = var355;
                    var356.field9891 = var355.field5322;
                    var356.field9904 = field6778 + 1;
                    class402.field5970.method3472(113, var356);
                    return;
                }
            } else if (arg0 < 2600) {
                class353 var77 = class65.method638(field6770[--field6767], 1668949296);
                if (arg0 == 2500) {
                    field6770[field6767++] = var77.field5359;
                    return;
                }
                if (arg0 == 2501) {
                    field6770[field6767++] = var77.field5296;
                    return;
                }
                if (arg0 == 2502) {
                    field6770[field6767++] = var77.field5230;
                    return;
                }
                if (arg0 == 2503) {
                    field6770[field6767++] = var77.field5280;
                    return;
                }
                if (arg0 == 2504) {
                    field6770[field6767++] = var77.field5210 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field6770[field6767++] = var77.field5202;
                    return;
                }
                if (arg0 == 1506) {
                    class353 var78 = class69.method652(var77, 0);
                    field6770[field6767++] = var78 == null ? -1 : var78.field5349;
                    return;
                }
            } else if (arg0 < 2700) {
                class353 var79 = class65.method638(field6770[--field6767], 1668949296);
                if (arg0 == 2600) {
                    field6770[field6767++] = var79.field5284;
                    return;
                }
                if (arg0 == 2601) {
                    field6770[field6767++] = var79.field5299;
                    return;
                }
                if (arg0 == 2602) {
                    field6765[field6766++] = var79.field5231;
                    return;
                }
                if (arg0 == 2603) {
                    field6770[field6767++] = var79.field5351;
                    return;
                }
                if (arg0 == 2604) {
                    field6770[field6767++] = var79.field5358;
                    return;
                }
                if (arg0 == 2605) {
                    field6770[field6767++] = var79.field5253;
                    return;
                }
                if (arg0 == 2606) {
                    field6770[field6767++] = var79.field5301;
                    return;
                }
                if (arg0 == 2607) {
                    field6770[field6767++] = var79.field5267;
                    return;
                }
                if (arg0 == 2608) {
                    field6770[field6767++] = var79.field5368;
                    return;
                }
                if (arg0 == 2609) {
                    field6770[field6767++] = var79.field5294;
                    return;
                }
                if (arg0 == 2610) {
                    field6770[field6767++] = var79.field5244;
                    return;
                }
                if (arg0 == 2611) {
                    field6770[field6767++] = var79.field5227;
                    return;
                }
                if (arg0 == 2612) {
                    field6770[field6767++] = var79.field5279;
                    return;
                }
                if (arg0 == 2613) {
                    field6770[field6767++] = var79.field5219;
                    return;
                }
                if (arg0 == 2614) {
                    field6770[field6767++] = var79.field5249 == 1 ? var79.field5276 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class353 var80 = class65.method638(field6770[--field6767], 1668949296);
                    field6770[field6767++] = var80.field5328;
                    return;
                }
                if (arg0 == 2701) {
                    class353 var81 = class65.method638(field6770[--field6767], 1668949296);
                    if (var81.field5328 != -1) {
                        field6770[field6767++] = var81.field5367;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field6770[--field6767];
                    class520 var83 = (class520) class36.field340.method3512(true, (long) var82);
                    if (var83 != null) {
                        field6770[field6767++] = 1;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class353 var84 = class65.method638(field6770[--field6767], 1668949296);
                    if (var84.field5335 == null) {
                        field6770[field6767++] = 0;
                        return;
                    }
                    int var85 = var84.field5335.length;
                    for (int var86 = 0; var86 < var84.field5335.length; var86++) {
                        if (var84.field5335[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field6770[field6767++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field6767 -= 2;
                    int var87 = field6770[field6767];
                    int var88 = field6770[field6767 + 1];
                    class520 var89 = (class520) class36.field340.method3512(true, (long) var87);
                    if (var89 != null && var89.field7511 == var88) {
                        field6770[field6767++] = 1;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class353 var90 = class65.method638(field6770[--field6767], 1668949296);
                if (arg0 == 2800) {
                    field6770[field6767++] = client.method2735(var90).method1866(1092);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field6770[--field6767];
                    int var358 = var91 - 1;
                    if (var90.field5353 != null && var358 < var90.field5353.length && var90.field5353[var358] != null) {
                        field6765[field6766++] = var90.field5353[var358];
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field5336 == null) {
                        field6765[field6766++] = "";
                        return;
                    }
                    field6765[field6766++] = var90.field5336;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field6765[--field6766];
                    class744.method4162(var92, 3);
                    return;
                }
                if (arg0 == 3101) {
                    field6767 -= 2;
                    class363.method2314(false, class145.field2251, field6770[field6767], field6770[field6767 + 1]);
                    return;
                }
                if (arg0 == 3103) {
                    class330.method2127(-1, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field6765[--field6766];
                    int var94 = 0;
                    if (class166.method1277(var93, 0)) {
                        var94 = class714.method3949((byte) -108, var93);
                    }
                    field6750++;
                    class540 var95 = class257.method1732(true, class156.field2424, class655.field9332);
                    var95.field7707.method1970((byte) 29, var94);
                    class756.method4211(var95, 126);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field6765[--field6766];
                    field6757++;
                    class540 var97 = class257.method1732(true, class520.field7512, class655.field9332);
                    var97.field7707.method1926(var96.length() + 1, 65280);
                    var97.field7707.method1931(125, var96);
                    class756.method4211(var97, 116);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field6765[--field6766];
                    field6755++;
                    class540 var99 = class257.method1732(true, class564.field7979, class655.field9332);
                    var99.field7707.method1926(var98.length() + 1, 65280);
                    var99.field7707.method1931(112, var98);
                    class756.method4211(var99, 110);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field6770[--field6767];
                    String var101 = field6765[--field6766];
                    class264.method1760((byte) 121, var100, var101);
                    return;
                }
                if (arg0 == 3108) {
                    field6767 -= 3;
                    int var102 = field6770[field6767];
                    int var103 = field6770[field6767 + 1];
                    int var104 = field6770[field6767 + 2];
                    class353 var105 = class65.method638(var104, 1668949296);
                    class439.method2702(-17, var103, var105, var102);
                    return;
                }
                if (arg0 == 3109) {
                    field6767 -= 2;
                    int var106 = field6770[field6767];
                    int var107 = field6770[field6767 + 1];
                    class353 var108 = arg1 ? field6758 : field6754;
                    class439.method2702(-118, var107, var108, var106);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field6770[--field6767];
                    field6773++;
                    class540 var110 = class257.method1732(true, class465.field6787, class655.field9332);
                    var110.field7707.method1939(var109, 1134947720);
                    class756.method4211(var110, 122);
                    return;
                }
                if (arg0 == 3111) {
                    field6767 -= 2;
                    int var111 = field6770[field6767];
                    int var112 = field6770[field6767 + 1];
                    class520 var113 = (class520) class36.field340.method3512(true, (long) var111);
                    if (var113 != null) {
                        class197.method1479(var113.field7511 != var112, var113, true, (byte) 37);
                    }
                    class325.method2104(var112, 3, true, var111, (byte) -122);
                    return;
                }
                if (arg0 == 3112) {
                    field6767--;
                    int var114 = field6770[field6767];
                    class520 var115 = (class520) class36.field340.method3512(true, (long) var114);
                    if (var115 != null && var115.field7515 == 3) {
                        class197.method1479(true, var115, true, (byte) 37);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class13.method58(field6765[--field6766], 16);
                    return;
                }
                if (arg0 == 3114) {
                    field6767 -= 2;
                    int var116 = field6770[field6767];
                    int var117 = field6770[field6767 + 1];
                    String var118 = field6765[--field6766];
                    class157.method1177("", var117, var118, "", "", 1, var116);
                    return;
                }
                if (arg0 == 3115) {
                    field6767 -= 11;
                    class686[] var119 = class99.method818((byte) 18);
                    class322[] var120 = class570.method3305(0);
                    class418.method2568(4095, field6770[field6767 + 4], field6770[field6767 + 9], field6770[field6767 + 2], field6770[field6767 + 10], var120[field6770[field6767 + 1]], field6770[field6767 + 5], field6770[field6767 + 8], var119[field6770[field6767]], field6770[field6767 + 6], field6770[field6767 + 3], field6770[field6767 + 7]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field6767 -= 3;
                    class146.method1122(255, field6770[field6767 + 2], field6770[field6767], 256, (byte) -113, field6770[field6767 + 1]);
                    return;
                }
                if (arg0 == 3201) {
                    class114.method921((byte) 108, field6770[--field6767], 255, 50);
                    return;
                }
                if (arg0 == 3202) {
                    field6767 -= 2;
                    class641.method3622(-193, 255, field6770[field6767 + 1], field6770[field6767]);
                    return;
                }
                if (arg0 == 3203) {
                    field6767 -= 4;
                    class146.method1122(field6770[field6767 + 3], field6770[field6767 + 2], field6770[field6767], 256, (byte) -113, field6770[field6767 + 1]);
                    return;
                }
                if (arg0 == 3204) {
                    field6767 -= 3;
                    class114.method921((byte) 107, field6770[field6767], field6770[field6767 + 1], field6770[field6767 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field6767 -= 3;
                    class641.method3622(-193, field6770[field6767 + 2], field6770[field6767 + 1], field6770[field6767]);
                    return;
                }
                if (arg0 == 3206) {
                    field6767 -= 4;
                    class522.method3110(field6770[field6767 + 2], 256, 50, field6770[field6767 + 3], field6770[field6767], field6770[field6767 + 1], false);
                    return;
                }
                if (arg0 == 3207) {
                    field6767 -= 4;
                    class522.method3110(field6770[field6767 + 2], 256, 50, field6770[field6767 + 3], field6770[field6767], field6770[field6767 + 1], true);
                    return;
                }
                if (arg0 == 3208) {
                    field6767 -= 5;
                    class146.method1122(field6770[field6767 + 3], field6770[field6767 + 2], field6770[field6767], field6770[field6767 + 4], (byte) -113, field6770[field6767 + 1]);
                    return;
                }
                if (arg0 == 3209) {
                    field6767 -= 5;
                    class522.method3110(field6770[field6767 + 2], field6770[field6767 + 4], 50, field6770[field6767 + 3], field6770[field6767], field6770[field6767 + 1], false);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field6770[field6767++] = class199.field3403;
                    return;
                }
                if (arg0 == 3301) {
                    field6767 -= 2;
                    int var121 = field6770[field6767];
                    int var122 = field6770[field6767 + 1];
                    field6770[field6767++] = class214.method1544(false, var122, var121, -1);
                    return;
                }
                if (arg0 == 3302) {
                    field6767 -= 2;
                    int var123 = field6770[field6767];
                    int var124 = field6770[field6767 + 1];
                    field6770[field6767++] = class238.method1644(var124, var123, false, false);
                    return;
                }
                if (arg0 == 3303) {
                    field6767 -= 2;
                    int var125 = field6770[field6767];
                    int var126 = field6770[field6767 + 1];
                    field6770[field6767++] = class553.method3224(var125, var126, false, false);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field6770[--field6767];
                    field6770[field6767++] = class398.field5919.method2408((byte) 79, var127).field9563;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field6770[--field6767];
                    field6770[field6767++] = class498.field7226[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field6770[--field6767];
                    field6770[field6767++] = class226.field3629[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field6770[--field6767];
                    field6770[field6767++] = class747.field10443[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class145.field2251.field9470;
                    int var132 = (class145.field2251.field9477 >> 9) + class265.field4123;
                    int var133 = (class145.field2251.field9475 >> 9) + class723.field10155;
                    field6770[field6767++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field6770[--field6767];
                    field6770[field6767++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field6770[--field6767];
                    field6770[field6767++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field6770[--field6767];
                    field6770[field6767++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field6770[field6767++] = class384.field5763 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field6767 -= 2;
                    int var137 = field6770[field6767];
                    int var138 = field6770[field6767 + 1];
                    field6770[field6767++] = class214.method1544(true, var138, var137, -1);
                    return;
                }
                if (arg0 == 3314) {
                    field6767 -= 2;
                    int var139 = field6770[field6767];
                    int var140 = field6770[field6767 + 1];
                    field6770[field6767++] = class238.method1644(var140, var139, true, false);
                    return;
                }
                if (arg0 == 3315) {
                    field6767 -= 2;
                    int var141 = field6770[field6767];
                    int var142 = field6770[field6767 + 1];
                    field6770[field6767++] = class553.method3224(var141, var142, false, true);
                    return;
                }
                if (arg0 == 3316) {
                    if (class81.field1173 >= 2) {
                        field6770[field6767++] = class81.field1173;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field6770[field6767++] = class152.field2373;
                    return;
                }
                if (arg0 == 3318) {
                    field6770[field6767++] = class229.field3703.field7542;
                    return;
                }
                if (arg0 == 3321) {
                    field6770[field6767++] = class495.field7168;
                    return;
                }
                if (arg0 == 3322) {
                    field6770[field6767++] = class734.field10337;
                    return;
                }
                if (arg0 == 3323) {
                    if (class678.field9557 >= 5 && class678.field9557 <= 9) {
                        field6770[field6767++] = 1;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class678.field9557 >= 5 && class678.field9557 <= 9) {
                        field6770[field6767++] = class678.field9557;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field6770[field6767++] = class325.field4807 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field6770[field6767++] = class145.field2251.field8121;
                    return;
                }
                if (arg0 == 3327) {
                    field6770[field6767++] = class145.field2251.field8138 != null && class145.field2251.field8138.field6244 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field6770[field6767++] = class330.field4867 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field6770[--field6767];
                    field6770[field6767++] = class219.method1563(false, var143, 101);
                    return;
                }
                if (arg0 == 3331) {
                    field6767 -= 2;
                    int var144 = field6770[field6767];
                    int var145 = field6770[field6767 + 1];
                    field6770[field6767++] = class511.method3069(var145, false, 19, var144, false);
                    return;
                }
                if (arg0 == 3332) {
                    field6767 -= 2;
                    int var146 = field6770[field6767];
                    int var147 = field6770[field6767 + 1];
                    field6770[field6767++] = class511.method3069(var147, false, 19, var146, true);
                    return;
                }
                if (arg0 == 3333) {
                    field6770[field6767++] = class355.field5377;
                    return;
                }
                if (arg0 == 3335) {
                    field6770[field6767++] = class467.field6804;
                    return;
                }
                if (arg0 == 3336) {
                    field6767 -= 4;
                    int var148 = field6770[field6767];
                    int var149 = field6770[field6767 + 1];
                    int var150 = field6770[field6767 + 2];
                    int var151 = field6770[field6767 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field6770[field6767++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field6770[field6767++] = class459.field6658;
                    return;
                }
                if (arg0 == 3338) {
                    field6770[field6767++] = class673.method3757(100);
                    return;
                }
                if (arg0 == 3339) {
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field6770[field6767++] = class261.field4065 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field6770[field6767++] = class168.field2918 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field6770[field6767++] = class651.field9244.method2915(-8463);
                    return;
                }
                if (arg0 == 3343) {
                    field6770[field6767++] = class651.field9244.method2921((byte) -125);
                    return;
                }
                if (arg0 == 3344) {
                    field6765[field6766++] = class166.method1250(95);
                    return;
                }
                if (arg0 == 3345) {
                    field6765[field6766++] = class265.method1770(1);
                    return;
                }
                if (arg0 == 3346) {
                    field6770[field6767++] = class612.method3495(16507);
                    return;
                }
                if (arg0 == 3347) {
                    field6770[field6767++] = class696.field9871;
                    return;
                }
                if (arg0 == 3349) {
                    field6770[field6767++] = class145.field2251.field1636.method3102(-8255) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field6767 -= 2;
                    int var155 = field6770[field6767];
                    int var156 = field6770[field6767 + 1];
                    class150 var157 = class316.field4738.method1804(2, var155);
                    field6765[field6766++] = var157.method1141(var156, 29683);
                    return;
                }
                if (arg0 == 3408) {
                    field6767 -= 4;
                    int var158 = field6770[field6767];
                    int var159 = field6770[field6767 + 1];
                    int var160 = field6770[field6767 + 2];
                    int var161 = field6770[field6767 + 3];
                    class150 var162 = class316.field4738.method1804(2, var160);
                    if (var162.field2341 == var158 && var162.field2342 == var159) {
                        if (var159 == 115) {
                            field6765[field6766++] = var162.method1141(var161, 29683);
                            return;
                        }
                        field6770[field6767++] = var162.method1142((byte) -115, var161);
                        return;
                    }
                    throw new RuntimeException("C3408-1 " + var160 + "-" + var161);
                }
                if (arg0 == 3409) {
                    field6767 -= 3;
                    int var163 = field6770[field6767];
                    int var164 = field6770[field6767 + 1];
                    int var165 = field6770[field6767 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class150 var166 = class316.field4738.method1804(2, var164);
                    if (var166.field2342 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field6770[field6767++] = var166.method1139(var165, true) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field6770[--field6767];
                    String var168 = field6765[--field6766];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class150 var169 = class316.field4738.method1804(2, var167);
                    if (var169.field2342 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field6770[field6767++] = var169.method1138((byte) -92, var168) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field6770[--field6767];
                    class150 var171 = class316.field4738.method1804(2, var170);
                    field6770[field6767++] = var171.field2348.method3511(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class755.field10522 == 0) {
                        field6770[field6767++] = -2;
                        return;
                    }
                    if (class755.field10522 == 1) {
                        field6770[field6767++] = -1;
                        return;
                    }
                    field6770[field6767++] = class468.field6818;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field6770[--field6767];
                    if (class755.field10522 == 2 && var172 < class468.field6818) {
                        field6765[field6766++] = class562.field7961[var172];
                        if (class624.field8745[var172] != null) {
                            field6765[field6766++] = class624.field8745[var172];
                            return;
                        }
                        field6765[field6766++] = "";
                        return;
                    }
                    field6765[field6766++] = "";
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field6770[--field6767];
                    if (class755.field10522 == 2 && var173 < class468.field6818) {
                        field6770[field6767++] = class412.field6077[var173];
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field6770[--field6767];
                    if (class755.field10522 == 2 && var174 < class468.field6818) {
                        field6770[field6767++] = class152.field2375[var174];
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field6765[--field6766];
                    int var176 = field6770[--field6767];
                    class202.method1499((byte) 122, var175, var176);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field6765[--field6766];
                    class660.method3715(73, var177);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field6765[--field6766];
                    class391.method2441(1, var178);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field6765[--field6766];
                    class100.method820(false, 56, var179);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field6765[--field6766];
                    class247.method1703(var180, -1);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field6765[--field6766];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field6770[field6767++] = class113.method912(34166, var181) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field6770[--field6767];
                    if (class755.field10522 == 2 && var182 < class468.field6818) {
                        field6765[field6766++] = class492.field7133[var182];
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class206.field3454 != null) {
                        field6765[field6766++] = class613.method3503((byte) 61, class206.field3454);
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class206.field3454 != null) {
                        field6770[field6767++] = class380.field5708;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field6770[--field6767];
                    if (class206.field3454 != null && var183 < class380.field5708) {
                        field6765[field6766++] = class594.field8345[var183].field9437;
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field6770[--field6767];
                    if (class206.field3454 != null && var184 < class380.field5708) {
                        field6770[field6767++] = class594.field8345[var184].field9439;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field6770[--field6767];
                    if (class206.field3454 != null && var185 < class380.field5708) {
                        field6770[field6767++] = class594.field8345[var185].field9434;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field6770[field6767++] = class195.field3353;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field6765[--field6766];
                    class589.method3387(var186, -90);
                    return;
                }
                if (arg0 == 3618) {
                    field6770[field6767++] = class252.field4005;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field6765[--field6766];
                    class593.method3397(-15583, var187);
                    return;
                }
                if (arg0 == 3620) {
                    class745.method4164(101);
                    return;
                }
                if (arg0 == 3621) {
                    if (class755.field10522 == 0) {
                        field6770[field6767++] = -1;
                        return;
                    }
                    field6770[field6767++] = class270.field4155;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field6770[--field6767];
                    if (class755.field10522 != 0 && var188 < class270.field4155) {
                        field6765[field6766++] = class379.field5697[var188];
                        if (class603.field8536[var188] != null) {
                            field6765[field6766++] = class603.field8536[var188];
                            return;
                        }
                        field6765[field6766++] = "";
                        return;
                    }
                    field6765[field6766++] = "";
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field6765[--field6766];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field6770[field6767++] = class372.method2368(-123, var189) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field6770[--field6767];
                    if (class594.field8345 != null && var190 < class380.field5708 && class594.field8345[var190].field9438.equalsIgnoreCase(class145.field2251.field8146)) {
                        field6770[field6767++] = 1;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class435.field6353 != null) {
                        field6765[field6766++] = class435.field6353;
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field6770[--field6767];
                    if (class206.field3454 != null && var191 < class380.field5708) {
                        field6765[field6766++] = class594.field8345[var191].field9435;
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field6770[--field6767];
                    if (class755.field10522 == 2 && var192 >= 0 && var192 < class468.field6818) {
                        field6770[field6767++] = class271.field4168[var192] ? 1 : 0;
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field6765[--field6766];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field6770[field6767++] = class607.method3480(var193, 0);
                    return;
                }
                if (arg0 == 3629) {
                    field6770[field6767++] = class628.field8814;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field6765[--field6766];
                    class100.method820(true, 22, var194);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field6770[--field6767];
                    field6770[field6767++] = class92.field1371[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field6770[--field6767];
                    if (class206.field3454 != null && var196 < class380.field5708) {
                        field6765[field6766++] = class594.field8345[var196].field9438;
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field6770[--field6767];
                    if (class755.field10522 != 0 && var197 < class270.field4155) {
                        field6765[field6766++] = class387.field5800[var197];
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field6770[--field6767];
                    field6770[field6767++] = class550.field7839[var198].method796(1);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field6770[--field6767];
                    field6770[field6767++] = class550.field7839[var199].field1430;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field6770[--field6767];
                    field6770[field6767++] = class550.field7839[var200].field1433;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field6770[--field6767];
                    field6770[field6767++] = class550.field7839[var201].field1428;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field6770[--field6767];
                    field6770[field6767++] = class550.field7839[var202].field1434;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field6770[--field6767];
                    field6770[field6767++] = class550.field7839[var203].field1425;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field6770[--field6767];
                    int var205 = class550.field7839[var204].method794((byte) -82);
                    field6770[field6767++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field6770[--field6767];
                    int var207 = class550.field7839[var206].method794((byte) -88);
                    field6770[field6767++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field6770[--field6767];
                    int var209 = class550.field7839[var208].method794((byte) -97);
                    field6770[field6767++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field6770[--field6767];
                    int var211 = class550.field7839[var210].method794((byte) -116);
                    field6770[field6767++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field6767 -= 2;
                    int var212 = field6770[field6767];
                    int var213 = field6770[field6767 + 1];
                    field6770[field6767++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field6767 -= 2;
                    int var214 = field6770[field6767];
                    int var215 = field6770[field6767 + 1];
                    field6770[field6767++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field6767 -= 2;
                    int var216 = field6770[field6767];
                    int var217 = field6770[field6767 + 1];
                    field6770[field6767++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field6767 -= 2;
                    int var218 = field6770[field6767];
                    int var219 = field6770[field6767 + 1];
                    field6770[field6767++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field6770[--field6767];
                    field6770[field6767++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field6770[--field6767];
                    field6770[field6767++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field6767 -= 5;
                    int var222 = field6770[field6767];
                    int var223 = field6770[field6767 + 1];
                    int var224 = field6770[field6767 + 2];
                    int var225 = field6770[field6767 + 3];
                    int var226 = field6770[field6767 + 4];
                    field6770[field6767++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field6767 -= 2;
                    long var227 = (long) field6770[field6767];
                    long var229 = (long) field6770[field6767 + 1];
                    field6770[field6767++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field6767 -= 2;
                    int var231 = field6770[field6767];
                    int var232 = field6770[field6767 + 1];
                    field6770[field6767++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field6767 -= 2;
                    int var233 = field6770[field6767];
                    int var234 = field6770[field6767 + 1];
                    field6770[field6767++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field6767 -= 2;
                    int var235 = field6770[field6767];
                    int var236 = field6770[field6767 + 1];
                    field6770[field6767++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field6767 -= 2;
                    int var237 = field6770[field6767];
                    int var238 = field6770[field6767 + 1];
                    field6770[field6767++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field6767 -= 2;
                    int var239 = field6770[field6767];
                    int var240 = field6770[field6767 + 1];
                    if (var239 == 0) {
                        field6770[field6767++] = 0;
                        return;
                    }
                    field6770[field6767++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field6767 -= 2;
                    int var241 = field6770[field6767];
                    int var242 = field6770[field6767 + 1];
                    if (var241 == 0) {
                        field6770[field6767++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field6770[field6767++] = Integer.MAX_VALUE;
                        return;
                    }
                    field6770[field6767++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field6767 -= 2;
                    int var243 = field6770[field6767];
                    int var244 = field6770[field6767 + 1];
                    field6770[field6767++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field6767 -= 2;
                    int var245 = field6770[field6767];
                    int var246 = field6770[field6767 + 1];
                    field6770[field6767++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field6767 -= 2;
                    int var247 = field6770[field6767];
                    int var248 = field6770[field6767 + 1];
                    field6770[field6767++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field6767 -= 2;
                    int var249 = field6770[field6767];
                    int var250 = field6770[field6767 + 1];
                    field6770[field6767++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field6767 -= 3;
                    long var251 = (long) field6770[field6767];
                    long var253 = (long) field6770[field6767 + 1];
                    long var255 = (long) field6770[field6767 + 2];
                    field6770[field6767++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field6767 -= 2;
                    int var257 = field6770[field6767];
                    int var258 = field6770[field6767 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field6770[field6767++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field6770[field6767++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field6765[--field6766];
                    int var262 = field6770[--field6767];
                    field6765[field6766++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field6766 -= 2;
                    String var263 = field6765[field6766];
                    String var264 = field6765[field6766 + 1];
                    field6765[field6766++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field6765[--field6766];
                    int var266 = field6770[--field6767];
                    field6765[field6766++] = var265 + class169.method1353(101, var266, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field6765[--field6766];
                    field6765[field6766++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field6765[field6766++] = method2848(field6770[--field6767]);
                    return;
                }
                if (arg0 == 4105) {
                    field6766 -= 2;
                    String var268 = field6765[field6766];
                    String var269 = field6765[field6766 + 1];
                    if (class145.field2251.field8138 != null && class145.field2251.field8138.field6244) {
                        field6765[field6766++] = var269;
                        return;
                    }
                    field6765[field6766++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field6770[--field6767];
                    field6765[field6766++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field6766 -= 2;
                    field6770[field6767++] = class153.method1158(class467.field6804, field6765[field6766], field6765[field6766 + 1], 106);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field6765[--field6766];
                    field6767 -= 2;
                    int var272 = field6770[field6767];
                    int var273 = field6770[field6767 + 1];
                    class54 var274 = class552.method3220(var273, (byte) -4, 0, class312.field4704);
                    field6770[field6767++] = var274.method516(var272, var271, (byte) -114, class438.field6393);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field6765[--field6766];
                    field6767 -= 2;
                    int var276 = field6770[field6767];
                    int var277 = field6770[field6767 + 1];
                    class54 var278 = class552.method3220(var277, (byte) -41, 0, class312.field4704);
                    field6770[field6767++] = var278.method506(0, var275, var276, class438.field6393);
                    return;
                }
                if (arg0 == 4110) {
                    field6766 -= 2;
                    String var279 = field6765[field6766];
                    String var280 = field6765[field6766 + 1];
                    if (field6770[--field6767] == 1) {
                        field6765[field6766++] = var279;
                        return;
                    }
                    field6765[field6766++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field6765[--field6766];
                    field6765[field6766++] = class86.method757(var281, -104);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field6765[--field6766];
                    int var283 = field6770[--field6767];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field6765[field6766++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field6770[--field6767];
                    field6770[field6767++] = method2843((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field6770[--field6767];
                    field6770[field6767++] = class223.method1578(-30852, (char) var285) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field6770[--field6767];
                    field6770[field6767++] = class341.method2184((char) var286, (byte) 94) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field6770[--field6767];
                    field6770[field6767++] = class756.method4210((char) var287, -91) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field6765[--field6766];
                    if (var288 != null) {
                        field6770[field6767++] = var288.length();
                        return;
                    }
                    field6770[field6767++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field6765[--field6766];
                    field6767 -= 2;
                    int var290 = field6770[field6767];
                    int var291 = field6770[field6767 + 1];
                    field6765[field6766++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field6765[--field6766];
                    StringBuffer var293 = new StringBuffer(var292.length());
                    boolean var294 = false;
                    for (int var295 = 0; var295 < var292.length(); var295++) {
                        char var296 = var292.charAt(var295);
                        if (var296 == '<') {
                            var294 = true;
                        } else if (var296 == '>') {
                            var294 = false;
                        } else if (!var294) {
                            var293.append(var296);
                        }
                    }
                    field6765[field6766++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field6765[--field6766];
                    field6767 -= 2;
                    int var298 = field6770[field6767];
                    int var299 = field6770[field6767 + 1];
                    field6770[field6767++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field6766 -= 2;
                    String var300 = field6765[field6766];
                    String var301 = field6765[field6766 + 1];
                    int var302 = field6770[--field6767];
                    field6770[field6767++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field6770[--field6767];
                    field6770[field6767++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field6770[--field6767];
                    field6770[field6767++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field6770[--field6767] != 0;
                    int var306 = field6770[--field6767];
                    field6765[field6766++] = class235.method1622(0, class467.field6804, -18764, var305, (long) var306);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field6765[--field6766];
                    int var308 = field6770[--field6767];
                    class54 var309 = class552.method3220(var308, (byte) 108, 0, class312.field4704);
                    field6770[field6767++] = var309.method508(class438.field6393, var307, 173);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field6770[--field6767];
                    field6765[field6766++] = class556.field7917.method741(-31, var310).field9714;
                    return;
                }
                if (arg0 == 4201) {
                    field6767 -= 2;
                    int var311 = field6770[field6767];
                    int var312 = field6770[field6767 + 1];
                    class688 var313 = class556.field7917.method741(113, var311);
                    if (var312 >= 1 && var312 <= 5 && var313.field9730[var312 - 1] != null) {
                        field6765[field6766++] = var313.field9730[var312 - 1];
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field6767 -= 2;
                    int var314 = field6770[field6767];
                    int var315 = field6770[field6767 + 1];
                    class688 var316 = class556.field7917.method741(-58, var314);
                    if (var315 >= 1 && var315 <= 5 && var316.field9771[var315 - 1] != null) {
                        field6765[field6766++] = var316.field9771[var315 - 1];
                        return;
                    }
                    field6765[field6766++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field6770[--field6767];
                    field6770[field6767++] = class556.field7917.method741(122, var317).field9751;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field6770[--field6767];
                    field6770[field6767++] = class556.field7917.method741(121, var318).field9761 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field6770[--field6767];
                    class688 var320 = class556.field7917.method741(119, var319);
                    if (var320.field9750 == -1 && var320.field9779 >= 0) {
                        field6770[field6767++] = var320.field9779;
                        return;
                    }
                    field6770[field6767++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field6770[--field6767];
                    class688 var322 = class556.field7917.method741(116, var321);
                    if (var322.field9750 >= 0 && var322.field9779 >= 0) {
                        field6770[field6767++] = var322.field9779;
                        return;
                    }
                    field6770[field6767++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field6770[--field6767];
                    field6770[field6767++] = class556.field7917.method741(-74, var323).field9753 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field6767 -= 2;
                    int var324 = field6770[field6767];
                    int var325 = field6770[field6767 + 1];
                    class193 var326 = class382.field5728.method1997((byte) 120, var325);
                    if (var326.method1463(-6764)) {
                        field6765[field6766++] = class556.field7917.method741(-104, var324).method3832(var325, var326.field3338, 23604);
                        return;
                    }
                    field6770[field6767++] = class556.field7917.method741(116, var324).method3837(var325, var326.field3339, (byte) -116);
                    return;
                }
                if (arg0 == 4209) {
                    field6767 -= 2;
                    int var327 = field6770[field6767];
                    int var328 = field6770[field6767 + 1] - 1;
                    class688 var329 = class556.field7917.method741(-28, var327);
                    if (var329.field9718 == var328) {
                        field6770[field6767++] = var329.field9754;
                        return;
                    }
                    if (var329.field9706 == var328) {
                        field6770[field6767++] = var329.field9717;
                        return;
                    }
                    field6770[field6767++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field6765[--field6766];
                    int var331 = field6770[--field6767];
                    class453.method2776(var331 == 1, (byte) 21, var330);
                    field6770[field6767++] = class15.field155;
                    return;
                }
                if (arg0 == 4211) {
                    if (class112.field1732 != null && class210.field3501 < class15.field155) {
                        field6770[field6767++] = class112.field1732[class210.field3501++] & 0xFFFF;
                        return;
                    }
                    field6770[field6767++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class210.field3501 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field6770[--field6767];
                    field6770[field6767++] = class556.field7917.method741(123, var332).field9712;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field6765[--field6766];
                    field6767 -= 3;
                    int var334 = field6770[field6767];
                    int var335 = field6770[field6767 + 1];
                    int var336 = field6770[field6767 + 2];
                    class140.method1100(-4689, var333, var336, var335, var334 == 1);
                    field6770[field6767++] = class15.field155;
                    return;
                }
                if (arg0 == 4215) {
                    field6766 -= 2;
                    field6767 -= 2;
                    String var337 = field6765[field6766];
                    int var338 = field6770[field6767];
                    int var339 = field6770[field6767 + 1];
                    String var340 = field6765[field6766 + 1];
                    class51.method495(var340, var339, true, var338 == 1, var337);
                    field6770[field6767++] = class15.field155;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field6767 -= 2;
                    int var341 = field6770[field6767];
                    int var342 = field6770[field6767 + 1];
                    class193 var343 = class382.field5728.method1997((byte) 121, var342);
                    if (var343.method1463(-6764)) {
                        field6765[field6766++] = class740.field10382.method3434((byte) -115, var341).method3044(var343.field3338, var342, 123);
                        return;
                    }
                    field6770[field6767++] = class740.field10382.method3434((byte) -115, var341).method3040(12, var342, var343.field3339);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field6767 -= 2;
                    int var344 = field6770[field6767];
                    int var345 = field6770[field6767 + 1];
                    class193 var346 = class382.field5728.method1997((byte) 110, var345);
                    if (var346.method1463(-6764)) {
                        field6765[field6766++] = class576.field8167.method3074(0, var344).method3404(-30913, var346.field3338, var345);
                        return;
                    }
                    field6770[field6767++] = class576.field8167.method3074(0, var344).method3409(var345, -99, var346.field3339);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field6767 -= 2;
                    int var347 = field6770[field6767];
                    int var348 = field6770[field6767 + 1];
                    class193 var349 = class382.field5728.method1997((byte) 117, var348);
                    if (var349.method1463(-6764)) {
                        field6765[field6766++] = class184.field3100.method143(var347, (byte) -94).method1910(var348, 1, var349.field3338);
                        return;
                    }
                    field6770[field6767++] = class184.field3100.method143(var347, (byte) -94).method1913(var349.field3339, (byte) 114, var348);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field6770[--field6767];
                class228 var351 = class581.field8222.method1548(-107, var350);
                if (var351.field3664 != null && var351.field3664.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field3688[0];
                    for (int var354 = 1; var354 < var351.field3664.length; var354++) {
                        if (var351.field3688[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field3688[var354];
                        }
                    }
                    field6770[field6767++] = var351.field3664[var352];
                    return;
                }
                field6770[field6767++] = var351.field3685;
                return;
            }
        } else {
            class353 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class65.method638(field6770[--field6767], 1668949296);
            } else {
                var51 = arg1 ? field6758 : field6754;
            }
            if (arg0 == 1300) {
                int var52 = field6770[--field6767] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method2268(var52, 124, field6765[--field6766]);
                    return;
                }
                field6766--;
                return;
            }
            if (arg0 == 1301) {
                field6767 -= 2;
                int var53 = field6770[field6767];
                int var54 = field6770[field6767 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field5326 = null;
                    return;
                }
                var51.field5326 = class745.method4165(-114, var53, var54);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field6770[--field6767];
                if (class18.field192 != var55 && class312.field4702 != var55 && class521.field7527 != var55) {
                    return;
                }
                var51.field5272 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field5348 = field6770[--field6767];
                return;
            }
            if (arg0 == 1304) {
                var51.field5309 = field6770[--field6767];
                return;
            }
            if (arg0 == 1305) {
                var51.field5336 = field6765[--field6766];
                return;
            }
            if (arg0 == 1306) {
                var51.field5334 = field6765[--field6766];
                return;
            }
            if (arg0 == 1307) {
                var51.field5353 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field5338 = field6770[--field6767];
                var51.field5360 = field6770[--field6767];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field6770[--field6767];
                int var57 = field6770[--field6767];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method2247(var56, 120, var57 - 1);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field5224 = field6765[--field6766];
                return;
            }
            if (arg0 == 1311) {
                var51.field5288 = field6770[--field6767];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field6767 -= 3;
                    var58 = field6770[field6767] - 1;
                    var59 = field6770[field6767 + 1];
                    var60 = field6770[field6767 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field6767 -= 2;
                    var58 = 10;
                    var59 = field6770[field6767];
                    var60 = field6770[field6767 + 1];
                }
                if (var51.field5264 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field5264 = new byte[11];
                    var51.field5237 = new byte[11];
                    var51.field5277 = new int[11];
                }
                var51.field5264[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field5347 = false;
                    for (int var61 = 0; var61 < var51.field5264.length; var61++) {
                        if (var51.field5264[var61] != 0) {
                            var51.field5347 = true;
                            break;
                        }
                    }
                } else {
                    var51.field5347 = true;
                }
                var51.field5237[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field5307 = field6770[--field6767];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3828)
    private static final void method2840(String arg0, int arg1) {
        if (class81.field1173 == 0 && !(!class311.field4698 || class355.field5385) || class330.field4867) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class641.field9040.method3621(102, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class641.field9040.method3621(117, 0).length());
        } else if (var2.startsWith(class641.field9041.method3621(110, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class641.field9041.method3621(111, 0).length());
        } else if (var2.startsWith(class641.field9042.method3621(106, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class641.field9042.method3621(121, 0).length());
        } else if (var2.startsWith(class641.field9043.method3621(98, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class641.field9043.method3621(98, 0).length());
        } else if (var2.startsWith(class641.field9044.method3621(107, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class641.field9044.method3621(102, 0).length());
        } else if (var2.startsWith(class641.field9045.method3621(120, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class641.field9045.method3621(122, 0).length());
        } else if (var2.startsWith(class641.field9046.method3621(103, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class641.field9046.method3621(113, 0).length());
        } else if (var2.startsWith(class641.field9047.method3621(117, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class641.field9047.method3621(119, 0).length());
        } else if (var2.startsWith(class641.field9048.method3621(115, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class641.field9048.method3621(98, 0).length());
        } else if (var2.startsWith(class641.field9049.method3621(118, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class641.field9049.method3621(126, 0).length());
        } else if (var2.startsWith(class641.field9050.method3621(100, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class641.field9050.method3621(116, 0).length());
        } else if (var2.startsWith(class641.field9051.method3621(92, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class641.field9051.method3621(93, 0).length());
        } else if (class467.field6804 != 0) {
            if (var2.startsWith(class641.field9040.method3621(93, class467.field6804))) {
                var3 = 0;
                arg0 = arg0.substring(class641.field9040.method3621(93, class467.field6804).length());
            } else if (var2.startsWith(class641.field9041.method3621(125, class467.field6804))) {
                var3 = 1;
                arg0 = arg0.substring(class641.field9041.method3621(124, class467.field6804).length());
            } else if (var2.startsWith(class641.field9042.method3621(94, class467.field6804))) {
                var3 = 2;
                arg0 = arg0.substring(class641.field9042.method3621(113, class467.field6804).length());
            } else if (var2.startsWith(class641.field9043.method3621(102, class467.field6804))) {
                var3 = 3;
                arg0 = arg0.substring(class641.field9043.method3621(104, class467.field6804).length());
            } else if (var2.startsWith(class641.field9044.method3621(106, class467.field6804))) {
                var3 = 4;
                arg0 = arg0.substring(class641.field9044.method3621(127, class467.field6804).length());
            } else if (var2.startsWith(class641.field9045.method3621(117, class467.field6804))) {
                var3 = 5;
                arg0 = arg0.substring(class641.field9045.method3621(125, class467.field6804).length());
            } else if (var2.startsWith(class641.field9046.method3621(116, class467.field6804))) {
                var3 = 6;
                arg0 = arg0.substring(class641.field9046.method3621(112, class467.field6804).length());
            } else if (var2.startsWith(class641.field9047.method3621(115, class467.field6804))) {
                var3 = 7;
                arg0 = arg0.substring(class641.field9047.method3621(120, class467.field6804).length());
            } else if (var2.startsWith(class641.field9048.method3621(107, class467.field6804))) {
                var3 = 8;
                arg0 = arg0.substring(class641.field9048.method3621(104, class467.field6804).length());
            } else if (var2.startsWith(class641.field9049.method3621(106, class467.field6804))) {
                var3 = 9;
                arg0 = arg0.substring(class641.field9049.method3621(104, class467.field6804).length());
            } else if (var2.startsWith(class641.field9050.method3621(115, class467.field6804))) {
                var3 = 10;
                arg0 = arg0.substring(class641.field9050.method3621(118, class467.field6804).length());
            } else if (var2.startsWith(class641.field9051.method3621(110, class467.field6804))) {
                var3 = 11;
                arg0 = arg0.substring(class641.field9051.method3621(111, class467.field6804).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class641.field9052.method3621(119, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class641.field9052.method3621(95, 0).length());
        } else if (var4.startsWith(class641.field9053.method3621(93, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class641.field9053.method3621(112, 0).length());
        } else if (var4.startsWith(class641.field9054.method3621(116, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class641.field9054.method3621(122, 0).length());
        } else if (var4.startsWith(class641.field9055.method3621(102, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class641.field9055.method3621(115, 0).length());
        } else if (var4.startsWith(class641.field9056.method3621(101, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class641.field9056.method3621(107, 0).length());
        } else if (class467.field6804 != 0) {
            if (var4.startsWith(class641.field9052.method3621(99, class467.field6804))) {
                var5 = 1;
                arg0 = arg0.substring(class641.field9052.method3621(113, class467.field6804).length());
            } else if (var4.startsWith(class641.field9053.method3621(112, class467.field6804))) {
                var5 = 2;
                arg0 = arg0.substring(class641.field9053.method3621(112, class467.field6804).length());
            } else if (var4.startsWith(class641.field9054.method3621(126, class467.field6804))) {
                var5 = 3;
                arg0 = arg0.substring(class641.field9054.method3621(94, class467.field6804).length());
            } else if (var4.startsWith(class641.field9055.method3621(119, class467.field6804))) {
                var5 = 4;
                arg0 = arg0.substring(class641.field9055.method3621(104, class467.field6804).length());
            } else if (var4.startsWith(class641.field9056.method3621(113, class467.field6804))) {
                var5 = 5;
                arg0 = arg0.substring(class641.field9056.method3621(94, class467.field6804).length());
            }
        }
        field6763++;
        class540 var6 = class257.method1732(true, class89.field1362, class655.field9332);
        var6.field7707.method1926(0, 65280);
        int var7 = var6.field7707.field4534;
        var6.field7707.method1926(var3, 65280);
        var6.field7707.method1926(var5, 65280);
        class668.method3741(-24804, arg0, var6.field7707);
        var6.field7707.method1986(var6.field7707.field4534 - var7, 1);
        class756.method4211(var6, 115);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(I)V", line = 4097)
    private static final void method2841(int arg0) {
        class353 var1 = class65.method638(arg0, 1668949296);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class353[] var3 = class114.field1763[var2];
        if (var3 == null) {
            class353[] var4 = class158.field2453[var2];
            int var5 = var4.length;
            var3 = class114.field1763[var2] = new class353[var5];
            class571.method3310(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class571.method3310(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "()V", line = 4141)
    public static void method2842() {
        field6769 = null;
        field6760 = null;
        field6756 = null;
        field6768 = null;
        field6770 = null;
        field6765 = null;
        field6774 = null;
        field6754 = null;
        field6758 = null;
        field6751 = null;
        field6761 = null;
        field6776 = null;
        field6777 = null;
        field6775 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(C)I", line = 4159)
    private static final int method2843(char arg0) {
        return class274.method1801((byte) 31, arg0) ? 1 : 0;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IZ)V", line = 4166)
    public static final void method2844(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(IZ)V", line = 4172)
    private static final void method2845(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field6770[field6767++] = class732.field10290;
                return;
            }
            if (arg0 == 5001) {
                field6767 -= 3;
                class732.field10290 = field6770[field6767];
                class145.field2252 = class680.method3790(-12624, field6770[field6767 + 1]);
                if (class145.field2252 == null) {
                    class145.field2252 = class426.field6256;
                }
                class358.field5454 = field6770[field6767 + 2];
                field6752++;
                class540 var2 = class257.method1732(true, class584.field8247, class655.field9332);
                var2.field7707.method1926(class732.field10290, 65280);
                var2.field7707.method1926(class145.field2252.field2303, 65280);
                var2.field7707.method1926(class358.field5454, 65280);
                class756.method4211(var2, 112);
                return;
            }
            if (arg0 == 5002) {
                field6766 -= 2;
                String var3 = field6765[field6766];
                String var4 = field6765[field6766 + 1];
                field6767 -= 2;
                int var5 = field6770[field6767];
                int var6 = field6770[field6767 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field6764++;
                class540 var7 = class257.method1732(true, class698.field9882, class655.field9332);
                var7.field7707.method1926(class16.method101(-106, var3) + class16.method101(-110, var4) + 2, 65280);
                var7.field7707.method1931(122, var3);
                var7.field7707.method1926(var5 - 1, 65280);
                var7.field7707.method1926(var6, 65280);
                var7.field7707.method1931(115, var4);
                class756.method4211(var7, 111);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field6770[--field6767];
                class134 var9 = class741.method4148(false, var8);
                String var10 = "";
                if (var9 != null && var9.field2147 != null) {
                    var10 = var9.field2147;
                }
                field6765[field6766++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field6770[--field6767];
                class134 var12 = class741.method4148(false, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field2151;
                }
                field6770[field6767++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class145.field2252 == null) {
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = class145.field2252.field2303;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field6770[--field6767];
                class540 var15 = class257.method1732(true, class401.field5961, class655.field9332);
                var15.field7707.method1926(var14, 65280);
                class756.method4211(var15, 118);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field6765[--field6766];
                method2840(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field6766 -= 2;
                String var17 = field6765[field6766];
                String var18 = field6765[field6766 + 1];
                if (class81.field1173 != 0 || (!class311.field4698 || class355.field5385) && !class330.field4867) {
                    field6772++;
                    class540 var19 = class257.method1732(true, class270.field4152, class655.field9332);
                    var19.field7707.method1926(0, 65280);
                    int var20 = var19.field7707.field4534;
                    var19.field7707.method1931(119, var17);
                    class668.method3741(-24804, var18, var19.field7707);
                    var19.field7707.method1986(var19.field7707.field4534 - var20, 1);
                    class756.method4211(var19, 127);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field6770[--field6767];
                class134 var22 = class741.method4148(false, var21);
                String var23 = "";
                if (var22 != null && var22.field2150 != null) {
                    var23 = var22.field2150;
                }
                field6765[field6766++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field6770[--field6767];
                class134 var25 = class741.method4148(false, var24);
                String var26 = "";
                if (var25 != null && var25.field2152 != null) {
                    var26 = var25.field2152;
                }
                field6765[field6766++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field6770[--field6767];
                class134 var28 = class741.method4148(false, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field2153;
                }
                field6770[field6767++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class145.field2251 == null || class145.field2251.field8137 == null) {
                    var30 = "";
                } else {
                    var30 = class145.field2251.method3326(true, true);
                }
                field6765[field6766++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field6770[field6767++] = class358.field5454;
                return;
            }
            if (arg0 == 5017) {
                field6770[field6767++] = class753.method4200(false);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field6770[--field6767];
                class134 var32 = class741.method4148(false, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field2146;
                }
                field6770[field6767++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field6770[--field6767];
                class134 var35 = class741.method4148(false, var34);
                String var36 = "";
                if (var35 != null && var35.field2144 != null) {
                    var36 = var35.field2144;
                }
                field6765[field6766++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class145.field2251 == null || class145.field2251.field8137 == null) {
                    var37 = "";
                } else {
                    var37 = class145.field2251.method3329(false, (byte) 109);
                }
                field6765[field6766++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field6770[--field6767];
                class134 var39 = class741.method4148(false, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field2154;
                }
                field6770[field6767++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field6770[--field6767];
                class134 var42 = class741.method4148(false, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field2149;
                }
                field6770[field6767++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field6770[--field6767];
                class134 var45 = class741.method4148(false, var44);
                String var46 = "";
                if (var45 != null && var45.field2145 != null) {
                    var46 = var45.field2145;
                }
                field6765[field6766++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field6770[--field6767];
                field6765[field6766++] = class543.field7748.method2605(-123, var47).field10462;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field6770[--field6767];
                class751 var49 = class543.field7748.method2605(-119, var48);
                if (var49.field10469 == null) {
                    field6770[field6767++] = 0;
                    return;
                }
                field6770[field6767++] = var49.field10469.length;
                return;
            }
            if (arg0 == 5052) {
                field6767 -= 2;
                int var50 = field6770[field6767];
                int var51 = field6770[field6767 + 1];
                class751 var52 = class543.field7748.method2605(-116, var50);
                int var53 = var52.field10469[var51];
                field6770[field6767++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field6770[--field6767];
                class751 var55 = class543.field7748.method2605(-126, var54);
                if (var55.field10459 == null) {
                    field6770[field6767++] = 0;
                    return;
                }
                field6770[field6767++] = var55.field10459.length;
                return;
            }
            if (arg0 == 5054) {
                field6767 -= 2;
                int var56 = field6770[field6767];
                int var57 = field6770[field6767 + 1];
                field6770[field6767++] = class543.field7748.method2605(-120, var56).field10459[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field6770[--field6767];
                field6765[field6766++] = class536.field7684.method1493(1, var58).method3719(false);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field6770[--field6767];
                class660 var60 = class536.field7684.method1493(1, var59);
                if (var60.field9397 == null) {
                    field6770[field6767++] = 0;
                    return;
                }
                field6770[field6767++] = var60.field9397.length;
                return;
            }
            if (arg0 == 5057) {
                field6767 -= 2;
                int var61 = field6770[field6767];
                int var62 = field6770[field6767 + 1];
                field6770[field6767++] = class536.field7684.method1493(1, var61).field9397[var62];
                return;
            }
            if (arg0 == 5058) {
                field6751 = new class662();
                field6751.field9421 = field6770[--field6767];
                field6751.field9420 = class536.field7684.method1493(1, field6751.field9421);
                field6751.field9419 = new int[field6751.field9420.method3710((byte) -127)];
                return;
            }
            if (arg0 == 5059) {
                field6753++;
                class540 var63 = class257.method1732(true, class518.field7489, class655.field9332);
                var63.field7707.method1926(0, 65280);
                int var64 = var63.field7707.field4534;
                var63.field7707.method1926(0, 65280);
                var63.field7707.method1939(field6751.field9421, 1134947720);
                field6751.field9420.method3711(field6751.field9419, (byte) 79, var63.field7707);
                var63.field7707.method1986(var63.field7707.field4534 - var64, 1);
                class756.method4211(var63, 126);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field6765[--field6766];
                field6771++;
                class540 var66 = class257.method1732(true, class114.field1774, class655.field9332);
                var66.field7707.method1926(0, 65280);
                int var67 = var66.field7707.field4534;
                var66.field7707.method1931(122, var65);
                var66.field7707.method1939(field6751.field9421, 1134947720);
                field6751.field9420.method3711(field6751.field9419, (byte) 79, var66.field7707);
                var66.field7707.method1986(var66.field7707.field4534 - var67, 1);
                class756.method4211(var66, 112);
                return;
            }
            if (arg0 == 5061) {
                field6753++;
                class540 var68 = class257.method1732(true, class518.field7489, class655.field9332);
                var68.field7707.method1926(0, 65280);
                int var69 = var68.field7707.field4534;
                var68.field7707.method1926(1, 65280);
                var68.field7707.method1939(field6751.field9421, 1134947720);
                field6751.field9420.method3711(field6751.field9419, (byte) 79, var68.field7707);
                var68.field7707.method1986(var68.field7707.field4534 - var69, 1);
                class756.method4211(var68, 127);
                return;
            }
            if (arg0 == 5062) {
                field6767 -= 2;
                int var70 = field6770[field6767];
                int var71 = field6770[field6767 + 1];
                field6770[field6767++] = class543.field7748.method2605(-117, var70).field10467[var71];
                return;
            }
            if (arg0 == 5063) {
                field6767 -= 2;
                int var72 = field6770[field6767];
                int var73 = field6770[field6767 + 1];
                field6770[field6767++] = class543.field7748.method2605(-120, var72).field10471[var73];
                return;
            }
            if (arg0 == 5064) {
                field6767 -= 2;
                int var74 = field6770[field6767];
                int var75 = field6770[field6767 + 1];
                if (var75 == -1) {
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = class543.field7748.method2605(-122, var74).method4186((byte) -121, (char) var75);
                return;
            }
            if (arg0 == 5065) {
                field6767 -= 2;
                int var76 = field6770[field6767];
                int var77 = field6770[field6767 + 1];
                if (var77 == -1) {
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = class543.field7748.method2605(-117, var76).method4187((char) var77, (byte) -73);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field6770[--field6767];
                field6770[field6767++] = class536.field7684.method1493(1, var78).method3710((byte) -116);
                return;
            }
            if (arg0 == 5067) {
                field6767 -= 2;
                int var79 = field6770[field6767];
                int var80 = field6770[field6767 + 1];
                int var81 = class536.field7684.method1493(1, var79).method3717((byte) 123, var80).field6847;
                field6770[field6767++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field6767 -= 2;
                int var82 = field6770[field6767];
                int var83 = field6770[field6767 + 1];
                field6751.field9419[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field6767 -= 2;
                int var84 = field6770[field6767];
                int var85 = field6770[field6767 + 1];
                field6751.field9419[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field6767 -= 3;
                int var86 = field6770[field6767];
                int var87 = field6770[field6767 + 1];
                int var88 = field6770[field6767 + 2];
                class660 var89 = class536.field7684.method1493(1, var86);
                if (var89.method3717((byte) 126, var87).field6847 != 0) {
                    throw new RuntimeException("bad command");
                }
                field6770[field6767++] = var89.method3713(var88, -1, var87);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field6765[--field6766];
                boolean var91 = field6770[--field6767] == 1;
                class428.method2670(var90, var91, 84);
                field6770[field6767++] = class15.field155;
                return;
            }
            if (arg0 == 5072) {
                if (class112.field1732 != null && class210.field3501 < class15.field155) {
                    field6770[field6767++] = class112.field1732[class210.field3501++] & 0xFFFF;
                    return;
                }
                field6770[field6767++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class210.field3501 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class543.field7749.method455(-14469, 86)) {
                    field6770[field6767++] = 1;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class543.field7749.method455(-14469, 82)) {
                    field6770[field6767++] = 1;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class543.field7749.method455(-14469, 81)) {
                    field6770[field6767++] = 1;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class400.method2470(-201, field6770[--field6767]);
                return;
            }
            if (arg0 == 5201) {
                field6770[field6767++] = class25.method144((byte) -73);
                return;
            }
            if (arg0 == 5205) {
                class290.method1893(false, -1, true, -1, field6770[--field6767]);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field6770[--field6767];
                class553 var93 = class729.method4027(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = var93.field7884;
                return;
            }
            if (arg0 == 5207) {
                class553 var94 = class729.method4031(field6770[--field6767]);
                if (var94 != null && var94.field7877 != null) {
                    field6765[field6766++] = var94.field7877;
                    return;
                }
                field6765[field6766++] = "";
                return;
            }
            if (arg0 == 5208) {
                field6770[field6767++] = class404.field5992;
                field6770[field6767++] = class106.field1551;
                return;
            }
            if (arg0 == 5209) {
                field6770[field6767++] = class729.field10228 + class187.field3121;
                field6770[field6767++] = class729.field10239 + class271.field4161;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field6770[--field6767];
                class553 var96 = class729.method4031(var95);
                if (var96 == null) {
                    field6770[field6767++] = 0;
                    field6770[field6767++] = 0;
                    return;
                }
                field6770[field6767++] = var96.field7872 >> 14 & 0x3FFF;
                field6770[field6767++] = var96.field7872 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field6770[--field6767];
                class553 var98 = class729.method4031(var97);
                if (var98 == null) {
                    field6770[field6767++] = 0;
                    field6770[field6767++] = 0;
                    return;
                }
                field6770[field6767++] = var98.field7878 - var98.field7876;
                field6770[field6767++] = var98.field7889 - var98.field7881;
                return;
            }
            if (arg0 == 5212) {
                class302 var99 = class300.method1923(-1);
                if (var99 == null) {
                    field6770[field6767++] = -1;
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = var99.field4601;
                int var100 = var99.field4599 << 28 | class729.field10228 + var99.field4604 << 14 | class729.field10239 + var99.field4605;
                field6770[field6767++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class302 var101 = class368.method2354((byte) -16);
                if (var101 == null) {
                    field6770[field6767++] = -1;
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = var101.field4601;
                int var102 = var101.field4599 << 28 | class729.field10228 + var101.field4604 << 14 | class729.field10239 + var101.field4605;
                field6770[field6767++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field6770[--field6767];
                class553 var104 = class303.method1995(112);
                if (var104 != null) {
                    boolean var105 = var104.method3223(field6777, (byte) -105, var103 & 0x3FFF, var103 >> 28 & 0x3, var103 >> 14 & 0x3FFF);
                    if (var105) {
                        class497.method3016(field6777[2], field6777[1], 116);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field6767 -= 2;
                int var106 = field6770[field6767];
                int var107 = field6770[field6767 + 1];
                class677 var108 = class729.method4036(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class553 var110 = (class553) var108.method3772(true); var110 != null; var110 = (class553) var108.method3780(23774)) {
                    if (var110.field7884 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field6770[field6767++] = 1;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field6770[--field6767];
                class553 var112 = class729.method4031(var111);
                if (var112 == null) {
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = var112.field7885;
                return;
            }
            if (arg0 == 5220) {
                field6770[field6767++] = class612.field8632 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field6770[--field6767];
                class497.method3016(var113 & 0x3FFF, var113 >> 14 & 0x3FFF, 127);
                return;
            }
            if (arg0 == 5222) {
                class553 var114 = class303.method1995(126);
                if (var114 != null) {
                    boolean var115 = var114.method3222(class729.field10239 + class271.field4161, field6777, false, class729.field10228 + class187.field3121);
                    if (var115) {
                        field6770[field6767++] = field6777[1];
                        field6770[field6767++] = field6777[2];
                        return;
                    }
                    field6770[field6767++] = -1;
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = -1;
                field6770[field6767++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field6767 -= 2;
                int var116 = field6770[field6767];
                int var117 = field6770[field6767 + 1];
                class290.method1893(false, var117 & 0x3FFF, true, var117 >> 14 & 0x3FFF, var116);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field6770[--field6767];
                class553 var119 = class303.method1995(121);
                if (var119 != null) {
                    boolean var120 = var119.method3223(field6777, (byte) -101, var118 & 0x3FFF, var118 >> 28 & 0x3, var118 >> 14 & 0x3FFF);
                    if (var120) {
                        field6770[field6767++] = field6777[1];
                        field6770[field6767++] = field6777[2];
                        return;
                    }
                    field6770[field6767++] = -1;
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = -1;
                field6770[field6767++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field6770[--field6767];
                class553 var122 = class303.method1995(123);
                if (var122 != null) {
                    boolean var123 = var122.method3222(var121 & 0x3FFF, field6777, false, var121 >> 14 & 0x3FFF);
                    if (var123) {
                        field6770[field6767++] = field6777[1];
                        field6770[field6767++] = field6777[2];
                        return;
                    }
                    field6770[field6767++] = -1;
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = -1;
                field6770[field6767++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class75.method681(3, field6770[--field6767]);
                return;
            }
            if (arg0 == 5227) {
                field6767 -= 2;
                int var124 = field6770[field6767];
                int var125 = field6770[field6767 + 1];
                class290.method1893(true, var125 & 0x3FFF, true, var125 >> 14 & 0x3FFF, var124);
                return;
            }
            if (arg0 == 5228) {
                class316.field4739 = field6770[--field6767] == 1;
                return;
            }
            if (arg0 == 5229) {
                field6770[field6767++] = class316.field4739 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field6770[--field6767];
                class227.method1585(true, var126);
                return;
            }
            if (arg0 == 5231) {
                field6767 -= 2;
                int var127 = field6770[field6767];
                boolean var128 = field6770[field6767 + 1] == 1;
                if (class448.field6531 != null) {
                    class65 var129 = class448.field6531.method3512(true, (long) var127);
                    if (var129 != null && !var128) {
                        var129.method636((byte) 97);
                        return;
                    }
                    if (var129 == null && var128) {
                        class65 var130 = new class65();
                        class448.field6531.method3516(255, (long) var127, var130);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field6770[--field6767];
                if (class448.field6531 != null) {
                    class65 var132 = class448.field6531.method3512(true, (long) var131);
                    field6770[field6767++] = var132 == null ? 0 : 1;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field6767 -= 2;
                int var133 = field6770[field6767];
                boolean var134 = field6770[field6767 + 1] == 1;
                if (class325.field4803 != null) {
                    class65 var135 = class325.field4803.method3512(true, (long) var133);
                    if (var135 != null && !var134) {
                        var135.method636((byte) 97);
                        return;
                    }
                    if (var135 == null && var134) {
                        class65 var136 = new class65();
                        class325.field4803.method3516(255, (long) var133, var136);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field6770[--field6767];
                if (class325.field4803 != null) {
                    class65 var138 = class325.field4803.method3512(true, (long) var137);
                    field6770[field6767++] = var138 == null ? 0 : 1;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field6770[field6767++] = class729.field10201 == null ? -1 : class729.field10201.field7884;
                return;
            }
            if (arg0 == 5236) {
                field6767 -= 2;
                int var139 = field6770[field6767];
                int var140 = field6770[field6767 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class340.method2177((byte) -127, var139, var142, var141);
                if (var143 < 0) {
                    field6770[field6767++] = -1;
                    return;
                }
                field6770[field6767++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class497.method3015((byte) -122);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field6767 -= 2;
                int var144 = field6770[field6767];
                int var145 = field6770[field6767 + 1];
                class562.method3253(false, false, 3, var144, var145);
                field6770[field6767++] = class196.field3382 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class196.field3382 != null) {
                    class562.method3253(false, false, class654.field9289.field5421.method2689(3), -1, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class300[] var146 = class235.method1617(600);
                field6770[field6767++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field6770[--field6767];
                class300[] var148 = class235.method1617(600);
                field6770[field6767++] = var148[var147].field4523;
                field6770[field6767++] = var148[var147].field4527;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class120.field1835;
                int var150 = class463.field6738;
                int var151 = -1;
                class300[] var152 = class235.method1617(600);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class300 var154 = var152[var153];
                    if (var154.field4523 == var149 && var154.field4527 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field6770[field6767++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field6770[field6767++] = class347.method2215(-21383);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field6770[--field6767];
                if (var155 >= 1 && var155 <= 2) {
                    class562.method3253(false, false, var155, -1, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field6770[field6767++] = class654.field9289.field5421.method2689(3);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field6770[--field6767];
                if (var156 >= 1 && var156 <= 2) {
                    class654.field9289.method2292(88, var156, class654.field9289.field5421);
                    class654.field9289.method2292(-100, var156, class654.field9289.field5409);
                    class580.method3351((byte) -113);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field6766 -= 2;
                String var157 = field6765[field6766];
                String var158 = field6765[field6766 + 1];
                int var159 = field6770[--field6767];
                field6759++;
                class540 var160 = class257.method1732(true, class310.field4683, class655.field9332);
                var160.field7707.method1926(class16.method101(-85, var157) + class16.method101(-111, var158) + 1, 65280);
                var160.field7707.method1931(112, var157);
                var160.field7707.method1931(121, var158);
                var160.field7707.method1926(var159, 65280);
                class756.method4211(var160, 113);
                return;
            }
            if (arg0 == 5401) {
                field6767 -= 2;
                class428.field6272[field6770[field6767]] = (short) class616.method3519(field6770[field6767 + 1], (byte) 127);
                class556.field7917.method745((byte) -80);
                class556.field7917.method739(125);
                class740.field10382.method3430(7);
                class353.method2259((byte) 64);
                return;
            }
            if (arg0 == 5405) {
                field6767 -= 2;
                int var161 = field6770[field6767];
                int var162 = field6770[field6767 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class82.field1208[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field6767 -= 7;
                int var163 = field6770[field6767];
                int var164 = field6770[field6767 + 1] << 1;
                int var165 = field6770[field6767 + 2];
                int var166 = field6770[field6767 + 3];
                int var167 = field6770[field6767 + 4];
                int var168 = field6770[field6767 + 5];
                int var169 = field6770[field6767 + 6];
                if (var163 >= 0 && var163 < 2 && class82.field1208[var163] != null && var164 >= 0 && var164 < class82.field1208[var163].length) {
                    class82.field1208[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class82.field1208[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class82.field1208[field6770[--field6767]].length >> 1;
                field6770[field6767++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class196.field3382 != null) {
                    class562.method3253(false, false, class654.field9289.field5421.method2689(3), -1, -1);
                }
                if (class530.field7619 != null) {
                    class418.method2569(1);
                    System.exit(0);
                    return;
                }
                String var171 = class519.field7501 == null ? class443.method2713(-23941) : class519.field7501;
                class405.method2498(3, class706.field9962, var171, false, class654.field9289.field5415.method2004(3) == 1);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class606.field8566 != null) {
                    if (class606.field8566.field2517 == null) {
                        var172 = class96.method790(class606.field8566.field2515, -114);
                    } else {
                        var172 = (String) class606.field8566.field2517;
                    }
                }
                field6765[field6766++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field6770[field6767++] = class706.field9962.field10270 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class196.field3382 != null) {
                    class562.method3253(false, false, class654.field9289.field5421.method2689(3), -1, -1);
                }
                String var173 = field6765[--field6766];
                boolean var174 = field6770[--field6767] == 1;
                String var175 = class443.method2713(-23941) + var173;
                class405.method2498(3, class706.field9962, var175, var174, class654.field9289.field5415.method2004(3) == 1);
                return;
            }
            if (arg0 == 5422) {
                field6766 -= 2;
                String var176 = field6765[field6766];
                String var177 = field6765[field6766 + 1];
                int var178 = field6770[--field6767];
                if (var176.length() > 0) {
                    if (class72.field1093 == null) {
                        class72.field1093 = new String[class439.field6396[class519.field7498.field4494]];
                    }
                    class72.field1093[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class634.field8897 == null) {
                        class634.field8897 = new String[class439.field6396[class519.field7498.field4494]];
                    }
                    class634.field8897[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field6765[--field6766]);
                return;
            }
            if (arg0 == 5424) {
                field6767 -= 11;
                class148.field2315 = field6770[field6767];
                class521.field7526 = field6770[field6767 + 1];
                class98.field1447 = field6770[field6767 + 2];
                class122.field1870 = field6770[field6767 + 3];
                class351.field5134 = field6770[field6767 + 4];
                class176.field3019 = field6770[field6767 + 5];
                class51.field820 = field6770[field6767 + 6];
                class73.field1096 = field6770[field6767 + 7];
                class226.field3626 = field6770[field6767 + 8];
                class174.field2999 = field6770[field6767 + 9];
                class621.field8728 = field6770[field6767 + 10];
                class101.field1494.method2621(class351.field5134, -28975);
                class101.field1494.method2621(class176.field3019, -28975);
                class101.field1494.method2621(class51.field820, -28975);
                class101.field1494.method2621(class73.field1096, -28975);
                class101.field1494.method2621(class226.field3626, -28975);
                class483.field6963 = null;
                class629.field8846 = null;
                class449.field6553 = null;
                class505.field7372 = null;
                class421.field6175 = null;
                class97.field1435 = null;
                class358.field5450 = null;
                class193.field3340 = null;
                class207.field3468 = true;
                return;
            }
            if (arg0 == 5425) {
                class560.method3249((byte) 111);
                class207.field3468 = false;
                return;
            }
            if (arg0 == 5426) {
                field6767 -= 2;
                class472.field6844 = field6770[field6767];
                class380.field5712 = field6770[field6767 + 1];
                return;
            }
            if (arg0 == 5427) {
                field6767 -= 2;
                class637.field8956 = field6770[field6767 + 1];
                return;
            }
            if (arg0 == 5428) {
                field6767 -= 2;
                int var179 = field6770[field6767];
                int var180 = field6770[field6767 + 1];
                field6770[field6767++] = class334.method2142((byte) -78, var179, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class734.method4099(field6765[--field6766], false, 13, false);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class284.method1862(class351.field5138, "accountcreated", (byte) 47);
                    return;
                } catch (Throwable var324) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class284.method1862(class351.field5138, "accountcreatestarted", (byte) 47);
                    return;
                } catch (Throwable var325) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class593.field8331 != null) {
                    Transferable var182 = class593.field8331.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var326) {
                        }
                    }
                }
                field6765[field6766++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class125.field1929 = field6770[--field6767];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field6767 -= 4;
                int var183 = field6770[field6767];
                int var184 = field6770[field6767 + 1];
                int var185 = field6770[field6767 + 2];
                int var186 = field6770[field6767 + 3];
                class390.method2440(var185, var184 << 2, 1, (var183 & 0x3FFF) - class723.field10155, var186, false, (var183 >> 14 & 0x3FFF) - class265.field4123);
                return;
            }
            if (arg0 == 5501) {
                field6767 -= 4;
                int var187 = field6770[field6767];
                int var188 = field6770[field6767 + 1];
                int var189 = field6770[field6767 + 2];
                int var190 = field6770[field6767 + 3];
                class239.method1656(var189, (var187 >> 14 & 0x3FFF) - class265.field4123, var188 << 2, true, (var187 & 0x3FFF) - class723.field10155, var190);
                return;
            }
            if (arg0 == 5502) {
                field6767 -= 6;
                int var191 = field6770[field6767];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class448.field6538 = var191;
                int var192 = field6770[field6767 + 1];
                if (var192 + 1 >= class82.field1208[class448.field6538].length >> 1) {
                    throw new RuntimeException();
                }
                class436.field6372 = var192;
                class271.field4167 = 0;
                class618.field8706 = field6770[field6767 + 2];
                class36.field352 = field6770[field6767 + 3];
                int var193 = field6770[field6767 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class440.field6414 = var193;
                int var194 = field6770[field6767 + 5];
                if (var194 + 1 >= class82.field1208[class440.field6414].length >> 1) {
                    throw new RuntimeException();
                }
                class494.field7161 = var194;
                class639.field8978 = 3;
                class275.field4202 = -1;
                class87.field1279 = -1;
                return;
            }
            if (arg0 == 5503) {
                class625.method3533((byte) -107);
                return;
            }
            if (arg0 == 5504) {
                field6767 -= 2;
                class211.method1530(0, field6770[field6767 + 1], -1, field6770[field6767]);
                return;
            }
            if (arg0 == 5505) {
                field6770[field6767++] = (int) class490.field7077 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field6770[field6767++] = (int) class261.field4064 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class654.method3687((byte) 27);
                return;
            }
            if (arg0 == 5508) {
                class232.method1612(0);
                return;
            }
            if (arg0 == 5509) {
                class525.method3123(5513);
                return;
            }
            if (arg0 == 5510) {
                class440.method2707(-35);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field6770[--field6767];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class265.field4123;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class191.field3229) {
                    var198 = class191.field3229;
                }
                int var199 = var197 - class723.field10155;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class314.field4720) {
                    var199 = class314.field4720;
                }
                class590.field8319 = (var198 << 9) + 256;
                class617.field8705 = (var199 << 9) + 256;
                class639.field8978 = 4;
                class275.field4202 = -1;
                class87.field1279 = -1;
                return;
            }
            if (arg0 == 5512) {
                class14.method73(76);
                return;
            }
            if (arg0 == 5514) {
                class106.field1554 = field6770[--field6767];
                return;
            }
            if (arg0 == 5516) {
                field6770[field6767++] = class106.field1554;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field6770[--field6767];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class265.field4123;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class191.field3229) {
                        var203 = class191.field3229;
                    }
                    int var204 = var202 - class723.field10155;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class314.field4720) {
                        var204 = class314.field4720;
                    }
                    class87.field1279 = (var203 << 9) + 256;
                    class275.field4202 = (var204 << 9) + 256;
                    return;
                }
                class87.field1279 = -1;
                class275.field4202 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field6766 -= 2;
                String var205 = field6765[field6766];
                String var206 = field6765[field6766 + 1];
                int var207 = field6770[--field6767];
                if (var205.length() > 320) {
                    return;
                }
                if (class521.field7529 != 3) {
                    return;
                }
                if (class714.field10032 == 0 && class594.field8336 == 0) {
                    class1.field4 = var205;
                    class18.field190 = var206;
                    class355.field5377 = var207;
                    class658.method3704(-5697, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class602.method3452(false);
                return;
            }
            if (arg0 == 5602) {
                if (class714.field10032 == 0) {
                    class372.field5638 = -2;
                    class203.field3430 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field6766--;
                if (class521.field7529 != 3) {
                    return;
                }
                if (class714.field10032 == 0 && class594.field8336 == 0) {
                    class757.method4214(1, field6765[field6766]);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field6766 -= 2;
                field6767 -= 2;
                if (class521.field7529 != 3) {
                    return;
                }
                if (class714.field10032 == 0 && class594.field8336 == 0) {
                    class465.method2856(field6770[field6767 + 1] == 1, field6765[field6766], (byte) -112, field6770[field6767], field6765[field6766 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class594.field8336 == 0) {
                    class751.field10468 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field6770[field6767++] = class203.field3430;
                return;
            }
            if (arg0 == 5608) {
                field6770[field6767++] = class3.field19;
                return;
            }
            if (arg0 == 5609) {
                field6770[field6767++] = class751.field10468;
                return;
            }
            if (arg0 == 5611) {
                field6770[field6767++] = class564.field7997;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field6770[--field6767];
                if (class521.field7529 != 7) {
                    return;
                }
                if (class714.field10032 == 0 && class594.field8336 == 0) {
                    if (class166.field2624 != null) {
                        class166.field2624.method3118(25);
                        class166.field2624 = null;
                    }
                    class355.field5377 = var208;
                    class658.method3704(-5697, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field6770[field6767++] = class203.field3430;
                return;
            }
            if (arg0 == 5615) {
                field6766 -= 2;
                String var209 = field6765[field6766];
                String var210 = field6765[field6766 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class521.field7529 != 3) {
                    return;
                }
                if (class714.field10032 == 0 && class594.field8336 == 0) {
                    if (class166.field2624 != null) {
                        class166.field2624.method3118(25);
                        class166.field2624 = null;
                    }
                    class1.field4 = var209;
                    class18.field190 = var210;
                    class658.method3704(-5697, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class694.method3874(false, 0);
                return;
            }
            if (arg0 == 5617) {
                field6770[field6767++] = class372.field5638;
                return;
            }
            if (arg0 == 5618) {
                field6767--;
                return;
            }
            if (arg0 == 5619) {
                field6767--;
                return;
            }
            if (arg0 == 5620) {
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field6766 -= 2;
                field6767 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class658.field9375 != null) {
                    field6770[field6767++] = 1;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field6770[field6767++] = (int) (class183.field3094 >> 32);
                field6770[field6767++] = (int) (class183.field3094 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field6770[field6767++] = class676.field9541 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class676.field9541 = true;
                class281.method1851((byte) -96);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field6770[--field6767];
                class654.field9289.method2292(111, var211, class654.field9289.field5449);
                class508.method3063((byte) -123);
                class580.method3351((byte) -82);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field6770[--field6767] == 1;
                class654.field9289.method2292(-116, var212 ? 1 : 0, class654.field9289.field5403);
                class654.field9289.method2292(-47, var212 ? 1 : 0, class654.field9289.field5453);
                class508.method3063((byte) -102);
                class227.method1586((byte) 114);
                class580.method3351((byte) -97);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field6770[--field6767] == 1;
                class654.field9289.method2292(97, var213 ? 2 : 1, class654.field9289.field5444);
                class654.field9289.method2292(117, var213 ? 2 : 1, class654.field9289.field5404);
                class227.method1586((byte) 112);
                class580.method3351((byte) -87);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6005) {
                class654.field9289.method2292(122, field6770[--field6767] == 1 ? 1 : 0, class654.field9289.field5433);
                class508.method3063((byte) -97);
                class580.method3351((byte) -93);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6007) {
                class654.field9289.method2292(-64, field6770[--field6767], class654.field9289.field5434);
                class580.method3351((byte) -101);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6008) {
                class654.field9289.method2292(126, field6770[--field6767] == 1 ? 1 : 0, class654.field9289.field5438);
                class580.method3351((byte) -122);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6010) {
                class654.field9289.method2292(-119, field6770[--field6767] == 1 ? 1 : 0, class654.field9289.field5445);
                class580.method3351((byte) -115);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6011) {
                class654.field9289.method2292(-124, field6770[--field6767], class654.field9289.field5431);
                class508.method3063((byte) -101);
                class580.method3351((byte) -124);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6012) {
                class654.field9289.method2292(126, field6770[--field6767] == 1 ? 1 : 0, class654.field9289.field5447);
                class710.method3930((byte) 112);
                class525.method3121(-11701);
                class580.method3351((byte) -77);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6014) {
                class654.field9289.method2292(107, field6770[--field6767] == 1 ? 2 : 0, class654.field9289.field5440);
                class508.method3063((byte) -107);
                class580.method3351((byte) -98);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6015) {
                class654.field9289.method2292(-71, field6770[--field6767] == 1 ? 1 : 0, class654.field9289.field5436);
                class508.method3063((byte) -96);
                class580.method3351((byte) -120);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6016) {
                class654.field9289.method2292(-114, field6770[--field6767], class654.field9289.field5417);
                class526.method3125(1221653740, class654.field9289.field5415.method2004(3), false);
                class580.method3351((byte) -112);
                return;
            }
            if (arg0 == 6017) {
                class654.field9289.method2292(105, field6770[--field6767] == 1 ? 1 : 0, class654.field9289.field5451);
                class322.method2090(1);
                class580.method3351((byte) -109);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6018) {
                class654.field9289.method2292(66, field6770[--field6767], class654.field9289.field5439);
                class580.method3351((byte) -124);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field6770[--field6767];
                int var215 = class654.field9289.field5420.method155(3);
                if (var214 != var215) {
                    if (client.method2740(class521.field7529, (byte) 121)) {
                        if (var215 == 0 && class647.field9210 != -1) {
                            class736.method4110((byte) -125, class647.field9210, var214, 0, class521.field7518, false);
                            class384.method2409(false);
                            class354.field5373 = false;
                        } else if (var214 == 0) {
                            class232.method1614((byte) -2);
                            class354.field5373 = false;
                        } else {
                            class457.method2796(var214, -1);
                        }
                    }
                    class654.field9289.method2292(89, var214, class654.field9289.field5420);
                    class580.method3351((byte) -90);
                    class407.field6033 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class654.field9289.method2292(116, field6770[--field6767], class654.field9289.field5435);
                class580.method3351((byte) -87);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class654.field9289.field5444.method136(3);
                class654.field9289.method2292(-111, field6770[--field6767] == 1 ? 0 : var216, class654.field9289.field5404);
                class227.method1586((byte) 105);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field6770[--field6767];
                class654.field9289.method2292(-108, var217, class654.field9289.field5441);
                class580.method3351((byte) -125);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6024) {
                class654.field9289.method2292(67, field6770[--field6767], class654.field9289.field5412);
                class580.method3351((byte) -127);
                return;
            }
            if (arg0 == 6025) {
                class654.field9289.method2292(-122, field6770[--field6767], class654.field9289.field5422);
                class580.method3351((byte) -110);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field6770[--field6767];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class49.method486(var218 == 1, 2);
                return;
            }
            if (arg0 == 6028) {
                class654.field9289.method2292(68, field6770[--field6767] == 0 ? 0 : 1, class654.field9289.field5423);
                class580.method3351((byte) -128);
                return;
            }
            if (arg0 == 6029) {
                class654.field9289.method2292(75, field6770[--field6767], class654.field9289.field5434);
                class580.method3351((byte) -88);
                return;
            }
            if (arg0 == 6030) {
                class654.field9289.method2292(-73, field6770[--field6767] == 0 ? 0 : 1, class654.field9289.field5427);
                class580.method3351((byte) -88);
                class508.method3063((byte) -104);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field6770[--field6767];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class526.method3125(1221653740, var219, false);
                return;
            }
            if (arg0 == 6032) {
                field6767 -= 2;
                int var220 = field6770[field6767];
                boolean var221 = field6770[field6767 + 1] == 1;
                class654.field9289.method2292(86, var220, class654.field9289.field5446);
                if (!var221) {
                    class654.field9289.method2292(-109, 0, class654.field9289.field5443);
                }
                class580.method3351((byte) -92);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6033) {
                class654.field9289.method2292(-114, field6770[--field6767], class654.field9289.field5419);
                class580.method3351((byte) -91);
                return;
            }
            if (arg0 == 6034) {
                class654.field9289.method2292(-62, field6770[--field6767] == 1 ? 1 : 0, class654.field9289.field5448);
                class580.method3351((byte) -97);
                class710.method3930((byte) 29);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class654.field9289.field5403.method3878(3);
                class654.field9289.method2292(-110, field6770[--field6767] == 1 ? 1 : var222, class654.field9289.field5453);
                class508.method3063((byte) -102);
                class227.method1586((byte) 104);
                return;
            }
            if (arg0 == 6036) {
                class654.field9289.method2292(-56, field6770[--field6767], class654.field9289.field5407);
                class580.method3351((byte) -122);
                class515.field7466 = true;
                return;
            }
            if (arg0 == 6037) {
                class654.field9289.method2292(124, field6770[--field6767], class654.field9289.field5426);
                class580.method3351((byte) -111);
                class407.field6033 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field6770[--field6767];
                int var224 = class654.field9289.field5425.method155(3);
                if (var223 != var224 && class647.field9210 == class643.field9184) {
                    if (!client.method2740(class521.field7529, (byte) 121)) {
                        if (var224 == 0) {
                            class736.method4110((byte) -116, class647.field9210, var223, 0, class521.field7518, false);
                            class384.method2409(false);
                            class354.field5373 = false;
                        } else if (var223 == 0) {
                            class232.method1614((byte) -2);
                            class354.field5373 = false;
                        } else {
                            class457.method2796(var223, -1);
                        }
                    }
                    class654.field9289.method2292(105, var223, class654.field9289.field5425);
                    class580.method3351((byte) -121);
                    class407.field6033 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field6770[--field6767];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class654.field9289.field5452.method2647(3)) {
                    class654.field9289.method2292(79, var225, class654.field9289.field5452);
                    class580.method3351((byte) -106);
                    class407.field6033 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field6770[--field6767];
                if (var226 != class654.field9289.field5405.method3052(3)) {
                    class654.field9289.method2292(-101, var226, class654.field9289.field5405);
                    class580.method3351((byte) -116);
                    class407.field6033 = false;
                    class650.method3658((byte) 74);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field6770[field6767++] = class654.field9289.field5449.method3425(3);
                return;
            }
            if (arg0 == 6102) {
                field6770[field6767++] = class654.field9289.field5403.method3878(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field6770[field6767++] = class654.field9289.field5444.method136(3) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field6770[field6767++] = class654.field9289.field5433.method4141(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field6770[field6767++] = class654.field9289.field5434.method2124(3);
                return;
            }
            if (arg0 == 6108) {
                field6770[field6767++] = class654.field9289.field5438.method3453(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field6770[field6767++] = class654.field9289.field5445.method2362(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field6770[field6767++] = class654.field9289.field5431.method2801(3);
                return;
            }
            if (arg0 == 6112) {
                field6770[field6767++] = class654.field9289.field5447.method4104(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field6770[field6767++] = class654.field9289.field5440.method476(3) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field6770[field6767++] = class654.field9289.field5436.method2435(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field6770[field6767++] = class654.field9289.field5417.method2495(3);
                return;
            }
            if (arg0 == 6117) {
                field6770[field6767++] = class654.field9289.field5451.method1749(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field6770[field6767++] = class654.field9289.field5439.method155(3);
                return;
            }
            if (arg0 == 6119) {
                field6770[field6767++] = class654.field9289.field5420.method155(3);
                return;
            }
            if (arg0 == 6120) {
                field6770[field6767++] = class654.field9289.field5435.method155(3);
                return;
            }
            if (arg0 == 6123) {
                field6770[field6767++] = class518.method3090(64);
                return;
            }
            if (arg0 == 6124) {
                field6770[field6767++] = class654.field9289.field5412.method2495(3);
                return;
            }
            if (arg0 == 6125) {
                field6770[field6767++] = class654.field9289.field5422.method1789(3);
                return;
            }
            if (arg0 == 6127) {
                field6770[field6767++] = class654.field9289.field5429.method2100(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field6770[field6767++] = class654.field9289.field5423.method3493(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field6770[field6767++] = class654.field9289.field5434.method2124(3);
                return;
            }
            if (arg0 == 6130) {
                field6770[field6767++] = class654.field9289.field5427.method3956(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field6770[field6767++] = class654.field9289.field5415.method2004(3);
                return;
            }
            if (arg0 == 6132) {
                field6770[field6767++] = class654.field9289.field5446.method2004(3);
                return;
            }
            if (arg0 == 6133) {
                field6770[field6767++] = class706.field9962.field10270 && !class706.field9962.field10262 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field6770[field6767++] = class654.field9289.field5419.method3218(3);
                return;
            }
            if (arg0 == 6136) {
                field6770[field6767++] = class654.field9289.field5448.method3596(3) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field6770[field6767++] = class221.method1572(false, class654.field9289.field5415.method2004(3), 200);
                return;
            }
            if (arg0 == 6139) {
                field6770[field6767++] = class654.field9289.field5407.method3284(3);
                return;
            }
            if (arg0 == 6142) {
                field6770[field6767++] = class654.field9289.field5426.method155(3);
                return;
            }
            if (arg0 == 6143) {
                field6770[field6767++] = class654.field9289.field5425.method155(3);
                return;
            }
            if (arg0 == 6144) {
                field6770[field6767++] = class485.field7010 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field6770[field6767++] = class654.field9289.field5452.method2647(3);
                return;
            }
            if (arg0 == 6146) {
                field6770[field6767++] = class654.field9289.field5405.method3052(3);
                return;
            }
            if (arg0 == 6147) {
                field6770[field6767++] = class547.field7815.field364 < 512 || class485.field7010 || class126.field1952 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field6770[field6767++] = class147.field2307 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field6767 -= 2;
                class550.field7844 = (short) field6770[field6767];
                if (class550.field7844 <= 0) {
                    class550.field7844 = 256;
                }
                class289.field4446 = (short) field6770[field6767 + 1];
                if (class289.field4446 <= 0) {
                    class289.field4446 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field6767 -= 2;
                class139.field2175 = (short) field6770[field6767];
                if (class139.field2175 <= 0) {
                    class139.field2175 = 256;
                }
                class505.field7375 = (short) field6770[field6767 + 1];
                if (class505.field7375 <= 0) {
                    class505.field7375 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field6767 -= 4;
                class73.field1098 = (short) field6770[field6767];
                if (class73.field1098 <= 0) {
                    class73.field1098 = 1;
                }
                class49.field811 = (short) field6770[field6767 + 1];
                if (class49.field811 <= 0) {
                    class49.field811 = 32767;
                } else if (class49.field811 < class73.field1098) {
                    class49.field811 = class73.field1098;
                }
                class105.field1545 = (short) field6770[field6767 + 2];
                if (class105.field1545 <= 0) {
                    class105.field1545 = 1;
                }
                class1.field6 = (short) field6770[field6767 + 3];
                if (class1.field6 <= 0) {
                    class1.field6 = 32767;
                    return;
                }
                if (class1.field6 < class105.field1545) {
                    class1.field6 = class105.field1545;
                }
                return;
            }
            if (arg0 == 6203) {
                class736.method4105(0, 8, 0, false, class548.field7823.field5230, class548.field7823.field5280);
                field6770[field6767++] = class103.field1535;
                field6770[field6767++] = class67.field1054;
                return;
            }
            if (arg0 == 6204) {
                field6770[field6767++] = class139.field2175;
                field6770[field6767++] = class505.field7375;
                return;
            }
            if (arg0 == 6205) {
                field6770[field6767++] = class550.field7844;
                field6770[field6767++] = class289.field4446;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field6770[field6767++] = (int) (class18.method109(-11121) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field6770[field6767++] = (int) (class18.method109(-11121) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field6767 -= 3;
                int var227 = field6770[field6767];
                int var228 = field6770[field6767 + 1];
                int var229 = field6770[field6767 + 2];
                field6761.clear();
                field6761.set(11, 12);
                field6761.set(var229, var228, var227);
                int var230 = (int) (field6761.getTime().getTime() / 86400000L) - 11745;
                if (var229 < 1970) {
                    var230--;
                }
                field6770[field6767++] = var230;
                return;
            }
            if (arg0 == 6303) {
                field6761.clear();
                field6761.setTime(new Date(class18.method109(-11121)));
                field6770[field6767++] = field6761.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var231 = field6770[--field6767];
                boolean var232 = true;
                if (var231 < 0) {
                    var232 = (var231 + 1) % 4 == 0;
                } else if (var231 < 1582) {
                    var232 = var231 % 4 == 0;
                } else if (var231 % 4 != 0) {
                    var232 = false;
                } else if (var231 % 100 != 0) {
                    var232 = true;
                } else if (var231 % 400 != 0) {
                    var232 = false;
                }
                field6770[field6767++] = var232 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field6770[field6767++] = class631.method3576(true) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field6770[field6767++] = class109.method887((byte) 44) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class521.field7529 == 7 && class714.field10032 == 0 && class594.field8336 == 0) {
                    if (class606.field8565) {
                        field6770[field6767++] = 0;
                        return;
                    }
                    if (class110.field1717 > class18.method109(-11121) - 1000L) {
                        field6770[field6767++] = 1;
                        return;
                    }
                    class606.field8565 = true;
                    class540 var233 = class257.method1732(true, class706.field9960, class655.field9332);
                    var233.field7707.method1970((byte) 29, class693.field9829);
                    class756.method4211(var233, 115);
                    field6770[field6767++] = 0;
                    return;
                }
                field6770[field6767++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class225 var234 = class357.method2279(4);
                if (var234 != null) {
                    field6770[field6767++] = var234.field3623;
                    field6770[field6767++] = var234.field4700;
                    field6765[field6766++] = var234.field3621;
                    class754 var235 = var234.method1582(-1);
                    field6770[field6767++] = var235.field10517;
                    field6765[field6766++] = var235.field10519;
                    field6770[field6767++] = var234.field4706;
                    field6770[field6767++] = var234.field3625;
                    field6765[field6766++] = var234.field3622;
                    return;
                }
                field6770[field6767++] = -1;
                field6770[field6767++] = 0;
                field6765[field6766++] = "";
                field6770[field6767++] = 0;
                field6765[field6766++] = "";
                field6770[field6767++] = 0;
                field6770[field6767++] = 0;
                field6765[field6766++] = "";
                return;
            }
            if (arg0 == 6502) {
                class225 var236 = class81.method724(false);
                if (var236 != null) {
                    field6770[field6767++] = var236.field3623;
                    field6770[field6767++] = var236.field4700;
                    field6765[field6766++] = var236.field3621;
                    class754 var237 = var236.method1582(-1);
                    field6770[field6767++] = var237.field10517;
                    field6765[field6766++] = var237.field10519;
                    field6770[field6767++] = var236.field4706;
                    field6770[field6767++] = var236.field3625;
                    field6765[field6766++] = var236.field3622;
                    return;
                }
                field6770[field6767++] = -1;
                field6770[field6767++] = 0;
                field6765[field6766++] = "";
                field6770[field6767++] = 0;
                field6765[field6766++] = "";
                field6770[field6767++] = 0;
                field6770[field6767++] = 0;
                field6765[field6766++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var238 = field6770[--field6767];
                String var239 = field6765[--field6766];
                if (class521.field7529 == 7 && class714.field10032 == 0 && class594.field8336 == 0) {
                    field6770[field6767++] = class217.method1558(true, var239, var238) ? 1 : 0;
                    return;
                }
                field6770[field6767++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var240 = field6770[--field6767];
                class225 var241 = class119.method941(var240, -96);
                if (var241 != null) {
                    field6770[field6767++] = var241.field4700;
                    field6765[field6766++] = var241.field3621;
                    class754 var242 = var241.method1582(-1);
                    field6770[field6767++] = var242.field10517;
                    field6765[field6766++] = var242.field10519;
                    field6770[field6767++] = var241.field4706;
                    field6770[field6767++] = var241.field3625;
                    field6765[field6766++] = var241.field3622;
                    return;
                }
                field6770[field6767++] = -1;
                field6765[field6766++] = "";
                field6770[field6767++] = 0;
                field6765[field6766++] = "";
                field6770[field6767++] = 0;
                field6770[field6767++] = 0;
                field6765[field6766++] = "";
                return;
            }
            if (arg0 == 6507) {
                field6767 -= 4;
                int var243 = field6770[field6767];
                boolean var244 = field6770[field6767 + 1] == 1;
                int var245 = field6770[field6767 + 2];
                boolean var246 = field6770[field6767 + 3] == 1;
                class532.method3149(var243, -104, var246, var244, var245);
                return;
            }
            if (arg0 == 6508) {
                class237.method1632(0);
                return;
            }
            if (arg0 == 6509) {
                if (class521.field7529 != 7) {
                    return;
                }
                class643.field9186 = field6770[--field6767] == 1;
                return;
            }
            if (arg0 == 6510) {
                field6770[field6767++] = class672.field9512;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class512.field7450 == class141.field2199) {
                if (arg0 == 6700) {
                    int var247 = class36.field340.method3511(0);
                    if (class673.field9523 != -1) {
                        var247++;
                    }
                    field6770[field6767++] = var247;
                    return;
                }
                if (arg0 == 6701) {
                    int var248 = field6770[--field6767];
                    if (class673.field9523 != -1) {
                        if (var248 == 0) {
                            field6770[field6767++] = class673.field9523;
                            return;
                        }
                        var248--;
                    }
                    class520 var249 = (class520) class36.field340.method3508((byte) -54);
                    while (var248-- > 0) {
                        var249 = (class520) class36.field340.method3520(-1);
                    }
                    field6770[field6767++] = var249.field7511;
                    return;
                }
                if (arg0 == 6702) {
                    int var250 = field6770[--field6767];
                    if (class158.field2453[var250] == null) {
                        field6765[field6766++] = "";
                        return;
                    }
                    String var251 = class158.field2453[var250][0].field5201;
                    if (var251 == null) {
                        field6765[field6766++] = "";
                        return;
                    }
                    field6765[field6766++] = var251.substring(0, var251.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var252 = field6770[--field6767];
                    if (class158.field2453[var252] == null) {
                        field6770[field6767++] = 0;
                        return;
                    }
                    field6770[field6767++] = class158.field2453[var252].length;
                    return;
                }
                if (arg0 == 6704) {
                    field6767 -= 2;
                    int var253 = field6770[field6767];
                    int var254 = field6770[field6767 + 1];
                    if (class158.field2453[var253] == null) {
                        field6765[field6766++] = "";
                        return;
                    }
                    String var255 = class158.field2453[var253][var254].field5201;
                    if (var255 == null) {
                        field6765[field6766++] = "";
                        return;
                    }
                    field6765[field6766++] = var255;
                    return;
                }
                if (arg0 == 6705) {
                    field6767 -= 2;
                    int var256 = field6770[field6767];
                    int var257 = field6770[field6767 + 1];
                    if (class158.field2453[var256] == null) {
                        field6770[field6767++] = 0;
                        return;
                    }
                    field6770[field6767++] = class158.field2453[var256][var257].field5271;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field6767 -= 3;
                    int var258 = field6770[field6767];
                    int var259 = field6770[field6767 + 1];
                    int var260 = field6770[field6767 + 2];
                    class93.method777(1, false, var258 << 16 | var259, "", var260);
                    return;
                }
                if (arg0 == 6708) {
                    field6767 -= 3;
                    int var261 = field6770[field6767];
                    int var262 = field6770[field6767 + 1];
                    int var263 = field6770[field6767 + 2];
                    class93.method777(2, false, var261 << 16 | var262, "", var263);
                    return;
                }
                if (arg0 == 6709) {
                    field6767 -= 3;
                    int var264 = field6770[field6767];
                    int var265 = field6770[field6767 + 1];
                    int var266 = field6770[field6767 + 2];
                    class93.method777(3, false, var264 << 16 | var265, "", var266);
                    return;
                }
                if (arg0 == 6710) {
                    field6767 -= 3;
                    int var267 = field6770[field6767];
                    int var268 = field6770[field6767 + 1];
                    int var269 = field6770[field6767 + 2];
                    class93.method777(4, false, var267 << 16 | var268, "", var269);
                    return;
                }
                if (arg0 == 6711) {
                    field6767 -= 3;
                    int var270 = field6770[field6767];
                    int var271 = field6770[field6767 + 1];
                    int var272 = field6770[field6767 + 2];
                    class93.method777(5, false, var270 << 16 | var271, "", var272);
                    return;
                }
                if (arg0 == 6712) {
                    field6767 -= 3;
                    int var273 = field6770[field6767];
                    int var274 = field6770[field6767 + 1];
                    int var275 = field6770[field6767 + 2];
                    class93.method777(6, false, var273 << 16 | var274, "", var275);
                    return;
                }
                if (arg0 == 6713) {
                    field6767 -= 3;
                    int var276 = field6770[field6767];
                    int var277 = field6770[field6767 + 1];
                    int var278 = field6770[field6767 + 2];
                    class93.method777(7, false, var276 << 16 | var277, "", var278);
                    return;
                }
                if (arg0 == 6714) {
                    field6767 -= 3;
                    int var279 = field6770[field6767];
                    int var280 = field6770[field6767 + 1];
                    int var281 = field6770[field6767 + 2];
                    class93.method777(8, false, var279 << 16 | var280, "", var281);
                    return;
                }
                if (arg0 == 6715) {
                    field6767 -= 3;
                    int var282 = field6770[field6767];
                    int var283 = field6770[field6767 + 1];
                    int var284 = field6770[field6767 + 2];
                    class93.method777(9, false, var282 << 16 | var283, "", var284);
                    return;
                }
                if (arg0 == 6716) {
                    field6767 -= 3;
                    int var285 = field6770[field6767];
                    int var286 = field6770[field6767 + 1];
                    int var287 = field6770[field6767 + 2];
                    class93.method777(10, false, var285 << 16 | var286, "", var287);
                    return;
                }
                if (arg0 == 6717) {
                    field6767 -= 3;
                    int var288 = field6770[field6767];
                    int var289 = field6770[field6767 + 1];
                    int var290 = field6770[field6767 + 2];
                    class353 var291 = class745.method4165(103, var288 << 16 | var289, var290);
                    class531.method3143((byte) -65);
                    class285 var292 = client.method2735(var291);
                    class215.method1550((byte) -75, var292.field4385, var291, var292.method1866(1092));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var293 = field6770[--field6767];
                    class277 var294 = class617.field8704.method2550(var293, -49);
                    if (var294.field4225 == null) {
                        field6765[field6766++] = "";
                        return;
                    }
                    field6765[field6766++] = var294.field4225;
                    return;
                }
                if (arg0 == 6801) {
                    int var295 = field6770[--field6767];
                    class277 var296 = class617.field8704.method2550(var295, 124);
                    field6770[field6767++] = var296.field4237;
                    return;
                }
                if (arg0 == 6802) {
                    int var297 = field6770[--field6767];
                    class277 var298 = class617.field8704.method2550(var297, 124);
                    field6770[field6767++] = var298.field4211;
                    return;
                }
                if (arg0 == 6803) {
                    int var299 = field6770[--field6767];
                    class277 var300 = class617.field8704.method2550(var299, 121);
                    field6770[field6767++] = var300.field4220;
                    return;
                }
                if (arg0 == 6804) {
                    field6767 -= 2;
                    int var301 = field6770[field6767];
                    int var302 = field6770[field6767 + 1];
                    class193 var303 = class382.field5728.method1997((byte) 120, var302);
                    if (var303.method1463(-6764)) {
                        field6765[field6766++] = class617.field8704.method2550(var301, 112).method1812(-3, var302, var303.field3338);
                        return;
                    }
                    field6770[field6767++] = class617.field8704.method2550(var301, -124).method1815(var302, (byte) -119, var303.field3339);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field6770[field6767++] = class311.field4698 && !class355.field5385 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field6770[field6767++] = class43.field736;
                    return;
                }
                if (arg0 == 6902) {
                    field6770[field6767++] = class567.field8050;
                    return;
                }
                if (arg0 == 6903) {
                    field6770[field6767++] = class401.field5965;
                    return;
                }
                if (arg0 == 6904) {
                    field6770[field6767++] = class73.field1095;
                    return;
                }
                if (arg0 == 6905) {
                    String var304 = "";
                    if (class606.field8566 != null) {
                        if (class606.field8566.field2517 == null) {
                            var304 = class96.method790(class606.field8566.field2515, -104);
                        } else {
                            var304 = (String) class606.field8566.field2517;
                        }
                    }
                    field6765[field6766++] = var304;
                    return;
                }
                if (arg0 == 6906) {
                    field6770[field6767++] = class221.field3604;
                    return;
                }
                if (arg0 == 6907) {
                    field6770[field6767++] = class735.field10363;
                    return;
                }
                if (arg0 == 6908) {
                    field6770[field6767++] = class721.field10109;
                    return;
                }
                if (arg0 == 6909) {
                    field6770[field6767++] = class237.field3809 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field6770[field6767++] = class459.field6655;
                    return;
                }
                if (arg0 == 6911) {
                    field6770[field6767++] = class645.field9199;
                    return;
                }
                if (arg0 == 6912) {
                    field6770[field6767++] = class297.field4513;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var305 = class273.method1794((byte) 106);
                    field6770[field6767++] = class236.field3789 = class654.field9289.field5415.method2004(3);
                    field6770[field6767++] = var305;
                    class508.method3063((byte) -122);
                    class580.method3351((byte) -93);
                    class407.field6033 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class661.method3721(1);
                    class508.method3063((byte) -122);
                    class580.method3351((byte) -119);
                    class407.field6033 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class303.method1991(123);
                    class508.method3063((byte) -128);
                    class580.method3351((byte) -121);
                    class407.field6033 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class407.method2519(false);
                    class508.method3063((byte) -112);
                    class580.method3351((byte) -102);
                    class407.field6033 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class223.method1579(0, true);
                    class508.method3063((byte) -106);
                    class580.method3351((byte) -118);
                    class407.field6033 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class654.field9289.method2292(108, 0, class654.field9289.field5443);
                    class580.method3351((byte) -117);
                    class407.field6033 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class236.field3789 == 2) {
                        class453.field6594 = true;
                        return;
                    }
                    if (class236.field3789 == 1) {
                        class64.field1031 = true;
                        return;
                    }
                    if (class236.field3789 == 3) {
                        class527.field7587 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field6770[field6767++] = class654.field9289.field5443.method1358(3);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field6767 -= 2;
                    int var306 = field6770[field6767];
                    int var307 = field6770[field6767 + 1];
                    if (var306 != -1) {
                        if (var307 > 255) {
                            var307 = 255;
                        } else if (var307 < 0) {
                            var307 = 0;
                        }
                        class476.method2901(-20, false, var306, var307);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var308 = field6770[--field6767];
                    if (var308 != -1) {
                        class188.method1429(var308, 78);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var309 = field6770[--field6767];
                    if (var309 != -1) {
                        class393.method2447(var309, -9502);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field6770[field6767++] = class353.method2266("jagtheora", (byte) 123) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field6770[field6767++] = class654.field9289.field5433.method4142(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field6770[field6767++] = class654.field9289.field5445.method2360(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field6770[field6767++] = class654.field9289.field5431.method2808(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field6770[field6767++] = class654.field9289.field5440.method479(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field6770[field6767++] = class654.field9289.field5412.method2494(-16181) && class364.field5573.method218() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field6770[field6767++] = class654.field9289.field5441.method3671(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field6770[field6767++] = class654.field9289.field5422.method1792(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field6770[field6767++] = class654.field9289.field5429.method2101(-16181) && class364.field5573.method392() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field6770[field6767++] = class654.field9289.field5427.method3955(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field6770[field6767++] = class654.field9289.field5448.method3598(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field6770[field6767++] = class654.field9289.field5407.method3283(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field6770[field6767++] = class654.field9289.field5436.method2434(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field6770[field6767++] = class654.field9289.field5405.method3050(-16181) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field6770[field6767++] = class654.field9289.field5446.method1999(-16181) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var310 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5433.method133(18648, var310);
                    return;
                }
                if (arg0 == 7302) {
                    int var311 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5445.method133(18648, var311);
                    return;
                }
                if (arg0 == 7303) {
                    int var312 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5431.method133(18648, var312);
                    return;
                }
                if (arg0 == 7304) {
                    int var313 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5440.method133(18648, var313);
                    return;
                }
                if (arg0 == 7305) {
                    int var314 = field6770[--field6767];
                    if (!class364.field5573.method218()) {
                        field6770[field6767++] = 3;
                        return;
                    }
                    field6770[field6767++] = class654.field9289.field5412.method133(18648, var314);
                    return;
                }
                if (arg0 == 7306) {
                    int var315 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5441.method133(18648, var315);
                    return;
                }
                if (arg0 == 7307) {
                    int var316 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5422.method133(18648, var316);
                    return;
                }
                if (arg0 == 7308) {
                    int var317 = field6770[--field6767];
                    if (!class364.field5573.method392()) {
                        field6770[field6767++] = 3;
                        return;
                    }
                    field6770[field6767++] = class654.field9289.field5429.method133(18648, var317);
                    return;
                }
                if (arg0 == 7309) {
                    int var318 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5427.method133(18648, var318);
                    return;
                }
                if (arg0 == 7310) {
                    int var319 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5448.method133(18648, var319);
                    return;
                }
                if (arg0 == 7311) {
                    int var320 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5407.method133(18648, var320);
                    return;
                }
                if (arg0 == 7312) {
                    int var321 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5436.method133(18648, var321);
                    return;
                }
                if (arg0 == 7313) {
                    int var322 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5405.method133(18648, var322);
                    return;
                }
                if (arg0 == 7314) {
                    int var323 = field6770[--field6767];
                    field6770[field6767++] = class654.field9289.field5446.method133(18648, var323);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(I)V", line = 7906)
    private static final void method2846(int arg0) {
        class353 var1 = class65.method638(arg0, 1668949296);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class353[] var3 = class114.field1763[var2];
        if (var3 == null) {
            class353[] var4 = class158.field2453[var2];
            int var5 = var4.length;
            var3 = class114.field1763[var2] = new class353[var5];
            class571.method3310(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class571.method3310(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(I)V", line = 7944)
    public static final void method2847(int arg0) {
        if (arg0 == -1 || !class118.method934(arg0, 104)) {
            return;
        }
        class353[] var1 = class158.field2453[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class353 var3 = var1[var2];
            if (var3.field5243 != null) {
                class700 var4 = new class700();
                var4.field9902 = var3;
                var4.field9891 = var3.field5243;
                method2852(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(I)Ljava/lang/String;", line = 7974)
    private static final String method2848(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field6761.setTime(new Date(var1));
        int var3 = field6761.get(5);
        int var4 = field6761.get(2);
        int var5 = field6761.get(1);
        return var3 + "-" + field6776[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "()V", line = 7992)
    public static final void method2849() {
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lsw;I)V", line = 8001)
    private static final void method2850(class603 arg0, int arg1) {
        field6767 = 0;
        field6766 = 0;
        int var2 = -1;
        int[] var3 = arg0.field8528;
        int[] var4 = arg0.field8525;
        byte var5 = -1;
        field6762 = 0;
        try {
            int var6 = 0;
            label270: while (true) {
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
                        method2839(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method2845(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field6770[field6767++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field6770[field6767++] = class422.field6216.field4645[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class422.field6216.method2008(var8, field6770[--field6767], (byte) -75);
                } else if (var43 == 3) {
                    field6765[field6766++] = arg0.field8527[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field6767 -= 2;
                    if (field6770[field6767 + 1] != field6770[field6767]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field6767 -= 2;
                    if (field6770[field6767 + 1] == field6770[field6767]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field6767 -= 2;
                    if (field6770[field6767] < field6770[field6767 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field6767 -= 2;
                    if (field6770[field6767] > field6770[field6767 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field6762 == 0) {
                        return;
                    }
                    class465 var9 = field6774[--field6762];
                    arg0 = var9.field6785;
                    var3 = arg0.field8528;
                    var4 = arg0.field8525;
                    var2 = var9.field6784;
                    field6769 = var9.field6780;
                    field6760 = var9.field6783;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field6770[field6767++] = class422.field6216.method2013(-94, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class422.field6216.method2011(field6770[--field6767], (byte) -88, var11);
                } else if (var43 == 31) {
                    field6767 -= 2;
                    if (field6770[field6767] <= field6770[field6767 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field6767 -= 2;
                    if (field6770[field6767] >= field6770[field6767 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field6770[field6767++] = field6769[var4[var2]];
                } else if (var43 == 34) {
                    field6769[var4[var2]] = field6770[--field6767];
                } else if (var43 == 35) {
                    field6765[field6766++] = field6760[var4[var2]];
                } else if (var43 == 36) {
                    field6760[var4[var2]] = field6765[--field6766];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field6766 -= var12;
                    String var13 = class376.method2376(field6765, var12, field6766, -1);
                    field6765[field6766++] = var13;
                } else if (var43 == 38) {
                    field6767--;
                } else if (var43 == 39) {
                    field6766--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class603 var15 = class678.method3785(1, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field8532];
                    String[] var17 = new String[var15.field8534];
                    for (int var18 = 0; var18 < var15.field8526; var18++) {
                        var16[var18] = field6770[field6767 + var18 - var15.field8526];
                    }
                    for (int var19 = 0; var19 < var15.field8531; var19++) {
                        var17[var19] = field6765[field6766 + var19 - var15.field8531];
                    }
                    field6767 -= var15.field8526;
                    field6766 -= var15.field8531;
                    class465 var20 = new class465();
                    var20.field6785 = arg0;
                    var20.field6784 = var2;
                    var20.field6780 = field6769;
                    var20.field6783 = field6760;
                    if (field6762 >= field6774.length) {
                        throw new RuntimeException();
                    }
                    field6774[field6762++] = var20;
                    arg0 = var15;
                    var3 = var15.field8528;
                    var4 = var15.field8525;
                    var2 = -1;
                    field6769 = var16;
                    field6760 = var17;
                } else if (var43 == 42) {
                    field6770[field6767++] = class472.field6852[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class472.field6852[var21] = field6770[--field6767];
                    class382.method2402(29400, var21);
                    class292.field4487 |= class618.field8712[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field6770[--field6767];
                    if (var24 >= 0 && var24 <= 5000) {
                        field6756[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label270;
                            }
                            field6768[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field6770[--field6767];
                    if (var28 < 0 || var28 >= field6756[var27]) {
                        throw new RuntimeException();
                    }
                    field6770[field6767++] = field6768[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field6767 -= 2;
                    int var30 = field6770[field6767];
                    if (var30 < 0 || var30 >= field6756[var29]) {
                        throw new RuntimeException();
                    }
                    field6768[var29][var30] = field6770[field6767 + 1];
                } else if (var43 == 47) {
                    String var31 = class52.field843[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field6765[field6766++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class52.field843[var32] = field6765[--field6766];
                    class30.method156(var32, (byte) -21);
                } else if (var43 == 51) {
                    class616 var33 = arg0.field8523[var4[var2]];
                    class332 var34 = (class332) var33.method3512(true, (long) field6770[--field6767]);
                    if (var34 != null) {
                        var2 += var34.field4880;
                    }
                } else if (var43 == 86) {
                    if (field6770[--field6767] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 87 && field6770[--field6767] == 0) {
                    var2 += var4[var2];
                }
            }
        } catch (Exception var42) {
            if (arg0.field8535 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field1039).append(" ");
                for (int var41 = field6762 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field6774[var41].field6785.field1039).append(" ");
                }
                var40.append("op: ").append(var5);
                class333.method2135(var42, var40.toString(), -120);
            } else {
                class564.method3268("Clientscript error in: " + arg0.field8535, 17137, 4);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field8535).append("\n");
                for (int var38 = field6762 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field6774[var38].field6785.field8535).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class333.method2135(var42, var37.toString(), -86);
                class400.method2484(26852, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lew;II)V")
    public static final void method2851(class685 arg0, int arg1, int arg2) {
        class603 var3 = class333.method2136(arg0, (byte) -116, arg2, arg1);
        if (var3 == null) {
            return;
        }
        field6769 = new int[var3.field8532];
        field6760 = new String[var3.field8534];
        if (class657.field9349 == var3.field8529 || class259.field4050 == var3.field8529 || class529.field7603 == var3.field8529) {
            int var4 = 0;
            int var5 = 0;
            if (class297.field4516 != null) {
                var4 = class297.field4516.field5359;
                var5 = class297.field4516.field5296;
            }
            field6769[0] = class651.field9244.method2915(-8463) - var4;
            field6769[1] = class651.field9244.method2921((byte) 78) - var5;
        }
        method2850(var3, 200000);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Luca;I)V")
    private static final void method2852(class700 arg0, int arg1) {
        Object[] var2 = arg0.field9891;
        int var3 = (Integer) var2[0];
        class603 var4 = class678.method3785(1, var3);
        if (var4 == null) {
            return;
        }
        field6769 = new int[var4.field8532];
        int var5 = 0;
        field6760 = new String[var4.field8534];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field9896;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field9903;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field9902 == null ? -1 : arg0.field9902.field5349;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field9895;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field9902 == null ? -1 : arg0.field9902.field5352;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field9894 == null ? -1 : arg0.field9894.field5349;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field9894 == null ? -1 : arg0.field9894.field5352;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field9899;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field9898;
                }
                field6769[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field9900;
                }
                field6760[var6++] = var9;
            }
        }
        field6778 = arg0.field9904;
        method2850(var4, arg1);
    }
}
