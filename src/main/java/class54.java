import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class54 extends class646 {

    @OriginalMember(owner = "client!gea", name = "U", descriptor = "I")
    private int field703 = 1024;

    @OriginalMember(owner = "client!gea", name = "T", descriptor = "I")
    private int field702 = 204;

    @OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
    private int field694 = 409;

    @OriginalMember(owner = "client!gea", name = "Q", descriptor = "I")
    private int field699 = 81;

    @OriginalMember(owner = "client!gea", name = "Z", descriptor = "I")
    private int field708 = 0;

    @OriginalMember(owner = "client!gea", name = "W", descriptor = "I")
    private int field705 = 4;

    @OriginalMember(owner = "client!gea", name = "X", descriptor = "I")
    private int field706 = 8;

    @OriginalMember(owner = "client!gea", name = "O", descriptor = "I")
    private int field697 = 1024;

    @OriginalMember(owner = "client!gea", name = "J", descriptor = "I")
    private int field693;

    @OriginalMember(owner = "client!gea", name = "P", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!gea", name = "R", descriptor = "I")
    public static int field700;

    @OriginalMember(owner = "client!gea", name = "S", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!gea", name = "V", descriptor = "I")
    private int field704;

    @OriginalMember(owner = "client!gea", name = "Y", descriptor = "I")
    private int field707;

    @OriginalMember(owner = "client!gea", name = "ab", descriptor = "I")
    public static int field709;

    @OriginalMember(owner = "client!gea", name = "bb", descriptor = "Z")
    public static boolean field710;

    @OriginalMember(owner = "client!gea", name = "L", descriptor = "[I")
    private int[] field695;

    @OriginalMember(owner = "client!gea", name = "I", descriptor = "[[I")
    private int[][] field692;

    @OriginalMember(owner = "client!gea", name = "M", descriptor = "[[I")
    private int[][] field696;

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V", line = 6)
    public class54() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gea", name = "c", descriptor = "(I)V", line = 17)
    public final void method422(int arg0) {
        this.method423(false);
        if (arg0 == -1) {
            ++field698;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(Z)V", line = 31)
    private final void method423(boolean arg0) {
        ++field700;
        Random var2 = new Random((long) this.field706);
        this.field693 = 4096 / this.field706;
        this.field707 = this.field699 / 2;
        this.field704 = 4096 / this.field705;
        int var3 = this.field704 / 2;
        if (!arg0) {
            int var4 = this.field693 / 2;
            this.field696 = new int[this.field706][this.field705];
            this.field695 = new int[this.field706 + 1];
            this.field692 = new int[this.field706][this.field705 - -1];
            this.field695[0] = 0;
            for (int var5 = 0; this.field706 > var5; ++var5) {
                if (var5 > 0) {
                    int var6 = this.field693;
                    int var7 = (-2048 + class357.method2154(var2, 4096, Integer.MIN_VALUE)) * this.field702 >> 12;
                    int var8 = (var4 * var7 >> 12) + var6;
                    this.field695[var5] = this.field695[var5 + -1] + var8;
                }
                this.field692[var5][0] = 0;
                for (int var9 = 0; ~this.field705 < ~var9; ++var9) {
                    if (var9 > 0) {
                        int var10 = this.field704;
                        int var11 = (class357.method2154(var2, 4096, Integer.MIN_VALUE) + -2048) * this.field694 >> 12;
                        int var12 = (var3 * var11 >> 12) + var10;
                        this.field692[var5][var9] = this.field692[var5][var9 + -1] + var12;
                    }
                    this.field696[var5][var9] = ~this.field697 < -1 ? -class357.method2154(var2, this.field697, Integer.MIN_VALUE) + 4096 : 4096;
                }
                this.field692[var5][this.field705] = 4096;
            }
            this.field695[this.field706] = 4096;
        }
    }

    @OriginalMember(owner = "client!gea", name = "b", descriptor = "(IB)[I", line = 94)
    public final int[] method424(int arg0, byte arg1) {
        ++field701;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (arg1 != -120) {
            this.field692 = null;
        }
        if (super.field9156.field5075) {
            int var4 = 0;
            int var5;
            for (var5 = class78.field1195[arg0] + this.field708; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field706 && this.field695[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field695[var4];
            int var9 = this.field695[var4 + -1];
            if (var5 > var9 - -this.field707 && ~(-this.field707 + var8) < ~var5) {
                for (int var10 = 0; ~var10 > ~class89.field1330; ++var10) {
                    int var11 = 0;
                    int var12 = !var7 ? -this.field703 : this.field703;
                    int var13;
                    for (var13 = class518.field7652[var10] - -(this.field704 * var12 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field705 > var11 && ~var13 <= ~this.field692[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field692[var6][var11];
                    int var16 = this.field692[var6][var14];
                    if (~var13 < ~(this.field707 + var16) && ~(var15 - this.field707) < ~var13) {
                        var3[var10] = this.field696[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class553.method3238(var3, 0, class89.field1330, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(Lek;IB)V", line = 220)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 == 7) {
                                        this.field697 = arg0.method2755((byte) -119);
                                    }
                                } else {
                                    this.field699 = arg0.method2755((byte) -121);
                                }
                            } else {
                                this.field708 = arg0.method2755((byte) -121);
                            }
                        } else {
                            this.field703 = arg0.method2755((byte) -61);
                        }
                    } else {
                        this.field702 = arg0.method2755((byte) -101);
                    }
                } else {
                    this.field694 = arg0.method2755((byte) -89);
                }
            } else {
                this.field706 = arg0.method2705(-126);
            }
        } else {
            this.field705 = arg0.method2705(-82);
        }
        if (arg2 < 7) {
            this.method295((class465) null, 114, (byte) -73);
        }
        ++field709;
    }
}
