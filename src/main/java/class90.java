import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class90 {

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "I")
    public int field1607 = 128;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public int field1612 = 128;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "I")
    public int field1609;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public int field1615;

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "Lfea;")
    public static class47 field1611;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "Lbv;")
    public static class567 field1616;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "Z")
    public static boolean field1620;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "Lpp;")
    public static class464 field1617;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "[I")
    public static int[] field1622;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public int field1603;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public int field1605;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "I")
    public static int field1606;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public int field1618;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public int field1619;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "[[[J")
    public static long[][][] field1621;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIB[BI[B)V")
    public static final void method802(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, byte[] arg6, int arg7, byte[] arg8) {
        if (arg5 != -10) {
            return;
        }
        field1613++;
        int var9 = -(arg3 >> 2);
        int var10 = -(arg3 & 0x3);
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg7++;
                arg6[var10001] = (byte) (arg6[var10001] - arg8[arg4++]);
                int var14 = arg7++;
                arg6[var14] = (byte) (arg6[var14] - arg8[arg4++]);
                int var15 = arg7++;
                arg6[var15] = (byte) (arg6[var15] - arg8[arg4++]);
                int var16 = arg7++;
                arg6[var16] = (byte) (arg6[var16] - arg8[arg4++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg7++;
                arg6[var10001] = (byte) (arg6[var10001] - arg8[arg4++]);
            }
            arg4 += arg1;
            arg7 += arg2;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V")
    public static void method803(int arg0) {
        field1621 = null;
        field1616 = null;
        field1622 = null;
        field1611 = null;
        if (arg0 != 270) {
            field1617 = null;
        }
        field1617 = null;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)Ltq;")
    public final class90 method804(byte arg0) {
        if (arg0 < 14) {
            return null;
        } else {
            field1606++;
            return new class90(this.field1604, this.field1607, this.field1612, this.field1615, this.field1609, this.field1608);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILtq;)V")
    public final void method805(int arg0, class90 arg1) {
        this.field1608 = arg1.field1608;
        this.field1615 = arg1.field1615;
        if (arg0 > -62) {
            return;
        }
        this.field1612 = arg1.field1612;
        this.field1604 = arg1.field1604;
        this.field1607 = arg1.field1607;
        field1614++;
        this.field1609 = arg1.field1609;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(I)V")
    public class90(int arg0) {
        this.field1604 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V")
    public static final void method806(byte arg0) {
        field1602++;
        class327.method2039(false, 0);
        class179.field2612 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class563.field8070.length; var2++) {
            if (class265.field3877[var2] != -1 && class563.field8070[var2] == null) {
                class563.field8070[var2] = class597.field8501.method3175(0, (byte) -53, class265.field3877[var2]);
                if (class563.field8070[var2] == null) {
                    var1 = false;
                    class179.field2612++;
                }
            }
            if (class142.field2215[var2] != -1 && class179.field2602[var2] == null) {
                class179.field2602[var2] = class597.field8501.method3183(7064, class210.field2969[var2], 0, class142.field2215[var2]);
                if (class179.field2602[var2] == null) {
                    class179.field2612++;
                    var1 = false;
                }
            }
            if (class142.field2219[var2] != -1 && class648.field9390[var2] == null) {
                class648.field9390[var2] = class597.field8501.method3175(0, (byte) -53, class142.field2219[var2]);
                if (class648.field9390[var2] == null) {
                    class179.field2612++;
                    var1 = false;
                }
            }
            if (class443.field6477[var2] != -1 && class166.field2426[var2] == null) {
                class166.field2426[var2] = class597.field8501.method3175(0, (byte) -53, class443.field6477[var2]);
                if (class166.field2426[var2] == null) {
                    var1 = false;
                    class179.field2612++;
                }
            }
            if (class469.field6758 != null && class543.field7574[var2] == null && class469.field6758[var2] != -1) {
                class543.field7574[var2] = class597.field8501.method3183(7064, class210.field2969[var2], 0, class469.field6758[var2]);
                if (class543.field7574[var2] == null) {
                    var1 = false;
                    class179.field2612++;
                }
            }
        }
        if (class254.field3704 == null) {
            if (class133.field2155 == null || !class421.field6184.method3169(class133.field2155.field9365 + "_staticelements", 118)) {
                class254.field3704 = new class313(0);
            } else if (class421.field6184.method3168((byte) -106, class133.field2155.field9365 + "_staticelements")) {
                class254.field3704 = class37.method324(class56.field800, class133.field2155.field9365 + "_staticelements", 0, class421.field6184);
            } else {
                class179.field2612++;
                var1 = false;
            }
        }
        if (!var1) {
            class534.field7460 = 1;
            return;
        }
        boolean var3 = true;
        class583.field8317 = 0;
        for (int var4 = 0; var4 < class563.field8070.length; var4++) {
            byte[] var20 = class179.field2602[var4];
            if (var20 != null) {
                int var21 = (class43.field584[var4] >> 8) * 64 - class382.field5687;
                int var22 = (class43.field584[var4] & 0xFF) * 64 - class597.field8500;
                if (class234.field3439 != 0) {
                    var22 = 10;
                    var21 = 10;
                }
                var3 &= class7.method28(var22, class146.field2247, var21, class66.field990, true, var20);
            }
            byte[] var23 = class166.field2426[var4];
            if (var23 != null) {
                int var24 = (class43.field584[var4] >> 8) * 64 - class382.field5687;
                int var25 = (class43.field584[var4] & 0xFF) * 64 - class597.field8500;
                if (class234.field3439 != 0) {
                    var25 = 10;
                    var24 = 10;
                }
                var3 &= class7.method28(var25, class146.field2247, var24, class66.field990, true, var23);
            }
        }
        if (!var3) {
            class534.field7460 = 2;
            return;
        }
        if (class534.field7460 != 0) {
            class247.method1570(class130.field2119.method3220(false, class538.field7500) + "<br>(100%)", class409.field6077, true, 15900);
        }
        class547.method3064((byte) 112);
        class414.method2504(29);
        boolean var5 = false;
        if (class159.field2378.method529() && class202.field2854.field7898) {
            for (int var6 = 0; var6 < class563.field8070.length; var6++) {
                if (class166.field2426[var6] != null || class648.field9390[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class202.field2854.field7919) {
            var7 = class339.field4884[class68.field1287];
        } else {
            var7 = class42.field581[class68.field1287];
        }
        if (class159.field2378.method618()) {
            var7++;
        }
        class488.method2790(7, 4, class146.field2247, class66.field990, var7, var5, class159.field2378.method612() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class268.field3916[var8].method329(-118);
        }
        class420.method2529((byte) 0);
        class77.method727(false, true);
        class594.method3392(6);
        class614.field8712 = false;
        class580.field8259 = null;
        class547.method3064((byte) -48);
        System.gc();
        class327.method2039(true, 0);
        class128.method1006((byte) 114);
        class216.field3265 = class202.field2854.method3143(class646.field9388, 0);
        class170.field2491 = class555.field7861 >= 96;
        class308.field4438 = class202.field2854.field7898;
        class128.field2092 = class202.field2854.method3140(class646.field9388, 2);
        class484.field6854 = !class202.field2854.field7891;
        class581.field8287 = class202.field2854.method2628((byte) 68, class646.field9388) ? -1 : class466.field6714;
        class609.field8657 = class141.method1053(class646.field9388, 122) || class202.field2854.field7895;
        class43.field590 = class202.field2854.field7893;
        class406.field6026 = new class568(4, class146.field2247, class66.field990, false);
        if (class234.field3439 == 0) {
            class153.method1088(class406.field6026, false, class563.field8070);
        } else {
            class640.method3693(class406.field6026, 109, class563.field8070);
        }
        class414.method2503(class66.field990 >> 4, (byte) 29, class146.field2247 >> 4);
        class561.method3194(true);
        if (var5) {
            class555.method3111(true);
            class129.field2111 = new class568(1, class146.field2247, class66.field990, true);
            if (class234.field3439 == 0) {
                class153.method1088(class129.field2111, false, class648.field9390);
                class327.method2039(true, 0);
            } else {
                class640.method3693(class129.field2111, 28, class648.field9390);
                class327.method2039(true, 0);
            }
            class129.field2111.method504(class406.field6026.field881[0], true, 0);
            class129.field2111.method499(class159.field2378, 0, null, null);
            class555.method3111(false);
        }
        class406.field6026.method499(class159.field2378, 0, class268.field3916, var5 ? class129.field2111.field881 : null);
        if (class234.field3439 == 0) {
            class327.method2039(true, 0);
            class442.method2616(class406.field6026, class179.field2602, 1567680040);
            if (class543.field7574 != null) {
                class573.method3281(115);
            }
        } else {
            class327.method2039(true, 0);
            class340.method2087(class406.field6026, class179.field2602, 8);
        }
        class414.method2504(76);
        if (class555.field7861 < 96) {
            class458.method2684(-91);
        }
        class327.method2039(true, 0);
        class406.field6026.method492(class159.field2378, (byte) -105, null, var5 ? class73.field1360[0] : null);
        class406.field6026.method3225(false, class159.field2378);
        class327.method2039(true, 0);
        if (var5) {
            class555.method3111(true);
            class327.method2039(true, 0);
            if (class234.field3439 == 0) {
                class442.method2616(class129.field2111, class166.field2426, 1567680040);
            } else {
                class340.method2087(class129.field2111, class166.field2426, 8);
            }
            class414.method2504(103);
            class327.method2039(true, 0);
            class129.field2111.method492(class159.field2378, (byte) -106, class587.field8363[0], null);
            class129.field2111.method3225(false, class159.field2378);
            class327.method2039(true, 0);
            class555.method3111(false);
        }
        class579.method3313(15731);
        int var9 = class406.field6026.field8113;
        if (var9 > class545.field7583) {
            var9 = class545.field7583;
        }
        if ((class545.field7583 - 1) > var9) {
            var9 = class545.field7583 - 1;
        }
        if (class202.field2854.method2628((byte) 68, class646.field9388)) {
            class37.method325(0);
        } else {
            class37.method325(var9);
        }
        int var10 = 105 % ((arg0 + 46) / 61);
        for (int var11 = 0; var11 < 4; var11++) {
            for (int var18 = 0; var18 < class146.field2247; var18++) {
                for (int var19 = 0; var19 < class66.field990; var19++) {
                    class297.method1862(var19, var18, 4694638, var11);
                }
            }
        }
        class531.method2994(-15);
        class547.method3064((byte) -109);
        class590.method3376(-24608);
        class414.method2504(116);
        class501.method2847(77);
        if (class327.field4718 != null && client.field8770 != null && class64.field893 == 10) {
            class87.field1587++;
            class624.method3537(-103, class219.field3292);
            class127.field2088.method1702(1057001181, false);
        }
        if (class234.field3439 == 0) {
            int var12 = (class559.field7931 - (class146.field2247 >> 4)) / 8;
            int var13 = ((class146.field2247 >> 4) + class559.field7931) / 8;
            int var14 = (class533.field7443 - (class66.field990 >> 4)) / 8;
            int var15 = (class533.field7443 + (class66.field990 >> 4)) / 8;
            for (int var16 = var12 - 1; var16 <= (var13 + 1); var16++) {
                for (int var17 = var14 - 1; var17 <= (var15 + 1); var17++) {
                    if (var12 > var16 || var16 > var13 || var14 > var17 || var15 < var17) {
                        class597.field8501.method3179("m" + var16 + "_" + var17, false);
                        class597.field8501.method3179("l" + var16 + "_" + var17, false);
                    }
                }
            }
        }
        if (class64.field893 == 3) {
            class307.method1904(true, 2);
        } else if (class64.field893 == 7) {
            class307.method1904(true, 6);
        } else {
            class307.method1904(true, 9);
            if (client.field8770 != null) {
                class624.method3537(-81, class251.field3682);
            }
        }
        class94.method824(-1);
        class547.method3064((byte) 73);
        class369.method2229(-84);
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIII)V")
    private class90(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1609 = arg4;
        this.field1608 = arg5;
        this.field1615 = arg3;
        this.field1607 = arg1;
        this.field1604 = arg0;
        this.field1612 = arg2;
    }

    static {
        new class567("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field1611 = new class47();
        field1616 = new class567("Loading SW3D - ", "Lade SW3D - ", "Chargement SW3D - ", "Carregando SW3D - ");
        field1620 = false;
        field1617 = new class464(33, 3);
        field1622 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };
    }
}
