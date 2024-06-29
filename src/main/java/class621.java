import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kia")
public class class621 extends class656 {

    @OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
    public int field8270 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kia", name = "j", descriptor = "I")
    public int field8271 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kia", name = "p", descriptor = "I")
    public int field8277 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kia", name = "m", descriptor = "I")
    public int field8274 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kia", name = "k", descriptor = "I")
    public int field8272 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kia", name = "q", descriptor = "I")
    public int field8278 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kia", name = "r", descriptor = "I")
    public int field8279 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!kia", name = "t", descriptor = "I")
    public int field8281 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!kia", name = "n", descriptor = "Lpda;")
    public class630 field8275;

    @OriginalMember(owner = "client!kia", name = "u", descriptor = "[I")
    public static int[] field8282 = new int[13];

    @OriginalMember(owner = "client!kia", name = "s", descriptor = "F")
    public static float field8280;

    @OriginalMember(owner = "client!kia", name = "l", descriptor = "I")
    public static int field8273;

    @OriginalMember(owner = "client!kia", name = "o", descriptor = "I")
    public static int field8276;

    @OriginalMember(owner = "client!kia", name = "v", descriptor = "I")
    public static int field8283;

    @OriginalMember(owner = "client!kia", name = "w", descriptor = "I")
    public static int field8284;

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(BD)V")
    public static final void method3417(byte arg0, double arg1) {
        class681.field9513.method1712(class194.field2930);
        if (arg0 >= -48) {
            field8282 = null;
        }
        field8273++;
        class681.field9513.method1730(0, 0, (int) arg1);
        class45.field585.method481(class681.field9513);
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(IIIII)V")
    public static final void method3418(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field8283++;
        class127 var5 = class760.method4231(arg3, arg4 - 874773694, 10);
        var5.method1010(arg4 ^ 0xFFFFB7B8);
        var5.field2097 = arg0;
        var5.field2099 = arg1;
        if (arg4 != -18978) {
            field8282 = null;
        }
        var5.field2092 = arg2;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(B)V")
    public static void method3419(byte arg0) {
        if (arg0 != -19) {
            field8282 = null;
        }
        field8282 = null;
    }

    @OriginalMember(owner = "client!kia", name = "a", descriptor = "(III)Z")
    public final boolean method3420(int arg0, int arg1, int arg2) {
        field8284++;
        if (arg2 <= 18) {
            return false;
        } else if (this.field8270 <= arg0 && arg0 <= this.field8274 && arg1 >= this.field8271 && this.field8277 >= arg1) {
            return true;
        } else {
            return this.field8279 <= arg0 && this.field8278 >= arg0 && arg1 >= this.field8272 && this.field8281 >= arg1;
        }
    }

    @OriginalMember(owner = "client!kia", name = "<init>", descriptor = "(Lpda;)V")
    public class621(class630 arg0) {
        this.field8275 = arg0;
    }
}
