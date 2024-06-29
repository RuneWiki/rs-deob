import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class91 extends class276 {

    @OriginalMember(owner = "client!qg", name = "P", descriptor = "I")
    private int field1606 = 585;

    @OriginalMember(owner = "client!qg", name = "S", descriptor = "Lrc;")
    public static class9 field1609 = new class9(50);

    @OriginalMember(owner = "client!qg", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1611 = "Your friend list is full. Max of 100 for free users, and 200 for members.";

    @OriginalMember(owner = "client!qg", name = "M", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!qg", name = "N", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!qg", name = "O", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!qg", name = "Q", descriptor = "I")
    public static int field1607;

    @OriginalMember(owner = "client!qg", name = "R", descriptor = "I")
    public static int field1608;

    @OriginalMember(owner = "client!qg", name = "W", descriptor = "Lbl;")
    public static class137 field1613;

    @OriginalMember(owner = "client!qg", name = "T", descriptor = "Lud;")
    public static class51 field1610;

    @OriginalMember(owner = "client!qg", name = "V", descriptor = "[[[B")
    public static byte[][][] field1612;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method588(int arg0, boolean arg1, int arg2) {
        ++field1603;
        if (arg1 && arg2 >= 0) {
            if (arg0 != -2048) {
                method588(-124, true, 16);
            }
            return class89.method581(10, arg2, arg1, -125);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!qg", name = "<init>", descriptor = "()V")
    public class91() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field1604;
        if (arg0 < 39) {
            this.field1606 = -87;
        }
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int var4 = class206.field3389[arg1];
            for (int var5 = 0; class53.field929 > var5; ++var5) {
                int var6 = class175.field2883[var5];
                if (~this.field1606 > ~var6 && ~var6 > ~(4096 - this.field1606) && ~(-this.field1606 + 2048) > ~var4 && ~(this.field1606 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 > -1 ? -var7 : var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field1606 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (~var6 < ~(-this.field1606 + 2048) && ~(this.field1606 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field1606;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1606);
                } else if (~this.field1606 >= ~var4 && ~(-this.field1606 + 4096) <= ~var4) {
                    if (~var6 <= ~this.field1606 && var6 <= -this.field1606 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (2048 - this.field1606);
                        var3[var5] = 4096 - var18;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 >= 0 ? var19 : -var19;
                    int var21 = var20 - this.field1606;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field1606 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qg", name = "g", descriptor = "(I)V")
    public static void method589(int arg0) {
        field1613 = null;
        if (arg0 >= 22) {
            field1609 = null;
            field1610 = null;
            field1611 = null;
            field1612 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field1608;
        if (arg0 == 0) {
            this.field1606 = arg1.method677(false);
        }
        if (arg2 != -1) {
            field1613 = null;
        }
    }
}
