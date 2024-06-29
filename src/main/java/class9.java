import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public class class9 extends class202 {

    @OriginalMember(owner = "client!oo", name = "M", descriptor = "I")
    private int field94 = 0;

    @OriginalMember(owner = "client!oo", name = "L", descriptor = "I")
    private int field93 = 4096;

    @OriginalMember(owner = "client!oo", name = "O", descriptor = "Lnj;")
    public static class317 field96 = new class317();

    @OriginalMember(owner = "client!oo", name = "P", descriptor = "Lss;")
    public static class213 field97 = new class213("level: ", "Stufe: ", "niveau ", "nível: ");

    @OriginalMember(owner = "client!oo", name = "S", descriptor = "[[S")
    public static short[][] field100 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 8, 5281, 10438, 3650, -27322, -21845, 200, 571, 908, 21830, 28946, -15701, -14010 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!oo", name = "R", descriptor = "I")
    public static int field99 = 0;

    @OriginalMember(owner = "client!oo", name = "J", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!oo", name = "K", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!oo", name = "N", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!oo", name = "Q", descriptor = "Lo;")
    public static class139 field98;

    @OriginalMember(owner = "client!oo", name = "T", descriptor = "[Lnr;")
    public static class16[] field101;

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IZ)[I")
    public final int[] method41(int arg0, boolean arg1) {
        ++field91;
        int[] var3 = super.field3064.method2452((byte) 24, arg0);
        if (!arg1) {
            this.method44(104, -45);
        }
        if (super.field3064.field5837) {
            int[] var4 = this.method1376(1046794076, 0, arg0);
            for (int var5 = 0; class276.field4375 > var5; ++var5) {
                int var6 = var4[var5];
                if (var6 >= this.field94) {
                    if (this.field93 >= var6) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field93;
                    }
                } else {
                    var3[var5] = this.field94;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lhw;BI)V")
    public final void method40(class208 arg0, byte arg1, int arg2) {
        int var4 = 64 / ((-46 - arg1) / 50);
        ++field95;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    super.field3071 = ~arg0.method1445(-75) == -2;
                }
            } else {
                this.field93 = arg0.method1455(-3387);
            }
        } else {
            this.field94 = arg0.method1455(-3387);
        }
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(Z)V")
    public static void method63(boolean arg0) {
        field100 = null;
        field96 = null;
        field98 = null;
        field101 = null;
        if (arg0) {
            field99 = 87;
        }
        field97 = null;
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "()V")
    public class9() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)[[I")
    public final int[][] method44(int arg0, int arg1) {
        ++field92;
        if (arg0 != -1) {
            this.method44(67, 8);
        }
        int[][] var3 = super.field3081.method1050(arg1, -66);
        if (super.field3081.field2432) {
            int[][] var4 = this.method1382(0, arg1, -104);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class276.field4375; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (~var12 <= ~this.field94) {
                    if (var12 > this.field93) {
                        var8[var11] = this.field93;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field94;
                }
                if (~var13 <= ~this.field94) {
                    if (~this.field93 <= ~var13) {
                        var9[var11] = var13;
                    } else {
                        var9[var11] = this.field93;
                    }
                } else {
                    var9[var11] = this.field94;
                }
                if (~this.field94 < ~var14) {
                    var10[var11] = this.field94;
                } else if (~var14 < ~this.field93) {
                    var10[var11] = this.field93;
                } else {
                    var10[var11] = var14;
                }
            }
        }
        return var3;
    }
}
