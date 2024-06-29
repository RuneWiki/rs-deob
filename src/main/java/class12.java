import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class12 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Lu;")
    private static class135 field271 = class87.method676((byte) -81, "Loading title screen )2 ");

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Lu;")
    private static class135 field277 = class87.method676((byte) -116, "glow3:");

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lu;")
    public static class135 field275 = class87.method676((byte) -59, "nav");

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lu;")
    public static class135 field279 = class87.method676((byte) -50, "Spieler)3 Bitte w-=hlen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Lu;")
    private static class135 field280 = class87.method676((byte) -58, "Your account is already logged in)3");

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Lu;")
    public static class135 field286 = field271;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "I")
    public static int field290 = 0;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "Lu;")
    public static class135 field283 = field277;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Lu;")
    private static class135 field282 = class87.method676((byte) -73, "Enter amount:");

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "Lu;")
    public static class135 field291 = field277;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static volatile int field272 = -1;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "Lu;")
    private static class135 field285 = class87.method676((byte) -66, "Loaded interfaces");

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lu;")
    public static class135 field281 = field285;

    @OriginalMember(owner = "client!bd", name = "w", descriptor = "Lu;")
    public static class135 field292 = class87.method676((byte) -67, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Lu;")
    public static class135 field273 = field280;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Lu;")
    public static class135 field270 = field282;

    @OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
    public static int field293 = 0;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static final void method88(int arg0) {
        field274++;
        int var1 = class101.field2448 * 128 + 64;
        int var2 = class84.field1993 * 128 + 64;
        if (arg0 < 81) {
            field280 = null;
        }
        int var3 = class20.method148(var1, var2, class136.field3301, -2) - class151.field3736;
        if (class17.field386 < var3) {
            class17.field386 += (var3 - class17.field386) * class47.field1111 / 1000 + client.field517;
            if (var3 < class17.field386) {
                class17.field386 = var3;
            }
        }
        if (class47.field1122 < var2) {
            class47.field1122 += (var2 - class47.field1122) * class47.field1111 / 1000 + client.field517;
            if (var2 < class47.field1122) {
                class47.field1122 = var2;
            }
        }
        if (class132.field3185 < var1) {
            class132.field3185 += (var1 - class132.field3185) * class47.field1111 / 1000 + client.field517;
            if (var1 < class132.field3185) {
                class132.field3185 = var1;
            }
        }
        if (class132.field3185 > var1) {
            class132.field3185 -= (class132.field3185 - var1) * class47.field1111 / 1000 + client.field517;
            if (class132.field3185 < var1) {
                class132.field3185 = var1;
            }
        }
        if (class47.field1122 > var2) {
            class47.field1122 -= (class47.field1122 - var2) * class47.field1111 / 1000 + client.field517;
            if (class47.field1122 < var2) {
                class47.field1122 = var2;
            }
        }
        if (class17.field386 > var3) {
            class17.field386 -= client.field517 + (class17.field386 - var3) * class47.field1111 / 1000;
            if (var3 > class17.field386) {
                class17.field386 = var3;
            }
        }
        int var4 = class28.field690 * 128 + 64;
        int var5 = class148.field3693 * 128 + 64;
        int var6 = class20.method148(var4, var5, class136.field3301, -2) - class95.field2317;
        int var7 = var5 - class47.field1122;
        int var8 = var4 - class132.field3185;
        int var9 = var6 - class17.field386;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var7 * var7));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (-325.949D * Math.atan2((double) var8, (double) var7)) & 0x7FF;
        if (var11 > class62.field1552) {
            class62.field1552 += (var11 - class62.field1552) * class52.field1228 / 1000 + class26.field625;
            if (class62.field1552 > var11) {
                class62.field1552 = var11;
            }
        }
        int var13 = var12 - class117.field2806;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (class62.field1552 > var11) {
            class62.field1552 -= (class62.field1552 - var11) * class52.field1228 / 1000 + class26.field625;
            if (class62.field1552 < var11) {
                class62.field1552 = var11;
            }
        }
        if (var13 > 0) {
            class117.field2806 += class52.field1228 * var13 / 1000 + class26.field625;
            class117.field2806 &= 0x7FF;
        }
        if (var13 < 0) {
            class117.field2806 -= -var13 * class52.field1228 / 1000 + class26.field625;
            class117.field2806 &= 0x7FF;
        }
        int var14 = var12 - class117.field2806;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class117.field2806 = var12;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lu;ILu;Z)V")
    public static final void method89(class135 arg0, int arg1, class135 arg2, boolean arg3) {
        if (arg1 != -244) {
            method89(null, -14, null, false);
        }
        if (class53.field1258) {
            class37.method282(true);
            class53.field1258 = false;
            class47.method356(-110);
            class59.method445(arg1 + 116);
            class83.method646(arg1 ^ 0xFFFFFF08);
            class20.method152((byte) -118);
            class30.method245(class93.field2200, (byte) 31, class126.field3014, class48.field1135, class79.field1858);
            class133.method1061((byte) -99, class21.field491, class49.field1167, -1, class80.field1900 == -1);
            class95.field2306 = true;
            class126.field3004 = true;
            class128.field3081 = true;
        }
        class86.method670(false);
        field287++;
        short var4 = 151;
        int var6 = var4 - 3;
        class93.field2200.method127(arg0, 257, var6, 0);
        class93.field2200.method127(arg0, 256, var6 - 1, 16777215);
        if (arg2 != null) {
            var6 += 15;
            if (arg3) {
                int var5 = class93.field2200.method115(arg2) + 4;
                class70.method564(257 - var5 / 2, var6 + -11, var5, 11, 0);
            }
            class93.field2200.method127(arg2, 257, var6, 0);
            class93.field2200.method127(arg2, 256, var6 - 1, 16777215);
        }
        class83.method645((byte) -121);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public static void method90(byte arg0) {
        field273 = null;
        int var1 = 32 / ((arg0 + 7) / 42);
        field286 = null;
        field283 = null;
        field282 = null;
        field280 = null;
        field277 = null;
        field285 = null;
        field292 = null;
        field271 = null;
        field279 = null;
        field281 = null;
        field291 = null;
        field270 = null;
        field275 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lve;B)Lve;")
    public static final class146 method91(class146 arg0, byte arg1) {
        field278++;
        if (arg1 != 116) {
            method92(64, true, -125, 118);
        }
        int var2 = class58.method439(arg1 - 109, class23.method196(arg0, (byte) -123));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class48.method360(-123, arg0.field3611);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZII)I")
    public static final int method92(int arg0, boolean arg1, int arg2, int arg3) {
        field288++;
        if (arg1) {
            int var4 = 256 - arg3;
            return ((arg0 & 0xFF00) * var4 + (arg2 & 0xFF00) * arg3 & 0xFF0000) + ((arg0 & 0xFF00FF) * var4 + (arg2 & 0xFF00FF) * arg3 & 0xFF00FF00) >> 8;
        } else {
            return -91;
        }
    }
}
