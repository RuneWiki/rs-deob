import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class176 extends class334 {

    @OriginalMember(owner = "client!np", name = "N", descriptor = "I")
    private int field2651 = 0;

    @OriginalMember(owner = "client!np", name = "M", descriptor = "I")
    private int field2650 = 1365;

    @OriginalMember(owner = "client!np", name = "O", descriptor = "I")
    private int field2652 = 20;

    @OriginalMember(owner = "client!np", name = "P", descriptor = "I")
    private int field2653 = 0;

    @OriginalMember(owner = "client!np", name = "K", descriptor = "Lsv;")
    public static class570 field2649 = new class570(66, -1);

    @OriginalMember(owner = "client!np", name = "R", descriptor = "F")
    public static float field2655;

    @OriginalMember(owner = "client!np", name = "E", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!np", name = "F", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!np", name = "G", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!np", name = "I", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!np", name = "Q", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!np", name = "H", descriptor = "J")
    public static long field2646;

    @OriginalMember(owner = "client!np", name = "J", descriptor = "Lgga;")
    public static class513 field2648;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)[I")
    public final int[] method28(int arg0, int arg1) {
        ++field2644;
        if (arg1 != -22563988) {
            return null;
        } else {
            int[] var3 = super.field4743.method1027((byte) -119, arg0);
            if (super.field4743.field1993) {
                for (int var4 = 0; ~var4 > ~class439.field6099; ++var4) {
                    int var5 = (class295.field4296[var4] << 12) / this.field2650 + this.field2653;
                    int var6 = (class527.field7361[arg0] << 12) / this.field2650 + this.field2651;
                    int var7 = var5;
                    int var8 = var6;
                    int var9 = var5;
                    int var10 = var6;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var6 * var6 >> 12;
                    int var13 = 0;
                    while (var11 - -var12 < 16384 && this.field2652 > var13) {
                        var10 = (var9 * var10 >> 12) * 2 + var8;
                        var9 = var7 + var11 + -var12;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                        var11 = var9 * var9 >> 12;
                    }
                    var3[var4] = ~var13 <= ~(this.field2652 + -1) ? 0 : (var13 << 12) / this.field2652;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IZLol;)V")
    public final void method29(int arg0, boolean arg1, class431 arg2) {
        ++field2645;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        this.field2651 = arg2.method2565((byte) -120);
                    }
                } else {
                    this.field2653 = arg2.method2565((byte) -127);
                }
            } else {
                this.field2652 = arg2.method2565((byte) -100);
            }
        } else {
            this.field2650 = arg2.method2565((byte) -111);
        }
        if (arg1) {
            this.method29(104, false, (class431) null);
        }
    }

    @OriginalMember(owner = "client!np", name = "g", descriptor = "(I)V")
    public static void method1290(int arg0) {
        field2649 = null;
        field2648 = null;
        if (arg0 != -14458) {
            field2654 = 2;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(IBIII)V")
    public static final void method1291(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field2643;
        if (~class515.field7102 >= ~arg3 && arg3 <= class698.field9801) {
            int var5 = class645.method3656(class435.field6058, class742.field10301, arg2, 26289);
            int var6 = class645.method3656(class435.field6058, class742.field10301, arg4, 26289);
            class341.method2097(true, arg0, arg3, var5, var6);
        }
        if (arg1 >= -64) {
            method1290(113);
        }
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "()V")
    public class176() {
        super(0, true);
    }
}
