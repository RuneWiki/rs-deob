import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class316 extends class120 {

    @OriginalMember(owner = "client!tf", name = "Y", descriptor = "I")
    private int field5332 = 8;

    @OriginalMember(owner = "client!tf", name = "U", descriptor = "I")
    private int field5328 = 204;

    @OriginalMember(owner = "client!tf", name = "Z", descriptor = "I")
    private int field5333 = 409;

    @OriginalMember(owner = "client!tf", name = "nb", descriptor = "I")
    private int field5347 = 1024;

    @OriginalMember(owner = "client!tf", name = "lb", descriptor = "I")
    private int field5345 = 0;

    @OriginalMember(owner = "client!tf", name = "ob", descriptor = "I")
    private int field5348 = 1024;

    @OriginalMember(owner = "client!tf", name = "cb", descriptor = "I")
    private int field5336 = 81;

    @OriginalMember(owner = "client!tf", name = "ib", descriptor = "I")
    private int field5342 = 4;

    @OriginalMember(owner = "client!tf", name = "X", descriptor = "[I")
    public static int[] field5331 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tf", name = "jb", descriptor = "Lok;")
    public static class41 field5343 = class137.method956("leuchten2:", 45);

    @OriginalMember(owner = "client!tf", name = "qb", descriptor = "Lok;")
    public static class41 field5350 = class137.method956("Fps:", 45);

    @OriginalMember(owner = "client!tf", name = "mb", descriptor = "Lok;")
    public static class41 field5346 = class137.method956("blinken3:", 45);

    @OriginalMember(owner = "client!tf", name = "rb", descriptor = "I")
    public static int field5351 = 0;

    @OriginalMember(owner = "client!tf", name = "T", descriptor = "I")
    public static int field5327;

    @OriginalMember(owner = "client!tf", name = "W", descriptor = "I")
    private int field5330;

    @OriginalMember(owner = "client!tf", name = "ab", descriptor = "I")
    private int field5334;

    @OriginalMember(owner = "client!tf", name = "bb", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!tf", name = "db", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!tf", name = "fb", descriptor = "I")
    private int field5339;

    @OriginalMember(owner = "client!tf", name = "kb", descriptor = "I")
    public static int field5344;

    @OriginalMember(owner = "client!tf", name = "pb", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!tf", name = "sb", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!tf", name = "hb", descriptor = "Lbc;")
    public static class302 field5341;

    @OriginalMember(owner = "client!tf", name = "V", descriptor = "[I")
    private int[] field5329;

    @OriginalMember(owner = "client!tf", name = "eb", descriptor = "[[I")
    private int[][] field5338;

    @OriginalMember(owner = "client!tf", name = "gb", descriptor = "[[I")
    private int[][] field5340;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "(I)V", line = 15)
    public final void method31(int arg0) {
        field5337++;
        if (arg0 == -31851) {
            this.method2181((byte) -93);
        }
    }

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "(B)V", line = 27)
    private final void method2181(byte arg0) {
        Random var2 = new Random((long) this.field5332);
        if (arg0 >= -83) {
            return;
        }
        this.field5340 = new int[this.field5332][this.field5342];
        this.field5334 = 4096 / this.field5342;
        int var3 = this.field5334 / 2;
        this.field5339 = 4096 / this.field5332;
        int var4 = this.field5339 / 2;
        this.field5330 = this.field5336 / 2;
        this.field5338 = new int[this.field5332][this.field5342 + 1];
        field5327++;
        this.field5329 = new int[this.field5332 + 1];
        this.field5329[0] = 0;
        for (int var5 = 0; var5 < this.field5332; var5++) {
            if (var5 > 0) {
                int var6 = this.field5339;
                int var7 = (class91.method640(63, 4096, var2) - 2048) * this.field5328 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field5329[var5] = this.field5329[var5 - 1] + var8;
            }
            this.field5338[var5][0] = 0;
            for (int var9 = 0; var9 < this.field5342; var9++) {
                if (var9 > 0) {
                    int var10 = this.field5334;
                    int var11 = (class91.method640(115, 4096, var2) - 2048) * this.field5333 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field5338[var5][var9] = this.field5338[var5][var9 - 1] + var12;
                }
                this.field5340[var5][var9] = this.field5348 <= 0 ? 4096 : 4096 - class91.method640(53, this.field5348, var2);
            }
            this.field5338[var5][this.field5342] = 4096;
        }
        this.field5329[this.field5332] = 4096;
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(I)V", line = 93)
    public static final void method2182(int arg0) {
        class32.field466.method135(18436);
        field5344++;
        class28.field418.method135(18436);
        class144.field2197.method135(18436);
        if (arg0 >= -37) {
            method2182(43);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Llb;II)V", line = 107)
    public final void method30(class112 arg0, int arg1, int arg2) {
        field5335++;
        if (arg1 != -1) {
            this.method30((class112) null, 17, 112);
        }
        if (arg2 == 0) {
            this.field5342 = arg0.method792(arg1 ^ 0xFFFFFFFD);
        } else if (arg2 == 1) {
            this.field5332 = arg0.method792(2);
        } else if (arg2 == 2) {
            this.field5333 = arg0.method759((byte) -112);
        } else if (arg2 == 3) {
            this.field5328 = arg0.method759((byte) -110);
        } else if (arg2 == 4) {
            this.field5347 = arg0.method759((byte) -64);
        } else if (arg2 == 5) {
            this.field5345 = arg0.method759((byte) -86);
        } else if (arg2 == 6) {
            this.field5336 = arg0.method759((byte) -71);
        } else if (arg2 == 7) {
            this.field5348 = arg0.method759((byte) -127);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)[I", line = 195)
    public final int[] method14(int arg0, int arg1) {
        if (arg1 != -14959) {
            return (int[]) null;
        }
        field5349++;
        int[] var3 = this.field1775.method863((byte) 34, arg0);
        if (this.field1775.field1798) {
            int var4 = 0;
            int var5;
            for (var5 = class16.field216[arg0] + this.field5345; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field5332 && var5 >= this.field5329[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field5329[var4 - 1];
            int var9 = this.field5329[var4];
            if (var5 > var8 + this.field5330 && (var9 - this.field5330) > var5) {
                for (int var10 = 0; var10 < class307.field5160; var10++) {
                    int var11 = var7 ? this.field5347 : -this.field5347;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field5334 * var11 >> 12) + class203.field3278[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var12 < this.field5342 && this.field5338[var6][var12] <= var13) {
                        var12++;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field5338[var6][var12];
                    int var16 = this.field5338[var6][var14];
                    if (var13 > var16 + this.field5330 && var15 - this.field5330 > var13) {
                        var3[var10] = this.field5340[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class21.method143(var3, 0, class307.field5160, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "()V", line = 298)
    public class316() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "(B)V", line = 310)
    public static void method2183(byte arg0) {
        if (arg0 != -7) {
            field5351 = -64;
        }
        field5331 = null;
        field5341 = null;
        field5346 = null;
        field5343 = null;
        field5350 = null;
    }
}
