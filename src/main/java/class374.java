import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class374 {

    @OriginalMember(owner = "client!wl", name = "j", descriptor = "Z")
    public boolean field5306 = true;

    @OriginalMember(owner = "client!wl", name = "c", descriptor = "Lbs;")
    public static class631 field5299 = null;

    @OriginalMember(owner = "client!wl", name = "f", descriptor = "Ljava/lang/String;")
    public static String field5302 = "";

    @OriginalMember(owner = "client!wl", name = "i", descriptor = "C")
    private char field5305;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!wl", name = "d", descriptor = "I")
    public int field5300;

    @OriginalMember(owner = "client!wl", name = "g", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!wl", name = "h", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!wl", name = "k", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!wl", name = "e", descriptor = "Ljava/lang/String;")
    public String field5301;

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(I)V", line = 3)
    public static void method2180(int arg0) {
        field5302 = null;
        if (arg0 != 1) {
            method2180(-46);
        }
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(Ljr;I)V", line = 13)
    public final void method2181(class96 arg0, int arg1) {
        if (arg1 != -14230) {
            this.field5301 = null;
        }
        field5304++;
        while (true) {
            int var3 = arg0.method718(89);
            if (var3 == 0) {
                return;
            }
            this.method2184(-15007, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!wl", name = "b", descriptor = "(I)Z", line = 45)
    public final boolean method2182(int arg0) {
        field5307++;
        if (arg0 != 115) {
            this.method2184(-5, 31, null);
        }
        return this.field5305 == 's';
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IIII[FFIIII)V", line = 56)
    public static final void method2183(int arg0, int arg1, int arg2, int arg3, float[] arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg3 - arg7;
        int var11 = arg8 - arg2;
        field5298++;
        int var12 = arg1 - arg0;
        float var13 = arg4[2] * (float) var11 + arg4[1] * (float) var10 + arg4[0] * (float) var12;
        float var14 = arg4[5] * (float) var11 + arg4[arg9] * (float) var10 + arg4[3] * (float) var12;
        float var15 = arg4[8] * (float) var11 + arg4[7] * (float) var10 + arg4[6] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg5 + 0.5F;
        if (arg6 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg6 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg6 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class496.field6838 = var17;
        class226.field3255 = var18;
    }

    @OriginalMember(owner = "client!wl", name = "a", descriptor = "(IILjr;)V", line = 110)
    private final void method2184(int arg0, int arg1, class96 arg2) {
        if (arg1 == 1) {
            this.field5305 = class274.method1671(arg2.method748(arg0 ^ 0x308476F1), true);
        } else if (arg1 == 2) {
            this.field5300 = arg2.method714(false);
        } else if (arg1 == 4) {
            this.field5306 = false;
        } else if (arg1 == 5) {
            this.field5301 = arg2.method739(-118);
        }
        if (arg0 == -15007) {
            field5303++;
        }
    }
}
