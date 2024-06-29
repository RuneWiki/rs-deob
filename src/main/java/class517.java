import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class517 extends class297 {

    @OriginalMember(owner = "client!dn", name = "J", descriptor = "I")
    private int field7199 = 0;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "I")
    private int field7201 = 1;

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "I")
    private int field7203 = 0;

    @OriginalMember(owner = "client!dn", name = "I", descriptor = "I")
    public static int field7198;

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "I")
    public static int field7200;

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "Lmu;")
    public static class303 field7204;

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V")
    public class517() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field7198;
        if (arg2 != 31015) {
            this.field7199 = -15;
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 3) {
                    this.field7201 = arg0.method1535(255);
                }
            } else {
                this.field7203 = arg0.method1535(255);
            }
        } else {
            this.field7199 = arg0.method1535(255);
        }
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)V")
    public final void method711(int arg0) {
        class45.method545(26188);
        if (arg0 <= 108) {
            method3020(-17);
        }
        ++field7200;
    }

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "(I)V")
    public static void method3020(int arg0) {
        if (arg0 != 0) {
            field7204 = null;
        }
        field7204 = null;
    }

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field7202;
        int[] var3 = super.field4165.method127(0, arg0);
        if (arg1 != 255) {
            this.field7199 = -74;
        }
        if (super.field4165.field266) {
            int var4 = class620.field8445[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class525.field7275 < ~var6; ++var6) {
                int var7 = class733.field9899[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field7199 == -1) {
                    var9 = (-var4 + var7) * this.field7201;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field7201 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field7203 != 0) {
                    if (this.field7203 == 2) {
                        var12 -= 2048;
                        if (var12 < 0) {
                            var12 = -var12;
                        }
                        var12 = 2048 - var12 << 1;
                    }
                } else {
                    var12 = class309.field4295[var12 >> 4 & 255] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }
}
