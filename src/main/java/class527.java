import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class527 extends class522 {

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    private int field7361;

    @OriginalMember(owner = "client!um", name = "k", descriptor = "I")
    private int field7352;

    @OriginalMember(owner = "client!um", name = "r", descriptor = "I")
    private int field7359;

    @OriginalMember(owner = "client!um", name = "q", descriptor = "I")
    private int field7358;

    @OriginalMember(owner = "client!um", name = "o", descriptor = "[Lic;")
    public static class701[] field7356 = new class701[14];

    @OriginalMember(owner = "client!um", name = "p", descriptor = "[Ljava/awt/Color;")
    public static Color[] field7357 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!um", name = "l", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!um", name = "m", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!um", name = "n", descriptor = "I")
    public static int field7355;

    @OriginalMember(owner = "client!um", name = "s", descriptor = "I")
    public static int field7360;

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIII)V")
    public class527(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field7361 = arg1;
        this.field7352 = arg2;
        this.field7359 = arg0;
        this.field7358 = arg3;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)V")
    public static void method3045(int arg0) {
        field7356 = null;
        field7357 = null;
        if (arg0 != 16777215) {
            method3046(50, -16, 8);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(III)V")
    public final void method1092(int arg0, int arg1, int arg2) {
        ++field7353;
        int var4 = this.field7359 * arg1 >> 12;
        if (arg2 == 2048) {
            int var5 = this.field7352 * arg1 >> 12;
            int var6 = this.field7361 * arg0 >> 12;
            int var7 = this.field7358 * arg0 >> 12;
            class575.method3297(super.field7318, var5, super.field7313, super.field7312, var7, var4, (byte) 85, var6);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(III)V")
    public final void method1093(int arg0, int arg1, int arg2) {
        ++field7355;
        if (arg1 != 1) {
            field7356 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZII)V")
    public final void method1094(boolean arg0, int arg1, int arg2) {
        ++field7360;
        int var4 = this.field7359 * arg2 >> 12;
        if (arg0) {
            this.method1094(true, 80, -101);
        }
        int var5 = this.field7352 * arg2 >> 12;
        int var6 = this.field7361 * arg1 >> 12;
        int var7 = this.field7358 * arg1 >> 12;
        class18.method125((byte) 27, var4, var5, super.field7312, var6, var7);
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(III)Lhe;")
    public static final class374 method3046(int arg0, int arg1, int arg2) {
        class14 var3 = class197.field2689[arg0][arg1][arg2];
        return var3 == null ? null : var3.field278;
    }
}
