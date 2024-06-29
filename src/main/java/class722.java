import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class722 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lmq;")
    public static class78 field10160 = new class78(7, 0);

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field10163 = 0;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field10162 = 64;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field10161;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IIII)V", line = 9)
    public static final void method3994(int arg0, int arg1, int arg2, int arg3) {
        class73 var4 = class495.field7002[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class149 var5 = var4.field964;
        class149 var6 = var4.field971;
        if (var5 != null) {
            var5.field1810 = (short) (var5.field1810 * arg3 / (0x10 << class455.field6383 - 7));
            var5.field1805 = (short) (var5.field1805 * arg3 / (0x10 << class455.field6383 - 7));
        }
        if (var6 != null) {
            var6.field1810 = (short) (var6.field1810 * arg3 / (0x10 << class455.field6383 - 7));
            var6.field1805 = (short) (var6.field1805 * arg3 / (0x10 << class455.field6383 - 7));
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Z)V", line = 35)
    public static void method3995(boolean arg0) {
        field10160 = null;
        if (arg0) {
            method3994(-10, 73, 83, 44);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 45)
    public static final void method3996(byte arg0) {
        field10161++;
        if (arg0 >= 102) {
            class662.field9075.method776((byte) -84);
        }
    }
}
