import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class500 {

    @OriginalMember(owner = "client!gh", name = "i", descriptor = "Lpca;")
    private class653 field7209 = new class653(16);

    @OriginalMember(owner = "client!gh", name = "f", descriptor = "Ljo;")
    private class303 field7206;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "I")
    public static int field7201;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "I")
    public static int field7202;

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field7203;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field7204;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field7205;

    @OriginalMember(owner = "client!gh", name = "g", descriptor = "I")
    public static int field7207;

    @OriginalMember(owner = "client!gh", name = "h", descriptor = "I")
    public static int field7208;

    @OriginalMember(owner = "client!gh", name = "j", descriptor = "I")
    public static int field7210;

    @OriginalMember(owner = "client!gh", name = "k", descriptor = "I")
    public static int field7211;

    static {
        new class604("", 73);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(BLgs;)Z", line = 3)
    public static final boolean method2875(byte arg0, class41 arg1) {
        field7205++;
        int var2 = -126 / ((arg0 + 63) / 36);
        return class680.field9644 == arg1 || class223.field2811 == arg1 || class156.field1739 == arg1 || class463.field6433 == arg1;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(II)Z", line = 13)
    public static final boolean method2876(int arg0, int arg1) {
        field7202++;
        if (arg0 != -4) {
            method2876(43, -98);
        }
        return arg1 == 3 || arg1 == 4;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 24)
    public final void method2877(byte arg0) {
        field7208++;
        if (arg0 == -96) {
            class653 var2 = this.field7209;
            synchronized (this.field7209) {
                this.field7209.method3687((byte) -10);
            }
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IB)V", line = 37)
    public static final void method2878(int arg0, byte arg1) {
        field7203++;
        class19.field176 = 2;
        if (arg1 >= -67) {
            field7204 = -60;
        }
        class347.field4526 = arg0;
        long var2 = 0L;
        if (class343.field4443 == null) {
            class539.method3071(35, (byte) -81);
        } else {
            class452 var4 = new class452(class445.method2462(class173.method1020(class343.field4443, -2), -90));
            long var5 = var4.method2510((byte) 38);
            class632.field8964 = var4.method2510((byte) 38);
            class363.method1993("", true, class9.method53(34820, var5), 117);
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILep;)V", line = 67)
    public static final void method2879(int arg0, class382 arg1) {
        field7207++;
        class382 var2 = class508.method2917(arg1, (byte) -28);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class399.field5336;
            var4 = class416.field5524;
        } else {
            var3 = var2.field5035;
            var4 = var2.field4958;
        }
        class333.method1876(true, var3, false, var4, arg1);
        class555.method3131((byte) -110, var3, var4, arg1);
        if (arg0 != 0) {
            field7204 = 81;
        }
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(II)V", line = 94)
    public final void method2880(int arg0, int arg1) {
        class653 var3 = this.field7209;
        synchronized (this.field7209) {
            this.field7209.method3691(false, arg1);
            if (arg0 != 14559) {
                method2878(-71, (byte) -1);
            }
        }
        field7201++;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(I)V", line = 115)
    public final void method2881(int arg0) {
        class653 var2 = this.field7209;
        synchronized (this.field7209) {
            this.field7209.method3684(arg0 + 2947);
        }
        if (arg0 != -20147) {
            method2875((byte) 102, null);
        }
        field7211++;
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(II)Liv;", line = 130)
    public final class85 method2882(int arg0, int arg1) {
        field7210++;
        if (arg0 != -5248) {
            return null;
        }
        class653 var3 = this.field7209;
        class85 var4;
        synchronized (this.field7209) {
            var4 = (class85) this.field7209.method3690((byte) -31, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class303 var5 = this.field7206;
        byte[] var6;
        synchronized (this.field7206) {
            var6 = this.field7206.method1719(arg1, 30, arg0 + 5252);
        }
        class85 var7 = new class85();
        if (var6 != null) {
            var7.method536(new class452(var6), 109);
        }
        class653 var8 = this.field7209;
        synchronized (this.field7209) {
            this.field7209.method3683(var7, (byte) 0, (long) arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!gh", name = "<init>", descriptor = "(Ljda;ILjo;)V", line = 169)
    public class500(class207 arg0, int arg1, class303 arg2) {
        this.field7206 = arg2;
        this.field7206.method1727(-77, 30);
    }
}
