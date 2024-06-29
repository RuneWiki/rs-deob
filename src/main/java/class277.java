import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class277 extends class203 {

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "Lce;")
    public class194 field4760;

    @OriginalMember(owner = "client!uj", name = "I", descriptor = "I")
    public static int field4755 = 2301979;

    @OriginalMember(owner = "client!uj", name = "K", descriptor = "I")
    public static int field4757 = 0;

    @OriginalMember(owner = "client!uj", name = "H", descriptor = "Z")
    public static boolean field4754 = false;

    @OriginalMember(owner = "client!uj", name = "J", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!uj", name = "L", descriptor = "I")
    public static int field4758;

    @OriginalMember(owner = "client!uj", name = "M", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(Lhi;ILhi;)V", line = 12)
    public static final void method1893(class26 arg0, int arg1, class26 arg2) {
        class177.field2839 = arg0;
        field4758++;
        class266.field4490 = arg2;
        if (arg1 != 1) {
            method1893((class26) null, 22, (class26) null);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIII)V", line = 28)
    public static final void method1894(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4756++;
        if (arg1 != 1) {
            method1895(false, -34, 27);
        }
        if (arg2 <= arg3) {
            for (int var5 = arg2; var5 < arg3; var5++) {
                class282.field4817[var5][arg4] = arg0;
            }
        } else {
            for (int var6 = arg3; var6 < arg2; var6++) {
                class282.field4817[var6][arg4] = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ZII)Z", line = 63)
    public static final boolean method1895(boolean arg0, int arg1, int arg2) {
        field4759++;
        if (arg0) {
            field4754 = false;
        }
        return (arg2 >> arg1 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(Lce;)V", line = 103)
    public class277(class194 arg0) {
        this.field4760 = arg0;
    }
}
