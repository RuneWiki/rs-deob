import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class757 {

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    public static int field10532 = 0;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field10528;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public int field10529;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public int field10531;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field10533;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "[Lhaa;")
    public class81[] field10530;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLee;)V")
    public final void method4222(byte arg0, class677 arg1) {
        field10533++;
        this.field10529 = arg1.method3833(255);
        this.field10531 = arg1.method3807(-1);
        this.field10530 = new class81[arg1.method3821((byte) 112)];
        class419[] var3 = class383.method2261(false);
        int var4 = 0;
        if (arg0 != -29) {
            this.field10531 = -94;
        }
        while (var4 < this.field10530.length) {
            this.field10530[var4] = this.method4223(0, arg1, var3[arg1.method3821((byte) -62)]);
            var4++;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILee;Lmha;)Lhaa;")
    private final class81 method4223(int arg0, class677 arg1, class419 arg2) {
        field10528++;
        if (class126.field2080 == arg2) {
            return class531.method2962(arg1, false);
        } else if (class294.field4215 == arg2) {
            return class741.method4128((byte) 51, arg1);
        } else if (class85.field1027 == arg2) {
            return class535.method2971(arg1, -108);
        } else if (class277.field3866 == arg2) {
            return class163.method1172((byte) 76, arg1);
        } else if (class654.field8672 == arg2) {
            return class296.method1829((byte) 53, arg1);
        } else if (class555.field7295 == arg2) {
            return class705.method3967((byte) 72, arg1);
        } else if (class257.field3523 == arg2) {
            return class556.method3090(arg1, true);
        } else {
            if (arg0 != 0) {
                this.method4223(-94, null, null);
            }
            if (class21.field390 == arg2) {
                return class348.method2088(arg1, 8916);
            } else if (class546.field7216 == arg2) {
                return class303.method1850(arg1, (byte) -37);
            } else if (class565.field7433 == arg2) {
                return class58.method386(arg1, 28053);
            } else {
                return null;
            }
        }
    }
}
