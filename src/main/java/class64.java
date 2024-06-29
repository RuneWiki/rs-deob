import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class64 extends class276 {

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "I")
    public static int field1078 = 0;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "[Loa;")
    public static class99[] field1082 = new class99[200];

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Loa;")
    public static class99 field1076 = class221.method1463(2844, "Textures charg-Bes");

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    public static int field1083 = 0;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "Z")
    public static boolean field1084 = true;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "Ljf;")
    public class64 field1075;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "Ljf;")
    public class64 field1081;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[[[I")
    public static int[][][] field1079;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)V")
    public final void method422(int arg0) {
        field1077++;
        if (this.field1075 == null) {
            return;
        }
        this.field1075.field1081 = this.field1081;
        this.field1081.field1075 = this.field1075;
        this.field1075 = null;
        this.field1081 = null;
        if (arg0 <= 118) {
            field1079 = null;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V")
    public static void method423(int arg0) {
        if (arg0 == 200) {
            field1082 = null;
            field1079 = null;
            field1076 = null;
        }
    }
}
