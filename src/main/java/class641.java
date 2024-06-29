import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class641 extends class454 {

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public int field9022 = 0;

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "[Lhga;")
    public static class197[] field9024 = new class197[37];

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field9020;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field9021;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    public static int field9023;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "I")
    public static int field9025;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(ZLol;)V", line = 6)
    public final void method3636(boolean arg0, class431 arg1) {
        while (true) {
            int var3 = arg1.method2557(14929);
            if (var3 == 0) {
                field9025++;
                if (!arg0) {
                    method3637((byte) -54, -60);
                    return;
                }
                return;
            }
            this.method3638((byte) -111, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(BI)V", line = 36)
    public static final void method3637(byte arg0, int arg1) {
        field9020++;
        class371 var2 = class490.method2867((byte) -46, 2, (long) arg1);
        if (arg0 == -25) {
            var2.method2215(4);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLol;I)V", line = 50)
    private final void method3638(byte arg0, class431 arg1, int arg2) {
        if (arg2 == 2) {
            this.field9022 = arg1.method2565((byte) -111);
        }
        if (arg0 >= -4) {
            field9024 = null;
        }
        field9021++;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 66)
    public static void method3639(int arg0) {
        if (arg0 < 20) {
            field9023 = -66;
        }
        field9024 = null;
    }
}
