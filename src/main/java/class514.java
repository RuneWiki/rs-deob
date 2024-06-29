import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class514 extends class217 {

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    private int field7329;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "I")
    private int field7337;

    @OriginalMember(owner = "client!cn", name = "E", descriptor = "I")
    private int field7344;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    private int field7332;

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    private int field7339;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "I")
    private int field7333;

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    private int field7341;

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "I")
    private int field7342;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public static int field7334 = 1;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field7330 = -1;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "Lpia;")
    public static class94 field7340 = new class94(46, 11);

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "I")
    public static int field7331;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    public static int field7338;

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    public static int field7343;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "[Lwi;")
    public static class464[] field7327;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)V")
    public final void method1267(int arg0, int arg1, int arg2) {
        if (arg0 != -5) {
            method3036((byte) -58);
        }
        ++field7336;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class514(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field7329 = arg3;
        this.field7337 = arg4;
        this.field7344 = arg5;
        this.field7332 = arg6;
        this.field7339 = arg1;
        this.field7333 = arg2;
        this.field7341 = arg7;
        this.field7342 = arg0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static final void method3034(int arg0) {
        ++field7326;
        class122.field1285 = 0;
        class410.field5607 = 0;
        class119.field1229 = false;
        class675.field9565 = new class464[1000];
        class431.field6321 = new class464[2000];
        class382.field5231 = 0;
        class280.field3432 = new int[class723.field10134][class284.field3473 - -1][class151.field1664 + 1];
        class494.field7001 = class559.field7987;
        class634.field9111 = class559.field7987;
        class738.field10311 = 0;
        if (arg0 < -46) {
            field7327 = new class464[500];
            class228.field2600 = new class464[500];
            if (!(class563.field8026 instanceof class692)) {
                class114.field1198 = true;
            } else {
                class114.field1198 = false;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V")
    public static final void method3035(byte arg0) {
        ++field7338;
        if (~class461.field6567 == -6) {
            if (arg0 >= -96) {
                method3035((byte) -93);
            }
            class461.field6567 = 6;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
    public static void method3036(byte arg0) {
        field7327 = null;
        field7340 = null;
        if (arg0 != -31) {
            field7327 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIB)V")
    public final void method1268(int arg0, int arg1, byte arg2) {
        ++field7328;
        int var4 = this.field7342 * arg1 >> 12;
        int var5 = this.field7339 * arg0 >> 12;
        int var6 = this.field7333 * arg1 >> 12;
        if (arg2 == -39) {
            int var7 = this.field7329 * arg0 >> 12;
            int var8 = this.field7337 * arg1 >> 12;
            int var9 = this.field7344 * arg0 >> 12;
            int var10 = this.field7332 * arg1 >> 12;
            int var11 = this.field7341 * arg0 >> 12;
            class623.method3560(var5, super.field2520, var6, var7, var4, var11, (byte) -101, var9, var8, var10);
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)V")
    public static final void method3037(int arg0) {
        class82.field858.method342(class501.field7036, ~class654.field9334.field9848.method3892(arg0 ^ 22215) != -2 ? -1 : class294.field3624 - -256 << 2, 0);
        if (arg0 != -22201) {
            field7340 = null;
        }
        ++field7343;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIZ)V")
    public final void method1265(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            this.field7339 = -57;
        }
        ++field7335;
    }
}
