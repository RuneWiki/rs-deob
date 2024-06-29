import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class184 {

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public int field2775 = 1;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "C")
    public char field2773;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field2771;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Leh;Z)V")
    public final void method1217(class335 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2034(255);
            if (var3 == 0) {
                field2774++;
                if (!arg1) {
                    this.method1220((byte) 29, -70, null);
                    return;
                }
                return;
            }
            this.method1220((byte) -115, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZ)V")
    public static final void method1218(int arg0, boolean arg1) {
        field2771++;
        class382 var2 = class396.method2276(96, 11, arg0);
        if (!arg1) {
            method1218(-16, false);
        }
        var2.method2228((byte) -55);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V")
    public static final void method1219(int arg0, int arg1) {
        class24 var2 = class703.field9899[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class24 var4 = class703.field9899[var3][arg0][arg1] = class703.field9899[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field416--;
                for (class684 var5 = var4.field409; var5 != null; var5 = var5.field9618) {
                    class641 var6 = var5.field9619;
                    if (var6.field8611 == arg0 && var6.field8618 == arg1) {
                        var6.field8609--;
                    }
                }
            }
        }
        if (class703.field9899[0][arg0][arg1] == null) {
            class703.field9899[0][arg0][arg1] = new class24(0, arg0, arg1);
            class703.field9899[0][arg0][arg1].field402 = 1;
        }
        class703.field9899[0][arg0][arg1].field408 = var2;
        class703.field9899[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BILeh;)V")
    private final void method1220(byte arg0, int arg1, class335 arg2) {
        field2772++;
        if (arg1 == 1) {
            this.field2773 = class697.method3859(arg2.method2040(-118), false);
        } else if (arg1 == 2) {
            this.field2775 = 0;
        }
        if (arg0 > -36) {
            this.field2775 = -81;
        }
    }
}
