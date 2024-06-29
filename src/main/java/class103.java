import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class103 {

    @OriginalMember(owner = "client!da", name = "f", descriptor = "S")
    public static short field1537 = 256;

    @OriginalMember(owner = "client!da", name = "d", descriptor = "I")
    public static int field1535 = 128;

    @OriginalMember(owner = "client!da", name = "e", descriptor = "[[B")
    public static byte[][] field1536 = new byte[1000][];

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field1539 = 0;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "Z")
    public static boolean field1533 = false;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1534 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!da", name = "a", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "I")
    public static int field1540;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(IIIILtk;JLtk;Ltk;)V")
    public static final void method687(int arg0, int arg1, int arg2, int arg3, class219 arg4, long arg5, class219 arg6, class219 arg7) {
        class62 var9 = new class62();
        var9.field998 = arg4;
        var9.field999 = arg1 * 128 + 64;
        var9.field991 = arg2 * 128 + 64;
        var9.field997 = arg3;
        var9.field993 = arg5;
        var9.field1004 = arg6;
        var9.field1005 = arg7;
        int var10 = 0;
        class131 var11 = class16.field233[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field1926; var12++) {
                class162 var13 = var11.field1908[var12];
                if ((var13.field2350 & 0x400000L) == 4194304L) {
                    int var14 = var13.field2348.method36();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1002 = -var10;
        if (class16.field233[arg0][arg1][arg2] == null) {
            class16.field233[arg0][arg1][arg2] = new class131(arg0, arg1, arg2);
        }
        class16.field233[arg0][arg1][arg2].field1931 = var9;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(I)V")
    public static final void method688(int arg0) {
        field1540++;
        if (arg0 != -46) {
            method690((byte) 127);
        }
        if (class16.field235 != null || class273.field4357 != null) {
            return;
        }
        int var1 = class200.field2894;
        if (!class151.field2185) {
            if (var1 == 1 && class283.field4508 > 0) {
                short var2 = class280.field4475[class283.field4508 - 1];
                if (var2 == 45 || var2 == 4 || var2 == 49 || var2 == 46 || var2 == 34 || var2 == 57 || var2 == 32 || var2 == 14 || var2 == 5 || var2 == 11 || var2 == 22 || var2 == 1001) {
                    int var3 = class212.field3048[class283.field4508 - 1];
                    int var4 = class195.field2798[class283.field4508 - 1];
                    class267 var5 = class282.method1897(var4, 85);
                    class92 var6 = client.method1439(var5);
                    if (var6.method622(-114) || var6.method629((byte) -118)) {
                        class12.field188 = false;
                        class213.field3055 = 0;
                        if (class16.field235 != null) {
                            class217.method1396(false, class16.field235);
                        }
                        class16.field235 = class282.method1897(var4, 86);
                        class57.field874 = class279.field4465;
                        class262.field3947 = class42.field602;
                        class234.field3524 = var3;
                        class217.method1396(false, class16.field235);
                        return;
                    }
                }
            }
            if (var1 == 1 && (class250.field3787 == 1 && class283.field4508 > 2 || class76.method506(class283.field4508 - 1, (byte) 73))) {
                var1 = 2;
            }
            if (var1 == 2 && class283.field4508 > 0 || class104.field1541 == 1) {
                class7.method76(arg0 ^ 0xFFFFFFD2);
            }
            if (var1 == 1 && class283.field4508 > 0 || class104.field1541 == 2) {
                class26.method195(126);
                return;
            }
            return;
        }
        if (var1 != 1) {
            int var7 = class25.field345;
            int var8 = class190.field2688;
            if (var7 < (class200.field2896 - 10) || (class52.field763 + class200.field2896 + 10) < var7 || var8 < (class178.field2544 - 10) || var8 > (class218.field3225 + class178.field2544 + 10)) {
                class151.field2185 = false;
                class237.method1556(class200.field2896, class178.field2544, class218.field3225, arg0 - 22013, class52.field763);
            }
        }
        if (var1 != 1) {
            return;
        }
        int var9 = class200.field2896;
        int var10 = class178.field2544;
        int var11 = class279.field4465;
        int var12 = class52.field763;
        int var13 = class42.field602;
        int var14 = -1;
        for (int var15 = 0; var15 < class283.field4508; var15++) {
            int var16;
            if (class56.field854) {
                var16 = var10 + ((class283.field4508 + -1 + -var15) * 15) + 35;
            } else {
                var16 = (class283.field4508 - var15 - 1) * 15 + var10 + 31;
            }
            if (var9 < var11 && var9 + var12 > var11 && var16 - 13 < var13 && (var16 + 3) > var13) {
                var14 = var15;
            }
        }
        if (var14 != -1) {
            class256.method1716(89, var14);
        }
        class151.field2185 = false;
        class237.method1556(class200.field2896, class178.field2544, class218.field3225, -22059, class52.field763);
    }

    @OriginalMember(owner = "client!da", name = "b", descriptor = "(I)V")
    public static void method689(int arg0) {
        field1534 = null;
        if (arg0 == 0) {
            field1536 = null;
        }
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(B)V")
    public static final void method690(byte arg0) {
        field1538++;
        int var1 = class178.field2544;
        if (arg0 != -34) {
            method690((byte) -126);
        }
        int var2 = class200.field2896;
        int var3 = class52.field763;
        int var4 = class218.field3225;
        if (class194.field2790 == null || class221.field3278 == null) {
            if (class45.field634.method1509(false, class288.field4567) && class45.field634.method1509(false, class48.field679)) {
                class194.field2790 = class237.method1557(class45.field634, 0, class288.field4567, 0);
                class221.field3278 = class237.method1557(class45.field634, 0, class48.field679, 0);
            } else {
                class144.method958(var2, var1, var3, 20, class191.field2713, 256 - class20.field273);
            }
        }
        if (class194.field2790 != null && class221.field3278 != null) {
            int var5 = var3 / class194.field2790.field1075;
            for (int var6 = 0; var6 < var5; var6++) {
                class194.field2790.method470(class194.field2790.field1075 * var6 + var2, var1);
            }
            class221.field3278.method470(var2, var1);
            class221.field3278.method469(var3 + var2 - class221.field3278.field1075, var1);
        }
        class179.field2556.method1270(class253.field3848, var2 + 3, var1 + 14, class147.field2104, -1);
        class144.method958(var2, var1 + 20, var3, var4 - 20, class191.field2713, 256 - class20.field273);
        int var7 = class25.field345;
        int var8 = class190.field2688;
        for (int var9 = 0; var9 < class283.field4508; var9++) {
            int var17 = (class283.field4508 - var9 - 1) * 15 + var1 + 35;
            if (var2 < var7 && var2 + var3 > var7 && (var17 - 13) < var8 && var8 < var17 + 3) {
                class144.method958(var2, var17 - 13, var3, 16, class32.field474, 256 - class47.field668);
            }
        }
        if ((class13.field204 == null || class56.field863 == null || class48.field678 == null) && class45.field634.method1509(false, class95.field1453) && class45.field634.method1509(false, class264.field3975) && class45.field634.method1509(false, class78.field1208)) {
            class13.field204 = class237.method1557(class45.field634, 0, class95.field1453, 0);
            class56.field863 = class237.method1557(class45.field634, 0, class264.field3975, 0);
            class48.field678 = class237.method1557(class45.field634, 0, class78.field1208, 0);
        }
        if (class13.field204 != null && class56.field863 != null && class48.field678 != null) {
            int var10 = var3 / class13.field204.field1075;
            for (int var11 = 0; var11 < var10; var11++) {
                class13.field204.method470(class13.field204.field1075 * var11 + var2, -class13.field204.field1084 + var4 + var1);
            }
            int var12 = (var4 - 20) / class56.field863.field1084;
            for (int var13 = 0; var13 < var12; var13++) {
                class56.field863.method470(var2, class56.field863.field1084 * var13 + var1 + 20);
                class56.field863.method469(var2 - (class56.field863.field1075 - var3), class56.field863.field1084 * var13 + var1 - -20);
            }
            class48.field678.method470(var2, var1 + var4 - class48.field678.field1084);
            class48.field678.method469(var2 + var3 - class48.field678.field1075, -class48.field678.field1084 + var4 + var1);
        }
        for (int var14 = 0; var14 < class283.field4508; var14++) {
            int var15 = class147.field2104;
            int var16 = (class283.field4508 - var14 - 1) * 15 + var1 + 35;
            if (var2 < var7 && var7 < var2 + var3 && (var16 - 13) < var8 && var16 + 3 > var8) {
                var15 = class151.field2173;
            }
            class179.field2556.method1270(class274.method1849((byte) 98, var14), var2 + 3, var16, var15, 0);
        }
        class275.method1853(class52.field763, (byte) 52, class178.field2544, class218.field3225, class200.field2896);
    }
}
