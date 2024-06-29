import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class31 {

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
    public static int[] field379 = new int[2];

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field380 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[[[B")
    public static byte[][][] field378;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method162(int arg0) {
        field379 = null;
        field378 = null;
        if (arg0 <= 114) {
            field378 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
    public static final void method163(int arg0) {
        field377++;
        if (arg0 != -11565) {
            field379 = null;
        }
        if (class195.field3078 != null) {
            class195.field3078.method1534((byte) -93);
        }
        if (class1.field27 != null) {
            class1.field27.method1534((byte) -97);
        }
    }
}
