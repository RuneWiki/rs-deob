import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class114 extends class252 {

    @OriginalMember(owner = "client!cj", name = "T", descriptor = "I")
    private int field2041 = 0;

    @OriginalMember(owner = "client!cj", name = "W", descriptor = "I")
    private int field2044 = 20;

    @OriginalMember(owner = "client!cj", name = "bb", descriptor = "I")
    private int field2049 = 1365;

    @OriginalMember(owner = "client!cj", name = "eb", descriptor = "I")
    private int field2052 = 0;

    @OriginalMember(owner = "client!cj", name = "Y", descriptor = "Ljd;")
    public static class85 field2046 = class221.method1499("Schrifts-=tze geladen)3", (byte) -47);

    @OriginalMember(owner = "client!cj", name = "X", descriptor = "Ljd;")
    public static class85 field2045 = class221.method1499(")2", (byte) -125);

    @OriginalMember(owner = "client!cj", name = "db", descriptor = "[I")
    public static int[] field2051 = new int[2];

    @OriginalMember(owner = "client!cj", name = "U", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!cj", name = "V", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!cj", name = "Z", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!cj", name = "ab", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        if (arg2 != -99) {
            this.field2044 = 91;
        }
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 == 3) {
                        this.field2041 = arg0.method1694((byte) -100);
                    }
                } else {
                    this.field2052 = arg0.method1694((byte) -100);
                }
            } else {
                this.field2044 = arg0.method1694((byte) -100);
            }
        } else {
            this.field2049 = arg0.method1694((byte) -100);
        }
        ++field2042;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILge;)V")
    public static final void method806(int arg0, class68 arg1) {
        class61.field1145 = arg1;
        ++field2050;
        int var2 = 5 % ((arg0 - 5) / 42);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ZLik;)Lrd;")
    public static final class252 method807(boolean arg0, class247 arg1) {
        ++field2047;
        arg1.method1711((byte) -67);
        if (arg0) {
            method808(35);
        }
        int var2 = arg1.method1711((byte) -67);
        class252 var3 = class56.method371(31082, var2);
        var3.field4340 = arg1.method1711((byte) -67);
        int var4 = arg1.method1711((byte) -67);
        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = arg1.method1711((byte) -67);
            var3.method88(arg1, var6, (byte) -99);
        }
        var3.method230(3906);
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "<init>", descriptor = "()V")
    public class114() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field2043;
        int[] var3 = super.field4356.method868(arg0, (byte) 127);
        if (super.field4356.field2258) {
            for (int var4 = 0; ~class5.field63 < ~var4; ++var4) {
                int var5 = (class39.field622[arg0] << 12) / this.field2049 + this.field2041;
                int var6 = (class105.field1838[var4] << 12) / this.field2049 + this.field2052;
                int var7 = var6;
                int var8 = var5;
                int var9 = var6;
                int var10 = 0;
                int var11 = var6 * var6 >> 12;
                int var12 = var5;
                for (int var13 = var5 * var5 >> 12; var11 + var13 < 16384 && ~var10 > ~this.field2044; var13 = var8 * var8 >> 12) {
                    var8 = (var8 * var9 >> 12) * 2 + var12;
                    ++var10;
                    var9 = -var13 + var11 + var7;
                    var11 = var9 * var9 >> 12;
                }
                var3[var4] = var10 < this.field2044 + -1 ? (var10 << 12) / this.field2044 : 0;
            }
        }
        if (arg1 != -55) {
            this.method88((class247) null, 21, (byte) -102);
        }
        return var3;
    }

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "(I)V")
    public static void method808(int arg0) {
        if (arg0 <= -102) {
            field2045 = null;
            field2046 = null;
            field2051 = null;
        }
    }
}
