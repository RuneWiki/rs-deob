import jagex3.jagmisc.jagmisc;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class752 extends class134 {

    @OriginalMember(owner = "client!sw", name = "j", descriptor = "I")
    public int field10509 = 0;

    @OriginalMember(owner = "client!sw", name = "s", descriptor = "I")
    public int field10518 = -1;

    @OriginalMember(owner = "client!sw", name = "q", descriptor = "Ldh;")
    public static class320 field10516 = new class320(26, 12);

    @OriginalMember(owner = "client!sw", name = "y", descriptor = "I")
    public static int field10524 = 0;

    @OriginalMember(owner = "client!sw", name = "k", descriptor = "I")
    public int field10510;

    @OriginalMember(owner = "client!sw", name = "l", descriptor = "I")
    public static int field10511;

    @OriginalMember(owner = "client!sw", name = "m", descriptor = "I")
    public int field10512;

    @OriginalMember(owner = "client!sw", name = "n", descriptor = "I")
    public static int field10513;

    @OriginalMember(owner = "client!sw", name = "o", descriptor = "I")
    public int field10514;

    @OriginalMember(owner = "client!sw", name = "p", descriptor = "I")
    public int field10515;

    @OriginalMember(owner = "client!sw", name = "r", descriptor = "I")
    public int field10517;

    @OriginalMember(owner = "client!sw", name = "t", descriptor = "I")
    public int field10519;

    @OriginalMember(owner = "client!sw", name = "u", descriptor = "I")
    public int field10520;

    @OriginalMember(owner = "client!sw", name = "v", descriptor = "I")
    public int field10521;

    @OriginalMember(owner = "client!sw", name = "w", descriptor = "I")
    public int field10522;

    @OriginalMember(owner = "client!sw", name = "x", descriptor = "I")
    public int field10523;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(Z)V")
    public static void method4190(boolean arg0) {
        if (!arg0) {
            method4192(127);
        }
        field10516 = null;
    }

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "(Z)I")
    public static final int method4191(boolean arg0) {
        field10513++;
        if (class654.field9334.field9871.method248(31) == 0) {
            for (int var1 = 0; var1 < class183.field2202; var1++) {
                if (class266.field3307[var1].method2514((byte) 122) == 's' || class266.field3307[var1].method2514((byte) 124) == 'S') {
                    class654.field9334.method3924(true, class654.field9334.field9871, 1);
                    class179.field2101 = true;
                    break;
                }
            }
        }
        if (class92.field959 == class593.field8354) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class652.method3700(-1);
            if (class102.field1063 == 0L) {
                class102.field1063 = var4;
            }
            if (var3 > 16384 && var4 - class102.field1063 < 5000L) {
                if ((var4 - class208.field2461) > 1000L) {
                    System.gc();
                    class208.field2461 = var4;
                }
                return 0;
            }
        }
        if (class92.field959 == class593.field8360) {
            if (class324.field4141 == null) {
                class324.field4141 = new class330(class227.field2592, class93.field985, class360.field4626, class449.field6486);
            }
            if (!class324.field4141.method1976(-49)) {
                return 0;
            }
            class36.method166(true, 0, (byte) -106, null);
            class145.field1606 = !class381.method2341((byte) 110);
            class743.field10380 = class683.method3869(false, 1, arg0, class145.field1606 ? 34 : 32);
            class399.field5466 = class683.method3869(false, 1, arg0, 33);
            class330.field4275 = class683.method3869(false, 1, true, 13);
        }
        if (class92.field959 == class593.field8361) {
            boolean var6 = class399.field5466.method2479((byte) 77);
            int var7 = class24.field224[33].method2127(121);
            int var8 = var7 + class24.field224[class145.field1606 ? 34 : 32].method2127(102);
            int var9 = var8 + class24.field224[13].method2127(108);
            int var10 = var9 + (var6 ? 100 : class399.field5466.method2487(-107));
            if (var10 != 400) {
                return var10 / 4;
            }
            class744.field10390 = class743.field10380.method2489(4);
            class139.field1564 = class399.field5466.method2489(4);
            class654.method3713(0, class743.field10380);
            int var11 = class654.field9334.field9842.method3077(-121);
            class311.field3861 = new class174(class99.field1034, class489.field6978, class399.field5466);
            int[] var12 = class311.field3861.method1079(var11, (byte) -107);
            if (var12.length == 0) {
                var12 = class311.field3861.method1079(0, (byte) -107);
            }
            class541 var13 = new class541(class743.field10380, class330.field4275);
            if (var12.length > 0) {
                class87.field917 = new class715[var12.length];
                for (int var14 = 0; var14 < class87.field917.length; var14++) {
                    class87.field917[var14] = new class744(class311.field3861.method1081(1, var12[var14]), var13);
                }
            }
        }
        if (class92.field959 == class593.field8364) {
            class734.method4090(9260, class743.field10380, class70.method514(49152), class330.field4275);
        }
        if (class92.field959 == class593.field8365) {
            int var15 = class38.method182((byte) -14);
            int var16 = class427.method2664(2);
            if (var15 < var16) {
                return var15 * 100 / var16;
            }
        }
        if (class92.field959 == class593.field8366) {
            if (class87.field917 != null && class87.field917.length > 0) {
                if (class87.field917[0].method1186(31867) < 100) {
                    return 0;
                }
                if (class87.field917.length > 1 && class311.field3861.method1080((byte) 111) && class87.field917[1].method1186(31867) < 100) {
                    return 0;
                }
            }
            class132.method836(class275.field3370, (byte) -57);
            class165.method1031(class275.field3370, 0);
            class313.method1860(true, 1);
        }
        if (class92.field959 == class593.field8367) {
            for (int var17 = 0; var17 < 4; var17++) {
                class205.field2430[var17] = class397.method2437(-1, class153.field1677, class489.field6976);
            }
        }
        if (class92.field959 == class593.field8368) {
            class394.field5410 = class683.method3869(false, 1, true, 8);
            class441.field6401 = class683.method3869(false, 1, true, 0);
            class448.field6461 = class683.method3869(false, 1, true, 1);
            class65.field663 = class683.method3869(false, 1, true, 2);
            class688.field9715 = class683.method3869(false, 1, true, 3);
            class296.field3674 = class683.method3869(false, 1, true, 4);
            class154.field1692 = class683.method3869(true, 1, arg0, 5);
            class464.field6622 = class683.method3869(true, 1, true, 6);
            class557.field7980 = class683.method3869(false, 1, true, 7);
            class251.field3038 = class683.method3869(false, 1, true, 9);
            class289.field3568 = class683.method3869(false, 1, arg0, 10);
            class646.field9233 = class683.method3869(false, 1, arg0, 11);
            class544.field7827 = class683.method3869(false, 1, true, 12);
            class88.field921 = class683.method3869(false, 1, true, 14);
            class266.field3304 = class683.method3869(false, 1, true, 15);
            class203.field2401 = class683.method3869(false, 1, true, 16);
            class378.field5181 = class683.method3869(false, 1, true, 17);
            class650.field9287 = class683.method3869(false, 1, true, 18);
            class332.field4306 = class683.method3869(false, 1, true, 19);
            class745.field10405 = class683.method3869(false, 1, true, 20);
            class199.field2350 = class683.method3869(false, 1, true, 21);
            class453.field6520 = class683.method3869(false, 1, true, 22);
            class385.field5354 = class683.method3869(true, 1, true, 23);
            class384.field5352 = class683.method3869(false, 1, true, 24);
            class440.field6389 = class683.method3869(false, 1, true, 25);
            class654.field9332 = class683.method3869(true, 1, true, 26);
            class177.field2084 = class683.method3869(false, 1, true, 27);
            class472.field6758 = class683.method3869(true, 1, true, 28);
            class56.field567 = class683.method3869(false, 1, true, 29);
            class676.field9580 = class683.method3869(true, 1, true, 30);
            class179.field2100 = class683.method3869(true, 1, arg0, 31);
            class105.field1092 = class683.method3869(true, 2, arg0, 36);
        }
        if (class92.field959 == class593.field8369) {
            int var18 = 0;
            for (int var19 = 0; var19 < 37; var19++) {
                if (class24.field224[var19] != null) {
                    var18 += class24.field224[var19].method2127(99) * class157.field1730[var19] / 100;
                }
            }
            if (var18 != 100) {
                if (class295.field3627 < 0) {
                    class295.field3627 = var18;
                }
                return (var18 - class295.field3627) * 100 / (100 - class295.field3627);
            }
            class444.method2758(class394.field5410, arg0);
            class734.method4090(9260, class394.field5410, class70.method514(49152), class330.field4275);
        }
        if (class92.field959 == class593.field8370) {
            if (class581.field8216 == -1) {
                class581.field8216 = class464.field6622.method2474(88, "scape main");
            }
            class236.method1397(22050);
            class313.method1860(true, 2);
        }
        if (class92.field959 == class593.field8371) {
            class659.method3755(class676.field9580, (byte) 4, class289.field3549);
        }
        if (class92.field959 == class593.field8372) {
            int var20 = class50.method293((byte) 48);
            if (var20 < 100) {
                return var20;
            }
            class737.method4110(0, class472.field6758.method2472(!arg0, 1));
            class291.method1733(class472.field6758.method2472(false, 3), (byte) -128);
        }
        if (class92.field959 == class593.field8373) {
            if (class166.field1851 != -1 && !class557.field7980.method2493(class166.field1851, 0, (byte) -101)) {
                return 99;
            }
            class100.field1044 = new class719(class654.field9332, class251.field3038, class394.field5410);
            class84.field884 = new class21(class99.field1034, class489.field6978, class65.field663);
            class182.field2148 = new class428(class99.field1034, class489.field6978, class65.field663);
            class184.field2207 = new class79(class99.field1034, class489.field6978, class65.field663, class394.field5410);
            class279.field3429 = new class234(class99.field1034, class489.field6978, class378.field5181);
            class35.field382 = new class156(class99.field1034, class489.field6978, class65.field663);
            class147.field1641 = new class553(class99.field1034, class489.field6978, class65.field663);
            class606.field8619 = new class544(class99.field1034, class489.field6978, class65.field663, class557.field7980);
            class740.field10336 = new class478(class99.field1034, class489.field6978, class65.field663);
            class56.field565 = new class329(class99.field1034, class489.field6978, class65.field663);
            class445.field6442 = new class711(class99.field1034, class489.field6978, true, class203.field2401, class557.field7980);
            class337.field4323 = new class344(class99.field1034, class489.field6978, class65.field663, class394.field5410);
            class119.field1233 = new class381(class99.field1034, class489.field6978, class65.field663, class394.field5410);
            class451.field6506 = new class28(class99.field1034, class489.field6978, true, class650.field9287, class557.field7980);
            class361.field4643 = new class146(class99.field1034, class489.field6978, true, class84.field884, class332.field4306, class557.field7980);
            class579.field8200 = new class359(class99.field1034, class489.field6978, class65.field663);
            class637.field9158 = new class317(class99.field1034, class489.field6978, class745.field10405, class441.field6401, class448.field6461);
            class430.field6249 = new class407(class99.field1034, class489.field6978, class65.field663);
            class82.field857 = new class224(class99.field1034, class489.field6978, class65.field663);
            class173.field2036 = new class202(class99.field1034, class489.field6978, class199.field2350, class557.field7980);
            class724.field10140 = new class735(class99.field1034, class489.field6978, class65.field663);
            class343.field4450 = new class476(class99.field1034, class489.field6978, class65.field663);
            class722.field10123 = new class747(class99.field1034, class489.field6978, class65.field663);
            class628.field9019 = new class239(class99.field1034, class489.field6978, class453.field6520);
            class422.field6147 = new class334(class99.field1034, class489.field6978, class65.field663);
            class593.method3391(7451, class330.field4275, class557.field7980, class688.field9715, class394.field5410);
            class751.method4181(class56.field567, (byte) 111);
            class314.field3922 = new class387(class489.field6978, class384.field5352, class440.field6389);
            class3.field18 = new class728(class489.field6978, class384.field5352, class440.field6389, new class242());
            class324.method1933(true);
            class445.field6442.method3973(108, class654.field9334.field9858.method2982(53) == 0);
            class722.field10125 = new class718();
            class598.method3406((byte) 109);
            class156.method961(1, class177.field2084);
            class740.method4121(-1, class557.field7980, class100.field1044);
            class463 var21 = new class463(class289.field3568.method2471((byte) -57, "huffman", ""));
            class315.method1879(var21, 1705);
            try {
                jagmisc.init();
            } catch (Throwable var29) {
            }
            class635.field9137 = class379.method2332(-1);
            class463.field6618 = new class246(true, class289.field3549);
        }
        if (class92.field959 == class593.field8375) {
            int var22 = class595.method3397(94, class394.field5410) + class376.method2188(true, 0);
            int var23 = class444.method2753((byte) -16) + class427.method2664(2);
            if (var22 < var23) {
                return var22 * 100 / var23;
            }
        }
        if (class92.field959 == class593.field8376) {
            class656.method3733(class385.field5354, class35.field382, class147.field1641, class445.field6442, class337.field4323, class119.field1233, class722.field10125);
        }
        if (class92.field959 == class593.field8377) {
            class615.field8823 = new String[class343.field4450.field6779];
            class417.field5905 = new boolean[class722.field10123.field10419];
            class217.field2518 = new int[class722.field10123.field10419];
            for (int var24 = 0; var24 < class722.field10123.field10419; var24++) {
                if (class722.field10123.method4153(var24, (byte) 56).field8028 == 0) {
                    class417.field5905[var24] = true;
                    class278.field3418++;
                }
                class217.field2518[var24] = -1;
            }
            class288.method1713(true);
            class417.field5795 = class688.field9715.method2474(80, "loginscreen");
            class633.field9105 = class688.field9715.method2474(68, "lobbyscreen");
            class154.field1692.method2485(false, true, (byte) -128);
            class464.field6622.method2485(true, true, (byte) -121);
            class394.field5410.method2485(true, true, (byte) -121);
            class330.field4275.method2485(true, true, (byte) -125);
            class289.field3568.method2485(true, true, (byte) -125);
            class688.field9715.method2485(true, true, (byte) -124);
            class65.field663.field5531 = 2;
            class204.field2414 = true;
            class378.field5181.field5531 = 2;
            class203.field2401.field5531 = 2;
            class650.field9287.field5531 = 2;
            class332.field4306.field5531 = 2;
            class745.field10405.field5531 = 2;
            class199.field2350.field5531 = 2;
        }
        if (class92.field959 == class593.field8378) {
            if (!class650.method3697(0, class417.field5795)) {
                return 0;
            }
            boolean var25 = true;
            for (int var26 = 0; var26 < class643.field9209[class417.field5795].length; var26++) {
                class532 var27 = class643.field9209[class417.field5795][var26];
                if (var27.field7543 == 5 && var27.field7703 != -1 && !class394.field5410.method2493(var27.field7703, 0, (byte) -118)) {
                    var25 = false;
                }
            }
            if (!var25) {
                return 0;
            }
        }
        if (class92.field959 == class593.field8379) {
            class373.method2165(true, 1735429097);
        }
        if (!arg0) {
            field10524 = -51;
        }
        if (class92.field959 == class593.field8380) {
            class188.field2237.method4055((byte) -125);
            try {
                class736.field10294.join();
            } catch (InterruptedException var28) {
                return 0;
            }
            class743.field10380 = null;
            class399.field5466 = null;
            class311.field3861 = null;
            class188.field2237 = null;
            class87.field917 = null;
            class736.field10294 = null;
            class409.method2512((byte) -30);
            class579.field8199 = class654.field9334.field9871.method248(48) == 1;
            class654.field9334.method3924(true, class654.field9334.field9871, 1);
            if (class579.field8199) {
                class654.field9334.method3924(true, class654.field9334.field9835, 0);
            } else if (class654.field9334.field9835.field3064 && class463.field6618.field2979 < 512 && class463.field6618.field2979 != 0) {
                class654.field9334.method3924(true, class654.field9334.field9835, 0);
            }
            class37.method168((byte) 109);
            if (class579.field8199) {
                class627.method3597(false, 0, -31618);
            } else {
                class627.method3597(false, class654.field9334.field9835.method1512(-127), -31618);
            }
            class191.method1162(-1, -1, (byte) 124, class654.field9334.field9843.method2453(67), false);
            class132.method836(class275.field3370, (byte) -57);
            class165.method1031(class275.field3370, 0);
            class667.method3791(class394.field5410, 0, class275.field3370);
            class634.method3640(-21722, class323.field4118);
        }
        return class459.method2808(-3263);
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)I")
    public static final int method4192(int arg0) {
        field10511++;
        return class3.field27 == arg0 ? class305.field3808 : 0;
    }
}
