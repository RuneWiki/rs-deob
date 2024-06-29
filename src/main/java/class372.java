import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class372 {

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lhm;")
    private class208 field4796 = new class208(64);

    @OriginalMember(owner = "client!df", name = "m", descriptor = "Lhm;")
    public class208 field4804 = new class208(30);

    @OriginalMember(owner = "client!df", name = "c", descriptor = "Lpfa;")
    public class275 field4794;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "Lpfa;")
    private class275 field4801;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "J")
    public static long field4792 = 0L;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "[I")
    public static int[] field4798 = new int[2048];

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field4803 = 0;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field4793;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field4800;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "I")
    public static int field4802;

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public int field4805;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[[I")
    public static int[][] field4799;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 3)
    public static void method2154(int arg0) {
        if (arg0 == 383) {
            field4798 = null;
            field4799 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 14)
    public final void method2155(byte arg0) {
        class208 var2 = this.field4796;
        synchronized (this.field4796) {
            this.field4796.method1218(arg0 ^ 0xFFFFFF98);
        }
        field4795++;
        if (arg0 != -14) {
            this.method2159(104);
        }
        class208 var3 = this.field4804;
        synchronized (this.field4804) {
            this.field4804.method1218(112);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(II)V", line = 31)
    public final void method2156(int arg0, int arg1) {
        field4800++;
        this.field4805 = arg1;
        class208 var3 = this.field4804;
        synchronized (this.field4804) {
            if (arg0 != -24241) {
                this.method2157(-21, 47);
            }
            this.field4804.method1218(106);
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(II)V", line = 54)
    public final void method2157(int arg0, int arg1) {
        class208 var3 = this.field4796;
        synchronized (this.field4796) {
            this.field4796.method1222(14564, arg0);
        }
        field4802++;
        class208 var4 = this.field4804;
        synchronized (this.field4804) {
            this.field4804.method1222(14564, arg0);
            if (arg1 != 30) {
                this.method2157(65, 50);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI)Lai;", line = 81)
    public final class561 method2158(byte arg0, int arg1) {
        field4793++;
        class208 var3 = this.field4796;
        class561 var4;
        synchronized (this.field4796) {
            var4 = (class561) this.field4796.method1221((long) arg1, true);
        }
        if (var4 != null) {
            return var4;
        }
        class275 var5 = this.field4801;
        byte[] var6;
        synchronized (this.field4801) {
            var6 = this.field4801.method1659(103, class314.method1839(-103, arg1), class475.method2585(45, arg1));
        }
        class561 var7 = new class561();
        var7.field7013 = this;
        var7.field6999 = arg1;
        if (var6 != null) {
            var7.method2987(new class572(var6), (byte) -36);
        }
        class208 var8 = this.field4796;
        synchronized (this.field4796) {
            this.field4796.method1230((byte) 91, (long) arg1, var7);
            if (arg0 != -25) {
                this.field4796 = null;
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V", line = 119)
    public final void method2159(int arg0) {
        class208 var2 = this.field4796;
        synchronized (this.field4796) {
            this.field4796.method1224(false);
        }
        field4797++;
        if (arg0 == 0) {
            class208 var3 = this.field4804;
            synchronized (this.field4804) {
                this.field4804.method1224(false);
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "(Lbs;ILpfa;Lpfa;)V", line = 145)
    public class372(class643 arg0, int arg1, class275 arg2, class275 arg3) {
        this.field4794 = arg3;
        this.field4801 = arg2;
        int var5 = this.field4801.method1642(96) - 1;
        this.field4801.method1655(var5, (byte) -82);
    }
}
