import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class86 {

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Liu;")
    public static class390 field1170 = new class390(26, -1);

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "Liu;")
    public static class390 field1180 = new class390(1, 5);

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1174;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1176;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field1178;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "J")
    public long field1177;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Lqn;")
    public static class44 field1182;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "Lcg;")
    public class86 field1173;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "Lcg;")
    public class86 field1179;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 8)
    public final void method536(boolean arg0) {
        field1172++;
        if (this.field1173 == null) {
            return;
        }
        this.field1173.field1179 = this.field1179;
        if (!arg0) {
            this.field1179.field1173 = this.field1173;
            this.field1173 = null;
            this.field1179 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)J", line = 27)
    public static final long method537(byte arg0) {
        if (arg0 != 14) {
            field1170 = null;
        }
        field1169++;
        return class298.field4335.method236(-127);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 42)
    public static void method538(int arg0) {
        field1180 = null;
        int var1 = -1 % ((arg0 - 38) / 52);
        field1170 = null;
        field1182 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)V", line = 56)
    public static final void method539(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 >= class473.field6839 && arg3 <= class63.field933 && arg1 >= class7.field131 && class92.field1252 >= arg2) {
            class271.method1654(-67, arg5, arg1, arg2, arg4, arg3);
        } else {
            class347.method2095(arg5, arg1, arg2, arg3, arg4, (byte) -16);
        }
        int var6 = 12 / ((arg0 + 53) / 50);
        field1174++;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)V", line = 72)
    public static final void method540(byte arg0) {
        if (arg0 > -12) {
            method538(89);
        }
        if (class481.field6937.method742()) {
            class481.field6937.method772(class498.field7590);
            class408.method2441((byte) 90);
            class481.field6937.method746(class498.field7590);
            class481.field6937.method734(class498.field7590);
        } else {
            class46.method353(class293.field4174, true);
        }
        field1178++;
        class176.method1103(0);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([FIIIFIIFZII)V", line = 94)
    public static final void method541(float[] arg0, int arg1, int arg2, int arg3, float arg4, int arg5, int arg6, float arg7, boolean arg8, int arg9, int arg10) {
        int var11 = arg10 - arg2;
        int var12 = arg5 - arg6;
        int var13 = arg9 - arg1;
        field1171++;
        float var14 = arg0[2] * (float) var12 + arg0[0] * (float) var11 + arg0[1] * (float) var13;
        if (!arg8) {
            field1180 = null;
        }
        float var15 = arg0[5] * (float) var12 + arg0[4] * (float) var13 + arg0[3] * (float) var11;
        float var16 = arg0[8] * (float) var12 + arg0[6] * (float) var11 + arg0[7] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg7 != 1.0F) {
            var17 = arg7 * var17;
        }
        float var18 = var15 + arg4 + 0.5F;
        if (arg3 == 1) {
            float var19 = var17;
            var17 = -var18;
            var18 = var19;
        } else if (arg3 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg3 == 3) {
            float var20 = var17;
            var17 = var18;
            var18 = -var20;
        }
        class61.field910 = var17;
        class126.field1621 = var18;
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(B)Z", line = 151)
    public final boolean method542(byte arg0) {
        field1176++;
        if (this.field1173 == null) {
            return false;
        } else {
            if (arg0 > -11) {
                method540((byte) 18);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(III)I", line = 165)
    public static final int method543(int arg0, int arg1, int arg2) {
        field1175++;
        if (arg2 != 2) {
            method541(null, 109, 8, -5, 0.47217128F, 82, -93, -0.32345602F, false, 119, -1);
        }
        int var3 = arg1 >>> 31;
        return (arg1 + var3) / arg0 - var3;
    }
}
