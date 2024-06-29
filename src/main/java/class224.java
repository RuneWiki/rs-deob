import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class224 {

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field3699 = new String[200];

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "Z")
    public static boolean field3700 = false;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
    public static boolean field3696 = true;

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Lg;", line = 7)
    public static final class181 method1564(int arg0, int arg1) {
        field3697++;
        int var2 = arg1 >> 16;
        if (arg0 > -90) {
            field3696 = true;
        }
        int var3 = arg1 & 0xFFFF;
        if (class178.field2938[var2] == null || class178.field2938[var2][var3] == null) {
            boolean var4 = class267.method1874(var2, (byte) 12);
            if (!var4) {
                return null;
            }
        }
        return class178.field2938[var2][var3];
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V", line = 35)
    public static void method1565(byte arg0) {
        if (arg0 > -45) {
            method1565((byte) -18);
        }
        field3699 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILcb;)V", line = 46)
    public static final void method1566(int arg0, class314 arg1) {
        if (arg0 != 128) {
            field3701 = 31;
        }
        field3698++;
        for (class302 var2 = (class302) class46.field931.method431(0); var2 != null; var2 = (class302) class46.field931.method439(arg0 - 28640)) {
            if (var2.field4913 == arg1) {
                if (var2.field4921 != null) {
                    class56.field1105.method1247(var2.field4921);
                    var2.field4921 = null;
                }
                var2.method535(-2801);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIILml;JZ)V", line = 88)
    public static final void method1567(int arg0, int arg1, int arg2, int arg3, class152 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class94 var8 = new class94();
        var8.field1653 = arg4;
        var8.field1654 = arg1 * 128 + 64;
        var8.field1649 = arg2 * 128 + 64;
        var8.field1655 = arg3;
        var8.field1652 = arg5;
        var8.field1648 = arg6;
        if (class353.field5644[arg0][arg1][arg2] == null) {
            class353.field5644[arg0][arg1][arg2] = new class312(arg0, arg1, arg2);
        }
        class353.field5644[arg0][arg1][arg2].field5092 = var8;
    }
}
