import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class444 extends class108 {

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field6135;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "I")
    private int field6131;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    private int field6139;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    private int field6134;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "I")
    private int field6146;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field6137;

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public int field6141;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public int field6140;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    private int field6144;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "F")
    public static float field6145;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "I")
    public static int field6129;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "I")
    public static int field6130;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public static int field6132;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field6133;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public static int field6136;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public static int field6138;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public static int field6142;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IIII)Z")
    public final boolean method2580(int arg0, int arg1, int arg2, int arg3) {
        field6132++;
        int var5 = -90 % ((-arg3 - 18) / 34);
        return this.field6144 == arg0 && arg1 >= this.field6139 && this.field6131 >= arg1 && this.field6134 <= arg2 && arg2 <= this.field6146;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "([IIII)V")
    public final void method2581(int[] arg0, int arg1, int arg2, int arg3) {
        field6138++;
        arg0[2] = arg2 - (this.field6134 - this.field6135);
        arg0[arg1] = arg3 - (this.field6139 - this.field6141);
        arg0[0] = 0;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I[III)V")
    public final void method2582(int arg0, int[] arg1, int arg2, int arg3) {
        arg1[1] = arg2 + this.field6139 - this.field6141;
        arg1[2] = this.field6134 + arg0 - this.field6135;
        field6142++;
        if (arg3 < -16) {
            arg1[0] = this.field6144;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IILqa;IIII)Lr;")
    public static final class521 method2583(int arg0, int arg1, class167 arg2, int arg3, int arg4, int arg5, int arg6) {
        field6130++;
        long var7 = (long) arg1;
        class521 var9 = (class521) class318.field4398.method323(var7, -19814);
        short var10 = 2055;
        if (var9 == null) {
            class528 var11 = class624.method3603(-77, 0, arg1, class245.field3104);
            if (var11 == null) {
                return null;
            }
            if (var11.field7380 < 13) {
                var11.method2949(2, -95);
            }
            var9 = arg2.method197(var11, var10, class260.field3208, 64, 768);
            class318.field4398.method316(var7, (byte) -126, var9);
        }
        class521 var12 = var9.method1607((byte) 2, var10, true);
        if (arg0 != arg6) {
            var12.method1567(arg6);
        }
        if (arg5 != 0) {
            var12.method1580(arg5);
        }
        if (arg3 != 0) {
            var12.method1574(arg3);
        }
        if (arg4 != 0) {
            var12.method1602(0, arg4, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(III)Z")
    public final boolean method2584(int arg0, int arg1, int arg2) {
        field6136++;
        int var4 = -21 % ((-arg2 - 59) / 55);
        return arg0 >= this.field6141 && arg0 <= this.field6140 && this.field6135 <= arg1 && arg1 <= this.field6137;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(III)Z")
    public final boolean method2585(int arg0, int arg1, int arg2) {
        if (arg0 != 1) {
            field6143 = 107;
        }
        field6133++;
        return arg1 >= this.field6139 && arg1 <= this.field6131 && this.field6134 <= arg2 && this.field6146 >= arg2;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static final void method2586(int arg0) {
        field6129++;
        class123.field1540.method409((byte) -126);
        class272.field3457.field7707 = 0;
        class501.field6953 = null;
        class208.field2708 = null;
        class327.field4494 = 0;
        class558.field7814 = null;
        class189.field2446 = 0;
        class507.field7078 = null;
        if (arg0 != 24201) {
            method2583(-41, -62, null, -81, -115, -116, 38);
        }
        class342.field4758.field7707 = 0;
        class387.method2339(-92);
        class410.field5632 = 0;
        class99.field1331 = null;
        class447.field6284 = 0;
        class323.field4445 = 0;
        class633.field9207 = null;
    }

    @OriginalMember(owner = "client!ke", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field6135 = arg6;
        this.field6131 = arg3;
        this.field6139 = arg1;
        this.field6134 = arg2;
        this.field6146 = arg4;
        this.field6137 = arg8;
        this.field6141 = arg5;
        this.field6140 = arg7;
        this.field6144 = arg0;
    }

    static {
        new class344(" days.", " Tage.", " jours.", " dias.");
    }
}
