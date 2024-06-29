import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class130 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Ljd;")
    public static class86 field2480 = class122.method868(":", true);

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "Ljd;")
    public static class86 field2487 = null;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Ljd;")
    public static class86 field2486 = class122.method868("Bitte warten Sie)3)3)3", true);

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Lnh;")
    public static class53 field2484 = new class53(64);

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field2483;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field2485;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "Lbj;")
    public static class151 field2479;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIILeh;IJZ)Z")
    public static final boolean method913(int arg0, int arg1, int arg2, int arg3, int arg4, class80 arg5, int arg6, long arg7, boolean arg8) {
        if (arg5 == null) {
            return true;
        }
        int var10 = arg1 - arg4;
        int var11 = arg2 - arg4;
        int var12 = arg1 + arg4;
        int var13 = arg2 + arg4;
        if (arg8) {
            if (arg6 > 640 && arg6 < 1408) {
                var13 += 128;
            }
            if (arg6 > 1152 && arg6 < 1920) {
                var12 += 128;
            }
            if (arg6 > 1664 || arg6 < 384) {
                var11 -= 128;
            }
            if (arg6 > 128 && arg6 < 896) {
                var10 -= 128;
            }
        }
        int var14 = var10 / 128;
        int var15 = var11 / 128;
        int var16 = var12 / 128;
        int var17 = var13 / 128;
        return class30.method201(arg0, var14, var15, var16 + 1 - var14, var17 - var15 + 1, arg1, arg2, arg3, arg5, arg6, true, arg7);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)V")
    public static void method914(byte arg0) {
        field2486 = null;
        field2480 = null;
        field2479 = null;
        field2487 = null;
        field2484 = null;
        if (arg0 >= -27) {
            method913(68, 70, -126, -7, 58, (class80) null, 63, 33L, true);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static final void method915(int arg0) {
        field2485++;
        if (arg0 != -14139) {
            return;
        }
        if (class213.field3837 > 0) {
            class9.method74(123);
        } else {
            class270.field4748 = class248.field4415;
            class248.field4415 = null;
            class138.method983(40, (byte) -22);
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)Lei;")
    public static final class167 method916(int arg0) {
        int var1 = class24.field592[0] * class191.field3393[0];
        field2481++;
        byte[] var2 = class213.field3857[0];
        if (arg0 != 128) {
            field2480 = null;
        }
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class268.field4718[class1.method5(var2[var4], 255)];
        }
        class167 var5 = new class167(class70.field1438, class169.field3121, class138.field2628[0], class1.field6[0], class24.field592[0], class191.field3393[0], var3);
        class127.method894((byte) 20);
        return var5;
    }
}
