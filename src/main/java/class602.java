import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class602 extends class272 {

    @OriginalMember(owner = "client!bl", name = "I", descriptor = "I")
    public int field8564;

    @OriginalMember(owner = "client!bl", name = "H", descriptor = "Lpca;")
    public static class665 field8563 = null;

    @OriginalMember(owner = "client!bl", name = "F", descriptor = "Lhga;")
    public static class158 field8561 = new class158(13, -2);

    @OriginalMember(owner = "client!bl", name = "J", descriptor = "Lrl;")
    public static class672 field8565 = new class672(32, 7);

    @OriginalMember(owner = "client!bl", name = "G", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!bl", name = "K", descriptor = "I")
    public static int field8566;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)Leu;")
    public final class444 method1247(int arg0) {
        field8562++;
        if (arg0 != 3848) {
            method3512(-110, false, 124, 38, -25, -25, -106);
        }
        return class683.field9584;
    }

    @OriginalMember(owner = "client!bl", name = "<init>", descriptor = "(Lja;Lmea;IIIIIIIIIIIIII)V")
    public class602(class254 arg0, class395 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field8564 = arg15;
    }

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "(I)V")
    public static void method3511(int arg0) {
        field8563 = null;
        field8565 = null;
        if (arg0 != 512) {
            field8561 = null;
        }
        field8561 = null;
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(IZIIIII)V")
    public static final void method3512(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field8566++;
        class101.field1681 = arg0;
        class167.field2815 = arg4;
        class31.field455 = arg2;
        class180.field3035 = arg5;
        class319.field5005 = arg6;
        if (arg3 != -19139) {
            return;
        }
        if (arg1 && class319.field5005 >= 100) {
            class412.field6318 = class31.field455 * 512 + 256;
            class675.field9521 = class101.field1681 * 512 + 256;
            class607.field8638 = class202.method1568(class675.field9521, class423.field6439, class412.field6318, 2) - class167.field2815;
        }
        class81.field1005 = -1;
        class664.field9243 = -1;
        class126.field2062 = 2;
    }
}
