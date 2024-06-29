import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class62 {

    @OriginalMember(owner = "client!je", name = "g", descriptor = "I")
    public static int field996 = 0;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "I")
    public static int field994 = 0;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field1000 = 127;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field1003 = new String[100];

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    public int field1002;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public int field991;

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field995;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    public int field999;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "J")
    public long field993;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Ltk;")
    public class219 field1004;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "Ltk;")
    public class219 field1005;

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Ltk;")
    public class219 field998;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lve;B)I")
    public static final int method436(class233 arg0, byte arg1) {
        field992++;
        int var2 = 0;
        if (arg1 != 34) {
            method436((class233) null, (byte) 19);
        }
        if (arg0.method1509(false, class171.field2455)) {
            var2++;
        }
        if (arg0.method1509(false, class266.field4012)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static void method437(int arg0) {
        if (arg0 != -3369) {
            field996 = -5;
        }
        field1003 = null;
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)V")
    public static final void method438(int arg0) {
        field1001++;
        for (class30 var1 = (class30) class74.field1146.method656(116); var1 != null; var1 = (class30) class74.field1146.method650(arg0 + 126)) {
            if (var1.field435) {
                var1.method215((byte) -92);
            }
        }
        if (arg0 != 0) {
            method437(-15);
        }
        for (class30 var2 = (class30) class210.field3019.method656(arg0 + 93); var2 != null; var2 = (class30) class210.field3019.method650(125)) {
            if (var2.field435) {
                var2.method215((byte) -86);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(I)V")
    public static final void method439(int arg0) {
        field990++;
        class168.field2428 = new class190(arg0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(CLjava/lang/StringBuffer;II)Ljava/lang/StringBuffer;")
    public static final StringBuffer method440(char arg0, StringBuffer arg1, int arg2, int arg3) {
        field995++;
        int var4 = 78 / ((-arg3 - 51) / 42);
        int var5 = arg1.length();
        arg1.setLength(arg2);
        for (int var6 = var5; var6 < arg2; var6++) {
            arg1.setCharAt(var6, arg0);
        }
        return arg1;
    }
}
