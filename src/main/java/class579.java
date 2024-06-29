import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class579 {

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
    private static int field8381 = 0;

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "Z")
    private static boolean field8382 = false;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "Ltf;")
    private static class524 field8383 = new class524();

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Le;I)V", line = 4)
    public static final synchronized void method4297(class65 arg0, int arg1) {
        int var2 = -77 / ((arg1 - 67) / 59);
        if (field8382) {
            return;
        }
        if (field8381 <= 0) {
            arg0.method690(false);
        } else {
            class227 var3 = new class227();
            var3.field3290 = arg0;
            field8383.method3984(var3, 0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)V", line = 32)
    public static final synchronized void method4298(byte arg0) {
        field8381--;
        if (field8381 == 0) {
            method4300((byte) -105);
        }
        int var1 = -84 % ((arg0 + 68) / 48);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(I)V", line = 47)
    public static final synchronized void method4299(int arg0) {
        field8381++;
        if (arg0 != 0) {
            field8382 = true;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V", line = 61)
    public static final synchronized void method4300(byte arg0) {
        if (arg0 != -105) {
            method4301((byte) 11, true);
        }
        while (true) {
            class227 var1 = (class227) field8383.method3980(-27119);
            if (var1 == null) {
                return;
            }
            var1.field3290.method690(true);
            var1.method4294(0);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(BZ)V", line = 82)
    public static final synchronized void method4301(byte arg0, boolean arg1) {
        if (arg0 == -28) {
            field8382 = arg1;
        }
    }
}
