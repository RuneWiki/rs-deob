import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class31 {

    @OriginalMember(owner = "client!eb", name = "h", descriptor = "Lec;")
    public static class32 field595 = class73.method594("hitmarks", true);

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "J")
    public static volatile long field610 = 0L;

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "Lwc;")
    public static class156 field593 = new class156(4096);

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "[I")
    public static int[] field611 = new int[256];

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "Lec;")
    public static class32 field612 = class73.method594("RuneScape wird geladen )2 bitte warten)3)3)3", true);

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public static int field615;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "Lec;")
    public static class32 field617;

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "[I")
    public static int[] field614;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!eb", name = "i", descriptor = "I")
    public static int field596;

    @OriginalMember(owner = "client!eb", name = "k", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!eb", name = "l", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!eb", name = "m", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!eb", name = "o", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!eb", name = "p", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!eb", name = "q", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "I")
    public static int field607;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "I")
    public static int field609;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "J")
    private long field588;

    @OriginalMember(owner = "client!eb", name = "n", descriptor = "J")
    private long field601;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "Z")
    public boolean field606;

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "[I")
    private int[] field594;

    @OriginalMember(owner = "client!eb", name = "j", descriptor = "[I")
    private int[] field597;

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "[I")
    public static int[] field616;

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "[[I")
    public static int[][] field590;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ljd;I)V")
    public final void method222(class66 arg0, int arg1) {
        field599++;
        arg0.method515((byte) 54, this.field606 ? 1 : 0);
        int var3 = 0;
        if (arg1 >= -83) {
            this.field597 = null;
        }
        while (var3 < 7) {
            int var5 = this.field594[class102.field2402[var3]];
            if (var5 == 0) {
                arg0.method515((byte) 62, -1);
            } else {
                arg0.method515((byte) 99, var5 - 256);
            }
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            arg0.method515((byte) 59, this.field597[var4]);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(I)I")
    public static final int method223(int arg0) {
        field609++;
        if (arg0 != -513) {
            field614 = null;
        }
        return class139.field3211++;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZ)V")
    public final void method224(int arg0, boolean arg1) {
        field613++;
        if (this.field606 != arg1) {
            this.method232(this.field597, -1, null, arg1, (byte) -100);
            if (arg0 >= -104) {
                this.field597 = null;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V")
    public static void method225(int arg0) {
        field616 = null;
        field614 = null;
        field595 = null;
        field611 = null;
        if (arg0 == 0) {
            field617 = null;
            field593 = null;
            field590 = null;
            field612 = null;
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)V")
    public static final void method226(int arg0, int arg1, int arg2) {
        field591++;
        long var3 = (long) ((arg1 << 16) + arg2);
        int var5 = 36 / ((arg0 + 3) / 35);
        class110 var6 = (class110) class132.field3031.method1198(var3, (byte) -106);
        if (var6 != null) {
            class126.field2920.method1170((byte) 83, var6);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BILqd;)V")
    public static final void method227(byte arg0, int arg1, class115 arg2) {
        int var3 = 116 % ((12 - arg0) / 49);
        if (arg2.field2732 > class140.field3219) {
            class89.method678(1, arg2);
        } else if (arg2.field2726 >= class140.field3219) {
            class15.method101(arg2, (byte) 49);
        } else {
            class145.method1089(arg2, 0);
        }
        if (arg2.field2749 < 128 || arg2.field2700 < 128 || arg2.field2749 >= 13184 || arg2.field2700 >= 13184) {
            arg2.field2749 = arg2.field2761[0] * 128 + arg2.field2713 * 64;
            arg2.field2700 = arg2.field2738[0] * 128 + arg2.field2713 * 64;
            arg2.field2714 = -1;
            arg2.field2726 = 0;
            arg2.field2733 = -1;
            arg2.field2732 = 0;
            arg2.method907(0);
        }
        if (class20.field373 == arg2 && (arg2.field2749 < 1536 || arg2.field2700 < 1536 || arg2.field2749 >= 11776 || arg2.field2700 >= 11776)) {
            arg2.field2726 = 0;
            arg2.field2749 = arg2.field2761[0] * 128 + arg2.field2713 * 64;
            arg2.field2733 = -1;
            arg2.field2732 = 0;
            arg2.field2700 = arg2.field2738[0] * 128 + arg2.field2713 * 64;
            arg2.field2714 = -1;
            arg2.method907(0);
        }
        field592++;
        class57.method445(false, arg2);
        class144.method1084((byte) 120, arg2);
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V")
    private final void method228(int arg0) {
        field603++;
        if (arg0 > -96) {
            field595 = null;
        }
        long var2 = this.field588;
        this.field588 = 0L;
        int var4 = this.field594[5];
        int var5 = this.field594[9];
        this.field594[9] = var4;
        this.field594[5] = var5;
        for (int var6 = 0; var6 < 12; var6++) {
            this.field588 <<= 0x4;
            if (this.field594[var6] >= 256) {
                this.field588 += this.field594[var6] - 256;
            }
        }
        if (this.field594[0] >= 256) {
            this.field588 += this.field594[0] - 256 >> 4;
        }
        if (this.field594[1] >= 256) {
            this.field588 += this.field594[1] - 256 >> 8;
        }
        for (int var7 = 0; var7 < 5; var7++) {
            this.field588 <<= 0x3;
            this.field588 += this.field597[var7];
        }
        this.field588 <<= 0x1;
        this.field588 += this.field606 ? 1 : 0;
        this.field594[9] = var5;
        this.field594[5] = var4;
        if (var2 != 0L && this.field588 != var2) {
            class38.field926.method487(var2, false);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BIZ)V")
    public final void method229(byte arg0, int arg1, boolean arg2) {
        field605++;
        if (arg1 == 1 && this.field606) {
            return;
        }
        int var4 = this.field594[class102.field2402[arg1]];
        if (var4 == 0) {
            return;
        }
        var4 -= 256;
        if (arg0 > -52) {
            return;
        }
        class65 var5;
        do {
            if (arg2) {
                var4++;
                if (class91.field2083 <= var4) {
                    var4 = 0;
                }
            } else {
                var4--;
                if (var4 < 0) {
                    var4 = class91.field2083 - 1;
                }
            }
            var5 = class134.method1022((byte) 98, var4);
        } while (var5 == null || var5.field1505 || (this.field606 ? 7 : 0) + arg1 != var5.field1516);
        this.field594[class102.field2402[arg1]] = var4 + 256;
        this.method228(-97);
    }

    @OriginalMember(owner = "client!eb", name = "d", descriptor = "(I)Lp;")
    public final class104 method230(int arg0) {
        field607++;
        if (this.field600 != -1) {
            return class17.method130(-101, this.field600).method754(-80);
        }
        if (arg0 != 23341) {
            this.method232(null, 78, null, true, (byte) 58);
        }
        boolean var2 = false;
        for (int var3 = 0; var3 < 12; var3++) {
            int var12 = this.field594[var3];
            if (var12 >= 256 && var12 < 512 && !class134.method1022((byte) 98, var12 - 256).method499((byte) 107)) {
                var2 = true;
            }
            if (var12 >= 512 && !class146.method1094(var12 - 512, 108).method468((byte) -114, this.field606)) {
                var2 = true;
            }
        }
        if (var2) {
            return null;
        }
        class104[] var4 = new class104[12];
        int var5 = 0;
        for (int var6 = 0; var6 < 12; var6++) {
            int var9 = this.field594[var6];
            if (var9 >= 256 && var9 < 512) {
                class104 var10 = class134.method1022((byte) 98, var9 - 256).method503(arg0 ^ 0x5B2D);
                if (var10 != null) {
                    var4[var5++] = var10;
                }
            }
            if (var9 >= 512) {
                class104 var11 = class146.method1094(var9 - 512, 45).method474(arg0 - 23279, this.field606);
                if (var11 != null) {
                    var4[var5++] = var11;
                }
            }
        }
        class104 var7 = new class104(var4, var5);
        for (int var8 = 0; var8 < 5; var8++) {
            if (class140.field3220[var8].length > this.field597[var8]) {
                var7.method835(class8.field141[var8], class140.field3220[var8][this.field597[var8]]);
            }
            if (class106.field2507[var8].length > this.field597[var8]) {
                var7.method835(class41.field951[var8], class106.field2507[var8][this.field597[var8]]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IZI)V")
    public final void method231(int arg0, boolean arg1, int arg2) {
        field596++;
        if (arg0 != -1) {
            this.field594 = null;
        }
        int var4 = this.field597[arg2];
        if (arg1) {
            var4++;
            if (var4 >= class140.field3220[arg2].length) {
                var4 = 0;
            }
        } else {
            var4--;
            if (var4 < 0) {
                var4 = class140.field3220[arg2].length - 1;
            }
        }
        this.field597[arg2] = var4;
        this.method228(-120);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "([II[IZB)V")
    public final void method232(int[] arg0, int arg1, int[] arg2, boolean arg3, byte arg4) {
        field602++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class91.field2083; var7++) {
                    class65 var8 = class134.method1022((byte) 98, var7);
                    if (var8 != null && !var8.field1505 && var6 + (arg3 ? 7 : 0) == var8.field1516) {
                        arg2[class102.field2402[var6]] = var7 + 256;
                        break;
                    }
                }
            }
        }
        int var9 = 1 % ((47 - arg4) / 63);
        this.field600 = arg1;
        this.field594 = arg2;
        this.field597 = arg0;
        this.field606 = arg3;
        this.method228(-116);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lvc;ILvc;II)Lod;")
    public final class101 method233(class149 arg0, int arg1, class149 arg2, int arg3, int arg4) {
        field608++;
        if (this.field600 != -1) {
            return class17.method130(-90, this.field600).method763(arg2, arg4, arg0, (byte) -38, arg1);
        }
        if (arg3 != -5774) {
            this.method231(20, false, -19);
        }
        long var6 = this.field588;
        int[] var8 = this.field594;
        if (arg0 != null && (arg0.field3392 >= 0 || arg0.field3368 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field594[var9];
            }
            if (arg0.field3392 >= 0) {
                var6 += arg0.field3392 - this.field594[5] << 8;
                var8[5] = arg0.field3392;
            }
            if (arg0.field3368 >= 0) {
                var6 += arg0.field3368 - this.field594[3] << 16;
                var8[3] = arg0.field3368;
            }
        }
        class101 var10 = (class101) class38.field926.method486(arg3 - 23051, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var21 = var8[var12];
                if (var21 >= 256 && var21 < 512 && !class134.method1022((byte) 98, var21 - 256).method496(125)) {
                    var11 = true;
                }
                if (var21 >= 512 && !class146.method1094(var21 - 512, 87).method480(this.field606, arg3 ^ 0x7B08)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field601 != -1L) {
                    var10 = (class101) class38.field926.method486(-28825, this.field601);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class104[] var13 = new class104[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var18 = var8[var15];
                    if (var18 >= 256 && var18 < 512) {
                        class104 var19 = class134.method1022((byte) 98, var18 - 256).method501((byte) -87);
                        if (var19 != null) {
                            var13[var14++] = var19;
                        }
                    }
                    if (var18 >= 512) {
                        class104 var20 = class146.method1094(var18 - 512, arg3 + 5836).method470(-19319, this.field606);
                        if (var20 != null) {
                            var13[var14++] = var20;
                        }
                    }
                }
                class104 var16 = new class104(var13, var14);
                for (int var17 = 0; var17 < 5; var17++) {
                    if (this.field597[var17] < class140.field3220[var17].length) {
                        var16.method835(class8.field141[var17], class140.field3220[var17][this.field597[var17]]);
                    }
                    if (this.field597[var17] < class106.field2507[var17].length) {
                        var16.method835(class41.field951[var17], class106.field2507[var17][this.field597[var17]]);
                    }
                }
                var10 = var16.method849(64, 850, -30, -50, -30);
                class38.field926.method485(var6, (byte) -122, var10);
                this.field601 = var6;
            }
        }
        if (arg0 == null && arg2 == null) {
            return var10;
        }
        class101 var22;
        if (arg0 != null && arg2 != null) {
            var22 = arg0.method1116(arg1, arg2, var10, arg3 ^ 0xFFFFE972, arg4);
        } else if (arg0 == null) {
            var22 = arg2.method1118(var10, arg1, 0);
        } else {
            var22 = arg0.method1118(var10, arg4, 0);
        }
        return var22;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)I")
    public final int method234(int arg0) {
        field589++;
        int var2 = 31 / ((arg0 + 38) / 33);
        return this.field600 == -1 ? (this.field594[0] << 15) + ((this.field597[0] << 25) + (this.field597[4] << 20) + (this.field594[8] << 10)) + (this.field594[11] << 5) + this.field594[1] : class17.method130(-106, this.field600).field2226 + 305419896;
    }

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
            field611[var0] = var1;
        }
        field615 = 0;
        field617 = class73.method594("Ladevorgang )2 bitte warten Sie)3", true);
        field614 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };
    }
}
