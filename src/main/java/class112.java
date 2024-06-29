import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class112 {

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "Lmf;")
    private class382 field1692 = new class382(64);

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "Lpu;")
    private class522 field1700;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "Ldg;")
    public static class376 field1693 = new class376(11, 16);

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public static int field1690;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field1691;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public static int field1697;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ZI)Laj;")
    public final class282 method865(boolean arg0, int arg1) {
        field1689++;
        class382 var3 = this.field1692;
        class282 var4;
        synchronized (this.field1692) {
            var4 = (class282) this.field1692.method2287(1, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class522 var5 = this.field1700;
        byte[] var6;
        synchronized (this.field1700) {
            var6 = this.field1700.method3007(35, arg1, 5);
        }
        class282 var7 = new class282();
        if (var6 != null) {
            var7.method1828(new class695(var6), 0);
        }
        var7.method1826(0);
        class382 var8 = this.field1692;
        synchronized (this.field1692) {
            this.field1692.method2291(var7, (long) arg1, 1);
            if (!arg0) {
                this.method865(false, -22);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(B)V")
    public final void method866(byte arg0) {
        if (arg0 <= 60) {
            field1693 = null;
        }
        class382 var2 = this.field1692;
        synchronized (this.field1692) {
            this.field1692.method2285((byte) -115);
        }
        field1698++;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(IB)V")
    public final void method867(int arg0, byte arg1) {
        class382 var3 = this.field1692;
        synchronized (this.field1692) {
            this.field1692.method2290(false, arg0);
        }
        if (arg1 < 59) {
            field1694 = 49;
        }
        field1699++;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(IB)V")
    public static final void method868(int arg0, byte arg1) {
        field1696++;
        if (class420.field6113 == arg0) {
            return;
        }
        if (arg0 == 13) {
            if (class87.field1469 == null) {
                class372.method2249(class689.field9707, class565.field7973, (byte) 92, class224.field3152);
            } else {
                class553.method3135(class689.field9707, 0);
            }
        }
        if (arg0 != 13 && class477.field6781 != null) {
            class477.field6781.method2234(false);
            class477.field6781 = null;
        }
        if (arg0 == 3) {
            class300.method1934(class309.field4581 != class100.field1556, (byte) -60);
        }
        if (arg0 == 7) {
            class539.method3067(class319.field4701 != class100.field1556, (byte) -65);
        }
        if (arg0 == 5) {
            if (class87.field1469 == null) {
                class298.method1924(8, class224.field3152, class565.field7973);
            } else {
                class608.method3412(8);
            }
        } else if (arg0 == 6) {
            if (class87.field1469 == null) {
                class372.method2249(class689.field9707, class565.field7973, (byte) -78, class224.field3152);
            } else {
                class553.method3135(class689.field9707, 0);
            }
        } else if (arg0 == 9) {
            if (class87.field1469 == null) {
                class372.method2249(class689.field9707, class565.field7973, (byte) 108, class224.field3152);
            } else {
                class553.method3135(class689.field9707, 0);
            }
        } else if (arg0 == 12) {
            if (class87.field1469 == null) {
                class298.method1924(8, class224.field3152, class565.field7973);
            } else {
                class608.method3412(8);
            }
        }
        if (class588.method3336(-1, class420.field6113)) {
            class94.field1498.field7369 = 2;
            class206.field2904.field7369 = 2;
            class656.field9196.field7369 = 2;
            class149.field2168.field7369 = 2;
            class386.field5439.field7369 = 2;
            class316.field4675.field7369 = 2;
            class264.field4005.field7369 = 2;
        }
        if (class588.method3336(-1, arg0)) {
            class485.field6910 = 1;
            class270.field4054 = 1;
            class224.field3166 = 0;
            class586.field8213 = 0;
            class572.field8055 = 0;
            class8.method44(true, (byte) -59);
            class94.field1498.field7369 = 1;
            class206.field2904.field7369 = 1;
            class656.field9196.field7369 = 1;
            class149.field2168.field7369 = 1;
            class386.field5439.field7369 = 1;
            class316.field4675.field7369 = 1;
            class264.field4005.field7369 = 1;
        }
        int var2 = 115 % ((-arg1 - 60) / 49);
        if (arg0 == 11 || arg0 == 3) {
            class641.method3570(-129);
        }
        boolean var3 = arg0 == 2 || class47.method485(200, arg0) || class204.method1356(arg0, (byte) -110);
        boolean var4 = class420.field6113 == 2 || class47.method485(200, class420.field6113) || class204.method1356(class420.field6113, (byte) -110);
        if (var3 != var4) {
            if (var3) {
                class392.field5800 = class150.field2178;
                if (class287.field4270.field3704 == 0) {
                    class560.method3197(2, true);
                } else {
                    class460.method2704(0, class150.field2178, class652.field9171, false, (byte) -88, 2, class287.field4270.field3704);
                }
                class622.field8693.method3443(0, false);
            } else {
                class560.method3197(2, true);
                class622.field8693.method3443(0, true);
            }
        }
        if (class588.method3336(-1, arg0) || arg0 == 13) {
            class282.field4228.method183();
        }
        class420.field6113 = arg0;
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BII)V")
    public static final void method869(byte arg0, int arg1, int arg2) {
        field1690++;
        class191 var3 = class6.method38(5, -111, arg2);
        var3.method1285((byte) -1);
        if (arg0 < -8) {
            var3.field2754 = arg1;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)V")
    public static void method870(int arg0) {
        if (arg0 != 2) {
            field1694 = 82;
        }
        field1693 = null;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
    public final void method871(int arg0) {
        class382 var2 = this.field1692;
        synchronized (this.field1692) {
            this.field1692.method2279(arg0 ^ arg0);
        }
        field1697++;
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(B)V")
    public static final void method872(byte arg0) {
        field1695++;
        for (int var1 = 0; var1 < 5; var1++) {
            class598.field8449[var1] = false;
        }
        class429.field6294 = 0;
        class666.field9399 = -1;
        class563.field7927 = -1;
        class43.field700 = 1;
        class200.field2825 = -1;
        if (arg0 > -40) {
            method869((byte) 12, 13, 59);
        }
        class450.field6492 = -1;
        class270.field4055 = 0;
    }

    @OriginalMember(owner = "client!qea", name = "<init>", descriptor = "(Lkr;ILpu;)V")
    public class112(class693 arg0, int arg1, class522 arg2) {
        this.field1700 = arg2;
        if (this.field1700 != null) {
            this.field1700.method2988(-95, 35);
        }
    }
}
