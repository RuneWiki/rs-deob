import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class693 extends class173 {

    @OriginalMember(owner = "client!fn", name = "p", descriptor = "I")
    private int field9676;

    @OriginalMember(owner = "client!fn", name = "n", descriptor = "Lpq;")
    private class194 field9674;

    @OriginalMember(owner = "client!fn", name = "i", descriptor = "I")
    private int field9669;

    @OriginalMember(owner = "client!fn", name = "t", descriptor = "I")
    private int field9680;

    @OriginalMember(owner = "client!fn", name = "l", descriptor = "I")
    private int field9672;

    @OriginalMember(owner = "client!fn", name = "r", descriptor = "I")
    private int field9678;

    @OriginalMember(owner = "client!fn", name = "q", descriptor = "I")
    private int field9677;

    @OriginalMember(owner = "client!fn", name = "k", descriptor = "I")
    public static int field9671;

    @OriginalMember(owner = "client!fn", name = "o", descriptor = "I")
    public static int field9675;

    @OriginalMember(owner = "client!fn", name = "j", descriptor = "Lae;")
    public static class283 field9670;

    @OriginalMember(owner = "client!fn", name = "s", descriptor = "Lae;")
    public static class283 field9679;

    @OriginalMember(owner = "client!fn", name = "m", descriptor = "Ljka;")
    private class734 field9673;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)Ljka;")
    public final class734 method1105(int arg0) {
        field9675++;
        if (arg0 != -1) {
            return null;
        }
        if (this.field9673 == null) {
            class300.field4364[0] = this.field9678;
            class101 var2 = this.field9674.field6556;
            class300.field4364[1] = this.field9676;
            class300.field4364[2] = this.field9677;
            class300.field4364[5] = this.field9672;
            class300.field4364[4] = this.field9669;
            class300.field4364[3] = this.field9680;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method583(12101, class300.field4364[var5])) {
                    return null;
                }
                class744 var7 = var2.method581(arg0 - 21731, class300.field4364[var5]);
                int var8 = var7.field10265 ? 64 : 128;
                if (var7.field10270 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class483.field6692[var6] = var2.method578(var4, false, class300.field4364[var6], 1.0F, true, var4);
            }
            this.field9673 = new class734(this.field9674, 6407, var4, var3, class483.field6692);
        }
        return this.field9673;
    }

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "(I)V")
    public static void method3927(int arg0) {
        field9679 = null;
        if (arg0 != -2193) {
            field9679 = null;
        }
        field9670 = null;
    }

    @OriginalMember(owner = "client!fn", name = "<init>", descriptor = "(Lpq;IIIIII)V")
    public class693(class194 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field9676 = arg2;
        this.field9674 = arg0;
        this.field9669 = arg5;
        this.field9680 = arg4;
        this.field9672 = arg6;
        this.field9678 = arg1;
        this.field9677 = arg3;
    }
}
