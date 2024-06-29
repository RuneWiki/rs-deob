import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class689 extends class571 {

    @OriginalMember(owner = "client!hd", name = "z", descriptor = "I")
    public static int field9665 = 0;

    @OriginalMember(owner = "client!hd", name = "C", descriptor = "Lhga;")
    public static class158 field9668 = new class158(20, 3);

    @OriginalMember(owner = "client!hd", name = "E", descriptor = "Lhg;")
    public static class642 field9670 = new class642();

    @OriginalMember(owner = "client!hd", name = "D", descriptor = "F")
    public static float field9669;

    @OriginalMember(owner = "client!hd", name = "x", descriptor = "I")
    public static int field9663;

    @OriginalMember(owner = "client!hd", name = "y", descriptor = "I")
    public static int field9664;

    @OriginalMember(owner = "client!hd", name = "A", descriptor = "I")
    public static int field9666;

    @OriginalMember(owner = "client!hd", name = "B", descriptor = "[B")
    private byte[] field9667;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IIII)[B")
    public final byte[] method3903(int arg0, int arg1, int arg2, int arg3) {
        this.field9667 = new byte[arg1 * arg3 * arg2 * 2];
        int var5 = -60 / ((-arg0 - 56) / 42);
        field9664++;
        this.method1998(arg1, 4095, arg3, arg2);
        return this.field9667;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIB)V")
    public final void method2869(int arg0, int arg1, byte arg2) {
        field9663++;
        byte var4 = (byte) (((arg2 & 0xFF) >> 1) + arg1);
        int var5 = arg0 * 2;
        int var10001 = var5;
        int var6 = var5 + 1;
        this.field9667[var10001] = var4;
        this.field9667[var6] = var4;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "()V")
    public class689() {
        super(12, 5, 16, 2, 2, 0.45F);
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(I)V")
    public static void method3904(int arg0) {
        int var1 = 11 / ((arg0 + 54) / 49);
        field9670 = null;
        field9668 = null;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(FLss;IIFIIIFIFF[B)V")
    public static final void method3905(float arg0, class397 arg1, int arg2, int arg3, float arg4, int arg5, int arg6, int arg7, float arg8, int arg9, float arg10, float arg11, byte[] arg12) {
        field9666++;
        if (arg9 != 28747) {
            field9668 = null;
        }
        for (int var13 = 0; var13 < arg5; var13++) {
            class123.method1096(arg3, arg4, arg11, arg10, var13, arg1, arg12, arg6, 785, arg7, arg5, arg8, arg2, arg0);
            arg2 += arg6 * arg7;
        }
    }
}
