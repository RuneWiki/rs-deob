import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class217 extends class205 {

    @OriginalMember(owner = "client!oc", name = "k", descriptor = "I")
    private int field2554;

    @OriginalMember(owner = "client!oc", name = "q", descriptor = "I")
    private int field2560;

    @OriginalMember(owner = "client!oc", name = "m", descriptor = "I")
    private int field2556;

    @OriginalMember(owner = "client!oc", name = "n", descriptor = "I")
    private int field2557;

    @OriginalMember(owner = "client!oc", name = "o", descriptor = "I")
    private int field2558;

    @OriginalMember(owner = "client!oc", name = "s", descriptor = "I")
    private int field2562;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "I")
    private int field2550;

    @OriginalMember(owner = "client!oc", name = "r", descriptor = "I")
    private int field2561;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "Lhj;")
    public static class596 field2551 = new class596(81, 3);

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!oc", name = "j", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!oc", name = "l", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!oc", name = "p", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(I)V")
    public static void method1351(int arg0) {
        if (arg0 == -29504) {
            field2551 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIB)V")
    public final void method1225(int arg0, int arg1, byte arg2) {
        ++field2552;
        int var4 = this.field2558 * arg1 >> 12;
        int var5 = this.field2554 * arg0 >> 12;
        int var6 = this.field2561 * arg1 >> 12;
        int var7 = this.field2557 * arg0 >> 12;
        int var8 = this.field2562 * arg1 >> 12;
        if (arg2 >= -6) {
            this.field2557 = 29;
        }
        int var9 = this.field2556 * arg0 >> 12;
        int var10 = this.field2560 * arg1 >> 12;
        int var11 = this.field2550 * arg0 >> 12;
        class456.method2761(-1, super.field2450, var4, var11, var8, var10, var6, var9, var5, var7);
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(III)Z")
    public static final boolean method1352(int arg0, int arg1, int arg2) {
        ++field2559;
        if (arg2 > -25) {
            method1352(-52, -26, 120);
        }
        if (!class494.method2913(arg0, 31613, arg1)) {
            return false;
        } else {
            return class370.method2156(arg1, arg0, 540800) | ~(36864 & arg1) != -1 | class411.method2454(256, arg0, arg1) ? true : ~(55 & arg0) == -1 & (~(arg1 & 8192) != -1 | class226.method1386(arg1, arg0, true) | class366.method2133(arg1, arg0, 120));
        }
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(III)V")
    public final void method1222(int arg0, int arg1, int arg2) {
        ++field2553;
        if (arg1 != -10852) {
            this.field2554 = 51;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class217(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field2554 = arg1;
        this.field2560 = arg6;
        this.field2556 = arg5;
        this.field2557 = arg3;
        this.field2558 = arg0;
        this.field2562 = arg4;
        this.field2550 = arg7;
        this.field2561 = arg2;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)V")
    public final void method1223(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            this.field2550 = -54;
        }
        ++field2555;
    }
}
