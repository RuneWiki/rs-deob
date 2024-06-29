import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class632 extends class5 {

    @OriginalMember(owner = "client!oea", name = "J", descriptor = "I")
    private int field8857 = 204;

    @OriginalMember(owner = "client!oea", name = "L", descriptor = "I")
    private int field8859 = 1024;

    @OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
    private int field8858 = 81;

    @OriginalMember(owner = "client!oea", name = "M", descriptor = "I")
    private int field8860 = 1024;

    @OriginalMember(owner = "client!oea", name = "N", descriptor = "I")
    private int field8861 = 8;

    @OriginalMember(owner = "client!oea", name = "Y", descriptor = "I")
    private int field8871 = 409;

    @OriginalMember(owner = "client!oea", name = "P", descriptor = "I")
    private int field8863 = 0;

    @OriginalMember(owner = "client!oea", name = "I", descriptor = "I")
    private int field8856 = 4;

    @OriginalMember(owner = "client!oea", name = "cb", descriptor = "Llt;")
    public static class273 field8875 = new class273();

    @OriginalMember(owner = "client!oea", name = "fb", descriptor = "Lfca;")
    public static class139 field8878 = new class139();

    @OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
    public static int field8855;

    @OriginalMember(owner = "client!oea", name = "O", descriptor = "I")
    private int field8862;

    @OriginalMember(owner = "client!oea", name = "Q", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!oea", name = "R", descriptor = "I")
    private int field8865;

    @OriginalMember(owner = "client!oea", name = "S", descriptor = "I")
    public static int field8866;

    @OriginalMember(owner = "client!oea", name = "T", descriptor = "I")
    public static int field8867;

    @OriginalMember(owner = "client!oea", name = "U", descriptor = "I")
    private int field8868;

    @OriginalMember(owner = "client!oea", name = "X", descriptor = "I")
    public static int field8870;

    @OriginalMember(owner = "client!oea", name = "ab", descriptor = "I")
    public static int field8873;

    @OriginalMember(owner = "client!oea", name = "bb", descriptor = "I")
    public static int field8874;

    @OriginalMember(owner = "client!oea", name = "db", descriptor = "I")
    public static int field8876;

    @OriginalMember(owner = "client!oea", name = "eb", descriptor = "[I")
    private int[] field8877;

    @OriginalMember(owner = "client!oea", name = "V", descriptor = "[[I")
    private int[][] field8869;

    @OriginalMember(owner = "client!oea", name = "Z", descriptor = "[[I")
    private int[][] field8872;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(ILes;I)V", line = 4)
    public final void method47(int arg0, class630 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 == -8) {
                                        this.field8859 = arg1.method3470(arg0 ^ 13110);
                                    }
                                } else {
                                    this.field8858 = arg1.method3470(13111);
                                }
                            } else {
                                this.field8863 = arg1.method3470(13111);
                            }
                        } else {
                            this.field8860 = arg1.method3470(13111);
                        }
                    } else {
                        this.field8857 = arg1.method3470(13111);
                    }
                } else {
                    this.field8871 = arg1.method3470(13111);
                }
            } else {
                this.field8861 = arg1.method3501(-9268);
            }
        } else {
            this.field8856 = arg1.method3501(-9268);
        }
        if (arg0 != 1) {
            this.field8869 = null;
        }
        ++field8870;
    }

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "(B)V", line = 92)
    public static void method3535(byte arg0) {
        field8875 = null;
        field8878 = null;
        if (arg0 != -105) {
            field8878 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)[I", line = 103)
    public final int[] method39(int arg0, int arg1) {
        ++field8864;
        int[] var3 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            int var4 = 0;
            int var5;
            for (var5 = class272.field3439[arg1] - -this.field8863; var5 < 0; var5 += 4096) {
            }
            while (var5 > 4096) {
                var5 -= 4096;
            }
            while (var4 < this.field8861 && this.field8877[var4] <= var5) {
                ++var4;
            }
            int var6 = var4 - 1;
            boolean var7 = ~(var4 & 1) == -1;
            int var8 = this.field8877[var4];
            int var9 = this.field8877[var4 + -1];
            if (this.field8862 + var9 < var5 && ~var5 > ~(var8 - this.field8862)) {
                for (int var10 = 0; ~var10 > ~class657.field9287; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field8860 : -this.field8860;
                    int var13;
                    for (var13 = (this.field8865 * var12 >> 12) + class269.field3405[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (~var11 > ~this.field8856 && ~var13 <= ~this.field8869[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field8869[var6][var14];
                    int var16 = this.field8869[var6][var11];
                    if (var13 > this.field8862 + var15 && ~var13 > ~(-this.field8862 + var16)) {
                        var3[var10] = this.field8872[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class293.method1642(var3, 0, class657.field9287, 0);
            }
        }
        int var17 = 47 % ((81 - arg0) / 36);
        return var3;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V", line = 288)
    public class632() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oea", name = "i", descriptor = "(I)V", line = 210)
    private final void method3536(int arg0) {
        ++field8873;
        Random var2 = new Random((long) this.field8861);
        this.field8862 = this.field8858 / 2;
        this.field8865 = 4096 / this.field8856;
        this.field8868 = 4096 / this.field8861;
        int var3 = this.field8865 / 2;
        this.field8869 = new int[this.field8861][this.field8856 + 1];
        int var4 = this.field8868 / 2;
        this.field8872 = new int[this.field8861][this.field8856];
        this.field8877 = new int[this.field8861 - -1];
        this.field8877[0] = 0;
        for (int var5 = arg0; ~var5 > ~this.field8861; ++var5) {
            if (~var5 < -1) {
                int var6 = this.field8868;
                int var7 = (class517.method2801(var2, 4096, 124) - 2048) * this.field8857 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field8877[var5] = this.field8877[var5 + -1] + var8;
            }
            this.field8869[var5][0] = 0;
            for (int var9 = 0; ~this.field8856 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field8865;
                    int var11 = (-2048 + class517.method2801(var2, 4096, arg0 + 121)) * this.field8871 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field8869[var5][var9] = this.field8869[var5][var9 + -1] + var12;
                }
                this.field8872[var5][var9] = this.field8859 > 0 ? -class517.method2801(var2, this.field8859, arg0 + 122) + 4096 : 4096;
            }
            this.field8869[var5][this.field8856] = 4096;
        }
        this.field8877[this.field8861] = 4096;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "()V", line = 274)
    public static final void method3537() {
        for (int var0 = 0; var0 < class455.field5825.length; ++var0) {
            class455.field5825[var0].method1475();
        }
        class455.field5825 = null;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II[BI)I", line = 291)
    public static final int method3538(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field8867;
        int var4 = -1;
        if (arg0 != 255) {
            method3541((byte) -6, (class630) null, 6);
        }
        for (int var5 = arg1; var5 < arg3; ++var5) {
            var4 = class407.field5097[(arg2[var5] ^ var4) & 255] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!oea", name = "j", descriptor = "(I)V", line = 314)
    public static final void method3539(int arg0) {
        if (arg0 != -12296) {
            field8878 = null;
        }
        ++field8874;
        class590.field8290 = class334.method1889(2048, true, 8, (byte) -9, 8, 0.4F, 4, 35);
    }

    @OriginalMember(owner = "client!oea", name = "k", descriptor = "(I)V", line = 325)
    public static final void method3540(int arg0) {
        if (arg0 == -1) {
            if (class360.field4584 == 1 || class360.field4584 == 3 || ~class56.field795 != ~class360.field4584 && (~class360.field4584 == -1 || class56.field795 == 0)) {
                class441.field5585 = 0;
                class470.field5974 = 0;
                class180.field2318.method398(true);
            }
            ++field8866;
            class56.field795 = class360.field4584;
        }
    }

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "(I)V", line = 361)
    public final void method46(int arg0) {
        this.method3536(0);
        int var2 = -80 % ((arg0 - 64) / 60);
        ++field8855;
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(BLes;I)Ljava/lang/String;", line = 381)
    public static final String method3541(byte arg0, class630 arg1, int arg2) {
        ++field8876;
        try {
            int var3 = arg1.method3504(-13829);
            if (var3 > arg2) {
                var3 = arg2;
            }
            int var4 = -119 / ((arg0 - -23) / 50);
            byte[] var5 = new byte[var3];
            arg1.field8812 += class468.field5950.method897(var5, var3, arg1.field8804, 0, (byte) 92, arg1.field8812);
            return class106.method604(26144, var3, var5, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }
}
