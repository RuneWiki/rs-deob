import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class554 {

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public int field8137 = 0;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public int field8136 = 0;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public int field8141 = 2048;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public int field8134 = 2048;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "[I")
    public static int[] field8138 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field8135;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field8139;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field8142;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Lmv;")
    public static class295 field8140;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 4)
    public static void method3222(byte arg0) {
        if (arg0 >= -43) {
            method3225(96, 3, null, 111);
        }
        field8138 = null;
        field8140 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lgk;B)V", line = 16)
    public final void method3223(class540 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method3115(29871);
            if (var3 == 0) {
                if (arg1 != 30) {
                    return;
                }
                field8135++;
                return;
            }
            this.method3224(-107, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILgk;I)V", line = 36)
    private final void method3224(int arg0, class540 arg1, int arg2) {
        int var4 = 53 / ((-arg0 - 35) / 32);
        if (arg2 == 1) {
            this.field8137 = arg1.method3115(29871);
        } else if (arg2 == 2) {
            this.field8141 = arg1.method3169(26488);
        } else if (arg2 == 3) {
            this.field8134 = arg1.method3169(26488);
        } else if (arg2 == 4) {
            this.field8136 = arg1.method3129(103);
        }
        field8142++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(II[BI)Ljava/lang/String;", line = 69)
    public static final String method3225(int arg0, int arg1, byte[] arg2, int arg3) {
        field8139++;
        char[] var4 = new char[arg3];
        int var5 = -65 % (-arg0 / 55);
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; var7++) {
            int var8 = arg2[arg1 + var7] & 0xFF;
            if (var8 != 0) {
                if (var8 >= 128 && var8 < 160) {
                    char var9 = class330.field4795[var8 - 128];
                    if (var9 == '\u0000') {
                        var9 = '?';
                    }
                    var8 = var9;
                }
                var4[var6++] = (char) var8;
            }
        }
        return new String(var4, 0, var6);
    }
}
