import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class299 extends class30 {

    @OriginalMember(owner = "client!ofa", name = "B", descriptor = "I")
    private int field4072 = 0;

    @OriginalMember(owner = "client!ofa", name = "C", descriptor = "I")
    private int field4073 = 1;

    @OriginalMember(owner = "client!ofa", name = "J", descriptor = "I")
    private int field4080 = 0;

    @OriginalMember(owner = "client!ofa", name = "z", descriptor = "Lfaa;")
    public static class139 field4071 = new class139(64);

    @OriginalMember(owner = "client!ofa", name = "G", descriptor = "F")
    public static float field4077 = 0.0F;

    @OriginalMember(owner = "client!ofa", name = "H", descriptor = "I")
    public static int field4078 = 0;

    @OriginalMember(owner = "client!ofa", name = "D", descriptor = "I")
    public static int field4074;

    @OriginalMember(owner = "client!ofa", name = "E", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!ofa", name = "F", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!ofa", name = "I", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(BILac;)V")
    public final void method27(byte arg0, int arg1, class501 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -4) {
                    this.field4073 = arg2.method2874((byte) -75);
                }
            } else {
                this.field4072 = arg2.method2874((byte) -75);
            }
        } else {
            this.field4080 = arg2.method2874((byte) -75);
        }
        if (arg0 <= 100) {
            this.field4080 = 28;
        }
        ++field4075;
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)V")
    public final void method29(byte arg0) {
        class118.method841(0);
        if (arg0 >= -10) {
            field4078 = 76;
        }
        ++field4074;
    }

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "(B)V")
    public static void method1811(byte arg0) {
        if (arg0 != 5) {
            field4077 = 1.0526223F;
        }
        field4071 = null;
    }

    @OriginalMember(owner = "client!ofa", name = "<init>", descriptor = "()V")
    public class299() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZ)V")
    public static final void method1812(String arg0, String arg1, int arg2, boolean arg3) {
        class124.field1793 = arg2;
        class76.field997 = 2;
        ++field4079;
        if (arg3) {
            class72.method577(arg0, -114, false, arg1);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(II)[I")
    public final int[] method48(int arg0, int arg1) {
        ++field4076;
        if (arg0 != 1) {
            this.method27((byte) -64, 34, (class501) null);
        }
        int[] var3 = super.field374.method3664(arg1, (byte) 8);
        if (super.field374.field9032) {
            int var4 = class430.field6016[arg1];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class31.field399 > var6; ++var6) {
                int var7 = class48.field568[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field4080 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field4073 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field4073;
                }
                int var12 = var11 - (-4096 & var11);
                if (this.field4072 != 0) {
                    if (this.field4072 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class256.field3495[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
