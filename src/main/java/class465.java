import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class465 extends class222 {

    @OriginalMember(owner = "client!qp", name = "s", descriptor = "I")
    private int field6830;

    @OriginalMember(owner = "client!qp", name = "w", descriptor = "I")
    private int field6834;

    @OriginalMember(owner = "client!qp", name = "r", descriptor = "I")
    private int field6829;

    @OriginalMember(owner = "client!qp", name = "q", descriptor = "I")
    private int field6828;

    @OriginalMember(owner = "client!qp", name = "v", descriptor = "[I")
    public static int[] field6833 = new int[13];

    @OriginalMember(owner = "client!qp", name = "x", descriptor = "Llh;")
    public static class364 field6835 = new class364(50);

    @OriginalMember(owner = "client!qp", name = "B", descriptor = "Lao;")
    public static class188 field6839 = new class188(40, -2);

    @OriginalMember(owner = "client!qp", name = "t", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!qp", name = "u", descriptor = "I")
    public static int field6832;

    @OriginalMember(owner = "client!qp", name = "y", descriptor = "I")
    public static int field6836;

    @OriginalMember(owner = "client!qp", name = "z", descriptor = "I")
    public static int field6837;

    @OriginalMember(owner = "client!qp", name = "A", descriptor = "I")
    public static int field6838;

    @OriginalMember(owner = "client!qp", name = "C", descriptor = "I")
    public static int field6840;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(IIZ)V")
    public final void method48(int arg0, int arg1, boolean arg2) {
        ++field6831;
        int var4 = this.field6828 * arg0 >> 12;
        int var5 = this.field6830 * arg0 >> 12;
        int var6 = this.field6834 * arg1 >> 12;
        if (!arg2) {
            this.field6834 = -49;
        }
        int var7 = this.field6829 * arg1 >> 12;
        class279.method1771(super.field3210, var5, var6, super.field3216, var4, 27098, var7);
    }

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "(III)Z")
    public static final boolean method2774(int arg0, int arg1, int arg2) {
        if (arg0 != 5966) {
            field6833 = null;
        }
        ++field6838;
        return (arg1 & 2048) != 0;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(Z)V")
    public static void method2775(boolean arg0) {
        field6839 = null;
        if (arg0) {
            field6833 = null;
            field6835 = null;
        }
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(III)V")
    public final void method44(int arg0, int arg1, int arg2) {
        ++field6832;
        int var4 = this.field6828 * arg2 >> 12;
        int var5 = this.field6830 * arg2 >> 12;
        int var6 = this.field6834 * arg0 >> 12;
        int var7 = this.field6829 * arg0 >> 12;
        class490.method2935(arg1 ^ arg1, var6, var4, var7, super.field3207, var5);
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(IIIIIII)V")
    public class465(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field6830 = arg2;
        this.field6834 = arg1;
        this.field6829 = arg3;
        this.field6828 = arg0;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
    public final void method51(int arg0, int arg1, int arg2) {
        ++field6837;
        int var4 = this.field6828 * arg0 >> 12;
        int var5 = this.field6830 * arg0 >> 12;
        int var6 = this.field6834 * arg1 >> 12;
        int var7 = this.field6829 * arg1 >> 12;
        class518.method3060(var4, (byte) -85, var7, super.field3210, super.field3207, var6, super.field3216, var5);
        if (arg2 >= -20) {
            this.method44(47, 81, -112);
        }
    }
}
