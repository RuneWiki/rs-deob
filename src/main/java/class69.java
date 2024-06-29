import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class69 extends class17 {

    @OriginalMember(owner = "client!jt", name = "H", descriptor = "I")
    private int field872 = 0;

    @OriginalMember(owner = "client!jt", name = "K", descriptor = "I")
    private int field875 = 1;

    @OriginalMember(owner = "client!jt", name = "G", descriptor = "I")
    private int field871 = 0;

    @OriginalMember(owner = "client!jt", name = "J", descriptor = "I")
    public static int field874 = -50;

    @OriginalMember(owner = "client!jt", name = "M", descriptor = "Ltn;")
    public static class60 field877 = new class60(49, 7);

    @OriginalMember(owner = "client!jt", name = "F", descriptor = "I")
    public static int field870;

    @OriginalMember(owner = "client!jt", name = "I", descriptor = "I")
    public static int field873;

    @OriginalMember(owner = "client!jt", name = "N", descriptor = "I")
    public static int field878;

    @OriginalMember(owner = "client!jt", name = "O", descriptor = "I")
    public static int field879;

    @OriginalMember(owner = "client!jt", name = "P", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!jt", name = "L", descriptor = "Lce;")
    public static class206 field876;

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method27(int arg0, int arg1) {
        ++field879;
        int[] var3 = super.field210.method2683(-17, arg0);
        if (super.field210.field6442) {
            int var4 = class40.field427[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~var6 > ~class530.field7763; ++var6) {
                int var7 = class492.field6966[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field872 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field875 * var10) * 3.141592653589793D);
                } else {
                    var11 = (var7 - var4) * this.field875;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field871 == -1) {
                    var12 = class68.field861[(var12 & 4095) >> 4] - -4096 >> 1;
                } else if (this.field871 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg1 <= 53) {
            this.field872 = 86;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jt", name = "<init>", descriptor = "()V", line = 78)
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jt", name = "h", descriptor = "(I)V", line = 98)
    public static void method533(int arg0) {
        field876 = null;
        if (arg0 != -4096) {
            method533(5);
        }
        field877 = null;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(FFFI)F", line = 109)
    public static final float method534(float arg0, float arg1, float arg2, int arg3) {
        if (arg3 <= 43) {
            field877 = null;
        }
        ++field878;
        return (-arg0 + arg1) * arg2 + arg0;
    }

    @OriginalMember(owner = "client!jt", name = "a", descriptor = "(Lwm;II)V", line = 120)
    public final void method34(class403 arg0, int arg1, int arg2) {
        if (arg2 == 5159) {
            if (~arg1 != -1) {
                if (~arg1 != -2) {
                    if (arg1 == 3) {
                        this.field875 = arg0.method2357((byte) 127);
                    }
                } else {
                    this.field871 = arg0.method2357((byte) 127);
                }
            } else {
                this.field872 = arg0.method2357((byte) 120);
            }
            ++field880;
        }
    }

    @OriginalMember(owner = "client!jt", name = "g", descriptor = "(I)V", line = 167)
    public final void method31(int arg0) {
        if (arg0 == -9) {
            class341.method2034(true);
            ++field870;
        }
    }
}
