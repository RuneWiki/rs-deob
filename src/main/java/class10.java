import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class10 {

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public int field94;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "[I")
    public int[] field87;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "[I")
    public int[] field88;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Ljava/lang/String;")
    public static String field93 = "Loaded textures";

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "I")
    public static int field89 = 0;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field91;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lok;ILir;Lvm;IILnj;I)V", line = 6)
    public static final void method45(class60 arg0, int arg1, class216 arg2, class322 arg3, int arg4, int arg5, class228 arg6, int arg7) {
        field91++;
        int var8 = arg2.field2895 - (arg7 / 2) - 5;
        int var9 = arg5 + 2;
        if (arg6.field3146 != 0) {
            arg3.method1860(var9, -3272, arg7 + 10, var8, arg0.method325() * arg1 + arg5 + 1 - var9, arg6.field3146);
        }
        if (arg6.field3127 != 0) {
            arg3.method1862(arg5 - (-(arg0.method325() * arg1) - (1 - var9)), arg7 + 10, var8, var9, (byte) 3, arg6.field3127);
        }
        int var10 = arg6.field3141;
        if (arg2.field2902 && arg6.field3125 != -1) {
            var10 = arg6.field3125;
        }
        if (arg4 != -12806) {
            method45((class60) null, -54, (class216) null, (class322) null, 93, -45, (class228) null, -56);
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            String var12 = class367.field5143[var11];
            if (arg1 - 1 > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg0.method328(arg3, var12, arg2.field2895, arg5, var10, true);
            arg5 += arg0.method325();
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V", line = 60)
    public static void method46(int arg0) {
        if (arg0 != 27730) {
            method46(-99);
        }
        field93 = null;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(I)V", line = 73)
    public class10(int arg0) {
        this.field94 = arg0;
        this.field87 = new int[this.field94];
        this.field88 = new int[this.field94];
    }
}
