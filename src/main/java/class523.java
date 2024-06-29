import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class523 extends class122 {

    @OriginalMember(owner = "client!si", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field7730;

    @OriginalMember(owner = "client!si", name = "E", descriptor = "Lof;")
    public static class328 field7733 = new class328(64);

    @OriginalMember(owner = "client!si", name = "J", descriptor = "Llm;")
    public static class31 field7738 = new class31(3, 5);

    @OriginalMember(owner = "client!si", name = "C", descriptor = "I")
    public static int field7731;

    @OriginalMember(owner = "client!si", name = "D", descriptor = "I")
    public static int field7732;

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field7734;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "I")
    public static int field7735;

    @OriginalMember(owner = "client!si", name = "I", descriptor = "I")
    public static int field7737;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "Lsc;")
    public static class29 field7736;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lwh;ILwh;)V")
    public static final void method3124(class529 arg0, int arg1, class529 arg2) {
        if (arg2.field7776 != null) {
            arg2.method3149(arg1 + 101);
        }
        field7732++;
        if (arg1 != -1) {
            field7738 = null;
        }
        arg2.field7779 = arg0;
        arg2.field7776 = arg0.field7776;
        arg2.field7776.field7779 = arg2;
        arg2.field7779.field7776 = arg2;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(B)V")
    public static void method3125(byte arg0) {
        field7736 = null;
        field7738 = null;
        if (arg0 < 23) {
            field7736 = null;
        }
        field7733 = null;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(Z)V")
    public static final void method3126(boolean arg0) {
        field7731++;
        if (class216.field3671 != null) {
            return;
        }
        Container var1;
        if (class92.field1342 == null) {
            var1 = class339.field5294.field27;
        } else {
            var1 = class92.field1342;
        }
        class414.field6267 = var1.getSize().width;
        class329.field5175 = var1.getSize().height;
        if (class92.field1342 == var1) {
            Insets var2 = class92.field1342.getInsets();
            class414.field6267 -= var2.right + var2.left;
            class329.field5175 -= var2.top + var2.bottom;
        }
        if (class5.method47(-1129530388) == 1) {
            class50.field638 = (class414.field6267 - class437.field6752) / 2;
            class219.field3715 = class95.field1391;
            class14.field149 = 0;
            class489.field7400 = class437.field6752;
        } else if (class491.field7438 < 96 && class452.field7013 == 0) {
            int var3 = class414.field6267 <= 1024 ? class414.field6267 : 1024;
            class50.field638 = (class414.field6267 - var3) / 2;
            class489.field7400 = var3;
            int var4 = class329.field5175 <= 768 ? class329.field5175 : 768;
            class219.field3715 = var4;
            class14.field149 = 0;
        } else {
            class50.field638 = 0;
            class14.field149 = 0;
            class489.field7400 = class414.field6267;
            class219.field3715 = class329.field5175;
        }
        if (class209.field3228 != class181.field2626) {
            boolean var10000;
            if (class489.field7400 < 1024 && class219.field3715 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class320.field4980.setSize(class489.field7400, class219.field3715);
        if (!arg0) {
            method3125((byte) -83);
        }
        if (class19.field198 != null) {
            class19.field198.method1253(class320.field4980);
        }
        if (class92.field1342 == var1) {
            Insets var5 = class92.field1342.getInsets();
            class320.field4980.setLocation(class50.field638 + var5.left, class14.field149 + var5.top);
        } else {
            class320.field4980.setLocation(class50.field638, class14.field149);
        }
        if (class509.field7597 != -1) {
            class154.method942(true, 50);
        }
        class271.method1836(0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)Z")
    public final boolean method769(int arg0) {
        field7737++;
        return arg0 < 75 ? false : false;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(II)Z")
    public static final boolean method3127(int arg0, int arg1) {
        field7735++;
        if (arg1 != 96) {
            method3126(true);
        }
        for (class140 var2 = (class140) class392.field5958.method2123(-68); var2 != null; var2 = (class140) class392.field5958.method2126((byte) 61)) {
            if (class433.method2725((byte) -70, var2.field1894) && ((long) arg0) == var2.field1895) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class523(Object arg0, int arg1) {
        super(arg1);
        this.field7730 = arg0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(B)Ljava/lang/Object;")
    public final Object method768(byte arg0) {
        field7734++;
        return arg0 > -56 ? null : this.field7730;
    }
}
