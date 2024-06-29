import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class101 {

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lwb;")
    private static class130 field2424 = class26.method212("Examine", -32376);

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Lwb;")
    public static class130 field2417 = class26.method212("Begeben Sie sich in ein freies Gebiet)1 um", -32376);

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field2426 = 0;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field2414 = -1;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field2429 = 0;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "Lwb;")
    public static class130 field2421 = class26.method212("0(U", -32376);

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "Z")
    public static boolean field2435 = false;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lwb;")
    public static class130 field2419 = field2424;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lwb;")
    private static class130 field2423 = class26.method212("From", -32376);

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field2433 = 0;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "[[I")
    public static int[][] field2441 = new int[104][104];

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "[I")
    public static int[] field2431 = new int[50];

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "I")
    public static int field2440 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "Lwb;")
    public static class130 field2444 = field2423;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Lfe;")
    public static class36 field2428 = new class36(new byte[5000]);

    @OriginalMember(owner = "client!qe", name = "G", descriptor = "Lwb;")
    public static class130 field2445 = class26.method212("Bitte schlie-8en Sie die momentan ge-Offnete Benutzeroberfl-=che)1 bevor Sie die (WRegelversto-8 melden(W Option benutzen", -32376);

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "Lwb;")
    public static class130 field2448 = class26.method212("backvmid1", -32376);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    private int field2434;

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "J")
    private long field2416;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "J")
    private long field2443;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "Lda;")
    public static class20 field2447;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "Lb;")
    public static class7 field2446;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Z")
    public boolean field2415;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
    private int[] field2418;

    @OriginalMember(owner = "client!qe", name = "D", descriptor = "[I")
    private int[] field2442;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lr;", line = 5)
    public final class102 method751(byte arg0) {
        field2422++;
        if (this.field2434 != -1) {
            return class89.method663(this.field2434, (byte) -6).method628(true);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field2442[var3];
            if (var12 >= 256 && var12 < 512 && !class117.method905((byte) -21, var12 - 256).method61((byte) -23)) {
                var2 = true;
            }
            if (var12 >= 512 && !class84.method630((byte) 11, var12 - 512).method547(this.field2415, arg0 ^ 0xFFFFFF84)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class102[] var4 = new class102[12];
        if (arg0 != -78) {
            return null;
        }
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field2442[var6];
            if (var9 >= 256 && var9 < 512) {
                class102 var10 = class117.method905((byte) -21, var9 - 256).method68((byte) -45);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class102 var11 = class84.method630((byte) 11, var9 - 512).method557((byte) 98, this.field2415);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class102 var7 = new class102(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (this.field2418[var8] != 0) {
                var7.method763(class2.field62[var8][0], class2.field62[var8][this.field2418[var8]]);
                if (var8 == 1) {
                    var7.method763(class22.field637[0], class22.field637[this.field2418[var8]]);
                }
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZZI)V", line = 121)
    public final void method752(boolean arg0, boolean arg1, int arg2) {
        field2432++;
        if (arg2 == 1 && this.field2415) {
            return;
        }
        int var4 = this.field2442[class71.field1804[arg2]];
        if (var4 == 0 || arg1) {
            return;
        }
        var4 -= 256;
        class8 var5;
        do {
            if (arg0) {
                var4++;
                if (var4 >= class51.field1352) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class51.field1352 - 1;
                }
            }
            var5 = class117.method905((byte) -21, var4);
        } while (var5 == null || var5.field290 || arg2 + (this.field2415 ? 7 : 0) != var5.field268);
        this.field2442[class71.field1804[arg2]] = var4 + 256;
        this.method756(-127);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V", line = 167)
    public static void method753(int arg0) {
        if (arg0 < 123) {
            method753(-58);
        }
        field2419 = null;
        field2446 = null;
        field2448 = null;
        field2431 = null;
        field2445 = null;
        field2417 = null;
        field2428 = null;
        field2424 = null;
        field2441 = null;
        field2423 = null;
        field2444 = null;
        field2421 = null;
        field2447 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILfe;)V", line = 198)
    public final void method754(int arg0, class36 arg1) {
        field2430++;
        arg1.method330(-1, this.field2415 ? 1 : 0);
        int var3 = 0;
        if (arg0 != 1609) {
            field2448 = null;
        }
        while (var3 < 7) {
            int var5 = this.field2442[class71.field1804[var3]];
            if (var5 == 0) {
                arg1.method330(arg0 ^ 0xFFFFF9B6, -1);
            } else {
                arg1.method330(-1, var5 - 256);
            }
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg1.method330(arg0 - 1610, this.field2418[var4]);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZI)V", line = 231)
    public final void method755(int arg0, boolean arg1, int arg2) {
        int var4 = this.field2418[arg2];
        if (arg0 != -1) {
            return;
        }
        if (arg1) {
            var4++;
            if (var4 >= class2.field62[arg2].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class2.field62[arg2].length - 1;
            }
        }
        field2438++;
        this.field2418[arg2] = var4;
        this.method756(121);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V", line = 262)
    private final void method756(int arg0) {
        long var2 = this.field2416;
        field2427++;
        int var4 = this.field2442[5];
        int var5 = this.field2442[9];
        this.field2442[5] = var5;
        int var6 = -2 / ((arg0 - 50) / 38);
        this.field2442[9] = var4;
        this.field2416 = 0L;
        for (int var7 = 0; var7 < 12; var7++) {
            this.field2416 <<= 0x4;
            if (this.field2442[var7] >= 256) {
                this.field2416 += this.field2442[var7] - 256;
            }
        }
        if (this.field2442[0] >= 256) {
            this.field2416 += this.field2442[0] - 256 >> 4;
        }
        if (this.field2442[1] >= 256) {
            this.field2416 += this.field2442[1] - 256 >> 8;
        }
        for (int var8 = 0; var8 < 5; var8++) {
            this.field2416 <<= 0x3;
            this.field2416 += this.field2418[var8];
        }
        this.field2416 <<= 0x1;
        this.field2416 += this.field2415 ? 1 : 0;
        this.field2442[5] = var4;
        this.field2442[9] = var5;
        if (var2 != 0L && this.field2416 != var2) {
            class111.field2718.method405(var2, false);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lgd;IZILgd;)Lr;", line = 320)
    public final class102 method757(class40 arg0, int arg1, boolean arg2, int arg3, class40 arg4) {
        field2413++;
        if (this.field2434 != -1) {
            return class89.method663(this.field2434, (byte) -6).method637(arg1, arg0, true, arg3, arg4);
        }
        int[] var6 = this.field2442;
        if (arg2) {
            field2431 = null;
        }
        long var7 = this.field2416;
        if (arg0 != null && (arg0.field1122 >= 0 || arg0.field1144 >= 0)) {
            var6 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var6[var9] = this.field2442[var9];
            }
            if (arg0.field1122 >= 0) {
                var7 += arg0.field1122 - this.field2442[5] << 8;
                var6[5] = arg0.field1122;
            }
            if (arg0.field1144 >= 0) {
                var7 += arg0.field1144 - this.field2442[3] << 16;
                var6[3] = arg0.field1144;
            }
        }
        class102 var10 = (class102) class111.field2718.method402(var7, -118);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var20 = var6[var12];
                if (var20 >= 256 && var20 < 512 && !class117.method905((byte) -21, var20 - 256).method60((byte) 69)) {
                    var11 = true;
                }
                if (var20 >= 512 && !class84.method630((byte) 11, var20 - 512).method555(false, this.field2415)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field2443 != -1L) {
                    var10 = (class102) class111.field2718.method402(this.field2443, -124);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class102[] var13 = new class102[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var17 = var6[var15];
                    if (var17 >= 256 && var17 < 512) {
                        class102 var18 = class117.method905((byte) -21, var17 - 256).method70((byte) 110);
                        if (var18 != null) {
                            var13[var14++] = var18;
                        }
                    }
                    if (var17 >= 512) {
                        class102 var19 = class84.method630((byte) 11, var17 - 512).method556(this.field2415, 3);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                }
                var10 = new class102(var13, var14);
                for (int var16 = 0; var16 < 5; var16++) {
                    if (this.field2418[var16] != 0) {
                        var10.method763(class2.field62[var16][0], class2.field62[var16][this.field2418[var16]]);
                        if (var16 == 1) {
                            var10.method763(class22.field637[0], class22.field637[this.field2418[var16]]);
                        }
                    }
                }
                var10.method772();
                var10.method783(64, 850, -30, -50, -30, true);
                class111.field2718.method403(var7, var10, (byte) -101);
                this.field2443 = var7;
            }
        }
        if (arg0 == null && arg4 == null) {
            return var10;
        }
        class102 var21;
        if (arg0 != null && arg4 != null) {
            var21 = arg0.method394(arg3, arg4, arg1, 99, var10);
        } else if (arg0 == null) {
            var21 = arg4.method391(var10, arg3, !arg2);
        } else {
            var21 = arg0.method391(var10, arg1, true);
        }
        return var21;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z[IBI[I)V", line = 527)
    public final void method758(boolean arg0, int[] arg1, byte arg2, int arg3, int[] arg4) {
        if (arg4 == null) {
            arg4 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class51.field1352; var7++) {
                    class8 var8 = class117.method905((byte) -21, var7);
                    if (var8 != null && !var8.field290 && var6 + (arg0 ? 7 : 0) == var8.field268) {
                        arg4[class71.field1804[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        if (arg2 != -9) {
            this.method755(75, false, 79);
        }
        field2425++;
        this.field2415 = arg0;
        this.field2442 = arg4;
        this.field2418 = arg1;
        this.field2434 = arg3;
        this.method756(arg2 ^ 0xFFFFFFAB);
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)V", line = 578)
    public static final void method759(int arg0) {
        field2437++;
        if (class93.field2250 == null) {
            return;
        }
        class15.method112(-16146);
        if (class45.field1202 > 0) {
            class93.field2250.method179((byte) -127, 256);
            class45.field1202 = 0;
        }
        if (arg0 != -6742) {
            method759(14);
        }
        class93.field2250.method170((byte) 123);
        class93.field2250 = null;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)I", line = 605)
    public final int method760(int arg0) {
        if (arg0 != -256) {
            this.method752(true, false, -95);
        }
        field2436++;
        return this.field2434 == -1 ? (this.field2442[11] << 5) + (this.field2418[0] << 25) + this.field2442[1] + (this.field2418[4] << 20) + (this.field2442[8] << 10) + (this.field2442[0] << 15) : class89.method663(this.field2434, (byte) -6).field2009 + 305419896;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)V", line = 646)
    public final void method761(boolean arg0, int arg1) {
        if (arg1 != -1) {
            field2423 = null;
        }
        field2439++;
        if (arg0 != this.field2415) {
            this.method758(arg0, this.field2418, (byte) -9, -1, null);
        }
    }
}
