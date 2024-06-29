import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class81 {

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field2060 = 0;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public int field2067 = 0;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2065 = 0;

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "I")
    public static int field2072 = 20;

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lhb;")
    public static class44 field2077 = class102.method810("Wir vermuten ihr Spielkonto wurde gestohlen", -28606);

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public static int field2075 = 0;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "[I")
    public static int[] field2074 = new int[128];

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field2080 = 0;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "Z")
    public static boolean field2085 = false;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "Lhb;")
    public static class44 field2083 = class102.method810("Registrierter Benutzer", -28606);

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "Lhb;")
    private static class44 field2088 = class102.method810("Message", -28606);

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "Lhb;")
    public static class44 field2087 = class102.method810("mapfunction", -28606);

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "[J")
    public static long[] field2086 = new long[32];

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Lhb;")
    public static class44 field2058 = class102.method810("Lade Eingabe)2Steuerungsprogramm)3)3)3", -28606);

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field2062 = -1;

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    public static int field2089 = 0;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "Lhb;")
    public static class44 field2092 = field2088;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field2066;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public int field2068;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public static int field2076;

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "I")
    public static int field2078;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public int field2079;

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "I")
    public int field2082;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    public static int field2084;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "Ltd;")
    public static class116 field2071;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Lqa;")
    public class97 field2061;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "Lqa;")
    public class97 field2090;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "[I")
    public static int[] field2069;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 3)
    public static void method669(int arg0) {
        field2058 = null;
        field2083 = null;
        field2088 = null;
        field2071 = null;
        field2074 = null;
        field2077 = null;
        field2087 = null;
        field2069 = null;
        int var1 = -78 / ((arg0 + 71) / 40);
        field2086 = null;
        field2092 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IB)V", line = 21)
    public static final void method670(int arg0, byte arg1) {
        if (arg1 != 2) {
            field2069 = null;
        }
        field2076++;
        class49.method462(null, 0, (byte) -54, false, arg0);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljb;Ljava/awt/Component;I)Lab;", line = 54)
    public static final class3 method671(class56 arg0, Component arg1, int arg2) {
        class48.method452((byte) -64, arg1, arg0);
        int var3 = 99 / ((-arg2 - 51) / 56);
        class3 var4 = new class3();
        class14.method94(var4, (byte) -126);
        field2064++;
        return var4;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V", line = 78)
    public static final void method672(int arg0) {
        if (arg0 != 0) {
            field2089 = 15;
        }
        field2091++;
        if (field2085 && class79.field1993 != class16.field316) {
            class121.method930(0, class16.field311, class79.field1993, class72.field1820.field1350[0], class128.field3067, class72.field1820.field1355[0]);
        } else if (class79.field1993 != class102.field2603) {
            class102.field2603 = class79.field1993;
            class131.method988(class79.field1993, 20);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lja;B)V", line = 113)
    public static final void method673(class55 arg0, byte arg1) {
        field2070++;
        arg0.field1361 = arg0.field1388;
        if (arg0.field1378 == 0) {
            arg0.field1357 = 0;
            return;
        }
        if (arg0.field1415 != -1 && arg0.field1359 == 0) {
            class118 var2 = client.method139(arg1 - 83, arg0.field1415);
            if (arg0.field1402 > 0 && var2.field2894 == 0) {
                arg0.field1357++;
                return;
            }
            if (arg0.field1402 <= 0 && var2.field2879 == 0) {
                arg0.field1357++;
                return;
            }
        }
        int var3 = arg0.field1384;
        int var4 = arg0.field1371;
        if (arg1 != 84) {
            method673(null, (byte) -113);
        }
        int var5 = arg0.field1350[arg0.field1378 - 1] * 128 + arg0.field1422 * 64;
        int var6 = arg0.field1355[arg0.field1378 - 1] * 128 + arg0.field1422 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg0.field1384 = var6;
            arg0.field1371 = var5;
            return;
        }
        if (var3 < var6) {
            if (var5 > var4) {
                arg0.field1407 = 1280;
            } else if (var4 > var5) {
                arg0.field1407 = 1792;
            } else {
                arg0.field1407 = 1536;
            }
        } else if (var3 > var6) {
            if (var5 > var4) {
                arg0.field1407 = 768;
            } else if (var4 <= var5) {
                arg0.field1407 = 512;
            } else {
                arg0.field1407 = 256;
            }
        } else if (var5 > var4) {
            arg0.field1407 = 1024;
        } else if (var4 > var5) {
            arg0.field1407 = 0;
        }
        int var7 = arg0.field1370;
        int var8 = arg0.field1407 - arg0.field1419 & 0x7FF;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field1390;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field1333;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field1417;
        }
        if (var7 == -1) {
            var7 = arg0.field1390;
        }
        int var9 = 4;
        arg0.field1361 = var7;
        if (arg0.field1419 != arg0.field1407 && arg0.field1375 == -1 && arg0.field1373 != 0) {
            var9 = 2;
        }
        if (arg0.field1378 > 2) {
            var9 = 6;
        }
        if (arg0.field1378 > 3) {
            var9 = 8;
        }
        if (arg0.field1357 > 0 && arg0.field1378 > 1) {
            arg0.field1357--;
            var9 = 8;
        }
        if (arg0.field1389[arg0.field1378 - 1]) {
            var9 <<= 0x1;
        }
        if (var3 < var6) {
            arg0.field1384 += var9;
            if (arg0.field1384 > var6) {
                arg0.field1384 = var6;
            }
        } else if (var3 > var6) {
            arg0.field1384 -= var9;
            if (var6 > arg0.field1384) {
                arg0.field1384 = var6;
            }
        }
        if (var9 >= 8 && arg0.field1390 == arg0.field1361 && arg0.field1400 != -1) {
            arg0.field1361 = arg0.field1400;
        }
        if (var4 < var5) {
            arg0.field1371 += var9;
            if (var5 < arg0.field1371) {
                arg0.field1371 = var5;
            }
        } else if (var5 < var4) {
            arg0.field1371 -= var9;
            if (arg0.field1371 < var5) {
                arg0.field1371 = var5;
            }
        }
        if (arg0.field1384 == var6 && arg0.field1371 == var5) {
            if (arg0.field1402 > 0) {
                arg0.field1402--;
            }
            arg0.field1378--;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)Lle;", line = 357)
    public static final class71 method674(byte arg0, int arg1) {
        field2063++;
        class71 var2 = (class71) class53.field1324.method330((long) arg1, -1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class31.field777.method892(16, arg1, false);
        class71 var4 = new class71();
        int var5 = -30 % ((arg0 + 4) / 60);
        if (var3 != null) {
            var4.method607(new class131(var3), (byte) 33);
        }
        class53.field1324.method332(var4, 0, (long) arg1);
        return var4;
    }
}
