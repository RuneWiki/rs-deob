import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class51 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lrc;")
    public static class105 field1066 = class43.method374("Anmelde)2Limit -Uberschritten)3", 0);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field1069 = -1;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lrc;")
    private static class105 field1068 = class43.method374("Examine", 0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "[Lrc;")
    public static class105[] field1067 = new class105[1000];

    @OriginalMember(owner = "client!ic", name = "g", descriptor = "Lrc;")
    public static class105 field1072 = class43.method374("Fertigkeit)2", 0);

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lrc;")
    private static class105 field1078 = class43.method374("Loaded wordpack", 0);

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "Lrc;")
    public static class105 field1071 = field1078;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "Lrc;")
    public static class105 field1070 = class43.method374("Spiel)2Fenster geladen)3", 0);

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Lrc;")
    private static class105 field1081 = class43.method374("Loaded title screen", 0);

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Lrc;")
    public static class105 field1082 = field1068;

    @OriginalMember(owner = "client!ic", name = "k", descriptor = "Lrc;")
    public static class105 field1076 = field1081;

    @OriginalMember(owner = "client!ic", name = "h", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "[Leb;")
    public static class27[] field1080;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V", line = 33)
    public static final void method399(int arg0) {
        class18.field389.method790((byte) -76);
        field1074++;
        int var1 = class18.field389.method785(205, arg0);
        if (class133.field3229 > var1) {
            for (int var2 = var1; var2 < class133.field3229; var2++) {
                class73.field1602[class58.field1237++] = class24.field578[var2];
            }
        }
        if (class133.field3229 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class133.field3229 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class24.field578[var3];
            class115 var5 = class19.field466[var4];
            int var6 = class18.field389.method785(205, 1);
            if (var6 == 0) {
                class24.field578[class133.field3229++] = var4;
                var5.field1269 = class104.field2351;
            } else {
                int var7 = class18.field389.method785(205, 2);
                if (var7 == 0) {
                    class24.field578[class133.field3229++] = var4;
                    var5.field1269 = class104.field2351;
                    class122.field3001[class76.field1701++] = var4;
                } else if (var7 == 1) {
                    class24.field578[class133.field3229++] = var4;
                    var5.field1269 = class104.field2351;
                    int var8 = class18.field389.method785(205, 3);
                    var5.method468(var8, 5, false);
                    int var9 = class18.field389.method785(205, 1);
                    if (var9 == 1) {
                        class122.field3001[class76.field1701++] = var4;
                    }
                } else if (var7 == 2) {
                    class24.field578[class133.field3229++] = var4;
                    var5.field1269 = class104.field2351;
                    int var10 = class18.field389.method785(205, 3);
                    var5.method468(var10, arg0 - 3, true);
                    int var11 = class18.field389.method785(205, 3);
                    var5.method468(var11, 5, true);
                    int var12 = class18.field389.method785(arg0 ^ 0xC5, 1);
                    if (var12 == 1) {
                        class122.field3001[class76.field1701++] = var4;
                    }
                } else if (var7 == 3) {
                    class73.field1602[class58.field1237++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ILpb;Ljava/awt/Component;Lpb;)V", line = 139)
    public static final void method400(int arg0, class92 arg1, Component arg2, class92 arg3) {
        field1077++;
        if (class17.field369) {
            return;
        }
        class45.field1014 = class86.method712(115, 265, 128, arg2);
        class69.method583();
        class133.field3234 = class86.method712(-51, 265, 128, arg2);
        class69.method583();
        class37.field861 = class86.method712(arg0 + 59, 171, 509, arg2);
        class69.method583();
        class123.field3028 = class86.method712(-55, 132, 360, arg2);
        class69.method583();
        class59.field1320 = class86.method712(88, 200, 360, arg2);
        class69.method583();
        class128.field3107 = class86.method712(-30, 238, 202, arg2);
        class69.method583();
        class37.field853 = class86.method712(78, 238, 203, arg2);
        class69.method583();
        class96.field2212 = class86.method712(-101, 94, 74, arg2);
        class69.method583();
        class10.field208 = class86.method712(85, 94, 75, arg2);
        class69.method583();
        byte[] var4 = arg3.method769(class112.field2640, false, class37.field858);
        class27 var5 = new class27(var4, arg2);
        class45.field1014.method323(arg0 - 64);
        var5.method264(0, 0);
        class133.field3234.method323(0);
        var5.method264(-637, 0);
        class37.field861.method323(arg0 - 64);
        var5.method264(-128, 0);
        class123.field3028.method323(arg0 ^ arg0);
        var5.method264(-202, -371);
        class59.field1320.method323(0);
        var5.method264(-202, -171);
        class128.field3107.method323(arg0 ^ 0x40);
        var5.method264(0, -265);
        class37.field853.method323(0);
        var5.method264(-562, -265);
        class96.field2212.method323(0);
        var5.method264(-128, -171);
        class10.field208.method323(0);
        var5.method264(-562, -171);
        int[] var6 = new int[var5.field614];
        for (int var7 = 0; var7 < var5.field610; var7++) {
            for (int var23 = 0; var23 < var5.field614; var23++) {
                var6[var23] = var5.field613[var5.field614 * var7 + var5.field614 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field614; var24++) {
                var5.field613[var5.field614 * var7 + var24] = var6[var24];
            }
        }
        class45.field1014.method323(arg0 - 64);
        var5.method264(382, 0);
        class133.field3234.method323(0);
        var5.method264(-255, 0);
        class37.field861.method323(0);
        var5.method264(254, 0);
        class123.field3028.method323(arg0 ^ 0x40);
        var5.method264(180, -371);
        class59.field1320.method323(0);
        var5.method264(180, -171);
        class128.field3107.method323(0);
        var5.method264(382, -265);
        class37.field853.method323(arg0 - 64);
        var5.method264(-180, -265);
        class96.field2212.method323(0);
        var5.method264(254, -171);
        class10.field208.method323(arg0 - 64);
        var5.method264(-180, -171);
        class27 var8 = class88.method722(class37.field858, arg1, true, class24.field585);
        class37.field861.method323(0);
        var8.method265(254 - var8.field614 / 2, 18);
        class6.field66 = class85.method711(class28.field631, class37.field858, 768133190, arg1);
        class19.field449 = class85.method711(class110.field2551, class37.field858, arg0 ^ 0x2DC8C806, arg1);
        class65.field1456 = class61.method488(arg1, class37.field858, class133.field3226, arg0 - 74);
        class92.field2156 = new class27(128, 265);
        class35.field824 = new class27(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class92.field2156.field613[var9] = class45.field1014.field789[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class35.field824.field613[var10] = class133.field3234.field789[var10];
        }
        class76.field1711 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class76.field1711[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class76.field1711[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class76.field1711[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class76.field1711[var14 + 192] = 16777215;
        }
        class74.field1647 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class74.field1647[var15] = var15 * 1024;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class74.field1647[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class74.field1647[var17 + 128] = var17 * 262144 + 65535;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class74.field1647[var18 + 192] = 16777215;
        }
        class71.field1564 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class71.field1564[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class71.field1564[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class71.field1564[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class71.field1564[var22 + 192] = 16777215;
        }
        class111.field2566 = new int[256];
        class97.field2241 = new int[32768];
        class29.field668 = new int[32768];
        class107.method870(17, null);
        class37.field855 = class37.field858;
        class37.field850 = class37.field858;
        class9.field173 = 0;
        class41.field926 = new int[32768];
        class127.field3081 = new int[32768];
        if (class116.field2700 == 0 || class109.field2520) {
            class96.method802((byte) 70, 10);
        } else {
            class96.method800(false, arg0 ^ 0xFFFFFFB5, 0, class58.field1212, class37.field858, class116.field2700, class57.field1203, 10);
        }
        class41.method366(arg0 ^ 0x42, false);
        class17.field369 = true;
        class67.field1506 = true;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V", line = 357)
    public static void method401(int arg0) {
        field1081 = null;
        field1072 = null;
        field1071 = null;
        field1082 = null;
        if (arg0 != 0) {
            return;
        }
        field1076 = null;
        field1078 = null;
        field1070 = null;
        field1068 = null;
        field1066 = null;
        field1080 = null;
        field1067 = null;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III)I")
    public abstract int method304(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public abstract void method305(byte arg0);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public abstract void method306(byte arg0);
}
