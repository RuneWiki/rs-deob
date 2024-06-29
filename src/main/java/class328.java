import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class328 {

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field4774;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field4775;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field4776;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field4779;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "Lfh;")
    public static class210 field4780;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "Lel;")
    public class328 field4783;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "Llm;")
    public static class347 field4777;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "Lva;")
    public class55 field4785;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Llq;")
    public static class75 field4782;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "Lclient;")
    public static client field4784;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static final void method2182(int arg0) {
        class157.field2131 = null;
        class248.field3341 = null;
        class397.field5908 = null;
        class331.field4817 = null;
        class415.field6093 = null;
        class424.field6267 = null;
        class253.field3494 = null;
        class397.field5912 = null;
        class448.field6562 = null;
        class390.field5619 = null;
        class26.field363 = null;
        class302.field4447 = null;
        field4776++;
        if (arg0 != -13476) {
            field4777 = null;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method2183(Component arg0, int arg1) {
        field4774++;
        arg0.addMouseListener(class30.field430);
        arg0.addMouseMotionListener(class30.field430);
        arg0.addFocusListener(class30.field430);
        int var2 = 112 / ((arg1 - 8) / 50);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "([BI)Z")
    public static final boolean method2184(byte[] arg0, int arg1) {
        field4775++;
        class228 var2 = new class228(arg0);
        int var3 = var2.method1348(-102);
        if (arg1 != 12596) {
            method2186((byte) 118);
        }
        if (var3 != 1) {
            return false;
        }
        boolean var4 = var2.method1348(arg1 - 12697) == 1;
        if (var4) {
            class351.method2311(var2, (byte) -52);
        }
        class151.method948((byte) 112, var2);
        return true;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)V")
    public final void method2185(int arg0) {
        field4778++;
        if (class324.field4755 >= 500) {
            return;
        }
        this.field4781 = 0;
        this.field4783 = class259.field3786;
        this.field4785 = null;
        class324.field4755++;
        if (arg0 != 1) {
            this.method2185(47);
        }
        class259.field3786 = this;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static void method2186(byte arg0) {
        if (arg0 != -96) {
            field4777 = null;
        }
        field4777 = null;
        field4780 = null;
        field4782 = null;
        field4784 = null;
    }
}
