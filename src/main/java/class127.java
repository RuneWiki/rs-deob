import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class127 {

    @OriginalMember(owner = "client!f", name = "e", descriptor = "Ljava/lang/String;")
    public String field1749;

    @OriginalMember(owner = "client!f", name = "f", descriptor = "Ljava/lang/String;")
    public String field1750;

    @OriginalMember(owner = "client!f", name = "c", descriptor = "Ljava/lang/String;")
    public String field1747;

    @OriginalMember(owner = "client!f", name = "d", descriptor = "I")
    public static int field1748 = 0;

    @OriginalMember(owner = "client!f", name = "g", descriptor = "[I")
    public static int[] field1751 = new int[32];

    @OriginalMember(owner = "client!f", name = "a", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!f", name = "b", descriptor = "I")
    public static int field1746;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)V")
    public static void method818(int arg0) {
        if (arg0 != 2) {
            method819(-62, true, null);
        }
        field1751 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZLta;)Z")
    public static final boolean method819(int arg0, boolean arg1, class27 arg2) {
        class101.field1451.method861(arg2.field357[arg0], arg2.field358[arg0], arg2.field352[arg0], class712.field10058);
        field1746++;
        int var3 = class712.field10058[2];
        if (var3 < 50) {
            return false;
        } else {
            arg2.field346[arg0] = (short) (class712.field10058[0] * class748.field10408 / var3 + class732.field10235);
            arg2.field353[arg0] = (short) (class712.field10058[1] * class624.field8905 / var3 + class323.field4158);
            arg2.field354[arg0] = (short) var3;
            return arg1 ? true : true;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
    public class127(String arg0, String arg1, String arg2) {
        this.field1749 = arg2;
        this.field1750 = arg0;
        this.field1747 = arg1;
    }
}
