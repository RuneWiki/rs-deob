import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class597 {

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public int field8524 = 0;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field8528 = 0;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field8526 = -1;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field8525;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field8527;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Lol;Z)V", line = 3)
    public final void method3482(class431 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2557(14929);
            if (var3 == 0) {
                if (arg1) {
                    field8528 = -32;
                }
                field8525++;
                return;
            }
            this.method3484((byte) -125, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZZLuf;)V", line = 24)
    public static final void method3483(boolean arg0, boolean arg1, class519 arg2) {
        field8522++;
        int var3 = arg2.field7126 == 0 ? arg2.field7128 : arg2.field7126;
        int var4 = arg2.field7161 == 0 ? arg2.field7255 : arg2.field7161;
        class460.method2689(arg2.field7247, arg1, var4, arg0, var3, class610.field8661[arg2.field7247 >> 16]);
        if (arg2.field7170 != null) {
            class460.method2689(arg2.field7247, arg1, var4, false, var3, arg2.field7170);
        }
        if (!arg0) {
            class27 var5 = (class27) class37.field437.method4253((long) arg2.field7247, -1);
            if (var5 != null) {
                class26.method223(var4, var3, arg1, (byte) 110, var5.field284);
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BILol;)V", line = 48)
    private final void method3484(byte arg0, int arg1, class431 arg2) {
        if (arg1 == 5) {
            this.field8524 = arg2.method2565((byte) -83);
        }
        field8527++;
        if (arg0 > -122) {
            field8528 = 62;
        }
    }
}
