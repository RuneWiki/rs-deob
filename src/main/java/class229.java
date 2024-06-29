import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class229 {

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Lbw;")
    public class590 field3267 = new class590();

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Ldv;")
    public static class566 field3266 = new class566(21, 4);

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "F")
    public static float field3271;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "F")
    public static float field3272;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field3270;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "Lbw;")
    private class590 field3273;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lbw;B)V")
    public final void method1454(class590 arg0, byte arg1) {
        if (arg0.field8426 != null) {
            arg0.method3457(60);
        }
        field3269++;
        arg0.field8426 = this.field3267.field8426;
        if (arg1 < 96) {
            this.method1457(59);
        }
        arg0.field8428 = this.field3267;
        arg0.field8426.field8428 = arg0;
        arg0.field8428.field8426 = arg0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)I")
    public final int method1455(int arg0) {
        field3265++;
        int var2 = 0;
        class590 var3 = this.field3267.field8428;
        if (arg0 < 101) {
            method1461(107, -38);
        }
        while (this.field3267 != var3) {
            var2++;
            var3 = var3.field8428;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)Lbw;")
    public final class590 method1456(int arg0) {
        field3262++;
        if (arg0 != 21) {
            method1458(122, null, -93, 103, false);
        }
        class590 var2 = this.field3273;
        if (this.field3267 == var2) {
            this.field3273 = null;
            return null;
        } else {
            this.field3273 = var2.field8428;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)Lbw;")
    public final class590 method1457(int arg0) {
        field3263++;
        class590 var2 = this.field3267.field8428;
        if (this.field3267 == var2) {
            this.field3273 = null;
            return null;
        } else {
            this.field3273 = var2.field8428;
            return arg0 == 9 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/lang/String;IIZ)V")
    public static final void method1458(int arg0, String arg1, int arg2, int arg3, boolean arg4) {
        field3270++;
        if (arg4) {
            field3271 = 0.6339156F;
        }
        class114 var5 = class512.method2969(arg2, arg0, (byte) 116);
        if (var5 == null) {
            return;
        }
        if (var5.field1821 != null) {
            class224 var6 = new class224();
            var6.field3212 = arg3;
            var6.field3210 = var5;
            var6.field3207 = var5.field1821;
            var6.field3201 = arg1;
            class123.method862(var6);
        }
        if (class440.field6254 != 9 || !client.method1534(var5).method2894(arg3 - 1, (byte) 101)) {
            return;
        }
        if (arg3 == 1) {
            class351.method2108(class461.field6473, -10511);
            class379.field5091++;
            class268.method1750(true, arg0, var5.field1787, arg2);
        }
        if (arg3 == 2) {
            class351.method2108(class360.field4843, -10511);
            class494.field6916++;
            class268.method1750(!arg4, arg0, var5.field1787, arg2);
        }
        if (arg3 == 3) {
            class351.method2108(class267.field3750, -10511);
            class504.field7012++;
            class268.method1750(true, arg0, var5.field1787, arg2);
        }
        if (arg3 == 4) {
            class330.field4410++;
            class351.method2108(class476.field6707, -10511);
            class268.method1750(!arg4, arg0, var5.field1787, arg2);
        }
        if (arg3 == 5) {
            class351.method2108(class566.field7823, -10511);
            class47.field906++;
            class268.method1750(true, arg0, var5.field1787, arg2);
        }
        if (arg3 == 6) {
            class351.method2108(class110.field1702, -10511);
            class126.field2045++;
            class268.method1750(true, arg0, var5.field1787, arg2);
        }
        if (arg3 == 7) {
            class374.field5029++;
            class351.method2108(class303.field4143, -10511);
            class268.method1750(true, arg0, var5.field1787, arg2);
        }
        if (arg3 == 8) {
            class623.field8994++;
            class351.method2108(class318.field4317, -10511);
            class268.method1750(true, arg0, var5.field1787, arg2);
        }
        if (arg3 == 9) {
            class384.field5144++;
            class351.method2108(class603.field8708, -10511);
            class268.method1750(true, arg0, var5.field1787, arg2);
        }
        if (arg3 == 10) {
            class563.field7807++;
            class351.method2108(class593.field8598, -10511);
            class268.method1750(true, arg0, var5.field1787, arg2);
        }
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(I)V")
    public static void method1459(int arg0) {
        field3266 = null;
        if (arg0 != 5) {
            method1461(86, -29);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public final void method1460(byte arg0) {
        while (true) {
            class590 var2 = this.field3267.field8428;
            if (this.field3267 == var2) {
                field3264++;
                if (arg0 >= -104) {
                    method1459(68);
                }
                this.field3273 = null;
                return;
            }
            var2.method3457(60);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public static final int method1461(int arg0, int arg1) {
        if (arg1 != 1017261258) {
            field3266 = null;
        }
        field3268++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class229() {
        this.field3267.field8426 = this.field3267;
        this.field3267.field8428 = this.field3267;
    }
}
