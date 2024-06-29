import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class710 extends class756 {

    @OriginalMember(owner = "client!qs", name = "x", descriptor = "I")
    private int field9995;

    @OriginalMember(owner = "client!qs", name = "t", descriptor = "I")
    private int field9991;

    @OriginalMember(owner = "client!qs", name = "w", descriptor = "I")
    private int field9994;

    @OriginalMember(owner = "client!qs", name = "p", descriptor = "I")
    private int field9987;

    @OriginalMember(owner = "client!qs", name = "v", descriptor = "I")
    private int field9993;

    @OriginalMember(owner = "client!qs", name = "k", descriptor = "I")
    private int field9982;

    @OriginalMember(owner = "client!qs", name = "q", descriptor = "I")
    private int field9988;

    @OriginalMember(owner = "client!qs", name = "u", descriptor = "I")
    private int field9992;

    @OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
    public static int field9990 = 0;

    @OriginalMember(owner = "client!qs", name = "j", descriptor = "I")
    public static int field9981;

    @OriginalMember(owner = "client!qs", name = "l", descriptor = "I")
    public static int field9983;

    @OriginalMember(owner = "client!qs", name = "m", descriptor = "I")
    public static int field9984;

    @OriginalMember(owner = "client!qs", name = "o", descriptor = "I")
    public static int field9986;

    @OriginalMember(owner = "client!qs", name = "r", descriptor = "I")
    public static int field9989;

    @OriginalMember(owner = "client!qs", name = "y", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!qs", name = "z", descriptor = "I")
    public static int field9997;

    @OriginalMember(owner = "client!qs", name = "n", descriptor = "Lkha;")
    public static class687 field9985;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)V")
    public final void method1897(int arg0, int arg1, int arg2) {
        int var4 = 20 / ((arg2 - 68) / 33);
        ++field9984;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IIB)V")
    public final void method1902(int arg0, int arg1, byte arg2) {
        ++field9986;
        if (arg2 >= -74) {
            method3920(113, 94, 90);
        }
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(III)Z")
    public static final boolean method3920(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            method3922(-30, (byte) -12, -80);
        }
        ++field9981;
        return ~(544 & arg1) == -545 | (arg1 & 24) != 0;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public static void method3921(int arg0) {
        if (arg0 != 5) {
            method3921(-31);
        }
        field9985 = null;
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BII)V")
    public final void method1903(byte arg0, int arg1, int arg2) {
        ++field9997;
        int var4 = this.field9994 * arg1 >> 12;
        int var5 = this.field9995 * arg2 >> 12;
        int var6 = this.field9982 * arg1 >> 12;
        int var7 = this.field9992 * arg2 >> 12;
        int var8 = this.field9993 * arg1 >> 12;
        int var9 = this.field9991 * arg2 >> 12;
        int var10 = this.field9988 * arg1 >> 12;
        int var11 = this.field9987 * arg2 >> 12;
        int var12 = 16 / ((arg0 - 82) / 40);
        class553.method3148(var9, var6, 255, var11, var10, var5, var8, super.field10533, var7, var4);
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(IBI)Z")
    public static final boolean method3922(int arg0, byte arg1, int arg2) {
        if (arg1 > -98) {
            method3920(102, 25, 126);
        }
        ++field9996;
        return ~(2048 & arg0) != -1;
    }

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "(I)I")
    public static final int method3923(int arg0) {
        ++field9983;
        if (class322.field4113) {
            return 6;
        } else if (class750.field10502 == null) {
            return 0;
        } else {
            int var1 = class750.field10502.field10134;
            if (class169.method1057(var1, 6)) {
                return 1;
            } else if (arg0 >= -70) {
                return -44;
            } else if (class289.method1731(var1, (byte) -32)) {
                return 2;
            } else if (class638.method3464(var1, 124)) {
                return 3;
            } else {
                return class589.method3275(var1, (byte) -88) ? 4 : 5;
            }
        }
    }

    @OriginalMember(owner = "client!qs", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class710(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field9995 = arg1;
        this.field9991 = arg5;
        this.field9994 = arg0;
        this.field9987 = arg7;
        this.field9993 = arg4;
        this.field9982 = arg2;
        this.field9988 = arg6;
        this.field9992 = arg3;
    }
}
