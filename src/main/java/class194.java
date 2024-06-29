import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public abstract class class194 extends class626 {

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Loea;")
    public class594 field2790;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
    public boolean field2785;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)V")
    public static final void method1354(byte arg0, int arg1) {
        field2792++;
        if (class471.field6781.field6679.method3686(27669) == 0) {
            arg1 = -1;
        }
        if (arg0 != 96 || class173.field2510 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class56 var2 = class254.field3692.method898(arg1, 91);
            class55 var3 = var2.method517(1012);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class341.field4796.method2290(class567.field8085, arg0 - 77, var3.method510(), var3.method500(), new Point(var2.field1056, var2.field1051), var3.method499());
                class173.field2510 = arg1;
            }
        }
        if (arg1 == -1 && class173.field2510 != -1) {
            class341.field4796.method2290(class567.field8085, 19, -1, -1, new Point(), null);
            class173.field2510 = -1;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)Z")
    public final boolean method1355(int arg0) {
        field2784++;
        return arg0 <= 123 ? false : false;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IB)V")
    public abstract void method1356(int arg0, byte arg1);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(I)I")
    public final int method1357(int arg0) {
        if (arg0 != 5) {
            this.field2785 = false;
        }
        field2787++;
        return 1;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BILme;Lme;)V")
    public abstract void method1358(byte arg0, int arg1, class192 arg2, class192 arg3);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BII)V")
    public abstract void method1359(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(I)Z")
    public final boolean method1360(int arg0) {
        field2786++;
        if (arg0 != -1) {
            field2788 = -35;
        }
        return this.field2785;
    }

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "(I)V")
    public static final void method1361(int arg0) {
        field2789++;
        int var1 = class206.field2950;
        int[] var2 = class209.field3013;
        int var3 = 0;
        if (arg0 != -15090) {
            method1361(-72);
        }
        while (var3 < var1) {
            class349 var4 = class165.field2442[var2[var3]];
            if (var4 != null) {
                class515.method3069((byte) 23, var4.method482(false), var4);
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)Z")
    public abstract boolean method1362(boolean arg0);

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public abstract void method1363(byte arg0);

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(B)I")
    public int method1364(byte arg0) {
        field2791++;
        int var2 = -25 % ((arg0 + 59) / 55);
        return 0;
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Loea;)V")
    public class194(class594 arg0) {
        this.field2790 = arg0;
    }

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "(I)Z")
    public abstract boolean method1365(int arg0);
}
