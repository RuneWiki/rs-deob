import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class305 extends class86 {

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "Lrn;")
    public static class633 field3842 = new class633(17, 7);

    @OriginalMember(owner = "client!pg", name = "p", descriptor = "I")
    public static int field3843 = -1;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(ILsf;)V", line = 4)
    public class305(int arg0, class551 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIIIIII)V", line = 7)
    public static final void method1800(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3836;
        int var8 = -67 % ((-49 - arg1) / 56);
        if (class498.field6390 <= arg0 && class30.field274 >= arg2 && ~arg3 <= ~class80.field1131 && class405.field5375 >= arg4) {
            class271.method1690(arg0, 53, arg5, arg7, arg2, arg4, arg3, arg6);
        } else {
            class713.method3842(arg5, 7, arg4, arg6, arg2, arg3, arg7, arg0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V", line = 23)
    public static void method1801(int arg0) {
        if (arg0 != -1) {
            field3842 = null;
        }
        field3842 = null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(II)I", line = 33)
    public final int method72(int arg0, int arg1) {
        ++field3841;
        if (arg1 != -2) {
            field3842 = null;
        }
        return 1;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)I", line = 45)
    public final int method73(int arg0) {
        if (arg0 != 0) {
            method1803((class234) null, -51);
        }
        ++field3835;
        return 3;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Z)I", line = 58)
    public final int method1802(boolean arg0) {
        ++field3838;
        return arg0 ? -57 : super.field1200;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lmc;I)V", line = 71)
    public static final void method1803(class234 arg0, int arg1) {
        ++field3839;
        if (arg1 >= -30) {
            field3843 = -25;
        }
        for (int var2 = 0; ~var2 > ~class759.field10342; ++var2) {
            int var3 = arg0.method1505((byte) -6);
            int var4 = arg0.method1553((byte) -110);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class425.field5588[var3] != null) {
                class425.field5588[var3].field2468 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 102)
    public final void method71(byte arg0) {
        if (arg0 != -65) {
            method1803((class234) null, 19);
        }
        ++field3837;
        if (super.field1200 < 0 || ~super.field1200 < -5) {
            super.field1200 = this.method73(0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IZ)V", line = 115)
    public final void method76(int arg0, boolean arg1) {
        if (!arg1) {
            super.field1200 = arg0;
            ++field3834;
        }
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lsf;)V", line = 128)
    public class305(class551 arg0) {
        super(arg0);
    }
}
