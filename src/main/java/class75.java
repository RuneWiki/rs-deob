import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class75 implements class231 {

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "Ljava/lang/String;")
    private String field1188;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "[I")
    public static int[] field1186 = new int[4096];

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "Ljv;")
    public static class73 field1192;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Z")
    private boolean field1191;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1186[var0] = class277.method1677(var0, false);
        }
        field1192 = new class73("", 13);
        field1194 = 1;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)Liaa;", line = 17)
    public final class462 method590(byte arg0) {
        field1187++;
        int var2 = -74 % ((6 - arg0) / 57);
        return class462.field6255;
    }

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "(B)Z", line = 28)
    public final boolean method591(byte arg0) {
        field1189++;
        return arg0 == -38 ? this.field1191 : true;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(I)I", line = 39)
    public final int method592(int arg0) {
        if (arg0 != -11428) {
            this.method591((byte) 21);
        }
        field1190++;
        int var2 = class261.method1596(this.field1188, -1);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field1191 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "(B)V", line = 58)
    public static void method593(byte arg0) {
        field1186 = null;
        if (arg0 <= 9) {
            method594((byte) -73);
        }
        field1192 = null;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 73)
    public class75(String arg0) {
        this.field1188 = arg0;
    }

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "(B)V", line = 82)
    public static final void method594(byte arg0) {
        field1193++;
        class138.field2239 = -1;
        class265.field3677 = null;
        int var1 = 33 % ((arg0 - 34) / 50);
    }
}
