import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class99 extends class136 {

    @OriginalMember(owner = "client!q", name = "z", descriptor = "Lpd;")
    public static class94 field2493 = class28.method249(121, "Konfig geladen)3");

    @OriginalMember(owner = "client!q", name = "K", descriptor = "Lpd;")
    private static class94 field2504 = class28.method249(38, "Use");

    @OriginalMember(owner = "client!q", name = "y", descriptor = "Lpd;")
    public static class94 field2492 = field2504;

    @OriginalMember(owner = "client!q", name = "I", descriptor = "Lhb;")
    public static class43 field2502 = new class43(5000);

    @OriginalMember(owner = "client!q", name = "L", descriptor = "Lpd;")
    private static class94 field2505 = class28.method249(-67, "Loading game screen )2 ");

    @OriginalMember(owner = "client!q", name = "P", descriptor = "Lpd;")
    public static class94 field2508 = class28.method249(45, "und Ihr Passwort ein)3");

    @OriginalMember(owner = "client!q", name = "N", descriptor = "Lpd;")
    public static class94 field2507 = class28.method249(122, "redstone1");

    @OriginalMember(owner = "client!q", name = "Q", descriptor = "Lpd;")
    public static class94 field2509 = field2505;

    @OriginalMember(owner = "client!q", name = "M", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2506 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!q", name = "U", descriptor = "Lpd;")
    public static class94 field2513 = class28.method249(124, "mapedge");

    @OriginalMember(owner = "client!q", name = "X", descriptor = "Z")
    public static boolean field2516 = false;

    @OriginalMember(owner = "client!q", name = "Z", descriptor = "Lpd;")
    private static class94 field2518 = class28.method249(-105, "Username: ");

    @OriginalMember(owner = "client!q", name = "Y", descriptor = "Lpd;")
    private static class94 field2517 = class28.method249(-79, " seconds)3");

    @OriginalMember(owner = "client!q", name = "cb", descriptor = "Lpd;")
    public static class94 field2521 = field2518;

    @OriginalMember(owner = "client!q", name = "bb", descriptor = "I")
    public static int field2520 = 0;

    @OriginalMember(owner = "client!q", name = "W", descriptor = "Lpd;")
    public static class94 field2515 = field2517;

    @OriginalMember(owner = "client!q", name = "A", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!q", name = "B", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!q", name = "E", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!q", name = "F", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!q", name = "G", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!q", name = "H", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!q", name = "J", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!q", name = "V", descriptor = "I")
    public static int field2514;

    @OriginalMember(owner = "client!q", name = "R", descriptor = "Ltc;")
    public static class116 field2510;

    @OriginalMember(owner = "client!q", name = "ab", descriptor = "Ljb;")
    public static class55 field2519;

    @OriginalMember(owner = "client!q", name = "T", descriptor = "Lmd;")
    public static class76 field2512;

    @OriginalMember(owner = "client!q", name = "C", descriptor = "Lq;")
    public class99 field2496;

    @OriginalMember(owner = "client!q", name = "D", descriptor = "Lq;")
    public class99 field2497;

    @OriginalMember(owner = "client!q", name = "S", descriptor = "[[[B")
    public static byte[][][] field2511;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ILbb;)V", line = 5)
    public static final void method743(int arg0, class8 arg1) {
        field2500++;
        arg1.field216 = arg1.field158;
        if (arg1.field162 == 0) {
            arg1.field172 = 0;
            return;
        }
        if (arg1.field210 != -1 && arg1.field192 == 0) {
            class57 var2 = class70.method519(5, arg1.field210);
            if (arg1.field161 > 0 && var2.field1428 == 0) {
                arg1.field172++;
                return;
            }
            if (arg1.field161 <= 0 && var2.field1421 == 0) {
                arg1.field172++;
                return;
            }
        }
        int var3 = arg1.field177;
        int var4 = arg1.field222;
        int var5 = arg1.field165[arg1.field162 - 1] * 128 + arg1.field207 * 64;
        int var6 = arg1.field219[arg1.field162 + arg0] * 128 + arg1.field207 * 64;
        if (var5 - var3 > 256 || var5 - var3 < -256 || var6 - var4 > 256 || var6 - var4 < -256) {
            arg1.field177 = var5;
            arg1.field222 = var6;
            return;
        }
        if (var3 >= var5) {
            if (var3 <= var5) {
                if (var6 > var4) {
                    arg1.field167 = 1024;
                } else if (var4 > var6) {
                    arg1.field167 = 0;
                }
            } else if (var4 < var6) {
                arg1.field167 = 768;
            } else if (var4 > var6) {
                arg1.field167 = 256;
            } else {
                arg1.field167 = 512;
            }
        } else if (var6 > var4) {
            arg1.field167 = 1280;
        } else if (var4 > var6) {
            arg1.field167 = 1792;
        } else {
            arg1.field167 = 1536;
        }
        int var7 = arg1.field167 - arg1.field187 & 0x7FF;
        int var8 = arg1.field160;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg1.field201;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg1.field179;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg1.field229;
        }
        if (var8 == -1) {
            var8 = arg1.field201;
        }
        arg1.field216 = var8;
        int var9 = 4;
        if (arg1.field187 != arg1.field167 && arg1.field205 == -1 && arg1.field221 != 0) {
            var9 = 2;
        }
        if (arg1.field162 > 2) {
            var9 = 6;
        }
        if (arg1.field162 > 3) {
            var9 = 8;
        }
        if (arg1.field172 > 0 && arg1.field162 > 1) {
            var9 = 8;
            arg1.field172--;
        }
        if (arg1.field197[arg1.field162 - 1]) {
            var9 <<= 0x1;
        }
        if (var5 > var3) {
            arg1.field177 += var9;
            if (arg1.field177 > var5) {
                arg1.field177 = var5;
            }
        } else if (var5 < var3) {
            arg1.field177 -= var9;
            if (arg1.field177 < var5) {
                arg1.field177 = var5;
            }
        }
        if (var6 > var4) {
            arg1.field222 += var9;
            if (arg1.field222 > var6) {
                arg1.field222 = var6;
            }
        } else if (var6 < var4) {
            arg1.field222 -= var9;
            if (arg1.field222 < var6) {
                arg1.field222 = var6;
            }
        }
        if (var9 >= 8 && arg1.field216 == arg1.field201 && arg1.field194 != -1) {
            arg1.field216 = arg1.field194;
        }
        if (arg1.field177 != var5 || arg1.field222 != var6) {
            return;
        }
        arg1.field162--;
        if (arg1.field161 > 0) {
            arg1.field161--;
            return;
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(B)V", line = 189)
    public final void method744(byte arg0) {
        field2503++;
        if (this.field2497 == null) {
            return;
        }
        this.field2497.field2496 = this.field2496;
        int var2 = -35 % ((-arg0 - 4) / 63);
        this.field2496.field2497 = this.field2497;
        this.field2497 = null;
        this.field2496 = null;
    }

    @OriginalMember(owner = "client!q", name = "d", descriptor = "(B)V", line = 210)
    public static final void method745(byte arg0) {
        if (class86.field2186 != null) {
            class86.field2186.method636(1);
        }
        if (arg0 != -54) {
            method743(-93, null);
        }
        field2501++;
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V", line = 230)
    public static final void method746(int arg0) {
        field2498++;
        if (arg0 == -1) {
            class134.field3302.method1013(-1);
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(Z)V", line = 242)
    public static final void method747(boolean arg0) {
        field2494++;
        class94 var1 = null;
        for (int var2 = 0; var2 < class97.field2478; var2++) {
            if (class39.field1008[var2].method711(-34, class51.field1275) != -1) {
                var1 = class39.field1008[var2].method687(class39.field1008[var2].method711(-34, class51.field1275), -123);
                break;
            }
        }
        if (var1 == null) {
            class4.method27((byte) 118);
            return;
        }
        int var3 = class52.field1306;
        if (!arg0) {
            method746(87);
        }
        int var4 = class135.field3313;
        if (var3 > 190) {
            var3 = 190;
        }
        int var5 = class128.field3212;
        int var6 = class79.field2028;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = 6116423;
        class130.method1028(var6, var5, var3, var4, var7);
        class130.method1028(var6 + 1, var5 + 1, var3 - 2, 16, 0);
        class130.method1032(var6 + 1, var5 + 18, var3 - 2, var4 + -19, 0);
        class115.field2913.method103(var1, var6 + 3, var5 + 14, var7, false);
        int var8 = class84.field2121;
        int var9 = class94.field2411;
        if (class40.field1035 == 0) {
            var8 -= 4;
            var9 -= 4;
        }
        if (class40.field1035 == 1) {
            var8 -= 205;
            var9 -= 553;
        }
        if (class40.field1035 == 2) {
            var9 -= 17;
            var8 -= 357;
        }
        for (int var10 = 0; var10 < class97.field2478; var10++) {
            int var11 = 16777215;
            class94 var12 = class39.field1008[var10];
            int var13 = var5 + (class97.field2478 - var10 - 1) * 15 + 31;
            if (var6 < var9 && var3 + var6 > var9 && var13 - 13 < var8 && var13 + 3 > var8) {
                var11 = 16776960;
            }
            if (var12.method722(var1, (byte) 112)) {
                var12 = var12.method706(var12.method710(-123) - var1.method710(-123), (byte) 116, 0);
                if (var12.method722(class73.field1783, (byte) 112)) {
                    var12 = var12.method706(var12.method710(-123) - class73.field1783.method710(-123), (byte) 116, 0);
                }
            }
            class115.field2913.method103(var12, var6 + 3, var13, var11, true);
        }
    }

    @OriginalMember(owner = "client!q", name = "c", descriptor = "(Z)V", line = 364)
    public static void method748(boolean arg0) {
        field2519 = null;
        field2505 = null;
        field2515 = null;
        field2517 = null;
        field2511 = null;
        field2510 = null;
        field2493 = null;
        field2502 = null;
        field2512 = null;
        field2509 = null;
        field2506 = null;
        field2504 = null;
        field2518 = null;
        field2492 = null;
        field2508 = null;
        field2513 = null;
        if (!arg0) {
            field2507 = null;
            field2521 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I[BII)I", line = 391)
    public static final int method749(int arg0, byte[] arg1, int arg2, int arg3) {
        int var4 = -1;
        if (arg3 >= -121) {
            field2521 = null;
        }
        for (int var5 = arg0; var5 < arg2; var5++) {
            var4 = var4 >>> 8 ^ class97.field2480[(var4 ^ arg1[var5]) & 0xFF];
        }
        field2495++;
        return ~var4;
    }
}
