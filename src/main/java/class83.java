import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public class class83 {

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "[I")
    private static int[] field1492 = new int[1000];

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "[Ljava/lang/String;")
    private static String[] field1495 = new String[1000];

    @OriginalMember(owner = "client!kca", name = "f", descriptor = "I")
    private static int field1497 = 0;

    @OriginalMember(owner = "client!kca", name = "m", descriptor = "[[I")
    private static int[][] field1504 = new int[5][5000];

    @OriginalMember(owner = "client!kca", name = "v", descriptor = "I")
    private static int field1513 = 0;

    @OriginalMember(owner = "client!kca", name = "x", descriptor = "[I")
    private static int[] field1515 = new int[5];

    @OriginalMember(owner = "client!kca", name = "y", descriptor = "I")
    private static int field1516 = 0;

    @OriginalMember(owner = "client!kca", name = "t", descriptor = "[Lqea;")
    private static class129[] field1511 = new class129[50];

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "Ljava/util/Calendar;")
    private static Calendar field1503 = Calendar.getInstance();

    @OriginalMember(owner = "client!kca", name = "A", descriptor = "[I")
    private static int[] field1518 = new int[3];

    @OriginalMember(owner = "client!kca", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field1519 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!kca", name = "z", descriptor = "Ljr;")
    public static class112 field1517 = new class112(4);

    @OriginalMember(owner = "client!kca", name = "C", descriptor = "I")
    private static int field1520 = 0;

    @OriginalMember(owner = "client!kca", name = "e", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!kca", name = "h", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "I")
    public static int field1500;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!kca", name = "n", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!kca", name = "o", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!kca", name = "q", descriptor = "I")
    public static int field1508;

    @OriginalMember(owner = "client!kca", name = "r", descriptor = "I")
    public static int field1509;

    @OriginalMember(owner = "client!kca", name = "s", descriptor = "I")
    public static int field1510;

    @OriginalMember(owner = "client!kca", name = "w", descriptor = "I")
    public static int field1514;

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "Lat;")
    private static class378 field1493;

    @OriginalMember(owner = "client!kca", name = "u", descriptor = "Lat;")
    private static class378 field1512;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "Liia;")
    private static class88 field1494;

    @OriginalMember(owner = "client!kca", name = "p", descriptor = "[I")
    private static int[] field1507;

    @OriginalMember(owner = "client!kca", name = "g", descriptor = "[Ljava/lang/String;")
    private static String[] field1498;

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Luw;II)V", line = 5)
    public static final void method784(class418 arg0, int arg1, int arg2) {
        class634 var3 = class337.method2134(arg1, arg2, 96837648, arg0);
        if (var3 == null) {
            return;
        }
        field1507 = new int[var3.field8708];
        field1498 = new String[var3.field8709];
        if (class367.field5231 == var3.field8711 || class659.field9028 == var3.field8711 || class377.field5341 == var3.field8711) {
            int var4 = 0;
            int var5 = 0;
            if (class445.field6321 != null) {
                var4 = class445.field6321.field5476;
                var5 = class445.field6321.field5426;
            }
            field1507[0] = class284.field3963.method574(true) - var4;
            field1507[1] = class284.field3963.method571((byte) 80) - var5;
        }
        method794(var3, 200000);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V", line = 33)
    private static final void method785(int arg0) {
        class378 var1 = class60.method633(1512932720, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class378[] var3 = class605.field8299[var2];
        if (var3 == null) {
            class378[] var4 = class396.field5798[var2];
            int var5 = var4.length;
            var3 = class605.field8299[var2] = new class378[var5];
            class363.method2317(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class363.method2317(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(I)V", line = 75)
    public static final void method786(int arg0) {
        if (arg0 == -1 || !class722.method4007(arg0, (byte) 84)) {
            return;
        }
        class378[] var1 = class396.field5798[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class378 var3 = var1[var2];
            if (var3.field5491 != null) {
                class33 var4 = new class33();
                var4.field847 = var3;
                var4.field845 = var3.field5491;
                method795(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(IZ)V", line = 106)
    private static final void method787(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field1492[field1516++] = class415.field6008;
                return;
            }
            if (arg0 == 5001) {
                field1516 -= 3;
                class415.field6008 = field1492[field1516];
                class335.field4733 = class479.method2805((byte) -57, field1492[field1516 + 1]);
                if (class335.field4733 == null) {
                    class335.field4733 = class431.field6175;
                }
                class316.field4373 = field1492[field1516 + 2];
                field1499++;
                class564 var2 = class227.method1594(class423.field6103, class72.field1320, -111);
                var2.field7778.method1526(false, class415.field6008);
                var2.field7778.method1526(false, class335.field4733.field1292);
                var2.field7778.method1526(false, class316.field4373);
                class167.method1260(-77, var2);
                return;
            }
            if (arg0 == 5002) {
                field1513 -= 2;
                String var3 = field1495[field1513];
                String var4 = field1495[field1513 + 1];
                field1516 -= 2;
                int var5 = field1492[field1516];
                int var6 = field1492[field1516 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field1500++;
                class564 var7 = class227.method1594(class597.field8154, class72.field1320, -117);
                var7.field7778.method1526(false, class621.method3541(var3, -65) + class621.method3541(var4, -65) + 2);
                var7.field7778.method1481((byte) -5, var3);
                var7.field7778.method1526(false, var5 - 1);
                var7.field7778.method1526(false, var6);
                var7.field7778.method1481((byte) -5, var4);
                class167.method1260(-85, var7);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field1492[--field1516];
                class649 var9 = class281.method1852(-101, var8);
                String var10 = "";
                if (var9 != null && var9.field8927 != null) {
                    var10 = var9.field8927;
                }
                field1495[field1513++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field1492[--field1516];
                class649 var12 = class281.method1852(-101, var11);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field8931;
                }
                field1492[field1516++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class335.field4733 == null) {
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = class335.field4733.field1292;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field1492[--field1516];
                class564 var15 = class227.method1594(class498.field6968, class72.field1320, -100);
                var15.field7778.method1526(false, var14);
                class167.method1260(-70, var15);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field1495[--field1513];
                method790(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field1513 -= 2;
                String var17 = field1495[field1513];
                String var18 = field1495[field1513 + 1];
                if (class476.field6653 != 0 || (!class175.field2705 || class405.field5941) && !class748.field10364) {
                    field1502++;
                    class564 var19 = class227.method1594(class459.field6481, class72.field1320, -116);
                    var19.field7778.method1526(false, 0);
                    int var20 = var19.field7778.field3109;
                    var19.field7778.method1481((byte) -5, var17);
                    class376.method2376(var19.field7778, -70, var18);
                    var19.field7778.method1487(109, var19.field7778.field3109 - var20);
                    class167.method1260(2, var19);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field1492[--field1516];
                class649 var22 = class281.method1852(-101, var21);
                String var23 = "";
                if (var22 != null && var22.field8923 != null) {
                    var23 = var22.field8923;
                }
                field1495[field1513++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field1492[--field1516];
                class649 var25 = class281.method1852(-101, var24);
                String var26 = "";
                if (var25 != null && var25.field8921 != null) {
                    var26 = var25.field8921;
                }
                field1495[field1513++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field1492[--field1516];
                class649 var28 = class281.method1852(-101, var27);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field8925;
                }
                field1492[field1516++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class58.field1147 == null || class58.field1147.field8182 == null) {
                    var30 = "";
                } else {
                    var30 = class58.field1147.method3404(true, 255);
                }
                field1495[field1513++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field1492[field1516++] = class316.field4373;
                return;
            }
            if (arg0 == 5017) {
                field1492[field1516++] = class235.method1640(-1);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field1492[--field1516];
                class649 var32 = class281.method1852(-101, var31);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field8926;
                }
                field1492[field1516++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field1492[--field1516];
                class649 var35 = class281.method1852(-101, var34);
                String var36 = "";
                if (var35 != null && var35.field8932 != null) {
                    var36 = var35.field8932;
                }
                field1495[field1513++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class58.field1147 == null || class58.field1147.field8182 == null) {
                    var37 = "";
                } else {
                    var37 = class58.field1147.method3398(false, -78);
                }
                field1495[field1513++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field1492[--field1516];
                class649 var39 = class281.method1852(-101, var38);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field8930;
                }
                field1492[field1516++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field1492[--field1516];
                class649 var42 = class281.method1852(-101, var41);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field8929;
                }
                field1492[field1516++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field1492[--field1516];
                class649 var45 = class281.method1852(-101, var44);
                String var46 = "";
                if (var45 != null && var45.field8924 != null) {
                    var46 = var45.field8924;
                }
                field1495[field1513++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field1492[--field1516];
                field1495[field1513++] = class455.field6415.method682(0, var47).field7748;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field1492[--field1516];
                class561 var49 = class455.field6415.method682(0, var48);
                if (var49.field7753 == null) {
                    field1492[field1516++] = 0;
                    return;
                }
                field1492[field1516++] = var49.field7753.length;
                return;
            }
            if (arg0 == 5052) {
                field1516 -= 2;
                int var50 = field1492[field1516];
                int var51 = field1492[field1516 + 1];
                class561 var52 = class455.field6415.method682(0, var50);
                int var53 = var52.field7753[var51];
                field1492[field1516++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field1492[--field1516];
                class561 var55 = class455.field6415.method682(0, var54);
                if (var55.field7741 == null) {
                    field1492[field1516++] = 0;
                    return;
                }
                field1492[field1516++] = var55.field7741.length;
                return;
            }
            if (arg0 == 5054) {
                field1516 -= 2;
                int var56 = field1492[field1516];
                int var57 = field1492[field1516 + 1];
                field1492[field1516++] = class455.field6415.method682(0, var56).field7741[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field1492[--field1516];
                field1495[field1513++] = class621.field8455.method2411(var58, (byte) -112).method2710(127);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field1492[--field1516];
                class454 var60 = class621.field8455.method2411(var59, (byte) -125);
                if (var60.field6401 == null) {
                    field1492[field1516++] = 0;
                    return;
                }
                field1492[field1516++] = var60.field6401.length;
                return;
            }
            if (arg0 == 5057) {
                field1516 -= 2;
                int var61 = field1492[field1516];
                int var62 = field1492[field1516 + 1];
                field1492[field1516++] = class621.field8455.method2411(var61, (byte) -126).field6401[var62];
                return;
            }
            if (arg0 == 5058) {
                field1494 = new class88();
                field1494.field1567 = field1492[--field1516];
                field1494.field1566 = class621.field8455.method2411(field1494.field1567, (byte) -87);
                field1494.field1569 = new int[field1494.field1566.method2706((byte) -48)];
                return;
            }
            if (arg0 == 5059) {
                field1508++;
                class564 var63 = class227.method1594(class91.field1601, class72.field1320, -93);
                var63.field7778.method1526(false, 0);
                int var64 = var63.field7778.field3109;
                var63.field7778.method1526(false, 0);
                var63.field7778.method1485((byte) 107, field1494.field1567);
                field1494.field1566.method2701((byte) 12, field1494.field1569, var63.field7778);
                var63.field7778.method1487(115, var63.field7778.field3109 - var64);
                class167.method1260(127, var63);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field1495[--field1513];
                field1509++;
                class564 var66 = class227.method1594(class191.field2838, class72.field1320, -89);
                var66.field7778.method1526(false, 0);
                int var67 = var66.field7778.field3109;
                var66.field7778.method1481((byte) -5, var65);
                var66.field7778.method1485((byte) 107, field1494.field1567);
                field1494.field1566.method2701((byte) -125, field1494.field1569, var66.field7778);
                var66.field7778.method1487(102, var66.field7778.field3109 - var67);
                class167.method1260(127, var66);
                return;
            }
            if (arg0 == 5061) {
                field1508++;
                class564 var68 = class227.method1594(class91.field1601, class72.field1320, -104);
                var68.field7778.method1526(false, 0);
                int var69 = var68.field7778.field3109;
                var68.field7778.method1526(false, 1);
                var68.field7778.method1485((byte) 107, field1494.field1567);
                field1494.field1566.method2701((byte) -126, field1494.field1569, var68.field7778);
                var68.field7778.method1487(92, var68.field7778.field3109 - var69);
                class167.method1260(-111, var68);
                return;
            }
            if (arg0 == 5062) {
                field1516 -= 2;
                int var70 = field1492[field1516];
                int var71 = field1492[field1516 + 1];
                field1492[field1516++] = class455.field6415.method682(0, var70).field7749[var71];
                return;
            }
            if (arg0 == 5063) {
                field1516 -= 2;
                int var72 = field1492[field1516];
                int var73 = field1492[field1516 + 1];
                field1492[field1516++] = class455.field6415.method682(0, var72).field7743[var73];
                return;
            }
            if (arg0 == 5064) {
                field1516 -= 2;
                int var74 = field1492[field1516];
                int var75 = field1492[field1516 + 1];
                if (var75 == -1) {
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = class455.field6415.method682(0, var74).method3225((char) var75, 57249897);
                return;
            }
            if (arg0 == 5065) {
                field1516 -= 2;
                int var76 = field1492[field1516];
                int var77 = field1492[field1516 + 1];
                if (var77 == -1) {
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = class455.field6415.method682(0, var76).method3221((byte) -122, (char) var77);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field1492[--field1516];
                field1492[field1516++] = class621.field8455.method2411(var78, (byte) -123).method2706((byte) -127);
                return;
            }
            if (arg0 == 5067) {
                field1516 -= 2;
                int var79 = field1492[field1516];
                int var80 = field1492[field1516 + 1];
                int var81 = class621.field8455.method2411(var79, (byte) -127).method2703(0, var80).field4058;
                field1492[field1516++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field1516 -= 2;
                int var82 = field1492[field1516];
                int var83 = field1492[field1516 + 1];
                field1494.field1569[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field1516 -= 2;
                int var84 = field1492[field1516];
                int var85 = field1492[field1516 + 1];
                field1494.field1569[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field1516 -= 3;
                int var86 = field1492[field1516];
                int var87 = field1492[field1516 + 1];
                int var88 = field1492[field1516 + 2];
                class454 var89 = class621.field8455.method2411(var86, (byte) -127);
                if (var89.method2703(0, var87).field4058 != 0) {
                    throw new RuntimeException("bad command");
                }
                field1492[field1516++] = var89.method2704(var88, var87, true);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field1495[--field1513];
                boolean var91 = field1492[--field1516] == 1;
                class472.method2779(0, var91, var90);
                field1492[field1516++] = class440.field6265;
                return;
            }
            if (arg0 == 5072) {
                if (class476.field6651 != null && class474.field6620 < class440.field6265) {
                    field1492[field1516++] = class476.field6651[class474.field6620++] & 0xFFFF;
                    return;
                }
                field1492[field1516++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class474.field6620 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class117.field1992.method1346(86, -121)) {
                    field1492[field1516++] = 1;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class117.field1992.method1346(82, -126)) {
                    field1492[field1516++] = 1;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class117.field1992.method1346(81, -128)) {
                    field1492[field1516++] = 1;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class581.method3330(field1492[--field1516], (byte) 56);
                return;
            }
            if (arg0 == 5201) {
                field1492[field1516++] = class310.method2020(37);
                return;
            }
            if (arg0 == 5205) {
                class477.method2801(false, -1, -1, field1492[--field1516], -53);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field1492[--field1516];
                class167 var93 = class489.method2894(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = var93.field2613;
                return;
            }
            if (arg0 == 5207) {
                class167 var94 = class489.method2885(field1492[--field1516]);
                if (var94 != null && var94.field2617 != null) {
                    field1495[field1513++] = var94.field2617;
                    return;
                }
                field1495[field1513++] = "";
                return;
            }
            if (arg0 == 5208) {
                field1492[field1516++] = class160.field2571;
                field1492[field1516++] = class117.field1989;
                return;
            }
            if (arg0 == 5209) {
                field1492[field1516++] = class489.field6788 + class33.field850;
                field1492[field1516++] = class614.field8388 + class489.field6785;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field1492[--field1516];
                class167 var96 = class489.method2885(var95);
                if (var96 == null) {
                    field1492[field1516++] = 0;
                    field1492[field1516++] = 0;
                    return;
                }
                field1492[field1516++] = var96.field2625 >> 14 & 0x3FFF;
                field1492[field1516++] = var96.field2625 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field1492[--field1516];
                class167 var98 = class489.method2885(var97);
                if (var98 == null) {
                    field1492[field1516++] = 0;
                    field1492[field1516++] = 0;
                    return;
                }
                field1492[field1516++] = var98.field2620 - var98.field2629;
                field1492[field1516++] = var98.field2612 - var98.field2628;
                return;
            }
            if (arg0 == 5212) {
                class710 var99 = class629.method3595(1);
                if (var99 == null) {
                    field1492[field1516++] = -1;
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = var99.field9629;
                int var100 = var99.field9632 << 28 | class489.field6788 + var99.field9634 << 14 | class489.field6785 + var99.field9633;
                field1492[field1516++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class710 var101 = class213.method1464(-1);
                if (var101 == null) {
                    field1492[field1516++] = -1;
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = var101.field9629;
                int var102 = var101.field9632 << 28 | class489.field6788 + var101.field9634 << 14 | class489.field6785 + var101.field9633;
                field1492[field1516++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field1492[--field1516];
                class167 var104 = class609.method3461(-17096);
                if (var104 != null) {
                    boolean var105 = var104.method1253(field1518, var103 >> 14 & 0x3FFF, var103 & 0x3FFF, var103 >> 28 & 0x3, (byte) -28);
                    if (var105) {
                        class12.method68(field1518[1], -17, field1518[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field1516 -= 2;
                int var106 = field1492[field1516];
                int var107 = field1492[field1516 + 1];
                class368 var108 = class489.method2895(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class167 var110 = (class167) var108.method2344(-48); var110 != null; var110 = (class167) var108.method2336((byte) 113)) {
                    if (var110.field2613 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field1492[field1516++] = 1;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field1492[--field1516];
                class167 var112 = class489.method2885(var111);
                if (var112 == null) {
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = var112.field2616;
                return;
            }
            if (arg0 == 5220) {
                field1492[field1516++] = class362.field5203 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field1492[--field1516];
                class12.method68(var113 >> 14 & 0x3FFF, -17, var113 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class167 var114 = class609.method3461(-17096);
                if (var114 != null) {
                    boolean var115 = var114.method1256(true, class614.field8388 + class489.field6785, class489.field6788 + class33.field850, field1518);
                    if (var115) {
                        field1492[field1516++] = field1518[1];
                        field1492[field1516++] = field1518[2];
                        return;
                    }
                    field1492[field1516++] = -1;
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = -1;
                field1492[field1516++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field1516 -= 2;
                int var116 = field1492[field1516];
                int var117 = field1492[field1516 + 1];
                class477.method2801(false, var117 & 0x3FFF, var117 >> 14 & 0x3FFF, var116, -53);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field1492[--field1516];
                class167 var119 = class609.method3461(-17096);
                if (var119 != null) {
                    boolean var120 = var119.method1253(field1518, var118 >> 14 & 0x3FFF, var118 & 0x3FFF, var118 >> 28 & 0x3, (byte) -28);
                    if (var120) {
                        field1492[field1516++] = field1518[1];
                        field1492[field1516++] = field1518[2];
                        return;
                    }
                    field1492[field1516++] = -1;
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = -1;
                field1492[field1516++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field1492[--field1516];
                class167 var122 = class609.method3461(-17096);
                if (var122 != null) {
                    boolean var123 = var122.method1256(true, var121 & 0x3FFF, var121 >> 14 & 0x3FFF, field1518);
                    if (var123) {
                        field1492[field1516++] = field1518[1];
                        field1492[field1516++] = field1518[2];
                        return;
                    }
                    field1492[field1516++] = -1;
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = -1;
                field1492[field1516++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class491.method2899(field1492[--field1516], 100);
                return;
            }
            if (arg0 == 5227) {
                field1516 -= 2;
                int var124 = field1492[field1516];
                int var125 = field1492[field1516 + 1];
                class477.method2801(true, var125 & 0x3FFF, var125 >> 14 & 0x3FFF, var124, -62);
                return;
            }
            if (arg0 == 5228) {
                class465.field6521 = field1492[--field1516] == 1;
                return;
            }
            if (arg0 == 5229) {
                field1492[field1516++] = class465.field6521 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field1492[--field1516];
                class581.method3332((byte) -74, var126);
                return;
            }
            if (arg0 == 5231) {
                field1516 -= 2;
                int var127 = field1492[field1516];
                boolean var128 = field1492[field1516 + 1] == 1;
                if (class147.field2460 != null) {
                    class362 var129 = class147.field2460.method1465((long) var127, -6008);
                    if (var129 != null && !var128) {
                        var129.method2314((byte) 48);
                        return;
                    }
                    if (var129 == null && var128) {
                        class362 var130 = new class362();
                        class147.field2460.method1468((byte) 29, (long) var127, var130);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field1492[--field1516];
                if (class147.field2460 != null) {
                    class362 var132 = class147.field2460.method1465((long) var131, -6008);
                    field1492[field1516++] = var132 == null ? 0 : 1;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field1516 -= 2;
                int var133 = field1492[field1516];
                boolean var134 = field1492[field1516 + 1] == 1;
                if (class590.field8050 != null) {
                    class362 var135 = class590.field8050.method1465((long) var133, -6008);
                    if (var135 != null && !var134) {
                        var135.method2314((byte) 83);
                        return;
                    }
                    if (var135 == null && var134) {
                        class362 var136 = new class362();
                        class590.field8050.method1468((byte) 112, (long) var133, var136);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field1492[--field1516];
                if (class590.field8050 != null) {
                    class362 var138 = class590.field8050.method1465((long) var137, -6008);
                    field1492[field1516++] = var138 == null ? 0 : 1;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field1492[field1516++] = class489.field6765 == null ? -1 : class489.field6765.field2613;
                return;
            }
            if (arg0 == 5236) {
                field1516 -= 2;
                int var139 = field1492[field1516];
                int var140 = field1492[field1516 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class616.method3498(true, var139, var141, var142);
                if (var143 < 0) {
                    field1492[field1516++] = -1;
                    return;
                }
                field1492[field1516++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class162.method1237(86);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field1516 -= 2;
                int var144 = field1492[field1516];
                int var145 = field1492[field1516 + 1];
                class486.method2864(3, var144, (byte) 102, false, var145);
                field1492[field1516++] = class699.field9455 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class699.field9455 != null) {
                    class486.method2864(class693.field9368.field4424.method3495(-32350), -1, (byte) 102, false, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class335[] var146 = class692.method3868(1494);
                field1492[field1516++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field1492[--field1516];
                class335[] var148 = class692.method3868(1494);
                field1492[field1516++] = var148[var147].field4725;
                field1492[field1516++] = var148[var147].field4732;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class185.field2790;
                int var150 = class616.field8405;
                int var151 = -1;
                class335[] var152 = class692.method3868(1494);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class335 var154 = var152[var153];
                    if (var154.field4725 == var149 && var154.field4732 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field1492[field1516++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field1492[field1516++] = class324.method2072(-126);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field1492[--field1516];
                if (var155 >= 1 && var155 <= 2) {
                    class486.method2864(var155, -1, (byte) 102, false, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field1492[field1516++] = class693.field9368.field4424.method3495(-32350);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field1492[--field1516];
                if (var156 >= 1 && var156 <= 2) {
                    class693.field9368.method2065((byte) 74, class693.field9368.field4424, var156);
                    class693.field9368.method2065((byte) 74, class693.field9368.field4451, var156);
                    class310.method2019(37);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field1513 -= 2;
                String var157 = field1495[field1513];
                String var158 = field1495[field1513 + 1];
                int var159 = field1492[--field1516];
                field1514++;
                class564 var160 = class227.method1594(class148.field2466, class72.field1320, -101);
                var160.field7778.method1526(false, class621.method3541(var157, -65) + class621.method3541(var158, -65) + 1);
                var160.field7778.method1481((byte) -5, var157);
                var160.field7778.method1481((byte) -5, var158);
                var160.field7778.method1526(false, var159);
                class167.method1260(-66, var160);
                return;
            }
            if (arg0 == 5401) {
                field1516 -= 2;
                class733.field9895[field1492[field1516]] = (short) class487.method2870(27076, field1492[field1516 + 1]);
                class721.field9801.method152(-21804);
                class721.field9801.method158(-71);
                class510.field7099.method1336(-118);
                class299.method1955(125);
                return;
            }
            if (arg0 == 5405) {
                field1516 -= 2;
                int var161 = field1492[field1516];
                int var162 = field1492[field1516 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class326.field4524[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field1516 -= 7;
                int var163 = field1492[field1516];
                int var164 = field1492[field1516 + 1] << 1;
                int var165 = field1492[field1516 + 2];
                int var166 = field1492[field1516 + 3];
                int var167 = field1492[field1516 + 4];
                int var168 = field1492[field1516 + 5];
                int var169 = field1492[field1516 + 6];
                if (var163 >= 0 && var163 < 2 && class326.field4524[var163] != null && var164 >= 0 && var164 < class326.field4524[var163].length) {
                    class326.field4524[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class326.field4524[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class326.field4524[field1492[--field1516]].length >> 1;
                field1492[field1516++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class699.field9455 != null) {
                    class486.method2864(class693.field9368.field4424.method3495(-32350), -1, (byte) 102, false, -1);
                }
                if (class684.field9263 != null) {
                    class380.method2405(97);
                    System.exit(0);
                    return;
                }
                String var171 = class304.field4242 == null ? class269.method1786(false) : class304.field4242;
                class727.method4024(var171, class689.field9299, class693.field9368.field4468.method1099(-32350) == 1, false, -47);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class715.field9743 != null) {
                    if (class715.field9743.field8463 == null) {
                        var172 = class309.method2013(-19918, class715.field9743.field8465);
                    } else {
                        var172 = (String) class715.field9743.field8463;
                    }
                }
                field1495[field1513++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field1492[field1516++] = class689.field9299.field2525 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class699.field9455 != null) {
                    class486.method2864(class693.field9368.field4424.method3495(-32350), -1, (byte) 102, false, -1);
                }
                String var173 = field1495[--field1513];
                boolean var174 = field1492[--field1516] == 1;
                String var175 = class269.method1786(false) + var173;
                class727.method4024(var175, class689.field9299, class693.field9368.field4468.method1099(-32350) == 1, var174, 104);
                return;
            }
            if (arg0 == 5422) {
                field1513 -= 2;
                String var176 = field1495[field1513];
                String var177 = field1495[field1513 + 1];
                int var178 = field1492[--field1516];
                if (var176.length() > 0) {
                    if (class505.field7034 == null) {
                        class505.field7034 = new String[class288.field4006[class582.field7970.field6488]];
                    }
                    class505.field7034[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class452.field6380 == null) {
                        class452.field6380 = new String[class288.field4006[class582.field7970.field6488]];
                    }
                    class452.field6380[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field1495[--field1513]);
                return;
            }
            if (arg0 == 5424) {
                field1516 -= 11;
                class231.field3344 = field1492[field1516];
                class99.field1783 = field1492[field1516 + 1];
                class231.field3342 = field1492[field1516 + 2];
                class500.field6980 = field1492[field1516 + 3];
                class623.field8472 = field1492[field1516 + 4];
                class630.field8676 = field1492[field1516 + 5];
                class390.field5683 = field1492[field1516 + 6];
                class464.field6516 = field1492[field1516 + 7];
                class334.field4704 = field1492[field1516 + 8];
                class561.field7747 = field1492[field1516 + 9];
                class608.field8347 = field1492[field1516 + 10];
                class569.field7819.method874(false, class623.field8472);
                class569.field7819.method874(false, class630.field8676);
                class569.field7819.method874(false, class390.field5683);
                class569.field7819.method874(false, class464.field6516);
                class569.field7819.method874(false, class334.field4704);
                class558.field7734 = null;
                class145.field2400 = null;
                class594.field8133 = null;
                class25.field739 = null;
                class343.field4817 = null;
                class345.field4829 = null;
                class604.field8281 = null;
                class594.field8132 = null;
                class545.field7514 = true;
                return;
            }
            if (arg0 == 5425) {
                class497.method2934(12);
                class545.field7514 = false;
                return;
            }
            if (arg0 == 5426) {
                field1516 -= 2;
                class421.field6075 = field1492[field1516];
                class479.field6675 = field1492[field1516 + 1];
                return;
            }
            if (arg0 == 5427) {
                field1516 -= 2;
                class365.field5224 = field1492[field1516 + 1];
                return;
            }
            if (arg0 == 5428) {
                field1516 -= 2;
                int var179 = field1492[field1516];
                int var180 = field1492[field1516 + 1];
                field1492[field1516++] = class494.method2905((byte) -49, var180, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class549.method3162(field1495[--field1513], false, false, (byte) -79);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class43.method542((byte) 125, class675.field9193, "accountcreated");
                    return;
                } catch (Throwable var324) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class43.method542((byte) 125, class675.field9193, "accountcreatestarted");
                    return;
                } catch (Throwable var325) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class364.field5213 != null) {
                    Transferable var182 = class364.field5213.getContents(null);
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
                field1495[field1513++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class344.field4823 = field1492[--field1516];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field1516 -= 4;
                int var183 = field1492[field1516];
                int var184 = field1492[field1516 + 1];
                int var185 = field1492[field1516 + 2];
                int var186 = field1492[field1516 + 3];
                class555.method3194(var185, (var183 >> 14 & 0x3FFF) - class221.field3177, false, var184 << 2, false, var186, (var183 & 0x3FFF) - class367.field5236);
                return;
            }
            if (arg0 == 5501) {
                field1516 -= 4;
                int var187 = field1492[field1516];
                int var188 = field1492[field1516 + 1];
                int var189 = field1492[field1516 + 2];
                int var190 = field1492[field1516 + 3];
                class324.method2074((var187 & 0x3FFF) - class367.field5236, (var187 >> 14 & 0x3FFF) - class221.field3177, var188 << 2, var190, var189, -128);
                return;
            }
            if (arg0 == 5502) {
                field1516 -= 6;
                int var191 = field1492[field1516];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class599.field8218 = var191;
                int var192 = field1492[field1516 + 1];
                if (var192 + 1 >= class326.field4524[class599.field8218].length >> 1) {
                    throw new RuntimeException();
                }
                class352.field4941 = var192;
                class544.field7510 = 0;
                class637.field8760 = field1492[field1516 + 2];
                class234.field3396 = field1492[field1516 + 3];
                int var193 = field1492[field1516 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class302.field4210 = var193;
                int var194 = field1492[field1516 + 5];
                if (var194 + 1 >= class326.field4524[class302.field4210].length >> 1) {
                    throw new RuntimeException();
                }
                class231.field3341 = var194;
                class438.field6252 = 3;
                class705.field9558 = -1;
                class44.field978 = -1;
                return;
            }
            if (arg0 == 5503) {
                class473.method2788(0);
                return;
            }
            if (arg0 == 5504) {
                field1516 -= 2;
                class177.method1317(field1492[field1516], field1492[field1516 + 1], 0, 3);
                return;
            }
            if (arg0 == 5505) {
                field1492[field1516++] = (int) class440.field6267 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field1492[field1516++] = (int) class451.field6366 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class589.method3359((byte) 68);
                return;
            }
            if (arg0 == 5508) {
                class382.method2410(1);
                return;
            }
            if (arg0 == 5509) {
                class227.method1599(-77);
                return;
            }
            if (arg0 == 5510) {
                class313.method2037(0);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field1492[--field1516];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class221.field3177;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class376.field5325) {
                    var198 = class376.field5325;
                }
                int var199 = var197 - class367.field5236;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class175.field2711) {
                    var199 = class175.field2711;
                }
                class667.field9105 = (var198 << 9) + 256;
                class54.field1111 = (var199 << 9) + 256;
                class438.field6252 = 4;
                class705.field9558 = -1;
                class44.field978 = -1;
                return;
            }
            if (arg0 == 5512) {
                class123.method1057((byte) 121);
                return;
            }
            if (arg0 == 5514) {
                class58.field1151 = field1492[--field1516];
                return;
            }
            if (arg0 == 5516) {
                field1492[field1516++] = class58.field1151;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field1492[--field1516];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class221.field3177;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class376.field5325) {
                        var203 = class376.field5325;
                    }
                    int var204 = var202 - class367.field5236;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class175.field2711) {
                        var204 = class175.field2711;
                    }
                    class44.field978 = (var203 << 9) + 256;
                    class705.field9558 = (var204 << 9) + 256;
                    return;
                }
                class44.field978 = -1;
                class705.field9558 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field1513 -= 2;
                String var205 = field1495[field1513];
                String var206 = field1495[field1513 + 1];
                int var207 = field1492[--field1516];
                if (var205.length() > 320) {
                    return;
                }
                if (class214.field3036 != 3) {
                    return;
                }
                if (class399.field5899 == 0 && class189.field2825 == 0) {
                    class624.field8547 = var205;
                    class463.field6510 = var206;
                    class274.field3850 = var207;
                    class215.method1527(2, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class367.method2334((byte) -76);
                return;
            }
            if (arg0 == 5602) {
                if (class399.field5899 == 0) {
                    class368.field5241 = -2;
                    class667.field9106 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field1513--;
                if (class214.field3036 != 3) {
                    return;
                }
                if (class399.field5899 == 0 && class189.field2825 == 0) {
                    class276.method1817(field1495[field1513], 101);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field1513 -= 2;
                field1516 -= 2;
                if (class214.field3036 != 3) {
                    return;
                }
                if (class399.field5899 == 0 && class189.field2825 == 0) {
                    class606.method3446(field1495[field1513 + 1], field1495[field1513], false, field1492[field1516], field1492[field1516 + 1] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class189.field2825 == 0) {
                    class547.field7542 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field1492[field1516++] = class667.field9106;
                return;
            }
            if (arg0 == 5608) {
                field1492[field1516++] = class565.field7792;
                return;
            }
            if (arg0 == 5609) {
                field1492[field1516++] = class547.field7542;
                return;
            }
            if (arg0 == 5611) {
                field1492[field1516++] = class71.field1294;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field1492[--field1516];
                if (class214.field3036 != 7) {
                    return;
                }
                if (class399.field5899 == 0 && class189.field2825 == 0) {
                    if (class512.field7137 != null) {
                        class512.field7137.method706((byte) 36);
                        class512.field7137 = null;
                    }
                    class274.field3850 = var208;
                    class215.method1527(2, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field1492[field1516++] = class667.field9106;
                return;
            }
            if (arg0 == 5615) {
                field1513 -= 2;
                String var209 = field1495[field1513];
                String var210 = field1495[field1513 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class214.field3036 != 3) {
                    return;
                }
                if (class399.field5899 == 0 && class189.field2825 == 0) {
                    if (class512.field7137 != null) {
                        class512.field7137.method706((byte) 36);
                        class512.field7137 = null;
                    }
                    class624.field8547 = var209;
                    class463.field6510 = var210;
                    class215.method1527(2, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class170.method1282(false, (byte) 11);
                return;
            }
            if (arg0 == 5617) {
                field1492[field1516++] = class368.field5241;
                return;
            }
            if (arg0 == 5618) {
                field1516--;
                return;
            }
            if (arg0 == 5619) {
                field1516--;
                return;
            }
            if (arg0 == 5620) {
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field1513 -= 2;
                field1516 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (class199.field2906 != null) {
                    field1492[field1516++] = 1;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field1492[field1516++] = (int) (class638.field8767 >> 32);
                field1492[field1516++] = (int) (class638.field8767 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field1492[field1516++] = class413.field6004 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class413.field6004 = true;
                class365.method2325(84);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field1492[--field1516];
                class693.field9368.method2065((byte) 74, class693.field9368.field4429, var211);
                class717.method3997((byte) -126);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field1492[--field1516] == 1;
                class693.field9368.method2065((byte) 74, class693.field9368.field4452, var212 ? 1 : 0);
                class693.field9368.method2065((byte) 74, class693.field9368.field4458, var212 ? 1 : 0);
                class717.method3997((byte) -122);
                class566.method3277((byte) 32);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field1492[--field1516] == 1;
                class693.field9368.method2065((byte) 74, class693.field9368.field4447, var213 ? 2 : 1);
                class693.field9368.method2065((byte) 74, class693.field9368.field4461, var213 ? 2 : 1);
                class566.method3277((byte) -106);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6005) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4417, field1492[--field1516] == 1 ? 1 : 0);
                class717.method3997((byte) -111);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6007) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4433, field1492[--field1516]);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6008) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4443, field1492[--field1516] == 1 ? 1 : 0);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6010) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4467, field1492[--field1516] == 1 ? 1 : 0);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6011) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4435, field1492[--field1516]);
                class717.method3997((byte) -116);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6012) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4427, field1492[--field1516] == 1 ? 1 : 0);
                class297.method1947(-1);
                class440.method2652(true);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6014) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4456, field1492[--field1516] == 1 ? 2 : 0);
                class717.method3997((byte) -112);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6015) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4444, field1492[--field1516] == 1 ? 1 : 0);
                class717.method3997((byte) -127);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6016) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4445, field1492[--field1516]);
                class171.method1284(false, (byte) 112, class693.field9368.field4468.method1099(-32350));
                class310.method2019(37);
                return;
            }
            if (arg0 == 6017) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4437, field1492[--field1516] == 1 ? 1 : 0);
                class154.method1188(1);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6018) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4469, field1492[--field1516]);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field1492[--field1516];
                int var215 = class693.field9368.field4457.method820(-32350);
                if (var214 != var215) {
                    if (class511.method2997(true, class214.field3036)) {
                        if (var215 == 0 && class277.field3916 != -1) {
                            class580.method3329(0, class277.field3916, false, 94, class78.field1399, var214);
                            class268.method1785(87);
                            class737.field9928 = false;
                        } else if (var214 == 0) {
                            class416.method2571(1);
                            class737.field9928 = false;
                        } else {
                            class699.method3906(var214, (byte) -49);
                        }
                    }
                    class693.field9368.method2065((byte) 74, class693.field9368.field4457, var214);
                    class310.method2019(37);
                    class184.field2782 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4431, field1492[--field1516]);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class693.field9368.field4447.method2473(-32350);
                class693.field9368.method2065((byte) 74, class693.field9368.field4461, field1492[--field1516] == 1 ? 0 : var216);
                class566.method3277((byte) -118);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field1492[--field1516];
                class693.field9368.method2065((byte) 74, class693.field9368.field4421, var217);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6024) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4413, field1492[--field1516]);
                class310.method2019(37);
                return;
            }
            if (arg0 == 6025) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4423, field1492[--field1516]);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field1492[--field1516];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class396.method2480(var218 == 1, (byte) -24);
                return;
            }
            if (arg0 == 6028) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4450, field1492[--field1516] == 0 ? 0 : 1);
                class310.method2019(37);
                return;
            }
            if (arg0 == 6029) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4433, field1492[--field1516]);
                class310.method2019(37);
                return;
            }
            if (arg0 == 6030) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4453, field1492[--field1516] == 0 ? 0 : 1);
                class310.method2019(37);
                class717.method3997((byte) -116);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field1492[--field1516];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class171.method1284(false, (byte) 101, var219);
                return;
            }
            if (arg0 == 6032) {
                field1516 -= 2;
                int var220 = field1492[field1516];
                boolean var221 = field1492[field1516 + 1] == 1;
                class693.field9368.method2065((byte) 74, class693.field9368.field4448, var220);
                if (!var221) {
                    class693.field9368.method2065((byte) 74, class693.field9368.field4426, 0);
                }
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6033) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4460, field1492[--field1516]);
                class310.method2019(37);
                return;
            }
            if (arg0 == 6034) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4432, field1492[--field1516] == 1 ? 1 : 0);
                class310.method2019(37);
                class297.method1947(-1);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6035) {
                int var222 = class693.field9368.field4452.method3022(-32350);
                class693.field9368.method2065((byte) 74, class693.field9368.field4458, field1492[--field1516] == 1 ? 1 : var222);
                class717.method3997((byte) -110);
                class566.method3277((byte) 125);
                return;
            }
            if (arg0 == 6036) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4428, field1492[--field1516]);
                class310.method2019(37);
                class274.field3858 = true;
                return;
            }
            if (arg0 == 6037) {
                class693.field9368.method2065((byte) 74, class693.field9368.field4412, field1492[--field1516]);
                class310.method2019(37);
                class184.field2782 = false;
                return;
            }
            if (arg0 == 6038) {
                int var223 = field1492[--field1516];
                int var224 = class693.field9368.field4442.method820(-32350);
                if (var223 != var224 && class488.field6755 == class277.field3916) {
                    if (!class511.method2997(true, class214.field3036)) {
                        if (var224 == 0) {
                            class580.method3329(0, class277.field3916, false, 127, class78.field1399, var223);
                            class268.method1785(118);
                            class737.field9928 = false;
                        } else if (var223 == 0) {
                            class416.method2571(1);
                            class737.field9928 = false;
                        } else {
                            class699.method3906(var223, (byte) -52);
                        }
                    }
                    class693.field9368.method2065((byte) 74, class693.field9368.field4442, var223);
                    class310.method2019(37);
                    class184.field2782 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var225 = field1492[--field1516];
                if (var225 > 255 || var225 < 0) {
                    var225 = 0;
                }
                if (var225 != class693.field9368.field4454.method886(-32350)) {
                    class693.field9368.method2065((byte) 74, class693.field9368.field4454, var225);
                    class310.method2019(37);
                    class184.field2782 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var226 = field1492[--field1516];
                if (var226 != class693.field9368.field4419.method3484(-32350)) {
                    class693.field9368.method2065((byte) 74, class693.field9368.field4419, var226);
                    class310.method2019(37);
                    class184.field2782 = false;
                    class587.method3355(0);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field1492[field1516++] = class693.field9368.field4429.method2980(-32350);
                return;
            }
            if (arg0 == 6102) {
                field1492[field1516++] = class693.field9368.field4452.method3022(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field1492[field1516++] = class693.field9368.field4447.method2473(-32350) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field1492[field1516++] = class693.field9368.field4417.method966(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field1492[field1516++] = class693.field9368.field4433.method3656(-32350);
                return;
            }
            if (arg0 == 6108) {
                field1492[field1516++] = class693.field9368.field4443.method2040(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field1492[field1516++] = class693.field9368.field4467.method2142(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field1492[field1516++] = class693.field9368.field4435.method421(-32350);
                return;
            }
            if (arg0 == 6112) {
                field1492[field1516++] = class693.field9368.field4427.method3195(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field1492[field1516++] = class693.field9368.field4456.method3536(-32350) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field1492[field1516++] = class693.field9368.field4444.method1557(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field1492[field1516++] = class693.field9368.field4445.method1857(-32350);
                return;
            }
            if (arg0 == 6117) {
                field1492[field1516++] = class693.field9368.field4437.method3426(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field1492[field1516++] = class693.field9368.field4469.method820(-32350);
                return;
            }
            if (arg0 == 6119) {
                field1492[field1516++] = class693.field9368.field4457.method820(-32350);
                return;
            }
            if (arg0 == 6120) {
                field1492[field1516++] = class693.field9368.field4431.method820(-32350);
                return;
            }
            if (arg0 == 6123) {
                field1492[field1516++] = class608.method3458(false);
                return;
            }
            if (arg0 == 6124) {
                field1492[field1516++] = class693.field9368.field4413.method1857(-32350);
                return;
            }
            if (arg0 == 6125) {
                field1492[field1516++] = class693.field9368.field4423.method3539(-32350);
                return;
            }
            if (arg0 == 6127) {
                field1492[field1516++] = class693.field9368.field4440.method3631(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field1492[field1516++] = class693.field9368.field4450.method3809(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field1492[field1516++] = class693.field9368.field4433.method3656(-32350);
                return;
            }
            if (arg0 == 6130) {
                field1492[field1516++] = class693.field9368.field4453.method1849(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field1492[field1516++] = class693.field9368.field4468.method1099(-32350);
                return;
            }
            if (arg0 == 6132) {
                field1492[field1516++] = class693.field9368.field4448.method1099(-32350);
                return;
            }
            if (arg0 == 6133) {
                field1492[field1516++] = class689.field9299.field2525 && !class689.field9299.field2542 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field1492[field1516++] = class693.field9368.field4460.method2662(-32350);
                return;
            }
            if (arg0 == 6136) {
                field1492[field1516++] = class693.field9368.field4432.method887(-32350) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field1492[field1516++] = class394.method2476(class693.field9368.field4468.method1099(-32350), -84, 200);
                return;
            }
            if (arg0 == 6139) {
                field1492[field1516++] = class693.field9368.field4428.method3678(-32350);
                return;
            }
            if (arg0 == 6142) {
                field1492[field1516++] = class693.field9368.field4412.method820(-32350);
                return;
            }
            if (arg0 == 6143) {
                field1492[field1516++] = class693.field9368.field4442.method820(-32350);
                return;
            }
            if (arg0 == 6144) {
                field1492[field1516++] = class72.field1329 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field1492[field1516++] = class693.field9368.field4454.method886(-32350);
                return;
            }
            if (arg0 == 6146) {
                field1492[field1516++] = class693.field9368.field4419.method3484(-32350);
                return;
            }
            if (arg0 == 6147) {
                field1492[field1516++] = class270.field3807.field3419 < 512 || class72.field1329 || class263.field3761 ? 1 : 0;
                return;
            }
            if (arg0 == 6148) {
                field1492[field1516++] = class169.field2651 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field1516 -= 2;
                class145.field2394 = (short) field1492[field1516];
                if (class145.field2394 <= 0) {
                    class145.field2394 = 256;
                }
                class445.field6322 = (short) field1492[field1516 + 1];
                if (class445.field6322 <= 0) {
                    class445.field6322 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field1516 -= 2;
                class199.field2907 = (short) field1492[field1516];
                if (class199.field2907 <= 0) {
                    class199.field2907 = 256;
                }
                class722.field9802 = (short) field1492[field1516 + 1];
                if (class722.field9802 <= 0) {
                    class722.field9802 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field1516 -= 4;
                class21.field335 = (short) field1492[field1516];
                if (class21.field335 <= 0) {
                    class21.field335 = 1;
                }
                class606.field8313 = (short) field1492[field1516 + 1];
                if (class606.field8313 <= 0) {
                    class606.field8313 = 32767;
                } else if (class606.field8313 < class21.field335) {
                    class606.field8313 = class21.field335;
                }
                class79.field1413 = (short) field1492[field1516 + 2];
                if (class79.field1413 <= 0) {
                    class79.field1413 = 1;
                }
                class651.field8945 = (short) field1492[field1516 + 3];
                if (class651.field8945 <= 0) {
                    class651.field8945 = 32767;
                    return;
                }
                if (class651.field8945 < class79.field1413) {
                    class651.field8945 = class79.field1413;
                }
                return;
            }
            if (arg0 == 6203) {
                class587.method3350(0, 0, class669.field9132.field5385, false, (byte) 74, class669.field9132.field5465);
                field1492[field1516++] = class551.field7595;
                field1492[field1516++] = class504.field7021;
                return;
            }
            if (arg0 == 6204) {
                field1492[field1516++] = class199.field2907;
                field1492[field1516++] = class722.field9802;
                return;
            }
            if (arg0 == 6205) {
                field1492[field1516++] = class145.field2394;
                field1492[field1516++] = class445.field6322;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field1492[field1516++] = (int) (class554.method3190(-76) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field1492[field1516++] = (int) (class554.method3190(-77) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field1516 -= 3;
                int var227 = field1492[field1516];
                int var228 = field1492[field1516 + 1];
                int var229 = field1492[field1516 + 2];
                field1503.clear();
                field1503.set(11, 12);
                field1503.set(var229, var228, var227);
                int var230 = (int) (field1503.getTime().getTime() / 86400000L) - 11745;
                if (var229 < 1970) {
                    var230--;
                }
                field1492[field1516++] = var230;
                return;
            }
            if (arg0 == 6303) {
                field1503.clear();
                field1503.setTime(new Date(class554.method3190(-59)));
                field1492[field1516++] = field1503.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var231 = field1492[--field1516];
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
                field1492[field1516++] = var232 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field1492[field1516++] = class283.method1859(-2511) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field1492[field1516++] = class34.method442(314376967) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class214.field3036 == 7 && class399.field5899 == 0 && class189.field2825 == 0) {
                    if (class491.field6805) {
                        field1492[field1516++] = 0;
                        return;
                    }
                    if (class214.field3045 > class554.method3190(-126) - 1000L) {
                        field1492[field1516++] = 1;
                        return;
                    }
                    class491.field6805 = true;
                    class564 var233 = class227.method1594(class72.field1325, class72.field1320, -115);
                    var233.field7778.method1539((byte) 101, class311.field4335);
                    class167.method1260(118, var233);
                    field1492[field1516++] = 0;
                    return;
                }
                field1492[field1516++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class420 var234 = class424.method2601(-97);
                if (var234 != null) {
                    field1492[field1516++] = var234.field6066;
                    field1492[field1516++] = var234.field2402;
                    field1495[field1513++] = var234.field6067;
                    class361 var235 = var234.method2579(false);
                    field1492[field1516++] = var235.field5191;
                    field1495[field1513++] = var235.field5197;
                    field1492[field1516++] = var234.field2398;
                    field1492[field1516++] = var234.field6068;
                    field1495[field1513++] = var234.field6074;
                    return;
                }
                field1492[field1516++] = -1;
                field1492[field1516++] = 0;
                field1495[field1513++] = "";
                field1492[field1516++] = 0;
                field1495[field1513++] = "";
                field1492[field1516++] = 0;
                field1492[field1516++] = 0;
                field1495[field1513++] = "";
                return;
            }
            if (arg0 == 6502) {
                class420 var236 = class351.method2196(true);
                if (var236 != null) {
                    field1492[field1516++] = var236.field6066;
                    field1492[field1516++] = var236.field2402;
                    field1495[field1513++] = var236.field6067;
                    class361 var237 = var236.method2579(false);
                    field1492[field1516++] = var237.field5191;
                    field1495[field1513++] = var237.field5197;
                    field1492[field1516++] = var236.field2398;
                    field1492[field1516++] = var236.field6068;
                    field1495[field1513++] = var236.field6074;
                    return;
                }
                field1492[field1516++] = -1;
                field1492[field1516++] = 0;
                field1495[field1513++] = "";
                field1492[field1516++] = 0;
                field1495[field1513++] = "";
                field1492[field1516++] = 0;
                field1492[field1516++] = 0;
                field1495[field1513++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var238 = field1492[--field1516];
                String var239 = field1495[--field1513];
                if (class214.field3036 == 7 && class399.field5899 == 0 && class189.field2825 == 0) {
                    field1492[field1516++] = class689.method3851(var239, var238, -42) ? 1 : 0;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var240 = field1492[--field1516];
                class420 var241 = class602.method3429(false, var240);
                if (var241 != null) {
                    field1492[field1516++] = var241.field2402;
                    field1495[field1513++] = var241.field6067;
                    class361 var242 = var241.method2579(false);
                    field1492[field1516++] = var242.field5191;
                    field1495[field1513++] = var242.field5197;
                    field1492[field1516++] = var241.field2398;
                    field1492[field1516++] = var241.field6068;
                    field1495[field1513++] = var241.field6074;
                    return;
                }
                field1492[field1516++] = -1;
                field1495[field1513++] = "";
                field1492[field1516++] = 0;
                field1495[field1513++] = "";
                field1492[field1516++] = 0;
                field1492[field1516++] = 0;
                field1495[field1513++] = "";
                return;
            }
            if (arg0 == 6507) {
                field1516 -= 4;
                int var243 = field1492[field1516];
                boolean var244 = field1492[field1516 + 1] == 1;
                int var245 = field1492[field1516 + 2];
                boolean var246 = field1492[field1516 + 3] == 1;
                class741.method4067(var246, 0, var245, var243, var244);
                return;
            }
            if (arg0 == 6508) {
                class336.method2129(-47);
                return;
            }
            if (arg0 == 6509) {
                if (class214.field3036 != 7) {
                    return;
                }
                class443.field6309 = field1492[--field1516] == 1;
                return;
            }
            if (arg0 == 6510) {
                field1492[field1516++] = class296.field4156;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class138.field2302 == class10.field140) {
                if (arg0 == 6700) {
                    int var247 = class323.field4473.method1459(1);
                    if (class184.field2784 != -1) {
                        var247++;
                    }
                    field1492[field1516++] = var247;
                    return;
                }
                if (arg0 == 6701) {
                    int var248 = field1492[--field1516];
                    if (class184.field2784 != -1) {
                        if (var248 == 0) {
                            field1492[field1516++] = class184.field2784;
                            return;
                        }
                        var248--;
                    }
                    class432 var249 = (class432) class323.field4473.method1469(0);
                    while (var248-- > 0) {
                        var249 = (class432) class323.field4473.method1467(0);
                    }
                    field1492[field1516++] = var249.field6181;
                    return;
                }
                if (arg0 == 6702) {
                    int var250 = field1492[--field1516];
                    if (class396.field5798[var250] == null) {
                        field1495[field1513++] = "";
                        return;
                    }
                    String var251 = class396.field5798[var250][0].field5397;
                    if (var251 == null) {
                        field1495[field1513++] = "";
                        return;
                    }
                    field1495[field1513++] = var251.substring(0, var251.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var252 = field1492[--field1516];
                    if (class396.field5798[var252] == null) {
                        field1492[field1516++] = 0;
                        return;
                    }
                    field1492[field1516++] = class396.field5798[var252].length;
                    return;
                }
                if (arg0 == 6704) {
                    field1516 -= 2;
                    int var253 = field1492[field1516];
                    int var254 = field1492[field1516 + 1];
                    if (class396.field5798[var253] == null) {
                        field1495[field1513++] = "";
                        return;
                    }
                    String var255 = class396.field5798[var253][var254].field5397;
                    if (var255 == null) {
                        field1495[field1513++] = "";
                        return;
                    }
                    field1495[field1513++] = var255;
                    return;
                }
                if (arg0 == 6705) {
                    field1516 -= 2;
                    int var256 = field1492[field1516];
                    int var257 = field1492[field1516 + 1];
                    if (class396.field5798[var256] == null) {
                        field1492[field1516++] = 0;
                        return;
                    }
                    field1492[field1516++] = class396.field5798[var256][var257].field5408;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field1516 -= 3;
                    int var258 = field1492[field1516];
                    int var259 = field1492[field1516 + 1];
                    int var260 = field1492[field1516 + 2];
                    class397.method2485(var260, "", (byte) 111, 1, var258 << 16 | var259);
                    return;
                }
                if (arg0 == 6708) {
                    field1516 -= 3;
                    int var261 = field1492[field1516];
                    int var262 = field1492[field1516 + 1];
                    int var263 = field1492[field1516 + 2];
                    class397.method2485(var263, "", (byte) 127, 2, var261 << 16 | var262);
                    return;
                }
                if (arg0 == 6709) {
                    field1516 -= 3;
                    int var264 = field1492[field1516];
                    int var265 = field1492[field1516 + 1];
                    int var266 = field1492[field1516 + 2];
                    class397.method2485(var266, "", (byte) 118, 3, var264 << 16 | var265);
                    return;
                }
                if (arg0 == 6710) {
                    field1516 -= 3;
                    int var267 = field1492[field1516];
                    int var268 = field1492[field1516 + 1];
                    int var269 = field1492[field1516 + 2];
                    class397.method2485(var269, "", (byte) 8, 4, var267 << 16 | var268);
                    return;
                }
                if (arg0 == 6711) {
                    field1516 -= 3;
                    int var270 = field1492[field1516];
                    int var271 = field1492[field1516 + 1];
                    int var272 = field1492[field1516 + 2];
                    class397.method2485(var272, "", (byte) 125, 5, var270 << 16 | var271);
                    return;
                }
                if (arg0 == 6712) {
                    field1516 -= 3;
                    int var273 = field1492[field1516];
                    int var274 = field1492[field1516 + 1];
                    int var275 = field1492[field1516 + 2];
                    class397.method2485(var275, "", (byte) 108, 6, var273 << 16 | var274);
                    return;
                }
                if (arg0 == 6713) {
                    field1516 -= 3;
                    int var276 = field1492[field1516];
                    int var277 = field1492[field1516 + 1];
                    int var278 = field1492[field1516 + 2];
                    class397.method2485(var278, "", (byte) -106, 7, var276 << 16 | var277);
                    return;
                }
                if (arg0 == 6714) {
                    field1516 -= 3;
                    int var279 = field1492[field1516];
                    int var280 = field1492[field1516 + 1];
                    int var281 = field1492[field1516 + 2];
                    class397.method2485(var281, "", (byte) 117, 8, var279 << 16 | var280);
                    return;
                }
                if (arg0 == 6715) {
                    field1516 -= 3;
                    int var282 = field1492[field1516];
                    int var283 = field1492[field1516 + 1];
                    int var284 = field1492[field1516 + 2];
                    class397.method2485(var284, "", (byte) -35, 9, var282 << 16 | var283);
                    return;
                }
                if (arg0 == 6716) {
                    field1516 -= 3;
                    int var285 = field1492[field1516];
                    int var286 = field1492[field1516 + 1];
                    int var287 = field1492[field1516 + 2];
                    class397.method2485(var287, "", (byte) 107, 10, var285 << 16 | var286);
                    return;
                }
                if (arg0 == 6717) {
                    field1516 -= 3;
                    int var288 = field1492[field1516];
                    int var289 = field1492[field1516 + 1];
                    int var290 = field1492[field1516 + 2];
                    class378 var291 = class751.method4199(var290, (byte) -54, var288 << 16 | var289);
                    class236.method1643(-2049);
                    class331 var292 = client.method1975(var291);
                    class501.method2952(var292.field4623, var292.method2105(100), var291, (byte) 21);
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var293 = field1492[--field1516];
                    class553 var294 = class72.field1322.method2136(var293, (byte) 96);
                    if (var294.field7642 == null) {
                        field1495[field1513++] = "";
                        return;
                    }
                    field1495[field1513++] = var294.field7642;
                    return;
                }
                if (arg0 == 6801) {
                    int var295 = field1492[--field1516];
                    class553 var296 = class72.field1322.method2136(var295, (byte) 111);
                    field1492[field1516++] = var296.field7623;
                    return;
                }
                if (arg0 == 6802) {
                    int var297 = field1492[--field1516];
                    class553 var298 = class72.field1322.method2136(var297, (byte) 91);
                    field1492[field1516++] = var298.field7621;
                    return;
                }
                if (arg0 == 6803) {
                    int var299 = field1492[--field1516];
                    class553 var300 = class72.field1322.method2136(var299, (byte) 44);
                    field1492[field1516++] = var300.field7641;
                    return;
                }
                if (arg0 == 6804) {
                    field1516 -= 2;
                    int var301 = field1492[field1516];
                    int var302 = field1492[field1516 + 1];
                    class118 var303 = class495.field6863.method19(var302, 28364);
                    if (var303.method1031(false)) {
                        field1495[field1513++] = class72.field1322.method2136(var301, (byte) 79).method3183(var303.field2002, var302, (byte) 126);
                        return;
                    }
                    field1492[field1516++] = class72.field1322.method2136(var301, (byte) 50).method3185(var303.field2000, var302, false);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field1492[field1516++] = class175.field2705 && !class405.field5941 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field1492[field1516++] = class304.field4239;
                    return;
                }
                if (arg0 == 6902) {
                    field1492[field1516++] = class106.field1868;
                    return;
                }
                if (arg0 == 6903) {
                    field1492[field1516++] = class346.field4840;
                    return;
                }
                if (arg0 == 6904) {
                    field1492[field1516++] = class643.field8839;
                    return;
                }
                if (arg0 == 6905) {
                    String var304 = "";
                    if (class715.field9743 != null) {
                        if (class715.field9743.field8463 == null) {
                            var304 = class309.method2013(-19918, class715.field9743.field8465);
                        } else {
                            var304 = (String) class715.field9743.field8463;
                        }
                    }
                    field1495[field1513++] = var304;
                    return;
                }
                if (arg0 == 6906) {
                    field1492[field1516++] = class194.field2864;
                    return;
                }
                if (arg0 == 6907) {
                    field1492[field1516++] = class162.field2582;
                    return;
                }
                if (arg0 == 6908) {
                    field1492[field1516++] = class667.field9104;
                    return;
                }
                if (arg0 == 6909) {
                    field1492[field1516++] = class316.field4366 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field1492[field1516++] = class477.field6660;
                    return;
                }
                if (arg0 == 6911) {
                    field1492[field1516++] = class355.field5024;
                    return;
                }
                if (arg0 == 6912) {
                    field1492[field1516++] = class669.field9122;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var305 = class100.method936(1000);
                    field1492[field1516++] = class624.field8531 = class693.field9368.field4468.method1099(-32350);
                    field1492[field1516++] = var305;
                    class717.method3997((byte) -113);
                    class310.method2019(37);
                    class184.field2782 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class405.method2525(47);
                    class717.method3997((byte) -126);
                    class310.method2019(37);
                    class184.field2782 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class439.method2649((byte) -59);
                    class717.method3997((byte) -124);
                    class310.method2019(37);
                    class184.field2782 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class670.method3765(true);
                    class717.method3997((byte) -106);
                    class310.method2019(37);
                    class184.field2782 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class76.method709(0, true);
                    class717.method3997((byte) -107);
                    class310.method2019(37);
                    class184.field2782 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class693.field9368.method2065((byte) 74, class693.field9368.field4426, 0);
                    class310.method2019(37);
                    class184.field2782 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class624.field8531 == 2) {
                        class95.field1662 = true;
                        return;
                    }
                    if (class624.field8531 == 1) {
                        class413.field5994 = true;
                        return;
                    }
                    if (class624.field8531 == 3) {
                        class669.field9129 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field1492[field1516++] = class693.field9368.field4426.method1054(-32350);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field1516 -= 2;
                    int var306 = field1492[field1516];
                    int var307 = field1492[field1516 + 1];
                    if (var306 != -1) {
                        if (var307 > 255) {
                            var307 = 255;
                        } else if (var307 < 0) {
                            var307 = 0;
                        }
                        class740.method4066(var307, false, var306, -122);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var308 = field1492[--field1516];
                    if (var308 != -1) {
                        class624.method3561((byte) 17, var308);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var309 = field1492[--field1516];
                    if (var309 != -1) {
                        class597.method3395(-1, var309);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field1492[field1516++] = class314.method2038((byte) 50, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field1492[field1516++] = class693.field9368.field4417.method965(123) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field1492[field1516++] = class693.field9368.field4467.method2139(117) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field1492[field1516++] = class693.field9368.field4435.method420(111) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field1492[field1516++] = class693.field9368.field4456.method3537(125) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field1492[field1516++] = class693.field9368.field4413.method1855(108) && class272.field3822.method361() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field1492[field1516++] = class693.field9368.field4421.method2681(93) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field1492[field1516++] = class693.field9368.field4423.method3540(103) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field1492[field1516++] = class693.field9368.field4440.method3634(120) && class272.field3822.method204() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field1492[field1516++] = class693.field9368.field4453.method1847(115) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field1492[field1516++] = class693.field9368.field4432.method891(124) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field1492[field1516++] = class693.field9368.field4428.method3677(108) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field1492[field1516++] = class693.field9368.field4444.method1558(94) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field1492[field1516++] = class693.field9368.field4419.method3486(91) ? 1 : 0;
                    return;
                }
                if (arg0 == 7214) {
                    field1492[field1516++] = class693.field9368.field4448.method1101(95) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var310 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4417.method417(3, var310);
                    return;
                }
                if (arg0 == 7302) {
                    int var311 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4467.method417(3, var311);
                    return;
                }
                if (arg0 == 7303) {
                    int var312 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4435.method417(3, var312);
                    return;
                }
                if (arg0 == 7304) {
                    int var313 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4456.method417(3, var313);
                    return;
                }
                if (arg0 == 7305) {
                    int var314 = field1492[--field1516];
                    if (!class272.field3822.method361()) {
                        field1492[field1516++] = 3;
                        return;
                    }
                    field1492[field1516++] = class693.field9368.field4413.method417(3, var314);
                    return;
                }
                if (arg0 == 7306) {
                    int var315 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4421.method417(3, var315);
                    return;
                }
                if (arg0 == 7307) {
                    int var316 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4423.method417(3, var316);
                    return;
                }
                if (arg0 == 7308) {
                    int var317 = field1492[--field1516];
                    if (!class272.field3822.method204()) {
                        field1492[field1516++] = 3;
                        return;
                    }
                    field1492[field1516++] = class693.field9368.field4440.method417(3, var317);
                    return;
                }
                if (arg0 == 7309) {
                    int var318 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4453.method417(3, var318);
                    return;
                }
                if (arg0 == 7310) {
                    int var319 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4432.method417(3, var319);
                    return;
                }
                if (arg0 == 7311) {
                    int var320 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4428.method417(3, var320);
                    return;
                }
                if (arg0 == 7312) {
                    int var321 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4444.method417(3, var321);
                    return;
                }
                if (arg0 == 7313) {
                    int var322 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4419.method417(3, var322);
                    return;
                }
                if (arg0 == 7314) {
                    int var323 = field1492[--field1516];
                    field1492[field1516++] = class693.field9368.field4448.method417(3, var323);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lrk;)V", line = 3837)
    public static final void method788(class33 arg0) {
        method795(arg0, 200000);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "()V", line = 3839)
    public static final void method789() {
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 3854)
    private static final void method790(String arg0, int arg1) {
        if (class476.field6653 == 0 && !(!class175.field2705 || class405.field5941) || class748.field10364) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class497.field6938.method2936(0, 544))) {
            var3 = 0;
            arg0 = arg0.substring(class497.field6938.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6939.method2936(0, 544))) {
            var3 = 1;
            arg0 = arg0.substring(class497.field6939.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6940.method2936(0, 544))) {
            var3 = 2;
            arg0 = arg0.substring(class497.field6940.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6941.method2936(0, 544))) {
            var3 = 3;
            arg0 = arg0.substring(class497.field6941.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6942.method2936(0, 544))) {
            var3 = 4;
            arg0 = arg0.substring(class497.field6942.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6943.method2936(0, 544))) {
            var3 = 5;
            arg0 = arg0.substring(class497.field6943.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6944.method2936(0, 544))) {
            var3 = 6;
            arg0 = arg0.substring(class497.field6944.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6945.method2936(0, 544))) {
            var3 = 7;
            arg0 = arg0.substring(class497.field6945.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6946.method2936(0, 544))) {
            var3 = 8;
            arg0 = arg0.substring(class497.field6946.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6947.method2936(0, 544))) {
            var3 = 9;
            arg0 = arg0.substring(class497.field6947.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6948.method2936(0, 544))) {
            var3 = 10;
            arg0 = arg0.substring(class497.field6948.method2936(0, 544).length());
        } else if (var2.startsWith(class497.field6949.method2936(0, 544))) {
            var3 = 11;
            arg0 = arg0.substring(class497.field6949.method2936(0, 544).length());
        } else if (class607.field8336 != 0) {
            if (var2.startsWith(class497.field6938.method2936(class607.field8336, 544))) {
                var3 = 0;
                arg0 = arg0.substring(class497.field6938.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6939.method2936(class607.field8336, 544))) {
                var3 = 1;
                arg0 = arg0.substring(class497.field6939.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6940.method2936(class607.field8336, 544))) {
                var3 = 2;
                arg0 = arg0.substring(class497.field6940.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6941.method2936(class607.field8336, 544))) {
                var3 = 3;
                arg0 = arg0.substring(class497.field6941.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6942.method2936(class607.field8336, 544))) {
                var3 = 4;
                arg0 = arg0.substring(class497.field6942.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6943.method2936(class607.field8336, 544))) {
                var3 = 5;
                arg0 = arg0.substring(class497.field6943.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6944.method2936(class607.field8336, 544))) {
                var3 = 6;
                arg0 = arg0.substring(class497.field6944.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6945.method2936(class607.field8336, 544))) {
                var3 = 7;
                arg0 = arg0.substring(class497.field6945.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6946.method2936(class607.field8336, 544))) {
                var3 = 8;
                arg0 = arg0.substring(class497.field6946.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6947.method2936(class607.field8336, 544))) {
                var3 = 9;
                arg0 = arg0.substring(class497.field6947.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6948.method2936(class607.field8336, 544))) {
                var3 = 10;
                arg0 = arg0.substring(class497.field6948.method2936(class607.field8336, 544).length());
            } else if (var2.startsWith(class497.field6949.method2936(class607.field8336, 544))) {
                var3 = 11;
                arg0 = arg0.substring(class497.field6949.method2936(class607.field8336, 544).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class497.field6950.method2936(0, 544))) {
            var5 = 1;
            arg0 = arg0.substring(class497.field6950.method2936(0, 544).length());
        } else if (var4.startsWith(class497.field6951.method2936(0, 544))) {
            var5 = 2;
            arg0 = arg0.substring(class497.field6951.method2936(0, 544).length());
        } else if (var4.startsWith(class497.field6952.method2936(0, 544))) {
            var5 = 3;
            arg0 = arg0.substring(class497.field6952.method2936(0, 544).length());
        } else if (var4.startsWith(class497.field6953.method2936(0, 544))) {
            var5 = 4;
            arg0 = arg0.substring(class497.field6953.method2936(0, 544).length());
        } else if (var4.startsWith(class497.field6954.method2936(0, 544))) {
            var5 = 5;
            arg0 = arg0.substring(class497.field6954.method2936(0, 544).length());
        } else if (class607.field8336 != 0) {
            if (var4.startsWith(class497.field6950.method2936(class607.field8336, 544))) {
                var5 = 1;
                arg0 = arg0.substring(class497.field6950.method2936(class607.field8336, 544).length());
            } else if (var4.startsWith(class497.field6951.method2936(class607.field8336, 544))) {
                var5 = 2;
                arg0 = arg0.substring(class497.field6951.method2936(class607.field8336, 544).length());
            } else if (var4.startsWith(class497.field6952.method2936(class607.field8336, 544))) {
                var5 = 3;
                arg0 = arg0.substring(class497.field6952.method2936(class607.field8336, 544).length());
            } else if (var4.startsWith(class497.field6953.method2936(class607.field8336, 544))) {
                var5 = 4;
                arg0 = arg0.substring(class497.field6953.method2936(class607.field8336, 544).length());
            } else if (var4.startsWith(class497.field6954.method2936(class607.field8336, 544))) {
                var5 = 5;
                arg0 = arg0.substring(class497.field6954.method2936(class607.field8336, 544).length());
            }
        }
        field1501++;
        class564 var6 = class227.method1594(class201.field2911, class72.field1320, -88);
        var6.field7778.method1526(false, 0);
        int var7 = var6.field7778.field3109;
        var6.field7778.method1526(false, var3);
        var6.field7778.method1526(false, var5);
        class376.method2376(var6.field7778, -101, arg0);
        var6.field7778.method1487(119, var6.field7778.field3109 - var7);
        class167.method1260(124, var6);
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(C)I", line = 4121)
    private static final int method791(char arg0) {
        return class469.method2761(arg0, -114) ? 1 : 0;
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(I)Ljava/lang/String;", line = 4125)
    private static final String method792(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field1503.setTime(new Date(var1));
        int var3 = field1503.get(5);
        int var4 = field1503.get(2);
        int var5 = field1503.get(1);
        return var3 + "-" + field1519[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "(IZ)V", line = 4138)
    private static final void method793(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field1516 -= 3;
                int var2 = field1492[field1516];
                int var3 = field1492[field1516 + 1];
                int var4 = field1492[field1516 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class378 var5 = class60.method633(1512932720, var2);
                if (var5.field5474 == null) {
                    var5.field5474 = new class378[var4 + 1];
                }
                if (var5.field5474.length <= var4) {
                    class378[] var6 = new class378[var4 + 1];
                    for (int var7 = 0; var7 < var5.field5474.length; var7++) {
                        var6[var7] = var5.field5474[var7];
                    }
                    var5.field5474 = var6;
                }
                if (var4 > 0 && var5.field5474[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class378 var8 = new class378();
                var8.field5450 = var3;
                var8.field5510 = var8.field5506 = var5.field5506;
                var8.field5380 = var4;
                var5.field5474[var4] = var8;
                if (arg1) {
                    field1512 = var8;
                } else {
                    field1493 = var8;
                }
                class296.method1945(-9343, var5);
                return;
            }
            if (arg0 == 101) {
                class378 var9 = arg1 ? field1512 : field1493;
                if (var9.field5380 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class378 var10 = class60.method633(1512932720, var9.field5506);
                var10.field5474[var9.field5380] = null;
                class296.method1945(-9343, var10);
                return;
            }
            if (arg0 == 102) {
                class378 var11 = class60.method633(1512932720, field1492[--field1516]);
                var11.field5474 = null;
                class296.method1945(-9343, var11);
                return;
            }
            if (arg0 == 200) {
                field1516 -= 2;
                int var12 = field1492[field1516];
                int var13 = field1492[field1516 + 1];
                class378 var14 = class751.method4199(var13, (byte) -54, var12);
                if (var14 != null && var13 != -1) {
                    field1492[field1516++] = 1;
                    if (arg1) {
                        field1512 = var14;
                        return;
                    }
                    field1493 = var14;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field1492[--field1516];
                class378 var16 = class60.method633(1512932720, var15);
                if (var16 != null) {
                    field1492[field1516++] = 1;
                    if (arg1) {
                        field1512 = var16;
                        return;
                    }
                    field1493 = var16;
                    return;
                }
                field1492[field1516++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field1492[--field1516];
                method797(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field1492[--field1516];
                method785(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field1516 -= 2;
                int var19 = field1492[field1516];
                int var20 = field1492[field1516 + 1];
                if (class58.field1147.field8181 == null) {
                    return;
                }
                for (int var21 = 0; var21 < class119.field2019.length; var21++) {
                    if (class119.field2019[var21] == var19) {
                        class58.field1147.field8181.method3586(class57.field1143, var20, -1, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class430.field6158.length; var22++) {
                    if (class430.field6158[var22] == var19) {
                        class58.field1147.field8181.method3586(class57.field1143, var20, -1, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field1516 -= 2;
                int var23 = field1492[field1516];
                int var24 = field1492[field1516 + 1];
                if (class58.field1147.field8181 == null) {
                    return;
                }
                class58.field1147.field8181.method3584(var23, 0, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field1492[--field1516] != 0;
                if (class58.field1147.field8181 == null) {
                    return;
                }
                class58.field1147.field8181.method3582((byte) -17, var25);
                return;
            }
            if (arg0 == 411) {
                field1516 -= 2;
                int var26 = field1492[field1516];
                int var27 = field1492[field1516 + 1];
                if (class58.field1147.field8181 == null) {
                    return;
                }
                class58.field1147.field8181.method3580((byte) 42, var26, var27, class721.field9801);
                return;
            }
        } else if (!(arg0 < 1000 || arg0 >= 1100) || !(arg0 < 2000 || arg0 >= 2100)) {
            class378 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class60.method633(1512932720, field1492[--field1516]);
            } else {
                var28 = arg1 ? field1512 : field1493;
            }
            if (arg0 == 1000) {
                field1516 -= 4;
                var28.field5464 = field1492[field1516];
                var28.field5415 = field1492[field1516 + 1];
                int var29 = field1492[field1516 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field1492[field1516 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field5493 = (byte) var29;
                var28.field5357 = (byte) var30;
                class296.method1945(-9343, var28);
                class398.method2494(var28, 50);
                if (var28.field5380 == -1) {
                    class615.method3490((byte) -78, var28.field5506);
                }
                return;
            }
            if (arg0 == 1001) {
                field1516 -= 4;
                var28.field5518 = field1492[field1516];
                var28.field5404 = field1492[field1516 + 1];
                var28.field5472 = 0;
                var28.field5502 = 0;
                int var31 = field1492[field1516 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field1492[field1516 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field5454 = (byte) var31;
                var28.field5400 = (byte) var32;
                class296.method1945(-9343, var28);
                class398.method2494(var28, 62);
                if (var28.field5450 == 0) {
                    class296.method1942(false, 36, var28);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field1492[--field1516] == 1;
                if (var28.field5489 != var33) {
                    var28.field5489 = var33;
                    class296.method1945(-9343, var28);
                }
                if (var28.field5380 == -1) {
                    class655.method3700((byte) 90, var28.field5506);
                }
                return;
            }
            if (arg0 == 1004) {
                field1516 -= 2;
                var28.field5386 = field1492[field1516];
                var28.field5451 = field1492[field1516 + 1];
                class296.method1945(-9343, var28);
                class398.method2494(var28, 59);
                if (var28.field5450 == 0) {
                    class296.method1942(false, 49, var28);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field5452 = field1492[--field1516] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class378 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class60.method633(1512932720, field1492[--field1516]);
            } else {
                var34 = arg1 ? field1512 : field1493;
            }
            if (arg0 == 1100) {
                field1516 -= 2;
                var34.field5423 = field1492[field1516];
                if (var34.field5423 > var34.field5374 - var34.field5385) {
                    var34.field5423 = var34.field5374 - var34.field5385;
                }
                if (var34.field5423 < 0) {
                    var34.field5423 = 0;
                }
                var34.field5431 = field1492[field1516 + 1];
                if (var34.field5431 > var34.field5467 - var34.field5465) {
                    var34.field5431 = var34.field5467 - var34.field5465;
                }
                if (var34.field5431 < 0) {
                    var34.field5431 = 0;
                }
                class296.method1945(-9343, var34);
                if (var34.field5380 == -1) {
                    class720.method4002(-91, var34.field5506);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field5425 = field1492[--field1516];
                class296.method1945(-9343, var34);
                if (var34.field5380 == -1) {
                    class481.method2820(var34.field5506, 6);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field5486 = field1492[--field1516] == 1;
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field5372 = field1492[--field1516];
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field5366 = field1492[--field1516];
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field1492[--field1516];
                if (var34.field5432 != var35) {
                    var34.field5432 = var35;
                    class296.method1945(-9343, var34);
                }
                if (var34.field5380 == -1) {
                    class209.method1437(var34.field5506, 14);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field5504 = field1492[--field1516];
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field5373 = field1492[--field1516] == 1;
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field5446 = 1;
                var34.field5429 = field1492[--field1516];
                class296.method1945(-9343, var34);
                if (var34.field5380 == -1) {
                    class140.method1122(var34.field5506, -125);
                }
                return;
            }
            if (arg0 == 1109) {
                field1516 -= 6;
                var34.field5484 = field1492[field1516];
                var34.field5462 = field1492[field1516 + 1];
                var34.field5433 = field1492[field1516 + 2];
                var34.field5351 = field1492[field1516 + 3];
                var34.field5393 = field1492[field1516 + 4];
                var34.field5392 = field1492[field1516 + 5];
                class296.method1945(-9343, var34);
                if (var34.field5380 == -1) {
                    class448.method2682(var34.field5506, 8);
                    class538.method3098(var34.field5506, 2);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field1492[--field1516];
                if (var34.field5375 != var36) {
                    var34.field5375 = var36;
                    var34.field5471 = 0;
                    var34.field5406 = 1;
                    var34.field5517 = 0;
                    class691 var37 = var34.field5375 == -1 ? null : class456.field6436.method1021(var34.field5375, 7);
                    if (var37 != null) {
                        class231.method1609(var34.field5471, var37, 46);
                    }
                    class296.method1945(-9343, var34);
                }
                if (var34.field5380 == -1) {
                    class624.method3558((byte) -117, var34.field5506);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field5365 = field1492[--field1516] == 1;
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field1495[--field1513];
                if (!var38.equals(var34.field5468)) {
                    var34.field5468 = var38;
                    class296.method1945(-9343, var34);
                }
                if (var34.field5380 == -1) {
                    class450.method2686(121, var34.field5506);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field5378 = field1492[--field1516];
                class296.method1945(-9343, var34);
                if (var34.field5380 == -1) {
                    class604.method3440((byte) -109, var34.field5506);
                }
                return;
            }
            if (arg0 == 1114) {
                field1516 -= 3;
                var34.field5438 = field1492[field1516];
                var34.field5376 = field1492[field1516 + 1];
                var34.field5349 = field1492[field1516 + 2];
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field5445 = field1492[--field1516] == 1;
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field5348 = field1492[--field1516];
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field5485 = field1492[--field1516];
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field5466 = field1492[--field1516] == 1;
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field5411 = field1492[--field1516] == 1;
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1120) {
                field1516 -= 2;
                var34.field5374 = field1492[field1516];
                var34.field5467 = field1492[field1516 + 1];
                class296.method1945(-9343, var34);
                if (var34.field5450 == 0) {
                    class296.method1942(false, 62, var34);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field5421 = field1492[--field1516] == 1;
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field5392 = field1492[--field1516];
                class296.method1945(-9343, var34);
                if (var34.field5380 == -1) {
                    class448.method2682(var34.field5506, 8);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field1492[--field1516];
                var34.field5420 = var39 == 1;
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1125) {
                field1516 -= 2;
                var34.field5364 = field1492[field1516];
                var34.field5475 = field1492[field1516 + 1];
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field5449 = field1492[--field1516];
                class296.method1945(-9343, var34);
                return;
            }
            if (arg0 == 1127) {
                field1516 -= 2;
                int var40 = field1492[field1516];
                int var41 = field1492[field1516 + 1];
                class118 var42 = class495.field6863.method19(var40, 28364);
                if (var42.field2000 != var41) {
                    var34.method2396(-70, var40, var41);
                    return;
                }
                var34.method2395(var40, -3437);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field1492[--field1516];
                String var44 = field1495[--field1513];
                class118 var45 = class495.field6863.method19(var43, 28364);
                if (!var45.field2002.equals(var44)) {
                    var34.method2399(0, var43, var44);
                    return;
                }
                var34.method2395(var43, -3437);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field1492[--field1516];
                if (var34.field5450 != 5 && arg0 == 1129 || var34.field5450 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field5482 != var46) {
                    var34.field5482 = var46;
                    class296.method1945(-9343, var34);
                }
                if (var34.field5380 == -1) {
                    class567.method3283(var34.field5506, 117);
                }
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class378 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class60.method633(1512932720, field1492[--field1516]);
            } else {
                var47 = arg1 ? field1512 : field1493;
            }
            class296.method1945(-9343, var47);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field1516 -= 2;
                int var48 = field1492[field1516];
                int var49 = field1492[field1516 + 1];
                if (var47.field5380 == -1) {
                    class192.method1378(9, var47.field5506);
                    class448.method2682(var47.field5506, 8);
                    class538.method3098(var47.field5506, 2);
                }
                if (var48 == -1) {
                    var47.field5446 = 1;
                    var47.field5429 = -1;
                    var47.field5488 = -1;
                    return;
                }
                var47.field5488 = var48;
                var47.field5457 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field5396 = true;
                } else {
                    var47.field5396 = false;
                }
                class352 var50 = class721.field9801.method162(74, var48);
                var47.field5433 = var50.field4930;
                var47.field5351 = var50.field4924;
                var47.field5393 = var50.field4953;
                var47.field5484 = var50.field4922;
                var47.field5462 = var50.field4969;
                var47.field5392 = var50.field4968;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field5354 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field5354 = 1;
                } else {
                    var47.field5354 = 2;
                }
                if (var47.field5472 > 0) {
                    var47.field5392 = var47.field5392 * 32 / var47.field5472;
                    return;
                }
                if (var47.field5518 > 0) {
                    var47.field5392 = var47.field5392 * 32 / var47.field5518;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field5446 = 2;
                var47.field5429 = field1492[--field1516];
                if (var47.field5380 == -1) {
                    class140.method1122(var47.field5506, -124);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field5446 = 3;
                var47.field5429 = -1;
                if (var47.field5380 == -1) {
                    class140.method1122(var47.field5506, 94);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field5446 = 6;
                var47.field5429 = field1492[--field1516];
                if (var47.field5380 == -1) {
                    class140.method1122(var47.field5506, -26);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field5446 = 5;
                var47.field5429 = field1492[--field1516];
                if (var47.field5380 == -1) {
                    class140.method1122(var47.field5506, -127);
                }
                return;
            }
            if (arg0 == 1206) {
                field1516 -= 4;
                var47.field5381 = field1492[field1516];
                var47.field5350 = field1492[field1516 + 1];
                var47.field5409 = field1492[field1516 + 2];
                var47.field5369 = field1492[field1516 + 3];
                class296.method1945(-9343, var47);
                return;
            }
            if (arg0 == 1207) {
                field1516 -= 2;
                var47.field5435 = field1492[field1516];
                var47.field5511 = field1492[field1516 + 1];
                class296.method1945(-9343, var47);
                return;
            }
            if (arg0 == 1210) {
                field1516 -= 4;
                var47.field5429 = field1492[field1516];
                var47.field5455 = field1492[field1516 + 1];
                if (field1492[field1516 + 2] == 1) {
                    var47.field5446 = 9;
                } else {
                    var47.field5446 = 8;
                }
                if (field1492[field1516 + 3] == 1) {
                    var47.field5396 = true;
                } else {
                    var47.field5396 = false;
                }
                if (var47.field5380 == -1) {
                    class140.method1122(var47.field5506, 8);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field5446 = 5;
                var47.field5429 = class561.field7752;
                var47.field5455 = 0;
                if (var47.field5380 == -1) {
                    class140.method1122(var47.field5506, 66);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class378 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class60.method633(1512932720, field1492[--field1516]);
                } else {
                    var62 = arg1 ? field1512 : field1493;
                }
                if (arg0 == 1499) {
                    var62.method2394(false);
                    return;
                }
                String var63 = field1495[--field1513];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field1492[--field1516];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field1492[--field1516];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field1495[--field1513];
                    } else {
                        var66[var67] = Integer.valueOf(field1492[--field1516]);
                    }
                }
                int var68 = field1492[--field1516];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field5439 = var66;
                } else if (arg0 == 1401) {
                    var62.field5481 = var66;
                } else if (arg0 == 1402) {
                    var62.field5418 = var66;
                } else if (arg0 == 1403) {
                    var62.field5487 = var66;
                } else if (arg0 == 1404) {
                    var62.field5359 = var66;
                } else if (arg0 == 1405) {
                    var62.field5499 = var66;
                } else if (arg0 == 1406) {
                    var62.field5356 = var66;
                } else if (arg0 == 1407) {
                    var62.field5453 = var66;
                    var62.field5362 = var64;
                } else if (arg0 == 1408) {
                    var62.field5440 = var66;
                } else if (arg0 == 1409) {
                    var62.field5417 = var66;
                } else if (arg0 == 1410) {
                    var62.field5368 = var66;
                } else if (arg0 == 1411) {
                    var62.field5461 = var66;
                } else if (arg0 == 1412) {
                    var62.field5515 = var66;
                } else if (arg0 == 1414) {
                    var62.field5427 = var66;
                    var62.field5447 = var64;
                } else if (arg0 == 1415) {
                    var62.field5347 = var66;
                    var62.field5407 = var64;
                } else if (arg0 == 1416) {
                    var62.field5390 = var66;
                } else if (arg0 == 1417) {
                    var62.field5479 = var66;
                } else if (arg0 == 1418) {
                    var62.field5496 = var66;
                } else if (arg0 == 1419) {
                    var62.field5498 = var66;
                } else if (arg0 == 1420) {
                    var62.field5410 = var66;
                } else if (arg0 == 1421) {
                    var62.field5437 = var66;
                } else if (arg0 == 1422) {
                    var62.field5512 = var66;
                } else if (arg0 == 1423) {
                    var62.field5516 = var66;
                } else if (arg0 == 1424) {
                    var62.field5377 = var66;
                } else if (arg0 == 1425) {
                    var62.field5483 = var66;
                } else if (arg0 == 1426) {
                    var62.field5363 = var66;
                } else if (arg0 == 1427) {
                    var62.field5403 = var66;
                } else if (arg0 == 1428) {
                    var62.field5361 = var66;
                    var62.field5494 = var64;
                } else if (arg0 == 1429) {
                    var62.field5384 = var66;
                    var62.field5507 = var64;
                } else if (arg0 == 1430) {
                    var62.field5355 = var66;
                }
                var62.field5358 = true;
                return;
            }
            if (arg0 < 1600) {
                class378 var69 = arg1 ? field1512 : field1493;
                if (arg0 == 1500) {
                    field1492[field1516++] = var69.field5476;
                    return;
                }
                if (arg0 == 1501) {
                    field1492[field1516++] = var69.field5426;
                    return;
                }
                if (arg0 == 1502) {
                    field1492[field1516++] = var69.field5385;
                    return;
                }
                if (arg0 == 1503) {
                    field1492[field1516++] = var69.field5465;
                    return;
                }
                if (arg0 == 1504) {
                    field1492[field1516++] = var69.field5489 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field1492[field1516++] = var69.field5510;
                    return;
                }
                if (arg0 == 1506) {
                    class378 var70 = class254.method1732(var69, 3);
                    field1492[field1516++] = var70 == null ? -1 : var70.field5506;
                    return;
                }
            } else if (arg0 < 1700) {
                class378 var71 = arg1 ? field1512 : field1493;
                if (arg0 == 1600) {
                    field1492[field1516++] = var71.field5423;
                    return;
                }
                if (arg0 == 1601) {
                    field1492[field1516++] = var71.field5431;
                    return;
                }
                if (arg0 == 1602) {
                    field1495[field1513++] = var71.field5468;
                    return;
                }
                if (arg0 == 1603) {
                    field1492[field1516++] = var71.field5374;
                    return;
                }
                if (arg0 == 1604) {
                    field1492[field1516++] = var71.field5467;
                    return;
                }
                if (arg0 == 1605) {
                    field1492[field1516++] = var71.field5392;
                    return;
                }
                if (arg0 == 1606) {
                    field1492[field1516++] = var71.field5433;
                    return;
                }
                if (arg0 == 1607) {
                    field1492[field1516++] = var71.field5393;
                    return;
                }
                if (arg0 == 1608) {
                    field1492[field1516++] = var71.field5351;
                    return;
                }
                if (arg0 == 1609) {
                    field1492[field1516++] = var71.field5372;
                    return;
                }
                if (arg0 == 1610) {
                    field1492[field1516++] = var71.field5484;
                    return;
                }
                if (arg0 == 1611) {
                    field1492[field1516++] = var71.field5462;
                    return;
                }
                if (arg0 == 1612) {
                    field1492[field1516++] = var71.field5432;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field1492[--field1516];
                    class118 var73 = class495.field6863.method19(var72, 28364);
                    if (var73.method1031(false)) {
                        field1495[field1513++] = var71.method2389(var72, var73.field2002, -1);
                        return;
                    }
                    field1492[field1516++] = var71.method2388(var73.field2000, var72, -126);
                    return;
                }
                if (arg0 == 1614) {
                    field1492[field1516++] = var71.field5504;
                    return;
                }
                if (arg0 == 2614) {
                    field1492[field1516++] = var71.field5446 == 1 ? var71.field5429 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class378 var74 = arg1 ? field1512 : field1493;
                if (arg0 == 1700) {
                    field1492[field1516++] = var74.field5488;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field5488 != -1) {
                        field1492[field1516++] = var74.field5457;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field1492[field1516++] = var74.field5380;
                    return;
                }
            } else if (arg0 < 1900) {
                class378 var75 = arg1 ? field1512 : field1493;
                if (arg0 == 1800) {
                    field1492[field1516++] = client.method1975(var75).method2105(83);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field1492[--field1516];
                    int var357 = var76 - 1;
                    if (var75.field5509 != null && var357 < var75.field5509.length && var75.field5509[var357] != null) {
                        field1495[field1513++] = var75.field5509[var357];
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field5428 == null) {
                        field1495[field1513++] = "";
                        return;
                    }
                    field1495[field1513++] = var75.field5428;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class378 var355;
                if (arg0 >= 2000) {
                    var355 = class60.method633(1512932720, field1492[--field1516]);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field1512 : field1493;
                }
                if (field1520 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field5403 == null) {
                        return;
                    }
                    class33 var356 = new class33();
                    var356.field847 = var355;
                    var356.field845 = var355.field5403;
                    var356.field846 = field1520 + 1;
                    class208.field2975.method1273(var356, -20180);
                    return;
                }
            } else if (arg0 < 2600) {
                class378 var77 = class60.method633(1512932720, field1492[--field1516]);
                if (arg0 == 2500) {
                    field1492[field1516++] = var77.field5476;
                    return;
                }
                if (arg0 == 2501) {
                    field1492[field1516++] = var77.field5426;
                    return;
                }
                if (arg0 == 2502) {
                    field1492[field1516++] = var77.field5385;
                    return;
                }
                if (arg0 == 2503) {
                    field1492[field1516++] = var77.field5465;
                    return;
                }
                if (arg0 == 2504) {
                    field1492[field1516++] = var77.field5489 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field1492[field1516++] = var77.field5510;
                    return;
                }
                if (arg0 == 1506) {
                    class378 var78 = class254.method1732(var77, 3);
                    field1492[field1516++] = var78 == null ? -1 : var78.field5506;
                    return;
                }
            } else if (arg0 < 2700) {
                class378 var79 = class60.method633(1512932720, field1492[--field1516]);
                if (arg0 == 2600) {
                    field1492[field1516++] = var79.field5423;
                    return;
                }
                if (arg0 == 2601) {
                    field1492[field1516++] = var79.field5431;
                    return;
                }
                if (arg0 == 2602) {
                    field1495[field1513++] = var79.field5468;
                    return;
                }
                if (arg0 == 2603) {
                    field1492[field1516++] = var79.field5374;
                    return;
                }
                if (arg0 == 2604) {
                    field1492[field1516++] = var79.field5467;
                    return;
                }
                if (arg0 == 2605) {
                    field1492[field1516++] = var79.field5392;
                    return;
                }
                if (arg0 == 2606) {
                    field1492[field1516++] = var79.field5433;
                    return;
                }
                if (arg0 == 2607) {
                    field1492[field1516++] = var79.field5393;
                    return;
                }
                if (arg0 == 2608) {
                    field1492[field1516++] = var79.field5351;
                    return;
                }
                if (arg0 == 2609) {
                    field1492[field1516++] = var79.field5372;
                    return;
                }
                if (arg0 == 2610) {
                    field1492[field1516++] = var79.field5484;
                    return;
                }
                if (arg0 == 2611) {
                    field1492[field1516++] = var79.field5462;
                    return;
                }
                if (arg0 == 2612) {
                    field1492[field1516++] = var79.field5432;
                    return;
                }
                if (arg0 == 2613) {
                    field1492[field1516++] = var79.field5504;
                    return;
                }
                if (arg0 == 2614) {
                    field1492[field1516++] = var79.field5446 == 1 ? var79.field5429 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class378 var80 = class60.method633(1512932720, field1492[--field1516]);
                    field1492[field1516++] = var80.field5488;
                    return;
                }
                if (arg0 == 2701) {
                    class378 var81 = class60.method633(1512932720, field1492[--field1516]);
                    if (var81.field5488 != -1) {
                        field1492[field1516++] = var81.field5457;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field1492[--field1516];
                    class432 var83 = (class432) class323.field4473.method1465((long) var82, -6008);
                    if (var83 != null) {
                        field1492[field1516++] = 1;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class378 var84 = class60.method633(1512932720, field1492[--field1516]);
                    if (var84.field5474 == null) {
                        field1492[field1516++] = 0;
                        return;
                    }
                    int var85 = var84.field5474.length;
                    for (int var86 = 0; var86 < var84.field5474.length; var86++) {
                        if (var84.field5474[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field1492[field1516++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field1516 -= 2;
                    int var87 = field1492[field1516];
                    int var88 = field1492[field1516 + 1];
                    class432 var89 = (class432) class323.field4473.method1465((long) var87, -6008);
                    if (var89 != null && var89.field6181 == var88) {
                        field1492[field1516++] = 1;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class378 var90 = class60.method633(1512932720, field1492[--field1516]);
                if (arg0 == 2800) {
                    field1492[field1516++] = client.method1975(var90).method2105(11);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field1492[--field1516];
                    int var358 = var91 - 1;
                    if (var90.field5509 != null && var358 < var90.field5509.length && var90.field5509[var358] != null) {
                        field1495[field1513++] = var90.field5509[var358];
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field5428 == null) {
                        field1495[field1513++] = "";
                        return;
                    }
                    field1495[field1513++] = var90.field5428;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field1495[--field1513];
                    class16.method123(var92, 0);
                    return;
                }
                if (arg0 == 3101) {
                    field1516 -= 2;
                    class10.method63(class58.field1147, field1492[field1516], (byte) 4, field1492[field1516 + 1]);
                    return;
                }
                if (arg0 == 3103) {
                    class497.method2933((byte) -101, true);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field1495[--field1513];
                    int var94 = 0;
                    if (class142.method1130(var93, 73)) {
                        var94 = class432.method2626(true, var93);
                    }
                    field1506++;
                    class564 var95 = class227.method1594(class423.field6101, class72.field1320, -112);
                    var95.field7778.method1539((byte) 102, var94);
                    class167.method1260(116, var95);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field1495[--field1513];
                    field1505++;
                    class564 var97 = class227.method1594(class626.field8622, class72.field1320, -96);
                    var97.field7778.method1526(false, var96.length() + 1);
                    var97.field7778.method1481((byte) -5, var96);
                    class167.method1260(-81, var97);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field1495[--field1513];
                    field1496++;
                    class564 var99 = class227.method1594(class719.field9792, class72.field1320, -93);
                    var99.field7778.method1526(false, var98.length() + 1);
                    var99.field7778.method1481((byte) -5, var98);
                    class167.method1260(35, var99);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field1492[--field1516];
                    String var101 = field1495[--field1513];
                    class629.method3597(var100, -7257, var101);
                    return;
                }
                if (arg0 == 3108) {
                    field1516 -= 3;
                    int var102 = field1492[field1516];
                    int var103 = field1492[field1516 + 1];
                    int var104 = field1492[field1516 + 2];
                    class378 var105 = class60.method633(1512932720, var104);
                    class431.method2621(var105, var102, var103, Integer.MAX_VALUE);
                    return;
                }
                if (arg0 == 3109) {
                    field1516 -= 2;
                    int var106 = field1492[field1516];
                    int var107 = field1492[field1516 + 1];
                    class378 var108 = arg1 ? field1512 : field1493;
                    class431.method2621(var108, var106, var107, Integer.MAX_VALUE);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field1492[--field1516];
                    field1510++;
                    class564 var110 = class227.method1594(class76.field1360, class72.field1320, -121);
                    var110.field7778.method1485((byte) 107, var109);
                    class167.method1260(122, var110);
                    return;
                }
                if (arg0 == 3111) {
                    field1516 -= 2;
                    int var111 = field1492[field1516];
                    int var112 = field1492[field1516 + 1];
                    class432 var113 = (class432) class323.field4473.method1465((long) var111, -6008);
                    if (var113 != null) {
                        class422.method2587(var113.field6181 != var112, true, var113, 2533);
                    }
                    class546.method3150(var112, var111, 3, true, 2);
                    return;
                }
                if (arg0 == 3112) {
                    field1516--;
                    int var114 = field1492[field1516];
                    class432 var115 = (class432) class323.field4473.method1465((long) var114, -6008);
                    if (var115 != null && var115.field6184 == 3) {
                        class422.method2587(true, true, var115, 2533);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class315.method2041(field1495[--field1513], (byte) -70);
                    return;
                }
                if (arg0 == 3114) {
                    field1516 -= 2;
                    int var116 = field1492[field1516];
                    int var117 = field1492[field1516 + 1];
                    String var118 = field1495[--field1513];
                    class128.method1064("", var116, (byte) -87, var117, var118, "", "");
                    return;
                }
                if (arg0 == 3115) {
                    field1516 -= 11;
                    class95[] var119 = class590.method3368(20);
                    class236[] var120 = class554.method3187(20000);
                    class288.method1880(field1492[field1516 + 9], field1492[field1516 + 5], var119[field1492[field1516]], var120[field1492[field1516 + 1]], field1492[field1516 + 7], field1492[field1516 + 6], field1492[field1516 + 4], (byte) 111, field1492[field1516 + 10], field1492[field1516 + 2], field1492[field1516 + 3], field1492[field1516 + 8]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field1516 -= 3;
                    class717.method3991(true, 255, field1492[field1516], field1492[field1516 + 1], field1492[field1516 + 2], 256);
                    return;
                }
                if (arg0 == 3201) {
                    class256.method1740(255, field1492[--field1516], -1, 50);
                    return;
                }
                if (arg0 == 3202) {
                    field1516 -= 2;
                    class562.method3227(field1492[field1516], 255, field1492[field1516 + 1], (byte) -98);
                    return;
                }
                if (arg0 == 3203) {
                    field1516 -= 4;
                    class717.method3991(true, field1492[field1516 + 3], field1492[field1516], field1492[field1516 + 1], field1492[field1516 + 2], 256);
                    return;
                }
                if (arg0 == 3204) {
                    field1516 -= 3;
                    class256.method1740(field1492[field1516 + 1], field1492[field1516], -1, field1492[field1516 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field1516 -= 3;
                    class562.method3227(field1492[field1516], field1492[field1516 + 2], field1492[field1516 + 1], (byte) -98);
                    return;
                }
                if (arg0 == 3206) {
                    field1516 -= 4;
                    class550.method3171(field1492[field1516 + 1], 256, false, (byte) -35, field1492[field1516 + 3], field1492[field1516 + 2], field1492[field1516]);
                    return;
                }
                if (arg0 == 3207) {
                    field1516 -= 4;
                    class550.method3171(field1492[field1516 + 1], 256, true, (byte) -35, field1492[field1516 + 3], field1492[field1516 + 2], field1492[field1516]);
                    return;
                }
                if (arg0 == 3208) {
                    field1516 -= 5;
                    class717.method3991(true, field1492[field1516 + 3], field1492[field1516], field1492[field1516 + 1], field1492[field1516 + 2], field1492[field1516 + 4]);
                    return;
                }
                if (arg0 == 3209) {
                    field1516 -= 5;
                    class550.method3171(field1492[field1516 + 1], field1492[field1516 + 4], false, (byte) -35, field1492[field1516 + 3], field1492[field1516 + 2], field1492[field1516]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field1492[field1516++] = class641.field8810;
                    return;
                }
                if (arg0 == 3301) {
                    field1516 -= 2;
                    int var121 = field1492[field1516];
                    int var122 = field1492[field1516 + 1];
                    field1492[field1516++] = class346.method2175(false, var121, var122, -24667);
                    return;
                }
                if (arg0 == 3302) {
                    field1516 -= 2;
                    int var123 = field1492[field1516];
                    int var124 = field1492[field1516 + 1];
                    field1492[field1516++] = class214.method1473(71, var123, false, var124);
                    return;
                }
                if (arg0 == 3303) {
                    field1516 -= 2;
                    int var125 = field1492[field1516];
                    int var126 = field1492[field1516 + 1];
                    field1492[field1516++] = class273.method1800(var126, var125, false, -126);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field1492[--field1516];
                    field1492[field1516++] = class422.field6085.method1061(106, var127).field1295;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field1492[--field1516];
                    field1492[field1516++] = class670.field9142[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field1492[--field1516];
                    field1492[field1516++] = class513.field7139[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field1492[--field1516];
                    field1492[field1516++] = class463.field6511[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class58.field1147.field5926;
                    int var132 = (class58.field1147.field5922 >> 9) + class221.field3177;
                    int var133 = (class58.field1147.field5933 >> 9) + class367.field5236;
                    field1492[field1516++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field1492[--field1516];
                    field1492[field1516++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field1492[--field1516];
                    field1492[field1516++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field1492[--field1516];
                    field1492[field1516++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field1492[field1516++] = class491.field6806 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field1516 -= 2;
                    int var137 = field1492[field1516];
                    int var138 = field1492[field1516 + 1];
                    field1492[field1516++] = class346.method2175(true, var137, var138, -24667);
                    return;
                }
                if (arg0 == 3314) {
                    field1516 -= 2;
                    int var139 = field1492[field1516];
                    int var140 = field1492[field1516 + 1];
                    field1492[field1516++] = class214.method1473(103, var139, true, var140);
                    return;
                }
                if (arg0 == 3315) {
                    field1516 -= 2;
                    int var141 = field1492[field1516];
                    int var142 = field1492[field1516 + 1];
                    field1492[field1516++] = class273.method1800(var142, var141, true, 126);
                    return;
                }
                if (arg0 == 3316) {
                    if (class476.field6653 >= 2) {
                        field1492[field1516++] = class476.field6653;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field1492[field1516++] = class591.field8069;
                    return;
                }
                if (arg0 == 3318) {
                    field1492[field1516++] = class678.field9207.field9140;
                    return;
                }
                if (arg0 == 3321) {
                    field1492[field1516++] = class604.field8289;
                    return;
                }
                if (arg0 == 3322) {
                    field1492[field1516++] = class473.field6619;
                    return;
                }
                if (arg0 == 3323) {
                    if (class323.field4477 >= 5 && class323.field4477 <= 9) {
                        field1492[field1516++] = 1;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class323.field4477 >= 5 && class323.field4477 <= 9) {
                        field1492[field1516++] = class323.field4477;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field1492[field1516++] = class643.field8857 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field1492[field1516++] = class58.field1147.field8161;
                    return;
                }
                if (arg0 == 3327) {
                    field1492[field1516++] = class58.field1147.field8181 != null && class58.field1147.field8181.field8633 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field1492[field1516++] = class748.field10364 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field1492[--field1516];
                    field1492[field1516++] = class312.method2032((byte) 35, var143, false);
                    return;
                }
                if (arg0 == 3331) {
                    field1516 -= 2;
                    int var144 = field1492[field1516];
                    int var145 = field1492[field1516 + 1];
                    field1492[field1516++] = class80.method738(false, (byte) -128, false, var144, var145);
                    return;
                }
                if (arg0 == 3332) {
                    field1516 -= 2;
                    int var146 = field1492[field1516];
                    int var147 = field1492[field1516 + 1];
                    field1492[field1516++] = class80.method738(true, (byte) -128, false, var146, var147);
                    return;
                }
                if (arg0 == 3333) {
                    field1492[field1516++] = class274.field3850;
                    return;
                }
                if (arg0 == 3335) {
                    field1492[field1516++] = class607.field8336;
                    return;
                }
                if (arg0 == 3336) {
                    field1516 -= 4;
                    int var148 = field1492[field1516];
                    int var149 = field1492[field1516 + 1];
                    int var150 = field1492[field1516 + 2];
                    int var151 = field1492[field1516 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field1492[field1516++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field1492[field1516++] = class601.field8259;
                    return;
                }
                if (arg0 == 3338) {
                    field1492[field1516++] = class685.method3833(-26584);
                    return;
                }
                if (arg0 == 3339) {
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field1492[field1516++] = class195.field2888 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field1492[field1516++] = class278.field3918 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field1492[field1516++] = class284.field3963.method574(true);
                    return;
                }
                if (arg0 == 3343) {
                    field1492[field1516++] = class284.field3963.method571((byte) 127);
                    return;
                }
                if (arg0 == 3344) {
                    field1495[field1513++] = class32.method431((byte) -119);
                    return;
                }
                if (arg0 == 3345) {
                    field1495[field1513++] = class456.method2712((byte) 112);
                    return;
                }
                if (arg0 == 3346) {
                    field1492[field1516++] = class121.method1047((byte) -106);
                    return;
                }
                if (arg0 == 3347) {
                    field1492[field1516++] = class716.field9753;
                    return;
                }
                if (arg0 == 3349) {
                    field1492[field1516++] = class58.field1147.field5643.method1611((byte) -31) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field1516 -= 2;
                    int var155 = field1492[field1516];
                    int var156 = field1492[field1516 + 1];
                    class544 var157 = class54.field1112.method3056(true, var155);
                    field1495[field1513++] = var157.method3147(var156, 124);
                    return;
                }
                if (arg0 == 3408) {
                    field1516 -= 4;
                    int var158 = field1492[field1516];
                    int var159 = field1492[field1516 + 1];
                    int var160 = field1492[field1516 + 2];
                    int var161 = field1492[field1516 + 3];
                    class544 var162 = class54.field1112.method3056(true, var160);
                    if (var162.field7508 == var158 && var162.field7509 == var159) {
                        if (var159 == 115) {
                            field1495[field1513++] = var162.method3147(var161, 119);
                            return;
                        }
                        field1492[field1516++] = var162.method3146(false, var161);
                        return;
                    }
                    throw new RuntimeException("C3408-1 " + var160 + "-" + var161);
                }
                if (arg0 == 3409) {
                    field1516 -= 3;
                    int var163 = field1492[field1516];
                    int var164 = field1492[field1516 + 1];
                    int var165 = field1492[field1516 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class544 var166 = class54.field1112.method3056(true, var164);
                    if (var166.field7509 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field1492[field1516++] = var166.method3140(true, var165) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field1492[--field1516];
                    String var168 = field1495[--field1513];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class544 var169 = class54.field1112.method3056(true, var167);
                    if (var169.field7509 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field1492[field1516++] = var169.method3139(false, var168) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field1492[--field1516];
                    class544 var171 = class54.field1112.method3056(true, var170);
                    field1492[field1516++] = var171.field7497.method1459(1);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class323.field4488 == 0) {
                        field1492[field1516++] = -2;
                        return;
                    }
                    if (class323.field4488 == 1) {
                        field1492[field1516++] = -1;
                        return;
                    }
                    field1492[field1516++] = class443.field6289;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field1492[--field1516];
                    if (class323.field4488 == 2 && var172 < class443.field6289) {
                        field1495[field1513++] = class648.field8912[var172];
                        if (class128.field2162[var172] != null) {
                            field1495[field1513++] = class128.field2162[var172];
                            return;
                        }
                        field1495[field1513++] = "";
                        return;
                    }
                    field1495[field1513++] = "";
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field1492[--field1516];
                    if (class323.field4488 == 2 && var173 < class443.field6289) {
                        field1492[field1516++] = class59.field1169[var173];
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field1492[--field1516];
                    if (class323.field4488 == 2 && var174 < class443.field6289) {
                        field1492[field1516++] = class584.field7987[var174];
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field1495[--field1513];
                    int var176 = field1492[--field1516];
                    class210.method1442(16, var176, var175);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field1495[--field1513];
                    class443.method2665(-81, var177);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field1495[--field1513];
                    class87.method825(true, var178);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field1495[--field1513];
                    class581.method3335(var179, 117, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field1495[--field1513];
                    class189.method1365(true, var180);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field1495[--field1513];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field1492[field1516++] = class663.method3724(var181, (byte) -63) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field1492[--field1516];
                    if (class323.field4488 == 2 && var182 < class443.field6289) {
                        field1495[field1513++] = class539.field7456[var182];
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class578.field7935 != null) {
                        field1495[field1513++] = class244.method1677(class578.field7935, false);
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class578.field7935 != null) {
                        field1492[field1516++] = class237.field3446;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field1492[--field1516];
                    if (class578.field7935 != null && var183 < class237.field3446) {
                        field1495[field1513++] = class166.field2601[var183].field2973;
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field1492[--field1516];
                    if (class578.field7935 != null && var184 < class237.field3446) {
                        field1492[field1516++] = class166.field2601[var184].field2967;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field1492[--field1516];
                    if (class578.field7935 != null && var185 < class237.field3446) {
                        field1492[field1516++] = class166.field2601[var185].field2969;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field1492[field1516++] = class293.field4108;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field1495[--field1513];
                    class359.method2303((byte) -117, var186);
                    return;
                }
                if (arg0 == 3618) {
                    field1492[field1516++] = class182.field2757;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field1495[--field1513];
                    class328.method2086(var187, -117);
                    return;
                }
                if (arg0 == 3620) {
                    class164.method1244(77);
                    return;
                }
                if (arg0 == 3621) {
                    if (class323.field4488 == 0) {
                        field1492[field1516++] = -1;
                        return;
                    }
                    field1492[field1516++] = class324.field4501;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field1492[--field1516];
                    if (class323.field4488 != 0 && var188 < class324.field4501) {
                        field1495[field1513++] = class99.field1767[var188];
                        if (class438.field6245[var188] != null) {
                            field1495[field1513++] = class438.field6245[var188];
                            return;
                        }
                        field1495[field1513++] = "";
                        return;
                    }
                    field1495[field1513++] = "";
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field1495[--field1513];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field1492[field1516++] = class124.method1058(var189, 28280) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field1492[--field1516];
                    if (class166.field2601 != null && var190 < class237.field3446 && class166.field2601[var190].field2965.equalsIgnoreCase(class58.field1147.field8189)) {
                        field1492[field1516++] = 1;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class710.field9636 != null) {
                        field1495[field1513++] = class710.field9636;
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field1492[--field1516];
                    if (class578.field7935 != null && var191 < class237.field3446) {
                        field1495[field1513++] = class166.field2601[var191].field2972;
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field1492[--field1516];
                    if (class323.field4488 == 2 && var192 >= 0 && var192 < class443.field6289) {
                        field1492[field1516++] = class514.field7145[var192] ? 1 : 0;
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field1495[--field1513];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field1492[field1516++] = class756.method4219(var193, -91);
                    return;
                }
                if (arg0 == 3629) {
                    field1492[field1516++] = class59.field1174;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field1495[--field1513];
                    class581.method3335(var194, 119, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field1492[--field1516];
                    field1492[field1516++] = class240.field3502[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field1492[--field1516];
                    if (class578.field7935 != null && var196 < class237.field3446) {
                        field1495[field1513++] = class166.field2601[var196].field2965;
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field1492[--field1516];
                    if (class323.field4488 != 0 && var197 < class324.field4501) {
                        field1495[field1513++] = class514.field7147[var197];
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field1492[--field1516];
                    field1492[field1516++] = class85.field1530[var198].method2689(21110);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field1492[--field1516];
                    field1492[field1516++] = class85.field1530[var199].field6375;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field1492[--field1516];
                    field1492[field1516++] = class85.field1530[var200].field6382;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field1492[--field1516];
                    field1492[field1516++] = class85.field1530[var201].field6373;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field1492[--field1516];
                    field1492[field1516++] = class85.field1530[var202].field6383;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field1492[--field1516];
                    field1492[field1516++] = class85.field1530[var203].field6379;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field1492[--field1516];
                    int var205 = class85.field1530[var204].method2692((byte) 100);
                    field1492[field1516++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field1492[--field1516];
                    int var207 = class85.field1530[var206].method2692((byte) 118);
                    field1492[field1516++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field1492[--field1516];
                    int var209 = class85.field1530[var208].method2692((byte) -100);
                    field1492[field1516++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field1492[--field1516];
                    int var211 = class85.field1530[var210].method2692((byte) 55);
                    field1492[field1516++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field1516 -= 2;
                    int var212 = field1492[field1516];
                    int var213 = field1492[field1516 + 1];
                    field1492[field1516++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field1516 -= 2;
                    int var214 = field1492[field1516];
                    int var215 = field1492[field1516 + 1];
                    field1492[field1516++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field1516 -= 2;
                    int var216 = field1492[field1516];
                    int var217 = field1492[field1516 + 1];
                    field1492[field1516++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field1516 -= 2;
                    int var218 = field1492[field1516];
                    int var219 = field1492[field1516 + 1];
                    field1492[field1516++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field1492[--field1516];
                    field1492[field1516++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field1492[--field1516];
                    field1492[field1516++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field1516 -= 5;
                    int var222 = field1492[field1516];
                    int var223 = field1492[field1516 + 1];
                    int var224 = field1492[field1516 + 2];
                    int var225 = field1492[field1516 + 3];
                    int var226 = field1492[field1516 + 4];
                    field1492[field1516++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field1516 -= 2;
                    long var227 = (long) field1492[field1516];
                    long var229 = (long) field1492[field1516 + 1];
                    field1492[field1516++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field1516 -= 2;
                    int var231 = field1492[field1516];
                    int var232 = field1492[field1516 + 1];
                    field1492[field1516++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field1516 -= 2;
                    int var233 = field1492[field1516];
                    int var234 = field1492[field1516 + 1];
                    field1492[field1516++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field1516 -= 2;
                    int var235 = field1492[field1516];
                    int var236 = field1492[field1516 + 1];
                    field1492[field1516++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field1516 -= 2;
                    int var237 = field1492[field1516];
                    int var238 = field1492[field1516 + 1];
                    field1492[field1516++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field1516 -= 2;
                    int var239 = field1492[field1516];
                    int var240 = field1492[field1516 + 1];
                    if (var239 == 0) {
                        field1492[field1516++] = 0;
                        return;
                    }
                    field1492[field1516++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field1516 -= 2;
                    int var241 = field1492[field1516];
                    int var242 = field1492[field1516 + 1];
                    if (var241 == 0) {
                        field1492[field1516++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field1492[field1516++] = Integer.MAX_VALUE;
                        return;
                    }
                    field1492[field1516++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field1516 -= 2;
                    int var243 = field1492[field1516];
                    int var244 = field1492[field1516 + 1];
                    field1492[field1516++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field1516 -= 2;
                    int var245 = field1492[field1516];
                    int var246 = field1492[field1516 + 1];
                    field1492[field1516++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field1516 -= 2;
                    int var247 = field1492[field1516];
                    int var248 = field1492[field1516 + 1];
                    field1492[field1516++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field1516 -= 2;
                    int var249 = field1492[field1516];
                    int var250 = field1492[field1516 + 1];
                    field1492[field1516++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field1516 -= 3;
                    long var251 = (long) field1492[field1516];
                    long var253 = (long) field1492[field1516 + 1];
                    long var255 = (long) field1492[field1516 + 2];
                    field1492[field1516++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field1516 -= 2;
                    int var257 = field1492[field1516];
                    int var258 = field1492[field1516 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field1492[field1516++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field1492[field1516++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field1495[--field1513];
                    int var262 = field1492[--field1516];
                    field1495[field1513++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field1513 -= 2;
                    String var263 = field1495[field1513];
                    String var264 = field1495[field1513 + 1];
                    field1495[field1513++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field1495[--field1513];
                    int var266 = field1492[--field1516];
                    field1495[field1513++] = var265 + class205.method1424(var266, 76, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field1495[--field1513];
                    field1495[field1513++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field1495[field1513++] = method792(field1492[--field1516]);
                    return;
                }
                if (arg0 == 4105) {
                    field1513 -= 2;
                    String var268 = field1495[field1513];
                    String var269 = field1495[field1513 + 1];
                    if (class58.field1147.field8181 != null && class58.field1147.field8181.field8633) {
                        field1495[field1513++] = var269;
                        return;
                    }
                    field1495[field1513++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field1492[--field1516];
                    field1495[field1513++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field1513 -= 2;
                    field1492[field1516++] = class339.method2141(9152, field1495[field1513 + 1], class607.field8336, field1495[field1513]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field1495[--field1513];
                    field1516 -= 2;
                    int var272 = field1492[field1516];
                    int var273 = field1492[field1516 + 1];
                    class597 var274 = class650.method3679(var273, 0, -123, class416.field6026);
                    field1492[field1516++] = var274.method3396(class536.field7418, 1, var271, var272);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field1495[--field1513];
                    field1516 -= 2;
                    int var276 = field1492[field1516];
                    int var277 = field1492[field1516 + 1];
                    class597 var278 = class650.method3679(var277, 0, -79, class416.field6026);
                    field1492[field1516++] = var278.method3393(var275, false, var276, class536.field7418);
                    return;
                }
                if (arg0 == 4110) {
                    field1513 -= 2;
                    String var279 = field1495[field1513];
                    String var280 = field1495[field1513 + 1];
                    if (field1492[--field1516] == 1) {
                        field1495[field1513++] = var279;
                        return;
                    }
                    field1495[field1513++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field1495[--field1513];
                    field1495[field1513++] = class275.method1814(var281, 23034);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field1495[--field1513];
                    int var283 = field1492[--field1516];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field1495[field1513++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field1492[--field1516];
                    field1492[field1516++] = method791((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field1492[--field1516];
                    field1492[field1516++] = class9.method59((char) var285, (byte) 105) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field1492[--field1516];
                    field1492[field1516++] = class653.method3688(-93, (char) var286) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field1492[--field1516];
                    field1492[field1516++] = class511.method2991(true, (char) var287) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field1495[--field1513];
                    if (var288 != null) {
                        field1492[field1516++] = var288.length();
                        return;
                    }
                    field1492[field1516++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field1495[--field1513];
                    field1516 -= 2;
                    int var290 = field1492[field1516];
                    int var291 = field1492[field1516 + 1];
                    field1495[field1513++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field1495[--field1513];
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
                    field1495[field1513++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field1495[--field1513];
                    field1516 -= 2;
                    int var298 = field1492[field1516];
                    int var299 = field1492[field1516 + 1];
                    field1492[field1516++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field1513 -= 2;
                    String var300 = field1495[field1513];
                    String var301 = field1495[field1513 + 1];
                    int var302 = field1492[--field1516];
                    field1492[field1516++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field1492[--field1516];
                    field1492[field1516++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field1492[--field1516];
                    field1492[field1516++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field1492[--field1516] != 0;
                    int var306 = field1492[--field1516];
                    field1495[field1513++] = class384.method2417(0, var305, class607.field8336, (long) var306, 16980);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field1495[--field1513];
                    int var308 = field1492[--field1516];
                    class597 var309 = class650.method3679(var308, 0, -114, class416.field6026);
                    field1492[field1516++] = var309.method3392(var307, class536.field7418, false);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field1492[--field1516];
                    field1495[field1513++] = class721.field9801.method162(-52, var310).field4938;
                    return;
                }
                if (arg0 == 4201) {
                    field1516 -= 2;
                    int var311 = field1492[field1516];
                    int var312 = field1492[field1516 + 1];
                    class352 var313 = class721.field9801.method162(-79, var311);
                    if (var312 >= 1 && var312 <= 5 && var313.field4954[var312 - 1] != null) {
                        field1495[field1513++] = var313.field4954[var312 - 1];
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field1516 -= 2;
                    int var314 = field1492[field1516];
                    int var315 = field1492[field1516 + 1];
                    class352 var316 = class721.field9801.method162(112, var314);
                    if (var315 >= 1 && var315 <= 5 && var316.field4906[var315 - 1] != null) {
                        field1495[field1513++] = var316.field4906[var315 - 1];
                        return;
                    }
                    field1495[field1513++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field1492[--field1516];
                    field1492[field1516++] = class721.field9801.method162(-52, var317).field4962;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field1492[--field1516];
                    field1492[field1516++] = class721.field9801.method162(82, var318).field4963 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field1492[--field1516];
                    class352 var320 = class721.field9801.method162(80, var319);
                    if (var320.field4976 == -1 && var320.field4901 >= 0) {
                        field1492[field1516++] = var320.field4901;
                        return;
                    }
                    field1492[field1516++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field1492[--field1516];
                    class352 var322 = class721.field9801.method162(-56, var321);
                    if (var322.field4976 >= 0 && var322.field4901 >= 0) {
                        field1492[field1516++] = var322.field4901;
                        return;
                    }
                    field1492[field1516++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field1492[--field1516];
                    field1492[field1516++] = class721.field9801.method162(87, var323).field4926 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field1516 -= 2;
                    int var324 = field1492[field1516];
                    int var325 = field1492[field1516 + 1];
                    class118 var326 = class495.field6863.method19(var325, 28364);
                    if (var326.method1031(false)) {
                        field1495[field1513++] = class721.field9801.method162(-96, var324).method2208(var326.field2002, var325, -1511086397);
                        return;
                    }
                    field1492[field1516++] = class721.field9801.method162(-82, var324).method2214(var326.field2000, -106, var325);
                    return;
                }
                if (arg0 == 4209) {
                    field1516 -= 2;
                    int var327 = field1492[field1516];
                    int var328 = field1492[field1516 + 1] - 1;
                    class352 var329 = class721.field9801.method162(108, var327);
                    if (var329.field4909 == var328) {
                        field1492[field1516++] = var329.field4961;
                        return;
                    }
                    if (var329.field4917 == var328) {
                        field1492[field1516++] = var329.field4960;
                        return;
                    }
                    field1492[field1516++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field1495[--field1513];
                    int var331 = field1492[--field1516];
                    class111.method979(var331 == 1, (byte) -108, var330);
                    field1492[field1516++] = class440.field6265;
                    return;
                }
                if (arg0 == 4211) {
                    if (class476.field6651 != null && class474.field6620 < class440.field6265) {
                        field1492[field1516++] = class476.field6651[class474.field6620++] & 0xFFFF;
                        return;
                    }
                    field1492[field1516++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class474.field6620 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field1492[--field1516];
                    field1492[field1516++] = class721.field9801.method162(-115, var332).field4945;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field1495[--field1513];
                    field1516 -= 3;
                    int var334 = field1492[field1516];
                    int var335 = field1492[field1516 + 1];
                    int var336 = field1492[field1516 + 2];
                    class313.method2034(var336, -125, var334 == 1, var333, var335);
                    field1492[field1516++] = class440.field6265;
                    return;
                }
                if (arg0 == 4215) {
                    field1513 -= 2;
                    field1516 -= 2;
                    String var337 = field1495[field1513];
                    int var338 = field1492[field1516];
                    int var339 = field1492[field1516 + 1];
                    String var340 = field1495[field1513 + 1];
                    class315.method2039(var338 == 1, var337, var340, var339, -1);
                    field1492[field1516++] = class440.field6265;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field1516 -= 2;
                    int var341 = field1492[field1516];
                    int var342 = field1492[field1516 + 1];
                    class118 var343 = class495.field6863.method19(var342, 28364);
                    if (var343.method1031(false)) {
                        field1495[field1513++] = class510.field7099.method1341(var341, -1).method2117((byte) 17, var342, var343.field2002);
                        return;
                    }
                    field1492[field1516++] = class510.field7099.method1341(var341, -1).method2121(var343.field2000, var342, 48);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field1516 -= 2;
                    int var344 = field1492[field1516];
                    int var345 = field1492[field1516 + 1];
                    class118 var346 = class495.field6863.method19(var345, 28364);
                    if (var346.method1031(false)) {
                        field1495[field1513++] = class76.field1366.method1680(0, var344).method920(var346.field2002, var345, -16);
                        return;
                    }
                    field1492[field1516++] = class76.field1366.method1680(0, var344).method932(var345, var346.field2000, 81);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field1516 -= 2;
                    int var347 = field1492[field1516];
                    int var348 = field1492[field1516 + 1];
                    class118 var349 = class495.field6863.method19(var348, 28364);
                    if (var349.method1031(false)) {
                        field1495[field1513++] = class419.field6056.method3859(var347, -121).method2975(-250, var349.field2002, var348);
                        return;
                    }
                    field1492[field1516++] = class419.field6056.method3859(var347, 81).method2971(var348, var349.field2000, (byte) 124);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field1492[--field1516];
                class399 var351 = class624.field8505.method1443(var350, 32);
                if (var351.field5859 != null && var351.field5859.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field5873[0];
                    for (int var354 = 1; var354 < var351.field5859.length; var354++) {
                        if (var351.field5873[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field5873[var354];
                        }
                    }
                    field1492[field1516++] = var351.field5859[var352];
                    return;
                }
                field1492[field1516++] = var351.field5862;
                return;
            }
        } else {
            class378 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class60.method633(1512932720, field1492[--field1516]);
            } else {
                var51 = arg1 ? field1512 : field1493;
            }
            if (arg0 == 1300) {
                int var52 = field1492[--field1516] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method2398(var52, 124, field1495[--field1513]);
                    return;
                }
                field1513--;
                return;
            }
            if (arg0 == 1301) {
                field1516 -= 2;
                int var53 = field1492[field1516];
                int var54 = field1492[field1516 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field5458 = null;
                    return;
                }
                var51.field5458 = class751.method4199(var54, (byte) -54, var53);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field1492[--field1516];
                if (class508.field7068 != var55 && class727.field9838 != var55 && class482.field6726 != var55) {
                    return;
                }
                var51.field5473 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field5405 = field1492[--field1516];
                return;
            }
            if (arg0 == 1304) {
                var51.field5379 = field1492[--field1516];
                return;
            }
            if (arg0 == 1305) {
                var51.field5428 = field1495[--field1513];
                return;
            }
            if (arg0 == 1306) {
                var51.field5456 = field1495[--field1513];
                return;
            }
            if (arg0 == 1307) {
                var51.field5509 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field5371 = field1492[--field1516];
                var51.field5500 = field1492[--field1516];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field1492[--field1516];
                int var57 = field1492[--field1516];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method2391(var57 - 1, var56, (byte) -119);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field5492 = field1495[--field1513];
                return;
            }
            if (arg0 == 1311) {
                var51.field5389 = field1492[--field1516];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field1516 -= 3;
                    var58 = field1492[field1516] - 1;
                    var59 = field1492[field1516 + 1];
                    var60 = field1492[field1516 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field1516 -= 2;
                    var58 = 10;
                    var59 = field1492[field1516];
                    var60 = field1492[field1516 + 1];
                }
                if (var51.field5422 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field5422 = new byte[11];
                    var51.field5508 = new byte[11];
                    var51.field5383 = new int[11];
                }
                var51.field5422[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field5352 = false;
                    for (int var61 = 0; var61 < var51.field5422.length; var61++) {
                        if (var51.field5422[var61] != 0) {
                            var51.field5352 = true;
                            break;
                        }
                    }
                } else {
                    var51.field5352 = true;
                }
                var51.field5508[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field5395 = field1492[--field1516];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Ljk;I)V", line = 7953)
    private static final void method794(class634 arg0, int arg1) {
        field1516 = 0;
        field1513 = 0;
        int var2 = -1;
        int[] var3 = arg0.field8716;
        int[] var4 = arg0.field8714;
        byte var5 = -1;
        field1497 = 0;
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
                        method793(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method787(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field1492[field1516++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field1492[field1516++] = class390.field5635.field1665[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class390.field5635.method894((byte) -78, field1492[--field1516], var8);
                } else if (var43 == 3) {
                    field1495[field1513++] = arg0.field8712[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field1516 -= 2;
                    if (field1492[field1516 + 1] != field1492[field1516]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field1516 -= 2;
                    if (field1492[field1516 + 1] == field1492[field1516]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field1516 -= 2;
                    if (field1492[field1516] < field1492[field1516 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field1516 -= 2;
                    if (field1492[field1516] > field1492[field1516 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field1497 == 0) {
                        return;
                    }
                    class129 var9 = field1511[--field1497];
                    arg0 = var9.field2177;
                    var3 = arg0.field8716;
                    var4 = arg0.field8714;
                    var2 = var9.field2180;
                    field1507 = var9.field2171;
                    field1498 = var9.field2176;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field1492[field1516++] = class390.field5635.method895(var10, -65536);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class390.field5635.method896(var11, -1, field1492[--field1516]);
                } else if (var43 == 31) {
                    field1516 -= 2;
                    if (field1492[field1516] <= field1492[field1516 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field1516 -= 2;
                    if (field1492[field1516] >= field1492[field1516 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field1492[field1516++] = field1507[var4[var2]];
                } else if (var43 == 34) {
                    field1507[var4[var2]] = field1492[--field1516];
                } else if (var43 == 35) {
                    field1495[field1513++] = field1498[var4[var2]];
                } else if (var43 == 36) {
                    field1498[var4[var2]] = field1495[--field1513];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field1513 -= var12;
                    String var13 = class723.method4010(true, var12, field1495, field1513);
                    field1495[field1513++] = var13;
                } else if (var43 == 38) {
                    field1516--;
                } else if (var43 == 39) {
                    field1513--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class634 var15 = class248.method1695(-114, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field8708];
                    String[] var17 = new String[var15.field8709];
                    for (int var18 = 0; var18 < var15.field8717; var18++) {
                        var16[var18] = field1492[field1516 + var18 - var15.field8717];
                    }
                    for (int var19 = 0; var19 < var15.field8715; var19++) {
                        var17[var19] = field1495[field1513 + var19 - var15.field8715];
                    }
                    field1516 -= var15.field8717;
                    field1513 -= var15.field8715;
                    class129 var20 = new class129();
                    var20.field2177 = arg0;
                    var20.field2180 = var2;
                    var20.field2171 = field1507;
                    var20.field2176 = field1498;
                    if (field1497 >= field1511.length) {
                        throw new RuntimeException();
                    }
                    field1511[field1497++] = var20;
                    arg0 = var15;
                    var3 = var15.field8716;
                    var4 = var15.field8714;
                    var2 = -1;
                    field1507 = var16;
                    field1498 = var17;
                } else if (var43 == 42) {
                    field1492[field1516++] = class377.field5346[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class377.field5346[var21] = field1492[--field1516];
                    class285.method1868(-128, var21);
                    class129.field2172 |= class269.field3797[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field1492[--field1516];
                    if (var24 >= 0 && var24 <= 5000) {
                        field1515[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field1504[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field1492[--field1516];
                    if (var28 < 0 || var28 >= field1515[var27]) {
                        throw new RuntimeException();
                    }
                    field1492[field1516++] = field1504[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field1516 -= 2;
                    int var30 = field1492[field1516];
                    if (var30 < 0 || var30 >= field1515[var29]) {
                        throw new RuntimeException();
                    }
                    field1504[var29][var30] = field1492[field1516 + 1];
                } else if (var43 == 47) {
                    String var31 = class429.field6149[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field1495[field1513++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class429.field6149[var32] = field1495[--field1513];
                    class335.method2122(var32, true);
                } else if (var43 == 51) {
                    class213 var33 = arg0.field8713[var4[var2]];
                    class113 var34 = (class113) var33.method1465((long) field1492[--field1516], -6008);
                    if (var34 != null) {
                        var2 += var34.field1945;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field8710 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field5204).append(" ");
                for (int var41 = field1497 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field1511[var41].field2177.field5204).append(" ");
                }
                var40.append("op: ").append(var5);
                class444.method2672(var40.toString(), var42, 15004);
            } else {
                class356.method2237("Clientscript error in: " + arg0.field8710, false, 4);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field8710).append("\n");
                for (int var38 = field1497 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field1511[var38].field2177.field8710).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class444.method2672(var37.toString(), var42, 15004);
                class355.method2228(var37.toString(), 90);
            }
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(Lrk;I)V")
    private static final void method795(class33 arg0, int arg1) {
        Object[] var2 = arg0.field845;
        int var3 = (Integer) var2[0];
        class634 var4 = class248.method1695(-122, var3);
        if (var4 == null) {
            return;
        }
        field1507 = new int[var4.field8708];
        int var5 = 0;
        field1498 = new String[var4.field8709];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field842;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field853;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field847 == null ? -1 : arg0.field847.field5506;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field844;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field847 == null ? -1 : arg0.field847.field5380;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field841 == null ? -1 : arg0.field841.field5506;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field841 == null ? -1 : arg0.field841.field5380;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field849;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field840;
                }
                field1507[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field852;
                }
                field1498[var6++] = var9;
            }
        }
        field1520 = arg0.field846;
        method794(var4, arg1);
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "()V")
    public static void method796() {
        field1507 = null;
        field1498 = null;
        field1515 = null;
        field1504 = null;
        field1492 = null;
        field1495 = null;
        field1511 = null;
        field1493 = null;
        field1512 = null;
        field1494 = null;
        field1503 = null;
        field1519 = null;
        field1518 = null;
        field1517 = null;
    }

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "(I)V")
    private static final void method797(int arg0) {
        class378 var1 = class60.method633(1512932720, arg0);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class378[] var3 = class605.field8299[var2];
        if (var3 == null) {
            class378[] var4 = class396.field5798[var2];
            int var5 = var4.length;
            var3 = class605.field8299[var2] = new class378[var5];
            class363.method2317(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class363.method2317(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "(IZ)V")
    public static final void method798(int arg0, boolean arg1) {
    }
}
