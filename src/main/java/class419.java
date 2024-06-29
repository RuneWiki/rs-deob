import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class419 extends class204 {

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Liga;")
    public static class91 field5830 = new class91(9, 4);

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field5834;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field5836;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field5838;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!hn", name = "u", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "[Z")
    public static boolean[] field5837;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)V", line = 3)
    public static void method2532(byte arg0) {
        field5837 = null;
        field5830 = null;
        if (arg0 != -116) {
            field5839 = -3;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 14)
    public final void method486(int arg0) {
        if (arg0 != -4591) {
            field5837 = null;
        }
        if (super.field2852 < 0 || ~super.field2852 < -5) {
            super.field2852 = this.method490((byte) 116);
        }
        ++field5832;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 30)
    public static final void method2533(int arg0) {
        if (arg0 != 1) {
            method2532((byte) 86);
        }
        ++field5836;
        if (class570.field8022 != null) {
            class409.field5750 = new class145();
            class409.field5750.method958(class570.field8022.field8416, false, class570.field8022, class697.field9714, class570.field8022.field8418.method3999(class553.field7667, (byte) -102));
            class308.field4451 = new Thread(class409.field5750, "");
            class308.field4451.start();
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([SIB)[S", line = 48)
    public static final short[] method2534(short[] arg0, int arg1, byte arg2) {
        ++field5838;
        if (arg2 != 34) {
            return null;
        } else {
            short[] var3 = new short[arg1];
            class335.method2119(arg0, 0, var3, 0, arg1);
            return var3;
        }
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)Ltia;", line = 64)
    public static final class17 method2535(int arg0) {
        ++field5833;
        class17 var1 = (class17) class695.field9695.method1140(-90);
        if (var1 != null) {
            var1.method527(-11229);
            var1.method416(9867);
            return var1;
        } else {
            if (arg0 != -1) {
                field5839 = -40;
            }
            class17 var2;
            do {
                var2 = (class17) class557.field7839.method1140(-104);
                if (var2 == null) {
                    return null;
                }
                if (~var2.method64((byte) -26) < ~class683.method3903((byte) 4)) {
                    return null;
                }
                var2.method527(-11229);
                var2.method416(9867);
            } while ((Long.MIN_VALUE & var2.field581) == 0L);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(II)I", line = 108)
    public final int method487(int arg0, int arg1) {
        int var3 = -59 / ((-57 - arg1) / 60);
        ++field5834;
        return 1;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BJ)V", line = 118)
    public static final void method2536(byte arg0, long arg1) {
        if (arg0 != -68) {
            method2537(127, 110);
        }
        ++field5831;
        int var3 = class743.field10245 + class724.field10031.field3470;
        int var4 = class658.field9287 + class724.field10031.field3460;
        if (-var3 + class693.field9671 < -2000 || -var3 + class693.field9671 > 2000 || -var4 + class548.field7650 < -2000 || -var4 + class548.field7650 > 2000) {
            class693.field9671 = var3;
            class548.field7650 = var4;
        }
        if (~class693.field9671 != ~var3) {
            int var5 = -class693.field9671 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 >= -1) {
                if (var6 != 0) {
                    if (var6 < var5) {
                        var6 = var5;
                    }
                } else {
                    var6 = -1;
                }
            } else if (var6 != 0) {
                if (var5 < var6) {
                    var6 = var5;
                }
            } else {
                var6 = 1;
            }
            class693.field9671 += var6;
        }
        if (~class548.field7650 != ~var4) {
            int var7 = -class548.field7650 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 < -1) {
                if (~var8 != -1) {
                    if (var8 > var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (~var8 == -1) {
                var8 = -1;
            } else if (var8 < var7) {
                var8 = var7;
            }
            class548.field7650 += var8;
        }
        class514.field7053 += (float) arg1 * class256.field3781 / 6.0F;
        class702.field9790 += (float) arg1 * class195.field2770 / 6.0F;
        class731.method4068(-4);
    }

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "(II)V", line = 210)
    public static final void method2537(int arg0, int arg1) {
        ++field5835;
        class17 var2 = class245.method1634(1, (long) arg1, 10);
        int var3 = -27 % ((-35 - arg0) / 47);
        var2.method69(13);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I", line = 222)
    public final int method490(byte arg0) {
        ++field5828;
        return arg0 <= 83 ? -88 : 0;
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(B)I", line = 233)
    public final int method2538(byte arg0) {
        if (arg0 != -98) {
            method2536((byte) 33, 40L);
        }
        ++field5829;
        return super.field2852;
    }

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "(II)V", line = 245)
    public final void method488(int arg0, int arg1) {
        ++field5840;
        if (arg1 >= -105) {
            field5830 = null;
        }
        super.field2852 = arg0;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([I[Ljava/lang/Object;I)V", line = 261)
    public static final void method2539(int[] arg0, Object[] arg1, int arg2) {
        ++field5841;
        class546.method3231(arg1, 0, arg0.length + -1, Integer.MAX_VALUE, arg0);
        if (arg2 != 31492) {
            field5830 = null;
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lfs;)V", line = 273)
    public class419(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(ILfs;)V", line = 277)
    public class419(int arg0, class607 arg1) {
        super(arg0, arg1);
    }
}
