import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class364 {

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "Lsw;")
    private class641 field4774 = new class641(64);

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "Lsw;")
    public class641 field4785 = new class641(2);

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "Ldn;")
    private class438 field4776;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "Ldn;")
    public class438 field4783;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field4779 = 0;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "Lmf;")
    public static class354 field4781 = new class354();

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "Lvj;")
    public static class373 field4784 = new class373(4, -2);

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field4777;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field4780;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V", line = 4)
    public final void method2037(boolean arg0) {
        class641 var2 = this.field4774;
        synchronized (this.field4774) {
            this.field4774.method3694(0);
        }
        field4778++;
        if (arg0) {
            this.field4776 = null;
        }
        class641 var3 = this.field4785;
        synchronized (this.field4785) {
            this.field4785.method3694(0);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V", line = 21)
    public final void method2038(int arg0, int arg1) {
        field4777++;
        class641 var3 = this.field4774;
        synchronized (this.field4774) {
            this.field4774.method3686((byte) 53, arg0);
        }
        class641 var4 = this.field4785;
        synchronized (this.field4785) {
            if (arg1 != 0) {
                method2039((byte) -31, -71);
            }
            this.field4785.method3686((byte) 53, arg0);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BI)Z", line = 37)
    public static final boolean method2039(byte arg0, int arg1) {
        field4782++;
        if (arg1 == 19 || arg1 == 8 || arg1 == 2 || arg1 == 57 || arg1 == 1002) {
            return true;
        } else if (arg1 == 44 || arg1 == 1010) {
            return true;
        } else {
            int var2 = 76 / ((arg0 - 69) / 46);
            return false;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 58)
    public static void method2040(int arg0) {
        field4781 = null;
        if (arg0 != -1003) {
            field4781 = null;
        }
        field4784 = null;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V", line = 70)
    public final void method2041(int arg0) {
        if (arg0 != -2) {
            this.method2038(26, -40);
        }
        class641 var2 = this.field4774;
        synchronized (this.field4774) {
            this.field4774.method3687(1402);
        }
        field4780++;
        class641 var3 = this.field4785;
        synchronized (this.field4785) {
            this.field4785.method3687(1402);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)Ltr;", line = 89)
    public final class243 method2042(int arg0, boolean arg1) {
        field4775++;
        class641 var3 = this.field4774;
        class243 var4;
        synchronized (this.field4774) {
            var4 = (class243) this.field4774.method3682(0, (long) arg0);
        }
        if (!arg1) {
            return null;
        } else if (var4 == null) {
            class438 var5 = this.field4776;
            byte[] var6;
            synchronized (this.field4776) {
                var6 = this.field4776.method2558(100, arg0, 33);
            }
            class243 var7 = new class243();
            var7.field3131 = this;
            if (var6 != null) {
                var7.method1383(new class374(var6), -609);
            }
            class641 var8 = this.field4774;
            synchronized (this.field4774) {
                this.field4774.method3684(var7, 0, (long) arg0);
                return var7;
            }
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(Lre;ILdn;Ldn;)V", line = 140)
    public class364(class515 arg0, int arg1, class438 arg2, class438 arg3) {
        this.field4776 = arg2;
        this.field4783 = arg3;
        this.field4776.method2554(33, 125);
    }
}
