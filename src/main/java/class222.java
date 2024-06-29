import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class222 extends class35 {

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "I")
    public static int field3512 = 0;

    @OriginalMember(owner = "client!gh", name = "t", descriptor = "Lsl;")
    public static class39 field3516 = new class39(512);

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "I")
    public int field3511;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "I")
    public int field3514;

    @OriginalMember(owner = "client!gh", name = "s", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!gh", name = "u", descriptor = "Ltc;")
    public static class234 field3517;

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "(I)V", line = 6)
    public static void method1476(int arg0) {
        if (arg0 != 65535) {
            field3516 = (class39) null;
        }
        field3517 = null;
        field3516 = null;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(ILag;)V", line = 26)
    public static final void method1477(int arg0, class202 arg1) {
        field3513++;
        int var2 = 0;
        if (arg0 != -1) {
            return;
        }
        while (class77.field1540 > var2) {
            int var3 = arg1.method1296((byte) 91);
            int var4 = arg1.method1315(14289);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class202.field3294[var3] != null) {
                class202.field3294[var3].field3350 = var4;
            }
            var2++;
        }
    }
}
