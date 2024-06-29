import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class400 extends class50 {

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "[I")
    public static int[] field6024 = new int[1];

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "I")
    public static int field6023;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field6025;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public static int field6028;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public static int field6029;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "Laj;")
    public class400 field6020;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "Laj;")
    public class400 field6027;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "[I")
    public static int[] field6021;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "[I")
    public static int[] field6022;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "[I")
    public static int[] field6026;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(II)Z", line = 17)
    public static final boolean method2480(int arg0, int arg1) {
        field6023++;
        if (arg0 != -18) {
            method2482(-44);
        }
        return arg1 >= 12 && arg1 <= 17;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V", line = 28)
    public final void method2481(int arg0) {
        field6028++;
        if (this.field6027 == null) {
            return;
        }
        this.field6027.field6020 = this.field6020;
        if (arg0 != 1) {
            method2480(-4, -97);
        }
        this.field6020.field6027 = this.field6027;
        this.field6020 = null;
        this.field6027 = null;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(I)V", line = 48)
    public static void method2482(int arg0) {
        if (arg0 == -18) {
            field6022 = null;
            field6021 = null;
            field6024 = null;
            field6026 = null;
        }
    }
}
