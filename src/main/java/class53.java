import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class53 extends class12 {

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "Lad;")
    private static class5 field1329 = class88.method674("as it was used to break our rules)3", -102);

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "Lad;")
    public static class5 field1336 = class88.method674("runes", -127);

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field1334 = -1;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "Lad;")
    private static class5 field1330 = class88.method674("Please subscribe)1 or use a different world)3", -72);

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "Lad;")
    public static class5 field1338 = class88.method674("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie", -126);

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "Z")
    public static boolean field1333 = false;

    @OriginalMember(owner = "client!ie", name = "H", descriptor = "Lad;")
    public static class5 field1319 = field1330;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "Lad;")
    public static class5 field1337 = null;

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Lad;")
    public static class5 field1331 = class88.method674("Freund hinzuf-Ugen", -97);

    @OriginalMember(owner = "client!ie", name = "J", descriptor = "Lad;")
    public static class5 field1321 = field1329;

    @OriginalMember(owner = "client!ie", name = "K", descriptor = "Lad;")
    private static class5 field1322 = class88.method674("Please wait 5 minutes before trying again)3", 50);

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "Lad;")
    private static class5 field1339 = class88.method674("Please use a different world)3", -73);

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "Lad;")
    public static class5 field1335 = class88.method674("Lade Titelbild )2 ", 117);

    @OriginalMember(owner = "client!ie", name = "M", descriptor = "Lad;")
    public static class5 field1324 = field1339;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "Lad;")
    public static class5 field1332 = field1322;

    @OriginalMember(owner = "client!ie", name = "I", descriptor = "I")
    public static int field1320;

    @OriginalMember(owner = "client!ie", name = "L", descriptor = "I")
    public int field1323;

    @OriginalMember(owner = "client!ie", name = "N", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ie", name = "O", descriptor = "Lr;")
    public class102 field1326;

    @OriginalMember(owner = "client!ie", name = "P", descriptor = "Ltb;")
    public class116 field1327;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "Luc;")
    public static class123 field1341;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "[B")
    public byte[] field1340;

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "[Luc;")
    public static class123[] field1328;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(BLrd;Lrd;)I", line = 8)
    public static final int method437(byte arg0, class106 arg1, class106 arg2) {
        field1325++;
        int var3 = 0;
        if (arg1.method846(class23.field578, class109.field2747, 5000)) {
            var3++;
        }
        int var4 = -32 / ((arg0 - 65) / 38);
        if (arg2.method846(class129.field3135, class109.field2747, 5000)) {
            var3++;
        }
        if (arg2.method846(class99.field2405, class109.field2747, 5000)) {
            var3++;
        }
        if (arg2.method846(class63.field1530, class109.field2747, 5000)) {
            var3++;
        }
        if (arg2.method846(field1336, class109.field2747, 5000)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(B)V", line = 74)
    public static void method438(byte arg0) {
        field1330 = null;
        field1319 = null;
        field1338 = null;
        field1336 = null;
        field1341 = null;
        field1331 = null;
        field1337 = null;
        field1328 = null;
        field1339 = null;
        field1329 = null;
        field1335 = null;
        field1322 = null;
        field1321 = null;
        field1332 = null;
        field1324 = null;
        if (arg0 != -44) {
            method437((byte) -19, null, null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Lab;Z)V", line = 143)
    public static final void method439(class3 arg0, boolean arg1) {
        arg0.field54 = arg0.field48;
        field1320++;
        if (arg0.field80 == 0) {
            arg0.field107 = 0;
            return;
        }
        if (arg0.field85 != -1 && arg0.field82 == 0) {
            class72 var2 = class78.method605(arg0.field85, (byte) 20);
            if (arg0.field78 > 0 && var2.field1724 == 0) {
                arg0.field107++;
                return;
            }
            if (arg0.field78 <= 0 && var2.field1744 == 0) {
                arg0.field107++;
                return;
            }
        }
        if (!arg1) {
            field1319 = null;
        }
        int var3 = arg0.field112;
        int var4 = arg0.field120;
        int var5 = arg0.field89[arg0.field80 - 1] * 128 + arg0.field84 * 64;
        int var6 = arg0.field49[arg0.field80 - 1] * 128 + arg0.field84 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg0.field112 = var5;
            arg0.field120 = var6;
            return;
        }
        if (var3 < var5) {
            if (var6 > var4) {
                arg0.field47 = 1280;
            } else if (var4 <= var6) {
                arg0.field47 = 1536;
            } else {
                arg0.field47 = 1792;
            }
        } else if (var3 > var5) {
            if (var6 > var4) {
                arg0.field47 = 768;
            } else if (var4 > var6) {
                arg0.field47 = 256;
            } else {
                arg0.field47 = 512;
            }
        } else if (var6 > var4) {
            arg0.field47 = 1024;
        } else if (var6 < var4) {
            arg0.field47 = 0;
        }
        int var7 = arg0.field47 - arg0.field51 & 0x7FF;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        int var8 = arg0.field87;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field68;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field77;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field70;
        }
        if (var8 == -1) {
            var8 = arg0.field68;
        }
        arg0.field54 = var8;
        int var9 = 4;
        if (arg0.field51 != arg0.field47 && arg0.field45 == -1 && arg0.field119 != 0) {
            var9 = 2;
        }
        if (arg0.field80 > 2) {
            var9 = 6;
        }
        if (arg0.field80 > 3) {
            var9 = 8;
        }
        if (arg0.field107 > 0 && arg0.field80 > 1) {
            arg0.field107--;
            var9 = 8;
        }
        if (arg0.field81[arg0.field80 - 1]) {
            var9 <<= 0x1;
        }
        if (var3 < var5) {
            arg0.field112 += var9;
            if (arg0.field112 > var5) {
                arg0.field112 = var5;
            }
        } else if (var5 < var3) {
            arg0.field112 -= var9;
            if (arg0.field112 < var5) {
                arg0.field112 = var5;
            }
        }
        if (var4 < var6) {
            arg0.field120 += var9;
            if (var6 < arg0.field120) {
                arg0.field120 = var6;
            }
        } else if (var4 > var6) {
            arg0.field120 -= var9;
            if (var6 > arg0.field120) {
                arg0.field120 = var6;
            }
        }
        if (arg0.field112 == var5 && arg0.field120 == var6) {
            if (arg0.field78 > 0) {
                arg0.field78--;
            }
            arg0.field80--;
        }
        if (var9 >= 8 && arg0.field68 == arg0.field54 && arg0.field100 != -1) {
            arg0.field54 = arg0.field100;
        }
    }
}
