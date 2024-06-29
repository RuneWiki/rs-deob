import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class195 extends class282 {

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    private int field2648;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
    private int field2642;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    private int field2634;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    private int field2632;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    public static int field2636 = 1;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "Lmc;")
    public static class78 field2644 = new class78(60, -1);

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "F")
    public static float field2646;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field2631;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "I")
    private int field2633;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    private int field2639;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
    private int field2641;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "I")
    public static int field2643;

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    private int field2647;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "[B")
    private byte[] field2637;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
    public static void method1113(int arg0) {
        if (arg0 == 4096) {
            field2644 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V")
    public final void method1114(boolean arg0) {
        this.field2647 >>= 0x4;
        field2631++;
        this.field2632 = this.field2634;
        if (arg0) {
            this.field2637 = null;
        }
        if (this.field2647 < 0) {
            this.field2647 = 0;
        } else if (this.field2647 > 255) {
            this.field2647 = 255;
        }
        this.method1117(this.field2641++, (byte) this.field2647);
        this.field2647 = 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public final void method1115(int arg0) {
        field2643++;
        this.field2647 = 0;
        this.field2641 = 0;
        int var2 = -81 % ((arg0 + 63) / 36);
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class195(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2648 = (int) (arg7 * 4096.0F);
        this.field2642 = (int) (arg6 * 4096.0F);
        this.field2632 = this.field2634 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(III)V")
    public final void method1116(int arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field2633 = this.field2642 - (arg2 >= 0 ? arg2 : -arg2);
            this.field2633 = this.field2633 * this.field2633 >> 12;
            this.field2639 = 4096;
            this.field2647 = this.field2633;
        } else {
            this.field2639 = this.field2648 * this.field2633 >> 12;
            this.field2633 = this.field2642 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field2639 < 0) {
                this.field2639 = 0;
            } else if (this.field2639 > 4096) {
                this.field2639 = 4096;
            }
            this.field2633 = this.field2633 * this.field2633 >> 12;
            this.field2633 = this.field2639 * this.field2633 >> 12;
            this.field2647 += this.field2633 * this.field2632 >> 12;
            this.field2632 = this.field2634 * this.field2632 >> 12;
        }
        field2645++;
        if (arg0 <= 31) {
            this.method1116(8, -87, 2);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IB)V")
    public void method1117(int arg0, byte arg1) {
        field2640++;
        this.field2637[arg0] = arg1;
    }
}
