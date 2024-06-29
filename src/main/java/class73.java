import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class73 {

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "Lad;")
    public static class5 field1748 = class88.method674("Moderator)2Option: Spieler f-Ur 48 Stunden stumm schalten: <ON>", 102);

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "Lad;")
    public static class5 field1751 = class88.method674("Bitte entfernen Sie ", -86);

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
    public static int[] field1749 = new int[500];

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "Lad;")
    public static class5 field1754 = class88.method674("blinken2:", 36);

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "[I")
    public static int[] field1757 = new int[25];

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lad;")
    public static class5 field1759 = class88.method674("Benutzeroberfl-=che geladen)3", 48);

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "I")
    public static int field1750;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field1755;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public static int field1758;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field1760;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "Lrd;")
    public static class106 field1747;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IBI)V", line = 3)
    public static final void method581(int arg0, byte arg1, int arg2) {
        field1753++;
        int var3 = 0;
        int var4 = 0;
        int var5 = 84 % ((arg1 + 76) / 32);
        while (var4 < 100) {
            if (class96.field2282[var4] != null) {
                int var6 = class46.field1215[var4];
                int var7 = class25.field622 + 70 + 4 - var3 * 14;
                if (var7 < -20) {
                    break;
                }
                class5 var8 = class116.field2879[var4];
                if (var8 != null && var8.method47(108, class106.field2660)) {
                    var8 = var8.method52(5, (byte) -44);
                }
                if (var8 != null && var8.method47(61, class88.field2071)) {
                    var8 = var8.method52(5, (byte) -106);
                }
                if (var6 == 0) {
                    var3++;
                }
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || class65.field1567 == 0 || class65.field1567 == 1 && class133.method1028(var8, 0))) {
                    var3++;
                    if (var7 - 14 < arg2 && var7 >= arg2 && !var8.method66((byte) -79, class82.field1932.field2801)) {
                        if (class78.field1848 >= 1) {
                            class3.field97++;
                            class72.method580(class69.method546(true, new class5[] { class50.field1291, var8 }), 11, class105.field2536, -107, 0, 0, 0);
                        }
                        class7.field246++;
                        class72.method580(class69.method546(true, new class5[] { class50.field1291, var8 }), 1, class39.field1013, -107, 0, 0, 0);
                        class72.method580(class69.method546(true, new class5[] { class50.field1291, var8 }), 59, class96.field2281, -128, 0, 0, 0);
                        class92.field2203++;
                    }
                }
                if ((var6 == 3 || var6 == 7) && class134.field3239 == 0 && (var6 == 7 || class61.field1509 == 0 || class61.field1509 == 1 && class133.method1028(var8, 0))) {
                    var3++;
                    if (arg2 > var7 - 14 && var7 >= arg2) {
                        if (class78.field1848 >= 1) {
                            class3.field97++;
                            class72.method580(class69.method546(true, new class5[] { class50.field1291, var8 }), 11, class105.field2536, -116, 0, 0, 0);
                        }
                        class7.field246++;
                        class92.field2203++;
                        class72.method580(class69.method546(true, new class5[] { class50.field1291, var8 }), 1, class39.field1013, -124, 0, 0, 0);
                        class72.method580(class69.method546(true, new class5[] { class50.field1291, var8 }), 59, class96.field2281, -120, 0, 0, 0);
                    }
                }
                if (var6 == 4 && (class48.field1238 == 0 || class48.field1238 == 1 && class133.method1028(var8, 0))) {
                    if (var7 - 14 < arg2 && arg2 <= var7) {
                        class72.method580(class69.method546(true, new class5[] { class50.field1291, var8 }), 4, class30.field740, -115, 0, 0, 0);
                        class74.field1772++;
                    }
                    var3++;
                }
                if ((var6 == 5 || var6 == 6) && class134.field3239 == 0 && class61.field1509 < 2) {
                    var3++;
                }
                if (var6 == 8 && (class48.field1238 == 0 || class48.field1238 == 1 && class133.method1028(var8, 0))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        class72.method580(class69.method546(true, new class5[] { class50.field1291, var8 }), 56, class118.field2936, -117, 0, 0, 0);
                        class131.field3169++;
                    }
                    var3++;
                }
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V", line = 169)
    public static final void method582(int arg0, int arg1, int arg2) {
        class82 var3 = class20.method163(arg0 - 227, arg1);
        field1756++;
        int var4 = var3.field1935;
        int var5 = var3.field1940;
        int var6 = var3.field1943;
        int var7 = class101.field2449[var6 - var5];
        if (arg0 != 151) {
            return;
        }
        if (arg2 < 0 || var7 < arg2) {
            arg2 = 0;
        }
        int var8 = var7 << var5;
        class128.field3058[var4] = class5.method54(class104.method832(var8, arg2 << var5), class104.method832(~var8, class128.field3058[var4]));
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BIILqa;[Ljd;I)V", line = 206)
    public static final void method583(byte[] arg0, int arg1, int arg2, class97 arg3, class58[] arg4, int arg5) {
        field1760++;
        int var6 = 65 / ((arg2 + 50) / 57);
        int var7 = -1;
        class39 var8 = new class39(arg0);
        while (true) {
            int var9 = var8.method328((byte) 85);
            if (var9 == 0) {
                return;
            }
            var7 += var9;
            int var10 = 0;
            while (true) {
                int var11 = var8.method328((byte) 85);
                if (var11 == 0) {
                    break;
                }
                var10 += var11 - 1;
                int var12 = var10 & 0x3F;
                int var13 = var10 >> 6 & 0x3F;
                int var14 = var10 >> 12;
                int var15 = var13 + arg1;
                int var16 = var8.method330(-30864);
                int var17 = arg5 + var12;
                int var18 = var16 >> 2;
                int var19 = var16 & 0x3;
                if (var15 > 0 && var17 > 0 && var15 < 103 && var17 < 103) {
                    int var20 = var14;
                    class58 var21 = null;
                    if ((class12.field371[1][var15][var17] & 0x2) == 2) {
                        var20 = var14 - 1;
                    }
                    if (var20 >= 0) {
                        var21 = arg4[var20];
                    }
                    class102.method819(var7, var15, arg3, var14, var21, (byte) -80, var19, var18, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZLad;Lad;)V", line = 281)
    public static final void method584(int arg0, boolean arg1, class5 arg2, class5 arg3) {
        field1750++;
        if (class120.field2979) {
            class120.field2979 = false;
            class22.method172((byte) 89);
            class25.method211((byte) -126);
            class36.method281(205);
            class128.method989(550);
            class79.method613(class61.field1509, -10205, class65.field1567, class48.field1238, class82.field1924);
            class75.method595(class10.field333 == -1, class81.field1913, -1, -126, class14.field408);
            class3.field115 = true;
            class83.field1953 = true;
            class46.field1195 = true;
        }
        class13.method117(-119);
        short var4 = 151;
        int var6 = var4 - 3;
        class82.field1924.method1017(arg2, 257, var6, 0);
        class82.field1924.method1017(arg2, 256, var6 - 1, 16777215);
        if (arg3 != null) {
            var6 += 15;
            if (arg1) {
                int var5 = class82.field1924.method1007(arg3) + 4;
                class55.method443(257 - var5 / 2, var6 - 11, var5, 11, 0);
            }
            class82.field1924.method1017(arg3, 257, var6, 0);
            class82.field1924.method1017(arg3, 256, var6 - 1, 16777215);
        }
        class58.method471((byte) 51);
        if (arg0 != 23370) {
            method582(-17, -128, 113);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLrd;Lrd;Lrd;)V", line = 349)
    public static final void method585(boolean arg0, class106 arg1, class106 arg2, class106 arg3) {
        field1758++;
        class47.field1232 = arg3;
        class109.field2741 = arg2;
        if (!arg0) {
            field1747 = null;
        }
        class25.field626 = arg1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V", line = 382)
    public static void method586(boolean arg0) {
        field1751 = null;
        field1757 = null;
        if (!arg0) {
            method582(-71, 30, -44);
        }
        field1747 = null;
        field1754 = null;
        field1748 = null;
        field1759 = null;
        field1749 = null;
    }
}
