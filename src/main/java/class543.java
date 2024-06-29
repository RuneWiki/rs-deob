import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class543 extends class175 {

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    private int field7503 = 204;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
    private int field7509 = 4;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    private int field7508 = 8;

    @OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
    private int field7517 = 0;

    @OriginalMember(owner = "client!fo", name = "W", descriptor = "I")
    private int field7519 = 81;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    private int field7506 = 1024;

    @OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
    private int field7516 = 1024;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
    private int field7513 = 409;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field7512 = new String[100];

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    private int field7505;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    private int field7507;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "I")
    public static int field7511;

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
    public static int field7515;

    @OriginalMember(owner = "client!fo", name = "V", descriptor = "I")
    private int field7518;

    @OriginalMember(owner = "client!fo", name = "X", descriptor = "I")
    public static int field7520;

    @OriginalMember(owner = "client!fo", name = "Y", descriptor = "I")
    public static int field7521;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "[I")
    private int[] field7510;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "[[I")
    private int[][] field7502;

    @OriginalMember(owner = "client!fo", name = "Q", descriptor = "[[I")
    private int[][] field7514;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (arg0 == 7) {
                                        this.field7516 = arg1.method1728((byte) 64);
                                    }
                                } else {
                                    this.field7519 = arg1.method1728((byte) 48);
                                }
                            } else {
                                this.field7517 = arg1.method1728((byte) 83);
                            }
                        } else {
                            this.field7506 = arg1.method1728((byte) 4);
                        }
                    } else {
                        this.field7503 = arg1.method1728((byte) 121);
                    }
                } else {
                    this.field7513 = arg1.method1728((byte) 126);
                }
            } else {
                this.field7508 = arg1.method1731((byte) 64);
            }
        } else {
            this.field7509 = arg1.method1731((byte) 64);
        }
        if (arg2) {
            this.field7513 = -29;
        }
        ++field7504;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field7520;
        if (!arg0) {
            this.method46(-54);
        }
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int var4 = 0;
            int var5;
            for (var5 = class456.field6536[arg1] + this.field7517; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field7508 && ~this.field7510[var4] >= ~var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field7510[var4];
            int var9 = this.field7510[var4 + -1];
            if (var9 - -this.field7505 < var5 && var5 < var8 - this.field7505) {
                for (int var10 = 0; ~class598.field8136 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field7506 : this.field7506;
                    int var13;
                    for (var13 = (this.field7507 * var12 >> 12) + class693.field9221[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~this.field7509 < ~var11 && ~var13 <= ~this.field7514[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field7514[var6][var11];
                    int var16 = this.field7514[var6][var14];
                    if (~var13 < ~(this.field7505 + var16) && var13 < -this.field7505 + var15) {
                        var3[var10] = this.field7502[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class421.method2532(var3, 0, class598.field8136, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        this.method3136(-590986612);
        ++field7511;
        if (arg0 != -8) {
            this.method3136(41);
        }
    }

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "(I)V")
    public static void method3135(int arg0) {
        if (arg0 >= -48) {
            method3135(12);
        }
        field7512 = null;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V")
    public class543() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "(I)V")
    private final void method3136(int arg0) {
        ++field7521;
        Random var2 = new Random((long) this.field7508);
        this.field7505 = this.field7519 / 2;
        this.field7518 = 4096 / this.field7508;
        this.field7507 = 4096 / this.field7509;
        int var3 = this.field7507 / 2;
        this.field7510 = new int[this.field7508 + 1];
        this.field7502 = new int[this.field7508][this.field7509];
        this.field7514 = new int[this.field7508][this.field7509 + 1];
        int var4 = this.field7518 / 2;
        this.field7510[0] = 0;
        for (int var5 = 0; this.field7508 > var5; ++var5) {
            if (var5 > 0) {
                int var6 = this.field7518;
                int var7 = (-2048 + class594.method3335(4096, false, var2)) * this.field7503 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field7510[var5] = this.field7510[var5 + -1] + var8;
            }
            this.field7514[var5][0] = 0;
            for (int var9 = 0; this.field7509 > var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field7507;
                    int var11 = (-2048 + class594.method3335(4096, false, var2)) * this.field7513 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field7514[var5][var9] = this.field7514[var5][var9 + -1] + var12;
                }
                this.field7502[var5][var9] = ~this.field7516 < -1 ? -class594.method3335(this.field7516, false, var2) + 4096 : 4096;
            }
            this.field7514[var5][this.field7509] = 4096;
        }
        if (arg0 == -590986612) {
            this.field7510[this.field7508] = 4096;
        }
    }
}
