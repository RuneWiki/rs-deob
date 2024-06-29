import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class201 {

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "[I")
    public int[] field2880;

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "[I")
    public int[] field2881;

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "[I")
    public int[] field2882;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "[[F")
    public float[][] field2879;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "Lqaa;")
    public static class27 field2877 = new class27(62, 3);

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIIBII)V", line = 5)
    public static final void method1408(boolean arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field2878++;
        if (class330.field4654 != null && (arg4 != 3 || class98.field1676 != arg1 || class374.field5242 != arg2)) {
            class394.method2446(-105, class341.field4796, class330.field4654);
            class330.field4654 = null;
        }
        if (arg4 == 3 && class330.field4654 == null) {
            class330.field4654 = class46.method413(class341.field4796, (byte) 59, arg1, arg2, 0, 0);
            if (class330.field4654 != null) {
                class98.field1676 = arg1;
                class374.field5242 = arg2;
                class129.method994((byte) 80);
            }
        }
        if (arg4 == 3 && class330.field4654 == null) {
            method1408(true, -1, -1, (byte) -95, class471.field6781.field6700.method2157(27669), arg5);
            return;
        }
        Container var6;
        if (class330.field4654 != null) {
            class194.field2788 = arg2;
            var6 = class330.field4654;
            class556.field7778 = arg1;
        } else if (class754.field10504 == null) {
            if (class476.field6812 == null) {
                var6 = class407.field5670;
            } else {
                var6 = class476.field6812;
            }
            class556.field7778 = var6.getSize().width;
            class194.field2788 = var6.getSize().height;
        } else {
            Insets var7 = class754.field10504.getInsets();
            int var10001 = -var7.right;
            class556.field7778 = class754.field10504.getSize().width + var10001 - var7.left;
            int var10 = var7.top + var7.bottom;
            class194.field2788 = class754.field10504.getSize().height - var10;
            var6 = class754.field10504;
        }
        if (arg4 == 1) {
            class206.field2956 = class57.field1064;
            class57.field1060 = 0;
            class452.field6245 = (class556.field7778 - class57.field1064) / 2;
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
        if (arg3 > -67) {
            method1409((byte) 87);
        }
        if (arg0) {
            class151.method1162(-16754);
        } else {
            class567.field8085.setSize(class206.field2956, class363.field5105);
            if (class200.field2876) {
                class373.method2347(class567.field8085, 0);
            } else {
                class359.field5046.method572(class567.field8085, class206.field2956, class363.field5105);
            }
            if (class754.field10504 == var6) {
                Insets var8 = class754.field10504.getInsets();
                class567.field8085.setLocation(class452.field6245 + var8.left, class57.field1060 + var8.top);
            } else {
                class567.field8085.setLocation(class452.field6245, class57.field1060);
            }
        }
        if (arg4 < 2) {
            class619.field8937 = false;
        } else {
            class619.field8937 = true;
        }
        if (class401.field5610 != -1) {
            class319.method2050(0, true);
        }
        if (class555.field7776 != null && class379.method2373(false, class611.field8839)) {
            class190.method1341((byte) -85);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class329.field4646[var9] = true;
        }
        class701.field9847 = true;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V", line = 138)
    public static void method1409(byte arg0) {
        field2877 = null;
        if (arg0 != -109) {
            field2877 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "([I[I[I[[F)V", line = 154)
    public class201(int[] arg0, int[] arg1, int[] arg2, float[][] arg3) {
        this.field2880 = arg1;
        this.field2881 = arg0;
        this.field2882 = arg2;
        this.field2879 = arg3;
    }
}
