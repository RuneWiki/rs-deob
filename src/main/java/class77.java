import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class77 extends class148 {

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "I")
    public int field1908;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "Z")
    public static boolean field1900 = false;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public static int field1899 = 0;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Lja;")
    public static class62 field1904 = class30.method243(43, "Ihr Spielkonto wurde deaktiviert)3");

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "Lja;")
    public static class62 field1906 = class30.method243(43, "Diese Betatest)2Welt ist nur f-Ur eingeladene");

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "Lja;")
    public static class62 field1905 = class30.method243(43, "Hidden)2");

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "Lja;")
    public static class62 field1907 = class30.method243(43, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "I")
    public static int field1896;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field1898;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    public static int field1901;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "Lea;")
    public static class29 field1902;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lpd;Lpd;ZLad;Lpd;)Z")
    public static final boolean method619(class108 arg0, class108 arg1, boolean arg2, class5 arg3, class108 arg4) {
        class43.field1004 = arg0;
        class84.field2013 = arg1;
        class94.field2215 = arg3;
        class98.field2292 = arg4;
        field1901++;
        if (!arg2) {
            method621(-65);
        }
        return true;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BIILpd;)[Lic;")
    public static final class58[] method620(byte arg0, int arg1, int arg2, class108 arg3) {
        field1897++;
        if (arg0 == 40) {
            return class63.method478(arg2, arg1, arg3, (byte) 127) ? class137.method1099(arg0 - 164) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(I)V")
    public static void method621(int arg0) {
        field1905 = null;
        field1904 = null;
        field1906 = null;
        field1907 = null;
        if (arg0 != -2412) {
            field1906 = null;
        }
        field1902 = null;
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(II)V")
    public static final void method622(int arg0, int arg1) {
        field1895++;
        if (arg1 < 0) {
            return;
        }
        int var2 = class12.field288[arg1];
        int var3 = class146.field3437[arg1];
        int var4 = class59.field1440[arg1];
        int var5 = class124.field2836[arg1];
        if (var3 >= 2000) {
            var3 -= 2000;
        }
        if (var3 == 1) {
            class4.method17((byte) -121);
            class54 var6 = class62.method456(var4, (byte) 102);
            class68.field1692 = 1;
            class40.field932 = var2;
            class35.field842 = var4;
            class47.field1091 = var5;
            client.method163(var6, -96);
            class60.field1459 = class70.method594(new class62[] { class124.field2833, class140.method1114(var5, false).field571, class149.field3523 }, 1229);
            if (class60.field1459 == null) {
                class60.field1459 = class121.field2781;
            }
            return;
        }
        if (var3 == 47) {
            class136.field3140.method810(-2, 124);
            class84.field2027++;
            class136.field3140.method1040(var4, arg0 ^ 0xB200517A);
            class54 var7 = class62.method456(var4, (byte) 64);
            if (var7.field1233 != null && var7.field1233[0][0] == 5) {
                int var8 = var7.field1233[0][1];
                if (class24.field598[var8] != var7.field1238[0]) {
                    class24.field598[var8] = var7.field1238[0];
                    class22.method169((byte) 104, var8);
                }
            }
        }
        if (var3 == 3) {
            class115 var9 = class52.field1200[var5];
            if (var9 != null) {
                class34.field806++;
                class75.method615(class40.field936.field193[0], var9.field144[0], var9.field193[0], (byte) 68, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class98.field2300 = 0;
                field1899 = 2;
                class97.field2270 = class4.field56;
                class68.field1711 = class29.field713;
                class136.field3140.method810(arg0 ^ 0xFFFFFFFC, 88);
                class136.field3140.method992(arg0 - 13294, var5);
            }
        }
        if (var3 == 1006) {
            class132.field3017++;
            class68.field1711 = class29.field713;
            field1899 = 2;
            class97.field2270 = class4.field56;
            class98.field2300 = 0;
            class136.field3140.method810(-2, 1);
            class136.field3140.method1024(252, var5 >> 14 & 0x7FFF);
        }
        if (var3 == 34) {
            class130 var10 = class136.field3127[var5];
            if (var10 != null) {
                class121.field2774++;
                class75.method615(class40.field936.field193[0], var10.field144[0], var10.field193[0], (byte) 37, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                field1899 = 2;
                class98.field2300 = 0;
                class97.field2270 = class4.field56;
                class68.field1711 = class29.field713;
                class136.field3140.method810(arg0 - 4, 79);
                class136.field3140.method1024(252, var5);
                class136.field3140.method1002(class35.field842, -4094);
                class136.field3140.method1039(class47.field1091, 305662280);
                class136.field3140.method992(-13292, class40.field932);
            }
        }
        if (var3 == 1002) {
            class97.field2270 = class4.field56;
            class68.field1711 = class29.field713;
            class98.field2300 = 0;
            field1899 = 2;
            class84.field2014++;
            class136.field3140.method810(-2, 237);
            class136.field3140.method992(-13292, var5);
        }
        if (var3 == 41) {
            class130 var11 = class136.field3127[var5];
            if (var11 != null) {
                class4.field44++;
                class75.method615(class40.field936.field193[0], var11.field144[0], var11.field193[0], (byte) -120, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                field1899 = 2;
                class68.field1711 = class29.field713;
                class98.field2300 = 0;
                class97.field2270 = class4.field56;
                class136.field3140.method810(-2, 206);
                class136.field3140.method992(-13292, var5);
            }
        }
        if (var3 == 49) {
            boolean var12 = class75.method615(class40.field936.field193[0], var4, var2, (byte) -105, 0, 2, false, 0, 0, class40.field936.field144[0], 0, 0);
            if (!var12) {
                class75.method615(class40.field936.field193[0], var4, var2, (byte) -117, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
            }
            class98.field2300 = 0;
            class26.field618++;
            class97.field2270 = class4.field56;
            class68.field1711 = class29.field713;
            field1899 = 2;
            class136.field3140.method810(arg0 ^ 0xFFFFFFFC, 75);
            class136.field3140.method992(-13292, var5);
            class136.field3140.method992(-13292, var2 + class40.field926);
            class136.field3140.method1024(252, var4 + class27.field673);
        }
        if (var3 == 24) {
            class115 var14 = class52.field1200[var5];
            if (var14 != null) {
                class75.method615(class40.field936.field193[0], var14.field144[0], var14.field193[0], (byte) 83, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class97.field2270 = class4.field56;
                field1899 = 2;
                class122.field2799++;
                class68.field1711 = class29.field713;
                class98.field2300 = 0;
                class136.field3140.method810(-2, 64);
                class136.field3140.method992(-13292, var5);
            }
        }
        if (var3 == 26) {
            class136.field3140.method810(arg0 - 4, 136);
            class72.field1814++;
            class136.field3140.method1024(arg0 + 250, var2);
            class136.field3140.method1019(var4, false);
            class136.field3140.method1039(var5, 305662280);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 120);
            class142.field3323 = var2;
        }
        if (var3 == 43) {
            class62.field1501++;
            class136.field3140.method810(-2, 106);
            class136.field3140.method1005(-46, var4);
            class136.field3140.method992(arg0 - 13294, var5);
            class136.field3140.method1039(var2, 305662280);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 97);
            class142.field3323 = var2;
        }
        if (var3 == 18) {
            class115 var15 = class52.field1200[var5];
            if (var15 != null) {
                class97.field2259++;
                class75.method615(class40.field936.field193[0], var15.field144[0], var15.field193[0], (byte) -99, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class98.field2300 = 0;
                field1899 = 2;
                class68.field1711 = class29.field713;
                class97.field2270 = class4.field56;
                class136.field3140.method810(arg0 - 4, 157);
                class136.field3140.method992(-13292, var5);
            }
        }
        if (var3 == 12 && class63.method483(var5, var4, 4, var2)) {
            class12.field282++;
            class136.field3140.method810(-2, 62);
            class136.field3140.method1039(var5 >> 14 & 0x7FFF, 305662280);
            class136.field3140.method997(-62, class119.field2732);
            class136.field3140.method1039(class27.field673 + var4, arg0 + 305662278);
            class136.field3140.method1039(class40.field926 + var2, 305662280);
            class136.field3140.method1005(-88, class79.field1915);
        }
        if (var3 == 58) {
            class94.field2211++;
            class63.method483(var5, var4, 4, var2);
            class136.field3140.method810(arg0 ^ 0xFFFFFFFC, 25);
            class136.field3140.method1039(var2 + class40.field926, 305662280);
            class136.field3140.method992(arg0 ^ 0xFFFFCC16, var5 >> 14 & 0x7FFF);
            class136.field3140.method992(arg0 ^ 0xFFFFCC16, class27.field673 + var4);
        }
        if (var3 == 38 && class63.method483(var5, var4, 4, var2)) {
            class132.field3018++;
            class136.field3140.method810(arg0 - 4, 164);
            class136.field3140.method1002(class35.field842, -4094);
            class136.field3140.method1024(252, class47.field1091);
            class136.field3140.method1039(class40.field932, arg0 ^ 0x1238094A);
            class136.field3140.method1039(class40.field926 + var2, 305662280);
            class136.field3140.method1039(var5 >> 14 & 0x7FFF, 305662280);
            class136.field3140.method1024(252, class27.field673 + var4);
        }
        if (var3 == 57) {
            class136.method1090(arg0 ^ 0xFFFFFF95);
        }
        if (var3 == 40) {
            class136.field3140.method810(-2, 29);
            class137.field3154++;
            class136.field3140.method1039(var2, 305662280);
            class136.field3140.method992(arg0 - 13294, var5);
            class136.field3140.method1040(var4, -1308601992);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 120);
            class142.field3323 = var2;
        }
        if (var3 == 11) {
            class63.method483(var5, var4, 4, var2);
            class46.field1050++;
            class136.field3140.method810(-2, 247);
            class136.field3140.method997(arg0 - 82, var5 >> 14 & 0x7FFF);
            class136.field3140.method1024(252, class27.field673 + var4);
            class136.field3140.method997(-116, class40.field926 + var2);
        }
        if (var3 == 45) {
            boolean var16 = class75.method615(class40.field936.field193[0], var4, var2, (byte) 81, 0, 2, false, 0, 0, class40.field936.field144[0], 0, 0);
            if (!var16) {
                class75.method615(class40.field936.field193[0], var4, var2, (byte) 31, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
            }
            class68.field1711 = class29.field713;
            field1899 = 2;
            class98.field2300 = 0;
            class133.field3052++;
            class97.field2270 = class4.field56;
            class136.field3140.method810(-2, 69);
            class136.field3140.method1024(arg0 ^ 0xFE, var5);
            class136.field3140.method997(-52, var2 + class40.field926);
            class136.field3140.method1039(class27.field673 + var4, arg0 ^ 0x1238094A);
        }
        if (var3 == 25) {
            class115 var18 = class52.field1200[var5];
            if (var18 != null) {
                class75.method615(class40.field936.field193[0], var18.field144[0], var18.field193[0], (byte) -122, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class47.field1072++;
                field1899 = 2;
                class97.field2270 = class4.field56;
                class98.field2300 = 0;
                class68.field1711 = class29.field713;
                class136.field3140.method810(-2, 161);
                class136.field3140.method1024(arg0 ^ 0xFE, var5);
            }
        }
        if (var3 == 31) {
            class119.field2703.method565(class155.field3598, var2, var4);
        }
        if (var3 == 28) {
            class115 var19 = class52.field1200[var5];
            if (var19 != null) {
                class75.method615(class40.field936.field193[0], var19.field144[0], var19.field193[0], (byte) -118, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class68.field1711 = class29.field713;
                class97.field2270 = class4.field56;
                field1899 = 2;
                class98.field2300 = 0;
                class115.field2637++;
                class136.field3140.method810(-2, 197);
                class136.field3140.method1040(class79.field1915, -1308601992);
                class136.field3140.method992(-13292, class119.field2732);
                class136.field3140.method1024(252, var5);
            }
        }
        if (var3 == 9) {
            class130 var20 = class136.field3127[var5];
            if (var20 != null) {
                class140.field3254++;
                class75.method615(class40.field936.field193[0], var20.field144[0], var20.field193[0], (byte) 81, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class97.field2270 = class4.field56;
                class98.field2300 = 0;
                field1899 = 2;
                class68.field1711 = class29.field713;
                class136.field3140.method810(-2, 240);
                class136.field3140.method1024(252, var5);
            }
        }
        if (var3 == 7) {
            boolean var21 = class75.method615(class40.field936.field193[0], var4, var2, (byte) -115, 0, 2, false, 0, 0, class40.field936.field144[0], 0, 0);
            class48.field1102++;
            if (!var21) {
                class75.method615(class40.field936.field193[0], var4, var2, (byte) 86, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
            }
            class68.field1711 = class29.field713;
            class98.field2300 = 0;
            field1899 = 2;
            class97.field2270 = class4.field56;
            class136.field3140.method810(-2, 2);
            class136.field3140.method1024(arg0 ^ 0xFE, class40.field926 + var2);
            class136.field3140.method1039(var5, 305662280);
            class136.field3140.method1024(252, class27.field673 + var4);
        }
        if (var3 == 1001) {
            client.field500++;
            class63.method483(var5, var4, 4, var2);
            class136.field3140.method810(-2, 54);
            class136.field3140.method997(-53, class40.field926 + var2);
            class136.field3140.method992(arg0 - 13294, class27.field673 + var4);
            class136.field3140.method1024(252, var5 >> 14 & 0x7FFF);
        }
        if (var3 == 4) {
            class115 var23 = class52.field1200[var5];
            if (var23 != null) {
                class126.field2844++;
                class75.method615(class40.field936.field193[0], var23.field144[0], var23.field193[0], (byte) -117, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class97.field2270 = class4.field56;
                class98.field2300 = 0;
                field1899 = 2;
                class68.field1711 = class29.field713;
                class136.field3140.method810(-2, 112);
                class136.field3140.method1024(252, class47.field1091);
                class136.field3140.method1024(arg0 + 250, var5);
                class136.field3140.method1040(class35.field842, -1308601992);
                class136.field3140.method1024(252, class40.field932);
            }
        }
        if (var3 == 15 && class119.field2724 == null) {
            class120.method955(-106, var4, var2);
            class119.field2724 = class68.method533((byte) -89, var2, var4);
            client.method163(class119.field2724, arg0 ^ 0xFFFFFF81);
        }
        if (var3 == 33) {
            class54 var24 = class62.method456(var4, (byte) 89);
            boolean var25 = true;
            if (var24.field1311 > 0) {
                var25 = class75.method614(1, var24);
            }
            if (var25) {
                class84.field2027++;
                class136.field3140.method810(-2, 124);
                class136.field3140.method1040(var4, -1308601992);
            }
        }
        if (var3 == 44) {
            class70.field1784++;
            class136.field3140.method810(-2, 219);
            class136.field3140.method992(-13292, var5);
            class136.field3140.method997(-99, class40.field932);
            class136.field3140.method1039(class47.field1091, arg0 ^ 0x1238094A);
            class136.field3140.method997(-58, var2);
            class136.field3140.method1019(var4, false);
            class136.field3140.method1002(class35.field842, arg0 ^ 0xFFFFF000);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 102);
            class142.field3323 = var2;
        }
        if (var3 == 39) {
            class126.field2848++;
            boolean var26 = class75.method615(class40.field936.field193[0], var4, var2, (byte) -119, 0, 2, false, 0, 0, class40.field936.field144[0], 0, 0);
            if (!var26) {
                class75.method615(class40.field936.field193[0], var4, var2, (byte) -123, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
            }
            class97.field2270 = class4.field56;
            class68.field1711 = class29.field713;
            class98.field2300 = 0;
            field1899 = 2;
            class136.field3140.method810(arg0 - 4, 123);
            class136.field3140.method1024(252, class119.field2732);
            class136.field3140.method1024(252, var5);
            class136.field3140.method997(-49, class27.field673 + var4);
            class136.field3140.method1024(arg0 + 250, var2 - -class40.field926);
            class136.field3140.method1040(class79.field1915, arg0 - 1308601994);
        }
        if (var3 == 19) {
            class136.field3140.method810(-2, 155);
            class75.field1869++;
            class136.field3140.method1039(var2, 305662280);
            class136.field3140.method992(arg0 ^ 0xFFFFCC16, var5);
            class136.field3140.method1040(var4, -1308601992);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 105);
            class142.field3323 = var2;
        }
        if (var3 == 22) {
            class130 var28 = class136.field3127[var5];
            if (var28 != null) {
                class1.field3++;
                class75.method615(class40.field936.field193[0], var28.field144[0], var28.field193[0], (byte) 44, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class97.field2270 = class4.field56;
                class68.field1711 = class29.field713;
                field1899 = 2;
                class98.field2300 = 0;
                class136.field3140.method810(arg0 ^ 0xFFFFFFFC, 227);
                class136.field3140.method1039(var5, 305662280);
            }
        }
        if (var3 == 23) {
            class54 var29 = class68.method533((byte) 102, var2, var4);
            if (var29 != null) {
                class4.method17((byte) -109);
                class70.method595(class79.method627(-112, class22.method171(var29, (byte) -121)), false, var2, var4);
                class68.field1692 = 0;
                class124.field2835 = class51.method354(var29, true);
                if (class124.field2835 == null) {
                    class124.field2835 = class131.field2987;
                }
                if (var29.field1322) {
                    class27.field678 = class70.method594(new class62[] { var29.field1260, class149.field3523 }, arg0 + 1227);
                    return;
                }
                class27.field678 = class70.method594(new class62[] { class29.field709, var29.field1258, class149.field3523 }, 1229);
            }
            return;
        }
        if (var3 == 14) {
            class10.field248++;
            class136.field3140.method810(-2, 73);
            class136.field3140.method997(arg0 ^ 0xFFFFFF8E, class119.field2732);
            class136.field3140.method1039(var5, 305662280);
            class136.field3140.method1005(-103, var4);
            class136.field3140.method1039(var2, 305662280);
            class136.field3140.method1002(class79.field1915, -4094);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 91);
            class142.field3323 = var2;
        }
        if (var3 == 6) {
            class63.field1542++;
            boolean var30 = class75.method615(class40.field936.field193[0], var4, var2, (byte) -124, 0, 2, false, 0, 0, class40.field936.field144[0], 0, 0);
            if (!var30) {
                class75.method615(class40.field936.field193[0], var4, var2, (byte) 97, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
            }
            class68.field1711 = class29.field713;
            class98.field2300 = 0;
            field1899 = 2;
            class97.field2270 = class4.field56;
            class136.field3140.method810(arg0 - 4, 115);
            class136.field3140.method997(-83, class27.field673 + var4);
            class136.field3140.method1024(252, var5);
            class136.field3140.method997(-59, var2 + class40.field926);
        }
        if (var3 == 1005) {
            class68.field1711 = class29.field713;
            class98.field2300 = 0;
            field1899 = 2;
            class97.field2270 = class4.field56;
            class130 var32 = class136.field3127[var5];
            if (var32 != null) {
                class138 var33 = var32.field2966;
                if (var33.field3208 != null) {
                    var33 = var33.method1108(arg0 - 3);
                }
                if (var33 != null) {
                    class4.field41++;
                    class136.field3140.method810(-2, 230);
                    class136.field3140.method992(-13292, var33.field3198);
                }
            }
        }
        if (var3 == 42) {
            class84.field2027++;
            class136.field3140.method810(arg0 ^ 0xFFFFFFFC, 124);
            class136.field3140.method1040(var4, -1308601992);
            class54 var34 = class62.method456(var4, (byte) 113);
            if (var34.field1233 != null && var34.field1233[0][0] == 5) {
                int var35 = var34.field1233[0][1];
                class24.field598[var35] = 1 - class24.field598[var35];
                class22.method169((byte) 116, var35);
            }
        }
        if (var3 == 35) {
            boolean var36 = class75.method615(class40.field936.field193[0], var4, var2, (byte) -102, 0, 2, false, 0, 0, class40.field936.field144[0], 0, 0);
            class150.field3529++;
            if (!var36) {
                class75.method615(class40.field936.field193[0], var4, var2, (byte) 106, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
            }
            class68.field1711 = class29.field713;
            class97.field2270 = class4.field56;
            class98.field2300 = 0;
            field1899 = 2;
            class136.field3140.method810(-2, 175);
            class136.field3140.method997(-111, class40.field926 + var2);
            class136.field3140.method992(-13292, var4 + class27.field673);
            class136.field3140.method992(-13292, var5);
        }
        if (var3 == 48) {
            class130 var38 = class136.field3127[var5];
            if (var38 != null) {
                class75.method615(class40.field936.field193[0], var38.field144[0], var38.field193[0], (byte) -127, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class15.field352++;
                class98.field2300 = 0;
                class68.field1711 = class29.field713;
                class97.field2270 = class4.field56;
                field1899 = 2;
                class136.field3140.method810(-2, 45);
                class136.field3140.method1024(arg0 ^ 0xFE, var5);
            }
        }
        if (var3 == 16) {
            class83.field2006++;
            boolean var39 = class75.method615(class40.field936.field193[0], var4, var2, (byte) -113, 0, 2, false, 0, 0, class40.field936.field144[0], 0, 0);
            if (!var39) {
                class75.method615(class40.field936.field193[0], var4, var2, (byte) -105, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
            }
            class97.field2270 = class4.field56;
            class68.field1711 = class29.field713;
            class98.field2300 = 0;
            field1899 = 2;
            class136.field3140.method810(-2, 173);
            class136.field3140.method1039(class27.field673 + var4, 305662280);
            class136.field3140.method1039(class47.field1091, 305662280);
            class136.field3140.method997(arg0 ^ 0xFFFFFF93, class40.field926 + var2);
            class136.field3140.method1039(class40.field932, 305662280);
            class136.field3140.method997(-42, var5);
            class136.field3140.method1005(-59, class35.field842);
        }
        if (var3 == 8) {
            class136.field3140.method810(-2, 66);
            class46.field1043++;
            class136.field3140.method992(arg0 ^ 0xFFFFCC16, var2);
            class136.field3140.method1039(var5, 305662280);
            class136.field3140.method1005(-128, var4);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 107);
            class142.field3323 = var2;
        }
        if (var3 == 36) {
            class130 var41 = class136.field3127[var5];
            if (var41 != null) {
                field1896++;
                class75.method615(class40.field936.field193[0], var41.field144[0], var41.field193[0], (byte) 69, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class97.field2270 = class4.field56;
                class98.field2300 = 0;
                class68.field1711 = class29.field713;
                field1899 = 2;
                class136.field3140.method810(-2, 35);
                class136.field3140.method1024(252, var5);
            }
        }
        if (var3 == 30) {
            class115 var42 = class52.field1200[var5];
            if (var42 != null) {
                class75.method615(class40.field936.field193[0], var42.field144[0], var42.field193[0], (byte) 86, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class98.field2300 = 0;
                field1899 = 2;
                class147.field3464++;
                class68.field1711 = class29.field713;
                class97.field2270 = class4.field56;
                class136.field3140.method810(-2, 98);
                class136.field3140.method992(-13292, var5);
            }
        }
        if (var3 == 20) {
            class48.field1126++;
            class136.field3140.method810(-2, 44);
            class136.field3140.method1039(var2, 305662280);
            class136.field3140.method1005(-57, var4);
            class136.field3140.method997(arg0 - 41, var5);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 112);
            class142.field3323 = var2;
        }
        if (var3 == 1004) {
            class54 var43 = class62.method456(var4, (byte) 87);
            if (var43 == null || var43.field1365[var2] < 100000) {
                class136.field3140.method810(-2, 237);
                class84.field2014++;
                class136.field3140.method992(-13292, var5);
            } else {
                class43.method320(0, 0, class70.method594(new class62[] { class31.method249(true, var43.field1365[var2]), class26.field636, class140.method1114(var5, false).field571 }, 1229), class83.field1991);
            }
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 67);
            class142.field3323 = var2;
        }
        if (var3 == 10) {
            class136.field3140.method810(arg0 ^ 0xFFFFFFFC, 198);
            class124.field2812++;
            class136.field3140.method1039(class119.field2732, 305662280);
            class136.field3140.method1039(var2, arg0 ^ 0x1238094A);
            class136.field3140.method1040(var4, arg0 ^ 0xB200517A);
            class136.field3140.method1002(class79.field1915, -4094);
        }
        if (var3 == 46) {
            class111.field2534++;
            class63.method483(var5, var4, 4, var2);
            class136.field3140.method810(-2, 90);
            class136.field3140.method992(-13292, class40.field926 + var2);
            class136.field3140.method992(-13292, var5 >> 14 & 0x7FFF);
            class136.field3140.method1039(class27.field673 + var4, 305662280);
        }
        if (var3 == 37) {
            class136.field3140.method810(-2, 204);
            class24.field588++;
            class136.field3140.method992(-13292, var5);
            class136.field3140.method1024(252, var2);
            class136.field3140.method1002(var4, -4094);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 98);
            class142.field3323 = var2;
        }
        if (var3 == 21) {
            class100.field2317++;
            class136.field3140.method810(-2, 127);
            class136.field3140.method1005(-43, var4);
            class136.field3140.method1024(252, var2);
            class136.field3140.method1024(252, var5);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 112);
            class142.field3323 = var2;
        }
        if (var3 == 32) {
            class130 var44 = class136.field3127[var5];
            if (var44 != null) {
                class26.field634++;
                class75.method615(class40.field936.field193[0], var44.field144[0], var44.field193[0], (byte) 83, 0, 2, false, 0, 0, class40.field936.field144[0], 1, 1);
                class68.field1711 = class29.field713;
                class97.field2270 = class4.field56;
                class98.field2300 = 0;
                field1899 = 2;
                class136.field3140.method810(-2, 151);
                class136.field3140.method1040(class79.field1915, -1308601992);
                class136.field3140.method1024(arg0 ^ 0xFE, class119.field2732);
                class136.field3140.method992(-13292, var5);
            }
        }
        if (var3 == 5) {
            class29.field725++;
            class136.field3140.method810(-2, 102);
            class136.field3140.method997(-100, var2);
            class136.field3140.method1040(var4, arg0 ^ 0xB200517A);
            class136.field3140.method1024(arg0 ^ 0xFE, var5);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 91);
            class142.field3323 = var2;
        }
        if (arg0 == var3) {
            class137.field3152++;
            class63.method483(var5, var4, arg0 ^ 0x6, var2);
            class136.field3140.method810(-2, 92);
            class136.field3140.method992(-13292, var4 + class27.field673);
            class136.field3140.method1024(arg0 ^ 0xFE, var5 >> 14 & 0x7FFF);
            class136.field3140.method1039(class40.field926 + var2, 305662280);
        }
        if (var3 == 29) {
            class142.field3313++;
            class136.field3140.method810(arg0 ^ 0xFFFFFFFC, 207);
            class136.field3140.method1024(252, var2);
            class136.field3140.method1040(var4, arg0 ^ 0xB200517A);
            class136.field3140.method997(-39, var5);
            class136.field3136 = 0;
            class28.field693 = class62.method456(var4, (byte) 74);
            class142.field3323 = var2;
        }
        if (var3 == 13 || var3 == 1003) {
            class72.method605(var2, var5, var4, (byte) 81, class60.field1479[arg1]);
        }
        if (class68.field1692 != 0) {
            class68.field1692 = 0;
            client.method163(class62.method456(class35.field842, (byte) 89), -83);
        }
        if (class90.field2145) {
            class4.method17((byte) -108);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIBIIII)V")
    public static final void method623(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field1903++;
        if (arg2 != -121) {
            return;
        }
        int var7 = 2048 - arg1 & 0x7FF;
        int var8 = 0;
        int var9 = 2048 - arg0 & 0x7FF;
        int var10 = 0;
        int var11 = arg4;
        if (var7 != 0) {
            int var12 = class66.field1658[var7];
            int var13 = class66.field1647[var7];
            int var14 = var10 * var12 - arg4 * var13 >> 16;
            var11 = var10 * var13 + arg4 * var12 >> 16;
            var10 = var14;
        }
        if (var9 != 0) {
            int var15 = class66.field1647[var9];
            int var16 = class66.field1658[var9];
            int var17 = var8 * var16 + var11 * var15 >> 16;
            var11 = var11 * var16 - var8 * var15 >> 16;
            var8 = var17;
        }
        class140.field3248 = arg3 - var11;
        class115.field2649 = arg6 - var10;
        class20.field433 = arg1;
        class81.field1959 = arg5 - var8;
        class143.field3351 = arg0;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class77() {
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(I)V")
    public class77(int arg0) {
        this.field1908 = arg0;
    }
}
