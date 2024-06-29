import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class90 extends class88 {

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "Lhj;")
    public class69 field1704;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "Z")
    public static boolean field1702 = false;

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "Lhj;")
    public static class69 field1703 = class181.method1318("rot:", (byte) -114);

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "Lhj;")
    public static class69 field1709 = class181.method1318("Lade Sprites )2 ", (byte) -119);

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "I")
    public static int field1707;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "I")
    public static int field1710;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "Lnc;")
    public static class83 field1708;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "Lnc;")
    public static class83 field1711;

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(I)[Lej;")
    public static final class48[] method638(int arg0) {
        if (arg0 < 8) {
            return null;
        }
        field1710++;
        class48[] var1 = new class48[class196.field3573];
        for (int var2 = 0; var2 < class196.field3573; var2++) {
            var1[var2] = new class121(class229.field4196, class53.field941, class138.field2585[var2], class88.field1682[var2], class69.field1350[var2], class113.field2167[var2], class157.field2919[var2], class50.field841);
        }
        class229.method1636((byte) 126);
        return var1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method639(byte arg0, Component arg1) {
        arg1.addMouseListener(class113.field2173);
        if (arg0 == -34) {
            field1706++;
            arg1.addMouseMotionListener(class113.field2173);
            arg1.addFocusListener(class113.field2173);
        }
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    public static void method640(byte arg0) {
        field1709 = null;
        field1708 = null;
        field1703 = null;
        field1711 = null;
        int var1 = 34 % ((arg0 - 58) / 43);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public static final void method641(Component arg0, byte arg1) {
        arg0.removeKeyListener(class141.field2626);
        arg0.removeFocusListener(class141.field2626);
        if (arg1 > -11) {
            method640((byte) -79);
        }
        class63.field1229 = -1;
        field1707++;
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class90() {
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "(Lhj;I)V")
    public class90(class69 arg0, int arg1) {
        this.field1704 = arg0;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method642(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field1705++;
        int var9 = arg6 - arg0;
        if (arg5 <= -116) {
            int var10 = (arg4 - arg7 << 16) / var9;
            int var11 = arg2 - arg3;
            int var12 = (arg8 - arg1 << 16) / var11;
            class104.method773(0, arg0, 626061808, 0, arg3, var10, arg7, var12, arg6, arg1, arg2);
        }
    }
}
