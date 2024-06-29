import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class78 extends class44 {

    @OriginalMember(owner = "client!id", name = "q", descriptor = "Z")
    public boolean field1404 = false;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "Lkb;")
    public static class93 field1400 = class76.method390("auf der Hautpseite)3", 0);

    @OriginalMember(owner = "client!id", name = "r", descriptor = "Lkb;")
    public static class93 field1405 = class76.method390("(U5", 0);

    @OriginalMember(owner = "client!id", name = "n", descriptor = "I")
    public int field1401;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public int field1406;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public static void method396(int arg0) {
        field1405 = null;
        if (arg0 != 10) {
            field1400 = null;
        }
        field1400 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BIZ)Lkb;")
    public static final class93 method397(byte arg0, int arg1, boolean arg2) {
        field1403++;
        if (arg0 >= -84) {
            method396(2);
        }
        return class84.method425(10, -92, arg2, arg1);
    }
}
