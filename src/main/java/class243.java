import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class243 {

    @OriginalMember(owner = "client!nc", name = "o", descriptor = "J")
    public long field3539 = 0L;

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "[Lwl;")
    public static class287[] field3528 = new class287[8];

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "[Li;")
    public static class113[] field3531 = new class113[4];

    @OriginalMember(owner = "client!nc", name = "t", descriptor = "Lrc;")
    public static class9 field3544 = new class9(4);

    @OriginalMember(owner = "client!nc", name = "u", descriptor = "Ljava/lang/String;")
    public static String field3545 = "";

    @OriginalMember(owner = "client!nc", name = "x", descriptor = "[I")
    public static int[] field3548 = new int[50];

    @OriginalMember(owner = "client!nc", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3549 = "Opened title screen";

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "I")
    public int field3525;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public int field3527;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public int field3530;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public int field3532;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "I")
    public int field3533;

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "I")
    public int field3534;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field3537;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public int field3538;

    @OriginalMember(owner = "client!nc", name = "p", descriptor = "I")
    public int field3540;

    @OriginalMember(owner = "client!nc", name = "q", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!nc", name = "r", descriptor = "I")
    public int field3542;

    @OriginalMember(owner = "client!nc", name = "s", descriptor = "I")
    public int field3543;

    @OriginalMember(owner = "client!nc", name = "v", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!nc", name = "w", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Lca;")
    public class131 field3526;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IBIIIZ)V")
    public static final void method1580(int arg0, byte arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg3 < 1) {
            arg3 = 1;
        }
        class292.field4623 = (short) arg3;
        field3535++;
        if (arg1 >= 90) {
            if (arg0 < 1) {
                arg0 = 1;
            }
            class181.field2584 = (short) arg0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
    public static void method1581(int arg0) {
        if (arg0 != 4) {
            field3531 = null;
        }
        field3545 = null;
        field3528 = null;
        field3548 = null;
        field3549 = null;
        field3531 = null;
        field3544 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()V")
    public static final void method1582() {
        for (int var0 = 0; var0 < class200.field2845; var0++) {
            class243 var1 = class293.field4632[var0];
            class133.method869(var1);
            class293.field4632[var0] = null;
        }
        class200.field2845 = 0;
    }
}
