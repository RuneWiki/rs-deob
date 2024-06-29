import jaclib.memory.Buffer;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pga")
public class class515 extends class478 implements class447 {

    @OriginalMember(owner = "client!pga", name = "d", descriptor = "I")
    private int field6564;

    @OriginalMember(owner = "client!pga", name = "h", descriptor = "Luw;")
    public static class208 field6568 = new class208(88, 6);

    @OriginalMember(owner = "client!pga", name = "n", descriptor = "I")
    public static int field6574 = 0;

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!pga", name = "e", descriptor = "I")
    public static int field6565;

    @OriginalMember(owner = "client!pga", name = "f", descriptor = "I")
    public static int field6566;

    @OriginalMember(owner = "client!pga", name = "g", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!pga", name = "i", descriptor = "I")
    public static int field6569;

    @OriginalMember(owner = "client!pga", name = "j", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!pga", name = "l", descriptor = "I")
    public static int field6572;

    @OriginalMember(owner = "client!pga", name = "m", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!pga", name = "k", descriptor = "Lnba;")
    public static class511 field6571;

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(I)V", line = 4)
    public static void method2850(int arg0) {
        field6571 = null;
        if (arg0 != -12863) {
            field6571 = null;
        }
        field6568 = null;
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(I)Z", line = 17)
    public static final boolean method2851(int arg0) {
        ++field6573;
        try {
            if (~class693.field8903 == -3) {
                if (class38.field431 == null) {
                    class38.field431 = class140.method800(class416.field5500, class540.field6799, class483.field6236);
                    if (class38.field431 == null) {
                        return false;
                    }
                }
                if (class181.field2475 == null) {
                    class181.field2475 = new class628(class106.field1439, class41.field472);
                }
                class654 var1 = class687.field8841;
                if (class168.field2234 != null) {
                    var1 = class168.field2234;
                }
                if (var1.method3564(class38.field431, class318.field3965, arg0 ^ 21535, class181.field2475, 22050)) {
                    class687.field8841 = var1;
                    class687.field8841.method3558(-1);
                    if (class405.field5380 <= 0) {
                        class693.field8903 = 0;
                        class687.field8841.method3555(-122, class745.field10115);
                        for (int var2 = 0; var2 < class176.field2318.length; ++var2) {
                            class687.field8841.method3544(arg0 ^ -256, var2, class176.field2318[var2]);
                            class176.field2318[var2] = 255;
                        }
                    } else {
                        class693.field8903 = 3;
                        class687.field8841.method3555(arg0 + -377, ~class405.field5380 < ~class745.field10115 ? class745.field10115 : class405.field5380);
                        for (int var3 = 0; ~var3 > ~class176.field2318.length; ++var3) {
                            class687.field8841.method3544(arg0 ^ -256, var3, class176.field2318[var3]);
                            class176.field2318[var3] = 255;
                        }
                    }
                    if (class168.field2234 == null) {
                        if (class407.field5418 > 0L) {
                            class687.field8841.method3549(123, class691.field8879, class38.field431, class407.field5418, true);
                        } else {
                            class687.field8841.method3556(class691.field8879, class38.field431, 16);
                        }
                    }
                    if (class366.field4469 != null) {
                        class366.field4469.method1029(class687.field8841, arg0 + 26452);
                    }
                    class38.field431 = null;
                    class416.field5500 = null;
                    class181.field2475 = null;
                    class407.field5418 = 0L;
                    class168.field2234 = null;
                    return true;
                }
            }
            if (arg0 != 255) {
                field6571 = null;
            }
        } catch (Exception var5) {
            var5.printStackTrace();
            class687.field8841.method3540(47);
            class181.field2475 = null;
            class38.field431 = null;
            class416.field5500 = null;
            class693.field8903 = 0;
            class168.field2234 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(Luaa;III)V", line = 116)
    public static final void method2852(class391 arg0, int arg1, int arg2, int arg3) {
        ++field6572;
        if (class430.field5649 == null && !class525.field6678) {
            if (arg3 < 115) {
                method2851(107);
            }
            if (arg0 != null && class648.method3500(arg0, true) != null) {
                class430.field5649 = arg0;
                class198.field2759 = class648.method3500(arg0, true);
                class251.field3426 = arg2;
                class307.field3858 = arg1;
                class614.field7749 = false;
                class369.field4527 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lck;ILjaclib/memory/Buffer;)V", line = 140)
    public class515(class733 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field6564 = arg1;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "([BIII)V", line = 149)
    public final void method2561(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method2685(arg0, arg2);
        if (arg1 >= 0) {
            method2851(-28);
        }
        ++field6569;
        this.field6564 = arg3;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(I)I", line = 162)
    public final int method2562(int arg0) {
        if (arg0 != 13349) {
            return -16;
        } else {
            ++field6566;
            return this.field6564;
        }
    }

    @OriginalMember(owner = "client!pga", name = "<init>", descriptor = "(Lck;I[BI)V", line = 174)
    public class515(class733 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field6564 = arg1;
    }

    @OriginalMember(owner = "client!pga", name = "a", descriptor = "(B)J", line = 184)
    public final long method2559(byte arg0) {
        if (arg0 > -34) {
            method2851(30);
        }
        ++field6563;
        return super.field6194.getAddress();
    }

    @OriginalMember(owner = "client!pga", name = "b", descriptor = "(B)I", line = 202)
    public final int method2560(byte arg0) {
        int var2 = -35 / ((arg0 - 2) / 56);
        ++field6570;
        return 0;
    }

    @OriginalMember(owner = "client!pga", name = "c", descriptor = "(B)V", line = 213)
    public static final void method2853(byte arg0) {
        class679.field8781.method276((byte) -23);
        ++field6567;
        if (arg0 <= 85) {
            method2852((class391) null, -24, -77, -15);
        }
        class737.field9980.method217(200);
        class102.field1382.method2639(122);
        class678.field8763.setBackground(Color.black);
        class96.field1305 = -1;
        class679.field8781 = class757.method4114(2, class678.field8763);
        class737.field9980 = class777.method4260(true, class678.field8763, true);
    }
}
