import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class630 extends class173 implements class544 {

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    private int field9254;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field9255 = 0;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lh;")
    public static class572 field9256 = new class572("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "F")
    public static float field9259;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field9257;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field9258;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field9260;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Lkda;")
    public static class328 field9253;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(B)I", line = 3)
    public final int method3315(byte arg0) {
        ++field9257;
        if (arg0 > -71) {
            this.field9254 = 98;
        }
        return this.field9254;
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(B)V", line = 15)
    public static void method3670(byte arg0) {
        field9253 = null;
        int var1 = 98 % ((80 - arg0) / 41);
        field9256 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)I", line = 28)
    public final int method3313(byte arg0) {
        ++field9258;
        return arg0 <= 15 ? 63 : 0;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BBII)V", line = 39)
    public final void method3312(byte[] arg0, byte arg1, int arg2, int arg3) {
        ++field9260;
        this.method1221(arg0, arg3);
        int var5 = -28 % ((22 - arg1) / 36);
        this.field9254 = arg2;
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)J", line = 52)
    public final long method3314(byte arg0) {
        if (arg0 != -38) {
            field9259 = 1.1352509F;
        }
        ++field9252;
        return super.field2675.getAddress();
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(FIII[FBIIIIF)V", line = 66)
    public static final void method3671(float arg0, int arg1, int arg2, int arg3, float[] arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, float arg10) {
        int var11 = arg7 - arg1;
        ++field9251;
        int var12 = arg2 - arg8;
        int var13 = arg6 - arg3;
        float var14 = arg4[2] * (float) var13 + arg4[0] * (float) var11 + arg4[1] * (float) var12;
        float var15 = arg4[5] * (float) var13 + arg4[4] * (float) var12 + arg4[3] * (float) var11;
        int var16 = -109 / ((39 - arg5) / 48);
        float var17 = arg4[8] * (float) var13 + arg4[6] * (float) var11 + arg4[7] * (float) var12;
        float var18 = (float) Math.atan2((double) var14, (double) var17) / 6.2831855F + 0.5F;
        if (arg10 != 1.0F) {
            var18 = arg10 * var18;
        }
        float var19 = var15 + 0.5F + arg0;
        if (arg9 == 1) {
            float var20 = var18;
            var18 = -var19;
            var19 = var20;
        } else if (~arg9 == -3) {
            var18 = -var18;
            var19 = -var19;
        } else if (arg9 == 3) {
            float var21 = var18;
            var18 = var19;
            var19 = -var21;
        }
        class315.field4335 = var19;
        class18.field167 = var18;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)V", line = 120)
    public static final void method3672(int arg0, int arg1, int arg2) {
        boolean var3 = class420.field5697[0][arg1][arg2] != null && class420.field5697[0][arg1][arg2].field3025 != null;
        for (int var4 = arg0; var4 >= 0; --var4) {
            if (class420.field5697[var4][arg1][arg2] == null) {
                class205 var5 = class420.field5697[var4][arg1][arg2] = new class205(var4, arg1, arg2);
                if (var3) {
                    ++var5.field3036;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lte;ILjaclib/memory/Buffer;)V", line = 144)
    public class630(class527 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field9254 = arg1;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "(Lte;I[BI)V", line = 155)
    public class630(class527 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field9254 = arg1;
    }
}
