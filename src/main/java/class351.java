import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class351 {

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "[Lqi;")
    public static class514[] field4490 = new class514[2048];

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "Lsq;")
    public static class486 field4488 = new class486();

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "[I")
    public static int[] field4492 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public int field4486;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "I")
    public int field4487;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "I")
    public int field4489;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public int field4491;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "Lpl;")
    public static class612 field4485;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V", line = 4)
    public static void method1932(byte arg0) {
        field4490 = null;
        if (arg0 < 104) {
            method1932((byte) -75);
        }
        field4485 = null;
        field4488 = null;
        field4492 = null;
    }
}
