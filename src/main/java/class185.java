import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class185 extends class199 {

    @OriginalMember(owner = "client!sn", name = "U", descriptor = "I")
    private int field2518 = 81;

    @OriginalMember(owner = "client!sn", name = "fb", descriptor = "I")
    private int field2529 = 4;

    @OriginalMember(owner = "client!sn", name = "gb", descriptor = "I")
    private int field2530 = 0;

    @OriginalMember(owner = "client!sn", name = "eb", descriptor = "I")
    private int field2528 = 1024;

    @OriginalMember(owner = "client!sn", name = "db", descriptor = "I")
    private int field2527 = 1024;

    @OriginalMember(owner = "client!sn", name = "hb", descriptor = "I")
    private int field2531 = 409;

    @OriginalMember(owner = "client!sn", name = "sb", descriptor = "I")
    private int field2542 = 204;

    @OriginalMember(owner = "client!sn", name = "V", descriptor = "I")
    private int field2519 = 8;

    @OriginalMember(owner = "client!sn", name = "ab", descriptor = "[Ljava/lang/String;")
    public static String[] field2524 = new String[500];

    @OriginalMember(owner = "client!sn", name = "ib", descriptor = "I")
    public static int field2532 = 0;

    @OriginalMember(owner = "client!sn", name = "Y", descriptor = "I")
    public static int field2522 = 0;

    @OriginalMember(owner = "client!sn", name = "W", descriptor = "[Z")
    public static boolean[] field2520 = new boolean[100];

    @OriginalMember(owner = "client!sn", name = "qb", descriptor = "I")
    public static int field2540 = 0;

    @OriginalMember(owner = "client!sn", name = "rb", descriptor = "I")
    public static int field2541 = -1;

    @OriginalMember(owner = "client!sn", name = "S", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!sn", name = "X", descriptor = "I")
    private int field2521;

    @OriginalMember(owner = "client!sn", name = "Z", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!sn", name = "bb", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!sn", name = "jb", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!sn", name = "kb", descriptor = "I")
    private int field2534;

    @OriginalMember(owner = "client!sn", name = "mb", descriptor = "I")
    private int field2536;

    @OriginalMember(owner = "client!sn", name = "ob", descriptor = "I")
    public static int field2538;

    @OriginalMember(owner = "client!sn", name = "pb", descriptor = "I")
    public static int field2539;

    @OriginalMember(owner = "client!sn", name = "lb", descriptor = "[I")
    private int[] field2535;

    @OriginalMember(owner = "client!sn", name = "cb", descriptor = "[[I")
    private int[][] field2526;

    @OriginalMember(owner = "client!sn", name = "nb", descriptor = "[[I")
    private int[][] field2537;

    @OriginalMember(owner = "client!sn", name = "T", descriptor = "[[[I")
    public static int[][][] field2517;

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(B)V", line = 4)
    public static void method1343(byte arg0) {
        field2524 = null;
        field2517 = (int[][][]) null;
        if (arg0 <= 85) {
            method1345(20, -39);
        }
        field2520 = null;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "()V", line = 31)
    public class185() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sn", name = "f", descriptor = "(I)V", line = 39)
    private final void method1344(int arg0) {
        field2523++;
        Random var2 = new Random((long) this.field2519);
        this.field2521 = 4096 / this.field2519;
        this.field2535 = new int[this.field2519 + 1];
        this.field2526 = new int[this.field2519][this.field2529 + 1];
        this.field2537 = new int[this.field2519][this.field2529];
        this.field2535[0] = 0;
        this.field2536 = 4096 / this.field2529;
        int var3 = this.field2536 / 2;
        this.field2534 = this.field2518 / 2;
        int var4 = this.field2521 / 2;
        if (arg0 != -1) {
            return;
        }
        for (int var5 = 0; var5 < this.field2519; var5++) {
            if (var5 > 0) {
                int var6 = this.field2521;
                int var7 = (class294.method2011(var2, 4096, -97) - 2048) * this.field2542 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2535[var5] = this.field2535[var5 - 1] + var8;
            }
            this.field2526[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2529; var9++) {
                if (var9 > 0) {
                    int var10 = this.field2536;
                    int var11 = (class294.method2011(var2, 4096, arg0 - 9) - 2048) * this.field2531 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2526[var5][var9] = this.field2526[var5][var9 - 1] + var12;
                }
                this.field2537[var5][var9] = this.field2527 <= 0 ? 4096 : 4096 - class294.method2011(var2, this.field2527, class300.method2107(arg0, -25));
            }
            this.field2526[var5][this.field2529] = 4096;
        }
        this.field2535[this.field2519] = 4096;
    }

    @OriginalMember(owner = "client!sn", name = "c", descriptor = "(II)I", line = 106)
    public static final int method1345(int arg0, int arg1) {
        if (arg0 < 94) {
            field2540 = 108;
        }
        field2538++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(B)V", line = 133)
    public final void method189(byte arg0) {
        field2525++;
        int var2 = 10 / ((arg0 - 36) / 44);
        this.method1344(-1);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(BLfd;I)V", line = 167)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2529 = arg1.method2096((byte) -122);
        } else if (arg2 == 1) {
            this.field2519 = arg1.method2096((byte) -122);
        } else if (arg2 == 2) {
            this.field2531 = arg1.method2083((byte) -89);
        } else if (arg2 == 3) {
            this.field2542 = arg1.method2083((byte) -75);
        } else if (arg2 == 4) {
            this.field2528 = arg1.method2083((byte) -81);
        } else if (arg2 == 5) {
            this.field2530 = arg1.method2083((byte) -25);
        } else if (arg2 == 6) {
            this.field2518 = arg1.method2083((byte) -97);
        } else if (arg2 == 7) {
            this.field2527 = arg1.method2083((byte) -75);
        }
        if (arg0 != -43) {
            this.field2536 = -71;
        }
        field2539++;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(II)[I", line = 245)
    public final int[] method190(int arg0, int arg1) {
        field2516++;
        int[] var3 = this.field2802.method2502(arg1, arg0 + 1662);
        if (this.field2802.field5637) {
            int var4 = 0;
            int var5;
            for (var5 = class274.field3919[arg1] + this.field2530; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field2519 > var4 && var5 >= this.field2535[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            int var7 = this.field2535[var4];
            boolean var8 = (var4 & 0x1) == 0;
            int var9 = this.field2535[var4 - 1];
            if (var9 + this.field2534 < var5 && var5 < (var7 - this.field2534)) {
                for (int var10 = 0; var10 < class95.field1235; var10++) {
                    int var11 = var8 ? this.field2528 : -this.field2528;
                    int var12 = class82.field1062[var10] + (this.field2536 * var11 >> 12);
                    int var13 = 0;
                    while (var12 < 0) {
                        var12 += 4096;
                    }
                    while (var12 > 4096) {
                        var12 -= 4096;
                    }
                    while (var13 < this.field2529 && var12 >= this.field2526[var6][var13]) {
                        var13++;
                    }
                    int var14 = this.field2526[var6][var13];
                    int var15 = var13 - 1;
                    int var16 = this.field2526[var6][var15];
                    if (this.field2534 + var16 < var12 && var14 - this.field2534 > var12) {
                        var3[var10] = this.field2537[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class87.method630(var3, 0, class95.field1235, 0);
            }
        }
        if (arg0 != -1735) {
            this.method1344(84);
        }
        return var3;
    }
}
