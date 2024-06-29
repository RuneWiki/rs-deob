import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class93 extends class148 {

    @OriginalMember(owner = "client!n", name = "z", descriptor = "[I")
    public int[] field2173 = new int[] { -1 };

    @OriginalMember(owner = "client!n", name = "K", descriptor = "[I")
    public int[] field2183 = new int[1];

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lja;")
    public static class62 field2172 = class30.method243(43, "oder ung-Ultiges Passwort)3");

    @OriginalMember(owner = "client!n", name = "H", descriptor = "Lja;")
    public static class62 field2180 = class30.method243(43, "::rect_debug");

    @OriginalMember(owner = "client!n", name = "C", descriptor = "Lja;")
    private static class62 field2176 = class30.method243(43, "Your account has been disabled)3");

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Lja;")
    public static class62 field2174 = field2176;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field2175 = 0;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Lja;")
    public static class62 field2171 = class30.method243(43, " <col=ffff00>");

    @OriginalMember(owner = "client!n", name = "E", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field2182;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Z")
    public static boolean field2179;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLae;)V")
    public static final void method713(byte arg0, class6 arg1) {
        field2177++;
        arg1.field191 = arg1.field178;
        if (arg1.field156 == 0) {
            arg1.field141 = 0;
            return;
        }
        if (arg1.field177 != -1 && arg1.field155 == 0) {
            class12 var2 = class141.method1121(arg1.field177, -24732);
            if (arg1.field185 > 0 && var2.field271 == 0) {
                arg1.field141++;
                return;
            }
            if (arg1.field185 <= 0 && var2.field269 == 0) {
                arg1.field141++;
                return;
            }
        }
        int var3 = arg1.field193[arg1.field156 - 1] * 128 + arg1.field149 * 64;
        int var4 = arg1.field134;
        int var5 = arg1.field136;
        int var6 = arg1.field144[arg1.field156 - 1] * 128 + arg1.field149 * 64;
        if (var3 - var5 > 256 || var3 - var5 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field134 = var6;
            arg1.field136 = var3;
            return;
        }
        if (var5 < var3) {
            if (var6 > var4) {
                arg1.field137 = 1280;
            } else if (var4 <= var6) {
                arg1.field137 = 1536;
            } else {
                arg1.field137 = 1792;
            }
        } else if (var5 <= var3) {
            if (var6 > var4) {
                arg1.field137 = 1024;
            } else if (var4 > var6) {
                arg1.field137 = 0;
            }
        } else if (var6 > var4) {
            arg1.field137 = 768;
        } else if (var4 <= var6) {
            arg1.field137 = 512;
        } else {
            arg1.field137 = 256;
        }
        int var7 = arg1.field137 - arg1.field168 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg1.field167;
        boolean var9 = true;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field190;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field163;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field151;
        }
        if (var8 == -1) {
            var8 = arg1.field190;
        }
        int var10 = 4;
        arg1.field191 = var8;
        if (arg0 != 13) {
            return;
        }
        if (arg1 instanceof class130) {
            var9 = ((class130) arg1).field2966.field3215;
        }
        if (var9) {
            if (arg1.field168 != arg1.field137 && arg1.field172 == -1 && arg1.field154 != 0) {
                var10 = 2;
            }
            if (arg1.field156 > 2) {
                var10 = 6;
            }
            if (arg1.field156 > 3) {
                var10 = 8;
            }
            if (arg1.field141 > 0 && arg1.field156 > 1) {
                var10 = 8;
                arg1.field141--;
            }
        } else {
            if (arg1.field156 > 1) {
                var10 = 6;
            }
            if (arg1.field156 > 2) {
                var10 = 8;
            }
            if (arg1.field141 > 0 && arg1.field156 > 1) {
                arg1.field141--;
                var10 = 8;
            }
        }
        if (arg1.field174[arg1.field156 - 1]) {
            var10 <<= 0x1;
        }
        if (var6 > var4) {
            arg1.field134 += var10;
            if (var6 < arg1.field134) {
                arg1.field134 = var6;
            }
        } else if (var4 > var6) {
            arg1.field134 -= var10;
            if (arg1.field134 < var6) {
                arg1.field134 = var6;
            }
        }
        if (var3 > var5) {
            arg1.field136 += var10;
            if (var3 < arg1.field136) {
                arg1.field136 = var3;
            }
        } else if (var3 < var5) {
            arg1.field136 -= var10;
            if (var3 > arg1.field136) {
                arg1.field136 = var3;
            }
        }
        if (var10 >= 8 && arg1.field191 == arg1.field190 && arg1.field135 != -1) {
            arg1.field191 = arg1.field135;
        }
        if (arg1.field136 != var3 || arg1.field134 != var6) {
            return;
        }
        arg1.field156--;
        if (arg1.field185 > 0) {
            arg1.field185--;
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)V")
    public static final void method714(int arg0, int arg1, int arg2) {
        field2181++;
        class105 var3 = class32.field765[class155.field3598][arg0][arg2];
        if (var3 == null) {
            class119.field2703.method550(class155.field3598, arg0, arg2);
            return;
        }
        class146 var4 = (class146) var3.method840(true);
        int var5 = -99999999;
        if (arg1 != 1336339591) {
            field2176 = null;
        }
        class146 var6 = null;
        while (var4 != null) {
            class23 var11 = class140.method1114(var4.field3441, false);
            int var12 = var11.field578;
            if (var11.field547 == 1) {
                var12 = (var4.field3446 + 1) * var12;
            }
            if (var5 < var12) {
                var5 = var12;
                var6 = var4;
            }
            var4 = (class146) var3.method841((byte) 18);
        }
        if (var6 == null) {
            class119.field2703.method550(class155.field3598, arg0, arg2);
            return;
        }
        var3.method844(var6, false);
        class146 var7 = null;
        class146 var8 = null;
        int var9 = arg0 + (arg2 << 7) + 1610612736;
        for (class146 var10 = (class146) var3.method840(true); var10 != null; var10 = (class146) var3.method841((byte) 18)) {
            if (var6.field3441 != var10.field3441) {
                if (var7 == null) {
                    var7 = var10;
                }
                if (var7.field3441 != var10.field3441 && var8 == null) {
                    var8 = var10;
                }
            }
        }
        class119.field2703.method583(class155.field3598, arg0, arg2, class111.method908(arg1 ^ 0x4FA6EC07, arg0 * 128 + 64, arg2 * 128 - -64, class155.field3598), var6, var9, var7, var8);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;Z)V")
    public static final void method715(Throwable arg0, String arg1, boolean arg2) {
        field2178++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class23.method178(110, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            System.out.println("Error: " + var3);
            String var4 = var3.replace(':', '.');
            String var5 = var4.replace('@', '_');
            String var6 = var5.replace('&', '_');
            String var7 = var6.replace('#', '_');
            if (class68.field1684.field957 != null) {
                class21 var8 = class68.field1684.method306(new URL(class68.field1684.field957.getCodeBase(), "clienterror.ws?c=" + class116.field2673 + "&u=" + class142.field3316 + "&v1=" + class41.field940 + "&v2=" + class41.field955 + "&e=" + var7), (byte) -48);
                if (!arg2) {
                    method716(false, null);
                }
                while (var8.field471 == 0) {
                    class146.method1168(-19127, 1L);
                }
                if (var8.field471 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field473;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ZLde;)V")
    public static final void method716(boolean arg0, class27 arg1) {
        if (arg0) {
            field2176 = null;
        }
        field2184++;
        if (class70.field1792 != 1) {
            return;
        }
        short var2 = 280;
        if (class29.field713 >= var2 && class29.field713 <= var2 + 14 && class4.field56 >= 4 && class4.field56 <= 18) {
            class22.method175(0, 0, (byte) 68);
            return;
        }
        if (var2 + 15 <= class29.field713 && var2 + 80 >= class29.field713 && class4.field56 >= 4 && class4.field56 <= 18) {
            class22.method175(1, 0, (byte) 84);
            return;
        }
        short var3 = 390;
        if (class29.field713 >= var3 && var3 + 14 >= class29.field713 && class4.field56 >= 4 && class4.field56 <= 18) {
            class22.method175(0, 1, (byte) 79);
            return;
        }
        if (var3 + 15 <= class29.field713 && class29.field713 <= var3 + 80 && class4.field56 >= 4 && class4.field56 <= 18) {
            class22.method175(1, 1, (byte) 91);
            return;
        }
        short var4 = 500;
        if (class29.field713 >= var4 && class29.field713 <= var4 + 14 && class4.field56 >= 4 && class4.field56 <= 18) {
            class22.method175(0, 2, (byte) 87);
            return;
        }
        if (class29.field713 >= var4 + 15 && class29.field713 <= var4 + 80 && class4.field56 >= 4 && class4.field56 <= 18) {
            class22.method175(1, 2, (byte) 74);
            return;
        }
        short var5 = 610;
        if (var5 <= class29.field713 && var5 + 14 >= class29.field713 && class4.field56 >= 4 && class4.field56 <= 18) {
            class22.method175(0, 3, (byte) 111);
            return;
        }
        if (class29.field713 >= var5 + 15 && var5 + 80 >= class29.field713 && class4.field56 >= 4 && class4.field56 <= 18) {
            class22.method175(1, 3, (byte) -26);
            return;
        }
        if (class29.field713 >= 708 && class4.field56 >= 4 && class29.field713 <= 758 && class4.field56 <= 20) {
            class51.field1181 = false;
            class110.field2518.method411(0, 0);
            class57.field1389.method411(382, 0);
            class128.field2871.method932(382 - class128.field2871.field2625 / 2, 18);
            return;
        }
        if (class59.field1443 == -1) {
            return;
        }
        class139 var6 = class126.field2861[class59.field1443];
        if (var6.field3229 == class121.field2768) {
            byte[] var7 = class70.method594(new class62[] { var6.field3227, class96.field2245 }, 1229).method472(1);
            class38.field893 = new String(var7, 0, var7.length);
            class59.field1449 = var6.field3232;
            class51.field1181 = false;
            if (class4.field39 != 0) {
                class144.field3359 = 43594;
                class122.field2798 = 43594;
                class149.field3509 = 443;
                class4.field39 = 0;
            }
            class110.field2518.method411(0, 0);
            class57.field1389.method411(382, 0);
            class128.field2871.method932(382 - class128.field2871.field2625 / 2, 18);
            return;
        }
        class62 var8 = class70.method594(new class62[] { class153.field3574, var6.field3227, class96.field2245, class83.field1999, class83.field1987, class31.method249(!arg0, class144.field3361 ? 1 : 0), class137.field3169, class31.method249(true, class128.field2901), class115.field2639, class31.method249(true, class70.field1796) }, 1229);
        try {
            arg1.getAppletContext().showDocument(var8.method454((byte) 108), "_self");
            return;
        } catch (Exception var9) {
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lpd;Lja;Lja;I)Lq;")
    public static final class114 method717(class108 arg0, class62 arg1, class62 arg2, int arg3) {
        field2185++;
        int var4 = arg0.method877(80, arg2);
        int var5 = arg0.method868(arg1, (byte) -128, var4);
        return arg3 > -97 ? null : class85.method662(var5, var4, 127, arg0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static void method718(boolean arg0) {
        field2176 = null;
        field2180 = null;
        field2171 = null;
        field2174 = null;
        field2172 = null;
        if (arg0) {
            method713((byte) -14, null);
        }
    }
}
