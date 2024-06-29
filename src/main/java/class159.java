import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public abstract class class159 extends class434 {

    @OriginalMember(owner = "client!aba", name = "g", descriptor = "I")
    public static int field2379 = -1;

    @OriginalMember(owner = "client!aba", name = "j", descriptor = "Lfc;")
    public static class235 field2382 = new class235(114, -1);

    @OriginalMember(owner = "client!aba", name = "k", descriptor = "Lvh;")
    public static class328 field2383 = new class328(64);

    @OriginalMember(owner = "client!aba", name = "l", descriptor = "Lfaa;")
    public static class140 field2384 = null;

    @OriginalMember(owner = "client!aba", name = "m", descriptor = "F")
    public static float field2385;

    @OriginalMember(owner = "client!aba", name = "f", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!aba", name = "h", descriptor = "I")
    public static int field2380;

    @OriginalMember(owner = "client!aba", name = "i", descriptor = "I")
    public static int field2381;

    @OriginalMember(owner = "client!aba", name = "n", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!aba", name = "b", descriptor = "(B)V")
    public static void method1098(byte arg0) {
        field2384 = null;
        field2382 = null;
        field2383 = null;
        if (arg0 != -63) {
            method1098((byte) 82);
        }
    }

    @OriginalMember(owner = "client!aba", name = "c", descriptor = "(B)Lwg;")
    public abstract class389 method1099(byte arg0);

    @OriginalMember(owner = "client!aba", name = "d", descriptor = "(B)V")
    public static final void method1100(byte arg0) {
        field2381++;
        field2383.method1997(arg0 ^ 0xFFFFFFA5);
        if (arg0 != -92) {
            field2383 = null;
        }
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(I)Ljd;")
    public static final class209 method1101(int arg0) {
        field2378++;
        if (class148.field2193 == null || class441.field6208 == null) {
            return null;
        }
        class441.field6208.method2523(class148.field2193, 17333);
        class209 var1 = (class209) class441.field6208.method2522(0);
        if (var1 == null) {
            return null;
        }
        class307 var2 = class148.field2180.method2872((byte) 123, var1.field3086);
        if (arg0 >= -107) {
            method1100((byte) -21);
        }
        return var2 != null && var2.field4545 && var2.method1883(-1, class148.field2179) ? var1 : class509.method2834((byte) 102);
    }

    @OriginalMember(owner = "client!aba", name = "a", descriptor = "(IIII[FIFIIFI)V")
    public static final void method1102(int arg0, int arg1, int arg2, int arg3, float[] arg4, int arg5, float arg6, int arg7, int arg8, float arg9, int arg10) {
        field2380++;
        int var11 = arg1 - arg2;
        int var12 = arg0 - arg7;
        int var13 = arg10 - arg5;
        float var14 = arg4[2] * (float) var12 + arg4[1] * (float) var11 + arg4[0] * (float) var13;
        float var15 = arg4[5] * (float) var12 + arg4[3] * (float) var13 + arg4[4] * (float) var11;
        float var16 = arg4[8] * (float) var12 + arg4[7] * (float) var11 + arg4[6] * (float) var13;
        int var17 = 39 / ((49 - arg3) / 57);
        float var18 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg9 != 1.0F) {
            var18 = arg9 * var18;
        }
        float var19 = var15 + arg6 + 0.5F;
        if (arg8 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (arg8 == 2) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg8 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        class627.field8744 = var18;
        class507.field6946 = var19;
    }
}
