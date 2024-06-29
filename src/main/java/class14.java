import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class14 extends class84 {

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "Lmh;")
    public static class62 field112 = class201.method1405(true, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public static int field111 = 0;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "Lmh;")
    public static class62 field114 = class201.method1405(true, "Fps:");

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "Lmh;")
    public static class62 field117 = class201.method1405(true, "Lade Wordpack )2 ");

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "Lhi;")
    public static class26 field115;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "[[[B")
    public static byte[][][] field118;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 5)
    public static final void method52(int arg0) {
        field113++;
        if (arg0 != -29976) {
            field115 = (class26) null;
        }
        for (class148 var1 = (class148) class68.field1053.method334(arg0 + 11303); var1 != null; var1 = (class148) class68.field1053.method335((byte) 85)) {
            if (var1.field2336 > 0) {
                var1.field2336--;
            }
            if (var1.field2336 != 0) {
                if (var1.field2339 > 0) {
                    var1.field2339--;
                }
                if (var1.field2339 == 0 && var1.field2341 >= 1 && var1.field2342 >= 1 && var1.field2341 <= 102 && var1.field2342 <= 102 && (var1.field2331 < 0 || class186.method1304(var1.field2338, arg0 + 29861, var1.field2331))) {
                    class274.method1872(var1.field2330, var1.field2344, var1.field2337, var1.field2338, var1.field2341, var1.field2331, arg0 + 29873, var1.field2342);
                    var1.field2339 = -1;
                    if (var1.field2332 == var1.field2331 && var1.field2332 == -1) {
                        var1.method1444((byte) 89);
                    } else if (var1.field2332 == var1.field2331 && var1.field2346 == var1.field2337 && var1.field2340 == var1.field2338) {
                        var1.method1444((byte) 89);
                    }
                }
            } else if (var1.field2332 < 0 || class186.method1304(var1.field2340, -118, var1.field2332)) {
                class274.method1872(var1.field2330, var1.field2344, var1.field2346, var1.field2340, var1.field2341, var1.field2332, -103, var1.field2342);
                var1.method1444((byte) 89);
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(II)V", line = 82)
    public static final void method53(int arg0, int arg1) {
        class282.field4813 = arg1;
        if (arg0 > 54) {
            field116++;
            class90.field1422 = -1;
            class90.field1422 = -1;
            class225.method1595((byte) 100);
        }
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 124)
    public static void method54(int arg0) {
        field114 = null;
        field117 = null;
        field118 = (byte[][][]) null;
        field112 = null;
        if (arg0 == 25690) {
            field115 = null;
        }
    }
}
