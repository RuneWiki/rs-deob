import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public abstract class class287 {

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "Leo;")
    public static class300 field3605 = new class300();

    @OriginalMember(owner = "client!ol", name = "h", descriptor = "Lkg;")
    public static class275 field3611 = new class275(114, -1);

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "F")
    public static float field3607;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "[I")
    public static int[] field3604;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I[B)V")
    public abstract void method1704(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIB)[B")
    public abstract byte[] method1705(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(FFIIFFBLsb;FII)[B")
    public static final byte[] method1706(float arg0, float arg1, int arg2, int arg3, float arg4, float arg5, byte arg6, class294 arg7, float arg8, int arg9, int arg10) {
        field3609++;
        byte[] var11 = new byte[arg9 * arg10 * arg2];
        if (arg6 != -18) {
            method1706(1.1706748F, -0.8423F, 124, -78, 0.85159147F, 0.93800354F, (byte) -45, null, 0.46337065F, -120, -106);
        }
        class373.method2148(arg10, var11, arg7, arg5, arg0, arg8, arg4, arg9, arg2, true, 0, arg1, arg3);
        return var11;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(I)V")
    public static void method1707(int arg0) {
        if (arg0 > -6) {
            method1710(28, -93);
        }
        field3605 = null;
        field3604 = null;
        field3611 = null;
    }

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "(I)I")
    public static final int method1708(int arg0) {
        field3608++;
        return arg0 == 255 ? class14.field273.method1088(-46) : -35;
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)[B")
    public abstract byte[] method1709(byte arg0);

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(II)[B")
    public static final byte[] method1710(int arg0, int arg1) {
        field3606++;
        class624 var2 = (class624) class618.field8527.method3962(70, (long) arg0);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg0);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class596.method3377(var7, var4, -102);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class624(var3);
            class618.field8527.method3966(1667, (long) arg0, var2);
        }
        if (arg1 != 255) {
            field3605 = null;
        }
        return var2.field8575;
    }
}
