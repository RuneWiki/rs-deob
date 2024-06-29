import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class67 extends class205 {

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public static int field1044 = 0;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "Loe;")
    public static class79 field1038 = new class79(32);

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "Lha;")
    public static class26 field1046 = new class26();

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "[I")
    public static int[] field1047 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "I")
    public static int field1039;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "I")
    public int field1041;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "Lrh;")
    public static class110 field1048;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "Lhi;")
    public class82 field1040;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Lhi;")
    public class82 field1043;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "[S")
    public static short[] field1045;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V", line = 6)
    public static void method423(boolean arg0) {
        field1038 = null;
        field1048 = null;
        field1045 = null;
        field1046 = null;
        field1047 = null;
        if (arg0) {
            field1044 = -15;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIILrm;JLrm;Lrm;)V", line = 26)
    public static final void method424(int arg0, int arg1, int arg2, int arg3, class175 arg4, long arg5, class175 arg6, class175 arg7) {
        class72 var9 = new class72();
        var9.field1105 = arg4;
        var9.field1102 = arg1 * 128 + 64;
        var9.field1101 = arg2 * 128 + 64;
        var9.field1110 = arg3;
        var9.field1107 = arg5;
        var9.field1104 = arg6;
        var9.field1100 = arg7;
        int var10 = 0;
        class16 var11 = class15.field120[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field165; var12++) {
                class69 var13 = var11.field158[var12];
                if ((var13.field1064 & 0x400000L) == 4194304L) {
                    int var14 = var13.field1075.method238();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field1099 = -var10;
        if (class15.field120[arg0][arg1][arg2] == null) {
            class15.field120[arg0][arg1][arg2] = new class16(arg0, arg1, arg2);
        }
        class15.field120[arg0][arg1][arg2].field164 = var9;
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(I)Lad;", line = 73)
    public final class180 method425(int arg0) {
        int var2 = 88 % ((arg0 - 23) / 50);
        field1039++;
        return class311.field5311[this.field3596];
    }
}
