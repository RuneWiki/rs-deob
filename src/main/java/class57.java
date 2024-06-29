import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class57 extends class297 {

    @OriginalMember(owner = "client!tga", name = "L", descriptor = "I")
    private int field1139 = 0;

    @OriginalMember(owner = "client!tga", name = "M", descriptor = "I")
    private int field1140 = 0;

    @OriginalMember(owner = "client!tga", name = "N", descriptor = "I")
    private int field1141 = 1365;

    @OriginalMember(owner = "client!tga", name = "Q", descriptor = "I")
    private int field1144 = 20;

    @OriginalMember(owner = "client!tga", name = "I", descriptor = "I")
    public static int field1136 = -1;

    @OriginalMember(owner = "client!tga", name = "O", descriptor = "I")
    public static int field1142 = 0;

    @OriginalMember(owner = "client!tga", name = "J", descriptor = "I")
    public static int field1137;

    @OriginalMember(owner = "client!tga", name = "K", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!tga", name = "P", descriptor = "Loha;")
    public static class738 field1143;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg2 != 31015) {
            this.method17((class215) null, 44, 80);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 == -4) {
                        this.field1139 = arg0.method1478(842397944);
                    }
                } else {
                    this.field1140 = arg0.method1478(arg2 + 842366929);
                }
            } else {
                this.field1144 = arg0.method1478(arg2 + 842366929);
            }
        } else {
            this.field1141 = arg0.method1478(842397944);
        }
        ++field1138;
    }

    @OriginalMember(owner = "client!tga", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field1137;
        int[] var3 = super.field4165.method127(0, arg0);
        if (arg1 != 255) {
            return null;
        } else {
            if (super.field4165.field266) {
                for (int var4 = 0; var4 < class525.field7275; ++var4) {
                    int var5 = (class733.field9899[var4] << 12) / this.field1141 + this.field1140;
                    int var6 = (class620.field8445[arg0] << 12) / this.field1141 + this.field1139;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (~(var11 + var12) > -16385 && ~var13 > ~this.field1144) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var7 + var11 - var12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = ~(this.field1144 - 1) >= ~var13 ? 0 : (var13 << 12) / this.field1144;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!tga", name = "f", descriptor = "(I)V")
    public static void method611(int arg0) {
        field1143 = null;
        if (arg0 < 10) {
            field1136 = 113;
        }
    }

    @OriginalMember(owner = "client!tga", name = "<init>", descriptor = "()V")
    public class57() {
        super(0, true);
    }
}
