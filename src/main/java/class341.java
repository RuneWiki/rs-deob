import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public class class341 extends class297 {

    @OriginalMember(owner = "client!gd", name = "I", descriptor = "I")
    private int field4796 = 1;

    @OriginalMember(owner = "client!gd", name = "L", descriptor = "I")
    private int field4799 = 204;

    @OriginalMember(owner = "client!gd", name = "M", descriptor = "I")
    private int field4800 = 1;

    @OriginalMember(owner = "client!gd", name = "J", descriptor = "[I")
    public static int[] field4797 = new int[2];

    @OriginalMember(owner = "client!gd", name = "O", descriptor = "I")
    public static int field4802 = -1;

    @OriginalMember(owner = "client!gd", name = "K", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!gd", name = "N", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Lcea;II)V")
    public final void method17(class215 arg0, int arg1, int arg2) {
        ++field4801;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    this.field4799 = arg0.method1478(842397944);
                }
            } else {
                this.field4796 = arg0.method1535(255);
            }
        } else {
            this.field4800 = arg0.method1535(arg2 ^ 31192);
        }
        if (arg2 != 31015) {
            this.method15(-14, -114);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "()V")
    public class341() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "(I)V")
    public static void method2155(int arg0) {
        if (arg0 == 4) {
            field4797 = null;
        }
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field4798;
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            for (int var4 = 0; var4 < class525.field7275; ++var4) {
                int var5 = class733.field9899[var4];
                int var6 = class620.field8445[arg0];
                int var7 = this.field4800 * var5 >> 12;
                int var8 = this.field4796 * var6 >> 12;
                int var9 = var5 % (4096 / this.field4800) * this.field4800;
                int var10 = var6 % (4096 / this.field4796) * this.field4796;
                if (~this.field4799 < ~var10) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (this.field4799 > var9) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~this.field4799 < ~var9) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != 255) {
            field4797 = null;
        }
        return var3;
    }
}
