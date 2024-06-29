import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class586 extends class168 {

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public int field8182 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    public int field8180 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public int field8178 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public int field8184 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "I")
    public int field8179 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public int field8183 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public int field8190 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public int field8191 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "Lcs;")
    public class344 field8189;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "Lde;")
    public static class534 field8181 = new class534(128, 4);

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lfh;")
    public static class653 field8185 = new class653();

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "[F")
    public static float[] field8192 = new float[4];

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field8186;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public static int field8187;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field8188;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z)V")
    public static void method3328(boolean arg0) {
        if (arg0) {
            method3331(8, null, 70, 31, 113, -26, -58);
        }
        field8192 = null;
        field8185 = null;
        field8181 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method3329(int arg0, String arg1) {
        field8186++;
        class64.method588(1699767752, arg1, 0, "", "", 0, "");
        if (arg0 > -92) {
            field8185 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)Lhe;")
    public static final class374 method3330(int arg0, int arg1, int arg2) {
        class14 var3 = class197.field2689[arg0][arg1][arg2];
        return var3 == null ? null : var3.field283;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[BIIIII)V")
    public static final void method3331(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8187++;
        if (arg5 > 0 && !class54.method400(5533, arg5)) {
            throw new IllegalArgumentException("");
        } else if (arg6 <= 0 || class54.method400(arg4 + 5529, arg6)) {
            int var7 = class686.method3854(arg0, arg4 - 4);
            int var8 = 0;
            int var9 = arg6 > arg5 ? arg5 : arg6;
            if (arg4 != 4) {
                field8185 = null;
            }
            int var10 = arg5 >> 1;
            int var11 = arg6 >> 1;
            byte[] var12 = arg1;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var8, arg2, arg5, arg6, 0, arg0, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg5 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var14 + var16;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            int var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var19 = var7 + var26;
                            var13[var17] = (byte) (var27 >> 2);
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                arg6 = var11;
                var12 = var15;
                arg5 = var10;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8++;
                var11 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)Z")
    public final boolean method3332(int arg0, byte arg1, int arg2) {
        field8188++;
        if (this.field8184 <= arg0 && this.field8191 >= arg0 && arg2 >= this.field8180 && this.field8190 >= arg2) {
            return true;
        } else {
            if (arg1 > -125) {
                method3331(-69, null, 75, 49, -95, 29, 63);
            }
            return arg0 >= this.field8179 && this.field8182 >= arg0 && this.field8178 <= arg2 && this.field8183 >= arg2;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lcs;)V")
    public class586(class344 arg0) {
        this.field8189 = arg0;
    }
}
