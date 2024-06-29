import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class203 extends class67 {

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "I")
    private final int field3624;

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "I")
    private final int field3620;

    @OriginalMember(owner = "client!fi", name = "z", descriptor = "I")
    private final int field3628;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "I")
    private final int field3622;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Le;")
    public static class191 field3618 = class54.method368("not yet implemented", 2047);

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "Le;")
    public static class191 field3623 = class54.method368("Benutzen", 2047);

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "Le;")
    public static class191 field3621 = class54.method368("gleiten:", 2047);

    @OriginalMember(owner = "client!fi", name = "x", descriptor = "Le;")
    public static class191 field3626 = class54.method368("Nehmen", 2047);

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field3616;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!fi", name = "y", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(IIIIIII)V")
    public class203(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3624 = arg2;
        this.field3620 = arg1;
        this.field3628 = arg3;
        this.field3622 = arg0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V")
    public final void method441(int arg0, int arg1, int arg2) {
        ++field3625;
        int var4 = this.field3622 * arg2 >> 12;
        if (arg0 != 32) {
            field3618 = null;
        }
        int var5 = this.field3624 * arg2 >> 12;
        int var6 = this.field3620 * arg1 >> 12;
        int var7 = this.field3628 * arg1 >> 12;
        class185.method1253(var6, var4, super.field1172, var7, (byte) 78, var5);
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V")
    public static void method1413(int arg0) {
        field3626 = null;
        field3618 = null;
        field3623 = null;
        if (arg0 != 668647052) {
            method1413(-102);
        }
        field3621 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IBI)V")
    public final void method443(int arg0, byte arg1, int arg2) {
        int var4 = this.field3622 * arg2 >> 12;
        ++field3619;
        if (arg1 >= -51) {
            this.method441(2, -56, -76);
        }
        int var5 = this.field3624 * arg2 >> 12;
        int var6 = this.field3628 * arg0 >> 12;
        int var7 = this.field3620 * arg0 >> 12;
        class162.method1102(super.field1172, var5, var4, var6, super.field1165, (byte) -101, var7, super.field1161);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(Lji;I)Le;")
    public static final class191 method1414(class225 arg0, int arg1) {
        if (arg1 != 32767) {
            field3621 = null;
        }
        ++field3616;
        return class17.method132(arg0, 32767, true);
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIB)V")
    public final void method446(int arg0, int arg1, byte arg2) {
        if (arg2 > -40) {
            field3626 = null;
        }
        ++field3627;
    }
}
