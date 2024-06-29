import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class368 implements Runnable {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[Lou;")
    public volatile class428[] field4966 = new class428[2];

    @OriginalMember(owner = "client!de", name = "f", descriptor = "Z")
    public volatile boolean field4970 = false;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "Z")
    public volatile boolean field4969 = false;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lub;")
    public static class18 field4965 = new class18(16);

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Ljs;")
    public class216 field4967;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V")
    public static void method2136(byte arg0) {
        int var1 = 61 % ((arg0 - 48) / 40);
        field4965 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(FIFIIIIIIFZI[F)V")
    public static final void method2137(float arg0, int arg1, float arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, float arg9, boolean arg10, int arg11, float[] arg12) {
        int var13 = arg11 - arg3;
        if (arg10) {
            method2137(-0.13643418F, 34, 0.23976204F, -103, 75, 51, 101, 112, -42, -0.22656952F, false, 52, null);
        }
        int var14 = arg8 - arg1;
        int var15 = arg5 - arg4;
        field4968++;
        float var16 = arg12[2] * (float) var15 + arg12[0] * (float) var14 + arg12[1] * (float) var13;
        float var17 = arg12[5] * (float) var15 + arg12[4] * (float) var13 + arg12[3] * (float) var14;
        float var18 = arg12[8] * (float) var15 + arg12[7] * (float) var13 + arg12[6] * (float) var14;
        float var19;
        float var20;
        if (arg7 == 0) {
            var19 = arg9 + 0.5F - var18;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg7 == 1) {
            var19 = arg9 + var18 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
        } else if (arg7 == 2) {
            var19 = arg0 + 0.5F - var17;
            var20 = arg2 + 0.5F - var16;
        } else if (arg7 == 3) {
            var20 = arg2 + var16 + 0.5F;
            var19 = arg0 + 0.5F - var17;
        } else if (arg7 == 4) {
            var19 = arg0 + 0.5F - var17;
            var20 = arg9 + var18 + 0.5F;
        } else {
            var19 = arg0 + 0.5F - var17;
            var20 = arg9 + 0.5F - var18;
        }
        if (arg6 == 1) {
            float var21 = var20;
            var20 = -var19;
            var19 = var21;
        } else if (arg6 == 2) {
            var19 = -var19;
            var20 = -var20;
        } else if (arg6 == 3) {
            float var22 = var20;
            var20 = var19;
            var19 = -var22;
        }
        class202.field2795 = var19;
        class397.field5355 = var20;
    }

    @OriginalMember(owner = "client!de", name = "run", descriptor = "()V")
    public final void run() {
        this.field4969 = true;
        field4971++;
        try {
            while (!this.field4970) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class428 var2 = this.field4966[var1];
                    if (var2 != null) {
                        var2.method2473(0);
                    }
                }
                class94.method674(10L, 1);
                class168.method1126(this.field4967, null, (byte) 127);
            }
        } catch (Exception var9) {
            class504.method2879(var9, null, -19638);
        } finally {
            Object var6 = null;
            this.field4969 = false;
        }
    }
}
