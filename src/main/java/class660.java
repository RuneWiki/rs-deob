import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class660 {

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    private int field9375;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    private int field9367;

    @OriginalMember(owner = "client!dd", name = "m", descriptor = "I")
    private int field9372;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    private int field9360;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    private int field9365;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    private int field9368;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    private int field9370;

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    private int field9373;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "I")
    private int field9371;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    private int field9363;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field9362 = 64;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field9361;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field9364;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field9369;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field9374;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZB)Ljava/lang/String;", line = 5)
    public static final String method3696(int arg0, boolean arg1, byte arg2) {
        field9361++;
        if (arg1 && arg0 >= 0) {
            if (arg2 != 18) {
                field9362 = -18;
            }
            return class256.method1574(arg1, arg2 - 1891, 10, arg0);
        } else {
            return Integer.toString(arg0);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILjava/util/Random;)I", line = 27)
    public static final int method3697(int arg0, int arg1, Random arg2) {
        field9374++;
        if (arg1 <= arg0) {
            throw new IllegalArgumentException();
        } else if (class230.method1441(true, arg1)) {
            return (int) ((long) arg1 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var3 <= var4);
            return class627.method3451(var4, arg1, false);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIII)Z", line = 53)
    public final boolean method3698(int arg0, int arg1, int arg2, int arg3) {
        field9369++;
        if (this.field9365 > arg2 || arg2 > this.field9370) {
            return false;
        } else if (arg0 < this.field9371 || arg0 > this.field9373) {
            return false;
        } else if (this.field9368 > arg3 || arg3 > this.field9363) {
            return false;
        } else if (arg1 == 0) {
            int var5 = arg2 - this.field9360;
            int var6 = arg3 - this.field9372;
            return var5 * var5 + var6 * var6 < this.field9367;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIBIIIIII)V", line = 86)
    public final void method3699(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        this.field9375 = arg6;
        this.field9367 = arg3 * arg3;
        this.field9360 = arg5;
        int var12 = 126 / ((69 - arg4) / 33);
        this.field9372 = arg7;
        field9364++;
        this.field9365 = this.field9360 + arg9;
        this.field9368 = this.field9372 + arg10;
        this.field9373 = this.field9375 + arg2;
        this.field9371 = this.field9375 + arg8;
        this.field9370 = this.field9360 + arg1;
        this.field9363 = this.field9372 + arg0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 105)
    public static final void method3700(byte arg0) {
        class273.field3798 = 0;
        field9366++;
        class653.field8828 = new class70[50];
        if (arg0 < 63) {
            field9362 = -88;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 120)
    public class660(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        this.field9375 = arg1;
        this.field9367 = arg3 * arg3;
        this.field9372 = arg2;
        this.field9360 = arg0;
        this.field9365 = this.field9360 + arg4;
        this.field9368 = this.field9372 + arg8;
        this.field9370 = this.field9360 + arg5;
        this.field9373 = this.field9375 + arg7;
        this.field9371 = this.field9375 + arg6;
        this.field9363 = this.field9372 + arg9;
    }
}
