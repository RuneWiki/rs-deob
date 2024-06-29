import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class247 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "Lcc;")
    private static class209 field4468 = class95.method669(85, " has logged in)3");

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Lcc;")
    public static class209 field4471 = field4468;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "I")
    public static int field4470;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field4473;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "Lsj;")
    public static class49 field4469;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Lsj;")
    public static class49 field4472;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "[[B")
    public static byte[][] field4475;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)Lma;")
    public static final class187 method1718(int arg0, int arg1, int arg2) {
        class109 var3 = class106.field2089[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2213;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(II)Lji;")
    public static final class42 method1719(int arg0, int arg1) {
        field4470++;
        if (arg1 != -8667) {
            return null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class50.field984[var2] == null || class50.field984[var2][var3] == null) {
            boolean var4 = class161.method1111((byte) 23, var2);
            if (!var4) {
                return null;
            }
        }
        return class50.field984[var2][var3];
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(JZ)V")
    public static final void method1720(long arg0, boolean arg1) {
        if (!arg1) {
            field4469 = null;
        }
        field4473++;
        try {
            Thread.sleep(arg0);
        } catch (InterruptedException var3) {
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V")
    public static void method1721(byte arg0) {
        field4471 = null;
        field4469 = null;
        field4468 = null;
        field4475 = null;
        field4472 = null;
        if (arg0 != 11) {
            field4468 = null;
        }
    }
}
