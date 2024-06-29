import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public class class248 extends class354 {

    @OriginalMember(owner = "client!ni", name = "B", descriptor = "I")
    private int field3485 = 0;

    @OriginalMember(owner = "client!ni", name = "G", descriptor = "Lgg;")
    private class313 field3490 = new class313();

    @OriginalMember(owner = "client!ni", name = "F", descriptor = "I")
    public static int field3489 = 0;

    @OriginalMember(owner = "client!ni", name = "s", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ni", name = "t", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!ni", name = "u", descriptor = "I")
    public static int field3479;

    @OriginalMember(owner = "client!ni", name = "v", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ni", name = "w", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ni", name = "x", descriptor = "I")
    public static int field3482;

    @OriginalMember(owner = "client!ni", name = "z", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!ni", name = "C", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ni", name = "D", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ni", name = "E", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ni", name = "H", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!ni", name = "J", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ni", name = "K", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ni", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3483;

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(I)V")
    public final void method1579(int arg0) {
        if (arg0 == -22563) {
            ++field3479;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(I)V")
    public final void method1578(int arg0) {
        while (super.field4758 != super.field4754) {
            this.method1608(false);
        }
        ++field3478;
        int var2 = 66 / ((arg0 - -48) / 53);
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(BI)V")
    public final void method1574(byte arg0, int arg1) {
        super.field4752[super.field4758] = (byte) arg1;
        ++field3477;
        int var3 = 0 / ((-64 - arg0) / 50);
        ++super.field4758;
        if (~super.field4758 <= -5001) {
            super.field4758 = 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(B)V")
    public static final void method1606(byte arg0) {
        ++field3488;
        class331 var1 = null;
        try {
            class285 var2 = class122.field1839.method591(-1939);
            while (~var2.field3875 == -1) {
                class328.method1999(0, 1L);
            }
            if (~var2.field3875 == -2) {
                var1 = (class331) var2.field3871;
                byte[] var3 = new byte[(int) var1.method2004(-44)];
                int var5;
                for (int var4 = 0; var4 < var3.length; var4 += var5) {
                    var5 = var1.method2006(var3, (byte) -90, var4, var3.length - var4);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class108.method830(new class366(var3), -2);
            }
        } catch (Exception var7) {
        }
        try {
            if (var1 != null) {
                var1.method2009(-80);
            }
            if (arg0 >= -99) {
                method1610(-80);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(Lr;B)V")
    public final void method1576(class63 arg0, byte arg1) {
        super.field4752[super.field4758] = 20;
        ++field3482;
        super.field4757[super.field4758] = arg0;
        if (arg1 > -65) {
            this.field3490 = null;
        }
        ++super.field4758;
        if (super.field4758 >= 5000) {
            super.field4758 = 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Lr;B)V")
    public final void method1568(class63 arg0, byte arg1) {
        ++field3491;
        if (arg1 >= -122) {
            field3483 = null;
        }
        super.field4752[super.field4758] = 21;
        super.field4757[super.field4758] = arg0;
        ++super.field4758;
        if (~super.field4758 <= -5001) {
            super.field4758 = 0;
        }
    }

    @OriginalMember(owner = "client!ni", name = "b", descriptor = "(BI)Lwh;")
    public static final class314 method1607(byte arg0, int arg1) {
        ++field3492;
        class314 var2 = (class314) class118.field1797.method2529(0, (long) arg1);
        if (arg0 != -6) {
            method1607((byte) -6, -77);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class392.field5443.method1926(arg0 + 6, arg1, 26);
            class314 var4 = new class314();
            if (var3 != null) {
                var4.method1901(25, new class366(var3));
            }
            class118.field1797.method2527(arg0 ^ -95, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(FLdn;ZII)V")
    public final void method1577(float arg0, class323 arg1, boolean arg2, int arg3, int arg4) {
        if (arg4 < -47) {
            super.field4752[super.field4758] = (byte) (arg2 ? arg3 + 40 : arg3 + 30);
            ++field3484;
            super.field4757[super.field4758] = arg1;
            super.field4766[super.field4758] = arg0;
            ++super.field4758;
            if (super.field4758 >= 5000) {
                super.field4758 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(Z)V")
    private final void method1608(boolean arg0) {
        ++field3480;
        int var2 = super.field4754;
        if (arg0) {
            this.field3485 = -46;
        }
        ++super.field4754;
        if (super.field4754 >= 5000) {
            super.field4754 = 0;
        }
        this.field3485 = super.field4752[var2];
        Object var3 = super.field4757[var2];
        super.field4757[var2] = null;
        if (this.field3485 == 21) {
            class402.method2489(this.field3490, (class63) var3);
        } else if (~this.field3485 != -21) {
            if (~this.field3485 <= -31 && this.field3485 <= 33) {
                class389.field5413.method180(3000.0F, super.field4766[var2] * 1.5F);
                ((class323) var3).method338(class58.field750, class446.field6253, class244.field3440, class6.field62, this.field3485 + -30 == 0);
            } else if (this.field3485 >= 40 && this.field3485 <= 43) {
                class389.field5413.method180(3000.0F, super.field4766[var2] * 1.5F);
                ((class323) var3).method338(class58.field750, class446.field6253, class244.field3440, class450.field6457, ~(this.field3485 - 40) == -1);
            } else {
                if (~this.field3485 != -23) {
                    if (this.field3485 == 23) {
                        class389.field5413.method201();
                        return;
                    }
                    if (this.field3485 == 24) {
                        class389.field5413.method247(0, (class155[]) null);
                        return;
                    }
                } else {
                    class389.field5413.method175(-1, 1583160, 40);
                }
            }
        } else {
            class63 var4 = (class63) var3;
            if (var4.field867 != null) {
                var4.field867.method707(class389.field5413, -116);
            }
            if (var4.field863 != null) {
                var4.field863.method707(class389.field5413, -108);
            }
            if (var4.field861 != null) {
                var4.field861.method707(class389.field5413, -115);
            }
            if (var4.field859 != null) {
                var4.field859.method707(class389.field5413, -113);
            }
            if (var4.field854 != null) {
                var4.field854.method707(class389.field5413, -120);
            }
            for (class48 var5 = var4.field853; var5 != null; var5 = var5.field608) {
                var5.field617.method707(class389.field5413, -119);
            }
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IBIII)Lsd;")
    public static final class68 method1609(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        ++field3486;
        class195[] var5 = null;
        if (arg1 != 36) {
            return null;
        } else {
            class269 var6 = class380.method2358(-2049, arg3);
            if (var6.field3681 != null) {
                var5 = new class195[var6.field3681.length];
                for (int var7 = 0; ~var5.length < ~var7; ++var7) {
                    class391 var8 = class439.method2699(var6.field3681[var7], -16514);
                    var5[var7] = new class195(var8.field5438, var8.field5436, var8.field5434, var8.field5442, var8.field5430, var8.field5433, var8.field5435, var8.field5441);
                }
            }
            return new class68(var6.field3682, var5, var6.field3675, arg0, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(IZ)V")
    public final void method1571(int arg0, boolean arg1) {
        if (!arg1) {
            ++field3493;
        }
    }

    @OriginalMember(owner = "client!ni", name = "d", descriptor = "(I)V")
    public static void method1610(int arg0) {
        if (arg0 != 4999) {
            field3483 = null;
        }
        field3483 = null;
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "(ILr;)V")
    public final void method1572(int arg0, class63 arg1) {
        --super.field4754;
        ++field3487;
        if (~super.field4754 > -1) {
            super.field4754 = 4999;
        }
        if (arg0 == 5000) {
            super.field4752[super.field4754] = 21;
            super.field4757[super.field4754] = arg1;
        }
    }

    @OriginalMember(owner = "client!ni", name = "a", descriptor = "([[[Lr;B)V")
    public static final void method1611(class63[][][] arg0, byte arg1) {
        if (arg1 < 96) {
            method1611((class63[][][]) null, (byte) 94);
        }
        for (int var2 = 0; ~arg0.length < ~var2; ++var2) {
            class63[][] var3 = arg0[var2];
            for (int var4 = 0; var3.length > var4; ++var4) {
                for (int var5 = 0; ~var5 > ~var3[var4].length; ++var5) {
                    class63 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field854 instanceof class223) {
                            ((class223) var6.field854).method708(26389);
                        }
                        if (var6.field861 instanceof class223) {
                            ((class223) var6.field861).method708(26389);
                        }
                        if (var6.field859 instanceof class223) {
                            ((class223) var6.field859).method708(26389);
                        }
                        if (var6.field867 instanceof class223) {
                            ((class223) var6.field867).method708(26389);
                        }
                        if (var6.field863 instanceof class223) {
                            ((class223) var6.field863).method708(26389);
                        }
                        for (class48 var7 = var6.field853; var7 != null; var7 = var7.field608) {
                            class5 var8 = var7.field617;
                            if (var8 instanceof class223) {
                                ((class223) var8).method708(26389);
                            }
                        }
                    }
                }
            }
        }
        ++field3481;
    }
}
