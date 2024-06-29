import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class282 extends class270 {

    @OriginalMember(owner = "client!aj", name = "G", descriptor = "I")
    public int field3584 = 0;

    @OriginalMember(owner = "client!aj", name = "v", descriptor = "I")
    public static int field3573 = 0;

    @OriginalMember(owner = "client!aj", name = "D", descriptor = "Lkfa;")
    public static class549 field3581 = new class549(62, -1);

    @OriginalMember(owner = "client!aj", name = "P", descriptor = "Z")
    public static boolean field3593 = false;

    @OriginalMember(owner = "client!aj", name = "n", descriptor = "I")
    public int field3565;

    @OriginalMember(owner = "client!aj", name = "o", descriptor = "I")
    public int field3566;

    @OriginalMember(owner = "client!aj", name = "p", descriptor = "I")
    public int field3567;

    @OriginalMember(owner = "client!aj", name = "r", descriptor = "I")
    public int field3569;

    @OriginalMember(owner = "client!aj", name = "t", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!aj", name = "y", descriptor = "I")
    public int field3576;

    @OriginalMember(owner = "client!aj", name = "E", descriptor = "I")
    public int field3582;

    @OriginalMember(owner = "client!aj", name = "F", descriptor = "I")
    public int field3583;

    @OriginalMember(owner = "client!aj", name = "H", descriptor = "I")
    public int field3585;

    @OriginalMember(owner = "client!aj", name = "J", descriptor = "I")
    public int field3587;

    @OriginalMember(owner = "client!aj", name = "K", descriptor = "I")
    public int field3588;

    @OriginalMember(owner = "client!aj", name = "L", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!aj", name = "N", descriptor = "I")
    public int field3591;

    @OriginalMember(owner = "client!aj", name = "z", descriptor = "Lgg;")
    public class159 field3577;

    @OriginalMember(owner = "client!aj", name = "I", descriptor = "Lgg;")
    public class159 field3586;

    @OriginalMember(owner = "client!aj", name = "u", descriptor = "Lofa;")
    public class297 field3572;

    @OriginalMember(owner = "client!aj", name = "C", descriptor = "Lofa;")
    public class297 field3580;

    @OriginalMember(owner = "client!aj", name = "w", descriptor = "Lwb;")
    public class298 field3574;

    @OriginalMember(owner = "client!aj", name = "x", descriptor = "Lwb;")
    public class298 field3575;

    @OriginalMember(owner = "client!aj", name = "m", descriptor = "Lbfa;")
    public class335 field3564;

    @OriginalMember(owner = "client!aj", name = "O", descriptor = "Lpi;")
    public class455 field3592;

    @OriginalMember(owner = "client!aj", name = "Q", descriptor = "Lxa;")
    public static class458 field3594;

    @OriginalMember(owner = "client!aj", name = "s", descriptor = "Lag;")
    public class625 field3570;

    @OriginalMember(owner = "client!aj", name = "q", descriptor = "Z")
    public boolean field3568;

    @OriginalMember(owner = "client!aj", name = "A", descriptor = "Z")
    public boolean field3578;

    @OriginalMember(owner = "client!aj", name = "B", descriptor = "Z")
    public boolean field3579;

    @OriginalMember(owner = "client!aj", name = "M", descriptor = "[I")
    public int[] field3590;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)I")
    public static final int method1611(int arg0, int arg1) {
        field3589++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        }
        int var2 = 124 / ((arg0 - 18) / 43);
        if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Z)V")
    public static void method1612(boolean arg0) {
        field3581 = null;
        if (arg0) {
            method1612(true);
        }
        field3594 = null;
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(Z)V")
    public final void method1613(boolean arg0) {
        field3571++;
        int var2 = this.field3591;
        boolean var3 = this.field3568;
        if (!arg0) {
            this.field3587 = -117;
        }
        if (this.field3564 != null) {
            class335 var6 = this.field3564.method1889(1, class491.field7127);
            if (var6 == null) {
                this.field3568 = false;
                this.field3576 = 0;
                this.field3567 = 0;
                this.field3578 = false;
                this.field3591 = -1;
                this.field3566 = 0;
                this.field3569 = 0;
                this.field3590 = null;
            } else {
                this.field3590 = var6.field4353;
                this.field3568 = var6.field4338;
                this.field3576 = var6.field4405;
                this.field3567 = var6.field4369;
                this.field3578 = var6.field4339;
                this.field3566 = var6.field4351;
                this.field3591 = var6.field4356;
                this.field3569 = var6.field4377 << 9;
            }
        } else if (this.field3570 != null) {
            int var4 = class59.method401(this.field3570, 39);
            if (var2 != var4) {
                this.field3591 = var4;
                class23 var5 = this.field3570.field8855;
                if (var5.field229 != null) {
                    var5 = var5.method108(0, class491.field7127);
                }
                if (var5 == null) {
                    this.field3568 = this.field3570.field8855.field276;
                    this.field3567 = this.field3569 = 0;
                } else {
                    this.field3569 = var5.field207 << 9;
                    this.field3567 = var5.field214;
                    this.field3568 = var5.field276;
                }
            }
        } else if (this.field3592 != null) {
            this.field3591 = class351.method1949(this.field3592, 25758);
            this.field3569 = this.field3592.field6302 << 9;
            this.field3568 = this.field3592.field6304;
            this.field3567 = this.field3592.field6299;
        }
        if (this.field3591 == var2 && this.field3568 == var3) {
            return;
        }
        if (this.field3577 == null) {
            return;
        }
        class424.field5641.method2852(this.field3577);
        this.field3572 = null;
        this.field3575 = null;
        this.field3577 = null;
    }
}
