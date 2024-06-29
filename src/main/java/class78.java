import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class78 {

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "I")
    public int field1170;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "[I")
    public int[] field1167;

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[I")
    public int[] field1168;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field1171 = -60;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field1172 = 1408;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[[[S")
    public static short[][][] field1169;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 5)
    public static void method699(int arg0) {
        if (arg0 < 100) {
            method699(73);
        }
        field1169 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(I)V", line = 23)
    public class78(int arg0) {
        this.field1170 = arg0;
        this.field1167 = new int[this.field1170];
        this.field1168 = new int[this.field1170];
    }
}
