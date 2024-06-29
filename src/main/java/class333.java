import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class333 {

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "Z")
    public boolean field4880 = false;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "Lvh;")
    private class328 field4883 = new class328(64);

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "Lvh;")
    public class328 field4890 = new class328(500);

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "Lvh;")
    public class328 field4892 = new class328(30);

    @OriginalMember(owner = "client!bc", name = "t", descriptor = "Lvh;")
    public class328 field4893 = new class328(50);

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "Z")
    public boolean field4878;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "Lpj;")
    public class132 field4889;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "Lpj;")
    private class132 field4884;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field4888 = 0;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field4875;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field4877;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field4881;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "I")
    public static int field4882;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!bc", name = "u", descriptor = "I")
    public int field4894;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bc", name = "v", descriptor = "Ljava/lang/Class;")
    public static Class field4895;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Z")
    public static boolean field4885;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Z)V")
    public final void method2012(boolean arg0) {
        class328 var2 = this.field4883;
        synchronized (this.field4883) {
            this.field4883.method1997(1);
        }
        field4874++;
        class328 var3 = this.field4890;
        synchronized (this.field4890) {
            if (!arg0) {
                return;
            }
            this.field4890.method1997(1);
        }
        class328 var4 = this.field4892;
        synchronized (this.field4892) {
            this.field4892.method1997(1);
        }
        class328 var5 = this.field4893;
        synchronized (this.field4893) {
            this.field4893.method1997(1);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IZ)Llt;")
    public final class620 method2013(int arg0, boolean arg1) {
        field4882++;
        class328 var3 = this.field4883;
        class620 var4;
        synchronized (this.field4883) {
            var4 = (class620) this.field4883.method1986((byte) -125, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class132 var5 = this.field4884;
        byte[] var6;
        synchronized (this.field4884) {
            var6 = this.field4884.method940(class352.method2087(-20675, arg0), class647.method3603((byte) 113, arg0), 0);
        }
        class620 var7 = new class620();
        var7.field8621 = arg0;
        var7.field8625 = this;
        if (var6 != null) {
            var7.method3460(new class96(var6), true);
        }
        var7.method3448(arg1);
        if (!this.field4878 && var7.field8598) {
            var7.field8575 = null;
            var7.field8572 = null;
        }
        if (var7.field8562) {
            var7.field8612 = false;
            var7.field8627 = 0;
        }
        class328 var8 = this.field4883;
        synchronized (this.field4883) {
            this.field4883.method1985(var7, (long) arg0, (byte) -102);
            return var7;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(II)V")
    public final void method2014(int arg0, int arg1) {
        field4887++;
        class328 var3 = this.field4883;
        synchronized (this.field4883) {
            this.field4883.method1989(arg1, (byte) 107);
        }
        if (arg0 != 30) {
            return;
        }
        class328 var4 = this.field4890;
        synchronized (this.field4890) {
            this.field4890.method1989(arg1, (byte) 94);
        }
        class328 var5 = this.field4892;
        synchronized (this.field4892) {
            this.field4892.method1989(arg1, (byte) 89);
        }
        class328 var6 = this.field4893;
        synchronized (this.field4893) {
            this.field4893.method1989(arg1, (byte) 117);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BZ)V")
    public final void method2015(byte arg0, boolean arg1) {
        field4877++;
        if (this.field4880 == arg1) {
            return;
        }
        if (arg0 != -96) {
            this.method2013(46, false);
        }
        this.field4880 = arg1;
        this.method2012(true);
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2016(int arg0, int arg1, int arg2, int arg3) {
        field4879++;
        boolean var4 = true;
        class147 var5 = (class147) class171.method1170(arg2, arg0, arg1);
        if (var5 != null) {
            var4 &= class80.method636((byte) 98, var5);
        }
        class147 var6 = (class147) class410.method2344(arg2, arg0, arg1, field4895 == null ? (field4895 = method2021("uq")) : field4895);
        if (var6 != null) {
            var4 &= class80.method636((byte) 98, var6);
        }
        class147 var7 = (class147) class237.method1497(arg2, arg0, arg1);
        int var8 = 14 / ((arg3 - 54) / 62);
        if (var7 != null) {
            var4 &= class80.method636((byte) 98, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZB)V")
    public final void method2017(boolean arg0, byte arg1) {
        field4891++;
        if (arg1 != 52) {
            this.method2018(false, -85);
        }
        if (arg0 != this.field4878) {
            this.field4878 = arg0;
            this.method2012(true);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ZI)V")
    public final void method2018(boolean arg0, int arg1) {
        this.field4894 = arg1;
        field4876++;
        class328 var3 = this.field4890;
        synchronized (this.field4890) {
            this.field4890.method1997(1);
        }
        class328 var4 = this.field4892;
        synchronized (this.field4892) {
            this.field4892.method1997(1);
        }
        class328 var5 = this.field4893;
        synchronized (this.field4893) {
            this.field4893.method1997(1);
        }
        if (!arg0) {
            field4875 = -96;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)V")
    public final void method2019(int arg0) {
        class328 var2 = this.field4883;
        synchronized (this.field4883) {
            this.field4883.method1987(-31085);
        }
        field4881++;
        class328 var3 = this.field4890;
        synchronized (this.field4890) {
            this.field4890.method1987(-31085);
            int var4 = 60 / ((arg0 - 27) / 47);
        }
        class328 var5 = this.field4892;
        synchronized (this.field4892) {
            this.field4892.method1987(-31085);
        }
        class328 var6 = this.field4893;
        synchronized (this.field4893) {
            this.field4893.method1987(-31085);
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)V")
    public final void method2020(byte arg0, int arg1) {
        field4886++;
        if (arg0 <= 5) {
            this.method2018(true, -6);
        }
        this.field4883 = new class328(arg1);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(Ldd;IZLpj;Lpj;)V")
    public class333(class647 arg0, int arg1, boolean arg2, class132 arg3, class132 arg4) {
        this.field4878 = arg2;
        this.field4889 = arg4;
        this.field4884 = arg3;
        if (this.field4884 != null) {
            int var6 = this.field4884.method917((byte) -74) - 1;
            this.field4884.method936(var6, -112);
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2021(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
