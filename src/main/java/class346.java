import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public abstract class class346 {

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field4633 = 1400;

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "Z")
    public static boolean field4634 = false;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public int field4631;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "I")
    public static int field4635;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field4636;

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "Ljava/lang/String;")
    public String field4637;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)Ljava/net/Socket;", line = 6)
    public final Socket method2012(byte arg0) throws IOException {
        if (arg0 <= 102) {
            method2013(-12, -71, 80, 20, true, 1.2338258F, 77, 32, 5);
        }
        field4632++;
        return new Socket(this.field4637, this.field4631);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIIIZFIII)[[I", line = 29)
    public static final int[][] method2013(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5, int arg6, int arg7, int arg8) {
        field4635++;
        int[][] var9 = new int[arg2][arg8];
        class629 var10 = new class629();
        var10.field8729 = (int) (arg5 * 4096.0F);
        var10.field8732 = arg3;
        var10.field8723 = arg0;
        var10.field8720 = arg7;
        var10.field8726 = arg4;
        var10.method29((byte) -108);
        class360.method2061((byte) 87, arg8, arg2);
        for (int var11 = arg6; var11 < arg2; var11++) {
            var10.method3522(var9[var11], var11, arg6 ^ 0xFFF);
        }
        return var9;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "([FFIFFIIIIIIII)V", line = 59)
    public static final void method2014(float[] arg0, float arg1, int arg2, float arg3, float arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        field4636++;
        int var13 = arg5 - arg7;
        int var14 = arg12 - arg6;
        int var15 = arg2 - arg11;
        float var16 = arg0[2] * (float) var14 + arg0[1] * (float) var15 + arg0[0] * (float) var13;
        float var17 = arg0[5] * (float) var14 + arg0[arg8] * (float) var13 + arg0[4] * (float) var15;
        float var18 = arg0[8] * (float) var14 + arg0[6] * (float) var13 + arg0[7] * (float) var15;
        float var19;
        float var20;
        if (arg10 == 0) {
            var20 = arg1 + var16 + 0.5F;
            var19 = arg4 + 0.5F - var18;
        } else if (arg10 == 1) {
            var20 = arg1 + var16 + 0.5F;
            var19 = arg4 + var18 + 0.5F;
        } else if (arg10 == 2) {
            var19 = arg3 + 0.5F - var17;
            var20 = arg1 + 0.5F - var16;
        } else if (arg10 == 3) {
            var19 = arg3 + 0.5F - var17;
            var20 = arg1 + var16 + 0.5F;
        } else if (arg10 == 4) {
            var19 = arg3 + 0.5F - var17;
            var20 = arg4 + var18 + 0.5F;
        } else {
            var20 = arg4 + 0.5F - var18;
            var19 = arg3 + 0.5F - var17;
        }
        if (arg9 == 1) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (arg9 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg9 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class578.field8166 = var20;
        class341.field4574 = var19;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(I)Ljava/net/Socket;")
    public abstract Socket method943(int arg0) throws IOException;
}
