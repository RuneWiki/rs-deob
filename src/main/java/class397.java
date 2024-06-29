import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class397 extends class149 {

    @OriginalMember(owner = "client!qi", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field5820 = new String[100];

    @OriginalMember(owner = "client!qi", name = "J", descriptor = "Lsl;")
    public static class318 field5824 = new class318(11, 7);

    @OriginalMember(owner = "client!qi", name = "M", descriptor = "[I")
    public static int[] field5827 = new int[13];

    @OriginalMember(owner = "client!qi", name = "N", descriptor = "I")
    public static int field5828 = 104;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!qi", name = "E", descriptor = "I")
    public static int field5819;

    @OriginalMember(owner = "client!qi", name = "H", descriptor = "I")
    public static int field5822;

    @OriginalMember(owner = "client!qi", name = "K", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!qi", name = "L", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!qi", name = "I", descriptor = "Z")
    public static boolean field5823;

    @OriginalMember(owner = "client!qi", name = "G", descriptor = "[B")
    private byte[] field5821;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(BBI)V")
    public final void method1075(byte arg0, byte arg1, int arg2) {
        field5822++;
        if (arg0 != -81) {
            this.method1075((byte) -13, (byte) 97, 42);
        }
        byte var4 = (byte) (((arg1 & 0xFF) >> 1) + 127);
        int var5 = arg2 * 2;
        int var6 = var5 + 1;
        this.field5821[var5] = var4;
        this.field5821[var6] = var4;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(BIII)[B")
    public final byte[] method2430(byte arg0, int arg1, int arg2, int arg3) {
        this.field5821 = new byte[arg1 * arg3 * arg2 * 2];
        if (arg0 != -49) {
            method2431(null, true, -0.06928216F, -2.737134F, -66, -1.5090047F, 30, -104, 73, -62, 0, 17, -14);
        }
        field5825++;
        this.method1769((byte) -120, arg1, arg3, arg2);
        return this.field5821;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V")
    public class397() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "([FZFFIFIIIIIII)V")
    public static final void method2431(float[] arg0, boolean arg1, float arg2, float arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg12 - arg7;
        if (!arg1) {
            method2433(68, -115);
        }
        int var14 = arg4 - arg10;
        field5819++;
        int var15 = arg6 - arg11;
        float var16 = arg0[2] * (float) var13 + arg0[1] * (float) var15 + arg0[0] * (float) var14;
        float var17 = arg0[5] * (float) var13 + arg0[4] * (float) var15 + arg0[3] * (float) var14;
        float var18 = arg0[8] * (float) var13 + arg0[6] * (float) var14 + arg0[7] * (float) var15;
        float var19;
        float var20;
        if (arg8 == 0) {
            var19 = arg5 + 0.5F - var18;
            var20 = arg3 + var16 + 0.5F;
        } else if (arg8 == 1) {
            var20 = arg3 + var16 + 0.5F;
            var19 = arg5 + var18 + 0.5F;
        } else if (arg8 == 2) {
            var20 = arg3 + 0.5F - var16;
            var19 = arg2 + 0.5F - var17;
        } else if (arg8 == 3) {
            var19 = arg2 + 0.5F - var17;
            var20 = arg3 + var16 + 0.5F;
        } else if (arg8 == 4) {
            var20 = arg5 + var18 + 0.5F;
            var19 = arg2 + 0.5F - var17;
        } else {
            var20 = arg5 + 0.5F - var18;
            var19 = arg2 + 0.5F - var17;
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
        class178.field2513 = var20;
        class332.field4622 = var19;
    }

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "(I)V")
    public static void method2432(int arg0) {
        if (arg0 <= -1) {
            field5820 = null;
            field5827 = null;
            field5824 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Z")
    public static final boolean method2433(int arg0, int arg1) {
        class276.field4070 = arg0 + 1 & 0xFFFF;
        field5818++;
        if (arg1 != -32291) {
            method2431(null, false, 1.8498535F, 1.59966F, 104, -0.9522125F, 13, 2, 7, 5, 61, -125, -27);
        }
        class439.field6531 = true;
        return true;
    }
}
