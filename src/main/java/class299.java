import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class299 extends class195 {

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    private int field5034 = 81;

    @OriginalMember(owner = "client!dh", name = "Z", descriptor = "I")
    private int field5036 = 0;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "I")
    private int field5032 = 1024;

    @OriginalMember(owner = "client!dh", name = "cb", descriptor = "I")
    private int field5039 = 409;

    @OriginalMember(owner = "client!dh", name = "lb", descriptor = "I")
    private int field5048 = 1024;

    @OriginalMember(owner = "client!dh", name = "jb", descriptor = "I")
    private int field5046 = 8;

    @OriginalMember(owner = "client!dh", name = "nb", descriptor = "I")
    private int field5050 = 204;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "I")
    private int field5031 = 4;

    @OriginalMember(owner = "client!dh", name = "bb", descriptor = "J")
    public static long field5038 = 0L;

    @OriginalMember(owner = "client!dh", name = "mb", descriptor = "Ldj;")
    public static class153 field5049 = new class153();

    @OriginalMember(owner = "client!dh", name = "sb", descriptor = "Lck;")
    public static class119 field5055 = class298.method1987((byte) 43, "hitbar_default");

    @OriginalMember(owner = "client!dh", name = "pb", descriptor = "Luj;")
    public static class156 field5052 = new class156();

    @OriginalMember(owner = "client!dh", name = "ab", descriptor = "I")
    private int field5037;

    @OriginalMember(owner = "client!dh", name = "db", descriptor = "I")
    private int field5040;

    @OriginalMember(owner = "client!dh", name = "eb", descriptor = "I")
    public static int field5041;

    @OriginalMember(owner = "client!dh", name = "fb", descriptor = "I")
    public static int field5042;

    @OriginalMember(owner = "client!dh", name = "gb", descriptor = "I")
    public static int field5043;

    @OriginalMember(owner = "client!dh", name = "hb", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!dh", name = "ib", descriptor = "I")
    public static int field5045;

    @OriginalMember(owner = "client!dh", name = "ob", descriptor = "I")
    public static int field5051;

    @OriginalMember(owner = "client!dh", name = "qb", descriptor = "I")
    private int field5053;

    @OriginalMember(owner = "client!dh", name = "rb", descriptor = "I")
    public static int field5054;

    @OriginalMember(owner = "client!dh", name = "tb", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "[I")
    private int[] field5033;

    @OriginalMember(owner = "client!dh", name = "Y", descriptor = "[[I")
    private int[][] field5035;

    @OriginalMember(owner = "client!dh", name = "kb", descriptor = "[[I")
    private int[][] field5047;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Lfj;II)V", line = 29)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field5031 = arg0.method64((byte) -115);
        } else if (arg2 == 1) {
            this.field5046 = arg0.method64((byte) 11);
        } else if (arg2 == 2) {
            this.field5039 = arg0.method63((byte) 1);
        } else if (arg2 == 3) {
            this.field5050 = arg0.method63((byte) 1);
        } else if (arg2 == 4) {
            this.field5048 = arg0.method63((byte) 1);
        } else if (arg2 == 5) {
            this.field5036 = arg0.method63((byte) 1);
        } else if (arg2 == 6) {
            this.field5034 = arg0.method63((byte) 1);
        } else if (arg2 == 7) {
            this.field5032 = arg0.method63((byte) 1);
        }
        if (arg1 > -117) {
            this.method13((class3) null, -60, -34);
        }
        field5045++;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZIJ)Lck;", line = 93)
    public static final class119 method1993(int arg0, boolean arg1, int arg2, long arg3) {
        field5041++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        }
        int var5 = 37 / ((arg2 - 52) / 36);
        int var6 = 1;
        for (long var7 = arg3 / (long) arg0; var7 != 0L; var7 /= (long) arg0) {
            var6++;
        }
        int var9 = var6;
        if (arg3 < 0L || arg1) {
            var9 = var6 + 1;
        }
        byte[] var10 = new byte[var9];
        if (arg3 < 0L) {
            var10[0] = 45;
        } else if (arg1) {
            var10[0] = 43;
        }
        for (int var11 = 0; var11 < var6; var11++) {
            int var12 = (int) (arg3 % (long) arg0);
            if (var12 < 0) {
                var12 = -var12;
            }
            if (var12 > 9) {
                var12 += 39;
            }
            var10[var9 - var11 - 1] = (byte) (var12 + 48);
            arg3 /= (long) arg0;
        }
        class119 var13 = new class119();
        var13.field1825 = var9;
        var13.field1838 = var10;
        return var13;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "([BI)[B", line = 153)
    public static final byte[] method1994(byte[] arg0, int arg1) {
        if (arg1 != 9) {
            field5052 = (class156) null;
        }
        field5056++;
        class3 var2 = new class3(arg0);
        int var3 = var2.method64((byte) 68);
        int var4 = var2.method71(arg1 - 668527057);
        if (var4 < 0 || !(class233.field3765 == 0 || var4 <= class233.field3765)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method53(var7, 33, 0, var4);
            return var7;
        } else {
            int var5 = var2.method71(-668527048);
            if (var5 < 0 || class233.field3765 != 0 && class233.field3765 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class225.method1431(var6, var5, arg0, var4, 9);
            } else {
                class227.field3640.method433(true, var2, var6);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "()V", line = 483)
    public class299() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZ)[I", line = 217)
    public final int[] method11(int arg0, boolean arg1) {
        if (arg1) {
            this.field5046 = 85;
        }
        int[] var3 = this.field3106.method924(100, arg0);
        field5054++;
        if (this.field3106.field2260) {
            int var4 = 0;
            int var5;
            for (var5 = class215.field3424[arg0] + this.field5036; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field5046 > var4 && var5 >= this.field5033[var4]) {
                var4++;
            }
            int var6 = var4 - 1;
            boolean var7 = (var4 & 0x1) == 0;
            int var8 = this.field5033[var4 - 1];
            int var9 = this.field5033[var4];
            if (var5 > this.field5053 + var8 && var5 < var9 - this.field5053) {
                for (int var10 = 0; var10 < class157.field2504; var10++) {
                    int var11 = 0;
                    int var12 = var7 ? this.field5048 : -this.field5048;
                    int var13;
                    for (var13 = (this.field5040 * var12 >> 12) + class157.field2505[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field5031 > var11 && this.field5035[var6][var11] <= var13) {
                        var11++;
                    }
                    int var14 = this.field5035[var6][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field5035[var6][var15];
                    if (this.field5053 + var16 < var13 && (var14 - this.field5053) > var13) {
                        var3[var10] = this.field5047[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class213.method1340(var3, 0, class157.field2504, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IIBIIIII)V", line = 328)
    public static final void method1995(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5042++;
        int var8 = class197.method1264(-100, arg4, class108.field1650, class236.field3800);
        int var9 = class197.method1264(-95, arg5, class108.field1650, class236.field3800);
        int var10 = class197.method1264(-101, arg0, class79.field1226, class59.field957);
        int var11 = class197.method1264(-92, arg1, class79.field1226, class59.field957);
        int var12 = class197.method1264(-122, arg4 + arg6, class108.field1650, class236.field3800);
        int var13 = class197.method1264(-121, arg5 - arg6, class108.field1650, class236.field3800);
        for (int var14 = var8; var14 < var12; var14++) {
            class36.method282(var11, var10, arg3, class256.field4113[var14], 26175);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class36.method282(var11, var10, arg3, class256.field4113[var15], 26175);
        }
        if (arg2 < 75) {
            return;
        }
        int var16 = class197.method1264(-93, arg0 + arg6, class79.field1226, class59.field957);
        int var17 = class197.method1264(-92, arg1 - arg6, class79.field1226, class59.field957);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class256.field4113[var18];
            class36.method282(var16, var10, arg3, var19, 26175);
            class36.method282(var17, var16, arg7, var19, 26175);
            class36.method282(var11, var17, arg3, var19, 26175);
        }
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(I)V", line = 394)
    private final void method1996(int arg0) {
        field5051++;
        Random var2 = new Random((long) this.field5046);
        this.field5033 = new int[this.field5046 + 1];
        this.field5037 = 4096 / this.field5046;
        this.field5033[0] = 0;
        this.field5047 = new int[this.field5046][this.field5031];
        this.field5035 = new int[this.field5046][this.field5031 + 1];
        int var3 = this.field5037 / 2;
        this.field5040 = 4096 / this.field5031;
        this.field5053 = this.field5034 / 2;
        int var4 = this.field5040 / 2;
        for (int var5 = 0; var5 < this.field5046; var5++) {
            if (var5 > 0) {
                int var6 = this.field5037;
                int var7 = (class44.method342(4096, var2, 0) - 2048) * this.field5050 >> 12;
                int var8 = (var3 * var7 >> 12) + var6;
                this.field5033[var5] = this.field5033[var5 - 1] + var8;
            }
            this.field5035[var5][0] = 0;
            for (int var9 = 0; var9 < this.field5031; var9++) {
                if (var9 > 0) {
                    int var10 = this.field5040;
                    int var11 = (class44.method342(4096, var2, 0) - 2048) * this.field5039 >> 12;
                    int var12 = (var4 * var11 >> 12) + var10;
                    this.field5035[var5][var9] = this.field5035[var5][var9 - 1] + var12;
                }
                this.field5047[var5][var9] = this.field5032 <= 0 ? 4096 : 4096 - class44.method342(this.field5032, var2, 0);
            }
            this.field5035[var5][this.field5031] = 4096;
        }
        if (arg0 < 113) {
            this.field5037 = 108;
        }
        this.field5033[this.field5046] = 4096;
    }

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(I)V", line = 491)
    public final void method14(int arg0) {
        this.method1996(arg0 - 2048879247);
        if (arg0 == 2048879374) {
            field5044++;
        }
    }

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "(I)V", line = 506)
    public static void method1997(int arg0) {
        field5049 = null;
        if (arg0 == -1) {
            field5052 = null;
            field5055 = null;
        }
    }
}
