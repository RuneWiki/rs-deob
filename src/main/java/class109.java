import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class109 extends class252 {

    @OriginalMember(owner = "client!sk", name = "Y", descriptor = "I")
    private int field1923 = 32768;

    @OriginalMember(owner = "client!sk", name = "V", descriptor = "Ljd;")
    public static class85 field1920 = class221.method1499("blinken3:", (byte) -87);

    @OriginalMember(owner = "client!sk", name = "Z", descriptor = "I")
    public static int field1924 = 0;

    @OriginalMember(owner = "client!sk", name = "ab", descriptor = "Ljd;")
    public static class85 field1925 = class221.method1499(":trade:", (byte) -71);

    @OriginalMember(owner = "client!sk", name = "T", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!sk", name = "U", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!sk", name = "W", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!sk", name = "X", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!sk", name = "bb", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg2 != -99) {
            method752(false);
        }
        if (~arg1 != -1) {
            if (arg1 == 1) {
                super.field4338 = arg0.method1711((byte) -67) == 1;
            }
        } else {
            this.field1923 = arg0.method1694((byte) -100) << 4;
        }
        ++field1919;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IB)[[I")
    public final int[][] method89(int arg0, byte arg1) {
        int[][] var3 = super.field4350.method155(arg0, false);
        if (super.field4350.field338) {
            int[] var4 = this.method1742((byte) 8, 1, arg0);
            int[] var5 = this.method1742((byte) 8, 2, arg0);
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            for (int var9 = 0; var9 < class5.field63; ++var9) {
                int var10 = (var4[var9] * 255 & 1046538) >> 12;
                int var11 = var5[var9] * this.field1923 >> 12;
                int var12 = class38.field593[var10] * var11 >> 12;
                int var13 = class97.field1757[var10] * var11 >> 12;
                int var14 = class25.field360 & arg0 - -(var12 >> 12);
                int var15 = (var13 >> 12) + var9 & class67.field1233;
                int[][] var16 = this.method1737(0, 3, var14);
                var8[var9] = var16[0][var15];
                var6[var9] = var16[1][var15];
                var7[var9] = var16[2][var15];
            }
        }
        if (arg1 != -123) {
            this.method88((class247) null, 55, (byte) 46);
        }
        ++field1922;
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        if (arg1 != -55) {
            field1920 = null;
        }
        int[] var3 = super.field4356.method868(arg0, (byte) 105);
        ++field1918;
        if (super.field4356.field2258) {
            int[] var4 = this.method1742((byte) 8, 1, arg0);
            int[] var5 = this.method1742((byte) 8, 2, arg0);
            for (int var6 = 0; var6 < class5.field63; ++var6) {
                int var7 = var5[var6] * this.field1923 >> 12;
                int var8 = 255 & var4[var6] >> 4;
                int var9 = class97.field1757[var8] * var7 >> 12;
                int var10 = class38.field593[var8] * var7 >> 12;
                int var11 = (var9 >> 12) + var6 & class67.field1233;
                int var12 = class25.field360 & (var10 >> 12) + arg0;
                int[] var13 = this.method1742((byte) 8, 0, var12);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class109() {
        super(3, false);
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        class195.method1328(111);
        ++field1926;
        if (arg0 != 3906) {
            this.field1923 = -127;
        }
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(Z)V")
    public static void method752(boolean arg0) {
        field1920 = null;
        field1925 = null;
        if (!arg0) {
            method752(true);
        }
    }
}
