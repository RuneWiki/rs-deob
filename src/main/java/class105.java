import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class105 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field1289 = -1;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lmq;")
    public static class78 field1288 = new class78(103, 7);

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "Lac;")
    public static class712 field1287;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[I")
    public static int[] field1290;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method724(int arg0) {
        field1290 = null;
        field1287 = null;
        if (arg0 == 255) {
            field1288 = null;
        }
    }
}
