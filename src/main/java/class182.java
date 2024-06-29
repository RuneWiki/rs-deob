import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class182 {

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "[I")
    private static int[] field2732 = new int[1000];

    @OriginalMember(owner = "client!cw", name = "e", descriptor = "I")
    private static int field2736 = 0;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "[I")
    private static int[] field2747 = new int[3];

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "[Ljga;")
    private static class717[] field2743 = new class717[50];

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "[[I")
    private static int[][] field2742 = new int[5][5000];

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "[I")
    private static int[] field2754 = new int[5];

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "[Ljava/lang/String;")
    private static String[] field2755 = new String[1000];

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    private static int field2744 = 0;

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "I")
    private static int field2756 = 0;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "Lqr;")
    public static class65 field2738 = new class65(4);

    @OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
    private static int field2758 = 0;

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "I")
    public static int field2733;

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "I")
    public static int field2737;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "I")
    public static int field2748;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "Laaa;")
    private static class617 field2749;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "Lvfa;")
    private static class672 field2739;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "Lvfa;")
    private static class672 field2746;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "[I")
    private static int[] field2753;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "[Ljava/lang/String;")
    private static String[] field2751;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZ)V", line = 2)
    public static final void method1247(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lca;I)V", line = 9)
    private static final void method1248(class309 arg0, int arg1) {
        Object[] var2 = arg0.field4439;
        int var3 = (Integer) var2[0];
        class270 var4 = class469.method2645(var3, -7550);
        if (var4 == null) {
            return;
        }
        field2753 = new int[var4.field3777];
        int var5 = 0;
        field2751 = new String[var4.field3782];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field4443;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field4437;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field4435 == null ? -1 : arg0.field4435.field9200;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field4438;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field4435 == null ? -1 : arg0.field4435.field9277;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field4444 == null ? -1 : arg0.field4444.field9200;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field4444 == null ? -1 : arg0.field4444.field9277;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field4448;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field4449;
                }
                field2753[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field4445;
                }
                field2751[var6++] = var9;
            }
        }
        field2758 = arg0.field4436;
        method1254(var4, arg1);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Lca;)V", line = 88)
    public static final void method1249(class309 arg0) {
        method1248(arg0, 200000);
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(IZ)V", line = 92)
    private static final void method1250(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field2732[field2744++] = class719.field10021;
                return;
            }
            if (arg0 == 5001) {
                field2744 -= 3;
                class719.field10021 = field2732[field2744];
                class163.field2473 = class402.method2365(field2732[field2744 + 1], (byte) -59);
                if (class163.field2473 == null) {
                    class163.field2473 = class163.field2466;
                }
                class730.field10124 = field2732[field2744 + 2];
                field2757++;
                class583 var2 = class381.method2246(1, class128.field2105, class639.field8476);
                var2.field7637.method3823(-121, class719.field10021);
                var2.field7637.method3823(-44, class163.field2473.field9857);
                var2.field7637.method3823(-86, class730.field10124);
                class42.method309(var2, 0);
                return;
            }
            if (arg0 == 5002) {
                field2736 -= 2;
                String var3 = field2755[field2736];
                String var4 = field2755[field2736 + 1];
                field2744 -= 2;
                int var5 = field2732[field2744];
                int var6 = field2732[field2744 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field2750++;
                class583 var7 = class381.method2246(1, class128.field2105, class204.field3061);
                var7.field7637.method3823(-85, class419.method2429(true, var3) + class419.method2429(true, var4) + 2);
                var7.field7637.method3795(var3, (byte) -78);
                var7.field7637.method3823(-39, var5 - 1);
                var7.field7637.method3823(-69, var6);
                var7.field7637.method3795(var4, (byte) -114);
                class42.method309(var7, 0);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field2732[--field2744];
                class654 var9 = class552.method3077(false, var8);
                String var10 = "";
                if (var9 != null && var9.field8666 != null) {
                    var10 = var9.field8666;
                }
                field2755[field2736++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field2732[--field2744];
                class654 var12 = class552.method3077(false, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field8673;
                }
                field2732[field2744++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class163.field2473 == null) {
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = class163.field2473.field9857;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field2732[--field2744];
                class583 var15 = class381.method2246(1, class128.field2105, class390.field5458);
                var15.field7637.method3823(-37, var14);
                class42.method309(var15, 0);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field2755[--field2736];
                method1252(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field2736 -= 2;
                String var17 = field2755[field2736];
                String var18 = field2755[field2736 + 1];
                if (class257.field3521 != 0 || (!class375.field5199 || class662.field8730) && !class433.field5956) {
                    field2734++;
                    class583 var19 = class381.method2246(1, class128.field2105, class31.field488);
                    var19.field7637.method3823(-55, 0);
                    int var20 = var19.field7637.field9419;
                    var19.field7637.method3795(var17, (byte) -108);
                    class393.method2325((byte) -98, var19.field7637, var18);
                    var19.field7637.method3828(-20198, var19.field7637.field9419 - var20);
                    class42.method309(var19, 0);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field2732[--field2744];
                class654 var22 = class552.method3077(false, var21);
                String var23 = "";
                if (var22 != null && var22.field8662 != null) {
                    var23 = var22.field8662;
                }
                field2755[field2736++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field2732[--field2744];
                class654 var25 = class552.method3077(false, var24);
                String var26 = "";
                if (var25 != null && var25.field8669 != null) {
                    var26 = var25.field8669;
                }
                field2755[field2736++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field2732[--field2744];
                class654 var28 = class552.method3077(false, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field8660;
                }
                field2732[field2744++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class472.field6475 == null || class472.field6475.field5339 == null) {
                    var30 = "";
                } else {
                    var30 = class472.field6475.method2267(-116, true);
                }
                field2755[field2736++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field2732[field2744++] = class730.field10124;
                return;
            }
            if (arg0 == 5017) {
                field2732[field2744++] = class287.method1778((byte) 106);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field2732[--field2744];
                class654 var32 = class552.method3077(false, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field8664;
                }
                field2732[field2744++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field2732[--field2744];
                class654 var35 = class552.method3077(false, var34);
                String var36 = "";
                if (var35 != null && var35.field8668 != null) {
                    var36 = var35.field8668;
                }
                field2755[field2736++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class472.field6475 == null || class472.field6475.field5339 == null) {
                    var37 = "";
                } else {
                    var37 = class472.field6475.method2264((byte) -113, false);
                }
                field2755[field2736++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field2732[--field2744];
                class654 var39 = class552.method3077(false, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field8663;
                }
                field2732[field2744++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field2732[--field2744];
                class654 var42 = class552.method3077(false, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field8661;
                }
                field2732[field2744++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field2732[--field2744];
                class654 var45 = class552.method3077(false, var44);
                String var46 = "";
                if (var45 != null && var45.field8657 != null) {
                    var46 = var45.field8657;
                }
                field2755[field2736++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field2732[--field2744];
                field2755[field2736++] = class114.field1871.method2096(15076, var47).field405;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field2732[--field2744];
                class24 var49 = class114.field1871.method2096(15076, var48);
                if (var49.field409 == null) {
                    field2732[field2744++] = 0;
                    return;
                }
                field2732[field2744++] = var49.field409.length;
                return;
            }
            if (arg0 == 5052) {
                field2744 -= 2;
                int var50 = field2732[field2744];
                int var51 = field2732[field2744 + 1];
                class24 var52 = class114.field1871.method2096(15076, var50);
                int var53 = var52.field409[var51];
                field2732[field2744++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field2732[--field2744];
                class24 var55 = class114.field1871.method2096(15076, var54);
                if (var55.field408 == null) {
                    field2732[field2744++] = 0;
                    return;
                }
                field2732[field2744++] = var55.field408.length;
                return;
            }
            if (arg0 == 5054) {
                field2744 -= 2;
                int var56 = field2732[field2744];
                int var57 = field2732[field2744 + 1];
                field2732[field2744++] = class114.field1871.method2096(15076, var56).field408[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field2732[--field2744];
                field2755[field2736++] = class658.field8695.method3326(true, var58).method2485(false);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field2732[--field2744];
                class430 var60 = class658.field8695.method3326(true, var59);
                if (var60.field5924 == null) {
                    field2732[field2744++] = 0;
                    return;
                }
                field2732[field2744++] = var60.field5924.length;
                return;
            }
            if (arg0 == 5057) {
                field2744 -= 2;
                int var61 = field2732[field2744];
                int var62 = field2732[field2744 + 1];
                field2732[field2744++] = class658.field8695.method3326(true, var61).field5924[var62];
                return;
            }
            if (arg0 == 5058) {
                field2749 = new class617();
                field2749.field8249 = field2732[--field2744];
                field2749.field8243 = class658.field8695.method3326(true, field2749.field8249);
                field2749.field8244 = new int[field2749.field8243.method2484(-1)];
                return;
            }
            if (arg0 == 5059) {
                field2748++;
                class583 var63 = class381.method2246(1, class128.field2105, class354.field4990);
                var63.field7637.method3823(-20, 0);
                int var64 = var63.field7637.field9419;
                var63.field7637.method3823(-85, 0);
                var63.field7637.method3831(1182, field2749.field8249);
                field2749.field8243.method2480(var63.field7637, (byte) 77, field2749.field8244);
                var63.field7637.method3828(-20198, var63.field7637.field9419 - var64);
                class42.method309(var63, 0);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field2755[--field2736];
                field2740++;
                class583 var66 = class381.method2246(1, class128.field2105, class66.field822);
                var66.field7637.method3823(-25, 0);
                int var67 = var66.field7637.field9419;
                var66.field7637.method3795(var65, (byte) -65);
                var66.field7637.method3831(1182, field2749.field8249);
                field2749.field8243.method2480(var66.field7637, (byte) 77, field2749.field8244);
                var66.field7637.method3828(-20198, var66.field7637.field9419 - var67);
                class42.method309(var66, 0);
                return;
            }
            if (arg0 == 5061) {
                field2748++;
                class583 var68 = class381.method2246(1, class128.field2105, class354.field4990);
                var68.field7637.method3823(-91, 0);
                int var69 = var68.field7637.field9419;
                var68.field7637.method3823(-116, 1);
                var68.field7637.method3831(1182, field2749.field8249);
                field2749.field8243.method2480(var68.field7637, (byte) 77, field2749.field8244);
                var68.field7637.method3828(-20198, var68.field7637.field9419 - var69);
                class42.method309(var68, 0);
                return;
            }
            if (arg0 == 5062) {
                field2744 -= 2;
                int var70 = field2732[field2744];
                int var71 = field2732[field2744 + 1];
                field2732[field2744++] = class114.field1871.method2096(15076, var70).field413[var71];
                return;
            }
            if (arg0 == 5063) {
                field2744 -= 2;
                int var72 = field2732[field2744];
                int var73 = field2732[field2744 + 1];
                field2732[field2744++] = class114.field1871.method2096(15076, var72).field407[var73];
                return;
            }
            if (arg0 == 5064) {
                field2744 -= 2;
                int var74 = field2732[field2744];
                int var75 = field2732[field2744 + 1];
                if (var75 == -1) {
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = class114.field1871.method2096(15076, var74).method236((char) var75, 4137);
                return;
            }
            if (arg0 == 5065) {
                field2744 -= 2;
                int var76 = field2732[field2744];
                int var77 = field2732[field2744 + 1];
                if (var77 == -1) {
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = class114.field1871.method2096(15076, var76).method239((byte) 101, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field2732[--field2744];
                field2732[field2744++] = class658.field8695.method3326(true, var78).method2484(-1);
                return;
            }
            if (arg0 == 5067) {
                field2744 -= 2;
                int var79 = field2732[field2744];
                int var80 = field2732[field2744 + 1];
                int var81 = class658.field8695.method3326(true, var79).method2483(false, var80).field3831;
                field2732[field2744++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field2744 -= 2;
                int var82 = field2732[field2744];
                int var83 = field2732[field2744 + 1];
                field2749.field8244[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field2744 -= 2;
                int var84 = field2732[field2744];
                int var85 = field2732[field2744 + 1];
                field2749.field8244[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field2744 -= 3;
                int var86 = field2732[field2744];
                int var87 = field2732[field2744 + 1];
                int var88 = field2732[field2744 + 2];
                class430 var89 = class658.field8695.method3326(true, var86);
                if (var89.method2483(false, var87).field3831 != 0) {
                    throw new RuntimeException("bad command");
                }
                field2732[field2744++] = var89.method2481(var87, var88, (byte) -107);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field2755[--field2736];
                boolean var91 = field2732[--field2744] == 1;
                class694.method3905(var90, 2, var91);
                field2732[field2744++] = class284.field4022;
                return;
            }
            if (arg0 == 5072) {
                if (class468.field6429 != null && class80.field964 < class284.field4022) {
                    field2732[field2744++] = class468.field6429[class80.field964++] & 0xFFFF;
                    return;
                }
                field2732[field2744++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class80.field964 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class153.field2345.method2313(true, 86)) {
                    field2732[field2744++] = 1;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class153.field2345.method2313(true, 82)) {
                    field2732[field2744++] = 1;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class153.field2345.method2313(true, 81)) {
                    field2732[field2744++] = 1;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class105.method781(false, field2732[--field2744]);
                return;
            }
            if (arg0 == 5201) {
                field2732[field2744++] = class300.method1843((byte) 114);
                return;
            }
            if (arg0 == 5205) {
                class491.method2783(-1, false, -2753, field2732[--field2744], -1);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field2732[--field2744];
                class640 var93 = class744.method4155(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = var93.field8490;
                return;
            }
            if (arg0 == 5207) {
                class640 var94 = class744.method4168(field2732[--field2744]);
                if (var94 != null && var94.field8493 != null) {
                    field2755[field2736++] = var94.field8493;
                    return;
                }
                field2755[field2736++] = "";
                return;
            }
            if (arg0 == 5208) {
                field2732[field2744++] = class613.field8163;
                field2732[field2744++] = class703.field9754;
                return;
            }
            if (arg0 == 5209) {
                field2732[field2744++] = class744.field10370 + class194.field2929;
                field2732[field2744++] = class744.field10371 + class432.field5949;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field2732[--field2744];
                class640 var96 = class744.method4168(var95);
                if (var96 == null) {
                    field2732[field2744++] = 0;
                    field2732[field2744++] = 0;
                    return;
                }
                field2732[field2744++] = var96.field8486 >> 14 & 0x3FFF;
                field2732[field2744++] = var96.field8486 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field2732[--field2744];
                class640 var98 = class744.method4168(var97);
                if (var98 == null) {
                    field2732[field2744++] = 0;
                    field2732[field2744++] = 0;
                    return;
                }
                field2732[field2744++] = var98.field8483 - var98.field8492;
                field2732[field2744++] = var98.field8496 - var98.field8482;
                return;
            }
            if (arg0 == 5212) {
                class630 var99 = class474.method2669((byte) -91);
                if (var99 == null) {
                    field2732[field2744++] = -1;
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = var99.field8387;
                int var100 = var99.field8388 << 28 | class744.field10370 + var99.field8396 << 14 | class744.field10371 + var99.field8390;
                field2732[field2744++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class630 var101 = class506.method2842((byte) -24);
                if (var101 == null) {
                    field2732[field2744++] = -1;
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = var101.field8387;
                int var102 = var101.field8388 << 28 | class744.field10370 + var101.field8396 << 14 | class744.field10371 + var101.field8390;
                field2732[field2744++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field2732[--field2744];
                class640 var104 = class339.method2037(125);
                if (var104 != null) {
                    boolean var105 = var104.method3505(field2747, var103 >> 14 & 0x3FFF, var103 & 0x3FFF, var103 >> 28 & 0x3, 0);
                    if (var105) {
                        class721.method4054(field2747[2], field2747[1], (byte) -87);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field2744 -= 2;
                int var106 = field2732[field2744];
                int var107 = field2732[field2744 + 1];
                class721 var108 = class744.method4160(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class640 var110 = (class640) var108.method4051(896); var110 != null; var110 = (class640) var108.method4049(true)) {
                    if (var110.field8490 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field2732[field2744++] = 1;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field2732[--field2744];
                class640 var112 = class744.method4168(var111);
                if (var112 == null) {
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = var112.field8495;
                return;
            }
            if (arg0 == 5220) {
                field2732[field2744++] = class178.field2687 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field2732[--field2744];
                class721.method4054(var113 & 0x3FFF, var113 >> 14 & 0x3FFF, (byte) -87);
                return;
            }
            if (arg0 == 5222) {
                class640 var114 = class339.method2037(123);
                if (var114 != null) {
                    boolean var115 = var114.method3507(class744.field10370 + class194.field2929, class744.field10371 + class432.field5949, -95, field2747);
                    if (var115) {
                        field2732[field2744++] = field2747[1];
                        field2732[field2744++] = field2747[2];
                        return;
                    }
                    field2732[field2744++] = -1;
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = -1;
                field2732[field2744++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field2744 -= 2;
                int var116 = field2732[field2744];
                int var117 = field2732[field2744 + 1];
                class491.method2783(var117 & 0x3FFF, false, -2753, var116, var117 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field2732[--field2744];
                class640 var119 = class339.method2037(124);
                if (var119 != null) {
                    boolean var120 = var119.method3505(field2747, var118 >> 14 & 0x3FFF, var118 & 0x3FFF, var118 >> 28 & 0x3, 0);
                    if (var120) {
                        field2732[field2744++] = field2747[1];
                        field2732[field2744++] = field2747[2];
                        return;
                    }
                    field2732[field2744++] = -1;
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = -1;
                field2732[field2744++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field2732[--field2744];
                class640 var122 = class339.method2037(124);
                if (var122 != null) {
                    boolean var123 = var122.method3507(var121 >> 14 & 0x3FFF, var121 & 0x3FFF, -112, field2747);
                    if (var123) {
                        field2732[field2744++] = field2747[1];
                        field2732[field2744++] = field2747[2];
                        return;
                    }
                    field2732[field2744++] = -1;
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = -1;
                field2732[field2744++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class711.method3994(6408, field2732[--field2744]);
                return;
            }
            if (arg0 == 5227) {
                field2744 -= 2;
                int var124 = field2732[field2744];
                int var125 = field2732[field2744 + 1];
                class491.method2783(var125 & 0x3FFF, true, -2753, var124, var125 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class442.field6098 = field2732[--field2744] == 1;
                return;
            }
            if (arg0 == 5229) {
                field2732[field2744++] = class442.field6098 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field2732[--field2744];
                class100.method752((byte) -120, var126);
                return;
            }
            if (arg0 == 5231) {
                field2744 -= 2;
                int var127 = field2732[field2744];
                boolean var128 = field2732[field2744 + 1] == 1;
                if (class8.field160 != null) {
                    class656 var129 = class8.field160.method2135((long) var127, (byte) 31);
                    if (var129 != null && !var128) {
                        var129.method3564(true);
                        return;
                    }
                    if (var129 == null && var128) {
                        class656 var130 = new class656();
                        class8.field160.method2143(-1, var130, (long) var127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field2732[--field2744];
                if (class8.field160 != null) {
                    class656 var132 = class8.field160.method2135((long) var131, (byte) 31);
                    field2732[field2744++] = var132 == null ? 0 : 1;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field2744 -= 2;
                int var133 = field2732[field2744];
                boolean var134 = field2732[field2744 + 1] == 1;
                if (class112.field1850 != null) {
                    class656 var135 = class112.field1850.method2135((long) var133, (byte) 31);
                    if (var135 != null && !var134) {
                        var135.method3564(true);
                        return;
                    }
                    if (var135 == null && var134) {
                        class656 var136 = new class656();
                        class112.field1850.method2143(-1, var136, (long) var133);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field2732[--field2744];
                if (class112.field1850 != null) {
                    class656 var138 = class112.field1850.method2135((long) var137, (byte) 31);
                    field2732[field2744++] = var138 == null ? 0 : 1;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field2732[field2744++] = class744.field10336 == null ? -1 : class744.field10336.field8490;
                return;
            }
            if (arg0 == 5236) {
                field2744 -= 2;
                int var139 = field2732[field2744];
                int var140 = field2732[field2744 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class643.method3528(var142, var139, true, var141);
                if (var143 < 0) {
                    field2732[field2744++] = -1;
                    return;
                }
                field2732[field2744++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class273.method1641(-15074);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field2744 -= 2;
                int var144 = field2732[field2744];
                int var145 = field2732[field2744 + 1];
                class554.method3084(false, 3, var145, var144, -1);
                field2732[field2744++] = class200.field3012 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class200.field3012 != null) {
                    class554.method3084(false, class411.field5711.field3901.method2537(true), -1, -1, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class565[] var146 = class135.method1058(false);
                field2732[field2744++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field2732[--field2744];
                class565[] var148 = class135.method1058(false);
                field2732[field2744++] = var148[var147].field7432;
                field2732[field2744++] = var148[var147].field7431;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class418.field5772;
                int var150 = class43.field559;
                int var151 = -1;
                class565[] var152 = class135.method1058(false);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class565 var154 = var152[var153];
                    if (var154.field7432 == var149 && var154.field7431 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field2732[field2744++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field2732[field2744++] = class343.method2050((byte) -112);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field2732[--field2744];
                if (var155 >= 1 && var155 <= 2) {
                    class554.method3084(false, var155, -1, -1, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field2732[field2744++] = class411.field5711.field3901.method2537(true);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field2732[--field2744];
                if (var156 >= 1 && var156 <= 2) {
                    class411.field5711.method1677(class411.field5711.field3901, (byte) -71, var156);
                    class411.field5711.method1677(class411.field5711.field3909, (byte) -71, var156);
                    class2.method15(17458);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field2736 -= 2;
                String var157 = field2755[field2736];
                String var158 = field2755[field2736 + 1];
                int var159 = field2732[--field2744];
                field2741++;
                class583 var160 = class381.method2246(1, class128.field2105, class746.field10378);
                var160.field7637.method3823(-119, class419.method2429(true, var157) + class419.method2429(true, var158) + 1);
                var160.field7637.method3795(var157, (byte) -93);
                var160.field7637.method3795(var158, (byte) -74);
                var160.field7637.method3823(-92, var159);
                class42.method309(var160, 0);
                return;
            }
            if (arg0 == 5401) {
                field2744 -= 2;
                class393.field5486[field2732[field2744]] = (short) class592.method3223(field2732[field2744 + 1], (byte) 113);
                class77.field948.method1166(-90);
                class77.field948.method1175((byte) 103);
                class292.field4177.method2357((byte) -119);
                class312.method1915(-101);
                return;
            }
            if (arg0 == 5405) {
                field2744 -= 2;
                int var161 = field2732[field2744];
                int var162 = field2732[field2744 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class347.field4869[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field2744 -= 7;
                int var163 = field2732[field2744];
                int var164 = field2732[field2744 + 1] << 1;
                int var165 = field2732[field2744 + 2];
                int var166 = field2732[field2744 + 3];
                int var167 = field2732[field2744 + 4];
                int var168 = field2732[field2744 + 5];
                int var169 = field2732[field2744 + 6];
                if (var163 >= 0 && var163 < 2 && class347.field4869[var163] != null && var164 >= 0 && var164 < class347.field4869[var163].length) {
                    class347.field4869[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class347.field4869[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class347.field4869[field2732[--field2744]].length >> 1;
                field2732[field2744++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class200.field3012 != null) {
                    class554.method3084(false, class411.field5711.field3901.method2537(true), -1, -1, -1);
                }
                if (class218.field3143 != null) {
                    class654.method3560((byte) -83);
                    System.exit(0);
                    return;
                }
                String var171 = class277.field3865 == null ? class327.method1976(-1) : class277.field3865;
                class56.method374(var171, 0, class411.field5711.field3913.method3282(true) == 1, class66.field828, false);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class112.field1854 != null) {
                    if (class112.field1854.field2986 == null) {
                        var172 = class401.method2360((byte) -80, class112.field1854.field2983);
                    } else {
                        var172 = (String) class112.field1854.field2986;
                    }
                }
                field2755[field2736++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field2732[field2744++] = class66.field828.field2892 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class200.field3012 != null) {
                    class554.method3084(false, class411.field5711.field3901.method2537(true), -1, -1, -1);
                }
                String var173 = field2755[--field2736];
                boolean var174 = field2732[--field2744] == 1;
                String var175 = class327.method1976(-1) + var173;
                class56.method374(var175, 0, class411.field5711.field3913.method3282(true) == 1, class66.field828, var174);
                return;
            }
            if (arg0 == 5422) {
                field2736 -= 2;
                String var176 = field2755[field2736];
                String var177 = field2755[field2736 + 1];
                int var178 = field2732[--field2744];
                if (var176.length() > 0) {
                    if (class407.field5654 == null) {
                        class407.field5654 = new String[class550.field7260[class683.field9532.field10627]];
                    }
                    class407.field5654[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class703.field9751 == null) {
                        class703.field9751 = new String[class550.field7260[class683.field9532.field10627]];
                    }
                    class703.field9751[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field2755[--field2736]);
                return;
            }
            if (arg0 == 5424) {
                field2744 -= 11;
                class591.field7695 = field2732[field2744];
                class540.field7153 = field2732[field2744 + 1];
                class186.field2819 = field2732[field2744 + 2];
                class29.field476 = field2732[field2744 + 3];
                class300.field4269 = field2732[field2744 + 4];
                class756.field10507 = field2732[field2744 + 5];
                class190.field2870 = field2732[field2744 + 6];
                class276.field3853 = field2732[field2744 + 7];
                class410.field5689 = field2732[field2744 + 8];
                class117.field1893 = field2732[field2744 + 9];
                class117.field1888 = field2732[field2744 + 10];
                class84.field1023.method2216(class300.field4269, -126);
                class84.field1023.method2216(class756.field10507, -80);
                class84.field1023.method2216(class190.field2870, 77);
                class84.field1023.method2216(class276.field3853, 91);
                class84.field1023.method2216(class410.field5689, -115);
                class48.field608 = null;
                class85.field1030 = null;
                class314.field4486 = null;
                class295.field4222 = null;
                class588.field7676 = null;
                class575.field7552 = null;
                class4.field119 = null;
                class164.field2491 = null;
                class743.field10329 = true;
                return;
            }
            if (arg0 == 5425) {
                class230.method1464(5123);
                class743.field10329 = false;
                return;
            }
            if (arg0 == 5426) {
                field2744 -= 2;
                class430.field5934 = field2732[field2744];
                class456.field6235 = field2732[field2744 + 1];
                return;
            }
            if (arg0 == 5427) {
                field2744 -= 2;
                class339.field4797 = field2732[field2744 + 1];
                return;
            }
            if (arg0 == 5428) {
                field2744 -= 2;
                int var179 = field2732[field2744];
                int var180 = field2732[field2744 + 1];
                field2732[field2744++] = class552.method3079(-12599, var179, var180) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class195.method1331(false, false, false, field2755[--field2736]);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class124.method987("accountcreated", -8364, class514.field6818);
                    return;
                } catch (Throwable var326) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class124.method987("accountcreatestarted", -8364, class514.field6818);
                    return;
                } catch (Throwable var327) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class710.field9837 != null) {
                    Transferable var182 = class710.field9837.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var328) {
                        }
                    }
                }
                field2755[field2736++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class434.field5977 = field2732[--field2744];
                return;
            }
            if (arg0 == 5435) {
                field2732[field2744++] = class358.field4998 ? 1 : 0;
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field2744 -= 4;
                int var183 = field2732[field2744];
                int var184 = field2732[field2744 + 1];
                int var185 = field2732[field2744 + 2];
                int var186 = field2732[field2744 + 3];
                class725.method4081(false, (byte) -118, var185, (var183 & 0x3FFF) - class334.field4757, var186, var184 << 2, (var183 >> 14 & 0x3FFF) - class503.field6752);
                return;
            }
            if (arg0 == 5501) {
                field2744 -= 4;
                int var187 = field2732[field2744];
                int var188 = field2732[field2744 + 1];
                int var189 = field2732[field2744 + 2];
                int var190 = field2732[field2744 + 3];
                class207.method1381(var189, var188 << 2, var190, (var187 & 0x3FFF) - class334.field4757, (var187 >> 14 & 0x3FFF) - class503.field6752, 124);
                return;
            }
            if (arg0 == 5502) {
                field2744 -= 6;
                int var191 = field2732[field2744];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class20.field337 = var191;
                int var192 = field2732[field2744 + 1];
                if (var192 + 1 >= class347.field4869[class20.field337].length >> 1) {
                    throw new RuntimeException();
                }
                class284.field4015 = var192;
                class465.field6408 = 0;
                class727.field10097 = field2732[field2744 + 2];
                class525.field6964 = field2732[field2744 + 3];
                int var193 = field2732[field2744 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class5.field132 = var193;
                int var194 = field2732[field2744 + 5];
                if (var194 + 1 >= class347.field4869[class5.field132].length >> 1) {
                    throw new RuntimeException();
                }
                class41.field549 = var194;
                class278.field3898 = 3;
                class12.field193 = -1;
                class264.field3680 = -1;
                return;
            }
            if (arg0 == 5503) {
                class272.method1633((byte) 77);
                return;
            }
            if (arg0 == 5504) {
                field2744 -= 2;
                class164.method1178(field2732[field2744 + 1], field2732[field2744], false, 0);
                return;
            }
            if (arg0 == 5505) {
                field2732[field2744++] = (int) class578.field7586 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field2732[field2744++] = (int) class547.field7230 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class211.method1398((byte) -90);
                return;
            }
            if (arg0 == 5508) {
                class28.method255((byte) 125);
                return;
            }
            if (arg0 == 5509) {
                class77.method621((byte) 3);
                return;
            }
            if (arg0 == 5510) {
                class465.method2637(110);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field2732[--field2744];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class503.field6752;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class719.field10004) {
                    var198 = class719.field10004;
                }
                int var199 = var197 - class334.field4757;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class107.field1453) {
                    var199 = class107.field1453;
                }
                class513.field6808 = (var198 << 9) + 256;
                class248.field3439 = (var199 << 9) + 256;
                class278.field3898 = 4;
                class12.field193 = -1;
                class264.field3680 = -1;
                return;
            }
            if (arg0 == 5512) {
                class265.method1605(-1);
                return;
            }
            if (arg0 == 5514) {
                class100.field1299 = field2732[--field2744];
                return;
            }
            if (arg0 == 5516) {
                field2732[field2744++] = class100.field1299;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field2732[--field2744];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class503.field6752;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class719.field10004) {
                        var203 = class719.field10004;
                    }
                    int var204 = var202 - class334.field4757;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class107.field1453) {
                        var204 = class107.field1453;
                    }
                    class264.field3680 = (var203 << 9) + 256;
                    class12.field193 = (var204 << 9) + 256;
                    return;
                }
                class264.field3680 = -1;
                class12.field193 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field2736 -= 2;
                String var205 = field2755[field2736];
                String var206 = field2755[field2736 + 1];
                int var207 = field2732[--field2744];
                if (var205.length() > 320) {
                    return;
                }
                if (class15.field215 != 3) {
                    return;
                }
                if (class597.field7823 == 0 && class594.field7712 == 0) {
                    class371.field5166 = var205;
                    class416.field5739 = var206;
                    class758.field10539 = var207;
                    class66.method566(6, -21035);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class66.method568(881726188);
                return;
            }
            if (arg0 == 5602) {
                if (class597.field7823 == 0) {
                    class535.field7044 = -2;
                    class299.field4249 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field2736--;
                if (class15.field215 != 3) {
                    return;
                }
                if (class597.field7823 == 0 && class594.field7712 == 0) {
                    class175.method1224(field2755[field2736], 0);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field2736 -= 2;
                field2744 -= 2;
                if (class15.field215 != 3) {
                    return;
                }
                if (class597.field7823 == 0 && class594.field7712 == 0) {
                    class107.method785(field2755[field2736 + 1], -27314, field2755[field2736], field2732[field2744 + 1] == 1, field2732[field2744]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class594.field7712 == 0) {
                    class31.field489 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field2732[field2744++] = class299.field4249;
                return;
            }
            if (arg0 == 5608) {
                field2732[field2744++] = class283.field3999;
                return;
            }
            if (arg0 == 5609) {
                field2732[field2744++] = class31.field489;
                return;
            }
            if (arg0 == 5611) {
                field2732[field2744++] = class300.field4264;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field2732[--field2744];
                if (class15.field215 != 7) {
                    return;
                }
                if (class597.field7823 == 0 && class594.field7712 == 0) {
                    if (class209.field3089 != null) {
                        class209.field3089.method1439(-1);
                        class209.field3089 = null;
                    }
                    class758.field10539 = var208;
                    class66.method566(9, -21035);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field2732[field2744++] = class299.field4249;
                return;
            }
            if (arg0 == 5615) {
                field2736 -= 2;
                String var209 = field2755[field2736];
                String var210 = field2755[field2736 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class15.field215 != 3) {
                    return;
                }
                if (class597.field7823 == 0 && class594.field7712 == 0) {
                    if (class209.field3089 != null) {
                        class209.field3089.method1439(-1);
                        class209.field3089 = null;
                    }
                    class371.field5166 = var209;
                    class416.field5739 = var210;
                    class66.method566(5, -21035);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class339.method2036(121, false);
                return;
            }
            if (arg0 == 5617) {
                field2732[field2744++] = class535.field7044;
                return;
            }
            if (arg0 == 5618) {
                field2744--;
                return;
            }
            if (arg0 == 5619) {
                field2744--;
                return;
            }
            if (arg0 == 5620) {
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field2736 -= 2;
                field2744 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class677.field9393 != null) {
                    field2732[field2744++] = 1;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field2732[field2744++] = (int) (class310.field4461 >> 32);
                field2732[field2744++] = (int) (class310.field4461 & 0xFFFFFFFFFFFFFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field2732[field2744++] = class574.field7531 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class574.field7531 = true;
                class513.method2865(-3);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field2732[--field2744];
                class411.field5711.method1677(class411.field5711.field3893, (byte) -71, var211);
                class436.method2508((byte) 122);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field2732[--field2744] == 1;
                class411.field5711.method1677(class411.field5711.field3908, (byte) -71, var212 ? 1 : 0);
                class411.field5711.method1677(class411.field5711.field3890, (byte) -71, var212 ? 1 : 0);
                class436.method2508((byte) 125);
                class393.method2322(-1);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field2732[--field2744] == 1;
                class411.field5711.method1677(class411.field5711.field3882, (byte) -71, var213 ? 2 : 1);
                class411.field5711.method1677(class411.field5711.field3888, (byte) -71, var213 ? 2 : 1);
                class393.method2322(-1);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6005) {
                class411.field5711.method1677(class411.field5711.field3904, (byte) -71, field2732[--field2744] == 1 ? 1 : 0);
                class436.method2508((byte) 123);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6007) {
                class411.field5711.method1677(class411.field5711.field3879, (byte) -71, field2732[--field2744]);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6008) {
                class411.field5711.method1677(class411.field5711.field3869, (byte) -71, field2732[--field2744] == 1 ? 1 : 0);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6010) {
                class411.field5711.method1677(class411.field5711.field3918, (byte) -71, field2732[--field2744] == 1 ? 1 : 0);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6011) {
                class411.field5711.method1677(class411.field5711.field3897, (byte) -71, field2732[--field2744]);
                class436.method2508((byte) 125);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6012) {
                class411.field5711.method1677(class411.field5711.field3902, (byte) -71, field2732[--field2744] == 1 ? 1 : 0);
                class505.method2837((byte) 125);
                class320.method1940(1);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6014) {
                class411.field5711.method1677(class411.field5711.field3915, (byte) -71, field2732[--field2744] == 1 ? 2 : 0);
                class436.method2508((byte) 122);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6015) {
                class411.field5711.method1677(class411.field5711.field3884, (byte) -71, field2732[--field2744] == 1 ? 1 : 0);
                class436.method2508((byte) 127);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6016) {
                class411.field5711.method1677(class411.field5711.field3912, (byte) -71, field2732[--field2744]);
                class421.method2435(false, 79, class411.field5711.field3913.method3282(true));
                class2.method15(17458);
                return;
            }
            if (arg0 == 6017) {
                class411.field5711.method1677(class411.field5711.field3875, (byte) -71, field2732[--field2744] == 1 ? 1 : 0);
                class235.method1482((byte) -117);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6018) {
                class411.field5711.method1677(class411.field5711.field3887, (byte) -71, field2732[--field2744]);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field2732[--field2744];
                int var215 = class411.field5711.field3899.method2432(true);
                if (var214 != var215) {
                    if (class574.method3162((byte) 13, class15.field215)) {
                        if (var215 == 0 && class453.field6192 != -1) {
                            class238.method1498(false, 101, class453.field6192, 0, var214, class165.field2501);
                            class390.method2314(false);
                            class122.field1996 = false;
                        } else if (var214 == 0) {
                            class80.method631(1);
                            class122.field1996 = false;
                        } else {
                            class409.method2389(var214, 16);
                        }
                    }
                    class411.field5711.method1677(class411.field5711.field3899, (byte) -71, var214);
                    class2.method15(17458);
                    class41.field548 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class411.field5711.method1677(class411.field5711.field3880, (byte) -71, field2732[--field2744]);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class411.field5711.field3882.method1289(true);
                class411.field5711.method1677(class411.field5711.field3888, (byte) -71, field2732[--field2744] == 1 ? 0 : var216);
                class393.method2322(-1);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field2732[--field2744];
                class411.field5711.method1677(class411.field5711.field3911, (byte) -71, var217);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6024) {
                class411.field5711.method1677(class411.field5711.field3895, (byte) -71, field2732[--field2744]);
                class2.method15(17458);
                return;
            }
            if (arg0 == 6025) {
                class411.field5711.method1677(class411.field5711.field3891, (byte) -71, field2732[--field2744]);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field2732[--field2744];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class438.method2519(86, var218 == 1);
                return;
            }
            if (arg0 == 6028) {
                class411.field5711.method1677(class411.field5711.field3872, (byte) -71, field2732[--field2744] == 0 ? 0 : 1);
                class2.method15(17458);
                return;
            }
            if (arg0 == 6029) {
                class411.field5711.method1677(class411.field5711.field3879, (byte) -71, field2732[--field2744]);
                class2.method15(17458);
                return;
            }
            if (arg0 == 6030) {
                class411.field5711.method1677(class411.field5711.field3900, (byte) -71, field2732[--field2744] == 0 ? 0 : 1);
                class2.method15(17458);
                class436.method2508((byte) 127);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field2732[--field2744];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class421.method2435(false, -45, var219);
                return;
            }
            if (arg0 == 6032) {
                field2744 -= 2;
                int var220 = field2732[field2744];
                boolean var221 = field2732[field2744 + 1] == 1;
                class411.field5711.method1677(class411.field5711.field3877, (byte) -71, var220);
                if (!var221) {
                    class411.field5711.method1677(class411.field5711.field3903, (byte) -71, 0);
                }
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6033) {
                class411.field5711.method1677(class411.field5711.field3873, (byte) -71, field2732[--field2744]);
                class2.method15(17458);
                return;
            }
            if (arg0 == 6034) {
                class411.field5711.method1677(class411.field5711.field3868, (byte) -71, field2732[--field2744] == 1 ? 1 : 0);
                class2.method15(17458);
                class505.method2837((byte) 121);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class411.field5711.field3908.method984(true);
                class411.field5711.method1677(class411.field5711.field3890, (byte) -71, field2732[--field2744] == 1 ? 1 : var222);
                class436.method2508((byte) 123);
                class393.method2322(-1);
                return;
            }
            if (arg0 == 6036) {
                class411.field5711.method1677(class411.field5711.field3874, (byte) -71, field2732[--field2744]);
                class2.method15(17458);
                class50.field641 = true;
                return;
            }
            if (arg0 == 6037) {
                class411.field5711.method1677(class411.field5711.field3894, (byte) -71, field2732[--field2744]);
                class2.method15(17458);
                class41.field548 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field2732[--field2744];
                int var224 = class411.field5711.field3917.method2432(true);
                if (var223 != var224 && class453.field6192 == class450.field6169) {
                    if (!class574.method3162((byte) 13, class15.field215)) {
                        if (var224 == 0) {
                            class238.method1498(false, 74, class453.field6192, 0, var223, class165.field2501);
                            class390.method2314(false);
                            class122.field1996 = false;
                        } else if (var223 == 0) {
                            class80.method631(1);
                            class122.field1996 = false;
                        } else {
                            class409.method2389(var223, 16);
                        }
                    }
                    class411.field5711.method1677(class411.field5711.field3917, (byte) -71, var223);
                    class2.method15(17458);
                    class41.field548 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field2732[--field2744];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class411.field5711.field3889.method3061(true)) {
                    class411.field5711.method1677(class411.field5711.field3889, (byte) -71, var225);
                    class2.method15(17458);
                    class41.field548 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field2732[--field2744];
                if (var226 != class411.field5711.field3870.method2335(true)) {
                    class411.field5711.method1677(class411.field5711.field3870, (byte) -71, var226);
                    class2.method15(17458);
                    class41.field548 = false;
                    class596.method3236((byte) -114);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field2732[field2744++] = class411.field5711.field3893.method692(true);
                return;
            }
            if (arg0 == 6102) {
                field2732[field2744++] = class411.field5711.field3908.method984(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field2732[field2744++] = class411.field5711.field3882.method1289(true) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field2732[field2744++] = class411.field5711.field3904.method1631(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field2732[field2744++] = class411.field5711.field3879.method2566(true);
                return;
            }
            if (arg0 == 6108) {
                field2732[field2744++] = class411.field5711.field3869.method1406(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field2732[field2744++] = class411.field5711.field3918.method1832(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field2732[field2744++] = class411.field5711.field3897.method1057(true);
                return;
            }
            if (arg0 == 6112) {
                field2732[field2744++] = class411.field5711.field3902.method3070(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field2732[field2744++] = class411.field5711.field3915.method574(true) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field2732[field2744++] = class411.field5711.field3884.method2464(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field2732[field2744++] = class411.field5711.field3912.method74(true);
                return;
            }
            if (arg0 == 6117) {
                field2732[field2744++] = class411.field5711.field3875.method3931(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field2732[field2744++] = class411.field5711.field3887.method2432(true);
                return;
            }
            if (arg0 == 6119) {
                field2732[field2744++] = class411.field5711.field3899.method2432(true);
                return;
            }
            if (arg0 == 6120) {
                field2732[field2744++] = class411.field5711.field3880.method2432(true);
                return;
            }
            if (arg0 == 6123) {
                field2732[field2744++] = class201.method1355(2);
                return;
            }
            if (arg0 == 6124) {
                field2732[field2744++] = class411.field5711.field3895.method74(true);
                return;
            }
            if (arg0 == 6125) {
                field2732[field2744++] = class411.field5711.field3891.method1341(true);
                return;
            }
            if (arg0 == 6127) {
                field2732[field2744++] = class411.field5711.field3876.method2974(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field2732[field2744++] = class411.field5711.field3872.method4126(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field2732[field2744++] = class411.field5711.field3879.method2566(true);
                return;
            }
            if (arg0 == 6130) {
                field2732[field2744++] = class411.field5711.field3900.method1182(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field2732[field2744++] = class411.field5711.field3913.method3282(true);
                return;
            }
            if (arg0 == 6132) {
                field2732[field2744++] = class411.field5711.field3877.method3282(true);
                return;
            }
            if (arg0 == 6133) {
                field2732[field2744++] = class66.field828.field2892 && !class66.field828.field2900 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field2732[field2744++] = class411.field5711.field3873.method3261(true);
                return;
            }
            if (arg0 == 6136) {
                field2732[field2744++] = class411.field5711.field3868.method1851(true) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field2732[field2744++] = class35.method289(class411.field5711.field3913.method3282(true), true, 200);
                return;
            }
            if (arg0 == 6139) {
                field2732[field2744++] = class411.field5711.field3874.method1838(true);
                return;
            }
            if (arg0 == 6142) {
                field2732[field2744++] = class411.field5711.field3894.method2432(true);
                return;
            }
            if (arg0 == 6143) {
                field2732[field2744++] = class411.field5711.field3917.method2432(true);
                return;
            }
            if (arg0 == 6144) {
                field2732[field2744++] = class604.field7946 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field2732[field2744++] = class411.field5711.field3889.method3061(true);
                return;
            }
            if (arg0 == 6146) {
                field2732[field2744++] = class411.field5711.field3870.method2335(true);
                return;
            }
            if (arg0 == 6147) {
                field2732[field2744++] = class136.field2170.field8620 < 512 || class604.field7946 || class421.field5801 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field2732[field2744++] = class281.field3974 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field2744 -= 2;
                class438.field6047 = (short) field2732[field2744];
                if (class438.field6047 <= 0) {
                    class438.field6047 = 256;
                }
                class42.field557 = (short) field2732[field2744 + 1];
                if (class42.field557 <= 0) {
                    class42.field557 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field2744 -= 2;
                class229.field3260 = (short) field2732[field2744];
                if (class229.field3260 <= 0) {
                    class229.field3260 = 256;
                }
                class178.field2685 = (short) field2732[field2744 + 1];
                if (class178.field2685 <= 0) {
                    class178.field2685 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field2744 -= 4;
                class277.field3859 = (short) field2732[field2744];
                if (class277.field3859 <= 0) {
                    class277.field3859 = 1;
                }
                class247.field3435 = (short) field2732[field2744 + 1];
                if (class247.field3435 <= 0) {
                    class247.field3435 = 32767;
                } else if (class247.field3435 < class277.field3859) {
                    class247.field3435 = class277.field3859;
                }
                class360.field5074 = (short) field2732[field2744 + 2];
                if (class360.field5074 <= 0) {
                    class360.field5074 = 1;
                }
                class270.field3778 = (short) field2732[field2744 + 3];
                if (class270.field3778 <= 0) {
                    class270.field3778 = 32767;
                    return;
                }
                if (class270.field3778 < class360.field5074) {
                    class270.field3778 = class360.field5074;
                }
                return;
            }
            if (arg0 == 6203) {
                class710.method3989(class577.field7570.field9287, 0, class577.field7570.field9178, 0, false, (byte) -72);
                field2732[field2744++] = class298.field4234;
                field2732[field2744++] = class274.field3807;
                return;
            }
            if (arg0 == 6204) {
                field2732[field2744++] = class229.field3260;
                field2732[field2744++] = class178.field2685;
                return;
            }
            if (arg0 == 6205) {
                field2732[field2744++] = class438.field6047;
                field2732[field2744++] = class42.field557;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field2732[field2744++] = (int) (class375.method2193(116) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field2732[field2744++] = (int) (class375.method2193(116) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field2744 -= 3;
                int var227 = field2732[field2744];
                int var228 = field2732[field2744 + 1];
                int var229 = field2732[field2744 + 2];
                long var230 = class1.method4(0, (byte) 109, var229, 0, var228, var227, 12);
                int var232 = class468.method2641(var230, 114);
                if (var229 < 1970) {
                    var232--;
                }
                field2732[field2744++] = var232;
                return;
            }
            if (arg0 == 6303) {
                field2732[field2744++] = class726.method4084(class375.method2193(116), 79);
                return;
            }
            if (arg0 == 6304) {
                int var233 = field2732[--field2744];
                boolean var234 = true;
                if (var233 < 0) {
                    var234 = (var233 + 1) % 4 == 0;
                } else if (var233 < 1582) {
                    var234 = var233 % 4 == 0;
                } else if (var233 % 4 != 0) {
                    var234 = false;
                } else if (var233 % 100 != 0) {
                    var234 = true;
                } else if (var233 % 400 != 0) {
                    var234 = false;
                }
                field2732[field2744++] = var234 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field2732[field2744++] = class470.method2650((byte) -60) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field2732[field2744++] = class155.method1127(1) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class15.field215 == 7 && class597.field7823 == 0 && class594.field7712 == 0) {
                    if (class63.field769) {
                        field2732[field2744++] = 0;
                        return;
                    }
                    if (class553.field7283 > class375.method2193(116) - 1000L) {
                        field2732[field2744++] = 1;
                        return;
                    }
                    class63.field769 = true;
                    class583 var235 = class381.method2246(1, class128.field2105, class149.field2338);
                    var235.field7637.method3798(27695, class194.field2925);
                    class42.method309(var235, 0);
                    field2732[field2744++] = 0;
                    return;
                }
                field2732[field2744++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class653 var236 = class224.method1431(-109);
                if (var236 != null) {
                    field2732[field2744++] = var236.field8653;
                    field2732[field2744++] = var236.field6194;
                    field2755[field2736++] = var236.field8651;
                    class208 var237 = var236.method3555(3);
                    field2732[field2744++] = var237.field3082;
                    field2755[field2736++] = var237.field3085;
                    field2732[field2744++] = var236.field6203;
                    field2732[field2744++] = var236.field8656;
                    field2755[field2736++] = var236.field8652;
                    return;
                }
                field2732[field2744++] = -1;
                field2732[field2744++] = 0;
                field2755[field2736++] = "";
                field2732[field2744++] = 0;
                field2755[field2736++] = "";
                field2732[field2744++] = 0;
                field2732[field2744++] = 0;
                field2755[field2736++] = "";
                return;
            }
            if (arg0 == 6502) {
                class653 var238 = class18.method142(-144254536);
                if (var238 != null) {
                    field2732[field2744++] = var238.field8653;
                    field2732[field2744++] = var238.field6194;
                    field2755[field2736++] = var238.field8651;
                    class208 var239 = var238.method3555(3);
                    field2732[field2744++] = var239.field3082;
                    field2755[field2736++] = var239.field3085;
                    field2732[field2744++] = var238.field6203;
                    field2732[field2744++] = var238.field8656;
                    field2755[field2736++] = var238.field8652;
                    return;
                }
                field2732[field2744++] = -1;
                field2732[field2744++] = 0;
                field2755[field2736++] = "";
                field2732[field2744++] = 0;
                field2755[field2736++] = "";
                field2732[field2744++] = 0;
                field2732[field2744++] = 0;
                field2755[field2736++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var240 = field2732[--field2744];
                String var241 = field2755[--field2736];
                if (class15.field215 == 7 && class597.field7823 == 0 && class594.field7712 == 0) {
                    field2732[field2744++] = class607.method3299((byte) 96, var241, var240) ? 1 : 0;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var242 = field2732[--field2744];
                class653 var243 = class629.method3466(-3652, var242);
                if (var243 != null) {
                    field2732[field2744++] = var243.field6194;
                    field2755[field2736++] = var243.field8651;
                    class208 var244 = var243.method3555(3);
                    field2732[field2744++] = var244.field3082;
                    field2755[field2736++] = var244.field3085;
                    field2732[field2744++] = var243.field6203;
                    field2732[field2744++] = var243.field8656;
                    field2755[field2736++] = var243.field8652;
                    return;
                }
                field2732[field2744++] = -1;
                field2755[field2736++] = "";
                field2732[field2744++] = 0;
                field2755[field2736++] = "";
                field2732[field2744++] = 0;
                field2732[field2744++] = 0;
                field2755[field2736++] = "";
                return;
            }
            if (arg0 == 6507) {
                field2744 -= 4;
                int var245 = field2732[field2744];
                boolean var246 = field2732[field2744 + 1] == 1;
                int var247 = field2732[field2744 + 2];
                boolean var248 = field2732[field2744 + 3] == 1;
                class125.method992(var246, var247, var248, var245, (byte) 28);
                return;
            }
            if (arg0 == 6508) {
                class609.method3324(4096);
                return;
            }
            if (arg0 == 6509) {
                if (class15.field215 != 7) {
                    return;
                }
                class758.field10552 = field2732[--field2744] == 1;
                return;
            }
            if (arg0 == 6510) {
                field2732[field2744++] = class36.field519;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class563.field7375 == class426.field5869) {
                if (arg0 == 6700) {
                    int var249 = class350.field4925.method2147((byte) 32);
                    if (class443.field6101 != -1) {
                        var249++;
                    }
                    field2732[field2744++] = var249;
                    return;
                }
                if (arg0 == 6701) {
                    int var250 = field2732[--field2744];
                    if (class443.field6101 != -1) {
                        if (var250 == 0) {
                            field2732[field2744++] = class443.field6101;
                            return;
                        }
                        var250--;
                    }
                    class8 var251 = (class8) class350.field4925.method2144(true);
                    while (var250-- > 0) {
                        var251 = (class8) class350.field4925.method2146(false);
                    }
                    field2732[field2744++] = var251.field161;
                    return;
                }
                if (arg0 == 6702) {
                    int var252 = field2732[--field2744];
                    if (class747.field10393[var252] == null) {
                        field2755[field2736++] = "";
                        return;
                    }
                    String var253 = class747.field10393[var252][0].field9187;
                    if (var253 == null) {
                        field2755[field2736++] = "";
                        return;
                    }
                    field2755[field2736++] = var253.substring(0, var253.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var254 = field2732[--field2744];
                    if (class747.field10393[var254] == null) {
                        field2732[field2744++] = 0;
                        return;
                    }
                    field2732[field2744++] = class747.field10393[var254].length;
                    return;
                }
                if (arg0 == 6704) {
                    field2744 -= 2;
                    int var255 = field2732[field2744];
                    int var256 = field2732[field2744 + 1];
                    if (class747.field10393[var255] == null) {
                        field2755[field2736++] = "";
                        return;
                    }
                    String var257 = class747.field10393[var255][var256].field9187;
                    if (var257 == null) {
                        field2755[field2736++] = "";
                        return;
                    }
                    field2755[field2736++] = var257;
                    return;
                }
                if (arg0 == 6705) {
                    field2744 -= 2;
                    int var258 = field2732[field2744];
                    int var259 = field2732[field2744 + 1];
                    if (class747.field10393[var258] == null) {
                        field2732[field2744++] = 0;
                        return;
                    }
                    field2732[field2744++] = class747.field10393[var258][var259].field9210;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field2744 -= 3;
                    int var260 = field2732[field2744];
                    int var261 = field2732[field2744 + 1];
                    int var262 = field2732[field2744 + 2];
                    class50.method355("", -1, var262, var260 << 16 | var261, 1);
                    return;
                }
                if (arg0 == 6708) {
                    field2744 -= 3;
                    int var263 = field2732[field2744];
                    int var264 = field2732[field2744 + 1];
                    int var265 = field2732[field2744 + 2];
                    class50.method355("", -1, var265, var263 << 16 | var264, 2);
                    return;
                }
                if (arg0 == 6709) {
                    field2744 -= 3;
                    int var266 = field2732[field2744];
                    int var267 = field2732[field2744 + 1];
                    int var268 = field2732[field2744 + 2];
                    class50.method355("", -1, var268, var266 << 16 | var267, 3);
                    return;
                }
                if (arg0 == 6710) {
                    field2744 -= 3;
                    int var269 = field2732[field2744];
                    int var270 = field2732[field2744 + 1];
                    int var271 = field2732[field2744 + 2];
                    class50.method355("", -1, var271, var269 << 16 | var270, 4);
                    return;
                }
                if (arg0 == 6711) {
                    field2744 -= 3;
                    int var272 = field2732[field2744];
                    int var273 = field2732[field2744 + 1];
                    int var274 = field2732[field2744 + 2];
                    class50.method355("", -1, var274, var272 << 16 | var273, 5);
                    return;
                }
                if (arg0 == 6712) {
                    field2744 -= 3;
                    int var275 = field2732[field2744];
                    int var276 = field2732[field2744 + 1];
                    int var277 = field2732[field2744 + 2];
                    class50.method355("", -1, var277, var275 << 16 | var276, 6);
                    return;
                }
                if (arg0 == 6713) {
                    field2744 -= 3;
                    int var278 = field2732[field2744];
                    int var279 = field2732[field2744 + 1];
                    int var280 = field2732[field2744 + 2];
                    class50.method355("", -1, var280, var278 << 16 | var279, 7);
                    return;
                }
                if (arg0 == 6714) {
                    field2744 -= 3;
                    int var281 = field2732[field2744];
                    int var282 = field2732[field2744 + 1];
                    int var283 = field2732[field2744 + 2];
                    class50.method355("", -1, var283, var281 << 16 | var282, 8);
                    return;
                }
                if (arg0 == 6715) {
                    field2744 -= 3;
                    int var284 = field2732[field2744];
                    int var285 = field2732[field2744 + 1];
                    int var286 = field2732[field2744 + 2];
                    class50.method355("", -1, var286, var284 << 16 | var285, 9);
                    return;
                }
                if (arg0 == 6716) {
                    field2744 -= 3;
                    int var287 = field2732[field2744];
                    int var288 = field2732[field2744 + 1];
                    int var289 = field2732[field2744 + 2];
                    class50.method355("", -1, var289, var287 << 16 | var288, 10);
                    return;
                }
                if (arg0 == 6717) {
                    field2744 -= 3;
                    int var290 = field2732[field2744];
                    int var291 = field2732[field2744 + 1];
                    int var292 = field2732[field2744 + 2];
                    class672 var293 = class239.method1503(var290 << 16 | var291, var292, 0);
                    class617.method3377((byte) -113);
                    class200 var294 = client.method1875(var293);
                    class679.method3839(var294.field2998, 1, var293, var294.method1351(2));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var295 = field2732[--field2744];
                    class325 var296 = class361.field5088.method3192((byte) 126, var295);
                    if (var296.field4657 == null) {
                        field2755[field2736++] = "";
                        return;
                    }
                    field2755[field2736++] = var296.field4657;
                    return;
                }
                if (arg0 == 6801) {
                    int var297 = field2732[--field2744];
                    class325 var298 = class361.field5088.method3192((byte) 115, var297);
                    field2732[field2744++] = var298.field4615;
                    return;
                }
                if (arg0 == 6802) {
                    int var299 = field2732[--field2744];
                    class325 var300 = class361.field5088.method3192((byte) 113, var299);
                    field2732[field2744++] = var300.field4634;
                    return;
                }
                if (arg0 == 6803) {
                    int var301 = field2732[--field2744];
                    class325 var302 = class361.field5088.method3192((byte) 85, var301);
                    field2732[field2744++] = var302.field4622;
                    return;
                }
                if (arg0 == 6804) {
                    field2744 -= 2;
                    int var303 = field2732[field2744];
                    int var304 = field2732[field2744 + 1];
                    class62 var305 = class505.field6754.method4149(-6119, var304);
                    if (var305.method536(Integer.MAX_VALUE)) {
                        field2755[field2736++] = class361.field5088.method3192((byte) 67, var303).method1963(var305.field756, (byte) -83, var304);
                        return;
                    }
                    field2732[field2744++] = class361.field5088.method3192((byte) 91, var303).method1966(var304, var305.field761, 18551);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field2732[field2744++] = class375.field5199 && !class662.field8730 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field2732[field2744++] = (int) (class727.field10101 / 60000L);
                    field2732[field2744++] = class407.field5658 ? 1 : 0;
                    return;
                }
                if (arg0 == 6902) {
                    field2732[field2744++] = class200.field3005;
                    return;
                }
                if (arg0 == 6903) {
                    field2732[field2744++] = class148.field2336;
                    return;
                }
                if (arg0 == 6904) {
                    field2732[field2744++] = class238.field3357;
                    return;
                }
                if (arg0 == 6905) {
                    String var306 = "";
                    if (class112.field1854 != null) {
                        if (class112.field1854.field2986 == null) {
                            var306 = class401.method2360((byte) 119, class112.field1854.field2983);
                        } else {
                            var306 = (String) class112.field1854.field2986;
                        }
                    }
                    field2755[field2736++] = var306;
                    return;
                }
                if (arg0 == 6906) {
                    field2732[field2744++] = class135.field2155;
                    return;
                }
                if (arg0 == 6907) {
                    field2732[field2744++] = class298.field4245;
                    return;
                }
                if (arg0 == 6908) {
                    field2732[field2744++] = class719.field10012;
                    return;
                }
                if (arg0 == 6909) {
                    field2732[field2744++] = class28.field446 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field2732[field2744++] = class131.field2144;
                    return;
                }
                if (arg0 == 6911) {
                    field2732[field2744++] = class97.field1198;
                    return;
                }
                if (arg0 == 6912) {
                    field2732[field2744++] = class394.field5493;
                    return;
                }
                if (arg0 == 6913) {
                    field2732[field2744++] = class299.field4256;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var307 = class374.method2190((byte) 51);
                    field2732[field2744++] = class336.field4767 = class411.field5711.field3913.method3282(true);
                    field2732[field2744++] = var307;
                    class436.method2508((byte) 125);
                    class2.method15(17458);
                    class41.field548 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class660.method3578((byte) -95);
                    class436.method2508((byte) 5);
                    class2.method15(17458);
                    class41.field548 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class588.method3212(0);
                    class436.method2508((byte) 11);
                    class2.method15(17458);
                    class41.field548 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class615.method3356((byte) -121);
                    class436.method2508((byte) 122);
                    class2.method15(17458);
                    class41.field548 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class656.method3567(1, true);
                    class436.method2508((byte) -28);
                    class2.method15(17458);
                    class41.field548 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class411.field5711.method1677(class411.field5711.field3903, (byte) -71, 0);
                    class2.method15(17458);
                    class41.field548 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class336.field4767 == 2) {
                        class314.field4493 = true;
                        return;
                    }
                    if (class336.field4767 == 1) {
                        class672.field9323 = true;
                        return;
                    }
                    if (class336.field4767 == 3) {
                        class676.field9388 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field2732[field2744++] = class411.field5711.field3903.method2666(true);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field2744 -= 2;
                    int var308 = field2732[field2744];
                    int var309 = field2732[field2744 + 1];
                    if (var308 != -1) {
                        if (var309 > 255) {
                            var309 = 255;
                        } else if (var309 < 0) {
                            var309 = 0;
                        }
                        class636.method3490(var309, 85, var308, false);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var310 = field2732[--field2744];
                    if (var310 != -1) {
                        class501.method2820(8718, var310);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var311 = field2732[--field2744];
                    if (var311 != -1) {
                        class177.method1232(false, var311);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field2732[field2744++] = class670.method3695("jagtheora", -22534) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field2732[field2744++] = class411.field5711.field3904.method1634(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field2732[field2744++] = class411.field5711.field3918.method1830(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field2732[field2744++] = class411.field5711.field3897.method1059(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field2732[field2744++] = class411.field5711.field3915.method575(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field2732[field2744++] = class411.field5711.field3895.method70(260) && class341.field4807.method512() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field2732[field2744++] = class411.field5711.field3911.method2822(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field2732[field2744++] = class411.field5711.field3891.method1340(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field2732[field2744++] = class411.field5711.field3876.method2972(260) && class341.field4807.method390() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field2732[field2744++] = class411.field5711.field3900.method1180(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field2732[field2744++] = class411.field5711.field3868.method1854(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field2732[field2744++] = class411.field5711.field3874.method1841(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field2732[field2744++] = class411.field5711.field3884.method2465(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field2732[field2744++] = class411.field5711.field3870.method2332(260) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field2732[field2744++] = class411.field5711.field3877.method3280(260) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var312 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3904.method75(0, var312);
                    return;
                }
                if (arg0 == 7302) {
                    int var313 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3918.method75(0, var313);
                    return;
                }
                if (arg0 == 7303) {
                    int var314 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3897.method75(0, var314);
                    return;
                }
                if (arg0 == 7304) {
                    int var315 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3915.method75(0, var315);
                    return;
                }
                if (arg0 == 7305) {
                    int var316 = field2732[--field2744];
                    if (!class341.field4807.method512()) {
                        field2732[field2744++] = 3;
                        return;
                    }
                    field2732[field2744++] = class411.field5711.field3895.method75(0, var316);
                    return;
                }
                if (arg0 == 7306) {
                    int var317 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3911.method75(0, var317);
                    return;
                }
                if (arg0 == 7307) {
                    int var318 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3891.method75(0, var318);
                    return;
                }
                if (arg0 == 7308) {
                    int var319 = field2732[--field2744];
                    if (!class341.field4807.method390()) {
                        field2732[field2744++] = 3;
                        return;
                    }
                    field2732[field2744++] = class411.field5711.field3876.method75(0, var319);
                    return;
                }
                if (arg0 == 7309) {
                    int var320 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3900.method75(0, var320);
                    return;
                }
                if (arg0 == 7310) {
                    int var321 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3868.method75(0, var321);
                    return;
                }
                if (arg0 == 7311) {
                    int var322 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3874.method75(0, var322);
                    return;
                }
                if (arg0 == 7312) {
                    int var323 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3884.method75(0, var323);
                    return;
                }
                if (arg0 == 7313) {
                    int var324 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3870.method75(0, var324);
                    return;
                }
                if (arg0 == 7314) {
                    int var325 = field2732[--field2744];
                    field2732[field2744++] = class411.field5711.field3877.method75(0, var325);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V", line = 3835)
    public static final void method1251(int arg0) {
        if (arg0 == -1 || !class435.method2502(arg0, (byte) -22)) {
            return;
        }
        class672[] var1 = class747.field10393[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class672 var3 = var1[var2];
            if (var3.field9259 != null) {
                class309 var4 = new class309();
                var4.field4435 = var3;
                var4.field4439 = var3.field9259;
                method1248(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3874)
    private static final void method1252(String arg0, int arg1) {
        if (class257.field3521 == 0 && !(!class375.field5199 || class662.field8730) || class433.field5956) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class517.field6887.method2877(0, (byte) -108))) {
            var3 = 0;
            arg0 = arg0.substring(class517.field6887.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6888.method2877(0, (byte) -108))) {
            var3 = 1;
            arg0 = arg0.substring(class517.field6888.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6889.method2877(0, (byte) -108))) {
            var3 = 2;
            arg0 = arg0.substring(class517.field6889.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6890.method2877(0, (byte) -108))) {
            var3 = 3;
            arg0 = arg0.substring(class517.field6890.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6891.method2877(0, (byte) -108))) {
            var3 = 4;
            arg0 = arg0.substring(class517.field6891.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6892.method2877(0, (byte) -108))) {
            var3 = 5;
            arg0 = arg0.substring(class517.field6892.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6893.method2877(0, (byte) -108))) {
            var3 = 6;
            arg0 = arg0.substring(class517.field6893.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6894.method2877(0, (byte) -108))) {
            var3 = 7;
            arg0 = arg0.substring(class517.field6894.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6895.method2877(0, (byte) -108))) {
            var3 = 8;
            arg0 = arg0.substring(class517.field6895.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6896.method2877(0, (byte) -108))) {
            var3 = 9;
            arg0 = arg0.substring(class517.field6896.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6897.method2877(0, (byte) -108))) {
            var3 = 10;
            arg0 = arg0.substring(class517.field6897.method2877(0, (byte) -108).length());
        } else if (var2.startsWith(class517.field6898.method2877(0, (byte) -108))) {
            var3 = 11;
            arg0 = arg0.substring(class517.field6898.method2877(0, (byte) -108).length());
        } else if (class713.field9854 != 0) {
            if (var2.startsWith(class517.field6887.method2877(class713.field9854, (byte) -108))) {
                var3 = 0;
                arg0 = arg0.substring(class517.field6887.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6888.method2877(class713.field9854, (byte) -108))) {
                var3 = 1;
                arg0 = arg0.substring(class517.field6888.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6889.method2877(class713.field9854, (byte) -108))) {
                var3 = 2;
                arg0 = arg0.substring(class517.field6889.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6890.method2877(class713.field9854, (byte) -108))) {
                var3 = 3;
                arg0 = arg0.substring(class517.field6890.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6891.method2877(class713.field9854, (byte) -108))) {
                var3 = 4;
                arg0 = arg0.substring(class517.field6891.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6892.method2877(class713.field9854, (byte) -108))) {
                var3 = 5;
                arg0 = arg0.substring(class517.field6892.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6893.method2877(class713.field9854, (byte) -108))) {
                var3 = 6;
                arg0 = arg0.substring(class517.field6893.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6894.method2877(class713.field9854, (byte) -108))) {
                var3 = 7;
                arg0 = arg0.substring(class517.field6894.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6895.method2877(class713.field9854, (byte) -108))) {
                var3 = 8;
                arg0 = arg0.substring(class517.field6895.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6896.method2877(class713.field9854, (byte) -108))) {
                var3 = 9;
                arg0 = arg0.substring(class517.field6896.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6897.method2877(class713.field9854, (byte) -108))) {
                var3 = 10;
                arg0 = arg0.substring(class517.field6897.method2877(class713.field9854, (byte) -108).length());
            } else if (var2.startsWith(class517.field6898.method2877(class713.field9854, (byte) -108))) {
                var3 = 11;
                arg0 = arg0.substring(class517.field6898.method2877(class713.field9854, (byte) -108).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class517.field6899.method2877(0, (byte) -108))) {
            var5 = 1;
            arg0 = arg0.substring(class517.field6899.method2877(0, (byte) -108).length());
        } else if (var4.startsWith(class517.field6900.method2877(0, (byte) -108))) {
            var5 = 2;
            arg0 = arg0.substring(class517.field6900.method2877(0, (byte) -108).length());
        } else if (var4.startsWith(class517.field6901.method2877(0, (byte) -108))) {
            var5 = 3;
            arg0 = arg0.substring(class517.field6901.method2877(0, (byte) -108).length());
        } else if (var4.startsWith(class517.field6902.method2877(0, (byte) -108))) {
            var5 = 4;
            arg0 = arg0.substring(class517.field6902.method2877(0, (byte) -108).length());
        } else if (var4.startsWith(class517.field6903.method2877(0, (byte) -108))) {
            var5 = 5;
            arg0 = arg0.substring(class517.field6903.method2877(0, (byte) -108).length());
        } else if (class713.field9854 != 0) {
            if (var4.startsWith(class517.field6899.method2877(class713.field9854, (byte) -108))) {
                var5 = 1;
                arg0 = arg0.substring(class517.field6899.method2877(class713.field9854, (byte) -108).length());
            } else if (var4.startsWith(class517.field6900.method2877(class713.field9854, (byte) -108))) {
                var5 = 2;
                arg0 = arg0.substring(class517.field6900.method2877(class713.field9854, (byte) -108).length());
            } else if (var4.startsWith(class517.field6901.method2877(class713.field9854, (byte) -108))) {
                var5 = 3;
                arg0 = arg0.substring(class517.field6901.method2877(class713.field9854, (byte) -108).length());
            } else if (var4.startsWith(class517.field6902.method2877(class713.field9854, (byte) -108))) {
                var5 = 4;
                arg0 = arg0.substring(class517.field6902.method2877(class713.field9854, (byte) -108).length());
            } else if (var4.startsWith(class517.field6903.method2877(class713.field9854, (byte) -108))) {
                var5 = 5;
                arg0 = arg0.substring(class517.field6903.method2877(class713.field9854, (byte) -108).length());
            }
        }
        field2733++;
        class583 var6 = class381.method2246(1, class128.field2105, class60.field743);
        var6.field7637.method3823(-101, 0);
        int var7 = var6.field7637.field9419;
        var6.field7637.method3823(-117, var3);
        var6.field7637.method3823(-60, var5);
        class393.method2325((byte) -98, var6.field7637, arg0);
        var6.field7637.method3828(-20198, var6.field7637.field9419 - var7);
        class42.method309(var6, 0);
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)V", line = 4142)
    private static final void method1253(int arg0) {
        class672 var1 = class21.method225(65535, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class672[] var3 = class580.field7607[var2];
        if (var3 == null) {
            class672[] var4 = class747.field10393[var2];
            int var5 = var4.length;
            var3 = class580.field7607[var2] = new class672[var5];
            class335.method2017(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class335.method2017(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ltia;I)V", line = 4179)
    private static final void method1254(class270 arg0, int arg1) {
        field2744 = 0;
        field2736 = 0;
        int var2 = -1;
        int[] var3 = arg0.field3776;
        int[] var4 = arg0.field3773;
        byte var5 = -1;
        field2756 = 0;
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
                        method1259(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1250(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field2732[field2744++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field2732[field2744++] = class74.field901.field10076[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class74.field901.method4072(field2732[--field2744], var8, 0);
                } else if (var43 == 3) {
                    field2755[field2736++] = arg0.field3775[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field2744 -= 2;
                    if (field2732[field2744 + 1] != field2732[field2744]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field2744 -= 2;
                    if (field2732[field2744 + 1] == field2732[field2744]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field2744 -= 2;
                    if (field2732[field2744] < field2732[field2744 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field2744 -= 2;
                    if (field2732[field2744] > field2732[field2744 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field2756 == 0) {
                        return;
                    }
                    class717 var9 = field2743[--field2756];
                    arg0 = var9.field9872;
                    var3 = arg0.field3776;
                    var4 = arg0.field3773;
                    var2 = var9.field9878;
                    field2753 = var9.field9877;
                    field2751 = var9.field9873;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field2732[field2744++] = class74.field901.method1524(var10, (byte) -108);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class74.field901.method4069(field2732[--field2744], var11, (byte) 98);
                } else if (var43 == 31) {
                    field2744 -= 2;
                    if (field2732[field2744] <= field2732[field2744 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field2744 -= 2;
                    if (field2732[field2744] >= field2732[field2744 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field2732[field2744++] = field2753[var4[var2]];
                } else if (var43 == 34) {
                    field2753[var4[var2]] = field2732[--field2744];
                } else if (var43 == 35) {
                    field2755[field2736++] = field2751[var4[var2]];
                } else if (var43 == 36) {
                    field2751[var4[var2]] = field2755[--field2736];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field2736 -= var12;
                    String var13 = class320.method1942(-30907, field2755, field2736, var12);
                    field2755[field2736++] = var13;
                } else if (var43 == 38) {
                    field2744--;
                } else if (var43 == 39) {
                    field2736--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class270 var15 = class469.method2645(var14, -7550);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field3777];
                    String[] var17 = new String[var15.field3782];
                    for (int var18 = 0; var18 < var15.field3783; var18++) {
                        var16[var18] = field2732[field2744 + var18 - var15.field3783];
                    }
                    for (int var19 = 0; var19 < var15.field3771; var19++) {
                        var17[var19] = field2755[field2736 + var19 - var15.field3771];
                    }
                    field2744 -= var15.field3783;
                    field2736 -= var15.field3771;
                    class717 var20 = new class717();
                    var20.field9872 = arg0;
                    var20.field9878 = var2;
                    var20.field9877 = field2753;
                    var20.field9873 = field2751;
                    if (field2756 >= field2743.length) {
                        throw new RuntimeException();
                    }
                    field2743[field2756++] = var20;
                    arg0 = var15;
                    var3 = var15.field3776;
                    var4 = var15.field3773;
                    var2 = -1;
                    field2753 = var16;
                    field2751 = var17;
                } else if (var43 == 42) {
                    field2732[field2744++] = class540.field7160[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class540.field7160[var21] = field2732[--field2744];
                    class495.method2795(false, var21);
                    class464.field6381 |= class763.field10629[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field2732[--field2744];
                    if (var24 >= 0 && var24 <= 5000) {
                        field2754[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label270;
                            }
                            field2742[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field2732[--field2744];
                    if (var28 < 0 || var28 >= field2754[var27]) {
                        throw new RuntimeException();
                    }
                    field2732[field2744++] = field2742[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field2744 -= 2;
                    int var30 = field2732[field2744];
                    if (var30 < 0 || var30 >= field2754[var29]) {
                        throw new RuntimeException();
                    }
                    field2742[var29][var30] = field2732[field2744 + 1];
                } else if (var43 == 47) {
                    String var31 = class92.field1119[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field2755[field2736++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class92.field1119[var32] = field2755[--field2736];
                    class462.method2624(var32, (byte) 113);
                } else if (var43 == 51) {
                    class360 var33 = arg0.field3774[var4[var2]];
                    class651 var34 = (class651) var33.method2135((long) field2732[--field2744], (byte) 31);
                    if (var34 != null) {
                        var2 += var34.field8636;
                    }
                } else if (var43 == 86) {
                    if (field2732[--field2744] == 1) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 87 && field2732[--field2744] == 0) {
                    var2 += var4[var2];
                }
            }
        } catch (Exception var42) {
            if (arg0.field3772 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field8680).append(" ");
                for (int var41 = field2756 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field2743[var41].field9872.field8680).append(" ");
                }
                var40.append("op: ").append(var5);
                class135.method1056(var40.toString(), var42, 1);
            } else {
                class178.method1234(4, 31663, "Clientscript error in: " + arg0.field3772);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field3772).append("\n");
                for (int var38 = field2756 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field2743[var38].field9872.field3772).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class135.method1056(var37.toString(), var42, 1);
                class710.method3991(var37.toString(), (byte) 104);
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(C)I", line = 4635)
    private static final int method1255(char arg0) {
        return class447.method2562(arg0, -161) ? 1 : 0;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "()V", line = 4646)
    public static final void method1256() {
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "()V", line = 4651)
    public static void method1257() {
        field2753 = null;
        field2751 = null;
        field2754 = null;
        field2742 = null;
        field2732 = null;
        field2755 = null;
        field2743 = null;
        field2739 = null;
        field2746 = null;
        field2749 = null;
        field2747 = null;
        field2738 = null;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Ldia;II)V", line = 4673)
    public static final void method1258(class235 arg0, int arg1, int arg2) {
        class270 var3 = class407.method2382(arg1, arg2, arg0, -22038);
        if (var3 == null) {
            return;
        }
        field2753 = new int[var3.field3777];
        field2751 = new String[var3.field3782];
        if (class519.field6921 == var3.field3781 || class532.field7033 == var3.field3781 || class131.field2140 == var3.field3781) {
            int var4 = 0;
            int var5 = 0;
            if (class557.field7340 != null) {
                var4 = class557.field7340.field9212;
                var5 = class557.field7340.field9325;
            }
            field2753[0] = class569.field7492.method780((byte) -92) - var4;
            field2753[1] = class569.field7492.method772(92) - var5;
        }
        method1254(var3, 200000);
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(IZ)V", line = 4710)
    private static final void method1259(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field2744 -= 3;
                int var2 = field2732[field2744];
                int var3 = field2732[field2744 + 1];
                int var4 = field2732[field2744 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class672 var5 = class21.method225(65535, var2);
                if (var5.field9240 == null) {
                    var5.field9240 = new class672[var4 + 1];
                }
                if (var5.field9240.length <= var4) {
                    class672[] var6 = new class672[var4 + 1];
                    for (int var7 = 0; var7 < var5.field9240.length; var7++) {
                        var6[var7] = var5.field9240[var7];
                    }
                    var5.field9240 = var6;
                }
                if (var4 > 0 && var5.field9240[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class672 var8 = new class672();
                var8.field9239 = var3;
                var8.field9255 = var8.field9200 = var5.field9200;
                var8.field9277 = var4;
                var5.field9240[var4] = var8;
                if (arg1) {
                    field2746 = var8;
                } else {
                    field2739 = var8;
                }
                class399.method2347(var5, 2260);
                return;
            }
            if (arg0 == 101) {
                class672 var9 = arg1 ? field2746 : field2739;
                if (var9.field9277 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class672 var10 = class21.method225(65535, var9.field9200);
                var10.field9240[var9.field9277] = null;
                class399.method2347(var10, 2260);
                return;
            }
            if (arg0 == 102) {
                class672 var11 = class21.method225(65535, field2732[--field2744]);
                var11.field9240 = null;
                class399.method2347(var11, 2260);
                return;
            }
            if (arg0 == 200) {
                field2744 -= 2;
                int var12 = field2732[field2744];
                int var13 = field2732[field2744 + 1];
                class672 var14 = class239.method1503(var12, var13, 0);
                if (var14 != null && var13 != -1) {
                    field2732[field2744++] = 1;
                    if (arg1) {
                        field2746 = var14;
                        return;
                    }
                    field2739 = var14;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field2732[--field2744];
                class672 var16 = class21.method225(65535, var15);
                if (var16 != null) {
                    field2732[field2744++] = 1;
                    if (arg1) {
                        field2746 = var16;
                        return;
                    }
                    field2739 = var16;
                    return;
                }
                field2732[field2744++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field2732[--field2744];
                method1253(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field2732[--field2744];
                method1260(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field2744 -= 2;
                int var19 = field2732[field2744];
                int var20 = field2732[field2744 + 1];
                if (class472.field6475.field5333 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class200.field3010.length; var21++) {
                    if (class200.field3010[var21] == var19) {
                        class472.field6475.field5333.method1950(var20, class210.field3095, var21, 102);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class316.field4514.length; var22++) {
                    if (class316.field4514[var22] == var19) {
                        class472.field6475.field5333.method1950(var20, class210.field3095, var22, 96);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field2744 -= 2;
                int var23 = field2732[field2744];
                int var24 = field2732[field2744 + 1];
                if (class472.field6475.field5333 == null) {
                    return;
                }
                class472.field6475.field5333.method1947(var23, 0, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field2732[--field2744] != 0;
                if (class472.field6475.field5333 == null) {
                    return;
                }
                class472.field6475.field5333.method1949(0, var25);
                return;
            }
            if (arg0 == 411) {
                field2744 -= 2;
                int var26 = field2732[field2744];
                int var27 = field2732[field2744 + 1];
                if (class472.field6475.field5333 == null) {
                    return;
                }
                class472.field6475.field5333.method1941(var27, var26, 15073, class77.field948);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class672 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class21.method225(65535, field2732[--field2744]);
            } else {
                var28 = arg1 ? field2746 : field2739;
            }
            if (arg0 == 1000) {
                field2744 -= 4;
                var28.field9286 = field2732[field2744];
                var28.field9194 = field2732[field2744 + 1];
                int var29 = field2732[field2744 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field2732[field2744 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field9253 = (byte) var29;
                var28.field9198 = (byte) var30;
                class399.method2347(var28, 2260);
                class236.method1487(var28, -1);
                if (var28.field9277 == -1) {
                    class520.method2885(var28.field9200, 125);
                }
                return;
            }
            if (arg0 == 1001) {
                field2744 -= 4;
                var28.field9261 = field2732[field2744];
                var28.field9173 = field2732[field2744 + 1];
                var28.field9276 = 0;
                var28.field9282 = 0;
                int var31 = field2732[field2744 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field2732[field2744 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field9196 = (byte) var31;
                var28.field9257 = (byte) var32;
                class399.method2347(var28, 2260);
                class236.method1487(var28, -1);
                if (var28.field9239 == 0) {
                    class312.method1914(false, (byte) 100, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field2732[--field2744] == 1;
                if (var28.field9248 != var33) {
                    var28.field9248 = var33;
                    class399.method2347(var28, 2260);
                }
                if (var28.field9277 == -1) {
                    class316.method1925(15, var28.field9200);
                }
                return;
            }
            if (arg0 == 1004) {
                field2744 -= 2;
                var28.field9161 = field2732[field2744];
                var28.field9171 = field2732[field2744 + 1];
                class399.method2347(var28, 2260);
                class236.method1487(var28, -1);
                if (var28.field9239 == 0) {
                    class312.method1914(false, (byte) 100, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field9214 = field2732[--field2744] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class672 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class21.method225(65535, field2732[--field2744]);
            } else {
                var34 = arg1 ? field2746 : field2739;
            }
            if (arg0 == 1100) {
                field2744 -= 2;
                var34.field9216 = field2732[field2744];
                if (var34.field9216 > var34.field9329 - var34.field9287) {
                    var34.field9216 = var34.field9329 - var34.field9287;
                }
                if (var34.field9216 < 0) {
                    var34.field9216 = 0;
                }
                var34.field9226 = field2732[field2744 + 1];
                if (var34.field9226 > var34.field9300 - var34.field9178) {
                    var34.field9226 = var34.field9300 - var34.field9178;
                }
                if (var34.field9226 < 0) {
                    var34.field9226 = 0;
                }
                class399.method2347(var34, 2260);
                if (var34.field9277 == -1) {
                    class552.method3080(-1, var34.field9200);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field9263 = field2732[--field2744];
                class399.method2347(var34, 2260);
                if (var34.field9277 == -1) {
                    class403.method2373(-25908, var34.field9200);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field9174 = field2732[--field2744] == 1;
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1103) {
                var34.field9299 = field2732[--field2744];
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1104) {
                var34.field9163 = field2732[--field2744];
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field2732[--field2744];
                if (var34.field9209 != var35) {
                    var34.field9209 = var35;
                    class399.method2347(var34, 2260);
                }
                if (var34.field9277 == -1) {
                    class761.method4234(-83, var34.field9200);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field9208 = field2732[--field2744];
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1107) {
                var34.field9315 = field2732[--field2744] == 1;
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1108) {
                var34.field9177 = 1;
                var34.field9224 = field2732[--field2744];
                class399.method2347(var34, 2260);
                if (var34.field9277 == -1) {
                    class251.method1536(var34.field9200, (byte) 117);
                }
                return;
            }
            if (arg0 == 1109) {
                field2744 -= 6;
                var34.field9235 = field2732[field2744];
                var34.field9305 = field2732[field2744 + 1];
                var34.field9283 = field2732[field2744 + 2];
                var34.field9164 = field2732[field2744 + 3];
                var34.field9244 = field2732[field2744 + 4];
                var34.field9320 = field2732[field2744 + 5];
                class399.method2347(var34, 2260);
                if (var34.field9277 == -1) {
                    class600.method3264(false, var34.field9200);
                    class565.method3122(var34.field9200, (byte) 123);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field2732[--field2744];
                if (var34.field9203 != var36) {
                    var34.field9203 = var36;
                    var34.field9192 = 0;
                    var34.field9237 = 1;
                    var34.field9189 = 0;
                    class456 var37 = var34.field9203 == -1 ? null : class509.field6780.method663((byte) -90, var34.field9203);
                    if (var37 != null) {
                        class532.method2965(var37, false, var34.field9192);
                    }
                    class399.method2347(var34, 2260);
                }
                if (var34.field9277 == -1) {
                    class200.method1347((byte) -101, var34.field9200);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field9186 = field2732[--field2744] == 1;
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field2755[--field2736];
                if (!var38.equals(var34.field9205)) {
                    var34.field9205 = var38;
                    class399.method2347(var34, 2260);
                }
                if (var34.field9277 == -1) {
                    class459.method2605(var34.field9200, false);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field9230 = field2732[--field2744];
                class399.method2347(var34, 2260);
                if (var34.field9277 == -1) {
                    class57.method381((byte) 70, var34.field9200);
                }
                return;
            }
            if (arg0 == 1114) {
                field2744 -= 3;
                var34.field9289 = field2732[field2744];
                var34.field9211 = field2732[field2744 + 1];
                var34.field9308 = field2732[field2744 + 2];
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1115) {
                var34.field9245 = field2732[--field2744] == 1;
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1116) {
                var34.field9254 = field2732[--field2744];
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1117) {
                var34.field9295 = field2732[--field2744];
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1118) {
                var34.field9274 = field2732[--field2744] == 1;
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1119) {
                var34.field9292 = field2732[--field2744] == 1;
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1120) {
                field2744 -= 2;
                var34.field9329 = field2732[field2744];
                var34.field9300 = field2732[field2744 + 1];
                class399.method2347(var34, 2260);
                if (var34.field9239 == 0) {
                    class312.method1914(false, (byte) 100, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field9190 = field2732[--field2744] == 1;
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1123) {
                var34.field9320 = field2732[--field2744];
                class399.method2347(var34, 2260);
                if (var34.field9277 == -1) {
                    class600.method3264(false, var34.field9200);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field2732[--field2744];
                var34.field9185 = var39 == 1;
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1125) {
                field2744 -= 2;
                var34.field9228 = field2732[field2744];
                var34.field9225 = field2732[field2744 + 1];
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1126) {
                var34.field9304 = field2732[--field2744];
                class399.method2347(var34, 2260);
                return;
            }
            if (arg0 == 1127) {
                field2744 -= 2;
                int var40 = field2732[field2744];
                int var41 = field2732[field2744 + 1];
                class62 var42 = class505.field6754.method4149(-6119, var40);
                if (var42.field761 != var41) {
                    var34.method3719(var40, var41, (byte) 117);
                    return;
                }
                var34.method3720(var40, (byte) 26);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field2732[--field2744];
                String var44 = field2755[--field2736];
                class62 var45 = class505.field6754.method4149(-6119, var43);
                if (!var45.field756.equals(var44)) {
                    var34.method3725(var43, var44, false);
                    return;
                }
                var34.method3720(var43, (byte) 26);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field2732[--field2744];
                if (var34.field9239 != 5 && arg0 == 1129 || var34.field9239 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field9291 != var46) {
                    var34.field9291 = var46;
                    class399.method2347(var34, 2260);
                }
                if (var34.field9277 == -1) {
                    class489.method2774(-127, var34.field9200);
                }
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class672 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class21.method225(65535, field2732[--field2744]);
            } else {
                var47 = arg1 ? field2746 : field2739;
            }
            class399.method2347(var47, 2260);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field2744 -= 2;
                int var48 = field2732[field2744];
                int var49 = field2732[field2744 + 1];
                if (var47.field9277 == -1) {
                    class760.method4230(var47.field9200, -32204);
                    class600.method3264(false, var47.field9200);
                    class565.method3122(var47.field9200, (byte) 120);
                }
                if (var48 == -1) {
                    var47.field9177 = 1;
                    var47.field9224 = -1;
                    var47.field9318 = -1;
                    return;
                }
                var47.field9318 = var48;
                var47.field9218 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field9267 = true;
                } else {
                    var47.field9267 = false;
                }
                class597 var50 = class77.field948.method1165((byte) 97, var48);
                var47.field9283 = var50.field7842;
                var47.field9164 = var50.field7803;
                var47.field9244 = var50.field7809;
                var47.field9235 = var50.field7772;
                var47.field9305 = var50.field7785;
                var47.field9320 = var50.field7768;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field9223 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field9223 = 1;
                } else {
                    var47.field9223 = 2;
                }
                if (var47.field9276 > 0) {
                    var47.field9320 = var47.field9320 * 32 / var47.field9276;
                    return;
                }
                if (var47.field9261 > 0) {
                    var47.field9320 = var47.field9320 * 32 / var47.field9261;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field9177 = 2;
                var47.field9224 = field2732[--field2744];
                if (var47.field9277 == -1) {
                    class251.method1536(var47.field9200, (byte) 117);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field9177 = 3;
                var47.field9224 = -1;
                if (var47.field9277 == -1) {
                    class251.method1536(var47.field9200, (byte) 117);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field9177 = 6;
                var47.field9224 = field2732[--field2744];
                if (var47.field9277 == -1) {
                    class251.method1536(var47.field9200, (byte) 117);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field9177 = 5;
                var47.field9224 = field2732[--field2744];
                if (var47.field9277 == -1) {
                    class251.method1536(var47.field9200, (byte) 117);
                }
                return;
            }
            if (arg0 == 1206) {
                field2744 -= 4;
                var47.field9246 = field2732[field2744];
                var47.field9234 = field2732[field2744 + 1];
                var47.field9328 = field2732[field2744 + 2];
                var47.field9333 = field2732[field2744 + 3];
                class399.method2347(var47, 2260);
                return;
            }
            if (arg0 == 1207) {
                field2744 -= 2;
                var47.field9176 = field2732[field2744];
                var47.field9284 = field2732[field2744 + 1];
                class399.method2347(var47, 2260);
                return;
            }
            if (arg0 == 1210) {
                field2744 -= 4;
                var47.field9224 = field2732[field2744];
                var47.field9293 = field2732[field2744 + 1];
                if (field2732[field2744 + 2] == 1) {
                    var47.field9177 = 9;
                } else {
                    var47.field9177 = 8;
                }
                if (field2732[field2744 + 3] == 1) {
                    var47.field9267 = true;
                } else {
                    var47.field9267 = false;
                }
                if (var47.field9277 == -1) {
                    class251.method1536(var47.field9200, (byte) 117);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field9177 = 5;
                var47.field9224 = class303.field4293;
                var47.field9293 = 0;
                if (var47.field9277 == -1) {
                    class251.method1536(var47.field9200, (byte) 117);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class672 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class21.method225(65535, field2732[--field2744]);
                } else {
                    var62 = arg1 ? field2746 : field2739;
                }
                if (arg0 == 1499) {
                    var62.method3721(false);
                    return;
                }
                String var63 = field2755[--field2736];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field2732[--field2744];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field2732[--field2744];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field2755[--field2736];
                    } else {
                        var66[var67] = Integer.valueOf(field2732[--field2744]);
                    }
                }
                int var68 = field2732[--field2744];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field9183 = var66;
                } else if (arg0 == 1401) {
                    var62.field9179 = var66;
                } else if (arg0 == 1402) {
                    var62.field9215 = var66;
                } else if (arg0 == 1403) {
                    var62.field9303 = var66;
                } else if (arg0 == 1404) {
                    var62.field9175 = var66;
                } else if (arg0 == 1405) {
                    var62.field9280 = var66;
                } else if (arg0 == 1406) {
                    var62.field9229 = var66;
                } else if (arg0 == 1407) {
                    var62.field9313 = var66;
                    var62.field9207 = var64;
                } else if (arg0 == 1408) {
                    var62.field9306 = var66;
                } else if (arg0 == 1409) {
                    var62.field9296 = var66;
                } else if (arg0 == 1410) {
                    var62.field9314 = var66;
                } else if (arg0 == 1411) {
                    var62.field9271 = var66;
                } else if (arg0 == 1412) {
                    var62.field9162 = var66;
                } else if (arg0 == 1414) {
                    var62.field9217 = var66;
                    var62.field9279 = var64;
                } else if (arg0 == 1415) {
                    var62.field9201 = var66;
                    var62.field9182 = var64;
                } else if (arg0 == 1416) {
                    var62.field9288 = var66;
                } else if (arg0 == 1417) {
                    var62.field9159 = var66;
                } else if (arg0 == 1418) {
                    var62.field9268 = var66;
                } else if (arg0 == 1419) {
                    var62.field9310 = var66;
                } else if (arg0 == 1420) {
                    var62.field9213 = var66;
                } else if (arg0 == 1421) {
                    var62.field9331 = var66;
                } else if (arg0 == 1422) {
                    var62.field9169 = var66;
                } else if (arg0 == 1423) {
                    var62.field9184 = var66;
                } else if (arg0 == 1424) {
                    var62.field9220 = var66;
                } else if (arg0 == 1425) {
                    var62.field9181 = var66;
                } else if (arg0 == 1426) {
                    var62.field9326 = var66;
                } else if (arg0 == 1427) {
                    var62.field9188 = var66;
                } else if (arg0 == 1428) {
                    var62.field9222 = var66;
                    var62.field9232 = var64;
                } else if (arg0 == 1429) {
                    var62.field9180 = var66;
                    var62.field9197 = var64;
                } else if (arg0 == 1430) {
                    var62.field9242 = var66;
                }
                var62.field9250 = true;
                return;
            }
            if (arg0 < 1600) {
                class672 var69 = arg1 ? field2746 : field2739;
                if (arg0 == 1500) {
                    field2732[field2744++] = var69.field9212;
                    return;
                }
                if (arg0 == 1501) {
                    field2732[field2744++] = var69.field9325;
                    return;
                }
                if (arg0 == 1502) {
                    field2732[field2744++] = var69.field9287;
                    return;
                }
                if (arg0 == 1503) {
                    field2732[field2744++] = var69.field9178;
                    return;
                }
                if (arg0 == 1504) {
                    field2732[field2744++] = var69.field9248 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field2732[field2744++] = var69.field9255;
                    return;
                }
                if (arg0 == 1506) {
                    class672 var70 = class442.method2542(false, var69);
                    field2732[field2744++] = var70 == null ? -1 : var70.field9200;
                    return;
                }
            } else if (arg0 < 1700) {
                class672 var71 = arg1 ? field2746 : field2739;
                if (arg0 == 1600) {
                    field2732[field2744++] = var71.field9216;
                    return;
                }
                if (arg0 == 1601) {
                    field2732[field2744++] = var71.field9226;
                    return;
                }
                if (arg0 == 1602) {
                    field2755[field2736++] = var71.field9205;
                    return;
                }
                if (arg0 == 1603) {
                    field2732[field2744++] = var71.field9329;
                    return;
                }
                if (arg0 == 1604) {
                    field2732[field2744++] = var71.field9300;
                    return;
                }
                if (arg0 == 1605) {
                    field2732[field2744++] = var71.field9320;
                    return;
                }
                if (arg0 == 1606) {
                    field2732[field2744++] = var71.field9283;
                    return;
                }
                if (arg0 == 1607) {
                    field2732[field2744++] = var71.field9244;
                    return;
                }
                if (arg0 == 1608) {
                    field2732[field2744++] = var71.field9164;
                    return;
                }
                if (arg0 == 1609) {
                    field2732[field2744++] = var71.field9299;
                    return;
                }
                if (arg0 == 1610) {
                    field2732[field2744++] = var71.field9235;
                    return;
                }
                if (arg0 == 1611) {
                    field2732[field2744++] = var71.field9305;
                    return;
                }
                if (arg0 == 1612) {
                    field2732[field2744++] = var71.field9209;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field2732[--field2744];
                    class62 var73 = class505.field6754.method4149(-6119, var72);
                    if (var73.method536(Integer.MAX_VALUE)) {
                        field2755[field2736++] = var71.method3723(var73.field756, -93, var72);
                        return;
                    }
                    field2732[field2744++] = var71.method3704(0, var72, var73.field761);
                    return;
                }
                if (arg0 == 1614) {
                    field2732[field2744++] = var71.field9208;
                    return;
                }
                if (arg0 == 2614) {
                    field2732[field2744++] = var71.field9177 == 1 ? var71.field9224 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class672 var74 = arg1 ? field2746 : field2739;
                if (arg0 == 1700) {
                    field2732[field2744++] = var74.field9318;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field9318 != -1) {
                        field2732[field2744++] = var74.field9218;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field2732[field2744++] = var74.field9277;
                    return;
                }
            } else if (arg0 < 1900) {
                class672 var75 = arg1 ? field2746 : field2739;
                if (arg0 == 1800) {
                    field2732[field2744++] = client.method1875(var75).method1351(2);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field2732[--field2744];
                    int var359 = var76 - 1;
                    if (var75.field9330 != null && var359 < var75.field9330.length && var75.field9330[var359] != null) {
                        field2755[field2736++] = var75.field9330[var359];
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field9165 == null) {
                        field2755[field2736++] = "";
                        return;
                    }
                    field2755[field2736++] = var75.field9165;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class672 var357;
                if (arg0 >= 2000) {
                    var357 = class21.method225(65535, field2732[--field2744]);
                    arg0 -= 1000;
                } else {
                    var357 = arg1 ? field2746 : field2739;
                }
                if (field2758 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var357.field9188 == null) {
                        return;
                    }
                    class309 var358 = new class309();
                    var358.field4435 = var357;
                    var358.field4439 = var357.field9188;
                    var358.field4436 = field2758 + 1;
                    class358.field5005.method11(var358, -91);
                    return;
                }
            } else if (arg0 < 2600) {
                class672 var77 = class21.method225(65535, field2732[--field2744]);
                if (arg0 == 2500) {
                    field2732[field2744++] = var77.field9212;
                    return;
                }
                if (arg0 == 2501) {
                    field2732[field2744++] = var77.field9325;
                    return;
                }
                if (arg0 == 2502) {
                    field2732[field2744++] = var77.field9287;
                    return;
                }
                if (arg0 == 2503) {
                    field2732[field2744++] = var77.field9178;
                    return;
                }
                if (arg0 == 2504) {
                    field2732[field2744++] = var77.field9248 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field2732[field2744++] = var77.field9255;
                    return;
                }
                if (arg0 == 1506) {
                    class672 var78 = class442.method2542(false, var77);
                    field2732[field2744++] = var78 == null ? -1 : var78.field9200;
                    return;
                }
            } else if (arg0 < 2700) {
                class672 var79 = class21.method225(65535, field2732[--field2744]);
                if (arg0 == 2600) {
                    field2732[field2744++] = var79.field9216;
                    return;
                }
                if (arg0 == 2601) {
                    field2732[field2744++] = var79.field9226;
                    return;
                }
                if (arg0 == 2602) {
                    field2755[field2736++] = var79.field9205;
                    return;
                }
                if (arg0 == 2603) {
                    field2732[field2744++] = var79.field9329;
                    return;
                }
                if (arg0 == 2604) {
                    field2732[field2744++] = var79.field9300;
                    return;
                }
                if (arg0 == 2605) {
                    field2732[field2744++] = var79.field9320;
                    return;
                }
                if (arg0 == 2606) {
                    field2732[field2744++] = var79.field9283;
                    return;
                }
                if (arg0 == 2607) {
                    field2732[field2744++] = var79.field9244;
                    return;
                }
                if (arg0 == 2608) {
                    field2732[field2744++] = var79.field9164;
                    return;
                }
                if (arg0 == 2609) {
                    field2732[field2744++] = var79.field9299;
                    return;
                }
                if (arg0 == 2610) {
                    field2732[field2744++] = var79.field9235;
                    return;
                }
                if (arg0 == 2611) {
                    field2732[field2744++] = var79.field9305;
                    return;
                }
                if (arg0 == 2612) {
                    field2732[field2744++] = var79.field9209;
                    return;
                }
                if (arg0 == 2613) {
                    field2732[field2744++] = var79.field9208;
                    return;
                }
                if (arg0 == 2614) {
                    field2732[field2744++] = var79.field9177 == 1 ? var79.field9224 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class672 var80 = class21.method225(65535, field2732[--field2744]);
                    field2732[field2744++] = var80.field9318;
                    return;
                }
                if (arg0 == 2701) {
                    class672 var81 = class21.method225(65535, field2732[--field2744]);
                    if (var81.field9318 != -1) {
                        field2732[field2744++] = var81.field9218;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field2732[--field2744];
                    class8 var83 = (class8) class350.field4925.method2135((long) var82, (byte) 31);
                    if (var83 != null) {
                        field2732[field2744++] = 1;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class672 var84 = class21.method225(65535, field2732[--field2744]);
                    if (var84.field9240 == null) {
                        field2732[field2744++] = 0;
                        return;
                    }
                    int var85 = var84.field9240.length;
                    for (int var86 = 0; var86 < var84.field9240.length; var86++) {
                        if (var84.field9240[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field2732[field2744++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field2744 -= 2;
                    int var87 = field2732[field2744];
                    int var88 = field2732[field2744 + 1];
                    class8 var89 = (class8) class350.field4925.method2135((long) var87, (byte) 31);
                    if (var89 != null && var89.field161 == var88) {
                        field2732[field2744++] = 1;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class672 var90 = class21.method225(65535, field2732[--field2744]);
                if (arg0 == 2800) {
                    field2732[field2744++] = client.method1875(var90).method1351(2);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field2732[--field2744];
                    int var360 = var91 - 1;
                    if (var90.field9330 != null && var360 < var90.field9330.length && var90.field9330[var360] != null) {
                        field2755[field2736++] = var90.field9330[var360];
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field9165 == null) {
                        field2755[field2736++] = "";
                        return;
                    }
                    field2755[field2736++] = var90.field9165;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field2755[--field2736];
                    class400.method2355(var92, false);
                    return;
                }
                if (arg0 == 3101) {
                    field2744 -= 2;
                    class272.method1632(field2732[field2744], field2732[field2744 + 1], class472.field6475, (byte) -83);
                    return;
                }
                if (arg0 == 3103) {
                    class689.method3877(true, (byte) 34);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field2755[--field2736];
                    int var94 = 0;
                    if (class259.method1574(var93, 10)) {
                        var94 = class397.method2337((byte) -120, var93);
                    }
                    field2752++;
                    class583 var95 = class381.method2246(1, class128.field2105, class719.field10020);
                    var95.field7637.method3798(27695, var94);
                    class42.method309(var95, 0);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field2755[--field2736];
                    field2735++;
                    class583 var97 = class381.method2246(1, class128.field2105, class435.field5989);
                    var97.field7637.method3823(-98, var96.length() + 1);
                    var97.field7637.method3795(var96, (byte) -119);
                    class42.method309(var97, 0);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field2755[--field2736];
                    field2745++;
                    class583 var99 = class381.method2246(1, class128.field2105, class483.field6603);
                    var99.field7637.method3823(-116, var98.length() + 1);
                    var99.field7637.method3795(var98, (byte) -90);
                    class42.method309(var99, 0);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field2732[--field2744];
                    String var101 = field2755[--field2736];
                    class362.method2154(var100, 12102, var101);
                    return;
                }
                if (arg0 == 3108) {
                    field2744 -= 3;
                    int var102 = field2732[field2744];
                    int var103 = field2732[field2744 + 1];
                    int var104 = field2732[field2744 + 2];
                    class672 var105 = class21.method225(65535, var104);
                    class155.method1128(var105, var102, var103, -105);
                    return;
                }
                if (arg0 == 3109) {
                    field2744 -= 2;
                    int var106 = field2732[field2744];
                    int var107 = field2732[field2744 + 1];
                    class672 var108 = arg1 ? field2746 : field2739;
                    class155.method1128(var108, var106, var107, -107);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field2732[--field2744];
                    field2737++;
                    class583 var110 = class381.method2246(1, class128.field2105, class631.field8407);
                    var110.field7637.method3831(1182, var109);
                    class42.method309(var110, 0);
                    return;
                }
                if (arg0 == 3111) {
                    field2744 -= 2;
                    int var111 = field2732[field2744];
                    int var112 = field2732[field2744 + 1];
                    class8 var113 = (class8) class350.field4925.method2135((long) var111, (byte) 31);
                    if (var113 != null) {
                        class710.method3990(false, true, var113.field161 != var112, var113);
                    }
                    class416.method2415(3, var112, var111, (byte) 122, true);
                    return;
                }
                if (arg0 == 3112) {
                    field2744--;
                    int var114 = field2732[field2744];
                    class8 var115 = (class8) class350.field4925.method2135((long) var114, (byte) 31);
                    if (var115 != null && var115.field157 == 3) {
                        class710.method3990(false, true, true, var115);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class51.method360(field2755[--field2736], 0);
                    return;
                }
                if (arg0 == 3114) {
                    field2744 -= 2;
                    int var116 = field2732[field2744];
                    int var117 = field2732[field2744 + 1];
                    String var118 = field2755[--field2736];
                    class494.method2789(var117, var118, "", (byte) -15, "", "", var116);
                    return;
                }
                if (arg0 == 3115) {
                    field2744 -= 11;
                    class311[] var119 = class439.method2534(-1);
                    class512[] var120 = class12.method106(-12865);
                    class511.method2857(field2732[field2744 + 8], field2732[field2744 + 2], field2732[field2744 + 9], field2732[field2744 + 5], var119[field2732[field2744]], var120[field2732[field2744 + 1]], field2732[field2744 + 10], field2732[field2744 + 4], field2732[field2744 + 3], field2732[field2744 + 6], (byte) 90, field2732[field2744 + 7]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field2744 -= 3;
                    class594.method3228(256, (byte) -76, field2732[field2744], field2732[field2744 + 2], 255, field2732[field2744 + 1]);
                    return;
                }
                if (arg0 == 3201) {
                    class104.method770(field2732[--field2744], 50, -92, 255);
                    return;
                }
                if (arg0 == 3202) {
                    field2744 -= 2;
                    class661.method3585(64, field2732[field2744], 255, field2732[field2744 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field2744 -= 4;
                    class594.method3228(256, (byte) 39, field2732[field2744], field2732[field2744 + 2], field2732[field2744 + 3], field2732[field2744 + 1]);
                    return;
                }
                if (arg0 == 3204) {
                    field2744 -= 3;
                    class104.method770(field2732[field2744], field2732[field2744 + 2], -121, field2732[field2744 + 1]);
                    return;
                }
                if (arg0 == 3205) {
                    field2744 -= 3;
                    class661.method3585(64, field2732[field2744], field2732[field2744 + 2], field2732[field2744 + 1]);
                    return;
                }
                if (arg0 == 3206) {
                    field2744 -= 4;
                    class291.method1804(false, field2732[field2744 + 3], field2732[field2744 + 1], field2732[field2744], 256, false, field2732[field2744 + 2]);
                    return;
                }
                if (arg0 == 3207) {
                    field2744 -= 4;
                    class291.method1804(false, field2732[field2744 + 3], field2732[field2744 + 1], field2732[field2744], 256, true, field2732[field2744 + 2]);
                    return;
                }
                if (arg0 == 3208) {
                    field2744 -= 5;
                    class594.method3228(field2732[field2744 + 4], (byte) -115, field2732[field2744], field2732[field2744 + 2], field2732[field2744 + 3], field2732[field2744 + 1]);
                    return;
                }
                if (arg0 == 3209) {
                    field2744 -= 5;
                    class291.method1804(false, field2732[field2744 + 3], field2732[field2744 + 1], field2732[field2744], field2732[field2744 + 4], false, field2732[field2744 + 2]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field2732[field2744++] = class29.field474;
                    return;
                }
                if (arg0 == 3301) {
                    field2744 -= 2;
                    int var121 = field2732[field2744];
                    int var122 = field2732[field2744 + 1];
                    field2732[field2744++] = class226.method1445(var121, (byte) -66, var122, false);
                    return;
                }
                if (arg0 == 3302) {
                    field2744 -= 2;
                    int var123 = field2732[field2744];
                    int var124 = field2732[field2744 + 1];
                    field2732[field2744++] = class502.method2830(false, (byte) 92, var123, var124);
                    return;
                }
                if (arg0 == 3303) {
                    field2744 -= 2;
                    int var125 = field2732[field2744];
                    int var126 = field2732[field2744 + 1];
                    field2732[field2744++] = class377.method2233(false, var125, var126, -52);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field2732[--field2744];
                    field2732[field2744++] = class520.field6929.method3343(var127, -4).field6188;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field2732[--field2744];
                    field2732[field2744++] = class91.field1104[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field2732[--field2744];
                    field2732[field2744++] = class520.field6940[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field2732[--field2744];
                    field2732[field2744++] = class101.field1415[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class472.field6475.field3508;
                    int var132 = (class472.field6475.field3505 >> 9) + class503.field6752;
                    int var133 = (class472.field6475.field3502 >> 9) + class334.field4757;
                    field2732[field2744++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field2732[--field2744];
                    field2732[field2744++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field2732[--field2744];
                    field2732[field2744++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field2732[--field2744];
                    field2732[field2744++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field2732[field2744++] = class142.field2266 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field2744 -= 2;
                    int var137 = field2732[field2744];
                    int var138 = field2732[field2744 + 1];
                    field2732[field2744++] = class226.method1445(var137, (byte) -101, var138, true);
                    return;
                }
                if (arg0 == 3314) {
                    field2744 -= 2;
                    int var139 = field2732[field2744];
                    int var140 = field2732[field2744 + 1];
                    field2732[field2744++] = class502.method2830(true, (byte) -59, var139, var140);
                    return;
                }
                if (arg0 == 3315) {
                    field2744 -= 2;
                    int var141 = field2732[field2744];
                    int var142 = field2732[field2744 + 1];
                    field2732[field2744++] = class377.method2233(true, var141, var142, -56);
                    return;
                }
                if (arg0 == 3316) {
                    if (class257.field3521 >= 2) {
                        field2732[field2744++] = class257.field3521;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field2732[field2744++] = class397.field5539;
                    return;
                }
                if (arg0 == 3318) {
                    field2732[field2744++] = class284.field4030.field7338;
                    return;
                }
                if (arg0 == 3321) {
                    field2732[field2744++] = class489.field6643;
                    return;
                }
                if (arg0 == 3322) {
                    field2732[field2744++] = class229.field3263;
                    return;
                }
                if (arg0 == 3323) {
                    if (class317.field4519 >= 5 && class317.field4519 <= 9) {
                        field2732[field2744++] = 1;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class317.field4519 >= 5 && class317.field4519 <= 9) {
                        field2732[field2744++] = class317.field4519;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field2732[field2744++] = class224.field3170 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field2732[field2744++] = class472.field6475.field5330;
                    return;
                }
                if (arg0 == 3327) {
                    field2732[field2744++] = class472.field6475.field5333 != null && class472.field6475.field5333.field4574 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field2732[field2744++] = class433.field5956 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field2732[--field2744];
                    field2732[field2744++] = class548.method3065((byte) 56, false, var143);
                    return;
                }
                if (arg0 == 3331) {
                    field2744 -= 2;
                    int var144 = field2732[field2744];
                    int var145 = field2732[field2744 + 1];
                    field2732[field2744++] = class294.method1819((byte) 122, false, false, var144, var145);
                    return;
                }
                if (arg0 == 3332) {
                    field2744 -= 2;
                    int var146 = field2732[field2744];
                    int var147 = field2732[field2744 + 1];
                    field2732[field2744++] = class294.method1819((byte) 124, true, false, var146, var147);
                    return;
                }
                if (arg0 == 3333) {
                    field2732[field2744++] = class758.field10539;
                    return;
                }
                if (arg0 == 3335) {
                    field2732[field2744++] = class713.field9854;
                    return;
                }
                if (arg0 == 3336) {
                    field2744 -= 4;
                    int var148 = field2732[field2744];
                    int var149 = field2732[field2744 + 1];
                    int var150 = field2732[field2744 + 2];
                    int var151 = field2732[field2744 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field2732[field2744++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field2732[field2744++] = class236.field3316;
                    return;
                }
                if (arg0 == 3338) {
                    field2732[field2744++] = class256.method1556((byte) -109);
                    return;
                }
                if (arg0 == 3339) {
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field2732[field2744++] = class709.field9831 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field2732[field2744++] = class289.field4122 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field2732[field2744++] = class569.field7492.method780((byte) -89);
                    return;
                }
                if (arg0 == 3343) {
                    field2732[field2744++] = class569.field7492.method772(91);
                    return;
                }
                if (arg0 == 3344) {
                    field2755[field2736++] = class408.method2386(108);
                    return;
                }
                if (arg0 == 3345) {
                    field2755[field2736++] = class173.method1218(-83);
                    return;
                }
                if (arg0 == 3346) {
                    field2732[field2744++] = class228.method1453((byte) -94);
                    return;
                }
                if (arg0 == 3347) {
                    field2732[field2744++] = class379.field5281;
                    return;
                }
                if (arg0 == 3349) {
                    field2732[field2744++] = class472.field6475.field10284.method2097((byte) -76) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field2744 -= 2;
                    int var155 = field2732[field2744];
                    int var156 = field2732[field2744 + 1];
                    class305 var157 = class353.field4974.method2959(var155, (byte) -55);
                    field2755[field2736++] = var157.method1892(44, var156);
                    return;
                }
                if (arg0 == 3408) {
                    field2744 -= 4;
                    int var158 = field2732[field2744];
                    int var159 = field2732[field2744 + 1];
                    int var160 = field2732[field2744 + 2];
                    int var161 = field2732[field2744 + 3];
                    class305 var162 = class353.field4974.method2959(var160, (byte) -128);
                    if (var162.field4389 == var158 && var162.field4380 == var159) {
                        if (var159 == 115) {
                            field2755[field2736++] = var162.method1892(56, var161);
                            return;
                        }
                        field2732[field2744++] = var162.method1886((byte) -123, var161);
                        return;
                    }
                    throw new RuntimeException("C3408-1 " + var160 + "-" + var161);
                }
                if (arg0 == 3409) {
                    field2744 -= 3;
                    int var163 = field2732[field2744];
                    int var164 = field2732[field2744 + 1];
                    int var165 = field2732[field2744 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class305 var166 = class353.field4974.method2959(var164, (byte) -72);
                    if (var166.field4380 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field2732[field2744++] = var166.method1893(var165, 78) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field2732[--field2744];
                    String var168 = field2755[--field2736];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class305 var169 = class353.field4974.method2959(var167, (byte) -60);
                    if (var169.field4380 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field2732[field2744++] = var169.method1887(var168, 5) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field2732[--field2744];
                    class305 var171 = class353.field4974.method2959(var170, (byte) -119);
                    field2732[field2744++] = var171.field4388.method2147((byte) 32);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class97.field1204 == 0) {
                        field2732[field2744++] = -2;
                        return;
                    }
                    if (class97.field1204 == 1) {
                        field2732[field2744++] = -1;
                        return;
                    }
                    field2732[field2744++] = client.field4355;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field2732[--field2744];
                    if (class97.field1204 == 2 && var172 < client.field4355) {
                        field2755[field2736++] = class549.field7252[var172];
                        if (class238.field3361[var172] != null) {
                            field2755[field2736++] = class238.field3361[var172];
                            return;
                        }
                        field2755[field2736++] = "";
                        return;
                    }
                    field2755[field2736++] = "";
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field2732[--field2744];
                    if (class97.field1204 == 2 && var173 < client.field4355) {
                        field2732[field2744++] = class458.field6255[var173];
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field2732[--field2744];
                    if (class97.field1204 == 2 && var174 < client.field4355) {
                        field2732[field2744++] = class575.field7555[var174];
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field2755[--field2736];
                    int var176 = field2732[--field2744];
                    class253.method1543(var176, 1, var175);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field2755[--field2736];
                    class620.method3415((byte) -128, var177);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field2755[--field2736];
                    class509.method2854(var178, (byte) -105);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field2755[--field2736];
                    class656.method3563(var179, 92, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field2755[--field2736];
                    class339.method2038(28678, var180);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field2755[--field2736];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field2732[field2744++] = class385.method2286(var181, 124) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field2732[--field2744];
                    if (class97.field1204 == 2 && var182 < client.field4355) {
                        field2755[field2736++] = class88.field1077[var182];
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class31.field492 != null) {
                        field2755[field2736++] = class33.method277(class31.field492, -1);
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class31.field492 != null) {
                        field2732[field2744++] = class185.field2803;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field2732[--field2744];
                    if (class31.field492 != null && var183 < class185.field2803) {
                        field2755[field2736++] = class732.field10141[var183].field3976;
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field2732[--field2744];
                    if (class31.field492 != null && var184 < class185.field2803) {
                        field2732[field2744++] = class732.field10141[var184].field3983;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field2732[--field2744];
                    if (class31.field492 != null && var185 < class185.field2803) {
                        field2732[field2744++] = class732.field10141[var185].field3980;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field2732[field2744++] = class689.field9592;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field2755[--field2736];
                    class157.method1137(-76, var186);
                    return;
                }
                if (arg0 == 3618) {
                    field2732[field2744++] = class670.field9146;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field2755[--field2736];
                    class706.method3971(false, var187);
                    return;
                }
                if (arg0 == 3620) {
                    class137.method1062((byte) 17);
                    return;
                }
                if (arg0 == 3621) {
                    if (class97.field1204 == 0) {
                        field2732[field2744++] = -1;
                        return;
                    }
                    field2732[field2744++] = class543.field7184;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field2732[--field2744];
                    if (class97.field1204 != 0 && var188 < class543.field7184) {
                        field2755[field2736++] = class756.field10526[var188];
                        if (class13.field202[var188] != null) {
                            field2755[field2736++] = class13.field202[var188];
                            return;
                        }
                        field2755[field2736++] = "";
                        return;
                    }
                    field2755[field2736++] = "";
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field2755[--field2736];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field2732[field2744++] = class36.method294(127, var189) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field2732[--field2744];
                    if (class732.field10141 != null && var190 < class185.field2803 && class732.field10141[var190].field3977.equalsIgnoreCase(class472.field6475.field5334)) {
                        field2732[field2744++] = 1;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class445.field6117 != null) {
                        field2755[field2736++] = class445.field6117;
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field2732[--field2744];
                    if (class31.field492 != null && var191 < class185.field2803) {
                        field2755[field2736++] = class732.field10141[var191].field3972;
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field2732[--field2744];
                    if (class97.field1204 == 2 && var192 >= 0 && var192 < client.field4355) {
                        field2732[field2744++] = class661.field8720[var192] ? 1 : 0;
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field2755[--field2736];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field2732[field2744++] = class636.method3489((byte) -85, var193);
                    return;
                }
                if (arg0 == 3629) {
                    field2732[field2744++] = class75.field915;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field2755[--field2736];
                    class656.method3563(var194, 92, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field2732[--field2744];
                    field2732[field2744++] = class414.field5732[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field2732[--field2744];
                    if (class31.field492 != null && var196 < class185.field2803) {
                        field2755[field2736++] = class732.field10141[var196].field3977;
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field2732[--field2744];
                    if (class97.field1204 != 0 && var197 < class543.field7184) {
                        field2755[field2736++] = class310.field4452[var197];
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field2732[--field2744];
                    field2732[field2744++] = class369.field5148[var198].method3331(-101);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field2732[--field2744];
                    field2732[field2744++] = class369.field5148[var199].field8152;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field2732[--field2744];
                    field2732[field2744++] = class369.field5148[var200].field8147;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field2732[--field2744];
                    field2732[field2744++] = class369.field5148[var201].field8157;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field2732[--field2744];
                    field2732[field2744++] = class369.field5148[var202].field8156;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field2732[--field2744];
                    field2732[field2744++] = class369.field5148[var203].field8149;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field2732[--field2744];
                    int var205 = class369.field5148[var204].method3332(-1);
                    field2732[field2744++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field2732[--field2744];
                    int var207 = class369.field5148[var206].method3332(-1);
                    field2732[field2744++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field2732[--field2744];
                    int var209 = class369.field5148[var208].method3332(-1);
                    field2732[field2744++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field2732[--field2744];
                    int var211 = class369.field5148[var210].method3332(-1);
                    field2732[field2744++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field2744 -= 2;
                    int var212 = field2732[field2744];
                    int var213 = field2732[field2744 + 1];
                    field2732[field2744++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field2744 -= 2;
                    int var214 = field2732[field2744];
                    int var215 = field2732[field2744 + 1];
                    field2732[field2744++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field2744 -= 2;
                    int var216 = field2732[field2744];
                    int var217 = field2732[field2744 + 1];
                    field2732[field2744++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field2744 -= 2;
                    int var218 = field2732[field2744];
                    int var219 = field2732[field2744 + 1];
                    field2732[field2744++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field2732[--field2744];
                    field2732[field2744++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field2732[--field2744];
                    field2732[field2744++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field2744 -= 5;
                    int var222 = field2732[field2744];
                    int var223 = field2732[field2744 + 1];
                    int var224 = field2732[field2744 + 2];
                    int var225 = field2732[field2744 + 3];
                    int var226 = field2732[field2744 + 4];
                    field2732[field2744++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field2744 -= 2;
                    long var227 = (long) field2732[field2744];
                    long var229 = (long) field2732[field2744 + 1];
                    field2732[field2744++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field2744 -= 2;
                    int var231 = field2732[field2744];
                    int var232 = field2732[field2744 + 1];
                    field2732[field2744++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field2744 -= 2;
                    int var233 = field2732[field2744];
                    int var234 = field2732[field2744 + 1];
                    field2732[field2744++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field2744 -= 2;
                    int var235 = field2732[field2744];
                    int var236 = field2732[field2744 + 1];
                    field2732[field2744++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field2744 -= 2;
                    int var237 = field2732[field2744];
                    int var238 = field2732[field2744 + 1];
                    field2732[field2744++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field2744 -= 2;
                    int var239 = field2732[field2744];
                    int var240 = field2732[field2744 + 1];
                    if (var239 == 0) {
                        field2732[field2744++] = 0;
                        return;
                    }
                    field2732[field2744++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field2744 -= 2;
                    int var241 = field2732[field2744];
                    int var242 = field2732[field2744 + 1];
                    if (var241 == 0) {
                        field2732[field2744++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field2732[field2744++] = Integer.MAX_VALUE;
                        return;
                    }
                    field2732[field2744++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field2744 -= 2;
                    int var243 = field2732[field2744];
                    int var244 = field2732[field2744 + 1];
                    field2732[field2744++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field2744 -= 2;
                    int var245 = field2732[field2744];
                    int var246 = field2732[field2744 + 1];
                    field2732[field2744++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field2744 -= 2;
                    int var247 = field2732[field2744];
                    int var248 = field2732[field2744 + 1];
                    field2732[field2744++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field2744 -= 2;
                    int var249 = field2732[field2744];
                    int var250 = field2732[field2744 + 1];
                    field2732[field2744++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field2744 -= 3;
                    long var251 = (long) field2732[field2744];
                    long var253 = (long) field2732[field2744 + 1];
                    long var255 = (long) field2732[field2744 + 2];
                    field2732[field2744++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field2744 -= 2;
                    int var257 = field2732[field2744];
                    int var258 = field2732[field2744 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field2732[field2744++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field2732[field2744++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field2755[--field2736];
                    int var262 = field2732[--field2744];
                    field2755[field2736++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field2736 -= 2;
                    String var263 = field2755[field2736];
                    String var264 = field2755[field2736 + 1];
                    field2755[field2736++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field2755[--field2736];
                    int var266 = field2732[--field2744];
                    field2755[field2736++] = var265 + class684.method3860(var266, true, (byte) 127);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field2755[--field2736];
                    field2755[field2736++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field2755[field2736++] = class2.method24(class713.field9854, (byte) 91, class594.method3229(field2732[--field2744], -9320));
                    return;
                }
                if (arg0 == 4105) {
                    field2736 -= 2;
                    String var268 = field2755[field2736];
                    String var269 = field2755[field2736 + 1];
                    if (class472.field6475.field5333 != null && class472.field6475.field5333.field4574) {
                        field2755[field2736++] = var269;
                        return;
                    }
                    field2755[field2736++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field2732[--field2744];
                    field2755[field2736++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field2736 -= 2;
                    field2732[field2744++] = class392.method2319(field2755[field2736], class713.field9854, 0, field2755[field2736 + 1]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field2755[--field2736];
                    field2744 -= 2;
                    int var272 = field2732[field2744];
                    int var273 = field2732[field2744 + 1];
                    class539 var274 = class313.method1919(0, -128, var273, class275.field3836);
                    field2732[field2744++] = var274.method2999(var271, (byte) -46, class679.field9485, var272);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field2755[--field2736];
                    field2744 -= 2;
                    int var276 = field2732[field2744];
                    int var277 = field2732[field2744 + 1];
                    class539 var278 = class313.method1919(0, -128, var277, class275.field3836);
                    field2732[field2744++] = var278.method3003(var275, -123, class679.field9485, var276);
                    return;
                }
                if (arg0 == 4110) {
                    field2736 -= 2;
                    String var279 = field2755[field2736];
                    String var280 = field2755[field2736 + 1];
                    if (field2732[--field2744] == 1) {
                        field2755[field2736++] = var279;
                        return;
                    }
                    field2755[field2736++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field2755[--field2736];
                    field2755[field2736++] = class747.method4184(-40, var281);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field2755[--field2736];
                    int var283 = field2732[--field2744];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field2755[field2736++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field2732[--field2744];
                    field2732[field2744++] = method1255((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field2732[--field2744];
                    field2732[field2744++] = class460.method2619(65, (char) var285) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field2732[--field2744];
                    field2732[field2744++] = class149.method1114((byte) -7, (char) var286) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field2732[--field2744];
                    field2732[field2744++] = class737.method4120((char) var287, (byte) -79) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field2755[--field2736];
                    if (var288 != null) {
                        field2732[field2744++] = var288.length();
                        return;
                    }
                    field2732[field2744++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field2755[--field2736];
                    field2744 -= 2;
                    int var290 = field2732[field2744];
                    int var291 = field2732[field2744 + 1];
                    field2755[field2736++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field2755[--field2736];
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
                    field2755[field2736++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field2755[--field2736];
                    field2744 -= 2;
                    int var298 = field2732[field2744];
                    int var299 = field2732[field2744 + 1];
                    field2732[field2744++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field2736 -= 2;
                    String var300 = field2755[field2736];
                    String var301 = field2755[field2736 + 1];
                    int var302 = field2732[--field2744];
                    field2732[field2744++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field2732[--field2744];
                    field2732[field2744++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field2732[--field2744];
                    field2732[field2744++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field2732[--field2744] != 0;
                    int var306 = field2732[--field2744];
                    field2755[field2736++] = class307.method1897((byte) -121, 0, (long) var306, class713.field9854, var305);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field2755[--field2736];
                    int var308 = field2732[--field2744];
                    class539 var309 = class313.method1919(0, -127, var308, class275.field3836);
                    field2732[field2744++] = var309.method3004(215, var307, class679.field9485);
                    return;
                }
                if (arg0 == 4126) {
                    field2755[field2736++] = class671.method3701(class713.field9854, true, (long) field2732[--field2744] * 60000L);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field2732[--field2744];
                    field2755[field2736++] = class77.field948.method1165((byte) 66, var310).field7763;
                    return;
                }
                if (arg0 == 4201) {
                    field2744 -= 2;
                    int var311 = field2732[field2744];
                    int var312 = field2732[field2744 + 1];
                    class597 var313 = class77.field948.method1165((byte) 70, var311);
                    if (var312 >= 1 && var312 <= 5 && var313.field7765[var312 - 1] != null) {
                        field2755[field2736++] = var313.field7765[var312 - 1];
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field2744 -= 2;
                    int var314 = field2732[field2744];
                    int var315 = field2732[field2744 + 1];
                    class597 var316 = class77.field948.method1165((byte) 67, var314);
                    if (var315 >= 1 && var315 <= 5 && var316.field7762[var315 - 1] != null) {
                        field2755[field2736++] = var316.field7762[var315 - 1];
                        return;
                    }
                    field2755[field2736++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field2732[--field2744];
                    field2732[field2744++] = class77.field948.method1165((byte) 99, var317).field7814;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field2732[--field2744];
                    field2732[field2744++] = class77.field948.method1165((byte) 100, var318).field7832 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field2732[--field2744];
                    class597 var320 = class77.field948.method1165((byte) 126, var319);
                    if (var320.field7808 == -1 && var320.field7793 >= 0) {
                        field2732[field2744++] = var320.field7793;
                        return;
                    }
                    field2732[field2744++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field2732[--field2744];
                    class597 var322 = class77.field948.method1165((byte) 89, var321);
                    if (var322.field7808 >= 0 && var322.field7793 >= 0) {
                        field2732[field2744++] = var322.field7793;
                        return;
                    }
                    field2732[field2744++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field2732[--field2744];
                    field2732[field2744++] = class77.field948.method1165((byte) 115, var323).field7799 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field2744 -= 2;
                    int var324 = field2732[field2744];
                    int var325 = field2732[field2744 + 1];
                    class62 var326 = class505.field6754.method4149(-6119, var325);
                    if (var326.method536(Integer.MAX_VALUE)) {
                        field2755[field2736++] = class77.field948.method1165((byte) 126, var324).method3256(var326.field756, var325, 5);
                        return;
                    }
                    field2732[field2744++] = class77.field948.method1165((byte) 96, var324).method3259(var326.field761, -1, var325);
                    return;
                }
                if (arg0 == 4209) {
                    field2744 -= 2;
                    int var327 = field2732[field2744];
                    int var328 = field2732[field2744 + 1] - 1;
                    class597 var329 = class77.field948.method1165((byte) 71, var327);
                    if (var329.field7760 == var328) {
                        field2732[field2744++] = var329.field7791;
                        return;
                    }
                    if (var329.field7790 == var328) {
                        field2732[field2744++] = var329.field7831;
                        return;
                    }
                    field2732[field2744++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field2755[--field2736];
                    int var331 = field2732[--field2744];
                    class10.method98(var331 == 1, var330, (byte) 38);
                    field2732[field2744++] = class284.field4022;
                    return;
                }
                if (arg0 == 4211) {
                    if (class468.field6429 != null && class80.field964 < class284.field4022) {
                        field2732[field2744++] = class468.field6429[class80.field964++] & 0xFFFF;
                        return;
                    }
                    field2732[field2744++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class80.field964 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field2732[--field2744];
                    field2732[field2744++] = class77.field948.method1165((byte) 76, var332).field7839;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field2755[--field2736];
                    field2744 -= 3;
                    int var334 = field2732[field2744];
                    int var335 = field2732[field2744 + 1];
                    int var336 = field2732[field2744 + 2];
                    class538.method2985(255, var333, var335, var336, var334 == 1);
                    field2732[field2744++] = class284.field4022;
                    return;
                }
                if (arg0 == 4215) {
                    field2736 -= 2;
                    field2744 -= 2;
                    String var337 = field2755[field2736];
                    int var338 = field2732[field2744];
                    int var339 = field2732[field2744 + 1];
                    String var340 = field2755[field2736 + 1];
                    class701.method3949(var340, var338 == 1, 126, var339, var337);
                    field2732[field2744++] = class284.field4022;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field2744 -= 2;
                    int var341 = field2732[field2744];
                    int var342 = field2732[field2744 + 1];
                    class62 var343 = class505.field6754.method4149(-6119, var342);
                    if (var343.method536(Integer.MAX_VALUE)) {
                        field2755[field2736++] = class292.field4177.method2358(var341, 8881).method1192(var342, 0, var343.field756);
                        return;
                    }
                    field2732[field2744++] = class292.field4177.method2358(var341, 8881).method1197(-156, var343.field761, var342);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field2744 -= 2;
                    int var344 = field2732[field2744];
                    int var345 = field2732[field2744 + 1];
                    class62 var346 = class505.field6754.method4149(-6119, var345);
                    if (var346.method536(Integer.MAX_VALUE)) {
                        field2755[field2736++] = class462.field6333.method2008((byte) -91, var344).method745(var346.field756, -88, var345);
                        return;
                    }
                    field2732[field2744++] = class462.field6333.method2008((byte) -63, var344).method740(-86, var346.field761, var345);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field2744 -= 2;
                    int var347 = field2732[field2744];
                    int var348 = field2732[field2744 + 1];
                    class62 var349 = class505.field6754.method4149(-6119, var348);
                    if (var349.method536(Integer.MAX_VALUE)) {
                        field2755[field2736++] = class417.field5754.method1215(var347, (byte) 105).method1639(var348, (byte) -100, var349.field756);
                        return;
                    }
                    field2732[field2744++] = class417.field5754.method1215(var347, (byte) -74).method1643(var349.field761, 0, var348);
                    return;
                }
            } else if (arg0 < 4700) {
                if (arg0 == 4600) {
                    int var350 = field2732[--field2744];
                    class98 var351 = class372.field5174.method3205(-20408, var350);
                    if (var351.field1236 != null && var351.field1236.length > 0) {
                        int var352 = 0;
                        int var353 = var351.field1245[0];
                        for (int var354 = 1; var354 < var351.field1236.length; var354++) {
                            if (var351.field1245[var354] > var353) {
                                var352 = var354;
                                var353 = var351.field1245[var354];
                            }
                        }
                        field2732[field2744++] = var351.field1236[var352];
                        return;
                    }
                    field2732[field2744++] = var351.field1248;
                    return;
                }
            } else if (arg0 < 4800) {
                if (arg0 == 4700) {
                    field2732[field2744++] = class404.field5629 ? 1 : 0;
                    return;
                }
                if (arg0 == 4701) {
                    String var355 = field2755[--field2736];
                    if (class15.field215 == 7 && class597.field7823 == 0) {
                        if (var355.length() > 20) {
                            class165.field2499 = -4;
                            return;
                        }
                        class583 var356 = class381.method2246(1, class128.field2105, class320.field4560);
                        var356.field7637.method3795(var355, (byte) -111);
                        class42.method309(var356, 0);
                        return;
                    }
                    class165.field2499 = -5;
                    return;
                }
                if (arg0 == 4702) {
                    field2732[field2744++] = class165.field2499;
                    class165.field2499 = -1;
                    return;
                }
            }
        } else {
            class672 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class21.method225(65535, field2732[--field2744]);
            } else {
                var51 = arg1 ? field2746 : field2739;
            }
            if (arg0 == 1300) {
                int var52 = field2732[--field2744] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method3712(field2755[--field2736], true, var52);
                    return;
                }
                field2736--;
                return;
            }
            if (arg0 == 1301) {
                field2744 -= 2;
                int var53 = field2732[field2744];
                int var54 = field2732[field2744 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field9227 = null;
                    return;
                }
                var51.field9227 = class239.method1503(var53, var54, 0);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field2732[--field2744];
                if (class735.field10166 != var55 && class517.field6904 != var55 && class59.field710 != var55) {
                    return;
                }
                var51.field9301 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field9202 = field2732[--field2744];
                return;
            }
            if (arg0 == 1304) {
                var51.field9166 = field2732[--field2744];
                return;
            }
            if (arg0 == 1305) {
                var51.field9165 = field2755[--field2736];
                return;
            }
            if (arg0 == 1306) {
                var51.field9238 = field2755[--field2736];
                return;
            }
            if (arg0 == 1307) {
                var51.field9330 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field9233 = field2732[--field2744];
                var51.field9231 = field2732[--field2744];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field2732[--field2744];
                int var57 = field2732[--field2744];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method3706((byte) -53, var57 - 1, var56);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field9260 = field2755[--field2736];
                return;
            }
            if (arg0 == 1311) {
                var51.field9252 = field2732[--field2744];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field2744 -= 3;
                    var58 = field2732[field2744] - 1;
                    var59 = field2732[field2744 + 1];
                    var60 = field2732[field2744 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field2744 -= 2;
                    var58 = 10;
                    var59 = field2732[field2744];
                    var60 = field2732[field2744 + 1];
                }
                if (var51.field9262 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field9262 = new byte[11];
                    var51.field9285 = new byte[11];
                    var51.field9167 = new int[11];
                }
                var51.field9262[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field9251 = false;
                    for (int var61 = 0; var61 < var51.field9262.length; var61++) {
                        if (var51.field9262[var61] != 0) {
                            var51.field9251 = true;
                            break;
                        }
                    }
                } else {
                    var51.field9251 = true;
                }
                var51.field9285[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field9249 = field2732[--field2744];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)V")
    private static final void method1260(int arg0) {
        class672 var1 = class21.method225(65535, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class672[] var3 = class580.field7607[var2];
        if (var3 == null) {
            class672[] var4 = class747.field10393[var2];
            int var5 = var4.length;
            var3 = class580.field7607[var2] = new class672[var5];
            class335.method2017(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class335.method2017(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }
}
