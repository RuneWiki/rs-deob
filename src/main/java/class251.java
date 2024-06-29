import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class251 extends class167 {

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    public int field3288;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public int field3287;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public int field3298;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    public int field3289;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "I")
    public static int field3296 = 0;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "[I")
    public static int[] field3292 = new int[256];

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "Lmv;")
    public static class295 field3297;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "Lgf;")
    public static class61 field3294;

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(Ltca;Lvea;IIIIIIIIIIIII)V")
    public class251(class545 arg0, class305 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field3288 = arg11;
        this.field3287 = arg12;
        this.field3290 = arg14;
        this.field3291 = arg13;
        this.field3298 = arg9;
        this.field3289 = arg10;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V")
    public static void method1518(int arg0) {
        field3292 = null;
        field3297 = null;
        int var1 = 21 % ((arg0 - 62) / 49);
        field3294 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lmh;")
    public class139 method599(int arg0) {
        field3293++;
        int var2 = 110 / ((-arg0 - 89) / 34);
        return class639.field9182;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static final void method1519(int arg0) {
        field3295++;
        if (arg0 == 0) {
            class281.field3727.method3890(-1);
        }
    }
}
