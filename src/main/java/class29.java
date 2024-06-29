import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class29 extends class470 {

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "[I")
    public static int[] field482 = new int[13];

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field489;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIB)V")
    public final void method309(int arg0, int arg1, byte arg2) {
        if (arg2 <= -95) {
            ++field491;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)V")
    public final void method310(int arg0, int arg1, int arg2) {
        int var4 = 6 / ((-1 - arg0) / 39);
        ++field488;
        int var5 = this.field487 * arg2 >> 12;
        int var6 = this.field495 * arg1 >> 12;
        int var7 = this.field492 * arg2 >> 12;
        int var8 = this.field486 * arg1 >> 12;
        int var9 = this.field493 * arg2 >> 12;
        int var10 = this.field497 * arg1 >> 12;
        int var11 = this.field494 * arg2 >> 12;
        int var12 = this.field483 * arg1 >> 12;
        class96.method689(var6, super.field6611, var5, (byte) 96, var12, var7, var11, var9, var8, var10);
    }

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "(I)V")
    public static void method311(int arg0) {
        if (arg0 == 15084652) {
            field482 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IIII)I")
    public static final int method312(int arg0, int arg1, int arg2, int arg3) {
        ++field489;
        if (arg2 > -119) {
            field482 = null;
        }
        int var4 = arg0 & 3;
        if (~var4 == -1) {
            return arg1;
        } else if (var4 == 1) {
            return -arg3 + 7;
        } else {
            return ~var4 == -3 ? -arg1 + 7 : arg3;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBI)V")
    public final void method313(int arg0, byte arg1, int arg2) {
        if (arg1 < -99) {
            ++field490;
        }
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field495 = arg1;
        this.field486 = arg3;
        this.field493 = arg4;
        this.field494 = arg6;
        this.field483 = arg7;
        this.field487 = arg0;
        this.field492 = arg2;
        this.field497 = arg5;
    }
}
