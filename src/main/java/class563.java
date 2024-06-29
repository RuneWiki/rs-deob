import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public abstract class class563 extends class692 {

    @OriginalMember(owner = "client!iq", name = "t", descriptor = "S")
    public short field8092;

    @OriginalMember(owner = "client!iq", name = "u", descriptor = "Lja;")
    public static class254 field8093 = new class254();

    @OriginalMember(owner = "client!iq", name = "v", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!iq", name = "w", descriptor = "I")
    public static int field8095;

    @OriginalMember(owner = "client!iq", name = "x", descriptor = "I")
    public static int field8096;

    @OriginalMember(owner = "client!iq", name = "y", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!iq", name = "z", descriptor = "I")
    public static int field8098;

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(B[Lcp;)I", line = 3)
    public final int method1473(byte arg0, class674[] arg1) {
        ++field8094;
        int var3 = super.field9696 >> class439.field6699;
        int var4 = super.field9705 >> class439.field6699;
        int var5 = 0;
        if (class325.field5056 == var3) {
            ++var5;
        } else if (var3 > class325.field5056) {
            var5 += 2;
        }
        if (~class542.field7902 == ~var4) {
            var5 += 3;
        } else if (~class542.field7902 < ~var4) {
            var5 += 6;
        }
        if (arg0 >= -43) {
            return -32;
        } else {
            int var6 = class502.field7357[var5];
            if (~(var6 & this.field8092) != -1) {
                return this.method3918(arg1, (byte) 101, var4, var3);
            } else if (this.field8092 == 1 && ~var3 < -1) {
                return this.method3918(arg1, (byte) 101, var4, var3 - 1);
            } else if (~this.field8092 == -5 && ~var3 >= ~class43.field597) {
                return this.method3918(arg1, (byte) 101, var4, var3 + 1);
            } else if (this.field8092 == 8 && ~var4 < -1) {
                return this.method3918(arg1, (byte) 101, var4 + -1, var3);
            } else if (this.field8092 == 2 && ~var4 >= ~class541.field7896) {
                return this.method3918(arg1, (byte) 101, var4 + 1, var3);
            } else if (~this.field8092 == -17 && ~var3 < -1 && ~class541.field7896 <= ~var4) {
                return this.method3918(arg1, (byte) 101, var4 + 1, var3 + -1);
            } else if (~this.field8092 == -33 && ~class43.field597 <= ~var3 && ~class541.field7896 <= ~var4) {
                return this.method3918(arg1, (byte) 101, var4 - -1, var3 + 1);
            } else if (~this.field8092 == -129 && ~var3 < -1 && ~var4 < -1) {
                return this.method3918(arg1, (byte) 101, var4 + -1, var3 + -1);
            } else if (~this.field8092 == -65 && ~var3 >= ~class43.field597 && var4 > 0) {
                return this.method3918(arg1, (byte) 101, var4 + -1, var3 + 1);
            } else {
                throw new RuntimeException("");
            }
        }
    }

    @OriginalMember(owner = "client!iq", name = "a", descriptor = "(Lfa;ILri;)V", line = 85)
    public static final void method3341(class214 arg0, int arg1, class97 arg2) {
        class412.field6326 = arg2;
        if (arg1 < 42) {
            field8097 = 107;
        }
        class27.field425 = arg0;
        ++field8095;
    }

    @OriginalMember(owner = "client!iq", name = "h", descriptor = "(B)V", line = 97)
    public static void method3342(byte arg0) {
        field8093 = null;
        if (arg0 != -55) {
            method3341((class214) null, 80, (class97) null);
        }
    }

    @OriginalMember(owner = "client!iq", name = "f", descriptor = "(I)Z", line = 108)
    public final boolean method1472(int arg0) {
        if (arg0 > -97) {
            this.field8092 = 13;
        }
        ++field8096;
        return class400.method2575(11331, super.field9703, super.field9705 >> class439.field6699, this, super.field9696 >> class439.field6699);
    }

    @OriginalMember(owner = "client!iq", name = "e", descriptor = "(I)Z", line = 121)
    public final boolean method1474(int arg0) {
        if (arg0 != -1) {
            this.field8092 = -61;
        }
        ++field8098;
        return class37.field509[(super.field9696 >> class439.field6699) + -class325.field5056 + class443.field6744][(super.field9705 >> class439.field6699) + -class542.field7902 + class443.field6744];
    }

    @OriginalMember(owner = "client!iq", name = "<init>", descriptor = "(IIIIII)V", line = 138)
    public class563(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field9696 = arg0;
        super.field9703 = (byte) arg4;
        super.field9695 = (byte) arg3;
        super.field9705 = arg2;
        super.field9701 = arg1;
        this.field8092 = (short) arg5;
    }
}
