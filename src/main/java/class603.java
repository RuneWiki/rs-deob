import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!caa")
public class class603 {

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "I")
    public int field8560 = 0;

    @OriginalMember(owner = "client!caa", name = "d", descriptor = "I")
    public int field8563 = 2048;

    @OriginalMember(owner = "client!caa", name = "f", descriptor = "I")
    public int field8565 = 2048;

    @OriginalMember(owner = "client!caa", name = "e", descriptor = "I")
    public int field8564 = 0;

    @OriginalMember(owner = "client!caa", name = "h", descriptor = "I")
    public static int field8567 = 0;

    @OriginalMember(owner = "client!caa", name = "g", descriptor = "Lsv;")
    public static class570 field8566 = new class570(12, 7);

    @OriginalMember(owner = "client!caa", name = "b", descriptor = "I")
    public static int field8561;

    @OriginalMember(owner = "client!caa", name = "c", descriptor = "I")
    public static int field8562;

    @OriginalMember(owner = "client!caa", name = "i", descriptor = "I")
    public static int field8568;

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(ILol;Z)V", line = 3)
    private final void method3499(int arg0, class431 arg1, boolean arg2) {
        field8568++;
        if (arg2) {
            method3500((byte) -100);
        }
        if (arg0 == 1) {
            this.field8560 = arg1.method2557(14929);
        } else if (arg0 == 2) {
            this.field8563 = arg1.method2565((byte) -93);
        } else if (arg0 == 3) {
            this.field8565 = arg1.method2565((byte) -105);
        } else if (arg0 == 4) {
            this.field8564 = arg1.method2528((byte) 89);
            return;
        }
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(B)I", line = 35)
    public static final int method3500(byte arg0) {
        int var1 = -116 % ((arg0 + 10) / 50);
        field8562++;
        return class140.field2301;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(I)V", line = 59)
    public static void method3501(int arg0) {
        if (arg0 != 23277) {
            method3501(-109);
        }
        field8566 = null;
    }

    @OriginalMember(owner = "client!caa", name = "a", descriptor = "(Lol;I)V", line = 81)
    public final void method3502(class431 arg0, int arg1) {
        if (arg1 != 0) {
            method3501(-29);
        }
        field8561++;
        while (true) {
            int var3 = arg0.method2557(arg1 ^ 0x3A51);
            if (var3 == 0) {
                return;
            }
            this.method3499(var3, arg0, false);
        }
    }
}
