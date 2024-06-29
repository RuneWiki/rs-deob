import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class155 extends class286 {

    @OriginalMember(owner = "client!ba", name = "T", descriptor = "I")
    private int field2543 = 8;

    @OriginalMember(owner = "client!ba", name = "R", descriptor = "I")
    private int field2541 = 409;

    @OriginalMember(owner = "client!ba", name = "ab", descriptor = "I")
    private int field2550 = 0;

    @OriginalMember(owner = "client!ba", name = "P", descriptor = "I")
    private int field2539 = 1024;

    @OriginalMember(owner = "client!ba", name = "O", descriptor = "I")
    private int field2538 = 81;

    @OriginalMember(owner = "client!ba", name = "V", descriptor = "I")
    private int field2545 = 4;

    @OriginalMember(owner = "client!ba", name = "X", descriptor = "I")
    private int field2547 = 1024;

    @OriginalMember(owner = "client!ba", name = "jb", descriptor = "I")
    private int field2559 = 204;

    @OriginalMember(owner = "client!ba", name = "S", descriptor = "Lbe;")
    public static class283 field2542 = class153.method941(2, "0");

    @OriginalMember(owner = "client!ba", name = "cb", descriptor = "I")
    public static int field2552 = 3;

    @OriginalMember(owner = "client!ba", name = "db", descriptor = "I")
    public static int field2553 = 0;

    @OriginalMember(owner = "client!ba", name = "gb", descriptor = "Lbe;")
    public static class283 field2556 = class153.method941(-9, "::fpson");

    @OriginalMember(owner = "client!ba", name = "Y", descriptor = "Lbe;")
    public static class283 field2548 = class153.method941(127, "<br>");

    @OriginalMember(owner = "client!ba", name = "Q", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!ba", name = "W", descriptor = "I")
    private int field2546;

    @OriginalMember(owner = "client!ba", name = "Z", descriptor = "I")
    private int field2549;

    @OriginalMember(owner = "client!ba", name = "bb", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ba", name = "eb", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!ba", name = "fb", descriptor = "I")
    private int field2555;

    @OriginalMember(owner = "client!ba", name = "kb", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!ba", name = "mb", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ba", name = "ib", descriptor = "Lek;")
    public static class172 field2558;

    @OriginalMember(owner = "client!ba", name = "lb", descriptor = "Lof;")
    public static class225 field2561;

    @OriginalMember(owner = "client!ba", name = "U", descriptor = "[I")
    private int[] field2544;

    @OriginalMember(owner = "client!ba", name = "N", descriptor = "[[I")
    private int[][] field2537;

    @OriginalMember(owner = "client!ba", name = "hb", descriptor = "[[I")
    private int[][] field2557;

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V", line = 390)
    public class155() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIIII)I", line = 33)
    public static final int method951(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg4 & 0x3;
        field2554++;
        if ((arg1 & 0x1) == 1) {
            int var8 = arg2;
            arg2 = arg0;
            arg0 = var8;
        }
        int var9 = 46 / ((arg3 - 33) / 36);
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return 8 - arg2 - arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg0 - arg6;
        } else {
            return arg5;
        }
    }

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "(I)V", line = 63)
    public final void method276(int arg0) {
        field2540++;
        if (arg0 != 3) {
            method951(-75, -44, 106, -99, -112, 17, -67);
        }
        this.method952(5795);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)[I", line = 92)
    public final int[] method14(int arg0, int arg1) {
        field2562++;
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (arg0 >= -52) {
            this.method952(-44);
        }
        if (this.field4863.field3984) {
            int var4 = 0;
            int var5;
            for (var5 = class153.field2509[arg1] + this.field2550; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field2543 > var4 && var5 >= this.field2544[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            int var7 = this.field2544[var4];
            int var8 = this.field2544[var4 - 1];
            boolean var9 = (var4 & 0x1) == 0;
            if ((var8 + this.field2546) < var5 && var5 < var7 - this.field2546) {
                for (int var10 = 0; var10 < class27.field410; var10++) {
                    int var11 = 0;
                    int var12 = var9 ? this.field2547 : -this.field2547;
                    int var13;
                    for (var13 = (this.field2549 * var12 >> 12) + class174.field2978[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field2545 && var13 >= this.field2537[var6][var11]) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field2537[var6][var11];
                    int var16 = this.field2537[var6][var14];
                    if ((this.field2546 + var16) < var13 && var15 - this.field2546 > var13) {
                        var3[var10] = this.field2557[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class136.method849(var3, 0, class27.field410, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lfe;ZI)V", line = 190)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        field2551++;
        if (arg2 == 0) {
            this.field2545 = arg0.method1535((byte) 93);
        } else if (arg2 == 1) {
            this.field2543 = arg0.method1535((byte) 86);
        } else if (arg2 == 2) {
            this.field2541 = arg0.method1496(true);
        } else if (arg2 == 3) {
            this.field2559 = arg0.method1496(true);
        } else if (arg2 == 4) {
            this.field2547 = arg0.method1496(true);
        } else if (arg2 == 5) {
            this.field2550 = arg0.method1496(true);
        } else if (arg2 == 6) {
            this.field2538 = arg0.method1496(true);
        } else if (arg2 == 7) {
            this.field2539 = arg0.method1496(true);
        }
        if (arg1) {
            this.field2549 = 26;
        }
    }

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "(I)V", line = 286)
    private final void method952(int arg0) {
        field2560++;
        Random var2 = new Random((long) this.field2543);
        this.field2549 = 4096 / this.field2545;
        this.field2557 = new int[this.field2543][this.field2545];
        int var3 = this.field2549 / 2;
        this.field2555 = 4096 / this.field2543;
        this.field2537 = new int[this.field2543][this.field2545 + 1];
        this.field2546 = this.field2538 / 2;
        if (arg0 != 5795) {
            this.method19((class229) null, true, 113);
        }
        this.field2544 = new int[this.field2543 + 1];
        int var4 = this.field2555 / 2;
        this.field2544[0] = 0;
        for (int var5 = 0; var5 < this.field2543; var5++) {
            if (var5 > 0) {
                int var6 = this.field2555;
                int var7 = (class47.method275(4096, var2, -1625284640) - 2048) * this.field2559 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field2544[var5] = this.field2544[var5 - 1] + var8;
            }
            this.field2537[var5][0] = 0;
            for (int var9 = 0; var9 < this.field2545; var9++) {
                if (var9 > 0) {
                    int var10 = this.field2549;
                    int var11 = (class47.method275(4096, var2, arg0 ^ -1625290429) - 2048) * this.field2541 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field2537[var5][var9] = this.field2537[var5][var9 - 1] + var12;
                }
                this.field2557[var5][var9] = this.field2539 > 0 ? 4096 - class47.method275(this.field2539, var2, -1625284640) : 4096;
            }
            this.field2537[var5][this.field2545] = 4096;
        }
        this.field2544[this.field2543] = 4096;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(B)V", line = 371)
    public static void method953(byte arg0) {
        int var1 = 17 % ((arg0 - 66) / 50);
        field2558 = null;
        field2548 = null;
        field2556 = null;
        field2542 = null;
        field2561 = null;
    }
}
