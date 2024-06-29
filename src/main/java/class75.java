import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class75 extends class149 {

    @OriginalMember(owner = "client!ib", name = "Y", descriptor = "Lsg;")
    public static class169 field1423 = class165.method1060("Fehler bei der Verbindung zum Server)3", 1536);

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Lsg;")
    private static class169 field1418 = class165.method1060("Sorry invited players only)3", 1536);

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field1415 = 0;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "Lsg;")
    public static class169 field1420 = field1418;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public int field1414;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    public int field1419;

    @OriginalMember(owner = "client!ib", name = "W", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public int field1422;

    @OriginalMember(owner = "client!ib", name = "Z", descriptor = "I")
    public static int field1424;

    @OriginalMember(owner = "client!ib", name = "ab", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "Lgb;")
    public static class58 field1416;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V")
    public static void method461(int arg0) {
        field1420 = null;
        field1418 = null;
        field1416 = null;
        field1423 = null;
        if (arg0 != 1) {
            field1418 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "(I)V")
    public static final void method462(int arg0) {
        class89.field1622 = new int[arg0];
        class27.field552 = new int[151];
        class195.field3819 = new int[33];
        class131.field2437 = new int[151];
        field1421++;
        for (int var1 = 0; var1 < 33; var1++) {
            int var6 = 999;
            int var7 = 0;
            for (int var8 = 0; var8 < 34; var8++) {
                if (class115.field2103.field1101[class115.field2103.field1105 * var1 + var8] == 0) {
                    if (var6 == 999) {
                        var6 = var8;
                    }
                } else if (var6 != 999) {
                    var7 = var8;
                    break;
                }
            }
            class89.field1622[var1] = var6;
            class195.field3819[var1] = var7 - var6;
        }
        for (int var2 = 5; var2 < 156; var2++) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; var5 < 172; var5++) {
                if (class115.field2103.field1101[class115.field2103.field1105 * var2 + var5] == 0 && (var5 > 34 || var2 > 34)) {
                    if (var3 == 999) {
                        var3 = var5;
                    }
                } else if (var3 != 999) {
                    var4 = var5;
                    break;
                }
            }
            class27.field552[var2 - 5] = var3 - 25;
            class131.field2437[var2 - 5] = var4 - var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILoa;I)V")
    private final void method463(int arg0, class127 arg1, int arg2) {
        field1425++;
        if (arg0 == 1) {
            this.field1414 = arg1.method785(true);
            this.field1419 = arg1.method819((byte) 22);
            this.field1422 = arg1.method819((byte) 22);
        }
        if (arg2 != -12612) {
            this.method463(112, null, -75);
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(BLoa;)V")
    public final void method464(byte arg0, class127 arg1) {
        while (true) {
            int var3 = arg1.method819((byte) 22);
            if (var3 == 0) {
                field1424++;
                if (arg0 >= -34) {
                    this.field1414 = -21;
                    return;
                }
                return;
            }
            this.method463(var3, arg1, -12612);
        }
    }
}
