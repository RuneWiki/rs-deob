import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class106 extends class26 {

    @OriginalMember(owner = "client!pb", name = "hb", descriptor = "I")
    private int field2517;

    @OriginalMember(owner = "client!pb", name = "fb", descriptor = "I")
    private int field2515;

    @OriginalMember(owner = "client!pb", name = "V", descriptor = "I")
    private int field2505;

    @OriginalMember(owner = "client!pb", name = "ib", descriptor = "I")
    private int field2518;

    @OriginalMember(owner = "client!pb", name = "jb", descriptor = "I")
    private int field2519;

    @OriginalMember(owner = "client!pb", name = "eb", descriptor = "I")
    private int field2514;

    @OriginalMember(owner = "client!pb", name = "bb", descriptor = "Lvc;")
    private class149 field2511;

    @OriginalMember(owner = "client!pb", name = "ab", descriptor = "I")
    private int field2510;

    @OriginalMember(owner = "client!pb", name = "lb", descriptor = "I")
    private int field2521;

    @OriginalMember(owner = "client!pb", name = "T", descriptor = "Lec;")
    public static class32 field2503 = class73.method594("(Y<)4col>", true);

    @OriginalMember(owner = "client!pb", name = "W", descriptor = "I")
    public static int field2506 = 0;

    @OriginalMember(owner = "client!pb", name = "nb", descriptor = "Lec;")
    private static class32 field2523 = class73.method594("slide:", true);

    @OriginalMember(owner = "client!pb", name = "Y", descriptor = "Lec;")
    private static class32 field2508 = class73.method594("shake:", true);

    @OriginalMember(owner = "client!pb", name = "qb", descriptor = "Lec;")
    public static class32 field2526 = field2508;

    @OriginalMember(owner = "client!pb", name = "pb", descriptor = "Lec;")
    public static class32 field2525 = field2523;

    @OriginalMember(owner = "client!pb", name = "rb", descriptor = "Lec;")
    public static class32 field2527 = class73.method594("null", true);

    @OriginalMember(owner = "client!pb", name = "tb", descriptor = "Lec;")
    public static class32 field2529 = field2523;

    @OriginalMember(owner = "client!pb", name = "gb", descriptor = "I")
    public static int field2516 = 0;

    @OriginalMember(owner = "client!pb", name = "kb", descriptor = "[I")
    public static int[] field2520 = new int[128];

    @OriginalMember(owner = "client!pb", name = "xb", descriptor = "Lec;")
    public static class32 field2533 = field2508;

    @OriginalMember(owner = "client!pb", name = "wb", descriptor = "Lec;")
    public static class32 field2532 = class73.method594("Keine Antwort vom Anmelde)2Server)3", true);

    @OriginalMember(owner = "client!pb", name = "U", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!pb", name = "Z", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!pb", name = "cb", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!pb", name = "mb", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!pb", name = "ob", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!pb", name = "sb", descriptor = "I")
    public static int field2528;

    @OriginalMember(owner = "client!pb", name = "ub", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!pb", name = "vb", descriptor = "Ljd;")
    public static class66 field2531;

    @OriginalMember(owner = "client!pb", name = "db", descriptor = "[I")
    public static int[] field2513;

    @OriginalMember(owner = "client!pb", name = "X", descriptor = "[[S")
    public static short[][] field2507;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I[Lf;I)V")
    public static final void method861(int arg0, class36[] arg1, int arg2) {
        if (arg2 != 2047) {
            method863(7);
        }
        field2524++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            class36 var4 = arg1[var3];
            if (var4 != null && var4.field865 == arg0 && (!var4.field849 || !class118.method934(true, var4))) {
                if (var4.field756 == 0) {
                    if (!var4.field849 && class118.method934(true, var4) && class50.field1164 != var4) {
                        continue;
                    }
                    method861(var4.field744, arg1, arg2);
                    if (var4.field755 != null) {
                        method861(var4.field744, var4.field755, 2047);
                    }
                    class144 var5 = (class144) class109.field2573.method1198((long) var4.field744, (byte) -106);
                    if (var5 != null) {
                        class109.method871(-128, var5.field3282);
                    }
                }
                if (var4.field756 == 6) {
                    if (var4.field766 != -1 || var4.field788 != -1) {
                        boolean var6 = class84.method658(var4, arg2 - 1983);
                        int var7;
                        if (var6) {
                            var7 = var4.field788;
                        } else {
                            var7 = var4.field766;
                        }
                        if (var7 != -1) {
                            class149 var8 = class97.method762((byte) 98, var7);
                            var4.field840 += class54.field1283;
                            while (var8.field3378[var4.field763] < var4.field840) {
                                var4.field840 -= var8.field3378[var4.field763];
                                var4.field763++;
                                if (var8.field3395.length <= var4.field763) {
                                    var4.field763 -= var8.field3388;
                                    if (var4.field763 < 0 || var8.field3395.length <= var4.field763) {
                                        var4.field763 = 0;
                                    }
                                }
                                class132.method1010(var4, (byte) -121);
                            }
                        }
                    }
                    if (var4.field750 != 0 && !var4.field849) {
                        int var9 = var4.field750 >> 16;
                        int var10 = var4.field750 << 16 >> 16;
                        int var11 = class54.field1283 * var9;
                        var4.field813 = var4.field813 + var11 & 0x7FF;
                        int var12 = class54.field1283 * var10;
                        var4.field875 = var4.field875 + var12 & 0x7FF;
                        class132.method1010(var4, (byte) -119);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "(B)Lod;")
    public final class101 method132(byte arg0) {
        if (this.field2511 != null) {
            int var2 = class140.field3219 - this.field2521;
            if (var2 > 100 && this.field2511.field3388 > 0) {
                var2 = 100;
            }
            label52: {
                do {
                    do {
                        if (var2 <= this.field2511.field3378[this.field2510]) {
                            break label52;
                        }
                        var2 -= this.field2511.field3378[this.field2510];
                        this.field2510++;
                    } while (this.field2511.field3395.length > this.field2510);
                    this.field2510 -= this.field2511.field3388;
                } while (this.field2510 >= 0 && this.field2511.field3395.length > this.field2510);
                this.field2511 = null;
            }
            this.field2521 = class140.field3219 - var2;
        }
        field2512++;
        class53 var3 = class5.method22(arg0 - 237, this.field2517);
        if (var3.field1252 != null) {
            var3 = var3.method423((byte) -17);
        }
        if (var3 == null) {
            return null;
        }
        int var4;
        int var5;
        if (this.field2519 == 1 || this.field2519 == 3) {
            var5 = var3.field1223;
            var4 = var3.field1234;
        } else {
            var4 = var3.field1223;
            var5 = var3.field1234;
        }
        int var6 = (var4 + 1 >> 1) + this.field2514;
        int var7 = this.field2514 + (var4 >> 1);
        int var8 = (var5 >> 1) + this.field2518;
        int var9 = (var5 + 1 >> 1) + this.field2518;
        int[][] var10 = class70.field1631[this.field2505];
        int var11 = var10[var6][var9] + var10[var7][var9] + var10[var7][var8] + var10[var6][var8] >> 2;
        int var12 = (this.field2514 << 7) + (var4 << 6);
        int var13 = (this.field2518 << 7) + (var5 << 6);
        return arg0 == 109 ? var3.method416(false, this.field2511, var13, this.field2515, var10, var12, this.field2510, var11, this.field2519) : null;
    }

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIIIZLdd;)V")
    public class106(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, class26 arg8) {
        this.field2517 = arg0;
        this.field2515 = arg1;
        this.field2505 = arg3;
        this.field2518 = arg5;
        this.field2519 = arg2;
        this.field2514 = arg4;
        if (arg6 != -1) {
            this.field2511 = class97.method762((byte) 112, arg6);
            this.field2510 = 0;
            this.field2521 = class140.field3219 - 1;
            if (this.field2511.field3397 == 0 && arg8 != null && arg8 instanceof class106) {
                class106 var10 = (class106) arg8;
                if (this.field2511 == var10.field2511) {
                    this.field2510 = var10.field2510;
                    this.field2521 = var10.field2521;
                    return;
                }
            }
            if (arg7 && this.field2511.field3388 != -1) {
                this.field2510 = (int) ((double) this.field2511.field3395.length * Math.random());
                this.field2521 -= (int) ((double) this.field2511.field3378[this.field2510] * Math.random());
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "(I)V")
    public static final void method862(int arg0) {
        field2528++;
        if (class38.field910 != null) {
            class109 var1 = class38.field910;
            synchronized (class38.field910) {
                class38.field910 = null;
            }
        }
        if (arg0 != 100) {
            method863(109);
        }
    }

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "(I)V")
    public static void method863(int arg0) {
        field2507 = null;
        if (arg0 != 1654298567) {
            field2506 = 26;
        }
        field2513 = null;
        field2527 = null;
        field2533 = null;
        field2531 = null;
        field2526 = null;
        field2529 = null;
        field2532 = null;
        field2508 = null;
        field2523 = null;
        field2525 = null;
        field2503 = null;
        field2520 = null;
    }
}
