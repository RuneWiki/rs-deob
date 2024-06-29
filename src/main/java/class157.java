import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class157 extends class277 {

    @OriginalMember(owner = "client!pe", name = "sb", descriptor = "Lida;")
    public class134 field2007;

    @OriginalMember(owner = "client!pe", name = "pb", descriptor = "Lwl;")
    public static class622 field2004 = new class622(8);

    @OriginalMember(owner = "client!pe", name = "mb", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!pe", name = "nb", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!pe", name = "ob", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!pe", name = "qb", descriptor = "I")
    public static int field2005;

    @OriginalMember(owner = "client!pe", name = "rb", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!pe", name = "tb", descriptor = "I")
    public static int field2008;

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(Lfg;)V", line = 11)
    public class157(class164 arg0) {
        super(arg0);
        this.field2007 = new class134(arg0);
        super.field4091 = new class607(super.field4068);
        super.field4118 = new class607(super.field4068);
        super.field4107 = new class607(super.field4068);
        super.field4078 = new class607(super.field4068);
        super.field4103 = new class607(super.field4068);
        super.field4123 = new class607(super.field4068);
        super.field4122 = new class607(super.field4068);
        super.field4120 = new class607(super.field4068);
        super.field4083 = new class607(super.field4068);
        super.field4082 = new class607(super.field4068);
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(B)V", line = 29)
    public static void method905(byte arg0) {
        if (arg0 == -39) {
            field2004 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BI)Lqda;", line = 39)
    public static final class163 method906(byte arg0, int arg1) {
        ++field2005;
        class163 var2 = (class163) class114.field1506.method2025((long) arg1, 2);
        if (var2 != null) {
            return var2;
        } else if (arg0 < 26) {
            return null;
        } else {
            byte[] var3 = class36.field414.method3486((byte) -95, arg1, 0);
            class163 var4 = new class163();
            if (var3 != null) {
                var4.method950(false, arg1, new class428(var3));
            }
            class114.field1506.method2029(false, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIZ)V", line = 63)
    public static final void method907(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field2002;
        if (~class356.field5165 == -2) {
            class634.field9250[class331.field4911 / 100].method723(class384.field5614 + -8, class155.field1990 - 8);
        }
        if (class356.field5165 == 2) {
            class634.field9250[4 - -(class331.field4911 / 100)].method723(class384.field5614 + -8, class155.field1990 + -8);
        }
        if (!arg4) {
            method908(-44, -70, (byte) 51, (class311) null);
        }
        class409.method2434(10406);
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIBLwca;)V", line = 90)
    public static final void method908(int arg0, int arg1, byte arg2, class311 arg3) {
        if (arg3.field4538 != 0) {
            if (~arg3.field4538 == -2) {
                arg3.field4596 = (-arg3.field4543 + arg0) / 2 + arg3.field4529;
            } else if (arg3.field4538 == 2) {
                arg3.field4596 = -arg3.field4543 + -arg3.field4529 + arg0;
            } else if (arg3.field4538 == 3) {
                arg3.field4596 = arg3.field4529 * arg0 >> 14;
            } else if (~arg3.field4538 == -5) {
                arg3.field4596 = (arg0 - arg3.field4543) / 2 - -(arg3.field4529 * arg0 >> 14);
            } else {
                arg3.field4596 = -arg3.field4543 + arg0 + -(arg3.field4529 * arg0 >> 14);
            }
        } else {
            arg3.field4596 = arg3.field4529;
        }
        ++field2008;
        if (arg2 != 94) {
            field2004 = null;
        }
        if (~arg3.field4576 != -1) {
            if (arg3.field4576 == 1) {
                arg3.field4568 = (-arg3.field4620 + arg1) / 2 + arg3.field4671;
            } else if (arg3.field4576 == 2) {
                arg3.field4568 = -arg3.field4620 + arg1 + -arg3.field4671;
            } else if (~arg3.field4576 == -4) {
                arg3.field4568 = arg3.field4671 * arg1 >> 14;
            } else if (arg3.field4576 != 4) {
                arg3.field4568 = -arg3.field4620 + arg1 - (arg3.field4671 * arg1 >> 14);
            } else {
                arg3.field4568 = (arg3.field4671 * arg1 >> 14) + (-arg3.field4620 + arg1) / 2;
            }
        } else {
            arg3.field4568 = arg3.field4671;
        }
        if (class220.field3252) {
            if (~client.method3619(arg3).field8904 == -1 && arg3.field4655 != 0) {
                return;
            }
            if (~arg3.field4568 <= -1) {
                if (~arg1 > ~(arg3.field4620 + arg3.field4568)) {
                    arg3.field4568 = arg1 - arg3.field4620;
                }
            } else {
                arg3.field4568 = 0;
            }
            if (~arg3.field4596 > -1) {
                arg3.field4596 = 0;
                return;
            }
            if (arg3.field4596 + arg3.field4543 > arg0) {
                arg3.field4596 = -arg3.field4543 + arg0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZII)V", line = 162)
    public static final void method909(boolean arg0, int arg1, int arg2) {
        ++field2006;
        class621 var3 = class442.method2691(0, 15, arg0);
        var3.method3592((byte) 116);
        var3.field9068 = arg2;
        var3.field9070 = arg1;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V", line = 174)
    public final void method910(byte arg0) {
        this.field2007 = new class134(super.field4068);
        if (arg0 == -78) {
            ++field2001;
        }
    }
}
