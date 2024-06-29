import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class114 {

    @OriginalMember(owner = "client!ma", name = "k", descriptor = "Lrf;")
    public static class163 field2409 = class53.method392(-85, "Standort");

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "[I")
    public static int[] field2410 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Lrf;")
    public static class163 field2426 = class53.method392(51, "(U0a )2 in: ");

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field2427 = 2301979;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "Lrf;")
    private static class163 field2417 = class53.method392(76, "No response from server)3");

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Lrf;")
    public static class163 field2424 = field2417;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "Lrf;")
    private static class163 field2430 = class53.method392(49, " is already on your ignore list)3");

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field2429 = 1;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "Lrf;")
    public static class163 field2416 = field2430;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!ma", name = "g", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!ma", name = "h", descriptor = "I")
    public static int field2406;

    @OriginalMember(owner = "client!ma", name = "i", descriptor = "I")
    public static int field2407;

    @OriginalMember(owner = "client!ma", name = "j", descriptor = "I")
    public static int field2408;

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!ma", name = "A", descriptor = "I")
    private int field2425;

    @OriginalMember(owner = "client!ma", name = "D", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "J")
    private long field2399;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "J")
    private long field2415;

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "Z")
    public boolean field2402;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "[I")
    private int[] field2401;

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "[I")
    private int[] field2421;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "[Lpf;")
    public static class145[] field2414;

    @OriginalMember(owner = "client!ma", name = "y", descriptor = "[Lrh;")
    public static class165[] field2423;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method780(Throwable arg0, int arg1) throws IOException {
        field2419++;
        String var3;
        if (arg0 instanceof class186) {
            class186 var2 = (class186) arg0;
            arg0 = var2.field3704;
            var3 = var2.field3705 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        if (arg1 != -20755) {
            method783(-35);
        }
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            while (true) {
                String var9 = var7.readLine();
                if (var9 == null) {
                    return var3 + "| " + var8;
                }
                int var10 = var9.indexOf(40);
                int var11 = var9.indexOf(41, var10 + 1);
                if (var10 >= 0 && var11 >= 0) {
                    String var12 = var9.substring(var10 + 1, var11);
                    int var13 = var12.indexOf(".java:");
                    if (var13 >= 0) {
                        String var14 = var12.substring(0, var13) + var12.substring(var13 + 5);
                        var3 = var3 + var14 + ' ';
                        continue;
                    }
                    var9 = var9.substring(0, var10);
                }
                String var15 = var9.trim();
                String var16 = var15.substring(var15.lastIndexOf(32) + 1);
                String var17 = var16.substring(var16.lastIndexOf(9) + 1);
                var3 = var3 + var17 + ' ';
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IB)Z")
    public static final boolean method781(int arg0, byte arg1) {
        field2400++;
        if (class136.field2815[arg0]) {
            return true;
        } else if (class158.field3232.method1238(arg0, 121)) {
            int var2 = class158.field3232.method1225(arg0, true);
            if (var2 == 0) {
                class136.field2815[arg0] = true;
                return true;
            }
            if (class84.field1798[arg0] == null) {
                class84.field1798[arg0] = new class84[var2];
            }
            int var3 = 0;
            if (arg1 > -117) {
                field2430 = null;
            }
            while (var2 > var3) {
                if (class84.field1798[arg0][var3] == null) {
                    byte[] var4 = class158.field3232.method1235(var3, (byte) -64, arg0);
                    if (var4 != null) {
                        class84.field1798[arg0][var3] = new class84();
                        class84.field1798[arg0][var3].field1782 = (arg0 << 16) + var3;
                        if (var4[0] == -1) {
                            class84.field1798[arg0][var3].method590(-116, new class52(var4));
                        } else {
                            class84.field1798[arg0][var3].method586(-14293, new class52(var4));
                        }
                    }
                }
                var3++;
            }
            class136.field2815[arg0] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(III)V")
    public final void method782(int arg0, int arg1, int arg2) {
        field2418++;
        int var4 = class201.field3976[arg0];
        if (this.field2401[var4] != 0 && class70.method504(true, arg1) != null) {
            this.field2401[var4] = class150.method971(arg2, arg1);
            this.method787(true);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static final void method783(int arg0) {
        class64.method457(-100);
        field2403++;
        class82.method550((byte) 50);
        class106.method720(-78);
        class209.method1365(0);
        class137.method902(256);
        class187.method1264(116);
        class176.method1192(2);
        class12.method92((byte) 76);
        class199.method1312(128);
        class124.method836(4096);
        class15.method97(1);
        class15.method100(32);
        ((class197) class1.field17).method1309((byte) -36);
        class208.field4064.method399(false);
        class49.field958.method1249((byte) -112);
        class163.field3311.method1249((byte) -83);
        class62.field1313.method1249((byte) 46);
        class121.field2552.method1249((byte) -123);
        class72.field1519.method1249((byte) -84);
        class134.field2777.method1249((byte) 34);
        class17.field299.method1249((byte) -111);
        int var1 = -15 % ((15 - arg0) / 63);
        class175.field3517.method1249((byte) -99);
        class108.field2246.method1249((byte) 40);
        class181.field3630.method1249((byte) -109);
        class95.field2032.method1249((byte) -126);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLre;I)Lje;")
    public final class91 method784(byte arg0, class162 arg1, int arg2) {
        field2406++;
        if (arg0 < 16) {
            this.field2425 = -50;
        }
        if (this.field2425 != -1) {
            return class43.method262(18354, this.field2425).method852(arg2, (byte) -52, arg1);
        }
        class91 var4 = (class91) class40.field823.method401(this.field2399, (byte) 101);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field2401[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class70.method504(true, var15 & 0x3FFFFFFF).method986(-124)) {
                        var5 = true;
                    }
                } else if (!class97.method669(-110, var15 & 0x3FFFFFFF).method39(this.field2402, false)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class50[] var8 = new class50[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field2401[var9];
                if ((var12 & 0x40000000) != 0) {
                    class50 var14 = class97.method669(-128, var12 & 0x3FFFFFFF).method32(-115, this.field2402);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class50 var13 = class70.method504(true, var12 & 0x3FFFFFFF).method984((byte) -54);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
            }
            class50 var10 = new class50(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class199.field3938[var11].length > this.field2421[var11]) {
                    var10.method319(class129.field2687[var11], class199.field3938[var11][this.field2421[var11]]);
                }
                if (this.field2421[var11] < class117.field2481[var11].length) {
                    var10.method319(class161.field3262[var11], class117.field2481[var11][this.field2421[var11]]);
                }
            }
            var4 = var10.method308(64, 768, -50, -10, -50, true, true);
            class40.field823.method398(var4, this.field2399, (byte) 112);
        }
        if (arg1 != null) {
            var4 = arg1.method1021(var4, 828867248, arg2);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BZ[I[II)V")
    public final void method785(byte arg0, boolean arg1, int[] arg2, int[] arg3, int arg4) {
        field2422++;
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class99.field2093; var7++) {
                    class154 var8 = class70.method504(true, var7);
                    if (var8 != null && !var8.field3197 && var8.field3192 == var6 + (arg1 ? 7 : 0)) {
                        arg3[class201.field3976[var6]] = class150.method971(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field2421 = arg2;
        this.field2402 = arg1;
        this.field2425 = arg4;
        int var9 = 44 / ((arg0 - 19) / 38);
        this.field2401 = arg3;
        this.method787(true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Lre;Lre;ZII)Lje;")
    public final class91 method786(class162 arg0, class162 arg1, boolean arg2, int arg3, int arg4) {
        field2428++;
        if (!arg2) {
            this.method788(117);
        }
        if (this.field2425 != -1) {
            return class43.method262(18354, this.field2425).method849(-3944, arg4, arg0, arg3, arg1);
        }
        int[] var6 = this.field2401;
        long var7 = this.field2399;
        if (arg0 != null && (arg0.field3286 >= 0 || arg0.field3285 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field2401[var9];
            }
            if (arg0.field3286 >= 0) {
                if (arg0.field3286 == 65535) {
                    var7 ^= 0xFFFFFFFF00000000L;
                    var6[5] = 0;
                } else {
                    var6[5] = class150.method971(1073741824, arg0.field3286);
                    var7 ^= (long) var6[5] << 32;
                }
            }
            if (arg0.field3285 >= 0) {
                if (arg0.field3285 == 65535) {
                    var7 ^= 0xFFFFFFFFL;
                    var6[3] = 0;
                } else {
                    var6[3] = class150.method971(1073741824, arg0.field3285);
                    var7 ^= var6[3];
                }
            }
        }
        class91 var10 = (class91) class17.field295.method401(var7, (byte) 107);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var6[var12];
                if ((var21 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var21) != 0 && !class70.method504(true, var21 & 0x3FFFFFFF).method989(9759)) {
                        var11 = true;
                    }
                } else if (!class97.method669(-101, var21 & 0x3FFFFFFF).method38(this.field2402, (byte) -51)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2415 != -1L) {
                    var10 = (class91) class17.field295.method401(this.field2415, (byte) -112);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class50[] var13 = new class50[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var6[var15];
                    if ((var18 & 0x40000000) != 0) {
                        class50 var20 = class97.method669(-127, var18 & 0x3FFFFFFF).method37(3, this.field2402);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    } else if ((var18 & Integer.MIN_VALUE) != 0) {
                        class50 var19 = class70.method504(true, var18 & 0x3FFFFFFF).method988(0);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                class50 var16 = new class50(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (class199.field3938[var17].length > this.field2421[var17]) {
                        var16.method319(class129.field2687[var17], class199.field3938[var17][this.field2421[var17]]);
                    }
                    if (class117.field2481[var17].length > this.field2421[var17]) {
                        var16.method319(class161.field3262[var17], class117.field2481[var17][this.field2421[var17]]);
                    }
                }
                var10 = var16.method308(64, 850, -30, -50, -30, true, true);
                class17.field295.method398(var10, var7, (byte) 71);
                this.field2415 = var7;
            }
        }
        if (arg0 == null && arg1 == null) {
            return var10;
        }
        class91 var22;
        if (arg0 != null && arg1 != null) {
            var22 = arg0.method1014((byte) -71, arg1, var10, arg4, arg3);
        } else if (arg0 == null) {
            var22 = arg1.method1019(arg4, -128, var10);
        } else {
            var22 = arg0.method1019(arg3, -122, var10);
        }
        return var22;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Z)V")
    private final void method787(boolean arg0) {
        long var2 = this.field2399;
        this.field2399 = -1L;
        field2420++;
        long[] var4 = class187.field3724;
        int var5 = 0;
        if (!arg0) {
            this.method791(9, 27, (byte) 74);
        }
        while (var5 < 12) {
            this.field2399 = this.field2399 >>> 8 ^ var4[(int) ((this.field2399 ^ (long) (this.field2401[var5] >> 24)) & 0xFFL)];
            this.field2399 = var4[(int) (((long) (this.field2401[var5] >> 16) ^ this.field2399) & 0xFFL)] ^ this.field2399 >>> 8;
            this.field2399 = this.field2399 >>> 8 ^ var4[(int) (((long) (this.field2401[var5] >> 8) ^ this.field2399) & 0xFFL)];
            this.field2399 = var4[(int) (((long) this.field2401[var5] ^ this.field2399) & 0xFFL)] ^ this.field2399 >>> 8;
            var5++;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field2399 = var4[(int) ((this.field2399 ^ (long) this.field2421[var6]) & 0xFFL)] ^ this.field2399 >>> 8;
        }
        this.field2399 = this.field2399 >>> 8 ^ var4[(int) (((long) (this.field2402 ? 1 : 0) ^ this.field2399) & 0xFFL)];
        if (var2 != 0L && this.field2399 != var2) {
            class17.field295.method402((byte) 27, var2);
        }
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(I)I")
    public final int method788(int arg0) {
        if (arg0 == 11) {
            field2413++;
            return this.field2425 == -1 ? (this.field2401[11] << 5) + ((this.field2421[4] << 20) + (this.field2421[0] << 25) - (-(this.field2401[0] << 15) + -(this.field2401[8] << 10))) + this.field2401[1] : class43.method262(18354, this.field2425).field2662 + 305419896;
        } else {
            return 77;
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLfa;)V")
    public final void method789(byte arg0, class52 arg1) {
        arg1.method370(this.field2402 ? 1 : 0, (byte) 123);
        int var3 = 0;
        if (arg0 > -48) {
            this.method790(false, -61, (byte) -24);
        }
        while (var3 < 7) {
            int var5 = this.field2401[class201.field3976[var3]];
            if ((Integer.MIN_VALUE & var5) == 0) {
                arg1.method346(0, 65535);
            } else {
                arg1.method346(0, var5 & 0x3FFFFFFF);
            }
            var3++;
        }
        field2404++;
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method370(this.field2421[var4], (byte) 123);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZIB)V")
    public final void method790(boolean arg0, int arg1, byte arg2) {
        int var4 = -125 % ((arg2 + 65) / 40);
        int var5 = this.field2421[arg1];
        field2411++;
        if (arg0) {
            var5++;
            if (var5 >= class199.field3938[arg1].length) {
                var5 = 0;
            }
        } else {
            var5--;
            if (var5 < 0) {
                var5 = class199.field3938[arg1].length - 1;
            }
        }
        this.field2421[arg1] = var5;
        this.method787(true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIB)V")
    public final void method791(int arg0, int arg1, byte arg2) {
        int var4 = 85 % ((62 - arg2) / 45);
        this.field2421[arg1] = arg0;
        field2407++;
        this.method787(true);
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IZ)V")
    public final void method792(int arg0, boolean arg1) {
        field2405++;
        if (arg1 != this.field2402) {
            this.method785((byte) 79, arg1, this.field2421, null, -1);
            if (arg0 != -24238) {
                this.method790(false, -113, (byte) 31);
            }
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BZ)V")
    public final void method793(byte arg0, boolean arg1) {
        this.field2402 = arg1;
        if (arg0 == -97) {
            field2412++;
            this.method787(true);
        }
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIZ)V")
    public final void method794(int arg0, int arg1, boolean arg2) {
        field2408++;
        if (arg1 == 1 && this.field2402 || arg0 >= -91) {
            return;
        }
        int var4 = this.field2401[class201.field3976[arg1]];
        if (var4 == 0) {
            return;
        }
        int var5 = var4 & 0x3FFFFFFF;
        class154 var6;
        do {
            if (arg2) {
                var5++;
                if (var5 >= class99.field2093) {
                    var5 = 0;
                }
            } else {
                var5--;
                if (var5 < 0) {
                    var5 = class99.field2093 - 1;
                }
            }
            var6 = class70.method504(true, var5);
        } while (var6 == null || var6.field3197 || (this.field2402 ? 7 : 0) + arg1 != var6.field3192);
        this.field2401[class201.field3976[arg1]] = class150.method971(var5, Integer.MIN_VALUE);
        this.method787(true);
    }

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "(Z)V")
    public static void method795(boolean arg0) {
        field2417 = null;
        if (!arg0) {
            return;
        }
        field2424 = null;
        field2423 = null;
        field2410 = null;
        field2414 = null;
        field2416 = null;
        field2430 = null;
        field2409 = null;
        field2426 = null;
    }
}
