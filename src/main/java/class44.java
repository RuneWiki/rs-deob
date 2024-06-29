import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class44 extends class114 {

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    private int field659 = 585;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "[I")
    public static int[] field661 = new int[256];

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field662 = 0;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field663 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
    public class44() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "(I)V")
    public static void method289(int arg0) {
        field663 = null;
        if (arg0 != 8557) {
            field661 = null;
        }
        field661 = null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lbj;II)V")
    public final void method13(class215 arg0, int arg1, int arg2) {
        if (~arg1 == -1) {
            this.field659 = arg0.method1379(arg2 + -13032);
        }
        ++field660;
        if (arg2 != 12953) {
            method289(55);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IZ)[I")
    public final int[] method16(int arg0, boolean arg1) {
        ++field658;
        int[] var3 = super.field1630.method302(arg0, -116);
        if (arg1) {
            this.method13((class215) null, 85, -125);
        }
        if (super.field1630.field710) {
            int var4 = class159.field2209[arg0];
            for (int var5 = 0; class145.field2009 > var5; ++var5) {
                int var6 = class99.field1434[var5];
                if (var6 > this.field659 && ~var6 > ~(-this.field659 + 4096) && ~var4 < ~(2048 - this.field659) && ~(this.field659 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field659 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field659 + 2048) && 2048 - -this.field659 > var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field659;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field659);
                } else if (~this.field659 >= ~var4 && ~(-this.field659 + 4096) <= ~var4) {
                    if (~this.field659 >= ~var6 && var6 <= 4096 - this.field659) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field659);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 - 2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field659;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field659);
                }
            }
        }
        return var3;
    }
}
