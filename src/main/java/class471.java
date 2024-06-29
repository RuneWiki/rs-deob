import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class471 extends class235 {

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "I")
    private int field6570;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    private int field6560;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "I")
    private int field6564;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "I")
    private int field6562;

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    private int field6567;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "I")
    private int field6566;

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "Lpc;")
    private class700 field6561;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "I")
    public static int field6571 = 0;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "Lhj;")
    public static class596 field6563 = new class596(130, -2);

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "I")
    public static int field6572 = 0;

    @OriginalMember(owner = "client!pr", name = "y", descriptor = "Llja;")
    public static class744 field6573 = new class744(24, -1);

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "I")
    public static int field6568;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "Lhfa;")
    private class331 field6565;

    @OriginalMember(owner = "client!pr", name = "z", descriptor = "Z")
    public static boolean field6574;

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "[I")
    public static int[] field6569;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "(I)V")
    public static void method2814(int arg0) {
        field6563 = null;
        if (arg0 > -59) {
            field6573 = null;
        }
        field6569 = null;
        field6573 = null;
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(Lpc;IIIIII)V")
    public class471(class700 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field6570 = arg3;
        this.field6560 = arg2;
        this.field6564 = arg6;
        this.field6562 = arg4;
        this.field6567 = arg1;
        this.field6566 = arg5;
        this.field6561 = arg0;
    }

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "(I)Lhfa;")
    public final class331 method483(int arg0) {
        field6568++;
        if (arg0 != 0) {
            return null;
        }
        if (this.field6565 == null) {
            class63.field871[5] = this.field6564;
            class63.field871[0] = this.field6567;
            class162 var2 = this.field6561.field890;
            class63.field871[1] = this.field6560;
            class63.field871[2] = this.field6570;
            class63.field871[3] = this.field6562;
            class63.field871[4] = this.field6566;
            byte var3 = 0;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1137(12429, class63.field871[var5])) {
                    return null;
                }
                class359 var7 = var2.method1138(class63.field871[var5], 82);
                int var8 = var7.field4451 ? 64 : 128;
                if (var7.field4453 > 0) {
                    var3 = 1;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class454.field6400[var6] = var2.method1135(class63.field871[var6], 1.0F, false, var4, var4, (byte) -26);
            }
            this.field6565 = new class331(this.field6561, 6407, var4, var3 != 0, class454.field6400);
        }
        return this.field6565;
    }
}
