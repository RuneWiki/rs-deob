import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vea")
public class class286 extends class165 {

    @OriginalMember(owner = "client!vea", name = "p", descriptor = "[I")
    public static int[] field4376 = new int[128];

    @OriginalMember(owner = "client!vea", name = "x", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!vea", name = "y", descriptor = "[Loha;")
    public static class771[] field4385;

    @OriginalMember(owner = "client!vea", name = "t", descriptor = "B")
    private byte field4380;

    @OriginalMember(owner = "client!vea", name = "u", descriptor = "B")
    private byte field4381;

    @OriginalMember(owner = "client!vea", name = "v", descriptor = "B")
    private byte field4382;

    @OriginalMember(owner = "client!vea", name = "z", descriptor = "B")
    private byte field4386;

    @OriginalMember(owner = "client!vea", name = "r", descriptor = "I")
    public static int field4378;

    @OriginalMember(owner = "client!vea", name = "s", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!vea", name = "w", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!vea", name = "q", descriptor = "Z")
    private boolean field4377;

    static {
        for (int var0 = 0; var0 < field4376.length; var0++) {
            field4376[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field4376[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field4376[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field4376[var3] = var3 + 52 - 48;
        }
        field4376[42] = field4376[43] = 62;
        field4376[45] = field4376[47] = 63;
        field4384 = -1;
        field4385 = new class771[16];
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(ILmia;)V", line = 3)
    public final void method612(int arg0, class69 arg1) {
        arg1.field934 = this.field4381;
        arg1.field946 = this.field4386;
        if (arg0 > -100) {
            this.method614(null, -94);
        }
        field4383++;
        arg1.field937 = this.field4377;
        arg1.field911 = this.field4382;
        arg1.field910 = this.field4380;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(III[BIFLbn;FFIIFF)V", line = 19)
    public static final void method1918(int arg0, int arg1, int arg2, byte[] arg3, int arg4, float arg5, class465 arg6, float arg7, float arg8, int arg9, int arg10, float arg11, float arg12) {
        for (int var13 = arg9; var13 < arg4; var13++) {
            class624.method3561(arg5, arg10, arg1, var13, arg6, arg12, arg4, arg7, arg11, -18416, arg8, arg0, arg3, arg2);
            arg10 += arg1 * arg2;
        }
        field4379++;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(B)V", line = 39)
    public static void method1919(byte arg0) {
        if (arg0 != 29) {
            method1918(89, -111, 21, null, -50, 1.7013571F, null, -0.02697346F, -0.22899757F, -18, 5, -0.92912453F, 0.35217884F);
        }
        field4385 = null;
        field4376 = null;
    }

    @OriginalMember(owner = "client!vea", name = "a", descriptor = "(Lrv;I)V", line = 97)
    public final void method614(class120 arg0, int arg1) {
        field4378++;
        this.field4377 = arg0.method842(2384) == 1;
        if (arg1 == 1070) {
            this.field4381 = arg0.method877(-252);
            this.field4382 = arg0.method877(-252);
            this.field4380 = arg0.method877(-252);
            this.field4386 = arg0.method877(-252);
        }
    }
}
