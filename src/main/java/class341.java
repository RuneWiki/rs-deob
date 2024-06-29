import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class341 extends class440 {

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    private int field5005 = 585;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "Ldg;")
    public static class376 field5004 = new class376(1, 3);

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field5008 = 7000;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "Lmf;")
    public static class382 field5007 = new class382(260);

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V", line = 130)
    public class341() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)[I", line = 11)
    public final int[] method229(byte arg0, int arg1) {
        ++field5003;
        int[] var3 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            int var4 = class418.field6099[arg1];
            for (int var5 = 0; ~class549.field7715 < ~var5; ++var5) {
                int var6 = class499.field7073[var5];
                if (~var6 < ~this.field5005 && ~(4096 - this.field5005) < ~var6 && var4 > -this.field5005 + 2048 && var4 < 2048 - -this.field5005) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 < 0 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field5005 + 2048);
                    var3[var5] = 4096 - var10;
                } else if (~var6 < ~(-this.field5005 + 2048) && var6 < this.field5005 + 2048) {
                    int var11 = var4 - 2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field5005;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field5005 + 2048);
                } else if (~this.field5005 >= ~var4 && ~(-this.field5005 + 4096) <= ~var4) {
                    if (~var6 <= ~this.field5005 && 4096 - this.field5005 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field5005 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field5005;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field5005);
                }
            }
        }
        int var23 = 115 % ((arg0 - -56) / 41);
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILmo;I)V", line = 90)
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field5005 = arg1.method3847((byte) 118);
        }
        if (arg0 != 5) {
            this.method229((byte) -31, -23);
        }
        ++field5006;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V", line = 116)
    public static void method2132(byte arg0) {
        field5007 = null;
        field5004 = null;
        if (arg0 >= -114) {
            field5008 = -119;
        }
    }
}
