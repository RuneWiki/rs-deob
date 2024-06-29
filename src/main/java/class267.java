import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pfa")
public class class267 extends class57 {

    @OriginalMember(owner = "client!pfa", name = "G", descriptor = "Leca;")
    public static class704 field3613 = new class704(0, 0);

    @OriginalMember(owner = "client!pfa", name = "H", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!pfa", name = "I", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!pfa", name = "J", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!pfa", name = "K", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IIIII)V", line = 7)
    public final void method474(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 10000) {
            method1626((byte) 98, 36);
        }
        ++field3614;
        int var6 = super.field639.method1660();
        int var7 = ((class167) super.field6672).field2440 * class143.method1007((byte) -57) / 10 % var6;
        super.field639.method3926(arg3 - var6 + var7, arg4, -var7 + arg0 - -var6, arg1);
    }

    @OriginalMember(owner = "client!pfa", name = "e", descriptor = "(I)V", line = 22)
    public static void method1625(int arg0) {
        field3613 = null;
        int var1 = 37 / ((26 - arg0) / 45);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(BI)V", line = 31)
    public static final void method1626(byte arg0, int arg1) {
        if (!class366.field4875.field9357) {
            arg1 = -1;
        }
        ++field3615;
        if (~class338.field4538 != ~arg1) {
            if (~arg1 != 0) {
                class143 var2 = class542.field7338.method3357(arg1, (byte) -82);
                class168 var3 = var2.method1005(1);
                if (var3 != null) {
                    class543.field7374.method773(var3.method1194(), class611.field8473, var3.method1185(), 17, new Point(var2.field2062, var2.field2052), var3.method1182());
                    class338.field4538 = arg1;
                } else {
                    arg1 = -1;
                }
            }
            if (arg0 == 10) {
                if (arg1 == -1 && class338.field4538 != -1) {
                    class543.field7374.method773(-1, class611.field8473, -1, arg0 ^ 27, new Point(), (int[]) null);
                    class338.field4538 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pfa", name = "<init>", descriptor = "(Lsea;Lsea;Lefa;)V", line = 72)
    public class267(class648 arg0, class648 arg1, class167 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(Lsea;ZIIZII)V", line = 77)
    public static final void method1627(class648 arg0, boolean arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class542.field7334 = arg3;
        class129.field1848 = arg5;
        class131.field1891 = arg6;
        class123.field1688 = null;
        class4.field34 = arg0;
        class439.field6090 = arg4;
        class450.field6183 = 1;
        if (arg1) {
            method1627((class648) null, false, -96, -51, true, -32, 25);
        }
        class686.field9799 = arg2;
        ++field3617;
    }

    @OriginalMember(owner = "client!pfa", name = "a", descriptor = "(IB)I", line = 100)
    public static final int method1628(int arg0, byte arg1) {
        ++field3616;
        int var2 = -5 / ((arg1 - 17) / 38);
        return 255 & arg0;
    }
}
