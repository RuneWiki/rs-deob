import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oba")
public class class243 extends class461 {

    @OriginalMember(owner = "client!oba", name = "o", descriptor = "I")
    private int field3400;

    @OriginalMember(owner = "client!oba", name = "f", descriptor = "I")
    private int field3391;

    @OriginalMember(owner = "client!oba", name = "m", descriptor = "I")
    private int field3398;

    @OriginalMember(owner = "client!oba", name = "n", descriptor = "I")
    private int field3399;

    @OriginalMember(owner = "client!oba", name = "g", descriptor = "I")
    public static int field3392 = 0;

    @OriginalMember(owner = "client!oba", name = "k", descriptor = "Ldb;")
    public static class298 field3396 = new class298(48, 0);

    @OriginalMember(owner = "client!oba", name = "s", descriptor = "[I")
    public static int[] field3404 = new int[2];

    @OriginalMember(owner = "client!oba", name = "h", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!oba", name = "i", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!oba", name = "l", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!oba", name = "p", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!oba", name = "q", descriptor = "I")
    public static int field3402;

    @OriginalMember(owner = "client!oba", name = "j", descriptor = "Lsa;")
    public static class192 field3395;

    @OriginalMember(owner = "client!oba", name = "r", descriptor = "Lbi;")
    public static class449 field3403;

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BLeh;)Loba;")
    public static final class243 method1492(byte arg0, class335 arg1) {
        if (arg0 != -32) {
            field3395 = null;
        }
        ++field3394;
        return new class243(arg1.method2022(arg0 + -29057), arg1.method2022(arg0 + -29057), arg1.method2022(arg0 + -29057), arg1.method2022(-29089), arg1.method2042((byte) 53), arg1.method2042((byte) 53), arg1.method2034(arg0 + 287));
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(II)V")
    public static final void method1493(int arg0, int arg1) {
        ++field3401;
        if (arg0 == 2110445164) {
            class382 var2 = class396.method2276(arg0 + -2110445042, 1, arg1);
            var2.method2228((byte) -55);
        }
    }

    @OriginalMember(owner = "client!oba", name = "<init>", descriptor = "(IIIIIII)V")
    private class243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3400 = arg1;
        this.field3391 = arg3;
        this.field3398 = arg2;
        this.field3399 = arg0;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(III)V")
    public final void method703(int arg0, int arg1, int arg2) {
        ++field3397;
        int var4 = this.field3399 * arg2 >> 12;
        if (arg1 > -88) {
            this.method705(96, 4, (byte) -20);
        }
        int var5 = this.field3398 * arg2 >> 12;
        int var6 = this.field3400 * arg0 >> 12;
        int var7 = this.field3391 * arg0 >> 12;
        class688.method3818((byte) 125, var5, super.field6245, super.field6248, var4, var7, var6);
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(IIB)V")
    public final void method705(int arg0, int arg1, byte arg2) {
        ++field3402;
        int var4 = this.field3399 * arg1 >> 12;
        int var5 = this.field3398 * arg1 >> 12;
        int var6 = this.field3400 * arg0 >> 12;
        if (arg2 != -56) {
            this.method703(-87, 44, 62);
        }
        int var7 = this.field3391 * arg0 >> 12;
        class287.method1781(super.field6246, var5, arg2 ^ -56, var6, var4, var7);
    }

    @OriginalMember(owner = "client!oba", name = "b", descriptor = "(I)V")
    public static void method1494(int arg0) {
        if (arg0 != -20981) {
            method1492((byte) 85, (class335) null);
        }
        field3395 = null;
        field3396 = null;
        field3404 = null;
        field3403 = null;
    }

    @OriginalMember(owner = "client!oba", name = "a", descriptor = "(BII)V")
    public final void method704(byte arg0, int arg1, int arg2) {
        ++field3393;
        int var4 = this.field3399 * arg1 >> 12;
        int var5 = this.field3398 * arg1 >> 12;
        int var6 = this.field3400 * arg2 >> 12;
        int var7 = this.field3391 * arg2 >> 12;
        if (arg0 >= 79) {
            class690.method3835(super.field6245, var5, super.field6246, -1, var7, var6, super.field6248, var4);
        }
    }
}
