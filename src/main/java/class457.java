import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class457 extends class298 {

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    private int field6436 = 1;

    @OriginalMember(owner = "client!sp", name = "S", descriptor = "I")
    private int field6444 = 1;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    private int field6437 = 204;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "Lsd;")
    public static class74 field6439 = new class74(78, -1);

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    public static int field6438;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!sp", name = "Q", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!sp", name = "R", descriptor = "I")
    public static int field6443;

    @OriginalMember(owner = "client!sp", name = "T", descriptor = "I")
    public static int field6445;

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "(I)V", line = 4)
    public static final void method2691(int arg0) {
        for (class399 var1 = (class399) class445.field6339.method802((byte) 125); var1 != null; var1 = (class399) class445.field6339.method806((byte) 104)) {
            if (var1.field5678) {
                var1.method2386(0);
            }
        }
        ++field6438;
        if (arg0 == -1) {
            for (class399 var2 = (class399) class53.field689.method802((byte) 127); var2 != null; var2 = (class399) class53.field689.method806((byte) 104)) {
                if (var2.field5678) {
                    var2.method2386(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V", line = 38)
    public class457() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "(I)Z", line = 43)
    public static final boolean method2692(int arg0) {
        if (arg0 >= -12) {
            method2693(-50);
        }
        ++field6445;
        return class475.field6674;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILvt;)V", line = 59)
    public final void method10(int arg0, int arg1, class179 arg2) {
        if (arg0 <= -44) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        this.field6437 = arg2.method916(21933);
                    }
                } else {
                    this.field6436 = arg2.method895((byte) -128);
                }
            } else {
                this.field6444 = arg2.method895((byte) -74);
            }
            ++field6441;
        }
    }

    @OriginalMember(owner = "client!sp", name = "e", descriptor = "(I)V", line = 103)
    public static void method2693(int arg0) {
        field6439 = null;
        if (arg0 != 5713) {
            field6439 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZ)[I", line = 125)
    public final int[] method13(int arg0, boolean arg1) {
        ++field6440;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (super.field4443.field6915) {
            for (int var4 = 0; class158.field1877 > var4; ++var4) {
                int var5 = class236.field3260[var4];
                int var6 = class156.field1865[arg0];
                int var7 = this.field6444 * var5 >> 12;
                int var8 = this.field6436 * var6 >> 12;
                int var9 = var5 % (4096 / this.field6444) * this.field6444;
                int var10 = var6 % (4096 / this.field6436) * this.field6436;
                if (this.field6437 > var10) {
                    for (var7 -= var8; ~var7 > -1; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field6437 < ~var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field6437 > var9) {
                    int var11;
                    for (var11 = var7 - var8; var11 < 0; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (~var11 < -1) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (!arg1) {
            method2693(5);
        }
        return var3;
    }
}
