import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class611 extends class214 {

    @OriginalMember(owner = "client!eb", name = "L", descriptor = "I")
    private int field8610 = 204;

    @OriginalMember(owner = "client!eb", name = "K", descriptor = "I")
    private int field8609 = 8;

    @OriginalMember(owner = "client!eb", name = "I", descriptor = "I")
    private int field8607 = 1024;

    @OriginalMember(owner = "client!eb", name = "P", descriptor = "I")
    private int field8614 = 0;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "I")
    private int field8602 = 4;

    @OriginalMember(owner = "client!eb", name = "O", descriptor = "I")
    private int field8613 = 81;

    @OriginalMember(owner = "client!eb", name = "Q", descriptor = "I")
    private int field8615 = 409;

    @OriginalMember(owner = "client!eb", name = "H", descriptor = "I")
    private int field8606 = 1024;

    @OriginalMember(owner = "client!eb", name = "V", descriptor = "[I")
    public static int[] field8620 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    private int field8603;

    @OriginalMember(owner = "client!eb", name = "F", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!eb", name = "G", descriptor = "I")
    private int field8605;

    @OriginalMember(owner = "client!eb", name = "M", descriptor = "I")
    public static int field8611;

    @OriginalMember(owner = "client!eb", name = "N", descriptor = "I")
    private int field8612;

    @OriginalMember(owner = "client!eb", name = "R", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!eb", name = "T", descriptor = "I")
    public static int field8618;

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    public static int field8623;

    @OriginalMember(owner = "client!eb", name = "J", descriptor = "Lcl;")
    public static class746 field8608;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "[I")
    private int[] field8621;

    @OriginalMember(owner = "client!eb", name = "U", descriptor = "[Lit;")
    public static class34[] field8619;

    @OriginalMember(owner = "client!eb", name = "S", descriptor = "[[I")
    private int[][] field8617;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "[[I")
    private int[][] field8622;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(ILofa;I)V", line = 10)
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 <= 92) {
            this.method65(85);
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field8607 = arg1.method1989((byte) -109);
                                    }
                                } else {
                                    this.field8613 = arg1.method1989((byte) -51);
                                }
                            } else {
                                this.field8614 = arg1.method1989((byte) -63);
                            }
                        } else {
                            this.field8606 = arg1.method1989((byte) -105);
                        }
                    } else {
                        this.field8610 = arg1.method1989((byte) -55);
                    }
                } else {
                    this.field8615 = arg1.method1989((byte) -28);
                }
            } else {
                this.field8609 = arg1.method1987(-32);
            }
        } else {
            this.field8602 = arg1.method1987(-21);
        }
        ++field8604;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V", line = 96)
    public class611() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V", line = 100)
    public static void method3489(int arg0) {
        if (arg0 != 2) {
            method3489(69);
        }
        field8608 = null;
        field8619 = null;
        field8620 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)[I", line = 125)
    public final int[] method64(int arg0, byte arg1) {
        ++field8616;
        int[] var3 = super.field3544.method3869(arg0, -121);
        if (arg1 != 5) {
            this.method59(-82, (class301) null, 2);
        }
        if (super.field3544.field9836) {
            int var4 = 0;
            int var5;
            for (var5 = class131.field2138[arg0] + this.field8614; ~var5 > -1; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field8609 && ~var5 <= ~this.field8621[var4]) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(1 & var4) == -1;
            int var8 = this.field8621[var4];
            int var9 = this.field8621[var4 + -1];
            if (~(this.field8612 + var9) > ~var5 && var5 < -this.field8612 + var8) {
                for (int var10 = 0; var10 < class626.field8787; ++var10) {
                    int var11 = var7 ? this.field8606 : -this.field8606;
                    int var12 = 0;
                    int var13;
                    for (var13 = class592.field8328[var10] - -(this.field8605 * var11 >> 12); var13 < 0; var13 += 4096) {
                    }
                    while (~var13 < -4097) {
                        var13 -= 4096;
                    }
                    while (~this.field8602 < ~var12 && ~var13 <= ~this.field8622[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field8622[var6][var14];
                    int var16 = this.field8622[var6][var12];
                    if (~(this.field8612 + var15) > ~var13 && ~var13 > ~(-this.field8612 + var16)) {
                        var3[var10] = this.field8617[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class571.method3309(var3, 0, class626.field8787, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(I)V", line = 229)
    public final void method65(int arg0) {
        if (arg0 <= 48) {
            this.method3490(-75);
        }
        ++field8611;
        this.method3490(-83);
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)V", line = 246)
    private final void method3490(int arg0) {
        int var2 = -52 / ((11 - arg0) / 62);
        ++field8623;
        Random var3 = new Random((long) this.field8609);
        this.field8605 = 4096 / this.field8602;
        this.field8612 = this.field8613 / 2;
        this.field8603 = 4096 / this.field8609;
        int var4 = this.field8605 / 2;
        this.field8617 = new int[this.field8609][this.field8602];
        this.field8621 = new int[this.field8609 + 1];
        int var5 = this.field8603 / 2;
        this.field8622 = new int[this.field8609][this.field8602 - -1];
        this.field8621[0] = 0;
        for (int var6 = 0; this.field8609 > var6; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field8603;
                int var8 = (class721.method3975(4096, var3, false) - 2048) * this.field8610 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field8621[var6] = this.field8621[var6 + -1] + var9;
            }
            this.field8622[var6][0] = 0;
            for (int var10 = 0; ~this.field8602 < ~var10; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field8605;
                    int var12 = (class721.method3975(4096, var3, false) - 2048) * this.field8615 >> 12;
                    int var13 = (var4 * var12 >> 12) + var11;
                    this.field8622[var6][var10] = this.field8622[var6][var10 + -1] + var13;
                }
                this.field8617[var6][var10] = this.field8607 > 0 ? -class721.method3975(this.field8607, var3, false) + 4096 : 4096;
            }
            this.field8622[var6][this.field8602] = 4096;
        }
        this.field8621[this.field8609] = 4096;
    }
}
