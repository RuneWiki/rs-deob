import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class115 {

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
    public static int[] field1342 = new int[128];

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "F")
    public static float field1340;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[[I")
    public static int[][] field1339;

    static {
        for (int var0 = 0; var0 < field1342.length; var0++) {
            field1342[var0] = -1;
        }
        for (int var1 = 65; var1 <= 90; var1++) {
            field1342[var1] = var1 - 65;
        }
        for (int var2 = 97; var2 <= 122; var2++) {
            field1342[var2] = var2 + 26 - 97;
        }
        for (int var3 = 48; var3 <= 57; var3++) {
            field1342[var3] = var3 + 52 - 48;
        }
        field1342[45] = field1342[47] = 63;
        field1342[42] = field1342[43] = 62;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V", line = 4)
    public static void method703(int arg0) {
        if (arg0 != 24793) {
            field1340 = -0.19151899F;
        }
        field1342 = null;
        field1339 = null;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V", line = 17)
    public static final void method704(int arg0) {
        int var1 = -22 / ((arg0 + 68) / 42);
        class55.method271(-26890);
        field1341++;
        class466.method2647(2, 22050, 8, class601.field8530.field2840);
        class32.field358 = class335.method1892(class220.field2664, true, class623.field8837, 0, 22050);
        class32.field358.method717(class485.field7071, 16128);
        class600.field8522 = class335.method1892(class220.field2664, true, class623.field8837, 1, 2048);
        class600.field8522.method717(class424.field5641, 16128);
    }
}
