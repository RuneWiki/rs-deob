import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class275 extends class272 {

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    private int field4872 = 32768;

    @OriginalMember(owner = "client!oi", name = "R", descriptor = "[S")
    public static short[] field4879 = new short[256];

    @OriginalMember(owner = "client!oi", name = "S", descriptor = "Z")
    public static boolean field4880 = false;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Lli;")
    public static class185 field4871 = class245.method1649(")2", 125);

    @OriginalMember(owner = "client!oi", name = "U", descriptor = "I")
    public static int field4882 = 99;

    @OriginalMember(owner = "client!oi", name = "P", descriptor = "I")
    public static int field4877 = -1;

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!oi", name = "O", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!oi", name = "Q", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!oi", name = "T", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg1 != 4421) {
            this.method32(-63, (byte) 21);
        }
        ++field4875;
        int[] var3 = super.field4819.method1632(0, arg0);
        if (super.field4819.field4294) {
            int[] var4 = this.method1866(arg0, 1, 74);
            int[] var5 = this.method1866(arg0, 2, 81);
            for (int var6 = 0; ~class246.field4385 < ~var6; ++var6) {
                int var7 = (var4[var6] & 4092) >> 4;
                int var8 = var5[var6] * this.field4872 >> 12;
                int var9 = class96.field1804[var7] * var8 >> 12;
                int var10 = class13.field234[var7] * var8 >> 12;
                int var11 = class59.field1037 & var6 - -(var9 >> 12);
                int var12 = class99.field1826 & (var10 >> 12) + arg0;
                int[] var13 = this.method1866(var12, 0, arg1 ^ 4376);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lhi;B)V")
    public static final void method1882(class250 arg0, byte arg1) {
        class189.field3524 = arg0;
        if (arg1 == 23) {
            ++field4876;
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static void method1883(int arg0) {
        if (arg0 == 99) {
            field4871 = null;
            field4879 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIZI)V")
    public static final void method1884(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg5 >= class207.field3810 && arg2 <= class66.field1163 && ~arg0 <= ~class216.field3964 && class113.field2040 >= arg3) {
            class140.method1004(arg2, arg0, arg1, arg3, arg5, -22180);
        } else {
            class44.method273(arg1, 101, arg2, arg3, arg0, arg5);
        }
        ++field4874;
        if (arg4) {
            field4879 = null;
        }
    }

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "(IB)[[I")
    public final int[][] method32(int arg0, byte arg1) {
        ++field4878;
        int var3 = -115 % ((-60 - arg1) / 45);
        int[][] var4 = super.field4818.method1514(-2, arg0);
        if (super.field4818.field3954) {
            int[] var5 = this.method1866(arg0, 1, 105);
            int[] var6 = this.method1866(arg0, 2, 126);
            int[] var7 = var4[0];
            int[] var8 = var4[2];
            int[] var9 = var4[1];
            for (int var10 = 0; class246.field4385 > var10; ++var10) {
                int var11 = var6[var10] * this.field4872 >> 12;
                int var12 = (1046549 & var5[var10] * 255) >> 12;
                int var13 = class13.field234[var12] * var11 >> 12;
                int var14 = class96.field1804[var12] * var11 >> 12;
                int var15 = (var13 >> 12) + arg0 & class99.field1826;
                int var16 = class59.field1037 & (var14 >> 12) + var10;
                int[][] var17 = this.method1860(var15, 3, 0);
                var7[var10] = var17[0][var16];
                var9[var10] = var17[1][var16];
                var8[var10] = var17[2][var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Ljd;BI)V")
    public final void method34(class118 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 == -2) {
                super.field4832 = ~arg0.method867(false) == -2;
            }
        } else {
            this.field4872 = arg0.method827(255) << 4;
        }
        int var5 = 54 % ((arg1 - -21) / 55);
        ++field4873;
    }

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "(I)V")
    public final void method113(int arg0) {
        if (arg0 != 0) {
            this.method34((class118) null, (byte) -19, -13);
        }
        class256.method1732((byte) -126);
        ++field4881;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class275() {
        super(3, false);
    }
}
