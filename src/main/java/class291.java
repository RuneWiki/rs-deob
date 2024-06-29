import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wr")
public class class291 {

    @OriginalMember(owner = "client!wr", name = "e", descriptor = "I")
    public static int field3910 = 0;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!wr", name = "b", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!wr", name = "c", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!wr", name = "f", descriptor = "Lr;")
    public static class110 field3911;

    @OriginalMember(owner = "client!wr", name = "d", descriptor = "Lml;")
    public static class241 field3909;

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(B)V")
    public static void method1635(byte arg0) {
        field3911 = null;
        if (arg0 != -1) {
            method1635((byte) 58);
        }
        field3909 = null;
    }

    @OriginalMember(owner = "client!wr", name = "a", descriptor = "(IIB)V")
    public static final void method1636(int arg0, int arg1, byte arg2) {
        field3908++;
        if (class492.method2867(arg0, (byte) 87)) {
            class456.method2685(arg1, class146.field2099[arg0], -15343);
            if (arg2 != 78) {
                method1635((byte) 20);
            }
        }
    }
}
