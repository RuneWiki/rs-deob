import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class270 {

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "Ljn;")
    public static class134 field3903 = new class134(2, 4);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 3)
    public static void method1757(int arg0) {
        if (arg0 != 0) {
            field3902 = -108;
        }
        field3903 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBLlaa;I)V", line = 17)
    public static final void method1758(int arg0, byte arg1, class498 arg2, int arg3) {
        field3905++;
        if (!class263.field3850) {
            return;
        }
        int var4 = 0;
        if (arg1 > -6) {
            field3904 = 30;
        }
        for (class171 var5 = (class171) arg2.field6826.method1140(-115); var5 != null; var5 = (class171) arg2.field6826.method1138(110)) {
            int var10 = class140.method928(-1, var5);
            if (var10 > var4) {
                var4 = var10;
            }
        }
        var4 += 8;
        class78.field874 = (class474.field6578 ? 26 : 22) + arg2.field6833 * 16;
        int var6 = arg2.field6833 * 16 + 21;
        int var7 = class788.field10819 + class689.field9609;
        if (class742.field10226 < var4 + var7) {
            var7 = class689.field9609 - var4;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = class474.field6578 ? 33 : 31;
        int var9 = arg0 + 13 - var8;
        if (class249.field3700 < var6 + var9) {
            var9 = class249.field3700 - var6;
        }
        class49.field587 = var7;
        if (var9 < 0) {
            var9 = 0;
        }
        class79.field894 = var9;
        class339.field4914 = var4;
        class694.field9684 = arg2;
    }
}
