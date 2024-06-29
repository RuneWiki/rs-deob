import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class175 extends class69 {

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2814 = "Members object";

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field2821 = 0;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "Ljava/lang/String;")
    public static String field2818 = "Loaded sprites";

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field2811;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field2813;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field2815;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    public static int field2819;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field2822;

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "J")
    public long field2817;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "Lei;")
    public class175 field2812;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Lei;")
    public class175 field2816;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V")
    public static void method1208(int arg0) {
        if (arg0 <= -101) {
            field2814 = null;
            field2818 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(III)Lwb;")
    public static final class138 method1209(int arg0, int arg1, int arg2) {
        class99 var3 = class273.field4415[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1503; var4++) {
            class138 var5 = var3.field1496[var4];
            if ((var5.field2275 >> 29 & 0x3L) == 2L && var5.field2272 == arg1 && var5.field2284 == arg2) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)Lfd;")
    public static final class219 method1210(byte arg0) {
        if (arg0 != -122) {
            method1208(83);
        }
        class201.field3238 = 0;
        field2811++;
        return class12.method69(false);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V")
    public static final void method1211(int arg0) {
        int var1 = class250.field4007;
        byte var2 = 20;
        int var3 = class283.field4512 - 3;
        field2813++;
        int var4 = class179.field2897;
        int var5 = class214.field3451;
        if (class162.field2630 == null || class153.field2470 == null) {
            if (class169.field2739.method935((byte) 31, class130.field2180) && class169.field2739.method935((byte) 31, class33.field409)) {
                class162.field2630 = class204.method1370(-68, 0, class130.field2180, class169.field2739);
                class153.field2470 = class204.method1370(-104, 0, class33.field409, class169.field2739);
            } else {
                class63.method504(var1, var5, var4, var2, class74.field1012, 256 - class62.field867);
            }
        }
        if (class162.field2630 != null && class153.field2470 != null) {
            int var6 = (var4 - class153.field2470.field4383 * 2) / class162.field2630.field4383;
            for (int var7 = 0; var7 < var6; var7++) {
                class162.field2630.method174(class162.field2630.field4383 * var7 + class153.field2470.field4383 + var1, var5);
            }
            class153.field2470.method174(var1, var5);
            class153.field2470.method170(var1 + var4 - class153.field2470.field4383, var5);
        }
        class283.field4524.method1121(class205.field3282, var1 + 3, var5 + 14, class267.field4335, -1);
        class63.method504(var1, var2 + var5, var4, var3 - var2, class74.field1012, 256 - class62.field867);
        int var8 = class250.field4000;
        int var9 = class109.field1893;
        for (int var10 = 0; var10 < class202.field3248; var10++) {
            int var19 = var5 + ((class202.field3248 - var10 - 1) * 15) + var2 + 13;
            if (var9 > var1 && var9 < (var1 + var4) && var8 > (var19 - 13) && var19 + 3 > var8) {
                class63.method504(var1, var19 - 12, var4, 15, class247.field3972, 256 - class64.field901);
            }
        }
        if ((class226.field3578 == null || class57.field802 == null || class159.field2593 == null) && class169.field2739.method935((byte) 31, class49.field624) && class169.field2739.method935((byte) 31, class20.field234) && class169.field2739.method935((byte) 31, class129.field2167)) {
            class226.field3578 = class204.method1370(-54, 0, class49.field624, class169.field2739);
            class57.field802 = class204.method1370(-81, 0, class20.field234, class169.field2739);
            class159.field2593 = class204.method1370(-110, 0, class129.field2167, class169.field2739);
        }
        if (class226.field3578 != null && class57.field802 != null && class159.field2593 != null) {
            int var11 = (var4 - (class159.field2593.field4383 * 2)) / class226.field3578.field4383;
            for (int var12 = 0; var12 < var11; var12++) {
                class226.field3578.method174(class159.field2593.field4383 + var1 + (class226.field3578.field4383 * var12), -class226.field3578.field4372 + var3 + var5);
            }
            int var13 = (var3 - var2 - class159.field2593.field4372) / class57.field802.field4372;
            for (int var14 = 0; var14 < var13; var14++) {
                class57.field802.method174(var1, var5 + var2 + (class57.field802.field4372 * var14));
                class57.field802.method170(var1 + var4 - class57.field802.field4383, var5 - -var2 - -(class57.field802.field4372 * var14));
            }
            class159.field2593.method174(var1, var3 + var5 - class159.field2593.field4372);
            class159.field2593.method170(var1 + var4 - class159.field2593.field4383, -class159.field2593.field4372 + var5 + var3);
        }
        int var15 = 0;
        int var16 = 89 / ((arg0 + 64) / 59);
        while (class202.field3248 > var15) {
            int var17 = (class202.field3248 - var15 - 1) * 15 + var2 + var5 + 13;
            int var18 = class267.field4335;
            if (var9 > var1 && var9 < var1 + var4 && var8 > var17 - 13 && (var17 + 3) > var8) {
                var18 = class86.field1178;
            }
            class283.field4524.method1121(class207.method1396((byte) 82, var15), var1 + 3, var17, var18, 0);
            var15++;
        }
        class296.method1976(15527, class250.field4007, class179.field2897, class214.field3451, class283.field4512);
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(Z)V")
    public static final void method1212(boolean arg0) {
        if (arg0) {
            method1208(-84);
        }
        field2822++;
        class207.field3335.method1834(0);
        class7.field105.method1834(0);
        class111.field1908.method1834(0);
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(Z)V")
    public final void method1213(boolean arg0) {
        field2823++;
        if (this.field2812 == null) {
            return;
        }
        this.field2812.field2816 = this.field2816;
        this.field2816.field2812 = this.field2812;
        this.field2812 = null;
        this.field2816 = null;
        if (!arg0) {
            method1214(93);
        }
    }

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "(I)V")
    public static final void method1214(int arg0) {
        class42.field504 = 0;
        class51.field719 = -1;
        field2824++;
        class189.field3025 = 0;
        class162.field2626 = -1;
        class73.field1001 = 0;
        class121.field2038 = -1;
        class5.field60 = 0;
        class83.field1148.field4195 = 0;
        class52.field742 = 0;
        class240.field3852 = false;
        class220.field3519 = -1;
        class202.field3248 = 0;
        class166.field2709.field4195 = 0;
        int var1 = 0;
        if (arg0 != -8222) {
            field2818 = null;
        }
        while (class260.field4141.length > var1) {
            if (class260.field4141[var1] != null) {
                class260.field4141[var1].field603 = -1;
            }
            var1++;
        }
        for (int var2 = 0; var2 < class198.field3193.length; var2++) {
            if (class198.field3193[var2] != null) {
                class198.field3193[var2].field603 = -1;
            }
        }
        class33.method227((byte) -113);
        class92.field1316 = 1;
        class233.method1539(30, (byte) 32);
        for (int var3 = 0; var3 < 100; var3++) {
            class272.field4396[var3] = true;
        }
        class237.method1559(true);
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V")
    public static final void method1215(int arg0) {
        field2820++;
        if (arg0 <= 20) {
            field2818 = null;
        }
        class57.field794.method1834(0);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method1216(String arg0, int arg1) {
        if (arg1 <= 71) {
            field2818 = null;
        }
        field2815++;
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZIIIZLjj;)V")
    public static final void method1217(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, class134 arg6) {
        class130.field2178 = 1;
        class52.field745 = arg4;
        class111.field1919 = arg0;
        if (arg5) {
            return;
        }
        field2819++;
        class110.field1899 = arg6;
        class20.field236 = arg3;
        class86.field1179 = arg1;
        class230.field3657 = arg2;
    }
}
