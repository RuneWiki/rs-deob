import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public class class302 extends class703 {

    @OriginalMember(owner = "client!pda", name = "r", descriptor = "I")
    public int field3996;

    @OriginalMember(owner = "client!pda", name = "q", descriptor = "Lwv;")
    public static class423 field3995 = null;

    @OriginalMember(owner = "client!pda", name = "p", descriptor = "[I")
    public static int[] field3994 = new int[2];

    @OriginalMember(owner = "client!pda", name = "t", descriptor = "J")
    public static long field3998 = 0L;

    @OriginalMember(owner = "client!pda", name = "n", descriptor = "Luf;")
    public static class380 field3992 = new class380(4);

    @OriginalMember(owner = "client!pda", name = "m", descriptor = "I")
    public static int field3991;

    @OriginalMember(owner = "client!pda", name = "o", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!pda", name = "s", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(B)V")
    public static final void method1777(byte arg0) {
        field3997++;
        if (class529.field7314 != null) {
            return;
        }
        Container var1;
        if (class190.field2630 != null) {
            var1 = class190.field2630;
        } else if (class516.field7178 == null) {
            var1 = class27.field400;
        } else {
            var1 = class516.field7178;
        }
        class455.field5994 = var1.getSize().width;
        class246.field3213 = var1.getSize().height;
        if (class190.field2630 == var1) {
            Insets var2 = class190.field2630.getInsets();
            class455.field5994 -= var2.left + var2.right;
            class246.field3213 -= var2.top + var2.bottom;
        }
        if (class702.method3945((byte) -126) == 1) {
            class399.field5301 = class666.field9479;
            class646.field8936 = (class455.field5994 - class666.field9479) / 2;
            class60.field750 = class399.field5293;
            class628.field8692 = 0;
        } else {
            class263.method1584(false);
        }
        if (class480.field6673 != class180.field2522) {
            boolean var10000;
            if (class399.field5301 < 1024 && class60.field750 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class583.field7996.setSize(class399.field5301, class60.field750);
        if (class146.field1963 != null) {
            class146.field1963.method1052(class583.field7996);
        }
        if (class190.field2630 == var1) {
            Insets var3 = class190.field2630.getInsets();
            class583.field7996.setLocation(var3.left + class646.field8936, class628.field8692 + var3.top);
        } else {
            class583.field7996.setLocation(class646.field8936, class628.field8692);
        }
        if (class164.field2349 != -1) {
            class166.method1012(34, true);
        }
        if (arg0 >= 58) {
            class314.method1837((byte) 62);
        }
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(I)V")
    public static void method1778(int arg0) {
        field3992 = null;
        field3995 = null;
        field3994 = null;
        if (arg0 != 0) {
            field3994 = null;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I)Ltca;")
    public final class141 method421(int arg0) {
        field3991++;
        return arg0 == 4 ? class104.field1230 : null;
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(ILtl;Lfn;III)V")
    public class302(int arg0, class566 arg1, class286 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field3996 = arg5;
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ILio;)Loi;")
    public static final class226 method1779(int arg0, class157 arg1) {
        if (arg0 != 768) {
            field3998 = 43L;
        }
        field3993++;
        int var2 = arg1.method908(false);
        return new class226(var2);
    }
}
