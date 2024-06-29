import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class365 {

    @OriginalMember(owner = "client!mo", name = "d", descriptor = "Z")
    public boolean field4895 = false;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "Lad;")
    private class19 field4894 = new class19(64);

    @OriginalMember(owner = "client!mo", name = "s", descriptor = "Lad;")
    public class19 field4910 = new class19(500);

    @OriginalMember(owner = "client!mo", name = "t", descriptor = "Lad;")
    public class19 field4911 = new class19(30);

    @OriginalMember(owner = "client!mo", name = "u", descriptor = "Lad;")
    public class19 field4912 = new class19(50);

    @OriginalMember(owner = "client!mo", name = "h", descriptor = "Ltf;")
    private class701 field4899;

    @OriginalMember(owner = "client!mo", name = "r", descriptor = "Z")
    public boolean field4909;

    @OriginalMember(owner = "client!mo", name = "g", descriptor = "Ltf;")
    public class701 field4898;

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Lcq;")
    public static class110 field4893 = new class110(63, 6);

    @OriginalMember(owner = "client!mo", name = "q", descriptor = "I")
    public static int field4908 = 0;

    @OriginalMember(owner = "client!mo", name = "f", descriptor = "Lib;")
    public static class14 field4897 = new class14(4, 1);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field4892;

    @OriginalMember(owner = "client!mo", name = "e", descriptor = "I")
    public static int field4896;

    @OriginalMember(owner = "client!mo", name = "i", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!mo", name = "j", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!mo", name = "k", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!mo", name = "l", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!mo", name = "m", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!mo", name = "n", descriptor = "I")
    public static int field4905;

    @OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!mo", name = "p", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!mo", name = "v", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/lang/String;Lnp;I)I")
    public static final int method2130(String arg0, class115 arg1, int arg2) {
        field4900++;
        int var3 = arg1.field1218;
        if (arg2 != 4) {
            method2131(40);
        }
        byte[] var4 = class448.method2589((byte) 100, arg0);
        arg1.method639(var4.length, (byte) -119);
        arg1.field1218 += class178.field1994.method3303(0, arg1.field1218, arg1.field1269, var4, var4.length, 10);
        return arg1.field1218 - var3;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method2131(int arg0) {
        if (arg0 != 9859) {
            method2130(null, null, -75);
        }
        field4897 = null;
        field4893 = null;
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(ZI)V")
    public final void method2132(boolean arg0, int arg1) {
        field4903++;
        if (arg0 == this.field4909) {
            return;
        }
        this.field4909 = arg0;
        this.method2136(arg1 ^ 0x1D);
        if (arg1 != 0) {
            this.method2135(false, 10);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(II)V")
    public final void method2133(int arg0, int arg1) {
        this.field4913 = arg1;
        field4902++;
        class19 var3 = this.field4910;
        synchronized (this.field4910) {
            this.field4910.method88(79);
        }
        class19 var4 = this.field4911;
        synchronized (this.field4911) {
            this.field4911.method88(101);
        }
        class19 var5 = this.field4912;
        synchronized (this.field4912) {
            this.field4912.method88(124);
            if (arg0 > -120) {
                this.field4899 = null;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IZ)Lqp;")
    public final class638 method2134(int arg0, boolean arg1) {
        field4892++;
        class19 var3 = this.field4894;
        class638 var4;
        synchronized (this.field4894) {
            var4 = (class638) this.field4894.method78(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class701 var5 = this.field4899;
        byte[] var6;
        synchronized (this.field4899) {
            if (!arg1) {
                this.field4899 = null;
            }
            var6 = this.field4899.method3854((byte) 110, class642.method3609((byte) -20, arg0), class637.method3579(arg0, -108));
        }
        class638 var7 = new class638();
        var7.field9018 = this;
        var7.field9021 = arg0;
        if (var6 != null) {
            var7.method3596((byte) 71, new class115(var6));
        }
        var7.method3588(0);
        if (!this.field4909 && var7.field9061) {
            var7.field9005 = null;
            var7.field8998 = null;
        }
        if (var7.field9046) {
            var7.field9057 = false;
            var7.field9006 = 0;
        }
        class19 var8 = this.field4894;
        synchronized (this.field4894) {
            this.field4894.method92(1, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(ZI)V")
    public final void method2135(boolean arg0, int arg1) {
        class19 var3 = this.field4894;
        synchronized (this.field4894) {
            this.field4894.method83((byte) -2, arg1);
        }
        field4896++;
        class19 var4 = this.field4910;
        synchronized (this.field4910) {
            this.field4910.method83((byte) -2, arg1);
        }
        class19 var5 = this.field4911;
        synchronized (this.field4911) {
            this.field4911.method83((byte) -2, arg1);
        }
        class19 var6 = this.field4912;
        synchronized (this.field4912) {
            this.field4912.method83((byte) -2, arg1);
            if (!arg0) {
                this.method2136(-23);
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(I)V")
    public final void method2136(int arg0) {
        field4906++;
        class19 var2 = this.field4894;
        synchronized (this.field4894) {
            this.field4894.method88(124);
        }
        class19 var3 = this.field4910;
        synchronized (this.field4910) {
            int var4 = 104 / ((arg0 + 49) / 38);
            this.field4910.method88(78);
        }
        class19 var5 = this.field4911;
        synchronized (this.field4911) {
            this.field4911.method88(73);
        }
        class19 var6 = this.field4912;
        synchronized (this.field4912) {
            this.field4912.method88(102);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(IZ)V")
    public final void method2137(int arg0, boolean arg1) {
        field4905++;
        if (arg0 != 4) {
            this.method2137(-34, true);
        }
        if (arg1 != this.field4895) {
            this.field4895 = arg1;
            this.method2136(116);
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(B)V")
    public final void method2138(byte arg0) {
        if (arg0 != 109) {
            method2131(101);
        }
        field4904++;
        class19 var2 = this.field4894;
        synchronized (this.field4894) {
            this.field4894.method80((byte) 62);
        }
        class19 var3 = this.field4910;
        synchronized (this.field4910) {
            this.field4910.method80((byte) 100);
        }
        class19 var4 = this.field4911;
        synchronized (this.field4911) {
            this.field4911.method80((byte) 116);
        }
        class19 var5 = this.field4912;
        synchronized (this.field4912) {
            this.field4912.method80((byte) -117);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(II)V")
    public final void method2139(int arg0, int arg1) {
        field4901++;
        if (arg0 != 500) {
            method2131(-20);
        }
        this.field4894 = new class19(arg1);
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "(Lqh;IZLtf;Ltf;)V")
    public class365(class320 arg0, int arg1, boolean arg2, class701 arg3, class701 arg4) {
        this.field4899 = arg3;
        this.field4909 = arg2;
        this.field4898 = arg4;
        if (this.field4899 != null) {
            int var6 = this.field4899.method3877(100) - 1;
            this.field4899.method3883(var6, 0);
        }
    }
}
