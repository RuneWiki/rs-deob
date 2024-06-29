import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class170 extends class119 {

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "Lai;")
    public static class10 field3282 = class44.method278("scrollen:", -82);

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Lai;")
    public static class10 field3289 = class44.method278("blinken3:", 115);

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field3285 = 0;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public static int field3294 = 0;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "I")
    public static int field3281 = 0;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "Ldb;")
    public static class32 field3287 = new class32(32);

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "J")
    public static long field3296 = 0L;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public int field3275;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public int field3276;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "I")
    public int field3279;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public int field3280;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "I")
    public int field3292;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public int field3293;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
    public int field3295;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "Leh;")
    public class47 field3283;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Lf;")
    public class48 field3277;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "Lf;")
    public class48 field3288;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "Lhf;")
    public static class71 field3274;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "[I")
    public int[] field3290;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V")
    public final void method1124(int arg0) {
        int var2 = this.field3284;
        class47 var3 = this.field3283.method299(false);
        field3286++;
        if (var3 == null) {
            this.field3278 = 0;
            this.field3290 = null;
            this.field3275 = 0;
            this.field3284 = -1;
            this.field3293 = 0;
        } else {
            this.field3293 = var3.field802 * 128;
            this.field3284 = var3.field771;
            this.field3290 = var3.field810;
            this.field3275 = var3.field829;
            this.field3278 = var3.field803;
        }
        int var4 = -54 / ((-arg0 - 75) / 41);
        if (this.field3284 != var2 && this.field3277 != null) {
            class122.field2344.method1253(this.field3277);
            this.field3277 = null;
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public static void method1125(int arg0) {
        field3289 = null;
        field3282 = null;
        if (arg0 == 26355) {
            field3274 = null;
            field3287 = null;
        }
    }
}
