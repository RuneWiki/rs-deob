import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class151 extends class252 {

    @OriginalMember(owner = "client!bj", name = "U", descriptor = "I")
    private int field2548 = 585;

    @OriginalMember(owner = "client!bj", name = "Z", descriptor = "[Lme;")
    public static class213[] field2553 = new class213[100];

    @OriginalMember(owner = "client!bj", name = "bb", descriptor = "I")
    public static int field2555 = 0;

    @OriginalMember(owner = "client!bj", name = "V", descriptor = "Lwe;")
    public static class15 field2549 = new class15();

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "[I")
    public static int[] field2556 = new int[2048];

    @OriginalMember(owner = "client!bj", name = "T", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!bj", name = "W", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!bj", name = "X", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!bj", name = "Y", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!bj", name = "ab", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "[[[B")
    public static byte[][][] field2557;

    @OriginalMember(owner = "client!bj", name = "g", descriptor = "(I)V")
    public static void method985(int arg0) {
        field2553 = null;
        field2549 = null;
        field2557 = null;
        int var1 = -13 % ((35 - arg0) / 34);
        field2556 = null;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(ILge;II)[Lqf;")
    public static final class232[] method986(int arg0, class68 arg1, int arg2, int arg3) {
        ++field2547;
        if (!class253.method1750(arg0, arg1, (byte) 122, arg3)) {
            return null;
        } else {
            int var4 = 127 % ((arg2 - -43) / 63);
            return class267.method1841(-38);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "()V")
    public class151() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        ++field2552;
        int[] var3 = super.field4356.method868(arg0, (byte) -11);
        if (arg1 != -55) {
            this.method149(-90, (byte) -82);
        }
        if (super.field4356.field2258) {
            int var4 = class39.field622[arg0];
            for (int var5 = 0; var5 < class5.field63; ++var5) {
                int var6 = class105.field1838[var5];
                if (var6 > this.field2548 && ~var6 > ~(4096 - this.field2548) && -this.field2548 + 2048 < var4 && ~(this.field2548 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field2548 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field2548 + 2048) && ~var6 > ~(this.field2548 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2548;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2548 + 2048);
                } else if (~var4 <= ~this.field2548 && -this.field2548 + 4096 >= var4) {
                    if (~this.field2548 >= ~var6 && ~var6 >= ~(-this.field2548 + 4096)) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2548 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2548;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2548);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field2554;
        if (arg1 == 0) {
            this.field2548 = arg0.method1694((byte) -100);
        }
        if (arg2 != -99) {
            field2550 = -73;
        }
    }
}
