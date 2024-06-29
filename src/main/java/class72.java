import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class72 {

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "I")
    public int field1433 = 0;

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "I")
    public int field1424 = 0;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "[J")
    public static long[] field1430 = new long[100];

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "Lsd;")
    private static class166 field1436 = class135.method935("Use", 0);

    @OriginalMember(owner = "client!hh", name = "f", descriptor = "Lsd;")
    public static class166 field1426 = field1436;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "I")
    public int field1425;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "I")
    public int field1429;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "I")
    public int field1432;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public int field1434;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "Led;")
    public class42 field1435;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "Led;")
    public class42 field1438;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "Lf;")
    public static class47 field1431;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "Lha;")
    public static class65 field1427;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IILsd;Lsd;IIZ)V")
    public static final void method571(int arg0, int arg1, class166 arg2, class166 arg3, int arg4, int arg5, boolean arg6) {
        field1421++;
        if (class192.field3654 || (arg6 || class160.field3064 >= 500)) {
            return;
        }
        class11.field197[class160.field3064] = arg2;
        class182.field3462[class160.field3064] = arg3;
        class200.field3970[class160.field3064] = arg4;
        class161.field3081[class160.field3064] = arg0;
        class16.field262[class160.field3064] = arg1;
        class56.field1092[class160.field3064] = arg5;
        class160.field3064++;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(Lf;Lf;ILjava/awt/Component;)V")
    public static final void method572(class47 arg0, class47 arg1, int arg2, Component arg3) {
        field1437++;
        if (class93.field1828) {
            return;
        }
        class17.method99();
        byte[] var4 = arg0.method359(class12.field218, true, class12.field225);
        class76.field1547 = new class158(var4, arg3);
        class43.field773 = class76.field1547.method1074();
        class43.field783 = class18.method113(class12.field225, arg1, class132.field2570, -84);
        class42.field746 = class18.method113(class12.field225, arg1, class178.field3374, -78);
        class161.field3082 = class18.method113(class12.field225, arg1, class162.field3090, -88);
        class53.field984 = class84.method678(arg1, class12.field225, (byte) 125, class89.field1754);
        class12.field232 = class84.method678(arg1, class12.field225, (byte) 125, class19.field336);
        class199.field3959 = new int[256];
        int var5 = 0;
        if (arg2 < 40) {
            return;
        }
        while (var5 < 64) {
            class199.field3959[var5] = var5 * 262144;
            var5++;
        }
        for (int var6 = 0; var6 < 64; var6++) {
            class199.field3959[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class199.field3959[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class199.field3959[var8 + 192] = 16777215;
        }
        class177.field3342 = new int[256];
        for (int var9 = 0; var9 < 64; var9++) {
            class177.field3342[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; var10++) {
            class177.field3342[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class177.field3342[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class177.field3342[var12 + 192] = 16777215;
        }
        class92.field1812 = new int[256];
        for (int var13 = 0; var13 < 64; var13++) {
            class92.field1812[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class92.field1812[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class92.field1812[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class92.field1812[var16 + 192] = 16777215;
        }
        class41.field743 = new int[32768];
        class95.field1836 = new int[32768];
        class135.field2642 = new int[256];
        class132.method927(null, (byte) -117);
        if (class79.field1622 == 0) {
            class120.field2355 = true;
        } else {
            class120.field2355 = false;
        }
        class19.field341 = new int[32768];
        class12.field235 = class12.field225;
        class172.field3299 = 0;
        class12.field236 = class12.field225;
        class117.field2265 = false;
        class2.field23 = new int[32768];
        if (class120.field2355) {
            class53.method418(0, 2);
        } else {
            class199.method1317(class11.field213, class199.field3939, 2, 255, class12.field225, 7733, false);
        }
        class49.method378((byte) -122, false);
        class93.field1828 = true;
        class76.field1547.method1051(0, 0);
        class43.field773.method1051(382, 0);
        class43.field783.method731(382 - class43.field783.field1852 / 2, 18);
        class35.field657 = new class158(128, 254);
        class59.field1215 = new class158(128, 254);
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(I)V")
    public static final void method573(int arg0) {
        while (true) {
            if (class179.field3377.method702(class19.field335, -95) >= 11) {
                int var1 = class179.field3377.method708(8, 11);
                if (var1 != 2047) {
                    boolean var2 = false;
                    if (class182.field3451[var1] == null) {
                        class182.field3451[var1] = new class123();
                        if (class89.field1762[var1] != null) {
                            class182.field3451[var1].method883(class89.field1762[var1], -2);
                        }
                        var2 = true;
                    }
                    class53.field967[class6.field131++] = var1;
                    class123 var3 = class182.field3451[var1];
                    var3.field3535 = class49.field910;
                    int var4 = class179.field3377.method708(8, 1);
                    if (var4 == 1) {
                        class2.field11[class206.field4058++] = var1;
                    }
                    int var5 = class62.field1273[class179.field3377.method708(8, 3)];
                    if (var2) {
                        var3.field3489 = var3.field3488 = var5;
                    }
                    int var6 = class179.field3377.method708(8, 1);
                    int var7 = class179.field3377.method708(8, 5);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = class179.field3377.method708(8, 5);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.method1242(class41.field728.field3554[0] + var8, 111, var6 == 1, class41.field728.field3521[0] + var7);
                    continue;
                }
            }
            if (arg0 > -6) {
                method573(109);
            }
            class179.field3377.method711((byte) 102);
            field1423++;
            return;
        }
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(I)V")
    public static void method574(int arg0) {
        field1436 = null;
        field1426 = null;
        if (arg0 != 192) {
            method571(41, 89, null, null, -115, -73, true);
        }
        field1430 = null;
        field1427 = null;
        field1431 = null;
    }
}
