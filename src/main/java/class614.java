import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class614 extends class132 {

    @OriginalMember(owner = "client!dr", name = "y", descriptor = "[B")
    public byte[] field8823;

    @OriginalMember(owner = "client!dr", name = "z", descriptor = "I")
    public static int field8824;

    @OriginalMember(owner = "client!dr", name = "A", descriptor = "I")
    public static int field8825;

    @OriginalMember(owner = "client!dr", name = "B", descriptor = "I")
    public static int field8826;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIIII)V")
    public static final void method3587(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class473.field6662 != null) {
            class473.field6662[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class246.field3418 != null) {
            class246.field3418[arg0][arg1] = (short) arg3;
        }
        if (class590.field8423 != null) {
            class590.field8423[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "([B)V")
    public class614(byte[] arg0) {
        this.field8823 = arg0;
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIB)V")
    public static final void method3588(int arg0, int arg1, byte arg2) {
        field8824++;
        if (arg2 > 53) {
            class314 var3 = class483.method2819(6, arg0, 21303);
            var3.method1959(19793);
            var3.field4227 = arg1;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(BII[FIIIFIIIFF)V")
    public static final void method3589(byte arg0, int arg1, int arg2, float[] arg3, int arg4, int arg5, int arg6, float arg7, int arg8, int arg9, int arg10, float arg11, float arg12) {
        if (arg0 != -65) {
            return;
        }
        int var13 = arg9 - arg10;
        int var14 = arg8 - arg6;
        field8825++;
        int var15 = arg2 - arg1;
        float var16 = arg3[2] * (float) var15 + arg3[0] * (float) var13 + arg3[1] * (float) var14;
        float var17 = arg3[5] * (float) var15 + arg3[4] * (float) var14 + arg3[3] * (float) var13;
        float var18 = arg3[8] * (float) var15 + arg3[6] * (float) var13 + arg3[7] * (float) var14;
        float var19;
        float var20;
        if (arg5 == 0) {
            var19 = arg12 + var16 + 0.5F;
            var20 = arg7 + 0.5F - var18;
        } else if (arg5 == 1) {
            var19 = arg12 + var16 + 0.5F;
            var20 = arg7 + var18 + 0.5F;
        } else if (arg5 == 2) {
            var19 = arg12 + 0.5F - var16;
            var20 = arg11 + 0.5F - var17;
        } else if (arg5 == 3) {
            var19 = arg12 + var16 + 0.5F;
            var20 = arg11 + 0.5F - var17;
        } else if (arg5 == 4) {
            var19 = arg7 + var18 + 0.5F;
            var20 = arg11 + 0.5F - var17;
        } else {
            var19 = arg7 + 0.5F - var18;
            var20 = arg11 + 0.5F - var17;
        }
        if (arg4 == 1) {
            float var21 = var19;
            var19 = -var20;
            var20 = var21;
        } else if (arg4 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg4 == 3) {
            float var22 = var19;
            var19 = var20;
            var20 = -var22;
        }
        class229.field3272 = var20;
        class214.field3042 = var19;
    }
}
