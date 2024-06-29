import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class218 {

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "Lmb;")
    public static class96 field3730 = class243.method1708("<col=ff0000>", (byte) 105);

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lmb;")
    public static class96 field3735 = class243.method1708(":", (byte) 122);

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "Lmb;")
    public static class96 field3736 = class243.method1708("Ausw-=hlen", (byte) 96);

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "Lmb;")
    public static class96 field3737 = class243.method1708("compass", (byte) 91);

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "Lmb;")
    public static class96 field3733 = class243.method1708("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", (byte) 94);

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Lmb;")
    public static class96 field3740 = class243.method1708("details", (byte) 92);

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public int field3731;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public int field3734;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public int field3738;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "Lff;")
    public static class3 field3732;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lrg;I)V")
    public final void method1502(class239 arg0, int arg1) {
        if (arg1 != -1) {
            return;
        }
        while (true) {
            int var3 = arg0.method1651(4139);
            if (var3 == 0) {
                field3729++;
                return;
            }
            this.method1503(arg1 ^ 0xFFFFBD9F, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILrg;I)V")
    private final void method1503(int arg0, class239 arg1, int arg2) {
        if (arg2 == 1) {
            this.field3734 = arg1.method1663((byte) -115);
            this.field3731 = arg1.method1651(4139);
            this.field3738 = arg1.method1651(4139);
        }
        field3739++;
        if (arg0 != 16992) {
            this.field3731 = -105;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)V")
    public static void method1504(byte arg0) {
        if (arg0 > -56) {
            return;
        }
        field3730 = null;
        field3733 = null;
        field3735 = null;
        field3736 = null;
        field3732 = null;
        field3737 = null;
        field3740 = null;
    }
}
