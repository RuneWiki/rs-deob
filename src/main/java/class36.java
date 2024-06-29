import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class36 extends OutputStream {

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "[Z")
    public static boolean[] field483 = new boolean[5];

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "[I")
    public static int[] field482 = new int[200];

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "[I")
    public static int[] field477 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field487 = 1;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field480;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field481;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field486;

    @OriginalMember(owner = "client!rn", name = "write", descriptor = "(I)V", line = 4)
    public final void write(int arg0) throws IOException {
        field481++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)I", line = 17)
    public static final int method229(int arg0, int arg1, int arg2) {
        field485++;
        int var3 = 92 % ((arg0 - 51) / 51);
        int var4 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var4 = arg1 * var4;
            }
            arg1 *= arg1;
            arg2 >>= 0x1;
        }
        if (arg2 == 1) {
            return arg1 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILkb;IILkb;)Lrg;", line = 45)
    public static final class104 method230(int arg0, class39 arg1, int arg2, int arg3, class39 arg4) {
        if (arg2 >= -71) {
            return (class104) null;
        } else {
            field479++;
            return class288.method2026(arg3, arg0, arg1, -46) ? class201.method1473(arg4.method250(true, arg3, arg0), 123) : null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIIIIII)V", line = 62)
    public static final void method231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg0 <= 61) {
            field482 = (int[]) null;
        }
        field480++;
        if (class224.field3575 <= arg1 && class231.field3697 >= arg5 && arg2 >= class233.field3721 && class235.field3735 >= arg4) {
            if (arg3 == 1) {
                class121.method839(arg4, -1, arg2, arg1, arg6, arg5);
            } else {
                class87.method635(arg4, 3, arg1, arg3, arg6, arg2, arg5);
            }
        } else if (arg3 == 1) {
            class313.method2180(arg1, arg4, arg6, arg2, 64, arg5);
        } else {
            class62.method421((byte) 57, arg5, arg4, arg6, arg1, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z", line = 93)
    public static final boolean method232(int arg0) {
        field484++;
        int var1 = -123 / ((-arg0 - 36) / 50);
        return class37.field497 == 0 ? class188.field3056.method1215(true) : true;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V", line = 107)
    public static void method233(int arg0) {
        field483 = null;
        field477 = null;
        field482 = null;
        int var1 = -54 / ((arg0 + 5) / 45);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Lkb;ZLkb;IB)Lij;", line = 134)
    public static final class90 method234(class39 arg0, boolean arg1, class39 arg2, int arg3, byte arg4) {
        field476++;
        if (arg4 != 48) {
            field478 = 51;
        }
        boolean var5 = true;
        int[] var6 = arg0.method270(-115, arg3);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method273(arg3, var6[var7], 1);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | var8[0] & 0xFF << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg2.method273(0, var9, 1);
                } else {
                    var10 = arg2.method273(var9, 0, arg4 - 47);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class90(arg0, arg2, arg3, arg1);
        } catch (Exception var12) {
            return null;
        }
    }
}
