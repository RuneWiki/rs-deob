import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class165 {

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Ltja;")
    private class288 field2017 = new class288(128);

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lbt;")
    private class48 field2020;

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lhj;")
    public static class596 field2021 = new class596(76, 4);

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field2019;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V", line = 3)
    public static void method1147(boolean arg0) {
        if (!arg0) {
            field2021 = null;
        }
        field2021 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V", line = 16)
    public final void method1148(int arg0, boolean arg1) {
        class288 var3 = this.field2017;
        synchronized (this.field2017) {
            this.field2017.method1694(arg0, -79);
            if (arg1) {
                this.method1148(-89, true);
            }
        }
        field2016++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V", line = 30)
    public final void method1149(int arg0) {
        class288 var2 = this.field2017;
        synchronized (this.field2017) {
            this.field2017.method1687((byte) 61);
        }
        int var3 = -18 % ((arg0 - 28) / 46);
        field2015++;
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(I)V", line = 44)
    public static final void method1150(int arg0) {
        field2018++;
        while (class583.field7964.method2803(125, class647.field8807) >= 15) {
            int var1 = class583.field7964.method2802(15, -20468);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            class273 var3 = (class273) class30.field444.method2121(101, (long) var1);
            if (var3 == null) {
                class388 var4 = new class388();
                var4.field3393 = var1;
                var3 = new class273(var4);
                class30.field444.method2112(var3, (byte) 6, (long) var1);
                class616.field8293[class370.field4599++] = var3;
                var2 = true;
            }
            class388 var5 = var3.field3210;
            class2.field29[class3.field42++] = var1;
            var5.field3422 = class537.field7557;
            if (var5.field5003 != null && var5.field5003.method2845(false)) {
                class382.method2253(var5, true);
            }
            int var6 = class583.field7964.method2802(5, -20468);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = class583.field7964.method2802(1, -20468);
            int var8 = class583.field7964.method2802(5, -20468);
            var5.method2275(class444.field5956.method1070(class583.field7964.method2802(14, -20468), true), (byte) -98);
            if (var8 > 15) {
                var8 -= 32;
            }
            int var9 = class583.field7964.method2802(3, -20468) + 4 << 11 & 0x3A75;
            int var10 = class583.field7964.method2802(2, -20468);
            int var11 = class583.field7964.method2802(1, -20468);
            if (var11 == 1) {
                class7.field123[class358.field4430++] = var1;
            }
            var5.method1666(var5.field5003.field6710, true);
            var5.field3413 = var5.field5003.field6688 << 3;
            if (var2) {
                var5.method1677(var9, true, 23);
            }
            var5.method2272(class300.field3596.field3455[0] + var8, var10, class300.field3596.field3453[0] + var6, false, var5.method1665(1720746760), var7 == 1);
            if (var5.field5003.method2845(false)) {
                class250.method1497(98, var5, null, var5.field808, var5.field3455[0], null, 0, var5.field3453[0]);
            }
        }
        class583.field7964.method2806(-23187);
        if (arg0 < 113) {
            field2021 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(Z)V", line = 126)
    public final void method1151(boolean arg0) {
        class288 var2 = this.field2017;
        synchronized (this.field2017) {
            this.field2017.method1690(0);
            if (arg0) {
                this.method1149(38);
            }
        }
        field2014++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)Laj;", line = 140)
    public final class333 method1152(int arg0, byte arg1) {
        field2019++;
        class288 var3 = this.field2017;
        class333 var5;
        synchronized (this.field2017) {
            if (arg1 < 59) {
                return null;
            }
            var5 = (class333) this.field2017.method1684((long) arg0, -359);
        }
        if (var5 != null) {
            return var5;
        }
        class48 var6 = this.field2020;
        byte[] var7;
        synchronized (this.field2020) {
            var7 = this.field2020.method437(1, (byte) -36, arg0);
        }
        class333 var8 = new class333();
        if (var7 != null) {
            var8.method1974(false, new class403(var7));
        }
        class288 var9 = this.field2017;
        synchronized (this.field2017) {
            this.field2017.method1686(-25638, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "(Lmja;ILbt;)V", line = 178)
    public class165(class441 arg0, int arg1, class48 arg2) {
        this.field2020 = arg2;
        this.field2020.method431(4, 1);
    }
}
