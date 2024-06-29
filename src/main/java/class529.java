import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class529 {

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "I")
    private static int field7687 = 0;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "[I")
    private static int[] field7693 = new int[5];

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "[I")
    private static int[] field7690 = new int[1000];

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    private static int field7696 = 0;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "[Lmha;")
    private static class699[] field7705 = new class699[50];

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "[[I")
    private static int[][] field7698 = new int[5][5000];

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "[Ljava/lang/String;")
    private static String[] field7703 = new String[1000];

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    private static int field7689 = 0;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "Ljava/util/Calendar;")
    private static Calendar field7704 = Calendar.getInstance();

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "[I")
    private static int[] field7711 = new int[3];

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "[Ljava/lang/String;")
    private static String[] field7713 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "Lfba;")
    public static class348 field7712 = new class348(4);

    @OriginalMember(owner = "client!kt", name = "C", descriptor = "I")
    private static int field7714 = 0;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public static int field7686;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public static int field7699;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "Lqk;")
    private static class146 field7691;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "Lqk;")
    private static class146 field7701;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "Lcw;")
    private static class21 field7694;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "[I")
    private static int[] field7697;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "[Ljava/lang/String;")
    private static String[] field7688;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IZ)V")
    public static final void method3196(int arg0, boolean arg1) {
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method3197(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field7704.setTime(new Date(var1));
        int var3 = field7704.get(5);
        int var4 = field7704.get(2);
        int var5 = field7704.get(1);
        return var3 + "-" + field7713[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(IZ)V")
    private static final void method3198(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field7690[field7687++] = class499.field7175;
                return;
            }
            if (arg0 == 5001) {
                field7687 -= 3;
                class499.field7175 = field7690[field7687];
                class439.field6267 = class227.method1583((byte) -57, field7690[field7687 + 1]);
                if (class439.field6267 == null) {
                    class439.field6267 = class71.field1084;
                }
                class433.field6210 = field7690[field7687 + 2];
                field7699++;
                class88 var2 = class448.method2741((byte) 116, class35.field317, class583.field8319);
                var2.field1260.method2881(class499.field7175, (byte) 118);
                var2.field1260.method2881(class439.field6267.field5801, (byte) 121);
                var2.field1260.method2881(class433.field6210, (byte) 111);
                class523.method3183(var2, (byte) 31);
                return;
            }
            if (arg0 == 5002) {
                field7689 -= 2;
                String var3 = field7703[field7689];
                String var4 = field7703[field7689 + 1];
                field7687 -= 2;
                int var5 = field7690[field7687];
                int var6 = field7690[field7687 + 1];
                if (var4 == null) {
                    var4 = "";
                }
                if (var4.length() > 80) {
                    var4 = var4.substring(0, 80);
                }
                field7708++;
                class88 var7 = class448.method2741((byte) 40, client.field6414, class583.field8319);
                var7.field1260.method2881(class231.method1605((byte) 44, var3) + class231.method1605((byte) 44, var4) + 2, (byte) 109);
                var7.field1260.method2902(var3, false);
                var7.field1260.method2881(var5 - 1, (byte) 118);
                var7.field1260.method2881(var6, (byte) 118);
                var7.field1260.method2902(var4, false);
                class523.method3183(var7, (byte) 31);
                return;
            }
            if (arg0 == 5003) {
                int var8 = field7690[--field7687];
                class159 var9 = class659.method3764(var8, 27583);
                String var10 = "";
                if (var9 != null && var9.field2279 != null) {
                    var10 = var9.field2279;
                }
                field7703[field7689++] = var10;
                return;
            }
            if (arg0 == 5004) {
                int var11 = field7690[--field7687];
                class159 var12 = class659.method3764(var11, 27583);
                int var13 = -1;
                if (var12 != null) {
                    var13 = var12.field2280;
                }
                field7690[field7687++] = var13;
                return;
            }
            if (arg0 == 5005) {
                if (class439.field6267 == null) {
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = class439.field6267.field5801;
                return;
            }
            if (arg0 == 5006) {
                int var14 = field7690[--field7687];
                class88 var15 = class448.method2741((byte) 79, class308.field4171, class583.field8319);
                var15.field1260.method2881(var14, (byte) 119);
                class523.method3183(var15, (byte) 31);
                return;
            }
            if (arg0 == 5008) {
                String var16 = field7703[--field7689];
                method3201(var16, arg0);
                return;
            }
            if (arg0 == 5009) {
                field7689 -= 2;
                String var17 = field7703[field7689];
                String var18 = field7703[field7689 + 1];
                if (class598.field8507 != 0 || (!class321.field4368 || class212.field3171) && !class748.field10423) {
                    field7702++;
                    class88 var19 = class448.method2741((byte) 34, class360.field5277, class583.field8319);
                    var19.field1260.method2881(0, (byte) 123);
                    int var20 = var19.field1260.field6864;
                    var19.field1260.method2902(var17, false);
                    class756.method4199(var19.field1260, var18, -1);
                    var19.field1260.method2879(var19.field1260.field6864 - var20, -1);
                    class523.method3183(var19, (byte) 31);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var21 = field7690[--field7687];
                class159 var22 = class659.method3764(var21, 27583);
                String var23 = "";
                if (var22 != null && var22.field2287 != null) {
                    var23 = var22.field2287;
                }
                field7703[field7689++] = var23;
                return;
            }
            if (arg0 == 5011) {
                int var24 = field7690[--field7687];
                class159 var25 = class659.method3764(var24, 27583);
                String var26 = "";
                if (var25 != null && var25.field2282 != null) {
                    var26 = var25.field2282;
                }
                field7703[field7689++] = var26;
                return;
            }
            if (arg0 == 5012) {
                int var27 = field7690[--field7687];
                class159 var28 = class659.method3764(var27, 27583);
                int var29 = -1;
                if (var28 != null) {
                    var29 = var28.field2277;
                }
                field7690[field7687++] = var29;
                return;
            }
            if (arg0 == 5015) {
                String var30;
                if (class108.field1536 == null || class108.field1536.field9096 == null) {
                    var30 = "";
                } else {
                    var30 = class108.field1536.method3694((byte) -113, true);
                }
                field7703[field7689++] = var30;
                return;
            }
            if (arg0 == 5016) {
                field7690[field7687++] = class433.field6210;
                return;
            }
            if (arg0 == 5017) {
                field7690[field7687++] = class423.method2592(-1);
                return;
            }
            if (arg0 == 5018) {
                int var31 = field7690[--field7687];
                class159 var32 = class659.method3764(var31, 27583);
                int var33 = 0;
                if (var32 != null) {
                    var33 = var32.field2284;
                }
                field7690[field7687++] = var33;
                return;
            }
            if (arg0 == 5019) {
                int var34 = field7690[--field7687];
                class159 var35 = class659.method3764(var34, 27583);
                String var36 = "";
                if (var35 != null && var35.field2283 != null) {
                    var36 = var35.field2283;
                }
                field7703[field7689++] = var36;
                return;
            }
            if (arg0 == 5020) {
                String var37;
                if (class108.field1536 == null || class108.field1536.field9096 == null) {
                    var37 = "";
                } else {
                    var37 = class108.field1536.method3691(false, 0);
                }
                field7703[field7689++] = var37;
                return;
            }
            if (arg0 == 5023) {
                int var38 = field7690[--field7687];
                class159 var39 = class659.method3764(var38, 27583);
                int var40 = -1;
                if (var39 != null) {
                    var40 = var39.field2291;
                }
                field7690[field7687++] = var40;
                return;
            }
            if (arg0 == 5024) {
                int var41 = field7690[--field7687];
                class159 var42 = class659.method3764(var41, 27583);
                int var43 = -1;
                if (var42 != null) {
                    var43 = var42.field2288;
                }
                field7690[field7687++] = var43;
                return;
            }
            if (arg0 == 5025) {
                int var44 = field7690[--field7687];
                class159 var45 = class659.method3764(var44, 27583);
                String var46 = "";
                if (var45 != null && var45.field2285 != null) {
                    var46 = var45.field2285;
                }
                field7703[field7689++] = var46;
                return;
            }
            if (arg0 == 5050) {
                int var47 = field7690[--field7687];
                field7703[field7689++] = class490.field7060.method2971(var47, -89).field8052;
                return;
            }
            if (arg0 == 5051) {
                int var48 = field7690[--field7687];
                class554 var49 = class490.field7060.method2971(var48, -20);
                if (var49.field8053 == null) {
                    field7690[field7687++] = 0;
                    return;
                }
                field7690[field7687++] = var49.field8053.length;
                return;
            }
            if (arg0 == 5052) {
                field7687 -= 2;
                int var50 = field7690[field7687];
                int var51 = field7690[field7687 + 1];
                class554 var52 = class490.field7060.method2971(var50, 127);
                int var53 = var52.field8053[var51];
                field7690[field7687++] = var53;
                return;
            }
            if (arg0 == 5053) {
                int var54 = field7690[--field7687];
                class554 var55 = class490.field7060.method2971(var54, 121);
                if (var55.field8056 == null) {
                    field7690[field7687++] = 0;
                    return;
                }
                field7690[field7687++] = var55.field8056.length;
                return;
            }
            if (arg0 == 5054) {
                field7687 -= 2;
                int var56 = field7690[field7687];
                int var57 = field7690[field7687 + 1];
                field7690[field7687++] = class490.field7060.method2971(var56, 117).field8056[var57];
                return;
            }
            if (arg0 == 5055) {
                int var58 = field7690[--field7687];
                field7703[field7689++] = class492.field7082.method2779(var58, 112).method4007(60);
                return;
            }
            if (arg0 == 5056) {
                int var59 = field7690[--field7687];
                class714 var60 = class492.field7082.method2779(var59, 120);
                if (var60.field10076 == null) {
                    field7690[field7687++] = 0;
                    return;
                }
                field7690[field7687++] = var60.field10076.length;
                return;
            }
            if (arg0 == 5057) {
                field7687 -= 2;
                int var61 = field7690[field7687];
                int var62 = field7690[field7687 + 1];
                field7690[field7687++] = class492.field7082.method2779(var61, 110).field10076[var62];
                return;
            }
            if (arg0 == 5058) {
                field7694 = new class21();
                field7694.field195 = field7690[--field7687];
                field7694.field197 = class492.field7082.method2779(field7694.field195, 119);
                field7694.field198 = new int[field7694.field197.method4001(0)];
                return;
            }
            if (arg0 == 5059) {
                field7692++;
                class88 var63 = class448.method2741((byte) 60, class376.field5440, class583.field8319);
                var63.field1260.method2881(0, (byte) 111);
                int var64 = var63.field1260.field6864;
                var63.field1260.method2881(0, (byte) 114);
                var63.field1260.method2862(field7694.field195, -1166933656);
                field7694.field197.method4004(field7694.field198, (byte) 69, var63.field1260);
                var63.field1260.method2879(var63.field1260.field6864 - var64, -1);
                class523.method3183(var63, (byte) 31);
                return;
            }
            if (arg0 == 5060) {
                String var65 = field7703[--field7689];
                field7710++;
                class88 var66 = class448.method2741((byte) 33, class705.field9929, class583.field8319);
                var66.field1260.method2881(0, (byte) 124);
                int var67 = var66.field1260.field6864;
                var66.field1260.method2902(var65, false);
                var66.field1260.method2862(field7694.field195, -1166933656);
                field7694.field197.method4004(field7694.field198, (byte) 96, var66.field1260);
                var66.field1260.method2879(var66.field1260.field6864 - var67, -1);
                class523.method3183(var66, (byte) 31);
                return;
            }
            if (arg0 == 5061) {
                field7692++;
                class88 var68 = class448.method2741((byte) 82, class376.field5440, class583.field8319);
                var68.field1260.method2881(0, (byte) 120);
                int var69 = var68.field1260.field6864;
                var68.field1260.method2881(1, (byte) 111);
                var68.field1260.method2862(field7694.field195, -1166933656);
                field7694.field197.method4004(field7694.field198, (byte) -106, var68.field1260);
                var68.field1260.method2879(var68.field1260.field6864 - var69, -1);
                class523.method3183(var68, (byte) 31);
                return;
            }
            if (arg0 == 5062) {
                field7687 -= 2;
                int var70 = field7690[field7687];
                int var71 = field7690[field7687 + 1];
                field7690[field7687++] = class490.field7060.method2971(var70, -86).field8051[var71];
                return;
            }
            if (arg0 == 5063) {
                field7687 -= 2;
                int var72 = field7690[field7687];
                int var73 = field7690[field7687 + 1];
                field7690[field7687++] = class490.field7060.method2971(var72, 110).field8060[var73];
                return;
            }
            if (arg0 == 5064) {
                field7687 -= 2;
                int var74 = field7690[field7687];
                int var75 = field7690[field7687 + 1];
                if (var75 == -1) {
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = class490.field7060.method2971(var74, -77).method3327((char) var75, (byte) -123);
                return;
            }
            if (arg0 == 5065) {
                field7687 -= 2;
                int var76 = field7690[field7687];
                int var77 = field7690[field7687 + 1];
                if (var77 == -1) {
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = class490.field7060.method2971(var76, 123).method3326((char) var77, -4);
                return;
            }
            if (arg0 == 5066) {
                int var78 = field7690[--field7687];
                field7690[field7687++] = class492.field7082.method2779(var78, 119).method4001(0);
                return;
            }
            if (arg0 == 5067) {
                field7687 -= 2;
                int var79 = field7690[field7687];
                int var80 = field7690[field7687 + 1];
                int var81 = class492.field7082.method2779(var79, 126).method4005(var80, (byte) 57).field9909;
                field7690[field7687++] = var81;
                return;
            }
            if (arg0 == 5068) {
                field7687 -= 2;
                int var82 = field7690[field7687];
                int var83 = field7690[field7687 + 1];
                field7694.field198[var82] = var83;
                return;
            }
            if (arg0 == 5069) {
                field7687 -= 2;
                int var84 = field7690[field7687];
                int var85 = field7690[field7687 + 1];
                field7694.field198[var84] = var85;
                return;
            }
            if (arg0 == 5070) {
                field7687 -= 3;
                int var86 = field7690[field7687];
                int var87 = field7690[field7687 + 1];
                int var88 = field7690[field7687 + 2];
                class714 var89 = class492.field7082.method2779(var86, 115);
                if (var89.method4005(var87, (byte) -126).field9909 != 0) {
                    throw new RuntimeException("bad command");
                }
                field7690[field7687++] = var89.method4002(var87, var88, (byte) 108);
                return;
            }
            if (arg0 == 5071) {
                String var90 = field7703[--field7689];
                boolean var91 = field7690[--field7687] == 1;
                class650.method3748(var90, var91, 16);
                field7690[field7687++] = class756.field10521;
                return;
            }
            if (arg0 == 5072) {
                if (class340.field4686 != null && class642.field9140 < class756.field10521) {
                    field7690[field7687++] = class340.field4686[class642.field9140++] & 0xFFFF;
                    return;
                }
                field7690[field7687++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class642.field9140 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class253.field3661.method2780(86, 101)) {
                    field7690[field7687++] = 1;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class253.field3661.method2780(82, 73)) {
                    field7690[field7687++] = 1;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class253.field3661.method2780(81, 101)) {
                    field7690[field7687++] = 1;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class433.method2662(field7690[--field7687], (byte) 67);
                return;
            }
            if (arg0 == 5201) {
                field7690[field7687++] = class200.method1417(100);
                return;
            }
            if (arg0 == 5205) {
                class175.method1260(-1, -42, field7690[--field7687], -1, false);
                return;
            }
            if (arg0 == 5206) {
                int var92 = field7690[--field7687];
                class685 var93 = class664.method3788(var92 >> 14 & 0x3FFF, var92 & 0x3FFF);
                if (var93 == null) {
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = var93.field9731;
                return;
            }
            if (arg0 == 5207) {
                class685 var94 = class664.method3793(field7690[--field7687]);
                if (var94 != null && var94.field9723 != null) {
                    field7703[field7689++] = var94.field9723;
                    return;
                }
                field7703[field7689++] = "";
                return;
            }
            if (arg0 == 5208) {
                field7690[field7687++] = class542.field7857;
                field7690[field7687++] = class362.field5295;
                return;
            }
            if (arg0 == 5209) {
                field7690[field7687++] = class664.field9502 + class488.field7039;
                field7690[field7687++] = class78.field1135 + class664.field9498;
                return;
            }
            if (arg0 == 5210) {
                int var95 = field7690[--field7687];
                class685 var96 = class664.method3793(var95);
                if (var96 == null) {
                    field7690[field7687++] = 0;
                    field7690[field7687++] = 0;
                    return;
                }
                field7690[field7687++] = var96.field9735 >> 14 & 0x3FFF;
                field7690[field7687++] = var96.field9735 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var97 = field7690[--field7687];
                class685 var98 = class664.method3793(var97);
                if (var98 == null) {
                    field7690[field7687++] = 0;
                    field7690[field7687++] = 0;
                    return;
                }
                field7690[field7687++] = var98.field9743 - var98.field9738;
                field7690[field7687++] = var98.field9733 - var98.field9734;
                return;
            }
            if (arg0 == 5212) {
                class241 var99 = class443.method2704(1);
                if (var99 == null) {
                    field7690[field7687++] = -1;
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = var99.field3562;
                int var100 = var99.field3564 << 28 | class664.field9502 + var99.field3571 << 14 | class664.field9498 + var99.field3568;
                field7690[field7687++] = var100;
                return;
            }
            if (arg0 == 5213) {
                class241 var101 = class574.method3410(-14893);
                if (var101 == null) {
                    field7690[field7687++] = -1;
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = var101.field3562;
                int var102 = var101.field3564 << 28 | class664.field9502 + var101.field3571 << 14 | class664.field9498 + var101.field3568;
                field7690[field7687++] = var102;
                return;
            }
            if (arg0 == 5214) {
                int var103 = field7690[--field7687];
                class685 var104 = class528.method3193(-26132);
                if (var104 != null) {
                    boolean var105 = var104.method3889(field7711, var103 & 0x3FFF, var103 >> 28 & 0x3, var103 >> 14 & 0x3FFF, 689);
                    if (var105) {
                        class382.method2363(field7711[1], true, field7711[2]);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field7687 -= 2;
                int var106 = field7690[field7687];
                int var107 = field7690[field7687 + 1];
                class498 var108 = class664.method3790(var106 >> 14 & 0x3FFF, var106 & 0x3FFF);
                boolean var109 = false;
                for (class685 var110 = (class685) var108.method3025(false); var110 != null; var110 = (class685) var108.method3026(true)) {
                    if (var110.field9731 == var107) {
                        var109 = true;
                        break;
                    }
                }
                if (var109) {
                    field7690[field7687++] = 1;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var111 = field7690[--field7687];
                class685 var112 = class664.method3793(var111);
                if (var112 == null) {
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = var112.field9728;
                return;
            }
            if (arg0 == 5220) {
                field7690[field7687++] = class499.field7172 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var113 = field7690[--field7687];
                class382.method2363(var113 >> 14 & 0x3FFF, true, var113 & 0x3FFF);
                return;
            }
            if (arg0 == 5222) {
                class685 var114 = class528.method3193(-26132);
                if (var114 != null) {
                    boolean var115 = var114.method3893(class664.field9502 + class488.field7039, field7711, class78.field1135 + class664.field9498, -103);
                    if (var115) {
                        field7690[field7687++] = field7711[1];
                        field7690[field7687++] = field7711[2];
                        return;
                    }
                    field7690[field7687++] = -1;
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = -1;
                field7690[field7687++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field7687 -= 2;
                int var116 = field7690[field7687];
                int var117 = field7690[field7687 + 1];
                class175.method1260(var117 >> 14 & 0x3FFF, -94, var116, var117 & 0x3FFF, false);
                return;
            }
            if (arg0 == 5224) {
                int var118 = field7690[--field7687];
                class685 var119 = class528.method3193(-26132);
                if (var119 != null) {
                    boolean var120 = var119.method3889(field7711, var118 & 0x3FFF, var118 >> 28 & 0x3, var118 >> 14 & 0x3FFF, 689);
                    if (var120) {
                        field7690[field7687++] = field7711[1];
                        field7690[field7687++] = field7711[2];
                        return;
                    }
                    field7690[field7687++] = -1;
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = -1;
                field7690[field7687++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var121 = field7690[--field7687];
                class685 var122 = class528.method3193(-26132);
                if (var122 != null) {
                    boolean var123 = var122.method3893(var121 >> 14 & 0x3FFF, field7711, var121 & 0x3FFF, -78);
                    if (var123) {
                        field7690[field7687++] = field7711[1];
                        field7690[field7687++] = field7711[2];
                        return;
                    }
                    field7690[field7687++] = -1;
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = -1;
                field7690[field7687++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class403.method2445(89, field7690[--field7687]);
                return;
            }
            if (arg0 == 5227) {
                field7687 -= 2;
                int var124 = field7690[field7687];
                int var125 = field7690[field7687 + 1];
                class175.method1260(var125 >> 14 & 0x3FFF, 109, var124, var125 & 0x3FFF, true);
                return;
            }
            if (arg0 == 5228) {
                class724.field10181 = field7690[--field7687] == 1;
                return;
            }
            if (arg0 == 5229) {
                field7690[field7687++] = class724.field10181 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var126 = field7690[--field7687];
                class640.method3700(var126, -19486);
                return;
            }
            if (arg0 == 5231) {
                field7687 -= 2;
                int var127 = field7690[field7687];
                boolean var128 = field7690[field7687 + 1] == 1;
                if (class121.field1651 != null) {
                    class430 var129 = class121.field1651.method4020((long) var127, (byte) -97);
                    if (var129 != null && !var128) {
                        var129.method2656((byte) 122);
                        return;
                    }
                    if (var129 == null && var128) {
                        class430 var130 = new class430();
                        class121.field1651.method4022(var130, -83, (long) var127);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var131 = field7690[--field7687];
                if (class121.field1651 != null) {
                    class430 var132 = class121.field1651.method4020((long) var131, (byte) -110);
                    field7690[field7687++] = var132 == null ? 0 : 1;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field7687 -= 2;
                int var133 = field7690[field7687];
                boolean var134 = field7690[field7687 + 1] == 1;
                if (class718.field10130 != null) {
                    class430 var135 = class718.field10130.method4020((long) var133, (byte) -103);
                    if (var135 != null && !var134) {
                        var135.method2656((byte) 118);
                        return;
                    }
                    if (var135 == null && var134) {
                        class430 var136 = new class430();
                        class718.field10130.method4022(var136, 101, (long) var133);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var137 = field7690[--field7687];
                if (class718.field10130 != null) {
                    class430 var138 = class718.field10130.method4020((long) var137, (byte) -97);
                    field7690[field7687++] = var138 == null ? 0 : 1;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field7690[field7687++] = class664.field9481 == null ? -1 : class664.field9481.field9731;
                return;
            }
            if (arg0 == 5236) {
                field7687 -= 2;
                int var139 = field7690[field7687];
                int var140 = field7690[field7687 + 1];
                int var141 = var140 >> 14 & 0x3FFF;
                int var142 = var140 & 0x3FFF;
                int var143 = class227.method1584(var139, (byte) 115, var141, var142);
                if (var143 < 0) {
                    field7690[field7687++] = -1;
                    return;
                }
                field7690[field7687++] = var143;
                return;
            }
            if (arg0 == 5237) {
                class68.method596(false);
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field7687 -= 2;
                int var144 = field7690[field7687];
                int var145 = field7690[field7687 + 1];
                class301.method1886(var144, false, (byte) 116, var145, 3);
                field7690[field7687++] = class214.field3211 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class214.field3211 != null) {
                    class301.method1886(-1, false, (byte) 87, -1, class243.field3580.field7993.method2653(false));
                }
                return;
            }
            if (arg0 == 5302) {
                class750[] var146 = class609.method3545(-769);
                field7690[field7687++] = var146.length;
                return;
            }
            if (arg0 == 5303) {
                int var147 = field7690[--field7687];
                class750[] var148 = class609.method3545(-769);
                field7690[field7687++] = var148[var147].field10454;
                field7690[field7687++] = var148[var147].field10455;
                return;
            }
            if (arg0 == 5305) {
                int var149 = class142.field1927;
                int var150 = class744.field10392;
                int var151 = -1;
                class750[] var152 = class609.method3545(-769);
                for (int var153 = 0; var153 < var152.length; var153++) {
                    class750 var154 = var152[var153];
                    if (var154.field10454 == var149 && var154.field10455 == var150) {
                        var151 = var153;
                        break;
                    }
                }
                field7690[field7687++] = var151;
                return;
            }
            if (arg0 == 5306) {
                field7690[field7687++] = class184.method1305(1);
                return;
            }
            if (arg0 == 5307) {
                int var155 = field7690[--field7687];
                if (var155 >= 1 && var155 <= 2) {
                    class301.method1886(-1, false, (byte) 84, -1, var155);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field7690[field7687++] = class243.field3580.field7993.method2653(false);
                return;
            }
            if (arg0 == 5309) {
                int var156 = field7690[--field7687];
                if (var156 >= 1 && var156 <= 2) {
                    class243.field3580.method3301(var156, 24, class243.field3580.field7993);
                    class243.field3580.method3301(var156, 24, class243.field3580.field7968);
                    class23.method102((byte) -74);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field7689 -= 2;
                String var157 = field7703[field7689];
                String var158 = field7703[field7689 + 1];
                int var159 = field7690[--field7687];
                field7700++;
                class88 var160 = class448.method2741((byte) 63, class123.field1690, class583.field8319);
                var160.field1260.method2881(class231.method1605((byte) 44, var157) + class231.method1605((byte) 44, var158) + 1, (byte) 109);
                var160.field1260.method2902(var157, false);
                var160.field1260.method2902(var158, false);
                var160.field1260.method2881(var159, (byte) 109);
                class523.method3183(var160, (byte) 31);
                return;
            }
            if (arg0 == 5401) {
                field7687 -= 2;
                class37.field338[field7690[field7687]] = (short) class37.method189(field7690[field7687 + 1], true);
                class425.field6147.method4151(false);
                class425.field6147.method4149((byte) -104);
                class288.field4000.method2828(105);
                class328.method2021(-8586);
                return;
            }
            if (arg0 == 5405) {
                field7687 -= 2;
                int var161 = field7690[field7687];
                int var162 = field7690[field7687 + 1];
                if (var161 >= 0 && var161 < 2) {
                    class231.field3476[var161] = new int[var162 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field7687 -= 7;
                int var163 = field7690[field7687];
                int var164 = field7690[field7687 + 1] << 1;
                int var165 = field7690[field7687 + 2];
                int var166 = field7690[field7687 + 3];
                int var167 = field7690[field7687 + 4];
                int var168 = field7690[field7687 + 5];
                int var169 = field7690[field7687 + 6];
                if (var163 >= 0 && var163 < 2 && class231.field3476[var163] != null && var164 >= 0 && var164 < class231.field3476[var163].length) {
                    class231.field3476[var163][var164] = new int[] { (var165 >> 14 & 0x3FFF) << 9, var166 << 2, (var165 & 0x3FFF) << 9, var169 };
                    class231.field3476[var163][var164 + 1] = new int[] { (var167 >> 14 & 0x3FFF) << 9, var168 << 2, (var167 & 0x3FFF) << 9 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var170 = class231.field3476[field7690[--field7687]].length >> 1;
                field7690[field7687++] = var170;
                return;
            }
            if (arg0 == 5411) {
                if (class214.field3211 != null) {
                    class301.method1886(-1, false, (byte) 100, -1, class243.field3580.field7993.method2653(false));
                }
                if (class696.field9834 != null) {
                    class424.method2627(false);
                    System.exit(0);
                    return;
                }
                String var171 = class26.field239 == null ? class744.method4147(false) : class26.field239;
                class433.method2661(false, class243.field3580.field7975.method3775(false) == 1, 0, var171, class345.field4749);
                return;
            }
            if (arg0 == 5419) {
                String var172 = "";
                if (class601.field8532 != null) {
                    if (class601.field8532.field6200 == null) {
                        var172 = class253.method1698(1, class601.field8532.field6197);
                    } else {
                        var172 = (String) class601.field8532.field6200;
                    }
                }
                field7703[field7689++] = var172;
                return;
            }
            if (arg0 == 5420) {
                field7690[field7687++] = class345.field4749.field4087 ? 0 : 1;
                return;
            }
            if (arg0 == 5421) {
                if (class214.field3211 != null) {
                    class301.method1886(-1, false, (byte) 78, -1, class243.field3580.field7993.method2653(false));
                }
                String var173 = field7703[--field7689];
                boolean var174 = field7690[--field7687] == 1;
                String var175 = class744.method4147(false) + var173;
                class433.method2661(var174, class243.field3580.field7975.method3775(false) == 1, 0, var175, class345.field4749);
                return;
            }
            if (arg0 == 5422) {
                field7689 -= 2;
                String var176 = field7703[field7689];
                String var177 = field7703[field7689 + 1];
                int var178 = field7690[--field7687];
                if (var176.length() > 0) {
                    if (class709.field9966 == null) {
                        class709.field9966 = new String[class745.field10412[class528.field7683.field4258]];
                    }
                    class709.field9966[var178] = var176;
                }
                if (var177.length() > 0) {
                    if (class202.field3002 == null) {
                        class202.field3002 = new String[class745.field10412[class528.field7683.field4258]];
                    }
                    class202.field3002[var178] = var177;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field7703[--field7689]);
                return;
            }
            if (arg0 == 5424) {
                field7687 -= 11;
                class321.field4380 = field7690[field7687];
                class193.field2831 = field7690[field7687 + 1];
                class714.field10063 = field7690[field7687 + 2];
                class227.field3396 = field7690[field7687 + 3];
                class596.field8479 = field7690[field7687 + 4];
                class750.field10458 = field7690[field7687 + 5];
                class494.field7113 = field7690[field7687 + 6];
                class167.field2365 = field7690[field7687 + 7];
                class342.field4707 = field7690[field7687 + 8];
                class45.field755 = field7690[field7687 + 9];
                class484.field6981 = field7690[field7687 + 10];
                class603.field8548.method2609(0, class596.field8479);
                class603.field8548.method2609(0, class750.field10458);
                class603.field8548.method2609(0, class494.field7113);
                class603.field8548.method2609(0, class167.field2365);
                class603.field8548.method2609(0, class342.field4707);
                class568.field8208 = null;
                class640.field9112 = null;
                class727.field10224 = null;
                class349.field5167 = null;
                class301.field4123 = null;
                class72.field1097 = null;
                class236.field3530 = null;
                class509.field7379 = null;
                class404.field5765 = true;
                return;
            }
            if (arg0 == 5425) {
                class544.method3273(false);
                class404.field5765 = false;
                return;
            }
            if (arg0 == 5426) {
                field7687 -= 2;
                class718.field10132 = field7690[field7687];
                class474.field6744 = field7690[field7687 + 1];
                return;
            }
            if (arg0 == 5427) {
                field7687 -= 2;
                class730.field10241 = field7690[field7687 + 1];
                return;
            }
            if (arg0 == 5428) {
                field7687 -= 2;
                int var179 = field7690[field7687];
                int var180 = field7690[field7687 + 1];
                field7690[field7687++] = class349.method2224((byte) -35, var180, var179) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class368.method2316(false, field7703[--field7689], false, 10);
                return;
            }
            if (arg0 == 5430) {
                try {
                    class665.method3803(class486.field6999, "accountcreated", (byte) 72);
                    return;
                } catch (Throwable var321) {
                    return;
                }
            }
            if (arg0 == 5431) {
                try {
                    class665.method3803(class486.field6999, "accountcreatestarted", (byte) 60);
                    return;
                } catch (Throwable var322) {
                    return;
                }
            }
            if (arg0 == 5432) {
                String var181 = "";
                if (class554.field8058 != null) {
                    Transferable var182 = class554.field8058.getContents(null);
                    if (var182 != null) {
                        try {
                            var181 = (String) var182.getTransferData(DataFlavor.stringFlavor);
                            if (var181 == null) {
                                var181 = "";
                            }
                        } catch (Exception var323) {
                        }
                    }
                }
                field7703[field7689++] = var181;
                return;
            }
            if (arg0 == 5433) {
                class638.field9031 = field7690[--field7687];
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field7687 -= 4;
                int var183 = field7690[field7687];
                int var184 = field7690[field7687 + 1];
                int var185 = field7690[field7687 + 2];
                int var186 = field7690[field7687 + 3];
                class701.method3935((var183 & 0x3FFF) - class71.field1085, var186, 10198, var184 << 2, var185, (var183 >> 14 & 0x3FFF) - class41.field693, false);
                return;
            }
            if (arg0 == 5501) {
                field7687 -= 4;
                int var187 = field7690[field7687];
                int var188 = field7690[field7687 + 1];
                int var189 = field7690[field7687 + 2];
                int var190 = field7690[field7687 + 3];
                class376.method2335((var187 & 0x3FFF) - class71.field1085, var189, (byte) 125, var188 << 2, (var187 >> 14 & 0x3FFF) - class41.field693, var190);
                return;
            }
            if (arg0 == 5502) {
                field7687 -= 6;
                int var191 = field7690[field7687];
                if (var191 >= 2) {
                    throw new RuntimeException();
                }
                class39.field674 = var191;
                int var192 = field7690[field7687 + 1];
                if (var192 + 1 >= class231.field3476[class39.field674].length >> 1) {
                    throw new RuntimeException();
                }
                class368.field5378 = var192;
                class549.field8012 = 0;
                class559.field8117 = field7690[field7687 + 2];
                class84.field1249 = field7690[field7687 + 3];
                int var193 = field7690[field7687 + 4];
                if (var193 >= 2) {
                    throw new RuntimeException();
                }
                class729.field10234 = var193;
                int var194 = field7690[field7687 + 5];
                if (var194 + 1 >= class231.field3476[class729.field10234].length >> 1) {
                    throw new RuntimeException();
                }
                class387.field5594 = var194;
                class165.field2351 = 3;
                class616.field8773 = -1;
                class539.field7824 = -1;
                return;
            }
            if (arg0 == 5503) {
                class743.method4135((byte) 81);
                return;
            }
            if (arg0 == 5504) {
                field7687 -= 2;
                class639.method3682(field7690[field7687], 0, 3, field7690[field7687 + 1]);
                return;
            }
            if (arg0 == 5505) {
                field7690[field7687++] = (int) class112.field1584 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field7690[field7687++] = (int) class680.field9668 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class292.method1834(31726);
                return;
            }
            if (arg0 == 5508) {
                class51.method472((byte) -33);
                return;
            }
            if (arg0 == 5509) {
                class747.method4161(0);
                return;
            }
            if (arg0 == 5510) {
                class252.method1695((byte) -90);
                return;
            }
            if (arg0 == 5511) {
                int var195 = field7690[--field7687];
                int var196 = var195 >> 14 & 0x3FFF;
                int var197 = var195 & 0x3FFF;
                int var198 = var196 - class41.field693;
                if (var198 < 0) {
                    var198 = 0;
                } else if (var198 >= class184.field2546) {
                    var198 = class184.field2546;
                }
                int var199 = var197 - class71.field1085;
                if (var199 < 0) {
                    var199 = 0;
                } else if (var199 >= class240.field3555) {
                    var199 = class240.field3555;
                }
                class472.field6697 = (var198 << 9) + 256;
                class658.field9426 = (var199 << 9) + 256;
                class165.field2351 = 4;
                class616.field8773 = -1;
                class539.field7824 = -1;
                return;
            }
            if (arg0 == 5512) {
                class493.method2998(3);
                return;
            }
            if (arg0 == 5514) {
                class680.field9669 = field7690[--field7687];
                return;
            }
            if (arg0 == 5516) {
                field7690[field7687++] = class680.field9669;
                return;
            }
            if (arg0 == 5517) {
                int var200 = field7690[--field7687];
                if (var200 == -1) {
                    int var201 = var200 >> 14 & 0x3FFF;
                    int var202 = var200 & 0x3FFF;
                    int var203 = var201 - class41.field693;
                    if (var203 < 0) {
                        var203 = 0;
                    } else if (var203 >= class184.field2546) {
                        var203 = class184.field2546;
                    }
                    int var204 = var202 - class71.field1085;
                    if (var204 < 0) {
                        var204 = 0;
                    } else if (var204 >= class240.field3555) {
                        var204 = class240.field3555;
                    }
                    class539.field7824 = (var203 << 9) + 256;
                    class616.field8773 = (var204 << 9) + 256;
                    return;
                }
                class539.field7824 = -1;
                class616.field8773 = -1;
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field7689 -= 2;
                String var205 = field7703[field7689];
                String var206 = field7703[field7689 + 1];
                int var207 = field7690[--field7687];
                if (var205.length() > 320) {
                    return;
                }
                if (class369.field5392 != 3) {
                    return;
                }
                if (class35.field318 == 0 && class328.field4452 == 0) {
                    class505.field7344 = var205;
                    class669.field9541 = var206;
                    class544.field7903 = var207;
                    class79.method649(-19704, 6);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class204.method1458((byte) 121);
                return;
            }
            if (arg0 == 5602) {
                if (class35.field318 == 0) {
                    class642.field9133 = -2;
                    class560.field8129 = -2;
                }
                return;
            }
            if (arg0 == 5604) {
                field7689--;
                if (class369.field5392 != 3) {
                    return;
                }
                if (class35.field318 == 0 && class328.field4452 == 0) {
                    class26.method117(field7703[field7689], (byte) 117);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field7689 -= 2;
                field7687 -= 2;
                if (class369.field5392 != 3) {
                    return;
                }
                if (class35.field318 == 0 && class328.field4452 == 0) {
                    class206.method1474(field7703[field7689], (byte) -119, field7690[field7687], field7703[field7689 + 1], field7690[field7687 + 1] == 1);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class328.field4452 == 0) {
                    class306.field4163 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field7690[field7687++] = class560.field8129;
                return;
            }
            if (arg0 == 5608) {
                field7690[field7687++] = class666.field9518;
                return;
            }
            if (arg0 == 5609) {
                field7690[field7687++] = class306.field4163;
                return;
            }
            if (arg0 == 5611) {
                field7690[field7687++] = class228.field3417;
                return;
            }
            if (arg0 == 5612) {
                int var208 = field7690[--field7687];
                if (class369.field5392 != 7) {
                    return;
                }
                if (class35.field318 == 0 && class328.field4452 == 0) {
                    if (class325.field4415 != null) {
                        class325.field4415.method1581(false);
                        class325.field4415 = null;
                    }
                    class544.field7903 = var208;
                    class79.method649(-19704, 9);
                    return;
                }
                return;
            }
            if (arg0 == 5613) {
                field7690[field7687++] = class560.field8129;
                return;
            }
            if (arg0 == 5615) {
                field7689 -= 2;
                String var209 = field7703[field7689];
                String var210 = field7703[field7689 + 1];
                if (var209.length() > 320) {
                    return;
                }
                if (class369.field5392 != 3) {
                    return;
                }
                if (class35.field318 == 0 && class328.field4452 == 0) {
                    if (class325.field4415 != null) {
                        class325.field4415.method1581(false);
                        class325.field4415 = null;
                    }
                    class505.field7344 = var209;
                    class669.field9541 = var210;
                    class79.method649(-19704, 5);
                    return;
                }
                return;
            }
            if (arg0 == 5616) {
                class89.method694(false, 0);
                return;
            }
            if (arg0 == 5617) {
                field7690[field7687++] = class642.field9133;
                return;
            }
            if (arg0 == 5618) {
                field7687--;
                return;
            }
            if (arg0 == 5619) {
                field7687--;
                return;
            }
            if (arg0 == 5620) {
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 5621) {
                field7689 -= 2;
                field7687 -= 2;
                return;
            }
            if (arg0 == 5622) {
                return;
            }
            if (arg0 == 5623) {
                if (client.field6418 != null) {
                    field7690[field7687++] = 1;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 5624) {
                field7690[field7687++] = (int) (class461.field6558 >> 32);
                field7690[field7687++] = (int) (class461.field6558 & 0xFFFFL);
                return;
            }
            if (arg0 == 5625) {
                field7690[field7687++] = class683.field9702 ? 1 : 0;
                return;
            }
            if (arg0 == 5626) {
                class683.field9702 = true;
                class337.method2078(108);
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var211 = field7690[--field7687];
                class243.field3580.method3301(var211, 24, class243.field3580.field8018);
                class443.method2708(-381264440);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6002) {
                boolean var212 = field7690[--field7687] == 1;
                class243.field3580.method3301(var212 ? 1 : 0, 24, class243.field3580.field7964);
                class243.field3580.method3301(var212 ? 1 : 0, 24, class243.field3580.field8002);
                class443.method2708(-381264440);
                class726.method4054(1);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6003) {
                boolean var213 = field7690[--field7687] == 1;
                class243.field3580.method3301(var213 ? 2 : 1, 24, class243.field3580.field7998);
                class243.field3580.method3301(var213 ? 2 : 1, 24, class243.field3580.field7986);
                class726.method4054(1);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6005) {
                class243.field3580.method3301(field7690[--field7687] == 1 ? 1 : 0, 24, class243.field3580.field7996);
                class443.method2708(-381264440);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6007) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field7966);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6008) {
                class243.field3580.method3301(field7690[--field7687] == 1 ? 1 : 0, 24, class243.field3580.field8006);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6010) {
                class243.field3580.method3301(field7690[--field7687] == 1 ? 1 : 0, 24, class243.field3580.field7994);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6011) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field8007);
                class443.method2708(-381264440);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6012) {
                class243.field3580.method3301(field7690[--field7687] == 1 ? 1 : 0, 24, class243.field3580.field7991);
                class181.method1284(-120);
                class728.method4065(-1386);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6014) {
                class243.field3580.method3301(field7690[--field7687] == 1 ? 2 : 0, 24, class243.field3580.field8001);
                class443.method2708(-381264440);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6015) {
                class243.field3580.method3301(field7690[--field7687] == 1 ? 1 : 0, 24, class243.field3580.field8005);
                class443.method2708(-381264440);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6016) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field8017);
                class403.method2449(false, class243.field3580.field7975.method3775(false), -70);
                class23.method102((byte) -74);
                return;
            }
            if (arg0 == 6017) {
                class243.field3580.method3301(field7690[--field7687] == 1 ? 1 : 0, 24, class243.field3580.field7987);
                class12.method65((byte) 125);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6018) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field7989);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6019) {
                int var214 = field7690[--field7687];
                int var215 = class243.field3580.field7980.method3577(false);
                if (var214 != var215) {
                    if (class25.method106(class369.field5392, 71)) {
                        if (var215 == 0 && class428.field6173 != -1) {
                            class219.method1545(false, 0, class428.field6173, class505.field7338, var214, 0);
                            class303.method1894(0);
                            class509.field7381 = false;
                        } else if (var214 == 0) {
                            class547.method3295(-40);
                            class509.field7381 = false;
                        } else {
                            class257.method1713(var214, 52);
                        }
                    }
                    class243.field3580.method3301(var214, 24, class243.field3580.field7980);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                }
                return;
            }
            if (arg0 == 6020) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field8000);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6021) {
                int var216 = class243.field3580.field7998.method185(false);
                class243.field3580.method3301(field7690[--field7687] == 1 ? 0 : var216, 24, class243.field3580.field7986);
                class726.method4054(1);
                return;
            }
            if (arg0 == 6023) {
                int var217 = field7690[--field7687];
                class243.field3580.method3301(var217, 24, class243.field3580.field7973);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6024) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field8015);
                class23.method102((byte) -74);
                return;
            }
            if (arg0 == 6025) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field7974);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6027) {
                int var218 = field7690[--field7687];
                if (var218 < 0 || var218 > 1) {
                    var218 = 0;
                }
                class202.method1436(-120, var218 == 1);
                return;
            }
            if (arg0 == 6028) {
                class243.field3580.method3301(field7690[--field7687] == 0 ? 0 : 1, 24, class243.field3580.field7977);
                class23.method102((byte) -74);
                return;
            }
            if (arg0 == 6029) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field7966);
                class23.method102((byte) -74);
                return;
            }
            if (arg0 == 6030) {
                class243.field3580.method3301(field7690[--field7687] == 0 ? 0 : 1, 24, class243.field3580.field7972);
                class23.method102((byte) -74);
                class443.method2708(-381264440);
                return;
            }
            if (arg0 == 6031) {
                int var219 = field7690[--field7687];
                if (var219 < 0 || var219 > 5) {
                    var219 = 2;
                }
                class403.method2449(false, var219, -104);
                return;
            }
            if (arg0 == 6032) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field8019);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6033) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field7995);
                class23.method102((byte) -74);
                return;
            }
            if (arg0 == 6034) {
                class243.field3580.method3301(field7690[--field7687] == 1 ? 1 : 0, 24, class243.field3580.field8008);
                class23.method102((byte) -74);
                class181.method1284(-94);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6035) {
                int var220 = class243.field3580.field7964.method2026(false);
                class243.field3580.method3301(field7690[--field7687] == 1 ? 1 : var220, 24, class243.field3580.field8002);
                class443.method2708(-381264440);
                class726.method4054(1);
                return;
            }
            if (arg0 == 6036) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field7983);
                class23.method102((byte) -74);
                class567.field8205 = true;
                return;
            }
            if (arg0 == 6037) {
                class243.field3580.method3301(field7690[--field7687], 24, class243.field3580.field7969);
                class23.method102((byte) -74);
                class713.field10057 = false;
                return;
            }
            if (arg0 == 6038) {
                int var221 = field7690[--field7687];
                int var222 = class243.field3580.field7988.method3577(false);
                if (var221 != var222 && class428.field6173 == class304.field4155) {
                    if (!class25.method106(class369.field5392, 114)) {
                        if (var222 == 0) {
                            class219.method1545(false, 0, class428.field6173, class505.field7338, var221, 0);
                            class303.method1894(0);
                            class509.field7381 = false;
                        } else if (var221 == 0) {
                            class547.method3295(-128);
                            class509.field7381 = false;
                        } else {
                            class257.method1713(var221, -115);
                        }
                    }
                    class243.field3580.method3301(var221, 24, class243.field3580.field7988);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                }
                return;
            }
            if (arg0 == 6039) {
                int var223 = field7690[--field7687];
                if (var223 > 255 || var223 < 0) {
                    var223 = 0;
                }
                if (var223 != class243.field3580.field7999.method1758(false)) {
                    class243.field3580.method3301(var223, 24, class243.field3580.field7999);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                }
                return;
            }
            if (arg0 == 6040) {
                int var224 = field7690[--field7687];
                if (var224 != class243.field3580.field7979.method3835(false)) {
                    class243.field3580.method3301(var224, 24, class243.field3580.field7979);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    class50.method468(-120);
                }
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field7690[field7687++] = class243.field3580.field8018.method3449(false);
                return;
            }
            if (arg0 == 6102) {
                field7690[field7687++] = class243.field3580.field7964.method2026(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field7690[field7687++] = class243.field3580.field7998.method185(false) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field7690[field7687++] = class243.field3580.field7996.method2663(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field7690[field7687++] = class243.field3580.field7966.method695(false);
                return;
            }
            if (arg0 == 6108) {
                field7690[field7687++] = class243.field3580.field8006.method2850(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field7690[field7687++] = class243.field3580.field7994.method2410(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field7690[field7687++] = class243.field3580.field8007.method435(false);
                return;
            }
            if (arg0 == 6112) {
                field7690[field7687++] = class243.field3580.field7991.method3589(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field7690[field7687++] = class243.field3580.field8001.method3761(false) == 2 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field7690[field7687++] = class243.field3580.field8005.method4058(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field7690[field7687++] = class243.field3580.field8017.method2498(false);
                return;
            }
            if (arg0 == 6117) {
                field7690[field7687++] = class243.field3580.field7987.method1092(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field7690[field7687++] = class243.field3580.field7989.method3577(false);
                return;
            }
            if (arg0 == 6119) {
                field7690[field7687++] = class243.field3580.field7980.method3577(false);
                return;
            }
            if (arg0 == 6120) {
                field7690[field7687++] = class243.field3580.field8000.method3577(false);
                return;
            }
            if (arg0 == 6123) {
                field7690[field7687++] = class140.method992(false);
                return;
            }
            if (arg0 == 6124) {
                field7690[field7687++] = class243.field3580.field8015.method2498(false);
                return;
            }
            if (arg0 == 6125) {
                field7690[field7687++] = class243.field3580.field7974.method1117(false);
                return;
            }
            if (arg0 == 6127) {
                field7690[field7687++] = class243.field3580.field8011.method2959(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field7690[field7687++] = class243.field3580.field7977.method2272(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field7690[field7687++] = class243.field3580.field7966.method695(false);
                return;
            }
            if (arg0 == 6130) {
                field7690[field7687++] = class243.field3580.field7972.method1587(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field7690[field7687++] = class243.field3580.field7975.method3775(false);
                return;
            }
            if (arg0 == 6132) {
                field7690[field7687++] = class243.field3580.field8019.method3775(false);
                return;
            }
            if (arg0 == 6133) {
                field7690[field7687++] = class345.field4749.field4087 && !class345.field4749.field4100 ? 1 : 0;
                return;
            }
            if (arg0 == 6135) {
                field7690[field7687++] = class243.field3580.field7995.method3249(false);
                return;
            }
            if (arg0 == 6136) {
                field7690[field7687++] = class243.field3580.field8008.method4186(false) == 1 ? 1 : 0;
                return;
            }
            if (arg0 == 6138) {
                field7690[field7687++] = class472.method2842(200, class243.field3580.field7975.method3775(false), 500);
                return;
            }
            if (arg0 == 6139) {
                field7690[field7687++] = class243.field3580.field7983.method619(false);
                return;
            }
            if (arg0 == 6142) {
                field7690[field7687++] = class243.field3580.field7969.method3577(false);
                return;
            }
            if (arg0 == 6143) {
                field7690[field7687++] = class243.field3580.field7988.method3577(false);
                return;
            }
            if (arg0 == 6144) {
                field7690[field7687++] = class212.field3169 ? 1 : 0;
                return;
            }
            if (arg0 == 6145) {
                field7690[field7687++] = class243.field3580.field7999.method1758(false);
                return;
            }
            if (arg0 == 6146) {
                field7690[field7687++] = class243.field3580.field7979.method3835(false);
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field7687 -= 2;
                class84.field1253 = (short) field7690[field7687];
                if (class84.field1253 <= 0) {
                    class84.field1253 = 256;
                }
                class343.field4719 = (short) field7690[field7687 + 1];
                if (class343.field4719 <= 0) {
                    class343.field4719 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field7687 -= 2;
                class503.field7317 = (short) field7690[field7687];
                if (class503.field7317 <= 0) {
                    class503.field7317 = 256;
                }
                class121.field1645 = (short) field7690[field7687 + 1];
                if (class121.field1645 <= 0) {
                    class121.field1645 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field7687 -= 4;
                class123.field1686 = (short) field7690[field7687];
                if (class123.field1686 <= 0) {
                    class123.field1686 = 1;
                }
                class613.field8761 = (short) field7690[field7687 + 1];
                if (class613.field8761 <= 0) {
                    class613.field8761 = 32767;
                } else if (class613.field8761 < class123.field1686) {
                    class613.field8761 = class123.field1686;
                }
                class553.field8050 = (short) field7690[field7687 + 2];
                if (class553.field8050 <= 0) {
                    class553.field8050 = 1;
                }
                class600.field8520 = (short) field7690[field7687 + 3];
                if (class600.field8520 <= 0) {
                    class600.field8520 = 32767;
                    return;
                }
                if (class600.field8520 < class553.field8050) {
                    class600.field8520 = class553.field8050;
                }
                return;
            }
            if (arg0 == 6203) {
                class377.method2340(0, class594.field8450.field2016, 0, class594.field8450.field1997, false, -80);
                field7690[field7687++] = class647.field9331;
                field7690[field7687++] = class438.field6258;
                return;
            }
            if (arg0 == 6204) {
                field7690[field7687++] = class503.field7317;
                field7690[field7687++] = class121.field1645;
                return;
            }
            if (arg0 == 6205) {
                field7690[field7687++] = class84.field1253;
                field7690[field7687++] = class343.field4719;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field7690[field7687++] = (int) (class465.method2818(255) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field7690[field7687++] = (int) (class465.method2818(255) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field7687 -= 3;
                int var225 = field7690[field7687];
                int var226 = field7690[field7687 + 1];
                int var227 = field7690[field7687 + 2];
                field7704.clear();
                field7704.set(11, 12);
                field7704.set(var227, var226, var225);
                int var228 = (int) (field7704.getTime().getTime() / 86400000L) - 11745;
                if (var227 < 1970) {
                    var228--;
                }
                field7690[field7687++] = var228;
                return;
            }
            if (arg0 == 6303) {
                field7704.clear();
                field7704.setTime(new Date(class465.method2818(255)));
                field7690[field7687++] = field7704.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var229 = field7690[--field7687];
                boolean var230 = true;
                if (var229 < 0) {
                    var230 = (var229 + 1) % 4 == 0;
                } else if (var229 < 1582) {
                    var230 = var229 % 4 == 0;
                } else if (var229 % 4 != 0) {
                    var230 = false;
                } else if (var229 % 100 != 0) {
                    var230 = true;
                } else if (var229 % 400 != 0) {
                    var230 = false;
                }
                field7690[field7687++] = var230 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field7690[field7687++] = class452.method2767(28493) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field7690[field7687++] = class241.method1661(-1) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class369.field5392 == 7 && class35.field318 == 0 && class328.field4452 == 0) {
                    if (class494.field7107) {
                        field7690[field7687++] = 0;
                        return;
                    }
                    if (class573.field8265 > class465.method2818(255) - 1000L) {
                        field7690[field7687++] = 1;
                        return;
                    }
                    class494.field7107 = true;
                    class88 var231 = class448.method2741((byte) 63, class339.field4678, class583.field8319);
                    var231.field1260.method2926((byte) -128, class364.field5327);
                    class523.method3183(var231, (byte) 31);
                    field7690[field7687++] = 0;
                    return;
                }
                field7690[field7687++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class592 var232 = class61.method573(false);
                if (var232 != null) {
                    field7690[field7687++] = var232.field8417;
                    field7690[field7687++] = var232.field4069;
                    field7703[field7689++] = var232.field8416;
                    class731 var233 = var232.method3474((byte) -97);
                    field7690[field7687++] = var233.field10245;
                    field7703[field7689++] = var233.field10249;
                    field7690[field7687++] = var232.field4068;
                    field7690[field7687++] = var232.field8418;
                    field7703[field7689++] = var232.field8412;
                    return;
                }
                field7690[field7687++] = -1;
                field7690[field7687++] = 0;
                field7703[field7689++] = "";
                field7690[field7687++] = 0;
                field7703[field7689++] = "";
                field7690[field7687++] = 0;
                field7690[field7687++] = 0;
                field7703[field7689++] = "";
                return;
            }
            if (arg0 == 6502) {
                class592 var234 = class644.method3713(31240);
                if (var234 != null) {
                    field7690[field7687++] = var234.field8417;
                    field7690[field7687++] = var234.field4069;
                    field7703[field7689++] = var234.field8416;
                    class731 var235 = var234.method3474((byte) -5);
                    field7690[field7687++] = var235.field10245;
                    field7703[field7689++] = var235.field10249;
                    field7690[field7687++] = var234.field4068;
                    field7690[field7687++] = var234.field8418;
                    field7703[field7689++] = var234.field8412;
                    return;
                }
                field7690[field7687++] = -1;
                field7690[field7687++] = 0;
                field7703[field7689++] = "";
                field7690[field7687++] = 0;
                field7703[field7689++] = "";
                field7690[field7687++] = 0;
                field7690[field7687++] = 0;
                field7703[field7689++] = "";
                return;
            }
            if (arg0 == 6503) {
                int var236 = field7690[--field7687];
                String var237 = field7703[--field7689];
                if (class369.field5392 == 7 && class35.field318 == 0 && class328.field4452 == 0) {
                    field7690[field7687++] = class51.method473(50000, var236, var237) ? 1 : 0;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 6506) {
                int var238 = field7690[--field7687];
                class592 var239 = class613.method3569(32767, var238);
                if (var239 != null) {
                    field7690[field7687++] = var239.field4069;
                    field7703[field7689++] = var239.field8416;
                    class731 var240 = var239.method3474((byte) -114);
                    field7690[field7687++] = var240.field10245;
                    field7703[field7689++] = var240.field10249;
                    field7690[field7687++] = var239.field4068;
                    field7690[field7687++] = var239.field8418;
                    field7703[field7689++] = var239.field8412;
                    return;
                }
                field7690[field7687++] = -1;
                field7703[field7689++] = "";
                field7690[field7687++] = 0;
                field7703[field7689++] = "";
                field7690[field7687++] = 0;
                field7690[field7687++] = 0;
                field7703[field7689++] = "";
                return;
            }
            if (arg0 == 6507) {
                field7687 -= 4;
                int var241 = field7690[field7687];
                boolean var242 = field7690[field7687 + 1] == 1;
                int var243 = field7690[field7687 + 2];
                boolean var244 = field7690[field7687 + 3] == 1;
                class484.method2958(var243, -1, var242, var244, var241);
                return;
            }
            if (arg0 == 6508) {
                class181.method1283(true);
                return;
            }
            if (arg0 == 6509) {
                if (class369.field5392 != 7) {
                    return;
                }
                class410.field5818 = field7690[--field7687] == 1;
                return;
            }
            if (arg0 == 6510) {
                field7690[field7687++] = class616.field8781;
                return;
            }
        } else if (arg0 >= 6700) {
            if (arg0 < 6800 && class291.field4014 == class283.field3959) {
                if (arg0 == 6700) {
                    int var245 = class591.field8410.method4019(7);
                    if (class346.field4771 != -1) {
                        var245++;
                    }
                    field7690[field7687++] = var245;
                    return;
                }
                if (arg0 == 6701) {
                    int var246 = field7690[--field7687];
                    if (class346.field4771 != -1) {
                        if (var246 == 0) {
                            field7690[field7687++] = class346.field4771;
                            return;
                        }
                        var246--;
                    }
                    class182 var247 = (class182) class591.field8410.method4023((byte) -52);
                    while (var246-- > 0) {
                        var247 = (class182) class591.field8410.method4021((byte) 80);
                    }
                    field7690[field7687++] = var247.field2505;
                    return;
                }
                if (arg0 == 6702) {
                    int var248 = field7690[--field7687];
                    if (class600.field8524[var248] == null) {
                        field7703[field7689++] = "";
                        return;
                    }
                    String var249 = class600.field8524[var248][0].field2106;
                    if (var249 == null) {
                        field7703[field7689++] = "";
                        return;
                    }
                    field7703[field7689++] = var249.substring(0, var249.indexOf(58));
                    return;
                }
                if (arg0 == 6703) {
                    int var250 = field7690[--field7687];
                    if (class600.field8524[var250] == null) {
                        field7690[field7687++] = 0;
                        return;
                    }
                    field7690[field7687++] = class600.field8524[var250].length;
                    return;
                }
                if (arg0 == 6704) {
                    field7687 -= 2;
                    int var251 = field7690[field7687];
                    int var252 = field7690[field7687 + 1];
                    if (class600.field8524[var251] == null) {
                        field7703[field7689++] = "";
                        return;
                    }
                    String var253 = class600.field8524[var251][var252].field2106;
                    if (var253 == null) {
                        field7703[field7689++] = "";
                        return;
                    }
                    field7703[field7689++] = var253;
                    return;
                }
                if (arg0 == 6705) {
                    field7687 -= 2;
                    int var254 = field7690[field7687];
                    int var255 = field7690[field7687 + 1];
                    if (class600.field8524[var254] == null) {
                        field7690[field7687++] = 0;
                        return;
                    }
                    field7690[field7687++] = class600.field8524[var254][var255].field2076;
                    return;
                }
                if (arg0 == 6706) {
                    return;
                }
                if (arg0 == 6707) {
                    field7687 -= 3;
                    int var256 = field7690[field7687];
                    int var257 = field7690[field7687 + 1];
                    int var258 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 1, var258, var256 << 16 | var257);
                    return;
                }
                if (arg0 == 6708) {
                    field7687 -= 3;
                    int var259 = field7690[field7687];
                    int var260 = field7690[field7687 + 1];
                    int var261 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 2, var261, var259 << 16 | var260);
                    return;
                }
                if (arg0 == 6709) {
                    field7687 -= 3;
                    int var262 = field7690[field7687];
                    int var263 = field7690[field7687 + 1];
                    int var264 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 3, var264, var262 << 16 | var263);
                    return;
                }
                if (arg0 == 6710) {
                    field7687 -= 3;
                    int var265 = field7690[field7687];
                    int var266 = field7690[field7687 + 1];
                    int var267 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 4, var267, var265 << 16 | var266);
                    return;
                }
                if (arg0 == 6711) {
                    field7687 -= 3;
                    int var268 = field7690[field7687];
                    int var269 = field7690[field7687 + 1];
                    int var270 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 5, var270, var268 << 16 | var269);
                    return;
                }
                if (arg0 == 6712) {
                    field7687 -= 3;
                    int var271 = field7690[field7687];
                    int var272 = field7690[field7687 + 1];
                    int var273 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 6, var273, var271 << 16 | var272);
                    return;
                }
                if (arg0 == 6713) {
                    field7687 -= 3;
                    int var274 = field7690[field7687];
                    int var275 = field7690[field7687 + 1];
                    int var276 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 7, var276, var274 << 16 | var275);
                    return;
                }
                if (arg0 == 6714) {
                    field7687 -= 3;
                    int var277 = field7690[field7687];
                    int var278 = field7690[field7687 + 1];
                    int var279 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 8, var279, var277 << 16 | var278);
                    return;
                }
                if (arg0 == 6715) {
                    field7687 -= 3;
                    int var280 = field7690[field7687];
                    int var281 = field7690[field7687 + 1];
                    int var282 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 9, var282, var280 << 16 | var281);
                    return;
                }
                if (arg0 == 6716) {
                    field7687 -= 3;
                    int var283 = field7690[field7687];
                    int var284 = field7690[field7687 + 1];
                    int var285 = field7690[field7687 + 2];
                    class555.method3333(26952, "", 10, var285, var283 << 16 | var284);
                    return;
                }
                if (arg0 == 6717) {
                    field7687 -= 3;
                    int var286 = field7690[field7687];
                    int var287 = field7690[field7687 + 1];
                    int var288 = field7690[field7687 + 2];
                    class146 var289 = class590.method3467(1, var286 << 16 | var287, var288);
                    class61.method571(false);
                    class478 var290 = client.method2732(var289);
                    class355.method2260(var290.field6790, var289, 0, var290.method2860(false));
                    return;
                }
            } else if (arg0 < 6900) {
                if (arg0 == 6800) {
                    int var291 = field7690[--field7687];
                    class463 var292 = class386.field5581.method2687(var291, 36);
                    if (var292.field6585 == null) {
                        field7703[field7689++] = "";
                        return;
                    }
                    field7703[field7689++] = var292.field6585;
                    return;
                }
                if (arg0 == 6801) {
                    int var293 = field7690[--field7687];
                    class463 var294 = class386.field5581.method2687(var293, 36);
                    field7690[field7687++] = var294.field6580;
                    return;
                }
                if (arg0 == 6802) {
                    int var295 = field7690[--field7687];
                    class463 var296 = class386.field5581.method2687(var295, 36);
                    field7690[field7687++] = var296.field6606;
                    return;
                }
                if (arg0 == 6803) {
                    int var297 = field7690[--field7687];
                    class463 var298 = class386.field5581.method2687(var297, 36);
                    field7690[field7687++] = var298.field6597;
                    return;
                }
                if (arg0 == 6804) {
                    field7687 -= 2;
                    int var299 = field7690[field7687];
                    int var300 = field7690[field7687 + 1];
                    class167 var301 = class332.field4513.method1901(-4115, var300);
                    if (var301.method1195(-116)) {
                        field7703[field7689++] = class386.field5581.method2687(var299, 36).method2807(var301.field2373, var300, (byte) -69);
                        return;
                    }
                    field7690[field7687++] = class386.field5581.method2687(var299, 36).method2809(var301.field2364, var300, 1);
                    return;
                }
            } else if (arg0 < 7000) {
                if (arg0 == 6900) {
                    field7690[field7687++] = class321.field4368 && !class212.field3171 ? 1 : 0;
                    return;
                }
                if (arg0 == 6901) {
                    field7690[field7687++] = class174.field2448;
                    return;
                }
                if (arg0 == 6902) {
                    field7690[field7687++] = class743.field10371;
                    return;
                }
                if (arg0 == 6903) {
                    field7690[field7687++] = class399.field5705;
                    return;
                }
                if (arg0 == 6904) {
                    field7690[field7687++] = class295.field4053;
                    return;
                }
                if (arg0 == 6905) {
                    String var302 = "";
                    if (class601.field8532 != null) {
                        if (class601.field8532.field6200 == null) {
                            var302 = class253.method1698(1, class601.field8532.field6197);
                        } else {
                            var302 = (String) class601.field8532.field6200;
                        }
                    }
                    field7703[field7689++] = var302;
                    return;
                }
                if (arg0 == 6906) {
                    field7690[field7687++] = class674.field9596;
                    return;
                }
                if (arg0 == 6907) {
                    field7690[field7687++] = class186.field2608;
                    return;
                }
                if (arg0 == 6908) {
                    field7690[field7687++] = class57.field972;
                    return;
                }
                if (arg0 == 6909) {
                    field7690[field7687++] = class564.field8172 ? 1 : 0;
                    return;
                }
                if (arg0 == 6910) {
                    field7690[field7687++] = class70.field1076;
                    return;
                }
                if (arg0 == 6911) {
                    field7690[field7687++] = class235.field3515;
                    return;
                }
                if (arg0 == 6912) {
                    field7690[field7687++] = class629.field8916;
                    return;
                }
            } else if (arg0 < 7100) {
                if (arg0 == 7000) {
                    int var303 = class757.method4208(-1);
                    field7690[field7687++] = class227.field3384 = class243.field3580.field7975.method3775(false);
                    field7690[field7687++] = var303;
                    class443.method2708(-381264440);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    return;
                }
                if (arg0 == 7001) {
                    class693.method3910(2);
                    class443.method2708(-381264440);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    return;
                }
                if (arg0 == 7002) {
                    class353.method2246(true);
                    class443.method2708(-381264440);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    return;
                }
                if (arg0 == 7003) {
                    class184.method1302(0);
                    class443.method2708(-381264440);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    return;
                }
                if (arg0 == 7004) {
                    class521.method3171(true, (byte) 21);
                    class443.method2708(-381264440);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    return;
                }
                if (arg0 == 7005) {
                    class243.field3580.method3301(0, 24, class243.field3580.field7990);
                    class23.method102((byte) -74);
                    class713.field10057 = false;
                    return;
                }
                if (arg0 == 7006) {
                    if (class227.field3384 == 2) {
                        class458.field6512 = true;
                        return;
                    }
                    if (class227.field3384 == 1) {
                        class466.field6631 = true;
                        return;
                    }
                    if (class227.field3384 == 3) {
                        class374.field5415 = true;
                    }
                    return;
                }
                if (arg0 == 7007) {
                    field7690[field7687++] = class243.field3580.field7990.method467(false);
                    return;
                }
            } else if (arg0 < 7200) {
                if (arg0 == 7100) {
                    field7687 -= 2;
                    int var304 = field7690[field7687];
                    int var305 = field7690[field7687 + 1];
                    if (var304 != -1) {
                        if (var305 > 255) {
                            var305 = 255;
                        } else if (var305 < 0) {
                            var305 = 0;
                        }
                        class225.method1567(var304, (byte) -128, var305, false);
                    }
                    return;
                }
                if (arg0 == 7101) {
                    int var306 = field7690[--field7687];
                    if (var306 != -1) {
                        class405.method2463((byte) -118, var306);
                    }
                    return;
                }
                if (arg0 == 7102) {
                    int var307 = field7690[--field7687];
                    if (var307 != -1) {
                        class153.method1106(127, var307);
                    }
                    return;
                }
                if (arg0 == 7103) {
                    field7690[field7687++] = class176.method1263((byte) -126, "jagtheora") ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7300) {
                if (arg0 == 7201) {
                    field7690[field7687++] = class243.field3580.field7996.method2664(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7202) {
                    field7690[field7687++] = class243.field3580.field7994.method2407(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7203) {
                    field7690[field7687++] = class243.field3580.field8007.method433(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7204) {
                    field7690[field7687++] = class243.field3580.field8001.method3758(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7205) {
                    field7690[field7687++] = class243.field3580.field8015.method2497(-7558) && class211.field3164.method217() ? 1 : 0;
                    return;
                }
                if (arg0 == 7206) {
                    field7690[field7687++] = class243.field3580.field7973.method1541(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7207) {
                    field7690[field7687++] = class243.field3580.field7974.method1119(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7208) {
                    field7690[field7687++] = class243.field3580.field8011.method2957(-7558) && class211.field3164.method395() ? 1 : 0;
                    return;
                }
                if (arg0 == 7209) {
                    field7690[field7687++] = class243.field3580.field7972.method1590(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7210) {
                    field7690[field7687++] = class243.field3580.field8008.method4188(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7211) {
                    field7690[field7687++] = class243.field3580.field7983.method620(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7212) {
                    field7690[field7687++] = class243.field3580.field8005.method4057(-7558) ? 1 : 0;
                    return;
                }
                if (arg0 == 7213) {
                    field7690[field7687++] = class243.field3580.field7979.method3834(-7558) ? 1 : 0;
                    return;
                }
            } else if (arg0 < 7400) {
                if (arg0 == 7301) {
                    int var308 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field7996.method155(true, var308);
                    return;
                }
                if (arg0 == 7302) {
                    int var309 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field7994.method155(true, var309);
                    return;
                }
                if (arg0 == 7303) {
                    int var310 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field8007.method155(true, var310);
                    return;
                }
                if (arg0 == 7304) {
                    int var311 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field8001.method155(true, var311);
                    return;
                }
                if (arg0 == 7305) {
                    int var312 = field7690[--field7687];
                    if (!class211.field3164.method217()) {
                        field7690[field7687++] = 3;
                        return;
                    }
                    field7690[field7687++] = class243.field3580.field8015.method155(true, var312);
                    return;
                }
                if (arg0 == 7306) {
                    int var313 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field7973.method155(true, var313);
                    return;
                }
                if (arg0 == 7307) {
                    int var314 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field7974.method155(true, var314);
                    return;
                }
                if (arg0 == 7308) {
                    int var315 = field7690[--field7687];
                    if (!class211.field3164.method395()) {
                        field7690[field7687++] = 3;
                        return;
                    }
                    field7690[field7687++] = class243.field3580.field8011.method155(true, var315);
                    return;
                }
                if (arg0 == 7309) {
                    int var316 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field7972.method155(true, var316);
                    return;
                }
                if (arg0 == 7310) {
                    int var317 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field8008.method155(true, var317);
                    return;
                }
                if (arg0 == 7311) {
                    int var318 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field7983.method155(true, var318);
                    return;
                }
                if (arg0 == 7312) {
                    int var319 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field8005.method155(true, var319);
                    return;
                }
                if (arg0 == 7313) {
                    int var320 = field7690[--field7687];
                    field7690[field7687++] = class243.field3580.field7979.method155(true, var320);
                    return;
                }
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(C)I")
    private static final int method3199(char arg0) {
        return class627.method3616(arg0, -8365) ? 1 : 0;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lfda;I)V")
    private static final void method3200(class362 arg0, int arg1) {
        Object[] var2 = arg0.field5297;
        int var3 = (Integer) var2[0];
        class657 var4 = class158.method1125(123, var3);
        if (var4 == null) {
            return;
        }
        field7697 = new int[var4.field9411];
        int var5 = 0;
        field7688 = new String[var4.field9416];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field5300;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field5289;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field5304 == null ? -1 : arg0.field5304.field2079;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field5288;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field5304 == null ? -1 : arg0.field5304.field2010;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field5303 == null ? -1 : arg0.field5303.field2079;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field5303 == null ? -1 : arg0.field5303.field2010;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field5290;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field5293;
                }
                field7697[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field5299;
                }
                field7688[var6++] = var9;
            }
        }
        field7714 = arg0.field5294;
        method3208(var4, arg1);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method3201(String arg0, int arg1) {
        if (class598.field8507 == 0 && !(!class321.field4368 || class212.field3171) || class748.field10423) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class608.field8667.method3543(-24350, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class608.field8667.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8668.method3543(-24350, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class608.field8668.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8669.method3543(-24350, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class608.field8669.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8670.method3543(-24350, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class608.field8670.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8671.method3543(-24350, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class608.field8671.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8672.method3543(-24350, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class608.field8672.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8673.method3543(-24350, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class608.field8673.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8674.method3543(-24350, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class608.field8674.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8675.method3543(-24350, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class608.field8675.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8676.method3543(-24350, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class608.field8676.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8677.method3543(-24350, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class608.field8677.method3543(-24350, 0).length());
        } else if (var2.startsWith(class608.field8678.method3543(-24350, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class608.field8678.method3543(-24350, 0).length());
        } else if (class45.field748 != 0) {
            if (var2.startsWith(class608.field8667.method3543(-24350, class45.field748))) {
                var3 = 0;
                arg0 = arg0.substring(class608.field8667.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8668.method3543(-24350, class45.field748))) {
                var3 = 1;
                arg0 = arg0.substring(class608.field8668.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8669.method3543(-24350, class45.field748))) {
                var3 = 2;
                arg0 = arg0.substring(class608.field8669.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8670.method3543(-24350, class45.field748))) {
                var3 = 3;
                arg0 = arg0.substring(class608.field8670.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8671.method3543(-24350, class45.field748))) {
                var3 = 4;
                arg0 = arg0.substring(class608.field8671.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8672.method3543(-24350, class45.field748))) {
                var3 = 5;
                arg0 = arg0.substring(class608.field8672.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8673.method3543(-24350, class45.field748))) {
                var3 = 6;
                arg0 = arg0.substring(class608.field8673.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8674.method3543(-24350, class45.field748))) {
                var3 = 7;
                arg0 = arg0.substring(class608.field8674.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8675.method3543(-24350, class45.field748))) {
                var3 = 8;
                arg0 = arg0.substring(class608.field8675.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8676.method3543(-24350, class45.field748))) {
                var3 = 9;
                arg0 = arg0.substring(class608.field8676.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8677.method3543(-24350, class45.field748))) {
                var3 = 10;
                arg0 = arg0.substring(class608.field8677.method3543(-24350, class45.field748).length());
            } else if (var2.startsWith(class608.field8678.method3543(-24350, class45.field748))) {
                var3 = 11;
                arg0 = arg0.substring(class608.field8678.method3543(-24350, class45.field748).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class608.field8679.method3543(-24350, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class608.field8679.method3543(-24350, 0).length());
        } else if (var4.startsWith(class608.field8680.method3543(-24350, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class608.field8680.method3543(-24350, 0).length());
        } else if (var4.startsWith(class608.field8681.method3543(-24350, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class608.field8681.method3543(-24350, 0).length());
        } else if (var4.startsWith(class608.field8682.method3543(-24350, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class608.field8682.method3543(-24350, 0).length());
        } else if (var4.startsWith(class608.field8683.method3543(-24350, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class608.field8683.method3543(-24350, 0).length());
        } else if (class45.field748 != 0) {
            if (var4.startsWith(class608.field8679.method3543(-24350, class45.field748))) {
                var5 = 1;
                arg0 = arg0.substring(class608.field8679.method3543(-24350, class45.field748).length());
            } else if (var4.startsWith(class608.field8680.method3543(-24350, class45.field748))) {
                var5 = 2;
                arg0 = arg0.substring(class608.field8680.method3543(-24350, class45.field748).length());
            } else if (var4.startsWith(class608.field8681.method3543(-24350, class45.field748))) {
                var5 = 3;
                arg0 = arg0.substring(class608.field8681.method3543(-24350, class45.field748).length());
            } else if (var4.startsWith(class608.field8682.method3543(-24350, class45.field748))) {
                var5 = 4;
                arg0 = arg0.substring(class608.field8682.method3543(-24350, class45.field748).length());
            } else if (var4.startsWith(class608.field8683.method3543(-24350, class45.field748))) {
                var5 = 5;
                arg0 = arg0.substring(class608.field8683.method3543(-24350, class45.field748).length());
            }
        }
        field7706++;
        class88 var6 = class448.method2741((byte) 32, class93.field1341, class583.field8319);
        var6.field1260.method2881(0, (byte) 110);
        int var7 = var6.field1260.field6864;
        var6.field1260.method2881(var3, (byte) 120);
        var6.field1260.method2881(var5, (byte) 113);
        class756.method4199(var6.field1260, arg0, -1);
        var6.field1260.method2879(var6.field1260.field6864 - var7, -1);
        class523.method3183(var6, (byte) 31);
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "(I)V")
    public static final void method3202(int arg0) {
        if (arg0 == -1 || !class416.method2507(arg0, -2113733296)) {
            return;
        }
        class146[] var1 = class600.field8524[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class146 var3 = var1[var2];
            if (var3.field2133 != null) {
                class362 var4 = new class362();
                var4.field5304 = var3;
                var4.field5297 = var3.field2133;
                method3200(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(IZ)V")
    private static final void method3203(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field7687 -= 3;
                int var2 = field7690[field7687];
                int var3 = field7690[field7687 + 1];
                int var4 = field7690[field7687 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class146 var5 = class250.method1689(var2, false);
                if (var5.field2019 == null) {
                    var5.field2019 = new class146[var4 + 1];
                }
                if (var5.field2019.length <= var4) {
                    class146[] var6 = new class146[var4 + 1];
                    for (int var7 = 0; var7 < var5.field2019.length; var7++) {
                        var6[var7] = var5.field2019[var7];
                    }
                    var5.field2019 = var6;
                }
                if (var4 > 0 && var5.field2019[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class146 var8 = new class146();
                var8.field2112 = var3;
                var8.field2109 = var8.field2079 = var5.field2079;
                var8.field2010 = var4;
                var5.field2019[var4] = var8;
                if (arg1) {
                    field7701 = var8;
                } else {
                    field7691 = var8;
                }
                class401.method2439(1723, var5);
                return;
            }
            if (arg0 == 101) {
                class146 var9 = arg1 ? field7701 : field7691;
                if (var9.field2010 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class146 var10 = class250.method1689(var9.field2079, false);
                var10.field2019[var9.field2010] = null;
                class401.method2439(1723, var10);
                return;
            }
            if (arg0 == 102) {
                class146 var11 = class250.method1689(field7690[--field7687], false);
                var11.field2019 = null;
                class401.method2439(1723, var11);
                return;
            }
            if (arg0 == 200) {
                field7687 -= 2;
                int var12 = field7690[field7687];
                int var13 = field7690[field7687 + 1];
                class146 var14 = class590.method3467(1, var12, var13);
                if (var14 != null && var13 != -1) {
                    field7690[field7687++] = 1;
                    if (arg1) {
                        field7701 = var14;
                        return;
                    }
                    field7691 = var14;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field7690[--field7687];
                class146 var16 = class250.method1689(var15, false);
                if (var16 != null) {
                    field7690[field7687++] = 1;
                    if (arg1) {
                        field7701 = var16;
                        return;
                    }
                    field7691 = var16;
                    return;
                }
                field7690[field7687++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field7690[--field7687];
                method3210(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field7690[--field7687];
                method3205(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field7687 -= 2;
                int var19 = field7690[field7687];
                int var20 = field7690[field7687 + 1];
                for (int var21 = 0; var21 < class77.field1116.length; var21++) {
                    if (class77.field1116[var21] == var19) {
                        class108.field1536.field9081.method926(var21, var20, Integer.MIN_VALUE, class434.field6215);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class715.field10091.length; var22++) {
                    if (class715.field10091[var22] == var19) {
                        class108.field1536.field9081.method926(var22, var20, Integer.MIN_VALUE, class434.field6215);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field7687 -= 2;
                int var23 = field7690[field7687];
                int var24 = field7690[field7687 + 1];
                class108.field1536.field9081.method936(0, var23, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field7690[--field7687] != 0;
                class108.field1536.field9081.method938(var25, (byte) 121);
                return;
            }
            if (arg0 == 411) {
                field7687 -= 2;
                int var26 = field7690[field7687];
                int var27 = field7690[field7687 + 1];
                class108.field1536.field9081.method929(110, var26, class425.field6147, var27);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class146 var28;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var28 = class250.method1689(field7690[--field7687], false);
            } else {
                var28 = arg1 ? field7701 : field7691;
            }
            if (arg0 == 1000) {
                field7687 -= 4;
                var28.field2026 = field7690[field7687];
                var28.field2014 = field7690[field7687 + 1];
                int var29 = field7690[field7687 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 5) {
                    var29 = 5;
                }
                int var30 = field7690[field7687 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 5) {
                    var30 = 5;
                }
                var28.field2092 = (byte) var29;
                var28.field2129 = (byte) var30;
                class401.method2439(1723, var28);
                class635.method3646(2, var28);
                if (var28.field2010 == -1) {
                    class4.method18(var28.field2079, (byte) 105);
                }
                return;
            }
            if (arg0 == 1001) {
                field7687 -= 4;
                var28.field2091 = field7690[field7687];
                var28.field2095 = field7690[field7687 + 1];
                var28.field2012 = 0;
                var28.field2046 = 0;
                int var31 = field7690[field7687 + 2];
                if (var31 < 0) {
                    var31 = 0;
                } else if (var31 > 4) {
                    var31 = 4;
                }
                int var32 = field7690[field7687 + 3];
                if (var32 < 0) {
                    var32 = 0;
                } else if (var32 > 4) {
                    var32 = 4;
                }
                var28.field2018 = (byte) var31;
                var28.field2078 = (byte) var32;
                class401.method2439(1723, var28);
                class635.method3646(2, var28);
                if (var28.field2112 == 0) {
                    class217.method1533(var28, false, -9543);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var33 = field7690[--field7687] == 1;
                if (var28.field2116 != var33) {
                    var28.field2116 = var33;
                    class401.method2439(1723, var28);
                }
                if (var28.field2010 == -1) {
                    class294.method1841((byte) 97, var28.field2079);
                }
                return;
            }
            if (arg0 == 1004) {
                field7687 -= 2;
                var28.field1975 = field7690[field7687];
                var28.field2059 = field7690[field7687 + 1];
                class401.method2439(1723, var28);
                class635.method3646(2, var28);
                if (var28.field2112 == 0) {
                    class217.method1533(var28, false, -9543);
                }
                return;
            }
            if (arg0 == 1005) {
                var28.field1987 = field7690[--field7687] == 1;
                return;
            }
        } else if (arg0 >= 1100 && arg0 < 1200 || arg0 >= 2100 && arg0 < 2200) {
            class146 var34;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var34 = class250.method1689(field7690[--field7687], false);
            } else {
                var34 = arg1 ? field7701 : field7691;
            }
            if (arg0 == 1100) {
                field7687 -= 2;
                var34.field1988 = field7690[field7687];
                if (var34.field1988 > var34.field2134 - var34.field2016) {
                    var34.field1988 = var34.field2134 - var34.field2016;
                }
                if (var34.field1988 < 0) {
                    var34.field1988 = 0;
                }
                var34.field1970 = field7690[field7687 + 1];
                if (var34.field1970 > var34.field1973 - var34.field1997) {
                    var34.field1970 = var34.field1973 - var34.field1997;
                }
                if (var34.field1970 < 0) {
                    var34.field1970 = 0;
                }
                class401.method2439(1723, var34);
                if (var34.field2010 == -1) {
                    class118.method831(var34.field2079, (byte) -110);
                }
                return;
            }
            if (arg0 == 1101) {
                var34.field2013 = field7690[--field7687];
                class401.method2439(1723, var34);
                if (var34.field2010 == -1) {
                    class279.method1792(var34.field2079, true);
                }
                return;
            }
            if (arg0 == 1102) {
                var34.field2004 = field7690[--field7687] == 1;
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1103) {
                var34.field2052 = field7690[--field7687];
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1104) {
                var34.field2113 = field7690[--field7687];
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1105) {
                int var35 = field7690[--field7687];
                if (var34.field2117 != var35) {
                    var34.field2117 = var35;
                    class401.method2439(1723, var34);
                }
                if (var34.field2010 == -1) {
                    class561.method3362(2628, var34.field2079);
                }
                return;
            }
            if (arg0 == 1106) {
                var34.field2060 = field7690[--field7687];
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1107) {
                var34.field2069 = field7690[--field7687] == 1;
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1108) {
                var34.field2015 = 1;
                var34.field2125 = field7690[--field7687];
                class401.method2439(1723, var34);
                if (var34.field2010 == -1) {
                    class166.method1186(var34.field2079, 4);
                }
                return;
            }
            if (arg0 == 1109) {
                field7687 -= 6;
                var34.field1995 = field7690[field7687];
                var34.field2066 = field7690[field7687 + 1];
                var34.field2132 = field7690[field7687 + 2];
                var34.field2083 = field7690[field7687 + 3];
                var34.field2038 = field7690[field7687 + 4];
                var34.field2105 = field7690[field7687 + 5];
                class401.method2439(1723, var34);
                if (var34.field2010 == -1) {
                    class50.method466(var34.field2079, 8);
                    class634.method3629(var34.field2079, 113);
                }
                return;
            }
            if (arg0 == 1110) {
                int var36 = field7690[--field7687];
                if (var34.field2062 != var36) {
                    var34.field2062 = var36;
                    var34.field1986 = 0;
                    var34.field2070 = 1;
                    var34.field2007 = 0;
                    class131 var37 = var34.field2062 == -1 ? null : class610.field8698.method2999(var34.field2062, false);
                    if (var37 != null) {
                        class348.method2217(256, var37, var34.field1986);
                    }
                    class401.method2439(1723, var34);
                }
                if (var34.field2010 == -1) {
                    class269.method1760(5, var34.field2079);
                }
                return;
            }
            if (arg0 == 1111) {
                var34.field2049 = field7690[--field7687] == 1;
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1112) {
                String var38 = field7703[--field7689];
                if (!var38.equals(var34.field2090)) {
                    var34.field2090 = var38;
                    class401.method2439(1723, var34);
                }
                if (var34.field2010 == -1) {
                    class308.method1923(var34.field2079, (byte) -32);
                }
                return;
            }
            if (arg0 == 1113) {
                var34.field2002 = field7690[--field7687];
                class401.method2439(1723, var34);
                if (var34.field2010 == -1) {
                    class294.method1842(-29, var34.field2079);
                }
                return;
            }
            if (arg0 == 1114) {
                field7687 -= 3;
                var34.field2039 = field7690[field7687];
                var34.field2136 = field7690[field7687 + 1];
                var34.field2099 = field7690[field7687 + 2];
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1115) {
                var34.field2050 = field7690[--field7687] == 1;
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1116) {
                var34.field2023 = field7690[--field7687];
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1117) {
                var34.field2053 = field7690[--field7687];
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1118) {
                var34.field2087 = field7690[--field7687] == 1;
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1119) {
                var34.field2009 = field7690[--field7687] == 1;
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1120) {
                field7687 -= 2;
                var34.field2134 = field7690[field7687];
                var34.field1973 = field7690[field7687 + 1];
                class401.method2439(1723, var34);
                if (var34.field2112 == 0) {
                    class217.method1533(var34, false, -9543);
                }
                return;
            }
            if (arg0 == 1122) {
                var34.field2031 = field7690[--field7687] == 1;
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1123) {
                var34.field2105 = field7690[--field7687];
                class401.method2439(1723, var34);
                if (var34.field2010 == -1) {
                    class50.method466(var34.field2079, 8);
                }
                return;
            }
            if (arg0 == 1124) {
                int var39 = field7690[--field7687];
                var34.field2096 = var39 == 1;
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1125) {
                field7687 -= 2;
                var34.field2084 = field7690[field7687];
                var34.field2138 = field7690[field7687 + 1];
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1126) {
                var34.field2071 = field7690[--field7687];
                class401.method2439(1723, var34);
                return;
            }
            if (arg0 == 1127) {
                field7687 -= 2;
                int var40 = field7690[field7687];
                int var41 = field7690[field7687 + 1];
                class167 var42 = class332.field4513.method1901(-4115, var40);
                if (var42.field2364 != var41) {
                    var34.method1031(var41, false, var40);
                    return;
                }
                var34.method1024(var40, 36);
                return;
            }
            if (arg0 == 1128) {
                int var43 = field7690[--field7687];
                String var44 = field7703[--field7689];
                class167 var45 = class332.field4513.method1901(-4115, var43);
                if (!var45.field2373.equals(var44)) {
                    var34.method1019(96, var44, var43);
                    return;
                }
                var34.method1024(var43, -128);
                return;
            }
            if (arg0 == 1129 || arg0 == 1130) {
                int var46 = field7690[--field7687];
                if (var34.field2112 != 5 && arg0 == 1129 || var34.field2112 != 4 && arg0 == 1130) {
                    return;
                }
                if (var34.field2124 != var46) {
                    var34.field2124 = var46;
                    class401.method2439(1723, var34);
                }
                if (var34.field2010 == -1) {
                    class356.method2267(var34.field2079, (byte) -118);
                }
                return;
            }
        } else if (!(arg0 < 1200 || arg0 >= 1300) || !(arg0 < 2200 || arg0 >= 2300)) {
            class146 var47;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var47 = class250.method1689(field7690[--field7687], false);
            } else {
                var47 = arg1 ? field7701 : field7691;
            }
            class401.method2439(1723, var47);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field7687 -= 2;
                int var48 = field7690[field7687];
                int var49 = field7690[field7687 + 1];
                if (var47.field2010 == -1) {
                    class522.method3175((byte) 102, var47.field2079);
                    class50.method466(var47.field2079, 8);
                    class634.method3629(var47.field2079, -118);
                }
                if (var48 == -1) {
                    var47.field2015 = 1;
                    var47.field2125 = -1;
                    var47.field2131 = -1;
                    return;
                }
                var47.field2131 = var48;
                var47.field2020 = var49;
                if (arg0 == 1208 || arg0 == 1209) {
                    var47.field2027 = true;
                } else {
                    var47.field2027 = false;
                }
                class424 var50 = class425.field6147.method4144(var48, 126);
                var47.field2132 = var50.field6063;
                var47.field2083 = var50.field6128;
                var47.field2038 = var50.field6067;
                var47.field1995 = var50.field6119;
                var47.field2066 = var50.field6073;
                var47.field2105 = var50.field6106;
                if (arg0 == 1205 || arg0 == 1209) {
                    var47.field2098 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var47.field2098 = 1;
                } else {
                    var47.field2098 = 2;
                }
                if (var47.field2012 > 0) {
                    var47.field2105 = var47.field2105 * 32 / var47.field2012;
                    return;
                }
                if (var47.field2091 > 0) {
                    var47.field2105 = var47.field2105 * 32 / var47.field2091;
                }
                return;
            }
            if (arg0 == 1201) {
                var47.field2015 = 2;
                var47.field2125 = field7690[--field7687];
                if (var47.field2010 == -1) {
                    class166.method1186(var47.field2079, 4);
                }
                return;
            }
            if (arg0 == 1202) {
                var47.field2015 = 3;
                var47.field2125 = -1;
                if (var47.field2010 == -1) {
                    class166.method1186(var47.field2079, 4);
                }
                return;
            }
            if (arg0 == 1203) {
                var47.field2015 = 6;
                var47.field2125 = field7690[--field7687];
                if (var47.field2010 == -1) {
                    class166.method1186(var47.field2079, 4);
                }
                return;
            }
            if (arg0 == 1204) {
                var47.field2015 = 5;
                var47.field2125 = field7690[--field7687];
                if (var47.field2010 == -1) {
                    class166.method1186(var47.field2079, 4);
                }
                return;
            }
            if (arg0 == 1206) {
                field7687 -= 4;
                var47.field2057 = field7690[field7687];
                var47.field2068 = field7690[field7687 + 1];
                var47.field2093 = field7690[field7687 + 2];
                var47.field2029 = field7690[field7687 + 3];
                class401.method2439(1723, var47);
                return;
            }
            if (arg0 == 1207) {
                field7687 -= 2;
                var47.field2017 = field7690[field7687];
                var47.field2008 = field7690[field7687 + 1];
                class401.method2439(1723, var47);
                return;
            }
            if (arg0 == 1210) {
                field7687 -= 4;
                var47.field2125 = field7690[field7687];
                var47.field2000 = field7690[field7687 + 1];
                if (field7690[field7687 + 2] == 1) {
                    var47.field2015 = 9;
                } else {
                    var47.field2015 = 8;
                }
                if (field7690[field7687 + 3] == 1) {
                    var47.field2027 = true;
                } else {
                    var47.field2027 = false;
                }
                if (var47.field2010 == -1) {
                    class166.method1186(var47.field2079, 4);
                }
                return;
            }
            if (arg0 == 1211) {
                var47.field2015 = 5;
                var47.field2125 = class652.field9348;
                var47.field2000 = 0;
                if (var47.field2010 == -1) {
                    class166.method1186(var47.field2079, 4);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class146 var62;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var62 = class250.method1689(field7690[--field7687], false);
                } else {
                    var62 = arg1 ? field7701 : field7691;
                }
                if (arg0 == 1499) {
                    var62.method1022(-1);
                    return;
                }
                String var63 = field7703[--field7689];
                int[] var64 = null;
                if (var63.length() > 0 && var63.charAt(var63.length() - 1) == 'Y') {
                    int var65 = field7690[--field7687];
                    if (var65 > 0) {
                        var64 = new int[var65];
                        while (var65-- > 0) {
                            var64[var65] = field7690[--field7687];
                        }
                    }
                    var63 = var63.substring(0, var63.length() - 1);
                }
                Object[] var66 = new Object[var63.length() + 1];
                for (int var67 = var66.length - 1; var67 >= 1; var67--) {
                    if (var63.charAt(var67 - 1) == 's') {
                        var66[var67] = field7703[--field7689];
                    } else {
                        var66[var67] = Integer.valueOf(field7690[--field7687]);
                    }
                }
                int var68 = field7690[--field7687];
                if (var68 == -1) {
                    var66 = null;
                } else {
                    var66[0] = Integer.valueOf(var68);
                }
                if (arg0 == 1400) {
                    var62.field2006 = var66;
                } else if (arg0 == 1401) {
                    var62.field2085 = var66;
                } else if (arg0 == 1402) {
                    var62.field2065 = var66;
                } else if (arg0 == 1403) {
                    var62.field2022 = var66;
                } else if (arg0 == 1404) {
                    var62.field1985 = var66;
                } else if (arg0 == 1405) {
                    var62.field2033 = var66;
                } else if (arg0 == 1406) {
                    var62.field2075 = var66;
                } else if (arg0 == 1407) {
                    var62.field2035 = var66;
                    var62.field2028 = var64;
                } else if (arg0 == 1408) {
                    var62.field2044 = var66;
                } else if (arg0 == 1409) {
                    var62.field2086 = var66;
                } else if (arg0 == 1410) {
                    var62.field1993 = var66;
                } else if (arg0 == 1411) {
                    var62.field2043 = var66;
                } else if (arg0 == 1412) {
                    var62.field2063 = var66;
                } else if (arg0 == 1414) {
                    var62.field2135 = var66;
                    var62.field2104 = var64;
                } else if (arg0 == 1415) {
                    var62.field2121 = var66;
                    var62.field1999 = var64;
                } else if (arg0 == 1416) {
                    var62.field2064 = var66;
                } else if (arg0 == 1417) {
                    var62.field1972 = var66;
                } else if (arg0 == 1418) {
                    var62.field1998 = var66;
                } else if (arg0 == 1419) {
                    var62.field1977 = var66;
                } else if (arg0 == 1420) {
                    var62.field2040 = var66;
                } else if (arg0 == 1421) {
                    var62.field2114 = var66;
                } else if (arg0 == 1422) {
                    var62.field2048 = var66;
                } else if (arg0 == 1423) {
                    var62.field1976 = var66;
                } else if (arg0 == 1424) {
                    var62.field1971 = var66;
                } else if (arg0 == 1425) {
                    var62.field2032 = var66;
                } else if (arg0 == 1426) {
                    var62.field2110 = var66;
                } else if (arg0 == 1427) {
                    var62.field2051 = var66;
                } else if (arg0 == 1428) {
                    var62.field2003 = var66;
                    var62.field2127 = var64;
                } else if (arg0 == 1429) {
                    var62.field2005 = var66;
                    var62.field2058 = var64;
                } else if (arg0 == 1430) {
                    var62.field1984 = var66;
                }
                var62.field1983 = true;
                return;
            }
            if (arg0 < 1600) {
                class146 var69 = arg1 ? field7701 : field7691;
                if (arg0 == 1500) {
                    field7690[field7687++] = var69.field2103;
                    return;
                }
                if (arg0 == 1501) {
                    field7690[field7687++] = var69.field1992;
                    return;
                }
                if (arg0 == 1502) {
                    field7690[field7687++] = var69.field2016;
                    return;
                }
                if (arg0 == 1503) {
                    field7690[field7687++] = var69.field1997;
                    return;
                }
                if (arg0 == 1504) {
                    field7690[field7687++] = var69.field2116 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field7690[field7687++] = var69.field2109;
                    return;
                }
                if (arg0 == 1506) {
                    class146 var70 = class743.method4139(var69, (byte) 126);
                    field7690[field7687++] = var70 == null ? -1 : var70.field2079;
                    return;
                }
            } else if (arg0 < 1700) {
                class146 var71 = arg1 ? field7701 : field7691;
                if (arg0 == 1600) {
                    field7690[field7687++] = var71.field1988;
                    return;
                }
                if (arg0 == 1601) {
                    field7690[field7687++] = var71.field1970;
                    return;
                }
                if (arg0 == 1602) {
                    field7703[field7689++] = var71.field2090;
                    return;
                }
                if (arg0 == 1603) {
                    field7690[field7687++] = var71.field2134;
                    return;
                }
                if (arg0 == 1604) {
                    field7690[field7687++] = var71.field1973;
                    return;
                }
                if (arg0 == 1605) {
                    field7690[field7687++] = var71.field2105;
                    return;
                }
                if (arg0 == 1606) {
                    field7690[field7687++] = var71.field2132;
                    return;
                }
                if (arg0 == 1607) {
                    field7690[field7687++] = var71.field2038;
                    return;
                }
                if (arg0 == 1608) {
                    field7690[field7687++] = var71.field2083;
                    return;
                }
                if (arg0 == 1609) {
                    field7690[field7687++] = var71.field2052;
                    return;
                }
                if (arg0 == 1610) {
                    field7690[field7687++] = var71.field1995;
                    return;
                }
                if (arg0 == 1611) {
                    field7690[field7687++] = var71.field2066;
                    return;
                }
                if (arg0 == 1612) {
                    field7690[field7687++] = var71.field2117;
                    return;
                }
                if (arg0 == 1613) {
                    int var72 = field7690[--field7687];
                    class167 var73 = class332.field4513.method1901(-4115, var72);
                    if (var73.method1195(-116)) {
                        field7703[field7689++] = var71.method1032(var72, var73.field2373, true);
                        return;
                    }
                    field7690[field7687++] = var71.method1033(true, var72, var73.field2364);
                    return;
                }
                if (arg0 == 1614) {
                    field7690[field7687++] = var71.field2060;
                    return;
                }
                if (arg0 == 2614) {
                    field7690[field7687++] = var71.field2015 == 1 ? var71.field2125 : -1;
                    return;
                }
            } else if (arg0 < 1800) {
                class146 var74 = arg1 ? field7701 : field7691;
                if (arg0 == 1700) {
                    field7690[field7687++] = var74.field2131;
                    return;
                }
                if (arg0 == 1701) {
                    if (var74.field2131 != -1) {
                        field7690[field7687++] = var74.field2020;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field7690[field7687++] = var74.field2010;
                    return;
                }
            } else if (arg0 < 1900) {
                class146 var75 = arg1 ? field7701 : field7691;
                if (arg0 == 1800) {
                    field7690[field7687++] = client.method2732(var75).method2860(false);
                    return;
                }
                if (arg0 == 1801) {
                    int var76 = field7690[--field7687];
                    int var357 = var76 - 1;
                    if (var75.field2100 != null && var357 < var75.field2100.length && var75.field2100[var357] != null) {
                        field7703[field7689++] = var75.field2100[var357];
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var75.field2024 == null) {
                        field7703[field7689++] = "";
                        return;
                    }
                    field7703[field7689++] = var75.field2024;
                    return;
                }
            } else if (arg0 < 2000 || arg0 >= 2900 && arg0 < 3000) {
                class146 var355;
                if (arg0 >= 2000) {
                    var355 = class250.method1689(field7690[--field7687], false);
                    arg0 -= 1000;
                } else {
                    var355 = arg1 ? field7701 : field7691;
                }
                if (field7714 >= 10) {
                    throw new RuntimeException("C29xx-1");
                }
                if (arg0 == 1927) {
                    if (var355.field2051 == null) {
                        return;
                    }
                    class362 var356 = new class362();
                    var356.field5304 = var355;
                    var356.field5297 = var355.field2051;
                    var356.field5294 = field7714 + 1;
                    class441.field6290.method3559(var356, (byte) 12);
                    return;
                }
            } else if (arg0 < 2600) {
                class146 var77 = class250.method1689(field7690[--field7687], false);
                if (arg0 == 2500) {
                    field7690[field7687++] = var77.field2103;
                    return;
                }
                if (arg0 == 2501) {
                    field7690[field7687++] = var77.field1992;
                    return;
                }
                if (arg0 == 2502) {
                    field7690[field7687++] = var77.field2016;
                    return;
                }
                if (arg0 == 2503) {
                    field7690[field7687++] = var77.field1997;
                    return;
                }
                if (arg0 == 2504) {
                    field7690[field7687++] = var77.field2116 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field7690[field7687++] = var77.field2109;
                    return;
                }
                if (arg0 == 1506) {
                    class146 var78 = class743.method4139(var77, (byte) 126);
                    field7690[field7687++] = var78 == null ? -1 : var78.field2079;
                    return;
                }
            } else if (arg0 < 2700) {
                class146 var79 = class250.method1689(field7690[--field7687], false);
                if (arg0 == 2600) {
                    field7690[field7687++] = var79.field1988;
                    return;
                }
                if (arg0 == 2601) {
                    field7690[field7687++] = var79.field1970;
                    return;
                }
                if (arg0 == 2602) {
                    field7703[field7689++] = var79.field2090;
                    return;
                }
                if (arg0 == 2603) {
                    field7690[field7687++] = var79.field2134;
                    return;
                }
                if (arg0 == 2604) {
                    field7690[field7687++] = var79.field1973;
                    return;
                }
                if (arg0 == 2605) {
                    field7690[field7687++] = var79.field2105;
                    return;
                }
                if (arg0 == 2606) {
                    field7690[field7687++] = var79.field2132;
                    return;
                }
                if (arg0 == 2607) {
                    field7690[field7687++] = var79.field2038;
                    return;
                }
                if (arg0 == 2608) {
                    field7690[field7687++] = var79.field2083;
                    return;
                }
                if (arg0 == 2609) {
                    field7690[field7687++] = var79.field2052;
                    return;
                }
                if (arg0 == 2610) {
                    field7690[field7687++] = var79.field1995;
                    return;
                }
                if (arg0 == 2611) {
                    field7690[field7687++] = var79.field2066;
                    return;
                }
                if (arg0 == 2612) {
                    field7690[field7687++] = var79.field2117;
                    return;
                }
                if (arg0 == 2613) {
                    field7690[field7687++] = var79.field2060;
                    return;
                }
                if (arg0 == 2614) {
                    field7690[field7687++] = var79.field2015 == 1 ? var79.field2125 : -1;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class146 var80 = class250.method1689(field7690[--field7687], false);
                    field7690[field7687++] = var80.field2131;
                    return;
                }
                if (arg0 == 2701) {
                    class146 var81 = class250.method1689(field7690[--field7687], false);
                    if (var81.field2131 != -1) {
                        field7690[field7687++] = var81.field2020;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var82 = field7690[--field7687];
                    class182 var83 = (class182) class591.field8410.method4020((long) var82, (byte) -59);
                    if (var83 != null) {
                        field7690[field7687++] = 1;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class146 var84 = class250.method1689(field7690[--field7687], false);
                    if (var84.field2019 == null) {
                        field7690[field7687++] = 0;
                        return;
                    }
                    int var85 = var84.field2019.length;
                    for (int var86 = 0; var86 < var84.field2019.length; var86++) {
                        if (var84.field2019[var86] == null) {
                            var85 = var86;
                            break;
                        }
                    }
                    field7690[field7687++] = var85;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field7687 -= 2;
                    int var87 = field7690[field7687];
                    int var88 = field7690[field7687 + 1];
                    class182 var89 = (class182) class591.field8410.method4020((long) var87, (byte) -101);
                    if (var89 != null && var89.field2505 == var88) {
                        field7690[field7687++] = 1;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class146 var90 = class250.method1689(field7690[--field7687], false);
                if (arg0 == 2800) {
                    field7690[field7687++] = client.method2732(var90).method2860(false);
                    return;
                }
                if (arg0 == 2801) {
                    int var91 = field7690[--field7687];
                    int var358 = var91 - 1;
                    if (var90.field2100 != null && var358 < var90.field2100.length && var90.field2100[var358] != null) {
                        field7703[field7689++] = var90.field2100[var358];
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var90.field2024 == null) {
                        field7703[field7689++] = "";
                        return;
                    }
                    field7703[field7689++] = var90.field2024;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var92 = field7703[--field7689];
                    class112.method813(var92, 13172);
                    return;
                }
                if (arg0 == 3101) {
                    field7687 -= 2;
                    class696.method3919((byte) -83, class108.field1536, field7690[field7687 + 1], field7690[field7687]);
                    return;
                }
                if (arg0 == 3103) {
                    class196.method1383(true, (byte) 124);
                    return;
                }
                if (arg0 == 3104) {
                    String var93 = field7703[--field7689];
                    int var94 = 0;
                    if (class355.method2259(var93, (byte) 112)) {
                        var94 = class321.method1993(var93, (byte) 86);
                    }
                    field7707++;
                    class88 var95 = class448.method2741((byte) 63, class417.field5970, class583.field8319);
                    var95.field1260.method2926((byte) -120, var94);
                    class523.method3183(var95, (byte) 31);
                    return;
                }
                if (arg0 == 3105) {
                    String var96 = field7703[--field7689];
                    field7686++;
                    class88 var97 = class448.method2741((byte) 105, class92.field1324, class583.field8319);
                    var97.field1260.method2881(var96.length() + 1, (byte) 116);
                    var97.field1260.method2902(var96, false);
                    class523.method3183(var97, (byte) 31);
                    return;
                }
                if (arg0 == 3106) {
                    String var98 = field7703[--field7689];
                    field7695++;
                    class88 var99 = class448.method2741((byte) 56, class571.field8226, class583.field8319);
                    var99.field1260.method2881(var98.length() + 1, (byte) 121);
                    var99.field1260.method2902(var98, false);
                    class523.method3183(var99, (byte) 31);
                    return;
                }
                if (arg0 == 3107) {
                    int var100 = field7690[--field7687];
                    String var101 = field7703[--field7689];
                    class731.method4070(var100, false, var101);
                    return;
                }
                if (arg0 == 3108) {
                    field7687 -= 3;
                    int var102 = field7690[field7687];
                    int var103 = field7690[field7687 + 1];
                    int var104 = field7690[field7687 + 2];
                    class146 var105 = class250.method1689(var104, false);
                    class26.method110(var105, (byte) 116, var103, var102);
                    return;
                }
                if (arg0 == 3109) {
                    field7687 -= 2;
                    int var106 = field7690[field7687];
                    int var107 = field7690[field7687 + 1];
                    class146 var108 = arg1 ? field7701 : field7691;
                    class26.method110(var108, (byte) 116, var107, var106);
                    return;
                }
                if (arg0 == 3110) {
                    int var109 = field7690[--field7687];
                    field7709++;
                    class88 var110 = class448.method2741((byte) 118, class449.field6429, class583.field8319);
                    var110.field1260.method2862(var109, -1166933656);
                    class523.method3183(var110, (byte) 31);
                    return;
                }
                if (arg0 == 3111) {
                    field7687 -= 2;
                    int var111 = field7690[field7687];
                    int var112 = field7690[field7687 + 1];
                    class182 var113 = (class182) class591.field8410.method4020((long) var111, (byte) -80);
                    if (var113 != null) {
                        class417.method2517(0, var113.field2505 != var112, true, var113);
                    }
                    class482.method2946(var111, var112, true, 3, (byte) -127);
                    return;
                }
                if (arg0 == 3112) {
                    field7687--;
                    int var114 = field7690[field7687];
                    class182 var115 = (class182) class591.field8410.method4020((long) var114, (byte) -91);
                    if (var115 != null && var115.field2507 == 3) {
                        class417.method2517(0, true, true, var115);
                    }
                    return;
                }
                if (arg0 == 3113) {
                    class275.method1777(field7703[--field7689], (byte) 0);
                    return;
                }
                if (arg0 == 3114) {
                    field7687 -= 2;
                    int var116 = field7690[field7687];
                    int var117 = field7690[field7687 + 1];
                    String var118 = field7703[--field7689];
                    class145.method1013(var118, (byte) 124, "", var116, var117, "", "");
                    return;
                }
                if (arg0 == 3115) {
                    field7687 -= 11;
                    class14[] var119 = class176.method1266(24);
                    class141[] var120 = class501.method3050(true);
                    class507.method3091(-65536, field7690[field7687 + 8], field7690[field7687 + 6], field7690[field7687 + 5], var119[field7690[field7687]], field7690[field7687 + 3], field7690[field7687 + 9], field7690[field7687 + 10], field7690[field7687 + 2], field7690[field7687 + 7], field7690[field7687 + 4], var120[field7690[field7687 + 1]]);
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field7687 -= 3;
                    class298.method1856(field7690[field7687], field7690[field7687 + 2], 256, 255, field7690[field7687 + 1], 50);
                    return;
                }
                if (arg0 == 3201) {
                    class299.method1863(-120, 255, 50, field7690[--field7687]);
                    return;
                }
                if (arg0 == 3202) {
                    field7687 -= 2;
                    class584.method3441(field7690[field7687], (byte) -120, 255, field7690[field7687 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field7687 -= 4;
                    class298.method1856(field7690[field7687], field7690[field7687 + 2], 256, field7690[field7687 + 3], field7690[field7687 + 1], 50);
                    return;
                }
                if (arg0 == 3204) {
                    field7687 -= 3;
                    class299.method1863(-122, field7690[field7687 + 1], field7690[field7687 + 2], field7690[field7687]);
                    return;
                }
                if (arg0 == 3205) {
                    field7687 -= 3;
                    class584.method3441(field7690[field7687], (byte) -120, field7690[field7687 + 2], field7690[field7687 + 1]);
                    return;
                }
                if (arg0 == 3206) {
                    field7687 -= 4;
                    class588.method3458(field7690[field7687 + 1], field7690[field7687], field7690[field7687 + 2], false, 256, (byte) -64, field7690[field7687 + 3]);
                    return;
                }
                if (arg0 == 3207) {
                    field7687 -= 4;
                    class588.method3458(field7690[field7687 + 1], field7690[field7687], field7690[field7687 + 2], true, 256, (byte) -64, field7690[field7687 + 3]);
                    return;
                }
                if (arg0 == 3208) {
                    field7687 -= 5;
                    class298.method1856(field7690[field7687], field7690[field7687 + 2], field7690[field7687 + 4], field7690[field7687 + 3], field7690[field7687 + 1], 50);
                    return;
                }
                if (arg0 == 3209) {
                    field7687 -= 5;
                    class588.method3458(field7690[field7687 + 1], field7690[field7687], field7690[field7687 + 2], false, field7690[field7687 + 4], (byte) -64, field7690[field7687 + 3]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field7690[field7687++] = class703.field9918;
                    return;
                }
                if (arg0 == 3301) {
                    field7687 -= 2;
                    int var121 = field7690[field7687];
                    int var122 = field7690[field7687 + 1];
                    field7690[field7687++] = class537.method3246(var121, false, (byte) -74, var122);
                    return;
                }
                if (arg0 == 3302) {
                    field7687 -= 2;
                    int var123 = field7690[field7687];
                    int var124 = field7690[field7687 + 1];
                    field7690[field7687++] = class572.method3403(false, var124, 0, var123);
                    return;
                }
                if (arg0 == 3303) {
                    field7687 -= 2;
                    int var125 = field7690[field7687];
                    int var126 = field7690[field7687 + 1];
                    field7690[field7687++] = class709.method3967(9303, var126, false, var125);
                    return;
                }
                if (arg0 == 3304) {
                    int var127 = field7690[--field7687];
                    field7690[field7687++] = class601.field8535.method2413(var127, 5).field2252;
                    return;
                }
                if (arg0 == 3305) {
                    int var128 = field7690[--field7687];
                    field7690[field7687++] = class678.field9624[var128];
                    return;
                }
                if (arg0 == 3306) {
                    int var129 = field7690[--field7687];
                    field7690[field7687++] = class355.field5247[var129];
                    return;
                }
                if (arg0 == 3307) {
                    int var130 = field7690[--field7687];
                    field7690[field7687++] = class333.field4516[var130];
                    return;
                }
                if (arg0 == 3308) {
                    byte var131 = class108.field1536.field3920;
                    int var132 = (class108.field1536.field3923 >> 9) + class41.field693;
                    int var133 = (class108.field1536.field3916 >> 9) + class71.field1085;
                    field7690[field7687++] = (var131 << 28) + (var132 << 14) + var133;
                    return;
                }
                if (arg0 == 3309) {
                    int var134 = field7690[--field7687];
                    field7690[field7687++] = var134 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var135 = field7690[--field7687];
                    field7690[field7687++] = var135 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var136 = field7690[--field7687];
                    field7690[field7687++] = var136 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field7690[field7687++] = class502.field7304 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field7687 -= 2;
                    int var137 = field7690[field7687];
                    int var138 = field7690[field7687 + 1];
                    field7690[field7687++] = class537.method3246(var137, true, (byte) -74, var138);
                    return;
                }
                if (arg0 == 3314) {
                    field7687 -= 2;
                    int var139 = field7690[field7687];
                    int var140 = field7690[field7687 + 1];
                    field7690[field7687++] = class572.method3403(true, var140, 0, var139);
                    return;
                }
                if (arg0 == 3315) {
                    field7687 -= 2;
                    int var141 = field7690[field7687];
                    int var142 = field7690[field7687 + 1];
                    field7690[field7687++] = class709.method3967(9303, var142, true, var141);
                    return;
                }
                if (arg0 == 3316) {
                    if (class598.field8507 >= 2) {
                        field7690[field7687++] = class598.field8507;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field7690[field7687++] = class326.field4421;
                    return;
                }
                if (arg0 == 3318) {
                    field7690[field7687++] = class214.field3215.field7472;
                    return;
                }
                if (arg0 == 3321) {
                    field7690[field7687++] = class311.field4225;
                    return;
                }
                if (arg0 == 3322) {
                    field7690[field7687++] = class603.field8552;
                    return;
                }
                if (arg0 == 3323) {
                    if (class25.field224 >= 5 && class25.field224 <= 9) {
                        field7690[field7687++] = 1;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class25.field224 >= 5 && class25.field224 <= 9) {
                        field7690[field7687++] = class25.field224;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field7690[field7687++] = class297.field4063 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field7690[field7687++] = class108.field1536.field9069;
                    return;
                }
                if (arg0 == 3327) {
                    field7690[field7687++] = class108.field1536.field9081.field1829 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field7690[field7687++] = class748.field10423 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var143 = field7690[--field7687];
                    field7690[field7687++] = class618.method3587((byte) -105, false, var143);
                    return;
                }
                if (arg0 == 3331) {
                    field7687 -= 2;
                    int var144 = field7690[field7687];
                    int var145 = field7690[field7687 + 1];
                    field7690[field7687++] = class585.method3448(var144, false, false, 0, var145);
                    return;
                }
                if (arg0 == 3332) {
                    field7687 -= 2;
                    int var146 = field7690[field7687];
                    int var147 = field7690[field7687 + 1];
                    field7690[field7687++] = class585.method3448(var146, true, false, 0, var147);
                    return;
                }
                if (arg0 == 3333) {
                    field7690[field7687++] = class544.field7903;
                    return;
                }
                if (arg0 == 3335) {
                    field7690[field7687++] = class45.field748;
                    return;
                }
                if (arg0 == 3336) {
                    field7687 -= 4;
                    int var148 = field7690[field7687];
                    int var149 = field7690[field7687 + 1];
                    int var150 = field7690[field7687 + 2];
                    int var151 = field7690[field7687 + 3];
                    int var152 = (var149 << 14) + var148;
                    int var153 = (var150 << 28) + var152;
                    int var154 = var151 + var153;
                    field7690[field7687++] = var154;
                    return;
                }
                if (arg0 == 3337) {
                    field7690[field7687++] = class50.field813;
                    return;
                }
                if (arg0 == 3338) {
                    field7690[field7687++] = class350.method2239(100);
                    return;
                }
                if (arg0 == 3339) {
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3340) {
                    field7690[field7687++] = class240.field3557 ? 1 : 0;
                    return;
                }
                if (arg0 == 3341) {
                    field7690[field7687++] = class355.field5245 ? 1 : 0;
                    return;
                }
                if (arg0 == 3342) {
                    field7690[field7687++] = class535.field7789.method2459(-32213);
                    return;
                }
                if (arg0 == 3343) {
                    field7690[field7687++] = class535.field7789.method2452(-107);
                    return;
                }
                if (arg0 == 3344) {
                    field7703[field7689++] = class262.method1738(21578);
                    return;
                }
                if (arg0 == 3345) {
                    field7703[field7689++] = class444.method2716(false);
                    return;
                }
                if (arg0 == 3346) {
                    field7690[field7687++] = class507.method3090(1);
                    return;
                }
                if (arg0 == 3347) {
                    field7690[field7687++] = class112.field1585;
                    return;
                }
                if (arg0 == 3349) {
                    field7690[field7687++] = class108.field1536.field4598.method2110(true) >> 3;
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field7687 -= 2;
                    int var155 = field7690[field7687];
                    int var156 = field7690[field7687 + 1];
                    class547 var157 = class241.field3567.method1209(var155, 969);
                    field7703[field7689++] = var157.method3289(var156, (byte) -118);
                    return;
                }
                if (arg0 == 3408) {
                    field7687 -= 4;
                    int var158 = field7690[field7687];
                    int var159 = field7690[field7687 + 1];
                    int var160 = field7690[field7687 + 2];
                    int var161 = field7690[field7687 + 3];
                    class547 var162 = class241.field3567.method1209(var160, 969);
                    if (var162.field7950 == var158 && var162.field7947 == var159) {
                        if (var159 == 115) {
                            field7703[field7689++] = var162.method3289(var161, (byte) -128);
                            return;
                        }
                        field7690[field7687++] = var162.method3288(false, var161);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field7687 -= 3;
                    int var163 = field7690[field7687];
                    int var164 = field7690[field7687 + 1];
                    int var165 = field7690[field7687 + 2];
                    if (var164 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class547 var166 = class241.field3567.method1209(var164, 969);
                    if (var166.field7947 != var163) {
                        throw new RuntimeException("C3409-1");
                    }
                    field7690[field7687++] = var166.method3293(var165, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var167 = field7690[--field7687];
                    String var168 = field7703[--field7689];
                    if (var167 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class547 var169 = class241.field3567.method1209(var167, 969);
                    if (var169.field7947 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field7690[field7687++] = var169.method3285((byte) -66, var168) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var170 = field7690[--field7687];
                    class547 var171 = class241.field3567.method1209(var170, 969);
                    field7690[field7687++] = var171.field7944.method4019(7);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class634.field8940 == 0) {
                        field7690[field7687++] = -2;
                        return;
                    }
                    if (class634.field8940 == 1) {
                        field7690[field7687++] = -1;
                        return;
                    }
                    field7690[field7687++] = class386.field5583;
                    return;
                }
                if (arg0 == 3601) {
                    int var172 = field7690[--field7687];
                    if (class634.field8940 == 2 && var172 < class386.field5583) {
                        field7703[field7689++] = class196.field2860[var172];
                        if (class519.field7483[var172] != null) {
                            field7703[field7689++] = class519.field7483[var172];
                            return;
                        }
                        field7703[field7689++] = "";
                        return;
                    }
                    field7703[field7689++] = "";
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var173 = field7690[--field7687];
                    if (class634.field8940 == 2 && var173 < class386.field5583) {
                        field7690[field7687++] = class329.field4455[var173];
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var174 = field7690[--field7687];
                    if (class634.field8940 == 2 && var174 < class386.field5583) {
                        field7690[field7687++] = class381.field5521[var174];
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var175 = field7703[--field7689];
                    int var176 = field7690[--field7687];
                    class556.method3338((byte) 20, var175, var176);
                    return;
                }
                if (arg0 == 3605) {
                    String var177 = field7703[--field7689];
                    class127.method897(var177, (byte) 110);
                    return;
                }
                if (arg0 == 3606) {
                    String var178 = field7703[--field7689];
                    class511.method3109((byte) 87, var178);
                    return;
                }
                if (arg0 == 3607) {
                    String var179 = field7703[--field7689];
                    class513.method3117(4, var179, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var180 = field7703[--field7689];
                    class546.method3283(true, var180);
                    return;
                }
                if (arg0 == 3609) {
                    String var181 = field7703[--field7689];
                    if (var181.startsWith("<img=0>") || var181.startsWith("<img=1>")) {
                        var181 = var181.substring(7);
                    }
                    field7690[field7687++] = class507.method3094(var181, 0) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var182 = field7690[--field7687];
                    if (class634.field8940 == 2 && var182 < class386.field5583) {
                        field7703[field7689++] = class519.field7487[var182];
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class528.field7684 != null) {
                        field7703[field7689++] = class35.method183(true, class528.field7684);
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class528.field7684 != null) {
                        field7690[field7687++] = class38.field495;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var183 = field7690[--field7687];
                    if (class528.field7684 != null && var183 < class38.field495) {
                        field7703[field7689++] = class295.field4048[var183].field8813;
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var184 = field7690[--field7687];
                    if (class528.field7684 != null && var184 < class38.field495) {
                        field7690[field7687++] = class295.field4048[var184].field8811;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var185 = field7690[--field7687];
                    if (class528.field7684 != null && var185 < class38.field495) {
                        field7690[field7687++] = class295.field4048[var185].field8810;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field7690[field7687++] = class56.field961;
                    return;
                }
                if (arg0 == 3617) {
                    String var186 = field7703[--field7689];
                    class339.method2085(var186, -1);
                    return;
                }
                if (arg0 == 3618) {
                    field7690[field7687++] = class136.field1867;
                    return;
                }
                if (arg0 == 3619) {
                    String var187 = field7703[--field7689];
                    class401.method2441(var187, -74);
                    return;
                }
                if (arg0 == 3620) {
                    class348.method2205((byte) -111);
                    return;
                }
                if (arg0 == 3621) {
                    if (class634.field8940 == 0) {
                        field7690[field7687++] = -1;
                        return;
                    }
                    field7690[field7687++] = class365.field5352;
                    return;
                }
                if (arg0 == 3622) {
                    int var188 = field7690[--field7687];
                    if (class634.field8940 != 0 && var188 < class365.field5352) {
                        field7703[field7689++] = class716.field10113[var188];
                        if (class751.field10462[var188] != null) {
                            field7703[field7689++] = class751.field10462[var188];
                            return;
                        }
                        field7703[field7689++] = "";
                        return;
                    }
                    field7703[field7689++] = "";
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var189 = field7703[--field7689];
                    if (var189.startsWith("<img=0>") || var189.startsWith("<img=1>")) {
                        var189 = var189.substring(7);
                    }
                    field7690[field7687++] = class188.method1327(var189, false) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var190 = field7690[--field7687];
                    if (class295.field4048 != null && var190 < class38.field495 && class295.field4048[var190].field8809.equalsIgnoreCase(class108.field1536.field9056)) {
                        field7690[field7687++] = 1;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class386.field5584 != null) {
                        field7703[field7689++] = class386.field5584;
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var191 = field7690[--field7687];
                    if (class528.field7684 != null && var191 < class38.field495) {
                        field7703[field7689++] = class295.field4048[var191].field8817;
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var192 = field7690[--field7687];
                    if (class634.field8940 == 2 && var192 >= 0 && var192 < class386.field5583) {
                        field7690[field7687++] = class343.field4711[var192] ? 1 : 0;
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var193 = field7703[--field7689];
                    if (var193.startsWith("<img=0>") || var193.startsWith("<img=1>")) {
                        var193 = var193.substring(7);
                    }
                    field7690[field7687++] = class443.method2706(var193, true);
                    return;
                }
                if (arg0 == 3629) {
                    field7690[field7687++] = class360.field5276;
                    return;
                }
                if (arg0 == 3630) {
                    String var194 = field7703[--field7689];
                    class513.method3117(4, var194, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var195 = field7690[--field7687];
                    field7690[field7687++] = class363.field5308[var195] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var196 = field7690[--field7687];
                    if (class528.field7684 != null && var196 < class38.field495) {
                        field7703[field7689++] = class295.field4048[var196].field8809;
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var197 = field7690[--field7687];
                    if (class634.field8940 != 0 && var197 < class365.field5352) {
                        field7703[field7689++] = class11.field101[var197];
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var198 = field7690[--field7687];
                    field7690[field7687++] = class83.field1220[var198].method3087((byte) 95);
                    return;
                }
                if (arg0 == 3904) {
                    int var199 = field7690[--field7687];
                    field7690[field7687++] = class83.field1220[var199].field7340;
                    return;
                }
                if (arg0 == 3905) {
                    int var200 = field7690[--field7687];
                    field7690[field7687++] = class83.field1220[var200].field7346;
                    return;
                }
                if (arg0 == 3906) {
                    int var201 = field7690[--field7687];
                    field7690[field7687++] = class83.field1220[var201].field7345;
                    return;
                }
                if (arg0 == 3907) {
                    int var202 = field7690[--field7687];
                    field7690[field7687++] = class83.field1220[var202].field7351;
                    return;
                }
                if (arg0 == 3908) {
                    int var203 = field7690[--field7687];
                    field7690[field7687++] = class83.field1220[var203].field7342;
                    return;
                }
                if (arg0 == 3910) {
                    int var204 = field7690[--field7687];
                    int var205 = class83.field1220[var204].method3086(false);
                    field7690[field7687++] = var205 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var206 = field7690[--field7687];
                    int var207 = class83.field1220[var206].method3086(false);
                    field7690[field7687++] = var207 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var208 = field7690[--field7687];
                    int var209 = class83.field1220[var208].method3086(false);
                    field7690[field7687++] = var209 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var210 = field7690[--field7687];
                    int var211 = class83.field1220[var210].method3086(false);
                    field7690[field7687++] = var211 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field7687 -= 2;
                    int var212 = field7690[field7687];
                    int var213 = field7690[field7687 + 1];
                    field7690[field7687++] = var212 + var213;
                    return;
                }
                if (arg0 == 4001) {
                    field7687 -= 2;
                    int var214 = field7690[field7687];
                    int var215 = field7690[field7687 + 1];
                    field7690[field7687++] = var214 - var215;
                    return;
                }
                if (arg0 == 4002) {
                    field7687 -= 2;
                    int var216 = field7690[field7687];
                    int var217 = field7690[field7687 + 1];
                    field7690[field7687++] = var216 * var217;
                    return;
                }
                if (arg0 == 4003) {
                    field7687 -= 2;
                    int var218 = field7690[field7687];
                    int var219 = field7690[field7687 + 1];
                    field7690[field7687++] = var218 / var219;
                    return;
                }
                if (arg0 == 4004) {
                    int var220 = field7690[--field7687];
                    field7690[field7687++] = (int) (Math.random() * (double) var220);
                    return;
                }
                if (arg0 == 4005) {
                    int var221 = field7690[--field7687];
                    field7690[field7687++] = (int) (Math.random() * (double) (var221 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field7687 -= 5;
                    int var222 = field7690[field7687];
                    int var223 = field7690[field7687 + 1];
                    int var224 = field7690[field7687 + 2];
                    int var225 = field7690[field7687 + 3];
                    int var226 = field7690[field7687 + 4];
                    field7690[field7687++] = (var223 - var222) * (var226 - var224) / (var225 - var224) + var222;
                    return;
                }
                if (arg0 == 4007) {
                    field7687 -= 2;
                    long var227 = (long) field7690[field7687];
                    long var229 = (long) field7690[field7687 + 1];
                    field7690[field7687++] = (int) (var227 * var229 / 100L + var227);
                    return;
                }
                if (arg0 == 4008) {
                    field7687 -= 2;
                    int var231 = field7690[field7687];
                    int var232 = field7690[field7687 + 1];
                    field7690[field7687++] = var231 | 0x1 << var232;
                    return;
                }
                if (arg0 == 4009) {
                    field7687 -= 2;
                    int var233 = field7690[field7687];
                    int var234 = field7690[field7687 + 1];
                    field7690[field7687++] = var233 & -(0x1 << var234) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field7687 -= 2;
                    int var235 = field7690[field7687];
                    int var236 = field7690[field7687 + 1];
                    field7690[field7687++] = (var235 & 0x1 << var236) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field7687 -= 2;
                    int var237 = field7690[field7687];
                    int var238 = field7690[field7687 + 1];
                    field7690[field7687++] = var237 % var238;
                    return;
                }
                if (arg0 == 4012) {
                    field7687 -= 2;
                    int var239 = field7690[field7687];
                    int var240 = field7690[field7687 + 1];
                    if (var239 == 0) {
                        field7690[field7687++] = 0;
                        return;
                    }
                    field7690[field7687++] = (int) Math.pow((double) var239, (double) var240);
                    return;
                }
                if (arg0 == 4013) {
                    field7687 -= 2;
                    int var241 = field7690[field7687];
                    int var242 = field7690[field7687 + 1];
                    if (var241 == 0) {
                        field7690[field7687++] = 0;
                        return;
                    }
                    if (var242 == 0) {
                        field7690[field7687++] = Integer.MAX_VALUE;
                        return;
                    }
                    field7690[field7687++] = (int) Math.pow((double) var241, 1.0D / (double) var242);
                    return;
                }
                if (arg0 == 4014) {
                    field7687 -= 2;
                    int var243 = field7690[field7687];
                    int var244 = field7690[field7687 + 1];
                    field7690[field7687++] = var243 & var244;
                    return;
                }
                if (arg0 == 4015) {
                    field7687 -= 2;
                    int var245 = field7690[field7687];
                    int var246 = field7690[field7687 + 1];
                    field7690[field7687++] = var245 | var246;
                    return;
                }
                if (arg0 == 4016) {
                    field7687 -= 2;
                    int var247 = field7690[field7687];
                    int var248 = field7690[field7687 + 1];
                    field7690[field7687++] = var247 < var248 ? var247 : var248;
                    return;
                }
                if (arg0 == 4017) {
                    field7687 -= 2;
                    int var249 = field7690[field7687];
                    int var250 = field7690[field7687 + 1];
                    field7690[field7687++] = var249 > var250 ? var249 : var250;
                    return;
                }
                if (arg0 == 4018) {
                    field7687 -= 3;
                    long var251 = (long) field7690[field7687];
                    long var253 = (long) field7690[field7687 + 1];
                    long var255 = (long) field7690[field7687 + 2];
                    field7690[field7687++] = (int) (var251 * var255 / var253);
                    return;
                }
                if (arg0 == 4019) {
                    field7687 -= 2;
                    int var257 = field7690[field7687];
                    int var258 = field7690[field7687 + 1];
                    if (var257 > 700 || var258 > 700) {
                        field7690[field7687++] = 256;
                    }
                    double var259 = (Math.random() * (double) (var257 + var258) + 800.0D - (double) var257) / 100.0D;
                    field7690[field7687++] = (int) (Math.pow(2.0D, var259) + 0.5D);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var261 = field7703[--field7689];
                    int var262 = field7690[--field7687];
                    field7703[field7689++] = var261 + var262;
                    return;
                }
                if (arg0 == 4101) {
                    field7689 -= 2;
                    String var263 = field7703[field7689];
                    String var264 = field7703[field7689 + 1];
                    field7703[field7689++] = var263 + var264;
                    return;
                }
                if (arg0 == 4102) {
                    String var265 = field7703[--field7689];
                    int var266 = field7690[--field7687];
                    field7703[field7689++] = var265 + class630.method3623((byte) -107, true, var266);
                    return;
                }
                if (arg0 == 4103) {
                    String var267 = field7703[--field7689];
                    field7703[field7689++] = var267.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field7703[field7689++] = method3197(field7690[--field7687]);
                    return;
                }
                if (arg0 == 4105) {
                    field7689 -= 2;
                    String var268 = field7703[field7689];
                    String var269 = field7703[field7689 + 1];
                    if (class108.field1536.field9081 != null && class108.field1536.field9081.field1829) {
                        field7703[field7689++] = var269;
                        return;
                    }
                    field7703[field7689++] = var268;
                    return;
                }
                if (arg0 == 4106) {
                    int var270 = field7690[--field7687];
                    field7703[field7689++] = Integer.toString(var270);
                    return;
                }
                if (arg0 == 4107) {
                    field7689 -= 2;
                    field7690[field7687++] = class583.method3432(field7703[field7689 + 1], class45.field748, (byte) 80, field7703[field7689]);
                    return;
                }
                if (arg0 == 4108) {
                    String var271 = field7703[--field7689];
                    field7687 -= 2;
                    int var272 = field7690[field7687];
                    int var273 = field7690[field7687 + 1];
                    class502 var274 = class396.method2403(0, (byte) 79, class726.field10209, var273);
                    field7690[field7687++] = var274.method3059(var272, var271, class139.field1899, 160);
                    return;
                }
                if (arg0 == 4109) {
                    String var275 = field7703[--field7689];
                    field7687 -= 2;
                    int var276 = field7690[field7687];
                    int var277 = field7690[field7687 + 1];
                    class502 var278 = class396.method2403(0, (byte) 79, class726.field10209, var277);
                    field7690[field7687++] = var278.method3067(var276, var275, 127, class139.field1899);
                    return;
                }
                if (arg0 == 4110) {
                    field7689 -= 2;
                    String var279 = field7703[field7689];
                    String var280 = field7703[field7689 + 1];
                    if (field7690[--field7687] == 1) {
                        field7703[field7689++] = var279;
                        return;
                    }
                    field7703[field7689++] = var280;
                    return;
                }
                if (arg0 == 4111) {
                    String var281 = field7703[--field7689];
                    field7703[field7689++] = class165.method1183(var281, -13970);
                    return;
                }
                if (arg0 == 4112) {
                    String var282 = field7703[--field7689];
                    int var283 = field7690[--field7687];
                    if (var283 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field7703[field7689++] = var282 + (char) var283;
                    return;
                }
                if (arg0 == 4113) {
                    int var284 = field7690[--field7687];
                    field7690[field7687++] = method3199((char) var284);
                    return;
                }
                if (arg0 == 4114) {
                    int var285 = field7690[--field7687];
                    field7690[field7687++] = class272.method1773(-66, (char) var285) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var286 = field7690[--field7687];
                    field7690[field7687++] = class100.method754((char) var286, 4194303) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var287 = field7690[--field7687];
                    field7690[field7687++] = class211.method1497((byte) -124, (char) var287) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var288 = field7703[--field7689];
                    if (var288 != null) {
                        field7690[field7687++] = var288.length();
                        return;
                    }
                    field7690[field7687++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var289 = field7703[--field7689];
                    field7687 -= 2;
                    int var290 = field7690[field7687];
                    int var291 = field7690[field7687 + 1];
                    field7703[field7689++] = var289.substring(var290, var291);
                    return;
                }
                if (arg0 == 4119) {
                    String var292 = field7703[--field7689];
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
                    field7703[field7689++] = var293.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var297 = field7703[--field7689];
                    field7687 -= 2;
                    int var298 = field7690[field7687];
                    int var299 = field7690[field7687 + 1];
                    field7690[field7687++] = var297.indexOf(var298, var299);
                    return;
                }
                if (arg0 == 4121) {
                    field7689 -= 2;
                    String var300 = field7703[field7689];
                    String var301 = field7703[field7689 + 1];
                    int var302 = field7690[--field7687];
                    field7690[field7687++] = var300.indexOf(var301, var302);
                    return;
                }
                if (arg0 == 4122) {
                    int var303 = field7690[--field7687];
                    field7690[field7687++] = Character.toLowerCase((char) var303);
                    return;
                }
                if (arg0 == 4123) {
                    int var304 = field7690[--field7687];
                    field7690[field7687++] = Character.toUpperCase((char) var304);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var305 = field7690[--field7687] != 0;
                    int var306 = field7690[--field7687];
                    field7703[field7689++] = class517.method3140(0, (byte) -110, class45.field748, (long) var306, var305);
                    return;
                }
                if (arg0 == 4125) {
                    String var307 = field7703[--field7689];
                    int var308 = field7690[--field7687];
                    class502 var309 = class396.method2403(0, (byte) 79, class726.field10209, var308);
                    field7690[field7687++] = var309.method3066(class139.field1899, var307, (byte) 79);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var310 = field7690[--field7687];
                    field7703[field7689++] = class425.field6147.method4144(var310, 126).field6070;
                    return;
                }
                if (arg0 == 4201) {
                    field7687 -= 2;
                    int var311 = field7690[field7687];
                    int var312 = field7690[field7687 + 1];
                    class424 var313 = class425.field6147.method4144(var311, 126);
                    if (var312 >= 1 && var312 <= 5 && var313.field6139[var312 - 1] != null) {
                        field7703[field7689++] = var313.field6139[var312 - 1];
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field7687 -= 2;
                    int var314 = field7690[field7687];
                    int var315 = field7690[field7687 + 1];
                    class424 var316 = class425.field6147.method4144(var314, 127);
                    if (var315 >= 1 && var315 <= 5 && var316.field6141[var315 - 1] != null) {
                        field7703[field7689++] = var316.field6141[var315 - 1];
                        return;
                    }
                    field7703[field7689++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var317 = field7690[--field7687];
                    field7690[field7687++] = class425.field6147.method4144(var317, 125).field6100;
                    return;
                }
                if (arg0 == 4204) {
                    int var318 = field7690[--field7687];
                    field7690[field7687++] = class425.field6147.method4144(var318, 127).field6064 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var319 = field7690[--field7687];
                    class424 var320 = class425.field6147.method4144(var319, 126);
                    if (var320.field6131 == -1 && var320.field6087 >= 0) {
                        field7690[field7687++] = var320.field6087;
                        return;
                    }
                    field7690[field7687++] = var319;
                    return;
                }
                if (arg0 == 4206) {
                    int var321 = field7690[--field7687];
                    class424 var322 = class425.field6147.method4144(var321, 125);
                    if (var322.field6131 >= 0 && var322.field6087 >= 0) {
                        field7690[field7687++] = var322.field6087;
                        return;
                    }
                    field7690[field7687++] = var321;
                    return;
                }
                if (arg0 == 4207) {
                    int var323 = field7690[--field7687];
                    field7690[field7687++] = class425.field6147.method4144(var323, 127).field6108 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field7687 -= 2;
                    int var324 = field7690[field7687];
                    int var325 = field7690[field7687 + 1];
                    class167 var326 = class332.field4513.method1901(-4115, var325);
                    if (var326.method1195(-116)) {
                        field7703[field7689++] = class425.field6147.method4144(var324, 125).method2640(var326.field2373, var325, (byte) 57);
                        return;
                    }
                    field7690[field7687++] = class425.field6147.method4144(var324, 126).method2634(var326.field2364, var325, false);
                    return;
                }
                if (arg0 == 4209) {
                    field7687 -= 2;
                    int var327 = field7690[field7687];
                    int var328 = field7690[field7687 + 1] - 1;
                    class424 var329 = class425.field6147.method4144(var327, 124);
                    if (var329.field6096 == var328) {
                        field7690[field7687++] = var329.field6134;
                        return;
                    }
                    if (var329.field6137 == var328) {
                        field7690[field7687++] = var329.field6097;
                        return;
                    }
                    field7690[field7687++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var330 = field7703[--field7689];
                    int var331 = field7690[--field7687];
                    class282.method1805((byte) -52, var330, var331 == 1);
                    field7690[field7687++] = class756.field10521;
                    return;
                }
                if (arg0 == 4211) {
                    if (class340.field4686 != null && class642.field9140 < class756.field10521) {
                        field7690[field7687++] = class340.field4686[class642.field9140++] & 0xFFFF;
                        return;
                    }
                    field7690[field7687++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class642.field9140 = 0;
                    return;
                }
                if (arg0 == 4213) {
                    int var332 = field7690[--field7687];
                    field7690[field7687++] = class425.field6147.method4144(var332, 124).field6069;
                    return;
                }
                if (arg0 == 4214) {
                    String var333 = field7703[--field7689];
                    field7687 -= 3;
                    int var334 = field7690[field7687];
                    int var335 = field7690[field7687 + 1];
                    int var336 = field7690[field7687 + 2];
                    class71.method623(var333, var334 == 1, false, var335, var336);
                    field7690[field7687++] = class756.field10521;
                    return;
                }
                if (arg0 == 4215) {
                    field7689 -= 2;
                    field7687 -= 2;
                    String var337 = field7703[field7689];
                    int var338 = field7690[field7687];
                    int var339 = field7690[field7687 + 1];
                    String var340 = field7703[field7689 + 1];
                    class108.method800((byte) 63, var338 == 1, var337, var339, var340);
                    field7690[field7687++] = class756.field10521;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field7687 -= 2;
                    int var341 = field7690[field7687];
                    int var342 = field7690[field7687 + 1];
                    class167 var343 = class332.field4513.method1901(-4115, var342);
                    if (var343.method1195(-116)) {
                        field7703[field7689++] = class288.field4000.method2822(var341, 50).method3172(var343.field2373, 110, var342);
                        return;
                    }
                    field7690[field7687++] = class288.field4000.method2822(var341, 50).method3163(var343.field2364, var342, true);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field7687 -= 2;
                    int var344 = field7690[field7687];
                    int var345 = field7690[field7687 + 1];
                    class167 var346 = class332.field4513.method1901(-4115, var345);
                    if (var346.method1195(-116)) {
                        field7703[field7689++] = class375.field5421.method2680(var344, (byte) 115).method2935(var345, 7, var346.field2373);
                        return;
                    }
                    field7690[field7687++] = class375.field5421.method2680(var344, (byte) 126).method2948(105, var346.field2364, var345);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field7687 -= 2;
                    int var347 = field7690[field7687];
                    int var348 = field7690[field7687 + 1];
                    class167 var349 = class332.field4513.method1901(-4115, var348);
                    if (var349.method1195(-116)) {
                        field7703[field7689++] = class379.field5506.method3360(120, var347).method575(false, var349.field2373, var348);
                        return;
                    }
                    field7690[field7687++] = class379.field5506.method3360(-96, var347).method572(16711935, var349.field2364, var348);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var350 = field7690[--field7687];
                class83 var351 = class306.field4169.method1688(-96, var350);
                if (var351.field1215 != null && var351.field1215.length > 0) {
                    int var352 = 0;
                    int var353 = var351.field1201[0];
                    for (int var354 = 1; var354 < var351.field1215.length; var354++) {
                        if (var351.field1201[var354] > var353) {
                            var352 = var354;
                            var353 = var351.field1201[var354];
                        }
                    }
                    field7690[field7687++] = var351.field1215[var352];
                    return;
                }
                field7690[field7687++] = var351.field1216;
                return;
            }
        } else {
            class146 var51;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var51 = class250.method1689(field7690[--field7687], false);
            } else {
                var51 = arg1 ? field7701 : field7691;
            }
            if (arg0 == 1300) {
                int var52 = field7690[--field7687] - 1;
                if (var52 >= 0 && var52 <= 9) {
                    var51.method1027((byte) -93, var52, field7703[--field7689]);
                    return;
                }
                field7689--;
                return;
            }
            if (arg0 == 1301) {
                field7687 -= 2;
                int var53 = field7690[field7687];
                int var54 = field7690[field7687 + 1];
                if (var53 == -1 && var54 == -1) {
                    var51.field2061 = null;
                    return;
                }
                var51.field2061 = class590.method3467(1, var53, var54);
                return;
            }
            if (arg0 == 1302) {
                int var55 = field7690[--field7687];
                if (class738.field10306 != var55 && class99.field1432 != var55 && class425.field6148 != var55) {
                    return;
                }
                var51.field2082 = var55;
                return;
            }
            if (arg0 == 1303) {
                var51.field2097 = field7690[--field7687];
                return;
            }
            if (arg0 == 1304) {
                var51.field2073 = field7690[--field7687];
                return;
            }
            if (arg0 == 1305) {
                var51.field2024 = field7703[--field7689];
                return;
            }
            if (arg0 == 1306) {
                var51.field2137 = field7703[--field7689];
                return;
            }
            if (arg0 == 1307) {
                var51.field2100 = null;
                return;
            }
            if (arg0 == 1308) {
                var51.field2045 = field7690[--field7687];
                var51.field1991 = field7690[--field7687];
                return;
            }
            if (arg0 == 1309) {
                int var56 = field7690[--field7687];
                int var57 = field7690[--field7687];
                if (var57 >= 1 && var57 <= 10) {
                    var51.method1018(var57 - 1, -12920, var56);
                }
                return;
            }
            if (arg0 == 1310) {
                var51.field2021 = field7703[--field7689];
                return;
            }
            if (arg0 == 1311) {
                var51.field2088 = field7690[--field7687];
                return;
            }
            if (arg0 == 1312 || arg0 == 1313) {
                int var58;
                int var59;
                int var60;
                if (arg0 == 1312) {
                    field7687 -= 3;
                    var58 = field7690[field7687] - 1;
                    var59 = field7690[field7687 + 1];
                    var60 = field7690[field7687 + 2];
                    if (var58 < 0 || var58 > 9) {
                        throw new RuntimeException("IOR13121313");
                    }
                } else {
                    field7687 -= 2;
                    var58 = 10;
                    var59 = field7690[field7687];
                    var60 = field7690[field7687 + 1];
                }
                if (var51.field2126 == null) {
                    if (var59 == 0) {
                        return;
                    }
                    var51.field2126 = new byte[11];
                    var51.field1996 = new byte[11];
                    var51.field1989 = new int[11];
                }
                var51.field2126[var58] = (byte) var59;
                if (var59 == 0) {
                    var51.field2080 = false;
                    for (int var61 = 0; var61 < var51.field2126.length; var61++) {
                        if (var51.field2126[var61] != 0) {
                            var51.field2080 = true;
                            break;
                        }
                    }
                } else {
                    var51.field2080 = true;
                }
                var51.field1996[var58] = (byte) var60;
                return;
            }
            if (arg0 == 1314) {
                var51.field2077 = field7690[--field7687];
                return;
            }
        }
        throw new IllegalStateException(String.valueOf(arg0));
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "()V")
    public static void method3204() {
        field7697 = null;
        field7688 = null;
        field7693 = null;
        field7698 = null;
        field7690 = null;
        field7703 = null;
        field7705 = null;
        field7691 = null;
        field7701 = null;
        field7694 = null;
        field7704 = null;
        field7713 = null;
        field7711 = null;
        field7712 = null;
    }

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "(I)V")
    private static final void method3205(int arg0) {
        class146 var1 = class250.method1689(arg0, false);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class146[] var3 = class313.field4239[var2];
        if (var3 == null) {
            class146[] var4 = class600.field8524[var2];
            int var5 = var4.length;
            var3 = class313.field4239[var2] = new class146[var5];
            class85.method680(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class85.method680(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lsm;II)V")
    public static final void method3206(class387 arg0, int arg1, int arg2) {
        class657 var3 = class472.method2840(arg0, arg2, 67107840, arg1);
        if (var3 == null) {
            return;
        }
        field7697 = new int[var3.field9411];
        field7688 = new String[var3.field9416];
        if (class294.field4040 == var3.field9407 || class240.field3552 == var3.field9407 || class680.field9667 == var3.field9407) {
            int var4 = 0;
            int var5 = 0;
            if (class344.field4731 != null) {
                var4 = class344.field4731.field2103;
                var5 = class344.field4731.field1992;
            }
            field7697[0] = class535.field7789.method2459(-32213) - var4;
            field7697[1] = class535.field7789.method2452(-111) - var5;
        }
        method3208(var3, 200000);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Lfda;)V")
    public static final void method3207(class362 arg0) {
        method3200(arg0, 200000);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljj;I)V")
    private static final void method3208(class657 arg0, int arg1) {
        field7687 = 0;
        field7689 = 0;
        int var2 = -1;
        int[] var3 = arg0.field9413;
        int[] var4 = arg0.field9406;
        byte var5 = -1;
        field7696 = 0;
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
                        method3203(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method3198(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field7690[field7687++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field7690[field7687++] = class226.field3372.field6[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class226.field3372.method1((byte) -42, field7690[--field7687], var8);
                } else if (var43 == 3) {
                    field7703[field7689++] = arg0.field9408[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field7687 -= 2;
                    if (field7690[field7687 + 1] != field7690[field7687]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field7687 -= 2;
                    if (field7690[field7687 + 1] == field7690[field7687]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field7687 -= 2;
                    if (field7690[field7687] < field7690[field7687 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field7687 -= 2;
                    if (field7690[field7687] > field7690[field7687 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field7696 == 0) {
                        return;
                    }
                    class699 var9 = field7705[--field7696];
                    arg0 = var9.field9864;
                    var3 = arg0.field9413;
                    var4 = arg0.field9406;
                    var2 = var9.field9865;
                    field7697 = var9.field9860;
                    field7688 = var9.field9867;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field7690[field7687++] = class226.field3372.method2(var10, 0);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class226.field3372.method5(field7690[--field7687], var11, (byte) -84);
                } else if (var43 == 31) {
                    field7687 -= 2;
                    if (field7690[field7687] <= field7690[field7687 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field7687 -= 2;
                    if (field7690[field7687] >= field7690[field7687 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field7690[field7687++] = field7697[var4[var2]];
                } else if (var43 == 34) {
                    field7697[var4[var2]] = field7690[--field7687];
                } else if (var43 == 35) {
                    field7703[field7689++] = field7688[var4[var2]];
                } else if (var43 == 36) {
                    field7688[var4[var2]] = field7703[--field7689];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field7689 -= var12;
                    String var13 = class374.method2324(field7703, field7689, -1, var12);
                    field7703[field7689++] = var13;
                } else if (var43 == 38) {
                    field7687--;
                } else if (var43 == 39) {
                    field7689--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class657 var15 = class158.method1125(-95, var14);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field9411];
                    String[] var17 = new String[var15.field9416];
                    for (int var18 = 0; var18 < var15.field9412; var18++) {
                        var16[var18] = field7690[field7687 + var18 - var15.field9412];
                    }
                    for (int var19 = 0; var19 < var15.field9409; var19++) {
                        var17[var19] = field7703[field7689 + var19 - var15.field9409];
                    }
                    field7687 -= var15.field9412;
                    field7689 -= var15.field9409;
                    class699 var20 = new class699();
                    var20.field9864 = arg0;
                    var20.field9865 = var2;
                    var20.field9860 = field7697;
                    var20.field9867 = field7688;
                    if (field7696 >= field7705.length) {
                        throw new RuntimeException();
                    }
                    field7705[field7696++] = var20;
                    arg0 = var15;
                    var3 = var15.field9413;
                    var4 = var15.field9406;
                    var2 = -1;
                    field7697 = var16;
                    field7688 = var17;
                } else if (var43 == 42) {
                    field7690[field7687++] = class541.field7855[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class541.field7855[var21] = field7690[--field7687];
                    class140.method991((byte) 114, var21);
                    class577.field8287 |= class525.field7633[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field7690[--field7687];
                    if (var24 >= 0 && var24 <= 5000) {
                        field7693[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field7698[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field7690[--field7687];
                    if (var28 < 0 || var28 >= field7693[var27]) {
                        throw new RuntimeException();
                    }
                    field7690[field7687++] = field7698[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field7687 -= 2;
                    int var30 = field7690[field7687];
                    if (var30 < 0 || var30 >= field7693[var29]) {
                        throw new RuntimeException();
                    }
                    field7698[var29][var30] = field7690[field7687 + 1];
                } else if (var43 == 47) {
                    String var31 = class556.field8082[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field7703[field7689++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class556.field8082[var32] = field7703[--field7689];
                    class629.method3620(var32, (byte) 116);
                } else if (var43 == 51) {
                    class715 var33 = arg0.field9414[var4[var2]];
                    class177 var34 = (class177) var33.method4020((long) field7690[--field7687], (byte) -93);
                    if (var34 != null) {
                        var2 += var34.field2473;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field9410 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field6188).append(" ");
                for (int var41 = field7696 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field7705[var41].field9864.field6188).append(" ");
                }
                var40.append("op: ").append(var5);
                class705.method3952(var40.toString(), var42, -29913);
            } else {
                class758.method4212(4, 2, "Clientscript error in: " + arg0.field9410);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field9410).append("\n");
                for (int var38 = field7696 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field7705[var38].field9864.field9410).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class705.method3952(var37.toString(), var42, -29913);
                class646.method3726(var37.toString(), -92);
            }
        }
    }

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "()V")
    public static final void method3209() {
    }

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(I)V")
    private static final void method3210(int arg0) {
        class146 var1 = class250.method1689(arg0, false);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class146[] var3 = class313.field4239[var2];
        if (var3 == null) {
            class146[] var4 = class600.field8524[var2];
            int var5 = var4.length;
            var3 = class313.field4239[var2] = new class146[var5];
            class85.method680(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class85.method680(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }
}
