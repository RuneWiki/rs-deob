import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class525 {

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field7410 = 0;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field7405;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field7406;

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field7407;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!kj", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7407++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lda;ILnu;III)V")
    public static final void method3017(class55 arg0, int arg1, class548 arg2, int arg3, int arg4, int arg5) {
        field7406++;
        if (arg0 != null) {
            arg2.method3096(arg0.method507(), arg0.method544(), arg0.method524(), arg0.method488(), arg4, arg0.method531(), arg0.method512(), arg0.method534(), true, arg3, arg5);
            if (arg1 > -27) {
                field7410 = 87;
            }
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lvg;IJLua;IIIII)V")
    public static final void method3018(class49 arg0, int arg1, long arg2, class617 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg4 != 65535) {
            method3019(-115, -109, 13, -1, 6, -30, -113, -88, -19, 44);
        }
        field7408++;
        int var10 = arg5 * arg5 + arg6 * arg6;
        if (arg2 < ((long) var10)) {
            return;
        }
        int var11 = Math.min(arg0.field967 / 2, arg0.field877 / 2);
        if ((var11 * var11) >= var10) {
            class326.method2049((byte) 88, arg3, arg6, arg0, arg1, arg8, arg5, class274.field4182[arg7]);
            return;
        }
        var11 -= 10;
        int var12;
        if (class43.field700 == 4) {
            var12 = (int) class630.field8811 & 0x3FFF;
        } else {
            var12 = (int) class630.field8811 + class252.field3880 & 0x3FFF;
        }
        int var13 = class189.field2719[var12];
        int var14 = class189.field2721[var12];
        if (class43.field700 != 4) {
            var13 = var13 * 256 / (class287.field4280 + 256);
            var14 = var14 * 256 / (class287.field4280 + 256);
        }
        int var15 = arg5 * var13 + arg6 * var14 >> 14;
        int var16 = arg5 * var14 - (arg6 * var13) >> 14;
        double var17 = Math.atan2((double) var15, (double) var16);
        int var19 = (int) ((double) var11 * Math.sin(var17));
        int var20 = (int) ((double) var11 * Math.cos(var17));
        class626.field8768[arg7].method3912((float) arg0.field967 / 2.0F + (float) arg8 + (float) var19, (float) arg0.field877 / 2.0F + (float) arg1 + (float) (-var20), 4096, (int) (-var17 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method3019(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field7409++;
        if (!class312.method1978(false, arg1)) {
            return;
        }
        if (arg6 < 105) {
            method3017(null, 54, null, -114, -65, 73);
        }
        if (class277.field4197[arg1] == null) {
            client.method1764(class181.field2558[arg1], -1, arg3, arg2, arg8, arg4, arg0, arg5, arg9, arg7);
        } else {
            client.method1764(class277.field4197[arg1], -1, arg3, arg2, arg8, arg4, arg0, arg5, arg9, arg7);
        }
    }
}
