import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class13 extends class304 {

    @OriginalMember(owner = "client!nc", name = "X", descriptor = "I")
    private int field167 = 81;

    @OriginalMember(owner = "client!nc", name = "Z", descriptor = "I")
    private int field169 = 1024;

    @OriginalMember(owner = "client!nc", name = "S", descriptor = "I")
    private int field162 = 8;

    @OriginalMember(owner = "client!nc", name = "ab", descriptor = "I")
    private int field170 = 0;

    @OriginalMember(owner = "client!nc", name = "nb", descriptor = "I")
    private int field183 = 4;

    @OriginalMember(owner = "client!nc", name = "ib", descriptor = "I")
    private int field178 = 204;

    @OriginalMember(owner = "client!nc", name = "ob", descriptor = "I")
    private int field184 = 409;

    @OriginalMember(owner = "client!nc", name = "lb", descriptor = "I")
    private int field181 = 1024;

    @OriginalMember(owner = "client!nc", name = "eb", descriptor = "[I")
    public static int[] field174 = new int[2];

    @OriginalMember(owner = "client!nc", name = "T", descriptor = "[I")
    public static int[] field163 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!nc", name = "Q", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client!nc", name = "R", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!nc", name = "W", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!nc", name = "Y", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!nc", name = "bb", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!nc", name = "cb", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!nc", name = "fb", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!nc", name = "gb", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!nc", name = "hb", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!nc", name = "mb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!nc", name = "pb", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!nc", name = "qb", descriptor = "Ljb;")
    public static class218 field186;

    @OriginalMember(owner = "client!nc", name = "V", descriptor = "[I")
    public static int[] field165;

    @OriginalMember(owner = "client!nc", name = "kb", descriptor = "[I")
    private int[] field180;

    @OriginalMember(owner = "client!nc", name = "U", descriptor = "[[I")
    private int[][] field164;

    @OriginalMember(owner = "client!nc", name = "db", descriptor = "[[I")
    private int[][] field173;

    @OriginalMember(owner = "client!nc", name = "jb", descriptor = "[[[B")
    public static byte[][][] field179;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lwm;II)V", line = 35)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field183 = arg0.method1774((byte) 16);
        } else if (arg1 == 1) {
            this.field162 = arg0.method1774((byte) -128);
        } else if (arg1 == 2) {
            this.field184 = arg0.method1755(false);
        } else if (arg1 == 3) {
            this.field178 = arg0.method1755(false);
        } else if (arg1 == 4) {
            this.field181 = arg0.method1755(false);
        } else if (arg1 == 5) {
            this.field170 = arg0.method1755(false);
        } else if (arg1 == 6) {
            this.field167 = arg0.method1755(false);
        } else if (arg1 == 7) {
            this.field169 = arg0.method1755(false);
        }
        if (arg2 != -2828) {
            method99((byte) 77, -34);
        }
        field161++;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V", line = 107)
    public class13() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)[I", line = 111)
    public final int[] method71(int arg0, int arg1) {
        field176++;
        if (arg0 != 7) {
            return (int[]) null;
        }
        int[] var3 = this.field4669.method2342(-28750, arg1);
        if (this.field4669.field5223) {
            int var4;
            for (var4 = class84.field1225[arg1] + this.field170; var4 < 0; var4 += 4096) {
            }
            int var5 = 0;
            while (var4 > 4096) {
                var4 -= 4096;
            }
            while (this.field162 > var5 && var4 >= this.field180[var5]) {
                var5++;
            }
            int var6 = var5 - 1;
            int var7 = this.field180[var5];
            boolean var8 = (var5 & 0x1) == 0;
            int var9 = this.field180[var5 - 1];
            if (var4 > (this.field182 + var9) && var4 < (var7 - this.field182)) {
                for (int var10 = 0; var10 < class218.field3333; var10++) {
                    int var11 = 0;
                    int var12 = var8 ? this.field181 : -this.field181;
                    int var13;
                    for (var13 = (this.field185 * var12 >> 12) + class162.field2631[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field183 > var11 && this.field173[var6][var11] <= var13) {
                        var11++;
                    }
                    int var14 = this.field173[var6][var11];
                    int var15 = var11 - 1;
                    int var16 = this.field173[var6][var15];
                    if (this.field182 + var16 < var13 && var14 - this.field182 > var13) {
                        var3[var10] = this.field164[var6][var15];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class126.method946(var3, 0, class218.field3333, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)V", line = 211)
    public static final void method98(int arg0, int arg1) {
        field171++;
        if (class154.method1161(arg1, 121)) {
            class196.method1434(class8.field128[arg1], -1, (byte) -10);
            if (arg0 != -17099) {
                method102(25, (class305) null);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(BI)V", line = 228)
    public static final void method99(byte arg0, int arg1) {
        class302.field4627.method741(arg1, (byte) -52);
        field168++;
        class129.field1969.method741(arg1, (byte) -75);
        if (arg0 != 95) {
            method98(10, 58);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V", line = 243)
    public final void method100(boolean arg0) {
        this.method103((byte) 111);
        field166++;
        if (!arg0) {
            this.method100(true);
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(B)V", line = 257)
    public static void method101(byte arg0) {
        field179 = (byte[][][]) null;
        field174 = null;
        field163 = null;
        field165 = null;
        field186 = null;
        if (arg0 != 36) {
            field165 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(ILt;)V", line = 286)
    public static final void method102(int arg0, class305 arg1) {
        if (class233.field3542 == arg1.field4748 || arg1.field4707 == -1 || arg1.field4684 != 0 || arg1.field4699 + 1 > client.method1010(arg1.field4707, (byte) 116).field328[arg1.field4727]) {
            int var2 = arg1.field4748 - arg1.field4746;
            int var3 = class233.field3542 - arg1.field4746;
            int var4 = arg1.field4771 * 128 + (arg1.method1897(8) * 64);
            int var5 = arg1.field4725 * 128 + (arg1.method1897(arg0 - 56) * 64);
            int var6 = arg1.field4688 * 128 + arg1.method1897(8) * 64;
            int var7 = arg1.field4749 * 128 + arg1.method1897(8) * 64;
            arg1.field4731 = ((var2 - var3) * var5 + var3 * var7) / var2;
            arg1.field4713 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        field177++;
        arg1.field4764 = 0;
        if (arg0 != 64) {
            return;
        }
        if (arg1.field4756 == 0) {
            arg1.field4674 = 1024;
        }
        if (arg1.field4756 == 1) {
            arg1.field4674 = 1536;
        }
        if (arg1.field4756 == 2) {
            arg1.field4674 = 0;
        }
        if (arg1.field4756 == 3) {
            arg1.field4674 = 512;
        }
        arg1.field4682 = arg1.field4674;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(B)V", line = 329)
    private final void method103(byte arg0) {
        field172++;
        Random var2 = new Random((long) this.field162);
        this.field185 = 4096 / this.field183;
        this.field164 = new int[this.field162][this.field183];
        int var3 = this.field185 / 2;
        this.field182 = this.field167 / 2;
        this.field160 = 4096 / this.field162;
        this.field173 = new int[this.field162][this.field183 + 1];
        this.field180 = new int[this.field162 + 1];
        this.field180[0] = 0;
        int var4 = this.field160 / 2;
        for (int var5 = 0; var5 < this.field162; var5++) {
            if (var5 > 0) {
                int var6 = this.field160;
                int var7 = (class101.method764(4096, (byte) 121, var2) - 2048) * this.field178 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field180[var5] = this.field180[var5 - 1] + var8;
            }
            this.field173[var5][0] = 0;
            for (int var9 = 0; var9 < this.field183; var9++) {
                if (var9 > 0) {
                    int var10 = this.field185;
                    int var11 = (class101.method764(4096, (byte) 121, var2) - 2048) * this.field184 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field173[var5][var9] = this.field173[var5][var9 - 1] + var12;
                }
                this.field164[var5][var9] = this.field169 > 0 ? 4096 - class101.method764(this.field169, (byte) 121, var2) : 4096;
            }
            this.field173[var5][this.field183] = 4096;
        }
        int var13 = -40 % ((arg0 + 32) / 58);
        this.field180[this.field162] = 4096;
    }
}
