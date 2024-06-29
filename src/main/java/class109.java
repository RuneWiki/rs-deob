import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class109 extends class260 {

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public int field1639 = -1;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "Z")
    public boolean field1640 = false;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!hq", name = "t", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II[FIIFIIII)V")
    public static final void method797(int arg0, int arg1, float[] arg2, int arg3, int arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg3 - arg4;
        int var11 = arg7 - arg8;
        int var12 = arg6 - arg9;
        field1647++;
        float var13 = arg2[2] * (float) var12 + arg2[0] * (float) var10 + arg2[1] * (float) var11;
        float var14 = arg2[5] * (float) var12 + arg2[4] * (float) var11 + arg2[3] * (float) var10;
        float var15 = arg2[8] * (float) var12 + arg2[6] * (float) var10 + arg2[7] * (float) var11;
        float var16 = (float) Math.sqrt((double) (var15 * var15 + var13 * var13 + var14 * var14));
        float var17 = (float) Math.atan2((double) var13, (double) var15) / 6.2831855F + 0.5F;
        float var18 = (float) Math.asin((double) (var14 / var16)) / 3.1415927F + arg5 + 0.5F;
        if (arg0 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg0 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg0 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class278.field3813 = var18;
        if (arg1 >= 2) {
            class87.field1276 = var17;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lmg;III)Lkq;")
    public static final class419 method798(class101 arg0, int arg1, int arg2, int arg3) {
        if (arg3 > -54) {
            return null;
        } else {
            field1646++;
            byte[] var4 = arg0.method727(arg1, arg2, -103);
            return var4 == null ? null : new class419(var4);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "(I)V")
    public class109(int arg0) {
        this.field1639 = arg0;
    }
}
