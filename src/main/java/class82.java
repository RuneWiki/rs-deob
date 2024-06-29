import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public abstract class class82 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lqe;")
    public static class168 field1241 = class66.method448("::qa_op_test", 33);

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field1240 = 0;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1242 = 0;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field1244 = 0;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "Lqe;")
    private static class168 field1247 = class66.method448("Loaded input handler", 124);

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "Lqe;")
    public static class168 field1245 = field1247;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field1243;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lrd;")
    public static class207 field1248;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V")
    public static void method543(byte arg0) {
        field1241 = null;
        field1245 = null;
        field1248 = null;
        if (arg0 == -83) {
            field1247 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BI)I")
    public static final int method544(byte arg0, int arg1) {
        field1246++;
        if (arg0 <= 61) {
            method545(null, (byte) -52);
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Laa;B)V")
    public static final void method545(class147 arg0, byte arg1) {
        field1243++;
        if (arg1 != 106) {
            method543((byte) -12);
        }
        class43.method287((byte) -6, 200000, arg0);
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Luc;")
    public static final class169 method546(int arg0, int arg1, int arg2) {
        class177 var3 = class254.field4395[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field3115; var4++) {
            class169 var5 = var3.field3090[var4];
            if ((var5.field2937 >> 29 & 0x3L) == 2L && var5.field2939 == arg1 && var5.field2923 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
