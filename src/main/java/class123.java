import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class123 extends class328 {

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "I")
    private int field1956 = 0;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    private int field1957 = 16;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    private int field1958 = 2000;

    @OriginalMember(owner = "client!jl", name = "G", descriptor = "I")
    private int field1961 = 0;

    @OriginalMember(owner = "client!jl", name = "H", descriptor = "I")
    private int field1962 = 4096;

    @OriginalMember(owner = "client!jl", name = "E", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!jl", name = "F", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!jl", name = "I", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!jl", name = "J", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
    public class123() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V")
    public final void method2(int arg0) {
        if (arg0 >= -97) {
            this.method4(21, -2);
        }
        ++field1960;
        class83.method761(true);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BILco;)V")
    public final void method1(byte arg0, int arg1, class268 arg2) {
        ++field1963;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 == 4) {
                            this.field1962 = arg2.method1745(32132);
                        }
                    } else {
                        this.field1961 = arg2.method1745(32132);
                    }
                } else {
                    this.field1957 = arg2.method1738(255);
                }
            } else {
                this.field1958 = arg2.method1745(32132);
            }
        } else {
            this.field1956 = arg2.method1738(255);
        }
        if (arg0 < 75) {
            this.field1961 = 90;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method984(String arg0, int arg1) {
        ++field1964;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            var3 = class365.method2205(arg0.charAt(var4), 82) + (var3 << 5) + -var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field1959;
        int[] var3 = super.field4720.method2872(1, arg0);
        int var4 = -110 / ((48 - arg1) / 56);
        if (super.field4720.field7109) {
            int var5 = this.field1962 >> 1;
            int[][] var6 = super.field4720.method2874(-22531);
            Random var7 = new Random((long) this.field1956);
            for (int var8 = 0; var8 < this.field1958; ++var8) {
                int var9 = ~this.field1962 >= -1 ? this.field1961 : this.field1961 + -var5 + class407.method2472(-94, var7, this.field1962);
                int var10 = (4095 & var9) >> 4;
                int var11 = class407.method2472(86, var7, class449.field6539);
                int var12 = class407.method2472(107, var7, class527.field7334);
                int var13 = (class38.field514[var10] * this.field1957 >> 12) + var11;
                int var14 = (class306.field4403[var10] * this.field1957 >> 12) + var12;
                int var15 = -var12 + var14;
                int var16 = -var11 + var13;
                if (var16 != 0 || var15 != 0) {
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var17 = ~var16 > ~var15;
                    if (var17) {
                        int var18 = var11;
                        int var19 = var13;
                        var11 = var12;
                        var13 = var14;
                        var12 = var18;
                        var14 = var19;
                    }
                    if (~var11 < ~var13) {
                        int var20 = var11;
                        var11 = var13;
                        int var21 = var12;
                        var12 = var14;
                        var13 = var20;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = var13 - var11;
                    int var24 = -var12 + var14;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = 1024 - (class407.method2472(98, var7, 4096) >> 2);
                    if (var24 < 0) {
                        var24 = -var24;
                    }
                    int var28 = ~var12 > ~var14 ? 1 : -1;
                    for (int var29 = var11; var13 > var29; ++var29) {
                        int var30 = (-var11 + var29) * var26 + 1024 + var27;
                        int var31 = var29 & class108.field1799;
                        int var32 = class589.field8379 & var22;
                        var25 += var24;
                        if (var17) {
                            var6[var32][var31] = var30;
                        } else {
                            var6[var31][var32] = var30;
                        }
                        if (~var25 < -1) {
                            var22 += var28;
                            var25 += -var23;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
