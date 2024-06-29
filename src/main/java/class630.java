import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class630 extends class499 {

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    private int field8565;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    private int field8571;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "I")
    private int field8573;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    private int field8562;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    private int field8564;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    private int field8570;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    private int field8563;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    private int field8574;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Ldk;")
    public static class488 field8568 = new class488();

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field8567;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field8569;

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static void method3442(int arg0) {
        if (arg0 != -8917) {
            method3443(-37, 61, 92);
        }
        field8568 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBI)V")
    public final void method1380(int arg0, byte arg1, int arg2) {
        ++field8572;
        if (arg1 != -20) {
            this.field8571 = -84;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(III)V")
    public final void method1374(int arg0, int arg1, int arg2) {
        ++field8561;
        if (arg1 >= -112) {
            this.field8562 = -50;
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(IIIIIIIIII)V")
    public class630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field8565 = arg6;
        this.field8571 = arg2;
        this.field8573 = arg0;
        this.field8562 = arg4;
        this.field8564 = arg1;
        this.field8570 = arg7;
        this.field8563 = arg5;
        this.field8574 = arg3;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(III)Lfca;")
    public static final class188 method3443(int arg0, int arg1, int arg2) {
        ++field8566;
        class188 var3 = class557.method3117(arg0, (byte) 71);
        if (arg1 == arg2) {
            return var3;
        } else {
            return var3 != null && var3.field2352 != null && arg2 < var3.field2352.length ? var3.field2352[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
    public final void method1376(int arg0, int arg1, int arg2) {
        ++field8567;
        int var4 = this.field8573 * arg2 >> 12;
        if (arg0 < 16) {
            this.method1380(-63, (byte) -70, 65);
        }
        int var5 = this.field8564 * arg1 >> 12;
        int var6 = this.field8571 * arg2 >> 12;
        int var7 = this.field8574 * arg1 >> 12;
        int var8 = this.field8562 * arg2 >> 12;
        int var9 = this.field8563 * arg1 >> 12;
        int var10 = this.field8565 * arg2 >> 12;
        int var11 = this.field8570 * arg1 >> 12;
        class430.method2481((byte) -37, var4, var5, var9, super.field6739, var6, var8, var10, var7, var11);
    }
}
