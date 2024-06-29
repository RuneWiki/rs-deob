import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class249 extends OutputStream {

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "I")
    public static int field4134 = 0;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "Lph;")
    public static class229 field4136 = class266.method1858(" est d-Bj-9 dans votre liste noire)3", 0);

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "[B")
    public static byte[] field4135 = new byte[520];

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "I")
    public static int field4140 = 0;

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "Lph;")
    public static class229 field4141 = class266.method1858("clignotant3:", 0);

    @OriginalMember(owner = "client!ff", name = "n", descriptor = "Lph;")
    private static class229 field4146 = class266.method1858("Connecting to update server", 0);

    @OriginalMember(owner = "client!ff", name = "l", descriptor = "Lph;")
    public static class229 field4144 = field4146;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
    public static int field4137;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!ff", name = "m", descriptor = "Lpf;")
    public static class303 field4145;

    @OriginalMember(owner = "client!ff", name = "k", descriptor = "Lwe;")
    public static class92 field4143;

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)Z", line = 8)
    public static final boolean method1747(int arg0) {
        field4137++;
        if (arg0 == 0) {
            return class170.field2802 == 0 ? class224.field3685.method473((byte) -109) : true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)V", line = 35)
    public static void method1748(byte arg0) {
        field4143 = null;
        field4146 = null;
        field4145 = null;
        field4136 = null;
        field4135 = null;
        field4144 = null;
        field4141 = null;
        if (arg0 != 15) {
            method1750(true, (int[][]) ((int[][]) null));
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIILam;I)V", line = 76)
    public static final void method1749(int arg0, int arg1, int arg2, int arg3, class332 arg4, int arg5) {
        field4133++;
        if (arg4.field5644 == -1 && arg4.field5645 == null) {
            return;
        }
        int var6 = 0;
        if (arg2 > arg4.field5651) {
            var6 += arg2 - arg4.field5651;
        } else if (arg2 < arg4.field5663) {
            var6 += arg4.field5663 - arg2;
        }
        if (arg4.field5649 < arg5) {
            var6 += arg5 - arg4.field5649;
        } else if (arg4.field5641 > arg5) {
            var6 += arg4.field5641 - arg5;
        }
        if (arg4.field5643 == arg0 || arg4.field5643 < (var6 - 64) || class184.field2996 == 0 || arg4.field5653 != arg1) {
            if (arg4.field5662 != null) {
                class239.field3949.method2150(arg4.field5662);
                arg4.field5662 = null;
            }
            if (arg4.field5652 != null) {
                class239.field3949.method2150(arg4.field5652);
                arg4.field5652 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = (arg4.field5643 - var6) * class184.field2996 / arg4.field5643;
        if (arg4.field5662 != null) {
            arg4.field5662.method1049(var7);
        } else if (arg4.field5644 >= 0) {
            class197 var8 = class197.method1388(class105.field1780, arg4.field5644, 0);
            if (var8 != null) {
                class182 var9 = var8.method1385().method1292(field4145);
                class144 var10 = class144.method1053(var9, 100, var7);
                var10.method1050(-1);
                class239.field3949.method2152(var10);
                arg4.field5662 = var10;
            }
        }
        if (arg4.field5652 != null) {
            arg4.field5652.method1049(var7);
            if (!arg4.field5652.method599(5)) {
                arg4.field5652 = null;
            }
        } else if (arg4.field5645 != null && (arg4.field5656 -= arg3) <= 0) {
            int var11 = (int) ((double) arg4.field5645.length * Math.random());
            class197 var12 = class197.method1388(class105.field1780, arg4.field5645[var11], 0);
            if (var12 != null) {
                class182 var13 = var12.method1385().method1292(field4145);
                class144 var14 = class144.method1053(var13, 100, var7);
                var14.method1050(0);
                class239.field3949.method2152(var14);
                arg4.field5652 = var14;
                arg4.field5656 = (int) ((double) (arg4.field5657 - arg4.field5650) * Math.random()) + arg4.field5650;
            }
        }
    }

    @OriginalMember(owner = "client!ff", name = "write", descriptor = "(I)V", line = 201)
    public final void write(int arg0) throws IOException {
        field4138++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(Z[[I)V", line = 216)
    public static final void method1750(boolean arg0, int[][] arg1) {
        if (arg0) {
            class202.field3337 = arg1;
            field4142++;
        }
    }
}
