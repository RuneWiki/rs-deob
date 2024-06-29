import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class43 extends class13 {

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "[J")
    private long[] field651 = new long[10];

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    private int field652 = 0;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    private int field647 = 1;

    @OriginalMember(owner = "client!ji", name = "B", descriptor = "I")
    private int field657 = 256;

    @OriginalMember(owner = "client!ji", name = "x", descriptor = "J")
    private long field653 = class223.method1433((byte) 21);

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "[S")
    public static short[] field648 = new short[256];

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "Z")
    public static boolean field643 = false;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!ji", name = "y", descriptor = "I")
    private int field654;

    @OriginalMember(owner = "client!ji", name = "z", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!ji", name = "A", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Lhc;")
    public static class235 field650;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "()V")
    public static final void method286() {
        class67.field908 = 0;
        label191: for (int var0 = 0; var0 < class204.field2845; var0++) {
            class173 var1 = class265.field3978[var0];
            if (class57.field825 != null) {
                for (int var2 = 0; var2 < class57.field825.length; var2++) {
                    if (class57.field825[var2] != -1000000 && (var1.field2421 <= class57.field825[var2] || var1.field2413 <= class57.field825[var2]) && (var1.field2409 <= class77.field1085[var2] || var1.field2406 <= class77.field1085[var2]) && (var1.field2409 >= class194.field2686[var2] || var1.field2406 >= class194.field2686[var2]) && (var1.field2404 <= class279.field4325[var2] || var1.field2425 <= class279.field4325[var2]) && (var1.field2404 >= class71.field995[var2] || var1.field2425 >= class71.field995[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2417 == 1) {
                int var3 = var1.field2428 + class153.field2123 - class213.field3206;
                if (var3 >= 0 && var3 <= class153.field2123 + class153.field2123) {
                    int var4 = var1.field2403 + class153.field2123 - class266.field4044;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2429 + class153.field2123 - class266.field4044;
                    if (var5 > class153.field2123 + class153.field2123) {
                        var5 = class153.field2123 + class153.field2123;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class76.field1059[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class124.field1745 - var1.field2409;
                        if (var7 > 32) {
                            var1.field2426 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2426 = 2;
                            var7 = -var7;
                        }
                        var1.field2427 = (var1.field2404 - class65.field889 << 8) / var7;
                        var1.field2431 = (var1.field2425 - class65.field889 << 8) / var7;
                        var1.field2423 = (var1.field2421 - class21.field309 << 8) / var7;
                        var1.field2412 = (var1.field2413 - class21.field309 << 8) / var7;
                        class204.field2844[class67.field908++] = var1;
                    }
                }
            } else if (var1.field2417 == 2) {
                int var8 = var1.field2403 + class153.field2123 - class266.field4044;
                if (var8 >= 0 && var8 <= class153.field2123 + class153.field2123) {
                    int var9 = var1.field2428 + class153.field2123 - class213.field3206;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2424 + class153.field2123 - class213.field3206;
                    if (var10 > class153.field2123 + class153.field2123) {
                        var10 = class153.field2123 + class153.field2123;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class76.field1059[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class65.field889 - var1.field2404;
                        if (var12 > 32) {
                            var1.field2426 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2426 = 4;
                            var12 = -var12;
                        }
                        var1.field2422 = (var1.field2409 - class124.field1745 << 8) / var12;
                        var1.field2407 = (var1.field2406 - class124.field1745 << 8) / var12;
                        var1.field2423 = (var1.field2421 - class21.field309 << 8) / var12;
                        var1.field2412 = (var1.field2413 - class21.field309 << 8) / var12;
                        class204.field2844[class67.field908++] = var1;
                    }
                }
            } else if (var1.field2417 == 4) {
                int var13 = var1.field2421 - class21.field309;
                if (var13 > 128) {
                    int var14 = var1.field2403 + class153.field2123 - class266.field4044;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2429 + class153.field2123 - class266.field4044;
                    if (var15 > class153.field2123 + class153.field2123) {
                        var15 = class153.field2123 + class153.field2123;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2428 + class153.field2123 - class213.field3206;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2424 + class153.field2123 - class213.field3206;
                        if (var17 > class153.field2123 + class153.field2123) {
                            var17 = class153.field2123 + class153.field2123;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class76.field1059[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2426 = 5;
                            var1.field2422 = (var1.field2409 - class124.field1745 << 8) / var13;
                            var1.field2407 = (var1.field2406 - class124.field1745 << 8) / var13;
                            var1.field2427 = (var1.field2404 - class65.field889 << 8) / var13;
                            var1.field2431 = (var1.field2425 - class65.field889 << 8) / var13;
                            class204.field2844[class67.field908++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(B)V")
    public final void method80(byte arg0) {
        field645++;
        for (int var2 = 0; var2 < 10; var2++) {
            this.field651[var2] = 0L;
        }
        int var3 = 125 / ((-arg0 - 3) / 36);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZI)V")
    public static final void method287(boolean arg0, int arg1) {
        field655++;
        int var2 = class103.field1442;
        if (arg1 == 0) {
            var2 = 1;
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class88 var20;
            if (arg1 == 0) {
                var20 = class217.field3280;
            } else {
                var20 = class154.field2133[class205.field2848[var3]];
            }
            if (var20 != null && var20.method555(true)) {
                int var21 = var20.method561(-1);
                if (arg1 == 0 || arg1 == var21) {
                    if (var21 == 1) {
                        if ((var20.field4019 & 0x7F) == 64 && (var20.field4085 & 0x7F) == 64) {
                            int var22 = var20.field4019 >> 7;
                            int var23 = var20.field4085 >> 7;
                            if (var22 >= 0 && var22 < 104 && var23 >= 0 && var23 < 104) {
                                var10002 = class279.field4324[var22][var23]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field4019 & 0x7F) == 0 && (var20.field4085 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field4019 & 0x7F) == 64 && (var20.field4085 & 0x7F) == 64)) {
                        int var24 = var20.field4085 - (var21 * 64) >> 7;
                        int var25 = var20.field4019 - (var21 * 64) >> 7;
                        int var26 = var20.method561(-1) + var25;
                        int var27 = var20.method561(-1) + var24;
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        for (int var28 = var25; var28 < var26; var28++) {
                            for (int var29 = var24; var29 < var27; var29++) {
                                var10002 = class279.field4324[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            return;
        }
        label217: for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class88 var7;
            if (arg1 == 0) {
                var5 = 8791798054912L;
                var7 = class217.field3280;
            } else {
                var5 = (long) class205.field2848[var4] << 32;
                var7 = class154.field2133[class205.field2848[var4]];
            }
            if (var7 != null && var7.method555(arg0)) {
                int var8 = var7.method561(-1);
                if (arg1 == 0 || arg1 == var8) {
                    var7.field1198 = false;
                    var7.field4063 = true;
                    if ((class246.field3763 && class103.field1442 > 200 || class103.field1442 > 50) && arg1 != 0 && var7.field4050 == var7.method1741((byte) 43).field2106) {
                        var7.field1198 = true;
                    }
                    if (var8 == 1) {
                        if ((var7.field4019 & 0x7F) == 64 && (var7.field4085 & 0x7F) == 64) {
                            int var9 = var7.field4019 >> 7;
                            int var10 = var7.field4085 >> 7;
                            if (var9 < 0 || var9 >= 104 || var10 < 0 || var10 >= 104) {
                                continue;
                            }
                            if (class279.field4324[var9][var10] > 1) {
                                var10002 = class279.field4324[var9][var10]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var7.field4019 & 0x7F) == 0 && (var7.field4085 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var7.field4019 & 0x7F) == 64 && (var7.field4085 & 0x7F) == 0) {
                        int var11 = var7.field4019 - var8 * 64 >> 7;
                        int var12 = var7.field4085 - (var8 * 64) >> 7;
                        int var13 = var11 + var8;
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        int var14 = var8 + var12;
                        if (var14 > 104) {
                            var14 = 104;
                        }
                        if (var12 < 0) {
                            var12 = 0;
                        }
                        boolean var15 = true;
                        for (int var16 = var11; var16 < var13; var16++) {
                            for (int var19 = var12; var19 < var14; var19++) {
                                if (class279.field4324[var16][var19] <= 1) {
                                    var15 = false;
                                    break;
                                }
                            }
                        }
                        if (var15) {
                            int var17 = var11;
                            while (true) {
                                if (var17 >= var13) {
                                    continue label217;
                                }
                                for (int var18 = var12; var18 < var14; var18++) {
                                    var10002 = class279.field4324[var17][var18]--;
                                }
                                var17++;
                            }
                        }
                    }
                    if (var7.field3989 == null || var7.field4038 > class52.field740 || var7.field4079 <= class52.field740) {
                        var7.field4063 = false;
                        var7.field3987 = class275.method1836(class295.field4642, var7.field4085, var7.field4019, -121);
                        class254.method1694(class295.field4642, var7.field4019, var7.field4085, var7.field3987, (var8 - 1) * 64 + 60, var7, var7.field4010, var5, var7.field4003);
                    } else {
                        var7.field4063 = false;
                        var7.field1198 = false;
                        var7.field3987 = class275.method1836(class295.field4642, var7.field4085, var7.field4019, -116);
                        class202.method1281(class295.field4642, var7.field4019, var7.field4085, var7.field3987, var7, var7.field4010, var5, var7.field4037, var7.field4039, var7.field4051, var7.field4083);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)Lvi;")
    public static final class197 method288(int arg0, int arg1, int arg2) {
        class89 var3 = class194.field2682[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1244;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Z)V")
    public static void method289(boolean arg0) {
        field648 = null;
        field650 = null;
        if (!arg0) {
            method286();
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IBI)I")
    public final int method77(int arg0, byte arg1, int arg2) {
        if (arg1 < 45) {
            field649 = 98;
        }
        int var4 = this.field657;
        this.field657 = 300;
        field644++;
        int var5 = this.field647;
        this.field647 = 1;
        this.field653 = class223.method1433((byte) 122);
        if (this.field651[this.field654] == 0L) {
            this.field657 = var4;
            this.field647 = var5;
        } else if (this.field653 > this.field651[this.field654]) {
            this.field657 = (int) ((long) (arg2 * 2560) / (this.field653 - this.field651[this.field654]));
        }
        if (this.field657 < 25) {
            this.field657 = 25;
        }
        if (this.field657 > 256) {
            this.field657 = 256;
            this.field647 = (int) ((long) arg2 - ((this.field653 - this.field651[this.field654]) / 10L));
        }
        if (arg2 < this.field647) {
            this.field647 = arg2;
        }
        this.field651[this.field654] = this.field653;
        this.field654 = (this.field654 + 1) % 10;
        if (this.field647 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field651[var6] != 0L) {
                    this.field651[var6] -= -((long) this.field647);
                }
            }
        }
        int var7 = 0;
        if (arg0 > this.field647) {
            this.field647 = arg0;
        }
        class28.method182((long) this.field647, 124);
        while (this.field652 < 256) {
            this.field652 += this.field657;
            var7++;
        }
        this.field652 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V")
    public class43() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field651[var1] = this.field653;
        }
    }
}
