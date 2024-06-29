import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ih")
public class class491 extends class354 {

    @OriginalMember(owner = "client!ih", name = "N", descriptor = "I")
    private int field7165 = 204;

    @OriginalMember(owner = "client!ih", name = "Q", descriptor = "I")
    private int field7168 = 4;

    @OriginalMember(owner = "client!ih", name = "U", descriptor = "I")
    private int field7172 = 409;

    @OriginalMember(owner = "client!ih", name = "P", descriptor = "I")
    private int field7167 = 81;

    @OriginalMember(owner = "client!ih", name = "M", descriptor = "I")
    private int field7164 = 1024;

    @OriginalMember(owner = "client!ih", name = "R", descriptor = "I")
    private int field7169 = 0;

    @OriginalMember(owner = "client!ih", name = "X", descriptor = "I")
    private int field7175 = 8;

    @OriginalMember(owner = "client!ih", name = "cb", descriptor = "I")
    private int field7180 = 1024;

    @OriginalMember(owner = "client!ih", name = "bb", descriptor = "[I")
    public static int[] field7179 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ih", name = "I", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!ih", name = "K", descriptor = "I")
    private int field7162;

    @OriginalMember(owner = "client!ih", name = "L", descriptor = "I")
    public static int field7163;

    @OriginalMember(owner = "client!ih", name = "O", descriptor = "I")
    public static int field7166;

    @OriginalMember(owner = "client!ih", name = "S", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!ih", name = "T", descriptor = "I")
    private int field7171;

    @OriginalMember(owner = "client!ih", name = "W", descriptor = "I")
    public static int field7174;

    @OriginalMember(owner = "client!ih", name = "Y", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!ih", name = "Z", descriptor = "I")
    private int field7177;

    @OriginalMember(owner = "client!ih", name = "ab", descriptor = "I")
    public static int field7178;

    @OriginalMember(owner = "client!ih", name = "J", descriptor = "[I")
    private int[] field7161;

    @OriginalMember(owner = "client!ih", name = "H", descriptor = "[[I")
    private int[][] field7159;

    @OriginalMember(owner = "client!ih", name = "V", descriptor = "[[I")
    private int[][] field7173;

    static {
        new class180("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(B)V", line = 3)
    public static void method2937(byte arg0) {
        if (arg0 == -115) {
            field7179 = null;
        }
    }

    @OriginalMember(owner = "client!ih", name = "<init>", descriptor = "()V", line = 15)
    public class491() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ih", name = "b", descriptor = "(IB)V", line = 18)
    public static final void method2938(int arg0, byte arg1) {
        class364 var2 = class248.field3579;
        synchronized (class248.field3579) {
            if (arg1 != -37) {
                return;
            }
            class248.field3579.method2348(arg0, -127);
        }
        ++field7178;
        class364 var3 = class87.field1449;
        synchronized (class87.field1449) {
            class87.field1449.method2348(arg0, -127);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(ILti;I)V", line = 35)
    public final void method206(int arg0, class303 arg1, int arg2) {
        ++field7160;
        if (arg0 != 15180) {
            this.field7172 = 66;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field7164 = arg1.method1868(arg0 + -15180);
                                    }
                                } else {
                                    this.field7167 = arg1.method1868(0);
                                }
                            } else {
                                this.field7169 = arg1.method1868(0);
                            }
                        } else {
                            this.field7180 = arg1.method1868(0);
                        }
                    } else {
                        this.field7165 = arg1.method1868(0);
                    }
                } else {
                    this.field7172 = arg1.method1868(0);
                }
            } else {
                this.field7175 = arg1.method1918((byte) 69);
            }
        } else {
            this.field7168 = arg1.method1918((byte) 75);
        }
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(IB)[I", line = 121)
    public final int[] method253(int arg0, byte arg1) {
        ++field7166;
        if (arg1 != -95) {
            this.field7165 = -77;
        }
        int[] var3 = super.field5357.method861(true, arg0);
        if (super.field5357.field1869) {
            int var4 = 0;
            int var5;
            for (var5 = class278.field4009[arg0] + this.field7169; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~this.field7175 < ~var4 && this.field7161[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field7161[var4];
            int var9 = this.field7161[var4 - 1];
            if (~(var9 - -this.field7162) > ~var5 && var5 < -this.field7162 + var8) {
                for (int var10 = 0; ~var10 > ~class404.field5952; ++var10) {
                    int var11 = var7 ? this.field7180 : -this.field7180;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field7171 * var11 >> 12) + class154.field2358[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var12 > ~this.field7168 && this.field7173[var6][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field7173[var6][var12];
                    int var16 = this.field7173[var6][var14];
                    if (var13 > var16 - -this.field7162 && ~(-this.field7162 + var15) < ~var13) {
                        var3[var10] = this.field7159[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class486.method2900(var3, 0, class404.field5952, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ih", name = "d", descriptor = "(B)V", line = 230)
    private final void method2939(byte arg0) {
        ++field7174;
        Random var2 = new Random((long) this.field7175);
        this.field7162 = this.field7167 / 2;
        this.field7171 = 4096 / this.field7168;
        this.field7177 = 4096 / this.field7175;
        int var3 = this.field7171 / 2;
        if (arg0 < 61) {
            this.field7161 = null;
        }
        this.field7173 = new int[this.field7175][this.field7168 - -1];
        this.field7159 = new int[this.field7175][this.field7168];
        this.field7161 = new int[this.field7175 + 1];
        int var4 = this.field7177 / 2;
        this.field7161[0] = 0;
        for (int var5 = 0; this.field7175 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field7177;
                int var7 = (-2048 + class104.method790((byte) 90, 4096, var2)) * this.field7165 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field7161[var5] = this.field7161[var5 + -1] + var8;
            }
            this.field7173[var5][0] = 0;
            for (int var9 = 0; ~this.field7168 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field7171;
                    int var11 = (class104.method790((byte) 90, 4096, var2) - 2048) * this.field7172 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field7173[var5][var9] = this.field7173[var5][var9 + -1] - -var12;
                }
                this.field7159[var5][var9] = ~this.field7164 >= -1 ? 4096 : -class104.method790((byte) 90, this.field7164, var2) + 4096;
            }
            this.field7173[var5][this.field7168] = 4096;
        }
        this.field7161[this.field7175] = 4096;
    }

    @OriginalMember(owner = "client!ih", name = "a", descriptor = "(Z)V", line = 307)
    public final void method771(boolean arg0) {
        if (arg0) {
            this.field7161 = null;
        }
        ++field7170;
        this.method2939((byte) 65);
    }

    @OriginalMember(owner = "client!ih", name = "c", descriptor = "(IB)V", line = 318)
    public static final void method2940(int arg0, byte arg1) {
        ++field7176;
        class364 var2 = class510.field7486;
        synchronized (class510.field7486) {
            if (arg1 > -74) {
                method2938(-62, (byte) 82);
            }
            class510.field7486.method2348(arg0, 115);
        }
    }
}
