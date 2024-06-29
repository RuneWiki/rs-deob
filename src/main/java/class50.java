import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class50 extends class271 {

    @OriginalMember(owner = "client!pv", name = "B", descriptor = "[B")
    public byte[] field798;

    @OriginalMember(owner = "client!pv", name = "C", descriptor = "I")
    public static int field799;

    @OriginalMember(owner = "client!pv", name = "D", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!pv", name = "E", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Loa;IIZLqa;IZ)V", line = 10)
    public static final void method309(class489 arg0, int arg1, int arg2, boolean arg3, class162 arg4, int arg5, boolean arg6) {
        field799++;
        if (arg6) {
            class403.field6057.method3121((class4.field57 - class403.field6057.method105()) / 2, (class116.field1743 - class403.field6057.method100()) / 2);
            class464.field6868.method3121((class4.field57 - class464.field6868.method105()) / 2, 18);
        }
        arg0.method2915(arg1, -1, class4.field57 / 2, class116.field1743 / 2 - 26, (class26.field273 == class183.field2707 ? class3.field44 : class415.field6233).method2838(arg3, class143.field2137), !arg3);
        int var7 = class116.field1743 / 2 - 18;
        arg4.method1104(class4.field57 / 2 - 152, var7, 304, 34, arg2, 0);
        arg4.method1104(class4.field57 / 2 - 151, var7 - -1, 302, 32, 0, 0);
        arg4.method1036(class4.field57 / 2 - 150, var7 + 2, class228.field3367 * 3, 30, arg5, 0);
        arg4.method1036(class4.field57 / 2 + class228.field3367 * 3 - 150, var7 + 2, 300 - class228.field3367 * 3, 30, 0, 0);
        arg0.method2915(arg1, -1, class4.field57 / 2, class116.field1743 / 2 + 4, class420.field6324, !arg3);
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([B)V", line = 32)
    public class50(byte[] arg0) {
        this.field798 = arg0;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Lme;B)V", line = 41)
    public static final void method310(class129 arg0, byte arg1) {
        field800++;
        int var2 = 29 / ((arg1 - 87) / 37);
        if (arg0 instanceof class167) {
            class167 var3 = (class167) arg0;
            if (var3.field2472 != null) {
                class519.method3066(class500.field7365.field1768 != var3.field1768, var3, 114);
                return;
            }
        } else if ((arg0 instanceof class239)) {
            class239 var4 = (class239) arg0;
            class340.method2078(-41, var4, class500.field7365.field1768 != var4.field1768);
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII)V", line = 69)
    public static final void method311(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class446.field6641; var5++) {
            Rectangle var7 = class125.field1885[var5];
            if ((var7.x + var7.width) > arg4 && arg3 + arg4 > var7.x && arg2 < (var7.y + var7.height) && var7.y < (arg1 + arg2)) {
                class343.field4944[var5] = true;
            }
        }
        int var6 = 34 / ((61 - arg0) / 47);
        field801++;
    }
}
