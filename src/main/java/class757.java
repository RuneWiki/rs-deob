import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class757 extends class150 {

    @OriginalMember(owner = "client!gfa", name = "o", descriptor = "Lkr;")
    public static class602 field10562 = new class602(1, -2);

    @OriginalMember(owner = "client!gfa", name = "r", descriptor = "Lww;")
    public static class288 field10565 = new class288(4, 1);

    @OriginalMember(owner = "client!gfa", name = "u", descriptor = "[Lqha;")
    public static class234[] field10568 = new class234[1024];

    @OriginalMember(owner = "client!gfa", name = "t", descriptor = "I")
    public static int field10567 = 1;

    @OriginalMember(owner = "client!gfa", name = "v", descriptor = "Lst;")
    public static class335 field10569 = new class335(54, -1);

    @OriginalMember(owner = "client!gfa", name = "n", descriptor = "I")
    public static int field10561;

    @OriginalMember(owner = "client!gfa", name = "p", descriptor = "I")
    public static int field10563;

    @OriginalMember(owner = "client!gfa", name = "q", descriptor = "I")
    public static int field10564;

    @OriginalMember(owner = "client!gfa", name = "s", descriptor = "I")
    public static int field10566;

    @OriginalMember(owner = "client!gfa", name = "<init>", descriptor = "(Luu;Luu;Ltca;)V", line = 6)
    public class757(class237 arg0, class237 arg1, class275 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(II)Lcu;", line = 10)
    public static final class203 method4204(int arg0, int arg1) {
        ++field10561;
        if (arg0 != 7946) {
            return null;
        } else {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (~arg1 == -3) {
                        if ((double) class461.field6388 == 3.0D) {
                            return class20.field194;
                        }
                        if ((double) class461.field6388 == 4.0D) {
                            return class249.field3653;
                        }
                        if ((double) class461.field6388 == 6.0D) {
                            return class525.field7297;
                        }
                        if ((double) class461.field6388 >= 8.0D) {
                            return class145.field2035;
                        }
                    }
                } else {
                    if ((double) class461.field6388 == 3.0D) {
                        return class679.field9446;
                    }
                    if ((double) class461.field6388 == 4.0D) {
                        return class510.field7070;
                    }
                    if ((double) class461.field6388 == 6.0D) {
                        return class20.field194;
                    }
                    if ((double) class461.field6388 >= 8.0D) {
                        return class249.field3653;
                    }
                }
            } else {
                if ((double) class461.field6388 == 3.0D) {
                    return class507.field7050;
                }
                if ((double) class461.field6388 == 4.0D) {
                    return class683.field9477;
                }
                if ((double) class461.field6388 == 6.0D) {
                    return class679.field9446;
                }
                if ((double) class461.field6388 >= 8.0D) {
                    return class510.field7070;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "(I)V", line = 73)
    public static void method4205(int arg0) {
        field10569 = null;
        field10568 = null;
        if (arg0 == 1024) {
            field10562 = null;
            field10565 = null;
        }
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IZII)V", line = 87)
    public final void method600(int arg0, boolean arg1, int arg2, int arg3) {
        ++field10564;
        class129.field1802.method1534(arg2 - 2, arg0, super.field2073.field7561 + 4, super.field2073.field7550 - -2, ((class275) super.field2073).field3981, 0);
        class129.field1802.method1534(arg2 + -1, arg0 - -1, super.field2073.field7561 + 2, super.field2073.field7550, 0, arg3);
    }

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(IIZB)V", line = 96)
    public final void method597(int arg0, int arg1, boolean arg2, byte arg3) {
        ++field10563;
        if (arg3 != -92) {
            this.method597(5, -54, true, (byte) 62);
        }
        int var5 = this.method956(-114) * super.field2073.field7561 / 10000;
        class129.field1802.method1412(arg1, arg0 + 2, var5, super.field2073.field7550 + -2, ((class275) super.field2073).field3984, 0);
        class129.field1802.method1412(arg1 - -var5, arg0 + 2, -var5 + super.field2073.field7561, super.field2073.field7550 + -2, 0, 0);
    }
}
