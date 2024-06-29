import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class140 extends class504 {

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "Lqw;")
    public static class71 field2257 = new class71(10, 4);

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "[I")
    public static int[] field2258 = new int[64];

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "I")
    public int field2253;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field2254;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public int field2256;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BII)Z", line = 4)
    public static final boolean method1023(byte arg0, int arg1, int arg2) {
        if (arg0 == 11) {
            field2255++;
            return (arg2 & 0x70000) != 0 | class65.method523(arg1, arg2, (byte) -112) || class74.method563(arg2, (byte) 126, arg1);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V", line = 22)
    public static void method1024(int arg0) {
        field2258 = null;
        field2257 = null;
        if (arg0 < 41) {
            field2254 = -67;
        }
    }
}
