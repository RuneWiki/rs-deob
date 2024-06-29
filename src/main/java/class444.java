import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class444 {

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field5951 = 0;

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Ldj;")
    public static class362 field5950 = new class362(4);

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lhj;")
    public static class596 field5954 = new class596(10, -1);

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Lsi;")
    public static class586 field5955 = new class586();

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field5949;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field5952;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lvr;")
    public static class148 field5956;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "Lbt;")
    public static class48 field5953;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)I", line = 8)
    public static final int method2615(int arg0, int arg1) {
        field5949++;
        if (arg1 != 14961) {
            method2617(-109, -92, 33);
        }
        byte var2;
        if (arg0 > 12000) {
            var2 = 4;
            class108.method875(28007);
        } else if (arg0 > 5000) {
            var2 = 3;
            class576.method3329(-10);
        } else if (arg0 > 2000) {
            class490.method2898(0);
            var2 = 2;
        } else {
            var2 = 1;
            class368.method2142(-23156, true);
        }
        if (class118.field1503.field10665.method1903(arg1 - 14961) != 2) {
            class118.field1503.method4295(class118.field1503.field10653, 2, false);
            class677.method3810(true, 2, false);
        }
        class14.method194(true);
        return var2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 64)
    public static void method2616(int arg0) {
        field5954 = null;
        field5953 = null;
        if (arg0 <= -44) {
            field5956 = null;
            field5950 = null;
            field5955 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V", line = 86)
    public static final void method2617(int arg0, int arg1, int arg2) {
        int var3 = -45 / ((75 - arg0) / 49);
        field5952++;
        if (class672.field9229 == class421.field5604) {
            if (!class96.method834(false, -2, (byte) 113, arg1, 0, 1, 0, arg2, 1)) {
                class96.method834(false, -3, (byte) 116, arg1, 0, 1, 0, arg2, 1);
            }
        } else if (!class96.method834(false, -3, (byte) -71, arg1, 0, 1, 0, arg2, 1)) {
            class96.method834(false, -2, (byte) 2, arg1, 0, 1, 0, arg2, 1);
        }
    }
}
