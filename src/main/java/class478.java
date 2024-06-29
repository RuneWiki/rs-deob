import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class478 {

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Lsw;")
    private class641 field6715 = new class641(64);

    @OriginalMember(owner = "client!si", name = "i", descriptor = "Ldn;")
    private class438 field6713;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "[I")
    public static int[] field6712 = new int[1];

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Let;")
    public static class509 field6711 = null;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "I")
    public static int field6707;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "I")
    public static int field6708;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method2787(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -8) {
            return;
        }
        field6714++;
        if (class128.field1583 == 1) {
            class80.field959[class281.field3689 / 100].method299(class448.field6213 - 8, class148.field1775 + -8);
        }
        if (class128.field1583 == 2) {
            class80.field959[class281.field3689 / 100 + 4].method299(class448.field6213 - 8, class148.field1775 + -8);
        }
        class551.method3224(24);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)V", line = 24)
    public final void method2788(byte arg0) {
        class641 var2 = this.field6715;
        synchronized (this.field6715) {
            if (arg0 > -1) {
                method2792((byte) -17);
            }
            this.field6715.method3687(1402);
        }
        field6705++;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IZ)V", line = 39)
    public final void method2789(int arg0, boolean arg1) {
        field6706++;
        if (!arg1) {
            this.method2789(-59, true);
        }
        class641 var3 = this.field6715;
        synchronized (this.field6715) {
            this.field6715.method3686((byte) 53, arg0);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BII)Z", line = 55)
    public static final boolean method2790(byte arg0, int arg1, int arg2) {
        field6707++;
        if (arg0 != 13) {
            method2792((byte) -58);
        }
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Z)V", line = 68)
    public final void method2791(boolean arg0) {
        field6710++;
        class641 var2 = this.field6715;
        synchronized (this.field6715) {
            this.field6715.method3694(0);
        }
        if (!arg0) {
            method2792((byte) 108);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V", line = 84)
    public static void method2792(byte arg0) {
        int var1 = 127 % ((25 - arg0) / 49);
        field6711 = null;
        field6712 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)Lcq;", line = 100)
    public final class395 method2793(int arg0, int arg1) {
        field6709++;
        class641 var3 = this.field6715;
        class395 var4;
        synchronized (this.field6715) {
            var4 = (class395) this.field6715.method3682(0, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class438 var5 = this.field6713;
        byte[] var6;
        synchronized (this.field6713) {
            var6 = this.field6713.method2558(100, arg1, arg0);
        }
        class395 var7 = new class395();
        if (var6 != null) {
            var7.method2276(17279, new class374(var6));
        }
        class641 var8 = this.field6715;
        synchronized (this.field6715) {
            this.field6715.method3684(var7, 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Lre;ILdn;)V", line = 134)
    public class478(class515 arg0, int arg1, class438 arg2) {
        this.field6713 = arg2;
        if (this.field6713 != null) {
            this.field6713.method2554(11, 126);
        }
    }
}
