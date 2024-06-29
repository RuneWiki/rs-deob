import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class101 extends class129 {

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    public static int field2599 = -1;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "Lmc;")
    public static class75 field2605 = class30.method234(true, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "Lmc;")
    private static class75 field2610 = class30.method234(true, "This world is full)3");

    @OriginalMember(owner = "client!qe", name = "Y", descriptor = "Lmc;")
    public static class75 field2606 = class30.method234(true, "mod_icons");

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "Lmc;")
    public static class75 field2603 = field2610;

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "Lkc;")
    public static class63 field2612 = new class63(64);

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field2613 = 0;

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "Lmc;")
    public static class75 field2616 = class30.method234(true, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "B")
    public byte field2611;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public int field2600;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    public static int field2601;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    public static int field2604;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lud;")
    public static class121 field2608;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "Laa;")
    public static class2 field2615;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "Lp;")
    public class90 field2602;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "Lpb;")
    public static class92 field2617;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "Ljava/awt/Image;")
    public static Image field2614;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBILv;)V", line = 16)
    public static final void method836(int arg0, byte arg1, int arg2, class122 arg3) {
        field2609++;
        if ((arg0 & 0x40) != 0) {
            arg3.field1246 = class97.field2448.method516(false);
            arg3.field1209 = class97.field2448.method514(-25530);
        }
        if ((arg0 & 0x20) != 0) {
            int var4 = class97.field2448.method524(255);
            int var5 = class97.field2448.method528(-129);
            int var6 = class97.field2448.method494(20471);
            int var7 = class97.field2448.field1556;
            if (arg3.field3003 != null && arg3.field2973 != null) {
                long var8 = arg3.field3003.method643(true);
                boolean var10 = false;
                if (var5 <= 1) {
                    for (int var11 = 0; var11 < class1.field2; var11++) {
                        if (class44.field1040[var11] == var8) {
                            var10 = true;
                            break;
                        }
                    }
                }
                if (!var10 && class26.field523 == 0) {
                    class96.field2433.field1556 = 0;
                    class97.field2448.method495(0, 1, class96.field2433.field1577, var6);
                    class96.field2433.field1556 = 0;
                    class75 var12 = class38.method295(true, class96.field2433).method625(false);
                    arg3.field1213 = var12.method637(90);
                    arg3.field1240 = var4 & 0xFF;
                    arg3.field1212 = 150;
                    arg3.field1261 = var4 >> 8;
                    if (var5 == 2 || var5 == 3) {
                        class31.method242(class69.method586(new class75[] { class24.field469, arg3.field3003 }, (byte) 71), 1, -1, var12);
                    } else if (var5 == 1) {
                        class31.method242(class69.method586(new class75[] { class59.field1527, arg3.field3003 }, (byte) 56), 1, -1, var12);
                    } else {
                        class31.method242(arg3.field3003, 2, -1, var12);
                    }
                }
            }
            class97.field2448.field1556 = var7 + var6;
        }
        if ((arg0 & 0x2) != 0) {
            arg3.field1213 = class97.field2448.method509((byte) 78);
            if (arg3.field1213.method656(true, 0) == 126) {
                arg3.field1213 = arg3.field1213.method645(1, (byte) 110);
                class31.method242(arg3.field3003, 2, -1, arg3.field1213);
            } else if (class52.field1315 == arg3) {
                class31.method242(arg3.field3003, 2, -1, arg3.field1213);
            }
            arg3.field1212 = 150;
            arg3.field1240 = 0;
            arg3.field1261 = 0;
        }
        if ((arg0 & 0x80) != 0) {
            int var13 = class97.field2448.method507((byte) -104);
            if (var13 == 65535) {
                var13 = -1;
            }
            int var14 = class97.field2448.method494(20471);
            if (arg3.field1265 == var13 && var13 != -1) {
                int var15 = class37.method289(var13, (byte) -127).field2698;
                if (var15 == 1) {
                    arg3.field1273 = 0;
                    arg3.field1258 = 0;
                    arg3.field1268 = 0;
                    arg3.field1227 = var14;
                }
                if (var15 == 2) {
                    arg3.field1258 = 0;
                }
            } else if (var13 == -1 || arg3.field1265 == -1 || class37.method289(var13, (byte) -128).field2673 >= class37.method289(arg3.field1265, (byte) -127).field2673) {
                arg3.field1258 = 0;
                arg3.field1265 = var13;
                arg3.field1227 = var14;
                arg3.field1268 = 0;
                arg3.field1226 = arg3.field1267;
                arg3.field1273 = 0;
            }
        }
        if ((arg0 & 0x1) != 0) {
            int var16 = class97.field2448.method519((byte) -25);
            byte[] var17 = new byte[var16];
            class61 var18 = new class61(var17);
            class97.field2448.method488(var17, 0, var16, -124);
            class96.field2424[arg2] = var18;
            arg3.method959((byte) -122, var18);
        }
        if ((arg0 & 0x200) != 0) {
            arg3.field1216 = class97.field2448.method516(false);
            int var19 = class97.field2448.method496((byte) 122);
            arg3.field1255 = 0;
            arg3.field1229 = (var19 & 0xFFFF) + class34.field781;
            arg3.field1214 = 0;
            arg3.field1269 = var19 >> 16;
            if (class34.field781 < arg3.field1229) {
                arg3.field1255 = -1;
            }
            if (arg3.field1216 == 65535) {
                arg3.field1216 = -1;
            }
        }
        if ((arg0 & 0x8) != 0) {
            arg3.field1252 = class97.field2448.method516(false);
            if (arg3.field1252 == 65535) {
                arg3.field1252 = -1;
            }
        }
        if ((arg0 & 0x400) != 0) {
            arg3.field1253 = class97.field2448.method519((byte) -111);
            arg3.field1232 = class97.field2448.method519((byte) -116);
            arg3.field1228 = class97.field2448.method528(-129);
            arg3.field1266 = class97.field2448.method528(-129);
            arg3.field1200 = class97.field2448.method516(false) + class34.field781;
            arg3.field1247 = class97.field2448.method514(-25530) + class34.field781;
            arg3.field1210 = class97.field2448.method528(-129);
            arg3.method393(207);
        }
        if ((arg0 & 0x100) != 0) {
            int var20 = class97.field2448.method515((byte) 34);
            int var21 = class97.field2448.method519((byte) -23);
            arg3.method389(var21, class34.field781, var20, (byte) 120);
            arg3.field1245 = class34.field781 + 300;
            arg3.field1279 = class97.field2448.method528(-129);
            arg3.field1199 = class97.field2448.method515((byte) -119);
        }
        int var22 = -72 / ((63 - arg1) / 48);
        if ((arg0 & 0x10) == 0) {
            return;
        }
        int var23 = class97.field2448.method528(-129);
        int var24 = class97.field2448.method528(-129);
        arg3.method389(var24, class34.field781, var23, (byte) -96);
        arg3.field1245 = class34.field781 + 300;
        arg3.field1279 = class97.field2448.method494(20471);
        arg3.field1199 = class97.field2448.method494(20471);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lvb;BZ)Z", line = 260)
    public static final boolean method837(class124 arg0, byte arg1, boolean arg2) {
        class74.field1848 = 20;
        if (arg1 >= -113) {
            return true;
        }
        field2601++;
        try {
            class37.field887 = (class71) Class.forName("da").getDeclaredConstructor().newInstance();
            return true;
        } catch (Throwable var4) {
            class9 var3 = arg0.method992(2);
            if (var3 != null) {
                class37.field887 = new class95(arg0, var3);
                return true;
            } else if (arg2) {
                class37.field887 = new class76(arg0);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "(I)V", line = 295)
    public static void method838(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field2617 = null;
        field2615 = null;
        field2608 = null;
        field2616 = null;
        field2606 = null;
        field2605 = null;
        field2603 = null;
        field2612 = null;
        field2614 = null;
        field2610 = null;
    }

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "(I)V", line = 314)
    public static final void method839(int arg0) {
        if (arg0 != -1) {
            method838(-116);
        }
        field2607++;
        field2614 = null;
        class23.field440 = null;
        class85.field2107 = null;
    }
}
