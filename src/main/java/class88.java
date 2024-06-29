import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public abstract class class88 extends class561 {

    @OriginalMember(owner = "client!k", name = "p", descriptor = "[I")
    public static int[] field1169 = new int[2];

    @OriginalMember(owner = "client!k", name = "o", descriptor = "[[B")
    public static byte[][] field1168 = new byte[250][];

    @OriginalMember(owner = "client!k", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1171 = null;

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    public static int field1170;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(I)V")
    public static void method489(int arg0) {
        field1171 = null;
        field1168 = null;
        field1169 = null;
        if (arg0 != 96) {
            field1171 = null;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)I")
    public static final int method490(byte arg0, int arg1) {
        if (arg0 != 39) {
            return 100;
        }
        field1170++;
        if (arg1 < 96) {
            return 0;
        } else if (arg1 < 128) {
            return 2;
        } else {
            return 3;
        }
    }
}
