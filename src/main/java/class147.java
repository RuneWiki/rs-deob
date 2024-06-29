import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class147 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method873(int arg0) {
        if (arg0 != -25786) {
            return;
        }
        field2101++;
        boolean var1 = class385.field5314 != null || class23.field308 > 0;
        if (var1) {
            class409.field5600 = 1;
        }
        if (class266.field3517 && class449.field6111.method882((byte) 85, 81) && class475.field6540 > 2) {
            if (var1) {
                class246.field3290 = (class395) class450.field6121.field1573.field6048.field6048;
            } else {
                class220.method1248((class395) class450.field6121.field1573.field6048.field6048, class187.field2569.method1551(128), true, class187.field2569.method1549((byte) 108));
            }
        } else if (var1) {
            class246.field3290 = (class395) class450.field6121.field1573.field6048;
        } else {
            class220.method1248((class395) class450.field6121.field1573.field6048, class187.field2569.method1551(128), true, class187.field2569.method1549((byte) 108));
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ltl;Ltl;Z)V")
    public static final void method874(class403 arg0, class403 arg1, boolean arg2) {
        field2100++;
        if (arg1.field5534 != null) {
            arg1.method2441((byte) -93);
        }
        if (!arg2) {
            arg1.field5529 = arg0.field5529;
            arg1.field5534 = arg0;
            arg1.field5534.field5529 = arg1;
            arg1.field5529.field5534 = arg1;
        }
    }
}
