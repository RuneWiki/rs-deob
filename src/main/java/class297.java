import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class297 extends class335 {

    @OriginalMember(owner = "client!rs", name = "N", descriptor = "I")
    private int field3934 = -1;

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "Lfv;")
    public static class690 field3927 = new class690();

    @OriginalMember(owner = "client!rs", name = "L", descriptor = "I")
    public static int field3932 = -2;

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "I")
    public int field3922;

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "I")
    public static int field3924;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
    public int field3928;

    @OriginalMember(owner = "client!rs", name = "K", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!rs", name = "M", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!rs", name = "O", descriptor = "I")
    public static int field3935;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "[I")
    public int[] field3930;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "[[B")
    public static byte[][] field3929;

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(II)I", line = 5)
    public static final int method1746(int arg0, int arg1) {
        int var2 = -116 / ((-66 - arg0) / 52);
        ++field3926;
        return 1023 & arg1;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V", line = 15)
    public final void method1277(byte arg0) {
        super.method1277((byte) 103);
        if (arg0 <= 78) {
            this.field3922 = 37;
        }
        ++field3933;
        this.field3930 = null;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IZ)[[I", line = 27)
    public int[][] method1(int arg0, boolean arg1) {
        ++field3935;
        int[][] var3 = super.field4527.method669(arg0, (byte) 2);
        if (arg1) {
            this.method2(21, (class157) null, 64);
        }
        if (super.field4527.field1468 && this.method1750(10184)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = (class316.field4237 == this.field3922 ? arg0 : this.field3922 * arg0 / class316.field4237) * this.field3928;
            if (class649.field8968 != this.field3928) {
                for (int var8 = 0; class649.field8968 > var8; ++var8) {
                    int var9 = this.field3928 * var8 / class649.field8968;
                    int var10 = this.field3930[var7 + var9];
                    var6[var8] = class15.method97(4080, var10 << 4);
                    var5[var8] = class15.method97(var10, 65280) >> 4;
                    var4[var8] = class15.method97(var10, 16711680) >> 12;
                }
            } else {
                for (int var11 = 0; class649.field8968 > var11; ++var11) {
                    int var12 = this.field3930[var7++];
                    var6[var11] = class15.method97(255, var12) << 4;
                    var5[var11] = class15.method97(4080, var12 >> 4);
                    var4[var11] = class15.method97(16711680, var12) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "()V", line = 97)
    public class297() {
        super(0, false);
    }

    @OriginalMember(owner = "client!rs", name = "d", descriptor = "(I)[Lmo;", line = 103)
    public static final class361[] method1747(int arg0) {
        ++field3925;
        int var1 = 39 / ((-79 - arg0) / 45);
        return new class361[] { class180.field2522, class28.field411, class392.field5250, class85.field1021, class675.field9604, class538.field7388 };
    }

    @OriginalMember(owner = "client!rs", name = "e", descriptor = "(I)V", line = 114)
    public static void method1748(int arg0) {
        field3929 = null;
        field3927 = null;
        if (arg0 != 11442) {
            field3932 = -74;
        }
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(Z)I", line = 125)
    public final int method1749(boolean arg0) {
        ++field3923;
        if (!arg0) {
            this.method2(6, (class157) null, -118);
        }
        return this.field3934;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(ILio;I)V", line = 149)
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 == -66) {
            if (arg0 == 0) {
                this.field3934 = arg1.method963(arg2 ^ 63);
            }
            ++field3931;
        }
    }

    @OriginalMember(owner = "client!rs", name = "f", descriptor = "(I)Z", line = 166)
    public final boolean method1750(int arg0) {
        ++field3924;
        if (this.field3930 != null) {
            return true;
        } else {
            if (arg0 != 10184) {
                this.field3934 = -62;
            }
            if (this.field3934 >= 0) {
                class92 var2 = ~class49.field576 > -1 ? class92.method508(class348.field4636, this.field3934) : class92.method506(class348.field4636, class49.field576, this.field3934);
                var2.method520();
                this.field3930 = var2.method519();
                this.field3928 = var2.field1132;
                this.field3922 = var2.field1128;
                return true;
            } else {
                return false;
            }
        }
    }
}
