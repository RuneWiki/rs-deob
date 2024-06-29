import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class381 {

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Ldc;")
    private class5 field5681 = new class5(64);

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "Lhe;")
    private class239 field5676;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public int field5674;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "Ldc;")
    public static class5 field5675 = new class5(32);

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field5679 = 1401;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "Lak;")
    public static class222 field5680 = new class222(8, 0, 4, 1);

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field5677;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "[[I")
    public static int[][] field5678;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 3)
    public static void method2298(byte arg0) {
        field5675 = null;
        if (arg0 == 58) {
            field5680 = null;
            field5678 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lvp;ILeq;)I", line = 15)
    public static final int method2299(class117 arg0, int arg1, class134 arg2) {
        field5673++;
        if (arg0.field1519 != -1) {
            return arg0.field1519;
        }
        if (arg0.field1506 != -1) {
            class118 var3 = arg2.field1695.method432(arg2.method831() ? arg0.field1506 : arg0.field1521, true);
            if (!var3.field1543) {
                return var3.field1532;
            }
        }
        return arg1 < 21 ? -66 : arg0.field1502;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)Ls;", line = 47)
    public final class175 method2300(int arg0, int arg1) {
        field5672++;
        class5 var3 = this.field5681;
        class175 var4;
        synchronized (this.field5681) {
            if (arg1 > -115) {
                this.field5674 = -19;
            }
            var4 = (class175) this.field5681.method40(0, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field5676.method1470(4, arg0, 19);
        class175 var6 = new class175();
        if (var5 != null) {
            var6.method1097((byte) 118, new class156(var5));
        }
        class5 var7 = this.field5681;
        synchronized (this.field5681) {
            this.field5681.method36(-20960, var6, (long) arg0);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)V", line = 77)
    public static final void method2301(byte arg0) {
        field5677++;
        if (class217.field3043 != null) {
            return;
        }
        Container var1;
        if (class75.field1066 == null) {
            var1 = class86.field1182.field668;
        } else {
            var1 = class75.field1066;
        }
        class452.field6577 = var1.getSize().width;
        class380.field5667 = var1.getSize().height;
        if (class75.field1066 == var1) {
            Insets var2 = class75.field1066.getInsets();
            class380.field5667 -= var2.top + var2.bottom;
            class452.field6577 -= var2.right + var2.left;
        }
        if (class262.method1618(-29489) == 1) {
            class103.field1387 = (class452.field6577 - class427.field6289) / 2;
            class223.field3156 = class427.field6289;
            class323.field4734 = 0;
            class207.field2874 = class160.field2084;
        } else if (class315.field4620 < 96 && class293.field4174 == 0) {
            int var3 = class452.field6577 > 1024 ? 1024 : class452.field6577;
            class223.field3156 = var3;
            int var4 = class380.field5667 > 768 ? 768 : class380.field5667;
            class103.field1387 = (class452.field6577 - var3) / 2;
            class207.field2874 = var4;
            class323.field4734 = 0;
        } else {
            class207.field2874 = class380.field5667;
            class103.field1387 = 0;
            class323.field4734 = 0;
            class223.field3156 = class452.field6577;
        }
        if (arg0 > -86) {
            method2299(null, 16, null);
        }
        if (class371.field5567 != class339.field4941) {
            boolean var10000;
            if (class223.field3156 < 1024 && class207.field2874 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class498.field7590.setSize(class223.field3156, class207.field2874);
        if (class481.field6937 != null) {
            class481.field6937.method818(class498.field7590);
        }
        if (class75.field1066 == var1) {
            Insets var5 = class75.field1066.getInsets();
            class498.field7590.setLocation(var5.left + class103.field1387, class323.field4734 + var5.top);
        } else {
            class498.field7590.setLocation(class103.field1387, class323.field4734);
        }
        if (class465.field6737 != -1) {
            class309.method1856(-75, true);
        }
        class270.method1650(-24453);
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "(Lci;ILhe;)V", line = 190)
    public class381(class298 arg0, int arg1, class239 arg2) {
        this.field5676 = arg2;
        this.field5674 = this.field5676.method1473(4309, 19);
    }
}
