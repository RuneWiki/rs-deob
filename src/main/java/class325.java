import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class325 {

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field5057 = 0;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "[[I")
    public static int[][] field5061 = new int[6][];

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public static int field5062;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(I)V")
    public static void method2189(int arg0) {
        if (arg0 != 2) {
            method2189(120);
        }
        field5061 = null;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lri;IIIIIZ)V")
    public static final void method2190(class97 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg4 >= arg5) {
            class143.method1216(arg1, arg0, arg3, (byte) 126, arg6, arg2);
        } else {
            class338.field5487 = arg6;
            class490.field7168 = arg3;
            class20.field332 = 1;
            class474.field7018 = null;
            class386.field6000 = arg0;
            class419.field6421 = arg2;
            class20.field326 = arg1;
            class206.field3453 = class252.field4036.method228(arg4 - 16257) / arg5;
            if (class206.field3453 < 1) {
                class206.field3453 = 1;
            }
        }
        field5058++;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIII)V")
    public static final void method2191(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5062++;
        float var5 = (float) class378.field5888 / (float) class378.field5905;
        int var6 = arg0;
        int var7 = arg3;
        if (var5 < 1.0F) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = arg2 - (arg0 - var6) / 2;
        int var9 = arg4 - (arg3 - var7) / 2;
        class528.field7705 = class378.field5905 * var8 / var6;
        class97.field1570 = class378.field5888 - (class378.field5888 * var9 / var7);
        class55.field717 = -1;
        class2.field16 = -1;
        if (arg1 != 1424) {
            field5057 = 85;
        }
        class555.method3320(-7733);
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Leq;Z)V")
    public static final void method2192(class195 arg0, boolean arg1) {
        field5060++;
        if (!arg1) {
            method2191(-80, 73, -25, -98, 107);
        }
        arg0.field3224 = false;
        if (arg0.field3225 != null) {
            arg0.field3225.field8579 = 0;
        }
        for (class195 var2 = arg0.method219(); var2 != null; var2 = arg0.method220()) {
            method2192(var2, true);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZIIF[FIIIIF)V")
    public static final void method2193(int arg0, boolean arg1, int arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, int arg8, int arg9, float arg10) {
        int var11 = arg0 - arg8;
        field5059++;
        int var12 = arg3 - arg2;
        int var13 = arg9 - arg6;
        float var14 = arg5[2] * (float) var11 + arg5[1] * (float) var12 + arg5[0] * (float) var13;
        float var15 = arg5[5] * (float) var11 + arg5[4] * (float) var12 + arg5[3] * (float) var13;
        float var16 = arg5[8] * (float) var11 + arg5[7] * (float) var12 + arg5[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (!arg1) {
            field5057 = -3;
        }
        if (arg10 != 1.0F) {
            var17 = arg10 * var17;
        }
        float var18 = var15 + arg4 + 0.5F;
        if (arg7 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg7 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg7 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class163.field2753 = var17;
        class304.field4745 = var18;
    }
}
