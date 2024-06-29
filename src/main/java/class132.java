import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class132 extends class354 {

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    private int field2029 = 3072;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    private int field2032 = 2048;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    private int field2033 = 1024;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "[Lkh;")
    public static class13[] field2030 = new class13[32768];

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field2028 = 0;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "Lao;")
    public static class188 field2034 = new class188(10, -1);

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILti;I)V")
    public final void method206(int arg0, class303 arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field5354 = ~arg1.method1918((byte) -109) == -2;
                }
            } else {
                this.field2029 = arg1.method1868(0);
            }
        } else {
            this.field2033 = arg1.method1868(arg0 ^ 15180);
        }
        ++field2035;
        if (arg0 != 15180) {
            this.field2029 = -12;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)[I")
    public final int[] method253(int arg0, byte arg1) {
        ++field2036;
        int[] var3 = super.field5357.method861(true, arg0);
        if (arg1 != -95) {
            this.field2032 = 16;
        }
        if (super.field5357.field1869) {
            int[] var4 = this.method2293(0, arg0, (byte) 69);
            for (int var5 = 0; ~var5 > ~class404.field5952; ++var5) {
                var3[var5] = (var4[var5] * this.field2032 >> 12) + this.field2033;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)[[I")
    public final int[][] method207(byte arg0, int arg1) {
        if (arg0 > -40) {
            this.method253(-70, (byte) 78);
        }
        ++field2031;
        int[][] var3 = super.field5351.method2819((byte) -94, arg1);
        if (super.field5351.field6959) {
            int[][] var4 = this.method2291(0, (byte) -95, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class404.field5952 > var11; ++var11) {
                var8[var11] = (var5[var11] * this.field2032 >> 12) + this.field2033;
                var9[var11] = (var6[var11] * this.field2032 >> 12) + this.field2033;
                var10[var11] = (var7[var11] * this.field2032 >> 12) + this.field2033;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class132() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public final void method771(boolean arg0) {
        this.field2032 = -this.field2033 + this.field2029;
        if (!arg0) {
            ++field2027;
        }
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)V")
    public static void method970(byte arg0) {
        field2030 = null;
        field2034 = null;
        int var1 = 16 % ((arg0 - -64) / 51);
    }
}
