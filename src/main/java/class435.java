import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class435 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "Lpn;")
    public static class72 field6263 = new class72(81, -1);

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "[I")
    public static int[] field6265 = new int[13];

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "Lsd;")
    public static class74 field6266 = new class74(65, 0);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 7)
    public static void method2592(byte arg0) {
        field6265 = null;
        if (arg0 != 6) {
            method2592((byte) 12);
        }
        field6263 = null;
        field6266 = null;
    }
}
