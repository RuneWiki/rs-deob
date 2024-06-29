import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class128 extends class196 {

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    private int field2141 = 4096;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    private int field2138 = 4096;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    private int field2144 = 4096;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "Lqh;")
    public static class189 field2142 = new class189(4);

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field2143;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field2145;

    @OriginalMember(owner = "client!hf", name = "ab", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!hf", name = "bb", descriptor = "I")
    public static int field2149;

    @OriginalMember(owner = "client!hf", name = "cb", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!hf", name = "db", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!hf", name = "eb", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "Lu;")
    public static class111 field2140;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "[I")
    public static int[] field2147;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "[Ltg;")
    public static class171[] field2146;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(B)V")
    public static final void method948(byte arg0) {
        ++field2151;
        int var1 = (class44.field706.field4319 >> 7) + class11.field160;
        if (arg0 >= -66) {
            method949((byte) -23);
        }
        int var2 = (class44.field706.field4348 >> 7) + class241.field4179;
        class255.field4448 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class255.field4448 = 1;
        }
        if (~var1 <= -3073 && var1 <= 3118 && var2 >= 9492 && ~var2 >= -9536) {
            class255.field4448 = 1;
        }
        if (class255.field4448 == 1 && var1 >= 3139 && ~var1 >= -3200 && ~var2 <= -3009 && ~var2 >= -3063) {
            class255.field4448 = 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        ++field2149;
        int[][] var3 = super.field3285.method1548(arg1, (byte) -55);
        if (super.field3285.field3963) {
            int[][] var4 = this.method1387(arg0 + 43, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[0];
            int[] var8 = var4[2];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class49.field767; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var8[var11];
                if (~var12 == ~var14 && ~var13 == ~var14) {
                    var7[var11] = this.field2144 * var12 >> 12;
                    var9[var11] = this.field2138 * var14 >> 12;
                    var10[var11] = this.field2141 * var13 >> 12;
                } else {
                    var7[var11] = this.field2144;
                    var9[var11] = this.field2138;
                    var10[var11] = this.field2141;
                }
            }
        }
        if (arg0 != 11) {
            field2142 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field2141 = arg1.method876(false);
                }
            } else {
                this.field2138 = arg1.method876(false);
            }
        } else {
            this.field2144 = arg1.method876(false);
        }
        if (arg2 != 82) {
            field2140 = null;
        }
        ++field2145;
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(B)V")
    public static void method949(byte arg0) {
        field2146 = null;
        field2147 = null;
        field2142 = null;
        if (arg0 != -53) {
            field2148 = 40;
        }
        field2140 = null;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V")
    public class128() {
        super(1, false);
    }
}
