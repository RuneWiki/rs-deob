import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class class224 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
    public int field3730;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[[B")
    public static byte[][] field3733 = new byte[1000][];

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Lal;")
    public static class52 field3736 = new class52(64);

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "Lbd;")
    public static class37 field3737 = new class37();

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIII)V")
    public static final void method1606(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 == 1010) {
            class17.method138(10, arg2, arg0);
        } else if (arg1 == 1005) {
            class17.method138(11, arg2, arg0);
        } else if (arg1 == 1007) {
            class17.method138(12, arg2, arg0);
        } else if (arg1 == 1009) {
            class17.method138(13, arg2, arg0);
        } else if (arg1 == 1006) {
            class17.method138(14, arg2, arg0);
        }
        field3729++;
        if (arg3 != 8852) {
            method1607(-108);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)V")
    public abstract void method299(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method1607(int arg0) {
        if (arg0 != 13) {
            field3736 = null;
        }
        field3737 = null;
        field3736 = null;
        field3733 = null;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIZ)V")
    public abstract void method298(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(IIII)V")
    public static final void method1608(int arg0, int arg1, int arg2, int arg3) {
        if (class381.field5763 != null) {
            class381.field5763[arg0][arg1] = (arg3 & 0x7F8) << 21 | arg2 & 0xFFFFFF;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(III)V")
    public class224(int arg0, int arg1, int arg2) {
        this.field3731 = arg0;
        this.field3730 = arg1;
        this.field3734 = arg2;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)V")
    public abstract void method302(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILtm;IILsd;Lfa;II)V")
    public static final void method1609(int arg0, class219 arg1, int arg2, int arg3, class50 arg4, class127 arg5, int arg6, int arg7) {
        field3735++;
        class58 var8 = new class58();
        var8.field732 = arg2;
        var8.field730 = arg7 * 128;
        var8.field740 = arg0 * 128;
        if (arg5 != null) {
            var8.field742 = arg5;
            int var9 = arg5.field2014;
            int var10 = arg5.field1944;
            if (arg3 == 1 || arg3 == 3) {
                var10 = arg5.field2014;
                var9 = arg5.field1944;
            }
            var8.field750 = arg5.field1949 * 128;
            var8.field738 = arg5.field2023;
            var8.field736 = arg5.field1965;
            var8.field741 = arg5.field2019;
            var8.field756 = (arg7 + var10) * 128;
            var8.field743 = arg5.field1953;
            var8.field737 = (arg0 + var9) * 128;
            var8.field733 = arg5.field1946;
            if (arg5.field1984 != null) {
                var8.field751 = true;
                var8.method385(90);
            }
            if (var8.field736 != null) {
                var8.field755 = (int) (Math.random() * (double) (var8.field733 - var8.field738)) + var8.field738;
            }
            class245.field4023.method245(arg6 ^ 0x20C0, var8);
        } else if (arg4 != null) {
            var8.field757 = arg4;
            class226 var11 = arg4.field615;
            if (var11.field3771 != null) {
                var8.field751 = true;
                var11 = var11.method1619(arg6 ^ 0xFFFFDEEF);
            }
            if (var11 != null) {
                var8.field737 = (var11.field3779 + arg0) * 128;
                var8.field756 = (var11.field3779 + arg7) * 128;
                var8.field741 = class275.method1854(arg4, (byte) 84);
                var8.field750 = var11.field3752 * 128;
                var8.field743 = var11.field3756;
            }
            class3.field81.method245(500, var8);
        } else if (arg1 != null) {
            var8.field747 = arg1;
            var8.field737 = (arg1.method903(arg6 - 8576) + arg0) * 128;
            var8.field756 = (arg7 + arg1.method903(arg6 ^ 0xFFFFDE98)) * 128;
            var8.field741 = class35.method226(arg1, arg6 ^ 0x214F);
            var8.field750 = arg1.field3620 * 128;
            var8.field743 = arg1.field3610;
            class126.field1939.method1766((long) arg1.field1868, var8, arg6 ^ 0x2140);
        }
        if (arg6 != 8500) {
            field3736 = null;
        }
    }
}
