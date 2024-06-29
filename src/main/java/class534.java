import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class534 extends class539 {

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "I")
    public int field7261 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public int field7264 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public int field7263 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "I")
    public int field7267 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public int field7269 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pm", name = "w", descriptor = "I")
    public int field7271 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pm", name = "z", descriptor = "I")
    public int field7274 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!pm", name = "y", descriptor = "I")
    public int field7273 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!pm", name = "x", descriptor = "Ljd;")
    public class209 field7272;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "Lfc;")
    public static class235 field7265 = new class235(51, 11);

    @OriginalMember(owner = "client!pm", name = "B", descriptor = "I")
    public static int field7276 = 0;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field7262;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field7266;

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "I")
    public static int field7268;

    @OriginalMember(owner = "client!pm", name = "v", descriptor = "I")
    public static int field7270;

    @OriginalMember(owner = "client!pm", name = "A", descriptor = "I")
    public static int field7275;

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljd;)V", line = 177)
    public class534(class209 arg0) {
        this.field7272 = arg0;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(III)Z", line = 13)
    public final boolean method2951(int arg0, int arg1, int arg2) {
        field7268++;
        if (this.field7271 <= arg2 && arg2 <= this.field7267 && arg0 >= this.field7261 && arg0 <= this.field7274) {
            return true;
        } else {
            if (arg1 != 51) {
                method2954(null, -1.5464268F, 0.06486343F, 119, -0.42699313F, 1.3222342F, -124, 1.5232246F, -42, 4, -34, 113, 58, null);
            }
            return this.field7273 <= arg2 && arg2 <= this.field7269 && arg0 >= this.field7264 && this.field7263 >= arg0;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;", line = 37)
    public static final Object method2952(boolean arg0, byte[] arg1, int arg2) {
        field7262++;
        if (arg2 <= 89) {
            field7276 = -16;
        }
        if (arg1 == null) {
            return null;
        }
        if (arg1.length > 136 && !class139.field1951) {
            try {
                class317 var3 = (class317) Class.forName("pp").getDeclaredConstructor().newInstance();
                var3.method1940(116, arg1);
                return var3;
            } catch (Throwable var4) {
                class139.field1951 = true;
            }
        }
        return arg0 ? class606.method3355(arg1, 0) : arg1;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 71)
    public static void method2953(byte arg0) {
        int var1 = 44 % ((-arg0 - 73) / 40);
        field7265 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "([BFFIFFIFIIIIILtfa;)V", line = 80)
    public static final void method2954(byte[] arg0, float arg1, float arg2, int arg3, float arg4, float arg5, int arg6, float arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class31 arg13) {
        field7275++;
        int var14 = arg6 * arg11;
        float[] var15 = new float[var14];
        for (int var16 = 0; var16 < arg12; var16++) {
            arg13.method137(arg11, arg7 / (float) arg6, arg6, arg10, arg1 / (float) arg10, (byte) -95, arg4 * 127.0F, arg5 / (float) arg11, 0, var15, arg9);
            int var19 = arg3;
            arg1 *= 2.0F;
            arg4 = arg2 * arg4;
            arg7 *= 2.0F;
            arg5 *= 2.0F;
            for (int var20 = 0; var20 < var14; var20++) {
                arg0[var19] = (byte) ((int) ((float) arg0[var19] + var15[var20]));
                var19++;
            }
        }
        if (arg8 > -90) {
            method2954(null, -0.670731F, 0.97923315F, -79, -1.8617071F, -0.48729783F, 84, -0.05565377F, 45, 102, -101, -9, -31, null);
        }
        int var17 = arg3;
        for (int var18 = 0; var18 < var14; var18++) {
            arg0[var17] = (byte) (arg0[var17] + 127);
            var17++;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Ljava/lang/String;", line = 133)
    public static final String method2955(int arg0) {
        field7266++;
        if (arg0 >= -97) {
            method2952(false, null, 82);
        }
        return class229.field3278 || class643.field9138 == null ? "" : class643.field9138.field4985;
    }
}
