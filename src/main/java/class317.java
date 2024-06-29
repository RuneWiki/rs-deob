import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class317 implements class417 {

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "I")
    public int field4156;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "Lff;")
    public static class9 field4157 = new class9(11, 0);

    @OriginalMember(owner = "client!sl", name = "f", descriptor = "[I")
    public static int[] field4161 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "I")
    public static int field4158;

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "I")
    public static int field4160;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "I")
    public static int field4162;

    @OriginalMember(owner = "client!sl", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field4159++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)V", line = 20)
    public static final void method1836(int arg0) {
        class56.field881 = new class441(8);
        int var1 = 90 % ((3 - arg0) / 53);
        field4160++;
        class370.field4987 = 0;
        for (class527 var2 = (class527) class264.field3485.method1771(116); var2 != null; var2 = (class527) class264.field3485.method1774((byte) -47)) {
            var2.method3101();
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)V", line = 42)
    public static void method1837(boolean arg0) {
        if (!arg0) {
            field4157 = null;
        }
        field4161 = null;
        field4157 = null;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIIIII[FIF)V", line = 53)
    public static final void method1838(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, float[] arg7, int arg8, float arg9) {
        int var10 = arg8 - arg2;
        int var11 = arg0 - arg6;
        field4158++;
        int var12 = arg4 - arg5;
        float var13 = arg7[arg3] * (float) var11 + arg7[1] * (float) var12 + arg7[0] * (float) var10;
        float var14 = arg7[5] * (float) var11 + arg7[3] * (float) var10 + arg7[4] * (float) var12;
        float var15 = arg7[8] * (float) var11 + arg7[6] * (float) var10 + arg7[7] * (float) var12;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg9 + 0.5F;
        if (arg1 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg1 == 2) {
            var18 = -var18;
            var17 = -var17;
        } else if (arg1 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class363.field4919 = var17;
        class92.field1392 = var18;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 115)
    public class317(String arg0, int arg1) {
        this.field4156 = arg1;
    }
}
