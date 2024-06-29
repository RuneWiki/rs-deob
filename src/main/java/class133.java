import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ej")
public class class133 extends class509 {

    @OriginalMember(owner = "client!ej", name = "f", descriptor = "F")
    public static float field1963 = 1.0F;

    @OriginalMember(owner = "client!ej", name = "d", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!ej", name = "e", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!ej", name = "g", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!ej", name = "a", descriptor = "(I)V", line = 11)
    public static final void method1055(int arg0) {
        field1962++;
        client var1 = class627.field8774;
        synchronized (class627.field8774) {
            if (arg0 == 2445 && class632.field8832 == null) {
                Container var2;
                if (class388.field5642 != null) {
                    var2 = class388.field5642;
                } else if (class735.field10183 == null) {
                    var2 = class189.field2512;
                } else {
                    var2 = class735.field10183;
                }
                class482.field6666 = var2.getSize().width;
                class655.field9076 = var2.getSize().height;
                if (class388.field5642 == var2) {
                    Insets var3 = class388.field5642.getInsets();
                    class482.field6666 -= var3.left + var3.right;
                    class655.field9076 -= var3.top + var3.bottom;
                }
                if (class485.method2816(-72) == 1) {
                    class140.field2048 = class710.field9945;
                    class593.field8019 = class124.field1786;
                    class719.field10029 = (class482.field6666 - class124.field1786) / 2;
                    class239.field3220 = 0;
                } else {
                    class387.method2452((byte) 104);
                }
                if (class731.field10141 != class197.field2634) {
                    boolean var10000;
                    if (class593.field8019 < 1024 && class140.field2048 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class706.field9894.setSize(class593.field8019, class140.field2048);
                if (class379.field5542 != null) {
                    if (class130.field1934) {
                        class733.method4068(class706.field9894, (byte) -71);
                    } else {
                        class379.field5542.method448(class706.field9894, class593.field8019, class140.field2048);
                    }
                }
                if (class388.field5642 == var2) {
                    Insets var4 = class388.field5642.getInsets();
                    class706.field9894.setLocation(class719.field10029 + var4.left, class239.field3220 + var4.top);
                } else {
                    class706.field9894.setLocation(class719.field10029, class239.field3220);
                }
                if (class69.field968 != -1) {
                    class503.method2921(-97, true);
                }
                class59.method415(true);
            }
        }
    }

    @OriginalMember(owner = "client!ej", name = "b", descriptor = "(III)V", line = 102)
    public static final void method1056(int arg0, int arg1, int arg2) {
        if (arg1 == -17453) {
            field1964++;
            class16 var3 = class94.method753(5, 13175, (long) arg0);
            var3.method119(-55);
            var3.field237 = arg2;
        }
    }
}
