import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rga")
public class class71 extends class650 {

    @OriginalMember(owner = "client!rga", name = "o", descriptor = "Llea;")
    private class573 field1125;

    @OriginalMember(owner = "client!rga", name = "s", descriptor = "I")
    private int field1129;

    @OriginalMember(owner = "client!rga", name = "w", descriptor = "I")
    private int field1133;

    @OriginalMember(owner = "client!rga", name = "q", descriptor = "I")
    private int field1127;

    @OriginalMember(owner = "client!rga", name = "v", descriptor = "I")
    private int field1132;

    @OriginalMember(owner = "client!rga", name = "u", descriptor = "I")
    private int field1131;

    @OriginalMember(owner = "client!rga", name = "p", descriptor = "I")
    private int field1126;

    @OriginalMember(owner = "client!rga", name = "t", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!rga", name = "n", descriptor = "Lda;")
    public static class443 field1124;

    @OriginalMember(owner = "client!rga", name = "r", descriptor = "Loh;")
    private class653 field1128;

    @OriginalMember(owner = "client!rga", name = "b", descriptor = "(I)Loh;", line = 5)
    public final class653 method677(int arg0) {
        field1130++;
        if (this.field1128 == null) {
            class407.field5605[3] = this.field1126;
            class103 var2 = this.field1125.field6447;
            class407.field5605[1] = this.field1127;
            class407.field5605[2] = this.field1131;
            class407.field5605[0] = this.field1129;
            class407.field5605[4] = this.field1132;
            class407.field5605[5] = this.field1133;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method846(class407.field5605[var5], true)) {
                    return null;
                }
                class719 var7 = var2.method847(class407.field5605[var5], -110);
                int var8 = var7.field10044 ? 64 : 128;
                if (var7.field10034 > 0) {
                    var3 = true;
                }
                if (var4 < var8) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class573.field8090[var6] = var2.method844(false, (byte) 111, 1.0F, var4, class407.field5605[var6], var4);
            }
            this.field1128 = new class653(this.field1125, 6407, var4, var3, class573.field8090);
        }
        if (arg0 != 0) {
            field1124 = null;
        }
        return this.field1128;
    }

    @OriginalMember(owner = "client!rga", name = "c", descriptor = "(I)V", line = 67)
    public static void method678(int arg0) {
        field1124 = null;
        if (arg0 != -21555) {
            method678(86);
        }
    }

    @OriginalMember(owner = "client!rga", name = "<init>", descriptor = "(Llea;IIIIII)V", line = 85)
    public class71(class573 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1125 = arg0;
        this.field1129 = arg1;
        this.field1133 = arg6;
        this.field1127 = arg2;
        this.field1132 = arg5;
        this.field1131 = arg3;
        this.field1126 = arg4;
    }
}
