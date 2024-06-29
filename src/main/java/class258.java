import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class258 {

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "Lmb;")
    private static class96 field4474 = class243.method1708("Examine", (byte) 124);

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lmb;")
    public static class96 field4473 = field4474;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "Luc;")
    public static class11 field4470 = new class11(50);

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[I")
    public static int[] field4476 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field4475 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "I")
    public int field4471;

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Lmb;")
    public class96 field4472;

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(B)V")
    public static void method1787(byte arg0) {
        field4476 = null;
        field4474 = null;
        field4473 = null;
        field4470 = null;
        if (arg0 != -90) {
            field4475 = -120;
        }
    }
}
