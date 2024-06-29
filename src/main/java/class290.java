import java.util.Calendar;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class290 {

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "[Ljava/lang/String;")
    private static String[] field4214 = new String[1000];

    @OriginalMember(owner = "client!gt", name = "h", descriptor = "[Lpn;")
    private static class485[] field4219 = new class485[50];

    @OriginalMember(owner = "client!gt", name = "j", descriptor = "[I")
    private static int[] field4221 = new int[1000];

    @OriginalMember(owner = "client!gt", name = "f", descriptor = "[[I")
    private static int[][] field4217 = new int[5][5000];

    @OriginalMember(owner = "client!gt", name = "w", descriptor = "I")
    private static int field4234 = 0;

    @OriginalMember(owner = "client!gt", name = "s", descriptor = "I")
    private static int field4230 = 0;

    @OriginalMember(owner = "client!gt", name = "n", descriptor = "[I")
    private static int[] field4225 = new int[5];

    @OriginalMember(owner = "client!gt", name = "t", descriptor = "I")
    private static int field4231 = 0;

    @OriginalMember(owner = "client!gt", name = "r", descriptor = "Ljava/util/Calendar;")
    private static Calendar field4229 = Calendar.getInstance();

    @OriginalMember(owner = "client!gt", name = "z", descriptor = "[I")
    private static int[] field4237 = new int[3];

    @OriginalMember(owner = "client!gt", name = "A", descriptor = "[Ljava/lang/String;")
    private static String[] field4238 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "Lku;")
    public static class232 field4239 = new class232(4);

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "I")
    public static int field4213;

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!gt", name = "g", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!gt", name = "l", descriptor = "I")
    public static int field4223;

    @OriginalMember(owner = "client!gt", name = "m", descriptor = "I")
    public static int field4224;

    @OriginalMember(owner = "client!gt", name = "q", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!gt", name = "u", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!gt", name = "v", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!gt", name = "y", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!gt", name = "k", descriptor = "Ldt;")
    private static class145 field4222;

    @OriginalMember(owner = "client!gt", name = "x", descriptor = "Ldt;")
    private static class145 field4235;

    @OriginalMember(owner = "client!gt", name = "p", descriptor = "Lso;")
    private static class302 field4227;

    @OriginalMember(owner = "client!gt", name = "o", descriptor = "[I")
    private static int[] field4226;

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "[Ljava/lang/String;")
    private static String[] field4215;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IZ)V")
    private static final void method1810(int arg0, boolean arg1) {
        if (arg0 < 5100) {
            if (arg0 == 5000) {
                field4221[field4234++] = class403.field5688;
                return;
            }
            if (arg0 == 5001) {
                field4234 -= 3;
                class403.field5688 = field4221[field4234];
                class220.field3285 = class38.method252(field4221[field4234 + 1], (byte) -125);
                if (class220.field3285 == null) {
                    class220.field3285 = class54.field728;
                }
                class220.field3283 = field4221[field4234 + 2];
                field4233++;
                class15.method110(class103.field1307, -128);
                class225.field3415.method1753(true, class403.field5688);
                class225.field3415.method1753(true, class220.field3285.field5249);
                class225.field3415.method1753(true, class220.field3283);
                return;
            }
            if (arg0 == 5002) {
                field4230 -= 2;
                String var2 = field4214[field4230];
                String var3 = field4214[field4230 + 1];
                field4234 -= 2;
                int var4 = field4221[field4234];
                int var5 = field4221[field4234 + 1];
                if (var3 == null) {
                    var3 = "";
                }
                if (var3.length() > 80) {
                    var3 = var3.substring(0, 80);
                }
                field4232++;
                class15.method110(class327.field4739, -126);
                class225.field3415.method1753(true, class89.method501(var2, true) + class89.method501(var3, true) + 2);
                class225.field3415.method1730(-11508, var2);
                class225.field3415.method1753(true, var4 - 1);
                class225.field3415.method1753(true, var5);
                class225.field3415.method1730(-11508, var3);
                return;
            }
            if (arg0 == 5003) {
                int var6 = field4221[--field4234];
                String var7 = null;
                if (var6 < 100) {
                    var7 = class303.field4314[var6];
                }
                if (var7 == null) {
                    var7 = "";
                }
                field4214[field4230++] = var7;
                return;
            }
            if (arg0 == 5004) {
                int var8 = field4221[--field4234];
                int var9 = -1;
                if (var8 < 100 && class303.field4314[var8] != null) {
                    var9 = class107.field1343[var8];
                }
                field4221[field4234++] = var9;
                return;
            }
            if (arg0 == 5005) {
                if (class220.field3285 == null) {
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = class220.field3285.field5249;
                return;
            }
            if (arg0 == 5008 || arg0 == 5021) {
                String var67 = field4214[--field4230];
                method1816(var67, arg0);
                return;
            }
            if (arg0 == 5009) {
                field4230 -= 2;
                String var10 = field4214[field4230];
                String var11 = field4214[field4230 + 1];
                if (class362.field5213 != 0 || (!class479.field6717 || class23.field308) && !class363.field5221) {
                    field4228++;
                    class15.method110(class116.field1475, -125);
                    class225.field3415.method1753(true, 0);
                    int var12 = class225.field3415.field4021;
                    class225.field3415.method1730(-11508, var10);
                    class272.method1670(class225.field3415, var11, true);
                    class225.field3415.method1733(-23181, class225.field3415.field4021 - var12);
                    return;
                }
                return;
            }
            if (arg0 == 5010) {
                int var13 = field4221[--field4234];
                String var14 = null;
                if (var13 < 100) {
                    var14 = class330.field4782[var13];
                }
                if (var14 == null) {
                    var14 = "";
                }
                field4214[field4230++] = var14;
                return;
            }
            if (arg0 == 5011) {
                int var15 = field4221[--field4234];
                String var16 = null;
                if (var15 < 100) {
                    var16 = class401.field5679[var15];
                }
                if (var16 == null) {
                    var16 = "";
                }
                field4214[field4230++] = var16;
                return;
            }
            if (arg0 == 5012) {
                int var17 = field4221[--field4234];
                int var18 = -1;
                if (var17 < 100) {
                    var18 = class276.field4067[var17];
                }
                field4221[field4234++] = var18;
                return;
            }
            if (arg0 == 5015) {
                String var19;
                if (class492.field6935 == null || class492.field6935.field6256 == null) {
                    var19 = class298.field4289;
                } else {
                    var19 = class492.field6935.method2648(true, -120);
                }
                field4214[field4230++] = var19;
                return;
            }
            if (arg0 == 5016) {
                field4221[field4234++] = class220.field3283;
                return;
            }
            if (arg0 == 5017) {
                field4221[field4234++] = class231.field3495;
                return;
            }
            if (arg0 == 5018) {
                int var20 = field4221[--field4234];
                int var21 = 0;
                if (var20 < 100 && class303.field4314[var20] != null) {
                    var21 = class107.field1343[var20];
                }
                field4221[field4234++] = var21;
                return;
            }
            if (arg0 == 5019) {
                int var22 = field4221[--field4234];
                String var23 = null;
                if (var22 < 100) {
                    var23 = class431.field6043[var22];
                }
                if (var23 == null) {
                    var23 = "";
                }
                field4214[field4230++] = var23;
                return;
            }
            if (arg0 == 5020) {
                String var24;
                if (class492.field6935 == null || class492.field6935.field6256 == null) {
                    var24 = class298.field4289;
                } else {
                    var24 = class492.field6935.method2637(false, (byte) 13);
                }
                field4214[field4230++] = var24;
                return;
            }
            if (arg0 == 5050) {
                int var25 = field4221[--field4234];
                field4214[field4230++] = class153.method962(var25, false).field5079;
                return;
            }
            if (arg0 == 5051) {
                int var26 = field4221[--field4234];
                class351 var27 = class153.method962(var26, false);
                if (var27.field5072 == null) {
                    field4221[field4234++] = 0;
                    return;
                }
                field4221[field4234++] = var27.field5072.length;
                return;
            }
            if (arg0 == 5052) {
                field4234 -= 2;
                int var28 = field4221[field4234];
                int var29 = field4221[field4234 + 1];
                class351 var30 = class153.method962(var28, false);
                int var31 = var30.field5072[var29];
                field4221[field4234++] = var31;
                return;
            }
            if (arg0 == 5053) {
                int var32 = field4221[--field4234];
                class351 var33 = class153.method962(var32, false);
                if (var33.field5080 == null) {
                    field4221[field4234++] = 0;
                    return;
                }
                field4221[field4234++] = var33.field5080.length;
                return;
            }
            if (arg0 == 5054) {
                field4234 -= 2;
                int var34 = field4221[field4234];
                int var35 = field4221[field4234 + 1];
                field4221[field4234++] = class153.method962(var34, false).field5080[var35];
                return;
            }
            if (arg0 == 5055) {
                int var36 = field4221[--field4234];
                field4214[field4230++] = class226.method1452(-32769, var36).method980(0);
                return;
            }
            if (arg0 == 5056) {
                int var37 = field4221[--field4234];
                class156 var38 = class226.method1452(-32769, var37);
                if (var38.field2321 == null) {
                    field4221[field4234++] = 0;
                    return;
                }
                field4221[field4234++] = var38.field2321.length;
                return;
            }
            if (arg0 == 5057) {
                field4234 -= 2;
                int var39 = field4221[field4234];
                int var40 = field4221[field4234 + 1];
                field4221[field4234++] = class226.method1452(-32769, var39).field2321[var40];
                return;
            }
            if (arg0 == 5058) {
                field4227 = new class302();
                field4227.field4302 = field4221[--field4234];
                field4227.field4306 = class226.method1452(-32769, field4227.field4302);
                field4227.field4303 = new int[field4227.field4306.method983((byte) 109)];
                return;
            }
            if (arg0 == 5059) {
                field4223++;
                class15.method110(class277.field4084, -126);
                class225.field3415.method1753(true, 0);
                int var41 = class225.field3415.field4021;
                class225.field3415.method1753(true, 0);
                class225.field3415.method1711(false, field4227.field4302);
                field4227.field4306.method975((byte) -55, class225.field3415, field4227.field4303);
                class225.field3415.method1733(-23181, class225.field3415.field4021 - var41);
                return;
            }
            if (arg0 == 5060) {
                String var42 = field4214[--field4230];
                field4213++;
                class15.method110(class204.field3041, -127);
                class225.field3415.method1753(true, 0);
                int var43 = class225.field3415.field4021;
                class225.field3415.method1730(-11508, var42);
                class225.field3415.method1711(false, field4227.field4302);
                field4227.field4306.method975((byte) -63, class225.field3415, field4227.field4303);
                class225.field3415.method1733(-23181, class225.field3415.field4021 - var43);
                return;
            }
            if (arg0 == 5061) {
                field4223++;
                class15.method110(class277.field4084, -127);
                class225.field3415.method1753(true, 0);
                int var44 = class225.field3415.field4021;
                class225.field3415.method1753(true, 1);
                class225.field3415.method1711(false, field4227.field4302);
                field4227.field4306.method975((byte) -102, class225.field3415, field4227.field4303);
                class225.field3415.method1733(-23181, class225.field3415.field4021 - var44);
                return;
            }
            if (arg0 == 5062) {
                field4234 -= 2;
                int var45 = field4221[field4234];
                int var46 = field4221[field4234 + 1];
                field4221[field4234++] = class153.method962(var45, false).field5076[var46];
                return;
            }
            if (arg0 == 5063) {
                field4234 -= 2;
                int var47 = field4221[field4234];
                int var48 = field4221[field4234 + 1];
                field4221[field4234++] = class153.method962(var47, false).field5082[var48];
                return;
            }
            if (arg0 == 5064) {
                field4234 -= 2;
                int var49 = field4221[field4234];
                int var50 = field4221[field4234 + 1];
                if (var50 == -1) {
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = class153.method962(var49, false).method2198(-78, (char) var50);
                return;
            }
            if (arg0 == 5065) {
                field4234 -= 2;
                int var51 = field4221[field4234];
                int var52 = field4221[field4234 + 1];
                if (var52 == -1) {
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = class153.method962(var51, false).method2193(27449, (char) var52);
                return;
            }
            if (arg0 == 5066) {
                int var53 = field4221[--field4234];
                field4221[field4234++] = class226.method1452(-32769, var53).method983((byte) 54);
                return;
            }
            if (arg0 == 5067) {
                field4234 -= 2;
                int var54 = field4221[field4234];
                int var55 = field4221[field4234 + 1];
                int var56 = class226.method1452(-32769, var54).method977(var55, (byte) 35);
                field4221[field4234++] = var56;
                return;
            }
            if (arg0 == 5068) {
                field4234 -= 2;
                int var57 = field4221[field4234];
                int var58 = field4221[field4234 + 1];
                field4227.field4303[var57] = var58;
                return;
            }
            if (arg0 == 5069) {
                field4234 -= 2;
                int var59 = field4221[field4234];
                int var60 = field4221[field4234 + 1];
                field4227.field4303[var59] = var60;
                return;
            }
            if (arg0 == 5070) {
                field4234 -= 3;
                int var61 = field4221[field4234];
                int var62 = field4221[field4234 + 1];
                int var63 = field4221[field4234 + 2];
                class156 var64 = class226.method1452(-32769, var61);
                if (var64.method977(var62, (byte) 35) != 0) {
                    throw new RuntimeException("bad command");
                }
                field4221[field4234++] = var64.method979(var62, var63, 4);
                return;
            }
            if (arg0 == 5071) {
                String var65 = field4214[--field4230];
                boolean var66 = field4221[--field4234] == 1;
                class55.method347(var65, (byte) 51, var66);
                field4221[field4234++] = class321.field4652;
                return;
            }
            if (arg0 == 5072) {
                if (class40.field531 != null && class45.field643 < class321.field4652) {
                    field4221[field4234++] = class40.field531[class45.field643++] & 0xFFFF;
                    return;
                }
                field4221[field4234++] = -1;
                return;
            }
            if (arg0 == 5073) {
                class45.field643 = 0;
                return;
            }
        } else if (arg0 < 5200) {
            if (arg0 == 5100) {
                if (class272.field3959.method2712(2, 86)) {
                    field4221[field4234++] = 1;
                    return;
                }
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 5101) {
                if (class272.field3959.method2712(2, 82)) {
                    field4221[field4234++] = 1;
                    return;
                }
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 5102) {
                if (class272.field3959.method2712(2, 81)) {
                    field4221[field4234++] = 1;
                    return;
                }
                field4221[field4234++] = 0;
                return;
            }
        } else if (arg0 < 5300) {
            if (arg0 == 5200) {
                class438.method2579(field4221[--field4234], 7);
                return;
            }
            if (arg0 == 5201) {
                field4221[field4234++] = class344.method2158(-121);
                return;
            }
            if (arg0 == 5205) {
                class168.method1040(field4221[--field4234], -1, false, (byte) -18, -1);
                return;
            }
            if (arg0 == 5206) {
                int var68 = field4221[--field4234];
                class179 var69 = class395.method2369(var68 >> 14 & 0x3FFF, var68 & 0x3FFF);
                if (var69 == null) {
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = var69.field2578;
                return;
            }
            if (arg0 == 5207) {
                class179 var70 = class395.method2378(field4221[--field4234]);
                if (var70 != null && var70.field2569 != null) {
                    field4214[field4230++] = var70.field2569;
                    return;
                }
                field4214[field4230++] = "";
                return;
            }
            if (arg0 == 5208) {
                field4221[field4234++] = class172.field2504;
                field4221[field4234++] = class128.field1671;
                return;
            }
            if (arg0 == 5209) {
                field4221[field4234++] = class395.field5638 + class128.field1666;
                field4221[field4234++] = class395.field5623 + class220.field3280;
                return;
            }
            if (arg0 == 5210) {
                int var71 = field4221[--field4234];
                class179 var72 = class395.method2378(var71);
                if (var72 == null) {
                    field4221[field4234++] = 0;
                    field4221[field4234++] = 0;
                    return;
                }
                field4221[field4234++] = var72.field2566 >> 14 & 0x3FFF;
                field4221[field4234++] = var72.field2566 & 0x3FFF;
                return;
            }
            if (arg0 == 5211) {
                int var73 = field4221[--field4234];
                class179 var74 = class395.method2378(var73);
                if (var74 == null) {
                    field4221[field4234++] = 0;
                    field4221[field4234++] = 0;
                    return;
                }
                field4221[field4234++] = var74.field2560 - var74.field2562;
                field4221[field4234++] = var74.field2561 - var74.field2570;
                return;
            }
            if (arg0 == 5212) {
                class80 var75 = class23.method162(14);
                if (var75 == null) {
                    field4221[field4234++] = -1;
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = var75.field980;
                int var76 = var75.field979 << 28 | class395.field5638 + var75.field977 << 14 | class395.field5623 + var75.field978;
                field4221[field4234++] = var76;
                return;
            }
            if (arg0 == 5213) {
                class80 var77 = class440.method2580((byte) 121);
                if (var77 == null) {
                    field4221[field4234++] = -1;
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = var77.field980;
                int var78 = var77.field979 << 28 | class395.field5638 + var77.field977 << 14 | class395.field5623 + var77.field978;
                field4221[field4234++] = var78;
                return;
            }
            if (arg0 == 5214) {
                int var79 = field4221[--field4234];
                class179 var80 = class275.method1685(-23037);
                if (var80 != null) {
                    boolean var81 = var80.method1098(field4237, var79 & 0x3FFF, var79 >> 14 & 0x3FFF, var79 >> 28 & 0x3, 5);
                    if (var81) {
                        class178.method1088(field4237[2], field4237[1], (byte) 80);
                    }
                }
                return;
            }
            if (arg0 == 5215) {
                field4234 -= 2;
                int var82 = field4221[field4234];
                int var83 = field4221[field4234 + 1];
                class249 var84 = class395.method2375(var82 >> 14 & 0x3FFF, var82 & 0x3FFF);
                boolean var85 = false;
                for (class179 var86 = (class179) var84.method1558(true); var86 != null; var86 = (class179) var84.method1554(-11541)) {
                    if (var86.field2578 == var83) {
                        var85 = true;
                        break;
                    }
                }
                if (var85) {
                    field4221[field4234++] = 1;
                    return;
                }
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 5218) {
                int var87 = field4221[--field4234];
                class179 var88 = class395.method2378(var87);
                if (var88 == null) {
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = var88.field2564;
                return;
            }
            if (arg0 == 5220) {
                field4221[field4234++] = class482.field6790 == 100 ? 1 : 0;
                return;
            }
            if (arg0 == 5221) {
                int var89 = field4221[--field4234];
                class178.method1088(var89 & 0x3FFF, var89 >> 14 & 0x3FFF, (byte) 84);
                return;
            }
            if (arg0 == 5222) {
                class179 var90 = class275.method1685(-23037);
                if (var90 != null) {
                    boolean var91 = var90.method1097(field4237, class395.field5638 + class128.field1666, -117, class395.field5623 + class220.field3280);
                    if (var91) {
                        field4221[field4234++] = field4237[1];
                        field4221[field4234++] = field4237[2];
                        return;
                    }
                    field4221[field4234++] = -1;
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = -1;
                field4221[field4234++] = -1;
                return;
            }
            if (arg0 == 5223) {
                field4234 -= 2;
                int var92 = field4221[field4234];
                int var93 = field4221[field4234 + 1];
                class168.method1040(var92, var93 & 0x3FFF, false, (byte) -66, var93 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5224) {
                int var94 = field4221[--field4234];
                class179 var95 = class275.method1685(-23037);
                if (var95 != null) {
                    boolean var96 = var95.method1098(field4237, var94 & 0x3FFF, var94 >> 14 & 0x3FFF, var94 >> 28 & 0x3, 5);
                    if (var96) {
                        field4221[field4234++] = field4237[1];
                        field4221[field4234++] = field4237[2];
                        return;
                    }
                    field4221[field4234++] = -1;
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = -1;
                field4221[field4234++] = -1;
                return;
            }
            if (arg0 == 5225) {
                int var97 = field4221[--field4234];
                class179 var98 = class275.method1685(-23037);
                if (var98 != null) {
                    boolean var99 = var98.method1097(field4237, var97 >> 14 & 0x3FFF, -127, var97 & 0x3FFF);
                    if (var99) {
                        field4221[field4234++] = field4237[1];
                        field4221[field4234++] = field4237[2];
                        return;
                    }
                    field4221[field4234++] = -1;
                    field4221[field4234++] = -1;
                    return;
                }
                field4221[field4234++] = -1;
                field4221[field4234++] = -1;
                return;
            }
            if (arg0 == 5226) {
                class115.method727(-1, field4221[--field4234]);
                return;
            }
            if (arg0 == 5227) {
                field4234 -= 2;
                int var100 = field4221[field4234];
                int var101 = field4221[field4234 + 1];
                class168.method1040(var100, var101 & 0x3FFF, true, (byte) -43, var101 >> 14 & 0x3FFF);
                return;
            }
            if (arg0 == 5228) {
                class264.field3850 = field4221[--field4234] == 1;
                return;
            }
            if (arg0 == 5229) {
                field4221[field4234++] = class264.field3850 ? 1 : 0;
                return;
            }
            if (arg0 == 5230) {
                int var102 = field4221[--field4234];
                class43.method287((byte) 127, var102);
                return;
            }
            if (arg0 == 5231) {
                field4234 -= 2;
                int var103 = field4221[field4234];
                boolean var104 = field4221[field4234 + 1] == 1;
                if (class28.field380 != null) {
                    class238 var105 = class28.field380.method2761((long) var103, (byte) -112);
                    if (var105 != null && !var104) {
                        var105.method1510((byte) -13);
                        return;
                    }
                    if (var105 == null && var104) {
                        class238 var106 = new class238();
                        class28.field380.method2767(-1, (long) var103, var106);
                    }
                }
                return;
            }
            if (arg0 == 5232) {
                int var107 = field4221[--field4234];
                if (class28.field380 != null) {
                    class238 var108 = class28.field380.method2761((long) var107, (byte) -112);
                    field4221[field4234++] = var108 == null ? 0 : 1;
                    return;
                }
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 5233) {
                field4234 -= 2;
                int var109 = field4221[field4234];
                boolean var110 = field4221[field4234 + 1] == 1;
                if (class201.field2962 != null) {
                    class238 var111 = class201.field2962.method2761((long) var109, (byte) -112);
                    if (var111 != null && !var110) {
                        var111.method1510((byte) -13);
                        return;
                    }
                    if (var111 == null && var110) {
                        class238 var112 = new class238();
                        class201.field2962.method2767(-1, (long) var109, var112);
                    }
                }
                return;
            }
            if (arg0 == 5234) {
                int var113 = field4221[--field4234];
                if (class201.field2962 != null) {
                    class238 var114 = class201.field2962.method2761((long) var113, (byte) -112);
                    field4221[field4234++] = var114 == null ? 0 : 1;
                    return;
                }
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 5235) {
                field4221[field4234++] = class395.field5606 == null ? -1 : class395.field5606.field2578;
                return;
            }
        } else if (arg0 < 5400) {
            if (arg0 == 5300) {
                field4234 -= 2;
                int var115 = field4221[field4234];
                int var116 = field4221[field4234 + 1];
                class327.method2075(3, var116, 0, false, var115);
                field4221[field4234++] = class86.field1045 == null ? 0 : 1;
                return;
            }
            if (arg0 == 5301) {
                if (class86.field1045 != null) {
                    class327.method2075(class314.field4438.field5800, -1, 0, false, -1);
                }
                return;
            }
            if (arg0 == 5302) {
                class150[] var117 = class141.method888(23654);
                field4221[field4234++] = var117.length;
                return;
            }
            if (arg0 == 5303) {
                int var118 = field4221[--field4234];
                class150[] var119 = class141.method888(23654);
                field4221[field4234++] = var119[var118].field2240;
                field4221[field4234++] = var119[var118].field2241;
                return;
            }
            if (arg0 == 5305) {
                int var120 = class314.field4438.field5799;
                int var121 = class314.field4438.field5790;
                int var122 = -1;
                class150[] var123 = class141.method888(23654);
                for (int var124 = 0; var124 < var123.length; var124++) {
                    class150 var125 = var123[var124];
                    if (var125.field2240 == var120 && var125.field2241 == var121) {
                        var122 = var124;
                        break;
                    }
                }
                field4221[field4234++] = var122;
                return;
            }
            if (arg0 == 5306) {
                field4221[field4234++] = class262.method1624(16822);
                return;
            }
            if (arg0 == 5307) {
                int var126 = field4221[--field4234];
                if (var126 >= 1 && var126 <= 2) {
                    class327.method2075(var126, -1, 0, false, -1);
                    return;
                }
                return;
            }
            if (arg0 == 5308) {
                field4221[field4234++] = class314.field4438.field5800;
                return;
            }
            if (arg0 == 5309) {
                int var127 = field4221[--field4234];
                if (var127 >= 1 && var127 <= 2) {
                    class314.field4438.field5800 = var127;
                    class314.field4438.method1177(class252.field3718, (byte) 101);
                    return;
                }
                return;
            }
        } else if (arg0 < 5500) {
            if (arg0 == 5400) {
                field4230 -= 2;
                String var128 = field4214[field4230];
                String var129 = field4214[field4230 + 1];
                int var130 = field4221[--field4234];
                field4212++;
                class15.method110(class467.field6585, -127);
                class225.field3415.method1753(true, class89.method501(var128, true) + class89.method501(var129, true) + 1);
                class225.field3415.method1730(-11508, var128);
                class225.field3415.method1730(-11508, var129);
                class225.field3415.method1753(true, var130);
                return;
            }
            if (arg0 == 5401) {
                field4234 -= 2;
                class326.field4701[field4221[field4234]] = (short) class111.method711(87, field4221[field4234 + 1]);
                class64.field834.method2139(false);
                class64.field834.method2133(true);
                class265.field3859.method2804(337670243);
                class453.method2661((byte) 127);
                return;
            }
            if (arg0 == 5405) {
                field4234 -= 2;
                int var131 = field4221[field4234];
                int var132 = field4221[field4234 + 1];
                if (var131 >= 0 && var131 < 2) {
                    class244.field3631[var131] = new int[var132 << 1][4];
                }
                return;
            }
            if (arg0 == 5406) {
                field4234 -= 7;
                int var133 = field4221[field4234];
                int var134 = field4221[field4234 + 1] << 1;
                int var135 = field4221[field4234 + 2];
                int var136 = field4221[field4234 + 3];
                int var137 = field4221[field4234 + 4];
                int var138 = field4221[field4234 + 5];
                int var139 = field4221[field4234 + 6];
                if (var133 >= 0 && var133 < 2 && class244.field3631[var133] != null && var134 >= 0 && var134 < class244.field3631[var133].length) {
                    class244.field3631[var133][var134] = new int[] { (var135 >> 14 & 0x3FFF) * 128, var136, (var135 & 0x3FFF) * 128, var139 };
                    class244.field3631[var133][var134 + 1] = new int[] { (var137 >> 14 & 0x3FFF) * 128, var138, (var137 & 0x3FFF) * 128 };
                }
                return;
            }
            if (arg0 == 5407) {
                int var140 = class244.field3631[field4221[--field4234]].length >> 1;
                field4221[field4234++] = var140;
                return;
            }
            if (arg0 == 5411) {
                if (class86.field1045 != null) {
                    class327.method2075(class314.field4438.field5800, -1, 0, false, -1);
                }
                if (class239.field3589 != null) {
                    class48.method317((byte) -101);
                    System.exit(0);
                    return;
                }
                String var141 = class20.field274 == null ? class26.method188(-102) : class20.field274;
                class314.method1945(127, false, class437.field6083 == 1, class252.field3718, var141);
                return;
            }
            if (arg0 == 5419) {
                String var142 = "";
                if (class407.field5712 != null) {
                    if (class407.field5712.field5255 == null) {
                        var142 = class151.method953(class407.field5712.field5257, 16729301);
                    } else {
                        var142 = (String) class407.field5712.field5255;
                    }
                }
                field4214[field4230++] = var142;
                return;
            }
            if (arg0 == 5420) {
                field4221[field4234++] = class430.field6023 == 3 ? 1 : 0;
                return;
            }
            if (arg0 == 5421) {
                if (class86.field1045 != null) {
                    class327.method2075(class314.field4438.field5800, -1, 0, false, -1);
                }
                String var143 = field4214[--field4230];
                boolean var144 = field4221[--field4234] == 1;
                String var145 = class26.method188(-106) + var143;
                class314.method1945(126, var144, class437.field6083 == 1, class252.field3718, var145);
                return;
            }
            if (arg0 == 5422) {
                field4230 -= 2;
                String var146 = field4214[field4230];
                String var147 = field4214[field4230 + 1];
                int var148 = field4221[--field4234];
                if (var146.length() > 0) {
                    if (class71.field886 == null) {
                        class71.field886 = new String[class279.field4117[class456.field6416.field5091]];
                    }
                    class71.field886[var148] = var146;
                }
                if (var147.length() > 0) {
                    if (class453.field6388 == null) {
                        class453.field6388 = new String[class279.field4117[class456.field6416.field5091]];
                    }
                    class453.field6388[var148] = var147;
                }
                return;
            }
            if (arg0 == 5423) {
                System.out.println(field4214[--field4230]);
                return;
            }
            if (arg0 == 5424) {
                field4234 -= 11;
                class203.field3013 = field4221[field4234];
                class324.field4675 = field4221[field4234 + 1];
                class339.field4953 = field4221[field4234 + 2];
                class225.field3406 = field4221[field4234 + 3];
                class255.field3738 = field4221[field4234 + 4];
                class81.field987 = field4221[field4234 + 5];
                class364.field5238 = field4221[field4234 + 6];
                class216.field3250 = field4221[field4234 + 7];
                class392.field5562 = field4221[field4234 + 8];
                class241.field3614 = field4221[field4234 + 9];
                class208.field3174 = field4221[field4234 + 10];
                class407.field5716.method1230(-37, class255.field3738);
                class407.field5716.method1230(-34, class81.field987);
                class407.field5716.method1230(111, class364.field5238);
                class407.field5716.method1230(117, class216.field3250);
                class407.field5716.method1230(124, class392.field5562);
                class284.field4161 = null;
                class140.field1860 = null;
                class451.field6240 = null;
                class87.field1062 = null;
                class260.field3809 = null;
                class208.field3176 = null;
                class449.field6202 = null;
                class138.field1824 = null;
                class103.field1317 = true;
                return;
            }
            if (arg0 == 5425) {
                class276.method1751((byte) -114);
                class103.field1317 = false;
                return;
            }
            if (arg0 == 5426) {
                field4234 -= 2;
                class387.field5502 = field4221[field4234];
                class231.field3494 = field4221[field4234 + 1];
                return;
            }
            if (arg0 == 5427) {
                field4234 -= 2;
                class114.field1455 = field4221[field4234 + 1];
                return;
            }
            if (arg0 == 5428) {
                field4234 -= 2;
                int var149 = field4221[field4234];
                int var150 = field4221[field4234 + 1];
                field4221[field4234++] = class398.method2383(var150, -88, var149) ? 1 : 0;
                return;
            }
            if (arg0 == 5429) {
                class393.method2351(0, false, field4214[--field4230]);
                return;
            }
        } else if (arg0 < 5600) {
            if (arg0 == 5500) {
                field4234 -= 4;
                int var151 = field4221[field4234];
                int var152 = field4221[field4234 + 1];
                int var153 = field4221[field4234 + 2];
                int var154 = field4221[field4234 + 3];
                class125.method751(var152, -101, var153, (var151 >> 14 & 0x3FFF) - class240.field3602, false, (var151 & 0x3FFF) - class360.field5180, var154);
                return;
            }
            if (arg0 == 5501) {
                field4234 -= 4;
                int var155 = field4221[field4234];
                int var156 = field4221[field4234 + 1];
                int var157 = field4221[field4234 + 2];
                int var158 = field4221[field4234 + 3];
                class408.method2417(var156, var158, (var155 & 0x3FFF) - class360.field5180, var157, (var155 >> 14 & 0x3FFF) - class240.field3602, true);
                return;
            }
            if (arg0 == 5502) {
                field4234 -= 6;
                int var159 = field4221[field4234];
                if (var159 >= 2) {
                    throw new RuntimeException();
                }
                class161.field2380 = var159;
                int var160 = field4221[field4234 + 1];
                if (var160 + 1 >= class244.field3631[class161.field2380].length >> 1) {
                    throw new RuntimeException();
                }
                class44.field641 = var160;
                class178.field2554 = 0;
                class342.field4989 = field4221[field4234 + 2];
                class353.field5101 = field4221[field4234 + 3];
                int var161 = field4221[field4234 + 4];
                if (var161 >= 2) {
                    throw new RuntimeException();
                }
                class203.field3017 = var161;
                int var162 = field4221[field4234 + 5];
                if (var162 + 1 >= class244.field3631[class203.field3017].length >> 1) {
                    throw new RuntimeException();
                }
                class28.field379 = var162;
                class136.field1807 = 3;
                return;
            }
            if (arg0 == 5503) {
                class475.method2785(-12231);
                return;
            }
            if (arg0 == 5504) {
                field4234 -= 2;
                class206.method1349(0, 3, field4221[field4234 + 1], field4221[field4234]);
                return;
            }
            if (arg0 == 5505) {
                field4221[field4234++] = (int) class483.field6806 >> 3;
                return;
            }
            if (arg0 == 5506) {
                field4221[field4234++] = (int) class157.field2346 >> 3;
                return;
            }
            if (arg0 == 5507) {
                class320.method2051((byte) 94);
                return;
            }
            if (arg0 == 5508) {
                class396.method2381(127);
                return;
            }
            if (arg0 == 5509) {
                class43.method290(100);
                return;
            }
            if (arg0 == 5510) {
                class458.method2682(-128);
                return;
            }
            if (arg0 == 5511) {
                int var163 = field4221[--field4234];
                int var164 = var163 >> 14 & 0x3FFF;
                int var165 = var163 & 0x3FFF;
                int var166 = var164 - class240.field3602;
                if (var166 < 0) {
                    var166 = 0;
                } else if (var166 >= class58.field758) {
                    var166 = class58.field758;
                }
                int var167 = var165 - class360.field5180;
                if (var167 < 0) {
                    var167 = 0;
                } else if (var167 >= class287.field4181) {
                    var167 = class287.field4181;
                }
                class453.field6393 = var166 * 128 + 64;
                class317.field4596 = var167 * 128 + 64;
                class136.field1807 = 4;
                return;
            }
            if (arg0 == 5512) {
                class1.method1(12580);
                return;
            }
        } else if (arg0 < 5700) {
            if (arg0 == 5600) {
                field4230 -= 2;
                String var168 = field4214[field4230];
                String var169 = field4214[field4230 + 1];
                int var170 = field4221[--field4234];
                if (class363.field5227 != 10) {
                    return;
                }
                if (class401.field5680 == 0 && class278.field4092 == 0 && class120.field1507 == 0 && class408.field5725 == 0) {
                    class392.method2345(var170, 0, var168, var169);
                    return;
                }
                return;
            }
            if (arg0 == 5601) {
                class431.method2554(24);
                return;
            }
            if (arg0 == 5602) {
                if (class278.field4092 == 0) {
                    class22.field287 = -2;
                }
                return;
            }
            if (arg0 == 5603) {
                field4234 -= 4;
                if (class363.field5227 != 10) {
                    return;
                }
                if (class401.field5680 == 0 && class278.field4092 == 0 && class120.field1507 == 0 && class408.field5725 == 0) {
                    class337.method2128(field4221[field4234 + 3], (byte) -92, field4221[field4234], field4221[field4234 + 2], field4221[field4234 + 1]);
                    return;
                }
                return;
            }
            if (arg0 == 5604) {
                field4230--;
                if (class363.field5227 != 10) {
                    return;
                }
                if (class401.field5680 == 0 && class278.field4092 == 0 && class120.field1507 == 0 && class408.field5725 == 0) {
                    class88.method493(class240.method1523(field4214[field4230], (byte) 127), 117);
                    return;
                }
                return;
            }
            if (arg0 == 5605) {
                field4230 -= 3;
                field4234 -= 7;
                if (class363.field5227 != 10) {
                    return;
                }
                if (class401.field5680 == 0 && class278.field4092 == 0 && class120.field1507 == 0 && class408.field5725 == 0) {
                    client.method1128(-32672, field4214[field4230 + 1], field4221[field4234 + 2], class240.method1523(field4214[field4230], (byte) 123), field4221[field4234 + 4] == 1, field4221[field4234 + 5] == 1, field4221[field4234], field4214[field4230 + 2], field4221[field4234 + 1], field4221[field4234 + 6] == 1, field4221[field4234 + 3]);
                    return;
                }
                return;
            }
            if (arg0 == 5606) {
                if (class120.field1507 == 0) {
                    class355.field5138 = -2;
                }
                return;
            }
            if (arg0 == 5607) {
                field4221[field4234++] = class22.field287;
                return;
            }
            if (arg0 == 5608) {
                field4221[field4234++] = class346.field5022;
                return;
            }
            if (arg0 == 5609) {
                field4221[field4234++] = class355.field5138;
                return;
            }
            if (arg0 == 5610) {
                for (int var171 = 0; var171 < 5; var171++) {
                    field4214[field4230++] = class237.field3562.length > var171 ? class356.method2215(1, class237.field3562[var171]) : "";
                }
                class237.field3562 = null;
                return;
            }
            if (arg0 == 5611) {
                field4221[field4234++] = class267.field3909;
                return;
            }
        } else if (arg0 < 6100) {
            if (arg0 == 6001) {
                int var172 = field4221[--field4234];
                if (var172 < 1) {
                    var172 = 1;
                }
                if (var172 > 4) {
                    var172 = 4;
                }
                class314.field4438.field5802 = var172;
                class126.method792(true);
                class314.field4438.method1177(class252.field3718, (byte) 107);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6002) {
                class314.field4438.method1175(false, field4221[--field4234] == 1);
                class126.method792(true);
                class251.method1569(true);
                class314.field4438.method1177(class252.field3718, (byte) 127);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6003) {
                class314.field4438.field5795 = field4221[--field4234] == 1;
                class251.method1569(true);
                class314.field4438.method1177(class252.field3718, (byte) 123);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6005) {
                class314.field4438.field5801 = field4221[--field4234] == 1;
                class126.method792(true);
                class314.field4438.method1177(class252.field3718, (byte) 121);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6006) {
                class314.field4438.field5775 = field4221[--field4234] == 1;
                class141.field1878.method668(!class314.field4438.field5775);
                class314.field4438.method1177(class252.field3718, (byte) 109);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6007) {
                class314.field4438.field5773 = field4221[--field4234];
                class314.field4438.method1177(class252.field3718, (byte) 114);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6008) {
                class314.field4438.field5783 = field4221[--field4234] == 1;
                class314.field4438.method1177(class252.field3718, (byte) 112);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6009) {
                class314.field4438.field5780 = field4221[--field4234] == 1;
                class126.method792(true);
                class314.field4438.method1177(class252.field3718, (byte) 95);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6010) {
                class314.field4438.field5797 = field4221[--field4234] == 1;
                class314.field4438.method1177(class252.field3718, (byte) 112);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6011) {
                int var173 = field4221[--field4234];
                if (var173 < 0 || var173 > 2) {
                    var173 = 0;
                }
                class314.field4438.field5776 = var173;
                class126.method792(true);
                class314.field4438.method1177(class252.field3718, (byte) 120);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6012) {
                class314.field4438.field5779 = field4221[--field4234] == 1;
                class170.method1055((byte) 94);
                class314.field4438.method1177(class252.field3718, (byte) 102);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6014) {
                class314.field4438.field5791 = field4221[--field4234] == 1;
                class126.method792(true);
                class314.field4438.method1177(class252.field3718, (byte) 105);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6015) {
                class314.field4438.field5772 = field4221[--field4234] == 1;
                class126.method792(true);
                class314.field4438.method1177(class252.field3718, (byte) 98);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6016) {
                int var174 = field4221[--field4234];
                if (var174 < 0 || var174 > 2) {
                    var174 = 0;
                }
                class314.field4438.field5778 = var174;
                class224.method1437((byte) 116);
                class314.field4438.method1177(class252.field3718, (byte) 96);
                return;
            }
            if (arg0 == 6017) {
                class314.field4438.field5777 = field4221[--field4234] == 1;
                class99.method563(117);
                class314.field4438.method1177(class252.field3718, (byte) 101);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6018) {
                int var175 = field4221[--field4234];
                if (var175 < 0) {
                    var175 = 0;
                }
                if (var175 > 127) {
                    var175 = 127;
                }
                class314.field4438.field5798 = var175;
                class314.field4438.method1177(class252.field3718, (byte) 116);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6019) {
                int var176 = field4221[--field4234];
                if (var176 < 0) {
                    var176 = 0;
                }
                if (var176 > 255) {
                    var176 = 255;
                }
                if (class314.field4438.field5794 != var176) {
                    if (class314.field4438.field5794 == 0 && class268.field3923 != -1) {
                        class273.method1674(var176, class360.field5189, 111, class268.field3923, false, 0);
                        class420.field5875 = false;
                    } else if (var176 == 0) {
                        class2.method11((byte) 78);
                        class420.field5875 = false;
                    } else {
                        class284.method1785(var176, 16260);
                    }
                    class314.field4438.field5794 = var176;
                }
                class314.field4438.method1177(class252.field3718, (byte) 97);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6020) {
                int var177 = field4221[--field4234];
                if (var177 < 0) {
                    var177 = 0;
                }
                if (var177 > 127) {
                    var177 = 127;
                }
                class314.field4438.field5771 = var177;
                class314.field4438.method1177(class252.field3718, (byte) 96);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6021) {
                class314.field4438.field2825 = field4221[--field4234] == 1;
                class251.method1569(true);
                return;
            }
            if (arg0 == 6023) {
                int var178 = field4221[--field4234];
                boolean var179 = false;
                if (var178 < 0) {
                    var178 = 0;
                }
                if (var178 > 2) {
                    var178 = 2;
                }
                if (class347.field5026 < 96) {
                    var178 = 0;
                    var179 = true;
                }
                class467.method2747(var178, (byte) 56);
                class314.field4438.method1177(class252.field3718, (byte) 112);
                class160.field2370 = false;
                field4221[field4234++] = var179 ? 0 : 1;
                return;
            }
            if (arg0 == 6024) {
                int var180 = field4221[--field4234];
                if (var180 < 0 || var180 > 2) {
                    var180 = 0;
                }
                class314.field4438.field5785 = var180;
                class314.field4438.method1177(class252.field3718, (byte) 110);
                return;
            }
            if (arg0 == 6025) {
                int var181 = field4221[--field4234];
                if (var181 < 0 || var181 > class284.method1787(class347.field5026, (byte) 82)) {
                    var181 = 0;
                }
                class314.field4438.field5792 = var181;
                class314.field4438.method1177(class252.field3718, (byte) 112);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6027) {
                int var182 = field4221[--field4234];
                if (var182 < 0 || var182 > 1) {
                    var182 = 0;
                }
                class475.method2787(24827, var182 == 1);
                return;
            }
            if (arg0 == 6028) {
                class314.field4438.field5788 = field4221[--field4234] != 0;
                class314.field4438.method1177(class252.field3718, (byte) 124);
                return;
            }
            if (arg0 == 6029) {
                class314.field4438.field5773 = field4221[--field4234];
                class314.field4438.method1177(class252.field3718, (byte) 119);
                return;
            }
            if (arg0 == 6030) {
                class314.field4438.field5774 = field4221[--field4234] != 0;
                class314.field4438.method1177(class252.field3718, (byte) 114);
                class126.method792(true);
                return;
            }
            if (arg0 == 6031) {
                int var183 = field4221[--field4234];
                if (var183 < 0 || var183 > 3) {
                    var183 = 2;
                }
                class51.method330(var183, (byte) -88);
                return;
            }
            if (arg0 == 6032) {
                int var184 = field4221[--field4234];
                if (var184 < 0 || var184 > 3) {
                    var184 = 2;
                }
                class314.field4438.field5787 = var184;
                class314.field4438.method1177(class252.field3718, (byte) 123);
                class160.field2370 = false;
                return;
            }
            if (arg0 == 6033) {
                int var185 = field4221[--field4234];
                if (var185 < 0 || var185 > 4) {
                    var185 = 2;
                }
                class314.field4438.field5789 = var185;
                class314.field4438.method1177(class252.field3718, (byte) 103);
                return;
            }
            if (arg0 == 6035) {
                class314.field4438.field2818 = field4221[--field4234] == 1;
                class126.method792(true);
                class251.method1569(true);
                return;
            }
        } else if (arg0 < 6200) {
            if (arg0 == 6101) {
                field4221[field4234++] = class314.field4438.field5802;
                return;
            }
            if (arg0 == 6102) {
                field4221[field4234++] = class314.field4438.method1171(class437.field6083, (byte) -116) ? 1 : 0;
                return;
            }
            if (arg0 == 6103) {
                field4221[field4234++] = class314.field4438.field5795 ? 1 : 0;
                return;
            }
            if (arg0 == 6105) {
                field4221[field4234++] = class314.field4438.field5801 ? 1 : 0;
                return;
            }
            if (arg0 == 6106) {
                field4221[field4234++] = class314.field4438.field5775 ? 1 : 0;
                return;
            }
            if (arg0 == 6107) {
                field4221[field4234++] = class314.field4438.field5773;
                return;
            }
            if (arg0 == 6108) {
                field4221[field4234++] = class314.field4438.field5783 ? 1 : 0;
                return;
            }
            if (arg0 == 6109) {
                field4221[field4234++] = class314.field4438.field5780 ? 1 : 0;
                return;
            }
            if (arg0 == 6110) {
                field4221[field4234++] = class314.field4438.field5797 ? 1 : 0;
                return;
            }
            if (arg0 == 6111) {
                field4221[field4234++] = class314.field4438.field5776;
                return;
            }
            if (arg0 == 6112) {
                field4221[field4234++] = class314.field4438.field5779 ? 1 : 0;
                return;
            }
            if (arg0 == 6114) {
                field4221[field4234++] = class314.field4438.field5791 ? 1 : 0;
                return;
            }
            if (arg0 == 6115) {
                field4221[field4234++] = class314.field4438.field5772 ? 1 : 0;
                return;
            }
            if (arg0 == 6116) {
                field4221[field4234++] = class314.field4438.field5778;
                return;
            }
            if (arg0 == 6117) {
                field4221[field4234++] = class314.field4438.field5777 ? 1 : 0;
                return;
            }
            if (arg0 == 6118) {
                field4221[field4234++] = class314.field4438.field5798;
                return;
            }
            if (arg0 == 6119) {
                field4221[field4234++] = class314.field4438.field5794;
                return;
            }
            if (arg0 == 6120) {
                field4221[field4234++] = class314.field4438.field5771;
                return;
            }
            if (arg0 == 6121) {
                field4221[field4234++] = class141.field1878.method598() ? 1 : 0;
                return;
            }
            if (arg0 == 6123) {
                field4221[field4234++] = class19.method128(125);
                return;
            }
            if (arg0 == 6124) {
                field4221[field4234++] = class314.field4438.field5785;
                return;
            }
            if (arg0 == 6125) {
                field4221[field4234++] = class314.field4438.field5792;
                return;
            }
            if (arg0 == 6126) {
                field4221[field4234++] = class141.field1878.method603() ? 1 : 0;
                return;
            }
            if (arg0 == 6127) {
                field4221[field4234++] = class314.field4438.field5793 ? 1 : 0;
                return;
            }
            if (arg0 == 6128) {
                field4221[field4234++] = class314.field4438.field5788 ? 1 : 0;
                return;
            }
            if (arg0 == 6129) {
                field4221[field4234++] = class314.field4438.field5773;
                return;
            }
            if (arg0 == 6130) {
                field4221[field4234++] = class314.field4438.field5774 ? 1 : 0;
                return;
            }
            if (arg0 == 6131) {
                field4221[field4234++] = class437.field6083;
                return;
            }
            if (arg0 == 6132) {
                field4221[field4234++] = class314.field4438.field5787;
                return;
            }
            if (arg0 == 6133) {
                field4221[field4234++] = class430.field6023 == 1 || class430.field6023 == 4 ? 1 : 0;
                return;
            }
            if (arg0 == 6134) {
                field4221[field4234++] = class284.method1787(class347.field5026, (byte) 114);
                return;
            }
            if (arg0 == 6135) {
                field4221[field4234++] = class314.field4438.field5789;
                return;
            }
        } else if (arg0 < 6300) {
            if (arg0 == 6200) {
                field4234 -= 2;
                class146.field2097 = (short) field4221[field4234];
                if (class146.field2097 <= 0) {
                    class146.field2097 = 256;
                }
                class55.field744 = (short) field4221[field4234 + 1];
                if (class55.field744 <= 0) {
                    class55.field744 = 205;
                }
                return;
            }
            if (arg0 == 6201) {
                field4234 -= 2;
                class293.field4248 = (short) field4221[field4234];
                if (class293.field4248 <= 0) {
                    class293.field4248 = 256;
                }
                class307.field4365 = (short) field4221[field4234 + 1];
                if (class307.field4365 <= 0) {
                    class307.field4365 = 320;
                }
                return;
            }
            if (arg0 == 6202) {
                field4234 -= 4;
                class413.field5815 = (short) field4221[field4234];
                if (class413.field5815 <= 0) {
                    class413.field5815 = 1;
                }
                class213.field3216 = (short) field4221[field4234 + 1];
                if (class213.field3216 <= 0) {
                    class213.field3216 = 32767;
                } else if (class213.field3216 < class413.field5815) {
                    class213.field3216 = class413.field5815;
                }
                class441.field6124 = (short) field4221[field4234 + 2];
                if (class441.field6124 <= 0) {
                    class441.field6124 = 1;
                }
                class488.field6874 = (short) field4221[field4234 + 3];
                if (class488.field6874 <= 0) {
                    class488.field6874 = 32767;
                    return;
                }
                if (class488.field6874 < class441.field6124) {
                    class488.field6874 = class441.field6124;
                }
                return;
            }
            if (arg0 == 6203) {
                class435.method2568(class197.field2876.field2021, 0, 334, 0, false, class197.field2876.field2010);
                field4221[field4234++] = class218.field3268;
                field4221[field4234++] = class280.field4134;
                return;
            }
            if (arg0 == 6204) {
                field4221[field4234++] = class293.field4248;
                field4221[field4234++] = class307.field4365;
                return;
            }
            if (arg0 == 6205) {
                field4221[field4234++] = class146.field2097;
                field4221[field4234++] = class55.field744;
                return;
            }
        } else if (arg0 < 6400) {
            if (arg0 == 6300) {
                field4221[field4234++] = (int) (class433.method2562(-2039) / 60000L);
                return;
            }
            if (arg0 == 6301) {
                field4221[field4234++] = (int) (class433.method2562(-2039) / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6302) {
                field4234 -= 3;
                int var186 = field4221[field4234];
                int var187 = field4221[field4234 + 1];
                int var188 = field4221[field4234 + 2];
                field4229.clear();
                field4229.set(11, 12);
                field4229.set(var188, var187, var186);
                field4221[field4234++] = (int) (field4229.getTime().getTime() / 86400000L) - 11745;
                return;
            }
            if (arg0 == 6303) {
                field4229.clear();
                field4229.setTime(new Date(class433.method2562(-2039)));
                field4221[field4234++] = field4229.get(1);
                return;
            }
            if (arg0 == 6304) {
                int var189 = field4221[--field4234];
                boolean var190 = true;
                if (var189 < 0) {
                    var190 = (var189 + 1) % 4 == 0;
                } else if (var189 < 1582) {
                    var190 = var189 % 4 == 0;
                } else if (var189 % 4 != 0) {
                    var190 = false;
                } else if (var189 % 100 != 0) {
                    var190 = true;
                } else if (var189 % 400 != 0) {
                    var190 = false;
                }
                field4221[field4234++] = var190 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6500) {
            if (arg0 == 6405) {
                field4221[field4234++] = class177.method1085((byte) 35) ? 1 : 0;
                return;
            }
            if (arg0 == 6406) {
                field4221[field4234++] = class295.method1830(-1) ? 1 : 0;
                return;
            }
        } else if (arg0 < 6600) {
            if (arg0 == 6500) {
                if (class363.field5227 == 10 && class401.field5680 == 0 && class278.field4092 == 0 && class120.field1507 == 0) {
                    field4221[field4234++] = class118.method733(27106) == -1 ? 0 : 1;
                    return;
                }
                field4221[field4234++] = 1;
                return;
            }
            if (arg0 == 6501) {
                class42 var191 = class289.method1809((byte) -23);
                if (var191 != null) {
                    field4221[field4234++] = var191.field620;
                    field4221[field4234++] = var191.field4604;
                    field4214[field4230++] = var191.field618;
                    class303 var192 = var191.method285((byte) 112);
                    field4221[field4234++] = var192.field4309;
                    field4214[field4230++] = var192.field4307;
                    field4221[field4234++] = var191.field4618;
                    field4221[field4234++] = var191.field622;
                    return;
                }
                field4221[field4234++] = -1;
                field4221[field4234++] = 0;
                field4214[field4230++] = "";
                field4221[field4234++] = 0;
                field4214[field4230++] = "";
                field4221[field4234++] = 0;
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 6502) {
                class42 var193 = class128.method798((byte) 34);
                if (var193 != null) {
                    field4221[field4234++] = var193.field620;
                    field4221[field4234++] = var193.field4604;
                    field4214[field4230++] = var193.field618;
                    class303 var194 = var193.method285((byte) 30);
                    field4221[field4234++] = var194.field4309;
                    field4214[field4230++] = var194.field4307;
                    field4221[field4234++] = var193.field4618;
                    field4221[field4234++] = var193.field622;
                    return;
                }
                field4221[field4234++] = -1;
                field4221[field4234++] = 0;
                field4214[field4230++] = "";
                field4221[field4234++] = 0;
                field4214[field4230++] = "";
                field4221[field4234++] = 0;
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 6503) {
                int var195 = field4221[--field4234];
                if (class363.field5227 == 10 && class401.field5680 == 0 && class278.field4092 == 0 && class120.field1507 == 0) {
                    field4221[field4234++] = class488.method2859(var195, 32767) ? 1 : 0;
                    return;
                }
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 6504) {
                class314.field4438.field5796 = field4221[--field4234];
                class314.field4438.method1177(class252.field3718, (byte) 125);
                return;
            }
            if (arg0 == 6505) {
                field4221[field4234++] = class314.field4438.field5796;
                return;
            }
            if (arg0 == 6506) {
                int var196 = field4221[--field4234];
                class42 var197 = class76.method442(var196, 0);
                if (var197 != null) {
                    field4221[field4234++] = var197.field4604;
                    field4214[field4230++] = var197.field618;
                    class303 var198 = var197.method285((byte) 112);
                    field4221[field4234++] = var198.field4309;
                    field4214[field4230++] = var198.field4307;
                    field4221[field4234++] = var197.field4618;
                    field4221[field4234++] = var197.field622;
                    return;
                }
                field4221[field4234++] = -1;
                field4214[field4230++] = "";
                field4221[field4234++] = 0;
                field4214[field4230++] = "";
                field4221[field4234++] = 0;
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 6507) {
                field4234 -= 4;
                int var199 = field4221[field4234];
                boolean var200 = field4221[field4234 + 1] == 1;
                int var201 = field4221[field4234 + 2];
                boolean var202 = field4221[field4234 + 3] == 1;
                class197.method1198(var201, var202, var199, (byte) 104, var200);
                return;
            }
            if (arg0 == 6508) {
                class280.method1770(4);
                return;
            }
            if (arg0 == 6509) {
                if (class363.field5227 != 10) {
                    return;
                }
                class466.field6560 = field4221[--field4234] == 1;
                return;
            }
        } else if (arg0 < 6700) {
            if (arg0 == 6600) {
                class314.field4438.field5782 = field4221[--field4234] == 1;
                class314.field4438.method1177(class252.field3718, (byte) 114);
                return;
            }
            if (arg0 == 6601) {
                field4221[field4234++] = class314.field4438.field5782 ? 1 : 0;
                return;
            }
        } else if (arg0 < 6800 && class368.field5315 == class120.field1504) {
            if (arg0 == 6700) {
                int var203 = class146.field2146.method2762(0);
                if (class36.field472 != -1) {
                    var203++;
                }
                field4221[field4234++] = var203;
                return;
            }
            if (arg0 == 6701) {
                int var204 = field4221[--field4234];
                if (class36.field472 != -1) {
                    if (var204 == 0) {
                        field4221[field4234++] = class36.field472;
                        return;
                    }
                    var204--;
                }
                class465 var205 = (class465) class146.field2146.method2769((byte) -83);
                while (var204-- > 0) {
                    var205 = (class465) class146.field2146.method2768((byte) -88);
                }
                field4221[field4234++] = var205.field6502;
                return;
            }
            if (arg0 == 6702) {
                int var206 = field4221[--field4234];
                if (class112.field1421[var206] == null) {
                    field4214[field4230++] = "";
                    return;
                }
                String var207 = class112.field1421[var206][0].field1965;
                if (var207 == null) {
                    field4214[field4230++] = "";
                    return;
                }
                field4214[field4230++] = var207.substring(0, var207.indexOf(58));
                return;
            }
            if (arg0 == 6703) {
                int var208 = field4221[--field4234];
                if (class112.field1421[var208] == null) {
                    field4221[field4234++] = 0;
                    return;
                }
                field4221[field4234++] = class112.field1421[var208].length;
                return;
            }
            if (arg0 == 6704) {
                field4234 -= 2;
                int var209 = field4221[field4234];
                int var210 = field4221[field4234 + 1];
                if (class112.field1421[var209] == null) {
                    field4214[field4230++] = "";
                    return;
                }
                String var211 = class112.field1421[var209][var210].field1965;
                if (var211 == null) {
                    field4214[field4230++] = "";
                    return;
                }
                field4214[field4230++] = var211;
                return;
            }
            if (arg0 == 6705) {
                field4234 -= 2;
                int var212 = field4221[field4234];
                int var213 = field4221[field4234 + 1];
                if (class112.field1421[var212] == null) {
                    field4221[field4234++] = 0;
                    return;
                }
                field4221[field4234++] = class112.field1421[var212][var213].field2054;
                return;
            }
            if (arg0 == 6706) {
                return;
            }
            if (arg0 == 6707) {
                field4234 -= 3;
                int var214 = field4221[field4234];
                int var215 = field4221[field4234 + 1];
                int var216 = field4221[field4234 + 2];
                class245.method1539("", 1, var216, 3188, var214 << 16 | var215);
                return;
            }
            if (arg0 == 6708) {
                field4234 -= 3;
                int var217 = field4221[field4234];
                int var218 = field4221[field4234 + 1];
                int var219 = field4221[field4234 + 2];
                class245.method1539("", 2, var219, 3188, var217 << 16 | var218);
                return;
            }
            if (arg0 == 6709) {
                field4234 -= 3;
                int var220 = field4221[field4234];
                int var221 = field4221[field4234 + 1];
                int var222 = field4221[field4234 + 2];
                class245.method1539("", 3, var222, 3188, var220 << 16 | var221);
                return;
            }
            if (arg0 == 6710) {
                field4234 -= 3;
                int var223 = field4221[field4234];
                int var224 = field4221[field4234 + 1];
                int var225 = field4221[field4234 + 2];
                class245.method1539("", 4, var225, 3188, var223 << 16 | var224);
                return;
            }
            if (arg0 == 6711) {
                field4234 -= 3;
                int var226 = field4221[field4234];
                int var227 = field4221[field4234 + 1];
                int var228 = field4221[field4234 + 2];
                class245.method1539("", 5, var228, 3188, var226 << 16 | var227);
                return;
            }
            if (arg0 == 6712) {
                field4234 -= 3;
                int var229 = field4221[field4234];
                int var230 = field4221[field4234 + 1];
                int var231 = field4221[field4234 + 2];
                class245.method1539("", 6, var231, 3188, var229 << 16 | var230);
                return;
            }
            if (arg0 == 6713) {
                field4234 -= 3;
                int var232 = field4221[field4234];
                int var233 = field4221[field4234 + 1];
                int var234 = field4221[field4234 + 2];
                class245.method1539("", 7, var234, 3188, var232 << 16 | var233);
                return;
            }
            if (arg0 == 6714) {
                field4234 -= 3;
                int var235 = field4221[field4234];
                int var236 = field4221[field4234 + 1];
                int var237 = field4221[field4234 + 2];
                class245.method1539("", 8, var237, 3188, var235 << 16 | var236);
                return;
            }
            if (arg0 == 6715) {
                field4234 -= 3;
                int var238 = field4221[field4234];
                int var239 = field4221[field4234 + 1];
                int var240 = field4221[field4234 + 2];
                class245.method1539("", 9, var240, 3188, var238 << 16 | var239);
                return;
            }
            if (arg0 == 6716) {
                field4234 -= 3;
                int var241 = field4221[field4234];
                int var242 = field4221[field4234 + 1];
                int var243 = field4221[field4234 + 2];
                class245.method1539("", 10, var243, 3188, var241 << 16 | var242);
                return;
            }
            if (arg0 == 6717) {
                field4234 -= 3;
                int var244 = field4221[field4234];
                int var245 = field4221[field4234 + 1];
                int var246 = field4221[field4234 + 2];
                class145 var247 = class441.method2598((byte) -127, var244 << 16 | var245, var246);
                class382.method2305(-122);
                class385 var248 = client.method1122(var247);
                class62.method386(var247.field1964, var247.field2059, var248.method2319(-2829), var244 << 16 | var245, var246, true, var248.field5469);
                return;
            }
        } else if (arg0 < 6900) {
            if (arg0 == 6800) {
                int var249 = field4221[--field4234];
                class19 var250 = class251.field3705.method490(36, var249);
                if (var250.field236 == null) {
                    field4214[field4230++] = "";
                    return;
                }
                field4214[field4230++] = var250.field236;
                return;
            }
            if (arg0 == 6801) {
                int var251 = field4221[--field4234];
                class19 var252 = class251.field3705.method490(36, var251);
                field4221[field4234++] = var252.field227;
                return;
            }
            if (arg0 == 6802) {
                int var253 = field4221[--field4234];
                class19 var254 = class251.field3705.method490(36, var253);
                field4221[field4234++] = var254.field250;
                return;
            }
            if (arg0 == 6803) {
                int var255 = field4221[--field4234];
                class19 var256 = class251.field3705.method490(36, var255);
                field4221[field4234++] = var256.field238;
                return;
            }
            if (arg0 == 6804) {
                field4234 -= 2;
                int var257 = field4221[field4234];
                int var258 = field4221[field4234 + 1];
                class467 var259 = class408.field5734.method1541(-94, var258);
                if (var259.method2745(-32)) {
                    field4214[field4230++] = class251.field3705.method490(36, var257).method131((byte) -107, var259.field6589, var258);
                    return;
                }
                field4221[field4234++] = class251.field3705.method490(36, var257).method126(var259.field6579, var258, 127);
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(IZ)V")
    private static final void method1811(int arg0, boolean arg1) {
        if (arg0 < 300) {
            if (arg0 == 100) {
                field4234 -= 3;
                int var2 = field4221[field4234];
                int var3 = field4221[field4234 + 1];
                int var4 = field4221[field4234 + 2];
                if (var3 == 0) {
                    throw new RuntimeException();
                }
                class145 var5 = class166.method1028(var2, 80);
                if (var5.field1943 == null) {
                    var5.field1943 = new class145[var4 + 1];
                }
                if (var5.field1943.length <= var4) {
                    class145[] var6 = new class145[var4 + 1];
                    for (int var7 = 0; var7 < var5.field1943.length; var7++) {
                        var6[var7] = var5.field1943[var7];
                    }
                    var5.field1943 = var6;
                }
                if (var4 > 0 && var5.field1943[var4 - 1] == null) {
                    throw new RuntimeException("Gap at:" + (var4 - 1));
                }
                class145 var8 = new class145();
                var8.field2073 = var3;
                var8.field1947 = var8.field1933 = var5.field1933;
                var8.field1951 = var4;
                var5.field1943[var4] = var8;
                if (arg1) {
                    field4222 = var8;
                } else {
                    field4235 = var8;
                }
                class22.method148((byte) -78, var5);
                return;
            }
            if (arg0 == 101) {
                class145 var9 = arg1 ? field4222 : field4235;
                if (var9.field1951 == -1) {
                    if (arg1) {
                        throw new RuntimeException("Tried to .cc_delete static .active-component!");
                    }
                    throw new RuntimeException("Tried to cc_delete static active-component!");
                }
                class145 var10 = class166.method1028(var9.field1933, 71);
                var10.field1943[var9.field1951] = null;
                class22.method148((byte) -78, var10);
                return;
            }
            if (arg0 == 102) {
                class145 var11 = class166.method1028(field4221[--field4234], 107);
                var11.field1943 = null;
                class22.method148((byte) -78, var11);
                return;
            }
            if (arg0 == 200) {
                field4234 -= 2;
                int var12 = field4221[field4234];
                int var13 = field4221[field4234 + 1];
                class145 var14 = class441.method2598((byte) -127, var12, var13);
                if (var14 != null && var13 != -1) {
                    field4221[field4234++] = 1;
                    if (arg1) {
                        field4222 = var14;
                        return;
                    }
                    field4235 = var14;
                    return;
                }
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 201) {
                int var15 = field4221[--field4234];
                class145 var16 = class166.method1028(var15, 99);
                if (var16 != null) {
                    field4221[field4234++] = 1;
                    if (arg1) {
                        field4222 = var16;
                        return;
                    }
                    field4235 = var16;
                    return;
                }
                field4221[field4234++] = 0;
                return;
            }
            if (arg0 == 202) {
                int var17 = field4221[--field4234];
                method1821(var17);
                return;
            }
            if (arg0 == 203) {
                int var18 = field4221[--field4234];
                method1814(var18);
                return;
            }
        } else if (arg0 < 500) {
            if (arg0 == 403) {
                field4234 -= 2;
                int var19 = field4221[field4234];
                int var20 = field4221[field4234 + 1];
                for (int var21 = 0; var21 < class160.field2368.length; var21++) {
                    if (class160.field2368[var21] == var19) {
                        class492.field6935.field6296.method833(86, class427.field5982, var20, var21);
                        return;
                    }
                }
                for (int var22 = 0; var22 < class168.field2458.length; var22++) {
                    if (class168.field2458[var22] == var19) {
                        class492.field6935.field6296.method833(123, class427.field5982, var20, var22);
                        return;
                    }
                }
                return;
            }
            if (arg0 == 404) {
                field4234 -= 2;
                int var23 = field4221[field4234];
                int var24 = field4221[field4234 + 1];
                class492.field6935.field6296.method836(var23, (byte) -120, var24);
                return;
            }
            if (arg0 == 410) {
                boolean var25 = field4221[--field4234] != 0;
                class492.field6935.field6296.method829(var25, (byte) 96);
                return;
            }
        } else if (arg0 >= 1000 && arg0 < 1100 || arg0 >= 2000 && arg0 < 2100) {
            class145 var26;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var26 = class166.method1028(field4221[--field4234], 114);
            } else {
                var26 = arg1 ? field4222 : field4235;
            }
            if (arg0 == 1000) {
                field4234 -= 4;
                var26.field1978 = field4221[field4234];
                var26.field1985 = field4221[field4234 + 1];
                int var27 = field4221[field4234 + 2];
                if (var27 < 0) {
                    var27 = 0;
                } else if (var27 > 5) {
                    var27 = 5;
                }
                int var28 = field4221[field4234 + 3];
                if (var28 < 0) {
                    var28 = 0;
                } else if (var28 > 5) {
                    var28 = 5;
                }
                var26.field2007 = (byte) var27;
                var26.field2067 = (byte) var28;
                class22.method148((byte) -78, var26);
                class403.method2400((byte) 43, var26);
                if (var26.field1951 == -1) {
                    class458.method2680(20577, var26.field1933);
                }
                return;
            }
            if (arg0 == 1001) {
                field4234 -= 4;
                var26.field2000 = field4221[field4234];
                var26.field2042 = field4221[field4234 + 1];
                var26.field1984 = 0;
                var26.field2055 = 0;
                int var29 = field4221[field4234 + 2];
                if (var29 < 0) {
                    var29 = 0;
                } else if (var29 > 4) {
                    var29 = 4;
                }
                int var30 = field4221[field4234 + 3];
                if (var30 < 0) {
                    var30 = 0;
                } else if (var30 > 4) {
                    var30 = 4;
                }
                var26.field2040 = (byte) var29;
                var26.field2006 = (byte) var30;
                class22.method148((byte) -78, var26);
                class403.method2400((byte) 73, var26);
                if (var26.field2073 == 0) {
                    class88.method495(false, var26, (byte) 92);
                }
                return;
            }
            if (arg0 == 1003) {
                boolean var31 = field4221[--field4234] == 1;
                if (var26.field1963 != var31) {
                    var26.field1963 = var31;
                    class22.method148((byte) -78, var26);
                }
                if (var26.field1951 == -1) {
                    class262.method1622(-23065, var26.field1933);
                }
                return;
            }
            if (arg0 == 1004) {
                field4234 -= 2;
                var26.field2039 = field4221[field4234];
                var26.field1997 = field4221[field4234 + 1];
                class22.method148((byte) -78, var26);
                class403.method2400((byte) 71, var26);
                if (var26.field2073 == 0) {
                    class88.method495(false, var26, (byte) 92);
                }
                return;
            }
            if (arg0 == 1005) {
                var26.field2063 = field4221[--field4234] == 1;
                return;
            }
        } else if (!(arg0 < 1100 || arg0 >= 1200) || !(arg0 < 2100 || arg0 >= 2200)) {
            class145 var32;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var32 = class166.method1028(field4221[--field4234], 125);
            } else {
                var32 = arg1 ? field4222 : field4235;
            }
            if (arg0 == 1100) {
                field4234 -= 2;
                var32.field2072 = field4221[field4234];
                if (var32.field2072 > var32.field2045 - var32.field2010) {
                    var32.field2072 = var32.field2045 - var32.field2010;
                }
                if (var32.field2072 < 0) {
                    var32.field2072 = 0;
                }
                var32.field1938 = field4221[field4234 + 1];
                if (var32.field1938 > var32.field1993 - var32.field2021) {
                    var32.field1938 = var32.field1993 - var32.field2021;
                }
                if (var32.field1938 < 0) {
                    var32.field1938 = 0;
                }
                class22.method148((byte) -78, var32);
                if (var32.field1951 == -1) {
                    class34.method229((byte) -100, var32.field1933);
                }
                return;
            }
            if (arg0 == 1101) {
                var32.field2001 = field4221[--field4234];
                class22.method148((byte) -78, var32);
                if (var32.field1951 == -1) {
                    class483.method2822(var32.field1933, 6);
                }
                return;
            }
            if (arg0 == 1102) {
                var32.field1941 = field4221[--field4234] == 1;
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1103) {
                var32.field1919 = field4221[--field4234];
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1104) {
                var32.field1927 = field4221[--field4234];
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1105) {
                int var33 = field4221[--field4234];
                if (var32.field1974 != var33) {
                    var32.field1974 = var33;
                    class22.method148((byte) -78, var32);
                }
                if (var32.field1951 == -1) {
                    class23.method166(var32.field1933, true);
                }
                return;
            }
            if (arg0 == 1106) {
                var32.field1983 = field4221[--field4234];
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1107) {
                var32.field2036 = field4221[--field4234] == 1;
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1108) {
                var32.field2061 = 1;
                var32.field1959 = field4221[--field4234];
                class22.method148((byte) -78, var32);
                if (var32.field1951 == -1) {
                    class392.method2347(4, var32.field1933);
                }
                return;
            }
            if (arg0 == 1109) {
                field4234 -= 6;
                var32.field2028 = field4221[field4234];
                var32.field1975 = field4221[field4234 + 1];
                var32.field2053 = field4221[field4234 + 2];
                var32.field1994 = field4221[field4234 + 3];
                var32.field1954 = field4221[field4234 + 4];
                var32.field2020 = field4221[field4234 + 5];
                class22.method148((byte) -78, var32);
                if (var32.field1951 == -1) {
                    class450.method2627(0, var32.field1933);
                    class363.method2246(var32.field1933, false);
                }
                return;
            }
            if (arg0 == 1110) {
                int var34 = field4221[--field4234];
                if (var32.field1967 != var34) {
                    var32.field1967 = var34;
                    var32.field2011 = 0;
                    var32.field2052 = 1;
                    var32.field1990 = 0;
                    class22.method148((byte) -78, var32);
                }
                if (var32.field1951 == -1) {
                    class203.method1264(false, var32.field1933);
                }
                return;
            }
            if (arg0 == 1111) {
                var32.field2031 = field4221[--field4234] == 1;
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1112) {
                String var35 = field4214[--field4230];
                if (!var35.equals(var32.field2035)) {
                    var32.field2035 = var35;
                    class22.method148((byte) -78, var32);
                }
                if (var32.field1951 == -1) {
                    class77.method446(var32.field1933, (byte) 122);
                }
                return;
            }
            if (arg0 == 1113) {
                var32.field1956 = field4221[--field4234];
                class22.method148((byte) -78, var32);
                if (var32.field1951 == -1) {
                    class166.method1029(var32.field1933, 0);
                }
                return;
            }
            if (arg0 == 1114) {
                field4234 -= 3;
                var32.field1992 = field4221[field4234];
                var32.field1950 = field4221[field4234 + 1];
                var32.field1987 = field4221[field4234 + 2];
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1115) {
                var32.field1957 = field4221[--field4234] == 1;
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1116) {
                var32.field1949 = field4221[--field4234];
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1117) {
                var32.field2075 = field4221[--field4234];
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1118) {
                var32.field1939 = field4221[--field4234] == 1;
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1119) {
                var32.field1958 = field4221[--field4234] == 1;
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1120) {
                field4234 -= 2;
                var32.field2045 = field4221[field4234];
                var32.field1993 = field4221[field4234 + 1];
                class22.method148((byte) -78, var32);
                if (var32.field2073 == 0) {
                    class88.method495(false, var32, (byte) 92);
                }
                return;
            }
            if (arg0 == 1121) {
                field4234 -= 2;
                var32.field1991 = (short) field4221[field4234];
                var32.field2009 = (short) field4221[field4234 + 1];
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1122) {
                var32.field2048 = field4221[--field4234] == 1;
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1123) {
                var32.field2020 = field4221[--field4234];
                class22.method148((byte) -78, var32);
                if (var32.field1951 == -1) {
                    class450.method2627(0, var32.field1933);
                }
                return;
            }
            if (arg0 == 1124) {
                int var36 = field4221[--field4234];
                var32.field2056 = var36 == 1;
                class22.method148((byte) -78, var32);
                return;
            }
            if (arg0 == 1125) {
                field4234 -= 2;
                var32.field2033 = field4221[field4234];
                var32.field2047 = field4221[field4234 + 1];
                class22.method148((byte) -78, var32);
                return;
            }
        } else if (arg0 >= 1200 && arg0 < 1300 || arg0 >= 2200 && arg0 < 2300) {
            class145 var37;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var37 = class166.method1028(field4221[--field4234], 126);
            } else {
                var37 = arg1 ? field4222 : field4235;
            }
            class22.method148((byte) -78, var37);
            if (arg0 == 1200 || arg0 == 1205 || arg0 == 1208 || arg0 == 1209 || arg0 == 1212 || arg0 == 1213) {
                field4234 -= 2;
                int var38 = field4221[field4234];
                int var39 = field4221[field4234 + 1];
                if (var37.field1951 == -1) {
                    class2.method13(var37.field1933, true);
                    class450.method2627(0, var37.field1933);
                    class363.method2246(var37.field1933, false);
                }
                if (var38 == -1) {
                    var37.field2061 = 1;
                    var37.field1959 = -1;
                    var37.field2016 = -1;
                    return;
                }
                var37.field2016 = var38;
                var37.field1948 = var39;
                if (arg0 == 1208 || arg0 == 1209) {
                    var37.field1986 = true;
                } else {
                    var37.field1986 = false;
                }
                class41 var40 = class64.field834.method2129(var38, false);
                var37.field2053 = var40.field582;
                var37.field1994 = var40.field576;
                var37.field1954 = var40.field550;
                var37.field2028 = var40.field535;
                var37.field1975 = var40.field580;
                var37.field2020 = var40.field591;
                if (arg0 == 1205 || arg0 == 1209) {
                    var37.field1952 = 0;
                } else if (arg0 == 1212 || arg0 == 1213) {
                    var37.field1952 = 1;
                } else {
                    var37.field1952 = 2;
                }
                if (var37.field1984 > 0) {
                    var37.field2020 = var37.field2020 * 32 / var37.field1984;
                    return;
                }
                if (var37.field2000 > 0) {
                    var37.field2020 = var37.field2020 * 32 / var37.field2000;
                }
                return;
            }
            if (arg0 == 1201) {
                var37.field2061 = 2;
                var37.field1959 = field4221[--field4234];
                if (var37.field1951 == -1) {
                    class392.method2347(4, var37.field1933);
                }
                return;
            }
            if (arg0 == 1202) {
                var37.field2061 = 3;
                var37.field1959 = -1;
                if (var37.field1951 == -1) {
                    class392.method2347(4, var37.field1933);
                }
                return;
            }
            if (arg0 == 1203) {
                var37.field2061 = 6;
                var37.field1959 = field4221[--field4234];
                if (var37.field1951 == -1) {
                    class392.method2347(4, var37.field1933);
                }
                return;
            }
            if (arg0 == 1204) {
                var37.field2061 = 5;
                var37.field1959 = field4221[--field4234];
                if (var37.field1951 == -1) {
                    class392.method2347(4, var37.field1933);
                }
                return;
            }
            if (arg0 == 1206) {
                field4234 -= 4;
                var37.field1940 = field4221[field4234];
                var37.field1998 = field4221[field4234 + 1];
                var37.field2074 = field4221[field4234 + 2];
                var37.field2069 = field4221[field4234 + 3];
                class22.method148((byte) -78, var37);
                return;
            }
            if (arg0 == 1207) {
                field4234 -= 2;
                var37.field2049 = field4221[field4234];
                var37.field1960 = field4221[field4234 + 1];
                class22.method148((byte) -78, var37);
                return;
            }
            if (arg0 == 1210) {
                field4234 -= 4;
                var37.field1959 = field4221[field4234];
                var37.field2013 = field4221[field4234 + 1];
                if (field4221[field4234 + 2] == 1) {
                    var37.field2061 = 9;
                } else {
                    var37.field2061 = 8;
                }
                if (field4221[field4234 + 3] == 1) {
                    var37.field1986 = true;
                } else {
                    var37.field1986 = false;
                }
                if (var37.field1951 == -1) {
                    class392.method2347(4, var37.field1933);
                }
                return;
            }
            if (arg0 == 1211) {
                var37.field2061 = 5;
                var37.field1959 = class295.field4273;
                var37.field2013 = 0;
                if (var37.field1951 == -1) {
                    class392.method2347(4, var37.field1933);
                }
                return;
            }
        } else if ((arg0 < 1300 || arg0 >= 1400) && (arg0 < 2300 || arg0 >= 2400)) {
            if (arg0 >= 1400 && arg0 < 1500 || arg0 >= 2400 && arg0 < 2500) {
                class145 var48;
                if (arg0 >= 2000) {
                    arg0 -= 1000;
                    var48 = class166.method1028(field4221[--field4234], 82);
                } else {
                    var48 = arg1 ? field4222 : field4235;
                }
                String var49 = field4214[--field4230];
                int[] var50 = null;
                if (var49.length() > 0 && var49.charAt(var49.length() - 1) == 'Y') {
                    int var51 = field4221[--field4234];
                    if (var51 > 0) {
                        var50 = new int[var51];
                        while (var51-- > 0) {
                            var50[var51] = field4221[--field4234];
                        }
                    }
                    var49 = var49.substring(0, var49.length() - 1);
                }
                Object[] var52 = new Object[var49.length() + 1];
                for (int var53 = var52.length - 1; var53 >= 1; var53--) {
                    if (var49.charAt(var53 - 1) == 's') {
                        var52[var53] = field4214[--field4230];
                    } else {
                        var52[var53] = Integer.valueOf(field4221[--field4234]);
                    }
                }
                int var54 = field4221[--field4234];
                if (var54 == -1) {
                    var52 = null;
                } else {
                    var52[0] = Integer.valueOf(var54);
                }
                if (arg0 == 1400) {
                    var48.field1942 = var52;
                } else if (arg0 == 1401) {
                    var48.field2015 = var52;
                } else if (arg0 == 1402) {
                    var48.field1981 = var52;
                } else if (arg0 == 1403) {
                    var48.field1955 = var52;
                } else if (arg0 == 1404) {
                    var48.field2027 = var52;
                } else if (arg0 == 1405) {
                    var48.field1989 = var52;
                } else if (arg0 == 1406) {
                    var48.field1931 = var52;
                } else if (arg0 == 1407) {
                    var48.field1996 = var52;
                    var48.field1970 = var50;
                } else if (arg0 == 1408) {
                    var48.field1924 = var52;
                } else if (arg0 == 1409) {
                    var48.field1929 = var52;
                } else if (arg0 == 1410) {
                    var48.field1918 = var52;
                } else if (arg0 == 1411) {
                    var48.field2008 = var52;
                } else if (arg0 == 1412) {
                    var48.field2076 = var52;
                } else if (arg0 == 1414) {
                    var48.field2057 = var52;
                    var48.field2012 = var50;
                } else if (arg0 == 1415) {
                    var48.field1945 = var52;
                    var48.field2019 = var50;
                } else if (arg0 == 1416) {
                    var48.field2037 = var52;
                } else if (arg0 == 1417) {
                    var48.field2026 = var52;
                } else if (arg0 == 1418) {
                    var48.field2003 = var52;
                } else if (arg0 == 1419) {
                    var48.field2068 = var52;
                } else if (arg0 == 1420) {
                    var48.field2046 = var52;
                } else if (arg0 == 1421) {
                    var48.field1922 = var52;
                } else if (arg0 == 1422) {
                    var48.field1925 = var52;
                } else if (arg0 == 1423) {
                    var48.field1966 = var52;
                } else if (arg0 == 1424) {
                    var48.field1999 = var52;
                } else if (arg0 == 1425) {
                    var48.field2060 = var52;
                } else if (arg0 == 1426) {
                    var48.field2018 = var52;
                } else if (arg0 == 1427) {
                    var48.field2050 = var52;
                } else if (arg0 == 1428) {
                    var48.field1923 = var52;
                    var48.field2025 = var50;
                } else if (arg0 == 1429) {
                    var48.field1979 = var52;
                    var48.field2065 = var50;
                }
                var48.field2029 = true;
                return;
            }
            if (arg0 < 1600) {
                class145 var55 = arg1 ? field4222 : field4235;
                if (arg0 == 1500) {
                    field4221[field4234++] = var55.field1971;
                    return;
                }
                if (arg0 == 1501) {
                    field4221[field4234++] = var55.field2041;
                    return;
                }
                if (arg0 == 1502) {
                    field4221[field4234++] = var55.field2010;
                    return;
                }
                if (arg0 == 1503) {
                    field4221[field4234++] = var55.field2021;
                    return;
                }
                if (arg0 == 1504) {
                    field4221[field4234++] = var55.field1963 ? 1 : 0;
                    return;
                }
                if (arg0 == 1505) {
                    field4221[field4234++] = var55.field1947;
                    return;
                }
            } else if (arg0 < 1700) {
                class145 var56 = arg1 ? field4222 : field4235;
                if (arg0 == 1600) {
                    field4221[field4234++] = var56.field2072;
                    return;
                }
                if (arg0 == 1601) {
                    field4221[field4234++] = var56.field1938;
                    return;
                }
                if (arg0 == 1602) {
                    field4214[field4230++] = var56.field2035;
                    return;
                }
                if (arg0 == 1603) {
                    field4221[field4234++] = var56.field2045;
                    return;
                }
                if (arg0 == 1604) {
                    field4221[field4234++] = var56.field1993;
                    return;
                }
                if (arg0 == 1605) {
                    field4221[field4234++] = var56.field2020;
                    return;
                }
                if (arg0 == 1606) {
                    field4221[field4234++] = var56.field2053;
                    return;
                }
                if (arg0 == 1607) {
                    field4221[field4234++] = var56.field1954;
                    return;
                }
                if (arg0 == 1608) {
                    field4221[field4234++] = var56.field1994;
                    return;
                }
                if (arg0 == 1609) {
                    field4221[field4234++] = var56.field1919;
                    return;
                }
                if (arg0 == 1610) {
                    field4221[field4234++] = var56.field2028;
                    return;
                }
                if (arg0 == 1611) {
                    field4221[field4234++] = var56.field1975;
                    return;
                }
                if (arg0 == 1612) {
                    field4221[field4234++] = var56.field1974;
                    return;
                }
            } else if (arg0 < 1800) {
                class145 var57 = arg1 ? field4222 : field4235;
                if (arg0 == 1700) {
                    field4221[field4234++] = var57.field2016;
                    return;
                }
                if (arg0 == 1701) {
                    if (var57.field2016 != -1) {
                        field4221[field4234++] = var57.field1948;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 1702) {
                    field4221[field4234++] = var57.field1951;
                    return;
                }
            } else if (arg0 < 1900) {
                class145 var58 = arg1 ? field4222 : field4235;
                if (arg0 == 1800) {
                    field4221[field4234++] = client.method1122(var58).method2319(-2829);
                    return;
                }
                if (arg0 == 1801) {
                    int var59 = field4221[--field4234];
                    int var315 = var59 - 1;
                    if (var58.field1920 != null && var315 < var58.field1920.length && var58.field1920[var315] != null) {
                        field4214[field4230++] = var58.field1920[var315];
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 1802) {
                    if (var58.field1928 == null) {
                        field4214[field4230++] = "";
                        return;
                    }
                    field4214[field4230++] = var58.field1928;
                    return;
                }
            } else if (arg0 < 2600) {
                class145 var60 = class166.method1028(field4221[--field4234], 85);
                if (arg0 == 2500) {
                    field4221[field4234++] = var60.field1971;
                    return;
                }
                if (arg0 == 2501) {
                    field4221[field4234++] = var60.field2041;
                    return;
                }
                if (arg0 == 2502) {
                    field4221[field4234++] = var60.field2010;
                    return;
                }
                if (arg0 == 2503) {
                    field4221[field4234++] = var60.field2021;
                    return;
                }
                if (arg0 == 2504) {
                    field4221[field4234++] = var60.field1963 ? 1 : 0;
                    return;
                }
                if (arg0 == 2505) {
                    field4221[field4234++] = var60.field1947;
                    return;
                }
            } else if (arg0 < 2700) {
                class145 var61 = class166.method1028(field4221[--field4234], 75);
                if (arg0 == 2600) {
                    field4221[field4234++] = var61.field2072;
                    return;
                }
                if (arg0 == 2601) {
                    field4221[field4234++] = var61.field1938;
                    return;
                }
                if (arg0 == 2602) {
                    field4214[field4230++] = var61.field2035;
                    return;
                }
                if (arg0 == 2603) {
                    field4221[field4234++] = var61.field2045;
                    return;
                }
                if (arg0 == 2604) {
                    field4221[field4234++] = var61.field1993;
                    return;
                }
                if (arg0 == 2605) {
                    field4221[field4234++] = var61.field2020;
                    return;
                }
                if (arg0 == 2606) {
                    field4221[field4234++] = var61.field2053;
                    return;
                }
                if (arg0 == 2607) {
                    field4221[field4234++] = var61.field1954;
                    return;
                }
                if (arg0 == 2608) {
                    field4221[field4234++] = var61.field1994;
                    return;
                }
                if (arg0 == 2609) {
                    field4221[field4234++] = var61.field1919;
                    return;
                }
                if (arg0 == 2610) {
                    field4221[field4234++] = var61.field2028;
                    return;
                }
                if (arg0 == 2611) {
                    field4221[field4234++] = var61.field1975;
                    return;
                }
                if (arg0 == 2612) {
                    field4221[field4234++] = var61.field1974;
                    return;
                }
            } else if (arg0 < 2800) {
                if (arg0 == 2700) {
                    class145 var62 = class166.method1028(field4221[--field4234], 72);
                    field4221[field4234++] = var62.field2016;
                    return;
                }
                if (arg0 == 2701) {
                    class145 var63 = class166.method1028(field4221[--field4234], 120);
                    if (var63.field2016 != -1) {
                        field4221[field4234++] = var63.field1948;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 2702) {
                    int var64 = field4221[--field4234];
                    class465 var65 = (class465) class146.field2146.method2761((long) var64, (byte) -112);
                    if (var65 != null) {
                        field4221[field4234++] = 1;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 2703) {
                    class145 var66 = class166.method1028(field4221[--field4234], 127);
                    if (var66.field1943 == null) {
                        field4221[field4234++] = 0;
                        return;
                    }
                    int var67 = var66.field1943.length;
                    for (int var68 = 0; var68 < var66.field1943.length; var68++) {
                        if (var66.field1943[var68] == null) {
                            var67 = var68;
                            break;
                        }
                    }
                    field4221[field4234++] = var67;
                    return;
                }
                if (arg0 == 2704 || arg0 == 2705) {
                    field4234 -= 2;
                    int var69 = field4221[field4234];
                    int var70 = field4221[field4234 + 1];
                    class465 var71 = (class465) class146.field2146.method2761((long) var69, (byte) -112);
                    if (var71 != null && var71.field6502 == var70) {
                        field4221[field4234++] = 1;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
            } else if (arg0 < 2900) {
                class145 var72 = class166.method1028(field4221[--field4234], 77);
                if (arg0 == 2800) {
                    field4221[field4234++] = client.method1122(var72).method2319(-2829);
                    return;
                }
                if (arg0 == 2801) {
                    int var73 = field4221[--field4234];
                    int var316 = var73 - 1;
                    if (var72.field1920 != null && var316 < var72.field1920.length && var72.field1920[var316] != null) {
                        field4214[field4230++] = var72.field1920[var316];
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 2802) {
                    if (var72.field1928 == null) {
                        field4214[field4230++] = "";
                        return;
                    }
                    field4214[field4230++] = var72.field1928;
                    return;
                }
            } else if (arg0 < 3200) {
                if (arg0 == 3100) {
                    String var74 = field4214[--field4230];
                    class139.method884(var74, 0);
                    return;
                }
                if (arg0 == 3101) {
                    field4234 -= 2;
                    class92.method527(class492.field6935, field4221[field4234 + 1], (byte) -84, field4221[field4234]);
                    return;
                }
                if (arg0 == 3103) {
                    class387.method2331(true, -364066936);
                    return;
                }
                if (arg0 == 3104) {
                    String var75 = field4214[--field4230];
                    int var76 = 0;
                    if (class452.method2638(-128, var75)) {
                        var76 = class151.method952(var75, 16046);
                    }
                    field4220++;
                    class15.method110(class86.field1043, -128);
                    class225.field3415.method1744(var76, true);
                    return;
                }
                if (arg0 == 3105) {
                    String var77 = field4214[--field4230];
                    field4236++;
                    class15.method110(class92.field1162, -125);
                    class225.field3415.method1753(true, var77.length() + 1);
                    class225.field3415.method1730(-11508, var77);
                    return;
                }
                if (arg0 == 3106) {
                    String var78 = field4214[--field4230];
                    field4218++;
                    class15.method110(class164.field2425, -125);
                    class225.field3415.method1753(true, var78.length() + 1);
                    class225.field3415.method1730(-11508, var78);
                    return;
                }
                if (arg0 == 3107) {
                    int var79 = field4221[--field4234];
                    String var80 = field4214[--field4230];
                    class213.method1379(-6, var80, var79);
                    return;
                }
                if (arg0 == 3108) {
                    field4234 -= 3;
                    int var81 = field4221[field4234];
                    int var82 = field4221[field4234 + 1];
                    int var83 = field4221[field4234 + 2];
                    class145 var84 = class166.method1028(var83, 119);
                    class44.method296(var84, var82, var81, (byte) 91);
                    return;
                }
                if (arg0 == 3109) {
                    field4234 -= 2;
                    int var85 = field4221[field4234];
                    int var86 = field4221[field4234 + 1];
                    class145 var87 = arg1 ? field4222 : field4235;
                    class44.method296(var87, var86, var85, (byte) 91);
                    return;
                }
                if (arg0 == 3110) {
                    int var88 = field4221[--field4234];
                    field4216++;
                    class15.method110(class209.field3180, -126);
                    class225.field3415.method1711(false, var88);
                    return;
                }
                if (arg0 == 3111) {
                    field4234 -= 2;
                    int var89 = field4221[field4234];
                    int var90 = field4221[field4234 + 1];
                    class465 var91 = (class465) class146.field2146.method2761((long) var89, (byte) -112);
                    if (var91 != null) {
                        class207.method1354(var91, true, -126, var91.field6502 != var90);
                    }
                    class411.method2435(var90, true, var89, 3, false);
                    return;
                }
                if (arg0 == 3112) {
                    field4234--;
                    int var92 = field4221[field4234];
                    class465 var93 = (class465) class146.field2146.method2761((long) var92, (byte) -112);
                    if (var93 != null && var93.field6500 == 3) {
                        class207.method1354(var93, true, -128, true);
                    }
                    return;
                }
            } else if (arg0 < 3300) {
                if (arg0 == 3200) {
                    field4234 -= 3;
                    class58.method354(field4221[field4234], field4221[field4234 + 1], 8, field4221[field4234 + 2], 255);
                    return;
                }
                if (arg0 == 3201) {
                    class302.method1881(field4221[--field4234], 255, (byte) -113, 50);
                    return;
                }
                if (arg0 == 3202) {
                    field4234 -= 2;
                    class314.method1942(field4221[field4234], 255, 75, field4221[field4234 + 1]);
                    return;
                }
                if (arg0 == 3203) {
                    field4234 -= 4;
                    class58.method354(field4221[field4234], field4221[field4234 + 1], 8, field4221[field4234 + 2], field4221[field4234 + 3]);
                    return;
                }
                if (arg0 == 3204) {
                    field4234 -= 3;
                    class302.method1881(field4221[field4234], field4221[field4234 + 1], (byte) 89, field4221[field4234 + 2]);
                    return;
                }
                if (arg0 == 3205) {
                    field4234 -= 3;
                    class314.method1942(field4221[field4234], field4221[field4234 + 2], 82, field4221[field4234 + 1]);
                    return;
                }
            } else if (arg0 < 3400) {
                if (arg0 == 3300) {
                    field4221[field4234++] = class353.field5090;
                    return;
                }
                if (arg0 == 3301) {
                    field4234 -= 2;
                    int var94 = field4221[field4234];
                    int var95 = field4221[field4234 + 1];
                    field4221[field4234++] = class169.method1044(var95, -44, var94, false);
                    return;
                }
                if (arg0 == 3302) {
                    field4234 -= 2;
                    int var96 = field4221[field4234];
                    int var97 = field4221[field4234 + 1];
                    field4221[field4234++] = class452.method2646(false, (byte) -108, var97, var96);
                    return;
                }
                if (arg0 == 3303) {
                    field4234 -= 2;
                    int var98 = field4221[field4234];
                    int var99 = field4221[field4234 + 1];
                    field4221[field4234++] = class48.method315(var99, false, var98, 12937);
                    return;
                }
                if (arg0 == 3304) {
                    int var100 = field4221[--field4234];
                    field4221[field4234++] = class58.field783.method595((byte) 23, var100).field5389;
                    return;
                }
                if (arg0 == 3305) {
                    int var101 = field4221[--field4234];
                    field4221[field4234++] = class29.field393[var101];
                    return;
                }
                if (arg0 == 3306) {
                    int var102 = field4221[--field4234];
                    field4221[field4234++] = class7.field69[var102];
                    return;
                }
                if (arg0 == 3307) {
                    int var103 = field4221[--field4234];
                    field4221[field4234++] = class473.field6653[var103];
                    return;
                }
                if (arg0 == 3308) {
                    byte var104 = class492.field6935.field4319;
                    int var105 = (class492.field6935.field4331 >> 7) + class240.field3602;
                    int var106 = (class492.field6935.field4317 >> 7) + class360.field5180;
                    field4221[field4234++] = (var104 << 28) + (var105 << 14) + var106;
                    return;
                }
                if (arg0 == 3309) {
                    int var107 = field4221[--field4234];
                    field4221[field4234++] = var107 >> 14 & 0x3FFF;
                    return;
                }
                if (arg0 == 3310) {
                    int var108 = field4221[--field4234];
                    field4221[field4234++] = var108 >> 28;
                    return;
                }
                if (arg0 == 3311) {
                    int var109 = field4221[--field4234];
                    field4221[field4234++] = var109 & 0x3FFF;
                    return;
                }
                if (arg0 == 3312) {
                    field4221[field4234++] = class39.field514 ? 1 : 0;
                    return;
                }
                if (arg0 == 3313) {
                    field4234 -= 2;
                    int var110 = field4221[field4234];
                    int var111 = field4221[field4234 + 1];
                    field4221[field4234++] = class169.method1044(var111, -78, var110, true);
                    return;
                }
                if (arg0 == 3314) {
                    field4234 -= 2;
                    int var112 = field4221[field4234];
                    int var113 = field4221[field4234 + 1];
                    field4221[field4234++] = class452.method2646(true, (byte) -108, var113, var112);
                    return;
                }
                if (arg0 == 3315) {
                    field4234 -= 2;
                    int var114 = field4221[field4234];
                    int var115 = field4221[field4234 + 1];
                    field4221[field4234++] = class48.method315(var115, true, var114, 12937);
                    return;
                }
                if (arg0 == 3316) {
                    if (class362.field5213 >= 2) {
                        field4221[field4234++] = class362.field5213;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3317) {
                    field4221[field4234++] = class467.field6588;
                    return;
                }
                if (arg0 == 3318) {
                    field4221[field4234++] = class185.field2746;
                    return;
                }
                if (arg0 == 3321) {
                    field4221[field4234++] = class202.field2980;
                    return;
                }
                if (arg0 == 3322) {
                    field4221[field4234++] = class78.field965;
                    return;
                }
                if (arg0 == 3323) {
                    if (class220.field3284 >= 5 && class220.field3284 <= 9) {
                        field4221[field4234++] = 1;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3324) {
                    if (class220.field3284 >= 5 && class220.field3284 <= 9) {
                        field4221[field4234++] = class220.field3284;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3325) {
                    field4221[field4234++] = class241.field3612 ? 1 : 0;
                    return;
                }
                if (arg0 == 3326) {
                    field4221[field4234++] = class492.field6935.field6253;
                    return;
                }
                if (arg0 == 3327) {
                    field4221[field4234++] = class492.field6935.field6296.field1727 ? 1 : 0;
                    return;
                }
                if (arg0 == 3328) {
                    field4221[field4234++] = class479.field6717 && !class23.field308 ? 1 : 0;
                    return;
                }
                if (arg0 == 3329) {
                    field4221[field4234++] = class363.field5221 ? 1 : 0;
                    return;
                }
                if (arg0 == 3330) {
                    int var116 = field4221[--field4234];
                    field4221[field4234++] = class148.method938(0, var116, false);
                    return;
                }
                if (arg0 == 3331) {
                    field4234 -= 2;
                    int var117 = field4221[field4234];
                    int var118 = field4221[field4234 + 1];
                    field4221[field4234++] = class441.method2594(-1, false, false, var118, var117);
                    return;
                }
                if (arg0 == 3332) {
                    field4234 -= 2;
                    int var119 = field4221[field4234];
                    int var120 = field4221[field4234 + 1];
                    field4221[field4234++] = class441.method2594(-1, true, false, var120, var119);
                    return;
                }
                if (arg0 == 3333) {
                    field4221[field4234++] = class240.field3595;
                    return;
                }
                if (arg0 == 3335) {
                    field4221[field4234++] = class326.field4711;
                    return;
                }
                if (arg0 == 3336) {
                    field4234 -= 4;
                    int var121 = field4221[field4234];
                    int var122 = field4221[field4234 + 1];
                    int var123 = field4221[field4234 + 2];
                    int var124 = field4221[field4234 + 3];
                    int var125 = (var122 << 14) + var121;
                    int var126 = (var123 << 28) + var125;
                    int var127 = var124 + var126;
                    field4221[field4234++] = var127;
                    return;
                }
                if (arg0 == 3337) {
                    field4221[field4234++] = class36.field466;
                    return;
                }
                if (arg0 == 3338) {
                    field4221[field4234++] = class367.method2260(10);
                    return;
                }
            } else if (arg0 < 3500) {
                if (arg0 == 3400) {
                    field4234 -= 2;
                    int var128 = field4221[field4234];
                    int var129 = field4221[field4234 + 1];
                    class271 var130 = class232.field3513.method2143(var128, -11);
                    field4214[field4230++] = var130.method1665(var129, (byte) 24);
                    return;
                }
                if (arg0 == 3408) {
                    field4234 -= 4;
                    int var131 = field4221[field4234];
                    int var132 = field4221[field4234 + 1];
                    int var133 = field4221[field4234 + 2];
                    int var134 = field4221[field4234 + 3];
                    class271 var135 = class232.field3513.method2143(var133, -11);
                    if (var135.field3953 == var131 && var135.field3941 == var132) {
                        if (var132 == 115) {
                            field4214[field4230++] = var135.method1665(var134, (byte) 24);
                            return;
                        }
                        field4221[field4234++] = var135.method1664(var134, -1);
                        return;
                    }
                    throw new RuntimeException("C3408-1");
                }
                if (arg0 == 3409) {
                    field4234 -= 3;
                    int var136 = field4221[field4234];
                    int var137 = field4221[field4234 + 1];
                    int var138 = field4221[field4234 + 2];
                    if (var137 == -1) {
                        throw new RuntimeException("C3409-2");
                    }
                    class271 var139 = class232.field3513.method2143(var137, -11);
                    if (var139.field3941 != var136) {
                        throw new RuntimeException("C3409-1");
                    }
                    field4221[field4234++] = var139.method1666(122, var138) ? 1 : 0;
                    return;
                }
                if (arg0 == 3410) {
                    int var140 = field4221[--field4234];
                    String var141 = field4214[--field4230];
                    if (var140 == -1) {
                        throw new RuntimeException("C3410-2");
                    }
                    class271 var142 = class232.field3513.method2143(var140, -11);
                    if (var142.field3941 != 's') {
                        throw new RuntimeException("C3410-1");
                    }
                    field4221[field4234++] = var142.method1662(2, var141) ? 1 : 0;
                    return;
                }
                if (arg0 == 3411) {
                    int var143 = field4221[--field4234];
                    class271 var144 = class232.field3513.method2143(var143, -11);
                    field4221[field4234++] = var144.field3944.method2762(0);
                    return;
                }
            } else if (arg0 < 3700) {
                if (arg0 == 3600) {
                    if (class140.field1856 == 0) {
                        field4221[field4234++] = -2;
                        return;
                    }
                    if (class140.field1856 == 1) {
                        field4221[field4234++] = -1;
                        return;
                    }
                    field4221[field4234++] = class237.field3564;
                    return;
                }
                if (arg0 == 3601) {
                    int var145 = field4221[--field4234];
                    if (class140.field1856 == 2 && var145 < class237.field3564) {
                        field4214[field4230++] = class24.field310[var145];
                        if (class116.field1477[var145] != null) {
                            field4214[field4230++] = class116.field1477[var145];
                            return;
                        }
                        field4214[field4230++] = "";
                        return;
                    }
                    field4214[field4230++] = "";
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 3602) {
                    int var146 = field4221[--field4234];
                    if (class140.field1856 == 2 && var146 < class237.field3564) {
                        field4221[field4234++] = class243.field3624[var146];
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3603) {
                    int var147 = field4221[--field4234];
                    if (class140.field1856 == 2 && var147 < class237.field3564) {
                        field4221[field4234++] = class237.field3558[var147];
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3604) {
                    String var148 = field4214[--field4230];
                    int var149 = field4221[--field4234];
                    class460.method2692(var149, var148, -12);
                    return;
                }
                if (arg0 == 3605) {
                    String var150 = field4214[--field4230];
                    class161.method1006(0, var150);
                    return;
                }
                if (arg0 == 3606) {
                    String var151 = field4214[--field4230];
                    class403.method2401(var151, 0);
                    return;
                }
                if (arg0 == 3607) {
                    String var152 = field4214[--field4230];
                    class333.method2104((byte) -108, var152, false);
                    return;
                }
                if (arg0 == 3608) {
                    String var153 = field4214[--field4230];
                    class278.method1760(var153, (byte) -15);
                    return;
                }
                if (arg0 == 3609) {
                    String var154 = field4214[--field4230];
                    if (var154.startsWith("<img=0>") || var154.startsWith("<img=1>")) {
                        var154 = var154.substring(7);
                    }
                    field4221[field4234++] = class160.method994(6, var154) ? 1 : 0;
                    return;
                }
                if (arg0 == 3610) {
                    int var155 = field4221[--field4234];
                    if (class140.field1856 == 2 && var155 < class237.field3564) {
                        field4214[field4230++] = class26.field334[var155];
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 3611) {
                    if (class293.field4254 != null) {
                        field4214[field4230++] = class356.method2215(1, class293.field4254);
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 3612) {
                    if (class293.field4254 != null) {
                        field4221[field4234++] = class58.field755;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3613) {
                    int var156 = field4221[--field4234];
                    if (class293.field4254 != null && var156 < class58.field755) {
                        field4214[field4230++] = class88.field1073[var156].field4142;
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 3614) {
                    int var157 = field4221[--field4234];
                    if (class293.field4254 != null && var157 < class58.field755) {
                        field4221[field4234++] = class88.field1073[var157].field4143;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3615) {
                    int var158 = field4221[--field4234];
                    if (class293.field4254 != null && var158 < class58.field755) {
                        field4221[field4234++] = class88.field1073[var158].field4138;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3616) {
                    field4221[field4234++] = class33.field427;
                    return;
                }
                if (arg0 == 3617) {
                    String var159 = field4214[--field4230];
                    class250.method1563(var159, 114);
                    return;
                }
                if (arg0 == 3618) {
                    field4221[field4234++] = class287.field4187;
                    return;
                }
                if (arg0 == 3619) {
                    String var160 = field4214[--field4230];
                    class40.method258(false, var160);
                    return;
                }
                if (arg0 == 3620) {
                    class408.method2413((byte) -24);
                    return;
                }
                if (arg0 == 3621) {
                    if (class140.field1856 == 0) {
                        field4221[field4234++] = -1;
                        return;
                    }
                    field4221[field4234++] = class350.field5065;
                    return;
                }
                if (arg0 == 3622) {
                    int var161 = field4221[--field4234];
                    if (class140.field1856 != 0 && var161 < class350.field5065) {
                        field4214[field4230++] = class7.field70[var161];
                        if (class204.field3025[var161] != null) {
                            field4214[field4230++] = class204.field3025[var161];
                            return;
                        }
                        field4214[field4230++] = "";
                        return;
                    }
                    field4214[field4230++] = "";
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 3623) {
                    String var162 = field4214[--field4230];
                    if (var162.startsWith("<img=0>") || var162.startsWith("<img=1>")) {
                        var162 = var162.substring(7);
                    }
                    field4221[field4234++] = class114.method722(var162, -25288) ? 1 : 0;
                    return;
                }
                if (arg0 == 3624) {
                    int var163 = field4221[--field4234];
                    if (class88.field1073 != null && var163 < class58.field755 && class88.field1073[var163].field4141.equalsIgnoreCase(class492.field6935.field6277)) {
                        field4221[field4234++] = 1;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3625) {
                    if (class446.field6176 != null) {
                        field4214[field4230++] = class446.field6176;
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 3626) {
                    int var164 = field4221[--field4234];
                    if (class293.field4254 != null && var164 < class58.field755) {
                        field4214[field4230++] = class88.field1073[var164].field4144;
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 3627) {
                    int var165 = field4221[--field4234];
                    if (class140.field1856 == 2 && var165 >= 0 && var165 < class237.field3564) {
                        field4221[field4234++] = class225.field3416[var165] ? 1 : 0;
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 3628) {
                    String var166 = field4214[--field4230];
                    if (var166.startsWith("<img=0>") || var166.startsWith("<img=1>")) {
                        var166 = var166.substring(7);
                    }
                    field4221[field4234++] = class30.method214(var166, 0);
                    return;
                }
                if (arg0 == 3629) {
                    field4221[field4234++] = class277.field4086;
                    return;
                }
                if (arg0 == 3630) {
                    String var167 = field4214[--field4230];
                    class333.method2104((byte) -108, var167, true);
                    return;
                }
                if (arg0 == 3631) {
                    int var168 = field4221[--field4234];
                    field4221[field4234++] = class328.field4751[var168] ? 1 : 0;
                    return;
                }
                if (arg0 == 3632) {
                    int var169 = field4221[--field4234];
                    if (class293.field4254 != null && var169 < class58.field755) {
                        field4214[field4230++] = class88.field1073[var169].field4141;
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 3633) {
                    int var170 = field4221[--field4234];
                    if (class140.field1856 != 0 && var170 < class350.field5065) {
                        field4214[field4230++] = class143.field1897[var170];
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
            } else if (arg0 < 4000) {
                if (arg0 == 3903) {
                    int var171 = field4221[--field4234];
                    field4221[field4234++] = class238.field3569[var171].method1529(62);
                    return;
                }
                if (arg0 == 3904) {
                    int var172 = field4221[--field4234];
                    field4221[field4234++] = class238.field3569[var172].field3608;
                    return;
                }
                if (arg0 == 3905) {
                    int var173 = field4221[--field4234];
                    field4221[field4234++] = class238.field3569[var173].field3611;
                    return;
                }
                if (arg0 == 3906) {
                    int var174 = field4221[--field4234];
                    field4221[field4234++] = class238.field3569[var174].field3607;
                    return;
                }
                if (arg0 == 3907) {
                    int var175 = field4221[--field4234];
                    field4221[field4234++] = class238.field3569[var175].field3605;
                    return;
                }
                if (arg0 == 3908) {
                    int var176 = field4221[--field4234];
                    field4221[field4234++] = class238.field3569[var176].field3613;
                    return;
                }
                if (arg0 == 3910) {
                    int var177 = field4221[--field4234];
                    int var178 = class238.field3569[var177].method1526((byte) 100);
                    field4221[field4234++] = var178 == 0 ? 1 : 0;
                    return;
                }
                if (arg0 == 3911) {
                    int var179 = field4221[--field4234];
                    int var180 = class238.field3569[var179].method1526((byte) 100);
                    field4221[field4234++] = var180 == 2 ? 1 : 0;
                    return;
                }
                if (arg0 == 3912) {
                    int var181 = field4221[--field4234];
                    int var182 = class238.field3569[var181].method1526((byte) 100);
                    field4221[field4234++] = var182 == 5 ? 1 : 0;
                    return;
                }
                if (arg0 == 3913) {
                    int var183 = field4221[--field4234];
                    int var184 = class238.field3569[var183].method1526((byte) 100);
                    field4221[field4234++] = var184 == 1 ? 1 : 0;
                    return;
                }
            } else if (arg0 < 4100) {
                if (arg0 == 4000) {
                    field4234 -= 2;
                    int var185 = field4221[field4234];
                    int var186 = field4221[field4234 + 1];
                    field4221[field4234++] = var185 + var186;
                    return;
                }
                if (arg0 == 4001) {
                    field4234 -= 2;
                    int var187 = field4221[field4234];
                    int var188 = field4221[field4234 + 1];
                    field4221[field4234++] = var187 - var188;
                    return;
                }
                if (arg0 == 4002) {
                    field4234 -= 2;
                    int var189 = field4221[field4234];
                    int var190 = field4221[field4234 + 1];
                    field4221[field4234++] = var189 * var190;
                    return;
                }
                if (arg0 == 4003) {
                    field4234 -= 2;
                    int var191 = field4221[field4234];
                    int var192 = field4221[field4234 + 1];
                    field4221[field4234++] = var191 / var192;
                    return;
                }
                if (arg0 == 4004) {
                    int var193 = field4221[--field4234];
                    field4221[field4234++] = (int) (Math.random() * (double) var193);
                    return;
                }
                if (arg0 == 4005) {
                    int var194 = field4221[--field4234];
                    field4221[field4234++] = (int) (Math.random() * (double) (var194 + 1));
                    return;
                }
                if (arg0 == 4006) {
                    field4234 -= 5;
                    int var195 = field4221[field4234];
                    int var196 = field4221[field4234 + 1];
                    int var197 = field4221[field4234 + 2];
                    int var198 = field4221[field4234 + 3];
                    int var199 = field4221[field4234 + 4];
                    field4221[field4234++] = (var196 - var195) * (var199 - var197) / (var198 - var197) + var195;
                    return;
                }
                if (arg0 == 4007) {
                    field4234 -= 2;
                    long var200 = (long) field4221[field4234];
                    long var202 = (long) field4221[field4234 + 1];
                    field4221[field4234++] = (int) (var200 * var202 / 100L + var200);
                    return;
                }
                if (arg0 == 4008) {
                    field4234 -= 2;
                    int var204 = field4221[field4234];
                    int var205 = field4221[field4234 + 1];
                    field4221[field4234++] = var204 | 0x1 << var205;
                    return;
                }
                if (arg0 == 4009) {
                    field4234 -= 2;
                    int var206 = field4221[field4234];
                    int var207 = field4221[field4234 + 1];
                    field4221[field4234++] = var206 & -(0x1 << var207) - 1;
                    return;
                }
                if (arg0 == 4010) {
                    field4234 -= 2;
                    int var208 = field4221[field4234];
                    int var209 = field4221[field4234 + 1];
                    field4221[field4234++] = (var208 & 0x1 << var209) == 0 ? 0 : 1;
                    return;
                }
                if (arg0 == 4011) {
                    field4234 -= 2;
                    int var210 = field4221[field4234];
                    int var211 = field4221[field4234 + 1];
                    field4221[field4234++] = var210 % var211;
                    return;
                }
                if (arg0 == 4012) {
                    field4234 -= 2;
                    int var212 = field4221[field4234];
                    int var213 = field4221[field4234 + 1];
                    if (var212 == 0) {
                        field4221[field4234++] = 0;
                        return;
                    }
                    field4221[field4234++] = (int) Math.pow((double) var212, (double) var213);
                    return;
                }
                if (arg0 == 4013) {
                    field4234 -= 2;
                    int var214 = field4221[field4234];
                    int var215 = field4221[field4234 + 1];
                    if (var214 == 0) {
                        field4221[field4234++] = 0;
                        return;
                    }
                    if (var215 == 0) {
                        field4221[field4234++] = Integer.MAX_VALUE;
                        return;
                    }
                    field4221[field4234++] = (int) Math.pow((double) var214, 1.0D / (double) var215);
                    return;
                }
                if (arg0 == 4014) {
                    field4234 -= 2;
                    int var216 = field4221[field4234];
                    int var217 = field4221[field4234 + 1];
                    field4221[field4234++] = var216 & var217;
                    return;
                }
                if (arg0 == 4015) {
                    field4234 -= 2;
                    int var218 = field4221[field4234];
                    int var219 = field4221[field4234 + 1];
                    field4221[field4234++] = var218 | var219;
                    return;
                }
                if (arg0 == 4016) {
                    field4234 -= 2;
                    int var220 = field4221[field4234];
                    int var221 = field4221[field4234 + 1];
                    field4221[field4234++] = var220 < var221 ? var220 : var221;
                    return;
                }
                if (arg0 == 4017) {
                    field4234 -= 2;
                    int var222 = field4221[field4234];
                    int var223 = field4221[field4234 + 1];
                    field4221[field4234++] = var222 > var223 ? var222 : var223;
                    return;
                }
                if (arg0 == 4018) {
                    field4234 -= 3;
                    long var224 = (long) field4221[field4234];
                    long var226 = (long) field4221[field4234 + 1];
                    long var228 = (long) field4221[field4234 + 2];
                    field4221[field4234++] = (int) (var224 * var228 / var226);
                    return;
                }
            } else if (arg0 < 4200) {
                if (arg0 == 4100) {
                    String var230 = field4214[--field4230];
                    int var231 = field4221[--field4234];
                    field4214[field4230++] = var230 + var231;
                    return;
                }
                if (arg0 == 4101) {
                    field4230 -= 2;
                    String var232 = field4214[field4230];
                    String var233 = field4214[field4230 + 1];
                    field4214[field4230++] = var232 + var233;
                    return;
                }
                if (arg0 == 4102) {
                    String var234 = field4214[--field4230];
                    int var235 = field4221[--field4234];
                    field4214[field4230++] = var234 + class24.method171(var235, (byte) 88, true);
                    return;
                }
                if (arg0 == 4103) {
                    String var236 = field4214[--field4230];
                    field4214[field4230++] = var236.toLowerCase();
                    return;
                }
                if (arg0 == 4104) {
                    field4214[field4230++] = method1813(field4221[--field4234]);
                    return;
                }
                if (arg0 == 4105) {
                    field4230 -= 2;
                    String var237 = field4214[field4230];
                    String var238 = field4214[field4230 + 1];
                    if (class492.field6935.field6296 != null && class492.field6935.field6296.field1727) {
                        field4214[field4230++] = var238;
                        return;
                    }
                    field4214[field4230++] = var237;
                    return;
                }
                if (arg0 == 4106) {
                    int var239 = field4221[--field4234];
                    field4214[field4230++] = Integer.toString(var239);
                    return;
                }
                if (arg0 == 4107) {
                    field4230 -= 2;
                    field4221[field4234++] = class180.method1105(class326.field4711, -123, field4214[field4230 + 1], field4214[field4230]);
                    return;
                }
                if (arg0 == 4108) {
                    String var240 = field4214[--field4230];
                    field4234 -= 2;
                    int var241 = field4221[field4234];
                    int var242 = field4221[field4234 + 1];
                    class135 var243 = class387.method2330(2, class347.field5025, 0, var242);
                    field4221[field4234++] = var243.method855(var240, class243.field3627, var241, false);
                    return;
                }
                if (arg0 == 4109) {
                    String var244 = field4214[--field4230];
                    field4234 -= 2;
                    int var245 = field4221[field4234];
                    int var246 = field4221[field4234 + 1];
                    class135 var247 = class387.method2330(2, class347.field5025, 0, var246);
                    field4221[field4234++] = var247.method852(class243.field3627, var244, var245, -70);
                    return;
                }
                if (arg0 == 4110) {
                    field4230 -= 2;
                    String var248 = field4214[field4230];
                    String var249 = field4214[field4230 + 1];
                    if (field4221[--field4234] == 1) {
                        field4214[field4230++] = var248;
                        return;
                    }
                    field4214[field4230++] = var249;
                    return;
                }
                if (arg0 == 4111) {
                    String var250 = field4214[--field4230];
                    field4214[field4230++] = class113.method717(true, var250);
                    return;
                }
                if (arg0 == 4112) {
                    String var251 = field4214[--field4230];
                    int var252 = field4221[--field4234];
                    if (var252 == -1) {
                        throw new RuntimeException("null char");
                    }
                    field4214[field4230++] = var251 + (char) var252;
                    return;
                }
                if (arg0 == 4113) {
                    int var253 = field4221[--field4234];
                    field4221[field4234++] = class479.method2799((char) var253, -340) ? 1 : 0;
                    return;
                }
                if (arg0 == 4114) {
                    int var254 = field4221[--field4234];
                    field4221[field4234++] = class410.method2426(48, (char) var254) ? 1 : 0;
                    return;
                }
                if (arg0 == 4115) {
                    int var255 = field4221[--field4234];
                    field4221[field4234++] = class253.method1579((char) var255, -27024) ? 1 : 0;
                    return;
                }
                if (arg0 == 4116) {
                    int var256 = field4221[--field4234];
                    field4221[field4234++] = class15.method108((char) var256, (byte) -49) ? 1 : 0;
                    return;
                }
                if (arg0 == 4117) {
                    String var257 = field4214[--field4230];
                    if (var257 != null) {
                        field4221[field4234++] = var257.length();
                        return;
                    }
                    field4221[field4234++] = 0;
                    return;
                }
                if (arg0 == 4118) {
                    String var258 = field4214[--field4230];
                    field4234 -= 2;
                    int var259 = field4221[field4234];
                    int var260 = field4221[field4234 + 1];
                    field4214[field4230++] = var258.substring(var259, var260);
                    return;
                }
                if (arg0 == 4119) {
                    String var261 = field4214[--field4230];
                    StringBuffer var262 = new StringBuffer(var261.length());
                    boolean var263 = false;
                    for (int var264 = 0; var264 < var261.length(); var264++) {
                        char var265 = var261.charAt(var264);
                        if (var265 == '<') {
                            var263 = true;
                        } else if (var265 == '>') {
                            var263 = false;
                        } else if (!var263) {
                            var262.append(var265);
                        }
                    }
                    field4214[field4230++] = var262.toString();
                    return;
                }
                if (arg0 == 4120) {
                    String var266 = field4214[--field4230];
                    field4234 -= 2;
                    int var267 = field4221[field4234];
                    int var268 = field4221[field4234 + 1];
                    field4221[field4234++] = var266.indexOf(var267, var268);
                    return;
                }
                if (arg0 == 4121) {
                    field4230 -= 2;
                    String var269 = field4214[field4230];
                    String var270 = field4214[field4230 + 1];
                    int var271 = field4221[--field4234];
                    field4221[field4234++] = var269.indexOf(var270, var271);
                    return;
                }
                if (arg0 == 4122) {
                    int var272 = field4221[--field4234];
                    field4221[field4234++] = Character.toLowerCase((char) var272);
                    return;
                }
                if (arg0 == 4123) {
                    int var273 = field4221[--field4234];
                    field4221[field4234++] = Character.toUpperCase((char) var273);
                    return;
                }
                if (arg0 == 4124) {
                    boolean var274 = field4221[--field4234] != 0;
                    int var275 = field4221[--field4234];
                    field4214[field4230++] = class96.method546((long) var275, 0, (byte) -88, class326.field4711, var274);
                    return;
                }
                if (arg0 == 4125) {
                    String var276 = field4214[--field4230];
                    int var277 = field4221[--field4234];
                    class135 var278 = class387.method2330(2, class347.field5025, 0, var277);
                    field4221[field4234++] = var278.method858(class243.field3627, -17498, var276);
                    return;
                }
            } else if (arg0 < 4300) {
                if (arg0 == 4200) {
                    int var279 = field4221[--field4234];
                    field4214[field4230++] = class64.field834.method2129(var279, false).field538;
                    return;
                }
                if (arg0 == 4201) {
                    field4234 -= 2;
                    int var280 = field4221[field4234];
                    int var281 = field4221[field4234 + 1];
                    class41 var282 = class64.field834.method2129(var280, false);
                    if (var281 >= 1 && var281 <= 5 && var282.field608[var281 - 1] != null) {
                        field4214[field4230++] = var282.field608[var281 - 1];
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 4202) {
                    field4234 -= 2;
                    int var283 = field4221[field4234];
                    int var284 = field4221[field4234 + 1];
                    class41 var285 = class64.field834.method2129(var283, false);
                    if (var284 >= 1 && var284 <= 5 && var285.field553[var284 - 1] != null) {
                        field4214[field4230++] = var285.field553[var284 - 1];
                        return;
                    }
                    field4214[field4230++] = "";
                    return;
                }
                if (arg0 == 4203) {
                    int var286 = field4221[--field4234];
                    field4221[field4234++] = class64.field834.method2129(var286, false).field559;
                    return;
                }
                if (arg0 == 4204) {
                    int var287 = field4221[--field4234];
                    field4221[field4234++] = class64.field834.method2129(var287, false).field592 == 1 ? 1 : 0;
                    return;
                }
                if (arg0 == 4205) {
                    int var288 = field4221[--field4234];
                    class41 var289 = class64.field834.method2129(var288, false);
                    if (var289.field605 == -1 && var289.field611 >= 0) {
                        field4221[field4234++] = var289.field611;
                        return;
                    }
                    field4221[field4234++] = var288;
                    return;
                }
                if (arg0 == 4206) {
                    int var290 = field4221[--field4234];
                    class41 var291 = class64.field834.method2129(var290, false);
                    if (var291.field605 >= 0 && var291.field611 >= 0) {
                        field4221[field4234++] = var291.field611;
                        return;
                    }
                    field4221[field4234++] = var290;
                    return;
                }
                if (arg0 == 4207) {
                    int var292 = field4221[--field4234];
                    field4221[field4234++] = class64.field834.method2129(var292, false).field572 ? 1 : 0;
                    return;
                }
                if (arg0 == 4208) {
                    field4234 -= 2;
                    int var293 = field4221[field4234];
                    int var294 = field4221[field4234 + 1];
                    class467 var295 = class408.field5734.method1541(-71, var294);
                    if (var295.method2745(-33)) {
                        field4214[field4230++] = class64.field834.method2129(var293, false).method282(var294, (byte) -71, var295.field6589);
                        return;
                    }
                    field4221[field4234++] = class64.field834.method2129(var293, false).method270(32, var294, var295.field6579);
                    return;
                }
                if (arg0 == 4209) {
                    field4234 -= 2;
                    int var296 = field4221[field4234];
                    int var297 = field4221[field4234 + 1] - 1;
                    class41 var298 = class64.field834.method2129(var296, false);
                    if (var298.field614 == var297) {
                        field4221[field4234++] = var298.field555;
                        return;
                    }
                    if (var298.field548 == var297) {
                        field4221[field4234++] = var298.field567;
                        return;
                    }
                    field4221[field4234++] = -1;
                    return;
                }
                if (arg0 == 4210) {
                    String var299 = field4214[--field4230];
                    int var300 = field4221[--field4234];
                    class179.method1099(var300 == 1, 0, var299);
                    field4221[field4234++] = class321.field4652;
                    return;
                }
                if (arg0 == 4211) {
                    if (class40.field531 != null && class45.field643 < class321.field4652) {
                        field4221[field4234++] = class40.field531[class45.field643++] & 0xFFFF;
                        return;
                    }
                    field4221[field4234++] = -1;
                    return;
                }
                if (arg0 == 4212) {
                    class45.field643 = 0;
                    return;
                }
            } else if (arg0 < 4400) {
                if (arg0 == 4300) {
                    field4234 -= 2;
                    int var301 = field4221[field4234];
                    int var302 = field4221[field4234 + 1];
                    class467 var303 = class408.field5734.method1541(-107, var302);
                    if (var303.method2745(-53)) {
                        field4214[field4230++] = class265.field3859.method2800(var301, (byte) 32).method2731(var303.field6589, var302, -11558);
                        return;
                    }
                    field4221[field4234++] = class265.field3859.method2800(var301, (byte) 32).method2733(1, var302, var303.field6579);
                    return;
                }
            } else if (arg0 < 4500) {
                if (arg0 == 4400) {
                    field4234 -= 2;
                    int var304 = field4221[field4234];
                    int var305 = field4221[field4234 + 1];
                    class467 var306 = class408.field5734.method1541(-42, var305);
                    if (var306.method2745(-30)) {
                        field4214[field4230++] = class156.field2325.method808(var304, 0).method2660(96, var305, var306.field6589);
                        return;
                    }
                    field4221[field4234++] = class156.field2325.method808(var304, 0).method2657(var306.field6579, var305, 0);
                    return;
                }
            } else if (arg0 < 4600) {
                if (arg0 == 4500) {
                    field4234 -= 2;
                    int var307 = field4221[field4234];
                    int var308 = field4221[field4234 + 1];
                    class467 var309 = class408.field5734.method1541(-78, var308);
                    if (var309.method2745(-67)) {
                        field4214[field4230++] = class377.field5424.method2108((byte) 94, var307).method164(-6, var309.field6589, var308);
                        return;
                    }
                    field4221[field4234++] = class377.field5424.method2108((byte) 123, var307).method160(var308, var309.field6579, -13);
                    return;
                }
            } else if (arg0 < 4700 && arg0 == 4600) {
                int var310 = field4221[--field4234];
                class332 var311 = class459.field6436.method404(false, var310);
                if (var311.field4817 != null && var311.field4817.length > 0) {
                    int var312 = 0;
                    int var313 = var311.field4827[0];
                    for (int var314 = 1; var314 < var311.field4817.length; var314++) {
                        if (var311.field4827[var314] > var313) {
                            var312 = var314;
                            var313 = var311.field4827[var314];
                        }
                    }
                    field4221[field4234++] = var311.field4817[var312];
                    return;
                }
                field4221[field4234++] = var311.field4813;
                return;
            }
        } else {
            class145 var41;
            if (arg0 >= 2000) {
                arg0 -= 1000;
                var41 = class166.method1028(field4221[--field4234], 100);
            } else {
                var41 = arg1 ? field4222 : field4235;
            }
            if (arg0 == 1300) {
                int var42 = field4221[--field4234] - 1;
                if (var42 >= 0 && var42 <= 9) {
                    var41.method904(field4214[--field4230], var42, 0);
                    return;
                }
                field4230--;
                return;
            }
            if (arg0 == 1301) {
                field4234 -= 2;
                int var43 = field4221[field4234];
                int var44 = field4221[field4234 + 1];
                var41.field2058 = class441.method2598((byte) -127, var43, var44);
                return;
            }
            if (arg0 == 1302) {
                int var45 = field4221[--field4234];
                if (class320.field4644 != var45 && class169.field2474 != var45 && class404.field5692 != var45) {
                    return;
                }
                var41.field1988 = var45;
                return;
            }
            if (arg0 == 1303) {
                var41.field2022 = field4221[--field4234];
                return;
            }
            if (arg0 == 1304) {
                var41.field1932 = field4221[--field4234];
                return;
            }
            if (arg0 == 1305) {
                var41.field1928 = field4214[--field4230];
                return;
            }
            if (arg0 == 1306) {
                var41.field1944 = field4214[--field4230];
                return;
            }
            if (arg0 == 1307) {
                var41.field1920 = null;
                return;
            }
            if (arg0 == 1308) {
                var41.field2059 = field4221[--field4234];
                var41.field1964 = field4221[--field4234];
                return;
            }
            if (arg0 == 1309) {
                int var46 = field4221[--field4234];
                int var47 = field4221[--field4234];
                if (var47 >= 1 && var47 <= 10) {
                    var41.method907(var46, var47 - 1, 21690);
                }
                return;
            }
            if (arg0 == 1310) {
                var41.field2066 = field4214[--field4230];
                return;
            }
            if (arg0 == 1311) {
                var41.field1926 = field4221[--field4234];
                return;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lhd;I)V")
    private static final void method1812(class482 arg0, int arg1) {
        field4234 = 0;
        field4230 = 0;
        int var2 = -1;
        int[] var3 = arg0.field6788;
        int[] var4 = arg0.field6793;
        byte var5 = -1;
        field4231 = 0;
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
                        method1811(var43, var35);
                    } else if (var43 >= 5000 && var43 < 10000) {
                        method1810(var43, var35);
                    } else {
                        throw new IllegalStateException("Command: " + var43);
                    }
                } else if (var43 == 0) {
                    field4221[field4234++] = var4[var2];
                } else if (var43 == 1) {
                    int var7 = var4[var2];
                    field4221[field4234++] = class140.field1859.field6450[var7];
                } else if (var43 == 2) {
                    int var8 = var4[var2];
                    class140.field1859.method2699(var8, field4221[--field4234], -29988);
                } else if (var43 == 3) {
                    field4214[field4230++] = arg0.field6791[var2];
                } else if (var43 == 6) {
                    var2 += var4[var2];
                } else if (var43 == 7) {
                    field4234 -= 2;
                    if (field4221[field4234 + 1] != field4221[field4234]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 8) {
                    field4234 -= 2;
                    if (field4221[field4234 + 1] == field4221[field4234]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 9) {
                    field4234 -= 2;
                    if (field4221[field4234] < field4221[field4234 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 10) {
                    field4234 -= 2;
                    if (field4221[field4234] > field4221[field4234 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 21) {
                    if (field4231 == 0) {
                        return;
                    }
                    class485 var9 = field4219[--field4231];
                    arg0 = var9.field6821;
                    var3 = arg0.field6788;
                    var4 = arg0.field6793;
                    var2 = var9.field6820;
                    field4226 = var9.field6825;
                    field4215 = var9.field6819;
                } else if (var43 == 25) {
                    int var10 = var4[var2];
                    field4221[field4234++] = class140.field1859.method2452(true, var10);
                } else if (var43 == 27) {
                    int var11 = var4[var2];
                    class140.field1859.method2694(var11, (byte) 100, field4221[--field4234]);
                } else if (var43 == 31) {
                    field4234 -= 2;
                    if (field4221[field4234] <= field4221[field4234 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 32) {
                    field4234 -= 2;
                    if (field4221[field4234] >= field4221[field4234 + 1]) {
                        var2 += var4[var2];
                    }
                } else if (var43 == 33) {
                    field4221[field4234++] = field4226[var4[var2]];
                } else if (var43 == 34) {
                    field4226[var4[var2]] = field4221[--field4234];
                } else if (var43 == 35) {
                    field4214[field4230++] = field4215[var4[var2]];
                } else if (var43 == 36) {
                    field4215[var4[var2]] = field4214[--field4230];
                } else if (var43 == 37) {
                    int var12 = var4[var2];
                    field4230 -= var12;
                    String var13 = class210.method1365(0, var12, field4214, field4230);
                    field4214[field4230++] = var13;
                } else if (var43 == 38) {
                    field4234--;
                } else if (var43 == 39) {
                    field4230--;
                } else if (var43 == 40) {
                    int var14 = var4[var2];
                    class482 var15 = class492.method2889(var14, (byte) 48);
                    if (var15 == null) {
                        throw new RuntimeException();
                    }
                    int[] var16 = new int[var15.field6792];
                    String[] var17 = new String[var15.field6784];
                    for (int var18 = 0; var18 < var15.field6794; var18++) {
                        var16[var18] = field4221[field4234 + var18 - var15.field6794];
                    }
                    for (int var19 = 0; var19 < var15.field6782; var19++) {
                        var17[var19] = field4214[field4230 + var19 - var15.field6782];
                    }
                    field4234 -= var15.field6794;
                    field4230 -= var15.field6782;
                    class485 var20 = new class485();
                    var20.field6821 = arg0;
                    var20.field6820 = var2;
                    var20.field6825 = field4226;
                    var20.field6819 = field4215;
                    if (field4231 >= field4219.length) {
                        throw new RuntimeException();
                    }
                    field4219[field4231++] = var20;
                    arg0 = var15;
                    var3 = var15.field6788;
                    var4 = var15.field6793;
                    var2 = -1;
                    field4226 = var16;
                    field4215 = var17;
                } else if (var43 == 42) {
                    field4221[field4234++] = class156.field2320[var4[var2]];
                } else if (var43 == 43) {
                    int var21 = var4[var2];
                    class156.field2320[var21] = field4221[--field4234];
                    class330.method2090(179755535, var21);
                    class29.field391 |= class146.field2102[var21];
                } else if (var43 == 44) {
                    int var22 = var4[var2] >> 16;
                    int var23 = var4[var2] & 0xFFFF;
                    int var24 = field4221[--field4234];
                    if (var24 >= 0 && var24 <= 5000) {
                        field4225[var22] = var24;
                        byte var25 = -1;
                        if (var23 == 105) {
                            var25 = 0;
                        }
                        int var26 = 0;
                        while (true) {
                            if (var26 >= var24) {
                                continue label260;
                            }
                            field4217[var22][var26] = var25;
                            var26++;
                        }
                    }
                    throw new RuntimeException();
                } else if (var43 == 45) {
                    int var27 = var4[var2];
                    int var28 = field4221[--field4234];
                    if (var28 < 0 || var28 >= field4225[var27]) {
                        throw new RuntimeException();
                    }
                    field4221[field4234++] = field4217[var27][var28];
                } else if (var43 == 46) {
                    int var29 = var4[var2];
                    field4234 -= 2;
                    int var30 = field4221[field4234];
                    if (var30 < 0 || var30 >= field4225[var29]) {
                        throw new RuntimeException();
                    }
                    field4217[var29][var30] = field4221[field4234 + 1];
                } else if (var43 == 47) {
                    String var31 = class339.field4954[var4[var2]];
                    if (var31 == null) {
                        var31 = "null";
                    }
                    field4214[field4230++] = var31;
                } else if (var43 == 48) {
                    int var32 = var4[var2];
                    class339.field4954[var32] = field4214[--field4230];
                    class37.method245(118, var32);
                } else if (var43 == 51) {
                    class470 var33 = arg0.field6786[var4[var2]];
                    class324 var34 = (class324) var33.method2761((long) field4221[--field4234], (byte) -112);
                    if (var34 != null) {
                        var2 += var34.field4676;
                    }
                }
            }
        } catch (Exception var42) {
            if (arg0.field6787 == null) {
                StringBuffer var40 = new StringBuffer(30);
                var40.append("CS2: ").append(arg0.field3568).append(" ");
                for (int var41 = field4231 - 1; var41 >= 0; var41--) {
                    var40.append("v: ").append(field4219[var41].field6821.field3568).append(" ");
                }
                var40.append("op: ").append(var5);
                class267.method1641(var40.toString(), var42, (byte) -87);
            } else {
                class139.method884("Clientscript error in: " + arg0.field6787, 0);
                StringBuffer var37 = new StringBuffer(30);
                var37.append("Clientscript error in: ").append(arg0.field6787).append("\n");
                for (int var38 = field4231 - 1; var38 >= 0; var38--) {
                    var37.append("via: ").append(field4219[var38].field6821.field6787).append("\n");
                }
                var37.append("Op: ").append(var5).append("\n");
                String var39 = var42.getMessage();
                if (var39 != null && var39.length() > 0) {
                    var37.append("Message: ").append(var39).append("\n");
                }
                class267.method1641(var37.toString(), var42, (byte) -87);
                class414.method2443(false, var37.toString());
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)Ljava/lang/String;")
    private static final String method1813(int arg0) {
        long var1 = ((long) arg0 + 11745L) * 86400000L;
        field4229.setTime(new Date(var1));
        int var3 = field4229.get(5);
        int var4 = field4229.get(2);
        int var5 = field4229.get(1);
        return var3 + "-" + field4238[var4] + "-" + var5;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
    private static final void method1814(int arg0) {
        class145 var1 = class166.method1028(arg0, 120);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class145[] var3 = class77.field945[var2];
        if (var3 == null) {
            class145[] var4 = class112.field1421[var2];
            int var5 = var4.length;
            var3 = class77.field945[var2] = new class145[var5];
            class415.method2450(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class415.method2450(var3, 0, var3, 1, var6);
        var3[0] = var1;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "()V")
    public static void method1815() {
        field4226 = null;
        field4215 = null;
        field4225 = null;
        field4217 = null;
        field4221 = null;
        field4214 = null;
        field4219 = null;
        field4235 = null;
        field4222 = null;
        field4227 = null;
        field4229 = null;
        field4238 = null;
        field4237 = null;
        field4239 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljava/lang/String;I)V")
    private static final void method1816(String arg0, int arg1) {
        if (class362.field5213 == 0 && !(!class479.field6717 || class23.field308) || class363.field5221) {
            return;
        }
        String var2 = arg0.toLowerCase();
        byte var3 = 0;
        if (var2.startsWith(class184.field2716.method2065(39, 0))) {
            var3 = 0;
            arg0 = arg0.substring(class184.field2716.method2065(78, 0).length());
        } else if (var2.startsWith(class182.field2703.method2065(66, 0))) {
            var3 = 1;
            arg0 = arg0.substring(class182.field2703.method2065(119, 0).length());
        } else if (var2.startsWith(class452.field6264.method2065(-128, 0))) {
            var3 = 2;
            arg0 = arg0.substring(class452.field6264.method2065(-119, 0).length());
        } else if (var2.startsWith(class289.field4208.method2065(-118, 0))) {
            var3 = 3;
            arg0 = arg0.substring(class289.field4208.method2065(-89, 0).length());
        } else if (var2.startsWith(class353.field5092.method2065(-93, 0))) {
            var3 = 4;
            arg0 = arg0.substring(class353.field5092.method2065(69, 0).length());
        } else if (var2.startsWith(class362.field5219.method2065(51, 0))) {
            var3 = 5;
            arg0 = arg0.substring(class362.field5219.method2065(111, 0).length());
        } else if (var2.startsWith(class267.field3907.method2065(105, 0))) {
            var3 = 6;
            arg0 = arg0.substring(class267.field3907.method2065(112, 0).length());
        } else if (var2.startsWith(class222.field3373.method2065(-97, 0))) {
            var3 = 7;
            arg0 = arg0.substring(class222.field3373.method2065(-127, 0).length());
        } else if (var2.startsWith(class370.field5339.method2065(108, 0))) {
            var3 = 8;
            arg0 = arg0.substring(class370.field5339.method2065(91, 0).length());
        } else if (var2.startsWith(class275.field3995.method2065(-98, 0))) {
            var3 = 9;
            arg0 = arg0.substring(class275.field3995.method2065(-121, 0).length());
        } else if (var2.startsWith(class187.field2805.method2065(-120, 0))) {
            var3 = 10;
            arg0 = arg0.substring(class187.field2805.method2065(-95, 0).length());
        } else if (var2.startsWith(class131.field1710.method2065(112, 0))) {
            var3 = 11;
            arg0 = arg0.substring(class131.field1710.method2065(-107, 0).length());
        } else if (class326.field4711 != 0) {
            if (var2.startsWith(class184.field2716.method2065(44, class326.field4711))) {
                var3 = 0;
                arg0 = arg0.substring(class184.field2716.method2065(48, class326.field4711).length());
            } else if (var2.startsWith(class182.field2703.method2065(-112, class326.field4711))) {
                var3 = 1;
                arg0 = arg0.substring(class182.field2703.method2065(69, class326.field4711).length());
            } else if (var2.startsWith(class452.field6264.method2065(124, class326.field4711))) {
                var3 = 2;
                arg0 = arg0.substring(class452.field6264.method2065(57, class326.field4711).length());
            } else if (var2.startsWith(class289.field4208.method2065(74, class326.field4711))) {
                var3 = 3;
                arg0 = arg0.substring(class289.field4208.method2065(-126, class326.field4711).length());
            } else if (var2.startsWith(class353.field5092.method2065(-105, class326.field4711))) {
                var3 = 4;
                arg0 = arg0.substring(class353.field5092.method2065(-113, class326.field4711).length());
            } else if (var2.startsWith(class362.field5219.method2065(-105, class326.field4711))) {
                var3 = 5;
                arg0 = arg0.substring(class362.field5219.method2065(43, class326.field4711).length());
            } else if (var2.startsWith(class267.field3907.method2065(54, class326.field4711))) {
                var3 = 6;
                arg0 = arg0.substring(class267.field3907.method2065(-125, class326.field4711).length());
            } else if (var2.startsWith(class222.field3373.method2065(-108, class326.field4711))) {
                var3 = 7;
                arg0 = arg0.substring(class222.field3373.method2065(103, class326.field4711).length());
            } else if (var2.startsWith(class370.field5339.method2065(68, class326.field4711))) {
                var3 = 8;
                arg0 = arg0.substring(class370.field5339.method2065(-99, class326.field4711).length());
            } else if (var2.startsWith(class275.field3995.method2065(-125, class326.field4711))) {
                var3 = 9;
                arg0 = arg0.substring(class275.field3995.method2065(-96, class326.field4711).length());
            } else if (var2.startsWith(class187.field2805.method2065(-119, class326.field4711))) {
                var3 = 10;
                arg0 = arg0.substring(class187.field2805.method2065(107, class326.field4711).length());
            } else if (var2.startsWith(class131.field1710.method2065(118, class326.field4711))) {
                var3 = 11;
                arg0 = arg0.substring(class131.field1710.method2065(123, class326.field4711).length());
            }
        }
        String var4 = arg0.toLowerCase();
        byte var5 = 0;
        if (var4.startsWith(class271.field3956.method2065(79, 0))) {
            var5 = 1;
            arg0 = arg0.substring(class271.field3956.method2065(44, 0).length());
        } else if (var4.startsWith(class287.field4182.method2065(124, 0))) {
            var5 = 2;
            arg0 = arg0.substring(class287.field4182.method2065(-117, 0).length());
        } else if (var4.startsWith(class342.field4990.method2065(88, 0))) {
            var5 = 3;
            arg0 = arg0.substring(class342.field4990.method2065(-128, 0).length());
        } else if (var4.startsWith(class252.field3714.method2065(110, 0))) {
            var5 = 4;
            arg0 = arg0.substring(class252.field3714.method2065(-89, 0).length());
        } else if (var4.startsWith(class262.field3835.method2065(85, 0))) {
            var5 = 5;
            arg0 = arg0.substring(class262.field3835.method2065(127, 0).length());
        } else if (class326.field4711 != 0) {
            if (var4.startsWith(class271.field3956.method2065(-100, class326.field4711))) {
                var5 = 1;
                arg0 = arg0.substring(class271.field3956.method2065(39, class326.field4711).length());
            } else if (var4.startsWith(class287.field4182.method2065(87, class326.field4711))) {
                var5 = 2;
                arg0 = arg0.substring(class287.field4182.method2065(-107, class326.field4711).length());
            } else if (var4.startsWith(class342.field4990.method2065(-128, class326.field4711))) {
                var5 = 3;
                arg0 = arg0.substring(class342.field4990.method2065(74, class326.field4711).length());
            } else if (var4.startsWith(class252.field3714.method2065(-111, class326.field4711))) {
                var5 = 4;
                arg0 = arg0.substring(class252.field3714.method2065(-91, class326.field4711).length());
            } else if (var4.startsWith(class262.field3835.method2065(125, class326.field4711))) {
                var5 = 5;
                arg0 = arg0.substring(class262.field3835.method2065(-90, class326.field4711).length());
            }
        }
        field4224++;
        class15.method110(class135.field1794, -128);
        class225.field3415.method1753(true, 0);
        int var6 = class225.field3415.field4021;
        if (arg1 == 5021) {
            class225.field3415.method1753(true, 1);
        } else {
            class225.field3415.method1753(true, 0);
        }
        class225.field3415.method1753(true, var3);
        class225.field3415.method1753(true, var5);
        class272.method1670(class225.field3415, arg0, true);
        class225.field3415.method1733(-23181, class225.field3415.field4021 - var6);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lvp;II)V")
    public static final void method1817(class112 arg0, int arg1, int arg2) {
        class482 var3 = class465.method2730(arg1, true, arg2, arg0);
        if (var3 == null) {
            return;
        }
        field4226 = new int[var3.field6792];
        field4215 = new String[var3.field6784];
        if (class171.field2489 == var3.field6783 || class151.field2247 == var3.field6783 || class239.field3587 == var3.field6783) {
            int var4 = 0;
            int var5 = 0;
            if (class307.field4372 != null) {
                var4 = class307.field4372.field1971;
                var5 = class307.field4372.field2041;
            }
            field4226[0] = class262.field3832.method175(-116) - var4;
            field4226[1] = class262.field3832.method177(101) - var5;
        }
        method1812(var3, 200000);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljo;)V")
    public static final void method1818(class202 arg0) {
        method1819(arg0, 200000);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Ljo;I)V")
    private static final void method1819(class202 arg0, int arg1) {
        Object[] var2 = arg0.field2971;
        int var3 = (Integer) var2[0];
        class482 var4 = class492.method2889(var3, (byte) 48);
        if (var4 == null) {
            return;
        }
        field4226 = new int[var4.field6792];
        int var5 = 0;
        field4215 = new String[var4.field6784];
        int var6 = 0;
        for (int var7 = 1; var7 < var2.length; var7++) {
            if (var2[var7] instanceof Integer) {
                int var8 = (Integer) var2[var7];
                if (var8 == -2147483647) {
                    var8 = arg0.field2966;
                }
                if (var8 == -2147483646) {
                    var8 = arg0.field2972;
                }
                if (var8 == -2147483645) {
                    var8 = arg0.field2976 == null ? -1 : arg0.field2976.field1933;
                }
                if (var8 == -2147483644) {
                    var8 = arg0.field2977;
                }
                if (var8 == -2147483643) {
                    var8 = arg0.field2976 == null ? -1 : arg0.field2976.field1951;
                }
                if (var8 == -2147483642) {
                    var8 = arg0.field2969 == null ? -1 : arg0.field2969.field1933;
                }
                if (var8 == -2147483641) {
                    var8 = arg0.field2969 == null ? -1 : arg0.field2969.field1951;
                }
                if (var8 == -2147483640) {
                    var8 = arg0.field2973;
                }
                if (var8 == -2147483639) {
                    var8 = arg0.field2978;
                }
                field4226[var5++] = var8;
            } else if (var2[var7] instanceof String) {
                String var9 = (String) var2[var7];
                if (var9.equals("event_opbase")) {
                    var9 = arg0.field2975;
                }
                field4215[var6++] = var9;
            }
        }
        method1812(var4, arg1);
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V")
    public static final void method1820(int arg0) {
        if (arg0 == -1 || !class78.method452(arg0, -3192)) {
            return;
        }
        class145[] var1 = class112.field1421[arg0];
        for (int var2 = 0; var2 < var1.length; var2++) {
            class145 var3 = var1[var2];
            if (var3.field1936 != null) {
                class202 var4 = new class202();
                var4.field2976 = var3;
                var4.field2971 = var3.field1936;
                method1819(var4, 2000000);
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)V")
    private static final void method1821(int arg0) {
        class145 var1 = class166.method1028(arg0, 124);
        if (var1 == null) {
            return;
        }
        int var2 = arg0 >>> 16;
        class145[] var3 = class77.field945[var2];
        if (var3 == null) {
            class145[] var4 = class112.field1421[var2];
            int var5 = var4.length;
            var3 = class77.field945[var2] = new class145[var5];
            class415.method2450(var4, 0, var3, 0, var4.length);
        }
        int var6;
        for (var6 = 0; var6 < var3.length && var3[var6] != var1; var6++) {
        }
        if (var6 >= var3.length) {
            return;
        }
        class415.method2450(var3, var6 + 1, var3, var6, var3.length - var6 - 1);
        var3[var3.length - 1] = var1;
    }
}
