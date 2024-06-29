import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public abstract class class611 extends class20 {

    @OriginalMember(owner = "client!lw", name = "D", descriptor = "S")
    public static short field8755 = 32767;

    @OriginalMember(owner = "client!lw", name = "B", descriptor = "F")
    public static float field8753;

    @OriginalMember(owner = "client!lw", name = "C", descriptor = "I")
    public static int field8754;

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "I")
    public static int field8757;

    @OriginalMember(owner = "client!lw", name = "G", descriptor = "I")
    public static int field8758;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
    public static int field8759;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
    public static int field8760;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "I")
    public static int field8761;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
    public static int field8762;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "I")
    public static int field8763;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "I")
    public static int field8764;

    @OriginalMember(owner = "client!lw", name = "N", descriptor = "I")
    public static int field8765;

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "Ljava/lang/Thread;")
    public static Thread field8756;

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "([Lul;I)I", line = 3)
    public final int method340(class530[] arg0, int arg1) {
        if (arg1 != -1) {
            return -71;
        } else {
            ++field8757;
            return this.method336(arg0, 87, super.field531 >> class295.field3981, super.field530 >> class295.field3981);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILr;)V", line = 14)
    public static final void method3501(int arg0, class165 arg1) {
        if (!class120.field1561) {
            class112.method804(arg0 ^ 117, arg1);
        } else {
            class326.method1902(113, arg1);
        }
        if (arg0 == 0) {
            ++field8759;
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(IIIII)V", line = 32)
    public class611(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super.field531 = arg2;
        super.field530 = arg0;
        super.field527 = arg1;
        super.field532 = (byte) arg3;
        super.field535 = (byte) arg4;
    }

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)Z", line = 45)
    public final boolean method167(byte arg0) {
        ++field8754;
        if (arg0 != 118) {
            field8755 = 60;
        }
        return false;
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIZLr;ILub;I)V", line = 56)
    public final void method169(int arg0, int arg1, boolean arg2, class165 arg3, int arg4, class20 arg5, int arg6) {
        if (arg4 < 113) {
            method3503(-96);
        }
        ++field8764;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lw", name = "h", descriptor = "(I)V", line = 73)
    public final void method163(int arg0) {
        int var2 = 28 % ((arg0 - 35) / 54);
        ++field8761;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lw", name = "j", descriptor = "(I)Z", line = 83)
    public final boolean method339(int arg0) {
        ++field8762;
        int var2 = -125 % ((arg0 - 51) / 47);
        return class616.field8849[(super.field530 >> class295.field3981) + class119.field1526 - class591.field8564][(super.field531 >> class295.field3981) + -class33.field663 + class119.field1526];
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(Lr;I)V", line = 93)
    public static final void method3502(class165 arg0, int arg1) {
        ++field8758;
        arg0.method292(0, 0, class467.field6533, 350);
        arg0.method248(0, 0, class467.field6533, 350, class112.field1433 << 24 | 3351159, 1);
        int var2 = 350 / class34.field681;
        if (~class567.field8285 < -1) {
            int var3 = 346 - (class34.field681 + 4);
            int var4 = var2 * var3 / (class567.field8285 + var2 + -1);
            int var5 = 4;
            if (class567.field8285 > 1) {
                var5 += (class567.field8285 + -1 - class405.field5743) * (-var4 + var3) / (class567.field8285 - 1);
            }
            arg0.method248(class467.field6533 + -16, var5, 12, var4, class112.field1433 << 24 | 3351159, 2);
            for (int var6 = class405.field5743; class405.field5743 - -var2 > var6 && ~class567.field8285 < ~var6; ++var6) {
                String[] var7 = class72.method637('\b', false, class652.field9237[var6]);
                int var8 = (class467.field6533 + -8 + -16) / var7.length;
                for (int var9 = 0; var7.length > var9; ++var9) {
                    int var10 = var8 * var9 + 8;
                    arg0.method292(var10, 0, var10 + -8 + var8, 350);
                    class657.field9330.method2515(-16777216, 0, -1, class635.method3630(var7[var9], arg1 ^ 26973), -class417.field5909.field833 + 350 + -((-class405.field5743 + var6) * class34.field681) - (class114.field1472 - -2), var10);
                }
            }
        }
        class242.field3330.method2521(class467.field6533 + -25, -1, 330, -16777216, "Build: 623", -1);
        arg0.method292(0, 0, class467.field6533, 350);
        arg0.method1039(class467.field6533, -1, -class114.field1472 + 350, (byte) -109, 0);
        class36.field691.method2515(-16777216, 0, -1, "--> " + class635.method3630(class220.field2850, -99), -class12.field205.field833 + 349, 10);
        if (class190.field2319) {
            int var11 = -1;
            if (~(class543.field7882 % 30) < -16) {
                var11 = 16777215;
            }
            arg0.method1045((byte) 54, class12.field205.method553("--> " + class635.method3630(class220.field2850, arg1 + 26817).substring(0, class603.field8700), arg1 + 27003) + 10, 12, var11, -class12.field205.field833 + 350 + -11);
        }
        if (arg1 != -26942) {
            method3503(-57);
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(I)V", line = 160)
    public static void method3503(int arg0) {
        if (arg0 <= 114) {
            method3501(23, (class165) null);
        }
        field8756 = null;
    }

    @OriginalMember(owner = "client!lw", name = "d", descriptor = "(B)Z", line = 172)
    public final boolean method335(byte arg0) {
        ++field8760;
        int var2 = 63 / ((arg0 - -19) / 60);
        class182 var3 = class603.method3476(super.field532, super.field530 >> class295.field3981, super.field531 >> class295.field3981);
        return var3 != null && var3.field2227.field763 ? class579.method3380(super.field532, (byte) -58, var3.field2227.method173(32249) + this.method173(32249), super.field531 >> class295.field3981, super.field530 >> class295.field3981) : class124.method860(super.field531 >> class295.field3981, false, super.field532, super.field530 >> class295.field3981);
    }
}
