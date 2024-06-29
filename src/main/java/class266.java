import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class266 extends class224 {

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    private int field4275 = 585;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field4271 = 0;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field4268 = 0;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field4269;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "Ld;")
    public static class237 field4272;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "[[[Lsj;")
    public static class49[][][] field4273;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class266() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IBILdl;)Lfg;")
    public static final class12 method1817(int arg0, byte arg1, int arg2, class123 arg3) {
        ++field4270;
        if (!class214.method1445((byte) 122, arg3, arg0, arg2)) {
            return null;
        } else {
            if (arg1 != -24) {
                field4268 = 20;
            }
            return class246.method1660((byte) 125);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        if (arg2 < -46) {
            if (arg1 == 0) {
                this.field4275 = arg0.method190(-3);
            }
            ++field4274;
        }
    }

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "(I)V")
    public static void method1818(int arg0) {
        field4272 = null;
        field4273 = null;
        int var1 = -14 / ((-70 - arg0) / 42);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)[I")
    public final int[] method14(int arg0, boolean arg1) {
        ++field4269;
        int[] var3 = super.field3625.method1862(arg0, (byte) 52);
        if (super.field3625.field4425) {
            int var4 = class251.field4018[arg0];
            for (int var5 = 0; class78.field1108 > var5; ++var5) {
                int var6 = class243.field3893[var5];
                if (~var6 < ~this.field4275 && var6 < -this.field4275 + 4096 && -this.field4275 + 2048 < var4 && 2048 - -this.field4275 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field4275 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (var6 > -this.field4275 + 2048 && ~(this.field4275 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 > -1 ? -var11 : var11;
                    int var13 = var12 - this.field4275;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field4275);
                } else if (~var4 <= ~this.field4275 && var4 <= -this.field4275 + 4096) {
                    if (this.field4275 <= var6 && 4096 - this.field4275 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field4275 + 2048);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field4275;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field4275 + 2048);
                }
            }
        }
        if (!arg1) {
            method1818(-113);
        }
        return var3;
    }
}
