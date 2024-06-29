import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eda")
public class class116 extends class366 {

    @OriginalMember(owner = "client!eda", name = "m", descriptor = "I")
    public int field1734 = -1;

    @OriginalMember(owner = "client!eda", name = "t", descriptor = "I")
    public static int field1741 = 0;

    @OriginalMember(owner = "client!eda", name = "s", descriptor = "I")
    public static int field1740 = 0;

    @OriginalMember(owner = "client!eda", name = "l", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!eda", name = "o", descriptor = "I")
    public int field1736;

    @OriginalMember(owner = "client!eda", name = "p", descriptor = "I")
    public static int field1737;

    @OriginalMember(owner = "client!eda", name = "q", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!eda", name = "r", descriptor = "Lrba;")
    public static class102 field1739;

    @OriginalMember(owner = "client!eda", name = "n", descriptor = "Ljava/lang/String;")
    public String field1735;

    @OriginalMember(owner = "client!eda", name = "u", descriptor = "Ljava/lang/String;")
    public String field1742;

    @OriginalMember(owner = "client!eda", name = "v", descriptor = "[I")
    public static int[] field1743;

    @OriginalMember(owner = "client!eda", name = "c", descriptor = "(B)V")
    public static void method859(byte arg0) {
        field1743 = null;
        field1739 = null;
        int var1 = 34 % ((12 - arg0) / 39);
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(III)I")
    public static final int method860(int arg0, int arg1, int arg2) {
        ++field1733;
        int var3 = arg0;
        while (arg1 > 0) {
            var3 = var3 << 1 | 1 & arg2;
            arg2 >>>= 1;
            --arg1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!eda", name = "d", descriptor = "(I)Lrk;")
    public final class259 method861(int arg0) {
        if (arg0 != -1) {
            field1741 = -64;
        }
        ++field1738;
        return class314.field4598[super.field5361];
    }

    @OriginalMember(owner = "client!eda", name = "a", descriptor = "(IIBI)Loda;")
    public static final class654 method862(int arg0, int arg1, byte arg2, int arg3) {
        ++field1737;
        class654 var4 = null;
        if (~arg3 == -1) {
            var4 = class631.method3628(class57.field935, (byte) -51, class357.field5280);
            ++class414.field6133;
        }
        if (arg3 == 1) {
            ++class196.field2675;
            var4 = class631.method3628(class5.field104, (byte) -51, class357.field5280);
        }
        var4.field9358.method3162(-2003712696, arg0 - -class403.field6049);
        var4.field9358.method3143(class397.field6005 + arg1, (byte) 72);
        var4.field9358.method3110(!class18.field362.method1609(82, -27453) ? 0 : 1, 41);
        class373.field5521 = arg1;
        class338.field4907 = arg0;
        class338.field4905 = false;
        class222.method1390(false);
        if (arg2 > -28) {
            method859((byte) -47);
        }
        return var4;
    }
}
