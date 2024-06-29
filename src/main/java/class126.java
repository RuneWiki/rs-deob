import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class126 extends class259 {

    @OriginalMember(owner = "client!sb", name = "E", descriptor = "[Lro;")
    public static class111[] field1783 = new class111[14];

    @OriginalMember(owner = "client!sb", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1790 = "Loaded config";

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "I")
    public int field1779;

    @OriginalMember(owner = "client!sb", name = "C", descriptor = "I")
    public int field1781;

    @OriginalMember(owner = "client!sb", name = "F", descriptor = "I")
    public int field1784;

    @OriginalMember(owner = "client!sb", name = "H", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!sb", name = "L", descriptor = "I")
    public int field1789;

    @OriginalMember(owner = "client!sb", name = "N", descriptor = "I")
    public int field1791;

    @OriginalMember(owner = "client!sb", name = "D", descriptor = "Ljava/lang/String;")
    public String field1782;

    @OriginalMember(owner = "client!sb", name = "G", descriptor = "[I")
    public int[] field1785;

    @OriginalMember(owner = "client!sb", name = "J", descriptor = "[I")
    public int[] field1788;

    @OriginalMember(owner = "client!sb", name = "A", descriptor = "[Lqb;")
    public class117[] field1780;

    @OriginalMember(owner = "client!sb", name = "I", descriptor = "[Ljava/lang/String;")
    public String[] field1787;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III)Lsg;", line = 7)
    public static final class44 method858(int arg0, int arg1, int arg2) {
        class196 var3 = class194.field2947[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field2979; var4++) {
            class44 var5 = var3.field2998[var4];
            if ((var5.field502 >> 29 & 0x3L) == 2L && var5.field504 == arg1 && var5.field497 == arg2) {
                class156.method1139(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", line = 32)
    public static final void method859(String arg0, String arg1, int arg2, int arg3, String arg4) {
        field1786++;
        class277.method1979(arg3, arg4, arg1, (byte) -47, arg2, arg0);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 42)
    public static void method860(boolean arg0) {
        field1790 = null;
        if (arg0) {
            field1783 = (class111[]) null;
        }
        field1783 = null;
    }
}
