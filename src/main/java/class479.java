import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class479 extends class585 {

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    private int field6722 = 0;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    private int field6727 = 8;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    private int field6726 = 4;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "I")
    private int field6731 = 81;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
    private int field6734 = 1024;

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    private int field6733 = 1024;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "I")
    private int field6728 = 409;

    @OriginalMember(owner = "client!gt", name = "Z", descriptor = "I")
    private int field6742 = 204;

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "Lbu;")
    public static class21 field6737 = new class21(12, 6);

    @OriginalMember(owner = "client!gt", name = "Y", descriptor = "I")
    public static int field6741 = 0;

    @OriginalMember(owner = "client!gt", name = "W", descriptor = "Z")
    public static boolean field6739 = false;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    private int field6721;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    private int field6723;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
    private int field6724;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!gt", name = "S", descriptor = "I")
    public static int field6735;

    @OriginalMember(owner = "client!gt", name = "V", descriptor = "I")
    public static int field6738;

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "[I")
    private int[] field6736;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "[[I")
    private int[][] field6729;

    @OriginalMember(owner = "client!gt", name = "X", descriptor = "[[I")
    private int[][] field6740;

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "()V", line = 4)
    public class479() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lso;II)V", line = 17)
    public final void method54(class494 arg0, int arg1, int arg2) {
        ++field6738;
        if (arg1 != 1) {
            this.method52(78);
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field6733 = arg0.method2998(true);
                                    }
                                } else {
                                    this.field6731 = arg0.method2998(true);
                                }
                            } else {
                                this.field6722 = arg0.method2998(true);
                            }
                        } else {
                            this.field6734 = arg0.method2998(true);
                        }
                    } else {
                        this.field6742 = arg0.method2998(true);
                    }
                } else {
                    this.field6728 = arg0.method2998(true);
                }
            } else {
                this.field6727 = arg0.method2964((byte) 38);
            }
        } else {
            this.field6726 = arg0.method2964((byte) 73);
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(B)V", line = 115)
    private final void method2855(byte arg0) {
        ++field6725;
        Random var2 = new Random((long) this.field6727);
        this.field6723 = 4096 / this.field6726;
        this.field6724 = this.field6731 / 2;
        this.field6721 = 4096 / this.field6727;
        int var3 = this.field6723 / 2;
        this.field6736 = new int[this.field6727 - -1];
        this.field6729 = new int[this.field6727][this.field6726];
        int var4 = 10 / ((arg0 - 55) / 37);
        this.field6740 = new int[this.field6727][this.field6726 - -1];
        int var5 = this.field6721 / 2;
        this.field6736[0] = 0;
        for (int var6 = 0; ~this.field6727 < ~var6; ++var6) {
            if (~var6 < -1) {
                int var7 = this.field6721;
                int var8 = (class7.method51(100, var2, 4096) - 2048) * this.field6742 >> 12;
                int var9 = (var5 * var8 >> 12) + var7;
                this.field6736[var6] = this.field6736[var6 + -1] + var9;
            }
            this.field6740[var6][0] = 0;
            for (int var10 = 0; ~var10 > ~this.field6726; ++var10) {
                if (~var10 < -1) {
                    int var11 = this.field6723;
                    int var12 = (class7.method51(-103, var2, 4096) + -2048) * this.field6728 >> 12;
                    int var13 = (var3 * var12 >> 12) + var11;
                    this.field6740[var6][var10] = this.field6740[var6][var10 + -1] + var13;
                }
                this.field6729[var6][var10] = this.field6733 <= 0 ? 4096 : -class7.method51(120, var2, this.field6733) + 4096;
            }
            this.field6740[var6][this.field6726] = 4096;
        }
        this.field6736[this.field6727] = 4096;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)V", line = 180)
    public final void method52(int arg0) {
        ++field6732;
        if (arg0 == -4096) {
            this.method2855((byte) 1);
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)V", line = 192)
    public static void method2856(int arg0) {
        field6737 = null;
        if (arg0 != -18588) {
            method2856(-79);
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(II)[I", line = 209)
    public final int[] method55(int arg0, int arg1) {
        ++field6730;
        int[] var3 = super.field8255.method1637(-29827, arg0);
        if (arg1 < 123) {
            this.method54((class494) null, 36, -38);
        }
        if (super.field8255.field3677) {
            int var4 = 0;
            int var5;
            for (var5 = class633.field8892[arg0] + this.field6722; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (this.field6727 > var4 && ~var5 <= ~this.field6736[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field6736[var4];
            int var9 = this.field6736[var4 - 1];
            if (this.field6724 + var9 < var5 && ~(var8 - this.field6724) < ~var5) {
                for (int var10 = 0; var10 < class293.field4278; ++var10) {
                    int var11 = var7 ? this.field6734 : -this.field6734;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field6723 * var11 >> 12) + class581.field8200[var10]; ~var13 > -1; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var12 > ~this.field6726 && var13 >= this.field6740[var6][var12]) {
                        ++var12;
                    }
                    int var14 = var12 - 1;
                    int var15 = this.field6740[var6][var12];
                    int var16 = this.field6740[var6][var14];
                    if (~(this.field6724 + var16) > ~var13 && ~(var15 - this.field6724) < ~var13) {
                        var3[var10] = this.field6729[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class595.method3470(var3, 0, class293.field4278, 0);
            }
        }
        return var3;
    }
}
