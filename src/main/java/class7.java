import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class7 extends class89 {

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "Z")
    private boolean field112 = true;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "Z")
    private boolean field114 = true;

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "Lej;")
    public static class188 field113 = new class188(64);

    @OriginalMember(owner = "client!dc", name = "Y", descriptor = "I")
    public static int field116 = 0;

    @OriginalMember(owner = "client!dc", name = "Z", descriptor = "[I")
    public static int[] field117 = new int[4096];

    @OriginalMember(owner = "client!dc", name = "ab", descriptor = "Lha;")
    public static class46 field118;

    @OriginalMember(owner = "client!dc", name = "cb", descriptor = "Lha;")
    private static class46 field120;

    @OriginalMember(owner = "client!dc", name = "bb", descriptor = "Lha;")
    public static class46 field119;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    public static int field109;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "I")
    public static int field111;

    @OriginalMember(owner = "client!dc", name = "X", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(B)V")
    public static void method29(byte arg0) {
        field119 = null;
        field117 = null;
        field120 = null;
        field118 = null;
        if (arg0 < 41) {
            method29((byte) 6);
        }
        field113 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)[[I")
    public final int[][] method30(int arg0, byte arg1) {
        ++field110;
        if (arg1 != 25) {
            this.field114 = false;
        }
        int[][] var3 = super.field1695.method843((byte) -25, arg0);
        if (super.field1695.field2028) {
            int[][] var4 = this.method689((byte) 95, 0, !this.field114 ? arg0 : -arg0 + class231.field4015);
            int[] var5 = var4[1];
            int[] var6 = var3[0];
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            if (this.field112) {
                for (int var11 = 0; ~var11 > ~class241.field4284; ++var11) {
                    var6[var11] = var7[class115.field2177 - var11];
                    var9[var11] = var5[class115.field2177 - var11];
                    var10[var11] = var8[-var11 + class115.field2177];
                }
            } else {
                for (int var12 = 0; ~var12 > ~class241.field4284; ++var12) {
                    var6[var12] = var7[var12];
                    var9[var12] = var5[var12];
                    var10[var12] = var8[var12];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V")
    public static final void method31(int arg0) {
        if (arg0 <= 32) {
            field120 = null;
        }
        class131.field2395 = new class39();
        ++field109;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class7() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(III)Lpd;")
    public static final class168 method32(int arg0, int arg1, int arg2) {
        class201 var3 = class111.field2080[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3606;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lwe;II)V")
    public final void method14(class75 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1683 = ~arg0.method558(arg1 + 641641493) == -2;
                }
            } else {
                this.field114 = arg0.method558(1) == 1;
            }
        } else {
            this.field112 = ~arg0.method558(1) == -2;
        }
        if (arg1 != -641641492) {
            field119 = null;
        }
        ++field111;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(IB)[I")
    public final int[] method12(int arg0, byte arg1) {
        ++field115;
        int[] var3 = super.field1688.method936(1, arg0);
        int var4 = -24 / ((arg1 - 51) / 44);
        if (super.field1688.field2200) {
            int[] var5 = this.method685(-72, this.field114 ? -arg0 + class231.field4015 : arg0, 0);
            if (!this.field112) {
                class104.method784(var5, 0, var3, 0, class241.field4284);
            } else {
                for (int var6 = 0; var6 < class241.field4284; ++var6) {
                    var3[var6] = var5[-var6 + class115.field2177];
                }
            }
        }
        return var3;
    }

    static {
        for (int var0 = 0; var0 < 4096; ++var0) {
            field117[var0] = class240.method1651((byte) 124, var0);
        }
        field118 = class271.method1828("<)4col>", -46);
        field120 = class271.method1828("Loading interfaces )2 ", -46);
        field119 = field120;
    }
}
