import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class339 extends class114 {

    @OriginalMember(owner = "client!eu", name = "x", descriptor = "Lhd;")
    public class531 field5251;

    @OriginalMember(owner = "client!eu", name = "u", descriptor = "Lff;")
    public class8 field5248;

    @OriginalMember(owner = "client!eu", name = "t", descriptor = "I")
    public int field5247;

    @OriginalMember(owner = "client!eu", name = "v", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!eu", name = "w", descriptor = "I")
    public int field5250;

    @OriginalMember(owner = "client!eu", name = "y", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!eu", name = "z", descriptor = "I")
    public int field5253;

    @OriginalMember(owner = "client!eu", name = "A", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!eu", name = "B", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!eu", name = "D", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!eu", name = "F", descriptor = "I")
    public int field5258;

    @OriginalMember(owner = "client!eu", name = "E", descriptor = "Luu;")
    public static class191 field5257;

    static {
        new class446("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        new class446("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lnj;I)Ltu;", line = 7)
    public static final class236 method2191(class164 arg0, int arg1) {
        if (arg1 == 0) {
            field5256++;
            return new class236(arg0.method1056(1024), arg0.method1056(1024), arg0.method1056(arg1 + 1024), arg0.method1056(1024), arg0.method1090(arg1 - 1), arg0.method1087(false));
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIFI[FIIFIII)V", line = 18)
    public static final void method2192(int arg0, int arg1, float arg2, int arg3, float[] arg4, int arg5, int arg6, float arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg6;
        field5249++;
        int var12 = arg5 - arg3;
        int var13 = arg0 - arg10;
        float var14 = arg4[2] * (float) var11 + arg4[1] * (float) var12 + arg4[0] * (float) var13;
        float var15 = arg4[5] * (float) var11 + arg4[arg1] * (float) var13 + arg4[4] * (float) var12;
        float var16 = arg4[8] * (float) var11 + arg4[6] * (float) var13 + arg4[7] * (float) var12;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var17 = arg7 * var17;
        }
        float var18 = var15 + arg2 + 0.5F;
        if (arg9 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg9 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg9 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class459.field6879 = var17;
        class32.field470 = var18;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IB)Z", line = 73)
    public static final boolean method2193(int arg0, byte arg1) {
        field5255++;
        if (arg1 != 50) {
            field5257 = null;
        }
        return arg0 == 0 || arg0 == 1 || arg0 == 2;
    }

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "(I)V", line = 85)
    public final void method2194(int arg0) {
        this.field5253 = this.field5251.field7810;
        this.field5254 = this.field5251.field7803;
        this.field5258 = this.field5251.field7802;
        field5252++;
        if (this.field5251.field7807 != null) {
            this.field5251.field7807.method147(this.field5248.field159, this.field5248.field154, this.field5248.field164, class359.field5521);
        }
        this.field5250 = class359.field5521[arg0];
        this.field5247 = class359.field5521[2];
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Z)V", line = 117)
    public static void method2195(boolean arg0) {
        if (arg0) {
            field5257 = null;
        }
    }

    @OriginalMember(owner = "client!eu", name = "<init>", descriptor = "(Lhd;Ljg;)V", line = 127)
    public class339(class531 arg0, class228 arg1) {
        this.field5251 = arg0;
        this.field5248 = this.field5251.method3140((byte) -37);
        this.method2194(0);
    }
}
