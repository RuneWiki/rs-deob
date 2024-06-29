import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class536 extends class513 {

    @OriginalMember(owner = "client!mq", name = "x", descriptor = "Las;")
    public class164 field7289;

    @OriginalMember(owner = "client!mq", name = "w", descriptor = "Lfja;")
    public static class783 field7288 = new class783(69, 0);

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "Lfja;")
    public static class783 field7290 = new class783(38, -1);

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "Ljia;")
    public static class645 field7294 = new class645();

    @OriginalMember(owner = "client!mq", name = "v", descriptor = "F")
    public static float field7287;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    public static int field7291;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    public static int field7293;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IILnf;Laa;BIILkh;)V")
    public static final void method3036(int arg0, int arg1, class604 arg2, class514 arg3, byte arg4, int arg5, int arg6, class17 arg7) {
        field7293++;
        if (arg2 == null) {
            return;
        }
        int var8;
        if (field7291 == 4) {
            var8 = (int) class53.field763 & 0x3FFF;
        } else {
            var8 = (int) class53.field763 + class408.field5599 & 0x3FFF;
        }
        int var9 = Math.max(arg7.field347 / 2, arg7.field330 / 2) + 10;
        int var10 = arg6 * arg6 + (arg0 * arg0);
        if ((var9 * var9) < var10) {
            return;
        }
        int var11 = class191.field2937[var8];
        int var12 = class191.field2936[var8];
        if (field7291 != 4) {
            var12 = var12 * 256 / (class301.field4140 + 256);
            var11 = var11 * 256 / (class301.field4140 + 256);
        }
        if (arg4 != 70) {
            field7287 = 0.020893028F;
        }
        int var13 = arg0 * var11 + arg6 * var12 >> 14;
        int var14 = arg0 * var12 - (arg6 * var11) >> 14;
        arg2.method211(arg1 - (-(arg7.field347 / 2) - var13) - arg2.method224() / 2, arg7.field330 / 2 + -var14 + arg5 + -(arg2.method218() / 2), arg3, arg1, arg5);
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(Las;)V")
    public class536(class164 arg0) {
        this.field7289 = arg0;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public static void method3037(int arg0) {
        field7290 = null;
        if (arg0 < 10) {
            field7291 = -18;
        }
        field7288 = null;
        field7294 = null;
    }
}
