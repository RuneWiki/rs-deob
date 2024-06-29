import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class577 extends class56 {

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    private int field8153 = -1;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "Lqfa;")
    public static class98 field8155 = new class98(86, 4);

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field8148;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    private int field8149;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    private int field8150;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field8152;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field8154;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    public static int field8156;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "I")
    public static int field8157;

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "I")
    public static int field8158;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "Lkf;")
    public static class252 field8147;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "[I")
    private int[] field8151;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V", line = 4)
    public final void method366(int arg0, int arg1, int arg2) {
        ++field8156;
        super.method366(arg0, arg1, arg2);
        if (this.field8153 >= 0 && class119.field1442 != null) {
            int var4 = !class119.field1442.method532((byte) 127, this.field8153).field7208 ? 128 : 64;
            this.field8151 = class119.field1442.method534(false, var4, arg1 + 20378, var4, 1.0F, this.field8153);
            this.field8149 = var4;
            this.field8150 = var4;
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(B)V", line = 21)
    public static void method3294(byte arg0) {
        if (arg0 != -122) {
            method3294((byte) 70);
        }
        field8147 = null;
        field8155 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILee;I)V", line = 32)
    public final void method6(int arg0, class675 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field8153 = arg1.method3757((byte) -65);
        }
        ++field8154;
        if (arg0 != 3731) {
            field8155 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(B)V", line = 46)
    public final void method3(byte arg0) {
        super.method3((byte) -47);
        ++field8158;
        int var2 = 114 % ((arg0 - 52) / 49);
        this.field8151 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)[[I", line = 58)
    public final int[][] method5(int arg0, int arg1) {
        ++field8157;
        int[][] var3 = super.field668.method3009(0, arg0);
        if (arg1 != 1) {
            this.method3((byte) 107);
        }
        if (super.field668.field7292) {
            int var4 = this.field8150 * (class226.field3050 == this.field8149 ? arg0 : this.field8149 * arg0 / class226.field3050);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (~class328.field4576 == ~this.field8150) {
                for (int var8 = 0; ~class328.field4576 < ~var8; ++var8) {
                    int var9 = this.field8151[var4++];
                    var7[var8] = class286.method1877(4080, var9 << 4);
                    var6[var8] = class286.method1877(4080, var9 >> 4);
                    var5[var8] = class286.method1877(4080, var9 >> 12);
                }
            } else {
                for (int var10 = 0; class328.field4576 > var10; ++var10) {
                    int var11 = this.field8150 * var10 / class328.field4576;
                    int var12 = this.field8151[var4 + var11];
                    var7[var10] = class286.method1877(var12, 255) << 4;
                    var6[var10] = class286.method1877(4080, var12 >> 4);
                    var5[var10] = class286.method1877(4080, var12 >> 12);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 124)
    public class577() {
        super(0, false);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)I", line = 129)
    public final int method365(int arg0) {
        if (arg0 != -1) {
            field8155 = null;
        }
        ++field8148;
        return this.field8153;
    }
}
