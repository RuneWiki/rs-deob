import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class338 extends class202 {

    @OriginalMember(owner = "client!qp", name = "K", descriptor = "I")
    private int field5265 = 409;

    @OriginalMember(owner = "client!qp", name = "P", descriptor = "I")
    private int field5270 = 1024;

    @OriginalMember(owner = "client!qp", name = "Q", descriptor = "I")
    private int field5271 = 1024;

    @OriginalMember(owner = "client!qp", name = "I", descriptor = "I")
    private int field5264 = 204;

    @OriginalMember(owner = "client!qp", name = "X", descriptor = "I")
    private int field5277 = 81;

    @OriginalMember(owner = "client!qp", name = "W", descriptor = "I")
    private int field5276 = 0;

    @OriginalMember(owner = "client!qp", name = "Y", descriptor = "I")
    private int field5278 = 4;

    @OriginalMember(owner = "client!qp", name = "O", descriptor = "I")
    private int field5269 = 8;

    @OriginalMember(owner = "client!qp", name = "L", descriptor = "I")
    private int field5266;

    @OriginalMember(owner = "client!qp", name = "M", descriptor = "I")
    public static int field5267;

    @OriginalMember(owner = "client!qp", name = "N", descriptor = "I")
    private int field5268;

    @OriginalMember(owner = "client!qp", name = "S", descriptor = "I")
    private int field5272;

    @OriginalMember(owner = "client!qp", name = "T", descriptor = "I")
    public static int field5273;

    @OriginalMember(owner = "client!qp", name = "V", descriptor = "I")
    public static int field5275;

    @OriginalMember(owner = "client!qp", name = "ab", descriptor = "I")
    public static int field5280;

    @OriginalMember(owner = "client!qp", name = "cb", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!qp", name = "bb", descriptor = "Lgl;")
    public static class440 field5281;

    @OriginalMember(owner = "client!qp", name = "U", descriptor = "[I")
    private int[] field5274;

    @OriginalMember(owner = "client!qp", name = "Z", descriptor = "[[I")
    private int[][] field5279;

    @OriginalMember(owner = "client!qp", name = "db", descriptor = "[[I")
    private int[][] field5283;

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(B)V")
    private final void method2241(byte arg0) {
        ++field5282;
        Random var2 = new Random((long) this.field5269);
        this.field5266 = 4096 / this.field5269;
        this.field5272 = 4096 / this.field5278;
        this.field5268 = this.field5277 / 2;
        int var3 = this.field5272 / 2;
        this.field5279 = new int[this.field5269][this.field5278 + 1];
        this.field5283 = new int[this.field5269][this.field5278];
        this.field5274 = new int[this.field5269 - -1];
        int var4 = this.field5266 / 2;
        this.field5274[0] = 0;
        if (arg0 != -108) {
            this.field5279 = null;
        }
        for (int var5 = 0; var5 < this.field5269; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field5266;
                int var7 = (class167.method1057(-3481, var2, 4096) - 2048) * this.field5264 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field5274[var5] = this.field5274[var5 + -1] - -var8;
            }
            this.field5279[var5][0] = 0;
            for (int var9 = 0; ~var9 > ~this.field5278; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field5272;
                    int var11 = (class167.method1057(-3481, var2, 4096) - 2048) * this.field5265 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field5279[var5][var9] = this.field5279[var5][var9 - 1] + var12;
                }
                this.field5283[var5][var9] = this.field5270 <= 0 ? 4096 : -class167.method1057(-3481, var2, this.field5270) + 4096;
            }
            this.field5279[var5][this.field5278] = 4096;
        }
        this.field5274[this.field5269] = 4096;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)V")
    public final void method51(int arg0) {
        int var2 = 109 / ((arg0 - 80) / 46);
        this.method2241((byte) -108);
        ++field5267;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field5273;
        if (!arg1) {
            this.field5277 = -56;
        }
        int[] var3 = super.field3064.method2452((byte) 82, arg0);
        if (super.field3064.field5837) {
            int var4 = 0;
            int var5;
            for (var5 = class521.field7716[arg0] + this.field5276; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (this.field5269 > var4 && ~this.field5274[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field5274[var4];
            int var9 = this.field5274[var4 + -1];
            if (~var5 < ~(this.field5268 + var9) && ~var5 > ~(-this.field5268 + var8)) {
                for (int var10 = 0; var10 < class276.field4375; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field5271 : -this.field5271;
                    int var13;
                    for (var13 = (this.field5272 * var12 >> 12) + class476.field7271[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field5278 && ~var13 <= ~this.field5279[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field5279[var6][var11];
                    int var16 = this.field5279[var6][var14];
                    if (~(var16 - -this.field5268) > ~var13 && -this.field5268 + var15 > var13) {
                        var3[var10] = this.field5283[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class324.method2167(var3, 0, class276.field4375, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "()V")
    public class338() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "(I)V")
    public static void method2242(int arg0) {
        field5281 = null;
        if (arg0 != 4096) {
            method2243(false, -83, -127, -54);
        }
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 == 7) {
                                        this.field5270 = arg0.method1455(-3387);
                                    }
                                } else {
                                    this.field5277 = arg0.method1455(-3387);
                                }
                            } else {
                                this.field5276 = arg0.method1455(-3387);
                            }
                        } else {
                            this.field5271 = arg0.method1455(-3387);
                        }
                    } else {
                        this.field5264 = arg0.method1455(-3387);
                    }
                } else {
                    this.field5265 = arg0.method1455(-3387);
                }
            } else {
                this.field5269 = arg0.method1445(-116);
            }
        } else {
            this.field5278 = arg0.method1445(-105);
        }
        int var5 = 11 / ((-46 - arg1) / 50);
        ++field5275;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ZIII)Ljava/lang/String;")
    public static final String method2243(boolean arg0, int arg1, int arg2, int arg3) {
        ++field5280;
        if (arg1 >= 2 && arg1 <= 36) {
            if (arg0 && arg2 >= 0) {
                int var4 = 2;
                int var5 = arg2 / arg1;
                while (~var5 != -1) {
                    var5 /= arg1;
                    ++var4;
                }
                char[] var6 = new char[var4];
                var6[arg3] = '+';
                for (int var7 = var4 + -1; ~var7 < -1; --var7) {
                    int var8 = arg2;
                    arg2 /= arg1;
                    int var9 = var8 - arg1 * arg2;
                    if (~var9 <= -11) {
                        var6[var7] = (char) (var9 + 87);
                    } else {
                        var6[var7] = (char) (var9 + 48);
                    }
                }
                return new String(var6);
            } else {
                return Integer.toString(arg2, arg1);
            }
        } else {
            throw new IllegalArgumentException("Invalid radix:" + arg1);
        }
    }

    static {
        new class213("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
    }
}
