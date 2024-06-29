import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dka")
public abstract class class13 extends class645 {

    @OriginalMember(owner = "client!dka", name = "i", descriptor = "I")
    public static int field218 = 0;

    @OriginalMember(owner = "client!dka", name = "l", descriptor = "Lhj;")
    public static class596 field221 = new class596(30, 10);

    @OriginalMember(owner = "client!dka", name = "m", descriptor = "[C")
    public static char[] field222 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!dka", name = "j", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!dka", name = "k", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!dka", name = "n", descriptor = "Lkfa;")
    public static class629 field223;

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(Les;B)Lgw;", line = 13)
    public static final class183 method191(class403 arg0, byte arg1) {
        int var2 = 123 / ((21 - arg1) / 34);
        field220++;
        return new class183(arg0.method2365(true), arg0.method2365(true), arg0.method2365(true), arg0.method2365(true), arg0.method2358(116), arg0.method2358(115), arg0.method2396((byte) 114));
    }

    @OriginalMember(owner = "client!dka", name = "a", descriptor = "(III)I", line = 23)
    public static final int method192(int arg0, int arg1, int arg2) {
        if (arg2 >= -49) {
            return -116;
        }
        field219++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 << 13 ^ var3;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!dka", name = "c", descriptor = "(I)V", line = 47)
    public static void method193(int arg0) {
        field223 = null;
        field222 = null;
        if (arg0 != -23302) {
            field221 = null;
        }
        field221 = null;
    }

    @OriginalMember(owner = "client!dka", name = "b", descriptor = "(I)Lmia;")
    public abstract class69 method190(int arg0);
}
