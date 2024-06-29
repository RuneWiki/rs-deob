import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class451 {

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field6280 = 0;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[S")
    public static short[] field6281 = new short[] { 6, 52, 4, 11, 16, 20, 59, 47 };

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Laga;")
    public static class696 field6282 = new class696();

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZIII)V")
    public static final void method2688(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (class632.field8832 != null && (arg4 != 3 || class751.field10404 != arg3 || class148.field2081 != arg5)) {
            class668.method3694(class730.field10124, -34, class632.field8832);
            class632.field8832 = null;
        }
        field6283++;
        if (arg0 < 95) {
            method2689(-12);
        }
        if (arg4 == 3 && class632.field8832 == null) {
            class632.field8832 = class768.method4252(class730.field10124, -1, arg3, 0, arg5, 0);
            if (class632.field8832 != null) {
                class148.field2081 = arg5;
                class751.field10404 = arg3;
                class617.method3389(false);
            }
        }
        if (arg4 == 3 && class632.field8832 == null) {
            method2688(113, arg1, true, -1, class712.field9959.field1277.method1299(78), -1);
            return;
        }
        Container var6;
        if (class632.field8832 != null) {
            class482.field6666 = arg3;
            class655.field9076 = arg5;
            var6 = class632.field8832;
        } else if (class388.field5642 == null) {
            if (class735.field10183 == null) {
                var6 = class189.field2512;
            } else {
                var6 = class735.field10183;
            }
            class482.field6666 = var6.getSize().width;
            class655.field9076 = var6.getSize().height;
        } else {
            Insets var7 = class388.field5642.getInsets();
            class482.field6666 = class388.field5642.getSize().width - var7.left - var7.right;
            class655.field9076 = class388.field5642.getSize().height - var7.bottom - var7.top;
            var6 = class388.field5642;
        }
        if (arg4 == 1) {
            class239.field3220 = 0;
            class593.field8019 = class124.field1786;
            class140.field2048 = class710.field9945;
            class719.field10029 = (class482.field6666 - class124.field1786) / 2;
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
        if (arg2) {
            class342.method2175(7349);
        } else {
            class706.field9894.setSize(class593.field8019, class140.field2048);
            if (class130.field1934) {
                class733.method4068(class706.field9894, (byte) -32);
            } else {
                class379.field5542.method448(class706.field9894, class593.field8019, class140.field2048);
            }
            if (class388.field5642 == var6) {
                Insets var8 = class388.field5642.getInsets();
                class706.field9894.setLocation(class719.field10029 + var8.left, class239.field3220 + var8.top);
            } else {
                class706.field9894.setLocation(class719.field10029, class239.field3220);
            }
        }
        if (arg4 >= 2) {
            class701.field9834 = true;
        } else {
            class701.field9834 = false;
        }
        if (class69.field968 != -1) {
            class503.method2921(-68, true);
        }
        if (class457.field6340 != null && class732.method4059(true, class458.field6355)) {
            class10.method85(1624);
        }
        for (int var9 = 0; var9 < 100; var9++) {
            class627.field8773[var9] = true;
        }
        class237.field3206 = true;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method2689(int arg0) {
        if (arg0 != 59) {
            method2689(127);
        }
        field6282 = null;
        field6281 = null;
    }
}
