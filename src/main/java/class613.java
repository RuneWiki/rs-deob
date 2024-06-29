import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class613 extends class602 {

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "I")
    private int field8326;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    private int field8328;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "I")
    private int field8329;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    private int field8327;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Lcga;")
    public static class449 field8331 = new class449(64, -1);

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "I")
    public static int field8338 = 0;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Ldr;")
    public static class675 field8339 = null;

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Ljd;")
    public static class216 field8335 = new class216(9, 2);

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "I")
    public static int field8330;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field8334;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "I")
    public static int field8340;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Lqea;")
    public static class117 field8337;

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "[I")
    public static int[] field8336;

    @OriginalMember(owner = "client!pb", name = "<init>", descriptor = "(IIIIIII)V")
    public class613(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field8326 = arg0;
        this.field8328 = arg2;
        this.field8329 = arg1;
        this.field8327 = arg3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IBI)V")
    public final void method803(int arg0, byte arg1, int arg2) {
        ++field8333;
        int var4 = this.field8326 * arg0 >> 12;
        int var5 = this.field8328 * arg0 >> 12;
        if (arg1 != 61) {
            method3430(-86, 84, -9);
        }
        int var6 = this.field8329 * arg2 >> 12;
        int var7 = this.field8327 * arg2 >> 12;
        class221.method1268(super.field8084, var7, super.field8083, var4, super.field8082, var6, var5, (byte) -117);
    }

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "(III)Lld;")
    public static final class158 method3430(int arg0, int arg1, int arg2) {
        ++field8332;
        class158 var3 = new class158();
        var3.field1870 = arg2 + 1 + arg0;
        var3.field1864 = -1;
        var3.field1863 = arg1 - -1 + 5;
        var3.field1872 = -1;
        var3.field1875 = new int[var3.field1863][var3.field1870];
        var3.method979(arg0 ^ 13289);
        return var3;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(III)V")
    public final void method807(int arg0, int arg1, int arg2) {
        if (arg2 != 5) {
            this.method803(87, (byte) -50, 81);
        }
        ++field8330;
        int var4 = this.field8326 * arg0 >> 12;
        int var5 = this.field8328 * arg0 >> 12;
        int var6 = this.field8329 * arg1 >> 12;
        int var7 = this.field8327 * arg1 >> 12;
        class677.method3746(-28431, var5, var6, var4, super.field8083, var7);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(ZII)V")
    public final void method805(boolean arg0, int arg1, int arg2) {
        ++field8334;
        if (arg0) {
            field8331 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method3431(int arg0) {
        if (arg0 == 897828300) {
            field8336 = null;
            field8331 = null;
            field8335 = null;
            field8339 = null;
            field8337 = null;
        }
    }
}
