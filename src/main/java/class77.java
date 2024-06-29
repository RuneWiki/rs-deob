import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class77 extends class291 {

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1009 = null;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "Lfc;")
    public static class174 field1002 = new class174(64);

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "Lkn;")
    public static class530 field1012 = new class530("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public int field1004;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public int field1005;

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "I")
    public int field1006;

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "I")
    public int field1007;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Ljg;")
    public class228 field1003;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static final void method593(int arg0) {
        field1011++;
        class295.method1820(false, (byte) 27);
        class369.field5270 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class502.field7100.length; var2++) {
            if (class422.field5944[var2] != -1 && class502.field7100[var2] == null) {
                class502.field7100[var2] = class189.field2710.method426(class422.field5944[var2], (byte) 9, 0);
                if (class502.field7100[var2] == null) {
                    var1 = false;
                    class369.field5270++;
                }
            }
            if (class45.field519[var2] != -1 && class104.field1371[var2] == null) {
                class104.field1371[var2] = class189.field2710.method423(class326.field4755[var2], 0, 1, class45.field519[var2]);
                if (class104.field1371[var2] == null) {
                    var1 = false;
                    class369.field5270++;
                }
            }
            if (class414.field5848[var2] != -1 && class518.field7630[var2] == null) {
                class518.field7630[var2] = class189.field2710.method426(class414.field5848[var2], (byte) 9, 0);
                if (class518.field7630[var2] == null) {
                    class369.field5270++;
                    var1 = false;
                }
            }
            if (class236.field3434[var2] != -1 && class196.field2778[var2] == null) {
                class196.field2778[var2] = class189.field2710.method426(class236.field3434[var2], (byte) 9, 0);
                if (class196.field2778[var2] == null) {
                    class369.field5270++;
                    var1 = false;
                }
            }
            if (class85.field1066 != null && class498.field7054[var2] == null && class85.field1066[var2] != -1) {
                class498.field7054[var2] = class189.field2710.method423(class326.field4755[var2], 0, arg0, class85.field1066[var2]);
                if (class498.field7054[var2] == null) {
                    var1 = false;
                    class369.field5270++;
                }
            }
        }
        if (class399.field5628 == null) {
            if (class165.field2430 == null || !class290.field4248.method439(class165.field2430.field4492 + "_staticelements", 0)) {
                class399.field5628 = new class259(0);
            } else if (class290.field4248.method443(false, class165.field2430.field4492 + "_staticelements")) {
                class399.field5628 = class391.method2262((byte) 47, class192.field2735, class165.field2430.field4492 + "_staticelements", class290.field4248);
            } else {
                class369.field5270++;
                var1 = false;
            }
        }
        if (!var1) {
            class120.field1660 = 1;
            return;
        }
        boolean var3 = true;
        class284.field4163 = 0;
        for (int var4 = 0; var4 < class502.field7100.length; var4++) {
            byte[] var19 = class104.field1371[var4];
            if (var19 != null) {
                int var20 = (class332.field4827[var4] >> 8) * 64 - class441.field6171;
                int var21 = (class332.field4827[var4] & 0xFF) * 64 - class367.field5241;
                if (class279.field4128 != 0) {
                    var21 = 10;
                    var20 = 10;
                }
                var3 &= class429.method2543(var20, var19, 0, class43.field494, class500.field7068, var21);
            }
            byte[] var22 = class196.field2778[var4];
            if (var22 != null) {
                int var23 = (class332.field4827[var4] >> 8) * 64 - class441.field6171;
                int var24 = (class332.field4827[var4] & 0xFF) * 64 - class367.field5241;
                if (class279.field4128 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class429.method2543(var23, var22, arg0 - 1, class43.field494, class500.field7068, var24);
            }
        }
        if (!var3) {
            class120.field1660 = 2;
            return;
        }
        if (class120.field1660 != 0) {
            class149.method930(true, class38.field415, class527.field7741.method3116(class149.field1979, (byte) 107) + "<br>(100%)", (byte) -118);
        }
        class322.method1949(14);
        class366.method2160(8560);
        boolean var5 = false;
        if (class385.field5414.method308() && class4.field81.field1428) {
            for (int var6 = 0; var6 < class502.field7100.length; var6++) {
                if (class196.field2778[var6] != null || class518.field7630[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class4.field81.field1438) {
            var7 = class131.field1725[class340.field4895];
        } else {
            var7 = class294.field4315[class340.field4895];
        }
        if (class385.field5414.method369()) {
            var7++;
        }
        class467.method2709(7, 4, class43.field494, class500.field7068, var7, var5, class385.field5414.method371() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class143.field1877[var8].method231(-4);
        }
        class247.method1589(arg0 - 1);
        class207.method1320((byte) -98, false);
        class64.method510(116);
        class74.field903 = null;
        class322.method1949(14);
        System.gc();
        class295.method1820(true, (byte) 27);
        class324.method1955(25);
        class326.field4753 = class4.field81.method726(class405.field5737, 7);
        class478.field6656 = class494.field6991 >= 96;
        class531.field7777 = class4.field81.field1428;
        class172.field2497 = class4.field81.method728(false, class405.field5737);
        class362.field5184 = !class4.field81.field1450;
        class6.field95 = class4.field81.method1791(~arg0, class405.field5737) ? -1 : class146.field1941;
        class254.field3758 = class4.field81.field1412;
        class129.field1721 = class405.field5737 == arg0 || class4.field81.field1439;
        class450.field6304 = new class388(4, class43.field494, class500.field7068, false);
        if (class279.field4128 == 0) {
            class73.method543(class502.field7100, class450.field6304, -128);
        } else {
            class466.method2702(8, class450.field6304, class502.field7100);
        }
        class96.method682(class500.field7068 >> 4, 128, class43.field494 >> 4);
        class32.method194(true);
        if (var5) {
            class521.method3083(true);
            class413.field5844 = new class388(1, class43.field494, class500.field7068, true);
            if (class279.field4128 == 0) {
                class73.method543(class518.field7630, class413.field5844, -126);
                class295.method1820(true, (byte) 27);
            } else {
                class466.method2702(8, class413.field5844, class518.field7630);
                class295.method1820(true, (byte) 27);
            }
            class413.field5844.method3119((byte) -120, 0, class450.field6304.field7791[0]);
            class413.field5844.method3127(class385.field5414, null, arg0 - 1, null);
            class521.method3083(false);
        }
        class450.field6304.method3127(class385.field5414, class143.field1877, arg0 - 1, var5 ? class413.field5844.field7791 : null);
        if (class279.field4128 == 0) {
            class295.method1820(true, (byte) 27);
            class226.method1389((byte) -104, class104.field1371, class450.field6304);
            if (class498.field7054 != null) {
                class239.method1506(61);
            }
        } else {
            class295.method1820(true, (byte) 27);
            class43.method252(class450.field6304, -19146, class104.field1371);
        }
        class366.method2160(8560);
        class295.method1820(true, (byte) 27);
        class450.field6304.method3131(class385.field5414, null, 118, var5 ? class60.field743[0] : null);
        class450.field6304.method2251((byte) 90, class385.field5414);
        class295.method1820(true, (byte) 27);
        if (var5) {
            class521.method3083(true);
            class295.method1820(true, (byte) 27);
            if (class279.field4128 == 0) {
                class226.method1389((byte) -117, class196.field2778, class413.field5844);
            } else {
                class43.method252(class413.field5844, -19146, class196.field2778);
            }
            class366.method2160(8560);
            class295.method1820(true, (byte) 27);
            class413.field5844.method3131(class385.field5414, class68.field858[0], arg0 + 115, null);
            class413.field5844.method2251((byte) 75, class385.field5414);
            class295.method1820(true, (byte) 27);
            class521.method3083(false);
        }
        class44.method253(true);
        int var9 = class450.field6304.field5447;
        if (var9 > class320.field4627) {
            var9 = class320.field4627;
        }
        if (var9 < class320.field4627 - 1) {
            var9 = class320.field4627 - 1;
        }
        if (class4.field81.method1791(~arg0, class405.field5737)) {
            class498.method2893(0);
        } else {
            class498.method2893(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class43.field494; var17++) {
                for (int var18 = 0; var18 < class500.field7068; var18++) {
                    class195.method1232(var17, var10, var18, arg0 + 4914);
                }
            }
        }
        class75.method559(-86);
        class322.method1949(14);
        class479.method2766((byte) 95);
        class366.method2160(arg0 ^ 0x2171);
        class436.field6121 = false;
        class97.method689((byte) 126);
        if (class81.field1052 != null && class50.field608 != null && class488.field6832 == 10) {
            class310.field4514++;
            class61.method498(class402.field5646, 1);
            class30.field357.method2354(1057001181, false);
        }
        if (class279.field4128 == 0) {
            int var11 = (class216.field3128 - (class43.field494 >> 4)) / 8;
            int var12 = ((class43.field494 >> 4) + class216.field3128) / 8;
            int var13 = (class341.field4945 - (class500.field7068 >> 4)) / 8;
            int var14 = (class341.field4945 + (class500.field7068 >> 4)) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var11 > var15 || var12 < var15 || var13 > var16 || var14 < var16) {
                        class189.field2710.method433(true, "m" + var15 + "_" + var16);
                        class189.field2710.method433(true, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class488.field6832 == 3) {
            class86.method623(2, (byte) 125);
        } else if (class488.field6832 == 7) {
            class86.method623(6, (byte) 113);
        } else {
            class86.method623(9, (byte) -40);
            if (class50.field608 != null) {
                class61.method498(class32.field371, 1);
            }
        }
        class442.method2592(arg0 + 18858);
        class322.method1949(14);
        class429.method2539(32);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
    public static void method594(boolean arg0) {
        if (arg0) {
            field1009 = null;
            field1012 = null;
            field1002 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)Z")
    public static final boolean method595(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field1010++;
            return (arg1 & 0x800) != 0;
        } else {
            return true;
        }
    }
}
