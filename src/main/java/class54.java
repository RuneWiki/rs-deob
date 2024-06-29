import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gja")
public class class54 extends class60 {

    @OriginalMember(owner = "client!gja", name = "t", descriptor = "I")
    public static int field730 = 0;

    @OriginalMember(owner = "client!gja", name = "k", descriptor = "Llja;")
    public static class744 field721 = new class744(37, -1);

    @OriginalMember(owner = "client!gja", name = "l", descriptor = "I")
    public static int field722;

    @OriginalMember(owner = "client!gja", name = "m", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!gja", name = "n", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!gja", name = "o", descriptor = "I")
    public static int field725;

    @OriginalMember(owner = "client!gja", name = "p", descriptor = "I")
    public static int field726;

    @OriginalMember(owner = "client!gja", name = "q", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!gja", name = "r", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!gja", name = "s", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(I)I", line = 8)
    public final int method479(int arg0) {
        if (arg0 != 0) {
            method481(-67);
        }
        ++field728;
        return super.field799;
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(BI)V", line = 20)
    public final void method407(byte arg0, int arg1) {
        int var3 = -27 % ((28 - arg0) / 50);
        super.field799 = arg1;
        ++field724;
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(Lhd;)V", line = 33)
    public class54(class773 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(B)V", line = 37)
    public final void method409(byte arg0) {
        if (~super.field799 != -2 && ~super.field799 != -1) {
            super.field799 = this.method405(false);
        }
        ++field726;
        if (arg0 > -27) {
            this.method409((byte) 74);
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(BIIII)V", line = 51)
    public static final void method480(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        class461.field6480 = arg3;
        ++field723;
        class223.field2604 = arg4;
        class471.field6572 = arg1;
        class187.field2268 = arg2;
        if (arg0 > -61) {
            field722 = -128;
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(Z)I", line = 65)
    public final int method405(boolean arg0) {
        ++field725;
        return arg0 ? 119 : 1;
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(II)I", line = 76)
    public final int method406(int arg0, int arg1) {
        ++field729;
        if (arg0 != 0) {
            field730 = 121;
        }
        return 1;
    }

    @OriginalMember(owner = "client!gja", name = "<init>", descriptor = "(ILhd;)V", line = 88)
    public class54(int arg0, class773 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!gja", name = "b", descriptor = "(I)V", line = 101)
    public static void method481(int arg0) {
        field721 = null;
        if (arg0 != 20000) {
            method482(-65, false, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!gja", name = "a", descriptor = "(IZ[B)V", line = 111)
    public static final void method482(int arg0, boolean arg1, byte[] arg2) {
        if (class541.field7601 == null) {
            class541.field7601 = new class403(20000);
        }
        ++field727;
        class541.field7601.method2355(arg2, arg2.length, (byte) 74, 0);
        if (arg1) {
            class435.method2573(class541.field7601.field5275, 18389);
            class780.field10754 = new class631[class61.field814];
            int var3 = 0;
            for (int var4 = class354.field4398; ~var4 >= ~class497.field6951; ++var4) {
                class631 var5 = class419.method2504(var4, 4014);
                if (var5 != null) {
                    class780.field10754[var3++] = var5;
                }
            }
            class221.field2579 = false;
            class239.field2805 = class349.method2069(true);
            class541.field7601 = null;
        }
        if (arg0 < 19) {
            method481(-6);
        }
    }
}
