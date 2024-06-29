import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class35 extends class154 {

    @OriginalMember(owner = "client!rk", name = "l", descriptor = "I")
    public int field577;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client!rk", name = "p", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!rk", name = "n", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public int field588;

    @OriginalMember(owner = "client!rk", name = "t", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public int field592;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field576 = 0;

    @OriginalMember(owner = "client!rk", name = "q", descriptor = "I")
    public static int field582 = 0;

    @OriginalMember(owner = "client!rk", name = "m", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!rk", name = "o", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!rk", name = "r", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!rk", name = "s", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!rk", name = "u", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "I")
    public static int field591;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rk", name = "B", descriptor = "Ljava/lang/Class;")
    public static Class field593;

    @OriginalMember(owner = "client!rk", name = "v", descriptor = "Z")
    public static boolean field587;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII[I)V")
    public final void method203(byte arg0, int arg1, int arg2, int[] arg3) {
        field583++;
        arg3[0] = 0;
        int var5 = -8 / ((arg0 - 80) / 33);
        arg3[2] = this.field577 + arg2 - this.field581;
        arg3[1] = -this.field589 - (-this.field585 - arg1);
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II[II)V")
    public final void method204(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = this.field589 + arg0 - this.field585;
        arg2[arg1] = this.field575;
        field584++;
        arg2[2] = this.field581 + arg3 - this.field577;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IBII)Z")
    public final boolean method205(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 == -1) {
            field590++;
            return this.field575 == arg3 && this.field589 <= arg0 && arg0 <= this.field579 && arg2 >= this.field581 && this.field574 >= arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(III)Z")
    public static final boolean method206(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            field586++;
            return (class715.method3982(arg2, (byte) -125, arg1) | class629.method3534(arg1, (byte) -124, arg2) | class402.method2405(arg1, arg2, 53)) & class301.method1933(arg2, (byte) 123, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BII)Z")
    public final boolean method207(byte arg0, int arg1, int arg2) {
        field578++;
        if (arg0 != 58) {
            this.field589 = 112;
        }
        return arg1 >= this.field585 && arg1 <= this.field588 && this.field577 <= arg2 && this.field592 >= arg2;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public static final boolean method208(byte arg0, String arg1) {
        int var2 = 92 % ((arg0 + 3) / 33);
        field591++;
        return class559.method3244(-1, arg1, field593 == null ? (field593 = method210("w")) : field593);
    }

    @OriginalMember(owner = "client!rk", name = "<init>", descriptor = "(IIIIIIIII)V")
    public class35(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field577 = arg6;
        this.field589 = arg1;
        this.field574 = arg4;
        this.field581 = arg2;
        this.field579 = arg3;
        this.field588 = arg7;
        this.field585 = arg5;
        this.field575 = arg0;
        this.field592 = arg8;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(III)Z")
    public final boolean method209(int arg0, int arg1, int arg2) {
        field580++;
        if (arg2 >= -114) {
            return false;
        } else {
            return this.field589 <= arg0 && this.field579 >= arg0 && arg1 >= this.field581 && this.field574 >= arg1;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method210(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
