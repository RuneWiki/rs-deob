import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class339 extends class573 {

    @OriginalMember(owner = "client!jo", name = "D", descriptor = "F")
    private float field4792 = 0.0F;

    @OriginalMember(owner = "client!jo", name = "u", descriptor = "Lwda;")
    private class639 field4783;

    @OriginalMember(owner = "client!jo", name = "E", descriptor = "Lkaa;")
    public static class47 field4793 = new class47(42, 16);

    @OriginalMember(owner = "client!jo", name = "F", descriptor = "Lhda;")
    public static class752 field4794 = new class752(120, 3);

    @OriginalMember(owner = "client!jo", name = "I", descriptor = "I")
    public static int field4797 = -1;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!jo", name = "v", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!jo", name = "w", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!jo", name = "x", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!jo", name = "y", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!jo", name = "z", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!jo", name = "A", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!jo", name = "B", descriptor = "I")
    public static int field4790;

    @OriginalMember(owner = "client!jo", name = "C", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!jo", name = "H", descriptor = "I")
    public static int field4796;

    @OriginalMember(owner = "client!jo", name = "J", descriptor = "Leia;")
    public static class244 field4798;

    @OriginalMember(owner = "client!jo", name = "G", descriptor = "Z")
    public static boolean field4795;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lwc;IB)V", line = 3)
    public final void method607(class67 arg0, int arg1, byte arg2) {
        if (arg2 > 68) {
            ++field4790;
            super.field7517.method823(arg0, -8423);
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lvfa;III)V", line = 16)
    public static final void method2035(class672 arg0, int arg1, int arg2, int arg3) {
        int var4 = 30 / ((arg3 - -5) / 40);
        ++field4788;
        if (~arg0.field9198 == -1) {
            arg0.field9325 = arg0.field9194;
        } else if (arg0.field9198 != 1) {
            if (arg0.field9198 == 2) {
                arg0.field9325 = -arg0.field9178 + arg2 + -arg0.field9194;
            } else if (arg0.field9198 == 3) {
                arg0.field9325 = arg0.field9194 * arg2 >> 14;
            } else if (arg0.field9198 != 4) {
                arg0.field9325 = arg2 - arg0.field9178 + -(arg0.field9194 * arg2 >> 14);
            } else {
                arg0.field9325 = (arg0.field9194 * arg2 >> 14) + (-arg0.field9178 + arg2) / 2;
            }
        } else {
            arg0.field9325 = (arg2 - arg0.field9178) / 2 + arg0.field9194;
        }
        if (~arg0.field9253 != -1) {
            if (arg0.field9253 != 1) {
                if (~arg0.field9253 != -3) {
                    if (arg0.field9253 == 3) {
                        arg0.field9212 = arg0.field9286 * arg1 >> 14;
                    } else if (arg0.field9253 == 4) {
                        arg0.field9212 = (arg0.field9286 * arg1 >> 14) + (-arg0.field9287 + arg1) / 2;
                    } else {
                        arg0.field9212 = -arg0.field9287 + arg1 - (arg0.field9286 * arg1 >> 14);
                    }
                } else {
                    arg0.field9212 = -arg0.field9287 + arg1 + -arg0.field9286;
                }
            } else {
                arg0.field9212 = (-arg0.field9287 + arg1) / 2 - -arg0.field9286;
            }
        } else {
            arg0.field9212 = arg0.field9286;
        }
        if (class320.field4567) {
            if (~client.method1875(arg0).field3004 == -1 && arg0.field9239 != 0) {
                return;
            }
            if (~arg0.field9325 <= -1) {
                if (arg0.field9325 - -arg0.field9178 > arg2) {
                    arg0.field9325 = -arg0.field9178 + arg2;
                }
            } else {
                arg0.field9325 = 0;
            }
            if (arg0.field9212 < 0) {
                arg0.field9212 = 0;
                return;
            }
            if (~(arg0.field9212 - -arg0.field9287) < ~arg1) {
                arg0.field9212 = -arg0.field9287 + arg1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZZ)V", line = 89)
    public final void method611(boolean arg0, boolean arg1) {
        ++field4786;
        super.field7517.method934(1, (byte) -65);
        super.field7517.method849((byte) 110, class99.field1265, class759.field10559);
        super.field7517.method911(-8980, 0, class454.field6199, false, arg0);
        super.field7517.method845(class227.field3230, (byte) 94, 0);
        super.field7517.method915((byte) -109, 0);
        super.field7517.method934(0, (byte) -65);
        super.field7517.method870(-16777216, false);
        super.field7517.method845(class362.field5101, (byte) 110, 0);
        this.method1139(4095);
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)Z", line = 106)
    public final boolean method605(int arg0) {
        if (arg0 != 4095) {
            this.field4783 = null;
        }
        ++field4791;
        return this.field4783.method3498((byte) -42);
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lrv;Lwda;)V", line = 118)
    public class339(class111 arg0, class639 arg1) {
        super(arg0);
        this.field4783 = arg1;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(Z)V", line = 127)
    public final void method603(boolean arg0) {
        super.field7517.method934(1, (byte) -65);
        ++field4781;
        super.field7517.method849((byte) 48, class312.field4469, class312.field4469);
        super.field7517.method840(0, -84, class454.field6199);
        super.field7517.method845(class454.field6199, (byte) 99, 0);
        super.field7517.method915((byte) -109, 1);
        if (!arg0) {
            field4793 = null;
        }
        super.field7517.method823((class67) null, -8423);
        super.field7517.method934(0, (byte) -65);
        super.field7517.method845(class454.field6199, (byte) 109, 0);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)V", line = 145)
    public static final void method2036(int arg0, boolean arg1) {
        if (class209.field3089 != null) {
            class209.field3089.method1439(-1);
            class209.field3089 = null;
        }
        ++field4787;
        class597.field7823 = 0;
        class1.method1(true);
        if (arg0 > 14) {
            class491.method2782();
            for (int var2 = 0; ~var2 > -5; ++var2) {
                class456.field6226[var2].method3888((byte) 12);
            }
            class26.method249(false, (byte) -126);
            System.gc();
            class284.method1763(2, (byte) -50);
            class453.field6192 = -1;
            class122.field1996 = false;
            class390.method2314(false);
            class121.method977(true, (byte) -127);
            class161.field2401 = 0;
            class334.field4757 = 0;
            class568.field7464 = 0;
            class186.field2816 = 0;
            class88.field1069 = 0;
            class503.field6752 = 0;
            for (int var3 = 0; ~var3 > ~class27.field435.length; ++var3) {
                class27.field435[var3] = null;
            }
            class169.method1205((byte) 73);
            for (int var4 = 0; var4 < 2048; ++var4) {
                class248.field3438[var4] = null;
            }
            class306.field4404 = 0;
            class390.field5470.method2138(-1);
            class243.field3403 = 0;
            class649.field8627.method2138(-1);
            class272.method1633((byte) 77);
            class589.field7684 = 0;
            class74.field901.method4067(-12777);
            class762.method4238(-125);
            class670.method3696(-28128);
            class281.field3982 = 0L;
            class66.field826 = null;
            if (!arg1) {
                class66.method566(3, -21035);
                try {
                    class124.method987("loggedout", -8364, class514.field6818);
                } catch (Throwable var5) {
                }
            } else {
                class66.method566(12, -21035);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)V", line = 225)
    public final void method610(boolean arg0, int arg1) {
        ++field4785;
        super.field7517.method849((byte) 85, class99.field1265, class312.field4469);
        if (arg1 <= 109) {
            field4795 = false;
        }
    }

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "(I)Lav;", line = 236)
    public static final class640 method2037(int arg0) {
        if (arg0 < 122) {
            field4798 = null;
        }
        ++field4784;
        return class744.field10336;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILjava/lang/String;)V", line = 248)
    public static final void method2038(int arg0, String arg1) {
        ++field4782;
        if (arg1 != null) {
            if (arg1.startsWith("*")) {
                arg1 = arg1.substring(1);
            }
            String var2 = class496.method2797(arg1, true);
            if (var2 != null) {
                if (arg0 != 28678) {
                    method2035((class672) null, -105, 123, -26);
                }
                for (int var3 = 0; ~var3 > ~class543.field7184; ++var3) {
                    String var4 = class756.field10526[var3];
                    if (var4.startsWith("*")) {
                        var4 = var4.substring(1);
                    }
                    String var5 = class496.method2797(var4, true);
                    if (var5 != null && var5.equals(var2)) {
                        --class543.field7184;
                        for (int var6 = var3; var6 < class543.field7184; ++var6) {
                            class756.field10526[var6] = class756.field10526[var6 + 1];
                            class310.field4452[var6] = class310.field4452[var6 - -1];
                            class13.field202[var6] = class13.field202[var6 + 1];
                            class316.field4506[var6] = class316.field4506[var6 + 1];
                            class414.field5732[var6] = class414.field5732[var6 + 1];
                        }
                        ++class307.field4411;
                        class241.field3387 = class691.field9630;
                        class583 var7 = class381.method2246(1, class128.field2105, class230.field3288);
                        var7.field7637.method3823(arg0 + -28777, class419.method2429(true, arg1));
                        var7.field7637.method3795(arg1, (byte) -91);
                        class42.method309(var7, 0);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V", line = 312)
    public final void method1139(int arg0) {
        if (arg0 != 4095) {
            method2036(106, true);
        }
        if (super.field7517.method857(128) == 0) {
            class615 var2 = super.field7517.method873((byte) 114);
            super.field7517.method934(1, (byte) -65);
            class615 var3 = super.field7517.method916(0);
            var3.method1712(var2);
            var3.method3348(0.125F, (byte) -118, 0.125F, 1.0F);
            var3.method3353(0.0F, this.field4792, 0.0F, 13);
            super.field7517.method878(3, class180.field2729);
            super.field7517.method934(0, (byte) -65);
        }
        ++field4796;
    }

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)V", line = 338)
    public static void method2039(int arg0) {
        if (arg0 != -29859) {
            method2037(10);
        }
        field4794 = null;
        field4798 = null;
        field4793 = null;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)V", line = 350)
    public final void method602(int arg0, int arg1, int arg2) {
        if (arg0 != -26427) {
            field4794 = null;
        }
        super.field7517.method934(1, (byte) -65);
        ++field4789;
        if ((128 & arg1) != 0) {
            super.field7517.method823((class67) null, -8423);
        } else if ((arg2 & 1) == 1) {
            if (this.field4783.field8467) {
                this.field4792 = (float) (super.field7517.field1759 % 4000) / 4000.0F;
                super.field7517.method823(this.field4783.field8477, -8423);
            } else {
                int var4 = super.field7517.field1759 % 4000 * 16 / 4000;
                super.field7517.method823(this.field4783.field8468[var4], -8423);
            }
        } else if (!this.field4783.field8467) {
            super.field7517.method823(this.field4783.field8468[0], -8423);
        } else {
            super.field7517.method823(this.field4783.field8477, -8423);
        }
        super.field7517.method934(0, (byte) -65);
    }
}
