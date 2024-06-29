import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class120 {

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lwf;")
    private class117 field1682 = new class117(64);

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lwf;")
    public class117 field1693 = new class117(30);

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Lkda;")
    public class328 field1680;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "Lkda;")
    private class328 field1685;

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "Lwf;")
    public static class117 field1690;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "I")
    public static int field1681;

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!fn", name = "h", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    public static int field1688;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public int field1694;

    static {
        new class391("", 76);
        field1695 = 0;
        field1690 = new class117(5);
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V", line = 3)
    public final void method856(int arg0) {
        class117 var2 = this.field1682;
        synchronized (this.field1682) {
            this.field1682.method846(0);
        }
        field1687++;
        class117 var3 = this.field1693;
        synchronized (this.field1693) {
            this.field1693.method846(0);
            int var4 = -104 / ((60 - arg0) / 39);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lvp;BII)V", line = 22)
    public static final void method857(class162 arg0, byte arg1, int arg2, int arg3) {
        if (arg0.field2504 == 0) {
            arg0.field2507 = arg0.field2484;
        } else if (arg0.field2504 == 1) {
            arg0.field2507 = (arg2 - arg0.field2459) / 2 + arg0.field2484;
        } else if (arg0.field2504 == 2) {
            arg0.field2507 = arg2 - arg0.field2484 - arg0.field2459;
        } else if (arg0.field2504 == 3) {
            arg0.field2507 = arg0.field2484 * arg2 >> 14;
        } else if (arg0.field2504 == 4) {
            arg0.field2507 = (arg0.field2484 * arg2 >> 14) + (arg2 - arg0.field2459) / 2;
        } else {
            arg0.field2507 = arg2 - (arg0.field2484 * arg2 >> 14) - arg0.field2459;
        }
        field1683++;
        if (arg1 != -108) {
            return;
        }
        if (arg0.field2461 == 0) {
            arg0.field2449 = arg0.field2403;
        } else if (arg0.field2461 == 1) {
            arg0.field2449 = (arg3 - arg0.field2527) / 2 + arg0.field2403;
        } else if (arg0.field2461 == 2) {
            arg0.field2449 = arg3 - arg0.field2403 - arg0.field2527;
        } else if (arg0.field2461 == 3) {
            arg0.field2449 = arg0.field2403 * arg3 >> 14;
        } else if (arg0.field2461 == 4) {
            arg0.field2449 = (arg0.field2403 * arg3 >> 14) + (arg3 - arg0.field2527) / 2;
        } else {
            arg0.field2449 = arg3 - (arg0.field2527 + (arg0.field2403 * arg3 >> 14));
        }
        if (!class112.field1592 || client.method1599(arg0).field9207 == 0 && arg0.field2552 != 0) {
            return;
        }
        if (arg0.field2449 < 0) {
            arg0.field2449 = 0;
        } else if (arg3 < (arg0.field2527 + arg0.field2449)) {
            arg0.field2449 = arg3 - arg0.field2527;
        }
        if (arg0.field2507 < 0) {
            arg0.field2507 = 0;
        } else if (arg0.field2507 + arg0.field2459 > arg2) {
            arg0.field2507 = arg2 - arg0.field2459;
            return;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(IB)V", line = 95)
    public final void method858(int arg0, byte arg1) {
        field1688++;
        class117 var3 = this.field1682;
        synchronized (this.field1682) {
            this.field1682.method834(arg0, 0);
            if (arg1 != 123) {
                this.method863(-6, (byte) 15);
            }
        }
        class117 var4 = this.field1693;
        synchronized (this.field1693) {
            this.field1693.method834(arg0, 0);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(II)V", line = 112)
    public final void method859(int arg0, int arg1) {
        field1686++;
        this.field1694 = arg1;
        class117 var3 = this.field1693;
        synchronized (this.field1693) {
            this.field1693.method837(126);
            int var4 = 60 / ((-arg0 - 72) / 44);
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V", line = 129)
    public static void method860(boolean arg0) {
        field1690 = null;
        if (!arg0) {
            field1690 = null;
        }
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(ZI)V", line = 142)
    public static final void method861(boolean arg0, int arg1) {
        if (class296.field4075 != null) {
            class296.field4075.method1830(-121);
            class296.field4075 = null;
        }
        field1681++;
        class313.field4317 = 0;
        if (arg1 > -7) {
            return;
        }
        class459.method2781((byte) -94);
        class623.method3643();
        for (int var2 = 0; var2 < 4; var2++) {
            class127.field1774[var2].method231(-3995);
        }
        class536.method3246(false, 9057);
        System.gc();
        class240.method1529(2, (byte) 102);
        class568.field8385 = false;
        class625.field9210 = -1;
        class621.method3632(-1, true);
        class291.field4029 = 0;
        class38.field463 = 0;
        class473.field6687 = 0;
        class599.field8841 = 0;
        class448.field6280 = 0;
        class188.field2802 = 0;
        for (int var3 = 0; var3 < class385.field5293.length; var3++) {
            class385.field5293[var3] = null;
        }
        class283.method1763((byte) 26);
        for (int var4 = 0; var4 < 2048; var4++) {
            class293.field4036[var4] = null;
        }
        class527.field7717 = 0;
        class510.field7260.method2800(0);
        class599.field8840 = 0;
        class45.field544.method2800(0);
        class44.method279((byte) -47);
        class404.field5531 = 0;
        class556.field8280.method2293(8066);
        class378.method2256(-1);
        class614.method3603(true);
        class115.field1611 = 0L;
        class589.field8745 = null;
        if (arg0) {
            class18.method117((byte) -85, 11);
            return;
        }
        class18.method117((byte) -85, 2);
        try {
            class640.method3702(class442.field5896.field4568, (byte) -117, "loggedout");
        } catch (Throwable var5) {
        }
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V", line = 225)
    public final void method862(int arg0) {
        field1684++;
        class117 var2 = this.field1682;
        synchronized (this.field1682) {
            this.field1682.method837(127);
            if (arg0 != -3367) {
                field1695 = -31;
            }
        }
        class117 var3 = this.field1693;
        synchronized (this.field1693) {
            this.field1693.method837(126);
        }
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lbt;ILkda;Lkda;)V", line = 287)
    public class120(class39 arg0, int arg1, class328 arg2, class328 arg3) {
        this.field1680 = arg3;
        this.field1685 = arg2;
        int var5 = this.field1685.method1974(-8588) - 1;
        this.field1685.method1975(30, var5);
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(IB)Lgt;", line = 252)
    public final class389 method863(int arg0, byte arg1) {
        field1692++;
        class117 var3 = this.field1682;
        class389 var4;
        synchronized (this.field1682) {
            var4 = (class389) this.field1682.method842(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class328 var5 = this.field1685;
        byte[] var6;
        synchronized (this.field1685) {
            var6 = this.field1685.method1966(class157.method1129(1, arg0), class328.method1973((byte) 69, arg0), true);
        }
        class389 var7 = new class389();
        var7.field5365 = arg0;
        var7.field5373 = this;
        if (var6 != null) {
            var7.method2316(new class148(var6), (byte) -126);
        }
        if (arg1 >= -116) {
            this.field1682 = null;
        }
        class117 var8 = this.field1682;
        synchronized (this.field1682) {
            this.field1682.method835((byte) 117, (long) arg0, var7);
            return var7;
        }
    }
}
