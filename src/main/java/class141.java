import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class141 extends class150 {

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "[I")
    private int[] field3417 = new int[16];

    @OriginalMember(owner = "client!v", name = "G", descriptor = "[I")
    private int[] field3407 = new int[16];

    @OriginalMember(owner = "client!v", name = "ab", descriptor = "[I")
    public int[] field3426 = new int[16];

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    private int field3410 = 256;

    @OriginalMember(owner = "client!v", name = "W", descriptor = "[I")
    private int[] field3422 = new int[16];

    @OriginalMember(owner = "client!v", name = "mb", descriptor = "[I")
    private int[] field3438 = new int[16];

    @OriginalMember(owner = "client!v", name = "Cb", descriptor = "[[Lce;")
    private class20[][] field3454 = new class20[16][128];

    @OriginalMember(owner = "client!v", name = "fb", descriptor = "[I")
    public int[] field3431 = new int[16];

    @OriginalMember(owner = "client!v", name = "gb", descriptor = "[I")
    private int[] field3432 = new int[16];

    @OriginalMember(owner = "client!v", name = "jb", descriptor = "[I")
    private int[] field3435 = new int[16];

    @OriginalMember(owner = "client!v", name = "vb", descriptor = "[I")
    private int[] field3447 = new int[16];

    @OriginalMember(owner = "client!v", name = "Hb", descriptor = "[I")
    private int[] field3459 = new int[16];

    @OriginalMember(owner = "client!v", name = "Eb", descriptor = "[I")
    private int[] field3456 = new int[16];

    @OriginalMember(owner = "client!v", name = "rb", descriptor = "[[Lce;")
    private class20[][] field3443 = new class20[16][128];

    @OriginalMember(owner = "client!v", name = "Fb", descriptor = "[I")
    private int[] field3457 = new int[16];

    @OriginalMember(owner = "client!v", name = "wb", descriptor = "[I")
    private int[] field3448 = new int[16];

    @OriginalMember(owner = "client!v", name = "Jb", descriptor = "[I")
    public int[] field3461 = new int[16];

    @OriginalMember(owner = "client!v", name = "Wb", descriptor = "[I")
    private int[] field3474 = new int[16];

    @OriginalMember(owner = "client!v", name = "D", descriptor = "Lkd;")
    private class73 field3404 = new class73();

    @OriginalMember(owner = "client!v", name = "dc", descriptor = "Lwa;")
    private class148 field3481 = new class148(this);

    @OriginalMember(owner = "client!v", name = "T", descriptor = "Loe;")
    private class102 field3419 = new class102(128);

    @OriginalMember(owner = "client!v", name = "I", descriptor = "Lu;")
    private static class135 field3409 = class87.method676((byte) -42, "Message");

    @OriginalMember(owner = "client!v", name = "X", descriptor = "Lu;")
    public static class135 field3423 = class87.method676((byte) -110, "Hier wechseln");

    @OriginalMember(owner = "client!v", name = "ib", descriptor = "I")
    public static int field3434 = 0;

    @OriginalMember(owner = "client!v", name = "hb", descriptor = "Lu;")
    public static class135 field3433 = null;

    @OriginalMember(owner = "client!v", name = "Ib", descriptor = "Lu;")
    public static class135 field3460 = class87.method676((byte) -102, "Abbrechen");

    @OriginalMember(owner = "client!v", name = "pb", descriptor = "Lu;")
    public static class135 field3441 = field3409;

    @OriginalMember(owner = "client!v", name = "Sb", descriptor = "Lu;")
    public static class135 field3470 = class87.method676((byte) -54, "::qa_op_test");

    @OriginalMember(owner = "client!v", name = "Ub", descriptor = "Z")
    public static boolean field3472 = false;

    @OriginalMember(owner = "client!v", name = "Ob", descriptor = "Lu;")
    private static class135 field3466 = class87.method676((byte) -103, "Loaded wordpack");

    @OriginalMember(owner = "client!v", name = "V", descriptor = "Lu;")
    public static class135 field3421 = field3466;

    @OriginalMember(owner = "client!v", name = "z", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!v", name = "A", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!v", name = "B", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!v", name = "C", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "I")
    public static int field3406;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field3418;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "I")
    public static int field3420;

    @OriginalMember(owner = "client!v", name = "Y", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!v", name = "Z", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!v", name = "bb", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!v", name = "cb", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!v", name = "db", descriptor = "I")
    public static int field3429;

    @OriginalMember(owner = "client!v", name = "eb", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!v", name = "kb", descriptor = "I")
    public static int field3436;

    @OriginalMember(owner = "client!v", name = "lb", descriptor = "I")
    public static int field3437;

    @OriginalMember(owner = "client!v", name = "nb", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!v", name = "ob", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!v", name = "qb", descriptor = "I")
    public static int field3442;

    @OriginalMember(owner = "client!v", name = "sb", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!v", name = "tb", descriptor = "I")
    public static int field3445;

    @OriginalMember(owner = "client!v", name = "ub", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!v", name = "xb", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!v", name = "yb", descriptor = "I")
    public static int field3450;

    @OriginalMember(owner = "client!v", name = "zb", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!v", name = "Ab", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!v", name = "Bb", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!v", name = "Db", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!v", name = "Gb", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!v", name = "Kb", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!v", name = "Mb", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!v", name = "Nb", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!v", name = "Pb", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!v", name = "Qb", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!v", name = "Rb", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!v", name = "Tb", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!v", name = "Xb", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!v", name = "Zb", descriptor = "I")
    private int field3477;

    @OriginalMember(owner = "client!v", name = "ac", descriptor = "I")
    private int field3478;

    @OriginalMember(owner = "client!v", name = "bc", descriptor = "J")
    private long field3479;

    @OriginalMember(owner = "client!v", name = "cc", descriptor = "J")
    private long field3480;

    @OriginalMember(owner = "client!v", name = "Vb", descriptor = "Lpe;")
    public static class109 field3473;

    @OriginalMember(owner = "client!v", name = "Lb", descriptor = "Lve;")
    public static class146 field3463;

    @OriginalMember(owner = "client!v", name = "Yb", descriptor = "Z")
    private boolean field3476;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(III)V")
    public static final void method1131(int arg0, int arg1, int arg2) {
        field3450++;
        if (arg1 != 0) {
            method1131(83, -72, 8);
        }
        class23 var3 = class48.field1142[class136.field3301][arg2][arg0];
        if (var3 == null) {
            class100.field2418.method1039(class136.field3301, arg2, arg0);
            return;
        }
        int var4 = -99999999;
        class105 var5 = null;
        for (class105 var6 = (class105) var3.method182((byte) 50); var6 != null; var6 = (class105) var3.method181((byte) 107)) {
            class94 var11 = class41.method306(-77, var6.field2530);
            int var12 = var11.field2273;
            if (var11.field2272 == 1) {
                var12 = (var6.field2518 + 1) * var12;
            }
            if (var12 > var4) {
                var5 = var6;
                var4 = var12;
            }
        }
        if (var5 == null) {
            class100.field2418.method1039(class136.field3301, arg2, arg0);
            return;
        }
        class105 var7 = null;
        var3.method195(var5, 26364);
        int var8 = arg2 + (arg0 << 7) + 1610612736;
        class105 var9 = (class105) var3.method182((byte) 50);
        class105 var10 = null;
        while (var9 != null) {
            if (var5.field2530 != var9.field2530) {
                if (var7 == null) {
                    var7 = var9;
                }
                if (var7.field2530 != var9.field2530 && var10 == null) {
                    var10 = var9;
                }
            }
            var9 = (class105) var3.method181((byte) 39);
        }
        class100.field2418.method1022(class136.field3301, arg2, arg0, class20.method148(arg2 * 128 + 64, arg0 * 128 + 64, class136.field3301, -2), var5, var8, var7, var10);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BII)V")
    private final void method1132(byte arg0, int arg1, int arg2) {
        field3452++;
        if (arg0 != 65) {
            this.field3461 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(II)V")
    private final void method1133(int arg0, int arg1) {
        if ((this.field3426[arg1] & 0x2) != 0) {
            for (class20 var3 = (class20) this.field3481.field3696.method182((byte) 50); var3 != null; var3 = (class20) this.field3481.field3696.method181((byte) 84)) {
                if (var3.field483 == arg1 && this.field3443[arg1][var3.field467] == null && var3.field457 < 0) {
                    var3.field457 = 0;
                }
            }
        }
        int var4 = 67 % ((arg0 - 42) / 49);
        field3411++;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(B)V")
    public static void method1134(byte arg0) {
        field3441 = null;
        field3463 = null;
        field3433 = null;
        field3460 = null;
        field3421 = null;
        field3470 = null;
        field3466 = null;
        field3473 = null;
        field3409 = null;
        field3423 = null;
        if (arg0 != -36) {
            method1142(null, -50, -118);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Z)V")
    private final void method1135(boolean arg0) {
        if (arg0) {
            return;
        }
        field3427++;
        this.method1167(-1, 23587);
        this.method1160(125, -1);
        for (int var2 = 0; var2 < 16; var2++) {
            this.field3432[var2] = this.field3435[var2];
        }
        for (int var3 = 0; var3 < 16; var3++) {
            this.field3438[var3] = class4.method19(this.field3435[var3], -128);
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(Z)V")
    public static final void method1136(boolean arg0) {
        if (!arg0) {
            method1161((byte) 47);
        }
        field3439++;
        class103.field2493.method234(-22666);
        class41.field953.method234(-22666);
        class143.field3493.method234(-22666);
        class106.field2546.method234(-22666);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(I)V")
    public static final void method1137(int arg0) {
        if (class94.field2218[98]) {
            class104.field2508 += (12 - class104.field2508) / 2;
        } else if (class94.field2218[99]) {
            class104.field2508 += (-class104.field2508 - 12) / 2;
        } else {
            class104.field2508 /= 2;
        }
        class102.field2465 += class104.field2508 / 2;
        if (class102.field2465 < 128) {
            class102.field2465 = 128;
        }
        int var1 = class116.field2789.field172 + class46.field1099;
        int var2 = class116.field2789.field173 + class5.field127;
        if (class102.field2454 - var2 < -500 || class102.field2454 - var2 > 500 || client.field507 - var1 < -500 || client.field507 - var1 > 500) {
            client.field507 = var1;
            class102.field2454 = var2;
        }
        if (class102.field2465 > 383) {
            class102.field2465 = 383;
        }
        if (class102.field2454 != var2) {
            class102.field2454 += (var2 - class102.field2454) / 16;
        }
        field3446++;
        if (client.field507 != var1) {
            client.field507 += (var1 - client.field507) / 16;
        }
        int var3 = class102.field2454 >> 7;
        if (class94.field2218[96]) {
            class138.field3355 += (-class138.field3355 - 24) / 2;
        } else if (class94.field2218[97]) {
            class138.field3355 += (24 - class138.field3355) / 2;
        } else {
            class138.field3355 /= 2;
        }
        int var4 = client.field507 >> 7;
        class22.field550 = class22.field550 + class138.field3355 / 2 & 0x7FF;
        int var5 = class20.method148(class102.field2454, client.field507, class136.field3301, -2);
        int var6 = 0;
        if (var3 > 3 && var4 > 3 && var3 < 100 && var4 < 100) {
            for (int var7 = var3 - 4; var7 <= var3 + 4; var7++) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; var8++) {
                    int var9 = class136.field3301;
                    if (var9 < 3 && (client.field525[1][var7][var8] & 0x2) == 2) {
                        var9++;
                    }
                    int var10 = var5 - class68.field1682[var9][var7][var8];
                    if (var6 < var10) {
                        var6 = var10;
                    }
                }
            }
        }
        int var11 = var6 * 192;
        int var12 = 20 % ((-arg0 - 11) / 40);
        if (var11 > 98048) {
            var11 = 98048;
        }
        if (var11 < 32768) {
            var11 = 32768;
        }
        if (var11 > class113.field2728) {
            class113.field2728 += (var11 - class113.field2728) / 24;
        } else if (class113.field2728 > var11) {
            class113.field2728 += (var11 - class113.field2728) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)V")
    public final synchronized void method1138(int arg0, int arg1, int arg2) {
        this.method1152(arg0, arg2, (byte) 97);
        if (arg1 != 0) {
            this.field3447 = null;
        }
        field3406++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILce;)I")
    private final int method1139(int arg0, class20 arg1) {
        class133 var3 = arg1.field451;
        field3420++;
        int var4 = this.field3459[arg1.field483] * this.field3457[arg1.field483] + 4096 >> 13;
        int var5 = var4 * var4 + 16384 >> 15;
        int var6 = arg1.field475 * var5 + 16384 >> 15;
        int var7 = this.field3410 * var6 + 128 >> 8;
        int var8 = -110 / ((13 - arg0) / 62);
        if (var3.field3211 > 0) {
            var7 = (int) ((double) var7 * Math.pow(0.5D, (double) arg1.field486 * 1.953125E-5D * (double) var3.field3211) + 0.5D);
        }
        if (var3.field3204 != null) {
            int var9 = arg1.field485;
            int var10 = var3.field3204[arg1.field460 + 1];
            if (var3.field3204.length - 2 > arg1.field460) {
                int var11 = (var3.field3204[arg1.field460] & 0xFF) << 8;
                int var12 = (var3.field3204[arg1.field460 + 2] & 0xFF) << 8;
                var10 += (var9 - var11) * (var3.field3204[arg1.field460 + 3] - var10) / (var12 - var11);
            }
            var7 = var7 * var10 + 32 >> 6;
        }
        if (arg1.field457 > 0 && var3.field3206 != null) {
            int var13 = var3.field3206[arg1.field446 + 1];
            int var14 = arg1.field457;
            if (arg1.field446 < var3.field3206.length - 2) {
                int var15 = (var3.field3206[arg1.field446] & 0xFF) << 8;
                int var16 = (var3.field3206[arg1.field446 + 2] & 0xFF) << 8;
                var13 += (var3.field3206[arg1.field446 + 3] - var13) * (var14 - var15) / (var16 - var15);
            }
            var7 = var7 * var13 + 32 >> 6;
        }
        return var7;
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Z")
    public final synchronized boolean method1140(int arg0) {
        if (arg0 > -34) {
            this.field3426 = null;
        }
        field3437++;
        return this.field3404.method588();
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V")
    private final void method1141(int arg0) {
        int var2 = this.field3477;
        if (arg0 != 128) {
            return;
        }
        long var3 = this.field3480;
        int var5 = this.field3478;
        field3401++;
        while (this.field3478 == var5) {
            while (this.field3404.field1738[var2] == var5) {
                this.field3404.method584(var2);
                int var6 = this.field3404.method585(var2);
                if (var6 == 1) {
                    this.field3404.method594();
                    this.field3404.method587(var2);
                    if (this.field3404.method583()) {
                        if (!this.field3476 || var5 == 0) {
                            this.method1135(false);
                            this.field3404.method591();
                            return;
                        }
                        this.field3404.method595(var3);
                    }
                    break;
                }
                if ((var6 & 0x80) != 0) {
                    this.method1159(8192, var6);
                }
                this.field3404.method589(var2);
                this.field3404.method587(var2);
            }
            var2 = this.field3404.method593();
            var5 = this.field3404.field1738[var2];
            var3 = this.field3404.method596(var5);
        }
        this.field3478 = var5;
        this.field3477 = var2;
        this.field3480 = var3;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "()Lwc;")
    public final synchronized class150 method720() {
        field3436++;
        return null;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lve;II)I")
    public static final int method1142(class146 arg0, int arg1, int arg2) {
        field3424++;
        if (arg0.field3556 == null || arg0.field3556.length <= arg1) {
            return -2;
        }
        try {
            if (arg2 != -16647) {
                field3460 = null;
            }
            int[] var3 = arg0.field3556[arg1];
            int var4 = 0;
            int var5 = 0;
            byte var6 = 0;
            while (true) {
                int var7 = var3[var5++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class85.field2025[var3[var5++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 2) {
                    var8 = class120.field2895[var3[var5++]];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 3) {
                    var8 = class128.field3088[var3[var5++]];
                }
                if (var7 == 4) {
                    int var10 = var3[var5++] << 16;
                    int var11 = var10 + var3[var5++];
                    class146 var12 = class48.method360(-101, var11);
                    int var13 = var3[var5++];
                    if (var13 != -1 && (!class41.method306(-78, var13).field2234 || class1.field26)) {
                        for (int var14 = 0; var14 < var12.field3597.length; var14++) {
                            if (var13 + 1 == var12.field3597[var14]) {
                                var8 += var12.field3657[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class104.field2513[var3[var5++]];
                }
                if (var7 == 6) {
                    var8 = class99.field2398[class120.field2895[var3[var5++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class104.field2513[var3[var5++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class116.field2789.field3523;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class115.field2753[var15]) {
                            var8 += class120.field2895[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var5++] << 16;
                    int var17 = var16 + var3[var5++];
                    class146 var18 = class48.method360(-76, var17);
                    int var19 = var3[var5++];
                    if (var19 != -1 && (!class41.method306(-123, var19).field2234 || class1.field26)) {
                        for (int var20 = 0; var20 < var18.field3597.length; var20++) {
                            if (var19 + 1 == var18.field3597[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class26.field628;
                }
                if (var7 == 12) {
                    var8 = class78.field1855;
                }
                if (var7 == 13) {
                    int var21 = class104.field2513[var3[var5++]];
                    int var22 = var3[var5++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var5++];
                    var8 = class135.method1098(var23, -106);
                }
                if (var7 == 18) {
                    var8 = (class116.field2789.field173 >> 7) + class126.field3010;
                }
                if (var7 == 19) {
                    var8 = (class116.field2789.field172 >> 7) + class76.field1795;
                }
                if (var7 == 20) {
                    var8 = var3[var5++];
                }
                if (var9 == 0) {
                    if (var6 == 0) {
                        var4 += var8;
                    }
                    if (var6 == 1) {
                        var4 -= var8;
                    }
                    if (var6 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var6 == 3) {
                        var4 *= var8;
                    }
                    var6 = 0;
                } else {
                    var6 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(III)V")
    private final void method1143(int arg0, int arg1, int arg2) {
        if (this.field3432[arg1] != arg0) {
            this.field3432[arg1] = arg0;
            for (int var4 = 0; var4 < 128; var4++) {
                this.field3454[arg1][var4] = null;
            }
        }
        field3430++;
        if (arg2 < 50) {
            this.field3476 = true;
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(BII)V")
    private final void method1144(byte arg0, int arg1, int arg2) {
        if (arg0 > 103) {
            field3458++;
            this.field3422[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(II)V")
    private final void method1145(int arg0, int arg1) {
        if (arg0 != 0) {
            method1131(-127, 57, -66);
        }
        field3412++;
        for (class20 var3 = (class20) this.field3481.field3696.method182((byte) 50); var3 != null; var3 = (class20) this.field3481.field3696.method181((byte) 126)) {
            if ((arg1 < 0 || var3.field483 == arg1) && var3.field457 < 0) {
                this.field3443[var3.field483][var3.field467] = null;
                var3.field457 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLce;I)V")
    public final void method1146(boolean arg0, class20 arg1, int arg2) {
        if (arg2 < 18) {
            this.method1145(56, -127);
        }
        field3469++;
        int var4 = arg1.field462.field1745.length;
        int var6;
        if (arg0 && arg1.field462.field1743) {
            int var5 = var4 + var4 - arg1.field462.field1742;
            var6 = (int) ((long) this.field3461[arg1.field483] * (long) var5 >> 6);
            int var7 = var4 << 8;
            if (var7 <= var6) {
                var6 = var7 + var7 - var6 - 1;
                arg1.field448.method719(true);
            }
        } else {
            var6 = (int) ((long) this.field3461[arg1.field483] * (long) var4 >> 6);
        }
        arg1.field448.method737(var6);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)V")
    public final synchronized void method1147(byte arg0) {
        this.field3404.method591();
        this.method1135(false);
        field3429++;
        if (arg0 <= 80) {
            this.method1144((byte) 113, -60, 66);
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(III)V")
    private final void method1148(int arg0, int arg1, int arg2) {
        this.field3447[arg0] = arg2;
        this.field3431[arg0] = (int) (Math.pow(2.0D, (double) arg2 * 5.4931640625E-4D) * 2097152.0D + 0.5D);
        field3445++;
        if (arg1 != 28118) {
            this.field3474 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(II)V")
    private final void method1149(int arg0, int arg1) {
        field3444++;
        if ((this.field3426[arg1] & 0x4) != 0) {
            for (class20 var3 = (class20) this.field3481.field3696.method182((byte) 50); var3 != null; var3 = (class20) this.field3481.field3696.method181((byte) 74)) {
                if (var3.field483 == arg1) {
                    var3.field453 = 0;
                }
            }
        }
        if (arg0 != 4) {
            method1131(-126, 72, 102);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lce;Z)I")
    private final int method1150(class20 arg0, boolean arg1) {
        field3475++;
        class133 var3 = arg0.field451;
        int var4 = (arg0.field482 * arg0.field461 >> 12) + arg0.field472;
        int var5 = ((this.field3422[arg0.field483] - 8192) * this.field3417[arg0.field483] >> 12) + var4;
        if (var3.field3212 > 0 && (var3.field3200 > 0 || this.field3456[arg0.field483] > 0)) {
            int var6 = var3.field3200 << 2;
            int var7 = var3.field3214 << 1;
            if (arg0.field454 < var7) {
                var6 = arg0.field454 * var6 / var7;
            }
            int var8 = (this.field3456[arg0.field483] >> 7) + var6;
            double var9 = Math.sin((double) (arg0.field465 & 0x1FF) * 0.01227184630308513D);
            var5 += (int) ((double) var8 * var9);
        }
        int var11 = (int) ((double) (arg0.field462.field1741 * 256) * Math.pow(2.0D, (double) var5 * 3.255208333333333E-4D) / (double) class138.field3361 + 0.5D);
        if (arg1) {
            return 127;
        } else if (var11 < 1) {
            return 1;
        } else {
            return var11;
        }
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V")
    public final synchronized void method1151(int arg0) {
        field3453++;
        class82 var2 = (class82) this.field3419.method840(-1);
        if (arg0 != 31441) {
            this.field3461 = null;
        }
        while (var2 != null) {
            var2.method302(arg0 ^ 0x7536);
            var2 = (class82) this.field3419.method837((byte) -100);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)V")
    private final void method1152(int arg0, int arg1, byte arg2) {
        field3440++;
        if (arg2 != 97) {
            this.method720();
        }
        this.field3435[arg1] = arg0;
        this.field3438[arg1] = class4.method19(arg0, -128);
        this.method1143(arg0, arg1, 111);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIII)V")
    private final void method1153(int arg0, int arg1, int arg2, int arg3) {
        field3464++;
        this.method1156(arg2, (byte) -62, arg1, 64);
        if ((this.field3426[arg2] & 0x2) != 0) {
            for (class20 var5 = (class20) this.field3481.field3696.method191(arg3 ^ 0xFFFFDCE6); var5 != null; var5 = (class20) this.field3481.field3696.method192(16)) {
                if (var5.field483 == arg2 && var5.field457 < 0) {
                    this.field3443[arg2][var5.field467] = null;
                    this.field3443[arg2][arg1] = var5;
                    int var6 = var5.field472 + (var5.field482 * var5.field461 >> 12);
                    var5.field472 += arg1 - var5.field467 << 8;
                    var5.field461 = 4096;
                    var5.field467 = arg1;
                    var5.field482 = var6 - var5.field472;
                    return;
                }
            }
        }
        class82 var7 = (class82) this.field3419.method842((long) this.field3432[arg2], arg3 + 124);
        if (var7 == null) {
            return;
        }
        class74 var8 = var7.field1941[arg1];
        if (var8 == null) {
            return;
        }
        class20 var9 = new class20();
        var9.field484 = var7;
        var9.field462 = var8;
        var9.field483 = arg2;
        var9.field451 = var7.field1950[arg1];
        var9.field449 = var7.field1934[arg1];
        var9.field467 = arg1;
        var9.field475 = var7.field1937[arg1] * var7.field1939 * arg0 * arg0 + 1024 >> 11;
        var9.field455 = var7.field1940[arg1] & 0xFF;
        var9.field472 = (arg1 << 8) - (var7.field1922[arg1] & 0x7FFF);
        var9.field460 = 0;
        var9.field446 = 0;
        var9.field457 = -1;
        var9.field486 = arg3;
        var9.field485 = 0;
        if (this.field3461[arg2] == 0) {
            var9.field448 = class92.method736(var8, this.method1150(var9, false), this.method1139(-85, var9), this.method1165(20, var9));
        } else {
            var9.field448 = class92.method736(var8, this.method1150(var9, false), 0, this.method1165(arg3 + 13, var9));
            this.method1146(var7.field1922[arg1] < 0, var9, 127);
        }
        if (var7.field1922[arg1] < 0) {
            var9.field448.method723(-1);
        }
        if (var9.field449 >= 0) {
            class20 var10 = this.field3454[arg2][var9.field449];
            if (var10 != null && var10.field457 < 0) {
                this.field3443[arg2][var10.field467] = null;
                var10.field457 = 0;
            }
            this.field3454[arg2][var9.field449] = var9;
        }
        this.field3481.field3696.method185(var9, -27557);
        this.field3443[arg2][arg1] = var9;
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(IIII)V")
    private final void method1154(int arg0, int arg1, int arg2, int arg3) {
        field3471++;
        if (arg2 != -29344) {
            method1142(null, -1, -97);
        }
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)I")
    public final int method1155(int arg0) {
        if (arg0 == -16138) {
            field3414++;
            return this.field3410;
        } else {
            return 105;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBII)V")
    private final void method1156(int arg0, byte arg1, int arg2, int arg3) {
        field3451++;
        class20 var5 = this.field3443[arg0][arg2];
        if (var5 == null) {
            return;
        }
        this.field3443[arg0][arg2] = null;
        if (arg1 != -62) {
            return;
        }
        if ((this.field3426[arg0] & 0x2) == 0) {
            var5.field457 = 0;
            return;
        }
        for (class20 var6 = (class20) this.field3481.field3696.method182((byte) 50); var6 != null; var6 = (class20) this.field3481.field3696.method181((byte) 120)) {
            if (var5.field483 == var6.field483 && var6.field457 < 0 && var5 != var6) {
                var5.field457 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "()Lwc;")
    public final synchronized class150 method732() {
        field3467++;
        return this.field3481;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "([III)V")
    public final synchronized void method709(int[] arg0, int arg1, int arg2) {
        field3408++;
        if (this.field3404.method588()) {
            int var4 = this.field3404.field1740 * 1000000 / class138.field3361;
            do {
                long var5 = (long) arg2 * (long) var4 + this.field3479;
                if (this.field3480 - var5 >= 0L) {
                    this.field3479 = var5;
                    break;
                }
                int var7 = (int) ((this.field3480 + (long) var4 - this.field3479 - 1L) / (long) var4);
                this.field3479 += (long) var4 * (long) var7;
                this.field3481.method709(arg0, arg1, var7);
                arg1 += var7;
                arg2 -= var7;
                this.method1141(128);
            } while (this.field3404.method588());
        }
        this.field3481.method709(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(II)V")
    public final synchronized void method1157(int arg0, int arg1) {
        this.field3410 = arg1;
        if (arg0 != 1) {
            this.field3419 = null;
        }
        field3462++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lid;ILg;Lrd;I)Z")
    public final synchronized boolean method1158(class60 arg0, int arg1, class43 arg2, class121 arg3, int arg4) {
        arg3.method959();
        boolean var6 = true;
        int var7 = -72 / ((arg1 + 43) / 35);
        field3405++;
        int[] var8 = null;
        if (arg4 > 0) {
            var8 = new int[] { arg4 };
        }
        for (class15 var9 = (class15) arg3.field2915.method840(-1); var9 != null; var9 = (class15) arg3.field2915.method837((byte) -118)) {
            int var10 = (int) var9.field951;
            class82 var11 = (class82) this.field3419.method842((long) var10, 124);
            if (var11 == null) {
                var11 = class82.method633(arg2, var10, false);
                if (var11 == null) {
                    var6 = false;
                    continue;
                }
                this.field3419.method836((long) var10, (byte) 55, var11);
            }
            if (!var11.method637(var8, arg0, 118, var9.field354)) {
                var6 = false;
            }
        }
        if (var6) {
            arg3.method960();
        }
        return var6;
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(II)V")
    private final void method1159(int arg0, int arg1) {
        field3428++;
        int var3 = arg1 & 0xF0;
        if (var3 == 128) {
            int var4 = arg1 & 0xF;
            int var5 = arg1 >> 8 & 0x7F;
            int var6 = arg1 >> 16 & 0x7F;
            this.method1156(var4, (byte) -62, var5, var6);
        } else if (var3 == 144) {
            int var7 = arg1 >> 8 & 0x7F;
            int var8 = arg1 & 0xF;
            int var9 = arg1 >> 16 & 0x7F;
            if (var9 <= 0) {
                this.method1156(var8, (byte) -62, var7, 64);
            } else {
                this.method1153(var9, var7, var8, 0);
            }
        } else if (var3 == 160) {
            int var10 = arg1 & 0xF;
            int var11 = arg1 >> 8 & 0x7F;
            int var12 = arg1 >> 16 & 0x7F;
            this.method1154(var10, var12, -29344, var11);
        } else if (var3 == 176) {
            int var13 = arg1 & 0xF;
            int var14 = arg1 >> 8 & 0x7F;
            int var15 = arg1 >> 16 & 0x7F;
            if (var14 == 0) {
                this.field3438[var13] = class4.method19(-2080769, this.field3438[var13]) + (var15 << 14);
            }
            if (var14 == 32) {
                this.field3438[var13] = (var15 << 7) + class4.method19(this.field3438[var13], -16257);
            }
            if (var14 == 1) {
                this.field3456[var13] = (var15 << 7) + class4.method19(-16257, this.field3456[var13]);
            }
            if (var14 == 33) {
                this.field3456[var13] = var15 + class4.method19(this.field3456[var13], -128);
            }
            if (var14 == 5) {
                this.field3474[var13] = class4.method19(-16257, this.field3474[var13]) + (var15 << 7);
            }
            if (var14 == 37) {
                this.field3474[var13] = var15 + class4.method19(-128, this.field3474[var13]);
            }
            if (var14 == 7) {
                this.field3459[var13] = class4.method19(-16257, this.field3459[var13]) + (var15 << 7);
            }
            if (var14 == 39) {
                this.field3459[var13] = class4.method19(-128, this.field3459[var13]) + var15;
            }
            if (var14 == 10) {
                this.field3448[var13] = class4.method19(this.field3448[var13], -16257) + (var15 << 7);
            }
            if (var14 == 42) {
                this.field3448[var13] = var15 + class4.method19(-128, this.field3448[var13]);
            }
            if (var14 == 11) {
                this.field3457[var13] = class4.method19(-16257, this.field3457[var13]) + (var15 << 7);
            }
            if (var14 == 43) {
                this.field3457[var13] = class4.method19(-128, this.field3457[var13]) + var15;
            }
            if (var14 == 64) {
                if (var15 < 64) {
                    this.field3426[var13] = class4.method19(this.field3426[var13], -2);
                } else {
                    this.field3426[var13] = class44.method346(this.field3426[var13], 1);
                }
            }
            if (var14 == 65) {
                if (var15 < 64) {
                    this.method1133(arg0 - 8317, var13);
                    this.field3426[var13] = class4.method19(this.field3426[var13], -3);
                } else {
                    this.field3426[var13] = class44.method346(this.field3426[var13], 2);
                }
            }
            if (var14 == 99) {
                this.field3407[var13] = class4.method19(this.field3407[var13], 127) + (var15 << 7);
            }
            if (var14 == 98) {
                this.field3407[var13] = class4.method19(this.field3407[var13], 16256) + var15;
            }
            if (var14 == 101) {
                this.field3407[var13] = (var15 << 7) + class4.method19(this.field3407[var13], 127) + 16384;
            }
            if (var14 == 100) {
                this.field3407[var13] = class4.method19(this.field3407[var13], 16256) + var15 + 16384;
            }
            if (var14 == 120) {
                this.method1167(var13, 23587);
            }
            if (var14 == 121) {
                this.method1160(arg0 - 8077, var13);
            }
            if (var14 == 123) {
                this.method1145(0, var13);
            }
            if (var14 == 6) {
                int var16 = this.field3407[var13];
                if (var16 == 16384) {
                    this.field3417[var13] = class4.method19(this.field3417[var13], -16257) + (var15 << 7);
                }
            }
            if (var14 == 38) {
                int var17 = this.field3407[var13];
                if (var17 == 16384) {
                    this.field3417[var13] = class4.method19(this.field3417[var13], -128) + var15;
                }
            }
            if (var14 == 16) {
                this.field3461[var13] = class4.method19(this.field3461[var13], -16257) + (var15 << 7);
            }
            if (var14 == 48) {
                this.field3461[var13] = class4.method19(-128, this.field3461[var13]) + var15;
            }
            if (var14 == 81) {
                if (var15 < 64) {
                    this.method1149(4, var13);
                    this.field3426[var13] = class4.method19(this.field3426[var13], -5);
                } else {
                    this.field3426[var13] = class44.method346(this.field3426[var13], 4);
                }
            }
            if (var14 == 17) {
                this.method1148(var13, 28118, (var15 << 7) + (this.field3447[var13] & 0xFFFFC07F));
            }
            if (var14 == 49) {
                this.method1148(var13, 28118, (this.field3447[var13] & 0xFFFFFF80) + var15);
            }
        } else if (arg0 == 8192) {
            if (var3 == 192) {
                int var18 = arg1 & 0xF;
                int var19 = arg1 >> 8 & 0x7F;
                this.method1143(this.field3438[var18] + var19, var18, 116);
            } else if (var3 == 208) {
                int var20 = arg1 & 0xF;
                int var21 = arg1 >> 8 & 0x7F;
                this.method1132((byte) 65, var20, var21);
            } else if (var3 == 224) {
                int var22 = arg1 & 0xF;
                int var23 = (arg1 >> 8 & 0x7F) + (arg1 >> 9 & 0x3F80);
                this.method1144((byte) 119, var23, var22);
            } else {
                int var24 = arg1 & 0xFF;
                if (var24 == 255) {
                    this.method1135(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "()I")
    public final synchronized int method721() {
        field3465++;
        return 0;
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(II)V")
    private final void method1160(int arg0, int arg1) {
        field3442++;
        if (arg1 < 0) {
            for (int var3 = 0; var3 < 16; var3++) {
                this.method1160(126, var3);
            }
            return;
        }
        this.field3459[arg1] = 12800;
        this.field3448[arg1] = 8192;
        this.field3457[arg1] = 16383;
        if (arg0 <= 113) {
            field3460 = null;
        }
        this.field3422[arg1] = 8192;
        this.field3456[arg1] = 0;
        this.field3474[arg1] = 8192;
        this.method1133(-15, arg1);
        this.method1149(4, arg1);
        this.field3426[arg1] = 0;
        this.field3407[arg1] = 32767;
        this.field3417[arg1] = 256;
        this.field3461[arg1] = 0;
        this.method1148(arg1, 28118, 8192);
    }

    @OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
    public static final void method1161(byte arg0) {
        field3402++;
        try {
            if (class2.field65 == 0) {
                if (class104.field2501 != null) {
                    class104.field2501.method874((byte) -103);
                    class104.field2501 = null;
                }
                class26.field636 = null;
                class49.field1172 = false;
                class2.field65 = 1;
                class10.field242 = 0;
            }
            if (class2.field65 == 1) {
                if (class26.field636 == null) {
                    class26.field636 = class41.field965.method219(-19431, class62.field1556, class104.field2515);
                }
                if (class26.field636.field1592 == 2) {
                    throw new IOException();
                }
                if (class26.field636.field1592 == 1) {
                    class104.field2501 = new class108((Socket) class26.field636.field1596, class41.field965);
                    class26.field636 = null;
                    class2.field65 = 2;
                }
            }
            if (class2.field65 == 2) {
                long var1 = class100.field2421 = class57.field1389.method1064(-22243);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class152.field3751.field1485 = 0;
                class152.field3751.method452(14, 255);
                class152.field3751.method452(var3, 255);
                class104.field2501.method870(2, 0, 0, class152.field3751.field1495);
                class2.field65 = 3;
                class23.field581.field1485 = 0;
            }
            if (class2.field65 == 3) {
                if (class95.field2288 != null) {
                    class95.field2288.method600(-9064);
                }
                if (class115.field2761 != null) {
                    class115.field2761.method600(-9064);
                }
                int var4 = class104.field2501.method875((byte) -78);
                if (class95.field2288 != null) {
                    class95.field2288.method600(-9064);
                }
                if (class115.field2761 != null) {
                    class115.field2761.method600(-9064);
                }
                if (var4 != 0) {
                    class2.method10(var4, 18847);
                    return;
                }
                class23.field581.field1485 = 0;
                class2.field65 = 4;
            }
            if (class2.field65 == 4) {
                if (class23.field581.field1485 < 8) {
                    int var5 = class104.field2501.method877(126);
                    if (8 - class23.field581.field1485 < var5) {
                        var5 = 8 - class23.field581.field1485;
                    }
                    if (var5 > 0) {
                        class104.field2501.method872((byte) -82, class23.field581.field1495, var5, class23.field581.field1485);
                        class23.field581.field1485 += var5;
                    }
                }
                if (class23.field581.field1485 == 8) {
                    class23.field581.field1485 = 0;
                    class86.field2053 = class23.field581.method444(0);
                    class2.field65 = 5;
                }
            }
            if (arg0 < 38) {
                method1134((byte) -17);
            }
            if (class2.field65 == 5) {
                class152.field3751.field1485 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class86.field2053 >> 32), (int) class86.field2053 };
                class152.field3751.method452(10, 255);
                class152.field3751.method463(50, var6[0]);
                class152.field3751.method463(96, var6[1]);
                class152.field3751.method463(19, var6[2]);
                class152.field3751.method463(100, var6[3]);
                class152.field3751.method463(102, class41.field965.field657);
                class152.field3751.method461(11739, class57.field1389.method1064(-22243));
                class152.field3751.method460(class57.field1401, 105);
                class152.field3751.method457(class17.field377, class151.field3718, 0);
                class49.field1153.field1485 = 0;
                if (class83.field1963 == 40) {
                    class49.field1153.method452(18, 255);
                } else {
                    class49.field1153.method452(16, 255);
                }
                class49.field1153.method452(class152.field3751.field1485 + 69, 255);
                class49.field1153.method463(68, 456);
                class49.field1153.method452(class100.field2422 ? 1 : 0, 255);
                class49.field1153.method463(93, class37.field847.field1054);
                class49.field1153.method463(100, class28.field681.field1054);
                class49.field1153.method463(126, class80.field1906.field1054);
                class49.field1153.method463(78, class109.field2647.field1054);
                class49.field1153.method463(75, class98.field2374.field1054);
                class49.field1153.method463(26, field3473.field1054);
                class49.field1153.method463(27, class41.field956.field1054);
                class49.field1153.method463(109, class15.field352.field1054);
                class49.field1153.method463(48, class58.field1435.field1054);
                class49.field1153.method463(53, class122.field2917.field1054);
                class49.field1153.method463(110, class65.field1601.field1054);
                class49.field1153.method463(23, class68.field1670.field1054);
                class49.field1153.method463(96, class62.field1557.field1054);
                class49.field1153.method463(111, class3.field79.field1054);
                class49.field1153.method463(75, class129.field3099.field1054);
                class49.field1153.method463(87, class148.field3679.field1054);
                class49.field1153.method481(0, false, class152.field3751.field1495, class152.field3751.field1485);
                class104.field2501.method870(class49.field1153.field1485, 0, 0, class49.field1153.field1495);
                class152.field3751.method937(var6, -128);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class23.field581.method937(var6, -29);
                class2.field65 = 6;
            }
            if (class2.field65 == 6 && class104.field2501.method877(123) > 0) {
                int var8 = class104.field2501.method875((byte) -122);
                if (var8 == 21 && class83.field1963 == 20) {
                    class2.field65 = 7;
                } else if (var8 == 2) {
                    class2.field65 = 9;
                } else if (var8 == 15 && class83.field1963 == 40) {
                    class107.method864(true);
                    return;
                } else if (var8 == 23 && class75.field1756 < 1) {
                    class75.field1756++;
                    class2.field65 = 0;
                } else {
                    class2.method10(var8, 18847);
                    return;
                }
            }
            if (class2.field65 == 7 && class104.field2501.method877(123) > 0) {
                class68.field1681 = class104.field2501.method875((byte) -99) * 60 + 180;
                class2.field65 = 8;
            }
            if (class2.field65 == 8) {
                class10.field242 = 0;
                class60.method502((byte) 116, class94.field2236, class107.method867(2, new class135[] { class68.method547(-1, class68.field1681 / 60), class109.field2645 }), class15.field355);
                if (--class68.field1681 <= 0) {
                    class2.field65 = 0;
                }
            } else {
                if (class2.field65 == 9 && class104.field2501.method877(127) >= 8) {
                    class5.field128 = class104.field2501.method875((byte) -56);
                    field3472 = class104.field2501.method875((byte) -114) == 1;
                    class46.field1101 = class104.field2501.method875((byte) -120);
                    class46.field1101 <<= 0x8;
                    class46.field1101 += class104.field2501.method875((byte) -91);
                    class34.field799 = class104.field2501.method875((byte) -99);
                    class104.field2501.method872((byte) -68, class23.field581.field1495, 1, 0);
                    class23.field581.field1485 = 0;
                    class41.field959 = class23.field581.method932(1);
                    class104.field2501.method872((byte) 55, class23.field581.field1495, 2, 0);
                    class23.field581.field1485 = 0;
                    class21.field499 = class23.field581.method483((byte) 24);
                    class2.field65 = 10;
                }
                if (class2.field65 != 10) {
                    class10.field242++;
                    if (class10.field242 > 2000) {
                        if (class75.field1756 < 1) {
                            class75.field1756++;
                            if (class62.field1556 == class128.field3086) {
                                class62.field1556 = class10.field238;
                            } else {
                                class62.field1556 = class128.field3086;
                            }
                            class2.field65 = 0;
                        } else {
                            class2.method10(-3, 18847);
                        }
                    }
                } else if (class104.field2501.method877(124) >= class21.field499) {
                    class23.field581.field1485 = 0;
                    class104.field2501.method872((byte) 77, class23.field581.field1495, class21.field499, 0);
                    class119.method953(-4404);
                    class132.field3183 = -1;
                    class56.method431(8, false);
                    class41.field959 = -1;
                }
            }
        } catch (IOException var9) {
            if (class75.field1756 < 1) {
                class75.field1756++;
                class2.field65 = 0;
                if (class62.field1556 == class128.field3086) {
                    class62.field1556 = class10.field238;
                } else {
                    class62.field1556 = class128.field3086;
                }
            } else {
                class2.method10(-2, 18847);
            }
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIILce;[I)Z")
    public final boolean method1162(int arg0, int arg1, int arg2, class20 arg3, int[] arg4) {
        field3455++;
        arg3.field480 = class138.field3361 / 100;
        if (arg3.field457 >= 0 && (arg3.field448 == null || arg3.field448.method710())) {
            arg3.method150(3);
            arg3.method302(arg0 ^ 0xFFFFDD9A);
            if (arg3.field449 > 0 && this.field3454[arg3.field483][arg3.field449] == arg3) {
                this.field3454[arg3.field483][arg3.field449] = null;
            }
            return true;
        }
        int var6 = arg3.field461;
        boolean var7 = false;
        if (var6 > 0) {
            int var8 = var6 - (int) (Math.pow(2.0D, (double) this.field3474[arg3.field483] * 4.921259842519685E-4D) * 16.0D + 0.5D);
            if (var8 < 0) {
                var8 = 0;
            }
            arg3.field461 = var8;
        }
        arg3.field448.method714(this.method1150(arg3, false));
        arg3.field454++;
        if (arg0 != -11651) {
            field3472 = false;
        }
        double var9 = (double) ((arg3.field467 - 60 << 8) + (arg3.field482 * arg3.field461 >> 12)) * 5.086263020833333E-6D;
        class133 var11 = arg3.field451;
        arg3.field465 += var11.field3212;
        if (var11.field3211 > 0) {
            if (var11.field3201 <= 0) {
                arg3.field486 += 128;
            } else {
                arg3.field486 += (int) (Math.pow(2.0D, (double) var11.field3201 * var9) * 128.0D + 0.5D);
            }
        }
        if (var11.field3204 != null) {
            if (var11.field3208 <= 0) {
                arg3.field485 += 128;
            } else {
                arg3.field485 += (int) (Math.pow(2.0D, (double) var11.field3208 * var9) * 128.0D + 0.5D);
            }
            while (var11.field3204.length - 2 > arg3.field460 && arg3.field485 > (var11.field3204[arg3.field460 + 2] & 0xFF) << 8) {
                arg3.field460 += 2;
            }
            if (var11.field3204.length - 2 == arg3.field460 && var11.field3204[arg3.field460 + 1] == 0) {
                var7 = true;
            }
        }
        if (arg3.field457 >= 0 && var11.field3206 != null && (this.field3426[arg3.field483] & 0x1) == 0 && (arg3.field449 < 0 || this.field3454[arg3.field483][arg3.field449] != arg3)) {
            if (var11.field3216 > 0) {
                arg3.field457 += (int) (Math.pow(2.0D, (double) var11.field3216 * var9) * 128.0D + 0.5D);
            } else {
                arg3.field457 += 128;
            }
            while (var11.field3206.length - 2 > arg3.field446 && (var11.field3206[arg3.field446 + 2] & 0xFF) << 8 < arg3.field457) {
                arg3.field446 += 2;
            }
            if (var11.field3206.length - 2 == arg3.field446) {
                var7 = true;
            }
        }
        if (!var7) {
            arg3.field448.method753(arg3.field480, this.method1139(84, arg3), this.method1165(88, arg3));
            return false;
        }
        arg3.field448.method735(arg3.field480);
        if (arg4 == null) {
            arg3.field448.method748(arg1);
        } else {
            arg3.field448.method709(arg4, arg2, arg1);
        }
        if (arg3.field448.method734()) {
            this.field3481.field3708.method1179(arg3.field448);
        }
        arg3.method150(arg0 ^ 0xFFFFD27E);
        if (arg3.field457 >= 0) {
            arg3.method302(4071);
            if (arg3.field449 > 0 && this.field3454[arg3.field483][arg3.field449] == arg3) {
                this.field3454[arg3.field483][arg3.field449] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLce;)Z")
    public final boolean method1163(byte arg0, class20 arg1) {
        field3416++;
        if (arg1.field448 != null) {
            if (arg0 <= 48) {
                this.method709(null, 61, -13);
            }
            return false;
        }
        if (arg1.field457 >= 0) {
            arg1.method302(4071);
            if (arg1.field449 > 0 && this.field3454[arg1.field483][arg1.field449] == arg1) {
                this.field3454[arg1.field483][arg1.field449] = null;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLrd;B)V")
    public final synchronized void method1164(boolean arg0, class121 arg1, byte arg2) {
        this.method1147((byte) 92);
        field3400++;
        this.field3404.method586(arg1.field2916);
        this.field3479 = 0L;
        this.field3476 = arg0;
        int var4 = this.field3404.method590();
        for (int var5 = 0; var5 < var4; var5++) {
            this.field3404.method584(var5);
            this.field3404.method589(var5);
            this.field3404.method587(var5);
        }
        this.field3477 = this.field3404.method593();
        if (arg2 <= 79) {
            this.field3454 = null;
        }
        this.field3478 = this.field3404.field1738[this.field3477];
        this.field3480 = this.field3404.method596(this.field3478);
    }

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(I)V")
    public final synchronized void method748(int arg0) {
        field3449++;
        if (this.field3404.method588()) {
            int var2 = this.field3404.field1740 * 1000000 / class138.field3361;
            do {
                long var3 = this.field3479 + (long) arg0 * (long) var2;
                if (this.field3480 - var3 >= 0L) {
                    this.field3479 = var3;
                    break;
                }
                int var5 = (int) ((this.field3480 + (long) var2 - this.field3479 - 1L) / (long) var2);
                this.field3479 += (long) var2 * (long) var5;
                arg0 -= var5;
                this.field3481.method748(var5);
                this.method1141(128);
            } while (this.field3404.method588());
        }
        this.field3481.method748(arg0);
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(ILce;)I")
    private final int method1165(int arg0, class20 arg1) {
        if (arg0 < 5) {
            return -111;
        } else {
            int var3 = this.field3448[arg1.field483];
            field3415++;
            return var3 < 8192 ? arg1.field455 * var3 + 32 >> 6 : 16384 - ((128 - arg1.field455) * (-var3 + 16384) + 32 >> 6);
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(B)V")
    public final synchronized void method1166(byte arg0) {
        field3425++;
        if (arg0 < 72) {
            this.method1148(34, -92, -88);
        }
        for (class82 var2 = (class82) this.field3419.method840(-1); var2 != null; var2 = (class82) this.field3419.method837((byte) -68)) {
            var2.method634(122);
        }
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(II)V")
    private final void method1167(int arg0, int arg1) {
        if (arg1 != 23587) {
            return;
        }
        for (class20 var3 = (class20) this.field3481.field3696.method182((byte) 50); var3 != null; var3 = (class20) this.field3481.field3696.method181((byte) 17)) {
            if (arg0 < 0 || var3.field483 == arg0) {
                if (var3.field448 != null) {
                    var3.field448.method735(class138.field3361 / 100);
                    if (var3.field448.method734()) {
                        this.field3481.field3708.method1179(var3.field448);
                    }
                    var3.method150(3);
                }
                if (var3.field457 < 0) {
                    this.field3443[var3.field483][var3.field467] = null;
                }
                var3.method302(4071);
            }
        }
        field3468++;
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
    public class141() {
        this.method1135(false);
    }
}
