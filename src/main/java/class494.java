import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class494 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
    public static boolean field7150 = false;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "Lfe;")
    public static class636 field7151 = new class636("RC", 1);

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public static int field7161 = 0;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
    public static int[] field7162 = new int[128];

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "Laia;")
    public static class257 field7163;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field7156;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field7158;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field7160;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "J")
    public static long field7157;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "Lfa;")
    public static class564 field7152;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "Lcl;")
    public static class746 field7153;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[[S")
    public static short[][] field7155;

    static {
        for (int var0 = 0; var0 < field7162.length; var0++) {
            field7162[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field7162[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field7162[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field7162[var3] = var3 + 52 - 48;
        }
        field7162[45] = field7162[47] = 63;
        field7162[42] = field7162[43] = 62;
        field7163 = new class257("WTI", "office", "_wti", 5);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 8)
    public static final void method3001(int arg0) {
        if (arg0 != 21332) {
            method3004(true);
        }
        field7159++;
        class472.field6857 = 0;
        for (int var1 = 0; var1 < 2048; var1++) {
            class85.field1255[var1] = null;
            class397.field5909[var1] = 1;
            class457.field6636[var1] = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "(I)Z", line = 40)
    public static final boolean method3002(int arg0) {
        field7156++;
        class49 var1 = (class49) class93.field1396.method3463((byte) -50);
        if (var1 == null) {
            return false;
        }
        int var2 = 0;
        if (arg0 != 45) {
            return false;
        }
        while (var1.field809 > var2) {
            if (var1.field801[var2] != null && var1.field801[var2].field2512 == 0) {
                return false;
            }
            if (var1.field804[var2] != null && var1.field804[var2].field2512 == 0) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V", line = 80)
    public static void method3003(byte arg0) {
        field7155 = null;
        if (arg0 <= 125) {
            field7151 = null;
        }
        field7163 = null;
        field7162 = null;
        field7152 = null;
        field7153 = null;
        field7151 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V", line = 95)
    public static final void method3004(boolean arg0) {
        field7158++;
        if (arg0) {
            class519.field7510 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(JZILla;IIII)V", line = 116)
    public static final void method3005(long arg0, boolean arg1, int arg2, class422 arg3, int arg4, int arg5, int arg6, int arg7) {
        class442.field6421 = 1;
        class577.field8182 = arg4;
        field7160++;
        class140.field2198 = arg3;
        class741.field10390 = arg0;
        class540.field7712 = arg6;
        class371.field5634 = arg1;
        class259.field4052 = null;
        class560.field7944 = arg7;
        class416.field6104 = arg2;
        class730.field10244 = 10000;
        if (arg5 >= -70) {
            method3001(54);
        }
    }
}
