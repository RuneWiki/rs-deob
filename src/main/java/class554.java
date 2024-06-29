import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class554 extends class747 {

    @OriginalMember(owner = "client!bd", name = "G", descriptor = "I")
    private int field7721 = 81;

    @OriginalMember(owner = "client!bd", name = "F", descriptor = "I")
    private int field7720 = 204;

    @OriginalMember(owner = "client!bd", name = "U", descriptor = "I")
    private int field7734 = 409;

    @OriginalMember(owner = "client!bd", name = "T", descriptor = "I")
    private int field7733 = 1024;

    @OriginalMember(owner = "client!bd", name = "X", descriptor = "I")
    private int field7737 = 4;

    @OriginalMember(owner = "client!bd", name = "L", descriptor = "I")
    private int field7726 = 0;

    @OriginalMember(owner = "client!bd", name = "W", descriptor = "I")
    private int field7736 = 1024;

    @OriginalMember(owner = "client!bd", name = "Y", descriptor = "I")
    private int field7738 = 8;

    @OriginalMember(owner = "client!bd", name = "K", descriptor = "J")
    public static long field7725 = 1L;

    @OriginalMember(owner = "client!bd", name = "R", descriptor = "Lmba;")
    public static class646 field7731 = new class646();

    @OriginalMember(owner = "client!bd", name = "E", descriptor = "I")
    private int field7719;

    @OriginalMember(owner = "client!bd", name = "H", descriptor = "I")
    private int field7722;

    @OriginalMember(owner = "client!bd", name = "I", descriptor = "I")
    public static int field7723;

    @OriginalMember(owner = "client!bd", name = "J", descriptor = "I")
    public static int field7724;

    @OriginalMember(owner = "client!bd", name = "P", descriptor = "I")
    public static int field7729;

    @OriginalMember(owner = "client!bd", name = "Q", descriptor = "I")
    public static int field7730;

    @OriginalMember(owner = "client!bd", name = "V", descriptor = "I")
    private int field7735;

    @OriginalMember(owner = "client!bd", name = "M", descriptor = "[I")
    private int[] field7727;

    @OriginalMember(owner = "client!bd", name = "N", descriptor = "[[I")
    private int[][] field7728;

    @OriginalMember(owner = "client!bd", name = "S", descriptor = "[[I")
    private int[][] field7732;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(Z)V", line = 8)
    public static void method3273(boolean arg0) {
        field7731 = null;
        if (!arg0) {
            field7731 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 209)
    public class554() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ldc;II)V", line = 23)
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field7729;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field7736 = arg0.method482(-772591672);
                                    }
                                } else {
                                    this.field7721 = arg0.method482(-772591672);
                                }
                            } else {
                                this.field7726 = arg0.method482(-772591672);
                            }
                        } else {
                            this.field7733 = arg0.method482(-772591672);
                        }
                    } else {
                        this.field7720 = arg0.method482(-772591672);
                    }
                } else {
                    this.field7734 = arg0.method482(-772591672);
                }
            } else {
                this.field7738 = arg0.method505((byte) -119);
            }
        } else {
            this.field7737 = arg0.method505((byte) -119);
        }
        if (arg1 != 11608) {
            this.field7737 = 90;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)[I", line = 109)
    public final int[] method182(int arg0, int arg1) {
        ++field7730;
        if (arg1 >= -89) {
            method3273(false);
        }
        int[] var3 = super.field10279.method3479(true, arg0);
        if (super.field10279.field8263) {
            int var4 = 0;
            int var5;
            for (var5 = class515.field7103[arg0] + this.field7726; ~var5 > -1; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field7738 && this.field7727[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (var4 & 1) == 0;
            int var8 = this.field7727[var4];
            int var9 = this.field7727[var4 + -1];
            if (var5 > var9 - -this.field7722 && ~(var8 - this.field7722) < ~var5) {
                for (int var10 = 0; ~var10 > ~class73.field1095; ++var10) {
                    int var11 = !var7 ? -this.field7733 : this.field7733;
                    int var12 = 0;
                    int var13;
                    for (var13 = (this.field7719 * var11 >> 12) + class639.field8571[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~this.field7737 < ~var12 && this.field7732[var6][var12] <= var13) {
                        ++var12;
                    }
                    int var14 = var12 + -1;
                    int var15 = this.field7732[var6][var12];
                    int var16 = this.field7732[var6][var14];
                    if (~(this.field7722 + var16) > ~var13 && -this.field7722 + var15 > var13) {
                        var3[var10] = this.field7728[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class245.method1648(var3, 0, class73.field1095, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(Z)V", line = 217)
    private final void method3274(boolean arg0) {
        ++field7724;
        Random var2 = new Random((long) this.field7738);
        this.field7722 = this.field7721 / 2;
        this.field7735 = 4096 / this.field7738;
        this.field7719 = 4096 / this.field7737;
        if (!arg0) {
            this.method183((class63) null, -107, -92);
        }
        int var3 = this.field7719 / 2;
        this.field7728 = new int[this.field7738][this.field7737];
        this.field7727 = new int[this.field7738 - -1];
        int var4 = this.field7735 / 2;
        this.field7732 = new int[this.field7738][this.field7737 - -1];
        this.field7727[0] = 0;
        for (int var5 = 0; this.field7738 > var5; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field7735;
                int var7 = (class434.method2677(4096, var2, (byte) -126) + -2048) * this.field7720 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field7727[var5] = this.field7727[var5 + -1] + var8;
            }
            this.field7732[var5][0] = 0;
            for (int var9 = 0; var9 < this.field7737; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field7719;
                    int var11 = (class434.method2677(4096, var2, (byte) -114) + -2048) * this.field7734 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field7732[var5][var9] = this.field7732[var5][var9 + -1] + var12;
                }
                this.field7728[var5][var9] = ~this.field7736 >= -1 ? 4096 : 4096 + -class434.method2677(this.field7736, var2, (byte) -115);
            }
            this.field7732[var5][this.field7737] = 4096;
        }
        this.field7727[this.field7738] = 4096;
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)V", line = 292)
    public final void method184(int arg0) {
        ++field7723;
        this.method3274(true);
        if (arg0 != -2) {
            this.field7727 = null;
        }
    }
}
