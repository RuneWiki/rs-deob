import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class45 {

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lsg;")
    public static class30 field1054 = class167.method1221((byte) 33, "scrollbar");

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "Lsg;")
    public static class30 field1055 = class167.method1221((byte) 33, "loginscreen");

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "[I")
    public static int[] field1058 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Z")
    public static boolean field1059 = false;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field1060 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field1053;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field1056;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field1057;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)V")
    public static final void method458(int arg0, int arg1) {
        field1053++;
        if (class121.field2388 == null || class121.field2388.length < arg0) {
            class121.field2388 = new int[arg0];
        }
        if (arg1 != 137) {
            field1055 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Z)V")
    public static void method459(boolean arg0) {
        field1054 = null;
        field1058 = null;
        if (!arg0) {
            field1055 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(BLbi;)V")
    public static final void method460(byte arg0, class66 arg1) {
        field1056++;
        int var2 = -51 % ((30 - arg0) / 58);
        class171 var3 = null;
        try {
            class27 var4 = arg1.method601("runescape", -72);
            while (var4.field493 == 0) {
                class160.method1191(1L, 0);
            }
            if (var4.field493 == 1) {
                var3 = (class171) var4.field492;
                class8 var5 = class97.method795(5);
                var3.method1262(var5.field124, (byte) 117, 0, var5.field146);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method1258(4222);
            }
        } catch (Exception var6) {
        }
    }
}
