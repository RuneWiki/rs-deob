import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class485 implements class415 {

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "Lcg;")
    private class314 field6553;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field6555 = 0;

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "[I")
    public static int[] field6556 = new int[6];

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field6560 = 0;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Ljj;")
    public static class398 field6558 = new class398(53, -1);

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "I")
    public static int field6554;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field6559;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lxa;")
    public static class424 field6564;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)V", line = 3)
    public static void method2703(byte arg0) {
        field6564 = null;
        int var1 = -5 / ((arg0 - 16) / 60);
        field6558 = null;
        field6556 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(ZB)V", line = 14)
    public final void method277(boolean arg0, byte arg1) {
        if (arg0) {
            class9.field103.method1926(0, 0, class303.field4059, class211.field2763, this.field6553.field4511, 0);
        }
        if (arg1 > -13) {
            field6558 = null;
        }
        field6562++;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Ldga;B)Lfba;", line = 28)
    public static final class667 method2704(class138 arg0, byte arg1) {
        field6557++;
        int var2 = arg0.method957((byte) -102);
        class380 var3 = class248.method1550(arg1 - 117)[arg0.method957((byte) -117)];
        if (arg1 != -2) {
            return null;
        }
        class97 var4 = class296.method1767(false)[arg0.method957((byte) -75)];
        int var5 = arg0.method924(2);
        int var6 = arg0.method924(2);
        int var7 = arg0.method922((byte) -116);
        int var8 = arg0.method922((byte) -116);
        int var9 = arg0.method943(-114);
        int var10 = arg0.method943(arg1 - 72);
        int var11 = arg0.method943(arg1 - 99);
        boolean var12 = arg0.method957((byte) -72) == 1;
        return new class667(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 61)
    public final void method191(byte arg0) {
        if (arg0 < -5) {
            field6561++;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IBIZ)I", line = 80)
    public static final int method2705(int arg0, byte arg1, int arg2, boolean arg3) {
        field6554++;
        class149 var4 = class255.method1597(arg0, arg3, 27628);
        if (var4 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var5 = 0;
            int var6 = 56 % ((arg1 - 52) / 35);
            for (int var7 = 0; var7 < var4.field1877.length; var7++) {
                if (var4.field1873[var7] == arg2) {
                    var5 += var4.field1877[var7];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(Lcg;)V", line = 119)
    public class485(class314 arg0) {
        this.field6553 = arg0;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Z", line = 129)
    public final boolean method193(int arg0) {
        if (arg0 != -29581) {
            method2703((byte) -11);
        }
        field6565++;
        return true;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)I", line = 148)
    public static final int method2706(int arg0) {
        if (arg0 == 0) {
            field6559++;
            return class205.field2685;
        } else {
            return 124;
        }
    }
}
