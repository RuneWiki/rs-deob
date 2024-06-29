import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class32 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "[Z")
    public static boolean[] field495 = new boolean[5];

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field496;

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(II)V", line = 4)
    public static final void method339(int arg0, int arg1) {
        field494++;
        class294.field4576.method649((byte) 75, arg0);
        if (arg1 < -17) {
            class211.field3246.method649((byte) 75, arg0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IB)V", line = 25)
    public static final void method340(int arg0, byte arg1) {
        if (arg1 < 63) {
            field495 = (boolean[]) null;
        }
        field496++;
        class43.field689.method649((byte) 75, arg0);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V", line = 40)
    public static void method341(boolean arg0) {
        field495 = null;
        if (arg0) {
            method342(16, (String) null, false);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 52)
    public static final void method342(int arg0, String arg1, boolean arg2) {
        field497++;
        if (arg1 == null) {
            return;
        }
        if (class143.field2347 >= 100) {
            class101.method882(arg0 - 1, class271.field4190);
            return;
        }
        String var3 = class249.method1859(0, arg1);
        if (var3 == null) {
            return;
        }
        for (int var4 = arg0; var4 < class143.field2347; var4++) {
            String var5 = class249.method1859(0, class168.field2669[var4]);
            if (var5 != null && var5.equals(var3)) {
                class101.method882(-1, arg1 + class186.field2930);
                return;
            }
            if (class253.field3905[var4] != null) {
                String var6 = class249.method1859(0, class253.field3905[var4]);
                if (var6 != null && var6.equals(var3)) {
                    class101.method882(~arg0, arg1 + class186.field2930);
                    return;
                }
            }
        }
        for (int var7 = 0; var7 < class131.field2215; var7++) {
            String var8 = class249.method1859(0, class83.field1197[var7]);
            if (var8 != null && var8.equals(var3)) {
                class101.method882(-1, class58.field906 + arg1 + class335.field5125);
                return;
            }
            if (class173.field2751[var7] != null) {
                String var9 = class249.method1859(arg0, class173.field2751[var7]);
                if (var9 != null && var9.equals(var3)) {
                    class101.method882(-1, class58.field906 + arg1 + class335.field5125);
                    return;
                }
            }
        }
        if (class249.method1859(0, class173.field2746.field2706).equals(var3)) {
            class101.method882(-1, class222.field3455);
            return;
        }
        class99.field1491.method1628((byte) -92, 177);
        class99.field1491.method273(arg0 ^ 0x0, class34.method354(arg1, (byte) 51) + 1);
        class99.field1491.method280(-18345, arg1);
        class99.field1491.method273(arg0, arg2 ? 1 : 0);
        class57.field883++;
    }
}
