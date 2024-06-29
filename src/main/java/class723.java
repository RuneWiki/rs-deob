import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class723 extends class354 {

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "F")
    public static float field10055;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field10050;

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "I")
    public static int field10051;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "I")
    public static int field10052;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field10053;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field10054;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field10056;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field10057;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)Z", line = 3)
    public final boolean method4033(int arg0) {
        int var2 = -12 % ((arg0 - -34) / 41);
        ++field10054;
        return !super.field4544.method4149((byte) 33);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIZII)V", line = 19)
    public static final void method4034(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        ++field10051;
        int var5 = 0;
        int var6 = arg1;
        if (arg2) {
            int var7 = -arg1;
            int var8 = -1;
            int var9 = class720.method4025(class667.field9373, arg1 + arg3, class225.field2994, 0);
            int var10 = class720.method4025(class667.field9373, -arg1 + arg3, class225.field2994, 0);
            class636.method3569(var9, arg4, var10, 347845800, class432.field5765[arg0]);
            while (var6 > var5) {
                var8 += 2;
                var7 += var8;
                if (var7 > 0) {
                    --var6;
                    var7 -= var6 << 1;
                    int var11 = -var6 + arg0;
                    int var12 = arg0 + var6;
                    if (var12 >= class546.field7619 && ~class760.field10606 <= ~var11) {
                        int var13 = class720.method4025(class667.field9373, arg3 + var5, class225.field2994, 0);
                        int var14 = class720.method4025(class667.field9373, arg3 - var5, class225.field2994, 0);
                        if (class760.field10606 >= var12) {
                            class636.method3569(var13, arg4, var14, 347845800, class432.field5765[var12]);
                        }
                        if (~var11 <= ~class546.field7619) {
                            class636.method3569(var13, arg4, var14, 347845800, class432.field5765[var11]);
                        }
                    }
                }
                ++var5;
                int var15 = -var5 + arg0;
                int var16 = arg0 + var5;
                if (~var16 <= ~class546.field7619 && class760.field10606 >= var15) {
                    int var17 = class720.method4025(class667.field9373, arg3 - -var6, class225.field2994, 0);
                    int var18 = class720.method4025(class667.field9373, -var6 + arg3, class225.field2994, 0);
                    if (~class760.field10606 <= ~var16) {
                        class636.method3569(var17, arg4, var18, 347845800, class432.field5765[var16]);
                    }
                    if (var15 >= class546.field7619) {
                        class636.method3569(var17, arg4, var18, 347845800, class432.field5765[var15]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 97)
    public final void method388(int arg0) {
        ++field10050;
        if (arg0 != 6384) {
            this.method4033(64);
        }
        if (super.field4544.method4149((byte) 33)) {
            super.field4545 = 2;
        }
        if (super.field4545 < 0 || ~super.field4545 < -3) {
            super.field4545 = this.method393((byte) -76);
        }
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(ILwo;)V", line = 117)
    public class723(int arg0, class746 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(II)V", line = 121)
    public final void method389(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method4033(21);
        }
        ++field10056;
        super.field4545 = arg1;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lwo;)V", line = 134)
    public class723(class746 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(B)I", line = 137)
    public final int method4035(byte arg0) {
        int var2 = 56 / ((arg0 - 7) / 45);
        ++field10053;
        return super.field4545;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(II)I", line = 147)
    public final int method391(int arg0, int arg1) {
        ++field10057;
        if (super.field4544.method4149((byte) 33)) {
            return 3;
        } else {
            return arg0 != 3 ? -27 : 1;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)I", line = 166)
    public final int method393(byte arg0) {
        int var2 = 117 % ((37 - arg0) / 63);
        ++field10052;
        if (super.field4544.method4149((byte) 33)) {
            return 2;
        } else {
            return super.field4544.field10399.method1922(false) && class286.method1702((byte) 90, super.field4544.field10399.method1924((byte) 94)) ? 1 : 0;
        }
    }
}
