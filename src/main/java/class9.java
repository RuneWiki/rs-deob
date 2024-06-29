import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class9 extends class170 {

    @OriginalMember(owner = "client!ig", name = "ab", descriptor = "I")
    private int field120 = 0;

    @OriginalMember(owner = "client!ig", name = "jb", descriptor = "[S")
    private short[] field129 = new short[257];

    @OriginalMember(owner = "client!ig", name = "cb", descriptor = "Lqk;")
    private static class207 field122 = class24.method212(255, "Loaded title screen");

    @OriginalMember(owner = "client!ig", name = "db", descriptor = "Lqk;")
    private static class207 field123 = class24.method212(255, "Loading)3)3)3");

    @OriginalMember(owner = "client!ig", name = "bb", descriptor = "Lmd;")
    public static class220 field121 = null;

    @OriginalMember(owner = "client!ig", name = "Z", descriptor = "Lqk;")
    public static class207 field119 = field123;

    @OriginalMember(owner = "client!ig", name = "nb", descriptor = "Lqk;")
    public static class207 field133 = field122;

    @OriginalMember(owner = "client!ig", name = "mb", descriptor = "Lqk;")
    public static class207 field132 = class24.method212(255, "document)3cookie=(R");

    @OriginalMember(owner = "client!ig", name = "qb", descriptor = "Lqk;")
    public static class207 field136 = class24.method212(255, "<col=40ff00>");

    @OriginalMember(owner = "client!ig", name = "rb", descriptor = "[Z")
    public static boolean[] field137 = new boolean[100];

    @OriginalMember(owner = "client!ig", name = "W", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ig", name = "X", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ig", name = "Y", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!ig", name = "fb", descriptor = "I")
    public static int field125;

    @OriginalMember(owner = "client!ig", name = "gb", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!ig", name = "ib", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!ig", name = "lb", descriptor = "I")
    public static int field131;

    @OriginalMember(owner = "client!ig", name = "ob", descriptor = "I")
    public static int field134;

    @OriginalMember(owner = "client!ig", name = "pb", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!ig", name = "eb", descriptor = "[I")
    private int[] field124;

    @OriginalMember(owner = "client!ig", name = "hb", descriptor = "[I")
    private int[] field127;

    @OriginalMember(owner = "client!ig", name = "kb", descriptor = "[[I")
    private int[][] field130;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(Z)V")
    private final void method49(boolean arg0) {
        int[] var2 = this.field130[0];
        if (arg0) {
            ++field131;
            int[] var3 = this.field130[1];
            int[] var4 = this.field130[this.field130.length + -2];
            int[] var5 = this.field130[this.field130.length + -1];
            this.field124 = new int[] { -var5[0] - -var4[0] + var4[0], var4[1] + var4[1] + -var5[1] };
            this.field127 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] - -var2[1] + -var3[1] };
        }
    }

    @OriginalMember(owner = "client!ig", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(BI)[I")
    public final int[] method31(byte arg0, int arg1) {
        if (arg0 != -30) {
            return null;
        } else {
            int[] var3 = super.field3001.method1538(83, arg1);
            if (super.field3001.field3835) {
                int[] var4 = this.method1226(0, arg1, 126);
                for (int var5 = 0; ~var5 > ~class88.field1595; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (~var6 < -257) {
                        var6 = 256;
                    }
                    var3[var5] = this.field129[var6];
                }
            }
            ++field118;
            return var3;
        }
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (this.field130 == null) {
            this.field130 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (arg0 >= 14) {
            ++field117;
            if (this.field130.length < 2) {
                throw new RuntimeException("Curve operation requires at least two markers");
            } else {
                if (this.field120 == 2) {
                    this.method49(true);
                }
                class235.method1681(105);
                this.method52(-32767);
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(III)I")
    public static final int method51(int arg0, int arg1, int arg2) {
        if (arg0 <= 59) {
            method51(67, 66, -41);
        }
        ++field134;
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        while (~arg2 != -1) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "(I)V")
    private final void method52(int arg0) {
        int var2 = this.field120;
        if (var2 != 2) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field130.length - 1 > var5 && this.field130[var5][0] <= var4; ++var5) {
                    }
                    int[] var6 = this.field130[var5 + -1];
                    int[] var7 = this.field130[var5];
                    int var8 = (var4 - var6[0] << 12) / (var7[0] - var6[0]);
                    int var9 = -class207.field3689[(8169 & var8) >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (var11 <= -32768) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field129[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; this.field130.length + -1 > var14 && ~var13 <= ~this.field130[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field130[var14 + -1];
                    int[] var16 = this.field130[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] - var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (var19 <= -32768) {
                        var19 = -32767;
                    }
                    if (var19 >= 32768) {
                        var19 = 32767;
                    }
                    this.field129[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; var20 < 257; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; this.field130.length + -1 > var22 && ~var21 <= ~this.field130[var22][0]; ++var22) {
                }
                int[] var23 = this.field130[var22 - 1];
                int[] var24 = this.field130[var22];
                int var25 = this.method54(-3697, var22 + -2)[1];
                int var26 = var24[1];
                int var27 = var23[1];
                int var28 = this.method54(-3697, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = var28 - var26 - var25 + var27;
                int var32 = (var29 * var31 >> 12) * var30 >> 12;
                int var34 = -var25 + var26;
                int var35 = -var27 + var25 - var31;
                int var36 = var30 * var35 >> 12;
                int var37 = var29 * var34 >> 12;
                int var38 = var32 + var36 + var27 + var37;
                if (var38 <= -32768) {
                    var38 = -32767;
                }
                if (var38 >= 32768) {
                    var38 = 32767;
                }
                this.field129[var20] = (short) var38;
            }
        }
        if (arg0 != -32767) {
            field132 = null;
        }
        ++field116;
    }

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "(Z)V")
    public static void method53(boolean arg0) {
        field121 = null;
        field122 = null;
        field123 = null;
        field136 = null;
        field133 = null;
        field119 = null;
        field132 = null;
        if (!arg0) {
            method51(-107, -126, 3);
        }
        field137 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)[I")
    private final int[] method54(int arg0, int arg1) {
        if (arg0 != -3697) {
            return null;
        } else {
            ++field135;
            if (~arg1 > -1) {
                return this.field127;
            } else {
                return ~arg1 <= ~this.field130.length ? this.field124 : this.field130[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Lv;II)V")
    public final void method29(class149 arg0, int arg1, int arg2) {
        if (~arg2 == -1) {
            this.field120 = arg0.method1045((byte) -117);
            this.field130 = new int[arg0.method1045((byte) -119)][2];
            for (int var4 = 0; this.field130.length > var4; ++var4) {
                this.field130[var4][0] = arg0.method1050(1272006568);
                this.field130[var4][1] = arg0.method1050(1272006568);
            }
        }
        ++field126;
        if (arg1 != 5877) {
            method51(18, -10, 73);
        }
    }

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "(I)Lsa;")
    public static final class260 method55(int arg0) {
        class17.field266 = arg0;
        ++field128;
        return class155.method1138(-117);
    }
}
