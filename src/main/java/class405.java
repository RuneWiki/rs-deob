import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class405 {

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "[I")
    public static int[] field5349 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public int field5346;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public int field5347;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public int field5348;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public int field5350;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public int field5351;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public int field5352;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method2308(int arg0) {
        if (arg0 != 32) {
            field5349 = null;
        }
        field5349 = null;
    }
}
