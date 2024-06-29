import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tr")
public class class566 {

    @OriginalMember(owner = "client!tr", name = "f", descriptor = "[I")
    public static int[] field8048 = new int[256];

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "I")
    public int field8043;

    @OriginalMember(owner = "client!tr", name = "b", descriptor = "I")
    public int field8044;

    @OriginalMember(owner = "client!tr", name = "c", descriptor = "I")
    public static int field8045;

    @OriginalMember(owner = "client!tr", name = "d", descriptor = "I")
    public int field8046;

    @OriginalMember(owner = "client!tr", name = "e", descriptor = "I")
    public static int field8047;

    @OriginalMember(owner = "client!tr", name = "g", descriptor = "I")
    public int field8049;

    @OriginalMember(owner = "client!tr", name = "h", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(B)V")
    public static void method3387(byte arg0) {
        field8048 = null;
        if (arg0 > -99) {
            method3387((byte) 21);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(Lep;IIII)Ldd;")
    public static final class146 method3388(class371 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 != 3553) {
            return null;
        }
        field8050++;
        if (!arg0.field4991 && (!class447.method2664(0, arg4) || !class447.method2664(arg3 ^ 0xDE1, arg1))) {
            return arg0.field5001 ? new class146(arg0, 34037, arg2, arg4, arg1) : new class146(arg0, arg2, arg4, arg1, class670.method3834(arg4, 23538), class670.method3834(arg1, 23538));
        } else {
            return new class146(arg0, 3553, arg2, arg4, arg1);
        }
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(I)V")
    public static final void method3389(int arg0) {
        field8045++;
        class556.field7847++;
        if (arg0 > -106) {
            method3390(22, -0.08264086F, 37, null, 70, null, 1.5292451F, -113, -2, 12, 43, -55, -105, 0.282351F);
        }
        class120 var1 = class292.method1716(class608.field8668, true, class658.field9292);
        var1.field1653.method184(class615.method3609((byte) 98), -38);
        var1.field1653.method147((byte) 53, class58.field807);
        var1.field1653.method147((byte) 53, class582.field8281);
        var1.field1653.method184(class674.field9500.field5155.method133(0), -78);
        class471.method2805(95, var1);
    }

    @OriginalMember(owner = "client!tr", name = "a", descriptor = "(IFI[FI[FFIIIIIIF)V")
    public static final void method3390(int arg0, float arg1, int arg2, float[] arg3, int arg4, float[] arg5, float arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, float arg13) {
        int var14 = arg7 - arg9;
        int var15 = arg11 - arg2;
        field8047++;
        int var16 = arg12 - arg4;
        float var17 = arg5[2] * (float) var14 + arg5[1] * (float) var15 + arg5[0] * (float) var16;
        float var18 = arg5[arg8] * (float) var14 + arg5[3] * (float) var16 + arg5[4] * (float) var15;
        float var19 = arg5[8] * (float) var14 + arg5[7] * (float) var15 + arg5[6] * (float) var16;
        float var20;
        float var21;
        if (arg0 == 0) {
            var20 = arg1 + var17 + 0.5F;
            var21 = arg6 + 0.5F - var19;
        } else if (arg0 == 1) {
            var20 = arg1 + var17 + 0.5F;
            var21 = arg6 + var19 + 0.5F;
        } else if (arg0 == 2) {
            var20 = arg1 + 0.5F - var17;
            var21 = arg13 + 0.5F - var18;
        } else if (arg0 == 3) {
            var20 = arg1 + var17 + 0.5F;
            var21 = arg13 + 0.5F - var18;
        } else if (arg0 == 4) {
            var21 = arg13 + 0.5F - var18;
            var20 = arg6 + var19 + 0.5F;
        } else {
            var20 = arg6 + 0.5F - var19;
            var21 = arg13 + 0.5F - var18;
        }
        if (arg10 == 1) {
            float var22 = var20;
            var20 = -var21;
            var21 = var22;
        } else if (arg10 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg10 == 3) {
            float var23 = var20;
            var20 = var21;
            var21 = -var23;
        }
        arg3[0] = var20;
        arg3[1] = var21;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field8048[var0] = var1;
        }
    }
}
