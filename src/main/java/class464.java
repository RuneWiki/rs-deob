import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class464 extends class45 {

    @OriginalMember(owner = "client!pb", name = "H", descriptor = "I")
    private int field6939 = 585;

    @OriginalMember(owner = "client!pb", name = "L", descriptor = "[I")
    public static int[] field6943 = new int[4096];

    @OriginalMember(owner = "client!pb", name = "I", descriptor = "I")
    public static int field6940;

    @OriginalMember(owner = "client!pb", name = "K", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!pb", name = "M", descriptor = "Loa;")
    public static class489 field6944;

    @OriginalMember(owner = "client!pb", name = "J", descriptor = "[[B")
    public static byte[][] field6941;

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "()V")
    public class464() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Z)V")
    public static void method2760(boolean arg0) {
        field6941 = null;
        field6943 = null;
        field6944 = null;
        if (!arg0) {
            method2760(true);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lcu;II)V")
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 != -26471) {
            method2760(false);
        }
        if (~arg2 == -1) {
            this.field6939 = arg0.method1069((byte) -73);
        }
        ++field6942;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(II)[I")
    public final int[] method35(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field6940;
            int[] var3 = super.field854.method863((byte) 12, arg1);
            if (super.field854.field1928) {
                int var4 = class433.field6429[arg1];
                for (int var5 = 0; var5 < class259.field3768; ++var5) {
                    int var6 = class69.field1199[var5];
                    if (this.field6939 < var6 && ~var6 > ~(-this.field6939 + 4096) && var4 > -this.field6939 + 2048 && var4 < this.field6939 + 2048) {
                        int var7 = 2048 - var6;
                        int var8 = ~var7 > -1 ? -var7 : var7;
                        int var9 = var8 << 12;
                        int var10 = var9 / (2048 - this.field6939);
                        var3[var5] = -var10 + 4096;
                    } else if (~var6 < ~(-this.field6939 + 2048) && var6 < this.field6939 + 2048) {
                        int var11 = var4 + -2048;
                        int var12 = var11 >= 0 ? var11 : -var11;
                        int var13 = var12 - this.field6939;
                        int var14 = var13 << 12;
                        var3[var5] = var14 / (2048 - this.field6939);
                    } else if (~this.field6939 >= ~var4 && -this.field6939 + 4096 >= var4) {
                        if (~var6 <= ~this.field6939 && ~(-this.field6939 + 4096) <= ~var6) {
                            var3[var5] = 0;
                        } else {
                            int var15 = -var4 + 2048;
                            int var16 = ~var15 > -1 ? -var15 : var15;
                            int var17 = var16 << 12;
                            int var18 = var17 / (-this.field6939 + 2048);
                            var3[var5] = -var18 + 4096;
                        }
                    } else {
                        int var19 = var6 + -2048;
                        int var20 = var19 >= 0 ? var19 : -var19;
                        int var21 = var20 - this.field6939;
                        int var22 = var21 << 12;
                        var3[var5] = var22 / (2048 - this.field6939);
                    }
                }
            }
            return var3;
        }
    }

    static {
        for (int var0 = 0; ~var0 > -4097; ++var0) {
            field6943[var0] = class487.method2889((byte) -98, var0);
        }
    }
}
