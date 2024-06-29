import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!om")
public class class374 implements class698 {

    @OriginalMember(owner = "client!om", name = "f", descriptor = "Lag;")
    private class439 field5253;

    @OriginalMember(owner = "client!om", name = "d", descriptor = "Lkha;")
    private class687 field5251;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "I")
    public static int field5248 = 0;

    @OriginalMember(owner = "client!om", name = "i", descriptor = "I")
    public static int field5256 = 0;

    @OriginalMember(owner = "client!om", name = "k", descriptor = "I")
    public static int field5258 = -1;

    @OriginalMember(owner = "client!om", name = "b", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!om", name = "e", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!om", name = "g", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!om", name = "h", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!om", name = "j", descriptor = "I")
    public static int field5257;

    @OriginalMember(owner = "client!om", name = "l", descriptor = "I")
    public static int field5259;

    @OriginalMember(owner = "client!om", name = "c", descriptor = "Lnl;")
    public static class681 field5250;

    @OriginalMember(owner = "client!om", name = "m", descriptor = "Lac;")
    private class712 field5260;

    @OriginalMember(owner = "client!om", name = "n", descriptor = "[[[J")
    public static long[][][] field5261;

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Z)V", line = 4)
    public static void method2274(boolean arg0) {
        if (!arg0) {
            method2275(null, 71);
        }
        field5250 = null;
        field5261 = null;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(Lga;I)Z", line = 25)
    public static final boolean method2275(class70 arg0, int arg1) {
        if (arg1 != 2) {
            field5258 = -58;
        }
        field5259++;
        return class389.field5423 == arg0 || class172.field2258 == arg0 || class462.field6702 == arg0 || class323.field4115 == arg0;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(I)V", line = 40)
    public final void method621(int arg0) {
        this.field5260 = class339.method1984(this.field5251, this.field5253.field6164, 121);
        field5255++;
        if (arg0 != 27799) {
            this.field5253 = null;
        }
    }

    @OriginalMember(owner = "client!om", name = "b", descriptor = "(ZI)Z", line = 54)
    public static final boolean method2276(boolean arg0, int arg1) {
        if (arg0) {
            return true;
        } else {
            field5249++;
            return arg1 == 3 || arg1 == 4 || arg1 == 5 || arg1 == 6;
        }
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(B)Z", line = 70)
    public final boolean method616(byte arg0) {
        field5257++;
        return arg0 == 30 ? this.field5251.method3827(this.field5253.field6164, (byte) 114) : false;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(II)Z", line = 81)
    public static final boolean method2277(int arg0, int arg1) {
        field5254++;
        if (arg0 != -6) {
            field5248 = -12;
        }
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!om", name = "a", descriptor = "(ZI)V", line = 92)
    public final void method620(boolean arg0, int arg1) {
        if (arg1 < 108) {
            return;
        }
        field5252++;
        if (!arg0) {
            return;
        }
        int var3 = class303.field3896 < class599.field8320 ? class599.field8320 : class303.field3896;
        int var4 = class84.field1083 <= class708.field9966 ? class708.field9966 : class84.field1083;
        int var5 = this.field5260.method1892();
        int var6 = this.field5260.method1882();
        int var7 = 0;
        int var8 = var3;
        int var9 = var3 * var6 / var5;
        int var10 = (var4 - var9) / 2;
        if (var4 < var9) {
            var8 = var4 * var5 / var6;
            var10 = 0;
            var9 = var4;
            var7 = (var3 - var8) / 2;
        }
        this.field5260.method3933(var7, var10, var8, var9);
    }

    @OriginalMember(owner = "client!om", name = "<init>", descriptor = "(Lkha;Lag;)V", line = 133)
    public class374(class687 arg0, class439 arg1) {
        this.field5253 = arg1;
        this.field5251 = arg0;
    }
}
