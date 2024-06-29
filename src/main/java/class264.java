import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class264 extends class23 {

    @OriginalMember(owner = "client!bh", name = "gb", descriptor = "I")
    private int field4418 = 4;

    @OriginalMember(owner = "client!bh", name = "kb", descriptor = "I")
    private int field4422 = 1024;

    @OriginalMember(owner = "client!bh", name = "qb", descriptor = "I")
    private int field4428 = 204;

    @OriginalMember(owner = "client!bh", name = "eb", descriptor = "I")
    private int field4416 = 1024;

    @OriginalMember(owner = "client!bh", name = "nb", descriptor = "I")
    private int field4425 = 8;

    @OriginalMember(owner = "client!bh", name = "ab", descriptor = "I")
    private int field4412 = 409;

    @OriginalMember(owner = "client!bh", name = "ub", descriptor = "I")
    private int field4432 = 0;

    @OriginalMember(owner = "client!bh", name = "bb", descriptor = "I")
    private int field4413 = 81;

    @OriginalMember(owner = "client!bh", name = "Y", descriptor = "I")
    public static int field4410 = 0;

    @OriginalMember(owner = "client!bh", name = "ib", descriptor = "[I")
    public static int[] field4420 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!bh", name = "jb", descriptor = "Lqd;")
    public static class40 field4421 = class147.method1106("", (byte) -58);

    @OriginalMember(owner = "client!bh", name = "vb", descriptor = "Lqd;")
    public static class40 field4433 = field4421;

    @OriginalMember(owner = "client!bh", name = "wb", descriptor = "Lqd;")
    public static class40 field4434 = field4421;

    @OriginalMember(owner = "client!bh", name = "cb", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!bh", name = "db", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!bh", name = "hb", descriptor = "I")
    private int field4419;

    @OriginalMember(owner = "client!bh", name = "lb", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!bh", name = "mb", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!bh", name = "ob", descriptor = "I")
    private int field4426;

    @OriginalMember(owner = "client!bh", name = "pb", descriptor = "I")
    private int field4427;

    @OriginalMember(owner = "client!bh", name = "rb", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!bh", name = "fb", descriptor = "Z")
    public static boolean field4417;

    @OriginalMember(owner = "client!bh", name = "Z", descriptor = "[I")
    private int[] field4411;

    @OriginalMember(owner = "client!bh", name = "sb", descriptor = "[[I")
    private int[][] field4430;

    @OriginalMember(owner = "client!bh", name = "tb", descriptor = "[[I")
    private int[][] field4431;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)V", line = 9)
    private final void method1851(int arg0) {
        int var2 = -39 / ((arg0 - 11) / 45);
        Random var3 = new Random((long) this.field4425);
        field4423++;
        this.field4411 = new int[this.field4425 + 1];
        this.field4430 = new int[this.field4425][this.field4418 + 1];
        this.field4431 = new int[this.field4425][this.field4418];
        this.field4427 = 4096 / this.field4425;
        this.field4411[0] = 0;
        int var4 = this.field4427 / 2;
        this.field4419 = this.field4413 / 2;
        this.field4426 = 4096 / this.field4418;
        int var5 = this.field4426 / 2;
        for (int var6 = 0; var6 < this.field4425; var6++) {
            if (var6 > 0) {
                int var7 = this.field4427;
                int var8 = (class110.method830((byte) -42, var3, 4096) - 2048) * this.field4428 >> 12;
                int var9 = (var4 * var8 >> 12) + var7;
                this.field4411[var6] = this.field4411[var6 - 1] + var9;
            }
            this.field4430[var6][0] = 0;
            for (int var10 = 0; var10 < this.field4418; var10++) {
                if (var10 > 0) {
                    int var11 = this.field4426;
                    int var12 = (class110.method830((byte) -28, var3, 4096) - 2048) * this.field4412 >> 12;
                    int var13 = (var5 * var12 >> 12) + var11;
                    this.field4430[var6][var10] = this.field4430[var6][var10 - 1] + var13;
                }
                this.field4431[var6][var10] = this.field4416 <= 0 ? 4096 : 4096 - class110.method830((byte) -38, var3, this.field4416);
            }
            this.field4430[var6][this.field4418] = 4096;
        }
        this.field4411[this.field4425] = 4096;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V", line = 89)
    public final void method61(byte arg0) {
        field4415++;
        this.method1851(-126);
        if (arg0 != 4) {
            field4434 = (class40) null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "()V", line = 313)
    public class264() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)[I", line = 130)
    public final int[] method32(byte arg0, int arg1) {
        int[] var3 = this.field403.method724((byte) -102, arg1);
        if (this.field403.field1760) {
            int var4 = 0;
            int var5;
            for (var5 = class150.field2509[arg1] + this.field4432; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field4425 > var4 && var5 >= this.field4411[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field4411[var4];
            int var9 = this.field4411[var4 - 1];
            if (var5 > this.field4419 + var9 && var5 < (var8 - this.field4419)) {
                for (int var10 = 0; var10 < class52.field1007; var10++) {
                    int var11 = 0;
                    int var12 = var7 ? this.field4422 : -this.field4422;
                    int var13;
                    for (var13 = class315.field5345[var10] + (this.field4426 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (var11 < this.field4418 && var13 >= this.field4430[var6][var11]) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field4430[var6][var14];
                    int var16 = this.field4430[var6][var11];
                    if ((this.field4419 + var15) < var13 && var16 - this.field4419 > var13) {
                        var3[var10] = this.field4431[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class234.method1625(var3, 0, class52.field1007, 0);
            }
        }
        if (arg0 == -94) {
            field4429++;
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IILsd;)V", line = 227)
    public final void method23(int arg0, int arg1, class26 arg2) {
        field4424++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            this.field4418 = arg2.method226(255);
        } else if (arg0 == 1) {
            this.field4425 = arg2.method226(255);
        } else if (arg0 == 2) {
            this.field4412 = arg2.method197(arg1 - 1);
        } else if (arg0 == 3) {
            this.field4428 = arg2.method197(-1);
        } else if (arg0 == 4) {
            this.field4422 = arg2.method197(-1);
        } else if (arg0 == 5) {
            this.field4432 = arg2.method197(-1);
        } else if (arg0 == 6) {
            this.field4413 = arg2.method197(~arg1);
        } else if (arg0 == 7) {
            this.field4416 = arg2.method197(~arg1);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(B)V", line = 342)
    public static void method1852(byte arg0) {
        field4433 = null;
        int var1 = 32 / ((24 - arg0) / 53);
        field4420 = null;
        field4434 = null;
        field4421 = null;
    }
}
