import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class599 {

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public int field8406 = 0;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public int field8410 = 0;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public int field8409 = 2048;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public int field8412 = 2048;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "[Z")
    public static boolean[] field8411 = new boolean[200];

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V")
    public static void method3289(byte arg0) {
        if (arg0 != 89) {
            field8411 = null;
        }
        field8411 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Les;IB)V")
    private final void method3290(class630 arg0, int arg1, byte arg2) {
        if (arg2 != 77) {
            return;
        }
        if (arg1 == 1) {
            this.field8406 = arg0.method3501(-9268);
        } else if (arg1 == 2) {
            this.field8409 = arg0.method3470(13111);
        } else if (arg1 == 3) {
            this.field8412 = arg0.method3470(13111);
        } else if (arg1 == 4) {
            this.field8410 = arg0.method3510(arg2 - 46);
        }
        field8413++;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Les;I)V")
    public final void method3291(class630 arg0, int arg1) {
        if (arg1 != -16042) {
            return;
        }
        field8407++;
        while (true) {
            int var3 = arg0.method3501(arg1 + 6774);
            if (var3 == 0) {
                return;
            }
            this.method3290(arg0, var3, (byte) 77);
        }
    }
}
