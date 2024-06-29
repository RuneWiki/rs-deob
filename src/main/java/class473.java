import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class473 extends class11 {

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "I")
    private int field6903 = 1024;

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    private int field6902 = 409;

    @OriginalMember(owner = "client!pc", name = "K", descriptor = "I")
    private int field6906 = 1024;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    private int field6914 = 81;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "I")
    private int field6911 = 8;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    private int field6915 = 204;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "I")
    private int field6922 = 4;

    @OriginalMember(owner = "client!pc", name = "cb", descriptor = "I")
    private int field6924 = 0;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field6913 = new String[200];

    @OriginalMember(owner = "client!pc", name = "I", descriptor = "Lwj;")
    public static class270 field6904 = new class270(77, -1);

    @OriginalMember(owner = "client!pc", name = "J", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!pc", name = "L", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!pc", name = "M", descriptor = "I")
    private int field6908;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field6912;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field6917;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    private int field6920;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    private int field6921;

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "I")
    public static int field6923;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "Lga;")
    public static class277 field6916;

    @OriginalMember(owner = "client!pc", name = "N", descriptor = "[I")
    private int[] field6909;

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "[[I")
    private int[][] field6910;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "[[I")
    private int[][] field6919;

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    public class473() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lsi;II)V")
    public final void method43(class391 arg0, int arg1, int arg2) {
        if (arg1 > -40) {
            this.method43((class391) null, -104, -97);
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 == 7) {
                                        this.field6906 = arg0.method2353((byte) 123);
                                    }
                                } else {
                                    this.field6914 = arg0.method2353((byte) 68);
                                }
                            } else {
                                this.field6924 = arg0.method2353((byte) 84);
                            }
                        } else {
                            this.field6903 = arg0.method2353((byte) 98);
                        }
                    } else {
                        this.field6915 = arg0.method2353((byte) 116);
                    }
                } else {
                    this.field6902 = arg0.method2353((byte) 124);
                }
            } else {
                this.field6911 = arg0.method2348(-2);
            }
        } else {
            this.field6922 = arg0.method2348(-2);
        }
        ++field6905;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        ++field6918;
        int[] var3 = super.field158.method1312(arg1, (byte) 74);
        if (arg0 >= -42) {
            this.method2784(14);
        }
        if (super.field158.field2966) {
            int var4 = 0;
            int var5;
            for (var5 = class328.field4484[arg1] + this.field6924; var5 < 0; var5 += 4096) {
            }
            while (~var5 < -4097) {
                var5 -= 4096;
            }
            while (~var4 > ~this.field6911 && var5 >= this.field6909[var4]) {
                ++var4;
            }
            int var6 = var4 + -1;
            boolean var7 = (1 & var4) == 0;
            int var8 = this.field6909[var4];
            int var9 = this.field6909[var4 + -1];
            if (~var5 < ~(this.field6921 + var9) && -this.field6921 + var8 > var5) {
                for (int var10 = 0; ~class90.field1316 < ~var10; ++var10) {
                    int var11 = 0;
                    int var12 = var7 ? this.field6903 : -this.field6903;
                    int var13;
                    for (var13 = (this.field6908 * var12 >> 12) + class448.field6606[var10]; var13 < 0; var13 += 4096) {
                    }
                    while (var13 > 4096) {
                        var13 -= 4096;
                    }
                    while (this.field6922 > var11 && var13 >= this.field6910[var6][var11]) {
                        ++var11;
                    }
                    int var14 = var11 + -1;
                    int var15 = this.field6910[var6][var11];
                    int var16 = this.field6910[var6][var14];
                    if (~var13 < ~(this.field6921 + var16) && ~var13 > ~(-this.field6921 + var15)) {
                        var3[var10] = this.field6919[var6][var14];
                    } else {
                        var3[var10] = 0;
                    }
                }
            } else {
                class91.method681(var3, 0, class90.field1316, 0);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(Z)V")
    public final void method42(boolean arg0) {
        ++field6923;
        this.method2784(-17843);
        if (!arg0) {
            this.field6922 = -77;
        }
    }

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "(I)V")
    private final void method2784(int arg0) {
        ++field6917;
        Random var2 = new Random((long) this.field6911);
        this.field6908 = 4096 / this.field6922;
        this.field6920 = 4096 / this.field6911;
        this.field6921 = this.field6914 / 2;
        int var3 = this.field6908 / 2;
        this.field6910 = new int[this.field6911][this.field6922 + 1];
        int var4 = this.field6920 / 2;
        this.field6909 = new int[this.field6911 + 1];
        this.field6919 = new int[this.field6911][this.field6922];
        if (arg0 != -17843) {
            this.field6920 = 49;
        }
        this.field6909[0] = 0;
        for (int var5 = 0; var5 < this.field6911; ++var5) {
            if (var5 > 0) {
                int var6 = this.field6920;
                int var7 = (class367.method2213(arg0 + -837675757, 4096, var2) - 2048) * this.field6915 >> 12;
                int var8 = (var4 * var7 >> 12) + var6;
                this.field6909[var5] = this.field6909[var5 + -1] + var8;
            }
            this.field6910[var5][0] = 0;
            for (int var9 = 0; ~this.field6922 < ~var9; ++var9) {
                if (~var9 < -1) {
                    int var10 = this.field6908;
                    int var11 = (class367.method2213(-837693600, 4096, var2) - 2048) * this.field6902 >> 12;
                    int var12 = (var3 * var11 >> 12) + var10;
                    this.field6910[var5][var9] = this.field6910[var5][var9 + -1] + var12;
                }
                this.field6919[var5][var9] = ~this.field6906 >= -1 ? 4096 : -class367.method2213(-837693600, this.field6906, var2) + 4096;
            }
            this.field6910[var5][this.field6922] = 4096;
        }
        this.field6909[this.field6911] = 4096;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public static void method2785(byte arg0) {
        if (arg0 != 8) {
            method2785((byte) -99);
        }
        field6916 = null;
        field6904 = null;
        field6913 = null;
    }
}
