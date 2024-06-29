import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class260 extends class170 {

    @OriginalMember(owner = "client!w", name = "Z", descriptor = "I")
    private int field4492 = 409;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    private int field4486 = 4;

    @OriginalMember(owner = "client!w", name = "eb", descriptor = "I")
    private int field4497 = 0;

    @OriginalMember(owner = "client!w", name = "bb", descriptor = "I")
    private int field4494 = 1024;

    @OriginalMember(owner = "client!w", name = "kb", descriptor = "I")
    private int field4503 = 204;

    @OriginalMember(owner = "client!w", name = "S", descriptor = "I")
    private int field4485 = 1024;

    @OriginalMember(owner = "client!w", name = "hb", descriptor = "I")
    private int field4500 = 8;

    @OriginalMember(owner = "client!w", name = "wb", descriptor = "I")
    private int field4515 = 81;

    @OriginalMember(owner = "client!w", name = "W", descriptor = "[Lia;")
    public static class199[] field4489 = new class199[4];

    @OriginalMember(owner = "client!w", name = "mb", descriptor = "Lmh;")
    public static class128 field4505 = class22.method156(126, ")4p=");

    @OriginalMember(owner = "client!w", name = "nb", descriptor = "[I")
    public static int[] field4506 = new int[32];

    @OriginalMember(owner = "client!w", name = "qb", descriptor = "Lmh;")
    public static class128 field4509 = class22.method156(126, ")1o");

    @OriginalMember(owner = "client!w", name = "tb", descriptor = "Z")
    public static boolean field4512 = true;

    @OriginalMember(owner = "client!w", name = "ub", descriptor = "Lmh;")
    public static class128 field4513 = class22.method156(123, "Ladevorgang )2 bitte warten Sie)3");

    @OriginalMember(owner = "client!w", name = "sb", descriptor = "I")
    public static int field4511 = -1;

    @OriginalMember(owner = "client!w", name = "vb", descriptor = "[[I")
    public static int[][] field4514 = new int[104][104];

    @OriginalMember(owner = "client!w", name = "R", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "I")
    private int field4488;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!w", name = "ab", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!w", name = "db", descriptor = "I")
    private int field4496;

    @OriginalMember(owner = "client!w", name = "fb", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!w", name = "gb", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!w", name = "ib", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!w", name = "jb", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!w", name = "lb", descriptor = "I")
    public static int field4504;

    @OriginalMember(owner = "client!w", name = "ob", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!w", name = "rb", descriptor = "I")
    private int field4510;

    @OriginalMember(owner = "client!w", name = "yb", descriptor = "I")
    public static int field4517;

    @OriginalMember(owner = "client!w", name = "Y", descriptor = "[I")
    private int[] field4491;

    @OriginalMember(owner = "client!w", name = "pb", descriptor = "[[I")
    private int[][] field4508;

    @OriginalMember(owner = "client!w", name = "xb", descriptor = "[[I")
    private int[][] field4516;

    @OriginalMember(owner = "client!w", name = "cb", descriptor = "[[[Le;")
    public static class150[][][] field4495;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILbg;B)V", line = 6)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field4504++;
        if (arg0 == 0) {
            this.field4486 = arg1.method1325(7627);
        } else if (arg0 == 1) {
            this.field4500 = arg1.method1325(7627);
        } else if (arg0 == 2) {
            this.field4492 = arg1.method1308(-101);
        } else if (arg0 == 3) {
            this.field4503 = arg1.method1308(-49);
        } else if (arg0 == 4) {
            this.field4485 = arg1.method1308(-71);
        } else if (arg0 == 5) {
            this.field4497 = arg1.method1308(-127);
        } else if (arg0 == 6) {
            this.field4515 = arg1.method1308(-88);
        } else if (arg0 == 7) {
            this.field4494 = arg1.method1308(arg2 ^ 0xFFFFFFAE);
        }
        if (arg2 != 13) {
            method1825(114, (class314) null, 18, 110);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BLdj;)V", line = 92)
    public static final void method1821(byte arg0, class314 arg1) {
        field4499++;
        if (class51.field1000) {
            return;
        }
        if (class247.field4247) {
            class269.method1884();
        } else {
            class213.method1469();
        }
        class275.field4772 = class296.method2030(class104.field1786, 0, arg1);
        int var2 = class16.field420;
        int var3 = var2 * 956 / 503;
        class275.field4772.method283((class199.field3465 - var3) / 2, 0, var3, var2);
        if (arg0 < 22) {
            field4514 = (int[][]) ((int[][]) null);
        }
        class147.field2534 = class143.method956(arg1, false, class229.field3977);
        class147.field2534.method448(class199.field3465 / 2 - class147.field2534.field2625 / 2, 18);
        class51.field1000 = true;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(I)V", line = 125)
    public static void method1822(int arg0) {
        field4489 = null;
        field4509 = null;
        field4506 = null;
        field4514 = (int[][]) null;
        field4495 = (class150[][][]) null;
        field4505 = null;
        if (arg0 != 1142782988) {
            method1828(42, (byte) 84);
        }
        field4513 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I[F)[F", line = 148)
    public static final float[] method1823(int arg0, float[] arg1) {
        field4493++;
        if (arg1 == null) {
            return null;
        } else {
            float[] var2 = new float[arg1.length];
            class224.method1545(arg1, arg0, var2, 0, arg1.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V", line = 496)
    public class260() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(B)V", line = 170)
    private final void method1824(byte arg0) {
        field4487++;
        Random var2 = new Random((long) this.field4500);
        this.field4516 = new int[this.field4500][this.field4486];
        this.field4491 = new int[this.field4500 + 1];
        this.field4510 = 4096 / this.field4486;
        this.field4488 = this.field4515 / 2;
        if (arg0 != 93) {
            return;
        }
        int var3 = this.field4510 / 2;
        this.field4496 = 4096 / this.field4500;
        int var4 = this.field4496 / 2;
        this.field4491[0] = 0;
        this.field4508 = new int[this.field4500][this.field4486 + 1];
        for (int var5 = 0; var5 < this.field4500; var5++) {
            if (var5 > 0) {
                int var6 = this.field4496;
                int var7 = (class103.method638((byte) 15, 4096, var2) - 2048) * this.field4503 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field4491[var5] = this.field4491[var5 - 1] + var8;
            }
            this.field4508[var5][0] = 0;
            for (int var9 = 0; var9 < this.field4486; var9++) {
                if (var9 > 0) {
                    int var10 = this.field4510;
                    int var11 = (class103.method638((byte) 15, 4096, var2) - 2048) * this.field4492 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field4508[var5][var9] = this.field4508[var5][var9 - 1] + var12;
                }
                this.field4516[var5][var9] = this.field4494 <= 0 ? 4096 : 4096 - class103.method638((byte) 15, this.field4494, var2);
            }
            this.field4508[var5][this.field4486] = 4096;
        }
        this.field4491[this.field4500] = 4096;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILdj;II)Lfb;", line = 237)
    public static final class55 method1825(int arg0, class314 arg1, int arg2, int arg3) {
        field4502++;
        if (class118.method708(-2, arg2, arg1, arg3)) {
            if (arg0 != 255) {
                method1828(-60, (byte) 114);
            }
            return class3.method18(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)I", line = 254)
    public static final int method1826(boolean arg0, int arg1) {
        if (arg0) {
            field4511 = -67;
        }
        field4507++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(I)V", line = 285)
    public final void method267(int arg0) {
        this.method1824((byte) 93);
        if (arg0 != -2718) {
            field4513 = (class128) null;
        }
        field4517++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)[I", line = 306)
    public final int[] method69(byte arg0, int arg1) {
        int[] var3 = this.field2977.method1838(false, arg1);
        if (arg0 != 85) {
            field4509 = (class128) null;
        }
        if (this.field2977.field4552) {
            int var4 = 0;
            int var5;
            for (var5 = class307.field5221[arg1] + this.field4497; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field4500 && this.field4491[var4] <= var5) {
                var4++;
            }
            int var6 = this.field4491[var4];
            int var7 = var4 - 1;
            int var8 = this.field4491[var4 - 1];
            boolean var9 = (var4 & 0x1) == 0;
            if (var8 + this.field4488 < var5 && var6 - this.field4488 > var5) {
                for (int var10 = 0; var10 < class185.field3225; var10++) {
                    int var11 = 0;
                    int var12 = var9 ? this.field4485 : -this.field4485;
                    int var13;
                    for (var13 = class118.field2002[var10] + (this.field4510 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field4486 > var11 && var13 >= this.field4508[var7][var11]) {
                        var11++;
                    }
                    int var14 = var11 - 1;
                    int var15 = this.field4508[var7][var11];
                    int var16 = this.field4508[var7][var14];
                    if (var13 > var16 + this.field4488 && var15 - this.field4488 > var13) {
                        var3[var10] = this.field4516[var7][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class224.method1543(var3, 0, class185.field3225, 0);
            }
        }
        field4490++;
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZJ)Lmh;", line = 429)
    public static final class128 method1827(boolean arg0, long arg1) {
        field4484++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            byte[] var6 = new byte[var3];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var3--;
                var6[var3] = class165.field2844[(int) (var7 - (arg1 * 37L))];
            }
            class128 var9 = new class128();
            var9.field2224 = var6;
            if (!arg0) {
                field4514 = (int[][]) ((int[][]) null);
            }
            var9.field2181 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)I", line = 475)
    public static final int method1828(int arg0, byte arg1) {
        field4498++;
        if (arg1 != -85) {
            field4513 = (class128) null;
        }
        return arg0 >>> 8;
    }
}
