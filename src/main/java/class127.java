import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class127 {

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field2733 = 0;

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "Llc;")
    public static class69 field2739 = class69.method470((byte) -97, "invback");

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "Llc;")
    public static class69 field2742 = class69.method470((byte) -99, "p12_full");

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "Llc;")
    public static class69 field2737 = class69.method470((byte) -100, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Z")
    public static boolean field2738 = false;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "Llc;")
    public static class69 field2740 = class69.method470((byte) -110, " @yel@");

    @OriginalMember(owner = "client!wb", name = "o", descriptor = "Llc;")
    public static class69 field2745 = class69.method470((byte) -106, "Enter message to send to ");

    @OriginalMember(owner = "client!wb", name = "p", descriptor = "Llc;")
    public static class69 field2746 = class69.method470((byte) -114, "(U4");

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field2732;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "I")
    public static int field2735;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!wb", name = "m", descriptor = "I")
    public static int field2743;

    @OriginalMember(owner = "client!wb", name = "n", descriptor = "I")
    public static int field2744;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "Loa;")
    public static class85 field2736;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "Ljava/awt/Graphics;")
    public static Graphics field2731;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljava/awt/Component;ILkc;Lkc;)V")
    public static final void method931(Component arg0, int arg1, class63 arg2, class63 arg3) {
        field2734++;
        if (class10.field198) {
            return;
        }
        class11.field234 = class55.method345((byte) 108, arg0, 265, 128);
        class95.method729();
        class114.field2483 = class55.method345((byte) 108, arg0, 265, 128);
        class95.method729();
        class55.field1157 = class55.method345((byte) 108, arg0, 171, 509);
        class95.method729();
        class67.field1397 = class55.method345((byte) 108, arg0, 132, 360);
        class95.method729();
        class25.field551 = class55.method345((byte) 108, arg0, 200, 360);
        class95.method729();
        field2736 = class55.method345((byte) 108, arg0, 238, 202);
        class95.method729();
        client.field387 = class55.method345((byte) 108, arg0, 238, 203);
        class95.method729();
        class90.field1964 = class55.method345((byte) 108, arg0, 94, 74);
        class95.method729();
        class78.field1766 = class55.method345((byte) 108, arg0, 94, 75);
        class95.method729();
        byte[] var4 = arg2.method389(class71.field1590, class9.field193, (byte) 49);
        class20 var5 = new class20(var4, arg0);
        class11.field234.method606(-2);
        var5.method138(0, 0);
        class114.field2483.method606(-2);
        var5.method138(-637, 0);
        class55.field1157.method606(arg1 - 2);
        var5.method138(-128, 0);
        class67.field1397.method606(arg1 - 2);
        var5.method138(-202, -371);
        class25.field551.method606(arg1 ^ 0xFFFFFFFE);
        var5.method138(-202, -171);
        field2736.method606(-2);
        var5.method138(0, -265);
        client.field387.method606(-2);
        var5.method138(-562, -265);
        class90.field1964.method606(-2);
        var5.method138(-128, -171);
        class78.field1766.method606(-2);
        var5.method138(-562, -171);
        int[] var6 = new int[var5.field437];
        for (int var7 = 0; var7 < var5.field433; var7++) {
            for (int var23 = 0; var23 < var5.field437; var23++) {
                var6[var23] = var5.field439[var5.field437 * var7 + var5.field437 - var23 - 1];
            }
            for (int var24 = 0; var24 < var5.field437; var24++) {
                var5.field439[var24 + var5.field437 * var7] = var6[var24];
            }
        }
        class11.field234.method606(-2);
        var5.method138(382, 0);
        class114.field2483.method606(-2);
        var5.method138(-255, 0);
        class55.field1157.method606(-2);
        var5.method138(254, 0);
        class67.field1397.method606(-2);
        var5.method138(180, -371);
        class25.field551.method606(-2);
        var5.method138(180, -171);
        field2736.method606(arg1 - 2);
        var5.method138(382, -265);
        client.field387.method606(-2);
        var5.method138(-180, -265);
        class90.field1964.method606(-2);
        var5.method138(254, -171);
        class78.field1766.method606(arg1 ^ 0xFFFFFFFE);
        var5.method138(-180, -171);
        class20 var8 = class56.method349(arg3, (byte) 38, class71.field1582, class71.field1590);
        class55.field1157.method606(arg1 - 2);
        var8.method139(254 - var8.field437 / 2, 18);
        class120.field2571 = class10.method57((byte) 77, class104.field2254, arg3, class71.field1590);
        class22.field461 = class10.method57((byte) 77, class108.field2361, arg3, class71.field1590);
        class96.field2128 = class63.method393(class71.field1590, true, class98.field2154, arg3);
        class77.field1734 = new class20(128, 265);
        class82.field1848 = new class20(128, 265);
        for (int var9 = 0; var9 < 33920; var9++) {
            class77.field1734.field439[var9] = class11.field234.field1907[var9];
        }
        for (int var10 = 0; var10 < 33920; var10++) {
            class82.field1848.field439[var10] = class114.field2483.field1907[var10];
        }
        class17.field335 = new int[256];
        for (int var11 = 0; var11 < 64; var11++) {
            class17.field335[var11] = var11 * 262144;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class17.field335[var12 + 64] = var12 * 1024 + 16711680;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class17.field335[var13 + 128] = var13 * 4 + 16776960;
        }
        for (int var14 = 0; var14 < 64; var14++) {
            class17.field335[var14 + 192] = 16777215;
        }
        class51.field1101 = new int[256];
        for (int var15 = 0; var15 < 64; var15++) {
            class51.field1101[var15] = var15 * 1024;
        }
        for (int var16 = arg1; var16 < 64; var16++) {
            class51.field1101[var16 + 64] = var16 * 4 + 65280;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class51.field1101[var17 + 128] = var17 * 262144 + 65535;
        }
        for (int var18 = 0; var18 < 64; var18++) {
            class51.field1101[var18 + 192] = 16777215;
        }
        class119.field2555 = new int[256];
        for (int var19 = 0; var19 < 64; var19++) {
            class119.field2555[var19] = var19 * 4;
        }
        for (int var20 = 0; var20 < 64; var20++) {
            class119.field2555[var20 + 64] = var20 * 262144 + 255;
        }
        for (int var21 = 0; var21 < 64; var21++) {
            class119.field2555[var21 + 128] = var21 * 1024 + 16711935;
        }
        for (int var22 = 0; var22 < 64; var22++) {
            class119.field2555[var22 + 192] = 16777215;
        }
        class92.field2007 = new int[32768];
        class96.field2131 = new int[256];
        class4.field91 = new int[32768];
        class76.method539((byte) -120, null);
        class71.field1585 = class71.field1590;
        class71.field1592 = class71.field1590;
        class110.field2417 = new int[32768];
        class77.field1724 = 0;
        class33.field655 = new int[32768];
        if (class104.field2279 != 0) {
            class93.method660(class104.field2279, false, class27.field570, 10, class103.field2234, class71.field1590, -2, 0);
        }
        class68.field1481.method441((byte) 120, false);
        class10.field198 = true;
        class62.field1285 = true;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(BII)V")
    public static final void method932(byte arg0, int arg1, int arg2) {
        field2735++;
        int var3 = 0;
        int var4 = 0;
        if (arg0 <= 105) {
            method931(null, -84, null, null);
        }
        while (var4 < 100) {
            if (class36.field722[var4] != null) {
                int var5 = class72.field1603[var4];
                int var6 = class47.field986 + 70 + 4 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                if (var5 == 0) {
                    var3++;
                }
                class69 var7 = class10.field214[var4];
                if (var7 != null && var7.method490(126, class47.field989)) {
                    var7 = var7.method486(5, (byte) -102);
                }
                if (var7 != null && var7.method490(120, class9.field191)) {
                    var7 = var7.method486(5, (byte) -102);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class92.field2005 == 0 || class92.field2005 == 1 && class72.method511(false, var7))) {
                    if (var6 - 14 < arg2 && arg2 <= var6 && !var7.method463((byte) -67, class46.field974.field1222)) {
                        if (class80.field1828 >= 1) {
                            class2.field6++;
                            class23.method149(-70, 0, class46.method305(20025, new class69[] { class70.field1562, var7 }), 11, 0, 0);
                        }
                        class25.field522++;
                        class23.method149(-128, 0, class46.method305(20025, new class69[] { class61.field1249, var7 }), 10, 0, 0);
                        class23.method149(-115, 0, class46.method305(20025, new class69[] { class18.field382, var7 }), 9, 0, 0);
                        class103.field2230++;
                    }
                    var3++;
                }
                if ((var5 == 3 || var5 == 7) && class121.field2627 == 0 && (var5 == 7 || class17.field323 == 0 || class17.field323 == 1 && class72.method511(false, var7))) {
                    var3++;
                    if (var6 - 14 < arg2 && arg2 <= var6) {
                        class103.field2230++;
                        class25.field522++;
                        if (class80.field1828 >= 1) {
                            class23.method149(88, 0, class46.method305(20025, new class69[] { class70.field1562, var7 }), 11, 0, 0);
                            class2.field6++;
                        }
                        class23.method149(-96, 0, class46.method305(20025, new class69[] { class61.field1249, var7 }), 10, 0, 0);
                        class23.method149(125, 0, class46.method305(20025, new class69[] { class18.field382, var7 }), 9, 0, 0);
                    }
                }
                if (var5 == 4 && (class110.field2421 == 0 || class110.field2421 == 1 && class72.method511(false, var7))) {
                    if (arg2 > var6 - 14 && var6 >= arg2) {
                        class23.method149(-28, 0, class46.method305(20025, new class69[] { class69.field1508, var7 }), 2, 0, 0);
                        class79.field1784++;
                    }
                    var3++;
                }
                if ((var5 == 5 || var5 == 6) && class121.field2627 == 0 && class17.field323 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class110.field2421 == 0 || class110.field2421 == 1 && class72.method511(false, var7))) {
                    if (arg2 > var6 - 14 && arg2 <= var6) {
                        class23.method149(80, 0, class46.method305(20025, new class69[] { class39.field774, var7 }), 25, 0, 0);
                        class55.field1161++;
                    }
                    var3++;
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IBI)I")
    public static final int method933(int arg0, byte arg1, int arg2) {
        field2741++;
        int var3 = class63.method387(-122, arg2 - 1, arg0 - 1) + class63.method387(-117, arg2 + 1, arg0 + -1) + class63.method387(-115, arg2 - 1, arg0 + 1) + class63.method387(-106, arg2 - -1, arg0 + 1);
        int var4 = -113 % ((14 - arg1) / 37);
        int var5 = class63.method387(-99, arg2 - 1, arg0) + class63.method387(-84, arg2 + 1, arg0) + class63.method387(-122, arg2, arg0 - 1) + class63.method387(-127, arg2, arg0 + 1);
        int var6 = class63.method387(-67, arg2, arg0);
        return var6 / 4 + var3 / 16 + var5 / 8;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lkc;B)V")
    public static final void method934(class63 arg0, byte arg1) {
        int var2 = -36 % ((arg1 - 12) / 55);
        class103.field2238 = arg0;
        field2744++;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static void method935(byte arg0) {
        field2739 = null;
        if (arg0 < 92) {
            field2736 = null;
        }
        field2736 = null;
        field2731 = null;
        field2737 = null;
        field2742 = null;
        field2740 = null;
        field2745 = null;
        field2746 = null;
    }
}
