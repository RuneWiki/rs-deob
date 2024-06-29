import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class365 {

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "[I")
    public static int[] field5416 = new int[8];

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "[I")
    public static int[] field5415 = new int[3];

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field5419 = 0;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field5414;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public static int field5417;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)I")
    public static final int method2314(byte arg0, int arg1) {
        field5417++;
        if (arg0 != -26) {
            field5418 = 33;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V")
    public static void method2315(int arg0) {
        field5415 = null;
        field5416 = null;
        if (arg0 != 676454600) {
            method2314((byte) -53, -73);
        }
    }
}
