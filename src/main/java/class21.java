import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class21 {

    @OriginalMember(owner = "client!db", name = "e", descriptor = "Lo;")
    public static class84 field383 = class15.method124("To cancel this request:*6n1(Y Logout and return to the frontpage of this website)3*6n2(Y Choose (WCancel recovery questions(W)3", 255);

    @OriginalMember(owner = "client!db", name = "b", descriptor = "[I")
    public static int[] field380 = new int[256];

    @OriginalMember(owner = "client!db", name = "g", descriptor = "[Lo;")
    public static class84[] field385;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field387;

    @OriginalMember(owner = "client!db", name = "l", descriptor = "Z")
    public static boolean field390;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field386;

    @OriginalMember(owner = "client!db", name = "j", descriptor = "I")
    public static int field388;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "[Lcb;")
    public static class15[] field389;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field380[var0] = var1;
        }
        field385 = new class84[500];
        field387 = 0;
        field390 = false;
        field391 = 0;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 3)
    public static void method167(byte arg0) {
        field383 = null;
        if (arg0 <= 52) {
            field387 = -128;
        }
        field380 = null;
        field385 = null;
        field389 = null;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)V", line = 18)
    public static final void method168(byte arg0) {
        field382++;
        int var1 = class117.field2568 + class107.field2271.field1391;
        int var2 = class125.field2777 + class107.field2271.field1380;
        if (class78.field1656 - var2 < -500 || class78.field1656 - var2 > 500 || class28.field541 - var1 < -500 || class28.field541 - var1 > 500) {
            class78.field1656 = var2;
            class28.field541 = var1;
        }
        if (class78.field1656 != var2) {
            class78.field1656 += (var2 - class78.field1656) / 16;
        }
        int var3 = class78.field1656 >> 7;
        if (class28.field541 != var1) {
            class28.field541 += (var1 - class28.field541) / 16;
        }
        if (class119.field2631[96]) {
            class41.field821 += (-class41.field821 - 24) / 2;
        } else if (class119.field2631[97]) {
            class41.field821 += (24 - class41.field821) / 2;
        } else {
            class41.field821 /= 2;
        }
        int var4 = class28.field541 >> 7;
        if (class119.field2631[98]) {
            class93.field2035 += (12 - class93.field2035) / 2;
        } else if (class119.field2631[99]) {
            class93.field2035 += (-class93.field2035 - 12) / 2;
        } else {
            class93.field2035 /= 2;
        }
        class112.field2425 += class93.field2035 / 2;
        class79.field1680 = class41.field821 / 2 + class79.field1680 & 0x7FF;
        if (class112.field2425 < 128) {
            class112.field2425 = 128;
        }
        int var5 = 77 % ((arg0 + 64) / 55);
        int var6 = 0;
        if (class112.field2425 > 383) {
            class112.field2425 = 383;
        }
        int var7 = class105.method778(class1.field11, class78.field1656, 3, class28.field541);
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var8 = var3 - 4; var8 <= var3 + 4; var8++) {
                for (int var9 = var4 - 4; var9 <= var4 + 4; var9++) {
                    int var10 = class1.field11;
                    if (var10 < 3 && (class73.field1544[1][var8][var9] & 0x2) == 2) {
                        var10++;
                    }
                    int var11 = var7 - class110.field2377[var10][var8][var9];
                    if (var6 < var11) {
                        var6 = var11;
                    }
                }
            }
        }
        int var12 = var6 * 192;
        if (var12 > 98048) {
            var12 = 98048;
        }
        if (var12 < 32768) {
            var12 = 32768;
        }
        if (class15.field280 < var12) {
            class15.field280 += (var12 - class15.field280) / 24;
        } else if (var12 < class15.field280) {
            class15.field280 += (var12 - class15.field280) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lud;B)I", line = 134)
    public static final int method169(class118 arg0, byte arg1) {
        field386++;
        int var2 = 0;
        if (arg0.method914(client.field321, 0, class36.field713)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class93.field2042)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class31.field625)) {
            var2++;
        }
        int var3 = 59 % ((arg1 - 8) / 62);
        if (arg0.method914(client.field321, 0, class27.field521)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class11.field221)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class36.field705)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class126.field2779)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class128.field2824)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class55.field1153)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class5.field86)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class49.field1043)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class113.field2455)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class79.field1684)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class44.field898)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class42.field853)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class1.field22)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class128.field2827)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class26.field445)) {
            var2++;
        }
        if (arg0.method914(client.field321, 0, class14.field247)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 222)
    public static final void method170(byte arg0) {
        field388++;
        class8.method62(4);
        if (class54.field1128 == 1) {
            class63.field1316[class120.field2674 / 100].method947(class74.field1553 - 8 - 4, class122.field2717 - 8 + -4);
        }
        if (class54.field1128 == 2) {
            class63.field1316[class120.field2674 / 100 + 4].method947(class74.field1553 - 8 - 4, class122.field2717 + -8 + -4);
        }
        if (class4.field60 != -1) {
            class33.method300(class4.field60, 65536);
            class26.method198(0, -1, class4.field60, 4, 0, 334, 0, 512, 2);
        }
        if (class27.field528 != -1) {
            class33.method300(class27.field528, 65536);
            class26.method198(0, -1, class27.field528, 0, 0, 334, 0, 512, 2);
        }
        if (arg0 != 38) {
            method170((byte) 62);
        }
        class50.method427((byte) -118);
        if (!class116.field2529) {
            class25.method189(-107);
            class6.method35(2);
        } else if (class1.field24 == 0) {
            class28.method262(30307);
        }
        if (class128.field2830 == 1) {
            class50.field1084.method947(472, 296);
        }
        if (class115.field2503) {
            short var1 = 507;
            byte var2 = 20;
            int var3 = 16776960;
            if (class82.field1767 < 30 && class1.field23) {
                var3 = 16711680;
            }
            if (class82.field1767 < 20 && !class1.field23) {
                var3 = 16711680;
            }
            class123.field2762.method317(class97.method746(0, new class84[] { class117.field2551, class62.method489(class82.field1767, (byte) -127) }), var1, var2, var3);
            int var4 = 16776960;
            int var10 = var2 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            if (var6 > 32768 && class1.field23) {
                var4 = 16711680;
            }
            if (var6 > 65536 && !class1.field23) {
                var4 = 16711680;
            }
            class123.field2762.method317(class97.method746(0, new class84[] { class6.field115, class62.method489(var6, (byte) -126), class116.field2515 }), var1, var10, var4);
            var10 += 15;
            if (class6.field118) {
                class123.field2762.method317(class27.field523, var1, var10, 16711680);
                var10 += 15;
                class6.field118 = false;
            }
            if (class8.field160) {
                class123.field2762.method317(class78.field1659, var1, var10, 16711680);
                class8.field160 = false;
                var10 += 15;
            }
            if (class111.field2411) {
                class123.field2762.method317(class71.field1510, var1, var10, 16711680);
                var10 += 15;
                class111.field2411 = false;
            }
        }
        if (class103.field2169 == 0) {
            return;
        }
        int var7 = class103.field2169 / 50;
        int var8 = var7 / 60;
        int var9 = var7 % 60;
        if (var9 >= 10) {
            class123.field2762.method320(class97.method746(0, new class84[] { class111.field2398, class62.method489(var8, (byte) -128), class116.field2542, class62.method489(var9, (byte) -128) }), 4, 329, 16776960);
        } else {
            class123.field2762.method320(class97.method746(0, new class84[] { class111.field2398, class62.method489(var8, (byte) -128), class25.field435, class62.method489(var9, (byte) -127) }), 4, 329, 16776960);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(BLeb;I)Lo;", line = 347)
    public static final class84 method171(byte arg0, class27 arg1, int arg2) {
        field379++;
        try {
            if (arg0 != 40) {
                method167((byte) 109);
            }
            class84 var3 = new class84();
            var3.field1906 = arg1.method221(true);
            if (var3.field1906 > arg2) {
                var3.field1906 = arg2;
            }
            var3.field1869 = new byte[var3.field1906];
            arg1.field482 += class116.field2541.method683(0, var3.field1906, arg1.field482, arg1.field502, -1, var3.field1869);
            return var3;
        } catch (Exception var4) {
            return class104.field2201;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)I", line = 383)
    public static final int method172(int arg0) {
        int var1 = class105.method778(class1.field11, class57.field1176, 3, class17.field313);
        field381++;
        if (var1 - class99.field2103 >= 800 || (class73.field1544[class1.field11][class57.field1176 >> 7][class17.field313 >> 7] & 0x4) == 0) {
            return arg0 <= 16 ? 124 : 3;
        } else {
            return class1.field11;
        }
    }
}
