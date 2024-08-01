import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ge")
public class class65 {

    @OriginalMember(owner = "ge", name = "a", descriptor = "Llf;")
    public static class109 field1243 = class35.method275("http:)4)4www)3runescape)3com", 2);

    @OriginalMember(owner = "ge", name = "f", descriptor = "Llf;")
    private static class109 field1248 = class35.method275(")4l", 2);

    @OriginalMember(owner = "ge", name = "g", descriptor = "B")
    public static byte field1249;

    @OriginalMember(owner = "ge", name = "b", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "ge", name = "c", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "ge", name = "d", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "ge", name = "e", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "ge", name = "h", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "ge", name = "i", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "ge", name = "a", descriptor = "(Lua;I)V")
    public static final void method415(class185 arg0, int arg1) {
        if (arg1 != 12346) {
            field1249 = -58;
        }
        field1247++;
        if (class69.field1333 != 1) {
            return;
        }
        short var2 = 280;
        if (var2 <= class129.field2511 && var2 + 14 >= class129.field2511 && class67.field1310 >= 4 && class67.field1310 <= 18) {
            class92.method668(0, 0, 2001);
            return;
        }
        if (class129.field2511 >= var2 + 15 && var2 + 80 >= class129.field2511 && class67.field1310 >= 4 && class67.field1310 <= 18) {
            class92.method668(1, 0, 2001);
            return;
        }
        short var3 = 390;
        if (var3 <= class129.field2511 && var3 + 14 >= class129.field2511 && class67.field1310 >= 4 && class67.field1310 <= 18) {
            class92.method668(0, 1, 2001);
            return;
        }
        if (var3 + 15 <= class129.field2511 && var3 + 80 >= class129.field2511 && class67.field1310 >= 4 && class67.field1310 <= 18) {
            class92.method668(1, 1, 2001);
            return;
        }
        short var4 = 500;
        if (var4 <= class129.field2511 && var4 + 14 >= class129.field2511 && class67.field1310 >= 4 && class67.field1310 <= 18) {
            class92.method668(0, 2, 2001);
            return;
        }
        if (var4 + 15 <= class129.field2511 && class129.field2511 <= var4 + 80 && class67.field1310 >= 4 && class67.field1310 <= 18) {
            class92.method668(1, 2, 2001);
            return;
        }
        short var5 = 610;
        if (class129.field2511 >= var5 && var5 + 14 >= class129.field2511 && class67.field1310 >= 4 && class67.field1310 <= 18) {
            class92.method668(0, 3, 2001);
            return;
        }
        if (class129.field2511 >= var5 + 15 && var5 + 80 >= class129.field2511 && class67.field1310 >= 4 && class67.field1310 <= 18) {
            class92.method668(1, 3, 2001);
            return;
        }
        if (class129.field2511 >= 708 && class67.field1310 >= 4 && class129.field2511 <= 758 && class67.field1310 <= 20) {
            class134.field2570 = false;
            class98.field1986.method730(0, 0);
            class51.field1033.method730(382, 0);
            class158.field2965.method280(382 - class158.field2965.field801 / 2, 18);
            return;
        }
        if (class197.field3772 == -1) {
            return;
        }
        class55 var6 = class168.field3121[class197.field3772];
        if (class68.field1326 == var6.field1111) {
            byte[] var7 = class36.method279(new class109[] { var6.field1098, class146.field2818 }, arg1 ^ 0xFFFFCFE9).method807((byte) 62);
            class190.field3646 = new String(var7, 0, var7.length);
            class73.field1413 = var6.field1113;
            if (class29.field635 != 0) {
                class29.field635 = 0;
                class63.field1211 = 443;
                class129.field2490 = 43594;
                class206.field4050 = 43594;
            }
            class134.field2570 = false;
            class98.field1986.method730(0, 0);
            class51.field1033.method730(382, 0);
            class158.field2965.method280(382 - class158.field2965.field801 / 2, 18);
            return;
        }
        class109 var8 = class36.method279(new class109[] { class183.field3443, var6.field1098, class146.field2818, class174.field3309, field1248, class52.method345((byte) 85, class181.field3420 ? 1 : 0), class86.field1782, class52.method345((byte) 85, class201.field3959), class105.field2091, class52.method345((byte) 85, class139.field2695) }, 123);
        try {
            arg0.getAppletContext().showDocument(var8.method789(0), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "ge", name = "a", descriptor = "(BIIIII)V")
    public static final void method416(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1251++;
        if (class106.field2102 == arg2 && class177.field3343 == arg1 && (class165.field3101 == arg5 || !class181.field3420)) {
            return;
        }
        class177.field3343 = arg1;
        class165.field3101 = arg5;
        class106.field2102 = arg2;
        if (!class181.field3420) {
            class165.field3101 = 0;
        }
        class36.method278(25, (byte) -64);
        class103.method742(class117.field2315, arg0 ^ 0xFFFFFFA1, true);
        int var6 = class42.field880;
        class42.field880 = arg1 * 8 - 48;
        int var7 = class53.field1079;
        int var8 = class42.field880 - var6;
        int var9 = class42.field880;
        class53.field1079 = (arg2 - 6) * 8;
        int var10 = class53.field1079 - var7;
        int var11 = class53.field1079;
        for (int var12 = 0; var12 < 32768; var12++) {
            class139 var28 = class183.field3444[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3547[var29] -= var10;
                    var28.field3567[var29] -= var8;
                }
                var28.field3549 -= var10 * 128;
                var28.field3609 -= var8 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class184 var26 = class202.field3975[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3547[var27] -= var10;
                    var26.field3567[var27] -= var8;
                }
                var26.field3609 -= var8 * 128;
                var26.field3549 -= var10 * 128;
            }
        }
        class72.field1405 = arg5;
        byte var14 = 0;
        byte var15 = 104;
        class157.field2955.method1268(true, arg4, false, arg3);
        if (arg0 != 94) {
            field1243 = null;
        }
        byte var16 = 104;
        byte var17 = 1;
        byte var18 = 0;
        if (var10 < 0) {
            var15 = -1;
            var14 = 103;
            var17 = -1;
        }
        byte var19 = 1;
        if (var8 < 0) {
            var18 = 103;
            var19 = -1;
            var16 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var17) {
            for (int var22 = var18; var22 != var16; var22 += var19) {
                int var23 = var10 + var20;
                int var24 = var8 + var22;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class201.field3965[var25][var20][var22] = class201.field3965[var25][var23][var24];
                    } else {
                        class201.field3965[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class81 var21 = (class81) class47.field976.method1230(81); var21 != null; var21 = (class81) class47.field976.method1234(-1)) {
            var21.field1590 -= var8;
            var21.field1595 -= var10;
            if (var21.field1595 < 0 || var21.field1590 < 0 || var21.field1595 >= 104 || var21.field1590 >= 104) {
                var21.method452(true);
            }
        }
        if (class41.field860 != 0) {
            class95.field1944 -= var8;
            class41.field860 -= var10;
        }
        class210.field4094 = -1;
        class109.field2148 = false;
        class92.field1890 = 0;
        class13.field195.method1237(arg0 ^ 0xFFFFC53A);
        class22.field506.method1237(-15004);
    }

    @OriginalMember(owner = "ge", name = "a", descriptor = "(III)V")
    public static final void method417(int arg0, int arg1, int arg2) {
        field1250++;
        if (class76.field1455 == 2) {
            class44.method311((class140.field2728 - class53.field1079 << 7) + class8.field116, (-class42.field880 + class194.field3713 << 7) + class78.field1503, (byte) 124, class199.field3793 * 2);
            if (arg1 == -28 && (class183.field3440 > -1 && class143.field2754 % 20 < 10)) {
                class137.field2653[0].method704(class183.field3440 + arg2 - 12, class187.field3604 + -28 + arg0);
            }
        }
    }

    @OriginalMember(owner = "ge", name = "a", descriptor = "(I)V")
    public static void method418(int arg0) {
        field1248 = null;
        if (arg0 == -5115) {
            field1243 = null;
        }
    }
}
