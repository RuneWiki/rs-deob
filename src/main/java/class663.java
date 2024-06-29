import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class663 extends class504 {

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "[I")
    public static int[] field8651 = new int[1];

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public static int field8658 = -60;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "B")
    private byte field8656;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "B")
    private byte field8657;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field8650;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field8652;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public static int field8653;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Ljava/lang/String;")
    private String field8649;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V", line = 8)
    public static final void method3609(int arg0, int arg1) {
        field8652++;
        class614 var2 = class497.method2759(8, 5977, (long) arg0);
        var2.method3279(false);
        if (arg1 != -2302) {
            field8651 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILmc;)V", line = 24)
    public final void method1006(int arg0, class234 arg1) {
        this.field8649 = arg1.method1508(8);
        field8655++;
        if (this.field8649 != null) {
            arg1.method1509(true);
            this.field8656 = arg1.method1554(arg0 ^ 0x6845);
            this.field8657 = arg1.method1554(27806);
        }
        if (arg0 != 1243) {
            this.method1006(-94, null);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lqc;Z)V", line = 45)
    public final void method1003(class400 arg0, boolean arg1) {
        arg0.field5299 = this.field8649;
        field8650++;
        if (this.field8649 != null) {
            arg0.field5289 = this.field8657;
            arg0.field5287 = this.field8656;
        }
        if (arg1) {
            field8651 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lwm;II)Lne;", line = 67)
    public static final class166 method3610(class30 arg0, int arg1, int arg2) {
        int var3 = -123 % ((-arg2 - 62) / 43);
        field8653++;
        byte[] var4 = arg0.method148((byte) 97, arg1);
        return var4 == null ? null : new class166(var4);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V", line = 85)
    public static void method3611(int arg0) {
        if (arg0 != -275995543) {
            field8658 = 91;
        }
        field8651 = null;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILjha;ILft;ILih;)V", line = 97)
    public static final void method3612(int arg0, int arg1, int arg2, class33 arg3, int arg4, class727 arg5, int arg6, class773 arg7) {
        field8654++;
        class53 var8 = new class53();
        var8.field679 = arg4;
        if (arg6 != 1588241065) {
            return;
        }
        var8.field683 = arg1 << 9;
        var8.field673 = arg2 << 9;
        if (arg7 != null) {
            var8.field668 = arg7;
            int var10 = arg7.field10466;
            int var11 = arg7.field10484;
            if (arg0 == 1 || arg0 == 3) {
                var11 = arg7.field10466;
                var10 = arg7.field10484;
            }
            var8.field690 = arg7.field10491 << 9;
            var8.field692 = arg7.field10530;
            var8.field678 = arg7.field10514;
            var8.field669 = arg7.field10486;
            var8.field675 = arg7.field10483;
            var8.field680 = arg2 + var10 << 9;
            var8.field687 = arg7.field10455 << 9;
            var8.field694 = arg7.field10509;
            var8.field685 = arg7.field10471;
            var8.field698 = arg7.field10477;
            var8.field688 = arg7.field10472;
            var8.field671 = arg7.field10492;
            var8.field691 = arg1 + var11 << 9;
            if (arg7.field10536 != null) {
                var8.field696 = true;
                var8.method332((byte) 105);
            }
            if (var8.field685 != null) {
                var8.field699 = (int) ((double) (var8.field669 - var8.field671) * Math.random()) + var8.field671;
            }
            class409.field5429.method3593(var8, 15);
            return;
        }
        if (arg5 != null) {
            var8.field682 = arg5;
            class240 var9 = arg5.field9545;
            if (var9.field3289 != null) {
                var8.field696 = true;
                var9 = var9.method1585((byte) -100, class381.field4705);
            }
            if (var9 != null) {
                var8.field691 = arg1 + var9.field3314 << 9;
                var8.field680 = arg2 + var9.field3314 << 9;
                var8.field698 = class364.method2094(arg5, (byte) 91);
                var8.field688 = var9.field3297;
                var8.field690 = var9.field3248 << 9;
                var8.field694 = var9.field3286;
                var8.field675 = var9.field3251;
                var8.field687 = var9.field3276 << 9;
                var8.field678 = var9.field3252;
            }
            class418.field5515.method3593(var8, 15);
            return;
        }
        if (arg3 == null) {
            return;
        }
        var8.field695 = arg3;
        var8.field680 = arg2 + arg3.method190((byte) -50) << 9;
        var8.field691 = arg3.method190((byte) 69) + arg1 << 9;
        var8.field698 = class364.method2090(arg3, -16422);
        var8.field675 = arg3.field346;
        var8.field694 = 256;
        var8.field687 = 0;
        var8.field688 = 256;
        var8.field678 = arg3.field370;
        var8.field690 = arg3.field338 << 9;
        class548.field6848.method2619(var8, (long) arg3.field4737, -1);
        return;
    }
}
