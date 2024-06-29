import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rq")
public abstract class class325 {

    @OriginalMember(owner = "client!rq", name = "d", descriptor = "Z")
    public static boolean field4501 = false;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!rq", name = "b", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!rq", name = "c", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!rq", name = "e", descriptor = "I")
    public static int field4502;

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "([FIIFIIZIFII)V", line = 12)
    public static final void method1958(float[] arg0, int arg1, int arg2, float arg3, int arg4, int arg5, boolean arg6, int arg7, float arg8, int arg9, int arg10) {
        int var11 = arg9 - arg2;
        if (!arg6) {
            method1958(null, -37, 13, -0.88974357F, 82, 113, false, -96, -0.9551127F, 66, 3);
        }
        int var12 = arg5 - arg4;
        int var13 = arg1 - arg10;
        field4498++;
        float var14 = arg0[2] * (float) var13 + arg0[0] * (float) var12 + arg0[1] * (float) var11;
        float var15 = arg0[5] * (float) var13 + arg0[4] * (float) var11 + arg0[3] * (float) var12;
        float var16 = arg0[8] * (float) var13 + arg0[6] * (float) var12 + arg0[7] * (float) var11;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg8 != 1.0F) {
            var17 = arg8 * var17;
        }
        float var18 = var15 + arg3 + 0.5F;
        if (arg7 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg7 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg7 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class195.field2847 = var17;
        class175.field2697 = var18;
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lsg;I)V", line = 67)
    public static final void method1959(class369 arg0, int arg1) {
        arg0.field4986 = null;
        field4499++;
        if (arg1 != 5) {
            method1958(null, 69, -57, 0.38962275F, -54, 116, false, -73, 1.0173423F, 48, -55);
        }
        if (class69.field1039 < 20) {
            class561.field7435.method327(arg0, true);
            class69.field1039++;
        }
    }

    @OriginalMember(owner = "client!rq", name = "a", descriptor = "(Lvs;I)Lvs;")
    public abstract class553 method1819(class553 arg0, int arg1);
}
