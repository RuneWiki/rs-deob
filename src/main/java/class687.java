import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class687 extends class461 {

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    private int field9653;

    @OriginalMember(owner = "client!pg", name = "o", descriptor = "I")
    private int field9658;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    private int field9649;

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "I")
    private int field9655;

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "Lcu;")
    public static class206 field9651 = new class206(16, 8);

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field9654 = 0;

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "F")
    public static float field9652;

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "I")
    public static int field9650;

    @OriginalMember(owner = "client!pg", name = "m", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!pg", name = "n", descriptor = "I")
    public static int field9657;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(III)V")
    public final void method703(int arg0, int arg1, int arg2) {
        if (arg1 > -88) {
            method3817(64);
        }
        ++field9657;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(BII)V")
    public final void method704(byte arg0, int arg1, int arg2) {
        ++field9650;
        if (arg0 <= 79) {
            this.method705(56, -103, (byte) -28);
        }
        int var4 = this.field9658 * arg1 >> 12;
        int var5 = this.field9649 * arg1 >> 12;
        int var6 = this.field9653 * arg2 >> 12;
        int var7 = this.field9655 * arg2 >> 12;
        class228.method1424(var6, var4, super.field6246, super.field6248, 54, var7, super.field6245, var5);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIB)V")
    public final void method705(int arg0, int arg1, byte arg2) {
        ++field9656;
        int var4 = this.field9658 * arg1 >> 12;
        int var5 = this.field9649 * arg1 >> 12;
        if (arg2 != -56) {
            this.field9653 = 28;
        }
        int var6 = this.field9653 * arg0 >> 12;
        int var7 = this.field9655 * arg0 >> 12;
        class42.method305(var4, var5, var7, super.field6246, var6, 834);
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(IIIIIII)V")
    public class687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field9653 = arg1;
        this.field9658 = arg0;
        this.field9649 = arg2;
        this.field9655 = arg3;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V")
    public static void method3817(int arg0) {
        field9651 = null;
        if (arg0 != -6776) {
            method3817(58);
        }
    }
}
