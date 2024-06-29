import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class561 {

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "[I")
    public static int[] field7960 = new int[1000];

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "Z")
    public static boolean field7961 = false;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public static int field7963;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "[I")
    public static int[] field7959;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(III)Z")
    public static final boolean method3285(int arg0, int arg1, int arg2) {
        field7963++;
        return arg1 == -30969 ? class673.method3810(122, arg2, arg0) & (class452.method2693(-545, arg2, arg0) | (arg2 & 0x2000) != 0 | class247.method1648((byte) -23, arg0, arg2)) : true;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)V")
    public static final void method3286(boolean arg0) {
        field7962++;
        client var1 = class345.field4858;
        synchronized (class345.field4858) {
            if (class330.field4654 == null) {
                Container var2;
                if (class754.field10504 != null) {
                    var2 = class754.field10504;
                } else if (class476.field6812 == null) {
                    var2 = class407.field5670;
                } else {
                    var2 = class476.field6812;
                }
                class556.field7778 = var2.getSize().width;
                class194.field2788 = var2.getSize().height;
                if (class754.field10504 == var2) {
                    Insets var3 = class754.field10504.getInsets();
                    class556.field7778 -= var3.right + var3.left;
                    class194.field2788 -= var3.top + var3.bottom;
                }
                if (class190.method1336((byte) -106) == 1) {
                    class452.field6245 = (class556.field7778 - class57.field1064) / 2;
                    class206.field2956 = class57.field1064;
                    class57.field1060 = 0;
                    class363.field5105 = class477.field6814;
                } else {
                    class576.method3342(-2);
                }
                if (class231.field3294 != class118.field1857) {
                    boolean var10000;
                    if (class206.field2956 < 1024 && class363.field5105 < 768) {
                        var10000 = true;
                    } else {
                        var10000 = false;
                    }
                }
                class567.field8085.setSize(class206.field2956, class363.field5105);
                if (class359.field5046 != null) {
                    if (class200.field2876) {
                        class373.method2347(class567.field8085, 0);
                    } else {
                        class359.field5046.method572(class567.field8085, class206.field2956, class363.field5105);
                    }
                }
                if (class754.field10504 == var2) {
                    Insets var4 = class754.field10504.getInsets();
                    class567.field8085.setLocation(class452.field6245 + var4.left, class57.field1060 + var4.top);
                } else {
                    class567.field8085.setLocation(class452.field6245, class57.field1060);
                }
                if (arg0) {
                    method3287(63);
                }
                if (class401.field5610 != -1) {
                    class319.method2050(0, true);
                }
                class696.method3905(-93);
            }
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V")
    public static void method3287(int arg0) {
        field7960 = null;
        if (arg0 == 0) {
            field7959 = null;
        }
    }
}
