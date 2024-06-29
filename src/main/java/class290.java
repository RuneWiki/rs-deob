import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class290 extends class344 {

    @OriginalMember(owner = "client!im", name = "C", descriptor = "Ljp;")
    public static class55 field4491 = new class55(58, -2);

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "(I)V")
    public static void method1944(int arg0) {
        if (arg0 != 1448495534) {
            field4491 = null;
        }
        field4491 = null;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(IIIIIF)V")
    public class290(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IIII)V")
    public final void method835(int arg0, int arg1, int arg2, int arg3) {
        super.field5136 = arg1;
        super.field5134 = arg3;
        super.field5128 = arg0;
        ++field4490;
        if (arg2 <= 103) {
            this.method835(103, 111, -10, -26);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BF)V")
    public final void method836(byte arg0, float arg1) {
        if (arg0 <= 70) {
            this.method836((byte) 55, -0.024486292F);
        }
        super.field5123 = arg1;
        ++field4493;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILfi;IIZ)V")
    public static final void method1945(int arg0, class38 arg1, int arg2, int arg3, boolean arg4) {
        ++field4492;
        int var5 = arg1.field629;
        int var6 = arg1.field591;
        if (~arg1.field513 != -1) {
            if (arg1.field513 == 1) {
                arg1.field629 = -arg1.field532 + arg0;
            } else if (arg1.field513 == 2) {
                arg1.field629 = arg1.field532 * arg0 >> 14;
            }
        } else {
            arg1.field629 = arg1.field532;
        }
        if (~arg1.field590 != -1) {
            if (~arg1.field590 == -2) {
                arg1.field591 = -arg1.field536 + arg2;
            } else if (~arg1.field590 == -3) {
                arg1.field591 = arg1.field536 * arg2 >> 14;
            }
        } else {
            arg1.field591 = arg1.field536;
        }
        if (~arg1.field513 == -5) {
            arg1.field629 = arg1.field591 * arg1.field587 / arg1.field578;
        }
        if (~arg1.field590 == arg3) {
            arg1.field591 = arg1.field629 * arg1.field578 / arg1.field587;
        }
        if (class267.field4246 && (~client.method3078(arg1).field1503 != -1 || arg1.field503 == 0)) {
            if (arg1.field591 < 5 && ~arg1.field629 > -6) {
                arg1.field629 = 5;
                arg1.field591 = 5;
            } else {
                if (arg1.field591 <= 0) {
                    arg1.field591 = 5;
                }
                if (arg1.field629 <= 0) {
                    arg1.field629 = 5;
                }
            }
        }
        if (~class456.field6785 == ~arg1.field593) {
            class53.field817 = arg1;
        }
        if (arg4 && arg1.field584 != null) {
            if (arg1.field629 != var5 || ~arg1.field591 != ~var6) {
                class510 var7 = new class510();
                var7.field7423 = arg1;
                var7.field7413 = arg1.field584;
                class516.field7506.method292((byte) 121, var7);
            }
        }
    }
}
